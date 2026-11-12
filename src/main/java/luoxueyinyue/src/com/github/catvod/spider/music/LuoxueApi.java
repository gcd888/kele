package com.github.catvod.spider.music;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 落雪聚合取流客户端（洛雪音源9「聚合API接口」协议直译，Java 化免 JS 引擎）：
 *  - POST {base}/{source}，body={"musicInfo":{...},"type":"128k"}
 *  - code=200 → data.url 直链
 *  - code=303 → 服务器下发二次请求模板（data.request.url+options.headers），
 *               客户端执行后按 data.response.check 校验、data.response.url 路径提取直链
 * 平台映射（MusicCore 平台码 → 洛雪 source）：netease→wy / kugou→kg / qq→tx / kuwo→kw / migu→mg
 */
public class LuoxueApi {

    private static final String BASE = "https://api.music.lerd.dpdns.org";
    private static final String UA =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36";

    private LuoxueApi() {
    }

    /** MusicCore 平台码 → 洛雪 source；不支持返回 null。 */
    public static String mapSource(String platform) {
        if (platform == null) return null;
        switch (platform) {
            case "netease":
                return "wy";
            case "kugou":
                return "kg";
            case "qq":
                return "tx";
            case "kuwo":
                return "kw";
            case "migu":
                return "mg";
            default:
                return null;
        }
    }

    /** 各平台 musicInfo 字段（洛雪源数据结构映射）。 */
    private static JSONObject musicInfo(String source, String songId) throws Exception {
        JSONObject mi = new JSONObject().put("source", source);
        switch (source) {
            case "wy":
            case "tx":
                mi.put("songmid", songId);
                break;
            case "kg":
                mi.put("hash", songId);
                break;
            case "kw":
                mi.put("hash", songId).put("songmid", songId);
                break;
            case "mg":
                mi.put("copyrightId", songId).put("songId", songId);
                break;
            default:
                return null;
        }
        return mi;
    }

    /**
     * 取播放直链；失败返回 ""（调用方回退官方链路）。
     */
    public static String stream(String platform, String songId) {
        String source = mapSource(platform);
        if (source == null || songId == null || songId.isEmpty()) return "";
        try {
            JSONObject body = new JSONObject()
                    .put("musicInfo", musicInfo(source, songId))
                    .put("type", "128k");
            JSONObject j = new JSONObject(post(BASE + "/" + source, body.toString()));
            int code = j.optInt("code");
            if (code == 200) {
                String url = j.optJSONObject("data") == null ? "" : j.optJSONObject("data").optString("url", "");
                return url.startsWith("http") ? url : "";
            }
            if (code == 303) {
                return follow303(j.getJSONObject("data"));
            }
            MusicCore.fileLog("luoxue stream code=" + code + " msg=" + j.optString("msg") + " p=" + platform);
        } catch (Throwable t) {
            MusicCore.fileLog("luoxue stream FAIL p=" + platform + " : " + t);
        }
        return "";
    }

    /** 303：执行服务器下发的二次请求模板，按 check 校验、按 url 路径提取直链（各平台模板字段不齐，全路径判空）。 */
    private static String follow303(JSONObject data) throws Exception {
        JSONObject req = data.optJSONObject("request");
        if (req == null || req.optString("url", "").isEmpty()) return "";
        JSONObject respSpec = data.optJSONObject("response");
        JSONObject opts = req.optJSONObject("options");
        Map<String, String> headers = new LinkedHashMap<>();
        if (opts != null && opts.optJSONObject("headers") != null) {
            JSONObject hh = opts.getJSONObject("headers");
            JSONArray names = hh.names();
            for (int i = 0; i < names.length(); i++) {
                String k = names.getString(i);
                headers.put(k, hh.optString(k));
            }
        }
        String method = opts == null ? "GET" : opts.optString("method", "GET");
        String raw = "POST".equalsIgnoreCase(method)
                ? httpRaw(req.getString("url"), "POST", opts == null ? "" : opts.optString("body", ""), headers)
                : httpRaw(req.getString("url"), "GET", "", headers);
        if (!raw.startsWith("{") && !raw.startsWith("[")) {
            // 二次响应可能直接就是文本/重定向链接
            return raw.startsWith("http") ? raw.trim() : "";
        }
        JSONObject rj = new JSONObject(raw);
        // check：key 路径逐层取值与 value 比对（部分平台无 check）
        JSONObject check = respSpec == null ? null : respSpec.optJSONObject("check");
        if (check != null && check.optJSONArray("key") != null) {
            Object got = dig(rj, check.optJSONArray("key"));
            Object want = dig(rj, toArray(check.opt("value")));
            if (got == null || want == null || !String.valueOf(want).equals(String.valueOf(got))) {
                MusicCore.fileLog("luoxue 303 check mismatch got=" + got + " expect=" + want);
                return "";
            }
        }
        JSONArray urlPath = respSpec == null ? null : respSpec.optJSONArray("url");
        if (urlPath == null) return "";
        Object u = dig(rj, urlPath);
        String url = String.valueOf(u);
        return url.startsWith("http") ? url.trim() : "";
    }

    /** value/url 字段兼容单值与路径数组两种形态。 */
    private static JSONArray toArray(Object v) {
        if (v instanceof JSONArray) return (JSONArray) v;
        JSONArray arr = new JSONArray();
        arr.put(v);
        return arr;
    }

    /** 按路径数组逐层取值（字符串键取 JSONObject，数字键取 JSONArray 下标）。 */
    private static Object dig(Object cur, JSONArray path) throws Exception {
        if (path == null) return cur;
        for (int i = 0; i < path.length(); i++) {
            Object k = path.get(i);
            if (cur instanceof JSONObject) {
                cur = ((JSONObject) cur).opt(String.valueOf(k));
            } else if (cur instanceof JSONArray) {
                cur = ((JSONArray) cur).opt(Integer.parseInt(String.valueOf(k)));
            } else {
                return null;
            }
            if (cur == null) return null;
        }
        return cur;
    }

    private static String post(String url, String body) throws Exception {
        return httpRaw(url, "POST", body, mapOf("Content-Type", "application/json", "User-Agent", UA,
                "Accept", "application/json", "Referer", BASE + "/"));
    }

    private static Map<String, String> mapOf(String... kv) {
        Map<String, String> m = new LinkedHashMap<>();
        for (int i = 0; i + 1 < kv.length; i += 2) m.put(kv[i], kv[i + 1]);
        return m;
    }

    private static String httpRaw(String url, String method, String body, Map<String, String> headers) throws Exception {
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(15000);
        conn.setRequestMethod(method);
        if (headers != null) for (Map.Entry<String, String> e : headers.entrySet()) {
            if (e.getKey() != null && e.getValue() != null) conn.setRequestProperty(e.getKey(), e.getValue());
        }
        if (body != null && !body.isEmpty() && "POST".equals(method)) {
            conn.setDoOutput(true);
            byte[] b = body.getBytes(StandardCharsets.UTF_8);
            conn.setFixedLengthStreamingMode(b.length);
            OutputStream os = conn.getOutputStream();
            os.write(b);
            os.flush();
            os.close();
        }
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
}
