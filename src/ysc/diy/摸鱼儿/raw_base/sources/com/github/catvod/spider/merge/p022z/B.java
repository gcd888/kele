package com.github.catvod.spider.merge.p022z;

import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class B implements InterfaceC0573u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Runnable[] c;
    public final /* synthetic */ LinearLayout d;

    public /* synthetic */ B(int i, LinearLayout linearLayout, ArrayList arrayList, Runnable[] runnableArr) {
        this.a = i;
        this.b = arrayList;
        this.c = runnableArr;
        this.d = linearLayout;
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0573u0
    public final void c(int i, final int i2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                arrayList.add(i2, (String) arrayList.remove(i));
                this.c[0].run();
                final LinearLayout linearLayout = this.d;
                final int i3 = 0;
                linearLayout.post(new Runnable() { // from class: com.github.catvod.spider.merge.z.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                LinearLayout linearLayout2 = linearLayout;
                                int childCount = linearLayout2.getChildCount();
                                int i4 = i2;
                                if (i4 < childCount) {
                                    AbstractC0583w0.g0(linearLayout2.getChildAt(i4));
                                }
                                break;
                            case 1:
                                LinearLayout linearLayout3 = linearLayout;
                                int childCount2 = linearLayout3.getChildCount();
                                int i5 = i2;
                                if (i5 < childCount2) {
                                    AbstractC0583w0.g0(linearLayout3.getChildAt(i5));
                                }
                                break;
                            case 2:
                                LinearLayout linearLayout4 = linearLayout;
                                int childCount3 = linearLayout4.getChildCount();
                                int i6 = i2;
                                if (i6 < childCount3) {
                                    AbstractC0583w0.g0(linearLayout4.getChildAt(i6));
                                }
                                break;
                            case 3:
                                LinearLayout linearLayout5 = linearLayout;
                                int childCount4 = linearLayout5.getChildCount();
                                int i7 = i2;
                                if (i7 < childCount4) {
                                    AbstractC0583w0.g0(linearLayout5.getChildAt(i7));
                                }
                                break;
                            default:
                                LinearLayout linearLayout6 = linearLayout;
                                int childCount5 = linearLayout6.getChildCount();
                                int i8 = i2;
                                if (i8 < childCount5) {
                                    AbstractC0583w0.g0(linearLayout6.getChildAt(i8));
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                ArrayList arrayList2 = this.b;
                arrayList2.add(i2, (String) arrayList2.remove(i));
                this.c[0].run();
                final LinearLayout linearLayout2 = this.d;
                final int i4 = 1;
                linearLayout2.post(new Runnable() { // from class: com.github.catvod.spider.merge.z.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                LinearLayout linearLayout3 = linearLayout2;
                                int childCount = linearLayout3.getChildCount();
                                int i5 = i2;
                                if (i5 < childCount) {
                                    AbstractC0583w0.g0(linearLayout3.getChildAt(i5));
                                }
                                break;
                            case 1:
                                LinearLayout linearLayout4 = linearLayout2;
                                int childCount2 = linearLayout4.getChildCount();
                                int i6 = i2;
                                if (i6 < childCount2) {
                                    AbstractC0583w0.g0(linearLayout4.getChildAt(i6));
                                }
                                break;
                            case 2:
                                LinearLayout linearLayout5 = linearLayout2;
                                int childCount3 = linearLayout5.getChildCount();
                                int i7 = i2;
                                if (i7 < childCount3) {
                                    AbstractC0583w0.g0(linearLayout5.getChildAt(i7));
                                }
                                break;
                            case 3:
                                LinearLayout linearLayout6 = linearLayout2;
                                int childCount4 = linearLayout6.getChildCount();
                                int i8 = i2;
                                if (i8 < childCount4) {
                                    AbstractC0583w0.g0(linearLayout6.getChildAt(i8));
                                }
                                break;
                            default:
                                LinearLayout linearLayout7 = linearLayout2;
                                int childCount5 = linearLayout7.getChildCount();
                                int i9 = i2;
                                if (i9 < childCount5) {
                                    AbstractC0583w0.g0(linearLayout7.getChildAt(i9));
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                ArrayList arrayList3 = this.b;
                arrayList3.add(i2, (String) arrayList3.remove(i));
                this.c[0].run();
                final LinearLayout linearLayout3 = this.d;
                final int i5 = 2;
                linearLayout3.post(new Runnable() { // from class: com.github.catvod.spider.merge.z.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                LinearLayout linearLayout4 = linearLayout3;
                                int childCount = linearLayout4.getChildCount();
                                int i6 = i2;
                                if (i6 < childCount) {
                                    AbstractC0583w0.g0(linearLayout4.getChildAt(i6));
                                }
                                break;
                            case 1:
                                LinearLayout linearLayout5 = linearLayout3;
                                int childCount2 = linearLayout5.getChildCount();
                                int i7 = i2;
                                if (i7 < childCount2) {
                                    AbstractC0583w0.g0(linearLayout5.getChildAt(i7));
                                }
                                break;
                            case 2:
                                LinearLayout linearLayout6 = linearLayout3;
                                int childCount3 = linearLayout6.getChildCount();
                                int i8 = i2;
                                if (i8 < childCount3) {
                                    AbstractC0583w0.g0(linearLayout6.getChildAt(i8));
                                }
                                break;
                            case 3:
                                LinearLayout linearLayout7 = linearLayout3;
                                int childCount4 = linearLayout7.getChildCount();
                                int i9 = i2;
                                if (i9 < childCount4) {
                                    AbstractC0583w0.g0(linearLayout7.getChildAt(i9));
                                }
                                break;
                            default:
                                LinearLayout linearLayout8 = linearLayout3;
                                int childCount5 = linearLayout8.getChildCount();
                                int i10 = i2;
                                if (i10 < childCount5) {
                                    AbstractC0583w0.g0(linearLayout8.getChildAt(i10));
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                ArrayList arrayList4 = this.b;
                String str = (String) arrayList4.get(i);
                arrayList4.set(i, (String) arrayList4.get(i2));
                arrayList4.set(i2, str);
                this.c[0].run();
                final LinearLayout linearLayout4 = this.d;
                final int i6 = 3;
                linearLayout4.post(new Runnable() { // from class: com.github.catvod.spider.merge.z.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                LinearLayout linearLayout5 = linearLayout4;
                                int childCount = linearLayout5.getChildCount();
                                int i7 = i2;
                                if (i7 < childCount) {
                                    AbstractC0583w0.g0(linearLayout5.getChildAt(i7));
                                }
                                break;
                            case 1:
                                LinearLayout linearLayout6 = linearLayout4;
                                int childCount2 = linearLayout6.getChildCount();
                                int i8 = i2;
                                if (i8 < childCount2) {
                                    AbstractC0583w0.g0(linearLayout6.getChildAt(i8));
                                }
                                break;
                            case 2:
                                LinearLayout linearLayout7 = linearLayout4;
                                int childCount3 = linearLayout7.getChildCount();
                                int i9 = i2;
                                if (i9 < childCount3) {
                                    AbstractC0583w0.g0(linearLayout7.getChildAt(i9));
                                }
                                break;
                            case 3:
                                LinearLayout linearLayout8 = linearLayout4;
                                int childCount4 = linearLayout8.getChildCount();
                                int i10 = i2;
                                if (i10 < childCount4) {
                                    AbstractC0583w0.g0(linearLayout8.getChildAt(i10));
                                }
                                break;
                            default:
                                LinearLayout linearLayout9 = linearLayout4;
                                int childCount5 = linearLayout9.getChildCount();
                                int i11 = i2;
                                if (i11 < childCount5) {
                                    AbstractC0583w0.g0(linearLayout9.getChildAt(i11));
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                ArrayList arrayList5 = this.b;
                arrayList5.add(i2, (String) arrayList5.remove(i));
                this.c[0].run();
                final LinearLayout linearLayout5 = this.d;
                final int i7 = 4;
                linearLayout5.post(new Runnable() { // from class: com.github.catvod.spider.merge.z.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                LinearLayout linearLayout6 = linearLayout5;
                                int childCount = linearLayout6.getChildCount();
                                int i8 = i2;
                                if (i8 < childCount) {
                                    AbstractC0583w0.g0(linearLayout6.getChildAt(i8));
                                }
                                break;
                            case 1:
                                LinearLayout linearLayout7 = linearLayout5;
                                int childCount2 = linearLayout7.getChildCount();
                                int i9 = i2;
                                if (i9 < childCount2) {
                                    AbstractC0583w0.g0(linearLayout7.getChildAt(i9));
                                }
                                break;
                            case 2:
                                LinearLayout linearLayout8 = linearLayout5;
                                int childCount3 = linearLayout8.getChildCount();
                                int i10 = i2;
                                if (i10 < childCount3) {
                                    AbstractC0583w0.g0(linearLayout8.getChildAt(i10));
                                }
                                break;
                            case 3:
                                LinearLayout linearLayout9 = linearLayout5;
                                int childCount4 = linearLayout9.getChildCount();
                                int i11 = i2;
                                if (i11 < childCount4) {
                                    AbstractC0583w0.g0(linearLayout9.getChildAt(i11));
                                }
                                break;
                            default:
                                LinearLayout linearLayout10 = linearLayout5;
                                int childCount5 = linearLayout10.getChildCount();
                                int i12 = i2;
                                if (i12 < childCount5) {
                                    AbstractC0583w0.g0(linearLayout10.getChildAt(i12));
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
