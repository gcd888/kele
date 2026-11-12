package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.p009k.a;
import com.github.catvod.spider.merge.p009k.d;
import java.io.PrintStream;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import moyu.fucking.C0152;
import moyu.fucking.C0157;
import moyu.fucking.C0168;
import moyu.fucking.C0175;
import moyu.fucking.C0178;
import moyu.fucking.C0185;
import moyu.fucking.C0189;
import moyu.fucking.C0195;
import moyu.fucking.C0200;
import moyu.fucking.C0203;
import moyu.fucking.C0228;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0381u0 implements Runnable {
    public final int a;
    public final A0 b;

    public /* synthetic */ RunnableC0381u0(A0 a0, int i) throws Throwable {
        this.a = i;
        this.b = a0;
        int iIntValue = ((Integer) C0168.n(23434, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0168.n(19169, null, new Object[]{(String) C0228.n(84937)})})});
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
        switch (((Integer) C0228.n(18865, this)).intValue()) {
            case 0:
                A0 a0 = (A0) C0228.n(82478, this);
                C0185.n(52935, (ConcurrentHashMap) C0175.n(72974, a0), new Object[0]);
                C0185.n(52935, (ConcurrentHashMap) C0203.n(39681, a0), new Object[0]);
                C0185.n(52935, (ConcurrentHashMap) C0189.n(16276, a0), new Object[0]);
                C0185.n(21601, (Set) C0200.n(72137, a0), new Object[0]);
                a0.e = null;
                C0200.n(96233, (a) C0203.n(21419, null, new Object[0]), new Object[]{new d()});
                synchronized (C0228.n(15210)) {
                    a.c = null;
                    break;
                }
                return;
            case 1:
                ((Integer) C0175.n(46748)).intValue();
                A0 a1 = (A0) C0228.n(82478, this);
                a1.s = true;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C0175.n(39534, a1);
                int i = 1740;
                while (true) {
                    i ^= 1757;
                    switch (i) {
                        case 17:
                            i = scheduledExecutorService != null ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case 500:
                            break;
                        default:
                            break;
                    }
                }
                int iIntValue = ((Integer) C0178.n(64879, null, new Object[0])).intValue();
                int i2 = 1864;
                while (true) {
                    i2 ^= 1881;
                    switch (i2) {
                        case 17:
                            if (iIntValue >= 0) {
                                i2 = 48736;
                            }
                            break;
                        case 47384:
                            return;
                        case 47417:
                            C0157.n(99237, (PrintStream) C0195.n(72538), new Object[]{Double.valueOf(((Double) C0157.n(3141, null, new Object[]{(String) C0152.n(9835, null, new Object[]{(String) C0228.n(31128)})})).doubleValue())});
                            return;
                        case 47483:
                            break;
                        default:
                            continue;
                    }
                    i2 = 48705;
                }
                break;
            default:
                ((Integer) C0175.n(46748)).intValue();
                A0 a2 = (A0) C0228.n(82478, this);
                a2.s = true;
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) C0175.n(39534, a2);
                int i3 = 1616;
                while (true) {
                    i3 ^= 1633;
                    switch (i3) {
                        case 14:
                            break;
                        case 49:
                            if (scheduledExecutorService2 != null) {
                                i3 = 1709;
                            }
                            break;
                        case 204:
                            return;
                        case 239:
                            return;
                        default:
                            continue;
                    }
                    i3 = 1678;
                }
                break;
        }
    }
}
