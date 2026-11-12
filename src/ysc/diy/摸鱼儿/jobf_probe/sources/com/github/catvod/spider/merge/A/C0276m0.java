package com.github.catvod.spider.merge.A;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.github.catvod.spider.C0141;
import com.github.catvod.spider.merge.B.C0005;
import com.github.catvod.spider.merge.E.C0013;
import com.github.catvod.spider.merge.E.C0015;
import com.github.catvod.spider.merge.G.C0020;
import com.github.catvod.spider.merge.L.C0031;
import com.github.catvod.spider.merge.L.C0033;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.N.C0035;
import com.github.catvod.spider.merge.O.C0038;
import com.github.catvod.spider.merge.Q.C0040;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.T.C0048;
import com.github.catvod.spider.merge.X.C0051;
import com.github.catvod.spider.merge.X.C0052;
import com.github.catvod.spider.merge.b0.C0060;
import com.github.catvod.spider.merge.f0.C0077;
import com.github.catvod.spider.merge.f0.C0080;
import com.github.catvod.spider.merge.h0.C0086;
import com.github.catvod.spider.merge.k0.C0099;
import com.github.catvod.spider.merge.p002c.C0062;
import com.github.catvod.spider.merge.p003d.C0066;
import com.github.catvod.spider.merge.p004e.C0071;
import com.github.catvod.spider.merge.p007h.C0084;
import com.github.catvod.spider.merge.p008i.C0088;
import com.github.catvod.spider.merge.p011m.C0102;
import com.github.catvod.spider.merge.p016t.C0121;
import com.github.catvod.spider.merge.p020x.C0136;
import com.github.catvod.spider.merge.t0.C0123;
import com.github.catvod.utils.C0144;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.MessageDigest;
import moyu.fucking.C0149;
import moyu.fucking.C0151;
import moyu.fucking.C0152;
import moyu.fucking.C0157;
import moyu.fucking.C0162;
import moyu.fucking.C0178;
import moyu.fucking.C0179;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0191;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0216;
import moyu.fucking.C0221;
import moyu.fucking.C0224;
import moyu.fucking.C0225;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0276m0 {
    public static final String a;
    public static volatile String b;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f145short = {2451, 2462, 2462, 2437, 2811, 2804, 1435, 2478, 2475, 2464, 2436, 2475, 2481, 2474, 2437, 2487, 2467, 2480, 2470, 2543, 2484, 2554, 703, 684, 691, 744, 746, 755, 680, 742, 703, 2841, 2844, 2839, 2867, 2844, 2822, 2845, 2866, 2816, 2836, 2823, 2833, 2904, 2819, 2882, 2630, 2645, 2634, 2626, 2630, 2629, 2638, 2570, 2641, 2576, 2630, 2199, 2206, 2287, 3075, 3074, 3073, 3072, 3079, 3078, 3077, 3076, 3083, 3082, 3154, 3153, 3152, 3159, 3158, 3157, 1774, 1715, 1711, 1025, 1090, 1099, 1050, 1143, 1124, 1147, 1056, 1058, 1083, 1120, 1070, 1143, 1913, 1899, 1899, 1917, 1900, 1899, 1847, 1886, 1905, 1899, 1904, 1887, 1901, 1913, 1898, 1916, 1845, 1902, 1824, 1846, 1899, 1911, 2545, 2548, 2559, 2523, 2548, 2542, 2549, 2522, 2536, 2556, 2543, 2553, 2480, 2539, 2469, 2773, 2758, 2777, 2769, 2773, 2774, 2781, 2713, 2754, 2691, 2773, 305, 291, 291, 309, 292, 291, 383, 278, 313, 291, 312, 279, 293, 305, 290, 308, 381, 294, 359, 382, 291, 319, 2822, 2819, 2824, 2860, 2819, 2841, 2818, 2861, 2847, 2827, 2840, 2830, 2887, 2844, 2909, 985, 964, 1003, 1009, 1002, 977, 1005, 974, 1005, 995, 998, 999, 1008, 991, 930, 2719, 2718, 2717, 2714, 2702, 2711, 2703, 514, 1830, 1828, 1843, 1830, 1847, 1828, 1843, 1910, 1840, 1847, 1855, 1850, 1843, 1842, 1900, 1910, 3154, 3144, 975, 984, 969, 975, 964, 925, 988, 991, 980, 925, 987, 988, 980, 977, 984, 985, 903, 925, 2291, 2276, 2293, 2291, 2296, 2209, 2272, 2275, 2280, 2235, 2209, 1718, 1701, 1722, 1761, 1763, 1786, 1697, 1775, 1718, 2114, 2129, 2126, 2118, 2114, 2113, 2122, 2062, 2133, 2068, 2114, 1030, 1052, 2751, 2733, 2733, 2747, 2730, 2733, 2801, 2712, 2743, 2733, 2742, 2713, 2731, 2751, 2732, 2746, 2800, 2739, 2746, 2795, 1782, 1783, 1765, 1678, 1691, 1751, 1747, 1737, 1737, 1747, 1748, 1757, 1690, 1751, 1758, 1679, 1690, 1751, 1759, 1742, 1755, 1664, 1690, 947, 956, 934, 957, 934, 954, 2832, 483, 446, 418, 1646, 1581, 1572, 1653, 1518, 1529, 1519, 1523, 1513, 1518, 1535, 1529, 1468, 1521, 1525, 1519, 1519, 1525, 1522, 1531, 1446, 1468, 1290, 1281, 1284, 1286, 1293, 1677, 1677, 1677, 1762, 1720, 1697, 1724, 1683, 2738, 2747, 2762, 3232, 3247, 3242, 3235, 3302, 3250, 3241, 3241, 3302, 3242, 3239, 3252, 3233, 3235, 1382, 1087, 1086, 1068, 1095, 1106, 1089, 1117, 1074, 1122, 1127, 1136, 1150, 1147, 1137, 1139, 1126, 1147, 1149, 1148, 1074, 1140, 1139, 1147, 1150, 1143, 1142, 2984, 2991, 2999, 2976, 2989, 2984, 2981, 3041, 2994, 2990, 3041, 2995, 2980, 2994, 2990, 2996, 2995, 2978, 2980, 3067, 3041, 1190, 1194, 1255, 1262, 1215, 1207, 1607, 1600, 1629, 1626, 1615, 1602, 1602, 1550, 1608, 1615, 1607, 1602, 1611, 1610, 1556, 1550, 1885, 1863, 2212, 2213, 2231, 2268, 2249, 1384, 1407, 1386, 1403, 1395, 1384, 1338, 1404, 1403, 1395, 1398, 1407, 1406, 1312, 1338, 3221, 3215, 2186, 2201, 2182, 2269, 2271, 2246, 2205, 2259, 2186, 2741, 2736, 2749, 2727, 2744, 2746, 2815, 2722, 2728, 2722, 2725, 2740, 2748, 2815, 2695, 2716, 2691, 2724, 2751, 2725, 2744, 2748, 2740, 2859, 2857, 2872, 2846, 2873, 2850, 2872, 2853, 2849, 2857, 1641, 1651, 1590, 1588, 1602, 1641, 1652, 835, 848, 847, 788, 790, 736, 755, 748, 867, 866, 1946, 1929, 1942, 1950, 1946, 1945, 1938, 2006, 1933, 1996, 1946};

    static {
        String str;
        ClassLoader classLoader = C0276m0.class.getClassLoader();
        long jLongValue = ((Long) C0182.n(75677, null, new Object[0])).longValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (classLoader == null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    String str2 = (String) C0152.n(39710, null, new Object[]{(short[]) C0151.n(99963), 0, Integer.valueOf(C0042.f198 ^ 63), 2545});
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                str = str2;
                                break;
                        }
                    }
                    break;
                case 239:
                    str = (String) C0151.n(25829, null, new Object[]{Integer.valueOf(((Integer) C0151.n(64742, null, new Object[]{classLoader})).intValue())});
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
        StringBuilder sb = (StringBuilder) C0151.n(4592, null, new Object[]{(String) C0149.n(83930, null, new Object[]{(short[]) C0151.n(99963), 4, Integer.valueOf(C0088.f297 ^ 489), 2712}), str, (String) C0178.n(26978, null, new Object[]{(short[]) C0151.n(99963), 6, 1, 1462})});
        a = (String) C0151.n(3997, null, new Object[]{(String) C0198.n(89992, sb, new Object[0])});
    }

    private C0276m0() throws Throwable {
        int iIntValue = ((Integer) C0181.n(79147, null, new Object[0])).intValue();
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
                    C0157.n(99237, (PrintStream) C0195.n(72538), new Object[]{Double.valueOf(((Double) C0157.n(3141, null, new Object[]{(String) C0181.n(74690, null, new Object[]{(String) C0151.n(20921)})})).doubleValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static String a(String str) {
        String str2 = (String) C0195.n(43185);
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
                    return str2;
                case 239:
                    boolean zBooleanValue = ((Boolean) C0151.n(14298, null, new Object[]{str, (String) C0149.n(74485, null, new Object[]{(short[]) C0151.n(99963), 7, Integer.valueOf(C0121.f330 ^ (-556)), 2498})})).booleanValue();
                    String str3 = (String) C0198.n(45548, null, new Object[]{(short[]) C0151.n(99963), 22, Integer.valueOf(C0123.f332 ^ (-159)), 734});
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
                                boolean zBooleanValue2 = ((Boolean) C0151.n(14298, null, new Object[]{str, str3})).booleanValue();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (zBooleanValue2) {
                                                i3 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean zBooleanValue3 = ((Boolean) C0151.n(14298, null, new Object[]{str, (String) C0162.n(24506, null, new Object[]{(short[]) C0151.n(99963), 31, Integer.valueOf(C0005.f161 ^ 654), 2933})})).booleanValue();
                                            str3 = (String) C0195.n(75793, null, new Object[]{(short[]) C0151.n(99963), 46, Integer.valueOf(C0121.f330 ^ (-560)), 2599});
                                            int i4 = 48891;
                                            while (true) {
                                                i4 ^= 48908;
                                                switch (i4) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 503:
                                                        if (!zBooleanValue3) {
                                                            i4 = 49635;
                                                        }
                                                        break;
                                                    case 32495:
                                                        boolean zBooleanValue4 = ((Boolean) C0151.n(14298, null, new Object[]{str, str3})).booleanValue();
                                                        int i5 = 49666;
                                                        while (true) {
                                                            i5 ^= 49683;
                                                            switch (i5) {
                                                                case 17:
                                                                    if (zBooleanValue4) {
                                                                        i5 = 49759;
                                                                    }
                                                                    break;
                                                                case 50:
                                                                    break;
                                                                case 76:
                                                                    int i6 = 49790;
                                                                    while (true) {
                                                                        i6 ^= 49807;
                                                                        switch (i6) {
                                                                            case 18:
                                                                                break;
                                                                            case 241:
                                                                                i6 = 49821;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    return str2;
                                                                default:
                                                                    continue;
                                                            }
                                                            i5 = 49728;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i4 = 48953;
                                            }
                                            break;
                                        case 47417:
                                            int i7 = 48767;
                                            while (true) {
                                                i7 ^= 48784;
                                                switch (i7) {
                                                    case 14:
                                                        break;
                                                    case 239:
                                                        i7 = 48798;
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
                    return str3;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static void b(Closeable closeable) throws Throwable {
        int iIntValue;
        int i;
        try {
            boolean z = closeable instanceof Closeable;
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = z ? 1709 : 1678;
                        break;
                    case 204:
                        C0151.n(4360, closeable, new Object[0]);
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
            }
            while (true) {
                i ^= 1757;
                switch (i) {
                    case 17:
                        if (iIntValue <= 0) {
                            i = 1833;
                        }
                        break;
                    case 54:
                        break;
                    case 471:
                        return;
                    case 500:
                        C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0151.n(88487, null, new Object[]{(String) C0151.n(9525)})})});
                        return;
                    default:
                        continue;
                }
                i = 1802;
            }
        } catch (Throwable th) {
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
        }
        iIntValue = ((Integer) C0151.n(27095, null, new Object[0])).intValue();
        i = 1740;
    }

    public static boolean c(String str, String str2) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = str != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0224.n(41581, str, new Object[]{str2})).booleanValue();
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
                                break;
                            case 500:
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = 48674;
                                            break;
                                        case 47483:
                                            return true;
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

    public static void d(File file) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (file != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    try {
                        boolean zBooleanValue = ((Boolean) C0216.n(15186, file, new Object[0])).booleanValue();
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
                                    break;
                                case 500:
                                    ((Boolean) C0221.n(60867, file, new Object[0])).booleanValue();
                                    break;
                                default:
                                    break;
                            }
                            return;
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
                                    return;
                            }
                        }
                    }
                    break;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static boolean e(File file) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (file != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0151.n(63049, file, new Object[0])).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zBooleanValue ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                boolean zBooleanValue2 = ((Boolean) C0151.n(46698, file, new Object[0])).booleanValue();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = zBooleanValue2 ? 48736 : 48705;
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
                                return true;
                            case 239:
                                i4 = 48798;
                                break;
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
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x00e9. Please report as an issue. */
    public static String f(File file) throws Throwable {
        FileInputStream fileInputStream;
        boolean zBooleanValue = ((Boolean) C0151.n(1675, file, new Object[0])).booleanValue();
        String str = (String) C0195.n(43185);
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
                    long jLongValue = ((Long) C0216.n(1820, file, new Object[0])).longValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (jLongValue >= 4096) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                long jLongValue2 = ((Long) C0216.n(1820, file, new Object[0])).longValue();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (jLongValue2 > 8388608) {
                                                i3 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            try {
                                                MessageDigest messageDigest = (MessageDigest) C0151.n(30057, null, new Object[]{(String) C0198.n(62249, null, new Object[]{(short[]) C0151.n(99963), 57, Integer.valueOf(C0052.f208 ^ (-120)), 2266})});
                                                FileInputStream fileInputStream2 = new FileInputStream(file);
                                                try {
                                                    byte[] bArr = new byte[8192];
                                                    while (true) {
                                                        int iIntValue = ((Integer) C0151.n(95224, fileInputStream2, new Object[]{bArr})).intValue();
                                                        int i4 = 48891;
                                                        while (true) {
                                                            i4 ^= 48908;
                                                            switch (i4) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i4 = iIntValue != -1 ? 49635 : 48953;
                                                                    break;
                                                                case 32495:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            str = (String) C0151.n(35535, null, new Object[]{(byte[]) C0151.n(85458, messageDigest, new Object[0])});
                                                            C0151.n(98881, null, new Object[]{fileInputStream2});
                                                            break;
                                                        }
                                                        C0151.n(8589, messageDigest, new Object[]{bArr, 0, Integer.valueOf(iIntValue)});
                                                        int i5 = 49666;
                                                        while (true) {
                                                            i5 ^= 49683;
                                                            switch (i5) {
                                                                case 17:
                                                                    i5 = 49697;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    int i6 = 49790;
                                                    while (true) {
                                                        i6 ^= 49807;
                                                        switch (i6) {
                                                            case 18:
                                                                fileInputStream = fileInputStream2;
                                                                C0151.n(98881, null, new Object[]{fileInputStream});
                                                                break;
                                                            case 241:
                                                                i6 = 49821;
                                                                break;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                int i7 = 49914;
                                                while (true) {
                                                    i7 ^= 49931;
                                                    switch (i7) {
                                                        case 497:
                                                            i7 = 50596;
                                                            break;
                                                        case 1711:
                                                            fileInputStream = null;
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 47417:
                                            int i8 = 48767;
                                            while (true) {
                                                i8 ^= 48784;
                                                switch (i8) {
                                                    case 14:
                                                        break;
                                                    case 239:
                                                        i8 = 48798;
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
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x004d. Please report as an issue. */
    public static String g(byte[] bArr) {
        int i = 0;
        char[] cArr = new char[bArr.length * (C0020.f176 ^ (-565))];
        char[] cArr2 = (char[]) C0181.n(6868, (String) C0224.n(58480, null, new Object[]{(short[]) C0151.n(99963), 60, Integer.valueOf(C0099.f308 ^ 808), 3123}), new Object[0]);
        while (true) {
            int length = bArr.length;
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = i < length ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                return new String(cArr);
            }
            byte b2 = bArr[i];
            int i3 = C0005.f161;
            int i4 = (C0060.f269 ^ (-964)) * i;
            cArr[i4] = cArr2[((i3 ^ 638) & b2) >>> (C0034.f190 ^ 128)];
            cArr[(C0121.f330 ^ (-550)) + i4] = cArr2[b2 & (C0144.f354 ^ (-598))];
            i += C0002.f158 ^ 516;
            int i5 = 1740;
            while (true) {
                i5 ^= 1757;
                switch (i5) {
                    case 17:
                        i5 = 1771;
                        break;
                    case 54:
                        break;
                }
            }
        }
    }

    public static void h(String str) throws Throwable {
        File file;
        synchronized (C0276m0.class) {
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = str != null ? 1709 : 1678;
                        break;
                    case 204:
                        int iIntValue = ((Integer) C0149.n(89092, str, new Object[0])).intValue();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = iIntValue == 0 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    try {
                                        File file2 = new File(str);
                                        File file3 = (File) C0151.n(22862, file2, new Object[0]);
                                        int i3 = 48767;
                                        while (true) {
                                            i3 ^= 48784;
                                            switch (i3) {
                                                case 14:
                                                    break;
                                                case 45:
                                                    String str2 = (String) C0221.n(72343, file2, new Object[0]);
                                                    boolean zBooleanValue = ((Boolean) C0179.n(30461, str2, new Object[]{(String) C0149.n(83930, null, new Object[]{(short[]) C0151.n(99963), 76, Integer.valueOf(C0084.f293 ^ (-385)), 1728})})).booleanValue();
                                                    int i4 = 49666;
                                                    while (true) {
                                                        i4 ^= 49683;
                                                        switch (i4) {
                                                            case 17:
                                                                i4 = !zBooleanValue ? 49759 : 49728;
                                                                break;
                                                            case 50:
                                                                break;
                                                            case 76:
                                                                int i5 = 49790;
                                                                while (true) {
                                                                    i5 ^= 49807;
                                                                    switch (i5) {
                                                                        case 18:
                                                                            file = null;
                                                                            break;
                                                                        case 241:
                                                                            i5 = 49821;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 83:
                                                                File file4 = (File) C0151.n(22862, file2, new Object[0]);
                                                                StringBuilder sb = new StringBuilder();
                                                                file = new File(file4, (String) C0198.n(89992, sb, new Object[0]));
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0151.n(71939, null, new Object[]{file});
                                                    boolean zBooleanValue2 = ((Boolean) C0182.n(55567, str, new Object[]{(String) C0151.n(19350)})).booleanValue();
                                                    int i6 = 49914;
                                                    while (true) {
                                                        i6 ^= 49931;
                                                        switch (i6) {
                                                            case 497:
                                                                i6 = zBooleanValue2 ? 50658 : 50627;
                                                                break;
                                                            case 1711:
                                                                break;
                                                            case 1736:
                                                                break;
                                                            case 1769:
                                                                b = null;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    return;
                                                case 76:
                                                    int iIntValue2 = ((Integer) C0191.n(74984, null, new Object[0])).intValue();
                                                    int i7 = 48891;
                                                    while (true) {
                                                        i7 ^= 48908;
                                                        switch (i7) {
                                                            case 22:
                                                                break;
                                                            case 53:
                                                                return;
                                                            case 503:
                                                                if (iIntValue2 >= 0) {
                                                                    i7 = 49635;
                                                                }
                                                                break;
                                                            case 32495:
                                                                C0195.n(19817, (PrintStream) C0195.n(72538), new Object[]{Integer.valueOf(((Integer) C0195.n(60398, null, new Object[]{(String) C0162.n(1185, null, new Object[]{(String) C0151.n(94259)})})).intValue())});
                                                                return;
                                                            default:
                                                                continue;
                                                        }
                                                        i7 = 48953;
                                                    }
                                                    break;
                                                case 239:
                                                    i3 = file3 == null ? 48860 : 48829;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        int i8 = 50689;
                                        while (true) {
                                            i8 ^= 50706;
                                            switch (i8) {
                                                case 19:
                                                    i8 = 50720;
                                                    continue;
                                                case 50:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                    }
                                    break;
                                case 500:
                                    int i9 = 1864;
                                    while (true) {
                                        i9 ^= 1881;
                                        switch (i9) {
                                            case 17:
                                                i9 = 48674;
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
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x00d5 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00e9 A[DONT_GENERATE, SYNTHETIC] */
    public static boolean i(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 1616;
        while (true) {
            i5 ^= 1633;
            switch (i5) {
                case 14:
                    break;
                case 49:
                    if (str != null) {
                        i5 = 1709;
                    }
                    break;
                case 204:
                    int iIntValue = ((Integer) C0149.n(89092, str, new Object[0])).intValue();
                    int i6 = 1740;
                    while (true) {
                        i6 ^= 1757;
                        switch (i6) {
                            case 17:
                                if (iIntValue != 32) {
                                    i6 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                int i7 = 0;
                                while (true) {
                                    int iIntValue2 = ((Integer) C0149.n(89092, str, new Object[0])).intValue();
                                    int i8 = 48767;
                                    while (true) {
                                        i8 ^= 48784;
                                        switch (i8) {
                                            case 14:
                                                break;
                                            case 45:
                                                return true;
                                            case 76:
                                                break;
                                            case 239:
                                                i8 = i7 < iIntValue2 ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    char cCharValue = ((Character) C0149.n(50218, str, new Object[]{Integer.valueOf(i7)})).charValue();
                                    int i9 = 48891;
                                    while (true) {
                                        i9 ^= 48908;
                                        switch (i9) {
                                            case 22:
                                                break;
                                            case 53:
                                                i2 = 49790;
                                                while (true) {
                                                    i2 ^= 49807;
                                                    switch (i2) {
                                                        case 18:
                                                            break;
                                                        case 51:
                                                            return false;
                                                        case 84:
                                                            i3 = 49914;
                                                            while (true) {
                                                                i3 ^= 49931;
                                                                switch (i3) {
                                                                    case 497:
                                                                        i3 = cCharValue > 'f' ? 50658 : 50627;
                                                                        break;
                                                                    case 1711:
                                                                        break;
                                                                    case 1736:
                                                                        break;
                                                                    case 1769:
                                                                        i4 = 50689;
                                                                        while (true) {
                                                                            i4 ^= 50706;
                                                                            switch (i4) {
                                                                                case 19:
                                                                                    i4 = 50720;
                                                                                    break;
                                                                                case 50:
                                                                                    return false;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 241:
                                                            i2 = cCharValue >= 'a' ? 49883 : 49852;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                int i10 = (C0077.f286 ^ (-403)) + i7;
                                                i = 50813;
                                                while (true) {
                                                    i ^= 50830;
                                                    switch (i) {
                                                        case 18:
                                                            break;
                                                        case 243:
                                                            i = 50844;
                                                            break;
                                                    }
                                                }
                                                i7 = i10;
                                                break;
                                            case 503:
                                                i9 = cCharValue >= '0' ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                int i11 = 49666;
                                                while (true) {
                                                    i11 ^= 49683;
                                                    switch (i11) {
                                                        case 17:
                                                            i11 = cCharValue > '9' ? 49759 : 49728;
                                                            break;
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            i2 = 49790;
                                                            while (true) {
                                                                i2 ^= 49807;
                                                                switch (i2) {
                                                                    case 18:
                                                                        break;
                                                                    case 51:
                                                                        return false;
                                                                    case 84:
                                                                        i3 = 49914;
                                                                        while (true) {
                                                                            i3 ^= 49931;
                                                                            switch (i3) {
                                                                                case 497:
                                                                                    if (cCharValue > 'f') {
                                                                                    }
                                                                                    break;
                                                                                case 1711:
                                                                                    break;
                                                                                case 1736:
                                                                                    break;
                                                                                case 1769:
                                                                                    i4 = 50689;
                                                                                    while (true) {
                                                                                        i4 ^= 50706;
                                                                                        switch (i4) {
                                                                                            case 19:
                                                                                                i4 = 50720;
                                                                                                break;
                                                                                            case 50:
                                                                                                return false;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 241:
                                                                        if (cCharValue >= 'a') {
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            int i12 = (C0077.f286 ^ (-403)) + i7;
                                                            i = 50813;
                                                            while (true) {
                                                                i ^= 50830;
                                                                switch (i) {
                                                                    case 18:
                                                                        break;
                                                                    case 243:
                                                                        i = 50844;
                                                                        break;
                                                                }
                                                            }
                                                            i7 = i12;
                                                            break;
                                                        case 83:
                                                            int i13 = (C0077.f286 ^ (-403)) + i7;
                                                            i = 50813;
                                                            while (true) {
                                                                i ^= 50830;
                                                                switch (i) {
                                                                    case 18:
                                                                        break;
                                                                    case 243:
                                                                        i = 50844;
                                                                        break;
                                                                }
                                                            }
                                                            i7 = i13;
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
                                }
                                break;
                            case 500:
                                int i14 = 1864;
                                while (true) {
                                    i14 ^= 1881;
                                    switch (i14) {
                                        case 17:
                                            i14 = 48674;
                                            break;
                                        case 47483:
                                            return false;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i6 = 1802;
                    }
                    break;
                case 239:
                    return false;
                default:
                    continue;
            }
            i5 = 1678;
        }
    }

    public static C0273l0 j(String str) {
        String str2 = (String) C0195.n(19148, null, new Object[]{(short[]) C0151.n(99963), 83, Integer.valueOf(C0136.f345 ^ 728), 1046});
        boolean zBooleanValue = ((Boolean) C0182.n(55567, str2, new Object[]{str})).booleanValue();
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
                    return new C0273l0(str2, (String) C0157.n(97123, null, new Object[]{(short[]) C0151.n(99963), 92, Integer.valueOf(C0084.f293 ^ (-406)), 1816}), (String) C0224.n(58480, null, new Object[]{(short[]) C0151.n(99963), 114, Integer.valueOf(C0099.f308 ^ 823), 2461}));
                case 239:
                    String str3 = (String) C0152.n(39710, null, new Object[]{(short[]) C0151.n(99963), 129, Integer.valueOf(C0020.f176 ^ (-574)), 2740});
                    boolean zBooleanValue2 = ((Boolean) C0182.n(55567, str3, new Object[]{str})).booleanValue();
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
                                return null;
                            case 500:
                                return new C0273l0(str3, (String) C0198.n(14698, null, new Object[]{(short[]) C0151.n(99963), 140, Integer.valueOf(C0040.f196 ^ (-347)), 336}), (String) C0149.n(34115, null, new Object[]{(short[]) C0151.n(99963), 162, Integer.valueOf(C0042.f198 ^ 52), 2922}));
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static void k(String str) throws Throwable {
        int iIntValue;
        int i;
        try {
            StringBuilder sb = new StringBuilder((String) C0162.n(59518, null, new Object[]{(short[]) C0151.n(99963), 177, Integer.valueOf(C0013.f169 ^ 656), 898}));
            C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb, new Object[0])});
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
                        C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Float) C0157.n(17336, null, new Object[]{(String) C0151.n(91707, null, new Object[]{(String) C0151.n(3671)})})});
                        return;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Throwable th) {
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
        }
        iIntValue = ((Integer) C0157.n(29544, null, new Object[0])).intValue();
        i = 1616;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0091. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00a8. Please report as an issue. */
    public static String l(String str) {
        int i;
        int i2;
        String str2 = (String) C0195.n(43185);
        int i3 = 1616;
        while (true) {
            i3 ^= 1633;
            switch (i3) {
                case 14:
                    break;
                case 49:
                    if (str == null) {
                        i3 = 1709;
                    }
                    break;
                case 204:
                    return str2;
                case 239:
                    StringBuilder sb = new StringBuilder(C0038.f194 ^ 255);
                    int i4 = 0;
                    while (true) {
                        int iIntValue = ((Integer) C0149.n(89092, str, new Object[0])).intValue();
                        int i5 = 1740;
                        while (true) {
                            i5 ^= 1757;
                            switch (i5) {
                                case 17:
                                    i5 = i4 < iIntValue ? 1833 : 1802;
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
                            String str3 = (String) C0198.n(89992, sb, new Object[0]);
                            boolean zBooleanValue = ((Boolean) C0151.n(7084, null, new Object[]{str3})).booleanValue();
                            int i6 = 50813;
                            while (true) {
                                i6 ^= 50830;
                                switch (i6) {
                                    case 18:
                                        break;
                                    case 53:
                                        str3 = str2;
                                        break;
                                    case 243:
                                        if (zBooleanValue) {
                                            i6 = 51557;
                                        }
                                        break;
                                    case 4075:
                                        break;
                                    default:
                                        continue;
                                }
                                i6 = 50875;
                            }
                            return str3;
                        }
                        char cCharValue = ((Character) C0149.n(50218, str, new Object[]{Integer.valueOf(i4)})).charValue();
                        int i7 = 1864;
                        while (true) {
                            i7 ^= 1881;
                            switch (i7) {
                                case 17:
                                    i7 = cCharValue >= 'A' ? 48736 : 48705;
                                    break;
                                case 47384:
                                    break;
                                case 47417:
                                    int i8 = 48767;
                                    while (true) {
                                        i8 ^= 48784;
                                        switch (i8) {
                                            case 14:
                                                break;
                                            case 45:
                                                break;
                                            case 76:
                                                cCharValue = (char) (cCharValue + (C0102.f311 ^ 519));
                                                break;
                                            case 239:
                                                i8 = cCharValue <= 'F' ? 48860 : 48829;
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
                        int i9 = 48891;
                        while (true) {
                            i9 ^= 48908;
                            switch (i9) {
                                case 22:
                                    break;
                                case 53:
                                    i = 49790;
                                    while (true) {
                                        i ^= 49807;
                                        switch (i) {
                                            case 18:
                                                break;
                                            case 51:
                                                break;
                                            case 84:
                                                i2 = 49914;
                                                while (true) {
                                                    i2 ^= 49931;
                                                    switch (i2) {
                                                        case 497:
                                                            i2 = cCharValue <= 'f' ? 50658 : 50627;
                                                            break;
                                                        case 1711:
                                                            break;
                                                        case 1736:
                                                            break;
                                                        case 1769:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 241:
                                                i = cCharValue >= 'a' ? 49883 : 49852;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 503:
                                    i9 = cCharValue >= '0' ? 49635 : 48953;
                                    break;
                                case 32495:
                                    int i10 = 49666;
                                    while (true) {
                                        i10 ^= 49683;
                                        switch (i10) {
                                            case 17:
                                                i10 = cCharValue > '9' ? 49759 : 49728;
                                                break;
                                            case 50:
                                                break;
                                            case 76:
                                                i = 49790;
                                                while (true) {
                                                    i ^= 49807;
                                                    switch (i) {
                                                        case 18:
                                                            break;
                                                        case 51:
                                                            break;
                                                        case 84:
                                                            i2 = 49914;
                                                            while (true) {
                                                                i2 ^= 49931;
                                                                switch (i2) {
                                                                    case 497:
                                                                        if (cCharValue <= 'f') {
                                                                        }
                                                                        break;
                                                                    case 1711:
                                                                        break;
                                                                    case 1736:
                                                                        break;
                                                                    case 1769:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 241:
                                                            if (cCharValue >= 'a') {
                                                            }
                                                            break;
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
                                    break;
                                default:
                                    break;
                            }
                            int i11 = (C0102.f311 ^ 550) + i4;
                            int i12 = 50689;
                            while (true) {
                                i12 ^= 50706;
                                switch (i12) {
                                    case 19:
                                        i12 = 50720;
                                        break;
                                    case 50:
                                        break;
                                }
                            }
                            i4 = i11;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i3 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:193:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x009a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00c4. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00db. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00f2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0109. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0120. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:71:0x0137. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:94:0x017a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x0197. Please report as an issue. */
    public static String m(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str2 = (String) C0162.n(29890, null, new Object[]{(short[]) C0151.n(99963), 192, Integer.valueOf(C0033.f189 ^ (-424)), 2811});
        int i9 = 1616;
        while (true) {
            i9 ^= 1633;
            switch (i9) {
                case 14:
                    break;
                case 49:
                    if (str != null) {
                        i9 = 1709;
                    }
                    break;
                case 204:
                    int iIntValue = ((Integer) C0149.n(89092, str, new Object[0])).intValue();
                    int i10 = 1740;
                    while (true) {
                        i10 ^= 1757;
                        switch (i10) {
                            case 17:
                                if (iIntValue == 0) {
                                    i10 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                StringBuilder sb = new StringBuilder(((Integer) C0149.n(89092, str, new Object[0])).intValue());
                                int i11 = 0;
                                while (true) {
                                    int iIntValue2 = ((Integer) C0149.n(89092, str, new Object[0])).intValue();
                                    int i12 = 48767;
                                    while (true) {
                                        i12 ^= 48784;
                                        switch (i12) {
                                            case 14:
                                                break;
                                            case 45:
                                                break;
                                            case 76:
                                                break;
                                            case 239:
                                                i12 = i11 < iIntValue2 ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                        int iIntValue3 = ((Integer) C0162.n(73207, sb, new Object[0])).intValue();
                                        int i13 = 53510;
                                        while (true) {
                                            i13 ^= 53527;
                                            switch (i13) {
                                                case 17:
                                                    if (iIntValue3 == 0) {
                                                        i13 = 53603;
                                                    }
                                                    break;
                                                case 50:
                                                    break;
                                                case 83:
                                                    return (String) C0198.n(89992, sb, new Object[0]);
                                                case 116:
                                                    int i14 = 53634;
                                                    while (true) {
                                                        i14 ^= 53651;
                                                        switch (i14) {
                                                            case 17:
                                                                i14 = 53665;
                                                                break;
                                                            case 50:
                                                                return str2;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i13 = 53572;
                                        }
                                    }
                                    char cCharValue = ((Character) C0149.n(50218, str, new Object[]{Integer.valueOf(i11)})).charValue();
                                    int i15 = 48891;
                                    while (true) {
                                        i15 ^= 48908;
                                        switch (i15) {
                                            case 22:
                                                break;
                                            case 53:
                                                i = 49790;
                                                while (true) {
                                                    i ^= 49807;
                                                    switch (i) {
                                                        case 18:
                                                            break;
                                                        case 51:
                                                            i2 = 50689;
                                                            while (true) {
                                                                i2 ^= 50706;
                                                                switch (i2) {
                                                                    case 19:
                                                                        i2 = cCharValue >= '0' ? 50782 : 50751;
                                                                        break;
                                                                    case 45:
                                                                        i3 = 51588;
                                                                        while (true) {
                                                                            i3 ^= 51605;
                                                                            switch (i3) {
                                                                                case 17:
                                                                                    i3 = cCharValue != '-' ? 51681 : 51650;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                case 87:
                                                                                    break;
                                                                                case 116:
                                                                                    i4 = 51712;
                                                                                    while (true) {
                                                                                        i4 ^= 51729;
                                                                                        switch (i4) {
                                                                                            case 14:
                                                                                                break;
                                                                                            case 17:
                                                                                                i4 = cCharValue == '_' ? 51805 : 51774;
                                                                                                break;
                                                                                            case 47:
                                                                                                i5 = 52611;
                                                                                                while (true) {
                                                                                                    i5 ^= 52628;
                                                                                                    switch (i5) {
                                                                                                        case 23:
                                                                                                            i5 = 52642;
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 76:
                                                                                                i6 = 51836;
                                                                                                while (true) {
                                                                                                    i6 ^= 51853;
                                                                                                    switch (i6) {
                                                                                                        case 241:
                                                                                                            i6 = 52518;
                                                                                                            break;
                                                                                                        case 1963:
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
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    case 76:
                                                                        i7 = 50813;
                                                                        while (true) {
                                                                            i7 ^= 50830;
                                                                            switch (i7) {
                                                                                case 18:
                                                                                    break;
                                                                                case 53:
                                                                                    break;
                                                                                case 243:
                                                                                    i7 = cCharValue > '9' ? 51557 : 50875;
                                                                                    break;
                                                                                case 4075:
                                                                                    i3 = 51588;
                                                                                    while (true) {
                                                                                        i3 ^= 51605;
                                                                                        switch (i3) {
                                                                                            case 17:
                                                                                                if (cCharValue != '-') {
                                                                                                }
                                                                                                break;
                                                                                            case 54:
                                                                                                break;
                                                                                            case 87:
                                                                                                break;
                                                                                            case 116:
                                                                                                i4 = 51712;
                                                                                                while (true) {
                                                                                                    i4 ^= 51729;
                                                                                                    switch (i4) {
                                                                                                        case 14:
                                                                                                            break;
                                                                                                        case 17:
                                                                                                            if (cCharValue == '_') {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 47:
                                                                                                            i5 = 52611;
                                                                                                            while (true) {
                                                                                                                i5 ^= 52628;
                                                                                                                switch (i5) {
                                                                                                                    case 23:
                                                                                                                        i5 = 52642;
                                                                                                                        break;
                                                                                                                    case 54:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 76:
                                                                                                            i6 = 51836;
                                                                                                            while (true) {
                                                                                                                i6 ^= 51853;
                                                                                                                switch (i6) {
                                                                                                                    case 241:
                                                                                                                        i6 = 52518;
                                                                                                                        break;
                                                                                                                    case 1963:
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
                                                        case 84:
                                                            i8 = 49914;
                                                            while (true) {
                                                                i8 ^= 49931;
                                                                switch (i8) {
                                                                    case 497:
                                                                        i8 = cCharValue > 'Z' ? 50658 : 50627;
                                                                        break;
                                                                    case 1711:
                                                                        break;
                                                                    case 1736:
                                                                        break;
                                                                    case 1769:
                                                                        i2 = 50689;
                                                                        while (true) {
                                                                            i2 ^= 50706;
                                                                            switch (i2) {
                                                                                case 19:
                                                                                    if (cCharValue >= '0') {
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    i3 = 51588;
                                                                                    while (true) {
                                                                                        i3 ^= 51605;
                                                                                        switch (i3) {
                                                                                            case 17:
                                                                                                if (cCharValue != '-') {
                                                                                                }
                                                                                                break;
                                                                                            case 54:
                                                                                                break;
                                                                                            case 87:
                                                                                                break;
                                                                                            case 116:
                                                                                                i4 = 51712;
                                                                                                while (true) {
                                                                                                    i4 ^= 51729;
                                                                                                    switch (i4) {
                                                                                                        case 14:
                                                                                                            break;
                                                                                                        case 17:
                                                                                                            if (cCharValue == '_') {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 47:
                                                                                                            i5 = 52611;
                                                                                                            while (true) {
                                                                                                                i5 ^= 52628;
                                                                                                                switch (i5) {
                                                                                                                    case 23:
                                                                                                                        i5 = 52642;
                                                                                                                        break;
                                                                                                                    case 54:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 76:
                                                                                                            i6 = 51836;
                                                                                                            while (true) {
                                                                                                                i6 ^= 51853;
                                                                                                                switch (i6) {
                                                                                                                    case 241:
                                                                                                                        i6 = 52518;
                                                                                                                        break;
                                                                                                                    case 1963:
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
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 50:
                                                                                    break;
                                                                                case 76:
                                                                                    i7 = 50813;
                                                                                    while (true) {
                                                                                        i7 ^= 50830;
                                                                                        switch (i7) {
                                                                                            case 18:
                                                                                                break;
                                                                                            case 53:
                                                                                                break;
                                                                                            case 243:
                                                                                                if (cCharValue > '9') {
                                                                                                }
                                                                                                break;
                                                                                            case 4075:
                                                                                                i3 = 51588;
                                                                                                while (true) {
                                                                                                    i3 ^= 51605;
                                                                                                    switch (i3) {
                                                                                                        case 17:
                                                                                                            if (cCharValue != '-') {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                        case 87:
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            i4 = 51712;
                                                                                                            while (true) {
                                                                                                                i4 ^= 51729;
                                                                                                                switch (i4) {
                                                                                                                    case 14:
                                                                                                                        break;
                                                                                                                    case 17:
                                                                                                                        if (cCharValue == '_') {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 47:
                                                                                                                        i5 = 52611;
                                                                                                                        while (true) {
                                                                                                                            i5 ^= 52628;
                                                                                                                            switch (i5) {
                                                                                                                                case 23:
                                                                                                                                    i5 = 52642;
                                                                                                                                    break;
                                                                                                                                case 54:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 76:
                                                                                                                        i6 = 51836;
                                                                                                                        while (true) {
                                                                                                                            i6 ^= 51853;
                                                                                                                            switch (i6) {
                                                                                                                                case 241:
                                                                                                                                    i6 = 52518;
                                                                                                                                    break;
                                                                                                                                case 1963:
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
                                                        case 241:
                                                            i = cCharValue >= 'A' ? 49883 : 49852;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 503:
                                                i15 = cCharValue >= 'a' ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                int i16 = 49666;
                                                while (true) {
                                                    i16 ^= 49683;
                                                    switch (i16) {
                                                        case 17:
                                                            i16 = cCharValue > 'z' ? 49759 : 49728;
                                                            break;
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            i = 49790;
                                                            while (true) {
                                                                i ^= 49807;
                                                                switch (i) {
                                                                    case 18:
                                                                        break;
                                                                    case 51:
                                                                        i2 = 50689;
                                                                        while (true) {
                                                                            i2 ^= 50706;
                                                                            switch (i2) {
                                                                                case 19:
                                                                                    if (cCharValue >= '0') {
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    i3 = 51588;
                                                                                    while (true) {
                                                                                        i3 ^= 51605;
                                                                                        switch (i3) {
                                                                                            case 17:
                                                                                                if (cCharValue != '-') {
                                                                                                }
                                                                                                break;
                                                                                            case 54:
                                                                                                break;
                                                                                            case 87:
                                                                                                break;
                                                                                            case 116:
                                                                                                i4 = 51712;
                                                                                                while (true) {
                                                                                                    i4 ^= 51729;
                                                                                                    switch (i4) {
                                                                                                        case 14:
                                                                                                            break;
                                                                                                        case 17:
                                                                                                            if (cCharValue == '_') {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 47:
                                                                                                            i5 = 52611;
                                                                                                            while (true) {
                                                                                                                i5 ^= 52628;
                                                                                                                switch (i5) {
                                                                                                                    case 23:
                                                                                                                        i5 = 52642;
                                                                                                                        break;
                                                                                                                    case 54:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 76:
                                                                                                            i6 = 51836;
                                                                                                            while (true) {
                                                                                                                i6 ^= 51853;
                                                                                                                switch (i6) {
                                                                                                                    case 241:
                                                                                                                        i6 = 52518;
                                                                                                                        break;
                                                                                                                    case 1963:
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
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 50:
                                                                                    break;
                                                                                case 76:
                                                                                    i7 = 50813;
                                                                                    while (true) {
                                                                                        i7 ^= 50830;
                                                                                        switch (i7) {
                                                                                            case 18:
                                                                                                break;
                                                                                            case 53:
                                                                                                break;
                                                                                            case 243:
                                                                                                if (cCharValue > '9') {
                                                                                                }
                                                                                                break;
                                                                                            case 4075:
                                                                                                i3 = 51588;
                                                                                                while (true) {
                                                                                                    i3 ^= 51605;
                                                                                                    switch (i3) {
                                                                                                        case 17:
                                                                                                            if (cCharValue != '-') {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                        case 87:
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            i4 = 51712;
                                                                                                            while (true) {
                                                                                                                i4 ^= 51729;
                                                                                                                switch (i4) {
                                                                                                                    case 14:
                                                                                                                        break;
                                                                                                                    case 17:
                                                                                                                        if (cCharValue == '_') {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 47:
                                                                                                                        i5 = 52611;
                                                                                                                        while (true) {
                                                                                                                            i5 ^= 52628;
                                                                                                                            switch (i5) {
                                                                                                                                case 23:
                                                                                                                                    i5 = 52642;
                                                                                                                                    break;
                                                                                                                                case 54:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 76:
                                                                                                                        i6 = 51836;
                                                                                                                        while (true) {
                                                                                                                            i6 ^= 51853;
                                                                                                                            switch (i6) {
                                                                                                                                case 241:
                                                                                                                                    i6 = 52518;
                                                                                                                                    break;
                                                                                                                                case 1963:
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
                                                                    case 84:
                                                                        i8 = 49914;
                                                                        while (true) {
                                                                            i8 ^= 49931;
                                                                            switch (i8) {
                                                                                case 497:
                                                                                    if (cCharValue > 'Z') {
                                                                                    }
                                                                                    break;
                                                                                case 1711:
                                                                                    break;
                                                                                case 1736:
                                                                                    break;
                                                                                case 1769:
                                                                                    i2 = 50689;
                                                                                    while (true) {
                                                                                        i2 ^= 50706;
                                                                                        switch (i2) {
                                                                                            case 19:
                                                                                                if (cCharValue >= '0') {
                                                                                                }
                                                                                                break;
                                                                                            case 45:
                                                                                                i3 = 51588;
                                                                                                while (true) {
                                                                                                    i3 ^= 51605;
                                                                                                    switch (i3) {
                                                                                                        case 17:
                                                                                                            if (cCharValue != '-') {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                        case 87:
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            i4 = 51712;
                                                                                                            while (true) {
                                                                                                                i4 ^= 51729;
                                                                                                                switch (i4) {
                                                                                                                    case 14:
                                                                                                                        break;
                                                                                                                    case 17:
                                                                                                                        if (cCharValue == '_') {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 47:
                                                                                                                        i5 = 52611;
                                                                                                                        while (true) {
                                                                                                                            i5 ^= 52628;
                                                                                                                            switch (i5) {
                                                                                                                                case 23:
                                                                                                                                    i5 = 52642;
                                                                                                                                    break;
                                                                                                                                case 54:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 76:
                                                                                                                        i6 = 51836;
                                                                                                                        while (true) {
                                                                                                                            i6 ^= 51853;
                                                                                                                            switch (i6) {
                                                                                                                                case 241:
                                                                                                                                    i6 = 52518;
                                                                                                                                    break;
                                                                                                                                case 1963:
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
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 50:
                                                                                                break;
                                                                                            case 76:
                                                                                                i7 = 50813;
                                                                                                while (true) {
                                                                                                    i7 ^= 50830;
                                                                                                    switch (i7) {
                                                                                                        case 18:
                                                                                                            break;
                                                                                                        case 53:
                                                                                                            break;
                                                                                                        case 243:
                                                                                                            if (cCharValue > '9') {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 4075:
                                                                                                            i3 = 51588;
                                                                                                            while (true) {
                                                                                                                i3 ^= 51605;
                                                                                                                switch (i3) {
                                                                                                                    case 17:
                                                                                                                        if (cCharValue != '-') {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 54:
                                                                                                                        break;
                                                                                                                    case 87:
                                                                                                                        break;
                                                                                                                    case 116:
                                                                                                                        i4 = 51712;
                                                                                                                        while (true) {
                                                                                                                            i4 ^= 51729;
                                                                                                                            switch (i4) {
                                                                                                                                case 14:
                                                                                                                                    break;
                                                                                                                                case 17:
                                                                                                                                    if (cCharValue == '_') {
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 47:
                                                                                                                                    i5 = 52611;
                                                                                                                                    while (true) {
                                                                                                                                        i5 ^= 52628;
                                                                                                                                        switch (i5) {
                                                                                                                                            case 23:
                                                                                                                                                i5 = 52642;
                                                                                                                                                break;
                                                                                                                                            case 54:
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 76:
                                                                                                                                    i6 = 51836;
                                                                                                                                    while (true) {
                                                                                                                                        i6 ^= 51853;
                                                                                                                                        switch (i6) {
                                                                                                                                            case 241:
                                                                                                                                                i6 = 52518;
                                                                                                                                                break;
                                                                                                                                            case 1963:
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
                                                                    case 241:
                                                                        if (cCharValue >= 'A') {
                                                                        }
                                                                        break;
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
                                                break;
                                            default:
                                                break;
                                        }
                                        int i17 = (C0048.f204 ^ 853) + i11;
                                        int i18 = 52735;
                                        while (true) {
                                            i18 ^= 52752;
                                            switch (i18) {
                                                case 14:
                                                    break;
                                                case 1007:
                                                    i18 = 52766;
                                                    break;
                                            }
                                        }
                                        i11 = i17;
                                    }
                                }
                                break;
                            case 500:
                                int i19 = 1864;
                                while (true) {
                                    i19 ^= 1881;
                                    switch (i19) {
                                        case 17:
                                            i19 = 48674;
                                            break;
                                        case 47483:
                                            return str2;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i10 = 1802;
                    }
                    break;
                case 239:
                    return str2;
                default:
                    continue;
            }
            i9 = 1678;
        }
    }

    public static InputStream n(ClassLoader classLoader, String str) {
        String str2 = (String) C0224.n(99346, null, new Object[]{(short[]) C0151.n(99963), 199, 1, 557});
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = classLoader != null ? 1709 : 1678;
                    break;
                case 204:
                    try {
                        InputStream inputStream = (InputStream) C0151.n(1255, classLoader, new Object[]{str});
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = inputStream != null ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    return inputStream;
                                default:
                                    break;
                            }
                        }
                    } catch (Throwable th) {
                        int i3 = 48891;
                        while (true) {
                            i3 ^= 48908;
                            switch (i3) {
                                case 22:
                                    break;
                                case 503:
                                    i3 = 48922;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        try {
            boolean zBooleanValue = ((Boolean) C0149.n(48208, str, new Object[]{str2})).booleanValue();
            int i4 = 1864;
            while (true) {
                i4 ^= 1881;
                switch (i4) {
                    case 17:
                        if (zBooleanValue) {
                            i4 = 48736;
                        }
                        break;
                    case 47384:
                        str = (String) C0198.n(26710, str2, new Object[]{str});
                        break;
                    case 47417:
                        int i5 = 48767;
                        while (true) {
                            i5 ^= 48784;
                            switch (i5) {
                                case 14:
                                    break;
                                case 239:
                                    i5 = 48798;
                                    break;
                            }
                        }
                        break;
                    case 47483:
                        break;
                    default:
                        continue;
                }
                i4 = 48705;
            }
            return C0276m0.class.getResourceAsStream(str);
        } catch (Throwable th2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Application, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object[]] */
    public static String o(Application application) {
        String str = (String) C0157.n(78385, null, new Object[]{(short[]) C0151.n(99963), 200, Integer.valueOf(C0060.f269 ^ (-978)), 1878});
        synchronized (C0276m0.class) {
            Context context = (Context) C0151.n(74999, application, new Object[0]);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = context != null ? 1709 : 1678;
                        break;
                    case 204:
                        application = context;
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
            }
            try {
                C0273l0 c0273l0 = (C0273l0) C0151.n(10026, null, new Object[]{(String) C0151.n(22884, null, new Object[]{(String) C0151.n(19350)})});
                int i2 = 1740;
                while (true) {
                    i2 ^= 1757;
                    switch (i2) {
                        case 17:
                            i2 = c0273l0 == null ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case 500:
                            c0273l0 = (C0273l0) C0151.n(59311, null, new Object[]{application});
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
                int i4 = 48891;
                while (true) {
                    i4 ^= 48908;
                    switch (i4) {
                        case 22:
                            break;
                        case 53:
                            return (String) C0225.n(23382, null, new Object[]{application, c0273l0});
                        case 503:
                            i4 = c0273l0 == null ? 49635 : 48953;
                            break;
                        case 32495:
                            return null;
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                int i5 = 48767;
                while (true) {
                    i5 ^= 48784;
                    switch (i5) {
                        case 14:
                            StringBuilder sb = new StringBuilder(str);
                            C0225.n(23404, null, new Object[]{(String) C0198.n(89992, sb, new Object[0])});
                            return null;
                        case 239:
                            i5 = 48798;
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.app.Application, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object[]] */
    public static String p(Application application, String str) {
        String str2;
        String str3;
        String str4 = (String) C0149.n(63176, null, new Object[]{(short[]) C0151.n(99963), 218, Integer.valueOf(C0020.f176 ^ (-549)), 957});
        String str5 = (String) C0198.n(88124, null, new Object[]{(short[]) C0151.n(99963), 236, Integer.valueOf(C0035.f191 ^ 311), 2177});
        synchronized (C0276m0.class) {
            try {
                Context context = (Context) C0151.n(74999, application, new Object[0]);
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            i = context != null ? 1709 : 1678;
                            break;
                        case 204:
                            application = context;
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
                String str6 = (String) C0151.n(22884, null, new Object[]{str});
                int iIntValue = ((Integer) C0149.n(89092, str6, new Object[0])).intValue();
                int i2 = 1740;
                while (true) {
                    i2 ^= 1757;
                    switch (i2) {
                        case 17:
                            i2 = iIntValue == 0 ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            str2 = str6;
                            break;
                        case 500:
                            C0273l0 c0273l0 = (C0273l0) C0151.n(59311, null, new Object[]{application});
                            int i3 = 1864;
                            while (true) {
                                i3 ^= 1881;
                                switch (i3) {
                                    case 17:
                                        i3 = c0273l0 == null ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        String str7 = (String) C0225.n(40368, c0273l0);
                                        int i4 = 48767;
                                        while (true) {
                                            i4 ^= 48784;
                                            switch (i4) {
                                                case 14:
                                                    str2 = str7;
                                                    break;
                                                case 239:
                                                    i4 = 48798;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 47417:
                                        return null;
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
                String str8 = (String) C0198.n(30759, null, new Object[]{(short[]) C0151.n(99963), 247, Integer.valueOf(C0123.f332 ^ (-159)), 1751});
                boolean zBooleanValue = ((Boolean) C0182.n(55567, str8, new Object[]{str2})).booleanValue();
                String str9 = (String) C0195.n(99405, null, new Object[]{(short[]) C0151.n(99963), 256, Integer.valueOf(C0080.f289 ^ 240), 2083});
                int i5 = 49666;
                while (true) {
                    i5 ^= 49683;
                    switch (i5) {
                        case 17:
                            i5 = zBooleanValue ? 49759 : 49728;
                            break;
                        case 50:
                            break;
                        case 76:
                            int i6 = 49790;
                            while (true) {
                                i6 ^= 49807;
                                switch (i6) {
                                    case 18:
                                        str3 = str9;
                                        break;
                                    case 241:
                                        i6 = 49821;
                                        continue;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 83:
                            boolean zBooleanValue2 = ((Boolean) C0182.n(55567, str9, new Object[]{str2})).booleanValue();
                            int i7 = 49914;
                            while (true) {
                                i7 ^= 49931;
                                switch (i7) {
                                    case 497:
                                        i7 = zBooleanValue2 ? 50658 : 50627;
                                        break;
                                    case 1711:
                                        break;
                                    case 1736:
                                        str3 = (String) C0195.n(43185);
                                        break;
                                    case 1769:
                                        int i8 = 50689;
                                        while (true) {
                                            i8 ^= 50706;
                                            switch (i8) {
                                                case 19:
                                                    i8 = 50720;
                                                    continue;
                                                case 50:
                                                    str3 = str8;
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
                C0273l0 c0273l1 = (C0273l0) C0151.n(10026, null, new Object[]{str3});
                int i9 = 50813;
                while (true) {
                    i9 ^= 50830;
                    switch (i9) {
                        case 18:
                            break;
                        case 53:
                            try {
                                C0225.n(23404, null, new Object[]{(String) C0198.n(26710, str5, new Object[]{str3})});
                                return (String) C0225.n(23382, null, new Object[]{application, c0273l1});
                            } catch (Throwable th) {
                                StringBuilder sb = new StringBuilder(str4);
                                C0225.n(23404, null, new Object[]{(String) C0198.n(89992, sb, new Object[0])});
                                return null;
                            }
                        case 243:
                            i9 = c0273l1 == null ? 51557 : 50875;
                            break;
                        case 4075:
                            return null;
                        default:
                            break;
                    }
                }
            } catch (Throwable th2) {
                int i10 = 48891;
                while (true) {
                    i10 ^= 48908;
                    switch (i10) {
                        case 22:
                            throw th2;
                        case 503:
                            i10 = 48922;
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0fda */
    /* JADX WARN: Code duplicated, block: B:702:0x0fc3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x0ffc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x1002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:705:0x1026 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x0ffe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x0fc3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:709:0x0fbb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x1015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x1026 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:0x100d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:0x0c0d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:0x0cec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:764:0x0c05 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:0x0ce8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:767:0x0dbe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:0x0ce0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:771:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:772:0x0dd7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:774:0x0dcf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:833:0x0e60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:834:0x0e9e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:835:0x0e5f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:839:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:840:0x0e9a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:842:0x0e92 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x00db, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x00db, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:240:0x0ac9. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String q(android.content.Context r19, com.github.catvod.spider.merge.A.C0273l0 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A.C0276m0.q(android.content.Context, com.github.catvod.spider.merge.A.l0):java.lang.String");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0094. Please report as an issue. */
    public static String r(File file) throws Throwable {
        FileInputStream fileInputStream;
        boolean zBooleanValue = ((Boolean) C0151.n(1675, file, new Object[0])).booleanValue();
        String str = (String) C0195.n(43185);
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
                    long jLongValue = ((Long) C0216.n(1820, file, new Object[0])).longValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (jLongValue > 128) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(file);
                                    try {
                                        byte[] bArr = new byte[(int) ((Long) C0216.n(1820, file, new Object[0])).longValue()];
                                        int iIntValue = ((Integer) C0151.n(95224, fileInputStream2, new Object[]{bArr})).intValue();
                                        int i3 = 48767;
                                        while (true) {
                                            i3 ^= 48784;
                                            switch (i3) {
                                                case 14:
                                                    break;
                                                case 45:
                                                    str = (String) C0225.n(5973, null, new Object[]{new String(bArr, 0, iIntValue, (String) C0224.n(31189, null, new Object[]{(short[]) C0151.n(99963), 446, Integer.valueOf(C0060.f269 ^ (-965)), 2289}))});
                                                    C0151.n(98881, null, new Object[]{fileInputStream2});
                                                    break;
                                                case 76:
                                                    C0151.n(98881, null, new Object[]{fileInputStream2});
                                                    break;
                                                case 239:
                                                    i3 = iIntValue <= 0 ? 48860 : 48829;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        fileInputStream = fileInputStream2;
                                        C0151.n(98881, null, new Object[]{fileInputStream});
                                        break;
                                    }
                                } catch (Throwable th2) {
                                    int i4 = 48891;
                                    while (true) {
                                        i4 ^= 48908;
                                        switch (i4) {
                                            case 22:
                                                fileInputStream = null;
                                                break;
                                            case 503:
                                                i4 = 48922;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                }
                                break;
                            case 500:
                                int i5 = 1864;
                                while (true) {
                                    i5 ^= 1881;
                                    switch (i5) {
                                        case 17:
                                            i5 = 48674;
                                            break;
                                        case 47483:
                                            break;
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
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.app.Application, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object[]] */
    public static String s(Application application, String str) {
        String str2 = (String) C0149.n(36390, null, new Object[]{(short[]) C0151.n(99963), 451, Integer.valueOf(C0066.f275 ^ 444), 1306});
        synchronized (C0276m0.class) {
            Context context = (Context) C0151.n(74999, application, new Object[0]);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = context != null ? 1709 : 1678;
                        break;
                    case 204:
                        application = context;
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
            }
            try {
                C0273l0 c0273l0 = (C0273l0) C0151.n(10026, null, new Object[]{(String) C0151.n(22884, null, new Object[]{str})});
                int i2 = 1740;
                while (true) {
                    i2 ^= 1757;
                    switch (i2) {
                        case 17:
                            i2 = c0273l0 == null ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case 500:
                            c0273l0 = (C0273l0) C0151.n(59311, null, new Object[]{application});
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
                int i4 = 48891;
                while (true) {
                    i4 ^= 48908;
                    switch (i4) {
                        case 22:
                            break;
                        case 53:
                            C0195.n(20253, null, new Object[]{str});
                            return (String) C0225.n(23382, null, new Object[]{application, c0273l0});
                        case 503:
                            i4 = c0273l0 == null ? 49635 : 48953;
                            break;
                        case 32495:
                            return null;
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                int i5 = 48767;
                while (true) {
                    i5 ^= 48784;
                    switch (i5) {
                        case 14:
                            StringBuilder sb = new StringBuilder(str2);
                            C0225.n(23404, null, new Object[]{(String) C0198.n(89992, sb, new Object[0])});
                            return null;
                        case 239:
                            i5 = 48798;
                            continue;
                        default:
                            continue;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:340:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x036a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x037f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x037b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x037a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:375:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:380:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0470 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x03da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0437 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x0406 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x040a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x03ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x0406 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0402 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x042d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x042f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x0425 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0442 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x043a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x045a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x0452 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0479 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x04b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x054f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x04b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x04de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x04e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:0x04e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x04e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x02b2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:90:0x030a. Please report as an issue. */
    public static C0273l0 t(Context context) {
        Boolean bool;
        int i;
        String str;
        boolean zBooleanValue;
        int i2;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        int i3;
        int iIntValue;
        int i4;
        String[] strArr;
        int i5;
        int length;
        int i6;
        int i7;
        boolean zBooleanValue4;
        int i8;
        int i9;
        String[] strArr2;
        int i10;
        int length2;
        int i11;
        int i12;
        boolean zBooleanValue5;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String str2 = (String) C0195.n(99405, null, new Object[]{(short[]) C0151.n(99963), 468, Integer.valueOf(C0015.f171 ^ (-929)), 2283});
        try {
            int iIntValue2 = ((Integer) C0225.n(57008)).intValue();
            int i19 = 1616;
            while (true) {
                i19 ^= 1633;
                switch (i19) {
                    case 14:
                        break;
                    case 49:
                        i19 = iIntValue2 >= 23 ? 1709 : 1678;
                        break;
                    case 204:
                        zBooleanValue2 = ((Boolean) C0225.n(3191, null, new Object[0])).booleanValue();
                        int i20 = 1740;
                        while (true) {
                            i20 ^= 1757;
                            switch (i20) {
                                case 17:
                                    i20 = 1771;
                                    continue;
                                case 54:
                                    break;
                                default:
                                    continue;
                            }
                        }
                        break;
                    case 239:
                        try {
                            Class<?> cls = Class.forName((String) C0181.n(53852, null, new Object[]{(short[]) C0151.n(99963), 477, Integer.valueOf(C0031.f187 ^ (-631)), 2769}));
                            Object objN = C0149.n(96179, cls.getMethod((String) C0224.n(30768, null, new Object[]{(short[]) C0151.n(99963), 510, Integer.valueOf(C0071.f280 ^ 40), 1536}), null), new Object[]{C0149.n(96179, cls.getMethod((String) C0162.n(24506, null, new Object[]{(short[]) C0151.n(99963), 500, Integer.valueOf(C0086.f295 ^ (-345)), 2892}), null), new Object[]{null, null}), null});
                            boolean z = objN instanceof Boolean;
                            int i21 = 1864;
                            while (true) {
                                i21 ^= 1881;
                                switch (i21) {
                                    case 17:
                                        i21 = z ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        bool = null;
                                        break;
                                    case 47417:
                                        bool = (Boolean) objN;
                                        int i22 = 48767;
                                        while (true) {
                                            i22 ^= 48784;
                                            switch (i22) {
                                                case 14:
                                                    break;
                                                case 239:
                                                    i22 = 48798;
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
                            while (true) {
                                i ^= 48908;
                                switch (i) {
                                    case 22:
                                        break;
                                    case 53:
                                        try {
                                            String str3 = (String) C0225.n(22438, (ApplicationInfo) C0225.n(35678, context, new Object[0]));
                                            int i23 = 49790;
                                            while (true) {
                                                i23 ^= 49807;
                                                switch (i23) {
                                                    case 18:
                                                        str = str3;
                                                        break;
                                                    case 241:
                                                        i23 = 49821;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                                int iIntValue3 = ((Integer) C0149.n(89092, str, new Object[0])).intValue();
                                                String str4 = (String) C0162.n(89013, null, new Object[]{(short[]) C0151.n(99963), 517, Integer.valueOf(C0141.f351 ^ (-780)), 802});
                                                int i24 = 49914;
                                                while (true) {
                                                    i24 ^= 49931;
                                                    switch (i24) {
                                                        case 497:
                                                            i24 = iIntValue3 > 0 ? 50658 : 50627;
                                                            break;
                                                        case 1711:
                                                            break;
                                                        case 1736:
                                                            try {
                                                                iIntValue = ((Integer) C0225.n(57008)).intValue();
                                                                i4 = 52611;
                                                                while (true) {
                                                                    i4 ^= 52628;
                                                                    switch (i4) {
                                                                        case 23:
                                                                            i4 = iIntValue >= 21 ? 52704 : 52673;
                                                                            break;
                                                                        case 54:
                                                                            break;
                                                                        case 85:
                                                                            zBooleanValue = ((Boolean) C0151.n(14298, null, new Object[]{(String) C0225.n(90538), str4})).booleanValue();
                                                                            i2 = 1507627;
                                                                            while (true) {
                                                                                i2 ^= 1507644;
                                                                                switch (i2) {
                                                                                    case 23:
                                                                                        i2 = !zBooleanValue ? 1507720 : 1507689;
                                                                                        break;
                                                                                    case 85:
                                                                                        zBooleanValue2 = true;
                                                                                        break;
                                                                                    case 118:
                                                                                        break;
                                                                                    case 180:
                                                                                        zBooleanValue3 = ((Boolean) C0151.n(14298, null, new Object[]{(String) C0225.n(72707), str4})).booleanValue();
                                                                                        i3 = 1507751;
                                                                                        while (true) {
                                                                                            i3 ^= 1507768;
                                                                                            switch (i3) {
                                                                                                case 31:
                                                                                                    i3 = zBooleanValue3 ? 1508495 : 1508464;
                                                                                                    break;
                                                                                                case 1335:
                                                                                                    zBooleanValue2 = true;
                                                                                                    break;
                                                                                                case 1480:
                                                                                                    i18 = 51836;
                                                                                                    while (true) {
                                                                                                        i18 ^= 51853;
                                                                                                        switch (i18) {
                                                                                                            case 241:
                                                                                                                i18 = 52518;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            case 1963:
                                                                                                                zBooleanValue2 = false;
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
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
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 116:
                                                                            strArr = (String[]) C0225.n(41341, null, new Object[0]);
                                                                            i5 = 52735;
                                                                            while (true) {
                                                                                i5 ^= 52752;
                                                                                switch (i5) {
                                                                                    case 14:
                                                                                        break;
                                                                                    case 45:
                                                                                        length = strArr.length;
                                                                                        i6 = 0;
                                                                                        while (true) {
                                                                                            i7 = 53634;
                                                                                            while (true) {
                                                                                                i7 ^= 53651;
                                                                                                switch (i7) {
                                                                                                    case 17:
                                                                                                        i7 = i6 < length ? 53727 : 53696;
                                                                                                        break;
                                                                                                    case 50:
                                                                                                        break;
                                                                                                    case 76:
                                                                                                        zBooleanValue4 = ((Boolean) C0151.n(14298, null, new Object[]{strArr[i6], str2})).booleanValue();
                                                                                                        i8 = 53758;
                                                                                                        while (true) {
                                                                                                            i8 ^= 53775;
                                                                                                            switch (i8) {
                                                                                                                case 1009:
                                                                                                                    i8 = zBooleanValue4 ? 54502 : 54471;
                                                                                                                    break;
                                                                                                                case 1703:
                                                                                                                    break;
                                                                                                                case 1736:
                                                                                                                    int i25 = (i6 - 13) + 1 + 13;
                                                                                                                    i9 = 1507503;
                                                                                                                    while (true) {
                                                                                                                        i9 ^= 1507520;
                                                                                                                        switch (i9) {
                                                                                                                            case 14:
                                                                                                                                break;
                                                                                                                            case 111:
                                                                                                                                i9 = 1507534;
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i6 = i25;
                                                                                                                    break;
                                                                                                                case 1769:
                                                                                                                    strArr2 = (String[]) C0225.n(32025, null, new Object[0]);
                                                                                                                    i10 = 54533;
                                                                                                                    while (true) {
                                                                                                                        i10 ^= 54550;
                                                                                                                        switch (i10) {
                                                                                                                            case 19:
                                                                                                                                i10 = strArr2 == null ? 54626 : 54595;
                                                                                                                                break;
                                                                                                                            case 50:
                                                                                                                                break;
                                                                                                                            case 85:
                                                                                                                                length2 = strArr2.length;
                                                                                                                                i11 = 0;
                                                                                                                                while (true) {
                                                                                                                                    i12 = 55432;
                                                                                                                                    while (true) {
                                                                                                                                        i12 ^= 55449;
                                                                                                                                        switch (i12) {
                                                                                                                                            case 17:
                                                                                                                                                i12 = i11 < length2 ? 55525 : 55494;
                                                                                                                                                break;
                                                                                                                                            case 62:
                                                                                                                                                break;
                                                                                                                                            case 95:
                                                                                                                                                i18 = 51836;
                                                                                                                                                while (true) {
                                                                                                                                                    i18 ^= 51853;
                                                                                                                                                    switch (i18) {
                                                                                                                                                        case 241:
                                                                                                                                                            i18 = 52518;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                        case 1963:
                                                                                                                                                            zBooleanValue2 = false;
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                            continue;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 124:
                                                                                                                                                zBooleanValue5 = ((Boolean) C0151.n(14298, null, new Object[]{strArr2[i11], str2})).booleanValue();
                                                                                                                                                i13 = 55556;
                                                                                                                                                while (true) {
                                                                                                                                                    i13 ^= 55573;
                                                                                                                                                    switch (i13) {
                                                                                                                                                        case 17:
                                                                                                                                                            i13 = zBooleanValue5 ? 55649 : 55618;
                                                                                                                                                            break;
                                                                                                                                                        case 54:
                                                                                                                                                            break;
                                                                                                                                                        case 87:
                                                                                                                                                            int i26 = (i11 - 5) + 1 + 5;
                                                                                                                                                            i14 = 56455;
                                                                                                                                                            while (true) {
                                                                                                                                                                i14 ^= 56472;
                                                                                                                                                                switch (i14) {
                                                                                                                                                                    case 31:
                                                                                                                                                                        i14 = 56486;
                                                                                                                                                                        break;
                                                                                                                                                                    case 62:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            i11 = i26;
                                                                                                                                                            break;
                                                                                                                                                        case 116:
                                                                                                                                                            i15 = 55680;
                                                                                                                                                            while (true) {
                                                                                                                                                                i15 ^= 55697;
                                                                                                                                                                switch (i15) {
                                                                                                                                                                    case 17:
                                                                                                                                                                        i15 = 56362;
                                                                                                                                                                        continue;
                                                                                                                                                                        continue;
                                                                                                                                                                    case 1467:
                                                                                                                                                                        zBooleanValue2 = true;
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        continue;
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
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 116:
                                                                                                                                i16 = 54657;
                                                                                                                                while (true) {
                                                                                                                                    i16 ^= 54674;
                                                                                                                                    switch (i16) {
                                                                                                                                        case 19:
                                                                                                                                            i16 = 54688;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                        case 50:
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                    }
                                                                                                                                    i18 = 51836;
                                                                                                                                    while (true) {
                                                                                                                                        i18 ^= 51853;
                                                                                                                                        switch (i18) {
                                                                                                                                            case 241:
                                                                                                                                                i18 = 52518;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                            case 1963:
                                                                                                                                                zBooleanValue2 = false;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                        }
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
                                                                                                    case 83:
                                                                                                        i18 = 51836;
                                                                                                        while (true) {
                                                                                                            i18 ^= 51853;
                                                                                                            switch (i18) {
                                                                                                                case 241:
                                                                                                                    i18 = 52518;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 1963:
                                                                                                                    zBooleanValue2 = false;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 1007:
                                                                                        i5 = strArr == null ? 53479 : 52797;
                                                                                        break;
                                                                                    case 7927:
                                                                                        i17 = 53510;
                                                                                        while (true) {
                                                                                            i17 ^= 53527;
                                                                                            switch (i17) {
                                                                                                case 17:
                                                                                                    i17 = 53541;
                                                                                                    continue;
                                                                                                    continue;
                                                                                                case 50:
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                                    continue;
                                                                                            }
                                                                                            i18 = 51836;
                                                                                            while (true) {
                                                                                                i18 ^= 51853;
                                                                                                switch (i18) {
                                                                                                    case 241:
                                                                                                        i18 = 52518;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                    case 1963:
                                                                                                        zBooleanValue2 = false;
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                        continue;
                                                                                                }
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
                                                            } catch (Throwable th) {
                                                                int i27 = 56579;
                                                                while (true) {
                                                                    i27 ^= 56596;
                                                                    switch (i27) {
                                                                        case 23:
                                                                            i27 = 56610;
                                                                            continue;
                                                                        case 54:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 1769:
                                                            boolean zBooleanValue6 = ((Boolean) C0151.n(14298, null, new Object[]{str, str4})).booleanValue();
                                                            int i28 = 50689;
                                                            while (true) {
                                                                i28 ^= 50706;
                                                                switch (i28) {
                                                                    case 19:
                                                                        i28 = zBooleanValue6 ? 50782 : 50751;
                                                                        break;
                                                                    case 45:
                                                                        boolean zBooleanValue7 = ((Boolean) C0151.n(14298, null, new Object[]{str, (String) C0181.n(92093, null, new Object[]{(short[]) C0151.n(99963), 522, Integer.valueOf(C0084.f293 ^ (-385)), 641})})).booleanValue();
                                                                        int i29 = 51588;
                                                                        while (true) {
                                                                            i29 ^= 51605;
                                                                            switch (i29) {
                                                                                case 17:
                                                                                    i29 = !zBooleanValue7 ? 51681 : 51650;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                case 87:
                                                                                    i18 = 51836;
                                                                                    while (true) {
                                                                                        i18 ^= 51853;
                                                                                        switch (i18) {
                                                                                            case 241:
                                                                                                i18 = 52518;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                            case 1963:
                                                                                                zBooleanValue2 = false;
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 116:
                                                                                    boolean zBooleanValue8 = ((Boolean) C0151.n(14298, null, new Object[]{str, (String) C0157.n(97123, null, new Object[]{(short[]) C0151.n(99963), 525, Integer.valueOf(C0051.f207 ^ (-372)), 848})})).booleanValue();
                                                                                    int i30 = 51712;
                                                                                    while (true) {
                                                                                        i30 ^= 51729;
                                                                                        switch (i30) {
                                                                                            case 14:
                                                                                                break;
                                                                                            case 17:
                                                                                                i30 = zBooleanValue8 ? 51805 : 51774;
                                                                                                break;
                                                                                            case 47:
                                                                                                iIntValue = ((Integer) C0225.n(57008)).intValue();
                                                                                                i4 = 52611;
                                                                                                while (true) {
                                                                                                    i4 ^= 52628;
                                                                                                    switch (i4) {
                                                                                                        case 23:
                                                                                                            if (iIntValue >= 21) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                        case 85:
                                                                                                            zBooleanValue = ((Boolean) C0151.n(14298, null, new Object[]{(String) C0225.n(90538), str4})).booleanValue();
                                                                                                            i2 = 1507627;
                                                                                                            while (true) {
                                                                                                                i2 ^= 1507644;
                                                                                                                switch (i2) {
                                                                                                                    case 23:
                                                                                                                        if (!zBooleanValue) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 85:
                                                                                                                        zBooleanValue2 = true;
                                                                                                                        break;
                                                                                                                    case 118:
                                                                                                                        break;
                                                                                                                    case 180:
                                                                                                                        zBooleanValue3 = ((Boolean) C0151.n(14298, null, new Object[]{(String) C0225.n(72707), str4})).booleanValue();
                                                                                                                        i3 = 1507751;
                                                                                                                        while (true) {
                                                                                                                            i3 ^= 1507768;
                                                                                                                            switch (i3) {
                                                                                                                                case 31:
                                                                                                                                    if (zBooleanValue3) {
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 1335:
                                                                                                                                    zBooleanValue2 = true;
                                                                                                                                    break;
                                                                                                                                case 1480:
                                                                                                                                    i18 = 51836;
                                                                                                                                    while (true) {
                                                                                                                                        i18 ^= 51853;
                                                                                                                                        switch (i18) {
                                                                                                                                            case 241:
                                                                                                                                                i18 = 52518;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                            case 1963:
                                                                                                                                                zBooleanValue2 = false;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
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
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 116:
                                                                                                            strArr = (String[]) C0225.n(41341, null, new Object[0]);
                                                                                                            i5 = 52735;
                                                                                                            while (true) {
                                                                                                                i5 ^= 52752;
                                                                                                                switch (i5) {
                                                                                                                    case 14:
                                                                                                                        break;
                                                                                                                    case 45:
                                                                                                                        length = strArr.length;
                                                                                                                        i6 = 0;
                                                                                                                        while (true) {
                                                                                                                            i7 = 53634;
                                                                                                                            while (true) {
                                                                                                                                i7 ^= 53651;
                                                                                                                                switch (i7) {
                                                                                                                                    case 17:
                                                                                                                                        if (i6 < length) {
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 50:
                                                                                                                                        break;
                                                                                                                                    case 76:
                                                                                                                                        zBooleanValue4 = ((Boolean) C0151.n(14298, null, new Object[]{strArr[i6], str2})).booleanValue();
                                                                                                                                        i8 = 53758;
                                                                                                                                        while (true) {
                                                                                                                                            i8 ^= 53775;
                                                                                                                                            switch (i8) {
                                                                                                                                                case 1009:
                                                                                                                                                    if (zBooleanValue4) {
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 1703:
                                                                                                                                                    break;
                                                                                                                                                case 1736:
                                                                                                                                                    int i210 = (i6 - 13) + 1 + 13;
                                                                                                                                                    i9 = 1507503;
                                                                                                                                                    while (true) {
                                                                                                                                                        i9 ^= 1507520;
                                                                                                                                                        switch (i9) {
                                                                                                                                                            case 14:
                                                                                                                                                                break;
                                                                                                                                                            case 111:
                                                                                                                                                                i9 = 1507534;
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    i6 = i210;
                                                                                                                                                    break;
                                                                                                                                                case 1769:
                                                                                                                                                    strArr2 = (String[]) C0225.n(32025, null, new Object[0]);
                                                                                                                                                    i10 = 54533;
                                                                                                                                                    while (true) {
                                                                                                                                                        i10 ^= 54550;
                                                                                                                                                        switch (i10) {
                                                                                                                                                            case 19:
                                                                                                                                                                if (strArr2 == null) {
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            case 50:
                                                                                                                                                                break;
                                                                                                                                                            case 85:
                                                                                                                                                                length2 = strArr2.length;
                                                                                                                                                                i11 = 0;
                                                                                                                                                                while (true) {
                                                                                                                                                                    i12 = 55432;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i12 ^= 55449;
                                                                                                                                                                        switch (i12) {
                                                                                                                                                                            case 17:
                                                                                                                                                                                if (i11 < length2) {
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 62:
                                                                                                                                                                                break;
                                                                                                                                                                            case 95:
                                                                                                                                                                                i18 = 51836;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i18 ^= 51853;
                                                                                                                                                                                    switch (i18) {
                                                                                                                                                                                        case 241:
                                                                                                                                                                                            i18 = 52518;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                        case 1963:
                                                                                                                                                                                            zBooleanValue2 = false;
                                                                                                                                                                                            break;
                                                                                                                                                                                        default:
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 124:
                                                                                                                                                                                zBooleanValue5 = ((Boolean) C0151.n(14298, null, new Object[]{strArr2[i11], str2})).booleanValue();
                                                                                                                                                                                i13 = 55556;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i13 ^= 55573;
                                                                                                                                                                                    switch (i13) {
                                                                                                                                                                                        case 17:
                                                                                                                                                                                            if (zBooleanValue5) {
                                                                                                                                                                                            }
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 54:
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 87:
                                                                                                                                                                                            int i211 = (i11 - 5) + 1 + 5;
                                                                                                                                                                                            i14 = 56455;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                i14 ^= 56472;
                                                                                                                                                                                                switch (i14) {
                                                                                                                                                                                                    case 31:
                                                                                                                                                                                                        i14 = 56486;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    case 62:
                                                                                                                                                                                                        break;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            i11 = i211;
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 116:
                                                                                                                                                                                            i15 = 55680;
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                i15 ^= 55697;
                                                                                                                                                                                                switch (i15) {
                                                                                                                                                                                                    case 17:
                                                                                                                                                                                                        i15 = 56362;
                                                                                                                                                                                                        continue;
                                                                                                                                                                                                        continue;
                                                                                                                                                                                                    case 1467:
                                                                                                                                                                                                        zBooleanValue2 = true;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    default:
                                                                                                                                                                                                        continue;
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
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            case 116:
                                                                                                                                                                i16 = 54657;
                                                                                                                                                                while (true) {
                                                                                                                                                                    i16 ^= 54674;
                                                                                                                                                                    switch (i16) {
                                                                                                                                                                        case 19:
                                                                                                                                                                            i16 = 54688;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                        case 50:
                                                                                                                                                                            break;
                                                                                                                                                                        default:
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                    }
                                                                                                                                                                    i18 = 51836;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i18 ^= 51853;
                                                                                                                                                                        switch (i18) {
                                                                                                                                                                            case 241:
                                                                                                                                                                                i18 = 52518;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                            case 1963:
                                                                                                                                                                                zBooleanValue2 = false;
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                        }
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
                                                                                                                                    case 83:
                                                                                                                                        i18 = 51836;
                                                                                                                                        while (true) {
                                                                                                                                            i18 ^= 51853;
                                                                                                                                            switch (i18) {
                                                                                                                                                case 241:
                                                                                                                                                    i18 = 52518;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                case 1963:
                                                                                                                                                    zBooleanValue2 = false;
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 1007:
                                                                                                                        if (strArr == null) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 7927:
                                                                                                                        i17 = 53510;
                                                                                                                        while (true) {
                                                                                                                            i17 ^= 53527;
                                                                                                                            switch (i17) {
                                                                                                                                case 17:
                                                                                                                                    i17 = 53541;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                case 50:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                            }
                                                                                                                            i18 = 51836;
                                                                                                                            while (true) {
                                                                                                                                i18 ^= 51853;
                                                                                                                                switch (i18) {
                                                                                                                                    case 241:
                                                                                                                                        i18 = 52518;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                    case 1963:
                                                                                                                                        zBooleanValue2 = false;
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                }
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
                                                                                            case 76:
                                                                                                i18 = 51836;
                                                                                                while (true) {
                                                                                                    i18 ^= 51853;
                                                                                                    switch (i18) {
                                                                                                        case 241:
                                                                                                            i18 = 52518;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        case 1963:
                                                                                                            zBooleanValue2 = false;
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
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
                                                                    case 50:
                                                                        break;
                                                                    case 76:
                                                                        int i31 = 50813;
                                                                        while (true) {
                                                                            i31 ^= 50830;
                                                                            switch (i31) {
                                                                                case 18:
                                                                                    zBooleanValue2 = true;
                                                                                    break;
                                                                                case 243:
                                                                                    i31 = 50844;
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
                                            }
                                        } catch (Throwable th2) {
                                            str = (String) C0195.n(43185);
                                        }
                                        break;
                                    case 503:
                                        i = bool != null ? 49635 : 48953;
                                        break;
                                    case 32495:
                                        zBooleanValue2 = ((Boolean) C0181.n(23181, bool, new Object[0])).booleanValue();
                                        int i32 = 49666;
                                        while (true) {
                                            i32 ^= 49683;
                                            switch (i32) {
                                                case 17:
                                                    i32 = 49697;
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
                        } catch (Throwable th3) {
                            bool = null;
                        }
                        i = 48891;
                        break;
                    default:
                        break;
                }
                int i33 = 1508526;
                while (true) {
                    i33 ^= 1508543;
                    switch (i33) {
                        case 17:
                            if (zBooleanValue2) {
                                i33 = 1508619;
                            }
                            break;
                        case 83:
                            str2 = (String) C0178.n(26978, null, new Object[]{(short[]) C0151.n(99963), 527, Integer.valueOf(C0062.f271 ^ 538), 2043});
                            break;
                        case 114:
                            break;
                        case 436:
                            int i34 = 1508650;
                            while (true) {
                                i34 ^= 1508667;
                                switch (i34) {
                                    case 17:
                                        i34 = 1508681;
                                        break;
                                    case 114:
                                        break;
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i33 = 1508588;
                }
                return (C0273l0) C0151.n(10026, null, new Object[]{str2});
            }
        } catch (Throwable th4) {
            int i35 = 1509425;
            while (true) {
                i35 ^= 1509442;
                switch (i35) {
                    case 18:
                        break;
                    case 115:
                        i35 = 1509456;
                        continue;
                    default:
                        continue;
                }
            }
        }
    }
}
