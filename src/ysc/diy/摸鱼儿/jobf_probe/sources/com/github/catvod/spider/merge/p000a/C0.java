package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.j0.C0094;
import com.github.catvod.spider.merge.p020x.C0136;
import java.io.PrintStream;
import moyu.fucking.C0152;
import moyu.fucking.C0157;
import moyu.fucking.C0162;
import moyu.fucking.C0188;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0201;
import moyu.fucking.C0215;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class C0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f216short = {28943, 22561, 24133, -30127, 1870, 1876, 1663, 24333, 31192, 18613, 28924, 1657, 1540, 28767, 22897, 24341, -29951, 1566, 1540};
    public final int a;
    public final I0 b;

    public /* synthetic */ C0(I0 i0, int i) throws Throwable {
        this.a = i;
        this.b = i0;
        int iIntValue = ((Integer) C0201.n(23303, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0152.n(74755, null, new Object[]{(String) C0215.n(70298)})})});
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
        switch (((Integer) C0215.n(74711, this)).intValue()) {
            case 0:
                StringBuilder sb = new StringBuilder((String) C0162.n(89013, null, new Object[]{(short[]) C0215.n(99982), 6, Integer.valueOf(C0136.f345 ^ 732), 1572}));
                C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb, new Object[0])});
                break;
            default:
                StringBuilder sb2 = new StringBuilder((String) C0157.n(97123, null, new Object[]{(short[]) C0215.n(99982), 0, Integer.valueOf(C0094.f303 ^ (-126)), 1908}));
                C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb2, new Object[0])});
                break;
        }
    }
}
