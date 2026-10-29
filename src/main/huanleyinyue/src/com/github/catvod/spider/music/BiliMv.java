package com.github.catvod.spider.music;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 哔哩 MV 兜底搜索：站内搜「歌名 MV」→ 取视频 bvid → playurl 免登录直链（durl mp4）。
 * B 站 CDN 校验 Referer——直链须经 HuanleSpiderBase.proxyLocal 加 Referer 转发后播放。
 * 搜索需 wbi 签名（w_rid/wts）+ buvid3 cookie：nav 接口取 img/sub key → mixinKeyEncTab 置换。
 */
public class BiliMv {

    private static final String UA =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36";
    private static final String REFERER = "https://www.bilibili.com/";
    /** wbi 混淆置换表（B 站公开常量）。 */
    private static final int[] MIXIN_TAB = {
            46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49,
            33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40, 61,
            26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11, 36,
            20, 34, 44, 52};

    private static String buvid3 = "";
    private static String mixinKey = "";
    private static long keyAt = 0;

    private BiliMv() {
    }

    /** 搜索「keyword」返回第一个视频的播放直链（原始 B 站 CDN 链接，须走代理加 Referer）；失败返回 ""。 */
    public static String firstVideoUrl(String keyword) {
        try {
            ensureSession();
            String bvid = searchFirst(keyword);
            if (bvid == null || bvid.isEmpty()) return "";
            String cid = viewCid(bvid);
            if (cid.isEmpty()) return "";
            return playUrl(bvid, cid);
        } catch (Throwable t) {
            MusicCore.fileLog("biliMv FAIL kw=[" + keyword + "] : " + t);
            return "";
        }
    }

    // ==================== 会话与 wbi ====================

    private static void ensureSession() throws Exception {
        if (!buvid3.isEmpty() && !mixinKey.isEmpty() && System.currentTimeMillis() - keyAt < 3600_000L) return;
        // buvid3：首页 Set-Cookie
        HttpURLConnection conn = (HttpURLConnection) new URL(REFERER).openConnection();
        conn.setConnectTimeout(8000);
        conn.setReadTimeout(8000);
        conn.setRequestProperty("User-Agent", UA);
        String sc = conn.getHeaderField("Set-Cookie");
        conn.disconnect();
        if (sc != null) {
            Matcher m = Pattern.compile("buvid3=([^;]+)").matcher(sc);
            if (m.find()) buvid3 = m.group(1);
        }
        // wbi key：nav 接口
        JSONObject nav = new JSONObject(httpGet("https://api.bilibili.com/x/web-interface/nav"));
        JSONObject img = nav.getJSONObject("data").getJSONObject("wbi_img");
        String a = fileNameOf(img.optString("img_url"));
        String b = fileNameOf(img.optString("sub_url"));
        StringBuilder sb = new StringBuilder();
        String mix = a + b;
        for (int i = 0; i < 32; i++) sb.append(mix.charAt(MIXIN_TAB[i]));
        mixinKey = sb.toString();
        keyAt = System.currentTimeMillis();
    }

    private static String fileNameOf(String url) {
        if (url == null || url.isEmpty()) return "";
        int slash = url.lastIndexOf('/');
        String name = slash >= 0 ? url.substring(slash + 1) : url;
        int dot = name.indexOf('.');
        return dot > 0 ? name.substring(0, dot) : name;
    }

    private static String searchFirst(String keyword) throws Exception {
        Map<String, String> q = new TreeMap<>();
        q.put("keyword", keyword);
        q.put("page", "1");
        q.put("search_type", "video");
        JSONObject j = new JSONObject(httpGet("https://api.bilibili.com/x/web-interface/wbi/search/type" + sign(q)));
        JSONArray results = j.getJSONObject("data").optJSONArray("result");
        if (results == null) return "";
        for (int i = 0; i < results.length(); i++) {
            JSONObject item = results.optJSONObject(i);
            if (item == null) continue;
            String bvid = item.optString("bvid", "");
            if (!bvid.isEmpty()) return bvid;
        }
        return "";
    }

    private static String viewCid(String bvid) throws Exception {
        JSONObject j = new JSONObject(httpGet(
                "https://api.bilibili.com/x/web-interface/view?bvid=" + URLEncoder.encode(bvid, "UTF-8")));
        return String.valueOf(j.getJSONObject("data").optLong("cid", 0));
    }

    private static String playUrl(String bvid, String cid) throws Exception {
        Map<String, String> q = new TreeMap<>();
        q.put("bvid", bvid);
        q.put("cid", cid);
        q.put("fnval", "1");
        q.put("platform", "html5");
        q.put("qn", "32");
        JSONObject j = new JSONObject(httpGet(
                "https://api.bilibili.com/x/player/playurl" + signPlain(q)));
        JSONObject data = j.getJSONObject("data");
        JSONArray durl = data.optJSONArray("durl");
        if (durl != null && durl.length() > 0) {
            return durl.getJSONObject(0).optString("url", "");
        }
        // dash 形态：取第一个 video base_url
        JSONObject dash = data.optJSONObject("dash");
        if (dash != null) {
            JSONArray videos = dash.optJSONArray("video");
            if (videos != null && videos.length() > 0) {
                return videos.getJSONObject(0).optString("base_url", "");
            }
        }
        return "";
    }

    /** wbi 签名：参数按 key 排序 → w_rid=md5(query+mixinKey)。 */
    private static String sign(Map<String, String> q) throws Exception {
        ensureSession();
        q.put("wts", String.valueOf(System.currentTimeMillis() / 1000));
        StringBuilder qs = new StringBuilder();
        for (Map.Entry<String, String> e : q.entrySet()) {
            String v = e.getValue().replaceAll("[!'()*]", "");
            qs.append('&').append(url(e.getKey())).append('=').append(url(v));
        }
        String query = qs.substring(1);
        return "?" + query + "&w_rid=" + md5(query + mixinKey);
    }

    /** playurl 免 wbi（老接口），buvid3 cookie 必带。 */
    private static String signPlain(Map<String, String> q) throws Exception {
        StringBuilder qs = new StringBuilder();
        for (Map.Entry<String, String> e : q.entrySet()) {
            qs.append('&').append(url(e.getKey())).append('=').append(url(e.getValue()));
        }
        return "?" + qs.substring(1);
    }

    private static String url(String s) throws Exception {
        return URLEncoder.encode(s, "UTF-8").replace("+", "%20");
    }

    private static String md5(String s) throws Exception {
        byte[] d = MessageDigest.getInstance("MD5").digest(s.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (byte b : d) sb.append(String.format("%02x", b));
        return sb.toString();
    }

    // ==================== HTTP ====================

    private static String httpGet(String url) throws Exception {
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setConnectTimeout(8000);
        conn.setReadTimeout(12000);
        conn.setRequestProperty("User-Agent", UA);
        conn.setRequestProperty("Referer", REFERER);
        if (!buvid3.isEmpty()) conn.setRequestProperty("Cookie", "buvid3=" + buvid3);
        int code = conn.getResponseCode();
        InputStream in = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[16384];
        int n;
        while (in != null && (n = in.read(buf)) > 0) out.write(buf, 0, n);
        if (in != null) in.close();
        conn.disconnect();
        return new String(out.toByteArray(), StandardCharsets.UTF_8);
    }

    /** 供代理转发时复用 UA/Referer 常量。 */
    public static String ua() {
        return UA;
    }

    public static String referer() {
        return REFERER;
    }

    /** 抑制未用告警（List 备用）。 */
    @SuppressWarnings("unused")
    private static void touch(List<String> unused) {
    }
}
