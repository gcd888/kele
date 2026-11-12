package com.github.catvod.spider.merge.p000a;

import android.app.Activity;
import android.content.Intent;
import com.github.catvod.spider.merge.E.C0013;
import com.github.catvod.spider.merge.G.C0020;
import com.github.catvod.spider.merge.Q.C0040;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.f0.C0078;
import com.github.catvod.spider.merge.p003d.C0066;
import com.github.catvod.spider.merge.p003d.d;
import com.github.catvod.spider.merge.p007h.C0084;
import com.github.catvod.spider.merge.p011m.C0102;
import com.github.catvod.spider.merge.p018v.C0132;
import com.github.catvod.spider.merge.p019w.C0134;
import com.google.gson.JsonObject;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import moyu.fucking.C0146;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0155;
import moyu.fucking.C0157;
import moyu.fucking.C0159;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0175;
import moyu.fucking.C0177;
import moyu.fucking.C0182;
import moyu.fucking.C0188;
import moyu.fucking.C0189;
import moyu.fucking.C0191;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0203;
import moyu.fucking.C0205;
import moyu.fucking.C0210;
import moyu.fucking.C0212;
import moyu.fucking.C0213;
import moyu.fucking.C0215;
import moyu.fucking.C0217;
import moyu.fucking.C0226;
import moyu.fucking.C0232;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0361k implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f240short = {1922, 1930, 1922, 1933, 1930, 1949, 1948, 1534, 1529, 1516, 1529, 1528, 1534, 1261, 1265, 1265, 1269, 1270, 1215, 1194, 1194, 1264, 1258, 1269, 1195, 1268, 1264, 1252, 1271, 1262, 1195, 1254, 1259, 1194, 1254, 1252, 1270, 1194, 1252, 1263, 1252, 1277, 1194, 1250, 1248, 1265, 1238, 1248, 1271, 1267, 1260, 1254, 1248, 1233, 1260, 1254, 1262, 1248, 1265, 1223, 1276, 1236, 1271, 1254, 1258, 1249, 1248, 1233, 1258, 1262, 1248, 1259, 736, 741, 752, 741, 1171, 1157, 1170, 1174, 1161, 1155, 1157, 1215, 1172, 1161, 1155, 1163, 1157, 1172, 2871, 2874, 2879, 1702, 1705, 1699, 1717, 1704, 1710, 1699, 1769, 1710, 1705, 1715, 1698, 1705, 1715, 1769, 1702, 1700, 1715, 1710, 1704, 1705, 1769, 1681, 1678, 1666, 1680, 2837, 2841, 2843, 2904, 2839, 2842, 2847, 2837, 2842, 2841, 2819, 2834, 2904, 2834, 2839, 2818, 2839, 2836, 2841, 2830, 1312, 1324, 1326, 1389, 1335, 1314, 1324, 1313, 1314, 1324, 1389, 1327, 1324, 1316, 1322, 1325, 1399, 1314, 1325, 1319, 1329, 1324, 1322, 1319, 1389, 1328, 1312, 1314, 1325, 1389, 1298, 1329, 1296, 1312, 1314, 1325, 1282, 1312, 1335, 1322, 1333, 1322, 1335, 1338, 2938, 2932, 2920, 2894, 2914, 2930, 2928, 2943, 2881, 2928, 2915, 2928, 2940, 3067, 3005, 3006, 2987, 3004, 2999, 2730, 2808, 2791, 2794, 2795, 2785, 2762, 2799, 2810, 2799, 513, 593, 599, 580, 587, 598, 579, 576, 599, 622, 576, 604, 2593, 2599};
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ RunnableC0361k(C0349e c0349e, String str, d dVar) throws Throwable {
        this.a = 1;
        this.c = c0349e;
        this.b = str;
        this.d = dVar;
        int iIntValue = ((Integer) C0168.n(38731, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0152.n(66570, null, new Object[]{(String) C0157.n(79159, null, new Object[]{(String) C0217.n(49946)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public /* synthetic */ RunnableC0361k(Object obj, Object obj2, Serializable serializable, int i) throws Throwable {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = serializable;
        int iIntValue = ((Integer) C0157.n(62882, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0182.n(56258, null, new Object[]{(String) C0215.n(19920, null, new Object[]{(String) C0217.n(91315)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.github.catvod.spider.merge.d.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.github.catvod.spider.merge.a.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object[]] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0382v runnableC0382v;
        int i;
        Object objN = C0217.n(23507, this);
        Object objN2 = C0217.n(21462, this);
        Object objN3 = C0217.n(47645, this);
        switch (((Integer) C0217.n(21760, this)).intValue()) {
            case 0:
                Set set = (Set) C0217.n(3283);
                C0367n c0367n = (C0367n) objN;
                C0159.n(35468, null, new Object[]{c0367n, (String) C0157.n(78385, null, new Object[]{(short[]) C0217.n(48245), 196, Integer.valueOf(C0134.f343 ^ (-247)), 3039})});
                JsonObject jsonObject = (JsonObject) objN3;
                C0159.n(35468, null, new Object[]{jsonObject, (String) C0198.n(62249, null, new Object[]{(short[]) C0217.n(48245), 202, Integer.valueOf(C0040.f196 ^ (-327)), 2702})});
                String str = (String) objN2;
                C0159.n(35468, null, new Object[]{str, (String) C0191.n(93496, null, new Object[]{(short[]) C0217.n(48245), 212, Integer.valueOf(C0132.f341 ^ (-13)), 549})});
                try {
                    ((Boolean) C0203.n(4018, null, new Object[]{C0205.n(1767), (String) C0198.n(71923, null, new Object[]{(short[]) C0217.n(48245), 224, Integer.valueOf(C0078.f287 ^ (-692)), 2659})})).booleanValue();
                    String str2 = (String) C0217.n(42837, c0367n);
                    C0376s c0376s = (C0376s) C0155.n(40393);
                    boolean zBooleanValue = ((Boolean) C0146.n(10734, null, new Object[]{str2, (String) C0217.n(91256, null, new Object[0])})).booleanValue();
                    int i2 = 52611;
                    while (true) {
                        i2 ^= 52628;
                        switch (i2) {
                            case 23:
                                i2 = zBooleanValue ? 52704 : 52673;
                                break;
                            case 54:
                                break;
                            case 85:
                                break;
                            case 116:
                                int i3 = 52735;
                                while (true) {
                                    i3 ^= 52752;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 1007:
                                            i3 = 52766;
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    ((Boolean) C0212.n(87909, set, new Object[]{str})).booleanValue();
                    return;
                } catch (Throwable th) {
                    int i4 = 53510;
                    while (true) {
                        i4 ^= 53527;
                        switch (i4) {
                            case 17:
                                i4 = 53541;
                                break;
                            case 50:
                                ((Boolean) C0212.n(87909, set, new Object[]{str})).booleanValue();
                                int i5 = 53634;
                                while (true) {
                                    i5 ^= 53651;
                                    switch (i5) {
                                        case 17:
                                            i5 = 53665;
                                            break;
                                        case 50:
                                            int i6 = 53758;
                                            while (true) {
                                                i6 ^= 53775;
                                                switch (i6) {
                                                    case 1009:
                                                        i6 = 54440;
                                                        break;
                                                    case 1703:
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
                break;
            case 1:
                String str3 = (String) objN2;
                Object obj = (d) objN3;
                ((Integer) C0159.n(98298)).intValue();
                Object obj2 = (C0349e) objN;
                String str4 = (String) C0152.n(85600, null, new Object[]{(short[]) C0217.n(48245), 90, Integer.valueOf(C0042.f198 ^ 56), 2902});
                try {
                    try {
                        Intent intent = new Intent((String) C0195.n(85847, null, new Object[]{(short[]) C0217.n(48245), 93, Integer.valueOf(C0084.f293 ^ (-410)), 1735}));
                        C0217.n(58381, (Activity) C0232.n(25717, null, new Object[0]), new Object[]{intent});
                        runnableC0382v = new RunnableC0382v(obj2, obj, 1);
                        while (true) {
                            i ^= 51605;
                            switch (i) {
                                case 17:
                                    i = 51619;
                                    break;
                                case 54:
                                    return;
                            }
                        }
                    } catch (Throwable th2) {
                        int i7 = 51712;
                        while (true) {
                            i7 ^= 51729;
                            switch (i7) {
                                case 14:
                                    C0157.n(96203, null, new Object[]{new RunnableC0382v(obj2, obj, 1)});
                                    throw th2;
                                case 17:
                                    i7 = 51743;
                                    break;
                            }
                        }
                    }
                } catch (Exception e) {
                    C0177.n(98639, null, new Object[]{Integer.valueOf(((Integer) C0210.n(71584, null, new Object[]{str4})).intValue()), new RunnableC0341a(0, obj2), (String) C0213.n(38612, null, new Object[]{str4}), (String) C0217.n(47228, obj, new Object[0])});
                    runnableC0382v = new RunnableC0382v(obj2, obj, 1);
                    int i8 = 51836;
                    while (true) {
                        i8 ^= 51853;
                        switch (i8) {
                            case 241:
                                i8 = 52518;
                                continue;
                            case 1963:
                                break;
                            default:
                                continue;
                        }
                    }
                }
                obj = 96203;
                obj2 = new Object[]{runnableC0382v};
                C0157.n(96203, null, obj2);
                i = 51588;
                break;
            default:
                Map map = (Map) objN3;
                Map map2 = (Map) objN2;
                ((Integer) C0175.n(46748)).intValue();
                A0 a0 = (A0) objN;
                String str5 = (String) C0195.n(99405, null, new Object[]{(short[]) C0217.n(48245), 0, Integer.valueOf(C0102.f311 ^ 544), 2031});
                String str6 = (String) C0162.n(52865, null, new Object[]{(short[]) C0217.n(48245), 7, Integer.valueOf(C0066.f275 ^ 437), 1421});
                try {
                    Map map3 = (Map) C0226.n(56771, null, new Object[]{(String) C0188.n(56707, (N) C0205.n(60944, null, new Object[]{(String) C0157.n(97123, null, new Object[]{(short[]) C0217.n(48245), 13, Integer.valueOf(C0020.f176 ^ (-526)), 1157}), map, (HashMap) map2}), new Object[0])});
                    int i9 = 1616;
                    while (true) {
                        i9 ^= 1633;
                        switch (i9) {
                            case 14:
                                break;
                            case 49:
                                if (map3 != null) {
                                    i9 = 1709;
                                }
                                break;
                            case 204:
                                Object objN4 = C0157.n(70947, map3, new Object[]{str6});
                                int i10 = 1740;
                                while (true) {
                                    i10 ^= 1757;
                                    switch (i10) {
                                        case 17:
                                            if (objN4 == null) {
                                                i10 = 1833;
                                            }
                                            break;
                                        case 54:
                                            break;
                                        case 471:
                                            Object objN5 = C0157.n(70947, map3, new Object[]{str6});
                                            boolean z = objN5 instanceof Number;
                                            int i11 = 48767;
                                            while (true) {
                                                i11 ^= 48784;
                                                switch (i11) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        return;
                                                    case 76:
                                                        int iIntValue = ((Integer) C0189.n(47679, (Number) objN5, new Object[0])).intValue();
                                                        int i12 = 48891;
                                                        while (true) {
                                                            i12 ^= 48908;
                                                            switch (i12) {
                                                                case 22:
                                                                    break;
                                                                case 53:
                                                                    return;
                                                                case 503:
                                                                    if (iIntValue == 2000000) {
                                                                        i12 = 49635;
                                                                    }
                                                                    break;
                                                                case 32495:
                                                                    Map map4 = (Map) C0157.n(70947, map3, new Object[]{(String) C0162.n(83354, null, new Object[]{(short[]) C0217.n(48245), 72, Integer.valueOf(C0013.f169 ^ 667), 644})});
                                                                    int i13 = 49666;
                                                                    while (true) {
                                                                        i13 ^= 49683;
                                                                        switch (i13) {
                                                                            case 17:
                                                                                if (map4 != null) {
                                                                                    i13 = 49759;
                                                                                }
                                                                                break;
                                                                            case 50:
                                                                                break;
                                                                            case 76:
                                                                                Object objN6 = C0157.n(70947, map4, new Object[]{str5});
                                                                                int i14 = 49790;
                                                                                while (true) {
                                                                                    i14 ^= 49807;
                                                                                    switch (i14) {
                                                                                        case 18:
                                                                                            break;
                                                                                        case 51:
                                                                                            return;
                                                                                        case 84:
                                                                                            String str7 = (String) C0157.n(70947, (Map) C0157.n(70947, map4, new Object[]{str5}), new Object[]{(String) C0149.n(42779, null, new Object[]{(short[]) C0217.n(48245), 76, Integer.valueOf(C0078.f287 ^ (-704)), 1248})});
                                                                                            int i15 = 49914;
                                                                                            while (true) {
                                                                                                i15 ^= 49931;
                                                                                                switch (i15) {
                                                                                                    case 497:
                                                                                                        if (str7 != null) {
                                                                                                            i15 = 50658;
                                                                                                        }
                                                                                                        break;
                                                                                                    case 1711:
                                                                                                        break;
                                                                                                    case 1736:
                                                                                                        return;
                                                                                                    case 1769:
                                                                                                        boolean zBooleanValue2 = ((Boolean) C0195.n(5730, str7, new Object[0])).booleanValue();
                                                                                                        int i16 = 50689;
                                                                                                        while (true) {
                                                                                                            i16 ^= 50706;
                                                                                                            switch (i16) {
                                                                                                                case 19:
                                                                                                                    if (!zBooleanValue2) {
                                                                                                                        i16 = 50782;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 45:
                                                                                                                    return;
                                                                                                                case 50:
                                                                                                                    break;
                                                                                                                case 76:
                                                                                                                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C0175.n(39534, a0);
                                                                                                                    int i17 = 50813;
                                                                                                                    while (true) {
                                                                                                                        i17 ^= 50830;
                                                                                                                        switch (i17) {
                                                                                                                            case 18:
                                                                                                                                break;
                                                                                                                            case 53:
                                                                                                                                break;
                                                                                                                            case 243:
                                                                                                                                if (scheduledExecutorService != null) {
                                                                                                                                    i17 = 51557;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 4075:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                        i17 = 50875;
                                                                                                                    }
                                                                                                                    C0157.n(96203, null, new Object[]{new RunnableC0379t0(a0, str7, C0084.f293 ^ (-386))});
                                                                                                                    return;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                            }
                                                                                                            i16 = 50751;
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                                i15 = 50627;
                                                                                            }
                                                                                            break;
                                                                                        case 241:
                                                                                            if (objN6 != null) {
                                                                                                i14 = 49883;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    i14 = 49852;
                                                                                }
                                                                                break;
                                                                            case 83:
                                                                                return;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        i13 = 49728;
                                                                    }
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                            i12 = 48953;
                                                        }
                                                        break;
                                                    case 239:
                                                        if (z) {
                                                            i11 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                i11 = 48829;
                                            }
                                            break;
                                        case 500:
                                            int i18 = 1864;
                                            while (true) {
                                                i18 ^= 1881;
                                                switch (i18) {
                                                    case 17:
                                                        i18 = 48674;
                                                        break;
                                                    case 47483:
                                                        return;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i10 = 1802;
                                }
                                break;
                            case 239:
                                return;
                            default:
                                continue;
                        }
                        i9 = 1678;
                    }
                } catch (Exception e2) {
                    int i19 = 54533;
                    while (true) {
                        i19 ^= 54550;
                        switch (i19) {
                            case 19:
                                i19 = 54564;
                                break;
                            case 50:
                                return;
                        }
                    }
                }
                break;
        }
    }
}
