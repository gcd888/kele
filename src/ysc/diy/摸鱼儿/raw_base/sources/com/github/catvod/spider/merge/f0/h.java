package com.github.catvod.spider.merge.f0;

import java.io.IOException;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class h extends o {
    public h(String str, String str2, String str3) {
        com.github.catvod.spider.merge.G.g.e(str);
        com.github.catvod.spider.merge.G.g.e(str2);
        com.github.catvod.spider.merge.G.g.e(str3);
        z("name", str);
        z("publicId", str2);
        z("systemId", str3);
        if (C("publicId")) {
            z("pubSysKey", "PUBLIC");
        } else if (C("systemId")) {
            z("pubSysKey", "SYSTEM");
        }
    }

    public final boolean C(String str) {
        return !com.github.catvod.spider.merge.e0.b.d(c(str));
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final String p() {
        return "#doctype";
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final void r(Appendable appendable, int i, f fVar) throws IOException {
        if (this.b > 0 && fVar.e) {
            appendable.append('\n');
        }
        if (fVar.h != 1 || C("publicId") || C("systemId")) {
            appendable.append("<!DOCTYPE");
        } else {
            appendable.append("<!doctype");
        }
        if (C("name")) {
            appendable.append(" ").append(c("name"));
        }
        if (C("pubSysKey")) {
            appendable.append(" ").append(c("pubSysKey"));
        }
        if (C("publicId")) {
            appendable.append(" \"").append(c("publicId")).append('\"');
        }
        if (C("systemId")) {
            appendable.append(" \"").append(c("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override // com.github.catvod.spider.merge.f0.p
    public final void s(Appendable appendable, int i, f fVar) {
    }
}
