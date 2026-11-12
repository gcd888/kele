package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.D.C0007;
import com.github.catvod.spider.merge.G.C0020;
import com.github.catvod.spider.merge.G.C0024;
import com.github.catvod.spider.merge.Q.C0040;
import com.github.catvod.spider.merge.Q.C0041;
import com.github.catvod.spider.merge.e0.C0075;
import com.github.catvod.spider.merge.p0.C0110;
import com.github.catvod.spider.merge.p001b.C0058;
import com.github.catvod.spider.merge.p007h.C0084;
import com.github.catvod.spider.merge.p009k.a;
import com.github.catvod.spider.merge.p009k.d;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0155;
import moyu.fucking.C0156;
import moyu.fucking.C0157;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0173;
import moyu.fucking.C0175;
import moyu.fucking.C0178;
import moyu.fucking.C0182;
import moyu.fucking.C0185;
import moyu.fucking.C0188;
import moyu.fucking.C0189;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0200;
import moyu.fucking.C0203;
import moyu.fucking.C0218;
import moyu.fucking.C0219;
import moyu.fucking.C0221;
import moyu.fucking.C0224;
import moyu.fucking.C0226;
import moyu.fucking.C0231;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0379t0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f257short = {685, 864, 892, 892, 888, 891, 818, 807, 807, 888, 873, 870, 806, 889, 893, 873, 890, 867, 806, 875, 870, 807, 873, 875, 875, 871, 893, 870, 892, 807, 865, 870, 878, 871, 823, 891, 892, 821, 2068, 2142, 2117, 2063, 2113, 2129, 2131, 2140, 2081, 2051, 2051, 2053, 2064, 2068, 1937, 1920, 1920, 1948, 1945, 1939, 1937, 1924, 1945, 1951, 1950, 2015, 1946, 1923, 1951, 1950, 2012, 2000, 1924, 1941, 1928, 1924, 2015, 1920, 1948, 1937, 1945, 1950, 2012, 2000, 2010, 2015, 2010, 2957, 3002, 3001, 3002, 2989, 3002, 2989, 1809, 1805, 1805, 1801, 1802, 1859, 1878, 1878, 1801, 1816, 1815, 1879, 1800, 1804, 1816, 1803, 1810, 1879, 1818, 1815, 1878, 2865, 2855, 2870, 2927, 2849, 2861, 2861, 2857, 2859, 2855, 914, 918, 898, 913, 904};
    public final int a;
    public final A0 b;
    public final String c;

    public /* synthetic */ RunnableC0379t0(A0 a0, String str, int i) throws Throwable {
        this.a = i;
        this.b = a0;
        this.c = str;
        int iIntValue = ((Integer) C0168.n(31307, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0149.n(54590, null, new Object[]{(String) C0226.n(66906, null, new Object[]{(String) C0156.n(19039)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0400. Please report as an issue. */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str = (String) C0156.n(79834, this);
        A0 a0 = (A0) C0156.n(11932, this);
        switch (((Integer) C0156.n(64051, this)).intValue()) {
            case 0:
                ((Integer) C0175.n(46748)).intValue();
                C0200.n(44794, a0, new Object[]{str});
                break;
            case 1:
                ((Integer) C0175.n(46748)).intValue();
                C0200.n(44794, a0, new Object[]{str});
                break;
            case 2:
                ((Integer) C0175.n(46748)).intValue();
                String str2 = (String) C0195.n(85847, null, new Object[]{(short[]) C0156.n(10168), 0, 1, 662});
                try {
                    StringBuilder sb = new StringBuilder((String) C0157.n(97123, null, new Object[]{(short[]) C0156.n(10168), 1, Integer.valueOf(C0110.f319 ^ (-519)), 776}));
                    String str3 = (String) C0198.n(89992, sb, new Object[0]);
                    HashMap map = new HashMap();
                    C0155.n(50765, map, new Object[]{(String) C0162.n(89013, null, new Object[]{(short[]) C0156.n(10168), 46, Integer.valueOf(C0020.f176 ^ (-561)), 2144}), (String) C0178.n(65464, null, new Object[]{(short[]) C0156.n(10168), 52, Integer.valueOf(C0041.f197 ^ (-7)), 2032})});
                    C0155.n(50765, map, new Object[]{(String) C0162.n(68576, null, new Object[]{(short[]) C0156.n(10168), 85, Integer.valueOf(C0075.f284 ^ 773), 3039}), (String) C0157.n(78385, null, new Object[]{(short[]) C0156.n(10168), 92, Integer.valueOf(C0058.f267 ^ 114), 1913})});
                    Response response = (Response) C0173.n(18516, null, new Object[]{str3, map});
                    List list = (List) C0156.n(26313, response, new Object[]{(String) C0198.n(74142, null, new Object[]{(short[]) C0156.n(10168), 113, Integer.valueOf(C0020.f176 ^ (-573)), 2882})});
                    boolean zBooleanValue = ((Boolean) C0219.n(37451, list, new Object[0])).booleanValue();
                    int i = 48767;
                    while (true) {
                        i ^= 48784;
                        switch (i) {
                            case 14:
                                break;
                            case 45:
                                StringBuilder sb2 = new StringBuilder();
                                Iterator it = (Iterator) C0221.n(11992, list, new Object[0]);
                                while (true) {
                                    boolean zBooleanValue2 = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
                                    int i2 = 49666;
                                    while (true) {
                                        i2 ^= 49683;
                                        switch (i2) {
                                            case 17:
                                                i2 = zBooleanValue2 ? 49759 : 49728;
                                                break;
                                            case 50:
                                                break;
                                            case 76:
                                                break;
                                            case 83:
                                                break;
                                            default:
                                                break;
                                        }
                                        String str4 = (String) C0198.n(89992, sb2, new Object[0]);
                                        C0188.n(37526, response, new Object[0]);
                                        boolean zBooleanValue3 = ((Boolean) C0189.n(62984, null, new Object[]{new CharSequence[]{str4}})).booleanValue();
                                        int i3 = 50689;
                                        while (true) {
                                            i3 ^= 50706;
                                            switch (i3) {
                                                case 19:
                                                    if (zBooleanValue3) {
                                                        i3 = 50782;
                                                    }
                                                    break;
                                                case 45:
                                                    C0152.n(52927, null, new Object[]{new RunnableC0351f(C0040.f196 ^ (-325))});
                                                    break;
                                                case 50:
                                                    break;
                                                case 76:
                                                    C0200.n(76820, a0, new Object[]{str4});
                                                    C0218.n(64823, null, new Object[]{(String) C0162.n(89013, null, new Object[]{(short[]) C0156.n(10168), 123, Integer.valueOf(C0084.f293 ^ (-391)), 995})});
                                                    boolean zBooleanValue4 = ((Boolean) C0203.n(70525, (d) C0203.n(18541, (a) C0203.n(21419, null, new Object[0]), new Object[0]), new Object[0])).booleanValue();
                                                    C0231.n(50374, null, new Object[0]);
                                                    C0152.n(52927, null, new Object[]{new RunnableC0383v0(0, zBooleanValue4)});
                                                    int i4 = 50813;
                                                    while (true) {
                                                        i4 ^= 50830;
                                                        switch (i4) {
                                                            case 18:
                                                                break;
                                                            case 243:
                                                                i4 = 50844;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i3 = 50751;
                                        }
                                    }
                                    String str5 = ((String[]) C0224.n(71204, (String) C0221.n(87284, it, new Object[0]), new Object[]{str2}))[0];
                                    int iIntValue = ((Integer) C0162.n(73207, sb2, new Object[0])).intValue();
                                    int i5 = 49790;
                                    while (true) {
                                        i5 ^= 49807;
                                        switch (i5) {
                                            case 18:
                                                break;
                                            case 51:
                                                break;
                                            case 84:
                                                break;
                                            case 241:
                                                i5 = iIntValue > 0 ? 49883 : 49852;
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    int i6 = 49914;
                                    while (true) {
                                        i6 ^= 49931;
                                        switch (i6) {
                                            case 497:
                                                i6 = 50596;
                                                break;
                                            case 1711:
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 76:
                                C0152.n(52927, null, new Object[]{new RunnableC0351f(C0007.f163 ^ 160)});
                                C0188.n(37526, response, new Object[0]);
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
                                break;
                            case 239:
                                if (zBooleanValue) {
                                    i = 48860;
                                }
                                break;
                            default:
                                continue;
                        }
                        i = 48829;
                    }
                } catch (Exception e) {
                    int i8 = 51588;
                    while (true) {
                        i8 ^= 51605;
                        switch (i8) {
                            case 17:
                                i8 = 51619;
                                break;
                            case 54:
                                return;
                        }
                    }
                }
                break;
            default:
                ((Integer) C0175.n(46748)).intValue();
                String str6 = (String) C0189.n(4927, null, new Object[]{(String) C0189.n(89326, a0, new Object[0])});
                String str7 = (String) C0189.n(4927, null, new Object[]{str});
                boolean zBooleanValue5 = ((Boolean) C0195.n(41159, null, new Object[]{str6})).booleanValue();
                int i9 = 1616;
                while (true) {
                    i9 ^= 1633;
                    switch (i9) {
                        case 14:
                            break;
                        case 49:
                            if (!zBooleanValue5) {
                                i9 = 1709;
                            }
                            break;
                        case 204:
                            boolean zBooleanValue6 = ((Boolean) C0195.n(41159, null, new Object[]{str7})).booleanValue();
                            int i10 = 1740;
                            while (true) {
                                i10 ^= 1757;
                                switch (i10) {
                                    case 17:
                                        if (!zBooleanValue6) {
                                            i10 = 1833;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 471:
                                        break;
                                    case 500:
                                        boolean zBooleanValue7 = ((Boolean) C0182.n(55567, str6, new Object[]{str7})).booleanValue();
                                        int i11 = 1864;
                                        while (true) {
                                            i11 ^= 1881;
                                            switch (i11) {
                                                case 17:
                                                    if (!zBooleanValue7) {
                                                        i11 = 48736;
                                                    }
                                                    break;
                                                case 47384:
                                                    break;
                                                case 47417:
                                                    ((Long) C0203.n(41248, (AtomicLong) C0175.n(79952, a0), new Object[0])).longValue();
                                                    C0185.n(52935, (ConcurrentHashMap) C0203.n(39681, a0), new Object[0]);
                                                    C0185.n(52935, (ConcurrentHashMap) C0189.n(16276, a0), new Object[0]);
                                                    C0185.n(52935, (ConcurrentHashMap) C0175.n(72974, a0), new Object[0]);
                                                    C0185.n(21601, (Set) C0200.n(72137, a0), new Object[0]);
                                                    C0200.n(89155, (HashMap) C0189.n(97139, a0), new Object[0]);
                                                    a0.k = 0L;
                                                    C0203.n(64059, a0, new Object[]{Long.valueOf(560 ^ ((long) C0024.f180)), null});
                                                    a0.e = null;
                                                    C0156.n(13763, (a) C0203.n(21419, null, new Object[0]), new Object[0]);
                                                    break;
                                                case 47483:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i11 = 48705;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i10 = 1802;
                            }
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i9 = 1678;
                }
                C0200.n(44794, a0, new Object[]{str});
                break;
        }
    }
}
