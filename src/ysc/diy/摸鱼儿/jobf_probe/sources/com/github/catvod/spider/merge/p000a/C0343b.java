package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.A.InterfaceC0306w1;
import com.github.catvod.spider.merge.L.C0033;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.f0.C0080;
import com.github.catvod.spider.merge.k0.C0100;
import com.github.catvod.spider.merge.p003d.l;
import com.github.catvod.spider.merge.p003d.m;
import com.github.catvod.spider.merge.p007h.C0083;
import com.github.catvod.spider.merge.p017u.C0127;
import com.github.catvod.spider.merge.p017u.C0129;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import moyu.fucking.C0147;
import moyu.fucking.C0149;
import moyu.fucking.C0150;
import moyu.fucking.C0153;
import moyu.fucking.C0154;
import moyu.fucking.C0157;
import moyu.fucking.C0159;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0177;
import moyu.fucking.C0178;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0186;
import moyu.fucking.C0188;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0203;
import moyu.fucking.C0209;
import moyu.fucking.C0212;
import moyu.fucking.C0216;
import moyu.fucking.C0221;
import moyu.fucking.C0224;
import moyu.fucking.C0226;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class C0343b implements InterfaceC0306w1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f228short = {2296, 2261, 2256, 2201, 2249, 2261, 2264, 2240, 2267, 2264, 2266, 2258, 2201, 2267, 2264, 2253, 2266, 2257, 2201, 2266, 2257, 2264, 2263, 2270, 2268, 2269, 3181, 3124, 3172, 3187, 3175, 3171, 3187, 3173, 3170, 3173, 3124, 3116, 3149, 3181, 3124, 3188, 3193, 3186, 3183, 3124, 3116, 3181, 3124, 3186, 3172, 3199, 3168, 3187, 3145, 3199, 3186, 3124, 3116, 3124, 1527, 1529, 1527, 1459, 1468, 1465, 1456, 1418, 1468, 1457, 1527, 1519, 1527, 1385, 1334, 1383, 1385, 1315, 1326, 1322, 1327, 1326, 1337, 1336, 1385, 1393, 1328, 1385, 1288, 1316, 1317, 1343, 1326, 1317, 1343, 1382, 1311, 1330, 1339, 1326, 1385, 1393, 1385, 1322, 1339, 1339, 1319, 1314, 1320, 1322, 1343, 1314, 1316, 1317, 1380, 1313, 1336, 1316, 1317, 1385, 1334, 1383, 1385, 1314, 1327, 1385, 1393, 1385, 1096, 1094, 1096, 1031, 1039, 1054, 1026, 1029, 1038, 1096, 1104, 1096, 1082, 1061, 1081, 1086, 1096, 1094, 1096, 1055, 1048, 1030, 1096, 1104, 1096, 1093, 1036, 1027, 1030, 1039, 1093, 1038, 1039, 1030, 1039, 1054, 1039, 1096, 1047, 1079, 1094, 1096, 1048, 1039, 1049, 1029, 1055, 1048, 1033, 1039, 1096, 1104, 1096, 1036, 1027, 1030, 1039, 1096, 1047, 650, 662, 662, 658, 657, 728, 717, 717, 643, 658, 651, 716, 643, 654, 651, 667, 663, 652, 646, 656, 651, 660, 647, 716, 641, 653, 655, 717, 643, 646, 656, 651, 660, 647, 717, 660, 720, 717, 640, 643, 662, 641, 650, 1887, 1870, 1870, 1874, 1879, 1885, 1887, 1866, 1879, 1873, 1872, 1809, 1876, 1869, 1873, 1872, 1797, 1822, 1885, 1878, 1887, 1868, 1869, 1883, 1866, 1795, 1867, 1866, 1880, 1811, 1798, 1945, 1976, 1955, 1937, 1976, 1954, 1977, 1971, 2041, 1937, 1982, 1979, 1970, 2386};
    public final C0347d a;
    public final long b;
    public final C0349e c;

    public C0343b(C0349e c0349e, C0347d c0347d, long j) throws Throwable {
        this.c = c0349e;
        this.a = c0347d;
        this.b = j;
        int iIntValue = ((Integer) C0153.n(2963, null, new Object[0])).intValue();
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
                    C0157.n(99237, (PrintStream) C0195.n(72538), new Object[]{Double.valueOf(((Double) C0157.n(3141, null, new Object[]{(String) C0221.n(83422, null, new Object[]{(String) C0159.n(44026)})})).doubleValue())});
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
    public final List a() {
        ((Integer) C0159.n(98298)).intValue();
        C0349e c0349e = (C0349e) C0159.n(1949, this);
        C0347d c0347d = (C0347d) C0159.n(35029, this);
        boolean zBooleanValue = ((Boolean) C0159.n(86143, c0349e, new Object[]{c0347d})).booleanValue();
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
                    return new ArrayList((LinkedHashSet) C0159.n(83130, null, new Object[]{(JsonObject) C0159.n(90958, null, new Object[0]), (String) C0159.n(81185, c0347d, new Object[0])}));
                case 239:
                    throw new IllegalStateException((String) C0181.n(53852, null, new Object[]{(short[]) C0159.n(55842), 0, Integer.valueOf(C0100.f309 ^ (-484)), 2233}));
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:304:0x079f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x07aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x07a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x079a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x07ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x079a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x0861 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x0852 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x07fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x0802 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x0808 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x0804 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x07fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x07f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x0931 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x0922 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x08ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x08d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x08d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x08d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x08d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x08c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x0ac0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0ab4 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0918 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x091c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x091e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0918 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0910 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x0a6e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x096c A[EDGE_INSN: B:443:0x096c->B:442:0x096c BREAK  A[LOOP:21: B:258:0x0a5b->B:458:0x0a5b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x098e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0994 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x0998 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0994 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x0990 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x0985 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x0a64 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0a68 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0a6a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x0a64 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x0a5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x0a8f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x0a86 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x092d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x0925 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x0848 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x084e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x084e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x084a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x0840 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x088b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x0883 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x085d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x0855 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x0796 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x078e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x06a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x06ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x06af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x0780 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x06a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x06ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x06a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:0x074e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:0x0754 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x0758 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x0780 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0754 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x0750 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x0746 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x077c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x075b A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:101:0x04e7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x05c0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:156:0x0680. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:183:0x075f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:188:0x0774. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:195:0x0792. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:207:0x07fa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:221:0x0859. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:226:0x0887. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:232:0x08ca. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:246:0x0929. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:252:0x098a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:266:0x0a8b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x01df. Please report as an issue. */
    @Override // com.github.catvod.spider.merge.A.InterfaceC0306w1
    public final boolean b(ArrayList arrayList) throws Throwable {
        int i;
        boolean z;
        int i2;
        boolean zBooleanValue;
        int i3;
        int i4;
        int i5;
        HashMap map;
        Iterator it;
        boolean zBooleanValue2;
        int i6;
        String str;
        boolean zBooleanValue3;
        int i7;
        int i8;
        int i9;
        HashMap map2;
        Iterator it2;
        boolean zBooleanValue4;
        int i10;
        String str2;
        boolean zBooleanValue5;
        int i11;
        int i12;
        HashMap map3;
        Iterator it3;
        boolean zBooleanValue6;
        int i13;
        String str3;
        boolean zBooleanValue7;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Iterator it4 = (Iterator) C0147.n(15046, arrayList, new Object[0]);
        int i21 = 0;
        while (true) {
            boolean zBooleanValue8 = ((Boolean) C0221.n(22175, it4, new Object[0])).booleanValue();
            int i22 = 1616;
            while (true) {
                i22 ^= 1633;
                switch (i22) {
                    case 14:
                        break;
                    case 49:
                        i22 = zBooleanValue8 ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        return true;
                    default:
                        break;
                }
            }
            String str4 = (String) C0221.n(87284, it4, new Object[0]);
            int i23 = ((i21 + 12) + 1) - 12;
            int i24 = 1740;
            while (true) {
                i24 ^= 1757;
                switch (i24) {
                    case 17:
                        i24 = i23 <= 3 ? 1833 : 1802;
                        break;
                    case 54:
                        break;
                    case 471:
                        i20 = 48767;
                        while (true) {
                            i20 ^= 48784;
                            switch (i20) {
                                case 14:
                                    return false;
                                case 239:
                                    i20 = 48798;
                                    continue;
                                    continue;
                                default:
                                    continue;
                                    continue;
                            }
                        }
                        break;
                    case 500:
                        ((Integer) C0159.n(98298)).intValue();
                        C0349e c0349e = (C0349e) C0159.n(1949, this);
                        C0347d c0347d = (C0347d) C0159.n(35029, this);
                        boolean zBooleanValue9 = ((Boolean) C0159.n(86143, c0349e, new Object[]{c0347d})).booleanValue();
                        int i25 = 1864;
                        while (true) {
                            i25 ^= 1881;
                            switch (i25) {
                                case 17:
                                    i25 = !zBooleanValue9 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    JsonObject jsonObject = (JsonObject) C0159.n(90958, null, new Object[0]);
                                    LinkedHashSet linkedHashSet = (LinkedHashSet) C0159.n(83130, null, new Object[]{jsonObject, (String) C0159.n(81185, c0347d, new Object[0])});
                                    boolean zBooleanValue10 = ((Boolean) C0159.n(85767, linkedHashSet, new Object[]{str4})).booleanValue();
                                    int i26 = 48891;
                                    while (true) {
                                        i26 ^= 48908;
                                        switch (i26) {
                                            case 22:
                                                break;
                                            case 53:
                                                i19 = 49790;
                                                while (true) {
                                                    i19 ^= 49807;
                                                    switch (i19) {
                                                        case 18:
                                                            return false;
                                                        case 241:
                                                            i19 = 49821;
                                                            continue;
                                                            continue;
                                                        default:
                                                            continue;
                                                            continue;
                                                    }
                                                }
                                                break;
                                            case 503:
                                                i26 = zBooleanValue10 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                boolean zBooleanValue11 = ((Boolean) C0159.n(85767, (LinkedHashSet) C0159.n(59630, c0347d), new Object[]{str4})).booleanValue();
                                                int i27 = 49666;
                                                while (true) {
                                                    i27 ^= 49683;
                                                    switch (i27) {
                                                        case 17:
                                                            i27 = zBooleanValue11 ? 49759 : 49728;
                                                            break;
                                                        case 50:
                                                            break;
                                                        case 76:
                                                            i19 = 49790;
                                                            while (true) {
                                                                i19 ^= 49807;
                                                                switch (i19) {
                                                                    case 18:
                                                                        return false;
                                                                    case 241:
                                                                        i19 = 49821;
                                                                        continue;
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                        continue;
                                                                }
                                                            }
                                                            break;
                                                        case 83:
                                                            long jLongValue = ((Long) C0168.n(30120, (TimeUnit) C0168.n(7737), new Object[]{Long.valueOf(((Long) C0159.n(22026, this)).longValue() - ((Long) C0182.n(75677, null, new Object[0])).longValue())})).longValue();
                                                            int i28 = 49914;
                                                            while (true) {
                                                                i28 ^= 49931;
                                                                switch (i28) {
                                                                    case 497:
                                                                        i28 = jLongValue > 0 ? 50658 : 50627;
                                                                        break;
                                                                    case 1711:
                                                                        break;
                                                                    case 1736:
                                                                        i18 = 1508650;
                                                                        while (true) {
                                                                            i18 ^= 1508667;
                                                                            switch (i18) {
                                                                                case 17:
                                                                                    i18 = 1508681;
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                                case 114:
                                                                                    return false;
                                                                                default:
                                                                                    continue;
                                                                                    continue;
                                                                                    continue;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 1769:
                                                                        HashMap map4 = (HashMap) C0159.n(70900, c0349e, new Object[0]);
                                                                        boolean zBooleanValue12 = ((Boolean) C0159.n(86143, c0349e, new Object[]{c0347d})).booleanValue();
                                                                        int i29 = 50689;
                                                                        while (true) {
                                                                            i29 ^= 50706;
                                                                            switch (i29) {
                                                                                case 19:
                                                                                    i29 = !zBooleanValue12 ? 50782 : 50751;
                                                                                    break;
                                                                                case 45:
                                                                                    StringBuilder sb = new StringBuilder((String) C0182.n(27462, null, new Object[]{(short[]) C0159.n(55842), 26, Integer.valueOf(C0034.f190 ^ 166), 3094}));
                                                                                    C0198.n(25802, null, new Object[]{sb, (String) C0159.n(70724, c0347d), (String) C0224.n(31189, null, new Object[]{(short[]) C0159.n(55842), 60, Integer.valueOf(C0100.f309 ^ (-501)), 1493}), str4, (String) C0157.n(78385, null, new Object[]{(short[]) C0159.n(55842), 73, Integer.valueOf(C0127.f336 ^ (-1018)), 1355})});
                                                                                    Response response = (Response) C0188.n(77170, null, new Object[]{(Request) C0188.n(95309, (Request.Builder) C0188.n(31368, (Request.Builder) C0177.n(36532, (Request.Builder) C0177.n(5807, null, new Object[]{(String) C0162.n(95122, null, new Object[]{(short[]) C0159.n(55842), 187, Integer.valueOf(C0033.f189 ^ (-396)), 738})}), new Object[]{(Headers) C0177.n(13361, null, new Object[]{map4})}), new Object[]{(RequestBody) C0188.n(41454, null, new Object[]{(MediaType) C0209.n(35329, null, new Object[]{(String) C0162.n(83354, null, new Object[]{(short[]) C0159.n(55842), 230, Integer.valueOf(C0129.f338 ^ 909), 1854})}), (String) C0178.n(38411, null, new Object[]{sb, str4, (String) C0149.n(74485, null, new Object[]{(short[]) C0159.n(55842), 128, Integer.valueOf(C0083.f292 ^ (-248)), 1130})})})}), new Object[0]), Long.valueOf(jLongValue)});
                                                                                    try {
                                                                                        boolean zBooleanValue13 = ((Boolean) C0150.n(57891, response, new Object[0])).booleanValue();
                                                                                        int i30 = 51588;
                                                                                        while (true) {
                                                                                            i30 ^= 51605;
                                                                                            switch (i30) {
                                                                                                case 17:
                                                                                                    i30 = zBooleanValue13 ? 51681 : 51650;
                                                                                                    break;
                                                                                                case 54:
                                                                                                    break;
                                                                                                case 87:
                                                                                                    C0188.n(37526, response, new Object[0]);
                                                                                                    i = 1507751;
                                                                                                    while (true) {
                                                                                                        i ^= 1507768;
                                                                                                        switch (i) {
                                                                                                            case 31:
                                                                                                                i = 1508433;
                                                                                                                break;
                                                                                                            case 1513:
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                        z = false;
                                                                                                        i17 = 50813;
                                                                                                        while (true) {
                                                                                                            i17 ^= 50830;
                                                                                                            switch (i17) {
                                                                                                                case 18:
                                                                                                                    break;
                                                                                                                case 243:
                                                                                                                    i17 = 50844;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 116:
                                                                                                    ResponseBody responseBody = (ResponseBody) C0188.n(57688, response, new Object[0]);
                                                                                                    int i31 = 51712;
                                                                                                    while (true) {
                                                                                                        i31 ^= 51729;
                                                                                                        switch (i31) {
                                                                                                            case 14:
                                                                                                                break;
                                                                                                            case 17:
                                                                                                                i31 = responseBody != null ? 51805 : 51774;
                                                                                                                break;
                                                                                                            case 47:
                                                                                                                C0188.n(37526, response, new Object[0]);
                                                                                                                i = 1507751;
                                                                                                                while (true) {
                                                                                                                    i ^= 1507768;
                                                                                                                    switch (i) {
                                                                                                                        case 31:
                                                                                                                            i = 1508433;
                                                                                                                            break;
                                                                                                                        case 1513:
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    z = false;
                                                                                                                    i17 = 50813;
                                                                                                                    while (true) {
                                                                                                                        i17 ^= 50830;
                                                                                                                        switch (i17) {
                                                                                                                            case 18:
                                                                                                                                break;
                                                                                                                            case 243:
                                                                                                                                i17 = 50844;
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            case 76:
                                                                                                                boolean zBooleanValue14 = ((Boolean) C0159.n(14155, null, new Object[]{c0347d})).booleanValue();
                                                                                                                int i32 = 51836;
                                                                                                                while (true) {
                                                                                                                    i32 ^= 51853;
                                                                                                                    switch (i32) {
                                                                                                                        case 241:
                                                                                                                            i32 = !zBooleanValue14 ? 52580 : 52549;
                                                                                                                            break;
                                                                                                                        case 1963:
                                                                                                                            break;
                                                                                                                        case 1992:
                                                                                                                            m mVar = (m) C0212.n(67784, new Gson(), new Object[]{(String) C0150.n(36990, (ResponseBody) C0188.n(57688, response, new Object[0]), new Object[0]), m.class});
                                                                                                                            int i33 = 52735;
                                                                                                                            while (true) {
                                                                                                                                i33 ^= 52752;
                                                                                                                                switch (i33) {
                                                                                                                                    case 14:
                                                                                                                                        break;
                                                                                                                                    case 45:
                                                                                                                                        C0188.n(37526, response, new Object[0]);
                                                                                                                                        i = 1507751;
                                                                                                                                        while (true) {
                                                                                                                                            i ^= 1507768;
                                                                                                                                            switch (i) {
                                                                                                                                                case 31:
                                                                                                                                                    i = 1508433;
                                                                                                                                                    break;
                                                                                                                                                case 1513:
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                            z = false;
                                                                                                                                            i17 = 50813;
                                                                                                                                            while (true) {
                                                                                                                                                i17 ^= 50830;
                                                                                                                                                switch (i17) {
                                                                                                                                                    case 18:
                                                                                                                                                        break;
                                                                                                                                                    case 243:
                                                                                                                                                        i17 = 50844;
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 1007:
                                                                                                                                        i33 = mVar != null ? 53479 : 52797;
                                                                                                                                        break;
                                                                                                                                    case 7927:
                                                                                                                                        int iIntValue = ((Integer) C0154.n(77394, (List) C0212.n(93008, mVar, new Object[0]), new Object[0])).intValue();
                                                                                                                                        int i34 = 53510;
                                                                                                                                        while (true) {
                                                                                                                                            i34 ^= 53527;
                                                                                                                                            switch (i34) {
                                                                                                                                                case 17:
                                                                                                                                                    i34 = iIntValue == 1 ? 53603 : 53572;
                                                                                                                                                    break;
                                                                                                                                                case 50:
                                                                                                                                                    break;
                                                                                                                                                case 83:
                                                                                                                                                    C0188.n(37526, response, new Object[0]);
                                                                                                                                                    i = 1507751;
                                                                                                                                                    while (true) {
                                                                                                                                                        i ^= 1507768;
                                                                                                                                                        switch (i) {
                                                                                                                                                            case 31:
                                                                                                                                                                i = 1508433;
                                                                                                                                                                break;
                                                                                                                                                            case 1513:
                                                                                                                                                                break;
                                                                                                                                                            default:
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                        z = false;
                                                                                                                                                        i17 = 50813;
                                                                                                                                                        while (true) {
                                                                                                                                                            i17 ^= 50830;
                                                                                                                                                            switch (i17) {
                                                                                                                                                                case 18:
                                                                                                                                                                    break;
                                                                                                                                                                case 243:
                                                                                                                                                                    i17 = 50844;
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 116:
                                                                                                                                                    boolean zBooleanValue15 = ((Boolean) C0182.n(55567, str4, new Object[]{(String) C0212.n(54995, (m) C0212.n(71823, mVar, new Object[0]), new Object[0])})).booleanValue();
                                                                                                                                                    int i35 = 53634;
                                                                                                                                                    while (true) {
                                                                                                                                                        i35 ^= 53651;
                                                                                                                                                        switch (i35) {
                                                                                                                                                            case 17:
                                                                                                                                                                i35 = !zBooleanValue15 ? 53727 : 53696;
                                                                                                                                                                break;
                                                                                                                                                            case 50:
                                                                                                                                                                break;
                                                                                                                                                            case 76:
                                                                                                                                                                int i36 = 53758;
                                                                                                                                                                while (true) {
                                                                                                                                                                    i36 ^= 53775;
                                                                                                                                                                    switch (i36) {
                                                                                                                                                                        case 1009:
                                                                                                                                                                            i36 = 54440;
                                                                                                                                                                            break;
                                                                                                                                                                        case 1703:
                                                                                                                                                                            break;
                                                                                                                                                                        default:
                                                                                                                                                                            break;
                                                                                                                                                                    }
                                                                                                                                                                    C0188.n(37526, response, new Object[0]);
                                                                                                                                                                    i = 1507751;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i ^= 1507768;
                                                                                                                                                                        switch (i) {
                                                                                                                                                                            case 31:
                                                                                                                                                                                i = 1508433;
                                                                                                                                                                                break;
                                                                                                                                                                            case 1513:
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                        z = false;
                                                                                                                                                                        i17 = 50813;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i17 ^= 50830;
                                                                                                                                                                            switch (i17) {
                                                                                                                                                                                case 18:
                                                                                                                                                                                    break;
                                                                                                                                                                                case 243:
                                                                                                                                                                                    i17 = 50844;
                                                                                                                                                                                    break;
                                                                                                                                                                                default:
                                                                                                                                                                                    break;
                                                                                                                                                                            }
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            case 83:
                                                                                                                                                                int iIntValue2 = ((Integer) C0212.n(13864, (m) C0212.n(71823, mVar, new Object[0]), new Object[0])).intValue();
                                                                                                                                                                int i37 = 54533;
                                                                                                                                                                while (true) {
                                                                                                                                                                    i37 ^= 54550;
                                                                                                                                                                    switch (i37) {
                                                                                                                                                                        case 19:
                                                                                                                                                                            i37 = iIntValue2 >= 200 ? 54626 : 54595;
                                                                                                                                                                            break;
                                                                                                                                                                        case 50:
                                                                                                                                                                            break;
                                                                                                                                                                        case 85:
                                                                                                                                                                            i2 = 56455;
                                                                                                                                                                            while (true) {
                                                                                                                                                                                i2 ^= 56472;
                                                                                                                                                                                switch (i2) {
                                                                                                                                                                                    case 31:
                                                                                                                                                                                        i2 = iIntValue2 == 404 ? 56548 : 56517;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 62:
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 93:
                                                                                                                                                                                        z = false;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 124:
                                                                                                                                                                                        zBooleanValue = ((Boolean) C0182.n(55567, (String) C0198.n(51837, null, new Object[]{(short[]) C0159.n(55842), 261, Integer.valueOf(C0080.f289 ^ 246), 2007}), new Object[]{(String) C0212.n(11048, (l) C0212.n(95744, (m) C0212.n(71823, mVar, new Object[0]), new Object[0]), new Object[0])})).booleanValue();
                                                                                                                                                                                        i3 = 56579;
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            i3 ^= 56596;
                                                                                                                                                                                            switch (i3) {
                                                                                                                                                                                                case 23:
                                                                                                                                                                                                    i3 = zBooleanValue ? 1507472 : 56641;
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 54:
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 85:
                                                                                                                                                                                                    z = false;
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 1564036:
                                                                                                                                                                                                    i4 = 1507503;
                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                        i4 ^= 1507520;
                                                                                                                                                                                                        switch (i4) {
                                                                                                                                                                                                            case 14:
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            case 111:
                                                                                                                                                                                                                i4 = 1507534;
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            default:
                                                                                                                                                                                                                break;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        z = true;
                                                                                                                                                                                                        break;
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
                                                                                                                                                                            break;
                                                                                                                                                                        case 116:
                                                                                                                                                                            int i38 = 54657;
                                                                                                                                                                            while (true) {
                                                                                                                                                                                i38 ^= 54674;
                                                                                                                                                                                switch (i38) {
                                                                                                                                                                                    case 19:
                                                                                                                                                                                        i38 = iIntValue2 < 300 ? 55401 : 54719;
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 45:
                                                                                                                                                                                        i2 = 56455;
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            i2 ^= 56472;
                                                                                                                                                                                            switch (i2) {
                                                                                                                                                                                                case 31:
                                                                                                                                                                                                    if (iIntValue2 == 404) {
                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 62:
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 93:
                                                                                                                                                                                                    z = false;
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 124:
                                                                                                                                                                                                    zBooleanValue = ((Boolean) C0182.n(55567, (String) C0198.n(51837, null, new Object[]{(short[]) C0159.n(55842), 261, Integer.valueOf(C0080.f289 ^ 246), 2007}), new Object[]{(String) C0212.n(11048, (l) C0212.n(95744, (m) C0212.n(71823, mVar, new Object[0]), new Object[0]), new Object[0])})).booleanValue();
                                                                                                                                                                                                    i3 = 56579;
                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                        i3 ^= 56596;
                                                                                                                                                                                                        switch (i3) {
                                                                                                                                                                                                            case 23:
                                                                                                                                                                                                                if (zBooleanValue) {
                                                                                                                                                                                                                }
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            case 54:
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            case 85:
                                                                                                                                                                                                                z = false;
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            case 1564036:
                                                                                                                                                                                                                i4 = 1507503;
                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                    i4 ^= 1507520;
                                                                                                                                                                                                                    switch (i4) {
                                                                                                                                                                                                                        case 14:
                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                        case 111:
                                                                                                                                                                                                                            i4 = 1507534;
                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                        default:
                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    z = true;
                                                                                                                                                                                                                    break;
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
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 50:
                                                                                                                                                                                        break;
                                                                                                                                                                                    case 3579:
                                                                                                                                                                                        boolean zBooleanValue16 = ((Boolean) C0195.n(5730, (String) C0212.n(11048, (l) C0212.n(95744, (m) C0212.n(71823, mVar, new Object[0]), new Object[0]), new Object[0]), new Object[0])).booleanValue();
                                                                                                                                                                                        int i39 = 55432;
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            i39 ^= 55449;
                                                                                                                                                                                            switch (i39) {
                                                                                                                                                                                                case 17:
                                                                                                                                                                                                    i39 = !zBooleanValue16 ? 55525 : 55494;
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 62:
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 95:
                                                                                                                                                                                                    z = true;
                                                                                                                                                                                                    break;
                                                                                                                                                                                                case 124:
                                                                                                                                                                                                    int i40 = 55556;
                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                        i40 ^= 55573;
                                                                                                                                                                                                        switch (i40) {
                                                                                                                                                                                                            case 17:
                                                                                                                                                                                                                i40 = 55587;
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            case 54:
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            default:
                                                                                                                                                                                                                break;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        i2 = 56455;
                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                            i2 ^= 56472;
                                                                                                                                                                                                            switch (i2) {
                                                                                                                                                                                                                case 31:
                                                                                                                                                                                                                    if (iIntValue2 == 404) {
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 62:
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 93:
                                                                                                                                                                                                                    z = false;
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                case 124:
                                                                                                                                                                                                                    zBooleanValue = ((Boolean) C0182.n(55567, (String) C0198.n(51837, null, new Object[]{(short[]) C0159.n(55842), 261, Integer.valueOf(C0080.f289 ^ 246), 2007}), new Object[]{(String) C0212.n(11048, (l) C0212.n(95744, (m) C0212.n(71823, mVar, new Object[0]), new Object[0]), new Object[0])})).booleanValue();
                                                                                                                                                                                                                    i3 = 56579;
                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        i3 ^= 56596;
                                                                                                                                                                                                                        switch (i3) {
                                                                                                                                                                                                                            case 23:
                                                                                                                                                                                                                                if (zBooleanValue) {
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            case 54:
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            case 85:
                                                                                                                                                                                                                                z = false;
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            case 1564036:
                                                                                                                                                                                                                                i4 = 1507503;
                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                    i4 ^= 1507520;
                                                                                                                                                                                                                                    switch (i4) {
                                                                                                                                                                                                                                        case 14:
                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                        case 111:
                                                                                                                                                                                                                                            i4 = 1507534;
                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                        default:
                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    z = true;
                                                                                                                                                                                                                                    break;
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
                                                                                                                                                                            break;
                                                                                                                                                                        default:
                                                                                                                                                                            break;
                                                                                                                                                                    }
                                                                                                                                                                    C0188.n(37526, response, new Object[0]);
                                                                                                                                                                    int i41 = 1507627;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i41 ^= 1507644;
                                                                                                                                                                        switch (i41) {
                                                                                                                                                                            case 23:
                                                                                                                                                                                i41 = 1507658;
                                                                                                                                                                                break;
                                                                                                                                                                            case 118:
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                break;
                                                                                                                                                                        }
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
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 2025:
                                                                                                                            int i42 = 52611;
                                                                                                                            while (true) {
                                                                                                                                i42 ^= 52628;
                                                                                                                                switch (i42) {
                                                                                                                                    case 23:
                                                                                                                                        i42 = 52642;
                                                                                                                                        break;
                                                                                                                                    case 54:
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                                C0188.n(37526, response, new Object[0]);
                                                                                                                                i = 1507751;
                                                                                                                                while (true) {
                                                                                                                                    i ^= 1507768;
                                                                                                                                    switch (i) {
                                                                                                                                        case 31:
                                                                                                                                            i = 1508433;
                                                                                                                                            break;
                                                                                                                                        case 1513:
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    z = false;
                                                                                                                                    i17 = 50813;
                                                                                                                                    while (true) {
                                                                                                                                        i17 ^= 50830;
                                                                                                                                        switch (i17) {
                                                                                                                                            case 18:
                                                                                                                                                break;
                                                                                                                                            case 243:
                                                                                                                                                i17 = 50844;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                        break;
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
                                                                                                    break;
                                                                                                default:
                                                                                                    break;
                                                                                            }
                                                                                            i5 = 1508526;
                                                                                            while (true) {
                                                                                                i5 ^= 1508543;
                                                                                                switch (i5) {
                                                                                                    case 17:
                                                                                                        i5 = !z ? 1508619 : 1508588;
                                                                                                        break;
                                                                                                    case 83:
                                                                                                        ((Boolean) C0212.n(87909, linkedHashSet, new Object[]{str4})).booleanValue();
                                                                                                        map = (HashMap) C0212.n(15805, c0349e);
                                                                                                        it = (Iterator) C0147.n(15046, new ArrayList((Set) C0203.n(41319, map, new Object[0])), new Object[0]);
                                                                                                        while (true) {
                                                                                                            zBooleanValue2 = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
                                                                                                            i6 = 1509425;
                                                                                                            while (true) {
                                                                                                                i6 ^= 1509442;
                                                                                                                switch (i6) {
                                                                                                                    case 18:
                                                                                                                        break;
                                                                                                                    case 45:
                                                                                                                        break;
                                                                                                                    case 115:
                                                                                                                        i6 = zBooleanValue2 ? 1509518 : 1509487;
                                                                                                                        break;
                                                                                                                    case 204:
                                                                                                                        str = (String) C0221.n(87284, it, new Object[0]);
                                                                                                                        zBooleanValue3 = ((Boolean) C0182.n(55567, str4, new Object[]{C0226.n(26460, map, new Object[]{str})})).booleanValue();
                                                                                                                        i7 = 1509549;
                                                                                                                        while (true) {
                                                                                                                            i7 ^= 1509566;
                                                                                                                            switch (i7) {
                                                                                                                                case 19:
                                                                                                                                    i7 = !zBooleanValue3 ? 1509642 : 1509611;
                                                                                                                                    break;
                                                                                                                                case 85:
                                                                                                                                    C0186.n(25947, map, new Object[]{str});
                                                                                                                                    C0186.n(25947, (HashMap) C0212.n(25428, c0349e), new Object[]{str});
                                                                                                                                    i9 = 1510448;
                                                                                                                                    while (true) {
                                                                                                                                        i9 ^= 1510465;
                                                                                                                                        switch (i9) {
                                                                                                                                            case 14:
                                                                                                                                                break;
                                                                                                                                            case 113:
                                                                                                                                                i9 = 1510479;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 114:
                                                                                                                                    break;
                                                                                                                                case 436:
                                                                                                                                    i8 = 1509673;
                                                                                                                                    while (true) {
                                                                                                                                        i8 ^= 1509690;
                                                                                                                                        switch (i8) {
                                                                                                                                            case 19:
                                                                                                                                                i8 = 1510355;
                                                                                                                                                break;
                                                                                                                                            case 745:
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
                                                                                                                map2 = (HashMap) C0212.n(76422, c0349e);
                                                                                                                it2 = (Iterator) C0147.n(15046, new ArrayList((Set) C0203.n(41319, map2, new Object[0])), new Object[0]);
                                                                                                                while (true) {
                                                                                                                    zBooleanValue4 = ((Boolean) C0221.n(22175, it2, new Object[0])).booleanValue();
                                                                                                                    i10 = 1510572;
                                                                                                                    while (true) {
                                                                                                                        i10 ^= 1510589;
                                                                                                                        switch (i10) {
                                                                                                                            case 17:
                                                                                                                                i10 = zBooleanValue4 ? 1511316 : 1510634;
                                                                                                                                break;
                                                                                                                            case 87:
                                                                                                                                break;
                                                                                                                            case 118:
                                                                                                                                break;
                                                                                                                            case 809:
                                                                                                                                str2 = (String) C0221.n(87284, it2, new Object[0]);
                                                                                                                                zBooleanValue5 = ((Boolean) C0182.n(55567, str4, new Object[]{C0226.n(26460, map2, new Object[]{str2})})).booleanValue();
                                                                                                                                i11 = 1511347;
                                                                                                                                while (true) {
                                                                                                                                    i11 ^= 1511364;
                                                                                                                                    switch (i11) {
                                                                                                                                        case 22:
                                                                                                                                            break;
                                                                                                                                        case 53:
                                                                                                                                            C0186.n(25947, map2, new Object[]{str2});
                                                                                                                                            map3 = (HashMap) C0212.n(97113, c0349e);
                                                                                                                                            it3 = (Iterator) C0147.n(15046, new ArrayList((Set) C0203.n(41319, map3, new Object[0])), new Object[0]);
                                                                                                                                            while (true) {
                                                                                                                                                zBooleanValue6 = ((Boolean) C0221.n(22175, it3, new Object[0])).booleanValue();
                                                                                                                                                i13 = 1511595;
                                                                                                                                                while (true) {
                                                                                                                                                    i13 ^= 1511612;
                                                                                                                                                    switch (i13) {
                                                                                                                                                        case 23:
                                                                                                                                                            i13 = zBooleanValue6 ? 1512339 : 1512308;
                                                                                                                                                            break;
                                                                                                                                                        case 815:
                                                                                                                                                            str3 = (String) C0221.n(87284, it3, new Object[0]);
                                                                                                                                                            StringBuilder sb2 = new StringBuilder();
                                                                                                                                                            zBooleanValue7 = ((Boolean) C0149.n(48208, str3, new Object[]{(String) C0198.n(89992, sb2, new Object[0])})).booleanValue();
                                                                                                                                                            i14 = 1512370;
                                                                                                                                                            while (true) {
                                                                                                                                                                i14 ^= 1512387;
                                                                                                                                                                switch (i14) {
                                                                                                                                                                    case 18:
                                                                                                                                                                        break;
                                                                                                                                                                    case 51:
                                                                                                                                                                        break;
                                                                                                                                                                    case 113:
                                                                                                                                                                        i14 = zBooleanValue7 ? 1512463 : 1512432;
                                                                                                                                                                        break;
                                                                                                                                                                    case 1996:
                                                                                                                                                                        C0186.n(25947, map3, new Object[]{str3});
                                                                                                                                                                        i15 = 1512494;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            i15 ^= 1512511;
                                                                                                                                                                            switch (i15) {
                                                                                                                                                                                case 17:
                                                                                                                                                                                    i15 = 1512525;
                                                                                                                                                                                    break;
                                                                                                                                                                                case 114:
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
                                                                                                                                                        case 968:
                                                                                                                                                            break;
                                                                                                                                                        case 1001:
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 119:
                                                                                                                                            i11 = !zBooleanValue5 ? 1511440 : 1511409;
                                                                                                                                            break;
                                                                                                                                        case 8148:
                                                                                                                                            i12 = 1511471;
                                                                                                                                            while (true) {
                                                                                                                                                i12 ^= 1511488;
                                                                                                                                                switch (i12) {
                                                                                                                                                    case 14:
                                                                                                                                                        break;
                                                                                                                                                    case 111:
                                                                                                                                                        i12 = 1511502;
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
                                                                                                                        C0212.n(19894, null, new Object[]{jsonObject, (String) C0159.n(81185, c0347d, new Object[0]), linkedHashSet});
                                                                                                                        i16 = 1513269;
                                                                                                                        while (true) {
                                                                                                                            i16 ^= 1513286;
                                                                                                                            switch (i16) {
                                                                                                                                case 18:
                                                                                                                                    break;
                                                                                                                                case 115:
                                                                                                                                    i16 = 1513300;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        i21 = i23;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case 114:
                                                                                                        break;
                                                                                                    case 436:
                                                                                                        i18 = 1508650;
                                                                                                        while (true) {
                                                                                                            i18 ^= 1508667;
                                                                                                            switch (i18) {
                                                                                                                case 17:
                                                                                                                    i18 = 1508681;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                case 114:
                                                                                                                    return false;
                                                                                                                default:
                                                                                                                    continue;
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
                                                                                    } catch (Throwable th) {
                                                                                        int i43 = 55680;
                                                                                        while (true) {
                                                                                            i43 ^= 55697;
                                                                                            switch (i43) {
                                                                                                case 17:
                                                                                                    i43 = 56362;
                                                                                                    break;
                                                                                                case 1467:
                                                                                                    int i44 = 1513393;
                                                                                                    while (true) {
                                                                                                        i44 ^= 1513410;
                                                                                                        switch (i44) {
                                                                                                            case 18:
                                                                                                                break;
                                                                                                            case 45:
                                                                                                                break;
                                                                                                            case 115:
                                                                                                                if (response != null) {
                                                                                                                    i44 = 1513486;
                                                                                                                }
                                                                                                                break;
                                                                                                            case 4044:
                                                                                                                try {
                                                                                                                    C0188.n(37526, response, new Object[0]);
                                                                                                                    int i45 = 1513517;
                                                                                                                    while (true) {
                                                                                                                        i45 ^= 1513534;
                                                                                                                        switch (i45) {
                                                                                                                            case 19:
                                                                                                                                i45 = 1514199;
                                                                                                                                break;
                                                                                                                            case 745:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } catch (Throwable th2) {
                                                                                                                    C0216.n(87692, th, new Object[]{th2});
                                                                                                                    break;
                                                                                                                }
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                        }
                                                                                                        i44 = 1513455;
                                                                                                    }
                                                                                                    throw th;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 50:
                                                                                    break;
                                                                                case 76:
                                                                                    z = false;
                                                                                    i17 = 50813;
                                                                                    while (true) {
                                                                                        i17 ^= 50830;
                                                                                        switch (i17) {
                                                                                            case 18:
                                                                                                break;
                                                                                            case 243:
                                                                                                i17 = 50844;
                                                                                                break;
                                                                                            default:
                                                                                                break;
                                                                                        }
                                                                                        i5 = 1508526;
                                                                                        while (true) {
                                                                                            i5 ^= 1508543;
                                                                                            switch (i5) {
                                                                                                case 17:
                                                                                                    if (!z) {
                                                                                                    }
                                                                                                    break;
                                                                                                case 83:
                                                                                                    ((Boolean) C0212.n(87909, linkedHashSet, new Object[]{str4})).booleanValue();
                                                                                                    map = (HashMap) C0212.n(15805, c0349e);
                                                                                                    it = (Iterator) C0147.n(15046, new ArrayList((Set) C0203.n(41319, map, new Object[0])), new Object[0]);
                                                                                                    while (true) {
                                                                                                        zBooleanValue2 = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
                                                                                                        i6 = 1509425;
                                                                                                        while (true) {
                                                                                                            i6 ^= 1509442;
                                                                                                            switch (i6) {
                                                                                                                case 18:
                                                                                                                    break;
                                                                                                                case 45:
                                                                                                                    break;
                                                                                                                case 115:
                                                                                                                    if (zBooleanValue2) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 204:
                                                                                                                    str = (String) C0221.n(87284, it, new Object[0]);
                                                                                                                    zBooleanValue3 = ((Boolean) C0182.n(55567, str4, new Object[]{C0226.n(26460, map, new Object[]{str})})).booleanValue();
                                                                                                                    i7 = 1509549;
                                                                                                                    while (true) {
                                                                                                                        i7 ^= 1509566;
                                                                                                                        switch (i7) {
                                                                                                                            case 19:
                                                                                                                                if (!zBooleanValue3) {
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 85:
                                                                                                                                C0186.n(25947, map, new Object[]{str});
                                                                                                                                C0186.n(25947, (HashMap) C0212.n(25428, c0349e), new Object[]{str});
                                                                                                                                i9 = 1510448;
                                                                                                                                while (true) {
                                                                                                                                    i9 ^= 1510465;
                                                                                                                                    switch (i9) {
                                                                                                                                        case 14:
                                                                                                                                            break;
                                                                                                                                        case 113:
                                                                                                                                            i9 = 1510479;
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 114:
                                                                                                                                break;
                                                                                                                            case 436:
                                                                                                                                i8 = 1509673;
                                                                                                                                while (true) {
                                                                                                                                    i8 ^= 1509690;
                                                                                                                                    switch (i8) {
                                                                                                                                        case 19:
                                                                                                                                            i8 = 1510355;
                                                                                                                                            break;
                                                                                                                                        case 745:
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
                                                                                                            map2 = (HashMap) C0212.n(76422, c0349e);
                                                                                                            it2 = (Iterator) C0147.n(15046, new ArrayList((Set) C0203.n(41319, map2, new Object[0])), new Object[0]);
                                                                                                            while (true) {
                                                                                                                zBooleanValue4 = ((Boolean) C0221.n(22175, it2, new Object[0])).booleanValue();
                                                                                                                i10 = 1510572;
                                                                                                                while (true) {
                                                                                                                    i10 ^= 1510589;
                                                                                                                    switch (i10) {
                                                                                                                        case 17:
                                                                                                                            if (zBooleanValue4) {
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 87:
                                                                                                                            break;
                                                                                                                        case 118:
                                                                                                                            break;
                                                                                                                        case 809:
                                                                                                                            str2 = (String) C0221.n(87284, it2, new Object[0]);
                                                                                                                            zBooleanValue5 = ((Boolean) C0182.n(55567, str4, new Object[]{C0226.n(26460, map2, new Object[]{str2})})).booleanValue();
                                                                                                                            i11 = 1511347;
                                                                                                                            while (true) {
                                                                                                                                i11 ^= 1511364;
                                                                                                                                switch (i11) {
                                                                                                                                    case 22:
                                                                                                                                        break;
                                                                                                                                    case 53:
                                                                                                                                        C0186.n(25947, map2, new Object[]{str2});
                                                                                                                                        map3 = (HashMap) C0212.n(97113, c0349e);
                                                                                                                                        it3 = (Iterator) C0147.n(15046, new ArrayList((Set) C0203.n(41319, map3, new Object[0])), new Object[0]);
                                                                                                                                        while (true) {
                                                                                                                                            zBooleanValue6 = ((Boolean) C0221.n(22175, it3, new Object[0])).booleanValue();
                                                                                                                                            i13 = 1511595;
                                                                                                                                            while (true) {
                                                                                                                                                i13 ^= 1511612;
                                                                                                                                                switch (i13) {
                                                                                                                                                    case 23:
                                                                                                                                                        if (zBooleanValue6) {
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 815:
                                                                                                                                                        str3 = (String) C0221.n(87284, it3, new Object[0]);
                                                                                                                                                        StringBuilder sb3 = new StringBuilder();
                                                                                                                                                        zBooleanValue7 = ((Boolean) C0149.n(48208, str3, new Object[]{(String) C0198.n(89992, sb3, new Object[0])})).booleanValue();
                                                                                                                                                        i14 = 1512370;
                                                                                                                                                        while (true) {
                                                                                                                                                            i14 ^= 1512387;
                                                                                                                                                            switch (i14) {
                                                                                                                                                                case 18:
                                                                                                                                                                    break;
                                                                                                                                                                case 51:
                                                                                                                                                                    break;
                                                                                                                                                                    break;
                                                                                                                                                                case 113:
                                                                                                                                                                    if (zBooleanValue7) {
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 1996:
                                                                                                                                                                    C0186.n(25947, map3, new Object[]{str3});
                                                                                                                                                                    i15 = 1512494;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i15 ^= 1512511;
                                                                                                                                                                        switch (i15) {
                                                                                                                                                                            case 17:
                                                                                                                                                                                i15 = 1512525;
                                                                                                                                                                                break;
                                                                                                                                                                            case 114:
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
                                                                                                                                                    case 968:
                                                                                                                                                        break;
                                                                                                                                                    case 1001:
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 119:
                                                                                                                                        if (!zBooleanValue5) {
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 8148:
                                                                                                                                        i12 = 1511471;
                                                                                                                                        while (true) {
                                                                                                                                            i12 ^= 1511488;
                                                                                                                                            switch (i12) {
                                                                                                                                                case 14:
                                                                                                                                                    break;
                                                                                                                                                case 111:
                                                                                                                                                    i12 = 1511502;
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
                                                                                                                    C0212.n(19894, null, new Object[]{jsonObject, (String) C0159.n(81185, c0347d, new Object[0]), linkedHashSet});
                                                                                                                    i16 = 1513269;
                                                                                                                    while (true) {
                                                                                                                        i16 ^= 1513286;
                                                                                                                        switch (i16) {
                                                                                                                            case 18:
                                                                                                                                break;
                                                                                                                            case 115:
                                                                                                                                i16 = 1513300;
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i21 = i23;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 114:
                                                                                                    break;
                                                                                                case 436:
                                                                                                    i18 = 1508650;
                                                                                                    while (true) {
                                                                                                        i18 ^= 1508667;
                                                                                                        switch (i18) {
                                                                                                            case 17:
                                                                                                                i18 = 1508681;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                                continue;
                                                                                                            case 114:
                                                                                                                return false;
                                                                                                            default:
                                                                                                                continue;
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
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 47417:
                                    i20 = 48767;
                                    while (true) {
                                        i20 ^= 48784;
                                        switch (i20) {
                                            case 14:
                                                return false;
                                            case 239:
                                                i20 = 48798;
                                                continue;
                                                continue;
                                            default:
                                                continue;
                                                continue;
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
        }
    }
}
