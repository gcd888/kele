package com.github.catvod.spider.merge.p000a;

import android.graphics.Bitmap;
import android.os.Looper;
import com.github.catvod.spider.C0141;
import com.github.catvod.spider.FanShu;
import com.github.catvod.spider.merge.A.C0002;
import com.github.catvod.spider.merge.B.C0004;
import com.github.catvod.spider.merge.D.C0012;
import com.github.catvod.spider.merge.E.C0013;
import com.github.catvod.spider.merge.E.C0015;
import com.github.catvod.spider.merge.G.C0020;
import com.github.catvod.spider.merge.G.C0023;
import com.github.catvod.spider.merge.G.C0024;
import com.github.catvod.spider.merge.K.C0029;
import com.github.catvod.spider.merge.K.a;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.N.C0037;
import com.github.catvod.spider.merge.O.C0038;
import com.github.catvod.spider.merge.O.C0039;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.X.C0052;
import com.github.catvod.spider.merge.b0.C0060;
import com.github.catvod.spider.merge.b0.C0061;
import com.github.catvod.spider.merge.c0.C0065;
import com.github.catvod.spider.merge.d0.C0068;
import com.github.catvod.spider.merge.e0.C0075;
import com.github.catvod.spider.merge.f0.C0077;
import com.github.catvod.spider.merge.k0.C0099;
import com.github.catvod.spider.merge.p0.C0110;
import com.github.catvod.spider.merge.p0.C0111;
import com.github.catvod.spider.merge.p001b.C0058;
import com.github.catvod.spider.merge.p003d.C0067;
import com.github.catvod.spider.merge.p007h.C0083;
import com.github.catvod.spider.merge.p007h.C0084;
import com.github.catvod.spider.merge.p008i.C0088;
import com.github.catvod.spider.merge.p013o.C0108;
import com.github.catvod.spider.merge.p016t.C0121;
import com.github.catvod.spider.merge.p017u.C0129;
import com.github.catvod.spider.merge.p017u.M;
import com.github.catvod.spider.merge.p018v.C0132;
import com.github.catvod.spider.merge.p020x.C0136;
import com.github.catvod.spider.merge.p020x.C0138;
import com.github.catvod.spider.merge.p022z.InterfaceC0549p0;
import com.github.catvod.spider.merge.p022z.InterfaceC0555q1;
import com.github.catvod.spider.merge.p022z.InterfaceC0578v0;
import com.github.catvod.spider.merge.p022z.O2;
import com.github.catvod.spider.merge.p022z.S3;
import com.github.catvod.spider.merge.p022z.Y3;
import com.github.catvod.spider.merge.p022z.Z2;
import com.github.catvod.spider.merge.p022z.Z3;
import com.github.catvod.spider.merge.q0.C0113;
import com.github.catvod.spider.merge.t0.C0124;
import com.github.catvod.utils.C0144;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import moyu.fucking.C0146;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0153;
import moyu.fucking.C0155;
import moyu.fucking.C0157;
import moyu.fucking.C0159;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0178;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0188;
import moyu.fucking.C0189;
import moyu.fucking.C0192;
import moyu.fucking.C0193;
import moyu.fucking.C0194;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0199;
import moyu.fucking.C0202;
import moyu.fucking.C0209;
import moyu.fucking.C0213;
import moyu.fucking.C0215;
import moyu.fucking.C0216;
import moyu.fucking.C0217;
import moyu.fucking.C0221;
import moyu.fucking.C0224;
import moyu.fucking.C0226;
import moyu.fucking.C0233;
import okhttp3.Cookie;
import okhttp3.Dns;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class C0359j implements a, Dns, FanShu.CaptchaPrompter, InterfaceC0578v0, InterfaceC0555q1, Z2, InterfaceC0549p0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f239short = {1276, 1268, 19014, 22044, 1181, 692, 680, 699, 24425, 22807, 24715, 1727, 31780, 1726, 1682, 1682, 1686, 1684, 1688, -25487, -29380, -26905, -30406, -1551, 23311, 28806, 22952, 780, 31127, 781, 801, 801, 805, 807, 811, 25700, -27820, -29559, 30005, 23579, -26174, -30577, -958, 24252, 19603, 30231, 20689, -29080, 20665, 2564, 2580, 2585, 2578, 2579, 2586, 30893, 21502, 20423, 30606, 20667, -30057, 23716, 20107, 23054, 22831, -31997, 27938, 28042, 18165, 21104, 20505, -31731, 2322, 2312, 1888, 1890, 1890, 1892, 1906, 1906, 1886, 1909, 1902, 1898, 1892, 1903, 25886, 25045, 1730, 1785, 1789, 1779, 1784, 25462, 25566, 1964, 1979, 1976, 1964, 1979, 1965, 1974, 1921, 1962, 1969, 1973, 1979, 1968, 2856, 2857, 2874, 2853, 2863, 2857, 2835, 2853, 2856, 27004, 28087, 2720, 2715, 2719, 2705, 2714, 22278, 17705, 20908, 20620, -24600, 401, 426, 430, 416, 427, 23607, 19992, 23197, 3301, 3294, 3290, 3284, 3295, 26961, 27129, 17360, 22357, 21820, -32472, 3127, 3117, -30064, -27742, 31236, 29581, 1281, 1338, 1342, 1328, 1339, 22695, 19080, 24077, 2123, 2160, 2164, 2170, 2161, 28159, 27991, -2285, -24801, 23322, 23604, 2174, 2172, 2172, 2170, 2156, 2156, 2112, 2155, 2160, 2164, 2170, 2161, 23699, 2157, 2170, 2169, 2157, 2170, 2156, 2167, 2112, 2155, 2160, 2164, 2170, 2161, 19796, 22993, 23480, -28756, 691, 681, 973, 976, 1059, 1354, 2662, 2686, 2687, 2680, 2660, 2638, 2672, 2660, 2661, 2686, 2638, 2674, 2681, 2676, 2674, 2682, 2680, 2687, -29812, 22734, 28952, 22614, 22420, 21862, 24137, -29264, 24306, 30500, 24170, 20904, 23849, -26185, 18138, 20964, 32318, 24791, 24544, 24464, 27952, 28056, 32124, -24837, 28891, 28210, 20741, 20853, 25557, 25469, 26142, 29364, 29347, 27722, 21373, 21261, 25005, 24837, 25256, 21540, 29497, 28112, 21223, 21143, 24631, 24735, 2902, 2919, 2938, 2934, 2881, 2915, 2930, 2934, 2913, 2922, 2915, 2886, 2923, 2915, 2926, 2925, 2917, 2860, 2929, 2922, 2925, 2933, 2850, 2927, 2935, 2929, 2934, 2850, 2928, 2935, 2924, 2850, 2925, 2924, 2850, 2915, 2850, 2933, 2925, 2928, 2921, 2919, 2928, 2850, 2934, 2922, 2928, 2919, 2915, 2918, 739, 684, 681, 696};
    public final int a;

    public /* synthetic */ C0359j(int i) throws Throwable {
        this.a = i;
        int iIntValue = ((Integer) C0168.n(13558, null, new Object[0])).intValue();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (iIntValue >= 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0152.n(66570, null, new Object[]{(String) C0233.n(26450, null, new Object[]{(String) C0146.n(54130)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    public static void e(int i) throws Throwable {
        Object objN = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr = null;
        Object[] objArr = null;
        Integer num = null;
        Integer numValueOf = null;
        Integer num2 = null;
        String str = null;
        short[] sArr2 = null;
        Object[] objArr2 = null;
        Integer num3 = null;
        Integer numValueOf2 = null;
        Integer num4 = null;
        String str2 = null;
        Object[] objArr3 = null;
        Integer numValueOf3 = null;
        M m = null;
        Object[] objArr4 = null;
        String str3 = "ۨۦۧ";
        String str4 = null;
        while (true) {
            switch (C0034.m132(str3)) {
                case 56358:
                    i2 = C0037.f193;
                    i4 = i2 ^ 806;
                    str3 = "ۧۡۨ";
                    break;
                case 56571:
                    objArr3 = new Object[3];
                    str3 = "ۢۢۢ";
                    str2 = (String) objN;
                    break;
                case 1746882:
                    i3 = C0088.f297;
                    str3 = "ۡۥ۠";
                    sArr2 = (short[]) objN;
                    break;
                case 1747745:
                    objArr[2] = numValueOf;
                    str3 = "ۡۢۥ";
                    num2 = 1213;
                    break;
                case 1747807:
                    i2 = i * i3;
                    i3 = C0058.f267;
                    str3 = "ۧ۠۠";
                    break;
                case 1748643:
                    objArr2[0] = sArr2;
                    str3 = "ۦۥۥ";
                    num3 = 5;
                    break;
                case 1748708:
                    objArr[3] = num2;
                    objN = C0152.n(85600, null, objArr);
                    str3 = "ۣۢۥ";
                    break;
                case 1748796:
                    i4 = i3 ^ 493;
                    str3 = "ۡ۠ۢ";
                    objArr2 = new Object[4];
                    break;
                case 1748835:
                    objArr3[1] = numValueOf3;
                    objArr3[2] = str2;
                    str3 = "ۣۢۦ";
                    break;
                case 1748861:
                    return;
                case 1749666:
                    objArr3[0] = str;
                    str3 = "ۡۦۨ";
                    numValueOf3 = Integer.valueOf(i);
                    break;
                case 1749700:
                    String str5 = (String) objN;
                    objN = C0146.n(17227);
                    str3 = "۟ۥۨ";
                    str = str5;
                    break;
                case 1750566:
                    m = new M(i2, str4, i4);
                    str3 = "ۨ۠ۥ";
                    objArr4 = new Object[1];
                    break;
                case 1750630:
                    objArr2[3] = num4;
                    objN = C0162.n(59839, null, objArr2);
                    str3 = "ۣۨ";
                    break;
                case 1750631:
                    objN = C0194.n(49193, null, objArr3);
                    str3 = "ۨۤ۟";
                    str4 = (String) objN;
                    break;
                case 1750812:
                    i4 = i3 ^ (-965);
                    str3 = "ۥۦۥ";
                    objArr = new Object[4];
                    break;
                case 1751771:
                    i2 = C0002.f158;
                    i3 = i2 ^ 569;
                    str3 = "ۣ۠ۤ";
                    break;
                case 1752676:
                    objArr[0] = sArr;
                    str3 = "ۦۦ۟";
                    num = 0;
                    break;
                case 1753606:
                    objArr2[1] = num3;
                    str3 = "۟ۤ۟";
                    numValueOf2 = Integer.valueOf(i4);
                    break;
                case 1753631:
                    objArr[1] = num;
                    str3 = "ۣ۠ۢ";
                    numValueOf = Integer.valueOf(i4);
                    break;
                case 1753632:
                    i3 = C0060.f269;
                    str3 = "ۣۨۡ";
                    sArr = (short[]) objN;
                    break;
                case 1754407:
                    i4 = i3 ^ 100;
                    i3 = i2 / i4;
                    str3 = "ۡۧ";
                    break;
                case 1754446:
                    i2 = i3 + i4;
                    objN = C0146.n(17227);
                    str3 = "ۦۦ۠";
                    break;
                case 1755373:
                    objArr4[0] = m;
                    C0152.n(52927, null, objArr4);
                    str3 = "ۣۡۧ";
                    break;
                case 1755491:
                    i3 = C0037.f193;
                    i4 = i3 ^ 808;
                    str3 = "ۣۣ۠";
                    break;
                case 1755561:
                    objN = C0192.n(49125);
                    str3 = "ۤۨ۟";
                    break;
                default:
                    objArr2[2] = numValueOf2;
                    str3 = "ۣۢۥ";
                    num4 = 667;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:356:0x0719 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x076c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x0718 A[DONT_GENERATE, SYNTHETIC] */
    @Override // com.github.catvod.spider.merge.p022z.Z2
    public void a(String str) throws Throwable {
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        switch (((Integer) C0146.n(3602, this)).intValue()) {
            case 23:
                try {
                    C0146.n(51041, (l1) C0155.n(18235, null, new Object[0]), new Object[]{str});
                    boolean zBooleanValue = ((Boolean) C0155.n(85425, (l1) C0155.n(18235, null, new Object[0]), new Object[0])).booleanValue();
                    int i2 = 55432;
                    while (true) {
                        i2 ^= 55449;
                        switch (i2) {
                            case 17:
                                if (zBooleanValue) {
                                    i2 = 55525;
                                }
                                break;
                            case 62:
                                break;
                            case 95:
                                C0188.n(1950, null, new Object[]{(String) C0209.n(32662, null, new Object[]{(short[]) C0146.n(17227), 162, Integer.valueOf(C0034.f190 ^ 161), 2079})});
                                int i3 = 56455;
                                while (true) {
                                    i3 ^= 56472;
                                    switch (i3) {
                                        case 31:
                                            i3 = 56486;
                                            continue;
                                        case 62:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i = 55680;
                                    while (true) {
                                        i ^= 55697;
                                        switch (i) {
                                            case 17:
                                                i = 56362;
                                                break;
                                            case 1467:
                                                C0213.n(55886, null, new Object[]{e, new StringBuilder((String) C0149.n(56487, null, new Object[]{(short[]) C0146.n(17227), 199, Integer.valueOf(C0037.f193 ^ 810), 649}))});
                                                return;
                                        }
                                    }
                                }
                                break;
                            case 124:
                                C0188.n(1950, null, new Object[]{(String) C0224.n(99346, null, new Object[]{(short[]) C0146.n(17227), 150, Integer.valueOf(C0013.f169 ^ 659), 1365})});
                                int i4 = 55556;
                                while (true) {
                                    i4 ^= 55573;
                                    switch (i4) {
                                        case 17:
                                            i4 = 55587;
                                            continue;
                                        case 54:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i = 55680;
                                    while (true) {
                                        i ^= 55697;
                                        switch (i) {
                                            case 17:
                                                i = 56362;
                                                break;
                                            case 1467:
                                                C0213.n(55886, null, new Object[]{e, new StringBuilder((String) C0149.n(56487, null, new Object[]{(short[]) C0146.n(17227), 199, Integer.valueOf(C0037.f193 ^ 810), 649}))});
                                                return;
                                        }
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i2 = 55494;
                    }
                    return;
                } catch (Exception e) {
                    i = 55680;
                    while (true) {
                        i ^= 55697;
                        switch (i) {
                            case 17:
                                i = 56362;
                                break;
                            case 1467:
                                C0213.n(55886, null, new Object[]{e, new StringBuilder((String) C0149.n(56487, null, new Object[]{(short[]) C0146.n(17227), 199, Integer.valueOf(C0037.f193 ^ 810), 649}))});
                                return;
                        }
                    }
                }
                break;
            case 24:
                try {
                    boolean zBooleanValue2 = ((Boolean) C0146.n(26404, (C0342a0) C0146.n(28945), new Object[]{str})).booleanValue();
                    int i5 = 53634;
                    while (true) {
                        i5 ^= 53651;
                        switch (i5) {
                            case 17:
                                i5 = zBooleanValue2 ? 53727 : 53696;
                                break;
                            case 50:
                                break;
                            case 76:
                                str2 = (String) C0149.n(36390, null, new Object[]{(short[]) C0146.n(17227), 127, Integer.valueOf(C0132.f341 ^ (-11)), 453});
                                int i6 = 53758;
                                while (true) {
                                    i6 ^= 53775;
                                    switch (i6) {
                                        case 1009:
                                            i6 = 54440;
                                            continue;
                                        case 1703:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 83:
                                str2 = (String) C0198.n(94433, null, new Object[]{(short[]) C0146.n(17227), 137, Integer.valueOf(C0144.f354 ^ (-606)), 3249});
                                break;
                            default:
                                break;
                        }
                    }
                    C0188.n(1950, null, new Object[]{str2});
                    int i7 = 54657;
                    while (true) {
                        i7 ^= 54674;
                        switch (i7) {
                            case 19:
                                i7 = 54688;
                                break;
                            case 50:
                                return;
                        }
                    }
                } catch (Exception e2) {
                    int i8 = 54533;
                    while (true) {
                        i8 ^= 54550;
                        switch (i8) {
                            case 19:
                                i8 = 54564;
                                break;
                            case 50:
                                C0213.n(55886, null, new Object[]{e2, new StringBuilder((String) C0149.n(34115, null, new Object[]{(short[]) C0146.n(17227), 144, Integer.valueOf(C0004.f160 ^ (-342)), 3085}))});
                                return;
                        }
                    }
                }
                break;
            case 25:
                b1 b1Var = (b1) C0193.n(55289, (Z0) C0146.n(91590, null, new Object[0]));
                synchronized (b1Var) {
                    try {
                        boolean zBooleanValue3 = ((Boolean) C0189.n(4909, null, new Object[]{str})).booleanValue();
                        int i9 = 49914;
                        while (true) {
                            i9 ^= 49931;
                            switch (i9) {
                                case 497:
                                    i9 = zBooleanValue3 ? 50658 : 50627;
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    Map map = (Map) C0226.n(56771, null, new Object[]{(String) C0149.n(92089, str, new Object[0])});
                                    int i10 = 50813;
                                    while (true) {
                                        i10 ^= 50830;
                                        switch (i10) {
                                            case 18:
                                                break;
                                            case 53:
                                                String str6 = (String) C0159.n(80165, null, new Object[]{(String) C0149.n(60368, null, new Object[]{(short[]) C0146.n(17227), 74, Integer.valueOf(C0136.f345 ^ 733), 1793}), map});
                                                boolean zBooleanValue4 = ((Boolean) C0189.n(4909, null, new Object[]{str6})).booleanValue();
                                                int i11 = 51712;
                                                while (true) {
                                                    i11 ^= 51729;
                                                    switch (i11) {
                                                        case 14:
                                                            break;
                                                        case 17:
                                                            i11 = zBooleanValue4 ? 51805 : 51774;
                                                            break;
                                                        case 47:
                                                            b1Var.b = str6;
                                                            b1Var.c = (String) C0159.n(80165, null, new Object[]{(String) C0224.n(58480, null, new Object[]{(short[]) C0146.n(17227), 95, Integer.valueOf(C0023.f179 ^ 694), 2014}), map});
                                                            String str7 = (String) C0159.n(80165, null, new Object[]{(String) C0198.n(6303, null, new Object[]{(short[]) C0146.n(17227), 108, Integer.valueOf(C0065.f274 ^ 26), 2892}), map});
                                                            boolean zBooleanValue5 = ((Boolean) C0189.n(62984, null, new Object[]{new CharSequence[]{str7}})).booleanValue();
                                                            int i12 = 52611;
                                                            while (true) {
                                                                i12 ^= 52628;
                                                                switch (i12) {
                                                                    case 23:
                                                                        i12 = zBooleanValue5 ? 52704 : 52673;
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 85:
                                                                        break;
                                                                    case 116:
                                                                        b1Var.a = str7;
                                                                        int i13 = 52735;
                                                                        while (true) {
                                                                            i13 ^= 52752;
                                                                            switch (i13) {
                                                                                case 14:
                                                                                    break;
                                                                                case 1007:
                                                                                    i13 = 52766;
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
                                                            C0199.n(1995, b1Var, new Object[0]);
                                                            str3 = (String) C0162.n(41206, null, new Object[]{(short[]) C0146.n(17227), 117, Integer.valueOf(C0099.f308 ^ 818), 2804});
                                                            break;
                                                        case 76:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 243:
                                                i10 = map == null ? 51557 : 50875;
                                                break;
                                            case 4075:
                                                int i14 = 51588;
                                                while (true) {
                                                    i14 ^= 51605;
                                                    switch (i14) {
                                                        case 17:
                                                            i14 = 51619;
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
                                case 1769:
                                    int i15 = 50689;
                                    while (true) {
                                        i15 ^= 50706;
                                        switch (i15) {
                                            case 19:
                                                i15 = 50720;
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
                        str3 = (String) C0224.n(67549, null, new Object[]{(short[]) C0146.n(17227), 86, Integer.valueOf(C0110.f319 ^ (-555)), 1686});
                        int i16 = 51836;
                        while (true) {
                            i16 ^= 51853;
                            switch (i16) {
                                case 241:
                                    i16 = 52518;
                                    continue;
                                case 1963:
                                    break;
                                default:
                                    continue;
                            }
                        }
                    } catch (Throwable th) {
                        int i17 = 53510;
                        while (true) {
                            i17 ^= 53527;
                            switch (i17) {
                                case 17:
                                    i17 = 53541;
                                    break;
                                case 50:
                                    throw th;
                            }
                        }
                    }
                }
                C0188.n(1950, null, new Object[]{str3});
                return;
            case 26:
                try {
                    boolean zBooleanValue6 = ((Boolean) C0146.n(75722, (t1) C0146.n(39992, null, new Object[0]), new Object[]{str})).booleanValue();
                    C0153.n(4962, null, new Object[]{(String) C0157.n(78385, null, new Object[]{(short[]) C0146.n(17227), 49, Integer.valueOf(C0113.f322 ^ 83), 2685})});
                    int i18 = 48767;
                    while (true) {
                        i18 ^= 48784;
                        switch (i18) {
                            case 14:
                                break;
                            case 45:
                                str4 = (String) C0198.n(74142, null, new Object[]{(short[]) C0146.n(17227), 64, Integer.valueOf(C0099.f308 ^ 828), 2242});
                                break;
                            case 76:
                                str4 = (String) C0157.n(78385, null, new Object[]{(short[]) C0146.n(17227), 55, Integer.valueOf(C0004.f160 ^ (-347)), 342});
                                int i19 = 48891;
                                while (true) {
                                    i19 ^= 48908;
                                    switch (i19) {
                                        case 22:
                                            break;
                                        case 503:
                                            i19 = 48922;
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            case 239:
                                i18 = zBooleanValue6 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    C0188.n(1950, null, new Object[]{str4});
                    int i20 = 49790;
                    while (true) {
                        i20 ^= 49807;
                        switch (i20) {
                            case 18:
                                return;
                            case 241:
                                i20 = 49821;
                                break;
                        }
                    }
                } catch (Exception e3) {
                    int i21 = 49666;
                    while (true) {
                        i21 ^= 49683;
                        switch (i21) {
                            case 17:
                                i21 = 49697;
                                break;
                            case 50:
                                C0213.n(55886, null, new Object[]{e3, new StringBuilder((String) C0182.n(27462, null, new Object[]{(short[]) C0146.n(17227), 68, Integer.valueOf(C0013.f169 ^ 665), 2344}))});
                                return;
                        }
                    }
                }
                break;
            case 27:
            default:
                boolean zBooleanValue7 = ((Boolean) C0146.n(32636, (A) C0146.n(68715, null, new Object[0]), new Object[]{str, Long.valueOf(925 ^ ((long) C0061.f270)), Long.valueOf(387 ^ ((long) C0084.f293)), 0L, null})).booleanValue();
                int i22 = 1616;
                while (true) {
                    i22 ^= 1633;
                    switch (i22) {
                        case 14:
                            break;
                        case 49:
                            i22 = zBooleanValue7 ? 1709 : 1678;
                            break;
                        case 204:
                            str5 = (String) C0195.n(99405, null, new Object[]{(short[]) C0146.n(17227), 11, Integer.valueOf(C0111.f320 ^ (-948)), 1789});
                            int i23 = 1740;
                            while (true) {
                                i23 ^= 1757;
                                switch (i23) {
                                    case 17:
                                        i23 = 1771;
                                        continue;
                                    case 54:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 239:
                            str5 = (String) C0182.n(27462, null, new Object[]{(short[]) C0146.n(17227), 27, Integer.valueOf(C0138.f347 ^ 286), 846});
                            break;
                        default:
                            break;
                    }
                }
                C0188.n(1950, null, new Object[]{str5});
                return;
            case 28:
                C0152.n(52927, null, new Object[]{new RunnableC0383v0(C0039.f195 ^ 793, ((Boolean) C0146.n(95362, null, new Object[]{str})).booleanValue())});
                int iIntValue = ((Integer) C0216.n(24482, null, new Object[0])).intValue();
                int i24 = 1864;
                while (true) {
                    i24 ^= 1881;
                    switch (i24) {
                        case 17:
                            if (iIntValue <= 0) {
                                i24 = 48736;
                            }
                            break;
                        case 47384:
                            return;
                        case 47417:
                            C0195.n(19817, (PrintStream) C0195.n(72538), new Object[]{Integer.valueOf(((Integer) C0195.n(60398, null, new Object[]{(String) C0152.n(74755, null, new Object[]{(String) C0146.n(53904)})})).intValue())});
                            return;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i24 = 48705;
                }
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0549p0
    public void b(String str, String str2) throws Throwable {
        C0157.n(96203, null, new Object[]{new O2(str, 1, str2)});
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
                    C0157.n(99237, (PrintStream) C0195.n(72538), new Object[]{Double.valueOf(((Double) C0157.n(3141, null, new Object[]{(String) C0181.n(74690, null, new Object[]{(String) C0146.n(97898)})})).doubleValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0555q1
    public void c(String str, boolean z) throws Throwable {
        C0152.n(52927, null, new Object[]{new com.github.catvod.spider.merge.p019w.a(str, C0108.f317 ^ (-374))});
        int iIntValue = ((Integer) C0168.n(82191, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0215.n(38777, null, new Object[]{(String) C0146.n(99860)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    @Override // com.github.catvod.spider.merge.K.a
    public Object d(Object obj) throws Throwable {
        String str = (String) C0198.n(94433, null, new Object[]{(short[]) C0146.n(17227), 205, Integer.valueOf(C0042.f198 ^ 57), 932});
        switch (((Integer) C0146.n(3602, this)).intValue()) {
            case 0:
                com.github.catvod.spider.merge.F.a aVar = (com.github.catvod.spider.merge.F.a) obj;
                C0159.n(35468, null, new Object[]{aVar, str});
                StringBuilder sb = new StringBuilder();
                return (String) C0198.n(89992, sb, new Object[0]);
            case 1:
                Cookie cookie = (Cookie) obj;
                StringBuilder sb2 = new StringBuilder();
                return (String) C0198.n(89992, sb2, new Object[0]);
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                C0159.n(35468, null, new Object[]{entry, str});
                StringBuilder sb3 = new StringBuilder();
                return (String) C0198.n(89992, sb3, new Object[0]);
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                C0159.n(35468, null, new Object[]{entry2, str});
                StringBuilder sb4 = new StringBuilder();
                return (String) C0198.n(89992, sb4, new Object[0]);
        }
    }

    public String f() {
        switch (((Integer) C0146.n(3602, this)).intValue()) {
            case 11:
                return (String) C0217.n(52906, null, new Object[0]);
            case 12:
                return (String) C0217.n(36174, null, new Object[0]);
            case 13:
                return (String) C0217.n(74702, null, new Object[0]);
            case 14:
                return (String) C0217.n(58185, null, new Object[0]);
            case 15:
                return (String) C0217.n(10728, null, new Object[0]);
            case 16:
                return (String) C0217.n(55597, null, new Object[0]);
            case 17:
                return (String) C0217.n(85597, null, new Object[0]);
            case 18:
                return (String) C0146.n(76001, null, new Object[0]);
            case 19:
                return (String) C0146.n(59454, null, new Object[0]);
            case 20:
                return (String) C0146.n(89796, null, new Object[0]);
            default:
                return (String) C0146.n(46226, null, new Object[0]);
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0578v0
    public void g(int i, boolean z) throws Throwable {
        String str;
        String str2;
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
                    String str3 = (String) C0198.n(43897, null, new Object[]{(short[]) C0146.n(17227), 207, 1, 1042});
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = 1771;
                                continue;
                            case 54:
                                str = str3;
                                break;
                            default:
                                continue;
                        }
                    }
                    break;
                case 239:
                    str = (String) C0198.n(74142, null, new Object[]{(short[]) C0146.n(17227), 208, 1, 1402});
                    break;
                default:
                    break;
            }
        }
        ((Boolean) C0149.n(12776)).booleanValue();
        C0188.n(35332, null, new Object[]{(String) C0149.n(36390, null, new Object[]{(short[]) C0146.n(17227), 209, Integer.valueOf(C0124.f333 ^ (-743)), 2577}), str});
        int i4 = 1864;
        while (true) {
            i4 ^= 1881;
            switch (i4) {
                case 17:
                    if (z) {
                        i4 = 48736;
                    }
                    break;
                case 47384:
                    str2 = (String) C0149.n(61324, null, new Object[]{(short[]) C0146.n(17227), 234, Integer.valueOf(C0012.f168 ^ 874), 3162});
                    break;
                case 47417:
                    str2 = (String) C0178.n(80760, null, new Object[]{(short[]) C0146.n(17227), 227, Integer.valueOf(C0038.f194 ^ 216), 2662});
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
        C0188.n(1950, null, new Object[]{str2});
    }

    /* JADX WARN: Code restructure failed: missing block: B:447:0x0036, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0260, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x0496, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x06cd, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List lookup(String str) throws UnknownHostException {
        List list;
        switch (((Integer) C0146.n(3602, this)).intValue()) {
            case 4:
                list = (List) C0217.n(35533, (Dns) C0217.n(78023), new Object[]{str});
                Iterator it = (Iterator) C0221.n(11992, list, new Object[0]);
                while (true) {
                    boolean zBooleanValue = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
                    int i = 1516214;
                    while (true) {
                        i ^= 1516231;
                        switch (i) {
                            case 18:
                                break;
                            case 51:
                                break;
                            case 113:
                                i = zBooleanValue ? 1516307 : 1516276;
                                break;
                            case 468:
                                break;
                            default:
                                break;
                        }
                    }
                    InetAddress inetAddress = (InetAddress) C0221.n(87284, it, new Object[0]);
                    boolean zBooleanValue2 = ((Boolean) C0217.n(38954, inetAddress, new Object[0])).booleanValue();
                    int i2 = 1516338;
                    while (true) {
                        i2 ^= 1516355;
                        switch (i2) {
                            case 18:
                                break;
                            case 51:
                                throw new UnknownHostException((String) C0178.n(26978, null, new Object[]{(short[]) C0146.n(17227), 265, Integer.valueOf(C0037.f193 ^ 804), 1495}));
                            case 113:
                                i2 = !zBooleanValue2 ? 1537263 : 1516400;
                                break;
                            case 22444:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue3 = ((Boolean) C0217.n(14826, inetAddress, new Object[0])).booleanValue();
                    int i3 = 1537294;
                    while (true) {
                        i3 ^= 1537311;
                        switch (i3) {
                            case 17:
                                i3 = !zBooleanValue3 ? 1537387 : 1537356;
                                break;
                            case 50:
                                break;
                            case 83:
                                throw new UnknownHostException((String) C0178.n(26978, null, new Object[]{(short[]) C0146.n(17227), 265, Integer.valueOf(C0037.f193 ^ 804), 1495}));
                            case 116:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue4 = ((Boolean) C0217.n(33074, inetAddress, new Object[0])).booleanValue();
                    int i4 = 1537418;
                    while (true) {
                        i4 ^= 1537435;
                        switch (i4) {
                            case 17:
                                i4 = !zBooleanValue4 ? 1537511 : 1537480;
                                break;
                            case 50:
                                break;
                            case 83:
                                throw new UnknownHostException((String) C0178.n(26978, null, new Object[]{(short[]) C0146.n(17227), 265, Integer.valueOf(C0037.f193 ^ 804), 1495}));
                            case 124:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue5 = ((Boolean) C0217.n(48313, inetAddress, new Object[0])).booleanValue();
                    int i5 = 1537542;
                    while (true) {
                        i5 ^= 1537559;
                        switch (i5) {
                            case 17:
                                i5 = !zBooleanValue5 ? 1538286 : 1538255;
                                break;
                            case 3751:
                                break;
                            case 3800:
                                throw new UnknownHostException((String) C0178.n(26978, null, new Object[]{(short[]) C0146.n(17227), 265, Integer.valueOf(C0037.f193 ^ 804), 1495}));
                            case 3833:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue6 = ((Boolean) C0217.n(22281, inetAddress, new Object[0])).booleanValue();
                    int i6 = 1538317;
                    while (true) {
                        i6 ^= 1538334;
                        switch (i6) {
                            case 19:
                                i6 = !zBooleanValue6 ? 1538410 : 1538379;
                                break;
                            case 50:
                                break;
                            case 85:
                                throw new UnknownHostException((String) C0178.n(26978, null, new Object[]{(short[]) C0146.n(17227), 265, Integer.valueOf(C0037.f193 ^ 804), 1495}));
                            case 116:
                                break;
                            default:
                                break;
                        }
                    }
                    int length = ((byte[]) C0217.n(83987, inetAddress, new Object[0])).length;
                    int i7 = 1538441;
                    while (true) {
                        i7 ^= 1538458;
                        switch (i7) {
                            case 19:
                                i7 = length == 16 ? 1539185 : 1538503;
                                break;
                            case 50:
                                break;
                            case 93:
                                break;
                            case 1515:
                                byte b = ((byte[]) C0217.n(83987, inetAddress, new Object[0]))[0];
                                int i8 = C0012.f168;
                                int i9 = 1539216;
                                while (true) {
                                    i9 ^= 1539233;
                                    switch (i9) {
                                        case 14:
                                            break;
                                        case 49:
                                            i9 = ((i8 ^ 915) & b) != 252 ? 1539309 : 1539278;
                                            break;
                                        case 76:
                                            int i10 = 1539340;
                                            while (true) {
                                                i10 ^= 1539357;
                                                switch (i10) {
                                                    case 17:
                                                        i10 = 1539371;
                                                        break;
                                                    case 54:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 111:
                                            throw new UnknownHostException((String) C0178.n(26978, null, new Object[]{(short[]) C0146.n(17227), 265, Integer.valueOf(C0037.f193 ^ 804), 1495}));
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
                return list;
            case 5:
                list = (List) C0217.n(35533, (Dns) C0217.n(78023), new Object[]{str});
                Iterator it2 = (Iterator) C0221.n(11992, list, new Object[0]);
                while (true) {
                    boolean zBooleanValue7 = ((Boolean) C0221.n(22175, it2, new Object[0])).booleanValue();
                    int i11 = 1509673;
                    while (true) {
                        i11 ^= 1509690;
                        switch (i11) {
                            case 19:
                                i11 = zBooleanValue7 ? 1510417 : 1510386;
                                break;
                            case 712:
                                break;
                            case 745:
                                break;
                            case 1323:
                                break;
                            default:
                                break;
                        }
                    }
                    InetAddress inetAddress2 = (InetAddress) C0221.n(87284, it2, new Object[0]);
                    byte[] bArr = (byte[]) C0217.n(83987, inetAddress2, new Object[0]);
                    boolean zBooleanValue8 = ((Boolean) C0217.n(38954, inetAddress2, new Object[0])).booleanValue();
                    int i12 = 1510448;
                    while (true) {
                        i12 ^= 1510465;
                        switch (i12) {
                            case 14:
                                break;
                            case 47:
                                throw new UnknownHostException((String) C0224.n(74697, null, new Object[]{(short[]) C0146.n(17227), 257, Integer.valueOf(C0042.f198 ^ 51), 1101}));
                            case 113:
                                i12 = !zBooleanValue8 ? 1510541 : 1510510;
                                break;
                            case 204:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue9 = ((Boolean) C0217.n(14826, inetAddress2, new Object[0])).booleanValue();
                    int i13 = 1510572;
                    while (true) {
                        i13 ^= 1510589;
                        switch (i13) {
                            case 17:
                                i13 = !zBooleanValue9 ? 1511316 : 1510634;
                                break;
                            case 87:
                                throw new UnknownHostException((String) C0224.n(74697, null, new Object[]{(short[]) C0146.n(17227), 257, Integer.valueOf(C0042.f198 ^ 51), 1101}));
                            case 118:
                                break;
                            case 809:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue10 = ((Boolean) C0217.n(33074, inetAddress2, new Object[0])).booleanValue();
                    int i14 = 1511347;
                    while (true) {
                        i14 ^= 1511364;
                        switch (i14) {
                            case 22:
                                break;
                            case 53:
                                throw new UnknownHostException((String) C0224.n(74697, null, new Object[]{(short[]) C0146.n(17227), 257, Integer.valueOf(C0042.f198 ^ 51), 1101}));
                            case 119:
                                i14 = !zBooleanValue10 ? 1511440 : 1511409;
                                break;
                            case 8148:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue11 = ((Boolean) C0217.n(48313, inetAddress2, new Object[0])).booleanValue();
                    int i15 = 1511471;
                    while (true) {
                        i15 ^= 1511488;
                        switch (i15) {
                            case 14:
                                break;
                            case 45:
                                throw new UnknownHostException((String) C0224.n(74697, null, new Object[]{(short[]) C0146.n(17227), 257, Integer.valueOf(C0042.f198 ^ 51), 1101}));
                            case 111:
                                i15 = !zBooleanValue11 ? 1511564 : 1511533;
                                break;
                            case 204:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue12 = ((Boolean) C0217.n(22281, inetAddress2, new Object[0])).booleanValue();
                    int i16 = 1511595;
                    while (true) {
                        i16 ^= 1511612;
                        switch (i16) {
                            case 23:
                                i16 = !zBooleanValue12 ? 1512339 : 1512308;
                                break;
                            case 815:
                                break;
                            case 968:
                                throw new UnknownHostException((String) C0224.n(74697, null, new Object[]{(short[]) C0146.n(17227), 257, Integer.valueOf(C0042.f198 ^ 51), 1101}));
                            case 1001:
                                break;
                            default:
                                break;
                        }
                    }
                    int length2 = bArr.length;
                    int i17 = 1512370;
                    while (true) {
                        i17 ^= 1512387;
                        switch (i17) {
                            case 18:
                                break;
                            case 51:
                                break;
                            case 113:
                                i17 = length2 == 16 ? 1512463 : 1512432;
                                break;
                            case 1996:
                                byte b2 = bArr[0];
                                int i18 = C0029.f185;
                                int i19 = 1512494;
                                while (true) {
                                    i19 ^= 1512511;
                                    switch (i19) {
                                        case 17:
                                            i19 = ((i18 ^ 501) & b2) != 252 ? 1513238 : 1512556;
                                            break;
                                        case 83:
                                            throw new UnknownHostException((String) C0224.n(74697, null, new Object[]{(short[]) C0146.n(17227), 257, Integer.valueOf(C0042.f198 ^ 51), 1101}));
                                        case 114:
                                            break;
                                        case 809:
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
                    int length3 = bArr.length;
                    int i20 = 1513269;
                    while (true) {
                        i20 ^= 1513286;
                        switch (i20) {
                            case 18:
                                break;
                            case 53:
                                break;
                            case 115:
                                i20 = length3 == 4 ? 1513362 : 1513331;
                                break;
                            case 212:
                                int i21 = (C0075.f284 ^ 1021) & bArr[0];
                                int i22 = 1513393;
                                while (true) {
                                    i22 ^= 1513410;
                                    switch (i22) {
                                        case 18:
                                            break;
                                        case 45:
                                            throw new UnknownHostException((String) C0224.n(74697, null, new Object[]{(short[]) C0146.n(17227), 257, Integer.valueOf(C0042.f198 ^ 51), 1101}));
                                        case 115:
                                            i22 = i21 != 0 ? 1513486 : 1513455;
                                            break;
                                        case 4044:
                                            int i23 = 1513517;
                                            while (true) {
                                                i23 ^= 1513534;
                                                switch (i23) {
                                                    case 19:
                                                        i23 = i21 == 100 ? 1514261 : 1514230;
                                                        break;
                                                    case 712:
                                                        break;
                                                    case 745:
                                                        break;
                                                    case 811:
                                                        byte b3 = bArr[1];
                                                        int i24 = C0052.f208;
                                                        int i25 = 1514292;
                                                        while (true) {
                                                            i25 ^= 1514309;
                                                            switch (i25) {
                                                                case 22:
                                                                    break;
                                                                case 55:
                                                                    throw new UnknownHostException((String) C0224.n(74697, null, new Object[]{(short[]) C0146.n(17227), 257, Integer.valueOf(C0042.f198 ^ 51), 1101}));
                                                                case 113:
                                                                    i25 = ((i24 ^ (-181)) & b3) != 64 ? 1514385 : 1514354;
                                                                    break;
                                                                case 212:
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
                                            int i26 = 1514416;
                                            while (true) {
                                                i26 ^= 1514433;
                                                switch (i26) {
                                                    case 14:
                                                        break;
                                                    case 47:
                                                        break;
                                                    case 113:
                                                        i26 = i21 == 198 ? 1515160 : 1514478;
                                                        break;
                                                    case 1369:
                                                        int i27 = (C0083.f292 ^ (-52)) & bArr[1];
                                                        int i28 = 1515191;
                                                        while (true) {
                                                            i28 ^= 1515208;
                                                            switch (i28) {
                                                                case 30:
                                                                    break;
                                                                case 61:
                                                                    throw new UnknownHostException((String) C0224.n(74697, null, new Object[]{(short[]) C0146.n(17227), 257, Integer.valueOf(C0042.f198 ^ 51), 1101}));
                                                                case 127:
                                                                    i28 = i27 != 18 ? 1515284 : 1515253;
                                                                    break;
                                                                case 476:
                                                                    int i29 = 1515315;
                                                                    while (true) {
                                                                        i29 ^= 1515332;
                                                                        switch (i29) {
                                                                            case 22:
                                                                                break;
                                                                            case 53:
                                                                                throw new UnknownHostException((String) C0224.n(74697, null, new Object[]{(short[]) C0146.n(17227), 257, Integer.valueOf(C0042.f198 ^ 51), 1101}));
                                                                            case 119:
                                                                                i29 = i27 != 19 ? 1515408 : 1515377;
                                                                                break;
                                                                            case 212:
                                                                                int i30 = 1515439;
                                                                                while (true) {
                                                                                    i30 ^= 1515456;
                                                                                    switch (i30) {
                                                                                        case 111:
                                                                                            i30 = 1516121;
                                                                                            break;
                                                                                        case 15769:
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
                return list;
            case 6:
                list = (List) C0217.n(35533, (Dns) C0217.n(78023), new Object[]{str});
                Iterator it3 = (Iterator) C0221.n(11992, list, new Object[0]);
                while (true) {
                    boolean zBooleanValue13 = ((Boolean) C0221.n(22175, it3, new Object[0])).booleanValue();
                    int i31 = 53634;
                    while (true) {
                        i31 ^= 53651;
                        switch (i31) {
                            case 17:
                                i31 = zBooleanValue13 ? 53727 : 53696;
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
                    }
                    InetAddress inetAddress3 = (InetAddress) C0221.n(87284, it3, new Object[0]);
                    byte[] bArr2 = (byte[]) C0217.n(83987, inetAddress3, new Object[0]);
                    boolean zBooleanValue14 = ((Boolean) C0217.n(38954, inetAddress3, new Object[0])).booleanValue();
                    int i32 = 53758;
                    while (true) {
                        i32 ^= 53775;
                        switch (i32) {
                            case 1009:
                                i32 = !zBooleanValue14 ? 54502 : 54471;
                                break;
                            case 1703:
                                break;
                            case 1736:
                                throw new UnknownHostException((String) C0162.n(13243, null, new Object[]{(short[]) C0146.n(17227), 249, Integer.valueOf(C0141.f351 ^ (-775)), 1589}));
                            case 1769:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue15 = ((Boolean) C0217.n(14826, inetAddress3, new Object[0])).booleanValue();
                    int i33 = 54533;
                    while (true) {
                        i33 ^= 54550;
                        switch (i33) {
                            case 19:
                                i33 = !zBooleanValue15 ? 54626 : 54595;
                                break;
                            case 50:
                                break;
                            case 85:
                                throw new UnknownHostException((String) C0162.n(13243, null, new Object[]{(short[]) C0146.n(17227), 249, Integer.valueOf(C0141.f351 ^ (-775)), 1589}));
                            case 116:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue16 = ((Boolean) C0217.n(33074, inetAddress3, new Object[0])).booleanValue();
                    int i34 = 54657;
                    while (true) {
                        i34 ^= 54674;
                        switch (i34) {
                            case 19:
                                i34 = !zBooleanValue16 ? 55401 : 54719;
                                break;
                            case 45:
                                throw new UnknownHostException((String) C0162.n(13243, null, new Object[]{(short[]) C0146.n(17227), 249, Integer.valueOf(C0141.f351 ^ (-775)), 1589}));
                            case 50:
                                break;
                            case 3579:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue17 = ((Boolean) C0217.n(48313, inetAddress3, new Object[0])).booleanValue();
                    int i35 = 55432;
                    while (true) {
                        i35 ^= 55449;
                        switch (i35) {
                            case 17:
                                i35 = !zBooleanValue17 ? 55525 : 55494;
                                break;
                            case 62:
                                break;
                            case 95:
                                throw new UnknownHostException((String) C0162.n(13243, null, new Object[]{(short[]) C0146.n(17227), 249, Integer.valueOf(C0141.f351 ^ (-775)), 1589}));
                            case 124:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue18 = ((Boolean) C0217.n(22281, inetAddress3, new Object[0])).booleanValue();
                    int i36 = 55556;
                    while (true) {
                        i36 ^= 55573;
                        switch (i36) {
                            case 17:
                                i36 = !zBooleanValue18 ? 55649 : 55618;
                                break;
                            case 54:
                                break;
                            case 87:
                                throw new UnknownHostException((String) C0162.n(13243, null, new Object[]{(short[]) C0146.n(17227), 249, Integer.valueOf(C0141.f351 ^ (-775)), 1589}));
                            case 116:
                                break;
                            default:
                                break;
                        }
                    }
                    int length4 = bArr2.length;
                    int i37 = 55680;
                    while (true) {
                        i37 ^= 55697;
                        switch (i37) {
                            case 17:
                                i37 = length4 == 16 ? 56424 : 56393;
                                break;
                            case 1467:
                                break;
                            case 1496:
                                break;
                            case 1529:
                                byte b4 = bArr2[0];
                                int i38 = C0015.f171;
                                int i39 = 56455;
                                while (true) {
                                    i39 ^= 56472;
                                    switch (i39) {
                                        case 31:
                                            i39 = ((i38 ^ (-856)) & b4) != 252 ? 56548 : 56517;
                                            break;
                                        case 62:
                                            break;
                                        case 93:
                                            throw new UnknownHostException((String) C0162.n(13243, null, new Object[]{(short[]) C0146.n(17227), 249, Integer.valueOf(C0141.f351 ^ (-775)), 1589}));
                                        case 124:
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
                    int length5 = bArr2.length;
                    int i40 = 56579;
                    while (true) {
                        i40 ^= 56596;
                        switch (i40) {
                            case 23:
                                i40 = length5 == 4 ? 1507472 : 56641;
                                break;
                            case 54:
                                break;
                            case 85:
                                break;
                            case 1564036:
                                int i41 = (C0020.f176 ^ (-714)) & bArr2[0];
                                int i42 = 1507503;
                                while (true) {
                                    i42 ^= 1507520;
                                    switch (i42) {
                                        case 14:
                                            break;
                                        case 45:
                                            throw new UnknownHostException((String) C0162.n(13243, null, new Object[]{(short[]) C0146.n(17227), 249, Integer.valueOf(C0141.f351 ^ (-775)), 1589}));
                                        case 111:
                                            i42 = i41 != 0 ? 1507596 : 1507565;
                                            break;
                                        case 460:
                                            int i43 = 1507627;
                                            while (true) {
                                                i43 ^= 1507644;
                                                switch (i43) {
                                                    case 23:
                                                        i43 = i41 == 100 ? 1507720 : 1507689;
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 118:
                                                        break;
                                                    case 180:
                                                        byte b5 = bArr2[1];
                                                        int i44 = C0077.f286;
                                                        int i45 = 1507751;
                                                        while (true) {
                                                            i45 ^= 1507768;
                                                            switch (i45) {
                                                                case 31:
                                                                    i45 = ((i44 ^ (-340)) & b5) != 64 ? 1508495 : 1508464;
                                                                    break;
                                                                case 1335:
                                                                    break;
                                                                case 1480:
                                                                    throw new UnknownHostException((String) C0162.n(13243, null, new Object[]{(short[]) C0146.n(17227), 249, Integer.valueOf(C0141.f351 ^ (-775)), 1589}));
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
                                            int i46 = 1508526;
                                            while (true) {
                                                i46 ^= 1508543;
                                                switch (i46) {
                                                    case 17:
                                                        i46 = i41 == 198 ? 1508619 : 1508588;
                                                        break;
                                                    case 83:
                                                        break;
                                                    case 114:
                                                        break;
                                                    case 436:
                                                        int i47 = (C0024.f180 ^ (-720)) & bArr2[1];
                                                        int i48 = 1508650;
                                                        while (true) {
                                                            i48 ^= 1508667;
                                                            switch (i48) {
                                                                case 17:
                                                                    i48 = i47 != 18 ? 1509394 : 1508712;
                                                                    break;
                                                                case 83:
                                                                    throw new UnknownHostException((String) C0162.n(13243, null, new Object[]{(short[]) C0146.n(17227), 249, Integer.valueOf(C0141.f351 ^ (-775)), 1589}));
                                                                case 114:
                                                                    break;
                                                                case 3369:
                                                                    int i49 = 1509425;
                                                                    while (true) {
                                                                        i49 ^= 1509442;
                                                                        switch (i49) {
                                                                            case 18:
                                                                                break;
                                                                            case 45:
                                                                                throw new UnknownHostException((String) C0162.n(13243, null, new Object[]{(short[]) C0146.n(17227), 249, Integer.valueOf(C0141.f351 ^ (-775)), 1589}));
                                                                            case 115:
                                                                                i49 = i47 != 19 ? 1509518 : 1509487;
                                                                                break;
                                                                            case 204:
                                                                                int i50 = 1509549;
                                                                                while (true) {
                                                                                    i50 ^= 1509566;
                                                                                    switch (i50) {
                                                                                        case 19:
                                                                                            i50 = 1509580;
                                                                                            break;
                                                                                        case 114:
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
                return list;
            default:
                list = (List) C0217.n(35533, (Dns) C0217.n(78023), new Object[]{str});
                Iterator it4 = (Iterator) C0221.n(11992, list, new Object[0]);
                while (true) {
                    boolean zBooleanValue19 = ((Boolean) C0221.n(22175, it4, new Object[0])).booleanValue();
                    int i51 = 1616;
                    while (true) {
                        i51 ^= 1633;
                        switch (i51) {
                            case 14:
                                break;
                            case 49:
                                i51 = zBooleanValue19 ? 1709 : 1678;
                                break;
                            case 204:
                                break;
                            case 239:
                                break;
                            default:
                                break;
                        }
                    }
                    InetAddress inetAddress4 = (InetAddress) C0221.n(87284, it4, new Object[0]);
                    byte[] bArr3 = (byte[]) C0217.n(83987, inetAddress4, new Object[0]);
                    boolean zBooleanValue20 = ((Boolean) C0217.n(38954, inetAddress4, new Object[0])).booleanValue();
                    int i52 = 1740;
                    while (true) {
                        i52 ^= 1757;
                        switch (i52) {
                            case 17:
                                i52 = !zBooleanValue20 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new UnknownHostException((String) C0195.n(85847, null, new Object[]{(short[]) C0146.n(17227), 241, Integer.valueOf(C0068.f277 ^ 365), 2256}));
                            case 500:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue21 = ((Boolean) C0217.n(14826, inetAddress4, new Object[0])).booleanValue();
                    int i53 = 1864;
                    while (true) {
                        i53 ^= 1881;
                        switch (i53) {
                            case 17:
                                i53 = !zBooleanValue21 ? 48736 : 48705;
                                break;
                            case 47384:
                                throw new UnknownHostException((String) C0195.n(85847, null, new Object[]{(short[]) C0146.n(17227), 241, Integer.valueOf(C0068.f277 ^ 365), 2256}));
                            case 47417:
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue22 = ((Boolean) C0217.n(33074, inetAddress4, new Object[0])).booleanValue();
                    int i54 = 48767;
                    while (true) {
                        i54 ^= 48784;
                        switch (i54) {
                            case 14:
                                break;
                            case 45:
                                throw new UnknownHostException((String) C0195.n(85847, null, new Object[]{(short[]) C0146.n(17227), 241, Integer.valueOf(C0068.f277 ^ 365), 2256}));
                            case 76:
                                break;
                            case 239:
                                i54 = !zBooleanValue22 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue23 = ((Boolean) C0217.n(48313, inetAddress4, new Object[0])).booleanValue();
                    int i55 = 48891;
                    while (true) {
                        i55 ^= 48908;
                        switch (i55) {
                            case 22:
                                break;
                            case 53:
                                throw new UnknownHostException((String) C0195.n(85847, null, new Object[]{(short[]) C0146.n(17227), 241, Integer.valueOf(C0068.f277 ^ 365), 2256}));
                            case 503:
                                i55 = !zBooleanValue23 ? 49635 : 48953;
                                break;
                            case 32495:
                                break;
                            default:
                                break;
                        }
                    }
                    boolean zBooleanValue24 = ((Boolean) C0217.n(22281, inetAddress4, new Object[0])).booleanValue();
                    int i56 = 49666;
                    while (true) {
                        i56 ^= 49683;
                        switch (i56) {
                            case 17:
                                i56 = !zBooleanValue24 ? 49759 : 49728;
                                break;
                            case 50:
                                break;
                            case 76:
                                break;
                            case 83:
                                throw new UnknownHostException((String) C0195.n(85847, null, new Object[]{(short[]) C0146.n(17227), 241, Integer.valueOf(C0068.f277 ^ 365), 2256}));
                            default:
                                break;
                        }
                    }
                    int length6 = bArr3.length;
                    int i57 = 49790;
                    while (true) {
                        i57 ^= 49807;
                        switch (i57) {
                            case 18:
                                break;
                            case 51:
                                break;
                            case 84:
                                byte b6 = bArr3[0];
                                int i58 = C0144.f354;
                                int i59 = 49914;
                                while (true) {
                                    i59 ^= 49931;
                                    switch (i59) {
                                        case 497:
                                            i59 = ((i58 ^ (-677)) & b6) != 252 ? 50658 : 50627;
                                            break;
                                        case 1711:
                                            break;
                                        case 1736:
                                            throw new UnknownHostException((String) C0195.n(85847, null, new Object[]{(short[]) C0146.n(17227), 241, Integer.valueOf(C0068.f277 ^ 365), 2256}));
                                        case 1769:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 241:
                                i57 = length6 == 16 ? 49883 : 49852;
                                break;
                            default:
                                break;
                        }
                    }
                    int length7 = bArr3.length;
                    int i60 = 50689;
                    while (true) {
                        i60 ^= 50706;
                        switch (i60) {
                            case 19:
                                i60 = length7 == 4 ? 50782 : 50751;
                                break;
                            case 45:
                                break;
                            case 50:
                                break;
                            case 76:
                                int i61 = (C0121.f330 ^ (-732)) & bArr3[0];
                                int i62 = 50813;
                                while (true) {
                                    i62 ^= 50830;
                                    switch (i62) {
                                        case 18:
                                            break;
                                        case 53:
                                            throw new UnknownHostException((String) C0195.n(85847, null, new Object[]{(short[]) C0146.n(17227), 241, Integer.valueOf(C0068.f277 ^ 365), 2256}));
                                        case 243:
                                            i62 = i61 != 0 ? 51557 : 50875;
                                            break;
                                        case 4075:
                                            int i63 = 51588;
                                            while (true) {
                                                i63 ^= 51605;
                                                switch (i63) {
                                                    case 17:
                                                        i63 = i61 == 100 ? 51681 : 51650;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        break;
                                                    case 116:
                                                        byte b7 = bArr3[1];
                                                        int i64 = C0129.f338;
                                                        int i65 = 51712;
                                                        while (true) {
                                                            i65 ^= 51729;
                                                            switch (i65) {
                                                                case 14:
                                                                    break;
                                                                case 17:
                                                                    i65 = ((i64 ^ 850) & b7) != 64 ? 51805 : 51774;
                                                                    break;
                                                                case 47:
                                                                    throw new UnknownHostException((String) C0195.n(85847, null, new Object[]{(short[]) C0146.n(17227), 241, Integer.valueOf(C0068.f277 ^ 365), 2256}));
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
                                            int i66 = 51836;
                                            while (true) {
                                                i66 ^= 51853;
                                                switch (i66) {
                                                    case 241:
                                                        i66 = i61 == 198 ? 52580 : 52549;
                                                        break;
                                                    case 1963:
                                                        break;
                                                    case 1992:
                                                        break;
                                                    case 2025:
                                                        int i67 = (C0077.f286 ^ (-365)) & bArr3[1];
                                                        int i68 = 52611;
                                                        while (true) {
                                                            i68 ^= 52628;
                                                            switch (i68) {
                                                                case 23:
                                                                    i68 = i67 != 18 ? 52704 : 52673;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 85:
                                                                    throw new UnknownHostException((String) C0195.n(85847, null, new Object[]{(short[]) C0146.n(17227), 241, Integer.valueOf(C0068.f277 ^ 365), 2256}));
                                                                case 116:
                                                                    int i69 = 52735;
                                                                    while (true) {
                                                                        i69 ^= 52752;
                                                                        switch (i69) {
                                                                            case 14:
                                                                                break;
                                                                            case 45:
                                                                                throw new UnknownHostException((String) C0195.n(85847, null, new Object[]{(short[]) C0146.n(17227), 241, Integer.valueOf(C0068.f277 ^ 365), 2256}));
                                                                            case 1007:
                                                                                i69 = i67 != 19 ? 53479 : 52797;
                                                                                break;
                                                                            case 7927:
                                                                                int i70 = 53510;
                                                                                while (true) {
                                                                                    i70 ^= 53527;
                                                                                    switch (i70) {
                                                                                        case 17:
                                                                                            i70 = 53541;
                                                                                            break;
                                                                                        case 50:
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
                return list;
        }
    }

    @Override // com.github.catvod.spider.FanShu.CaptchaPrompter
    public /* synthetic */ Y3 prompt(K k) throws Throwable {
        String str = "ۦۢ۟";
        Object objN = null;
        Y3 y3 = null;
        while (true) {
            switch (C0034.m132(str)) {
                case 56328:
                    y3 = (Y3) objN;
                    str = "ۥۥ۟";
                    break;
                case 1753507:
                    objN = C0217.n(39996, null, new Object[]{this, k});
                    str = "۠ۨ";
                    break;
                default:
                    return y3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:204:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x00db A[SYNTHETIC] */
    @Override // com.github.catvod.spider.FanShu.CaptchaPrompter
    public Y3 prompt(byte[] bArr) throws Throwable {
        String str;
        Bitmap bitmap;
        boolean zBooleanValue;
        int i;
        Looper looper = (Looper) C0149.n(51581, null, new Object[0]);
        Looper looper2 = (Looper) C0182.n(3121, null, new Object[0]);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = looper != null ? 1709 : 1678;
                    break;
                case 204:
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = looper != looper2 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                throw new IllegalStateException((String) C0198.n(6303, null, new Object[]{(short[]) C0146.n(17227), 273, Integer.valueOf(C0029.f185 ^ 313), 2818}));
                            case 500:
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
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        String str2 = (String) C0195.n(43185);
        int i5 = 48767;
        while (true) {
            i5 ^= 48784;
            switch (i5) {
                case 14:
                    break;
                case 45:
                    break;
                case 76:
                    int length = bArr.length;
                    int i6 = 48891;
                    while (true) {
                        i6 ^= 48908;
                        switch (i6) {
                            case 22:
                                break;
                            case 53:
                                int length2 = bArr.length;
                                int i7 = 49790;
                                while (true) {
                                    i7 ^= 49807;
                                    switch (i7) {
                                        case 18:
                                            break;
                                        case 51:
                                            String str3 = (String) C0149.n(92089, new String(bArr, (Charset) C0182.n(4193)), new Object[0]);
                                            int iIntValue = ((Integer) C0152.n(41658, str3, new Object[]{(String) C0224.n(31189, null, new Object[]{(short[]) C0146.n(17227), 323, Integer.valueOf(C0138.f347 ^ 268), 735})})).intValue();
                                            int i8 = 50689;
                                            while (true) {
                                                i8 ^= 50706;
                                                switch (i8) {
                                                    case 19:
                                                        i8 = iIntValue >= 0 ? 50782 : 50751;
                                                        break;
                                                    case 45:
                                                        i = 49914;
                                                        while (true) {
                                                            i ^= 49931;
                                                            switch (i) {
                                                                case 497:
                                                                    i = 50596;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                case 1711:
                                                                    str = str2;
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 50:
                                                        break;
                                                    case 76:
                                                        int i9 = 50813;
                                                        while (true) {
                                                            i9 ^= 50830;
                                                            switch (i9) {
                                                                case 18:
                                                                    break;
                                                                case 53:
                                                                    i = 49914;
                                                                    while (true) {
                                                                        i ^= 49931;
                                                                        switch (i) {
                                                                            case 497:
                                                                                i = 50596;
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                            case 1711:
                                                                                str = str2;
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 243:
                                                                    i9 = iIntValue < 256 ? 51557 : 50875;
                                                                    break;
                                                                case 4075:
                                                                    str = (String) C0152.n(80045, str3, new Object[]{Integer.valueOf(iIntValue)});
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
                                            i = 49914;
                                            while (true) {
                                                i ^= 49931;
                                                switch (i) {
                                                    case 497:
                                                        i = 50596;
                                                        continue;
                                                        continue;
                                                        continue;
                                                    case 1711:
                                                        str = str2;
                                                        break;
                                                    default:
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 241:
                                            i7 = length2 == 0 ? 49883 : 49852;
                                            break;
                                        default:
                                            break;
                                    }
                                    try {
                                        boolean zBooleanValue2 = ((Boolean) C0195.n(5730, str, new Object[0])).booleanValue();
                                        int i10 = 51588;
                                        while (true) {
                                            i10 ^= 51605;
                                            switch (i10) {
                                                case 17:
                                                    i10 = zBooleanValue2 ? 51681 : 51650;
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    bitmap = null;
                                                    break;
                                                case 116:
                                                    Bitmap bitmap2 = (Bitmap) C0159.n(28489, null, new Object[]{bArr, 0, Integer.valueOf(bArr.length)});
                                                    int i11 = 51712;
                                                    while (true) {
                                                        i11 ^= 51729;
                                                        switch (i11) {
                                                            case 14:
                                                                bitmap = bitmap2;
                                                                break;
                                                            case 15:
                                                            case 16:
                                                            default:
                                                                continue;
                                                            case 17:
                                                                i11 = 51743;
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        int i12 = 51836;
                                        while (true) {
                                            i12 ^= 51853;
                                            switch (i12) {
                                                case 241:
                                                    i12 = bitmap == null ? 52580 : 52549;
                                                    break;
                                                case 1963:
                                                    break;
                                                case 1992:
                                                    break;
                                                case 2025:
                                                    boolean zBooleanValue3 = ((Boolean) C0195.n(5730, str, new Object[0])).booleanValue();
                                                    int i13 = 52611;
                                                    while (true) {
                                                        i13 ^= 52628;
                                                        switch (i13) {
                                                            case 23:
                                                                i13 = zBooleanValue3 ? 52704 : 52673;
                                                                break;
                                                            case 54:
                                                                break;
                                                            case 85:
                                                                break;
                                                            case 116:
                                                                Y3 y3 = new Y3(3, str2);
                                                                int i14 = 52735;
                                                                while (true) {
                                                                    i14 ^= 52752;
                                                                    switch (i14) {
                                                                        case 14:
                                                                            return y3;
                                                                        case 1007:
                                                                            i14 = 52766;
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
                                        Z3 z3 = new Z3(bitmap, str);
                                        C0152.n(52927, null, new Object[]{new S3(z3, 0)});
                                        try {
                                            zBooleanValue = ((Boolean) C0202.n(66701, (CountDownLatch) C0217.n(11758, z3), new Object[]{Long.valueOf((-713) ^ ((long) C0067.f276)), (TimeUnit) C0226.n(31466)})).booleanValue();
                                            int i15 = 53510;
                                            while (true) {
                                                i15 ^= 53527;
                                                switch (i15) {
                                                    case 17:
                                                        i15 = 53541;
                                                        continue;
                                                    case 50:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                int i16 = 53634;
                                                while (true) {
                                                    i16 ^= 53651;
                                                    switch (i16) {
                                                        case 17:
                                                            i16 = !zBooleanValue ? 53727 : 53696;
                                                            break;
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            C0217.n(65450, null, new Object[]{z3, 3, str2});
                                                            break;
                                                        case 83:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                Y3 y4 = (Y3) C0195.n(90685, (AtomicReference) C0217.n(16010, z3), new Object[0]);
                                                int i17 = 53758;
                                                while (true) {
                                                    i17 ^= 53775;
                                                    switch (i17) {
                                                        case 1009:
                                                            i17 = 54440;
                                                            break;
                                                        case 1703:
                                                            return y4;
                                                    }
                                                }
                                            }
                                        } catch (InterruptedException e) {
                                            C0149.n(88498, (Thread) C0195.n(50425, null, new Object[0]), new Object[0]);
                                            zBooleanValue = false;
                                        }
                                    } catch (Throwable th) {
                                        Y3 y5 = new Y3(3, str2);
                                        int i18 = 54533;
                                        while (true) {
                                            i18 ^= 54550;
                                            switch (i18) {
                                                case 19:
                                                    i18 = 54564;
                                                    break;
                                                case 50:
                                                    return y5;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 503:
                                i6 = length == 0 ? 49635 : 48953;
                                break;
                            case 32495:
                                int i19 = 49666;
                                while (true) {
                                    i19 ^= 49683;
                                    switch (i19) {
                                        case 17:
                                            i19 = 49697;
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
                case 239:
                    i5 = bArr != null ? 48860 : 48829;
                    break;
                default:
                    break;
            }
        }
        return new Y3(3, str2);
    }
}
