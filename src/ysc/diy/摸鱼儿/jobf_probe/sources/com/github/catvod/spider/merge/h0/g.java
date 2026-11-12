package com.github.catvod.spider.merge.h0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class g extends n {
    public final String a;
    public final String b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, int i, String str2) {
        this(str, str2, true);
        this.c = i;
    }

    @Override // com.github.catvod.spider.merge.h0.n
    public final boolean a(com.github.catvod.spider.merge.f0.k kVar, com.github.catvod.spider.merge.f0.k kVar2) {
        switch (this.c) {
            case 0:
                String str = this.a;
                if (kVar2.l(str)) {
                    if (this.b.equalsIgnoreCase(kVar2.c(str).trim())) {
                        return true;
                    }
                }
                return false;
            case 1:
                String str2 = this.a;
                return kVar2.l(str2) && com.github.catvod.spider.merge.l0.i.a(kVar2.c(str2)).contains(this.b);
            case 2:
                String str3 = this.a;
                return kVar2.l(str3) && com.github.catvod.spider.merge.l0.i.a(kVar2.c(str3)).endsWith(this.b);
            case 3:
                return !this.b.equalsIgnoreCase(kVar2.c(this.a));
            default:
                String str4 = this.a;
                return kVar2.l(str4) && com.github.catvod.spider.merge.l0.i.a(kVar2.c(str4)).startsWith(this.b);
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                sb.append(this.a);
                sb.append("=");
                return com.github.catvod.spider.merge.D.b.m(sb, this.b, "]");
            case 1:
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(this.a);
                sb2.append("*=");
                return com.github.catvod.spider.merge.D.b.m(sb2, this.b, "]");
            case 2:
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append(this.a);
                sb3.append("$=");
                return com.github.catvod.spider.merge.D.b.m(sb3, this.b, "]");
            case 3:
                StringBuilder sb4 = new StringBuilder("[");
                sb4.append(this.a);
                sb4.append("!=");
                return com.github.catvod.spider.merge.D.b.m(sb4, this.b, "]");
            default:
                StringBuilder sb5 = new StringBuilder("[");
                sb5.append(this.a);
                sb5.append("^=");
                return com.github.catvod.spider.merge.D.b.m(sb5, this.b, "]");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, int i, String str2, boolean z) {
        this(str, str2, false);
        this.c = i;
    }

    public g(String str, String str2, boolean z) {
        com.github.catvod.spider.merge.G.g.c(str);
        com.github.catvod.spider.merge.G.g.c(str2);
        this.a = com.github.catvod.spider.merge.l0.i.b(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? com.github.catvod.spider.merge.D.b.g(str2, 1, 1) : str2;
        String strA = (!z && z2) ? com.github.catvod.spider.merge.l0.i.a(str2) : com.github.catvod.spider.merge.l0.i.b(str2);
        this.b = strA;
    }
}
