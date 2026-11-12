package com.github.catvod.spider.merge.t0;

import java.io.PrintStream;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class b extends Exception {
    public final Throwable a;

    public b(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        if (this.a == null) {
            super.printStackTrace();
            return;
        }
        PrintStream printStream = System.err;
        synchronized (printStream) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getMessage());
            stringBuffer.append("; nested exception is:");
            printStream.println(stringBuffer.toString());
            this.a.printStackTrace();
        }
    }

    public b(Exception exc) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("");
        stringBuffer.append("");
        StringBuffer stringBuffer2 = new StringBuffer("caused by: ");
        stringBuffer2.append(exc);
        stringBuffer.append(stringBuffer2.toString());
        super(stringBuffer.toString());
        this.a = exc;
    }
}
