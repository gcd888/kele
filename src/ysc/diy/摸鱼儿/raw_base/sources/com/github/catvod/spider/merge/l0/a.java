package com.github.catvod.spider.merge.l0;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.Response;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class a {
    public static final void a(Response response, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (response != null) {
            if (th == null) {
                response.close();
                return;
            }
            try {
                response.close();
            } catch (Throwable th2) {
                if (th != th2) {
                    Integer num = com.github.catvod.spider.merge.I.a.a;
                    if (num == null || num.intValue() >= 19) {
                        th.addSuppressed(th2);
                        return;
                    }
                    Method method = com.github.catvod.spider.merge.H.a.a;
                    if (method != null) {
                        method.invoke(th, th2);
                    }
                }
            }
        }
    }
}
