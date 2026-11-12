package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.p013o.a;
import java.io.PrintStream;
import java.util.concurrent.ScheduledExecutorService;
import moyu.fucking.C0157;
import moyu.fucking.C0183;
import moyu.fucking.C0195;
import moyu.fucking.C0209;
import moyu.fucking.C0233;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class T0 implements Runnable {
    public final int a;
    public final Z0 b;

    public /* synthetic */ T0(Z0 z0, int i) throws Throwable {
        this.a = i;
        this.b = z0;
        int iIntValue = ((Integer) C0157.n(49675, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Float) C0157.n(17336, null, new Object[]{(String) C0209.n(36257, null, new Object[]{(String) C0183.n(24145)})})});
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
        switch (((Integer) C0183.n(72315, this)).intValue()) {
            case 0:
                Z0 z0 = (Z0) C0183.n(36038, this);
                try {
                    String str = (String) C0183.n(24071, null, new Object[0]);
                    boolean zBooleanValue = ((Boolean) C0195.n(41159, null, new Object[]{str})).booleanValue();
                    int i = 1864;
                    while (true) {
                        i ^= 1881;
                        switch (i) {
                            case 17:
                                i = !zBooleanValue ? 48736 : 48705;
                                break;
                            case 47384:
                                break;
                            case 47417:
                                z0.a = str;
                                C0183.n(93620, (a) C0183.n(51702, null, new Object[0]), new Object[]{str});
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                    }
                    C0183.n(80733, z0, new Object[0]);
                    break;
                } catch (Exception e) {
                    int i2 = 48891;
                    while (true) {
                        i2 ^= 48908;
                        switch (i2) {
                            case 22:
                                return;
                            case 503:
                                i2 = 48922;
                                break;
                        }
                    }
                }
                break;
            case 1:
                Z0 z1 = (Z0) C0183.n(36038, this);
                try {
                    C0183.n(80733, z1, new Object[0]);
                    break;
                } catch (Exception e2) {
                    int i3 = 48767;
                    while (true) {
                        i3 ^= 48784;
                        switch (i3) {
                            case 14:
                                return;
                            case 239:
                                i3 = 48798;
                                break;
                        }
                    }
                }
                break;
            default:
                Z0 z2 = (Z0) C0183.n(36038, this);
                z2.e = true;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C0183.n(45387, z2);
                int i4 = 1616;
                while (true) {
                    i4 ^= 1633;
                    switch (i4) {
                        case 14:
                            break;
                        case 49:
                            i4 = scheduledExecutorService != null ? 1709 : 1678;
                            break;
                        case 204:
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
                int iIntValue = ((Integer) C0157.n(49675, null, new Object[0])).intValue();
                int i5 = 1740;
                while (true) {
                    i5 ^= 1757;
                    switch (i5) {
                        case 17:
                            if (iIntValue >= 0) {
                                i5 = 1833;
                            }
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case 500:
                            C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0233.n(11578, null, new Object[]{(String) C0183.n(41634)})})});
                            break;
                        default:
                            continue;
                    }
                    i5 = 1802;
                }
                break;
        }
    }
}
