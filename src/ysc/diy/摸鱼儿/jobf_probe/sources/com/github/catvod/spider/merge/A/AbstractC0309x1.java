package com.github.catvod.spider.merge.A;

import android.net.Uri;
import android.util.Base64;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0309x1 {
    public static final Pattern a = Pattern.compile("http((?!http).){12,}?\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)\\?.*|http((?!http).){12,}\\.(m3u8|mp4|mkv|flv|mp3|m4a|aac)|http((?!http).)*?video/tos*");
    public static final Pattern b = Pattern.compile("(magnet|thunder|ed2k):.*");
    public static final List c = Arrays.asList("mp4", "mkv", "wmv", "flv", "avi", "iso", "mpg", "ts", "mp3", "aac", "flac", "m4a", "ape", "ogg");
    public static final List d = Arrays.asList("srt", "ass", "ssa", "vtt");

    public static String a(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, "0");
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(String str) {
        return new String(Base64.decode(str, 2), Charset.defaultCharset());
    }

    public static String c(byte[] bArr) {
        return new String(Base64.encode(bArr, 2), Charset.defaultCharset());
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String e(String str, String str2) {
        if (str2.startsWith("//")) {
            return Uri.parse(str).getScheme() + ":" + str2;
        }
        if (str2.contains("://")) {
            return str2;
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() + "://" + uri.getHost() + str2;
    }

    public static String f(String str) {
        String str2;
        try {
            Matcher matcher = Pattern.compile(".*(1080|720|2160|4k|4K).*").matcher(str);
            if (matcher.find()) {
                str2 = matcher.group(1) + " " + str;
            } else {
                str2 = str;
            }
            Matcher matcher2 = Pattern.compile("^([0-9]+)").matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(1) + " " + str2;
            }
            return str2.replaceAll("\\D+", "") + " " + str2.replaceAll("\\d+", "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String g(String str) {
        return str.contains(".") ? str.substring(str.lastIndexOf(".") + 1) : str;
    }

    public static String h(double d2) {
        if (d2 <= 0.0d) {
            return "";
        }
        if (d2 > 1.099511627776E12d) {
            return String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d2 / 1.099511627776E12d), "TB");
        }
        if (d2 > 1.073741824E9d) {
            return String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d2 / 1.073741824E9d), "GB");
        }
        return d2 > 1048576.0d ? String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d2 / 1048576.0d), "MB") : String.format(Locale.getDefault(), "%.2f%s", Double.valueOf(d2 / 1024.0d), "KB");
    }

    public static boolean i(String str) {
        return c.contains(g(str).toLowerCase());
    }

    public static boolean j(String str) {
        if (str.contains("url=http") || str.contains(".js") || str.contains(".css") || str.contains(".html")) {
            return false;
        }
        return a.matcher(str).find();
    }

    public static boolean k(String str) {
        Iterator it = Arrays.asList("iqiyi.com", "v.qq.com", "youku.com", "le.com", "tudou.com", "mgtv.com", "sohu.com", "acfun.cn", "bilibili.com", "baofeng.com", "pptv.com").iterator();
        while (it.hasNext()) {
            if (str.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String l(String str) {
        return str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str;
    }

    public static String m(String str) {
        try {
            return d(MessageDigest.getInstance("SHA-1").digest(str.getBytes(Charset.defaultCharset())));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String n(String str) {
        try {
            return d(MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String o(String str) {
        return (str == null || str.length() <= 1) ? str : com.github.catvod.spider.merge.D.b.g(str, 1, 0);
    }
}
