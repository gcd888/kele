package com.github.catvod.spider.merge.p019w;

import com.github.catvod.spider.merge.p000a.C0359j;
import com.github.catvod.spider.merge.p022z.C0586w3;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return ((C0359j) this.b).f();
            default:
                return Boolean.valueOf(!((C0586w3) this.b).d.get());
        }
    }
}
