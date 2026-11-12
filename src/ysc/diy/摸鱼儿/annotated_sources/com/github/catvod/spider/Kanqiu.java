package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Kanqiu extends Spider {
    public static String a = "";

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f63short = {2387, 417, 2598, 2597, 22872, -26408, 32452, 27805, 28763, 32694, 32065, 28440, -31227, 32693, 32066, 28443, 21906, 18994, 29200, 24649, 2435, 2522, 2505, 2522, 2498, 2467, 2435, 2522, 2451, 2461, 2433, 2522, 2498, 2522, 2459, 2457, 2444, 2461, 2481, 2460, 2522, 2516, 2522, 2454, 2457, 2453, 2461, 2522, 2498, 2522, 30083, 24179, 2522, 2516, 2522, 2446, 2457, 2452, 2445, 2461, 2522, 2498, 2467, 2435, 2522, 2454, 2522, 2498, 2522, 2486, 2490, 2489, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2505, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 2491, 2490, 2489, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2506, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 2479, 2486, 2490, 2489, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2506, 2504, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 29206, 32251, 30468, 24048, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2508, 2522, 2437, 2469, 2437, 2469, 2516, 2522, 2496, 2522, 2498, 2467, 2435, 2522, 2451, 2461, 2433, 2522, 2498, 2522, 2459, 2457, 2444, 2461, 2481, 2460, 2522, 2516, 2522, 2454, 2457, 2453, 2461, 2522, 2498, 2522, 30083, 24179, 2522, 2516, 2522, 2446, 2457, 2452, 2445, 2461, 2522, 2498, 2467, 2435, 2522, 2454, 2522, 2498, 2522, -29943, -31619, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2496, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, -32633, 31946, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2497, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 26871, 31946, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2505, 2504, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 22095, 31946, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2505, 2508, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 25901, 31946, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2505, 2509, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 25311, 22616, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2505, 2506, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 25311, -30292, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2505, 2507, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 18389, -31619, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2511, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 18274, 22616, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2505, 2505, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, -31669, 27075, 28311, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2506, 2511, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 30326, -30284, -30292, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2506, 2510, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 18389, 31946, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2507, 2505, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, -31669, 32251, 30468, 24048, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2506, 2507, 2522, 2437, 2469, 2437, 2469, 2516, 2522, 2506, 2505, 2522, 2498, 2467, 2435, 2522, 2451, 2461, 2433, 2522, 2498, 2522, 2459, 2457, 2444, 2461, 2481, 2460, 2522, 2516, 2522, 2454, 2457, 2453, 2461, 2522, 2498, 2522, 30083, 24179, 2522, 2516, 2522, 2446, 2457, 2452, 2445, 2461, 2522, 2498, 2467, 2435, 2522, 2454, 2522, 2498, 2522, 18091, -30390, 31949, -32706, 23048, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2506, 2505, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 30377, 32251, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2506, 2497, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 2486, 2494, 2484, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2506, 2509, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 30277, 25123, 32251, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2505, 2497, 2522, 2437, 2516, 2435, 2522, 2454, 2522, 2498, 2522, 24874, 32251, 2522, 2516, 2522, 2446, 2522, 2498, 2522, 2507, 2496, 2522, 2437, 2469, 2437, 2469, 2437, 1040, 1040, 1040, 1372, 2907, 2852, 2875, 2849, 2885, 2848, 2850, 2939, 2860, 2880, 2848, 2887, 2932, 2927, 2905, 2853, 2930, 2937, 2886, 2905, 2934, 2897, 2892, 2937, 2850, 2850, 2939, 2930, 2895, 2932, 2907, 2940, 2854, 2917, 2852, 2860, 2897, 2896, 2942, 2851, 2937, 2935, 2883, 2909, 2882, 2929, 2936, 2908, 2932, 2914, 2854, 2943, 2936, 2898, 2878, 2878, 2904, 2935, 2919, 2905, 2860, 2887, 2927, 2893, 2849, 2941, 2897, 2853, 2878, 2911, 2884, 2851, 2854, 2893, 2918, 2900, 2929, 2904, 2893, 2886, 2899, 2936, 2939, 2917, 2900, 2878, 2910, 2939, 2914, 2856, 2856, 2981, 2947, 2965, 2946, 3037, 2993, 2967, 2965, 2974, 2948, 2921, 2891, 2910, 2893, 2888, 2888, 2885, 2827, 2833, 2826, 2836, 2820, 2828, 2931, 2893, 2890, 2880, 2891, 2899, 2903, 2820, 2922, 2928, 2820, 2837, 2836, 2826, 2836, 2847, 2820, 2931, 2893, 2890, 2834, 2832, 2847, 2820, 2908, 2834, 2832, 2829, 2820, 2917, 2900, 2900, 2888, 2881, 2931, 2881, 2886, 2927, 2893, 2896, 2827, 2833, 2839, 2835, 2826, 2839, 2834, 2820, 2828, 2927, 2924, 2928, 2921, 2920, 2824, 2820, 2888, 2893, 2895, 2881, 2820, 2915, 2881, 2887, 2895, 2891, 2829, 2820, 2919, 2892, 2902, 2891, 2889, 2881, 2827, 2837, 2838, 2838, 2826, 2836, 2826, 2836, 2826, 2836, 2820, 2935, 2885, 2882, 2885, 2902, 2893, 2827, 2833, 2839, 2835, 2826, 2839, 2834, 24632, -31049, 22518, 27846, 21740, 21031, 2939, 2820, 2843, 2907, 2829, 2884, 2818, 2927, 2820, 2912, 2918, 2909, 2924, 2906, 2909, 2908, 2820, 2846, 2887, 2936, 2928, 2919, 2881, 2910, 2932, 2913, 2911, 2892, 2880, 2913, 2897, 2905, 2882, 2917, 2940, 2924, 2886, 2816, 2897, 2935, 2934, 2886, 2895, 2938, 2892, 2906, 2842, 2908, 2821, 2818, 2880, 2916, 2909, 2902, 2928, 2880, 2918, 2882, 2942, 2918, 2906, 2846, 2895, 2905, 2886, 2940, 2900, 2941, 2902, 2895, 2942, 2918, 2898, 2892, 2940, 2882, 2943, 2925, 2911, 2880, 2818, 2931, 2902, 2916, 2937, 2914, 2913, 2935, 2916, 2824, 2824, 2165, 2131, 2117, 2130, 2061, 2145, 2119, 2117, 2126, 2132, 1264, 1234, 1223, 1236, 1233, 1233, 1244, 1170, 1160, 1171, 1165, 1181, 1173, 1258, 1236, 1235, 1241, 1234, 1226, 1230, 1181, 1267, 1257, 1181, 1164, 1165, 1171, 1165, 1158, 1181, 1258, 1236, 1235, 1163, 1161, 1158, 1181, 1221, 1163, 1161, 1172, 1181, 1276, 1229, 1229, 1233, 1240, 1258, 1240, 1247, 1270, 1236, 1225, 1170, 1160, 1166, 1162, 1171, 1166, 1163, 1181, 1173, 1270, 1269, 1257, 1264, 1265, 1169, 1181, 1233, 1236, 
    1238, 1240, 1181, 1274, 1240, 1246, 1238, 1234, 1172, 1181, 1278, 1237, 1231, 1234, 1232, 1240, 1170, 1164, 1167, 1167, 1171, 1165, 1171, 1165, 1171, 1165, 1181, 1262, 1244, 1243, 1244, 1231, 1236, 1170, 1160, 1166, 1162, 1171, 1166, 1163, 1834, 1839, 1850, 1839, 2134, 2131, 2132, 2129, 2121, 1508, 2494, 2481, 2493, 2485, 1254, 1249, 1279, 3249, 3249, 3249, 787, 3218, 3242, 3247, 3238, 582, 580, 593, 576, 620, 577, 1216, 1215, 1184, 1213, 1245, 1236, 1215, 1251, 1270, 1238, 1215, 1250, 1273, 1222, 1274, 1224, 1220, 1256, 1211, 1211, 1271, 1189, 1246, 1219, 1212, 1241, 1271, 1229, 1261, 1259, 1270, 1276, 1229, 1219, 1207, 1272, 1238, 1268, 1245, 1221, 1279, 1221, 1246, 1229, 1231, 1254, 1246, 1271, 1259, 1274, 1238, 1271, 1247, 1259, 1243, 1211, 1222, 1255, 1263, 1250, 1227, 1270, 1263, 1260, 1221, 1220, 1206, 1209, 1224, 1216, 1189, 1206, 1219, 1236, 1260, 1229, 1229, 1245, 1259, 1275, 1208, 1249, 1239, 1250, 1185, 1189, 1225, 1275, 1273, 1203, 1203, 1744, 1683, 1686, 1673, 1690, 2337, 2311, 2321, 2310, 2393, 2357, 2323, 2321, 2330, 2304, 1771, 1737, 1756, 1743, 1738, 1738, 1735, 1673, 1683, 1672, 1686, 1670, 1678, 1777, 1743, 1736, 1730, 1737, 1745, 1749, 1670, 1768, 1778, 1670, 1687, 1686, 1672, 1686, 1693, 1670, 1777, 1743, 1736, 1680, 1682, 1693, 1670, 1758, 1680, 1682, 1679, 1670, 1767, 1750, 1750, 1738, 1731, 1777, 1731, 1732, 1773, 1743, 1746, 1673, 1683, 1685, 1681, 1672, 1685, 1680, 1670, 1678, 1773, 1774, 1778, 1771, 1770, 1674, 1670, 1738, 1743, 1741, 1731, 1670, 1761, 1731, 1733, 1741, 1737, 1679, 1670, 1765, 1742, 1748, 1737, 1739, 1731, 1673, 1687, 1684, 1684, 1672, 1686, 1672, 1686, 1672, 1686, 1670, 1781, 1735, 1728, 1735, 1748, 1743, 1673, 1683, 1685, 1681, 1672, 1685, 1680, 2076, 2142, 2139, 2113, 2118, 2079, 2133, 2112, 2141, 2119, 2114, 2079, 2139, 2118, 2135, 2143, 1288, 1348, 1362, 1352, 1288, 1348, 1362, 1352, 1291, 1366, 1364, 1359, 1355, 1351, 1364, 1375, 2762, 2768, 2759, 2756, 2779, 2695, 2714, 2690, 2779, 2705, 2776, 2715, 2714, 2715, 2704, 2377, 2308, 2312, 2315, 2378, 2335, 2324, 2378, 2390, 2707, 2711, 2717, 2306, 2307, 2322, 1760, 1788, 1788, 1784, 1787, 1714, 1703, 1703, 1784, 1761, 1771, 1702, 1761, 1765, 1775, 1772, 1770, 1702, 1771, 1766, 1703, 1761, 1788, 1773, 1765, 1703, 1726, 1725, 1727, 1726, 1727, 1723, 1772, 1726, 1771, 1724, 1725, 1712, 1712, 1725, 1723, 1769, 1773, 1774, 1774, 1713, 1724, 1769, 1770, 1713, 1702, 1762, 1784, 1775, 1178, 1158, 1158, 1154, 907, 919, 919, 915, 912, 1992, 2903, 2856, 2871, 2861, 2889, 2860, 2862, 2935, 2848, 2892, 2860, 2891, 2936, 2915, 2901, 2857, 2942, 2933, 2890, 2901, 2938, 2909, 2880, 2933, 2862, 2862, 2935, 2942, 2883, 2936, 2903, 2928, 2858, 2921, 2856, 2848, 2909, 2908, 2930, 2863, 2933, 2939, 2895, 2897, 2894, 2941, 2932, 2896, 2936, 2926, 2858, 2931, 2932, 2910, 2866, 2866, 2900, 2939, 2923, 2901, 2848, 2891, 2915, 2881, 2861, 2929, 2909, 2857, 2866, 2899, 2888, 2863, 2858, 2881, 2922, 2904, 2941, 2900, 2881, 2890, 2911, 2932, 2935, 2921, 2904, 2866, 2898, 2935, 2926, 2852, 2852, 617, 619, 638, 623, 621, 613, 632, 627, 585, 613, 612, 638, 623, 612, 638, 1064, 1065, 1080, 1069, 1061, 1056, 1039, 1059, 1058, 1080, 1065, 1058, 1080, 2546, 2549, 2551, 2559, 2521, 2549, 2548, 2542, 2559, 2548, 2542, 2723, 2780, 2755, 2751, 2750, 2691, 2698, 2745, 2746, 2747, 2719, 2724, 2692, 2745, 2751, 2751, 2698, 2720, 2697, 2720, 2744, 2692, 2697, 2725, 2743, 2711, 2780, 2703, 2782, 2729, 2699, 2721, 2694, 2776, 2715, 2691, 2741, 2695, 2721, 2694, 2779, 2731, 2699, 2719, 2777, 2709, 2699, 2714, 2712, 2780, 2698, 2696, 2716, 2711, 2781, 2745, 2773, 2725, 2728, 2743, 2758, 2723, 2735, 2780, 2703, 2744, 2690, 2778, 2713, 2697, 2731, 2750, 2709, 2720, 2729, 2703, 2727, 2715, 2735, 2773, 2748, 2711, 2722, 2773, 2749, 2689, 2732, 2715, 2694, 2708, 2702, 2779, 2734, 2689, 2781, 2694, 2722, 2749, 2728, 2697, 2699, 2699, 2720, 2732, 2741, 2691, 2777, 2717, 2690, 2781, 2768, 571, 551, 554, 562, 558, 569, 520, 548, 549, 575, 558, 549, 575};

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("", C0046.m182(f63short, 0, 1, 2402), C0046.m182(f63short, 1, 1, 409), C0133.m529(f63short, 2, 2, 2580));
        List listAsList2 = Arrays.asList(C0030.m116(f63short, 4, 4, 2096), C0032.m126(f63short, 8, 4, 2997), C0046.m182(f63short, 12, 4, 2998), C0105.m416(f63short, 16, 4, 1252));
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new com.github.catvod.spider.merge.p001b.b((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        return com.github.catvod.spider.merge.p001b.g.x(arrayList, new JSONObject(C0104.m414(f63short, 20, 586, 2552)));
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.C(FishCrypto.w(C0140.m558(f63short, 610, 91, 2837), str2.replace(C0133.m529(f63short, 606, 3, 1082), C0103.m408(f63short, 609, 1, 1407))));
        gVar.p();
        HashMap map = new HashMap();
        map.put(C0081.m322(f63short, 701, 10, 3056), C0095.m379(f63short, 711, 111, 2852));
        gVar.h(map);
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws JSONException {
        if (list.get(0).equals(a)) {
            return com.github.catvod.spider.merge.p001b.g.d(C0053.m210(f63short, 822, 6, 3052));
        }
        String str = list.get(0) + FishCrypto.v(C0082.m325(f63short, 828, 91, 2869));
        HashMap map = new HashMap();
        map.put(C0009.m33(f63short, 919, 10, 2080), C0017.m65(f63short, 929, 111, 1213));
        JSONArray jSONArray = new JSONObject(new String(Base64.decode(com.github.catvod.spider.merge.D.b.g(new JSONObject(X1.X(str, null, map)).optString(C0011.m42(f63short, 1040, 4, 1870)).substring(6), 2, 0), 0))).getJSONArray(C0105.m416(f63short, 1044, 5, 2106));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = jSONArray.length();
            String strM33 = C0009.m33(f63short, 1049, 1, 1479);
            if (i >= length) {
                k kVar = new k();
                kVar.n(list.get(0));
                kVar.q(C0112.m445(f63short, 1061, 4, 3267));
                kVar.r(TextUtils.join(strM33, arrayList));
                return com.github.catvod.spider.merge.p001b.g.s(kVar);
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            arrayList.add(jSONObject.optString(C0006.m21(f63short, 1050, 4, 2512)) + C0120.m477(f63short, 1060, 1, 823) + jSONObject.optString(C0027.m105(f63short, 1054, 3, 1171)).replace(strM33, C0104.m414(f63short, 1057, 3, 3227)));
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = str;
        String strM432 = C0109.m432(f63short, 1065, 6, 549);
        if (map.get(strM432) != null) {
            str3 = map.get(strM432);
        }
        String strM = com.github.catvod.spider.merge.D.b.m(new StringBuilder(), a, (str3 == null || str3.isEmpty()) ? "" : FishCrypto.v(C0142.m567(f63short, 1071, 91, 1166)) + str3 + C0140.m558(f63short, 1162, 5, 1791));
        HashMap map2 = new HashMap();
        map2.put(C0101.m402(f63short, 1167, 10, 2420), C0076.m301(f63short, 1177, 111, 1702));
        com.github.catvod.spider.merge.h0.d<com.github.catvod.spider.merge.f0.k> dVarQ = X1.L(X1.X(strM, null, map2), "").Q(C0101.m402(f63short, 1288, 16, 2098));
        ArrayList arrayList = new ArrayList();
        for (com.github.catvod.spider.merge.f0.k kVar : dVarQ) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            String strM445 = C0112.m445(f63short, 1304, 16, 1318);
            sb.append(kVar.Q(strM445).a(C0137.m545(f63short, 1320, 4, 2722)));
            String string = sb.toString();
            String strG = kVar.Q(C0050.m199(f63short, 1324, 11, 2805)).g();
            if (strG.isEmpty()) {
                strG = kVar.T();
            }
            com.github.catvod.spider.merge.h0.d dVarQ2 = kVar.Q(C0050.m199(f63short, 1335, 9, 2407));
            String strA = (dVarQ2.size() > 0 ? new com.github.catvod.spider.merge.h0.d((com.github.catvod.spider.merge.f0.k) dVarQ2.get(0)) : new com.github.catvod.spider.merge.h0.d()).f(C0063.m249(f63short, 1344, 3, 2810)).a(C0097.m386(f63short, 1347, 3, 2417));
            if (strA.isEmpty()) {
                strA = C0093.m368(f63short, 1350, 54, 1672);
            }
            if (!strA.startsWith(C0119.m473(f63short, 1404, 4, 1266))) {
                strA = com.github.catvod.spider.merge.D.b.m(new StringBuilder(), a, strA);
            }
            arrayList.add(new k(string, strG, strA, kVar.Q(strM445).g()));
        }
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.o(1, 1, 0, dVarQ.size());
        gVar.F(arrayList);
        return gVar.r();
    }

    public static String a(String str) {
        String strG = str;
        int iIndexOf = strG.indexOf(58);
        String strSubstring = iIndexOf > 0 ? strG.substring(0, iIndexOf) : C0143.m570(f63short, 1408, 5, 995);
        if (iIndexOf > 0) {
            strG = strG.substring(Math.min(iIndexOf + 3, strG.length()));
        }
        while (strG.endsWith(C0105.m416(f63short, 1413, 1, 2023))) {
            strG = com.github.catvod.spider.merge.D.b.g(strG, 1, 0);
        }
        StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strSubstring);
        sbO.append(FishCrypto.v(C0097.m386(f63short, 1414, 91, 2841)));
        sbO.append(strG);
        return sbO.toString();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0122.m486(f63short, 1505, 15, 522));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0032.m126(f63short, 1520, 13, 1100));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0092.m365(f63short, 1533, 11, 2458));
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
        Init.init(context);
        a = a(FishCrypto.v(C0143.m570(f63short, 1544, 111, 2797)));
        if (str.isEmpty()) {
            return;
        }
        a = a(str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0107.m427(f63short, 1655, 13, 587));
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
}
