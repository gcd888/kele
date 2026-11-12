package com.github.catvod.spider.merge.p022z;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0494e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ RunnableC0494e0(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View view = this.b;
                try {
                    ArrayList arrayList = new ArrayList();
                    AbstractC0583w0.v(view, arrayList);
                    if (arrayList.size() >= 2) {
                        int i = 0;
                        while (i < arrayList.size()) {
                            ArrayList<View> arrayList2 = (ArrayList) arrayList.get(i);
                            ArrayList arrayList3 = i > 0 ? (ArrayList) arrayList.get(i - 1) : null;
                            i++;
                            ArrayList arrayList4 = i < arrayList.size() ? (ArrayList) arrayList.get(i) : null;
                            for (View view2 : arrayList2) {
                                AbstractC0583w0.R(view2);
                                if (arrayList3 != null) {
                                    view2.setNextFocusUpId(AbstractC0583w0.d0(view2, arrayList3).getId());
                                }
                                if (arrayList4 != null) {
                                    view2.setNextFocusDownId(AbstractC0583w0.d0(view2, arrayList4).getId());
                                }
                            }
                            break;
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                View view3 = this.b;
                if (AbstractC0583w0.Z(view3)) {
                    view3.requestFocus();
                }
                break;
            case 2:
                this.b.requestFocus();
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
