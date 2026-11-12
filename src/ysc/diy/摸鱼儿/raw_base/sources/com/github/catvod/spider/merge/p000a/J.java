package com.github.catvod.spider.merge.p000a;

import java.io.IOException;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class J extends IOException {
    public final String a;

    public J(String str, String str2) {
        super(str2 == null ? "bridge request failed" : str2);
        this.a = str == null ? "bridge" : str;
    }
}
