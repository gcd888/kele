package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.E;
import com.github.catvod.spider.merge.p017u.F;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0508h implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ RunnableC0508h(C0538n c0538n, C0239a c0239a, String str, String str2, Runnable runnable, String str3, String str4, String str5) {
        this.d = c0538n;
        this.e = c0239a;
        this.b = str;
        this.c = str2;
        this.i = runnable;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str;
        int i;
        switch (this.a) {
            case 0:
                C0538n c0538n = (C0538n) this.d;
                c0538n.getClass();
                ((C0239a) this.e).getClass();
                String str2 = this.b;
                String str3 = (String) this.c;
                boolean zH = C0239a.h(str2, str3);
                Runnable runnable = (Runnable) this.i;
                if (zH) {
                    X0.a("该直播间已在关注列表");
                    c0538n.i(runnable);
                } else {
                    String str4 = (String) this.g;
                    String str5 = (String) this.h;
                    String str6 = (String) this.f;
                    C0239a.d(str2, str3, str6, str4, str5);
                    if (runnable != null) {
                        runnable.run();
                    }
                    StringBuilder sb = new StringBuilder("已关注 ");
                    if (!str6.isEmpty()) {
                        str3 = str6;
                    }
                    sb.append(str3);
                    X0.a(sb.toString());
                    c0538n.i(runnable);
                }
                break;
            case 1:
                AlertDialog[] alertDialogArr = (AlertDialog[]) this.d;
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null && alertDialog.isShowing()) {
                    boolean z = ((boolean[]) this.f)[0];
                    String str7 = ((String[]) this.g)[0];
                    String str8 = ((String[]) this.h)[0];
                    String strE = AbstractC0449a.e((EditText) this.e);
                    if (!z && strE.equals(str8)) {
                        strE = str7 == null ? "" : str7.trim();
                    }
                    if ("Cookie".equalsIgnoreCase(this.b)) {
                        strE = P1.u0(strE);
                    }
                    if (!strE.isEmpty()) {
                        InitOrigin.execute(new RunnableC0242b((Q) this.i, strE, 17));
                    }
                    P1.H1((String) this.c);
                    alertDialogArr[0].dismiss();
                    break;
                }
                break;
            default:
                Map map = (Map) this.d;
                List<String> list = (List) this.e;
                List<String> list2 = (List) this.c;
                Map map2 = (Map) this.f;
                Runnable runnable2 = (Runnable) this.i;
                Runnable runnable3 = (Runnable) this.h;
                try {
                    Activity activity = InitOrigin.getActivity();
                    map.clear();
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                    linearLayoutK.addView(AbstractC0583w0.p(activity, "解析接口", "点击选择或测速接口延迟"), layoutParams);
                    TextView textViewX = AbstractC0583w0.x(activity, "测速所有接口", AbstractC0583w0.d);
                    textViewX.setFocusable(true);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.bottomMargin = AbstractC0583w0.Q(12, activity);
                    linearLayoutK.addView(textViewX, layoutParams2);
                    AlertDialog[] alertDialogArr2 = new AlertDialog[1];
                    textViewX.setOnClickListener(new U0(textViewX, activity, list, list2, map2, map, 1));
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    String str9 = this.b;
                    E e = (E) this.g;
                    if (list == null || list.isEmpty()) {
                        str = str9;
                        i = 0;
                    } else {
                        AbstractC0583w0.g(linearLayout, "预设接口");
                        i = 0;
                        for (String str10 : list) {
                            if (i > 0) {
                                linearLayout.addView(AbstractC0583w0.C(activity));
                            }
                            W1.a(linearLayout, activity, str10, str10.equals(str9), i, map2, map, alertDialogArr2, e);
                            str9 = str9;
                            i++;
                        }
                        str = str9;
                    }
                    if (list2 != null && !list2.isEmpty()) {
                        AbstractC0583w0.g(linearLayout, "自定义接口 (" + list2.size() + "个)");
                        for (String str11 : list2) {
                            if (i > 0) {
                                linearLayout.addView(AbstractC0583w0.C(activity));
                            }
                            W1.a(linearLayout, activity, str11, str11.equals(str), i, map2, map, alertDialogArr2, e);
                            i++;
                        }
                    }
                    linearLayoutK.addView(AbstractC0583w0.s(activity, linearLayout));
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayoutK).setPositiveButton("添加接口", new E((F) runnable2, 5)).setNeutralButton("管理接口", new E((F) runnable3, 6)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                    alertDialogArr2[0] = alertDialogCreate;
                    AbstractC0583w0.j0(alertDialogCreate);
                } catch (Exception e2) {
                    SpiderDebug.log("[Kan360Dialog] showParseSelect: " + e2.getMessage());
                    X0.a("显示失败");
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0508h(Map map, List list, List list2, Map map2, String str, E e, F f, F f2) {
        this.d = map;
        this.e = list;
        this.c = list2;
        this.f = map2;
        this.b = str;
        this.g = e;
        this.i = f;
        this.h = f2;
    }

    public /* synthetic */ RunnableC0508h(AlertDialog[] alertDialogArr, String str, EditText editText, boolean[] zArr, String[] strArr, String[] strArr2, Q q, String str2) {
        this.d = alertDialogArr;
        this.b = str;
        this.e = editText;
        this.f = zArr;
        this.g = strArr;
        this.h = strArr2;
        this.i = q;
        this.c = str2;
    }
}
