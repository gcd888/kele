package com.github.catvod.spider;

import android.os.Looper;
import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.AiTingMusic;
import com.github.catvod.spider.Ali;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.FishDrive;
import com.github.catvod.spider.FishHxq;
import com.github.catvod.spider.Local;
import com.github.catvod.spider.ProxyOrigin;
import com.github.catvod.spider.Quark;
import com.github.catvod.spider.UC;
import com.github.catvod.spider.Wallpaper;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0286p1;
import com.github.catvod.spider.merge.A.H0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p010l.a;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.A;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.utils.C0143;
import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Proxy {
    public static volatile Method a = null;
    public static volatile Method b = null;
    public static volatile int c = 0;
    public static volatile boolean d = false;
    public static volatile long e = -5000;
    public static volatile long f = 0;
    public static int g = 8964;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f79short = {680, 651, 647, 645, 648, 708, 660, 662, 651, 668, 669, 708, 660, 651, 662, 656, 734, 708, 386, 414, 414, 410, 464, 453, 453, 475, 472, 477, 452, 474, 452, 474, 452, 475, 464, 2164, 2091, 2089, 2100, 2083, 2082, 2148, 2111, 2100, 2150, 2104, 2096, 3286, 3282, 1752, 1732, 1732, 1728, 2674, 2670, 2670, 2666, 2665, 2431, 2429, 2400, 2423, 2422, 2357, 2336, 2336, 2411, 2400, 2354, 2412, 2428, 2431, 2345, 2428, 2406, 2427, 2410, 2372, 2410, 2422, 2354, 448, 476, 476, 472, 402, 391, 391, 409, 410, 415, 390, 408, 390, 408, 390, 409, 402, 3025, 2958, 2956, 2961, 2950, 2951, 1789, 1777, 1779, 1712, 1785, 1783, 1770, 1782, 1771, 1788, 1712, 1789, 1791, 1770, 1768, 1777, 1786, 1712, 1742, 1772, 1777, 1766, 1767, 1466, 1464, 1449, 1421, 1458, 1455, 1449, 1885, 1887, 1870, 1903, 1864, 1878, 3126, 3133, 1102, 1103, 1117, 1078, 1059, 2932, 2917, 2936, 2932, 2863, 2928, 2924, 2913, 2921, 2926, 2875, 2848, 2915, 2920, 2913, 2930, 2931, 2917, 2932, 2877, 2933, 2932, 2918, 2861, 2872, 1712, 1702, 1707, 1707, 1719, 1702, 1719, 1698, 1717, 1452, 1461, 1468, 1466, 1415, 1457, 1461, 1465, 1471, 1469, 1663, 1648, 1642, 1649, 1661, 1643, 1648, 1647, 1660, 2342, 2338, 2358, 2341, 2364, 2230, 2228, 2217, 2238, 2239, 2393, 2394, 2390, 2388, 2393, 1660, 1655, 1650, 1655, 2696, 2693, 2688, 2561, 2583, 2976, 2984, 2410, 2405, 2431, 2404, 2404, 2420, 2429, 2111, 2098, 2098, 2098, 2103, 2088, 2107, 2049, 2109, 2097, 2088, 2107, 2092, 1281, 1293, 1292, 1284, 1291, 1285, 960, 968, 981, 968, 975, 966, 2094, 2090, 2413, 2428, 2401, 2413, 2358, 2409, 2421, 2424, 2416, 2423, 2935, 2901, 2888, 2911, 2910, 2823, 2901, 2882, 2899, 2898, 2901, 2889, 2882, 2883, 2823, 2889, 2898, 2891, 2891, 2382, 2412, 2417, 2406, 2407, 2366, 2427, 2412, 2412, 2417, 2412, 2340, 2366, 2701, 2735, 2738, 2725, 2724, 2813, 2744, 2735, 2735, 2738, 2735};
    public static final AtomicBoolean h = new AtomicBoolean();

    public static void a() {
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                init();
                if (!d && !Thread.currentThread().isInterrupted()) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() + 1000;
                    int i = c;
                    if (!d(i) || !b(i, jElapsedRealtime)) {
                        for (int i2 = 0; i2 < 1035 && !d && !Thread.currentThread().isInterrupted() && SystemClock.elapsedRealtime() < jElapsedRealtime; i2++) {
                            int i3 = g;
                            g = i3 >= 9998 ? 8964 : i3 + 1;
                            if (i3 == i || !b(i3, jElapsedRealtime)) {
                            }
                        }
                        c = 0;
                        e = SystemClock.elapsedRealtime();
                    }
                }
            }
        } finally {
            h.set(false);
        }
    }

    public static boolean b(int i, long j) {
        String strM21 = C0006.m21(f79short, 0, 18, 740);
        long jElapsedRealtime = j - SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= 0) {
            return false;
        }
        try {
            Response responseK = X1.K(new Request.Builder().url(C0063.m249(f79short, 18, 17, 490) + i + C0115.m459(f79short, 35, 12, 2139)).build(), Math.min(100L, jElapsedRealtime));
            try {
                if (responseK.code() == 200 && responseK.body() != null) {
                    if (!responseK.body().source().request(3L) && C0076.m301(f79short, 47, 2, 3257).equals(responseK.body().source().readUtf8())) {
                        if (!d && SystemClock.elapsedRealtime() <= j) {
                            c = i;
                            f = SystemClock.elapsedRealtime();
                            SpiderDebug.log(strM21 + i);
                            responseK.close();
                            return true;
                        }
                        responseK.close();
                        return false;
                    }
                    responseK.close();
                    return false;
                }
                responseK.close();
                return false;
            } catch (Throwable th) {
                if (responseK != null) {
                    try {
                        responseK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static String buildUrl(String str, Map<String, String> map) {
        return ProxyOrigin.buildUrl(str, map);
    }

    public static String buildUrl(String str, Map<String, String> map, String str2, int i) {
        return ProxyOrigin.buildUrl(str, map, str2, i);
    }

    public static boolean c(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            URI uri = new URI(str);
            return (C0003.m10(f79short, 49, 4, 1712).equalsIgnoreCase(uri.getScheme()) || C0044.m175(f79short, 53, 5, 2586).equalsIgnoreCase(uri.getScheme())) && uri.getHost() != null && !uri.getHost().isEmpty() && d(uri.getPort()) && uri.getRawUserInfo() == null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d(int i) {
        return i > 0 && i <= 65535;
    }

    public static int getPort() {
        init();
        Method method = b;
        if (method != null) {
            try {
                int iIntValue = ((Integer) method.invoke(null, null)).intValue();
                if (d(iIntValue)) {
                    return iIntValue;
                }
                return 0;
            } catch (Throwable unused) {
                return 0;
            }
        }
        int i = c;
        if (d(i) && SystemClock.elapsedRealtime() - f < 5000) {
            return i;
        }
        if (SystemClock.elapsedRealtime() - e >= 5000 && h.compareAndSet(false, true)) {
            try {
                if (!d(c) || Looper.myLooper() == Looper.getMainLooper()) {
                    Init.execute(new A(12));
                } else {
                    a();
                }
            } catch (Throwable unused2) {
                h.set(false);
            }
        }
        int i2 = c;
        if (!d(i2) || SystemClock.elapsedRealtime() - f >= 5000) {
            return 0;
        }
        return i2;
    }

    public static String getUrl() {
        return getUrl(true);
    }

    public static String getUrl(String str, String str2) {
        return com.github.catvod.spider.merge.D.b.j(C0142.m567(f79short, 58, 23, 2319), str, str2);
    }

    public static String getUrl(boolean z) {
        init();
        Method method = a;
        if (method != null) {
            try {
                String str = (String) method.invoke(null, Boolean.valueOf(z));
                if (c(str)) {
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        int port = getPort();
        return (z && d(port)) ? com.github.catvod.spider.merge.D.b.h(C0030.m116(f79short, 81, 17, 424), port, C0014.m54(f79short, 98, 6, 3070)) : "";
    }

    public static synchronized void init() {
        if (d) {
            return;
        }
        try {
            Class<?> cls = Class.forName(C0116.m463(f79short, 104, 23, 1694));
            Method method = cls.getMethod(C0106.m422(f79short, 127, 7, 1501), null);
            Method method2 = cls.getMethod(C0107.m427(f79short, 134, 6, 1850), Boolean.TYPE);
            b = method;
            a = method2;
            d = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x029e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0287  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a6 A[Catch: Exception -> 0x02ce, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ce, blocks: (B:87:0x029e, B:89:0x02a6), top: B:105:0x029e }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0036  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d0 A[PHI: r0
  0x02d0: PHI (r0v10 java.lang.Object[]) = (r0v9 java.lang.Object[]), (r0v12 java.lang.Object[]) binds: [B:95:0x02f3, B:88:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
    public static Object[] proxy(final Map<String, String> map) {
        Callable callable;
        Object[] objArr;
        boolean zHostAllowed;
        String strM10;
        Object[] objArr2;
        Object[] objArr3;
        final int i = 12;
        final int i2 = 11;
        final int i3 = 10;
        final int i4 = 9;
        final int i5 = 8;
        final int i6 = 7;
        final int i7 = 6;
        final int i8 = 5;
        final int i9 = 3;
        final int i10 = 2;
        final int i11 = 1;
        final int i12 = 0;
        Pattern pattern = ProxyOrigin.a;
        String str = map == null ? null : map.get(C0106.m422(f79short, 140, 2, 3154));
        if (str != null) {
            String strM459 = C0115.m459(f79short, 142, 5, 1051);
            String strM175 = C0044.m175(f79short, 147, 25, 2816);
            byte b2 = -1;
            switch (str.hashCode()) {
                case -1417409770:
                    if (str.equals(C0117.m467(f79short, 252, 6, 929))) {
                        b2 = 0;
                    }
                    break;
                case -1354792126:
                    if (str.equals(C0044.m175(f79short, 246, 6, 1378))) {
                        b2 = 1;
                    }
                    break;
                case -1232884987:
                    if (str.equals(C0043.m169(f79short, 233, 13, 2142))) {
                        b2 = 2;
                    }
                    break;
                case -848437239:
                    if (str.equals(C0014.m54(f79short, 226, 7, 2316))) {
                        b2 = 3;
                    }
                    break;
                case 3176:
                    if (str.equals(C0050.m199(f79short, 224, 2, 3011))) {
                        b2 = 4;
                    }
                    break;
                case 3726:
                    if (str.equals(C0098.m390(f79short, 222, 2, 2676))) {
                        b2 = 5;
                    }
                    break;
                case 96670:
                    if (str.equals(C0003.m10(f79short, 219, 3, 2793))) {
                        b2 = 6;
                    }
                    break;
                case 3023876:
                    if (str.equals(C0097.m386(f79short, 215, 4, 1566))) {
                        b2 = 7;
                    }
                    break;
                case 103145323:
                    if (str.equals(C0114.m454(f79short, 210, 5, 2357))) {
                        b2 = 8;
                    }
                    break;
                case 106941038:
                    if (str.equals(C0125.m499(f79short, 205, 5, 2246))) {
                        b2 = 9;
                    }
                    break;
                case 107940278:
                    if (str.equals(C0010.m36(f79short, 200, 5, 2391))) {
                        b2 = 10;
                    }
                    break;
                case 691722802:
                    if (str.equals(C0050.m199(f79short, 191, 9, 1561))) {
                        b2 = 11;
                    }
                    break;
                case 1318701011:
                    if (str.equals(C0044.m175(f79short, 181, 10, 1496))) {
                        b2 = 12;
                    }
                    break;
                case 1474694658:
                    if (str.equals(C0122.m486(f79short, 172, 9, 1735))) {
                        b2 = 13;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i13;
                            int i14;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i9) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e2) {
                                        SpiderDebug.log("InputPushService error: " + e2.getMessage());
                                        return H0.d(e2.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e3) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e3.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i15 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i14 = 502;
                                            i13 = 0;
                                            Integer numValueOf = Integer.valueOf(i14);
                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[i13]);
                                            Object[] objArr4 = new Object[4];
                                            objArr4[i13] = numValueOf;
                                            objArr4[1] = "text/plain";
                                            objArr4[2] = byteArrayInputStream;
                                            objArr4[3] = map2;
                                            return objArr4;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i15;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i13 = 0;
                                    i14 = 502;
                                    Integer numValueOf2 = Integer.valueOf(i14);
                                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(new byte[i13]);
                                    Object[] objArr5 = new Object[4];
                                    objArr5[i13] = numValueOf2;
                                    objArr5[1] = "text/plain";
                                    objArr5[2] = byteArrayInputStream2;
                                    objArr5[3] = map2;
                                    return objArr5;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    } else {
                        try {
                            objArr3 = (Object[]) callable.call();
                            if (objArr3 != null) {
                                objArr = objArr3;
                            } else {
                                objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                                objArr = objArr2;
                            }
                        } catch (Exception e2) {
                            try {
                                objArr3 = new Object[]{502, strM175, new ByteArrayInputStream((C0056.m223(f79short, 289, 13, 2334) + e2.getMessage()).getBytes(strM459))};
                                objArr = objArr3;
                            } catch (Exception unused) {
                                objArr2 = new Object[]{502, strM10, new ByteArrayInputStream(C0047.m186(f79short, 302, 11, 2781).getBytes())};
                                objArr = objArr2;
                            }
                        }
                    }
                    break;
                case 1:
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i13;
                            int i14;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i11) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e3) {
                                        SpiderDebug.log("InputPushService error: " + e3.getMessage());
                                        return H0.d(e3.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e4) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e4.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i15 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i14 = 502;
                                            i13 = 0;
                                            Integer numValueOf2 = Integer.valueOf(i14);
                                            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(new byte[i13]);
                                            Object[] objArr5 = new Object[4];
                                            objArr5[i13] = numValueOf2;
                                            objArr5[1] = "text/plain";
                                            objArr5[2] = byteArrayInputStream2;
                                            objArr5[3] = map2;
                                            return objArr5;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i15;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i13 = 0;
                                    i14 = 502;
                                    Integer numValueOf3 = Integer.valueOf(i14);
                                    ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(new byte[i13]);
                                    Object[] objArr6 = new Object[4];
                                    objArr6[i13] = numValueOf3;
                                    objArr6[1] = "text/plain";
                                    objArr6[2] = byteArrayInputStream3;
                                    objArr6[3] = map2;
                                    return objArr6;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr3 = (Object[]) callable.call();
                        if (objArr3 != null) {
                            objArr = objArr3;
                        } else {
                            objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                            objArr = objArr2;
                        }
                    } else {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    }
                    break;
                case 2:
                    final int i13 = 4;
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i14;
                            int i15;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i13) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e3) {
                                        SpiderDebug.log("InputPushService error: " + e3.getMessage());
                                        return H0.d(e3.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e4) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e4.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i16 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i15 = 502;
                                            i14 = 0;
                                            Integer numValueOf3 = Integer.valueOf(i15);
                                            ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(new byte[i14]);
                                            Object[] objArr6 = new Object[4];
                                            objArr6[i14] = numValueOf3;
                                            objArr6[1] = "text/plain";
                                            objArr6[2] = byteArrayInputStream3;
                                            objArr6[3] = map2;
                                            return objArr6;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i16;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i14 = 0;
                                    i15 = 502;
                                    Integer numValueOf4 = Integer.valueOf(i15);
                                    ByteArrayInputStream byteArrayInputStream4 = new ByteArrayInputStream(new byte[i14]);
                                    Object[] objArr7 = new Object[4];
                                    objArr7[i14] = numValueOf4;
                                    objArr7[1] = "text/plain";
                                    objArr7[2] = byteArrayInputStream4;
                                    objArr7[3] = map2;
                                    return objArr7;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr3 = (Object[]) callable.call();
                        if (objArr3 != null) {
                            objArr = objArr3;
                        } else {
                            objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                            objArr = objArr2;
                        }
                    } else {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    }
                    break;
                case 3:
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i14;
                            int i15;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i7) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e3) {
                                        SpiderDebug.log("InputPushService error: " + e3.getMessage());
                                        return H0.d(e3.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e4) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e4.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i16 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i15 = 502;
                                            i14 = 0;
                                            Integer numValueOf4 = Integer.valueOf(i15);
                                            ByteArrayInputStream byteArrayInputStream4 = new ByteArrayInputStream(new byte[i14]);
                                            Object[] objArr7 = new Object[4];
                                            objArr7[i14] = numValueOf4;
                                            objArr7[1] = "text/plain";
                                            objArr7[2] = byteArrayInputStream4;
                                            objArr7[3] = map2;
                                            return objArr7;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i16;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i14 = 0;
                                    i15 = 502;
                                    Integer numValueOf5 = Integer.valueOf(i15);
                                    ByteArrayInputStream byteArrayInputStream5 = new ByteArrayInputStream(new byte[i14]);
                                    Object[] objArr8 = new Object[4];
                                    objArr8[i14] = numValueOf5;
                                    objArr8[1] = "text/plain";
                                    objArr8[2] = byteArrayInputStream5;
                                    objArr8[3] = map2;
                                    return objArr8;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr3 = (Object[]) callable.call();
                        if (objArr3 != null) {
                            objArr = objArr3;
                        } else {
                            objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                            objArr = objArr2;
                        }
                    } else {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    }
                    break;
                case 4:
                    objArr = new Object[]{200, strM175, new ByteArrayInputStream(C0143.m570(f79short, 258, 2, 2113).getBytes(strM459))};
                    break;
                case 5:
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i14;
                            int i15;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i5) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e3) {
                                        SpiderDebug.log("InputPushService error: " + e3.getMessage());
                                        return H0.d(e3.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e4) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e4.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i16 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i15 = 502;
                                            i14 = 0;
                                            Integer numValueOf5 = Integer.valueOf(i15);
                                            ByteArrayInputStream byteArrayInputStream5 = new ByteArrayInputStream(new byte[i14]);
                                            Object[] objArr8 = new Object[4];
                                            objArr8[i14] = numValueOf5;
                                            objArr8[1] = "text/plain";
                                            objArr8[2] = byteArrayInputStream5;
                                            objArr8[3] = map2;
                                            return objArr8;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i16;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i14 = 0;
                                    i15 = 502;
                                    Integer numValueOf6 = Integer.valueOf(i15);
                                    ByteArrayInputStream byteArrayInputStream6 = new ByteArrayInputStream(new byte[i14]);
                                    Object[] objArr9 = new Object[4];
                                    objArr9[i14] = numValueOf6;
                                    objArr9[1] = "text/plain";
                                    objArr9[2] = byteArrayInputStream6;
                                    objArr9[3] = map2;
                                    return objArr9;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr3 = (Object[]) callable.call();
                        if (objArr3 != null) {
                            objArr = objArr3;
                        } else {
                            objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                            objArr = objArr2;
                        }
                    } else {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    }
                    break;
                case 6:
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i14;
                            int i15;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i12) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e3) {
                                        SpiderDebug.log("InputPushService error: " + e3.getMessage());
                                        return H0.d(e3.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e4) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e4.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i16 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i15 = 502;
                                            i14 = 0;
                                            Integer numValueOf6 = Integer.valueOf(i15);
                                            ByteArrayInputStream byteArrayInputStream6 = new ByteArrayInputStream(new byte[i14]);
                                            Object[] objArr9 = new Object[4];
                                            objArr9[i14] = numValueOf6;
                                            objArr9[1] = "text/plain";
                                            objArr9[2] = byteArrayInputStream6;
                                            objArr9[3] = map2;
                                            return objArr9;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i16;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i14 = 0;
                                    i15 = 502;
                                    Integer numValueOf7 = Integer.valueOf(i15);
                                    ByteArrayInputStream byteArrayInputStream7 = new ByteArrayInputStream(new byte[i14]);
                                    Object[] objArr10 = new Object[4];
                                    objArr10[i14] = numValueOf7;
                                    objArr10[1] = "text/plain";
                                    objArr10[2] = byteArrayInputStream7;
                                    objArr10[3] = map2;
                                    return objArr10;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr3 = (Object[]) callable.call();
                        if (objArr3 != null) {
                            objArr = objArr3;
                        } else {
                            objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                            objArr = objArr2;
                        }
                    } else {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    }
                    break;
                case 7:
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i14;
                            int i15;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i4) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e3) {
                                        SpiderDebug.log("InputPushService error: " + e3.getMessage());
                                        return H0.d(e3.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e4) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e4.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i16 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i15 = 502;
                                            i14 = 0;
                                            Integer numValueOf7 = Integer.valueOf(i15);
                                            ByteArrayInputStream byteArrayInputStream7 = new ByteArrayInputStream(new byte[i14]);
                                            Object[] objArr10 = new Object[4];
                                            objArr10[i14] = numValueOf7;
                                            objArr10[1] = "text/plain";
                                            objArr10[2] = byteArrayInputStream7;
                                            objArr10[3] = map2;
                                            return objArr10;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i16;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i14 = 0;
                                    i15 = 502;
                                    Integer numValueOf8 = Integer.valueOf(i15);
                                    ByteArrayInputStream byteArrayInputStream8 = new ByteArrayInputStream(new byte[i14]);
                                    Object[] objArr11 = new Object[4];
                                    objArr11[i14] = numValueOf8;
                                    objArr11[1] = "text/plain";
                                    objArr11[2] = byteArrayInputStream8;
                                    objArr11[3] = map2;
                                    return objArr11;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr3 = (Object[]) callable.call();
                        if (objArr3 != null) {
                            objArr = objArr3;
                        } else {
                            objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                            objArr = objArr2;
                        }
                    } else {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    }
                    break;
                case 8:
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i14;
                            int i15;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i2) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e3) {
                                        SpiderDebug.log("InputPushService error: " + e3.getMessage());
                                        return H0.d(e3.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e4) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e4.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i16 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i15 = 502;
                                            i14 = 0;
                                            Integer numValueOf8 = Integer.valueOf(i15);
                                            ByteArrayInputStream byteArrayInputStream8 = new ByteArrayInputStream(new byte[i14]);
                                            Object[] objArr11 = new Object[4];
                                            objArr11[i14] = numValueOf8;
                                            objArr11[1] = "text/plain";
                                            objArr11[2] = byteArrayInputStream8;
                                            objArr11[3] = map2;
                                            return objArr11;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i16;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i14 = 0;
                                    i15 = 502;
                                    Integer numValueOf9 = Integer.valueOf(i15);
                                    ByteArrayInputStream byteArrayInputStream9 = new ByteArrayInputStream(new byte[i14]);
                                    Object[] objArr12 = new Object[4];
                                    objArr12[i14] = numValueOf9;
                                    objArr12[1] = "text/plain";
                                    objArr12[2] = byteArrayInputStream9;
                                    objArr12[3] = map2;
                                    return objArr12;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr3 = (Object[]) callable.call();
                        if (objArr3 != null) {
                            objArr = objArr3;
                        } else {
                            objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                            objArr = objArr2;
                        }
                    } else {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    }
                    break;
                case 9:
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i14;
                            int i15;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e3) {
                                        SpiderDebug.log("InputPushService error: " + e3.getMessage());
                                        return H0.d(e3.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e4) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e4.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i16 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i15 = 502;
                                            i14 = 0;
                                            Integer numValueOf9 = Integer.valueOf(i15);
                                            ByteArrayInputStream byteArrayInputStream9 = new ByteArrayInputStream(new byte[i14]);
                                            Object[] objArr12 = new Object[4];
                                            objArr12[i14] = numValueOf9;
                                            objArr12[1] = "text/plain";
                                            objArr12[2] = byteArrayInputStream9;
                                            objArr12[3] = map2;
                                            return objArr12;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i16;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i14 = 0;
                                    i15 = 502;
                                    Integer numValueOf10 = Integer.valueOf(i15);
                                    ByteArrayInputStream byteArrayInputStream10 = new ByteArrayInputStream(new byte[i14]);
                                    Object[] objArr13 = new Object[4];
                                    objArr13[i14] = numValueOf10;
                                    objArr13[1] = "text/plain";
                                    objArr13[2] = byteArrayInputStream10;
                                    objArr13[3] = map2;
                                    return objArr13;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr3 = (Object[]) callable.call();
                        if (objArr3 != null) {
                            objArr = objArr3;
                        } else {
                            objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                            objArr = objArr2;
                        }
                    } else {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    }
                    break;
                case 10:
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i14;
                            int i15;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i6) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e3) {
                                        SpiderDebug.log("InputPushService error: " + e3.getMessage());
                                        return H0.d(e3.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e4) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e4.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i16 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i15 = 502;
                                            i14 = 0;
                                            Integer numValueOf10 = Integer.valueOf(i15);
                                            ByteArrayInputStream byteArrayInputStream10 = new ByteArrayInputStream(new byte[i14]);
                                            Object[] objArr13 = new Object[4];
                                            objArr13[i14] = numValueOf10;
                                            objArr13[1] = "text/plain";
                                            objArr13[2] = byteArrayInputStream10;
                                            objArr13[3] = map2;
                                            return objArr13;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i16;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i14 = 0;
                                    i15 = 502;
                                    Integer numValueOf11 = Integer.valueOf(i15);
                                    ByteArrayInputStream byteArrayInputStream11 = new ByteArrayInputStream(new byte[i14]);
                                    Object[] objArr14 = new Object[4];
                                    objArr14[i14] = numValueOf11;
                                    objArr14[1] = "text/plain";
                                    objArr14[2] = byteArrayInputStream11;
                                    objArr14[3] = map2;
                                    return objArr14;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr3 = (Object[]) callable.call();
                        if (objArr3 != null) {
                            objArr = objArr3;
                        } else {
                            objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                            objArr = objArr2;
                        }
                    } else {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    }
                    break;
                case 11:
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i14;
                            int i15;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i3) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e3) {
                                        SpiderDebug.log("InputPushService error: " + e3.getMessage());
                                        return H0.d(e3.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e4) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e4.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i16 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i15 = 502;
                                            i14 = 0;
                                            Integer numValueOf11 = Integer.valueOf(i15);
                                            ByteArrayInputStream byteArrayInputStream11 = new ByteArrayInputStream(new byte[i14]);
                                            Object[] objArr14 = new Object[4];
                                            objArr14[i14] = numValueOf11;
                                            objArr14[1] = "text/plain";
                                            objArr14[2] = byteArrayInputStream11;
                                            objArr14[3] = map2;
                                            return objArr14;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i16;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i14 = 0;
                                    i15 = 502;
                                    Integer numValueOf12 = Integer.valueOf(i15);
                                    ByteArrayInputStream byteArrayInputStream12 = new ByteArrayInputStream(new byte[i14]);
                                    Object[] objArr15 = new Object[4];
                                    objArr15[i14] = numValueOf12;
                                    objArr15[1] = "text/plain";
                                    objArr15[2] = byteArrayInputStream12;
                                    objArr15[3] = map2;
                                    return objArr15;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr3 = (Object[]) callable.call();
                        if (objArr3 != null) {
                            objArr = objArr3;
                        } else {
                            objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                            objArr = objArr2;
                        }
                    } else {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    }
                    break;
                case 12:
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i14;
                            int i15;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i8) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e3) {
                                        SpiderDebug.log("InputPushService error: " + e3.getMessage());
                                        return H0.d(e3.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e4) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e4.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i16 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i15 = 502;
                                            i14 = 0;
                                            Integer numValueOf12 = Integer.valueOf(i15);
                                            ByteArrayInputStream byteArrayInputStream12 = new ByteArrayInputStream(new byte[i14]);
                                            Object[] objArr15 = new Object[4];
                                            objArr15[i14] = numValueOf12;
                                            objArr15[1] = "text/plain";
                                            objArr15[2] = byteArrayInputStream12;
                                            objArr15[3] = map2;
                                            return objArr15;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i16;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i14 = 0;
                                    i15 = 502;
                                    Integer numValueOf13 = Integer.valueOf(i15);
                                    ByteArrayInputStream byteArrayInputStream13 = new ByteArrayInputStream(new byte[i14]);
                                    Object[] objArr16 = new Object[4];
                                    objArr16[i14] = numValueOf13;
                                    objArr16[1] = "text/plain";
                                    objArr16[2] = byteArrayInputStream13;
                                    objArr16[3] = map2;
                                    return objArr16;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr3 = (Object[]) callable.call();
                        if (objArr3 != null) {
                            objArr = objArr3;
                        } else {
                            objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                            objArr = objArr2;
                        }
                    } else {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    }
                    break;
                case 13:
                    callable = new Callable() { // from class: com.github.catvod.spider.merge.u.O
                        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:139:0x0420  */
                        /* JADX WARN: Code duplicated, block: B:14:0x0072  */
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            byte b3;
                            Object[] objArrB;
                            Map map2;
                            int i14;
                            int i15;
                            String strB;
                            Map map3;
                            Map map4 = map;
                            switch (i10) {
                                case 0:
                                    Pattern pattern2 = ProxyOrigin.a;
                                    return Ali.localProxy(map4);
                                case 1:
                                    Pattern pattern3 = ProxyOrigin.a;
                                    H0 h0 = H0.a;
                                    String str2 = (String) map4.get("action");
                                    if (str2 == null) {
                                        str2 = "page";
                                    }
                                    try {
                                        switch (str2.hashCode()) {
                                            case -899647263:
                                                if (str2.equals("slider")) {
                                                    b3 = 3;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3433103:
                                                if (str2.equals("page")) {
                                                    b3 = 0;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 3452698:
                                                if (str2.equals("push")) {
                                                    b3 = 1;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 552567418:
                                                if (str2.equals("captcha")) {
                                                    b3 = 4;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            case 951117504:
                                                if (str2.equals("confirm")) {
                                                    b3 = 2;
                                                } else {
                                                    b3 = -1;
                                                }
                                                break;
                                            default:
                                                b3 = -1;
                                                break;
                                        }
                                        if (b3 == 0) {
                                            return H0.h(map4);
                                        }
                                        if (b3 == 1) {
                                            return H0.e(map4);
                                        }
                                        if (b3 == 2) {
                                            return H0.a(map4);
                                        }
                                        if (b3 != 3) {
                                            return b3 != 4 ? H0.d("未知操作", false) : H0.g(map4);
                                        }
                                        return H0.i(map4);
                                    } catch (Exception e3) {
                                        SpiderDebug.log("InputPushService error: " + e3.getMessage());
                                        return H0.d(e3.getMessage(), false);
                                    }
                                case 2:
                                    Pattern pattern4 = ProxyOrigin.a;
                                    return Wallpaper.localProxy(map4);
                                case 3:
                                    Pattern pattern5 = ProxyOrigin.a;
                                    String str3 = (String) map4.get("type");
                                    String str4 = (String) map4.get("url");
                                    Pattern pattern6 = AiTingMusic.a;
                                    String strW = FishCrypto.w("N1.0mwGTQZS3z6ZsVle7xM1NpXo/fvCZM6RCWM0JIPqQw1TpqbV0oDQbi99l7VK22i96RdICPv63vXIg1FV/2W2+w==", str4);
                                    if (strW == null || strW.isEmpty()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36", "Referer", "https://www.22a5.com/");
                                    try {
                                        return "img".equals(str3) ? new Object[]{200, "image/jpeg", new ByteArrayInputStream(X1.H(strW, mapT).body().bytes())} : "lrc".equals(str3) ? new Object[]{200, "application/octet-stream", new ByteArrayInputStream(X1.X(strW, null, mapT).getBytes("UTF-8"))} : new Object[]{400, "text/plain", new ByteArrayInputStream("Unknown type".getBytes("UTF-8"))};
                                    } catch (Exception e4) {
                                        return new Object[]{500, "text/plain", new ByteArrayInputStream(("Error: " + e4.getMessage()).getBytes("UTF-8"))};
                                    }
                                case 4:
                                    Pattern pattern7 = ProxyOrigin.a;
                                    String str5 = (String) map4.get("site");
                                    if (!com.github.catvod.spider.merge.p018v.b.i(str5)) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0])};
                                    }
                                    String strH = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("url"));
                                    String strH2 = com.github.catvod.spider.merge.p018v.b.h((String) map4.get("avatar"));
                                    boolean z = (strH2.isEmpty() || strH2.equals(strH)) ? false : true;
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L) + System.nanoTime();
                                    Object[] objArrB2 = ProxyOrigin.b(z ? 1000L : 2000L, str5, strH);
                                    if (objArrB2 != null) {
                                        return objArrB2;
                                    }
                                    long millis = TimeUnit.NANOSECONDS.toMillis(nanos - System.nanoTime());
                                    if (z && millis > 0 && (objArrB = ProxyOrigin.b(millis, str5, strH2)) != null) {
                                        return objArrB;
                                    }
                                    String strX0 = AbstractC0302v0.x0(str5);
                                    return HttpUrl.parse(strX0) == null ? new Object[]{502, "text/plain", new ByteArrayInputStream(new byte[0])} : new Object[]{302, "text/plain", new ByteArrayInputStream(new byte[0]), b.t("Location", strX0, "Cache-Control", "no-store")};
                                case 5:
                                    Pattern pattern8 = ProxyOrigin.a;
                                    String str6 = (String) map4.get("path");
                                    Map mapSingletonMap = Collections.singletonMap("Cache-Control", "no-store");
                                    if (str6 == null || !ProxyOrigin.a.matcher(str6).matches()) {
                                        return new Object[]{400, "text/plain", new ByteArrayInputStream(new byte[0]), mapSingletonMap};
                                    }
                                    LinkedHashSet<HttpUrl> linkedHashSet = new LinkedHashSet();
                                    Iterator it = Arrays.asList(a.i().d, "https://image.tmdb.org/t/p/w500", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500").iterator();
                                    while (it.hasNext()) {
                                        HttpUrl httpUrl = HttpUrl.parse(((String) it.next()) + str6);
                                        if (httpUrl != null) {
                                            linkedHashSet.add(httpUrl);
                                        }
                                    }
                                    long nanos2 = TimeUnit.SECONDS.toNanos(6L) + System.nanoTime();
                                    int size = linkedHashSet.size();
                                    for (HttpUrl httpUrl2 : linkedHashSet) {
                                        int i16 = size - 1;
                                        map2 = mapSingletonMap;
                                        long jMin = Math.min(3000L, TimeUnit.NANOSECONDS.toMillis(nanos2 - System.nanoTime()) / ((long) size));
                                        if (jMin <= 0) {
                                            i15 = 502;
                                            i14 = 0;
                                            Integer numValueOf13 = Integer.valueOf(i15);
                                            ByteArrayInputStream byteArrayInputStream13 = new ByteArrayInputStream(new byte[i14]);
                                            Object[] objArr16 = new Object[4];
                                            objArr16[i14] = numValueOf13;
                                            objArr16[1] = "text/plain";
                                            objArr16[2] = byteArrayInputStream13;
                                            objArr16[3] = map2;
                                            return objArr16;
                                        }
                                        Object[] objArrA = ProxyOrigin.a(new Request.Builder().url(httpUrl2).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36").build(), jMin);
                                        if (objArrA != null) {
                                            return new Object[]{objArrA[0], objArrA[1], objArrA[2], Collections.singletonMap("Cache-Control", "public, max-age=600")};
                                        }
                                        size = i16;
                                        mapSingletonMap = map2;
                                    }
                                    map2 = mapSingletonMap;
                                    i14 = 0;
                                    i15 = 502;
                                    Integer numValueOf14 = Integer.valueOf(i15);
                                    ByteArrayInputStream byteArrayInputStream14 = new ByteArrayInputStream(new byte[i14]);
                                    Object[] objArr17 = new Object[4];
                                    objArr17[i14] = numValueOf14;
                                    objArr17[1] = "text/plain";
                                    objArr17[2] = byteArrayInputStream14;
                                    objArr17[3] = map2;
                                    return objArr17;
                                case 6:
                                    Pattern pattern9 = ProxyOrigin.a;
                                    return FishHxq.localProxy(map4);
                                case 7:
                                    Pattern pattern10 = ProxyOrigin.a;
                                    return Quark.localProxy(map4);
                                case 8:
                                    Pattern pattern11 = ProxyOrigin.a;
                                    return UC.localProxy(map4);
                                case 9:
                                    Pattern pattern12 = ProxyOrigin.a;
                                    return Bili.localProxy(map4);
                                case 10:
                                    Pattern pattern13 = ProxyOrigin.a;
                                    return FishDrive.vod(map4);
                                case 11:
                                    Pattern pattern14 = ProxyOrigin.a;
                                    return Local.localProxy(map4);
                                default:
                                    Pattern pattern15 = ProxyOrigin.a;
                                    String str7 = (String) map4.get("key");
                                    if (str7 != null) {
                                        ConcurrentHashMap concurrentHashMap = ProxyOrigin.b;
                                        if (concurrentHashMap.containsKey(str7)) {
                                            strB = (String) concurrentHashMap.get(str7);
                                            ConcurrentHashMap concurrentHashMap2 = ProxyOrigin.c;
                                            map3 = concurrentHashMap2.containsKey(str7) ? (Map) concurrentHashMap2.get(str7) : new HashMap();
                                        } else {
                                            strB = AbstractC0309x1.b((String) map4.get("url"));
                                            map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                            if (map3 == null) {
                                                map3 = new HashMap();
                                            }
                                        }
                                    } else {
                                        strB = AbstractC0309x1.b((String) map4.get("url"));
                                        map3 = (Map) new Gson().fromJson(AbstractC0309x1.b((String) map4.get("header")), Map.class);
                                        if (map3 == null) {
                                            map3 = new HashMap();
                                        }
                                    }
                                    if (strB == null || strB.isEmpty()) {
                                        return new Object[]{400, "text/plain; charset=utf-8", new ByteArrayInputStream("Missing url".getBytes("UTF-8"))};
                                    }
                                    List listAsList = Arrays.asList("range", "connection", "accept-encoding");
                                    for (String str8 : map4.keySet()) {
                                        if (listAsList.contains(str8.toLowerCase())) {
                                            map3.put(str8, (String) map4.get(str8));
                                        }
                                    }
                                    if (!map3.containsKey("X-Thread-Num")) {
                                        map3.put("X-Thread-Num", "16");
                                    }
                                    return C0286p1.b(strB, map3);
                            }
                        }
                    };
                    zHostAllowed = FishCrypto.hostAllowed();
                    strM10 = C0003.m10(f79short, 260, 10, 2329);
                    if (!zHostAllowed) {
                        objArr3 = (Object[]) callable.call();
                        if (objArr3 != null) {
                            objArr = objArr3;
                        } else {
                            objArr2 = new Object[]{502, strM175, new ByteArrayInputStream(C0089.m355(f79short, 270, 19, 2855).getBytes(strM459))};
                            objArr = objArr2;
                        }
                    } else {
                        objArr = new Object[]{403, strM10, new ByteArrayInputStream(new byte[0])};
                    }
                    break;
                default:
                    objArr = null;
                    break;
            }
        } else {
            objArr = null;
        }
        if (objArr != null && objArr.length > 0) {
            Integer num = 502;
            if (num.equals(objArr[0])) {
                objArr[0] = 500;
            }
        }
        return objArr;
    }
}
