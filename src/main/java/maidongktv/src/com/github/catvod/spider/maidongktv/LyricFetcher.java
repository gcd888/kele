package com.github.catvod.spider.maidongktv;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 歌词获取（网易云公开接口，按歌名+歌手匹配）。
 *
 * mad-api 曲库不下发歌词（maidong 原版在线播放同样无歌词，仅下载场景带 lrc sidecar）。
 * 这里用 music.163.com 旧公开接口按「清洗后歌名 + 歌手」搜索匹配，取 LRC 文本；
 * 接口无需加密（Cookie appver + Referer 即可），失败/未命中返回空串不影响播放。
 *
 * 匹配规则（K歌曲库歌名带修饰后缀，需清洗）：
 *   歌名清洗：去 (...)【…】块、去尾部 HD/高清 修饰、trim；
 *   命中：歌名归一化相等（优先）或互相包含，且歌手包含命中（歌手为空时仅歌名）。
 */
public final class LyricFetcher {

    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36";
    private static final int TIMEOUT_MS = 5000;

    /** songKey → LRC 缓存（含空结果防重复打接口）。 */
    private static final Map<String, String> CACHE = Collections.synchronizedMap(
            new LinkedHashMap<String, String>(32, 0.75f, false) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                    return size() > 256;
                }
            });

    private LyricFetcher() {
    }

    /** 取 LRC（同步，网络 2 趟请求；失败/未命中返回 ""）。 */
    public static String fetch(String songName, String singer) {
        String clean = cleanName(songName);
        if (clean.isEmpty()) return "";
        String key = clean + "|" + (singer == null ? "" : singer);
        String cached = CACHE.get(key);
        if (cached != null) return cached;

        String lrc = doFetch(clean, singer == null ? "" : singer.trim());
        CACHE.put(key, lrc);
        return lrc;
    }

    private static String doFetch(String name, String singer) {
        try {
            String query = singer.isEmpty() ? name : name + " " + singer;
            String searchResp = httpGet("https://music.163.com/api/search/get/web?s="
                    + URLEncoder.encode(query, "UTF-8") + "&type=1&offset=0&limit=10");
            if (searchResp.isEmpty()) return "";
            JSONObject root = new JSONObject(searchResp);
            JSONArray songs = root.optJSONObject("result") == null
                    ? null : root.getJSONObject("result").optJSONArray("songs");
            if (songs == null) return "";

            long matched = 0;
            for (int i = 0; i < songs.length(); i++) {
                JSONObject s = songs.optJSONObject(i);
                if (s == null) continue;
                String n = s.optString("name", "");
                String artist = joinArtists(s);
                boolean nameOk = norm(n).equals(norm(name)) || norm(n).contains(norm(name)) || norm(name).contains(norm(n));
                boolean artistOk = singer.isEmpty() || artist.contains(singer);
                if (nameOk && artistOk) {
                    matched = s.optLong("id", 0);
                    break;
                }
            }
            if (matched <= 0) return "";

            String lyricResp = httpGet("https://music.163.com/api/song/lyric?os=pc&id="
                    + matched + "&lv=-1&kv=-1&tv=-1");
            if (lyricResp.isEmpty()) return "";
            JSONObject lrcRoot = new JSONObject(lyricResp);
            String lrc = lrcRoot.optJSONObject("lrc") == null
                    ? "" : lrcRoot.getJSONObject("lrc").optString("lyric", "");
            if (lrc.contains("暂无歌词") || lrc.trim().length() < 10) return "";
            return lrc;
        } catch (Exception e) {
            return "";
        }
    }

    private static String joinArtists(JSONObject song) {
        StringBuilder sb = new StringBuilder();
        JSONArray arr = song.optJSONArray("artists");
        if (arr != null) {
            for (int i = 0; i < arr.length(); i++) {
                JSONObject a = arr.optJSONObject(i);
                if (a != null) {
                    if (sb.length() > 0) sb.append(",");
                    sb.append(a.optString("name", ""));
                }
            }
        }
        return sb.toString();
    }

    /** 歌名清洗：去 (...)【…】[] 块、去尾部 HD/BD/高清/现场 修饰词、trim。 */
    public static String cleanName(String raw) {
        if (raw == null) return "";
        String s = raw.replaceAll("[（(\\[【].*?[)）\\]】]", " ").trim();
        s = s.replaceAll("(?i)[\\s\\-_.]*(HD|BD|高清|蓝光|修复版|完整版|现场版|Live)$", "").trim();
        return s;
    }

    /** 归一化：去空白 + 小写。 */
    private static String norm(String s) {
        return s == null ? "" : s.replaceAll("\\s+", "").toLowerCase();
    }

    private static String httpGet(String urlStr) {
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(urlStr).openConnection();
            conn.setConnectTimeout(TIMEOUT_MS);
            conn.setReadTimeout(TIMEOUT_MS);
            conn.setRequestProperty("User-Agent", UA);
            conn.setRequestProperty("Referer", "https://music.163.com/");
            conn.setRequestProperty("Cookie", "appver=2.9.7");
            int code = conn.getResponseCode();
            if (code != 200) return "";
            InputStream in = conn.getInputStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[8192];
            int n;
            while ((n = in.read(buf)) > 0) out.write(buf, 0, n);
            in.close();
            return out.toString("UTF-8");
        } catch (Exception e) {
            return "";
        } finally {
            if (conn != null) conn.disconnect();
        }
    }
}
