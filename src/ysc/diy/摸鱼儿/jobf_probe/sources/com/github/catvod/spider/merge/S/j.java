package com.github.catvod.spider.merge.S;

import java.util.Iterator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class j extends r implements s {
    public final b d;
    public final com.github.catvod.spider.merge.V.h e;
    public c g;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public final d f = d.a;
    public int h = -1;
    public final com.github.catvod.spider.merge.V.d n = new com.github.catvod.spider.merge.V.d();
    public int o = 0;

    public j(b bVar) {
        this.d = bVar;
        this.e = new com.github.catvod.spider.merge.V.h(this, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(k kVar) {
        int i = this.h;
        b bVar = this.d;
        String strB = bVar.b(com.github.catvod.spider.merge.V.e.a(i, bVar.b));
        StringBuilder sb = new StringBuilder("token recognition error at: '");
        StringBuilder sb2 = new StringBuilder();
        for (char c : strB.toCharArray()) {
            String strValueOf = String.valueOf(c);
            if (c == -1) {
                strValueOf = "<EOF>";
            } else if (c == 13) {
                strValueOf = "\\r";
            } else if (c == 9) {
                strValueOf = "\\t";
            } else if (c == 10) {
                strValueOf = "\\n";
            }
            sb2.append(strValueOf);
        }
        sb.append(sb2.toString());
        sb.append("'");
        String string = sb.toString();
        q qVar = this.a;
        if (qVar == null) {
            throw new NullPointerException("delegates");
        }
        int i2 = this.i;
        int i3 = this.j;
        Iterator<E> it = qVar.iterator();
        while (it.hasNext()) {
            ((f) it.next()).d(this, null, i2, i3, string, kVar);
        }
    }
}
