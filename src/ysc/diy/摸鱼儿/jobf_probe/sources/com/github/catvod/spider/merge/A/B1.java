package com.github.catvod.spider.merge.A;

import java.io.PrintStream;
import moyu.fucking.C0152;
import moyu.fucking.C0168;
import moyu.fucking.C0195;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class B1 implements Runnable {
    public B1() throws Throwable {
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
                    C0152.n(87951, (PrintStream) C0195.n(72538), new Object[]{Float.valueOf(((Float) C0152.n(24313, null, new Object[]{(String) C0168.n(19169, null, new Object[]{(String) C0168.n(75771)})})).floatValue())});
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
                Runnable runnable = (Runnable) C0168.n(86728);
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            if (runnable != this) {
                                i = 1709;
                            }
                            break;
                        case 204:
                            int iIntValue = ((Integer) C0168.n(38731, null, new Object[0])).intValue();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        if (iIntValue <= 0) {
                                            i2 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        return;
                                    case 500:
                                        C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0152.n(66570, null, new Object[]{(String) C0168.n(61681, null, new Object[]{(String) C0168.n(49566)})})});
                                        return;
                                    default:
                                        continue;
                                }
                                i2 = 1802;
                            }
                            break;
                        case 239:
                            N1.S = null;
                            boolean zBooleanValue = ((Boolean) C0195.n(96562, null, new Object[0])).booleanValue();
                            int i3 = 48767;
                            while (true) {
                                i3 ^= 48784;
                                switch (i3) {
                                    case 14:
                                        break;
                                    case 45:
                                        break;
                                    case 76:
                                        boolean zBooleanValue2 = ((Boolean) C0168.n(47427, null, new Object[]{Long.valueOf(((Long) C0168.n(75627, null, new Object[0])).longValue())})).booleanValue();
                                        int i4 = 48891;
                                        while (true) {
                                            i4 ^= 48908;
                                            switch (i4) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    N1.M = -1;
                                                    N1.N = true;
                                                    boolean zBooleanValue3 = ((Boolean) C0168.n(2327, null, new Object[0])).booleanValue();
                                                    int i5 = 49790;
                                                    while (true) {
                                                        i5 ^= 49807;
                                                        switch (i5) {
                                                            case 18:
                                                                break;
                                                            case 51:
                                                                break;
                                                            case 84:
                                                                C0168.n(21710, null, new Object[0]);
                                                                break;
                                                            case 241:
                                                                if (zBooleanValue3) {
                                                                    i5 = 49883;
                                                                }
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        i5 = 49852;
                                                    }
                                                    C0168.n(32725, null, new Object[0]);
                                                    C0168.n(89781, null, new Object[0]);
                                                    return;
                                                case 503:
                                                    i4 = !zBooleanValue2 ? 49635 : 48953;
                                                    break;
                                                case 32495:
                                                    int i6 = 49666;
                                                    while (true) {
                                                        i6 ^= 49683;
                                                        switch (i6) {
                                                            case 17:
                                                                i6 = 49697;
                                                                continue;
                                                            case 50:
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
                                        i3 = !zBooleanValue ? 48860 : 48829;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            return;
                        default:
                            continue;
                    }
                    i = 1678;
                }
            } catch (Throwable th) {
                int i7 = 1864;
                while (true) {
                    i7 ^= 1881;
                    switch (i7) {
                        case 17:
                            i7 = 48674;
                            break;
                        case 47483:
                            throw th;
                    }
                }
            }
        }
    }
}
