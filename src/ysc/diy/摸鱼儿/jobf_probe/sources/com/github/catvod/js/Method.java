package com.github.catvod.js;

import com.github.catvod.spider.merge.A.X0;
import com.whl.quickjs.wrapper.JSMethod;
import com.whl.quickjs.wrapper.QuickJSContext;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Method {
    private QuickJSContext ctx;

    public Method(QuickJSContext quickJSContext) {
        this.ctx = quickJSContext;
    }

    @JSMethod
    public void showToast(String str) {
        X0.a(str);
    }
}
