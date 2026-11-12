package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.C0141;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.X.C0051;
import com.github.catvod.spider.merge.f0.C0077;
import com.github.catvod.spider.merge.p0.C0110;
import com.github.catvod.spider.merge.p017u.C0127;
import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import moyu.fucking.C0146;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0162;
import moyu.fucking.C0163;
import moyu.fucking.C0189;
import moyu.fucking.C0195;
import moyu.fucking.C0196;
import moyu.fucking.C0198;
import moyu.fucking.C0217;
import moyu.fucking.C0221;
import moyu.fucking.C0224;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class C0367n {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f245short = {843, 887, 890, 866, 857, 890, 879, 888, 883, 819, 877, 894, 873, 872, 882, 884, 885, 806, 1170, 1182, 1247, 1245, 1245, 1233, 1227, 1232, 1226, 1155, 2079, 2067, 2136, 2134, 2134, 2115, 2147, 2130, 2119, 2139, 2112, 2062};
    public final long a;
    public final String b;
    public final Set c;
    public boolean d;
    public final LinkedHashMap e;

    public C0367n(long j, String str) throws Throwable {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = j;
        this.b = str;
        this.c = linkedHashSet;
        this.e = new LinkedHashMap();
        int iIntValue = ((Integer) C0163.n(32144, null, new Object[0])).intValue();
        int i = 1616;
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0152.n(66570, null, new Object[]{(String) C0152.n(7488, null, new Object[]{(String) C0196.n(36642)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
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
                    boolean z = obj instanceof C0367n;
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
                                C0367n c0367n = (C0367n) obj;
                                long jLongValue = ((Long) C0196.n(94383, c0367n)).longValue();
                                long jLongValue2 = ((Long) C0196.n(94383, this)).longValue();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            if (jLongValue2 != jLongValue) {
                                                i3 = 48736;
                                            }
                                            break;
                                        case 47384:
                                            boolean zBooleanValue = ((Boolean) C0146.n(10734, null, new Object[]{(String) C0217.n(42837, this), (String) C0217.n(42837, c0367n)})).booleanValue();
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        boolean zBooleanValue2 = ((Boolean) C0146.n(10734, null, new Object[]{(Set) C0196.n(1687, this), (Set) C0196.n(1687, c0367n)})).booleanValue();
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    return true;
                                                                case 503:
                                                                    if (!zBooleanValue2) {
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
                                                        if (!zBooleanValue) {
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

    public final int hashCode() throws Throwable {
        Object objN = null;
        Long l = null;
        long jLongValue = 0;
        long j = 0;
        long j2 = 0;
        int iIntValue = 0;
        int i = 0;
        int iIntValue2 = 0;
        String str = null;
        Object[] objArr = null;
        Integer num = null;
        Object[] objArr2 = null;
        String str2 = "ۡۦۤ";
        Set set = null;
        while (true) {
            switch (C0034.m132(str2)) {
                case 56446:
                    iIntValue2 = i ^ (-367);
                    str2 = "۠ۤۦ";
                    break;
                case 56545:
                    objN = C0196.n(36903, str, objArr);
                    str2 = "ۦۨ۠";
                    break;
                case 1746758:
                    iIntValue2 = i - iIntValue;
                    str2 = "۟ۨۦ";
                    break;
                case 1746973:
                    return iIntValue2;
                case 1747713:
                    jLongValue = l.longValue();
                    str2 = "ۤۡ۠";
                    break;
                case 1747715:
                    i = C0051.f207;
                    str2 = "ۤۢ";
                    break;
                case 1747810:
                    i = iIntValue * iIntValue2;
                    str2 = "ۧۥۢ";
                    break;
                case 1747843:
                    iIntValue = num.intValue();
                    str2 = "ۢۡۦ";
                    break;
                case 1748643:
                    i = C0141.f351;
                    str2 = "ۣۤۤ";
                    break;
                case 1748831:
                    objN = C0196.n(94383, this);
                    str2 = "ۢۢۨ";
                    break;
                case 1749636:
                    str2 = "ۥۣۤ";
                    str = (String) objN;
                    break;
                case 1749639:
                    iIntValue2 = iIntValue - 8;
                    str2 = "ۧ۟ۡ";
                    break;
                case 1749672:
                    str2 = "۠ۡۢ";
                    l = (Long) objN;
                    break;
                case 1749695:
                    iIntValue2 = num.intValue();
                    str2 = "ۥ۟ۦ";
                    break;
                case 1750819:
                    i = iIntValue2 * iIntValue;
                    str2 = "ۤۥۨ";
                    break;
                case 1751555:
                    j = jLongValue >>> 32;
                    str2 = "ۨۦۡ";
                    break;
                case 1751588:
                    str2 = "ۣۢ۠";
                    num = (Integer) objN;
                    break;
                case 1751651:
                    iIntValue = i ^ (-786);
                    str2 = "ۣۨۨ";
                    break;
                case 1751687:
                    objN = C0196.n(1687, this);
                    str2 = "ۦۥۦ";
                    break;
                case 1751743:
                    str2 = "ۧۨۡ";
                    objArr2 = new Object[0];
                    break;
                case 1752460:
                    iIntValue = 0 - iIntValue2;
                    str2 = "۟ۡۨ";
                    break;
                case 1752582:
                    str2 = "ۧۨ";
                    objArr = new Object[0];
                    break;
                case 1753546:
                    iIntValue = (int) j2;
                    str2 = "۠ۡۤ";
                    break;
                case 1753607:
                    str2 = "ۤۧۢ";
                    set = (Set) objN;
                    break;
                case 1754377:
                    iIntValue = iIntValue2 + i;
                    str2 = "ۨ۟ۢ";
                    break;
                case 1754564:
                    objN = C0217.n(42837, this);
                    str2 = "ۣۢۡ";
                    break;
                case 1754656:
                    objN = C0196.n(71354, set, objArr2);
                    str2 = "ۤۢۢ";
                    break;
                case 1755339:
                    iIntValue2 = iIntValue + 8;
                    str2 = "ۡ۠ۢ";
                    break;
                case 1755555:
                    j2 = jLongValue ^ j;
                    str2 = "ۦۣۧ";
                    break;
                default:
                    str2 = "۠ۥۨ";
                    num = (Integer) objN;
                    break;
            }
        }
    }

    public final String toString() throws Throwable {
        Object objN = null;
        short[] sArr = null;
        int i = 0;
        int i2 = 0;
        Object[] objArr = null;
        Integer numValueOf = null;
        StringBuilder sb = null;
        long jLongValue = 0;
        Object[] objArr2 = null;
        short[] sArr2 = null;
        Integer num = null;
        Object[] objArr3 = null;
        Object[] objArr4 = null;
        short[] sArr3 = null;
        Object[] objArr5 = null;
        Integer num2 = null;
        Object[] objArr6 = null;
        Object[] objArr7 = null;
        Object[] objArr8 = null;
        String str = "ۡۢ";
        Object[] objArr9 = null;
        while (true) {
            switch (C0034.m132(str)) {
                case 56319:
                    objN = C0196.n(67334);
                    str = "ۢ۟ۤ";
                    break;
                case 56353:
                    objN = C0196.n(67334);
                    i = C0110.f319;
                    str = "ۨۡۧ";
                    sArr = (short[]) objN;
                    break;
                case 56388:
                    objArr9[3] = 1214;
                    objN = C0149.n(63176, null, objArr9);
                    str = "ۦۧۢ";
                    break;
                case 56452:
                    i = C0077.f286;
                    i2 = i ^ (-416);
                    str = "ۢۦۤ";
                    sArr3 = (short[]) objN;
                    break;
                case 56505:
                    objN = C0198.n(89992, sb, new Object[0]);
                    str = "ۧۥۧ";
                    break;
                case 56568:
                    objN = C0217.n(42837, this);
                    str = "ۦۣۧ";
                    break;
                case 1746789:
                    Object[] objArr10 = new Object[4];
                    objArr10[0] = sArr2;
                    num = 18;
                    str = "ۡۡۤ";
                    objArr9 = objArr10;
                    break;
                case 1746882:
                    objN = C0196.n(67334);
                    str = "ۤۨ";
                    break;
                case 1746936:
                    objN = C0224.n(54707, null, objArr);
                    sb = new StringBuilder((String) objN);
                    str = "ۦۣۧ";
                    break;
                case 1746967:
                    objArr5[1] = num2;
                    objArr5[2] = Integer.valueOf(i2);
                    str = "ۨۧۨ";
                    break;
                case 1748646:
                    objArr7 = new Object[]{(Set) objN};
                    str = "ۣۢۤ";
                    break;
                case 1748676:
                    objArr9[1] = num;
                    objArr9[2] = Integer.valueOf(i2);
                    str = "ۢۦ";
                    break;
                case 1748803:
                    objArr[2] = numValueOf;
                    objArr[3] = 795;
                    str = "۟ۧ۠";
                    break;
                case 1749572:
                    objArr6 = new Object[]{(String) objN};
                    str = "ۥۧۨ";
                    break;
                case 1749575:
                    i = C0127.f336;
                    i2 = i ^ (-965);
                    str = "۟ۢۨ";
                    sArr2 = (short[]) objN;
                    break;
                case 1749699:
                    objN = C0189.n(59434, sb, objArr7);
                    str = "۟ۦ۟";
                    objArr8 = new Object[1];
                    break;
                case 1749792:
                    objArr5 = new Object[4];
                    objArr5[0] = sArr3;
                    str = "۟ۨ۠";
                    num2 = 28;
                    break;
                case 1752710:
                    objN = C0196.n(1687, this);
                    str = "ۡ۠ۥ";
                    break;
                case 1753543:
                    objArr[1] = 0;
                    str = "ۡۥۧ";
                    numValueOf = Integer.valueOf(i2);
                    break;
                case 1753546:
                    objArr4 = new Object[]{(String) objN};
                    str = "۟ۥۨ";
                    break;
                case 1753665:
                    objArr3 = new Object[]{(String) objN};
                    str = "ۨ۠";
                    break;
                case 1753666:
                    objN = C0196.n(94383, this);
                    jLongValue = ((Long) objN).longValue();
                    str = "ۨۤۥ";
                    break;
                case 1754569:
                    return (String) objN;
                case 1755406:
                    i2 = i ^ (-562);
                    Object[] objArr11 = new Object[4];
                    objArr11[0] = sArr;
                    str = "ۦۣۤ";
                    objArr = objArr11;
                    break;
                case 1755497:
                    str = "۠۟";
                    objArr2 = new Object[]{Long.valueOf(jLongValue)};
                    break;
                case 1755593:
                    objArr5[3] = 2099;
                    objN = C0162.n(41206, null, objArr5);
                    str = "ۢ۟ۡ";
                    break;
                default:
                    objArr8[0] = ')';
                    objN = C0221.n(80489, sb, objArr8);
                    str = "ۦ۟";
                    break;
            }
        }
    }
}
