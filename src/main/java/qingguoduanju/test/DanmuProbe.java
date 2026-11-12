package com.github.catvod.spider;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 桌面弹幕探针：tsukiyo hongguoTV CommentSignature/CommentTransport/TimedComments 的 Java 1:1 移植验证。
 * 用法：java DanmuProbe <vid> <seriesId> [durationSec] [aid]
 * 实测窗口循环（30s/窗，count=90，has_more + next_query_danmaku_list_time 推进）并输出 B 站 XML 概要。
 */
public class DanmuProbe {

    // ============================ 基础工具 ============================

    static byte[] md5(byte[] data) {
        try {
            return MessageDigest.getInstance("MD5").digest(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static byte[] hex(String s) {
        byte[] out = new byte[s.length() / 2];
        for (int i = 0; i < out.length; i++) out[i] = (byte) Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16);
        return out;
    }

    static String hexOf(byte[] b) {
        StringBuilder sb = new StringBuilder(b.length * 2);
        for (byte v : b) sb.append(String.format("%02x", v & 255));
        return sb.toString();
    }

    static byte[] concat(byte[]... parts) {
        int len = 0;
        for (byte[] p : parts) len += p.length;
        byte[] out = new byte[len];
        int at = 0;
        for (byte[] p : parts) {
            System.arraycopy(p, 0, out, at, p.length);
            at += p.length;
        }
        return out;
    }

    static long word64le(byte[] b, int at) {
        return ByteBuffer.wrap(b, at, 8).order(ByteOrder.LITTLE_ENDIAN).getLong();
    }

    static byte[] le64(long v) {
        return ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(v).array();
    }

    static byte[] be32(int v) {
        return new byte[]{(byte) (v >>> 24), (byte) (v >>> 16), (byte) (v >>> 8), (byte) v};
    }

    static int u(byte b) {
        return b & 255;
    }

    static byte[] pkcs7(byte[] data) {
        int pad = 16 - data.length % 16;
        byte[] out = Arrays.copyOf(data, data.length + pad);
        Arrays.fill(out, data.length, out.length, (byte) pad);
        return out;
    }

    // ============================ SM3（红果 jar 同款实现） ============================

    static int rol32(int v, int n) {
        n &= 31;
        return n == 0 ? v : Integer.rotateLeft(v, n);
    }

    static byte[] sm3(byte[] input) {
        int[] iv = {0x7380166f, 0x4914b2b9, 0x172442d7, 0xda8a0600,
                0xa96f30bc, 0x163138aa, 0xe38dee4d, 0xb0fb0e4e};
        int[] t = {0x79cc4519, 0x7a879d8a};
        long bitLen = (long) input.length * 8;
        byte[] msg = Arrays.copyOf(input, ((input.length + 8) / 64 + 1) * 64);
        msg[input.length] = (byte) 0x80;
        for (int i = 0; i < 8; i++) msg[msg.length - 1 - i] = (byte) (bitLen >>> (8 * i));
        int[] w = new int[68];
        int[] w1 = new int[64];
        for (int off = 0; off < msg.length; off += 64) {
            for (int i = 0; i < 16; i++) {
                w[i] = ((msg[off + i * 4] & 255) << 24) | ((msg[off + i * 4 + 1] & 255) << 16)
                        | ((msg[off + i * 4 + 2] & 255) << 8) | (msg[off + i * 4 + 3] & 255);
            }
            for (int i = 16; i < 68; i++) {
                int p1in = w[i - 16] ^ w[i - 9] ^ rol32(w[i - 3], 15);
                int p1 = p1in ^ rol32(p1in, 15) ^ rol32(p1in, 23);
                w[i] = p1 ^ rol32(w[i - 13], 7) ^ w[i - 6];
            }
            for (int i = 0; i < 64; i++) w1[i] = w[i] ^ w[i + 4];
            int a = iv[0], b = iv[1], c = iv[2], d = iv[3], e = iv[4], f = iv[5], g = iv[6], h = iv[7];
            for (int j = 0; j < 64; j++) {
                boolean j16 = j < 16;
                int tj = j16 ? t[0] : t[1];
                int ff = j16 ? (a ^ b ^ c) : ((a & b) | (a & c) | (b & c));
                int gg = j16 ? (e ^ f ^ g) : ((e & f) | ((~e) & g));
                int ss1 = rol32(rol32(a, 12) + e + rol32(tj, j % 32), 7);
                int ss2 = ss1 ^ rol32(a, 12);
                int tt = ff + d + ss2 + w1[j];
                int dd = gg + h + ss1 + w[j];
                d = c;
                c = rol32(b, 9);
                b = a;
                a = tt;
                h = g;
                g = rol32(f, 19);
                f = e;
                e = dd ^ rol32(dd, 9) ^ rol32(dd, 17);
            }
            iv[0] ^= a;
            iv[1] ^= b;
            iv[2] ^= c;
            iv[3] ^= d;
            iv[4] ^= e;
            iv[5] ^= f;
            iv[6] ^= g;
            iv[7] ^= h;
        }
        byte[] out = new byte[32];
        for (int i = 0; i < 8; i++) System.arraycopy(be32(iv[i]), 0, out, i * 4, 4);
        return out;
    }

    // ============================ proto varint（tsukiyo proto 1:1） ============================

    static byte[] proto(LinkedHashMap<Integer, Object> fields) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (Map.Entry<Integer, Object> en : fields.entrySet()) {
            int tag = en.getKey();
            Object value = en.getValue();
            if (value instanceof Number) {
                varint(out, (long) tag << 3);
                varint(out, ((Number) value).longValue());
            } else {
                byte[] bytes = value instanceof byte[] ? (byte[]) value : value.toString().getBytes(StandardCharsets.UTF_8);
                varint(out, ((long) tag << 3) | 2);
                varint(out, bytes.length);
                out.write(bytes, 0, bytes.length);
            }
        }
        return out.toByteArray();
    }

    static void varint(ByteArrayOutputStream out, long n) {
        while ((n >>> 7) != 0) {
            out.write((int) ((n & 127) | 128));
            n >>>= 7;
        }
        out.write((int) n);
    }

    // ============================ 签名（tsukiyo CommentSignature 1:1，danmu_api hongguo 同构） ============================

    static final String ARGUS_SECRET_HEX = "ac1adaae95a7af94a5114ab3b3a97dd80050aa0a39314c40528caec95256c28c";

    /** X-Gorgon + X-Khronos + X-SS-Req-Ticket + X-SS-STUB + X-Argus + X-Ladon（nonce 11 字节驱动）。 */
    static Map<String, String> signHeaders(String query, long now, byte[] nonce) {
        if (nonce.length != 11) throw new IllegalArgumentException("nonce must be 11 bytes");
        long ts = now / 1000;
        int first = (((nonce[0] & 255) % 7) + 1) << 5;
        int second = 0xe0 | (nonce[1] & 15);
        ByteBuffer nb = ByteBuffer.wrap(nonce, 6, 4).order(ByteOrder.LITTLE_ENDIAN);
        long argusRandom = nb.getInt() & 0xffffffffL;
        int signCount = 2 + (nonce[10] & 255) % 49 * 2;
        byte[] ladonSalt = Arrays.copyOfRange(nonce, 2, 6);
        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("X-Gorgon", gorgonOf(gorgonSeed(query, "", "", ts), first, second, 0));
        headers.put("X-Khronos", String.valueOf(ts));
        headers.put("X-SS-Req-Ticket", String.valueOf(now));
        headers.put("X-SS-STUB", "");
        headers.put("X-Argus", argusOf(query, "", ts, argusRandom, signCount));
        headers.put("X-Ladon", ladonOf(ts, 8662, ladonSalt));
        return headers;
    }

    /** gorgon 种子 20 字节：md5(query)[0:4] + bodyMd5[0:4] + cookieMd5[0:4] + 00010704 + BE32(ts)（danmu_api buildGorgonSeed）。 */
    static byte[] gorgonSeed(String query, String stub, String cookie, long ts) {
        byte[] body = stub.matches("(?i)[0-9a-f]{32}") ? hex(stub.substring(0, 8)) : new byte[4];
        byte[] ck = cookie.isEmpty() ? new byte[4] : Arrays.copyOf(md5(cookie.getBytes(StandardCharsets.UTF_8)), 4);
        return concat(Arrays.copyOf(md5(query.getBytes(StandardCharsets.UTF_8)), 4), body, ck,
                hex("00010704"), be32((int) ts));
    }

    static String gorgonOf(byte[] seed, int first, int second, int parameter) {
        byte[] input = Arrays.copyOf(seed, seed.length);
        int[] key = {0x4a, parameter & 255, 0x16, second, 0x47, 0x6c, parameter >>> 8, first};
        int[] box = new int[256];
        for (int i = 0; i < 256; i++) box[i] = i;
        int j = 0;
        for (int i = 0; i < 256; i++) {
            j = (j + box[i] + key[i % 8]) & 255;
            box[i] = box[j];
        }
        j = 0;
        for (int n = 0; n < input.length; n++) {
            int i = (n + 1) & 255;
            j = (j + box[i]) & 255;
            box[i] = box[j];
            input[n] = (byte) (u(input[n]) ^ box[(box[i] + box[j]) & 255]);
        }
        int lengthMask = (~input.length) & 255;
        for (int i = 0; i < input.length; i++) {
            int v = u(input[i]);
            int swapped = ((v << 4) | (v >>> 4)) & 255;
            int next = u(input[(i + 1) % input.length]);
            input[i] = (byte) (Integer.reverse(swapped ^ next) >>> 24 ^ lengthMask);
        }
        byte[] head = {(byte) 0x84, 4, (byte) first, (byte) second, (byte) parameter, (byte) (parameter >>> 8)};
        return hexOf(concat(head, input));
    }

    static String ladonOf(long ts, long aid, byte[] salt) {
        byte[] ascii = hexOf(md5(concat(salt, String.valueOf(aid).getBytes(StandardCharsets.UTF_8))))
                .getBytes(StandardCharsets.US_ASCII);
        List<Long> queue = new ArrayList<>();
        queue.add(word64le(ascii, 16));
        queue.add(word64le(ascii, 24));
        long left = word64le(ascii, 0);
        long right = word64le(ascii, 8);
        long[] keys = new long[34];
        for (int i = 0; i < keys.length; i++) {
            keys[i] = left;
            long next = (Long.rotateRight(right, 8) + left) ^ i;
            queue.add(next);
            left = next ^ Long.rotateLeft(left, 3);
            right = queue.remove(0);
        }
        byte[] data = pkcs7((ts + "-1611921764-3019").getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        result.write(salt, 0, salt.length);
        for (int at = 0; at < data.length; at += 16) {
            long a = word64le(data, at);
            long b = word64le(data, at + 8);
            for (long k : keys) {
                b = k ^ (a + Long.rotateRight(b, 8));
                a = b ^ Long.rotateLeft(a, 3);
            }
            result.write(le64(a), 0, 8);
            result.write(le64(b), 0, 8);
        }
        return java.util.Base64.getEncoder().encodeToString(result.toByteArray());
    }

    static String argusOf(String query, String stub, long ts, long argusRandom, int signCount) {
        byte[] bodyInput = stub.matches("(?i)[0-9a-f]{32}") ? hex(stub) : new byte[16];
        byte[] nested = proto(new LinkedHashMap<Integer, Object>() {{
            put(1, (long) signCount);
            put(2, 1388734L);
            put(3, 1388734L);
            put(4, 1388734L);
        }});
        byte[] message = proto(new LinkedHashMap<Integer, Object>() {{
            put(1, 0x40401252L);
            put(2, 2L);
            put(3, argusRandom);
            put(4, "3019");
            put(6, "1611921764");
            put(7, "6.8.1.32");
            put(8, "v04.07.01-ml-android");
            put(9, 135135744L);
            put(10, new byte[8]);
            put(12, ts * 2);
            put(13, Arrays.copyOfRange(sm3(bodyInput), 0, 6));
            put(14, Arrays.copyOfRange(sm3(query.getBytes(StandardCharsets.UTF_8)), 0, 6));
            put(15, nested);
            put(20, "none");
            put(21, 738L);
        }});
        byte[] secret = hex(ARGUS_SECRET_HEX);
        byte[] derived = sm3(concat(secret, hex("3ccc567b"), secret));
        long[] keys = new long[72];
        for (int i = 0; i <= 3; i++) keys[i] = word64le(derived, i * 8);
        for (int i = 4; i <= 71; i++) {
            // danmu_api simonRoundKeys：mixed = ror(k[i-1],3)^k[i-3]；mixed ^= ror(mixed,1)（右旋，tsukiyo 为左旋是错的）
            long x = Long.rotateRight(keys[i - 1], 3) ^ keys[i - 3];
            x ^= Long.rotateRight(x, 1);
            keys[i] = ~keys[i - 4] ^ x
                    ^ ((0x3dc94c3a046d678bL >>> ((i - 4) % 62)) & 1) ^ 3;
        }
        byte[] blocks = pkcs7(message);
        ByteArrayOutputStream encrypted = new ByteArrayOutputStream();
        for (int at = 0; at < blocks.length; at += 16) {
            long a = word64le(blocks, at);
            long b = word64le(blocks, at + 8);
            for (long k : keys) {
                long next = a ^ (Long.rotateLeft(b, 1) & Long.rotateLeft(b, 8)) ^ Long.rotateLeft(b, 2) ^ k;
                a = b;
                b = next;
            }
            encrypted.write(le64(a), 0, 8);
            encrypted.write(le64(b), 0, 8);
        }
        byte[] mask = hex("d04ffdffd04ffdff");
        byte[] enc = encrypted.toByteArray();
        byte[] scrambled = new byte[enc.length];
        for (int i = 0; i < enc.length; i++) scrambled[i] = (byte) (u(enc[i]) ^ u(mask[i % 8]));
        byte[] maskScrambled = concat(mask, scrambled);
        byte[] reversed = new byte[maskScrambled.length];
        for (int i = 0; i < maskScrambled.length; i++) reversed[i] = maskScrambled[maskScrambled.length - 1 - i];
        byte[] container = concat(hex("a6e783ee7001100918"), reversed, hex("567b"));
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE,
                    new SecretKeySpec(md5(Arrays.copyOfRange(secret, 0, 16)), "AES"),
                    new IvParameterSpec(md5(Arrays.copyOfRange(secret, 16, 32))));
            byte[] out = cipher.doFinal(container);
            return java.util.Base64.getEncoder().encodeToString(concat(hex("3ccc"), out));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ============================ 传输（tsukiyo CommentTransport 1:1） ============================

    static JSONObject commentList(String episode, String bookId, long startMs, long durationMs, String cursor, int aid) throws Exception {
        JSONObject business = new JSONObject();
        business.put("book_id", bookId);
        business.put("start_offset_time", startMs);
        business.put("playlet_item_duration", durationMs);
        business.put("need_danmaku_guide_type", new JSONArray(Arrays.asList(1, 3, 4, 2)));
        JSONObject payload = new JSONObject();
        payload.put("comment_source", 601);
        payload.put("server_channel", 1000);
        payload.put("group_id", episode);
        payload.put("group_type", 30);
        payload.put("comment_type", 20);
        payload.put("sort", 1);
        payload.put("count", 90);
        payload.put("cursor", cursor);
        payload.put("aid", aid);
        payload.put("compliance_status", 0);
        payload.put("business_param", business);

        long now = System.currentTimeMillis();
        Map<String, String> query = new TreeMap<>();
        query.put("aid", String.valueOf(aid));
        query.put("app_name", "novelread");
        query.put("version_code", "73532");
        query.put("version_name", "7.3.5.32");
        query.put("manifest_version_code", "73532");
        query.put("update_version_code", "73532");
        query.put("channel", "update_64");
        query.put("device_platform", "android");
        query.put("os", "android");
        query.put("ssmix", "a");
        query.put("device_type", "25053RT47C");
        query.put("device_brand", "Redmi");
        query.put("language", "zh");
        query.put("os_api", "36");
        query.put("os_version", "16");
        query.put("resolution", "1280*2772");
        query.put("dpi", "520");
        query.put("ac", "wifi");
        query.put("device_id", "7397450988462912345");
        query.put("iid", "7397450988462912346");
        query.put("_rticket", String.valueOf(now));
        StringBuilder q = new StringBuilder();
        for (Map.Entry<String, String> en : query.entrySet()) {
            if (q.length() > 0) q.append('&');
            q.append(en.getKey()).append('=').append(URLEncoder.encode(en.getValue(), "UTF-8"));
        }
        String encoded = q.toString();

        SecureRandom rnd = new SecureRandom();
        byte[] nonce = new byte[11];
        rnd.nextBytes(nonce);
        Map<String, String> sign = signHeaders(encoded, now, nonce);

        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(
                    "https://api5-normal-sinfonlineb.fqnovel.com/novel/commentapi/comment/list/"
                            + episode + "/v1/?" + encoded).openConnection();
            conn.setConnectTimeout(20000);
            conn.setReadTimeout(20000);
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("User-Agent",
                    "com.phoenix.read/73532 (Linux; U; Android 16; zh_CN; 25053RT47C; "
                            + "Build/BP2A.250605.031.A3; Cronet/TTNetVersion:04657795 2026-01-23 "
                            + "QuicVersion:c67e9834 2025-09-08)");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("X-XS-From-Web", "0");
            conn.setRequestProperty("Sdk-Version", "2");
            conn.setRequestProperty("Comment-Source", "601");
            conn.setRequestProperty("Server-Channel", "1000");
            conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            for (Map.Entry<String, String> en : sign.entrySet()) conn.setRequestProperty(en.getKey(), en.getValue());
            byte[] body = payload.toString().getBytes(StandardCharsets.UTF_8);
            conn.setFixedLengthStreamingMode(body.length);
            try (OutputStream os = conn.getOutputStream()) {
                os.write(body);
            }
            int code = conn.getResponseCode();
            InputStream in = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            byte[] buf = new byte[8192];
            int n;
            while (in != null && (n = in.read(buf)) > 0) bout.write(buf, 0, n);
            if (in != null) in.close();
            String resp = new String(bout.toByteArray(), StandardCharsets.UTF_8);
            System.out.println("[http] window start=" + startMs + " cursor=" + (cursor.isEmpty() ? "-" : cursor)
                    + " http=" + code + " len=" + resp.length());
            if (resp.length() < 2000) System.out.println("[body] " + resp);
            return new JSONObject(resp);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    // ============================ 窗口循环 + 解析（TimedComments.parse 同构） ============================

    static final int WINDOW_MS = 30000;
    static final int COUNT = 90;

    static class Item {
        final String id, text;
        final long timeMs;

        Item(String id, String text, long timeMs) {
            this.id = id;
            this.text = text;
            this.timeMs = timeMs;
        }
    }

    static List<Item> fetchAll(String vid, String series, long durationMs, int aid) throws Exception {
        List<Item> comments = new ArrayList<>();
        List<String> markers = new ArrayList<>();
        List<String> seenIds = new ArrayList<>();
        long startMs = 0;
        String cursor = "";
        int maxRequests = durationMs > 0 ? (int) Math.ceil(durationMs / (double) WINDOW_MS) + 5 : 40;
        for (int i = 0; i < maxRequests; i++) {
            String marker = startMs + ":" + cursor;
            if (markers.contains(marker)) break;
            markers.add(marker);
            JSONObject resp = commentList(vid, series, startMs, durationMs, cursor, aid);
            int code = resp.optInt("code", -1);
            if (code != 0) {
                System.out.println("[FAIL] code=" + code + " msg=" + resp.optString("message", resp.optString("msg", "")));
                break;
            }
            JSONObject data = resp.optJSONObject("data");
            if (data == null) {
                System.out.println("[FAIL] no data node");
                break;
            }
            JSONObject extra = data.optJSONObject("extra");
            long next = extra == null ? startMs + WINDOW_MS : extra.optLong("next_query_danmaku_list_time", startMs + WINDOW_MS);
            if (next <= startMs) next = startMs + WINDOW_MS;
            JSONObject listInfo = data.optJSONObject("common_list_info");
            String nextCursor = listInfo == null ? "" : listInfo.optString("cursor", "");
            boolean hasMore = listInfo != null && listInfo.optBoolean("has_more", false);
            JSONArray rows = data.optJSONArray("data_list");
            int count = 0;
            if (rows != null) {
                for (int r = 0; r < rows.length(); r++) {
                    JSONObject comment = rows.optJSONObject(r) == null ? null : rows.optJSONObject(r).optJSONObject("comment");
                    if (comment == null) continue;
                    JSONObject common = comment.optJSONObject("common");
                    JSONObject expand = comment.optJSONObject("expand");
                    if (common == null || expand == null) continue;
                    if (!vid.equals(common.optString("group_id")) || common.optInt("status", -1) != 1) continue;
                    long time = expand.optLong("offset_time", -1);
                    String id = comment.optString("comment_id");
                    if (id.length() > 120) id = id.substring(0, 120);
                    String text = "";
                    JSONObject content = common.optJSONObject("content");
                    if (content != null) text = content.optString("text");
                    text = text.replaceAll("[\\p{Cc}\\u2028\\u2029]", " ").trim();
                    if (text.length() > 180) text = text.substring(0, 180);
                    if (id.isEmpty() || text.isEmpty() || seenIds.contains(id)) continue;
                    seenIds.add(id);
                    comments.add(new Item(id, text, time));
                    count++;
                }
            }
            System.out.println("[win] start=" + startMs + " next=" + next + " hasMore=" + hasMore
                    + " rows=" + (rows == null ? 0 : rows.length()) + " accepted=" + count
                    + " sample=" + (comments.isEmpty() ? "-" : comments.get(comments.size() - 1).text));
            if (durationMs > 0 && next >= durationMs) break;
            if (!hasMore && durationMs <= 0) break;
            startMs = next;
            cursor = nextCursor;
        }
        return comments;
    }

    static String toXml(List<Item> items) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<i><chatserver>chat.bilibili.com</chatserver>")
                .append("<d p=\"0,1,25,16777215\">开始</d>");
        for (Item it : items) {
            String text = it.text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")
                    .replace("\"", "&quot;").replace("'", "&apos;");
            sb.append("<d p=\"").append(String.format(java.util.Locale.US, "%.2f", it.timeMs / 1000.0))
                    .append(",1,25,16777215\">").append(text).append("</d>");
        }
        sb.append("</i>");
        return sb.toString();
    }

    // ============================ main ============================

    /** 金标模式：固定输入对齐 danmu_api hongguo（sig_golden.mjs 产出），逐字节比对。 */
    static void golden() {
        String query = "_rticket=1730000000000&ac=wifi&aid=8662&app_name=novelread&channel=update_64"
                + "&device_brand=Redmi&device_id=7397450988462912345&device_platform=android&device_type=25053RT47C"
                + "&dpi=520&iid=7397450988462912346&language=zh&manifest_version_code=73532&os=android&os_api=36"
                + "&os_version=16&resolution=1280*2772&ssmix=a&update_version_code=73532&version_code=73532&version_name=7.3.5.32";
        long ts = 1730000000L;
        byte[] salt = {(byte) 0xaa, (byte) 0xbb, (byte) 0xcc, (byte) 0xdd};
        String gArgus = argusOf(query, "", ts, 0x11223344L, 26);
        String gLadon = ladonOf(ts, 8662, salt);
        String gGorgon = gorgonOf(gorgonSeed(query, "", "", ts), 0x40, 0xe5, 0);
        check("seed", hexOf(gorgonSeed(query, "", "", ts)),
                "78283ca4000000000000000000010704671db480");
        check("gorgon", gGorgon,
                "840440e50000eddb133f69830c95ef10c0595eb2efcf6992c920");
        check("ladon", gLadon,
                "qrvM3UoFA/WhQyDt8gQwMHxgNwpwoGPLuPtIXDo4LLDQcaS3");
        check("argus", gArgus,
                "PMxhgUKIXtho/6stSub0VASKJDoVY13IeJ5USEZ0fLHWQcRdQeFEof3pnHwudtXAwZqut+b1RAn8Tix1HZwPQSHYGpW+Ru06XLuz4cr1Plm9z1NO2bWmXAurTuaDgmn2t9gpHfcR5ePk3St7CoyH0uDVTNA3bGGjHAk8U62sdIYGDKP4Lk0vECRaYDFObWaOhSmSH2EcY/HNIATUjE6OW0Cw1ELQnPUguV5L5Hcy2Afejw==");
    }

    static int failures = 0;

    static void check(String name, String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("[PASS] " + name);
        } else {
            System.out.println("[FAIL] " + name);
            System.out.println("  golden=" + expected);
            System.out.println("  actual=" + actual);
            failures++;
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length > 0 && "golden".equals(args[0])) {
            golden();
            return;
        }
        if (args.length < 2) {
            System.out.println("usage: DanmuProbe golden | <vid> <seriesId> [durationSec] [aid]");
            System.exit(2);
        }
        String vid = args[0];
        String series = args[1];
        long durationSec = args.length > 2 ? Long.parseLong(args[2]) : 0;
        int aid = args.length > 3 ? Integer.parseInt(args[3]) : 8662;
        System.out.println("[probe] vid=" + vid + " series=" + series + " duration=" + durationSec + "s aid=" + aid);
        List<Item> items = fetchAll(vid, series, durationSec * 1000, aid);
        items.sort((a, b) -> Long.compare(a.timeMs, b.timeMs));
        System.out.println("[result] total=" + items.size());
        String xml = toXml(items);
        System.out.println("[xml] length=" + xml.length());
        System.out.println("[xml head] " + xml.substring(0, Math.min(600, xml.length())));
    }
}
