package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.L.C0033;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.T.C0048;
import com.github.catvod.spider.merge.e0.C0075;
import com.github.catvod.spider.merge.p0.C0111;
import java.io.PrintStream;
import moyu.fucking.C0149;
import moyu.fucking.C0155;
import moyu.fucking.C0178;
import moyu.fucking.C0181;
import moyu.fucking.C0195;
import moyu.fucking.C0198;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class EnumC0262h1 {
    public static final EnumC0262h1 a;
    public static final EnumC0262h1 b;
    public static final EnumC0262h1 c;
    public static final EnumC0262h1[] d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f138short = {2066, 2069, 2077, 2072, 2065, 2064, 573, 571, 557, 557, 555, 573, 573, 2621, 2610, 2619, 2623, 2608, 2603, 2606, 2593, 2616, 2623, 2615, 2610, 2619, 2618};

    static {
        EnumC0262h1 enumC0262h1 = new EnumC0262h1((String) C0198.n(88124, null, new Object[]{(short[]) C0155.n(35460), 0, Integer.valueOf(C0111.f320 ^ (-934)), 2132}), 0);
        a = enumC0262h1;
        EnumC0262h1 enumC0262h2 = new EnumC0262h1((String) C0178.n(65464, null, new Object[]{(short[]) C0155.n(35460), 6, Integer.valueOf(C0048.f204 ^ 851), 622}), 1);
        b = enumC0262h2;
        String str = (String) C0149.n(36390, null, new Object[]{(short[]) C0155.n(35460), 13, Integer.valueOf(C0075.f284 ^ 780), 2686});
        int i = C0033.f189 ^ (-419);
        EnumC0262h1 enumC0262h3 = new EnumC0262h1(str, i);
        c = enumC0262h3;
        EnumC0262h1[] enumC0262h1Arr = new EnumC0262h1[3];
        enumC0262h1Arr[0] = enumC0262h1;
        enumC0262h1Arr[1] = enumC0262h2;
        enumC0262h1Arr[i] = enumC0262h3;
        d = enumC0262h1Arr;
    }

    public EnumC0262h1(String str, int i) throws Throwable {
        super(str, i);
        int iIntValue = ((Integer) C0155.n(6683, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0155.n(62607, null, new Object[]{(String) C0155.n(45679)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    public static EnumC0262h1 valueOf(String str) throws Throwable {
        EnumC0262h1 enumC0262h1 = null;
        Enum r1 = null;
        Object[] objArr = null;
        Object obj = null;
        Object objN = null;
        String str2 = "ۣۣۢ";
        while (true) {
            switch (C0034.m132(str2)) {
                case 56390:
                    objN = C0181.n(99183, null, objArr);
                    str2 = "ۥۣ";
                    break;
                case 56478:
                    str2 = "ۣۨۨ";
                    r1 = (Enum) objN;
                    break;
                case 1749573:
                    str2 = "ۣۤۤ";
                    objArr = new Object[2];
                    break;
                case 1749698:
                    str2 = "ۢ۟ۢ";
                    obj = EnumC0262h1.class;
                    break;
                case 1750754:
                    return enumC0262h1;
                case 1750819:
                    str2 = "ۣۦۥ";
                    enumC0262h1 = (EnumC0262h1) r1;
                    break;
                case 1751621:
                    objArr[0] = obj;
                    str2 = "ۥۦ";
                    break;
                default:
                    objArr[1] = str;
                    str2 = "ۢۨ";
                    break;
            }
        }
    }

    public static EnumC0262h1[] values() throws Throwable {
        String str = "ۨۥ۟";
        Object[] objArr = null;
        Object objN = null;
        EnumC0262h1[] enumC0262h1Arr = null;
        while (true) {
            switch (C0034.m132(str)) {
                case 1748677:
                    str = "ۥۣ۟";
                    enumC0262h1Arr = (EnumC0262h1[]) objN;
                    break;
                case 1751654:
                    str = "ۣۣۧ";
                    enumC0262h1Arr = (EnumC0262h1[]) objN;
                    break;
                case 1752577:
                    str = "ۦۢ۟";
                    objArr = new Object[0];
                    break;
                case 1753507:
                    objN = C0155.n(43738, enumC0262h1Arr, objArr);
                    str = "ۤۤۦ";
                    break;
                case 1754503:
                    return enumC0262h1Arr;
                default:
                    objN = C0155.n(84403);
                    str = "ۡۡۥ";
                    break;
            }
        }
    }
}
