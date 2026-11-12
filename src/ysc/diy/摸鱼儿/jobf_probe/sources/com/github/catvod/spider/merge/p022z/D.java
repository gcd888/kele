package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.view.View;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p005f.a;
import com.github.catvod.spider.merge.p005f.b;
import com.github.catvod.spider.merge.p005f.c;
import com.github.catvod.spider.merge.p005f.h;
import com.github.catvod.spider.merge.p017u.B;
import com.github.catvod.spider.merge.p017u.RunnableC0453e;
import java.util.ArrayList;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class D implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ D(C0559r1 c0559r1, AlertDialog[] alertDialogArr, int i) {
        this.a = 2;
        this.d = c0559r1;
        this.c = alertDialogArr;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                AlertDialog alertDialog = ((AlertDialog[]) this.c)[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                int i = this.b;
                h hVar = (h) this.d;
                if (i == 0) {
                    c cVar = (c) hVar.b;
                    cVar.getClass();
                    InitOrigin.run(new RunnableC0242b(String.valueOf(System.currentTimeMillis()), (Object) new b(cVar, (RunnableC0453e) ((Runnable) hVar.a)), 14));
                    break;
                } else if (i == 1) {
                    c cVar2 = (c) hVar.b;
                    ArrayList arrayList = cVar2.d;
                    b bVar = new b(cVar2, (RunnableC0453e) ((Runnable) hVar.a));
                    if (!arrayList.isEmpty()) {
                        InitOrigin.run(new RunnableC0242b(arrayList, bVar, 15));
                    } else {
                        X0.a("没有可删除的分类");
                    }
                    break;
                } else if (i == 2) {
                    c cVar3 = (c) hVar.b;
                    ArrayList arrayList2 = cVar3.d;
                    b bVar2 = new b(cVar3, (RunnableC0453e) ((Runnable) hVar.a));
                    if (arrayList2.size() >= 2) {
                        InitOrigin.run(new RunnableC0242b(arrayList2, bVar2, 16));
                    } else {
                        X0.a("分类太少，无需排序");
                    }
                    break;
                } else if (i == 3) {
                    c cVar4 = (c) hVar.b;
                    cVar4.getClass();
                    InitOrigin.run(new B(new a(cVar4, (Runnable) hVar.a, 2), 3));
                    break;
                }
                break;
            case 1:
                int[] iArr = (int[]) this.c;
                int i2 = iArr[0];
                if (i2 < this.b - 1) {
                    iArr[0] = i2 + 1;
                    ((Runnable) this.d).run();
                    break;
                }
                break;
            default:
                C0559r1 c0559r1 = (C0559r1) this.d;
                c0559r1.getClass();
                AlertDialog alertDialog2 = ((AlertDialog[]) this.c)[0];
                if (alertDialog2 != null) {
                    alertDialog2.dismiss();
                }
                boolean z = ((C0481b2) c0559r1.b).h;
                int i3 = this.b;
                if (!z) {
                    if (i3 == 0) {
                        InitOrigin.run(new RunnableC0242b(c0559r1, String.valueOf(System.currentTimeMillis()), 24));
                        break;
                    } else if (i3 == 1) {
                        c0559r1.r();
                        break;
                    } else if (i3 == 2) {
                        InitOrigin.run(new Z1(c0559r1, 0));
                        break;
                    }
                } else if (i3 == 0) {
                    InitOrigin.run(new RunnableC0242b(c0559r1, String.valueOf(System.currentTimeMillis()), 24));
                    break;
                } else if (i3 == 1) {
                    c0559r1.r();
                    break;
                } else if (i3 == 2) {
                    c0559r1.u();
                    break;
                } else if (i3 == 3) {
                    InitOrigin.run(new Z1(c0559r1, 0));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ D(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
