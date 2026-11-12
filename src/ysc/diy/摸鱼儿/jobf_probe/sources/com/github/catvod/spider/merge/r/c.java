package com.github.catvod.spider.merge.r;

import com.github.catvod.spider.merge.A.AbstractC0309x1;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class c implements Comparable {
    public String a = "";
    public String b = "";
    public long c = 0;
    public String d = "";
    public String e = "";

    public final String a() {
        String str = this.b;
        return str != null ? str : "";
    }

    public final String b() {
        String str;
        String str2 = this.e;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (!str2.isEmpty() && (str = this.e) != null) {
            str3 = str;
        }
        StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(str3, " ");
        sbP.append(AbstractC0309x1.f(a()));
        return sbP.toString().trim();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b().compareTo(((c) obj).b());
    }
}
