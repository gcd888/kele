package com.github.catvod.spider.merge.p000a;

import java.io.PrintStream;
import java.util.Comparator;
import moyu.fucking.C0152;
import moyu.fucking.C0173;
import moyu.fucking.C0191;
import moyu.fucking.C0195;
import moyu.fucking.C0196;
import moyu.fucking.C0212;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class C0370o0 implements Comparator<C0374q0> {
    public C0370o0() throws Throwable {
        int iIntValue = ((Integer) C0173.n(81713, null, new Object[0])).intValue();
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
                    C0152.n(87951, (PrintStream) C0195.n(72538), new Object[]{Float.valueOf(((Float) C0152.n(24313, null, new Object[]{(String) C0191.n(95512, null, new Object[]{(String) C0196.n(46213)})})).floatValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    @Override // java.util.Comparator
    public final int compare(C0374q0 c0374q0, C0374q0 c0374q1) {
        C0374q0 c0374q2 = c0374q0;
        C0374q0 c0374q3 = c0374q1;
        int iIntValue = ((Integer) C0212.n(13527, (String) C0196.n(66986, c0374q2), new Object[]{(String) C0196.n(66986, c0374q3)})).intValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iIntValue != 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return iIntValue;
                        }
                    }
                    break;
                case 239:
                    int iIntValue2 = ((Integer) C0212.n(13527, (String) C0196.n(68807, c0374q2), new Object[]{(String) C0196.n(68807, c0374q3)})).intValue();
                    int i3 = 1864;
                    while (true) {
                        i3 ^= 1881;
                        switch (i3) {
                            case 17:
                                i3 = iIntValue2 == 0 ? 48705 : 48736;
                                break;
                            case 47384:
                                return ((Integer) C0212.n(13527, (String) C0196.n(4749, c0374q2), new Object[]{(String) C0196.n(4749, c0374q3)})).intValue();
                            case 47417:
                                int i4 = 48767;
                                while (true) {
                                    i4 ^= 48784;
                                    switch (i4) {
                                        case 14:
                                            return iIntValue2;
                                        case 239:
                                            i4 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }
}
