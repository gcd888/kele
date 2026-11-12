package com.github.catvod.spider.merge.p022z;

import android.widget.EditText;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.F0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0515i1 implements F0 {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ EditText d;

    public C0515i1(EditText editText, EditText editText2, EditText editText3, EditText editText4) {
        this.a = editText;
        this.b = editText2;
        this.c = editText3;
        this.d = editText4;
    }

    @Override // com.github.catvod.spider.merge.A.F0
    public final void a(String str, String str2) {
        InitOrigin.run(new RunnableC0510h1(this, str, str2));
    }
}
