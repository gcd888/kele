package com.github.catvod.spider.merge.L;

import java.io.Serializable;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class b implements Serializable {
    public final String toString() {
        c.a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        a.c(string, "renderLambdaToString(...)");
        return string;
    }
}
