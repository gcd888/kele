package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class ShuangXing extends Cloud {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f89short = {1433, 1414, 21124, 26455, 22453, 21295, 927, 924, 24544, 27187, 29392, -29098, 3005, 2982, 21594, 24969, 29347, 22759, 558, 551, 22617, 28042, 22845, 25790, 1688, 1666, 21078, 26501, -27021, 25727, 2440, 2460, 22220, 25375, -30735, 31374, 1409, 1436, 23545, 28202, 20771, 23122, 1763, 1773, 20859, 25768, 30042, 20688, 1633, 1376, 1404, 1404, 1400, 1403, 1330, 1319, 1319, 1337, 1318, 1403, 1404, 1385, 1402, 1338, 1318, 1387, 1382, 2636, 2584, 2625, 443, 424, 495, 438, 441, -31016, 25868, 3061, 3064, 2982, 2533, 2533, 2513, 2788, 3280, 3288, 3299, 3326, 3306, 3301, 3308, 3283, 3298, 3301, 3308, 3286, 3243, 3311, 3310, 3327, 3306, 3298, 3303, 3272, 3300, 3301, 3327, 3310, 3301, 3327, 3249, 3243, 2425, 2405, 2405, 2401, 2402, 2347, 2366, 2366, 2336, 2367, 2402, 2405, 2416, 2403, 2339, 2367, 2418, 2431, 2366, 2145, 624, 632, 579, 606, 586, 581, 588, 627, 578, 581, 588, 630, 523, 584, 586, 607, 590, 588, 580, 601, 594, 616, 580, 581, 607, 590, 581, 607, 529, 523, 2036, 2018, 2041, 2022, 2037, 1982, 2021, 2035, 1982, 2035, 2046, 460, 451, 448, 474, 459, 385, 414, 407, 406, 385, 460, 449, 2923, 2938, 2933, 2869, 2922, 2926, 2938, 2921, 2928, 2869, 2936, 2933, 716, 733, 722, 658, 734, 733, 725, 728, 713, 658, 735, 723, 721, 2297, 2292, 2289, 2280, 2297, 2294, 2230, 2299, 2295, 2293, 3181, 3168, 3173, 3189, 3193, 3170, 3176, 3198, 3173, 3194, 3177, 3106, 3183, 3171, 3169, 1191, 1191, 1187, 1208, 1269, 1273, 1275, 1422, 1422, 1418, 1500, 1499, 1489, 1425, 1500, 1488, 1490, 2986, 2992, 2983, 2980, 3071, 3040, 2986, 2998, 2998, 2994, 2128, 2850, 2849, 2848, 2915, 2930, 2941, 2877, 2928, 2940, 2942, 2758, 2757, 2756, 2695, 2710, 2713, 2777, 2708, 2713, 2453, 2446, 2439, 2452, 2435, 2504, 2519, 2516, 2517, 2454, 2439, 2440, 2504, 2437, 2440, 1732, 1735, 1734, 1731, 1741, 1729, 1755, 1686, 1690, 1688, 1092, 1095, 1094, 1101, 1091, 1088, 1115, 1046, 1050, 1048, 3104, 3107, 3106, 3112, 3104, 3107, 3135, 3186, 3198, 3196, 342, 341, 340, 338, 350, 341, 329, 260, 264, 266, 849, 792, 769, 845, 782, 769, 780, 798, 798, 848, 847, 776, 799, 789, 832, 769, 772, 798, 793, 847, 851, 1039, 1052, 1094, 1119, 1037, 3011, 2963, 2966, 3039, 2972, 2963, 2974, 2956, 2956, 3010, 3037, 2966, 2955, 2970, 2962, 3184, 3117, 3180, 3108, 3134, 3113, 3114, 3185, 3182, 699, 2969, 2949, 2949, 2945, 1426, 1433, 1422, 1433, 1419, 1435, 1418, 1425, 1416, 1420, 1308, 2112, 2131, 2077, 2114, 12878, 13660, 2403, 2348, 2351, 2366, 2353, 2431, 2364, 2355, 2366, 2348, 2348, 2402, 2429, 2362, 2349, 2343, 2418, 2353, 2346, 2354, 2418, 2361, 2352, 2353, 2347, 2431, 2347, 2358, 2354, 2362, 2429, 2401, 2520, 2507, 2455, 2452, 2437, 2442, 2522, 2271, 2269, 2248, 2265, 2267, 2259, 2254, 2245, 2303, 2259, 2258, 2248, 2265, 2258, 2248, 1037, 1036, 1053, 1032, 1024, 1029, 1066, 1030, 1031, 1053, 1036, 1031, 1053, 602, 605, 607, 599, 625, 605, 604, 582, 599, 604, 582, 1808, 1804, 1804, 1800, 1803, 1858, 1879, 1879, 1865, 1878, 1803, 1804, 1817, 1802, 1866, 1878, 1819, 1814, 1051, 1069, 1084, 1125, 1035, 1063, 1063, 1059, 1057, 1069, 818, 804, 802, 820, 819, 804, 893, 885, 846, 851, 839, 840, 833, 894, 847, 840, 833, 891, 774, 832, 835, 850, 837, 846, 869, 841, 841, 845, 847, 835, 796, 774, 1429, 1437, 1446, 1467, 1455, 1440, 1449, 1430, 1447, 1440, 1449, 1427, 1518, 1447, 1440, 1447, 1466, 1524, 1518, 1238, 1264, 1254, 1265, 1198, 1218, 1252, 1254, 1261, 1271, 3010, 3040, 3061, 3046, 3043, 3043, 3054, 2976, 3002, 2977, 3007, 2991, 2983, 3032, 3046, 3041, 3051, 3040, 3064, 3068, 2991, 3009, 3035, 2991, 3006, 3007, 2977, 3007, 2996, 2991, 3032, 3046, 3041, 3001, 3003, 2996, 2991, 3063, 3001, 3003, 2982, 2991, 3022, 3071, 3071, 3043, 3050, 3032, 3050, 3053, 3012, 3046, 3067, 2976, 3002, 3004, 3000, 2977, 3004, 3001, 2991, 2983, 3012, 3015, 3035, 3010, 3011, 2979, 2991, 3043, 3046, 3044, 3050, 2991, 3016, 3050, 3052, 3044, 3040, 2982, 2991, 3020, 3047, 3069, 3040, 3042, 3050, 2976, 3006, 3003, 3004, 2977, 3007, 2977, 3007, 2977, 3007, 2991, 3036, 3054, 3049, 3054, 3069, 3046, 2976, 3002, 3004, 3000, 2977, 3004, 3001, 749, 730, 729, 730, 717, 730, 717, 1368, 1348, 1348, 1344, 1347, 1290, 1311, 1311, 1281, 1310, 1347, 1348, 1361, 1346, 1282, 1310, 1363, 1374, 1061, 1033, 1033, 1037, 1039, 1027, 1247, 1219, 1219, 1223, 1220, 1165, 1176, 1176, 1158, 1177, 1220, 1219, 1238, 1221, 1157, 1177, 1236, 1241, 1176, 1220, 1234, 1238, 1221, 1236, 1247, 1176, 1160, 1244, 1234, 1230, 1216, 1240, 1221, 1235, 1162, 1623, 1622, 1604, 1583, 1594, 2808, 2800, 2763, 2774, 2754, 2765, 2756, 2811, 2762, 2765, 2756, 2814, 2691, 2768, 2758, 2754, 2769, 2752, 2763, 2713, 2691, 2209, 2231, 2227, 2208, 2225, 2234, 2193, 2237, 2236, 2214, 2231, 2236, 2214, 2024, 2046, 2042, 2025, 2040, 2035, 2008, 2036, 2037, 2031, 2046, 2037, 2031};
    public String r = "";

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return l(str);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("ju", "双星国剧", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("zy", "双星综艺", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("mv", "双星电影", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("dm", "双星动漫", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("rh", "双星韩日", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("ym", "双星英美", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("wj", "双星外剧", null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b("dj", "双星短剧", null));
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, new ArrayList());
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return l(str);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        int iIndexOf;
        String strM126 = ">";
        String strM182 = "https://1.star2.cn";
        if (list == null || list.isEmpty()) {
            return AbstractC0449a.b();
        }
        try {
            String str = list.get(0);
            String strX = X1.X(strM182 + str, null, j());
            if (TextUtils.isEmpty(strX)) {
                return com.github.catvod.spider.merge.p001b.g.s(new k());
            }
            String strM408 = "<h1";
            String strM467 = "</h1>";
            int iIndexOf2 = strX.indexOf(strM408);
            String strSubstring = (iIndexOf2 == -1 || (iIndexOf = strX.indexOf(strM467, iIndexOf2)) == -1) ? "" : strX.substring(3 + iIndexOf2, iIndexOf);
            if (strSubstring.contains(strM126)) {
                strSubstring = strSubstring.substring(strSubstring.indexOf(strM126) + 1);
            }
            ArrayList arrayListH = h(strX);
            k kVar = new k();
            kVar.n(str);
            kVar.o(strSubstring);
            kVar.p("");
            StringBuilder sb = new StringBuilder("资源id:");
            sb.append(str);
            sb.append(">>\n");
            Iterator it = arrayListH.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append("\n");
            }
            kVar.l(sb.toString());
            if (!arrayListH.isEmpty()) {
                String strB = b(arrayListH);
                kVar.q(a(arrayListH));
                kVar.r(strB);
                AbstractC0280n1.p(strSubstring);
                AbstractC0280n1.q(strB);
            }
            boolean z = FishCrypto.a;
            N1.d(kVar);
            return com.github.catvod.spider.merge.p001b.g.s(kVar);
        } catch (Exception e) {
            SpiderDebug.log("[ShuangXing] detailContent: " + e.getMessage());
            return com.github.catvod.spider.merge.p001b.g.s(new k());
        }
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            String strX = X1.X("https://1.star2.cn/" + str + "_" + str2, null, j());
            if (TextUtils.isEmpty(strX)) {
                return com.github.catvod.spider.merge.p001b.g.y(new ArrayList());
            }
            ArrayList arrayListK = k(strX);
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.F(arrayListK);
            gVar.o(Integer.parseInt(str2), 100, 20, arrayListK.size());
            return gVar.r();
        } catch (Exception e) {
            SpiderDebug.log("[ShuangXing] categoryContent: " + e.getMessage());
            return com.github.catvod.spider.merge.p001b.g.y(new ArrayList());
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x017e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0188 A[SYNTHETIC] */
    public static ArrayList h(String str) {
        int i;
        int iIndexOf;
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"pan.quark.cn", "pan.baidu.com", "alipan.com", "aliyundrive.com", "drive.uc.cn", "cloud.189.cn", "115.com", "115cdn.com"};
        int i2 = 0;
        while (true) {
            int iIndexOf2 = str.indexOf("href=\"http", i2);
            if (iIndexOf2 == -1 || (iIndexOf = str.indexOf("\"", (i = iIndexOf2 + 6))) == -1) {
                break;
            }
            String strSubstring = str.substring(i, iIndexOf);
            for (int i3 = 0; i3 < 8; i3++) {
                if (strSubstring.contains(strArr[i3])) {
                    if (!arrayList.contains(strSubstring)) {
                        arrayList.add(strSubstring);
                        break;
                        break;
                    }
                } else {
                    String lowerCase = strSubstring.toLowerCase();
                    if (lowerCase.contains("123pan.com") || lowerCase.contains("123pan.cn") || lowerCase.contains("share.123pan.cn") || lowerCase.contains("123684.com") || lowerCase.contains("123865.com") || lowerCase.contains("123912.com") || lowerCase.contains("123592.com")) {
                        if (!arrayList.contains(strSubstring)) {
                            arrayList.add(strSubstring);
                            break;
                        }
                    }
                }
            }
            i2 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static ArrayList k(String str) {
        int iIndexOf;
        int i;
        int iIndexOf2;
        String strM193;
        int iIndexOf3;
        int i2;
        int iIndexOf4;
        int iIndexOf5;
        int i3;
        int iIndexOf6;
        ArrayList arrayList = new ArrayList();
        int iIndexOf7 = str.indexOf("<ul class=\"erx-list\">");
        if (iIndexOf7 == -1 || (iIndexOf = str.indexOf("</ul>", iIndexOf7)) == -1) {
            return arrayList;
        }
        String[] strArrSplit = str.substring(iIndexOf7, iIndexOf).split("<li class=\"item");
        for (int i4 = 1; i4 < strArrSplit.length; i4++) {
            String str2 = strArrSplit[i4];
            int iIndexOf8 = str2.indexOf("<a href=\"");
            if (iIndexOf8 != -1 && (iIndexOf2 = str2.indexOf("\"", (i = iIndexOf8 + 9))) != -1) {
                String strSubstring = str2.substring(i, iIndexOf2);
                if (!strSubstring.startsWith("http") && !strSubstring.startsWith("javascript") && (iIndexOf3 = str2.indexOf((strM193 = ">"), iIndexOf2)) != -1 && (iIndexOf4 = str2.indexOf("</a>", (i2 = iIndexOf3 + 1))) != -1) {
                    StringBuilder sb = new StringBuilder(str2.substring(i2, iIndexOf4));
                    while (true) {
                        int iIndexOf9 = sb.indexOf("【");
                        if (iIndexOf9 < 0) {
                            break;
                        }
                        int iIndexOf10 = sb.indexOf("】", iIndexOf9);
                        if (iIndexOf10 > iIndexOf9) {
                            sb.delete(iIndexOf9, iIndexOf10 + 1);
                        } else {
                            sb.delete(iIndexOf9, sb.length());
                        }
                    }
                    String strTrim = sb.toString().trim();
                    int iIndexOf11 = str2.indexOf("<span class=\"erx-num-font time\">");
                    String strSubstring2 = (iIndexOf11 == -1 || (iIndexOf5 = str2.indexOf(strM193, iIndexOf11 + 31)) == -1 || (iIndexOf6 = str2.indexOf("</span>", (i3 = iIndexOf5 + 1))) == -1) ? "" : str2.substring(i3, iIndexOf6);
                    if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strSubstring)) {
                        arrayList.add(new k(strSubstring, strTrim, "", strSubstring2));
                    }
                }
            }
        }
        return arrayList;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "categoryContent");
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "detailContent");
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "homeContent");
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
        String strM554 = "https://1.star2.cn";
        String strM463 = "Set-Cookie";
        try {
            Response responseExecute = new OkHttpClient.Builder().followRedirects(false).followSslRedirects(false).build().newCall(new Request.Builder().url(strM554).headers(Headers.of(j())).build()).execute();
            Map multimap = responseExecute.headers().toMultimap();
            responseExecute.close();
            if (multimap != null && multimap.containsKey(strM463)) {
                StringBuilder sb = new StringBuilder();
                List list = (List) multimap.get(strM463);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sb.append(((String) it.next()).replaceAll("secure", ""));
                    }
                }
                return sb.toString();
            }
            return "";
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[ShuangXing] fetchCookie: "));
            return "";
        }
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        super.init(context, str);
        try {
            this.r = i();
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[ShuangXing] init: "));
        }
    }

    public final HashMap j() {
        HashMap mapT = com.github.catvod.spider.merge.D.b.t("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/143.0.0.0 Safari/537.36", "Referer", "https://1.star2.cn");
        mapT.put("Cookie", this.r);
        return mapT;
    }

    public final String l(String str) {
        try {
            String strX = X1.X("https://1.star2.cn/search/?keyword=" + URLEncoder.encode(str, "UTF-8"), null, j());
            return TextUtils.isEmpty(strX) ? com.github.catvod.spider.merge.p001b.g.y(new ArrayList()) : com.github.catvod.spider.merge.p001b.g.y(k(strX));
        } catch (Exception e) {
            SpiderDebug.log("[ShuangXing] search: " + e.getMessage());
            return com.github.catvod.spider.merge.p001b.g.y(new ArrayList());
        }
    }

    public String searchContent(String str, boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "searchContent");
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "searchContent");
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
