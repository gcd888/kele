package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class XPath extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f108short = {2763, 2759, 2772, 2765, 3001, 2976, 3004, 3005, 3049, 2679, 879, 868, 888, 885, 877, 833, 870, 888, 873, 3012, 3042, 3060, 3043, 3004, 3024, 3062, 3060, 3071, 3045, 2408, 2399, 2396, 2399, 2376, 2399, 2376, 968, 965, 986, 983, 974, 633, 2687, 1132, 1132, 1132, 3070, 3046, 3044, 3057, 3040, 3020, 3041, 3064, 1588, 1580, 1582, 1595, 1578, 1567, 1576, 1586, 2404, 2374, 2387, 2368, 2373, 2373, 2376, 2310, 2332, 2311, 2329, 2313, 2305, 2430, 2368, 2375, 2381, 2374, 2398, 2394, 2313, 2407, 2429, 2313, 2328, 2329, 2311, 2329, 2322, 2313, 2430, 2368, 2375, 2335, 2333, 2322, 2313, 2385, 2335, 2333, 2304, 2313, 2408, 2393, 2393, 2373, 2380, 2430, 2380, 2379, 2402, 2368, 2397, 2310, 2332, 2330, 2334, 2311, 2330, 2335, 2313, 2305, 2402, 2401, 2429, 2404, 2405, 2309, 2313, 2373, 2368, 2370, 2380, 2313, 2414, 2380, 2378, 2370, 2374, 2304, 2313, 2410, 2369, 2395, 2374, 2372, 2380, 2310, 2328, 2331, 2331, 2311, 2329, 2311, 2329, 2311, 2329, 2313, 2426, 2376, 2383, 2376, 2395, 2368, 2310, 2332, 2330, 2334, 2311, 2330, 2335, 2266, 2300, 2282, 2301, 2210, 2254, 2280, 2282, 2273, 2299, 869, 889, 889, 893, 453, 455, 466, 451, 449, 457, 468, 479, 485, 457, 456, 466, 451, 456, 466, 2383, 2382, 2399, 2378, 2370, 2375, 2408, 2372, 2373, 2399, 2382, 2373, 2399, 1202, 1205, 1207, 1215, 1177, 1205, 1204, 1198, 1215, 1204, 1198, 1077, 1065, 1060, 1084, 1056, 1079, 1030, 1066, 1067, 1073, 1056, 1067, 1073, 710, 720, 724, 711, 726, 733, 758, 730, 731, 705, 720, 731, 705};
    public String a = null;
    public com.github.catvod.spider.merge.p014q.a b = null;

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z) throws JSONException {
        String strTrim;
        c();
        if (this.b.h0.isEmpty()) {
            return "";
        }
        String strReplace = this.b.h0.replace("{wd}", URLEncoder.encode(str));
        String strB = b(strReplace);
        ArrayList arrayList = new ArrayList();
        if (this.b.i0.startsWith("json:")) {
            String[] strArrSplit = this.b.i0.substring(5).split(">");
            JSONObject jSONObject = new JSONObject(strB);
            for (int i = 0; i < strArrSplit.length; i++) {
                if (i == strArrSplit.length - 1) {
                    JSONArray jSONArray = jSONObject.getJSONArray(strArrSplit[i]);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        arrayList.add(new k(com.github.catvod.spider.merge.p014q.a.a(jSONObject2.optString(this.b.l0).trim(), this.b.m0), com.github.catvod.spider.merge.p014q.a.a(jSONObject2.optString(this.b.j0).trim(), this.b.k0), AbstractC0309x1.e(strReplace, com.github.catvod.spider.merge.p014q.a.a(jSONObject2.optString(this.b.n0).trim(), this.b.o0)), com.github.catvod.spider.merge.p014q.a.a(jSONObject2.optString(this.b.p0).trim(), this.b.q0)));
                    }
                } else {
                    jSONObject = jSONObject.getJSONObject(strArrSplit[i]);
                }
            }
        } else {
            LinkedList linkedListU = X1.s(strB).U(this.b.i0);
            for (int i3 = 0; i3 < linkedListU.size(); i3++) {
                String strA = com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU.get(i3)).b(this.b.j0).a().trim(), this.b.k0);
                String strA2 = com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU.get(i3)).b(this.b.l0).a().trim(), this.b.m0);
                String strE = AbstractC0309x1.e(strReplace, com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU.get(i3)).b(this.b.n0).a().trim(), this.b.o0));
                if (this.b.A.isEmpty()) {
                    strTrim = "";
                } else {
                    try {
                        strTrim = ((com.github.catvod.spider.merge.i0.a) linkedListU.get(i3)).b(this.b.p0).a().trim();
                        try {
                            strTrim = com.github.catvod.spider.merge.p014q.a.a(strTrim, this.b.q0);
                        } catch (Exception e) {
                            e = e;
                            SpiderDebug.log(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        strTrim = "";
                    }
                }
                arrayList.add(new k(strA2, strA, strE, strTrim));
            }
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (this.b.h.size() > 0) {
            for (String str : this.b.h.keySet()) {
                arrayList2.add(new com.github.catvod.spider.merge.p001b.b((String) this.b.h.get(str), str, null));
            }
        }
        String str2 = this.b.b;
        X1 x1S = X1.s(b(str2));
        if (this.b.h.size() == 0) {
            LinkedList linkedListU = x1S.U(this.b.c);
            for (int i = 0; i < linkedListU.size(); i++) {
                arrayList2.add(new com.github.catvod.spider.merge.p001b.b(com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU.get(i)).b(this.b.f).a().trim(), this.b.g), com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU.get(i)).b(this.b.d).a().trim(), this.b.e), null));
            }
        }
        if (!this.b.j.isEmpty()) {
            LinkedList linkedListU2 = x1S.U(this.b.j);
            for (int i2 = 0; i2 < linkedListU2.size(); i2++) {
                String strA = com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU2.get(i2)).b(this.b.k).a().trim(), this.b.l);
                String strA2 = com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU2.get(i2)).b(this.b.m).a().trim(), this.b.n);
                String strE = AbstractC0309x1.e(str2, com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU2.get(i2)).b(this.b.o).a().trim(), this.b.p));
                String strA3 = "";
                if (!this.b.q.isEmpty()) {
                    try {
                        strA3 = com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU2.get(i2)).b(this.b.q).a().trim(), this.b.r);
                    } catch (Exception e) {
                        SpiderDebug.log(e);
                    }
                }
                arrayList.add(new k(strA2, strA, strE, strA3));
            }
        }
        return com.github.catvod.spider.merge.p001b.g.w(arrayList2, arrayList, this.b.i);
    }

    private /* synthetic */ boolean $host$42ceaa68a95df632(String str) {
        return AbstractC0309x1.j(str);
    }

    private /* synthetic */ boolean $host$53940b53855fde82() {
        return false;
    }

    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) {
        String strReplace = str2;
        AbstractC0280n1.u(str, strReplace);
        c();
        if (!this.b.e0.isEmpty()) {
            strReplace = this.b.e0.replace("{playUrl}", strReplace);
        }
        SpiderDebug.log(strReplace);
        HashMap map = new HashMap();
        if (this.b.f0.length() > 0) {
            map.put("User-Agent", this.b.f0);
        }
        if (this.b.g0.length() > 0) {
            map.put("Referer", this.b.g0);
        }
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.p();
        gVar.C(strReplace);
        gVar.h(map);
        return gVar.r();
    }

    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) {
        String strTrim;
        String strTrim2;
        String strTrim3;
        String strTrim4;
        String strTrim5;
        String strTrim6;
        String strTrim7;
        String strA;
        c();
        String strReplace = this.b.B.replace("{vid}", list.get(0));
        X1 x1S = X1.s(b(strReplace));
        LinkedList linkedListU = x1S.U(this.b.C);
        com.github.catvod.spider.merge.i0.a aVar = linkedListU.size() > 0 ? (com.github.catvod.spider.merge.i0.a) linkedListU.get(0) : null;
        String strA2 = com.github.catvod.spider.merge.p014q.a.a(aVar.b(this.b.D).a().trim(), this.b.E);
        String strE = AbstractC0309x1.e(strReplace, com.github.catvod.spider.merge.p014q.a.a(aVar.b(this.b.F).a().trim(), this.b.G));
        if (this.b.H.isEmpty()) {
            strTrim = "";
        } else {
            try {
                strTrim = aVar.b(this.b.H).a().trim();
                try {
                    strTrim = com.github.catvod.spider.merge.p014q.a.a(strTrim, this.b.I);
                } catch (Exception e) {
                    e = e;
                    SpiderDebug.log(e);
                }
            } catch (Exception e2) {
                e = e2;
                strTrim = "";
            }
        }
        if (this.b.J.isEmpty()) {
            strTrim2 = "";
        } else {
            try {
                strTrim2 = aVar.b(this.b.J).a().trim();
                try {
                    strTrim2 = com.github.catvod.spider.merge.p014q.a.a(strTrim2, this.b.K);
                } catch (Exception e3) {
                    e = e3;
                    SpiderDebug.log(e);
                }
            } catch (Exception e4) {
                e = e4;
                strTrim2 = "";
            }
        }
        if (this.b.L.isEmpty()) {
            strTrim3 = "";
        } else {
            try {
                strTrim3 = aVar.b(this.b.L).a().trim();
                try {
                    strTrim3 = com.github.catvod.spider.merge.p014q.a.a(strTrim3, this.b.M);
                } catch (Exception e5) {
                    e = e5;
                    SpiderDebug.log(e);
                }
            } catch (Exception e6) {
                e = e6;
                strTrim3 = "";
            }
        }
        if (this.b.N.isEmpty()) {
            strTrim4 = "";
        } else {
            try {
                strTrim4 = aVar.b(this.b.N).a().trim();
                try {
                    strTrim4 = com.github.catvod.spider.merge.p014q.a.a(strTrim4, this.b.O);
                } catch (Exception e7) {
                    e = e7;
                    SpiderDebug.log(e);
                }
            } catch (Exception e8) {
                e = e8;
                strTrim4 = "";
            }
        }
        if (this.b.P.isEmpty()) {
            strTrim5 = "";
        } else {
            try {
                strTrim5 = aVar.b(this.b.P).a().trim();
                try {
                    strTrim5 = com.github.catvod.spider.merge.p014q.a.a(strTrim5, this.b.Q);
                } catch (Exception e9) {
                    e = e9;
                    SpiderDebug.log(e);
                }
            } catch (Exception e10) {
                e = e10;
                strTrim5 = "";
            }
        }
        if (this.b.R.isEmpty()) {
            strTrim6 = "";
        } else {
            try {
                strTrim6 = aVar.b(this.b.R).a().trim();
                try {
                    strTrim6 = com.github.catvod.spider.merge.p014q.a.a(strTrim6, this.b.S);
                } catch (Exception e11) {
                    e = e11;
                    SpiderDebug.log(e);
                }
            } catch (Exception e12) {
                e = e12;
                strTrim6 = "";
            }
        }
        if (this.b.T.isEmpty()) {
            strA = "";
        } else {
            try {
                strTrim7 = aVar.b(this.b.T).a().trim();
                try {
                    strA = com.github.catvod.spider.merge.p014q.a.a(strTrim7, this.b.U);
                } catch (Exception e13) {
                    e = e13;
                    SpiderDebug.log(e);
                    strA = strTrim7;
                }
            } catch (Exception e14) {
                e = e14;
                strTrim7 = "";
            }
        }
        k kVar = new k();
        kVar.n(list.get(0));
        kVar.o(strA2);
        kVar.p(strE);
        kVar.i(strTrim);
        kVar.u(strTrim2);
        kVar.k(strTrim3);
        kVar.s(strTrim4);
        kVar.j(strTrim5);
        kVar.m(strTrim6);
        kVar.l(strA);
        ArrayList arrayList = new ArrayList();
        LinkedList linkedListU2 = x1S.U(this.b.V);
        for (int i = 0; i < linkedListU2.size(); i++) {
            arrayList.add(com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU2.get(i)).b(this.b.W).a().trim(), this.b.X));
        }
        ArrayList arrayList2 = new ArrayList();
        LinkedList linkedListU3 = x1S.U(this.b.Y);
        for (int i2 = 0; i2 < linkedListU3.size(); i2++) {
            com.github.catvod.spider.merge.i0.a aVar2 = (com.github.catvod.spider.merge.i0.a) linkedListU3.get(i2);
            String str = this.b.Z;
            Object obj = aVar2.a;
            LinkedList linkedListU4 = obj instanceof com.github.catvod.spider.merge.f0.k ? new X1(5, new com.github.catvod.spider.merge.h0.d((com.github.catvod.spider.merge.f0.k) obj)).U(str) : null;
            ArrayList arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < linkedListU4.size(); i3++) {
                arrayList3.add(com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU4.get(i3)).b(this.b.c0).a().trim(), this.b.d0) + "$" + com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU4.get(i3)).b(this.b.a0).a().trim(), this.b.b0));
            }
            if (arrayList3.size() == 0 && arrayList.size() > i2) {
                arrayList.set(i2, "");
            }
            arrayList2.add(TextUtils.join("#", arrayList3));
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((String) arrayList.get(size)).isEmpty()) {
                arrayList.remove(size);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (((String) arrayList2.get(size2)).isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            if (size3 >= arrayList.size()) {
                arrayList2.remove(size3);
            }
        }
        String strM75 = "$$$";
        kVar.q(TextUtils.join(strM75, arrayList));
        kVar.r(TextUtils.join(strM75, arrayList2));
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z, HashMap<String, String> map) {
        c();
        ArrayList arrayList = new ArrayList();
        String strA = a(str, str2, z, map);
        LinkedList linkedListU = X1.s(b(strA)).U(this.b.t);
        for (int i = 0; i < linkedListU.size(); i++) {
            String strA2 = com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU.get(i)).b(this.b.u).a().trim(), this.b.v);
            String strA3 = com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU.get(i)).b(this.b.w).a().trim(), this.b.x);
            String strE = AbstractC0309x1.e(strA, com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU.get(i)).b(this.b.y).a().trim(), this.b.z));
            String strA4 = "";
            if (!this.b.A.isEmpty()) {
                try {
                    strA4 = com.github.catvod.spider.merge.p014q.a.a(((com.github.catvod.spider.merge.i0.a) linkedListU.get(i)).b(this.b.A).a().trim(), this.b.v);
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
            }
            arrayList.add(new k(strA3, strA2, strE, strA4));
        }
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    public String a(String str, String str2, boolean z, HashMap map) {
        return this.b.s.replace("{cateId}", str).replace("{catePg}", str2);
    }

    public final String b(String str) {
        SpiderDebug.log(str);
        HashMap map = new HashMap();
        map.put("User-Agent", this.b.a.isEmpty() ? "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36" : this.b.a);
        return X1.X(str, null, map);
    }

    public final void c() {
        String str;
        if (this.b != null || (str = this.a) == null) {
            return;
        }
        if (!str.startsWith("http")) {
            this.b = com.github.catvod.spider.merge.p014q.a.b(this.a);
            d(this.a);
        } else {
            String strX = X1.X(this.a, null, null);
            this.b = com.github.catvod.spider.merge.p014q.a.b(strX);
            d(strX);
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "categoryContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$f9d7235748f992e0 = $host$f9d7235748f992e0(str, str2, z, map);
            FishCrypto.endHostEntry(null);
            return str$host$f9d7235748f992e0;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public void d(String str) {
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "detailContent");
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

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "homeContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$1b26b551389a5dab = $host$1b26b551389a5dab(z);
            FishCrypto.endHostEntry(null);
            return str$host$1b26b551389a5dab;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public void init(Context context, String str) {
        Init.init(context);
        this.a = str;
    }

    public boolean isVideoFormat(String str) {
        if (FishCrypto.businessReady()) {
            return $host$42ceaa68a95df632(str);
        }
        return false;
    }

    public boolean manualVideoCheck() {
        if (FishCrypto.businessReady()) {
            return $host$53940b53855fde82();
        }
        return false;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "playerContent");
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

    public String searchContent(String str, boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "searchContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$0b14bd34f5ca9ec8 = $host$0b14bd34f5ca9ec8(str, z);
            FishCrypto.endHostEntry(null);
            return str$host$0b14bd34f5ca9ec8;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }
}
