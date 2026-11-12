package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.T.AbstractC0323h;
import com.github.catvod.spider.merge.j0.A;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class n extends r {
    public g d = new g();
    public final e e;
    public final com.github.catvod.spider.merge.V.d f;
    public o g;
    public final boolean h;
    public final ArrayList i;
    public boolean j;

    static {
        new WeakHashMap();
    }

    public n(e eVar) {
        com.github.catvod.spider.merge.V.d dVar = new com.github.catvod.spider.merge.V.d();
        this.f = dVar;
        dVar.a(0);
        this.h = true;
        this.e = null;
        this.d.b();
        this.g = null;
        this.j = false;
        ArrayList arrayList = this.i;
        if (arrayList != null && arrayList.remove((Object) null) && this.i.isEmpty()) {
            this.i = null;
        }
        Arrays.fill(dVar.a, 0, dVar.b, 0);
        dVar.b = 0;
        dVar.a(0);
        AbstractC0323h abstractC0323h = this.b;
        if (abstractC0323h != null) {
            abstractC0323h.a();
        }
        this.e = eVar;
    }

    @Override // com.github.catvod.spider.merge.S.r
    public final boolean b(int i) {
        com.github.catvod.spider.merge.V.d dVar = this.f;
        int i2 = dVar.b;
        int i3 = i2 - 1;
        if (i3 < 0 || i3 >= i2) {
            throw new IndexOutOfBoundsException();
        }
        return i >= dVar.a[i3];
    }

    public final void c() {
        c cVarG = g();
        if (cVarG.a != -1) {
            this.e.c();
        }
        ArrayList arrayList = this.i;
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (this.h || z) {
            if (this.d.a) {
                o oVar = this.g;
                com.github.catvod.spider.merge.W.a aVar = new com.github.catvod.spider.merge.W.a(cVarG);
                oVar.getClass();
                oVar.b(aVar);
                ArrayList arrayList2 = this.i;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((m) it.next()).getClass();
                    }
                    return;
                }
                return;
            }
            o oVar2 = this.g;
            com.github.catvod.spider.merge.W.c cVar = new com.github.catvod.spider.merge.W.c(cVarG);
            oVar2.getClass();
            oVar2.b(cVar);
            ArrayList arrayList3 = this.i;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    ((m) it2.next()).getClass();
                    Objects.toString(cVar.a);
                    throw null;
                }
            }
        }
    }

    public final void d(o oVar) {
        o oVar2;
        o oVar3;
        if (this.h && (oVar2 = this.g) != oVar && (oVar3 = oVar2.a) != null) {
            ArrayList arrayList = oVar3.c;
            if (arrayList != null) {
                arrayList.remove(arrayList.size() - 1);
            }
            oVar3.b(oVar);
        }
        this.g = oVar;
    }

    public final void e(int i, o oVar) {
        o oVar2;
        o oVar3;
        this.c = i;
        this.g = oVar;
        this.e.b(1);
        if (this.h && (oVar3 = (oVar2 = this.g).a) != null) {
            oVar3.b(oVar2);
        }
        ArrayList arrayList = this.i;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    public final void f() {
        int size;
        if (this.j) {
            o oVar = this.g;
            this.e.b(1);
            oVar.getClass();
        } else {
            o oVar2 = this.g;
            this.e.b(-1);
            oVar2.getClass();
        }
        ArrayList arrayList = this.i;
        if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
            this.g.getClass();
            throw null;
        }
        o oVar3 = this.g;
        this.c = oVar3.b;
        this.g = oVar3.a;
    }

    public final c g() {
        return this.e.b(1);
    }

    public final com.github.catvod.spider.merge.V.f h() {
        return A.o.b(this.c, this.g);
    }

    public final c i(int i) {
        c cVarG = g();
        if (cVarG.a == i) {
            if (i == -1) {
                this.j = true;
            }
            this.d.b();
            c();
        } else {
            cVarG = this.d.g(this);
            if (this.h && cVarG.g == -1) {
                o oVar = this.g;
                com.github.catvod.spider.merge.W.a aVar = new com.github.catvod.spider.merge.W.a(cVarG);
                oVar.getClass();
                oVar.b(aVar);
            }
        }
        return cVarG;
    }

    public final void j(c cVar, String str, p pVar) {
        int i = cVar.b;
        int i2 = cVar.c;
        q qVar = this.a;
        if (qVar == null) {
            throw new NullPointerException("delegates");
        }
        Iterator<E> it = qVar.iterator();
        while (it.hasNext()) {
            ((f) it.next()).d(this, cVar, i, i2, str, pVar);
        }
    }
}
