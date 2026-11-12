package com.github.catvod.spider.music.lx;

import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

import android.util.Base64;

/**
 * lx.request 的 Java 实现，语义对齐 lx-music-mobile src/core/init/userApi/request.js：
 * 默认 UA/Accept、POST 默认 application/json、form 转 urlencoded、
 * 响应 body 尝试 JSON.parse（失败保持字符串）。
 */
final class LxHttp {

    private static final String DEFAULT_UA = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36";

    private LxHttp() {
    }

    /** 返回响应 JSON：{statusCode, statusMessage, headers, body} */
    static String request(String url, String optionsJson) throws Exception {
        JSONObject o = optionsJson == null || optionsJson.isEmpty() ? new JSONObject() : new JSONObject(optionsJson);
        String method = o.optString("method", "GET").trim();
        if (method.isEmpty()) method = "GET";
        method = method.toUpperCase();
        JSONObject headers = o.optJSONObject("headers");
        if (headers == null) headers = new JSONObject();
        int timeout = o.optInt("timeout", 13000);
        if (timeout < 1000) timeout = 1000;
        if (timeout > 60000) timeout = 60000;

        Object body = null;
        if (o.has("body") && !o.isNull("body")) body = o.opt("body");
        JSONObject form = o.optJSONObject("form");
        JSONObject formData = o.optJSONObject("formData");

        if (!headers.has("User-Agent")) headers.put("User-Agent", DEFAULT_UA);
        if (!headers.has("Accept")) headers.put("Accept", "application/json");

        if ("POST".equals(method) || "PUT".equals(method) || "PATCH".equals(method)) {
            if (form != null || formData != null) {
                if (headers.optString("Content-Type").isEmpty())
                    headers.put("Content-Type", "application/x-www-form-urlencoded");
                body = urlEncode(form != null ? form : formData);
            } else if (headers.optString("Content-Type").isEmpty()) {
                headers.put("Content-Type", "application/json");
                if (!(body instanceof String)) body = body == null ? "" : JSONObject.quote(String.valueOf(body));
            }
        }

        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setConnectTimeout(timeout);
        conn.setReadTimeout(timeout);
        conn.setRequestMethod(method);
        conn.setInstanceFollowRedirects(true);
        Iterator<String> keys = headers.keys();
        while (keys.hasNext()) {
            String k = keys.next();
            String v = String.valueOf(headers.opt(k));
            if (!v.isEmpty()) conn.setRequestProperty(k, v);
        }
        if (body != null && ("POST".equals(method) || "PUT".equals(method) || "PATCH".equals(method))) {
            conn.setDoOutput(true);
            byte[] data = body instanceof byte[] ? (byte[]) body : String.valueOf(body).getBytes("UTF-8");
            conn.getOutputStream().write(data);
            conn.getOutputStream().flush();
        }

        int code = conn.getResponseCode();
        String msg = conn.getResponseMessage();
        InputStream in = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        if (in != null) {
            String enc = conn.getContentEncoding();
            if (enc != null && enc.toLowerCase().contains("gzip")) in = new GZIPInputStream(in);
            else if (enc != null && enc.toLowerCase().contains("deflate")) in = new InflaterInputStream(in);
            byte[] tmp = new byte[8192];
            int n;
            while ((n = in.read(tmp)) > 0) buf.write(tmp, 0, n);
            in.close();
        }
        JSONObject outHeaders = new JSONObject();
        for (int i = 0; ; i++) {
            String k = conn.getHeaderFieldKey(i);
            String v = conn.getHeaderField(i);
            if (k == null && v == null) break;
            if (k != null && !k.isEmpty()) outHeaders.put(k.toLowerCase(), v);
        }
        String text = buf.toString("UTF-8");
        try {
            conn.disconnect();
        } catch (Throwable ignore) {
        }

        JSONObject resp = new JSONObject();
        resp.put("statusCode", code);
        resp.put("statusMessage", msg == null ? "" : msg);
        resp.put("headers", outHeaders);
        resp.put("body", parseBody(text));
        return resp.toString();
    }

    /** 对齐 lx-music 行为：能解析成 JSON 则返回对象，否则保留字符串 */
    static Object parseBody(String text) {
        if (text == null) return "";
        String t = text.trim();
        if (t.isEmpty()) return text;
        if (t.startsWith("{") || t.startsWith("[")) {
            try {
                return new org.json.JSONTokener(t).nextValue();
            } catch (Throwable ignore) {
            }
        }
        return text;
    }

    private static String urlEncode(JSONObject form) throws Exception {
        StringBuilder sb = new StringBuilder();
        Iterator<String> keys = form.keys();
        while (keys.hasNext()) {
            String k = keys.next();
            if (sb.length() > 0) sb.append('&');
            sb.append(URLEncoder.encode(k, "UTF-8")).append('=')
                    .append(URLEncoder.encode(String.valueOf(form.opt(k)), "UTF-8"));
        }
        return sb.toString();
    }

    static String b64(byte[] data) {
        return Base64.encodeToString(data, Base64.NO_WRAP);
    }

    static byte[] unb64(String s) {
        return Base64.decode(s, Base64.DEFAULT);
    }
}
