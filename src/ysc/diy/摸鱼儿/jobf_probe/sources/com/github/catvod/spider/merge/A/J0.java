package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.spider.HonHon;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.U0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p017u.ViewOnClickListenerC0467t;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.RunnableC0567t;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class J0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ J0(EditText editText, String str, AlertDialog[] alertDialogArr, Activity activity, String str2, String str3) {
        this.a = 6;
        this.b = editText;
        this.d = str;
        this.f = alertDialogArr;
        this.c = activity;
        this.e = str2;
        this.g = str3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        char c;
        int i;
        int i2 = 2;
        String str = this.d;
        Object obj = this.c;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.f;
        Object obj5 = this.b;
        int i3 = 1;
        switch (this.a) {
            case 0:
                final boolean[] zArr = (boolean[]) obj5;
                final CountDownLatch countDownLatch = (CountDownLatch) obj;
                List list = (List) obj3;
                int[] iArr = (int[]) obj2;
                AlertDialog[] alertDialogArr = (AlertDialog[]) obj4;
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null) {
                        zArr[0] = true;
                        countDownLatch.countDown();
                        return;
                    }
                    int iMin = Math.min(list.size(), 20);
                    String[] strArr = new String[iMin];
                    String[] strArr2 = new String[iMin];
                    int[] iArr2 = new int[iMin];
                    for (int i4 = 0; i4 < iMin; i4++) {
                        strArr[i4] = AbstractC0302v0.w1((String) list.get(i4));
                        iArr2[i4] = AbstractC0583w0.c;
                    }
                    int iQ = AbstractC0583w0.Q(8, activity);
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                    linearLayoutK.addView(AbstractC0583w0.q(activity, "选择磁力源", AbstractC0302v0.x1(str), AbstractC0583w0.c), AbstractC0583w0.c0(iQ));
                    linearLayoutK.addView(AbstractC0583w0.E(activity, strArr, strArr2, iArr2, iArr, null));
                    final int i5 = 0;
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("继续", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.A.K0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i6) {
                            switch (i5) {
                                case 0:
                                    zArr[0] = true;
                                    countDownLatch.countDown();
                                    break;
                                default:
                                    zArr[0] = true;
                                    countDownLatch.countDown();
                                    break;
                            }
                        }
                    }).setNegativeButton("跳过", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.A.L0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i6) {
                            switch (i5) {
                                case 0:
                                    countDownLatch.countDown();
                                    break;
                                default:
                                    countDownLatch.countDown();
                                    break;
                            }
                        }
                    }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.A.M0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i5) {
                                case 0:
                                    countDownLatch.countDown();
                                    break;
                                default:
                                    countDownLatch.countDown();
                                    break;
                            }
                        }
                    }).create();
                    alertDialogArr[0] = alertDialogCreate;
                    AbstractC0583w0.j0(alertDialogCreate);
                    return;
                } catch (Exception unused) {
                    zArr[0] = true;
                    countDownLatch.countDown();
                    return;
                }
            case 1:
                final boolean[] zArr2 = (boolean[]) obj5;
                final CountDownLatch countDownLatch2 = (CountDownLatch) obj;
                List list2 = (List) obj3;
                boolean[] zArr3 = (boolean[]) obj2;
                AlertDialog[] alertDialogArr2 = (AlertDialog[]) obj4;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 == null) {
                        zArr2[0] = true;
                        countDownLatch2.countDown();
                        return;
                    }
                    int iQ2 = AbstractC0583w0.Q(8, activity2);
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                    linearLayoutK2.addView(AbstractC0583w0.q(activity2, "选择云下载", AbstractC0302v0.x1(str), AbstractC0302v0.X0((String) list2.get(0))), AbstractC0583w0.c0(iQ2));
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity2);
                    LinearLayout linearLayout = new LinearLayout(activity2);
                    linearLayout.setOrientation(1);
                    int i6 = 0;
                    while (i6 < list2.size()) {
                        String str2 = (String) list2.get(i6);
                        AbstractC0583w0.m(linearLayout, AbstractC0302v0.n1(str2), null, AbstractC0302v0.X0(str2), true, i6, i6 > 0, null, zArr3, null);
                        i6++;
                    }
                    linearLayoutY.addView(linearLayout);
                    linearLayoutK2.addView(linearLayoutY);
                    final int i7 = 1;
                    AlertDialog alertDialogCreate2 = new AlertDialog.Builder(activity2).setView(linearLayoutK2).setPositiveButton("提交并等待", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.A.K0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) {
                            switch (i7) {
                                case 0:
                                    zArr2[0] = true;
                                    countDownLatch2.countDown();
                                    break;
                                default:
                                    zArr2[0] = true;
                                    countDownLatch2.countDown();
                                    break;
                            }
                        }
                    }).setNegativeButton("跳过", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.A.L0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) {
                            switch (i7) {
                                case 0:
                                    countDownLatch2.countDown();
                                    break;
                                default:
                                    countDownLatch2.countDown();
                                    break;
                            }
                        }
                    }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.github.catvod.spider.merge.A.M0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i7) {
                                case 0:
                                    countDownLatch2.countDown();
                                    break;
                                default:
                                    countDownLatch2.countDown();
                                    break;
                            }
                        }
                    }).create();
                    c = 0;
                    try {
                        alertDialogArr2[0] = alertDialogCreate2;
                        AbstractC0583w0.j0(alertDialogCreate2);
                        return;
                    } catch (Exception unused2) {
                        z = true;
                        zArr2[c] = z;
                        countDownLatch2.countDown();
                        return;
                    }
                } catch (Exception unused3) {
                    z = true;
                    c = 0;
                }
                break;
            case 2:
                String str3 = this.d;
                String str4 = (String) obj;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                String str7 = (String) obj4;
                com.github.catvod.spider.merge.p000a.L0 l0 = (com.github.catvod.spider.merge.p000a.L0) obj5;
                l0.getClass();
                try {
                    l0.f(str3, str4, str5, str6, str7);
                    return;
                } catch (Exception unused4) {
                    return;
                }
            case 3:
                String[] strArr3 = HonHon.h;
                HonHon honHon = (HonHon) obj5;
                honHon.getClass();
                AlertDialog alertDialog = (AlertDialog) obj;
                if (alertDialog == null || !alertDialog.isShowing()) {
                    return;
                }
                TextView textView = (TextView) obj3;
                textView.setEnabled(true);
                textView.setAlpha(1.0f);
                textView.setText("搜索");
                if (!str.isEmpty()) {
                    X0.a(str);
                    return;
                }
                JSONArray jSONArray = (JSONArray) obj2;
                if (jSONArray.length() == 0) {
                    X0.a("未找到相关短剧");
                    ((EditText) obj4).requestFocus();
                    return;
                }
                try {
                    Activity activity3 = InitOrigin.getActivity();
                    if (activity3 == null) {
                        return;
                    }
                    int iQ3 = AbstractC0583w0.Q(8, activity3);
                    LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                    linearLayoutK3.addView(AbstractC0583w0.q(activity3, "选择短剧", jSONArray.length() + " 个结果 · 点击加入历史", -1754827), AbstractC0583w0.c0(iQ3));
                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity3);
                    AlertDialog[] alertDialogArr3 = new AlertDialog[1];
                    int i8 = 0;
                    while (i8 < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i8);
                        if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("series_id")) && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("title"))) {
                            int iOptInt = jSONObjectOptJSONObject.optInt("episode_cnt");
                            String strOptString = iOptInt > 0 ? iOptInt + "集" : jSONObjectOptJSONObject.optString("hot", "");
                            AbstractC0583w0.d(linearLayoutY2, jSONObjectOptJSONObject.optString("title"), TextUtils.isEmpty(strOptString) ? "查看剧集" : strOptString, -1754827, i8 > 0).setOnClickListener(new ViewOnClickListenerC0467t(honHon, jSONObjectOptJSONObject, strOptString, alertDialogArr3, alertDialog, 0));
                        }
                        i8++;
                    }
                    ScrollView scrollViewJ = AbstractC0583w0.J(activity3, linearLayoutY2, 430);
                    linearLayoutK3.addView(scrollViewJ);
                    AlertDialog alertDialogCreate3 = new AlertDialog.Builder(activity3).setView(linearLayoutK3).setPositiveButton("关闭", (DialogInterface.OnClickListener) null).create();
                    alertDialogArr3[0] = alertDialogCreate3;
                    AbstractC0583w0.k0(alertDialogCreate3, AbstractC0583w0.Y(activity3) ? 0.88f : 0.0f);
                    AbstractC0583w0.o(scrollViewJ, linearLayoutY2);
                    return;
                } catch (Exception unused5) {
                    return;
                }
            case 4:
                String str8 = (String) obj5;
                String str9 = (String) obj;
                AlertDialog alertDialog2 = (AlertDialog) obj3;
                LinearLayout linearLayout2 = (LinearLayout) obj2;
                Context context = (Context) obj4;
                try {
                    if (!C0299u0.x().z0()) {
                        throw new IllegalStateException("弹幕服务正在准备，请稍后重试");
                    }
                    com.github.catvod.spider.merge.p000a.I.p().B();
                    StringBuilder sb = new StringBuilder();
                    sb.append(C0299u0.x().E());
                    sb.append("/danmu/aitest?name=");
                    sb.append(URLEncoder.encode(str, "UTF-8"));
                    sb.append("&episode=");
                    if (str8.isEmpty()) {
                        str8 = "1";
                    }
                    sb.append(str8);
                    if (!str9.isEmpty()) {
                        sb.append("&total=");
                        sb.append(str9);
                    }
                    InitOrigin.run(new RunnableC0240a0((Object) alertDialog2, (Object) linearLayout2, X1.X(sb.toString(), null, null), context, 7));
                    return;
                } catch (Exception e) {
                    InitOrigin.run(new com.github.catvod.spider.merge.p017u.W(alertDialog2, linearLayout2, e, i2));
                    return;
                }
            case 5:
                final String str10 = this.d;
                final String[] strArr4 = (String[]) obj;
                String[] strArr5 = (String[]) obj2;
                final String str11 = (String) obj4;
                try {
                    Activity activity4 = InitOrigin.getActivity();
                    if (activity4 == null) {
                        X0.a("请在应用界面中操作");
                        return;
                    }
                    int iQ4 = AbstractC0583w0.Q(8, activity4);
                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity4);
                    linearLayoutK4.addView(AbstractC0583w0.p(activity4, str10 + "开关", "关闭后对应一级菜单不再显示"), AbstractC0583w0.c0(iQ4));
                    LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity4);
                    LinearLayout linearLayout3 = new LinearLayout(activity4);
                    linearLayout3.setOrientation(1);
                    linearLayout3.setDescendantFocusability(262144);
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        final String[] strArr6 = (String[]) obj3;
                        final boolean[] zArr4 = (boolean[]) obj5;
                        if (i9 >= strArr4.length) {
                            linearLayoutY3.addView(AbstractC0583w0.J(activity4, linearLayout3, 300));
                            AbstractC0583w0.l(linearLayoutY3, "保存后重新进入对应页面生效");
                            linearLayoutK4.addView(linearLayoutY3);
                            AbstractC0583w0.j0(new AlertDialog.Builder(activity4).setView(linearLayoutK4).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.P3
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i11) {
                                    String str12 = str11;
                                    String[] strArr7 = strArr4;
                                    if (P1.A(str12, strArr7)) {
                                        if (!U0.m(str12, strArr7, zArr4, strArr6)) {
                                            X0.a("至少保留一个入口");
                                            return;
                                        }
                                        X0.a(str10 + "开关已保存");
                                    }
                                }
                            }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                            return;
                        }
                        String str12 = strArr4[i9];
                        String[] strArr7 = U0.a;
                        int length = strArr6.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                i = i9;
                                AbstractC0583w0.m(linearLayout3, strArr5[i9], null, AbstractC0583w0.a(i10), zArr4[i9], i, i10 > 0, null, zArr4, null);
                                i10++;
                            } else {
                                int i12 = length;
                                if (strArr6[i11].equals(str12)) {
                                    i = i9;
                                } else {
                                    i11++;
                                    length = i12;
                                }
                            }
                            break;
                        }
                        i9 = i + 1;
                        linearLayout3 = linearLayout3;
                    }
                } catch (Exception e2) {
                    com.github.catvod.spider.merge.D.b.x(e2, new StringBuilder("显示失败: "));
                    return;
                }
                break;
            default:
                try {
                    int i13 = Integer.parseInt(((EditText) obj5).getText().toString().trim());
                    if (i13 < 1 || i13 > 1000) {
                        throw new NumberFormatException();
                    }
                    com.github.catvod.spider.merge.p022z.P1.H1(str);
                    AlertDialog alertDialog3 = ((AlertDialog[]) obj4)[0];
                    if (alertDialog3 != null) {
                        alertDialog3.dismiss();
                    }
                    String str13 = (String) obj3;
                    String str14 = (String) obj2;
                    if (i13 > 256) {
                        int color = Color.parseColor("#C62828");
                        int i14 = AbstractC0583w0.a;
                        AbstractC0583w0.j0(AbstractC0583w0.r((Context) obj, "高线程数警告", "过高线程可能会荣升封号斗罗，非必要请酌情配置数量。", color, new String[][]{new String[]{"当前配置", i13 + "线程"}, new String[]{"风险提示", "请求过多可能导致限速、播放不稳或账号受限"}}, new int[]{color, color}, new String[]{"仍要保存", "取消"}, new Runnable[]{new RunnableC0567t(str13, i13, i3, str14), null}));
                        return;
                    }
                    C0299u0.R.put(str13, Integer.valueOf(Math.max(1, Math.min(1000, i13))));
                    C0299u0.O0();
                    X0.a(str14 + " 已设置为 " + i13);
                    return;
                } catch (NumberFormatException unused6) {
                    X0.a("请输入 1-1000 的整数");
                    return;
                }
        }
    }

    public /* synthetic */ J0(com.github.catvod.spider.merge.p000a.L0 l0, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = 2;
        this.b = l0;
        this.d = str;
        this.c = str2;
        this.e = str3;
        this.g = str5;
        this.f = str6;
    }

    public /* synthetic */ J0(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = str;
        this.g = obj4;
        this.f = obj5;
    }

    public /* synthetic */ J0(String str, String str2, String str3, AlertDialog alertDialog, LinearLayout linearLayout, Activity activity) {
        this.a = 4;
        this.d = str;
        this.b = str2;
        this.c = str3;
        this.e = alertDialog;
        this.g = linearLayout;
        this.f = activity;
    }

    public /* synthetic */ J0(String str, String[] strArr, String[] strArr2, String[] strArr3, boolean[] zArr, String str2) {
        this.a = 5;
        this.d = str;
        this.c = strArr;
        this.e = strArr2;
        this.g = strArr3;
        this.b = zArr;
        this.f = str2;
    }

    public /* synthetic */ J0(boolean[] zArr, CountDownLatch countDownLatch, String str, ArrayList arrayList, boolean[] zArr2, AlertDialog[] alertDialogArr) {
        this.a = 1;
        this.b = zArr;
        this.c = countDownLatch;
        this.d = str;
        this.e = arrayList;
        this.g = zArr2;
        this.f = alertDialogArr;
    }
}
