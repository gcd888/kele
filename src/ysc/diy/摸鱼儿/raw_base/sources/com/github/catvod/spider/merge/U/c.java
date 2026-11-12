package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.T.c0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class c {
    public final c0 a;
    public final int b;

    public c(c0 c0Var, int i) {
        this.b = i;
        this.a = c0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(", ");
        return com.github.catvod.spider.merge.D.b.l(sb, this.b, ")");
    }
}
