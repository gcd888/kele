package com.github.catvod.spider.merge.p000a;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.github.catvod.spider.C0141;
import com.github.catvod.spider.merge.A.C0002;
import com.github.catvod.spider.merge.B.C0005;
import com.github.catvod.spider.merge.G.C0022;
import com.github.catvod.spider.merge.N.C0035;
import com.github.catvod.spider.merge.O.C0038;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.T.C0048;
import com.github.catvod.spider.merge.b0.C0061;
import com.github.catvod.spider.merge.k0.C0099;
import com.github.catvod.spider.merge.p0.C0110;
import com.github.catvod.spider.merge.p0.C0111;
import com.github.catvod.spider.merge.p002c.C0062;
import com.github.catvod.spider.merge.p003d.C0067;
import com.github.catvod.spider.merge.p018v.C0131;
import com.github.catvod.spider.merge.p020x.C0138;
import java.io.PrintStream;
import moyu.fucking.C0149;
import moyu.fucking.C0154;
import moyu.fucking.C0157;
import moyu.fucking.C0162;
import moyu.fucking.C0163;
import moyu.fucking.C0175;
import moyu.fucking.C0177;
import moyu.fucking.C0178;
import moyu.fucking.C0182;
import moyu.fucking.C0188;
import moyu.fucking.C0194;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0201;
import moyu.fucking.C0205;
import moyu.fucking.C0210;
import moyu.fucking.C0213;
import moyu.fucking.C0215;
import moyu.fucking.C0224;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f214short = {2801, 2814, 2804, 2786, 2815, 2809, 2804, 2750, 2809, 2814, 2788, 2805, 2814, 2788, 2750, 2801, 2803, 2788, 2809, 2815, 2814, 2750, 2758, 2777, 2773, 2759, 3197, 3174, 3170, 3180, 3175, 3169, 3197, 3197, 3193, 3194, 3123, 3110, 3110, 3194, 3196, 3111, 3196, 3178, 3111, 3178, 3175, 3110, 3133, 3158, 3183, 3187, 3140, 3171, 3131, 3126, 3196, 3178, 3158, 3193, 3176, 3195, 3176, 3172, 3158, 3194, 3197, 3195, 3124, 3181, 3194, 3181, 3175, 3183, 3195, 3193, 3183, 3179, 3168, 3199, 3180, 3194, 3194, 3178, 3193, 3182, 3168, 3172, 3168, 3179, 3197, 3179, 3172, 3175, 3168, 3171, 3179, 3173, 3176, 3196, 3193, 3196, 3197, 3174, 3182, 3193, 3168, 3175, 3197, 3175, 3198, 3170, 3197, 3193, 3195, 3178, 3169, 3172, 3197, 3119, 3178, 3173, 3168, 3180, 3175, 3197, 3158, 3168, 3181, 3124, 3132, 3131, 3120, 3119, 3196, 3178, 3158, 3179, 3168, 3187, 3158, 3194, 3197, 3195, 3124, 3162, 3116, 3130, 3144, 3178, 3196, 3194, 3197, 3174, 3172, 3116, 3134, 3146, 3146, 3116, 3130, 3144, 3197, 3168, 3197, 3173, 3180, 3179, 3176, 3195, 3158, 3183, 3168, 3185, 439, 443, 441, 506, 385, 407, 409, 443, 438, 445, 440, 433, 22148, -31099, -31718, -2950, -32639, 23646, 2851, 2869, 29735, 32174, 2871, 2854, 2854, 17755, 29464, -32558, 26878, 27701, 28345, 21018, -32426, 2502, 2512, 2483, 2514, 2499, 2499, -2401, -32156, -26214, 27514, 18207, 30567, 29074, 27163, 28368, 3052, 3066, 25650, 31542, 601, 591, 19584, 31992, 31245, 23357, -28887, 1427, 1494, 1497, 1500, 1488, 1499, 1473, 1514, 1500, 1489, 1416, 1408, 1414, 1415, 1427, 1472, 1494, 1514, 1495, 1500, 1487, 1514, 1478, 1473, 1479, 1416, 1510, 1424, 1414, 1524, 1494, 1472, 1478, 1473, 1498, 1496, 1424, 1410, 1526, 1530, 1509, 1505, 1424, 1414, 1524, 1510, 1524, 1511, 1520, 1524, 1424, 1409, 1413, 1413, 1424, 1410, 1526, 1530, 1509, 1505, 1424, 1414, 1524, 1532, 1528, 1528, 1520, 1511, 1510, 1532, 1507, 1520, 1424, 1409, 1413, 1412, 1424, 1410, 1526, 1530, 1509, 1505, 1424, 1414, 1524, 1527, 1524, 1526, 1534, 1514, 1527, 1505, 1531, 1514, 1510, 1505, 1516, 1529, 1520, 1424, 1409, 1413, 1413, 1579, 1591, 1591, 1587, 1584, 1657, 1644, 1644, 1584, 1590, 1645, 1586, 1590, 1570, 1585, 1576, 1645, 1568, 1581, 1644, 1655, 1564, 1574, 1550, 1547, 1537, 1545, 1660, 1590, 1568, 1564, 1587, 1570, 1585, 1570, 1582, 1564, 1584, 1591, 1585, 1662, 1637, 1591, 1580, 1576, 1574, 1581, 1662, 1985, 1997, 1999, 1932, 2003, 2007, 1987, 2000, 1993, 1932, 1985, 1998, 1997, 2007, 1990, 1990, 2000, 1995, 2004, 1991, 3098, 3094, 3092, 3159, 3080, 3084, 3096, 3083, 3090, 3159, 3099, 3083, 3094, 3086, 3082, 3100, 3083, 20938, -32309, -31916, -3276, -30769, 23312, 21760, 23923, 3193, 3176, 3176, 16917, 29782, -30820, 28592, 27515, 28384, 21059, -32497, 20722, 22657, 2443, 2458, 2458, -2362, -32195, -26173, 27427, 18246, 30526, 29131, 27202, 28297, -31566, -31187, 20601, 22538, 2304, 2321, 2321, 20592, -31644, -2483, -32074, -26296, 27560, 18381, 30645, 28992, 27337, 28162, 25964, 32518, 29052, 22610, 24118, -30174};
    public final int a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public /* synthetic */ B(int i, Object obj, String str, boolean z) throws Throwable {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = str;
        int iIntValue = ((Integer) C0195.n(39207, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Float) C0157.n(17336, null, new Object[]{(String) C0195.n(83584, null, new Object[]{(String) C0177.n(72185)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    public /* synthetic */ B(I i, F f, boolean z) throws Throwable {
        this.a = 0;
        this.c = i;
        this.d = f;
        this.b = z;
        int iIntValue = ((Integer) C0205.n(28577, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0162.n(1185, null, new Object[]{(String) C0177.n(48486)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        int i2;
        int i3 = (-268436239) ^ C0141.f351;
        String str = (String) C0198.n(74142, null, new Object[]{(short[]) C0177.n(71199), 0, Integer.valueOf(C0131.f340 ^ 710), 2704});
        int i4 = C0062.f271 ^ 531;
        switch (((Integer) C0177.n(52890, this)).intValue()) {
            case 0:
                C0215.n(72481, (I) C0177.n(46486, this), new Object[]{(F) C0177.n(23634, this), Boolean.valueOf(((Boolean) C0177.n(27917, this)).booleanValue())});
                return;
            case 1:
                String str2 = (String) C0182.n(7909, null, new Object[]{(short[]) C0177.n(71199), 233, Integer.valueOf(C0022.f178 ^ 7), 1461});
                String str3 = (String) C0198.n(74142, null, new Object[]{(short[]) C0177.n(71199), 336, Integer.valueOf(C0067.f276 ^ (-675)), 1603});
                A0 a0 = (A0) C0177.n(46486, this);
                boolean zBooleanValue = ((Boolean) C0177.n(27917, this)).booleanValue();
                String str4 = (String) C0177.n(23634, this);
                int i5 = 49914;
                while (true) {
                    i5 ^= 49931;
                    switch (i5) {
                        case 497:
                            if (zBooleanValue) {
                                i5 = 50658;
                            }
                            break;
                        case 1711:
                            break;
                        case 1736:
                            int iIntValue = ((Integer) C0215.n(25225)).intValue();
                            String str5 = (String) C0215.n(99634);
                            StringBuilder sb = new StringBuilder(str3);
                            String str6 = (String) C0198.n(89992, sb, new Object[0]);
                            try {
                                try {
                                    C0177.n(98639, null, new Object[]{Integer.valueOf(iIntValue), new RunnableC0381u0(a0, 1), str5, str6});
                                    while (true) {
                                        i ^= 52628;
                                        switch (i) {
                                            case 23:
                                                i = 52642;
                                                break;
                                            case 54:
                                                return;
                                        }
                                    }
                                } catch (Exception e) {
                                    try {
                                        C0177.n(98639, null, new Object[]{Integer.valueOf(iIntValue), new RunnableC0381u0(a0, i4), str5, str6});
                                        int i6 = 53510;
                                        while (true) {
                                            i6 ^= 53527;
                                            switch (i6) {
                                                case 17:
                                                    i6 = 53541;
                                                    continue;
                                                case 50:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                    } catch (Exception e2) {
                                        C0188.n(1950, null, new Object[]{(String) C0224.n(58480, null, new Object[]{(short[]) C0177.n(71199), 472, Integer.valueOf(C0110.f319 ^ (-550)), 1799})});
                                        int i7 = 53634;
                                        while (true) {
                                            i7 ^= 53651;
                                            switch (i7) {
                                                case 17:
                                                    i7 = 53665;
                                                    break;
                                                case 50:
                                                    break;
                                            }
                                        }
                                    }
                                }
                                C0177.n(70007, a0, new Object[]{str4});
                                i = 52611;
                            } catch (Throwable th) {
                                int i8 = 52735;
                                while (true) {
                                    i8 ^= 52752;
                                    switch (i8) {
                                        case 14:
                                            C0177.n(70007, a0, new Object[]{str4});
                                            throw th;
                                        case 1007:
                                            i8 = 52766;
                                            break;
                                    }
                                }
                            }
                            break;
                        case 1769:
                            ((Integer) C0175.n(46748)).intValue();
                            StringBuilder sb2 = new StringBuilder(str3);
                            String str7 = (String) C0198.n(89992, sb2, new Object[0]);
                            try {
                                String str8 = (String) C0198.n(30341, null, new Object[]{(short[]) C0177.n(71199), 384, Integer.valueOf(C0111.f320 ^ (-952)), 1954});
                                String str9 = (String) C0162.n(29890, null, new Object[]{(short[]) C0177.n(71199), 404, Integer.valueOf(C0131.f340 ^ 717), 3193});
                                String[] strArr = new String[2];
                                strArr[C0042.f198 ^ 59] = str8;
                                strArr[C0002.f158 ^ 516] = str9;
                                int i9 = 0;
                                while (true) {
                                    int i10 = 50689;
                                    while (true) {
                                        i10 ^= 50706;
                                        switch (i10) {
                                            case 19:
                                                i10 = i9 < i4 ? 50782 : 50751;
                                                break;
                                            case 45:
                                                C0188.n(1950, null, new Object[]{(String) C0162.n(24506, null, new Object[]{(short[]) C0177.n(71199), 437, Integer.valueOf(C0035.f191 ^ 301), 2506})});
                                                int i11 = 51712;
                                                while (true) {
                                                    i11 ^= 51729;
                                                    switch (i11) {
                                                        case 14:
                                                            return;
                                                        case 17:
                                                            i11 = 51743;
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 50:
                                                break;
                                            case 76:
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    String str10 = strArr[i9];
                                    try {
                                        Intent intent = new Intent(str, (Uri) C0163.n(81590, null, new Object[]{str7}));
                                        C0163.n(31874, (Application) C0149.n(10590, null, new Object[0]), new Object[]{intent});
                                        C0188.n(1950, null, new Object[]{(String) C0162.n(95122, null, new Object[]{(short[]) C0177.n(71199), 421, Integer.valueOf(C0138.f347 ^ 280), 3128})});
                                        C0177.n(70007, a0, new Object[]{str4});
                                        int i12 = 50813;
                                        while (true) {
                                            i12 ^= 50830;
                                            switch (i12) {
                                                case 18:
                                                    return;
                                                case 243:
                                                    i12 = 50844;
                                                    break;
                                            }
                                        }
                                    } catch (Exception e3) {
                                        int i13 = (i9 - 32) + 1 + 32;
                                        int i14 = 51588;
                                        while (true) {
                                            i14 ^= 51605;
                                            switch (i14) {
                                                case 17:
                                                    i14 = 51619;
                                                    break;
                                                case 54:
                                                    break;
                                            }
                                        }
                                        i9 = i13;
                                    }
                                }
                            } catch (Exception e4) {
                                C0188.n(1950, null, new Object[]{(String) C0198.n(74142, null, new Object[]{(short[]) C0177.n(71199), 454, Integer.valueOf(C0131.f340 ^ 718), 2369})});
                                int i15 = 51836;
                                while (true) {
                                    i15 ^= 51853;
                                    switch (i15) {
                                        case 241:
                                            i15 = 52518;
                                            break;
                                        case 1963:
                                            return;
                                    }
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i5 = 50627;
                }
                break;
            default:
                String str11 = (String) C0198.n(94433, null, new Object[]{(short[]) C0177.n(71199), 26, Integer.valueOf(C0138.f347 ^ 269), 3081});
                String str12 = (String) C0224.n(30768, null, new Object[]{(short[]) C0177.n(71199), 31, Integer.valueOf(C0099.f308 ^ 951), 3081});
                Z0 z0 = (Z0) C0177.n(46486, this);
                boolean zBooleanValue2 = ((Boolean) C0177.n(27917, this)).booleanValue();
                String str13 = (String) C0177.n(23634, this);
                int i16 = 1616;
                while (true) {
                    i16 ^= 1633;
                    switch (i16) {
                        case 14:
                            break;
                        case 49:
                            i16 = zBooleanValue2 ? 1709 : 1678;
                            break;
                        case 204:
                            try {
                                Intent intent2 = new Intent(str, (Uri) C0163.n(81590, null, new Object[]{(String) C0154.n(69970, (HttpUrl) C0154.n(50299, (HttpUrl.Builder) C0154.n(67645, (HttpUrl.Builder) C0154.n(64757, (HttpUrl) C0201.n(44872, null, new Object[]{str12}), new Object[0]), new Object[]{str11, str13}), new Object[0]), new Object[0])}));
                                C0163.n(31874, (Application) C0149.n(10590, null, new Object[0]), new Object[]{intent2});
                                C0188.n(1950, null, new Object[]{(String) C0224.n(99346, null, new Object[]{(short[]) C0177.n(71199), 186, Integer.valueOf(C0061.f270 ^ (-912)), 2934})});
                                C0177.n(85673, z0, new Object[]{str13});
                                int i17 = 1740;
                                while (true) {
                                    i17 ^= 1757;
                                    switch (i17) {
                                        case 17:
                                            i17 = 1771;
                                            continue;
                                        case 54:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                            } catch (Exception e5) {
                                C0188.n(1950, null, new Object[]{(String) C0198.n(30341, null, new Object[]{(short[]) C0177.n(71199), 204, Integer.valueOf(C0048.f204 ^ 838), 2451})});
                                int i18 = 1864;
                                while (true) {
                                    i18 ^= 1881;
                                    switch (i18) {
                                        case 17:
                                            i18 = 48674;
                                            continue;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                            }
                            break;
                        case 239:
                            String str14 = (String) C0162.n(13243, null, new Object[]{(short[]) C0177.n(71199), 222, Integer.valueOf(C0038.f194 ^ 221), 2969});
                            try {
                                try {
                                    C0177.n(98639, null, new Object[]{Integer.valueOf(((Integer) C0210.n(71584, null, new Object[]{str14})).intValue()), new T0(z0, i4), (String) C0213.n(38612, null, new Object[]{str14}), (String) C0154.n(69970, (HttpUrl) C0154.n(50299, (HttpUrl.Builder) C0154.n(67645, (HttpUrl.Builder) C0154.n(64757, (HttpUrl) C0201.n(44872, null, new Object[]{str12}), new Object[0]), new Object[]{str11, str13}), new Object[0]), new Object[0])});
                                    while (true) {
                                        i2 ^= 48784;
                                        switch (i2) {
                                            case 14:
                                                break;
                                            case 239:
                                                i2 = 48798;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    int i19 = 48891;
                                    while (true) {
                                        i19 ^= 48908;
                                        switch (i19) {
                                            case 22:
                                                C0177.n(85673, z0, new Object[]{str13});
                                                throw th2;
                                            case 503:
                                                i19 = 48922;
                                                break;
                                        }
                                    }
                                }
                            } catch (Exception e6) {
                                C0188.n(1950, null, new Object[]{(String) C0198.n(39623, null, new Object[]{(short[]) C0177.n(71199), 224, Integer.valueOf(C0005.f161 ^ 648), 524})});
                                int i20 = 49666;
                                while (true) {
                                    i20 ^= 49683;
                                    switch (i20) {
                                        case 17:
                                            i20 = 49697;
                                            continue;
                                        case 50:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                            }
                            C0177.n(85673, z0, new Object[]{str13});
                            i2 = 48767;
                            break;
                        default:
                            break;
                    }
                }
                int iIntValue2 = ((Integer) C0163.n(6834, null, new Object[0])).intValue();
                int i21 = 49790;
                while (true) {
                    i21 ^= 49807;
                    switch (i21) {
                        case 18:
                            break;
                        case 51:
                            return;
                        case 84:
                            C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0178.n(16623, null, new Object[]{(String) C0194.n(4660, null, new Object[]{(String) C0177.n(62394)})})});
                            return;
                        case 241:
                            if (iIntValue2 <= 0) {
                                i21 = 49883;
                            }
                            break;
                        default:
                            continue;
                    }
                    i21 = 49852;
                }
                break;
        }
    }
}
