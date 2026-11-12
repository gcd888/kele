import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * 一次性 Java 侧真值程序：逐行复刻 MusicCore.weapi / linuxEparams（固定 secKey 输入），
 * 产出 golden_mv.json 供 JS golden 对拍。算法体与
 * kele/src/main/java/luoxueyinyue/src/com/github/catvod/spider/music/MusicCore.java
 * 的同名方法逐字一致（Base64.NO_WRAP / RSA(NoPadding) 左补零 256 / AES-128-ECB 大写 HEX）。
 */
public class GoldenGen {

    static final String WE_NONCE = "0CoJUm6Qyw8W8jud";
    static final String WE_IV = "0102030405060708";
    static final String WE_PUB_MODULUS =
            "00e0b509f6259df8642dbc35662901477df22677ec152b5ff68ace615bb7b725152b3ab17a876aea8a5aa76d2e417629ec4ee341f56135fccf695280104e0312ecbda92557c93870114af6c9d05c4f7f0c3685b7a46bee255932575cce10b424d813cfe4875d3e82047b97ddef52741d546b8e289dc6935b3ece0462db0a22b8e7";
    static final String WE_PUB_EXP = "010001";

    static byte[] aesCbc(String text, byte[] key, byte[] iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"), new IvParameterSpec(iv));
        return cipher.doFinal(text.getBytes(StandardCharsets.UTF_8));
    }

    static byte[] aesEcb(String text, byte[] key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"));
        return cipher.doFinal(text.getBytes(StandardCharsets.UTF_8));
    }

    static String[] weapi(String json, String secKey) throws Exception {
        byte[] iv = WE_IV.getBytes(StandardCharsets.UTF_8);
        String pass1 = Base64.getEncoder().encodeToString(aesCbc(json, WE_NONCE.getBytes(StandardCharsets.UTF_8), iv));
        String params = Base64.getEncoder().encodeToString(aesCbc(pass1, secKey.getBytes(StandardCharsets.UTF_8), iv));
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
    }

    static byte[] hexBytes(String hex) {
        int len = hex.length();
        byte[] out = new byte[len / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = (byte) Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
        }
        return out;
    }

    static String linuxEparams(String json) throws Exception {
        byte[] enc = aesEcb(json, hexBytes("7246674226682325323F5E6544673A51"));
        StringBuilder sb = new StringBuilder(enc.length * 2);
        for (byte b : enc) sb.append(String.format("%02X", b));
        return sb.toString();
    }

    static String enc(String v) {
        try {
            return java.net.URLEncoder.encode(v, "UTF-8").replace("+", "%20");
        } catch (Exception e) {
            return v;
        }
    }

    public static void main(String[] args) throws Exception {
        String secKey = "abcdefghijklmnop";
        // 向量1：mv 取流载荷形态（{"id","r","csrf_token"}）
        String json1 = "{\"id\":\"543210\",\"r\":1080,\"csrf_token\":\"\"}";
        // 向量2：mv 搜索载荷形态（{"s","type","limit","offset","csrf_token"}）
        String json2 = "{\"s\":\"周杰伦\",\"type\":1004,\"limit\":30,\"offset\":0,\"csrf_token\":\"\"}";
        String[] w1 = weapi(json1, secKey);
        String[] w2 = weapi(json2, secKey);
        System.out.println("{");
        System.out.println("  \"secKey\": \"" + secKey + "\",");
        System.out.println("  \"weapiMvUrl\": {");
        System.out.println("    \"json\": \"" + json1.replace("\"", "\\\"") + "\",");
        System.out.println("    \"params\": \"" + w1[0] + "\",");
        System.out.println("    \"encSecKey\": \"" + w1[1] + "\"");
        System.out.println("  },");
        System.out.println("  \"weapiSearch\": {");
        System.out.println("    \"json\": \"" + json2.replace("\"", "\\\"").replace("周杰伦", "\\u5468\\u6770\\u4f26") + "\",");
        System.out.println("    \"params\": \"" + w2[0] + "\",");
        System.out.println("    \"encSecKey\": \"" + w2[1] + "\"");
        System.out.println("  },");
        System.out.println("  \"linux\": {");
        System.out.println("    \"json\": \"{\\\"method\\\":\\\"POST\\\",\\\"url\\\":\\\"http://music.163.com/api/cloudsearch/pc\\\",\\\"params\\\":{\\\"s\\\":\\\"test\\\",\\\"type\\\":1,\\\"offset\\\":0,\\\"limit\\\":30}}\",");
        System.out.println("    \"eparams\": \"" + linuxEparams("{\"method\":\"POST\",\"url\":\"http://music.163.com/api/cloudsearch/pc\",\"params\":{\"s\":\"test\",\"type\":1,\"offset\":0,\"limit\":30}}") + "\"");
        System.out.println("  },");
        System.out.println("  \"enc\": [");
        System.out.println("    [\"周杰伦\", \"" + enc("周杰伦") + "\"],");
        System.out.println("    [\"a b+c*d.e~f!g'h(i)j\", \"" + enc("a b+c*d.e~f!g'h(i)j") + "\"],");
        System.out.println("    [\"官方版 100%\", \"" + enc("官方版 100%") + "\"]");
        System.out.println("  ]");
        System.out.println("}");
    }
}
