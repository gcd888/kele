package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.D.C0012;
import com.github.catvod.spider.merge.T.C0048;
import com.github.catvod.spider.merge.p018v.C0131;
import com.github.catvod.spider.merge.t0.C0124;
import java.io.PrintStream;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0164;
import moyu.fucking.C0175;
import moyu.fucking.C0185;
import moyu.fucking.C0189;
import moyu.fucking.C0193;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0200;
import moyu.fucking.C0203;
import moyu.fucking.C0205;
import moyu.fucking.C0212;
import moyu.fucking.C0219;
import moyu.fucking.C0221;
import moyu.fucking.C0224;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0385w0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f261short = {3238, 3237, 3239, 3247, 3235, 3254, 3243, 3249, 3242, 3232, 3227, 2126, 2132, 1161, 478, 841, 842, 840, 832, 844, 857, 836, 862, 837, 847, 884, 1554, 1540, 2832, 1126};
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Object k;

    public /* synthetic */ RunnableC0385w0(Object obj, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, int i) throws Throwable {
        this.a = i;
        this.k = obj;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        int iIntValue = ((Integer) C0219.n(61875, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0152.n(66570, null, new Object[]{(String) C0221.n(37805, null, new Object[]{(String) C0164.n(89226)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x017b. Please report as an issue. */
    private final void a() throws Throwable {
        int i;
        A0 a0 = (A0) C0164.n(64931, this);
        String str = (String) C0164.n(5377, this);
        String str2 = (String) C0164.n(15835, this);
        long jLongValue = ((Long) C0164.n(77314, this)).longValue();
        String str3 = (String) C0164.n(9318, this);
        String str4 = (String) C0164.n(60471, this);
        String str5 = (String) C0164.n(48244, this);
        String str6 = (String) C0164.n(31884, this);
        String str7 = (String) C0164.n(52336, this);
        String str8 = (String) C0164.n(64977, this);
        ((Integer) C0175.n(46748)).intValue();
        String str9 = (String) C0198.n(14698, null, new Object[]{(short[]) C0164.n(31995), 0, Integer.valueOf(C0048.f204 ^ 863), 3268});
        try {
            ((Boolean) C0203.n(4018, null, new Object[]{C0205.n(21239), (String) C0149.n(61324, null, new Object[]{(short[]) C0164.n(31995), 11, Integer.valueOf(C0012.f168 ^ 879), 2079})})).booleanValue();
            synchronized (a0) {
                try {
                    boolean zBooleanValue = ((Boolean) C0175.n(76278, null, new Object[]{str})).booleanValue();
                    int i2 = 1616;
                    while (true) {
                        i2 ^= 1633;
                        switch (i2) {
                            case 14:
                                break;
                            case 49:
                                i2 = !zBooleanValue ? 1709 : 1678;
                                break;
                            case 204:
                                break;
                            case 239:
                                C0203.n(64059, a0, new Object[]{Long.valueOf(jLongValue), str2});
                                StringBuilder sb = new StringBuilder(str9);
                                String str10 = (String) C0198.n(89992, sb, new Object[0]);
                                boolean zBooleanValue2 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0189.n(79432, a0, new Object[]{str10, false})})).booleanValue();
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 45:
                                            break;
                                        case 76:
                                            String str11 = (String) C0189.n(30113, a0, new Object[]{str3, str5, str4, str6, str7, false});
                                            boolean zBooleanValue3 = ((Boolean) C0175.n(76278, null, new Object[]{str})).booleanValue();
                                            int i4 = 48891;
                                            while (true) {
                                                i4 ^= 48908;
                                                switch (i4) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        break;
                                                    case 503:
                                                        i4 = zBooleanValue3 ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        boolean zBooleanValue4 = ((Boolean) C0195.n(41159, null, new Object[]{str11})).booleanValue();
                                                        int i5 = 49666;
                                                        while (true) {
                                                            i5 ^= 49683;
                                                            switch (i5) {
                                                                case 17:
                                                                    i5 = !zBooleanValue4 ? 49759 : 49728;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                                case 76:
                                                                    C0224.n(1052, (ConcurrentHashMap) C0203.n(39681, a0), new Object[]{str10, str11});
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
                                            i3 = zBooleanValue2 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i6 = 49790;
                                while (true) {
                                    i6 ^= 49807;
                                    switch (i6) {
                                        case 18:
                                            break;
                                        case 241:
                                            i6 = 49821;
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
                } catch (Throwable th) {
                    int i7 = 1864;
                    while (true) {
                        i7 ^= 1881;
                        switch (i7) {
                            case 17:
                                i7 = 48674;
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                        throw th;
                    }
                }
            }
            while (true) {
                i ^= 1757;
                switch (i) {
                    case 17:
                        i = 1771;
                        break;
                    case 54:
                        int iIntValue = ((Integer) C0152.n(51095, null, new Object[0])).intValue();
                        int i8 = 49914;
                        while (true) {
                            i8 ^= 49931;
                            switch (i8) {
                                case 497:
                                    if (iIntValue >= 0) {
                                        i8 = 50658;
                                    }
                                    break;
                                case 1711:
                                    break;
                                case 1736:
                                    return;
                                case 1769:
                                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0221.n(97632, null, new Object[]{(String) C0164.n(78493)})})});
                                    return;
                                default:
                                    continue;
                            }
                            i8 = 50627;
                        }
                        break;
                }
            }
        } catch (Exception e) {
            int i9 = 50689;
            while (true) {
                i9 ^= 50706;
                switch (i9) {
                    case 19:
                        i9 = 50720;
                        continue;
                    case 50:
                        break;
                    default:
                        continue;
                }
            }
        } catch (Throwable th2) {
            ((Boolean) C0212.n(87909, (Set) C0200.n(72137, a0), new Object[]{str8})).booleanValue();
            throw th2;
        }
        ((Boolean) C0212.n(87909, (Set) C0200.n(72137, a0), new Object[]{str8})).booleanValue();
        i = 1740;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        switch (((Integer) C0164.n(34198, this)).intValue()) {
            case 0:
                a();
                return;
            default:
                Z0 z0 = (Z0) C0164.n(64931, this);
                String str = (String) C0164.n(5377, this);
                String str2 = (String) C0164.n(15835, this);
                long jLongValue = ((Long) C0164.n(77314, this)).longValue();
                String str3 = (String) C0164.n(9318, this);
                String str4 = (String) C0164.n(60471, this);
                String str5 = (String) C0164.n(48244, this);
                String str6 = (String) C0164.n(31884, this);
                String str7 = (String) C0164.n(52336, this);
                String str8 = (String) C0164.n(64977, this);
                String str9 = (String) C0224.n(52346, null, new Object[]{(short[]) C0164.n(31995), 15, Integer.valueOf(C0124.f333 ^ (-768)), 811});
                try {
                    ((Boolean) C0203.n(4018, null, new Object[]{C0205.n(43734), (String) C0198.n(74142, null, new Object[]{(short[]) C0164.n(31995), 26, Integer.valueOf(C0131.f340 ^ 734), 1607})})).booleanValue();
                    synchronized (z0) {
                        try {
                            boolean zBooleanValue = ((Boolean) C0185.n(75037, null, new Object[]{str})).booleanValue();
                            int i2 = 1616;
                            while (true) {
                                i2 ^= 1633;
                                switch (i2) {
                                    case 14:
                                        break;
                                    case 49:
                                        i2 = !zBooleanValue ? 1709 : 1678;
                                        break;
                                    case 204:
                                        break;
                                    case 239:
                                        C0193.n(63156, z0, new Object[]{Long.valueOf(jLongValue), str2});
                                        StringBuilder sb = new StringBuilder(str9);
                                        String str10 = (String) C0198.n(89992, sb, new Object[0]);
                                        boolean zBooleanValue2 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0193.n(37717, z0, new Object[]{str10, false})})).booleanValue();
                                        int i3 = 48767;
                                        while (true) {
                                            i3 ^= 48784;
                                            switch (i3) {
                                                case 14:
                                                    break;
                                                case 45:
                                                    break;
                                                case 76:
                                                    String str11 = (String) C0193.n(84957, z0, new Object[]{str3, str5, str4, str6, str7, false});
                                                    boolean zBooleanValue3 = ((Boolean) C0185.n(75037, null, new Object[]{str})).booleanValue();
                                                    int i4 = 48891;
                                                    while (true) {
                                                        i4 ^= 48908;
                                                        switch (i4) {
                                                            case 22:
                                                                break;
                                                            case 53:
                                                                break;
                                                            case 503:
                                                                i4 = zBooleanValue3 ? 49635 : 48953;
                                                                break;
                                                            case 32495:
                                                                boolean zBooleanValue4 = ((Boolean) C0195.n(41159, null, new Object[]{str11})).booleanValue();
                                                                int i5 = 49666;
                                                                while (true) {
                                                                    i5 ^= 49683;
                                                                    switch (i5) {
                                                                        case 17:
                                                                            i5 = !zBooleanValue4 ? 49759 : 49728;
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                        case 76:
                                                                            C0224.n(1052, (ConcurrentHashMap) C0185.n(33501, z0), new Object[]{str10, str11});
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
                                                    i3 = zBooleanValue2 ? 48860 : 48829;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        int i6 = 49790;
                                        while (true) {
                                            i6 ^= 49807;
                                            switch (i6) {
                                                case 18:
                                                    break;
                                                case 241:
                                                    i6 = 49821;
                                                    continue;
                                                default:
                                                    continue;
                                            }
                                        }
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } catch (Throwable th) {
                            int i7 = 1864;
                            while (true) {
                                i7 ^= 1881;
                                switch (i7) {
                                    case 17:
                                        i7 = 48674;
                                        break;
                                    case 47483:
                                        throw th;
                                }
                            }
                        }
                    }
                    while (true) {
                        i ^= 1757;
                        switch (i) {
                            case 17:
                                i = 1771;
                                break;
                            case 54:
                                return;
                        }
                    }
                } catch (Exception e) {
                    int i8 = 49914;
                    while (true) {
                        i8 ^= 49931;
                        switch (i8) {
                            case 497:
                                i8 = 50596;
                                continue;
                            case 1711:
                                break;
                            default:
                                continue;
                        }
                    }
                } catch (Throwable th2) {
                    ((Boolean) C0212.n(87909, (Set) C0185.n(40576, z0), new Object[]{str8})).booleanValue();
                    throw th2;
                }
                ((Boolean) C0212.n(87909, (Set) C0185.n(40576, z0), new Object[]{str8})).booleanValue();
                i = 1740;
                break;
        }
    }
}
