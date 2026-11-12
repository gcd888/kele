package com.github.catvod.spider.merge.f0;

import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class o extends p {
    public Object d;

    public final String A() {
        return c(p());
    }

    public final void B() {
        Object obj = this.d;
        if (obj instanceof b) {
            return;
        }
        b bVar = new b();
        this.d = bVar;
        if (obj != null) {
            bVar.k(p(), (String) obj);
        }
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final String a(String str) {
        B();
        return super.a(str);
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final String c(String str) {
        if (this.d instanceof b) {
            return super.c(str);
        }
        return p().equals(str) ? (String) this.d : "";
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final b d() {
        B();
        return (b) this.d;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final String e() {
        p pVar = this.a;
        return pVar != null ? pVar.e() : "";
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final int f() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final p i(p pVar) {
        o oVar = (o) super.i(pVar);
        Object obj = this.d;
        if (obj instanceof b) {
            oVar.d = ((b) obj).clone();
        }
        return oVar;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final p j() {
        return this;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final List k() {
        return p.c;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final boolean m() {
        return this.d instanceof b;
    }

    public final o z(String str, String str2) {
        if ((this.d instanceof b) || !str.equals("#doctype")) {
            B();
            com.github.catvod.spider.merge.l0.j.a(this);
            String strA = com.github.catvod.spider.merge.l0.i.a(str.trim());
            b bVarD = d();
            int iH = bVarD.h(strA);
            if (iH != -1) {
                bVarD.c[iH] = str2;
                if (!bVarD.b[iH].equals(strA)) {
                    bVarD.b[iH] = strA;
                }
            } else {
                bVarD.a(str2, strA);
            }
        } else {
            this.d = str2;
        }
        return this;
    }
}
