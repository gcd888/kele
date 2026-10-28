package com.github.catvod.spider;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/**
 * 7.4.2.32 video_model/v1 签名存活验证（tsukiyo 纯算法栈）。
 * 用法: java -cp <signOut>;<build/classes>;<android.jar> com.github.catvod.spider.Sign74Test <mode> <vm74-sample.json>
 * mode: A=原样重放(基线) | B1=raw body+新签名 | B2=gzip body+新签名 | C1=改ep2 raw+新签名 | C2=改ep2 gzip+新签名
 */
public class Sign74Test {

    private static byte[] le32(int v) {
        return new byte[]{(byte) v, (byte) (v >> 8), (byte) (v >> 16), (byte) (v >> 24)};
    }

    private static byte[] be32(int v) {
        return new byte[]{(byte) (v >> 24), (byte) (v >> 16), (byte) (v >> 8), (byte) v};
    }

    private static String readAll(String path) throws Exception {
        InputStream in = new java.io.FileInputStream(path);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[8192];
        int n;
        while ((n = in.read(buf)) > 0) out.write(buf, 0, n);
        in.close();
        return new String(out.toByteArray(), "UTF-8");
    }

    private static byte[] gz(byte[] data) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream g = new GZIPOutputStream(out);
        g.write(data);
        g.close();
        return out.toByteArray();
    }

    private static String md5HexUpper(byte[] d) throws Exception {
        byte[] m = java.security.MessageDigest.getInstance("MD5").digest(d);
        StringBuilder sb = new StringBuilder();
        for (byte b : m) sb.append(String.format("%02X", b & 255));
        return sb.toString();
    }

    private static String http(String url, byte[] body, Map<String, String> headers) throws Exception {
        HttpURLConnection c = (HttpURLConnection) new URL(url).openConnection();
        c.setRequestMethod("POST");
        c.setConnectTimeout(20000);
        c.setReadTimeout(30000);
        for (Map.Entry<String, String> e : headers.entrySet()) c.setRequestProperty(e.getKey(), e.getValue());
        if (body != null) {
            c.setDoOutput(true);
            c.getOutputStream().write(body);
            c.getOutputStream().close();
        }
        int code = c.getResponseCode();
        InputStream in = code >= 400 ? c.getErrorStream() : c.getInputStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        if (in != null) {
            byte[] buf = new byte[8192];
            int n;
            while ((n = in.read(buf)) > 0) out.write(buf, 0, n);
            in.close();
        }
        byte[] raw = out.toByteArray();
        if ("gzip".equalsIgnoreCase(c.getHeaderField("Content-Encoding"))) {
            try {
                java.util.zip.GZIPInputStream g = new java.util.zip.GZIPInputStream(new java.io.ByteArrayInputStream(raw));
                ByteArrayOutputStream u = new ByteArrayOutputStream();
                byte[] buf = new byte[8192];
                int n;
                while ((n = g.read(buf)) > 0) u.write(buf, 0, n);
                g.close();
                raw = u.toByteArray();
            } catch (Throwable ignore) {
            }
        }
        String s = new String(raw, "UTF-8");
        System.out.println("HTTP " + code + " len=" + raw.length);
        System.out.println(s.substring(0, Math.min(500, s.length())));
        return s;
    }

    /** 极简 JSON 字符串字段提取（值均为双引号字符串，处理 \/"\\\" 转义）。 */
    private static String jstr(String json, String key) {
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("\"" + key + "\"\\s*:\\s*\"((?:[^\"\\\\]|\\\\.)*)\"").matcher(json);
        if (!m.find()) throw new RuntimeException("field missing: " + key);
        String v = m.group(1);
        StringBuilder sb = new StringBuilder(v.length());
        for (int i = 0; i < v.length(); i++) {
            char ch = v.charAt(i);
            if (ch == '\\' && i + 1 < v.length()) {
                char nx = v.charAt(++i);
                sb.append(nx == 'n' ? '\n' : nx); // \n \/"\\ 等直接还原字符
            } else sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String mode = args.length > 0 ? args[0] : "A";
        String smJson = readAll(args[1]);
        String url = jstr(smJson, "url");
        String query = url.substring(url.indexOf('?') + 1);
        String did = "3436442156544024";
        String newVid = "7697338155669654553"; // ep2（72532 已验证可取流）
        byte[] rawBody = jstr(smJson, "body").getBytes("UTF-8");
        boolean replay = "A".equals(mode) || mode.equals("M1") || mode.equals("M2") || mode.equals("M3");
        byte[] gzBody;
        if (replay) {
            // A/M：用样本原始 gzip 字节（签名绑定的就是这串字节）
            gzBody = java.util.Base64.getDecoder().decode(jstr(smJson, "body_gz_b64"));
        } else {
            gzBody = gz(rawBody);
        }

        byte[] sendBody;
        boolean gzipForm;
        if (replay) {
            sendBody = gzBody; // 原样重放（重压缩的等价 gzip；STUB 服务端不校验）
            gzipForm = true;
        } else if (mode.endsWith("1")) {
            sendBody = rawBody;
            gzipForm = false;
        } else {
            sendBody = gzBody;
            gzipForm = true;
        }
        if (mode.startsWith("C")) {
            String replaced = jstr(smJson, "body").replaceAll("\"video_id\":\"[0-9]+\"", "\"video_id\":\"" + newVid + "\"");
            rawBody = replaced.getBytes("UTF-8");
            gzBody = gz(rawBody);
            sendBody = mode.endsWith("1") ? rawBody : gzBody;
            System.out.println("body vid -> " + newVid);
        }

        Map<String, String> h = new LinkedHashMap<>();
        h.put("Accept", "application/json; charset=utf-8,application/x-protobuf");
        h.put("Accept-Encoding", "gzip");
        if (gzipForm) h.put("Content-Encoding", "gzip");
        h.put("Content-Type", "application/json; charset=utf-8");
        h.put("User-Agent", "com.phoenix.read/74232 (Linux; U; Android 14; zh_CN_#Hans; sdk_gphone64_x86_64; Build/UE1A.230829.050;tt-ok/3.12.13.20)");
        if ("IDX".equals(mode)) {
            // 打印 hashF13 index：样本组合 vs 改 _rticket+新 ts 组合
            byte[] bodyMd5 = java.security.MessageDigest.getInstance("MD5").digest(sendBody);
            int ivS = Guoguoduanju.ivOf(Guoguoduanju.sm3(query.getBytes("UTF-8")), bodyMd5, Integer.parseInt(jstr(smJson, "khronos")));
            String url2 = url.replaceAll("_rticket=\\d+", "_rticket=" + System.currentTimeMillis());
            int ivN = Guoguoduanju.ivOf(Guoguoduanju.sm3(url2.substring(url2.indexOf('?') + 1).getBytes("UTF-8")), bodyMd5, (int) (System.currentTimeMillis() / 1000));
            int ivM = Guoguoduanju.ivOf(Guoguoduanju.sm3(query.getBytes("UTF-8")), bodyMd5, (int) (System.currentTimeMillis() / 1000));
            System.out.println("IDX sample(q,oTs)=" + (ivS & 15) + " -> idx" + ((ivS & 15) / 3)
                    + " | freshQ+freshTs=" + (ivN & 15) + " -> idx" + ((ivN & 15) / 3)
                    + " | oldQ+freshTs=" + (ivM & 15) + " -> idx" + ((ivM & 15) / 3));
            return;
        }
        if (replay) {
            h.put("X-Khronos", jstr(smJson, "khronos"));
            h.put("X-Gorgon", jstr(smJson, "gorgon"));
            h.put("X-Helios", jstr(smJson, "helios"));
            h.put("X-Medusa", jstr(smJson, "medusa"));
            System.out.println("== Test A: replay sample signs");
        } else if (mode.equals("M1") || mode.equals("M2") || mode.equals("M3")) {
            // 逐头排查：原头全保留，只换指定头为新签名；khronos 用样本 ts 保证自洽
            int ts = Integer.parseInt(jstr(smJson, "khronos"));
            String medusa = Guoguoduanju.buildMedusa(url, sendBody, ts, did);
            String helios = Guoguoduanju.helios(ts);
            String gorgon = Guoguoduanju.xGorgon(query, sendBody, ts, (int) (Math.random() * 65536));
            h.put("X-Khronos", jstr(smJson, "khronos"));
            h.put("X-Gorgon", mode.equals("M3") ? gorgon : jstr(smJson, "gorgon"));
            h.put("X-Helios", mode.equals("M2") ? helios : jstr(smJson, "helios"));
            h.put("X-Medusa", mode.equals("M1") ? medusa : jstr(smJson, "medusa"));
            System.out.println("== Test " + mode + ": sample signs + replace "
                    + (mode.equals("M1") ? "X-Medusa" : mode.equals("M2") ? "X-Helios" : "X-Gorgon"));
        } else if (mode.startsWith("N")) {
            // 全自洽：改 vid + 现场 _rticket + 现场 ts + 全新签名（产品实时形态）
            // N=带 ladon/argus；N2=不带（隔离 ladon/argus 是否拒因）
            String replaced = jstr(smJson, "body").replaceAll("\"video_id\":\"[0-9]+\"", "\"video_id\":\"" + newVid + "\"");
            rawBody = replaced.getBytes("UTF-8");
            sendBody = gz(rawBody);
            gzipForm = true;
            url = url.replaceAll("_rticket=\\d+", "_rticket=" + System.currentTimeMillis());
            query = url.substring(url.indexOf('?') + 1);
            int tsN = (int) (System.currentTimeMillis() / 1000);
            h.put("X-Khronos", String.valueOf(tsN));
            if (!mode.equals("N2")) {
                h.put("X-Ladon", java.util.Base64.getEncoder().encodeToString(be32(tsN)));
                h.put("X-Argus", java.util.Base64.getEncoder().encodeToString(le32(tsN)));
            }
            h.put("X-Gorgon", Guoguoduanju.xGorgon(query, sendBody, tsN, (int) (Math.random() * 65536)));
            h.put("X-Helios", Guoguoduanju.helios(tsN));
            h.put("X-Medusa", Guoguoduanju.buildMedusa(url, sendBody, tsN, did));
            System.out.println("== Test " + mode + ": fresh ts + fresh _rticket + ep2 body" + (mode.equals("N2") ? " (no ladon/argus)" : ""));
        } else if (mode.equals("M12") || mode.equals("M13")) {
            // M12: helios+gorgon 新, medusa 样本（测 ≥2 新头 vs medusa 特异）
            // M13: medusa 现签(ts=now) + helios/gorgon/khronos 样本原值（产品兜底形态）
            if (mode.equals("M13")) {
                int tsNow = (int) (System.currentTimeMillis() / 1000);
                h.put("X-Khronos", jstr(smJson, "khronos"));
                h.put("X-Gorgon", jstr(smJson, "gorgon"));
                h.put("X-Helios", jstr(smJson, "helios"));
                h.put("X-Medusa", Guoguoduanju.buildMedusa(url, sendBody, tsNow, did));
                System.out.println("== Test M13: medusa fresh(now-ts) + sample khronos/gorgon/helios");
            } else {
                int ts = Integer.parseInt(jstr(smJson, "khronos"));
                h.put("X-Khronos", String.valueOf(ts));
                h.put("X-Gorgon", Guoguoduanju.xGorgon(query, sendBody, ts, (int) (Math.random() * 65536)));
                h.put("X-Helios", Guoguoduanju.helios(ts));
                h.put("X-Medusa", jstr(smJson, "medusa"));
                System.out.println("== Test M12: helios+gorgon fresh, medusa sample");
            }
        } else if (mode.equals("M10") || mode.equals("M11")) {
            // M10: medusa+helios 新, gorgon 样本；M11: medusa+gorgon 新, helios 样本
            int ts = Integer.parseInt(jstr(smJson, "khronos"));
            h.put("X-Khronos", String.valueOf(ts));
            h.put("X-Gorgon", mode.equals("M10") ? jstr(smJson, "gorgon") : Guoguoduanju.xGorgon(query, sendBody, ts, (int) (Math.random() * 65536)));
            h.put("X-Helios", mode.equals("M11") ? jstr(smJson, "helios") : Guoguoduanju.helios(ts));
            h.put("X-Medusa", Guoguoduanju.buildMedusa(url, sendBody, ts, did));
            System.out.println("== Test " + mode + ": " + (mode.equals("M10") ? "medusa+helios fresh, gorgon sample" : "medusa+gorgon fresh, helios sample"));
        } else if (mode.equals("M8") || mode.equals("M9")) {
            // M8: 重压缩 body + 三头同签；M9: 样本原 gzip body + 三头同签（隔离 body 形态）
            if (mode.equals("M9")) sendBody = java.util.Base64.getDecoder().decode(jstr(smJson, "body_gz_b64"));
            int ts = Integer.parseInt(jstr(smJson, "khronos"));
            h.put("X-Khronos", String.valueOf(ts));
            h.put("X-Gorgon", Guoguoduanju.xGorgon(query, sendBody, ts, (int) (Math.random() * 65536)));
            h.put("X-Helios", Guoguoduanju.helios(ts));
            h.put("X-Medusa", Guoguoduanju.buildMedusa(url, sendBody, ts, did));
            System.out.println("== Test " + mode + ": " + (mode.equals("M8") ? "re-gzip body" : "sample gzip body") + " + all three signs fresh");
        } else if (mode.equals("M4") || mode.equals("M5") || mode.equals("M6") || mode.equals("M7")) {
            // M4: 样本头+改vid body（预期拒：绑body反证）
            // M5: 样本头(除medusa重签)+改vid body → 隔离 vid 维度
            // M6: 样本body+新ts/_rticket全套重签 → 隔离时效维度
            // M7: 样本body+新ts/_rticket全套重签+样本ladon/argus → 定位 ladon/argus 是否拒因
            String replaced = mode.equals("M6") || mode.equals("M7") ? jstr(smJson, "body")
                    : jstr(smJson, "body").replaceAll("\"video_id\":\"[0-9]+\"", "\"video_id\":\"" + newVid + "\"");
            sendBody = mode.equals("M6") || mode.equals("M7") ? gzBody : gz(replaced.getBytes("UTF-8"));
            if (mode.equals("M6") || mode.equals("M7")) {
                url = url.replaceAll("_rticket=\\d+", "_rticket=" + System.currentTimeMillis());
                query = url.substring(url.indexOf('?') + 1);
            }
            if (mode.equals("M4")) {
                h.put("X-Khronos", jstr(smJson, "khronos"));
                h.put("X-Gorgon", jstr(smJson, "gorgon"));
                h.put("X-Helios", jstr(smJson, "helios"));
                h.put("X-Medusa", jstr(smJson, "medusa"));
            } else {
                int tsX = (int) (System.currentTimeMillis() / 1000);
                h.put("X-Khronos", String.valueOf(tsX));
                if (mode.equals("M7")) {
                    h.put("X-Ladon", java.util.Base64.getEncoder().encodeToString(java.util.Base64.getMimeDecoder().decode(jstr(smJson, "ladon"))));
                    h.put("X-Argus", java.util.Base64.getEncoder().encodeToString(java.util.Base64.getMimeDecoder().decode(jstr(smJson, "argus"))));
                }
                h.put("X-Gorgon", Guoguoduanju.xGorgon(query, sendBody, tsX, (int) (Math.random() * 65536)));
                h.put("X-Helios", Guoguoduanju.helios(tsX));
                h.put("X-Medusa", Guoguoduanju.buildMedusa(url, sendBody, tsX, did));
            }
            System.out.println("== Test " + mode + ": "
                    + (mode.equals("M4") ? "sample signs + ep2 body (expect reject)"
                            : mode.equals("M5") ? "sample ts + ep2 body + fresh signs (isolate vid)"
                                    : mode.equals("M6") ? "sample body + fresh ts/_rticket + fresh signs (isolate freshness)"
                                            : "fresh ts + sample ladon/argus (locate reject)"));
        } else {
            int ts = (int) (System.currentTimeMillis() / 1000);
            int random = (int) (Math.random() * 65536);
            h.put("X-Khronos", String.valueOf(ts));
            h.put("X-Ladon", java.util.Base64.getEncoder().encodeToString(be32(ts)));
            h.put("X-Argus", java.util.Base64.getEncoder().encodeToString(le32(ts)));
            h.put("X-Gorgon", Guoguoduanju.xGorgon(query, sendBody, ts, random));
            h.put("X-Helios", Guoguoduanju.helios(ts));
            h.put("X-Medusa", Guoguoduanju.buildMedusa(url, sendBody, ts, did));
            System.out.println("== Test " + mode + ": fresh tsukiyo sign, ts=" + ts + ", body form=" + (gzipForm ? "gzip" : "raw"));
        }
        if (gzipForm) h.put("X-SS-STUB", md5HexUpper(sendBody));
        h.put("X-SS-REQ-TICKET", String.valueOf(System.currentTimeMillis()));
        h.put("x-reading-request", System.currentTimeMillis() + "-" + (int) (Math.random() * 999999999));
        h.put("x-vc-bdturing-sdk-version", "4.0.3.cn");
        h.put("lc", "101");
        h.put("sdk-version", "2");
        h.put("passport-sdk-version", "5051452");
        h.put("x-tt-store-region", "cn-gd");
        h.put("x-tt-store-region-src", "did");
        h.put("x-xs-from-web", "0");

        String r = http(url, sendBody, h);
        boolean hasList = r.contains("video_list");
        boolean isEp2 = r.contains(newVid);
        String verdict = replay ? (hasList || r.contains("\"code\":0") ? "PASS" : "FAIL")
                : (hasList ? (mode.startsWith("C") ? (isEp2 ? "PASS(ep2 data)" : "PASS(video_list)") : "PASS") : "FAIL");
        System.out.println("RESULT-" + mode + " " + verdict);
    }
}
