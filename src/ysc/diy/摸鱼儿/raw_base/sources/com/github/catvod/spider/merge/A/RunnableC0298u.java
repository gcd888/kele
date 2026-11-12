package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.os.Handler;
import com.github.catvod.spider.merge.d0.C0069;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import moyu.fucking.C0150;
import moyu.fucking.C0157;
import moyu.fucking.C0168;
import moyu.fucking.C0176;
import moyu.fucking.C0182;
import moyu.fucking.C0186;
import moyu.fucking.C0188;
import moyu.fucking.C0195;
import moyu.fucking.C0201;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class RunnableC0298u implements Runnable {
    public final C0304w a;

    public RunnableC0298u(C0304w c0304w) throws Throwable {
        this.a = c0304w;
        int iIntValue = ((Integer) C0201.n(23303, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0150.n(84349, null, new Object[]{(String) C0201.n(62939)})})});
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
        Activity activity;
        boolean zBooleanValue = ((Boolean) C0188.n(7501, (C0304w) C0201.n(11283, this))).booleanValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (!zBooleanValue) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return;
                case 239:
                    WeakReference weakReference = (WeakReference) C0188.n(29208, (C0304w) C0201.n(11283, this));
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = weakReference != null ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                activity = null;
                                break;
                            case 500:
                                Activity activity2 = (Activity) C0182.n(66039, (WeakReference) C0188.n(29208, (C0304w) C0201.n(11283, this)), new Object[0]);
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = 48674;
                                            continue;
                                        case 47483:
                                            activity = activity2;
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
                    boolean zBooleanValue2 = ((Boolean) C0186.n(18167, (com.github.catvod.spider.merge.p006g.a) C0186.n(76899, null, new Object[0]), new Object[0])).booleanValue();
                    int i4 = 48767;
                    while (true) {
                        i4 ^= 48784;
                        switch (i4) {
                            case 14:
                                break;
                            case 45:
                                break;
                            case 76:
                                int i5 = 48891;
                                while (true) {
                                    i5 ^= 48908;
                                    switch (i5) {
                                        case 22:
                                            break;
                                        case 53:
                                            break;
                                        case 503:
                                            i5 = activity != null ? 49635 : 48953;
                                            break;
                                        case 32495:
                                            boolean zBooleanValue3 = ((Boolean) C0188.n(81111, activity, new Object[0])).booleanValue();
                                            int i6 = 49666;
                                            while (true) {
                                                i6 ^= 49683;
                                                switch (i6) {
                                                    case 17:
                                                        i6 = !zBooleanValue3 ? 49759 : 49728;
                                                        break;
                                                    case 50:
                                                        break;
                                                    case 76:
                                                        boolean zBooleanValue4 = ((Boolean) C0188.n(12187, activity, new Object[0])).booleanValue();
                                                        int i7 = 49790;
                                                        while (true) {
                                                            i7 ^= 49807;
                                                            switch (i7) {
                                                                case 18:
                                                                    break;
                                                                case 51:
                                                                    C0304w c0304w = (C0304w) C0201.n(11283, this);
                                                                    boolean zBooleanValue5 = ((Boolean) C0201.n(17969, c0304w)).booleanValue();
                                                                    int i8 = 50689;
                                                                    while (true) {
                                                                        i8 ^= 50706;
                                                                        switch (i8) {
                                                                            case 19:
                                                                                if (zBooleanValue5) {
                                                                                    i8 = 50782;
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                c0304w.m = true;
                                                                                C0157.n(96203, null, new Object[]{new RunnableC0266j(c0304w, 0)});
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case 76:
                                                                                int i9 = 50813;
                                                                                while (true) {
                                                                                    i9 ^= 50830;
                                                                                    switch (i9) {
                                                                                        case 18:
                                                                                            break;
                                                                                        case 243:
                                                                                            i9 = 50844;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i8 = 50751;
                                                                    }
                                                                    ((Boolean) C0201.n(89907, (Handler) C0176.n(20284, (C0304w) C0201.n(11283, this)), new Object[]{this, Long.valueOf(1733 ^ ((long) C0069.f278))})).booleanValue();
                                                                    break;
                                                                case 84:
                                                                    int i10 = 49914;
                                                                    while (true) {
                                                                        i10 ^= 49931;
                                                                        switch (i10) {
                                                                            case 497:
                                                                                i10 = 50596;
                                                                                continue;
                                                                            case 1711:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 241:
                                                                    i7 = zBooleanValue4 ? 49883 : 49852;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 83:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 239:
                                i4 = zBooleanValue2 ? 48860 : 48829;
                                break;
                            default:
                                break;
                        }
                        return;
                    }
                    C0186.n(86407, (C0304w) C0201.n(11283, this), new Object[0]);
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }
}
