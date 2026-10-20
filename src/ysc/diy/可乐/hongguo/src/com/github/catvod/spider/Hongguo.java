package com.github.catvod.spider;

import android.util.Base64;
import android.util.Log;

import com.github.catvod.crawler.Spider;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 红果短剧 Spider（接口侧实现，壳内不含任何数据源逻辑）。
 * 算法蓝本：hongguoTV kotlin-tv core（Signer/MediaCrypto/ContentRepository/ComicRank）。
 *
 * 数据面：
 *  - 分类/详情/榜单/搜索：红果官网 SSR（hongguoduanju.com，无需签名）；
 *  - 取流：fqnovel preload 接口（signSimple：老版 X-Gorgon 0x401c + X-Khronos + X-SS-Req-Ticket + X-SS-STUB）；
 *  - 解密：spade_a 密钥派生 + spade 解密（SHA512 + AES-128-CBC）+ CENC 逐样本 AES-CTR；
 *  - 播放：经壳本地代理 proxy() 回吐解密后的分段字节（206）。
 */
public class Hongguo extends Spider {

    private static final String TAG = "echo-drama-jar";

    /** 把 jar 内部排查日志桥接到壳的 LogWriter（落 guoju_log.txt，导出可见；反射失败时仅 logcat）。 */
    private static void fileLog(String msg) {
        Log.e(TAG, msg);
        try {
            Class<?> lw = Class.forName("com.github.tvbox.osc.util.LogWriter");
            lw.getMethod("i", String.class).invoke(null, "echo-drama jar: " + msg);
        } catch (Throwable ignored) {
        }
    }
    private static final String SITE = "https://hongguoduanju.com";
    private static final String PRELOAD_URL =
            "https://api5-normal-sinfonlineb.fqnovel.com/novel/player/multi_video_model/preload/v1/";
    private static final String VIDEO_UA =
            "com.phoenix.read/73532 (Linux; U; Android 16; zh_CN; 25053RT47C; " +
            "Build/BP2A.250605.031.A3; Cronet/TTNetVersion:04657795 2026-01-23 " +
            "QuicVersion:c67e9834 2025-09-08)";
    private static final int SEG_SIZE = 1048576;       // 1MB 分段
    private static final int HEADER_HINT = 8388608;    // moov 头部兜底抓取 8MB

    // ============================ 工具：hex / bytes ============================

    private static byte[] hexOf(String value) {
        int len = value.length();
        if (len % 2 != 0) throw new IllegalArgumentException("odd hex");
        byte[] out = new byte[len / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = (byte) Integer.parseInt(value.substring(i * 2, i * 2 + 2), 16);
        }
        return out;
    }

    private static String hexOf(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) sb.append(String.format("%02x", b & 255));
        return sb.toString();
    }

    private static int u(byte b) {
        return b & 255;
    }

    private static byte[] concat(byte[] a, byte[] b) {
        byte[] out = new byte[a.length + b.length];
        System.arraycopy(a, 0, out, 0, a.length);
        System.arraycopy(b, 0, out, a.length, b.length);
        return out;
    }

    private static byte[] b64(String value) {
        return Base64.decode(value.replace('-', '+').replace('_', '/'), Base64.DEFAULT);
    }

    private static byte[] digest(String algo, byte[] data) {
        try {
            return MessageDigest.getInstance(algo).digest(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String md5HexUpper(byte[] data) {
        return hexUpper(digest("MD5", data));
    }

    private static String hexUpper(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) sb.append(String.format("%02X", b & 255));
        return sb.toString();
    }

    // ============================ 签名：legacyGorgon（蓝本 Signer.signSimple 同款） ============================

    private static String legacyGorgon(String query, byte[] body, int ts) {
        byte[] input = concat(
                concat(Arrays.copyOf(digest("MD5", query.getBytes(StandardCharsets.UTF_8)), 4),
                        Arrays.copyOf(digest("MD5", body), 4)),
                concat(concat(new byte[4], new byte[]{0, 6, 11, 28}),
                        new byte[]{(byte) (ts >>> 24), (byte) (ts >>> 16), (byte) (ts >>> 8), (byte) ts}));
        byte[] key = hexOf("44b9b9d9a4aef9fca493aa757ca3c2c4a496938f");
        byte[] out = new byte[input.length];
        for (int i = 0; i < out.length; i++) out[i] = (byte) (u(input[i]) ^ u(key[i]));
        for (int i = 0; i < out.length; i++) {
            int value = ((u(out[i]) >>> 4) | (u(out[i]) << 4)) & 255;
            int next = u(out[(i + 1) % out.length]);
            int reversed = Integer.reverse((next ^ value) & 255) >>> 24;
            out[i] = (byte) ((reversed ^ 20) ^ 0xFF);
        }
        return hexOf(concat(hexOf("8404401c0000"), out));
    }

    private static String encodeValue(String v) {
        return java.net.URLEncoder.encode(v, StandardCharsets.UTF_8)
                .replace("+", "%20").replace("%7E", "~");
    }

    private static String encodeQuery(Map<String, String> values) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : values.entrySet()) {
            if (sb.length() > 0) sb.append('&');
            sb.append(encodeValue(entry.getKey())).append('=').append(encodeValue(entry.getValue()));
        }
        return sb.toString();
    }

    // ============================ HTTP ============================

    private static String text(String url, String method, byte[] body, Map<String, String> headers) {
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(30000);
            conn.setRequestMethod(method);
            conn.setRequestProperty("User-Agent", VIDEO_UA);
            conn.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.9");
            if (headers != null) {
                for (Map.Entry<String, String> h : headers.entrySet()) {
                    conn.setRequestProperty(h.getKey(), h.getValue());
                }
            }
            if (body != null && body.length > 0) {
                conn.setDoOutput(true);
                conn.getOutputStream().write(body);
            }
            int code = conn.getResponseCode();
            InputStream in = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[65536];
            if (in != null) {
                int n;
                while ((n = in.read(buf)) > 0) {
                    out.write(buf, 0, n);
                    if (out.size() > 16777216) break;
                }
                in.close();
            }
            String result = new String(out.toByteArray(), StandardCharsets.UTF_8);
            Log.e(TAG, "http " + method + " " + url.substring(0, Math.min(120, url.length()))
                    + " -> " + code + " len=" + result.length());
            return result;
        } catch (Exception e) {
            Log.e(TAG, "http FAIL " + method + " " + url.substring(0, Math.min(120, url.length()))
                    + " : " + e.getClass().getSimpleName() + " " + e.getMessage());
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    private static String text(String url) {
        return text(url, "GET", null, null);
    }

    /** 取 CDN 分段字节，total[0] 回填文件总长。 */
    private static byte[] range(String url, long start, long end, long[] total) {
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(30000);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", VIDEO_UA);
            conn.setRequestProperty("Accept", "*/*");
            conn.setRequestProperty("Range", "bytes=" + start + "-" + end);
            int code = conn.getResponseCode();
            if (code >= 400) throw new RuntimeException("range http " + code);
            String cr = conn.getHeaderField("Content-Range");
            long tot = -1;
            if (cr != null) {
                int slash = cr.lastIndexOf('/');
                if (slash >= 0 && slash < cr.length() - 1) {
                    try {
                        tot = Long.parseLong(cr.substring(slash + 1).trim());
                    } catch (NumberFormatException ignore) {
                    }
                }
            }
            if (tot <= 0) tot = conn.getContentLengthLong();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            InputStream in = conn.getInputStream();
            byte[] buf = new byte[65536];
            int n;
            while ((n = in.read(buf)) > 0) out.write(buf, 0, n);
            in.close();
            total[0] = tot;
            return out.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    // ============================ 网页 SSR 解析 ============================

    /** 从 SSR 页面里取出内嵌 _ROUTER_DATA JSON（大括号/方括号配对扫描）。 */
    private static JSONObject extractRouter(String html) {
        int index = html.indexOf("_ROUTER_DATA");
        if (index < 0) throw new RuntimeException("router data missing");
        int at = html.indexOf('{', index);
        if (at < 0) throw new RuntimeException("router data missing");
        boolean inString = false;
        boolean escaped = false;
        int depth = 0;
        for (int i = at; i < html.length(); i++) {
            char c = html.charAt(i);
            if (inString) {
                if (escaped) escaped = false;
                else if (c == '\\') escaped = true;
                else if (c == '"') inString = false;
            } else if (c == '"') {
                inString = true;
            } else if (c == '{' || c == '[') {
                depth++;
            } else if (c == '}' || c == ']') {
                depth--;
                if (depth == 0) {
                    try {
                        return new JSONObject(html.substring(at, i + 1));
                    } catch (Exception e) {
                        throw new RuntimeException("router data json: " + e.getMessage());
                    }
                }
            }
        }
        throw new RuntimeException("router data unbalanced");
    }

    private static JSONObject router(String url) {
        try {
            return extractRouter(text(url)).getJSONObject("loaderData");
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static final class Series {
        final String id, name, cover, intro, badge, tags;

        Series(String id, String name, String cover, String intro, String badge, String tags) {
            this.id = id;
            this.name = name;
            this.cover = cover;
            this.intro = intro;
            this.badge = badge;
            this.tags = tags;
        }
    }

    private static final class Page {
        final List<Series> items;
        final int lastPage;
        final boolean hasMore;

        Page(List<Series> items, int page, int lastPage) {
            this.items = items;
            this.lastPage = lastPage;
            this.hasMore = !items.isEmpty() && page < Math.min(lastPage, 100);
        }
    }

    /** series_id 必须是纯数字（蓝本 valid()），防止把广告位解析成条目。 */
    private static boolean valid(String id, String title) {
        return id.matches("[0-9]{1,30}") && !title.trim().isEmpty();
    }

    private static String tagsText(JSONArray tags) {
        if (tags == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < Math.min(tags.length(), 5); t++) {
            String s = tags.optString(t, "").trim();
            if (!s.isEmpty()) {
                if (sb.length() > 0) sb.append(" · ");
                sb.append(s);
            }
        }
        return sb.toString();
    }

    private static List<Series> cards(JSONArray rows) {
        List<Series> out = new ArrayList<>();
        if (rows == null) return out;
        for (int i = 0; i < rows.length(); i++) {
            JSONObject item = rows.optJSONObject(i);
            if (item == null) continue;
            JSONObject o = item.optJSONObject("video_data");
            if (o == null) o = item;
            int count = o.optInt("episode_cnt",
                    o.optJSONObject("series_episode_info") == null ? 0
                            : o.optJSONObject("series_episode_info").optInt("episode_cnt", 0));
            String id = o.optString("series_id", "");
            String name = o.optString("series_name", "");
            if (name.isEmpty()) name = o.optString("series_title", "");
            if (!valid(id, name)) continue;
            String badge = o.optString("episode_right_text", "");
            if (badge.isEmpty() && count > 0) badge = "全 " + count + " 集";
            out.add(new Series(id, name.trim(), o.optString("series_cover", ""),
                    o.optString("series_intro", ""), badge,
                    tagsText(o.optJSONArray("tags") != null ? o.optJSONArray("tags") : o.optJSONArray("category_list"))));
        }
        // 按 id 去重（蓝本 distinctBy id）
        List<Series> distinct = new ArrayList<>();
        for (Series s : out) {
            boolean dup = false;
            for (Series d : distinct) if (d.id.equals(s.id)) { dup = true; break; }
            if (!dup) distinct.add(s);
        }
        return distinct;
    }

    /** 官网分类页（热播）。 */
    private Page home(int page) {
        String url = SITE + "/category?tab=1&sort_type=1" + (page > 1 ? "&page=" + page : "");
        JSONObject section = router(url);
        JSONObject s = section.optJSONObject("category_page");
        if (s == null) s = section.optJSONObject("category_$");
        if (s == null) throw new RuntimeException("category page missing (loaderData keys: " + keysOf(section) + ")");
        JSONArray rows = s.optJSONArray("recommendList");
        if (rows == null) {
            JSONObject cd = s.optJSONObject("categoryData");
            rows = cd == null ? null : cd.optJSONArray("recommendList");
        }
        List<Series> items = cards(rows);
        int last = 100;
        JSONObject pag = s.optJSONObject("pagination");
        if (pag != null) last = Math.max(1, Math.min(100, pag.optInt("totalPages", 100)));
        return new Page(items, page, last);
    }

    private static String keysOf(JSONObject o) {
        if (o == null) return "(null)";
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = o.keys();
        while (it.hasNext()) {
            if (sb.length() > 0) sb.append(',');
            sb.append(it.next());
        }
        return sb.toString();
    }

    /** 官网搜索（v1 无签名路径；loaderData key 因关键词而异，遍历兜底）。 */
    private Page searchPage(String keyword, int page) {
        String url = SITE + "/search/" + enc(keyword) + "?page=" + page;
        JSONObject data = router(url);
        JSONObject s = data.optJSONObject("search_(" + keyword + ")/page");
        if (s == null) s = data.optJSONObject("search_page");
        if (s == null) {
            Iterator<String> it = data.keys();
            while (it.hasNext()) {
                String key = it.next();
                if (key.contains("search")) {
                    JSONObject cand = data.optJSONObject(key);
                    if (cand != null && cand.has("searchList")) { s = cand; break; }
                }
            }
        }
        if (s == null) throw new RuntimeException("search page missing (loaderData keys: " + keysOf(data) + ")");
        List<Series> items = cards(s.optJSONArray("searchList"));
        return new Page(items, page, 100);
    }

    /** 漫剧榜：数据在 <script data-fn-name="r|mergeLoaderData" data-fn-args="..."> 属性里（蓝本 ComicRank.parse）。
     *  注意：r 标签里 name 与 args 之间可能隔着 data-script-src 等属性，必须按整标签分别提取两个属性。 */
    private Page rankPage(int page) {
        String html = text(SITE + "/rank/hot-comic-drama?page=" + page);
        Pattern tagP = Pattern.compile("<script[^>]*>", Pattern.DOTALL);
        Pattern nameP = Pattern.compile("data-fn-name=([\"'])([^\"']*)\\1");
        Pattern argsP = Pattern.compile("data-fn-args=([\"'])(.*?)\\1(?=[\\s>])", Pattern.DOTALL);
        Matcher tm = tagP.matcher(html);
        while (tm.find()) {
            String tag = tm.group(0);
            if (!tag.contains("data-fn-name") || !tag.contains("data-fn-args")) continue;
            Matcher nm = nameP.matcher(tag);
            Matcher am = argsP.matcher(tag);
            if (!nm.find() || !am.find()) continue;
            String name = nm.group(2);
            if (!"r".equals(name) && !"mergeLoaderData".equals(name)) continue;
            String argsRaw = htmlDecode(am.group(2)).trim();
            JSONArray args;
            try {
                Object parsed = new JSONTokener(argsRaw).nextValue();
                if (!(parsed instanceof JSONArray)) continue;
                args = (JSONArray) parsed;
            } catch (Exception ignore) {
                continue;
            }
            if (!"rank_hot-comic-drama/page".equals(args.optString(0))) continue;
            Object raw = null;
            if ("r".equals(name) && "content".equals(args.optString(1))) {
                raw = args.opt(2);
            } else if ("mergeLoaderData".equals(name)) {
                JSONArray arr = args.optJSONArray(1);
                if (arr != null) {
                    for (int i = 0; i < arr.length(); i++) {
                        JSONObject e = arr.optJSONObject(i);
                        if (e != null && "content".equals(e.optString("key"))) {
                            // routerDataFnName "p" 时 payload 内联在 routerDataFnArgs[0]；"s" 时是引用，落空后走 _ROUTER_DATA 兜底
                            if ("p".equals(e.optString("routerDataFnName")) && e.optJSONArray("routerDataFnArgs") != null) {
                                raw = e.optJSONArray("routerDataFnArgs").opt(0);
                            }
                            break;
                        }
                    }
                }
            }
            JSONObject payload;
            if (raw instanceof JSONObject) payload = (JSONObject) raw;
            else if (raw instanceof String) {
                try {
                    payload = new JSONObject((String) raw);
                } catch (Exception ignore) {
                    continue;
                }
            } else continue;
            if (!payload.optBoolean("isSuccess")) throw new RuntimeException("漫剧榜单暂不可用");
            JSONArray rl = payload.optJSONArray("rankList");
            if (rl == null) throw new RuntimeException("漫剧榜单格式已变化");
            JSONObject pag = payload.optJSONObject("pagination");
            int totalPages = pag == null ? 100 : pag.optInt("totalPages", 100);
            if (totalPages < 1) totalPages = 100;

            List<Series> items = new ArrayList<>();
            for (int i = 0; i < rl.length(); i++) {
                JSONObject row = rl.optJSONObject(i);
                if (row == null) continue;
                int count = row.optInt("episodeCount",
                        row.optJSONArray("episodeVids") == null ? 0 : row.optJSONArray("episodeVids").length());
                String id = row.optString("seriesId", "");
                if (id.isEmpty()) id = row.optString("id", "");
                String title = row.optString("title", "");
                if (!valid(id, title)) continue;
                String badge = count > 0 ? "全 " + count + " 集" : row.optString("heatText", "");
                Series s = new Series(id, title.trim(), row.optString("cover", ""),
                        row.optString("description", ""), badge, tagsText(row.optJSONArray("tags")));
                boolean dup = false;
                for (Series d : items) if (d.id.equals(s.id)) { dup = true; break; }
                if (!dup) items.add(s);
            }
            return new Page(items, page, Math.min(totalPages, 100));
        }
        throw new RuntimeException("页面没有漫剧榜单数据");
    }

    private static String htmlDecode(String s) {
        return s.replace("&quot;", "\"").replace("&#39;", "'")
                .replace("&lt;", "<").replace("&gt;", ">")
                .replace("&amp;", "&");
    }

    private static String enc(String v) {
        return encodeValue(v);
    }

    /** 详情页 → 分集 vid 列表（单次抓取；detail_page key 缺失时扫描 loaderData 兜底）。 */
    private static JSONObject seriesDetailOf(JSONObject data) {
        JSONObject dp = data.optJSONObject("detail_page");
        if (dp != null && dp.optJSONObject("seriesDetail") != null) return dp.optJSONObject("seriesDetail");
        Iterator<String> it = data.keys();
        while (it.hasNext()) {
            JSONObject cand = data.optJSONObject(it.next());
            if (cand == null) continue;
            JSONObject sd = cand.optJSONObject("seriesDetail");
            if (sd != null) return sd;
        }
        return null;
    }

    private static List<String> vidsOf(JSONObject seriesDetail) {
        List<String> out = new ArrayList<>();
        JSONArray vids = seriesDetail.optJSONArray("vid_list");
        if (vids != null) {
            for (int i = 0; i < vids.length(); i++) {
                String v = vids.optString(i, "");
                if (!v.isEmpty()) out.add(v);
            }
        }
        return out;
    }

    // ============================ 取流（preload + spade 解密，蓝本 ContentRepository.stream 同构） ============================

    private static final class StreamInfo {
        final String url, quality;
        final byte[] key; // null = 明文

        StreamInfo(String url, byte[] key, String quality) {
            this.url = url;
            this.key = key;
            this.quality = quality;
        }
    }

    private static String cleanUrl(String v) {
        return v.replace("\\/", "/")
                .replaceAll("(?i)\\\\u002f", "/")
                .replace("\\u0026", "&")
                .replace("&amp;", "&");
    }

    /** 蓝本 qualityNumber：档位描述 → 数值。 */
    private static int qualityNumber(String v) {
        if (v == null) return 0;
        Matcher m = Pattern.compile("2160|1440|1080|720|576|540|480|360").matcher(v);
        if (m.find()) return Integer.parseInt(m.group());
        Matcher h = Pattern.compile("(1920|1280|1024|854|640)").matcher(v);
        if (h.find()) {
            String k = h.group();
            if ("1920".equals(k)) return 1080;
            if ("1280".equals(k)) return 720;
            if ("1024".equals(k)) return 576;
            if ("854".equals(k)) return 480;
            return 360;
        }
        try {
            return Integer.parseInt(v.trim());
        } catch (Exception e) {
            return 0;
        }
    }

    private static String qualityText(JSONObject q) {
        String v = q.optString("quality_desc", "");
        if (v.isEmpty() || "0".equals(v)) v = String.valueOf(q.optInt("height", 0));
        if (v.isEmpty() || "0".equals(v)) v = String.valueOf(q.optInt("vheight", 0));
        if (v.isEmpty() || "0".equals(v)) v = String.valueOf(q.optInt("quality", 0));
        if (v.isEmpty() || "0".equals(v)) v = q.optString("key", "");
        return v;
    }

    // 进程内复用设备标识（蓝本 streamDeviceId/streamInstallId 各生成一次后复用）
    private static final Random RNG = new Random();
    private static final String DEVICE_ID = String.valueOf(1000000000000000000L + (long) (RNG.nextDouble() * 8000000000000000000L));
    private static final String INSTALL_ID = String.valueOf(1000000000000000000L + (long) (RNG.nextDouble() * 8000000000000000000L));

    private StreamInfo stream(String vid) {
        // 兼容旧配置里 proxy://do=play&...&vid=xxx 形式的分集 id：服务端只认纯数字 vid
        if (vid != null && vid.contains("vid=")) {
            vid = vid.substring(vid.indexOf("vid=") + 4);
            int amp = vid.indexOf('&');
            if (amp >= 0) vid = vid.substring(0, amp);
        }
        if (vid == null || !vid.matches("[0-9]{1,30}")) {
            fileLog("stream reject vid 格式异常: " + vid);
            throw new RuntimeException("vid 格式异常: " + vid);
        }
        synchronized (streamCache) {
            StreamInfo hit = streamCache.get(vid);
            if (hit != null) return hit;
        }
        fileLog("stream begin vid=" + vid + " (缓存未命中，开始取流)");

        // 蓝本 preload payload（精简 biz_param + mixed_video_id_map）
        JSONObject biz = new JSONObject();
        JSONObject payload = new JSONObject();
        try {
            biz.put("detail_page_version", 0);
            biz.put("device_level", 3);
            biz.put("disable_digg_stat", false);
            biz.put("need_all_video_definition", true);
            biz.put("need_mp4_align", false);
            biz.put("use_os_player", false);
            biz.put("use_server_dns", false);
            biz.put("video_platform", 1024);
            payload.put("biz_param", biz);
            payload.put("mixed_video_id_map", new JSONObject().put("1004", new JSONArray().put(vid)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        byte[] body = payload.toString().getBytes(StandardCharsets.UTF_8);

        LinkedHashMap<String, String> values = new LinkedHashMap<>();
        values.put("aid", "8662");
        values.put("app_name", "novelread");
        values.put("version_code", "73532");
        values.put("version_name", "7.3.5.32");
        values.put("manifest_version_code", "73532");
        values.put("update_version_code", "73532");
        values.put("channel", "update_64");
        values.put("device_platform", "android");
        values.put("os", "android");
        values.put("ssmix", "a");
        values.put("device_type", "25053RT47C");
        values.put("device_brand", "Redmi");
        values.put("language", "zh");
        values.put("os_api", "36");
        values.put("os_version", "16");
        values.put("resolution", "1280*2772");
        values.put("dpi", "520");
        values.put("ac", "wifi");
        values.put("device_id", DEVICE_ID);
        values.put("iid", INSTALL_ID);

        // preload 风控对同一指纹偶发软拒（200 空体，同一请求隔几分钟重试即可放行），
        // 自动重试 3 次，每次刷新 _rticket/khronos/gorgon 时间戳
        String respText = "";
        for (int attempt = 1; attempt <= 3; attempt++) {
            long now = System.currentTimeMillis();
            int ts = (int) (now / 1000);
            String query = encodeQuery(new LinkedHashMap<String, String>(values) {{
                put("_rticket", String.valueOf(now));
            }});
            LinkedHashMap<String, String> headers = new LinkedHashMap<>();
            headers.put("User-Agent", VIDEO_UA);
            headers.put("Accept", "application/json");
            headers.put("x-xs-from-web", "0");
            headers.put("sdk-version", "2");
            headers.put("x-khronos", String.valueOf(ts));
            headers.put("x-gorgon", legacyGorgon(query, body, ts));
            headers.put("x-ss-req-ticket", String.valueOf(now));
            headers.put("Content-Type", "application/json; charset=UTF-8");
            headers.put("x-ss-stub", md5HexUpper(body));
            respText = text(PRELOAD_URL + "?" + query, "POST", body, headers).trim();
            if (!respText.isEmpty()) break;
            if (attempt < 3) {
                fileLog("preload 空响应（风控软拒），重试 " + attempt + "/3");
                try {
                    Thread.sleep(attempt * 600L);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
        fileLog("preload http done respLen=" + respText.length()
                + " head=" + respText.substring(0, Math.min(120, respText.length())).replaceAll("\\s+", " "));
        if (respText.isEmpty()) throw new RuntimeException("preload 重试 3 次仍空响应（风控软拒，请稍后重试）");
        JSONObject resp;
        try {
            resp = new JSONObject(respText);
        } catch (Exception e) {
            throw new RuntimeException("preload 非 JSON 响应: " + respText.substring(0, Math.min(120, respText.length())));
        }
        String code = resp.optString("Code", resp.optString("code", ""));
        if (!"0".equals(code)) throw new RuntimeException("preload code=" + code);
        JSONObject data = resp.optJSONObject("data");
        if (data == null) throw new RuntimeException("preload data missing");
        JSONObject entry = data.optJSONObject(vid);
        if (entry == null) throw new RuntimeException("preload entry missing: " + vid);

        JSONObject videoModel;
        Object vm = entry.opt("video_model");
        if (vm instanceof JSONObject) {
            videoModel = (JSONObject) vm;
        } else if (vm instanceof String) {
            try {
                videoModel = new JSONObject((String) vm);
            } catch (Exception e) {
                throw new RuntimeException("video_model 非 JSON");
            }
        } else {
            throw new RuntimeException("video_model missing");
        }

        // fallback_api 在 video_model 内部（蓝本 ContentRepository：model.opt("fallback_api")），
        // 真实分片数据在 fallback 返回的 video_info.data.video_list 里
        String fallbackUrl = null;
        Object fb = videoModel.opt("fallback_api");
        if (fb instanceof JSONObject) fallbackUrl = ((JSONObject) fb).optString("fallback_api", "");
        else if (fb instanceof JSONArray) fallbackUrl = ((JSONArray) fb).optString(0, "");
        else if (fb instanceof String) {
            String raw = ((String) fb).trim();
            if (raw.startsWith("{")) {
                try {
                    fallbackUrl = new JSONObject(raw).optString("fallback_api", "");
                } catch (Exception ignore) {
                }
            }
            if (fallbackUrl == null || fallbackUrl.isEmpty()) fallbackUrl = raw;
        }
        if (fallbackUrl == null || !fallbackUrl.startsWith("https://")) {
            throw new RuntimeException("fallback_api 缺失或非 https: " + (fallbackUrl == null ? "(null)" : fallbackUrl.substring(0, Math.min(80, fallbackUrl.length()))));
        }
        JSONObject fbResp;
        try {
            fbResp = new JSONObject(text(fallbackUrl));
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        JSONObject info = fbResp.optJSONObject("video_info") == null ? null
                : fbResp.optJSONObject("video_info").optJSONObject("data");
        if (info == null) throw new RuntimeException("fallback video_info.data missing");
        JSONObject videoList = info.optJSONObject("video_list");
        if (videoList == null || videoList.length() == 0) throw new RuntimeException("fallback video_list missing");
        fileLog("fallback done qualities=" + videoList.length()
                + " key_seed=" + (info.optString("key_seed", "").isEmpty() ? "无" : "有"));

        // 选清晰度：排除 bytevc2/bvc2，按数值降序取第一个 <=1080，否则取最低档
        List<JSONObject> candidates = new ArrayList<>();
        for (Iterator<String> it = videoList.keys(); it.hasNext(); ) {
            JSONObject q = videoList.optJSONObject(it.next());
            if (q == null) continue;
            String codec = q.optString("codec_type", "");
            if (codec.contains("bytevc2") || codec.contains("bvc2")) continue;
            if (q.optString("main_url", "").isEmpty()) continue;
            candidates.add(q);
        }
        if (candidates.isEmpty()) {
            for (Iterator<String> it = videoList.keys(); it.hasNext(); ) {
                JSONObject q = videoList.optJSONObject(it.next());
                if (q != null && !q.optString("main_url", "").isEmpty()) candidates.add(q);
            }
        }
        if (candidates.isEmpty()) throw new RuntimeException("无可播放清晰度");
        Collections.sort(candidates, new Comparator<JSONObject>() {
            @Override
            public int compare(JSONObject a, JSONObject b) {
                return qualityNumber(qualityText(b)) - qualityNumber(qualityText(a));
            }
        });
        JSONObject picked = candidates.get(candidates.size() - 1);
        for (JSONObject q : candidates) {
            if (qualityNumber(qualityText(q)) <= 1080 && qualityNumber(qualityText(q)) > 0) {
                picked = q;
                break;
            }
        }
        int qn = qualityNumber(qualityText(picked));
        String quality = qn > 1080 ? qn + "P（兼容资源）" : (qn > 0 ? qn + "P" : "自动");

        String encUrl = cleanUrl(picked.optString("main_url"));
        // key_seed 在 data(info) 层级
        String seed = info.optString("key_seed", "");
        String url;
        if (!seed.isEmpty()) {
            url = decryptUrl(encUrl, b64(seed));
        } else {
            url = encUrl;
        }
        if (!url.startsWith("http")) throw new RuntimeException("解密后地址异常: " + url.substring(0, Math.min(60, url.length())));
        // spade_a 在清晰度条目层级
        String spade = picked.optString("spade_a", "");
        byte[] streamKey = spade.isEmpty() ? null : deriveKey(spade);
        Log.e(TAG, "stream ok vid=" + vid + " quality=" + quality
                + " encrypted=" + (streamKey != null) + " url=" + url.substring(0, Math.min(80, url.length())));
        fileLog("stream ok vid=" + vid + " quality=" + quality + " encrypted=" + (streamKey != null));

        StreamInfo result = new StreamInfo(url, streamKey, quality);
        synchronized (streamCache) {
            streamCache.put(vid, result);
        }
        return result;
    }

    /** spade 解密：SHA512(seed)+常量 → AES-128-CBC（蓝本 MediaCrypto.decryptUrl）。 */
    private static final String SPADE_CONST =
            "4dd4c2e6b83162090e52b3c7a6733ba41cb2462b829ab58a196b39db57177524f49baf7f08e8d68d26a72e37c1a95a2f1f05a51892aef2949732b62a38aadd58";

    private static String decryptUrl(String value, byte[] seed) {
        byte[] raw = b64(value);
        if (raw.length < 20 || u(raw[0]) != 0xa8 || u(raw[2]) != 1 || u(raw[3]) != 0) {
            throw new RuntimeException("unsupported url envelope");
        }
        byte[] h = digest("SHA-512", concat(digest("SHA-512", seed), hexOf(SPADE_CONST)));
        byte[] plain = aes(false, Arrays.copyOfRange(h, 0, 16), Arrays.copyOfRange(h, 16, 32),
                Arrays.copyOfRange(raw, 4, 4 + (raw.length - 4) / 16 * 16), "CBC");
        int end = plain.length;
        int padding = u(plain[plain.length - 1]);
        if (padding >= 1 && padding <= 16 && padding <= end) end -= padding;
        while (end > 0 && u(plain[end - 1]) == 0) end--;
        return new String(plain, 0, end, StandardCharsets.UTF_8);
    }

    /** spade_a 密钥派生（蓝本 MediaCrypto.deriveKey）。 */
    private static byte[] deriveKey(String value) {
        byte[] raw = b64(value);
        if (raw.length < 3) throw new RuntimeException("key too short");
        int length = Math.min(raw.length - (u(raw[0]) ^ u(raw[1]) ^ u(raw[2])) + 47, raw.length - 1);
        if (length < 33) throw new RuntimeException("key length " + length);
        byte[] work = Arrays.copyOfRange(raw, 1, 1 + length);
        int a = 85, b = 246;
        for (int i = 0; i < work.length; i++) {
            int old = u(work[i]);
            int previous = (i & 1) != 0 ? a : b;
            if ((i & 1) != 0) a = old;
            else b = old;
            work[i] = (byte) (-21 - Integer.bitCount(i) + (previous ^ old));
        }
        byte[] key = hexOf(new String(Arrays.copyOfRange(work, 1, 33), StandardCharsets.ISO_8859_1));
        if (key.length != 16) throw new RuntimeException("derived key size " + key.length);
        return key;
    }

    private static byte[] aes(boolean encrypt, byte[] key, byte[] iv, byte[] data, String mode) {
        try {
            Cipher cipher = Cipher.getInstance("AES/" + mode + "/NoPadding");
            cipher.init(encrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE,
                    new SecretKeySpec(key, "AES"), new IvParameterSpec(iv));
            return cipher.doFinal(data);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    // ============================ MP4/CENC（蓝本 MediaCrypto.prepare/decrypt 同构） ============================

    private static final class Box {
        final int start, end, body;
        final String type;

        Box(int start, int end, int body, String type) {
            this.start = start;
            this.end = end;
            this.body = body;
            this.type = type;
        }
    }

    private static Box box(byte[] d, int at, int limit) {
        if (at < 0 || at + 8 > limit) return null;
        long size = u32(d, at);
        int header = 8;
        if (size == 1) {
            if (at + 16 > limit) return null;
            size = i64(d, at + 8);
            header = 16;
        }
        if (size == 0) size = limit - at;
        if (size < header || size > limit - at) return null;
        return new Box(at, at + (int) size, at + header, ascii4(d, at + 4));
    }

    private static Box find(byte[] d, String type, int start, int limit) {
        for (int at = start; at <= limit - 8; at++) {
            if (d[at + 4] == type.charAt(0)) {
                Box b = box(d, at, limit);
                if (b != null && type.equals(b.type)) return b;
            }
        }
        return null;
    }

    private static String ascii4(byte[] d, int at) {
        return new String(d, at, 4, StandardCharsets.US_ASCII);
    }

    private static long u32(byte[] d, int at) {
        return ((long) i32(d, at)) & 0xFFFFFFFFL;
    }

    private static int i32(byte[] d, int at) {
        return ((d[at] & 255) << 24) | ((d[at + 1] & 255) << 16) | ((d[at + 2] & 255) << 8) | (d[at + 3] & 255);
    }

    private static long i64(byte[] d, int at) {
        long v = 0;
        for (int i = 0; i < 8; i++) v = (v << 8) | (d[at + i] & 255);
        return v;
    }

    private static int count(byte[] d, int at, int limit) {
        if (at + 4 > limit) throw new RuntimeException("索引越界");
        long n = u32(d, at);
        if (n > 200000) throw new RuntimeException("索引数量过大");
        return (int) n;
    }

    private static final class Sample {
        final long start, end, encryptedOffset;
        final byte[] iv;

        Sample(long start, long end, long encryptedOffset, byte[] iv) {
            this.start = start;
            this.end = end;
            this.encryptedOffset = encryptedOffset;
            this.iv = iv;
        }
    }

    private static final class Prepared {
        final byte[] header;
        final List<Sample> samples;

        Prepared(byte[] header, List<Sample> samples) {
            this.header = header;
            this.samples = samples;
        }
    }

    private static Prepared prepare(byte[] data, byte[] key) {
        if (key == null) return new Prepared(new byte[0], new ArrayList<Sample>());
        // ftyp 之后紧跟 moov（蓝本 box(data, data.u32(0))）
        Box moov = box(data, (int) u32(data, 0), data.length);
        if (moov == null || !"moov".equals(moov.type)) throw new RuntimeException("视频索引不完整");

        List<Sample> samples = new ArrayList<>();
        byte[] header = data.clone();
        int moovEnd = moov.end;
        int cursor = moov.body;
        while (cursor < moov.end) {
            Box track = box(data, cursor, moov.end);
            if (track == null) throw new RuntimeException("视频轨道格式异常");
            cursor = track.end;
            if (!"trak".equals(track.type)) continue;
            Box stbl = find(data, "stbl", track.body, track.end);
            if (stbl == null) continue;
            Box saiz = find(data, "saiz", stbl.body, stbl.end);
            Box saio = find(data, "saio", stbl.body, stbl.end);
            Box stsz = find(data, "stsz", stbl.body, stbl.end);
            Box stsc = find(data, "stsc", stbl.body, stbl.end);
            Box chunks = find(data, "stco", stbl.body, stbl.end);
            if (chunks == null) chunks = find(data, "co64", stbl.body, stbl.end);
            if (saiz == null) continue;
            if (saio == null) throw new RuntimeException("视频加密索引缺失");
            if (stsz == null) throw new RuntimeException("样本索引缺失");
            if (stsc == null) throw new RuntimeException("块索引缺失");
            if (chunks == null) throw new RuntimeException("块偏移缺失");

            int n = count(data, stsz.body + 8, stsz.end);
            int defaultSize = (int) u32(data, stsz.body + 4);
            if (defaultSize == 0 && stsz.body + 12 + (long) n * 4 > stsz.end) throw new RuntimeException("样本索引截断");
            long[] sizes = new long[n];
            for (int i = 0; i < n; i++) sizes[i] = defaultSize > 0 ? defaultSize : u32(data, stsz.body + 12 + i * 4);

            int chunkCount = count(data, chunks.body + 4, chunks.end);
            int width = "co64".equals(chunks.type) ? 8 : 4;
            if (chunks.body + 8 + (long) chunkCount * width > chunks.end) throw new RuntimeException("块偏移截断");
            long[] offsets = new long[chunkCount];
            for (int i = 0; i < chunkCount; i++) {
                offsets[i] = width == 8 ? i64(data, chunks.body + 8 + i * 8) : u32(data, chunks.body + 8 + i * 4);
            }

            int entryCount = count(data, stsc.body + 4, stsc.end);
            if (entryCount == 0 || stsc.body + 8 + (long) entryCount * 12 > stsc.end) throw new RuntimeException("块索引截断");
            long[] firstChunk = new long[entryCount];
            long[] samplesPerChunk = new long[entryCount];
            for (int i = 0; i < entryCount; i++) {
                firstChunk[i] = u32(data, stsc.body + 8 + i * 12);
                samplesPerChunk[i] = u32(data, stsc.body + 12 + i * 12);
            }

            // saiz：body+4=default_size(1B)，body+5=count(4B)，body+9=sizes[]
            int sizeBase = saiz.body + 4 + ((i32(data, saiz.body) & 1) != 0 ? 8 : 0);
            if (sizeBase + 5 > saiz.end) throw new RuntimeException("辅助索引截断");
            int auxDefault = u(data[sizeBase]);
            int auxCount = count(data, sizeBase + 1, saiz.end);
            if (auxCount != n || (auxDefault == 0 && sizeBase + 5 + n > saiz.end)) throw new RuntimeException("辅助索引数量不一致");
            int[] auxSizes = new int[n];
            for (int i = 0; i < n; i++) auxSizes[i] = auxDefault > 0 ? auxDefault : u(data[sizeBase + 5 + i]);

            // saio：body+4=count(4B)，body+8=offset（宽 4/8）
            int offsetBase = saio.body + 4 + ((i32(data, saio.body) & 1) != 0 ? 8 : 0);
            int offsetWidth = u(data[saio.body]) == 1 ? 8 : 4;
            if (count(data, offsetBase, saio.end) != 1 || offsetBase + 4 + offsetWidth > saio.end) {
                throw new RuntimeException("不支持的辅助索引布局");
            }
            long aux = offsetWidth == 8 ? i64(data, offsetBase + 4) : u32(data, offsetBase + 4);
            long auxTotal = 0;
            for (int i = 0; i < n; i++) auxTotal += auxSizes[i];
            if (aux < 0 || aux + auxTotal > data.length) throw new RuntimeException("辅助数据超出索引范围");

            int sampleIndex = 0;
            int entry = 0;
            for (int chunk = 0; chunk < chunkCount; chunk++) {
                while (entry + 1 < entryCount && firstChunk[entry + 1] <= chunk + 1) entry++;
                if (firstChunk[entry] > chunk + 1) throw new RuntimeException("样本与块数量不一致");
                int c = (int) samplesPerChunk[entry];
                if (c > n - sampleIndex) throw new RuntimeException("样本与块数量不一致");
                long position = offsets[chunk];
                for (int i = 0; i < c; i++, sampleIndex++) {
                    long length = sizes[sampleIndex];
                    int auxSize = auxSizes[sampleIndex];
                    if (length <= 0 || auxSize < 8) throw new RuntimeException("样本索引异常");
                    byte[] iv = new byte[16];
                    System.arraycopy(data, (int) aux, iv, 0, 8);
                    if (auxSize == 8) {
                        samples.add(new Sample(position, position + length, 0, iv));
                    } else {
                        if (auxSize < 10) throw new RuntimeException("不支持的加密样本格式");
                        int subs = ((data[(int) (aux + 8)] & 255) << 8) | (data[(int) (aux + 9)] & 255);
                        if (auxSize != 10 + subs * 6) throw new RuntimeException("加密子样本索引异常");
                        long offset = position;
                        long encrypted = 0;
                        for (int s = 0; s < subs; s++) {
                            int at = (int) (aux + 10 + s * 6);
                            int clear = ((data[at] & 255) << 8) | (data[at + 1] & 255);
                            int encSize = (int) u32(data, at + 2);
                            offset += clear;
                            if (offset + encSize > position + length) throw new RuntimeException("加密子样本越界");
                            if (encSize > 0) samples.add(new Sample(offset, offset + encSize, encrypted, iv));
                            encrypted += encSize;
                            offset += encSize;
                        }
                        if (offset != position + length) throw new RuntimeException("加密子样本长度异常");
                    }
                    position += length;
                    aux += auxSize;
                }
            }
            if (sampleIndex != n) throw new RuntimeException("视频样本不完整");

            // moov 改写：encv/enca → frma 原始编码，sinf → free 清零体（保留 stbl 内逐个处理）
            int at = stbl.body;
            while (at + 8 <= stbl.end) {
                Box sinf = find(data, "sinf", at, stbl.end);
                if (sinf == null) break;
                Box frma = find(data, "frma", sinf.body, sinf.end);
                if (frma == null || frma.body + 4 > frma.end) throw new RuntimeException("原始编码格式缺失");
                byte[] original = Arrays.copyOfRange(data, frma.body, frma.body + 4);
                int entryAt = sinf.start - 1;
                while (entryAt >= stbl.body
                        && !"encv".equals(ascii4(data, entryAt))
                        && !"enca".equals(ascii4(data, entryAt))) {
                    entryAt--;
                }
                if (entryAt < stbl.body) throw new RuntimeException("encv 缺失");
                System.arraycopy(original, 0, header, entryAt, 4);
                System.arraycopy("free".getBytes(StandardCharsets.US_ASCII), 0, header, sinf.start + 4, 4);
                for (int i = sinf.body; i < sinf.end; i++) header[i] = 0;
                at = sinf.end;
            }
        }
        if (samples.isEmpty()) throw new RuntimeException("视频加密索引不可用");

        Collections.sort(samples, new Comparator<Sample>() {
            @Override
            public int compare(Sample a, Sample b) {
                return Long.compare(a.start, b.start);
            }
        });
        for (int i = 1; i < samples.size(); i++) {
            if (samples.get(i).start < samples.get(i - 1).end) throw new RuntimeException("视频样本重叠");
        }
        // 头部截到 moov 结束：mdat 区间的密文字节绝不能进 header（否则 decrypt 会覆盖已解密数据）
        return new Prepared(Arrays.copyOf(header, moovEnd), samples);
    }

    private static byte[] decrypt(byte[] data, long start, byte[] key, Prepared prepared) {
        byte[] result = data.clone();
        long end = start + data.length;
        if (start < prepared.header.length) {
            int from = (int) start;
            int to = (int) Math.min(end, prepared.header.length);
            System.arraycopy(prepared.header, from, result, 0, to - from);
        }
        if (key == null) return result;
        int low = 0;
        int high = prepared.samples.size();
        while (low < high) {
            int mid = (low + high) >>> 1;
            if (prepared.samples.get(mid).end <= start) low = mid + 1;
            else high = mid;
        }
        for (int i = low; i < prepared.samples.size(); i++) {
            Sample s = prepared.samples.get(i);
            if (s.start >= end) break;
            long begin = Math.max(start, s.start);
            long stop = Math.min(end, s.end);
            if (begin >= stop) continue;
            long relative = begin - s.start + s.encryptedOffset;
            int skip = (int) (relative % 16);
            BigInteger counter = new BigInteger(1, s.iv)
                    .add(BigInteger.valueOf(relative / 16))
                    .and(BigInteger.ONE.shiftLeft(128).subtract(BigInteger.ONE));
            byte[] cb = counter.toByteArray();
            byte[] iv = new byte[16];
            int srcFrom = Math.max(0, cb.length - 16);
            int dstFrom = Math.max(0, 16 - cb.length);
            System.arraycopy(cb, srcFrom, iv, dstFrom, cb.length - srcFrom);
            byte[] input = new byte[skip + (int) (stop - begin)];
            System.arraycopy(result, (int) (begin - start), input, skip, (int) (stop - begin));
            byte[] decrypted = aes(false, key, iv, input, "CTR");
            System.arraycopy(decrypted, skip, result, (int) (begin - start), (int) (stop - begin));
        }
        return result;
    }

    // ============================ 缓存 ============================

    private final Map<String, StreamInfo> streamCache =
            Collections.synchronizedMap(new LinkedHashMap<String, StreamInfo>(8, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, StreamInfo> eldest) {
                    return size() > 4;
                }
            });

    private final Map<String, Prepared> preparedCache =
            Collections.synchronizedMap(new LinkedHashMap<String, Prepared>(4, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, Prepared> eldest) {
                    return size() > 8;
                }
            });

    private Prepared prepareFor(String vid, StreamInfo si, long total, byte[] firstBody) {
        synchronized (preparedCache) {
            Prepared hit = preparedCache.get(vid);
            if (hit != null) return hit;
        }
        byte[] headerBody = firstBody;
        if (headerBody == null || headerBody.length == 0) {
            long[] totalRef = {total};
            headerBody = range(si.url, 0, Math.max(HEADER_HINT, total) - 1L, totalRef);
        }
        Prepared p = prepare(headerBody, si.key);
        synchronized (preparedCache) {
            preparedCache.put(vid, p);
        }
        return p;
    }

    // ============================ Spider 协议 ============================

    private static String pageData(List<Series> items, int page, int lastPage, boolean hasMore) {
        try {
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            for (Series s : items) {
                JSONObject v = new JSONObject();
                v.put("vod_id", s.id);
                v.put("vod_name", s.name);
                v.put("vod_pic", s.cover);
                v.put("vod_remarks", s.badge);
                v.put("vod_actor", s.tags);
                v.put("vod_content", s.intro);
                list.put(v);
            }
            result.put("list", list);
            result.put("page", page);
            result.put("pagecount", hasMore ? Math.max(page, lastPage) : page);
            result.put("limit", 20);
            result.put("total", 0);
            return result.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();
            classes.put(new JSONObject().put("type_id", "hot").put("type_name", "热播短剧"));
            classes.put(new JSONObject().put("type_id", "rank").put("type_name", "漫剧榜"));
            result.put("class", classes);
            return result.toString();
        } catch (Exception e) {
            Log.e(TAG, "homeContent error: " + e.getMessage());
            return "";
        }
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        int page = 1;
        try {
            page = Math.max(1, Integer.parseInt(pg == null ? "1" : pg.trim()));
        } catch (Exception ignore) {
        }
        try {
            Page p = "rank".equals(tid) ? rankPage(page) : home(page);
            Log.e(TAG, "categoryContent tid=" + tid + " page=" + page + " items=" + p.items.size() + " more=" + p.hasMore);
            return pageData(p.items, page, p.lastPage, p.hasMore);
        } catch (Exception e) {
            Log.e(TAG, "categoryContent FAIL tid=" + tid + " page=" + page + " : " + e.getMessage());
            return pageData(new ArrayList<Series>(), page, page, false);
        }
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        int page = 1;
        try {
            page = Math.max(1, Integer.parseInt(pg == null ? "1" : pg.trim()));
        } catch (Exception ignore) {
        }
        String keyword = key == null ? "" : key.trim();
        if (keyword.isEmpty() || keyword.length() > 80) {
            Log.e(TAG, "searchContent skip empty/long keyword");
            return pageData(new ArrayList<Series>(), page, page, false);
        }
        try {
            Page p = searchPage(keyword, page);
            Log.e(TAG, "searchContent kw=" + keyword + " page=" + page + " items=" + p.items.size());
            return pageData(p.items, page, p.lastPage, p.hasMore);
        } catch (Exception e) {
            Log.e(TAG, "searchContent FAIL kw=" + keyword + " : " + e.getMessage());
            return pageData(new ArrayList<Series>(), page, page, false);
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String id = ids.get(0);
            // 单次抓取：详情元数据与分集 vid 同源（此前抓两次，弱网下易触发壳 30s 超时）
            JSONObject data = router(SITE + "/detail?series_id=" + id);
            JSONObject sd = seriesDetailOf(data);
            if (sd == null) throw new RuntimeException("seriesDetail missing (loaderData keys: " + keysOf(data) + ")");
            List<String> vids = vidsOf(sd);
            if (vids.isEmpty() && sd.optJSONArray("episodeVids") != null) {
                JSONArray ev = sd.optJSONArray("episodeVids");
                for (int i = 0; i < ev.length(); i++) {
                    String v = ev.optString(i, "");
                    if (!v.isEmpty()) vids.add(v);
                }
            }
            if (vids.isEmpty()) throw new RuntimeException("vid_list missing");

            int count = sd.optInt("episode_cnt", sd.optInt("series_episode_cnt", 0));
            if (count == 0) {
                JSONObject info = sd.optJSONObject("series_episode_info");
                if (info != null) count = info.optInt("episode_cnt", 0);
            }
            String badge = sd.optString("episode_right_text", "");
            if (badge.isEmpty() && count > 0) badge = "全 " + count + " 集";
            Series s = new Series(id, sd.optString("series_title", sd.optString("series_name", "")),
                    sd.optString("series_cover", ""), sd.optString("series_intro", ""), badge, "");

            StringBuilder play = new StringBuilder();
            for (int i = 0; i < vids.size(); i++) {
                if (i > 0) play.append('#');
                // 分集 id 必须是纯数字 vid：壳会把 vod_play_url 里的 id 原样传给 playerContent，
                // proxy:// 形式会让 stream() 拿完整 URL 去请求 preload 被风控软拒（200 空体）
                play.append("第").append(String.format("%02d", i + 1)).append("集$").append(vids.get(i));
            }

            JSONObject v = new JSONObject();
            v.put("vod_id", id);
            v.put("vod_name", s.name);
            v.put("vod_pic", s.cover);
            v.put("vod_content", s.intro);
            v.put("vod_remarks", s.badge);
            v.put("type_id", "hot");
            v.put("type_name", "短剧");
            v.put("vod_play_from", "红果短剧");
            v.put("vod_play_url", play.toString());
            // 壳侧 AbsJson.toAbsXml() 只解析 MacCMS 格式 {"list":[...]}，顶层裸 vod 对象会 NPE
            JSONObject root = new JSONObject();
            root.put("code", 1);
            JSONArray list = new JSONArray();
            list.put(v);
            root.put("list", list);
            Log.e(TAG, "detailContent id=" + id + " vids=" + vids.size());
            return root.toString();
        } catch (Exception e) {
            Log.e(TAG, "detailContent FAIL id=" + ids + " : " + e.getMessage());
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        long t0 = System.currentTimeMillis();
        try {
            StreamInfo si = stream(id);
            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("header", new JSONObject());
            result.put("flag", si.quality);
            result.put("url", "proxy://do=play&siteKey="
                    + (siteKey == null || siteKey.isEmpty() ? "hongguo" : siteKey)
                    + "&vid=" + id);
            Log.e(TAG, "playerContent id=" + id + " cost=" + (System.currentTimeMillis() - t0) + "ms quality=" + si.quality);
            return result.toString();
        } catch (Exception e) {
            Log.e(TAG, "playerContent FAIL id=" + id + " cost=" + (System.currentTimeMillis() - t0) + "ms : " + e.getMessage());
            fileLog("playerContent FAIL id=" + id + " cost=" + (System.currentTimeMillis() - t0) + "ms : " + e);
            return "";
        }
    }

    /** 本地代理：__range 分段 → CENC 解密 → 206 回吐（与壳 getProxy 契约一致）。 */
    @Override
    public Object[] proxy(Map<String, String> params) {
        try {
            if (!"play".equals(params.get("do"))) return null;
            String vid = params.get("vid");
            if (vid == null || !vid.matches("\\d+")) {
                Log.e(TAG, "proxy invalid vid=" + vid);
                return null;
            }
            String range = params.get("__range");
            if (range == null || range.isEmpty()) range = params.get("range");
            if (range == null || range.isEmpty()) range = "bytes=0-";
            Matcher m = Pattern.compile("bytes=(\\d+)-(\\d*)").matcher(range);
            if (!m.find()) {
                Log.e(TAG, "proxy bad range=" + range);
                return null;
            }
            long start = Long.parseLong(m.group(1));

            StreamInfo si = stream(vid);
            long[] totalRef = {0};
            long wantEnd = start + SEG_SIZE - 1;
            byte[] body = range(si.url, start, wantEnd, totalRef);
            long total = totalRef[0];
            if (total <= 0) total = start + body.length;
            Log.e(TAG, "proxy vid=" + vid + " start=" + start + " got=" + body.length + " total=" + total);

            Prepared prepared = si.key == null
                    ? new Prepared(new byte[0], new ArrayList<Sample>())
                    : prepareFor(vid, si, total, start == 0 ? body : null);
            byte[] decrypted = decrypt(body, start, si.key, prepared);

            if (decrypted.length == 0) {
                Map<String, String> errHeaders = new LinkedHashMap<>();
                errHeaders.put("Content-Length", "0");
                return new Object[]{404, "text/plain", new ByteArrayInputStream(new byte[0]), errHeaders};
            }
            long realEnd = start + decrypted.length - 1;
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Range", "bytes " + start + "-" + realEnd + "/" + total);
            headers.put("Accept-Ranges", "bytes");
            return new Object[]{206, "video/mp4", new ByteArrayInputStream(decrypted), headers};
        } catch (Exception e) {
            Log.e(TAG, "proxy FAIL vid=" + params.get("vid") + " : " + e.getMessage());
            fileLog("proxy FAIL vid=" + params.get("vid") + " : " + e);
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Length", "0");
            return new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0]), headers};
        }
    }
}
