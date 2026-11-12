package com.github.catvod.spider.merge.A;

import java.io.PrintStream;
import moyu.fucking.C0157;
import moyu.fucking.C0195;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class E1 implements Runnable {
    public E1() throws Throwable {
        int iIntValue = ((Integer) C0157.n(49675, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Float) C0157.n(17336, null, new Object[]{(String) C0157.n(79159, null, new Object[]{(String) C0157.n(71988)})})});
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
    public final void run() {
        try {
            C0157.n(96203, null, new Object[]{new D1(0, this)});
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        return;
                    case 49:
                        i = 1647;
                        break;
                }
            }
        } catch (Throwable th) {
            synchronized (N1.class) {
                Runnable runnable = (Runnable) C0157.n(24756);
                int i2 = 1740;
                while (true) {
                    i2 ^= 1757;
                    switch (i2) {
                        case 17:
                            i2 = runnable == this ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case 500:
                            N1.G = null;
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
}
