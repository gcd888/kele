package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.L.C0031;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.Z.C0054;
import com.github.catvod.spider.merge.b0.C0061;
import com.github.catvod.spider.merge.f0.C0077;
import java.io.PrintStream;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0162;
import moyu.fucking.C0181;
import moyu.fucking.C0195;
import moyu.fucking.C0198;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class K1 {
    public static final K1 a;
    public static final K1 b;
    public static final K1 c;
    public static final K1[] d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f132short = {1679, 1694, 1694, 1666, 1671, 1675, 1674, 436, 438, 435, 435, 416, 428, 424, 438, 427, 444, 439, 1495, 1488, 1480, 1503, 1490, 1495, 1498};

    static {
        K1 k1 = new K1((String) C0198.n(45548, null, new Object[]{(short[]) C0181.n(49068), 0, Integer.valueOf(C0031.f187 ^ (-615)), 1742}), 0);
        a = k1;
        K1 k2 = new K1((String) C0162.n(29890, null, new Object[]{(short[]) C0181.n(49068), 7, Integer.valueOf(C0054.f210 ^ (-642)), 511}), 1);
        b = k2;
        String str = (String) C0162.n(59839, null, new Object[]{(short[]) C0181.n(49068), 18, Integer.valueOf(C0077.f286 ^ (-405)), 1438});
        int i = C0061.f270 ^ (-928);
        K1 k3 = new K1(str, i);
        c = k3;
        K1[] k1Arr = new K1[3];
        k1Arr[0] = k1;
        k1Arr[1] = k2;
        k1Arr[i] = k3;
        d = k1Arr;
    }

    public K1(String str, int i) throws Throwable {
        super(str, i);
        int iIntValue = ((Integer) C0181.n(6638, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0149.n(54590, null, new Object[]{(String) C0152.n(9835, null, new Object[]{(String) C0181.n(66709)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    public static K1 valueOf(String str) throws Throwable {
        Object[] objArr = null;
        Enum r2 = null;
        K1 k1 = null;
        Object obj = null;
        Object objN = null;
        String str2 = "ۣۥۦ";
        while (true) {
            switch (C0034.m132(str2)) {
                case 1750630:
                    str2 = "ۤۨۦ";
                    objArr = new Object[2];
                    break;
                case 1750690:
                    return k1;
                case 1750724:
                    str2 = "ۣۢۥ";
                    obj = K1.class;
                    break;
                case 1751554:
                    str2 = "ۣۣۤ";
                    k1 = (K1) r2;
                    break;
                case 1751778:
                    objArr[0] = obj;
                    str2 = "ۥۤۡ";
                    break;
                case 1752610:
                    objArr[1] = str;
                    str2 = "ۥۥۣ";
                    break;
                case 1752643:
                    objN = C0181.n(99183, null, objArr);
                    str2 = "۟ۦۣ";
                    break;
                default:
                    str2 = "ۤۡ۟";
                    r2 = (Enum) objN;
                    break;
            }
        }
    }

    public static K1[] values() throws Throwable {
        String str = "ۣۡۦ";
        Object[] objArr = null;
        Object objN = null;
        K1[] k1Arr = null;
        while (true) {
            switch (C0034.m132(str)) {
                case 1747651:
                    str = "ۦۣ۟";
                    k1Arr = (K1[]) objN;
                    break;
                case 1747741:
                    str = "ۤۢۧ";
                    k1Arr = (K1[]) objN;
                    break;
                case 1750600:
                    objN = C0181.n(84905);
                    str = "۠۟ۢ";
                    break;
                case 1751593:
                    return k1Arr;
                case 1753569:
                    objN = C0181.n(57764, k1Arr, objArr);
                    str = "۠ۢ۟";
                    break;
                default:
                    str = "ۦۤ۟";
                    objArr = new Object[0];
                    break;
            }
        }
    }
}
