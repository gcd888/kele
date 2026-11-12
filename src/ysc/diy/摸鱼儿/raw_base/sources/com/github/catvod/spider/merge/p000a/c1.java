package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.A.C0241a1;
import com.github.catvod.spider.merge.A.C0261h0;
import com.github.catvod.spider.merge.E.C0015;
import com.github.catvod.spider.merge.b0.C0061;
import com.github.catvod.spider.merge.p020x.b;
import com.github.catvod.spider.merge.p020x.g;
import com.github.catvod.spider.merge.p020x.h;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import moyu.fucking.C0152;
import moyu.fucking.C0157;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0176;
import moyu.fucking.C0178;
import moyu.fucking.C0179;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0212;
import moyu.fucking.C0216;
import moyu.fucking.C0219;
import moyu.fucking.C0224;
import moyu.fucking.C0225;
import moyu.fucking.C0233;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class c1 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f231short = {2944, 3022, 3039, 3014, 2944, 3036, 3018, 3022, 3037, 3020, 3015, 2960, 3012, 3032, 2962, 746, 747, 761, 658, 647, 1207, 1251, 1268, 1250, 1196, 1276, 1268, 1251, 1270, 1268, 1758, 1755, 1742, 1755, 945, 953, 942, 955, 953, 952, 899, 958, 933, 899, 936, 933, 940, 953};
    public final int a = 1;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public /* synthetic */ c1(C0261h0 c0261h0, String str, String str2, String str3, String str4, List list, List list2, g gVar, CountDownLatch countDownLatch, CountDownLatch countDownLatch2) throws Throwable {
        this.h = c0261h0;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = list2;
        this.i = gVar;
        this.j = countDownLatch;
        this.k = countDownLatch2;
        int iIntValue = ((Integer) C0176.n(35919, null, new Object[0])).intValue();
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
                    C0195.n(19817, (PrintStream) C0195.n(72538), new Object[]{Integer.valueOf(((Integer) C0195.n(60398, null, new Object[]{(String) C0152.n(7488, null, new Object[]{(String) C0212.n(98581)})})).intValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public /* synthetic */ c1(l1 l1Var, String str, String str2, String str3, String str4, String str5, List list, List list2, ExecutorService executorService, Semaphore semaphore) throws Throwable {
        this.h = l1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.i = str5;
        this.f = list;
        this.g = list2;
        this.j = executorService;
        this.k = semaphore;
        int iIntValue = ((Integer) C0168.n(13558, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0178.n(16623, null, new Object[]{(String) C0152.n(74755, null, new Object[]{(String) C0212.n(22428)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        JSONObject jSONObject;
        Object objN = C0212.n(76607, this);
        Object objN2 = C0212.n(55540, this);
        Object objN3 = C0212.n(37422, this);
        Object objN4 = C0212.n(59750, this);
        switch (((Integer) C0212.n(10244, this)).intValue()) {
            case 0:
                C0212.n(64308, (l1) objN, new Object[]{(String) C0212.n(67830, this), (String) C0212.n(21914, this), (String) C0212.n(17251, this), (String) C0195.n(43185), (String) C0212.n(65167, this), (String) objN4, (List) C0212.n(42622, this), (List) C0212.n(62536, this), (ExecutorService) objN3, (Semaphore) objN2});
                return;
            default:
                String str = (String) C0212.n(67830, this);
                String str2 = (String) C0212.n(21914, this);
                String str3 = (String) C0212.n(17251, this);
                String str4 = (String) C0212.n(65167, this);
                List list = (List) C0212.n(42622, this);
                List list2 = (List) C0212.n(62536, this);
                g gVar = (g) objN4;
                CountDownLatch countDownLatch = (CountDownLatch) objN3;
                CountDownLatch countDownLatch2 = (CountDownLatch) objN2;
                C0261h0 c0261h0 = (C0261h0) objN;
                try {
                    try {
                        StringBuilder sb = new StringBuilder();
                        String str5 = (String) C0198.n(89992, sb, new Object[0]);
                        JSONObject jSONObject2 = (JSONObject) C0179.n(53560, new JSONObject((String) C0219.n(31142, null, new Object[]{str5, null, (HashMap) C0212.n(75048, null, new Object[]{str})})), new Object[]{(String) C0162.n(52865, null, new Object[]{(short[]) C0212.n(41934), 30, Integer.valueOf(C0015.f171 ^ (-942)), 1722})});
                        int i2 = 1616;
                        while (true) {
                            i2 ^= 1633;
                            switch (i2) {
                                case 14:
                                    break;
                                case 49:
                                    i2 = jSONObject2 != null ? 1709 : 1678;
                                    break;
                                case 204:
                                    JSONObject jSONObject3 = (JSONObject) C0179.n(53560, jSONObject2, new Object[]{(String) C0224.n(54707, null, new Object[]{(short[]) C0212.n(41934), 34, Integer.valueOf(C0061.f270 ^ (-916)), 988})});
                                    int i3 = 1740;
                                    while (true) {
                                        i3 ^= 1757;
                                        switch (i3) {
                                            case 17:
                                                i3 = 1771;
                                                continue;
                                            case 54:
                                                jSONObject = jSONObject3;
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                    break;
                                case 239:
                                    jSONObject = null;
                                    break;
                                default:
                                    break;
                            }
                        }
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 45:
                                    break;
                                case 76:
                                    int iIntValue = ((Integer) C0216.n(24047, jSONObject, new Object[0])).intValue();
                                    int i5 = 48891;
                                    while (true) {
                                        i5 ^= 48908;
                                        switch (i5) {
                                            case 22:
                                                break;
                                            case 53:
                                                break;
                                            case 503:
                                                i5 = iIntValue > 0 ? 49635 : 48953;
                                                break;
                                            case 32495:
                                                ((Boolean) C0233.n(58338, list, new Object[]{jSONObject})).booleanValue();
                                                ((Boolean) C0233.n(58338, list2, new Object[]{str})).booleanValue();
                                                try {
                                                    h hVar = (h) C0212.n(2119, gVar);
                                                    b bVar = (b) C0212.n(50466, hVar);
                                                    C0212.n(81361, hVar, new Object[]{(LinkedHashMap) C0212.n(88373, null, new Object[]{jSONObject, new C0241a1((ArrayList) C0212.n(24956, bVar), (ArrayList) C0212.n(90468, bVar), (ArrayList) C0212.n(47684, bVar), ((Integer) C0212.n(15162, bVar)).intValue())}), (int[]) C0212.n(44168, gVar), C0212.n(44624, gVar)});
                                                    break;
                                                } catch (Exception e) {
                                                    int i6 = 50689;
                                                    while (true) {
                                                        i6 ^= 50706;
                                                        switch (i6) {
                                                            case 19:
                                                                i6 = 50720;
                                                                break;
                                                            case 50:
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                }
                                                C0225.n(16415, countDownLatch, new Object[0]);
                                                break;
                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 239:
                                    i4 = jSONObject != null ? 48860 : 48829;
                                    break;
                                default:
                                    break;
                            }
                        }
                        while (true) {
                            i ^= 49683;
                            switch (i) {
                                case 17:
                                    i = 49697;
                                    break;
                                case 50:
                                    int iIntValue2 = ((Integer) C0157.n(49675, null, new Object[0])).intValue();
                                    int i7 = 49790;
                                    while (true) {
                                        i7 ^= 49807;
                                        switch (i7) {
                                            case 18:
                                                break;
                                            case 51:
                                                return;
                                            case 84:
                                                C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0178.n(54580, null, new Object[]{(String) C0212.n(76081)})})});
                                                return;
                                            case 241:
                                                if (iIntValue2 >= 0) {
                                                    i7 = 49883;
                                                }
                                                break;
                                            default:
                                                continue;
                                        }
                                        i7 = 49852;
                                    }
                                    break;
                            }
                        }
                    } catch (Throwable th) {
                        int i8 = 1864;
                        while (true) {
                            i8 ^= 1881;
                            switch (i8) {
                                case 17:
                                    i8 = 48674;
                                    break;
                                case 47483:
                                    C0225.n(16415, countDownLatch2, new Object[0]);
                                    throw th;
                            }
                        }
                    }
                } catch (Exception e2) {
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
                }
                C0225.n(16415, countDownLatch2, new Object[0]);
                i = 49666;
                break;
        }
    }
}
