package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.github.catvod.spider.HonHon;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.RunnableC0466s;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0512h3;
import com.github.catvod.spider.merge.p022z.C0537m3;
import com.github.catvod.spider.merge.p022z.C0538n;
import com.github.catvod.spider.merge.p022z.C0559r1;
import com.github.catvod.spider.merge.p022z.C0568t0;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0503g;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0518j;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0562s;
import com.github.catvod.spider.merge.p022z.RunnableC0508h;
import com.github.catvod.spider.merge.p022z.RunnableC0554q0;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0240a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0240a0(Object obj, Object obj2, KeyEvent.Callback callback, String str, int i) {
        this.a = i;
        this.d = obj;
        this.c = obj2;
        this.e = callback;
        this.b = str;
    }

    private final void a() {
        String str = (String) this.b;
        ((Dialog) this.d).dismiss();
        File file = (File) this.c;
        boolean zEndsWith = file.getName().toLowerCase().endsWith(".apk");
        Activity activity = (Activity) this.e;
        if (zEndsWith) {
            com.github.catvod.spider.merge.p022z.P1.l0(activity, file);
            return;
        }
        String name = file.getName();
        if (activity == null || activity.isFinishing()) {
            X0.a("下载完成: " + name);
            return;
        }
        try {
            boolean zEndsWith2 = name.toLowerCase().endsWith(".apk");
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            int i = AbstractC0583w0.d;
            AlertDialog.Builder positiveButton = builder.setView(AbstractC0583w0.p0(com.github.catvod.spider.merge.p022z.P1.K(activity, "下载完成", name, i, new String[][]{new String[]{"文件", name}, new String[]{"保存到", str}}, new int[]{i, AbstractC0583w0.i}))).setPositiveButton("完成", (DialogInterface.OnClickListener) null);
            if (zEndsWith2) {
                positiveButton.setNeutralButton("安装", new P0(activity, str, 7));
            }
            AbstractC0583w0.j0(positiveButton.create());
        } catch (Exception unused) {
            X0.a("下载完成: " + name);
        }
    }

    private final void b() {
        String[][] strArr = (String[][]) this.b;
        List list = (List) this.c;
        com.github.catvod.spider.merge.p022z.K1 k1 = (com.github.catvod.spider.merge.p022z.K1) this.d;
        k1.getClass();
        try {
            Activity activity = InitOrigin.getActivity();
            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
            linearLayoutK.addView(AbstractC0583w0.p(activity, "网盘过滤", "开启要在搜索结果中显示的网盘类型"), layoutParams);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            int i = 0;
            while (true) {
                int length = strArr.length;
                boolean[] zArr = (boolean[]) this.e;
                if (i >= length) {
                    linearLayoutK.addView(AbstractC0583w0.s(activity, linearLayout));
                    AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayoutK).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0562s(k1, list, strArr, zArr, 2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    return;
                } else {
                    String str = strArr[i][1];
                    int[] iArr = com.github.catvod.spider.merge.p022z.K1.f;
                    AbstractC0583w0.m(linearLayout, str, null, iArr[i % iArr.length], zArr[i], i, i > 0, null, zArr, null);
                    i++;
                }
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[FishPsDialog] showFilterDialog: "));
        }
    }

    private final void c() {
        AlertDialog[] alertDialogArr = (AlertDialog[]) this.d;
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        String strTrim = ((EditText) this.c).getText().toString().trim();
        com.github.catvod.spider.merge.p022z.P1.H1((String) this.b);
        alertDialogArr[0].dismiss();
        com.github.catvod.spider.merge.p017u.E e = (com.github.catvod.spider.merge.p017u.E) this.e;
        if (e == null || TextUtils.isEmpty(strTrim)) {
            return;
        }
        e.a(strTrim);
    }

    private final void d() {
        C0559r1 c0559r1 = (C0559r1) this.d;
        c0559r1.getClass();
        AlertDialog[] alertDialogArr = (AlertDialog[]) this.b;
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        String strTrim = ((EditText) this.c).getText().toString().trim();
        ((Runnable) this.e).run();
        alertDialogArr[0].dismiss();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        c0559r1.m(strTrim);
    }

    private final void e() {
        String str = (String) this.b;
        boolean zEquals = "username".equals(str);
        EditText editText = (EditText) this.d;
        String str2 = (String) this.c;
        if (zEquals || "phone".equals(str)) {
            editText.setText(str2);
            return;
        }
        boolean zEquals2 = "password".equals(str);
        EditText editText2 = (EditText) this.e;
        if (zEquals2) {
            editText2.setText(str2);
            return;
        }
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        if (!str2.contains(":") && !str2.contains("：")) {
            editText.setText(str2);
            return;
        }
        String[] strArrSplit = str2.split("[:：]", 2);
        if (strArrSplit.length == 2) {
            editText.setText(strArrSplit[0].trim());
            editText2.setText(strArrSplit[1].trim());
        }
    }

    private final void f() {
        C0512h3 c0512h3 = ((C0512h3[]) this.d)[0];
        if (c0512h3 != null) {
            String str = (String) this.e;
            if (str == null || str.isEmpty()) {
                str = null;
            }
            c0512h3.b(true, (String) this.b, null, (List) this.c, str, "Token");
        }
    }

    private final void g() {
        CountDownLatch countDownLatch = (CountDownLatch) this.d;
        Bitmap bitmap = (Bitmap) this.b;
        Bitmap bitmap2 = (Bitmap) this.c;
        AtomicInteger atomicInteger = (AtomicInteger) this.e;
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity == null) {
                X0.a("请先打开主界面");
                countDownLatch.countDown();
            } else {
                LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                View viewP = AbstractC0583w0.p(activity, "安全验证", "拖动下方滑块，旋转内圈图片对齐外圈");
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                linearLayoutK.addView(viewP, layoutParams);
                LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                linearLayoutY.setGravity(17);
                int iQ = AbstractC0583w0.Q(200, activity);
                int iQ2 = AbstractC0583w0.Q(136, activity);
                FrameLayout frameLayout = new FrameLayout(activity);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iQ, iQ);
                layoutParams2.gravity = 17;
                layoutParams2.bottomMargin = AbstractC0583w0.Q(8, activity);
                frameLayout.setLayoutParams(layoutParams2);
                ImageView imageView = new ImageView(activity);
                imageView.setImageBitmap(bitmap);
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
                imageView.setScaleType(scaleType);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iQ, iQ);
                layoutParams3.gravity = 17;
                frameLayout.addView(imageView, layoutParams3);
                ImageView imageView2 = new ImageView(activity);
                imageView2.setImageBitmap(bitmap2);
                imageView2.setScaleType(scaleType);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iQ2, iQ2);
                layoutParams4.gravity = 17;
                frameLayout.addView(imageView2, layoutParams4);
                linearLayoutY.addView(frameLayout);
                TextView textView = new TextView(activity);
                textView.setText("0°");
                textView.setTextSize(14.0f);
                textView.setTextColor(AbstractC0583w0.c);
                textView.setGravity(17);
                textView.setTypeface(null, 1);
                linearLayoutY.addView(textView);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams5.bottomMargin = AbstractC0583w0.Q(10, activity);
                linearLayoutK.addView(linearLayoutY, layoutParams5);
                LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity);
                AbstractC0583w0.g(linearLayoutY2, "旋转角度");
                SeekBar seekBar = new SeekBar(activity);
                seekBar.setMax(360);
                seekBar.setProgress(0);
                seekBar.setPadding(AbstractC0583w0.Q(4, activity), AbstractC0583w0.Q(8, activity), AbstractC0583w0.Q(4, activity), AbstractC0583w0.Q(8, activity));
                linearLayoutY2.addView(seekBar);
                TextView textView2 = new TextView(activity);
                textView2.setText("← 左右拖动 / 遥控器方向键 →");
                textView2.setTextSize(11.0f);
                textView2.setTextColor(AbstractC0583w0.i);
                textView2.setGravity(17);
                linearLayoutY2.addView(textView2);
                linearLayoutK.addView(linearLayoutY2);
                seekBar.setOnSeekBarChangeListener(new C0537m3(textView, imageView2));
                AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("确认", new DialogInterfaceOnClickListenerC0503g(atomicInteger, seekBar, countDownLatch, 11)).setNegativeButton("取消", new DialogInterfaceOnClickListenerC0518j(2, countDownLatch)).setCancelable(false).create();
                alertDialogCreate.setOnDismissListener(new com.github.catvod.spider.merge.p022z.Y1(2, countDownLatch));
                alertDialogCreate.show();
                AbstractC0583w0.l0(alertDialogCreate, 0.0f);
            }
        } catch (Exception e) {
            X0.a("验证码弹窗异常: " + e.getMessage());
            countDownLatch.countDown();
        }
    }

    private final void h() {
        EditText editText;
        String[] strArr = (String[]) this.d;
        int length = strArr.length;
        EditText[] editTextArr = (EditText[]) this.c;
        int iMin = Math.min(length, editTextArr.length);
        for (int i = 0; i < iMin; i++) {
            String str = strArr[i];
            if (str != null && str.equals((String) this.b) && (editText = editTextArr[i]) != null) {
                editText.setText((String) this.e);
                return;
            }
        }
    }

    private final void i() {
        AlertDialog alertDialog = (AlertDialog) this.d;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        TextView textView = (TextView) this.b;
        textView.setEnabled(true);
        textView.setAlpha(1.0f);
        textView.setText("搜索剧集");
        JSONArray jSONArray = (JSONArray) this.c;
        if (jSONArray.length() == 0) {
            X0.a("未找到剧集，请检查剧名或 TMDB 配置");
            ((EditText) this.e).requestFocus();
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt("id") > 0 && !jSONObjectOptJSONObject.optString("name").isEmpty()) {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        if (jSONArray2.length() == 0) {
            X0.a("未找到可添加的剧集");
        } else {
            InitOrigin.run(new RunnableC0242b(jSONArray2, alertDialog, 27));
        }
    }

    private final void j() {
        InitOrigin.run(new RunnableC0240a0((AlertDialog) this.d, (TextView) this.c, PianDan.searchFollowCandidates((String) this.b), (EditText) this.e, 19));
    }

    /* JADX WARN: Type inference failed for: r15v10, types: [java.io.Serializable, java.lang.String[]] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        JSONObject jSONObject;
        LinearLayout linearLayout;
        String str;
        String str2;
        int i = 5;
        switch (this.a) {
            case 0:
                final C0246c0 c0246c0 = (C0246c0) this.d;
                String str3 = (String) this.b;
                List list = (List) this.c;
                boolean[] zArr = (boolean[]) this.e;
                if (((C0252e0) c0246c0.c).y) {
                    return;
                }
                ((C0252e0) c0246c0.c).t.put(str3, list);
                ((C0252e0) c0246c0.c).p.add(str3);
                int size = ((C0252e0) c0246c0.c).p.size() - 1;
                ((C0252e0) c0246c0.c).b(size, str3);
                C0249d0 c0249d0J = ((C0252e0) c0246c0.c).j();
                ((C0252e0) c0246c0.c).s.add(c0249d0J);
                ((C0252e0) c0246c0.c).n(size, c0249d0J);
                if (zArr[0]) {
                    zArr[0] = false;
                    ((C0252e0) c0246c0.c).h.setVisibility(8);
                    TextView textView = ((C0252e0) c0246c0.c).w;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    c0249d0J.a.setVisibility(0);
                    ((C0252e0) c0246c0.c).k.setAlpha(0.0f);
                    ((C0252e0) c0246c0.c).k.setVisibility(0);
                    ((C0252e0) c0246c0.c).k.animate().alpha(1.0f).setDuration(200L).start();
                    ((C0252e0) c0246c0.c).r.setAlpha(0.0f);
                    ((C0252e0) c0246c0.c).r.setVisibility(0);
                    ((C0252e0) c0246c0.c).r.animate().alpha(1.0f).setDuration(200L).start();
                    final int i2 = 0;
                    ((C0252e0) c0246c0.c).n.setVisibility(0);
                    ((TextView) ((C0252e0) c0246c0.c).o.get(0)).post(new Runnable() { // from class: com.github.catvod.spider.merge.A.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    ((C0252e0) c0246c0.c).E(0);
                                    break;
                                default:
                                    C0252e0 c0252e0 = (C0252e0) c0246c0.c;
                                    if (!c0252e0.p(0)) {
                                        c0252e0.x(0);
                                    }
                                    break;
                            }
                        }
                    });
                    final int i3 = 1;
                    c0249d0J.b.post(new Runnable() { // from class: com.github.catvod.spider.merge.A.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    ((C0252e0) c0246c0.c).E(0);
                                    break;
                                default:
                                    C0252e0 c0252e0 = (C0252e0) c0246c0.c;
                                    if (!c0252e0.p(0)) {
                                        c0252e0.x(0);
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                C0568t0[] c0568t0Arr = (C0568t0[]) this.e;
                String str4 = (String) this.b;
                List list2 = (List) this.c;
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null) {
                        countDownLatch.countDown();
                        return;
                    }
                    C0568t0 c0568t0I0 = AbstractC0583w0.i0(activity, "磁力云下载", "《" + AbstractC0302v0.x1(str4) + "》 · 最多等待60秒", AbstractC0302v0.X0((String) list2.get(0)));
                    c0568t0Arr[0] = c0568t0I0;
                    c0568t0I0.b.post(new RunnableC0554q0(c0568t0I0, null, 1));
                    countDownLatch.countDown();
                    return;
                } catch (Exception unused) {
                }
                break;
            case 2:
                String[] strArr = HonHon.h;
                HonHon honHon = (HonHon) this.d;
                honHon.getClass();
                AlertDialog alertDialog = ((AlertDialog[]) this.b)[0];
                EditText editText = (EditText) this.c;
                String strE = AbstractC0449a.e(editText);
                if (strE.isEmpty()) {
                    X0.a("请先输入短剧名称");
                    editText.requestFocus();
                    return;
                }
                TextView textView2 = (TextView) this.e;
                if (textView2.isEnabled()) {
                    textView2.setEnabled(false);
                    textView2.setAlpha(0.6f);
                    textView2.setText("正在搜索...");
                    InitOrigin.execute(new RunnableC0466s(honHon, strE, alertDialog, textView2, editText, 0));
                    return;
                }
                return;
            case 3:
                Pattern pattern = Market.c;
                Market market = (Market) this.d;
                market.getClass();
                String str5 = (String) this.b;
                InitOrigin.execute(new RunnableC0466s(market, (String[]) this.c, (String) this.e, com.github.catvod.spider.merge.p022z.P1.k1(str5), str5, 1));
                return;
            case 4:
                String str6 = (String) this.b;
                String str7 = (String) this.d;
                Dialog dialog = (Dialog) this.c;
                try {
                    String strI = com.github.catvod.spider.merge.p021y.b.i(str6, str7);
                    if (strI == null || strI.isEmpty()) {
                        com.github.catvod.spider.merge.p022z.P1.S(dialog);
                        X0.a("获取下载地址失败");
                    } else {
                        Map mapP = com.github.catvod.spider.merge.p021y.b.p(str6);
                        boolean zEquals = "115".equals(str6);
                        String str8 = (String) this.e;
                        if (zEquals || "guangya".equals(str6) || "yidong".equals(str6) || "yidong_family".equals(str6)) {
                            com.github.catvod.spider.merge.p022z.P1.S(dialog);
                            InitOrigin.run(new com.github.catvod.spider.merge.p017u.W(str8, strI, (Object) mapP, i));
                        } else {
                            Object obj = null;
                            String strX0 = C0299u0.x0(strI, mapP, com.github.catvod.spider.merge.p021y.b.D(str6), str6, null);
                            com.github.catvod.spider.merge.p022z.P1.S(dialog);
                            if (strX0 == null || strX0.isEmpty()) {
                                X0.a("本地播放代理正在准备，请稍后重试");
                            } else {
                                InitOrigin.run(new com.github.catvod.spider.merge.p017u.W(str8, strX0, obj, i));
                            }
                        }
                    }
                    return;
                } catch (Exception e) {
                    com.github.catvod.spider.merge.p022z.P1.S(dialog);
                    com.github.catvod.spider.merge.D.b.x(e, new StringBuilder("下载失败: "));
                    return;
                }
            case 5:
                C0239a c0239a = (C0239a) this.c;
                Runnable runnable = (Runnable) this.e;
                C0538n c0538n = (C0538n) this.d;
                c0538n.getClass();
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 == null || (jSONObject = (JSONObject) this.b) == null) {
                        throw new Exception("未获取到直播间信息");
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject != null) {
                        jSONObject = jSONObjectOptJSONObject;
                    }
                    String strTrim = jSONObject.optString("site").trim();
                    String strTrim2 = jSONObject.optString("room_id", jSONObject.optString("roomId")).trim();
                    if (strTrim.isEmpty() || strTrim2.isEmpty()) {
                        throw new Exception("直播间信息不完整");
                    }
                    String strOptString = jSONObject.optString("platform", c0538n.f(strTrim));
                    String strOptString2 = jSONObject.optString("user_name", jSONObject.optString("userName", "主播"));
                    String strOptString3 = jSONObject.optString("title", "");
                    String strOptString4 = jSONObject.optString("cover", "");
                    String strOptString5 = jSONObject.optString("status", "");
                    if ("1".equals(strOptString5) || "true".equalsIgnoreCase(strOptString5)) {
                        strOptString5 = "直播中";
                    } else if ("0".equals(strOptString5) || "false".equalsIgnoreCase(strOptString5)) {
                        strOptString5 = "未开播";
                    } else if (strOptString5.isEmpty()) {
                        strOptString5 = "未知";
                    }
                    c0239a.getClass();
                    String str9 = C0239a.h(strTrim, strTrim2) ? "该直播间已在我的关注中" : "确认后加入我的关注";
                    int iE = C0538n.e(strTrim);
                    String[][] strArr2 = {new String[]{"平台", strOptString}, new String[]{"主播", strOptString2.isEmpty() ? "主播" : strOptString2}, new String[]{"标题", strOptString3.isEmpty() ? "暂无标题" : strOptString3}, new String[]{"房间号", strTrim2}, new String[]{"状态", strOptString5}};
                    int i4 = AbstractC0583w0.a;
                    int i5 = AbstractC0583w0.a;
                    AbstractC0583w0.j0(AbstractC0583w0.r(activity2, "解析成功", str9, iE, strArr2, null, new String[]{"加入关注", "取消"}, new Runnable[]{new RunnableC0508h(c0538n, c0239a, strTrim, strTrim2, runnable, strOptString2, strOptString4, strOptString3), null}));
                    return;
                } catch (Exception e2) {
                    com.github.catvod.spider.merge.D.b.x(e2, new StringBuilder("解析失败："));
                    return;
                }
            case 6:
                AlertDialog[] alertDialogArr = (AlertDialog[]) this.d;
                AlertDialog alertDialog2 = alertDialogArr[0];
                if (alertDialog2 == null || !alertDialog2.isShowing()) {
                    return;
                }
                ((com.github.catvod.spider.merge.p005f.b) this.c).c(((EditText) this.e).getText().toString().trim());
                com.github.catvod.spider.merge.p022z.P1.H1((String) this.b);
                alertDialogArr[0].dismiss();
                return;
            case 7:
                Context context = (Context) this.e;
                if (!((AlertDialog) this.d).isShowing()) {
                    return;
                }
                LinearLayout linearLayout2 = (LinearLayout) this.c;
                linearLayout2.removeAllViews();
                String str10 = (String) this.b;
                if (str10 == null || str10.isEmpty()) {
                    com.github.catvod.spider.merge.p022z.P1.l(linearLayout2, "Go服务无响应(空)");
                    return;
                }
                if (!str10.trim().startsWith("{")) {
                    if (str10.length() > 80) {
                        str10 = str10.substring(0, 80) + "...";
                    }
                    com.github.catvod.spider.merge.p022z.P1.l(linearLayout2, "非预期响应: " + str10.trim());
                    return;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(str10);
                    int iQ = AbstractC0583w0.Q(8, context);
                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("input");
                    if (jSONObjectOptJSONObject2 != null) {
                        try {
                            LinearLayout linearLayoutY = AbstractC0583w0.y(context);
                            AbstractC0583w0.c(AbstractC0583w0.h, linearLayoutY, "输入参数");
                            String strOptString6 = jSONObjectOptJSONObject2.optString("name");
                            str = str10;
                            try {
                                int i6 = AbstractC0583w0.g;
                                AbstractC0583w0.j(linearLayoutY, "剧名", strOptString6, i6);
                                AbstractC0583w0.j(linearLayoutY, "集数", String.valueOf(jSONObjectOptJSONObject2.optInt("episode")), i6);
                                int iOptInt = jSONObjectOptJSONObject2.optInt("total", 0);
                                if (iOptInt > 0) {
                                    AbstractC0583w0.j(linearLayoutY, "总集数", String.valueOf(iOptInt), i6);
                                }
                                linearLayout2.addView(linearLayoutY, AbstractC0583w0.c0(iQ));
                            } catch (Exception e3) {
                                e = e3;
                                linearLayout = linearLayout2;
                                com.github.catvod.spider.merge.p022z.P1.l(linearLayout, "解析失败: " + e.getMessage() + "\n原始: " + str);
                                return;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str = str10;
                        }
                    } else {
                        str = str10;
                    }
                    if (!jSONObject2.optBoolean("ai_enabled", false)) {
                        com.github.catvod.spider.merge.p022z.P1.l(linearLayout2, "AI未启用: " + jSONObject2.optString("ai_error", "未配置API Key"));
                        return;
                    }
                    String strOptString7 = jSONObject2.optString("ai_user_message", "");
                    if (!strOptString7.isEmpty()) {
                        LinearLayout linearLayoutZ = AbstractC0583w0.z(context, -793099, 8);
                        AbstractC0583w0.c(-8708190, linearLayoutZ, "发送给AI的消息");
                        TextView textView3 = new TextView(context);
                        textView3.setText(strOptString7);
                        textView3.setTextSize(11.0f);
                        textView3.setTextColor(AbstractC0583w0.h);
                        textView3.setTypeface(Typeface.MONOSPACE);
                        linearLayoutZ.addView(textView3);
                        linearLayout2.addView(linearLayoutZ, AbstractC0583w0.c0(iQ));
                    }
                    String strOptString8 = jSONObject2.optString("ai_error", "");
                    LinearLayout linearLayout3 = linearLayout2;
                    try {
                        if (!strOptString8.isEmpty()) {
                            long jOptLong = jSONObject2.optLong("ai_ms", 0L);
                            String str11 = (jOptLong > 0 ? "AI调用失败 (" + jOptLong + "ms)" : "AI调用失败") + "\n" + strOptString8;
                            String strOptString9 = jSONObject2.optString("ai_raw_response", "");
                            if (!strOptString9.isEmpty()) {
                                com.github.catvod.spider.merge.p022z.P1.p((Activity) context, linearLayout3, strOptString9, iQ);
                            }
                            com.github.catvod.spider.merge.p022z.P1.l(linearLayout3, str11);
                            return;
                        }
                        String strOptString10 = jSONObject2.optString("ai_raw_response", "");
                        if (!strOptString10.isEmpty()) {
                            com.github.catvod.spider.merge.p022z.P1.p((Activity) context, linearLayout3, strOptString10, iQ);
                        }
                        JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("ai_prejudge");
                        if (jSONObjectOptJSONObject3 == null) {
                            com.github.catvod.spider.merge.p022z.P1.l(linearLayout3, "未返回匹配结果");
                            return;
                        }
                        long jOptLong2 = jSONObject2.optLong("ai_ms", 0L);
                        LinearLayout linearLayoutZ2 = AbstractC0583w0.z(context, -1509911, 8);
                        int i7 = AbstractC0583w0.d;
                        AbstractC0583w0.c(i7, linearLayoutZ2, "匹配结果 (" + jOptLong2 + "ms)");
                        String strOptString11 = jSONObjectOptJSONObject3.optString("name", "?");
                        int i8 = AbstractC0583w0.g;
                        AbstractC0583w0.j(linearLayoutZ2, "标准化剧名", strOptString11, i8);
                        int iOptInt2 = jSONObjectOptJSONObject3.optInt("episode", 0);
                        AbstractC0583w0.j(linearLayoutZ2, "推荐集数", iOptInt2 > 0 ? "第" + iOptInt2 + "集" : "未知", i8);
                        double dOptDouble = jSONObjectOptJSONObject3.optDouble("confidence", 0.0d);
                        int i9 = (int) (100.0d * dOptDouble);
                        if (dOptDouble < 0.85d) {
                            i7 = dOptDouble >= 0.6d ? AbstractC0583w0.f : AbstractC0583w0.e;
                        }
                        AbstractC0583w0.j(linearLayoutZ2, "置信度", i9 + "%", i7);
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("platforms");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            linearLayoutZ2.addView(AbstractC0583w0.C(context));
                            TextView textView4 = new TextView(context);
                            textView4.setText("推荐平台");
                            textView4.setTextSize(12.0f);
                            textView4.setTextColor(AbstractC0583w0.h);
                            textView4.setPadding(0, AbstractC0583w0.Q(4, context), 0, AbstractC0583w0.Q(4, context));
                            linearLayoutZ2.addView(textView4);
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            linearLayout4.setOrientation(0);
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                TextView textViewA = AbstractC0583w0.A((Activity) context, jSONArrayOptJSONArray.getString(i10), AbstractC0583w0.a(i10));
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                                if (i10 > 0) {
                                    layoutParams.leftMargin = AbstractC0583w0.Q(6, context);
                                }
                                linearLayout4.addView(textViewA, layoutParams);
                            }
                            linearLayoutZ2.addView(linearLayout4);
                        }
                        linearLayout3.addView(linearLayoutZ2, AbstractC0583w0.c0(iQ));
                        return;
                    } catch (Exception e5) {
                        e = e5;
                        linearLayout = linearLayout3;
                        com.github.catvod.spider.merge.p022z.P1.l(linearLayout, "解析失败: " + e.getMessage() + "\n原始: " + str);
                        return;
                    }
                } catch (Exception e6) {
                    e = e6;
                    linearLayout = linearLayout2;
                    str = str10;
                }
                break;
            case 8:
                String str12 = (String) this.b;
                String str13 = (String) this.d;
                Runnable runnable2 = (Runnable) this.c;
                Runnable runnable3 = (Runnable) this.e;
                try {
                    Activity activity3 = InitOrigin.getActivity();
                    if (activity3 == null || activity3.isFinishing()) {
                        return;
                    }
                    try {
                        LinearLayout linearLayoutH = com.github.catvod.spider.merge.p022z.P1.H(activity3);
                        int i11 = AbstractC0583w0.c;
                        linearLayoutH.addView(AbstractC0583w0.q(activity3, "文件管理", str12, i11), AbstractC0583w0.c0(AbstractC0583w0.Q(16, activity3)));
                        LinearLayout linearLayoutG = com.github.catvod.spider.merge.p022z.P1.G(activity3);
                        if (TextUtils.isEmpty(str13)) {
                            str13 = "网盘文件";
                        }
                        AbstractC0583w0.k(linearLayoutG, "来源", str13, i11);
                        AbstractC0583w0.k(linearLayoutG, "类型", com.github.catvod.spider.merge.p022z.P1.j0(str12), AbstractC0583w0.d);
                        AbstractC0583w0.d(linearLayoutG, "删除文件", "从网盘中移除", AbstractC0583w0.e, true).setOnClickListener(new com.github.catvod.spider.merge.p022z.A0(alertDialogArr, (com.github.catvod.spider.merge.p021y.a) runnable2, 0));
                        linearLayoutH.addView(linearLayoutG);
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity3).setView(AbstractC0583w0.p0(linearLayoutH)).setPositiveButton("下载", new com.github.catvod.spider.merge.p022z.E((com.github.catvod.spider.merge.p021y.a) runnable3, 2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                        AlertDialog[] alertDialogArr2 = {alertDialogCreate};
                        AbstractC0583w0.j0(alertDialogCreate);
                        return;
                    } catch (Exception e7) {
                        com.github.catvod.spider.merge.D.b.D(e7, new StringBuilder("[DownloadDialog] showFileOptions error: "));
                        return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            case 9:
                a();
                return;
            case 10:
                b();
                return;
            case 11:
                LinearLayout linearLayout5 = (LinearLayout) this.d;
                linearLayout5.removeAllViews();
                int i12 = 0;
                while (true) {
                    String[][] strArr3 = (String[][]) this.b;
                    int length = strArr3.length;
                    boolean[] zArr2 = (boolean[]) this.e;
                    if (i12 >= length) {
                        for (boolean z : zArr2) {
                            if (!z) {
                                str2 = "全  选";
                                ((TextView) this.c).setText(str2);
                                return;
                            }
                        }
                        str2 = "全不选";
                        ((TextView) this.c).setText(str2);
                        return;
                    }
                    String str14 = strArr3[i12][1];
                    int[] iArr = com.github.catvod.spider.merge.p022z.W1.a;
                    AbstractC0583w0.m(linearLayout5, str14, null, iArr[i12 % iArr.length], zArr2[i12], i12, i12 > 0, null, zArr2, null);
                    i12++;
                }
                break;
            case 12:
                c();
                return;
            case 13:
                d();
                return;
            case 14:
                e();
                return;
            case 15:
                f();
                return;
            case 16:
                g();
                return;
            case 17:
                h();
                return;
            case 18:
                EditText editText2 = (EditText) this.d;
                if (editText2 == null) {
                    return;
                }
                String str15 = (String) this.b;
                if (str15 == null || str15.equals((String) this.c)) {
                    editText2.setText((String) this.e);
                    return;
                }
                return;
            case 19:
                i();
                return;
            case 20:
                j();
                return;
            default:
                String str16 = (String) this.d;
                ?? r15 = (String[]) this.c;
                InitOrigin.run(new RunnableC0466s((String) this.b, (Serializable) new ArrayList(U0.f(str16, r15)), (Serializable) r15, this.e, (Object) str16, 10));
                return;
        }
    }

    public /* synthetic */ RunnableC0240a0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    public /* synthetic */ RunnableC0240a0(Object obj, Object obj2, String str, Object obj3, int i) {
        this.a = i;
        this.d = obj;
        this.c = obj2;
        this.b = str;
        this.e = obj3;
    }

    public /* synthetic */ RunnableC0240a0(Object obj, String[][] strArr, boolean[] zArr, Object obj2, int i) {
        this.a = i;
        this.d = obj;
        this.b = strArr;
        this.e = zArr;
        this.c = obj2;
    }

    public /* synthetic */ RunnableC0240a0(String str, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = str;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ RunnableC0240a0(CountDownLatch countDownLatch, C0568t0[] c0568t0Arr, String str, ArrayList arrayList) {
        this.a = 1;
        this.d = countDownLatch;
        this.e = c0568t0Arr;
        this.b = str;
        this.c = arrayList;
    }
}
