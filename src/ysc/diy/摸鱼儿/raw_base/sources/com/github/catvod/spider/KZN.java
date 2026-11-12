package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class KZN extends Cloud {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f56short = {3082, 259, 280, 263, 325, 322, 327, 1143, 1132, 1139, 1041, 1046, 1043, 2446, 2435, 2443, 2436, 2451, 2435, 2436, 2445, 32133, 22465, 1666, 1693, 1666, 1665, 24120, -25959, 1426, 1437, 1409, 1424, 1409, 1414, 23546, -29363, 1629, 1552, 1565, 1565, 1561, 1537, 1629, 1544, 1543, 1563, 1546, 1563, 1564, 3267, 3295, 3295, 3291, 1938, 1995, 2004, 1929, 1939, 1934, 1951, 2007, 1940, 1947, 1943, 1951, 674, 750, 739, 739, 743, 673, 751, 739, 762, 745, 766, 684, 741, 737, 747, 2426, 2431, 2410, 2431, 2355, 2413, 2412, 2429, 1511, 1510, 1527, 356, 295, 318, 359, 292, 376, 362, 314, 647, 714, 710, 711, 733, 716, 711, 733, 644, 734, 731, 712, 729, 649, 729, 1024, 1117, 1095, 1114, 1099, 1027, 1097, 1089, 1038, 1103, 1141, 1094, 1116, 1099, 1096, 1139, 2025, 2035, 2020, 2023, 1652, 1637, 1642, 1578, 1653, 1649, 1637, 1654, 1647, 1578, 1639, 1642, 1579, 1655, 1579, 3143, 3153, 3146, 3157, 3142, 3085, 3158, 3136, 3085, 3136, 3149, 3084, 3152, 3084, 1614, 1603, 1606, 1622, 1626, 1601, 1611, 1629, 1606, 1625, 1610, 1537, 1612, 1600, 1602, 1536, 1628, 1536, 3319, 3322, 3327, 3302, 3319, 3320, 3256, 3317, 3321, 3323, 3257, 3301, 3257, 1866, 1861, 1862, 1884, 1869, 1799, 1816, 1809, 1808, 1799, 1866, 1863, 1798, 1712, 1714, 1722, 1706, 1702, 1725, 1789, 1762, 1760, 1770, 1789, 1712, 1724, 1726, 1788, 2944, 2961, 2974, 3038, 2962, 2961, 2969, 2964, 2949, 3038, 2963, 2975, 2973, 3039, 3109, 3109, 3105, 3130, 3191, 3195, 3193, 3131, 3175, 3131, 1954, 1954, 1958, 2032, 2039, 2045, 1981, 2032, 2044, 2046, 1980, 2016, 1980, 410, 409, 408, 475, 458, 453, 389, 456, 452, 454, 691, 688, 689, 754, 739, 748, 684, 737, 748, 2453, 2446, 2439, 2452, 2435, 2504, 2519, 2516, 2517, 2454, 2439, 2440, 2504, 2437, 2440, 2432, 2435, 2434, 2439, 2441, 2437, 2463, 2514, 2526, 2524, 1714, 1713, 1712, 1723, 1717, 1718, 1709, 1760, 1772, 1774, 961, 962, 963, 969, 961, 962, 990, 915, 927, 925, 366, 365, 364, 362, 358, 365, 369, 316, 304, 306, 1833, 1892, 1897, 1897, 1901, 1909, 1833, 704, 671, 654, 648, 650, 704, 2429, 2342, 2431, 2419, 2418, 2408, 2429, 2421, 2418, 2415, 2387, 2411, 2418, 2356, 23484, -31135, 28648, 20486, 2357, 1903, 1907, 1907, 1911, 1908, 1853, 1832, 1832, 1843, 1900, 1917, 1897, 1833, 1892, 1892, 2947, 2981, 2995, 2980, 3067, 2967, 2993, 2995, 3000, 2978, 1589, 1559, 1538, 1553, 1556, 1556, 1561, 1623, 1613, 1622, 1608, 1624, 1616, 1583, 1553, 1558, 1564, 1559, 1551, 1547, 1624, 1590, 1580, 1624, 1609, 1608, 1622, 1608, 1603, 1624, 1583, 1553, 1558, 1614, 1612, 1603, 1624, 1536, 1614, 1612, 1617, 1624, 1593, 1544, 1544, 1556, 1565, 1583, 1565, 1562, 1587, 1553, 1548, 1623, 1613, 1611, 1615, 1622, 1611, 1614, 1624, 1616, 1587, 1584, 1580, 1589, 1588, 1620, 1624, 1556, 1553, 1555, 1565, 1624, 1599, 1565, 1563, 1555, 1559, 1617, 1624, 1595, 1552, 1546, 1559, 1557, 1565, 1623, 1609, 1610, 1610, 1622, 1608, 1622, 1608, 1622, 1608, 1624, 1579, 1561, 1566, 1561, 1546, 1553, 1623, 1613, 1611, 1615, 1622, 1611, 1614, 329, 1481, 1493, 1493, 1489, 1490, 1435, 1422, 1422, 1429, 1482, 1499, 1487, 1423, 1474, 1486, 1484, 731, 711, 711, 707, 704, 649, 668, 668, 647, 728, 713, 733, 669, 720, 720, 649, 661, 661, 657, 731, 718, 718, 725, 650, 667, 655, 719, 642, 654, 652, 1814, 1812, 1793, 1808, 1810, 1818, 1799, 1804, 1846, 1818, 1819, 1793, 1808, 1819, 1793, 2140, 2141, 2124, 2137, 2129, 2132, 2171, 2135, 2134, 2124, 2141, 2134, 2124, 2588, 2587, 2585, 2577, 2615, 2587, 2586, 2560, 2577, 2586, 2560, 2828, 2832, 2832, 2836, 2486, 2469, 2467, 2494, 2484, 2491, 2482, 2186, 2224, 2179, 2201, 2190, 2189, 2241, 2262, 2252, 2244, 2185, 2180, 2180, 2176, 2244, 2252, 2230, 1546, 1552, 1543, 1540, 630, 626, 632, 1623, 1618, 1607, 1618, 1566, 1600, 1601, 1616, 1758, 1759, 1742, 3151, 3092, 3079, 3142, 2129, 2058, 2535, 2492, 2479, 2468, 2479, 2539, 2534, 2553, 2467, 2479, 2465, 2541, 2528, 2528, 2532, 2466, 2541, 2542, 2539, 2536, 2538, 782, 849, 832, 838, 836, 782, 2358, 2342, 2409, 2422, 2410, 2413, 2374, 2413, 2400, 2409, 2428, 2340, 2427, 2422, 2422, 2418, 2367, 2410, 2340, 412, 413, 399, 484, 497, 1628, 1543, 1630, 1618, 1619, 1609, 1628, 1620, 1619, 1614, 1650, 1610, 1619, 1557, 21661, -30400, 24777, 24359, 1556, 1851, 1908, 1844, 1855, 1826, 1838, 2819, 2837, 2833, 2818, 2835, 2840, 2867, 2847, 2846, 2820, 2837, 2846, 2820, 1071, 1081, 1085, 1070, 1087, 1076, 1055, 1075, 1074, 1064, 1081, 1074, 1064};
    public String r = C0046.m182(f56short, 366, 15, 1799);

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) {
        return k(str, C0116.m463(f56short, 0, 1, 3131));
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0018.m70(f56short, 1, 6, 375), C0076.m301(f56short, 7, 6, 1059), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0122.m486(f56short, 13, 8, 2538), C0085.m339(f56short, 21, 2, 2224), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0135.m539(f56short, 23, 4, 1768), C0140.m558(f56short, 27, 2, 3167), null));
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(C0081.m322(f56short, 29, 6, 1512), C0047.m186(f56short, 35, 2, 1163), null));
        return com.github.catvod.spider.merge.p001b.g.z(arrayList, j(X1.L(X1.X(com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.r, C0074.m292(f56short, 37, 13, 1650)), null, h()), "")));
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(String str, boolean z, String str2) {
        return k(str, str2);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Throwable {
        String str = list.get(0);
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(i(str.startsWith(C0105.m416(f56short, 50, 4, 3243)) ? str : com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.r, str)), null, h()), "");
        k kVarA = AbstractC0449a.a(str);
        com.github.catvod.spider.merge.f0.k kVarR = gVarL.R(C0118.m471(f56short, 54, 12, 2042));
        if (kVarR != null) {
            kVarA.o(kVarR.T().trim());
        }
        com.github.catvod.spider.merge.f0.k kVarR2 = gVarL.R(C0143.m570(f56short, 66, 15, 652));
        if (kVarR2 != null) {
            String strC = kVarR2.c(C0044.m175(f56short, 81, 8, 2334));
            if (TextUtils.isEmpty(strC)) {
                strC = kVarR2.c(C0053.m210(f56short, 89, 3, 1428));
            }
            kVarA.p(strC);
        }
        com.github.catvod.spider.merge.f0.k kVarR3 = gVarL.R(C0021.m83(f56short, 92, 8, 330));
        if (kVarR3 != null) {
            kVarA.s(kVarR3.T().trim());
        }
        com.github.catvod.spider.merge.f0.k kVarR4 = gVarL.R(C0135.m539(f56short, 100, 15, 681));
        if (kVarR4 != null) {
            kVarA.l(kVarR4.T().trim());
        }
        com.github.catvod.spider.merge.h0.d dVarQ = gVarL.Q(C0143.m570(f56short, 115, 16, 1070));
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = dVarQ.iterator();
        while (it.hasNext()) {
            String strTrim = ((com.github.catvod.spider.merge.f0.k) it.next()).c(C0106.m422(f56short, 131, 4, 1921)).trim();
            if (!TextUtils.isEmpty(strTrim)) {
                if (!strTrim.contains(C0017.m65(f56short, 135, 15, 1540)) && !strTrim.contains(C0092.m365(f56short, 150, 14, 3107)) && !strTrim.contains(C0072.m285(f56short, 164, 18, 1583)) && !strTrim.contains(C0073.m288(f56short, 182, 13, 3222)) && !strTrim.contains(C0008.m31(f56short, 195, 13, 1833)) && !strTrim.contains(C0105.m416(f56short, 208, 15, 1747)) && !strTrim.contains(C0019.m75(f56short, 223, 14, 3056)) && !strTrim.contains(C0101.m402(f56short, 237, 10, 3092)) && !strTrim.contains(C0126.m503(f56short, 247, 13, 1939))) {
                    if (!TextUtils.isEmpty(strTrim)) {
                        String lowerCase = strTrim.toLowerCase();
                        if (lowerCase.contains(C0087.m346(f56short, 260, 10, 427)) || lowerCase.contains(C0081.m322(f56short, 270, 9, 642)) || lowerCase.contains(C0114.m454(f56short, 279, 15, 2534)) || lowerCase.contains(C0104.m414(f56short, 294, 10, 2481)) || lowerCase.contains(C0017.m65(f56short, 304, 10, 1667)) || lowerCase.contains(C0137.m545(f56short, 314, 10, 1008)) || lowerCase.contains(C0079.m314(f56short, 324, 10, 351))) {
                        }
                    }
                }
                arrayList.add(strTrim);
            }
        }
        if (!arrayList.isEmpty()) {
            String strB = b(arrayList);
            kVarA.r(strB);
            kVarA.q(a(arrayList));
            AbstractC0280n1.p(kVarR != null ? kVarR.T().trim() : "");
            AbstractC0280n1.q(strB);
        }
        boolean z = FishCrypto.a;
        N1.d(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        int i = Integer.parseInt(str2);
        String strN = com.github.catvod.spider.merge.D.b.n(new StringBuilder(), this.r, C0047.m186(f56short, 334, 7, 1798), str);
        if (i > 1) {
            strN = strN + C0001.m1(f56short, 341, 6, 751) + i;
        }
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(strN, null, h()), "");
        ArrayList arrayListJ = j(gVarL);
        int i2 = gVarL.R(C0014.m54(f56short, 347, 19, 2332)) != null ? i + 1 : i;
        com.github.catvod.spider.merge.p001b.g gVarC = com.github.catvod.spider.merge.D.b.c(arrayListJ);
        gVarC.o(i, i2, arrayListJ.size(), 0);
        return gVarC.r();
    }

    public static HashMap h() {
        return com.github.catvod.spider.merge.D.b.s(C0096.m382(f56short, 381, 10, 3030), C0017.m65(f56short, 391, 111, 1656));
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strTrim = str.trim();
        while (strTrim.endsWith(C0095.m379(f56short, 502, 1, 358))) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
        }
        String strM33 = C0009.m33(f56short, 503, 16, 1441);
        String strM182 = C0046.m182(f56short, 519, 15, 691);
        return strTrim.replace(strM33, strM182).replace(C0107.m427(f56short, 534, 15, 737), strM182);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0142.m567(f56short, 549, 15, 1909));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0130.m516(f56short, 564, 13, 2104));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0009.m33(f56short, 577, 11, 2676));
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

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        super.init(context, str);
        if (str == null || str.isEmpty() || !str.startsWith(C0003.m10(f56short, 588, 4, 2916))) {
            return;
        }
        this.r = i(str);
    }

    public final ArrayList j(com.github.catvod.spider.merge.f0.g gVar) {
        String strC;
        ArrayList arrayList = new ArrayList();
        for (com.github.catvod.spider.merge.f0.k kVar : gVar.Q(C0044.m175(f56short, 592, 7, 2519))) {
            try {
                com.github.catvod.spider.merge.f0.k kVarR = kVar.R(C0098.m390(f56short, 599, 17, 2283));
                if (kVarR != null) {
                    String strI = i(kVarR.c(C0133.m529(f56short, 616, 4, 1634)));
                    if (strI.startsWith(this.r)) {
                        strI = strI.substring(this.r.length());
                    }
                    com.github.catvod.spider.merge.f0.k kVarR2 = kVar.R(C0044.m175(f56short, 620, 3, 543));
                    if (kVarR2 != null) {
                        strC = kVarR2.c(C0126.m503(f56short, 623, 8, 1587));
                        if (TextUtils.isEmpty(strC)) {
                            strC = kVarR2.c(C0089.m355(f56short, 631, 3, 1709));
                        }
                    } else {
                        strC = "";
                    }
                    com.github.catvod.spider.merge.f0.k kVarR3 = kVar.R(C0027.m105(f56short, 634, 4, 3111));
                    if (kVarR3 == null) {
                        kVarR3 = kVar.R(C0103.m408(f56short, 638, 2, 2105));
                    }
                    String strTrim = kVarR3 != null ? kVarR3.T().trim() : "";
                    com.github.catvod.spider.merge.f0.k kVarR4 = kVar.R(C0119.m473(f56short, 640, 21, 2447));
                    String strTrim2 = kVarR4 != null ? kVarR4.T().trim() : "";
                    if (!strI.isEmpty() && !strTrim.isEmpty()) {
                        arrayList.add(new k(strI, strTrim, strC, strTrim2));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public final String k(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        com.github.catvod.spider.merge.D.b.A(sb, this.r, C0115.m459(f56short, 661, 6, 801), str2, C0140.m558(f56short, 667, 19, 2329));
        sb.append(URLEncoder.encode(str, C0117.m467(f56short, 686, 5, 457)));
        com.github.catvod.spider.merge.f0.g gVarL = X1.L(X1.X(sb.toString(), null, h()), "");
        ArrayList arrayListJ = j(gVarL);
        if (gVarL.R(C0133.m529(f56short, 691, 19, 1597)) == null) {
            gVarL.R(C0076.m301(f56short, 710, 6, 1882));
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayListJ);
    }

    public String searchContent(String str, boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0135.m539(f56short, 716, 13, 2928));
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
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0093.m368(f56short, 729, 13, 1116));
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
