package com.github.catvod.spider.merge.A;

import java.io.PrintStream;
import moyu.fucking.C0152;
import moyu.fucking.C0157;
import moyu.fucking.C0195;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class G1 implements Runnable {
    public G1() throws Throwable {
        int iIntValue = ((Integer) C0157.n(4739, null, new Object[0])).intValue();
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
                    C0152.n(87951, (PrintStream) C0195.n(72538), new Object[]{Float.valueOf(((Float) C0152.n(24313, null, new Object[]{(String) C0157.n(80630, null, new Object[]{(String) C0157.n(38964)})})).floatValue())});
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
                Runnable runnable = (Runnable) C0157.n(58477);
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
                            return;
                        case 239:
                            N1.C = null;
                            C0157.n(35625, null, new Object[0]);
                            return;
                        default:
                            continue;
                    }
                    i = 1678;
                }
            } catch (Throwable th) {
                int i2 = 1740;
                while (true) {
                    i2 ^= 1757;
                    switch (i2) {
                        case 17:
                            i2 = 1771;
                            break;
                        case 54:
                            throw th;
                    }
                }
            }
        }
    }
}
