package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.C0141;
import com.github.catvod.spider.merge.B.C0005;
import com.github.catvod.spider.merge.E.C0013;
import com.github.catvod.spider.merge.E.C0015;
import com.github.catvod.spider.merge.G.C0022;
import com.github.catvod.spider.merge.G.C0023;
import com.github.catvod.spider.merge.L.C0033;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.N.C0035;
import com.github.catvod.spider.merge.N.C0036;
import com.github.catvod.spider.merge.N.C0037;
import com.github.catvod.spider.merge.O.C0039;
import com.github.catvod.spider.merge.Q.C0040;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.T.C0048;
import com.github.catvod.spider.merge.X.C0051;
import com.github.catvod.spider.merge.Z.C0054;
import com.github.catvod.spider.merge.b0.C0060;
import com.github.catvod.spider.merge.b0.C0061;
import com.github.catvod.spider.merge.d0.C0068;
import com.github.catvod.spider.merge.f0.C0078;
import com.github.catvod.spider.merge.h0.C0086;
import com.github.catvod.spider.merge.k0.C0099;
import com.github.catvod.spider.merge.p0.C0110;
import com.github.catvod.spider.merge.p0.C0111;
import com.github.catvod.spider.merge.p007h.C0083;
import com.github.catvod.spider.merge.p007h.C0084;
import com.github.catvod.spider.merge.p008i.C0088;
import com.github.catvod.spider.merge.p011m.C0102;
import com.github.catvod.spider.merge.p013o.C0108;
import com.github.catvod.spider.merge.p018v.C0131;
import com.github.catvod.spider.merge.p019w.C0134;
import com.github.catvod.spider.merge.p020x.C0138;
import com.github.catvod.spider.merge.t0.C0123;
import com.github.catvod.spider.merge.t0.C0124;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import moyu.fucking.C0149;
import moyu.fucking.C0151;
import moyu.fucking.C0152;
import moyu.fucking.C0155;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0173;
import moyu.fucking.C0178;
import moyu.fucking.C0179;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0186;
import moyu.fucking.C0188;
import moyu.fucking.C0191;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0219;
import moyu.fucking.C0221;
import moyu.fucking.C0224;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0286p1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f147short = {2509, 2502, 2502, 2462, 2457, 2444, 2463, 2457, 2509, 2461, 2463, 2434, 2453, 2452, 2519, 1150, 1141, 1141, 1070, 1068, 1073, 1062, 1063, 1150, 1067, 1068, 1074, 1124, 2648, 2643, 2643, 2568, 2570, 2583, 2560, 2561, 2648, 2576, 2589, 2585, 2588, 2589, 2570, 2626, 1394, 1401, 1401, 1335, 1340, 1334, 1394, 1314, 1312, 1341, 1322, 1323, 1384, 2376, 2371, 2371, 2328, 2330, 2311, 2320, 2321, 2376, 2330, 2317, 2331, 2376, 2315, 2311, 2316, 2317, 2386, 2266, 2257, 2257, 2186, 2184, 2197, 2178, 2179, 2266, 2184, 2207, 2185, 2266, 2194, 2207, 2203, 2206, 2207, 2184, 2240, 874, 838, 839, 861, 844, 839, 861, 772, 893, 848, 857, 844, 889, 885, 884, 878, 895, 884, 878, 823, 878, 867, 874, 895, 2124, 2144, 2145, 2171, 2154, 2145, 2171, 2082, 2123, 2150, 2172, 2175, 2144, 2172, 2150, 2171, 2150, 2144, 2145, 1177, 1242, 1223, 1155, 262, 281, 276, 277, 287, 351, 285, 256, 324, 942, 1015, 997, 994, 1005, 1951, 1920, 1933, 1932, 1926, 1990, 1950, 1932, 1931, 1924, 794, 853, 834, 861, 2826, 2837, 2840, 2841, 2835, 2899, 2820, 2897, 2833, 2831, 2826, 2837, 2840, 2841, 2835, 2934, 2863, 2869, 2862, 1545, 1558, 1563, 1562, 1552, 1616, 1543, 1618, 1554, 1548, 1618, 1544, 1554, 1545, 1199, 1255, 1261, 1271, 2436, 2459, 2454, 2455, 2461, 2525, 2442, 2527, 2452, 2462, 2436, 1101, 1038, 1036, 1045, 951, 936, 933, 932, 942, 1006, 944, 948, 936, 930, 938, 949, 936, 940, 932, 2349, 2414, 2408, 2421, 3088, 3087, 3074, 3075, 3081, 3145, 3102, 3147, 3083, 3079, 3090, 3092, 3081, 3093, 3085, 3079, 2068, 2135, 2122, 2143, 2141, 2947, 2972, 2961, 2960, 2970, 3034, 2968, 2949, 2960, 2962, 1935, 1938, 1990, 2001, 2600, 2615, 2618, 2619, 2609, 2673, 2669, 2617, 2606, 2606, 911, 981, 978, 1213, 1186, 1199, 1198, 1188, 1252, 1158, 1179, 1273, 1183, 2966, 3029, 3016, 2955, 3309, 3321, 3304, 3301, 3299, 3235, 3297, 3324, 3263, 3119, 3190, 3168, 3191, 2917, 2929, 2912, 2925, 2923, 2859, 2931, 2917, 2930, 1034, 1093, 1093, 1095, 2932, 2912, 2929, 2940, 2938, 2874, 2932, 2932, 2934, 1936, 1936, 1995, 1993, 2004, 1987, 1986, 1947, 1993, 2014, 1992, 1947, 2008, 2004, 2005, 1999, 2014, 2005, 1999, 2031, 1986, 1995, 2014, 1921, 716, 716, 663, 661, 648, 671, 670, 711, 661, 642, 660, 711, 661, 642, 660, 663, 687, 642, 646, 643, 642, 661, 660, 733, 1010, 976, 973, 986, 987, 898, 967, 976, 976, 973, 976, 920, 898, 920, 1005, 916, 936, 946, 933, 929, 932, 1005, 910, 949, 941, 2276, 2193, 2303, 2260, 2249, 2258, 2263, 2193, 2287, 2261, 2246, 2265, 1550, 1659, 1552, 1591, 1597, 1587, 1659, 1566, 1587, 1591, 1586, 1587, 1572, 1541, 3061, 3059, 3060, 3044, 2810, 2811, 2793, 2690, 2711, 2616, 2601, 2612, 2616, 2659, 2620, 2592, 2605, 2597, 2594, 2679, 2668, 2607, 2596, 2605, 2622, 2623, 2601, 2616, 2673, 2617, 2616, 2602, 2657, 2676, 3172, 3142, 3163, 3148, 3149, 3092, 3153, 3142, 3142, 3163, 3142, 2682, 2667, 2678, 2682, 2593, 2686, 2658, 2671, 2663, 2656};

    public C0286p1() throws Throwable {
        int iIntValue = ((Integer) C0149.n(85906, null, new Object[0])).intValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iIntValue >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0195.n(83584, null, new Object[]{(String) C0173.n(90956)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x04b4. Please report as an issue. */
    public static Object[] a(String str, Map map) throws Throwable {
        Headers headers;
        String str2;
        C0152.n(11548, null, new Object[]{(String) C0181.n(53852, null, new Object[]{(short[]) C0173.n(76589), 0, Integer.valueOf(C0048.f204 ^ 859), 2541})});
        StringBuilder sb = new StringBuilder((String) C0162.n(13243, null, new Object[]{(short[]) C0173.n(76589), 15, Integer.valueOf(C0054.f210 ^ (-648)), 1118}));
        C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb, new Object[0])});
        StringBuilder sb2 = new StringBuilder((String) C0224.n(99346, null, new Object[]{(short[]) C0173.n(76589), 28, Integer.valueOf(C0086.f295 ^ (-323)), 2680}));
        C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb2, new Object[0])});
        Response response = (Response) C0173.n(18516, null, new Object[]{str, map});
        C0152.n(11548, null, new Object[]{(String) C0149.n(61324, null, new Object[]{(short[]) C0173.n(76589), 44, Integer.valueOf(C0088.f297 ^ 486), 1362})});
        StringBuilder sb3 = new StringBuilder((String) C0195.n(75793, null, new Object[]{(short[]) C0173.n(76589), 57, Integer.valueOf(C0138.f347 ^ 282), 2408}));
        C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb3, new Object[0])});
        StringBuilder sb4 = new StringBuilder((String) C0198.n(71923, null, new Object[]{(short[]) C0173.n(76589), 75, Integer.valueOf(C0141.f351 ^ (-795)), 2298}));
        C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb4, new Object[0])});
        Headers headers2 = (Headers) C0188.n(28316, response, new Object[0]);
        String str3 = (String) C0149.n(36390, null, new Object[]{(short[]) C0173.n(76589), 95, Integer.valueOf(C0036.f192 ^ (-40)), 809});
        boolean zBooleanValue = ((Boolean) C0173.n(75774, null, new Object[]{new CharSequence[]{(String) C0173.n(60171, headers2, new Object[]{str3})}})).booleanValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = zBooleanValue ? 1709 : 1678;
                    break;
                case 204:
                    headers = (Headers) C0188.n(28316, response, new Object[0]);
                    str3 = (String) C0162.n(24506, null, new Object[]{(short[]) C0173.n(76589), 107, Integer.valueOf(C0034.f190 ^ 136), 794});
                    break;
                case 239:
                    headers = (Headers) C0188.n(28316, response, new Object[0]);
                    int i2 = 1864;
                    while (true) {
                        i2 ^= 1881;
                        switch (i2) {
                            case 17:
                                i2 = 48674;
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
        String str4 = (String) C0173.n(60171, headers, new Object[]{str3});
        int i3 = 1740;
        while (true) {
            i3 ^= 1757;
            switch (i3) {
                case 17:
                    i3 = 1771;
                    break;
                case 54:
                    String str5 = (String) C0173.n(60171, (Headers) C0188.n(28316, response, new Object[0]), new Object[]{(String) C0198.n(51837, null, new Object[]{(short[]) C0173.n(76589), 119, Integer.valueOf(C0141.f351 ^ (-798)), 2063})});
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                                break;
                            case 45:
                                str2 = str4;
                                break;
                            case 76:
                                boolean zBooleanValue2 = ((Boolean) C0173.n(75774, null, new Object[]{new CharSequence[]{str4}})).booleanValue();
                                int i5 = 48891;
                                while (true) {
                                    i5 ^= 48908;
                                    switch (i5) {
                                        case 22:
                                            break;
                                        case 53:
                                            str2 = str4;
                                            break;
                                        case 503:
                                            i5 = zBooleanValue2 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            boolean zBooleanValue3 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0162.n(29890, null, new Object[]{(short[]) C0173.n(76589), 138, Integer.valueOf(C0061.f270 ^ (-922)), 1207})})).booleanValue();
                                            int i6 = 49666;
                                            while (true) {
                                                i6 ^= 49683;
                                                switch (i6) {
                                                    case 17:
                                                        i6 = zBooleanValue3 ? 49759 : 49728;
                                                        break;
                                                    case 50:
                                                        break;
                                                    case 76:
                                                        String str6 = (String) C0198.n(62249, null, new Object[]{(short[]) C0173.n(76589), 142, Integer.valueOf(C0102.f311 ^ 558), 368});
                                                        int i7 = 49790;
                                                        while (true) {
                                                            i7 ^= 49807;
                                                            switch (i7) {
                                                                case 18:
                                                                    str2 = str6;
                                                                    break;
                                                                case 241:
                                                                    i7 = 49821;
                                                                    continue;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        boolean zBooleanValue4 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0224.n(67549, null, new Object[]{(short[]) C0173.n(76589), 151, Integer.valueOf(C0005.f161 ^ 644), 896})})).booleanValue();
                                                        int i8 = 49914;
                                                        while (true) {
                                                            i8 ^= 49931;
                                                            switch (i8) {
                                                                case 497:
                                                                    i8 = zBooleanValue4 ? 50658 : 50627;
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                                case 1736:
                                                                    boolean zBooleanValue5 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0198.n(14698, null, new Object[]{(short[]) C0173.n(76589), 166, Integer.valueOf(C0108.f317 ^ (-376)), 820})})).booleanValue();
                                                                    int i9 = 50813;
                                                                    while (true) {
                                                                        i9 ^= 50830;
                                                                        switch (i9) {
                                                                            case 18:
                                                                                break;
                                                                            case 53:
                                                                                boolean zBooleanValue6 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0149.n(56487, null, new Object[]{(short[]) C0173.n(76589), 185, Integer.valueOf(C0051.f207 ^ (-374)), 2904})})).booleanValue();
                                                                                int i10 = 51712;
                                                                                while (true) {
                                                                                    i10 ^= 51729;
                                                                                    switch (i10) {
                                                                                        case 14:
                                                                                            break;
                                                                                        case 17:
                                                                                            i10 = zBooleanValue6 ? 51805 : 51774;
                                                                                            break;
                                                                                        case 47:
                                                                                            boolean zBooleanValue7 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0195.n(19148, null, new Object[]{(short[]) C0173.n(76589), 203, Integer.valueOf(C0078.f287 ^ (-694)), 1153})})).booleanValue();
                                                                                            int i11 = 52611;
                                                                                            while (true) {
                                                                                                i11 ^= 52628;
                                                                                                switch (i11) {
                                                                                                    case 23:
                                                                                                        i11 = zBooleanValue7 ? 52704 : 52673;
                                                                                                        break;
                                                                                                    case 54:
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        boolean zBooleanValue8 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0224.n(67549, null, new Object[]{(short[]) C0173.n(76589), 218, Integer.valueOf(C0054.f210 ^ (-655)), 1123})})).booleanValue();
                                                                                                        int i12 = 53510;
                                                                                                        while (true) {
                                                                                                            i12 ^= 53527;
                                                                                                            switch (i12) {
                                                                                                                case 17:
                                                                                                                    i12 = zBooleanValue8 ? 53603 : 53572;
                                                                                                                    break;
                                                                                                                case 50:
                                                                                                                    break;
                                                                                                                case 83:
                                                                                                                    boolean zBooleanValue9 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0224.n(99346, null, new Object[]{(short[]) C0173.n(76589), 237, Integer.valueOf(C0111.f320 ^ (-936)), 2307})})).booleanValue();
                                                                                                                    int i13 = 53758;
                                                                                                                    while (true) {
                                                                                                                        i13 ^= 53775;
                                                                                                                        switch (i13) {
                                                                                                                            case 1009:
                                                                                                                                i13 = zBooleanValue9 ? 54502 : 54471;
                                                                                                                                break;
                                                                                                                            case 1703:
                                                                                                                                break;
                                                                                                                            case 1736:
                                                                                                                                boolean zBooleanValue10 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0198.n(30341, null, new Object[]{(short[]) C0173.n(76589), 257, Integer.valueOf(C0131.f340 ^ 729), 2106})})).booleanValue();
                                                                                                                                int i14 = 54657;
                                                                                                                                while (true) {
                                                                                                                                    i14 ^= 54674;
                                                                                                                                    switch (i14) {
                                                                                                                                        case 19:
                                                                                                                                            i14 = zBooleanValue10 ? 55401 : 54719;
                                                                                                                                            break;
                                                                                                                                        case 45:
                                                                                                                                            boolean zBooleanValue11 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0178.n(80760, null, new Object[]{(short[]) C0173.n(76589), 272, Integer.valueOf(C0040.f196 ^ (-329)), 1953})})).booleanValue();
                                                                                                                                            int i15 = 55556;
                                                                                                                                            while (true) {
                                                                                                                                                i15 ^= 55573;
                                                                                                                                                switch (i15) {
                                                                                                                                                    case 17:
                                                                                                                                                        i15 = zBooleanValue11 ? 55649 : 55618;
                                                                                                                                                        break;
                                                                                                                                                    case 54:
                                                                                                                                                        break;
                                                                                                                                                    case 87:
                                                                                                                                                        boolean zBooleanValue12 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0195.n(85847, null, new Object[]{(short[]) C0173.n(76589), 286, Integer.valueOf(C0110.f319 ^ (-545)), 929})})).booleanValue();
                                                                                                                                                        int i16 = 56455;
                                                                                                                                                        while (true) {
                                                                                                                                                            i16 ^= 56472;
                                                                                                                                                            switch (i16) {
                                                                                                                                                                case 31:
                                                                                                                                                                    i16 = zBooleanValue12 ? 56548 : 56517;
                                                                                                                                                                    break;
                                                                                                                                                                case 62:
                                                                                                                                                                    break;
                                                                                                                                                                case 93:
                                                                                                                                                                    boolean zBooleanValue13 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0181.n(92093, null, new Object[]{(short[]) C0173.n(76589), 299, Integer.valueOf(C0039.f195 ^ 794), 3000})})).booleanValue();
                                                                                                                                                                    int i17 = 1507503;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i17 ^= 1507520;
                                                                                                                                                                        switch (i17) {
                                                                                                                                                                            case 14:
                                                                                                                                                                                break;
                                                                                                                                                                            case 45:
                                                                                                                                                                                boolean zBooleanValue14 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0224.n(52346, null, new Object[]{(short[]) C0173.n(76589), 312, Integer.valueOf(C0068.f277 ^ 353), 3073})})).booleanValue();
                                                                                                                                                                                int i18 = 1507751;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i18 ^= 1507768;
                                                                                                                                                                                    switch (i18) {
                                                                                                                                                                                        case 31:
                                                                                                                                                                                            i18 = zBooleanValue14 ? 1508495 : 1508464;
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 1335:
                                                                                                                                                                                            String str7 = (String) C0162.n(41206, null, new Object[]{(short[]) C0173.n(76589), 316, Integer.valueOf(C0023.f179 ^ 690), 2820});
                                                                                                                                                                                            int i19 = 1508526;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                i19 ^= 1508543;
                                                                                                                                                                                                switch (i19) {
                                                                                                                                                                                                    case 17:
                                                                                                                                                                                                        i19 = 1508557;
                                                                                                                                                                                                        continue;
                                                                                                                                                                                                    case 114:
                                                                                                                                                                                                        str2 = str7;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    default:
                                                                                                                                                                                                        continue;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 1480:
                                                                                                                                                                                            boolean zBooleanValue15 = ((Boolean) C0179.n(30461, str5, new Object[]{(String) C0198.n(51837, null, new Object[]{(short[]) C0173.n(76589), 325, Integer.valueOf(C0110.f319 ^ (-552)), 1060})})).booleanValue();
                                                                                                                                                                                            int i20 = 1508650;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                i20 ^= 1508667;
                                                                                                                                                                                                switch (i20) {
                                                                                                                                                                                                    case 17:
                                                                                                                                                                                                        i20 = zBooleanValue15 ? 1509394 : 1508712;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 83:
                                                                                                                                                                                                        str2 = null;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 114:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 3369:
                                                                                                                                                                                                        String str8 = (String) C0162.n(52865, null, new Object[]{(short[]) C0173.n(76589), 329, Integer.valueOf(C0078.f287 ^ (-697)), 2837});
                                                                                                                                                                                                        int i21 = 1509425;
                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                            i21 ^= 1509442;
                                                                                                                                                                                                            switch (i21) {
                                                                                                                                                                                                                case 18:
                                                                                                                                                                                                                    str2 = str8;
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 115:
                                                                                                                                                                                                                    i21 = 1509456;
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
                                                                                                                                                                                        case 1513:
                                                                                                                                                                                            break;
                                                                                                                                                                                        default:
                                                                                                                                                                                            break;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 111:
                                                                                                                                                                                i17 = zBooleanValue13 ? 1507596 : 1507565;
                                                                                                                                                                                break;
                                                                                                                                                                            case 460:
                                                                                                                                                                                String str9 = (String) C0224.n(30768, null, new Object[]{(short[]) C0173.n(76589), 303, Integer.valueOf(C0042.f198 ^ 50), 3212});
                                                                                                                                                                                int i22 = 1507627;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i22 ^= 1507644;
                                                                                                                                                                                    switch (i22) {
                                                                                                                                                                                        case 23:
                                                                                                                                                                                            i22 = 1507658;
                                                                                                                                                                                            continue;
                                                                                                                                                                                        case 118:
                                                                                                                                                                                            str2 = str9;
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
                                                                                                                                                                case 124:
                                                                                                                                                                    String str10 = (String) C0178.n(80760, null, new Object[]{(short[]) C0173.n(76589), 289, Integer.valueOf(C0042.f198 ^ 49), 1227});
                                                                                                                                                                    int i23 = 56579;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i23 ^= 56596;
                                                                                                                                                                        switch (i23) {
                                                                                                                                                                            case 23:
                                                                                                                                                                                i23 = 56610;
                                                                                                                                                                                continue;
                                                                                                                                                                            case 54:
                                                                                                                                                                                str2 = str10;
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
                                                                                                                                                    case 116:
                                                                                                                                                        String str11 = (String) C0162.n(95122, null, new Object[]{(short[]) C0173.n(76589), 276, Integer.valueOf(C0015.f171 ^ (-932)), 2654});
                                                                                                                                                        int i24 = 55680;
                                                                                                                                                        while (true) {
                                                                                                                                                            i24 ^= 55697;
                                                                                                                                                            switch (i24) {
                                                                                                                                                                case 17:
                                                                                                                                                                    i24 = 56362;
                                                                                                                                                                    continue;
                                                                                                                                                                case 1467:
                                                                                                                                                                    str2 = str11;
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
                                                                                                                                        case 50:
                                                                                                                                            break;
                                                                                                                                        case 3579:
                                                                                                                                            String str12 = (String) C0182.n(7909, null, new Object[]{(short[]) C0173.n(76589), 262, Integer.valueOf(C0084.f293 ^ (-394)), 3061});
                                                                                                                                            int i25 = 55432;
                                                                                                                                            while (true) {
                                                                                                                                                i25 ^= 55449;
                                                                                                                                                switch (i25) {
                                                                                                                                                    case 17:
                                                                                                                                                        i25 = 55463;
                                                                                                                                                        continue;
                                                                                                                                                    case 62:
                                                                                                                                                        str2 = str12;
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
                                                                                                                            case 1769:
                                                                                                                                String str13 = (String) C0198.n(45548, null, new Object[]{(short[]) C0173.n(76589), 241, Integer.valueOf(C0099.f308 ^ 808), 3174});
                                                                                                                                int i26 = 54533;
                                                                                                                                while (true) {
                                                                                                                                    i26 ^= 54550;
                                                                                                                                    switch (i26) {
                                                                                                                                        case 19:
                                                                                                                                            i26 = 54564;
                                                                                                                                            continue;
                                                                                                                                        case 50:
                                                                                                                                            str2 = str13;
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
                                                                                                                case 116:
                                                                                                                    String str14 = (String) C0162.n(13243, null, new Object[]{(short[]) C0173.n(76589), 222, Integer.valueOf(C0078.f287 ^ (-703)), 961});
                                                                                                                    int i27 = 53634;
                                                                                                                    while (true) {
                                                                                                                        i27 ^= 53651;
                                                                                                                        switch (i27) {
                                                                                                                            case 17:
                                                                                                                                i27 = 53665;
                                                                                                                                continue;
                                                                                                                            case 50:
                                                                                                                                str2 = str14;
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
                                                                                                    case 116:
                                                                                                        String str15 = (String) C0162.n(41206, null, new Object[]{(short[]) C0173.n(76589), 207, Integer.valueOf(C0022.f178 ^ 107), 2546});
                                                                                                        int i28 = 52735;
                                                                                                        while (true) {
                                                                                                            i28 ^= 52752;
                                                                                                            switch (i28) {
                                                                                                                case 14:
                                                                                                                    str2 = str15;
                                                                                                                    break;
                                                                                                                case 1007:
                                                                                                                    i28 = 52766;
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
                                                                                        case 76:
                                                                                            String str16 = (String) C0224.n(58480, null, new Object[]{(short[]) C0173.n(76589), 189, Integer.valueOf(C0086.f295 ^ (-349)), 1663});
                                                                                            int i29 = 51836;
                                                                                            while (true) {
                                                                                                i29 ^= 51853;
                                                                                                switch (i29) {
                                                                                                    case 241:
                                                                                                        i29 = 52518;
                                                                                                        continue;
                                                                                                    case 1963:
                                                                                                        str2 = str16;
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
                                                                            case 243:
                                                                                i9 = zBooleanValue5 ? 51557 : 50875;
                                                                                break;
                                                                            case 4075:
                                                                                String str17 = (String) C0149.n(63176, null, new Object[]{(short[]) C0173.n(76589), 170, Integer.valueOf(C0035.f191 ^ 307), 2940});
                                                                                int i30 = 51588;
                                                                                while (true) {
                                                                                    i30 ^= 51605;
                                                                                    switch (i30) {
                                                                                        case 17:
                                                                                            i30 = 51619;
                                                                                            break;
                                                                                        case 54:
                                                                                            str2 = str17;
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
                                                                case 1769:
                                                                    String str18 = (String) C0152.n(8274, null, new Object[]{(short[]) C0173.n(76589), 156, Integer.valueOf(C0083.f292 ^ (-199)), 2025});
                                                                    int i31 = 50689;
                                                                    while (true) {
                                                                        i31 ^= 50706;
                                                                        switch (i31) {
                                                                            case 19:
                                                                                i31 = 50720;
                                                                                break;
                                                                            case 50:
                                                                                str2 = str18;
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
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i4 = str5 != null ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    HashMap map2 = new HashMap();
                    Iterator it = (Iterator) C0221.n(14247, (Set) C0186.n(21593, (Headers) C0188.n(28316, response, new Object[0]), new Object[0]), new Object[0]);
                    while (true) {
                        boolean zBooleanValue16 = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
                        int i32 = 1509549;
                        while (true) {
                            i32 ^= 1509566;
                            switch (i32) {
                                case 19:
                                    i32 = zBooleanValue16 ? 1509642 : 1509611;
                                    break;
                                case 85:
                                    break;
                                case 114:
                                    break;
                                case 436:
                                    break;
                                default:
                                    break;
                            }
                            StringBuilder sb5 = new StringBuilder((String) C0162.n(59518, null, new Object[]{(short[]) C0173.n(76589), 338, Integer.valueOf(C0039.f195 ^ 774), 1979}));
                            C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb5, new Object[0])});
                            StringBuilder sb6 = new StringBuilder((String) C0162.n(95122, null, new Object[]{(short[]) C0173.n(76589), 362, Integer.valueOf(C0134.f343 ^ (-233)), 743}));
                            C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb6, new Object[0])});
                            return new Object[]{(Integer) C0182.n(76256, null, new Object[]{Integer.valueOf(((Integer) C0188.n(85911, response, new Object[0])).intValue())}), str2, (InputStream) C0186.n(12789, (ResponseBody) C0188.n(57688, response, new Object[0]), new Object[0]), map2};
                        }
                        String str19 = (String) C0221.n(87284, it, new Object[0]);
                        C0155.n(50765, map2, new Object[]{str19, (String) C0173.n(60171, (Headers) C0188.n(28316, response, new Object[0]), new Object[]{str19})});
                        int i33 = 1509673;
                        while (true) {
                            i33 ^= 1509690;
                            switch (i33) {
                                case 19:
                                    i33 = 1510355;
                                    break;
                                case 745:
                                    break;
                            }
                        }
                    }
                    break;
            }
        }
    }

    public static Object[] b(String str, Map map) throws Throwable {
        int iIntValue;
        int iIntValue2;
        boolean z;
        String str2 = (String) C0191.n(93496, null, new Object[]{(short[]) C0173.n(76589), 386, Integer.valueOf(C0037.f193 ^ 801), 930});
        try {
            HashMap map2 = new HashMap(map);
            String str3 = (String) C0186.n(25947, map2, new Object[]{(String) C0152.n(8274, null, new Object[]{(short[]) C0173.n(76589), 399, Integer.valueOf(C0033.f189 ^ (-429)), 960})});
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = str3 != null ? 1709 : 1678;
                        break;
                    case 204:
                        try {
                            iIntValue = ((Integer) C0195.n(60398, null, new Object[]{str3})).intValue();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = 1771;
                                        continue;
                                    case 54:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                        } catch (NumberFormatException e) {
                            int i3 = 51836;
                            while (true) {
                                i3 ^= 51853;
                                switch (i3) {
                                    case 241:
                                        i3 = 52518;
                                        continue;
                                    case 1963:
                                        break;
                                    default:
                                        continue;
                                }
                                iIntValue = 2;
                                break;
                            }
                        }
                        break;
                    case 239:
                        iIntValue = 2;
                        break;
                    default:
                        break;
                }
            }
            String str4 = (String) C0186.n(25947, map2, new Object[]{(String) C0224.n(25428, null, new Object[]{(short[]) C0173.n(76589), 411, Integer.valueOf(C0060.f269 ^ (-974)), 2236})});
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                        break;
                    case 45:
                        iIntValue2 = 256;
                        break;
                    case 76:
                        try {
                            iIntValue2 = ((Integer) C0195.n(60398, null, new Object[]{str4})).intValue();
                            int i5 = 48891;
                            while (true) {
                                i5 ^= 48908;
                                switch (i5) {
                                    case 22:
                                        break;
                                    case 503:
                                        i5 = 48922;
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                        } catch (NumberFormatException e2) {
                            int i6 = 52611;
                            while (true) {
                                i6 ^= 52628;
                                switch (i6) {
                                    case 23:
                                        i6 = 52642;
                                        break;
                                    case 54:
                                        iIntValue2 = 256;
                                        break;
                                }
                            }
                        }
                        break;
                    case 239:
                        i4 = str4 != null ? 48860 : 48829;
                        break;
                    default:
                        break;
                }
            }
            String str5 = (String) C0186.n(25947, map2, new Object[]{(String) C0198.n(62249, null, new Object[]{(short[]) C0173.n(76589), 423, Integer.valueOf(C0123.f332 ^ (-155)), 1622})});
            boolean zBooleanValue = ((Boolean) C0182.n(55567, (String) C0224.n(52346, null, new Object[]{(short[]) C0173.n(76589), 436, 1, 1588}), new Object[]{str5})).booleanValue();
            int i7 = 49666;
            while (true) {
                i7 ^= 49683;
                switch (i7) {
                    case 17:
                        i7 = !zBooleanValue ? 49759 : 49728;
                        break;
                    case 50:
                        break;
                    case 76:
                        boolean zBooleanValue2 = ((Boolean) C0221.n(80323, (String) C0224.n(67549, null, new Object[]{(short[]) C0173.n(76589), 437, Integer.valueOf(C0054.f210 ^ (-655)), 2945}), new Object[]{str5})).booleanValue();
                        int i8 = 49790;
                        while (true) {
                            i8 ^= 49807;
                            switch (i8) {
                                case 18:
                                    break;
                                case 51:
                                    z = false;
                                    int i9 = 50689;
                                    while (true) {
                                        i9 ^= 50706;
                                        switch (i9) {
                                            case 19:
                                                i9 = 50720;
                                                continue;
                                            case 50:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 84:
                                    int i10 = 49914;
                                    while (true) {
                                        i10 ^= 49931;
                                        switch (i10) {
                                            case 497:
                                                i10 = 50596;
                                                continue;
                                            case 1711:
                                                break;
                                            default:
                                                continue;
                                        }
                                        z = true;
                                        break;
                                    }
                                    break;
                                case 241:
                                    i8 = zBooleanValue2 ? 49883 : 49852;
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;
                    case 83:
                        z = true;
                        break;
                    default:
                        break;
                }
            }
            Object[] objArr = (Object[]) C0186.n(57781, new C0267j0(str, map2, iIntValue, iIntValue2, z), new Object[0]);
            int i11 = 50813;
            while (true) {
                i11 ^= 50830;
                switch (i11) {
                    case 18:
                        return objArr;
                    case 243:
                        i11 = 50844;
                        break;
                }
            }
        } catch (Exception e3) {
            int i12 = 1864;
            while (true) {
                i12 ^= 1881;
                switch (i12) {
                    case 17:
                        i12 = 48674;
                        break;
                    case 47483:
                        C0151.n(52760, e3, new Object[0]);
                        try {
                            Object[] objArr2 = (Object[]) C0186.n(66218, null, new Object[]{str, map});
                            int i13 = 51588;
                            while (true) {
                                i13 ^= 51605;
                                switch (i13) {
                                    case 17:
                                        i13 = 51619;
                                        break;
                                    case 54:
                                        return objArr2;
                                }
                            }
                        } catch (Exception e4) {
                            C0151.n(52760, e4, new Object[0]);
                            int i14 = C0013.f169 ^ 873;
                            try {
                                StringBuilder sb = new StringBuilder(str2);
                                Object[] objArr3 = {(Integer) C0182.n(76256, null, new Object[]{Integer.valueOf(i14)}), (String) C0149.n(56487, null, new Object[]{(short[]) C0173.n(76589), 446, Integer.valueOf(C0022.f178 ^ 121), 2636}), new ByteArrayInputStream((byte[]) C0221.n(21903, (String) C0198.n(89992, sb, new Object[0]), new Object[]{(String) C0162.n(13243, null, new Object[]{(short[]) C0173.n(76589), 441, Integer.valueOf(C0015.f171 ^ (-941)), 2735})}))};
                                int i15 = 51712;
                                while (true) {
                                    i15 ^= 51729;
                                    switch (i15) {
                                        case 14:
                                            return objArr3;
                                        case 17:
                                            i15 = 51743;
                                            break;
                                    }
                                }
                            } catch (Exception e5) {
                                return new Object[]{(Integer) C0182.n(76256, null, new Object[]{Integer.valueOf(i14)}), (String) C0149.n(56487, null, new Object[]{(short[]) C0173.n(76589), 482, Integer.valueOf(C0108.f317 ^ (-378)), 2574}), new ByteArrayInputStream((byte[]) C0219.n(63061, (String) C0162.n(24506, null, new Object[]{(short[]) C0173.n(76589), 471, Integer.valueOf(C0124.f333 ^ (-768)), 3124}), new Object[0]))};
                            }
                        }
                        break;
                }
            }
        }
    }
}
