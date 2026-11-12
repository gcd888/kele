package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.A.X0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class DialogInterfaceOnClickListenerC0490d1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C0559r1 c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0490d1(C0559r1 c0559r1, ArrayList arrayList, int i) {
        this.a = i;
        this.c = c0559r1;
        this.b = arrayList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        switch (this.a) {
            case 0:
                InterfaceC0545o1 interfaceC0545o1 = (InterfaceC0545o1) this.c.a;
                List list = this.b;
                interfaceC0545o1.setDisabledServers(list);
                X0.a("已保存，关闭" + list.size() + "个服务器");
                break;
            default:
                InterfaceC0545o1 interfaceC0545o2 = (InterfaceC0545o1) this.c.a;
                List list2 = this.b;
                interfaceC0545o2.setHiddenCategories(list2);
                X0.a("已保存，隐藏" + list2.size() + "个分类");
                break;
        }
    }
}
