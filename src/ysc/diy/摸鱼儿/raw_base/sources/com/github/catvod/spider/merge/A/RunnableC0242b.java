package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.FishDrive;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p022z.AbstractC0484c0;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0481b2;
import com.github.catvod.spider.merge.p022z.C0523k;
import com.github.catvod.spider.merge.p022z.C0538n;
import com.github.catvod.spider.merge.p022z.C0559r1;
import com.github.catvod.spider.merge.p022z.C0568t0;
import com.github.catvod.spider.merge.p022z.C0572u;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0503g;
import com.github.catvod.spider.merge.p022z.RunnableC0554q0;
import com.github.catvod.spider.merge.p022z.RunnableC0591x3;
import com.github.catvod.spider.merge.p022z.RunnableC0597z;
import com.github.catvod.spider.merge.p022z.ViewOnClickListenerC0524k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0242b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0242b(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        com.github.catvod.spider.merge.p020x.d dVar = (com.github.catvod.spider.merge.p020x.d) this.b;
        try {
            com.github.catvod.spider.merge.p020x.f.z(dVar.b, com.github.catvod.spider.merge.p020x.f.t(dVar, (com.github.catvod.spider.merge.p020x.b) this.c));
            synchronized (com.github.catvod.spider.merge.p020x.f.l) {
                com.github.catvod.spider.merge.p020x.f.o.remove(dVar.b);
            }
        } catch (Throwable th) {
            synchronized (com.github.catvod.spider.merge.p020x.f.l) {
                com.github.catvod.spider.merge.p020x.f.o.remove(dVar.b);
                throw th;
            }
        }
    }

    private final void b() {
        String str;
        int i;
        int i2;
        String str2 = "帮助";
        JSONObject jSONObject = (JSONObject) this.b;
        Map map = (Map) this.c;
        try {
            C0523k c0523k = new C0523k(com.github.catvod.spider.merge.p022z.P1.B0(jSONObject.optString("title", "帮助"), (HashMap) map), com.github.catvod.spider.merge.p022z.P1.B0(jSONObject.optString("subtitle", ""), (HashMap) map));
            ArrayList arrayList = (ArrayList) c0523k.c;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sections");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                int i3 = 0;
                while (i3 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                    com.github.catvod.spider.merge.p022z.T1 t1 = new com.github.catvod.spider.merge.p022z.T1(com.github.catvod.spider.merge.p022z.P1.B0(jSONObject2.optString("title", ""), (HashMap) map));
                    c0523k.d = t1;
                    arrayList.add(t1);
                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("items");
                    if (jSONArrayOptJSONArray2 == null) {
                        str = str2;
                        i = 1;
                    } else {
                        int i4 = 0;
                        while (i4 < jSONArrayOptJSONArray2.length()) {
                            JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i4);
                            String strB0 = com.github.catvod.spider.merge.p022z.P1.B0(jSONObject3.optString("title", ""), (HashMap) map);
                            if ("go".equals(jSONObject3.optString("type", "item"))) {
                                String strB1 = com.github.catvod.spider.merge.p022z.P1.B0(jSONObject3.optString("url", ""), (HashMap) map);
                                if (((com.github.catvod.spider.merge.p022z.T1) c0523k.d) == null) {
                                    com.github.catvod.spider.merge.p022z.T1 t2 = new com.github.catvod.spider.merge.p022z.T1(str2);
                                    c0523k.d = t2;
                                    arrayList.add(t2);
                                }
                                ((com.github.catvod.spider.merge.p022z.T1) c0523k.d).b.add(new Object[]{1, strB0, strB1});
                                i2 = 1;
                            } else {
                                String strB2 = com.github.catvod.spider.merge.p022z.P1.B0(jSONObject3.optString("content", ""), (HashMap) map);
                                if (((com.github.catvod.spider.merge.p022z.T1) c0523k.d) == null) {
                                    com.github.catvod.spider.merge.p022z.T1 t3 = new com.github.catvod.spider.merge.p022z.T1(str2);
                                    c0523k.d = t3;
                                    arrayList.add(t3);
                                }
                                i2 = 1;
                                ((com.github.catvod.spider.merge.p022z.T1) c0523k.d).b.add(new Object[]{0, strB0, strB2});
                            }
                            i4 += i2;
                            str2 = str2;
                            jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                        }
                        str = str2;
                        i = 1;
                    }
                    i3 += i;
                    str2 = str;
                }
                c0523k.a(jSONObject.optString("button", "关闭"));
                return;
            }
            com.github.catvod.spider.merge.p022z.P1.V("帮助内容为空");
        } catch (Exception unused) {
            com.github.catvod.spider.merge.p022z.P1.V("显示帮助失败");
        }
    }

    private final void c() {
        List list = (List) this.b;
        com.github.catvod.spider.merge.p017u.E e = (com.github.catvod.spider.merge.p017u.E) this.c;
        try {
            Activity activity = InitOrigin.getActivity();
            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i = 12;
            layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
            linearLayoutK.addView(AbstractC0583w0.p(activity, "管理接口", "勾选要删除的接口"), layoutParams);
            boolean[] zArr = new boolean[list.size()];
            TextView[] textViewArr = new TextView[list.size()];
            TextView[] textViewArr2 = new TextView[list.size()];
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            int i2 = 0;
            int i3 = 0;
            while (i3 < list.size()) {
                int[] iArr = com.github.catvod.spider.merge.p022z.W1.a;
                int i4 = iArr[i3 % iArr.length];
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(i2);
                linearLayout2.setGravity(16);
                com.github.catvod.spider.merge.p017u.E e2 = e;
                linearLayout2.setPadding(AbstractC0583w0.Q(i, activity), AbstractC0583w0.Q(i, activity), AbstractC0583w0.Q(i, activity), AbstractC0583w0.Q(i, activity));
                linearLayout2.setClickable(true);
                int i5 = AbstractC0583w0.e;
                AbstractC0583w0.n(linearLayout2, i5);
                TextView textView = new TextView(activity);
                int i6 = i3 + 1;
                textView.setText(String.valueOf(i6));
                textView.setTextSize(11.0f);
                textView.setTextColor(-1);
                textView.setTypeface(null, 1);
                textView.setGravity(17);
                textView.setMinWidth(AbstractC0583w0.Q(22, activity));
                LinearLayout linearLayout3 = linearLayoutK;
                textView.setPadding(AbstractC0583w0.Q(5, activity), AbstractC0583w0.Q(3, activity), AbstractC0583w0.Q(5, activity), AbstractC0583w0.Q(3, activity));
                textView.setBackground(AbstractC0583w0.L(activity, i4, 11));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.rightMargin = AbstractC0583w0.Q(12, activity);
                textView.setLayoutParams(layoutParams2);
                linearLayout2.addView(textView);
                TextView textView2 = new TextView(activity);
                textView2.setText(((String) list.get(i3)).replace("https://", "").replace("http://", ""));
                textView2.setTextSize(13.0f);
                textView2.setTextColor(AbstractC0583w0.g);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                i2 = 0;
                textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                textViewArr2[i3] = textView2;
                linearLayout2.addView(textView2);
                TextView textView3 = new TextView(activity);
                textView3.setTextSize(16.0f);
                textView3.setText("");
                textView3.setTextColor(i5);
                textView3.setTypeface(null, 1);
                textViewArr[i3] = textView3;
                linearLayout2.addView(textView3);
                if (i3 > 0) {
                    linearLayout.addView(AbstractC0583w0.C(activity));
                }
                linearLayout.addView(linearLayout2);
                linearLayout2.setOnClickListener(new ViewOnClickListenerC0524k0(zArr, i3, textViewArr2, textViewArr));
                e = e2;
                linearLayoutK = linearLayout3;
                i3 = i6;
                i = 12;
            }
            LinearLayout linearLayout4 = linearLayoutK;
            linearLayout4.addView(AbstractC0583w0.s(activity, linearLayout));
            AlertDialog alertDialogCreate = new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayout4).setPositiveButton("删除选中", new DialogInterfaceOnClickListenerC0503g(zArr, (Object) list, (Object) e, 8)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
            AbstractC0583w0.j0(alertDialogCreate);
            try {
                alertDialogCreate.getButton(-1).setTextColor(AbstractC0583w0.e);
            } catch (Exception unused) {
            }
        } catch (Exception e3) {
            SpiderDebug.log("[Kan360Dialog] showManageParse: " + e3.getMessage());
            X0.a("显示失败");
        }
    }

    private final void d() throws Throwable {
        int i = 2;
        String str = (String) this.c;
        C0559r1 c0559r1 = (C0559r1) this.b;
        C0481b2 c0481b2 = (C0481b2) c0559r1.b;
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity == null) {
                return;
            }
            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
            linearLayoutK.addView(AbstractC0583w0.p(activity, c0481b2.c, "扫码或手动输入"), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
            LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
            AbstractC0583w0.g(linearLayoutY, c0481b2.b + "名称");
            EditText editTextF = AbstractC0583w0.f(linearLayoutY, c0481b2.d, "", false);
            linearLayoutK.addView(linearLayoutY);
            com.github.catvod.spider.merge.p019w.a aVar = new com.github.catvod.spider.merge.p019w.a(str, 8);
            AlertDialog[] alertDialogArr = {new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("添加", new DialogInterfaceOnClickListenerC0503g(c0559r1, aVar, editTextF, 10)).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("取消", new com.github.catvod.spider.merge.p022z.D1(str, i)).setOnCancelListener(new com.github.catvod.spider.merge.p022z.O(str, 2)).setOnDismissListener(new com.github.catvod.spider.merge.p022z.Y1(0, aVar)).create()};
            AbstractC0583w0.j0(alertDialogArr[0]);
            Button button = alertDialogArr[0].getButton(-3);
            String str2 = c0481b2.e;
            com.github.catvod.spider.merge.p022z.P1.x(button, str2, str, c0481b2.f, str2, c0481b2.g, AbstractC0583w0.c, editTextF, new RunnableC0240a0(c0559r1, alertDialogArr, editTextF, aVar, 13));
        } catch (Exception e) {
            SpiderDebug.log("[MusicDialog] showAddDialog: " + e.getMessage());
            X0.a("显示失败");
        }
    }

    private final void e() {
        ((Runnable) this.b).run();
        AbstractC0583w0.g0(((AlertDialog) this.c).getButton(-1));
    }

    private final void f() {
        EditText editText = (EditText) this.b;
        AlertDialog[] alertDialogArr = (AlertDialog[]) this.c;
        String strE = AbstractC0449a.e(editText);
        if (strE.isEmpty()) {
            X0.a("配置内容为空");
            return;
        }
        Pattern pattern = a2.h;
        if (!strE.startsWith("moyu_webdav:")) {
            X0.a("请粘贴 moyu_webdav: 开头的分享配置");
            return;
        }
        if (!Z1.a.q(strE)) {
            X0.a("配置格式错误，请重新复制");
            return;
        }
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        a2 a2Var = Z1.a;
        a2Var.getClass();
        O1 o1 = new O1(a2Var, 3);
        a2Var.d.getClass();
        InitOrigin.run(new com.github.catvod.spider.merge.p017u.B(o1, 10));
    }

    private final void g() {
        JSONArray jSONArray = (JSONArray) this.b;
        AlertDialog alertDialog = (AlertDialog) this.c;
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity == null) {
                return;
            }
            int iQ = AbstractC0583w0.Q(8, activity);
            HashSet hashSet = new HashSet();
            Iterator it = com.github.catvod.spider.merge.p022z.P1.Z().iterator();
            while (it.hasNext()) {
                hashSet.add(Integer.valueOf(((JSONObject) it.next()).optInt("tmdbId")));
            }
            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
            linearLayoutK.addView(AbstractC0583w0.q(activity, "选择追更剧集", jSONArray.length() + " 个结果 · 点开确认详细资料", -16732991), AbstractC0583w0.c0(iQ));
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            linearLayout.setDescendantFocusability(262144);
            AlertDialog[] alertDialogArr = new AlertDialog[1];
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                boolean zContains = hashSet.contains(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")));
                StringBuilder sb = new StringBuilder();
                sb.append(com.github.catvod.spider.merge.p022z.P1.C(jSONObjectOptJSONObject));
                sb.append(zContains ? "\n已订阅" : "");
                String string = sb.toString();
                int i2 = i;
                LinearLayout linearLayoutA = AbstractC0484c0.a(activity, jSONObjectOptJSONObject.optString("poster_path"), jSONObjectOptJSONObject.optString("name"), string, zContains ? AbstractC0583w0.d : -16732991, new RunnableC0591x3(alertDialog, alertDialogArr, jSONObjectOptJSONObject, zContains));
                if (i2 == 0) {
                    linearLayout.addView(linearLayoutA);
                } else {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = iQ;
                    linearLayout.addView(linearLayoutA, layoutParams);
                }
                i = i2 + 1;
            }
            LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
            ScrollView scrollViewJ = AbstractC0583w0.J(activity, linearLayout, 430);
            linearLayoutY.addView(scrollViewJ);
            linearLayoutK.addView(linearLayoutY);
            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("关闭", (DialogInterface.OnClickListener) null).create();
            alertDialogArr[0] = alertDialogCreate;
            AbstractC0583w0.k0(alertDialogCreate, AbstractC0583w0.Y(activity) ? 0.88f : 0.0f);
            AbstractC0583w0.o(scrollViewJ, linearLayout);
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.x(e, new StringBuilder("显示搜索结果失败: "));
        }
    }

    private final void h() {
        Runnable runnable = ((Runnable[]) this.c)[0];
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity == null) {
                return;
            }
            JSONObject jSONObject = (JSONObject) this.b;
            String strOptString = jSONObject.optString("name", "该剧集");
            int iOptInt = jSONObject.optInt("tmdbId");
            int i = AbstractC0583w0.e;
            String[][] strArr = {new String[]{"剧集", strOptString}, new String[]{"排期", com.github.catvod.spider.merge.p022z.P1.X(jSONObject)}};
            int i2 = AbstractC0583w0.a;
            AbstractC0583w0.j0(AbstractC0583w0.r(activity, "移除追更", "移除后不再出现在“我的追更”中", i, strArr, new int[]{-16732991, AbstractC0583w0.f}, new String[]{"确认移除", "取消"}, new Runnable[]{new com.github.catvod.spider.merge.p018v.f(runnable, strOptString, iOptInt), null}));
        } catch (Exception unused) {
            X0.a("无法打开移除确认");
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Dialog dialog;
        Dialog dialog2;
        int i;
        int i2 = 3;
        int i3 = 1;
        int i4 = 0;
        switch (this.a) {
            case 0:
                ((InterfaceC0245c) this.b).dispatch((String) this.c);
                return;
            case 1:
                C0252e0 c0252e0 = (C0252e0) this.b;
                EditText editText = (EditText) this.c;
                if (c0252e0.y || (dialog = c0252e0.e) == null || !dialog.isShowing()) {
                    return;
                }
                editText.requestFocus();
                editText.setSelection(editText.length());
                InputMethodManager inputMethodManager = (InputMethodManager) c0252e0.a.getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(editText, 1);
                    return;
                }
                return;
            case 2:
                C0252e0 c0252e1 = (C0252e0) this.b;
                View view = (View) this.c;
                if (c0252e1.y || (dialog2 = c0252e1.e) == null || !dialog2.isShowing()) {
                    return;
                }
                view.requestFocus();
                return;
            case 3:
                C0246c0 c0246c0 = (C0246c0) this.b;
                boolean[] zArr = (boolean[]) this.c;
                ((C0252e0) c0246c0.c).z = false;
                if (((C0252e0) c0246c0.c).y) {
                    return;
                }
                ((C0252e0) c0246c0.c).n.setVisibility(8);
                if (zArr[0]) {
                    ((C0252e0) c0246c0.c).h.setVisibility(8);
                    TextView textView = ((C0252e0) c0246c0.c).w;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    C0252e0.a((C0252e0) c0246c0.c);
                    return;
                }
                return;
            case 4:
                C0299u0 c0299u0 = (C0299u0) this.b;
                String str = (String) this.c;
                C0299u0 c0299u1 = C0299u0.t;
                c0299u0.getClass();
                Map mapW = C0299u0.w();
                if (mapW == null || !c0299u0.i.tryLock()) {
                    return;
                }
                Map map = c0299u0.f;
                JSONObject jSONObject = c0299u0.g;
                try {
                    if (c0299u0.d && str.equals(C0299u0.F) && !C0299u0.A) {
                        c0299u0.f = mapW;
                        c0299u0.g = null;
                        String lowerCase = C0299u0.L(mapW, str, C0299u0.v, C0299u0.g1() ? "_so_sha256" : "_sha256").toLowerCase();
                        JSONObject jSONObjectF0 = C0299u0.F0(false);
                        if (jSONObjectF0 != null && !lowerCase.equals(jSONObjectF0.optString("digest")) && lowerCase.matches("[0-9a-f]{64}")) {
                            if (!lowerCase.equals(C0297t1.i(C0299u0.Y0(true) + "_rejected"))) {
                                JSONObject jSONObjectW0 = c0299u0.W0(C0299u0.v, C0299u0.g1() ? c0299u0.t(C0299u0.v) : c0299u0.s(C0299u0.v));
                                if (jSONObjectW0 != null) {
                                    C0297t1.k(C0299u0.Y0(true), jSONObjectW0.toString());
                                }
                                break;
                            }
                        }
                    }
                    return;
                } finally {
                    c0299u0.f = map;
                    c0299u0.g = jSONObject;
                    c0299u0.i.unlock();
                }
            case 5:
                a2 a2Var = (a2) this.b;
                String str2 = (String) this.c;
                a2Var.getClass();
                C0297t1.j("webdav_config", str2);
                C0297t1.j("webdav_last_version", "");
                C0297t1.j("smart_history_sync_status", "");
                a2Var.a = false;
                a2Var.b = 0;
                a2Var.c = 0;
                k2.c.incrementAndGet();
                synchronized (k2.b) {
                    k2.f = false;
                    k2.g = false;
                    k2.h = "";
                    k2.i = false;
                    k2.l = "";
                    k2.j = 0L;
                    k2.k = "";
                    break;
                }
                return;
            case 6:
                V0 v0 = new V0((String) this.c, i2);
                C0568t0 c0568t0 = (C0568t0) this.b;
                c0568t0.b.post(new RunnableC0554q0(c0568t0, v0, 2));
                return;
            case 7:
                FishDrive fishDrive = (FishDrive) this.b;
                JSONObject jSONObject2 = FishDrive.f;
                try {
                    fishDrive.homeContent(false);
                    break;
                } catch (Exception unused) {
                }
                fishDrive.action((String) this.c);
                return;
            case 8:
                Pattern pattern = Market.c;
                ((Market) this.b).q((String) this.c);
                return;
            case 9:
                List<JSONObject> list = (List) this.c;
                HashMap map2 = PianDan.c;
                PianDan pianDan = (PianDan) this.b;
                pianDan.getClass();
                AtomicBoolean atomicBoolean = PianDan.e;
                try {
                    pianDan.a = com.github.catvod.spider.merge.p010l.a.i();
                    for (JSONObject jSONObject3 : list) {
                        try {
                            int iOptInt = jSONObject3.optInt("tmdbId");
                            JSONObject jSONObjectC0 = pianDan.c0("/tv/" + iOptInt, PianDan.G(new String[0]), 0L);
                            if (jSONObjectC0.optInt("id") == iOptInt) {
                                AbstractC0251e.R(pianDan.s(jSONObjectC0, jSONObject3));
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    atomicBoolean.set(false);
                    return;
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
            case 10:
                a();
                return;
            case 11:
                ((C0538n) this.b).i((Runnable) this.c);
                return;
            case 12:
                View view2 = (View) this.b;
                if (view2.isAttachedToWindow()) {
                    view2.setEnabled(true);
                    com.github.catvod.spider.merge.D.b.x((Exception) this.c, new StringBuilder("获取模型失败: "));
                    return;
                }
                return;
            case 13:
                ((C0572u) this.b).b.setText((String) this.c);
                return;
            case 14:
                String str3 = (String) this.c;
                com.github.catvod.spider.merge.p005f.b bVar = (com.github.catvod.spider.merge.p005f.b) this.b;
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null) {
                        return;
                    }
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                    TextView textViewX = AbstractC0583w0.x(activity, "扫码输入", -298343);
                    textViewX.setGravity(17);
                    textViewX.setFocusable(true);
                    AbstractC0583w0.n(textViewX, -298343);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = AbstractC0583w0.Q(8, activity);
                    linearLayoutK.addView(textViewX, layoutParams);
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                    AbstractC0583w0.g(linearLayoutY, "分类名称");
                    EditText editTextE = AbstractC0583w0.e(linearLayoutY, "如：鬼灭之刃、原神、美食", "", false);
                    linearLayoutK.addView(linearLayoutY);
                    com.github.catvod.spider.merge.p022z.P1.x(textViewX, "添加分类", str3, "category", "分类名称", "如：鬼灭之刃、原神、美食", -298343, editTextE, new RunnableC0240a0((Object) alertDialogArr, (Object) bVar, (KeyEvent.Callback) editTextE, str3, 6));
                    int i5 = 2;
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle("添加分类").setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("添加", new DialogInterfaceOnClickListenerC0503g(str3, bVar, editTextE, i5)).setNegativeButton("取消", new com.github.catvod.spider.merge.p022z.D1(str3, i5)).setOnCancelListener(new com.github.catvod.spider.merge.p022z.O(str3, 2)).create();
                    AlertDialog[] alertDialogArr = {alertDialogCreate};
                    AbstractC0583w0.j0(alertDialogCreate);
                    return;
                } catch (Exception unused3) {
                    X0.a("操作失败");
                    return;
                }
            case 15:
                List list2 = (List) this.b;
                com.github.catvod.spider.merge.p022z.G g = (com.github.catvod.spider.merge.p022z.G) this.c;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    int iQ = AbstractC0583w0.Q(8, activity2);
                    String[] strArr = (String[]) list2.toArray(new String[0]);
                    boolean[] zArr2 = new boolean[strArr.length];
                    Arrays.fill(zArr2, true);
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                    linearLayoutK2.addView(AbstractC0583w0.p(activity2, "删除分类", "关闭开关即可删除对应分类"), AbstractC0583w0.c0(iQ));
                    LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity2);
                    linearLayoutY2.setDescendantFocusability(262144);
                    LinearLayout linearLayout = new LinearLayout(activity2);
                    linearLayout.setOrientation(1);
                    linearLayout.setDescendantFocusability(262144);
                    int i6 = 0;
                    while (i6 < strArr.length) {
                        int i7 = i6;
                        AbstractC0583w0.m(linearLayout, strArr[i6], null, AbstractC0583w0.e, true, i7, i6 > 0, null, zArr2, null);
                        i6 = i7 + 1;
                    }
                    ScrollView scrollView = new ScrollView(activity2);
                    scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    scrollView.setFillViewport(true);
                    scrollView.setFocusable(false);
                    scrollView.setFocusableInTouchMode(false);
                    scrollView.setDescendantFocusability(262144);
                    scrollView.addView(linearLayout);
                    AbstractC0583w0.o(scrollView, linearLayout);
                    linearLayoutY2.addView(scrollView);
                    scrollView.post(new com.github.catvod.spider.merge.p022z.A(scrollView, AbstractC0583w0.Q(280, activity2), 0));
                    AbstractC0583w0.l(linearLayoutY2, "关闭开关表示选中删除");
                    linearLayoutK2.addView(linearLayoutY2);
                    AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(linearLayoutK2).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0503g(zArr2, (Object) strArr, (Object) g, i3)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    return;
                } catch (Exception unused4) {
                    X0.a("操作失败");
                    return;
                }
            case 16:
                List list3 = (List) this.b;
                com.github.catvod.spider.merge.p022z.H h = (com.github.catvod.spider.merge.p022z.H) this.c;
                try {
                    Activity activity3 = InitOrigin.getActivity();
                    ArrayList arrayList = new ArrayList(list3);
                    LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.bottomMargin = AbstractC0583w0.Q(12, activity3);
                    linearLayoutK3.addView(AbstractC0583w0.p(activity3, "分类排序", "使用上移按钮调整分类顺序"), layoutParams2);
                    LinearLayout linearLayout2 = new LinearLayout(activity3);
                    linearLayout2.setOrientation(1);
                    Runnable[] runnableArr = {null};
                    RunnableC0597z runnableC0597z = new RunnableC0597z(i4, linearLayout2, arrayList, runnableArr);
                    runnableArr[0] = runnableC0597z;
                    runnableC0597z.run();
                    linearLayoutK3.addView(AbstractC0583w0.s(activity3, linearLayout2));
                    AbstractC0583w0.j0(new AlertDialog.Builder(activity3).setView(linearLayoutK3).setPositiveButton("保存", new P0(h, arrayList, i2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    return;
                } catch (Exception unused5) {
                    return;
                }
            case 17:
                try {
                    ((com.github.catvod.spider.merge.p022z.Q) this.b).a((String) this.c);
                    return;
                } catch (Exception e) {
                    com.github.catvod.spider.merge.D.b.x(e, new StringBuilder("保存失败: "));
                    return;
                }
            case 18:
                ((Dialog) this.b).dismiss();
                X0.a("下载失败: HTTP " + ((Response) this.c).code());
                return;
            case 19:
                com.github.catvod.spider.merge.p022z.O1 o1 = (com.github.catvod.spider.merge.p022z.O1) this.c;
                JSONObject jSONObject4 = o1.b;
                ArrayList arrayList2 = new ArrayList();
                String strOptString = jSONObject4.optString("originalName");
                if (!strOptString.isEmpty() && !strOptString.equals(jSONObject4.optString("name"))) {
                    arrayList2.add(new String[]{"原名", strOptString});
                }
                int i8 = o1.d;
                String str4 = (i8 <= 0 || (i = o1.e) <= 0) ? "" : String.format(Locale.US, "S%02dE%02d", Integer.valueOf(i8), Integer.valueOf(i));
                StringBuilder sb = new StringBuilder();
                sb.append(o1.a);
                sb.append(str4.isEmpty() ? "" : " · ".concat(str4));
                arrayList2.add(new String[]{"排期", sb.toString()});
                arrayList2.add(new String[]{"状态", o1.c ? "已更新" : "待更新"});
                String strOptString2 = jSONObject4.optString("overview");
                if (!strOptString2.isEmpty()) {
                    arrayList2.add(new String[]{"简介", strOptString2});
                }
                int i9 = AbstractC0583w0.a;
                Context context = (Context) this.b;
                AbstractC0583w0.j0(AbstractC0583w0.r(context, jSONObject4.optString("name", "追更详情"), "追更排期预览", -16732991, (String[][]) arrayList2.toArray(new String[0][]), null, new String[]{"搜索资源", "关闭"}, new Runnable[]{new RunnableC0242b((Activity) context, jSONObject4, 20), null}));
                return;
            case 20:
                Context context2 = (Context) this.b;
                String strTrim = ((JSONObject) this.c).optString("name").trim();
                if (strTrim.isEmpty()) {
                    return;
                }
                try {
                    Activity activity4 = (Activity) context2;
                    if ((context2.getResources().getConfiguration().uiMode & 15) != 4) {
                        i3 = 0;
                    }
                    String name = activity4.getClass().getPackage().getName();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(name);
                    sb2.append(i3 != 0 ? ".CollectActivity" : ".SearchActivity");
                    context2.startActivity(new Intent().setClassName(context2.getPackageName(), sb2.toString()).putExtra("keyword", strTrim));
                    AbstractC0251e.x(strTrim);
                    return;
                } catch (Exception unused6) {
                    Pattern pattern2 = AbstractC0309x1.a;
                    try {
                        ((ClipboardManager) InitOrigin.context().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("fongmi", strTrim));
                        X0.a("已複製 ".concat(strTrim));
                        return;
                    } catch (Exception unused7) {
                        return;
                    }
                }
            case 21:
                b();
                return;
            case 22:
                String str5 = (String) this.c;
                com.github.catvod.spider.merge.p017u.E e2 = (com.github.catvod.spider.merge.p017u.E) this.b;
                try {
                    Activity activity5 = InitOrigin.getActivity();
                    if (activity5 == null) {
                        return;
                    }
                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity5);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.bottomMargin = AbstractC0583w0.Q(12, activity5);
                    linearLayoutK4.addView(AbstractC0583w0.p(activity5, "添加解析接口", "扫码或手动输入解析地址"), layoutParams3);
                    int i10 = AbstractC0583w0.c;
                    TextView textViewX2 = AbstractC0583w0.x(activity5, "扫码输入", i10);
                    textViewX2.setGravity(17);
                    textViewX2.setFocusable(true);
                    AbstractC0583w0.n(textViewX2, i10);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams4.bottomMargin = AbstractC0583w0.Q(8, activity5);
                    linearLayoutK4.addView(textViewX2, layoutParams4);
                    LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity5);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams5.topMargin = AbstractC0583w0.Q(8, activity5);
                    AbstractC0583w0.g(linearLayoutY3, "解析接口地址");
                    EditText editTextE2 = AbstractC0583w0.e(linearLayoutY3, "https://jx.example.com/?url=", "", false);
                    int i11 = AbstractC0583w0.i;
                    Context context3 = linearLayoutY3.getContext();
                    TextView textView2 = new TextView(context3);
                    textView2.setText("格式: https://解析域名/?url= 或 https://解析域名/?v=");
                    textView2.setTextSize(12.0f);
                    textView2.setTextColor(i11);
                    textView2.setPadding(AbstractC0583w0.Q(4, context3), 0, 0, AbstractC0583w0.Q(6, context3));
                    linearLayoutY3.addView(textView2);
                    linearLayoutK4.addView(linearLayoutY3, layoutParams5);
                    com.github.catvod.spider.merge.p022z.P1.x(textViewX2, "添加解析接口", str5, "parseUrl", "解析接口地址", "请输入解析接口地址", i10, editTextE2, new RunnableC0240a0((Object) alertDialogArr, (Object) editTextE2, str5, (Object) e2, 12));
                    AlertDialog alertDialogCreate2 = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK4)).setPositiveButton("添加", new DialogInterfaceOnClickListenerC0503g(str5, editTextE2, e2, 7)).setNegativeButton("取消", new com.github.catvod.spider.merge.p022z.D1(str5, 2)).setOnCancelListener(new com.github.catvod.spider.merge.p022z.O(str5, 2)).create();
                    AlertDialog[] alertDialogArr2 = {alertDialogCreate2};
                    AbstractC0583w0.j0(alertDialogCreate2);
                    return;
                } catch (Exception e3) {
                    SpiderDebug.log("[Kan360Dialog] showAddParse: " + e3.getMessage());
                    X0.a("显示失败");
                    return;
                }
            case 23:
                c();
                return;
            case 24:
                d();
                return;
            case 25:
                e();
                return;
            case 26:
                f();
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                C0299u0.L0((String[]) this.b);
                X0.a(((String) this.c) + " 已恢复默认线程");
                return;
        }
    }

    public /* synthetic */ RunnableC0242b(String str, Object obj, int i) {
        this.a = i;
        this.c = str;
        this.b = obj;
    }
}
