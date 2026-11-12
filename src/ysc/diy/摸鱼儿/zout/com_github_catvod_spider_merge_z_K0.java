package com.github.catvod.spider.merge.p022z;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0524k0 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ViewOnClickListenerC0524k0(C0544o0 c0544o0, boolean[] zArr, int i, InterfaceC0578v0 interfaceC0578v0) {
        this.d = c0544o0;
        this.b = zArr;
        this.c = i;
        this.e = interfaceC0578v0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                boolean zS = AbstractC0583w0.S((View) this.d);
                boolean[] zArr = this.b;
                int i = this.c;
                if (zArr != null && i < zArr.length) {
                    zArr[i] = zS;
                }
                InterfaceC0578v0 interfaceC0578v0 = (InterfaceC0578v0) this.e;
                if (interfaceC0578v0 != null) {
                    interfaceC0578v0.g(i, zS);
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                int i2 = this.c;
                boolean z = !zArr2[i2];
                zArr2[i2] = z;
                TextView[] textViewArr = (TextView[]) this.d;
                textViewArr[i2].setTextColor(z ? AbstractC0583w0.e : AbstractC0583w0.g);
                textViewArr[i2].setTypeface(null, zArr2[i2] ? 1 : 0);
                ((TextView[]) this.e)[i2].setText(zArr2[i2] ? "x" : "");
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0524k0(boolean[] zArr, int i, TextView[] textViewArr, TextView[] textViewArr2) {
        this.b = zArr;
        this.c = i;
        this.d = textViewArr;
        this.e = textViewArr2;
    }
}
