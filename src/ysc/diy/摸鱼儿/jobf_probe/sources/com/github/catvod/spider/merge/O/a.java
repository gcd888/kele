package com.github.catvod.spider.merge.O;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class a {
    public static final Charset a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        com.github.catvod.spider.merge.L.a.c(charsetForName, "forName(...)");
        a = charsetForName;
        com.github.catvod.spider.merge.L.a.c(Charset.forName("UTF-16"), "forName(...)");
        com.github.catvod.spider.merge.L.a.c(Charset.forName("UTF-16BE"), "forName(...)");
        com.github.catvod.spider.merge.L.a.c(Charset.forName("UTF-16LE"), "forName(...)");
        com.github.catvod.spider.merge.L.a.c(Charset.forName("US-ASCII"), "forName(...)");
        com.github.catvod.spider.merge.L.a.c(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
