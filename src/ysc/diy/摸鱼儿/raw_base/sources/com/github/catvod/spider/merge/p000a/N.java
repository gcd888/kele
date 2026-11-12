package com.github.catvod.spider.merge.p000a;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class N {
    public final int a;
    public final Serializable b;
    public final Object c;

    public /* synthetic */ N(int i, Serializable serializable, Object obj) {
        this.a = i;
        this.b = serializable;
        this.c = obj;
    }

    public String a() {
        String str = (String) this.b;
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public N() {
        this.a = 500;
        this.b = "";
        this.c = new HashMap();
    }
}
