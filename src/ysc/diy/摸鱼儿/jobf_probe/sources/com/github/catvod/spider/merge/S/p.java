package com.github.catvod.spider.merge.S;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class p extends RuntimeException {
    public final r a;
    public final o b;
    public final i c;
    public c d;
    public int e;

    public p(r rVar, i iVar, o oVar) {
        this.e = -1;
        this.a = rVar;
        this.c = iVar;
        this.b = oVar;
        if (rVar != null) {
            this.e = rVar.c;
        }
    }
}
