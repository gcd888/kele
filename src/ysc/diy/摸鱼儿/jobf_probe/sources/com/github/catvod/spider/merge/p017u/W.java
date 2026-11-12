package com.github.catvod.spider.merge.p017u;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.WoNiu;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.O1;
import com.github.catvod.spider.merge.A.P0;
import com.github.catvod.spider.merge.A.RunnableC0240a0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.A.Z1;
import com.github.catvod.spider.merge.A.a2;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
import com.github.catvod.spider.merge.p020x.g;
import com.github.catvod.spider.merge.p022z.A;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0538n;
import com.github.catvod.spider.merge.p022z.D1;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0503g;
import com.github.catvod.spider.merge.p022z.E0;
import com.github.catvod.spider.merge.p022z.G0;
import com.github.catvod.spider.merge.p022z.H0;
import com.github.catvod.spider.merge.p022z.J1;
import com.github.catvod.spider.merge.p022z.K;
import com.github.catvod.spider.merge.p022z.K1;
import com.github.catvod.spider.merge.p022z.M;
import com.github.catvod.spider.merge.p022z.O;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.Q3;
import com.github.catvod.spider.merge.p022z.R3;
import com.github.catvod.spider.merge.p022z.RunnableC0473a;
import com.github.catvod.spider.merge.p022z.RunnableC0579v1;
import com.github.catvod.spider.merge.p022z.RunnableC0591x3;
import com.github.catvod.spider.merge.p022z.RunnableC0597z;
import com.github.catvod.spider.merge.p022z.V2;
import com.github.catvod.spider.merge.p022z.Z;
import com.github.catvod.spider.merge.p022z.h4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class W implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ W(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        String string = ((EditText) this.b).getHint().toString();
        String str = (String) this.c;
        P1.r1(-16732991, str, (String) this.d, "address", str, string);
    }

    private final void b() {
        AlertDialog alertDialog = ((AlertDialog[]) this.b)[0];
        EditText editText = (EditText) this.c;
        String strE = AbstractC0449a.e(editText);
        if (strE.isEmpty()) {
            X0.a("请先输入剧名");
            editText.requestFocus();
            return;
        }
        TextView textView = (TextView) this.d;
        if (textView.isEnabled()) {
            textView.setEnabled(false);
            textView.setAlpha(0.6f);
            textView.setText("正在搜索...");
            InitOrigin.execute(new RunnableC0240a0(strE, (Object) alertDialog, (Object) textView, (Object) editText, 20));
        }
    }

    private final void c() throws Throwable {
        boolean zW0;
        Q3 q3 = (Q3) this.b;
        AlertDialog alertDialog = (AlertDialog) this.c;
        R3 r3 = (R3) this.d;
        if (q3.b) {
            return;
        }
        try {
            C0299u0 c0299u0X = C0299u0.x();
            c0299u0X.getClass();
            zW0 = c0299u0X.w0(C0299u0.B0());
        } catch (Exception unused) {
            zW0 = false;
        }
        InitOrigin.run(new RunnableC0591x3(q3, alertDialog, r3, zW0));
    }

    private final void d() {
        h4.l((ImageView) this.b, (LinearLayout) this.c, (LinearLayout) this.d);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.a) {
            case 0:
                Pattern pattern = WoNiu.v;
                ((WoNiu) this.b).s((String) this.c, (String) this.d, true);
                break;
            case 1:
                C0538n c0538n = (C0538n) this.b;
                c0538n.getClass();
                InitOrigin.run(new E0("解析分享链接", "粘贴直播链接或完整分享文案", "分享链接", "粘贴直播分享链接或完整分享文案", "支持虎牙、斗鱼、抖音、快手和哔哩哔哩", String.valueOf(System.currentTimeMillis()), new g(c0538n, (i) this.c, (RunnableC0341a) ((Runnable) this.d)), "link", "解析", AbstractC0583w0.c));
                break;
            case 2:
                if (((AlertDialog) this.b).isShowing()) {
                    LinearLayout linearLayout = (LinearLayout) this.c;
                    linearLayout.removeAllViews();
                    P1.l(linearLayout, "测试失败: " + ((Exception) this.d).getMessage());
                }
                break;
            case 3:
                ImageView imageView = (ImageView) this.b;
                if (((String) this.c).equals(imageView.getTag())) {
                    imageView.setImageBitmap((Bitmap) this.d);
                }
                break;
            case 4:
                Dialog dialog = (Dialog) this.b;
                H0 h0 = (H0) this.c;
                Exception exc = (Exception) this.d;
                dialog.dismiss();
                X0.a(h0.b ? "已取消下载" : "下载失败: " + exc.getMessage());
                break;
            case 5:
                final String str = (String) this.c;
                final String str2 = (String) this.d;
                final Map map = (Map) this.b;
                try {
                    final Activity activity = InitOrigin.getActivity();
                    if (activity == null || activity.isFinishing()) {
                        X0.a("无法创建下载弹窗");
                    } else {
                        try {
                            final H0 h1 = new H0();
                            final AlertDialog alertDialogJ = P1.J(activity, str);
                            AbstractC0583w0.j0(alertDialogJ);
                            final ProgressBar progressBar = (ProgressBar) alertDialogJ.findViewById(R.id.progress);
                            final TextView textView = (TextView) alertDialogJ.findViewById(R.id.text1);
                            final TextView textView2 = (TextView) alertDialogJ.findViewById(R.id.text2);
                            Button button = alertDialogJ.getButton(-1);
                            Button button2 = alertDialogJ.getButton(-2);
                            if (button != null) {
                                button.setOnClickListener(new K(h1, button, textView2, 1));
                            }
                            if (button2 != null) {
                                button2.setOnClickListener(new M(h1, button, button2, textView2, 2));
                            }
                            InitOrigin.execute(new Runnable() { // from class: com.github.catvod.spider.merge.z.x0
                                /*  JADX ERROR: Type inference failed
                                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6151. Try increasing type updates limit count.
                                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                                    */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    /*
                                        Method dump skipped, instruction units count: 615
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p022z.RunnableC0588x0.run():void");
                                }
                            });
                        } catch (Exception e) {
                            SpiderDebug.log("[DownloadDialog] startDownload error: " + e.getMessage());
                            X0.a("无法创建下载弹窗");
                            return;
                        }
                    }
                } catch (Exception unused) {
                    X0.a("无法创建下载弹窗");
                    return;
                }
                break;
            case 6:
                String[] strArr = (String[]) this.b;
                String str3 = (String) this.c;
                G0 g0 = (G0) this.d;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 != null && !activity2.isFinishing()) {
                        boolean[] zArr = new boolean[strArr.length];
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity2);
                        linearLayoutK.addView(AbstractC0583w0.p(activity2, str3, "选择要删除的项目"), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity2)));
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity2);
                        LinearLayout linearLayout2 = new LinearLayout(activity2);
                        linearLayout2.setOrientation(1);
                        int i = 0;
                        while (i < strArr.length) {
                            AbstractC0583w0.m(linearLayout2, strArr[i], null, AbstractC0583w0.e, zArr[i], i, i > 0, null, zArr, null);
                            i++;
                        }
                        linearLayoutY.addView(AbstractC0583w0.J(activity2, linearLayout2, 280));
                        AbstractC0583w0.l(linearLayoutY, "删除后刷新页面生效。");
                        linearLayoutK.addView(linearLayoutY);
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("删除所选", new P0(g0, zArr, 6)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                List list = (List) this.d;
                K1 k1 = (K1) this.b;
                k1.getClass();
                try {
                    Activity activity3 = InitOrigin.getActivity();
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity3);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity3);
                    linearLayoutK2.addView(AbstractC0583w0.p(activity3, "网盘排序", "点击「上移」调整搜索结果的网盘优先顺序"), layoutParams);
                    LinearLayout linearLayout3 = new LinearLayout(activity3);
                    linearLayout3.setOrientation(1);
                    Runnable[] runnableArr = {null};
                    RunnableC0597z runnableC0597z = new RunnableC0597z(1, linearLayout3, arrayList, runnableArr);
                    runnableArr[0] = runnableC0597z;
                    runnableC0597z.run();
                    linearLayoutK2.addView(AbstractC0583w0.s(activity3, linearLayout3));
                    AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayoutK2).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0503g(k1, list, arrayList, 3)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                } catch (Exception e2) {
                    b.D(e2, new StringBuilder("[FishPsDialog] showOrderDialog: "));
                    return;
                }
                break;
            case 8:
                List list2 = (List) this.c;
                K1 k2 = (K1) this.b;
                k2.getClass();
                J1 j1 = k2.a;
                try {
                    Activity activity4 = InitOrigin.getActivity();
                    if (activity4 != null) {
                        LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity4);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.bottomMargin = AbstractC0583w0.Q(12, activity4);
                        linearLayoutK3.addView(AbstractC0583w0.p(activity4, "接口开关", "关闭后不参与搜索，至少保留一个启用接口"), layoutParams2);
                        LinearLayout linearLayout4 = new LinearLayout(activity4);
                        linearLayout4.setOrientation(1);
                        boolean zIsEmpty = list2.isEmpty();
                        boolean[] zArr2 = (boolean[]) this.d;
                        if (zIsEmpty) {
                            TextView textView3 = new TextView(activity4);
                            textView3.setText("暂无可用接口");
                            textView3.setTextSize(14.0f);
                            textView3.setTextColor(AbstractC0583w0.i);
                            textView3.setGravity(17);
                            textView3.setPadding(0, AbstractC0583w0.Q(16, activity4), 0, AbstractC0583w0.Q(16, activity4));
                            linearLayout4.addView(textView3);
                        } else {
                            int i2 = 0;
                            while (i2 < list2.size()) {
                                String str4 = (String) list2.get(i2);
                                String apiName = j1.getApiName(str4);
                                StringBuilder sb = new StringBuilder();
                                sb.append(j1.isBuiltinUrl(str4) ? "推荐" : "自定义");
                                sb.append(" · ");
                                sb.append(K1.c(str4));
                                String string = sb.toString();
                                int[] iArr = K1.f;
                                AbstractC0583w0.m(linearLayout4, apiName, string, iArr[i2 % iArr.length], zArr2[i2], i2, i2 > 0, null, zArr2, null);
                                i2++;
                            }
                        }
                        linearLayoutK3.addView(AbstractC0583w0.s(activity4, linearLayout4));
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity4).setView(linearLayoutK3).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0503g(k2, zArr2, list2, 5)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    }
                } catch (Exception e3) {
                    b.D(e3, new StringBuilder("[FishPsDialog] showApiToggleDialog: "));
                    return;
                }
                break;
            case 9:
                K1 k3 = (K1) this.b;
                J1 j2 = k3.a;
                if (j2.removeApiUrl((String) this.c)) {
                    j2.saveConfig();
                    X0.a("已删除");
                    AlertDialog alertDialog = ((AlertDialog[]) this.d)[0];
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    InitOrigin.run(new RunnableC0579v1(k3, 3));
                } else {
                    X0.a("至少保留一个启用接口");
                }
                break;
            case 10:
                String[][] strArr2 = (String[][]) this.b;
                String str5 = (String) this.c;
                E e4 = (E) this.d;
                try {
                    Activity activity5 = InitOrigin.getActivity();
                    boolean[] zArr3 = new boolean[strArr2.length];
                    int i3 = 0;
                    for (int i4 = 0; i4 < strArr2.length; i4++) {
                        boolean zContains = str5.contains(strArr2[i4][1]);
                        zArr3[i4] = zContains;
                        if (zContains) {
                            i3++;
                        }
                    }
                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity5);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.bottomMargin = AbstractC0583w0.Q(12, activity5);
                    linearLayoutK4.addView(AbstractC0583w0.p(activity5, "平台过滤", "开启 = 隐藏该平台，已隐藏 " + i3 + "/" + strArr2.length), layoutParams3);
                    int i5 = AbstractC0583w0.f;
                    TextView textViewX = AbstractC0583w0.x(activity5, "全  选", i5);
                    textViewX.setTextSize(13.0f);
                    textViewX.setPadding(AbstractC0583w0.Q(16, activity5), AbstractC0583w0.Q(8, activity5), AbstractC0583w0.Q(16, activity5), AbstractC0583w0.Q(8, activity5));
                    textViewX.setFocusable(true);
                    AbstractC0583w0.n(textViewX, i5);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams4.gravity = 8388613;
                    layoutParams4.bottomMargin = AbstractC0583w0.Q(8, activity5);
                    linearLayoutK4.addView(textViewX, layoutParams4);
                    LinearLayout linearLayout5 = new LinearLayout(activity5);
                    linearLayout5.setOrientation(1);
                    Runnable[] runnableArr2 = {new RunnableC0240a0((Object) linearLayout5, strArr2, zArr3, (Object) textViewX, 11)};
                    runnableArr2[0].run();
                    linearLayoutK4.addView(AbstractC0583w0.s(activity5, linearLayout5));
                    textViewX.setOnClickListener(new K(zArr3, strArr2, runnableArr2, 6));
                    AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayoutK4).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0503g(zArr3, (Object) strArr2, (Object) e4, 6)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                } catch (Exception e5) {
                    SpiderDebug.log("[Kan360Dialog] showPlatformFilter: " + e5.getMessage());
                    X0.a("显示失败");
                    return;
                }
                break;
            case 11:
                EditText editText = (EditText) this.b;
                String str6 = (String) this.c;
                AlertDialog[] alertDialogArr = (AlertDialog[]) this.d;
                String strE = AbstractC0449a.e(editText);
                Pattern pattern2 = a2.h;
                if (strE == null || !strE.startsWith("moyu_webdav:")) {
                    X0.a("请输入 moyu_webdav: 开头的分享配置");
                } else if (Z1.a.q(strE)) {
                    P1.H1(str6);
                    AlertDialog alertDialog2 = alertDialogArr[0];
                    if (alertDialog2 != null) {
                        alertDialog2.dismiss();
                    }
                    a2 a2Var = Z1.a;
                    a2Var.getClass();
                    O1 o1 = new O1(a2Var, 3);
                    a2Var.d.getClass();
                    InitOrigin.run(new B(o1, 10));
                } else {
                    X0.a("配置格式错误，请重新复制");
                }
                break;
            case 12:
                String[][] strArr3 = (String[][]) this.b;
                int[] iArr2 = (int[]) this.c;
                Runnable[] runnableArr3 = (Runnable[]) this.d;
                try {
                    Activity activityD0 = P1.D0();
                    if (activityD0 != null) {
                        int iQ = AbstractC0583w0.Q(8, activityD0);
                        LinearLayout linearLayoutK5 = AbstractC0583w0.K(activityD0);
                        linearLayoutK5.addView(AbstractC0583w0.p(activityD0, "登录导入", "选择账号或导入项目"), AbstractC0583w0.c0(iQ));
                        LinearLayout linearLayoutY2 = AbstractC0583w0.y(activityD0);
                        linearLayoutY2.setDescendantFocusability(262144);
                        char c = 1;
                        AlertDialog[] alertDialogArr2 = new AlertDialog[1];
                        LinearLayout linearLayout6 = new LinearLayout(activityD0);
                        linearLayout6.setOrientation(1);
                        int i6 = 0;
                        while (i6 < strArr3.length) {
                            String[] strArr4 = strArr3[i6];
                            AbstractC0583w0.d(linearLayout6, strArr4[0], strArr4[c], iArr2[i6], i6 > 0).setOnClickListener(new V2(alertDialogArr2, runnableArr3, i6, 0));
                            i6++;
                            c = 1;
                        }
                        ScrollView scrollView = new ScrollView(activityD0);
                        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        scrollView.setFillViewport(true);
                        scrollView.setFocusable(false);
                        scrollView.setFocusableInTouchMode(false);
                        scrollView.setDescendantFocusability(262144);
                        scrollView.addView(linearLayout6);
                        AbstractC0583w0.o(scrollView, linearLayout6);
                        linearLayoutY2.addView(scrollView);
                        scrollView.post(new A(scrollView, AbstractC0583w0.Q(280, activityD0), 3));
                        linearLayoutK5.addView(linearLayoutY2);
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(activityD0).setView(linearLayoutK5).setNeutralButton("清除配置", new DialogInterfaceOnClickListenerC0454f(2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                        alertDialogArr2[0] = alertDialogCreate;
                        AbstractC0583w0.j0(alertDialogCreate);
                    }
                } catch (Exception e6) {
                    b.x(e6, new StringBuilder("显示失败: "));
                    return;
                }
                break;
            case 13:
                P1.Y0((String) this.c, (Bitmap) this.b, (Runnable) this.d, null);
                break;
            case 14:
                if (P1.n0((Callable) this.b)) {
                    Runnable runnable = (Runnable) this.d;
                    if (runnable != null) {
                        runnable.run();
                    }
                    X0.a((String) this.c);
                    break;
                }
                break;
            case 15:
                a();
                break;
            case 16:
                b();
                break;
            case 17:
                c();
                break;
            case 18:
                d();
                break;
            default:
                String str7 = (String) this.c;
                Runnable runnable2 = (Runnable) this.d;
                X1 x1 = (X1) this.b;
                X1 x2 = (X1) x1.b;
                try {
                    Activity activity6 = InitOrigin.getActivity();
                    if (activity6 == null) {
                        X0.a("无法获取Activity");
                    } else {
                        int iQ2 = AbstractC0583w0.Q(8, activity6);
                        LinearLayout linearLayoutK6 = AbstractC0583w0.K(activity6);
                        int i7 = AbstractC0583w0.c;
                        LinearLayout linearLayoutO = AbstractC0583w0.O(activity6, "WebDAV连接", "配置WebDAV服务器连接", "设置", i7);
                        linearLayoutO.setLayoutParams(AbstractC0583w0.c0(iQ2));
                        linearLayoutK6.addView(linearLayoutO);
                        LinearLayout linearLayoutY3 = AbstractC0583w0.y(activity6);
                        AbstractC0583w0.g(linearLayoutY3, "服务器地址");
                        ((a2) x2.b).getClass();
                        EditText editTextE = AbstractC0583w0.e(linearLayoutY3, "https://dav.jianguoyun.com/dav/", a2.o(), false);
                        AbstractC0583w0.g(linearLayoutY3, "用户名");
                        String[] strArrS = a2.s();
                        EditText editTextE2 = AbstractC0583w0.e(linearLayoutY3, "your@email.com", strArrS != null ? strArrS[1] : null, false);
                        AbstractC0583w0.g(linearLayoutY3, "密码(坚果云需用应用密码)");
                        String[] strArrS2 = a2.s();
                        EditText editTextE3 = AbstractC0583w0.e(linearLayoutY3, "应用密码", strArrS2 != null ? strArrS2[2] : null, false);
                        editTextE3.setInputType(129);
                        linearLayoutK6.addView(linearLayoutY3);
                        TextView textViewX2 = AbstractC0583w0.x(activity6, "扫码填入", i7);
                        textViewX2.setGravity(17);
                        textViewX2.setFocusable(true);
                        AbstractC0583w0.n(textViewX2, i7);
                        textViewX2.setOnClickListener(new Z(str7, 5));
                        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams5.topMargin = iQ2;
                        linearLayoutK6.addView(textViewX2, layoutParams5);
                        RunnableC0473a runnableC0473a = new RunnableC0473a(x1, alertDialogArr, editTextE, editTextE2, editTextE3, str7, runnable2);
                        P1.w(str7, new String[]{"url", "user", "pass"}, new EditText[]{editTextE, editTextE2, editTextE3}, runnableC0473a);
                        AlertDialog alertDialogCreate2 = new AlertDialog.Builder(activity6).setView(AbstractC0583w0.q0(linearLayoutK6)).setPositiveButton("保存", (DialogInterface.OnClickListener) null).setNegativeButton("取消", new D1(str7, 2)).setOnCancelListener(new O(str7, 2)).create();
                        AlertDialog[] alertDialogArr3 = {alertDialogCreate2};
                        AbstractC0583w0.j0(alertDialogCreate2);
                        alertDialogArr3[0].getButton(-1).setOnClickListener(new ViewOnClickListenerC0470w(runnableC0473a, 12));
                    }
                } catch (Exception e7) {
                    b.x(e7, new StringBuilder("显示失败: "));
                }
                break;
        }
    }

    public /* synthetic */ W(Runnable runnable, String str, Callable callable) {
        this.a = 14;
        this.b = callable;
        this.d = runnable;
        this.c = str;
    }

    public /* synthetic */ W(String str, ImageView imageView, Bitmap bitmap) {
        this.a = 3;
        this.c = str;
        this.b = imageView;
        this.d = bitmap;
    }

    public /* synthetic */ W(String str, String str2, Bitmap bitmap, int i, Runnable runnable) {
        this.a = 13;
        this.c = str2;
        this.b = bitmap;
        this.d = runnable;
    }

    public /* synthetic */ W(String str, String str2, Object obj, int i) {
        this.a = i;
        this.c = str;
        this.d = str2;
        this.b = obj;
    }
}
