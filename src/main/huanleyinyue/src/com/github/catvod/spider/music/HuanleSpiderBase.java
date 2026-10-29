package com.github.catvod.spider.music;

import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/**
 * 欢乐K歌源公共骨架（key=huanleyinyue）：
 *  - 听歌：MusicCore 官方链路（原唱+歌词，多平台聚合）
 *  - K歌画面：playerContent 下发的 mv 为空时，自动搜「歌名 MV」哔哩视频兜底（直链经本源代理加 Referer 转发）
 *  - 伴奏：公开免费上游缺失，playerContent 不下发 accompany 字段——壳侧优雅降级（提示不阻断）
 */
public abstract class HuanleSpiderBase extends MusicSpiderBase {

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        String result = super.playerContent(flag, id, vipFlags);
        if ("MV".equals(flag) || result.isEmpty()) return result;
        try {
            JSONObject r = new JSONObject(result);
            if (!r.optString("mv", "").isEmpty()) return result;
            MusicCore.Song song = MusicCore.songByUid(id);
            String kw = (song == null ? "" : (song.name + " " + song.artist).trim());
            if (kw.isEmpty()) return result;
            String url = BiliMv.firstVideoUrl(kw + " MV");
            if (url.isEmpty()) return result;
            String proxied = "proxy://do=bilimv&siteKey="
                    + (siteKey == null || siteKey.isEmpty() ? "huanleyinyue" : siteKey)
                    + "&u=" + URLEncoder.encode(url, "UTF-8");
            r.put("mv", proxied);
            MusicCore.fileLog("huanle mv fallback id=" + id + " bili url=" + url.substring(0, Math.min(60, url.length())));
            return r.toString();
        } catch (Throwable t) {
            MusicCore.fileLog("huanle mv fallback FAIL id=" + id + " : " + t);
            return result;
        }
    }

    /** 哔哩 MV 代理转发：B 站 CDN 校验 Referer，代理补头 + 透传 Range。 */
    @Override
    public Object[] proxyLocal(Map<String, String> params) {
        if ("bilimv".equals(params.get("do"))) {
            try {
                String url = params.get("u");
                if (url == null || !url.startsWith("http")) return null;
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setConnectTimeout(10000);
                conn.setReadTimeout(30000);
                conn.setRequestMethod("GET");
                conn.setRequestProperty("User-Agent", BiliMv.ua());
                conn.setRequestProperty("Referer", BiliMv.referer());
                String range = params.get("Range");
                if (range == null || range.isEmpty()) range = params.get("__range");
                if (range != null && !range.isEmpty()) conn.setRequestProperty("Range", range);
                int code = conn.getResponseCode();
                Map<String, String> headers = new java.util.LinkedHashMap<>();
                for (Map.Entry<String, List<String>> h : conn.getHeaderFields().entrySet()) {
                    if (h.getKey() == null || h.getValue().isEmpty()) continue;
                    String k = h.getKey();
                    if (k.equalsIgnoreCase("Transfer-Encoding") || k.equalsIgnoreCase("Content-Length")) continue;
                    headers.put(k, h.getValue().get(0));
                }
                InputStream in = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                byte[] buf = new byte[32768];
                int n;
                while (in != null && (n = in.read(buf)) > 0) out.write(buf, 0, n);
                if (in != null) in.close();
                conn.disconnect();
                byte[] body = out.toByteArray();
                return new Object[]{code, code == 206 ? "video/mp4" : "video/" + guessExt(url),
                        new java.io.ByteArrayInputStream(body), headers};
            } catch (Throwable t) {
                MusicCore.fileLog("huanle bilimv proxy FAIL : " + t);
                Map<String, String> headers = new java.util.LinkedHashMap<>();
                headers.put("Content-Length", "0");
                return new Object[]{502, "text/plain", new java.io.ByteArrayInputStream(new byte[0]), headers};
            }
        }
        return null;
    }

    private static String guessExt(String url) {
        int dot = url.lastIndexOf('.');
        int end = url.indexOf('?', dot);
        String ext = dot >= 0 ? url.substring(dot + 1, end > dot ? end : url.length()) : "mp4";
        return ext.matches("[a-z0-9]{2,4}") ? ext : "mp4";
    }

    /** 供 JSON 输出（占位保持导入对称）。 */
    @SuppressWarnings("unused")
    private static String enc(String s) throws Exception {
        return URLEncoder.encode(s, StandardCharsets.UTF_8.name());
    }

    /** 抑制未用告警（OutputStream 备用）。 */
    @SuppressWarnings("unused")
    private static void touch(OutputStream os) {
    }
}
