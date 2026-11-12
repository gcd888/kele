package com.github.catvod.spider;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class ProxyOrigin {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f80short = {1964, 2008, 1986, 1966, 2009, 2018, 1966, 2041, 1971, 1966, 1978, 2012, 1966, 2014, 1960, 2015, 1965, 1963, 1980, 1977, 2025, 2035, 2020, 2047, 2025, 2035, 2022, 2020, 2047, 2035, 2029, 2020, 2047, 2036, 2022, 2017, 2035, 1962, 2912, 2941, 2929, 2921, 3207, 3274, 3270, 3268, 3206, 1812, 1823, 1797, 1801, 1797, 647, 667, 667, 671, 668, 725, 704, 704, 643, 646, 665, 650, 705, 791, 779, 779, 783, 780, 837, 848, 848, 776, 776, 776, 849, 1282, 1316, 1330, 1317, 1402, 1302, 1328, 1330, 1337, 1315, 818, 784, 773, 790, 787, 787, 798, 848, 842, 849, 847, 863, 855, 808, 790, 785, 795, 784, 776, 780, 863, 817, 811, 863, 846, 847, 849, 847, 836, 863, 808, 790, 785, 841, 843, 836, 863, 775, 841, 843, 854, 863, 830, 783, 783, 787, 794, 808, 794, 797, 820, 790, 779, 848, 842, 844, 840, 849, 844, 841, 863, 855, 820, 823, 811, 818, 819, 851, 863, 787, 790, 788, 794, 863, 824, 794, 796, 788, 784, 854, 863, 828, 791, 781, 784, 786, 794, 848, 846, 845, 845, 849, 847, 849, 847, 849, 847, 863, 812, 798, 793, 798, 781, 790, 848, 842, 844, 840, 849, 844, 841, 3319, 3264, 3267, 3264, 3287, 3264, 3287, 1374, 1285, 1294, 1372, 1280, 1293, 1293, 1293, 1288, 1303, 1284, 1342, 1282, 1294, 1303, 1284, 1299, 1351, 1298, 1288, 1301, 1284, 1372, 2975, 3020, 3019, 3029, 2948, 778, 845, 858, 845, 856, 845, 862, 785, 1899, 3128, 3171, 3176, 3130, 3187, 3178, 3171, 3173, 3160, 3182, 3178, 3174, 3168, 3170, 3105, 3191, 3174, 3187, 3183, 3130, 3143, 3095, 3164, 1920, 2011, 2000, 1922, 1999, 1997, 2000, 1991, 1990, 1945, 2004, 2010, 1990, 1922, 1101, 1094, 1105, 1094, 1144, 315, 3288, 3315, 3047, 3004, 2999, 3045, 2984, 2986, 2999, 2976, 2977, 3070, 2995, 3005, 2977, 3045};
    public static final Pattern a = Pattern.compile("/[A-Za-z0-9_-]+\\.(?:jpg|jpeg|png|webp)", 2);
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    public static Object[] a(Request request, long j) {
        String str;
        try {
            Response responseJ = X1.J(request, j);
            try {
                if (responseJ.isSuccessful() && responseJ.body() != null) {
                    if (responseJ.body().contentLength() <= 4194304 && !responseJ.body().source().request(4194305L)) {
                        byte[] bArrBytes = responseJ.body().bytes();
                        if (bArrBytes.length == 0) {
                            responseJ.close();
                            return null;
                        }
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(new ByteArrayInputStream(bArrBytes), null, options);
                        if (options.outWidth > 0 && options.outHeight > 0 && (str = options.outMimeType) != null) {
                            options.inJustDecodeBounds = false;
                            options.inSampleSize = 1;
                            while (true) {
                                int iMax = Math.max(options.outWidth, options.outHeight);
                                int i = options.inSampleSize;
                                if (iMax / i <= 64) {
                                    break;
                                }
                                options.inSampleSize = i * 2;
                            }
                            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(bArrBytes), null, options);
                            if (bitmapDecodeStream == null) {
                                responseJ.close();
                                return null;
                            }
                            bitmapDecodeStream.recycle();
                            Object[] objArr = {200, str, new ByteArrayInputStream(bArrBytes)};
                            responseJ.close();
                            return objArr;
                        }
                        responseJ.close();
                        return null;
                        return null;
                    }
                    responseJ.close();
                    return null;
                }
                responseJ.close();
                return null;
            } catch (Throwable th) {
                if (responseJ != null) {
                    try {
                        responseJ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object[] b(long j, String str, String str2) {
        if (str2 == null || HttpUrl.parse(str2) == null) {
            return null;
        }
        boolean zEquals = "huya".equals(str);
        return a(new Request.Builder().url(str2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").header("Referer", com.github.catvod.spider.merge.D.b.j((zEquals || "douyu".equals(str)) ? "https://www." : "https://live.", str, ".com/")).build(), j);
    }

    public static String buildLiveCoverUrl(String str, String str2) {
        return buildLiveCoverUrl(str, str2, "");
    }

    public static String buildLiveCoverUrl(String str, String str2, String str3) {
        String strX0 = AbstractC0302v0.x0(str);
        if (!com.github.catvod.spider.merge.p018v.b.i(str)) {
            return strX0;
        }
        String strH = com.github.catvod.spider.merge.p018v.b.h(str2);
        String strH2 = com.github.catvod.spider.merge.p018v.b.h(str3);
        String str4 = "";
        if (strH.equals(strX0)) {
            strH = "";
        }
        if (strH2.equals(strX0)) {
            strH2 = "";
        }
        if (strH.isEmpty()) {
            strH = strH2;
            strH2 = "";
        }
        if (strH.isEmpty()) {
            return strX0;
        }
        String url = getUrl();
        if (url.isEmpty()) {
            return strH;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(url);
        sb.append("?do=alllive_cover&site=");
        sb.append(str);
        sb.append("&url=");
        sb.append(com.github.catvod.spider.merge.p018v.b.f(strH));
        if (!strH2.isEmpty() && !strH2.equals(strH)) {
            str4 = "&avatar=" + com.github.catvod.spider.merge.p018v.b.f(strH2);
        }
        sb.append(str4);
        return sb.toString();
    }

    public static String buildTmdbImageUrl(String str, String str2) {
        String str3 = str2;
        if (str == null || str.trim().isEmpty()) {
            return "";
        }
        String strTrim = str.trim();
        if (HttpUrl.parse(strTrim) != null) {
            return strTrim;
        }
        String strM249 = "/";
        if (!strTrim.startsWith(strM249)) {
            strTrim = strM249.concat(strTrim);
        }
        if (!a.matcher(strTrim).matches()) {
            return "";
        }
        String url = getUrl();
        if (url.isEmpty()) {
            return "";
        }
        StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(url, "?do=tmdb_image&path=");
        sbP.append(com.github.catvod.spider.merge.p018v.b.f(strTrim));
        sbP.append("&v=");
        if (str3 == null) {
            str3 = "";
        }
        sbP.append(AbstractC0309x1.a(str3));
        return sbP.toString();
    }

    public static String buildUrl(String str, Map<String, String> map) {
        String url = getUrl();
        if (url.isEmpty() || str == null || str.isEmpty()) {
            return "";
        }
        String strA = AbstractC0309x1.a(str);
        b.put(strA, str);
        if (map != null) {
            c.put(strA, map);
        }
        return com.github.catvod.spider.merge.D.b.C(url, "?do=proxy&key=", strA);
    }

    public static String buildUrl(String str, Map<String, String> map, String str2, int i) {
        String url = getUrl();
        if (url.isEmpty() || str == null || str.isEmpty()) {
            return "";
        }
        String strA = AbstractC0309x1.a(str);
        if (strA.length() >= 8) {
            strA = strA.substring(0, 8);
        }
        String str3 = "java_" + str2 + "_" + i + "t_" + strA;
        b.put(str3, str);
        if (map != null) {
            c.put(str3, map);
        }
        return com.github.catvod.spider.merge.D.b.C(url, "?do=proxy&key=", str3);
    }

    public static int getPort() {
        return Proxy.getPort();
    }

    public static String getUrl() {
        return Proxy.getUrl();
    }
}
