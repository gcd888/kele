package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class C919TY extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f21short = {1772, 21502, -28034, 2149, -31002, 32598, 3099, 30744, 30709, 884, 779, 788, 881, 783, 872, 862, 881, 777, 880, 847, 864, 864, 862, 770, 878, 878, 834, 840, 785, 842, 847, 845, 851, 850, 832, 845, 835, 856, 888, 892, 777, 891, 887, 853, 880, 835, 857, 779, 866, 880, 845, 846, 867, 777, 887, 770, 845, 876, 852, 844, 853, 847, 852, 851, 832, 864, 780, 891, 872, 771, 887, 776, 873, 770, 857, 891, 834, 885, 885, 835, 883, 875, 846, 851, 884, 874, 832, 864, 879, 851, 863, 846, 835, 882, 779, 855, 878, 845, 775, 775, 1046, 1072, 1062, 1073, 1134, 1026, 1060, 1062, 1069, 1079, 1809, 1843, 1830, 1845, 1840, 1840, 1853, 1907, 1897, 1906, 1900, 1916, 1908, 1803, 1845, 1842, 1848, 1843, 1835, 1839, 1916, 1810, 1800, 1916, 1901, 1900, 1906, 1900, 1895, 1916, 1803, 1845, 1842, 1898, 1896, 1895, 1916, 1828, 1898, 1896, 1909, 1916, 1821, 1836, 1836, 1840, 1849, 1803, 1849, 1854, 1815, 1845, 1832, 1907, 1897, 1903, 1899, 1906, 1903, 1898, 1916, 1908, 1815, 1812, 1800, 1809, 1808, 1904, 1916, 1840, 1845, 1847, 1849, 1916, 1819, 1849, 1855, 1847, 1843, 1909, 1916, 1823, 1844, 1838, 1843, 1841, 1849, 1907, 1901, 1902, 1900, 1906, 1900, 1906, 1900, 1906, 1900, 1916, 1807, 1853, 1850, 1853, 1838, 1845, 1907, 1897, 1903, 1899, 1906, 1903, 1898, 967, 900, 986, 924, 977, 1251, 1219, 3308, 3234, 3251, 3242, 3308, 3252, 3238, 3233, 3308, 3247, 3242, 3253, 3238, 3228, 3247, 3242, 3248, 3255, 3248, 3308, 2671, 2596, 2597, 2612, 2593, 2601, 2604, 2671, 2376, 2330, 2322, 2330, 2325, 2322, 2309, 2344, 2334, 2323, 2378, 655, 643, 648, 649, 3075, 3078, 3091, 3078, 799, 798, 783, 794, 786, 791, 1104, 1106, 1103, 1112, 2030, 2025, 2027, 2019, 2009, 2034, 2019, 2023, 2027, 2009, 2044, 2030, 691, 709, 704, 691, 2952, 2974, 2952, 2960, 2998, 2973, 2956, 2952, 2948, 2998, 2963, 2945, 1709, 1712, 1712, 1714, 1664, 1713, 1712, 1707, 1718, 1724, 1722, 1664, 1713, 1722, 1704, 1809, 1804, 1804, 1806, 1852, 1805, 1804, 1815, 1802, 1792, 1798, 434, 437, 447, 439, 434, 445, 433, 441, 1660, 1659, 1637, 2679, 2672, 2678, 2657, 2661, 2665, 1554, 1556, 1538, 1557, 1545, 1542, 1546, 1538, 2498, 2514, 2499, 2516, 2516, 2527, 2542, 2500, 2499, 2525, 2974, 2958, 2975, 2952, 2952, 2947, 2994, 2968, 2975, 2945, 2994, 2944, 3038, 2968, 3029, 25266, 25040, 24733, 24846, 24896, 26462, 1191, 1191, 1191, 868, 810, 827, 802, 868, 828, 814, 809, 868, 807, 802, 829, 814, 788, 807, 802, 824, 831, 824, 868, 1443, 1455, 1444, 1445, 1030, 1027, 1046, 1027, 2866, 2857, 2867, 2868, 2856, 2855, 2859, 2851, 2856, 2866, 2841, 2863, 2850, 318, 307, 314, 303, 1845, 1853, 1845, 1850, 1853, 1834, 1799, 1841, 1852, 672, 679, 677, 685, 663, 700, 685, 681, 677, 663, 690, 672, 1794, 1908, 1905, 1794, 1131, 1149, 1131, 1139, 1109, 1150, 1135, 1131, 1127, 1109, 1136, 1122, 924, 917, 913, 919, 901, 917, 943, 926, 913, 925, 917, 943, 906, 920, 3030, 2989, 32145, -28991, 19758, 778, 29706, -30886, 17465, 2705, 28338, 28449, 2577, 3267, 3260, 3235, 3269, 3300, 3290, 3321, 3322, 3319, 3325, 3262, 3256, 3266, 3297, 3265, 3268, 3287, 3322, 3326, 3323, 3289, 3252, 3306, 3292, 3287, 3304, 3295, 3258, 3263, 3311, 3262, 3291, 3270, 3317, 3311, 3272, 3259, 3267, 3293, 3325, 3263, 3260, 3238, 3302, 3319, 3276, 3264, 3269, 3307, 3271, 3288, 3308, 3322, 3311, 3267, 3298, 3319, 3319, 3259, 3259, 3296, 3287, 3285, 3276, 3263, 3262, 3267, 3317, 3269, 3260, 3267, 3321, 3323, 3304, 3296, 3276, 3258, 3305, 3258, 3252, 3273, 3325, 3285, 3321, 3316, 3279, 3293, 3258, 3302, 3289, 3316, 3302, 3271, 3287, 3260, 3265, 3324, 3304, 3316, 3269, 3310, 3276, 3267, 3307, 3294, 3319, 3291, 3293, 3284, 3261, 3248, 620, 586, 604, 587, 532, 632, 606, 604, 599, 589, 2741, 2711, 2690, 2705, 2708, 2708, 2713, 2775, 2765, 2774, 2760, 2776, 2768, 2735, 2705, 2710, 2716, 2711, 2703, 2699, 2776, 2742, 2732, 2776, 2761, 2760, 2774, 2760, 2755, 2776, 2735, 2705, 2710, 2766, 2764, 2755, 2776, 2688, 2766, 2764, 2769, 2776, 2745, 2696, 2696, 2708, 2717, 2735, 2717, 2714, 2739, 2705, 2700, 2775, 2765, 2763, 2767, 2774, 2763, 2766, 2776, 2768, 2739, 2736, 2732, 2741, 2740, 2772, 2776, 2708, 2705, 2707, 2717, 2776, 2751, 2717, 2715, 2707, 2711, 2769, 2776, 2747, 2704, 2698, 2711, 2709, 2717, 2775, 2761, 2762, 2760, 2774, 2760, 2774, 2760, 2774, 2760, 2776, 2731, 2713, 2718, 2713, 2698, 2705, 2775, 2765, 2763, 2767, 2774, 2763, 2766, 836, 840, 849, 834, 853, 646, 641, 643, 651, 689, 642, 641, 649, 641, 866, 884, 866, 890, 860, 879, 876, 868, 876, 1490, 1493, 1495, 1489, 3290, 3265, 3288, 3288, 1058, 1061, 1063, 1071, 1045, 1081, 1065, 1061, 1080, 1071, 1505, 1527, 1505, 1529, 1503, 1523, 1507, 1519, 1522, 1509, 864, 865, 848, 891, 870, 866, 874, 1316, 1325, 1321, 1327, 1341, 1325, 1303, 1318, 1321, 1317, 1325, 1303, 1330, 1312, 2897, 24741, 22903, 3304, 1285, 1287, 1298, 1283, 1281, 1289, 1300, 1311, 1317, 1289, 1288, 1298, 1283, 1288, 1298, 938, 939, 954, 943, 935, 930, 909, 929, 928, 954, 939, 928, 954, 3033, 3038, 3036, 3028, 3058, 3038, 3039, 3013, 3028, 3039, 3013, 2160, 2156, 2145, 2169, 2149, 2162, 2115, 2159, 2158, 2164, 2149, 2158, 2164, 2749, 2731, 2735, 2748, 2733, 2726, 2701, 2721, 2720, 2746, 2731, 2720, 2746, 1975, 1953, 1957, 1974, 1959, 1964, 1927, 1963, 1962, 1968, 1953, 1962, 1968};

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return com.github.catvod.spider.merge.D.b.d();
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0118.m471(f21short, 0, 1, 1757), C0098.m390(f21short, 1, 2, 662), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0142.m567(f21short, 3, 1, 2135), C0044.m175(f21short, 4, 2, 2901), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0073.m288(f21short, 6, 1, 3112), C0043.m169(f21short, 7, 2, 1014), null));
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, new ArrayList());
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return searchContent(str, z);
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strI = AbstractC0280n1.i(str, str2, null, null);
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(FishCrypto.w(C0050.m199(f21short, 9, 91, 826), str2));
        HashMap map = new HashMap();
        map.put(C0046.m182(f21short, 100, 10, 1091), C0087.m346(f21short, 110, 111, 1884));
        gVar.h(map);
        gVar.b(strI);
        if (str2.contains(C0050.m199(f21short, 221, 5, 1001))) {
            gVar.k();
        }
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        String[] strArrSplit = str.split(C0098.m390(f21short, 226, 2, 1215));
        if (strArrSplit.length != 3) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        JSONObject jSONObject = new JSONObject(b(C0073.m288(f21short, 228, 20, 3267) + strArrSplit[0] + C0049.m193(f21short, 248, 8, 2624) + strArrSplit[1] + C0074.m292(f21short, 256, 11, 2423) + strArrSplit[2]));
        if (jSONObject.optInt(C0079.m314(f21short, 267, 4, 748)) != 200) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C0081.m322(f21short, 271, 4, 3175));
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONObject(C0044.m175(f21short, 275, 6, 891));
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray(C0044.m175(f21short, 281, 4, 1085)) : null;
        if (jSONObjectOptJSONObject2 == null) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        String str2 = d(C0142.m567(f21short, 285, 12, 1926), jSONObjectOptJSONObject2) + C0140.m558(f21short, 297, 4, 659) + d(C0049.m193(f21short, 301, 12, 3049), jSONObjectOptJSONObject2);
        String strD = d(C0079.m314(f21short, 313, 15, 1759), jSONObjectOptJSONObject2);
        if (TextUtils.isEmpty(strD)) {
            strD = d(C0104.m414(f21short, 328, 11, 1891), jSONObjectOptJSONObject2);
        }
        k kVar = new k();
        kVar.n(str);
        kVar.o(str2);
        kVar.p(c(jSONObjectOptJSONObject2));
        kVar.s(e(jSONObjectOptJSONObject2));
        kVar.l(strD);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a(arrayList, arrayList2, d(C0003.m10(f21short, 339, 8, 476), jSONObjectOptJSONObject2), d(C0105.m416(f21short, 347, 3, 1545), jSONObjectOptJSONObject2), d(C0053.m210(f21short, 350, 6, 2564), jSONObjectOptJSONObject2));
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject3 != null) {
                    a(arrayList, arrayList2, d(C0133.m529(f21short, 356, 8, 1639), jSONObjectOptJSONObject3), d(C0140.m558(f21short, 364, 10, 2481), jSONObjectOptJSONObject3), d(C0139.m554(f21short, 374, 15, 3053), jSONObjectOptJSONObject3));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.d(C0050.m199(f21short, 389, 6, 1072));
        }
        String strM386 = C0097.m386(f21short, 395, 3, 1155);
        kVar.q(TextUtils.join(strM386, arrayList));
        kVar.r(TextUtils.join(strM386, arrayList2));
        AbstractC0280n1.p(str2);
        AbstractC0280n1.q(kVar.e());
        FishCrypto.c(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int i;
        int i2;
        int i3;
        JSONObject jSONObject = new JSONObject(b(C0030.m116(f21short, 398, 20, 843) + str));
        if (jSONObject.optInt(C0120.m477(f21short, 418, 4, 1472)) != 200) {
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.F(new ArrayList());
            try {
                i3 = Integer.parseInt(str2);
            } catch (Exception unused) {
                i3 = 1;
            }
            gVar.o(i3, 1, 20, 0);
            return gVar.r();
        }
        String strM169 = C0043.m169(f21short, 422, 4, 1122);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strM169);
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray(strM169);
        if (jSONArrayOptJSONArray == null) {
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.F(new ArrayList());
            try {
                i2 = Integer.parseInt(str2);
            } catch (Exception unused2) {
                i2 = 1;
            }
            gVar2.o(i2, 1, 20, 0);
            return gVar2.r();
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i4);
            if (jSONObjectOptJSONObject2 != null) {
                String strM390 = C0098.m390(f21short, 426, 13, 2886);
                if (jSONObjectOptJSONObject2.has(strM390)) {
                    String strD = d(C0045.m177(f21short, 439, 4, 330), jSONObjectOptJSONObject2);
                    String strD2 = d(strM390, jSONObjectOptJSONObject2);
                    String strD3 = d(C0142.m567(f21short, 443, 9, 1880), jSONObjectOptJSONObject2);
                    if (!TextUtils.isEmpty(strD) && !TextUtils.isEmpty(strD2) && !TextUtils.isEmpty(strD3)) {
                        String str3 = d(C0135.m539(f21short, 452, 12, 712), jSONObjectOptJSONObject2) + C0087.m346(f21short, 464, 4, 1826) + d(C0092.m365(f21short, 468, 12, 1034), jSONObjectOptJSONObject2);
                        String strD4 = d(C0143.m570(f21short, 480, 14, 1008), jSONObjectOptJSONObject2);
                        if (!TextUtils.isEmpty(e(jSONObjectOptJSONObject2))) {
                            StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(strD4, C0044.m175(f21short, 494, 1, 3062));
                            sbP.append(e(jSONObjectOptJSONObject2));
                            strD4 = sbP.toString();
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(strD);
                        String strM459 = C0115.m459(f21short, 495, 1, 3025);
                        sb.append(strM459);
                        sb.append(strD2);
                        sb.append(strM459);
                        sb.append(strD3);
                        arrayList.add(new k(sb.toString(), str3, c(jSONObjectOptJSONObject2), strD4.trim()));
                    }
                }
            }
        }
        try {
            i = Integer.parseInt(str2);
        } catch (Exception unused3) {
            i = 1;
        }
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayList);
        gVarC.o(i, 1, 20, arrayList.size());
        return gVarC.r();
    }

    public static void a(ArrayList arrayList, ArrayList arrayList2, String str, String str2, String str3) {
        String strM368 = str;
        ArrayList arrayList3 = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList3.add(C0089.m355(f21short, 496, 4, 814) + str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList3.add(C0050.m199(f21short, 500, 4, 2741) + str3);
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        if (TextUtils.isEmpty(strM368)) {
            strM368 = C0093.m368(f21short, 504, 2, 2591);
        }
        arrayList.add(strM368);
        arrayList2.add(TextUtils.join(C0126.m503(f21short, 506, 1, 2610), arrayList3));
    }

    public static String b(String str) {
        try {
            String str2 = FishCrypto.v(C0074.m292(f21short, 507, 111, 3213)) + str;
            HashMap map = new HashMap();
            map.put(C0116.m463(f21short, 618, 10, 569), C0072.m285(f21short, 628, 111, 2808));
            return X1.X(str2, null, map);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(JSONObject jSONObject) {
        String strD = d(C0119.m473(f21short, 739, 5, 807), jSONObject);
        if (TextUtils.isEmpty(strD)) {
            strD = d(C0085.m339(f21short, 744, 9, 750), jSONObject);
        }
        if (TextUtils.isEmpty(strD)) {
            strD = d(C0044.m175(f21short, 753, 9, 771), jSONObject);
        }
        return TextUtils.isEmpty(strD) ? d(C0076.m301(f21short, 762, 4, 1460), jSONObject) : strD;
    }

    public static String d(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return "";
        }
        String strOptString = jSONObject.optString(str);
        return C0133.m529(f21short, 766, 4, 3252).equals(strOptString) ? "" : strOptString;
    }

    public static String e(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(C0001.m1(f21short, 770, 10, 1098));
        int iOptInt2 = jSONObject.optInt(C0090.m358(f21short, 780, 10, 1408));
        String strD = d(C0140.m558(f21short, 790, 7, 783), jSONObject);
        if (TextUtils.isEmpty(strD)) {
            strD = d(C0093.m368(f21short, 797, 14, 1352), jSONObject);
        }
        if (iOptInt <= 0 && iOptInt2 <= 0) {
            return strD;
        }
        return strD + C0119.m473(f21short, 811, 3, 2929) + iOptInt + C0126.m503(f21short, 814, 1, 3269) + iOptInt2;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0044.m175(f21short, 815, 15, 1382));
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

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0097.m386(f21short, 830, 13, 974));
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

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0135.m539(f21short, 843, 11, 2993));
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

    public void init(Context context, String str) {
        super.init(context, str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0081.m322(f21short, 854, 13, 2048));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$62d5eed2b06b9d14 = $host$62d5eed2b06b9d14(str, str2, list);
            FishCrypto.endHostEntry(null);
            return str$host$62d5eed2b06b9d14;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public String searchContent(String str, boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0137.m545(f21short, 867, 13, 2766));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0076.m301(f21short, 880, 13, 1988));
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
}
