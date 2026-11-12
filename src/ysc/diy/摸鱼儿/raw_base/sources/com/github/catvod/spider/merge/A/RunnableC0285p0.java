package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.X.C0051;
import java.io.InputStream;
import java.io.PrintStream;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0173;
import moyu.fucking.C0181;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0204;
import moyu.fucking.C0216;
import moyu.fucking.C0219;
import moyu.fucking.C0224;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class RunnableC0285p0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f146short = {834, 835, 849, 826, 815};
    public final Process a;
    public final boolean b;
    public final StringBuilder c = new StringBuilder();

    public RunnableC0285p0(Process process, boolean z) throws Throwable {
        this.a = process;
        this.b = z;
        int iIntValue = ((Integer) C0224.n(95865, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0224.n(2303, null, new Object[]{(String) C0173.n(65980)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public final void a(int i, byte[] bArr) throws Throwable {
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (i <= 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    int iIntValue = ((Integer) C0173.n(79936, null, new Object[0])).intValue();
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                if (iIntValue >= 0) {
                                    i3 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                return;
                            case 500:
                                C0168.n(61614, (PrintStream) C0195.n(72538), new Object[]{(String) C0181.n(74690, null, new Object[]{(String) C0173.n(26412)})});
                                return;
                            default:
                                continue;
                        }
                        i3 = 1802;
                    }
                    break;
                case 239:
                    synchronized (((StringBuilder) C0173.n(73047, this))) {
                        try {
                            int iIntValue2 = ((Integer) C0162.n(73207, (StringBuilder) C0173.n(73047, this), new Object[0])).intValue();
                            int i4 = 1864;
                            while (true) {
                                i4 ^= 1881;
                                switch (i4) {
                                    case 17:
                                        if (iIntValue2 >= 2048) {
                                            i4 = 48736;
                                        }
                                        break;
                                    case 47384:
                                        try {
                                            String str = new String(bArr, 0, i, (String) C0152.n(8274, null, new Object[]{(short[]) C0173.n(72165), 0, Integer.valueOf(C0051.f207 ^ (-373)), 791}));
                                            break;
                                        } catch (Throwable th) {
                                            int i5 = 48891;
                                            while (true) {
                                                i5 ^= 48908;
                                                switch (i5) {
                                                    case 22:
                                                        break;
                                                    case 503:
                                                        i5 = 48922;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case 47417:
                                        break;
                                    case 47483:
                                        break;
                                    default:
                                        continue;
                                }
                                i4 = 48705;
                            }
                        } catch (Throwable th2) {
                            int i6 = 48767;
                            while (true) {
                                i6 ^= 48784;
                                switch (i6) {
                                    case 14:
                                        throw th2;
                                    case 239:
                                        i6 = 48798;
                                        break;
                                }
                            }
                        }
                    }
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    public final String b() {
        String str;
        synchronized (((StringBuilder) C0173.n(73047, this))) {
            str = (String) C0149.n(92089, (String) C0204.n(47880, (String) C0204.n(47880, (String) C0198.n(89992, (StringBuilder) C0173.n(73047, this), new Object[0]), new Object[]{'\n', ' '}), new Object[]{'\r', ' '}), new Object[0]);
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0100 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        int iIntValue;
        int i2;
        InputStream inputStream;
        try {
            boolean zBooleanValue = ((Boolean) C0173.n(54460, this)).booleanValue();
            Process process = (Process) C0173.n(46628, this);
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                        break;
                    case 49:
                        i3 = zBooleanValue ? 1709 : 1678;
                        break;
                    case 204:
                        InputStream inputStream2 = (InputStream) C0173.n(86394, process, new Object[0]);
                        int i4 = 1740;
                        while (true) {
                            i4 ^= 1757;
                            switch (i4) {
                                case 17:
                                    i4 = 1771;
                                    break;
                                case 54:
                                    inputStream = inputStream2;
                                    break;
                            }
                        }
                        break;
                    case 239:
                        inputStream = (InputStream) C0173.n(56686, process, new Object[0]);
                        break;
                    default:
                        break;
                }
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int iIntValue2 = ((Integer) C0219.n(82234, inputStream, new Object[]{bArr})).intValue();
                    int i5 = 1864;
                    while (true) {
                        i5 ^= 1881;
                        switch (i5) {
                            case 17:
                                i5 = iIntValue2 != -1 ? 48736 : 48705;
                                break;
                            case 47384:
                                C0216.n(17963, inputStream, new Object[0]);
                                int i6 = 49666;
                                while (true) {
                                    i6 ^= 49683;
                                    switch (i6) {
                                        case 17:
                                            i6 = 49697;
                                            break;
                                        case 50:
                                            iIntValue = ((Integer) C0195.n(39207, null, new Object[0])).intValue();
                                            i2 = 50689;
                                            while (true) {
                                                i2 ^= 50706;
                                                switch (i2) {
                                                    case 19:
                                                        if (iIntValue >= 0) {
                                                            i2 = 50782;
                                                        }
                                                        break;
                                                    case 45:
                                                        return;
                                                    case 50:
                                                        break;
                                                    case 76:
                                                        C0195.n(19817, (PrintStream) C0195.n(72538), new Object[]{Integer.valueOf(((Integer) C0195.n(60398, null, new Object[]{(String) C0168.n(19169, null, new Object[]{(String) C0173.n(39417)})})).intValue())});
                                                        return;
                                                    default:
                                                        continue;
                                                        continue;
                                                }
                                                i2 = 50751;
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 47417:
                                C0173.n(65636, this, new Object[]{Integer.valueOf(iIntValue2), bArr});
                                int i7 = 48767;
                                while (true) {
                                    i7 ^= 48784;
                                    switch (i7) {
                                        case 14:
                                            break;
                                        case 239:
                                            i7 = 48798;
                                            break;
                                    }
                                }
                                break;
                            case 47483:
                                break;
                            default:
                                break;
                        }
                    }
                }
            } catch (Throwable th) {
                int i8 = 48891;
                while (true) {
                    i8 ^= 48908;
                    switch (i8) {
                        case 22:
                            int i9 = 49790;
                            while (true) {
                                i9 ^= 49807;
                                switch (i9) {
                                    case 18:
                                        break;
                                    case 51:
                                        break;
                                    case 84:
                                        try {
                                            C0216.n(17963, inputStream, new Object[0]);
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
                                        } catch (Throwable th2) {
                                            C0216.n(87692, th, new Object[]{th2});
                                            break;
                                        }
                                        break;
                                    case 241:
                                        i9 = inputStream != null ? 49883 : 49852;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            throw th;
                        case 503:
                            i8 = 48922;
                            continue;
                        default:
                            continue;
                    }
                    i = 50813;
                    while (true) {
                        i ^= 50830;
                        switch (i) {
                            case 18:
                                break;
                            case 243:
                                i = 50844;
                                continue;
                                continue;
                            default:
                                continue;
                                continue;
                        }
                        iIntValue = ((Integer) C0195.n(39207, null, new Object[0])).intValue();
                        i2 = 50689;
                        while (true) {
                            i2 ^= 50706;
                            switch (i2) {
                                case 19:
                                    if (iIntValue >= 0) {
                                        i2 = 50782;
                                    }
                                    break;
                                case 45:
                                    return;
                                case 50:
                                    break;
                                case 76:
                                    C0195.n(19817, (PrintStream) C0195.n(72538), new Object[]{Integer.valueOf(((Integer) C0195.n(60398, null, new Object[]{(String) C0168.n(19169, null, new Object[]{(String) C0173.n(39417)})})).intValue())});
                                    return;
                                default:
                                    continue;
                                    continue;
                            }
                            i2 = 50751;
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            i = 50813;
            while (true) {
                i ^= 50830;
                switch (i) {
                    case 18:
                        break;
                    case 243:
                        i = 50844;
                        continue;
                        continue;
                    default:
                        continue;
                        continue;
                }
            }
        }
    }
}
