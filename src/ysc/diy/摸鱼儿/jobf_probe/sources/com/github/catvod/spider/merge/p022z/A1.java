package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.github.catvod.spider.merge.S.a;
import com.github.catvod.spider.merge.p017u.ViewOnClickListenerC0467t;
import java.util.ArrayList;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class A1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ A1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                K1 k1 = (K1) this.b;
                k1.getClass();
                AlertDialog alertDialog = (AlertDialog) this.c;
                Button button = alertDialog.getButton(-1);
                EditText editText = (EditText) this.d;
                int[] iArr = (int[]) this.e;
                String str = (String) this.f;
                button.setOnClickListener(new ViewOnClickListenerC0467t(k1, editText, iArr, str, alertDialog));
                alertDialog.getButton(-3).setOnClickListener(new Z(str, 3));
                break;
            default:
                ((InterfaceC0600z2) this.b).b();
                ((Runnable) this.c).run();
                AbstractC0583w0.g0((TextView) (((ArrayList) ((a) this.d).e).size() > 1 ? this.e : this.f));
                break;
        }
    }
}
