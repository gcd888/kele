package com.github.catvod.spider.merge.b0;

import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class w {
    public final TimeZone a;
    public final int b;
    public final Locale c;

    public w(TimeZone timeZone, boolean z, int i, Locale locale) {
        this.a = timeZone;
        if (z) {
            this.b = Integer.MIN_VALUE | i;
        } else {
            this.b = i;
        }
        this.c = com.github.catvod.spider.merge.Y.b.a(locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a.equals(wVar.a) && this.b == wVar.b && this.c.equals(wVar.c);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.c.hashCode() + (this.b * 31)) * 31);
    }
}
