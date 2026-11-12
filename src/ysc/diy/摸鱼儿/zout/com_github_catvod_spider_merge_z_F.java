package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.X0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class C0498f implements InterfaceC0578v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0239a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;

    public /* synthetic */ C0498f(C0239a c0239a, String str, String str2, String str3, String str4, String str5, Object obj, int i) {
        this.a = i;
        this.b = c0239a;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = obj;
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0578v0
    public final void g(int i, boolean z) throws Throwable {
        switch (this.a) {
            case 0:
                C0239a c0239a = this.b;
                String str = this.c;
                String str2 = this.d;
                String str3 = this.e;
                String str4 = this.g;
                if (!z) {
                    c0239a.getClass();
                    C0239a.n(str, str2, str3);
                    X0.a("已取消 " + str4);
                } else {
                    c0239a.getClass();
                    C0239a.a(str, str2, str3, this.f, str4, (String) this.h);
                }
                break;
            case 1:
                C0239a c0239a2 = this.b;
                String str5 = this.c;
                String str6 = this.d;
                String str7 = this.e;
                String str8 = this.g;
                if (!z) {
                    c0239a2.getClass();
                    C0239a.n(str5, str6, str7);
                    X0.a("已取消 " + str8);
                } else {
                    c0239a2.getClass();
                    C0239a.a(str5, str6, str7, this.f, str8, (String) this.h);
                    X0.a("已收藏 " + str8);
                }
                break;
            default:
                C0239a c0239a3 = this.b;
                String str9 = this.c;
                String str10 = this.d;
                String str11 = this.e;
                if (z) {
                    c0239a3.getClass();
                    C0239a.d(str9, str10, str11, this.f, this.g);
                    StringBuilder sb = new StringBuilder("已关注 ");
                    if (!str11.isEmpty()) {
                        str10 = str11;
                    }
                    sb.append(str10);
                    X0.a(sb.toString());
                } else {
                    c0239a3.getClass();
                    C0239a.o(str9, str10);
                    StringBuilder sb2 = new StringBuilder("已取消关注 ");
                    if (!str11.isEmpty()) {
                        str10 = str11;
                    }
                    sb2.append(str10);
                    X0.a(sb2.toString());
                }
                Runnable runnable = (Runnable) this.h;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }
}
