package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.A.InterfaceC0306w1;
import com.github.catvod.spider.merge.p007h.C0083;
import com.github.catvod.spider.merge.p019w.C0134;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0168;
import moyu.fucking.C0183;
import moyu.fucking.C0195;
import moyu.fucking.C0203;
import moyu.fucking.C0221;
import moyu.fucking.C0224;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class U0 implements InterfaceC0306w1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f224short = {17544, 32268, 32187, 25426, 17816, 21712, 22901, -25295, 29499, -32527, 25920, 32579, 26940, 24676, 22199, 22685, 28081, 2530, 2528, 2551, 2538, 2540, 2541, 2524, 2551, 2554, 2547, 2534, 2016, 2031, 2026, 2019, 2026, 2031, 2037, 2034, 452, 473, 450, 461, 468, 453, 452, 510, 455, 456, 453, 466, 553, 550, 547, 554, 608, 555, 554, 547, 554, 571, 554};
    public final String a;
    public final long b;
    public final String c;
    public final Set d;
    public final Z0 e;

    public U0(Z0 z0, String str, long j, String str2, HashSet hashSet) throws Throwable {
        this.e = z0;
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = hashSet;
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
                    C0168.n(61614, (PrintStream) C0195.n(72538), new Object[]{(String) C0221.n(97632, null, new Object[]{(String) C0183.n(13044)})});
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
        String str = (String) C0183.n(12298, this);
        long jLongValue = ((Long) C0183.n(82843, this)).longValue();
        Z0 z0 = (Z0) C0183.n(15368, this);
        boolean zBooleanValue = ((Boolean) C0183.n(89259, z0, new Object[]{Long.valueOf(jLongValue), str})).booleanValue();
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
                    Set set = (Set) C0183.n(87244, z0, new Object[]{(String) C0183.n(42066, this)});
                    boolean zBooleanValue2 = ((Boolean) C0183.n(42031, null, new Object[]{(Set) C0183.n(85644, this), (Set) C0203.n(41319, (HashMap) C0183.n(6536, z0), new Object[0])})).booleanValue();
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
                                throw new Exception((String) C0224.n(58480, null, new Object[]{(short[]) C0183.n(93914), 0, Integer.valueOf(C0083.f292 ^ (-199)), 2901}));
                            case 500:
                                return new ArrayList(set);
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    throw new Exception((String) C0149.n(74485, null, new Object[]{(short[]) C0183.n(93914), 10, Integer.valueOf(C0134.f343 ^ (-248)), 2885}));
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0108 */
    /* JADX WARN: Code duplicated, block: B:456:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x0350 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:127:0x0381. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:133:0x04d7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:148:0x0560. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:157:0x05fa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:88:0x02aa. Please report as an issue. */
    @Override // com.github.catvod.spider.merge.A.InterfaceC0306w1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.util.ArrayList r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p000a.U0.b(java.util.ArrayList):boolean");
    }
}
