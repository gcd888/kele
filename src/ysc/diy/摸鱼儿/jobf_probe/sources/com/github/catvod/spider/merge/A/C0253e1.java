package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.p022z.InterfaceC0578v0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0253e1 implements InterfaceC0578v0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Object f;

    public C0253e1(C0239a c0239a, String str, String str2, String str3, String str4, String str5) {
        this.f = c0239a;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0578v0
    public void g(int i, boolean z) {
        String str = this.b;
        String str2 = this.a;
        C0239a c0239a = (C0239a) this.f;
        String str3 = this.c;
        if (z) {
            c0239a.getClass();
            C0239a.d(str2, str, str3, this.d, this.e);
            X0.a("已关注 " + str3);
            return;
        }
        c0239a.getClass();
        C0239a.o(str2, str);
        X0.a("已取消关注 " + str3);
    }

    public C0253e1(String str, String str2, String str3, String str4, String str5, String[] strArr) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = strArr;
    }
}
