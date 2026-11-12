package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.A.InterfaceC0306w1;
import com.github.catvod.spider.merge.D.C0007;
import com.github.catvod.spider.merge.E.C0015;
import com.github.catvod.spider.merge.O.C0039;
import com.github.catvod.spider.merge.Q.C0041;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.d0.C0069;
import com.github.catvod.spider.merge.k0.C0100;
import com.github.catvod.spider.merge.p003d.C0067;
import com.github.catvod.spider.merge.p016t.C0121;
import com.github.catvod.spider.merge.p020x.C0136;
import com.github.catvod.spider.merge.t0.C0123;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import moyu.fucking.C0149;
import moyu.fucking.C0150;
import moyu.fucking.C0152;
import moyu.fucking.C0154;
import moyu.fucking.C0155;
import moyu.fucking.C0157;
import moyu.fucking.C0162;
import moyu.fucking.C0163;
import moyu.fucking.C0168;
import moyu.fucking.C0175;
import moyu.fucking.C0177;
import moyu.fucking.C0178;
import moyu.fucking.C0179;
import moyu.fucking.C0182;
import moyu.fucking.C0183;
import moyu.fucking.C0188;
import moyu.fucking.C0190;
import moyu.fucking.C0195;
import moyu.fucking.C0196;
import moyu.fucking.C0198;
import moyu.fucking.C0209;
import moyu.fucking.C0216;
import moyu.fucking.C0221;
import moyu.fucking.C0224;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class C0368n0 implements InterfaceC0306w1 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f246short = {1445, 1446, 1447, 1460, 1504, 1510, 1525, 1530, 1511, 1522, 1521, 1510, 1460, 1525, 1527, 1527, 1531, 1505, 1530, 1504, 1460, 1531, 1510, 1460, 1526, 1525, 1504, 1527, 1532, 1460, 1527, 1532, 1525, 1530, 1523, 1521, 1520, 2703, 2691, 2696, 2697, 566, 569, 572, 565, 537, 532, 547, 2983, 3003, 3003, 3007, 3004, 3061, 3040, 3040, 2976, 3007, 2986, 2977, 3042, 2990, 3007, 2982, 3041, 3070, 3069, 3068, 3007, 2990, 2977, 3041, 2988, 2976, 2978, 3040, 2990, 3007, 2982, 3040, 3001, 3070, 3040, 2985, 2982, 2979, 2986, 3040, 3003, 3005, 2990, 3004, 2983, 3118, 3081, 3085, 3102, 3081, 3102, 3148, 1223, 1267, 1266, 1262, 1257, 1268, 1263, 1276, 1255, 1266, 1263, 1257, 1256, 828, 768, 781, 792, 778, 771, 798, 769, 1145, 1126, 1139, 1144, 1097, 1126, 1146, 1143, 1122, 1136, 1145, 1124, 1147, 638, 604, 604, 602, 591, 587, 1316, 1333, 1333, 1321, 1324, 1318, 1316, 1329, 1324, 1322, 1323, 1386, 1327, 1334, 1322, 1323};
    public final long a;
    public final String b;
    public final String c;
    public final Set d;
    public final long e;
    public final C0377s0 f;

    public C0368n0(C0377s0 c0377s0, long j, String str, String str2, Set set, long j2) throws Throwable {
        this.f = c0377s0;
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = set;
        this.e = j2;
        int iIntValue = ((Integer) C0183.n(4055, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0195.n(72189, null, new Object[]{(String) C0179.n(51115, null, new Object[]{(String) C0196.n(4165)})})});
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
        C0377s0 c0377s0 = (C0377s0) C0196.n(89453, this);
        long jLongValue = ((Long) C0175.n(72334, (AtomicLong) C0196.n(69216, c0377s0), new Object[0])).longValue();
        long jLongValue2 = ((Long) C0196.n(93531, this)).longValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = jLongValue2 == jLongValue ? 1709 : 1678;
                    break;
                case 204:
                    String str = (String) C0196.n(25961, this);
                    String str2 = (String) C0196.n(3793, this);
                    boolean zBooleanValue = ((Boolean) C0196.n(31450, c0377s0, new Object[]{str2, str})).booleanValue();
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
                                return new ArrayList((LinkedHashSet) C0196.n(31857, null, new Object[]{str2, (JSONObject) C0196.n(45362, null, new Object[0])}));
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
        throw new Exception((String) C0152.n(85600, null, new Object[]{(short[]) C0196.n(96502), 0, Integer.valueOf(C0100.f309 ^ (-477)), 1428}));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x01c9. Please report as an issue. */
    @Override // com.github.catvod.spider.merge.A.InterfaceC0306w1
    public final boolean b(ArrayList arrayList) throws Throwable {
        String str = (String) C0162.n(76230, null, new Object[]{(short[]) C0196.n(96502), 37, Integer.valueOf(C0039.f195 ^ 794), 2796});
        C0377s0 c0377s0 = (C0377s0) C0196.n(89453, this);
        long jLongValue = ((Long) C0175.n(72334, (AtomicLong) C0196.n(69216, c0377s0), new Object[0])).longValue();
        long jLongValue2 = ((Long) C0196.n(93531, this)).longValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = jLongValue2 == jLongValue ? 1709 : 1678;
                    break;
                case 204:
                    String str2 = (String) C0196.n(3793, this);
                    String str3 = (String) C0196.n(25961, this);
                    boolean zBooleanValue = ((Boolean) C0196.n(31450, c0377s0, new Object[]{str2, str3})).booleanValue();
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
                                List list = (List) C0163.n(38930, arrayList, new Object[]{0, Integer.valueOf(((Integer) C0168.n(51017, null, new Object[]{Integer.valueOf(C0042.f198 ^ 95), Integer.valueOf(((Integer) C0179.n(44660, arrayList, new Object[0])).intValue())})).intValue())});
                                JSONObject jSONObject = (JSONObject) C0196.n(45362, null, new Object[0]);
                                LinkedHashSet linkedHashSet = (LinkedHashSet) C0196.n(31857, null, new Object[]{str2, jSONObject});
                                boolean zBooleanValue2 = ((Boolean) C0163.n(8422, linkedHashSet, new Object[]{list})).booleanValue();
                                int i3 = 48767;
                                while (true) {
                                    i3 ^= 48784;
                                    switch (i3) {
                                        case 14:
                                            break;
                                        case 45:
                                            break;
                                        case 76:
                                            boolean zBooleanValue3 = ((Boolean) C0183.n(42031, null, new Object[]{list, (Set) C0196.n(49251, this)})).booleanValue();
                                            int i4 = 48891;
                                            while (true) {
                                                i4 ^= 48908;
                                                switch (i4) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        JSONArray jSONArray = new JSONArray();
                                                        Iterator it = (Iterator) C0221.n(11992, list, new Object[0]);
                                                        while (true) {
                                                            boolean zBooleanValue4 = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
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
                                                                        i5 = zBooleanValue4 ? 49883 : 49852;
                                                                        break;
                                                                    default:
                                                                        break;
                                                                }
                                                                JSONObject jSONObject2 = new JSONObject();
                                                                long jLongValue3 = ((Long) C0168.n(30120, (TimeUnit) C0168.n(7737), new Object[]{Long.valueOf(((Long) C0196.n(9665, this)).longValue() - ((Long) C0182.n(75677, null, new Object[0])).longValue())})).longValue();
                                                                int i6 = 50689;
                                                                while (true) {
                                                                    i6 ^= 50706;
                                                                    switch (i6) {
                                                                        case 19:
                                                                            i6 = jLongValue3 > 0 ? 50782 : 50751;
                                                                            break;
                                                                        case 45:
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                        case 76:
                                                                            long jLongValue4 = ((Long) C0175.n(72334, (AtomicLong) C0196.n(69216, c0377s0), new Object[0])).longValue();
                                                                            int i7 = 50813;
                                                                            while (true) {
                                                                                i7 ^= 50830;
                                                                                switch (i7) {
                                                                                    case 18:
                                                                                        break;
                                                                                    case 53:
                                                                                        Request.Builder builder = (Request.Builder) C0177.n(5807, null, new Object[]{(String) C0224.n(67549, null, new Object[]{(short[]) C0196.n(96502), 48, Integer.valueOf(C0067.f276 ^ (-704)), 3023})});
                                                                                        StringBuilder sb = new StringBuilder((String) C0198.n(88124, null, new Object[]{(short[]) C0196.n(96502), 93, Integer.valueOf(C0069.f278 ^ 274), 3180}));
                                                                                        Request.Builder builder2 = (Request.Builder) C0150.n(94115, (Request.Builder) C0150.n(94115, builder, new Object[]{(String) C0152.n(85600, null, new Object[]{(short[]) C0196.n(96502), 100, Integer.valueOf(C0041.f197 ^ (-43)), 1158}), (String) C0198.n(89992, sb, new Object[0])}), new Object[]{(String) C0182.n(27462, null, new Object[]{(short[]) C0196.n(96502), 113, Integer.valueOf(C0123.f332 ^ (-160)), 876}), (String) C0157.n(97123, null, new Object[]{(short[]) C0196.n(96502), 121, Integer.valueOf(C0007.f163 ^ 170), 1046})});
                                                                                        String str4 = (String) C0178.n(26978, null, new Object[]{(short[]) C0196.n(96502), 134, Integer.valueOf(C0136.f345 ^ 727), 575});
                                                                                        String str5 = (String) C0149.n(63176, null, new Object[]{(short[]) C0196.n(96502), 140, Integer.valueOf(C0015.f171 ^ (-954)), 1349});
                                                                                        Response response = (Response) C0188.n(77170, null, new Object[]{(Request) C0188.n(95309, (Request.Builder) C0188.n(31368, (Request.Builder) C0150.n(94115, builder2, new Object[]{str4, str5}), new Object[]{(RequestBody) C0188.n(41454, null, new Object[]{(MediaType) C0209.n(35329, null, new Object[]{str5}), (String) C0182.n(84813, jSONObject2, new Object[0])})}), new Object[0]), Long.valueOf(jLongValue3)});
                                                                                        try {
                                                                                            boolean zBooleanValue5 = ((Boolean) C0150.n(57891, response, new Object[0])).booleanValue();
                                                                                            int i8 = 51712;
                                                                                            while (true) {
                                                                                                i8 ^= 51729;
                                                                                                switch (i8) {
                                                                                                    case 14:
                                                                                                        break;
                                                                                                    case 17:
                                                                                                        i8 = zBooleanValue5 ? 51805 : 51774;
                                                                                                        break;
                                                                                                    case 47:
                                                                                                        break;
                                                                                                    case 76:
                                                                                                        ResponseBody responseBody = (ResponseBody) C0188.n(57688, response, new Object[0]);
                                                                                                        int i9 = 51836;
                                                                                                        while (true) {
                                                                                                            i9 ^= 51853;
                                                                                                            switch (i9) {
                                                                                                                case 241:
                                                                                                                    i9 = responseBody != null ? 52580 : 52549;
                                                                                                                    break;
                                                                                                                case 1963:
                                                                                                                    break;
                                                                                                                case 1992:
                                                                                                                    break;
                                                                                                                case 2025:
                                                                                                                    boolean zBooleanValue6 = ((Boolean) C0196.n(31450, c0377s0, new Object[]{str2, str3})).booleanValue();
                                                                                                                    int i10 = 52611;
                                                                                                                    while (true) {
                                                                                                                        i10 ^= 52628;
                                                                                                                        switch (i10) {
                                                                                                                            case 23:
                                                                                                                                i10 = !zBooleanValue6 ? 52704 : 52673;
                                                                                                                                break;
                                                                                                                            case 54:
                                                                                                                                break;
                                                                                                                            case 85:
                                                                                                                                JSONObject jSONObject3 = new JSONObject((String) C0150.n(36990, (ResponseBody) C0188.n(57688, response, new Object[0]), new Object[0]));
                                                                                                                                boolean zBooleanValue7 = ((Boolean) C0195.n(28467, jSONObject3, new Object[]{str})).booleanValue();
                                                                                                                                int i11 = 53510;
                                                                                                                                while (true) {
                                                                                                                                    i11 ^= 53527;
                                                                                                                                    switch (i11) {
                                                                                                                                        case 17:
                                                                                                                                            i11 = zBooleanValue7 ? 53603 : 53572;
                                                                                                                                            break;
                                                                                                                                        case 50:
                                                                                                                                            break;
                                                                                                                                        case 83:
                                                                                                                                            break;
                                                                                                                                        case 116:
                                                                                                                                            int iIntValue = ((Integer) C0155.n(98955, jSONObject3, new Object[]{str, Integer.valueOf(C0121.f330 ^ 548)})).intValue();
                                                                                                                                            int i12 = 53634;
                                                                                                                                            while (true) {
                                                                                                                                                i12 ^= 53651;
                                                                                                                                                switch (i12) {
                                                                                                                                                    case 17:
                                                                                                                                                        i12 = iIntValue != 0 ? 53727 : 53696;
                                                                                                                                                        break;
                                                                                                                                                    case 50:
                                                                                                                                                        break;
                                                                                                                                                    case 76:
                                                                                                                                                        int i13 = 53758;
                                                                                                                                                        while (true) {
                                                                                                                                                            i13 ^= 53775;
                                                                                                                                                            switch (i13) {
                                                                                                                                                                case 1009:
                                                                                                                                                                    i13 = 54440;
                                                                                                                                                                    continue;
                                                                                                                                                                case 1703:
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    continue;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 83:
                                                                                                                                                        C0188.n(37526, response, new Object[0]);
                                                                                                                                                        ((Boolean) C0163.n(37187, linkedHashSet, new Object[]{list})).booleanValue();
                                                                                                                                                        boolean zBooleanValue8 = ((Boolean) C0182.n(55567, str2, new Object[]{(String) C0196.n(32447, c0377s0)})).booleanValue();
                                                                                                                                                        int i14 = 54533;
                                                                                                                                                        while (true) {
                                                                                                                                                            i14 ^= 54550;
                                                                                                                                                            switch (i14) {
                                                                                                                                                                case 19:
                                                                                                                                                                    i14 = zBooleanValue8 ? 54626 : 54595;
                                                                                                                                                                    break;
                                                                                                                                                                case 50:
                                                                                                                                                                    break;
                                                                                                                                                                case 85:
                                                                                                                                                                    break;
                                                                                                                                                                case 116:
                                                                                                                                                                    boolean zBooleanValue9 = ((Boolean) C0190.n(69014, list, new Object[]{(String) C0196.n(48527, c0377s0)})).booleanValue();
                                                                                                                                                                    int i15 = 54657;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i15 ^= 54674;
                                                                                                                                                                        switch (i15) {
                                                                                                                                                                            case 19:
                                                                                                                                                                                i15 = zBooleanValue9 ? 55401 : 54719;
                                                                                                                                                                                break;
                                                                                                                                                                            case 45:
                                                                                                                                                                                break;
                                                                                                                                                                            case 50:
                                                                                                                                                                                break;
                                                                                                                                                                            case 3579:
                                                                                                                                                                                String str6 = (String) C0195.n(43185);
                                                                                                                                                                                c0377s0.m = str6;
                                                                                                                                                                                c0377s0.o = str6;
                                                                                                                                                                                c0377s0.p = str6;
                                                                                                                                                                                c0377s0.q = str6;
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
                                                                                                                                                        C0196.n(82593, null, new Object[]{jSONObject, str2, linkedHashSet});
                                                                                                                                                        int iIntValue2 = ((Integer) C0154.n(77394, list, new Object[0])).intValue();
                                                                                                                                                        int iIntValue3 = ((Integer) C0179.n(44660, arrayList, new Object[0])).intValue();
                                                                                                                                                        int i16 = 55432;
                                                                                                                                                        while (true) {
                                                                                                                                                            i16 ^= 55449;
                                                                                                                                                            switch (i16) {
                                                                                                                                                                case 17:
                                                                                                                                                                    if (iIntValue2 == iIntValue3) {
                                                                                                                                                                        i16 = 55525;
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 62:
                                                                                                                                                                    break;
                                                                                                                                                                case 95:
                                                                                                                                                                    return false;
                                                                                                                                                                case 124:
                                                                                                                                                                    return true;
                                                                                                                                                                default:
                                                                                                                                                                    continue;
                                                                                                                                                            }
                                                                                                                                                            i16 = 55494;
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
                                                                                                                                C0188.n(37526, response, new Object[0]);
                                                                                                                                return false;
                                                                                                                            case 116:
                                                                                                                                int i17 = 52735;
                                                                                                                                while (true) {
                                                                                                                                    i17 ^= 52752;
                                                                                                                                    switch (i17) {
                                                                                                                                        case 14:
                                                                                                                                            break;
                                                                                                                                        case 1007:
                                                                                                                                            i17 = 52766;
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
                                                                                            C0188.n(37526, response, new Object[0]);
                                                                                            return false;
                                                                                        } catch (Throwable th) {
                                                                                            int i18 = 55556;
                                                                                            while (true) {
                                                                                                i18 ^= 55573;
                                                                                                switch (i18) {
                                                                                                    case 17:
                                                                                                        i18 = 55587;
                                                                                                        break;
                                                                                                    case 54:
                                                                                                        int i19 = 55680;
                                                                                                        while (true) {
                                                                                                            i19 ^= 55697;
                                                                                                            switch (i19) {
                                                                                                                case 17:
                                                                                                                    i19 = response != null ? 56424 : 56393;
                                                                                                                    break;
                                                                                                                case 1467:
                                                                                                                    break;
                                                                                                                case 1496:
                                                                                                                    break;
                                                                                                                case 1529:
                                                                                                                    try {
                                                                                                                        C0188.n(37526, response, new Object[0]);
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
                                                                                                                    } catch (Throwable th2) {
                                                                                                                        C0216.n(87692, th, new Object[]{th2});
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        throw th;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 243:
                                                                                        i7 = jLongValue2 != jLongValue4 ? 51557 : 50875;
                                                                                        break;
                                                                                    case 4075:
                                                                                        int i21 = 51588;
                                                                                        while (true) {
                                                                                            i21 ^= 51605;
                                                                                            switch (i21) {
                                                                                                case 17:
                                                                                                    i21 = 51619;
                                                                                                    continue;
                                                                                                case 54:
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
                                                            }
                                                            int i22 = 49914;
                                                            while (true) {
                                                                i22 ^= 49931;
                                                                switch (i22) {
                                                                    case 497:
                                                                        i22 = 50596;
                                                                        break;
                                                                    case 1711:
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 503:
                                                        i4 = !zBooleanValue3 ? 49635 : 48953;
                                                        break;
                                                    case 32495:
                                                        int i23 = 49666;
                                                        while (true) {
                                                            i23 ^= 49683;
                                                            switch (i23) {
                                                                case 17:
                                                                    i23 = 49697;
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
                                            break;
                                        case 239:
                                            i3 = zBooleanValue2 ? 48860 : 48829;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 500:
                                int i24 = 1864;
                                while (true) {
                                    i24 ^= 1881;
                                    switch (i24) {
                                        case 17:
                                            i24 = 48674;
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
        return false;
    }
}
