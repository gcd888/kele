package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.app.AlertDialog;
import android.database.sqlite.SQLiteConstraintException;
import android.widget.LinearLayout;
import com.github.catvod.spider.C0141;
import com.github.catvod.spider.merge.B.C0004;
import com.github.catvod.spider.merge.B.C0005;
import com.github.catvod.spider.merge.E.C0013;
import com.github.catvod.spider.merge.E.C0015;
import com.github.catvod.spider.merge.G.C0022;
import com.github.catvod.spider.merge.L.C0031;
import com.github.catvod.spider.merge.L.C0033;
import com.github.catvod.spider.merge.N.C0035;
import com.github.catvod.spider.merge.N.C0036;
import com.github.catvod.spider.merge.O.C0039;
import com.github.catvod.spider.merge.Q.C0040;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.T.C0048;
import com.github.catvod.spider.merge.Z.C0054;
import com.github.catvod.spider.merge.b0.C0060;
import com.github.catvod.spider.merge.b0.C0061;
import com.github.catvod.spider.merge.c0.C0064;
import com.github.catvod.spider.merge.d0.C0068;
import com.github.catvod.spider.merge.f0.C0078;
import com.github.catvod.spider.merge.f0.C0080;
import com.github.catvod.spider.merge.h0.C0086;
import com.github.catvod.spider.merge.j0.C0094;
import com.github.catvod.spider.merge.k0.C0100;
import com.github.catvod.spider.merge.p0.C0110;
import com.github.catvod.spider.merge.p0.C0111;
import com.github.catvod.spider.merge.p001b.C0058;
import com.github.catvod.spider.merge.p002c.C0062;
import com.github.catvod.spider.merge.p003d.C0066;
import com.github.catvod.spider.merge.p003d.C0067;
import com.github.catvod.spider.merge.p004e.C0071;
import com.github.catvod.spider.merge.p007h.C0083;
import com.github.catvod.spider.merge.p007h.C0084;
import com.github.catvod.spider.merge.p016t.C0121;
import com.github.catvod.spider.merge.p017u.C0129;
import com.github.catvod.spider.merge.p018v.C0132;
import com.github.catvod.spider.merge.p019w.C0134;
import com.github.catvod.spider.merge.t0.C0124;
import com.github.catvod.utils.C0144;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0153;
import moyu.fucking.C0155;
import moyu.fucking.C0157;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0176;
import moyu.fucking.C0178;
import moyu.fucking.C0179;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0186;
import moyu.fucking.C0187;
import moyu.fucking.C0188;
import moyu.fucking.C0191;
import moyu.fucking.C0194;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0201;
import moyu.fucking.C0205;
import moyu.fucking.C0209;
import moyu.fucking.C0210;
import moyu.fucking.C0213;
import moyu.fucking.C0216;
import moyu.fucking.C0219;
import moyu.fucking.C0221;
import moyu.fucking.C0224;
import moyu.fucking.C0232;
import moyu.fucking.C0233;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0315z1 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f156short = {1471, 1458, 1419, 1408, 1450, 1419, 1424, 1421, 1415, 1409, 1465, 1476, 1416, 1419, 1415, 1413, 1416, 1476, 1431, 1424, 1413, 1430, 1424, 1425, 1428, 1476, 1410, 1413, 1421, 1416, 1409, 1408, 1502, 1476, 816, 829, 772, 783, 805, 772, 799, 770, 776, 782, 822, 843, 793, 782, 774, 772, 799, 782, 843, 1971, 1956, 1954, 1960, 2222, 2217, 2209, 2212, 2221, 2220, 2457, 2453, 2526, 2512, 2512, 2501, 2524, 2523, 2514, 2453, 2518, 2522, 2520, 2520, 2524, 2497, 2497, 2512, 2513, 2453, 2518, 2522, 2523, 2515, 2524, 2514, 2496, 2503, 2516, 2497, 2524, 2522, 2523, 1741, 1729, 1677, 1678, 1666, 1664, 1677, 1729, 1666, 1678, 1679, 1671, 1672, 1670, 1684, 1683, 1664, 1685, 1672, 1678, 1679, 1729, 1681, 1668, 1679, 1669, 1672, 1679, 1670, 989, 1010, 1000, 1011, 988, 1012, 950, 976, 1010, 1015, 1015, 968, 1007, 1012, 1003, 2930, 2943, 2886, 2893, 2919, 2886, 2909, 2880, 2890, 2892, 2932, 2825, 2907, 2892, 2890, 2886, 2911, 2892, 2907, 2896, 2825, 2895, 2888, 2880, 2885, 2892, 2893, 2835, 2825, 25893, 25782, 21006, 21114, 23674, 21892, 27373, -31890, 22993, 32482, 22476, 20897, 22994, -30928, 23951, -25206, 29609, 3216, 3234, 3237, 3203, 3206, 3217, 22526, 26775, 26187, 23805, 25060, -28972, 20485, 24064, 20522, 25862, -770, 25822, 26835, 22526, 26775, 24064, 20516, 28282, 28400, 28515, 23003, 22959, 24145, 24888, 21356, -30856, 26390, 26245, 20541, 20553, 21026, 21214, 23178, -29026, -841, -30644, 25935, 26123, 22453, -28042, -30610, 1690, 21831, 21811, 21197, 28068, 1692, 1761, 28214, 28581, 22813, 22889, 22377, 25758, -25345, 24337, 21729, 32307, -28227, 19012, -30214, 30067, 29099, 22544, 18760, 23581, 20589, -1975, -29518, 22029, 21854, 22975, 29099, 22544, 27464, 24292, 23085, 16968, 26986, 28484, 3093, 3088, 3089, 27132, 24720, -31141, 21552, 17849, 20716, 23708, -2888, -32701, 25460, 27729, 3043, 3025, 3030, 3056, 3061, 3042, 23684, 23796, 27021, 24052, 23816, 27438, -26051, -31880, -31971, 20973, -31239, -2096, -31957, 24604, 28473, 32244, 27371, 23761, 21274, 28893, 29448, 25623, 21037, 24842, -26771, 31054, 303, 285, 282, 316, 313, 302, 22088, 22072, 26194, -28619, 32278, 27409, 28229, 24075, 21820, 17094, 27068, 17101, 2437, 2440, 2451, 2449, 2456, 2452, 1064, 1082, 1070, 1057, 1064, 1078, 1070, 668, 668, 664, 29693, 22951, 17837, 17719, -31679, 22222, -31849, 24370, 22732, 23119, -24879, 607, 578, 607, 583, 590, 21963, -32622, 23607, 23497, 22858, -25132, 25444, 19435, 22025, 28878, 30085, -28109, 19686, 457, 478, 479, 479, 452, 453, 2550, 2555, 2528, 2530, 2539, 2535, 1573, 1573, 1569, -30327, 21846, 23786, 30550, 30514, -27364, 19539, 26291, 19746, 2757, 2775, 2755, 2764, 2757, 2779, 2755, 21826, 21180, 23742, 20543, -27487, 31117, 21463, 20445, 20295, -29135, -448, -32602, 21476, 28489, 30026, 20289, 21155, 29796, 1735, 1736, 1729, 1733, 1738, 1745, 1748, 31331, 20537, -31928, 20490, 27815, 30372, 20614, 20651, 31009, 30342, 689, 689, 693, 12929, 21449, -25427, 22028, -29371, -27529, 29700, 19594, 27041, 19579, 20513, 27781, 30342, 23936, 21491, 12930, -31919, 20499, 27838, 30397, 25902, 18522, 25422, 18437, 21599, 21683, 21726, -28518, -29413, 18543, 28710, 18676, 18686, 28127, 32319, 21605, 18437, 21599, 28688, 22955, 20883, 22125, 21742, -28560, 25165, 19383, 19212, 29509, 24683, -1391, 24164, 23305, 27544, 29083, 23197, 21742, 19344, 19079, 28802, 24789, 13727, 28897, 21269, 21997, 27571, -25907, 29934, 21169, -31067, 3002, 2976};
    public final int a;

    public /* synthetic */ RunnableC0315z1(int i) throws Throwable {
        this.a = i;
        int iIntValue = ((Integer) C0178.n(64879, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0221.n(83422, null, new Object[]{(String) C0210.n(52029)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    private final void a() throws Throwable {
        boolean zBooleanValue;
        try {
            C0210.n(37082, null, new Object[0]);
            synchronized (C0155.n(12541)) {
                C0178.n(58539, (AtomicBoolean) C0205.n(24596), new Object[]{false});
                zBooleanValue = ((Boolean) C0210.n(96278, (AtomicBoolean) C0155.n(69654), new Object[]{false})).booleanValue();
            }
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
                        C0210.n(49492, null, new Object[0]);
                        return;
                    case 239:
                        return;
                    default:
                        continue;
                }
                i = 1678;
            }
        } catch (Throwable th) {
            synchronized (C0155.n(12541)) {
                C0178.n(58539, (AtomicBoolean) C0205.n(24596), new Object[]{false});
                boolean zBooleanValue2 = ((Boolean) C0210.n(96278, (AtomicBoolean) C0155.n(69654), new Object[]{false})).booleanValue();
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
                            throw th;
                        case 500:
                            C0210.n(49492, null, new Object[0]);
                            throw th;
                        default:
                            continue;
                    }
                    i2 = 1802;
                }
            }
        }
    }

    private final void b() throws Throwable {
        String str;
        int i;
        String str2;
        String str3;
        int i2 = 1;
        C0210.n(13561, (J1) C0152.n(33857), new Object[0]);
        synchronized (N1.class) {
            N1.P = ((Long) C0168.n(75627, null, new Object[0])).longValue() + 60000;
        }
        try {
            C0195.n(90553, null, new Object[0]);
            ((Boolean) C0210.n(77441, null, new Object[]{Long.valueOf(((Long) C0157.n(13709)).longValue())})).booleanValue();
            C0191.n(67363, null, new Object[0]);
            C0168.n(21710, null, new Object[0]);
            C0191.n(24520, null, new Object[0]);
            int i3 = 1616;
            while (true) {
                i3 ^= 1633;
                switch (i3) {
                    case 14:
                        break;
                    case 49:
                        i3 = 1647;
                        continue;
                    default:
                        continue;
                }
                C0157.n(35625, null, new Object[0]);
                L1 l1 = (L1) C0210.n(47361, null, new Object[]{true});
                L1 l2 = (L1) C0191.n(56936);
                int i4 = 1740;
                while (true) {
                    i4 ^= 1757;
                    switch (i4) {
                        case 17:
                            i4 = l1 != l2 ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case 500:
                            StringBuilder sb = new StringBuilder((String) C0149.n(34115, null, new Object[]{(short[]) C0210.n(96994), 34, Integer.valueOf(C0068.f277 ^ 374), 875}));
                            L1 l3 = (L1) C0191.n(82790);
                            int i5 = 1864;
                            while (true) {
                                i5 ^= 1881;
                                switch (i5) {
                                    case 17:
                                        i5 = l1 == l3 ? 48736 : 48705;
                                        break;
                                    case 47384:
                                        str2 = (String) C0162.n(68576, null, new Object[]{(short[]) C0210.n(96994), 57, Integer.valueOf(C0064.f273 ^ (-434)), 2248});
                                        break;
                                    case 47417:
                                        str2 = (String) C0195.n(85847, null, new Object[]{(short[]) C0210.n(96994), 53, Integer.valueOf(C0061.f270 ^ (-922)), 2001});
                                        int i6 = 48767;
                                        while (true) {
                                            i6 ^= 48784;
                                            switch (i6) {
                                                case 14:
                                                    break;
                                                case 239:
                                                    i6 = 48798;
                                                    continue;
                                                default:
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
                            boolean zBooleanValue = ((Boolean) C0198.n(13233)).booleanValue();
                            int i7 = 48891;
                            while (true) {
                                i7 ^= 48908;
                                switch (i7) {
                                    case 22:
                                        break;
                                    case 53:
                                        str3 = (String) C0149.n(36390, null, new Object[]{(short[]) C0210.n(96994), 96, Integer.valueOf(C0078.f287 ^ (-685)), 1761});
                                        break;
                                    case 503:
                                        i7 = zBooleanValue ? 49635 : 48953;
                                        break;
                                    case 32495:
                                        str3 = (String) C0198.n(71923, null, new Object[]{(short[]) C0210.n(96994), 63, Integer.valueOf(C0086.f295 ^ (-372)), 2485});
                                        int i8 = 49666;
                                        while (true) {
                                            i8 ^= 49683;
                                            switch (i8) {
                                                case 17:
                                                    i8 = 49697;
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
                            C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb, new Object[0])});
                            JSONObject jSONObject = (JSONObject) C0155.n(72677);
                            int i9 = 49790;
                            while (true) {
                                i9 ^= 49807;
                                switch (i9) {
                                    case 18:
                                        break;
                                    case 51:
                                        break;
                                    case 84:
                                        C0191.n(24520, null, new Object[0]);
                                        break;
                                    case 241:
                                        if (jSONObject != null) {
                                            i9 = 49883;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i9 = 49852;
                            }
                            break;
                        default:
                            break;
                    }
                }
                boolean zBooleanValue2 = ((Boolean) C0195.n(96562, null, new Object[0])).booleanValue();
                int i10 = 49914;
                while (true) {
                    i10 ^= 49931;
                    switch (i10) {
                        case 497:
                            if (zBooleanValue2) {
                                i10 = 50658;
                            }
                            break;
                        case 1711:
                            break;
                        case 1736:
                            int i11 = 51836;
                            while (true) {
                                i11 ^= 51853;
                                switch (i11) {
                                    case 241:
                                        i11 = l1 != l2 ? 52580 : 52549;
                                        break;
                                    case 1963:
                                        break;
                                    case 1992:
                                        break;
                                    case 2025:
                                        C0157.n(35625, null, new Object[0]);
                                        break;
                                    default:
                                        break;
                                }
                            }
                            String str4 = (String) C0210.n(69227);
                            L1 l4 = (L1) C0191.n(82790);
                            int i12 = 52611;
                            while (true) {
                                i12 ^= 52628;
                                switch (i12) {
                                    case 23:
                                        if (l1 != l4) {
                                            i12 = 52704;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 85:
                                        break;
                                    case 116:
                                        int i13 = 52735;
                                        while (true) {
                                            i13 ^= 52752;
                                            switch (i13) {
                                                case 14:
                                                    break;
                                                case 45:
                                                    break;
                                                case 1007:
                                                    if (str4 != null) {
                                                        i13 = 53479;
                                                    }
                                                    break;
                                                case 7927:
                                                    boolean zBooleanValue3 = ((Boolean) C0195.n(5730, str4, new Object[0])).booleanValue();
                                                    int i14 = 53510;
                                                    while (true) {
                                                        i14 ^= 53527;
                                                        switch (i14) {
                                                            case 17:
                                                                if (!zBooleanValue3) {
                                                                    i14 = 53603;
                                                                }
                                                                break;
                                                            case 50:
                                                                break;
                                                            case 83:
                                                                break;
                                                            case 116:
                                                                C0188.n(1950, null, new Object[]{str4});
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        i14 = 53572;
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i13 = 52797;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i12 = 52673;
                            }
                            break;
                        case 1769:
                            boolean zBooleanValue4 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0210.n(59060)})).booleanValue();
                            int i15 = 50689;
                            while (true) {
                                i15 ^= 50706;
                                switch (i15) {
                                    case 19:
                                        i15 = !zBooleanValue4 ? 50782 : 50751;
                                        break;
                                    case 45:
                                        str = (String) C0181.n(51763);
                                        break;
                                    case 50:
                                        break;
                                    case 76:
                                        str = (String) C0210.n(59060);
                                        int i16 = 50813;
                                        while (true) {
                                            i16 ^= 50830;
                                            switch (i16) {
                                                case 18:
                                                    break;
                                                case 243:
                                                    i16 = 50844;
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
                            C0188.n(1950, null, new Object[]{str});
                            String str5 = (String) C0210.n(19945);
                            boolean zBooleanValue5 = ((Boolean) C0195.n(41159, null, new Object[]{str5})).booleanValue();
                            int i17 = 51588;
                            while (true) {
                                i17 ^= 51605;
                                switch (i17) {
                                    case 17:
                                        i17 = !zBooleanValue5 ? 51681 : 51650;
                                        break;
                                    case 54:
                                        break;
                                    case 87:
                                        break;
                                    case 116:
                                        C0152.n(52927, null, new Object[]{new V0(str5, i2)});
                                        break;
                                    default:
                                        break;
                                }
                            }
                            try {
                                try {
                                    Thread thread = new Thread(new RunnableC0315z1(C0084.f293 ^ (-395)), (String) C0181.n(53852, null, new Object[]{(short[]) C0210.n(96994), 125, Integer.valueOf(C0086.f295 ^ (-350)), 923}));
                                    C0210.n(60380, thread, new Object[]{true});
                                    C0153.n(32303, thread, new Object[0]);
                                    while (true) {
                                        i ^= 51729;
                                        switch (i) {
                                            case 14:
                                                break;
                                            case 17:
                                                i = 51743;
                                                break;
                                        }
                                    }
                                } catch (Throwable th) {
                                    int i18 = 53758;
                                    while (true) {
                                        i18 ^= 53775;
                                        switch (i18) {
                                            case 1009:
                                                i18 = 54440;
                                                continue;
                                            case 1703:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                }
                                C0149.n(7264, null, new Object[]{Long.valueOf(((long) C0141.f351) ^ (-2231))});
                                break;
                            } catch (Exception e) {
                                int i19 = 54533;
                                while (true) {
                                    i19 ^= 54550;
                                    switch (i19) {
                                        case 19:
                                            i19 = 54564;
                                            continue;
                                        case 50:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                            }
                            C0210.n(18046, null, new Object[0]);
                            C0210.n(68010, null, new Object[0]);
                            i = 51712;
                            break;
                        default:
                            continue;
                    }
                    i10 = 50627;
                }
                int iIntValue = ((Integer) C0186.n(85241, null, new Object[0])).intValue();
                int i20 = 53634;
                while (true) {
                    i20 ^= 53651;
                    switch (i20) {
                        case 17:
                            if (iIntValue <= 0) {
                                i20 = 53727;
                            }
                            break;
                        case 50:
                            break;
                        case 76:
                            C0195.n(19817, (PrintStream) C0195.n(72538), new Object[]{Integer.valueOf(((Integer) C0195.n(60398, null, new Object[]{(String) C0188.n(78246, null, new Object[]{(String) C0210.n(15620)})})).intValue())});
                            return;
                        case 83:
                            return;
                        default:
                            continue;
                    }
                    i20 = 53696;
                }
            }
        } catch (Throwable th2) {
            C0152.n(11548, null, new Object[]{(String) C0198.n(26710, (String) C0182.n(69249, null, new Object[]{(short[]) C0210.n(96994), 0, Integer.valueOf(C0068.f277 ^ 327), 1508}), new Object[]{((Class) C0149.n(32719, th2, new Object[0])).getSimpleName()})});
        }
    }

    /* JADX WARN: Code duplicated, block: B:185:0x029b  */
    /* JADX WARN: Code duplicated, block: B:219:0x0313  */
    /* JADX WARN: Code duplicated, block: B:240:0x0355  */
    /* JADX WARN: Code duplicated, block: B:266:0x038f  */
    /* JADX WARN: Code duplicated, block: B:303:0x0475  */
    /* JADX WARN: Code duplicated, block: B:389:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x04ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x0073 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x039d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x02f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x02f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:0x0364 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:600:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x03d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:0x03e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:0x03db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x0488 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:0x03f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x0483 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x011b  */
    private final void c() throws Throwable {
        Object obj;
        int i;
        int i2;
        long jLongValue;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iIntValue;
        boolean zBooleanValue;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z = true;
        long jLongValue2 = ((Long) C0157.n(13709)).longValue();
        try {
            C0195.n(90553, null, new Object[0]);
            jLongValue2 = ((Long) C0157.n(13709)).longValue();
            boolean zBooleanValue2 = ((Boolean) C0210.n(77441, null, new Object[]{Long.valueOf(jLongValue2)})).booleanValue();
            long jLongValue3 = ((Long) C0157.n(13709)).longValue();
            int i12 = 1616;
            while (true) {
                i12 ^= 1633;
                switch (i12) {
                    case 14:
                        break;
                    case 49:
                        i12 = jLongValue2 != jLongValue3 ? 1709 : 1678;
                        break;
                    case 204:
                        synchronized (N1.class) {
                            N1.y = false;
                            break;
                        }
                        break;
                    case 239:
                        boolean zBooleanValue3 = ((Boolean) C0195.n(96562, null, new Object[0])).booleanValue();
                        int i13 = 1864;
                        while (true) {
                            i13 ^= 1881;
                            switch (i13) {
                                case 17:
                                    i13 = zBooleanValue3 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    boolean zBooleanValue4 = ((Boolean) C0188.n(61683)).booleanValue();
                                    int i14 = 50689;
                                    while (true) {
                                        i14 ^= 50706;
                                        switch (i14) {
                                            case 19:
                                                if (zBooleanValue4) {
                                                    i14 = 50782;
                                                }
                                                break;
                                            case 45:
                                                break;
                                            case 50:
                                                break;
                                            case 76:
                                                boolean zBooleanValue5 = ((Boolean) C0216.n(92508, null, new Object[0])).booleanValue();
                                                int i15 = 50813;
                                                while (true) {
                                                    i15 ^= 50830;
                                                    switch (i15) {
                                                        case 18:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 243:
                                                            if (!zBooleanValue5) {
                                                                i15 = 51557;
                                                            }
                                                            break;
                                                        case 4075:
                                                            boolean zBooleanValue6 = ((Boolean) C0191.n(51083)).booleanValue();
                                                            int i16 = 51588;
                                                            while (true) {
                                                                i16 ^= 51605;
                                                                switch (i16) {
                                                                    case 17:
                                                                        if (!zBooleanValue6) {
                                                                            i16 = 51681;
                                                                        }
                                                                        break;
                                                                    case 54:
                                                                        break;
                                                                    case 87:
                                                                        break;
                                                                    case 116:
                                                                        N1.O = false;
                                                                        break;
                                                                    default:
                                                                        continue;
                                                                }
                                                                i16 = 51650;
                                                            }
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    i15 = 50875;
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i14 = 50751;
                                    }
                                    synchronized (N1.class) {
                                        try {
                                            long jLongValue4 = ((Long) C0157.n(13709)).longValue();
                                            int i17 = 51712;
                                            while (true) {
                                                i17 ^= 51729;
                                                switch (i17) {
                                                    case 14:
                                                        break;
                                                    case 17:
                                                        i17 = jLongValue2 == jLongValue4 ? 51805 : 51774;
                                                        break;
                                                    case 47:
                                                        synchronized (N1.class) {
                                                            N1.y = false;
                                                        }
                                                        i6 = 1508526;
                                                        while (true) {
                                                            i6 ^= 1508543;
                                                            switch (i6) {
                                                                case 17:
                                                                    i6 = 1508557;
                                                                    continue;
                                                                    continue;
                                                                case 114:
                                                                    break;
                                                                default:
                                                                    continue;
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 76:
                                                        boolean zBooleanValue7 = ((Boolean) C0216.n(25337)).booleanValue();
                                                        int i18 = 51836;
                                                        while (true) {
                                                            i18 ^= 51853;
                                                            switch (i18) {
                                                                case 241:
                                                                    i18 = zBooleanValue7 ? 52580 : 52549;
                                                                    break;
                                                                case 1963:
                                                                    break;
                                                                case 1992:
                                                                    boolean zBooleanValue8 = ((Boolean) C0216.n(54806)).booleanValue();
                                                                    int i19 = 52735;
                                                                    while (true) {
                                                                        i19 ^= 52752;
                                                                        switch (i19) {
                                                                            case 14:
                                                                                break;
                                                                            case 45:
                                                                                i7 = 55556;
                                                                                while (true) {
                                                                                    i7 ^= 55573;
                                                                                    switch (i7) {
                                                                                        case 17:
                                                                                            i7 = !zBooleanValue2 ? 55649 : 55618;
                                                                                            break;
                                                                                        case 54:
                                                                                            break;
                                                                                        case 87:
                                                                                            break;
                                                                                        case 116:
                                                                                            N1.N = false;
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    iIntValue = ((Integer) C0210.n(73420)).intValue();
                                                                                    N1.M = -1;
                                                                                    try {
                                                                                        zBooleanValue = ((Boolean) C0198.n(13233)).booleanValue();
                                                                                        i8 = 55680;
                                                                                        while (true) {
                                                                                            i8 ^= 55697;
                                                                                            switch (i8) {
                                                                                                case 17:
                                                                                                    i8 = !zBooleanValue ? 56424 : 56393;
                                                                                                    break;
                                                                                                case 1467:
                                                                                                    break;
                                                                                                case 1496:
                                                                                                    C0210.n(20490, null, new Object[]{Integer.valueOf(iIntValue), Long.valueOf(jLongValue2)});
                                                                                                    synchronized (N1.class) {
                                                                                                        N1.y = false;
                                                                                                    }
                                                                                                    i9 = 1507503;
                                                                                                    while (true) {
                                                                                                        i9 ^= 1507520;
                                                                                                        switch (i9) {
                                                                                                            case 14:
                                                                                                                break;
                                                                                                            case 111:
                                                                                                                i9 = 1507534;
                                                                                                                break;
                                                                                                            default:
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 1529:
                                                                                                    synchronized (N1.class) {
                                                                                                        N1.y = false;
                                                                                                    }
                                                                                                    i10 = 56455;
                                                                                                    while (true) {
                                                                                                        i10 ^= 56472;
                                                                                                        switch (i10) {
                                                                                                            case 31:
                                                                                                                i10 = 56486;
                                                                                                                break;
                                                                                                            case 62:
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
                                                                                    } catch (Throwable th) {
                                                                                        int i20 = 1507627;
                                                                                        while (true) {
                                                                                            i20 ^= 1507644;
                                                                                            switch (i20) {
                                                                                                case 23:
                                                                                                    i20 = 1507658;
                                                                                                    continue;
                                                                                                case 118:
                                                                                                    int i21 = 56579;
                                                                                                    while (true) {
                                                                                                        i21 ^= 56596;
                                                                                                        switch (i21) {
                                                                                                            case 23:
                                                                                                                i21 = 56610;
                                                                                                                continue;
                                                                                                            case 54:
                                                                                                                obj = th;
                                                                                                                break;
                                                                                                            default:
                                                                                                                continue;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                            }
                                                                                            try {
                                                                                                synchronized (N1.class) {
                                                                                                    i = 1509549;
                                                                                                    while (true) {
                                                                                                        i ^= 1509566;
                                                                                                        try {
                                                                                                            switch (i) {
                                                                                                                case 19:
                                                                                                                    i = !z ? 1509642 : 1509611;
                                                                                                                    break;
                                                                                                                case 85:
                                                                                                                    break;
                                                                                                                case 114:
                                                                                                                    break;
                                                                                                                case 436:
                                                                                                                    try {
                                                                                                                        jLongValue = ((Long) C0157.n(13709)).longValue();
                                                                                                                        i3 = 1509673;
                                                                                                                        while (true) {
                                                                                                                            i3 ^= 1509690;
                                                                                                                            switch (i3) {
                                                                                                                                case 19:
                                                                                                                                    i3 = jLongValue2 == jLongValue ? 1510417 : 1510386;
                                                                                                                                    break;
                                                                                                                                case 712:
                                                                                                                                    break;
                                                                                                                                case 745:
                                                                                                                                    break;
                                                                                                                                case 1323:
                                                                                                                                    N1.N = false;
                                                                                                                                    i4 = 1510448;
                                                                                                                                    while (true) {
                                                                                                                                        i4 ^= 1510465;
                                                                                                                                        switch (i4) {
                                                                                                                                            case 14:
                                                                                                                                                break;
                                                                                                                                            case 113:
                                                                                                                                                i4 = 1510479;
                                                                                                                                                continue;
                                                                                                                                                continue;
                                                                                                                                                continue;
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
                                                                                                                    } catch (Throwable th2) {
                                                                                                                        int i22 = 1510572;
                                                                                                                        while (true) {
                                                                                                                            i22 ^= 1510589;
                                                                                                                            switch (i22) {
                                                                                                                                case 17:
                                                                                                                                    i22 = 1510603;
                                                                                                                                    break;
                                                                                                                                case 118:
                                                                                                                                    throw th2;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        } catch (Throwable th3) {
                                                                                                            throw th3;
                                                                                                        }
                                                                                                    }
                                                                                                    StringBuilder sb = new StringBuilder();
                                                                                                    C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb, new Object[0])});
                                                                                                    synchronized (N1.class) {
                                                                                                        N1.y = false;
                                                                                                        i2 = 1511347;
                                                                                                        while (true) {
                                                                                                            i2 ^= 1511364;
                                                                                                            switch (i2) {
                                                                                                                case 22:
                                                                                                                    break;
                                                                                                                case 119:
                                                                                                                    i2 = 1511378;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } catch (Throwable th4) {
                                                                                                int i23 = 1511471;
                                                                                                while (true) {
                                                                                                    i23 ^= 1511488;
                                                                                                    switch (i23) {
                                                                                                        case 14:
                                                                                                            synchronized (N1.class) {
                                                                                                                try {
                                                                                                                    N1.y = false;
                                                                                                                    C0168.n(32725, null, new Object[0]);
                                                                                                                    C0168.n(89781, null, new Object[0]);
                                                                                                                    throw th4;
                                                                                                                } catch (Throwable th5) {
                                                                                                                    int i24 = 1511595;
                                                                                                                    while (true) {
                                                                                                                        i24 ^= 1511612;
                                                                                                                        switch (i24) {
                                                                                                                            case 23:
                                                                                                                                i24 = 1512277;
                                                                                                                                break;
                                                                                                                            case 1001:
                                                                                                                                int i25 = 1512370;
                                                                                                                                while (true) {
                                                                                                                                    i25 ^= 1512387;
                                                                                                                                    switch (i25) {
                                                                                                                                        case 18:
                                                                                                                                            throw th5;
                                                                                                                                        case 113:
                                                                                                                                            i25 = 1512401;
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            break;
                                                                                                        case 111:
                                                                                                            i23 = 1511502;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    int i26 = 1507751;
                                                                                    while (true) {
                                                                                        i26 ^= 1507768;
                                                                                        switch (i26) {
                                                                                            case 31:
                                                                                                i26 = 1508433;
                                                                                                continue;
                                                                                            case 1513:
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        try {
                                                                                                            throw th;
                                                                                                        } catch (Throwable th7) {
                                                                                                            int i27 = 1508650;
                                                                                                            while (true) {
                                                                                                                i27 ^= 1508667;
                                                                                                                switch (i27) {
                                                                                                                    case 17:
                                                                                                                        i27 = 1508681;
                                                                                                                        continue;
                                                                                                                    case 114:
                                                                                                                        obj = th7;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        continue;
                                                                                                                }
                                                                                                                synchronized (N1.class) {
                                                                                                                    i = 1509549;
                                                                                                                    while (true) {
                                                                                                                        i ^= 1509566;
                                                                                                                        switch (i) {
                                                                                                                            case 19:
                                                                                                                                if (!z) {
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 85:
                                                                                                                                break;
                                                                                                                            case 114:
                                                                                                                                break;
                                                                                                                            case 436:
                                                                                                                                jLongValue = ((Long) C0157.n(13709)).longValue();
                                                                                                                                i3 = 1509673;
                                                                                                                                while (true) {
                                                                                                                                    i3 ^= 1509690;
                                                                                                                                    switch (i3) {
                                                                                                                                        case 19:
                                                                                                                                            if (jLongValue2 == jLongValue) {
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 712:
                                                                                                                                            break;
                                                                                                                                        case 745:
                                                                                                                                            break;
                                                                                                                                        case 1323:
                                                                                                                                            N1.N = false;
                                                                                                                                            i4 = 1510448;
                                                                                                                                            while (true) {
                                                                                                                                                i4 ^= 1510465;
                                                                                                                                                switch (i4) {
                                                                                                                                                    case 14:
                                                                                                                                                        break;
                                                                                                                                                    case 113:
                                                                                                                                                        i4 = 1510479;
                                                                                                                                                        continue;
                                                                                                                                                        continue;
                                                                                                                                                        continue;
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
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                                    C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb2, new Object[0])});
                                                                                                                    synchronized (N1.class) {
                                                                                                                        N1.y = false;
                                                                                                                        i2 = 1511347;
                                                                                                                        while (true) {
                                                                                                                            i2 ^= 1511364;
                                                                                                                            switch (i2) {
                                                                                                                                case 22:
                                                                                                                                    break;
                                                                                                                                case 119:
                                                                                                                                    i2 = 1511378;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                default:
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                                    continue;
                                                                                                                            }
                                                                                                                            C0168.n(32725, null, new Object[0]);
                                                                                                                            C0168.n(89781, null, new Object[0]);
                                                                                                                            i5 = 1740;
                                                                                                                            while (true) {
                                                                                                                                i5 ^= 1757;
                                                                                                                                switch (i5) {
                                                                                                                                    case 17:
                                                                                                                                        i5 = 1771;
                                                                                                                                        break;
                                                                                                                                    case 54:
                                                                                                                                        return;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Throwable th8) {
                                                                                                        int i28 = 1509425;
                                                                                                        while (true) {
                                                                                                            i28 ^= 1509442;
                                                                                                            switch (i28) {
                                                                                                                case 18:
                                                                                                                    break;
                                                                                                                case 115:
                                                                                                                    i28 = 1509456;
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        th = th8;
                                                                                                    }
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                continue;
                                                                                        }
                                                                                        synchronized (N1.class) {
                                                                                            i = 1509549;
                                                                                            while (true) {
                                                                                                i ^= 1509566;
                                                                                                switch (i) {
                                                                                                    case 19:
                                                                                                        if (!z) {
                                                                                                        }
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        break;
                                                                                                    case 114:
                                                                                                        break;
                                                                                                    case 436:
                                                                                                        jLongValue = ((Long) C0157.n(13709)).longValue();
                                                                                                        i3 = 1509673;
                                                                                                        while (true) {
                                                                                                            i3 ^= 1509690;
                                                                                                            switch (i3) {
                                                                                                                case 19:
                                                                                                                    if (jLongValue2 == jLongValue) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 712:
                                                                                                                    break;
                                                                                                                case 745:
                                                                                                                    break;
                                                                                                                case 1323:
                                                                                                                    N1.N = false;
                                                                                                                    i4 = 1510448;
                                                                                                                    while (true) {
                                                                                                                        i4 ^= 1510465;
                                                                                                                        switch (i4) {
                                                                                                                            case 14:
                                                                                                                                break;
                                                                                                                            case 113:
                                                                                                                                i4 = 1510479;
                                                                                                                                continue;
                                                                                                                                continue;
                                                                                                                                continue;
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
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            StringBuilder sb3 = new StringBuilder();
                                                                                            C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb3, new Object[0])});
                                                                                            synchronized (N1.class) {
                                                                                                N1.y = false;
                                                                                                i2 = 1511347;
                                                                                                while (true) {
                                                                                                    i2 ^= 1511364;
                                                                                                    switch (i2) {
                                                                                                        case 22:
                                                                                                            break;
                                                                                                        case 119:
                                                                                                            i2 = 1511378;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                            continue;
                                                                                                    }
                                                                                                    C0168.n(32725, null, new Object[0]);
                                                                                                    C0168.n(89781, null, new Object[0]);
                                                                                                    i5 = 1740;
                                                                                                    while (true) {
                                                                                                        i5 ^= 1757;
                                                                                                        switch (i5) {
                                                                                                            case 17:
                                                                                                                i5 = 1771;
                                                                                                                break;
                                                                                                            case 54:
                                                                                                                return;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1007:
                                                                                i19 = !zBooleanValue8 ? 53479 : 52797;
                                                                                break;
                                                                            case 7927:
                                                                                int i29 = 53510;
                                                                                while (true) {
                                                                                    i29 ^= 53527;
                                                                                    switch (i29) {
                                                                                        case 17:
                                                                                            i29 = zBooleanValue2 ? 53603 : 53572;
                                                                                            break;
                                                                                        case 50:
                                                                                            break;
                                                                                        case 83:
                                                                                            synchronized (N1.class) {
                                                                                                N1.y = false;
                                                                                            }
                                                                                            i11 = 55432;
                                                                                            while (true) {
                                                                                                i11 ^= 55449;
                                                                                                switch (i11) {
                                                                                                    case 17:
                                                                                                        i11 = 55463;
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
                                                                                        case 116:
                                                                                            String str = (String) C0191.n(29240);
                                                                                            int i30 = 53634;
                                                                                            while (true) {
                                                                                                i30 ^= 53651;
                                                                                                switch (i30) {
                                                                                                    case 17:
                                                                                                        i30 = str != null ? 53727 : 53696;
                                                                                                        break;
                                                                                                    case 50:
                                                                                                        break;
                                                                                                    case 76:
                                                                                                        boolean zBooleanValue9 = ((Boolean) C0188.n(61683)).booleanValue();
                                                                                                        int i31 = 53758;
                                                                                                        while (true) {
                                                                                                            i31 ^= 53775;
                                                                                                            switch (i31) {
                                                                                                                case 1009:
                                                                                                                    i31 = !zBooleanValue9 ? 54502 : 54471;
                                                                                                                    break;
                                                                                                                case 1703:
                                                                                                                    break;
                                                                                                                case 1736:
                                                                                                                    i7 = 55556;
                                                                                                                    while (true) {
                                                                                                                        i7 ^= 55573;
                                                                                                                        switch (i7) {
                                                                                                                            case 17:
                                                                                                                                if (!zBooleanValue2) {
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                break;
                                                                                                                            case 87:
                                                                                                                                break;
                                                                                                                            case 116:
                                                                                                                                N1.N = false;
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    iIntValue = ((Integer) C0210.n(73420)).intValue();
                                                                                                                    N1.M = -1;
                                                                                                                    zBooleanValue = ((Boolean) C0198.n(13233)).booleanValue();
                                                                                                                    i8 = 55680;
                                                                                                                    while (true) {
                                                                                                                        i8 ^= 55697;
                                                                                                                        switch (i8) {
                                                                                                                            case 17:
                                                                                                                                if (!zBooleanValue) {
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1467:
                                                                                                                                break;
                                                                                                                            case 1496:
                                                                                                                                C0210.n(20490, null, new Object[]{Integer.valueOf(iIntValue), Long.valueOf(jLongValue2)});
                                                                                                                                synchronized (N1.class) {
                                                                                                                                    N1.y = false;
                                                                                                                                    i9 = 1507503;
                                                                                                                                    while (true) {
                                                                                                                                        i9 ^= 1507520;
                                                                                                                                        switch (i9) {
                                                                                                                                            case 14:
                                                                                                                                                break;
                                                                                                                                            case 111:
                                                                                                                                                i9 = 1507534;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                StringBuilder sb4 = new StringBuilder();
                                                                                                                                C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb4, new Object[0])});
                                                                                                                                synchronized (N1.class) {
                                                                                                                                    N1.y = false;
                                                                                                                                }
                                                                                                                                i2 = 1511347;
                                                                                                                                while (true) {
                                                                                                                                    i2 ^= 1511364;
                                                                                                                                    switch (i2) {
                                                                                                                                        case 22:
                                                                                                                                            break;
                                                                                                                                        case 119:
                                                                                                                                            i2 = 1511378;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                        default:
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1529:
                                                                                                                                synchronized (N1.class) {
                                                                                                                                    N1.y = false;
                                                                                                                                    i10 = 56455;
                                                                                                                                    while (true) {
                                                                                                                                        i10 ^= 56472;
                                                                                                                                        switch (i10) {
                                                                                                                                            case 31:
                                                                                                                                                i10 = 56486;
                                                                                                                                                break;
                                                                                                                                            case 62:
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
                                                                                                                case 1769:
                                                                                                                    int i32 = 54533;
                                                                                                                    while (true) {
                                                                                                                        i32 ^= 54550;
                                                                                                                        switch (i32) {
                                                                                                                            case 19:
                                                                                                                                i32 = 54564;
                                                                                                                                continue;
                                                                                                                            case 50:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                continue;
                                                                                                                        }
                                                                                                                        synchronized (N1.class) {
                                                                                                                            N1.y = false;
                                                                                                                            i11 = 55432;
                                                                                                                            while (true) {
                                                                                                                                i11 ^= 55449;
                                                                                                                                switch (i11) {
                                                                                                                                    case 17:
                                                                                                                                        i11 = 55463;
                                                                                                                                        continue;
                                                                                                                                        continue;
                                                                                                                                    case 62:
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        continue;
                                                                                                                                        continue;
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
                                                                                                    case 83:
                                                                                                        i7 = 55556;
                                                                                                        while (true) {
                                                                                                            i7 ^= 55573;
                                                                                                            switch (i7) {
                                                                                                                case 17:
                                                                                                                    if (!zBooleanValue2) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 54:
                                                                                                                    break;
                                                                                                                case 87:
                                                                                                                    break;
                                                                                                                case 116:
                                                                                                                    N1.N = false;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        iIntValue = ((Integer) C0210.n(73420)).intValue();
                                                                                                        N1.M = -1;
                                                                                                        zBooleanValue = ((Boolean) C0198.n(13233)).booleanValue();
                                                                                                        i8 = 55680;
                                                                                                        while (true) {
                                                                                                            i8 ^= 55697;
                                                                                                            switch (i8) {
                                                                                                                case 17:
                                                                                                                    if (!zBooleanValue) {
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1467:
                                                                                                                    break;
                                                                                                                case 1496:
                                                                                                                    C0210.n(20490, null, new Object[]{Integer.valueOf(iIntValue), Long.valueOf(jLongValue2)});
                                                                                                                    synchronized (N1.class) {
                                                                                                                        N1.y = false;
                                                                                                                        i9 = 1507503;
                                                                                                                        while (true) {
                                                                                                                            i9 ^= 1507520;
                                                                                                                            switch (i9) {
                                                                                                                                case 14:
                                                                                                                                    break;
                                                                                                                                case 111:
                                                                                                                                    i9 = 1507534;
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 1529:
                                                                                                                    synchronized (N1.class) {
                                                                                                                        N1.y = false;
                                                                                                                        i10 = 56455;
                                                                                                                        while (true) {
                                                                                                                            i10 ^= 56472;
                                                                                                                            switch (i10) {
                                                                                                                                case 31:
                                                                                                                                    i10 = 56486;
                                                                                                                                    break;
                                                                                                                                case 62:
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
                                                                case 2025:
                                                                    int i33 = 52611;
                                                                    while (true) {
                                                                        i33 ^= 52628;
                                                                        switch (i33) {
                                                                            case 23:
                                                                                i33 = 52642;
                                                                                continue;
                                                                            case 54:
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                        }
                                                                        synchronized (N1.class) {
                                                                            N1.y = false;
                                                                            i6 = 1508526;
                                                                            while (true) {
                                                                                i6 ^= 1508543;
                                                                                switch (i6) {
                                                                                    case 17:
                                                                                        i6 = 1508557;
                                                                                        continue;
                                                                                        continue;
                                                                                    case 114:
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                        continue;
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
                                                    default:
                                                        break;
                                                }
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            int i34 = 54657;
                                            while (true) {
                                                i34 ^= 54674;
                                                switch (i34) {
                                                    case 19:
                                                        i34 = 54688;
                                                        continue;
                                                    case 50:
                                                        z = false;
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 47417:
                                    synchronized (N1.class) {
                                        try {
                                            long jLongValue5 = ((Long) C0157.n(13709)).longValue();
                                            int i35 = 48767;
                                            while (true) {
                                                i35 ^= 48784;
                                                switch (i35) {
                                                    case 14:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 76:
                                                        N1.N = false;
                                                        int i36 = 48891;
                                                        while (true) {
                                                            i36 ^= 48908;
                                                            switch (i36) {
                                                                case 22:
                                                                    break;
                                                                case 503:
                                                                    i36 = 48922;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                    case 239:
                                                        if (jLongValue2 == jLongValue5) {
                                                            i35 = 48860;
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                i35 = 48829;
                                            }
                                            break;
                                        } catch (Throwable th10) {
                                            int i37 = 49666;
                                            while (true) {
                                                i37 ^= 49683;
                                                switch (i37) {
                                                    case 17:
                                                        i37 = 49697;
                                                        break;
                                                    case 50:
                                                        throw th10;
                                                }
                                            }
                                        }
                                    }
                                    synchronized (N1.class) {
                                        N1.y = false;
                                    }
                                    int i38 = 49790;
                                    while (true) {
                                        i38 ^= 49807;
                                        switch (i38) {
                                            case 18:
                                                break;
                                            case 241:
                                                i38 = 49821;
                                                continue;
                                            default:
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
            while (true) {
                i5 ^= 1757;
                switch (i5) {
                    case 17:
                        i5 = 1771;
                        break;
                    case 54:
                        return;
                }
            }
        } catch (Throwable th11) {
            int i39 = 49914;
            while (true) {
                i39 ^= 49931;
                switch (i39) {
                    case 497:
                        i39 = 50596;
                        continue;
                    case 1711:
                        obj = th11;
                        z = false;
                        break;
                    default:
                        continue;
                }
            }
        }
        C0168.n(32725, null, new Object[0]);
        C0168.n(89781, null, new Object[0]);
        i5 = 1740;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x020b  */
    /* JADX WARN: Code duplicated, block: B:281:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x023c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0434 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x02d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x02da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:153:0x02b6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:89:0x01a0. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    private final void d() throws Throwable {
        boolean z;
        Object obj;
        int iIntValue;
        int i;
        Object obj2;
        boolean zBooleanValue;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean zBooleanValue2;
        int i6;
        int i7;
        boolean z3;
        long j = 60000;
        try {
            long jLongValue = ((Long) C0216.n(17681, null, new Object[0])).longValue();
            synchronized (N1.class) {
                try {
                    ?? BooleanValue = ((Boolean) C0216.n(6520, null, new Object[]{Long.valueOf(jLongValue)})).booleanValue();
                    int i8 = 1616;
                    while (true) {
                        i8 ^= 1633;
                        try {
                            switch (i8) {
                                case 14:
                                    break;
                                case 49:
                                    i8 = BooleanValue != 0 ? 1709 : 1678;
                                    break;
                                case 204:
                                    boolean zBooleanValue3 = ((Boolean) C0216.n(78206)).booleanValue();
                                    int i9 = 1740;
                                    while (true) {
                                        i9 ^= 1757;
                                        switch (i9) {
                                            case 17:
                                                i9 = zBooleanValue3 ? 1833 : 1802;
                                                break;
                                            case 54:
                                                break;
                                            case 471:
                                                L1 l1 = (L1) C0210.n(47361, null, new Object[]{false});
                                                synchronized (N1.class) {
                                                    try {
                                                        boolean zBooleanValue4 = ((Boolean) C0216.n(6520, null, new Object[]{Long.valueOf(((Long) C0216.n(17681, null, new Object[0])).longValue())})).booleanValue();
                                                        int i10 = 48767;
                                                        while (true) {
                                                            i10 ^= 48784;
                                                            switch (i10) {
                                                                case 14:
                                                                    break;
                                                                case 45:
                                                                    C0216.n(49462, (C0263i) C0216.n(80192), new Object[0]);
                                                                    j = Long.MIN_VALUE;
                                                                    break;
                                                                case 76:
                                                                    L1 l2 = (L1) C0191.n(56936);
                                                                    int i11 = 48891;
                                                                    while (true) {
                                                                        i11 ^= 48908;
                                                                        switch (i11) {
                                                                            case 22:
                                                                                break;
                                                                            case 53:
                                                                                L1 l3 = (L1) C0191.n(32402);
                                                                                int i12 = 49790;
                                                                                while (true) {
                                                                                    i12 ^= 49807;
                                                                                    switch (i12) {
                                                                                        case 18:
                                                                                            break;
                                                                                        case 51:
                                                                                            break;
                                                                                        case 84:
                                                                                            long jLongValue2 = ((Long) C0210.n(99928, (C0263i) C0216.n(80192), new Object[0])).longValue();
                                                                                            int i13 = 49914;
                                                                                            while (true) {
                                                                                                i13 ^= 49931;
                                                                                                switch (i13) {
                                                                                                    case 497:
                                                                                                        i13 = 50596;
                                                                                                        continue;
                                                                                                    case 1711:
                                                                                                        j = jLongValue2;
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 241:
                                                                                            i12 = l1 == l3 ? 49883 : 49852;
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 503:
                                                                                i11 = l1 == l2 ? 49635 : 48953;
                                                                                break;
                                                                            case 32495:
                                                                                int i14 = 49666;
                                                                                while (true) {
                                                                                    i14 ^= 49683;
                                                                                    switch (i14) {
                                                                                        case 17:
                                                                                            i14 = 49697;
                                                                                            continue;
                                                                                        case 50:
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                    C0216.n(49462, (C0263i) C0216.n(80192), new Object[0]);
                                                                                    j = Long.MIN_VALUE;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 239:
                                                                    i10 = zBooleanValue4 ? 48860 : 48829;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        int i15 = 50813;
                                                        while (true) {
                                                            i15 ^= 50830;
                                                            switch (i15) {
                                                                case 18:
                                                                    break;
                                                                case 53:
                                                                    z3 = false;
                                                                    break;
                                                                case 243:
                                                                    i15 = j != Long.MIN_VALUE ? 51557 : 50875;
                                                                    break;
                                                                case 4075:
                                                                    boolean zBooleanValue5 = ((Boolean) C0216.n(20484, (C0263i) C0216.n(80192), new Object[0])).booleanValue();
                                                                    int i16 = 51588;
                                                                    while (true) {
                                                                        i16 ^= 51605;
                                                                        switch (i16) {
                                                                            case 17:
                                                                                i16 = 51619;
                                                                                continue;
                                                                            case 54:
                                                                                z3 = zBooleanValue5;
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
                                                        N1.f0 = false;
                                                        break;
                                                    } catch (Throwable th) {
                                                        int i17 = 50689;
                                                        while (true) {
                                                            i17 ^= 50706;
                                                            switch (i17) {
                                                                case 19:
                                                                    i17 = 50720;
                                                                    break;
                                                                case 50:
                                                                    throw th;
                                                            }
                                                        }
                                                    }
                                                }
                                                int i18 = 51712;
                                                while (true) {
                                                    i18 ^= 51729;
                                                    switch (i18) {
                                                        case 14:
                                                            break;
                                                        case 17:
                                                            i18 = z3 ? 51805 : 51774;
                                                            break;
                                                        case 47:
                                                            obj = N1.class;
                                                            break;
                                                        case 76:
                                                            obj2 = N1.class;
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    try {
                                                        iIntValue = ((Integer) C0219.n(61875, null, new Object[0])).intValue();
                                                        i = 55556;
                                                        while (true) {
                                                            i ^= 55573;
                                                            switch (i) {
                                                                case 17:
                                                                    i = iIntValue >= 0 ? 55649 : 55618;
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    return;
                                                                case 116:
                                                                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0210.n(8844, null, new Object[]{(String) C0210.n(64968)})})});
                                                                    return;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        BooleanValue = obj;
                                                        int i19 = 54533;
                                                        while (true) {
                                                            i19 ^= 54550;
                                                            switch (i19) {
                                                                case 19:
                                                                    i19 = 54564;
                                                                    break;
                                                                case 50:
                                                                    throw th;
                                                            }
                                                        }
                                                    }
                                                }
                                                break;
                                            case 500:
                                                int i20 = 1864;
                                                while (true) {
                                                    i20 ^= 1881;
                                                    switch (i20) {
                                                        case 17:
                                                            i20 = 48674;
                                                            continue;
                                                        case 47483:
                                                            break;
                                                        default:
                                                            continue;
                                                    }
                                                    synchronized (N1.class) {
                                                        zBooleanValue = ((Boolean) C0216.n(6520, null, new Object[]{Long.valueOf(((Long) C0216.n(17681, null, new Object[0])).longValue())})).booleanValue();
                                                        i2 = 52735;
                                                        while (true) {
                                                            i2 ^= 52752;
                                                            switch (i2) {
                                                                case 14:
                                                                    break;
                                                                case 45:
                                                                    C0216.n(49462, (C0263i) C0216.n(80192), new Object[0]);
                                                                    j = Long.MIN_VALUE;
                                                                    break;
                                                                case 1007:
                                                                    i2 = zBooleanValue ? 53479 : 52797;
                                                                    break;
                                                                case 7927:
                                                                    i7 = 53510;
                                                                    while (true) {
                                                                        i7 ^= 53527;
                                                                        switch (i7) {
                                                                            case 17:
                                                                                i7 = 53541;
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
                                                        i3 = 53634;
                                                        while (true) {
                                                            i3 ^= 53651;
                                                            switch (i3) {
                                                                case 17:
                                                                    i3 = j != Long.MIN_VALUE ? 53727 : 53696;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                                case 76:
                                                                    zBooleanValue2 = ((Boolean) C0216.n(20484, (C0263i) C0216.n(80192), new Object[0])).booleanValue();
                                                                    i6 = 53758;
                                                                    while (true) {
                                                                        i6 ^= 53775;
                                                                        switch (i6) {
                                                                            case 1009:
                                                                                i6 = 54440;
                                                                                continue;
                                                                                continue;
                                                                            case 1703:
                                                                                z2 = zBooleanValue2;
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 83:
                                                                    z2 = false;
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        N1.f0 = false;
                                                    }
                                                    i4 = 54657;
                                                    while (true) {
                                                        i4 ^= 54674;
                                                        switch (i4) {
                                                            case 19:
                                                                i4 = z2 ? 55401 : 54719;
                                                                break;
                                                            case 45:
                                                                obj = N1.class;
                                                                break;
                                                            case 50:
                                                                break;
                                                            case 3579:
                                                                i5 = 55432;
                                                                while (true) {
                                                                    i5 ^= 55449;
                                                                    switch (i5) {
                                                                        case 17:
                                                                            i5 = 55463;
                                                                            continue;
                                                                            continue;
                                                                        case 62:
                                                                            obj2 = N1.class;
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
                                                        iIntValue = ((Integer) C0219.n(61875, null, new Object[0])).intValue();
                                                        i = 55556;
                                                        while (true) {
                                                            i ^= 55573;
                                                            switch (i) {
                                                                case 17:
                                                                    if (iIntValue >= 0) {
                                                                    }
                                                                    break;
                                                                case 54:
                                                                    break;
                                                                case 87:
                                                                    return;
                                                                case 116:
                                                                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0210.n(8844, null, new Object[]{(String) C0210.n(64968)})})});
                                                                    return;
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
                                case 239:
                                    synchronized (N1.class) {
                                        zBooleanValue = ((Boolean) C0216.n(6520, null, new Object[]{Long.valueOf(((Long) C0216.n(17681, null, new Object[0])).longValue())})).booleanValue();
                                        i2 = 52735;
                                        while (true) {
                                            i2 ^= 52752;
                                            switch (i2) {
                                                case 14:
                                                    break;
                                                case 45:
                                                    C0216.n(49462, (C0263i) C0216.n(80192), new Object[0]);
                                                    j = Long.MIN_VALUE;
                                                    break;
                                                case 1007:
                                                    if (zBooleanValue) {
                                                    }
                                                    break;
                                                case 7927:
                                                    i7 = 53510;
                                                    while (true) {
                                                        i7 ^= 53527;
                                                        switch (i7) {
                                                            case 17:
                                                                i7 = 53541;
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
                                        i3 = 53634;
                                        while (true) {
                                            i3 ^= 53651;
                                            switch (i3) {
                                                case 17:
                                                    if (j != Long.MIN_VALUE) {
                                                    }
                                                    break;
                                                case 50:
                                                    break;
                                                case 76:
                                                    zBooleanValue2 = ((Boolean) C0216.n(20484, (C0263i) C0216.n(80192), new Object[0])).booleanValue();
                                                    i6 = 53758;
                                                    while (true) {
                                                        i6 ^= 53775;
                                                        switch (i6) {
                                                            case 1009:
                                                                i6 = 54440;
                                                                continue;
                                                                continue;
                                                            case 1703:
                                                                z2 = zBooleanValue2;
                                                                break;
                                                            default:
                                                                continue;
                                                                continue;
                                                        }
                                                    }
                                                    break;
                                                case 83:
                                                    z2 = false;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        N1.f0 = false;
                                        i4 = 54657;
                                        while (true) {
                                            i4 ^= 54674;
                                            switch (i4) {
                                                case 19:
                                                    if (z2) {
                                                    }
                                                    break;
                                                case 45:
                                                    obj = N1.class;
                                                    break;
                                                case 50:
                                                    break;
                                                case 3579:
                                                    i5 = 55432;
                                                    while (true) {
                                                        i5 ^= 55449;
                                                        switch (i5) {
                                                            case 17:
                                                                i5 = 55463;
                                                                continue;
                                                                continue;
                                                            case 62:
                                                                obj2 = N1.class;
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
                                            iIntValue = ((Integer) C0219.n(61875, null, new Object[0])).intValue();
                                            i = 55556;
                                            while (true) {
                                                i ^= 55573;
                                                switch (i) {
                                                    case 17:
                                                        if (iIntValue >= 0) {
                                                        }
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        return;
                                                    case 116:
                                                        C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0210.n(8844, null, new Object[]{(String) C0210.n(64968)})})});
                                                        return;
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
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (Throwable th4) {
                    int i21 = 52611;
                    while (true) {
                        i21 ^= 52628;
                        switch (i21) {
                            case 23:
                                i21 = 52642;
                                break;
                            case 54:
                                throw th4;
                        }
                    }
                }
            }
            C0216.n(46210, null, new Object[]{Long.valueOf(j)});
            int i22 = 51836;
            while (true) {
                i22 ^= 51853;
                switch (i22) {
                    case 241:
                        i22 = 52518;
                        break;
                    case 1963:
                        obj = obj2;
                        iIntValue = ((Integer) C0219.n(61875, null, new Object[0])).intValue();
                        i = 55556;
                        while (true) {
                            i ^= 55573;
                            switch (i) {
                                case 17:
                                    if (iIntValue >= 0) {
                                    }
                                    break;
                                case 54:
                                    break;
                                case 87:
                                    return;
                                case 116:
                                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0210.n(8844, null, new Object[]{(String) C0210.n(64968)})})});
                                    return;
                                default:
                                    break;
                            }
                        }
                        break;
                }
            }
        } catch (Throwable th5) {
            synchronized (N1.class) {
                try {
                    boolean zBooleanValue6 = ((Boolean) C0216.n(6520, null, new Object[]{Long.valueOf(((Long) C0216.n(17681, null, new Object[0])).longValue())})).booleanValue();
                    int i23 = 55680;
                    while (true) {
                        i23 ^= 55697;
                        switch (i23) {
                            case 17:
                                i23 = zBooleanValue6 ? 56424 : 56393;
                                break;
                            case 1467:
                                break;
                            case 1496:
                                C0216.n(49462, (C0263i) C0216.n(80192), new Object[0]);
                                j = Long.MIN_VALUE;
                                break;
                            case 1529:
                                int i24 = 56455;
                                while (true) {
                                    i24 ^= 56472;
                                    switch (i24) {
                                        case 31:
                                            i24 = 56486;
                                            continue;
                                        case 62:
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
                    int i25 = 56579;
                    while (true) {
                        i25 ^= 56596;
                        switch (i25) {
                            case 23:
                                if (j != Long.MIN_VALUE) {
                                    i25 = 1507472;
                                }
                                break;
                            case 54:
                                break;
                            case 85:
                                z = false;
                                break;
                            case 1564036:
                                boolean zBooleanValue7 = ((Boolean) C0216.n(20484, (C0263i) C0216.n(80192), new Object[0])).booleanValue();
                                int i26 = 1507503;
                                while (true) {
                                    i26 ^= 1507520;
                                    switch (i26) {
                                        case 14:
                                            z = zBooleanValue7;
                                            break;
                                        case 111:
                                            i26 = 1507534;
                                            break;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i25 = 56641;
                    }
                    N1.f0 = false;
                    int i27 = 1507751;
                    while (true) {
                        i27 ^= 1507768;
                        switch (i27) {
                            case 31:
                                if (z) {
                                    i27 = 1508495;
                                }
                                break;
                            case 1335:
                                C0216.n(46210, null, new Object[]{Long.valueOf(j)});
                                throw th5;
                            case 1480:
                                throw th5;
                            case 1513:
                                break;
                            default:
                                continue;
                        }
                        i27 = 1508464;
                    }
                } catch (Throwable th6) {
                    int i28 = 1507627;
                    while (true) {
                        i28 ^= 1507644;
                        switch (i28) {
                            case 23:
                                i28 = 1507658;
                                break;
                            case 118:
                                int i29 = 1508526;
                                while (true) {
                                    i29 ^= 1508543;
                                    switch (i29) {
                                        case 17:
                                            i29 = 1508557;
                                            break;
                                        case 114:
                                            int i30 = 1508650;
                                            while (true) {
                                                i30 ^= 1508667;
                                                switch (i30) {
                                                    case 17:
                                                        i30 = 1508681;
                                                        break;
                                                    case 114:
                                                        throw th6;
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
        }
    }

    private final void e() throws Throwable {
        C0263i c0263i = (C0263i) C0216.n(80192);
        synchronized (c0263i) {
            c0263i.c = false;
        }
        C0210.n(77597, null, new Object[0]);
        int iIntValue = ((Integer) C0162.n(34460, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Float) C0157.n(17336, null, new Object[]{(String) C0152.n(74755, null, new Object[]{(String) C0210.n(75657)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:286:0x0bd0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:301:0x0c3c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:313:0x0c9c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:459:0x12fd. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:481:0x13b7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:492:0x151e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:506:0x1648. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:538:0x188d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:79:0x01a0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x0224. Please report as an issue. */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean zBooleanValue;
        boolean z;
        String str;
        boolean z2;
        String str2;
        String str3;
        String str4;
        switch (((Integer) C0210.n(23746, this)).intValue()) {
            case 0:
                b();
                return;
            case 1:
                d();
                return;
            case 2:
                C0201.n(76776, null, new Object[0]);
                return;
            case 3:
                try {
                    C0213.n(58554, (com.github.catvod.spider.merge.p000a.I) C0176.n(35486, null, new Object[0]), new Object[0]);
                    C0213.n(86109, (com.github.catvod.spider.merge.p000a.I) C0176.n(35486, null, new Object[0]), new Object[0]);
                    return;
                } catch (Exception e) {
                    int i = 1545230;
                    while (true) {
                        i ^= 1545247;
                        switch (i) {
                            case 17:
                                i = 1545912;
                                break;
                            case 679:
                                return;
                        }
                    }
                }
                break;
            case 4:
                String str5 = (String) C0149.n(34115, null, new Object[]{(short[]) C0210.n(96994), 387, Integer.valueOf(C0121.f330 ^ (-547)), 2446});
                String str6 = (String) C0152.n(8274, null, new Object[]{(short[]) C0210.n(96994), 393, Integer.valueOf(C0066.f275 ^ 432), 1556});
                try {
                    Activity activity = (Activity) C0232.n(25717, null, new Object[0]);
                    int i2 = 1537418;
                    while (true) {
                        i2 ^= 1537435;
                        switch (i2) {
                            case 17:
                                if (activity == null) {
                                    i2 = 1537511;
                                }
                                break;
                            case 50:
                                break;
                            case 83:
                                boolean zBooleanValue2 = ((Boolean) C0210.n(36405, null, new Object[]{str6})).booleanValue();
                                String str7 = (String) C0198.n(6303, null, new Object[]{(short[]) C0210.n(96994), 405, Integer.valueOf(C0132.f341 ^ (-8)), 2722});
                                int i3 = 1538441;
                                while (true) {
                                    i3 ^= 1538458;
                                    switch (i3) {
                                        case 19:
                                            i3 = !zBooleanValue2 ? 1539185 : 1538503;
                                            break;
                                        case 50:
                                            break;
                                        case 93:
                                            break;
                                        case 1515:
                                            boolean zBooleanValue3 = ((Boolean) C0210.n(36405, null, new Object[]{str7})).booleanValue();
                                            int i4 = 1539216;
                                            while (true) {
                                                i4 ^= 1539233;
                                                switch (i4) {
                                                    case 14:
                                                        break;
                                                    case 49:
                                                        i4 = zBooleanValue3 ? 1539309 : 1539278;
                                                        break;
                                                    case 76:
                                                        int i5 = 1539340;
                                                        while (true) {
                                                            i5 ^= 1539357;
                                                            switch (i5) {
                                                                case 17:
                                                                    i5 = 1539371;
                                                                    continue;
                                                                case 54:
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                        }
                                                        break;
                                                    case 111:
                                                        C0188.n(1950, null, new Object[]{(String) C0224.n(67549, null, new Object[]{(short[]) C0210.n(96994), 412, Integer.valueOf(C0005.f161 ^ 659), 332})});
                                                        int i6 = 1539464;
                                                        while (true) {
                                                            i6 ^= 1539481;
                                                            switch (i6) {
                                                                case 17:
                                                                    i6 = 1540146;
                                                                    break;
                                                                case 64939:
                                                                    return;
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
                                ArrayList arrayList = new ArrayList();
                                boolean zBooleanValue4 = ((Boolean) C0210.n(36405, null, new Object[]{str6})).booleanValue();
                                int i7 = 1540239;
                                while (true) {
                                    i7 ^= 1540256;
                                    switch (i7) {
                                        case 14:
                                            break;
                                        case 47:
                                            i7 = zBooleanValue4 ? 1540332 : 1540301;
                                            break;
                                        case 76:
                                            ((Boolean) C0179.n(13382, arrayList, new Object[]{str6})).booleanValue();
                                            break;
                                        case 109:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                boolean zBooleanValue5 = ((Boolean) C0210.n(36405, null, new Object[]{str7})).booleanValue();
                                int i8 = 1540363;
                                while (true) {
                                    i8 ^= 1540380;
                                    switch (i8) {
                                        case 23:
                                            i8 = zBooleanValue5 ? 1541107 : 1540425;
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            break;
                                        case 751:
                                            ((Boolean) C0179.n(13382, arrayList, new Object[]{str7})).booleanValue();
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                boolean zBooleanValue6 = ((Boolean) C0210.n(36405, null, new Object[]{str5})).booleanValue();
                                int i9 = 1541138;
                                while (true) {
                                    i9 ^= 1541155;
                                    switch (i9) {
                                        case 18:
                                            break;
                                        case 49:
                                            i9 = zBooleanValue6 ? 1541231 : 1541200;
                                            break;
                                        case 76:
                                            ((Boolean) C0179.n(13382, arrayList, new Object[]{str5})).booleanValue();
                                            break;
                                        case 115:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                boolean[] zArr = new boolean[((Integer) C0179.n(44660, arrayList, new Object[0])).intValue()];
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10;
                                    int iIntValue = ((Integer) C0179.n(44660, arrayList, new Object[0])).intValue();
                                    int i12 = 1541262;
                                    while (true) {
                                        i12 ^= 1541279;
                                        switch (i12) {
                                            case 17:
                                                i12 = i11 < iIntValue ? 1541355 : 1541324;
                                                break;
                                            case 50:
                                                break;
                                            case 83:
                                                break;
                                            case 116:
                                                break;
                                            default:
                                                break;
                                        }
                                        int iIntValue2 = ((Integer) C0213.n(65076, null, new Object[]{Integer.valueOf(C0039.f195 ^ 790), activity})).intValue();
                                        LinearLayout linearLayout = (LinearLayout) C0213.n(31052, null, new Object[]{activity});
                                        C0213.n(75512, linearLayout, new Object[]{(LinearLayout) C0213.n(19574, null, new Object[]{activity, (String) C0152.n(85600, null, new Object[]{(short[]) C0210.n(96994), 437, Integer.valueOf(C0013.f169 ^ 665), 674}), (String) C0195.n(99405, null, new Object[]{(short[]) C0210.n(96994), 443, Integer.valueOf(C0129.f338 ^ 901), 640})}), (LinearLayout.LayoutParams) C0213.n(69991, null, new Object[]{Integer.valueOf(iIntValue2)})});
                                        LinearLayout linearLayout2 = (LinearLayout) C0213.n(8047, null, new Object[]{activity});
                                        LinearLayout linearLayout3 = new LinearLayout(activity);
                                        C0213.n(50593, linearLayout3, new Object[]{1});
                                        C0213.n(19743, linearLayout3, new Object[]{Integer.valueOf((-262484) ^ C0004.f160)});
                                        int i13 = 0;
                                        while (true) {
                                            int iIntValue3 = ((Integer) C0179.n(44660, arrayList, new Object[0])).intValue();
                                            int i14 = 1543060;
                                            while (true) {
                                                i14 ^= 1543077;
                                                switch (i14) {
                                                    case 22:
                                                        break;
                                                    case 49:
                                                        i14 = i13 < iIntValue3 ? 1543153 : 1543122;
                                                        break;
                                                    case 84:
                                                        break;
                                                    case 119:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                C0176.n(63996, linearLayout2, new Object[]{linearLayout3});
                                                C0213.n(8544, null, new Object[]{linearLayout2, (String) C0162.n(59839, null, new Object[]{(short[]) C0210.n(96994), 490, Integer.valueOf(C0054.f210 ^ (-672)), 1437})});
                                                C0176.n(63996, linearLayout, new Object[]{linearLayout2});
                                                C0213.n(60196, null, new Object[]{(AlertDialog) C0213.n(5098, (AlertDialog.Builder) C0213.n(24683, (AlertDialog.Builder) C0213.n(73997, (AlertDialog.Builder) C0213.n(26031, new AlertDialog.Builder(activity), new Object[]{linearLayout}), new Object[]{(String) C0162.n(59839, null, new Object[]{(short[]) C0210.n(96994), 511, Integer.valueOf(C0083.f292 ^ (-207)), 2191}), new P0(arrayList, zArr, 0)}), new Object[]{(String) C0182.n(69249, null, new Object[]{(short[]) C0210.n(96994), 513, Integer.valueOf(C0144.f354 ^ (-601)), 1595}), null}), new Object[0])});
                                                int i15 = 1544207;
                                                while (true) {
                                                    i15 ^= 1544224;
                                                    switch (i15) {
                                                        case 14:
                                                            return;
                                                        case 47:
                                                            i15 = 1544238;
                                                            break;
                                                    }
                                                }
                                            }
                                            StringBuilder sb = new StringBuilder();
                                            String str8 = (String) C0198.n(89992, sb, new Object[0]);
                                            String str9 = (String) C0198.n(51837, null, new Object[]{(short[]) C0210.n(96994), 470, Integer.valueOf(C0068.f277 ^ 369), 1790});
                                            int iIntValue4 = ((Integer) C0210.n(71584, null, new Object[]{(String) C0205.n(27026, arrayList, new Object[]{Integer.valueOf(i13)})})).intValue();
                                            boolean z3 = zArr[i13];
                                            int i16 = 1543184;
                                            while (true) {
                                                i16 ^= 1543201;
                                                switch (i16) {
                                                    case 14:
                                                        break;
                                                    case 49:
                                                        i16 = i13 > 0 ? 1543277 : 1543246;
                                                        break;
                                                    case 76:
                                                        z = true;
                                                        int i17 = 1543308;
                                                        while (true) {
                                                            i17 ^= 1543325;
                                                            switch (i17) {
                                                                case 17:
                                                                    i17 = 1543990;
                                                                    break;
                                                                case 939:
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    case 111:
                                                        z = false;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            C0213.n(88107, null, new Object[]{linearLayout3, str8, str9, Integer.valueOf(iIntValue4), Boolean.valueOf(z3), Integer.valueOf(i13), Boolean.valueOf(z), null, zArr, null});
                                            int i18 = i13 + (C0042.f198 ^ 58);
                                            int i19 = 1544083;
                                            while (true) {
                                                i19 ^= 1544100;
                                                switch (i19) {
                                                    case 22:
                                                        break;
                                                    case 55:
                                                        i19 = 1544114;
                                                        break;
                                                }
                                            }
                                            i13 = i18;
                                        }
                                    }
                                    String str10 = (String) C0213.n(14671, null, new Object[]{(String) C0205.n(27026, arrayList, new Object[]{Integer.valueOf(i11)})});
                                    String str11 = (String) C0152.n(8274, null, new Object[]{(short[]) C0210.n(96994), 430, Integer.valueOf(C0002.f158 ^ 514), 1700});
                                    try {
                                        String str12 = (String) C0187.n(85372, null, new Object[]{str10});
                                        boolean zBooleanValue7 = ((Boolean) C0195.n(41159, null, new Object[]{str12})).booleanValue();
                                        int i20 = 1541386;
                                        while (true) {
                                            i20 ^= 1541403;
                                            switch (i20) {
                                                case 17:
                                                    i20 = zBooleanValue7 ? 1542130 : 1542099;
                                                    break;
                                                case 687:
                                                    break;
                                                case 712:
                                                    zBooleanValue = ((Boolean) C0216.n(77950, new JSONObject(str12), new Object[]{str11, false})).booleanValue();
                                                    break;
                                                case 745:
                                                    zBooleanValue = false;
                                                    int i21 = 1542161;
                                                    while (true) {
                                                        i21 ^= 1542178;
                                                        switch (i21) {
                                                            case 18:
                                                                break;
                                                            case 51:
                                                                i21 = 1542192;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                            zArr[i11] = zBooleanValue;
                                            i10 = 0 - ((0 - i11) - 1);
                                            int i22 = 1542285;
                                            while (true) {
                                                i22 ^= 1542302;
                                                switch (i22) {
                                                    case 19:
                                                        i22 = 1542316;
                                                        break;
                                                    case 50:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                        }
                                    } catch (Exception e2) {
                                        int i23 = 1545106;
                                        while (true) {
                                            i23 ^= 1545123;
                                            switch (i23) {
                                                case 18:
                                                    break;
                                                case 49:
                                                    i23 = 1545137;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 124:
                                C0188.n(1950, null, new Object[]{(String) C0162.n(89013, null, new Object[]{(short[]) C0210.n(96994), 396, Integer.valueOf(C0033.f189 ^ (-426)), 638})});
                                int i24 = 1537542;
                                while (true) {
                                    i24 ^= 1537559;
                                    switch (i24) {
                                        case 17:
                                            i24 = 1538224;
                                            break;
                                        case 3751:
                                            return;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i2 = 1537480;
                    }
                } catch (Exception e3) {
                    int i25 = 1538317;
                    while (true) {
                        i25 ^= 1538334;
                        switch (i25) {
                            case 19:
                                i25 = 1538348;
                                break;
                            case 50:
                                C0213.n(55886, null, new Object[]{e3, new StringBuilder((String) C0224.n(52346, null, new Object[]{(short[]) C0210.n(96994), 515, Integer.valueOf(C0134.f343 ^ (-247)), 2944}))});
                                return;
                        }
                    }
                }
                break;
            case 5:
                String str13 = (String) C0182.n(27462, null, new Object[]{(short[]) C0210.n(96994), 336, Integer.valueOf(C0086.f295 ^ (-341)), 2557});
                String str14 = (String) C0198.n(88124, null, new Object[]{(short[]) C0210.n(96994), 342, Integer.valueOf(C0110.f319 ^ (-549)), 1103});
                String str15 = (String) C0198.n(94433, null, new Object[]{(short[]) C0210.n(96994), 349, Integer.valueOf(C0078.f287 ^ (-691)), 685});
                String str16 = (String) C0149.n(61324, null, new Object[]{(short[]) C0210.n(96994), 352, Integer.valueOf(C0022.f178 ^ 107), 2876});
                try {
                    Activity activity2 = (Activity) C0232.n(25717, null, new Object[0]);
                    int i26 = 1507503;
                    while (true) {
                        i26 ^= 1507520;
                        switch (i26) {
                            case 14:
                                break;
                            case 45:
                                ArrayList arrayList2 = new ArrayList();
                                boolean zBooleanValue8 = ((Boolean) C0210.n(36405, null, new Object[]{str15})).booleanValue();
                                int i27 = 1507751;
                                while (true) {
                                    i27 ^= 1507768;
                                    switch (i27) {
                                        case 31:
                                            i27 = !zBooleanValue8 ? 1508495 : 1508464;
                                            break;
                                        case 1335:
                                            boolean zBooleanValue9 = ((Boolean) C0210.n(4477, null, new Object[0])).booleanValue();
                                            int i28 = 1508526;
                                            while (true) {
                                                i28 ^= 1508543;
                                                switch (i28) {
                                                    case 17:
                                                        i28 = zBooleanValue9 ? 1508619 : 1508588;
                                                        break;
                                                    case 83:
                                                        break;
                                                    case 114:
                                                        break;
                                                    case 436:
                                                        ((Boolean) C0179.n(13382, arrayList2, new Object[]{str15})).booleanValue();
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1480:
                                            break;
                                        case 1513:
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                boolean zBooleanValue10 = ((Boolean) C0210.n(36405, null, new Object[]{str14})).booleanValue();
                                int i29 = 1508650;
                                while (true) {
                                    i29 ^= 1508667;
                                    switch (i29) {
                                        case 17:
                                            i29 = !zBooleanValue10 ? 1509394 : 1508712;
                                            break;
                                        case 83:
                                            break;
                                        case 114:
                                            break;
                                        case 3369:
                                            boolean zBooleanValue11 = ((Boolean) C0210.n(74193, null, new Object[0])).booleanValue();
                                            int i30 = 1509425;
                                            while (true) {
                                                i30 ^= 1509442;
                                                switch (i30) {
                                                    case 18:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 115:
                                                        i30 = zBooleanValue11 ? 1509518 : 1509487;
                                                        break;
                                                    case 204:
                                                        ((Boolean) C0179.n(13382, arrayList2, new Object[]{str14})).booleanValue();
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
                                boolean zBooleanValue12 = ((Boolean) C0210.n(36405, null, new Object[]{str13})).booleanValue();
                                int i31 = 1509549;
                                while (true) {
                                    i31 ^= 1509566;
                                    switch (i31) {
                                        case 19:
                                            i31 = !zBooleanValue12 ? 1509642 : 1509611;
                                            break;
                                        case 85:
                                            break;
                                        case 114:
                                            break;
                                        case 436:
                                            boolean zBooleanValue13 = ((Boolean) C0210.n(34267, null, new Object[0])).booleanValue();
                                            int i32 = 1509673;
                                            while (true) {
                                                i32 ^= 1509690;
                                                switch (i32) {
                                                    case 19:
                                                        i32 = zBooleanValue13 ? 1510417 : 1510386;
                                                        break;
                                                    case 712:
                                                        break;
                                                    case 745:
                                                        break;
                                                    case 1323:
                                                        ((Boolean) C0179.n(13382, arrayList2, new Object[]{str13})).booleanValue();
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
                                boolean zBooleanValue14 = ((Boolean) C0179.n(88022, arrayList2, new Object[0])).booleanValue();
                                int i33 = 1510448;
                                while (true) {
                                    i33 ^= 1510465;
                                    switch (i33) {
                                        case 14:
                                            break;
                                        case 47:
                                            String str17 = (String) C0205.n(27026, arrayList2, new Object[]{0});
                                            String[][] strArr = (String[][]) C0210.n(82278, null, new Object[]{String.class, new int[]{((Integer) C0179.n(44660, arrayList2, new Object[0])).intValue(), 2}});
                                            int[] iArr = new int[((Integer) C0179.n(44660, arrayList2, new Object[0])).intValue()];
                                            int i34 = 0;
                                            while (true) {
                                                int iIntValue5 = ((Integer) C0179.n(44660, arrayList2, new Object[0])).intValue();
                                                String str18 = (String) C0149.n(61324, null, new Object[]{(short[]) C0210.n(96994), 363, Integer.valueOf(C0086.f295 ^ (-344)), 555});
                                                String str19 = (String) C0195.n(43185);
                                                String str20 = (String) C0162.n(59518, null, new Object[]{(short[]) C0210.n(96994), 368, Integer.valueOf(C0111.f320 ^ (-934)), 2105});
                                                int i35 = 1511347;
                                                while (true) {
                                                    i35 ^= 1511364;
                                                    switch (i35) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 119:
                                                            i35 = i34 < iIntValue5 ? 1511440 : 1511409;
                                                            break;
                                                        case 8148:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    StringBuilder sb2 = new StringBuilder();
                                                    String str21 = (String) C0198.n(89992, sb2, new Object[0]);
                                                    JSONObject jSONObject = (JSONObject) C0210.n(43341, null, new Object[]{str17});
                                                    int i36 = 1513393;
                                                    while (true) {
                                                        i36 ^= 1513410;
                                                        switch (i36) {
                                                            case 18:
                                                                break;
                                                            case 45:
                                                                String str22 = (String) C0149.n(92089, (String) C0182.n(6366, jSONObject, new Object[]{str18, str19}), new Object[0]);
                                                                boolean zBooleanValue15 = ((Boolean) C0195.n(41159, null, new Object[]{str22})).booleanValue();
                                                                int i37 = 1514292;
                                                                while (true) {
                                                                    i37 ^= 1514309;
                                                                    switch (i37) {
                                                                        case 22:
                                                                            break;
                                                                        case 55:
                                                                            int i38 = 1515191;
                                                                            while (true) {
                                                                                i38 ^= 1515208;
                                                                                switch (i38) {
                                                                                    case 30:
                                                                                        str = str22;
                                                                                        break;
                                                                                    case 127:
                                                                                        i38 = 1515222;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 113:
                                                                            i37 = zBooleanValue15 ? 1514385 : 1514354;
                                                                            break;
                                                                        case 212:
                                                                            int i39 = 1514416;
                                                                            while (true) {
                                                                                i39 ^= 1514433;
                                                                                switch (i39) {
                                                                                    case 14:
                                                                                        str = str21;
                                                                                        break;
                                                                                    case 113:
                                                                                        i39 = 1514447;
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
                                                                break;
                                                            case 115:
                                                                i36 = jSONObject == null ? 1513486 : 1513455;
                                                                break;
                                                            case 4044:
                                                                str = str21;
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    int i40 = 1513517;
                                                    while (true) {
                                                        i40 ^= 1513534;
                                                        switch (i40) {
                                                            case 19:
                                                                i40 = 1514199;
                                                                break;
                                                            case 745:
                                                                StringBuilder sb3 = new StringBuilder();
                                                                String str23 = (String) C0210.n(84703, null, new Object[]{str17, (String) C0198.n(89992, sb3, new Object[0])});
                                                                int iIntValue6 = ((Integer) C0210.n(71584, null, new Object[]{str17})).intValue();
                                                                String str24 = (String) C0149.n(83930, null, new Object[]{(short[]) C0210.n(96994), 378, Integer.valueOf(C0067.f276 ^ (-658)), 608});
                                                                JSONObject jSONObject2 = (JSONObject) C0210.n(43341, null, new Object[]{str17});
                                                                int i41 = 1515315;
                                                                while (true) {
                                                                    i41 ^= 1515332;
                                                                    switch (i41) {
                                                                        case 22:
                                                                            break;
                                                                        case 53:
                                                                            String str25 = (String) C0149.n(92089, (String) C0182.n(6366, jSONObject2, new Object[]{(String) C0198.n(51837, null, new Object[]{(short[]) C0210.n(96994), 381, Integer.valueOf(C0005.f161 ^ 647), 427}), str19}), new Object[0]);
                                                                            boolean zBooleanValue16 = ((Boolean) C0195.n(41159, null, new Object[]{str25})).booleanValue();
                                                                            int i42 = 1516214;
                                                                            while (true) {
                                                                                i42 ^= 1516231;
                                                                                switch (i42) {
                                                                                    case 18:
                                                                                        break;
                                                                                    case 51:
                                                                                        str24 = str25;
                                                                                        break;
                                                                                    case 113:
                                                                                        i42 = zBooleanValue16 ? 1516307 : 1516276;
                                                                                        break;
                                                                                    case 468:
                                                                                        int i43 = 1516338;
                                                                                        while (true) {
                                                                                            i43 ^= 1516355;
                                                                                            switch (i43) {
                                                                                                case 18:
                                                                                                    break;
                                                                                                case 113:
                                                                                                    i43 = 1516369;
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
                                                                            break;
                                                                        case 119:
                                                                            i41 = jSONObject2 == null ? 1515408 : 1515377;
                                                                            break;
                                                                        case 212:
                                                                            int i44 = 1515439;
                                                                            while (true) {
                                                                                i44 ^= 1515456;
                                                                                switch (i44) {
                                                                                    case 111:
                                                                                        i44 = 1516121;
                                                                                        continue;
                                                                                    case 15769:
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
                                                                String[] strArr2 = new String[1];
                                                                strArr2[C0060.f269 ^ (-962)] = str24;
                                                                ((Integer) C0210.n(71584, null, new Object[]{str17})).intValue();
                                                                C0213.n(60196, null, new Object[]{(AlertDialog) C0213.n(30844, null, new Object[]{activity2, str, str23, Integer.valueOf(iIntValue6), strArr, iArr, strArr2, null})});
                                                                int i45 = 1537294;
                                                                while (true) {
                                                                    i45 ^= 1537311;
                                                                    switch (i45) {
                                                                        case 17:
                                                                            i45 = 1537325;
                                                                            break;
                                                                        case 50:
                                                                            return;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }
                                                String str26 = (String) C0205.n(27026, arrayList2, new Object[]{Integer.valueOf(i34)});
                                                String[] strArr3 = strArr[i34];
                                                String str27 = (String) C0210.n(49027, null, new Object[]{str26});
                                                JSONObject jSONObject3 = (JSONObject) C0210.n(43341, null, new Object[]{str26});
                                                int i46 = 1511471;
                                                while (true) {
                                                    i46 ^= 1511488;
                                                    switch (i46) {
                                                        case 14:
                                                            break;
                                                        case 45:
                                                            String str28 = (String) C0149.n(92089, (String) C0182.n(6366, jSONObject3, new Object[]{str18, str19}), new Object[0]);
                                                            boolean zBooleanValue17 = ((Boolean) C0195.n(41159, null, new Object[]{str28})).booleanValue();
                                                            int i47 = 1512370;
                                                            while (true) {
                                                                i47 ^= 1512387;
                                                                switch (i47) {
                                                                    case 18:
                                                                        break;
                                                                    case 51:
                                                                        str27 = str28;
                                                                        break;
                                                                    case 113:
                                                                        i47 = zBooleanValue17 ? 1512463 : 1512432;
                                                                        break;
                                                                    case 1996:
                                                                        int i48 = 1512494;
                                                                        while (true) {
                                                                            i48 ^= 1512511;
                                                                            switch (i48) {
                                                                                case 17:
                                                                                    i48 = 1512525;
                                                                                    break;
                                                                                case 114:
                                                                                    break;
                                                                                default:
                                                                                    break;
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 111:
                                                            i46 = jSONObject3 == null ? 1511564 : 1511533;
                                                            break;
                                                        case 204:
                                                            int i49 = 1511595;
                                                            while (true) {
                                                                i49 ^= 1511612;
                                                                switch (i49) {
                                                                    case 23:
                                                                        i49 = 1512277;
                                                                        break;
                                                                    case 1001:
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                }
                                                strArr3[0] = str27;
                                                String[] strArr4 = strArr[i34];
                                                StringBuilder sb4 = new StringBuilder();
                                                strArr4[1] = (String) C0210.n(84703, null, new Object[]{str26, (String) C0198.n(89992, sb4, new Object[0])});
                                                iArr[i34] = ((Integer) C0210.n(71584, null, new Object[]{str26})).intValue();
                                                int i50 = i34 + 1;
                                                int i51 = 1513269;
                                                while (true) {
                                                    i51 ^= 1513286;
                                                    switch (i51) {
                                                        case 18:
                                                            break;
                                                        case 115:
                                                            i51 = 1513300;
                                                            break;
                                                    }
                                                }
                                                i34 = i50;
                                            }
                                            break;
                                        case 113:
                                            if (zBooleanValue14) {
                                                i33 = 1510541;
                                            }
                                            break;
                                        case 204:
                                            int i52 = 1510572;
                                            while (true) {
                                                i52 ^= 1510589;
                                                switch (i52) {
                                                    case 17:
                                                        i52 = 1510603;
                                                        break;
                                                    case 118:
                                                        return;
                                                }
                                            }
                                            break;
                                        default:
                                            continue;
                                    }
                                    i33 = 1510510;
                                }
                                break;
                            case 111:
                                if (activity2 == null) {
                                    i26 = 1507596;
                                }
                                break;
                            case 460:
                                C0188.n(1950, null, new Object[]{str16});
                                int i53 = 1507627;
                                while (true) {
                                    i53 ^= 1507644;
                                    switch (i53) {
                                        case 23:
                                            i53 = 1507658;
                                            break;
                                        case 118:
                                            return;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i26 = 1507565;
                    }
                } catch (Exception e4) {
                    C0188.n(1950, null, new Object[]{str16});
                    return;
                }
                break;
            case 6:
                a();
                return;
            case 7:
                C0179.n(2544, null, new Object[0]);
                return;
            case 8:
                c();
                return;
            case 9:
                ((Integer) C0195.n(23628)).intValue();
                try {
                    C0210.n(39909, (C0299u0) C0209.n(55284, null, new Object[0]), new Object[0]);
                    return;
                } catch (Throwable th) {
                    int i54 = 1544982;
                    while (true) {
                        i54 ^= 1544999;
                        switch (i54) {
                            case 18:
                                return;
                            case 49:
                                i54 = 1545013;
                                break;
                        }
                    }
                }
                break;
            case 10:
                e();
                return;
            case 11:
                C0188.n(1950, null, new Object[]{(String) C0195.n(75793, null, new Object[]{(short[]) C0210.n(96994), 329, Integer.valueOf(C0071.f280 ^ 40), 3131})});
                return;
            case 12:
                C0188.n(1950, null, new Object[]{(String) C0198.n(98419, null, new Object[]{(short[]) C0210.n(96994), 318, Integer.valueOf(C0036.f192 ^ (-33)), 376})});
                return;
            case 13:
                C0188.n(1950, null, new Object[]{(String) C0162.n(59518, null, new Object[]{(short[]) C0210.n(96994), 312, Integer.valueOf(C0132.f341 ^ (-7)), 1568})});
                return;
            case 14:
                C0188.n(1950, null, new Object[]{(String) C0224.n(74697, null, new Object[]{(short[]) C0210.n(96994), 299, Integer.valueOf(C0039.f195 ^ 787), 2268})});
                return;
            case 15:
                C0188.n(1950, null, new Object[]{(String) C0149.n(83930, null, new Object[]{(short[]) C0210.n(96994), 294, Integer.valueOf(C0031.f187 ^ (-613)), 3181})});
                return;
            case 16:
                C0188.n(1950, null, new Object[]{(String) C0162.n(52865, null, new Object[]{(short[]) C0210.n(96994), 277, Integer.valueOf(C0048.f204 ^ 837), 2996})});
                return;
            case 17:
                C0188.n(1950, null, new Object[]{(String) C0198.n(94433, null, new Object[]{(short[]) C0210.n(96994), 266, Integer.valueOf(C0062.f271 ^ 538), 3141})});
                return;
            case 18:
                C0188.n(1950, null, new Object[]{(String) C0182.n(69249, null, new Object[]{(short[]) C0210.n(96994), 253, Integer.valueOf(C0078.f287 ^ (-701)), 1861})});
                return;
            case 19:
                C0188.n(1950, null, new Object[]{(String) C0149.n(83930, null, new Object[]{(short[]) C0210.n(96994), 247, Integer.valueOf(C0094.f303 ^ (-126)), 1097})});
                return;
            case 20:
                try {
                    C0152.n(52927, null, new Object[]{new RunnableC0315z1(C0141.f351 ^ (-796))});
                    int i55 = 56579;
                    while (true) {
                        i55 ^= 56596;
                        switch (i55) {
                            case 23:
                                i55 = 56610;
                                break;
                            case 54:
                                return;
                        }
                    }
                } catch (Exception e5) {
                    C0152.n(52927, null, new Object[]{new U1(e5, 1)});
                    return;
                }
                break;
            case 21:
                C0188.n(1950, null, new Object[]{(String) C0162.n(41206, null, new Object[]{(short[]) C0210.n(96994), 240, Integer.valueOf(C0058.f267 ^ 96), 2715})});
                int iIntValue7 = ((Integer) C0233.n(87817, null, new Object[0])).intValue();
                int i56 = 56455;
                while (true) {
                    i56 ^= 56472;
                    switch (i56) {
                        case 31:
                            if (iIntValue7 >= 0) {
                                i56 = 56548;
                            }
                            break;
                        case 62:
                            break;
                        case 93:
                            return;
                        case 124:
                            C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0194.n(4660, null, new Object[]{(String) C0210.n(43253)})})});
                            return;
                        default:
                            continue;
                    }
                    i56 = 56517;
                }
                break;
            default:
                String str29 = (String) C0182.n(69249, null, new Object[]{(short[]) C0210.n(96994), 169, Integer.valueOf(C0015.f171 ^ (-943)), 392});
                while (true) {
                    synchronized (C0210.n(49945)) {
                        try {
                            boolean zBooleanValue18 = ((Boolean) C0210.n(94520)).booleanValue();
                            int i57 = 1616;
                            while (true) {
                                i57 ^= 1633;
                                switch (i57) {
                                    case 14:
                                        break;
                                    case 49:
                                        i57 = !zBooleanValue18 ? 1709 : 1678;
                                        break;
                                    case 204:
                                        k2.e = false;
                                        boolean zBooleanValue19 = ((Boolean) C0210.n(42357)).booleanValue();
                                        k2.i = false;
                                        int i58 = 1740;
                                        while (true) {
                                            i58 ^= 1757;
                                            switch (i58) {
                                                case 17:
                                                    if (zBooleanValue19) {
                                                        i58 = 1833;
                                                    }
                                                    break;
                                                case 54:
                                                    break;
                                                case 471:
                                                    return;
                                                case 500:
                                                    C0152.n(52927, null, new Object[]{new V0(str29, C0124.f333 ^ (-755))});
                                                    return;
                                                default:
                                                    continue;
                                            }
                                            i58 = 1802;
                                        }
                                        break;
                                    case 239:
                                        break;
                                    default:
                                        break;
                                }
                            }
                            k2.f = false;
                            boolean zBooleanValue20 = ((Boolean) C0210.n(93904)).booleanValue();
                            k2.g = false;
                            String str30 = (String) C0210.n(45422);
                            k2.h = (String) C0195.n(43185);
                            j2 j2Var = (j2) C0210.n(55740, null, new Object[0]);
                            int i59 = 48767;
                            while (true) {
                                i59 ^= 48784;
                                switch (i59) {
                                    case 14:
                                        break;
                                    case 45:
                                        z2 = false;
                                        break;
                                    case 76:
                                        int i60 = 48891;
                                        while (true) {
                                            i60 ^= 48908;
                                            switch (i60) {
                                                case 22:
                                                    break;
                                                case 53:
                                                    str4 = (String) C0210.n(26764, j2Var);
                                                    break;
                                                case 503:
                                                    i60 = j2Var == null ? 49635 : 48953;
                                                    break;
                                                case 32495:
                                                    String str31 = (String) C0195.n(43185);
                                                    int i61 = 49666;
                                                    while (true) {
                                                        i61 ^= 49683;
                                                        switch (i61) {
                                                            case 17:
                                                                i61 = 49697;
                                                                break;
                                                            case 50:
                                                                str4 = str31;
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
                                        int i62 = 49790;
                                        while (true) {
                                            i62 ^= 49807;
                                            switch (i62) {
                                                case 18:
                                                    break;
                                                case 51:
                                                    z2 = false;
                                                    break;
                                                case 84:
                                                    boolean zBooleanValue21 = ((Boolean) C0195.n(5730, str30, new Object[0])).booleanValue();
                                                    int i63 = 49914;
                                                    while (true) {
                                                        i63 ^= 49931;
                                                        switch (i63) {
                                                            case 497:
                                                                i63 = !zBooleanValue21 ? 50658 : 50627;
                                                                break;
                                                            case 1711:
                                                                break;
                                                            case 1736:
                                                                z2 = false;
                                                                break;
                                                            case 1769:
                                                                boolean zBooleanValue22 = ((Boolean) C0182.n(55567, str30, new Object[]{str4})).booleanValue();
                                                                int i64 = 50689;
                                                                while (true) {
                                                                    i64 ^= 50706;
                                                                    switch (i64) {
                                                                        case 19:
                                                                            i64 = zBooleanValue22 ? 50782 : 50751;
                                                                            break;
                                                                        case 45:
                                                                            z2 = false;
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                        case 76:
                                                                            z2 = true;
                                                                            int i65 = 50813;
                                                                            while (true) {
                                                                                i65 ^= 50830;
                                                                                switch (i65) {
                                                                                    case 18:
                                                                                        break;
                                                                                    case 243:
                                                                                        i65 = 50844;
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
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
                                                case 241:
                                                    i62 = str30 != null ? 49883 : 49852;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 239:
                                        i59 = zBooleanValue20 ? 48860 : 48829;
                                        break;
                                    default:
                                        break;
                                }
                            }
                            int i66 = 51588;
                            while (true) {
                                i66 ^= 51605;
                                switch (i66) {
                                    case 17:
                                        i66 = j2Var == null ? 51681 : 51650;
                                        break;
                                    case 54:
                                        break;
                                    case 87:
                                        try {
                                            String str32 = (String) C0210.n(17904, null, new Object[]{j2Var, Boolean.valueOf(z2)});
                                            C0210.n(56693, null, new Object[]{j2Var});
                                            k2.j = ((Long) C0191.n(43180, null, new Object[0])).longValue();
                                            k2.k = (String) C0195.n(43185);
                                            C0210.n(71422, null, new Object[]{j2Var});
                                            int i67 = 52735;
                                            while (true) {
                                                i67 ^= 52752;
                                                switch (i67) {
                                                    case 14:
                                                        str29 = str32;
                                                        continue;
                                                        break;
                                                    case 1007:
                                                        i67 = 52766;
                                                        break;
                                                }
                                            }
                                        } catch (Exception e6) {
                                            int i68 = 52611;
                                            while (true) {
                                                i68 ^= 52628;
                                                switch (i68) {
                                                    case 23:
                                                        i68 = 52642;
                                                        break;
                                                    case 54:
                                                        boolean zBooleanValue23 = ((Boolean) C0210.n(15222, null, new Object[]{j2Var})).booleanValue();
                                                        int i69 = 53510;
                                                        while (true) {
                                                            i69 ^= 53527;
                                                            switch (i69) {
                                                                case 17:
                                                                    i69 = !zBooleanValue23 ? 53603 : 53572;
                                                                    break;
                                                                case 50:
                                                                    break;
                                                                case 83:
                                                                    String str33 = (String) C0152.n(85600, null, new Object[]{(short[]) C0210.n(96994), 210, Integer.valueOf(C0064.f273 ^ (-448)), 2653});
                                                                    boolean z4 = e6 instanceof SQLiteConstraintException;
                                                                    int i70 = 53758;
                                                                    while (true) {
                                                                        i70 ^= 53775;
                                                                        switch (i70) {
                                                                            case 1009:
                                                                                i70 = z4 ? 54502 : 54471;
                                                                                break;
                                                                            case 1703:
                                                                                break;
                                                                            case 1736:
                                                                                String str34 = (String) C0149.n(60672, e6, new Object[0]);
                                                                                int i71 = 54657;
                                                                                while (true) {
                                                                                    i71 ^= 54674;
                                                                                    switch (i71) {
                                                                                        case 19:
                                                                                            i71 = str34 != null ? 55401 : 54719;
                                                                                            break;
                                                                                        case 45:
                                                                                            str3 = str33;
                                                                                            break;
                                                                                        case 50:
                                                                                            break;
                                                                                        case 3579:
                                                                                            boolean zBooleanValue24 = ((Boolean) C0195.n(5730, (String) C0149.n(60672, e6, new Object[0]), new Object[0])).booleanValue();
                                                                                            int i72 = 55432;
                                                                                            while (true) {
                                                                                                i72 ^= 55449;
                                                                                                switch (i72) {
                                                                                                    case 17:
                                                                                                        i72 = zBooleanValue24 ? 55525 : 55494;
                                                                                                        break;
                                                                                                    case 62:
                                                                                                        break;
                                                                                                    case 95:
                                                                                                        str3 = (String) C0149.n(60672, e6, new Object[0]);
                                                                                                        break;
                                                                                                    case 124:
                                                                                                        int i73 = 55556;
                                                                                                        while (true) {
                                                                                                            i73 ^= 55573;
                                                                                                            switch (i73) {
                                                                                                                case 17:
                                                                                                                    i73 = 55587;
                                                                                                                    break;
                                                                                                                case 54:
                                                                                                                    str3 = str33;
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
                                                                            case 1769:
                                                                                String str35 = (String) C0162.n(24506, null, new Object[]{(short[]) C0210.n(96994), 218, Integer.valueOf(C0080.f289 ^ 244), 955});
                                                                                int i74 = 54533;
                                                                                while (true) {
                                                                                    i74 ^= 54550;
                                                                                    switch (i74) {
                                                                                        case 19:
                                                                                            i74 = 54564;
                                                                                            break;
                                                                                        case 50:
                                                                                            str3 = str35;
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                    C0210.n(56693, null, new Object[]{j2Var});
                                                                    k2.k = str3;
                                                                    C0210.n(71422, null, new Object[]{j2Var});
                                                                    StringBuilder sb5 = new StringBuilder((String) C0198.n(68788, null, new Object[]{(short[]) C0210.n(96994), 233, Integer.valueOf(C0100.f309 ^ (-511)), 1729}));
                                                                    C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb5, new Object[0])});
                                                                    int i75 = 55680;
                                                                    while (true) {
                                                                        i75 ^= 55697;
                                                                        switch (i75) {
                                                                            case 17:
                                                                                i75 = 56362;
                                                                                break;
                                                                            case 1467:
                                                                                str29 = str3;
                                                                                continue;
                                                                                continue;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 116:
                                                                    String str36 = (String) C0178.n(26978, null, new Object[]{(short[]) C0210.n(96994), 192, Integer.valueOf(C0068.f277 ^ 375), 1010});
                                                                    int i76 = 53634;
                                                                    while (true) {
                                                                        i76 ^= 53651;
                                                                        switch (i76) {
                                                                            case 17:
                                                                                i76 = 53665;
                                                                                break;
                                                                            case 50:
                                                                                str29 = str36;
                                                                                continue;
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case 116:
                                        boolean zBooleanValue25 = ((Boolean) C0210.n(50711, null, new Object[0])).booleanValue();
                                        int i77 = 51712;
                                        while (true) {
                                            i77 ^= 51729;
                                            switch (i77) {
                                                case 14:
                                                    break;
                                                case 17:
                                                    i77 = zBooleanValue25 ? 51805 : 51774;
                                                    break;
                                                case 47:
                                                    str2 = (String) C0162.n(29890, null, new Object[]{(short[]) C0210.n(96994), 182, Integer.valueOf(C0040.f196 ^ (-327)), 3271});
                                                    break;
                                                case 76:
                                                    str2 = (String) C0198.n(51837, null, new Object[]{(short[]) C0210.n(96994), 176, Integer.valueOf(C0035.f191 ^ 314), 2201});
                                                    int i78 = 51836;
                                                    while (true) {
                                                        i78 ^= 51853;
                                                        switch (i78) {
                                                            case 241:
                                                                i78 = 52518;
                                                                break;
                                                            case 1963:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        throw new IllegalStateException(str2);
                                    default:
                                        break;
                                }
                            }
                        } catch (Throwable th2) {
                            int i79 = 1864;
                            while (true) {
                                i79 ^= 1881;
                                switch (i79) {
                                    case 17:
                                        i79 = 48674;
                                        break;
                                    case 47483:
                                        throw th2;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }
}
