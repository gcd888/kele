package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.A.InterfaceC0306w1;
import com.github.catvod.spider.merge.b0.C0060;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import moyu.fucking.C0167;
import moyu.fucking.C0175;
import moyu.fucking.C0178;
import moyu.fucking.C0182;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0212;
import moyu.fucking.C0219;
import moyu.fucking.C0221;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class C0350e0 implements InterfaceC0306w1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f235short = {596, 596, 592, 27744, 30307, 32095, 24180, 23017, 26385, 23950, 29442};
    public final Set a;
    public final String b;
    public final String c;
    public final long d;
    public final Map e;
    public final C0364l0 f;

    public C0350e0(C0364l0 c0364l0, HashSet hashSet, String str, String str2, long j, HashMap map) throws Throwable {
        this.f = c0364l0;
        this.a = hashSet;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = map;
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0178.n(16623, null, new Object[]{(String) C0221.n(83422, null, new Object[]{(String) C0212.n(15829)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0306w1
    public final List a() throws Exception {
        Set set = (Set) C0212.n(16318, this);
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (set != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    return new ArrayList(set);
                case 239:
                    throw new Exception((String) C0198.n(51837, null, new Object[]{(short[]) C0212.n(46289), 0, Integer.valueOf(C0060.f269 ^ (-971)), 613}));
                default:
                    continue;
            }
            i = 1678;
        }
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0306w1
    public final boolean b(ArrayList arrayList) throws Throwable {
        synchronized (C0212.n(2223, (C0364l0) C0212.n(21866, this))) {
            try {
                boolean zBooleanValue = ((Boolean) C0182.n(55567, (String) C0212.n(45525, this), new Object[]{(String) C0212.n(80648, (C0364l0) C0212.n(21866, this))})).booleanValue();
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            if (zBooleanValue) {
                                i = 1709;
                            }
                            break;
                        case 204:
                            boolean zBooleanValue2 = ((Boolean) C0182.n(55567, (String) C0167.n(14858, this), new Object[]{(String) C0167.n(48078, (C0364l0) C0212.n(21866, this))})).booleanValue();
                            int i2 = 1740;
                            while (true) {
                                i2 ^= 1757;
                                switch (i2) {
                                    case 17:
                                        if (zBooleanValue2) {
                                            i2 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case 500:
                                        long jLongValue = ((Long) C0167.n(31431, this)).longValue();
                                        long jLongValue2 = ((Long) C0175.n(72334, (AtomicLong) C0167.n(31910, (C0364l0) C0212.n(21866, this)), new Object[0])).longValue();
                                        int i3 = 1864;
                                        while (true) {
                                            i3 ^= 1881;
                                            switch (i3) {
                                                case 17:
                                                    if (jLongValue != jLongValue2) {
                                                        i3 = 48736;
                                                    }
                                                    break;
                                                case 47384:
                                                    C0167.n(87135, (C0364l0) C0212.n(21866, this), new Object[]{(String) C0212.n(45525, this), (Map) C0167.n(51854, this), arrayList});
                                                    return true;
                                                case 47417:
                                                    int i4 = 48767;
                                                    while (true) {
                                                        i4 ^= 48784;
                                                        switch (i4) {
                                                            case 14:
                                                                break;
                                                            case 239:
                                                                i4 = 48798;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i3 = 48705;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i2 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i = 1678;
                }
                return false;
            } catch (Throwable th) {
                int i5 = 48891;
                while (true) {
                    i5 ^= 48908;
                    switch (i5) {
                        case 22:
                            throw th;
                        case 503:
                            i5 = 48922;
                            break;
                    }
                }
            }
        }
    }
}
