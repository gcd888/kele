package com.github.catvod.spider;

import android.app.Application;
import android.os.Looper;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.B.C0004;
import com.github.catvod.spider.merge.B.C0005;
import com.github.catvod.spider.merge.D.C0007;
import com.github.catvod.spider.merge.D.C0012;
import com.github.catvod.spider.merge.E.C0016;
import com.github.catvod.spider.merge.G.C0023;
import com.github.catvod.spider.merge.G.C0024;
import com.github.catvod.spider.merge.I.C0025;
import com.github.catvod.spider.merge.K.C0029;
import com.github.catvod.spider.merge.L.C0031;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.N.C0037;
import com.github.catvod.spider.merge.O.C0038;
import com.github.catvod.spider.merge.O.C0039;
import com.github.catvod.spider.merge.Q.C0040;
import com.github.catvod.spider.merge.Q.C0041;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.T.C0048;
import com.github.catvod.spider.merge.X.C0051;
import com.github.catvod.spider.merge.X.C0052;
import com.github.catvod.spider.merge.Z.C0054;
import com.github.catvod.spider.merge.b0.C0060;
import com.github.catvod.spider.merge.c0.C0065;
import com.github.catvod.spider.merge.d0.C0068;
import com.github.catvod.spider.merge.d0.C0069;
import com.github.catvod.spider.merge.e0.C0075;
import com.github.catvod.spider.merge.f0.C0077;
import com.github.catvod.spider.merge.f0.C0078;
import com.github.catvod.spider.merge.f0.C0080;
import com.github.catvod.spider.merge.h0.C0086;
import com.github.catvod.spider.merge.j0.C0094;
import com.github.catvod.spider.merge.k0.C0100;
import com.github.catvod.spider.merge.p0.C0111;
import com.github.catvod.spider.merge.p001b.C0058;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p003d.C0067;
import com.github.catvod.spider.merge.p004e.C0071;
import com.github.catvod.spider.merge.p007h.C0083;
import com.github.catvod.spider.merge.p011m.C0102;
import com.github.catvod.spider.merge.p017u.C0129;
import com.github.catvod.spider.merge.p018v.C0132;
import com.github.catvod.spider.merge.p020x.C0136;
import com.github.catvod.spider.merge.p020x.C0138;
import com.github.catvod.utils.C0144;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0178;
import moyu.fucking.C0182;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class FishCrypto {
    public static volatile boolean a = false;
    public static volatile String b = "";
    public static volatile String[] c;
    public static final ThreadLocal e;
    public static final AtomicReference f;
    public static final ThreadLocal g;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f34short = {3187, 3177, 3077, 3186, 3145, 3077, 3154, 3189, 3187, 3177, 3077, 3186, 3145, 3077, 3154, 3096, 3077, 3089, 3075, 3078, 3077, 3189, 3074, 3090, 3079, 3079, 3078, 3074, 2668, 2660, 2681, 2685, 2672, 2601, 2682, 2662, 2601, 2681, 2664, 2685, 2657, 2974, 2951, 2956, 2999, 2955, 2951, 2950, 2972, 2957, 2950, 2972, 2201, 2204, 2182, 2177, 3300, 3267, 3295, 3288, 3212, 3290, 3273, 3294, 3269, 3274, 3269, 3279, 3277, 3288, 3269, 3267, 3266, 3212, 3292, 3273, 3266, 3272, 3269, 3266, 3275, 3212, 3267, 3294, 3212, 3278, 3264, 3267, 3279, 3271, 3273, 3272, 773, 788, 777, 773, 862, 769, 797, 784, 792, 799, 842, 849, 786, 793, 784, 771, 770, 788, 773, 844, 772, 773, 791, 860, 841, 2470, 2526, 2470, 2526, 2470, 2526, 669, 669, 669, 2632, 2628, 2630, 2565, 2637, 2628, 2629, 2636, 2630, 2626, 2565, 2634, 2629, 2639, 2649, 2628, 2626, 2639, 2565, 2655, 2653, 2565, 2634, 2651, 2626, 2565, 2632, 2628, 2629, 2637, 2626, 2636, 2565, 2685, 2628, 2639, 2664, 2628, 2629, 2637, 2626, 2636, 2719, 2717, 2700, 2736, 2711, 2709, 2717, 1182, 1180, 1165, 749, 759, 746, 763, 725, 763, 743, 931, 929, 944, 911, 929, 957, 2205, 2203, 1345, 2536, 2548, 2548, 2544, 3172, 3173, 3191, 3100, 3081, 2903, 2893, 1035, 1036, 1038, 1030, 1077, 1034, 1031, 1030, 1036, 1056, 1036, 1037, 1047, 1030, 1037, 1047, 295, 288, 290, 298, 268, 288, 289, 315, 298, 289, 315, 1950, 1931, 1920, 1930, 1927, 1920, 1929, 3061, 3060, 3071, 3064, 3060, 3061, 21269, 18065, -28122, -31893, 28544, 21659, 30272, -2138, -31907, 29351, 22707, 21957, 22747, 20777, 17581, 28092, -25972, -31407, -28646, -32425, -32263, 28675, 24064, 26693, 22694, 22585, 28606, 21853, 22595, 25758, -30787, 27567, 31553, 22517, 17009, -26938, -30837, 28570, 30064, 1244, 1236, 1225, 1229, 1216, 1177, 1226, 1238, 1177, 1225, 1240, 1229, 1233, 30502, -31903, 31694, 19452, 22442, -30089, 23611, -30673, 30402, -32123, 31274, 18968, 22094, -29805, 19139, -1054, -28903, 32483, 21751, -32413, 25172, 28017, 29776, 17506, 22580, -31255, 28529, 21827, -2664, 27744, 28452, 28749, 25604, 24218, -25767, 24251, 20779, 17583, 27421, 23297, -25220, 29535, 27419, 20480, 29403, -3267, -30778, 25841, 27604, 24209, -31924, 29410, 27565, 22554, 19870, 30963, 30400, 23201, 30627, 25743, 24468, 32079, -855, -30638, 27493, 25664, 27524, -26327, 32118, 25657, 2885, 2905, 2900, 2892, 2896, 2887, 2934, 2906, 2907, 2881, 2896, 2907, 2881, 1607, 1566, 1612, 1629, 1614, 1615, 1625, 1566, 1542, 1548, 1552, 1566, 1609, 1614, 1616, 1566, 1542, 1566, 1566, 1552, 1566, 1620, 1619, 1615, 1608, 1661, 1624, 1617, 1621, 1615, 1615, 1621, 1619, 1618, 1566, 1542, 1566, 642, 652, 642, 717, 723, 711, 642, 666, 642, 3186, 3117, 2088, 2161, 2107, 2108, 2080, 2087, 2066, 2103, 2110, 2106, 2080, 2080, 2106, 2108, 2109, 2161, 2153, 2161, 3297, 3311, 3297, 3247, 3242, 3248, 3255, 3297, 3321, 3224, 3256, 3297, 3253, 3244, 3239, 3228, 3242, 3239, 3297, 3321, 3297, 3228, 3228, 3243, 3244, 3248, 3255, 3228, 442, 442, 455, 457, 455, 403, 394, 385, 442, 395, 388, 392, 384, 455, 479, 455, 2520, 2518, 2520, 2444, 2453, 2462, 2469, 2440, 2463, 2455, 2459, 2440, 2449, 2441, 2520, 2496, 2520, 3209, 3207, 3209, 3293, 3268, 3279, 3316, 3272, 3268, 3269, 3295, 3278, 3269, 3295, 3209, 3217, 3209, 1590, 1641, 1609, 1641, 574, 555, 544, 554, 551, 544, 553, 999, 992, 1013, 992, 1009, 679, 683, 681, 746, 674, 683, 682, 675, 681, 685, 746, 677, 682, 672, 694, 683, 685, 672, 746, 688, 690, 746, 673, 690, 673, 682, 688, 746, 662, 673, 674, 694, 673, 695, 684, 641, 690, 673, 682, 688, 1511, 1504, 1506, 1514, 482, 503, 503};
    public static final Pattern d = (Pattern) C0195.n(73905, null, new Object[]{(String) C0195.n(19148, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 0, Integer.valueOf(C0042.f198 ^ 39), 3112})});

    /* JADX WARN: Code duplicated, block: B:76:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0124 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0077. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0058. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static {
        ?? r0;
        int i;
        try {
            r0 = (String) C0195.n(71261) /*=> InitOrigin.e*/;
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = r0 != 0 ? 1709 : 1678;
                        break;
                    case 204:
                        try {
                            boolean zBooleanValue = ((Boolean) C0195.n(5730, r0, new Object[0])).booleanValue();
                            int i3 = 1740;
                            while (true) {
                                i3 ^= 1757;
                                switch (i3) {
                                    case 17:
                                        i3 = !zBooleanValue ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        b = (String) C0195.n(75793, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 28, Integer.valueOf(C0065.f274 ^ 30), 2569});
                                        i = 48891;
                                        while (true) {
                                            i ^= 48908;
                                            switch (i) {
                                                case 22:
                                                    r0 = 0;
                                                    break;
                                                case 503:
                                                    i = 48922;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 500:
                                        C0195.n(9003, null, new Object[]{r0});
                                        b = (String) C0195.n(43185) /*=> raw:new String(new byte[0])*/;
                                        int i4 = 1864;
                                        while (true) {
                                            i4 ^= 1881;
                                            switch (i4) {
                                                case 17:
                                                    i4 = 48674;
                                                    break;
                                                case 47483:
                                                    r0 = 1;
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            int i5 = 48767;
                            while (true) {
                                i5 ^= 48784;
                                switch (i5) {
                                    case 14:
                                        C0195.n(20253, null, new Object[]{r0});
                                        b = (String) C0195.n(93428, null, new Object[]{th});
                                        r0 = 0;
                                        break;
                                    case 239:
                                        i5 = 48798;
                                        break;
                                }
                            }
                        }
                        break;
                    case 239:
                        b = (String) C0195.n(75793, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 28, Integer.valueOf(C0065.f274 ^ 30), 2569});
                        i = 48891;
                        while (true) {
                            i ^= 48908;
                            switch (i) {
                                case 22:
                                    r0 = 0;
                                    break;
                                case 503:
                                    i = 48922;
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
                a = r0;
                e = new ThreadLocal();
                f = new AtomicReference();
                g = new ThreadLocal();
                return;
            }
        } catch (Throwable th2) {
            th = th2;
            r0 = 0;
        }
    }

    public FishCrypto() throws Throwable {
        int iIntValue = ((Integer) C0195.n(18512, null, new Object[0])).intValue();
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
                    C0195.n(19817, (PrintStream) C0195.n(72538) /*=> System.out*/, new Object[]{Integer.valueOf(((Integer) C0195.n(60398, null, new Object[]{(String) C0195.n(36669, null, new Object[]{(String) C0195.n(3761) /*=> raw:new String(new byte[]{(byte) 98, (byte) 110, (byte) 98, (byte) 119, (byte) 105, (byte) 116, (byte) 1*/})})).intValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static String a(String str) throws Throwable {
        boolean zBooleanValue = ((Boolean) C0195.n(96562, null, new Object[0])).booleanValue();
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
                    C0195.n(90553, null, new Object[0]);
                    return (String) C0195.n(70619, null, new Object[]{str, (String) C0195.n(37477) /*=> N1.m*/});
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static void acceptShellHome(Object obj, Object obj2, long j, String str, Callable<Boolean> callable) throws Throwable {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (obj != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (obj2 != null) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case 500:
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (str != null) {
                                                i3 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            return;
                                        case 47417:
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        return;
                                                    case 76:
                                                        boolean zBooleanValue = ((Boolean) C0195.n(23046, (Thread) C0195.n(50425, null, new Object[0]), new Object[0])).booleanValue();
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    c cVar = new c(obj, j, callable);
                                                                    boolean zBooleanValue2 = ((Boolean) C0195.n(87344, cVar, new Object[0])).booleanValue();
                                                                    int i6 = 49790;
                                                                    while (true) {
                                                                        i6 ^= 49807;
                                                                        switch (i6) {
                                                                            case 18:
                                                                                break;
                                                                            case 51:
                                                                                return;
                                                                            case 84:
                                                                                Object objN = C0195.n(37603, null, new Object[]{obj});
                                                                                int i7 = 49914;
                                                                                while (true) {
                                                                                    i7 ^= 49931;
                                                                                    switch (i7) {
                                                                                        case 497:
                                                                                            if (objN == obj2) {
                                                                                                i7 = 50658;
                                                                                            }
                                                                                            break;
                                                                                        case 1711:
                                                                                            break;
                                                                                        case 1736:
                                                                                            return;
                                                                                        case 1769:
                                                                                            boolean zBooleanValue3 = ((Boolean) C0195.n(23046, (Thread) C0195.n(50425, null, new Object[0]), new Object[0])).booleanValue();
                                                                                            int i8 = 50689;
                                                                                            while (true) {
                                                                                                i8 ^= 50706;
                                                                                                switch (i8) {
                                                                                                    case 19:
                                                                                                        if (zBooleanValue3) {
                                                                                                            i8 = 50782;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 45:
                                                                                                        cVar.f = obj2;
                                                                                                        cVar.e = str;
                                                                                                        while (true) {
                                                                                                            AtomicReference atomicReference = (AtomicReference) C0195.n(18109) /*=> FishCrypto.f*/;
                                                                                                            c cVar2 = (c) C0195.n(90685, atomicReference, new Object[0]);
                                                                                                            boolean zBooleanValue4 = ((Boolean) C0195.n(87344, cVar, new Object[0])).booleanValue();
                                                                                                            int i9 = 51588;
                                                                                                            while (true) {
                                                                                                                i9 ^= 51605;
                                                                                                                switch (i9) {
                                                                                                                    case 17:
                                                                                                                        i9 = zBooleanValue4 ? 51681 : 51650;
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
                                                                                                                return;
                                                                                                            }
                                                                                                            int i10 = 51712;
                                                                                                            while (true) {
                                                                                                                i10 ^= 51729;
                                                                                                                switch (i10) {
                                                                                                                    case 14:
                                                                                                                        break;
                                                                                                                    case 17:
                                                                                                                        i10 = cVar2 != null ? 51805 : 51774;
                                                                                                                        break;
                                                                                                                    case 47:
                                                                                                                        break;
                                                                                                                    case 76:
                                                                                                                        long jLongValue = ((Long) C0195.n(58241, cVar2)).longValue();
                                                                                                                        int i11 = 51836;
                                                                                                                        while (true) {
                                                                                                                            i11 ^= 51853;
                                                                                                                            switch (i11) {
                                                                                                                                case 241:
                                                                                                                                    i11 = jLongValue >= j ? 52580 : 52549;
                                                                                                                                    break;
                                                                                                                                case 1963:
                                                                                                                                    break;
                                                                                                                                case 1992:
                                                                                                                                    break;
                                                                                                                                case 2025:
                                                                                                                                    int i12 = 52611;
                                                                                                                                    while (true) {
                                                                                                                                        i12 ^= 52628;
                                                                                                                                        switch (i12) {
                                                                                                                                            case 23:
                                                                                                                                                i12 = 52642;
                                                                                                                                                break;
                                                                                                                                            case 54:
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
                                                                                                                return;
                                                                                                            }
                                                                                                            while (true) {
                                                                                                                boolean zBooleanValue5 = ((Boolean) C0195.n(80977, atomicReference, new Object[]{cVar2, cVar})).booleanValue();
                                                                                                                int i13 = 52735;
                                                                                                                while (true) {
                                                                                                                    i13 ^= 52752;
                                                                                                                    switch (i13) {
                                                                                                                        case 14:
                                                                                                                            break;
                                                                                                                        case 45:
                                                                                                                            break;
                                                                                                                        case 1007:
                                                                                                                            i13 = zBooleanValue5 ? 53479 : 52797;
                                                                                                                            break;
                                                                                                                        case 7927:
                                                                                                                            C0195.n(55304, null, new Object[0]);
                                                                                                                            int iIntValue = ((Integer) C0195.n(39207, null, new Object[0])).intValue();
                                                                                                                            int i14 = 53510;
                                                                                                                            while (true) {
                                                                                                                                i14 ^= 53527;
                                                                                                                                switch (i14) {
                                                                                                                                    case 17:
                                                                                                                                        if (iIntValue >= 0) {
                                                                                                                                            i14 = 53603;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 50:
                                                                                                                                        break;
                                                                                                                                    case 83:
                                                                                                                                        break;
                                                                                                                                    case 116:
                                                                                                                                        C0195.n(38669, (PrintStream) C0195.n(72538) /*=> System.out*/, new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0195.n(83584, null, new Object[]{(String) C0195.n(14307) /*=> raw:new String(new byte[]{(byte) 112, (byte) 109, (byte) 74, (byte) 76, (byte) 75, (byte) 80, (byte) 70,*/})})});
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        continue;
                                                                                                                                }
                                                                                                                                i14 = 53572;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    return;
                                                                                                                }
                                                                                                                Object objN2 = C0195.n(90685, atomicReference, new Object[0]);
                                                                                                                int i15 = 53634;
                                                                                                                while (true) {
                                                                                                                    i15 ^= 53651;
                                                                                                                    switch (i15) {
                                                                                                                        case 17:
                                                                                                                            i15 = objN2 != cVar2 ? 53727 : 53696;
                                                                                                                            break;
                                                                                                                        case 50:
                                                                                                                            break;
                                                                                                                        case 76:
                                                                                                                            break;
                                                                                                                        case 83:
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    return;
                                                                                                                }
                                                                                                            }
                                                                                                            int i16 = 53758;
                                                                                                            while (true) {
                                                                                                                i16 ^= 53775;
                                                                                                                switch (i16) {
                                                                                                                    case 1009:
                                                                                                                        i16 = 54440;
                                                                                                                        break;
                                                                                                                    case 1703:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case 50:
                                                                                                        break;
                                                                                                    case 76:
                                                                                                        int i17 = 50813;
                                                                                                        while (true) {
                                                                                                            i17 ^= 50830;
                                                                                                            switch (i17) {
                                                                                                                case 18:
                                                                                                                    return;
                                                                                                                case 243:
                                                                                                                    i17 = 50844;
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                                i8 = 50751;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i7 = 50627;
                                                                                }
                                                                                break;
                                                                            case 241:
                                                                                if (zBooleanValue2) {
                                                                                    i6 = 49883;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i6 = 49852;
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    if (zBooleanValue) {
                                                                        i5 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    int i18 = 49666;
                                                                    while (true) {
                                                                        i18 ^= 49683;
                                                                        switch (i18) {
                                                                            case 17:
                                                                                i18 = 49697;
                                                                                break;
                                                                            case 50:
                                                                                return;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i5 = 48953;
                                                        }
                                                        break;
                                                    case 239:
                                                        if (callable != null) {
                                                            i4 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i4 = 48829;
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
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static String b(String str) throws Throwable {
        ((Integer) C0195.n(23628) /*=> N1.a*/).intValue();
        String str2 = (String) C0195.n(99405, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 41, Integer.valueOf(C0078.f287 ^ (-699)), 3048});
        String str3 = (String) C0195.n(85847, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 52, Integer.valueOf(C0004.f160 ^ (-344)), 2293});
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
                    boolean zBooleanValue2 = ((Boolean) C0195.n(96562, null, new Object[0])).booleanValue();
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
                                C0195.n(90553, null, new Object[0]);
                                boolean zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0195.n(37477) /*=> N1.m*/})).booleanValue();
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 45:
                                            try {
                                                JSONObject jSONObject = new JSONObject(str);
                                                boolean zBooleanValue4 = ((Boolean) C0195.n(28467, jSONObject, new Object[]{str3})).booleanValue();
                                                int i4 = 49666;
                                                while (true) {
                                                    i4 ^= 49683;
                                                    switch (i4) {
                                                        case 17:
                                                            if (zBooleanValue4) {
                                                                i4 = 49759;
                                                            }
                                                            break;
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            JSONArray jSONArray = (JSONArray) C0195.n(83890, jSONObject, new Object[]{str3});
                                                            int iIntValue = ((Integer) C0195.n(12588, jSONArray, new Object[0])).intValue();
                                                            int i5 = 49790;
                                                            while (true) {
                                                                i5 ^= 49807;
                                                                switch (i5) {
                                                                    case 18:
                                                                        break;
                                                                    case 51:
                                                                        break;
                                                                    case 84:
                                                                        JSONObject jSONObject2 = (JSONObject) C0195.n(10400, jSONArray, new Object[]{0});
                                                                        break;
                                                                    case 241:
                                                                        if (iIntValue > 0) {
                                                                            i5 = 49883;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                                i5 = 49852;
                                                            }
                                                            break;
                                                        case 83:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i4 = 49728;
                                                }
                                                return (String) C0182.n(84813, jSONObject, new Object[0]);
                                            } catch (Exception e2) {
                                                int i6 = 49914;
                                                while (true) {
                                                    i6 ^= 49931;
                                                    switch (i6) {
                                                        case 497:
                                                            i6 = 50596;
                                                            break;
                                                        case 1711:
                                                            return str;
                                                    }
                                                }
                                            }
                                            break;
                                        case 76:
                                            int i7 = 48891;
                                            while (true) {
                                                i7 ^= 48908;
                                                switch (i7) {
                                                    case 22:
                                                        return str;
                                                    case 503:
                                                        i7 = 48922;
                                                        break;
                                                }
                                            }
                                            break;
                                        case 239:
                                            if (zBooleanValue3) {
                                                i3 = 48860;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i3 = 48829;
                                }
                                break;
                            case 500:
                                int i8 = 1864;
                                while (true) {
                                    i8 ^= 1881;
                                    switch (i8) {
                                        case 17:
                                            i8 = 48674;
                                            break;
                                        case 47483:
                                            return str;
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
                    return str;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static String beginHostEntry(Object obj, String str) {
        long jLongValue;
        ThreadLocal threadLocal = (ThreadLocal) C0182.n(47224) /*=> FishCrypto.g*/;
        b bVar = (b) C0182.n(64213, threadLocal, new Object[0]);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = bVar == null ? 1709 : 1678;
                    break;
                case 204:
                    jLongValue = ((Long) C0182.n(75677, null, new Object[0])).longValue() + 4000000000L;
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
                    break;
                case 239:
                    jLongValue = ((Long) C0182.n(17464, bVar)).longValue();
                    break;
                default:
                    break;
            }
        }
        b bVar2 = new b(jLongValue, str, bVar);
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    i3 = bVar != null ? 48736 : 48705;
                    break;
                case 47384:
                    break;
                case 47417:
                    boolean zBooleanValue = ((Boolean) C0182.n(74520, bVar)).booleanValue();
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                                break;
                            case 45:
                                break;
                            case 76:
                                boolean zBooleanValue2 = ((Boolean) C0182.n(55567, str, new Object[]{(String) C0182.n(90591, bVar)})).booleanValue();
                                int i5 = 48891;
                                while (true) {
                                    i5 ^= 48908;
                                    switch (i5) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i5 = zBooleanValue2 ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            bVar2.e = true;
                                            bVar2.d = (c) C0182.n(57709, bVar);
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i4 = zBooleanValue ? 48860 : 48829;
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
        C0182.n(13329, threadLocal, new Object[]{bVar2});
        try {
            String str2 = (String) C0182.n(63642, null, new Object[]{obj, str});
            int i6 = 49666;
            while (true) {
                i6 ^= 49683;
                switch (i6) {
                    case 17:
                        if (str2 != null) {
                            i6 = 49759;
                        }
                        break;
                    case 50:
                        break;
                    case 76:
                        C0182.n(3903, null, new Object[]{null});
                        int i7 = 49790;
                        while (true) {
                            i7 ^= 49807;
                            switch (i7) {
                                case 18:
                                    break;
                                case 241:
                                    i7 = 49821;
                                    break;
                            }
                        }
                        break;
                    case 83:
                        bVar2.e = true;
                        break;
                    default:
                        continue;
                }
                i6 = 49728;
            }
            return str2;
        } catch (Error e2) {
            e = e2;
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
                C0182.n(3903, null, new Object[]{e});
                throw e;
            }
        } catch (InterruptedException e3) {
            e = e3;
            int i9 = 50813;
            while (true) {
                i9 ^= 50830;
                switch (i9) {
                    case 18:
                        break;
                    case 243:
                        i9 = 50844;
                        continue;
                    default:
                        continue;
                }
                C0182.n(3903, null, new Object[]{e});
                throw e;
            }
        } catch (RuntimeException e4) {
            e = e4;
            int i10 = 50689;
            while (true) {
                i10 ^= 50706;
                switch (i10) {
                    case 19:
                        i10 = 50720;
                        continue;
                    case 50:
                        break;
                    default:
                        continue;
                }
                C0182.n(3903, null, new Object[]{e});
                throw e;
            }
        }
    }

    public static Object[] blockedProxy() throws Throwable {
        int i = 0;
        int i2 = 0;
        Object[] objArr = null;
        Integer numValueOf = null;
        Object objN = null;
        Integer num = null;
        short[] sArr = null;
        Object[] objArr2 = null;
        Integer num2 = null;
        Integer numValueOf2 = null;
        Integer num3 = null;
        String str = null;
        Object[] objArr3 = null;
        ByteArrayInputStream byteArrayInputStream = null;
        Object[] objArr4 = null;
        short[] sArr2 = null;
        Object[] objArr5 = null;
        String str2 = "ۣۡۡ";
        Charset charset = null;
        while (true) {
            switch (C0034.m132(str2)) {
                case 56351:
                    objArr = new Object[1];
                    str2 = "۟ۧ۟";
                    numValueOf = Integer.valueOf(i2);
                    break;
                case 1746935:
                    objArr[0] = numValueOf;
                    objN = C0182.n(76256, null, objArr);
                    str2 = "ۥۣ۠";
                    break;
                case 1747900:
                    objArr3 = new Object[1];
                    str2 = "ۣۧۢ";
                    charset = (Charset) objN;
                    break;
                case 1748614:
                    i = C0129.f338;
                    i2 = i ^ 907;
                    str2 = "ۡۢۧ";
                    break;
                case 1748618:
                    i = C0094.f303;
                    str2 = "ۢۨۤ";
                    sArr = (short[]) objN;
                    break;
                case 1748710:
                    Object[] objArr6 = new Object[4];
                    objArr6[0] = sArr2;
                    str2 = "ۡۤۥ";
                    objArr5 = objArr6;
                    break;
                case 1748769:
                    objArr2[1] = num2;
                    str2 = "ۢۧۢ";
                    numValueOf2 = Integer.valueOf(i2);
                    break;
                case 1748770:
                    objArr5[1] = 92;
                    str2 = "ۦۢ۟";
                    break;
                case 1749765:
                    objArr2[3] = num3;
                    objN = C0182.n(69249, null, objArr2);
                    str2 = "ۦۤۧ";
                    break;
                case 1749821:
                    objArr2[2] = numValueOf2;
                    str2 = "ۢۥۨ";
                    num3 = 3244;
                    break;
                case 1749854:
                    i2 = i ^ (-96);
                    str2 = "ۤۤ۠";
                    objArr2 = new Object[4];
                    break;
                case 1750595:
                    i = C0040.f196;
                    i2 = i ^ (-188);
                    str2 = "ۡ۠";
                    break;
                case 1750782:
                    objArr3[0] = charset;
                    objN = C0182.n(67839, str, objArr3);
                    str2 = "ۦۤۤ";
                    break;
                case 1751648:
                    objArr2[0] = sArr;
                    str2 = "ۡۤۤ";
                    num2 = 56;
                    break;
                case 1752458:
                    Object[] objArr7 = new Object[3];
                    objArr7[0] = num;
                    str2 = "ۥۨۨ";
                    objArr4 = objArr7;
                    break;
                case 1752488:
                    Integer num4 = (Integer) objN;
                    objN = C0195.n(97082) /*=> FishCrypto.short*/;
                    str2 = "ۡ۟ۨ";
                    num = num4;
                    break;
                case 1752523:
                    objN = C0182.n(27462, null, objArr5);
                    str2 = "ۨۧۦ";
                    str = (String) objN;
                    break;
                case 1752741:
                    objN = C0195.n(97082) /*=> FishCrypto.short*/;
                    str2 = "ۡ۟ۤ";
                    sArr2 = (short[]) objN;
                    break;
                case 1753507:
                    objArr5[2] = Integer.valueOf(i2);
                    str2 = "ۧ۠ۤ";
                    break;
                case 1753574:
                    byteArrayInputStream = new ByteArrayInputStream((byte[]) objN);
                    str2 = "ۥ۟ۤ";
                    break;
                case 1753577:
                    String str3 = (String) objN;
                    objN = C0182.n(4193) /*=> StandardCharsets.UTF_8*/;
                    str2 = "ۣ۠ۧ";
                    str = str3;
                    break;
                case 1754411:
                    objArr5[3] = 881;
                    str2 = "ۥۡۧ";
                    break;
                case 1755591:
                    objArr4[1] = str;
                    objArr4[2] = byteArrayInputStream;
                    str2 = "۠ۨ۠";
                    break;
                default:
                    return objArr4;
            }
        }
    }

    public static boolean businessReady() {
        long jLongValue = ((Long) C0182.n(47155, null, new Object[0])).longValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (jLongValue >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0182.n(73511, null, new Object[0])).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (zBooleanValue) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                long jLongValue2 = ((Long) C0182.n(47155, null, new Object[0])).longValue();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (jLongValue2 == jLongValue) {
                                                i3 = 48736;
                                            }
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
    }

    public static void c(k kVar) throws Throwable {
        boolean zBooleanValue = ((Boolean) C0195.n(96562, null, new Object[0])).booleanValue();
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
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                    break;
                case 239:
                    C0195.n(90553, null, new Object[0]);
                    boolean zBooleanValue2 = ((Boolean) C0195.n(96562, null, new Object[0])).booleanValue();
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
                                C0195.n(90553, null, new Object[0]);
                                boolean zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0182.n(94207) /*=> N1.n*/})).booleanValue();
                                int i4 = 48891;
                                while (true) {
                                    i4 ^= 48908;
                                    switch (i4) {
                                        case 22:
                                            break;
                                        case 53:
                                            return;
                                        case 503:
                                            if (!zBooleanValue3) {
                                                i4 = 49635;
                                            }
                                            break;
                                        case 32495:
                                            String str = (String) C0182.n(66885, kVar, new Object[0]);
                                            String str2 = (String) C0182.n(94207) /*=> N1.n*/;
                                            boolean zBooleanValue4 = ((Boolean) C0195.n(41159, null, new Object[]{str2})).booleanValue();
                                            int i5 = 49666;
                                            while (true) {
                                                i5 ^= 49683;
                                                switch (i5) {
                                                    case 17:
                                                        if (!zBooleanValue4) {
                                                            i5 = 49759;
                                                        }
                                                        break;
                                                    case 50:
                                                        break;
                                                    case 76:
                                                        boolean zBooleanValue5 = ((Boolean) C0195.n(41159, null, new Object[]{str})).booleanValue();
                                                        int i6 = 49790;
                                                        while (true) {
                                                            i6 ^= 49807;
                                                            switch (i6) {
                                                                case 18:
                                                                    break;
                                                                case 51:
                                                                    String[] strArr = (String[]) C0182.n(43125, str, new Object[]{(String) C0182.n(7909, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 117, Integer.valueOf(C0007.f163 ^ 161), 2554}), Integer.valueOf(C0016.f172 ^ (-888))});
                                                                    strArr[0] = str2;
                                                                    str = (String) C0182.n(23712, null, new Object[]{(String) C0195.n(19148, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 123, Integer.valueOf(C0068.f277 ^ 358), 697}), strArr});
                                                                    break;
                                                                case 84:
                                                                    int i7 = 49914;
                                                                    while (true) {
                                                                        i7 ^= 49931;
                                                                        switch (i7) {
                                                                            case 497:
                                                                                i7 = 50596;
                                                                                break;
                                                                            case 1711:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    if (zBooleanValue5) {
                                                                        i6 = 49883;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            i6 = 49852;
                                                        }
                                                        break;
                                                    case 83:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i5 = 49728;
                                            }
                                            C0182.n(7252, kVar, new Object[]{str});
                                            return;
                                        default:
                                            continue;
                                    }
                                    i4 = 48953;
                                }
                                break;
                            case 47417:
                                int i8 = 48767;
                                while (true) {
                                    i8 ^= 48784;
                                    switch (i8) {
                                        case 14:
                                            return;
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
            i = 1678;
        }
    }

    public static void cancelHostHome(Object obj) throws Throwable {
        c cVar = (c) C0195.n(90685, (AtomicReference) C0195.n(18109) /*=> FishCrypto.f*/, new Object[0]);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = cVar != null ? 1709 : 1678;
                    break;
                case 204:
                    Object objN = C0182.n(66039, (WeakReference) C0182.n(93259, cVar), new Object[0]);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (objN == obj) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                C0182.n(39712, null, new Object[]{cVar});
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
                    break;
            }
        }
        ThreadLocal threadLocal = (ThreadLocal) C0182.n(47701) /*=> FishCrypto.e*/;
        c cVar2 = (c) C0182.n(64213, threadLocal, new Object[0]);
        int i3 = 1864;
        while (true) {
            i3 ^= 1881;
            switch (i3) {
                case 17:
                    i3 = cVar2 != null ? 48736 : 48705;
                    break;
                case 47384:
                    break;
                case 47417:
                    Object objN2 = C0182.n(66039, (WeakReference) C0182.n(93259, cVar2), new Object[0]);
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                                break;
                            case 45:
                                break;
                            case 76:
                                C0182.n(53944, threadLocal, new Object[0]);
                                break;
                            case 239:
                                i4 = objN2 == obj ? 48860 : 48829;
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
        int iIntValue = ((Integer) C0182.n(51494, null, new Object[0])).intValue();
        int i5 = 48891;
        while (true) {
            i5 ^= 48908;
            switch (i5) {
                case 22:
                    break;
                case 53:
                    return;
                case 503:
                    if (iIntValue <= 0) {
                        i5 = 49635;
                    }
                    break;
                case 32495:
                    C0195.n(38669, (PrintStream) C0195.n(72538) /*=> System.out*/, new Object[]{(Long) C0182.n(56258, null, new Object[]{(String) C0182.n(24036, null, new Object[]{(String) C0182.n(66426) /*=> raw:new String(new byte[]{(byte) 48, (byte) 100, (byte) 122, (byte) 117, (byte) 107, (byte) 102, (byte) */})})});
                    return;
                default:
                    continue;
            }
            i5 = 48953;
        }
    }

    public static boolean d(long j) throws Throwable {
        while (true) {
            boolean zBooleanValue = ((Boolean) C0195.n(23046, (Thread) C0195.n(50425, null, new Object[0]), new Object[0])).booleanValue();
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
                        break;
                    case 239:
                        InterruptedException interruptedException = new InterruptedException();
                        int i2 = 52611;
                        while (true) {
                            i2 ^= 52628;
                            switch (i2) {
                                case 23:
                                    i2 = 52642;
                                    break;
                                case 54:
                                    int i3 = 52735;
                                    while (true) {
                                        i3 ^= 52752;
                                        switch (i3) {
                                            case 14:
                                                throw interruptedException;
                                            case 1007:
                                                i3 = 52766;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            boolean zBooleanValue2 = ((Boolean) C0182.n(86863, null, new Object[0])).booleanValue();
            int i4 = 1740;
            while (true) {
                i4 ^= 1757;
                switch (i4) {
                    case 17:
                        i4 = zBooleanValue2 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        break;
                    case 500:
                        return true;
                    default:
                        break;
                }
            }
            boolean zBooleanValue3 = ((Boolean) C0182.n(73511, null, new Object[0])).booleanValue();
            int i5 = 1864;
            while (true) {
                i5 ^= 1881;
                switch (i5) {
                    case 17:
                        i5 = !zBooleanValue3 ? 48736 : 48705;
                        break;
                    case 47384:
                        break;
                    case 47417:
                        boolean zBooleanValue4 = ((Boolean) C0182.n(33189, null, new Object[0])).booleanValue();
                        int i6 = 48767;
                        while (true) {
                            i6 ^= 48784;
                            switch (i6) {
                                case 14:
                                    break;
                                case 45:
                                    return false;
                                case 76:
                                    break;
                                case 239:
                                    i6 = zBooleanValue4 ? 48860 : 48829;
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
            boolean zBooleanValue5 = ((Boolean) C0182.n(56525, (Boolean) C0182.n(26387) /*=> Boolean.TRUE*/, new Object[]{C0182.n(64213, (ThreadLocal) C0182.n(77026) /*=> InitOrigin.z*/, new Object[0])})).booleanValue();
            int i7 = 48891;
            while (true) {
                i7 ^= 48908;
                switch (i7) {
                    case 22:
                        break;
                    case 53:
                        return false;
                    case 503:
                        i7 = !zBooleanValue5 ? 49635 : 48953;
                        break;
                    case 32495:
                        break;
                    default:
                        break;
                }
            }
            boolean zBooleanValue6 = ((Boolean) C0182.n(7173, null, new Object[]{N1.class})).booleanValue();
            int i8 = 49666;
            while (true) {
                i8 ^= 49683;
                switch (i8) {
                    case 17:
                        i8 = !zBooleanValue6 ? 49759 : 49728;
                        break;
                    case 50:
                        break;
                    case 76:
                        break;
                    case 83:
                        return false;
                    default:
                        break;
                }
            }
            boolean zBooleanValue7 = ((Boolean) C0182.n(7173, null, new Object[]{InitOrigin.class})).booleanValue();
            int i9 = 49790;
            while (true) {
                i9 ^= 49807;
                switch (i9) {
                    case 18:
                        break;
                    case 51:
                        return false;
                    case 84:
                        break;
                    case 241:
                        i9 = !zBooleanValue7 ? 49883 : 49852;
                        break;
                    default:
                        break;
                }
            }
            boolean zBooleanValue8 = ((Boolean) C0182.n(7173, null, new Object[]{FishCrypto.class})).booleanValue();
            int i10 = 49914;
            while (true) {
                i10 ^= 49931;
                switch (i10) {
                    case 497:
                        i10 = !zBooleanValue8 ? 50658 : 50627;
                        break;
                    case 1711:
                        break;
                    case 1736:
                        return false;
                    case 1769:
                        break;
                    default:
                        break;
                }
            }
            Looper looper = (Looper) C0182.n(3121, null, new Object[0]);
            int i11 = 50689;
            while (true) {
                i11 ^= 50706;
                switch (i11) {
                    case 19:
                        i11 = looper != null ? 50782 : 50751;
                        break;
                    case 45:
                        break;
                    case 50:
                        break;
                    case 76:
                        Looper looper2 = (Looper) C0149.n(51581, null, new Object[0]);
                        Looper looper3 = (Looper) C0182.n(3121, null, new Object[0]);
                        int i12 = 50813;
                        while (true) {
                            i12 ^= 50830;
                            switch (i12) {
                                case 18:
                                    break;
                                case 53:
                                    break;
                                case 243:
                                    i12 = looper2 == looper3 ? 51557 : 50875;
                                    break;
                                case 4075:
                                    int i13 = 51588;
                                    while (true) {
                                        i13 ^= 51605;
                                        switch (i13) {
                                            case 17:
                                                i13 = 51619;
                                                continue;
                                            case 54:
                                                return false;
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
            long jLongValue = j - ((Long) C0182.n(75677, null, new Object[0])).longValue();
            int i14 = 51712;
            while (true) {
                i14 ^= 51729;
                switch (i14) {
                    case 14:
                        break;
                    case 17:
                        i14 = jLongValue <= 0 ? 51805 : 51774;
                        break;
                    case 47:
                        break;
                    case 76:
                        return ((Boolean) C0182.n(86863, null, new Object[0])).booleanValue();
                    default:
                        break;
                }
            }
            try {
                C0149.n(7264, null, new Object[]{Long.valueOf(((Long) C0149.n(56518, null, new Object[]{Long.valueOf((-414) ^ ((long) C0100.f309)), Long.valueOf(((Long) C0149.n(44287, null, new Object[]{Long.valueOf((-403) ^ ((long) C0077.f286)), Long.valueOf(jLongValue / 1000000)})).longValue())})).longValue())});
                int i15 = 51836;
                while (true) {
                    i15 ^= 51853;
                    switch (i15) {
                        case 241:
                            i15 = 52518;
                            break;
                        case 1963:
                            break;
                    }
                }
            } catch (InterruptedException e2) {
                C0149.n(88498, (Thread) C0195.n(50425, null, new Object[0]), new Object[0]);
                throw e2;
            }
        }
    }

    public static void e(c cVar) throws Throwable {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (cVar == null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return;
                case 239:
                    ThreadLocal threadLocal = (ThreadLocal) C0182.n(47701) /*=> FishCrypto.e*/;
                    Object objN = C0182.n(64213, threadLocal, new Object[0]);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = objN == cVar ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                C0182.n(53944, threadLocal, new Object[0]);
                                break;
                            default:
                                break;
                        }
                    }
                    AtomicReference atomicReference = (AtomicReference) C0195.n(18109) /*=> FishCrypto.f*/;
                    while (true) {
                        boolean zBooleanValue = ((Boolean) C0195.n(80977, atomicReference, new Object[]{cVar, null})).booleanValue();
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
                                    int i4 = 48767;
                                    while (true) {
                                        i4 ^= 48784;
                                        switch (i4) {
                                            case 14:
                                                break;
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
                            return;
                        }
                        Object objN2 = C0195.n(90685, atomicReference, new Object[0]);
                        int i5 = 48891;
                        while (true) {
                            i5 ^= 48908;
                            switch (i5) {
                                case 22:
                                    break;
                                case 53:
                                    break;
                                case 503:
                                    i5 = objN2 != cVar ? 49635 : 48953;
                                    break;
                                case 32495:
                                    break;
                                default:
                                    break;
                            }
                            return;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static void endHostEntry(Throwable th) {
        ThreadLocal threadLocal = (ThreadLocal) C0182.n(47224) /*=> FishCrypto.g*/;
        b bVar = (b) C0182.n(64213, threadLocal, new Object[0]);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (bVar == null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    int iIntValue = ((Integer) C0149.n(85906, null, new Object[0])).intValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (iIntValue >= 0) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case 500:
                                C0195.n(38669, (PrintStream) C0195.n(72538) /*=> System.out*/, new Object[]{(Integer) C0149.n(54590, null, new Object[]{(String) C0149.n(78261, null, new Object[]{(String) C0149.n(21561) /*=> raw:new String(new byte[]{(byte) 70, (byte) 52, (byte) 56, (byte) 71, (byte) 75, (byte) 56, (byte) 105, */})})});
                                return;
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    boolean z = th instanceof InterruptedException;
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = z ? 48736 : 48705;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                C0182.n(39712, null, new Object[]{(c) C0182.n(57709, bVar)});
                                C0149.n(88498, (Thread) C0195.n(50425, null, new Object[0]), new Object[0]);
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                    }
                    b bVar2 = (b) C0149.n(67966, bVar);
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                                break;
                            case 45:
                                C0182.n(13329, threadLocal, new Object[]{bVar2});
                                return;
                            case 76:
                                C0182.n(53944, threadLocal, new Object[0]);
                                int i5 = 48891;
                                while (true) {
                                    i5 ^= 48908;
                                    switch (i5) {
                                        case 22:
                                            return;
                                        case 503:
                                            i5 = 48922;
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                if (bVar2 == null) {
                                    i4 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i4 = 48829;
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0023. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x018b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x01bb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x023a. Please report as an issue. */
    public static Object f(Object obj) {
        Object obj2;
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = obj != null ? 1709 : 1678;
                    break;
                case 204:
                    try {
                        Application application = (Application) C0149.n(10590, null, new Object[0]);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = application == null ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    Class cls = (Class) C0149.n(8011, (ClassLoader) C0149.n(92220, (Application) C0149.n(10590, null, new Object[0]), new Object[0]), new Object[]{(String) C0149.n(34115, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 126, Integer.valueOf(C0031.f187 ^ (-588)), 2603})});
                                    Object objN = C0149.n(96179, cls.getMethod((String) C0149.n(60368, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 168, Integer.valueOf(C0037.f193 ^ 811), 2808}), null), new Object[]{C0149.n(96179, cls.getMethod((String) C0149.n(61324, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 175, Integer.valueOf(C0005.f161 ^ 642), 1273}), null), new Object[]{null, null}), null});
                                    Object objN2 = C0149.n(78721, ((Class) C0149.n(32719, obj, new Object[0])).getField((String) C0149.n(60368, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 178, Integer.valueOf(C0038.f194 ^ 216), 670})), new Object[]{obj});
                                    int i3 = 48767;
                                    while (true) {
                                        i3 ^= 48784;
                                        switch (i3) {
                                            case 14:
                                                break;
                                            case 45:
                                                obj2 = null;
                                                break;
                                            case 76:
                                                boolean zBooleanValue = ((Boolean) C0195.n(5730, (String) C0149.n(67310, objN2, new Object[0]), new Object[0])).booleanValue();
                                                int i4 = 48891;
                                                while (true) {
                                                    i4 ^= 48908;
                                                    switch (i4) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            obj2 = null;
                                                            break;
                                                        case 503:
                                                            i4 = !zBooleanValue ? 49635 : 48953;
                                                            break;
                                                        case 32495:
                                                            boolean zBooleanValue2 = ((Boolean) C0149.n(84494, objN2, new Object[]{C0149.n(96179, ((Class) C0149.n(32719, objN, new Object[0])).getMethod((String) C0149.n(36390, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 185, Integer.valueOf(C0083.f292 ^ (-203)), 964}), null), new Object[]{objN, null})})).booleanValue();
                                                            int i5 = 49666;
                                                            while (true) {
                                                                i5 ^= 49683;
                                                                switch (i5) {
                                                                    case 17:
                                                                        i5 = zBooleanValue2 ? 49759 : 49728;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    case 76:
                                                                        obj2 = objN;
                                                                        break;
                                                                    case 83:
                                                                        obj2 = null;
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
                                                i3 = objN2 != null ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 500:
                                    int i6 = 1864;
                                    while (true) {
                                        i6 ^= 1881;
                                        switch (i6) {
                                            case 17:
                                                i6 = 48674;
                                                break;
                                            case 47483:
                                                obj2 = null;
                                                break;
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
                                    return null;
                                case 241:
                                    i7 = 49821;
                                    break;
                            }
                        }
                    }
                    break;
                case 239:
                    obj2 = null;
                    break;
                default:
                    break;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:301:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:463:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x0256. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:114:0x026d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:122:0x0284. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:130:0x029b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:138:0x02b2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:146:0x02c9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:156:0x02e9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:191:0x0369. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x01fa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:82:0x0211. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:90:0x0228. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x023f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    public static String g(String str) throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z = false;
        ((Integer) C0195.n(23628) /*=> N1.a*/).intValue();
        boolean zBooleanValue = ((Boolean) C0195.n(41159, null, new Object[]{str})).booleanValue();
        ?? r0 = (String) C0149.n(42779, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 191, Integer.valueOf(C0037.f193 ^ 814), 2278});
        int i11 = 1616;
        while (true) {
            i11 ^= 1633;
            switch (i11) {
                case 14:
                    break;
                case 49:
                    if (zBooleanValue) {
                        i11 = 1709;
                    }
                    break;
                case 204:
                    int i12 = 1740;
                    while (true) {
                        i12 ^= 1757;
                        switch (i12) {
                            case 17:
                                i12 = 1771;
                                break;
                            case 54:
                                return r0;
                        }
                    }
                    break;
                case 239:
                    boolean zBooleanValue2 = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
                    int i13 = 1864;
                    while (true) {
                        i13 ^= 1881;
                        switch (i13) {
                            case 17:
                                i13 = zBooleanValue2 ? 48736 : 48705;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                C0149.n(21141, null, new Object[0]);
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                    }
                    ?? r1 = (String) C0149.n(92089, str, new Object[0]);
                    boolean zBooleanValue3 = ((Boolean) C0149.n(48208, r1, new Object[]{(String) C0149.n(56487, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 193, 1, 1338})})).booleanValue();
                    int i14 = 48767;
                    while (true) {
                        i14 ^= 48784;
                        switch (i14) {
                            case 14:
                                break;
                            case 45:
                                return r1;
                            case 76:
                                boolean zBooleanValue4 = ((Boolean) C0149.n(48208, r1, new Object[]{(String) C0149.n(83930, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 194, Integer.valueOf(C0138.f347 ^ 268), 2432})})).booleanValue();
                                int i15 = 48891;
                                while (true) {
                                    i15 ^= 48908;
                                    switch (i15) {
                                        case 22:
                                            break;
                                        case 53:
                                            int iIntValue = ((Integer) C0149.n(89092, r1, new Object[0])).intValue();
                                            int i16 = 49790;
                                            while (true) {
                                                i16 ^= 49807;
                                                switch (i16) {
                                                    case 18:
                                                        break;
                                                    case 51:
                                                        i = 55432;
                                                        while (true) {
                                                            i ^= 55449;
                                                            switch (i) {
                                                                case 17:
                                                                    i = 55463;
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
                                                                case 62:
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
                                                            }
                                                        }
                                                        break;
                                                    case 84:
                                                        int iIntValue2 = ((Integer) C0149.n(89092, r1, new Object[0])).intValue();
                                                        int i17 = C0039.f195;
                                                        int i18 = 49914;
                                                        while (true) {
                                                            i18 ^= 49931;
                                                            switch (i18) {
                                                                case 497:
                                                                    i18 = iIntValue2 % (i17 ^ 794) != 0 ? 50658 : 50627;
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                                case 1736:
                                                                    int i19 = 0;
                                                                    while (true) {
                                                                        int iIntValue3 = ((Integer) C0149.n(89092, r1, new Object[0])).intValue();
                                                                        int i20 = 50813;
                                                                        while (true) {
                                                                            i20 ^= 50830;
                                                                            switch (i20) {
                                                                                case 18:
                                                                                    break;
                                                                                case 53:
                                                                                    z = true;
                                                                                    break;
                                                                                case 243:
                                                                                    i20 = i19 < iIntValue3 ? 51557 : 50875;
                                                                                    break;
                                                                                case 4075:
                                                                                    char cCharValue = ((Character) C0149.n(50218, r1, new Object[]{Integer.valueOf(i19)})).charValue();
                                                                                    int i21 = 51588;
                                                                                    while (true) {
                                                                                        i21 ^= 51605;
                                                                                        switch (i21) {
                                                                                            case 17:
                                                                                                i21 = cCharValue >= 'A' ? 51681 : 51650;
                                                                                                break;
                                                                                            case 54:
                                                                                                break;
                                                                                            case 87:
                                                                                                i3 = 51836;
                                                                                                while (true) {
                                                                                                    i3 ^= 51853;
                                                                                                    switch (i3) {
                                                                                                        case 241:
                                                                                                            i3 = cCharValue >= 'a' ? 52580 : 52549;
                                                                                                            break;
                                                                                                        case 1963:
                                                                                                            break;
                                                                                                        case 1992:
                                                                                                            i4 = 52735;
                                                                                                            while (true) {
                                                                                                                i4 ^= 52752;
                                                                                                                switch (i4) {
                                                                                                                    case 14:
                                                                                                                        break;
                                                                                                                    case 45:
                                                                                                                        i5 = 53634;
                                                                                                                        while (true) {
                                                                                                                            i5 ^= 53651;
                                                                                                                            switch (i5) {
                                                                                                                                case 17:
                                                                                                                                    i5 = cCharValue != '+' ? 53727 : 53696;
                                                                                                                                    break;
                                                                                                                                case 50:
                                                                                                                                    break;
                                                                                                                                case 76:
                                                                                                                                    i6 = 53758;
                                                                                                                                    while (true) {
                                                                                                                                        i6 ^= 53775;
                                                                                                                                        switch (i6) {
                                                                                                                                            case 1009:
                                                                                                                                                i6 = cCharValue != '/' ? 54502 : 54471;
                                                                                                                                                break;
                                                                                                                                            case 1703:
                                                                                                                                                break;
                                                                                                                                            case 1736:
                                                                                                                                                int i22 = i19 + 1;
                                                                                                                                                i2 = 55556;
                                                                                                                                                while (true) {
                                                                                                                                                    i2 ^= 55573;
                                                                                                                                                    switch (i2) {
                                                                                                                                                        case 17:
                                                                                                                                                            i2 = 55587;
                                                                                                                                                            break;
                                                                                                                                                        case 54:
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                i19 = i22;
                                                                                                                                                break;
                                                                                                                                            case 1769:
                                                                                                                                                i7 = 54533;
                                                                                                                                                while (true) {
                                                                                                                                                    i7 ^= 54550;
                                                                                                                                                    switch (i7) {
                                                                                                                                                        case 19:
                                                                                                                                                            i7 = cCharValue == '=' ? 54626 : 54595;
                                                                                                                                                            break;
                                                                                                                                                        case 50:
                                                                                                                                                            break;
                                                                                                                                                        case 85:
                                                                                                                                                            i = 55432;
                                                                                                                                                            while (true) {
                                                                                                                                                                i ^= 55449;
                                                                                                                                                                switch (i) {
                                                                                                                                                                    case 17:
                                                                                                                                                                        i = 55463;
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
                                                                                                                                                                    case 62:
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
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 116:
                                                                                                                                                            i8 = 54657;
                                                                                                                                                            while (true) {
                                                                                                                                                                i8 ^= 54674;
                                                                                                                                                                switch (i8) {
                                                                                                                                                                    case 19:
                                                                                                                                                                        i8 = 54688;
                                                                                                                                                                        break;
                                                                                                                                                                    case 50:
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                                int i23 = i19 + 1;
                                                                                                                                                                i2 = 55556;
                                                                                                                                                                while (true) {
                                                                                                                                                                    i2 ^= 55573;
                                                                                                                                                                    switch (i2) {
                                                                                                                                                                        case 17:
                                                                                                                                                                            i2 = 55587;
                                                                                                                                                                            break;
                                                                                                                                                                        case 54:
                                                                                                                                                                            break;
                                                                                                                                                                        default:
                                                                                                                                                                            break;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                i19 = i23;
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
                                                                                                                                case 83:
                                                                                                                                    int i24 = i19 + 1;
                                                                                                                                    i2 = 55556;
                                                                                                                                    while (true) {
                                                                                                                                        i2 ^= 55573;
                                                                                                                                        switch (i2) {
                                                                                                                                            case 17:
                                                                                                                                                i2 = 55587;
                                                                                                                                                break;
                                                                                                                                            case 54:
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    i19 = i24;
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 1007:
                                                                                                                        i4 = cCharValue >= '0' ? 53479 : 52797;
                                                                                                                        break;
                                                                                                                    case 7927:
                                                                                                                        i9 = 53510;
                                                                                                                        while (true) {
                                                                                                                            i9 ^= 53527;
                                                                                                                            switch (i9) {
                                                                                                                                case 17:
                                                                                                                                    i9 = cCharValue > '9' ? 53603 : 53572;
                                                                                                                                    break;
                                                                                                                                case 50:
                                                                                                                                    break;
                                                                                                                                case 83:
                                                                                                                                    int i25 = i19 + 1;
                                                                                                                                    i2 = 55556;
                                                                                                                                    while (true) {
                                                                                                                                        i2 ^= 55573;
                                                                                                                                        switch (i2) {
                                                                                                                                            case 17:
                                                                                                                                                i2 = 55587;
                                                                                                                                                break;
                                                                                                                                            case 54:
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    i19 = i25;
                                                                                                                                    break;
                                                                                                                                case 116:
                                                                                                                                    i5 = 53634;
                                                                                                                                    while (true) {
                                                                                                                                        i5 ^= 53651;
                                                                                                                                        switch (i5) {
                                                                                                                                            case 17:
                                                                                                                                                if (cCharValue != '+') {
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 50:
                                                                                                                                                break;
                                                                                                                                            case 76:
                                                                                                                                                i6 = 53758;
                                                                                                                                                while (true) {
                                                                                                                                                    i6 ^= 53775;
                                                                                                                                                    switch (i6) {
                                                                                                                                                        case 1009:
                                                                                                                                                            if (cCharValue != '/') {
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 1703:
                                                                                                                                                            break;
                                                                                                                                                        case 1736:
                                                                                                                                                            int i26 = i19 + 1;
                                                                                                                                                            i2 = 55556;
                                                                                                                                                            while (true) {
                                                                                                                                                                i2 ^= 55573;
                                                                                                                                                                switch (i2) {
                                                                                                                                                                    case 17:
                                                                                                                                                                        i2 = 55587;
                                                                                                                                                                        break;
                                                                                                                                                                    case 54:
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            i19 = i26;
                                                                                                                                                            break;
                                                                                                                                                        case 1769:
                                                                                                                                                            i7 = 54533;
                                                                                                                                                            while (true) {
                                                                                                                                                                i7 ^= 54550;
                                                                                                                                                                switch (i7) {
                                                                                                                                                                    case 19:
                                                                                                                                                                        if (cCharValue == '=') {
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 50:
                                                                                                                                                                        break;
                                                                                                                                                                    case 85:
                                                                                                                                                                        i = 55432;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i ^= 55449;
                                                                                                                                                                            switch (i) {
                                                                                                                                                                                case 17:
                                                                                                                                                                                    i = 55463;
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
                                                                                                                                                                                case 62:
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
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 116:
                                                                                                                                                                        i8 = 54657;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i8 ^= 54674;
                                                                                                                                                                            switch (i8) {
                                                                                                                                                                                case 19:
                                                                                                                                                                                    i8 = 54688;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 50:
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                            int i27 = i19 + 1;
                                                                                                                                                                            i2 = 55556;
                                                                                                                                                                            while (true) {
                                                                                                                                                                                i2 ^= 55573;
                                                                                                                                                                                switch (i2) {
                                                                                                                                                                                    case 17:
                                                                                                                                                                                        i2 = 55587;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 54:
                                                                                                                                                                                        break;
                                                                                                                                                                                    default:
                                                                                                                                                                                        break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            i19 = i27;
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
                                                                                                                                            case 83:
                                                                                                                                                int i28 = i19 + 1;
                                                                                                                                                i2 = 55556;
                                                                                                                                                while (true) {
                                                                                                                                                    i2 ^= 55573;
                                                                                                                                                    switch (i2) {
                                                                                                                                                        case 17:
                                                                                                                                                            i2 = 55587;
                                                                                                                                                            break;
                                                                                                                                                        case 54:
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                i19 = i28;
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
                                                                                                        case 2025:
                                                                                                            i10 = 52611;
                                                                                                            while (true) {
                                                                                                                i10 ^= 52628;
                                                                                                                switch (i10) {
                                                                                                                    case 23:
                                                                                                                        i10 = cCharValue > 'z' ? 52704 : 52673;
                                                                                                                        break;
                                                                                                                    case 54:
                                                                                                                        break;
                                                                                                                    case 85:
                                                                                                                        int i29 = i19 + 1;
                                                                                                                        i2 = 55556;
                                                                                                                        while (true) {
                                                                                                                            i2 ^= 55573;
                                                                                                                            switch (i2) {
                                                                                                                                case 17:
                                                                                                                                    i2 = 55587;
                                                                                                                                    break;
                                                                                                                                case 54:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i19 = i29;
                                                                                                                        break;
                                                                                                                    case 116:
                                                                                                                        i4 = 52735;
                                                                                                                        while (true) {
                                                                                                                            i4 ^= 52752;
                                                                                                                            switch (i4) {
                                                                                                                                case 14:
                                                                                                                                    break;
                                                                                                                                case 45:
                                                                                                                                    i5 = 53634;
                                                                                                                                    while (true) {
                                                                                                                                        i5 ^= 53651;
                                                                                                                                        switch (i5) {
                                                                                                                                            case 17:
                                                                                                                                                if (cCharValue != '+') {
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 50:
                                                                                                                                                break;
                                                                                                                                            case 76:
                                                                                                                                                i6 = 53758;
                                                                                                                                                while (true) {
                                                                                                                                                    i6 ^= 53775;
                                                                                                                                                    switch (i6) {
                                                                                                                                                        case 1009:
                                                                                                                                                            if (cCharValue != '/') {
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 1703:
                                                                                                                                                            break;
                                                                                                                                                        case 1736:
                                                                                                                                                            int i210 = i19 + 1;
                                                                                                                                                            i2 = 55556;
                                                                                                                                                            while (true) {
                                                                                                                                                                i2 ^= 55573;
                                                                                                                                                                switch (i2) {
                                                                                                                                                                    case 17:
                                                                                                                                                                        i2 = 55587;
                                                                                                                                                                        break;
                                                                                                                                                                    case 54:
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            i19 = i210;
                                                                                                                                                            break;
                                                                                                                                                        case 1769:
                                                                                                                                                            i7 = 54533;
                                                                                                                                                            while (true) {
                                                                                                                                                                i7 ^= 54550;
                                                                                                                                                                switch (i7) {
                                                                                                                                                                    case 19:
                                                                                                                                                                        if (cCharValue == '=') {
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 50:
                                                                                                                                                                        break;
                                                                                                                                                                    case 85:
                                                                                                                                                                        i = 55432;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i ^= 55449;
                                                                                                                                                                            switch (i) {
                                                                                                                                                                                case 17:
                                                                                                                                                                                    i = 55463;
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
                                                                                                                                                                                case 62:
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
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 116:
                                                                                                                                                                        i8 = 54657;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i8 ^= 54674;
                                                                                                                                                                            switch (i8) {
                                                                                                                                                                                case 19:
                                                                                                                                                                                    i8 = 54688;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 50:
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                            int i211 = i19 + 1;
                                                                                                                                                                            i2 = 55556;
                                                                                                                                                                            while (true) {
                                                                                                                                                                                i2 ^= 55573;
                                                                                                                                                                                switch (i2) {
                                                                                                                                                                                    case 17:
                                                                                                                                                                                        i2 = 55587;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 54:
                                                                                                                                                                                        break;
                                                                                                                                                                                    default:
                                                                                                                                                                                        break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            i19 = i211;
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
                                                                                                                                            case 83:
                                                                                                                                                int i212 = i19 + 1;
                                                                                                                                                i2 = 55556;
                                                                                                                                                while (true) {
                                                                                                                                                    i2 ^= 55573;
                                                                                                                                                    switch (i2) {
                                                                                                                                                        case 17:
                                                                                                                                                            i2 = 55587;
                                                                                                                                                            break;
                                                                                                                                                        case 54:
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                i19 = i212;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 1007:
                                                                                                                                    if (cCharValue >= '0') {
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 7927:
                                                                                                                                    i9 = 53510;
                                                                                                                                    while (true) {
                                                                                                                                        i9 ^= 53527;
                                                                                                                                        switch (i9) {
                                                                                                                                            case 17:
                                                                                                                                                if (cCharValue > '9') {
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 50:
                                                                                                                                                break;
                                                                                                                                            case 83:
                                                                                                                                                int i213 = i19 + 1;
                                                                                                                                                i2 = 55556;
                                                                                                                                                while (true) {
                                                                                                                                                    i2 ^= 55573;
                                                                                                                                                    switch (i2) {
                                                                                                                                                        case 17:
                                                                                                                                                            i2 = 55587;
                                                                                                                                                            break;
                                                                                                                                                        case 54:
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                i19 = i213;
                                                                                                                                                break;
                                                                                                                                            case 116:
                                                                                                                                                i5 = 53634;
                                                                                                                                                while (true) {
                                                                                                                                                    i5 ^= 53651;
                                                                                                                                                    switch (i5) {
                                                                                                                                                        case 17:
                                                                                                                                                            if (cCharValue != '+') {
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 50:
                                                                                                                                                            break;
                                                                                                                                                        case 76:
                                                                                                                                                            i6 = 53758;
                                                                                                                                                            while (true) {
                                                                                                                                                                i6 ^= 53775;
                                                                                                                                                                switch (i6) {
                                                                                                                                                                    case 1009:
                                                                                                                                                                        if (cCharValue != '/') {
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 1703:
                                                                                                                                                                        break;
                                                                                                                                                                    case 1736:
                                                                                                                                                                        int i214 = i19 + 1;
                                                                                                                                                                        i2 = 55556;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i2 ^= 55573;
                                                                                                                                                                            switch (i2) {
                                                                                                                                                                                case 17:
                                                                                                                                                                                    i2 = 55587;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 54:
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        i19 = i214;
                                                                                                                                                                        break;
                                                                                                                                                                    case 1769:
                                                                                                                                                                        i7 = 54533;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i7 ^= 54550;
                                                                                                                                                                            switch (i7) {
                                                                                                                                                                                case 19:
                                                                                                                                                                                    if (cCharValue == '=') {
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                case 50:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 85:
                                                                                                                                                                                    i = 55432;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i ^= 55449;
                                                                                                                                                                                        switch (i) {
                                                                                                                                                                                            case 17:
                                                                                                                                                                                                i = 55463;
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
                                                                                                                                                                                            case 62:
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
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                case 116:
                                                                                                                                                                                    i8 = 54657;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i8 ^= 54674;
                                                                                                                                                                                        switch (i8) {
                                                                                                                                                                                            case 19:
                                                                                                                                                                                                i8 = 54688;
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 50:
                                                                                                                                                                                                break;
                                                                                                                                                                                            default:
                                                                                                                                                                                                break;
                                                                                                                                                                                        }
                                                                                                                                                                                        int i215 = i19 + 1;
                                                                                                                                                                                        i2 = 55556;
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            i2 ^= 55573;
                                                                                                                                                                                            switch (i2) {
                                                                                                                                                                                                case 17:
                                                                                                                                                                                                    i2 = 55587;
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 54:
                                                                                                                                                                                                    break;
                                                                                                                                                                                                default:
                                                                                                                                                                                                    break;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        i19 = i215;
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
                                                                                                                                                        case 83:
                                                                                                                                                            int i216 = i19 + 1;
                                                                                                                                                            i2 = 55556;
                                                                                                                                                            while (true) {
                                                                                                                                                                i2 ^= 55573;
                                                                                                                                                                switch (i2) {
                                                                                                                                                                    case 17:
                                                                                                                                                                        i2 = 55587;
                                                                                                                                                                        break;
                                                                                                                                                                    case 54:
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            i19 = i216;
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
                                                                                            case 116:
                                                                                                int i30 = 51712;
                                                                                                while (true) {
                                                                                                    i30 ^= 51729;
                                                                                                    switch (i30) {
                                                                                                        case 14:
                                                                                                            break;
                                                                                                        case 17:
                                                                                                            i30 = cCharValue > 'Z' ? 51805 : 51774;
                                                                                                            break;
                                                                                                        case 47:
                                                                                                            int i217 = i19 + 1;
                                                                                                            i2 = 55556;
                                                                                                            while (true) {
                                                                                                                i2 ^= 55573;
                                                                                                                switch (i2) {
                                                                                                                    case 17:
                                                                                                                        i2 = 55587;
                                                                                                                        break;
                                                                                                                    case 54:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            i19 = i217;
                                                                                                            break;
                                                                                                        case 76:
                                                                                                            i3 = 51836;
                                                                                                            while (true) {
                                                                                                                i3 ^= 51853;
                                                                                                                switch (i3) {
                                                                                                                    case 241:
                                                                                                                        if (cCharValue >= 'a') {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 1963:
                                                                                                                        break;
                                                                                                                    case 1992:
                                                                                                                        i4 = 52735;
                                                                                                                        while (true) {
                                                                                                                            i4 ^= 52752;
                                                                                                                            switch (i4) {
                                                                                                                                case 14:
                                                                                                                                    break;
                                                                                                                                case 45:
                                                                                                                                    i5 = 53634;
                                                                                                                                    while (true) {
                                                                                                                                        i5 ^= 53651;
                                                                                                                                        switch (i5) {
                                                                                                                                            case 17:
                                                                                                                                                if (cCharValue != '+') {
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 50:
                                                                                                                                                break;
                                                                                                                                            case 76:
                                                                                                                                                i6 = 53758;
                                                                                                                                                while (true) {
                                                                                                                                                    i6 ^= 53775;
                                                                                                                                                    switch (i6) {
                                                                                                                                                        case 1009:
                                                                                                                                                            if (cCharValue != '/') {
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 1703:
                                                                                                                                                            break;
                                                                                                                                                        case 1736:
                                                                                                                                                            int i218 = i19 + 1;
                                                                                                                                                            i2 = 55556;
                                                                                                                                                            while (true) {
                                                                                                                                                                i2 ^= 55573;
                                                                                                                                                                switch (i2) {
                                                                                                                                                                    case 17:
                                                                                                                                                                        i2 = 55587;
                                                                                                                                                                        break;
                                                                                                                                                                    case 54:
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            i19 = i218;
                                                                                                                                                            break;
                                                                                                                                                        case 1769:
                                                                                                                                                            i7 = 54533;
                                                                                                                                                            while (true) {
                                                                                                                                                                i7 ^= 54550;
                                                                                                                                                                switch (i7) {
                                                                                                                                                                    case 19:
                                                                                                                                                                        if (cCharValue == '=') {
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 50:
                                                                                                                                                                        break;
                                                                                                                                                                    case 85:
                                                                                                                                                                        i = 55432;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i ^= 55449;
                                                                                                                                                                            switch (i) {
                                                                                                                                                                                case 17:
                                                                                                                                                                                    i = 55463;
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
                                                                                                                                                                                case 62:
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
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 116:
                                                                                                                                                                        i8 = 54657;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i8 ^= 54674;
                                                                                                                                                                            switch (i8) {
                                                                                                                                                                                case 19:
                                                                                                                                                                                    i8 = 54688;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 50:
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                            int i219 = i19 + 1;
                                                                                                                                                                            i2 = 55556;
                                                                                                                                                                            while (true) {
                                                                                                                                                                                i2 ^= 55573;
                                                                                                                                                                                switch (i2) {
                                                                                                                                                                                    case 17:
                                                                                                                                                                                        i2 = 55587;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 54:
                                                                                                                                                                                        break;
                                                                                                                                                                                    default:
                                                                                                                                                                                        break;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            i19 = i219;
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
                                                                                                                                            case 83:
                                                                                                                                                int i2110 = i19 + 1;
                                                                                                                                                i2 = 55556;
                                                                                                                                                while (true) {
                                                                                                                                                    i2 ^= 55573;
                                                                                                                                                    switch (i2) {
                                                                                                                                                        case 17:
                                                                                                                                                            i2 = 55587;
                                                                                                                                                            break;
                                                                                                                                                        case 54:
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                i19 = i2110;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 1007:
                                                                                                                                    if (cCharValue >= '0') {
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 7927:
                                                                                                                                    i9 = 53510;
                                                                                                                                    while (true) {
                                                                                                                                        i9 ^= 53527;
                                                                                                                                        switch (i9) {
                                                                                                                                            case 17:
                                                                                                                                                if (cCharValue > '9') {
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 50:
                                                                                                                                                break;
                                                                                                                                            case 83:
                                                                                                                                                int i2111 = i19 + 1;
                                                                                                                                                i2 = 55556;
                                                                                                                                                while (true) {
                                                                                                                                                    i2 ^= 55573;
                                                                                                                                                    switch (i2) {
                                                                                                                                                        case 17:
                                                                                                                                                            i2 = 55587;
                                                                                                                                                            break;
                                                                                                                                                        case 54:
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                i19 = i2111;
                                                                                                                                                break;
                                                                                                                                            case 116:
                                                                                                                                                i5 = 53634;
                                                                                                                                                while (true) {
                                                                                                                                                    i5 ^= 53651;
                                                                                                                                                    switch (i5) {
                                                                                                                                                        case 17:
                                                                                                                                                            if (cCharValue != '+') {
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 50:
                                                                                                                                                            break;
                                                                                                                                                        case 76:
                                                                                                                                                            i6 = 53758;
                                                                                                                                                            while (true) {
                                                                                                                                                                i6 ^= 53775;
                                                                                                                                                                switch (i6) {
                                                                                                                                                                    case 1009:
                                                                                                                                                                        if (cCharValue != '/') {
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 1703:
                                                                                                                                                                        break;
                                                                                                                                                                    case 1736:
                                                                                                                                                                        int i2112 = i19 + 1;
                                                                                                                                                                        i2 = 55556;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i2 ^= 55573;
                                                                                                                                                                            switch (i2) {
                                                                                                                                                                                case 17:
                                                                                                                                                                                    i2 = 55587;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 54:
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        i19 = i2112;
                                                                                                                                                                        break;
                                                                                                                                                                    case 1769:
                                                                                                                                                                        i7 = 54533;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i7 ^= 54550;
                                                                                                                                                                            switch (i7) {
                                                                                                                                                                                case 19:
                                                                                                                                                                                    if (cCharValue == '=') {
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                case 50:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 85:
                                                                                                                                                                                    i = 55432;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i ^= 55449;
                                                                                                                                                                                        switch (i) {
                                                                                                                                                                                            case 17:
                                                                                                                                                                                                i = 55463;
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
                                                                                                                                                                                            case 62:
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
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                case 116:
                                                                                                                                                                                    i8 = 54657;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i8 ^= 54674;
                                                                                                                                                                                        switch (i8) {
                                                                                                                                                                                            case 19:
                                                                                                                                                                                                i8 = 54688;
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 50:
                                                                                                                                                                                                break;
                                                                                                                                                                                            default:
                                                                                                                                                                                                break;
                                                                                                                                                                                        }
                                                                                                                                                                                        int i2113 = i19 + 1;
                                                                                                                                                                                        i2 = 55556;
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            i2 ^= 55573;
                                                                                                                                                                                            switch (i2) {
                                                                                                                                                                                                case 17:
                                                                                                                                                                                                    i2 = 55587;
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 54:
                                                                                                                                                                                                    break;
                                                                                                                                                                                                default:
                                                                                                                                                                                                    break;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        i19 = i2113;
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
                                                                                                                                                        case 83:
                                                                                                                                                            int i2114 = i19 + 1;
                                                                                                                                                            i2 = 55556;
                                                                                                                                                            while (true) {
                                                                                                                                                                i2 ^= 55573;
                                                                                                                                                                switch (i2) {
                                                                                                                                                                    case 17:
                                                                                                                                                                        i2 = 55587;
                                                                                                                                                                        break;
                                                                                                                                                                    case 54:
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            i19 = i2114;
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
                                                                                                                    case 2025:
                                                                                                                        i10 = 52611;
                                                                                                                        while (true) {
                                                                                                                            i10 ^= 52628;
                                                                                                                            switch (i10) {
                                                                                                                                case 23:
                                                                                                                                    if (cCharValue > 'z') {
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 54:
                                                                                                                                    break;
                                                                                                                                case 85:
                                                                                                                                    int i2115 = i19 + 1;
                                                                                                                                    i2 = 55556;
                                                                                                                                    while (true) {
                                                                                                                                        i2 ^= 55573;
                                                                                                                                        switch (i2) {
                                                                                                                                            case 17:
                                                                                                                                                i2 = 55587;
                                                                                                                                                break;
                                                                                                                                            case 54:
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    i19 = i2115;
                                                                                                                                    break;
                                                                                                                                case 116:
                                                                                                                                    i4 = 52735;
                                                                                                                                    while (true) {
                                                                                                                                        i4 ^= 52752;
                                                                                                                                        switch (i4) {
                                                                                                                                            case 14:
                                                                                                                                                break;
                                                                                                                                            case 45:
                                                                                                                                                i5 = 53634;
                                                                                                                                                while (true) {
                                                                                                                                                    i5 ^= 53651;
                                                                                                                                                    switch (i5) {
                                                                                                                                                        case 17:
                                                                                                                                                            if (cCharValue != '+') {
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 50:
                                                                                                                                                            break;
                                                                                                                                                        case 76:
                                                                                                                                                            i6 = 53758;
                                                                                                                                                            while (true) {
                                                                                                                                                                i6 ^= 53775;
                                                                                                                                                                switch (i6) {
                                                                                                                                                                    case 1009:
                                                                                                                                                                        if (cCharValue != '/') {
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 1703:
                                                                                                                                                                        break;
                                                                                                                                                                    case 1736:
                                                                                                                                                                        int i2116 = i19 + 1;
                                                                                                                                                                        i2 = 55556;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i2 ^= 55573;
                                                                                                                                                                            switch (i2) {
                                                                                                                                                                                case 17:
                                                                                                                                                                                    i2 = 55587;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 54:
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        i19 = i2116;
                                                                                                                                                                        break;
                                                                                                                                                                    case 1769:
                                                                                                                                                                        i7 = 54533;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i7 ^= 54550;
                                                                                                                                                                            switch (i7) {
                                                                                                                                                                                case 19:
                                                                                                                                                                                    if (cCharValue == '=') {
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                case 50:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 85:
                                                                                                                                                                                    i = 55432;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i ^= 55449;
                                                                                                                                                                                        switch (i) {
                                                                                                                                                                                            case 17:
                                                                                                                                                                                                i = 55463;
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
                                                                                                                                                                                            case 62:
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
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                case 116:
                                                                                                                                                                                    i8 = 54657;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i8 ^= 54674;
                                                                                                                                                                                        switch (i8) {
                                                                                                                                                                                            case 19:
                                                                                                                                                                                                i8 = 54688;
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 50:
                                                                                                                                                                                                break;
                                                                                                                                                                                            default:
                                                                                                                                                                                                break;
                                                                                                                                                                                        }
                                                                                                                                                                                        int i2117 = i19 + 1;
                                                                                                                                                                                        i2 = 55556;
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            i2 ^= 55573;
                                                                                                                                                                                            switch (i2) {
                                                                                                                                                                                                case 17:
                                                                                                                                                                                                    i2 = 55587;
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 54:
                                                                                                                                                                                                    break;
                                                                                                                                                                                                default:
                                                                                                                                                                                                    break;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        i19 = i2117;
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
                                                                                                                                                        case 83:
                                                                                                                                                            int i2118 = i19 + 1;
                                                                                                                                                            i2 = 55556;
                                                                                                                                                            while (true) {
                                                                                                                                                                i2 ^= 55573;
                                                                                                                                                                switch (i2) {
                                                                                                                                                                    case 17:
                                                                                                                                                                        i2 = 55587;
                                                                                                                                                                        break;
                                                                                                                                                                    case 54:
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            i19 = i2118;
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 1007:
                                                                                                                                                if (cCharValue >= '0') {
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case 7927:
                                                                                                                                                i9 = 53510;
                                                                                                                                                while (true) {
                                                                                                                                                    i9 ^= 53527;
                                                                                                                                                    switch (i9) {
                                                                                                                                                        case 17:
                                                                                                                                                            if (cCharValue > '9') {
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 50:
                                                                                                                                                            break;
                                                                                                                                                        case 83:
                                                                                                                                                            int i2119 = i19 + 1;
                                                                                                                                                            i2 = 55556;
                                                                                                                                                            while (true) {
                                                                                                                                                                i2 ^= 55573;
                                                                                                                                                                switch (i2) {
                                                                                                                                                                    case 17:
                                                                                                                                                                        i2 = 55587;
                                                                                                                                                                        break;
                                                                                                                                                                    case 54:
                                                                                                                                                                        break;
                                                                                                                                                                    default:
                                                                                                                                                                        break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            i19 = i2119;
                                                                                                                                                            break;
                                                                                                                                                        case 116:
                                                                                                                                                            i5 = 53634;
                                                                                                                                                            while (true) {
                                                                                                                                                                i5 ^= 53651;
                                                                                                                                                                switch (i5) {
                                                                                                                                                                    case 17:
                                                                                                                                                                        if (cCharValue != '+') {
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    case 50:
                                                                                                                                                                        break;
                                                                                                                                                                    case 76:
                                                                                                                                                                        i6 = 53758;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i6 ^= 53775;
                                                                                                                                                                            switch (i6) {
                                                                                                                                                                                case 1009:
                                                                                                                                                                                    if (cCharValue != '/') {
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                case 1703:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 1736:
                                                                                                                                                                                    int i21110 = i19 + 1;
                                                                                                                                                                                    i2 = 55556;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i2 ^= 55573;
                                                                                                                                                                                        switch (i2) {
                                                                                                                                                                                            case 17:
                                                                                                                                                                                                i2 = 55587;
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 54:
                                                                                                                                                                                                break;
                                                                                                                                                                                            default:
                                                                                                                                                                                                break;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    i19 = i21110;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 1769:
                                                                                                                                                                                    i7 = 54533;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i7 ^= 54550;
                                                                                                                                                                                        switch (i7) {
                                                                                                                                                                                            case 19:
                                                                                                                                                                                                if (cCharValue == '=') {
                                                                                                                                                                                                }
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 50:
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 85:
                                                                                                                                                                                                i = 55432;
                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                    i ^= 55449;
                                                                                                                                                                                                    switch (i) {
                                                                                                                                                                                                        case 17:
                                                                                                                                                                                                            i = 55463;
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
                                                                                                                                                                                                        case 62:
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
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 116:
                                                                                                                                                                                                i8 = 54657;
                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                    i8 ^= 54674;
                                                                                                                                                                                                    switch (i8) {
                                                                                                                                                                                                        case 19:
                                                                                                                                                                                                            i8 = 54688;
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        case 50:
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        default:
                                                                                                                                                                                                            break;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    int i21111 = i19 + 1;
                                                                                                                                                                                                    i2 = 55556;
                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                        i2 ^= 55573;
                                                                                                                                                                                                        switch (i2) {
                                                                                                                                                                                                            case 17:
                                                                                                                                                                                                                i2 = 55587;
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            case 54:
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            default:
                                                                                                                                                                                                                break;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    i19 = i21111;
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
                                                                                                                                                                    case 83:
                                                                                                                                                                        int i21112 = i19 + 1;
                                                                                                                                                                        i2 = 55556;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i2 ^= 55573;
                                                                                                                                                                            switch (i2) {
                                                                                                                                                                                case 17:
                                                                                                                                                                                    i2 = 55587;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 54:
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        i19 = i21112;
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
                                                                    }
                                                                    break;
                                                                case 1769:
                                                                    int i31 = 50689;
                                                                    while (true) {
                                                                        i31 ^= 50706;
                                                                        switch (i31) {
                                                                            case 19:
                                                                                i31 = 50720;
                                                                                continue;
                                                                            case 50:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i = 55432;
                                                                        while (true) {
                                                                            i ^= 55449;
                                                                            switch (i) {
                                                                                case 17:
                                                                                    i = 55463;
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
                                                                                case 62:
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
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 241:
                                                        i16 = iIntValue >= 24 ? 49883 : 49852;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                boolean zBooleanValue5 = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
                                                int i32 = 55680;
                                                while (true) {
                                                    i32 ^= 55697;
                                                    switch (i32) {
                                                        case 17:
                                                            if (!zBooleanValue5) {
                                                                i32 = 56424;
                                                            }
                                                            break;
                                                        case 1467:
                                                            break;
                                                        case 1496:
                                                            try {
                                                                byte[] bArr = (byte[]) C0149.n(50379, null, new Object[]{r1});
                                                                int i33 = 1507503;
                                                                while (true) {
                                                                    i33 ^= 1507520;
                                                                    switch (i33) {
                                                                        case 14:
                                                                            break;
                                                                        case 45:
                                                                            String str2 = new String(bArr, (String) C0149.n(63176, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 198, Integer.valueOf(C0054.f210 ^ (-656)), 3121}));
                                                                            int i34 = 1508526;
                                                                            while (true) {
                                                                                i34 ^= 1508543;
                                                                                switch (i34) {
                                                                                    case 17:
                                                                                        i34 = 1508557;
                                                                                        break;
                                                                                    case 114:
                                                                                        r1 = str2;
                                                                                        r0 = i34;
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 111:
                                                                            if (bArr == null) {
                                                                                i33 = 1507596;
                                                                            }
                                                                            break;
                                                                        case 460:
                                                                            int i35 = 1507627;
                                                                            while (true) {
                                                                                i35 ^= 1507644;
                                                                                r0 = r0;
                                                                                r1 = r1;
                                                                                switch (i35) {
                                                                                    case 23:
                                                                                        i35 = z ? 1507720 : 1507689;
                                                                                        break;
                                                                                    case 85:
                                                                                        break;
                                                                                    case 118:
                                                                                        break;
                                                                                    case 180:
                                                                                        int i36 = 1507751;
                                                                                        while (true) {
                                                                                            i36 ^= 1507768;
                                                                                            switch (i36) {
                                                                                                case 31:
                                                                                                    i36 = 1508433;
                                                                                                    break;
                                                                                                case 1513:
                                                                                                    r1 = r0;
                                                                                                    r0 = r0;
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
                                                                            continue;
                                                                    }
                                                                    i33 = 1507565;
                                                                }
                                                                return r1;
                                                            } catch (Throwable th) {
                                                                int i37 = 1508650;
                                                                while (true) {
                                                                    i37 ^= 1508667;
                                                                    switch (i37) {
                                                                        case 17:
                                                                            if (z) {
                                                                                i37 = 1509394;
                                                                            }
                                                                            break;
                                                                        case 83:
                                                                            return r1;
                                                                        case 114:
                                                                            break;
                                                                        case 3369:
                                                                            int i38 = 1509425;
                                                                            while (true) {
                                                                                i38 ^= 1509442;
                                                                                switch (i38) {
                                                                                    case 18:
                                                                                        return r0;
                                                                                    case 115:
                                                                                        i38 = 1509456;
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                    i37 = 1508712;
                                                                }
                                                            }
                                                            break;
                                                        case 1529:
                                                            int i39 = 56455;
                                                            while (true) {
                                                                i39 ^= 56472;
                                                                switch (i39) {
                                                                    case 31:
                                                                        if (z) {
                                                                            i39 = 56548;
                                                                        }
                                                                        break;
                                                                    case 62:
                                                                        break;
                                                                    case 93:
                                                                        return r1;
                                                                    case 124:
                                                                        int i40 = 56579;
                                                                        while (true) {
                                                                            i40 ^= 56596;
                                                                            switch (i40) {
                                                                                case 23:
                                                                                    i40 = 56610;
                                                                                    break;
                                                                                case 54:
                                                                                    return r0;
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                                i39 = 56517;
                                                            }
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i32 = 56393;
                                                }
                                            }
                                            break;
                                        case 503:
                                            if (zBooleanValue4) {
                                                i15 = 49635;
                                            }
                                            break;
                                        case 32495:
                                            int i41 = 49666;
                                            while (true) {
                                                i41 ^= 49683;
                                                switch (i41) {
                                                    case 17:
                                                        i41 = 49697;
                                                        break;
                                                    case 50:
                                                        return r1;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i15 = 48953;
                                }
                                break;
                            case 239:
                                if (!zBooleanValue3) {
                                    i14 = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i14 = 48829;
                    }
                    break;
                default:
                    continue;
            }
            i11 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0033. Please report as an issue. */
    public static String h(Throwable th) {
        String str;
        String str2 = (String) C0149.n(60672, th, new Object[0]);
        StringBuilder sb = new StringBuilder();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = str2 != null ? 1709 : 1678;
                    break;
                case 204:
                    int iIntValue = ((Integer) C0149.n(89092, str2, new Object[0])).intValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (iIntValue == 0) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                str = (String) C0198.n(26710, (String) C0149.n(74485, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 203, Integer.valueOf(C0065.f274 ^ 17), 2925}), new Object[]{str2});
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 239:
                                            i3 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 500:
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = 48674;
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
                    break;
            }
            return (String) C0198.n(89992, sb, new Object[0]);
        }
        str = (String) C0195.n(43185) /*=> raw:new String(new byte[0])*/;
        return (String) C0198.n(89992, sb, new Object[0]);
    }

    public static boolean hostAllowed() {
        boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
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
                    return false;
                case 239:
                    try {
                        return ((Boolean) C0198.n(64062, null, new Object[0])).booleanValue();
                    } catch (Throwable th) {
                        return false;
                    }
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:1168:0x0bf2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1169:0x0bf8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1170:0x0bfc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1171:0x0c65 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1172:0x0bf8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1173:0x0bf4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1175:0x0bea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1178:0x0c13 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1179:0x0c17 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1180:0x0c1d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1181:0x0c65 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1182:0x0c19 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1183:0x0c13 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1185:0x0c0b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1188:0x0c5e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1189:0x0c61 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1191:0x0c56 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1193:0x0b89 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1194:0x0c70 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1195:0x0c76 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1196:0x0c7a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1197:0x0c76 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1198:0x0c72 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1200:0x0c68 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1203:0x0b89 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1204:0x0c96 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1205:0x0c9c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1206:0x0ca0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1207:0x0c9c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1208:0x0c98 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1210:0x0c8e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1233:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1235:? A[LOOP:78: B:214:0x0490->B:1235:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1236:0x04b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1237:0x04b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1238:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1239:0x04b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1240:0x04b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1242:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1245:0x04c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1246:0x04f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1248:0x04be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1250:0x04df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1251:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1252:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1253:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1255:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1258:0x04f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1260:0x04ec A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:813:0x04bb A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:228:0x04db. Please report as an issue. */
    public static String hostEntry(Object obj, String str) throws Throwable {
        boolean z;
        boolean z2;
        c cVar;
        c cVar2;
        long jLongValue;
        boolean z3;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        boolean zBooleanValue;
        int i3;
        boolean zBooleanValue2;
        int i4;
        String str5;
        int i5;
        String str6;
        String str7;
        boolean z4;
        boolean z5;
        boolean zBooleanValue3;
        int i6;
        Object objN;
        int i7;
        int i8;
        int i9;
        c cVar3;
        b bVar = (b) C0182.n(64213, (ThreadLocal) C0182.n(47224) /*=> FishCrypto.g*/, new Object[0]);
        int i10 = 1616;
        while (true) {
            i10 ^= 1633;
            switch (i10) {
                case 14:
                    break;
                case 49:
                    i10 = bVar != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zBooleanValue4 = ((Boolean) C0182.n(74520, bVar)).booleanValue();
                    int i11 = 1740;
                    while (true) {
                        i11 ^= 1757;
                        switch (i11) {
                            case 17:
                                i11 = zBooleanValue4 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                z = false;
                                break;
                            case 500:
                                boolean zBooleanValue5 = ((Boolean) C0182.n(55567, str, new Object[]{(String) C0182.n(90591, bVar)})).booleanValue();
                                int i12 = 1864;
                                while (true) {
                                    i12 ^= 1881;
                                    switch (i12) {
                                        case 17:
                                            i12 = zBooleanValue5 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            z = false;
                                            break;
                                        case 47417:
                                            int i13 = 48767;
                                            while (true) {
                                                i13 ^= 48784;
                                                switch (i13) {
                                                    case 14:
                                                        z = true;
                                                        break;
                                                    case 239:
                                                        i13 = 48798;
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
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    z = false;
                    break;
                default:
                    break;
            }
        }
        boolean zBooleanValue6 = ((Boolean) C0195.n(23046, (Thread) C0195.n(50425, null, new Object[0]), new Object[0])).booleanValue();
        String str8 = (String) C0198.n(98419, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 205, Integer.valueOf(C0080.f289 ^ 235), 1123});
        int i14 = 48891;
        while (true) {
            i14 ^= 48908;
            switch (i14) {
                case 22:
                    break;
                case 53:
                    String str9 = (String) C0198.n(88124, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 221, Integer.valueOf(C0052.f208 ^ (-128)), 335});
                    boolean zBooleanValue7 = ((Boolean) C0182.n(55567, str9, new Object[]{str})).booleanValue();
                    int i15 = 51712;
                    while (true) {
                        i15 ^= 51729;
                        switch (i15) {
                            case 14:
                                break;
                            case 17:
                                i15 = !zBooleanValue7 ? 51805 : 51774;
                                break;
                            case 47:
                                z2 = true;
                                break;
                            case 76:
                                boolean zBooleanValue8 = ((Boolean) C0182.n(55567, str8, new Object[]{str})).booleanValue();
                                int i16 = 51836;
                                while (true) {
                                    i16 ^= 51853;
                                    switch (i16) {
                                        case 241:
                                            i16 = zBooleanValue8 ? 52580 : 52549;
                                            break;
                                        case 1963:
                                            break;
                                        case 1992:
                                            int i17 = 52735;
                                            while (true) {
                                                i17 ^= 52752;
                                                switch (i17) {
                                                    case 14:
                                                        z2 = false;
                                                        break;
                                                    case 1007:
                                                        i17 = 52766;
                                                        continue;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 2025:
                                            int i18 = 52611;
                                            while (true) {
                                                i18 ^= 52628;
                                                switch (i18) {
                                                    case 23:
                                                        i18 = 52642;
                                                        continue;
                                                    case 54:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                z2 = true;
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
                    int i19 = 53510;
                    while (true) {
                        i19 ^= 53527;
                        switch (i19) {
                            case 17:
                                i19 = z ? 53603 : 53572;
                                break;
                            case 50:
                                break;
                            case 83:
                                cVar = null;
                                break;
                            case 116:
                                cVar = (c) C0182.n(57709, bVar);
                                int i20 = 53634;
                                while (true) {
                                    i20 ^= 53651;
                                    switch (i20) {
                                        case 17:
                                            i20 = 53665;
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
                    int i21 = 53758;
                    while (true) {
                        i21 ^= 53775;
                        switch (i21) {
                            case 1009:
                                i21 = z2 ? 54502 : 54471;
                                break;
                            case 1703:
                                break;
                            case 1736:
                                cVar2 = cVar;
                                break;
                            case 1769:
                                int i22 = 54533;
                                while (true) {
                                    i22 ^= 54550;
                                    switch (i22) {
                                        case 19:
                                            i22 = !z ? 54626 : 54595;
                                            break;
                                        case 50:
                                            break;
                                        case 85:
                                            cVar2 = cVar;
                                            break;
                                        case 116:
                                            ThreadLocal threadLocal = (ThreadLocal) C0182.n(47701) /*=> FishCrypto.e*/;
                                            cVar2 = (c) C0182.n(64213, threadLocal, new Object[0]);
                                            boolean zBooleanValue9 = ((Boolean) C0182.n(55567, str8, new Object[]{str})).booleanValue();
                                            int i23 = 54657;
                                            while (true) {
                                                i23 ^= 54674;
                                                switch (i23) {
                                                    case 19:
                                                        i23 = zBooleanValue9 ? 55401 : 54719;
                                                        break;
                                                    case 45:
                                                        z5 = false;
                                                        break;
                                                    case 50:
                                                        break;
                                                    case 3579:
                                                        int i24 = 55432;
                                                        while (true) {
                                                            i24 ^= 55449;
                                                            switch (i24) {
                                                                case 17:
                                                                    i24 = cVar2 != null ? 55525 : 55494;
                                                                    break;
                                                                case 62:
                                                                    break;
                                                                case 95:
                                                                    z5 = false;
                                                                    break;
                                                                case 124:
                                                                    Object objN2 = C0182.n(66039, (WeakReference) C0182.n(93259, cVar2), new Object[0]);
                                                                    int i25 = 55556;
                                                                    while (true) {
                                                                        i25 ^= 55573;
                                                                        switch (i25) {
                                                                            case 17:
                                                                                i25 = objN2 == obj ? 55649 : 55618;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 87:
                                                                                z5 = false;
                                                                                break;
                                                                            case 116:
                                                                                long jLongValue2 = ((Long) C0182.n(75677, null, new Object[0])).longValue();
                                                                                long jLongValue3 = ((Long) C0195.n(58241, cVar2)).longValue();
                                                                                int i26 = 55680;
                                                                                while (true) {
                                                                                    i26 ^= 55697;
                                                                                    switch (i26) {
                                                                                        case 17:
                                                                                            i26 = jLongValue2 - jLongValue3 < 30000000000L ? 56424 : 56393;
                                                                                            break;
                                                                                        case 1467:
                                                                                            break;
                                                                                        case 1496:
                                                                                            z5 = false;
                                                                                            break;
                                                                                        case 1529:
                                                                                            int i27 = 56455;
                                                                                            while (true) {
                                                                                                i27 ^= 56472;
                                                                                                switch (i27) {
                                                                                                    case 31:
                                                                                                        i27 = 56486;
                                                                                                        continue;
                                                                                                    case 62:
                                                                                                        z5 = true;
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
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0182.n(53944, threadLocal, new Object[0]);
                                            int i28 = 56579;
                                            while (true) {
                                                i28 ^= 56596;
                                                switch (i28) {
                                                    case 23:
                                                        i28 = !z5 ? 1507472 : 56641;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 1564036:
                                                        c cVar4 = new c(obj, ((Long) C0182.n(75677, null, new Object[0])).longValue(), null);
                                                        cVar4.f = C0195.n(37603, null, new Object[]{obj});
                                                        boolean zBooleanValue10 = ((Boolean) C0195.n(23046, (Thread) C0195.n(50425, null, new Object[0]), new Object[0])).booleanValue();
                                                        int i29 = 1507503;
                                                        while (true) {
                                                            i29 ^= 1507520;
                                                            switch (i29) {
                                                                case 14:
                                                                    break;
                                                                case 45:
                                                                    throw new InterruptedException();
                                                                case 111:
                                                                    i29 = !zBooleanValue10 ? 1507596 : 1507565;
                                                                    break;
                                                                case 460:
                                                                    Object objN3 = C0198.n(8971, cVar4);
                                                                    int i30 = 1507627;
                                                                    while (true) {
                                                                        i30 ^= 1507644;
                                                                        switch (i30) {
                                                                            case 23:
                                                                                i30 = objN3 != null ? 1507720 : 1507689;
                                                                                break;
                                                                            case 85:
                                                                                break;
                                                                            case 118:
                                                                                break;
                                                                            case 180:
                                                                                while (true) {
                                                                                    AtomicReference atomicReference = (AtomicReference) C0195.n(18109) /*=> FishCrypto.f*/;
                                                                                    c cVar5 = (c) C0195.n(90685, atomicReference, new Object[0]);
                                                                                    int i31 = 1507751;
                                                                                    while (true) {
                                                                                        i31 ^= 1507768;
                                                                                        switch (i31) {
                                                                                            case 31:
                                                                                                i31 = cVar5 != null ? 1508495 : 1508464;
                                                                                                break;
                                                                                            case 1335:
                                                                                                long jLongValue4 = ((Long) C0195.n(58241, cVar5)).longValue();
                                                                                                long jLongValue5 = ((Long) C0195.n(58241, cVar4)).longValue();
                                                                                                int i32 = 1508526;
                                                                                                while (true) {
                                                                                                    i32 ^= 1508543;
                                                                                                    switch (i32) {
                                                                                                        case 17:
                                                                                                            i32 = jLongValue4 > jLongValue5 ? 1508619 : 1508588;
                                                                                                            break;
                                                                                                        case 83:
                                                                                                            while (true) {
                                                                                                                zBooleanValue3 = ((Boolean) C0195.n(80977, atomicReference, new Object[]{cVar5, cVar4})).booleanValue();
                                                                                                                i6 = 1509425;
                                                                                                                while (true) {
                                                                                                                    i6 ^= 1509442;
                                                                                                                    switch (i6) {
                                                                                                                        case 18:
                                                                                                                            break;
                                                                                                                        case 45:
                                                                                                                            objN = C0195.n(90685, atomicReference, new Object[0]);
                                                                                                                            i7 = 1509673;
                                                                                                                            while (true) {
                                                                                                                                i7 ^= 1509690;
                                                                                                                                switch (i7) {
                                                                                                                                    case 19:
                                                                                                                                        i7 = objN != cVar5 ? 1510417 : 1510386;
                                                                                                                                        break;
                                                                                                                                    case 712:
                                                                                                                                        break;
                                                                                                                                    case 745:
                                                                                                                                        break;
                                                                                                                                    case 1323:
                                                                                                                                        i8 = 1510448;
                                                                                                                                        while (true) {
                                                                                                                                            i8 ^= 1510465;
                                                                                                                                            switch (i8) {
                                                                                                                                                case 14:
                                                                                                                                                    break;
                                                                                                                                                case 113:
                                                                                                                                                    i8 = 1510479;
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 115:
                                                                                                                            i6 = zBooleanValue3 ? 1509518 : 1509487;
                                                                                                                            break;
                                                                                                                        case 204:
                                                                                                                            i9 = 1509549;
                                                                                                                            while (true) {
                                                                                                                                i9 ^= 1509566;
                                                                                                                                switch (i9) {
                                                                                                                                    case 19:
                                                                                                                                        i9 = 1509580;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                    case 114:
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
                                                                                                            }
                                                                                                            break;
                                                                                                        case 114:
                                                                                                            break;
                                                                                                        case 436:
                                                                                                            int i33 = 1508650;
                                                                                                            while (true) {
                                                                                                                i33 ^= 1508667;
                                                                                                                switch (i33) {
                                                                                                                    case 17:
                                                                                                                        i33 = 1508681;
                                                                                                                        continue;
                                                                                                                    case 114:
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
                                                                                            case 1480:
                                                                                                while (true) {
                                                                                                    zBooleanValue3 = ((Boolean) C0195.n(80977, atomicReference, new Object[]{cVar5, cVar4})).booleanValue();
                                                                                                    i6 = 1509425;
                                                                                                    while (true) {
                                                                                                        i6 ^= 1509442;
                                                                                                        switch (i6) {
                                                                                                            case 18:
                                                                                                                break;
                                                                                                            case 45:
                                                                                                                objN = C0195.n(90685, atomicReference, new Object[0]);
                                                                                                                i7 = 1509673;
                                                                                                                while (true) {
                                                                                                                    i7 ^= 1509690;
                                                                                                                    switch (i7) {
                                                                                                                        case 19:
                                                                                                                            if (objN != cVar5) {
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 712:
                                                                                                                            break;
                                                                                                                        case 745:
                                                                                                                            break;
                                                                                                                        case 1323:
                                                                                                                            i8 = 1510448;
                                                                                                                            while (true) {
                                                                                                                                i8 ^= 1510465;
                                                                                                                                switch (i8) {
                                                                                                                                    case 14:
                                                                                                                                        break;
                                                                                                                                    case 113:
                                                                                                                                        i8 = 1510479;
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            case 115:
                                                                                                                if (zBooleanValue3) {
                                                                                                                }
                                                                                                                break;
                                                                                                            case 204:
                                                                                                                i9 = 1509549;
                                                                                                                while (true) {
                                                                                                                    i9 ^= 1509566;
                                                                                                                    switch (i9) {
                                                                                                                        case 19:
                                                                                                                            i9 = 1509580;
                                                                                                                            continue;
                                                                                                                            continue;
                                                                                                                        case 114:
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
                                                                                                }
                                                                                                break;
                                                                                            case 1513:
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
                                                                    int i34 = 1510572;
                                                                    while (true) {
                                                                        i34 ^= 1510589;
                                                                        switch (i34) {
                                                                            case 17:
                                                                                i34 = 1510603;
                                                                                continue;
                                                                            case 118:
                                                                                cVar2 = cVar4;
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
                                            int i35 = 1511347;
                                            while (true) {
                                                i35 ^= 1511364;
                                                switch (i35) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 119:
                                                        i35 = bVar != null ? 1511440 : 1511409;
                                                        break;
                                                    case 8148:
                                                        bVar.d = cVar2;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            boolean zBooleanValue11 = ((Boolean) C0182.n(55567, str9, new Object[]{str})).booleanValue();
                                            int i36 = 1511471;
                                            while (true) {
                                                i36 ^= 1511488;
                                                switch (i36) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 111:
                                                        i36 = zBooleanValue11 ? 1511564 : 1511533;
                                                        break;
                                                    case 204:
                                                        C0182.n(13329, (ThreadLocal) C0182.n(47701) /*=> FishCrypto.e*/, new Object[]{cVar2});
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            int i37 = 1511595;
                                            while (true) {
                                                i37 ^= 1511612;
                                                switch (i37) {
                                                    case 23:
                                                        i37 = z5 ? 1512339 : 1512308;
                                                        break;
                                                    case 815:
                                                        String str10 = (String) C0198.n(97167, cVar2);
                                                        int i38 = 1512370;
                                                        while (true) {
                                                            i38 ^= 1512387;
                                                            switch (i38) {
                                                                case 18:
                                                                    break;
                                                                case 51:
                                                                    break;
                                                                case 113:
                                                                    i38 = str10 != null ? 1512463 : 1512432;
                                                                    break;
                                                                case 1996:
                                                                    C0195.n(55304, null, new Object[0]);
                                                                    return (String) C0198.n(97167, cVar2);
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 968:
                                                        break;
                                                    case 1001:
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
                    int i39 = 1512494;
                    while (true) {
                        i39 ^= 1512511;
                        switch (i39) {
                            case 17:
                                i39 = cVar2 == null ? 1513238 : 1512556;
                                break;
                            case 83:
                                jLongValue = ((Long) C0195.n(58241, cVar2)).longValue();
                                break;
                            case 114:
                                break;
                            case 809:
                                jLongValue = ((Long) C0182.n(75677, null, new Object[0])).longValue();
                                int i40 = 1513269;
                                while (true) {
                                    i40 ^= 1513286;
                                    switch (i40) {
                                        case 18:
                                            break;
                                        case 115:
                                            i40 = 1513300;
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
                    long jLongValue6 = jLongValue + 4000000000L;
                    int i41 = 1513393;
                    while (true) {
                        i41 ^= 1513410;
                        switch (i41) {
                            case 18:
                                break;
                            case 45:
                                break;
                            case 115:
                                i41 = bVar != null ? 1513486 : 1513455;
                                break;
                            case 4044:
                                jLongValue6 = ((Long) C0149.n(56518, null, new Object[]{Long.valueOf(jLongValue6), Long.valueOf(((Long) C0182.n(17464, bVar)).longValue())})).longValue();
                                break;
                            default:
                                break;
                        }
                    }
                    try {
                        boolean zBooleanValue12 = ((Boolean) C0182.n(86863, null, new Object[0])).booleanValue();
                        int i42 = 1513517;
                        while (true) {
                            i42 ^= 1513534;
                            switch (i42) {
                                case 19:
                                    i42 = !zBooleanValue12 ? 1514261 : 1514230;
                                    break;
                                case 712:
                                    break;
                                case 745:
                                    break;
                                case 811:
                                    boolean zBooleanValue13 = ((Boolean) C0182.n(73511, null, new Object[0])).booleanValue();
                                    int i43 = 1514292;
                                    while (true) {
                                        i43 ^= 1514309;
                                        switch (i43) {
                                            case 22:
                                                break;
                                            case 55:
                                                C0198.n(56211, null, new Object[0]);
                                                break;
                                            case 113:
                                                i43 = !zBooleanValue13 ? 1514385 : 1514354;
                                                break;
                                            case 212:
                                                boolean zBooleanValue14 = ((Boolean) C0182.n(33189, null, new Object[0])).booleanValue();
                                                int i44 = 1514416;
                                                while (true) {
                                                    i44 ^= 1514433;
                                                    switch (i44) {
                                                        case 14:
                                                            break;
                                                        case 47:
                                                            break;
                                                        case 113:
                                                            i44 = zBooleanValue14 ? 1515160 : 1514478;
                                                            break;
                                                        case 1369:
                                                            int i45 = 1515191;
                                                            while (true) {
                                                                i45 ^= 1515208;
                                                                switch (i45) {
                                                                    case 30:
                                                                        break;
                                                                    case 127:
                                                                        i45 = 1515222;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                }
                                                                C0198.n(56211, null, new Object[0]);
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
                        boolean zBooleanValue15 = ((Boolean) C0198.n(89841, null, new Object[]{Long.valueOf(jLongValue6)})).booleanValue();
                        int i46 = 1515439;
                        while (true) {
                            i46 ^= 1515456;
                            switch (i46) {
                                case 111:
                                    i46 = !zBooleanValue15 ? 1516183 : 1516152;
                                    break;
                                case 15703:
                                    boolean zBooleanValue16 = ((Boolean) C0182.n(86863, null, new Object[0])).booleanValue();
                                    int i47 = 1516214;
                                    while (true) {
                                        i47 ^= 1516231;
                                        switch (i47) {
                                            case 18:
                                                break;
                                            case 51:
                                                boolean zBooleanValue17 = ((Boolean) C0182.n(73511, null, new Object[0])).booleanValue();
                                                int i48 = 1537294;
                                                while (true) {
                                                    i48 ^= 1537311;
                                                    switch (i48) {
                                                        case 17:
                                                            i48 = !zBooleanValue17 ? 1537387 : 1537356;
                                                            break;
                                                        case 50:
                                                            break;
                                                        case 83:
                                                            z3 = true;
                                                            break;
                                                        case 116:
                                                            boolean zBooleanValue18 = ((Boolean) C0182.n(33189, null, new Object[0])).booleanValue();
                                                            int i49 = 1537418;
                                                            while (true) {
                                                                i49 ^= 1537435;
                                                                switch (i49) {
                                                                    case 17:
                                                                        i49 = zBooleanValue18 ? 1537511 : 1537480;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    case 83:
                                                                        int i50 = 1538317;
                                                                        while (true) {
                                                                            i50 ^= 1538334;
                                                                            switch (i50) {
                                                                                case 19:
                                                                                    i50 = 1538348;
                                                                                    continue;
                                                                                case 50:
                                                                                    z3 = false;
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 124:
                                                                        int i51 = 1537542;
                                                                        while (true) {
                                                                            i51 ^= 1537559;
                                                                            switch (i51) {
                                                                                case 17:
                                                                                    i51 = 1538224;
                                                                                    continue;
                                                                                case 3751:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            z3 = true;
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
                                                int i52 = 1538441;
                                                while (true) {
                                                    i52 ^= 1538458;
                                                    switch (i52) {
                                                        case 19:
                                                            i52 = z3 ? 1539185 : 1538503;
                                                            break;
                                                        case 50:
                                                            break;
                                                        case 93:
                                                            str2 = (String) C0198.n(30759, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 239, Integer.valueOf(C0132.f341 ^ (-7)), 2961});
                                                            break;
                                                        case 1515:
                                                            String str11 = (String) C0198.n(62249, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 232, Integer.valueOf(C0086.f295 ^ (-342)), 2030});
                                                            int i53 = 1539216;
                                                            while (true) {
                                                                i53 ^= 1539233;
                                                                switch (i53) {
                                                                    case 14:
                                                                        str2 = str11;
                                                                        break;
                                                                    case 49:
                                                                        i53 = 1539247;
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
                                                int i54 = 1539340;
                                                while (true) {
                                                    i54 ^= 1539357;
                                                    switch (i54) {
                                                        case 17:
                                                            i54 = z3 ? 1539433 : 1539402;
                                                            break;
                                                        case 54:
                                                            break;
                                                        case 87:
                                                            str3 = (String) C0198.n(51837, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 256, Integer.valueOf(C0111.f320 ^ (-939)), 2710});
                                                            break;
                                                        case 116:
                                                            String str12 = (String) C0149.n(83930, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 245, Integer.valueOf(C0067.f276 ^ (-666)), 2218});
                                                            int i55 = 1539464;
                                                            while (true) {
                                                                i55 ^= 1539481;
                                                                switch (i55) {
                                                                    case 17:
                                                                        i55 = 1540146;
                                                                        continue;
                                                                    case 64939:
                                                                        str3 = str12;
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
                                                int i56 = 1540239;
                                                while (true) {
                                                    i56 ^= 1540256;
                                                    switch (i56) {
                                                        case 14:
                                                            break;
                                                        case 47:
                                                            i56 = z3 ? 1540332 : 1540301;
                                                            break;
                                                        case 76:
                                                            String str13 = (String) C0198.n(68788, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 265, Integer.valueOf(C0038.f194 ^ 213), 2574});
                                                            int i57 = 1540363;
                                                            while (true) {
                                                                i57 ^= 1540380;
                                                                switch (i57) {
                                                                    case 23:
                                                                        i57 = 1540394;
                                                                        continue;
                                                                    case 54:
                                                                        str4 = str13;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 109:
                                                            str4 = (String) C0198.n(94433, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 275, Integer.valueOf(C0051.f207 ^ (-377)), 3146});
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                int i58 = 1541138;
                                                while (true) {
                                                    i58 ^= 1541155;
                                                    switch (i58) {
                                                        case 18:
                                                            break;
                                                        case 49:
                                                            i58 = z3 ? 1541231 : 1541200;
                                                            break;
                                                        case 76:
                                                            boolean zBooleanValue19 = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
                                                            int i59 = 1541262;
                                                            while (true) {
                                                                i59 ^= 1541279;
                                                                switch (i59) {
                                                                    case 17:
                                                                        i59 = !zBooleanValue19 ? 1541355 : 1541324;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    case 83:
                                                                        i = 1545230;
                                                                        while (true) {
                                                                            i ^= 1545247;
                                                                            switch (i) {
                                                                                case 17:
                                                                                    i = z3 ? 1545974 : 1545943;
                                                                                    break;
                                                                                case 679:
                                                                                    break;
                                                                                case 712:
                                                                                    i2 = 1567085;
                                                                                    while (true) {
                                                                                        i2 ^= 1567102;
                                                                                        switch (i2) {
                                                                                            case 19:
                                                                                                i2 = z3 ? 1567178 : 1567147;
                                                                                                break;
                                                                                            case 180:
                                                                                                zBooleanValue = ((Boolean) C0198.n(35384, null, new Object[0])).booleanValue();
                                                                                                i3 = 1567209;
                                                                                                while (true) {
                                                                                                    i3 ^= 1567226;
                                                                                                    switch (i3) {
                                                                                                        case 19:
                                                                                                            i3 = !zBooleanValue ? 1567302 : 1567271;
                                                                                                            break;
                                                                                                        case 956:
                                                                                                            str3 = (String) C0198.n(98419, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 350, Integer.valueOf(C0029.f185 ^ 282), 933});
                                                                                                            break;
                                                                                                        case 989:
                                                                                                            break;
                                                                                                        case 1010:
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 213:
                                                                                                break;
                                                                                            case 242:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 745:
                                                                                    zBooleanValue2 = ((Boolean) C0198.n(13233) /*=> N1.q*/).booleanValue();
                                                                                    i4 = 1546005;
                                                                                    while (true) {
                                                                                        i4 ^= 1546022;
                                                                                        switch (i4) {
                                                                                            case 18:
                                                                                                break;
                                                                                            case 51:
                                                                                                i4 = !zBooleanValue2 ? 1546098 : 1546067;
                                                                                                break;
                                                                                            case 84:
                                                                                                str5 = (String) C0198.n(45548, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 335, Integer.valueOf(C0042.f198 ^ 52), 3121});
                                                                                                i5 = 1546129;
                                                                                                while (true) {
                                                                                                    i5 ^= 1546146;
                                                                                                    switch (i5) {
                                                                                                        case 18:
                                                                                                            str3 = str5;
                                                                                                            break;
                                                                                                        case 51:
                                                                                                            i5 = 1546160;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 117:
                                                                                                i2 = 1567085;
                                                                                                while (true) {
                                                                                                    i2 ^= 1567102;
                                                                                                    switch (i2) {
                                                                                                        case 19:
                                                                                                            if (z3) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 180:
                                                                                                            zBooleanValue = ((Boolean) C0198.n(35384, null, new Object[0])).booleanValue();
                                                                                                            i3 = 1567209;
                                                                                                            while (true) {
                                                                                                                i3 ^= 1567226;
                                                                                                                switch (i3) {
                                                                                                                    case 19:
                                                                                                                        if (!zBooleanValue) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 956:
                                                                                                                        str3 = (String) C0198.n(98419, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 350, Integer.valueOf(C0029.f185 ^ 282), 933});
                                                                                                                        break;
                                                                                                                    case 989:
                                                                                                                        break;
                                                                                                                    case 1010:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 213:
                                                                                                            break;
                                                                                                        case 242:
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
                                                                    case 116:
                                                                        String str14 = (String) C0198.n(28747) /*=> FishCrypto.b*/;
                                                                        int i60 = 1541386;
                                                                        while (true) {
                                                                            i60 ^= 1541403;
                                                                            switch (i60) {
                                                                                case 17:
                                                                                    i60 = str14 == null ? 1542130 : 1542099;
                                                                                    break;
                                                                                case 687:
                                                                                    break;
                                                                                case 712:
                                                                                    str7 = (String) C0198.n(28747) /*=> FishCrypto.b*/;
                                                                                    break;
                                                                                case 745:
                                                                                    String str15 = (String) C0195.n(43185) /*=> raw:new String(new byte[0])*/;
                                                                                    int i61 = 1542161;
                                                                                    while (true) {
                                                                                        i61 ^= 1542178;
                                                                                        switch (i61) {
                                                                                            case 18:
                                                                                                str7 = str15;
                                                                                                break;
                                                                                            case 51:
                                                                                                i61 = 1542192;
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
                                                                        int i62 = 1542285;
                                                                        while (true) {
                                                                            i62 ^= 1542302;
                                                                            switch (i62) {
                                                                                case 19:
                                                                                    i62 = str7 != null ? 1543029 : 1542347;
                                                                                    break;
                                                                                case 50:
                                                                                    break;
                                                                                case 85:
                                                                                    z4 = false;
                                                                                    break;
                                                                                case 1003:
                                                                                    boolean zBooleanValue20 = ((Boolean) C0195.n(5730, str7, new Object[0])).booleanValue();
                                                                                    int i63 = 1543060;
                                                                                    while (true) {
                                                                                        i63 ^= 1543077;
                                                                                        switch (i63) {
                                                                                            case 22:
                                                                                                break;
                                                                                            case 49:
                                                                                                i63 = !zBooleanValue20 ? 1543153 : 1543122;
                                                                                                break;
                                                                                            case 84:
                                                                                                boolean zBooleanValue21 = ((Boolean) C0182.n(55567, (String) C0198.n(71923, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 284, Integer.valueOf(C0141.f351 ^ (-772)), 1209}), new Object[]{str7})).booleanValue();
                                                                                                int i64 = 1543184;
                                                                                                while (true) {
                                                                                                    i64 ^= 1543201;
                                                                                                    switch (i64) {
                                                                                                        case 14:
                                                                                                            break;
                                                                                                        case 49:
                                                                                                            i64 = !zBooleanValue21 ? 1543277 : 1543246;
                                                                                                            break;
                                                                                                        case 76:
                                                                                                            z4 = true;
                                                                                                            break;
                                                                                                        case 111:
                                                                                                            z4 = false;
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 119:
                                                                                                z4 = false;
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
                                                                        int i65 = 1543308;
                                                                        while (true) {
                                                                            i65 ^= 1543325;
                                                                            switch (i65) {
                                                                                case 17:
                                                                                    i65 = z4 ? 1544052 : 1544021;
                                                                                    break;
                                                                                case 939:
                                                                                    break;
                                                                                case 968:
                                                                                    String str16 = (String) C0195.n(85847, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 305, Integer.valueOf(C0069.f278 ^ 286), 1262});
                                                                                    int i66 = 1544207;
                                                                                    while (true) {
                                                                                        i66 ^= 1544224;
                                                                                        switch (i66) {
                                                                                            case 14:
                                                                                                str3 = str16;
                                                                                                break;
                                                                                            case 47:
                                                                                                i66 = 1544238;
                                                                                                continue;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 1001:
                                                                                    str3 = (String) C0198.n(74142, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 297, Integer.valueOf(C0023.f179 ^ 691), 1290});
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        int i67 = 1544083;
                                                                        while (true) {
                                                                            i67 ^= 1544100;
                                                                            switch (i67) {
                                                                                case 22:
                                                                                    int i68 = 1544982;
                                                                                    while (true) {
                                                                                        i68 ^= 1544999;
                                                                                        switch (i68) {
                                                                                            case 18:
                                                                                                break;
                                                                                            case 49:
                                                                                                i68 = z4 ? 1545075 : 1545044;
                                                                                                break;
                                                                                            case 84:
                                                                                                String str17 = (String) C0198.n(98419, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 316, Integer.valueOf(C0048.f204 ^ 839), 2708});
                                                                                                int i69 = 1545106;
                                                                                                while (true) {
                                                                                                    i69 ^= 1545123;
                                                                                                    switch (i69) {
                                                                                                        case 18:
                                                                                                            str4 = str17;
                                                                                                            break;
                                                                                                        case 49:
                                                                                                            i69 = 1545137;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 115:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 55:
                                                                                    i67 = 1544114;
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
                                                        case 115:
                                                            i = 1545230;
                                                            while (true) {
                                                                i ^= 1545247;
                                                                switch (i) {
                                                                    case 17:
                                                                        if (z3) {
                                                                        }
                                                                        break;
                                                                    case 679:
                                                                        break;
                                                                    case 712:
                                                                        i2 = 1567085;
                                                                        while (true) {
                                                                            i2 ^= 1567102;
                                                                            switch (i2) {
                                                                                case 19:
                                                                                    if (z3) {
                                                                                    }
                                                                                    break;
                                                                                case 180:
                                                                                    zBooleanValue = ((Boolean) C0198.n(35384, null, new Object[0])).booleanValue();
                                                                                    i3 = 1567209;
                                                                                    while (true) {
                                                                                        i3 ^= 1567226;
                                                                                        switch (i3) {
                                                                                            case 19:
                                                                                                if (!zBooleanValue) {
                                                                                                }
                                                                                                break;
                                                                                            case 956:
                                                                                                str3 = (String) C0198.n(98419, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 350, Integer.valueOf(C0029.f185 ^ 282), 933});
                                                                                                break;
                                                                                            case 989:
                                                                                                break;
                                                                                            case 1010:
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 213:
                                                                                    break;
                                                                                case 242:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 745:
                                                                        zBooleanValue2 = ((Boolean) C0198.n(13233) /*=> N1.q*/).booleanValue();
                                                                        i4 = 1546005;
                                                                        while (true) {
                                                                            i4 ^= 1546022;
                                                                            switch (i4) {
                                                                                case 18:
                                                                                    break;
                                                                                case 51:
                                                                                    if (!zBooleanValue2) {
                                                                                    }
                                                                                    break;
                                                                                case 84:
                                                                                    str5 = (String) C0198.n(45548, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 335, Integer.valueOf(C0042.f198 ^ 52), 3121});
                                                                                    i5 = 1546129;
                                                                                    while (true) {
                                                                                        i5 ^= 1546146;
                                                                                        switch (i5) {
                                                                                            case 18:
                                                                                                str3 = str5;
                                                                                                break;
                                                                                            case 51:
                                                                                                i5 = 1546160;
                                                                                                continue;
                                                                                                continue;
                                                                                            default:
                                                                                                continue;
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 117:
                                                                                    i2 = 1567085;
                                                                                    while (true) {
                                                                                        i2 ^= 1567102;
                                                                                        switch (i2) {
                                                                                            case 19:
                                                                                                if (z3) {
                                                                                                }
                                                                                                break;
                                                                                            case 180:
                                                                                                zBooleanValue = ((Boolean) C0198.n(35384, null, new Object[0])).booleanValue();
                                                                                                i3 = 1567209;
                                                                                                while (true) {
                                                                                                    i3 ^= 1567226;
                                                                                                    switch (i3) {
                                                                                                        case 19:
                                                                                                            if (!zBooleanValue) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 956:
                                                                                                            str3 = (String) C0198.n(98419, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 350, Integer.valueOf(C0029.f185 ^ 282), 933});
                                                                                                            break;
                                                                                                        case 989:
                                                                                                            break;
                                                                                                        case 1010:
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 213:
                                                                                                break;
                                                                                            case 242:
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
                                                    boolean zBooleanValue22 = ((Boolean) C0182.n(55567, (String) C0149.n(36390, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 367, Integer.valueOf(C0083.f292 ^ (-194)), 2869}), new Object[]{str})).booleanValue();
                                                    int i70 = 1567333;
                                                    while (true) {
                                                        i70 ^= 1567350;
                                                        switch (i70) {
                                                            case 19:
                                                                i70 = zBooleanValue22 ? 1568077 : 1568046;
                                                                break;
                                                            case 1851:
                                                                StringBuilder sb = new StringBuilder((String) C0198.n(43897, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 380, Integer.valueOf(C0025.f181 ^ (-655)), 1596}));
                                                                str6 = (String) C0198.n(89992, sb, new Object[0]);
                                                                int i71 = 1568108;
                                                                while (true) {
                                                                    i71 ^= 1568125;
                                                                    switch (i71) {
                                                                        case 17:
                                                                            i71 = 1568139;
                                                                            continue;
                                                                        case 246:
                                                                            break;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            case 1880:
                                                                StringBuilder sb2 = (StringBuilder) C0198.n(70916, null, new Object[]{(String) C0149.n(56487, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 428, Integer.valueOf(C0144.f354 ^ (-585)), 2131}), str2, (String) C0149.n(42779, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 446, Integer.valueOf(C0025.f181 ^ (-696)), 3267}), str2, (String) C0198.n(14698, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 474, Integer.valueOf(C0075.f284 ^ 786), 485})});
                                                                C0198.n(25802, null, new Object[]{sb2, str3, (String) C0198.n(39623, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 490, Integer.valueOf(C0058.f267 ^ 118), 2554}), str4, (String) C0198.n(30341, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 507, Integer.valueOf(C0034.f190 ^ 149), 3243})});
                                                                str6 = (String) C0178.n(38411, null, new Object[]{sb2, str4, (String) C0178.n(80760, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 524, Integer.valueOf(C0040.f196 ^ (-329)), 1556})});
                                                                break;
                                                            case 1913:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    int i72 = 1568232;
                                                    while (true) {
                                                        i72 ^= 1568249;
                                                        switch (i72) {
                                                            case 17:
                                                                if (cVar2 != null) {
                                                                    i72 = 1568976;
                                                                }
                                                                break;
                                                            case 991:
                                                                return str6;
                                                            case 1022:
                                                                break;
                                                            case 7465:
                                                                cVar2.e = str6;
                                                                C0195.n(55304, null, new Object[0]);
                                                                return str6;
                                                            default:
                                                                continue;
                                                        }
                                                        i72 = 1568294;
                                                    }
                                                }
                                                break;
                                            case 113:
                                                i47 = zBooleanValue16 ? 1516307 : 1516276;
                                                break;
                                            case 468:
                                                int i73 = 1516338;
                                                while (true) {
                                                    i73 ^= 1516355;
                                                    switch (i73) {
                                                        case 18:
                                                            break;
                                                        case 113:
                                                            i73 = 1516369;
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
                                case 15769:
                                    break;
                                case 15800:
                                    break;
                                default:
                                    break;
                            }
                        }
                        return null;
                    } catch (InterruptedException e2) {
                        int i74 = 1515315;
                        while (true) {
                            i74 ^= 1515332;
                            switch (i74) {
                                case 22:
                                    C0182.n(39712, null, new Object[]{cVar2});
                                    int i75 = 1569007;
                                    while (true) {
                                        i75 ^= 1569024;
                                        switch (i75) {
                                            case 14:
                                                int i76 = 1569131;
                                                while (true) {
                                                    i76 ^= 1569148;
                                                    switch (i76) {
                                                        case 23:
                                                            i76 = 1569162;
                                                            break;
                                                        case 246:
                                                            throw e2;
                                                    }
                                                }
                                                break;
                                            case 495:
                                                i75 = 1569038;
                                                break;
                                        }
                                    }
                                    break;
                                case 119:
                                    i74 = 1515346;
                                    break;
                            }
                        }
                    }
                    break;
                case 503:
                    if (zBooleanValue6) {
                        i14 = 49635;
                    }
                    break;
                case 32495:
                    int i77 = 49666;
                    while (true) {
                        i77 ^= 49683;
                        switch (i77) {
                            case 17:
                                i77 = z ? 49759 : 49728;
                                break;
                            case 50:
                                break;
                            case 76:
                                c cVar6 = (c) C0182.n(57709, bVar);
                                int i78 = 49790;
                                while (true) {
                                    i78 ^= 49807;
                                    switch (i78) {
                                        case 18:
                                            cVar3 = cVar6;
                                            break;
                                        case 241:
                                            i78 = 49821;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                cVar3 = (c) C0182.n(64213, (ThreadLocal) C0182.n(47701) /*=> FishCrypto.e*/, new Object[0]);
                                break;
                            default:
                                break;
                        }
                    }
                    int i79 = 49914;
                    while (true) {
                        i79 ^= 49931;
                        switch (i79) {
                            case 497:
                                if (!z) {
                                    i79 = 50658;
                                }
                                break;
                            case 1711:
                                break;
                            case 1736:
                                break;
                            case 1769:
                                boolean zBooleanValue23 = ((Boolean) C0182.n(55567, str8, new Object[]{str})).booleanValue();
                                int i80 = 50689;
                                while (true) {
                                    i80 ^= 50706;
                                    switch (i80) {
                                        case 19:
                                            if (zBooleanValue23) {
                                                i80 = 50782;
                                            }
                                            break;
                                        case 45:
                                            throw new InterruptedException();
                                        case 50:
                                            break;
                                        case 76:
                                            int i81 = 50813;
                                            while (true) {
                                                i81 ^= 50830;
                                                switch (i81) {
                                                    case 18:
                                                        break;
                                                    case 53:
                                                        throw new InterruptedException();
                                                    case 243:
                                                        if (cVar3 != null) {
                                                            i81 = 51557;
                                                        }
                                                        break;
                                                    case 4075:
                                                        Object objN4 = C0182.n(66039, (WeakReference) C0182.n(93259, cVar3), new Object[0]);
                                                        int i82 = 51588;
                                                        while (true) {
                                                            i82 ^= 51605;
                                                            switch (i82) {
                                                                case 17:
                                                                    if (objN4 == obj) {
                                                                        i82 = 51681;
                                                                    }
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    throw new InterruptedException();
                                                                case 116:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i82 = 51650;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i81 = 50875;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i80 = 50751;
                                }
                                break;
                            default:
                                continue;
                        }
                        i79 = 50627;
                    }
                    C0182.n(39712, null, new Object[]{cVar3});
                    throw new InterruptedException();
                default:
                    continue;
            }
            i14 = 48953;
        }
    }

    public static boolean i(int i, String str) {
        boolean z;
        String str2 = str;
        synchronized (FishCrypto.class) {
            boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        if (!zBooleanValue) {
                            i2 = 1709;
                        }
                        break;
                    case 204:
                        return false;
                    case 239:
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = str2 == null ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    try {
                                        str2 = (String) C0195.n(43185) /*=> raw:new String(new byte[0])*/;
                                    } catch (Throwable th) {
                                        return false;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        long jLongValue = ((Long) C0178.n(8133, null, new Object[]{Integer.valueOf(i), str2})).longValue();
                        int i4 = 1864;
                        while (true) {
                            i4 ^= 1881;
                            switch (i4) {
                                case 17:
                                    i4 = jLongValue != 0 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    z = false;
                                    break;
                                case 47417:
                                    boolean zBooleanValue2 = ((Boolean) C0178.n(92544, null, new Object[]{Integer.valueOf(i), Long.valueOf(jLongValue), str2})).booleanValue();
                                    int i5 = 48767;
                                    while (true) {
                                        i5 ^= 48784;
                                        switch (i5) {
                                            case 14:
                                                break;
                                            case 45:
                                                z = false;
                                                break;
                                            case 76:
                                                z = true;
                                                break;
                                            case 239:
                                                i5 = zBooleanValue2 ? 48860 : 48829;
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
                        return z;
                    default:
                        continue;
                }
                i2 = 1678;
            }
        }
    }

    public static String invokeHost(Object obj, String str, long j, Callable<String> callable) throws Throwable {
        ThreadLocal threadLocal = (ThreadLocal) C0182.n(47224) /*=> FishCrypto.g*/;
        b bVar = (b) C0182.n(64213, threadLocal, new Object[0]);
        long jLongValue = ((Long) C0149.n(56518, null, new Object[]{Long.valueOf(j), Long.valueOf(((Long) C0182.n(75677, null, new Object[0])).longValue() + 4000000000L)})).longValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = bVar == null ? 1709 : 1678;
                    break;
                case 204:
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
                    break;
                case 239:
                    jLongValue = ((Long) C0149.n(56518, null, new Object[]{Long.valueOf(jLongValue), Long.valueOf(((Long) C0182.n(17464, bVar)).longValue())})).longValue();
                    break;
                default:
                    break;
            }
        }
        b bVar2 = new b(jLongValue, str, bVar);
        C0182.n(13329, threadLocal, new Object[]{bVar2});
        try {
            try {
                String str2 = (String) C0182.n(63642, null, new Object[]{obj, str});
                int i3 = 1864;
                while (true) {
                    i3 ^= 1881;
                    switch (i3) {
                        case 17:
                            i3 = str2 != null ? 48736 : 48705;
                            break;
                        case 47384:
                            bVar2.e = true;
                            str2 = (String) C0178.n(67332, callable, new Object[0]);
                            int i4 = 49666;
                            while (true) {
                                i4 ^= 49683;
                                switch (i4) {
                                    case 17:
                                        if (bVar == null) {
                                            i4 = 49759;
                                        }
                                        break;
                                    case 50:
                                        break;
                                    case 76:
                                        C0182.n(53944, threadLocal, new Object[0]);
                                        int i5 = 49790;
                                        while (true) {
                                            i5 ^= 49807;
                                            switch (i5) {
                                                case 18:
                                                    break;
                                                case 241:
                                                    i5 = 49821;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 83:
                                        C0182.n(13329, threadLocal, new Object[]{bVar});
                                        break;
                                    default:
                                        break;
                                }
                                i4 = 49728;
                            }
                            break;
                        case 47417:
                            int i6 = 48767;
                            while (true) {
                                i6 ^= 48784;
                                switch (i6) {
                                    case 14:
                                        break;
                                    case 45:
                                        C0182.n(13329, threadLocal, new Object[]{bVar});
                                        break;
                                    case 76:
                                        C0182.n(53944, threadLocal, new Object[0]);
                                        int i7 = 48891;
                                        while (true) {
                                            i7 ^= 48908;
                                            switch (i7) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i7 = 48922;
                                                    break;
                                            }
                                        }
                                        break;
                                    case 239:
                                        if (bVar == null) {
                                            i6 = 48860;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i6 = 48829;
                            }
                            break;
                        case 47483:
                            break;
                        default:
                            break;
                    }
                }
                return str2;
            } catch (InterruptedException e2) {
                C0182.n(39712, null, new Object[]{(c) C0182.n(57709, bVar2)});
                C0149.n(88498, (Thread) C0195.n(50425, null, new Object[0]), new Object[0]);
                throw e2;
            }
        } catch (Throwable th) {
            int i8 = 49914;
            while (true) {
                i8 ^= 49931;
                switch (i8) {
                    case 497:
                        i8 = 50596;
                        break;
                    case 1711:
                        int i9 = 50689;
                        while (true) {
                            i9 ^= 50706;
                            switch (i9) {
                                case 19:
                                    if (bVar == null) {
                                        i9 = 50782;
                                    }
                                    break;
                                case 45:
                                    C0182.n(13329, threadLocal, new Object[]{bVar});
                                    break;
                                case 50:
                                    break;
                                case 76:
                                    C0182.n(53944, threadLocal, new Object[0]);
                                    int i10 = 50813;
                                    while (true) {
                                        i10 ^= 50830;
                                        switch (i10) {
                                            case 18:
                                                break;
                                            case 243:
                                                i10 = 50844;
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i9 = 50751;
                        }
                        throw th;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00b6. Please report as an issue. */
    public static int j(String str) {
        synchronized (FishCrypto.class) {
            try {
                boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
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
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = str != null ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case 500:
                                        int iIntValue = ((Integer) C0149.n(89092, str, new Object[0])).intValue();
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    if (iIntValue == 0) {
                                                        i3 = 48736;
                                                    }
                                                    break;
                                                case 47384:
                                                    try {
                                                        int iIntValue2 = ((Integer) C0178.n(14624, null, new Object[]{str})).intValue();
                                                        int i4 = 48891;
                                                        while (true) {
                                                            i4 ^= 48908;
                                                            switch (i4) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i4 = iIntValue2 != 0 ? 49635 : 48953;
                                                                    break;
                                                                case 32495:
                                                                    String[] strArr = (String[]) C0178.n(72673) /*=> FishCrypto.c*/;
                                                                    int i5 = 49666;
                                                                    while (true) {
                                                                        i5 ^= 49683;
                                                                        switch (i5) {
                                                                            case 17:
                                                                                i5 = strArr != null ? 49759 : 49728;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case 76:
                                                                                int i6 = 0;
                                                                                while (true) {
                                                                                    int length = strArr.length;
                                                                                    int i7 = 49790;
                                                                                    while (true) {
                                                                                        i7 ^= 49807;
                                                                                        switch (i7) {
                                                                                            case 18:
                                                                                                break;
                                                                                            case 51:
                                                                                                break;
                                                                                            case 84:
                                                                                                strArr[i6] = null;
                                                                                                i6 += C0004.f160 ^ (-339);
                                                                                                int i8 = 49914;
                                                                                                while (true) {
                                                                                                    i8 ^= 49931;
                                                                                                    switch (i8) {
                                                                                                        case 497:
                                                                                                            i8 = 50596;
                                                                                                            break;
                                                                                                        case 1711:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 241:
                                                                                                i7 = i6 < length ? 49883 : 49852;
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
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
                                                                    c = null;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        return iIntValue2;
                                                    } catch (Throwable th) {
                                                        return -1;
                                                    }
                                                case 47417:
                                                    int i9 = 48767;
                                                    while (true) {
                                                        i9 ^= 48784;
                                                        switch (i9) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i9 = 48798;
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
                return -1;
            } catch (Throwable th2) {
                int i10 = 50689;
                while (true) {
                    i10 ^= 50706;
                    switch (i10) {
                        case 19:
                            i10 = 50720;
                            break;
                        case 50:
                            int i11 = 50813;
                            while (true) {
                                i11 ^= 50830;
                                switch (i11) {
                                    case 18:
                                        int i12 = 51588;
                                        while (true) {
                                            i12 ^= 51605;
                                            switch (i12) {
                                                case 17:
                                                    i12 = 51619;
                                                    break;
                                                case 54:
                                                    throw th2;
                                            }
                                        }
                                        break;
                                    case 243:
                                        i11 = 50844;
                                        break;
                                }
                            }
                            break;
                    }
                }
            }
        }
    }

    public static boolean k() {
        boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
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
                    return false;
                case 239:
                    try {
                        return ((Boolean) C0178.n(42861, null, new Object[0])).booleanValue();
                    } catch (Throwable th) {
                        return false;
                    }
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static boolean l() {
        boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
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
                    return false;
                case 239:
                    try {
                        return ((Boolean) C0178.n(27237, null, new Object[0])).booleanValue();
                    } catch (Throwable th) {
                        return false;
                    }
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static int m(String str) throws Throwable {
        boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
        int i = C0071.f280 ^ (-48);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (!zBooleanValue) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    return i;
                case 239:
                    try {
                        int iIntValue = ((Integer) C0178.n(21763, null, new Object[]{str})).intValue();
                        C0195.n(55304, null, new Object[0]);
                        return iIntValue;
                    } catch (Throwable th) {
                        C0195.n(55304, null, new Object[0]);
                        return i;
                    }
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    public static boolean n() {
        try {
            String str = (String) C0178.n(29642, null, new Object[0]);
            boolean zBooleanValue = ((Boolean) C0195.n(5730, str, new Object[0])).booleanValue();
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
                        boolean zBooleanValue2 = ((Boolean) C0182.n(55567, (String) C0198.n(94433, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 528, Integer.valueOf(C0136.f345 ^ 726), 590}), new Object[]{(String) C0178.n(89195, new JSONObject(str), new Object[]{(String) C0178.n(26978, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 535, Integer.valueOf(C0012.f168 ^ 872), 916})})})).booleanValue();
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
                                    return false;
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
                                    continue;
                            }
                            i2 = 1802;
                        }
                        break;
                    case 239:
                        return true;
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
                        return true;
                    case 239:
                        i4 = 48798;
                        break;
                }
            }
        }
    }

    public static String o() {
        boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
        String str = (String) C0195.n(43185) /*=> raw:new String(new byte[0])*/;
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
                    return str;
                case 239:
                    try {
                        String str2 = (String) C0178.n(25590, null, new Object[0]);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (str2 == null) {
                                        i2 = 1833;
                                    }
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    return str2;
                                case 500:
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = 48674;
                                                break;
                                            case 47483:
                                                return str;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                    } catch (Throwable th) {
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    return str;
                                case 239:
                                    i4 = 48798;
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

    public static void p() throws Throwable {
        Object objN = null;
        Application application = null;
        ClassLoader classLoader = null;
        short[] sArr = null;
        int i = 0;
        int i2 = 0;
        Object[] objArr = null;
        Integer num = null;
        Integer numValueOf = null;
        Integer num2 = null;
        String str = null;
        Object[] objArr2 = null;
        Class cls = null;
        short[] sArr2 = null;
        Object[] objArr3 = null;
        Integer num3 = null;
        Integer numValueOf2 = null;
        Method method = null;
        Object[] objArr4 = null;
        String str2 = "۠ۥۨ";
        Integer num4 = null;
        while (true) {
            switch (C0034.m132(str2)) {
                case 56389:
                    i2 = i ^ (-36);
                    str2 = "ۤۥۦ";
                    objArr3 = new Object[4];
                    break;
                case 1746756:
                    objArr[3] = num2;
                    objN = C0178.n(65464, null, objArr);
                    str2 = "۠ۥۡ";
                    break;
                case 1746812:
                    i = C0041.f197;
                    str2 = "ۢۧ";
                    sArr2 = (short[]) objN;
                    break;
                case 1747809:
                    objArr3[2] = numValueOf2;
                    str2 = "ۥۥ۟";
                    num4 = 1423;
                    break;
                case 1747836:
                    objArr2 = new Object[1];
                    str2 = "ۣۢۨ";
                    str = (String) objN;
                    break;
                case 1747843:
                    objN = C0149.n(10590, null, new Object[0]);
                    str2 = "ۡۧۢ";
                    application = (Application) objN;
                    break;
                case 1748611:
                    i = C0060.f269;
                    str2 = "ۥۢۢ";
                    sArr = (short[]) objN;
                    break;
                case 1748860:
                    objN = C0149.n(92220, application, new Object[0]);
                    str2 = "ۦۣ۟";
                    break;
                case 1749703:
                    objArr2[0] = str;
                    objN = C0149.n(8011, classLoader, objArr2);
                    str2 = "ۤۨۡ";
                    break;
                case 1750753:
                    objArr[1] = num;
                    str2 = "ۥۦۨ";
                    numValueOf = Integer.valueOf(i2);
                    break;
                case 1751493:
                    objArr[0] = sArr;
                    str2 = "ۣۦۤ";
                    num = 540;
                    break;
                case 1751681:
                    str2 = "ۨۢۨ";
                    method = cls.getMethod((String) objN, null);
                    break;
                case 1751685:
                    objArr3[0] = sArr2;
                    str2 = "ۧۨ";
                    num3 = 580;
                    break;
                case 1751773:
                    Class cls2 = (Class) objN;
                    objN = C0195.n(97082) /*=> FishCrypto.short*/;
                    str2 = "ۣ۟۠";
                    cls = cls2;
                    break;
                case 1752549:
                    i2 = i ^ (-1002);
                    str2 = "ۤ۟۠";
                    objArr = new Object[4];
                    break;
                case 1752586:
                    objArr4[1] = null;
                    objN = C0149.n(96179, method, objArr4);
                    str2 = "ۨۧ۟";
                    break;
                case 1752639:
                    objArr3[3] = num4;
                    objN = C0149.n(61324, null, objArr3);
                    str2 = "ۤۥۢ";
                    break;
                case 1752679:
                    objArr[2] = numValueOf;
                    str2 = "۟ۡۦ";
                    num2 = 708;
                    break;
                case 1753418:
                    ClassLoader classLoader2 = (ClassLoader) objN;
                    objN = C0195.n(97082) /*=> FishCrypto.short*/;
                    str2 = "ۡ۟ۡ";
                    classLoader = classLoader2;
                    break;
                case 1755438:
                    Object[] objArr5 = new Object[2];
                    objArr5[0] = null;
                    str2 = "ۥۣۨ";
                    objArr4 = objArr5;
                    break;
                case 1755584:
                    return;
                default:
                    objArr3[1] = num3;
                    str2 = "۠ۤۥ";
                    numValueOf2 = Integer.valueOf(i2);
                    break;
            }
        }
    }

    public static void q() throws Throwable {
        boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
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
                    try {
                        C0178.n(99810, null, new Object[]{(Application) C0149.n(10590, null, new Object[0])});
                        break;
                    } catch (Throwable th) {
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
                    C0195.n(55304, null, new Object[0]);
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static void r() throws Throwable {
        c cVar = (c) C0195.n(90685, (AtomicReference) C0195.n(18109) /*=> FishCrypto.f*/, new Object[0]);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = cVar != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0195.n(87344, cVar, new Object[0])).booleanValue();
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
                                C0182.n(39712, null, new Object[]{cVar});
                                int iIntValue = ((Integer) C0178.n(64879, null, new Object[0])).intValue();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (iIntValue >= 0) {
                                                i3 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            C0195.n(38669, (PrintStream) C0195.n(72538) /*=> System.out*/, new Object[]{(Double) C0178.n(16623, null, new Object[]{(String) C0178.n(54580, null, new Object[]{(String) C0178.n(45098) /*=> raw:new String(new byte[]{(byte) 56, (byte) 78, (byte) 121, (byte) 119, (byte) 54, (byte) 71, (byte) 67,*/})})});
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
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
            return;
        }
        int i4 = 48767;
        while (true) {
            i4 ^= 48784;
            switch (i4) {
                case 14:
                    break;
                case 45:
                    return;
                case 76:
                    Object objN = C0198.n(8971, cVar);
                    int i5 = 48891;
                    while (true) {
                        i5 ^= 48908;
                        switch (i5) {
                            case 22:
                                break;
                            case 53:
                                return;
                            case 503:
                                if (objN != null) {
                                    i5 = 49635;
                                }
                                break;
                            case 32495:
                                String str = (String) C0198.n(97167, cVar);
                                int i6 = 49666;
                                while (true) {
                                    i6 ^= 49683;
                                    switch (i6) {
                                        case 17:
                                            if (str != null) {
                                                i6 = 49759;
                                            }
                                            break;
                                        case 50:
                                            break;
                                        case 76:
                                            boolean zBooleanValue2 = ((Boolean) C0182.n(86863, null, new Object[0])).booleanValue();
                                            int i7 = 49790;
                                            while (true) {
                                                i7 ^= 49807;
                                                switch (i7) {
                                                    case 18:
                                                        break;
                                                    case 51:
                                                        return;
                                                    case 84:
                                                        boolean zBooleanValue3 = ((Boolean) C0178.n(50362, (AtomicBoolean) C0178.n(35433, cVar), new Object[]{false, true})).booleanValue();
                                                        int i8 = 49914;
                                                        while (true) {
                                                            i8 ^= 49931;
                                                            switch (i8) {
                                                                case 497:
                                                                    if (!zBooleanValue3) {
                                                                        i8 = 50658;
                                                                    }
                                                                    break;
                                                                case 1711:
                                                                    break;
                                                                case 1736:
                                                                    try {
                                                                        C0178.n(94368, null, new Object[]{new a(0, cVar), Integer.valueOf(C0102.f311 ^ 979)});
                                                                        int i9 = 50813;
                                                                        while (true) {
                                                                            i9 ^= 50830;
                                                                            switch (i9) {
                                                                                case 18:
                                                                                    return;
                                                                                case 243:
                                                                                    i9 = 50844;
                                                                                    break;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        C0178.n(58539, (AtomicBoolean) C0178.n(35433, cVar), new Object[]{false});
                                                                        return;
                                                                    }
                                                                    break;
                                                                case 1769:
                                                                    int i10 = 50689;
                                                                    while (true) {
                                                                        i10 ^= 50706;
                                                                        switch (i10) {
                                                                            case 19:
                                                                                i10 = 50720;
                                                                                break;
                                                                            case 50:
                                                                                return;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i8 = 50627;
                                                        }
                                                        break;
                                                    case 241:
                                                        if (zBooleanValue2) {
                                                            i7 = 49883;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i7 = 49852;
                                            }
                                            break;
                                        case 83:
                                            return;
                                        default:
                                            continue;
                                    }
                                    i6 = 49728;
                                }
                                break;
                            default:
                                continue;
                        }
                        i5 = 48953;
                    }
                    break;
                case 239:
                    if (cVar != null) {
                        i4 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i4 = 48829;
        }
    }

    public static byte[] s(String str, String str2, byte[] bArr) {
        boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
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
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (bArr != null) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                int length = bArr.length;
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (length == 0) {
                                                i3 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            try {
                                                return (byte[]) C0178.n(6252, null, new Object[]{str, str2, bArr});
                                            } catch (Throwable th) {
                                                int i4 = 48891;
                                                while (true) {
                                                    i4 ^= 48908;
                                                    switch (i4) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i4 = 48922;
                                                            break;
                                                    }
                                                }
                                            }
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
        return null;
    }

    public static byte[] t(String str, String str2, String str3, String str4, byte[] bArr) {
        boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
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
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (bArr != null) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                int length = bArr.length;
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (length == 0) {
                                                i3 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            try {
                                                return (byte[]) C0178.n(9589, null, new Object[]{str, str2, str3, str4, bArr});
                                            } catch (Throwable th) {
                                                int i4 = 48891;
                                                while (true) {
                                                    i4 ^= 48908;
                                                    switch (i4) {
                                                        case 22:
                                                            break;
                                                        case 503:
                                                            i4 = 48922;
                                                            break;
                                                    }
                                                }
                                            }
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
        return null;
    }

    public static String u(String str, String str2) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (str2 != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0178.n(49780, (Matcher) C0178.n(2458, (Pattern) C0178.n(1139) /*=> FishCrypto.d*/, new Object[]{str2}), new Object[0])).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (zBooleanValue) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                String str3 = (String) C0178.n(44143, null, new Object[]{str, str2});
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = 48674;
                                            break;
                                        case 47483:
                                            return str3;
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
        return (String) C0195.n(43185) /*=> raw:new String(new byte[0])*/;
    }

    public static String v(String str) {
        boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
        String str2 = (String) C0195.n(43185) /*=> raw:new String(new byte[0])*/;
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
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (str != null) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return str2;
                            case 500:
                                int iIntValue = ((Integer) C0149.n(89092, str, new Object[0])).intValue();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (iIntValue == 0) {
                                                i3 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            try {
                                                String str3 = (String) C0178.n(92164, null, new Object[]{str});
                                                int i4 = 48891;
                                                while (true) {
                                                    i4 ^= 48908;
                                                    switch (i4) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            return str3;
                                                        case 503:
                                                            i4 = str3 == null ? 49635 : 48953;
                                                            break;
                                                        case 32495:
                                                            int i5 = 49666;
                                                            while (true) {
                                                                i5 ^= 49683;
                                                                switch (i5) {
                                                                    case 17:
                                                                        i5 = 49697;
                                                                        break;
                                                                    case 50:
                                                                        return str2;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                int i6 = 49790;
                                                while (true) {
                                                    i6 ^= 49807;
                                                    switch (i6) {
                                                        case 18:
                                                            return str2;
                                                        case 241:
                                                            i6 = 49821;
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 47417:
                                            int i7 = 48767;
                                            while (true) {
                                                i7 ^= 48784;
                                                switch (i7) {
                                                    case 14:
                                                        return str2;
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
                    break;
                case 239:
                    return str2;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static String w(String str, String str2) {
        int i;
        String str3;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = str2 != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0178.n(49780, (Matcher) C0178.n(2458, (Pattern) C0178.n(1139) /*=> FishCrypto.d*/, new Object[]{str2}), new Object[0])).booleanValue();
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
                                i = -1;
                                break;
                            case 500:
                                int iIntValue = ((Integer) C0152.n(41658, str2, new Object[]{(String) C0152.n(39710, null, new Object[]{(short[]) C0195.n(97082) /*=> FishCrypto.short*/, 584, Integer.valueOf(C0024.f180 ^ (-564)), 472})})).intValue();
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = 48674;
                                            continue;
                                        case 47483:
                                            i = iIntValue;
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
                    i = -1;
                    break;
                default:
                    break;
            }
        }
        int i5 = 48767;
        while (true) {
            i5 ^= 48784;
            switch (i5) {
                case 14:
                    break;
                case 45:
                    String str4 = (String) C0152.n(54243, null, new Object[]{str});
                    boolean zBooleanValue2 = ((Boolean) C0195.n(5730, str4, new Object[0])).booleanValue();
                    int i6 = 48891;
                    while (true) {
                        i6 ^= 48908;
                        switch (i6) {
                            case 22:
                                break;
                            case 53:
                                StringBuilder sb = new StringBuilder();
                                str3 = (String) C0198.n(89992, sb, new Object[0]);
                                break;
                            case 503:
                                if (zBooleanValue2) {
                                    i6 = 49635;
                                }
                                break;
                            case 32495:
                                str3 = (String) C0195.n(43185) /*=> raw:new String(new byte[0])*/;
                                int i7 = 49666;
                                while (true) {
                                    i7 ^= 49683;
                                    switch (i7) {
                                        case 17:
                                            i7 = 49697;
                                            break;
                                        case 50:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i6 = 48953;
                    }
                    return str3;
                case 76:
                    return str2;
                case 239:
                    if (i < 0) {
                        i5 = 48860;
                    }
                    break;
                default:
                    continue;
            }
            i5 = 48829;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x001f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0030. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0047. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    public static String x(int i) {
        String str;
        String[] strArr = (String[]) C0178.n(72673) /*=> FishCrypto.c*/;
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = strArr != null ? 1709 : 1678;
                    break;
                case 204:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = i >= 0 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                int length = strArr.length;
                                int i4 = 1864;
                                while (true) {
                                    i4 ^= 1881;
                                    switch (i4) {
                                        case 17:
                                            i4 = i < length ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            str = strArr[i];
                                            int i5 = 48767;
                                            while (true) {
                                                i5 ^= 48784;
                                                switch (i5) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        break;
                                                    case 239:
                                                        i5 = str != null ? 48860 : 48829;
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
            return str;
        }
        boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
        str = (String) C0195.n(43185) /*=> raw:new String(new byte[0])*/;
        int i6 = 48891;
        while (true) {
            i6 ^= 48908;
            switch (i6) {
                case 22:
                    break;
                case 53:
                    String str2 = (String) C0152.n(94271, null, new Object[]{Integer.valueOf(i)});
                    int i7 = 49666;
                    while (true) {
                        i7 ^= 49683;
                        switch (i7) {
                            case 17:
                                i7 = str2 == null ? 49759 : 49728;
                                break;
                            case 50:
                                break;
                            case 76:
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
                                str = str2;
                                break;
                            default:
                                break;
                        }
                    }
                    int i9 = 49914;
                    while (true) {
                        i9 ^= 49931;
                        switch (i9) {
                            case 497:
                                if (strArr != null) {
                                    i9 = 50658;
                                }
                                break;
                            case 1711:
                                break;
                            case 1736:
                                break;
                            case 1769:
                                int i10 = 50689;
                                while (true) {
                                    i10 ^= 50706;
                                    switch (i10) {
                                        case 19:
                                            if (i >= 0) {
                                                i10 = 50782;
                                            }
                                            break;
                                        case 45:
                                            break;
                                        case 50:
                                            break;
                                        case 76:
                                            int length2 = strArr.length;
                                            int i11 = 50813;
                                            while (true) {
                                                i11 ^= 50830;
                                                switch (i11) {
                                                    case 18:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 243:
                                                        if (i < length2) {
                                                            i11 = 51557;
                                                        }
                                                        break;
                                                    case 4075:
                                                        strArr[i] = str;
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i11 = 50875;
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i10 = 50751;
                                }
                                break;
                            default:
                                continue;
                        }
                        i9 = 50627;
                    }
                    break;
                case 503:
                    if (!zBooleanValue) {
                        i6 = 49635;
                    }
                    break;
                case 32495:
                    break;
                default:
                    continue;
            }
            i6 = 48953;
        }
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x011b. Please report as an issue. */
    public static void y(int... iArr) throws Throwable {
        boolean zBooleanValue = ((Boolean) C0149.n(12776) /*=> FishCrypto.a*/).booleanValue();
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
                    int iIntValue = ((Integer) C0152.n(59802, null, new Object[0])).intValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (iIntValue >= 0) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case 500:
                                C0152.n(87951, (PrintStream) C0195.n(72538) /*=> System.out*/, new Object[]{Float.valueOf(((Float) C0152.n(24313, null, new Object[]{(String) C0152.n(74755, null, new Object[]{(String) C0152.n(79652) /*=> raw:new String(new byte[]{(byte) 75, (byte) 80, (byte) 67, (byte) 54, (byte) 75, (byte) 101, (byte) 117}*/})})).floatValue())});
                                return;
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    int iIntValue2 = ((Integer) C0152.n(27046, null, new Object[0])).intValue();
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                if (iIntValue2 <= 0) {
                                    i3 = 48736;
                                }
                                break;
                            case 47384:
                                String[] strArr = (String[]) C0178.n(72673) /*=> FishCrypto.c*/;
                                int i4 = 48767;
                                while (true) {
                                    i4 ^= 48784;
                                    switch (i4) {
                                        case 14:
                                            break;
                                        case 45:
                                            break;
                                        case 76:
                                            synchronized (FishCrypto.class) {
                                                try {
                                                    String[] strArr2 = (String[]) C0178.n(72673) /*=> FishCrypto.c*/;
                                                    int i5 = 48891;
                                                    while (true) {
                                                        i5 ^= 48908;
                                                        switch (i5) {
                                                            case 22:
                                                                break;
                                                            case 53:
                                                                break;
                                                            case 503:
                                                                i5 = strArr2 == null ? 49635 : 48953;
                                                                break;
                                                            case 32495:
                                                                c = new String[iIntValue2];
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
                                                    break;
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
                                            }
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
                                        case 239:
                                            i4 = strArr == null ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int length = iArr.length;
                                int i9 = 0;
                                while (true) {
                                    int i10 = 50689;
                                    while (true) {
                                        i10 ^= 50706;
                                        switch (i10) {
                                            case 19:
                                                i10 = i9 < length ? 50782 : 50751;
                                                break;
                                            case 45:
                                                break;
                                            case 50:
                                                break;
                                            case 76:
                                                break;
                                            default:
                                                break;
                                        }
                                        return;
                                    }
                                    int i11 = iArr[i9];
                                    int i12 = 50813;
                                    while (true) {
                                        i12 ^= 50830;
                                        switch (i12) {
                                            case 18:
                                                break;
                                            case 53:
                                                break;
                                            case 243:
                                                i12 = i11 >= 0 ? 51557 : 50875;
                                                break;
                                            case 4075:
                                                int i13 = 51588;
                                                while (true) {
                                                    i13 ^= 51605;
                                                    switch (i13) {
                                                        case 17:
                                                            i13 = i11 < iIntValue2 ? 51681 : 51650;
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
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    int i14 = (C0054.f210 ^ (-652)) + i9;
                                    int i15 = 51712;
                                    while (true) {
                                        i15 ^= 51729;
                                        switch (i15) {
                                            case 17:
                                                i15 = 51743;
                                                break;
                                        }
                                    }
                                    i9 = i14;
                                }
                                break;
                            case 47417:
                                return;
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
}
