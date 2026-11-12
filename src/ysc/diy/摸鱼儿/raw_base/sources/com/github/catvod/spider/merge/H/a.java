package com.github.catvod.spider.merge.H;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class a {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        com.github.catvod.spider.merge.L.a.b(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (com.github.catvod.spider.merge.L.a.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                com.github.catvod.spider.merge.L.a.c(parameterTypes, "getParameterTypes(...)");
                if (com.github.catvod.spider.merge.L.a.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !com.github.catvod.spider.merge.L.a.a(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
