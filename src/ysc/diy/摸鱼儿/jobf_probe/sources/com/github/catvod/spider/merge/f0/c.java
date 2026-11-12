package com.github.catvod.spider.merge.f0;

import java.io.IOException;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class c extends r {
    public c(String str) {
        super(str);
    }

    @Override // com.github.catvod.spider.merge.f0.r
    /* JADX INFO: renamed from: C */
    public final r h() {
        return (c) super.h();
    }

    @Override // com.github.catvod.spider.merge.f0.r, com.github.catvod.spider.merge.f0.p
    /* JADX INFO: renamed from: clone */
    public final Object h() {
        return (c) super.h();
    }

    @Override // com.github.catvod.spider.merge.f0.r, com.github.catvod.spider.merge.f0.p
    public final p h() {
        return (c) super.h();
    }

    @Override // com.github.catvod.spider.merge.f0.r, com.github.catvod.spider.merge.f0.p
    public final String p() {
        return "#cdata";
    }

    @Override // com.github.catvod.spider.merge.f0.r, com.github.catvod.spider.merge.f0.p
    public final void r(Appendable appendable, int i, f fVar) throws IOException {
        appendable.append("<![CDATA[").append(A());
    }

    @Override // com.github.catvod.spider.merge.f0.r, com.github.catvod.spider.merge.f0.p
    public final void s(Appendable appendable, int i, f fVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.c0.a(e);
        }
    }
}
