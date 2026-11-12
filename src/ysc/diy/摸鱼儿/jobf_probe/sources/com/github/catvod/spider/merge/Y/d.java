package com.github.catvod.spider.merge.Y;

import java.util.function.Supplier;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class d implements Supplier {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object[] b;

    public /* synthetic */ d(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return String.format(this.a, this.b);
    }
}
