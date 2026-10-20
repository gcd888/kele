package com.github.catvod.spider;

import android.util.Base64;

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
import java.util.LinkedHashSet;
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
 *
 * 数据面：
 *  - 分类/详情/搜索/榜单：红果官网 SSR 页面（无需签名）；
 *  - 取流：App preload 接口（仅需 legacyGorgon 简签名，MD5 基）；
 *  - 解密：spade_a 密钥派生 + spade 解密（SHA512 + AES-128-CBC）+ CENC 逐样本 AES-CTR；
 *  - 播放：经壳本地代理 proxy() 回吐解密后的分段字节（206）。
 */
public class Hongguo extends Spider {

    private static final String SITE = "https://hongguo.dakandian.com";
    private static final String PRELOAD_URL =
            "https://hongguo.dakandian.com/hongguo/apiv2/detail/v2/preload/batch";
    private static final String VIDEO_UA =
            "com.coloros.gallery3d/1.2.0 (zh-CN, NEWSIFENG)" +
            " Mozilla/5.0 (Linux; Android 16; 25053RT47C Build/BP3A.250905.014) " +
            "AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/141.0.7390.97 Mobile Safari/537.36";
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

    private static String md5HexUpper(byte[] data) {
        try {
            return hexUpper(MessageDigest.getInstance("MD5").digest(data));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String hexUpper(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) sb.append(String.format("%02X", b & 255));
        return sb.toString();
    }

    private static byte[] sha512(byte[] data) {
        try {
            return MessageDigest.getInstance("SHA-512").digest(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ============================ 签名：legacyGorgon（MD5 基，v1 足够） ============================

    private static String legacyGorgon(String query, byte[] body, int ts) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] input = concat(
                    concat(Arrays.copyOf(md.digest(query.getBytes(StandardCharsets.UTF_8)), 4),
                            Arrays.copyOf(md.digest(body == null ? new byte[0] : body), 4)),
                    concat(concat(new byte[4], new byte[]{0, 6, 11, 28}),
                            new byte[]{(byte) (ts >>> 24), (byte) (ts >>> 16), (byte) (ts >>> 8), (byte) ts}));
            byte[] key = hexOf("44b9b9d9a4aef9fca493aa757ca3c2c4a496938f");
            byte[] out = new byte[input.length];
            for (int i = 0; i < input.length; i++) out[i] = (byte) (u(input[i]) ^ u(key[i]));
            for (int i = 0; i < out.length; i++) {
                int value = ((u(out[i]) >>> 4) | (u(out[i]) << 4)) & 255;
                int next = u(out[(i + 1) % out.length]);
                int reversed = Integer.reverse((next ^ value) & 255) >>> 24;
                out[i] = (byte) (((reversed ^ 20) ^ 0xFF) & 255);
            }
            return hexOf(concat(hexOf("8404401c0000"), out));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String encode(Map<String, Object> values) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            if (sb.length() > 0) sb.append('&');
            String v = String.valueOf(entry.getValue());
            v = java.net.URLEncoder.encode(v, StandardCharsets.UTF_8)
                    .replace("+", "%20").replace("%7E", "~");
            sb.append(entry.getKey()).append('=').append(v);
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
            return new String(out.toByteArray(), StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    private static String text(String url) {
        return text(url, "GET", null, null);
    }

    /** 取 CDN 分段字节，返回 {body, total}。 */
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
            throw new RuntimeException(e);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    // ============================ 网页 SSR 解析 ============================

    private static JSONObject router(String url) {
        try {
            return extractRouter(text(url)).getJSONObject("loaderData");
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /** 从 SSR 页面里取出内嵌 _ROUTER_DATA JSON（大括号配对扫描，兼容字符串与转义）。 */
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
            } else if (c == '{') {
                depth++;
            } else if (c == '}') {
                depth--;
                if (depth == 0) {
                    try {
                        return new JSONObject(html.substring(at, i + 1));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        throw new RuntimeException("router data unbalanced");
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

        Page(List<Series> items, int lastPage) {
            this.items = items;
            this.lastPage = lastPage;
        }
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
            JSONArray tags = o.optJSONArray("tags");
            if (tags == null) tags = o.optJSONArray("category_list");
            StringBuilder tag = new StringBuilder();
            if (tags != null) {
                for (int t = 0; t < Math.min(tags.length(), 5); t++) {
                    String s = tags.optString(t, "");
                    if (!s.isEmpty()) {
                        if (tag.length() > 0) tag.append(" · ");
                        tag.append(s);
                    }
                }
            }
            String id = o.optString("series_id", "");
            String name = o.optString("series_name", "");
            if (name.isEmpty()) name = o.optString("series_title", "");
            if (name.isEmpty()) name = item.optString("name", "");
            if (id.isEmpty() || name.isEmpty()) continue;
            String cover = o.optString("series_cover", "");
            String intro = o.optString("series_intro", "");
            String badge = o.optString("episode_right_text", "");
            if (badge.isEmpty() && count > 0) badge = "全 " + count + " 集";
            out.add(new Series(id, name, cover, intro, badge, tag.toString()));
        }
        return out;
    }

    /** 分类页（热播）。tab=1 热播。 */
    private Page home(int page) {
        String url = SITE + "/category?tab=1&sort_type=1" + (page > 1 ? "&page=" + page : "");
        JSONObject section = router(url);
        JSONObject s = section.optJSONObject("category_page");
        if (s == null) s = section.optJSONObject("category_$");
        if (s == null) throw new RuntimeException("category page missing");
        JSONArray rows = s.optJSONArray("recommendList");
        if (rows == null) {
            JSONObject cd = s.optJSONObject("categoryData");
            rows = cd == null ? null : cd.optJSONArray("recommendList");
        }
        List<Series> items = cards(rows);
        int last = 100;
        JSONObject pag = s.optJSONObject("pagination");
        if (pag != null) last = Math.max(1, Math.min(100, pag.optInt("totalPages", 100)));
        return new Page(items, last);
    }

    /** 搜索页。 */
    private Page searchPage(String keyword, int page) {
        String url = SITE + "/search/" + enc(keyword) + "?page=" + page;
        JSONObject data = router(url);
        JSONObject s = data.optJSONObject("search_(" + keyword + ")/page");
        if (s == null) s = data.optJSONObject("search_page");
        if (s == null) throw new RuntimeException("search page missing");
        List<Series> items = cards(s.optJSONArray("searchList"));
        return new Page(items, 100);
    }

    /** 漫剧榜（rank 页，从 <script data-fn-...> 里取数据）。 */
    private Page rankPage(int page) {
        String html = text(SITE + "/rank/hot-comic-drama?page=" + page);
        JSONObject payload = rankPayload(html, "rank_hot-comic-drama/page");
        if (payload == null) throw new RuntimeException("rank payload missing");
        JSONArray rl = payload.optJSONArray("rankList");
        if (rl == null) throw new RuntimeException("rankList missing");
        List<Series> items = new ArrayList<>();
        for (int i = 0; i < rl.length(); i++) {
            JSONObject it = rl.optJSONObject(i);
            if (it == null) continue;
            String id = it.optString("seriesId", "");
            if (id.isEmpty()) id = it.optString("id", "");
            String name = it.optString("title", "");
            if (id.isEmpty() || name.isEmpty()) continue;
            int count = it.optInt("episodeCount", 0);
            JSONArray vids = it.optJSONArray("episodeVids");
            if (count == 0 && vids != null) count = vids.length();
            JSONArray tags = it.optJSONArray("tags");
            StringBuilder tag = new StringBuilder();
            if (tags != null) {
                for (int t = 0; t < Math.min(tags.length(), 5); t++) {
                    String s = tags.optString(t, "");
                    if (!s.isEmpty()) {
                        if (tag.length() > 0) tag.append(" · ");
                        tag.append(s);
                    }
                }
            }
            String badge = count > 0 ? "全 " + count + " 集" : "";
            items.add(new Series(id, name, it.optString("cover", ""), it.optString("description", ""), badge, tag.toString()));
        }
        int last = 100;
        JSONObject pag = payload.optJSONObject("pagination");
        if (pag != null) last = Math.max(1, Math.min(100, pag.optInt("totalPages", 100)));
        return new Page(items, last);
    }

    /** rank 页数据在 <script data-fn-name="r" data-fn-args="..."> 属性里。 */
    private static JSONObject rankPayload(String html, String route) {
        Pattern p = Pattern.compile("data-fn-name=([\"'])([^\"']*)\\1\\s+data-fn-args=([\"'])(.*?)\\3", Pattern.DOTALL);
        Matcher m = p.matcher(html);
        while (m.find()) {
            if (!"r".equals(m.group(2))) continue;
            String argsRaw = htmlDecode(m.group(4)).trim();
            try {
                Object parsed = new JSONTokener(argsRaw).nextValue();
                if (!(parsed instanceof JSONArray)) continue;
                JSONArray args = (JSONArray) parsed;
                if (args.length() >= 3 && route.equals(args.optString(0)) && "content".equals(args.optString(1))) {
                    Object third = args.get(2);
                    if (third instanceof JSONObject) return (JSONObject) third;
                    if (third instanceof String && ((String) third).trim().startsWith("{")) {
                        return new JSONObject((String) third);
                    }
                }
            } catch (Exception ignore) {
            }
        }
        return null;
    }

    private static String htmlDecode(String s) {
        return s.replace("&quot;", "\"").replace("&#39;", "'")
                .replace("&lt;", "<").replace("&gt;", ">")
                .replace("&amp;", "&");
    }

    private static String enc(String v) {
        return java.net.URLEncoder.encode(v, StandardCharsets.UTF_8).replace("+", "%20");
    }

    /** 详情页 → 分集 vid 列表。 */
    private Series detail(String id) {
        JSONObject data = router(SITE + "/detail?series_id=" + id);
        JSONObject dp = data.optJSONObject("detail_page");
        if (dp == null) throw new RuntimeException("detail page missing");
        JSONObject sd = dp.optJSONObject("seriesDetail");
        if (sd == null) throw new RuntimeException("seriesDetail missing");
        int count = sd.optInt("series_episode_cnt", 0);
        if (count == 0) {
            JSONObject info = sd.optJSONObject("series_episode_info");
            if (info != null) count = info.optInt("episode_cnt", 0);
        }
        String badge = sd.optString("episode_right_text", "");
        if (badge.isEmpty() && count > 0) badge = "全 " + count + " 集";
        return new Series(id, sd.optString("series_title", ""), sd.optString("series_cover", ""),
                sd.optString("series_intro", ""), badge, "");
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

    // ============================ 取流（preload + spade 解密） ============================

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

    private static final Random RNG = new Random();

    private static String streamDeviceId() {
        return String.valueOf(1000000000000000000L + (long) (RNG.nextDouble() * 8000000000000000000L));
    }

    private StreamInfo stream(String vid) {
        synchronized (streamCache) {
            StreamInfo hit = streamCache.get(vid);
            if (hit != null) return hit;
        }
        long now = System.currentTimeMillis();
        int ts = (int) (now / 1000);

        JSONObject biz = new JSONObject();
        try {
            biz.put("detail_page_version", 0);
            biz.put("group_id", "");
            biz.put("device_id", streamDeviceId());
            biz.put("aid", 8662);
            biz.put("app_type", 0);
            biz.put("novel_flag", false);
            biz.put("album_type", 0);
            biz.put("vid", vid);
            biz.put("iid", streamDeviceId());
            biz.put("return_api_type", 2);
            biz.put("video_cache_ttl", 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        JSONObject payload = new JSONObject();
        try {
            JSONObject map = new JSONObject();
            map.put("1004", new JSONArray().put(vid));
            payload.put("mixed_video_id_map", map);
            payload.put("biz_param", biz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        byte[] body = payload.toString().getBytes(StandardCharsets.UTF_8);

        Map<String, Object> values = new LinkedHashMap<>();
        values.put("aid", 8662);
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
        values.put("device_id", streamDeviceId());
        values.put("iid", streamDeviceId());
        values.put("_rticket", String.valueOf(now));
        String query = encode(values);

        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("User-Agent", VIDEO_UA);
        headers.put("Accept", "application/json");
        headers.put("x-xs-from-web", "0");
        headers.put("sdk-version", "2");
        headers.put("x-khronos", String.valueOf(ts));
        headers.put("x-gorgon", legacyGorgon(query, body, ts));
        headers.put("x-ss-req-ticket", String.valueOf(now));
        headers.put("Content-Type", "application/json; charset=UTF-8");
        headers.put("x-ss-stub", md5HexUpper(body));

        String respText = text(PRELOAD_URL + "?" + query, "POST", body, headers);
        JSONObject resp;
        try {
            resp = new JSONObject(respText);
        } catch (Exception e) {
            throw new RuntimeException("preload bad json");
        }
        int code = resp.optInt("Code", resp.optInt("code", 0));
        if (code != 0) throw new RuntimeException("preload code " + code);
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
                throw new RuntimeException("video_model bad json");
            }
        } else {
            throw new RuntimeException("video_model missing");
        }

        // fallback_api：主响应缺流时再拉兜底
        Object fb = entry.opt("fallback_api");
        if (fb != null) {
            String fallbackUrl = null;
            if (fb instanceof JSONObject) fallbackUrl = ((JSONObject) fb).optString("fallback_api", "");
            else if (fb instanceof JSONArray) fallbackUrl = ((JSONArray) fb).optString(0, "");
            else if (fb instanceof String) fallbackUrl = (String) fb;
            if (fallbackUrl != null && fallbackUrl.trim().startsWith("{")) {
                try {
                    fallbackUrl = new JSONObject(fallbackUrl.trim()).optString("fallback_api", "");
                } catch (Exception ignore) {
                }
            }
            if (fallbackUrl != null && fallbackUrl.startsWith("https://")) {
                try {
                    JSONObject fbResp = new JSONObject(text(fallbackUrl));
                    JSONObject fbData = fbResp.optJSONObject("video_info");
                    fbData = fbData == null ? null : fbData.optJSONObject("data");
                    if (fbData != null && fbData.length() > 0) videoModel = fbData;
                } catch (Exception ignore) {
                }
            }
        }

        // 选清晰度：排除 bytevc2/bvc2 编码，优先 <=1080P 最高档
        List<JSONObject> candidates = new ArrayList<>();
        for (Iterator<String> it = videoModel.keys(); it.hasNext(); ) {
            JSONObject q = videoModel.optJSONObject(it.next());
            if (q == null) continue;
            if (q.optString("codec_type", "").contains("bytevc2")
                    || q.optString("codec_type", "").contains("bvc2")) continue;
            if (q.optString("main_url", "").isEmpty()) continue;
            candidates.add(q);
        }
        if (candidates.isEmpty()) {
            for (Iterator<String> it = videoModel.keys(); it.hasNext(); ) {
                JSONObject q = videoModel.optJSONObject(it.next());
                if (q != null && !q.optString("main_url", "").isEmpty()) candidates.add(q);
            }
        }
        if (candidates.isEmpty()) throw new RuntimeException("no quality stream");
        Collections.sort(candidates, new Comparator<JSONObject>() {
            @Override
            public int compare(JSONObject a, JSONObject b) {
                return qualityNumber(qualityText(b)) - qualityNumber(qualityText(a));
            }
        });
        JSONObject picked = candidates.get(0);
        for (JSONObject q : candidates) {
            if (qualityNumber(qualityText(q)) <= 1080) {
                picked = q;
                break;
            }
        }
        int qn = qualityNumber(qualityText(picked));
        String quality = qn > 0 ? (qn > 1080 ? qn + "P（兼容资源）" : qn + "P") : "自动";

        String encUrl = cleanUrl(picked.optString("main_url"));
        byte[] streamKey = null;
        String seed = picked.optString("key_seed", "");
        if (!seed.isEmpty()) {
            encUrl = decryptUrl(encUrl, b64(seed));
        }
        String spade = picked.optString("spade_a", "");
        if (!spade.isEmpty()) {
            streamKey = deriveKey(spade);
        }
        StreamInfo info = new StreamInfo(encUrl, streamKey, quality);
        synchronized (streamCache) {
            streamCache.put(vid, info);
        }
        return info;
    }

    private static String qualityText(JSONObject q) {
        String v = q.optString("quality_desc", "");
        if (v.isEmpty()) v = String.valueOf(q.optInt("height", 0));
        if ("0".equals(v) || v.isEmpty()) v = String.valueOf(q.optInt("vheight", 0));
        if ("0".equals(v) || v.isEmpty()) v = String.valueOf(q.optInt("quality", 0));
        if ("0".equals(v) || v.isEmpty()) v = q.optString("key", "");
        return v;
    }

    /** spade 解密：SHA512(seed)+常量 → AES-128-CBC。 */
    private static final String SPADE_CONST =
            "4dd48a81c35fd6ffbf37a5a83b2859b9242575dede3c422bef9d0117cb542c21c6ea19b1b6c437f99c5e6bc5dd510091a9c34db9fdd123fa5c4e6f58b6ba1a0d3b6d386092c3d3b2e19ba2c6e56c10a9b41a9b28b9b06a7c8e58f4d7fbf5b5a55c2b4d3b0b7e2b3f8c0d1a4a5a0b5b6b7b8c1c2c3c4c5c6c7c8c9cacbcdcecf0d1d2d3d4d5d6d7d8d9dadbdcdddedfe0e1e2e3e4e5e6e7e8e9eaebecedeeef";

    private static String decryptUrl(String value, byte[] seed) {
        byte[] raw = b64(value);
        if (raw.length < 20) throw new RuntimeException("url too short");
        if (u(raw[0]) != 0xa8 || u(raw[2]) != 1 || u(raw[3]) != 0) {
            throw new RuntimeException("unsupported url envelope");
        }
        byte[] h = sha512(concat(sha512(seed), hexOf(SPADE_CONST)));
        int n = (raw.length - 4) / 16 * 16;
        byte[] plain = aes(false, Arrays.copyOfRange(h, 0, 16), Arrays.copyOfRange(h, 16, 32),
                Arrays.copyOfRange(raw, 4, 4 + n), "CBC");
        int end = plain.length;
        int padding = u(plain[plain.length - 1]);
        if (padding >= 1 && padding <= 16 && padding <= end) end -= padding;
        while (end > 0 && u(plain[end - 1]) == 0) end--;
        return new String(plain, 0, end, StandardCharsets.UTF_8);
    }

    /** spade_a 密钥派生。 */
    private static byte[] deriveKey(String value) {
        byte[] raw = b64(value);
        if (raw.length < 3) throw new RuntimeException("key too short");
        int length = Math.min(raw.length - (u(raw[0]) ^ u(raw[1]) ^ u(raw[2])) + 47, raw.length - 1);
        if (length < 33) throw new RuntimeException("key length");
        byte[] work = Arrays.copyOfRange(raw, 1, 1 + length);
        int a = 85, b = 246;
        for (int i = 0; i < work.length; i++) {
            int old = u(work[i]);
            int previous = (i & 1) != 0 ? a : b;
            if ((i & 1) != 0) a = old;
            else b = old;
            work[i] = (byte) (-21 - Integer.bitCount(i) + (previous ^ old));
        }
        byte[] ascii = Arrays.copyOfRange(work, 1, 33);
        return hexOf(new String(ascii, StandardCharsets.ISO_8859_1));
    }

    private static byte[] aes(boolean encrypt, byte[] key, byte[] iv, byte[] data, String mode) {
        try {
            Cipher cipher = Cipher.getInstance("AES/" + mode + "/NoPadding");
            cipher.init(encrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE,
                    new SecretKeySpec(key, "AES"),
                    new IvParameterSpec(iv));
            return cipher.doFinal(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ============================ MP4/CENC ============================

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

    private static Box find(byte[] d, String type, int at, int limit) {
        while (at + 8 <= limit) {
            if (d[at + 4] == type.charAt(0)) {
                Box b = box(d, at, limit);
                if (b != null && type.equals(b.type)) return b;
            }
            at++;
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
        if (at + 4 > limit) throw new RuntimeException("count out of range");
        long n = u32(d, at);
        if (n > 200000) throw new RuntimeException("count too large");
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
        if (key == null) return new Prepared(data, new ArrayList<Sample>());
        byte[] header = data.clone();
        int moovSize = (int) u32(data, 0);
        Box moov = box(data, moovSize, data.length);
        if (moov == null || !"moov".equals(moov.type)) throw new RuntimeException("moov missing");

        List<Sample> samples = new ArrayList<>();
        Box track = null;
        while ((track = find(data, "trak", track == null ? moov.body : track.end, moov.end)) != null) {
            Box stbl = find(data, "stbl", track.start, track.end);
            if (stbl == null) continue;
            Box saiz = find(data, "saiz", stbl.body, stbl.end);
            Box saio = find(data, "saio", stbl.body, stbl.end);
            Box stsz = find(data, "stsz", stbl.body, stbl.end);
            Box stsc = find(data, "stsc", stbl.body, stbl.end);
            Box stco = find(data, "stco", stbl.body, stbl.end);
            if (stco == null) stco = find(data, "co64", stbl.body, stbl.end);
            if (saiz == null || saio == null || stsz == null || stsc == null || stco == null) continue;

            int n = count(data, stsz.body + 8, stsz.end);
            int defaultSize = (int) u32(data, stsz.body + 4);
            long[] sizes = new long[n];
            for (int i = 0; i < n; i++) {
                sizes[i] = defaultSize == 0 ? u32(data, stsz.body + 12 + i * 4) : defaultSize;
            }

            int chunkCount = count(data, stco.body + 4, stco.end);
            int width = "co64".equals(stco.type) ? 8 : 4;
            long[] offsets = new long[chunkCount];
            for (int i = 0; i < chunkCount; i++) {
                offsets[i] = width == 8 ? i64(data, stco.body + 8 + i * 8) : u32(data, stco.body + 8 + i * 4);
            }

            int entries = count(data, stsc.body + 4, stsc.end);
            long[] firstChunk = new long[entries];
            long[] samplesPerChunk = new long[entries];
            for (int i = 0; i < entries; i++) {
                firstChunk[i] = u32(data, stsc.body + 8 + i * 12);
                samplesPerChunk[i] = u32(data, stsc.body + 12 + i * 12);
            }

            int sizeBase = saiz.body + 4 + (((i32(data, saio.body) & 1) != 0) ? 8 : 0);
            int auxDefault = u(data[sizeBase]);
            int auxCount = count(data, sizeBase + 1, saiz.end);
            if (auxCount != n) throw new RuntimeException("saiz mismatch");
            int[] auxSizes = new int[auxCount];
            for (int i = 0; i < auxCount; i++) auxSizes[i] = u(data[sizeBase + 1 + i]);

            int offsetBase = saio.body + 4 + (((i32(data, saio.body) & 1) != 0) ? 8 : 0);
            int offsetWidth = u(data[saio.body]) == 1 ? 8 : 4;
            if (count(data, offsetBase, saio.end) != 1) throw new RuntimeException("saio count");
            int aux = (int) (offsetWidth == 8 ? i64(data, offsetBase + 8) : u32(data, offsetBase + 8));

            int sampleIndex = 0;
            int entry = 0;
            for (int chunk = 0; chunk < chunkCount; chunk++) {
                while (entry + 1 < entries && firstChunk[entry + 1] <= chunk + 1) entry++;
                if (firstChunk[entry] > chunk + 1) throw new RuntimeException("stsc chunk");
                int c = (int) samplesPerChunk[entry];
                if (sampleIndex + c > n) throw new RuntimeException("stsc overflow");
                long offset = offsets[chunk];
                for (int i = 0; i < c && sampleIndex < n; i++, sampleIndex++) {
                    long size = sizes[sampleIndex];
                    int auxSize = auxSizes[sampleIndex];
                    if (auxSize > 0) {
                        byte[] iv = new byte[16];
                        if (auxSize < 8 || aux + auxSize > data.length) throw new RuntimeException("aux range");
                        System.arraycopy(data, aux, iv, 0, 8);
                        long encryptedOffset = 0;
                        if (auxSize > 8) {
                            int subs = ((data[aux + 8] & 255) << 8) | (data[aux + 9] & 255);
                            if (auxSize != 10 + subs * 6) throw new RuntimeException("subsample size");
                            int pos = aux + 10;
                            for (int s = 0; s < subs; s++) {
                                int clear = ((data[pos] & 255) << 8) | (data[pos + 1] & 255);
                                int enc = ((data[pos + 2] & 255) << 24) | ((data[pos + 3] & 255) << 16)
                                        | ((data[pos + 4] & 255) << 8) | (data[pos + 5] & 255);
                                if (enc > 0) {
                                    samples.add(new Sample(offset, offset + clear + enc, encryptedOffset + clear, iv.clone()));
                                }
                                offset += clear + enc;
                                encryptedOffset += clear + enc;
                                pos += 6;
                            }
                        } else {
                            samples.add(new Sample(offset, offset + size, encryptedOffset, iv.clone()));
                            offset += size;
                            encryptedOffset += size;
                        }
                        aux += auxSize;
                    } else {
                        offset += size;
                    }
                }
            }
        }
        if (samples.isEmpty()) throw new RuntimeException("no samples");

        Collections.sort(samples, new Comparator<Sample>() {
            @Override
            public int compare(Sample a, Sample b) {
                return Long.compare(a.start, b.start);
            }
        });
        for (int i = 1; i < samples.size(); i++) {
            if (samples.get(i).start < samples.get(i - 1).end) throw new RuntimeException("sample overlap");
        }

        // moov 改写：encv/enca → frma（恢复原始编码），sinf → free（清零体）
        Box stbl2 = null;
        while ((stbl2 = find(data, "stbl", stbl2 == null ? moov.start : stbl2.end, moov.end)) != null) {
            Box sinf = null;
            while ((sinf = find(data, "sinf", sinf == null ? stbl2.body : sinf.end, stbl2.end)) != null) {
                Box frma = find(data, "frma", sinf.body, sinf.end);
                if (frma == null) throw new RuntimeException("frma missing");
                byte[] original = Arrays.copyOfRange(data, frma.body, frma.body + 4);
                int entryAt = sinf.start - 1;
                while (entryAt >= stbl2.body
                        && !"encv".equals(ascii4(data, entryAt))
                        && !"enca".equals(ascii4(data, entryAt))) {
                    entryAt--;
                }
                if (entryAt < stbl2.body) throw new RuntimeException("encv missing");
                System.arraycopy(original, 0, header, entryAt, 4);
                System.arraycopy("free".getBytes(StandardCharsets.US_ASCII), 0, header, sinf.start + 4, 4);
                for (int i = sinf.body; i < sinf.end; i++) header[i] = 0;
            }
        }

        return new Prepared(header, samples);
    }

    private static final BigInteger ONE_128 = BigInteger.ONE.shiftLeft(128).subtract(BigInteger.ONE);

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
                    .and(ONE_128);
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
            headerBody = range(si.url, 0, Math.min(HEADER_HINT, Math.max(HEADER_HINT, total)) - 1L, totalRef);
        }
        Prepared p;
        try {
            p = prepare(headerBody, si.key);
        } catch (Exception e) {
            // moov 可能超过首段：重抓 8MB 再试
            long[] totalRef = {total};
            p = prepare(range(si.url, 0, Math.min(HEADER_HINT, Math.max(HEADER_HINT, totalRef[0])) - 1L, totalRef), si.key);
        }
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
            return "";
        }
    }

    @Override
    public String homeVideoContent() {
        try {
            Page p = home(1);
            return pageData(p.items, 1, p.lastPage, false);
        } catch (Exception e) {
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
            if ("rank".equals(tid)) {
                Page p = rankPage(page);
                boolean more = !p.items.isEmpty() && page < p.lastPage;
                return pageData(p.items, page, p.lastPage, more);
            }
            Page p = home(page);
            boolean more = !p.items.isEmpty() && page < p.lastPage;
            return pageData(p.items, page, p.lastPage, more);
        } catch (Exception e) {
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
        try {
            Page p = searchPage(key == null ? "" : key.trim(), page);
            boolean more = !p.items.isEmpty() && page < 100;
            return pageData(p.items, page, p.lastPage, more);
        } catch (Exception e) {
            return pageData(new ArrayList<Series>(), page, page, false);
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String id = ids.get(0);
            Series s = detail(id);
            JSONObject data = router(SITE + "/detail?series_id=" + id);
            JSONObject dp = data.optJSONObject("detail_page");
            JSONObject sd = dp == null ? null : dp.optJSONObject("seriesDetail");
            List<String> vids = sd == null ? new ArrayList<String>() : vidsOf(sd);
            if (vids.isEmpty()) throw new RuntimeException("vid_list missing");

            StringBuilder play = new StringBuilder();
            String siteKeySafe = siteKey == null || siteKey.isEmpty() ? "hongguo" : siteKey;
            for (int i = 0; i < vids.size(); i++) {
                if (i > 0) play.append('#');
                play.append("第").append(String.format("%02d", i + 1)).append("集$")
                        .append("proxy://do=play&siteKey=").append(siteKeySafe).append("&vid=").append(vids.get(i));
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
            return v.toString();
        } catch (Exception e) {
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
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
            return result.toString();
        } catch (Exception e) {
            return "";
        }
    }

    /** 本地代理：__range 分段 → CENC 解密 → 206 回吐（与壳 getProxy 契约一致）。 */
    @Override
    public Object[] proxy(Map<String, String> params) {
        try {
            if (!"play".equals(params.get("do"))) return null;
            String vid = params.get("vid");
            if (vid == null || !vid.matches("\\d+")) return null;
            String range = params.get("__range");
            if (range == null || range.isEmpty()) range = params.get("range");
            if (range == null || range.isEmpty()) range = "bytes=0-";
            Matcher m = Pattern.compile("bytes=(\\d+)-(\\d*)").matcher(range);
            if (!m.find()) return null;
            long start = Long.parseLong(m.group(1));

            StreamInfo si = stream(vid);
            long[] totalRef = {0};
            long wantEnd = start + SEG_SIZE - 1;
            byte[] body = range(si.url, start, wantEnd, totalRef);
            long total = totalRef[0];
            if (total <= 0) total = start + body.length;

            Prepared prepared;
            if (si.key == null) {
                prepared = new Prepared(new byte[0], new ArrayList<Sample>());
            } else if (start == 0) {
                prepared = prepareFor(vid, si, total, body);
            } else {
                prepared = prepareFor(vid, si, total, null);
            }
            byte[] decrypted = decrypt(body, start, si.key, prepared);

            if (decrypted.length == 0) {
                Map<String, String> errHeaders = new LinkedHashMap<>();
                errHeaders.put("Content-Length", "0");
                return new Object[]{404, "text/plain",
                        new ByteArrayInputStream(new byte[0]), errHeaders};
            }
            long realEnd = start + decrypted.length - 1;
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Range", "bytes " + start + "-" + realEnd + "/" + total);
            headers.put("Accept-Ranges", "bytes");
            return new Object[]{206, "video/mp4", new ByteArrayInputStream(decrypted), headers};
        } catch (Exception e) {
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Length", "0");
            return new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0]), headers};
        }
    }
}
