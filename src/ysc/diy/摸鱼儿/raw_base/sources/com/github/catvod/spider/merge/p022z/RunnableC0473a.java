package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.A.a2;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.S.a;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0473a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ RunnableC0473a(C0239a c0239a, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = 1;
        this.b = c0239a;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x028b  */
    /* JADX WARN: Code duplicated, block: B:123:0x029a  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:129:0x02af  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String string;
        TextView textView;
        ArrayList arrayList;
        LinkedHashSet linkedHashSet;
        boolean zContainsAll;
        String str3;
        String str4 = "";
        Object obj = this.b;
        Object obj2 = this.c;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.h;
        switch (this.a) {
            case 0:
                String[][] strArr = (String[][]) obj7;
                C0239a c0239a = (C0239a) obj;
                String str5 = (String) obj4;
                String str6 = (String) obj3;
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity != null && !activity.isFinishing()) {
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            str = (String) obj2;
                            if (i < length) {
                                String[] strArr2 = strArr[i];
                                if (strArr2[0].equals(str)) {
                                    str2 = strArr2[1];
                                } else {
                                    i++;
                                }
                            } else {
                                str2 = "";
                            }
                        }
                        String str7 = (String) obj6;
                        String str8 = (str7 == null || str7.isEmpty()) ? "该主播" : str7;
                        int iE = C0538n.e(str);
                        String str9 = "是否关注 " + str8 + "？";
                        String[] strArr3 = {"平台", str2};
                        StringBuilder sb = new StringBuilder();
                        sb.append(str8);
                        String str10 = (String) obj5;
                        if (str10 != null && !str10.isEmpty()) {
                            str4 = " - " + str10;
                        }
                        sb.append(str4);
                        String[][] strArr4 = {strArr3, new String[]{"主播", sb.toString()}};
                        int i2 = AbstractC0583w0.a;
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity, "关注提醒", str9, iE, strArr4, new int[]{iE, AbstractC0583w0.d}, new String[]{"关注", "下次再说"}, new Runnable[]{new RunnableC0473a(c0239a, str, str5, str7, str6, str10, str8), null}));
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                ((C0239a) obj).getClass();
                C0239a.d((String) obj2, (String) obj6, (String) obj5, (String) obj4, (String) obj3);
                X0.a("已关注 " + ((String) obj7));
                break;
            case 2:
                ((K1) obj7).getClass();
                Runnable runnable = ((Runnable[]) obj3)[0];
                LinearLayout linearLayout = (LinearLayout) obj2;
                linearLayout.getContext();
                linearLayout.removeAllViews();
                Set set = (Set) obj4;
                Iterator it = set.iterator();
                int i3 = 0;
                while (true) {
                    List<String> list = (List) obj5;
                    if (!it.hasNext()) {
                        Iterator it2 = list.iterator();
                        int i4 = 0;
                        while (it2.hasNext()) {
                            if (set.contains((String) it2.next())) {
                                i4++;
                            }
                        }
                        if (list.isEmpty()) {
                            string = "当前模板没有返回默认列表";
                        } else {
                            StringBuilder sb2 = new StringBuilder("已选 ");
                            sb2.append(i4);
                            sb2.append(" / ");
                            sb2.append(list.size());
                            sb2.append(i3 > 0 ? b.h(" · 自定义 ", i3, " 个") : "");
                            string = sb2.toString();
                        }
                        ((TextView) obj6).setText(string);
                        int i5 = 0;
                        for (String str11 : list) {
                            boolean zContains = set.contains(str11);
                            AbstractC0583w0.d(linearLayout, str11, zContains ? "已选" : "点击选择", zContains ? AbstractC0583w0.d : AbstractC0583w0.c, i5 > 0).setOnClickListener(new K(set, str11, (Object) runnable, 4));
                            i5++;
                            if (i5 >= 80) {
                                if (i5 == 0) {
                                    AbstractC0583w0.l(linearLayout, "没有默认列表");
                                }
                                textView = ((TextView[]) obj)[0];
                                arrayList = (ArrayList) list;
                                linkedHashSet = (LinkedHashSet) set;
                                if (textView != null) {
                                    if (arrayList.isEmpty()) {
                                        zContainsAll = !linkedHashSet.isEmpty();
                                    } else {
                                        zContainsAll = linkedHashSet.containsAll(arrayList);
                                    }
                                    if (zContainsAll) {
                                        str3 = "全不选";
                                    } else {
                                        str3 = "全选";
                                    }
                                    textView.setText(str3);
                                }
                                break;
                            }
                        }
                        if (i5 == 0) {
                            AbstractC0583w0.l(linearLayout, "没有默认列表");
                        }
                        textView = ((TextView[]) obj)[0];
                        arrayList = (ArrayList) list;
                        linkedHashSet = (LinkedHashSet) set;
                        if (textView != null) {
                            if (arrayList.isEmpty()) {
                                zContainsAll = !linkedHashSet.isEmpty();
                            } else {
                                zContainsAll = linkedHashSet.containsAll(arrayList);
                            }
                            if (zContainsAll) {
                                str3 = "全不选";
                            } else {
                                str3 = "全选";
                            }
                            textView.setText(str3);
                        }
                        break;
                    } else if (!list.contains((String) it.next())) {
                        i3++;
                    }
                }
                break;
            case 3:
                a aVar = (a) obj2;
                int[] iArr = (int[]) obj6;
                AlertDialog alertDialog = (AlertDialog) obj4;
                C2.m((Context) obj7, (C0590x2) ((ArrayList) aVar.e).get(iArr[0]), (LinearLayout) obj5, alertDialog);
                int size = ((ArrayList) aVar.e).size();
                boolean z = size > 1;
                boolean z2 = iArr[0] == size + (-1);
                TextView textView2 = (TextView) obj3;
                textView2.setText(z ? (iArr[0] + 1) + " / " + size : "");
                textView2.setVisibility(z ? 0 : 8);
                boolean z3 = iArr[0] > 0;
                Button button = alertDialog.getButton(-2);
                if (button != null) {
                    button.setVisibility(z ? 0 : 8);
                    button.setEnabled(z3);
                    button.setFocusable(z && z3);
                    button.setFocusableInTouchMode(z && z3);
                    button.setAlpha(z3 ? 1.0f : 0.45f);
                }
                Button button2 = alertDialog.getButton(-1);
                if (button2 != null) {
                    button2.setText(z2 ? (String) aVar.d : "下一页");
                    button2.setEnabled(true);
                    button2.setFocusable(true);
                    button2.setFocusableInTouchMode(true);
                    button2.setAlpha(1.0f);
                    button2.setTextColor(z2 ? aVar.b : AbstractC0583w0.p);
                }
                Button button3 = alertDialog.getButton(-2);
                Button button4 = alertDialog.getButton(-1);
                if (button4 != null) {
                    C2.i(button4);
                    if (AbstractC0583w0.Z(button3)) {
                        C2.i(button3);
                        button3.setNextFocusLeftId(button4.getId());
                        button3.setNextFocusRightId(button4.getId());
                        button3.setNextFocusUpId(button3.getId());
                        button3.setNextFocusDownId(button3.getId());
                        button4.setNextFocusLeftId(button3.getId());
                        button4.setNextFocusRightId(button3.getId());
                        button4.setNextFocusUpId(button4.getId());
                        button4.setNextFocusDownId(button4.getId());
                    } else {
                        button4.setNextFocusLeftId(button4.getId());
                        button4.setNextFocusRightId(button4.getId());
                        button4.setNextFocusUpId(button4.getId());
                        button4.setNextFocusDownId(button4.getId());
                    }
                }
                ((ScrollView) obj).scrollTo(0, 0);
                break;
            default:
                X1 x1 = (X1) obj7;
                x1.getClass();
                AlertDialog[] alertDialogArr = (AlertDialog[]) obj6;
                AlertDialog alertDialog2 = alertDialogArr[0];
                if (alertDialog2 != null && alertDialog2.isShowing()) {
                    EditText editText = (EditText) obj5;
                    String strE = AbstractC0449a.e(editText);
                    EditText editText2 = (EditText) obj4;
                    String strE2 = AbstractC0449a.e(editText2);
                    String strE3 = AbstractC0449a.e((EditText) obj3);
                    if (strE.isEmpty()) {
                        X0.a("请填写WebDAV地址");
                        editText.requestFocus();
                    } else if (!strE.startsWith("https://") && !strE.startsWith("http://")) {
                        X0.a("WebDAV地址需以 http:// 或 https:// 开头");
                        editText.requestFocus();
                    } else if (strE2.isEmpty()) {
                        X0.a("请填写用户名");
                        editText2.requestFocus();
                    } else {
                        if (!strE.endsWith("/")) {
                            strE = strE.concat("/");
                        }
                        ((a2) ((X1) x1.b).b).t(strE, strE2, strE3);
                        P1.H1((String) obj2);
                        alertDialogArr[0].dismiss();
                        X0.a("WebDAV连接已保存");
                        Runnable runnable2 = (Runnable) obj;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0473a(X1 x1, AlertDialog[] alertDialogArr, EditText editText, EditText editText2, EditText editText3, String str, Runnable runnable) {
        this.a = 4;
        this.h = x1;
        this.d = alertDialogArr;
        this.e = editText;
        this.f = editText2;
        this.g = editText3;
        this.c = str;
        this.b = runnable;
    }

    public /* synthetic */ RunnableC0473a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.a = i;
        this.h = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.b = obj7;
    }

    public /* synthetic */ RunnableC0473a(String[][] strArr, String str, String str2, String str3, C0239a c0239a, String str4, String str5) {
        this.a = 0;
        this.h = strArr;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.b = c0239a;
        this.f = str4;
        this.g = str5;
    }
}
