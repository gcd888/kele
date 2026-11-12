package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.g0.C0397a;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class S0 {
    public final /* synthetic */ int a;
    public String b;
    public String c;

    public S0() {
        this.a = 4;
    }

    public String a() {
        String str = this.b;
        return str != null ? str : "";
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "<" + this.b + ">: " + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ S0(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public S0(C0397a c0397a, String str) {
        this.a = 5;
        c0397a.getClass();
        this.b = c0397a.m();
        this.c = str;
    }

    public S0(String str, String str2) {
        this.a = 6;
        this.b = str;
        this.c = str2 == null ? "" : str2;
    }

    public S0(C0397a c0397a, String str, Object[] objArr) {
        this.a = 5;
        c0397a.getClass();
        this.b = c0397a.m();
        this.c = String.format(str, objArr);
    }
}
