package com.github.catvod.spider;

import android.util.Base64;
import android.util.Log;

import com.github.catvod.crawler.Spider;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPOutputStream;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 西红短剧 Spider（番茄小说 APP 内短剧板块，novelapp aid=1967）。
 * 算法蓝本：fq-Argus.kt（BearQu PR#23，源出 fqapp rust/src/sign，GPL-3.0）
 *          + Python 黄金验证栈（verify-fq-sig.py，golden vectors 全绿，2026-10-29）。
 *
 * 数据面（全部走已实测打通的签名接口）：
 *  - 设备：log.snssdk.com 匿名注册（ttEncrypt=SHA512(SHA512(rnd)||SPADE) 派生 AES key/iv），
 *    device_id/install_id/cdid/openudid 持久化到 SharedPreferences，跨请求复用；
 *  - 搜索/分类：reading/bookapi/search/tab/v（aid=1967 novelapp 65132，x-argus 551 签名 GET），
 *    search_tabs[].data[].video_data[] 即短剧卡片；分类=关键词伪分类（与红果源同手法）；
 *  - 详情：novel/player/video_detail/v1（phoenix 基址 aid=8662 71332，签名 POST），
 *    data.video_data.video_list 一次回全量剧集（vid/vid_index/title）；
 *  - 取流：novel/player/video_model/v1（aid=1967 novelapp 72132，签名 POST），
 *    data.*.video_model 为内嵌 JSON 字符串，video_list 多档清晰度，
 *    main_url 为 base64 明文 https MP4（无需解密），playerContent 直回 URL。
 */
public class Xihongshiduanju extends Spider {

    private static final String TAG = "echo-xhs-drama-jar";

    private static void fileLog(String msg) {
        Log.e(TAG, msg);
        try {
            Class<?> lw = Class.forName("com.github.gcd888.guoju.util.LogWriter");
            lw.getMethod("i", String.class).invoke(null, "echo-xhs jar: " + msg);
            return;
        } catch (Throwable ignored) {
        }
        try {
            if (mContext == null) return;
            java.io.File dir = mContext.getExternalFilesDir(null);
            if (dir == null) return;
            java.io.File f = new java.io.File(dir, "xihongshiduanju_spider.log");
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

    // ============================ 端点 ============================

    /** 搜索（reading/bookapi/search/tab，probe-fq-search.py 实测 code=0） */
    private static final String SEARCH_API = "https://api5-normal-lf.fqnovel.com/reading/bookapi/search/tab/v/";
    /** 详情（phoenix 基址 aid=8662，fqapp video_detail_url 1:1） */
    private static final String DETAIL_API = "https://api5-normal-sinfonlineb.fqnovel.com/novel/player/video_detail/v1/";
    /** 取流（Kotlin SHORTPLAY_URL 1:1） */
    private static final String STREAM_API = "https://api3-normal-sinfonlinea.fqnovel.com/novel/player/video_model/v1/";
    /** 匿名设备注册（reg-fq-test.py 链路，免签名头，x-ss-stub 走 ttEncrypt 体 md5 大写） */
    private static final String REG_API = "https://log.snssdk.com/service/2/device_register/";

    /** 搜索 UA（probe 65132 口径 1:1，签名绑定 UA 的指纹虽未验证，但保持与 probe 完全一致最稳） */
    private static final String SEARCH_UA =
            "com.dragon.read/65132 (Linux; U; Android 10; zh_CN; MI 12; Build/MMB29M; " +
            "Cronet/TTNetVersion:9ac8d95c 2024-11-25 QuicVersion:3f326df4 2024-11-14)";
    /** 详情 UA（fqapp FALLBACK_USER_AGENT 1:1） */
    private static final String DETAIL_UA =
            "com.xs.fm/632 (Linux; U; Android 15; zh_CN; 23049RAD8C; Build/AQ3A.250226.002;tt-ok/3.12.13.20)";
    /** 取流 UA（fqapp dragon_read_json_headers：裸 UA） */
    private static final String STREAM_UA = "com.xs.fm/632 (Linux; U; Android 15; zh_CN; 23049RAD8C; Build/AQ3A.250226.002; tt-ok/3.12.13.20)";
    /** 注册 UA（probe UA_REG 1:1） */
    private static final String REG_UA = SEARCH_UA;

    private static final long LICENSE_ID = 1611921764L;

    /** ttEncrypt 派生常量（reg-fq-test.py SPADE） */
    private static final String SPADE_B64 =
            "TdTC5rgxYgkOUrPHpnM7pByyRiuCmrWKGWs521cXdST0m69/COjWjSanLjfBqVovHwWlGJKu8pSXMrYqOKrdWA==";
    private static final byte[] TT_MAGIC = {0x74, 0x63, 0x05, 0x10, 0x00, 0x00};

    /** 伪分类关键词（type_id 即搜索词） */
    private static final String[] CATS = {
            "热播", "逆袭", "战神", "甜宠", "虐恋", "重生", "穿越", "赘婿",
            "神豪", "萌宝", "都市", "古装", "玄幻", "悬疑", "复仇"
    };

    private static final int PAGE_SIZE = 20;

    // ============================ 基础工具 ============================

    private static int u(byte b) {
        return b & 255;
    }

    private static byte[] concat(byte[] a, byte[] b) {
        byte[] out = new byte[a.length + b.length];
        System.arraycopy(a, 0, out, 0, a.length);
        System.arraycopy(b, 0, out, a.length, b.length);
        return out;
    }

    private static byte[] hexOf(String s) {
        byte[] out = new byte[s.length() / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = (byte) Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16);
        }
        return out;
    }

    private static String hexOf(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) sb.append(String.format("%02x", b));
        return sb.toString();
    }

    private static long le64(byte[] d, int at) {
        long out = 0;
        for (int i = 7; i >= 0; i--) out = (out << 8) | (d[at + i] & 255L);
        return out;
    }

    private static void putLe64(byte[] out, int at, long v) {
        for (int i = 0; i < 8; i++) out[at + i] = (byte) (v >>> (8 * i));
    }

    /** md5 hex 小写 */
    private static String md5Hex(byte[] data) {
        try {
            return hexOf(MessageDigest.getInstance("MD5").digest(data));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] sha512(byte[] data) {
        try {
            return MessageDigest.getInstance("SHA-512").digest(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] aes(boolean encrypt, byte[] data, byte[] key, byte[] iv) {
        try {
            // NoPadding：所有调用方已手动 pkcs7（PKCS5 会双重填充，服务端解密校验必败）
            Cipher c = Cipher.getInstance("AES/CBC/NoPadding");
            c.init(encrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE,
                    new SecretKeySpec(key, "AES"), new IvParameterSpec(iv));
            return c.doFinal(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ============================ SM3（GB/T 32905-2016） ============================
    // P1(x)=x^rotl(x,15)^rotl(x,23)；展开 W[j]=P1(W[j-16]^W[j-9]^rotl(W[j-3],15))^rotl(W[j-13],7)^W[j-6]
    // 与 gmssl/cryptography oracle 对拍确认（此前误用 (15,7) 变体已修正）。

    private static int rotl32(int v, int n) {
        return (v << n) | (v >>> (32 - n));
    }

    static byte[] sm3(byte[] msg) {
        int len = msg.length;
        int total = ((len + 8) / 64 + 1) * 64;
        byte[] m = new byte[total];
        System.arraycopy(msg, 0, m, 0, len);
        m[len] = (byte) 0x80;
        long bits = (long) len * 8;
        for (int i = 0; i < 8; i++) m[total - 1 - i] = (byte) (bits >>> (8 * i));
        int[] V = {0x7380166f, 0x4914b2b9, 0x172442d7, 0xda8a0600,
                   0xa96f30bc, 0x163138aa, 0xe38dee4d, 0xb0fb0e4e};
        int[] W = new int[68];
        for (int off = 0; off < total; off += 64) {
            for (int j = 0; j < 16; j++) {
                W[j] = ((m[off + j * 4] & 255) << 24) | ((m[off + j * 4 + 1] & 255) << 16)
                        | ((m[off + j * 4 + 2] & 255) << 8) | (m[off + j * 4 + 3] & 255);
            }
            for (int j = 16; j < 68; j++) {
                int w = W[j - 16] ^ W[j - 9] ^ rotl32(W[j - 3], 15);
                w = w ^ rotl32(w, 15) ^ rotl32(w, 23);
                w = w ^ rotl32(W[j - 13], 7) ^ W[j - 6];
                W[j] = w;
            }
            int A = V[0], B = V[1], C = V[2], D = V[3], E = V[4], F = V[5], G = V[6], H = V[7];
            for (int j = 0; j < 64; j++) {
                int T = j < 16 ? 0x79cc4519 : 0x7a879d8a;
                int SS1 = rotl32(rotl32(A, 12) + E + rotl32(T, j % 32), 7);
                int SS2 = SS1 ^ rotl32(A, 12);
                int FF, GG;
                if (j < 16) {
                    FF = A ^ B ^ C;
                    GG = E ^ F ^ G;
                } else {
                    FF = (A & B) | (A & C) | (B & C);
                    GG = (E & F) | ((~E) & G);
                }
                int TT1 = FF + D + SS2 + (W[j] ^ W[j + 4]); // W1[j]=W[j]^W[j+4]
                int TT2 = GG + H + SS1 + W[j];
                D = C;
                C = rotl32(B, 9);
                B = A;
                A = TT1;
                H = G;
                G = rotl32(F, 19);
                F = E;
                E = TT2 ^ rotl32(TT2, 9) ^ rotl32(TT2, 17);
            }
            V[0] ^= A; V[1] ^= B; V[2] ^= C; V[3] ^= D;
            V[4] ^= E; V[5] ^= F; V[6] ^= G; V[7] ^= H;
        }
        byte[] out = new byte[32];
        for (int i = 0; i < 8; i++) {
            out[i * 4] = (byte) (V[i] >>> 24);
            out[i * 4 + 1] = (byte) (V[i] >>> 16);
            out[i * 4 + 2] = (byte) (V[i] >>> 8);
            out[i * 4 + 3] = (byte) V[i];
        }
        return out;
    }

    // ============================ Simon 128/64（72 轮） ============================
    // 全 little-endian（fqapp-simon.rs / fq-Argus.kt 确认；BE 读法为已废弃的错误移植）

    private static final long Z64 = 0x3DC94C3A046D678BL;

    static long[] simonKeyExpansion(long[] k4) {
        long[] key = new long[72];
        System.arraycopy(k4, 0, key, 0, 4);
        for (int i = 4; i < 72; i++) {
            long tmp = Long.rotateRight(key[i - 1], 3) ^ key[i - 3];
            tmp ^= Long.rotateRight(tmp, 1);
            long bit = (Z64 >>> ((i - 4) % 62)) & 1;
            key[i] = key[i - 4] ^ ~tmp ^ bit ^ 3;
        }
        return key;
    }

    static long[] simonEncrypt(long x, long x1, long[] ke) {
        for (int i = 0; i < 72; i++) {
            long rk = ke[i];
            long f = Long.rotateLeft(x1, 1) & Long.rotateLeft(x1, 8);
            long nx1 = x ^ f ^ Long.rotateLeft(x1, 2) ^ rk;
            x = x1;
            x1 = nx1;
        }
        return new long[]{x, x1};
    }

    // ============================ Argus 551 签名 ============================

    private static final byte[] SIGN_KEY = hexOf(
            "fc78e0a9657a0c748ce51559903ccf03510e51d3cff232d71343e88a321c5304");
    private static final byte[] ARGUS_AES_KEY = hexOf("d31e3718288a1027baab59f146a09a9c");
    private static final byte[] ARGUS_AES_IV = hexOf("ea180a0336ed352fcd24e4d50018ae54");
    private static final byte[] MAGIC8 = {(byte) 0xf2, (byte) 0xf7, (byte) 0xfc, (byte) 0xff,
                                          (byte) 0xf2, (byte) 0xf7, (byte) 0xfc, (byte) 0xff};
    private static final byte[] TAIL9 = {(byte) 0xea, (byte) 0xfb, 0x2c, (byte) 0xfe,
                                         (byte) 0x85, 0x68, 0x51, (byte) 0x91, 0x54};

    /** encode-only protobuf writer（fq-Argus.kt ProtoBuf 1:1；varint 掩码 32 位） */
    private static final class PB {
        private final List<long[]> fields = new ArrayList<>(); // {tag, type, valueOrIndex}
        private final List<byte[]> blobs = new ArrayList<>();

        PB varint(int tag, long v) {
            fields.add(new long[]{tag, 0, v & 0xffffffffL});
            return this;
        }

        PB utf8(int tag, String s) {
            return blob(tag, s.getBytes(StandardCharsets.UTF_8));
        }

        PB bytes(int tag, byte[] b) {
            return blob(tag, b);
        }

        PB sub(int tag, PB nested) {
            return blob(tag, nested.buf());
        }

        private PB blob(int tag, byte[] data) {
            blobs.add(data);
            fields.add(new long[]{tag, 2, blobs.size() - 1});
            return this;
        }

        byte[] buf() {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            for (long[] f : fields) {
                writeVarint(out, (f[0] << 3) | f[1]);
                if (f[1] == 0) {
                    writeVarint(out, f[2]);
                } else {
                    byte[] b = blobs.get((int) f[2]);
                    writeVarint(out, b.length);
                    out.write(b, 0, b.length);
                }
            }
            return out.toByteArray();
        }

        private static void writeVarint(ByteArrayOutputStream out, long v) {
            v &= 0xffffffffL;
            while (v >= 128) {
                out.write((int) ((v & 127) | 128));
                v >>>= 7;
            }
            out.write((int) v);
        }
    }

    private static byte[] pkcs7Pad(byte[] data) {
        int pad = 16 - data.length % 16;
        byte[] out = new byte[data.length + pad];
        System.arraycopy(data, 0, out, 0, data.length);
        for (int i = data.length; i < out.length; i++) out[i] = (byte) pad;
        return out;
    }

    /** x-argus 551：bean → pkcs7 → Simon(LE) → framing(+ao) → pkcs7 → AES-CBC → F2 81 前缀 → base64 */
    static String argusSign(String query, String stubHex, long ts, long aid,
                            String deviceId, String installId, int randField) {
        PB bean = new PB();
        bean.varint(1, 1077940818L);
        bean.varint(2, 2);
        bean.varint(3, randField & 0xffffffffL);
        bean.utf8(4, String.valueOf(aid == 0 ? 1967L : aid));
        bean.utf8(5, deviceId == null ? "" : deviceId);
        bean.utf8(6, String.valueOf(LICENSE_ID));
        bean.utf8(7, qp(query, "version_name") == null ? "" : qp(query, "version_name"));
        bean.utf8(8, "v04.04.05-ov-android");
        bean.varint(9, 134744640L);
        bean.bytes(10, new byte[8]);
        bean.varint(11, 0);
        bean.varint(12, (ts << 1) & 0xffffffffL);
        // field13: bodyHash；field14: queryHash（空 stub 用 sm3(0x00*16)）
        byte[] stubBytes = new byte[0];
        if (stubHex != null && !stubHex.isEmpty()) stubBytes = hexOf(stubHex);
        bean.bytes(13, stubBytes.length == 0 ? java.util.Arrays.copyOfRange(sm3(new byte[16]), 0, 6)
                : java.util.Arrays.copyOfRange(sm3(stubBytes), 0, 6));
        bean.bytes(14, java.util.Arrays.copyOfRange(
                sm3((query == null ? "" : query).getBytes(StandardCharsets.UTF_8)), 0, 6));
        PB s15 = new PB();
        s15.varint(1, 1);
        s15.varint(2, 1);
        s15.varint(3, 1);
        s15.varint(7, 0xC792ECCCL);
        bean.sub(15, s15);
        bean.utf8(16, installId == null ? "" : installId);
        bean.utf8(20, "none");
        bean.varint(21, 738);
        PB s23 = new PB();
        s23.utf8(1, "NX551J");
        s23.varint(2, 8196);
        s23.varint(4, 0x80E0D800L);
        bean.sub(23, s23);
        bean.varint(25, 2);

        byte[] pb = pkcs7Pad(bean.buf());
        long[] ke = simonKeyExpansion(new long[]{le64(SIGN_KEY, 0), le64(SIGN_KEY, 8),
                                                 le64(SIGN_KEY, 16), le64(SIGN_KEY, 24)});
        byte[] enc = new byte[pb.length];
        for (int i = 0; i < pb.length / 16; i++) {
            long[] ct = simonEncrypt(le64(pb, i * 16), le64(pb, i * 16 + 8), ke);
            putLe64(enc, i * 16, ct[0]);
            putLe64(enc, i * 16 + 8, ct[1]);
        }
        byte[] un = concat(concat(MAGIC8, enc), TAIL9);
        byte[] buf = new byte[un.length];
        System.arraycopy(MAGIC8, 0, buf, 0, 8);
        for (int i = 8; i < un.length; i++) buf[i] = (byte) (u(un[i]) ^ u(MAGIC8[i % 8]));
        for (int i = 0, j = buf.length - 1; i < j; i++, j--) {
            byte t = buf[i]; buf[i] = buf[j]; buf[j] = t;
        }
        byte[] padded = pkcs7Pad(concat(buf, new byte[]{'a', 'o'}));
        byte[] encrypted = aes(true, padded, ARGUS_AES_KEY, ARGUS_AES_IV);
        byte[] out = new byte[2 + encrypted.length];
        out[0] = (byte) 0xf2;
        out[1] = (byte) 0x81;
        System.arraycopy(encrypted, 0, out, 2, encrypted.length);
        return Base64.encodeToString(out, Base64.NO_WRAP);
    }

    // ============================ x-ladon（fqapp-ladon.rs 1:1，全 LE） ============================

    private static long[] ladonExpandTable(String md5hex) {
        byte[] ht = new byte[288];
        byte[] prefix = md5hex.getBytes(StandardCharsets.UTF_8);
        System.arraycopy(prefix, 0, ht, 0, Math.min(32, prefix.length));
        long b0 = le64(ht, 0), b8 = le64(ht, 8);
        long[] q = new long[36];
        int qh = 0, qt = 0;
        q[qt++] = le64(ht, 16);
        q[qt++] = le64(ht, 24);
        for (int i = 0; i < 34; i++) {
            long x8 = Long.rotateRight(b8, 8) + b0;
            x8 ^= i;
            q[qt++] = x8;
            x8 ^= Long.rotateLeft(b0, 3);
            putLe64(ht, (i + 1) * 8, x8);
            b0 = x8;
            b8 = q[qh++];
        }
        long[] table = new long[36];
        for (int k = 0; k < 36; k++) table[k] = le64(ht, k * 8);
        return table;
    }

    private static byte[] ladonEncryptBlock(long[] ht, byte[] block) {
        long d0 = le64(block, 0), d1 = le64(block, 8);
        for (int i = 0; i < 34; i++) {
            d1 = ht[i] ^ (d0 + Long.rotateRight(d1, 8));
            d0 = d1 ^ Long.rotateLeft(d0, 3);
        }
        byte[] out = new byte[16];
        putLe64(out, 0, d0);
        putLe64(out, 8, d1);
        return out;
    }

    static String ladon(long ts, long lcId, long aid, byte[] rnd4) {
        byte[] data = (ts + "-" + lcId + "-" + aid).getBytes(StandardCharsets.UTF_8);
        String md5hex = md5Hex(concat(rnd4, String.valueOf(aid).getBytes(StandardCharsets.UTF_8)));
        long[] ht = ladonExpandTable(md5hex);
        int size = data.length;
        int newSize = size + (16 - size % 16);
        byte padVal = (byte) (newSize - size);
        byte[] inp = new byte[newSize];
        for (int i = 0; i < newSize; i++) inp[i] = padVal;
        System.arraycopy(data, 0, inp, 0, size);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            out.write(rnd4);
        } catch (Exception ignored) {
        }
        for (int i = 0; i < newSize / 16; i++) {
            byte[] blk = new byte[16];
            System.arraycopy(inp, i * 16, blk, 0, 16);
            byte[] ct = ladonEncryptBlock(ht, blk);
            out.write(ct, 0, 16);
        }
        return Base64.encodeToString(out.toByteArray(), Base64.NO_WRAP);
    }

    // ============================ 签名头组装（PlayerSigner.headers 1:1） ============================

    private static String qp(String query, String name) {
        if (query == null) return null;
        for (String part : query.split("&")) {
            int eq = part.indexOf('=');
            if (eq < 0) continue;
            try {
                if (java.net.URLDecoder.decode(part.substring(0, eq), "UTF-8").equals(name)) {
                    return java.net.URLDecoder.decode(part.substring(eq + 1), "UTF-8");
                }
            } catch (Exception ignored) {
            }
        }
        return null;
    }

    private static Map<String, String> playerHeaders(String query, byte[] body, long ts) {
        long aid = 1967;
        String aidStr = qp(query, "aid");
        if (aidStr != null && aidStr.matches("\\d+")) aid = Long.parseLong(aidStr);
        String stub = body != null && body.length > 0 ? md5Hex(body) : "";
        String deviceId = qp(query, "device_id");
        if (deviceId == null) deviceId = "";
        Map<String, String> h = new LinkedHashMap<>();
        h.put("x-ss-req-ticket", String.valueOf(ts * 1000));
        h.put("x-khronos", String.valueOf(ts));
        byte[] rnd4 = new byte[4];
        new SecureRandom().nextBytes(rnd4);
        h.put("x-ladon", ladon(ts, LICENSE_ID, aid, rnd4));
        h.put("x-argus", argusSign(query, stub, ts, aid, deviceId, "",
                new SecureRandom().nextInt()));
        if (!stub.isEmpty()) h.put("x-ss-stub", stub);
        return h;
    }

    // ============================ 设备注册与持久化 ============================

    private static final Object DEV_LOCK = new Object();

    /** 设备存档读取（SharedPreferences；桌面 golden 变体整体替换本方法） */
    private static String devLoad() {
        try {
            if (mContext == null) return "";
            return mContext.getSharedPreferences("xhs_duanju", 0).getString("device", "");
        } catch (Throwable t) {
            fileLog("device read FAIL : " + t);
            return "";
        }
    }

    /** 设备存档写入（桌面 golden 变体整体替换本方法） */
    private static void devSave(String json) {
        try {
            if (mContext == null) return;
            mContext.getSharedPreferences("xhs_duanju", 0).edit().putString("device", json).apply();
        } catch (Throwable ignored) {
        }
    }

    private static JSONObject device() {
        synchronized (DEV_LOCK) {
            try {
                String raw = devLoad();
                if (!raw.isEmpty()) {
                    JSONObject saved = new JSONObject(raw);
                    // device_id 必须非 0（注册被拒返回 0 时不可复用坏存档）
                    if (saved.optString("device_id", "").matches("[1-9]\\d*")
                            && !saved.optString("cdid", "").isEmpty()) {
                        return saved;
                    }
                }
            } catch (Throwable t) {
                fileLog("device read FAIL : " + t);
            }
            JSONObject dev = registerDevice();
            try {
                devSave(dev.toString());
            } catch (Throwable ignored) {
            }
            return dev;
        }
    }

    /** 匿名设备注册（reg-fq-test.py 1:1：ttEncrypt(gzip(注册JSON))，x-ss-stub=md5(body)大写） */
    private static JSONObject registerDevice() {
        try {
            String cdid = UUID.randomUUID().toString();
            byte[] openudid = new byte[8];
            new SecureRandom().nextBytes(openudid);
            String openudidHex = hexOf(openudid);
            String clientudid = UUID.randomUUID().toString();
            long now = System.currentTimeMillis();

            JSONObject header = new JSONObject();
            header.put("display_name", "番茄小说");
            header.put("update_version_code", "65132");
            header.put("manifest_version_code", "65132");
            header.put("aid", 1967);
            header.put("channel", "xiaomi_1967_64");
            header.put("package", "com.dragon.read");
            header.put("app_version", "6.5.1.32");
            header.put("version_code", "65132");
            header.put("sdk_version", "v04.04.05-ov-android");
            header.put("sdk_target_version", 29);
            header.put("os", "Android");
            header.put("os_version", "10");
            header.put("os_api", "29");
            header.put("device_model", "MI 12");
            header.put("device_brand", "Xiaomi");
            header.put("device_manufacturer", "Google");
            header.put("device_category", "phone");
            header.put("cpu_abi", "arm64-v8a");
            header.put("release_build", UUID.randomUUID().toString());
            header.put("density_dpi", "560");
            header.put("display_density", "mdpi");
            header.put("resolution", "1440x2392");
            header.put("language", "zh");
            StringBuilder mac = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                if (i > 0) mac.append(':');
                mac.append(String.format("%02X", (int) (Math.random() * 255)));
            }
            header.put("mac", mac.toString());
            header.put("timezone", 8);
            header.put("access", "wifi");
            header.put("not_request_sender", 0);
            header.put("carrier", "CHINA MOBILE");
            header.put("mcc_mnc", "46007");
            header.put("rom", "EMUI-" + UUID.randomUUID().toString().replace("-", "").substring(0, 13));
            header.put("rom_version", UUID.randomUUID().toString().replace("-", "").substring(0, 2));
            header.put("sig_hash", md5Hex(UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8)));
            header.put("openudid", openudidHex);
            header.put("clientudid", clientudid);
            header.put("sim_serial_number", new JSONArray());
            header.put("region", "CN");
            header.put("tz_name", "Asia/Shanghai");
            header.put("tz_offset", 28800);
            header.put("sim_region", "cn");

            JSONObject payload = new JSONObject();
            payload.put("magic_tag", "ss_app_log");
            payload.put("header", header);
            payload.put("_gen_time", now);
            byte[] json = payload.toString().getBytes(StandardCharsets.UTF_8);

            ByteArrayOutputStream gz = new ByteArrayOutputStream();
            GZIPOutputStream gzo = new GZIPOutputStream(gz);
            gzo.write(json);
            gzo.close();
            byte[] compressed = gz.toByteArray();

            byte[] rnd32 = new byte[32];
            new SecureRandom().nextBytes(rnd32);
            byte[] spade = Base64.decode(SPADE_B64, Base64.DEFAULT);
            MessageDigest sha = MessageDigest.getInstance("SHA-512");
            sha.update(sha512(rnd32));
            byte[] d = sha.digest(spade);
            byte[] key = new byte[16], iv = new byte[16];
            System.arraycopy(d, 0, key, 0, 16);
            System.arraycopy(d, 16, iv, 0, 16);
            byte[] inner = concat(sha512(compressed), compressed);
            int pad = 16 - inner.length % 16;
            byte[] padded = new byte[inner.length + pad];
            System.arraycopy(inner, 0, padded, 0, inner.length);
            for (int i = inner.length; i < padded.length; i++) padded[i] = (byte) pad;
            byte[] body = concat(concat(TT_MAGIC, rnd32), aes(true, padded, key, iv));

            String q = "tt_data=a&os_api=29&device_type=MI%2012&ssmix=a&manifest_version_code=65132&dpi=560"
                    + "&version_name=6.5.1.32&ts=" + (now / 1000) + "&cpu_support64=true&app_type=normal&appTheme=light&ac=wifi"
                    + "&host_abi=arm64-v8a&update_version_code=65132&channel=xiaomi_1967_64&_rticket=" + now
                    + "&device_platform=android&version_code=65132&cdid=" + cdid + "&os=android&is_android_pad=0"
                    + "&openudid=" + openudidHex + "&package=com.dragon.read&resolution=1440*2392&os_version=10&language=zh"
                    + "&device_brand=Xiaomi&need_personal_recommend=1&aid=1967&minor_status=0&app_name=novel"
                    + "&mcc_mnc=46007";
            String resp = text(REG_API + "?" + q, "POST", body, new LinkedHashMap<String, String>() {{
                put("Content-Type", "application/octet-stream;tt-data=a");
                put("User-Agent", REG_UA);
                put("Connection", "Keep-Alive");
                put("x-tt-request-tag", "t=0;n=1");
                put("log-encode-type", "gzip");
                put("x-ss-req-ticket", String.valueOf(now));
                put("sdk-version", "2");
                put("passport-sdk-version", "65132");
                put("x-vc-bdturing-sdk-version", "3.7.4.cn");
                put("x-ss-stub", md5Hex(body).toUpperCase());
                put("Accept-Encoding", "identity");
            }});
            if (resp.length() < 300) fileLog("registerDevice resp body: " + resp);
            JSONObject j = new JSONObject(resp);
            JSONObject dev = new JSONObject();
            dev.put("device_id", String.valueOf(j.optLong("device_id")));
            dev.put("install_id", String.valueOf(j.optLong("install_id")));
            dev.put("cdid", cdid);
            dev.put("openudid", openudidHex);
            fileLog("registerDevice done device_id=" + dev.optString("device_id")
                    + " install_id=" + dev.optString("install_id"));
            return dev;
        } catch (Exception e) {
            fileLog("registerDevice FAIL : " + e.getClass().getSimpleName() + ": " + e.getMessage());
            throw new RuntimeException("设备注册失败: " + e.getMessage(), e);
        }
    }

    // ============================ HTTP ============================

    private static String text(String url, String method, byte[] body, Map<String, String> headers) {
        long t0 = System.currentTimeMillis();
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(30000);
            conn.setRequestMethod(method);
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
                    if (out.size() > 33554432) break;
                }
                in.close();
            }
            String result = new String(out.toByteArray(), StandardCharsets.UTF_8);
            fileLog("http " + method + " " + url.substring(0, Math.min(120, url.length()))
                    + " -> " + code + " len=" + result.length()
                    + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            if (code >= 400) throw new RuntimeException("http " + code);
            return result;
        } catch (Exception e) {
            fileLog("http FAIL " + method + " " + url.substring(0, Math.min(120, url.length()))
                    + " : " + e.getClass().getSimpleName() + " " + e.getMessage());
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    // ============================ 搜索（签名 GET） ============================

    private static String enc(String v) {
        try {
            return URLEncoder.encode(v, "UTF-8").replace("+", "%20");
        } catch (Exception e) {
            return v;
        }
    }

    /** 搜索 query（probe common_q 顺序 1:1，签名绑定 query 字节序，勿调整顺序） */
    private static String searchQuery(String keyword, int page, JSONObject dev) {
        return "iid=" + dev.optString("install_id")
                + "&device_id=" + dev.optString("device_id")
                + "&ac=wifi&channel=xiaomi_1967_64&aid=1967&app_name=novelapp"
                + "&version_code=65132&version_name=6.5.1.32&device_platform=android&os=android&ssmix=a"
                + "&device_type=FRD-AL10&device_brand=honor&language=zh&os_api=28&os_version=9"
                + "&manifest_version_code=65132&resolution=1080*1920&dpi=480&update_version_code=65132"
                + "&cdid=" + dev.optString("cdid")
                + "&query=" + enc(keyword)
                + "&offset=" + ((page - 1) * PAGE_SIZE)
                + "&count=" + PAGE_SIZE
                + "&search_source=0";
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

    private static boolean valid(String id, String title) {
        return id.matches("[0-9]{1,30}") && !title.trim().isEmpty();
    }

    /** video_data 条目 → Series（短剧卡片字段：series_id/video_detail{series_*}） */
    private static Series cardOf(JSONObject vd) {
        JSONObject d = vd.optJSONObject("video_detail");
        if (d == null) d = vd;
        String id = d.optString("series_id", vd.optString("series_id", ""));
        String name = d.optString("series_title", d.optString("title", ""));
        int count = d.optInt("episode_cnt", vd.optInt("episode_cnt", 0));
        String badge = d.optString("episode_right_text", "");
        if (badge.isEmpty() && count > 0) badge = "全" + count + "集";
        long play = d.optLong("series_play_cnt", vd.optLong("play_cnt", 0));
        if (play > 0 && badge.isEmpty()) badge = play > 100000000 ? "播放过亿" : play / 10000 + "万播放";
        String cover = d.optString("series_cover", vd.optString("cover", ""));
        String intro = d.optString("series_intro", vd.optString("video_desc", ""));
        if (!valid(id, name)) return null;
        return new Series(id, name.trim(), cover, intro, badge, "");
    }

    /** 搜索响应 → Series 列表（search_tabs[].data[].video_data[] + novel_aggregation_card_items） */
    private static List<Series> parseSearch(String resp) {
        List<Series> out = new ArrayList<>();
        try {
            JSONObject j = new JSONObject(resp);
            JSONArray tabs = j.optJSONArray("search_tabs");
            if (tabs == null) {
                fileLog("parseSearch: search_tabs missing, topKeys=" + keysOf(j));
                return out;
            }
            for (int t = 0; t < tabs.length(); t++) {
                JSONObject tab = tabs.optJSONObject(t);
                if (tab == null) continue;
                JSONArray cells = tab.optJSONArray("data");
                if (cells == null) continue;
                for (int c = 0; c < cells.length(); c++) {
                    JSONObject cell = cells.optJSONObject(c);
                    if (cell == null) continue;
                    JSONArray vds = cell.optJSONArray("video_data");
                    if (vds != null) {
                        for (int v = 0; v < vds.length(); v++) {
                            JSONObject vd = vds.optJSONObject(v);
                            if (vd == null) continue;
                            Series s = cardOf(vd);
                            if (s != null) out.add(s);
                        }
                    }
                    JSONArray aggs = cell.optJSONArray("novel_aggregation_card_items");
                    if (aggs != null) {
                        for (int a = 0; a < aggs.length(); a++) {
                            JSONObject item = aggs.optJSONObject(a);
                            if (item == null) continue;
                            JSONObject vd = item.optJSONObject("video_data");
                            if (vd == null) continue;
                            Series s = cardOf(vd);
                            if (s != null) out.add(s);
                        }
                    }
                }
            }
        } catch (Exception e) {
            fileLog("parseSearch FAIL : " + e);
        }
        // series_id 去重
        List<Series> distinct = new ArrayList<>();
        for (Series s : out) {
            boolean dup = false;
            for (Series d : distinct) if (d.id.equals(s.id)) { dup = true; break; }
            if (!dup) distinct.add(s);
        }
        return distinct;
    }

    private static String keysOf(JSONObject o) {
        if (o == null) return "(null)";
        StringBuilder sb = new StringBuilder();
        java.util.Iterator<String> it = o.keys();
        while (it.hasNext()) {
            if (sb.length() > 0) sb.append(',');
            sb.append(it.next());
        }
        return sb.toString();
    }

    /** App 端搜索一页（签名 GET，失败上抛由调用方兜底） */
    private List<Series> appSearchPage(String keyword, int page) {
        JSONObject dev = device();
        String query = searchQuery(keyword, page, dev);
        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("User-Agent", SEARCH_UA);
        headers.put("Accept-Language", "zh-CN,zh;q=0.9");
        headers.putAll(playerHeaders(query, null, System.currentTimeMillis() / 1000));
        String resp = text(SEARCH_API + "?" + query, "GET", null, headers);
        List<Series> items = parseSearch(resp);
        fileLog("appSearchPage kw=[" + keyword + "] page=" + page + " items=" + items.size());
        return items;
    }

    // ============================ 详情（签名 POST，全量剧集） ============================

    private static String detailQuery(JSONObject dev) {
        return "iid=" + dev.optString("install_id")
                + "&device_id=" + dev.optString("device_id")
                + "&ac=wifi&channel=update_64&aid=8662&app_name=novelread"
                + "&version_code=71332&version_name=7.1.3.32&device_platform=android&os=android&ssmix=a"
                + "&device_type=25053RT47C&device_brand=Redmi&language=zh&os_api=36&os_version=16"
                + "&manifest_version_code=71332&resolution=1280*2772&dpi=520&update_version_code=71332"
                + "&host_abi=arm64-v8a&dragon_device_type=phone&pv_player=71332&compliance_status=0"
                + "&need_personal_recommend=1&player_so_load=1&is_android_pad_screen=0";
    }

    /** video_detail：返回 {eps:[{vid,vid_index,title}], vd:video_data顶层}，eps 按 vid_index 升序 */
    private static JSONObject detailAll(String seriesId) {
        try {
            JSONObject dev = device();
            String query = detailQuery(dev);
            JSONObject bodyObj = new JSONObject();
            bodyObj.put("series_id", seriesId);
            JSONObject biz = new JSONObject();
            biz.put("device_level", 3);
            biz.put("need_all_video_definition", true);
            biz.put("need_mp4_align", false);
            biz.put("source", 5);
            biz.put("use_os_player", false);
            biz.put("video_id_type", 1);
            bodyObj.put("biz_param", biz);
            byte[] body = bodyObj.toString().getBytes(StandardCharsets.UTF_8);
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("User-Agent", DETAIL_UA);
            headers.put("Accept", "application/json; charset=utf-8,application/x-protobuf");
            headers.put("Content-Type", "application/json");
            headers.put("x-xs-from-web", "0");
            headers.put("sdk-version", "2");
            headers.put("Accept-Language", "zh-CN,zh;q=0.9");
            headers.putAll(playerHeaders(query, body, System.currentTimeMillis() / 1000));
            String resp = text(DETAIL_API + "?" + query, "POST", body, headers);
            JSONObject j = new JSONObject(resp);
            if (j.optInt("code", -1) != 0) {
                throw new RuntimeException("detail code=" + j.optInt("code") + " " + j.optString("message"));
            }
            JSONObject data = j.optJSONObject("data");
            JSONObject vd = data == null ? null : data.optJSONObject("video_data");
            JSONArray list = vd == null ? null : vd.optJSONArray("video_list");
            List<JSONObject> eps = new ArrayList<>();
            if (list != null) {
                for (int i = 0; i < list.length(); i++) {
                    JSONObject ep = list.optJSONObject(i);
                    if (ep != null && ep.optString("vid", "").matches("\\d+")) eps.add(ep);
                }
            }
            // vid_index 升序
            java.util.Collections.sort(eps, new java.util.Comparator<JSONObject>() {
                @Override
                public int compare(JSONObject a, JSONObject b) {
                    return Long.compare(a.optLong("vid_index"), b.optLong("vid_index"));
                }
            });
            fileLog("detailAll sid=" + seriesId + " eps=" + eps.size()
                    + " title=" + (vd == null ? "?" : vd.optString("series_title", "")));
            JSONObject out = new JSONObject();
            JSONArray epArr = new JSONArray();
            for (JSONObject ep : eps) epArr.put(ep);
            out.put("eps", epArr);
            out.put("vd", vd == null ? new JSONObject() : vd);
            return out;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("详情获取失败: " + e.getMessage(), e);
        }
    }

    // ============================ 取流（签名 POST + spade CENC 解密，红果蓝本同构） ============================
    // 实测（2026-10-29）：免签请求空 body；551 签名请求服务端只给 spade_a 加密档（CENC）。
    // 播放链路移植红果 Guoguoduanju：spade_a → deriveKey → moov 索引 → 逐样本 AES-CTR → proxy 分段解密。

    private static final class StreamInfo {
        final String url, quality;
        final byte[] key; // null = 明文

        StreamInfo(String url, byte[] key, String quality) {
            this.url = url;
            this.key = key;
            this.quality = quality;
        }
    }

    /** video_model 响应 → 选定档（spade_a 空优先=免解密，bytevc2 排除，vwidth 高分优先） */
    private static StreamInfo pickStream(String resp) {
        try {
            JSONObject j = new JSONObject(resp);
            int code = j.optInt("code", j.optInt("Code", -1));
            if (code != 0) throw new RuntimeException("stream code=" + code + " " + j.optString("message"));
            JSONObject data = j.optJSONObject("data");
            if (data == null) throw new RuntimeException("stream data missing");
            // 结构 A：data[vid].video_model（嵌套）；结构 B：data.video_model 平铺——两者兼容
            Object vmRaw = null;
            java.util.Iterator<String> it = data.keys();
            while (it.hasNext()) {
                String mk = it.next();
                JSONObject ent = data.optJSONObject(mk);
                if (ent == null) continue;
                if (ent.has("video_model")) {
                    vmRaw = ent.opt("video_model");
                    break;
                }
            }
            if (vmRaw == null) vmRaw = data.opt("video_model");
            if (vmRaw == null) throw new RuntimeException("video_model 缺失");
            JSONObject vm;
            if (vmRaw instanceof String) {
                try {
                    vm = new JSONObject((String) vmRaw);
                } catch (Exception e) {
                    throw new RuntimeException("video_model 字符串解析失败");
                }
            } else if (vmRaw instanceof JSONObject) {
                vm = (JSONObject) vmRaw;
            } else {
                throw new RuntimeException("video_model 类型异常");
            }
            Object vl = vm.opt("video_list");
            JSONObject best = null;
            int bestScore = -1;
            int total = 0;
                if (vl instanceof JSONObject) {
                    JSONObject vlm = (JSONObject) vl;
                    java.util.Iterator<String> kit = vlm.keys();
                    while (kit.hasNext()) {
                        JSONObject q = vlm.optJSONObject(kit.next());
                        if (q == null) continue;
                        total++;
                        // 排除 bytevc2/bvc2（壳侧播放器兼容性），其余按宽高分；spade_a 加密档照收（走 CENC 解密）
                        String codec = q.optString("codec_type", "");
                        if (codec.contains("bytevc2") || codec.contains("bvc2")) continue;
                        if (q.optString("main_url", "").isEmpty()) continue;
                        int score = q.optInt("vwidth", 0) * 100 + q.optInt("bitrate", 0) / 1000;
                        if (score > bestScore) {
                            bestScore = score;
                            best = q;
                        }
                    }
                } else if (vl instanceof JSONArray) {
                    JSONArray vla = (JSONArray) vl;
                    total = vla.length();
                    for (int i = 0; i < vla.length(); i++) {
                        JSONObject q = vla.optJSONObject(i);
                        if (q == null) continue;
                        String codec = q.optString("codec_type", "");
                        if (codec.contains("bytevc2") || codec.contains("bvc2")) continue;
                        if (q.optString("main_url", "").isEmpty()) continue;
                        int score = q.optInt("vwidth", 0) * 100 + q.optInt("bitrate", 0) / 1000;
                        if (score > bestScore) {
                            bestScore = score;
                            best = q;
                        }
                    }
                }
            if (best != null) {
                byte[] urlBytes = Base64.decode(best.optString("main_url"), Base64.DEFAULT);
                String url = cleanUrl(new String(urlBytes, StandardCharsets.UTF_8).trim());
                if (!url.startsWith("http")) {
                    // 尝试 URL-safe base64 兜底
                    url = cleanUrl(new String(Base64.decode(url, Base64.URL_SAFE), StandardCharsets.UTF_8).trim());
                }
                if (!url.startsWith("http")) throw new RuntimeException("main_url 解码异常");
                String def = qualityText(best);
                fileLog("pickStream 档数=" + total + " 选=" + def
                        + " vwidth=" + best.optInt("vwidth", 0)
                        + " spade=" + (best.optString("spade_a", "").isEmpty() ? "无" : "有"));
                byte[] key = null;
                if (!best.optString("spade_a", "").isEmpty()) {
                    key = deriveKey(best.optString("spade_a"));
                }
                return new StreamInfo(url, key, def);
            }
            throw new RuntimeException("video_model 无可播放档位");
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("取流解析失败: " + e.getMessage(), e);
        }
    }

    private static StreamInfo stream(String vid) {
        try {
            Long at = STREAM_CACHE_AT.get(vid);
            StreamInfo cached = at == null ? null : STREAM_CACHE.get(vid);
            if (cached != null && System.currentTimeMillis() - at < STREAM_TTL) {
                return cached;
            }
            JSONObject dev = device();
            String query = "iid=" + dev.optString("install_id")
                    + "&device_id=" + dev.optString("device_id")
                    + "&aid=1967&app_name=novelapp&version_code=72132"
                    + "&version_name=7.2.1.32&device_platform=android&device_brand=Xiaomi"
                    + "&os_version=13&cdid=" + dev.optString("cdid")
                    + "&_rticket=" + System.currentTimeMillis();
            JSONObject bodyObj = new JSONObject();
            bodyObj.put("video_id", vid);
            bodyObj.put("content_type", 1004);
            JSONObject biz = new JSONObject();
            biz.put("detail_page_version", 0);
            biz.put("device_level", 3);
            biz.put("disable_digg_stat", false);
            biz.put("disable_video_relate_book", false);
            biz.put("from_video_id", "");
            biz.put("need_all_video_definition", true);
            biz.put("need_mp4_align", false);
            biz.put("source", 4);
            biz.put("use_os_player", false);
            biz.put("use_server_dns", false);
            biz.put("video_platform", 3);
            bodyObj.put("biz_param", biz);
            byte[] body = bodyObj.toString().getBytes(StandardCharsets.UTF_8);
            // 取流口径实测：免签请求返回空 body（2026-10-29 起），必须 551 签名才有数据
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("User-Agent", STREAM_UA);
            headers.put("Content-Type", "application/json; charset=utf-8");
            headers.put("Accept", "application/json; charset=utf-8,application/x-protobuf");
            headers.put("Accept-Encoding", "identity");
            headers.putAll(playerHeaders(query, body, System.currentTimeMillis() / 1000));
            String resp = text(STREAM_API + "?" + query, "POST", body, headers);
            StreamInfo si = pickStream(resp);
            STREAM_CACHE.put(vid, si);
            STREAM_CACHE_AT.put(vid, System.currentTimeMillis());
            fileLog("stream done vid=" + vid + " quality=" + si.quality
                    + " key=" + (si.key == null ? "none" : "spade"));
            return si;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("取流失败: " + e.getMessage(), e);
        }
    }

    // ============================ spade 解密 + 本地代理（红果 Guoguoduanju 1:1 移植） ============================

    private static final int SEG_SIZE = 1048576;       // proxy 分段 1MB
    private static final int HEADER_HINT = 8388608;    // moov 头部兜底抓取 8MB
    private static final long STREAM_TTL = 30L * 60 * 1000; // 取流数据 expire_time 约 28~54 分钟

    /** spade 密钥派生常量（蓝本 SPADE_CONST）。 */
    private static final String SPADE_CONST =
            "4dd4c2e6b83162090e52b3c7a6733ba41cb2462b829ab58a196b39db57177524f49baf7f08e8d68d26a72e37c1a95a2f1f05a51892aef2949732b62a38aadd58";

    /** 取流结果缓存：proxy 每 1MB 分段都回调，必须复用签名请求结果。 */
    private static final Map<String, StreamInfo> STREAM_CACHE =
            Collections.synchronizedMap(new LinkedHashMap<String, StreamInfo>(8, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, StreamInfo> eldest) {
                    return size() > 8;
                }
            });
    private static final Map<String, Long> STREAM_CACHE_AT = new HashMap<String, Long>();

    private static String cleanUrl(String v) {
        return v.replace("\\/", "/")
                .replaceAll("(?i)\\\\u002f", "/")
                .replace("\\u0026", "&")
                .replace("&amp;", "&");
    }

    /** 蓝本 qualityText：档位描述兜底链。 */
    private static String qualityText(JSONObject q) {
        String v = q.optString("quality_desc", "");
        if (v.isEmpty() || "0".equals(v)) v = String.valueOf(q.optInt("height", 0));
        if (v.isEmpty() || "0".equals(v)) v = String.valueOf(q.optInt("vheight", 0));
        if (v.isEmpty() || "0".equals(v)) v = String.valueOf(q.optInt("quality", 0));
        if (v.isEmpty() || "0".equals(v)) v = String.valueOf(q.optInt("vwidth", 0));
        return v;
    }

    /** spade_a 密钥派生（蓝本 MediaCrypto.deriveKey）。 */
    private static byte[] deriveKey(String value) {
        byte[] raw = Base64.decode(value, Base64.DEFAULT);
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

    /** 多模式 AES（红果 aes：CBC/CTR 通用，NoPadding）。 */
    private static byte[] aesMode(boolean encrypt, byte[] key, byte[] iv, byte[] data, String mode) {
        try {
            Cipher cipher = Cipher.getInstance("AES/" + mode + "/NoPadding");
            cipher.init(encrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE,
                    new SecretKeySpec(key, "AES"), new IvParameterSpec(iv));
            return cipher.doFinal(data);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /** 取 CDN 分段字节，total[0] 回填文件总长。 */
    private static byte[] range(String url, long start, long end, long[] total) {
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(30000);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", STREAM_UA);
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

    // ---- MP4/CENC（蓝本 MediaCrypto.prepare/decrypt 同构） ----

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

        List<Sample> samples = new ArrayList<Sample>();
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

            // moov 改写：encv/enca → frma 原始编码，sinf → free 清零体
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

        Collections.sort(samples, new java.util.Comparator<Sample>() {
            @Override
            public int compare(Sample a, Sample b) {
                return Long.compare(a.start, b.start);
            }
        });
        for (int i = 1; i < samples.size(); i++) {
            if (samples.get(i).start < samples.get(i - 1).end) throw new RuntimeException("视频样本重叠");
        }
        // 头部截到 moov 结束：mdat 区间的密文字节绝不能进 header
        return new Prepared(Arrays.copyOf(header, moovEnd), samples);
    }

    private static byte[] decryptBytes(byte[] data, long start, byte[] key, Prepared prepared) {
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
            byte[] decrypted = aesMode(false, key, iv, input, "CTR");
            System.arraycopy(decrypted, skip, result, (int) (begin - start), (int) (stop - begin));
        }
        return result;
    }

    private static final Map<String, Prepared> PREPARED_CACHE =
            Collections.synchronizedMap(new LinkedHashMap<String, Prepared>(4, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, Prepared> eldest) {
                    return size() > 8;
                }
            });

    private static Prepared prepareFor(String vid, StreamInfo si, long total, byte[] firstBody) {
        synchronized (PREPARED_CACHE) {
            Prepared hit = PREPARED_CACHE.get(vid);
            if (hit != null) return hit;
        }
        byte[] headerBody = firstBody;
        if (headerBody == null || headerBody.length == 0) {
            long[] totalRef = {total};
            headerBody = range(si.url, 0, Math.max(HEADER_HINT, total) - 1L, totalRef);
        }
        Prepared p = prepare(headerBody, si.key);
        synchronized (PREPARED_CACHE) {
            PREPARED_CACHE.put(vid, p);
        }
        return p;
    }

    /** 壳本地代理回调：206 分段解密（红果 Guoguoduanju.proxy 1:1）。 */
    @Override
    public Object[] proxy(Map<String, String> params) {
        try {
            if (!"play".equals(params.get("do"))) return null;
            String vid = params.get("vid");
            if (vid == null || !vid.matches("\\d+")) {
                fileLog("proxy invalid vid=" + vid);
                return null;
            }
            String range = params.get("__range");
            if (range == null || range.isEmpty()) range = params.get("range");
            if (range == null || range.isEmpty()) range = "bytes=0-";
            java.util.regex.Matcher m = java.util.regex.Pattern.compile("bytes=(\\d+)-(\\d*)").matcher(range);
            if (!m.find()) {
                fileLog("proxy bad range=" + range);
                return null;
            }
            long start = Long.parseLong(m.group(1));

            StreamInfo si = stream(vid);
            long[] totalRef = {0};
            long wantEnd = start + SEG_SIZE - 1;
            byte[] body = range(si.url, start, wantEnd, totalRef);
            long total = totalRef[0];
            if (total <= 0) total = start + body.length;

            Prepared prepared = si.key == null
                    ? new Prepared(new byte[0], new ArrayList<Sample>())
                    : prepareFor(vid, si, total, start == 0 ? body : null);
            byte[] decrypted = decryptBytes(body, start, si.key, prepared);

            if (decrypted.length == 0) {
                Map<String, String> errHeaders = new LinkedHashMap<>();
                errHeaders.put("Content-Length", "0");
                return new Object[]{404, "text/plain", new ByteArrayInputStream(new byte[0]), errHeaders};
            }
            long realEnd = start + decrypted.length - 1;
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Range", "bytes " + start + "-" + realEnd + "/" + total);
            headers.put("Accept-Ranges", "bytes");
            fileLog("proxy vid=" + vid + " start=" + start + " got=" + body.length + " total=" + total);
            return new Object[]{206, "video/mp4", new ByteArrayInputStream(decrypted), headers};
        } catch (Exception e) {
            fileLog("proxy FAIL vid=" + params.get("vid") + " : " + e);
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Length", "0");
            return new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0]), headers};
        }
    }

    // ============================ Spider 接口 ============================

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();
            for (String c : CATS) {
                classes.put(new JSONObject().put("type_id", c).put("type_name", c));
            }
            result.put("class", classes);
            fileLog("homeContent done cats=" + CATS.length);
            return result.toString();
        } catch (Exception e) {
            fileLog("homeContent FAIL : " + e);
            return "";
        }
    }

    @Override
    public String homeVideoContent() {
        try {
            List<Series> items = appSearchPage("短剧", 1);
            return pageData(items, 1, 1, false).toString();
        } catch (Throwable t) {
            fileLog("homeVideoContent FAIL : " + t.getClass().getSimpleName() + ": " + t.getMessage());
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
        String kw = tid == null ? "" : tid.trim();
        if (kw.isEmpty()) kw = "短剧";
        try {
            List<Series> items = appSearchPage(kw, page);
            fileLog("categoryContent done kw=" + kw + " page=" + page + " items=" + items.size());
            return pageData(items, page, items.size() >= PAGE_SIZE ? page + 1 : page,
                    items.size() >= PAGE_SIZE).toString();
        } catch (Throwable t) {
            fileLog("categoryContent FAIL kw=" + kw + " page=" + page
                    + " : " + t.getClass().getSimpleName() + ": " + t.getMessage());
            return pageData(new ArrayList<Series>(), page, page, false).toString();
        }
    }

    @Override
    public String searchContent(String key, boolean quick) {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        long t0 = System.currentTimeMillis();
        int page = 1;
        try {
            page = Math.max(1, Integer.parseInt(pg == null ? "1" : pg.trim()));
        } catch (Exception ignore) {
        }
        String keyword = key == null ? "" : key.trim();
        fileLog("searchContent enter kw=[" + keyword + "] page=" + page + " quick=" + quick);
        if (keyword.isEmpty() || keyword.length() > 80) {
            return pageData(new ArrayList<Series>(), page, page, false).toString();
        }
        try {
            List<Series> items = appSearchPage(keyword, page);
            fileLog("searchContent done kw=[" + keyword + "] page=" + page + " items=" + items.size()
                    + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            return pageData(items, page, items.size() >= PAGE_SIZE ? page + 1 : page,
                    items.size() >= PAGE_SIZE).toString();
        } catch (Throwable t) {
            fileLog("searchContent FAIL kw=[" + keyword + "] page=" + page
                    + " : " + t.getClass().getSimpleName() + ": " + t.getMessage());
            return pageData(new ArrayList<Series>(), page, page, false).toString();
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        long t0 = System.currentTimeMillis();
        try {
            String id = ids.get(0);
            fileLog("detailContent enter id=" + id);
            JSONObject all = detailAll(id);
            JSONArray epArr = all.optJSONArray("eps");
            JSONObject vd = all.optJSONObject("vd");
            int eps = epArr == null ? 0 : epArr.length();
            if (eps == 0) throw new RuntimeException("video_list 空");
            String name = vd.optString("series_title", "");
            String cover = vd.optString("series_cover", "");
            String intro = vd.optString("series_intro", "");
            String badge = vd.optString("episode_right_text", "");
            if (name.isEmpty()) name = "西红短剧 " + id;
            if (badge.isEmpty()) badge = "全" + eps + "集";

            StringBuilder play = new StringBuilder();
            for (int i = 0; i < eps; i++) {
                JSONObject ep = epArr.optJSONObject(i);
                if (i > 0) play.append('#');
                // 分集 id 必须是纯数字 vid：壳原样传给 playerContent
                play.append("第").append(String.format("%02d", i + 1)).append("集$").append(ep.optString("vid"));
            }

            JSONObject v = new JSONObject();
            v.put("vod_id", id);
            v.put("vod_name", name);
            v.put("vod_pic", cover);
            v.put("vod_content", intro);
            v.put("vod_remarks", badge);
            v.put("type_id", "热播");
            v.put("type_name", "西红短剧");
            v.put("vod_play_from", "西红短剧");
            v.put("vod_play_url", play.toString());
            // 壳侧 AbsJson 只解析 MacCMS 格式 {"list":[...]}
            JSONObject root = new JSONObject();
            root.put("code", 1);
            JSONArray list = new JSONArray();
            list.put(v);
            root.put("list", list);
            fileLog("detailContent done id=" + id + " name=" + name + " eps=" + eps
                    + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            return root.toString();
        } catch (Exception e) {
            fileLog("detailContent FAIL ids=" + ids + " : " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        long t0 = System.currentTimeMillis();
        try {
            // spade CENC 加密档：统一走壳本地代理解密（红果同构）；明文档 proxy 内透传
            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("header", new JSONObject());
            // flag 必须回显入参（壳侧 stale 校验比较 flag，否则结果被当过期丢弃）
            result.put("flag", flag == null || flag.isEmpty() ? "西红短剧" : flag);
            result.put("url", "proxy://do=play&siteKey="
                    + (siteKey == null || siteKey.isEmpty() ? "xihongshiduanju" : siteKey)
                    + "&vid=" + id);
            fileLog("playerContent id=" + id + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            return result.toString();
        } catch (Exception e) {
            fileLog("playerContent FAIL id=" + id + " cost=" + (System.currentTimeMillis() - t0)
                    + "ms : " + e);
            try {
                String reason = e.getMessage() == null || e.getMessage().isEmpty()
                        ? e.getClass().getSimpleName() : e.getMessage();
                JSONObject err = new JSONObject();
                err.put("msg", "获取播放数据失败：" + reason);
                err.put("flag", flag == null || flag.isEmpty() ? "西红短剧" : flag);
                err.put("url", "");
                err.put("parse", 0);
                return err.toString();
            } catch (Exception ignored) {
                return "";
            }
        }
    }

    private static JSONObject pageData(List<Series> items, int page, int lastPage, boolean hasMore) {
        JSONObject result = new JSONObject();
        try {
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
            result.put("limit", PAGE_SIZE);
            result.put("total", 0);
        } catch (Exception ignored) {
        }
        return result;
    }

    // ============================ 桌面 golden 自检（javac 直跑 main） ============================

    public static void main(String[] args) {
        boolean ok = true;
        // SM3 标准向量
        String s1 = hexOf(sm3("abc".getBytes(StandardCharsets.UTF_8)));
        ok &= "66c7f0f462eeedd9d1f2d46bdc10e4e24167c4875cf2f7a2297da02b8f4ba8e0".equals(s1);
        String s0 = hexOf(sm3(new byte[0]));
        ok &= "1ab21d8355cfa17f8e61194831e81a8f22bec8c728fefb747ed035eb5082aa2b".equals(s0);
        System.out.println("[sm3] " + ok + " " + s1);
        // x-ladon golden（probe 实测向量）
        String lad = ladon(1700000000L, LICENSE_ID, 1967L, new byte[]{1, 2, 3, 4});
        boolean ladOk = "AQIDBKM7Y7bWnOIUXmTybD6/MpGbuge4sBwUJsyHVivhtMsH".equals(lad);
        System.out.println("[ladon] " + ladOk + " " + lad);
        ok &= ladOk;
        // Simon key expansion 自洽：enc→结构稳定（权威向量在 fq-vectors.json，E2E 复验）
        long[] ke = simonKeyExpansion(new long[]{le64(SIGN_KEY, 0), le64(SIGN_KEY, 8),
                                                 le64(SIGN_KEY, 16), le64(SIGN_KEY, 24)});
        boolean keOk = ke.length == 72 && ke[71] != 0;
        System.out.println("[simon] keyexp " + keOk);
        ok &= keOk;
        // argus 551 输出格式自检（前缀 F2 81 + base64 可解）
        String argus = argusSign("aid=1967&device_id=123&version_name=6.5.1.32", "", 1700000000L,
                1967L, "123", "", 42);
        boolean aOk = argus.length() > 32;
        byte[] dec = Base64.decode(argus, Base64.DEFAULT);
        aOk &= dec.length > 18 && u(dec[0]) == 0xf2 && u(dec[1]) == 0x81;
        System.out.println("[argus] fmt " + aOk);
        ok &= aOk;
        System.out.println(ok ? "GOLDEN ALL GREEN" : "GOLDEN FAIL");
        if (!ok) System.exit(1);
    }
}
