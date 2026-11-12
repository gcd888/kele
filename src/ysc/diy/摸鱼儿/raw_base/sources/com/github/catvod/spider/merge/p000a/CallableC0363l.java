package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.F.a;
import com.github.catvod.spider.merge.N.C0036;
import java.io.PrintStream;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.Callable;
import moyu.fucking.C0152;
import moyu.fucking.C0153;
import moyu.fucking.C0159;
import moyu.fucking.C0169;
import moyu.fucking.C0191;
import moyu.fucking.C0195;
import moyu.fucking.C0196;
import moyu.fucking.C0216;
import moyu.fucking.C0221;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class CallableC0363l implements Callable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f241short = {2924, 2877, 2874, 2852};
    public final int a;
    public final String b;

    public /* synthetic */ CallableC0363l(String str, int i) throws Throwable {
        this.a = i;
        this.b = str;
        int iIntValue = ((Integer) C0153.n(2963, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Float) C0216.n(51282, null, new Object[]{(String) C0152.n(24507, null, new Object[]{(String) C0169.n(85694)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        String str = (String) C0169.n(96520, this);
        switch (((Integer) C0169.n(26096, this)).intValue()) {
            case 0:
                C0159.n(35468, null, new Object[]{str, (String) C0191.n(93496, null, new Object[]{(short[]) C0196.n(97116), 0, Integer.valueOf(C0036.f192 ^ (-48)), 2888})});
                return (a) C0196.n(5280, null, new Object[]{str});
            case 1:
                return (String) C0196.n(76044, null, new Object[]{str});
            case 2:
                return (String) C0196.n(96494, null, new Object[]{str});
            case 3:
                return (String) C0196.n(81444, null, new Object[]{str});
            case 4:
                return (String) C0196.n(54839, null, new Object[]{str});
            case 5:
                return (String) C0196.n(32491, null, new Object[]{str});
            case 6:
                return (String) C0169.n(40501, null, new Object[]{str});
            case 7:
                return (String) C0169.n(60057, null, new Object[]{str});
            case 8:
                return (String) C0169.n(78408, null, new Object[]{str});
            case 9:
                return (String) C0169.n(43801, null, new Object[]{str});
            case 10:
                return (String) C0169.n(92198, null, new Object[]{str});
            default:
                return (List) C0221.n(63575, null, new Object[]{(InetAddress[]) C0169.n(24931, null, new Object[]{str})});
        }
    }
}
