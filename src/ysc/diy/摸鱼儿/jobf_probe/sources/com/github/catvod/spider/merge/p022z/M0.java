package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.view.View;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p007h.a;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class M0 implements View.OnClickListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a c;
    public final /* synthetic */ AlertDialog d;
    public final /* synthetic */ X1 e;

    public M0(X1 x1, boolean[] zArr, boolean z, a aVar, AlertDialog alertDialog) {
        this.e = x1;
        this.a = zArr;
        this.b = z;
        this.c = aVar;
        this.d = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String[] strArr = {"Movie", "Series", "BoxSet"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            if (this.a[i]) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(strArr[i]);
            }
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            X0.a("请至少选择一种内容类型");
            return;
        }
        try {
            P0 p0 = (P0) this.e.b;
            boolean z = this.b;
            a aVar = this.c;
            String str = z ? string : aVar.a;
            if (z) {
                string = aVar.b;
            }
            p0.setEmbyManagePrefs(X1.t(str, aVar.c, aVar.d, string));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? "浏览内容" : "搜索内容");
            sb2.append("已保存");
            X0.a(sb2.toString());
            this.d.dismiss();
        } catch (Exception e) {
            X0.a(e.getMessage());
        }
    }
}
