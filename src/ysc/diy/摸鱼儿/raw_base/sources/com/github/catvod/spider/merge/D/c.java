package com.github.catvod.spider.merge.D;

import java.io.PrintStream;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class c {
    public static final boolean a;
    public static /* synthetic */ Class b;

    static {
        try {
            a = System.getProperty("xml.stream.debug") != null;
        } catch (Exception unused) {
        }
    }

    public static void a(String str) {
        if (a) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer("STREAM: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    public static Object b(ClassLoader classLoader, String str) {
        try {
            return (classLoader == null ? Class.forName(str) : classLoader.loadClass(str)).newInstance();
        } catch (ClassNotFoundException e) {
            StringBuffer stringBuffer = new StringBuffer("Provider ");
            stringBuffer.append(str);
            stringBuffer.append(" not found");
            throw new a(stringBuffer.toString(), e);
        } catch (Exception e2) {
            StringBuffer stringBuffer2 = new StringBuffer("Provider ");
            stringBuffer2.append(str);
            stringBuffer2.append(" could not be instantiated: ");
            stringBuffer2.append(e2);
            throw new a(stringBuffer2.toString(), e2);
        }
    }
}
