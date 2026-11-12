package com.github.catvod.spider.merge.p000a;

import java.io.PrintStream;
import java.util.Comparator;
import moyu.fucking.C0157;
import moyu.fucking.C0182;
import moyu.fucking.C0184;
import moyu.fucking.C0188;
import moyu.fucking.C0195;
import moyu.fucking.C0196;
import moyu.fucking.C0206;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class r<T> implements Comparator {
    public r() throws Throwable {
        int iIntValue = ((Integer) C0184.n(8838, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Float) C0157.n(17336, null, new Object[]{(String) C0188.n(78246, null, new Object[]{(String) C0206.n(83647)})})});
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
    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) C0182.n(76256, null, new Object[]{Integer.valueOf(((Integer) C0206.n(3831, null, new Object[]{(String) C0196.n(97452, (C0369o) obj)})).intValue())});
        Integer num2 = (Integer) C0182.n(76256, null, new Object[]{Integer.valueOf(((Integer) C0206.n(3831, null, new Object[]{(String) C0196.n(97452, (C0369o) obj2)})).intValue())});
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (num == num2) {
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
                                return 0;
                        }
                    }
                    break;
                case 239:
                    return ((Integer) C0206.n(70354, num, new Object[]{num2})).intValue();
                default:
                    continue;
            }
            i = 1678;
        }
    }
}
