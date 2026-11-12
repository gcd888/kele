package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.E.C0013;
import com.github.catvod.spider.merge.N.C0035;
import com.github.catvod.spider.merge.O.C0038;
import com.github.catvod.spider.merge.c0.C0064;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import moyu.fucking.C0152;
import moyu.fucking.C0157;
import moyu.fucking.C0162;
import moyu.fucking.C0183;
import moyu.fucking.C0186;
import moyu.fucking.C0188;
import moyu.fucking.C0189;
import moyu.fucking.C0191;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0204;
import moyu.fucking.C0215;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class R0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f222short = {1628, 1619, 1622, 1626, 1617, 1611, 1632, 1622, 1627, 735, 724, 733, 2476, 1641, 1654, 1642};
    public final int a;
    public final Z0 b;
    public final Map c;

    public /* synthetic */ R0(Z0 z0, HashMap map, int i) throws Throwable {
        this.a = i;
        this.b = z0;
        this.c = map;
        int iIntValue = ((Integer) C0183.n(88832, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0152.n(66570, null, new Object[]{(String) C0188.n(85632, null, new Object[]{(String) C0183.n(47336)})})});
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
        int i = 0;
        Map map = (Map) C0183.n(57287, this);
        Z0 z0 = (Z0) C0183.n(2394, this);
        switch (((Integer) C0183.n(46093, this)).intValue()) {
            case 0:
                try {
                    String str = (String) C0183.n(50244, null, new Object[]{(HashMap) map});
                    boolean zBooleanValue = ((Boolean) C0189.n(4909, null, new Object[]{str})).booleanValue();
                    int i2 = 1864;
                    while (true) {
                        i2 ^= 1881;
                        switch (i2) {
                            case 17:
                                i2 = !zBooleanValue ? 48736 : 48705;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C0183.n(45387, z0);
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 45:
                                            break;
                                        case 76:
                                            break;
                                        case 239:
                                            i3 = scheduledExecutorService != null ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                C0157.n(96203, null, new Object[]{new RunnableC0382v(z0, str, C0064.f273 ^ (-447))});
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                    }
                } catch (Exception e) {
                    int i4 = 48891;
                    while (true) {
                        i4 ^= 48908;
                        switch (i4) {
                            case 22:
                                return;
                            case 503:
                                i4 = 48922;
                                break;
                        }
                    }
                }
                break;
            default:
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) C0183.n(45387, z0);
                int i5 = 1616;
                while (true) {
                    i5 ^= 1633;
                    switch (i5) {
                        case 14:
                            break;
                        case 49:
                            i5 = scheduledExecutorService2 != null ? 1709 : 1678;
                            break;
                        case 204:
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
                C0204.n(62847, map, new Object[]{(String) C0198.n(94433, null, new Object[]{(short[]) C0183.n(79059), 0, Integer.valueOf(C0013.f169 ^ 662), 1599}), (String) C0191.n(93496, null, new Object[]{(short[]) C0183.n(79059), 9, Integer.valueOf(C0038.f194 ^ 220), 748})});
                C0204.n(62847, map, new Object[]{(String) C0198.n(30341, null, new Object[]{(short[]) C0183.n(79059), 12, 1, 2522}), (String) C0195.n(85847, null, new Object[]{(short[]) C0183.n(79059), 13, Integer.valueOf(C0035.f191 ^ 319), 1624})});
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) C0215.n(92551, null, new Object[]{1});
                z0.D = scheduledExecutorService3;
                int iIntValue = ((Integer) C0186.n(14255, null, new Object[0])).intValue();
                int i6 = 1740;
                while (true) {
                    i6 ^= 1757;
                    switch (i6) {
                        case 17:
                            if (iIntValue >= 0) {
                                i6 = 1833;
                            }
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case 500:
                            C0162.n(83524, (PrintStream) C0195.n(72538), new Object[]{Long.valueOf(((Long) C0162.n(73560, null, new Object[]{(String) C0183.n(23938, null, new Object[]{(String) C0183.n(79294)})})).longValue())});
                            break;
                        default:
                            continue;
                    }
                    i6 = 1802;
                }
                break;
        }
    }
}
