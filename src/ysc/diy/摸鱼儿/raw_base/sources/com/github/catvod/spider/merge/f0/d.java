package com.github.catvod.spider.merge.f0;

import java.io.IOException;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class d extends o {
    public d(String str) {
        this.d = str;
    }

    @Override // com.github.catvod.spider.merge.f0.p
    /* JADX INFO: renamed from: clone */
    public final Object h() {
        return (d) super.h();
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final p h() {
        return (d) super.h();
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final String p() {
        return "#comment";
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final void r(Appendable appendable, int i, f fVar) throws IOException {
        if (fVar.e && this.b == 0) {
            p pVar = this.a;
            if ((pVar instanceof k) && ((k) pVar).d.d) {
                p.n(appendable, i, fVar);
            }
        }
        appendable.append("<!--").append(A()).append("-->");
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final void s(Appendable appendable, int i, f fVar) {
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final String toString() {
        return q();
    }
}
