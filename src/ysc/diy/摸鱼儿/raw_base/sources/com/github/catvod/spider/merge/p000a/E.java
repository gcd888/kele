package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.p004e.C0071;
import com.github.catvod.spider.merge.p020x.C0136;
import java.io.PrintStream;
import moyu.fucking.C0151;
import moyu.fucking.C0152;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0173;
import moyu.fucking.C0195;
import moyu.fucking.C0215;
import moyu.fucking.C0224;
import moyu.fucking.C0226;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class E {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f217short = {-31362, 22076, 22445, -27175, 26026, 30053, 23795, 20848};
    public static final E e = new E(false);

    public E(String str, String str2, String str3, boolean z) throws Throwable {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        int iIntValue = ((Integer) C0151.n(27095, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0152.n(66570, null, new Object[]{(String) C0226.n(66906, null, new Object[]{(String) C0215.n(3584)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public E(boolean z) throws Throwable {
        this(null, (String) C0224.n(58480, null, new Object[]{(short[]) C0215.n(66453), 0, Integer.valueOf(C0071.f280 ^ 43), 1172}), (String) C0162.n(59839, null, new Object[]{(short[]) C0215.n(66453), 4, Integer.valueOf(C0136.f345 ^ 725), 640}), z);
        int iIntValue = ((Integer) C0173.n(79936, null, new Object[0])).intValue();
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
                    C0195.n(19817, (PrintStream) C0195.n(72538), new Object[]{Integer.valueOf(((Integer) C0195.n(60398, null, new Object[]{(String) C0168.n(44870, null, new Object[]{(String) C0215.n(1886)})})).intValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }
}
