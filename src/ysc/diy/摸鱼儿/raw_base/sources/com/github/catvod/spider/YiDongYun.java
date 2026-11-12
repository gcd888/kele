package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.AbstractC0260h;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0261h0;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.S0;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.t1;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.j;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.utils.C0143;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import moyu.fucking.C0152;
import moyu.fucking.C0168;
import moyu.fucking.C0195;
import moyu.fucking.C0196;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class YiDongYun extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f118short = {1744, 1703, 1744, 1703, 2624, 2639, 2627, 2635, 1268, 1256, 1256, 1260, 3197, 3168, 3168, 3195, 1950, 1935, 1946, 1926, 3277, 3265, 3264, 3290, 3275, 3264, 3290, 3303, 3274, 1685, 1689, 1727, 1682, 1001, 1004, 1003, 1006, 972, 961, 2348, 2348, 28587, 28216, 1800, 1816, 1813, 1822, 1823, 1814, 1838, 1822, 1795, 1816, 1814, 1816, 1823, 1808, 1821, 2341, 2357, 2360, 2355, 2354, 2363, 2307, 2351, 2353, 2365, 2350, 2344, 1988, 2004, 2009, 2002, 2003, 2010, 1030, 1046, 1051, 1040, 1041, 1048, 1056, 1040, 1037, 1046, 1048, 1046, 1041, 1054, 1043, 2050, 2066, 2079, 2068, 2069, 2076, 2084, 2056, 2070, 2074, 2057, 2063, 2835, 2835, 2835, 31701, 20614, 19647, -32359, 20984, 26243, 26384, 21790, 21870, 21460, -26825, 532, 1051, 1050, 1035, 1054, 1046, 1043, 1084, 1040, 1041, 1035, 1050, 1041, 1035, 998, 1018, 1015, 1007, 1011, 996, 981, 1017, 1016, 994, 1011, 1016, 994};

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        t1 t1VarU = t1.u();
        String[] strArrSplit = str2.split(C0090.m358(f118short, 0, 4, 1676));
        t1VarU.getClass();
        return t1.N(str, strArrSplit);
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        return com.github.catvod.spider.merge.p001b.g.s(a(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.LinkedHashMap] */
    public static k a(ArrayList arrayList) throws Throwable {
        ?? EmptyMap;
        C0261h0 c0261h0 = new C0261h0(4);
        final t1 t1VarU = t1.u();
        String str = (String) arrayList.get(0);
        t1VarU.getClass();
        String strM365 = C0092.m365(f118short, 4, 4, 2606);
        if (str == null || str.isEmpty()) {
            EmptyMap = Collections.emptyMap();
        } else {
            boolean zStartsWith = str.startsWith(C0114.m454(f118short, 8, 4, 1180));
            String strM432 = C0109.m432(f118short, 12, 4, 3087);
            String str2 = zStartsWith ? strM432 : str;
            final String strL = zStartsWith ? t1VarU.l(str) : "";
            List listO = t1VarU.o(str2, strL);
            EmptyMap = new LinkedHashMap();
            t1.a(EmptyMap, strM432, t1VarU.q(str2, strL));
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                final String str3 = (String) ((Map) it.next()).get(C0117.m467(f118short, 16, 4, 2030));
                arrayList2.add(new Callable(t1VarU, str3, strL) { // from class: com.github.catvod.spider.merge.a.m1
                    public final t1 a;
                    public final String b;
                    public final String c;

                    {
                        this.a = t1VarU;
                        this.b = str3;
                        this.c = strL;
                        int iIntValue = ((Integer) C0195.n(18512, null, new Object[0])).intValue();
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
                                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Integer) C0168.n(34494, null, new Object[]{(String) C0152.n(24507, null, new Object[]{(String) C0196.n(67771)})})});
                                    return;
                                case 239:
                                    return;
                                default:
                                    continue;
                            }
                            i = 1678;
                        }
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        String str4 = "ۧۥۨ";
                        String str5 = null;
                        ArrayList arrayList3 = null;
                        Object[] objArr = null;
                        t1 t1Var = null;
                        String str6 = null;
                        Object objN = null;
                        while (true) {
                            switch (C0034.m132(str4)) {
                                case 56574:
                                    str4 = "ۣۣۨ";
                                    t1Var = (t1) objN;
                                    break;
                                case 1746752:
                                    objN = C0196.n(90778, this);
                                    str4 = "ۦ۟ۡ";
                                    break;
                                case 1747655:
                                    str4 = "ۡۤۧ";
                                    break;
                                case 1747773:
                                    str4 = "ۨۨۥ";
                                    arrayList3 = (ArrayList) objN;
                                    break;
                                case 1747842:
                                    objArr[0] = str5;
                                    str4 = "ۣۦ۟";
                                    break;
                                case 1748772:
                                    objN = C0196.n(2398, this);
                                    str4 = "ۣۢۨ";
                                    break;
                                case 1749703:
                                    str4 = "۟ۡۢ";
                                    str5 = (String) objN;
                                    break;
                                case 1750664:
                                    str4 = "۠ۥۧ";
                                    objArr = new Object[2];
                                    break;
                                case 1750748:
                                    objArr[1] = str6;
                                    str4 = "ۦۡۤ";
                                    break;
                                case 1753416:
                                    str4 = "۠ۧۡ";
                                    str6 = (String) objN;
                                    break;
                                case 1753481:
                                    objN = C0196.n(45202, t1Var, objArr);
                                    str4 = "ۣ۠۠";
                                    break;
                                case 1754570:
                                    objN = C0196.n(62012);
                                    str4 = "۠۟ۦ";
                                    break;
                                case 1755621:
                                    return arrayList3;
                                default:
                                    objN = C0196.n(72070, this);
                                    str4 = "ۨۦ";
                                    break;
                            }
                        }
                    }
                });
            }
            ArrayList arrayListA = AbstractC0260h.a(arrayList2, 30);
            int i = 0;
            while (i < listO.size()) {
                t1.a(EmptyMap, (String) ((Map) listO.get(i)).get(strM365), i < arrayListA.size() ? (List) arrayListA.get(i) : null);
                i++;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        str = "";
        for (String str4 : EmptyMap.keySet()) {
            for (Map map : (List) EmptyMap.get(str4)) {
                String str5 = (String) map.get(C0104.m414(f118short, 20, 9, 3246));
                String strM545 = C0137.m545(f118short, 29, 4, 1782);
                String str6 = (String) map.get(strM545);
                if (TextUtils.isEmpty(str5)) {
                    str5 = str6 == null ? "" : str6;
                }
                String str7 = (String) map.get(strM545);
                if (TextUtils.isEmpty(str7)) {
                    str7 = str5 == null ? "" : str5;
                }
                String str8 = (String) map.get(C0082.m325(f118short, 33, 6, 901));
                if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str8)) {
                    j jVar = new j();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str5);
                    String strM10 = C0003.m10(f118short, 39, 2, 2311);
                    sb.append(strM10);
                    sb.append(str8);
                    sb.append(strM10);
                    sb.append(str7);
                    jVar.b = sb.toString();
                    String strM210 = (String) map.get(strM365);
                    if (TextUtils.isEmpty(strM210)) {
                        strM210 = C0053.m210(f118short, 41, 2, 2822);
                    }
                    jVar.a = strM210;
                    arrayList3.add(jVar);
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            String strM427 = C0107.m427(f118short, 43, 15, 1905);
            if (C0299u0.g0(strM427)) {
                t1.u().getClass();
                if (t1.F()) {
                    c0261h0.b(AbstractC0302v0.f1(strM427), arrayList3);
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            String strM529 = C0133.m529(f118short, 58, 12, 2396);
            if (C0299u0.g0(strM529)) {
                c0261h0.b(AbstractC0302v0.f1(strM529), arrayList3);
            }
        }
        S0 s0C = c0261h0.c();
        k kVar = new k();
        kVar.n((String) arrayList.get(0));
        kVar.p(AbstractC0302v0.b2());
        kVar.u("");
        kVar.i(AbstractC0302v0.Y0(C0059.m234(f118short, 70, 6, 1981)));
        kVar.o(str4);
        kVar.l("");
        kVar.q(s0C.b);
        kVar.r(s0C.c);
        return AbstractC0302v0.f(kVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    public static String detailContentVodPlayFrom(int i) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        String strM402 = C0101.m402(f118short, 76, 15, 1151);
        if (C0299u0.g0(strM402)) {
            t1.u().getClass();
            if (t1.F()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(AbstractC0302v0.g1(strM402, i, ""));
        }
        String strM539 = C0135.m539(f118short, 91, 12, 2171);
        if (C0299u0.g0(strM539)) {
            arrayList.add(AbstractC0302v0.g1(strM539, i, ""));
        }
        return AbstractC0302v0.T0(TextUtils.join(C0143.m570(f118short, 103, 3, 2871), arrayList));
    }

    public static String detailContentVodPlayUrl(String str) throws Throwable {
        try {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            k kVarA = a(arrayList);
            return (kVarA == null || kVarA.e() == null) ? "" : kVarA.e();
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder(C0143.m570(f118short, 106, 12, 558)));
            return "";
        }
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0044.m175(f118short, 118, 13, 1151));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$6c1ebb3cb60973b4 = $host$6c1ebb3cb60973b4(list);
            FishCrypto.endHostEntry(null);
            return str$host$6c1ebb3cb60973b4;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public void init(Context context, String str) {
        Init.init(context);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0133.m529(f118short, 131, 13, 918));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$62d5eed2b06b9d14 = $host$62d5eed2b06b9d14(str, str2, list);
            FishCrypto.endHostEntry(null);
            return str$host$62d5eed2b06b9d14;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }
}
