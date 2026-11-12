package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0260h;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0257g;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class JSo extends Cloud {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f54short = {1770, 2451, 2449, 2436, 2506, 2456, 2463, 2436, 29988, -28639, 25045, 30955, 2622, 2599, 2619, 2571, 2599, 2609, 2613, 2598, 2615, 2620, 2580, 2580, 1490, 18551, 30988, 28805, -29927, 26829, 2636, 2636, 29975, 31902, -24904, 27107, 2684, 2636, 2667, 2674, 2670, 2625, 2625, 2625, 1744, 1737, 1749, 1765, 1746, 1749, 1751, 1759, 19487, 32100, 29933, 1979, 1979, 30944, 29033, -27825, 25620, -1877, 1601, 1603, 1622, 1560, 1523, 1504, 1138, 1151, 1151, 600, 551, 3288, 3295, 3288, 3260, 3260, 3243, 3294, 3245, 3241, 3260, 3288, 3295, 3294, 3260, 3260, 3242, 3294, 1164, 2019, 2013, 1943, 1931, 2036, 1987, 1927, 2036, 1987, 1934, 1935, 1927, 1935, 2031, 1987, 1933, 1934, 1929, 1935, 2031, 1987, 2039, 2043, 2029, 1987, 2039, 1933, 1929, 1930, 1987, 2024, 2042, 2045, 1987, 2028, 2043, 2029, 1987, 1920, 1920, 1920, 1942, 2019, 2013, 756, 731, 643, 842, 849, 845, 832, 855, 396, 18716, 25150, 25616, 29077, 30784, 29129, 31594, 20634, -26424, 28563, 3084, 3094, 2718, 2716, 2697, 2712, 2714, 2706, 2703, 2692, 2750, 2706, 2707, 2697, 2712, 2707, 2697, 1007, 1006, 1023, 1002, 994, 999, 968, 996, 997, 1023, 1006, 997, 1023, 1811, 1814, 1795, 1814, 1002, 997, 1001, 993, 1729, 1756, 1729, 1753, 1744, 696, 701, 698, 703, 2334, 2319, 2304, 2353, 2331, 2332, 2306, 929, 956, 952, 944, 983, 966, 977, 981, 960, 977, 976, 1003, 981, 960, 2973, 2945, 2971, 2972, 2957, 2955, 851, 834, 845, 892, 855, 858, 851, 838, 892, 845, 834, 846, 838, 1224, 1231, 1229, 1221, 1251, 1231, 1230, 1236, 1221, 1230, 1236, 1981, 1959, 1978, 1963, 713, 725, 725, 721, 722, 667, 654, 654, 715, 652, 722, 718, 655, 706, 718, 716, 507, 482, 510, 462, 482, 504, 485, 500, 462, 484, 483, 509, 3187, 3133, 3116, 3125, 3187, 3135, 3124, 3129, 3135, 3127, 3075, 3135, 3120, 3123, 3113, 3128, 3186, 3116, 3124, 3116, 3171, 3113, 3118, 3120, 3169, 2529, 2528, 2546, 2457, 2444, 1482, 1432, 1489, 591, 584, 605, 584, 585, 591, 792, 784, 774, 774, 788, 786, 784, 2840, 2846, 2824, 2824, 2830, 2840, 2840, 24876, 25453, 26453, 21006, 30956, -25111, 27677, 29987, 619, 3024, 2975, 3033, 3038, 3013, 2972, 3009, 3032, 3037, 3037, 3050, 3033, 3011, 3028, 3031, 3055, 2956, 2974, 3010, 2974, 3052, 2973, 2961, 3024, 2975, 3009, 3032, 3037, 3037, 3050, 3033, 3011, 3028, 3031, 3055, 2956, 2974, 3010, 2974, 3052, 1546, 1604, 1621, 1612, 1546, 1622, 1600, 1604, 1623, 1606, 1613, 1546, 1607, 1604, 1606, 1614, 1616, 1621, 1562, 1614, 1600, 1628, 1618, 1610, 1623, 1601, 1560, 2305, 2304, 2322, 2425, 2412, 1832, 1890, 1895, 1891, 1895, 1914, 1843, 893, 820, 829, 829, 808, 830, 815, 870, 920, 964, 920, 1825, 1824, 1842, 1881, 1868, 2425, 2344, 2367, 2345, 2351, 2358, 2350, 2345, 2326, 2355, 2345, 2350, 2426, 2363, 2344, 2350, 2355, 2361, 2358, 2367, 2420, 2344, 2367, 2345, 2351, 2358, 2350, 2423, 2355, 2350, 2367, 2359, 2422, 2426, 2363, 2344, 2350, 2355, 2361, 2358, 2367, 2420, 2344, 2367, 2345, 2351, 2358, 2350, 2423, 2355, 2350, 2367, 2359, 2212, 2296, 2287, 2297, 2303, 2278, 2302, 2215, 2302, 2275, 2302, 2278, 2287, 2218, 2283, 2257, 2286, 2283, 2302, 2283, 2215, 2296, 2287, 2283, 2278, 2215, 2278, 2275, 2276, 2273, 2263, 2214, 2218, 2274, 2232, 2218, 2283, 2257, 2286, 2283, 2302, 2283, 2215, 2296, 2287, 2283, 2278, 2215, 2278, 2275, 2276, 2273, 2263, 2214, 2218, 2283, 2257, 2286, 2283, 2302, 2283, 2215, 2296, 2287, 2283, 2278, 2215, 2278, 2275, 2276, 2273, 2263, 3109, 3104, 3125, 3104, 3180, 3123, 3108, 3104, 3117, 3180, 3117, 3112, 3119, 3114, 2635, 2628, 2632, 2624, 651, 654, 649, 652, 778, 841, 833, 848, 837, 777, 845, 848, 833, 841, 981, 907, 922, 917, 982, 905, 926, 904, 910, 919, 911, 982, 914, 920, 916, 917, 928, 922, 919, 911, 934, 1496, 1477, 1473, 1481, 2462, 2451, 2443, 1830, 1850, 1824, 1831, 1846, 1840, 2261, 2256, 2245, 2256, 3077, 3107, 3125, 3106, 3197, 3089, 3127, 3125, 3134, 3108, 2771, 2801, 2788, 2807, 2802, 2802, 2815, 2737, 2731, 2736, 2734, 2750, 2742, 2761, 2807, 2800, 2810, 2801, 2793, 2797, 2750, 2768, 2762, 2750, 2735, 2734, 2736, 2734, 2725, 2750, 2761, 2807, 2800, 2728, 2730, 2725, 2750, 2790, 2728, 2730, 2743, 2750, 2783, 2798, 2798, 2802, 2811, 2761, 2811, 2812, 2773, 2807, 2794, 2737, 2731, 2733, 2729, 2736, 2733, 2728, 2750, 2742, 2773, 2774, 2762, 2771, 2770, 2738, 2750, 2802, 2807, 2805, 2811, 2750, 2777, 2811, 2813, 2805, 2801, 2743, 2750, 2781, 2806, 2796, 2801, 2803, 2811, 2737, 2735, 2732, 2732, 2736, 2734, 2736, 2734, 2736, 2734, 2750, 2765, 2815, 2808, 2815, 2796, 2807, 2737, 2731, 2733, 2729, 2736, 2733, 2728, 1640, 802, 789, 790, 789, 770, 789, 770, 1997, 2032, 2027, 2021, 2027, 2028, 3135, 1100, 1099, 1112, 1025, 2680, 2681, 2667, 2560, 2581, 2324, 2394, 2379, 2386, 2324, 2392, 2388, 2389, 2381, 2398, 2377, 2383, 2404, 2376, 2387, 2394, 2377, 2398, 2325, 2379, 2387, 2379, 2308, 2382, 2377, 2391, 2310, 629, 551, 570, 551, 575, 566, 622, 620, 574, 631, 612, 610, 628, 628, 626, 612, 612, 3046, 3041, 3060, 3041, 3040, 3046, 1725, 1720, 1709, 1720, 2695, 2716, 2709, 2694, 2705, 2731, 2689, 2694, 2712, 3249, 3254, 3237, 1851, 483, 501, 497, 482, 499, 504, 467, 511, 510, 484, 501, 510, 484, 1150, 1128, 1132, 1151, 1134, 1125, 1102, 1122, 1123, 1145, 1128, 1123, 1145, 29525, 31452, 880, 879, 880, 262, 287, 259, 307, 287, 265, 269, 286, 271, 260, 300, 300, 1606, 1536, 1543, 1550, 1606, 1541, 1542, 1550, 1542, 1624, 1625, 1625, 1607, 1561, 1543, 1550};
    public C0257g r;

    /* JADX INFO: renamed from: com.github.catvod.spider.JSo$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
    }

    class OnlineCard {
        public String a;
        public String b;
    }

    class SearchItem {
        public final String a;
        public final String b;
        public final String c;

        public SearchItem(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return searchContent(str, z, C0003.m10(f54short, 0, 1, 1755));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayListL = l();
        ArrayList arrayList = new ArrayList();
        com.github.catvod.spider.merge.D.b.z(C0003.m10(f54short, 1, 7, 2544), C0128.m511(f54short, 8, 4, 1481), null, arrayList);
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, v(arrayListL, 30));
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        int i;
        try {
            i = Integer.parseInt(str2);
        } catch (Exception unused) {
            i = 1;
        }
        int iP = p(i);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (k kVar : t(iP, str)) {
            if (kVar != null && !TextUtils.isEmpty(kVar.b()) && hashSet.add(kVar.b())) {
                arrayList.add(kVar);
                if (arrayList.size() >= 20) {
                    break;
                }
            }
        }
        return q(arrayList, i);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0262  */
    /* JADX WARN: Code duplicated, block: B:96:0x027d  */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String strB;
        String strB2;
        String strSubstring;
        String str;
        CharSequence charSequenceSubstring;
        String str2 = list.get(0);
        boolean zStartsWith = str2.startsWith(C0118.m471(f54short, 12, 12, 2644));
        String strM249 = C0063.m249(f54short, 24, 1, 1496);
        int i = 3;
        if (zStartsWith) {
            try {
                strB = AbstractC0309x1.b(str2.substring(12));
            } catch (Exception unused) {
                strB = "";
            }
            ArrayList arrayList = new ArrayList();
            HashMap map = new HashMap();
            if (TextUtils.isEmpty(strB)) {
                k kVarX = x(str2);
                boolean z = FishCrypto.a;
                N1.d(kVarX);
                return com.github.catvod.spider.merge.p001b.g.s(kVarX);
            }
            for (SearchItem searchItem : u(strB, 80, 0)) {
                String strR = r(searchItem.b);
                int iIntValue = map.containsKey(strR) ? ((Integer) map.get(strR)).intValue() : 0;
                if (iIntValue < 3) {
                    String str3 = searchItem.b;
                    if (AbstractC0302v0.s0(str3) && !arrayList.contains(str3)) {
                        arrayList.add(str3);
                        map.put(strR, Integer.valueOf(iIntValue + 1));
                        if (arrayList.size() >= 20) {
                            break;
                        }
                    }
                }
            }
            k kVar = new k();
            kVar.n(str2);
            kVar.o(strB);
            kVar.p(AbstractC0302v0.d1());
            kVar.s(arrayList.size() + C0009.m33(f54short, 25, 5, 1629));
            kVar.l(arrayList.isEmpty() ? "" : (C0139.m554(f54short, 30, 8, 2630) + TextUtils.join(strM249, arrayList)).trim());
            if (!arrayList.isEmpty()) {
                String strB3 = b(arrayList);
                kVar.r(strB3);
                kVar.q(a(arrayList));
                AbstractC0280n1.p(strB);
                AbstractC0280n1.q(strB3);
            }
            boolean z2 = FishCrypto.a;
            N1.d(kVar);
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        }
        if (AbstractC0302v0.s0(str2)) {
            String strDetailContent = super.detailContent(list);
            if (!TextUtils.isEmpty(strDetailContent)) {
                return FishCrypto.b(strDetailContent);
            }
            k kVarX2 = x(str2);
            boolean z3 = FishCrypto.a;
            N1.d(kVarX2);
            return com.github.catvod.spider.merge.p001b.g.s(kVarX2);
        }
        String strM219 = C0055.m219(f54short, 38, 6, 2561);
        if (!str2.startsWith(strM219)) {
            k kVarX3 = x(str2);
            boolean z4 = FishCrypto.a;
            N1.d(kVarX3);
            return com.github.catvod.spider.merge.p001b.g.s(kVarX3);
        }
        String str4 = list.get(0);
        try {
            strB2 = AbstractC0309x1.b(str4.replace(strM219, ""));
        } catch (Exception unused2) {
            strB2 = "";
        }
        String[] strArrSplit = strB2.split(strM249, 3);
        if (strArrSplit.length != 3) {
            strArrSplit = new String[]{"", str4, ""};
        }
        String str5 = strArrSplit[0];
        String str6 = strArrSplit[1];
        String str7 = strArrSplit[2];
        if (TextUtils.isEmpty(str5) || C0095.m379(f54short, 44, 8, 1722).equals(str5)) {
            str5 = str6;
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(str7) && AbstractC0302v0.s0(str7)) {
            arrayList2.add(str7);
            map2.put(r(str7), 1);
        }
        if (arrayList2.isEmpty()) {
            for (SearchItem searchItem2 : u(str5, 50, 0)) {
                String strR2 = r(searchItem2.b);
                int iIntValue2 = map2.containsKey(strR2) ? ((Integer) map2.get(strR2)).intValue() : 0;
                if (iIntValue2 < i) {
                    String strK = k(str6);
                    String strK2 = k(searchItem2.a);
                    if (!TextUtils.isEmpty(strK) && !TextUtils.isEmpty(strK2)) {
                        if (strK.length() > 12) {
                            strSubstring = strK;
                            strSubstring = strK.substring(0, 12);
                        }
                        strSubstring = strK;
                        if (strK2.contains(strSubstring)) {
                            str = searchItem2.b;
                            if (!AbstractC0302v0.s0(str) && !arrayList2.contains(str)) {
                                arrayList2.add(str);
                                map2.put(strR2, Integer.valueOf(iIntValue2 + 1));
                            }
                        } else {
                            if (strK2.length() > 12) {
                                charSequenceSubstring = strK2;
                                charSequenceSubstring = strK2.substring(0, 12);
                            }
                            charSequenceSubstring = strK2;
                            if (strSubstring.contains(charSequenceSubstring)) {
                                str = searchItem2.b;
                                if (!AbstractC0302v0.s0(str)) {
                                }
                            }
                        }
                    }
                    if (arrayList2.size() >= 20) {
                        break;
                    }
                    i = 3;
                }
            }
        }
        k kVar2 = new k();
        kVar2.n(list.get(0));
        kVar2.o(str6);
        kVar2.p(AbstractC0302v0.d1());
        kVar2.s(arrayList2.size() + C0059.m234(f54short, 52, 3, 565));
        kVar2.l((arrayList2.isEmpty() ? "" : C0074.m292(f54short, 55, 7, 1969) + TextUtils.join(strM249, arrayList2)).trim());
        if (!arrayList2.isEmpty()) {
            String strB4 = b(arrayList2);
            kVar2.r(strB4);
            kVar2.q(a(arrayList2));
            AbstractC0280n1.p(str6);
            AbstractC0280n1.q(strB4);
        }
        boolean z5 = FishCrypto.a;
        N1.d(kVar2);
        return com.github.catvod.spider.merge.p001b.g.s(kVar2);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int i;
        String strM31 = str;
        int i2 = 1;
        if (strM31 == null || !strM31.startsWith(C0072.m285(f54short, 62, 4, 1570))) {
            if (map != null) {
                String strM292 = C0074.m292(f54short, 66, 2, 1412);
                if (!TextUtils.isEmpty(map.get(strM292))) {
                    strM31 = map.get(strM292);
                }
            }
            if (TextUtils.isEmpty(strM31) || C0017.m65(f54short, 68, 3, 1043).equals(strM31)) {
                strM31 = C0008.m31(f54short, 71, 2, 620);
            }
            try {
                i2 = Integer.parseInt(str2);
            } catch (Exception unused) {
            }
            return q(t(p(i2), strM31), i2);
        }
        try {
            i = Integer.parseInt(str2);
        } catch (Exception unused2) {
            i = 1;
        }
        ArrayList arrayListV = v(l(), Integer.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        int iMax = Math.max(1, i);
        int iP = p(iMax);
        int iMin = Math.min(arrayListV.size(), iP + 20);
        while (iP < iMin) {
            arrayList.add((k) arrayListV.get(iP));
            iP++;
        }
        int iMax2 = Math.max(1, (arrayListV.size() + 19) / 20);
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayList);
        gVarC.o(iMax, iMax2, 20, arrayListV.size());
        return gVarC.r();
    }

    public static String k(String str) {
        if (str == null) {
            return "";
        }
        String strM499 = C0125.m499(f54short, 73, 17, 3203);
        String strM75 = C0019.m75(f54short, 90, 1, 1196);
        String strTrim = str.replaceAll(strM499, strM75).replaceAll(C0117.m467(f54short, 91, 44, 1983), strM75).replaceAll(C0074.m292(f54short, 135, 3, 680), strM75).trim();
        return TextUtils.isEmpty(strTrim) ? str : strTrim;
    }

    public static int p(int i) {
        return Math.max(0, (Math.max(1, i) - 1) * 20);
    }

    public static String q(ArrayList arrayList, int i) {
        int iMax = Math.max(1, i);
        boolean z = arrayList.size() >= 20;
        int i2 = z ? iMax + 1 : iMax;
        int size = arrayList.size() + p(iMax);
        int i3 = z ? 20 : 0;
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.F(arrayList);
        gVar.o(iMax, i2, 20, size + i3);
        return gVar.r();
    }

    public static String r(String str) {
        String strB1 = AbstractC0302v0.b1(str);
        return TextUtils.isEmpty(strB1) ? C0085.m339(f54short, 138, 5, 805) : strB1;
    }

    public static String w(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        while (strTrim.endsWith(C0106.m422(f54short, 143, 1, 419))) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
        }
        return strTrim;
    }

    public static k x(String str) {
        k kVar = new k();
        kVar.n(str);
        kVar.o(C0120.m477(f54short, 144, 8, 1809));
        kVar.l(C0106.m422(f54short, 152, 4, 3126).concat(str));
        return kVar;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0055.m219(f54short, 156, 15, 2813));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$f9d7235748f992e0 = $host$f9d7235748f992e0(str, str2, z, map);
            FishCrypto.endHostEntry(null);
            return str$host$f9d7235748f992e0;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0119.m473(f54short, 171, 13, 907));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$6c1ebb3cb60973b4 = $host$6c1ebb3cb60973b4(list);
            FishCrypto.endHostEntry(null);
            return str$host$6c1ebb3cb60973b4;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public final void h(int i, String str, ArrayList arrayList) {
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray(C0076.m301(f54short, 184, 4, 1911));
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((SearchItem) it.next()).b);
            }
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length() && arrayList.size() < i; i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    String strTrim = jSONObjectOptJSONObject.optString(C0133.m529(f54short, 188, 4, 900), jSONObjectOptJSONObject.optString(C0103.m408(f54short, 192, 5, 1717), "")).trim();
                    String strTrim2 = jSONObjectOptJSONObject.optString(C0106.m422(f54short, 197, 4, 724), jSONObjectOptJSONObject.optString(C0056.m223(f54short, 201, 7, 2414), "")).trim();
                    if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2) && !hashSet.contains(strTrim2) && AbstractC0302v0.s0(strTrim2) && j(strTrim2)) {
                        String strS = s(strTrim, strTrim2);
                        if (!TextUtils.isEmpty(strS) && AbstractC0302v0.s0(strS) && !hashSet.contains(strS)) {
                            hashSet.add(strS);
                            String strOptString = jSONObjectOptJSONObject.optString(C0128.m511(f54short, 208, 4, 981), jSONObjectOptJSONObject.optString(C0101.m402(f54short, 212, 10, 948), ""));
                            jSONObjectOptJSONObject.optString(C0079.m314(f54short, 222, 6, 3054), jSONObjectOptJSONObject.optString(C0125.m499(f54short, 228, 13, 803), ""));
                            arrayList.add(new SearchItem(strTrim, strS, strOptString));
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0006.m21(f54short, 241, 11, 1184));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$1b26b551389a5dab = $host$1b26b551389a5dab(z);
            FishCrypto.endHostEntry(null);
            return str$host$1b26b551389a5dab;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public final String i() {
        return w(this.r.b());
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        super.init(context, str);
        String strM467 = C0117.m467(f54short, 252, 4, 1998);
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strM467);
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strW = w(jSONArrayOptJSONArray.optString(i, ""));
                    if (!TextUtils.isEmpty(strW)) {
                        arrayList.add(strW);
                    }
                }
            } else {
                String strW2 = w(jSONObject.optString(strM467, ""));
                if (!TextUtils.isEmpty(strW2)) {
                    arrayList.add(strW2);
                }
            }
        } catch (Exception unused) {
        }
        if (arrayList.isEmpty()) {
            arrayList.add(C0103.m408(f54short, 256, 16, 673));
        }
        this.r = AbstractC0260h.b(C0073.m288(f54short, 272, 12, 401), arrayList, false);
    }

    public final boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(X1.X(i() + C0059.m234(f54short, 284, 25, 3164) + URLEncoder.encode(str, C0133.m529(f54short, 309, 5, 2484)) + C0143.m570(f54short, 314, 3, 1516) + (System.currentTimeMillis() / 1000), null, o()));
            String strOptString = jSONObject.optString(C0074.m292(f54short, 317, 6, 572), "");
            String strOptString2 = jSONObject.optString(C0017.m65(f54short, 323, 7, 885), "");
            return C0073.m288(f54short, 330, 7, 2923).equalsIgnoreCase(strOptString) || strOptString2.contains(C0093.m368(f54short, 337, 2, 1573)) || strOptString2.contains(C0070.m277(f54short, 339, 2, 3126));
        } catch (Exception unused) {
            return true;
        }
    }

    public final ArrayList l() {
        String strM288 = C0073.m288(f54short, 341, 4, 2049);
        String strM70 = C0018.m70(f54short, 345, 1, 580);
        ArrayList arrayList = new ArrayList();
        try {
            com.github.catvod.spider.merge.h0.d<com.github.catvod.spider.merge.f0.k> dVarQ = X1.L(X1.X(i().concat(strM70), null, o()), i()).Q(C0021.m83(f54short, 346, 40, 2993));
            HashSet hashSet = new HashSet();
            for (com.github.catvod.spider.merge.f0.k kVar : dVarQ) {
                OnlineCard onlineCard = new OnlineCard();
                String strTrim = kVar.T().trim();
                onlineCard.a = strTrim;
                onlineCard.b = strM288;
                if (!TextUtils.isEmpty(strTrim) && hashSet.add(onlineCard.a)) {
                    arrayList.add(onlineCard);
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final String m(String str, int i, int i2) {
        return X1.X(i() + C0076.m301(f54short, 386, 27, 1573) + URLEncoder.encode(str, C0089.m355(f54short, 413, 5, 2388)) + C0053.m210(f54short, 418, 7, 1806) + i + C0117.m467(f54short, 425, 8, 859) + i2, null, o());
    }

    public final String n(String str) throws JSONException {
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(i() + C0027.m105(f54short, 433, 3, 951) + URLEncoder.encode(str, C0095.m379(f54short, 436, 5, 1908)), null, o()), i());
        JSONArray jSONArray = new JSONArray();
        for (com.github.catvod.spider.merge.f0.k kVar : gVarL.Q(C0133.m529(f54short, 441, 53, 2394))) {
            com.github.catvod.spider.merge.f0.k kVarR = kVar.R(C0045.m177(f54short, 494, 72, 2186));
            if (kVarR != null) {
                String strTrim = kVarR.T().trim();
                String strTrim2 = kVarR.c(C0074.m292(f54short, 566, 14, 3137)).trim();
                if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                    JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v(C0095.m379(f54short, 580, 4, 2597), strTrim, C0135.m539(f54short, 584, 4, 743), strTrim2);
                    com.github.catvod.spider.merge.f0.k kVarR2 = kVar.R(C0056.m223(f54short, 588, 10, 804));
                    com.github.catvod.spider.merge.f0.k kVarR3 = kVar.R(C0125.m499(f54short, 598, 21, 1019));
                    jSONObjectV.put(C0114.m454(f54short, 619, 4, 1452), kVarR2 == null ? "" : kVarR2.T().trim());
                    jSONObjectV.put(C0053.m210(f54short, 626, 6, 1877), kVarR3 != null ? kVarR3.c(C0055.m219(f54short, 623, 3, 2559)).trim() : "");
                    jSONArray.put(jSONObjectV);
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C0090.m358(f54short, 632, 4, 2225), jSONArray);
        return jSONObject.toString();
    }

    public final HashMap o() {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(C0076.m301(f54short, 636, 10, 3152), C0019.m75(f54short, 646, 111, 2718));
        mapS.put(C0101.m402(f54short, 758, 7, 880), i().concat(C0122.m486(f54short, 757, 1, 1607)));
        mapS.put(C0081.m322(f54short, 765, 6, 1922), i());
        return mapS;
    }

    public final String s(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        String str3 = str;
        String strM322 = C0081.m322(f54short, 771, 1, 3072);
        String strM503 = C0126.m503(f54short, 772, 4, 1084);
        String strM467 = C0117.m467(f54short, 776, 5, 2605);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(i());
            sb.append(C0093.m368(f54short, 781, 27, 2363));
            sb.append(URLEncoder.encode(str2, strM467));
            sb.append(C0106.m422(f54short, 808, 7, 595));
            if (str3 == null) {
                str3 = "";
            }
            sb.append(URLEncoder.encode(str3, strM467));
            sb.append(C0072.m285(f54short, 815, 3, 586));
            sb.append(System.currentTimeMillis());
            JSONObject jSONObject = new JSONObject(X1.X(sb.toString(), null, o()));
            if (!C0098.m390(f54short, 818, 7, 535).equalsIgnoreCase(jSONObject.optString(C0047.m186(f54short, 825, 6, 2965))) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(C0003.m10(f54short, 831, 4, 1753))) == null) {
                return str2;
            }
            String strTrim = jSONObjectOptJSONObject.optString(C0137.m545(f54short, 835, 9, 2804), "").trim();
            String strTrim2 = jSONObjectOptJSONObject.optString(C0085.m339(f54short, 844, 3, 3265), "").trim();
            if (TextUtils.isEmpty(strTrim)) {
                return str2;
            }
            if (TextUtils.isEmpty(strTrim2) || strTrim.contains(strM503)) {
                return strTrim;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strTrim);
            if (strTrim.contains(strM322)) {
                strM322 = C0135.m539(f54short, 847, 1, 1821);
            }
            sb2.append(strM322);
            sb2.append(strM503);
            sb2.append(strTrim2);
            return sb2.toString();
        } catch (Exception unused) {
            return str2;
        }
    }

    public String searchContent(String str, boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0140.m558(f54short, 848, 13, 400));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$0b14bd34f5ca9ec8 = $host$0b14bd34f5ca9ec8(str, z);
            FishCrypto.endHostEntry(null);
            return str$host$0b14bd34f5ca9ec8;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public String searchContent(String str, boolean z, String str2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0143.m570(f54short, 861, 13, 1037));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$5abcbf7c29fbb7fe = $host$5abcbf7c29fbb7fe(str, z, str2);
            FishCrypto.endHostEntry(null);
            return str$host$5abcbf7c29fbb7fe;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public final ArrayList t(int i, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList<SearchItem> arrayListU = u(str, 20, i);
            HashSet hashSet = new HashSet();
            HashMap map = new HashMap();
            for (SearchItem searchItem : arrayListU) {
                String strR = r(searchItem.b);
                String str2 = searchItem.b;
                if (hashSet.add(str2)) {
                    map.put(strR, Integer.valueOf(map.containsKey(strR) ? 1 + ((Integer) map.get(strR)).intValue() : 1));
                    String str3 = searchItem.a;
                    String strJ = AbstractC0302v0.j(strR);
                    String strB1 = AbstractC0302v0.b1(searchItem.b);
                    String strSubstring = "";
                    String strC1 = TextUtils.isEmpty(strB1) ? "" : AbstractC0302v0.c1(strB1);
                    if (TextUtils.isEmpty(strC1)) {
                        strC1 = C0143.m570(f54short, 874, 2, 3076);
                    }
                    String str4 = searchItem.c;
                    if (str4 != null) {
                        strSubstring = str4;
                    }
                    if (strSubstring.length() > 16) {
                        strSubstring = strSubstring.substring(0, 16);
                    }
                    if (!TextUtils.isEmpty(strSubstring)) {
                        strC1 = com.github.catvod.spider.merge.D.b.C(strC1, C0143.m570(f54short, 876, 3, 848), strSubstring);
                    }
                    arrayList.add(new k(str2, str3, strJ, strC1));
                    if (arrayList.size() >= 20) {
                        break;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final ArrayList u(String str, int i, int i2) {
        int iMax;
        ArrayList arrayList = new ArrayList();
        if (i2 <= 0) {
            try {
                iMax = Math.max(i, 200);
            } catch (Exception unused) {
            }
        } else {
            iMax = i;
        }
        h(i, m(str, iMax, Math.max(0, i2)), arrayList);
        if (i2 <= 0 && arrayList.size() < i) {
            try {
                h(i, n(str), arrayList);
            } catch (Exception unused2) {
            }
        }
        return arrayList;
    }

    public final ArrayList v(ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OnlineCard onlineCard = (OnlineCard) it.next();
            String str = !TextUtils.isEmpty(onlineCard.a) ? onlineCard.a : null;
            if (!TextUtils.isEmpty(str)) {
                arrayList2.add(new k(C0126.m503(f54short, 879, 12, 364).concat(AbstractC0309x1.c(str.getBytes())), str, i().concat(C0114.m454(f54short, 891, 16, 1641)), onlineCard.b));
                if (arrayList2.size() >= i) {
                    break;
                }
            }
        }
        return arrayList2;
    }
}
