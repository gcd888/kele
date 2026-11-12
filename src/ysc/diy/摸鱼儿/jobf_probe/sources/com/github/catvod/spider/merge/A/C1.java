package com.github.catvod.spider.merge.A;

import java.io.PrintStream;
import moyu.fucking.C0168;
import moyu.fucking.C0195;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class C1 implements Runnable {
    public C1() throws Throwable {
        int iIntValue = ((Integer) C0168.n(82191, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0168.n(19969, null, new Object[]{(String) C0168.n(2197)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        synchronized (N1.class) {
            try {
                Runnable runnable = (Runnable) C0168.n(74867);
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            i = runnable == this ? 1709 : 1678;
                            break;
                        case 204:
                            boolean zBooleanValue = ((Boolean) C0195.n(96562, null, new Object[0])).booleanValue();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        i2 = zBooleanValue ? 1833 : 1802;
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        N1.V = null;
                                        N1.W = true;
                                        N1.O = true;
                                        N1.M = -1;
                                        N1.N = true;
                                        N1.P = ((Long) C0168.n(75627, null, new Object[0])).longValue() + 60000;
                                        C0168.n(32725, null, new Object[0]);
                                        return;
                                    case 500:
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    i3 = 48674;
                                                    continue;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                int i4 = 48767;
                while (true) {
                    i4 ^= 48784;
                    switch (i4) {
                        case 14:
                            throw th;
                        case 239:
                            i4 = 48798;
                            break;
                    }
                }
            }
        }
    }
}
