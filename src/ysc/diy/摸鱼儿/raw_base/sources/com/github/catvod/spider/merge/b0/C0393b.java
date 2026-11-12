package com.github.catvod.spider.merge.b0;

import java.text.Format;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0393b {
    public final ConcurrentHashMap a = new ConcurrentHashMap(7);

    static {
        new ConcurrentHashMap(7);
    }

    public final Format a(String str, Locale locale) {
        Objects.requireNonNull(str, new com.github.catvod.spider.merge.Y.d("pattern", new Object[0]));
        TimeZone timeZone = TimeZone.getDefault();
        Locale localeA = com.github.catvod.spider.merge.Y.b.a(locale);
        D d = new D(str, timeZone, localeA);
        ConcurrentHashMap concurrentHashMap = this.a;
        Format format = (Format) concurrentHashMap.get(d);
        if (format != null) {
            return format;
        }
        C0394c c0394c = new C0394c(str, timeZone, localeA);
        Format format2 = (Format) concurrentHashMap.putIfAbsent(d, c0394c);
        return format2 != null ? format2 : c0394c;
    }
}
