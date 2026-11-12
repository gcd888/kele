package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.A.S0;
import com.github.catvod.spider.merge.p003d.g;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import moyu.fucking.C0149;
import moyu.fucking.C0150;
import moyu.fucking.C0157;
import moyu.fucking.C0159;
import moyu.fucking.C0160;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0176;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0195;
import moyu.fucking.C0196;
import moyu.fucking.C0200;
import moyu.fucking.C0202;
import moyu.fucking.C0210;
import moyu.fucking.C0212;
import moyu.fucking.C0221;
import moyu.fucking.C0225;
import moyu.fucking.C0233;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0366m0 implements Runnable {
    public final int a = 2;
    public final List b;
    public final Object c;
    public final Object d;
    public final Serializable e;
    public final Object f;
    public final Object g;
    public final Serializable h;

    public /* synthetic */ RunnableC0366m0(C0342a0 c0342a0, ConcurrentLinkedQueue concurrentLinkedQueue, CountDownLatch countDownLatch, S0 s0, String str, AtomicInteger atomicInteger, List list) throws Throwable {
        this.d = c0342a0;
        this.e = concurrentLinkedQueue;
        this.f = countDownLatch;
        this.g = s0;
        this.c = str;
        this.h = atomicInteger;
        this.b = list;
        int iIntValue = ((Integer) C0182.n(51494, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0182.n(56258, null, new Object[]{(String) C0233.n(11578, null, new Object[]{(String) C0196.n(18131)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public /* synthetic */ RunnableC0366m0(C0349e c0349e, String str, g gVar, List list, List list2, ExecutorService executorService, Semaphore semaphore) throws Throwable {
        this.d = c0349e;
        this.e = str;
        this.f = gVar;
        this.b = list;
        this.c = list2;
        this.g = executorService;
        this.h = semaphore;
        int iIntValue = ((Integer) C0162.n(86773, null, new Object[0])).intValue();
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
                    C0162.n(83524, (PrintStream) C0195.n(72538), new Object[]{Long.valueOf(((Long) C0162.n(73560, null, new Object[]{(String) C0210.n(8844, null, new Object[]{(String) C0196.n(31939)})})).longValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public /* synthetic */ RunnableC0366m0(C0377s0 c0377s0, ConcurrentLinkedQueue concurrentLinkedQueue, CountDownLatch countDownLatch, C0375r0 c0375r0, AtomicInteger atomicInteger, List list, List list2) throws Throwable {
        this.d = c0377s0;
        this.e = concurrentLinkedQueue;
        this.f = countDownLatch;
        this.g = c0375r0;
        this.h = atomicInteger;
        this.b = list;
        this.c = list2;
        int iIntValue = ((Integer) C0181.n(42959, null, new Object[0])).intValue();
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
                    C0168.n(61614, (PrintStream) C0195.n(72538), new Object[]{(String) C0195.n(83584, null, new Object[]{(String) C0196.n(53340)})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0058, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0241, code lost:
    
        continue;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        Object objN = C0196.n(80944, this);
        Serializable serializable = (Serializable) C0196.n(80014, this);
        Object objN2 = C0196.n(8635, this);
        Serializable serializable2 = (Serializable) C0196.n(21997, this);
        Object objN3 = C0196.n(55601, this);
        Object objN4 = C0196.n(30883, this);
        switch (((Integer) C0196.n(45960, this)).intValue()) {
            case 0:
                C0375r0 c0375r0 = (C0375r0) objN4;
                AtomicInteger atomicInteger = (AtomicInteger) serializable2;
                List list = (List) C0196.n(4360, this);
                List list2 = (List) objN3;
                ((Integer) C0212.n(21781)).intValue();
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) serializable;
                    C0372p0 c0372p0 = (C0372p0) C0196.n(31542, concurrentLinkedQueue, new Object[0]);
                    CountDownLatch countDownLatch = (CountDownLatch) objN;
                    int i = 49914;
                    while (true) {
                        i ^= 49931;
                        switch (i) {
                            case 497:
                                i = c0372p0 == null ? 50658 : 50627;
                                break;
                            case 1711:
                                break;
                            case 1736:
                                try {
                                    C0196.n(86134, null, new Object[]{c0375r0, c0372p0, concurrentLinkedQueue, atomicInteger, list, list2});
                                    int iIntValue = ((Integer) C0176.n(23713, atomicInteger, new Object[0])).intValue();
                                    int i2 = 51588;
                                    while (true) {
                                        i2 ^= 51605;
                                        switch (i2) {
                                            case 17:
                                                i2 = iIntValue == 0 ? 51681 : 51650;
                                                break;
                                            case 54:
                                                break;
                                            case 87:
                                                break;
                                            case 116:
                                                C0225.n(16415, countDownLatch, new Object[0]);
                                                int i3 = 51712;
                                                while (true) {
                                                    i3 ^= 51729;
                                                    switch (i3) {
                                                        case 17:
                                                            i3 = 51743;
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } catch (Throwable th) {
                                    int iIntValue2 = ((Integer) C0176.n(23713, atomicInteger, new Object[0])).intValue();
                                    int i4 = 51836;
                                    while (true) {
                                        i4 ^= 51853;
                                        switch (i4) {
                                            case 241:
                                                if (iIntValue2 == 0) {
                                                    i4 = 52580;
                                                }
                                                break;
                                            case 1963:
                                                break;
                                            case 1992:
                                                break;
                                            case 2025:
                                                C0225.n(16415, countDownLatch, new Object[0]);
                                                break;
                                            default:
                                                continue;
                                        }
                                        i4 = 52549;
                                    }
                                    int i5 = 52611;
                                    while (true) {
                                        i5 ^= 52628;
                                        switch (i5) {
                                            case 23:
                                                i5 = 52642;
                                                break;
                                            case 54:
                                                int i6 = 52735;
                                                while (true) {
                                                    i6 ^= 52752;
                                                    switch (i6) {
                                                        case 14:
                                                            throw th;
                                                        case 1007:
                                                            i6 = 52766;
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 1769:
                                try {
                                    boolean zBooleanValue = ((Boolean) C0202.n(66701, countDownLatch, new Object[]{50L, (TimeUnit) C0150.n(51749)})).booleanValue();
                                    int i7 = 50689;
                                    while (true) {
                                        i7 ^= 50706;
                                        switch (i7) {
                                            case 19:
                                                i7 = zBooleanValue ? 50782 : 50751;
                                                break;
                                            case 45:
                                                break;
                                            case 50:
                                                break;
                                            case 76:
                                                int i8 = 50813;
                                                while (true) {
                                                    i8 ^= 50830;
                                                    switch (i8) {
                                                        case 18:
                                                            return;
                                                        case 243:
                                                            i8 = 50844;
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } catch (InterruptedException e) {
                                    C0149.n(88498, (Thread) C0195.n(50425, null, new Object[0]), new Object[0]);
                                    return;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
                break;
            case 1:
                String str = (String) serializable;
                g gVar = (g) objN;
                List list3 = (List) C0196.n(4360, this);
                List list4 = (List) objN3;
                ExecutorService executorService = (ExecutorService) objN4;
                Semaphore semaphore = (Semaphore) serializable2;
                ((Integer) C0159.n(98298)).intValue();
                C0349e c0349e = (C0349e) objN2;
                try {
                    C0160.n(37022, c0349e, new Object[]{str, gVar, list3, list4, executorService, semaphore});
                    C0200.n(68268, semaphore, new Object[0]);
                    return;
                } catch (Throwable th2) {
                    C0200.n(68268, semaphore, new Object[0]);
                    throw th2;
                }
            default:
                S0 s0 = (S0) objN4;
                String str2 = (String) objN3;
                AtomicInteger atomicInteger2 = (AtomicInteger) serializable2;
                List list5 = (List) C0196.n(4360, this);
                C0342a0 c0342a0 = (C0342a0) objN2;
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = (ConcurrentLinkedQueue) serializable;
                    X x = (X) C0196.n(31542, concurrentLinkedQueue2, new Object[0]);
                    CountDownLatch countDownLatch2 = (CountDownLatch) objN;
                    int i9 = 1616;
                    while (true) {
                        i9 ^= 1633;
                        switch (i9) {
                            case 14:
                                break;
                            case 49:
                                i9 = x == null ? 1709 : 1678;
                                break;
                            case 204:
                                try {
                                    boolean zBooleanValue2 = ((Boolean) C0202.n(66701, countDownLatch2, new Object[]{50L, (TimeUnit) C0150.n(51749)})).booleanValue();
                                    int i10 = 1740;
                                    while (true) {
                                        i10 ^= 1757;
                                        switch (i10) {
                                            case 17:
                                                i10 = zBooleanValue2 ? 1833 : 1802;
                                                break;
                                            case 54:
                                                break;
                                            case 471:
                                                break;
                                            case 500:
                                                int i11 = 1864;
                                                while (true) {
                                                    i11 ^= 1881;
                                                    switch (i11) {
                                                        case 17:
                                                            i11 = 48674;
                                                            continue;
                                                        case 47483:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    int iIntValue3 = ((Integer) C0221.n(4336, null, new Object[0])).intValue();
                                                    int i12 = 48767;
                                                    while (true) {
                                                        i12 ^= 48784;
                                                        switch (i12) {
                                                            case 14:
                                                                break;
                                                            case 45:
                                                                return;
                                                            case 76:
                                                                C0157.n(99237, (PrintStream) C0195.n(72538), new Object[]{Double.valueOf(((Double) C0157.n(3141, null, new Object[]{(String) C0210.n(8844, null, new Object[]{(String) C0196.n(61509)})})).doubleValue())});
                                                                return;
                                                            case 239:
                                                                if (iIntValue3 >= 0) {
                                                                    i12 = 48860;
                                                                }
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        i12 = 48829;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } catch (InterruptedException e2) {
                                    C0149.n(88498, (Thread) C0195.n(50425, null, new Object[0]), new Object[0]);
                                }
                                break;
                            case 239:
                                try {
                                    C0196.n(9537, c0342a0, new Object[]{s0, str2, x, concurrentLinkedQueue2, atomicInteger2, list5});
                                    int iIntValue4 = ((Integer) C0176.n(23713, atomicInteger2, new Object[0])).intValue();
                                    int i13 = 48891;
                                    while (true) {
                                        i13 ^= 48908;
                                        switch (i13) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                i13 = iIntValue4 == 0 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                C0225.n(16415, countDownLatch2, new Object[0]);
                                                int i14 = 49666;
                                                while (true) {
                                                    i14 ^= 49683;
                                                    switch (i14) {
                                                        case 17:
                                                            i14 = 49697;
                                                            break;
                                                        case 50:
                                                            break;
                                                    }
                                                }
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    int iIntValue5 = ((Integer) C0176.n(23713, atomicInteger2, new Object[0])).intValue();
                                    int i15 = 49790;
                                    while (true) {
                                        i15 ^= 49807;
                                        switch (i15) {
                                            case 18:
                                                break;
                                            case 51:
                                                throw th3;
                                            case 84:
                                                C0225.n(16415, countDownLatch2, new Object[0]);
                                                throw th3;
                                            case 241:
                                                if (iIntValue5 == 0) {
                                                    i15 = 49883;
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i15 = 49852;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
                break;
        }
    }
}
