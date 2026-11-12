package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.B.C0005;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.X.C0051;
import com.github.catvod.spider.merge.p007h.C0084;
import java.io.PrintStream;
import moyu.fucking.C0152;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0181;
import moyu.fucking.C0191;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0233;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class EnumC0293s0 {
    public static final EnumC0293s0 a;
    public static final EnumC0293s0 b;
    public static final EnumC0293s0 c;
    public static final EnumC0293s0[] d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f150short = {1874, 1861, 1857, 1860, 1881, 2882, 2906, 2904, 2881, 2881, 2900, 2901, 1796, 1811, 1794, 1796, 1807};

    static {
        EnumC0293s0 enumC0293s0 = new EnumC0293s0((String) C0198.n(6303, null, new Object[]{(short[]) C0233.n(83178), 0, Integer.valueOf(C0005.f161 ^ 644), 1792}), 0);
        a = enumC0293s0;
        EnumC0293s0 enumC0293s1 = new EnumC0293s0((String) C0191.n(93496, null, new Object[]{(short[]) C0233.n(83178), 5, Integer.valueOf(C0084.f293 ^ (-389)), 2833}), 1);
        b = enumC0293s1;
        String str = (String) C0162.n(76230, null, new Object[]{(short[]) C0233.n(83178), 12, Integer.valueOf(C0051.f207 ^ (-373)), 1878});
        int i = C0005.f161 ^ 643;
        EnumC0293s0 enumC0293s2 = new EnumC0293s0(str, i);
        c = enumC0293s2;
        EnumC0293s0[] enumC0293s0Arr = new EnumC0293s0[3];
        enumC0293s0Arr[0] = enumC0293s0;
        enumC0293s0Arr[1] = enumC0293s1;
        enumC0293s0Arr[i] = enumC0293s2;
        d = enumC0293s0Arr;
    }

    public EnumC0293s0(String str, int i) throws Throwable {
        super(str, i);
        int iIntValue = ((Integer) C0152.n(24832, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0233.n(26450, null, new Object[]{(String) C0233.n(15494)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    public static EnumC0293s0 valueOf(String str) throws Throwable {
        Object[] objArr = null;
        Enum r1 = null;
        EnumC0293s0 enumC0293s0 = null;
        Object objN = null;
        Object obj = null;
        String str2 = "ۤۨۦ";
        while (true) {
            switch (C0034.m132(str2)) {
                case 1746940:
                    objN = C0181.n(99183, null, objArr);
                    str2 = "ۣۢۨ";
                    break;
                case 1749820:
                    return enumC0293s0;
                case 1749853:
                    str2 = "ۣۤ۟";
                    r1 = (Enum) objN;
                    break;
                case 1750569:
                    objArr[0] = obj;
                    str2 = "۟۠";
                    break;
                case 1750686:
                    str2 = "ۢۧۡ";
                    enumC0293s0 = (EnumC0293s0) r1;
                    break;
                case 1751778:
                    str2 = "ۥۥۦ";
                    obj = EnumC0293s0.class;
                    break;
                case 1752646:
                    str2 = "ۣ۠ۦ";
                    objArr = new Object[2];
                    break;
                default:
                    objArr[1] = str;
                    str2 = "۟ۧۤ";
                    break;
            }
        }
    }

    public static EnumC0293s0[] values() throws Throwable {
        String str = "ۣۤۨ";
        Object[] objArr = null;
        Object objN = null;
        EnumC0293s0[] enumC0293s0Arr = null;
        while (true) {
            switch (C0034.m132(str)) {
                case 1751625:
                    objN = C0233.n(33040);
                    str = "ۦۤۨ";
                    break;
                case 1752672:
                    objN = C0233.n(56976, enumC0293s0Arr, objArr);
                    str = "ۧ۟ۡ";
                    break;
                case 1753668:
                    str = "ۥۦۡ";
                    objArr = new Object[0];
                    break;
                case 1754377:
                    str = "ۨ۠ۡ";
                    enumC0293s0Arr = (EnumC0293s0[]) objN;
                    break;
                case 1755369:
                    return enumC0293s0Arr;
                default:
                    str = "ۦۧۥ";
                    enumC0293s0Arr = (EnumC0293s0[]) objN;
                    break;
            }
        }
    }
}
