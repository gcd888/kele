package com.github.catvod.spider.merge.b0;

import java.util.Calendar;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class u implements t {
    public final String a;

    public u(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.b0.t
    public final void a(StringBuilder sb, Calendar calendar) {
        sb.append((CharSequence) this.a);
    }

    @Override // com.github.catvod.spider.merge.b0.t
    public final int c() {
        return this.a.length();
    }
}
