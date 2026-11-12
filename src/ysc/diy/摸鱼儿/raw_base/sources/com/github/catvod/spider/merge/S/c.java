package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.merge.T.C0337w;
import java.io.Serializable;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class c implements Serializable {
    public final int a;
    public int b;
    public int c;
    public final int d;
    public final com.github.catvod.spider.merge.V.h e;
    public String f;
    public int g = -1;
    public final int h;
    public final int i;

    public c(com.github.catvod.spider.merge.V.h hVar, int i, int i2, int i3, int i4) {
        this.c = -1;
        this.e = hVar;
        this.a = i;
        this.d = i2;
        this.h = i3;
        this.i = i4;
        Object obj = hVar.a;
        if (obj != null) {
            this.b = ((C0337w) ((j) ((s) obj)).b).f;
            this.c = ((C0337w) ((j) ((s) obj)).b).g;
        }
    }

    public final String a() {
        int i;
        String str = this.f;
        if (str != null) {
            return str;
        }
        b bVar = (b) this.e.b;
        if (bVar == null) {
            return null;
        }
        int i2 = this.h;
        int i3 = bVar.a;
        return (i2 >= i3 || (i = this.i) >= i3) ? "<EOF>" : bVar.b(com.github.catvod.spider.merge.V.e.a(i2, i));
    }

    public final String toString() {
        int i = this.d;
        String strE = i > 0 ? com.github.catvod.spider.merge.D.b.e(i, ",channel=") : "";
        String strA = a();
        String strReplace = strA != null ? strA.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>";
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder("[@");
        sb.append(this.g);
        sb.append(",");
        sb.append(this.h);
        sb.append(":");
        sb.append(this.i);
        sb.append("='");
        sb.append(strReplace);
        sb.append("',<");
        com.github.catvod.spider.merge.D.b.A(sb, strValueOf, ">", strE, ",");
        sb.append(this.b);
        sb.append(":");
        return com.github.catvod.spider.merge.D.b.l(sb, this.c, "]");
    }
}
