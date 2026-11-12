package com.github.catvod.spider.merge.p000a;

import java.io.PrintStream;
import moyu.fucking.C0157;
import moyu.fucking.C0159;
import moyu.fucking.C0162;
import moyu.fucking.C0178;
import moyu.fucking.C0181;
import moyu.fucking.C0188;
import moyu.fucking.C0195;
import moyu.fucking.C0202;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0344b0 implements Runnable {
    public final int a;
    public final C0364l0 b;

    public /* synthetic */ RunnableC0344b0(C0364l0 c0364l0, int i) throws Throwable {
        this.a = i;
        this.b = c0364l0;
        int iIntValue = ((Integer) C0202.n(84709, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0178.n(16623, null, new Object[]{(String) C0157.n(79159, null, new Object[]{(String) C0159.n(29133)})})});
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
        switch (((Integer) C0159.n(43506, this)).intValue()) {
            case 0:
                C0159.n(34010, null, new Object[0]);
                return;
            default:
                C0364l0 c0364l0 = (C0364l0) C0159.n(43031, this);
                c0364l0.f = true;
                c0364l0.e = false;
                synchronized (C0159.n(49271, c0364l0)) {
                    C0159.n(92187, C0159.n(49271, c0364l0), new Object[0]);
                }
                int iIntValue = ((Integer) C0181.n(42959, null, new Object[0])).intValue();
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            i = iIntValue >= 0 ? 1709 : 1678;
                            break;
                        case 204:
                            C0162.n(83524, (PrintStream) C0195.n(72538), new Object[]{Long.valueOf(((Long) C0162.n(73560, null, new Object[]{(String) C0188.n(78246, null, new Object[]{(String) C0159.n(90092)})})).longValue())});
                            return;
                        case 239:
                            return;
                        default:
                            break;
                    }
                }
                break;
        }
    }
}
