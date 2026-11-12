package com.github.catvod.spider.merge.p000a;

import java.io.PrintStream;
import java.util.Comparator;
import moyu.fucking.C0152;
import moyu.fucking.C0179;
import moyu.fucking.C0195;
import moyu.fucking.C0212;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class C0348d0 implements Comparator<C0358i0> {
    public final C0364l0 a;

    public C0348d0(C0364l0 c0364l0) throws Throwable {
        this.a = c0364l0;
        int iIntValue = ((Integer) C0152.n(64736, null, new Object[0])).intValue();
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
                    C0195.n(19817, (PrintStream) C0195.n(72538), new Object[]{Integer.valueOf(((Integer) C0195.n(60398, null, new Object[]{(String) C0179.n(10540, null, new Object[]{(String) C0212.n(13882)})})).intValue())});
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
    public final int compare(C0358i0 c0358i0, C0358i0 c0358i1) {
        String str;
        C0358i0 c0358i2 = c0358i1;
        String str2 = (String) C0212.n(28507, c0358i0);
        String str3 = (String) C0195.n(43185);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = str2 == null ? 1709 : 1678;
                    break;
                case 204:
                    str = str3;
                    break;
                case 239:
                    str = str2;
                    break;
                default:
                    break;
            }
        }
        String str4 = (String) C0212.n(28507, c0358i2);
        int i2 = 1740;
        while (true) {
            i2 ^= 1757;
            switch (i2) {
                case 17:
                    if (str4 == null) {
                        i2 = 1833;
                    }
                    break;
                case 54:
                    break;
                case 471:
                    str3 = str4;
                    break;
                case 500:
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
                    continue;
            }
            i2 = 1802;
        }
        return ((Integer) C0212.n(13527, str, new Object[]{str3})).intValue();
    }
}
