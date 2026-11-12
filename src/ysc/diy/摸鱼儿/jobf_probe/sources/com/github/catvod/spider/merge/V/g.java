package com.github.catvod.spider.merge.V;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class g extends com.github.catvod.spider.merge.l0.d {
    public static final g a = new g();

    @Override // com.github.catvod.spider.merge.l0.d
    public final boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // com.github.catvod.spider.merge.l0.d
    public final int b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
