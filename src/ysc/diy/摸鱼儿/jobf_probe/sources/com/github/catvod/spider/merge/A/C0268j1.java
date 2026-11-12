package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.c0.C0065;
import com.github.catvod.spider.merge.p018v.C0131;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import moyu.fucking.C0149;
import moyu.fucking.C0162;
import moyu.fucking.C0163;
import moyu.fucking.C0181;
import moyu.fucking.C0195;
import moyu.fucking.C0216;
import moyu.fucking.C0219;
import moyu.fucking.C0221;
import moyu.fucking.C0224;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0268j1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f141short = {2082, 2083, 2097, 2138, 2127, 21712, 21548, 24782, 19391, 21683, -28592, -1453};

    public C0268j1() throws Throwable {
        int iIntValue = ((Integer) C0219.n(61875, null, new Object[0])).intValue();
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
                    C0162.n(83524, (PrintStream) C0195.n(72538), new Object[]{Long.valueOf(((Long) C0162.n(73560, null, new Object[]{(String) C0181.n(74690, null, new Object[]{(String) C0219.n(87457)})})).longValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002e. Please report as an issue. */
    public static String a(File file) {
        String str = (String) C0195.n(43185);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int iIntValue = ((Integer) C0219.n(82234, fileInputStream, new Object[]{bArr})).intValue();
                    int i = 1616;
                    while (true) {
                        i ^= 1633;
                        switch (i) {
                            case 14:
                                break;
                            case 49:
                                i = iIntValue != -1 ? 1709 : 1678;
                                break;
                            case 204:
                                break;
                            case 239:
                                break;
                            default:
                                break;
                        }
                        C0216.n(17963, fileInputStream, new Object[0]);
                        return (String) C0219.n(78682, byteArrayOutputStream, new Object[]{(String) C0224.n(31189, null, new Object[]{(short[]) C0219.n(90476), 0, Integer.valueOf(C0131.f340 ^ 729), 2167})});
                    }
                    C0163.n(45931, byteArrayOutputStream, new Object[]{bArr, 0, Integer.valueOf(iIntValue)});
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = 1771;
                                break;
                            case 54:
                                break;
                        }
                    }
                }
            } catch (IOException e) {
                int i3 = 1864;
                while (true) {
                    i3 ^= 1881;
                    switch (i3) {
                        case 17:
                            i3 = 48674;
                            break;
                        case 47483:
                            return str;
                    }
                }
            }
        } catch (Exception e2) {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0053. Please report as an issue. */
    public static void b(File file, String str) throws Throwable {
        int i;
        byte[] bArr = (byte[]) C0219.n(63061, str, new Object[0]);
        try {
            try {
                boolean zBooleanValue = ((Boolean) C0216.n(15186, file, new Object[0])).booleanValue();
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
                            ((Boolean) C0219.n(97248, file, new Object[0])).booleanValue();
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                }
                boolean zBooleanValue2 = ((Boolean) C0219.n(63536, file, new Object[0])).booleanValue();
                int i3 = 1740;
                while (true) {
                    i3 ^= 1757;
                    switch (i3) {
                        case 17:
                            i3 = !zBooleanValue2 ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case 500:
                            ((Boolean) C0219.n(14300, file, new Object[]{true})).booleanValue();
                            break;
                        default:
                            break;
                    }
                }
                while (true) {
                    i ^= 1881;
                    switch (i) {
                        case 17:
                            i = 48674;
                            break;
                        case 47483:
                            return;
                    }
                }
            } catch (Exception e) {
                int i4 = 48767;
                while (true) {
                    i4 ^= 48784;
                    switch (i4) {
                        case 14:
                            break;
                        case 239:
                            i4 = 48798;
                            continue;
                        default:
                            continue;
                    }
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            C0221.n(25273, fileOutputStream, new Object[]{bArr});
            C0221.n(67290, fileOutputStream, new Object[0]);
            C0221.n(12937, (FileDescriptor) C0221.n(72415, fileOutputStream, new Object[0]), new Object[0]);
            C0221.n(70313, fileOutputStream, new Object[0]);
            i = 1864;
        } catch (Exception e2) {
            C0219.n(8575, null, new Object[]{e2, new StringBuilder((String) C0149.n(61324, null, new Object[]{(short[]) C0219.n(90476), 5, Integer.valueOf(C0065.f274 ^ 20), 1353}))});
        }
    }
}
