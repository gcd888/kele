package com.github.catvod.spider.merge.S;

import java.util.Locale;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class k extends p {
    public final int f;

    public k(j jVar, b bVar, int i) {
        super(jVar, bVar, null);
        this.f = i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        int i = this.f;
        if (i >= 0) {
            b bVar = (b) this.c;
            if (i < bVar.a) {
                String strB = bVar.b(com.github.catvod.spider.merge.V.e.a(i, i));
                StringBuilder sb = new StringBuilder();
                for (char c : strB.toCharArray()) {
                    if (c == '\t') {
                        sb.append("\\t");
                    } else if (c == '\n') {
                        sb.append("\\n");
                    } else if (c == '\r') {
                        sb.append("\\r");
                    } else {
                        sb.append(c);
                    }
                }
                string = sb.toString();
            } else {
                string = "";
            }
        } else {
            string = "";
        }
        Locale.getDefault();
        return k.class.getSimpleName() + "('" + string + "')";
    }
}
