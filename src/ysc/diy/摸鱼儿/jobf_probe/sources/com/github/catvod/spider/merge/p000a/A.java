package com.github.catvod.spider.merge.p000a;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.github.catvod.spider.C0141;
import com.github.catvod.spider.merge.A.C0002;
import com.github.catvod.spider.merge.A.RunnableC0305w0;
import com.github.catvod.spider.merge.B.C0005;
import com.github.catvod.spider.merge.D.C0007;
import com.github.catvod.spider.merge.E.C0013;
import com.github.catvod.spider.merge.E.C0015;
import com.github.catvod.spider.merge.G.C0020;
import com.github.catvod.spider.merge.G.C0022;
import com.github.catvod.spider.merge.G.C0023;
import com.github.catvod.spider.merge.I.C0025;
import com.github.catvod.spider.merge.K.C0029;
import com.github.catvod.spider.merge.L.C0031;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.N.C0035;
import com.github.catvod.spider.merge.N.C0036;
import com.github.catvod.spider.merge.N.C0037;
import com.github.catvod.spider.merge.O.C0038;
import com.github.catvod.spider.merge.O.C0039;
import com.github.catvod.spider.merge.Q.C0041;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.T.C0048;
import com.github.catvod.spider.merge.X.C0051;
import com.github.catvod.spider.merge.X.C0052;
import com.github.catvod.spider.merge.b0.C0060;
import com.github.catvod.spider.merge.b0.C0061;
import com.github.catvod.spider.merge.c0.C0065;
import com.github.catvod.spider.merge.e0.C0075;
import com.github.catvod.spider.merge.f0.C0077;
import com.github.catvod.spider.merge.f0.C0078;
import com.github.catvod.spider.merge.f0.C0080;
import com.github.catvod.spider.merge.h0.C0086;
import com.github.catvod.spider.merge.k0.C0099;
import com.github.catvod.spider.merge.p0.C0110;
import com.github.catvod.spider.merge.p0.C0111;
import com.github.catvod.spider.merge.p001b.C0058;
import com.github.catvod.spider.merge.p003d.C0066;
import com.github.catvod.spider.merge.p003d.C0067;
import com.github.catvod.spider.merge.p004e.C0071;
import com.github.catvod.spider.merge.p005f.p;
import com.github.catvod.spider.merge.p005f.x;
import com.github.catvod.spider.merge.p007h.C0084;
import com.github.catvod.spider.merge.p008i.C0088;
import com.github.catvod.spider.merge.p013o.C0108;
import com.github.catvod.spider.merge.p017u.B;
import com.github.catvod.spider.merge.p017u.C0127;
import com.github.catvod.spider.merge.p017u.C0129;
import com.github.catvod.spider.merge.p017u.CallableC0455g;
import com.github.catvod.spider.merge.p018v.C0131;
import com.github.catvod.spider.merge.p018v.C0132;
import com.github.catvod.spider.merge.p019w.C0134;
import com.github.catvod.spider.merge.p020x.C0136;
import com.github.catvod.spider.merge.p020x.C0138;
import com.github.catvod.spider.merge.p022z.RunnableC0543o;
import com.github.catvod.spider.merge.q0.C0113;
import com.github.catvod.spider.merge.t0.C0123;
import com.github.catvod.spider.merge.t0.C0124;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import moyu.fucking.C0147;
import moyu.fucking.C0149;
import moyu.fucking.C0150;
import moyu.fucking.C0151;
import moyu.fucking.C0152;
import moyu.fucking.C0153;
import moyu.fucking.C0154;
import moyu.fucking.C0155;
import moyu.fucking.C0157;
import moyu.fucking.C0162;
import moyu.fucking.C0163;
import moyu.fucking.C0168;
import moyu.fucking.C0170;
import moyu.fucking.C0174;
import moyu.fucking.C0175;
import moyu.fucking.C0176;
import moyu.fucking.C0177;
import moyu.fucking.C0178;
import moyu.fucking.C0179;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0186;
import moyu.fucking.C0187;
import moyu.fucking.C0188;
import moyu.fucking.C0189;
import moyu.fucking.C0191;
import moyu.fucking.C0195;
import moyu.fucking.C0197;
import moyu.fucking.C0198;
import moyu.fucking.C0201;
import moyu.fucking.C0203;
import moyu.fucking.C0204;
import moyu.fucking.C0205;
import moyu.fucking.C0216;
import moyu.fucking.C0219;
import moyu.fucking.C0221;
import moyu.fucking.C0224;
import moyu.fucking.C0226;
import moyu.fucking.C0228;
import moyu.fucking.C0233;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class A {
    public static final int p = 0;
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public int i;
    public boolean j;
    public final ArrayList k;
    public ScheduledExecutorService l;
    public final AtomicLong m;
    public long n;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f212short = {2937, 2934, 2940, 2922, 2935, 2929, 2940, 2870, 2929, 2934, 2924, 2941, 2934, 2924, 2870, 2937, 2939, 2924, 2929, 2935, 2934, 2870, 2894, 2897, 2909, 2895, 2881, 2883, 2843, 2897, 2900, 2907, 2904, 2900, 2910, 2880, 2843, 2903, 2908, 2905, 2908, 2843, 2880, 2908, 2843, 2908, 2907, 2881, 2896, 2907, 2881, 2843, 2940, 2907, 2881, 2896, 2907, 2881, 2941, 2900, 2907, 2897, 2905, 2896, 2887, 2932, 2902, 2881, 2908, 2883, 2908, 2881, 2892, 2352, 2354, 2410, 2336, 2341, 2346, 2345, 2341, 2351, 2353, 2410, 2342, 2349, 2344, 2349, 2073, 2069, 2071, 2132, 2072, 2067, 2070, 2067, 2072, 2067, 2070, 2067, 2132, 2075, 2058, 2058, 2132, 2067, 2068, 20968, 22846, -32403, 3160, 30403, 3163, 3178, 3178, -3306, -30739, 23346, 3163, 3178, 3178, 23967, 29812, -30786, 31329, 21327, 3034, 3052, 3069, 2980, 3018, 3046, 3046, 3042, 3040, 3052, 2715, 2688, 24594, 28995, 22637, 28582, 27181, 24151, -30141, 22011, 32370, 22364, 2799, 2805, 2495, 2500, 20664, 18053, 24007, 2498, 2148, 2114, 2132, 2115, 2076, 2160, 2134, 2132, 2143, 2117, 1503, 1533, 1512, 1531, 1534, 1534, 1523, 1469, 1447, 1468, 1442, 1458, 1466, 1477, 1531, 1532, 1526, 1533, 1509, 1505, 1458, 1500, 1478, 1458, 1443, 1442, 1468, 1442, 1449, 1458, 1477, 1531, 1532, 1444, 1446, 1449, 1458, 1514, 1444, 1446, 1467, 1458, 1491, 1506, 1506, 1534, 1527, 1477, 1527, 1520, 1497, 1531, 1510, 1469, 1447, 1441, 1445, 1468, 1441, 1444, 1458, 1466, 1497, 1498, 1478, 1503, 1502, 1470, 1458, 1534, 1531, 1529, 1527, 1458, 1493, 1527, 1521, 1529, 1533, 1467, 1458, 1489, 1530, 1504, 1533, 1535, 1527, 1469, 1443, 1447, 1443, 1468, 1442, 1468, 1442, 1468, 1442, 1458, 1473, 1523, 1524, 1523, 1504, 1531, 1469, 1447, 1441, 1445, 1468, 1441, 1444, 1548, 1595, 1592, 1595, 1580, 1595, 1580, 1858, 1886, 1886, 1882, 1881, 1808, 1797, 1797, 1885, 1885, 1885, 1796, 1864, 1859, 1862, 1859, 1864, 1859, 1862, 1859, 1796, 1865, 1861, 1863, 1174, 1210, 1210, 1214, 1212, 1200, 1975, 1953, 1975, 1975, 1952, 1957, 1968, 1957, 1721, 2560, 2582, 2560, 2560, 2583, 2578, 2567, 2578, 2670, 2550, 2547, 2534, 2547, 2985, 2995, 2956, 2991, 2983, 2985, 2990, 780, 31127, -29080, 20665, 22403, 24026, 31860, 24415, 25979, 31422, 24920, -29080, 20665, 27465, -30584, 433, 420, 431, 409, 431, 427, 417, 1839, 1835, 1825, 1817, 1843, 1844, 1834, 3164, 3162, 3149, 3184, 3162, 3165, 3139, 1209, 32290, -30243, 22284, 20534, 23151, 31681, 22762, 1243, 1196, 1209, 1202, 1243, 24492, 28494, 2742, 28717, -30766, 22787, 24121, 21600, 30158, 22245, 28548, 27034, 2283, 29296, -31345, 23390, 23652, 22077, 18067, 29395, 1521, 1501, 1500, 1478, 1495, 1500, 1478, 1439, 1527, 1500, 1489, 1501, 1494, 1499, 1500, 1493, 546, 547, 544, 554, 551, 562, 547, 28747, 22885, 21245, 22692, -30217, 24343, 3230, 2480, 2475, 1233, 857, 859, 848, 859, 844, 863, 842, 859, 928, 959, 956, 956, 1960, 1972, 1972, 1968, 1971, 2042, 2031, 2031, 1968, 1953, 1971, 1971, 1968, 1967, 1970, 1972, 2030, 1954, 1961, 1964, 1961, 1954, 1961, 1964, 1961, 2030, 1955, 1967, 1965, 2031, 1976, 2031, 1968, 1953, 1971, 1971, 1968, 1967, 1970, 1972, 2029, 1964, 1967, 1959, 1961, 1966, 2031, 1975, 1957, 1954, 2031, 1969, 1970, 1955, 1967, 1956, 1957, 2031, 903, 900, 917, 921, 914, 915, 937, 925, 915, 911, 873, 869, 877, 874, 809, 873, 877, 874, 877, 3296, 3308, 3300, 3299, 3282, 3296, 3300, 3299, 3300, 259, 287, 261, 258, 275, 277, 2661, 2627, 2645, 2626, 2589, 2673, 2647, 2645, 2654, 2628, 2360, 2330, 2319, 2332, 2329, 2329, 2324, 2394, 2368, 2395, 2373, 2389, 2397, 2338, 2332, 2331, 2321, 2330, 2306, 2310, 2389, 2363, 2337, 2389, 2372, 2373, 2395, 2373, 2382, 2389, 2338, 2332, 2331, 2371, 2369, 2382, 2389, 2317, 2371, 2369, 2396, 2389, 2356, 2309, 2309, 2329, 2320, 2338, 2320, 2327, 2366, 2332, 2305, 2394, 2368, 2374, 2370, 2395, 2374, 2371, 2389, 2397, 2366, 2365, 2337, 2360, 2361, 2393, 2389, 2329, 2332, 2334, 2320, 2389, 2354, 2320, 2326, 2334, 2330, 2396, 2389, 2358, 2333, 2311, 2330, 2328, 2320, 2394, 2372, 2368, 2372, 2395, 2373, 2395, 2373, 2395, 2373, 2389, 2342, 2324, 2323, 2324, 2311, 2332, 2394, 2368, 2374, 2370, 2395, 2374, 2371, -32473, 20806, 19484, 31844, 31377, 23457, -28747, -612, -30361, 30877, 22174, -27811, -30395, 1162, 1167, 1178, 1167, 3091, 3094, 3075, 3094, 2000, 2005, 1984, 2005, 2131, 2132, 2122, 2264, 2271, 2241, 1311, 1308, 1293, 1281, 1290, 1291, 1329, 1285, 1291, 1303, 619, 616, 633, 629, 638, 639, 581, 625, 639, 611, 28254, -30327, 23632, -31741, 2358, 29613, 2357, 2308, 2308, -2440, 21638, 28490, 28750, 28248, -31206, 18424, 30592, 29045, 23651, 23646, 23651, 23646, -29255, 18737, 29542, 21146, 21159, 21146, 21159, 1551, 1598, 1598, 25637, 32335, 28725, 22811, -31003, 22148, 19422, 31654, 32083, 23651, -30601, -1464, 20895, 23494, 31336, 22851, 19422, 31654, 32083, 24069, 28391, -29840, 23313, 17995, 30259, 28870, -31952, 25733, 20982, -31262, -2101, -31952, 29386, 23753, -26358, -31982, 1375, 1347, 1347, 1351, 1348, 1293, 1304, 1304, 1344, 1344, 1344, 1305, 1365, 1374, 1371, 1374, 1365, 1374, 1371, 1374, 1305, 1364, 1368, 1370, 535, 523, 523, 527, 524, 581, 592, 592, 542, 527, 534, 593, 541, 534, 531, 534, 541, 534, 531, 534, 593, 540, 528, 530, 592, 519, 592, 520, 538, 541, 594, 534, 529, 523, 538, 525, 537, 542, 540, 538, 592, 529, 542, 521, 1432, 1427, 1430, 1427, 1143, 1148, 1145, 1148, 2844, 2839, 2834, 2839, 2211, 2228, 2225, 2261, 2295, 2224, 2263, 2296, 2209, 2210, 2211, 2228, 2225, 2264, 2254, 2264, 2264, 2255, 2250, 2271, 2250, 2295, 2281, 2274, 2279, 2274, 2260, 2273, 2280, 2303, 2295, 2255, 2286, 2287, 2286, 2270, 2296, 2286, 2297, 2242, 2255, 2295, 2255, 2286, 2287, 2286, 2270, 2296, 2286, 2297, 2242, 2255, 2260, 2260, 2280, 2272, 2246, 2287, 2238, 2295, 2296, 2274, 2287, 2210, 2230, 2256, 2261, 2224, 2262, 2209, 665, 654, 653, 658, 671, 712, 710, 3277, 3274, 3266, 3275, 3271, 1988, 2015, 1949, 1952, 1937, 1930, 1931, 1986, 367, 372, 279, 257, 262, 262, 273, 282, 256, 267, 274, 282, 258, 277, 280, 361, 352, 356, 352, 364, 2021, 2041, 2041, 2045, 2046, 1975, 1954, 1954, 2028, 2045, 2020, 1955, 2031, 2020, 2017, 2020, 2031, 2020, 2017, 2020, 1955, 
    2030, 2018, 2016, 1954, 2037, 1954, 2042, 2024, 2031, 1952, 2020, 2019, 2041, 2024, 2047, 2027, 2028, 2030, 2024, 1954, 2019, 2028, 2043, 847, 31188, 30070, 23640, 29115, 25356, -30470, 28495, 23100, -29144, 2554, 2552, 2541, 2556, 2558, 2550, 2539, 2544, 2556, 2538, 407, 404, 412, 402, 405, 427, 393, 404, 406, 395, 399, 447, 402, 392, 410, 409, 407, 414, 415, 3087, 3088, 3100, 3086, 3124, 3094, 3101, 3100, 1683, 1687, 1690, 2055, 2054, 2069, 2058, 2048, 2054, 2080, 2060, 2060, 2056, 2058, 2054, 2254, 2248, 2270, 2249, 2261, 2266, 2262, 2270, 1409, 1430, 1429, 1409, 1430, 1408, 1435, 1447, 1436, 1432, 1430, 1437, 2575, 2563, 2563, 2567, 2565, 2569, 1557, 1625, 1618, 1623, 1618, 1625, 1618, 1623, 1618, 1636, 1624, 1620, 1620, 1616, 1618, 1630, 2594, 2684, 2687, 2670, 2658, 2665, 2664, 2594, 2685, 2658, 2657, 2657, 29564, 23122, 22773, 31700, 25176, 26385, -28944, 26949, -30590, 24817, 272, 283, 286, 283, 1909, 1911, 1890, 1907, 1905, 1913, 1892, 1919, 1907, 1893, 1695, 1664, 1676, 1694, 1700, 1670, 1677, 1676, 1614, 1538, 1545, 1548, 1545, 1538, 1545, 1548, 1545, 1599, 1539, 1551, 1551, 1547, 1545, 1541, 1685, 1689, 1689, 1693, 1695, 1683, 2076, 2059, 2056, 2076, 2059, 2077, 2054, 2106, 2049, 2053, 2059, 2048, 848, 854, 832, 855, 843, 836, 840, 832, 848, 849, 834, 861, 855, 849, 887, 859, 859, 863, 861, 849, 478, 474, 471, 2203, 2200, 2192, 2206, 2201, 2215, 2181, 2200, 2202, 2183, 2179, 2227, 2206, 2180, 2198, 2197, 2203, 2194, 2195};
    public static final long o = ((Long) C0150.n(77507, (TimeUnit) C0226.n(31466), new Object[]{Long.valueOf(527 ^ ((long) C0023.f179))})).longValue();

    public A(int i) throws Throwable {
        String str = (String) C0195.n(43185);
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.i = 1;
        this.j = false;
        this.k = new ArrayList();
        this.m = new AtomicLong();
        this.n = 0L;
        C0174.n(43443, this, new Object[0]);
        int iIntValue = ((Integer) C0188.n(27153, null, new Object[0])).intValue();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (iIntValue <= 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    C0162.n(83524, (PrintStream) C0195.n(72538), new Object[]{Long.valueOf(((Long) C0162.n(73560, null, new Object[]{(String) C0168.n(44870, null, new Object[]{(String) C0174.n(38706)})})).longValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x01c2. Please report as an issue. */
    public static boolean E(String str) throws Throwable {
        Uri uri = (Uri) C0163.n(81590, null, new Object[]{str});
        String str2 = (String) C0162.n(13243, null, new Object[]{(short[]) C0174.n(86055), 0, Integer.valueOf(C0127.f336 ^ (-981)), 2840});
        Intent intent = new Intent(str2, uri);
        String str3 = (String) C0224.n(31189, null, new Object[]{(short[]) C0174.n(86055), 26, Integer.valueOf(C0058.f267 ^ 72), 2869});
        String str4 = (String) C0198.n(68788, null, new Object[]{(short[]) C0174.n(86055), 73, Integer.valueOf(C0002.f158 ^ 522), 2372});
        Intent intent2 = (Intent) C0174.n(33543, intent, new Object[]{str4, str3});
        Intent intent3 = (Intent) C0174.n(65307, new Intent(str2, uri), new Object[]{str4});
        Intent intent4 = (Intent) C0174.n(65307, new Intent(str2, uri), new Object[]{(String) C0224.n(58480, null, new Object[]{(short[]) C0174.n(86055), 88, Integer.valueOf(C0031.f187 ^ (-627)), 2170})});
        int i = 0;
        while (true) {
            int i2 = i;
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                        break;
                    case 49:
                        i3 = i2 < 3 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        return false;
                    default:
                        break;
                }
            }
            Intent intent5 = new Intent[]{intent2, intent3, intent4}[i2];
            try {
                C0163.n(31874, (Application) C0149.n(10590, null, new Object[0]), new Object[]{intent5});
                C0188.n(1950, null, new Object[]{(String) C0195.n(19148, null, new Object[]{(short[]) C0174.n(86055), 107, Integer.valueOf(C0005.f161 ^ 658), 3098})});
                return true;
            } catch (Exception e) {
                i = (i2 - 31) + 1 + 31;
                int i4 = 1740;
                while (true) {
                    i4 ^= 1757;
                    switch (i4) {
                        case 17:
                            i4 = 1771;
                            break;
                        case 54:
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0059, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x006e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x0138. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x016d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:77:0x01aa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x0244. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(java.util.Map r13) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p000a.A.e(java.util.Map):java.lang.String");
    }

    public static String i(p pVar, boolean z) {
        String str;
        String str2;
        String str3 = (String) C0198.n(30759, null, new Object[]{(short[]) C0174.n(86055), 138, Integer.valueOf(C0141.f351 ^ (-782)), 1848});
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (pVar == null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (z) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return str3;
                            case 500:
                                return (String) C0162.n(68576, null, new Object[]{(short[]) C0174.n(86055), 141, Integer.valueOf(C0051.f207 ^ (-374)), 1894});
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    boolean zBooleanValue = ((Boolean) C0174.n(51401, pVar, new Object[0])).booleanValue();
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                if (!zBooleanValue) {
                                    i3 = 48736;
                                }
                                break;
                            case 47384:
                                String str4 = (String) C0174.n(21569, pVar, new Object[0]);
                                StringBuilder sb = new StringBuilder((String) C0224.n(67549, null, new Object[]{(short[]) C0174.n(86055), 145, Integer.valueOf(C0052.f208 ^ (-120)), 2057}));
                                boolean zBooleanValue2 = ((Boolean) C0195.n(41159, null, new Object[]{str4})).booleanValue();
                                String str5 = (String) C0195.n(43185);
                                int i4 = 48767;
                                while (true) {
                                    i4 ^= 48784;
                                    switch (i4) {
                                        case 14:
                                            break;
                                        case 45:
                                            str = (String) C0205.n(88575, null, new Object[]{(String) C0149.n(74485, null, new Object[]{(short[]) C0174.n(86055), 148, Integer.valueOf(C0088.f297 ^ 489), 2773}), str4});
                                            break;
                                        case 76:
                                            int i5 = 48891;
                                            while (true) {
                                                i5 ^= 48908;
                                                switch (i5) {
                                                    case 22:
                                                        str = str5;
                                                        break;
                                                    case 503:
                                                        i5 = 48922;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 239:
                                            i4 = zBooleanValue2 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                boolean zBooleanValue3 = ((Boolean) C0174.n(99728, pVar, new Object[0])).booleanValue();
                                int i6 = 49666;
                                while (true) {
                                    i6 ^= 49683;
                                    switch (i6) {
                                        case 17:
                                            if (zBooleanValue3) {
                                                i6 = 49759;
                                            }
                                            break;
                                        case 50:
                                            break;
                                        case 76:
                                            str2 = (String) C0162.n(41206, null, new Object[]{(short[]) C0174.n(86055), 150, Integer.valueOf(C0086.f295 ^ (-341)), 2463});
                                            break;
                                        case 83:
                                            str2 = str5;
                                            break;
                                        default:
                                            continue;
                                    }
                                    i6 = 49728;
                                }
                                return (String) C0198.n(89992, sb, new Object[0]);
                            case 47417:
                                return str3;
                            case 47483:
                                break;
                            default:
                                continue;
                        }
                        i3 = 48705;
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static A j() {
        return (A) C0174.n(59652);
    }

    public static HashMap l(String str) throws Throwable {
        HashMap map = (HashMap) C0189.n(75940, null, new Object[]{(String) C0162.n(83354, null, new Object[]{(short[]) C0174.n(86055), 156, Integer.valueOf(C0041.f197 ^ (-46)), 2097}), (String) C0152.n(39710, null, new Object[]{(short[]) C0174.n(86055), 166, Integer.valueOf(C0113.f322 ^ 58), 1426}), (String) C0178.n(80760, null, new Object[]{(short[]) C0174.n(86055), 277, Integer.valueOf(C0086.f295 ^ (-342)), 1630}), (String) C0198.n(88124, null, new Object[]{(short[]) C0174.n(86055), 284, Integer.valueOf(C0088.f297 ^ 499), 1834})});
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (str == null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    str = (String) C0195.n(43185);
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
        C0155.n(50765, map, new Object[]{(String) C0224.n(31189, null, new Object[]{(short[]) C0174.n(86055), 308, Integer.valueOf(C0061.f270 ^ (-924)), 1237}), str});
        return map;
    }

    public static boolean p(String str) {
        boolean zBooleanValue = ((Boolean) C0195.n(41159, null, new Object[]{str})).booleanValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!zBooleanValue) {
                        i = 1709;
                    }
                    break;
                case 204:
                    boolean zBooleanValue2 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0149.n(36390, null, new Object[]{(short[]) C0174.n(86055), 314, Integer.valueOf(C0037.f193 ^ 804), 2020})})).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (zBooleanValue2) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                String[] strArr = (String[]) C0224.n(71204, str, new Object[]{(String) C0157.n(97123, null, new Object[]{(short[]) C0174.n(86055), 322, 1, 1666})});
                                int length = strArr.length;
                                int i3 = 0;
                                while (true) {
                                    int i4 = 48767;
                                    while (true) {
                                        i4 ^= 48784;
                                        switch (i4) {
                                            case 14:
                                                break;
                                            case 45:
                                                return false;
                                            case 76:
                                                break;
                                            case 239:
                                                i4 = i3 < length ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    String str2 = strArr[i3];
                                    String str3 = (String) C0149.n(92089, str2, new Object[0]);
                                    String str4 = (String) C0181.n(92093, null, new Object[]{(short[]) C0174.n(86055), 323, Integer.valueOf(C0035.f191 ^ 309), 2643});
                                    boolean zBooleanValue3 = ((Boolean) C0149.n(48208, str3, new Object[]{str4})).booleanValue();
                                    int i5 = 48891;
                                    while (true) {
                                        i5 ^= 48908;
                                        switch (i5) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                i5 = zBooleanValue3 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                int iIntValue = ((Integer) C0149.n(89092, (String) C0149.n(92089, str2, new Object[0]), new Object[0])).intValue();
                                                int iIntValue2 = ((Integer) C0149.n(89092, str4, new Object[0])).intValue();
                                                int i6 = 49666;
                                                while (true) {
                                                    i6 ^= 49683;
                                                    switch (i6) {
                                                        case 17:
                                                            i6 = iIntValue > iIntValue2 ? 49759 : 49728;
                                                            break;
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            return true;
                                                        case 83:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    int i7 = (C0020.f176 ^ (-568)) + i3;
                                    int i8 = 49790;
                                    while (true) {
                                        i8 ^= 49807;
                                        switch (i8) {
                                            case 18:
                                                break;
                                            case 241:
                                                i8 = 49821;
                                                break;
                                        }
                                    }
                                    i3 = i7;
                                }
                                break;
                            case 500:
                                int i9 = 1864;
                                while (true) {
                                    i9 ^= 1881;
                                    switch (i9) {
                                        case 17:
                                            i9 = 48674;
                                            break;
                                        case 47483:
                                            return false;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    return false;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static p s(String str) {
        JsonObject jsonObject = (JsonObject) C0174.n(3898, null, new Object[]{str});
        x xVar = (x) C0174.n(77096, null, new Object[]{str});
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (xVar != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    int iIntValue = ((Integer) C0174.n(72618, xVar, new Object[0])).intValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (iIntValue == -101) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                String str2 = (String) C0198.n(14698, null, new Object[]{(short[]) C0174.n(86055), 332, Integer.valueOf(C0129.f338 ^ 918), 2450});
                                boolean zBooleanValue = ((Boolean) C0174.n(5787, jsonObject, new Object[]{str2})).booleanValue();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = zBooleanValue ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zBooleanValue2 = ((Boolean) C0170.n(91346, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str2}), new Object[0])).booleanValue();
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        p pVar = (p) C0170.n(56712, xVar, new Object[0]);
                                                        boolean zBooleanValue3 = ((Boolean) C0174.n(51401, pVar, new Object[0])).booleanValue();
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    JsonObject jsonObject2 = (JsonObject) C0170.n(64018, (JsonObject) C0170.n(64018, jsonObject, new Object[]{str2}), new Object[]{(String) C0152.n(39710, null, new Object[]{(short[]) C0174.n(86055), 358, Integer.valueOf(C0071.f280 ^ 40), 454})});
                                                                    int i6 = 51588;
                                                                    while (true) {
                                                                        i6 ^= 51605;
                                                                        switch (i6) {
                                                                            case 17:
                                                                                i6 = jsonObject2 != null ? 51681 : 51650;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 87:
                                                                                break;
                                                                            case 116:
                                                                                String str3 = (String) C0162.n(29890, null, new Object[]{(short[]) C0174.n(86055), 365, Integer.valueOf(C0110.f319 ^ (-549)), 1862});
                                                                                boolean zBooleanValue4 = ((Boolean) C0174.n(5787, jsonObject2, new Object[]{str3})).booleanValue();
                                                                                int i7 = 51712;
                                                                                while (true) {
                                                                                    i7 ^= 51729;
                                                                                    switch (i7) {
                                                                                        case 14:
                                                                                            break;
                                                                                        case 17:
                                                                                            if (zBooleanValue4) {
                                                                                                i7 = 51805;
                                                                                            }
                                                                                            break;
                                                                                        case 47:
                                                                                            break;
                                                                                        case 76:
                                                                                            boolean zBooleanValue5 = ((Boolean) C0170.n(30103, (JsonElement) C0174.n(61056, jsonObject2, new Object[]{str3}), new Object[0])).booleanValue();
                                                                                            int i8 = 51836;
                                                                                            while (true) {
                                                                                                i8 ^= 51853;
                                                                                                switch (i8) {
                                                                                                    case 241:
                                                                                                        if (zBooleanValue5) {
                                                                                                            i8 = 52580;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1963:
                                                                                                        break;
                                                                                                    case 1992:
                                                                                                        break;
                                                                                                    case 2025:
                                                                                                        String str4 = (String) C0198.n(98419, null, new Object[]{(short[]) C0174.n(86055), 372, Integer.valueOf(C0086.f295 ^ (-342)), 3119});
                                                                                                        boolean zBooleanValue6 = ((Boolean) C0174.n(5787, jsonObject2, new Object[]{str4})).booleanValue();
                                                                                                        int i9 = 52611;
                                                                                                        while (true) {
                                                                                                            i9 ^= 52628;
                                                                                                            switch (i9) {
                                                                                                                case 23:
                                                                                                                    if (zBooleanValue6) {
                                                                                                                        i9 = 52704;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 54:
                                                                                                                    break;
                                                                                                                case 85:
                                                                                                                    break;
                                                                                                                case 116:
                                                                                                                    boolean zBooleanValue7 = ((Boolean) C0170.n(30103, (JsonElement) C0174.n(61056, jsonObject2, new Object[]{str4}), new Object[0])).booleanValue();
                                                                                                                    int i10 = 52735;
                                                                                                                    while (true) {
                                                                                                                        i10 ^= 52752;
                                                                                                                        switch (i10) {
                                                                                                                            case 14:
                                                                                                                                break;
                                                                                                                            case 45:
                                                                                                                                break;
                                                                                                                            case 1007:
                                                                                                                                if (zBooleanValue7) {
                                                                                                                                    i10 = 53479;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 7927:
                                                                                                                                return pVar;
                                                                                                                            default:
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                        i10 = 52797;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                            }
                                                                                                            i9 = 52673;
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                                i8 = 52549;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i7 = 51774;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    throw new IllegalStateException((String) C0162.n(83354, null, new Object[]{(short[]) C0174.n(86055), 379, Integer.valueOf(C0015.f171 ^ (-935)), 1275}));
                                                                case 503:
                                                                    if (!zBooleanValue3) {
                                                                        i5 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    JsonObject jsonObject3 = (JsonObject) C0170.n(64018, jsonObject, new Object[]{str2});
                                                                    int iIntValue2 = ((Integer) C0174.n(72618, xVar, new Object[0])).intValue();
                                                                    int i11 = 49666;
                                                                    while (true) {
                                                                        i11 ^= 49683;
                                                                        switch (i11) {
                                                                            case 17:
                                                                                if (iIntValue2 == 0) {
                                                                                    i11 = 49759;
                                                                                }
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case 76:
                                                                                String str5 = (String) C0195.n(19148, null, new Object[]{(short[]) C0174.n(86055), 336, Integer.valueOf(C0042.f198 ^ 60), 3008});
                                                                                boolean zBooleanValue8 = ((Boolean) C0174.n(5787, jsonObject3, new Object[]{str5})).booleanValue();
                                                                                int i12 = 49790;
                                                                                while (true) {
                                                                                    i12 ^= 49807;
                                                                                    switch (i12) {
                                                                                        case 18:
                                                                                            break;
                                                                                        case 51:
                                                                                            break;
                                                                                        case 84:
                                                                                            boolean zBooleanValue9 = ((Boolean) C0170.n(30103, (JsonElement) C0174.n(61056, jsonObject3, new Object[]{str5}), new Object[0])).booleanValue();
                                                                                            int i13 = 49914;
                                                                                            while (true) {
                                                                                                i13 ^= 49931;
                                                                                                switch (i13) {
                                                                                                    case 497:
                                                                                                        if (zBooleanValue9) {
                                                                                                            i13 = 50658;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        break;
                                                                                                    case 1769:
                                                                                                        boolean zBooleanValue10 = ((Boolean) C0170.n(18411, (JsonPrimitive) C0170.n(29452, jsonObject3, new Object[]{str5}), new Object[0])).booleanValue();
                                                                                                        int i14 = 50689;
                                                                                                        while (true) {
                                                                                                            i14 ^= 50706;
                                                                                                            switch (i14) {
                                                                                                                case 19:
                                                                                                                    if (zBooleanValue10) {
                                                                                                                        i14 = 50782;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 45:
                                                                                                                    break;
                                                                                                                case 50:
                                                                                                                    break;
                                                                                                                case 76:
                                                                                                                    boolean zBooleanValue11 = ((Boolean) C0170.n(90259, (JsonElement) C0174.n(61056, jsonObject3, new Object[]{str5}), new Object[0])).booleanValue();
                                                                                                                    int i15 = 50813;
                                                                                                                    while (true) {
                                                                                                                        i15 ^= 50830;
                                                                                                                        switch (i15) {
                                                                                                                            case 18:
                                                                                                                                break;
                                                                                                                            case 53:
                                                                                                                                break;
                                                                                                                            case 243:
                                                                                                                                if (!zBooleanValue11) {
                                                                                                                                    i15 = 51557;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 4075:
                                                                                                                                return new p();
                                                                                                                            default:
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                        i15 = 50875;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                            }
                                                                                                            i14 = 50751;
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                                i13 = 50627;
                                                                                            }
                                                                                            break;
                                                                                        case 241:
                                                                                            if (zBooleanValue8) {
                                                                                                i12 = 49883;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i12 = 49852;
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i11 = 49728;
                                                                    }
                                                                    throw new IllegalStateException((String) C0191.n(93496, null, new Object[]{(short[]) C0174.n(86055), 343, Integer.valueOf(C0013.f169 ^ 656), 846}));
                                                                default:
                                                                    continue;
                                                            }
                                                            i5 = 48953;
                                                        }
                                                        break;
                                                    case 239:
                                                        i4 = zBooleanValue2 ? 48860 : 48829;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                throw new IllegalStateException((String) C0162.n(13243, null, new Object[]{(short[]) C0174.n(86055), 394, Integer.valueOf(C0052.f208 ^ (-127)), 2804}));
                            case 500:
                                return new p();
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    throw new IllegalStateException((String) C0198.n(71923, null, new Object[]{(short[]) C0174.n(86055), 404, Integer.valueOf(C0051.f207 ^ (-378)), 2217}));
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:114:0x0280. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Switch 'out' block B:140:0x0325 for B:149:0x033d already processed. Defaulting to fallback option. */
    public static String u(Response response) throws Throwable {
        InputStream inputStream;
        char c;
        Inflater inflater = null;
        ResponseBody responseBody = (ResponseBody) C0188.n(57688, response, new Object[0]);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (responseBody == null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return (String) C0195.n(43185);
                case 239:
                    InputStream inputStream2 = (InputStream) C0186.n(12789, (ResponseBody) C0188.n(57688, response, new Object[0]), new Object[0]);
                    boolean zBooleanValue = ((Boolean) C0221.n(80323, (String) C0198.n(54030, null, new Object[]{(short[]) C0174.n(86055), 428, Integer.valueOf(C0123.f332 ^ (-145)), 582}), new Object[]{(String) C0170.n(37053, response, new Object[]{(String) C0152.n(85600, null, new Object[]{(short[]) C0174.n(86055), 412, Integer.valueOf(C0052.f208 ^ (-101)), 1458})})})).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = zBooleanValue ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                inputStream = inputStream2;
                                break;
                            case 500:
                                PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream2, C0002.f158 ^ 519);
                                int iIntValue = ((Integer) C0170.n(34116, pushbackInputStream, new Object[0])).intValue();
                                int iIntValue2 = ((Integer) C0170.n(34116, pushbackInputStream, new Object[0])).intValue();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = iIntValue2 >= 0 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            C0170.n(96659, pushbackInputStream, new Object[]{Integer.valueOf(iIntValue2)});
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i4 = 48767;
                                while (true) {
                                    i4 ^= 48784;
                                    switch (i4) {
                                        case 14:
                                            break;
                                        case 45:
                                            break;
                                        case 76:
                                            C0170.n(96659, pushbackInputStream, new Object[]{Integer.valueOf(iIntValue)});
                                            break;
                                        case 239:
                                            i4 = iIntValue >= 0 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i5 = 48891;
                                while (true) {
                                    i5 ^= 48908;
                                    switch (i5) {
                                        case 22:
                                            break;
                                        case 53:
                                            c = 0;
                                            break;
                                        case 503:
                                            i5 = iIntValue >= 0 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            int i6 = 49666;
                                            while (true) {
                                                i6 ^= 49683;
                                                switch (i6) {
                                                    case 17:
                                                        i6 = iIntValue2 >= 0 ? 49759 : 49728;
                                                        break;
                                                    case 50:
                                                        break;
                                                    case 76:
                                                        int i7 = C0066.f275;
                                                        int i8 = 49790;
                                                        while (true) {
                                                            i8 ^= 49807;
                                                            switch (i8) {
                                                                case 18:
                                                                    break;
                                                                case 51:
                                                                    c = 0;
                                                                    break;
                                                                case 84:
                                                                    int i9 = C0052.f208;
                                                                    int i10 = 49914;
                                                                    while (true) {
                                                                        i10 ^= 49931;
                                                                        switch (i10) {
                                                                            case 497:
                                                                                i10 = (iIntValue >> (i9 ^ (-113))) <= 7 ? 50658 : 50627;
                                                                                break;
                                                                            case 1711:
                                                                                break;
                                                                            case 1736:
                                                                                c = 0;
                                                                                break;
                                                                            case 1769:
                                                                                int i11 = C0075.f284;
                                                                                int i12 = 50689;
                                                                                while (true) {
                                                                                    i12 ^= 50706;
                                                                                    switch (i12) {
                                                                                        case 19:
                                                                                            i12 = (0 - ((0 - (iIntValue << 8)) - iIntValue2)) % (i11 ^ 797) == 0 ? 50782 : 50751;
                                                                                            break;
                                                                                        case 45:
                                                                                            c = 0;
                                                                                            break;
                                                                                        case 50:
                                                                                            break;
                                                                                        case 76:
                                                                                            int i13 = 50813;
                                                                                            while (true) {
                                                                                                i13 ^= 50830;
                                                                                                switch (i13) {
                                                                                                    case 18:
                                                                                                        c = 1;
                                                                                                        break;
                                                                                                    case 243:
                                                                                                        i13 = 50844;
                                                                                                        continue;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    i8 = ((i7 ^ 444) & iIntValue) == 8 ? 49883 : 49852;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        c = 0;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                Inflater inflater2 = new Inflater((c & (-2)) | ((c ^ (-1)) & 1));
                                InflaterInputStream inflaterInputStream = new InflaterInputStream(pushbackInputStream, inflater2);
                                int i14 = 51588;
                                while (true) {
                                    i14 ^= 51605;
                                    switch (i14) {
                                        case 17:
                                            i14 = 51619;
                                            break;
                                        case 54:
                                            inputStream = inflaterInputStream;
                                            inflater = inflater2;
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int iIntValue3 = ((Integer) C0219.n(82234, inputStream, new Object[]{bArr})).intValue();
                                    int i15 = 51712;
                                    while (true) {
                                        i15 ^= 51729;
                                        switch (i15) {
                                            case 14:
                                                break;
                                            case 17:
                                                i15 = iIntValue3 != -1 ? 51805 : 51774;
                                                break;
                                            case 47:
                                                String str = new String((byte[]) C0163.n(83400, byteArrayOutputStream, new Object[0]), (Charset) C0182.n(4193));
                                                C0170.n(85695, byteArrayOutputStream, new Object[0]);
                                                C0216.n(17963, inputStream, new Object[0]);
                                                int i16 = 53510;
                                                while (true) {
                                                    i16 ^= 53527;
                                                    switch (i16) {
                                                        case 17:
                                                            i16 = inflater != null ? 53603 : 53572;
                                                            break;
                                                        case 50:
                                                            break;
                                                        case 83:
                                                            break;
                                                        case 116:
                                                            C0170.n(24360, inflater, new Object[0]);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                return str;
                                            case 76:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    int iIntValue4 = ((Integer) C0170.n(31063, byteArrayOutputStream, new Object[0])).intValue();
                                    int i17 = 51836;
                                    while (true) {
                                        i17 ^= 51853;
                                        switch (i17) {
                                            case 241:
                                                i17 = iIntValue4 - (0 - iIntValue3) <= 2097152 ? 52580 : 52549;
                                                break;
                                            case 1963:
                                                break;
                                            case 1992:
                                                throw new IOException((String) C0181.n(53852, null, new Object[]{(short[]) C0174.n(86055), 435, Integer.valueOf(C0132.f341 ^ (-7)), 1584}));
                                            case 2025:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    C0163.n(45931, byteArrayOutputStream, new Object[]{bArr, 0, Integer.valueOf(iIntValue3)});
                                    int i18 = 52611;
                                    while (true) {
                                        i18 ^= 52628;
                                        switch (i18) {
                                            case 23:
                                                i18 = 52642;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                int i19 = 52735;
                                while (true) {
                                    i19 ^= 52752;
                                    switch (i19) {
                                        case 14:
                                            break;
                                        case 1007:
                                            i19 = 52766;
                                            break;
                                        default:
                                            break;
                                    }
                                    try {
                                        C0170.n(85695, byteArrayOutputStream, new Object[0]);
                                        int i20 = 54533;
                                        while (true) {
                                            i20 ^= 54550;
                                            switch (i20) {
                                                case 19:
                                                    i20 = 54564;
                                                    break;
                                                case 50:
                                                    throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        C0216.n(87692, th, new Object[]{th2});
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            int i21 = 53758;
                            while (true) {
                                i21 ^= 53775;
                                switch (i21) {
                                    case 1009:
                                        i21 = 54440;
                                        continue;
                                    case 1703:
                                        break;
                                    default:
                                        continue;
                                }
                                int i22 = 54657;
                                while (true) {
                                    i22 ^= 54674;
                                    switch (i22) {
                                        case 19:
                                            i22 = inputStream != null ? 55401 : 54719;
                                            break;
                                        case 45:
                                            break;
                                        case 50:
                                            break;
                                        case 3579:
                                            try {
                                                C0216.n(17963, inputStream, new Object[0]);
                                                int i23 = 55432;
                                                while (true) {
                                                    i23 ^= 55449;
                                                    switch (i23) {
                                                        case 17:
                                                            i23 = 55463;
                                                            continue;
                                                        case 62:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                C0216.n(87692, th3, new Object[]{th4});
                                                break;
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        int i24 = 53634;
                        while (true) {
                            i24 ^= 53651;
                            switch (i24) {
                                case 17:
                                    i24 = 53665;
                                    break;
                                case 50:
                                    int i25 = 55556;
                                    while (true) {
                                        i25 ^= 55573;
                                        switch (i25) {
                                            case 17:
                                                if (inflater != null) {
                                                    i25 = 55649;
                                                }
                                                break;
                                            case 54:
                                                break;
                                            case 87:
                                                break;
                                            case 116:
                                                C0170.n(24360, inflater, new Object[0]);
                                                break;
                                            default:
                                                continue;
                                        }
                                        i25 = 55618;
                                    }
                                    int i26 = 55680;
                                    while (true) {
                                        i26 ^= 55697;
                                        switch (i26) {
                                            case 17:
                                                i26 = 56362;
                                                break;
                                            case 1467:
                                                int i27 = 56455;
                                                while (true) {
                                                    i27 ^= 56472;
                                                    switch (i27) {
                                                        case 31:
                                                            i27 = 56486;
                                                            break;
                                                        case 62:
                                                            throw th5;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0051. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00f8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:72:0x020c. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:23:0x009e for B:59:0x01b8 already processed. Defaulting to fallback option. */
    public static String w(String... strArr) throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = strArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                        break;
                    case 49:
                        i3 = i2 < length ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = (Iterator) C0221.n(14247, (Set) C0205.n(97466, linkedHashMap, new Object[0]), new Object[0]);
                while (true) {
                    boolean zBooleanValue = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
                    int i4 = 51588;
                    while (true) {
                        i4 ^= 51605;
                        switch (i4) {
                            case 17:
                                i4 = zBooleanValue ? 51681 : 51650;
                                break;
                            case 54:
                                break;
                            case 87:
                                break;
                            case 116:
                                break;
                            default:
                                break;
                        }
                        return (String) C0198.n(89992, sb, new Object[0]);
                    }
                    Map.Entry entry = (Map.Entry) C0221.n(87284, it, new Object[0]);
                    int iIntValue = ((Integer) C0162.n(73207, sb, new Object[0])).intValue();
                    int i5 = 51712;
                    while (true) {
                        i5 ^= 51729;
                        switch (i5) {
                            case 14:
                                break;
                            case 17:
                                i5 = iIntValue > 0 ? 51805 : 51774;
                                break;
                            case 47:
                                break;
                            case 76:
                                break;
                            default:
                                break;
                        }
                    }
                    int i6 = 51836;
                    while (true) {
                        i6 ^= 51853;
                        switch (i6) {
                            case 241:
                                i6 = 52518;
                                break;
                            case 1963:
                                break;
                        }
                    }
                }
            }
            String str = (String) C0170.n(4467, null, new Object[]{strArr[i2]});
            boolean zBooleanValue2 = ((Boolean) C0195.n(41159, null, new Object[]{str})).booleanValue();
            int i7 = 1740;
            while (true) {
                i7 ^= 1757;
                switch (i7) {
                    case 17:
                        i7 = zBooleanValue2 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        String[] strArr2 = (String[]) C0224.n(71204, str, new Object[]{(String) C0224.n(52346, null, new Object[]{(short[]) C0174.n(86055), 441, 1, 3237})});
                        int length2 = strArr2.length;
                        int i8 = 0;
                        while (true) {
                            int i9 = i8;
                            int i10 = 48767;
                            while (true) {
                                i10 ^= 48784;
                                switch (i10) {
                                    case 14:
                                        break;
                                    case 45:
                                        break;
                                    case 76:
                                        String str2 = (String) C0149.n(92089, strArr2[i9], new Object[0]);
                                        int iIntValue2 = ((Integer) C0188.n(90210, str2, new Object[]{Integer.valueOf(C0067.f276 ^ (-688))})).intValue();
                                        int i11 = 48891;
                                        while (true) {
                                            i11 ^= 48908;
                                            switch (i11) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    String str3 = (String) C0149.n(92089, (String) C0152.n(44633, str2, new Object[]{0, Integer.valueOf(iIntValue2)}), new Object[0]);
                                                    String str4 = (String) C0149.n(92089, (String) C0152.n(80045, str2, new Object[]{Integer.valueOf(iIntValue2 + (C0022.f178 ^ 97))}), new Object[0]);
                                                    boolean zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{str3})).booleanValue();
                                                    int i12 = 49790;
                                                    while (true) {
                                                        i12 ^= 49807;
                                                        switch (i12) {
                                                            case 18:
                                                                break;
                                                            case 51:
                                                                break;
                                                            case 84:
                                                                boolean zBooleanValue4 = ((Boolean) C0195.n(41159, null, new Object[]{str4})).booleanValue();
                                                                int i13 = 49914;
                                                                while (true) {
                                                                    i13 ^= 49931;
                                                                    switch (i13) {
                                                                        case 497:
                                                                            i13 = !zBooleanValue4 ? 50658 : 50627;
                                                                            break;
                                                                        case 1711:
                                                                            break;
                                                                        case 1736:
                                                                            break;
                                                                        case 1769:
                                                                            C0170.n(34205, linkedHashMap, new Object[]{str3, str4});
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 241:
                                                                i12 = !zBooleanValue3 ? 49883 : 49852;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 503:
                                                    i11 = iIntValue2 <= 0 ? 49635 : 48953;
                                                    break;
                                                case 32495:
                                                    int i14 = 49666;
                                                    while (true) {
                                                        i14 ^= 49683;
                                                        switch (i14) {
                                                            case 17:
                                                                i14 = 49697;
                                                                break;
                                                            case 50:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        i8 = (C0002.f158 ^ 516) + i9;
                                        int i15 = 50689;
                                        while (true) {
                                            i15 ^= 50706;
                                            switch (i15) {
                                                case 19:
                                                    i15 = 50720;
                                                    break;
                                                case 50:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i10 = i9 < length2 ? 48860 : 48829;
                                        break;
                                    default:
                                        break;
                                }
                                break;
                            }
                        }
                        break;
                    case 500:
                        int i16 = 1864;
                        while (true) {
                            i16 ^= 1881;
                            switch (i16) {
                                case 17:
                                    i16 = 48674;
                                    break;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
            i = (C0039.f195 ^ 799) + i2;
            int i17 = 50813;
            while (true) {
                i17 ^= 50830;
                switch (i17) {
                    case 18:
                        break;
                    case 243:
                        i17 = 50844;
                        break;
                }
            }
        }
    }

    public static String x(String str) {
        try {
            return (String) C0170.n(3361, null, new Object[]{str});
        } catch (Exception e) {
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        if (str == null) {
                            i = 1709;
                        }
                        break;
                    case 204:
                        String str2 = (String) C0195.n(43185);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    break;
                                case 54:
                                    return str2;
                            }
                        }
                        break;
                    case 239:
                        return (String) C0149.n(92089, str, new Object[0]);
                    default:
                        continue;
                }
                i = 1678;
            }
        }
    }

    public static String y(String str) {
        String str2;
        String str3;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = str == null ? 1709 : 1678;
                    break;
                case 204:
                    String str4 = (String) C0162.n(95122, null, new Object[]{(short[]) C0174.n(86055), 445, Integer.valueOf(C0067.f276 ^ (-667)), 830});
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                str2 = str4;
                                break;
                        }
                    }
                    break;
                case 239:
                    str2 = (String) C0224.n(74697, null, new Object[]{(short[]) C0174.n(86055), 453, Integer.valueOf(C0058.f267 ^ 99), 976});
                    break;
                default:
                    break;
            }
        }
        HttpUrl.Builder builder = (HttpUrl.Builder) C0154.n(64757, (HttpUrl) C0201.n(44872, null, new Object[]{(String) C0198.n(26710, (String) C0224.n(58480, null, new Object[]{(short[]) C0174.n(86055), 457, Integer.valueOf(C0039.f195 ^ 804), 1984}), new Object[]{str2})}), new Object[0]);
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    i3 = str != null ? 48736 : 48705;
                    break;
                case 47384:
                    break;
                case 47417:
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        int i4 = 48767;
        while (true) {
            i4 ^= 48784;
            switch (i4) {
                case 14:
                    break;
                case 45:
                    str3 = (String) C0157.n(78385, null, new Object[]{(short[]) C0174.n(86055), 534, Integer.valueOf(C0084.f293 ^ (-395)), 3213});
                    break;
                case 76:
                    String str5 = (String) C0198.n(45548, null, new Object[]{(short[]) C0174.n(86055), 525, Integer.valueOf(C0136.f345 ^ 728), 772});
                    int i5 = 48891;
                    while (true) {
                        i5 ^= 48908;
                        switch (i5) {
                            case 22:
                                str3 = str5;
                                break;
                            case 503:
                                i5 = 48922;
                                break;
                        }
                    }
                    break;
                case 239:
                    if (str == null) {
                        i4 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i4 = 48829;
        }
        return (String) C0154.n(69970, (HttpUrl) C0154.n(50299, builder, new Object[0]), new Object[0]);
    }

    public final void A(long j, String str, long j2, RunnableC0378t runnableC0378t) {
        synchronized (this) {
            try {
                long jLongValue = ((Long) C0175.n(72334, (AtomicLong) C0170.n(63799, this), new Object[0])).longValue();
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            i = j == jLongValue ? 1709 : 1678;
                            break;
                        case 204:
                            boolean zBooleanValue = ((Boolean) C0195.n(41159, null, new Object[]{str})).booleanValue();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = zBooleanValue ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        C0390z c0390z = new C0390z(j, str, j2, runnableC0378t);
                                        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C0170.n(26178, null, new Object[0]);
                                        this.l = scheduledExecutorService;
                                        return;
                                    case 500:
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    i3 = 48674;
                                                    continue;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                int i4 = 48767;
                while (true) {
                    i4 ^= 48784;
                    switch (i4) {
                        case 14:
                            throw th;
                        case 239:
                            i4 = 48798;
                            break;
                    }
                }
            }
        }
    }

    public final void B(boolean z) throws Throwable {
        final long jLongValue;
        JsonObject jsonObject;
        String str;
        String str2;
        synchronized (this) {
            try {
                C0170.n(86850, this, new Object[0]);
                jLongValue = ((Long) C0175.n(72334, (AtomicLong) C0170.n(63799, this), new Object[0])).longValue();
            } catch (Throwable th) {
                int i = 55432;
                while (true) {
                    i ^= 55449;
                    switch (i) {
                        case 17:
                            i = 55463;
                            break;
                        case 62:
                            int i2 = 55556;
                            while (true) {
                                i2 ^= 55573;
                                switch (i2) {
                                    case 17:
                                        i2 = 55587;
                                        break;
                                    case 54:
                                        throw th;
                                }
                            }
                            break;
                    }
                }
            }
        }
        Runnable runnable = new Runnable(this, jLongValue) { // from class: com.github.catvod.spider.merge.a.t
            public final A a;
            public final long b;

            {
                this.a = this;
                this.b = jLongValue;
                int iIntValue = ((Integer) C0176.n(35919, null, new Object[0])).intValue();
                int i3 = 1616;
                while (true) {
                    i3 ^= 1633;
                    switch (i3) {
                        case 14:
                            break;
                        case 49:
                            if (iIntValue <= 0) {
                                i3 = 1709;
                            }
                            break;
                        case 204:
                            C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0149.n(54590, null, new Object[]{(String) C0188.n(52576, null, new Object[]{(String) C0228.n(55330)})})});
                            return;
                        case 239:
                            return;
                        default:
                            continue;
                    }
                    i3 = 1678;
                }
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                long jLongValue2 = 0;
                String str3 = "ۣۨۦ";
                A a = null;
                Object[] objArr = null;
                Boolean bool = null;
                Integer num = null;
                Long lValueOf = null;
                Object objN = null;
                while (true) {
                    switch (C0034.m132(str3)) {
                        case 56294:
                            bool.booleanValue();
                            str3 = "ۤۨۦ";
                            break;
                        case 56449:
                            str3 = "ۧۨۢ";
                            objArr = new Object[1];
                            break;
                        case 1746754:
                            objArr[0] = lValueOf;
                            str3 = "ۣۧۧ";
                            break;
                        case 1747681:
                            str3 = "ۤ۠ۤ";
                            num = (Integer) objN;
                            break;
                        case 1747749:
                            str3 = "ۨۡ۠";
                            a = (A) objN;
                            break;
                        case 1749665:
                            jLongValue2 = lValueOf.longValue();
                            str3 = "ۤۥ";
                            break;
                        case 1750749:
                            objN = C0228.n(32976, this);
                            str3 = "۠ۢۧ";
                            break;
                        case 1750787:
                            objN = C0177.n(12744, a, objArr);
                            str3 = "ۦۥ۠";
                            break;
                        case 1750817:
                            objN = C0228.n(47021);
                            str3 = "۠۠ۡ";
                            break;
                        case 1751528:
                            num.intValue();
                            str3 = "ۣۦ۠";
                            break;
                        case 1751778:
                            return;
                        case 1753601:
                            str3 = "۟ۥ";
                            bool = (Boolean) objN;
                            break;
                        case 1754657:
                            str3 = "۟ۡۤ";
                            lValueOf = Long.valueOf(jLongValue2);
                            break;
                        case 1755399:
                            objN = C0228.n(54452, this);
                            str3 = "۟ۨۤ";
                            break;
                        default:
                            str3 = "ۢۢۡ";
                            lValueOf = (Long) objN;
                            break;
                    }
                }
            }
        };
        try {
            String str3 = (String) C0170.n(46808, null, new Object[]{null});
            HashMap map = new HashMap();
            C0155.n(50765, map, new Object[]{(String) C0224.n(30768, null, new Object[]{(short[]) C0174.n(86055), 549, Integer.valueOf(C0058.f267 ^ 109), 2608}), (String) C0182.n(27462, null, new Object[]{(short[]) C0174.n(86055), 559, Integer.valueOf(C0071.f280 ^ 64), 2421})});
            N n = (N) C0170.n(46148, this, new Object[]{Long.valueOf(jLongValue), str3, map, Long.valueOf(((Long) C0182.n(75677, null, new Object[0])).longValue() + ((Long) C0150.n(77507, (TimeUnit) C0226.n(31466), new Object[]{Long.valueOf(429 ^ ((long) C0066.f275))})).longValue())});
            long jLongValue2 = ((Long) C0175.n(72334, (AtomicLong) C0170.n(63799, this), new Object[0])).longValue();
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                        break;
                    case 49:
                        if (jLongValue != jLongValue2) {
                            i3 = 1709;
                        }
                        break;
                    case 204:
                        int iIntValue = ((Integer) C0186.n(85241, null, new Object[0])).intValue();
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    if (iIntValue <= 0) {
                                        i4 = 1833;
                                    }
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    return;
                                case 500:
                                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0162.n(1185, null, new Object[]{(String) C0170.n(2954)})})});
                                    return;
                                default:
                                    continue;
                            }
                            i4 = 1802;
                        }
                        break;
                    case 239:
                        JsonObject jsonObject2 = (JsonObject) C0174.n(3898, null, new Object[]{(String) C0188.n(56707, n, new Object[0])});
                        int iIntValue2 = ((Integer) C0219.n(19537, n)).intValue();
                        int i5 = 1864;
                        while (true) {
                            i5 ^= 1881;
                            switch (i5) {
                                case 17:
                                    if (iIntValue2 != 200) {
                                        i5 = 48736;
                                    }
                                    break;
                                case 47384:
                                    boolean zBooleanValue = ((Boolean) C0174.n(5787, jsonObject2, new Object[]{(String) C0179.n(1747, null, new Object[]{(short[]) C0174.n(86055), 683, Integer.valueOf(C0108.f317 ^ (-376)), 1262})})).booleanValue();
                                    int i6 = 48767;
                                    while (true) {
                                        i6 ^= 48784;
                                        switch (i6) {
                                            case 14:
                                                break;
                                            case 45:
                                                jsonObject = new JsonObject();
                                                break;
                                            case 76:
                                                boolean zBooleanValue2 = ((Boolean) C0170.n(91346, (JsonElement) C0174.n(61056, jsonObject2, new Object[]{(String) C0162.n(89013, null, new Object[]{(short[]) C0174.n(86055), 687, Integer.valueOf(C0124.f333 ^ (-753)), 3191})}), new Object[0])).booleanValue();
                                                int i7 = 48891;
                                                while (true) {
                                                    i7 ^= 48908;
                                                    switch (i7) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            jsonObject = new JsonObject();
                                                            break;
                                                        case 503:
                                                            i7 = zBooleanValue2 ? 49635 : 48953;
                                                            break;
                                                        case 32495:
                                                            JsonObject jsonObject3 = (JsonObject) C0170.n(64018, jsonObject2, new Object[]{(String) C0198.n(39623, null, new Object[]{(short[]) C0174.n(86055), 691, Integer.valueOf(C0141.f351 ^ (-779)), 1972})});
                                                            int i8 = 49666;
                                                            while (true) {
                                                                i8 ^= 49683;
                                                                switch (i8) {
                                                                    case 17:
                                                                        i8 = 49697;
                                                                        continue;
                                                                    case 50:
                                                                        jsonObject = jsonObject3;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 239:
                                                i6 = zBooleanValue ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    boolean zBooleanValue3 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{(String) C0182.n(7909, null, new Object[]{(short[]) C0174.n(86055), 695, Integer.valueOf(C0061.f270 ^ (-927)), 2086})})).booleanValue();
                                    int i9 = 49790;
                                    while (true) {
                                        i9 ^= 49807;
                                        switch (i9) {
                                            case 18:
                                                break;
                                            case 51:
                                                String str4 = (String) C0195.n(43185);
                                                int i10 = 50689;
                                                while (true) {
                                                    i10 ^= 50706;
                                                    switch (i10) {
                                                        case 19:
                                                            i10 = 50720;
                                                            continue;
                                                        case 50:
                                                            str = str4;
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 84:
                                                str = (String) C0170.n(10931, (JsonElement) C0174.n(61056, jsonObject, new Object[]{(String) C0149.n(60368, null, new Object[]{(short[]) C0174.n(86055), 698, Integer.valueOf(C0035.f191 ^ 319), 2221})}), new Object[0]);
                                                break;
                                            case 241:
                                                i9 = zBooleanValue3 ? 49883 : 49852;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    int i11 = 49914;
                                    while (true) {
                                        i11 ^= 49931;
                                        switch (i11) {
                                            case 497:
                                                i11 = 50596;
                                                break;
                                            case 1711:
                                                boolean zBooleanValue4 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{(String) C0149.n(74485, null, new Object[]{(short[]) C0174.n(86055), 701, Integer.valueOf(C0111.f320 ^ (-938)), 1390})})).booleanValue();
                                                int i12 = 50813;
                                                while (true) {
                                                    i12 ^= 50830;
                                                    switch (i12) {
                                                        case 18:
                                                            break;
                                                        case 53:
                                                            String str5 = (String) C0195.n(43185);
                                                            int i13 = 51712;
                                                            while (true) {
                                                                i13 ^= 51729;
                                                                switch (i13) {
                                                                    case 14:
                                                                        str2 = str5;
                                                                        break;
                                                                    case 15:
                                                                    case 16:
                                                                    default:
                                                                        continue;
                                                                    case 17:
                                                                        i13 = 51743;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 243:
                                                            i12 = zBooleanValue4 ? 51557 : 50875;
                                                            break;
                                                        case 4075:
                                                            str2 = (String) C0170.n(10931, (JsonElement) C0174.n(61056, jsonObject, new Object[]{(String) C0181.n(92093, null, new Object[]{(short[]) C0174.n(86055), 711, Integer.valueOf(C0131.f340 ^ 726), 538})}), new Object[0]);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                int i14 = 51588;
                                                while (true) {
                                                    i14 ^= 51605;
                                                    switch (i14) {
                                                        case 17:
                                                            i14 = 51619;
                                                            break;
                                                        case 54:
                                                            long jLongValue3 = ((Long) C0175.n(72334, (AtomicLong) C0170.n(63799, this), new Object[0])).longValue();
                                                            int i15 = 51836;
                                                            while (true) {
                                                                i15 ^= 51853;
                                                                switch (i15) {
                                                                    case 241:
                                                                        if (jLongValue != jLongValue3) {
                                                                            i15 = 52580;
                                                                        }
                                                                        break;
                                                                    case 1963:
                                                                        break;
                                                                    case 1992:
                                                                        boolean zBooleanValue5 = ((Boolean) C0195.n(41159, null, new Object[]{str})).booleanValue();
                                                                        int i16 = 52611;
                                                                        while (true) {
                                                                            i16 ^= 52628;
                                                                            switch (i16) {
                                                                                case 23:
                                                                                    i16 = !zBooleanValue5 ? 52704 : 52673;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                case 85:
                                                                                    break;
                                                                                case 116:
                                                                                    boolean zBooleanValue6 = ((Boolean) C0195.n(41159, null, new Object[]{str2})).booleanValue();
                                                                                    int i17 = 52735;
                                                                                    while (true) {
                                                                                        i17 ^= 52752;
                                                                                        switch (i17) {
                                                                                            case 14:
                                                                                                break;
                                                                                            case 45:
                                                                                                long jLongValue4 = ((Long) C0182.n(75677, null, new Object[0])).longValue() + ((Long) C0170.n(97025)).longValue();
                                                                                                int i18 = 53634;
                                                                                                while (true) {
                                                                                                    i18 ^= 53651;
                                                                                                    switch (i18) {
                                                                                                        case 17:
                                                                                                            i18 = z ? 53727 : 53696;
                                                                                                            break;
                                                                                                        case 50:
                                                                                                            break;
                                                                                                        case 76:
                                                                                                            boolean zBooleanValue7 = ((Boolean) C0170.n(51203, null, new Object[]{str})).booleanValue();
                                                                                                            int i19 = 53758;
                                                                                                            while (true) {
                                                                                                                i19 ^= 53775;
                                                                                                                switch (i19) {
                                                                                                                    case 1009:
                                                                                                                        i19 = zBooleanValue7 ? 54502 : 54471;
                                                                                                                        break;
                                                                                                                    case 1703:
                                                                                                                        break;
                                                                                                                    case 1736:
                                                                                                                        break;
                                                                                                                    case 1769:
                                                                                                                        C0170.n(97822, this, new Object[]{Long.valueOf(jLongValue), str2, Long.valueOf(jLongValue4), runnable});
                                                                                                                        return;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 83:
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                int i20 = 54533;
                                                                                                while (true) {
                                                                                                    i20 ^= 54550;
                                                                                                    switch (i20) {
                                                                                                        case 19:
                                                                                                            i20 = z ? 54626 : 54595;
                                                                                                            break;
                                                                                                        case 50:
                                                                                                            break;
                                                                                                        case 85:
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            C0188.n(1950, null, new Object[]{(String) C0198.n(71923, null, new Object[]{(short[]) C0174.n(86055), 721, Integer.valueOf(C0077.f286 ^ (-386)), 2420})});
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                C0157.n(96203, null, new Object[]{new RunnableC0543o((String) C0198.n(71923, null, new Object[]{(short[]) C0174.n(86055), 739, Integer.valueOf(C0123.f332 ^ (-148)), 2231}), (String) C0179.n(1747, null, new Object[]{(short[]) C0174.n(86055), 743, Integer.valueOf(C0048.f204 ^ 858), 1614}), str, (-298547) ^ C0048.f204, runnable, new Callable(this, jLongValue) { // from class: com.github.catvod.spider.merge.a.u
                                                                                                    public final A a;
                                                                                                    public final long b;

                                                                                                    {
                                                                                                        this.a = this;
                                                                                                        this.b = jLongValue;
                                                                                                        int iIntValue3 = ((Integer) C0163.n(6834, null, new Object[0])).intValue();
                                                                                                        int i21 = 1616;
                                                                                                        while (true) {
                                                                                                            i21 ^= 1633;
                                                                                                            switch (i21) {
                                                                                                                case 14:
                                                                                                                    break;
                                                                                                                case 49:
                                                                                                                    if (iIntValue3 <= 0) {
                                                                                                                        i21 = 1709;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 204:
                                                                                                                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0149.n(54590, null, new Object[]{(String) C0191.n(95512, null, new Object[]{(String) C0228.n(9321)})})});
                                                                                                                    return;
                                                                                                                case 239:
                                                                                                                    return;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                            }
                                                                                                            i21 = 1678;
                                                                                                        }
                                                                                                    }

                                                                                                    @Override // java.util.concurrent.Callable
                                                                                                    public final Object call() {
                                                                                                        boolean z2;
                                                                                                        long jLongValue5 = ((Long) C0175.n(72334, (AtomicLong) C0170.n(63799, (A) C0228.n(86175, this)), new Object[0])).longValue();
                                                                                                        long jLongValue6 = ((Long) C0228.n(53593, this)).longValue();
                                                                                                        int i21 = 1616;
                                                                                                        while (true) {
                                                                                                            i21 ^= 1633;
                                                                                                            switch (i21) {
                                                                                                                case 14:
                                                                                                                    break;
                                                                                                                case 49:
                                                                                                                    if (jLongValue6 == jLongValue5) {
                                                                                                                        i21 = 1709;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 204:
                                                                                                                    int i22 = 1740;
                                                                                                                    while (true) {
                                                                                                                        i22 ^= 1757;
                                                                                                                        switch (i22) {
                                                                                                                            case 17:
                                                                                                                                i22 = 1771;
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                z2 = true;
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 239:
                                                                                                                    z2 = false;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                            }
                                                                                                            i21 = 1678;
                                                                                                        }
                                                                                                        return (Boolean) C0224.n(34197, null, new Object[]{Boolean.valueOf(z2)});
                                                                                                    }
                                                                                                }, C0138.f347 ^ 270)});
                                                                                                C0170.n(97822, this, new Object[]{Long.valueOf(jLongValue), str2, Long.valueOf(jLongValue4), runnable});
                                                                                                int i21 = 54657;
                                                                                                while (true) {
                                                                                                    i21 ^= 54674;
                                                                                                    switch (i21) {
                                                                                                        case 19:
                                                                                                            i21 = 54688;
                                                                                                            break;
                                                                                                        case 50:
                                                                                                            return;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 1007:
                                                                                                i17 = zBooleanValue6 ? 53479 : 52797;
                                                                                                break;
                                                                                            case 7927:
                                                                                                int i22 = 53510;
                                                                                                while (true) {
                                                                                                    i22 ^= 53527;
                                                                                                    switch (i22) {
                                                                                                        case 17:
                                                                                                            i22 = 53541;
                                                                                                            continue;
                                                                                                        case 50:
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        C0170.n(34967, this, new Object[]{Long.valueOf(jLongValue), null, (String) C0157.n(78385, null, new Object[]{(short[]) C0174.n(86055), 757, Integer.valueOf(C0060.f269 ^ (-977)), 1362})});
                                                                        return;
                                                                    case 2025:
                                                                        return;
                                                                    default:
                                                                        continue;
                                                                }
                                                                i15 = 52549;
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 47417:
                                    C0170.n(34967, this, new Object[]{Long.valueOf(jLongValue), null, (String) C0152.n(8274, null, new Object[]{(short[]) C0174.n(86055), 670, Integer.valueOf(C0025.f181 ^ (-679)), 656})});
                                    return;
                                case 47483:
                                    break;
                                default:
                                    continue;
                            }
                            i5 = 48705;
                        }
                        break;
                    default:
                        continue;
                }
                i3 = 1678;
            }
        } catch (Exception e) {
            C0170.n(34967, this, new Object[]{Long.valueOf(jLongValue), runnable, (String) C0152.n(85600, null, new Object[]{(short[]) C0174.n(86055), 774, Integer.valueOf(C0042.f198 ^ 52), 2247})});
        }
    }

    public final void C() {
        synchronized (this) {
            try {
                ((Long) C0203.n(41248, (AtomicLong) C0170.n(63799, this), new Object[0])).longValue();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C0170.n(62057, this);
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            i = scheduledExecutorService != null ? 1709 : 1678;
                            break;
                        case 204:
                            this.l = null;
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = 1771;
                                        break;
                                    case 54:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                int i3 = 1864;
                while (true) {
                    i3 ^= 1881;
                    switch (i3) {
                        case 17:
                            i3 = 48674;
                            break;
                        case 47483:
                            throw th;
                    }
                }
            }
        }
    }

    public final boolean D(long j) {
        synchronized (this) {
            long jLongValue = ((Long) C0175.n(72334, (AtomicLong) C0170.n(63799, this), new Object[0])).longValue();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = j != jLongValue ? 1709 : 1678;
                        break;
                    case 204:
                        return false;
                    case 239:
                        C0170.n(86850, this, new Object[0]);
                        return true;
                    default:
                        break;
                }
            }
        }
    }

    public final void F() {
        String str;
        long jLongValue = ((Long) C0191.n(43180, null, new Object[0])).longValue();
        synchronized (this) {
            try {
                boolean zBooleanValue = ((Boolean) C0170.n(26763, this)).booleanValue();
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            if (!zBooleanValue) {
                                i = 1709;
                            }
                            break;
                        case 204:
                            long jLongValue2 = ((Long) C0170.n(32102, this)).longValue();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        if (jLongValue >= jLongValue2) {
                                            i2 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case 500:
                                        long jLongValue3 = ((Long) C0170.n(40383, this)).longValue();
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    if (jLongValue - jLongValue3 < 21600000) {
                                                        i3 = 48736;
                                                    }
                                                    break;
                                                case 47384:
                                                    long jLongValue4 = ((Long) C0170.n(96314, this)).longValue();
                                                    HashMap map = (HashMap) C0170.n(52582, null, new Object[]{(String) C0170.n(47749, this, new Object[0])});
                                                    this.h = true;
                                                    String str2 = (String) C0195.n(43185);
                                                    try {
                                                        N n = (N) C0204.n(75499, null, new Object[]{(String) C0178.n(80760, null, new Object[]{(short[]) C0174.n(86055), 789, Integer.valueOf(C0025.f181 ^ (-692)), 1335}), null, map});
                                                        boolean zBooleanValue2 = ((Boolean) C0195.n(23046, (Thread) C0195.n(50425, null, new Object[0]), new Object[0])).booleanValue();
                                                        int i4 = 48891;
                                                        while (true) {
                                                            i4 ^= 48908;
                                                            switch (i4) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    str = str2;
                                                                    break;
                                                                case 503:
                                                                    i4 = !zBooleanValue2 ? 49635 : 48953;
                                                                    break;
                                                                case 32495:
                                                                    String str3 = (String) C0170.n(66327, null, new Object[]{(Map) C0221.n(85613, n)});
                                                                    int i5 = 49666;
                                                                    while (true) {
                                                                        i5 ^= 49683;
                                                                        switch (i5) {
                                                                            case 17:
                                                                                i5 = 49697;
                                                                                break;
                                                                            case 50:
                                                                                str = str3;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        synchronized (this) {
                                                            try {
                                                                this.h = false;
                                                                long jLongValue5 = ((Long) C0170.n(96314, this)).longValue();
                                                                int i6 = 49914;
                                                                while (true) {
                                                                    i6 ^= 49931;
                                                                    switch (i6) {
                                                                        case 497:
                                                                            i6 = jLongValue4 == jLongValue5 ? 50658 : 50627;
                                                                            break;
                                                                        case 1711:
                                                                            break;
                                                                        case 1736:
                                                                            break;
                                                                        case 1769:
                                                                            boolean zBooleanValue3 = ((Boolean) C0195.n(23046, (Thread) C0195.n(50425, null, new Object[0]), new Object[0])).booleanValue();
                                                                            int i7 = 50689;
                                                                            while (true) {
                                                                                i7 ^= 50706;
                                                                                switch (i7) {
                                                                                    case 19:
                                                                                        i7 = !zBooleanValue3 ? 50782 : 50751;
                                                                                        break;
                                                                                    case 45:
                                                                                        break;
                                                                                    case 50:
                                                                                        break;
                                                                                    case 76:
                                                                                        boolean zBooleanValue4 = ((Boolean) C0195.n(41159, null, new Object[]{str})).booleanValue();
                                                                                        int i8 = 50813;
                                                                                        while (true) {
                                                                                            i8 ^= 50830;
                                                                                            switch (i8) {
                                                                                                case 18:
                                                                                                    break;
                                                                                                case 53:
                                                                                                    this.g = 60000 + jLongValue;
                                                                                                    break;
                                                                                                case 243:
                                                                                                    i8 = !zBooleanValue4 ? 51557 : 50875;
                                                                                                    break;
                                                                                                case 4075:
                                                                                                    String str4 = (String) C0170.n(9276, this, new Object[0]);
                                                                                                    String str5 = (String) C0177.n(28842, this);
                                                                                                    String[] strArr = new String[3];
                                                                                                    strArr[C0111.f320 ^ (-932)] = str4;
                                                                                                    strArr[C0065.f274 ^ 18] = str5;
                                                                                                    strArr[C0038.f194 ^ 221] = str;
                                                                                                    this.d = (String) C0177.n(35283, null, new Object[]{strArr});
                                                                                                    C0177.n(29436, this, new Object[0]);
                                                                                                    this.f = jLongValue;
                                                                                                    this.g = 0L;
                                                                                                    int i9 = 51588;
                                                                                                    while (true) {
                                                                                                        i9 ^= 51605;
                                                                                                        switch (i9) {
                                                                                                            case 17:
                                                                                                                i9 = 51619;
                                                                                                                continue;
                                                                                                            case 54:
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            } catch (Throwable th) {
                                                                int i10 = 51712;
                                                                while (true) {
                                                                    i10 ^= 51729;
                                                                    switch (i10) {
                                                                        case 14:
                                                                            throw th;
                                                                        case 17:
                                                                            i10 = 51743;
                                                                            break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int i11 = 51836;
                                                        while (true) {
                                                            i11 ^= 51853;
                                                            switch (i11) {
                                                                case 241:
                                                                    i11 = 52518;
                                                                    break;
                                                                case 1963:
                                                                    return;
                                                            }
                                                        }
                                                    } catch (Exception e) {
                                                        synchronized (this) {
                                                            try {
                                                                this.h = false;
                                                                long jLongValue6 = ((Long) C0170.n(96314, this)).longValue();
                                                                int i12 = 54533;
                                                                while (true) {
                                                                    i12 ^= 54550;
                                                                    switch (i12) {
                                                                        case 19:
                                                                            i12 = jLongValue4 == jLongValue6 ? 54626 : 54595;
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                        case 85:
                                                                            break;
                                                                        case 116:
                                                                            boolean zBooleanValue5 = ((Boolean) C0195.n(23046, (Thread) C0195.n(50425, null, new Object[0]), new Object[0])).booleanValue();
                                                                            int i13 = 54657;
                                                                            while (true) {
                                                                                i13 ^= 54674;
                                                                                switch (i13) {
                                                                                    case 19:
                                                                                        i13 = !zBooleanValue5 ? 55401 : 54719;
                                                                                        break;
                                                                                    case 45:
                                                                                        break;
                                                                                    case 50:
                                                                                        break;
                                                                                    case 3579:
                                                                                        boolean zBooleanValue6 = ((Boolean) C0195.n(41159, null, new Object[]{str2})).booleanValue();
                                                                                        int i14 = 55432;
                                                                                        while (true) {
                                                                                            i14 ^= 55449;
                                                                                            switch (i14) {
                                                                                                case 17:
                                                                                                    i14 = !zBooleanValue6 ? 55525 : 55494;
                                                                                                    break;
                                                                                                case 62:
                                                                                                    break;
                                                                                                case 95:
                                                                                                    this.g = 60000 + jLongValue;
                                                                                                    break;
                                                                                                case 124:
                                                                                                    String str6 = (String) C0170.n(9276, this, new Object[0]);
                                                                                                    String str7 = (String) C0177.n(28842, this);
                                                                                                    String[] strArr2 = new String[3];
                                                                                                    strArr2[C0002.f158 ^ 517] = str6;
                                                                                                    strArr2[C0065.f274 ^ 18] = str7;
                                                                                                    strArr2[C0007.f163 ^ 165] = str2;
                                                                                                    this.d = (String) C0177.n(35283, null, new Object[]{strArr2});
                                                                                                    C0177.n(29436, this, new Object[0]);
                                                                                                    this.f = jLongValue;
                                                                                                    this.g = 0L;
                                                                                                    int i15 = 55556;
                                                                                                    while (true) {
                                                                                                        i15 ^= 55573;
                                                                                                        switch (i15) {
                                                                                                            case 17:
                                                                                                                i15 = 55587;
                                                                                                                continue;
                                                                                                            case 54:
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                return;
                                                            } catch (Throwable th2) {
                                                                int i16 = 55680;
                                                                while (true) {
                                                                    i16 ^= 55697;
                                                                    switch (i16) {
                                                                        case 17:
                                                                            i16 = 56362;
                                                                            break;
                                                                        case 1467:
                                                                            throw th2;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        int i17 = 49790;
                                                        while (true) {
                                                            i17 ^= 49807;
                                                            switch (i17) {
                                                                case 18:
                                                                    synchronized (this) {
                                                                        try {
                                                                            this.h = false;
                                                                            long jLongValue7 = ((Long) C0170.n(96314, this)).longValue();
                                                                            int i18 = 52611;
                                                                            while (true) {
                                                                                i18 ^= 52628;
                                                                                switch (i18) {
                                                                                    case 23:
                                                                                        if (jLongValue4 == jLongValue7) {
                                                                                            i18 = 52704;
                                                                                        }
                                                                                        break;
                                                                                    case 54:
                                                                                        break;
                                                                                    case 85:
                                                                                        break;
                                                                                    case 116:
                                                                                        boolean zBooleanValue7 = ((Boolean) C0195.n(23046, (Thread) C0195.n(50425, null, new Object[0]), new Object[0])).booleanValue();
                                                                                        int i19 = 52735;
                                                                                        while (true) {
                                                                                            i19 ^= 52752;
                                                                                            switch (i19) {
                                                                                                case 14:
                                                                                                    break;
                                                                                                case 45:
                                                                                                    break;
                                                                                                case 1007:
                                                                                                    if (!zBooleanValue7) {
                                                                                                        i19 = 53479;
                                                                                                    }
                                                                                                    break;
                                                                                                case 7927:
                                                                                                    boolean zBooleanValue8 = ((Boolean) C0195.n(41159, null, new Object[]{str2})).booleanValue();
                                                                                                    int i20 = 53510;
                                                                                                    while (true) {
                                                                                                        i20 ^= 53527;
                                                                                                        switch (i20) {
                                                                                                            case 17:
                                                                                                                if (!zBooleanValue8) {
                                                                                                                    i20 = 53603;
                                                                                                                }
                                                                                                                break;
                                                                                                            case 50:
                                                                                                                break;
                                                                                                            case 83:
                                                                                                                this.g = 60000 + jLongValue;
                                                                                                                break;
                                                                                                            case 116:
                                                                                                                String str8 = (String) C0170.n(9276, this, new Object[0]);
                                                                                                                String str9 = (String) C0177.n(28842, this);
                                                                                                                String[] strArr3 = new String[3];
                                                                                                                strArr3[C0036.f192 ^ (-44)] = str8;
                                                                                                                strArr3[C0088.f297 ^ 490] = str9;
                                                                                                                strArr3[C0127.f336 ^ (-973)] = str2;
                                                                                                                this.d = (String) C0177.n(35283, null, new Object[]{strArr3});
                                                                                                                C0177.n(29436, this, new Object[0]);
                                                                                                                this.f = jLongValue;
                                                                                                                this.g = 0L;
                                                                                                                int i21 = 53634;
                                                                                                                while (true) {
                                                                                                                    i21 ^= 53651;
                                                                                                                    switch (i21) {
                                                                                                                        case 17:
                                                                                                                            i21 = 53665;
                                                                                                                            break;
                                                                                                                        case 50:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                        }
                                                                                                        i20 = 53572;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                            }
                                                                                            i19 = 52797;
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                i18 = 52673;
                                                                            }
                                                                            throw th3;
                                                                        } catch (Throwable th4) {
                                                                            int i22 = 53758;
                                                                            while (true) {
                                                                                i22 ^= 53775;
                                                                                switch (i22) {
                                                                                    case 1009:
                                                                                        i22 = 54440;
                                                                                        break;
                                                                                    case 1703:
                                                                                        throw th4;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    i17 = 49821;
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 47417:
                                                    int i23 = 48767;
                                                    while (true) {
                                                        i23 ^= 48784;
                                                        switch (i23) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i23 = 48798;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i3 = 48705;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i2 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i = 1678;
                }
            } catch (Throwable th5) {
                int i24 = 56455;
                while (true) {
                    i24 ^= 56472;
                    switch (i24) {
                        case 31:
                            i24 = 56486;
                            break;
                        case 62:
                            throw th5;
                    }
                }
            }
        }
    }

    public final boolean a(String str, long j, long j2, long j3, CallableC0455g callableC0455g) throws Throwable {
        long j4;
        long jLongValue;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = j3 > 0 ? 1709 : 1678;
                    break;
                case 204:
                    long jLongValue2 = ((Long) C0150.n(77507, (TimeUnit) C0150.n(51749), new Object[]{Long.valueOf(j3)})).longValue() + ((Long) C0182.n(75677, null, new Object[0])).longValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                continue;
                            case 54:
                                j4 = jLongValue2;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    j4 = 0;
                    break;
                default:
                    break;
            }
        }
        String str2 = (String) C0170.n(4467, null, new Object[]{str});
        boolean zBooleanValue = ((Boolean) C0177.n(55659, null, new Object[]{str2})).booleanValue();
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    if (!zBooleanValue) {
                        i3 = 48736;
                    }
                    break;
                case 47384:
                    synchronized (this) {
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    try {
                                        long jLongValue3 = ((Long) C0170.n(96314, this)).longValue();
                                        int i5 = 48891;
                                        while (true) {
                                            i5 ^= 48908;
                                            switch (i5) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    return false;
                                                case 503:
                                                    i5 = j == jLongValue3 ? 49635 : 48953;
                                                    break;
                                                case 32495:
                                                    int i6 = 49666;
                                                    while (true) {
                                                        i6 ^= 49683;
                                                        switch (i6) {
                                                            case 17:
                                                                i6 = 49697;
                                                                continue;
                                                            case 50:
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        int i7 = 49790;
                                        while (true) {
                                            i7 ^= 49807;
                                            switch (i7) {
                                                case 18:
                                                    throw th;
                                                case 241:
                                                    i7 = 49821;
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                case 239:
                                    i4 = j >= 0 ? 48860 : 48829;
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i8 = 49914;
                        while (true) {
                            i8 ^= 49931;
                            switch (i8) {
                                case 497:
                                    i8 = j2 >= 0 ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    break;
                                case 1769:
                                    long jLongValue4 = ((Long) C0175.n(72334, (AtomicLong) C0170.n(63799, this), new Object[0])).longValue();
                                    int i9 = 50689;
                                    while (true) {
                                        i9 ^= 50706;
                                        switch (i9) {
                                            case 19:
                                                i9 = j2 == jLongValue4 ? 50782 : 50751;
                                                break;
                                            case 45:
                                                return false;
                                            case 50:
                                                break;
                                            case 76:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i10 = 50813;
                        while (true) {
                            i10 ^= 50830;
                            switch (i10) {
                                case 18:
                                    break;
                                case 53:
                                    break;
                                case 243:
                                    i10 = callableC0455g != null ? 51557 : 50875;
                                    break;
                                case 4075:
                                    try {
                                        boolean zBooleanValue2 = ((Boolean) C0182.n(56525, (Boolean) C0182.n(26387), new Object[]{C0177.n(52338, callableC0455g, new Object[0])})).booleanValue();
                                        int i11 = 51588;
                                        while (true) {
                                            i11 ^= 51605;
                                            switch (i11) {
                                                case 17:
                                                    i11 = zBooleanValue2 ? 51681 : 51650;
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    return false;
                                                case 116:
                                                    int i12 = 51712;
                                                    while (true) {
                                                        i12 ^= 51729;
                                                        switch (i12) {
                                                            case 14:
                                                                break;
                                                            case 15:
                                                            case 16:
                                                            default:
                                                                continue;
                                                            case 17:
                                                                i12 = 51743;
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    } catch (Exception e) {
                                        int i13 = 1508650;
                                        while (true) {
                                            i13 ^= 1508667;
                                            switch (i13) {
                                                case 17:
                                                    i13 = 1508681;
                                                    continue;
                                                case 114:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        long jLongValue5 = ((Long) C0170.n(96314, this)).longValue();
                        try {
                            String str3 = (String) C0224.n(54707, null, new Object[]{(short[]) C0174.n(86055), 813, Integer.valueOf(C0108.f317 ^ (-352)), 639});
                            HashMap map = (HashMap) C0170.n(52582, null, new Object[]{str2});
                            int i14 = 51836;
                            while (true) {
                                i14 ^= 51853;
                                switch (i14) {
                                    case 241:
                                        i14 = j4 == 0 ? 52580 : 52549;
                                        break;
                                    case 1963:
                                        break;
                                    case 1992:
                                        jLongValue = j4;
                                        break;
                                    case 2025:
                                        jLongValue = ((Long) C0182.n(75677, null, new Object[0])).longValue() + ((Long) C0150.n(77507, (TimeUnit) C0226.n(31466), new Object[]{Long.valueOf(278 ^ ((long) C0138.f347))})).longValue();
                                        int i15 = 52611;
                                        while (true) {
                                            i15 ^= 52628;
                                            switch (i15) {
                                                case 23:
                                                    i15 = 52642;
                                                    continue;
                                                case 54:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            N n = (N) C0170.n(46148, this, new Object[]{Long.valueOf(782 ^ ((long) C0141.f351)), str3, map, Long.valueOf(jLongValue)});
                            int iIntValue = ((Integer) C0219.n(19537, n)).intValue();
                            int i16 = 52735;
                            while (true) {
                                i16 ^= 52752;
                                switch (i16) {
                                    case 14:
                                        break;
                                    case 45:
                                        p pVar = (p) C0177.n(11768, null, new Object[]{(String) C0188.n(56707, n, new Object[0])});
                                        boolean zBooleanValue3 = ((Boolean) C0174.n(51401, pVar, new Object[0])).booleanValue();
                                        int i17 = 53510;
                                        while (true) {
                                            i17 ^= 53527;
                                            switch (i17) {
                                                case 17:
                                                    if (!zBooleanValue3) {
                                                        i17 = 53603;
                                                    }
                                                    break;
                                                case 50:
                                                    break;
                                                case 83:
                                                    synchronized (this) {
                                                        try {
                                                            long jLongValue6 = ((Long) C0170.n(96314, this)).longValue();
                                                            int i18 = 53634;
                                                            while (true) {
                                                                i18 ^= 53651;
                                                                switch (i18) {
                                                                    case 17:
                                                                        i18 = jLongValue5 == jLongValue6 ? 53727 : 53696;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    case 76:
                                                                        int i19 = 53758;
                                                                        while (true) {
                                                                            i19 ^= 53775;
                                                                            switch (i19) {
                                                                                case 1009:
                                                                                    i19 = j2 >= 0 ? 54502 : 54471;
                                                                                    break;
                                                                                case 1703:
                                                                                    break;
                                                                                case 1736:
                                                                                    break;
                                                                                case 1769:
                                                                                    long jLongValue7 = ((Long) C0175.n(72334, (AtomicLong) C0170.n(63799, this), new Object[0])).longValue();
                                                                                    int i20 = 54533;
                                                                                    while (true) {
                                                                                        i20 ^= 54550;
                                                                                        switch (i20) {
                                                                                            case 19:
                                                                                                i20 = j2 == jLongValue7 ? 54626 : 54595;
                                                                                                break;
                                                                                            case 50:
                                                                                                break;
                                                                                            case 85:
                                                                                                break;
                                                                                            case 116:
                                                                                                int i21 = 54657;
                                                                                                while (true) {
                                                                                                    i21 ^= 54674;
                                                                                                    switch (i21) {
                                                                                                        case 19:
                                                                                                            i21 = 54688;
                                                                                                            continue;
                                                                                                        case 50:
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        int i22 = 55556;
                                                                        while (true) {
                                                                            i22 ^= 55573;
                                                                            switch (i22) {
                                                                                case 17:
                                                                                    i22 = callableC0455g != null ? 55649 : 55618;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                case 87:
                                                                                    break;
                                                                                case 116:
                                                                                    try {
                                                                                        boolean zBooleanValue4 = ((Boolean) C0182.n(56525, (Boolean) C0182.n(26387), new Object[]{C0177.n(52338, callableC0455g, new Object[0])})).booleanValue();
                                                                                        int i23 = 55680;
                                                                                        while (true) {
                                                                                            i23 ^= 55697;
                                                                                            switch (i23) {
                                                                                                case 17:
                                                                                                    i23 = zBooleanValue4 ? 56424 : 56393;
                                                                                                    break;
                                                                                                case 1467:
                                                                                                    break;
                                                                                                case 1496:
                                                                                                    break;
                                                                                                case 1529:
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                    } catch (Exception e2) {
                                                                                        int i24 = 1509425;
                                                                                        while (true) {
                                                                                            i24 ^= 1509442;
                                                                                            switch (i24) {
                                                                                                case 18:
                                                                                                    break;
                                                                                                case 115:
                                                                                                    i24 = 1509456;
                                                                                                    continue;
                                                                                                default:
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        boolean zBooleanValue5 = ((Boolean) C0195.n(23046, (Thread) C0195.n(50425, null, new Object[0]), new Object[0])).booleanValue();
                                                                        int i25 = 56455;
                                                                        while (true) {
                                                                            i25 ^= 56472;
                                                                            switch (i25) {
                                                                                case 31:
                                                                                    i25 = !zBooleanValue5 ? 56548 : 56517;
                                                                                    break;
                                                                                case 62:
                                                                                    break;
                                                                                case 93:
                                                                                    break;
                                                                                case 124:
                                                                                    int i26 = 56579;
                                                                                    while (true) {
                                                                                        i26 ^= 56596;
                                                                                        switch (i26) {
                                                                                            case 23:
                                                                                                i26 = j4 != 0 ? 1507472 : 56641;
                                                                                                break;
                                                                                            case 54:
                                                                                                break;
                                                                                            case 85:
                                                                                                break;
                                                                                            case 1564036:
                                                                                                long jLongValue8 = ((Long) C0182.n(75677, null, new Object[0])).longValue();
                                                                                                int i27 = 1507503;
                                                                                                while (true) {
                                                                                                    i27 ^= 1507520;
                                                                                                    switch (i27) {
                                                                                                        case 14:
                                                                                                            break;
                                                                                                        case 45:
                                                                                                            break;
                                                                                                        case 111:
                                                                                                            i27 = jLongValue8 >= j4 ? 1507596 : 1507565;
                                                                                                            break;
                                                                                                        case 460:
                                                                                                            int i28 = 1507627;
                                                                                                            while (true) {
                                                                                                                i28 ^= 1507644;
                                                                                                                switch (i28) {
                                                                                                                    case 23:
                                                                                                                        i28 = 1507658;
                                                                                                                        continue;
                                                                                                                    case 118:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        continue;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    C0170.n(86850, this, new Object[0]);
                                                                                    boolean zBooleanValue6 = ((Boolean) C0182.n(55567, str2, new Object[]{(String) C0177.n(31508, this)})).booleanValue();
                                                                                    int i29 = 1507751;
                                                                                    while (true) {
                                                                                        i29 ^= 1507768;
                                                                                        switch (i29) {
                                                                                            case 31:
                                                                                                i29 = zBooleanValue6 ? 1508495 : 1508464;
                                                                                                break;
                                                                                            case 1335:
                                                                                                long jLongValue9 = ((Long) C0177.n(29049, this)).longValue();
                                                                                                long jLongValue10 = ((Long) C0177.n(31822, pVar, new Object[0])).longValue();
                                                                                                int i30 = 1508526;
                                                                                                while (true) {
                                                                                                    i30 ^= 1508543;
                                                                                                    switch (i30) {
                                                                                                        case 17:
                                                                                                            i30 = jLongValue9 == jLongValue10 ? 1508619 : 1508588;
                                                                                                            break;
                                                                                                        case 83:
                                                                                                            break;
                                                                                                        case 114:
                                                                                                            break;
                                                                                                        case 436:
                                                                                                            return true;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 1480:
                                                                                                break;
                                                                                            case 1513:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    this.a = str2;
                                                                                    this.b = (String) C0195.n(43185);
                                                                                    this.c = (String) C0174.n(21569, pVar, new Object[0]);
                                                                                    this.e = ((Long) C0177.n(31822, pVar, new Object[0])).longValue();
                                                                                    this.n = ((Long) C0170.n(96314, this)).longValue() + 1;
                                                                                    C0177.n(29436, this, new Object[0]);
                                                                                    C0177.n(31020, null, new Object[0]);
                                                                                    C0153.n(4962, null, new Object[]{(String) C0191.n(93496, null, new Object[]{(short[]) C0174.n(86055), 857, Integer.valueOf(C0058.f267 ^ 99), 1530})});
                                                                                    return true;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        return false;
                                                                    case 83:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            return false;
                                                        } catch (Throwable th2) {
                                                            int i31 = 55432;
                                                            while (true) {
                                                                i31 ^= 55449;
                                                                switch (i31) {
                                                                    case 17:
                                                                        i31 = 55463;
                                                                        break;
                                                                    case 62:
                                                                        throw th2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case 116:
                                                    return false;
                                                default:
                                                    continue;
                                            }
                                            i17 = 53572;
                                        }
                                        break;
                                    case 1007:
                                        i16 = iIntValue != 200 ? 53479 : 52797;
                                        break;
                                    case 7927:
                                        return false;
                                    default:
                                        break;
                                }
                            }
                        } catch (Exception e3) {
                            return false;
                        }
                    }
                    break;
                case 47417:
                    return false;
                case 47483:
                    break;
                default:
                    continue;
            }
            i3 = 48705;
        }
    }

    public final String b() {
        boolean zBooleanValue = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0177.n(31508, this)})).booleanValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (zBooleanValue) {
                        i = 1709;
                    }
                    break;
                case 204:
                    String str = (String) C0170.n(9276, this, new Object[0]);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return str;
                        }
                    }
                    break;
                case 239:
                    return (String) C0177.n(31508, this);
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public final void c() throws Throwable {
        synchronized (this) {
            C0170.n(86850, this, new Object[0]);
            this.a = (String) C0195.n(43185);
            this.b = (String) C0195.n(43185);
            this.c = (String) C0195.n(43185);
            this.e = 0L;
            this.n = ((Long) C0170.n(96314, this)).longValue() + 1;
            this.j = false;
            C0177.n(29436, this, new Object[0]);
        }
        C0177.n(31020, null, new Object[0]);
        C0153.n(4962, null, new Object[]{(String) C0224.n(52346, null, new Object[]{(short[]) C0174.n(86055), 861, Integer.valueOf(C0075.f284 ^ 774), 1045})});
        int iIntValue = ((Integer) C0151.n(27095, null, new Object[0])).intValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iIntValue <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0191.n(61249, null, new Object[]{(String) C0177.n(45767)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public final boolean d(C0390z c0390z, String str, p pVar) throws Throwable {
        synchronized (this) {
            try {
                long jLongValue = ((Long) C0177.n(92809, c0390z)).longValue();
                long jLongValue2 = ((Long) C0175.n(72334, (AtomicLong) C0170.n(63799, this), new Object[0])).longValue();
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            if (jLongValue == jLongValue2) {
                                i = 1709;
                            }
                            break;
                        case 204:
                            boolean zBooleanValue = ((Boolean) C0195.n(23046, (Thread) C0195.n(50425, null, new Object[0]), new Object[0])).booleanValue();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        if (!zBooleanValue) {
                                            i2 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case 500:
                                        long jLongValue3 = ((Long) C0182.n(75677, null, new Object[0])).longValue();
                                        long jLongValue4 = ((Long) C0177.n(56233, c0390z)).longValue();
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    if (jLongValue3 - jLongValue4 >= 0) {
                                                        i3 = 48736;
                                                    }
                                                    break;
                                                case 47384:
                                                    this.a = str;
                                                    this.b = (String) C0195.n(43185);
                                                    this.c = (String) C0174.n(21569, pVar, new Object[0]);
                                                    this.e = ((Long) C0177.n(31822, pVar, new Object[0])).longValue();
                                                    this.n = ((Long) C0170.n(96314, this)).longValue() + 1;
                                                    C0177.n(29436, this, new Object[0]);
                                                    try {
                                                        C0177.n(31020, null, new Object[0]);
                                                        break;
                                                    } catch (Exception e) {
                                                        int i4 = 49666;
                                                        while (true) {
                                                            i4 ^= 49683;
                                                            switch (i4) {
                                                                case 17:
                                                                    i4 = 49697;
                                                                    continue;
                                                                case 50:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        C0153.n(4962, null, new Object[]{(String) C0195.n(19148, null, new Object[]{(short[]) C0174.n(86055), 865, Integer.valueOf(C0051.f207 ^ (-374)), 2942})});
                                                        break;
                                                    } catch (Exception e2) {
                                                        int i5 = 49790;
                                                        while (true) {
                                                            i5 ^= 49807;
                                                            switch (i5) {
                                                                case 18:
                                                                    break;
                                                                case 241:
                                                                    i5 = 49821;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                    }
                                                    return true;
                                                case 47417:
                                                    int i6 = 48767;
                                                    while (true) {
                                                        i6 ^= 48784;
                                                        switch (i6) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i6 = 48798;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i3 = 48705;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i2 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i = 1678;
                }
                return false;
            } catch (Throwable th) {
                int i7 = 48891;
                while (true) {
                    i7 ^= 48908;
                    switch (i7) {
                        case 22:
                            throw th;
                        case 503:
                            i7 = 48922;
                            break;
                    }
                }
            }
        }
    }

    public final C0386x f() {
        C0386x c0386x;
        synchronized (this) {
            c0386x = new C0386x((HashMap) C0170.n(52582, null, new Object[]{(String) C0170.n(47749, this, new Object[0])}), ((Long) C0170.n(96314, this)).longValue(), ((Boolean) C0177.n(72971, this, new Object[0])).booleanValue());
        }
        return c0386x;
    }

    public final String g() throws Throwable {
        String str = (String) C0170.n(4467, null, new Object[]{(String) C0177.n(28842, this)});
        this.d = str;
        String str2 = (String) C0162.n(32544, str, new Object[]{(String) C0198.n(54030, null, new Object[]{(short[]) C0174.n(86055), 869, Integer.valueOf(C0080.f289 ^ 189), 2187}), (String) C0195.n(43185)});
        this.d = str2;
        String str3 = (String) C0170.n(4467, null, new Object[]{str2});
        this.d = str3;
        boolean zBooleanValue = ((Boolean) C0195.n(41159, null, new Object[]{str3})).booleanValue();
        String str4 = (String) C0162.n(29890, null, new Object[]{(short[]) C0174.n(86055), 939, Integer.valueOf(C0099.f308 ^ 831), 763});
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zBooleanValue ? 1709 : 1678;
                    break;
                case 204:
                    boolean zBooleanValue2 = ((Boolean) C0224.n(41581, (String) C0177.n(28842, this), new Object[]{str4})).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = zBooleanValue2 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
            return (String) C0177.n(28842, this);
        }
        StringBuilder sb = new StringBuilder();
        String str5 = (String) C0198.n(89992, sb, new Object[0]);
        long jLongValue = ((Long) C0191.n(43180, null, new Object[0])).longValue() / 1000;
        StringBuilder sb2 = new StringBuilder(str4);
        this.d = (String) C0198.n(89992, sb2, new Object[0]);
        C0177.n(29436, this, new Object[0]);
        return (String) C0177.n(28842, this);
    }

    public final void h(long j, Runnable runnable, String str) throws Throwable {
        synchronized (this) {
            try {
                boolean zBooleanValue = ((Boolean) C0177.n(12744, this, new Object[]{Long.valueOf(j)})).booleanValue();
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            if (!zBooleanValue) {
                                i = 1709;
                            }
                            break;
                        case 204:
                            return;
                        case 239:
                            long jLongValue = ((Long) C0175.n(72334, (AtomicLong) C0170.n(63799, this), new Object[0])).longValue();
                            int i2 = 1864;
                            while (true) {
                                i2 ^= 1881;
                                switch (i2) {
                                    case 17:
                                        i2 = runnable != null ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        break;
                                    case 47417:
                                        C0152.n(52927, null, new Object[]{new B(runnable, C0111.f320 ^ (-940))});
                                        break;
                                    case 47483:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            C0152.n(52927, null, new Object[]{new RunnableC0305w0(this, jLongValue, str)});
                            return;
                        default:
                            continue;
                    }
                    i = 1678;
                }
            } catch (Throwable th) {
                int i3 = 1740;
                while (true) {
                    i3 ^= 1757;
                    switch (i3) {
                        case 17:
                            i3 = 1771;
                            break;
                        case 54:
                            throw th;
                    }
                }
            }
        }
    }

    public final long k() {
        long jLongValue;
        synchronized (this) {
            jLongValue = ((Long) C0170.n(96314, this)).longValue();
        }
        return jLongValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String m() {
        try {
            p pVar = (p) C0177.n(98943, this, new Object[0]);
            boolean zBooleanValue = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0177.n(31508, this)})).booleanValue();
            return (String) C0177.n(19376, null, new Object[]{pVar, Boolean.valueOf(((zBooleanValue ? 1 : 0) & 65534) | (((zBooleanValue ? 1 : 0) ^ 65535) & 1))});
        } catch (Exception e) {
            boolean zBooleanValue2 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0177.n(31508, this)})).booleanValue();
            return (String) C0177.n(19376, null, new Object[]{null, Boolean.valueOf(((zBooleanValue2 ? 1 : 0) & 65534) | (((zBooleanValue2 ? 1 : 0) ^ 65535) & 1))});
        }
    }

    public final long n() {
        long jLongValue = ((Long) C0177.n(29049, this)).longValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (jLongValue <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    try {
                        ((Boolean) C0174.n(51401, (p) C0177.n(98943, this, new Object[0]), new Object[0])).booleanValue();
                        break;
                    } catch (Exception e) {
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
        return ((Long) C0177.n(29049, this)).longValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x0193. Please report as an issue. */
    public final p o() throws Throwable {
        int i = 0;
        while (true) {
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i < 2 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        return new p();
                    default:
                        break;
                }
            }
            synchronized (this) {
                try {
                    boolean zBooleanValue = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0177.n(31508, this)})).booleanValue();
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = zBooleanValue ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                return new p();
                            default:
                                break;
                        }
                    }
                    long jLongValue = ((Long) C0170.n(96314, this)).longValue();
                    N n = (N) C0170.n(46148, this, new Object[]{Long.valueOf(547 ^ ((long) C0110.f319)), (String) C0162.n(83354, null, new Object[]{(short[]) C0174.n(86055), 979, Integer.valueOf(C0058.f267 ^ 75), 1933}), (HashMap) C0170.n(52582, null, new Object[]{(String) C0170.n(47749, this, new Object[0])}), Long.valueOf(((Long) C0182.n(75677, null, new Object[0])).longValue() + ((Long) C0150.n(77507, (TimeUnit) C0226.n(31466), new Object[]{Long.valueOf(429 ^ ((long) C0066.f275))})).longValue())});
                    int iIntValue = ((Integer) C0219.n(19537, n)).intValue();
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                                break;
                            case 45:
                                throw new IOException((String) C0224.n(74697, null, new Object[]{(short[]) C0174.n(86055), 1023, Integer.valueOf(C0051.f207 ^ (-380)), 781}));
                            case 76:
                                break;
                            case 239:
                                i4 = iIntValue == 200 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    p pVar = (p) C0177.n(11768, null, new Object[]{(String) C0188.n(56707, n, new Object[0])});
                    synchronized (this) {
                        try {
                            long jLongValue2 = ((Long) C0170.n(96314, this)).longValue();
                            int i5 = 48891;
                            while (true) {
                                i5 ^= 48908;
                                switch (i5) {
                                    case 22:
                                        break;
                                    case 53:
                                        boolean zBooleanValue2 = ((Boolean) C0174.n(51401, pVar, new Object[0])).booleanValue();
                                        int i6 = 49914;
                                        while (true) {
                                            i6 ^= 49931;
                                            switch (i6) {
                                                case 497:
                                                    if (zBooleanValue2) {
                                                        i6 = 50658;
                                                    }
                                                    break;
                                                case 1711:
                                                    break;
                                                case 1736:
                                                    C0177.n(31064, this, new Object[]{Long.valueOf(jLongValue)});
                                                    return pVar;
                                                case 1769:
                                                    String str = (String) C0174.n(21569, pVar, new Object[0]);
                                                    long jLongValue3 = ((Long) C0177.n(31822, pVar, new Object[0])).longValue();
                                                    boolean zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{str})).booleanValue();
                                                    int i7 = 50689;
                                                    while (true) {
                                                        i7 ^= 50706;
                                                        switch (i7) {
                                                            case 19:
                                                                i7 = !zBooleanValue3 ? 50782 : 50751;
                                                                break;
                                                            case 45:
                                                                break;
                                                            case 50:
                                                                break;
                                                            case 76:
                                                                this.c = str;
                                                                int i8 = 50813;
                                                                while (true) {
                                                                    i8 ^= 50830;
                                                                    switch (i8) {
                                                                        case 18:
                                                                            break;
                                                                        case 53:
                                                                            break;
                                                                        case 243:
                                                                            i8 = jLongValue3 > 0 ? 51557 : 50875;
                                                                            break;
                                                                        case 4075:
                                                                            this.e = jLongValue3;
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0177.n(29436, this, new Object[0]);
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    return pVar;
                                                default:
                                                    continue;
                                            }
                                            i6 = 50627;
                                        }
                                        break;
                                    case 503:
                                        i5 = jLongValue != jLongValue2 ? 49635 : 48953;
                                        break;
                                    case 32495:
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } catch (Throwable th) {
                            int i9 = 49790;
                            while (true) {
                                i9 ^= 49807;
                                switch (i9) {
                                    case 18:
                                        throw th;
                                    case 241:
                                        i9 = 49821;
                                        break;
                                }
                            }
                        }
                    }
                    int i10 = (C0051.f207 ^ (-369)) + i;
                    int i11 = 49666;
                    while (true) {
                        i11 ^= 49683;
                        switch (i11) {
                            case 17:
                                i11 = 49697;
                                break;
                            case 50:
                                break;
                            default:
                                break;
                        }
                    }
                    i = i10;
                } catch (Throwable th2) {
                    int i12 = 1864;
                    while (true) {
                        i12 ^= 1881;
                        switch (i12) {
                            case 17:
                                i12 = 48674;
                                break;
                            case 47483:
                                throw th2;
                        }
                    }
                }
            }
        }
    }

    public final boolean q() {
        boolean zBooleanValue = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0177.n(31508, this)})).booleanValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = !zBooleanValue ? 1709 : 1678;
                    break;
                case 204:
                    boolean zBooleanValue2 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0177.n(41804, this)})).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zBooleanValue2 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                long jLongValue = ((Long) C0177.n(29049, this)).longValue();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = jLongValue > 0 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        return true;
                                                    case 239:
                                                        i4 = 48798;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 47483:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:116:0x04fb. Please report as an issue. */
    public final void r() throws Throwable {
        int iIntValue;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        long jLongValue;
        int iIntValue2;
        boolean z;
        String str5 = (String) C0178.n(26978, null, new Object[]{(short[]) C0174.n(86055), 1033, Integer.valueOf(C0029.f185 ^ 257), 2457});
        ArrayList arrayList = (ArrayList) C0177.n(37388, this);
        String str6 = (String) C0195.n(19148, null, new Object[]{(short[]) C0174.n(86055), 1043, Integer.valueOf(C0080.f289 ^ 232), 507});
        String str7 = (String) C0162.n(29890, null, new Object[]{(short[]) C0174.n(86055), 1062, Integer.valueOf(C0077.f286 ^ (-412)), 3193});
        String str8 = (String) C0224.n(67549, null, new Object[]{(short[]) C0174.n(86055), 1070, Integer.valueOf(C0124.f333 ^ (-760)), 1790});
        String str9 = (String) C0198.n(43897, null, new Object[]{(short[]) C0174.n(86055), 1073, Integer.valueOf(C0132.f341 ^ (-13)), 2147});
        String str10 = (String) C0149.n(42779, null, new Object[]{(short[]) C0174.n(86055), 1085, Integer.valueOf(C0029.f185 ^ 259), 2235});
        String str11 = (String) C0162.n(59518, null, new Object[]{(short[]) C0174.n(86055), 1093, Integer.valueOf(C0042.f198 ^ 55), 1523});
        String str12 = (String) C0149.n(36390, null, new Object[]{(short[]) C0174.n(86055), 1105, Integer.valueOf(C0061.f270 ^ (-924)), 2668});
        try {
            String str13 = (String) C0187.n(85372, null, new Object[]{(String) C0198.n(62249, null, new Object[]{(short[]) C0174.n(86055), 1111, Integer.valueOf(C0035.f191 ^ 300), 1595})});
            boolean zBooleanValue = ((Boolean) C0195.n(5730, str13, new Object[0])).booleanValue();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = !zBooleanValue ? 1709 : 1678;
                        break;
                    case 204:
                        JsonObject jsonObject = (JsonObject) C0174.n(3898, null, new Object[]{str13});
                        boolean zBooleanValue2 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{str12})).booleanValue();
                        String str14 = (String) C0195.n(43185);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = zBooleanValue2 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    str = str14;
                                    break;
                                case 500:
                                    str = (String) C0170.n(10931, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str12}), new Object[0]);
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = 48674;
                                                continue;
                                            case 47483:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.a = str;
                        boolean zBooleanValue3 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{str11})).booleanValue();
                        int i5 = 48767;
                        while (true) {
                            i5 ^= 48784;
                            switch (i5) {
                                case 14:
                                    break;
                                case 45:
                                    str2 = str14;
                                    break;
                                case 76:
                                    str2 = (String) C0170.n(10931, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str11}), new Object[0]);
                                    int i6 = 48891;
                                    while (true) {
                                        i6 ^= 48908;
                                        switch (i6) {
                                            case 22:
                                                break;
                                            case 503:
                                                i6 = 48922;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 239:
                                    i5 = zBooleanValue3 ? 48860 : 48829;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.b = str2;
                        boolean zBooleanValue4 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{str10})).booleanValue();
                        int i7 = 49666;
                        while (true) {
                            i7 ^= 49683;
                            switch (i7) {
                                case 17:
                                    i7 = zBooleanValue4 ? 49759 : 49728;
                                    break;
                                case 50:
                                    break;
                                case 76:
                                    str3 = (String) C0170.n(10931, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str10}), new Object[0]);
                                    int i8 = 49790;
                                    while (true) {
                                        i8 ^= 49807;
                                        switch (i8) {
                                            case 18:
                                                break;
                                            case 241:
                                                i8 = 49821;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 83:
                                    str3 = str14;
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.c = str3;
                        boolean zBooleanValue5 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{str9})).booleanValue();
                        int i9 = 49914;
                        while (true) {
                            i9 ^= 49931;
                            switch (i9) {
                                case 497:
                                    i9 = zBooleanValue5 ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    str4 = str14;
                                    break;
                                case 1769:
                                    str4 = (String) C0170.n(10931, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str9}), new Object[0]);
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.d = str4;
                        boolean zBooleanValue6 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{str8})).booleanValue();
                        int i10 = 50689;
                        while (true) {
                            i10 ^= 50706;
                            switch (i10) {
                                case 19:
                                    i10 = zBooleanValue6 ? 50782 : 50751;
                                    break;
                                case 45:
                                    jLongValue = 0;
                                    break;
                                case 50:
                                    break;
                                case 76:
                                    jLongValue = ((Long) C0177.n(79691, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str8}), new Object[0])).longValue();
                                    int i11 = 50813;
                                    while (true) {
                                        i11 ^= 50830;
                                        switch (i11) {
                                            case 18:
                                                break;
                                            case 243:
                                                i11 = 50844;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.e = jLongValue;
                        boolean zBooleanValue7 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{str7})).booleanValue();
                        int i12 = 51588;
                        while (true) {
                            i12 ^= 51605;
                            switch (i12) {
                                case 17:
                                    if (zBooleanValue7) {
                                        i12 = 51681;
                                    }
                                    break;
                                case 54:
                                    break;
                                case 87:
                                    iIntValue2 = 1;
                                    break;
                                case 116:
                                    iIntValue2 = ((Integer) C0177.n(28206, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str7}), new Object[0])).intValue();
                                    int i13 = 51712;
                                    while (true) {
                                        i13 ^= 51729;
                                        switch (i13) {
                                            case 14:
                                                break;
                                            case 17:
                                                i13 = 51743;
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i12 = 51650;
                        }
                        this.i = iIntValue2;
                        boolean zBooleanValue8 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{str6})).booleanValue();
                        int i14 = 0;
                        int i15 = 51836;
                        while (true) {
                            i15 ^= 51853;
                            switch (i15) {
                                case 241:
                                    i15 = zBooleanValue8 ? 52580 : 52549;
                                    break;
                                case 1963:
                                    break;
                                case 1992:
                                    z = false;
                                    break;
                                case 2025:
                                    boolean zBooleanValue9 = ((Boolean) C0170.n(90259, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str6}), new Object[0])).booleanValue();
                                    int i16 = 52611;
                                    while (true) {
                                        i16 ^= 52628;
                                        switch (i16) {
                                            case 23:
                                                i16 = zBooleanValue9 ? 52704 : 52673;
                                                break;
                                            case 54:
                                                break;
                                            case 85:
                                                z = false;
                                                break;
                                            case 116:
                                                int i17 = 52735;
                                                while (true) {
                                                    i17 ^= 52752;
                                                    switch (i17) {
                                                        case 14:
                                                            z = true;
                                                            break;
                                                        case 1007:
                                                            i17 = 52766;
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        this.j = z;
                        C0233.n(63646, arrayList, new Object[0]);
                        boolean zBooleanValue10 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{str5})).booleanValue();
                        int i18 = 53510;
                        while (true) {
                            i18 ^= 53527;
                            switch (i18) {
                                case 17:
                                    i18 = zBooleanValue10 ? 53603 : 53572;
                                    break;
                                case 50:
                                    break;
                                case 83:
                                    break;
                                case 116:
                                    JsonArray jsonArray = (JsonArray) C0177.n(62800, jsonObject, new Object[]{str5});
                                    while (true) {
                                        int iIntValue3 = ((Integer) C0177.n(75774, jsonArray, new Object[0])).intValue();
                                        int i19 = 53634;
                                        while (true) {
                                            i19 ^= 53651;
                                            switch (i19) {
                                                case 17:
                                                    i19 = i14 < iIntValue3 ? 53727 : 53696;
                                                    break;
                                                case 50:
                                                    break;
                                                case 76:
                                                    ((Boolean) C0179.n(13382, arrayList, new Object[]{(String) C0170.n(10931, (JsonElement) C0177.n(71588, jsonArray, new Object[]{Integer.valueOf(i14)}), new Object[0])})).booleanValue();
                                                    i14 += C0084.f293 ^ (-387);
                                                    int i20 = 53758;
                                                    while (true) {
                                                        i20 ^= 53775;
                                                        switch (i20) {
                                                            case 1009:
                                                                i20 = 54440;
                                                                break;
                                                            case 1703:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 83:
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
            }
            while (true) {
                i ^= 54550;
                switch (i) {
                    case 19:
                        if (iIntValue >= 0) {
                            i = 54626;
                        }
                        break;
                    case 50:
                        break;
                    case 85:
                        return;
                    case 116:
                        C0152.n(87951, (PrintStream) C0195.n(72538), new Object[]{Float.valueOf(((Float) C0152.n(24313, null, new Object[]{(String) C0188.n(85632, null, new Object[]{(String) C0177.n(64210)})})).floatValue())});
                        return;
                    default:
                        continue;
                }
                i = 54595;
            }
        } catch (Exception e) {
            int i21 = 54657;
            while (true) {
                i21 ^= 54674;
                switch (i21) {
                    case 19:
                        i21 = 54688;
                        continue;
                    case 50:
                        break;
                    default:
                        continue;
                }
            }
        }
        iIntValue = ((Integer) C0197.n(82495, null, new Object[0])).intValue();
        i = 54533;
    }

    public final N t(long j, String str, HashMap map, long j2) throws Throwable {
        String str2;
        long jLongValue = ((Long) C0149.n(56518, null, new Object[]{Long.valueOf((-30145) ^ ((long) C0134.f343)), Long.valueOf(((Long) C0168.n(30120, (TimeUnit) C0168.n(7737), new Object[]{Long.valueOf(j2 - ((Long) C0182.n(75677, null, new Object[0])).longValue())})).longValue())})).longValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = j >= 0 ? 1709 : 1678;
                    break;
                case 204:
                    long jLongValue2 = ((Long) C0175.n(72334, (AtomicLong) C0170.n(63799, this), new Object[0])).longValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = j == jLongValue2 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IOException((String) C0162.n(29890, null, new Object[]{(short[]) C0174.n(86055), 1139, Integer.valueOf(C0025.f181 ^ (-674)), 1287}));
                            case 500:
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        boolean zBooleanValue = ((Boolean) C0195.n(23046, (Thread) C0195.n(50425, null, new Object[0]), new Object[0])).booleanValue();
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    i3 = !zBooleanValue ? 48736 : 48705;
                    break;
                case 47384:
                    break;
                case 47417:
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                                break;
                            case 45:
                                break;
                            case 76:
                                Request request = (Request) C0188.n(95309, (Request.Builder) C0177.n(36532, (Request.Builder) C0177.n(5807, null, new Object[]{str}), new Object[]{(Headers) C0177.n(13361, null, new Object[]{map})}), new Object[0]);
                                Response response = (Response) C0150.n(80346, null, new Object[]{request, Long.valueOf(jLongValue)});
                                try {
                                    boolean zBooleanValue2 = ((Boolean) C0179.n(30461, (String) C0177.n(76649, (HttpUrl) C0177.n(25809, request, new Object[0]), new Object[0]), new Object[]{(String) C0149.n(61324, null, new Object[]{(short[]) C0174.n(86055), 1127, Integer.valueOf(C0132.f341 ^ (-13)), 2573})})).booleanValue();
                                    int i5 = 48891;
                                    while (true) {
                                        i5 ^= 48908;
                                        switch (i5) {
                                            case 22:
                                                break;
                                            case 53:
                                                str2 = (String) C0177.n(1264, null, new Object[]{response});
                                                break;
                                            case 503:
                                                if (zBooleanValue2) {
                                                    i5 = 49635;
                                                }
                                                break;
                                            case 32495:
                                                String str3 = (String) C0195.n(43185);
                                                int i6 = 49666;
                                                while (true) {
                                                    i6 ^= 49683;
                                                    switch (i6) {
                                                        case 17:
                                                            i6 = 49697;
                                                            break;
                                                        case 50:
                                                            str2 = str3;
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i5 = 48953;
                                    }
                                    N n = new N(((Integer) C0188.n(85911, response, new Object[0])).intValue(), str2, (Map) C0188.n(40316, (Headers) C0188.n(28316, response, new Object[0]), new Object[0]));
                                    C0188.n(37526, response, new Object[0]);
                                    return n;
                                } catch (Throwable th) {
                                    int i7 = 49790;
                                    while (true) {
                                        i7 ^= 49807;
                                        switch (i7) {
                                            case 18:
                                                int i8 = 49914;
                                                while (true) {
                                                    i8 ^= 49931;
                                                    switch (i8) {
                                                        case 497:
                                                            if (response != null) {
                                                                i8 = 50658;
                                                            }
                                                            break;
                                                        case 1711:
                                                            break;
                                                        case 1736:
                                                            break;
                                                        case 1769:
                                                            try {
                                                                C0188.n(37526, response, new Object[0]);
                                                                int i9 = 50689;
                                                                while (true) {
                                                                    i9 ^= 50706;
                                                                    switch (i9) {
                                                                        case 19:
                                                                            i9 = 50720;
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                    }
                                                                }
                                                            } catch (Throwable th2) {
                                                                C0216.n(87692, th, new Object[]{th2});
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i8 = 50627;
                                                }
                                                throw th;
                                            case 241:
                                                i7 = 49821;
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 239:
                                i4 = jLongValue > 0 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 47483:
                    break;
                default:
                    break;
            }
        }
        throw new IOException((String) C0162.n(29890, null, new Object[]{(short[]) C0174.n(86055), 1139, Integer.valueOf(C0025.f181 ^ (-674)), 1287}));
    }

    public final void v(long j) throws Throwable {
        synchronized (this) {
            try {
                long jLongValue = ((Long) C0170.n(96314, this)).longValue();
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            if (j != jLongValue) {
                                i = 1709;
                            }
                            break;
                        case 204:
                            return;
                        case 239:
                            boolean zBooleanValue = ((Boolean) C0177.n(55659, null, new Object[]{(String) C0177.n(31508, this)})).booleanValue();
                            int i2 = 1864;
                            while (true) {
                                i2 ^= 1881;
                                switch (i2) {
                                    case 17:
                                        i2 = !zBooleanValue ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        break;
                                    case 47417:
                                        boolean zBooleanValue2 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0177.n(41804, this)})).booleanValue();
                                        int i3 = 48767;
                                        while (true) {
                                            i3 ^= 48784;
                                            switch (i3) {
                                                case 14:
                                                    break;
                                                case 45:
                                                    break;
                                                case 76:
                                                    long jLongValue2 = ((Long) C0177.n(29049, this)).longValue();
                                                    int i4 = 48891;
                                                    while (true) {
                                                        i4 ^= 48908;
                                                        switch (i4) {
                                                            case 22:
                                                                break;
                                                            case 53:
                                                                break;
                                                            case 503:
                                                                i4 = jLongValue2 <= 0 ? 49635 : 48953;
                                                                break;
                                                            case 32495:
                                                                return;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 239:
                                                    i3 = zBooleanValue2 ? 48860 : 48829;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 47483:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            this.a = (String) C0195.n(43185);
                            this.b = (String) C0195.n(43185);
                            this.c = (String) C0195.n(43185);
                            this.e = 0L;
                            this.n = ((Long) C0170.n(96314, this)).longValue() + 1;
                            C0177.n(29436, this, new Object[0]);
                            C0177.n(31020, null, new Object[0]);
                            C0153.n(4962, null, new Object[]{(String) C0149.n(60368, null, new Object[]{(short[]) C0174.n(86055), 1149, Integer.valueOf(C0078.f287 ^ (-694)), 370})});
                            return;
                        default:
                            continue;
                    }
                    i = 1678;
                }
            } catch (Throwable th) {
                int i5 = 1740;
                while (true) {
                    i5 ^= 1757;
                    switch (i5) {
                        case 17:
                            i5 = 1771;
                            break;
                        case 54:
                            throw th;
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x041b. Please report as an issue. */
    public final void z() throws Throwable {
        JsonObject jsonObject;
        String str = (String) C0198.n(62249, null, new Object[]{(short[]) C0174.n(86055), 1153, Integer.valueOf(C0042.f198 ^ 49), 1814});
        String str2 = (String) C0195.n(75793, null, new Object[]{(short[]) C0174.n(86055), 1163, Integer.valueOf(C0005.f161 ^ 649), 1769});
        String str3 = (String) C0182.n(27462, null, new Object[]{(short[]) C0174.n(86055), 1171, Integer.valueOf(C0088.f297 ^ 507), 1632});
        try {
            String str4 = (String) C0187.n(85372, null, new Object[]{str3});
            boolean zBooleanValue = ((Boolean) C0195.n(5730, str4, new Object[0])).booleanValue();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = !zBooleanValue ? 1709 : 1678;
                        break;
                    case 204:
                        JsonObject jsonObject2 = (JsonObject) C0174.n(3898, null, new Object[]{str4});
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = 1771;
                                    continue;
                                case 54:
                                    jsonObject = jsonObject2;
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 239:
                        jsonObject = new JsonObject();
                        break;
                    default:
                        break;
                }
            }
            String str5 = (String) C0152.n(85600, null, new Object[]{(short[]) C0174.n(86055), 1187, Integer.valueOf(C0124.f333 ^ (-755)), 1782});
            String str6 = (String) C0177.n(31508, this);
            String str7 = (String) C0195.n(43185);
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        i3 = str6 != null ? 48736 : 48705;
                        break;
                    case 47384:
                        str6 = str7;
                        break;
                    case 47417:
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 239:
                                    i4 = 48798;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 47483:
                        break;
                    default:
                        break;
                }
            }
            C0224.n(32688, jsonObject, new Object[]{str5, str6});
            String str8 = (String) C0162.n(59839, null, new Object[]{(short[]) C0174.n(86055), 1193, Integer.valueOf(C0058.f267 ^ 107), 2158});
            String str9 = (String) C0177.n(77975, this);
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                        break;
                    case 53:
                        str9 = str7;
                        break;
                    case 503:
                        if (str9 != null) {
                            i5 = 49635;
                        }
                        break;
                    case 32495:
                        int i6 = 49666;
                        while (true) {
                            i6 ^= 49683;
                            switch (i6) {
                                case 17:
                                    i6 = 49697;
                                    break;
                                case 50:
                                    break;
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i5 = 48953;
            }
            C0224.n(32688, jsonObject, new Object[]{str8, str9});
            String str10 = (String) C0198.n(43897, null, new Object[]{(short[]) C0174.n(86055), 1205, Integer.valueOf(C0060.f269 ^ (-970)), 805});
            String str11 = (String) C0177.n(41804, this);
            int i7 = 49790;
            while (true) {
                i7 ^= 49807;
                switch (i7) {
                    case 18:
                        break;
                    case 51:
                        str11 = str7;
                        break;
                    case 84:
                        int i8 = 49914;
                        while (true) {
                            i8 ^= 49931;
                            switch (i8) {
                                case 497:
                                    i8 = 50596;
                                    continue;
                                case 1711:
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 241:
                        i7 = str11 != null ? 49883 : 49852;
                        break;
                    default:
                        break;
                }
            }
            C0224.n(32688, jsonObject, new Object[]{str10, str11});
            String str12 = (String) C0149.n(36390, null, new Object[]{(short[]) C0174.n(86055), 1213, Integer.valueOf(C0129.f338 ^ 926), 820});
            String str13 = (String) C0177.n(28842, this);
            int i9 = 50689;
            while (true) {
                i9 ^= 50706;
                switch (i9) {
                    case 19:
                        i9 = str13 != null ? 50782 : 50751;
                        break;
                    case 45:
                        str13 = str7;
                        break;
                    case 50:
                        break;
                    case 76:
                        break;
                    default:
                        break;
                }
            }
            C0224.n(32688, jsonObject, new Object[]{str12, str13});
            C0177.n(28247, jsonObject, new Object[]{(String) C0149.n(63176, null, new Object[]{(short[]) C0174.n(86055), 1225, Integer.valueOf(C0025.f181 ^ (-681)), 435}), (Long) C0219.n(85607, null, new Object[]{Long.valueOf(((Long) C0177.n(29049, this)).longValue())})});
            boolean zBooleanValue2 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{str2})).booleanValue();
            int i10 = 50813;
            while (true) {
                i10 ^= 50830;
                switch (i10) {
                    case 18:
                        break;
                    case 53:
                        break;
                    case 243:
                        i10 = !zBooleanValue2 ? 51557 : 50875;
                        break;
                    case 4075:
                        C0177.n(28247, jsonObject, new Object[]{str2, (Integer) C0182.n(76256, null, new Object[]{Integer.valueOf(((Integer) C0177.n(76194, this)).intValue())})});
                        break;
                    default:
                        break;
                }
            }
            C0224.n(88828, jsonObject, new Object[]{(String) C0224.n(52346, null, new Object[]{(short[]) C0174.n(86055), 1228, Integer.valueOf(C0080.f289 ^ 232), 2295}), (Boolean) C0224.n(34197, null, new Object[]{Boolean.valueOf(((Boolean) C0177.n(19303, this)).booleanValue())})});
            boolean zBooleanValue3 = ((Boolean) C0174.n(5787, jsonObject, new Object[]{str})).booleanValue();
            int i11 = 51588;
            while (true) {
                i11 ^= 51605;
                switch (i11) {
                    case 17:
                        if (!zBooleanValue3) {
                            i11 = 51681;
                        }
                        break;
                    case 54:
                        break;
                    case 87:
                        break;
                    case 116:
                        JsonArray jsonArray = new JsonArray();
                        Iterator it = (Iterator) C0147.n(15046, (ArrayList) C0177.n(37388, this), new Object[0]);
                        while (true) {
                            boolean zBooleanValue4 = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
                            int i12 = 51712;
                            while (true) {
                                i12 ^= 51729;
                                switch (i12) {
                                    case 14:
                                        break;
                                    case 17:
                                        i12 = zBooleanValue4 ? 51805 : 51774;
                                        break;
                                    case 47:
                                        break;
                                    case 76:
                                        break;
                                    default:
                                        break;
                                }
                                C0177.n(97005, jsonObject, new Object[]{str, jsonArray});
                                break;
                            }
                            C0177.n(66135, jsonArray, new Object[]{(String) C0221.n(87284, it, new Object[0])});
                            int i13 = 51836;
                            while (true) {
                                i13 ^= 51853;
                                switch (i13) {
                                    case 241:
                                        i13 = 52518;
                                        break;
                                    case 1963:
                                        break;
                                }
                            }
                        }
                        break;
                    default:
                        continue;
                }
                i11 = 51650;
            }
            C0188.n(35332, null, new Object[]{str3, (String) C0177.n(98717, jsonObject, new Object[0])});
        } catch (Exception e) {
            int i14 = 52611;
            while (true) {
                i14 ^= 52628;
                switch (i14) {
                    case 23:
                        i14 = 52642;
                        break;
                    case 54:
                        return;
                }
            }
        }
    }
}
