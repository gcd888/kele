package com.github.catvod.spider.merge.p019w;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.H0;
import com.github.catvod.spider.merge.A.J0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
import com.github.catvod.spider.merge.p000a.RunnableC0346c0;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0471x;
import com.github.catvod.spider.merge.p017u.DialogInterfaceOnDismissListenerC0472y;
import com.github.catvod.spider.merge.p017u.ViewOnClickListenerC0470w;
import com.github.catvod.spider.merge.p017u.W;
import com.github.catvod.spider.merge.p017u.z;
import com.github.catvod.spider.merge.p021y.b;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0542n3;
import com.github.catvod.spider.merge.p022z.C0568t0;
import com.github.catvod.spider.merge.p022z.D1;
import com.github.catvod.spider.merge.p022z.O;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.T;
import com.github.catvod.spider.merge.p022z.Z;
import com.github.catvod.spider.merge.p022z.e4;
import com.github.catvod.spider.merge.p022z.h4;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:214:0x0596  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 int, still in use, count: 4, list:
  (r4v2 int) from 0x0413: IF  (r4v2 int) != (54 int)  -> B:112:0x0415 A[HIDDEN] (LINE:1044)
  (r4v2 int) from 0x0417: IF  (r4v2 int) != (56 int)  -> B:114:0x0419 A[HIDDEN] (LINE:1048)
  (r4v2 int) from 0x041b: IF  (r4v2 int) != (57 int)  -> B:116:0x041d A[HIDDEN] (LINE:1052)
  (r4v2 int) from 0x0420: SWITCH (r4v2 int)
 case 1567: goto B:131:0x0452
 case 1568: goto B:128:0x0447
 case 1569: goto B:125:0x043c
 case 1570: goto B:122:0x0430
 case 1571: goto B:119:0x0425
 default: goto B:118:0x0423 A[Catch: Exception -> 0x04ff, RegionRef:SW:117] (LINE:1057)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        String strConcat = "";
        int i = 4;
        switch (this.a) {
            case 0:
                try {
                    switch (this.b) {
                        case "quark":
                            c.a = c.v();
                            return;
                        case "uc":
                            c.b = c.x();
                            return;
                        case "tianyi":
                            c.c = c.w();
                            return;
                        case "yidong":
                            c.d = c.A();
                            return;
                        case "ali":
                            c.e = c.o();
                            return;
                        case "baidu":
                            c.f = c.p();
                            return;
                        case "xunlei":
                            c.g = c.z();
                            return;
                        case "115":
                            c.h = c.t();
                            return;
                        case "pan123":
                            c.i = c.u();
                            return;
                        case "guangya":
                            c.j = c.s();
                            return;
                        case "bili":
                            c.k = c.q();
                            return;
                        case "uc_token":
                            c.l = c.y();
                            return;
                        case "go":
                            c.m = c.r();
                            return;
                        default:
                            return;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 1:
                String str = this.b;
                try {
                    if (iHashCode != 54) {
                        if (iHashCode != 56) {
                            if (iHashCode != 57) {
                                switch (str) {
                                    case "1":
                                        b = 0;
                                        break;
                                    case "2":
                                        b = 1;
                                        break;
                                    case "3":
                                        b = 2;
                                        break;
                                    case "4":
                                        b = 4;
                                        break;
                                    default:
                                        switch (iHashCode) {
                                            case 1567:
                                                if (!str.equals("10")) {
                                                    b = -1;
                                                } else {
                                                    b = 11;
                                                }
                                                break;
                                            case 1568:
                                                if (!str.equals("11")) {
                                                    b = -1;
                                                } else {
                                                    b = 8;
                                                }
                                                break;
                                            case 1569:
                                                if (!str.equals("12")) {
                                                    b = -1;
                                                } else {
                                                    b = 9;
                                                }
                                                break;
                                            case 1570:
                                                if (!str.equals("13")) {
                                                    b = -1;
                                                } else {
                                                    b = 10;
                                                }
                                                break;
                                            case 1571:
                                                if (!str.equals("14")) {
                                                    b = -1;
                                                } else {
                                                    b = 3;
                                                }
                                                break;
                                            default:
                                                b = -1;
                                                break;
                                        }
                                }
                            } else if (str.equals("9")) {
                                b = 7;
                            } else {
                                b = -1;
                            }
                        } else if (str.equals("8")) {
                            b = 6;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals("6")) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                    switch (b) {
                        case 0:
                            c.a = c.v();
                            return;
                        case 1:
                            c.b = c.x();
                            c.l = c.y();
                            return;
                        case 2:
                            c.c = c.w();
                            return;
                        case 3:
                            c.d = c.A();
                            return;
                        case 4:
                            c.e = c.o();
                            return;
                        case 5:
                            c.f = c.p();
                            return;
                        case 6:
                            c.g = c.z();
                            return;
                        case 7:
                            c.h = c.t();
                            return;
                        case 8:
                            c.i = c.u();
                            return;
                        case 9:
                            c.j = c.s();
                            return;
                        case 10:
                            c.k = c.q();
                            return;
                        case 11:
                            c.D(null);
                            return;
                        default:
                            return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            case 2:
                b.y(this.b);
                return;
            case 3:
                StringBuilder sb = new StringBuilder("解析失败");
                String str2 = this.b;
                if (str2 != null && !str2.isEmpty()) {
                    strConcat = "：".concat(str2);
                }
                sb.append(strConcat);
                X0.a(sb.toString());
                return;
            case 4:
                String str3 = this.b;
                try {
                    final Activity activity = InitOrigin.getActivity();
                    final int iQ = AbstractC0583w0.Q(8, activity);
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                    int i2 = AbstractC0583w0.c;
                    linearLayoutK.addView(AbstractC0583w0.q(activity, "AI匹配测试", "测试AI对候选弹幕的辅助匹配能力", i2), AbstractC0583w0.c0(iQ));
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                    int i3 = AbstractC0583w0.g;
                    AbstractC0583w0.c(i3, linearLayoutY, "剧名");
                    final EditText editTextF = AbstractC0583w0.f(linearLayoutY, "如: 凡人修仙传", "凡人修仙传", false);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(0);
                    LinearLayout linearLayout2 = new LinearLayout(activity);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    AbstractC0583w0.c(i3, linearLayout2, "集数");
                    final EditText editTextF2 = AbstractC0583w0.f(linearLayout2, "如: 179", "179", false);
                    editTextF2.setInputType(2);
                    LinearLayout linearLayout3 = new LinearLayout(activity);
                    linearLayout3.setOrientation(1);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    layoutParams.leftMargin = iQ;
                    linearLayout3.setLayoutParams(layoutParams);
                    AbstractC0583w0.c(i3, linearLayout3, "总集数 (可选)");
                    final EditText editTextF3 = AbstractC0583w0.f(linearLayout3, "留空", "", false);
                    editTextF3.setInputType(2);
                    linearLayout.addView(linearLayout2);
                    linearLayout.addView(linearLayout3);
                    linearLayoutY.addView(linearLayout);
                    View viewF = AbstractC0583w0.F(activity, "扫码输入", i2, -1);
                    viewF.setOnClickListener(new Z(str3, 0));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.topMargin = iQ;
                    linearLayoutY.addView(viewF, layoutParams2);
                    linearLayoutK.addView(linearLayoutY, AbstractC0583w0.c0(iQ));
                    final LinearLayout linearLayout4 = new LinearLayout(activity);
                    linearLayout4.setOrientation(1);
                    linearLayoutK.addView(linearLayout4);
                    P1.w(str3, new String[]{"name", "episode", "total"}, new EditText[]{editTextF, editTextF2, editTextF3}, null);
                    final AlertDialog alertDialogCreate = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("开始测试", (DialogInterface.OnClickListener) null).setNegativeButton("关闭", new D1(str3, 2)).setOnCancelListener(new O(str3, 2)).create();
                    AbstractC0583w0.j0(alertDialogCreate);
                    T t = new T(alertDialogCreate, 0);
                    if (!TextUtils.isEmpty(str3)) {
                        H0 h0 = H0.a;
                        C0542n3 c0542n3 = new C0542n3(t, 1);
                        h0.getClass();
                        if (str3 != null) {
                            H0.d.put(str3, c0542n3);
                        }
                    }
                    alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.U
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String strE = AbstractC0449a.e(editTextF);
                            if (strE.isEmpty()) {
                                X0.a("请输入剧名");
                                return;
                            }
                            String strE2 = AbstractC0449a.e(editTextF2);
                            String strE3 = AbstractC0449a.e(editTextF3);
                            LinearLayout linearLayout5 = linearLayout4;
                            linearLayout5.removeAllViews();
                            Context context = activity;
                            TextView textView = new TextView(context);
                            textView.setText("AI匹配测试中，请稍候...");
                            textView.setTextSize(13.0f);
                            textView.setTextColor(AbstractC0583w0.h);
                            int iQ2 = AbstractC0583w0.Q(12, context);
                            int iQ3 = AbstractC0583w0.Q(12, context);
                            int i4 = iQ;
                            textView.setPadding(iQ2, i4, iQ3, i4);
                            linearLayout5.addView(textView);
                            InitOrigin.execute(new J0(strE, strE2, strE3, alertDialogCreate, linearLayout5, (Activity) context));
                        }
                    });
                    return;
                } catch (Exception e) {
                    com.github.catvod.spider.merge.D.b.x(e, new StringBuilder("操作失败: "));
                    return;
                }
            case 5:
                String str4 = this.b;
                if (str4 != null) {
                    try {
                        P1.H1(str4);
                        return;
                    } catch (Exception unused3) {
                        return;
                    }
                }
                return;
            case 6:
                X0.a(this.b);
                return;
            case 7:
                P1.V("未找到帮助内容: " + this.b);
                return;
            case 8:
                P1.H1(this.b);
                return;
            case 9:
                X0.a(this.b + "账号已清除");
                return;
            case 10:
                String str5 = this.b;
                try {
                    Activity activityD0 = P1.D0();
                    if (activityD0 == null) {
                        return;
                    }
                    int iQ2 = AbstractC0583w0.Q(8, activityD0);
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activityD0);
                    LinearLayout linearLayoutO = AbstractC0583w0.O(activityD0, AbstractC0302v0.Y0("tianyi"), "密码登录触发了图形验证码，该验证码类型暂不支持。\n推荐使用短信验证码登录。", "需要验证码", -29696);
                    linearLayoutO.setLayoutParams(AbstractC0583w0.c0(iQ2));
                    linearLayoutK2.addView(linearLayoutO);
                    AlertDialog alertDialogCreate2 = new AlertDialog.Builder(activityD0).setView(AbstractC0583w0.q0(linearLayoutK2)).setPositiveButton("短信登录", new D1(str5, 1)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                    alertDialogCreate2.show();
                    AbstractC0583w0.l0(alertDialogCreate2, 0.0f);
                    return;
                } catch (Exception e2) {
                    com.github.catvod.spider.merge.D.b.x(e2, new StringBuilder("显示失败: "));
                    return;
                }
            case 11:
                P1.A0(this.b);
                return;
            case 12:
                if (this.b.equals(P1.u)) {
                    P1.R();
                    P1.u = null;
                    return;
                }
                return;
            case 13:
                P1.A0(this.b);
                return;
            case 14:
                X0.a(this.b);
                return;
            case 15:
                String str6 = this.b;
                P1.g = str6 != null ? str6 : "";
                P1.e = 5;
                P1.f = "等待AI任务 0/3";
                C0568t0 c0568t0 = P1.b;
                if (c0568t0 != null) {
                    c0568t0.c(5, "等待AI任务 0/3");
                    return;
                }
                return;
            case 16:
                P1.J0("智能海报墙", "扫码在手机上输入 TMDB 接口配置", this.b, "token,TMDB Token,eyJ...|base,API BaseURL,https://api.tmdb.org/3|image,图片BaseURL,https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500", -16732991);
                return;
            case 17:
                String str7 = this.b;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        int iQ3 = AbstractC0583w0.Q(8, activity2);
                        LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity2);
                        linearLayoutK3.addView(AbstractC0583w0.q(activity2, "添加追更", "搜索后通过海报和资料确认剧集", -16732991), AbstractC0583w0.c0(iQ3));
                        LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity2);
                        AbstractC0583w0.c(AbstractC0583w0.g, linearLayoutY2, "搜索剧集");
                        EditText editTextM = AbstractC0583w0.M(activity2, "输入剧名");
                        linearLayoutY2.addView(editTextM);
                        TextView textViewF = AbstractC0583w0.F(activity2, "搜索剧集", AbstractC0583w0.d, -1);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams3.topMargin = iQ3;
                        linearLayoutY2.addView(textViewF, layoutParams3);
                        AbstractC0583w0.l(linearLayoutY2, "从 TMDB 结果中选择正确剧集");
                        linearLayoutK3.addView(linearLayoutY2);
                        W w = new W(new AlertDialog[]{alertDialogCreate}, editTextM, textViewF, 16);
                        textViewF.setOnClickListener(new ViewOnClickListenerC0470w(w, 9));
                        editTextM.setImeOptions(3);
                        editTextM.setOnEditorActionListener(new C0471x(w, 1));
                        P1.w(str7, new String[]{"query"}, new EditText[]{editTextM}, w);
                        AlertDialog alertDialogCreate3 = new AlertDialog.Builder(activity2).setView(AbstractC0583w0.q0(linearLayoutK3)).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterfaceOnDismissListenerC0472y(str7, 5)).create();
                        P1.y1(alertDialogCreate3, new a(str7, 19));
                        textViewF.post(new z(textViewF, 0));
                    }
                    return;
                } catch (Exception e3) {
                    P1.H1(str7);
                    com.github.catvod.spider.merge.D.b.x(e3, new StringBuilder("打开添加追更失败: "));
                    return;
                }
            case 18:
                P1.J0("TMDB Token", "扫码在手机上输入 Token", this.b, "token,TMDB Token,eyJ...", -16732991);
                return;
            case 19:
                P1.r1(-16732991, "添加追更", this.b, "query", "剧名", "输入要追更的剧名");
                return;
            case 20:
                X0.a(this.b);
                FishConfig.refreshStatus("go");
                return;
            default:
                String str8 = this.b;
                Handler handler = h4.a;
                try {
                    byte[] bArrF = h4.f(str8);
                    if (bArrF != null && bArrF.length != 0) {
                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                        if (!externalStoragePublicDirectory.exists()) {
                            externalStoragePublicDirectory.mkdirs();
                        }
                        File file = new File(externalStoragePublicDirectory, "wallpaper_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + ".jpg");
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            fileOutputStream.write(bArrF);
                            fileOutputStream.close();
                            handler.post(new RunnableC0341a(17, file));
                            return;
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    handler.post(new e4(i));
                    return;
                } catch (Exception e4) {
                    SpiderDebug.log("[WallpaperDialog] downloadToGallery error: " + e4.getMessage());
                    handler.post(new RunnableC0346c0(e4, 5));
                    return;
                }
        }
    }
}
