package com.github.catvod.spider.merge.h0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class b extends c {
    public b(n... nVarArr) {
        List listAsList = Arrays.asList(nVarArr);
        if (this.b > 1) {
            this.a.add(new a(listAsList));
        } else {
            this.a.addAll(listAsList);
        }
        this.b = this.a.size();
    }

    @Override // com.github.catvod.spider.merge.h0.n
    public final boolean a(com.github.catvod.spider.merge.f0.k kVar, com.github.catvod.spider.merge.f0.k kVar2) {
        for (int i = 0; i < this.b; i++) {
            if (((n) this.a.get(i)).a(kVar, kVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.e0.b.f(", ", this.a);
    }

    public b() {
    }
}
