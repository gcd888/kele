package com.github.catvod.spider.merge.A;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.github.catvod.spider.merge.D.C0007;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.p019w.C0134;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;
import moyu.fucking.C0149;
import moyu.fucking.C0157;
import moyu.fucking.C0163;
import moyu.fucking.C0168;
import moyu.fucking.C0178;
import moyu.fucking.C0179;
import moyu.fucking.C0188;
import moyu.fucking.C0195;
import moyu.fucking.C0198;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f135short = {2988, 2994, 3006, 2989, 2987, 2944, 2999, 2998, 2988, 2987, 2992, 2989, 2982, 2944, 2988, 2982, 2993, 3004, 2944, 3005, 3006, 3004, 2996, 3002, 2993, 3003, 27461, 28366, 20917, 23656, 19346, 25499, 24799, -1437, 28172, 21063, 20835, 28170, 2946, 2957, 2951, 2961, 2956, 2954, 2951, 3021, 2954, 2957, 2967, 2950, 2957, 2967, 3021, 2946, 2944, 2967, 2954, 2956, 2957, 3021, 2997, 2986, 2982, 2996};
    public final int a;
    public final String b;

    public /* synthetic */ V0(String str, int i) throws Throwable {
        this.a = i;
        this.b = str;
        int iIntValue = ((Integer) C0188.n(27153, null, new Object[0])).intValue();
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
                    C0157.n(99237, (PrintStream) C0195.n(72538), new Object[]{Double.valueOf(((Double) C0157.n(3141, null, new Object[]{(String) C0188.n(78246, null, new Object[]{(String) C0188.n(80143)})})).doubleValue())});
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
        switch (((Integer) C0188.n(12943, this)).intValue()) {
            case 0:
                String str = (String) C0188.n(20100, this);
                X0 x0 = (X0) C0163.n(92858);
                boolean zBooleanValue = ((Boolean) C0195.n(41159, null, new Object[]{str})).booleanValue();
                int i = 1740;
                while (true) {
                    i ^= 1757;
                    switch (i) {
                        case 17:
                            if (zBooleanValue) {
                                i = 1833;
                            }
                            break;
                        case 54:
                            break;
                        case 471:
                            try {
                                Toast toast = (Toast) C0163.n(61319, x0);
                                int i2 = 48767;
                                while (true) {
                                    i2 ^= 48784;
                                    switch (i2) {
                                        case 14:
                                            break;
                                        case 45:
                                            break;
                                        case 76:
                                            C0163.n(56351, toast, new Object[0]);
                                            break;
                                        case 239:
                                            i2 = toast != null ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                Toast toast2 = (Toast) C0163.n(28843, null, new Object[]{(Application) C0149.n(10590, null, new Object[0]), str, 1});
                                x0.a = toast2;
                                C0163.n(29507, toast2, new Object[0]);
                                break;
                            } catch (Exception e) {
                                int i3 = 49666;
                                while (true) {
                                    i3 ^= 49683;
                                    switch (i3) {
                                        case 17:
                                            i3 = 49697;
                                            break;
                                        case 50:
                                            return;
                                    }
                                }
                            }
                            break;
                        case 500:
                            int i4 = 1864;
                            while (true) {
                                i4 ^= 1881;
                                switch (i4) {
                                    case 17:
                                        i4 = 48674;
                                        break;
                                    case 47483:
                                        break;
                                }
                            }
                            break;
                        default:
                            continue;
                    }
                    i = 1802;
                }
                break;
            case 1:
                String str2 = (String) C0188.n(20100, this);
                ((Integer) C0195.n(23628)).intValue();
                try {
                    Intent intent = new Intent((String) C0178.n(26978, null, new Object[]{(short[]) C0188.n(87647), 38, Integer.valueOf(C0007.f163 ^ 189), 3043}), (Uri) C0163.n(81590, null, new Object[]{str2}));
                    C0163.n(31874, (Application) C0149.n(10590, null, new Object[0]), new Object[]{intent});
                    break;
                } catch (Exception e2) {
                    int i5 = 48891;
                    while (true) {
                        i5 ^= 48908;
                        switch (i5) {
                            case 22:
                                return;
                            case 503:
                                i5 = 48922;
                                break;
                        }
                    }
                }
                break;
            case 2:
                C0188.n(1950, null, new Object[]{(String) C0188.n(20100, this)});
                break;
            case 3:
                C0188.n(1950, null, new Object[]{(String) C0188.n(20100, this)});
                break;
            case 4:
                StringBuilder sb = new StringBuilder((String) C0179.n(1747, null, new Object[]{(short[]) C0188.n(87647), 26, Integer.valueOf(C0034.f190 ^ 135), 901}));
                C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb, new Object[0])});
                break;
            case 5:
                ((Integer) C0188.n(8573, (AtomicInteger) C0188.n(18188), new Object[0])).intValue();
                C0188.n(35332, null, new Object[]{(String) C0198.n(88124, null, new Object[]{(short[]) C0188.n(87647), 0, Integer.valueOf(C0134.f343 ^ (-235)), 3039}), (String) C0188.n(20100, this)});
                k2.f = false;
                k2.g = false;
                String str3 = (String) C0195.n(43185);
                k2.h = str3;
                k2.l = str3;
                int iIntValue = ((Integer) C0163.n(6834, null, new Object[0])).intValue();
                int i6 = 1616;
                while (true) {
                    i6 ^= 1633;
                    switch (i6) {
                        case 14:
                            break;
                        case 49:
                            if (iIntValue <= 0) {
                                i6 = 1709;
                            }
                            break;
                        case 204:
                            C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Float) C0157.n(17336, null, new Object[]{(String) C0168.n(44870, null, new Object[]{(String) C0163.n(98551)})})});
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i6 = 1678;
                }
                break;
            default:
                C0188.n(1950, null, new Object[]{(String) C0188.n(20100, this)});
                break;
        }
    }
}
