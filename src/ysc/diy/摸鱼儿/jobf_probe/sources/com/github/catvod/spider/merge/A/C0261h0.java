package com.github.catvod.spider.merge.A;

import android.text.TextUtils;
import com.github.catvod.spider.InitOrigin;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0261h0 implements com.github.catvod.spider.merge.h0.o {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ C0261h0(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public static C0261h0 e(JSONObject jSONObject) {
        C0261h0 c0261h0 = new C0261h0(3);
        Object objOpt = jSONObject.opt("url");
        if (objOpt == null) {
            objOpt = jSONObject.opt("api");
        }
        if (objOpt instanceof String) {
            c0261h0.a((String) objOpt);
        }
        Object objOpt2 = jSONObject.opt("endpoints");
        boolean z = objOpt2 instanceof JSONArray;
        ArrayList arrayList = (ArrayList) c0261h0.b;
        if (z) {
            arrayList.clear();
            JSONArray jSONArray = (JSONArray) objOpt2;
            for (int i = 0; i < jSONArray.length(); i++) {
                c0261h0.a(jSONArray.optString(i, ""));
            }
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("bridge");
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString("url", "");
            if (!strOptString.isEmpty()) {
                arrayList.clear();
                c0261h0.a(strOptString);
            }
        }
        String strOptString2 = jSONObject.optString("cookie_storage_key", "fanshu_app_cookie_v1");
        if (strOptString2 != null && !strOptString2.trim().isEmpty()) {
            c0261h0.c = strOptString2.trim();
        }
        return c0261h0;
    }

    public static String h(com.github.catvod.spider.merge.U.d dVar) {
        int i = dVar.a;
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.d ? ":" : "");
        sb.append("s");
        sb.append(i);
        sb.append(dVar.g ? "^" : "");
        String string = sb.toString();
        if (!dVar.d) {
            return string;
        }
        if (dVar.h != null) {
            StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(string, "=>");
            sbP.append(Arrays.toString(dVar.h));
            return sbP.toString();
        }
        StringBuilder sbP2 = com.github.catvod.spider.merge.D.b.p(string, "=>");
        sbP2.append(dVar.e);
        return sbP2.toString();
    }

    public void a(String str) {
        String strF = com.github.catvod.spider.merge.p000a.T.f(str);
        while (strF.endsWith("/")) {
            strF = com.github.catvod.spider.merge.D.b.g(strF, 1, 0);
        }
        if (strF.isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.contains(strF)) {
            return;
        }
        arrayList.add(strF);
    }

    public void b(String str, ArrayList arrayList) {
        ((ArrayList) this.b).add(str);
        ArrayList arrayList2 = (ArrayList) this.c;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.p001b.j jVar = (com.github.catvod.spider.merge.p001b.j) it.next();
            arrayList3.add(jVar.a.replace("m3u8", "") + '$' + jVar.b);
        }
        arrayList2.add(TextUtils.join("#", arrayList3));
    }

    public S0 c() {
        S0 s0 = new S0();
        s0.b = TextUtils.join("$$$", (ArrayList) this.b);
        s0.c = TextUtils.join("$$$", (ArrayList) this.c);
        return s0;
    }

    @Override // com.github.catvod.spider.merge.h0.o
    public void d(com.github.catvod.spider.merge.f0.p pVar, int i) {
        try {
            pVar.r((Appendable) this.b, i, (com.github.catvod.spider.merge.f0.f) this.c);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.c0.a(e);
        }
    }

    @Override // com.github.catvod.spider.merge.h0.o
    public void f(com.github.catvod.spider.merge.f0.p pVar, int i) {
        if (pVar.p().equals("#text")) {
            return;
        }
        try {
            pVar.s((Appendable) this.b, i, (com.github.catvod.spider.merge.f0.f) this.c);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.c0.a(e);
        }
    }

    public String g() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return "";
        }
        if (arrayList.size() == 1) {
            try {
                String host = new URL((String) arrayList.get(0)).getHost();
                String[] strArrSplit = host.split("\\.");
                return strArrSplit.length >= 2 ? strArrSplit[strArrSplit.length - 2] : host;
            } catch (Exception unused) {
                return "";
            }
        }
        return arrayList.size() + "源合并";
    }

    public void i(String str) {
        int i = 12;
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 1;
        int i6 = 0;
        str.getClass();
        switch (str) {
            case "exclude":
            case "keywords":
            case "include":
                InitOrigin.run(new com.github.catvod.spider.merge.p020x.a(this, i));
                break;
            case "filter":
                InitOrigin.run(new com.github.catvod.spider.merge.p020x.a(this, i6));
                break;
            case "max":
                InitOrigin.run(new com.github.catvod.spider.merge.p020x.a(this, i2));
                break;
            case "help":
                InitOrigin.run(new com.github.catvod.spider.merge.p020x.a(this, i5));
                break;
            case "site":
                InitOrigin.run(new com.github.catvod.spider.merge.p020x.a(this, 13));
                break;
            case "check":
                InitOrigin.run(new com.github.catvod.spider.merge.p020x.a(this, 17));
                break;
            case "order":
                InitOrigin.run(new com.github.catvod.spider.merge.p020x.a(this, i3));
                break;
            case "reset":
                InitOrigin.run(new com.github.catvod.spider.merge.p020x.a(this, i4));
                break;
            case "channels":
                InitOrigin.run(new com.github.catvod.spider.merge.p020x.a(this, 15));
                break;
            case "display":
                InitOrigin.run(new com.github.catvod.spider.merge.p020x.a(this, 16));
                break;
            case "strategy":
                InitOrigin.run(new com.github.catvod.spider.merge.p020x.a(this, 14));
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                if (((com.github.catvod.spider.merge.U.b) this.b).b == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                com.github.catvod.spider.merge.U.b bVar = (com.github.catvod.spider.merge.U.b) this.b;
                bVar.getClass();
                ArrayList<com.github.catvod.spider.merge.U.d> arrayList = new ArrayList(bVar.a.keySet());
                Collections.sort(arrayList, new com.github.catvod.spider.merge.U.a(0));
                for (com.github.catvod.spider.merge.U.d dVar : arrayList) {
                    com.github.catvod.spider.merge.U.d[] dVarArr = dVar.c;
                    int length = dVarArr != null ? dVarArr.length : 0;
                    for (int i = 0; i < length; i++) {
                        com.github.catvod.spider.merge.U.d dVar2 = dVar.c[i];
                        if (dVar2 != null && dVar2.a != Integer.MAX_VALUE) {
                            sb.append(h(dVar));
                            String strA = ((com.github.catvod.spider.merge.S.u) ((com.github.catvod.spider.merge.S.t) this.c)).a(i - 1);
                            sb.append("-");
                            sb.append(strA);
                            sb.append("->");
                            sb.append(h(dVar2));
                            sb.append('\n');
                        }
                    }
                }
                String string = sb.toString();
                if (string.length() == 0) {
                    return null;
                }
                return string;
            default:
                return super.toString();
        }
    }

    public C0261h0(com.github.catvod.spider.merge.p020x.b bVar, int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.c = new ArrayList();
                this.b = bVar;
                break;
            default:
                X1 x1 = new X1(10, this);
                this.b = bVar;
                this.c = new com.github.catvod.spider.merge.p022z.K1(x1);
                break;
        }
    }

    public C0261h0(X1 x1) {
        this.a = 6;
        this.c = new HashMap();
        this.b = x1;
    }

    public C0261h0(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = new ArrayList();
                this.c = new ArrayList();
                break;
            default:
                this.b = new ArrayList();
                this.c = "fanshu_app_cookie_v1";
                break;
        }
    }

    public C0261h0(C0261h0 c0261h0) {
        this.a = 3;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = "fanshu_app_cookie_v1";
        arrayList.addAll((ArrayList) c0261h0.b);
        this.c = (String) c0261h0.c;
    }

    public C0261h0(Matcher matcher, String str) {
        this.a = 1;
        this.b = matcher;
    }

    public C0261h0(StringBuilder sb, com.github.catvod.spider.merge.f0.f fVar) {
        this.a = 5;
        this.b = sb;
        this.c = fVar;
        fVar.b();
    }
}
