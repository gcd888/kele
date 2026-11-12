package com.github.catvod.spider.merge.p022z;

import android.view.View;
import android.widget.TextView;
import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0598z0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ int g;

    public /* synthetic */ ViewOnClickListenerC0598z0(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                P1.r1(this.g, (String) this.b, (String) this.c, (String) this.d, (String) this.e, (String) this.f);
                break;
            case 1:
                P1.r1(this.g, (String) this.b, (String) this.c, (String) this.d, (String) this.e, (String) this.f);
                break;
            default:
                int[] iArr = (int[]) this.b;
                int i = this.g;
                iArr[0] = i;
                int i2 = 0;
                while (i2 < ((String[]) this.c).length) {
                    int i3 = i2 == i ? 1 : 0;
                    TextView[] textViewArr = (TextView[]) this.d;
                    TextView textView = textViewArr[i2];
                    int[] iArr2 = (int[]) this.e;
                    textView.setTextColor(i3 != 0 ? iArr2[i2] : AbstractC0583w0.g);
                    textViewArr[i2].setTypeface(null, i3);
                    TextView[] textViewArr2 = (TextView[]) this.f;
                    textViewArr2[i2].setText(i3 != 0 ? "●" : "○");
                    textViewArr2[i2].setTextColor(i3 != 0 ? iArr2[i2] : AbstractC0583w0.i);
                    i2++;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ViewOnClickListenerC0598z0(int[] iArr, int i, String[] strArr, TextView[] textViewArr, int[] iArr2, TextView[] textViewArr2) {
        this.a = 2;
        this.b = iArr;
        this.g = i;
        this.c = strArr;
        this.d = textViewArr;
        this.e = iArr2;
        this.f = textViewArr2;
    }
}
