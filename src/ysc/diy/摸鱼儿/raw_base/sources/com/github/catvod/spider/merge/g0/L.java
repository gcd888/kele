package com.github.catvod.spider.merge.g0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class L extends M {
    public L() {
        this.a = 2;
    }

    @Override // com.github.catvod.spider.merge.g0.M, com.github.catvod.spider.merge.g0.N
    /* JADX INFO: renamed from: p */
    public final M f() {
        super.f();
        this.l = null;
        return this;
    }

    public final String toString() {
        if (!l() || this.l.a <= 0) {
            StringBuilder sb = new StringBuilder("<");
            String str = this.b;
            return com.github.catvod.spider.merge.D.b.m(sb, str != null ? str : "[unset]", ">");
        }
        StringBuilder sb2 = new StringBuilder("<");
        String str2 = this.b;
        sb2.append(str2 != null ? str2 : "[unset]");
        sb2.append(" ");
        sb2.append(this.l.toString());
        sb2.append(">");
        return sb2.toString();
    }
}
