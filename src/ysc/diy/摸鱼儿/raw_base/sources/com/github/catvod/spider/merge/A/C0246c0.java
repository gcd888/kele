package com.github.catvod.spider.merge.A;

import android.app.AlertDialog;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.p022z.C0559r1;
import com.github.catvod.spider.merge.p022z.InterfaceC0545o1;
import com.github.catvod.spider.merge.p022z.InterfaceC0573u0;
import com.github.catvod.spider.merge.p022z.RunnableC0480b1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0246c0 implements com.github.catvod.spider.merge.p000a.H, com.github.catvod.spider.merge.h0.o, com.github.catvod.spider.merge.q0.a, InterfaceC0573u0 {
    public Object a;
    public Object b;
    public final Object c;

    public /* synthetic */ C0246c0(Object obj, Object obj2, Serializable serializable) {
        this.c = obj;
        this.a = obj2;
        this.b = serializable;
    }

    public static String b(int i) {
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.o(i, i, 0, 0);
        gVar.F(new ArrayList());
        return gVar.r();
    }

    @Override // com.github.catvod.spider.merge.q0.a
    public void a(String str, Exception exc) {
        com.github.catvod.spider.merge.r0.a aVar = new com.github.catvod.spider.merge.r0.a();
        System.currentTimeMillis();
        aVar.a = (com.github.catvod.spider.merge.s0.c) this.a;
        Thread.currentThread().getName();
        ((Queue) this.c).add(aVar);
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0573u0
    public void c(int i, int i2) {
        List list = (List) this.a;
        String[] strArr = (String[]) list.get(i);
        list.set(i, (String[]) list.get(i2));
        list.set(i2, strArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((String[]) it.next())[0]);
        }
        C0559r1 c0559r1 = (C0559r1) this.c;
        ((InterfaceC0545o1) c0559r1.a).setCategoryOrder(arrayList);
        AlertDialog alertDialog = ((AlertDialog[]) this.b)[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        InitOrigin.run(new RunnableC0480b1(c0559r1, 0));
    }

    @Override // com.github.catvod.spider.merge.h0.o
    public void d(com.github.catvod.spider.merge.f0.p pVar, int i) {
        if (pVar instanceof com.github.catvod.spider.merge.f0.k) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) pVar;
            if (((com.github.catvod.spider.merge.h0.n) this.c).a((com.github.catvod.spider.merge.f0.k) this.a, kVar)) {
                ((com.github.catvod.spider.merge.h0.d) this.b).add(kVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public com.github.catvod.spider.merge.f0.k e(com.github.catvod.spider.merge.f0.k kVar, com.github.catvod.spider.merge.f0.k kVar2) {
        char c;
        this.a = kVar;
        this.b = null;
        com.github.catvod.spider.merge.f0.p pVar = kVar2;
        int i = 0;
        while (pVar != null) {
            char c2 = 1;
            if (pVar instanceof com.github.catvod.spider.merge.f0.k) {
                com.github.catvod.spider.merge.f0.k kVar3 = (com.github.catvod.spider.merge.f0.k) pVar;
                if (((com.github.catvod.spider.merge.h0.n) this.c).a((com.github.catvod.spider.merge.f0.k) this.a, kVar3)) {
                    this.b = kVar3;
                    c = 5;
                } else {
                    c = 1;
                }
            } else {
                c = 1;
            }
            if (c == 5) {
                break;
            }
            if (c != 1 || pVar.f() <= 0) {
                while (pVar.o() == null && i > 0) {
                    if (c == 1 || c == 2) {
                        c = 1;
                    }
                    com.github.catvod.spider.merge.f0.p pVar2 = pVar.a;
                    i--;
                    if (c == 4) {
                        pVar.w();
                    }
                    pVar = pVar2;
                    c = 1;
                }
                if (c != 1 && c != 2) {
                    c2 = c;
                }
                if (pVar == kVar2) {
                    break;
                }
                com.github.catvod.spider.merge.f0.p pVarO = pVar.o();
                if (c2 == 4) {
                    pVar.w();
                }
                pVar = pVarO;
            } else {
                pVar = (com.github.catvod.spider.merge.f0.p) pVar.k().get(0);
                i++;
            }
        }
        return (com.github.catvod.spider.merge.f0.k) this.b;
    }

    @Override // com.github.catvod.spider.merge.h0.o
    public void f(com.github.catvod.spider.merge.f0.p pVar, int i) {
    }

    public JSONArray g(String str) {
        JSONArray jSONArray;
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.github.catvod.spider.merge.p018v.d dVar = (com.github.catvod.spider.merge.p018v.d) this.a;
        synchronized (dVar.k) {
            try {
                jSONArray = (JSONArray) dVar.k.get(str);
                Long l = (Long) dVar.l.get(str);
                if (jSONArray == null || l == null || jCurrentTimeMillis - l.longValue() >= 300000) {
                    jSONArray = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jSONArray != null) {
            return jSONArray;
        }
        try {
            X1 x1 = (X1) this.b;
            JSONObject jSONObjectX = x1.x(x1.m("/categories?site=" + str));
            JSONArray jSONArrayOptJSONArray = jSONObjectX != null ? jSONObjectX.optJSONArray("data") : null;
            if (jSONArrayOptJSONArray != null) {
                ((com.github.catvod.spider.merge.p018v.d) this.a).a(str, jSONArrayOptJSONArray, jCurrentTimeMillis);
            }
            return jSONArrayOptJSONArray;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.github.catvod.spider.merge.q0.a
    public String getName() {
        return (String) this.b;
    }

    public void h() {
        ((C0252e0) this.c).i.post(new r(this, (String) this.b, (boolean[]) this.a, 6));
    }

    public void i() {
        ((C0252e0) this.c).i.post(new RunnableC0242b(this, (boolean[]) this.a, 3));
    }

    public void j(String str, ArrayList arrayList) {
        ((C0252e0) this.c).i.post(new RunnableC0240a0(this, str, arrayList, (boolean[]) this.a, 0));
    }

    public String k(int i, String str) {
        if (!com.github.catvod.spider.merge.p018v.b.i(str)) {
            return b(i);
        }
        X1 x1 = (X1) this.b;
        JSONObject jSONObjectX = x1.x(x1.m("/recommend?site=" + str + "&page=" + i));
        JSONObject jSONObjectOptJSONObject = jSONObjectX != null ? jSONObjectX.optJSONObject("data") : null;
        boolean z = jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("has_more", false);
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("items") : null;
        ArrayList arrayList = new ArrayList();
        if (i <= 1) {
            try {
                JSONArray jSONArrayG = g(str);
                if (jSONArrayG != null && jSONArrayG.length() != 0) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < jSONArrayG.length() && i2 < 24; i3++) {
                        JSONObject jSONObject = jSONArrayG.getJSONObject(i3);
                        String strOptString = jSONObject.optString("name");
                        String strOptString2 = jSONObject.optString("id");
                        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("children");
                        if (!strOptString2.isEmpty() && !strOptString.isEmpty() && jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0) {
                            arrayList.add(com.github.catvod.spider.merge.p018v.b.b(jSONArrayOptJSONArray2.length(), str, strOptString2, strOptString));
                            i2++;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (jSONArrayOptJSONArray != null) {
            int iMin = i <= 1 ? Math.min(jSONArrayOptJSONArray.length(), 18) : jSONArrayOptJSONArray.length();
            for (int i4 = 0; i4 < iMin; i4++) {
                arrayList.add(com.github.catvod.spider.merge.p018v.b.l(str, jSONArrayOptJSONArray.getJSONObject(i4)));
            }
        }
        int i5 = z ? i + 1 : i;
        com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
        gVar.o(i, i5, arrayList.size(), arrayList.size());
        gVar.F(arrayList);
        return gVar.r();
    }

    public /* synthetic */ C0246c0(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public C0246c0(com.github.catvod.spider.merge.s0.c cVar, LinkedBlockingQueue linkedBlockingQueue) {
        this.a = cVar;
        this.b = cVar.a;
        this.c = linkedBlockingQueue;
    }

    public C0246c0(com.github.catvod.spider.merge.h0.n nVar) {
        this.a = null;
        this.b = null;
        this.c = nVar;
    }
}
