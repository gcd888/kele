package com.github.catvod.spider.merge.b0;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0392a {
    public static final C0394c a;

    static {
        Pattern pattern = C.a;
        C0394c.a("yyyy-MM-dd'T'HH:mm:ss");
        a = C0394c.a("yyyy-MM-dd'T'HH:mm:ssZZ");
        C0394c.a("yyyy-MM-dd");
        C0394c.a("yyyy-MM-ddZZ");
        C0394c.a("'T'HH:mm:ss");
        C0394c.a("'T'HH:mm:ssZZ");
        C0394c.a("HH:mm:ss");
        C0394c.a("HH:mm:ssZZ");
    }
}
