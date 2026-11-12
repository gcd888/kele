package com.github.catvod.spider.merge.p017u;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.HonHon;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.Wallpaper;
import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.H0;
import com.github.catvod.spider.merge.A.J0;
import com.github.catvod.spider.merge.A.P0;
import com.github.catvod.spider.merge.A.RunnableC0240a0;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.U0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p019w.a;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.B;
import com.github.catvod.spider.merge.p022z.C0528l;
import com.github.catvod.spider.merge.p022z.C0538n;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0488d;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0503g;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0562s;
import com.github.catvod.spider.merge.p022z.E;
import com.github.catvod.spider.merge.p022z.I0;
import com.github.catvod.spider.merge.p022z.I3;
import com.github.catvod.spider.merge.p022z.InterfaceC0549p0;
import com.github.catvod.spider.merge.p022z.J1;
import com.github.catvod.spider.merge.p022z.K;
import com.github.catvod.spider.merge.p022z.K1;
import com.github.catvod.spider.merge.p022z.M2;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.ViewOnClickListenerC0598z0;
import com.github.catvod.spider.merge.p022z.e4;
import com.github.catvod.spider.merge.p022z.h4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0466s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ RunnableC0466s(K1 k1, EditText editText, EditText editText2, String str, AlertDialog alertDialog) {
        this.a = 6;
        this.c = k1;
        this.f = editText;
        this.e = editText2;
        this.b = str;
        this.d = alertDialog;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strP;
        HashMap mapX;
        String str = "取消";
        char c = 2;
        boolean z = true;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (this.a) {
            case 0:
                String str2 = (String) obj2;
                String[] strArr = HonHon.h;
                HonHon honHon = (HonHon) obj5;
                honHon.getClass();
                JSONArray jSONArray = new JSONArray();
                try {
                    JSONArray jSONArrayOptJSONArray = honHon.n(HonHon.j("N1.8OdejuWbid9yHL9jlFQlsIi7XnCDDb2O5SxCtuiP5fGy6MUJ4RSVBXlipOw4B7k3YLh5xvMzEwfxu1MXufJ+eA=="), HonHon.l("q", str2, "limit", 30)).optJSONArray("results");
                    if (jSONArrayOptJSONArray != null) {
                        jSONArray = jSONArrayOptJSONArray;
                    }
                    strP = "";
                } catch (Exception e) {
                    strP = HonHon.p(e);
                }
                InitOrigin.run(new J0(honHon, (AlertDialog) obj4, (TextView) obj, strP, jSONArray, (EditText) obj3, 3));
                break;
            case 1:
                String[] strArr2 = (String[]) obj4;
                String str3 = (String) obj2;
                Dialog dialog = (Dialog) obj;
                String str4 = (String) obj3;
                Pattern pattern = Market.c;
                ((Market) obj5).getClass();
                try {
                    String strH = Market.h(str3, strArr2[1], strArr2[2], strArr2[3], strArr2[4]);
                    if (!TextUtils.isEmpty(strH)) {
                        if (str3.equals("uc")) {
                            Z0.t().getClass();
                            mapX = Z0.x();
                        } else {
                            mapX = !str3.equals("quark") ? new HashMap() : A0.s().D();
                        }
                        mapX.remove("Host");
                        mapX.remove("Content-Type");
                        String strX0 = C0299u0.x0(strH, mapX, str3.equals("uc") ? C0299u0.F("uc") : !str3.equals("quark") ? 16 : C0299u0.F("quark"), str3, null);
                        P1.S(dialog);
                        if (!TextUtils.isEmpty(strX0)) {
                            InitOrigin.run(new W(str4, strX0, (Object) null, 5));
                        } else {
                            X0.a("本地播放代理正在准备，请稍后重试");
                        }
                    } else {
                        P1.S(dialog);
                        X0.a("获取下载地址失败");
                    }
                } catch (Exception e2) {
                    P1.S(dialog);
                    b.x(e2, new StringBuilder("下载失败: "));
                    return;
                }
                break;
            case 2:
                HashMap map = Wallpaper.a;
                Handler handler = h4.a;
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                String str7 = str5.isEmpty() ? str6 : str5;
                if (str7 == null || str7.isEmpty()) {
                    InitOrigin.run(new e4(5));
                } else {
                    InitOrigin.execute(new I3(str7, (String) obj2, str6, (String) obj, (String) obj3, -1, null, str5, 1));
                }
                break;
            case 3:
                i iVar = (i) obj4;
                String str8 = (String) obj2;
                C0239a c0239a = (C0239a) obj;
                Runnable runnable = (Runnable) obj3;
                C0538n c0538n = (C0538n) obj5;
                c0538n.getClass();
                try {
                    InitOrigin.run(new RunnableC0240a0(c0538n, iVar.i(str8), c0239a, runnable, 5));
                } catch (Exception e3) {
                    InitOrigin.run(new a(e3.getMessage(), 3));
                    return;
                }
                break;
            case 4:
                String str9 = (String) obj2;
                i iVar2 = (i) obj3;
                C0538n c0538n2 = (C0538n) obj5;
                c0538n2.getClass();
                String str10 = "name";
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity != null) {
                        C0239a c0239aE = C0239a.e();
                        String str11 = (String) obj4;
                        JSONArray jSONArray2 = (JSONArray) obj;
                        if (jSONArray2 != null && jSONArray2.length() != 0) {
                            ArrayList arrayList = new ArrayList();
                            int i = 0;
                            while (i < jSONArray2.length()) {
                                JSONObject jSONObject = jSONArray2.getJSONObject(i);
                                String strOptString = jSONObject.optString(str10);
                                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("children");
                                if (jSONArrayOptJSONArray2 != null) {
                                    int i2 = 0;
                                    while (i2 < jSONArrayOptJSONArray2.length()) {
                                        JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i2);
                                        arrayList.add(new String[]{jSONObject2.optString("parent_id", jSONObject.optString("id")), jSONObject2.optString("id"), strOptString, jSONObject2.optString(str10)});
                                        i2++;
                                        jSONArray2 = jSONArray2;
                                        str10 = str10;
                                        jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                                    }
                                }
                                i++;
                                jSONArray2 = jSONArray2;
                                str10 = str10;
                            }
                            int iE = C0538n.e(str9);
                            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                            linearLayoutK.addView(AbstractC0583w0.p(activity, str11 + " 分类", "打开开关即收藏，关闭即取消收藏"), layoutParams);
                            EditText editTextM = AbstractC0583w0.M(activity, "搜索分类...");
                            String strValueOf = String.valueOf(System.currentTimeMillis());
                            linearLayoutK.addView(editTextM, AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
                            LinearLayout linearLayout = new LinearLayout(activity);
                            linearLayout.setOrientation(1);
                            C0538n.a(activity, linearLayout, arrayList, str9, str11, iE, c0239aE);
                            linearLayoutK.addView(C0538n.c(activity, linearLayout));
                            editTextM.addTextChangedListener(new C0528l(c0538n2, linearLayout, activity, arrayList, str9, str11, iE, c0239aE));
                            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setCancelable(true).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("完成", new DialogInterfaceOnClickListenerC0488d(c0538n2, iVar2, 4)).setOnDismissListener(new DialogInterfaceOnDismissListenerC0472y(strValueOf, 1)).create();
                            AbstractC0583w0.j0(alertDialogCreate);
                            P1.x(alertDialogCreate.getButton(-3), str11 + "分类搜索", strValueOf, "search", "搜索词", "输入分类关键词", AbstractC0583w0.c, editTextM, null);
                        }
                        X0.a(str11 + " 暂无分类数据");
                        break;
                    }
                } catch (Exception unused) {
                    X0.a("显示分类浏览失败");
                    return;
                }
                break;
            case 5:
                AlertDialog alertDialog = ((AlertDialog[]) obj5)[0];
                EditText editText = (EditText) obj3;
                String strE = editText == null ? "" : AbstractC0449a.e(editText);
                if (!TextUtils.isEmpty(strE)) {
                    P1.H1((String) obj2);
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    I0 i0 = (I0) obj;
                    if (i0 != null) {
                        i0.c(strE);
                    }
                } else {
                    X0.a("请输入" + ((String) obj4));
                }
                break;
            case 6:
                K1 k1 = (K1) obj5;
                k1.getClass();
                String strE2 = AbstractC0449a.e((EditText) obj3);
                String strE3 = AbstractC0449a.e((EditText) obj);
                if (strE2.isEmpty()) {
                    X0.a("请输入接口名称");
                } else if (strE3.startsWith("http://") || strE3.startsWith("https://")) {
                    J1 j1 = k1.a;
                    if (!j1.addApiUrl(strE2, strE3)) {
                        X0.a("该接口已存在");
                    } else {
                        j1.saveConfig();
                        P1.H1((String) obj2);
                        X0.a("已添加: ".concat(strE2));
                        ((AlertDialog) obj4).dismiss();
                    }
                } else {
                    X0.a("请输入有效URL(以http开头)");
                }
                break;
            case 7:
                String[] strArr3 = (String[]) obj5;
                int[] iArr = (int[]) obj4;
                String[] strArr4 = (String[]) obj;
                E e4 = (E) obj3;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.bottomMargin = AbstractC0583w0.Q(12, activity2);
                    linearLayoutK2.addView(AbstractC0583w0.p(activity2, "源内解析", "选择是否启用解析接口"), layoutParams2);
                    LinearLayout linearLayout2 = new LinearLayout(activity2);
                    linearLayout2.setOrientation(1);
                    TextView[] textViewArr = new TextView[strArr3.length];
                    int i3 = 2;
                    TextView[] textViewArr2 = new TextView[2];
                    int i4 = 0;
                    while (true) {
                        int[] iArr2 = (int[]) obj2;
                        if (i4 >= i3) {
                            LinearLayout linearLayout3 = linearLayoutK2;
                            linearLayout3.addView(AbstractC0583w0.s(activity2, linearLayout2));
                            AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayout3).setPositiveButton("确定", new P0(e4, iArr2, 10)).setNegativeButton(str, (DialogInterface.OnClickListener) null).create());
                        } else {
                            int i5 = i4 == iArr2[0] ? 1 : 0;
                            LinearLayout linearLayout4 = new LinearLayout(activity2);
                            linearLayout4.setOrientation(0);
                            linearLayout4.setGravity(16);
                            Object obj6 = obj2;
                            String str12 = str;
                            E e5 = e4;
                            LinearLayout linearLayout5 = linearLayoutK2;
                            linearLayout4.setPadding(AbstractC0583w0.Q(12, activity2), AbstractC0583w0.Q(12, activity2), AbstractC0583w0.Q(12, activity2), AbstractC0583w0.Q(12, activity2));
                            linearLayout4.setClickable(true);
                            AbstractC0583w0.n(linearLayout4, iArr[i4]);
                            TextView textView = new TextView(activity2);
                            int i6 = i4 + 1;
                            textView.setText(String.valueOf(i6));
                            textView.setTextSize(11.0f);
                            textView.setTextColor(-1);
                            textView.setTypeface(null, 1);
                            textView.setGravity(17);
                            textView.setMinWidth(AbstractC0583w0.Q(22, activity2));
                            textView.setPadding(AbstractC0583w0.Q(5, activity2), AbstractC0583w0.Q(3, activity2), AbstractC0583w0.Q(5, activity2), AbstractC0583w0.Q(3, activity2));
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setCornerRadius(AbstractC0583w0.Q(11, activity2));
                            gradientDrawable.setColor(iArr[i4]);
                            textView.setBackground(gradientDrawable);
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams3.rightMargin = AbstractC0583w0.Q(12, activity2);
                            textView.setLayoutParams(layoutParams3);
                            linearLayout4.addView(textView);
                            LinearLayout linearLayout6 = new LinearLayout(activity2);
                            linearLayout6.setOrientation(1);
                            linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                            TextView textView2 = new TextView(activity2);
                            textView2.setText(strArr3[i4]);
                            textView2.setTextSize(14.0f);
                            textView2.setTextColor(i5 != 0 ? iArr[i4] : AbstractC0583w0.g);
                            textView2.setTypeface(null, i5);
                            textViewArr2[i4] = textView2;
                            linearLayout6.addView(textView2);
                            TextView textView3 = new TextView(activity2);
                            textView3.setText(strArr4[i4]);
                            textView3.setTextSize(11.0f);
                            int i7 = AbstractC0583w0.i;
                            textView3.setTextColor(i7);
                            linearLayout6.addView(textView3);
                            linearLayout4.addView(linearLayout6);
                            TextView textView4 = new TextView(activity2);
                            textView4.setTextSize(18.0f);
                            textView4.setText(i5 != 0 ? "●" : "○");
                            if (i5 != 0) {
                                i7 = iArr[i4];
                            }
                            textView4.setTextColor(i7);
                            textViewArr[i4] = textView4;
                            linearLayout4.addView(textView4);
                            if (i4 > 0) {
                                linearLayout2.addView(AbstractC0583w0.C(activity2));
                            }
                            linearLayout2.addView(linearLayout4);
                            linearLayout4.setOnClickListener(new ViewOnClickListenerC0598z0(iArr2, i4, strArr3, textViewArr2, iArr, textViewArr));
                            textViewArr2 = textViewArr2;
                            textViewArr = textViewArr;
                            obj2 = obj6;
                            str = str12;
                            e4 = e5;
                            linearLayoutK2 = linearLayout5;
                            i4 = i6;
                            i3 = 2;
                        }
                    }
                } catch (Exception e6) {
                    SpiderDebug.log("[Kan360Dialog] showParseToggle: " + e6.getMessage());
                    X0.a("显示失败");
                    return;
                }
                break;
            case 8:
                AlertDialog[] alertDialogArr = (AlertDialog[]) obj5;
                AlertDialog alertDialog2 = alertDialogArr[0];
                if (alertDialog2 != null && alertDialog2.isShowing()) {
                    String strE4 = AbstractC0449a.e((EditText) obj3);
                    String strE5 = AbstractC0449a.e((EditText) obj4);
                    if (!strE4.isEmpty() && !strE5.isEmpty()) {
                        H0.a.getClass();
                        H0.k((String) obj2);
                        alertDialogArr[0].dismiss();
                        ((InterfaceC0549p0) obj).b(strE4, strE5);
                        break;
                    }
                }
                break;
            case 9:
                Callable callable = (Callable) obj5;
                if (P1.n0(callable)) {
                    P1.Y0((String) obj2, (Bitmap) obj4, (Runnable) obj, callable);
                    Runnable runnable2 = (Runnable) obj3;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    break;
                }
                break;
            case 10:
                String str13 = (String) obj2;
                ArrayList arrayList2 = (ArrayList) obj5;
                String[] strArr5 = (String[]) obj4;
                String[] strArr6 = (String[]) obj;
                String str14 = (String) obj3;
                try {
                    Activity activity3 = InitOrigin.getActivity();
                    if (activity3 == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        int iQ = AbstractC0583w0.Q(8, activity3);
                        LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                        linearLayoutK3.addView(AbstractC0583w0.p(activity3, str13 + "排序", "使用上移/下移调整一级菜单顺序"), AbstractC0583w0.c0(iQ));
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity3);
                        LinearLayout linearLayout7 = new LinearLayout(activity3);
                        linearLayout7.setOrientation(1);
                        linearLayout7.setDescendantFocusability(262144);
                        RunnableC0466s runnableC0466s = new RunnableC0466s(linearLayout7, arrayList2, strArr5, strArr6, new Runnable[]{runnableC0466s}, 12);
                        runnableC0466s.run();
                        linearLayoutY.addView(AbstractC0583w0.J(activity3, linearLayout7, 300));
                        linearLayoutK3.addView(linearLayoutY);
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity3).setView(linearLayoutK3).setNeutralButton("重置", new DialogInterfaceOnClickListenerC0503g(str14, strArr5, str13, 14)).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0562s(str14, strArr5, arrayList2, str13, 4)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    }
                } catch (Exception e7) {
                    b.x(e7, new StringBuilder("显示失败: "));
                    return;
                }
                break;
            case 11:
                String str15 = (String) obj2;
                String str16 = (String) obj5;
                String[][] strArr7 = (String[][]) obj4;
                M2 m2 = (M2) obj;
                Runnable runnable3 = (Runnable) obj3;
                try {
                    Activity activity4 = InitOrigin.getActivity();
                    int iQ2 = AbstractC0583w0.Q(8, activity4);
                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity4);
                    linearLayoutK4.addView(AbstractC0583w0.p(activity4, str15, str16), AbstractC0583w0.c0(iQ2));
                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity4);
                    linearLayoutY2.setDescendantFocusability(262144);
                    AlertDialog[] alertDialogArr2 = new AlertDialog[1];
                    LinearLayout linearLayout8 = new LinearLayout(activity4);
                    linearLayout8.setOrientation(1);
                    int i8 = 0;
                    while (i8 < strArr7.length) {
                        String[] strArr8 = strArr7[i8];
                        int color = Color.parseColor(strArr8[c]);
                        String str17 = strArr8[0];
                        String str18 = strArr8[z ? 1 : 0];
                        if (i8 <= 0) {
                            z = false;
                        }
                        AbstractC0583w0.d(linearLayout8, str17, str18, color, z).setOnClickListener(new K(alertDialogArr2, m2, i8, strArr8));
                        i8++;
                        z = true;
                        c = 2;
                    }
                    linearLayoutY2.addView(AbstractC0583w0.J(activity4, linearLayout8, 280));
                    linearLayoutK4.addView(linearLayoutY2);
                    AlertDialog alertDialogCreate2 = new AlertDialog.Builder(activity4).setView(linearLayoutK4).setNeutralButton("重置默认", new E((RunnableC0242b) runnable3, 10)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                    alertDialogArr2[0] = alertDialogCreate2;
                    AbstractC0583w0.j0(alertDialogCreate2);
                } catch (Exception e8) {
                    b.x(e8, new StringBuilder("显示失败: "));
                    return;
                }
                break;
            case 12:
                LinearLayout linearLayout9 = (LinearLayout) obj5;
                linearLayout9.removeAllViews();
                int i9 = 0;
                while (true) {
                    ArrayList arrayList3 = (ArrayList) obj2;
                    if (i9 < arrayList3.size()) {
                        String str19 = (String) arrayList3.get(i9);
                        int iH = U0.h(str19, (String[]) obj4);
                        if (iH >= 0) {
                            String[] strArr9 = (String[]) obj;
                            if (iH < strArr9.length) {
                                str19 = strArr9[iH];
                            }
                        }
                        AbstractC0583w0.i(linearLayout9, str19, i9, arrayList3.size(), AbstractC0583w0.a(i9), i9 > 0, new B(4, linearLayout9, arrayList3, (Runnable[]) obj3));
                        i9++;
                    }
                    break;
                }
                break;
            default:
                String str20 = (String) obj5;
                String[] strArr10 = (String[]) obj4;
                String[] strArr11 = (String[]) obj3;
                InitOrigin.run(new J0((String) obj2, strArr10, strArr11, (String[]) obj, (boolean[]) U0.c(str20, strArr10, strArr11).clone(), str20));
                break;
        }
    }

    public /* synthetic */ RunnableC0466s(Object obj, Serializable serializable, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.b = serializable;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ RunnableC0466s(Object obj, Object obj2, String str, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = str;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ RunnableC0466s(String str, Serializable serializable, Serializable serializable2, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = str;
        this.c = serializable;
        this.d = serializable2;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ RunnableC0466s(Callable callable, String str, String str2, Bitmap bitmap, int i, Runnable runnable, Runnable runnable2) {
        this.a = 9;
        this.c = callable;
        this.b = str2;
        this.d = bitmap;
        this.e = runnable;
        this.f = runnable2;
    }

    public /* synthetic */ RunnableC0466s(AlertDialog[] alertDialogArr, EditText editText, EditText editText2, String str, InterfaceC0549p0 interfaceC0549p0) {
        this.a = 8;
        this.c = alertDialogArr;
        this.f = editText;
        this.d = editText2;
        this.b = str;
        this.e = interfaceC0549p0;
    }

    public /* synthetic */ RunnableC0466s(AlertDialog[] alertDialogArr, String str, EditText editText, String str2, I0 i0) {
        this.a = 5;
        this.c = alertDialogArr;
        this.b = str;
        this.f = editText;
        this.d = str2;
        this.e = i0;
    }
}
