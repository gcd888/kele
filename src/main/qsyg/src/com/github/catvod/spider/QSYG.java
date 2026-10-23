package com.github.catvod.spider;

import android.util.Base64;
import android.util.Log;

import com.github.catvod.crawler.Spider;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Q水易购 音乐 Spider（接口侧实现，壳内不含任何数据源逻辑）。
 * 数据蓝本：music-lib（netease/qq/kugou/soda provider），全部走四家公开 Web/App 端点，不破解资源。
 *
 * 协议映射（对壳端 SourceViewModel 透明复用）：
 *  - homeContent：四家平台分类（网易云 / QQ / 酷狗 / 汽水）
 *  - categoryContent(platform)：该平台热榜目录（每个榜单 = 一个条目）
 *  - detailContent({p}_toplist_{id} | {p}_playlist_{id})：榜内/歌单内歌曲 = 播放集（第N首${p}_{songid}）
 *  - searchContent：四平台并行搜索、结果交错
 *  - playerContent(flag="果剧音乐")：音频直链 + 扩展字段 lyric(LRC)/klyric(逐词)/accompany(伴唱预留)/trackMode/mv
 *                     flag="MV"：MV 视频直链（听歌页可选展示）
 *  - action：
 *     "playlist:{p}:{id}"    → 歌单歌曲 JSON（扫码推送-歌单推送链路）
 *     "search:{p}:{kw}"      → 歌曲 JSON（扫码推送-扫码点歌链路，p=all 时搜四家）
 *     "song:{p}_{songid}"    → 单曲信息 JSON
 */
public class QSYG extends Spider {

    private static final String TAG = "echo-music-jar";
    private static final String PLAY_FLAG = "果剧音乐";

    // ============================ 日志桥接（与 hongguo 同机制） ============================

    private static void fileLog(String msg) {
        Log.e(TAG, msg);
        try {
            Class<?> lw = Class.forName("com.github.gcd888.guoju.util.LogWriter");
            lw.getMethod("i", String.class).invoke(null, "echo-music jar: " + msg);
            return;
        } catch (Throwable ignored) {
        }
        try {
            if (mContext == null) return;
            java.io.File dir = mContext.getExternalFilesDir(null);
            if (dir == null) return;
            java.io.File f = new java.io.File(dir, "qsyg_spider.log");
            boolean rotate = f.exists() && f.length() > 512 * 1024;
            java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(f, !rotate));
            bw.write(new java.text.SimpleDateFormat("MM-dd HH:mm:ss.SSS", java.util.Locale.US)
                    .format(new java.util.Date()));
            bw.write(' ');
            bw.write(msg);
            bw.write('\n');
            bw.close();
        } catch (Throwable ignored) {
        }
    }

    // ============================ HTTP 工具 ============================

    private static final int CONNECT_TIMEOUT = 8000;
    private static final int READ_TIMEOUT = 15000;
    private static final String WEB_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36";

    private static byte[] http(String method, String url, Map<String, String> headers, byte[] body) throws Exception {
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        try {
            conn.setConnectTimeout(CONNECT_TIMEOUT);
            conn.setReadTimeout(READ_TIMEOUT);
            conn.setRequestMethod(method);
            conn.setRequestProperty("User-Agent", WEB_UA);
            conn.setRequestProperty("Accept-Encoding", "gzip");
            if (headers != null) {
                for (Map.Entry<String, String> e : headers.entrySet()) {
                    if (e.getValue() != null) conn.setRequestProperty(e.getKey(), e.getValue());
                }
            }
            if (body != null && body.length > 0) {
                conn.setDoOutput(true);
                OutputStream os = conn.getOutputStream();
                os.write(body);
                os.flush();
                os.close();
            }
            int code = conn.getResponseCode();
            InputStream in = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
            if (in == null) throw new RuntimeException("HTTP " + code + " empty body: " + url);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            if ("gzip".equalsIgnoreCase(conn.getContentEncoding())) {
                InputStream gz = new java.util.zip.GZIPInputStream(in);
                byte[] buf = new byte[8192];
                int n;
                while ((n = gz.read(buf)) > 0) out.write(buf, 0, n);
                gz.close();
            } else {
                byte[] buf = new byte[8192];
                int n;
                while ((n = in.read(buf)) > 0) out.write(buf, 0, n);
            }
            in.close();
            if (code >= 400) throw new RuntimeException("HTTP " + code + ": " + url);
            return out.toByteArray();
        } finally {
            conn.disconnect();
        }
    }

    private static byte[] httpGet(String url, Map<String, String> headers) throws Exception {
        return http("GET", url, headers, null);
    }

    private static byte[] httpPost(String url, Map<String, String> headers, String body) throws Exception {
        Map<String, String> h = headers == null ? new LinkedHashMap<String, String>() : headers;
        if (!h.containsKey("Content-Type")) h.put("Content-Type", "application/x-www-form-urlencoded");
        return http("POST", url, h, body == null ? new byte[0] : body.getBytes(StandardCharsets.UTF_8));
    }

    private static JSONObject getJson(String url, Map<String, String> headers) throws Exception {
        return new JSONObject(new String(httpGet(url, headers), StandardCharsets.UTF_8));
    }

    private static JSONObject postJson(String url, Map<String, String> headers, String body) throws Exception {
        return new JSONObject(new String(httpPost(url, headers, body), StandardCharsets.UTF_8));
    }

    private static Map<String, String> headers(String... kv) {
        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i + 1 < kv.length; i += 2) map.put(kv[i], kv[i + 1]);
        return map;
    }

    private static String enc(String v) {
        try {
            return java.net.URLEncoder.encode(v, "UTF-8").replace("+", "%20");
        } catch (Exception e) {
            return v;
        }
    }

    // ============================ 加密工具（weapi / linux / QRC / KRC） ============================

    private static final String WE_NONCE = "0CoJUm6Qyw8W8jud";
    private static final String WE_IV = "0102030405060708";
    private static final String WE_PUB_MODULUS =
            "00e0b509f6259df8642dbc35662901477df22677ec152b5ff68ace615bb7b725152b3ab17a876aea8a5aa76d2e417629ec4ee341f56135fccf695280104e0312ecbda92557c93870114af6c9d05c4f7f0c3685b7a46bee255932575cce10b424d813cfe4875d3e82047b97ddef52741d546b8e289dc6935b3ece0462db0a22b8e7";
    private static final String WE_PUB_EXP = "010001";
    private static final String RANDOM_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private static byte[] aesCbc(String text, byte[] key, byte[] iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"), new IvParameterSpec(iv));
        return cipher.doFinal(text.getBytes(StandardCharsets.UTF_8));
    }

    private static byte[] aesEcb(String text, byte[] key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"));
        return cipher.doFinal(text.getBytes(StandardCharsets.UTF_8));
    }

    private static String randomString(int size) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) sb.append(RANDOM_CHARS.charAt(r.nextInt(RANDOM_CHARS.length())));
        return sb.toString();
    }

    /** 网易云 weapi 双重 AES-CBC + RSA(NoPadding) 加密，返回 [params, encSecKey]。 */
    private static String[] weapi(String json) {
        try {
            String secKey = randomString(16);
            byte[] iv = WE_IV.getBytes(StandardCharsets.UTF_8);
            String pass1 = Base64.encodeToString(aesCbc(json, WE_NONCE.getBytes(StandardCharsets.UTF_8), iv), Base64.NO_WRAP);
            String params = Base64.encodeToString(aesCbc(pass1, secKey.getBytes(StandardCharsets.UTF_8), iv), Base64.NO_WRAP);
            byte[] reversed = secKey.getBytes(StandardCharsets.UTF_8);
            for (int i = 0, j = reversed.length - 1; i < j; i++, j--) {
                byte t = reversed[i];
                reversed[i] = reversed[j];
                reversed[j] = t;
            }
            BigInteger exp = new BigInteger(WE_PUB_EXP, 16);
            BigInteger mod = new BigInteger(WE_PUB_MODULUS, 16);
            String hex = new BigInteger(1, reversed).modPow(exp, mod).toString(16);
            StringBuilder sb = new StringBuilder();
            for (int i = hex.length(); i < 256; i++) sb.append('0');
            sb.append(hex);
            return new String[]{params, sb.toString()};
        } catch (Exception e) {
            throw new RuntimeException("weapi encrypt failed", e);
        }
    }

    private static final byte[] LINUX_KEY = hexBytes("7246674226682325323F5E6544673A51");

    /** 网易云 linux/forward 通道：AES-128-ECB 后转大写 HEX。 */
    private static String linuxEparams(String json) {
        try {
            byte[] enc = aesEcb(json, LINUX_KEY);
            StringBuilder sb = new StringBuilder(enc.length * 2);
            for (byte b : enc) sb.append(String.format("%02X", b));
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("linux encrypt failed", e);
        }
    }

    private static byte[] hexBytes(String hex) {
        int len = hex.length();
        byte[] out = new byte[len / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
        }
        return out;
    }

    /** QRC 解密：HEX → 3DES/ECB(NoPadding, key=!@#)(*$%123ZXC!@!@#)(NHL) → zlib inflate。 */
    private static String decryptQRC(String hexContent) {
        try {
            byte[] enc = hexBytes(hexContent.trim());
            if (enc.length % 8 != 0) return "";
            Cipher cipher = Cipher.getInstance("DESede/ECB/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(
                    "!@#)(*$%123ZXC!@!@#)(NHL".getBytes(StandardCharsets.UTF_8), "DESede"));
            return zlibInflate(cipher.doFinal(enc));
        } catch (Exception e) {
            return "";
        }
    }

    private static final byte[] KRC_KEY = {0x40, 0x47, 0x61, 0x77, 0x5e, 0x32, 0x74, 0x47,
            0x51, 0x36, 0x31, 0x2d, (byte) 0xce, (byte) 0xd2, 0x6e, 0x69};

    /** KRC 解密：Base64 → 逐字节 XOR(16字节key) → zlib inflate。 */
    private static String decryptKRC(String base64Content) {
        try {
            byte[] data = Base64.decode(base64Content.trim(), Base64.DEFAULT);
            for (int i = 0; i < data.length; i++) data[i] ^= KRC_KEY[i % KRC_KEY.length];
            return zlibInflate(data);
        } catch (Exception e) {
            return "";
        }
    }

    private static String zlibInflate(byte[] data) {
        try {
            Inflater inflater = new Inflater();
            inflater.setInput(data);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[8192];
            while (!inflater.finished()) {
                int n = inflater.inflate(buf);
                if (n == 0) {
                    if (inflater.needsInput() || inflater.needsDictionary()) break;
                } else {
                    out.write(buf, 0, n);
                }
            }
            inflater.end();
            return new String(out.toByteArray(), StandardCharsets.UTF_8);
        } catch (Exception e) {
            return "";
        }
    }

    private static String md5(String text) {
        try {
            byte[] d = MessageDigest.getInstance("MD5").digest(text.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(d.length * 2);
            for (byte b : d) sb.append(String.format("%02x", b));
            return sb.toString();
        } catch (Exception e) {
            return "";
        }
    }

    // ============================ 数据模型 ============================

    private static final class Song {
        final String platform;
        final String id;        // 平台内原始 id（netease 数字 / qq songmid / kugou hash / soda trackid）
        String name;
        String artist;
        final String album;
        final String cover;
        final int duration;     // 秒
        String mvid = "";       // netease mvid / qq vid（MV 可选展示）

        Song(String platform, String id, String name, String artist, String album, String cover, int duration) {
            this.platform = platform;
            this.id = id;
            this.name = name;
            this.artist = artist;
            this.album = album;
            this.cover = cover;
            this.duration = duration;
        }

        /** 壳侧统一歌曲 id：{platform}_{songid} */
        String uid() {
            return platform + "_" + id;
        }
    }

    /** 解析壳侧统一 id（{platform}_{songid}），kugou/soda 内部 id 含下划线时按首段切分。 */
    private static String[] splitUid(String uid) {
        int bar = uid.indexOf('_');
        if (bar <= 0) return null;
        return new String[]{uid.substring(0, bar), uid.substring(bar + 1)};
    }

    // ============================ 网易云（netease） ============================

    private static final String NE_REFERER = "http://music.163.com";

    private static Map<String, String> neHeaders() {
        return headers("Referer", NE_REFERER, "Cookie", "os=pc; appver=2.10.13");
    }

    /** 网易云搜索（linux/forward 通道，AES-ECB eparams）。 */
    private static List<Song> neSearch(String kw) throws Exception {
        String payload = new JSONObject()
                .put("method", "POST")
                .put("url", "http://music.163.com/api/search/pc")
                .put("params", new JSONObject()
                        .put("s", kw).put("type", 1).put("limit", 30).put("total", "true"))
                .put("csrf_token", "").toString();
        JSONObject resp = postJson("http://music.163.com/api/linux/forward",
                headers("Referer", NE_REFERER,
                        "User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:81.0) Gecko/20100101 Firefox/81.0",
                        "Content-Type", "application/x-www-form-urlencoded"),
                "eparams=" + linuxEparams(payload));
        JSONArray songs = resp.optJSONObject("result") == null ? null : resp.getJSONObject("result").optJSONArray("songs");
        return neParseSongs(songs);
    }

    /** 网易云歌曲列表解析（榜单/歌单/搜索统一，artists|ar 兼容、album|al 兼容）。 */
    private static List<Song> neParseSongs(JSONArray songs) {
        List<Song> out = new ArrayList<>();
        if (songs == null) return out;
        for (int i = 0; i < songs.length(); i++) {
            JSONObject s = songs.optJSONObject(i);
            if (s == null) continue;
            String id = String.valueOf(s.optLong("id", 0));
            String name = s.optString("name", "").trim();
            if (id.isEmpty() || "0".equals(id) || name.isEmpty()) continue;
            JSONArray artists = s.optJSONArray("artists");
            if (artists == null) artists = s.optJSONArray("ar");
            StringBuilder artist = new StringBuilder();
            if (artists != null) {
                for (int j = 0; j < artists.length() && j < 5; j++) {
                    JSONObject a = artists.optJSONObject(j);
                    if (a == null) continue;
                    String n = a.optString("name", "").trim();
                    if (n.isEmpty()) continue;
                    if (artist.length() > 0) artist.append("、");
                    artist.append(n);
                }
            }
            JSONObject album = s.optJSONObject("album");
            if (album == null) album = s.optJSONObject("al");
            String cover = album == null ? "" : album.optString("picUrl", "");
            int duration = s.optInt("duration", s.optInt("dt", 0)) / 1000;
            Song song = new Song("netease", id, name, artist.toString(),
                    album == null ? "" : album.optString("name", ""), cover, duration);
            song.mvid = String.valueOf(s.optLong("mvid", s.optLong("mv", 0)));
            out.add(song);
        }
        return out;
    }

    /** 网易云热榜目录。 */
    private static List<JSONObject> neToplists() throws Exception {
        JSONObject resp = postJson("https://music.163.com/api/toplist", neHeaders(), "");
        JSONArray list = resp.optJSONArray("list");
        List<JSONObject> out = new ArrayList<>();
        if (list == null) return out;
        for (int i = 0; i < list.length(); i++) {
            JSONObject t = list.optJSONObject(i);
            if (t == null || t.optLong("id", 0) <= 0) continue;
            out.add(t);
        }
        return out;
    }

    /** 网易云榜单/歌单歌曲（公开 api/playlist/detail，榜单即特殊歌单）。 */
    private static List<Song> nePlaylistSongs(String playlistId) throws Exception {
        JSONObject resp = getJson("https://music.163.com/api/playlist/detail?id=" + enc(playlistId), neHeaders());
        JSONObject result = resp.optJSONObject("result");
        if (result == null) return new ArrayList<>();
        return neParseSongs(result.optJSONArray("tracks"));
    }

    /** 网易云取流（weapi song/enhance/player/url，br=320000）。 */
    private static String neStream(String songId) throws Exception {
        String[] enc = weapi(new JSONObject()
                .put("ids", new JSONArray().put(songId))
                .put("br", 320000)
                .put("csrf_token", "").toString());
        JSONObject resp = postJson("https://music.163.com/weapi/song/enhance/player/url", neHeaders(),
                "params=" + enc(enc[0]) + "&encSecKey=" + enc(enc[1]));
        JSONArray data = resp.optJSONArray("data");
        if (data == null || data.length() == 0) return "";
        return data.optJSONObject(0) == null ? "" : data.getJSONObject(0).optString("url", "");
    }

    /** 网易云歌词（weapi song/lyric）：返回 [LRC, 逐词YRC]。 */
    private static String[] neLyric(String songId) throws Exception {
        String[] enc = weapi(new JSONObject()
                .put("id", songId).put("lv", -1).put("kv", -1).put("tv", -1).put("rv", -1).put("yv", -1)
                .put("csrf_token", "").toString());
        JSONObject resp = postJson("https://music.163.com/weapi/song/lyric", neHeaders(),
                "params=" + enc(enc[0]) + "&encSecKey=" + enc(enc[1]));
        String lrc = resp.optJSONObject("lrc") == null ? "" : resp.getJSONObject("lrc").optString("lyric", "");
        String yrc = resp.optJSONObject("yrc") == null ? "" : resp.getJSONObject("yrc").optString("lyric", "");
        return new String[]{lrc, yrc};
    }

    /** 网易云 MV 地址（公开 api/mv/url）。 */
    private static String neMvUrl(String mvid) throws Exception {
        JSONObject resp = getJson("https://music.163.com/api/mv/url?id=" + enc(mvid), neHeaders());
        JSONObject data = resp.optJSONObject("data");
        return data == null ? "" : data.optString("url", "");
    }

    // ============================ QQ 音乐（qq） ============================

    private static final String QQ_REFERER = "https://y.qq.com/";

    private static Map<String, String> qqJsonHeaders() {
        return headers("Referer", QQ_REFERER, "Content-Type", "application/json");
    }

    /** QQ musicu.fcg 网关 GET 形式（format=json&data=urlencode(payload)）。 */
    private static JSONObject qqFcgGet(JSONObject payload) throws Exception {
        return getJson("https://u.y.qq.com/cgi-bin/musicu.fcg?format=json&data=" + enc(payload.toString()),
                headers("Referer", QQ_REFERER));
    }

    /** QQ musicu.fcg 网关 POST 形式。 */
    private static JSONObject qqFcgPost(JSONObject payload) throws Exception {
        return postJson("https://u.y.qq.com/cgi-bin/musicu.fcg", qqJsonHeaders(), payload.toString());
    }

    private static JSONObject qqComm() {
        JSONObject comm = new JSONObject();
        try {
            comm.put("cv", 4747474).put("ct", 24).put("format", "json")
                    .put("inCharset", "utf-8").put("outCharset", "utf-8")
                    .put("notice", 0).put("platform", "yqq.json")
                    .put("needNewCode", 1).put("uin", "0")
                    .put("g_tk_new_20200303", 5381).put("g_tk", 5381);
        } catch (Exception ignore) {
        }
        return comm;
    }

    /** QQ 歌曲条目解析（榜单/歌单 old 命名 songmid/songname；搜索 new_json 命名 mid/name，双兼容）。 */
    private static Song qqParseSong(JSONObject s) {
        String mid = s.optString("songmid", s.optString("mid", ""));
        String name = s.optString("songname", s.optString("name", "")).trim();
        if (mid.isEmpty() || name.isEmpty()) return null;
        String albumName = s.optString("albumname", "");
        String albumMid = s.optString("albummid", "");
        if (albumName.isEmpty()) {
            JSONObject album = s.optJSONObject("album");
            if (album != null) {
                albumName = album.optString("name", album.optString("title", ""));
                if (albumMid.isEmpty()) albumMid = album.optString("mid", album.optString("pmid", ""));
            }
        }
        JSONArray singers = s.optJSONArray("singer");
        StringBuilder artist = new StringBuilder();
        if (singers != null) {
            for (int j = 0; j < singers.length() && j < 5; j++) {
                JSONObject a = singers.optJSONObject(j);
                if (a == null) continue;
                String n = a.optString("name", "").trim();
                if (n.isEmpty()) continue;
                if (artist.length() > 0) artist.append("、");
                artist.append(n);
            }
        }
        int interval = s.optInt("interval", 0);
        Song song = new Song("qq", mid, name, artist.toString(), albumName,
                albumMid.isEmpty() ? "" : "https://y.gtimg.cn/music/photo_new/T002R300x300M000" + albumMid + ".jpg",
                interval);
        // 数字 songid（歌词接口必须）
        String songId = String.valueOf(s.optLong("songid", s.optLong("id", 0)));
        song.mvid = "qqmeta:" + songId + ":" + albumMid;
        JSONObject mv = s.optJSONObject("mv");
        if (mv != null && !mv.optString("vid", "").isEmpty()) {
            song.mvid = mv.optString("vid");
        } else if (s.optString("mv", "").isEmpty() && mv == null) {
            // old 格式 mv 字段为字符串 vid
            String mvStr = s.optString("mv", "");
            if (!mvStr.isEmpty()) song.mvid = mvStr;
        }
        return song;
    }

    /** QQ 热榜目录（musicToplist.ToplistInfoServer/GetAll，跳过 MV 榜 recType=10010）。 */
    private static List<JSONObject> qqToplists() throws Exception {
        JSONObject payload = new JSONObject()
                .put("comm", qqComm())
                .put("topList", new JSONObject()
                        .put("module", "musicToplist.ToplistInfoServer")
                        .put("method", "GetAll")
                        .put("param", new JSONObject()));
        JSONObject resp = qqFcgGet(payload);
        JSONObject topList = resp.optJSONObject("topList");
        if (topList == null || topList.optInt("code", -1) != 0) return new ArrayList<>();
        JSONObject data = topList.optJSONObject("data");
        if (data == null) return new ArrayList<>();
        JSONArray groups = data.optJSONArray("group");
        List<JSONObject> out = new ArrayList<>();
        if (groups == null) return out;
        for (int i = 0; i < groups.length(); i++) {
            JSONObject group = groups.optJSONObject(i);
            if (group == null) continue;
            JSONArray items = group.optJSONArray("toplist");
            if (items == null) continue;
            for (int j = 0; j < items.length(); j++) {
                JSONObject t = items.optJSONObject(j);
                if (t == null || t.optInt("topId", 0) <= 0) continue;
                if (t.optInt("recType", 0) == 10010) continue; // MV 榜
                String title = t.optString("title", "").trim();
                if (title.isEmpty()) continue;
                out.add(t);
            }
        }
        return out;
    }

    /** QQ 榜单歌曲（fcg_v8_toplist_cp）。 */
    private static List<Song> qqToplistSongs(String topId) throws Exception {
        String url = "https://c.y.qq.com/v8/fcg-bin/fcg_v8_toplist_cp.fcg?" +
                "topid=" + enc(topId) + "&song_begin=0&song_num=100&format=json" +
                "&inCharset=utf8&outCharset=utf-8&notice=0&platform=h5&needNewCode=1&tpl=3&page=detail&type=top";
        JSONObject resp = getJson(url, headers("Referer", QQ_REFERER, "User-Agent", WEB_UA));
        if (resp.optInt("code", -1) != 0) return new ArrayList<>();
        JSONArray songList = resp.optJSONArray("songlist");
        return qqParseSongList(songList);
    }

    private static List<Song> qqParseSongList(JSONArray songList) {
        List<Song> out = new ArrayList<>();
        if (songList == null) return out;
        for (int i = 0; i < songList.length(); i++) {
            JSONObject item = songList.optJSONObject(i);
            if (item == null) continue;
            JSONObject d = item.optJSONObject("data");
            if (d == null) d = item;
            Song s = qqParseSong(d);
            if (s != null) out.add(s);
        }
        return out;
    }

    /** QQ 搜索（client_search_cp new_json=1，公开）。 */
    private static List<Song> qqSearch(String kw) throws Exception {
        String url = "https://c.y.qq.com/soso/fcgi-bin/client_search_cp?" +
                "ct=24&qqmusic_ver=1235&new_json=1&remoteplace=txt.yqq.top&t=0&aggr=1&cr=1" +
                "&catZhida=1&lossless=0&flag_qc=0&p=1&n=30&w=" + enc(kw) + "&format=json";
        JSONObject resp = getJson(url, headers("Referer", QQ_REFERER, "User-Agent", WEB_UA));
        JSONObject data = resp.optJSONObject("data");
        JSONObject song = data == null ? null : data.optJSONObject("song");
        if (song == null) return new ArrayList<>();
        JSONArray list = song.optJSONArray("list");
        List<Song> out = new ArrayList<>();
        if (list == null) return out;
        for (int i = 0; i < list.length(); i++) {
            Song s = qqParseSong(list.optJSONObject(i));
            if (s != null) out.add(s);
        }
        return out;
    }

    /** QQ 歌单歌曲（fcg_ucc_getcdinfo_byids_cp disstid）。 */
    private static List<Song> qqPlaylistSongs(String disstid) throws Exception {
        String url = "https://c.y.qq.com/qzone/fcg-bin/fcg_ucc_getcdinfo_byids_cp.fcg?" +
                "type=1&json=1&utf8=1&onlysong=0&disstid=" + enc(disstid) + "&format=json&g_tk=5381";
        JSONObject resp = getJson(url, headers("Referer", QQ_REFERER, "User-Agent", WEB_UA));
        JSONArray cdlist = resp.optJSONArray("cdlist");
        if (cdlist == null || cdlist.length() == 0) return new ArrayList<>();
        return qqParseSongList(cdlist.optJSONObject(0) == null ? null : cdlist.getJSONObject(0).optJSONArray("songlist"));
    }

    /** QQ 取流（music.vkey.GetVkey，M800/M500 mp3）。 */
    private static String qqStream(String songmid) throws Exception {
        Random r = new Random();
        String guid = String.valueOf(1000000000L + (long) (r.nextDouble() * 9000000000L));
        JSONArray filenames = new JSONArray();
        for (String prefix : new String[]{"M800", "M500"}) {
            filenames.put(prefix + songmid + songmid + ".mp3");
        }
        JSONObject payload = new JSONObject()
                .put("comm", qqComm())
                .put("req_1", new JSONObject()
                        .put("module", "music.vkey.GetVkey")
                        .put("method", "UrlGetVkey")
                        .put("param", new JSONObject()
                                .put("guid", guid)
                                .put("songmid", new JSONArray().put(songmid))
                                .put("songtype", new JSONArray().put(0))
                                .put("uin", "0")
                                .put("loginflag", 1)
                                .put("platform", "20")
                                .put("filename", filenames)));
        JSONObject resp = qqFcgPost(payload);
        JSONObject req1 = resp.optJSONObject("req_1");
        JSONObject data = req1 == null ? null : req1.optJSONObject("data");
        JSONArray midurlinfo = data == null ? null : data.optJSONArray("midurlinfo");
        if (midurlinfo != null) {
            for (int i = 0; i < midurlinfo.length(); i++) {
                JSONObject info = midurlinfo.optJSONObject(i);
                if (info == null) continue;
                String purl = info.optString("purl", "");
                if (!purl.isEmpty()) return "https://ws.stream.qqmusic.qq.com/" + purl;
            }
        }
        return "";
    }

    /** QQ 歌词（music.musichallSong.PlayLyricInfo，QRC hex → 3DES+zlib）：返回 [LRC, 逐词QRC]。 */
    private static String[] qqLyric(String songId, String songmid) throws Exception {
        // 先用旧公开接口拿基础 LRC（songmid 直查，稳定）
        String lrc = "";
        try {
            JSONObject resp = getJson("https://c.y.qq.com/lyric/fcgi-bin/fcg_query_lyric_newpc.fcg?" +
                            "songmid=" + enc(songmid) + "&g_tk=5381&format=json&nobase64=1&outCharset=utf-8",
                    headers("Referer", QQ_REFERER, "User-Agent", WEB_UA));
            if (resp.optInt("code", -1) == 0) lrc = resp.optString("lyric", "");
        } catch (Exception ignore) {
        }
        // PlayLyricInfo 拿 QRC 逐词（需要数字 songID）
        String qrc = "";
        try {
            JSONObject payload = new JSONObject()
                    .put("comm", new JSONObject().put("ct", 11).put("cv", "1003006").put("v", "1003006")
                            .put("platform", "yqq.json").put("needNewCode", 0).put("uid", "0")
                            .put("sid", "").put("loginUin", "0"))
                    .put("request", new JSONObject()
                            .put("method", "GetPlayLyricInfo")
                            .put("module", "music.musichallSong.PlayLyricInfo")
                            .put("param", new JSONObject()
                                    .put("crypt", 1).put("ct", 19).put("cv", 2111)
                                    .put("lrc_t", 0).put("qrc", 1).put("qrc_t", 0)
                                    .put("roma", 0).put("roma_t", 0).put("trans", 0).put("trans_t", 0)
                                    .put("songID", Long.parseLong(songId)).put("type", 0)));
            JSONObject resp = qqFcgPost(payload);
            JSONObject request = resp.optJSONObject("request");
            JSONObject data = request == null ? null : request.optJSONObject("data");
            String hex = data == null ? "" : data.optString("lyric", "");
            if (!hex.isEmpty()) qrc = decryptQRC(hex);
        } catch (Exception ignore) {
        }
        return new String[]{lrc, qrc};
    }

    /** QQ MV 地址（mv.GetMvUrl/GetMvUrls，取 mp4 可用地址）。 */
    private static String qqMvUrl(String vid) throws Exception {
        JSONObject payload = new JSONObject()
                .put("comm", qqComm())
                .put("req", new JSONObject()
                        .put("module", "mv.GetMvUrl")
                        .put("method", "GetMvUrls")
                        .put("param", new JSONObject()
                                .put("vids", new JSONArray().put(vid))
                                .put("request_type", 10001)));
        JSONObject resp = qqFcgPost(payload);
        JSONObject req = resp.optJSONObject("req");
        JSONObject data = req == null ? null : req.optJSONObject("data");
        JSONObject perVid = data == null ? null : data.optJSONObject(vid);
        if (perVid == null) return "";
        // mp4:[{freeenc_url|url,...}] / hls — 宽容取第一个 http mp4 地址
        for (String key : new String[]{"mp4", "hls"}) {
            JSONArray arr = perVid.optJSONArray(key);
            if (arr == null) continue;
            for (int i = 0; i < arr.length(); i++) {
                JSONObject item = arr.optJSONObject(i);
                if (item == null) continue;
                String u = item.optString("freeenc_url", item.optString("url", ""));
                if (!u.isEmpty()) return u;
            }
        }
        return "";
    }

    // ============================ 酷狗（kugou） ============================

    private static final String KG_UA = "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1";
    private static final String KG_REFERER = "http://m.kugou.com";

    private static Map<String, String> kgHeaders() {
        return headers("User-Agent", KG_UA, "Referer", KG_REFERER);
    }

    /** 酷狗热榜目录（mobilecdn rank/list）。 */
    private static List<JSONObject> kgToplists() throws Exception {
        String url = "https://mobilecdn.kugou.com/api/v3/rank/list?version=9108&plat=0&showtype=2" +
                "&parentid=0&apiver=2&area_code=1&withsong=1&page=1&pagesize=100";
        JSONObject resp = getJson(url, kgHeaders());
        if (resp.optInt("status", -1) != 1) return new ArrayList<>();
        JSONObject data = resp.optJSONObject("data");
        JSONArray info = data == null ? null : data.optJSONArray("info");
        List<JSONObject> out = new ArrayList<>();
        if (info == null) return out;
        for (int i = 0; i < info.length(); i++) {
            JSONObject t = info.optJSONObject(i);
            if (t == null || t.optInt("rankid", 0) <= 0) continue;
            if (t.optString("rankname", "").trim().isEmpty()) continue;
            out.add(t);
        }
        return out;
    }

    /** 酷狗歌曲条目解析（rank/song、special/song、search 三种结构统一）。 */
    private static Song kgParseSong(JSONObject s) {
        String hash = firstNonEmpty(s.optString("hash", ""), s.optString("FileHash", ""),
                s.optString("SQFileHash", ""), s.optString("HQFileHash", ""));
        if (hash.isEmpty() || "00000000000000000000000000000000".equals(hash)) return null;
        String name = s.optString("songname", s.optString("SongName", "")).trim();
        String singer = s.optString("singername", s.optString("SingerName", "")).trim();
        String filename = s.optString("filename", s.optString("FileName", ""));
        if (name.isEmpty() || singer.isEmpty()) {
            String[] parts = filename.split(" - ", 2);
            if (parts.length == 2) {
                if (singer.isEmpty()) singer = parts[0].trim();
                if (name.isEmpty()) name = parts[1].trim();
            } else if (name.isEmpty()) {
                name = filename.trim();
            }
        }
        if (name.isEmpty()) return null;
        String album = s.optString("album_name", s.optString("AlbumName", "")).trim();
        String img = firstNonEmpty(s.optString("ori_img_url", ""), s.optString("Image", ""),
                s.optString("trans_param.union_cover", ""));
        img = img.replace("{size}", "240");
        int duration = s.optInt("duration", s.optInt("Duration", 0));
        if (duration > 10000) duration /= 1000; // 个别接口给毫秒
        return new Song("kugou", hash, name, singer, album, img, duration);
    }

    private static List<Song> kgParseInfoList(JSONArray info) {
        List<Song> out = new ArrayList<>();
        if (info == null) return out;
        for (int i = 0; i < info.length(); i++) {
            Song s = kgParseSong(info.optJSONObject(i));
            if (s != null) out.add(s);
        }
        return out;
    }

    /** 酷狗榜单歌曲（mobilecdn rank/song）。 */
    private static List<Song> kgToplistSongs(String rankid) throws Exception {
        String url = "https://mobilecdn.kugou.com/api/v3/rank/song?rankid=" + enc(rankid) +
                "&page=1&pagesize=100&version=9108&area_code=1";
        JSONObject resp = getJson(url, kgHeaders());
        if (resp.optInt("status", -1) != 1) return new ArrayList<>();
        JSONObject data = resp.optJSONObject("data");
        return kgParseInfoList(data == null ? null : data.optJSONArray("info"));
    }

    /** 酷狗搜索（songsearch song_search_v2）。 */
    private static List<Song> kgSearch(String kw) throws Exception {
        String url = "https://songsearch.kugou.com/song_search_v2?keyword=" + enc(kw) +
                "&platform=WebFilter&format=json&page=1&pagesize=30&userid=-1&clientver=" +
                "&tag=em&filter=2&iscorrection=1&privilege_filter=0&_=" + System.currentTimeMillis();
        JSONObject resp = getJson(url, headers("User-Agent", WEB_UA));
        JSONObject data = resp.optJSONObject("data");
        if (data == null) return new ArrayList<>();
        // 歌名清洗：<em>高亮标签
        List<Song> out = kgParseInfoList(data.optJSONArray("lists"));
        for (Song s : out) {
            s.name = s.name.replaceAll("<[^>]*>", "").trim();
            s.artist = s.artist.replaceAll("<[^>]*>", "").trim();
        }
        return out;
    }

    /** 酷狗歌单歌曲（mobilecdn special/song specialid）。 */
    private static List<Song> kgPlaylistSongs(String specialid) throws Exception {
        String url = "https://mobilecdn.kugou.com/api/v3/special/song?specialid=" + enc(specialid) +
                "&page=1&pagesize=300&version=9108&area_code=1";
        JSONObject resp = getJson(url, kgHeaders());
        JSONObject data = resp.optJSONObject("data");
        return kgParseInfoList(data == null ? null : data.optJSONArray("info"));
    }

    /** 酷狗取流（m.kugou.com getSongInfo.php）。 */
    private static String kgStream(String hash) throws Exception {
        JSONObject resp = getJson("https://m.kugou.com/app/i/getSongInfo.php?cmd=playInfo&hash=" + enc(hash), kgHeaders());
        if (resp.optInt("errcode", 0) != 0) return "";
        return resp.optString("url", "");
    }

    /** 酷狗歌词（krcs search + download fmt=krc）：返回 [LRC, 逐词KRC]。 */
    private static String[] kgLyric(String hash, int duration) throws Exception {
        JSONObject search = getJson("https://krcs.kugou.com/search?ver=1&man=yes&client=mobi&keyword=" +
                "&duration=" + (duration * 1000) + "&hash=" + enc(hash) + "&album_audio_id=", kgHeaders());
        JSONArray candidates = search.optJSONArray("candidates");
        if (candidates == null || candidates.length() == 0) return new String[]{"", ""};
        JSONObject c = candidates.optJSONObject(0);
        if (c == null) return new String[]{"", ""};
        JSONObject dl = getJson("https://lyrics.kugou.com/download?ver=1&client=pc&id=" + c.opt("id") +
                "&accesskey=" + enc(c.optString("accesskey", "")) + "&fmt=krc&charset=utf8", kgHeaders());
        String content = dl.optString("content", "");
        if (content.isEmpty()) return new String[]{"", ""};
        if ("lrc".equals(dl.optString("fmt", "")) || dl.optInt("contenttype", 0) == 2) {
            String lrc = new String(Base64.decode(content, Base64.DEFAULT), StandardCharsets.UTF_8);
            return new String[]{lrc, ""};
        }
        return new String[]{"", decryptKRC(content)};
    }

    // ============================ 汽水（soda） ============================

    private static final String SODA_APP_UA = "com.luna.music/100198030 (Linux; U; Android 15; zh_CN_#Hans; ABR-AL80; Build/V417IR;tt-ok/3.12.13.19)";
    private static final String SODA_WEB_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36";

    /** 汽水官方榜单内置定义（PC 端无榜单目录接口）。 */
    private static final String[][] SODA_CHARTS = {
            {"7036274230471712007", "热歌榜", "汽水音乐内每周热度最高的50首歌，每周四更新"},
            {"7060812597884869927", "新歌榜", "近期发行的热度最高的50首新歌，每周四更新"},
            {"7061475546400005410", "欧美榜", "汽水音乐内每周热度最高的50首外文歌曲，每周四更新"},
            {"7415959718721494311", "音乐人歌曲榜", "抖音音乐人开放平台上传歌曲，综合每周站内热度进行排序展示"},
    };

    /** 汽水歌曲条目解析（track 结构统一）。 */
    private static Song sodaParseTrack(JSONObject track) {
        String id = track.optString("id", "").trim();
        String name = track.optString("name", "").trim();
        if (id.isEmpty() || name.isEmpty()) return null;
        JSONArray artists = track.optJSONArray("artists");
        StringBuilder artist = new StringBuilder();
        if (artists != null) {
            for (int j = 0; j < artists.length() && j < 5; j++) {
                JSONObject a = artists.optJSONObject(j);
                if (a == null) continue;
                String n = a.optString("name", "").trim();
                if (n.isEmpty()) continue;
                if (artist.length() > 0) artist.append("、");
                artist.append(n);
            }
        }
        JSONObject album = track.optJSONObject("album");
        String albumName = "", cover = "";
        if (album != null) {
            albumName = album.optString("name", "").trim();
            JSONObject urlCover = album.optJSONObject("url_cover");
            if (urlCover != null) {
                JSONArray urls = urlCover.optJSONArray("url_list");
                if (urls != null && urls.length() > 0) cover = urls.optString(0, "");
                if (cover.isEmpty()) {
                    String uri = urlCover.optString("uri", "");
                    if (!uri.isEmpty()) cover = "https://p3-luna.douyinpic.com/img/" + uri + "~c5_375x375.jpg";
                }
            }
        }
        int duration = track.optInt("duration", 0);
        if (duration > 10000) duration /= 1000;
        return new Song("soda", id, name, artist.toString(), albumName, cover, duration);
    }

    private static List<Song> sodaParseTracks(JSONArray tracks) {
        List<Song> out = new ArrayList<>();
        if (tracks == null) return out;
        for (int i = 0; i < tracks.length(); i++) {
            Song s = sodaParseTrack(tracks.optJSONObject(i));
            if (s != null) out.add(s);
        }
        return out;
    }

    /** 汽水搜索（luna/search/track，Android 端参数，免签名）。 */
    private static List<Song> sodaSearch(String kw) throws Exception {
        StringBuilder p = new StringBuilder();
        String[][] params = {
                {"device_platform", "android"}, {"os", "android"}, {"ssmix", "a"},
                {"cdid", "46556f98-1720-4248-83da-62b74b60b46a"}, {"channel", "xiaomi_8478_64"},
                {"aid", "386088"}, {"app_name", "luna"}, {"version_code", "100198030"},
                {"version_name", "19.8.0"}, {"manifest_version_code", "100198030"},
                {"update_version_code", "100198030"}, {"resolution", "1080*1920"}, {"dpi", "480"},
                {"device_type", "ABR-AL80"}, {"device_brand", "HUAWEI"}, {"language", "zh"},
                {"os_api", "35"}, {"os_version", "15"}, {"ac", "wifi"}, {"device_model", "ABR-AL80"},
                {"save_power", "0"}, {"font_size", "1.00"}, {"luna_first_launch_apk_type", "normal_apk"},
                {"is_car_play", "0"}, {"battery", "0.99"}, {"network_speed", "10156"},
                {"hybrid_version_code", "100198030"}, {"tz_name", "Asia/Shanghai"}, {"tz_offset", "28800"},
                {"package", "com.luna.music"}, {"charge", "0"}, {"luna_apk_type", "normal_apk"},
                {"output_device_type", "Phone"}, {"volume", "1.00"}, {"brightness", "0.08"},
                {"need_personal_recommend", "1"}, {"is_teen_mode", "0"}, {"sim_region", "cn"},
                {"android_device_type", "default"},
                {"iid", "2204957404569386"}, {"device_id", "2204957404565290"},
                {"_rticket", String.valueOf(System.currentTimeMillis())},
        };
        for (String[] kv : params) {
            if (p.length() > 0) p.append('&');
            p.append(kv[0]).append('=').append(enc(kv[1]));
        }
        p.append("&q=").append(enc(kw)).append("&cursor=0&count=20");
        JSONObject resp = getJson("https://api.qishui.com/luna/search/track?" + p,
                headers("User-Agent", SODA_APP_UA, "Content-Type", "application/json; charset=UTF-8"));
        JSONArray groups = resp.optJSONArray("result_groups");
        List<Song> out = new ArrayList<>();
        if (groups == null) return out;
        for (int i = 0; i < groups.length(); i++) {
            JSONObject group = groups.optJSONObject(i);
            JSONArray data = group == null ? null : group.optJSONArray("data");
            if (data == null) continue;
            for (int j = 0; j < data.length(); j++) {
                JSONObject item = data.optJSONObject(j);
                JSONObject entity = item == null ? null : item.optJSONObject("entity");
                JSONObject track = entity == null ? null : entity.optJSONObject("track");
                Song s = track == null ? null : sodaParseTrack(track);
                if (s != null) {
                    boolean dup = false;
                    for (Song exist : out) if (exist.id.equals(s.id)) { dup = true; break; }
                    if (!dup) out.add(s);
                }
            }
        }
        return out;
    }

    /** 汽水榜单歌曲（luna/pc/charts/{id}，PC 失败回退移动端）。 */
    private static List<Song> sodaChartSongs(String chartId) throws Exception {
        JSONObject resp;
        try {
            resp = getJson("https://api.qishui.com/luna/pc/charts/" + enc(chartId) +
                            "?aid=386088&device_platform=pc&channel=pc_web",
                    headers("User-Agent", SODA_WEB_UA));
        } catch (Exception e) {
            resp = getJson("https://api5-lf.qishui.com/luna/charts/" + enc(chartId) + "?charge=0",
                    headers("User-Agent", SODA_WEB_UA));
        }
        if (resp.optInt("status_code", -1) != 0) return new ArrayList<>();
        JSONObject chart = resp.optJSONObject("chart");
        JSONArray ranks = chart == null ? null : chart.optJSONArray("track_ranks");
        List<Song> out = new ArrayList<>();
        if (ranks == null) return out;
        for (int i = 0; i < ranks.length(); i++) {
            JSONObject item = ranks.optJSONObject(i);
            JSONObject track = item == null ? null : item.optJSONObject("track");
            Song s = track == null ? null : sodaParseTrack(track);
            if (s != null) out.add(s);
        }
        return out;
    }

    /** 汽水歌单歌曲（luna/pc/playlist/detail）。 */
    private static List<Song> sodaPlaylistSongs(String playlistId) throws Exception {
        JSONObject resp = getJson("https://api.qishui.com/luna/pc/playlist/detail?playlist_id=" + enc(playlistId) +
                        "&aid=386088&device_platform=web&channel=pc_web",
                headers("User-Agent", SODA_WEB_UA));
        if (resp.optInt("status_code", -1) != 0) return new ArrayList<>();
        JSONArray resources = resp.optJSONArray("media_resources");
        List<Song> out = new ArrayList<>();
        if (resources == null) return out;
        for (int i = 0; i < resources.length(); i++) {
            JSONObject res = resources.optJSONObject(i);
            JSONObject entity = res == null ? null : res.optJSONObject("entity");
            JSONObject wrapper = entity == null ? null : entity.optJSONObject("track_wrapper");
            JSONObject track = wrapper == null ? null : wrapper.optJSONObject("track");
            Song s = track == null ? null : sodaParseTrack(track);
            if (s != null) out.add(s);
        }
        return out;
    }

    /** 汽水 track_v2 响应（web 端点免签名）：track_player.url_player_info / video_model / lyric。 */
    private static JSONObject sodaTrackV2(String trackId) {
        try {
            return getJson("https://api.qishui.com/luna/pc/track_v2?track_id=" + enc(trackId) +
                            "&media_type=track&aid=386088&device_platform=web&channel=pc_web",
                    headers("User-Agent", SODA_WEB_UA));
        } catch (Exception e) {
            try {
                return getJson("https://beta-luna.douyin.com/luna/h5/seo_track?track_id=" + enc(trackId) +
                                "&device_platform=web",
                        headers("User-Agent", SODA_WEB_UA));
            } catch (Exception e2) {
                return null;
            }
        }
    }

    /** 汽水取流：track_v2 → url_player_info（阿里 PlayInfoList）→ video_model 兜底。 */
    private static String sodaStream(String trackId) {
        try {
            JSONObject resp = sodaTrackV2(trackId);
            if (resp == null) return "";
            JSONObject player = resp.optJSONObject("track_player");
            if (player != null) {
                String infoUrl = player.optString("url_player_info", "");
                if (!infoUrl.isEmpty()) {
                    try {
                        JSONObject info = getJson(infoUrl, headers("User-Agent", SODA_WEB_UA));
                        JSONObject result = info.optJSONObject("Result");
                        JSONObject data = result == null ? null : result.optJSONObject("Data");
                        JSONArray list = data == null ? null : data.optJSONArray("PlayInfoList");
                        if (list != null) {
                            for (int i = 0; i < list.length(); i++) {
                                JSONObject item = list.optJSONObject(i);
                                if (item == null) continue;
                                String u = item.optString("URL", item.optString("PlayUrl", ""));
                                if (!u.isEmpty()) return u;
                            }
                        }
                    } catch (Exception ignore) {
                    }
                }
                // video_model 兜底：任意层级找 main_url/main_play_url
                Object vm = player.opt("video_model");
                String found = findUrlDeep(vm, 0);
                if (!found.isEmpty()) return found;
            }
            // seo_track 兜底结构
            JSONObject seo = resp.optJSONObject("seo_track");
            if (seo != null) {
                JSONObject seoPlayer = resp.optJSONObject("track_player");
                if (seoPlayer != null) {
                    String infoUrl = seoPlayer.optString("url_player_info", "");
                    if (!infoUrl.isEmpty()) {
                        JSONObject info = getJson(infoUrl, headers("User-Agent", SODA_WEB_UA));
                        JSONObject result = info.optJSONObject("Result");
                        JSONObject data = result == null ? null : result.optJSONObject("Data");
                        JSONArray list = data == null ? null : data.optJSONArray("PlayInfoList");
                        if (list != null && list.length() > 0) {
                            JSONObject item = list.optJSONObject(0);
                            if (item != null) return item.optString("URL", item.optString("PlayUrl", ""));
                        }
                    }
                }
            }
        } catch (Exception e) {
            fileLog("sodaStream FAIL id=" + trackId + " : " + e);
        }
        return "";
    }

    /** 汽水歌词：track_v2 lyric.content（LRC 或逐词格式透传）。 */
    private static String[] sodaLyric(String trackId) {
        JSONObject resp = sodaTrackV2(trackId);
        if (resp == null) return new String[]{"", ""};
        JSONObject lyricObj = resp.optJSONObject("lyric");
        if (lyricObj == null) {
            JSONObject seo = resp.optJSONObject("seo_track");
            lyricObj = seo == null ? null : seo.optJSONObject("lyric");
        }
        String content = lyricObj == null ? "" : lyricObj.optString("content", "");
        if (content.isEmpty()) return new String[]{"", ""};
        // 含 "(ms,dur,0)" 逐词标注则视为逐词歌词，否则按 LRC
        if (content.contains("(") && content.matches("(?s).*\\[\\d+,\\d+\\].*") && content.contains(",0)")) {
            return new String[]{"", content};
        }
        return new String[]{content, ""};
    }

    /** 深度遍历 JSON 结构找第一个播放地址（video_model 多层嵌套字符串兼容）。 */
    private static String findUrlDeep(Object node, int depth) {
        if (node == null || depth > 6) return "";
        if (node instanceof String) {
            String s = (String) node;
            // 双重 JSON 序列化字符串再解一层
            if (s.trim().startsWith("{") || s.trim().startsWith("[")) {
                try {
                    Object parsed = s.trim().startsWith("{") ? new JSONObject(s) : new org.json.JSONArray(s);
                    return findUrlDeep(parsed, depth + 1);
                } catch (Exception ignore) {
                }
            }
            if (s.startsWith("http") && (s.contains(".mp3") || s.contains(".m4a") || s.contains(".mp4")
                    || s.contains("audio") || s.contains("music"))) return s;
            return "";
        }
        if (node instanceof JSONObject) {
            JSONObject obj = (JSONObject) node;
            String[] keys = {"main_url", "main_play_url", "url", "backup_url", "backup_play_url", "play_url"};
            for (String key : keys) {
                String found = findUrlDeep(obj.opt(key), depth + 1);
                if (!found.isEmpty()) return found;
            }
            java.util.Iterator<String> it = obj.keys();
            while (it.hasNext()) {
                String found = findUrlDeep(obj.opt(it.next()), depth + 1);
                if (!found.isEmpty()) return found;
            }
        }
        if (node instanceof org.json.JSONArray) {
            org.json.JSONArray arr = (org.json.JSONArray) node;
            for (int i = 0; i < arr.length(); i++) {
                String found = findUrlDeep(arr.opt(i), depth + 1);
                if (!found.isEmpty()) return found;
            }
        }
        return "";
    }

    private static String firstNonEmpty(String... values) {
        for (String v : values) {
            if (v != null && !v.trim().isEmpty()) return v.trim();
        }
        return "";
    }

    // ============================ Spider 协议 ============================

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();
            classes.put(new JSONObject().put("type_id", "netease").put("type_name", "网易云"));
            classes.put(new JSONObject().put("type_id", "qq").put("type_name", "QQ音乐"));
            classes.put(new JSONObject().put("type_id", "kugou").put("type_name", "酷狗"));
            classes.put(new JSONObject().put("type_id", "soda").put("type_name", "汽水"));
            result.put("class", classes);
            return result.toString();
        } catch (Exception e) {
            fileLog("homeContent FAIL: " + e);
            return "";
        }
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        String platform = tid == null ? "" : tid.trim();
        try {
            fileLog("categoryContent enter tid=" + platform);
            List<JSONObject> toplists;
            switch (platform) {
                case "netease":
                    toplists = neToplists();
                    break;
                case "qq":
                    toplists = qqToplists();
                    break;
                case "kugou":
                    toplists = kgToplists();
                    break;
                case "soda":
                    toplists = new ArrayList<>();
                    for (String[] c : SODA_CHARTS) {
                        toplists.add(new JSONObject()
                                .put("id", c[0]).put("name", c[0].equals(c[0]) ? c[1] : c[1]).put("desc", c[2]));
                    }
                    break;
                default:
                    toplists = new ArrayList<>();
            }
            List<JSONObject> items = toplists;
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            int i = 0;
            for (JSONObject t : items) {
                String id, name, cover, remarks;
                if ("soda".equals(platform)) {
                    id = t.optString("id", "");
                    name = t.optString("name", "");
                    cover = "";
                    remarks = t.optString("desc", "");
                } else if ("netease".equals(platform)) {
                    id = String.valueOf(t.optLong("id", 0));
                    name = t.optString("name", "");
                    cover = t.optString("coverImgUrl", "");
                    remarks = t.optString("updateFrequency", "");
                } else if ("qq".equals(platform)) {
                    id = String.valueOf(t.optInt("topId", 0));
                    name = t.optString("title", "");
                    cover = firstNonEmpty(t.optString("frontPicUrl", ""), t.optString("headPicUrl", ""), t.optString("mbFrontPicUrl", ""));
                    if (cover.startsWith("http://")) cover = "https://" + cover.substring(7);
                    remarks = t.optString("updateTips", "");
                } else {
                    id = String.valueOf(t.optInt("rankid", 0));
                    name = t.optString("rankname", "");
                    cover = t.optString("imgurl", "").replace("{size}", "240");
                    remarks = t.optString("update_frequency", "");
                }
                if (id.isEmpty() || name.isEmpty()) continue;
                JSONObject v = new JSONObject();
                v.put("vod_id", platform + "_toplist_" + id);
                v.put("vod_name", name);
                v.put("vod_pic", cover);
                v.put("vod_remarks", remarks);
                v.put("vod_content", remarks);
                list.put(v);
                i++;
            }
            result.put("list", list);
            result.put("page", 1);
            result.put("pagecount", 1);
            result.put("limit", 100);
            result.put("total", i);
            fileLog("categoryContent done tid=" + platform + " items=" + i);
            return result.toString();
        } catch (Exception e) {
            fileLog("categoryContent FAIL tid=" + platform + " : " + e);
            return pageDataEmpty(1);
        }
    }

    @Override
    public String homeVideoContent() {
        // 站点推荐模式数据源：网易云热歌榜（公开稳定）
        try {
            List<Song> songs = nePlaylistSongs("3778678");
            return songsToPageData(songs, "网易云热歌榜");
        } catch (Exception e) {
            fileLog("homeVideoContent FAIL: " + e);
            return "";
        }
    }

    /** 壳侧 SourceViewModel 只调 2 参版本，委托 3 参。 */
    @Override
    public String searchContent(String key, boolean quick) {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        long t0 = System.currentTimeMillis();
        String keyword = key == null ? "" : key.trim();
        if (keyword.isEmpty() || keyword.length() > 60) return pageDataEmpty(1);
        fileLog("searchContent enter kw=[" + keyword + "] quick=" + quick);
        try {
            List<Song> all = parallelSearch(keyword);
            String out = songsToPageData(all, null);
            fileLog("searchContent done kw=[" + keyword + "] items=" + all.size()
                    + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            return out;
        } catch (Exception e) {
            fileLog("searchContent FAIL kw=[" + keyword + "] : " + e);
            return pageDataEmpty(1);
        }
    }

    /** 四平台并行搜索（每家前 15 条，按平台交错排列）。 */
    private static List<Song> parallelSearch(String kw) {
        final List<Song> ne = Collections.synchronizedList(new ArrayList<Song>());
        final List<Song> qq = Collections.synchronizedList(new ArrayList<Song>());
        final List<Song> kg = Collections.synchronizedList(new ArrayList<Song>());
        final List<Song> sd = Collections.synchronizedList(new ArrayList<Song>());
        ExecutorService pool = Executors.newFixedThreadPool(4);
        List<Future<?>> futures = new ArrayList<>();
        final String keyword = kw;
        futures.add(pool.submit(new Runnable() {
            public void run() {
                try {
                    ne.addAll(neSearch(keyword));
                } catch (Exception e) {
                    fileLog("search netease FAIL: " + e);
                }
            }
        }));
        futures.add(pool.submit(new Runnable() {
            public void run() {
                try {
                    qq.addAll(qqSearch(keyword));
                } catch (Exception e) {
                    fileLog("search qq FAIL: " + e);
                }
            }
        }));
        futures.add(pool.submit(new Runnable() {
            public void run() {
                try {
                    kg.addAll(kgSearch(keyword));
                } catch (Exception e) {
                    fileLog("search kugou FAIL: " + e);
                }
            }
        }));
        futures.add(pool.submit(new Runnable() {
            public void run() {
                try {
                    sd.addAll(sodaSearch(keyword));
                } catch (Exception e) {
                    fileLog("search soda FAIL: " + e);
                }
            }
        }));
        pool.shutdown();
        try {
            pool.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException ignore) {
        }
        // 交错排列：四家各取前 15，netease→qq→kugou→soda→netease...
        List<Song> out = new ArrayList<>();
        int max = Math.min(15, Math.max(Math.max(ne.size(), qq.size()), Math.max(kg.size(), sd.size())));
        for (int i = 0; i < max; i++) {
            if (i < ne.size()) out.add(ne.get(i));
            if (i < qq.size()) out.add(qq.get(i));
            if (i < kg.size()) out.add(kg.get(i));
            if (i < sd.size()) out.add(sd.get(i));
        }
        return out;
    }

    @Override
    public String detailContent(List<String> ids) {
        long t0 = System.currentTimeMillis();
        String id = ids.get(0);
        String[] parts = id.split("_", 3);
        if (parts.length != 3) {
            fileLog("detailContent invalid id=" + id);
            return "";
        }
        String platform = parts[0], kind = parts[1], realId = parts[2];
        try {
            fileLog("detailContent enter id=" + id);
            List<Song> songs;
            String title = "";
            if ("toplist".equals(kind)) {
                switch (platform) {
                    case "netease":
                        songs = nePlaylistSongs(realId);
                        title = platformName(platform) + " · 榜单";
                        break;
                    case "qq":
                        songs = qqToplistSongs(realId);
                        title = platformName(platform) + " · 榜单";
                        break;
                    case "kugou":
                        songs = kgToplistSongs(realId);
                        title = platformName(platform) + " · 榜单";
                        break;
                    case "soda":
                        songs = sodaChartSongs(realId);
                        title = platformName(platform) + " · 榜单";
                        break;
                    default:
                        songs = new ArrayList<>();
                }
            } else if ("playlist".equals(kind)) {
                switch (platform) {
                    case "netease":
                        songs = nePlaylistSongs(realId);
                        break;
                    case "qq":
                        songs = qqPlaylistSongs(realId);
                        break;
                    case "kugou":
                        songs = kgPlaylistSongs(realId);
                        break;
                    case "soda":
                        songs = sodaPlaylistSongs(realId);
                        break;
                    default:
                        songs = new ArrayList<>();
                }
                title = platformName(platform) + " · 歌单";
            } else {
                fileLog("detailContent unknown kind=" + kind);
                return "";
            }
            if (songs.isEmpty()) {
                fileLog("detailContent empty id=" + id);
                return "";
            }
            StringBuilder play = new StringBuilder();
            for (int i = 0; i < songs.size(); i++) {
                Song s = songs.get(i);
                if (i > 0) play.append('#');
                play.append(String.format("%02d", i + 1)).append('.').append(s.name)
                        .append('$').append(s.uid());
            }
            String cover = songs.get(0).cover;
            JSONObject v = new JSONObject();
            v.put("vod_id", id);
            v.put("vod_name", title);
            v.put("vod_pic", cover);
            v.put("vod_content", "共 " + songs.size() + " 首 · " + platformName(platform));
            v.put("vod_remarks", songs.size() + "首");
            v.put("type_id", platform);
            v.put("type_name", platformName(platform));
            v.put("vod_play_from", PLAY_FLAG);
            v.put("vod_play_url", play.toString());
            JSONObject root = new JSONObject();
            root.put("code", 1);
            JSONArray list = new JSONArray();
            list.put(v);
            root.put("list", list);
            fileLog("detailContent done id=" + id + " songs=" + songs.size()
                    + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            return root.toString();
        } catch (Exception e) {
            fileLog("detailContent FAIL id=" + id + " : " + e);
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        long t0 = System.currentTimeMillis();
        String[] parts = splitUid(id);
        if (parts == null) return "";
        String platform = parts[0], songId = parts[1];
        try {
            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("header", new JSONObject());
            if ("MV".equals(flag)) {
                String mv = resolveMvUrl(platform, songId);
                if (mv.isEmpty()) {
                    fileLog("playerContent MV unavailable id=" + id);
                    return "";
                }
                result.put("flag", "MV");
                result.put("url", mv);
                fileLog("playerContent MV done id=" + id + " cost=" + (System.currentTimeMillis() - t0) + "ms");
                return result.toString();
            }
            // flag = 原唱（果剧音乐）：音频直链 + 歌词/逐词/MV 扩展字段
            String url;
            String[] lyric;
            String mvid = "";
            switch (platform) {
                case "netease":
                    url = neStream(songId);
                    lyric = neLyric(songId);
                    break;
                case "qq": {
                    url = qqStream(songId);
                    // qq 歌词需要数字 songID：从搜索/榜单缓存的元数据取，无缓存时用 songmid 查不到则跳过逐词
                    String[] meta = qqSongMeta(songId);
                    lyric = meta[1].isEmpty() ? new String[]{"", ""} : qqLyric(meta[1], songId);
                    mvid = meta[0];
                    break;
                }
                case "kugou":
                    url = kgStream(songId);
                    lyric = kgLyric(songId, 0);
                    break;
                case "soda":
                    url = sodaStream(songId);
                    lyric = sodaLyric(songId);
                    break;
                default:
                    return "";
            }
            if (url == null || url.isEmpty()) {
                fileLog("playerContent no url id=" + id + " platform=" + platform
                        + " cost=" + (System.currentTimeMillis() - t0) + "ms (VIP或版权受限)");
                return "";
            }
            // flag 必须回显入参（壳 stale 校验比较 result.flag 与片源名）
            result.put("flag", flag == null || flag.isEmpty() ? PLAY_FLAG : flag);
            result.put("url", url);
            result.put("lyric", lyric == null ? "" : lyric[0]);
            result.put("klyric", lyric == null ? "" : lyric[1]);
            result.put("accompany", ""); // 伴唱音轨预留：公开平台无伴奏资源，接口下发后 UI 自动启用
            result.put("trackMode", "single");
            if (mvid.isEmpty()) mvid = resolveMvid(platform, songId);
            result.put("mv", mvid.isEmpty() ? "" : resolveMvUrl(platform, mvid));
            fileLog("playerContent done id=" + id + " lyric=" + (lyric == null ? 0 : lyric[0].length())
                    + " klyric=" + (lyric == null ? 0 : lyric[1].length())
                    + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            return result.toString();
        } catch (Exception e) {
            fileLog("playerContent FAIL id=" + id + " cost=" + (System.currentTimeMillis() - t0) + "ms : " + e);
            return "";
        }
    }

    private static String platformName(String platform) {
        switch (platform) {
            case "netease":
                return "网易云";
            case "qq":
                return "QQ音乐";
            case "kugou":
                return "酷狗";
            case "soda":
                return "汽水";
            default:
                return platform;
        }
    }

    /** 平台 MV id 解析：netease 需 songid→mvid，qq 直接 vid。 */
    private static String resolveMvid(String platform, String songId) {
        return ""; // MV id 统一在播放元数据中携带，无缓存时 MV 不可用（可选项，不影响音频播放）
    }

    private static String resolveMvUrl(String platform, String mvid) {
        try {
            if ("netease".equals(platform)) return neMvUrl(mvid);
            if ("qq".equals(platform)) return qqMvUrl(mvid);
        } catch (Exception e) {
            fileLog("resolveMvUrl FAIL " + platform + " " + mvid + " : " + e);
        }
        return "";
    }

    /** QQ 歌曲 songmid→[mvid, songid] 元数据（搜索 new_json 一次性补齐）。 */
    private static final Map<String, String[]> qqMetaCache = new HashMap<>();

    private static String[] qqSongMeta(String songmid) {
        synchronized (qqMetaCache) {
            String[] cached = qqMetaCache.get(songmid);
            if (cached != null) return cached;
        }
        try {
            List<Song> songs = qqSearchCacheLookup(songmid);
            synchronized (qqMetaCache) {
                if (songs != null && !songs.isEmpty()) {
                    Song s = songs.get(0);
                    String songId = "";
                    // qqParseSong 把 songid 编在 mvid="qqmeta:{songId}:{albumMid}"
                    if (s.mvid.startsWith("qqmeta:")) songId = s.mvid.substring(7, s.mvid.indexOf(':', 7));
                    String[] meta = {s.mvid.startsWith("qqmeta:") ? "" : s.mvid, songId};
                    qqMetaCache.put(songmid, meta);
                    return meta;
                }
            }
        } catch (Exception ignore) {
        }
        return new String[]{"", ""};
    }

    private static List<Song> qqSearchCacheLookup(String songmid) {
        try {
            return qqSearch(songmid);
        } catch (Exception e) {
            return null;
        }
    }

    // ============================ action（扫码点歌 / 歌单推送） ============================

    @Override
    public String action(String action) {
        if (action == null || action.isEmpty()) return null;
        long t0 = System.currentTimeMillis();
        try {
            fileLog("action enter " + action);
            if (action.startsWith("song:")) {
                String uid = action.substring(5);
                Song s = songInfo(uid);
                if (s == null) return "{\"error\":\"song not found\"}";
                JSONObject root = new JSONObject();
                root.put("song", songJson(s));
                return root.toString();
            }
            if (action.startsWith("search:")) {
                String[] parts = action.split(":", 3);
                if (parts.length < 3) return "{\"error\":\"invalid search action\"}";
                String platform = parts[1], kw = parts[2];
                List<Song> songs;
                if ("all".equals(platform)) {
                    songs = parallelSearch(kw);
                } else {
                    switch (platform) {
                        case "netease":
                            songs = neSearch(kw);
                            break;
                        case "qq":
                            songs = qqSearch(kw);
                            break;
                        case "kugou":
                            songs = kgSearch(kw);
                            break;
                        case "soda":
                            songs = sodaSearch(kw);
                            break;
                        default:
                            songs = parallelSearch(kw);
                    }
                }
                if (songs.size() > 30) songs = songs.subList(0, 30);
                JSONArray arr = new JSONArray();
                for (Song s : songs) arr.put(songJson(s));
                JSONObject root = new JSONObject();
                root.put("songs", arr);
                fileLog("action search done kw=" + kw + " items=" + songs.size()
                        + " cost=" + (System.currentTimeMillis() - t0) + "ms");
                return root.toString();
            }
            if (action.startsWith("playlistUrl:")) {
                String url = action.substring("playlistUrl:".length());
                String[] pi = resolvePlaylistFromUrl(url);
                if (pi == null) return "{\"error\":\"unsupported playlist url\"}";
                List<Song> songs;
                switch (pi[0]) {
                    case "netease":
                        songs = nePlaylistSongs(pi[1]);
                        break;
                    case "qq":
                        songs = qqPlaylistSongs(pi[1]);
                        break;
                    case "kugou":
                        songs = kgPlaylistSongs(pi[1]);
                        break;
                    case "soda":
                        songs = sodaPlaylistSongs(pi[1]);
                        break;
                    default:
                        return "{\"error\":\"unknown platform\"}";
                }
                JSONArray arr = new JSONArray();
                for (Song s : songs) arr.put(songJson(s));
                JSONObject root = new JSONObject();
                root.put("platform", pi[0]);
                root.put("playlistId", pi[1]);
                root.put("songs", arr);
                fileLog("action playlistUrl done p=" + pi[0] + " id=" + pi[1]
                        + " items=" + songs.size() + " cost=" + (System.currentTimeMillis() - t0) + "ms");
                return root.toString();
            }
            if (action.startsWith("playlist:")) {
                String[] parts = action.split(":", 3);
                if (parts.length < 3) return "{\"error\":\"invalid playlist action\"}";
                String platform = parts[1], pid = parts[2];
                List<Song> songs;
                switch (platform) {
                    case "netease":
                        songs = nePlaylistSongs(pid);
                        break;
                    case "qq":
                        songs = qqPlaylistSongs(pid);
                        break;
                    case "kugou":
                        songs = kgPlaylistSongs(pid);
                        break;
                    case "soda":
                        songs = sodaPlaylistSongs(pid);
                        break;
                    default:
                        return "{\"error\":\"unknown platform\"}";
                }
                JSONArray arr = new JSONArray();
                for (Song s : songs) arr.put(songJson(s));
                JSONObject root = new JSONObject();
                root.put("platform", platform);
                root.put("songs", arr);
                fileLog("action playlist done p=" + platform + " id=" + pid
                        + " items=" + songs.size() + " cost=" + (System.currentTimeMillis() - t0) + "ms");
                return root.toString();
            }
            return null;
        } catch (Exception e) {
            fileLog("action FAIL " + action + " : " + e);
            return "{\"error\":\"" + e.getClass().getSimpleName() + "\"}";
        }
    }

    /** 扫码歌单推送：从四家分享 URL 解析 platform + 歌单 ID（短链跳转不支持，需粘贴网页长链接）。 */
    private static String[] resolvePlaylistFromUrl(String url) {
        if (url == null || url.isEmpty()) return null;
        String u = url.trim();
        if (u.contains("music.163.com")) {
            String id = firstMatch(u, "[?&]id=(\\d+)");
            if (id == null) id = firstMatch(u, "/playlist/(\\d+)");
            if (id != null) return new String[]{"netease", id};
        }
        if (u.contains("qq.com")) {
            String id = firstMatch(u, "[?&]disstid=(\\d+)");
            if (id == null) id = firstMatch(u, "playlist/(\\d+)");
            if (id == null) id = firstMatch(u, "[?&]id=(\\d+)");
            if (id != null) return new String[]{"qq", id};
        }
        if (u.contains("kugou.com")) {
            String id = firstMatch(u, "special/index/(\\d+)");
            if (id == null) id = firstMatch(u, "id_(\\d+)");
            if (id == null) id = firstMatch(u, "specialid=(\\d+)");
            if (id != null) return new String[]{"kugou", id};
        }
        if (u.contains("qishui") || u.contains("douyin")) {
            String id = firstMatch(u, "playlist[/=](\\d+)");
            if (id == null) id = firstMatch(u, "playlist_id=(\\d+)");
            if (id != null) return new String[]{"soda", id};
        }
        return null;
    }

    private static String firstMatch(String text, String regex) {
        java.util.regex.Matcher m = java.util.regex.Pattern.compile(regex).matcher(text);
        return m.find() ? m.group(1) : null;
    }

    private static Song songInfo(String uid) {
        String[] parts = splitUid(uid);
        if (parts == null) return null;
        String platform = parts[0], songId = parts[1];
        try {
            List<Song> songs;
            switch (platform) {
                case "netease":
                    songs = neSearch(songId);
                    break;
                case "qq":
                    songs = qqSearch(songId);
                    break;
                case "kugou":
                    // hash 无法反查，返回最小信息
                    return new Song("kugou", songId, songId, "", "", "", 0);
                case "soda":
                    songs = sodaSearch(songId);
                    break;
                default:
                    return null;
            }
            for (Song s : songs) {
                if (s.id.equals(songId)) return s;
            }
        } catch (Exception ignore) {
        }
        return null;
    }

    private static JSONObject songJson(Song s) {
        JSONObject o = new JSONObject();
        try {
            o.put("id", s.uid());
            o.put("name", s.name);
            o.put("artist", s.artist);
            o.put("album", s.album);
            o.put("cover", s.cover);
            o.put("duration", s.duration);
            o.put("platform", s.platform);
        } catch (Exception ignore) {
        }
        return o;
    }

    // ============================ 通用输出 ============================

    private static String songsToPageData(List<Song> songs, String coverFallback) {
        try {
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            for (Song s : songs) {
                JSONObject v = new JSONObject();
                v.put("vod_id", s.uid());
                v.put("vod_name", s.name);
                v.put("vod_pic", s.cover.isEmpty() ? coverFallback : s.cover);
                v.put("vod_remarks", s.artist);
                v.put("vod_actor", s.album);
                v.put("vod_content", s.artist + (s.album.isEmpty() ? "" : " · " + s.album));
                list.put(v);
            }
            result.put("list", list);
            result.put("page", 1);
            result.put("pagecount", 1);
            result.put("limit", 100);
            result.put("total", songs.size());
            return result.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String pageDataEmpty(int page) {
        try {
            JSONObject result = new JSONObject();
            result.put("list", new JSONArray());
            result.put("page", page);
            result.put("pagecount", page);
            result.put("limit", 20);
            result.put("total", 0);
            return result.toString();
        } catch (Exception e) {
            return "";
        }
    }
}
