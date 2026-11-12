package com.github.catvod.spider.merge.p022z;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0303v1;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.RunnableC0305w0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p017u.T;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0543o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC0543o(ProgressBar progressBar, int i, TextView textView, String str, TextView textView2, String str2) {
        this.a = 2;
        this.d = progressBar;
        this.e = i;
        this.f = textView;
        this.b = str;
        this.g = textView2;
        this.c = str2;
    }

    private final void a() {
        long jCurrentTimeMillis;
        String str = this.b;
        Map map = (Map) this.c;
        Map map2 = (Map) this.d;
        int[] iArr = (int[]) this.f;
        int i = this.e;
        Runnable runnable = (Runnable) this.g;
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            X1.H(str, new HashMap()).close();
            jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
        } catch (Exception unused) {
            jCurrentTimeMillis = -1;
        }
        map.put(str, Long.valueOf(jCurrentTimeMillis));
        InitOrigin.run(new RunnableC0305w0(map2, str, jCurrentTimeMillis, 2));
        synchronized (iArr) {
            try {
                int i2 = iArr[0] + 1;
                iArr[0] = i2;
                if (i2 >= i && runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        final long jCurrentTimeMillis;
        switch (this.a) {
            case 0:
                String str = this.b;
                String str2 = (String) this.c;
                View view = (View) this.f;
                try {
                    InitOrigin.run(new RunnableC0553q(view, AbstractC0303v1.e(str, str2), (String) this.d, this.e, (C0572u) this.g));
                    return;
                } catch (Exception e) {
                    InitOrigin.run(new RunnableC0242b(view, e, 12));
                    return;
                }
            case 1:
                InitOrigin.run(new T(this.b, this.e, (String) this.c, (String) this.d, (String) this.f, "ai_config_" + System.currentTimeMillis(), (InterfaceC0577v) this.g));
                return;
            case 2:
                ProgressBar progressBar = (ProgressBar) this.d;
                if (progressBar != null) {
                    progressBar.setProgress(this.e);
                }
                TextView textView = (TextView) this.f;
                if (textView != null) {
                    textView.setText(this.b);
                }
                TextView textView2 = (TextView) this.g;
                if (textView2 != null) {
                    textView2.setText((String) this.c);
                    return;
                }
                return;
            case 3:
                final K1 k1 = (K1) this.c;
                final String str3 = this.b;
                Context context = (Context) this.d;
                int[] iArr = (int[]) this.f;
                int i = this.e;
                Runnable runnable = (Runnable) this.g;
                k1.getClass();
                try {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    X1.H(str3, k1.a.getHeaders()).close();
                    jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                } catch (Exception unused) {
                    jCurrentTimeMillis = -1;
                }
                k1.b.put(str3, Long.valueOf(jCurrentTimeMillis));
                final Application application = (Application) context;
                InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.z.I1
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str4;
                        int color;
                        int i2;
                        TextView textView3 = (TextView) k1.c.get(str3);
                        if (textView3 == null) {
                            return;
                        }
                        long j = jCurrentTimeMillis;
                        if (j < 0) {
                            color = Color.parseColor("#FFEBEE");
                            i2 = AbstractC0583w0.e;
                            str4 = "超时";
                        } else if (j < 300) {
                            str4 = j + "ms";
                            color = Color.parseColor("#E8F5E9");
                            i2 = AbstractC0583w0.d;
                        } else if (j < 800) {
                            str4 = j + "ms";
                            color = Color.parseColor("#FFF3E0");
                            i2 = AbstractC0583w0.f;
                        } else {
                            str4 = j + "ms";
                            color = Color.parseColor("#FFEBEE");
                            i2 = AbstractC0583w0.e;
                        }
                        textView3.setText(str4);
                        textView3.setTextColor(i2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(AbstractC0583w0.Q(4, application));
                        gradientDrawable.setColor(color);
                        textView3.setBackground(gradientDrawable);
                    }
                });
                synchronized (iArr) {
                    try {
                        int i2 = iArr[0] + 1;
                        iArr[0] = i2;
                        if (i2 >= i && runnable != null) {
                            runnable.run();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 4:
                a();
                return;
            case 5:
                P1.Z0(this.b, (String) this.c, (String) this.d, this.e, (Runnable) this.f, (Runnable) this.g, null);
                return;
            default:
                P1.Z0(this.b, (String) this.c, (String) this.d, this.e, (Runnable) this.f, null, (Callable) this.g);
                return;
        }
    }

    public /* synthetic */ RunnableC0543o(K1 k1, String str, Application application, int[] iArr, int i, G1 g1) {
        this.a = 3;
        this.c = k1;
        this.b = str;
        this.d = application;
        this.f = iArr;
        this.e = i;
        this.g = g1;
    }

    public /* synthetic */ RunnableC0543o(String str, String str2, View view, String str3, int i, C0572u c0572u) {
        this.a = 0;
        this.b = str;
        this.c = str2;
        this.f = view;
        this.d = str3;
        this.e = i;
        this.g = c0572u;
    }

    public /* synthetic */ RunnableC0543o(String str, String str2, String str3, int i, Y y) {
        this.a = 1;
        this.b = "弹幕AI模型";
        this.c = str;
        this.d = str2;
        this.f = str3;
        this.e = i;
        this.g = y;
    }

    public /* synthetic */ RunnableC0543o(String str, String str2, String str3, int i, Runnable runnable, Object obj, int i2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = runnable;
        this.g = obj;
    }

    public /* synthetic */ RunnableC0543o(String str, Map map, Map map2, int[] iArr, int i, V1 v1) {
        this.a = 4;
        this.b = str;
        this.c = map;
        this.d = map2;
        this.f = iArr;
        this.e = i;
        this.g = v1;
    }
}
