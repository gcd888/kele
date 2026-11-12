package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p000a.RunnableC0383v0;
import com.github.catvod.spider.merge.p006g.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.Call;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class M implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ M(EditText editText, String str, String[] strArr, boolean[] zArr, String[] strArr2) {
        this.a = 0;
        this.b = editText;
        this.c = strArr;
        this.e = zArr;
        this.d = strArr2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                boolean[] zArr = (boolean[]) this.e;
                boolean z = zArr[0];
                EditText editText = (EditText) this.b;
                String[] strArr = (String[]) this.c;
                if (!z) {
                    editText.setText(strArr[0]);
                    editText.setFocusable(true);
                    editText.setFocusableInTouchMode(true);
                    editText.setCursorVisible(true);
                    editText.setLongClickable(true);
                    editText.setSelection(editText.getText().length());
                    zArr[0] = true;
                } else {
                    String string = editText.getText().toString();
                    if (!string.trim().isEmpty()) {
                        strArr[0] = string;
                    }
                    String strQ0 = P1.q0(strArr[0]);
                    ((String[]) this.d)[0] = strQ0;
                    editText.setText(strQ0);
                    editText.setFocusable(false);
                    editText.setFocusableInTouchMode(false);
                    editText.setCursorVisible(false);
                    editText.setLongClickable(false);
                    zArr[0] = false;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.b;
                boolean z2 = !arrayList.equals((List) this.c);
                ((a) this.d).y(new ArrayList(arrayList));
                InitOrigin.execute(new RunnableC0383v0(3, z2));
                X0.a("弹幕源配置已保存");
                ((AlertDialog) this.e).dismiss();
                break;
            case 2:
                H0 h0 = (H0) this.b;
                TextView textView = (TextView) this.c;
                TextView textView2 = (TextView) this.d;
                TextView textView3 = (TextView) this.e;
                h0.b = true;
                h0.a = false;
                Call call = h0.c;
                if (call != null) {
                    call.cancel();
                }
                if (textView != null) {
                    textView.setEnabled(false);
                }
                textView2.setEnabled(false);
                if (textView3 != null) {
                    textView3.setText("正在取消");
                }
                break;
            case 3:
                C0559r1 c0559r1 = (C0559r1) this.b;
                ((InterfaceC0545o1) c0559r1.a).logoutEmby((JSONObject) this.c);
                X0.a("已退出当前设备登录: " + ((String) this.d));
                ((AlertDialog) this.e).dismiss();
                c0559r1.p();
                break;
            case 4:
                K1 k1 = (K1) this.b;
                k1.getClass();
                GradientDrawable gradientDrawable = ((GradientDrawable[]) this.e)[0];
                k1.e.setText("测速中...");
                k1.e.setEnabled(false);
                gradientDrawable.setColor(AbstractC0583w0.i);
                k1.e.setBackground(gradientDrawable);
                Iterator it = k1.c.values().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Context context = (Context) this.c;
                    if (!zHasNext) {
                        G1 g1 = new G1(k1, gradientDrawable, 0);
                        int[] iArr = {0};
                        List list = (List) this.d;
                        int size = list.size();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            InitOrigin.execute(new RunnableC0543o(k1, (String) it2.next(), (Application) context, iArr, size, g1));
                        }
                    } else {
                        TextView textView4 = (TextView) it.next();
                        textView4.setText("...");
                        textView4.setTextColor(AbstractC0583w0.i);
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setCornerRadius(AbstractC0583w0.Q(4, context));
                        gradientDrawable2.setColor(AbstractC0583w0.j);
                        textView4.setBackground(gradientDrawable2);
                    }
                    break;
                }
                break;
            case 5:
                List list2 = (List) this.c;
                ArrayList arrayList2 = (ArrayList) list2;
                Set set = (Set) this.d;
                LinkedHashSet linkedHashSet = (LinkedHashSet) set;
                ((K1) this.b).getClass();
                if (arrayList2.isEmpty() ? !linkedHashSet.isEmpty() : linkedHashSet.containsAll(arrayList2)) {
                    set.removeAll(list2);
                } else {
                    set.addAll(list2);
                }
                ((Runnable[]) this.e)[0].run();
                break;
            case 6:
                int[] iArr2 = (int[]) this.b;
                int i = iArr2[0];
                if (i > 0) {
                    iArr2[0] = i - 1;
                    ((Runnable) this.c).run();
                    AbstractC0583w0.g0(iArr2[0] > 0 ? (Button) this.d : ((AlertDialog) this.e).getButton(-1));
                    break;
                }
                break;
            default:
                int[] iArr3 = (int[]) this.b;
                int i2 = iArr3[0];
                if (i2 > 0) {
                    iArr3[0] = i2 - 1;
                    ((Runnable) this.c).run();
                    AbstractC0583w0.g0((TextView) (iArr3[0] > 0 ? this.d : this.e));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ M(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
