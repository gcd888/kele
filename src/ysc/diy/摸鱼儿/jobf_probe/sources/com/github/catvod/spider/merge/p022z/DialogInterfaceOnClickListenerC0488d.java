package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.f0.i;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0488d implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0538n b;
    public final /* synthetic */ i c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0488d(C0538n c0538n, i iVar, int i) {
        this.a = i;
        this.b = c0538n;
        this.c = iVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                this.b.j(this.c);
                break;
            case 1:
                C0538n c0538n = this.b;
                c0538n.getClass();
                C0239a.e().getClass();
                C0297t1.j("alllive_fav_cats.json", "[]");
                X0.a("已清空所有收藏分类");
                c0538n.g(this.c);
                break;
            case 2:
                this.b.g(this.c);
                break;
            case 3:
                this.b.g(this.c);
                break;
            default:
                this.b.g(this.c);
                break;
        }
    }
}
