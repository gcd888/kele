package com.github.catvod.spider.merge.A;

import java.io.PrintStream;
import java.util.concurrent.locks.ReentrantLock;
import moyu.fucking.C0149;
import moyu.fucking.C0168;
import moyu.fucking.C0186;
import moyu.fucking.C0195;
import moyu.fucking.C0225;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class RunnableC0288q0 implements Runnable {
    public final Process a;
    public final C0299u0 b;

    public RunnableC0288q0(C0299u0 c0299u0, Process process) throws Throwable {
        this.b = c0299u0;
        this.a = process;
        int iIntValue = ((Integer) C0168.n(23434, null, new Object[0])).intValue();
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
                    C0168.n(61614, (PrintStream) C0195.n(72538), new Object[]{(String) C0186.n(43495, null, new Object[]{(String) C0186.n(42551)})});
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
        try {
            ((Integer) C0225.n(35377, (Process) C0186.n(21639, this), new Object[0])).intValue();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = 1647;
                        continue;
                    default:
                        continue;
                }
                Process process = (Process) C0186.n(21639, this);
                try {
                    ((Integer) C0186.n(75385, process, new Object[0])).intValue();
                    C0186.n(99725, (ReentrantLock) C0186.n(74144, (C0299u0) C0186.n(33082, this)), new Object[0]);
                    try {
                        Process process2 = (Process) C0186.n(63166, (C0299u0) C0186.n(33082, this));
                        Process process3 = (Process) C0186.n(21639, this);
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = process2 == process3 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    C0186.n(6461, (C0299u0) C0186.n(33082, this), new Object[]{process3});
                                    C0186.n(37460, (C0299u0) C0186.n(33082, this), new Object[]{null});
                                    C0186.n(32674, (C0299u0) C0186.n(33082, this), new Object[0]);
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = 48674;
                                                break;
                                            case 47483:
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0186.n(86303, (ReentrantLock) C0186.n(74144, (C0299u0) C0186.n(33082, this)), new Object[0]);
                        return;
                    } catch (Throwable th) {
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    C0186.n(86303, (ReentrantLock) C0186.n(74144, (C0299u0) C0186.n(33082, this)), new Object[0]);
                                    throw th;
                                case 239:
                                    i4 = 48798;
                                    break;
                            }
                        }
                    }
                } catch (IllegalThreadStateException e) {
                    return;
                }
            }
        } catch (InterruptedException e2) {
            C0149.n(88498, (Thread) C0195.n(50425, null, new Object[0]), new Object[0]);
        } catch (Throwable th2) {
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                        break;
                    case 503:
                        i5 = 48922;
                        continue;
                    default:
                        continue;
                }
            }
        }
    }
}
