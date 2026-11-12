package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.T.C0048;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.C0129;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.utils.C0143;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0178;
import moyu.fucking.C0182;
import moyu.fucking.C0195;
import moyu.fucking.C0198;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f122short = {1826, 1841, 1814, 1802, 1805, 1828, 1881, 1809, 1814, 1812, 1820, 1881, 1803, 1820, 1823, 1803, 1820, 1802, 1809, 1881, 1823, 1816, 1808, 1813, 1820, 1821, 1859, 1881, 2715, 2696, 2735, 2739, 2740, 2717, 2784, 2728, 2735, 2733, 2725, 2784, 2738, 2725, 2726, 2738, 2725, 2739, 2728, 2784, 2729, 2734, 2740, 2725, 2738, 2726, 2721, 2723, 2725, 2784, 2741, 2734, 2721, 2742, 2721, 2729, 2732, 2721, 2722, 2732, 2725};
    public final int a;
    public final Object b;

    public /* synthetic */ a(int i, Object obj) throws Throwable {
        this.a = i;
        this.b = obj;
        int iIntValue = ((Integer) C0152.n(51759, null, new Object[0])).intValue();
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
                    C0152.n(87951, (PrintStream) C0195.n(72538) /*=> System.out*/, new Object[]{Float.valueOf(((Float) C0152.n(24313, null, new Object[]{(String) C0152.n(72253, null, new Object[]{(String) C0152.n(20851) /*=> raw:new String(new byte[]{(byte) 81, (byte) 118, (byte) 106, (byte) 81, (byte) 120, (byte) 76, (byte) 74*/})})).floatValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:255:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:? A[LOOP:10: B:149:0x036c->B:258:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x038c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x039f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0397 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x03b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:? A[LOOP:23: B:125:0x02d0->B:345:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:358:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0318 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.github.catvod.spider.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r2v113, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object[]] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean zBooleanValue;
        int i;
        Object objN;
        int i2;
        int i3;
        AtomicReference atomicReference;
        boolean zBooleanValue2;
        int i4;
        Object objN2;
        int i5;
        int i6;
        int i7;
        switch (((Integer) C0152.n(55200, this)).intValue()) {
            case 0:
                ?? r0 = (c) C0152.n(80686, this);
                AtomicReference atomicReference2 = (AtomicReference) C0195.n(18109) /*=> FishCrypto.f*/;
                Object objN3 = C0195.n(90685, atomicReference2, new Object[0]);
                int i8 = 1616;
                while (true) {
                    i8 ^= 1633;
                    switch (i8) {
                        case 14:
                            break;
                        case 49:
                            i8 = objN3 != r0 ? 1709 : 1678;
                            break;
                        case 204:
                            int i9 = 1740;
                            while (true) {
                                i9 ^= 1757;
                                switch (i9) {
                                    case 17:
                                        i9 = 1771;
                                        continue;
                                    case 54:
                                        break;
                                    default:
                                        continue;
                                }
                            }
                            break;
                        case 239:
                            boolean zBooleanValue3 = ((Boolean) C0195.n(87344, r0, new Object[0])).booleanValue();
                            int i10 = 1864;
                            while (true) {
                                i10 ^= 1881;
                                switch (i10) {
                                    case 17:
                                        if (zBooleanValue3) {
                                            i10 = 48705;
                                        } else {
                                            i10 = 48736;
                                            continue;
                                        }
                                        break;
                                    case 47384:
                                        boolean zBooleanValue4 = ((Boolean) C0182.n(86863, null, new Object[0])).booleanValue();
                                        int i11 = 48891;
                                        while (true) {
                                            i11 ^= 48908;
                                            switch (i11) {
                                                case 22:
                                                    i11 = 48953;
                                                    break;
                                                case 53:
                                                    Object objN4 = C0182.n(66039, (WeakReference) C0182.n(93259, r0), new Object[0]);
                                                    int i12 = 49790;
                                                    while (true) {
                                                        i12 ^= 49807;
                                                        switch (i12) {
                                                            case 18:
                                                                break;
                                                            case 51:
                                                                while (true) {
                                                                    zBooleanValue = ((Boolean) C0195.n(80977, atomicReference2, new Object[]{r0, 0})).booleanValue();
                                                                    i = 55680;
                                                                    while (true) {
                                                                        i ^= 55697;
                                                                        switch (i) {
                                                                            case 17:
                                                                                i = zBooleanValue ? 56424 : 56393;
                                                                                break;
                                                                            case 1467:
                                                                                break;
                                                                            case 1496:
                                                                                objN = C0195.n(90685, atomicReference2, new Object[0]);
                                                                                i2 = 56579;
                                                                                while (true) {
                                                                                    i2 ^= 56596;
                                                                                    switch (i2) {
                                                                                        case 23:
                                                                                            i2 = objN != r0 ? 1507472 : 56641;
                                                                                            break;
                                                                                        case 54:
                                                                                            break;
                                                                                        case 85:
                                                                                            break;
                                                                                        case 1564036:
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1529:
                                                                                i3 = 56455;
                                                                                while (true) {
                                                                                    i3 ^= 56472;
                                                                                    switch (i3) {
                                                                                        case 31:
                                                                                            i3 = 56486;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 62:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case 84:
                                                                Object objN5 = C0195.n(37603, null, new Object[]{objN4});
                                                                Object objN6 = C0198.n(8971, r0);
                                                                int i13 = 49914;
                                                                while (true) {
                                                                    i13 ^= 49931;
                                                                    switch (i13) {
                                                                        case 497:
                                                                            i13 = objN5 != objN6 ? 50658 : 50627;
                                                                            break;
                                                                        case 1711:
                                                                            break;
                                                                        case 1736:
                                                                            Object objN7 = C0195.n(90685, atomicReference2, new Object[0]);
                                                                            int i14 = 50813;
                                                                            while (true) {
                                                                                i14 ^= 50830;
                                                                                switch (i14) {
                                                                                    case 18:
                                                                                        break;
                                                                                    case 53:
                                                                                        boolean zBooleanValue5 = ((Boolean) C0195.n(87344, r0, new Object[0])).booleanValue();
                                                                                        int i15 = 51712;
                                                                                        while (true) {
                                                                                            i15 ^= 51729;
                                                                                            switch (i15) {
                                                                                                case 14:
                                                                                                    break;
                                                                                                case 17:
                                                                                                    i15 = !zBooleanValue5 ? 51805 : 51774;
                                                                                                    break;
                                                                                                case 47:
                                                                                                    try {
                                                                                                        C0152.n(38580, null, new Object[0]);
                                                                                                        while (true) {
                                                                                                            boolean zBooleanValue6 = ((Boolean) C0195.n(80977, atomicReference2, new Object[]{r0, 0})).booleanValue();
                                                                                                            int i16 = 52611;
                                                                                                            while (true) {
                                                                                                                i16 ^= 52628;
                                                                                                                switch (i16) {
                                                                                                                    case 23:
                                                                                                                        i16 = zBooleanValue6 ? 52704 : 52673;
                                                                                                                        break;
                                                                                                                    case 54:
                                                                                                                        break;
                                                                                                                    case 85:
                                                                                                                        Object objN8 = C0195.n(90685, atomicReference2, new Object[0]);
                                                                                                                        int i17 = 53510;
                                                                                                                        while (true) {
                                                                                                                            i17 ^= 53527;
                                                                                                                            switch (i17) {
                                                                                                                                case 17:
                                                                                                                                    i17 = objN8 != r0 ? 53603 : 53572;
                                                                                                                                    break;
                                                                                                                                case 50:
                                                                                                                                    break;
                                                                                                                                case 83:
                                                                                                                                    break;
                                                                                                                                case 116:
                                                                                                                                    int i18 = 53634;
                                                                                                                                    while (true) {
                                                                                                                                        i18 ^= 53651;
                                                                                                                                        switch (i18) {
                                                                                                                                            case 17:
                                                                                                                                                i18 = 53665;
                                                                                                                                                continue;
                                                                                                                                            case 50:
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
                                                                                                                        break;
                                                                                                                    case 116:
                                                                                                                        r0 = 52735;
                                                                                                                        while (true) {
                                                                                                                            r0 ^= 52752;
                                                                                                                            switch (r0) {
                                                                                                                                case 14:
                                                                                                                                    break;
                                                                                                                                case 1007:
                                                                                                                                    r0 = 52766;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (ClassNotFoundException e) {
                                                                                                        atomicReference = (AtomicReference) C0195.n(18109) /*=> FishCrypto.f*/;
                                                                                                        while (true) {
                                                                                                            zBooleanValue2 = ((Boolean) C0195.n(80977, atomicReference, new Object[]{r0, 0})).booleanValue();
                                                                                                            i4 = 54533;
                                                                                                            while (true) {
                                                                                                                i4 ^= 54550;
                                                                                                                switch (i4) {
                                                                                                                    case 19:
                                                                                                                        i4 = zBooleanValue2 ? 54626 : 54595;
                                                                                                                        break;
                                                                                                                    case 50:
                                                                                                                        break;
                                                                                                                    case 85:
                                                                                                                        objN2 = C0195.n(90685, atomicReference, new Object[0]);
                                                                                                                        i5 = 55432;
                                                                                                                        while (true) {
                                                                                                                            i5 ^= 55449;
                                                                                                                            switch (i5) {
                                                                                                                                case 17:
                                                                                                                                    i5 = objN2 != r0 ? 55525 : 55494;
                                                                                                                                    break;
                                                                                                                                case 62:
                                                                                                                                    break;
                                                                                                                                case 95:
                                                                                                                                    break;
                                                                                                                                case 124:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 116:
                                                                                                                        i7 = 54657;
                                                                                                                        while (true) {
                                                                                                                            i7 ^= 54674;
                                                                                                                            switch (i7) {
                                                                                                                                case 19:
                                                                                                                                    i7 = 54688;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                case 50:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        C0152.n(11548, null, new Object[]{(String) C0152.n(85600, null, new Object[]{(short[]) C0152.n(83880) /*=> a.short*/, 28, Integer.valueOf(C0129.f338 ^ 955), 2752})});
                                                                                                        i6 = 55556;
                                                                                                        while (true) {
                                                                                                            i6 ^= 55573;
                                                                                                            switch (i6) {
                                                                                                                case 17:
                                                                                                                    i6 = 55587;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 54:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (NoSuchMethodException e2) {
                                                                                                        atomicReference = (AtomicReference) C0195.n(18109) /*=> FishCrypto.f*/;
                                                                                                        while (true) {
                                                                                                            zBooleanValue2 = ((Boolean) C0195.n(80977, atomicReference, new Object[]{r0, 0})).booleanValue();
                                                                                                            i4 = 54533;
                                                                                                            while (true) {
                                                                                                                i4 ^= 54550;
                                                                                                                switch (i4) {
                                                                                                                    case 19:
                                                                                                                        if (zBooleanValue2) {
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 50:
                                                                                                                        break;
                                                                                                                    case 85:
                                                                                                                        objN2 = C0195.n(90685, atomicReference, new Object[0]);
                                                                                                                        i5 = 55432;
                                                                                                                        while (true) {
                                                                                                                            i5 ^= 55449;
                                                                                                                            switch (i5) {
                                                                                                                                case 17:
                                                                                                                                    if (objN2 != r0) {
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 62:
                                                                                                                                    break;
                                                                                                                                case 95:
                                                                                                                                    break;
                                                                                                                                case 124:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    case 116:
                                                                                                                        i7 = 54657;
                                                                                                                        while (true) {
                                                                                                                            i7 ^= 54674;
                                                                                                                            switch (i7) {
                                                                                                                                case 19:
                                                                                                                                    i7 = 54688;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                case 50:
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        C0152.n(11548, null, new Object[]{(String) C0152.n(85600, null, new Object[]{(short[]) C0152.n(83880) /*=> a.short*/, 28, Integer.valueOf(C0129.f338 ^ 955), 2752})});
                                                                                                        i6 = 55556;
                                                                                                        while (true) {
                                                                                                            i6 ^= 55573;
                                                                                                            switch (i6) {
                                                                                                                case 17:
                                                                                                                    i6 = 55587;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 54:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th) {
                                                                                                        C0178.n(58539, (AtomicBoolean) C0178.n(35433, r0), new Object[]{false});
                                                                                                        C0152.n(11548, null, new Object[]{(String) C0198.n(26710, (String) C0152.n(8274, null, new Object[]{(short[]) C0152.n(83880) /*=> a.short*/, 0, Integer.valueOf(C0048.f204 ^ 840), 1913}), new Object[]{((Class) C0149.n(32719, th, new Object[0])).getSimpleName()})});
                                                                                                        int i19 = 53758;
                                                                                                        while (true) {
                                                                                                            i19 ^= 53775;
                                                                                                            switch (i19) {
                                                                                                                case 1009:
                                                                                                                    i19 = 54440;
                                                                                                                    break;
                                                                                                                case 1703:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 76:
                                                                                                    C0182.n(39712, null, new Object[]{r0});
                                                                                                    int i20 = 51836;
                                                                                                    while (true) {
                                                                                                        i20 ^= 51853;
                                                                                                        switch (i20) {
                                                                                                            case 241:
                                                                                                                i20 = 52518;
                                                                                                                break;
                                                                                                            case 1963:
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
                                                                                    case 243:
                                                                                        i14 = objN7 != r0 ? 51557 : 50875;
                                                                                        break;
                                                                                    case 4075:
                                                                                        int i21 = 51588;
                                                                                        while (true) {
                                                                                            i21 ^= 51605;
                                                                                            switch (i21) {
                                                                                                case 17:
                                                                                                    i21 = 51619;
                                                                                                    continue;
                                                                                                case 54:
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
                                                                            break;
                                                                        case 1769:
                                                                            int i22 = 50689;
                                                                            while (true) {
                                                                                i22 ^= 50706;
                                                                                switch (i22) {
                                                                                    case 19:
                                                                                        i22 = 50720;
                                                                                        continue;
                                                                                    case 50:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                                while (true) {
                                                                                    zBooleanValue = ((Boolean) C0195.n(80977, atomicReference2, new Object[]{r0, 0})).booleanValue();
                                                                                    i = 55680;
                                                                                    while (true) {
                                                                                        i ^= 55697;
                                                                                        switch (i) {
                                                                                            case 17:
                                                                                                if (zBooleanValue) {
                                                                                                }
                                                                                                break;
                                                                                            case 1467:
                                                                                                break;
                                                                                            case 1496:
                                                                                                objN = C0195.n(90685, atomicReference2, new Object[0]);
                                                                                                i2 = 56579;
                                                                                                while (true) {
                                                                                                    i2 ^= 56596;
                                                                                                    switch (i2) {
                                                                                                        case 23:
                                                                                                            if (objN != r0) {
                                                                                                            }
                                                                                                            break;
                                                                                                        case 54:
                                                                                                            break;
                                                                                                        case 85:
                                                                                                            break;
                                                                                                        case 1564036:
                                                                                                            break;
                                                                                                        default:
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            case 1529:
                                                                                                i3 = 56455;
                                                                                                while (true) {
                                                                                                    i3 ^= 56472;
                                                                                                    switch (i3) {
                                                                                                        case 31:
                                                                                                            i3 = 56486;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        case 62:
                                                                                                            break;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 241:
                                                                i12 = objN4 != null ? 49883 : 49852;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 503:
                                                    if (zBooleanValue4) {
                                                        i11 = 48953;
                                                    } else {
                                                        i11 = 49635;
                                                        continue;
                                                    }
                                                    break;
                                                case 32495:
                                                    C0178.n(58539, (AtomicBoolean) C0178.n(35433, r0), new Object[]{false});
                                                    int i23 = 49666;
                                                    while (true) {
                                                        i23 ^= 49683;
                                                        switch (i23) {
                                                            case 17:
                                                                i23 = 49697;
                                                                continue;
                                                            case 50:
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 47417:
                                        C0182.n(39712, null, new Object[]{r0});
                                        int i24 = 48767;
                                        while (true) {
                                            i24 ^= 48784;
                                            switch (i24) {
                                                case 14:
                                                    break;
                                                case 239:
                                                    i24 = 48798;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 47483:
                                        i10 = 48705;
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
                int iIntValue = ((Integer) C0152.n(26722, null, new Object[0])).intValue();
                int i25 = 1507503;
                while (true) {
                    i25 ^= 1507520;
                    switch (i25) {
                        case 14:
                            break;
                        case 45:
                            break;
                        case 111:
                            if (iIntValue >= 0) {
                                i25 = 1507596;
                            }
                            break;
                        case 460:
                            C0195.n(19817, (PrintStream) C0195.n(72538) /*=> System.out*/, new Object[]{Integer.valueOf(((Integer) C0195.n(60398, null, new Object[]{(String) C0152.n(38610, null, new Object[]{(String) C0152.n(96848) /*=> raw:new String(new byte[]{(byte) 65, (byte) 81, (byte) 122, (byte) 70, (byte) 99, (byte) 79, (byte) 121,*/})})).intValue())});
                            break;
                        default:
                            continue;
                    }
                    i25 = 1507565;
                }
                break;
            default:
                final FishDrive fishDrive = (FishDrive) C0152.n(80686, this);
                C0152.n(52927, null, new Object[]{new Runnable() { // from class: com.github.catvod.spider.FishDrive.6

                    /* JADX INFO: renamed from: short, reason: not valid java name */
                    private static final short[] f42short = {1361, 1379, 1380, 1346, 1351, 1360, 1318, 22438, -27367, 17568, 27074, 22611, 2610, 2560, 2567, 2593, 2596, 2611, 21375, 29914, 28782, 17542, 32355, -2711, 2592, 2568, 2567, 2588, 21422, 29869, 31889, -31301, 2952, 3002, 3005, 2971, 2974, 2953, 3071, 17724, 32729, 22911, -25664, 789, 807, 800, 774, 771, 788, 31763, 30106, 26607, 26236, -29134, 773, 813, 23128, 32253, 31049, 19873, 30532, 1040, 1080, 1079, 1068, 24824, 24939, 19032, 31386, -29806, 1042, 1082, 19126, 28755, -1191, 23966, 31389, 19242, 29053, 25432, 22260, 21053, 29345, -28501, 19777, 22980, 21168, 27886, 672, 701, 658, 648, 659, 703, 649, 658, 653, 670, 678, 731, 648, 659, 660, 652, 700, 660, 683, 649, 660, 643, 642, 703, 658, 666, 663, 660, 668, 705, 731};

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Activity activity = InitOrigin.getActivity();
                            int iQ = AbstractC0583w0.Q(8, activity);
                            int iQ2 = AbstractC0583w0.Q(12, activity);
                            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                            linearLayoutK.addView(AbstractC0583w0.p(activity, C0128.m511(f42short, 0, 9, 1286), C0089.m355(f42short, 9, 23, 2661)));
                            LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                            final boolean[] zArr = {FishDrive.x};
                            AbstractC0583w0.m(linearLayoutY, C0143.m570(f42short, 32, 11, 3039), C0018.m70(f42short, 43, 18, 834), AbstractC0583w0.c, FishDrive.x, 0, false, null, zArr, null);
                            TextView textView = new TextView(activity);
                            textView.setText(C0125.m499(f42short, 61, 23, 1109));
                            textView.setTextSize(12.0f);
                            textView.setTextColor(AbstractC0583w0.f);
                            textView.setPadding(iQ2, iQ2, iQ2, iQ);
                            linearLayoutY.addView(textView);
                            linearLayoutK.addView(linearLayoutY);
                            try {
                                AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton(C0093.m368(f42short, 84, 2, 668), new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.FishDrive.6.1

                                    /* JADX INFO: renamed from: short, reason: not valid java name */
                                    private static final short[] f43short = {23094, 23439, 2002, 2016, 2023, 1985, 1988, 2003, 21797, -26726, 1983, 1957};

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public void onClick(DialogInterface dialogInterface, int i26) {
                                        FishDrive.x = zArr[0];
                                        FishDrive.this.getClass();
                                        FishDrive.L();
                                        X0.a(C0055.m219(f43short, 2, 10, 1925).concat(FishDrive.x ? C0089.m355(f43short, 0, 1, 1334) : C0091.m360(f43short, 1, 1, 2812)));
                                    }
                                }).setNegativeButton(C0011.m42(f42short, 86, 2, 358), (DialogInterface.OnClickListener) null).create();
                                alertDialogCreate.show();
                                AbstractC0583w0.l0(alertDialogCreate, 0.0f);
                            } catch (Exception e3) {
                                e = e3;
                                com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0018.m70(f42short, 88, 31, 763)));
                            }
                        } catch (Exception e4) {
                            e = e4;
                        }
                    }
                }});
                break;
        }
    }
}
