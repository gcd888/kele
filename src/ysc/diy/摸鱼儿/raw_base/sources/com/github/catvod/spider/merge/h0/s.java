package com.github.catvod.spider.merge.h0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class s extends t {
    public final /* synthetic */ int b;

    public s(n nVar, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.a = nVar;
                break;
            case 2:
                this.a = nVar;
                break;
            case 3:
                this.a = nVar;
                break;
            case 4:
                this.a = nVar;
                break;
            default:
                this.a = nVar;
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.h0.n
    public final boolean a(com.github.catvod.spider.merge.f0.k kVar, com.github.catvod.spider.merge.f0.k kVar2) {
        com.github.catvod.spider.merge.f0.k kVar3;
        com.github.catvod.spider.merge.f0.k kVarP;
        switch (this.b) {
            case 0:
                return (kVar == kVar2 || (kVar3 = (com.github.catvod.spider.merge.f0.k) kVar2.a) == null || !this.a.a(kVar, kVar3)) ? false : true;
            case 1:
                return (kVar == kVar2 || (kVarP = kVar2.P()) == null || !this.a.a(kVar, kVarP)) ? false : true;
            case 2:
                return !this.a.a(kVar, kVar2);
            case 3:
                if (kVar == kVar2) {
                    return false;
                }
                for (com.github.catvod.spider.merge.f0.k kVar4 = (com.github.catvod.spider.merge.f0.k) kVar2.a; kVar4 != null; kVar4 = (com.github.catvod.spider.merge.f0.k) kVar4.a) {
                    if (this.a.a(kVar, kVar4)) {
                        return true;
                    }
                    if (kVar4 == kVar) {
                        return false;
                    }
                }
                return false;
            default:
                if (kVar == kVar2) {
                    return false;
                }
                for (com.github.catvod.spider.merge.f0.k kVarP2 = kVar2.P(); kVarP2 != null; kVarP2 = kVarP2.P()) {
                    if (this.a.a(kVar, kVarP2)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return String.format("%s > ", this.a);
            case 1:
                return String.format("%s + ", this.a);
            case 2:
                return String.format(":not(%s)", this.a);
            case 3:
                return String.format("%s ", this.a);
            default:
                return String.format("%s ~ ", this.a);
        }
    }
}
