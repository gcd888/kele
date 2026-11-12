package com.github.catvod.spider.merge.d0;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class a {
    public static final Charset a;

    static {
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        Charset charsetForName = Charset.forName("UTF-8");
        a = charsetForName;
        charsetForName.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
