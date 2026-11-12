package com.github.catvod.spider.merge.h0;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class m extends n {
    public final /* synthetic */ int a;
    public final Pattern b;

    public /* synthetic */ m(Pattern pattern, int i) {
        this.a = i;
        this.b = pattern;
    }

    @Override // com.github.catvod.spider.merge.h0.n
    public final boolean a(com.github.catvod.spider.merge.f0.k kVar, com.github.catvod.spider.merge.f0.k kVar2) {
        switch (this.a) {
            case 0:
                return this.b.matcher(kVar2.T()).find();
            case 1:
                return this.b.matcher(kVar2.N()).find();
            case 2:
                return this.b.matcher(kVar2.V()).find();
            default:
                kVar2.getClass();
                StringBuilder sbB = com.github.catvod.spider.merge.e0.b.b();
                com.github.catvod.spider.merge.l0.k.a(new com.github.catvod.spider.merge.f0.i(0, sbB), kVar2);
                return this.b.matcher(com.github.catvod.spider.merge.e0.b.g(sbB)).find();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ":matches(" + this.b + ")";
            case 1:
                return ":matchesOwn(" + this.b + ")";
            case 2:
                return ":matchesWholeOwnText(" + this.b + ")";
            default:
                return ":matchesWholeText(" + this.b + ")";
        }
    }
}
