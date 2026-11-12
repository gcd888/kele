package com.github.catvod.spider.merge.b0;

import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class g extends i {
    public static final g b = new g("(Z|(?:[+-]\\d{2}))");
    public static final g c = new g("(Z|(?:[+-]\\d{2}\\d{2}))");
    public static final g d = new g("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

    public g(String str) {
        this.a = Pattern.compile(str);
    }

    @Override // com.github.catvod.spider.merge.b0.i
    public final void c(Calendar calendar, String str) {
        calendar.setTimeZone(C.a(str));
    }
}
