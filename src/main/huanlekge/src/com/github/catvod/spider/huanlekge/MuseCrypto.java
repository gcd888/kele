package com.github.catvod.spider.huanlekge;

import android.util.Base64;

import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 欢唱K歌加密模块：
 * - RSA/ECB/PKCS1Padding 加密请求载荷（device-id/get、login aes_key、getSongFileUrl payload）
 * - RSA/ECB/PKCS1Padding 解密响应 encrypted_key → 16 字节媒体解密密钥 KEY16
 * - AES/GCM/NoPadding 加密 login 请求体
 */
public final class MuseCrypto {

    /** RSA 公钥（X509EncodedKeySpec），来自 ug1.java:166。 */
    private static final String PUB_KEY_B64 =
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAucL0oFErd7REM6TSNa3EZdN1YaOs4J1eCybLPyoQ9ru3q1HU67agC9FzhrCG/RvAQUya5iPmQ8Caed05vqcCVcyJChmkSOGQ7DVShe2rGuTMNlpoRV6UzfcraaVS++7m2K/+kSZJ8OAhhhVuqPruMjsFYpdtstAwvyZT28b+eENwzpp9UHqsooZc7FZ0H8kTbs6XMkw4nIWo+4HoPAhNLEY+xdHvwY6drF/3WDTvsaoMrs73TVQCEEHzZNIz2H/is9VLMnIyOfnfcJi9br78Fj2xHzxu3sAySBOTVLmUMxqYh/g1ox5OXGcW93HJkQLkBi42tFAEkWYlYyl93+jbbQIDAQAB";

    /** RSA 私钥（PKCS8EncodedKeySpec），来自 ug1.java，用于解 encrypted_key。 */
    private static final String PRIV_KEY_B64 =
            "MIIEowIBAAKCAQEAv9MSfzJzk56tWGfp+Ir1I41uMA0TN/kulaPgLpXLnHGVr59r+4nDD2kpCj2eMvLl9J3m+RiFSURzPcBJTUMjhIIo0ZxGrk73THxqejFU4APEFLKC2b7yfA2BferkiAcHG1qv2qpePNP9EV/8Mw6fuHcmbkPNneJtdlVSsYakjtSjti6pIIPBNabV7GFLVy7CKsTmEgYxlSdgxJ2e3HuV+RdeiCbyqXiCvXVfzq4eMc9q4HzcvvCf2ivlHqjed9ILljUgxKN+dhw912rx+quQIFL8uyrHdWR0tKBUvrXMH6KZRkKRyxTdTttCMDYU9SwMluke1Zk8zZP5LZGTIyIPVQIDAQABAoIBAAa5JifRI93jrN2xXrD4ZdkmJtuGScsnb6uM/9mCJI3KKV3rb4R0cqLCo86ZFEdi3g5xzluisWE9BfD/IVKU7NTDHx0hphSL7fz/S1gXDIuBdkjnbNCm8abJbmV0aygdXvFlf05htEXbhD4sqBE+DPkRLAanV7iV7BI+sVRJjND4sVHavGdj7U20x2W8cltLGbpVtIRfr897gRX1WK98TdwS9rPMelvE4+62YI4Cho4PMgAajoDUch7J42+43KW+VsXZq9p2DkexPEORbrypZk4YV0HGoUz1uQJ6CBDAjT+wjJvO7IUdU0wdo0OFN6iXc4ixd1yHU0c5e1wcET4kDq0CgYEA+mElcnHylEC1wrz2VnJUChNsy6+jb83eYiDWC5EQobsTVt8XcLmQJDtLPj5kekLPjb2h1OkLv1BPDPZPm7gZ6FT7ns23/opUt42pCF1phO1LOsAEp98FVa7COliJMuYtck8GedJCRW+CdiU2J3qCyQ/rdWA+kt9iWE6b1TSVkKcCgYEAxCFttmOi0ZviWh8NVBnafmxU/70xz1tBWk+yxiJny4Vc/eEZhUDK3kYrjNi4lNKbjWqRLulKv2luCcvP6dsjLu+YDNDs+jWc9KUuGKK0LAWZKQ8cazIs+OKIj46PyeasSV0m4bEQ9Y1wRUha2cYZs9o+aHvaaB0kE+68+YjDA6MCgYB6mfU3PBq3g5Q9HkBVhjgmkup0NrYF+j3JuSB2m3sUZsGKiUU2Gnc9dpdajDyxLWPqmQ/UbKUm8hEzXK0QqC5veKWZVkyhZGUlWEWL5gnUYEm1I+9jsC4xjZhn75CHDvT0A0Q9hLqUu4ybg48n97Jw982pNQ6O5rmGWj+uP8h5AwKBgAtM4cVgeEEbei83Gs19r9kY5MzXWcdYuqs5bFN+J/zR8kmubon+8bFc2aWD1x68A7piKXtKdcQRjwWBeLlApwZNR7V1VDIWZLSzz7Qbq8XdjLWQ6VJD0dOFOdkLnb1ETSjs9RCL4y5Ct/VF9fYWM+To7i+W8z6Mb0e2uaym9JWBAoGBAJFGwm699KrWTIMCCR6ZNHjEQBA0HJfsGVW9RW7VsocmoXazN/+raZ9q9IoDrg8kPpMrH9cyxDWtUTO8r5bEUiusHl3VeZp+LILARXcfOHxGGopc7KhzgdS3bG7ApBb39cdBuhiEMgPcWavCWbsmGOlU5UefUXtY5BhzW1yZv58r";

    private static final String RSA_TRANSFORMATION = "RSA/ECB/PKCS1Padding";
    private static final String AES_TRANSFORMATION = "AES/GCM/NoPadding";

    private MuseCrypto() {
    }

    /** RSA 公钥加密，返回 Base64 字符串。 */
    public static String rsaEncryptB64(String plain) throws Exception {
        return Base64.encodeToString(rsaEncrypt(plain.getBytes(StandardCharsets.UTF_8)), Base64.NO_WRAP);
    }

    public static byte[] rsaEncrypt(byte[] plain) throws Exception {
        Cipher cipher = Cipher.getInstance(RSA_TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, loadPublicKey());
        return cipher.doFinal(plain);
    }

    /** RSA 私钥解密 Base64 密文。 */
    public static byte[] rsaDecryptB64(String b64) throws Exception {
        return rsaDecrypt(Base64.decode(b64, Base64.DEFAULT));
    }

    public static byte[] rsaDecrypt(byte[] cipher) throws Exception {
        Cipher c = Cipher.getInstance(RSA_TRANSFORMATION);
        c.init(Cipher.DECRYPT_MODE, loadPrivateKey());
        return c.doFinal(cipher);
    }

    /** AES-GCM 加密：返回 iv(12) + ciphertext+tag。 */
    public static byte[] aesGcmEncrypt(byte[] key, byte[] iv, byte[] plain) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"), new GCMParameterSpec(128, iv));
        return cipher.doFinal(plain);
    }

    private static java.security.PublicKey loadPublicKey() throws Exception {
        byte[] der = Base64.decode(PUB_KEY_B64, Base64.DEFAULT);
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(der));
    }

    private static java.security.PrivateKey loadPrivateKey() throws Exception {
        byte[] der = Base64.decode(PRIV_KEY_B64, Base64.DEFAULT);
        return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(der));
    }
}
