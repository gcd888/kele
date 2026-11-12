package com.github.catvod.spider.merge.s0;

import java.io.PrintStream;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class f {
    public static e a;
    public static boolean b;

    public static final void a(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void b(String str, Throwable th) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th.printStackTrace();
    }
}
