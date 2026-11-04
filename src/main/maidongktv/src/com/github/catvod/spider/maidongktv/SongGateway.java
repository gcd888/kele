package com.github.catvod.spider.maidongktv;

import android.util.Log;

import org.json.JSONObject;

import java.net.URI;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 麦动K歌第三方取流网关（自 maidong-ktv SongUrlResolver.kt / ktv_api.js 协议移植）。
 *
 * 协议两步握手：
 *   1) GET {host}/i.php?appid&mac&sn&time&ver&vn&sign=md5(params+APP_KEY)  → token
 *   2) GET {host}/music/do.php?appid&device&ish265&ls&musicno&resolution&sn&time&token&sign=md5(params+SDK_KEY)
 *      → {"code":200,"data":"http://download.origjoy.com/E/ts/.../{musicno}.ts?sign=..."}
 *
 * 风控三铁律（源站行为，必须遵守）：
 *   a) 必须走 CleanHttp 裸 Socket（仅 Host+Accept），带 UA 即 403；
 *   b) 陌生出口 IP 有约 10 分钟试用窗，403「检测到异常行为」= 换公网 IP，与 token 无关；
 *   c) token 恒定不变：失败时同 token 短退避重试，不清 token 重取 i.php（不放大请求量）。
 *
 * 多源动态排序：解析成功的源置顶、失败的沉底（与 maidong 原版 hostOrder 行为一致）。
 */
public final class SongGateway {

    private static final String TAG = "maidongktv";

    // 与 maidong-ktv assets/mobile/ktv_api.js CONFIG 一致的公开凭证。
    private static final String APP_ID = "d4eeacc6cec3434fbc8c41608a3056a0";
    private static final String APP_KEY = "024210cba40d4385a93e6c2d3249bfb5";
    private static final String SDK_KEY = "19042303a8374f67ae3fe1e25c97936f";
    private static final String VER = "2.0";
    private static final String VN = "4.1.3.03281430";
    private static final int TIMEOUT_MS = 8000;

    /** 歌曲源列表（ maidong SongUrlResolver.DEFAULT_HOSTS + ktv_api.js 在用的 zk.ktv1.top:6677）。 */
    private static final String[] DEFAULT_HOSTS = {
            "http://w.w345.my",
            "http://zk.ktv1.top:6677",
            "http://desktok.top",
            "http://mm.kk456.top",
            "http://w.w345.my:66",
            "http://z.w345.my",
            "http://b.sktv.top",
            "http://w345.my",
    };

    /** maidong 官方固定 SN（KtvJsBridge.DEVICE_SN）。 */
    private static final String SN = "2d7bb4a7d7f8";
    /** maidong DeviceMac.FALLBACK_MAC —— spider 无设备上下文，用历史抓包身份。 */
    private static final String MAC = "ae60e9547958";

    /** 运行时源优先级：成功置顶、失败沉底。 */
    private static final List<String> HOST_ORDER =
            Collections.synchronizedList(new ArrayList<String>());

    /** host → token 缓存（token 恒定，进程生命周期内复用）。 */
    private static final Map<String, String> TOKENS =
            Collections.synchronizedMap(new LinkedHashMap<String, String>());

    static {
        Collections.addAll(HOST_ORDER, DEFAULT_HOSTS);
    }

    /** 最近一次取流命中的源 host（诊断用）。 */
    private static volatile String lastHost = "";

    private SongGateway() {
    }

    public static String lastHost() {
        return lastHost;
    }

    /**
     * 取播放直链（MPEG-TS 明文 CDN URL）。
     *
     * @param musicno    歌曲编号（曲库 songs.id）
     * @param resolution 分辨率（"720"/"1080"）
     * @param h265       是否请求 H.265
     * @return 播放直链；全部源失败返回 null
     */
    public static String resolve(String musicno, String resolution, boolean h265) {
        if (musicno == null || musicno.trim().isEmpty()) return null;
        String no = musicno.trim();
        long startedAt = android.os.SystemClock.uptimeMillis();

        List<String> hosts;
        synchronized (HOST_ORDER) {
            hosts = new ArrayList<String>(HOST_ORDER);
        }
        String lastDetail = "no-source";

        for (int i = 0; i < hosts.size(); i++) {
            String host = hosts.get(i);
            String token = fetchToken(host);
            if (token == null || token.isEmpty()) {
                lastDetail = "token-fail";
                demote(host);
                continue;
            }
            String url = fetchSongUrl(host, no, token, resolution, h265);
            if (url != null && !url.isEmpty()) {
                promote(host);
                lastHost = host;
                Log.i(TAG, "取址成功 编号=" + no + " 源=" + host
                        + " 第" + (i + 1) + "个源 用时=" + (android.os.SystemClock.uptimeMillis() - startedAt) + "ms");
                return url;
            }
            lastDetail = "no-url";
            demote(host);
        }
        Log.e(TAG, "全部源失败 编号=" + no + " 详情=" + lastDetail
                + " 用时=" + (android.os.SystemClock.uptimeMillis() - startedAt) + "ms");
        return null;
    }

    // ─── 协议实现 ───────────────────────────────────────

    /** 第 1 步：i.php 取 token（code==200 → token 字段）。 */
    private static String fetchToken(String host) {
        String cached = TOKENS.get(host);
        if (cached != null) return cached;
        try {
            long ts = System.currentTimeMillis() / 1000L;
            String params = "appid=" + APP_ID + "&mac=" + MAC + "_" + SN + "&sn=" + SN
                    + "&time=" + ts + "&ver=" + VER + "&vn=" + VN;
            String url = host + "/i.php?" + params + "&sign=" + md5(params + APP_KEY);
            JSONObject json = getJson(url);
            if (json == null || json.optInt("code") != 200) {
                Log.w(TAG, "token 失败 源=" + host
                        + " code=" + (json == null ? -1 : json.optInt("code"))
                        + " msg=" + (json == null ? "no-json" : json.optString("msg")));
                return null;
            }
            String token = json.optString("token");
            if (!token.isEmpty()) TOKENS.put(host, token);
            return token.isEmpty() ? null : token;
        } catch (Exception e) {
            Log.w(TAG, "token 异常 源=" + host + ": " + e);
            return null;
        }
    }

    /** 第 2 步：do.php 取播放地址（code==200 → data 字段 = TS 直链）。 */
    private static String fetchSongUrl(String host, String musicno, String token,
                                       String resolution, boolean h265) {
        try {
            long ts = System.currentTimeMillis() / 1000L;
            // 参数顺序与原始 token 中的 "=" 必须与原版一致（ maidong 注释：与原 APK 对齐）。
            String params = "appid=" + APP_ID
                    + "&device=" + MAC + "_" + SN
                    + "&ish265=" + (h265 ? "1" : "0")
                    + "&ls=1"
                    + "&musicno=" + musicno
                    + "&resolution=" + resolution
                    + "&sn=" + SN
                    + "&time=" + ts
                    + "&token=" + token;
            String url = host + "/music/do.php?" + params + "&sign=" + md5(params + SDK_KEY);
            JSONObject json = getJson(url);
            if (json == null) return null;
            int code = json.optInt("code");
            if (code != 200) {
                Log.w(TAG, "do.php 源=" + host + " code=" + code + " msg=" + json.optString("msg"));
                return null;
            }
            String data = json.optString("data");
            return data.isEmpty() ? null : data;
        } catch (Exception e) {
            Log.w(TAG, "do.php 异常 源=" + host + ": " + e);
            return null;
        }
    }

    /** 解析 CleanHttp 信封 → JSON body；非 2xx/非 JSON 返回 null。 */
    private static JSONObject getJson(String url) {
        String raw = CleanHttp.get(url, TIMEOUT_MS);
        JSONObject envelope;
        try {
            envelope = new JSONObject(raw);
        } catch (Exception e) {
            return null;
        }
        int status = envelope.optInt("status");
        if (status < 200 || status > 299) {
            String host = null;
            try { host = new URI(url).getHost(); } catch (Exception ignored) {}
            Log.w(TAG, "HTTP " + status + " " + host
                    + " err=" + envelope.optString("error"));
            return null;
        }
        String body = envelope.optString("body");
        if (body.trim().isEmpty()) return null;
        try {
            return new JSONObject(body);
        } catch (Exception e) {
            Log.w(TAG, "响应非 JSON: " + body.substring(0, Math.min(body.length(), 120)));
            return null;
        }
    }

    private static void demote(String host) {
        synchronized (HOST_ORDER) {
            int idx = HOST_ORDER.indexOf(host);
            if (idx >= 0 && idx < HOST_ORDER.size() - 1) {
                HOST_ORDER.remove(idx);
                HOST_ORDER.add(host);
            }
        }
    }

    private static void promote(String host) {
        synchronized (HOST_ORDER) {
            int idx = HOST_ORDER.indexOf(host);
            if (idx > 0) {
                HOST_ORDER.remove(idx);
                HOST_ORDER.add(0, host);
            }
        }
    }

    private static String md5(String text) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(text.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder(digest.length * 2);
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }
}
