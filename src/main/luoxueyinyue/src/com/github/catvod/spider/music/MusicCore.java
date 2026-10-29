package com.github.catvod.spider.music;

import android.util.Base64;

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
 * 果果音乐公共核心（六平台实现，jar 内共享；壳不解析资源，全部经本接口）。
 * 数据蓝本：music-lib（多平台 provider）+ 新增 kuwo/migu（music-lib 同构端点移植）。
 *
 * 平台：netease(芸)/ qq(秋) / kugou(枸) / soda(水) / kuwo(蜗) / migu(蜜) —— 内部平台代码，展示名见 platformName。
 * 歌曲统一 uid = {platform}_{songid}（kugou=hash、soda=trackid、kuwo=rid、migu=contentId）。
 *
 * 协议（对壳端 SourceViewModel / MusicSession 透明复用）：
 *  - homeContent：平台分类 + 榜单/歌单 tabs（聚合源=all 六平台搜索；独立源=本平台内容）
 *  - categoryContent：榜单目录（{p}_rank）/ 歌单列表（netease）/ 热歌直出（hot）
 *  - detailContent({p}_toplist_{id} | {p}_playlist_{id})：榜内/歌单内歌曲 = 播放集
 *  - searchContent：独立源仅本平台；聚合源六平台并行交错
 *  - playerContent(flag="果剧音乐")：音频直链 + lyric(LRC)/klyric(逐词)/accompany/trackMode/mv
 *                     flag="MV"：MV 视频直链
 *  - action：song:{uid} / search:{p}:{kw} / playlist:{p}:{id} / playlistUrl:{url}
 */
public final class MusicCore {

    private static final String TAG = "echo-music-jar";
    public static final String PLAY_FLAG = "果剧音乐";

    public static final String[] PLATFORMS = {"netease", "qq", "kugou", "soda", "kuwo", "migu"};

    private MusicCore() {
    }

    // ============================ 日志桥接（与 guoguoduanju 同机制） ============================

    private static Spider host;

    /** 壳反射加载 Spider 时由子类 init 传入（借 stub 的 mContext 桥接日志）。 */
    public static void bindHost(Spider spider) {
        host = spider;
    }

    public static void fileLog(String msg) {
        android.util.Log.e(TAG, msg);
        try {
            Class<?> lw = Class.forName("com.github.gcd888.guoju.util.LogWriter");
            lw.getMethod("i", String.class).invoke(null, "echo-music jar: " + msg);
            return;
        } catch (Throwable ignored) {
        }
        try {
            android.content.Context ctx = hostContext();
            if (ctx == null) return;
            java.io.File dir = ctx.getExternalFilesDir(null);
            if (dir == null) return;
            java.io.File f = new java.io.File(dir, "guoguoyinyue_spider.log");
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

    /** 运行时壳上下文（stub 反射读取 Spider.mContext）。 */
    private static android.content.Context hostContext() {
        try {
            java.lang.reflect.Field f = Spider.class.getDeclaredField("mContext");
            f.setAccessible(true);
            return (android.content.Context) f.get(host);
        } catch (Throwable t) {
            return null;
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

    private static String getText(String url, Map<String, String> headers) throws Exception {
        return new String(httpGet(url, headers), StandardCharsets.UTF_8);
    }

    private static Map<String, String> headers(String... kv) {
        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i + 1 < kv.length; i += 2) map.put(kv[i], kv[i + 1]);
        return map;
    }

    /** 随机国内 IP 头（kuwo/migu/kugou 防频控，music-lib WithRandomIPHeader 同语义）。 */
    private static Map<String, String> withRandomIp(Map<String, String> base) {
        if (base == null) base = new LinkedHashMap<>();
        if (base.containsKey("X-Forwarded-For")) return base;
        Random r = new Random();
        int[][] prefixes = {{116, 255}, {116, 228}, {218, 192}, {124, 0}, {14, 132},
                {183, 14}, {58, 14}, {113, 116}, {120, 230}};
        int[] seg = prefixes[r.nextInt(prefixes.length)];
        String ip = seg[0] + "." + seg[1] + "." + (1 + r.nextInt(254)) + "." + (1 + r.nextInt(254));
        base.put("X-Forwarded-For", ip);
        base.put("X-Real-IP", ip);
        return base;
    }

    private static String enc(String v) {
        try {
            return java.net.URLEncoder.encode(v, "UTF-8").replace("+", "%20");
        } catch (Exception e) {
            return v;
        }
    }

    private static String firstNonEmpty(String... values) {
        for (String v : values) {
            if (v != null && !v.trim().isEmpty()) return v.trim();
        }
        return "";
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

    /** QRC 3DES 密钥（music-lib lyrics.qrcKey 同源）。 */
    private static final byte[] QRC_KEY = "!@#)(*$%123ZXC!@!@#)(NHL".getBytes(StandardCharsets.UTF_8);

    /** QRC 解密（music-lib qrc_des 自写 DES 移植——QQ QRC 的位编址与标准 DES 库不同，
     *  Java 标准 DESede 解不出，必须用本实现）：HEX → 逐 8 字节 3DES(D-E-D) → zlib。 */
    static String decryptQRC(String hexContent) {
        try {
            byte[] enc = hexBytes(hexContent.trim());
            if (enc.length % 8 != 0) {
                fileLog("decryptQRC bad len " + enc.length);
                return "";
            }
            long[][][] keys = new long[][][]{
                    qrcKeySchedule(slice(QRC_KEY, 16), 0),  // decrypt
                    qrcKeySchedule(slice(QRC_KEY, 8), 1),   // encrypt
                    qrcKeySchedule(slice(QRC_KEY, 0), 0),   // decrypt
            };
            byte[] plain = new byte[enc.length];
            for (int i = 0; i < enc.length; i += 8) {
                byte[] block = new byte[8];
                System.arraycopy(enc, i, block, 0, 8);
                for (long[][] key : keys) block = qrcDESCrypt(block, key);
                System.arraycopy(block, 0, plain, i, 8);
            }
            String out = zlibInflate(plain);
            if (out.isEmpty()) fileLog("decryptQRC inflate empty");
            return out;
        } catch (Exception e) {
            fileLog("decryptQRC FAIL: " + e);
            return "";
        }
    }

    private static byte[] slice(byte[] a, int from) {
        byte[] out = new byte[a.length - from];
        System.arraycopy(a, from, out, 0, out.length);
        return out;
    }

    // ---- music-lib qrc_des.go 移植（uint32 → long 低 32 位） ----

    private static final byte[][] QRC_SBOX = {
            {14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7, 0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8, 4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0, 15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13},
            {15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10, 3, 13, 4, 7, 15, 2, 8, 15, 12, 0, 1, 10, 6, 9, 11, 5, 0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15, 13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9},
            {10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8, 13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1, 13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7, 1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12},
            {7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15, 13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9, 10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4, 3, 15, 0, 6, 10, 10, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14},
            {2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9, 14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6, 4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14, 11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3},
            {12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11, 10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8, 9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6, 4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13},
            {4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1, 13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6, 1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2, 6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12},
            {13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7, 1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2, 7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8, 2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11},
    };

    private static final int[] QRC_KEY_RND_SHIFT = {1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1};
    private static final int[] QRC_KEY_PERM_C = {56, 48, 40, 32, 24, 16, 8, 0, 57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35};
    private static final int[] QRC_KEY_PERM_D = {62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 60, 52, 44, 36, 28, 20, 12, 4, 27, 19, 11, 3};
    private static final int[] QRC_KEY_COMPRESSION = {13, 16, 10, 23, 0, 4, 2, 27, 14, 5, 20, 9, 22, 18, 11, 3, 25, 7, 15, 6, 26, 19, 12, 1, 40, 51, 30, 36, 46, 54, 29, 39, 50, 44, 32, 47, 43, 48, 38, 55, 33, 52, 45, 41, 49, 35, 28, 31};

    /** a 的第 b 位（特殊 32 位字编址）左移 c 位。 */
    private static long qrcBitNum(byte[] a, int b, int c) {
        return (long) ((a[(b / 32) * 4 + 3 - (b % 32) / 8] >> (7 - b % 8)) & 1) << c;
    }

    private static long qrcBitNumIntr(long a, int b, int c) {
        return ((a >>> (31 - b)) & 1L) << c;
    }

    private static long qrcBitNumIntl(long a, int b, int c) {
        return (((a << b) & 0xFFFFFFFFL) & 0x80000000L) >>> c;
    }

    private static byte qrcSBoxBit(byte a) {
        return (byte) ((a & 32) | ((a & 31) >> 1) | ((a & 1) << 4));
    }

    private static long[] qrcInitialPermutation(byte[] input) {
        long s0 = qrcBitNum(input, 57, 31) | qrcBitNum(input, 49, 30) | qrcBitNum(input, 41, 29) | qrcBitNum(input, 33, 28)
                | qrcBitNum(input, 25, 27) | qrcBitNum(input, 17, 26) | qrcBitNum(input, 9, 25) | qrcBitNum(input, 1, 24)
                | qrcBitNum(input, 59, 23) | qrcBitNum(input, 51, 22) | qrcBitNum(input, 43, 21) | qrcBitNum(input, 35, 20)
                | qrcBitNum(input, 27, 19) | qrcBitNum(input, 19, 18) | qrcBitNum(input, 11, 17) | qrcBitNum(input, 3, 16)
                | qrcBitNum(input, 61, 15) | qrcBitNum(input, 53, 14) | qrcBitNum(input, 45, 13) | qrcBitNum(input, 37, 12)
                | qrcBitNum(input, 29, 11) | qrcBitNum(input, 21, 10) | qrcBitNum(input, 13, 9) | qrcBitNum(input, 5, 8)
                | qrcBitNum(input, 63, 7) | qrcBitNum(input, 55, 6) | qrcBitNum(input, 47, 5) | qrcBitNum(input, 39, 4)
                | qrcBitNum(input, 31, 3) | qrcBitNum(input, 23, 2) | qrcBitNum(input, 15, 1) | qrcBitNum(input, 7, 0);
        long s1 = qrcBitNum(input, 56, 31) | qrcBitNum(input, 48, 30) | qrcBitNum(input, 40, 29) | qrcBitNum(input, 32, 28)
                | qrcBitNum(input, 24, 27) | qrcBitNum(input, 16, 26) | qrcBitNum(input, 8, 25) | qrcBitNum(input, 0, 24)
                | qrcBitNum(input, 58, 23) | qrcBitNum(input, 50, 22) | qrcBitNum(input, 42, 21) | qrcBitNum(input, 34, 20)
                | qrcBitNum(input, 26, 19) | qrcBitNum(input, 18, 18) | qrcBitNum(input, 10, 17) | qrcBitNum(input, 2, 16)
                | qrcBitNum(input, 60, 15) | qrcBitNum(input, 52, 14) | qrcBitNum(input, 44, 13) | qrcBitNum(input, 36, 12)
                | qrcBitNum(input, 28, 11) | qrcBitNum(input, 20, 10) | qrcBitNum(input, 12, 9) | qrcBitNum(input, 4, 8)
                | qrcBitNum(input, 62, 7) | qrcBitNum(input, 54, 6) | qrcBitNum(input, 46, 5) | qrcBitNum(input, 38, 4)
                | qrcBitNum(input, 30, 3) | qrcBitNum(input, 22, 2) | qrcBitNum(input, 14, 1) | qrcBitNum(input, 6, 0);
        return new long[]{s0, s1};
    }

    private static byte[] qrcInversePermutation(long s0, long s1) {
        byte[] data = new byte[8];
        data[3] = (byte) (qrcBitNumIntr(s1, 7, 7) | qrcBitNumIntr(s0, 7, 6) | qrcBitNumIntr(s1, 15, 5) | qrcBitNumIntr(s0, 15, 4)
                | qrcBitNumIntr(s1, 23, 3) | qrcBitNumIntr(s0, 23, 2) | qrcBitNumIntr(s1, 31, 1) | qrcBitNumIntr(s0, 31, 0));
        data[2] = (byte) (qrcBitNumIntr(s1, 6, 7) | qrcBitNumIntr(s0, 6, 6) | qrcBitNumIntr(s1, 14, 5) | qrcBitNumIntr(s0, 14, 4)
                | qrcBitNumIntr(s1, 22, 3) | qrcBitNumIntr(s0, 22, 2) | qrcBitNumIntr(s1, 30, 1) | qrcBitNumIntr(s0, 30, 0));
        data[1] = (byte) (qrcBitNumIntr(s1, 5, 7) | qrcBitNumIntr(s0, 5, 6) | qrcBitNumIntr(s1, 13, 5) | qrcBitNumIntr(s0, 13, 4)
                | qrcBitNumIntr(s1, 21, 3) | qrcBitNumIntr(s0, 21, 2) | qrcBitNumIntr(s1, 29, 1) | qrcBitNumIntr(s0, 29, 0));
        data[0] = (byte) (qrcBitNumIntr(s1, 4, 7) | qrcBitNumIntr(s0, 4, 6) | qrcBitNumIntr(s1, 12, 5) | qrcBitNumIntr(s0, 12, 4)
                | qrcBitNumIntr(s1, 20, 3) | qrcBitNumIntr(s0, 20, 2) | qrcBitNumIntr(s1, 28, 1) | qrcBitNumIntr(s0, 28, 0));
        data[7] = (byte) (qrcBitNumIntr(s1, 3, 7) | qrcBitNumIntr(s0, 3, 6) | qrcBitNumIntr(s1, 11, 5) | qrcBitNumIntr(s0, 11, 4)
                | qrcBitNumIntr(s1, 19, 3) | qrcBitNumIntr(s0, 19, 2) | qrcBitNumIntr(s1, 27, 1) | qrcBitNumIntr(s0, 27, 0));
        data[6] = (byte) (qrcBitNumIntr(s1, 2, 7) | qrcBitNumIntr(s0, 2, 6) | qrcBitNumIntr(s1, 10, 5) | qrcBitNumIntr(s0, 10, 4)
                | qrcBitNumIntr(s1, 18, 3) | qrcBitNumIntr(s0, 18, 2) | qrcBitNumIntr(s1, 26, 1) | qrcBitNumIntr(s0, 26, 0));
        data[5] = (byte) (qrcBitNumIntr(s1, 1, 7) | qrcBitNumIntr(s0, 1, 6) | qrcBitNumIntr(s1, 9, 5) | qrcBitNumIntr(s0, 9, 4)
                | qrcBitNumIntr(s1, 17, 3) | qrcBitNumIntr(s0, 17, 2) | qrcBitNumIntr(s1, 25, 1) | qrcBitNumIntr(s0, 25, 0));
        data[4] = (byte) (qrcBitNumIntr(s1, 0, 7) | qrcBitNumIntr(s0, 0, 6) | qrcBitNumIntr(s1, 8, 5) | qrcBitNumIntr(s0, 8, 4)
                | qrcBitNumIntr(s1, 16, 3) | qrcBitNumIntr(s0, 16, 2) | qrcBitNumIntr(s1, 24, 1) | qrcBitNumIntr(s0, 24, 0));
        return data;
    }

    private static long qrcF(long state, long[] key) {
        long t1 = qrcBitNumIntl(state, 31, 0) | ((state & 0xf0000000L) >>> 1) | qrcBitNumIntl(state, 4, 5)
                | qrcBitNumIntl(state, 3, 6) | ((state & 0x0f000000L) >>> 3) | qrcBitNumIntl(state, 8, 11)
                | qrcBitNumIntl(state, 7, 12) | ((state & 0x00f00000L) >>> 5) | qrcBitNumIntl(state, 12, 17)
                | qrcBitNumIntl(state, 11, 18) | ((state & 0x000f0000L) >>> 7) | qrcBitNumIntl(state, 16, 23);
        long t2 = qrcBitNumIntl(state, 15, 0) | ((state & 0x0000f000L) << 15) | qrcBitNumIntl(state, 20, 5)
                | qrcBitNumIntl(state, 19, 6) | ((state & 0x00000f00L) << 13) | qrcBitNumIntl(state, 24, 11)
                | qrcBitNumIntl(state, 23, 12) | ((state & 0x000000f0L) << 11) | qrcBitNumIntl(state, 28, 17)
                | qrcBitNumIntl(state, 27, 18) | ((state & 0x0000000fL) << 9) | qrcBitNumIntl(state, 0, 23);
        byte[] lrg = {(byte) (t1 >> 24), (byte) (t1 >> 16), (byte) (t1 >> 8), (byte) (t2 >> 24), (byte) (t2 >> 16), (byte) (t2 >> 8)};
        for (int i = 0; i < lrg.length; i++) lrg[i] ^= key[i];
        long s = (long) QRC_SBOX[0][qrcSBoxBit((byte) (lrg[0] >>> 2))] << 28
                | (long) QRC_SBOX[1][qrcSBoxBit((byte) (((lrg[0] & 0x03) << 4) | ((lrg[1] & 0xFF) >> 4)))] << 24
                | (long) QRC_SBOX[2][qrcSBoxBit((byte) (((lrg[1] & 0x0f) << 2) | ((lrg[2] & 0xFF) >> 6)))] << 20
                | (long) QRC_SBOX[3][qrcSBoxBit((byte) (lrg[2] & 0x3f))] << 16
                | (long) QRC_SBOX[4][qrcSBoxBit((byte) (lrg[3] >>> 2))] << 12
                | (long) QRC_SBOX[5][qrcSBoxBit((byte) (((lrg[3] & 0x03) << 4) | ((lrg[4] & 0xFF) >> 4)))] << 8
                | (long) QRC_SBOX[6][qrcSBoxBit((byte) (((lrg[4] & 0x0f) << 2) | ((lrg[5] & 0xFF) >> 6)))] << 4
                | (long) QRC_SBOX[7][qrcSBoxBit((byte) (lrg[5] & 0x3f))];
        return qrcBitNumIntl(s, 15, 0) | qrcBitNumIntl(s, 6, 1) | qrcBitNumIntl(s, 19, 2)
                | qrcBitNumIntl(s, 20, 3) | qrcBitNumIntl(s, 28, 4) | qrcBitNumIntl(s, 11, 5)
                | qrcBitNumIntl(s, 27, 6) | qrcBitNumIntl(s, 16, 7) | qrcBitNumIntl(s, 0, 8)
                | qrcBitNumIntl(s, 14, 9) | qrcBitNumIntl(s, 22, 10) | qrcBitNumIntl(s, 25, 11)
                | qrcBitNumIntl(s, 4, 12) | qrcBitNumIntl(s, 17, 13) | qrcBitNumIntl(s, 30, 14)
                | qrcBitNumIntl(s, 9, 15) | qrcBitNumIntl(s, 1, 16) | qrcBitNumIntl(s, 7, 17)
                | qrcBitNumIntl(s, 23, 18) | qrcBitNumIntl(s, 13, 19) | qrcBitNumIntl(s, 31, 20)
                | qrcBitNumIntl(s, 26, 21) | qrcBitNumIntl(s, 2, 22) | qrcBitNumIntl(s, 8, 23)
                | qrcBitNumIntl(s, 18, 24) | qrcBitNumIntl(s, 12, 25) | qrcBitNumIntl(s, 29, 26)
                | qrcBitNumIntl(s, 5, 27) | qrcBitNumIntl(s, 21, 28) | qrcBitNumIntl(s, 10, 29)
                | qrcBitNumIntl(s, 3, 30) | qrcBitNumIntl(s, 24, 31);
    }

    private static byte[] qrcDESCrypt(byte[] input, long[][] key) {
        long[] si = qrcInitialPermutation(input);
        long s0 = si[0], s1 = si[1];
        for (int i = 0; i < 15; i++) {
            long prev = s1;
            s1 = qrcF(s1, key[i]) ^ s0;
            s0 = prev;
        }
        s0 = qrcF(s1, key[15]) ^ s0;
        return qrcInversePermutation(s0, s1);
    }

    private static long[][] qrcKeySchedule(byte[] key, int mode) {
        long[][] schedule = new long[16][6];
        long c = 0, d = 0;
        for (int i = 0; i < 28; i++) {
            c += qrcBitNum(key, QRC_KEY_PERM_C[i], 31 - i);
            d += qrcBitNum(key, QRC_KEY_PERM_D[i], 31 - i);
        }
        for (int i = 0; i < 16; i++) {
            int shift = QRC_KEY_RND_SHIFT[i];
            c = (((c << shift) & 0xFFFFFFFFL) | (c >>> (28 - shift))) & 0xFFFFFFF0L;
            d = (((d << shift) & 0xFFFFFFFFL) | (d >>> (28 - shift))) & 0xFFFFFFF0L;
            int toGen = mode == 1 ? i : 15 - i;
            for (int j = 0; j < 24; j++) {
                schedule[toGen][j / 8] |= qrcBitNumIntr(c, QRC_KEY_COMPRESSION[j], 7 - (j % 8));
            }
            for (int j = 24; j < 48; j++) {
                schedule[toGen][j / 8] |= qrcBitNumIntr(d, QRC_KEY_COMPRESSION[j] - 27, 7 - (j % 8));
            }
        }
        return schedule;
    }

    private static final byte[] KRC_KEY = {0x40, 0x47, 0x61, 0x77, 0x5e, 0x32, 0x74, 0x47,
            0x51, 0x36, 0x31, 0x2d, (byte) 0xce, (byte) 0xd2, 0x6e, 0x69};

    /** KRC 解密：Base64 → 跳过 4 字节魔数头 → 逐字节 XOR(16字节key) → zlib inflate（music-lib 同构）。 */
    private static String decryptKRC(String base64Content) {
        try {
            byte[] decoded = Base64.decode(base64Content.trim(), Base64.DEFAULT);
            if (decoded.length <= 4) return "";
            byte[] data = java.util.Arrays.copyOfRange(decoded, 4, decoded.length);
            for (int i = 0; i < data.length; i++) data[i] ^= KRC_KEY[i % KRC_KEY.length];
            String out = zlibInflate(data);
            if (out.isEmpty()) fileLog("decryptKRC inflate empty len=" + data.length
                    + " head=" + String.format("%02x%02x%02x", data[0], data[1], data[2]));
            return out;
        } catch (Exception e) {
            fileLog("decryptKRC FAIL: " + e);
            return "";
        }
    }

    private static String zlibInflate(byte[] data) {
        try {
            return new String(zlibInflateBytes(data), StandardCharsets.UTF_8);
        } catch (Exception e) {
            return "";
        }
    }

    /** zlib inflate → byte[]（酷我 newlyric 载体需要字节层再解 base64）。 */
    private static byte[] zlibInflateBytes(byte[] data) throws Exception {
        Inflater inflater = new Inflater();
        try {
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
            return out.toByteArray();
        } finally {
            inflater.end();
        }
    }

    // ============================ 数据模型 ============================

    public static final class Song {
        public final String platform;
        public final String id;        // 平台内原始 id（netease 数字 / qq songmid / kugou hash / soda trackid / kuwo rid / migu contentId）
        public String name;
        public String artist;
        public final String album;
        public final String cover;
        public final int duration;     // 秒
        public String mvid = "";       // netease mvid / qq vid（MV 可选展示）
        public String songNumId = "";  // qq 数字 songid（PlayLyricInfo 必须，与 mvid 独立保存）
        public boolean hasK = true;    // 可K歌（有逐词歌词且可播）

        public Song(String platform, String id, String name, String artist, String album, String cover, int duration) {
            this.platform = platform;
            this.id = id;
            this.name = name;
            this.artist = artist;
            this.album = album;
            this.cover = cover;
            this.duration = duration;
        }

        /** 壳侧统一歌曲 id：{platform}_{songid} */
        public String uid() {
            return platform + "_" + id;
        }
    }

    /** 解析壳侧统一 id（{platform}_{songid}），kugou/soda/kuwo 内部 id 含下划线时按首段切分。 */
    public static String[] splitUid(String uid) {
        int bar = uid.indexOf('_');
        if (bar <= 0) return null;
        return new String[]{uid.substring(0, bar), uid.substring(bar + 1)};
    }

    public static String platformName(String platform) {
        if (platform == null) return "";
        switch (platform) {
            case "netease":
                return "果果芸";
            case "qq":
                return "果果秋";
            case "kugou":
                return "果果枸";
            case "soda":
                return "果果水";
            case "kuwo":
                return "果果蜗";
            case "migu":
                return "果果蜜";
            default:
                return platform;
        }
    }

    // ============================ 网易云（netease） ============================

    private static final String NE_REFERER = "http://music.163.com";

    private static Map<String, String> neHeaders() {
        return headers("Referer", NE_REFERER, "Cookie", "os=pc; appver=2.10.13");
    }

    /** 网易云搜索（linux/forward 通道 + cloudsearch/pc，music-lib 同端点）。 */
    public static List<Song> neSearch(String kw) throws Exception {
        String payload = new JSONObject()
                .put("method", "POST")
                .put("url", "http://music.163.com/api/cloudsearch/pc")
                .put("params", new JSONObject()
                        .put("s", kw).put("type", 1).put("offset", 0).put("limit", 30))
                .toString();
        JSONObject resp = postJson("http://music.163.com/api/linux/forward",
                withRandomIp(headers("Referer", NE_REFERER,
                        "User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:81.0) Gecko/20100101 Firefox/81.0",
                        "Content-Type", "application/x-www-form-urlencoded")),
                "eparams=" + linuxEparams(payload));
        JSONArray songs = resp.optJSONObject("result") == null ? null : resp.getJSONObject("result").optJSONArray("songs");
        if (songs == null) fileLog("neSearch empty kw=" + kw + " resp=" + resp.toString().substring(0, Math.min(200, resp.toString().length())));
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
            JSONObject priv = s.optJSONObject("privilege");
            if (priv != null && (priv.optInt("st", 0) == -200 || priv.optInt("fee", 0) == 1)) {
                song.hasK = false;
            }
            out.add(song);
        }
        return out;
    }

    /** 网易云榜单/歌单歌曲（公开 api/playlist/detail，榜单即特殊歌单）。 */
    public static List<Song> nePlaylistSongs(String playlistId) throws Exception {
        JSONObject resp = getJson("https://music.163.com/api/playlist/detail?id=" + enc(playlistId), neHeaders());
        JSONObject result = resp.optJSONObject("result");
        if (result == null) return new ArrayList<>();
        return neParseSongs(result.optJSONArray("tracks"));
    }

    /** 网易云歌单分类目录（失败回退内置常用分类）。 */
    public static List<String> neCatlist() {
        try {
            JSONObject resp = getJson("https://music.163.com/api/playlist/catlist", neHeaders());
            JSONArray sub = resp.optJSONArray("sub");
            List<String> out = new ArrayList<>();
            if (sub != null) {
                for (int i = 0; i < sub.length(); i++) {
                    JSONObject c = sub.optJSONObject(i);
                    if (c == null) continue;
                    String name = c.optString("name", "").trim();
                    if (!name.isEmpty() && !out.contains(name)) out.add(name);
                }
            }
            if (!out.isEmpty()) return out;
        } catch (Exception e) {
            fileLog("neCatlist FAIL: " + e);
        }
        return java.util.Arrays.asList("华语", "流行", "摇滚", "民谣", "电子", "说唱", "古风",
                "轻音乐", "爵士", "ACG", "R&B/Soul", "欧美", "日语", "韩语", "粤语", "早晨", "夜晚", "学习");
    }

    /** 网易云歌单列表（/api/playlist/list，cat 筛选 + 30/页分页，order=hot）。 */
    private static List<JSONObject> nePlaylists(String cat, int page) throws Exception {
        String url = "https://music.163.com/api/playlist/list?limit=30&order=hot&total=true"
                + "&offset=" + ((page - 1) * 30)
                + ("全部".equals(cat) || cat.isEmpty() ? "" : "&cat=" + enc(cat));
        JSONObject resp = getJson(url, neHeaders());
        JSONArray arr = resp.optJSONArray("playlists");
        List<JSONObject> out = new ArrayList<>();
        if (arr == null) return out;
        for (int i = 0; i < arr.length(); i++) {
            JSONObject p = arr.optJSONObject(i);
            if (p == null || p.optLong("id", 0) <= 0) continue;
            out.add(p);
        }
        return out;
    }

    /** 网易云精品歌单（聚合源推荐模式数据源）。 */
    private static List<JSONObject> neHighquality(int limit) throws Exception {
        JSONObject resp = getJson("https://music.163.com/api/playlist/highquality/list?limit=" + limit, neHeaders());
        JSONArray arr = resp.optJSONArray("playlists");
        List<JSONObject> out = new ArrayList<>();
        if (arr == null) return out;
        for (int i = 0; i < arr.length(); i++) {
            JSONObject p = arr.optJSONObject(i);
            if (p == null || p.optLong("id", 0) <= 0) continue;
            out.add(p);
        }
        return out;
    }

    /** 网易云歌单元数据（[name, coverImgUrl]）。 */
    private static String[] nePlaylistMeta(String playlistId) {
        try {
            JSONObject resp = getJson("https://music.163.com/api/playlist/detail?id=" + enc(playlistId), neHeaders());
            JSONObject result = resp.optJSONObject("result");
            if (result == null) return new String[]{"", ""};
            return new String[]{result.optString("name", ""), result.optString("coverImgUrl", "")};
        } catch (Exception e) {
            fileLog("nePlaylistMeta FAIL id=" + playlistId + " : " + e);
            return new String[]{"", ""};
        }
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

    /** 网易云歌词（weapi song/lyric）：[LRC, 逐词YRC]。 */
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
        String songId = String.valueOf(s.optLong("songid", s.optLong("id", 0)));
        song.songNumId = songId;
        song.mvid = "qqmeta:" + songId + ":" + albumMid;
        JSONObject mv = s.optJSONObject("mv");
        if (mv != null && !mv.optString("vid", "").isEmpty()) {
            song.mvid = mv.optString("vid");
        } else {
            String mvStr = s.optString("mv", "");
            if (!mvStr.isEmpty() && mv == null) song.mvid = mvStr;
        }
        return song;
    }

    /** QQ 榜单歌曲（fcg_v8_toplist_cp）。 */
    public static List<Song> qqToplistSongs(String topId) throws Exception {
        String url = "https://c.y.qq.com/v8/fcg-bin/fcg_v8_toplist_cp.fcg?" +
                "topid=" + enc(topId) + "&song_begin=0&song_num=100&format=json" +
                "&inCharset=utf8&outCharset=utf-8&notice=0&platform=h5&needNewCode=1&tpl=3&page=detail&type=top";
        JSONObject resp = getJson(url, headers("Referer", QQ_REFERER, "User-Agent", WEB_UA));
        if (resp.optInt("code", -1) != 0) return new ArrayList<>();
        return qqParseSongList(resp.optJSONArray("songlist"));
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

    /** QQ 搜索（search_for_qq_cp 老接口，music-lib 同端点；old 命名结构）。 */
    public static List<Song> qqSearch(String kw) throws Exception {
        String url = "http://c.y.qq.com/soso/fcgi-bin/search_for_qq_cp?" +
                "w=" + enc(kw) + "&format=json&p=1&n=30";
        JSONObject resp = getJson(url, withRandomIp(headers("Referer", QQ_REFERER,
                "User-Agent", KG_UA)));
        JSONObject data = resp.optJSONObject("data");
        JSONObject song = data == null ? null : data.optJSONObject("song");
        if (song == null) {
            fileLog("qqSearch empty kw=" + kw + " code=" + resp.opt("code"));
            return new ArrayList<>();
        }
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
    public static List<Song> qqPlaylistSongs(String disstid) throws Exception {
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
            JSONObject info0 = midurlinfo.optJSONObject(0);
            fileLog("qqStream empty songmid=" + songmid
                    + " errcode=" + (info0 == null ? "-" : info0.opt("errcode"))
                    + " filename=" + (info0 == null ? "-" : info0.opt("filename")));
            return "";
        }
        fileLog("qqStream no midurlinfo songmid=" + songmid + " code=" + (req1 == null ? "-" : req1.opt("code")));
        return "";
    }

    /** QQ songmid→单曲详情（fcg_play_single_song：数字 id/歌名/歌手/专辑/时长；歌词与取流共用）。 */
    private static final Map<String, Song> qqDetailCache = new HashMap<>();

    private static Song qqSongDetail(String songmid) {
        synchronized (qqDetailCache) {
            Song cached = qqDetailCache.get(songmid);
            if (cached != null) return cached;
        }
        try {
            JSONObject resp = getJson("https://c.y.qq.com/v8/fcg-bin/fcg_play_single_song.fcg?" +
                            "songmid=" + enc(songmid) + "&format=json",
                    headers("Referer", QQ_REFERER, "User-Agent", WEB_UA));
            JSONArray data = resp.optJSONArray("data");
            if (data != null && data.length() > 0) {
                Song s = qqParseSong(data.getJSONObject(0));
                if (s != null) {
                    synchronized (qqDetailCache) {
                        qqDetailCache.put(songmid, s);
                    }
                    fileLog("qqSongDetail ok songmid=" + songmid + " id=" + s.mvid);
                    return s;
                }
            }
            fileLog("qqSongDetail empty songmid=" + songmid + " code=" + resp.opt("code"));
        } catch (Exception e) {
            fileLog("qqSongDetail FAIL songmid=" + songmid + " : " + e);
        }
        return null;
    }

    /** QQ songmid→数字 songid（PlayLyricInfo 必须数字 id；fcg_play_single_song 公开详情）。 */
    private static final Map<String, String> qqSongIdCache = new HashMap<>();

    private static String qqSongId(String songmid) {
        Song s = qqSongDetail(songmid);
        if (s == null) return "";
        String songId = firstNonEmpty(s.songNumId,
                s.mvid != null && s.mvid.startsWith("qqmeta:") ? s.mvid.substring(7, s.mvid.indexOf(':', 7)) : "");
        if (songId.isEmpty()) fileLog("qqSongId missing songmid=" + songmid + " mvid=" + s.mvid);
        return songId;
    }

    /**
     * QQ 歌词：PlayLyricInfo（music-lib 同参数：手机端 comm + 元数据 base64）→ QRC hex → 解密 →
     * [LRC（QRC 逐词转整行，壳端滚动展示）, 逐词 QRC 原文（备用通道）]。
     */
    private static String[] qqLyric(Song s) {
        String qrc = "";
        try {
            JSONObject payload = new JSONObject()
                    .put("comm", new JSONObject()
                            .put("ct", 11).put("cv", "1003006").put("v", "1003006")
                            .put("os_ver", "15").put("phonetype", "24122RKC7C")
                            .put("rom", "Redmi/miro/miro:15/AE3A.240806.005/OS2.0.105.0.VOMCNXM:user/release-keys")
                            .put("tmeAppID", "qqmusiclight").put("nettype", "NETWORK_WIFI")
                            .put("udid", "0").put("uid", "0").put("sid", "")
                            .put("loginUin", "0").put("platform", "yqq.json").put("needNewCode", 0))
                    .put("request", new JSONObject()
                            .put("method", "GetPlayLyricInfo")
                            .put("module", "music.musichallSong.PlayLyricInfo")
                            .put("param", new JSONObject()
                                    .put("albumName", b64Utf8(s.album))
                                    .put("crypt", 1).put("ct", 19).put("cv", 2111)
                                    .put("interval", s.duration)
                                    .put("lrc_t", 0).put("qrc", 1).put("qrc_t", 0)
                                    .put("roma", 1).put("roma_t", 0)
                                    .put("singerName", b64Utf8(s.artist))
                                    .put("songID", parseSongNum(s))
                                    .put("songName", b64Utf8(s.name))
                                    .put("trans", 1).put("trans_t", 0)
                                    .put("type", 0)));
            JSONObject resp = qqFcgPost(payload);
            JSONObject request = resp.optJSONObject("request");
            JSONObject data = request == null ? null : request.optJSONObject("data");
            String hex = data == null ? "" : data.optString("lyric", "");
            if (!hex.isEmpty()) qrc = decryptQRC(hex);
        } catch (Exception e) {
            fileLog("qqLyric FAIL songmid=" + s.id + " : " + e);
        }
        fileLog("qqLyric done songmid=" + s.id + " qrc=" + qrc.length());
        if (qrc.isEmpty()) return new String[]{"", ""};
        return new String[]{qrcToLrc(qrc), qrc};
    }

    private static String b64Utf8(String text) {
        return Base64.encodeToString((text == null ? "" : text).getBytes(StandardCharsets.UTF_8), Base64.NO_WRAP);
    }

    /** qq 数字 songid（songNumId 缺省时回退 qqmeta 前缀解析）。 */
    private static long parseSongNum(Song s) {
        if (s.songNumId != null && !s.songNumId.isEmpty() && !"0".equals(s.songNumId)) {
            try {
                return Long.parseLong(s.songNumId);
            } catch (Exception ignore) {
            }
        }
        if (s.mvid != null && s.mvid.startsWith("qqmeta:")) {
            try {
                return Long.parseLong(s.mvid.substring(7, s.mvid.indexOf(':', 7)));
            } catch (Exception ignore) {
            }
        }
        return 0;
    }

    /** QQ QRC 逐词 → 整行 LRC（[start,dur](x,y)词 → [mm:ss.cs]行文本）。 */
    static String qrcToLrc(String qrc) {
        StringBuilder sb = new StringBuilder();
        java.util.regex.Matcher hm = java.util.regex.Pattern.compile("^\\s*\\[(\\d+),(\\d+)\\]").matcher("");
        java.util.regex.Pattern word = java.util.regex.Pattern.compile("\\((?:\\d+),(?:\\d+)\\)([^()]*)");
        for (String raw : qrc.split("\n")) {
            String line = raw.trim();
            if (line.isEmpty()) continue;
            if (line.startsWith("[ti:") || line.startsWith("[ar:") || line.startsWith("[al:")
                    || line.startsWith("[by:") || line.startsWith("[offset:")) {
                sb.append(line).append('\n');
                continue;
            }
            if (!hm.reset(line).find()) continue;
            long ms = Long.parseLong(hm.group(1));
            StringBuilder text = new StringBuilder();
            java.util.regex.Matcher wm = word.matcher(line.substring(hm.end()));
            while (wm.find()) text.append(wm.group(1));
            String t = text.toString().trim();
            if (t.isEmpty()) continue;
            long cs = ms / 10;
            sb.append(String.format("[%02d:%02d.%02d]", cs / 6000, (cs / 100) % 60, cs % 100))
                    .append(t).append('\n');
        }
        return sb.toString();
    }

    /** QQ MV 地址（mv.GetMvUrl/GetMvUrls）。 */
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

    /** QQ 歌曲 songmid→[mvid, songid] 元数据缓存。 */
    private static final Map<String, String[]> qqMetaCache = new HashMap<>();

    private static String[] qqSongMeta(String songmid) {
        synchronized (qqMetaCache) {
            String[] cached = qqMetaCache.get(songmid);
            if (cached != null) return cached;
        }
        try {
            List<Song> songs = qqSearch(songmid);
            if (!songs.isEmpty()) {
                Song s = songs.get(0);
                String songId = "";
                if (s.mvid.startsWith("qqmeta:")) songId = s.mvid.substring(7, s.mvid.indexOf(':', 7));
                String[] meta = {s.mvid.startsWith("qqmeta:") ? "" : s.mvid, songId};
                synchronized (qqMetaCache) {
                    qqMetaCache.put(songmid, meta);
                }
                return meta;
            }
        } catch (Exception ignore) {
        }
        return new String[]{"", ""};
    }

    // ============================ 酷狗（kugou） ============================

    private static final String KG_UA = "Mozilla/5.0 (iPhone; CPU iPhone OS 13_2_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Mobile/15E148 Safari/604.1";
    private static final String KG_REFERER = "http://m.kugou.com";

    private static Map<String, String> kgHeaders() {
        return headers("User-Agent", KG_UA, "Referer", KG_REFERER);
    }

    /** 酷狗歌曲条目解析（rank/song、special/song、search 三种结构统一；package 可见便于测试）。 */
    static Song kgParseSong(JSONObject s) {
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
        if (duration > 10000) duration /= 1000;
        return new Song("kugou", hash, name, singer, album, img, duration);
    }

    static List<Song> kgParseInfoList(JSONArray info) {
        List<Song> out = new ArrayList<>();
        if (info == null) return out;
        for (int i = 0; i < info.length(); i++) {
            Song s = kgParseSong(info.optJSONObject(i));
            if (s != null) out.add(s);
        }
        return out;
    }

    /** 酷狗榜单歌曲（mobilecdn rank/song；该域名 https 证书不匹配，必须 http）。 */
    public static List<Song> kgToplistSongs(String rankid) throws Exception {
        String url = "http://mobilecdn.kugou.com/api/v3/rank/song?rankid=" + enc(rankid) +
                "&page=1&pagesize=100&version=9108&area_code=1";
        JSONObject resp = getJson(url, kgHeaders());
        if (resp.optInt("status", -1) != 1) return new ArrayList<>();
        JSONObject data = resp.optJSONObject("data");
        return kgParseInfoList(data == null ? null : data.optJSONArray("info"));
    }

    /** 酷狗榜单目录（mobilecdn rank/list，动态；失败回退内置 TOP 榜）。 */
    public static List<String[]> kgRankList() {
        try {
            JSONObject resp = getJson("https://mobilecdn.kugou.com/api/v3/rank/list?version=9108&area_code=1", kgHeaders());
            JSONObject data = resp.optJSONObject("data");
            JSONArray info = data == null ? null : data.optJSONArray("info");
            List<String[]> out = new ArrayList<>();
            if (info != null) {
                for (int i = 0; i < info.length() && out.size() < 30; i++) {
                    JSONObject r = info.optJSONObject(i);
                    if (r == null) continue;
                    String id = String.valueOf(r.optLong("rankid", 0));
                    String name = r.optString("rankname", "").trim();
                    if (id.isEmpty() || "0".equals(id) || name.isEmpty()) continue;
                    out.add(new String[]{id, name, r.optString("imgurl", "").replace("{size}", "240")});
                }
            }
            if (!out.isEmpty()) return out;
        } catch (Exception e) {
            fileLog("kgRankList FAIL: " + e);
        }
        return Collections.singletonList(new String[]{"8888", "酷狗TOP榜", ""});
    }

    /** 酷狗搜索（mobilecdn search/song，与榜单同域名避开 songsearch 风控；大写命名兼容）。 */
    public static List<Song> kgSearch(String kw) throws Exception {
        String url = "http://mobilecdn.kugou.com/api/v3/search/song?format=json&keyword=" + enc(kw) +
                "&page=1&pagesize=30&showtype=1";
        JSONObject resp;
        try {
            resp = getJson(url, kgHeaders());
        } catch (Exception e) {
            resp = getJson(url.replace("http://", "https://"), kgHeaders());
        }
        if (resp.optInt("status", -1) != 1) {
            fileLog("kgSearch FAIL status=" + resp.opt("status") + " kw=" + kw);
            return new ArrayList<>();
        }
        JSONObject data = resp.optJSONObject("data");
        if (data == null) return new ArrayList<>();
        List<Song> out = kgParseInfoList(data.optJSONArray("info"));
        for (Song s : out) {
            s.name = s.name.replaceAll("<[^>]*>", "").trim();
            s.artist = s.artist.replaceAll("<[^>]*>", "").trim();
        }
        return out;
    }

    /** 酷狗歌单歌曲（mobilecdn special/song specialid；http，同榜单）。 */
    public static List<Song> kgPlaylistSongs(String specialid) throws Exception {
        String url = "http://mobilecdn.kugou.com/api/v3/special/song?specialid=" + enc(specialid) +
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

    /** 酷狗歌词（krcs search + download fmt=krc）：[LRC, 逐词KRC]。 */
    private static String[] kgLyric(String hash, int duration) throws Exception {
        JSONObject search = getJson("https://krcs.kugou.com/search?ver=1&man=yes&client=mobi&keyword=" +
                "&duration=" + (duration * 1000) + "&hash=" + enc(hash) + "&album_audio_id=", kgHeaders());
        JSONArray candidates = search.optJSONArray("candidates");
        if (candidates == null || candidates.length() == 0) {
            fileLog("kgLyric no candidates hash=" + hash + " status=" + search.opt("status"));
            return new String[]{"", ""};
        }
        JSONObject c = candidates.optJSONObject(0);
        if (c == null) return new String[]{"", ""};
        JSONObject dl = getJson("https://lyrics.kugou.com/download?ver=1&client=pc&id=" + c.opt("id") +
                "&accesskey=" + enc(c.optString("accesskey", "")) + "&fmt=krc&charset=utf8", kgHeaders());
        String content = dl.optString("content", "");
        if (content.isEmpty()) {
            fileLog("kgLyric empty content id=" + c.opt("id") + " status=" + dl.opt("status"));
            return new String[]{"", ""};
        }
        if ("lrc".equals(dl.optString("fmt", "")) || dl.optInt("contenttype", 0) == 2) {
            String lrc = new String(Base64.decode(content, Base64.DEFAULT), StandardCharsets.UTF_8);
            return new String[]{lrc, ""};
        }
        String krc = decryptKRC(content);
        if (krc.isEmpty()) {
            fileLog("kgLyric krc decrypt empty hash=" + hash);
            return new String[]{"", ""};
        }
        return new String[]{krcToLrc(krc), krc};
    }

    // ============================ 汽水（soda） ============================

    private static final String SODA_APP_UA = "com.luna.music/100198030 (Linux; U; Android 15; zh_CN_#Hans; ABR-AL80; Build/V417IR;tt-ok/3.12.13.19)";
    private static final String SODA_WEB_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36";
    /** 汽水官方榜单目录（PC 无目录接口，music-lib 内置同源）。 */
    private static final String[][] SODA_BUILTIN_RANKS = {
            {"7036274230471712007", "热歌榜"},
            {"7060812597884869927", "新歌榜"},
            {"7061475546400005410", "欧美榜"},
            {"7415959718721494311", "音乐人歌曲榜"},
    };

    /** 汽水歌曲条目解析（track 结构统一；package 可见便于 JVM 解析测试）。 */
    static Song sodaParseTrack(JSONObject track) {
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

    /** 汽水搜索（luna/search/track，Android 端参数，免签名）。 */
    public static List<Song> sodaSearch(String kw) throws Exception {
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

    /** 汽水 PC App 公共参数（music-lib sodaPCAppParams 同源）。 */
    private static String sodaPcParams() {
        long now = System.currentTimeMillis();
        return "aid=386088&app_name=luna_pc&region=cn&geo_region=cn&os_region=cn&sim_region=" +
                "&device_id=" + now + "&cdid=&iid=" + (now + 1) +
                "&version_name=3.3.0&version_code=30030000&channel=official&build_mode=master" +
                "&network_carrier=&ac=wifi&tz_name=Asia/Shanghai&resolution=" +
                "&device_platform=windows&device_type=Windows&os_version=Windows%2011&fp=" + now;
    }

    private static Map<String, String> sodaPcHeaders() {
        return headers("User-Agent", "LunaPC/3.3.0(359450208)",
                "x-luna-background-type", "foreground",
                "x-luna-is-background-req", "0",
                "x-luna-is-local-user", "1");
    }

    /** 汽水榜单歌曲（luna/pc/charts/{id}，PC App 参数失败回退移动端；再回退歌单详情）。 */
    public static List<Song> sodaChartSongs(String chartId) throws Exception {
        List<Song> songs = new ArrayList<>();
        // 1) PC App charts（响应无 status_code 时视为成功，直接读 chart.track_ranks）
        try {
            JSONObject resp = getJson("https://api.qishui.com/luna/pc/charts/" + enc(chartId) + "?" + sodaPcParams(),
                    sodaPcHeaders());
            List<Song> parsed = sodaParseChartResp(resp);
            if (!parsed.isEmpty()) return parsed;
            fileLog("sodaChart pc empty id=" + chartId);
        } catch (Exception e) {
            fileLog("sodaChart pc FAIL id=" + chartId + " : " + e);
        }
        // 2) 移动端 charts
        try {
            JSONObject resp = getJson("https://api5-lf.qishui.com/luna/charts/" + enc(chartId) + "?charge=0",
                    headers("User-Agent", SODA_WEB_UA));
            List<Song> parsed = sodaParseChartResp(resp);
            if (!parsed.isEmpty()) return parsed;
            fileLog("sodaChart mobile empty id=" + chartId);
        } catch (Exception e) {
            fileLog("sodaChart mobile FAIL id=" + chartId + " : " + e);
        }
        // 3) 歌单详情兜底（music-lib：官方榜单 ID 与推荐歌单 ID 共用链路）
        try {
            return sodaPlaylistSongs(chartId);
        } catch (Exception e) {
            fileLog("sodaChart playlist FAIL id=" + chartId + " : " + e);
        }
        return new ArrayList<>();
    }

    /** charts 响应解析：chart.track_ranks[].track（status_code 缺省视为成功）。 */
    static List<Song> sodaParseChartResp(JSONObject resp) {
        List<Song> out = new ArrayList<>();
        if (resp == null) return out;
        if (resp.has("status_code") && resp.optInt("status_code", -1) != 0) return out;
        JSONObject chart = resp.optJSONObject("chart");
        JSONArray ranks = chart == null ? null : chart.optJSONArray("track_ranks");
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
    public static List<Song> sodaPlaylistSongs(String playlistId) throws Exception {
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

    /** 汽水 track_v2 响应（web 端点免签名）。 */
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
                Object vm = player.opt("video_model");
                String found = findUrlDeep(vm, 0);
                if (!found.isEmpty()) return found;
            }
        } catch (Exception e) {
            fileLog("sodaStream FAIL id=" + trackId + " : " + e);
        }
        return "";
    }

    /** 汽水歌词：track_v2 lyric.content（LRC 或逐词格式透传）：[LRC, 逐词]。 */
    private static String[] sodaLyric(String trackId) {
        JSONObject resp = sodaTrackV2(trackId);
        if (resp == null) return new String[]{"", ""};
        JSONObject lyricObj = resp.optJSONObject("lyric");
        String content = lyricObj == null ? "" : lyricObj.optString("content", "");
        if (content.isEmpty()) return new String[]{"", ""};
        if (content.contains("<") && content.matches("(?s).*\\[\\d+,\\d+\\].*") && content.contains(",0>")) {
            return new String[]{sodaWordLyricToLrc(content), content};
        }
        return new String[]{content, ""};
    }

    /** soda 逐词歌词 → 整行 LRC（klyric 通道保留逐词原文）。 */
    private static String sodaWordLyricToLrc(String content) {
        java.util.regex.Matcher hm = java.util.regex.Pattern.compile("^\\s*\\[(\\d+),(\\d+)\\]").matcher("");
        StringBuilder sb = new StringBuilder();
        for (String raw : content.split("\n")) {
            String line = raw.trim();
            if (line.isEmpty()) continue;
            if (!hm.reset(line).find()) continue;
            long ms = Long.parseLong(hm.group(1));
            String text = line.substring(hm.end()).replaceAll("<\\d+,\\d+,\\d+>", "").trim();
            if (text.isEmpty()) continue;
            long cs = ms / 10;
            sb.append(String.format("[%02d:%02d.%02d]", cs / 6000, (cs / 100) % 60, cs % 100))
                    .append(text).append('\n');
        }
        return sb.toString();
    }

    /** 深度遍历 JSON 结构找第一个播放地址（video_model 多层嵌套字符串兼容）。 */
    private static String findUrlDeep(Object node, int depth) {
        if (node == null || depth > 6) return "";
        if (node instanceof String) {
            String s = (String) node;
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

    /** KRC 逐词 → 整行 LRC（[start,dur] <off,dur,0>词 → [mm:ss.cs]行文本；跳过 <0,0> 翻译行）。 */
    static String krcToLrc(String krc) {
        StringBuilder sb = new StringBuilder();
        java.util.regex.Matcher hm = java.util.regex.Pattern.compile("^\\s*\\[(\\d+),(\\d+)\\]").matcher("");
        for (String raw : krc.split("\n")) {
            String line = raw.trim();
            if (line.isEmpty()) continue;
            if (!hm.reset(line).find()) continue;
            String body = line.substring(hm.end());
            StringBuilder text = new StringBuilder();
            java.util.regex.Matcher wm = java.util.regex.Pattern.compile("(?:\\[\\d+,\\d+\\])?<\\d+,\\d+,\\d+>([^<]*)").matcher(body);
            while (wm.find()) text.append(wm.group(1));
            String t = text.toString().trim();
            if (t.isEmpty()) continue;
            long ms = Long.parseLong(hm.group(1));
            long cs = ms / 10;
            sb.append(String.format("[%02d:%02d.%02d]", cs / 6000, (cs / 100) % 60, cs % 100))
                    .append(t).append('\n');
        }
        return sb.toString();
    }

    /** 酷我 lrcx 逐词 → 整行 LRC（[mm:ss.mmm]<off,dur>词 → [mm:ss.cs]行；<0,0> 开头的翻译/音译行跳过）。 */
    static String kuwoLrcxToLrc(String text) {
        StringBuilder sb = new StringBuilder();
        java.util.regex.Matcher hm = java.util.regex.Pattern.compile("^\\[(\\d{1,2}):(\\d{1,2})\\.(\\d{1,3})\\]").matcher("");
        for (String raw : text.split("\r?\n")) {
            String line = raw.trim();
            if (line.isEmpty()) continue;
            if (!hm.reset(line).find()) {
                if (line.startsWith("[") && line.endsWith("]")) sb.append(line).append('\n');
                continue;
            }
            String payload = line.substring(hm.end());
            if (payload.startsWith("<0,0>")) continue; // 翻译/音译伴随行
            StringBuilder t = new StringBuilder();
            java.util.regex.Matcher wm = java.util.regex.Pattern.compile("<-?\\d+,-?\\d+>([^<]*)").matcher(payload);
            while (wm.find()) t.append(wm.group(1));
            String txt = t.toString().trim();
            if (txt.isEmpty()) continue;
            try {
                int mm = Integer.parseInt(hm.group(1)), ss = Integer.parseInt(hm.group(2));
                int frac = Integer.parseInt(hm.group(3));
                sb.append(String.format("[%02d:%02d.%02d]", mm, ss, frac / 10)).append(txt).append('\n');
            } catch (Exception ignore) {
            }
        }
        return sb.toString();
    }

    // ============================ 酷我（kuwo，music-lib 蓝本移植） ============================

    private static final String KW_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36";
    /** 酷我内置榜单目录（kbangserver 旧接口，无需登录；16=热歌榜）。 */
    private static final String[][] KW_BUILTIN_RANKS = {
            {"16", "酷我热歌榜"},
            {"42", "酷我新歌榜"},
            {"158", "酷我飙升榜"},
    };

    /** 酷我搜索：searchMusicBykeyWord（www 域名）失败回退 search.kuwo.cn r.s legacy（单引号 JSON）。 */
    public static List<Song> kwSearch(String kw) throws Exception {
        try {
            // www.kuwo.cn http 会 301 到 https，直接走 https
            String url = "https://www.kuwo.cn/search/searchMusicBykeyWord?" +
                    "vipver=1&client=kt&ft=music&cluster=0&strategy=2012&encoding=utf8&rformat=json" +
                    "&mobi=1&issubtitle=1&show_copyright_off=1&pn=0&rn=30&all=" + enc(kw);
            JSONObject resp = new JSONObject(getText(url, withRandomIp(headers("User-Agent", KW_UA))));
            List<Song> out = kwParseAbslist(resp.optJSONArray("abslist"));
            if (!out.isEmpty()) return out;
        } catch (Exception e) {
            fileLog("kwSearch www FAIL kw=" + kw + " : " + e);
        }
        // legacy r.s（search.kuwo.cn，单引号 JSON 需替换）
        try {
            String url = "http://search.kuwo.cn/r.s?all=" + enc(kw) +
                    "&ft=music&itemset=web_2013&client=kt&pcmp4=1&geo=c&vipver=1&pn=0&rn=30&rformat=json&encoding=utf8";
            String body = getText(url, withRandomIp(headers("User-Agent", KW_UA)));
            JSONObject resp = new JSONObject(body.replace('\'', '"'));
            List<Song> out = kwParseAbslist(resp.optJSONArray("abslist"));
            if (!out.isEmpty()) return out;
        } catch (Exception e) {
            fileLog("kwSearch r.s FAIL kw=" + kw + " : " + e);
        }
        return new ArrayList<>();
    }

    /** 酷我 abslist 条目解析（大写字段 + bitSwitch=0 不可播过滤；package 可见便于测试）。 */
    static List<Song> kwParseAbslist(JSONArray abslist) {
        List<Song> out = new ArrayList<>();
        if (abslist == null) return out;
        for (int i = 0; i < abslist.length(); i++) {
            JSONObject item = abslist.optJSONObject(i);
            if (item == null) continue;
            if (item.has("bitSwitch") && item.optInt("bitSwitch", 0) == 0) continue;
            String rid = item.optString("MUSICRID", "").replaceFirst("^MUSIC_", "").trim();
            String name = firstNonEmpty(item.optString("SONGNAME", ""), item.optString("songname", "")).trim();
            if (rid.isEmpty() || name.isEmpty()) continue;
            int duration = 0;
            try {
                duration = Integer.parseInt(item.optString("DURATION", item.optString("duration", "0")).trim());
            } catch (Exception ignore) {
            }
            String cover = firstNonEmpty(item.optString("hts_MVPIC", ""), item.optString("albumpic", ""),
                    item.optString("web_albumpic_short", ""));
            out.add(new Song("kuwo", rid, name,
                    firstNonEmpty(item.optString("ARTIST", ""), item.optString("artist", "")).trim(),
                    firstNonEmpty(item.optString("ALBUM", ""), item.optString("album", "")).trim(),
                    kwImgUrl(cover), duration));
        }
        return out;
    }

    /** 酷我榜单歌曲（kbangserver ksong.s，旧接口免登录）。 */
    public static List<Song> kwToplistSongs(String bangId) throws Exception {
        String url = "http://kbangserver.kuwo.cn/ksong.s?from=pc&fmt=json&pn=0&rn=100&type=bang" +
                "&data=content&id=" + enc(bangId) + "&show_copyright_off=1&pcmp4=1";
        JSONObject resp = getJson(url, withRandomIp(headers("User-Agent", KW_UA)));
        JSONArray musiclist = resp.optJSONArray("musiclist");
        List<Song> out = new ArrayList<>();
        if (musiclist == null) return out;
        for (int i = 0; i < musiclist.length(); i++) {
            JSONObject item = musiclist.optJSONObject(i);
            if (item == null) continue;
            String rid = String.valueOf(item.optLong("id", 0));
            String name = item.optString("name", "").trim();
            if (rid.isEmpty() || "0".equals(rid) || name.isEmpty()) continue;
            int duration = item.optInt("song_duration", item.optInt("duration", 0));
            out.add(new Song("kuwo", rid, name, item.optString("artist", "").trim(),
                    item.optString("album", "").trim(), "", duration));
        }
        return out;
    }

    /** 酷我歌单歌曲（nplserver pl.svc getlistinfo，100/页取首页 300）。 */
    public static List<Song> kwPlaylistSongs(String pid) throws Exception {
        List<Song> out = new ArrayList<>();
        for (int page = 0; page < 3; page++) {
            String url = "http://nplserver.kuwo.cn/pl.svc?op=getlistinfo&pid=" + enc(pid) +
                    "&pn=" + page + "&rn=100&encode=utf8&keyset=pl2012&identity=kuwo&pcmp4=1&vipver=1&newver=1";
            JSONObject resp = getJson(url, withRandomIp(headers("User-Agent", KW_UA)));
            JSONArray musiclist = resp.optJSONArray("musiclist");
            if (musiclist == null || musiclist.length() == 0) break;
            for (int i = 0; i < musiclist.length(); i++) {
                JSONObject item = musiclist.optJSONObject(i);
                if (item == null) continue;
                String rid = item.optString("id", item.optString("musicrid", "")).trim();
                String name = firstNonEmpty(item.optString("name", ""), item.optString("songname", ""));
                if (rid.isEmpty() || name.isEmpty()) continue;
                int duration = 0;
                try {
                    Object d = item.opt("duration");
                    duration = d instanceof Number ? ((Number) d).intValue() : Integer.parseInt(String.valueOf(d));
                } catch (Exception ignore) {
                }
                out.add(new Song("kuwo", rid, name,
                        firstNonEmpty(item.optString("artist", ""), item.optString("artist_name", "")),
                        item.optString("album", "").trim(),
                        kwImgUrl(firstNonEmpty(item.optString("albumpic", ""), item.optString("hts_img", ""))),
                        duration));
            }
        }
        return out;
    }

    /** 酷我取流：mobi.s convert_url_with_sign（128k/320k 逐级）→ www 兜底。 */
    private static String kwStream(String rid) throws Exception {
        String user = "C_APK_guanwang_" + System.nanoTime() + new Random().nextInt(1000000);
        for (String br : new String[]{"320kmp3", "128kmp3"}) {
            try {
                String url = "https://mobi.kuwo.cn/mobi.s?f=web&source=kwplayercar_ar_6.0.0.9_B_jiakong_vh.apk" +
                        "&from=PC&type=convert_url_with_sign&br=" + br + "&rid=" + enc(rid) + "&user=" + enc(user);
                JSONObject resp = getJson(url, withRandomIp(headers("User-Agent", KW_UA)));
                JSONObject data = resp.optJSONObject("data");
                String u = data == null ? "" : data.optString("url", "");
                if (!u.isEmpty()) return u;
            } catch (Exception e) {
                fileLog("kwStream " + br + " FAIL rid=" + rid + " : " + e);
            }
        }
        // 降级：www Web 接口（需 Secret 头 + kw_token cookie）
        try {
            String url = "http://www.kuwo.cn/api/v1/www/music/playUrl?mid=" + enc(rid) + "&type=music&httpsStatus=1";
            Map<String, String> h = withRandomIp(headers("User-Agent", KW_UA, "Secret", "kuwo_web_secret"));
            h.put("Cookie", "kw_token=secret_token");
            JSONObject resp = getJson(url, h);
            JSONObject data = resp.optJSONObject("data");
            return data == null ? "" : data.optString("url", "");
        } catch (Exception e) {
            fileLog("kwStream fallback FAIL rid=" + rid + " : " + e);
        }
        return "";
    }

    /** 酷我歌词：newlyric.kuwo.cn（music-lib 同链路：XOR yeelion 参数 + zlib + GB18030；KRC 逐词）。 */
    private static String[] kwLyric(String rid) {
        try {
            // 1) 构造 XOR+Base64 参数（lrcx=1 返回逐词增强格式）
            String params = "user=12345,web,web,web&requester=localhost&req=1&rid=MUSIC_" + rid + "&lrcx=1";
            byte[] xor = params.getBytes(StandardCharsets.UTF_8);
            byte[] key = "yeelion".getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < xor.length; i++) xor[i] ^= key[i % key.length];
            String payload = Base64.encodeToString(xor, Base64.NO_WRAP);
            byte[] body = httpGet("http://newlyric.kuwo.cn/newlyric.lrc?" + payload,
                    withRandomIp(headers("User-Agent", KW_UA)));
            // 2) 响应：tp=content 头 + \r\n\r\n 分隔 + zlib
            String head = new String(body, 0, Math.min(10, body.length), StandardCharsets.UTF_8);
            int sep = -1;
            for (int i = 0; i + 3 < body.length; i++) {
                if (body[i] == '\r' && body[i + 1] == '\n' && body[i + 2] == '\r' && body[i + 3] == '\n') {
                    sep = i;
                    break;
                }
            }
            if (sep < 0 || !head.startsWith("tp=content")) {
                fileLog("kwLyric bad response rid=" + rid + " head=" + head.replace("\r", "\\r").replace("\n", "\\n"));
                return new String[]{"", ""};
            }
            byte[] compressed = java.util.Arrays.copyOfRange(body, sep + 4, body.length);
            byte[] plain = zlibInflateBytes(compressed);
            // 3) lrcx：base64 → 再 XOR
            String b64 = new String(plain, StandardCharsets.UTF_8).replaceAll("\\s", "");
            byte[] decoded = Base64.decode(b64, Base64.DEFAULT);
            for (int i = 0; i < decoded.length; i++) decoded[i] ^= key[i % key.length];
            // 4) GB18030 解码（酷我歌词为 GB 编码）
            String text = new String(decoded, "GB18030");
            // 5) 酷我 lrcx 逐词 → 整行 LRC（<0,0> 翻译行过滤）
            String lrc = kuwoLrcxToLrc(text);
            if (lrc.isEmpty()) {
                fileLog("kwLyric empty lrc rid=" + rid + " rawLen=" + text.length());
                return new String[]{"", ""};
            }
            return new String[]{lrc, text};
        } catch (Exception e) {
            fileLog("kwLyric FAIL rid=" + rid + " : " + e);
            return new String[]{"", ""};
        }
    }

    /** raw deflate 解压（备用）。 */
    private static byte[] zlibInflateRaw(byte[] data) throws Exception {
        Inflater inflater = new Inflater(true);
        try {
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
            return out.toByteArray();
        } finally {
            inflater.end();
        }
    }

    /** 酷我图片 URL 补全（//img → http，尺寸升 500）。 */
    private static String kwImgUrl(String raw) {
        if (raw == null || raw.isEmpty()) return "";
        if (raw.startsWith("//")) raw = "http:" + raw;
        else if (!raw.startsWith("http")) raw = "http://img1.kuwo.cn/star/albumcover/" + raw.replaceFirst("^/", "");
        for (String[] rep : new String[][]{{"/120/", "/500/"}, {"/150/", "/500/"}, {"/240/", "/500/"}}) {
            if (raw.contains(rep[0])) {
                raw = raw.replace(rep[0], rep[1]);
                break;
            }
        }
        return raw;
    }

    // ============================ 咪咕（migu，music-lib 蓝本移植） ============================

    private static final String MG_UA = "Mozilla/5.0 (iPhone; CPU iPhone OS 9_1 like Mac OS X) AppleWebKit/601.1.46 (KHTML, like Gecko) Version/9.0 Mobile/13B143 Safari/601.1";
    private static final String MG_REFERER = "http://music.migu.cn/";
    private static final String MG_ANDROID_UA = "Android_migu/7.41.13 okhttp/3.12.13";

    private static Map<String, String> mgHeaders() {
        return headers("User-Agent", MG_UA, "Referer", MG_REFERER);
    }

    /** 咪咕榜单歌曲（bmw rank-info，songData 内嵌歌曲 JSON）。 */
    public static List<Song> mgToplistSongs(String rankId) throws Exception {
        List<Song> out = new ArrayList<>();
        java.util.Set<String> seen = new java.util.HashSet<>();
        for (int pageNo = 1; pageNo <= 2; pageNo++) {
            JSONObject resp = getJson("https://app.c.nf.migu.cn/bmw/rank/rank-info/v1.0?pageNo=" + pageNo +
                    "&rankId=" + enc(rankId), mgHeaders());
            if (!"000000".equals(resp.optString("code", "000000"))) break;
            JSONObject data = resp.optJSONObject("data");
            JSONArray contents = data == null ? null : data.optJSONArray("contents");
            if (contents == null || contents.length() == 0) break;
            for (int i = 0; i < contents.length(); i++) {
                JSONObject item = contents.optJSONObject(i);
                String songData = item == null ? "" : item.optString("songData", "");
                if (songData.isEmpty()) continue;
                try {
                    Song s = mgConvertItem(new JSONObject(songData));
                    if (s != null && seen.add(s.id)) out.add(s);
                } catch (Exception ignore) {
                }
            }
            if (data == null || !data.optBoolean("hasNextPage", false)) break;
        }
        return out;
    }

    /** 咪咕榜单目录（bmw rank-index v2.0，动态；失败回退内置热歌榜）。 */
    public static List<String[]> mgRankList() {
        try {
            JSONObject resp = getJson("https://app.u.nf.migu.cn/bmw/rank/rank-index/v2.0", mgHeaders());
            if (!"000000".equals(resp.optString("code", "000000"))) throw new RuntimeException(resp.optString("info", ""));
            JSONObject data = resp.optJSONObject("data");
            JSONArray contents = data == null ? null : data.optJSONArray("contents");
            List<String[]> out = new ArrayList<>();
            java.util.Set<String> seen = new java.util.HashSet<>();
            if (contents != null) {
                for (int i = 0; i < contents.length() && out.size() < 30; i++) {
                    JSONObject group = contents.optJSONObject(i);
                    JSONArray list = group == null ? null : group.optJSONArray("contents");
                    if (list == null) continue;
                    for (int j = 0; j < list.length() && out.size() < 30; j++) {
                        JSONObject r = list.optJSONObject(j);
                        if (r == null) continue;
                        String id = r.optString("rankId", "").trim();
                        String name = r.optString("rankName", "").trim();
                        if (id.isEmpty() || name.isEmpty() || !seen.add(id)) continue;
                        out.add(new String[]{id, name, r.optString("imageUrl", "")});
                    }
                }
            }
            if (!out.isEmpty()) return out;
        } catch (Exception e) {
            fileLog("mgRankList FAIL: " + e);
        }
        return Collections.singletonList(new String[]{"83048887", "咪咕全网热歌榜", ""});
    }

    /** 咪咕搜索（search_all.do，song:1）。 */
    public static List<Song> mgSearch(String kw) throws Exception {
        String url = "http://pd.musicapp.migu.cn/MIGUM2.0/v1.0/content/search_all.do?" +
                "ua=Android_migu&version=5.0.1&text=" + enc(kw) + "&pageNo=1&pageSize=20" +
                "&searchSwitch=" + enc("{\"song\":1,\"album\":0,\"singer\":0,\"tagSong\":0,\"mvSong\":0,\"songlist\":0,\"bestShow\":1}");
        JSONObject resp = getJson(url, mgHeaders());
        JSONObject songData = resp.optJSONObject("songResultData");
        JSONArray result = songData == null ? null : songData.optJSONArray("result");
        List<Song> out = new ArrayList<>();
        if (result == null) return out;
        for (int i = 0; i < result.length(); i++) {
            Song s = mgConvertItem(result.optJSONObject(i));
            if (s != null) out.add(s);
        }
        return out;
    }

    /** 咪咕歌单歌曲（MIGUM3.0 playlist/song v2.0）。 */
    public static List<Song> mgPlaylistSongs(String playlistId) throws Exception {
        List<Song> out = new ArrayList<>();
        for (int pageNo = 1; pageNo <= 3; pageNo++) {
            JSONObject resp = getJson("https://app.c.nf.migu.cn/MIGUM3.0/resource/playlist/song/v2.0?" +
                    "pageNo=" + pageNo + "&pageSize=50&playlistId=" + enc(playlistId), mgHeaders());
            JSONObject data = resp.optJSONObject("data");
            JSONArray songList = data == null ? null : data.optJSONArray("songList");
            if (songList == null || songList.length() == 0) break;
            for (int i = 0; i < songList.length(); i++) {
                JSONObject item = songList.optJSONObject(i);
                if (item == null) continue;
                Song s = mgConvertItem(item.optJSONObject("songItem"));
                if (s == null) s = mgConvertItem(item);
                if (s != null) out.add(s);
            }
        }
        return out;
    }

    /** 咪咕歌曲条目转换（contentId 为主键，PQ/HQ 格式优先）。 */
    private static Song mgConvertItem(JSONObject item) {
        if (item == null) return null;
        String contentId = firstNonEmpty(item.optString("contentId", ""), item.optString("copyrightId", ""), item.optString("id", ""));
        String name = firstNonEmpty(item.optString("name", ""), item.optString("songName", ""));
        if (contentId.isEmpty() || name.isEmpty()) return null;
        StringBuilder artist = new StringBuilder();
        for (String key : new String[]{"singers", "artists", "singerList"}) {
            JSONArray arr = item.optJSONArray(key);
            if (arr == null) continue;
            for (int j = 0; j < arr.length() && j < 5; j++) {
                JSONObject a = arr.optJSONObject(j);
                if (a == null) continue;
                String n = a.optString("name", "").trim();
                if (n.isEmpty() || artist.toString().contains(n)) continue;
                if (artist.length() > 0) artist.append("、");
                artist.append(n);
            }
            if (artist.length() > 0) break;
        }
        if (artist.length() == 0) artist.append(item.optString("singer", "").replace("|", "、"));
        String albumName = item.optString("album", "").trim();
        JSONArray albums = item.optJSONArray("albums");
        if (albums != null && albums.length() > 0) {
            JSONObject al = albums.optJSONObject(0);
            if (al != null && !al.optString("name", "").isEmpty()) albumName = al.optString("name", "");
        }
        String cover = mgPickImg(item.optJSONArray("imgItems"));
        if (cover.isEmpty()) cover = firstNonEmpty(item.optString("img1", ""), item.optString("img2", ""));
        cover = mgImgUrl(cover);
        int duration = item.optInt("duration", 0);
        if (duration > 10000) duration /= 1000;
        return new Song("migu", contentId, name, artist.toString(), albumName, cover, duration);
    }

    private static String mgPickImg(JSONArray imgItems) {
        if (imgItems == null) return "";
        for (String prefer : new String[]{"02", "01", "03"}) {
            for (int i = 0; i < imgItems.length(); i++) {
                JSONObject im = imgItems.optJSONObject(i);
                if (im != null && prefer.equals(im.optString("imgSizeType", "")) && !im.optString("img", "").isEmpty()) {
                    return im.optString("img", "");
                }
            }
        }
        for (int i = 0; i < imgItems.length(); i++) {
            JSONObject im = imgItems.optJSONObject(i);
            if (im != null && !im.optString("img", "").isEmpty()) return im.optString("img", "");
        }
        return "";
    }

    private static String mgImgUrl(String image) {
        if (image == null || image.isEmpty()) return "";
        if (image.startsWith("//")) return "https:" + image;
        if (image.startsWith("/")) return "https://d.musicapp.migu.cn" + image;
        return image;
    }

    /** 咪咕取流：listen-url（ZQ32→HQ→PQ 逐级），ftp 头转 https CDN。 */
    private static String mgStream(String contentId) throws Exception {
        for (String tone : new String[]{"HQ", "PQ"}) {
            try {
                String url = "https://c.musicapp.migu.cn/MIGUM2.0/v2.1/content/listen-url?" +
                        "netType=01&resourceType=2&contentId=" + enc(contentId) + "&toneFlag=" + tone;
                JSONObject resp = getJson(url, headers("User-Agent", MG_ANDROID_UA,
                        "channel", "0146832", "version", "7.41.13", "Referer", "https://music.migu.cn/"));
                if (!"000000".equals(resp.optString("code", "000000"))) continue;
                JSONObject data = resp.optJSONObject("data");
                String u = data == null ? "" : data.optString("url", "");
                if (u.startsWith("ftp://218.200.160.122:21/")) {
                    u = "https://freetyst.nf.migu.cn/" + u.substring("ftp://218.200.160.122:21/".length());
                }
                if (u.startsWith("//")) u = "https:" + u;
                if (!u.isEmpty()) return u;
            } catch (Exception e) {
                fileLog("mgStream " + tone + " FAIL id=" + contentId + " : " + e);
            }
        }
        return "";
    }

    /** 咪咕歌词：resourceinfo.do → lrcUrl → 下载 LRC（无逐词）。 */
    private static String[] mgLyric(String contentId) {
        try {
            JSONObject resp = getJson("http://c.musicapp.migu.cn/MIGUM2.0/v1.0/content/resourceinfo.do?" +
                    "resourceId=" + enc(contentId) + "&resourceType=2", mgHeaders());
            JSONArray resource = resp.optJSONArray("resource");
            if (resource == null || resource.length() == 0) return new String[]{"", ""};
            JSONObject res = resource.optJSONObject(0);
            String lyricUrl = res == null ? "" : firstNonEmpty(res.optString("lrcUrl", ""), res.optString("lyricUrl", ""));
            if (lyricUrl.isEmpty()) return new String[]{"", ""};
            lyricUrl = lyricUrl.replaceFirst("^http://", "https://");
            String lrc = getText(lyricUrl, headers("User-Agent", WEB_UA, "Referer", "https://y.migu.cn/"));
            return new String[]{lrc, ""};
        } catch (Exception e) {
            fileLog("mgLyric FAIL id=" + contentId + " : " + e);
            return new String[]{"", ""};
        }
    }

    // ============================ 榜单目录 / 热歌入口 ============================

    /** 各平台热歌榜 id（hot tab 直出）。 */
    public static String hotRankId(String platform) {
        switch (platform) {
            case "netease":
                return "3778678";
            case "qq":
                return "26";
            case "soda":
                return "7036274230471712007";
            case "kuwo":
                return "16";
            case "migu":
                return "83048887";
            default:
                return "8888";
        }
    }

    /** 各平台榜单目录：String[]{id, name, cover}。 */
    public static List<String[]> rankList(String platform) {
        if ("netease".equals(platform)) {
            List<String[]> out = new ArrayList<>();
            out.add(new String[]{"3778678", "云音乐热歌榜", ""});
            out.add(new String[]{"3779629", "云音乐新歌榜", ""});
            out.add(new String[]{"19723756", "云音乐飙升榜", ""});
            return out;
        }
        if ("qq".equals(platform)) {
            List<String[]> out = new ArrayList<>();
            out.add(new String[]{"26", "QQ热歌榜", ""});
            out.add(new String[]{"27", "QQ新歌榜", ""});
            out.add(new String[]{"4", "流行指数榜", ""});
            return out;
        }
        if ("soda".equals(platform)) {
            List<String[]> out = new ArrayList<>();
            for (String[] r : SODA_BUILTIN_RANKS) out.add(new String[]{r[0], r[1], ""});
            return out;
        }
        if ("kuwo".equals(platform)) {
            List<String[]> out = new ArrayList<>();
            for (String[] r : KW_BUILTIN_RANKS) out.add(new String[]{r[0], r[1], ""});
            return out;
        }
        if ("kugou".equals(platform)) return kgRankList();
        if ("migu".equals(platform)) return mgRankList();
        return new ArrayList<>();
    }

    /** 平台榜单歌曲统一入口（detailContent 与 hot tab 共用）。 */
    public static List<Song> rankSongs(String platform, String rankId) throws Exception {
        if (rankId == null || rankId.isEmpty()) return new ArrayList<>();
        switch (platform) {
            case "netease":
                return nePlaylistSongs(rankId);
            case "qq":
                return qqToplistSongs(rankId);
            case "kugou":
                return kgToplistSongs(rankId);
            case "soda":
                return sodaChartSongs(rankId);
            case "kuwo":
                return kwToplistSongs(rankId);
            case "migu":
                return mgToplistSongs(rankId);
            default:
                return new ArrayList<>();
        }
    }

    /** 平台歌单歌曲统一入口。 */
    public static List<Song> playlistSongs(String platform, String playlistId) throws Exception {
        switch (platform) {
            case "netease":
                return nePlaylistSongs(playlistId);
            case "qq":
                return qqPlaylistSongs(playlistId);
            case "kugou":
                return kgPlaylistSongs(playlistId);
            case "soda":
                return sodaPlaylistSongs(playlistId);
            case "kuwo":
                return kwPlaylistSongs(playlistId);
            case "migu":
                return mgPlaylistSongs(playlistId);
            default:
                return new ArrayList<>();
        }
    }

    /** 单平台搜索入口。 */
    public static List<Song> searchOne(String platform, String kw) throws Exception {
        switch (platform) {
            case "netease":
                return neSearch(kw);
            case "qq":
                return qqSearch(kw);
            case "kugou":
                return kgSearch(kw);
            case "soda":
                return sodaSearch(kw);
            case "kuwo":
                return kwSearch(kw);
            case "migu":
                return mgSearch(kw);
            default:
                return parallelSearch(kw);
        }
    }

    /** 多平台并行搜索（每家前 10 条，按平台交错排列）。 */
    public static List<Song> parallelSearch(String kw) {
        final List<List<Song>> buckets = Collections.synchronizedList(new ArrayList<List<Song>>());
        ExecutorService pool = Executors.newFixedThreadPool(PLATFORMS.length);
        List<Future<?>> futures = new ArrayList<>();
        for (final String p : PLATFORMS) {
            futures.add(pool.submit(new Runnable() {
                public void run() {
                    try {
                        buckets.add(searchOne(p, kw));
                    } catch (Exception e) {
                        fileLog("search " + p + " FAIL: " + e);
                    }
                }
            }));
        }
        pool.shutdown();
        try {
            pool.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException ignore) {
        }
        List<Song> out = new ArrayList<>();
        int max = 0;
        for (List<Song> b : buckets) max = Math.max(max, b.size());
        for (int i = 0; i < max; i++) {
            for (List<Song> b : buckets) {
                if (i < b.size()) out.add(b.get(i));
            }
        }
        return out;
    }

    // ============================ 取流 / 歌词 / MV（全平台统一） ============================

    /** 单曲取流（全平台）：平台直链失败 → LX 音源代理兜底（VIP/版权曲目可播）。 */
    public static String stream(String platform, String songId) throws Exception {
        String url = streamDirect(platform, songId);
        if (url == null || url.isEmpty()) {
            url = lxStream(platform, songId);
        }
        return url == null ? "" : url;
    }

    /** 平台自有端点直链（原有逻辑）。 */
    private static String streamDirect(String platform, String songId) throws Exception {
        switch (platform) {
            case "netease":
                return neStream(songId);
            case "qq":
                return qqStream(songId);
            case "kugou":
                return kgStream(songId);
            case "kuwo":
                return kwStream(songId);
            case "migu":
                return mgStream(songId);
            case "soda":
                return sodaStream(songId);
            default:
                return "";
        }
    }

    /**
     * LX 音源代理取流（洛雪音源12 animemusic 端点，实测免鉴权可用）：
     * 平台映射 wy/tx/kg/kw/qishui/mg，128k。兜底解 VIP/版权限制。
     */
    private static String lxStream(String platform, String songId) {
        String source;
        switch (platform) {
            case "netease":
                source = "wy";
                break;
            case "qq":
                source = "tx";
                break;
            case "kugou":
                source = "kg";
                break;
            case "kuwo":
                source = "kw";
                break;
            case "soda":
                source = "qishui";
                break;
            case "migu":
                source = "mg";
                break;
            default:
                return "";
        }
        try {
            JSONObject resp = postJson("https://animemusic.bzxhkj.com/v1/index.php/music/url?key=",
                    headers("Content-Type", "application/json", "User-Agent", "lx-music-request/3.0.1"),
                    new JSONObject().put("source", source).put("musicId", songId).put("quality", "128k").toString());
            if (resp.optInt("code", -1) == 200) {
                String url = resp.optString("url", "");
                if (!url.isEmpty()) {
                    fileLog("lxStream ok " + platform + " " + songId);
                    return url;
                }
            } else {
                fileLog("lxStream code=" + resp.opt("code") + " msg=" + resp.optString("message", "")
                        + " " + platform + " " + songId);
            }
        } catch (Exception e) {
            fileLog("lxStream FAIL " + platform + " " + songId + " : " + e);
        }
        return "";
    }

    /** 单曲歌词 [LRC, 逐词]（全平台）。 */
    public static String[] lyric(String platform, String songId) throws Exception {
        switch (platform) {
            case "netease":
                return neLyric(songId);
            case "qq": {
                Song s = qqSongDetail(songId);
                return s == null ? new String[]{"", ""} : qqLyric(s);
            }
            case "kugou":
                return kgLyric(songId, 0);
            case "kuwo":
                return kwLyric(songId);
            case "migu":
                return mgLyric(songId);
            case "soda":
                return sodaLyric(songId);
            default:
                return new String[]{"", ""};
        }
    }

    /** MV 直链（netease mvid / qq vid）。 */
    public static String mvUrl(String platform, String mvid) {
        try {
            if ("netease".equals(platform)) return neMvUrl(mvid);
            if ("qq".equals(platform)) return qqMvUrl(mvid);
        } catch (Exception e) {
            fileLog("mvUrl FAIL " + platform + " " + mvid + " : " + e);
        }
        return "";
    }

    /** playerContent（全平台统一，Spider.playerContent 委托）。 */
    public static String playerContent(String flag, String id) {
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
                String[] meta = mvMeta(platform, songId);
                String mv = meta[0].isEmpty() ? "" : mvUrl(platform, meta[0]);
                if (mv.isEmpty()) {
                    fileLog("playerContent MV unavailable id=" + id);
                    return "";
                }
                result.put("flag", "MV");
                result.put("url", mv);
                fileLog("playerContent MV done id=" + id + " cost=" + (System.currentTimeMillis() - t0) + "ms");
                return result.toString();
            }
            String url = stream(platform, songId);
            String[] lyricArr;
            try {
                lyricArr = lyric(platform, songId);
            } catch (Exception e) {
                lyricArr = new String[]{"", ""};
            }
            if (url == null || url.isEmpty()) {
                fileLog("playerContent no url id=" + id + " platform=" + platform
                        + " cost=" + (System.currentTimeMillis() - t0) + "ms (VIP或版权受限)");
                return "";
            }
            result.put("flag", flag == null || flag.isEmpty() ? PLAY_FLAG : flag);
            result.put("url", url);
            result.put("lyric", lyricArr == null ? "" : lyricArr[0]);
            result.put("klyric", lyricArr == null ? "" : lyricArr[1]);
            result.put("accompany", ""); // 伴唱音轨预留：公开平台无伴奏资源，接口下发后 UI 自动启用
            result.put("trackMode", "single");
            String[] meta = mvMeta(platform, songId);
            result.put("mv", meta[0].isEmpty() ? "" : mvUrl(platform, meta[0]));
            fileLog("playerContent done id=" + id + " lyric=" + (lyricArr == null ? 0 : lyricArr[0].length())
                    + " klyric=" + (lyricArr == null ? 0 : lyricArr[1].length())
                    + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            return result.toString();
        } catch (Exception e) {
            fileLog("playerContent FAIL id=" + id + " cost=" + (System.currentTimeMillis() - t0) + "ms : " + e);
            return "";
        }
    }

    /** 歌曲缓存元数据里的 MV id（netease mvid / qq vid）。 */
    public static String[] mvMeta(String platform, String songId) {
        if ("qq".equals(platform)) {
            String[] meta = qqSongMeta(songId);
            return new String[]{meta[0]};
        }
        return new String[]{""};
    }

    // ============================ 输出格式 ============================

    /** 歌曲缓存（uid→Song）：playerContent 阶段反查歌名（欢乐源 B 站 MV 搜索用）。 */
    private static final Map<String, Song> SONG_CACHE =
            Collections.synchronizedMap(new LinkedHashMap<String, Song>(256, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, Song> eldest) {
                    return size() > 512;
                }
            });

    /** uid 反查歌曲（未命中返回 null）。 */
    public static Song songByUid(String uid) {
        return uid == null ? null : SONG_CACHE.get(uid);
    }

    public static String songsToPageData(List<Song> songs) {
        try {
            for (Song s : songs) SONG_CACHE.put(s.uid(), s);
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            for (Song s : songs) {
                JSONObject v = new JSONObject();
                v.put("vod_id", s.uid());
                v.put("vod_name", s.name);
                v.put("vod_pic", s.cover);
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

    public static String pageDataEmpty(int page) {
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

    public static JSONObject songJson(Song s) {
        JSONObject o = new JSONObject();
        try {
            o.put("id", s.uid());
            o.put("name", s.name);
            o.put("artist", s.artist);
            o.put("album", s.album);
            o.put("cover", s.cover);
            o.put("duration", s.duration);
            o.put("platform", s.platform);
            o.put("hasK", s.hasK);
        } catch (Exception ignore) {
        }
        return o;
    }

    /** 单曲信息（action song 用）。 */
    public static Song songInfo(String uid) {
        String[] parts = splitUid(uid);
        if (parts == null) return null;
        String platform = parts[0], songId = parts[1];
        try {
            if ("kugou".equals(platform)) return new Song("kugou", songId, songId, "", "", "", 0);
            if ("qq".equals(platform)) return qqSongDetail(songId); // 单曲详情接口精确反查
            List<Song> songs = searchOne(platform, songId);
            for (Song s : songs) {
                if (s.id.equals(songId)) return s;
            }
        } catch (Exception ignore) {
        }
        return null;
    }

    // ============================ detailContent（全平台统一） ============================

    /** detailContent 主实现（2/3 段 id：单曲 / toplist / playlist）。 */
    public static String detailContent(List<String> ids) {
        long t0 = System.currentTimeMillis();
        String id = ids.get(0);
        String[] parts = id.split("_", 3);
        if (parts.length == 2) {
            return singleDetail(id, t0);
        }
        if (parts.length != 3) {
            fileLog("detailContent invalid id=" + id);
            return "";
        }
        String platform = parts[0], kind = parts[1], realId = parts[2];
        String listCoverFallback = "";
        try {
            fileLog("detailContent enter id=" + id);
            List<Song> songs;
            String title;
            if ("toplist".equals(kind)) {
                songs = rankSongs(platform, realId);
                title = platformName(platform) + " · 榜单";
            } else if ("playlist".equals(kind)) {
                String listName = "", listCover = "";
                if ("netease".equals(platform)) {
                    String[] meta = nePlaylistMeta(realId);
                    listName = meta[0];
                    listCover = meta[1];
                }
                songs = playlistSongs(platform, realId);
                title = listName.isEmpty() ? platformName(platform) + " · 歌单" : listName;
                listCoverFallback = listCover;
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
                play.append('$').append(s.hasK ? "1" : "0");
            }
            String cover = listCoverFallback.isEmpty() ? songs.get(0).cover : listCoverFallback;
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

    /** 单曲详情（2 段 uid）。 */
    private static String singleDetail(String uid, long t0) {
        try {
            Song s = songInfo(uid);
            String name = s == null ? uid : s.name;
            String artist = s == null ? "" : s.artist;
            JSONObject v = new JSONObject();
            v.put("vod_id", uid);
            v.put("vod_name", name);
            v.put("vod_pic", s == null ? "" : s.cover);
            v.put("vod_remarks", artist);
            v.put("vod_content", artist + (s == null || s.album.isEmpty() ? "" : " · " + s.album));
            v.put("type_id", uid.contains("_") ? uid.substring(0, uid.indexOf('_')) : "");
            v.put("vod_play_from", PLAY_FLAG);
            v.put("vod_play_url", "01." + name + "$" + uid);
            JSONObject root = new JSONObject();
            root.put("code", 1);
            JSONArray list = new JSONArray();
            list.put(v);
            root.put("list", list);
            fileLog("singleDetail done id=" + uid + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            return root.toString();
        } catch (Exception e) {
            fileLog("singleDetail FAIL id=" + uid + " : " + e);
            return "";
        }
    }

    // ============================ action（扫码点歌 / 歌单推送） ============================

    /** action 主实现（Spider.action 委托）。 */
    public static String action(String action) {
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
                List<Song> songs = "all".equals(platform) ? parallelSearch(kw) : searchOne(platform, kw);
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
                return playlistAction(pi[0], pi[1], t0, true);
            }
            if (action.startsWith("playlist:")) {
                String[] parts = action.split(":", 3);
                if (parts.length < 3) return "{\"error\":\"invalid playlist action\"}";
                return playlistAction(parts[1], parts[2], t0, false);
            }
            return null;
        } catch (Exception e) {
            fileLog("action FAIL " + action + " : " + e);
            return "{\"error\":\"" + e.getClass().getSimpleName() + "\"}";
        }
    }

    private static String playlistAction(String platform, String pid, long t0, boolean withMeta) throws Exception {
        List<Song> songs = playlistSongs(platform, pid);
        String[] meta = withMeta && "netease".equals(platform) ? nePlaylistMeta(pid) : new String[]{"", ""};
        JSONArray arr = new JSONArray();
        for (Song s : songs) arr.put(songJson(s));
        JSONObject root = new JSONObject();
        root.put("platform", platform);
        if (withMeta) {
            root.put("playlistId", pid);
            root.put("playlistName", meta[0]);
            root.put("playlistCover", meta[1]);
        }
        root.put("songs", arr);
        fileLog("action playlist done p=" + platform + " id=" + pid
                + " items=" + songs.size() + " cost=" + (System.currentTimeMillis() - t0) + "ms");
        return root.toString();
    }

    /** 扫码歌单推送：从六家分享 URL 解析 platform + 歌单 ID（短链不支持，需网页长链接）。 */
    public static String[] resolvePlaylistFromUrl(String url) {
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
        if (u.contains("kuwo.cn")) {
            String id = firstMatch(u, "playlist_detail/(\\d+)");
            if (id == null) id = firstMatch(u, "[?&]pid=(\\d+)");
            if (id != null) return new String[]{"kuwo", id};
        }
        if (u.contains("migu.cn")) {
            String id = firstMatch(u, "playlistId=(\\d+)");
            if (id != null) return new String[]{"migu", id};
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

    // ============================ homeContent / categoryContent ============================

    /** homeContent：all=聚合源（网易云歌单 + 热歌榜）；单平台=榜单 + 热歌（netease 加歌单 tab）。 */
    public static String homeContent(String platform, boolean filter) {
        try {
            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();
            if ("all".equals(platform)) {
                classes.put(new JSONObject().put("type_id", "netease").put("type_name", "网易云歌单"));
                classes.put(new JSONObject().put("type_id", "hot").put("type_name", "热歌榜"));
                if (filter) {
                    JSONArray cats = new JSONArray();
                    cats.put(new JSONObject().put("n", "全部").put("v", ""));
                    for (String c : neCatlist()) {
                        cats.put(new JSONObject().put("n", c).put("v", c));
                    }
                    JSONObject filters = new JSONObject();
                    filters.put("netease", new JSONArray().put(new JSONObject()
                            .put("key", "cat").put("name", "分类").put("value", cats)));
                    result.put("filters", filters);
                }
            } else {
                String pn = platformName(platform);
                if ("netease".equals(platform)) {
                    classes.put(new JSONObject().put("type_id", "netease").put("type_name", pn + "歌单"));
                }
                classes.put(new JSONObject().put("type_id", "hot").put("type_name", pn + "热歌"));
                classes.put(new JSONObject().put("type_id", platform + "_rank").put("type_name", pn + "榜单"));
                if (filter && "netease".equals(platform)) {
                    JSONArray cats = new JSONArray();
                    cats.put(new JSONObject().put("n", "全部").put("v", ""));
                    for (String c : neCatlist()) {
                        cats.put(new JSONObject().put("n", c).put("v", c));
                    }
                    JSONObject filters = new JSONObject();
                    filters.put("netease", new JSONArray().put(new JSONObject()
                            .put("key", "cat").put("name", "分类").put("value", cats)));
                    result.put("filters", filters);
                }
            }
            result.put("class", classes);
            return result.toString();
        } catch (Exception e) {
            fileLog("homeContent FAIL p=" + platform + " : " + e);
            return "";
        }
    }

    /** homeVideoContent：all=网易云精品歌单；单平台=本平台热歌榜歌曲。 */
    public static String homeVideoContent(String platform) {
        try {
            if ("all".equals(platform)) {
                List<JSONObject> pls = neHighquality(20);
                JSONObject result = new JSONObject();
                JSONArray list = new JSONArray();
                for (JSONObject p : pls) {
                    String id = String.valueOf(p.optLong("id", 0));
                    String name = p.optString("name", "").trim();
                    if (id.isEmpty() || "0".equals(id) || name.isEmpty()) continue;
                    JSONObject v = new JSONObject();
                    v.put("vod_id", "netease_playlist_" + id);
                    v.put("vod_name", name);
                    String cover = p.optString("coverImgUrl", "");
                    if (cover.startsWith("http://")) cover = "https://" + cover.substring(7);
                    v.put("vod_pic", cover);
                    v.put("vod_remarks", p.optInt("trackCount", 0) + "首");
                    v.put("vod_actor", platformName("netease"));
                    v.put("vod_content", p.optString("description", p.optString("copywriter", "")));
                    list.put(v);
                }
                result.put("list", list);
                result.put("page", 1);
                result.put("pagecount", 1);
                result.put("limit", 20);
                result.put("total", list.length());
                return result.toString();
            }
            return songsToPageData(rankSongs(platform, hotRankId(platform)));
        } catch (Exception e) {
            fileLog("homeVideoContent FAIL p=" + platform + " : " + e);
            return "";
        }
    }

    /**
     * categoryContent：
     *  - hot / {p}_hot：本平台热歌榜歌曲直出
     *  - {p}_rank：榜单卡片目录（点击进 detailContent({p}_toplist_{id})）
     *  - netease：歌单列表（cat 筛选 + 分页）
     */
    public static String categoryContent(String platform, String tid, String pg, boolean filter, HashMap<String, String> extend) {
        String platformOfTid = tid == null ? "" : tid.trim();
        try {
            if ("hot".equals(platformOfTid)) {
                // 聚合源 hot tab = 网易云热歌榜（原语义）；独立源 = 本平台热歌
                String hotPlatform = "all".equals(platform) ? "netease" : platform;
                List<Song> songs = rankSongs(hotPlatform, hotRankId(hotPlatform));
                return songsToPageData(songs);
            }
            if (platformOfTid.endsWith("_rank")) {
                String p = platformOfTid.substring(0, platformOfTid.length() - 5);
                return rankPage(p);
            }
            if ("netease".equals(platformOfTid)) {
                return nePlaylistPage(pg, extend);
            }
            return pageDataEmpty(1);
        } catch (Exception e) {
            fileLog("categoryContent FAIL tid=" + tid + " : " + e);
            return pageDataEmpty(1);
        }
    }

    /** 榜单卡片目录页。 */
    private static String rankPage(String p) {
        try {
            List<String[]> ranks = rankList(p);
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            for (String[] r : ranks) {
                JSONObject v = new JSONObject();
                v.put("vod_id", p + "_toplist_" + r[0]);
                v.put("vod_name", r[1]);
                v.put("vod_pic", r[2] == null ? "" : r[2]);
                v.put("vod_remarks", platformName(p));
                v.put("vod_actor", platformName(p));
                v.put("vod_content", platformName(p) + " · " + r[1]);
                list.put(v);
            }
            result.put("list", list);
            result.put("page", 1);
            result.put("pagecount", 1);
            result.put("limit", 50);
            result.put("total", list.length());
            return result.toString();
        } catch (Exception e) {
            fileLog("rankPage FAIL p=" + p + " : " + e);
            return pageDataEmpty(1);
        }
    }

    /** 网易云歌单列表页（cat/extend 筛选 + 分页）。 */
    private static String nePlaylistPage(String pg, HashMap<String, String> extend) {
        try {
            String cat = extend != null && extend.get("cat") != null && !extend.get("cat").trim().isEmpty()
                    ? extend.get("cat").trim() : "全部";
            int page = 1;
            try {
                page = Math.max(1, Integer.parseInt(pg == null ? "1" : pg.trim()));
            } catch (Exception ignored) {
            }
            List<JSONObject> pls = nePlaylists(cat, page);
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            int i = 0;
            for (JSONObject p : pls) {
                String id = String.valueOf(p.optLong("id", 0));
                String name = p.optString("name", "").trim();
                if (id.isEmpty() || "0".equals(id) || name.isEmpty()) continue;
                JSONObject v = new JSONObject();
                v.put("vod_id", "netease_playlist_" + id);
                v.put("vod_name", name);
                String cover = p.optString("coverImgUrl", "");
                if (cover.startsWith("http://")) cover = "https://" + cover.substring(7);
                v.put("vod_pic", cover);
                v.put("vod_remarks", p.optInt("trackCount", 0) + "首");
                v.put("vod_actor", platformName("netease"));
                v.put("vod_content", p.optString("description", p.optString("copywriter", "")));
                list.put(v);
                i++;
            }
            boolean more = pls.size() >= 30;
            result.put("list", list);
            result.put("page", page);
            result.put("pagecount", more ? page + 1 : page);
            result.put("limit", 30);
            result.put("total", more ? -1 : i);
            fileLog("categoryContent done tid=netease cat=" + cat + " pg=" + page + " items=" + i);
            return result.toString();
        } catch (Exception e) {
            fileLog("nePlaylistPage FAIL : " + e);
            return pageDataEmpty(1);
        }
    }
}
