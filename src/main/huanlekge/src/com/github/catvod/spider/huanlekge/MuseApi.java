package com.github.catvod.spider.huanlekge;

import android.util.Base64;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 欢唱K歌协议客户端：
 * conf/get → device-id/get → login → box-info/create → song/get-page → getSongFileUrl
 */
public final class MuseApi {

    public static final String MCONN = "https://mconn.cherryonline.cn/mad-api";
    public static final String PROXY = "http://hc.ac16.vip/cherry_proxy.php";
    private static final String UA = "okhttp/3.12.13";

    // 登录固定字段（逆向 ug1/fn/mr0 确认）
    private static final int VC = 22036;
    private static final String VN = "2.20.36.2607171808";
    private static final String CHANNEL = "tv";
    private static final String MODE = "ott";
    private static final String MODEL = "MBox";
    private static final String S8 = "com.origjoy.stream.tv";
    private static final String SA = "com.origjoy.stream.ktv.MuseApp";

    // 证书签名（从 APK META-INF 提取，固定值）
    private static final String SIGNATURE = "1d985754b5eadad98126a68beaf8fb4e";
    private static final String S7 = "e443a54d1a5424c3";

    private final AtomicReference<Session> sessRef = new AtomicReference<>();

    static final class Session {
        String deviceId;
        Map<String, String> cookies = new LinkedHashMap<>();
        long expireAt; // 简单过期时间戳
    }

    /** 歌曲信息。 */
    public static final class Song {
        public final String id;
        public final String tid;
        public final String name;
        public final String singer;
        public final String singerImage;

        Song(String id, String tid, String name, String singer, String singerImage) {
            this.id = id;
            this.tid = tid;
            this.name = name;
            this.singer = singer;
            this.singerImage = singerImage;
        }
    }

    /** 取流结果。 */
    public static final class StreamInfo {
        public final String url;
        public final String fid;
        public final String key16; // 媒体解密密钥（UTF-8）

        StreamInfo(String url, String fid, String key16) {
            this.url = url;
            this.fid = fid;
            this.key16 = key16;
        }
    }

    // ============================ 会话管理 ============================

    private Session session() {
        // 会话对象必须跨调用持久：登录链 post() 收集的 Set-Cookie 与 deviceId 都落在
        // session() 返回的同一对象上。旧判据 expireAt=0 时恒「过期」→ 每次调用都换新
        // 对象 → Cookie 永远攒不住 → 取流代理（cherry_proxy.php 校验
        // muse-portal-connector Cookie）收不到会话直接回 "Unauthorized"。
        // 过期重登交给 ensureLogin 判定（expireAt!=0 且已到期才清空重建）。
        Session s = sessRef.get();
        if (s == null) {
            s = new Session();
            sessRef.set(s);
        }
        return s;
    }

    /** 确保已登录（conf/get → device-id/get → login → box-info/create）。 */
    public synchronized void ensureLogin() throws Exception {
        Session s = session();
        if (s.deviceId != null && !s.cookies.isEmpty() && System.currentTimeMillis() < s.expireAt) {
            return;
        }
        s.cookies.clear();

        // 1. conf/get
        post(MCONN + "/v2/muse/conf/get", new JSONObject().put("device_id", "").toString(), false);

        // 2. device-id/get
        String devPayload = new JSONObject().put("channel", CHANNEL).put("mode", MODE).toString();
        JSONObject devReq = new JSONObject().put("data", MuseCrypto.rsaEncryptB64(devPayload));
        JSONObject devResp = new JSONObject(post(MCONN + "/v3/device-id/get", devReq.toString(), false));
        s.deviceId = devResp.getString("device_id");

        // 3. login（AES-GCM + RSA）
        byte[] iv = randBytes(12);
        JSONObject loginInfo = new JSONObject();
        loginInfo.put("device_id", s.deviceId);
        loginInfo.put("device_ids", new JSONArray().put(s.deviceId));
        loginInfo.put("signature", SIGNATURE);
        loginInfo.put("channel", CHANNEL);
        loginInfo.put("model", MODEL);
        loginInfo.put("vc", VC);
        loginInfo.put("vn", VN);
        loginInfo.put("mode", MODE);
        loginInfo.put("s1", MODEL);
        loginInfo.put("s2", "generic");
        loginInfo.put("s3", "amlogic");
        loginInfo.put("s4", "mbox");
        loginInfo.put("s5", "mbox");
        loginInfo.put("s6", "Generic");
        loginInfo.put("s7", S7);
        loginInfo.put("s8", S8);
        loginInfo.put("s9", md5Hex(s.deviceId));
        loginInfo.put("sa", SA);
        loginInfo.put("nonce", Base64.encodeToString(iv, Base64.NO_WRAP));
        loginInfo.put("sb", "0");

        byte[] aesKey = randBytes(16);
        byte[] plain = loginInfo.toString().getBytes(StandardCharsets.UTF_8);
        byte[] encData = MuseCrypto.aesGcmEncrypt(aesKey, iv, plain);
        JSONObject loginReq = new JSONObject();
        loginReq.put("encrypted_data", Base64.encodeToString(concat(iv, encData), Base64.NO_WRAP));
        loginReq.put("encrypted_key", MuseCrypto.rsaEncryptB64(Base64.encodeToString(aesKey, Base64.NO_WRAP)));
        post(MCONN + "/v3/login", loginReq.toString(), true);

        // 4. box-info/create（取流前必须调用）
        JSONObject box = new JSONObject();
        box.put("abi", "armeabi-v7a");
        box.put("android_id", s.deviceId);
        box.put("battery", 100);
        box.put("board", "mbox");
        box.put("brand", "generic");
        box.put("cpu", "armv7");
        box.put("device", "mbox");
        box.put("device_id", s.deviceId);
        box.put("mac", "");
        box.put("manufacturer", "Generic");
        box.put("model", MODEL);
        box.put("network", "ethernet");
        box.put("os_version", "7.1.2");
        box.put("product", "mbox");
        box.put("ram", "1GB");
        box.put("resolution", "1280x720");
        box.put("rom", "8GB");
        box.put("screen", "tv");
        box.put("serial", s.deviceId);
        post(MCONN + "/v3/box-info/create", box.toString(), true);

        s.expireAt = System.currentTimeMillis() + 6L * 60 * 60 * 1000; // 6 小时
    }

    /** 歌手信息。 */
    public static final class Singer {
        public final String id;
        public final String name;
        public final String image;
        public final String type; // 男 / 女

        Singer(String id, String name, String image, String type) {
            this.id = id;
            this.name = name;
            this.image = image;
            this.type = type;
        }
    }

    // ============================ 业务接口 ============================

    /** 分页获取歌曲列表（page_index 从 1 开始）。 */
    public Song[] getSongs(int pageIndex, int pageCount) throws Exception {
        return getSongs("", pageIndex, pageCount);
    }

    /**
     * 分页获取歌曲列表，keyword 非空时为搜索。
     * 服务端只匹配歌名与拼音首字母（name_cap）的子串，不匹配歌手名
     * （实测「歌名 歌手」合体词恒 0 命中，纯歌名才命中；传歌手名时改走 getSingers）。
     */
    public Song[] getSongs(String keyword, int pageIndex, int pageCount) throws Exception {
        ensureLogin();
        JSONObject req = new JSONObject();
        if (keyword != null && !keyword.isEmpty()) req.put("keyword", keyword);
        req.put("page_index", pageIndex);
        req.put("page_count", pageCount);
        JSONObject resp = new JSONObject(post(MCONN + "/v3/song/get-page", req.toString(), true));
        return parseSongs(resp);
    }

    /** 按歌手查歌曲列表。 */
    public Song[] getSongsBySinger(String singerId, int pageIndex, int pageCount) throws Exception {
        ensureLogin();
        JSONObject req = new JSONObject();
        req.put("singer_id", singerId);
        req.put("page_index", pageIndex);
        req.put("page_count", pageCount);
        JSONObject resp = new JSONObject(post(MCONN + "/v3/song/get-page", req.toString(), true));
        return parseSongs(resp);
    }

    /** 分页获取歌手列表，keyword 非空时为歌手搜索。 */
    public Singer[] getSingers(String keyword, int pageIndex, int pageCount) throws Exception {
        ensureLogin();
        JSONObject req = new JSONObject();
        if (keyword != null && !keyword.isEmpty()) req.put("keyword", keyword);
        req.put("page_index", pageIndex);
        req.put("page_count", pageCount);
        JSONObject resp = new JSONObject(post(MCONN + "/v3/singer/get-page", req.toString(), true));
        JSONArray list = resp.optJSONArray("list");
        if (list == null) return new Singer[0];
        Singer[] singers = new Singer[list.length()];
        for (int i = 0; i < list.length(); i++) {
            JSONObject s = list.getJSONObject(i);
            singers[i] = new Singer(
                    s.optString("id", ""),
                    s.optString("name", ""),
                    s.optString("image_url", ""),
                    s.optString("type", "")
            );
        }
        return singers;
    }

    private Song[] parseSongs(JSONObject resp) throws Exception {
        JSONArray list = resp.optJSONArray("list");
        if (list == null) return new Song[0];
        Song[] songs = new Song[list.length()];
        for (int i = 0; i < list.length(); i++) {
            JSONObject s = list.getJSONObject(i);
            String singer = "";
            String singerImg = "";
            JSONArray singers = s.optJSONArray("singers");
            if (singers != null && singers.length() > 0) {
                JSONObject sg = singers.getJSONObject(0);
                singer = sg.optString("name", "");
                singerImg = sg.optString("image_url", "");
            }
            songs[i] = new Song(
                    s.optString("id", ""),
                    s.optString("tid", ""),
                    s.optString("name", ""),
                    singer,
                    singerImg
            );
        }
        return songs;
    }

    /** 获取歌曲播放直链 + 解密密钥。 */
    public StreamInfo getStream(String tid) throws Exception {
        ensureLogin();
        String nonce = Base64.encodeToString(randBytes(12), Base64.NO_WRAP);
        JSONObject payload = new JSONObject();
        payload.put("tid", tid);
        payload.put("fid", "");
        payload.put("dyn_val", "");
        payload.put("nonce", nonce);
        payload.put("timestamp", System.currentTimeMillis());
        payload.put("algorithm_version", 1);

        JSONObject req = new JSONObject().put("encrypted_data", MuseCrypto.rsaEncryptB64(payload.toString()));
        JSONObject resp = new JSONObject(post(PROXY, req.toString(), true));

        String url = resp.optString("url", "");
        String fid = resp.optString("fid", "");
        String ek = resp.optString("encrypted_key", "");
        String key16 = "";
        if (!ek.isEmpty()) {
            byte[] kb = MuseCrypto.rsaDecryptB64(ek);
            key16 = new String(kb, StandardCharsets.UTF_8);
        }
        return new StreamInfo(url, fid, key16);
    }

    // ============================ HTTP ============================

    private String post(String urlStr, String body, boolean withCookie) throws Exception {
        HttpURLConnection conn = (HttpURLConnection) new URL(urlStr).openConnection();
        conn.setConnectTimeout(15000);
        conn.setReadTimeout(30000);
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        conn.setRequestProperty("User-Agent", UA);
        if (withCookie) {
            Session s = session();
            if (!s.cookies.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, String> e : s.cookies.entrySet()) {
                    if (sb.length() > 0) sb.append("; ");
                    sb.append(e.getKey()).append("=").append(e.getValue());
                }
                conn.setRequestProperty("Cookie", sb.toString());
            }
        }
        byte[] bodyBytes = body.getBytes(StandardCharsets.UTF_8);
        conn.getOutputStream().write(bodyBytes);

        int code = conn.getResponseCode();
        // 收集 Set-Cookie
        Map<String, String> cookies = session().cookies;
        for (int i = 0; ; i++) {
            String key = conn.getHeaderFieldKey(i);
            String val = conn.getHeaderField(i);
            if (key == null && val == null) break;
            if ("Set-Cookie".equalsIgnoreCase(key) && val != null) {
                String kv = val.split(";")[0];
                int eq = kv.indexOf('=');
                if (eq > 0) cookies.put(kv.substring(0, eq).trim(), kv.substring(eq + 1).trim());
            }
        }

        InputStream in = (code >= 400) ? conn.getErrorStream() : conn.getInputStream();
        if (in == null) in = conn.getInputStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[8192];
        int n;
        while ((n = in.read(buf)) > 0) out.write(buf, 0, n);
        in.close();
        conn.disconnect();
        String result = new String(out.toByteArray(), StandardCharsets.UTF_8);
        if (code >= 400) {
            throw new RuntimeException("http " + code + ": " + result.substring(0, Math.min(200, result.length())));
        }
        return result;
    }

    /** 下载完整文件（用于代理解密）。 */
    public static byte[] downloadFull(String urlStr) throws Exception {
        HttpURLConnection conn = (HttpURLConnection) new URL(urlStr).openConnection();
        conn.setConnectTimeout(15000);
        conn.setReadTimeout(60000);
        conn.setRequestMethod("GET");
        conn.setRequestProperty("User-Agent", UA);
        conn.setRequestProperty("Accept", "*/*");
        int code = conn.getResponseCode();
        if (code >= 400) throw new RuntimeException("download http " + code);
        InputStream in = conn.getInputStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[65536];
        int n;
        while ((n = in.read(buf)) > 0) out.write(buf, 0, n);
        in.close();
        conn.disconnect();
        return out.toByteArray();
    }

    // ============================ 工具 ============================

    private static byte[] randBytes(int len) {
        byte[] b = new byte[len];
        new java.util.Random().nextBytes(b);
        return b;
    }

    private static byte[] concat(byte[] a, byte[] b) {
        byte[] out = new byte[a.length + b.length];
        System.arraycopy(a, 0, out, 0, a.length);
        System.arraycopy(b, 0, out, a.length, b.length);
        return out;
    }

    private static String md5Hex(String s) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] d = md.digest(s.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder(d.length * 2);
        for (byte v : d) sb.append(String.format("%02x", v & 0xff));
        return sb.toString();
    }
}
