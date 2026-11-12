package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0251e;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.p000a.C0342a0;
import com.github.catvod.spider.merge.p000a.U;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p000a.a1;
import com.github.catvod.spider.merge.p000a.b1;
import com.github.catvod.spider.merge.p010l.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class U2 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ U2(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str;
        int i = 4;
        int i2 = 7;
        int i3 = 9;
        int i4 = 5;
        int i5 = 3;
        int i6 = 2;
        final int i7 = 1;
        final int i8 = 0;
        switch (this.a) {
            case 0:
                try {
                    b1 b1Var = Z0.t().E;
                    b1Var.i();
                    InitOrigin.run(new a1(b1Var, i8));
                    InitOrigin.execute(new a1(b1Var, i7));
                    return;
                } catch (Exception unused) {
                    X0.a("授权失败，请重试");
                    return;
                }
            case 1:
                P1.B1();
                return;
            case 2:
                C0342a0 c0342a0 = C0342a0.x;
                if (c0342a0.m) {
                    X0.a("光鸭网盘正在等待扫码");
                    return;
                } else {
                    c0342a0.l = false;
                    InitOrigin.execute(new U(c0342a0, i8));
                    return;
                }
            case 3:
                try {
                    C0502f3 c0502f3 = new C0502f3(InitOrigin.getActivity());
                    c0502f3.b = AbstractC0302v0.Y0("xunlei");
                    c0502f3.d = AbstractC0302v0.X0("xunlei");
                    c0502f3.e = false;
                    c0502f3.f = "请先输入" + AbstractC0302v0.Y0("xunlei") + "账号密码登录";
                    c0502f3.a();
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 4:
                X0.a("本地代理准备中，请稍后重试扫码");
                return;
            case 5:
                final a aVarI = a.i();
                final String str2 = "smart_poster_all_" + System.currentTimeMillis();
                InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.z.A3
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r26v0 */
                    /* JADX WARN: Type inference failed for: r26v1 */
                    /* JADX WARN: Type inference failed for: r26v2 */
                    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r2v14 */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v6 */
                    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        ?? r26;
                        ?? r2 = "操作失败: ";
                        switch (i7) {
                            case 0:
                                a aVar = aVarI;
                                String str3 = str2;
                                try {
                                    Activity activity = InitOrigin.getActivity();
                                    if (activity == null) {
                                        X0.a("请在应用界面中操作");
                                    } else {
                                        int iQ = AbstractC0583w0.Q(8, activity);
                                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                        linearLayoutK.addView(AbstractC0583w0.q(activity, "TMDB Token", "配置 v4 Read Access Token", -16732991), AbstractC0583w0.c0(iQ));
                                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                        AbstractC0583w0.c(AbstractC0583w0.g, linearLayoutY, "Read Access Token");
                                        EditText editTextF = AbstractC0583w0.f(linearLayoutY, "eyJ... 开头的 TMDB v4 Token", aVar.b, false);
                                        editTextF.setInputType(129);
                                        P1.r(activity, linearLayoutY, new C0572u(editTextF, 1), new i(25, aVar.c));
                                        linearLayoutK.addView(linearLayoutY);
                                        P1.w(str3, new String[]{"token"}, new EditText[]{editTextF}, null);
                                        P1.y1(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0503g(str3, aVar, editTextF, 12)).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("取消", new D1(str3, 2)).setOnCancelListener(new O(str3, 2)).create(), new com.github.catvod.spider.merge.p019w.a(str3, 18));
                                    }
                                } catch (Exception e) {
                                    P1.H1(str3);
                                    b.x(e, new StringBuilder("操作失败: "));
                                    return;
                                }
                                break;
                            default:
                                final a aVar2 = aVarI;
                                final String str4 = str2;
                                try {
                                    Activity activity2 = InitOrigin.getActivity();
                                    if (activity2 == null) {
                                        X0.a("请在应用界面中操作");
                                        r2 = r2;
                                    } else {
                                        int iQ2 = AbstractC0583w0.Q(8, activity2);
                                        LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                        linearLayoutK2.addView(AbstractC0583w0.q(activity2, "智能海报墙", "模式、TMDB、追更日历和海报展示", -16732991), AbstractC0583w0.c0(iQ2));
                                        final int[] iArr = {aVar2.a == 1 ? 0 : 1};
                                        linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"TMDB", "豆瓣"}, new String[]{"使用TMDB分类和海报数据", "使用豆瓣原分类和推荐"}, new int[]{-16732991, AbstractC0583w0.f}, iArr, "按选择展示，不自动切换数据源。"), AbstractC0583w0.c0(iQ2));
                                        LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity2);
                                        int i9 = AbstractC0583w0.g;
                                        AbstractC0583w0.c(i9, linearLayoutY2, "TMDB Token");
                                        final EditText editTextF2 = AbstractC0583w0.f(linearLayoutY2, "eyJ... 开头的 Read Access Token", aVar2.b, false);
                                        editTextF2.setInputType(129);
                                        final EditText editText = new EditText(activity2);
                                        editText.setText(aVar2.c);
                                        final EditText editText2 = new EditText(activity2);
                                        r26 = "操作失败: ";
                                        try {
                                            editText2.setText(aVar2.d);
                                            P1.g(activity2, linearLayoutY2, editText, editText2);
                                            P1.r(activity2, linearLayoutY2, new C0572u(editTextF2, 2), new C0572u(editText, 3));
                                            linearLayoutK2.addView(linearLayoutY2, AbstractC0583w0.c0(iQ2));
                                            LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity2);
                                            AbstractC0583w0.c(i9, linearLayoutY3, "追更日历天数");
                                            final EditText editTextF3 = AbstractC0583w0.f(linearLayoutY3, "1-31", String.valueOf(aVar2.i), false);
                                            editTextF3.setInputType(2);
                                            String str5 = aVar2.h;
                                            String upperCase = str5 == null ? "" : str5.trim().toUpperCase();
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 >= 2) {
                                                    i10 = 0;
                                                } else if (!P1.l[i10].equals(upperCase)) {
                                                    i10++;
                                                }
                                            }
                                            final int[] iArr2 = {i10};
                                            AbstractC0583w0.c(AbstractC0583w0.g, linearLayoutY3, "语言");
                                            String[] strArr = P1.k;
                                            String[] strArr2 = P1.m;
                                            int i11 = AbstractC0583w0.f;
                                            linearLayoutY3.addView(AbstractC0583w0.E(activity2, strArr, strArr2, new int[]{-16732991, i11}, iArr2, "影响 TMDB 返回语言"));
                                            linearLayoutK2.addView(linearLayoutY3, AbstractC0583w0.c0(iQ2));
                                            final int[] iArr3 = {aVar2.j == 1 ? 1 : 0};
                                            linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"竖版海报", "宽图卡片"}, new String[]{"适合片库和榜单", "适合日历与追剧感"}, new int[]{-16732991, i11}, iArr3, null), AbstractC0583w0.c0(iQ2));
                                            P1.w(str4, new String[]{"token", "base", "image"}, new EditText[]{editTextF2, editText, editText2}, null);
                                            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity2).setView(AbstractC0583w0.q0(linearLayoutK2)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.E3
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i12) {
                                                    int i13;
                                                    P1.H1(str4);
                                                    int i14 = iArr[0] == 0 ? 1 : 2;
                                                    a aVar3 = aVar2;
                                                    aVar3.a = i14;
                                                    aVar3.k();
                                                    aVar3.b = editTextF2.getText().toString();
                                                    aVar3.k();
                                                    aVar3.c = editText.getText().toString();
                                                    aVar3.k();
                                                    aVar3.d = editText2.getText().toString();
                                                    aVar3.k();
                                                    int i15 = iArr2[0];
                                                    String[] strArr3 = P1.l;
                                                    aVar3.h = (i15 < 0 || i15 >= 2) ? strArr3[0] : strArr3[i15];
                                                    aVar3.k();
                                                    try {
                                                        i13 = Integer.parseInt(editTextF3.getText().toString().trim());
                                                    } catch (Exception unused3) {
                                                        i13 = 7;
                                                    }
                                                    aVar3.i = i13;
                                                    aVar3.k();
                                                    aVar3.j = iArr3[0] == 1 ? 1 : 0;
                                                    aVar3.k();
                                                    aVar3.q();
                                                    X0.a("智能海报墙设置已保存");
                                                }
                                            }).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("取消", new D1(str4, 2)).setOnCancelListener(new O(str4, 2)).create();
                                            r2 = 16;
                                            P1.y1(alertDialogCreate, new com.github.catvod.spider.merge.p019w.a(str4, 16));
                                        } catch (Exception e2) {
                                            e = e2;
                                            P1.H1(str4);
                                            b.x(e, new StringBuilder((String) r26));
                                            return;
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    r26 = r2;
                                }
                                break;
                        }
                    }
                });
                return;
            case 6:
                synchronized (AbstractC0251e.a) {
                    JSONObject jSONObjectH = AbstractC0251e.H();
                    try {
                        jSONObjectH.put("searches", new JSONArray());
                        jSONObjectH.put("plays", new JSONArray());
                        jSONObjectH.put("recommended", new JSONArray());
                        long jB = AbstractC0251e.B();
                        JSONObject jSONObjectG = AbstractC0251e.G();
                        jSONObjectG.put("clearBefore", jB).put("tombstones", new JSONObject()).put("updatedAt", jB);
                        AbstractC0251e.f = jSONObjectG;
                        JSONObject jSONObjectG2 = AbstractC0251e.G();
                        jSONObjectG2.put("searchClearBefore", jB).put("searchTombstones", new JSONObject()).put("updatedAt", jB);
                        AbstractC0251e.f = jSONObjectG2;
                        AbstractC0251e.h(jSONObjectH);
                        break;
                    } catch (Exception unused3) {
                    }
                    break;
                }
                X0.a("AI推荐依据已清除");
                return;
            case 7:
                final a aVarI2 = a.i();
                final String str3 = "smart_poster_tmdb_" + System.currentTimeMillis();
                InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.z.A3
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r26v0 */
                    /* JADX WARN: Type inference failed for: r26v1 */
                    /* JADX WARN: Type inference failed for: r26v2 */
                    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r2v14 */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v6 */
                    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        ?? r26;
                        ?? r2 = "操作失败: ";
                        switch (i8) {
                            case 0:
                                a aVar = aVarI2;
                                String str4 = str3;
                                try {
                                    Activity activity = InitOrigin.getActivity();
                                    if (activity == null) {
                                        X0.a("请在应用界面中操作");
                                    } else {
                                        int iQ = AbstractC0583w0.Q(8, activity);
                                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                        linearLayoutK.addView(AbstractC0583w0.q(activity, "TMDB Token", "配置 v4 Read Access Token", -16732991), AbstractC0583w0.c0(iQ));
                                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                                        AbstractC0583w0.c(AbstractC0583w0.g, linearLayoutY, "Read Access Token");
                                        EditText editTextF = AbstractC0583w0.f(linearLayoutY, "eyJ... 开头的 TMDB v4 Token", aVar.b, false);
                                        editTextF.setInputType(129);
                                        P1.r(activity, linearLayoutY, new C0572u(editTextF, 1), new i(25, aVar.c));
                                        linearLayoutK.addView(linearLayoutY);
                                        P1.w(str4, new String[]{"token"}, new EditText[]{editTextF}, null);
                                        P1.y1(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0503g(str4, aVar, editTextF, 12)).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("取消", new D1(str4, 2)).setOnCancelListener(new O(str4, 2)).create(), new com.github.catvod.spider.merge.p019w.a(str4, 18));
                                    }
                                } catch (Exception e) {
                                    P1.H1(str4);
                                    b.x(e, new StringBuilder("操作失败: "));
                                    return;
                                }
                                break;
                            default:
                                final a aVar2 = aVarI2;
                                final String str5 = str3;
                                try {
                                    Activity activity2 = InitOrigin.getActivity();
                                    if (activity2 == null) {
                                        X0.a("请在应用界面中操作");
                                        r2 = r2;
                                    } else {
                                        int iQ2 = AbstractC0583w0.Q(8, activity2);
                                        LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                                        linearLayoutK2.addView(AbstractC0583w0.q(activity2, "智能海报墙", "模式、TMDB、追更日历和海报展示", -16732991), AbstractC0583w0.c0(iQ2));
                                        final int[] iArr = {aVar2.a == 1 ? 0 : 1};
                                        linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"TMDB", "豆瓣"}, new String[]{"使用TMDB分类和海报数据", "使用豆瓣原分类和推荐"}, new int[]{-16732991, AbstractC0583w0.f}, iArr, "按选择展示，不自动切换数据源。"), AbstractC0583w0.c0(iQ2));
                                        LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity2);
                                        int i9 = AbstractC0583w0.g;
                                        AbstractC0583w0.c(i9, linearLayoutY2, "TMDB Token");
                                        final EditText editTextF2 = AbstractC0583w0.f(linearLayoutY2, "eyJ... 开头的 Read Access Token", aVar2.b, false);
                                        editTextF2.setInputType(129);
                                        final EditText editText = new EditText(activity2);
                                        editText.setText(aVar2.c);
                                        final EditText editText2 = new EditText(activity2);
                                        r26 = "操作失败: ";
                                        try {
                                            editText2.setText(aVar2.d);
                                            P1.g(activity2, linearLayoutY2, editText, editText2);
                                            P1.r(activity2, linearLayoutY2, new C0572u(editTextF2, 2), new C0572u(editText, 3));
                                            linearLayoutK2.addView(linearLayoutY2, AbstractC0583w0.c0(iQ2));
                                            LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity2);
                                            AbstractC0583w0.c(i9, linearLayoutY3, "追更日历天数");
                                            final EditText editTextF3 = AbstractC0583w0.f(linearLayoutY3, "1-31", String.valueOf(aVar2.i), false);
                                            editTextF3.setInputType(2);
                                            String str6 = aVar2.h;
                                            String upperCase = str6 == null ? "" : str6.trim().toUpperCase();
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 >= 2) {
                                                    i10 = 0;
                                                } else if (!P1.l[i10].equals(upperCase)) {
                                                    i10++;
                                                }
                                            }
                                            final int[] iArr2 = {i10};
                                            AbstractC0583w0.c(AbstractC0583w0.g, linearLayoutY3, "语言");
                                            String[] strArr = P1.k;
                                            String[] strArr2 = P1.m;
                                            int i11 = AbstractC0583w0.f;
                                            linearLayoutY3.addView(AbstractC0583w0.E(activity2, strArr, strArr2, new int[]{-16732991, i11}, iArr2, "影响 TMDB 返回语言"));
                                            linearLayoutK2.addView(linearLayoutY3, AbstractC0583w0.c0(iQ2));
                                            final int[] iArr3 = {aVar2.j == 1 ? 1 : 0};
                                            linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"竖版海报", "宽图卡片"}, new String[]{"适合片库和榜单", "适合日历与追剧感"}, new int[]{-16732991, i11}, iArr3, null), AbstractC0583w0.c0(iQ2));
                                            P1.w(str5, new String[]{"token", "base", "image"}, new EditText[]{editTextF2, editText, editText2}, null);
                                            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity2).setView(AbstractC0583w0.q0(linearLayoutK2)).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.E3
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i12) {
                                                    int i13;
                                                    P1.H1(str5);
                                                    int i14 = iArr[0] == 0 ? 1 : 2;
                                                    a aVar3 = aVar2;
                                                    aVar3.a = i14;
                                                    aVar3.k();
                                                    aVar3.b = editTextF2.getText().toString();
                                                    aVar3.k();
                                                    aVar3.c = editText.getText().toString();
                                                    aVar3.k();
                                                    aVar3.d = editText2.getText().toString();
                                                    aVar3.k();
                                                    int i15 = iArr2[0];
                                                    String[] strArr3 = P1.l;
                                                    aVar3.h = (i15 < 0 || i15 >= 2) ? strArr3[0] : strArr3[i15];
                                                    aVar3.k();
                                                    try {
                                                        i13 = Integer.parseInt(editTextF3.getText().toString().trim());
                                                    } catch (Exception unused4) {
                                                        i13 = 7;
                                                    }
                                                    aVar3.i = i13;
                                                    aVar3.k();
                                                    aVar3.j = iArr3[0] == 1 ? 1 : 0;
                                                    aVar3.k();
                                                    aVar3.q();
                                                    X0.a("智能海报墙设置已保存");
                                                }
                                            }).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("取消", new D1(str5, 2)).setOnCancelListener(new O(str5, 2)).create();
                                            r2 = 16;
                                            P1.y1(alertDialogCreate, new com.github.catvod.spider.merge.p019w.a(str5, 16));
                                        } catch (Exception e2) {
                                            e = e2;
                                            P1.H1(str5);
                                            b.x(e, new StringBuilder((String) r26));
                                            return;
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    r26 = r2;
                                }
                                break;
                        }
                    }
                });
                return;
            case 8:
                a aVarI3 = a.i();
                P1.K0("TMDB配置", aVarI3.b() + " · " + aVarI3.j(), new String[]{"TMDB Token", "API 地址", "图片地址"}, new String[]{aVarI3.g() ? "Token已配置" : "Token未配置", a.h(aVarI3.c), a.h(aVarI3.d)}, new int[]{-16732991, AbstractC0583w0.d, AbstractC0583w0.f}, new Runnable[]{new U2(i2), new U2(i3), new U2(10)});
                return;
            case 9:
                P1.N0(false);
                return;
            case 10:
                P1.N0(true);
                return;
            case 11:
                P1.H0();
                return;
            case 12:
                P1.W0();
                return;
            case 13:
                a aVarI4 = a.i();
                InitOrigin.run(new R0(aVarI4.s(), aVarI4, i6));
                return;
            case 14:
                InitOrigin.run(new RunnableC0601z3(a.i(), i7));
                return;
            case 15:
                InitOrigin.run(new RunnableC0601z3(a.i(), i6));
                return;
            case 16:
                P1.H0();
                return;
            case 17:
                InitOrigin.run(new com.github.catvod.spider.merge.p019w.a("poster_follow_" + System.currentTimeMillis(), 17));
                return;
            case 18:
                InitOrigin.run(new B3(i4));
                return;
            case 19:
                InitOrigin.run(new RunnableC0601z3(a.i(), i));
                return;
            case 20:
                P1.X0("smart_poster_follow_help", null);
                return;
            case 21:
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        int i9 = AbstractC0583w0.e;
                        int i10 = AbstractC0583w0.a;
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity, "恢复默认", "重置智能海报墙设置", i9, new String[][]{new String[]{"内容与显示", "数据源、TMDB、日历和海报样式恢复默认"}, new String[]{"AI推荐", "推荐开关和推荐模型配置会清空"}, new String[]{"个人记录", "搜索和播放记录继续保留"}}, new int[]{i9, -8708190, AbstractC0583w0.d}, new String[]{"确认恢复", "取消"}, new Runnable[]{new B3(i), null}));
                    }
                    return;
                } catch (Exception e) {
                    b.x(e, new StringBuilder("操作失败: "));
                    return;
                }
            case 22:
                InitOrigin.run(new B3(i2));
                return;
            case 23:
                a aVarI5 = a.i();
                String strP = aVarI5.p(AbstractC0251e.p());
                String[] strArr = {"推荐开关", "推荐依据", "分类显示"};
                String str4 = aVarI5.o ? "已开启，行为变化后重新生成" : "默认关闭，不消耗模型额度";
                StringBuilder sb = new StringBuilder("搜索");
                sb.append(aVarI5.m ? "开" : "关");
                sb.append(" · 播放");
                sb.append(aVarI5.n ? "开" : "关");
                String[] strArr2 = {str4, sb.toString(), "AI推荐".concat(aVarI5.p ? "开" : "关")};
                int i11 = AbstractC0583w0.d;
                P1.L0("AI推荐设置", strP, strArr, strArr2, new int[]{-16732991, i11, i11}, new Runnable[]{new U2(26), new U2(27), new U2(28)}, new B3(i8), false);
                return;
            case 24:
                InitOrigin.run(new B3(8));
                return;
            case 25:
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 == null) {
                        return;
                    }
                    int iOptInt = AbstractC0251e.a().optInt("count");
                    int i12 = AbstractC0583w0.e;
                    if (iOptInt > 0) {
                        str = iOptInt + "部";
                    } else {
                        str = "暂无";
                    }
                    String[][] strArr3 = {new String[]{"当前缓存", str}, new String[]{"同时清除", "我的口味画像"}, new String[]{"后续生成", "搜索、播放或进入AI推荐分类后会重新生成"}};
                    int i13 = AbstractC0583w0.a;
                    AbstractC0583w0.j0(AbstractC0583w0.r(activity2, "清空AI推荐缓存", "清理已生成的推荐和口味画像，不影响搜索和播放记录", i12, strArr3, new int[]{AbstractC0583w0.f, -8708190, -16732991}, new String[]{"确认清空", "取消"}, new Runnable[]{new B3(i3), null}));
                    return;
                } catch (Exception unused4) {
                    X0.a("无法清空AI推荐缓存");
                    return;
                }
            case 26:
                InitOrigin.run(new RunnableC0601z3(a.i(), i4));
                return;
            case 27:
                InitOrigin.run(new RunnableC0601z3(a.i(), i5));
                return;
            case 28:
                InitOrigin.run(new RunnableC0601z3(a.i(), 6));
                return;
            default:
                InitOrigin.run(new B3(i7));
                return;
        }
    }
}
