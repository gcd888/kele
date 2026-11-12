package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.p011m.C0102;
import com.github.catvod.spider.merge.p017u.C0129;
import java.io.PrintStream;
import java.util.concurrent.ThreadFactory;
import moyu.fucking.C0157;
import moyu.fucking.C0178;
import moyu.fucking.C0195;
import moyu.fucking.C0196;
import moyu.fucking.C0198;
import moyu.fucking.C0210;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ThreadFactoryC0365m implements ThreadFactory {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f244short = {2707, 2713, 2705, 2718, 2713, 2710, 2773, 2716, 2710, 2699, 878, 872, 801, 879, 864, 873, 877, 866, 889, 892};
    public final int a;

    public /* synthetic */ ThreadFactoryC0365m(int i) throws Throwable {
        this.a = i;
        int iIntValue = ((Integer) C0157.n(4739, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0178.n(16623, null, new Object[]{(String) C0157.n(79159, null, new Object[]{(String) C0196.n(87795)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) throws Throwable {
        switch (((Integer) C0196.n(14072, this)).intValue()) {
            case 0:
                Thread thread = new Thread(runnable, (String) C0195.n(19148, null, new Object[]{(short[]) C0196.n(82171), 10, Integer.valueOf(C0102.f311 ^ 557), 780}));
                C0210.n(60380, thread, new Object[]{true});
                return thread;
            default:
                Thread thread2 = new Thread(runnable, (String) C0198.n(62249, null, new Object[]{(short[]) C0196.n(82171), 0, Integer.valueOf(C0129.f338 ^ 920), 2808}));
                C0210.n(60380, thread2, new Object[]{true});
                return thread2;
        }
    }
}
