package com.github.catvod.spider.merge.B;

import com.whl.quickjs.wrapper.JSCallFunction;
import com.whl.quickjs.wrapper.QuickJSObject;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class b implements JSCallFunction {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    public final Object call(Object[] objArr) {
        return QuickJSObject.a(this.a, this.b, objArr);
    }
}
