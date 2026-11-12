package com.github.catvod.spider.merge.f0;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class f implements Cloneable {
    public int d;
    public l a = l.base;
    public Charset b = com.github.catvod.spider.merge.d0.a.a;
    public final ThreadLocal c = new ThreadLocal();
    public final boolean e = true;
    public final int f = 1;
    public final int g = 30;
    public final int h = 1;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        try {
            f fVar = (f) super.clone();
            String strName = this.b.name();
            fVar.getClass();
            fVar.b = Charset.forName(strName);
            fVar.a = l.valueOf(this.a.name());
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final CharsetEncoder b() {
        int i;
        CharsetEncoder charsetEncoderNewEncoder = this.b.newEncoder();
        this.c.set(charsetEncoderNewEncoder);
        String strName = charsetEncoderNewEncoder.charset().name();
        if (strName.equals("US-ASCII")) {
            i = 1;
        } else {
            i = strName.startsWith("UTF-") ? 2 : 3;
        }
        this.d = i;
        return charsetEncoderNewEncoder;
    }
}
