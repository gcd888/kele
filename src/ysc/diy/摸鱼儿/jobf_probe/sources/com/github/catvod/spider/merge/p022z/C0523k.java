package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.B;
import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.f0.i;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0523k implements InterfaceC0573u0 {
    public final Object a;
    public final Serializable b;
    public final Object c;
    public Object d;

    public C0523k(String str, String str2) {
        this.c = new ArrayList();
        this.a = str;
        this.b = str2;
    }

    public void a(String str) {
        Activity activity;
        try {
            activity = InitOrigin.getActivity();
        } catch (Exception unused) {
            activity = null;
        }
        if (activity == null) {
            P1.V("请在应用界面中操作");
            return;
        }
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            arrayList.add(new T1("帮助"));
        }
        int iQ = AbstractC0583w0.Q(8, activity);
        int size = arrayList.size();
        int[] iArr = {0};
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        TextView textView = new TextView(activity);
        textView.setTextColor(AbstractC0583w0.h);
        textView.setTextSize(AbstractC0583w0.h0(activity) ? 13.0f : 12.0f);
        textView.setGravity(8388629);
        textView.setSingleLine(true);
        textView.setPadding(AbstractC0583w0.Q(10, activity), 0, 0, 0);
        LinearLayout linearLayoutQ = AbstractC0583w0.q(activity, (String) this.a, (String) this.b, AbstractC0583w0.c);
        linearLayoutQ.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayoutK.addView(linearLayoutQ, AbstractC0583w0.c0(iQ));
        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
        linearLayoutY.setDescendantFocusability(262144);
        linearLayoutK.addView(linearLayoutY);
        C0533m c0533mQ0 = AbstractC0583w0.q0(linearLayoutK);
        AlertDialog.Builder cancelable = new AlertDialog.Builder(activity).setView(c0533mQ0).setPositiveButton(str, (DialogInterface.OnClickListener) null).setCancelable(true);
        if (size > 1) {
            cancelable.setNeutralButton("上一页", (DialogInterface.OnClickListener) null);
            cancelable.setNegativeButton("下一页", (DialogInterface.OnClickListener) null);
        }
        AlertDialog alertDialogCreate = cancelable.create();
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.github.catvod.spider.merge.z.R1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                P1.o = false;
            }
        });
        S1 s1 = new S1(this, iArr, activity, linearLayoutY, textView, size, alertDialogCreate, c0533mQ0, linearLayoutK);
        try {
            try {
                alertDialogCreate.show();
                AbstractC0583w0.l0(alertDialogCreate, 0.0f);
                Button button = alertDialogCreate.getButton(-3);
                Button button2 = alertDialogCreate.getButton(-2);
                if (button != null) {
                    button.setOnClickListener(new B(iArr, s1, 3));
                }
                if (button2 != null) {
                    button2.setOnClickListener(new D(iArr, size, s1, 1));
                }
                s1.run();
            } catch (Exception unused2) {
                alertDialogCreate.dismiss();
                P1.V("显示帮助失败");
            }
        } catch (Exception unused3) {
            P1.V("显示帮助失败");
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0573u0
    public void c(int i, int i2) {
        ((C0239a) this.a).getClass();
        try {
            JSONArray jSONArrayK = C0239a.k();
            if (i >= 0 && i2 >= 0 && i < jSONArrayK.length() && i2 < jSONArrayK.length()) {
                JSONObject jSONObject = jSONArrayK.getJSONObject(i);
                jSONArrayK.put(i, jSONArrayK.getJSONObject(i2));
                jSONArrayK.put(i2, jSONObject);
                C0297t1.j("alllive_fav_cats.json", jSONArrayK.toString());
            }
        } catch (Exception e) {
            b.D(e, new StringBuilder("[ALLLiveStorage] swapFavCategories error: "));
        }
        AlertDialog alertDialog = ((AlertDialog[]) this.b)[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        ((C0538n) this.d).h((i) this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0523k(C0538n c0538n, C0239a c0239a, AlertDialog[] alertDialogArr, i iVar) {
        this.d = c0538n;
        this.a = c0239a;
        this.b = alertDialogArr;
        this.c = iVar;
    }
}
