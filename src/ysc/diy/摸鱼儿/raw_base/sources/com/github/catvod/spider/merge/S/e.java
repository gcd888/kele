package com.github.catvod.spider.merge.S;

import android.os.Handler;
import android.os.Looper;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.T.AbstractC0323h;
import com.github.catvod.spider.merge.T.C0337w;
import com.github.catvod.spider.merge.j0.C0448a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class e implements i {
    public int a;
    public boolean b;
    public final Object c;
    public final Object d;

    public e(com.github.catvod.spider.merge.p018v.d dVar, X1 x1) {
        this.c = dVar;
        this.d = x1;
    }

    @Override // com.github.catvod.spider.merge.S.i
    public int a(int i) {
        return b(i).a;
    }

    public c b(int i) {
        if (this.a == -1) {
            j(0);
            this.a = e(0);
        }
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = (ArrayList) this.d;
        if (i >= 0) {
            int iE = this.a;
            for (int i2 = 1; i2 < i; i2++) {
                int i3 = iE + 1;
                if (j(i3)) {
                    iE = e(i3);
                }
            }
            return (c) arrayList.get(iE);
        }
        int i4 = -i;
        if (i4 == 0) {
            return null;
        }
        int size = this.a;
        if (size - i4 < 0) {
            return null;
        }
        for (int i5 = 1; i5 <= i4 && size > 0; i5++) {
            size--;
            j(size);
            if (size >= ((ArrayList) this.d).size()) {
                size = ((ArrayList) this.d).size() - 1;
            } else {
                while (size >= 0) {
                    c cVar = (c) arrayList.get(size);
                    if (cVar.a == -1 || cVar.d == 0) {
                        break;
                    }
                    size--;
                }
            }
        }
        if (size < 0) {
            return null;
        }
        return (c) arrayList.get(size);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public void c() {
        int i = this.a;
        if (i >= 0) {
            boolean z = this.b;
            ArrayList arrayList = (ArrayList) this.d;
            if (!z ? i >= arrayList.size() : i >= arrayList.size() - 1) {
                if (a(1) == -1) {
                    throw new IllegalStateException("cannot consume EOF");
                }
            }
        } else if (a(1) == -1) {
            throw new IllegalStateException("cannot consume EOF");
        }
        if (j(this.a + 1)) {
            this.a = e(this.a + 1);
        }
    }

    public int d(int i) {
        c cVar;
        int iG;
        if (this.b) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            j jVar = (j) ((s) this.c);
            b bVar = jVar.d;
            if (bVar == null) {
                throw new IllegalStateException("nextToken requires a non-null input stream.");
            }
            while (true) {
                boolean z = jVar.k;
                d dVar = jVar.f;
                if (z) {
                    AbstractC0323h abstractC0323h = jVar.b;
                    int i3 = ((C0337w) abstractC0323h).g;
                    int i4 = ((C0337w) abstractC0323h).f;
                    int i5 = bVar.b;
                    com.github.catvod.spider.merge.V.h hVar = jVar.e;
                    dVar.getClass();
                    cVar = new c(hVar, -1, 0, i5, i5 - 1);
                    cVar.b = i4;
                    cVar.c = i3;
                    jVar.g = cVar;
                    break;
                }
                jVar.g = null;
                jVar.l = 0;
                jVar.h = bVar.b;
                C0337w c0337w = (C0337w) jVar.b;
                jVar.j = c0337w.g;
                jVar.i = c0337w.f;
                while (true) {
                    jVar.m = 0;
                    try {
                        iG = ((C0337w) jVar.b).g(bVar, jVar.o);
                    } catch (k e) {
                        jVar.c(e);
                        if (bVar.a(1) != -1) {
                            ((C0337w) jVar.b).e(bVar);
                        }
                        iG = -3;
                    }
                    if (bVar.a(1) == -1) {
                        jVar.k = true;
                    }
                    if (jVar.m == 0) {
                        jVar.m = iG;
                    }
                    int i6 = jVar.m;
                    if (i6 == -3) {
                        break;
                    }
                    if (i6 != -2) {
                        if (jVar.g == null) {
                            int i7 = jVar.l;
                            int i8 = jVar.h;
                            int i9 = bVar.b - 1;
                            int i10 = jVar.i;
                            int i11 = jVar.j;
                            com.github.catvod.spider.merge.V.h hVar2 = jVar.e;
                            dVar.getClass();
                            c cVar2 = new c(hVar2, i6, i7, i8, i9);
                            cVar2.b = i10;
                            cVar2.c = i11;
                            jVar.g = cVar2;
                        }
                        cVar = jVar.g;
                        break;
                    }
                }
            }
            boolean z2 = cVar instanceof c;
            ArrayList arrayList = (ArrayList) this.d;
            if (z2) {
                cVar.g = arrayList.size();
            }
            arrayList.add(cVar);
            if (cVar.a == -1) {
                this.b = true;
                return i2 + 1;
            }
        }
        return i;
    }

    public int e(int i) {
        j(i);
        if (i >= ((ArrayList) this.d).size()) {
            return ((ArrayList) this.d).size() - 1;
        }
        ArrayList arrayList = (ArrayList) this.d;
        Object obj = arrayList.get(i);
        while (true) {
            c cVar = (c) obj;
            if (cVar.d == 0) {
                return i;
            }
            if (cVar.a == -1) {
                return i;
            }
            i++;
            j(i);
            obj = arrayList.get(i);
        }
    }

    public void f(int i) {
        try {
            C0239a.e().getClass();
            boolean zOptBoolean = true;
            try {
                zOptBoolean = C0239a.j().optBoolean("liveNotify", true);
            } catch (Exception unused) {
            }
            if (zOptBoolean && !((com.github.catvod.spider.merge.p018v.d) this.c).d.isEmpty()) {
                C0239a.e().getClass();
                JSONArray jSONArrayL = C0239a.l();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayL.length(); i2++) {
                    try {
                        JSONObject jSONObject = jSONArrayL.getJSONObject(i2);
                        String strOptString = jSONObject.optString("site");
                        String strOptString2 = jSONObject.optString("roomId");
                        String strOptString3 = jSONObject.optString("userName", "");
                        if (((com.github.catvod.spider.merge.p018v.d) this.c).d.contains(strOptString + "_" + strOptString2)) {
                            if (!strOptString3.isEmpty()) {
                                strOptString2 = strOptString3;
                            }
                            arrayList.add(com.github.catvod.spider.merge.p018v.b.g(strOptString) + " " + strOptString2 + " 正在直播");
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Handler handler = new Handler(Looper.getMainLooper());
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    handler.postDelayed(new com.github.catvod.spider.merge.p018v.f(this, i, (String) arrayList.get(i3), 0), ((long) i3) * 3500);
                }
            }
        } catch (Exception unused3) {
        }
    }

    public synchronized void g(int i, int i2) {
        try {
            InitOrigin.execute(new com.github.catvod.spider.merge.p018v.e(this, i, i2, 0));
        } catch (RuntimeException unused) {
            this.b = false;
        }
    }

    public HashMap h(boolean z) {
        HashMap map = new HashMap();
        boolean z2 = false;
        try {
            C0239a.e().getClass();
            JSONArray jSONArrayL = C0239a.l();
            if (jSONArrayL.length() == 0) {
                ((com.github.catvod.spider.merge.p018v.d) this.c).d = new HashSet();
                return map;
            }
            HashSet hashSet = new HashSet();
            boolean z3 = true;
            for (int i = 0; i < jSONArrayL.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArrayL.getJSONObject(i);
                    String strOptString = jSONObject.optString("site");
                    String strOptString2 = jSONObject.optString("roomId");
                    if (!strOptString.isEmpty() && !strOptString2.isEmpty()) {
                        X1 x1 = (X1) this.d;
                        JSONObject jSONObjectX = x1.x(x1.m("/detail?site=" + strOptString + "&room_id=" + com.github.catvod.spider.merge.p018v.b.f(strOptString2)));
                        JSONObject jSONObjectOptJSONObject = jSONObjectX == null ? null : jSONObjectX.optJSONObject("data");
                        if (jSONObjectOptJSONObject == null) {
                            z3 = false;
                        } else {
                            String str = strOptString + "_" + strOptString2;
                            if (jSONObjectOptJSONObject.optBoolean("status", false)) {
                                hashSet.add(str);
                            }
                            map.put(str, jSONObjectOptJSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (z3 || !z) {
                ((com.github.catvod.spider.merge.p018v.d) this.c).d = hashSet;
            }
            z2 = z3;
            if (z2 || !z) {
                return map;
            }
            return null;
        } catch (Exception unused2) {
        }
    }

    public void i(int i) {
        if (this.a == -1) {
            j(0);
            this.a = e(0);
        }
        this.a = e(i);
    }

    public boolean j(int i) {
        int size = (i - ((ArrayList) this.d).size()) + 1;
        return size <= 0 || d(size) >= size;
    }

    public e(C0448a c0448a) {
        this.d = new ArrayList(100);
        this.a = -1;
        this.c = c0448a;
    }

    public e(String str, LinkedHashMap linkedHashMap, int i, boolean z, JSONObject jSONObject) {
        this.c = str.trim();
        this.d = linkedHashMap;
        this.a = Math.max(0, i);
        this.b = z;
    }
}
