package com.github.catvod.spider.merge.p022z;

import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0597z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Runnable[] d;

    public /* synthetic */ RunnableC0597z(int i, LinearLayout linearLayout, ArrayList arrayList, Runnable[] runnableArr) {
        this.a = i;
        this.b = linearLayout;
        this.c = arrayList;
        this.d = runnableArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LinearLayout linearLayout = this.b;
                linearLayout.removeAllViews();
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i < arrayList.size()) {
                        AbstractC0583w0.i(linearLayout, (String) arrayList.get(i), i, arrayList.size(), AbstractC0583w0.a(i), i > 0, new B(0, linearLayout, arrayList, this.d));
                        i++;
                    }
                    break;
                }
                break;
            case 1:
                LinearLayout linearLayout2 = this.b;
                linearLayout2.removeAllViews();
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = this.c;
                    if (i2 < arrayList2.size()) {
                        AbstractC0583w0.i(linearLayout2, (String) arrayList2.get(i2), i2, arrayList2.size(), AbstractC0583w0.a(i2), i2 > 0, new B(1, linearLayout2, arrayList2, this.d));
                        i2++;
                    }
                    break;
                }
                break;
            case 2:
                LinearLayout linearLayout3 = this.b;
                linearLayout3.removeAllViews();
                int i3 = 0;
                while (true) {
                    ArrayList arrayList3 = this.c;
                    if (i3 < arrayList3.size()) {
                        AbstractC0583w0.i(linearLayout3, (String) arrayList3.get(i3), i3, arrayList3.size(), AbstractC0583w0.a(i3), i3 > 0, new B(2, linearLayout3, arrayList3, this.d));
                        i3++;
                    }
                    break;
                }
                break;
            default:
                LinearLayout linearLayout4 = this.b;
                linearLayout4.removeAllViews();
                int i4 = 0;
                while (true) {
                    ArrayList arrayList4 = this.c;
                    if (i4 < arrayList4.size()) {
                        AbstractC0583w0.i(linearLayout4, (String) arrayList4.get(i4), i4, arrayList4.size(), AbstractC0583w0.a(i4), i4 > 0, new B(3, linearLayout4, arrayList4, this.d));
                        i4++;
                    }
                    break;
                }
                break;
        }
    }
}
