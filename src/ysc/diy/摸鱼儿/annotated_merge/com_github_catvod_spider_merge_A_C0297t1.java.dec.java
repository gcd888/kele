package com.github.catvod.spider.merge.A;

import android.app.Application;
import android.util.AtomicFile;
import com.github.catvod.spider.merge.B.C0004;
import com.github.catvod.spider.merge.E.C0015;
import com.github.catvod.spider.merge.G.C0023;
import com.github.catvod.spider.merge.G.C0024;
import com.github.catvod.spider.merge.L.C0031;
import com.github.catvod.spider.merge.O.C0038;
import com.github.catvod.spider.merge.Q.C0041;
import com.github.catvod.spider.merge.X.C0051;
import com.github.catvod.spider.merge.c0.C0064;
import com.github.catvod.spider.merge.c0.C0065;
import com.github.catvod.spider.merge.d0.C0068;
import com.github.catvod.spider.merge.f0.C0077;
import com.github.catvod.spider.merge.k0.C0099;
import com.github.catvod.spider.merge.p0.C0110;
import com.github.catvod.spider.merge.p0.C0111;
import com.github.catvod.spider.merge.p016t.C0121;
import com.github.catvod.spider.merge.p017u.C0129;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import moyu.fucking.C0149;
import moyu.fucking.C0151;
import moyu.fucking.C0152;
import moyu.fucking.C0157;
import moyu.fucking.C0162;
import moyu.fucking.C0178;
import moyu.fucking.C0179;
import moyu.fucking.C0182;
import moyu.fucking.C0188;
import moyu.fucking.C0194;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0209;
import moyu.fucking.C0216;
import moyu.fucking.C0219;
import moyu.fucking.C0221;
import moyu.fucking.C0225;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0297t1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f153short = {3134, 3135, 3117, 3142, 3155, 645, 644, 662, 765, 744, 472, 474, 460, 448, 1785, 1791, 1665, 1773, 1791, 1775, 1765, 1765, 2252, 1895, 1895, 411, 471, 468, 478, 2860, 2924, 2919, 2933, 517, 526, 515, 634, 563, 568, 565, 588, 844, 839, 842, 819, 2974, 2965, 2968, 3041};
    public static final byte[] a = {20, 57, 45, 12, 52, 56, 29, 108, 111, 82, 85, 65, 48, 1, 6, 19, 21, 13};
    public static volatile String b = null;

    public C0297t1() throws Throwable {
        int iIntValue = ((Integer) C0188.n(99471, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0149.n(54590, null, new Object[]{(String) C0188.n(52576, null, new Object[]{(String) C0194.n(60645)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00b5. Please report as an issue. */
    public static String a(String str) {
        String str2 = (String) C0157.n(78385, null, new Object[]{"UTF-8");
        String str3 = (String) C0195.n(43185);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (str != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0195.n(5730, str, new Object[0])).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (zBooleanValue) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                try {
                                    byte[] bArr = (byte[]) C0179.n(19885, null, new Object[]{str, Integer.valueOf(C0004.f160 ^ (-338))});
                                    byte[] bArr2 = (byte[]) C0221.n(21903, (String) C0194.n(70763, null, new Object[0]), new Object[]{str2});
                                    int i3 = 0;
                                    while (true) {
                                        int length = bArr.length;
                                        int i4 = 48767;
                                        while (true) {
                                            i4 ^= 48784;
                                            switch (i4) {
                                                case 14:
                                                    break;
                                                case 45:
                                                    break;
                                                case 76:
                                                    break;
                                                case 239:
                                                    i4 = i3 < length ? 48860 : 48829;
                                                    break;
                                                default:
                                                    break;
                                            }
                                            return new String(bArr, str2);
                                        }
                                        byte b2 = bArr[i3];
                                        byte b3 = bArr2[i3 % bArr2.length];
                                        bArr[i3] = (byte) ((b2 & (b3 ^ (-1))) | ((b2 ^ (-1)) & b3));
                                        i3 += C0031.f187 ^ (-609);
                                        int i5 = 48891;
                                        while (true) {
                                            i5 ^= 48908;
                                            switch (i5) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i5 = 48922;
                                                    break;
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    int i6 = 49666;
                                    while (true) {
                                        i6 ^= 49683;
                                        switch (i6) {
                                            case 17:
                                                i6 = 49697;
                                                break;
                                            case 50:
                                                return str3;
                                        }
                                    }
                                }
                                break;
                            case 500:
                                int i7 = 1864;
                                while (true) {
                                    i7 ^= 1881;
                                    switch (i7) {
                                        case 17:
                                            i7 = 48674;
                                            break;
                                        case 47483:
                                            return str3;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    return str3;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static boolean b(String str) {
        try {
            File file = (File) C0194.n(3515, null, new Object[]{str});
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = file != null ? 1709 : 1678;
                        break;
                    case 204:
                        boolean zBooleanValue = ((Boolean) C0216.n(15186, file, new Object[0])).booleanValue();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    i2 = zBooleanValue ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    boolean zBooleanValue2 = ((Boolean) C0221.n(60867, file, new Object[0])).booleanValue();
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = zBooleanValue2 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                return true;
                                            case 47483:
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
                        break;
                    default:
                        break;
                }
            }
            return false;
        } catch (Exception e) {
            int i4 = 48767;
            while (true) {
                i4 ^= 48784;
                switch (i4) {
                    case 14:
                        return false;
                    case 239:
                        i4 = 48798;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00a9. Please report as an issue. */
    public static String c(String str) {
        int i = 0;
        String str2 = (String) C0198.n(39623, null, new Object[]{"UTF-8");
        String str3 = (String) C0195.n(43185);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    i2 = str != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0195.n(5730, str, new Object[0])).booleanValue();
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                i3 = zBooleanValue ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                try {
                                    byte[] bArr = (byte[]) C0221.n(21903, str, new Object[]{str2});
                                    byte[] bArr2 = (byte[]) C0221.n(21903, (String) C0194.n(70763, null, new Object[0]), new Object[]{str2});
                                    while (true) {
                                        int length = bArr.length;
                                        int i4 = 48767;
                                        while (true) {
                                            i4 ^= 48784;
                                            switch (i4) {
                                                case 14:
                                                    break;
                                                case 45:
                                                    break;
                                                case 76:
                                                    break;
                                                case 239:
                                                    i4 = i < length ? 48860 : 48829;
                                                    break;
                                                default:
                                                    break;
                                            }
                                            return (String) C0221.n(29076, null, new Object[]{bArr, Integer.valueOf(C0023.f179 ^ 697)});
                                        }
                                        byte b2 = bArr[i];
                                        byte b3 = bArr2[i % bArr2.length];
                                        bArr[i] = (byte) ((b2 & (b3 ^ (-1))) | ((b2 ^ (-1)) & b3));
                                        i += C0065.f274 ^ 18;
                                        int i5 = 48891;
                                        while (true) {
                                            i5 ^= 48908;
                                            switch (i5) {
                                                case 22:
                                                    break;
                                                case 503:
                                                    i5 = 48922;
                                                    break;
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    int i6 = 49666;
                                    while (true) {
                                        i6 ^= 49683;
                                        switch (i6) {
                                            case 17:
                                                i6 = 49697;
                                                continue;
                                            case 50:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                }
                                break;
                            case 500:
                                int i7 = 1864;
                                while (true) {
                                    i7 ^= 1881;
                                    switch (i7) {
                                        case 17:
                                            i7 = 48674;
                                            continue;
                                        case 47483:
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
                case 239:
                    break;
                default:
                    break;
            }
        }
        return str3;
    }

    public static File d(String str) {
        File file = (File) C0194.n(65911, null, new Object[0]);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (file != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    File file2 = new File(file, str);
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                return file2;
                        }
                    }
                    break;
                case 239:
                    return null;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static File e() {
        String str = (String) C0194.n(80098);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (str != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    File file = new File((String) C0194.n(80098));
                    boolean zBooleanValue = ((Boolean) C0216.n(15186, file, new Object[0])).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (!zBooleanValue) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                ((Boolean) C0151.n(46698, file, new Object[0])).booleanValue();
                                break;
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    return file;
                case 239:
                    try {
                        Application application = (Application) C0149.n(10590, null, new Object[0]);
                        int i3 = 1864;
                        while (true) {
                            i3 ^= 1881;
                            switch (i3) {
                                case 17:
                                    i3 = application != null ? 48736 : 48705;
                                    break;
                                case 47384:
                                    return null;
                                case 47417:
                                    File file2 = new File((File) C0216.n(93764, (Application) C0149.n(10590, null, new Object[0]), new Object[0]), (String) C0179.n(1747, null, new Object[]{"moyu"));
                                    boolean zBooleanValue2 = ((Boolean) C0216.n(15186, file2, new Object[0])).booleanValue();
                                    int i4 = 48767;
                                    while (true) {
                                        i4 ^= 48784;
                                        switch (i4) {
                                            case 14:
                                                break;
                                            case 45:
                                                break;
                                            case 76:
                                                ((Boolean) C0151.n(46698, file2, new Object[0])).booleanValue();
                                                break;
                                            case 239:
                                                if (!zBooleanValue2) {
                                                    i4 = 48860;
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i4 = 48829;
                                    }
                                    b = (String) C0225.n(57920, file2, new Object[0]);
                                    return file2;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                    } catch (Exception e) {
                        int i5 = 48891;
                        while (true) {
                            i5 ^= 48908;
                            switch (i5) {
                                case 22:
                                    break;
                                case 503:
                                    i5 = 48922;
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x007a. Please report as an issue. */
    public static String f() throws Throwable {
        byte[] bArr;
        int i;
        String str;
        try {
            boolean zBooleanValue = ((Boolean) C0149.n(12776)).booleanValue();
            int i2 = 1616;
            while (true) {
                i2 ^= 1633;
                switch (i2) {
                    case 14:
                        break;
                    case 49:
                        i2 = zBooleanValue ? 1709 : 1678;
                        break;
                    case 204:
                        String str2 = (String) C0194.n(68691, null, new Object[0]);
                        int i3 = 1740;
                        while (true) {
                            i3 ^= 1757;
                            switch (i3) {
                                case 17:
                                    i3 = str2 != null ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    boolean zBooleanValue2 = ((Boolean) C0195.n(5730, str2, new Object[0])).booleanValue();
                                    int i4 = 1864;
                                    while (true) {
                                        i4 ^= 1881;
                                        switch (i4) {
                                            case 17:
                                                i4 = !zBooleanValue2 ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                return str2;
                                            case 47483:
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
                        break;
                    default:
                        break;
                }
            }
            while (true) {
                int length = bArr.length;
                int i5 = 48767;
                while (true) {
                    i5 ^= 48784;
                    switch (i5) {
                        case 14:
                            break;
                        case 45:
                            break;
                        case 76:
                            break;
                        case 239:
                            i5 = i < length ? 48860 : 48829;
                            break;
                        default:
                            break;
                    }
                    try {
                        String str3 = new String(bArr, (String) C0149.n(36390, null, new Object[]{"US-ASCII"));
                        int i6 = 49666;
                        while (true) {
                            i6 ^= 49683;
                            switch (i6) {
                                case 17:
                                    i6 = 49697;
                                    break;
                                case 50:
                                    str = str3;
                                    C0194.n(43247, null, new Object[]{bArr, (byte) 0});
                                    return str;
                            }
                        }
                    } catch (UnsupportedEncodingException e) {
                        str = new String(bArr);
                    }
                }
                byte b2 = bArr[i];
                byte b3 = (byte) ((C0111.f320 ^ (-1013)) + i);
                bArr[i] = (byte) ((b2 & (b3 ^ (-1))) | ((b2 ^ (-1)) & b3));
                i += C0129.f338 ^ 915;
                int i7 = 48891;
                while (true) {
                    i7 ^= 48908;
                    switch (i7) {
                        case 22:
                            break;
                        case 503:
                            i7 = 48922;
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            int i8 = 49790;
            while (true) {
                i8 ^= 49807;
                switch (i8) {
                    case 18:
                        break;
                    case 241:
                        i8 = 49821;
                        continue;
                    default:
                        continue;
                }
            }
        }
        bArr = (byte[]) C0194.n(41154, (byte[]) C0194.n(19825), new Object[0]);
        i = 0;
    }

    public static boolean g(String str) {
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = str != null ? 1709 : 1678;
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0195.n(5730, str, new Object[0])).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = !zBooleanValue ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                boolean zBooleanValue2 = ((Boolean) C0182.n(55567, (String) C0149.n(83930, null, new Object[]{(short[]) C0194.n(58725), 22, 1, 2274}), new Object[]{str})).booleanValue();
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = !zBooleanValue2 ? 48736 : 48705;
                                            break;
                                        case 47384:
                                            break;
                                        case 47417:
                                            boolean zBooleanValue3 = ((Boolean) C0182.n(55567, (String) C0178.n(65464, null, new Object[]{".."), new Object[]{str})).booleanValue();
                                            int i4 = 48767;
                                            while (true) {
                                                i4 ^= 48784;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        int iIntValue = ((Integer) C0188.n(90210, str, new Object[]{Integer.valueOf(C0110.f319 ^ (-525))})).intValue();
                                                        int i5 = 48891;
                                                        while (true) {
                                                            i5 ^= 48908;
                                                            switch (i5) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 503:
                                                                    i5 = iIntValue < 0 ? 49635 : 48953;
                                                                    break;
                                                                case 32495:
                                                                    int iIntValue2 = ((Integer) C0188.n(90210, str, new Object[]{Integer.valueOf(C0051.f207 ^ (-302))})).intValue();
                                                                    int i6 = 49666;
                                                                    while (true) {
                                                                        i6 ^= 49683;
                                                                        switch (i6) {
                                                                            case 17:
                                                                                i6 = iIntValue2 < 0 ? 49759 : 49728;
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case 76:
                                                                                boolean zBooleanValue4 = ((Boolean) C0179.n(30461, str, new Object[]{(String) C0209.n(32662, null, new Object[]{".bak")})).booleanValue();
                                                                                int i7 = 49790;
                                                                                while (true) {
                                                                                    i7 ^= 49807;
                                                                                    switch (i7) {
                                                                                        case 18:
                                                                                            break;
                                                                                        case 51:
                                                                                            break;
                                                                                        case 84:
                                                                                            boolean zBooleanValue5 = ((Boolean) C0179.n(30461, str, new Object[]{(String) C0162.n(59518, null, new Object[]{".new")})).booleanValue();
                                                                                            int i8 = 49914;
                                                                                            while (true) {
                                                                                                i8 ^= 49931;
                                                                                                switch (i8) {
                                                                                                    case 497:
                                                                                                        i8 = !zBooleanValue5 ? 50658 : 50627;
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        break;
                                                                                                    case 1769:
                                                                                                        int i9 = 50689;
                                                                                                        while (true) {
                                                                                                            i9 ^= 50706;
                                                                                                            switch (i9) {
                                                                                                                case 19:
                                                                                                                    i9 = 50720;
                                                                                                                    break;
                                                                                                                case 50:
                                                                                                                    return true;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 241:
                                                                                            i7 = !zBooleanValue4 ? 49883 : 49852;
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
                                                        i4 = !zBooleanValue3 ? 48860 : 48829;
                                                        break;
                                                    default:
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
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 239:
                    break;
                default:
                    break;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0183 A[DONT_GENERATE, SYNTHETIC] */
    public static String h(String str) {
        int i;
        String str2 = (String) C0195.n(43185);
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (str != null) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0195.n(5730, str, new Object[0])).booleanValue();
                    int i3 = 1740;
                    while (true) {
                        i3 ^= 1757;
                        switch (i3) {
                            case 17:
                                if (zBooleanValue) {
                                    i3 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                try {
                                    File file = (File) C0194.n(3515, null, new Object[]{str});
                                    int i4 = 48767;
                                    while (true) {
                                        i4 ^= 48784;
                                        switch (i4) {
                                            case 14:
                                                i4 = 48829;
                                                break;
                                            case 76:
                                                boolean zBooleanValue2 = ((Boolean) C0216.n(15186, file, new Object[0])).booleanValue();
                                                int i5 = 48891;
                                                while (true) {
                                                    i5 ^= 48908;
                                                    switch (i5) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            String str3 = (String) C0149.n(92089, (String) C0194.n(7412, null, new Object[]{file}), new Object[0]);
                                                            boolean zBooleanValue3 = ((Boolean) C0195.n(5730, str3, new Object[0])).booleanValue();
                                                            int i6 = 49790;
                                                            while (true) {
                                                                i6 ^= 49807;
                                                                switch (i6) {
                                                                    case 18:
                                                                        break;
                                                                    case 51:
                                                                        boolean zBooleanValue4 = ((Boolean) C0149.n(48208, str3, new Object[]{(String) C0149.n(74485, null, new Object[]{"ENC:")})).booleanValue();
                                                                        int i7 = 50689;
                                                                        while (true) {
                                                                            i7 ^= 50706;
                                                                            switch (i7) {
                                                                                case 19:
                                                                                    if (zBooleanValue4) {
                                                                                        i7 = 50782;
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    str2 = str3;
                                                                                    break;
                                                                                case 50:
                                                                                    break;
                                                                                case 76:
                                                                                    str2 = (String) C0194.n(24188, null, new Object[]{(String) C0152.n(80045, str3, new Object[]{Integer.valueOf(C0121.f330 ^ (-545))})});
                                                                                    int i8 = 50813;
                                                                                    while (true) {
                                                                                        i8 ^= 50830;
                                                                                        switch (i8) {
                                                                                            case 18:
                                                                                                break;
                                                                                            case 243:
                                                                                                i8 = 50844;
                                                                                                continue;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            i7 = 50751;
                                                                        }
                                                                        break;
                                                                    case 84:
                                                                        int i9 = 49914;
                                                                        while (true) {
                                                                            i9 ^= 49931;
                                                                            switch (i9) {
                                                                                case 497:
                                                                                    i9 = 50596;
                                                                                    continue;
                                                                                case 1711:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 241:
                                                                        if (zBooleanValue3) {
                                                                            i6 = 49883;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                                i6 = 49852;
                                                            }
                                                            break;
                                                        case 503:
                                                            if (!zBooleanValue2) {
                                                                i5 = 49635;
                                                            }
                                                            break;
                                                        case 32495:
                                                            int i10 = 49666;
                                                            while (true) {
                                                                i10 ^= 49683;
                                                                switch (i10) {
                                                                    case 17:
                                                                        i10 = 49697;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    i5 = 48953;
                                                }
                                            case 45:
                                                break;
                                            case 239:
                                                if (file != null) {
                                                    i4 = 48860;
                                                    continue;
                                                } else {
                                                    i4 = 48829;
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i = 51588;
                                        while (true) {
                                            i ^= 51605;
                                            switch (i) {
                                                case 17:
                                                    i = 51619;
                                                    break;
                                                case 54:
                                                    break;
                                            }
                                        }
                                    }
                                    break;
                                } catch (Exception e) {
                                    i = 51588;
                                    while (true) {
                                        i ^= 51605;
                                        switch (i) {
                                            case 17:
                                                i = 51619;
                                                break;
                                            case 54:
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 500:
                                int i11 = 1864;
                                while (true) {
                                    i11 ^= 1881;
                                    switch (i11) {
                                        case 17:
                                            i11 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i3 = 1802;
                    }
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i2 = 1678;
        }
        return str2;
    }

    public static String i(String str) {
        boolean zBooleanValue = ((Boolean) C0194.n(58610, null, new Object[]{str})).booleanValue();
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
                    return (String) C0195.n(43185);
                case 239:
                    synchronized (((String) C0194.n(49569, str, new Object[0]))) {
                        try {
                            try {
                                File file = (File) C0194.n(3515, null, new Object[]{str});
                                int i2 = 1740;
                                while (true) {
                                    i2 ^= 1757;
                                    switch (i2) {
                                        case 17:
                                            if (file == null) {
                                                i2 = 1833;
                                            }
                                            break;
                                        case 54:
                                            break;
                                        case 471:
                                            String str2 = (String) C0149.n(92089, new String((byte[]) C0194.n(57107, new AtomicFile(file), new Object[0]), (Charset) C0182.n(4193)), new Object[0]);
                                            boolean zBooleanValue2 = ((Boolean) C0149.n(48208, str2, new Object[]{(String) C0162.n(13243, null, new Object[]{"ENC:")})).booleanValue();
                                            int i3 = 48767;
                                            while (true) {
                                                i3 ^= 48784;
                                                switch (i3) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        str2 = (String) C0194.n(24188, null, new Object[]{(String) C0152.n(80045, str2, new Object[]{Integer.valueOf(C0077.f286 ^ (-408))})});
                                                        break;
                                                    case 239:
                                                        i3 = zBooleanValue2 ? 48860 : 48829;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            return str2;
                                        case 500:
                                            return (String) C0195.n(43185);
                                        default:
                                            continue;
                                    }
                                    i2 = 1802;
                                }
                            } catch (Exception e) {
                                return (String) C0195.n(43185);
                            }
                        } catch (Throwable th) {
                            int i4 = 1864;
                            while (true) {
                                i4 ^= 1881;
                                switch (i4) {
                                    case 17:
                                        i4 = 48674;
                                        break;
                                    case 47483:
                                        throw th;
                                }
                            }
                        }
                    }
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static void j(String str, String str2) {
        String str3;
        String str4;
        String str5 = (String) C0162.n(95122, null, new Object[]{"ENC:");
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (str != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    boolean zBooleanValue = ((Boolean) C0195.n(5730, str, new Object[0])).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (zBooleanValue) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                try {
                                    File file = (File) C0194.n(3515, null, new Object[]{str});
                                    int i3 = 48767;
                                    while (true) {
                                        i3 ^= 48784;
                                        switch (i3) {
                                            case 14:
                                                break;
                                            case 45:
                                                int i4 = 48891;
                                                while (true) {
                                                    i4 ^= 48908;
                                                    switch (i4) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            str3 = (String) C0195.n(43185);
                                                            break;
                                                        case 503:
                                                            i4 = str2 != null ? 49635 : 48953;
                                                            break;
                                                        case 32495:
                                                            boolean zBooleanValue2 = ((Boolean) C0195.n(5730, str2, new Object[0])).booleanValue();
                                                            int i5 = 49666;
                                                            while (true) {
                                                                i5 ^= 49683;
                                                                switch (i5) {
                                                                    case 17:
                                                                        i5 = zBooleanValue2 ? 49759 : 49728;
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    case 76:
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
                                                                            str3 = (String) C0195.n(43185);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 83:
                                                                        String str6 = (String) C0194.n(81610, null, new Object[]{str2});
                                                                        int i7 = 49914;
                                                                        while (true) {
                                                                            i7 ^= 49931;
                                                                            switch (i7) {
                                                                                case 497:
                                                                                    i7 = 50596;
                                                                                    continue;
                                                                                case 1711:
                                                                                    str3 = str6;
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
                                                        default:
                                                            break;
                                                    }
                                                }
                                                boolean zBooleanValue3 = ((Boolean) C0195.n(5730, str3, new Object[0])).booleanValue();
                                                int i8 = 50689;
                                                while (true) {
                                                    i8 ^= 50706;
                                                    switch (i8) {
                                                        case 19:
                                                            i8 = zBooleanValue3 ? 50782 : 50751;
                                                            break;
                                                        case 45:
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
                                                                    case 53:
                                                                        break;
                                                                    case 243:
                                                                        i9 = str2 != null ? 51557 : 50875;
                                                                        break;
                                                                    case 4075:
                                                                        boolean zBooleanValue4 = ((Boolean) C0195.n(5730, str2, new Object[0])).booleanValue();
                                                                        int i10 = 51588;
                                                                        while (true) {
                                                                            i10 ^= 51605;
                                                                            switch (i10) {
                                                                                case 17:
                                                                                    i10 = !zBooleanValue4 ? 51681 : 51650;
                                                                                    break;
                                                                                case 54:
                                                                                    break;
                                                                                case 87:
                                                                                    break;
                                                                                case 116:
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
                                                        default:
                                                            break;
                                                    }
                                                }
                                                boolean zBooleanValue5 = ((Boolean) C0195.n(5730, str3, new Object[0])).booleanValue();
                                                int i11 = 51712;
                                                while (true) {
                                                    i11 ^= 51729;
                                                    switch (i11) {
                                                        case 14:
                                                            break;
                                                        case 17:
                                                            i11 = zBooleanValue5 ? 51805 : 51774;
                                                            break;
                                                        case 47:
                                                            str4 = (String) C0198.n(26710, str5, new Object[]{str3});
                                                            break;
                                                        case 76:
                                                            String str7 = (String) C0195.n(43185);
                                                            int i12 = 51836;
                                                            while (true) {
                                                                i12 ^= 51853;
                                                                switch (i12) {
                                                                    case 241:
                                                                        i12 = 52518;
                                                                        continue;
                                                                    case 1963:
                                                                        str4 = str7;
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
                                                synchronized (((String) C0194.n(49569, str, new Object[0]))) {
                                                    try {
                                                        C0194.n(44212, null, new Object[]{file, str4});
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                    break;
                                                }
                                                int i13 = 52611;
                                                while (true) {
                                                    i13 ^= 52628;
                                                    switch (i13) {
                                                        case 23:
                                                            i13 = 52642;
                                                            break;
                                                        case 54:
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 76:
                                                break;
                                            case 239:
                                                i3 = file == null ? 48860 : 48829;
                                                break;
                                            default:
                                                break;
                                        }
                                        return;
                                    }
                                } catch (Exception e) {
                                    int i14 = 52735;
                                    while (true) {
                                        i14 ^= 52752;
                                        switch (i14) {
                                            case 14:
                                                return;
                                            case 1007:
                                                i14 = 52766;
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 500:
                                int i15 = 1864;
                                while (true) {
                                    i15 ^= 1881;
                                    switch (i15) {
                                        case 17:
                                            i15 = 48674;
                                            break;
                                        case 47483:
                                            return;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x012b -> B:69:0x012d). Please report as a decompilation issue!!! */
    public static boolean k(String str, String str2) {
        ?? r0;
        ?? r2;
        String str3;
        String str4;
        FileOutputStream fileOutputStream;
        ?? r4 = 0;
        String str5 = (String) C0182.n(7909, null, new Object[]{"ENC:");
        boolean zBooleanValue = ((Boolean) C0194.n(58610, null, new Object[]{str})).booleanValue();
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
                    return false;
                case 239:
                    synchronized (((String) C0194.n(49569, str, new Object[0]))) {
                        try {
                            try {
                                File file = (File) C0194.n(3515, null, new Object[]{str});
                                int i2 = 1740;
                                while (true) {
                                    i2 ^= 1757;
                                    switch (i2) {
                                        case 17:
                                            i2 = file == null ? 1833 : 1802;
                                            break;
                                        case 54:
                                            break;
                                        case 471:
                                            int i3 = 48767;
                                            while (true) {
                                                i3 ^= 48784;
                                                switch (i3) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        str3 = (String) C0195.n(43185);
                                                        break;
                                                    case 76:
                                                        boolean zBooleanValue2 = ((Boolean) C0195.n(5730, str2, new Object[0])).booleanValue();
                                                        int i4 = 48891;
                                                        while (true) {
                                                            i4 ^= 48908;
                                                            switch (i4) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    String str6 = (String) C0194.n(81610, null, new Object[]{str2});
                                                                    int i5 = 49790;
                                                                    while (true) {
                                                                        i5 ^= 49807;
                                                                        switch (i5) {
                                                                            case 18:
                                                                                str3 = str6;
                                                                                break;
                                                                            case 241:
                                                                                i5 = 49821;
                                                                                continue;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 503:
                                                                    i4 = zBooleanValue2 ? 49635 : 48953;
                                                                    break;
                                                                case 32495:
                                                                    int i6 = 49666;
                                                                    while (true) {
                                                                        i6 ^= 49683;
                                                                        switch (i6) {
                                                                            case 17:
                                                                                i6 = 49697;
                                                                                continue;
                                                                            case 50:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        str3 = (String) C0195.n(43185);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        i3 = str2 != null ? 48860 : 48829;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            boolean zBooleanValue3 = ((Boolean) C0195.n(5730, str3, new Object[0])).booleanValue();
                                            int i7 = 50689;
                                            while (true) {
                                                i7 ^= 50706;
                                                switch (i7) {
                                                    case 19:
                                                        i7 = zBooleanValue3 ? 50782 : 50751;
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 50:
                                                        break;
                                                    case 76:
                                                        int i8 = 50813;
                                                        while (true) {
                                                            i8 ^= 50830;
                                                            switch (i8) {
                                                                case 18:
                                                                    break;
                                                                case 53:
                                                                    break;
                                                                case 243:
                                                                    i8 = str2 != null ? 51557 : 50875;
                                                                    break;
                                                                case 4075:
                                                                    boolean zBooleanValue4 = ((Boolean) C0195.n(5730, str2, new Object[0])).booleanValue();
                                                                    int i9 = 51588;
                                                                    while (true) {
                                                                        i9 ^= 51605;
                                                                        switch (i9) {
                                                                            case 17:
                                                                                i9 = !zBooleanValue4 ? 51681 : 51650;
                                                                                break;
                                                                            case 54:
                                                                                break;
                                                                            case 87:
                                                                                break;
                                                                            case 116:
                                                                                return false;
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
                                                    default:
                                                        break;
                                                }
                                            }
                                            boolean zBooleanValue5 = ((Boolean) C0195.n(5730, str3, new Object[0])).booleanValue();
                                            int i10 = 51712;
                                            while (true) {
                                                i10 ^= 51729;
                                                switch (i10) {
                                                    case 14:
                                                        break;
                                                    case 17:
                                                        i10 = zBooleanValue5 ? 51805 : 51774;
                                                        break;
                                                    case 47:
                                                        str4 = (String) C0198.n(26710, str5, new Object[]{str3});
                                                        break;
                                                    case 76:
                                                        String str7 = (String) C0195.n(43185);
                                                        int i11 = 51836;
                                                        while (true) {
                                                            i11 ^= 51853;
                                                            switch (i11) {
                                                                case 241:
                                                                    i11 = 52518;
                                                                    continue;
                                                                case 1963:
                                                                    str4 = str7;
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
                                            byte[] bArr = (byte[]) C0182.n(67839, str4, new Object[]{(Charset) C0182.n(4193)});
                                            boolean zBooleanValue6 = ((Boolean) C0216.n(15186, file, new Object[0])).booleanValue();
                                            int i12 = 52611;
                                            while (true) {
                                                i12 ^= 52628;
                                                switch (i12) {
                                                    case 23:
                                                        i12 = zBooleanValue6 ? 52704 : 52673;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 85:
                                                        break;
                                                    case 116:
                                                        boolean zBooleanValue7 = ((Boolean) C0151.n(1675, file, new Object[0])).booleanValue();
                                                        int i13 = 52735;
                                                        while (true) {
                                                            i13 ^= 52752;
                                                            switch (i13) {
                                                                case 14:
                                                                    break;
                                                                case 45:
                                                                    break;
                                                                case 1007:
                                                                    i13 = !zBooleanValue7 ? 53479 : 52797;
                                                                    break;
                                                                case 7927:
                                                                    return false;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            boolean zBooleanValue8 = ((Boolean) C0216.n(15186, file, new Object[0])).booleanValue();
                                            int i14 = 53510;
                                            while (true) {
                                                i14 ^= 53527;
                                                switch (i14) {
                                                    case 17:
                                                        i14 = !zBooleanValue8 ? 53603 : 53572;
                                                        break;
                                                    case 50:
                                                        break;
                                                    case 83:
                                                        break;
                                                    case 116:
                                                        boolean zBooleanValue9 = ((Boolean) C0219.n(97248, file, new Object[0])).booleanValue();
                                                        int i15 = 53634;
                                                        while (true) {
                                                            i15 ^= 53651;
                                                            switch (i15) {
                                                                case 17:
                                                                    i15 = !zBooleanValue9 ? 53727 : 53696;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                                case 76:
                                                                    return false;
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
                                            AtomicFile atomicFile = new AtomicFile(file);
                                            try {
                                                fileOutputStream = (FileOutputStream) C0194.n(34230, atomicFile, new Object[0]);
                                                try {
                                                    C0221.n(25273, fileOutputStream, new Object[]{bArr});
                                                    C0221.n(12937, (FileDescriptor) C0221.n(72415, fileOutputStream, new Object[0]), new Object[0]);
                                                    C0194.n(49107, atomicFile, new Object[]{fileOutputStream});
                                                    return ((Boolean) C0194.n(21679, null, new Object[]{bArr, (byte[]) C0194.n(57107, atomicFile, new Object[0])})).booleanValue();
                                                } catch (Exception e) {
                                                    int i16 = 54533;
                                                    while (true) {
                                                        i16 ^= 54550;
                                                        switch (i16) {
                                                            case 19:
                                                                i16 = 54564;
                                                                continue;
                                                            case 50:
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        int i17 = 53758;
                                                        while (true) {
                                                            i17 ^= 53775;
                                                            switch (i17) {
                                                                case 1009:
                                                                    i17 = 54440;
                                                                    continue;
                                                                case 1703:
                                                                    r0 = atomicFile;
                                                                    r2 = fileOutputStream;
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            int i18 = 54657;
                                                            while (true) {
                                                                r4 = 54674;
                                                                i18 ^= 54674;
                                                                switch (i18) {
                                                                    case 19:
                                                                        i18 = r0 != 0 ? 55401 : 54719;
                                                                        break;
                                                                    case 45:
                                                                        break;
                                                                    case 50:
                                                                        break;
                                                                    case 3579:
                                                                        int i19 = 55432;
                                                                        while (true) {
                                                                            i19 ^= 55449;
                                                                            switch (i19) {
                                                                                case 17:
                                                                                    i19 = r2 != 0 ? 55525 : 55494;
                                                                                    break;
                                                                                case 62:
                                                                                    break;
                                                                                case 95:
                                                                                    break;
                                                                                case 124:
                                                                                    try {
                                                                                        C0194.n(22028, r0, new Object[]{r2});
                                                                                        break;
                                                                                    } catch (Exception e2) {
                                                                                        int i20 = 56455;
                                                                                        while (true) {
                                                                                            i20 ^= 56472;
                                                                                            switch (i20) {
                                                                                                case 31:
                                                                                                    i20 = 56486;
                                                                                                    continue;
                                                                                                case 62:
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                    }
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
                                                            return false;
                                                        }
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                fileOutputStream = null;
                                            }
                                            break;
                                        case 500:
                                            return false;
                                        default:
                                            break;
                                    }
                                }
                            } catch (Exception e4) {
                                int i21 = 49914;
                                while (true) {
                                    i21 ^= 49931;
                                    switch (i21) {
                                        case 497:
                                            i21 = 50596;
                                            continue;
                                        case 1711:
                                            r0 = r4;
                                            r2 = r4;
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            int i22 = 1864;
                            while (true) {
                                i22 ^= 1881;
                                switch (i22) {
                                    case 17:
                                        i22 = 48674;
                                        break;
                                    case 47483:
                                        int i23 = 55556;
                                        while (true) {
                                            i23 ^= 55573;
                                            switch (i23) {
                                                case 17:
                                                    i23 = 55587;
                                                    break;
                                                case 54:
                                                    int i24 = 55680;
                                                    while (true) {
                                                        i24 ^= 55697;
                                                        switch (i24) {
                                                            case 17:
                                                                i24 = 56362;
                                                                break;
                                                            case 1467:
                                                                throw th;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
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
