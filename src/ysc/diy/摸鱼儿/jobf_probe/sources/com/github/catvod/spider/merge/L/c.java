package com.github.catvod.spider.merge.L;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class c {
    public static final d a;

    static {
        d dVar = null;
        try {
            dVar = (d) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (dVar == null) {
            dVar = new d();
        }
        a = dVar;
    }
}
