package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.H0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class U0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ U0(EditText editText, EditText editText2, String str, String str2, AlertDialog[] alertDialogArr, InterfaceC0549p0 interfaceC0549p0) {
        this.a = 2;
        this.d = editText;
        this.e = editText2;
        this.c = str;
        this.b = str2;
        this.f = alertDialogArr;
        this.g = interfaceC0549p0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        switch (this.a) {
            case 0:
                ((C0559r1) this.c).getClass();
                final EditText editText = (EditText) this.d;
                String string = editText.getText().toString();
                final EditText editText2 = (EditText) this.e;
                String string2 = editText2.getText().toString();
                final EditText editText3 = (EditText) this.f;
                String string3 = editText3.getText().toString();
                final EditText editText4 = (EditText) this.g;
                C0559r1.s((Activity) ((Context) this.b), string, string2, string3, editText4.getText().toString(), new InterfaceC0550p1() { // from class: com.github.catvod.spider.merge.z.Y0
                    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0550p1
                    public final void a(String[] strArr) {
                        editText2.setText(strArr[1]);
                        editText3.setText(strArr[2]);
                        editText.setText(strArr[3]);
                        editText4.setText(strArr[4]);
                        X0.a("已应用: " + strArr[0]);
                    }
                });
                break;
            case 1:
                TextView textView = (TextView) this.c;
                textView.setText("测速中...");
                textView.setEnabled(false);
                int i = AbstractC0583w0.i;
                Context context = (Context) this.b;
                textView.setBackground(AbstractC0583w0.L(context, i, 8));
                V1 v1 = new V1(textView, (Activity) context, 0);
                ArrayList arrayList = new ArrayList();
                List list = (List) this.d;
                if (list != null) {
                    arrayList.addAll(list);
                }
                List list2 = (List) this.e;
                if (list2 != null) {
                    arrayList.addAll(list2);
                }
                if (!arrayList.isEmpty()) {
                    int[] iArr = {0};
                    int size = arrayList.size();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        InitOrigin.execute(new RunnableC0543o((String) it.next(), (Map) this.f, (Map) this.g, iArr, size, v1));
                    }
                } else {
                    v1.run();
                }
                break;
            default:
                String strE = AbstractC0449a.e((EditText) this.d);
                String strE2 = AbstractC0449a.e((EditText) this.e);
                if (strE.isEmpty() || strE2.isEmpty()) {
                    X0.a("请输入" + ((String) this.c) + "和密码");
                } else {
                    H0.a.getClass();
                    H0.k((String) this.b);
                    ((AlertDialog[]) this.f)[0].dismiss();
                    ((InterfaceC0549p0) this.g).b(strE, strE2);
                }
                break;
        }
    }

    public /* synthetic */ U0(Object obj, Activity activity, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.b = activity;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }
}
