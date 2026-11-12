package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.AbstractC0270k0;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0276m0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.RunnableC0315z1;
import com.github.catvod.spider.merge.A.T1;
import com.github.catvod.spider.merge.A.k2;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p017u.A;
import com.github.catvod.spider.merge.p017u.B;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.RunnableC0460l;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.utils.FishNative;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class InitOrigin {
    public static volatile String e;
    public static volatile Activity f;
    public static volatile boolean g;
    public static volatile boolean i;
    public static boolean j;
    public static volatile boolean l;
    public static boolean n;
    public static int p;
    public static int q;
    public static long r;
    public static boolean s;
    public static long t;
    public static boolean u;
    public Application d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f53short = {867, 865, 887, 891, 800, 877, 879, 890, 888, 865, 874, 800, 894, 865, 893, 890, 839, 864, 871, 890, 800, 893, 890, 879, 890, 875, 443, 444, 423, 423, 416, 423, 430, 2747, 2736, 2737, 2746, 1428, 1430, 1408, 1420, 1495, 1434, 1432, 1421, 1423, 1430, 1437, 1495, 1417, 1430, 1418, 1421, 1456, 1431, 1424, 1421, 1495, 1418, 1421, 1432, 1421, 1436, 2495, 2488, 2467, 2467, 2468, 2467, 2474, 1140, 1147, 1137, 1127, 1146, 1148, 1137, 1083, 1125, 1136, 1127, 1144, 1148, 1126, 1126, 1148, 1146, 1147, 1083, 1090, 1095, 1116, 1089, 1104, 1098, 1104, 1101, 1089, 1104, 1095, 1115, 1108, 1113, 1098, 1094, 1089, 1114, 1095, 1108, 1106, 1104, 794, 789, 799, 777, 788, 786, 799, 853, 779, 798, 777, 790, 786, 776, 776, 786, 788, 789, 853, 809, 830, 826, 831, 804, 830, 803, 815, 830, 809, 821, 826, 823, 804, 808, 815, 820, 809, 826, 828, 830, 2064, 2066, 2053, 2064, 2049, 2066, 2053, 2112, 2066, 2053, 2068, 2069, 2066, 2062, 2053, 2052, 2112, 2053, 2061, 2064, 2068, 2073, 1972, 1973, 1962, 2021, 2030, 2035, 1959, 2030, 2025, 2036, 2035, 2018, 2022, 2019, 1959, 2024, 2017, 1959, 1969, 1971, 1962, 2021, 2030, 2035, 712, 714, 723, 668, 663, 650, 734, 663, 656, 653, 650, 667, 671, 666, 734, 657, 664, 734, 717, 716, 723, 668, 663, 650, 1970, 1975, 1962, 1963, 1954, 2021, 1952, 1961, 1955, 2021, 1958, 1961, 1956, 1974, 1974, 2717, 2708, 2718, 2715, 2708, 2713, 2699, 2699, 2763, 2762, 1628, 1621, 1631, 1626, 1621, 1624, 1610, 1610, 1551, 1549, 1454, 1461, 1470, 1443, 1451, 1470, 1464, 1455, 1470, 1471, 1531, 1470, 1412, 1462, 1466, 1464, 1459, 1458, 1461, 1470, 3192, 3191, 3170, 3199, 3168, 3187, 3126, 3194, 3199, 3188, 3172, 3191, 3172, 3183, 3126, 3195, 3171, 3173, 3170, 3126, 3188, 3187, 3126, 3191, 3126, 3172, 3187, 3191, 3186, 3191, 3188, 3194, 3187, 3126, 3184, 3199, 3194, 3187, 712, 711, 722, 719, 720, 707, 646, 714, 719, 708, 724, 711, 724, 735, 646, 715, 723, 725, 722, 646, 708, 707, 646, 724, 707, 711, 706, 651, 713, 712, 714, 735, 1662, 1661, 1656, 1596, 1657, 1648, 1658, 1596, 1649, 1661, 1659, 1653, 1663, 2345, 2350, 2358, 2337, 2348, 2345, 2340, 2400, 2341, 2348, 2342, 1994, 1995, 2000, 1924, 1989, 1994, 1924, 1985, 1992, 1986, 582, 585, 588, 581, 512, 596, 591, 591, 512, 595, 584, 591, 594, 596, 2585, 2582, 2579, 2586, 2655, 2571, 2576, 2576, 2655, 2572, 2578, 2590, 2579, 2579, 1618, 1608, 1563, 1615, 1620, 1620, 1563, 1608, 1622, 1626, 1623, 1623, 2211, 2210, 2285, 2238, 2232, 2222, 2213, 2285, 2219, 2212, 2209, 2216, 2285, 2210, 2239, 2285, 2217, 2212, 2239, 2216, 2222, 2233, 2210, 2239, 2228, 3033, 3036, 3031, 3015, 3028, 3015, 3020, 996, 997, 1022, 938, 1004, 997, 1023, 996, 1006, 3122, 3128, 3116, 3107, 3118, 3117, 2070, 2049, 2051, 2061, 2071, 2064, 2049, 2070, 1134, 1129, 1148, 1129, 1144, 3267, 3286, 3293, 3287, 3290, 3293, 3284, 2636, 2627, 2633, 2655, 2626, 2628, 2633, 2563, 2636, 2653, 2653, 2563, 2668, 2638, 2649, 2628, 2651, 2628, 2649, 2644, 2681, 2629, 2655, 2632, 2636, 2633, 1235, 1221, 1218, 1218, 1237, 1246, 1220, 1265, 1235, 1220, 1241, 1222, 1241, 1220, 1225, 1252, 1240, 1218, 1237, 1233, 1236, 1613, 1633, 1603, 1620, 1609, 1622, 1609, 1620, 1609, 1605, 1619, 882, 867, 887, 881, 871, 870, 1731, 1729, 1750, 1739, 1748, 1739, 1750, 1755, 2167, 2175, 2146, 2150, 2155, 2098, 2145, 2173, 2098, 2146, 2163, 2150, 2170, 489, -30022, 20682, 29945, 31100, -29534, 17843, 29676, -31655, 23093, 26944, 22991, -2991, 915, 897, 934, 929, 956, 917, 1000, 937, 955, 945, 934, 939, 1000, 956, 937, 955, 931, 1000, 942, 937, 929, 932, 941, 940, 1010, 1000, 1058, 1080, 976, 978, 964, 968, 915, 990, 988, 969, 971, 978, 985, 915, 973, 978, 974, 969, 1012, 979, 980, 969, 915, 974, 969, 988, 969, 984, 2498, 2505, 2504, 2499, 1881, 1883, 1869, 1857, 1818, 1879, 1877, 1856, 1858, 1883, 1872, 1818, 1860, 1883, 1863, 1856, 1917, 1882, 1885, 1856, 1818, 1863, 1856, 1877, 1856, 1873, 2118, 2113, 2138, 2138, 2141, 2138, 2131, 3100, 3102, 3080, 3076, 3167, 3090, 3088, 3077, 3079, 3102, 3093, 3167, 3073, 3102, 3074, 3077, 3128, 3103, 3096, 3077, 3167, 3074, 3077, 3088, 3077, 3092, 2796, 2803, 2799, 2792, 2773, 2802, 2805, 2792, 1630, 1612, 1643, 1644, 1649, 1624, 1573, 1603, 1644, 1654, 1645, 1606, 1655, 1660, 1653, 1649, 1642, 1573, 1639, 1642, 1642, 1649, 1573, 1634, 1648, 1636, 1655, 1633, 1573, 1653, 1632, 1643, 1633, 1644, 1643, 1634, 3182, 3185, 3181, 3178, 3159, 3184, 3191, 3178, 3134, 3180, 3195, 3178, 3180, 3175, 3134, 3180, 3195, 3188, 3195, 3197, 3178, 3195, 3194, 1915, 1897, 1870, 1865, 1876, 1917, 1792, 1894, 1865, 1875, 1864, 1891, 1874, 1881, 1872, 1876, 1871, 1792, 1907, 1903, 1792, 1868, 1871, 1857, 1860, 1792, 1862, 1857, 1865, 1868, 1861, 1860, 1818, 1792, 1923, 1920, 1921, 1926, 1927, 1924, 1925, 1930, 1931, 1928, 1929, 1934, 1935, 1932, 1933, 1938, 1939, 1936, 1937, 1942, 1943, 1940, 1941, 1946, 1947, 1944, 1955, 1952, 1953, 1958, 1959, 1956, 1957, 1962, 1963, 1960, 1961, 1966, 1967, 1964, 1965, 1970, 1971, 1968, 1969, 1974, 1975, 1972, 1973, 1978, 1979, 1976, 2002, 2003, 2000, 2001, 2006, 2007, 2004, 2005, 2010, 2011, 1921, 1923, 1940, 1929, 1942, 1925, 1970, 1925, 1921, 1939, 1935, 1934, 1960, 1957, 1956, 1967, 1973, 1960, 1973, 1976, 1950, 1969, 1956, 1967, 1957, 1960, 1967, 1958};
    public static final AtomicBoolean h = new AtomicBoolean();
    public static final A k = new A(6);
    public static final Object m = new Object();
    public static int o = -1;
    public static final A v = new A(7);
    public static final A w = new A(8);
    public static final AtomicBoolean x = new AtomicBoolean();
    public static final AtomicBoolean y = new AtomicBoolean();
    public static final ThreadLocal z = new ThreadLocal();
    public final ClassLoader c = getClass().getClassLoader();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ExecutorService a = Executors.newFixedThreadPool(5);

    class Loader {
        public static volatile InitOrigin a = new InitOrigin();
    }

    public static Application a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        if (context instanceof Application) {
            return (Application) context;
        }
        return null;
    }

    public static void b() {
        if (j) {
            j = false;
            get().b.removeCallbacks(k);
        }
    }

    public static boolean c() {
        synchronized (System.class) {
            try {
                String property = System.getProperty(C0014.m54(f53short, 0, 26, 782));
                if (!C0137.m545(f53short, 26, 7, 457).equals(property) && !C0053.m210(f53short, 33, 4, 2783).equals(property)) {
                    System.setProperty(C0019.m75(f53short, 37, 26, 1529), C0006.m21(f53short, 63, 7, 2509));
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void checkPermission() throws Throwable {
        try {
            Activity activity = getActivity();
            if (activity != null && Build.VERSION.SDK_INT >= 23) {
                String[] strArr = {C0128.m511(f53short, 70, 41, 1045), C0087.m346(f53short, 111, 40, 891)};
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < 2; i2++) {
                    String str = strArr[i2];
                    if (AbstractC0270k0.b(activity, str) != 0) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                AbstractC0270k0.c(activity, (String[]) arrayList.toArray(new String[0]));
            }
        } catch (Exception unused) {
        }
    }

    public static ClassLoader classLoader() {
        return get().c;
    }

    public static Application context() {
        return get().d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000d, B:9:0x0019, B:11:0x0020, B:17:0x002c, B:21:0x0036, B:27:0x0047, B:33:0x0056, B:36:0x005d, B:40:0x0068, B:47:0x0075, B:50:0x007d, B:52:0x0083, B:54:0x0089, B:75:0x00ca, B:58:0x0093, B:61:0x009b, B:63:0x00a1, B:43:0x006f, B:70:0x00ad, B:74:0x00c5, B:76:0x00ce, B:78:0x00d2, B:82:0x00db, B:84:0x00e1, B:88:0x00ea, B:87:0x00e8, B:91:0x00f2, B:93:0x00fa, B:94:0x00fc, B:81:0x00d9, B:23:0x003c, B:19:0x0032), top: B:103:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x00f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static synchronized void d(Context context, String str) {
        String str2;
        String strO;
        ?? S;
        String str3 = str;
        synchronized (InitOrigin.class) {
            Application applicationA = a(context);
            if (applicationA != null && !Thread.currentThread().isInterrupted()) {
                init(applicationA);
                if (FishCrypto.a) {
                    h(e);
                    return;
                }
                if (str3 == null || str3.isEmpty()) {
                    str2 = str3;
                    str2 = e;
                }
                if (str2 != null) {
                    boolean zIsEmpty = str2.isEmpty();
                    strO = str2;
                    if (zIsEmpty) {
                        strO = C0276m0.o(applicationA);
                    }
                } else {
                    strO = C0276m0.o(applicationA);
                }
                int i2 = 0;
                boolean z2 = false;
                boolean z3 = false;
                ?? r9 = strO;
                while (i2 < 3) {
                    if (Thread.currentThread().isInterrupted()) {
                        return;
                    }
                    if (r9 != 0 && !r9.isEmpty()) {
                        e = r9;
                        h(r9);
                        if (!FishCrypto.a) {
                            String str4 = FishCrypto.b == null ? "" : FishCrypto.b;
                            if (i2 == 2) {
                                break;
                            }
                            if (e(str4) && !z3) {
                                ?? P = C0276m0.p(applicationA, r9);
                                if (P == 0 || P.isEmpty() || P.equals(r9)) {
                                    break;
                                    break;
                                    break;
                                } else {
                                    S = P;
                                    z3 = true;
                                    i2++;
                                    r9 = S;
                                }
                            } else {
                                if (!f(str4) || z2) {
                                    return;
                                }
                                String strS = C0276m0.s(applicationA, r9);
                                if (strS == null || strS.isEmpty()) {
                                    break;
                                } else {
                                    S = strS;
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        onSoLoadFailed(C0028.m108(f53short, 151, 22, 2144));
                        if (z2) {
                            return;
                        } else {
                            S = C0276m0.s(applicationA, null);
                        }
                    }
                    z2 = true;
                    i2++;
                    r9 = S;
                }
                if (!FishCrypto.a) {
                    if (f(FishCrypto.b == null ? "" : FishCrypto.b)) {
                        if (r9 != 0 && r9.equals(e)) {
                            e = null;
                        }
                        C0276m0.h(r9);
                    } else {
                        if (e(FishCrypto.b == null ? "" : FishCrypto.b)) {
                            if (r9 != 0) {
                                e = null;
                            }
                            C0276m0.h(r9);
                        }
                    }
                }
            }
        }
    }

    public static void deleteFilesWithFeature(String str, final String str2) {
        File[] fileArrListFiles;
        File file = new File(str);
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.github.catvod.spider.InitOrigin.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str3) {
                return str3.contains(str2);
            }
        })) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                file2.delete();
            }
        }
    }

    public static boolean e(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.contains(C0114.m454(f53short, 173, 24, 1927)) || lowerCase.contains(C0011.m42(f53short, 197, 24, 766)) || lowerCase.contains(C0070.m277(f53short, 221, 15, 1989)) || lowerCase.contains(C0059.m234(f53short, 236, 10, 2808)) || lowerCase.contains(C0010.m36(f53short, 246, 10, 1593)) || lowerCase.contains(C0133.m529(f53short, 256, 20, 1499));
    }

    public static void execute(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        get().a.execute(new B(runnable, 0));
    }

    public static boolean f(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.contains(C0049.m193(f53short, 276, 38, 3094)) || lowerCase.contains(C0130.m516(f53short, 314, 32, 678)) || lowerCase.contains(C0027.m105(f53short, 346, 13, 1564)) || lowerCase.contains(C0115.m459(f53short, 359, 11, 2368)) || lowerCase.contains(C0142.m567(f53short, 370, 10, 1956)) || lowerCase.contains(C0044.m175(f53short, 380, 14, 544)) || lowerCase.contains(C0092.m365(f53short, 394, 14, 2687)) || lowerCase.contains(C0063.m249(f53short, 408, 12, 1595)) || lowerCase.contains(C0135.m539(f53short, 420, 25, 2253)) || (lowerCase.contains(C0117.m467(f53short, 445, 7, 2997)) && lowerCase.contains(C0106.m422(f53short, 452, 9, 906)) && !lowerCase.contains(C0079.m314(f53short, 461, 6, 3137)) && !lowerCase.contains(C0135.m539(f53short, 467, 8, 2148)));
    }

    public static boolean g() {
        String strO = FishCrypto.o();
        if (!strO.isEmpty()) {
            if (C0008.m31(f53short, 480, 7, 3251).equals(new JSONObject(strO).optString(C0021.m83(f53short, 475, 5, 1053)))) {
                return true;
            }
        }
        return false;
    }

    public static InitOrigin get() {
        return Loader.a;
    }

    public static Activity getActivity() {
        Activity activity = f;
        if (activity != null) {
            return activity;
        }
        Class<?> cls = Class.forName(C0011.m42(f53short, 487, 26, 2605));
        Object objInvoke = cls.getMethod(C0006.m21(f53short, 513, 21, 1200), null).invoke(null, null);
        Field declaredField = cls.getDeclaredField(C0103.m408(f53short, 534, 11, 1568));
        declaredField.setAccessible(true);
        for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField(C0049.m193(f53short, 545, 6, 770));
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField(C0073.m288(f53short, 551, 8, 1698));
                declaredField3.setAccessible(true);
                return (Activity) declaredField3.get(obj);
            }
        }
        return null;
    }

    public static void h(String str) {
        boolean z2 = FishCrypto.a;
        if (!z2) {
            e = str;
        }
        if (!z2) {
            synchronized (FishCrypto.class) {
                try {
                    if (!FishCrypto.a) {
                        if (str == null || str.isEmpty()) {
                            FishCrypto.b = C0008.m31(f53short, 559, 13, 2066);
                        } else {
                            try {
                                FishCrypto.b = "";
                                FishNative.loadAndRegister(str);
                                FishCrypto.a = true;
                            } catch (Throwable th) {
                                C0276m0.h(str);
                                FishCrypto.b = FishCrypto.h(th);
                            }
                        }
                        StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(str, C0019.m75(f53short, 572, 1, 457));
                        sbP.append(FishCrypto.b == null ? "" : FishCrypto.b);
                        onSoLoadFailed(sbP.toString());
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        SpiderDebug.log(C0053.m210(f53short, 573, 12, 2896));
        l();
    }

    public static boolean hasForegroundActivity() {
        return f != null;
    }

    public static boolean hasStoragePermission() {
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return true;
            }
            Activity activity = getActivity();
            return activity != null && AbstractC0270k0.a(activity) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void i(Throwable th) {
        try {
            SpiderDebug.log(C0073.m288(f53short, 585, 26, 968) + th.getClass().getSimpleName() + C0114.m454(f53short, 611, 2, 1048) + th.getMessage());
        } catch (Throwable unused) {
        }
    }

    public static void init(Context context) {
        Application applicationA = a(context);
        if (applicationA == null) {
            return;
        }
        get().d = applicationA;
        synchronized (InitOrigin.class) {
            if (!g) {
                try {
                    applicationA.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.github.catvod.spider.InitOrigin.2
                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityCreated(Activity activity, Bundle bundle) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityDestroyed(Activity activity) {
                            AlertDialog alertDialog;
                            if (P1.r == activity && (alertDialog = P1.q) != null) {
                                P1.q = null;
                                P1.r = null;
                                P1.p = -1L;
                                try {
                                    alertDialog.dismiss();
                                } catch (Throwable unused) {
                                }
                            }
                            if (InitOrigin.f == activity) {
                                InitOrigin.f = null;
                            }
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityPaused(Activity activity) {
                            if (InitOrigin.f == activity) {
                                InitOrigin.f = null;
                            }
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityResumed(Activity activity) {
                            InitOrigin.f = activity;
                            AbstractC0302v0.P0(activity);
                            InitOrigin.r(true);
                            InitOrigin.resumeProtectedTasks();
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityStarted(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityStopped(Activity activity) {
                            if (activity == null || !k2.o()) {
                                return;
                            }
                            k2.y();
                        }
                    });
                    g = true;
                    Activity activity = getActivity();
                    if (activity != null) {
                        f = activity;
                        AbstractC0302v0.P0(activity);
                        r(true);
                        resumeProtectedTasks();
                    }
                } catch (Throwable unused) {
                }
            }
        }
        Proxy.init();
    }

    public static void initSafe(Context context) {
        d(context, null);
    }

    public static void initSafe(Context context, String str) {
        d(context, str);
    }

    public static void j() {
        synchronized (System.class) {
            System.setProperty(C0046.m182(f53short, 613, 26, 957), C0095.m379(f53short, 639, 4, 2470));
        }
    }

    public static void k() {
        synchronized (System.class) {
            try {
                if (C0074.m292(f53short, 669, 7, 2100).equals(System.getProperty(C0118.m471(f53short, 643, 26, 1844)))) {
                    System.clearProperty(C0019.m75(f53short, 676, 26, 3185));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void l() {
        try {
            if (i || context() == null || Thread.currentThread().isInterrupted() || !FishCrypto.a) {
                b();
                return;
            }
            try {
                if (FishNative.nKilled()) {
                    b();
                    return;
                }
                if (!FishCrypto.i(1, C0117.m467(f53short, 702, 8, 2716))) {
                    if (!j) {
                        SpiderDebug.log(C0006.m21(f53short, 710, 36, 1541));
                        j = true;
                        if (!get().b.postDelayed(k, 1000L)) {
                            j = false;
                            onSoLoadFailed(C0097.m386(f53short, 746, 23, 3102));
                        }
                    }
                    return;
                }
                b();
                Proxy.init();
                N1.A();
                boolean zC = c();
                l = zC;
                i = true;
                try {
                    execute(new RunnableC0315z1(0));
                    r(false);
                    resumeProtectedTasks();
                    if (zC) {
                        j();
                    }
                } catch (Throwable th) {
                    i = false;
                    if (zC) {
                        k();
                    }
                    if (th instanceof RuntimeException) {
                        throw ((RuntimeException) th);
                    }
                    if (!(th instanceof Error)) {
                        throw new RuntimeException(th);
                    }
                    throw ((Error) th);
                }
            } catch (Throwable th2) {
                b();
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                if (!(th2 instanceof Error)) {
                    throw new RuntimeException(th2);
                }
                throw ((Error) th2);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static void m(int i2) {
        synchronized (m) {
            if (!u && q > 0) {
                u = true;
                try {
                    execute(new T1(i2, 2));
                } catch (Throwable th) {
                    synchronized (m) {
                        try {
                            u = false;
                            if (i2 != 0 && i2 == p) {
                                q = 0;
                            }
                            i(th);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public static void n() {
        if (FishCrypto.hostAllowed() && FishCrypto.k()) {
            y.set(true);
            AtomicBoolean atomicBoolean = x;
            if (atomicBoolean.compareAndSet(false, true)) {
                try {
                    execute(new A(2));
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    i(th);
                }
            }
        }
    }

    public static void o() {
        synchronized (m) {
            if (!s && SystemClock.elapsedRealtime() >= t) {
                s = true;
                t = SystemClock.elapsedRealtime() + 5000;
                try {
                    execute(new RunnableC0460l(28));
                } catch (Throwable th) {
                    synchronized (m) {
                        s = false;
                        t = 0L;
                        i(th);
                    }
                }
            }
        }
    }

    public static void onSoLoadFailed(String str) {
        SpiderDebug.log(C0079.m314(f53short, 769, 34, 1824) + str);
    }

    public static void p(int i2) {
        int i3;
        if (i2 > 0) {
            try {
                if (context() != null && FishCrypto.a && g()) {
                    synchronized (m) {
                        try {
                            int i4 = p;
                            if (i2 == i4 && !u && q == 0) {
                                i3 = i4 + 1;
                                p = i3;
                                q = 1;
                            } else {
                                i3 = 0;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (i3 != 0) {
                        m(i3);
                    }
                }
            } catch (Throwable th2) {
                i(th2);
            }
        }
        try {
            N1.P();
        } catch (NoSuchMethodError unused) {
        } catch (Throwable th3) {
            i(th3);
        }
    }

    public static void q(Runnable runnable) {
        try {
            if (FishCrypto.hostAllowed() && FishCrypto.k()) {
                runnable.run();
            }
        } catch (Throwable th) {
            i(th);
        }
    }

    public static boolean r(boolean z2) {
        synchronized (m) {
            if (z2) {
                try {
                    if (!n) {
                        n = true;
                        o = (u || q != 0) ? -1 : p;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!h.compareAndSet(false, true)) {
                return false;
            }
            try {
                execute(new A(5));
                return true;
            } catch (Throwable th2) {
                synchronized (m) {
                    n = false;
                    h.set(false);
                    i(th2);
                    return false;
                }
            }
        }
    }

    public static String randomKey(int i2) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            double dRandom = Math.random();
            double d = 62;
            Double.isNaN(d);
            sb.append(C0116.m463(f53short, 803, 62, 2018).charAt((int) Math.floor(dRandom * d)));
        }
        return sb.toString();
    }

    public static void refreshHostIdentity() {
        if (context() == null || !FishCrypto.a) {
            return;
        }
        synchronized (m) {
            p++;
            q = 2;
            get().b.removeCallbacks(v);
        }
        m(0);
    }

    public static void requestBusinessRecovery() {
        if (context() == null) {
            return;
        }
        if (!FishCrypto.a) {
            o();
            return;
        }
        String strOptString = "";
        try {
            strOptString = new JSONObject(FishCrypto.o()).optString(C0106.m422(f53short, 865, 12, 2016));
        } catch (Throwable unused) {
        }
        if (C0089.m355(f53short, 877, 16, 1985).equals(strOptString) || strOptString.isEmpty()) {
            synchronized (m) {
                try {
                    if (!u && q == 0 && SystemClock.elapsedRealtime() >= r) {
                        r = SystemClock.elapsedRealtime() + 5000;
                        p++;
                        q = 2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m(0);
        }
        N1.d0();
    }

    public static void resumeProtectedTasks() {
        if (i && context() != null && FishCrypto.a) {
            synchronized (m) {
                Handler handler = get().b;
                A a = w;
                handler.removeCallbacks(a);
                get().b.post(a);
            }
        }
    }

    public static void run(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        get().b.post(new B(runnable, 1));
    }

    public static void run(Runnable runnable, int i2) {
        if (runnable == null) {
            return;
        }
        get().b.postDelayed(new B(runnable, 1), i2);
    }

    public static boolean schedule(Runnable runnable, long j2) {
        if (runnable == null) {
            return false;
        }
        try {
            return get().b.postDelayed(new B(runnable, 1), Math.min(Math.max(0L, j2), Long.MAX_VALUE - SystemClock.uptimeMillis()));
        } catch (Throwable th) {
            i(th);
            return false;
        }
    }
}
