package com.github.catvod.spider.merge.A;

import java.util.Locale;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class Y1 {
    public String a;
    public String b;
    public String c;
    public Object d;
    public Object e;

    public Y1(String str) {
        this.a = str;
        this.b = "0";
    }

    public boolean a() {
        String lowerCase = this.a.toLowerCase(Locale.ROOT);
        return (lowerCase.startsWith("https://") || lowerCase.startsWith("http://")) && !this.b.isEmpty();
    }

    public Y1(String str, String str2, String str3) {
        String strTrim;
        String strTrim2 = str == null ? "" : str.trim();
        this.a = strTrim2;
        if (str2 == null) {
            strTrim = "";
        } else {
            strTrim = str2.trim();
        }
        this.b = strTrim;
        str3 = str3 == null ? "" : str3;
        this.c = str3;
        String str4 = strTrim2 + '\n' + strTrim;
        this.d = str4;
        this.e = str4 + '\n' + str3;
    }
}
