package com.github.catvod.spider.music.lx;

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/** lx.utils.crypto / lx.utils.zlib 的 Java 实现 */
final class LxCrypto {

    private LxCrypto() {
    }

    /** 对齐 lx-music-mobile preload：md5(encodeURIComponent(str)) */
    static String md5(String raw) throws Exception {
        String s = raw == null ? "" : encodeURIComponent(raw);
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] d = md.digest(s.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte b : d) sb.append(String.format("%02x", b));
        return sb.toString();
    }

    static String encodeURIComponent(String s) throws Exception {
        return java.net.URLEncoder.encode(s, "UTF-8")
                .replace("+", "%20")
                .replace("%21", "!").replace("%27", "'").replace("%28", "(")
                .replace("%29", ")").replace("%7E", "~").replace("*", "%2A");
    }

    /** args: (data, mode, key, iv) → byte[]（ArrayBuffer）。mode 如 aes-128-cbc / aes-256-ecb */
    static byte[] aes(JsRuntime rt, Object[] args, boolean encrypt) throws Exception {
        Object data = args.length > 0 ? args[0] : null;
        String mode = args.length > 1 && args[1] != null ? String.valueOf(args[1]) : "aes-128-cbc";
        String key = args.length > 2 && args[2] != null ? String.valueOf(args[2]) : "";
        String iv = args.length > 3 && args[3] != null ? String.valueOf(args[3]) : "";

        String[] parts = mode.toLowerCase().split("-");
        int bits = 128;
        boolean cbc = true;
        boolean pad = true;
        for (String p : parts) {
            if ("128".equals(p) || "192".equals(p) || "256".equals(p)) bits = Integer.parseInt(p);
            else if ("cbc".equals(p)) cbc = true;
            else if ("ecb".equals(p)) cbc = false;
            else if (p.startsWith("pkcs")) pad = true;
            else if (p.contains("nopadding")) pad = false;
        }
        String cipherAlg = "AES/" + (cbc ? "CBC" : "ECB") + "/" + (pad ? "PKCS5Padding" : "NoPadding");
        int keyLen = bits / 8;
        byte[] kb = fit(key.getBytes("UTF-8"), keyLen);
        SecretKeySpec ks = new SecretKeySpec(kb, "AES");
        Cipher cipher = Cipher.getInstance(cipherAlg);
        if (cbc) {
            byte[] ib = fit(iv.getBytes("UTF-8"), 16);
            cipher.init(encrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, ks, new IvParameterSpec(ib));
        } else {
            cipher.init(encrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, ks);
        }
        byte[] input = data instanceof byte[] ? (byte[]) data : (data == null ? new byte[0] : String.valueOf(data).getBytes("UTF-8"));
        return cipher.doFinal(input);
    }

    /** args: (data, key) → byte[]。官方为 NoPadding 公钥加密 */
    static byte[] rsa(Object[] args) throws Exception {
        Object data = args.length > 0 ? args[0] : null;
        String key = args.length > 1 && args[1] != null ? String.valueOf(args[1]) : "";
        key = key.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "")
                .replace("-----BEGIN RSA PUBLIC KEY-----", "").replace("-----END RSA PUBLIC KEY-----", "")
                .trim();
        byte[] dk = LxHttp.unb64(key);
        java.security.KeyFactory factory = java.security.KeyFactory.getInstance("RSA");
        java.security.PublicKey pub = factory.generatePublic(new java.security.spec.X509EncodedKeySpec(dk));
        Cipher cipher = Cipher.getInstance("RSA/ECB/NoPadding");
        cipher.init(Cipher.ENCRYPT_MODE, pub);
        byte[] input = data instanceof byte[] ? (byte[]) data : (data == null ? new byte[0] : String.valueOf(data).getBytes("UTF-8"));
        return cipher.doFinal(input);
    }

    static byte[] randomBytes(int n) {
        if (n <= 0) n = 16;
        byte[] b = new byte[n];
        new SecureRandom().nextBytes(b);
        return b;
    }

    static byte[] inflate(byte[] data) throws Exception {
        java.util.zip.Inflater inflater = new java.util.zip.Inflater();
        inflater.setInput(data);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] tmp = new byte[8192];
        while (!inflater.finished()) {
            int n = inflater.inflate(tmp);
            if (n == 0 && inflater.needsInput()) break;
            out.write(tmp, 0, n);
        }
        inflater.end();
        return out.toByteArray();
    }

    static byte[] deflate(byte[] data) throws Exception {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater();
        deflater.setInput(data);
        deflater.finish();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] tmp = new byte[8192];
        while (!deflater.finished()) {
            out.write(tmp, 0, deflater.deflate(tmp));
        }
        deflater.end();
        return out.toByteArray();
    }

    private static byte[] fit(byte[] src, int len) {
        byte[] out = new byte[len];
        System.arraycopy(src, 0, out, 0, Math.min(src.length, len));
        return out;
    }
}
