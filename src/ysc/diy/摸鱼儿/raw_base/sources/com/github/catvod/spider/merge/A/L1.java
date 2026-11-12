package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.X.C0051;
import com.github.catvod.spider.merge.c0.C0065;
import com.github.catvod.spider.merge.p017u.C0127;
import java.io.PrintStream;
import moyu.fucking.C0157;
import moyu.fucking.C0168;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0195;
import moyu.fucking.C0198;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class L1 {
    public static final L1 a;
    public static final L1 b;
    public static final L1 c;
    public static final L1[] d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f133short = {2183, 2177, 2199, 2199, 2193, 2183, 2183, 2929, 2934, 2942, 2939, 2930, 2931, 2557, 2538, 2540, 2534};

    static {
        L1 l1 = new L1((String) C0182.n(69249, null, new Object[]{(short[]) C0181.n(70858), 0, Integer.valueOf(C0127.f336 ^ (-970)), 2260}), 0);
        a = l1;
        L1 l2 = new L1((String) C0157.n(78385, null, new Object[]{(short[]) C0181.n(70858), 7, Integer.valueOf(C0051.f207 ^ (-376)), 2871}), 1);
        b = l2;
        String str = (String) C0198.n(51837, null, new Object[]{(short[]) C0181.n(70858), 13, Integer.valueOf(C0065.f274 ^ 23), 2495});
        int i = C0042.f198 ^ 57;
        L1 l3 = new L1(str, i);
        c = l3;
        L1[] l1Arr = new L1[3];
        l1Arr[0] = l1;
        l1Arr[1] = l2;
        l1Arr[i] = l3;
        d = l1Arr;
    }

    public L1(String str, int i) throws Throwable {
        super(str, i);
        int iIntValue = ((Integer) C0181.n(79147, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0181.n(71531, null, new Object[]{(String) C0181.n(91618)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    public static L1 valueOf(String str) throws Throwable {
        Object obj = null;
        Object objN = null;
        L1 l1 = null;
        Enum r2 = null;
        Object[] objArr = null;
        String str2 = "ۡۧۥ";
        while (true) {
            switch (C0034.m132(str2)) {
                case 56292:
                    objArr[0] = obj;
                    str2 = "ۧ۟ۤ";
                    break;
                case 1747841:
                    objN = C0181.n(99183, null, objArr);
                    str2 = "ۥۤۧ";
                    break;
                case 1748863:
                    str2 = "ۦۡۢ";
                    obj = L1.class;
                    break;
                case 1752610:
                    str2 = "ۧ۟ۡ";
                    l1 = (L1) r2;
                    break;
                case 1753479:
                    str2 = "ۣ۟";
                    objArr = new Object[2];
                    break;
                case 1754377:
                    return l1;
                case 1754380:
                    objArr[1] = str;
                    str2 = "۠ۥۦ";
                    break;
                default:
                    str2 = "ۥۤۡ";
                    r2 = (Enum) objN;
                    break;
            }
        }
    }

    public static L1[] values() throws Throwable {
        String str = "۠۠۠";
        Object[] objArr = null;
        Object objN = null;
        L1[] l1Arr = null;
        while (true) {
            switch (C0034.m132(str)) {
                case 1747680:
                    objN = C0181.n(67025);
                    str = "ۦۣۡ";
                    break;
                case 1748704:
                    str = "ۣۢ۠";
                    objArr = new Object[0];
                    break;
                case 1750625:
                    objN = C0181.n(54278, l1Arr, objArr);
                    str = "ۢ۟ۧ";
                    break;
                case 1753480:
                    str = "ۡۢۡ";
                    l1Arr = (L1[]) objN;
                    break;
                case 1754440:
                    return l1Arr;
                default:
                    str = "ۧۡۢ";
                    l1Arr = (L1[]) objN;
                    break;
            }
        }
    }
}
