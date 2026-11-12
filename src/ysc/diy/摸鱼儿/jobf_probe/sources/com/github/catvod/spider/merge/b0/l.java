package com.github.catvod.spider.merge.b0;

import java.util.TimeZone;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class l {
    public final TimeZone a;
    public final int b;

    public l(TimeZone timeZone, boolean z) {
        this.a = timeZone;
        this.b = z ? timeZone.getDSTSavings() : 0;
    }
}
