package com.github.catvod.spider.merge.S;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class o implements com.github.catvod.spider.merge.W.b {
    public static final o d = new o();
    public final o a;
    public final int b;
    public ArrayList c;

    public o() {
        this.b = -1;
    }

    @Override // com.github.catvod.spider.merge.W.b
    public Object a(com.github.catvod.spider.merge.k0.c cVar) {
        return cVar.d(this);
    }

    public final void b(com.github.catvod.spider.merge.W.b bVar) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(bVar);
    }

    public final com.github.catvod.spider.merge.W.b c(int i) {
        ArrayList arrayList = this.c;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (com.github.catvod.spider.merge.W.b) this.c.get(i);
    }

    public final int d() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final o e(Class cls) {
        ArrayList arrayList = this.c;
        com.github.catvod.spider.merge.W.b bVar = null;
        if (arrayList != null && arrayList.size() > 0) {
            for (com.github.catvod.spider.merge.W.b bVar2 : this.c) {
                if (cls.isInstance(bVar2)) {
                    bVar = (com.github.catvod.spider.merge.W.b) cls.cast(bVar2);
                    break;
                }
            }
        }
        return (o) bVar;
    }

    public final List f(Class cls) {
        ArrayList<com.github.catvod.spider.merge.W.b> arrayList = this.c;
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = null;
        for (com.github.catvod.spider.merge.W.b bVar : arrayList) {
            if (cls.isInstance(bVar)) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(cls.cast(bVar));
            }
        }
        return arrayList2 == null ? Collections.emptyList() : arrayList2;
    }

    public final com.github.catvod.spider.merge.W.c g(int i) {
        ArrayList arrayList = this.c;
        if (arrayList != null && arrayList.size() > 0) {
            for (com.github.catvod.spider.merge.W.b bVar : this.c) {
                if (bVar instanceof com.github.catvod.spider.merge.W.c) {
                    com.github.catvod.spider.merge.W.c cVar = (com.github.catvod.spider.merge.W.c) bVar;
                    if (cVar.a.a == i) {
                        return cVar;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.W.b
    public final String getText() {
        if (d() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < d(); i++) {
            sb.append(c(i).getText());
        }
        return sb.toString();
    }

    public final boolean h() {
        return this.b == -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        o oVar = this;
        while (oVar != null) {
            if (!oVar.h()) {
                sb.append(oVar.b);
            }
            oVar = oVar.a;
            if (oVar != null && !oVar.h()) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public o(int i, o oVar) {
        this.a = oVar;
        this.b = i;
    }
}
