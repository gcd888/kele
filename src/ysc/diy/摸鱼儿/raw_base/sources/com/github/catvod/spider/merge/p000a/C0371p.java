package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.E.C0015;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.d0.C0069;
import com.github.catvod.spider.merge.p0.C0110;
import com.github.catvod.spider.merge.p007h.C0084;
import java.io.PrintStream;
import moyu.fucking.C0146;
import moyu.fucking.C0149;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0189;
import moyu.fucking.C0191;
import moyu.fucking.C0195;
import moyu.fucking.C0196;
import moyu.fucking.C0198;
import moyu.fucking.C0209;
import moyu.fucking.C0221;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class C0371p {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f250short = {582, 608, 627, 636, 609, 628, 631, 608, 576, 631, 609, 615, 638, 614, 570, 631, 608, 608, 636, 637, 559, 1630, 1618, 1542, 1565, 1615, 2516, 2520, 2459, 2455, 2460, 2461, 2501};
    public final Integer a;
    public final String b;
    public final int c;

    public C0371p(Integer num, String str, int i) throws Throwable {
        this.a = num;
        this.b = str;
        this.c = i;
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
                    C0168.n(61614, (PrintStream) C0195.n(72538), new Object[]{(String) C0162.n(66084, null, new Object[]{(String) C0196.n(23912)})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    public final boolean equals(Object obj) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (this == obj) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return true;
                case 239:
                    boolean z = obj instanceof C0371p;
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (!z) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                C0371p c0371p = (C0371p) obj;
                                boolean zBooleanValue = ((Boolean) C0146.n(10734, null, new Object[]{(Integer) C0196.n(46471, this), (Integer) C0196.n(46471, c0371p)})).booleanValue();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (!zBooleanValue) {
                                                i3 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean zBooleanValue2 = ((Boolean) C0146.n(10734, null, new Object[]{(String) C0196.n(45320, this), (String) C0196.n(45320, c0371p)})).booleanValue();
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        int iIntValue = ((Integer) C0196.n(82062, this)).intValue();
                                                        int iIntValue2 = ((Integer) C0196.n(82062, c0371p)).intValue();
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    return true;
                                                                case 503:
                                                                    if (iIntValue != iIntValue2) {
                                                                        i5 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    return false;
                                                                default:
                                                                    continue;
                                                            }
                                                            i5 = 48953;
                                                        }
                                                        break;
                                                    case 76:
                                                        return false;
                                                    case 239:
                                                        if (!zBooleanValue2) {
                                                            i4 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i4 = 48829;
                                            }
                                            break;
                                        case 47417:
                                            return false;
                                        case 47483:
                                            break;
                                        default:
                                            continue;
                                    }
                                    i3 = 48705;
                                }
                                break;
                            case 500:
                                return false;
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

    public final int hashCode() {
        int iIntValue;
        Integer num = (Integer) C0196.n(46471, this);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (num == null) {
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
                                iIntValue = 0;
                                break;
                        }
                    }
                    break;
                case 239:
                    iIntValue = ((Integer) C0196.n(71354, num, new Object[0])).intValue();
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
        return ((Integer) C0196.n(82062, this)).intValue() - (0 - (((iIntValue * (C0110.f319 ^ (-573))) + ((Integer) C0196.n(36903, (String) C0196.n(45320, this), new Object[0])).intValue()) * (C0015.f171 ^ (-951))));
    }

    public final String toString() throws Throwable {
        Object objN = null;
        short[] sArr = null;
        int iIntValue = 0;
        int i = 0;
        Object[] objArr = null;
        Integer numValueOf = null;
        String str = null;
        StringBuilder sb = null;
        Integer num = null;
        Object[] objArr2 = null;
        short[] sArr2 = null;
        Object[] objArr3 = null;
        Object[] objArr4 = null;
        String str2 = null;
        Object[] objArr5 = null;
        short[] sArr3 = null;
        Object[] objArr6 = null;
        Integer numValueOf2 = null;
        String str3 = null;
        Object[] objArr7 = null;
        Object[] objArr8 = null;
        Object[] objArr9 = null;
        String str4 = "ۣۤۢ";
        Integer numValueOf3 = null;
        while (true) {
            switch (C0034.m132(str4)) {
                case 1746786:
                    str4 = "ۧ۠ۥ";
                    objArr8 = new Object[]{Integer.valueOf(iIntValue)};
                    break;
                case 1746843:
                    objN = C0196.n(45320, this);
                    objArr5 = new Object[1];
                    str4 = "ۥۦۢ";
                    str2 = (String) objN;
                    break;
                case 1747807:
                    objN = C0198.n(88124, null, objArr);
                    String str5 = (String) objN;
                    sb = new StringBuilder(str5);
                    str4 = "ۥۡ۟";
                    str = str5;
                    break;
                case 1748646:
                    objArr2[0] = num;
                    objN = C0189.n(59434, sb, objArr2);
                    str4 = "ۦ۠ۢ";
                    break;
                case 1749609:
                    objArr3[1] = 21;
                    str4 = "ۥۨۤ";
                    numValueOf3 = Integer.valueOf(i);
                    break;
                case 1750539:
                    objN = C0196.n(76529);
                    iIntValue = C0042.f198;
                    str4 = "ۨۦۣ";
                    sArr3 = (short[]) objN;
                    break;
                case 1750788:
                    return (String) objN;
                case 1751501:
                    objN = C0198.n(89992, sb, new Object[0]);
                    str4 = "ۣۧۨ";
                    break;
                case 1751589:
                    objN = C0196.n(76529);
                    iIntValue = C0084.f293;
                    str4 = "ۤۧۡ";
                    sArr = (short[]) objN;
                    break;
                case 1751624:
                    objArr4[0] = str;
                    objN = C0149.n(86417, sb, objArr4);
                    str4 = "۟ۤ۠";
                    break;
                case 1751742:
                    i = iIntValue ^ (-407);
                    Object[] objArr10 = new Object[4];
                    objArr10[0] = sArr;
                    str4 = "ۥۨۧ";
                    objArr = objArr10;
                    break;
                case 1752515:
                    objN = C0196.n(46471, this);
                    objArr2 = new Object[1];
                    str4 = "ۡ۠ۥ";
                    num = (Integer) objN;
                    break;
                case 1752673:
                    objArr5[0] = str2;
                    objN = C0149.n(86417, sb, objArr5);
                    str4 = "ۣ۟ۧ";
                    break;
                case 1752737:
                    objArr3[2] = numValueOf3;
                    objArr3[3] = 1650;
                    str4 = "ۨۦۤ";
                    break;
                case 1752740:
                    objArr[1] = 0;
                    str4 = "ۨۢۦ";
                    numValueOf = Integer.valueOf(i);
                    break;
                case 1753448:
                    objN = C0196.n(76529);
                    iIntValue = C0069.f278;
                    str4 = "ۦۡۡ";
                    sArr2 = (short[]) objN;
                    break;
                case 1753478:
                    i = iIntValue ^ 272;
                    Object[] objArr11 = new Object[4];
                    objArr11[0] = sArr2;
                    str4 = "ۢ۠ۧ";
                    objArr3 = objArr11;
                    break;
                case 1753694:
                    objArr7[0] = str3;
                    objN = C0149.n(86417, sb, objArr7);
                    str4 = "ۨۡۥ";
                    break;
                case 1754412:
                    objN = C0191.n(99446, sb, objArr8);
                    str4 = "ۣۨۤ";
                    objArr9 = new Object[1];
                    break;
                case 1754441:
                    objN = C0149.n(36390, null, objArr6);
                    objArr7 = new Object[1];
                    str4 = "ۦۨ۠";
                    str3 = (String) objN;
                    break;
                case 1755376:
                    objArr6[2] = numValueOf2;
                    objArr6[3] = 2552;
                    str4 = "ۣۧۡ";
                    break;
                case 1755404:
                    objN = C0196.n(82062, this);
                    iIntValue = ((Integer) objN).intValue();
                    str4 = "۟ۢۥ";
                    break;
                case 1755436:
                    objArr[2] = numValueOf;
                    objArr[3] = 530;
                    str4 = "ۣ۠ۤ";
                    break;
                case 1755495:
                    objArr9[0] = ')';
                    objN = C0221.n(80489, sb, objArr9);
                    str4 = "ۤ۟ۨ";
                    break;
                case 1755557:
                    i = iIntValue ^ 60;
                    Object[] objArr12 = new Object[4];
                    objArr12[0] = sArr3;
                    str4 = "۠ۦ۠";
                    objArr6 = objArr12;
                    break;
                case 1755558:
                    objN = C0209.n(32662, null, objArr3);
                    objArr4 = new Object[1];
                    str4 = "ۣۤۧ";
                    str = (String) objN;
                    break;
                default:
                    objArr6[1] = 26;
                    str4 = "ۨ۠ۨ";
                    numValueOf2 = Integer.valueOf(i);
                    break;
            }
        }
    }
}
