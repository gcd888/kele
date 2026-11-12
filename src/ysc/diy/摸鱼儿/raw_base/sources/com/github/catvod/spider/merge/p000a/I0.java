package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.d0.C0069;
import java.io.PrintStream;
import java.util.HashMap;
import moyu.fucking.C0152;
import moyu.fucking.C0182;
import moyu.fucking.C0195;
import moyu.fucking.C0215;
import moyu.fucking.C0224;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class I0 {
    public final int a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public boolean l;
    public HashMap m;

    public I0(int i, String str) throws Throwable {
        this.a = i;
        this.b = str;
        int iIntValue = ((Integer) C0152.n(51759, null, new Object[0])).intValue();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (iIntValue >= 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0182.n(56258, null, new Object[]{(String) C0224.n(2303, null, new Object[]{(String) C0215.n(17177)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    public static I0 a(String str) {
        return new I0(C0069.f278 ^ 279, str);
    }
}
