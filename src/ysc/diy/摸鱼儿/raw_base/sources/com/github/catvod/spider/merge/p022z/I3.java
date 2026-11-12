package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.D.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class I3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ I3(Bitmap bitmap, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, int i) {
        this.a = 2;
        this.c = bitmap;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = arrayList;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ImageView imageView;
        switch (this.a) {
            case 0:
                ArrayList arrayListZ = P1.Z();
                int iMax = Math.max(1, (arrayListZ.size() + 4) / 5);
                int[] iArr = (int[]) this.c;
                int i = iMax - 1;
                iArr[0] = Math.max(0, Math.min(iArr[0], i));
                ((TextView) this.d).setText((iArr[0] + 1) + " / " + iMax + " · 共 " + arrayListZ.size() + " 部");
                LinearLayout linearLayout = (LinearLayout) this.e;
                linearLayout.removeAllViews();
                boolean zIsEmpty = arrayListZ.isEmpty();
                Context context = (Context) this.f;
                if (zIsEmpty) {
                    linearLayout.addView(AbstractC0583w0.D((Activity) context, "暂无已订阅追更"));
                } else {
                    int i2 = iArr[0] * 5;
                    int iMin = Math.min(arrayListZ.size(), i2 + 5);
                    for (int i3 = i2; i3 < iMin; i3++) {
                        JSONObject jSONObject = (JSONObject) arrayListZ.get(i3);
                        LinearLayout linearLayoutA = AbstractC0484c0.a((Activity) context, jSONObject.optString("posterPath"), jSONObject.optString("name", "未命名剧集"), P1.X(jSONObject), AbstractC0583w0.e, new RunnableC0242b(jSONObject, (Runnable[]) this.g, 28));
                        if (i3 == i2) {
                            linearLayout.addView(linearLayoutA);
                        } else {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.topMargin = this.b;
                            linearLayout.addView(linearLayoutA, layoutParams);
                        }
                    }
                }
                ScrollView scrollView = (ScrollView) this.h;
                scrollView.scrollTo(0, 0);
                AlertDialog alertDialog = (AlertDialog) this.i;
                AbstractC0583w0.n0(alertDialog.getButton(-3), arrayListZ.size() > 5, iArr[0] > 0);
                AbstractC0583w0.n0(alertDialog.getButton(-2), arrayListZ.size() > 5, iArr[0] < i);
                AbstractC0583w0.o(scrollView, linearLayout);
                AbstractC0583w0.f0(alertDialog);
                break;
            case 1:
                String str = (String) this.c;
                h4.a.post(new S1(h4.e(str), (String) this.d, str, (String) this.e, (String) this.f, (String) this.g, this.b, (ArrayList) ((List) this.h), (String) this.i));
                break;
            default:
                Bitmap bitmap = (Bitmap) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                String str4 = (String) this.f;
                String str5 = (String) this.g;
                String str6 = (String) this.h;
                int i4 = this.b;
                try {
                    Application applicationContext = InitOrigin.context();
                    if (applicationContext != null) {
                        FrameLayout frameLayout = new FrameLayout(applicationContext);
                        int i5 = h4.b;
                        frameLayout.setBackgroundColor(i5);
                        ImageView imageView2 = new ImageView(applicationContext);
                        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        imageView2.setBackgroundColor(i5);
                        imageView2.setImageBitmap(bitmap);
                        imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        frameLayout.addView(imageView2);
                        final ProgressBar progressBar = new ProgressBar(applicationContext);
                        progressBar.setVisibility(8);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0583w0.Q(48, applicationContext), AbstractC0583w0.Q(48, applicationContext));
                        layoutParams2.gravity = 17;
                        progressBar.setLayoutParams(layoutParams2);
                        frameLayout.addView(progressBar);
                        Dialog dialog = new Dialog(InitOrigin.getActivity());
                        dialog.requestWindowFeature(1);
                        dialog.setContentView(frameLayout);
                        final String[] strArr = {str2, str3, str4, str5, str6};
                        frameLayout.addView(h4.c(applicationContext, dialog, str4, str2, str5, str6, strArr));
                        final LinearLayout[] linearLayoutArr = new LinearLayout[2];
                        List list = (List) this.i;
                        if (list == null || list.size() <= 1) {
                            imageView = imageView2;
                        } else {
                            final int[] iArr2 = {i4};
                            linearLayoutArr[0] = h4.h(applicationContext, true);
                            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(AbstractC0583w0.Q(48, applicationContext), AbstractC0583w0.Q(96, applicationContext));
                            layoutParams3.gravity = 8388627;
                            linearLayoutArr[0].setLayoutParams(layoutParams3);
                            final ArrayList arrayList = (ArrayList) list;
                            final int i6 = 0;
                            imageView = imageView2;
                            linearLayoutArr[0].setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.a4
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i6) {
                                        case 0:
                                            int[] iArr3 = iArr2;
                                            int size = iArr3[0] - 1;
                                            List list2 = arrayList;
                                            if (size < 0) {
                                                size = list2.size() - 1;
                                            }
                                            int i7 = size;
                                            LinearLayout[] linearLayoutArr2 = linearLayoutArr;
                                            h4.i((ArrayList) list2, i7, iArr3, strArr, imageView, progressBar, linearLayoutArr2[0], linearLayoutArr2[1]);
                                            break;
                                        default:
                                            int[] iArr4 = iArr2;
                                            int i8 = iArr4[0] + 1;
                                            List list3 = arrayList;
                                            int i9 = i8 >= list3.size() ? 0 : i8;
                                            LinearLayout[] linearLayoutArr3 = linearLayoutArr;
                                            int i10 = i9;
                                            h4.i((ArrayList) list3, i10, iArr4, strArr, imageView, progressBar, linearLayoutArr3[0], linearLayoutArr3[1]);
                                            break;
                                    }
                                }
                            });
                            frameLayout.addView(linearLayoutArr[0]);
                            linearLayoutArr[1] = h4.h(applicationContext, false);
                            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC0583w0.Q(48, applicationContext), AbstractC0583w0.Q(96, applicationContext));
                            layoutParams4.gravity = 8388629;
                            linearLayoutArr[1].setLayoutParams(layoutParams4);
                            final ArrayList arrayList2 = (ArrayList) list;
                            final int i7 = 1;
                            linearLayoutArr[1].setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.a4
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i7) {
                                        case 0:
                                            int[] iArr3 = iArr2;
                                            int size = iArr3[0] - 1;
                                            List list2 = arrayList2;
                                            if (size < 0) {
                                                size = list2.size() - 1;
                                            }
                                            int i8 = size;
                                            LinearLayout[] linearLayoutArr2 = linearLayoutArr;
                                            h4.i((ArrayList) list2, i8, iArr3, strArr, imageView, progressBar, linearLayoutArr2[0], linearLayoutArr2[1]);
                                            break;
                                        default:
                                            int[] iArr4 = iArr2;
                                            int i9 = iArr4[0] + 1;
                                            List list3 = arrayList2;
                                            int i10 = i9 >= list3.size() ? 0 : i9;
                                            LinearLayout[] linearLayoutArr3 = linearLayoutArr;
                                            int i11 = i10;
                                            h4.i((ArrayList) list3, i11, iArr4, strArr, imageView, progressBar, linearLayoutArr3[0], linearLayoutArr3[1]);
                                            break;
                                    }
                                }
                            });
                            frameLayout.addView(linearLayoutArr[1]);
                        }
                        final ImageView imageView3 = imageView;
                        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.github.catvod.spider.merge.z.b4
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                LinearLayout[] linearLayoutArr2 = linearLayoutArr;
                                if (linearLayoutArr2[0] != null) {
                                    ImageView imageView4 = imageView3;
                                    imageView4.post(new W3(imageView4, linearLayoutArr2, 1));
                                }
                            }
                        });
                        dialog.show();
                        Window window = dialog.getWindow();
                        if (window != null) {
                            window.setBackgroundDrawable(new ColorDrawable(0));
                            window.setWindowAnimations(0);
                            window.setLayout(-1, -1);
                            window.addFlags(1024);
                            AbstractC0583w0.e0(dialog, i5, 0);
                        }
                    }
                } catch (Exception e) {
                    b.D(e, new StringBuilder("[WallpaperDialog] showPreviewDialog error: "));
                }
                break;
        }
    }

    public /* synthetic */ I3(Serializable serializable, Object obj, Object obj2, Object obj3, Serializable serializable2, int i, Object obj4, Object obj5, int i2) {
        this.a = i2;
        this.c = serializable;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = serializable2;
        this.b = i;
        this.h = obj4;
        this.i = obj5;
    }
}
