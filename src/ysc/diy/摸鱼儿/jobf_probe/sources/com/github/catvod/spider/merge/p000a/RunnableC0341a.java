package com.github.catvod.spider.merge.p000a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.github.catvod.spider.FanShu;
import com.github.catvod.spider.Gying;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.Push;
import com.github.catvod.spider.merge.A.C0002;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.B.C0005;
import com.github.catvod.spider.merge.D.C0007;
import com.github.catvod.spider.merge.E.C0015;
import com.github.catvod.spider.merge.G.C0020;
import com.github.catvod.spider.merge.G.C0022;
import com.github.catvod.spider.merge.G.C0023;
import com.github.catvod.spider.merge.G.C0024;
import com.github.catvod.spider.merge.I.C0025;
import com.github.catvod.spider.merge.K.C0029;
import com.github.catvod.spider.merge.L.C0031;
import com.github.catvod.spider.merge.L.C0033;
import com.github.catvod.spider.merge.N.C0035;
import com.github.catvod.spider.merge.N.C0036;
import com.github.catvod.spider.merge.N.C0037;
import com.github.catvod.spider.merge.O.C0038;
import com.github.catvod.spider.merge.Q.C0040;
import com.github.catvod.spider.merge.Q.C0041;
import com.github.catvod.spider.merge.Q.C0042;
import com.github.catvod.spider.merge.S.e;
import com.github.catvod.spider.merge.T.C0048;
import com.github.catvod.spider.merge.X.C0051;
import com.github.catvod.spider.merge.X.C0052;
import com.github.catvod.spider.merge.Z.C0054;
import com.github.catvod.spider.merge.b0.C0060;
import com.github.catvod.spider.merge.c0.C0064;
import com.github.catvod.spider.merge.c0.C0065;
import com.github.catvod.spider.merge.d0.C0068;
import com.github.catvod.spider.merge.d0.C0069;
import com.github.catvod.spider.merge.e0.C0075;
import com.github.catvod.spider.merge.f0.C0078;
import com.github.catvod.spider.merge.f0.C0080;
import com.github.catvod.spider.merge.h0.C0086;
import com.github.catvod.spider.merge.j0.C0094;
import com.github.catvod.spider.merge.k0.C0099;
import com.github.catvod.spider.merge.p0.C0110;
import com.github.catvod.spider.merge.p0.C0111;
import com.github.catvod.spider.merge.p001b.C0058;
import com.github.catvod.spider.merge.p003d.C0066;
import com.github.catvod.spider.merge.p004e.C0071;
import com.github.catvod.spider.merge.p005f.h;
import com.github.catvod.spider.merge.p006g.a;
import com.github.catvod.spider.merge.p007h.C0084;
import com.github.catvod.spider.merge.p008i.C0088;
import com.github.catvod.spider.merge.p011m.C0102;
import com.github.catvod.spider.merge.p017u.C0127;
import com.github.catvod.spider.merge.p017u.C0129;
import com.github.catvod.spider.merge.p017u.DialogInterfaceOnClickListenerC0454f;
import com.github.catvod.spider.merge.p017u.M;
import com.github.catvod.spider.merge.p018v.C0132;
import com.github.catvod.spider.merge.p018v.d;
import com.github.catvod.spider.merge.p019w.C0134;
import com.github.catvod.spider.merge.p020x.C0138;
import com.github.catvod.spider.merge.p022z.B2;
import com.github.catvod.spider.merge.p022z.C0502f3;
import com.github.catvod.spider.merge.p022z.C0517i3;
import com.github.catvod.spider.merge.p022z.C0533m;
import com.github.catvod.spider.merge.p022z.D;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0518j;
import com.github.catvod.spider.merge.p022z.F;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.RunnableC0597z;
import com.github.catvod.spider.merge.p022z.V;
import com.github.catvod.spider.merge.p022z.Y3;
import com.github.catvod.spider.merge.q0.C0113;
import com.github.catvod.spider.merge.t0.C0123;
import com.github.catvod.utils.C0144;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import moyu.fucking.C0147;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0155;
import moyu.fucking.C0157;
import moyu.fucking.C0159;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0176;
import moyu.fucking.C0178;
import moyu.fucking.C0179;
import moyu.fucking.C0180;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0186;
import moyu.fucking.C0188;
import moyu.fucking.C0191;
import moyu.fucking.C0192;
import moyu.fucking.C0194;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0199;
import moyu.fucking.C0204;
import moyu.fucking.C0209;
import moyu.fucking.C0213;
import moyu.fucking.C0215;
import moyu.fucking.C0221;
import moyu.fucking.C0224;
import moyu.fucking.C0231;
import moyu.fucking.C0232;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0341a implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f226short = {27799, 27908, 26282, 27560, 22197, 19753, 30590, 19548, 31661, 633, 19549, 31661, -29099, 26402, 26363, 26472, 27846, 19790, 21278, 31985, 630, 25028, 21886, 20507, -27340, 29906, 19790, 21278, 19753, 30590, -28672, 32419, 19427, 24422, 20738, 28508, -26316, 30487, 20808, -31396, 2115, 2137, 24469, 19898, 22847, 20567, 605, 583, 21256, 29199, 30838, 29183, 30498, 22112, 22683, 22248, 21916, 25849, 21407, 18698, 28995, 28959, 21428, 29363, 29997, 26522, 22425, -27897, 28782, 31163, 28722, 23276, 18663, 18928, 22288, 30042, 20930, 25159, 25556, 21757, -29054, 29094, 21074, 22086, 26648, -25745, 30028, 21267, -30969, 2584, 2562, 21856, 21516, -32281, 30007, -26892, 24706, 23730, 24030, 24706, -26843, 20580, -27388, 26237, 25048, 23691, 25509, 23710, 21229, 24172, 21229, -27021, -878, -30688, 31984, 19795, 20593, 19523, 22726, 29217, 20949, 28644, 17525, 21016, -31220, 2835, 2825, 1014, 972, 24151, 24170, 24151, 24170, -30049, 20512, 25347, 31081, 30483, 24125, 25470, 299, 263, 263, 259, 257, 269, 30483, 24125, 30581, 24682, 22096, 1743, 31828, 29605, 25786, 2333, 2305, 2316, 29683, 30237, 31577, 23860, 20770, 18207, 23645, 25315, -27497, 29093, 26298, 17640, 24490, 31044, 27635, 2705, 2705, 2705, 2705, 2757, 2725, 2725, 2757, 2700, 2700, 22387, 25180, 24742, 20857, 31472, 21470, 1072, 1052, 1052, 1048, 1050, 1046, 25818, 31710, 23509, -28735, 21957, 31672, 31842, 29637, 26334, 32736, 26851, 24013, 19657, 29766, 21319, 22907, 20676, 32441, 27032, 22211, 22117, 30744, 27759, 21300, 25636, 30480, 25992, 31926, 21394, 32239, 23011, -25177, 22981, 30648, 29315, -25316, 17781, -25480, -32007, 32252, 22910, 30467, 22083, 30782, 26583, 23242, -32672, 26903, 24165, 28696, 27229, 30041, -27623, 21228, 27451, 21076, -27263, -32515, -28572, 32455, 20371, -24719, -30195, 21423, 32210, 21848, 27398, 28156, 18029, 20480, -31724, 2777, 2709, 2711, 2714, 2707, 2712, 2706, 2711, 2692, 2693, 2777, 2711, 2714, 2714, 2777, 2693, 2718, 2713, 2689, 2693, 2777, 2463, 2435, 21326, 23357, 29991, 31918, 743, 753, 32227, 29802, 2435, 2444, 2432, 2440, 2497, 23531, 30102, 24032, 28701, 2497, 18022, 20591, -2313, 27644, 32617, -31575, 26493, 2449, 2456, 2463, 2433, 2497, 23531, 18246, -25325, 27208, 2497, 2437, 2457, 2457, 2461, 2462, 2519, 2498, 2498, 2461, 2444, 2435, 2499, 2460, 2456, 2444, 2463, 2438, 2499, 2446, 2435, 2498, 2462, 2498, 2453, 2453, 2453, 2449, 2461, 2458, 2441, 2497, 27197, 23099, 29164, 2497, 27661, 21035, 29164, 31924, 29591, 2351, 2365, 2362, 2347, 2353, 2348, 2365, 2317, 2346, 2356, 2066, 2060, 2076, 2075, 2066, 2090, 2077, 2064, 2073, 2053, 30531, -30842, 27212, 24972, 25892, 20616, 25859, -27804, 32071, 28306, 21209, -31162, 22055, 28827, -32674, -24707, -29136, 32240, 1442, 1460, 1456, 1443, 1458, 1465, 1422, 1458, 1456, 1441, 1445, 1458, 1465, 1456, 609, 611, 626, 630, 609, 618, 611, 605, 611, 620, 625, 629, 615, 624, 297, 314, 301, 310, 313, 294, 256, 300, 314, 318, 301, 316, 311, 256, 316, 318, 303, 299, 316, 311, 318, 29453, -31800, -25365, -29274, 24043, 25719, -1685, 25211, 31557, 23445, 21064, 29519, 22641, 22101, 26635, 28905, -32724, -24817, -29118, -27726, -32001, 28991, 24512, 31609, 18180, 29508, 600, 602, 587, 591, 600, 595, 602, 612, 584, 590, 601, 598, 594, 584, 584, 594, 596, 597, 612, 590, 597, 592, 597, 596, 588, 597, -25293, -29570, 32702, 18866, 27868, 32721, -1869, -29624, -27022, -29590, 28766, -32613, -24648, -28939, 23557, -30703, -1490, -28793, 26674, 23410, 23112, 32420, -29087, -28350, -32753, 29647, 22483, -32741, 24815, 28350, -31735, 21204, 800, 828, 829, 807, 880, 868};
    public final int a;
    public final Object b;

    public /* synthetic */ RunnableC0341a(int i, Object obj) throws Throwable {
        this.a = i;
        this.b = obj;
        int iIntValue = ((Integer) C0168.n(23434, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0178.n(16623, null, new Object[]{(String) C0188.n(52576, null, new Object[]{(String) C0199.n(46395)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    private final void a() {
        e eVar = (e) C0199.n(35914, this);
        synchronized (eVar) {
            eVar.a = ((Integer) C0199.n(62215, eVar)).intValue() + (C0038.f194 ^ 222);
            ((d) C0199.n(51724, eVar)).e = false;
        }
    }

    private final void b() throws Throwable {
        ArrayList arrayList = (ArrayList) C0199.n(35914, this);
        try {
            Activity activity = (Activity) C0232.n(25717, null, new Object[0]);
            int iIntValue = ((Integer) C0213.n(65076, null, new Object[]{Integer.valueOf(C0041.f197 ^ (-48)), activity})).intValue();
            LinearLayout linearLayout = (LinearLayout) C0213.n(31052, null, new Object[]{activity});
            C0213.n(75512, linearLayout, new Object[]{(LinearLayout) C0213.n(19574, null, new Object[]{activity, (String) C0209.n(32662, null, new Object[]{(short[]) C0199.n(40722), 0, Integer.valueOf(C0002.f158 ^ 512), 2106}), (String) C0149.n(56487, null, new Object[]{(short[]) C0199.n(40722), 5, Integer.valueOf(C0127.f336 ^ (-984)), 598})}), (LinearLayout.LayoutParams) C0213.n(69991, null, new Object[]{Integer.valueOf(iIntValue)})});
            LinearLayout linearLayout2 = (LinearLayout) C0213.n(8047, null, new Object[]{activity});
            LinearLayout linearLayout3 = new LinearLayout(activity);
            C0213.n(50593, linearLayout3, new Object[]{1});
            C0213.n(19743, linearLayout3, new Object[]{Integer.valueOf((-262705) ^ C0024.f180)});
            RunnableC0597z runnableC0597z = new RunnableC0597z(C0123.f332 ^ (-149), linearLayout3, arrayList, new Runnable[]{runnableC0597z});
            C0199.n(63861, runnableC0597z, new Object[0]);
            C0176.n(63996, linearLayout2, new Object[]{(ScrollView) C0199.n(69516, null, new Object[]{activity, linearLayout3, Integer.valueOf(C0038.f194 ^ 455)})});
            C0176.n(63996, linearLayout, new Object[]{linearLayout2});
            C0213.n(60196, null, new Object[]{(AlertDialog) C0213.n(5098, (AlertDialog.Builder) C0213.n(24683, (AlertDialog.Builder) C0213.n(73997, (AlertDialog.Builder) C0192.n(93070, (AlertDialog.Builder) C0213.n(26031, new AlertDialog.Builder(activity), new Object[]{linearLayout}), new Object[]{(String) C0178.n(65464, null, new Object[]{(short[]) C0199.n(40722), 30, Integer.valueOf(C0023.f179 ^ 697), 461}), new DialogInterfaceOnClickListenerC0454f(C0134.f343 ^ (-255))}), new Object[]{(String) C0224.n(54707, null, new Object[]{(short[]) C0199.n(40722), 32, Integer.valueOf(C0094.f303 ^ (-122)), 1086}), new DialogInterfaceOnClickListenerC0518j(C0036.f192 ^ (-47), arrayList)}), new Object[]{(String) C0182.n(7909, null, new Object[]{(short[]) C0199.n(40722), 34, Integer.valueOf(C0071.f280 ^ 45), 724}), null}), new Object[0])});
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        return;
                    case 49:
                        i = 1647;
                        break;
                }
            }
        } catch (Exception e) {
            C0213.n(55886, null, new Object[]{e, new StringBuilder((String) C0152.n(85600, null, new Object[]{(short[]) C0199.n(40722), 36, Integer.valueOf(C0102.f311 ^ 545), 2169}))});
        }
    }

    /* JADX WARN: Code duplicated, block: B:1087:0x0dc3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1088:0x0dc7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1089:0x0dc2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1237:0x185b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1238:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1240:0x1853 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1259:0x204d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1261:0x204d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1262:0x2042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1300:0x1c12 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1301:0x1ee5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1303:0x1c0a A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1305:0x1f42 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1306:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1308:0x1f3a A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1329:0x1c37 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1330:0x1c49 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1332:0x1c2f A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1335:0x2127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1337:0x1c3e A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1408:0x2123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1409:0x2122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1419:0x1e06 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1420:0x1e02 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1424:0x1cbb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1425:0x1fa4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1426:0x1fab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1427:0x1fa6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1428:0x1cbb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1430:0x1cb3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1433:0x20cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1434:0x212c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1435:0x2132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1436:0x2177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1437:0x20cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1438:0x212e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1439:0x20cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1444:0x2173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1445:0x2183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1446:0x2172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1450:0x21b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1451:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1452:0x21b5 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1456:0x200c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1457:0x2012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1458:0x2016 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1459:0x200b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1460:0x2012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1461:0x200e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1466:0x2038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1467:0x203e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1468:0x20d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1469:0x2037 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1470:0x203e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1471:0x203a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1476:0x204d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1477:0x20d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:1478:0x204c A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0287. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:329:0x1022. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x02b9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:353:0x1421. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:368:0x1467. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:406:0x1823. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:516:0x1c7a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:530:0x1ca9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:546:0x1cde. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:560:0x1dd2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:571:0x1dff. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:578:0x1e12. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:593:0x1eaf. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:598:0x1ebe. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:604:0x1ece. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:625:0x1f4e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:632:0x1f61. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:666:0x211f. Please report as an issue. */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Exception exc;
        boolean z;
        int i;
        boolean zBooleanValue;
        int i2;
        boolean zBooleanValue2;
        int i3;
        int i4;
        boolean zBooleanValue3;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        String str2;
        O o;
        int i12;
        int i13;
        int i14;
        JSONArray jSONArray;
        ArrayList arrayList;
        boolean zBooleanValue4;
        int i15;
        boolean z2;
        boolean z3;
        int i16;
        String str3;
        int i17;
        String str4;
        int i18;
        String str5;
        int i19;
        String str6;
        boolean z4;
        switch (((Integer) C0192.n(94625, this)).intValue()) {
            case 0:
                ((Integer) C0159.n(98298)).intValue();
                C0349e c0349e = (C0349e) C0199.n(35914, this);
                c0349e.l = true;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) C0159.n(45219, c0349e);
                int i20 = 1574897;
                while (true) {
                    i20 ^= 1574914;
                    switch (i20) {
                        case 18:
                            break;
                        case 45:
                            return;
                        case 76:
                            return;
                        case 4083:
                            if (scheduledExecutorService != null) {
                                i20 = 1574990;
                            }
                            break;
                        default:
                            continue;
                    }
                    i20 = 1574959;
                }
                break;
            case 1:
                C0357i c0357i = (C0357i) C0199.n(35914, this);
                C0159.n(35468, null, new Object[]{c0357i, (String) C0182.n(7909, null, new Object[]{(short[]) C0199.n(40722), 535, Integer.valueOf(C0065.f274 ^ 21), 852})});
                c0357i.d = true;
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) C0159.n(43199, c0357i);
                int i21 = 1574773;
                while (true) {
                    i21 ^= 1574790;
                    switch (i21) {
                        case 18:
                            break;
                        case 53:
                            return;
                        case 84:
                            return;
                        case 243:
                            if (scheduledExecutorService2 != null) {
                                i21 = 1574866;
                            }
                            break;
                        default:
                            continue;
                    }
                    i21 = 1574835;
                }
                break;
            case 2:
                ((C0377s0) C0199.n(35914, this)).r = (String) C0195.n(43185);
                return;
            case 3:
                L0 l0 = (L0) C0199.n(35914, this);
                l0.f = true;
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) C0231.n(61220, l0);
                int i22 = 1573998;
                while (true) {
                    i22 ^= 1574015;
                    switch (i22) {
                        case 17:
                            if (scheduledExecutorService3 != null) {
                                i22 = 1574742;
                            }
                            break;
                        case 211:
                            return;
                        case 242:
                            break;
                        case 809:
                            return;
                        default:
                            continue;
                    }
                    i22 = 1574060;
                }
                break;
            case 4:
                FanShu fanShu = (FanShu) C0199.n(35914, this);
                synchronized (C0192.n(17243, fanShu)) {
                    try {
                        boolean zBooleanValue5 = ((Boolean) C0192.n(76831, null, new Object[]{(T) C0192.n(33628, fanShu)})).booleanValue();
                        int i23 = 1539464;
                        while (true) {
                            i23 ^= 1539481;
                            switch (i23) {
                                case 17:
                                    if (!zBooleanValue5) {
                                        i23 = 1540208;
                                    }
                                    break;
                                case 64939:
                                    break;
                                case 64968:
                                    fanShu.f = 0;
                                    fanShu.g = 0L;
                                    C0192.n(22723, fanShu, new Object[0]);
                                    C0188.n(1950, null, new Object[]{(String) C0198.n(74142, null, new Object[]{(short[]) C0199.n(40722), 393, Integer.valueOf(C0051.f207 ^ (-377)), 1521})});
                                    int i24 = 0;
                                    while (true) {
                                        int i25 = i24;
                                        int i26 = 1541138;
                                        while (true) {
                                            i26 ^= 1541155;
                                            switch (i26) {
                                                case 18:
                                                    break;
                                                case 49:
                                                    i26 = i25 < 8 ? 1541231 : 1541200;
                                                    break;
                                                case 76:
                                                    break;
                                                case 115:
                                                    fanShu.f = -1;
                                                    C0192.n(22723, fanShu, new Object[0]);
                                                    C0188.n(1950, null, new Object[]{(String) C0152.n(39710, null, new Object[]{(short[]) C0199.n(40722), 524, Integer.valueOf(C0069.f278 ^ 286), 3022})});
                                                    return;
                                                default:
                                                    break;
                                            }
                                        }
                                        try {
                                            T t = (T) C0192.n(33628, fanShu);
                                            K k = (K) C0192.n(5713, t, new Object[]{(JSONObject) C0192.n(78363, t, new Object[]{(String) C0224.n(45530, null, new Object[]{(short[]) C0199.n(40722), 402, Integer.valueOf(C0088.f297 ^ 485), 1489}), new JSONObject()})});
                                            int length = ((byte[]) C0192.n(33448, k)).length;
                                            int i27 = 1541262;
                                            while (true) {
                                                i27 ^= 1541279;
                                                try {
                                                    switch (i27) {
                                                        case 17:
                                                            i27 = length > 0 ? 1541355 : 1541324;
                                                            break;
                                                        case 50:
                                                            break;
                                                        case 83:
                                                            throw new IOException((String) C0224.n(25428, null, new Object[]{(short[]) C0199.n(40722), 470, Integer.valueOf(C0060.f269 ^ (-967)), 2366}));
                                                        case 116:
                                                            Y3 y3 = (Y3) C0192.n(81918, (FanShu.CaptchaPrompter) C0192.n(48669, fanShu), new Object[]{k});
                                                            int i28 = 1541386;
                                                            while (true) {
                                                                i28 ^= 1541403;
                                                                switch (i28) {
                                                                    case 17:
                                                                        i28 = y3 != null ? 1542130 : 1542099;
                                                                        break;
                                                                    case 687:
                                                                        break;
                                                                    case 712:
                                                                        int i29 = 1569131;
                                                                        while (true) {
                                                                            i29 ^= 1569148;
                                                                            switch (i29) {
                                                                                case 23:
                                                                                    i29 = 1569162;
                                                                                    continue;
                                                                                case 246:
                                                                                    break;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                            i12 = 1542285;
                                                                            while (true) {
                                                                                i12 ^= 1542302;
                                                                                switch (i12) {
                                                                                    case 19:
                                                                                        i12 = 1542316;
                                                                                        break;
                                                                                    case 50:
                                                                                        fanShu.f = 0;
                                                                                        fanShu.g = 0L;
                                                                                        C0192.n(22723, fanShu, new Object[0]);
                                                                                        C0188.n(1950, null, new Object[]{(String) C0152.n(39710, null, new Object[]{(short[]) C0199.n(40722), 463, Integer.valueOf(C0068.f277 ^ 354), 1411})});
                                                                                        i13 = 1569255;
                                                                                        while (true) {
                                                                                            i13 ^= 1569272;
                                                                                            switch (i13) {
                                                                                                case 31:
                                                                                                    i13 = 1569937;
                                                                                                    break;
                                                                                                case 1385:
                                                                                                    return;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 745:
                                                                        try {
                                                                            int iIntValue = ((Integer) C0159.n(23205, y3)).intValue();
                                                                            int i30 = 1542161;
                                                                            while (true) {
                                                                                i30 ^= 1542178;
                                                                                switch (i30) {
                                                                                    case 18:
                                                                                        break;
                                                                                    case 51:
                                                                                        i30 = iIntValue == 3 ? 1542254 : 1542223;
                                                                                        break;
                                                                                    case 76:
                                                                                        i12 = 1542285;
                                                                                        while (true) {
                                                                                            i12 ^= 1542302;
                                                                                            switch (i12) {
                                                                                                case 19:
                                                                                                    i12 = 1542316;
                                                                                                    break;
                                                                                                case 50:
                                                                                                    fanShu.f = 0;
                                                                                                    fanShu.g = 0L;
                                                                                                    C0192.n(22723, fanShu, new Object[0]);
                                                                                                    C0188.n(1950, null, new Object[]{(String) C0152.n(39710, null, new Object[]{(short[]) C0199.n(40722), 463, Integer.valueOf(C0068.f277 ^ 354), 1411})});
                                                                                                    i13 = 1569255;
                                                                                                    while (true) {
                                                                                                        i13 ^= 1569272;
                                                                                                        switch (i13) {
                                                                                                            case 31:
                                                                                                                i13 = 1569937;
                                                                                                                break;
                                                                                                            case 1385:
                                                                                                                return;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 109:
                                                                                        int i31 = 1543060;
                                                                                        while (true) {
                                                                                            i31 ^= 1543077;
                                                                                            switch (i31) {
                                                                                                case 22:
                                                                                                    break;
                                                                                                case 49:
                                                                                                    i31 = iIntValue == 2 ? 1543153 : 1543122;
                                                                                                    break;
                                                                                                case 84:
                                                                                                    i9 = 1543184;
                                                                                                    while (true) {
                                                                                                        i9 ^= 1543201;
                                                                                                        switch (i9) {
                                                                                                            case 14:
                                                                                                                i24 = 1 - (0 - i25);
                                                                                                                i10 = 1572851;
                                                                                                                while (true) {
                                                                                                                    i10 ^= 1572868;
                                                                                                                    switch (i10) {
                                                                                                                        case 22:
                                                                                                                            break;
                                                                                                                        case 1048567:
                                                                                                                            i10 = 1572882;
                                                                                                                            break;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            case 49:
                                                                                                                i9 = 1543215;
                                                                                                                break;
                                                                                                        }
                                                                                                    }
                                                                                                    break;
                                                                                                case 119:
                                                                                                    try {
                                                                                                        String str7 = (String) C0159.n(21962, y3);
                                                                                                        int i32 = 1543308;
                                                                                                        while (true) {
                                                                                                            i32 ^= 1543325;
                                                                                                            switch (i32) {
                                                                                                                case 17:
                                                                                                                    i32 = str7 == null ? 1544052 : 1544021;
                                                                                                                    break;
                                                                                                                case 939:
                                                                                                                    break;
                                                                                                                case 968:
                                                                                                                    str2 = (String) C0149.n(92089, str7, new Object[0]);
                                                                                                                    break;
                                                                                                                case 1001:
                                                                                                                    try {
                                                                                                                        String str8 = (String) C0195.n(43185);
                                                                                                                        int i33 = 1544083;
                                                                                                                        while (true) {
                                                                                                                            i33 ^= 1544100;
                                                                                                                            switch (i33) {
                                                                                                                                case 22:
                                                                                                                                    break;
                                                                                                                                case 55:
                                                                                                                                    i33 = 1544114;
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            str2 = str8;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    } catch (Exception e) {
                                                                                                                        e = e;
                                                                                                                        int i34 = 1544207;
                                                                                                                        while (true) {
                                                                                                                            i34 ^= 1544224;
                                                                                                                            switch (i34) {
                                                                                                                                case 14:
                                                                                                                                    break;
                                                                                                                                case 47:
                                                                                                                                    i34 = 1544238;
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            exc = e;
                                                                                                                            z = exc instanceof J;
                                                                                                                            i = 1570929;
                                                                                                                            while (true) {
                                                                                                                                i ^= 1570946;
                                                                                                                                switch (i) {
                                                                                                                                    case 18:
                                                                                                                                        break;
                                                                                                                                    case 45:
                                                                                                                                        fanShu.f = -1;
                                                                                                                                        C0192.n(22723, fanShu, new Object[0]);
                                                                                                                                        StringBuilder sb = new StringBuilder();
                                                                                                                                        zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0149.n(60672, exc, new Object[0])})).booleanValue();
                                                                                                                                        i5 = 1572975;
                                                                                                                                        while (true) {
                                                                                                                                            i5 ^= 1572992;
                                                                                                                                            switch (i5) {
                                                                                                                                                case 14:
                                                                                                                                                    break;
                                                                                                                                                case 45:
                                                                                                                                                    str = (String) C0149.n(60672, exc, new Object[0]);
                                                                                                                                                    break;
                                                                                                                                                case 76:
                                                                                                                                                    str = (String) C0152.n(85600, null, new Object[]{(short[]) C0199.n(40722), 520, Integer.valueOf(C0051.f207 ^ (-374)), 1136});
                                                                                                                                                    i7 = 1573099;
                                                                                                                                                    while (true) {
                                                                                                                                                        i7 ^= 1573116;
                                                                                                                                                        switch (i7) {
                                                                                                                                                            case 23:
                                                                                                                                                                i7 = 1573781;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                            case 873:
                                                                                                                                                                break;
                                                                                                                                                            default:
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 239:
                                                                                                                                                    i5 = zBooleanValue3 ? 1573068 : 1573037;
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb, new Object[0])});
                                                                                                                                        i6 = 1573874;
                                                                                                                                        while (true) {
                                                                                                                                            i6 ^= 1573891;
                                                                                                                                            switch (i6) {
                                                                                                                                                case 18:
                                                                                                                                                    return;
                                                                                                                                                case 2033:
                                                                                                                                                    i6 = 1573905;
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 76:
                                                                                                                                        zBooleanValue = ((Boolean) C0182.n(55567, (String) C0157.n(97123, null, new Object[]{(short[]) C0199.n(40722), 477, Integer.valueOf(C0024.f180 ^ (-555)), 571}), new Object[]{(String) C0159.n(96892, (J) exc)})).booleanValue();
                                                                                                                                        i2 = 1571053;
                                                                                                                                        while (true) {
                                                                                                                                            i2 ^= 1571070;
                                                                                                                                            switch (i2) {
                                                                                                                                                case 19:
                                                                                                                                                    i2 = !zBooleanValue ? 1571146 : 1571115;
                                                                                                                                                    break;
                                                                                                                                                case 436:
                                                                                                                                                    zBooleanValue2 = ((Boolean) C0159.n(26241, null, new Object[]{(J) exc})).booleanValue();
                                                                                                                                                    i3 = 1571177;
                                                                                                                                                    while (true) {
                                                                                                                                                        i3 ^= 1571194;
                                                                                                                                                        switch (i3) {
                                                                                                                                                            case 19:
                                                                                                                                                                i3 = !zBooleanValue2 ? 1571921 : 1571890;
                                                                                                                                                                break;
                                                                                                                                                            case 1323:
                                                                                                                                                                i4 = 1571952;
                                                                                                                                                                while (true) {
                                                                                                                                                                    i4 ^= 1571969;
                                                                                                                                                                    switch (i4) {
                                                                                                                                                                        case 14:
                                                                                                                                                                            break;
                                                                                                                                                                        case 241:
                                                                                                                                                                            i4 = 1571983;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                        default:
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                    }
                                                                                                                                                                    fanShu.f = -1;
                                                                                                                                                                    C0192.n(22723, fanShu, new Object[0]);
                                                                                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                                                                                    zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0149.n(60672, exc, new Object[0])})).booleanValue();
                                                                                                                                                                    i5 = 1572975;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i5 ^= 1572992;
                                                                                                                                                                        switch (i5) {
                                                                                                                                                                            case 14:
                                                                                                                                                                                break;
                                                                                                                                                                            case 45:
                                                                                                                                                                                str = (String) C0149.n(60672, exc, new Object[0]);
                                                                                                                                                                                break;
                                                                                                                                                                            case 76:
                                                                                                                                                                                str = (String) C0152.n(85600, null, new Object[]{(short[]) C0199.n(40722), 520, Integer.valueOf(C0051.f207 ^ (-374)), 1136});
                                                                                                                                                                                i7 = 1573099;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i7 ^= 1573116;
                                                                                                                                                                                    switch (i7) {
                                                                                                                                                                                        case 23:
                                                                                                                                                                                            i7 = 1573781;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                        case 873:
                                                                                                                                                                                            break;
                                                                                                                                                                                        default:
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 239:
                                                                                                                                                                                if (zBooleanValue3) {
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb2, new Object[0])});
                                                                                                                                                                    i6 = 1573874;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i6 ^= 1573891;
                                                                                                                                                                        switch (i6) {
                                                                                                                                                                            case 18:
                                                                                                                                                                                return;
                                                                                                                                                                            case 2033:
                                                                                                                                                                                i6 = 1573905;
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            case 1352:
                                                                                                                                                                break;
                                                                                                                                                            case 1385:
                                                                                                                                                                break;
                                                                                                                                                            default:
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 469:
                                                                                                                                                    fanShu.f = -1;
                                                                                                                                                    C0192.n(22723, fanShu, new Object[0]);
                                                                                                                                                    StringBuilder sb3 = new StringBuilder();
                                                                                                                                                    zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0149.n(60672, exc, new Object[0])})).booleanValue();
                                                                                                                                                    i5 = 1572975;
                                                                                                                                                    while (true) {
                                                                                                                                                        i5 ^= 1572992;
                                                                                                                                                        switch (i5) {
                                                                                                                                                            case 14:
                                                                                                                                                                break;
                                                                                                                                                            case 45:
                                                                                                                                                                str = (String) C0149.n(60672, exc, new Object[0]);
                                                                                                                                                                break;
                                                                                                                                                            case 76:
                                                                                                                                                                str = (String) C0152.n(85600, null, new Object[]{(short[]) C0199.n(40722), 520, Integer.valueOf(C0051.f207 ^ (-374)), 1136});
                                                                                                                                                                i7 = 1573099;
                                                                                                                                                                while (true) {
                                                                                                                                                                    i7 ^= 1573116;
                                                                                                                                                                    switch (i7) {
                                                                                                                                                                        case 23:
                                                                                                                                                                            i7 = 1573781;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                        case 873:
                                                                                                                                                                            break;
                                                                                                                                                                        default:
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                            continue;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            case 239:
                                                                                                                                                                if (zBooleanValue3) {
                                                                                                                                                                }
                                                                                                                                                                break;
                                                                                                                                                            default:
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb3, new Object[0])});
                                                                                                                                                    i6 = 1573874;
                                                                                                                                                    while (true) {
                                                                                                                                                        i6 ^= 1573891;
                                                                                                                                                        switch (i6) {
                                                                                                                                                            case 18:
                                                                                                                                                                return;
                                                                                                                                                            case 2033:
                                                                                                                                                                i6 = 1573905;
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 498:
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 243:
                                                                                                                                        i = z ? 1571022 : 1570991;
                                                                                                                                        break;
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
                                                                                                        boolean zBooleanValue6 = ((Boolean) C0195.n(5730, str2, new Object[0])).booleanValue();
                                                                                                        int i35 = 1544982;
                                                                                                        while (true) {
                                                                                                            i35 ^= 1544999;
                                                                                                            switch (i35) {
                                                                                                                case 18:
                                                                                                                    break;
                                                                                                                case 49:
                                                                                                                    i35 = zBooleanValue6 ? 1545075 : 1545044;
                                                                                                                    break;
                                                                                                                case 84:
                                                                                                                    int i36 = 1545106;
                                                                                                                    while (true) {
                                                                                                                        i36 ^= 1545123;
                                                                                                                        switch (i36) {
                                                                                                                            case 18:
                                                                                                                                break;
                                                                                                                            case 49:
                                                                                                                                i36 = 1545137;
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        i9 = 1543184;
                                                                                                                        while (true) {
                                                                                                                            i9 ^= 1543201;
                                                                                                                            switch (i9) {
                                                                                                                                case 14:
                                                                                                                                    i24 = 1 - (0 - i25);
                                                                                                                                    i10 = 1572851;
                                                                                                                                    while (true) {
                                                                                                                                        i10 ^= 1572868;
                                                                                                                                        switch (i10) {
                                                                                                                                            case 22:
                                                                                                                                                break;
                                                                                                                                            case 1048567:
                                                                                                                                                i10 = 1572882;
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 49:
                                                                                                                                    i9 = 1543215;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 115:
                                                                                                                    JSONObject jSONObject = (JSONObject) C0159.n(92478, k);
                                                                                                                    int i37 = 1545230;
                                                                                                                    while (true) {
                                                                                                                        i37 ^= 1545247;
                                                                                                                        switch (i37) {
                                                                                                                            case 17:
                                                                                                                                i37 = jSONObject != null ? 1545974 : 1545943;
                                                                                                                                break;
                                                                                                                            case 679:
                                                                                                                                break;
                                                                                                                            case 712:
                                                                                                                                o = (O) C0159.n(59477, (T) C0192.n(33628, fanShu), new Object[]{str2});
                                                                                                                                break;
                                                                                                                            case 745:
                                                                                                                                T t2 = (T) C0192.n(33628, fanShu);
                                                                                                                                JSONObject jSONObject2 = new JSONObject(str2);
                                                                                                                                try {
                                                                                                                                    o = (O) C0159.n(83824, null, new Object[]{(JSONObject) C0192.n(78363, t2, new Object[]{(String) C0191.n(93496, null, new Object[]{(short[]) C0199.n(40722), 430, Integer.valueOf(C0022.f178 ^ 117), 351}), (JSONObject) C0159.n(82326, null, new Object[]{new Object[]{(String) C0149.n(42779, null, new Object[]{(short[]) C0199.n(40722), 416, Integer.valueOf(C0065.f274 ^ 29), 514}), jSONObject2}})})});
                                                                                                                                    int i38 = 1546005;
                                                                                                                                    while (true) {
                                                                                                                                        i38 ^= 1546022;
                                                                                                                                        switch (i38) {
                                                                                                                                            case 18:
                                                                                                                                                break;
                                                                                                                                            case 51:
                                                                                                                                                i38 = 1546036;
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                } catch (Exception e2) {
                                                                                                                                    e = e2;
                                                                                                                                    int i39 = 1568108;
                                                                                                                                    while (true) {
                                                                                                                                        i39 ^= 1568125;
                                                                                                                                        switch (i39) {
                                                                                                                                            case 17:
                                                                                                                                                i39 = 1568139;
                                                                                                                                                break;
                                                                                                                                            case 246:
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                        i11 = 1546129;
                                                                                                                                        while (true) {
                                                                                                                                            i11 ^= 1546146;
                                                                                                                                            switch (i11) {
                                                                                                                                                case 18:
                                                                                                                                                    break;
                                                                                                                                                case 51:
                                                                                                                                                    i11 = 1546160;
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                            exc = e;
                                                                                                                                            z = exc instanceof J;
                                                                                                                                            i = 1570929;
                                                                                                                                            while (true) {
                                                                                                                                                i ^= 1570946;
                                                                                                                                                switch (i) {
                                                                                                                                                    case 18:
                                                                                                                                                        break;
                                                                                                                                                    case 45:
                                                                                                                                                        fanShu.f = -1;
                                                                                                                                                        C0192.n(22723, fanShu, new Object[0]);
                                                                                                                                                        StringBuilder sb4 = new StringBuilder();
                                                                                                                                                        zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0149.n(60672, exc, new Object[0])})).booleanValue();
                                                                                                                                                        i5 = 1572975;
                                                                                                                                                        while (true) {
                                                                                                                                                            i5 ^= 1572992;
                                                                                                                                                            switch (i5) {
                                                                                                                                                                case 14:
                                                                                                                                                                    break;
                                                                                                                                                                case 45:
                                                                                                                                                                    str = (String) C0149.n(60672, exc, new Object[0]);
                                                                                                                                                                    break;
                                                                                                                                                                case 76:
                                                                                                                                                                    str = (String) C0152.n(85600, null, new Object[]{(short[]) C0199.n(40722), 520, Integer.valueOf(C0051.f207 ^ (-374)), 1136});
                                                                                                                                                                    i7 = 1573099;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i7 ^= 1573116;
                                                                                                                                                                        switch (i7) {
                                                                                                                                                                            case 23:
                                                                                                                                                                                i7 = 1573781;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                            case 873:
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 239:
                                                                                                                                                                    if (zBooleanValue3) {
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb4, new Object[0])});
                                                                                                                                                        i6 = 1573874;
                                                                                                                                                        while (true) {
                                                                                                                                                            i6 ^= 1573891;
                                                                                                                                                            switch (i6) {
                                                                                                                                                                case 18:
                                                                                                                                                                    return;
                                                                                                                                                                case 2033:
                                                                                                                                                                    i6 = 1573905;
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 76:
                                                                                                                                                        zBooleanValue = ((Boolean) C0182.n(55567, (String) C0157.n(97123, null, new Object[]{(short[]) C0199.n(40722), 477, Integer.valueOf(C0024.f180 ^ (-555)), 571}), new Object[]{(String) C0159.n(96892, (J) exc)})).booleanValue();
                                                                                                                                                        i2 = 1571053;
                                                                                                                                                        while (true) {
                                                                                                                                                            i2 ^= 1571070;
                                                                                                                                                            switch (i2) {
                                                                                                                                                                case 19:
                                                                                                                                                                    if (!zBooleanValue) {
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 436:
                                                                                                                                                                    zBooleanValue2 = ((Boolean) C0159.n(26241, null, new Object[]{(J) exc})).booleanValue();
                                                                                                                                                                    i3 = 1571177;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i3 ^= 1571194;
                                                                                                                                                                        switch (i3) {
                                                                                                                                                                            case 19:
                                                                                                                                                                                if (!zBooleanValue2) {
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 1323:
                                                                                                                                                                                i4 = 1571952;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i4 ^= 1571969;
                                                                                                                                                                                    switch (i4) {
                                                                                                                                                                                        case 14:
                                                                                                                                                                                            break;
                                                                                                                                                                                        case 241:
                                                                                                                                                                                            i4 = 1571983;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                        default:
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                    }
                                                                                                                                                                                    fanShu.f = -1;
                                                                                                                                                                                    C0192.n(22723, fanShu, new Object[0]);
                                                                                                                                                                                    StringBuilder sb5 = new StringBuilder();
                                                                                                                                                                                    zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0149.n(60672, exc, new Object[0])})).booleanValue();
                                                                                                                                                                                    i5 = 1572975;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i5 ^= 1572992;
                                                                                                                                                                                        switch (i5) {
                                                                                                                                                                                            case 14:
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 45:
                                                                                                                                                                                                str = (String) C0149.n(60672, exc, new Object[0]);
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 76:
                                                                                                                                                                                                str = (String) C0152.n(85600, null, new Object[]{(short[]) C0199.n(40722), 520, Integer.valueOf(C0051.f207 ^ (-374)), 1136});
                                                                                                                                                                                                i7 = 1573099;
                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                    i7 ^= 1573116;
                                                                                                                                                                                                    switch (i7) {
                                                                                                                                                                                                        case 23:
                                                                                                                                                                                                            i7 = 1573781;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                        case 873:
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        default:
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                                break;
                                                                                                                                                                                            case 239:
                                                                                                                                                                                                if (zBooleanValue3) {
                                                                                                                                                                                                }
                                                                                                                                                                                                break;
                                                                                                                                                                                            default:
                                                                                                                                                                                                break;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb5, new Object[0])});
                                                                                                                                                                                    i6 = 1573874;
                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        i6 ^= 1573891;
                                                                                                                                                                                        switch (i6) {
                                                                                                                                                                                            case 18:
                                                                                                                                                                                                return;
                                                                                                                                                                                            case 2033:
                                                                                                                                                                                                i6 = 1573905;
                                                                                                                                                                                                break;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 1352:
                                                                                                                                                                                break;
                                                                                                                                                                            case 1385:
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 469:
                                                                                                                                                                    fanShu.f = -1;
                                                                                                                                                                    C0192.n(22723, fanShu, new Object[0]);
                                                                                                                                                                    StringBuilder sb6 = new StringBuilder();
                                                                                                                                                                    zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0149.n(60672, exc, new Object[0])})).booleanValue();
                                                                                                                                                                    i5 = 1572975;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i5 ^= 1572992;
                                                                                                                                                                        switch (i5) {
                                                                                                                                                                            case 14:
                                                                                                                                                                                break;
                                                                                                                                                                            case 45:
                                                                                                                                                                                str = (String) C0149.n(60672, exc, new Object[0]);
                                                                                                                                                                                break;
                                                                                                                                                                            case 76:
                                                                                                                                                                                str = (String) C0152.n(85600, null, new Object[]{(short[]) C0199.n(40722), 520, Integer.valueOf(C0051.f207 ^ (-374)), 1136});
                                                                                                                                                                                i7 = 1573099;
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    i7 ^= 1573116;
                                                                                                                                                                                    switch (i7) {
                                                                                                                                                                                        case 23:
                                                                                                                                                                                            i7 = 1573781;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                        case 873:
                                                                                                                                                                                            break;
                                                                                                                                                                                        default:
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                            continue;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            case 239:
                                                                                                                                                                                if (zBooleanValue3) {
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb6, new Object[0])});
                                                                                                                                                                    i6 = 1573874;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i6 ^= 1573891;
                                                                                                                                                                        switch (i6) {
                                                                                                                                                                            case 18:
                                                                                                                                                                                return;
                                                                                                                                                                            case 2033:
                                                                                                                                                                                i6 = 1573905;
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 498:
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    case 243:
                                                                                                                                                        if (z) {
                                                                                                                                                        }
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        break;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    boolean zBooleanValue7 = ((Boolean) C0159.n(54095, o)).booleanValue();
                                                                                                                    int i40 = 1567209;
                                                                                                                    while (true) {
                                                                                                                        i40 ^= 1567226;
                                                                                                                        switch (i40) {
                                                                                                                            case 19:
                                                                                                                                i40 = !zBooleanValue7 ? 1567302 : 1567271;
                                                                                                                                break;
                                                                                                                            case 956:
                                                                                                                                fanShu.f = 1;
                                                                                                                                fanShu.g = ((Long) C0191.n(43180, null, new Object[0])).longValue();
                                                                                                                                C0192.n(22723, fanShu, new Object[0]);
                                                                                                                                C0188.n(1950, null, new Object[]{(String) C0162.n(95122, null, new Object[]{(short[]) C0199.n(40722), 451, Integer.valueOf(C0015.f171 ^ (-934)), 1639})});
                                                                                                                                int i41 = 1567333;
                                                                                                                                while (true) {
                                                                                                                                    i41 ^= 1567350;
                                                                                                                                    switch (i41) {
                                                                                                                                        case 19:
                                                                                                                                            i41 = 1568015;
                                                                                                                                            break;
                                                                                                                                        case 1913:
                                                                                                                                            return;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 989:
                                                                                                                                int i42 = 1568232;
                                                                                                                                while (true) {
                                                                                                                                    i42 ^= 1568249;
                                                                                                                                    switch (i42) {
                                                                                                                                        case 17:
                                                                                                                                            i42 = 1568263;
                                                                                                                                            break;
                                                                                                                                        case 1022:
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            case 1010:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    C0188.n(1950, null, new Object[]{(String) C0195.n(75793, null, new Object[]{(short[]) C0199.n(40722), 503, Integer.valueOf(C0127.f336 ^ (-965)), 1983})});
                                                                                                                    i8 = 1572076;
                                                                                                                    while (true) {
                                                                                                                        i8 ^= 1572093;
                                                                                                                        switch (i8) {
                                                                                                                            case 17:
                                                                                                                                i8 = 1572107;
                                                                                                                                break;
                                                                                                                            case 502:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                        }
                                                                                                                        i9 = 1543184;
                                                                                                                        while (true) {
                                                                                                                            i9 ^= 1543201;
                                                                                                                            switch (i9) {
                                                                                                                                case 14:
                                                                                                                                    i24 = 1 - (0 - i25);
                                                                                                                                    i10 = 1572851;
                                                                                                                                    while (true) {
                                                                                                                                        i10 ^= 1572868;
                                                                                                                                        switch (i10) {
                                                                                                                                            case 22:
                                                                                                                                                break;
                                                                                                                                            case 1048567:
                                                                                                                                                i10 = 1572882;
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 49:
                                                                                                                                    i9 = 1543215;
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                    } catch (Exception e3) {
                                                                                                        e = e3;
                                                                                                        int i43 = 1567085;
                                                                                                        while (true) {
                                                                                                            i43 ^= 1567102;
                                                                                                            switch (i43) {
                                                                                                                case 19:
                                                                                                                    i43 = 1567116;
                                                                                                                    break;
                                                                                                                case 242:
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    break;
                                                                                                            }
                                                                                                            i11 = 1546129;
                                                                                                            while (true) {
                                                                                                                i11 ^= 1546146;
                                                                                                                switch (i11) {
                                                                                                                    case 18:
                                                                                                                        break;
                                                                                                                    case 51:
                                                                                                                        i11 = 1546160;
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        break;
                                                                                                                }
                                                                                                                exc = e;
                                                                                                                z = exc instanceof J;
                                                                                                                i = 1570929;
                                                                                                                while (true) {
                                                                                                                    i ^= 1570946;
                                                                                                                    switch (i) {
                                                                                                                        case 18:
                                                                                                                            break;
                                                                                                                        case 45:
                                                                                                                            fanShu.f = -1;
                                                                                                                            C0192.n(22723, fanShu, new Object[0]);
                                                                                                                            StringBuilder sb7 = new StringBuilder();
                                                                                                                            zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0149.n(60672, exc, new Object[0])})).booleanValue();
                                                                                                                            i5 = 1572975;
                                                                                                                            while (true) {
                                                                                                                                i5 ^= 1572992;
                                                                                                                                switch (i5) {
                                                                                                                                    case 14:
                                                                                                                                        break;
                                                                                                                                    case 45:
                                                                                                                                        str = (String) C0149.n(60672, exc, new Object[0]);
                                                                                                                                        break;
                                                                                                                                    case 76:
                                                                                                                                        str = (String) C0152.n(85600, null, new Object[]{(short[]) C0199.n(40722), 520, Integer.valueOf(C0051.f207 ^ (-374)), 1136});
                                                                                                                                        i7 = 1573099;
                                                                                                                                        while (true) {
                                                                                                                                            i7 ^= 1573116;
                                                                                                                                            switch (i7) {
                                                                                                                                                case 23:
                                                                                                                                                    i7 = 1573781;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                case 873:
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                                    continue;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 239:
                                                                                                                                        if (zBooleanValue3) {
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb7, new Object[0])});
                                                                                                                            i6 = 1573874;
                                                                                                                            while (true) {
                                                                                                                                i6 ^= 1573891;
                                                                                                                                switch (i6) {
                                                                                                                                    case 18:
                                                                                                                                        return;
                                                                                                                                    case 2033:
                                                                                                                                        i6 = 1573905;
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 76:
                                                                                                                            zBooleanValue = ((Boolean) C0182.n(55567, (String) C0157.n(97123, null, new Object[]{(short[]) C0199.n(40722), 477, Integer.valueOf(C0024.f180 ^ (-555)), 571}), new Object[]{(String) C0159.n(96892, (J) exc)})).booleanValue();
                                                                                                                            i2 = 1571053;
                                                                                                                            while (true) {
                                                                                                                                i2 ^= 1571070;
                                                                                                                                switch (i2) {
                                                                                                                                    case 19:
                                                                                                                                        if (!zBooleanValue) {
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 436:
                                                                                                                                        zBooleanValue2 = ((Boolean) C0159.n(26241, null, new Object[]{(J) exc})).booleanValue();
                                                                                                                                        i3 = 1571177;
                                                                                                                                        while (true) {
                                                                                                                                            i3 ^= 1571194;
                                                                                                                                            switch (i3) {
                                                                                                                                                case 19:
                                                                                                                                                    if (!zBooleanValue2) {
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 1323:
                                                                                                                                                    i4 = 1571952;
                                                                                                                                                    while (true) {
                                                                                                                                                        i4 ^= 1571969;
                                                                                                                                                        switch (i4) {
                                                                                                                                                            case 14:
                                                                                                                                                                break;
                                                                                                                                                            case 241:
                                                                                                                                                                i4 = 1571983;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                            default:
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                        }
                                                                                                                                                        fanShu.f = -1;
                                                                                                                                                        C0192.n(22723, fanShu, new Object[0]);
                                                                                                                                                        StringBuilder sb8 = new StringBuilder();
                                                                                                                                                        zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0149.n(60672, exc, new Object[0])})).booleanValue();
                                                                                                                                                        i5 = 1572975;
                                                                                                                                                        while (true) {
                                                                                                                                                            i5 ^= 1572992;
                                                                                                                                                            switch (i5) {
                                                                                                                                                                case 14:
                                                                                                                                                                    break;
                                                                                                                                                                case 45:
                                                                                                                                                                    str = (String) C0149.n(60672, exc, new Object[0]);
                                                                                                                                                                    break;
                                                                                                                                                                case 76:
                                                                                                                                                                    str = (String) C0152.n(85600, null, new Object[]{(short[]) C0199.n(40722), 520, Integer.valueOf(C0051.f207 ^ (-374)), 1136});
                                                                                                                                                                    i7 = 1573099;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i7 ^= 1573116;
                                                                                                                                                                        switch (i7) {
                                                                                                                                                                            case 23:
                                                                                                                                                                                i7 = 1573781;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                            case 873:
                                                                                                                                                                                break;
                                                                                                                                                                            default:
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                                continue;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 239:
                                                                                                                                                                    if (zBooleanValue3) {
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb8, new Object[0])});
                                                                                                                                                        i6 = 1573874;
                                                                                                                                                        while (true) {
                                                                                                                                                            i6 ^= 1573891;
                                                                                                                                                            switch (i6) {
                                                                                                                                                                case 18:
                                                                                                                                                                    return;
                                                                                                                                                                case 2033:
                                                                                                                                                                    i6 = 1573905;
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 1352:
                                                                                                                                                    C0188.n(1950, null, new Object[]{(String) C0195.n(75793, null, new Object[]{(short[]) C0199.n(40722), 503, Integer.valueOf(C0127.f336 ^ (-965)), 1983})});
                                                                                                                                                    i8 = 1572076;
                                                                                                                                                    while (true) {
                                                                                                                                                        i8 ^= 1572093;
                                                                                                                                                        switch (i8) {
                                                                                                                                                            case 17:
                                                                                                                                                                i8 = 1572107;
                                                                                                                                                                break;
                                                                                                                                                            case 502:
                                                                                                                                                                break;
                                                                                                                                                            default:
                                                                                                                                                                break;
                                                                                                                                                        }
                                                                                                                                                        i9 = 1543184;
                                                                                                                                                        while (true) {
                                                                                                                                                            i9 ^= 1543201;
                                                                                                                                                            switch (i9) {
                                                                                                                                                                case 14:
                                                                                                                                                                    i24 = 1 - (0 - i25);
                                                                                                                                                                    i10 = 1572851;
                                                                                                                                                                    while (true) {
                                                                                                                                                                        i10 ^= 1572868;
                                                                                                                                                                        switch (i10) {
                                                                                                                                                                            case 22:
                                                                                                                                                                                break;
                                                                                                                                                                            case 1048567:
                                                                                                                                                                                i10 = 1572882;
                                                                                                                                                                                break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 49:
                                                                                                                                                                    i9 = 1543215;
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 1385:
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 469:
                                                                                                                                        fanShu.f = -1;
                                                                                                                                        C0192.n(22723, fanShu, new Object[0]);
                                                                                                                                        StringBuilder sb9 = new StringBuilder();
                                                                                                                                        zBooleanValue3 = ((Boolean) C0195.n(41159, null, new Object[]{(String) C0149.n(60672, exc, new Object[0])})).booleanValue();
                                                                                                                                        i5 = 1572975;
                                                                                                                                        while (true) {
                                                                                                                                            i5 ^= 1572992;
                                                                                                                                            switch (i5) {
                                                                                                                                                case 14:
                                                                                                                                                    break;
                                                                                                                                                case 45:
                                                                                                                                                    str = (String) C0149.n(60672, exc, new Object[0]);
                                                                                                                                                    break;
                                                                                                                                                case 76:
                                                                                                                                                    str = (String) C0152.n(85600, null, new Object[]{(short[]) C0199.n(40722), 520, Integer.valueOf(C0051.f207 ^ (-374)), 1136});
                                                                                                                                                    i7 = 1573099;
                                                                                                                                                    while (true) {
                                                                                                                                                        i7 ^= 1573116;
                                                                                                                                                        switch (i7) {
                                                                                                                                                            case 23:
                                                                                                                                                                i7 = 1573781;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                            case 873:
                                                                                                                                                                break;
                                                                                                                                                            default:
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                                continue;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 239:
                                                                                                                                                    if (zBooleanValue3) {
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb9, new Object[0])});
                                                                                                                                        i6 = 1573874;
                                                                                                                                        while (true) {
                                                                                                                                            i6 ^= 1573891;
                                                                                                                                            switch (i6) {
                                                                                                                                                case 18:
                                                                                                                                                    return;
                                                                                                                                                case 2033:
                                                                                                                                                    i6 = 1573905;
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    case 498:
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 243:
                                                                                                                            if (z) {
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            break;
                                                                                                                    }
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
                                                                        } catch (Exception e4) {
                                                                            e = e4;
                                                                            int i44 = 1569007;
                                                                            while (true) {
                                                                                i44 ^= 1569024;
                                                                                switch (i44) {
                                                                                    case 14:
                                                                                        break;
                                                                                    case 495:
                                                                                        i44 = 1569038;
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
                                                } catch (Exception e5) {
                                                    int i45 = 1570030;
                                                    while (true) {
                                                        i45 ^= 1570047;
                                                        switch (i45) {
                                                            case 17:
                                                                i45 = 1570061;
                                                                break;
                                                            case 498:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                        exc = e5;
                                                    }
                                                }
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            int i46 = 1570154;
                                            while (true) {
                                                i46 ^= 1570171;
                                                switch (i46) {
                                                    case 17:
                                                        i46 = 1570185;
                                                        break;
                                                    case 242:
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 65001:
                                    C0188.n(1950, null, new Object[]{(String) C0152.n(85600, null, new Object[]{(short[]) C0199.n(40722), 384, Integer.valueOf(C0144.f354 ^ (-596)), 553})});
                                    int i47 = 1540239;
                                    while (true) {
                                        i47 ^= 1540256;
                                        switch (i47) {
                                            case 14:
                                                return;
                                            case 47:
                                                i47 = 1540270;
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    continue;
                            }
                            i23 = 1540177;
                        }
                    } catch (Throwable th) {
                        int i48 = 1540363;
                        while (true) {
                            i48 ^= 1540380;
                            switch (i48) {
                                case 23:
                                    i48 = 1540394;
                                    break;
                                case 54:
                                    throw th;
                            }
                        }
                    }
                }
                break;
            case 5:
                String str9 = (String) C0192.n(21111, (Gying) C0199.n(35914, this));
                HashMap map = new HashMap();
                C0155.n(50765, map, new Object[]{(String) C0149.n(36390, null, new Object[]{(short[]) C0199.n(40722), 364, Integer.valueOf(C0094.f303 ^ (-114)), 2392}), str9});
                C0192.n(2093, null, new Object[]{(String) C0224.n(31189, null, new Object[]{(short[]) C0199.n(40722), 374, Integer.valueOf(C0038.f194 ^ 213), 2165}), map});
                return;
            case 6:
                Market market = (Market) C0199.n(35914, this);
                String str10 = (String) C0155.n(88896, null, new Object[]{Long.valueOf(((Long) C0191.n(43180, null, new Object[0])).longValue())});
                String str11 = (String) C0162.n(24506, null, new Object[]{(short[]) C0199.n(40722), 289, Integer.valueOf(C0020.f176 ^ (-563)), 2678});
                String str12 = (String) C0149.n(34115, null, new Object[]{(short[]) C0199.n(40722), 293, Integer.valueOf(C0037.f193 ^ 808), 690});
                String[] strArr = new String[2];
                strArr[C0040.f196 ^ (-333)] = str11;
                strArr[C0123.f332 ^ (-151)] = str12;
                C0192.n(97223, null, new Object[]{strArr, str10, (String) C0162.n(52865, null, new Object[]{(short[]) C0199.n(40722), 297, Integer.valueOf(C0099.f308 ^ 891), 2541}), new com.github.catvod.spider.e(market)});
                return;
            case 7:
                PianDan pianDan = (PianDan) C0199.n(35914, this);
                String str13 = (String) C0162.n(95122, null, new Object[]{(short[]) C0199.n(40722), 266, Integer.valueOf(C0020.f176 ^ (-548)), 2806});
                try {
                    JSONArray jSONArray2 = (JSONArray) C0192.n(3279, null, new Object[0]);
                    int iIntValue2 = ((Integer) C0195.n(12588, jSONArray2, new Object[0])).intValue();
                    int i49 = 1538441;
                    while (true) {
                        i49 ^= 1538458;
                        switch (i49) {
                            case 19:
                                if (iIntValue2 == 0) {
                                    i49 = 1539185;
                                }
                                break;
                            case 50:
                                break;
                            case 93:
                                Calendar calendar = (Calendar) C0192.n(31399, null, new Object[0]);
                                C0192.n(8007, calendar, new Object[]{Integer.valueOf(C0002.f158 ^ 526), 0});
                                C0192.n(8007, calendar, new Object[]{Integer.valueOf(C0132.f341 ^ (-13)), 0});
                                C0192.n(8007, calendar, new Object[]{Integer.valueOf(C0040.f196 ^ (-322)), 0});
                                C0192.n(8007, calendar, new Object[]{Integer.valueOf(C0069.f278 ^ 283), 0});
                                long jLongValue = ((Long) C0192.n(18865, calendar, new Object[0])).longValue();
                                C0192.n(19001, calendar, new Object[]{Integer.valueOf(C0042.f198 ^ 62), 1});
                                long jLongValue2 = ((Long) C0192.n(18865, calendar, new Object[0])).longValue();
                                JSONArray jSONArray3 = new JSONArray();
                                try {
                                    StringBuilder sb10 = new StringBuilder(str13);
                                    jSONArray = (JSONArray) C0192.n(55842, pianDan, new Object[]{(String) C0198.n(89992, sb10, new Object[0])});
                                    while (true) {
                                        i15 ^= 1539357;
                                        switch (i15) {
                                            case 17:
                                                i15 = !zBooleanValue4 ? 1539433 : 1539402;
                                                break;
                                            case 54:
                                                break;
                                            case 87:
                                                break;
                                            case 116:
                                                C0188.n(1950, null, new Object[]{(String) C0192.n(81693, null, new Object[]{arrayList})});
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                } catch (Exception e7) {
                                    int i50 = 1575796;
                                    while (true) {
                                        i50 ^= 1575813;
                                        switch (i50) {
                                            case 22:
                                                jSONArray = jSONArray3;
                                                break;
                                            case 241:
                                                i50 = 1575827;
                                                continue;
                                            default:
                                                continue;
                                        }
                                    }
                                }
                                arrayList = (ArrayList) C0192.n(68656, null, new Object[]{jSONArray2, jSONArray, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)});
                                zBooleanValue4 = ((Boolean) C0179.n(88022, arrayList, new Object[0])).booleanValue();
                                i15 = 1539340;
                                break;
                            case 1515:
                                int i51 = 1539216;
                                while (true) {
                                    i51 ^= 1539233;
                                    switch (i51) {
                                        case 14:
                                            break;
                                        case 49:
                                            i51 = 1539247;
                                            continue;
                                        default:
                                            continue;
                                    }
                                    i14 = 1575021;
                                    while (true) {
                                        i14 ^= 1575038;
                                        switch (i14) {
                                            case 19:
                                                i14 = 1575703;
                                                break;
                                            case 873:
                                                return;
                                        }
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i49 = 1538503;
                    }
                    return;
                } catch (Exception e8) {
                    i14 = 1575021;
                    while (true) {
                        i14 ^= 1575038;
                        switch (i14) {
                            case 19:
                                i14 = 1575703;
                                break;
                            case 873:
                                return;
                        }
                    }
                }
                break;
            case 8:
                Push push = (Push) C0199.n(35914, this);
                X1 x1 = (X1) C0192.n(62400, push);
                int iIntValue3 = ((Integer) C0179.n(44660, (ArrayList) C0192.n(43819, push), new Object[0])).intValue();
                C0152.n(52927, null, new Object[]{new M(x1, iIntValue3, C0005.f161 ^ 642)});
                return;
            case 9:
                a();
                return;
            case 10:
                h hVar = (h) C0199.n(35914, this);
                try {
                    Application application = (Application) C0149.n(10590, null, new Object[0]);
                    int iIntValue4 = ((Integer) C0213.n(65076, null, new Object[]{8, application})).intValue();
                    LinearLayout linearLayout = (LinearLayout) C0213.n(31052, null, new Object[]{application});
                    C0213.n(75512, linearLayout, new Object[]{(LinearLayout) C0213.n(19574, null, new Object[]{application, (String) C0198.n(6303, null, new Object[]{(short[]) C0199.n(40722), 199, Integer.valueOf(C0113.f322 ^ 81), 1987}), (String) C0162.n(89013, null, new Object[]{(short[]) C0199.n(40722), 203, Integer.valueOf(C0054.f210 ^ (-641)), 706})}), (LinearLayout.LayoutParams) C0213.n(69991, null, new Object[]{Integer.valueOf(iIntValue4)})});
                    LinearLayout linearLayout2 = (LinearLayout) C0213.n(8047, null, new Object[]{application});
                    C0213.n(19743, linearLayout2, new Object[]{262144});
                    String str14 = (String) C0198.n(45548, null, new Object[]{(short[]) C0199.n(40722), 213, Integer.valueOf(C0075.f284 ^ 774), 1123});
                    String str15 = (String) C0198.n(51837, null, new Object[]{(short[]) C0199.n(40722), 217, Integer.valueOf(C0029.f185 ^ 259), 404});
                    String[] strArr2 = new String[2];
                    strArr2[C0111.f320 ^ (-932)] = str14;
                    strArr2[C0084.f293 ^ (-387)] = str15;
                    String str16 = (String) C0224.n(99346, null, new Object[]{(short[]) C0199.n(40722), 225, Integer.valueOf(C0080.f289 ^ 255), 3011});
                    String str17 = (String) C0178.n(80760, null, new Object[]{(short[]) C0199.n(40722), 229, Integer.valueOf(C0068.f277 ^ 365), 2936});
                    String[] strArr3 = new String[2];
                    strArr3[C0099.f308 ^ 824] = str16;
                    strArr3[C0048.f204 ^ 853] = str17;
                    String str18 = (String) C0198.n(45548, null, new Object[]{(short[]) C0199.n(40722), 237, Integer.valueOf(C0110.f319 ^ (-552)), 1093});
                    String str19 = (String) C0149.n(74485, null, new Object[]{(short[]) C0199.n(40722), 241, Integer.valueOf(C0066.f275 ^ 443), 3171});
                    String[] strArr4 = new String[2];
                    strArr4[C0002.f158 ^ 517] = str18;
                    strArr4[C0052.f208 ^ (-118)] = str19;
                    String str20 = (String) C0181.n(53852, null, new Object[]{(short[]) C0199.n(40722), 249, Integer.valueOf(C0110.f319 ^ (-552)), 2905});
                    String str21 = (String) C0198.n(30759, null, new Object[]{(short[]) C0199.n(40722), 253, Integer.valueOf(C0132.f341 ^ (-8)), 425});
                    String[] strArr5 = new String[2];
                    strArr5[C0033.f189 ^ (-417)] = str20;
                    strArr5[C0020.f176 ^ (-568)] = str21;
                    int iIntValue5 = ((Integer) C0192.n(75844)).intValue();
                    int iIntValue6 = ((Integer) C0192.n(18414)).intValue();
                    int iIntValue7 = ((Integer) C0192.n(92539)).intValue();
                    int iIntValue8 = ((Integer) C0192.n(94989)).intValue();
                    int[] iArr = new int[4];
                    iArr[C0042.f198 ^ 59] = iIntValue5;
                    iArr[C0058.f267 ^ 102] = iIntValue6;
                    iArr[C0127.f336 ^ (-973)] = iIntValue7;
                    iArr[C0024.f180 ^ (-564)] = iIntValue8;
                    AlertDialog[] alertDialogArr = new AlertDialog[1];
                    int i52 = 0;
                    while (true) {
                        int i53 = 1516338;
                        while (true) {
                            i53 ^= 1516355;
                            switch (i53) {
                                case 18:
                                    break;
                                case 51:
                                    break;
                                case 113:
                                    i53 = i52 < 4 ? 1537263 : 1516400;
                                    break;
                                case 22444:
                                    break;
                                default:
                                    break;
                            }
                            C0176.n(63996, linearLayout, new Object[]{linearLayout2});
                            AlertDialog alertDialog = (AlertDialog) C0213.n(5098, (AlertDialog.Builder) C0213.n(24683, (AlertDialog.Builder) C0213.n(26031, new AlertDialog.Builder((Activity) C0232.n(25717, null, new Object[0])), new Object[]{(C0533m) C0192.n(27401, null, new Object[]{linearLayout})}), new Object[]{(String) C0178.n(80760, null, new Object[]{(short[]) C0199.n(40722), 260, Integer.valueOf(C0066.f275 ^ 433), 1678}), null}), new Object[0]);
                            alertDialogArr[0] = alertDialog;
                            C0213.n(60196, null, new Object[]{alertDialog});
                            int i54 = 1538317;
                            while (true) {
                                i54 ^= 1538334;
                                switch (i54) {
                                    case 19:
                                        i54 = 1538348;
                                        break;
                                    case 50:
                                        return;
                                }
                            }
                        }
                        String[] strArr6 = new String[][]{strArr2, strArr3, strArr4, strArr5}[i52];
                        String str22 = strArr6[0];
                        String str23 = strArr6[1];
                        int i55 = iArr[i52];
                        int i56 = 1537294;
                        while (true) {
                            i56 ^= 1537311;
                            switch (i56) {
                                case 17:
                                    i56 = i52 > 0 ? 1537387 : 1537356;
                                    break;
                                case 50:
                                    break;
                                case 83:
                                    z2 = false;
                                    break;
                                case 116:
                                    z2 = true;
                                    int i57 = 1537418;
                                    while (true) {
                                        i57 ^= 1537435;
                                        switch (i57) {
                                            case 17:
                                                i57 = 1537449;
                                                break;
                                            case 50:
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
                        C0176.n(2044, (LinearLayout) C0192.n(14205, null, new Object[]{linearLayout2, str22, str23, Integer.valueOf(i55), Boolean.valueOf(z2)}), new Object[]{new D(alertDialogArr, i52, hVar, 0)});
                        int i58 = i52 + 0 + 1 + 0;
                        int i59 = 1537542;
                        while (true) {
                            i59 ^= 1537559;
                            switch (i59) {
                                case 17:
                                    i59 = 1538224;
                                    break;
                                case 3751:
                                    break;
                            }
                        }
                        i52 = i58;
                    }
                } catch (Exception e9) {
                    C0188.n(1950, null, new Object[]{(String) C0162.n(68576, null, new Object[]{(short[]) C0199.n(40722), 262, Integer.valueOf(C0035.f191 ^ 312), 2353})});
                    return;
                }
                break;
            case 11:
                String str24 = (String) C0162.n(13243, null, new Object[]{(short[]) C0199.n(40722), 127, Integer.valueOf(C0036.f192 ^ (-42)), 954});
                try {
                    Activity activity = (Activity) C0232.n(25717, null, new Object[0]);
                    F f = (F) C0199.n(35914, this);
                    int i60 = 51836;
                    while (true) {
                        i60 ^= 51853;
                        switch (i60) {
                            case 241:
                                i60 = f != null ? 52580 : 52549;
                                break;
                            case 1963:
                                break;
                            case 1992:
                                z3 = false;
                                break;
                            case 2025:
                                boolean zBooleanValue8 = ((Boolean) C0192.n(35904, f)).booleanValue();
                                int i61 = 52611;
                                while (true) {
                                    i61 ^= 52628;
                                    switch (i61) {
                                        case 23:
                                            i61 = zBooleanValue8 ? 52704 : 52673;
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            z3 = false;
                                            break;
                                        case 116:
                                            int i62 = 52735;
                                            while (true) {
                                                i62 ^= 52752;
                                                switch (i62) {
                                                    case 14:
                                                        z3 = true;
                                                        break;
                                                    case 1007:
                                                        i62 = 52766;
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
                            default:
                                break;
                        }
                    }
                    int i63 = 53510;
                    while (true) {
                        i63 ^= 53527;
                        switch (i63) {
                            case 17:
                                i63 = z3 ? 53603 : 53572;
                                break;
                            case 50:
                                break;
                            case 83:
                                i16 = -16735786;
                                break;
                            case 116:
                                boolean zBooleanValue9 = ((Boolean) C0192.n(44783, f)).booleanValue();
                                int i64 = 53634;
                                while (true) {
                                    i64 ^= 53651;
                                    switch (i64) {
                                        case 17:
                                            i64 = zBooleanValue9 ? 53727 : 53696;
                                            break;
                                        case 50:
                                            break;
                                        case 76:
                                            int i65 = 53758;
                                            while (true) {
                                                i65 ^= 53775;
                                                switch (i65) {
                                                    case 1009:
                                                        i65 = 54440;
                                                        continue;
                                                    case 1703:
                                                        i16 = -363880;
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        case 83:
                                            i16 = -16735786;
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
                    String str25 = (String) C0198.n(39623, null, new Object[]{(short[]) C0199.n(40722), 129, Integer.valueOf(C0002.f158 ^ 513), 2691});
                    int i66 = 54533;
                    while (true) {
                        i66 ^= 54550;
                        switch (i66) {
                            case 19:
                                if (!z3) {
                                    i66 = 54626;
                                }
                                break;
                            case 50:
                                break;
                            case 85:
                                ArrayList arrayList2 = new ArrayList();
                                String str26 = (String) C0198.n(51837, null, new Object[]{(short[]) C0199.n(40722), 148, Integer.valueOf(C0052.f208 ^ (-120)), 605});
                                String str27 = (String) C0192.n(66461, f);
                                String str28 = (String) C0195.n(19148, null, new Object[]{(short[]) C0199.n(40722), 151, Integer.valueOf(C0020.f176 ^ (-563)), 1677});
                                int i67 = 55432;
                                while (true) {
                                    i67 ^= 55449;
                                    switch (i67) {
                                        case 17:
                                            i67 = str27 != null ? 55525 : 55494;
                                            break;
                                        case 62:
                                            break;
                                        case 95:
                                            str3 = str28;
                                            break;
                                        case 124:
                                            boolean zBooleanValue10 = ((Boolean) C0195.n(5730, str27, new Object[0])).booleanValue();
                                            int i68 = 55556;
                                            while (true) {
                                                i68 ^= 55573;
                                                switch (i68) {
                                                    case 17:
                                                        i68 = !zBooleanValue10 ? 55649 : 55618;
                                                        break;
                                                    case 54:
                                                        break;
                                                    case 87:
                                                        str3 = str28;
                                                        break;
                                                    case 116:
                                                        int i69 = 55680;
                                                        while (true) {
                                                            i69 ^= 55697;
                                                            switch (i69) {
                                                                case 17:
                                                                    i69 = 56362;
                                                                    continue;
                                                                case 1467:
                                                                    str3 = str27;
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
                                int iIntValue9 = ((Integer) C0192.n(62805)).intValue();
                                ((Boolean) C0179.n(13382, arrayList2, new Object[]{new C0517i3(str26, iIntValue9, str3, false)})).booleanValue();
                                long jLongValue3 = ((Long) C0192.n(86021, f)).longValue();
                                int i70 = 56455;
                                while (true) {
                                    i70 ^= 56472;
                                    switch (i70) {
                                        case 31:
                                            i70 = jLongValue3 > 0 ? 56548 : 56517;
                                            break;
                                        case 62:
                                            break;
                                        case 93:
                                            break;
                                        case 124:
                                            ((Boolean) C0179.n(13382, arrayList2, new Object[]{new C0517i3((String) C0191.n(93496, null, new Object[]{(short[]) C0199.n(40722), 155, Integer.valueOf(C0078.f287 ^ (-691)), 2376}), iIntValue9, (String) C0155.n(88896, null, new Object[]{Long.valueOf(jLongValue3)}), false)})).booleanValue();
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                String str29 = (String) C0178.n(26978, null, new Object[]{(short[]) C0199.n(40722), 158, Integer.valueOf(C0025.f181 ^ (-682)), 2234});
                                StringBuilder sb11 = new StringBuilder(str24);
                                String str30 = (String) C0198.n(89992, sb11, new Object[0]);
                                int iIntValue10 = ((Integer) C0192.n(7546, f)).intValue();
                                int i71 = 56579;
                                while (true) {
                                    i71 ^= 56596;
                                    switch (i71) {
                                        case 23:
                                            i71 = iIntValue10 >= 6 ? 1507472 : 56641;
                                            break;
                                        case 54:
                                            break;
                                        case 85:
                                            int i72 = 1507627;
                                            while (true) {
                                                i72 ^= 1507644;
                                                switch (i72) {
                                                    case 23:
                                                        i72 = iIntValue10 >= 5 ? 1507720 : 1507689;
                                                        break;
                                                    case 85:
                                                        int i73 = 1508526;
                                                        while (true) {
                                                            i73 ^= 1508543;
                                                            switch (i73) {
                                                                case 17:
                                                                    i73 = iIntValue10 >= 4 ? 1508619 : 1508588;
                                                                    break;
                                                                case 83:
                                                                    int i74 = 1509425;
                                                                    while (true) {
                                                                        i74 ^= 1509442;
                                                                        switch (i74) {
                                                                            case 18:
                                                                                break;
                                                                            case 45:
                                                                                int i75 = 1509673;
                                                                                while (true) {
                                                                                    i75 ^= 1509690;
                                                                                    switch (i75) {
                                                                                        case 19:
                                                                                            i75 = iIntValue10 >= 2 ? 1510417 : 1510386;
                                                                                            break;
                                                                                        case 712:
                                                                                            i17 = -6381922;
                                                                                            int i76 = 1510572;
                                                                                            while (true) {
                                                                                                i76 ^= 1510589;
                                                                                                switch (i76) {
                                                                                                    case 17:
                                                                                                        i76 = 1510603;
                                                                                                        continue;
                                                                                                    case 118:
                                                                                                        break;
                                                                                                    default:
                                                                                                        continue;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 745:
                                                                                            break;
                                                                                        case 1323:
                                                                                            i17 = -16728876;
                                                                                            int i77 = 1510448;
                                                                                            while (true) {
                                                                                                i77 ^= 1510465;
                                                                                                switch (i77) {
                                                                                                    case 14:
                                                                                                        break;
                                                                                                    case 113:
                                                                                                        i77 = 1510479;
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
                                                                                i74 = iIntValue10 >= 3 ? 1509518 : 1509487;
                                                                                break;
                                                                            case 204:
                                                                                i17 = -14575885;
                                                                                int i78 = 1509549;
                                                                                while (true) {
                                                                                    i78 ^= 1509566;
                                                                                    switch (i78) {
                                                                                        case 19:
                                                                                            i78 = 1509580;
                                                                                            continue;
                                                                                        case 114:
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
                                                                case 114:
                                                                    break;
                                                                case 436:
                                                                    i17 = -11751600;
                                                                    int i79 = 1508650;
                                                                    while (true) {
                                                                        i79 ^= 1508667;
                                                                        switch (i79) {
                                                                            case 17:
                                                                                i79 = 1508681;
                                                                                continue;
                                                                            case 114:
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
                                                    case 118:
                                                        break;
                                                    case 180:
                                                        i17 = -26624;
                                                        int i80 = 1507751;
                                                        while (true) {
                                                            i80 ^= 1507768;
                                                            switch (i80) {
                                                                case 31:
                                                                    i80 = 1508433;
                                                                    continue;
                                                                case 1513:
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
                                        case 1564036:
                                            i17 = -38037;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                int i81 = 1507503;
                                while (true) {
                                    i81 ^= 1507520;
                                    switch (i81) {
                                        case 14:
                                            ((Boolean) C0179.n(13382, arrayList2, new Object[]{new C0517i3(str29, i17, str30, true)})).booleanValue();
                                            ((Boolean) C0179.n(13382, arrayList2, new Object[]{new C0517i3((String) C0152.n(85600, null, new Object[]{(short[]) C0199.n(40722), 160, Integer.valueOf(C0113.f322 ^ 87), 821}), ((Integer) C0192.n(92539)).intValue(), (String) C0204.n(34375, null, new Object[]{Integer.valueOf((int) ((Double) C0192.n(28322, f)).doubleValue())}), false)})).booleanValue();
                                            boolean zBooleanValue11 = ((Boolean) C0192.n(44783, f)).booleanValue();
                                            int i82 = 1511347;
                                            while (true) {
                                                i82 ^= 1511364;
                                                switch (i82) {
                                                    case 22:
                                                        break;
                                                    case 53:
                                                        str4 = (String) C0178.n(65464, null, new Object[]{(short[]) C0199.n(40722), 165, Integer.valueOf(C0035.f191 ^ 312), 1165});
                                                        break;
                                                    case 119:
                                                        i82 = zBooleanValue11 ? 1511440 : 1511409;
                                                        break;
                                                    case 8148:
                                                        String str31 = (String) C0192.n(77424, f);
                                                        int i83 = 1511471;
                                                        while (true) {
                                                            i83 ^= 1511488;
                                                            switch (i83) {
                                                                case 14:
                                                                    break;
                                                                case 45:
                                                                    str5 = (String) C0178.n(80760, null, new Object[]{(short[]) C0199.n(40722), 162, Integer.valueOf(C0064.f273 ^ (-437)), 2053});
                                                                    i19 = 1512494;
                                                                    while (true) {
                                                                        i19 ^= 1512511;
                                                                        switch (i19) {
                                                                            case 17:
                                                                                i19 = 1512525;
                                                                                continue;
                                                                                continue;
                                                                            case 114:
                                                                                str4 = str5;
                                                                                break;
                                                                            default:
                                                                                continue;
                                                                                continue;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 111:
                                                                    i83 = str31 != null ? 1511564 : 1511533;
                                                                    break;
                                                                case 204:
                                                                    boolean zBooleanValue12 = ((Boolean) C0195.n(5730, str31, new Object[0])).booleanValue();
                                                                    int i84 = 1511595;
                                                                    while (true) {
                                                                        i84 ^= 1511612;
                                                                        switch (i84) {
                                                                            case 23:
                                                                                i84 = !zBooleanValue12 ? 1512339 : 1512308;
                                                                                break;
                                                                            case 815:
                                                                                String str32 = (String) C0192.n(77424, f);
                                                                                int i85 = 1512370;
                                                                                while (true) {
                                                                                    i85 ^= 1512387;
                                                                                    switch (i85) {
                                                                                        case 18:
                                                                                            str4 = str32;
                                                                                            break;
                                                                                        case 113:
                                                                                            i85 = 1512401;
                                                                                            continue;
                                                                                        default:
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 968:
                                                                                str5 = (String) C0178.n(80760, null, new Object[]{(short[]) C0199.n(40722), 162, Integer.valueOf(C0064.f273 ^ (-437)), 2053});
                                                                                i19 = 1512494;
                                                                                while (true) {
                                                                                    i19 ^= 1512511;
                                                                                    switch (i19) {
                                                                                        case 17:
                                                                                            i19 = 1512525;
                                                                                            continue;
                                                                                            continue;
                                                                                        case 114:
                                                                                            str4 = str5;
                                                                                            break;
                                                                                        default:
                                                                                            continue;
                                                                                            continue;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1001:
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
                                            String str33 = (String) C0198.n(51837, null, new Object[]{(short[]) C0199.n(40722), 169, Integer.valueOf(C0102.f311 ^ 547), 3058});
                                            boolean zBooleanValue13 = ((Boolean) C0192.n(44783, f)).booleanValue();
                                            int i86 = 1513269;
                                            while (true) {
                                                i86 ^= 1513286;
                                                switch (i86) {
                                                    case 18:
                                                        break;
                                                    case 53:
                                                        i18 = iIntValue9;
                                                        break;
                                                    case 115:
                                                        i86 = zBooleanValue13 ? 1513362 : 1513331;
                                                        break;
                                                    case 212:
                                                        i18 = -363880;
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                            ((Boolean) C0179.n(13382, arrayList2, new Object[]{new C0517i3(str33, i18, str4, false)})).booleanValue();
                                            boolean zBooleanValue14 = ((Boolean) C0192.n(44783, f)).booleanValue();
                                            int i87 = 1513393;
                                            while (true) {
                                                i87 ^= 1513410;
                                                switch (i87) {
                                                    case 18:
                                                        break;
                                                    case 45:
                                                        break;
                                                    case 115:
                                                        i87 = zBooleanValue14 ? 1513486 : 1513455;
                                                        break;
                                                    case 4044:
                                                        long jLongValue4 = ((Long) C0192.n(68853, f)).longValue();
                                                        int i88 = 1513517;
                                                        while (true) {
                                                            i88 ^= 1513534;
                                                            switch (i88) {
                                                                case 19:
                                                                    i88 = jLongValue4 > 0 ? 1514261 : 1514230;
                                                                    break;
                                                                case 712:
                                                                    break;
                                                                case 745:
                                                                    break;
                                                                case 811:
                                                                    ((Boolean) C0179.n(13382, arrayList2, new Object[]{new C0517i3((String) C0157.n(97123, null, new Object[]{(short[]) C0199.n(40722), 183, Integer.valueOf(C0138.f347 ^ 267), 1347}), ((Integer) C0192.n(75844)).intValue(), (String) C0209.n(47001, new SimpleDateFormat((String) C0157.n(97123, null, new Object[]{(short[]) C0199.n(40722), 173, Integer.valueOf(C0035.f191 ^ 310), 2792}), (Locale) C0192.n(98354, null, new Object[0])), new Object[]{new Date(((Long) C0192.n(68853, f)).longValue())}), false)})).booleanValue();
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
                                            C0502f3 c0502f3 = new C0502f3(activity);
                                            c0502f3.b = str25;
                                            c0502f3.d = i16;
                                            c0502f3.e = true;
                                            String str34 = (String) C0192.n(66461, f);
                                            String str35 = (String) C0157.n(78385, null, new Object[]{(short[]) C0199.n(40722), 186, Integer.valueOf(C0065.f274 ^ 16), 3211});
                                            int i89 = 1514292;
                                            while (true) {
                                                i89 ^= 1514309;
                                                switch (i89) {
                                                    case 22:
                                                        break;
                                                    case 55:
                                                        str34 = str35;
                                                        break;
                                                    case 113:
                                                        i89 = str34 != null ? 1514385 : 1514354;
                                                        break;
                                                    case 212:
                                                        boolean zBooleanValue15 = ((Boolean) C0195.n(5730, str34, new Object[0])).booleanValue();
                                                        int i90 = 1514416;
                                                        while (true) {
                                                            i90 ^= 1514433;
                                                            switch (i90) {
                                                                case 14:
                                                                    break;
                                                                case 47:
                                                                    str34 = str35;
                                                                    break;
                                                                case 113:
                                                                    i90 = !zBooleanValue15 ? 1515160 : 1514478;
                                                                    break;
                                                                case 1369:
                                                                    int i91 = 1515191;
                                                                    while (true) {
                                                                        i91 ^= 1515208;
                                                                        switch (i91) {
                                                                            case 30:
                                                                                break;
                                                                            case 127:
                                                                                i91 = 1515222;
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
                                                    default:
                                                        break;
                                                }
                                            }
                                            c0502f3.c = str34;
                                            c0502f3.g = (String) C0192.n(71415, f);
                                            c0502f3.h = (String) C0157.n(97123, null, new Object[]{(short[]) C0199.n(40722), 189, Integer.valueOf(C0075.f284 ^ 772), 1139});
                                            Iterator it = (Iterator) C0147.n(15046, arrayList2, new Object[0]);
                                            while (true) {
                                                boolean zBooleanValue16 = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
                                                int i92 = 1515315;
                                                while (true) {
                                                    i92 ^= 1515332;
                                                    switch (i92) {
                                                        case 22:
                                                            break;
                                                        case 53:
                                                            break;
                                                        case 119:
                                                            i92 = zBooleanValue16 ? 1515408 : 1515377;
                                                            break;
                                                        case 212:
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    int i93 = 1516214;
                                                    while (true) {
                                                        i93 ^= 1516231;
                                                        switch (i93) {
                                                            case 18:
                                                                return;
                                                            case 113:
                                                                i93 = 1516245;
                                                                break;
                                                        }
                                                    }
                                                }
                                                ((Boolean) C0179.n(13382, (ArrayList) C0192.n(84305, c0502f3), new Object[]{(C0517i3) C0221.n(87284, it, new Object[0])})).booleanValue();
                                                int i94 = 1515439;
                                                while (true) {
                                                    i94 ^= 1515456;
                                                    switch (i94) {
                                                        case 111:
                                                            i94 = 1516121;
                                                            break;
                                                        case 15769:
                                                            break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 111:
                                            i81 = 1507534;
                                            break;
                                    }
                                }
                                break;
                            case 116:
                                C0502f3 c0502f4 = new C0502f3(activity);
                                c0502f4.b = str25;
                                c0502f4.d = -16735786;
                                c0502f4.e = false;
                                c0502f4.f = (String) C0198.n(14698, null, new Object[]{(short[]) C0199.n(40722), 133, Integer.valueOf(C0029.f185 ^ 260), 360});
                                int i95 = 54657;
                                while (true) {
                                    i95 ^= 54674;
                                    switch (i95) {
                                        case 19:
                                            i95 = 54688;
                                            break;
                                        case 50:
                                            return;
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i66 = 54595;
                    }
                } catch (Exception e10) {
                    C0188.n(1950, null, new Object[]{(String) C0182.n(69249, null, new Object[]{(short[]) C0199.n(40722), 195, Integer.valueOf(C0031.f187 ^ (-614)), 740})});
                    return;
                }
                break;
            case 12:
                Activity activity2 = (Activity) C0199.n(35914, this);
                try {
                    a aVar = (a) C0186.n(76899, null, new Object[0]);
                    boolean zBooleanValue17 = ((Boolean) C0180.n(26816, aVar, new Object[0])).booleanValue();
                    boolean zBooleanValue18 = ((Boolean) C0215.n(90017, aVar, new Object[0])).booleanValue();
                    boolean zBooleanValue19 = ((Boolean) C0215.n(29740, aVar, new Object[0])).booleanValue();
                    int iIntValue11 = ((Integer) C0213.n(65076, null, new Object[]{8, activity2})).intValue();
                    LinearLayout linearLayout3 = (LinearLayout) C0213.n(31052, null, new Object[]{activity2});
                    String str36 = (String) C0224.n(31189, null, new Object[]{(short[]) C0199.n(40722), 91, Integer.valueOf(C0007.f163 ^ 163), 2649});
                    boolean zBooleanValue20 = ((Boolean) C0186.n(18167, aVar, new Object[0])).booleanValue();
                    int i96 = 50689;
                    while (true) {
                        i96 ^= 50706;
                        switch (i96) {
                            case 19:
                                i96 = zBooleanValue20 ? 50782 : 50751;
                                break;
                            case 45:
                                str6 = (String) C0224.n(54707, null, new Object[]{(short[]) C0199.n(40722), 106, Integer.valueOf(C0086.f295 ^ (-352)), 926});
                                break;
                            case 50:
                                break;
                            case 76:
                                str6 = (String) C0224.n(45530, null, new Object[]{(short[]) C0199.n(40722), 95, Integer.valueOf(C0084.f293 ^ (-393)), 907});
                                int i97 = 50813;
                                while (true) {
                                    i97 ^= 50830;
                                    switch (i97) {
                                        case 18:
                                            break;
                                        case 243:
                                            i97 = 50844;
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
                    C0213.n(75512, linearLayout3, new Object[]{(LinearLayout) C0192.n(24890, null, new Object[]{activity2, str36, str6, Integer.valueOf(((Integer) C0192.n(52547)).intValue())}), (LinearLayout.LayoutParams) C0213.n(69991, null, new Object[]{Integer.valueOf(iIntValue11)})});
                    LinearLayout linearLayout4 = (LinearLayout) C0213.n(8047, null, new Object[]{activity2});
                    C0192.n(37162, null, new Object[]{linearLayout4, aVar});
                    C0176.n(63996, linearLayout3, new Object[]{linearLayout4});
                    C0213.n(60196, null, new Object[]{(AlertDialog) C0213.n(5098, (AlertDialog.Builder) C0213.n(73997, (AlertDialog.Builder) C0213.n(26031, new AlertDialog.Builder(activity2), new Object[]{(C0533m) C0192.n(27401, null, new Object[]{linearLayout3})}), new Object[]{(String) C0162.n(89013, null, new Object[]{(short[]) C0199.n(40722), 119, Integer.valueOf(C0035.f191 ^ 318), 2639}), new V(aVar, zBooleanValue17, zBooleanValue18, zBooleanValue19, 0)}), new Object[0])});
                    int i98 = 51712;
                    while (true) {
                        i98 ^= 51729;
                        switch (i98) {
                            case 14:
                                return;
                            case 17:
                                i98 = 51743;
                                break;
                        }
                    }
                } catch (Exception e11) {
                    int i99 = 51588;
                    while (true) {
                        i99 ^= 51605;
                        switch (i99) {
                            case 17:
                                i99 = 51619;
                                break;
                            case 54:
                                C0213.n(55886, null, new Object[]{e11, new StringBuilder((String) C0224.n(74697, null, new Object[]{(short[]) C0199.n(40722), 121, Integer.valueOf(C0058.f267 ^ 97), 2857}))});
                                return;
                        }
                    }
                }
                break;
            case 13:
                AlertDialog alertDialog2 = (AlertDialog) C0192.n(70902);
                AlertDialog alertDialog3 = ((AlertDialog[]) C0199.n(35914, this))[0];
                int i100 = 49914;
                while (true) {
                    i100 ^= 49931;
                    switch (i100) {
                        case 497:
                            if (alertDialog2 == alertDialog3) {
                                i100 = 50658;
                            }
                            break;
                        case 1711:
                            break;
                        case 1736:
                            return;
                        case 1769:
                            P1.q = null;
                            P1.r = null;
                            return;
                        default:
                            continue;
                    }
                    i100 = 50627;
                }
                break;
            case 14:
                C0192.n(73642, (B2) C0199.n(35914, this), new Object[0]);
                return;
            case 15:
                try {
                    Activity activity3 = (Activity) C0232.n(25717, null, new Object[0]);
                    int iIntValue12 = ((Integer) C0213.n(65076, null, new Object[]{8, activity3})).intValue();
                    int iIntValue13 = ((Integer) C0192.n(75844)).intValue();
                    int iIntValue14 = ((Integer) C0192.n(52547)).intValue();
                    int iIntValue15 = ((Integer) C0192.n(92539)).intValue();
                    int iIntValue16 = ((Integer) C0192.n(18414)).intValue();
                    int[] iArr2 = new int[5];
                    iArr2[C0099.f308 ^ 824] = iIntValue13;
                    iArr2[C0022.f178 ^ 97] = iIntValue14;
                    iArr2[C0020.f176 ^ (-565)] = -15610385;
                    iArr2[C0102.f311 ^ 548] = iIntValue15;
                    iArr2[C0123.f332 ^ (-148)] = iIntValue16;
                    LinearLayout linearLayout5 = (LinearLayout) C0213.n(31052, null, new Object[]{activity3});
                    C0213.n(75512, linearLayout5, new Object[]{(LinearLayout) C0213.n(19574, null, new Object[]{activity3, (String) C0149.n(61324, null, new Object[]{(short[]) C0199.n(40722), 48, Integer.valueOf(C0020.f176 ^ (-563)), 1831}), (String) C0224.n(45530, null, new Object[]{(short[]) C0199.n(40722), 52, Integer.valueOf(C0138.f347 ^ 262), 1947})}), (LinearLayout.LayoutParams) C0213.n(69991, null, new Object[]{Integer.valueOf(iIntValue12)})});
                    LinearLayout linearLayout6 = (LinearLayout) C0213.n(8047, null, new Object[]{activity3});
                    LinearLayout linearLayout7 = new LinearLayout(activity3);
                    C0213.n(50593, linearLayout7, new Object[]{1});
                    C0213.n(19743, linearLayout7, new Object[]{262144});
                    int i101 = 0;
                    while (true) {
                        String[] strArr7 = (String[]) C0194.n(42036);
                        int length2 = strArr7.length;
                        boolean[] zArr = (boolean[]) C0199.n(35914, this);
                        int i102 = 1740;
                        while (true) {
                            i102 ^= 1757;
                            switch (i102) {
                                case 17:
                                    i102 = i101 < length2 ? 1833 : 1802;
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    break;
                                case 500:
                                    break;
                                default:
                                    break;
                            }
                            C0176.n(63996, linearLayout6, new Object[]{(ScrollView) C0199.n(69516, null, new Object[]{activity3, linearLayout7, Integer.valueOf(C0144.f354 ^ (-835))})});
                            C0213.n(8544, null, new Object[]{linearLayout6, (String) C0162.n(76230, null, new Object[]{(short[]) C0199.n(40722), 66, Integer.valueOf(C0029.f185 ^ 260), 1770})});
                            C0176.n(63996, linearLayout5, new Object[]{linearLayout6});
                            C0213.n(60196, null, new Object[]{(AlertDialog) C0213.n(5098, (AlertDialog.Builder) C0213.n(24683, (AlertDialog.Builder) C0213.n(73997, (AlertDialog.Builder) C0213.n(26031, new AlertDialog.Builder(activity3), new Object[]{linearLayout5}), new Object[]{(String) C0198.n(68788, null, new Object[]{(short[]) C0199.n(40722), 81, Integer.valueOf(C0123.f332 ^ (-150)), 2504}), new DialogInterfaceOnClickListenerC0518j(4, zArr)}), new Object[]{(String) C0149.n(74485, null, new Object[]{(short[]) C0199.n(40722), 83, Integer.valueOf(C0005.f161 ^ 643), 1424}), null}), new Object[0])});
                            int i103 = 49790;
                            while (true) {
                                i103 ^= 49807;
                                switch (i103) {
                                    case 18:
                                        return;
                                    case 241:
                                        i103 = 49821;
                                        break;
                                }
                            }
                        }
                        String str37 = strArr7[i101];
                        int i104 = iArr2[i101 % (C0038.f194 ^ 218)];
                        boolean z5 = zArr[i101];
                        int i105 = 1864;
                        while (true) {
                            i105 ^= 1881;
                            switch (i105) {
                                case 17:
                                    i105 = i101 > 0 ? 48736 : 48705;
                                    break;
                                case 47384:
                                    z4 = false;
                                    break;
                                case 47417:
                                    z4 = true;
                                    int i106 = 48767;
                                    while (true) {
                                        i106 ^= 48784;
                                        switch (i106) {
                                            case 14:
                                                break;
                                            case 239:
                                                i106 = 48798;
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    break;
                                case 47483:
                                    break;
                                default:
                                    break;
                            }
                        }
                        C0213.n(88107, null, new Object[]{linearLayout7, str37, null, Integer.valueOf(i104), Boolean.valueOf(z5), Integer.valueOf(i101), Boolean.valueOf(z4), null, zArr, null});
                        int i107 = 0 - ((0 - i101) - 1);
                        int i108 = 48891;
                        while (true) {
                            i108 ^= 48908;
                            switch (i108) {
                                case 22:
                                    break;
                                case 503:
                                    i108 = 48922;
                                    break;
                            }
                        }
                        i101 = i107;
                    }
                } catch (Exception e12) {
                    int i109 = 49666;
                    while (true) {
                        i109 ^= 49683;
                        switch (i109) {
                            case 17:
                                i109 = 49697;
                                break;
                            case 50:
                                C0213.n(55886, null, new Object[]{e12, new StringBuilder((String) C0181.n(92093, null, new Object[]{(short[]) C0199.n(40722), 85, Integer.valueOf(C0129.f338 ^ 916), 2594}))});
                                return;
                        }
                    }
                }
                break;
            case 16:
                b();
                return;
            default:
                StringBuilder sb12 = new StringBuilder((String) C0178.n(65464, null, new Object[]{(short[]) C0199.n(40722), 42, Integer.valueOf(C0065.f274 ^ 21), 615}));
                C0188.n(1950, null, new Object[]{(String) C0198.n(89992, sb12, new Object[0])});
                int iIntValue17 = ((Integer) C0224.n(95865, null, new Object[0])).intValue();
                int i110 = 1616;
                while (true) {
                    i110 ^= 1633;
                    switch (i110) {
                        case 14:
                            break;
                        case 49:
                            if (iIntValue17 >= 0) {
                                i110 = 1709;
                            }
                            break;
                        case 204:
                            C0162.n(83524, (PrintStream) C0195.n(72538), new Object[]{Long.valueOf(((Long) C0162.n(73560, null, new Object[]{(String) C0194.n(4660, null, new Object[]{(String) C0192.n(3521)})})).longValue())});
                            return;
                        case 239:
                            return;
                        default:
                            continue;
                    }
                    i110 = 1678;
                }
                break;
        }
    }
}
