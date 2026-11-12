package com.github.catvod.spider.merge.b0;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class x implements t {
    public final Locale a;
    public final int b;
    public final String c;
    public final String d;

    public x(TimeZone timeZone, Locale locale, int i) {
        this.a = com.github.catvod.spider.merge.Y.b.a(locale);
        this.b = i;
        this.c = B.c(timeZone, false, i, locale);
        this.d = B.c(timeZone, true, i, locale);
    }

    @Override // com.github.catvod.spider.merge.b0.t
    public final void a(StringBuilder sb, Calendar calendar) {
        TimeZone timeZone = calendar.getTimeZone();
        int i = calendar.get(16);
        Locale locale = this.a;
        int i2 = this.b;
        if (i == 0) {
            sb.append((CharSequence) B.c(timeZone, false, i2, locale));
        } else {
            sb.append((CharSequence) B.c(timeZone, true, i2, locale));
        }
    }

    @Override // com.github.catvod.spider.merge.b0.t
    public final int c() {
        return Math.max(this.c.length(), this.d.length());
    }
}
