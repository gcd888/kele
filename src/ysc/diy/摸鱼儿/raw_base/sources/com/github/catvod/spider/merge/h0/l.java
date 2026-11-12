package com.github.catvod.spider.merge.h0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class l extends n {
    public final int a;
    public final int b;
    public final /* synthetic */ int c;

    public l(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.h0.n
    public final boolean a(com.github.catvod.spider.merge.f0.k kVar, com.github.catvod.spider.merge.f0.k kVar2) {
        com.github.catvod.spider.merge.f0.k kVar3 = (com.github.catvod.spider.merge.f0.k) kVar2.a;
        if (kVar3 == null || (kVar3 instanceof com.github.catvod.spider.merge.f0.g)) {
            return false;
        }
        int iB = b(kVar2);
        int i = this.b;
        int i2 = this.a;
        if (i2 == 0) {
            return iB == i;
        }
        int i3 = iB - i;
        return i3 * i2 >= 0 && i3 % i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(com.github.catvod.spider.merge.f0.k kVar) {
        switch (this.c) {
            case 0:
                return kVar.H() + 1;
            case 1:
                com.github.catvod.spider.merge.f0.k kVar2 = (com.github.catvod.spider.merge.f0.k) kVar.a;
                if (kVar2 == null) {
                    return 0;
                }
                return kVar2.D().size() - kVar.H();
            case 2:
                com.github.catvod.spider.merge.f0.k kVar3 = (com.github.catvod.spider.merge.f0.k) kVar.a;
                int i = 0;
                if (kVar3 != null) {
                    d dVarD = kVar3.D();
                    for (int iH = kVar.H(); iH < dVarD.size(); iH++) {
                        if (((com.github.catvod.spider.merge.f0.k) dVarD.get(iH)).d.equals(kVar.d)) {
                            i++;
                        }
                    }
                }
                return i;
            default:
                com.github.catvod.spider.merge.f0.k kVar4 = (com.github.catvod.spider.merge.f0.k) kVar.a;
                int i2 = 0;
                if (kVar4 != null) {
                    for (com.github.catvod.spider.merge.f0.k kVar5 : kVar4.D()) {
                        if (kVar5.d.equals(kVar.d)) {
                            i2++;
                        }
                        if (kVar5 == kVar) {
                        }
                    }
                }
                return i2;
        }
    }

    public final String c() {
        switch (this.c) {
            case 0:
                return "nth-child";
            case 1:
                return "nth-last-child";
            case 2:
                return "nth-last-of-type";
            default:
                return "nth-of-type";
        }
    }

    public String toString() {
        int i = this.b;
        int i2 = this.a;
        if (i2 == 0) {
            return String.format(":%s(%d)", c(), Integer.valueOf(i));
        }
        return i == 0 ? String.format(":%s(%dn)", c(), Integer.valueOf(i2)) : String.format(":%s(%dn%+d)", c(), Integer.valueOf(i2), Integer.valueOf(i));
    }
}
