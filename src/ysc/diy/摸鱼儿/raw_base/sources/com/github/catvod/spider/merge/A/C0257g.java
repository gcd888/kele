package com.github.catvod.spider.merge.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0257g {
    public final List a;
    public final String b;
    public final boolean c;
    public volatile String d;

    public C0257g(ArrayList arrayList, String str, boolean z, String str2) {
        this.a = arrayList;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final String a(String str, HashMap map) {
        if (str.startsWith("http")) {
            String strX = X1.X(str, null, map);
            return strX != null ? strX : "";
        }
        if (this.d.isEmpty() && !this.a.isEmpty()) {
            this.d = (String) this.a.get(0);
        }
        StringBuilder sb = new StringBuilder();
        String strI = this.d;
        if (this.c) {
            strI = com.github.catvod.spider.merge.D.b.i(strI, "/");
        }
        sb.append(strI);
        sb.append(str);
        String strX2 = X1.X(sb.toString(), null, map);
        if (strX2 != null && !strX2.isEmpty()) {
            return strX2;
        }
        if (this.a.size() > 1) {
            String strE = AbstractC0260h.e((ArrayList) this.a);
            if (!strE.isEmpty() && !strE.equals(this.d)) {
                this.d = strE;
                C0297t1.j(this.b, this.d);
                StringBuilder sb2 = new StringBuilder();
                String strI2 = this.d;
                if (this.c) {
                    strI2 = com.github.catvod.spider.merge.D.b.i(strI2, "/");
                }
                sb2.append(strI2);
                sb2.append(str);
                String strX3 = X1.X(sb2.toString(), null, map);
                if (strX3 != null && !strX3.isEmpty()) {
                    return strX3;
                }
            }
        }
        return "";
    }

    public final String b() {
        return (!this.c || this.d.isEmpty()) ? this.d : com.github.catvod.spider.merge.D.b.m(new StringBuilder(), this.d, "/");
    }
}
