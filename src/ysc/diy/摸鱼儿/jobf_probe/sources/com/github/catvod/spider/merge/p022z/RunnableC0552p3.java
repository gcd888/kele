package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.B;
import com.github.catvod.spider.merge.A.F0;
import com.github.catvod.spider.merge.A.H0;
import com.github.catvod.spider.merge.A.X0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0552p3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0586w3 b;

    public /* synthetic */ RunnableC0552p3(C0586w3 c0586w3, int i) {
        this.a = i;
        this.b = c0586w3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                final C0586w3 c0586w3 = this.b;
                RunnableC0552p3 runnableC0552p3 = c0586w3.j;
                String str = c0586w3.b;
                JSONObject jSONObject = c0586w3.a;
                if (c0586w3.d.get()) {
                    return;
                }
                try {
                    Activity activity = InitOrigin.getActivity();
                    c0586w3.g = activity;
                    if (!AbstractC0583w0.X(activity)) {
                        runnableC0552p3.run();
                        return;
                    }
                    String strV0 = P1.v0(str, jSONObject);
                    H0 h0 = H0.a;
                    F0 f0 = new F0() { // from class: com.github.catvod.spider.merge.z.t3
                        @Override // com.github.catvod.spider.merge.A.F0
                        public final void a(String str2, String str3) throws Throwable {
                            C0586w3 c0586w4 = c0586w3;
                            c0586w4.getClass();
                            if (!"slider_result".equals(str2) || c0586w4.d.get()) {
                                return;
                            }
                            try {
                                c0586w4.a(P1.I1(str3, c0586w4.a));
                            } catch (Exception unused) {
                                X0.a("验证回传无效，请重新操作或刷新");
                            }
                        }
                    };
                    h0.getClass();
                    H0.f(str, f0);
                    if (str == null || strV0 == null || strV0.length() > 3145728 || !H0.b.containsKey(str)) {
                        throw new IllegalArgumentException("slider session invalid");
                    }
                    H0.f.put(str, strV0);
                    LinearLayout linearLayoutK = AbstractC0583w0.K(c0586w3.g);
                    String str2 = "search".equals(jSONObject.optString("scope")) ? "番薯搜索验证" : "番薯播放验证";
                    linearLayoutK.addView(AbstractC0583w0.p(c0586w3.g, str2, "移动拼图对齐缺口，或扫码在手机上完成"), AbstractC0583w0.c0(AbstractC0583w0.Q(8, c0586w3.g)));
                    C0566s3 c0566s3 = new C0566s3(c0586w3.g, jSONObject, new RunnableC0552p3(c0586w3, 2));
                    c0586w3.i = c0566s3;
                    linearLayoutK.addView(c0566s3);
                    TextView textViewF = AbstractC0583w0.F(c0586w3.g, "换一张", AbstractC0583w0.i, -1);
                    final int i = 0;
                    textViewF.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.u3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) throws Throwable {
                            switch (i) {
                                case 0:
                                    C0586w3 c0586w4 = c0586w3;
                                    c0586w4.getClass();
                                    c0586w4.a(new Y3(2, ""));
                                    break;
                                default:
                                    C0586w3 c0586w5 = c0586w3;
                                    c0586w5.getClass();
                                    try {
                                        String string = c0586w5.i.a().toString();
                                        if (!c0586w5.d.get()) {
                                            try {
                                                c0586w5.a(P1.I1(string, c0586w5.a));
                                            } catch (Exception unused) {
                                                X0.a("验证回传无效，请重新操作或刷新");
                                            }
                                        }
                                    } catch (Exception unused2) {
                                        X0.a("请先移动滑块，对齐后再确认");
                                        return;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayoutK.addView(textViewF, AbstractC0583w0.c0(AbstractC0583w0.Q(4, c0586w3.g)));
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(c0586w3.g).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("确认", (DialogInterface.OnClickListener) null).setNeutralButton("扫码验证", (DialogInterface.OnClickListener) null).setNegativeButton("取消", new DialogInterfaceOnClickListenerC0518j(3, c0586w3)).create();
                    c0586w3.h = alertDialogCreate;
                    alertDialogCreate.setCanceledOnTouchOutside(false);
                    c0586w3.h.setOnCancelListener(new DialogInterfaceOnCancelListenerC0581v3(0, c0586w3));
                    c0586w3.h.setOnDismissListener(new Y1(3, c0586w3));
                    AbstractC0583w0.j0(c0586w3.h);
                    c0586w3.h.getButton(-1).setEnabled(false);
                    final int i2 = 1;
                    c0586w3.h.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.u3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) throws Throwable {
                            switch (i2) {
                                case 0:
                                    C0586w3 c0586w4 = c0586w3;
                                    c0586w4.getClass();
                                    c0586w4.a(new Y3(2, ""));
                                    break;
                                default:
                                    C0586w3 c0586w5 = c0586w3;
                                    c0586w5.getClass();
                                    try {
                                        String string = c0586w5.i.a().toString();
                                        if (!c0586w5.d.get()) {
                                            try {
                                                c0586w5.a(P1.I1(string, c0586w5.a));
                                            } catch (Exception unused) {
                                                X0.a("验证回传无效，请重新操作或刷新");
                                            }
                                        }
                                    } catch (Exception unused2) {
                                        X0.a("请先移动滑块，对齐后再确认");
                                        return;
                                    }
                                    break;
                            }
                        }
                    });
                    c0586w3.h.getButton(-3).setOnClickListener(new B(c0586w3, str2, 6));
                    AbstractC0583w0.f0(c0586w3.h);
                    c0586w3.i.b.requestFocus();
                    c0586w3.e.postDelayed(c0586w3.k, 500L);
                    return;
                } catch (Exception unused) {
                    runnableC0552p3.run();
                    return;
                }
            case 1:
                C0586w3 c0586w4 = this.b;
                c0586w4.e.removeCallbacks(c0586w4.k);
                InitOrigin.run(new com.github.catvod.spider.merge.p017u.B(c0586w4.j, 8));
                C0566s3 c0566s4 = c0586w4.i;
                if (c0566s4 != null) {
                    SeekBar seekBar = c0566s4.b;
                    seekBar.setOnSeekBarChangeListener(null);
                    seekBar.setOnKeyListener(null);
                    seekBar.setOnTouchListener(null);
                    seekBar.setOnFocusChangeListener(null);
                    c0566s4.c.setImageDrawable(null);
                    c0566s4.d.setImageDrawable(null);
                    c0566s4.h.recycle();
                    c0566s4.i.recycle();
                    c0566s4.g.clear();
                    c0586w4.i = null;
                }
                AlertDialog alertDialog = c0586w4.h;
                if (alertDialog != null) {
                    alertDialog.setOnDismissListener(null);
                    c0586w4.h.setOnCancelListener(null);
                    c0586w4.h.dismiss();
                    c0586w4.h = null;
                }
                c0586w4.g = null;
                return;
            case 2:
                C0586w3 c0586w5 = this.b;
                AlertDialog alertDialog2 = c0586w5.h;
                if (alertDialog2 != null) {
                    Button button = alertDialog2.getButton(-1);
                    boolean zC = c0586w5.i.c();
                    if (button.isEnabled() != zC) {
                        button.setEnabled(zC);
                        AbstractC0583w0.f0(c0586w5.h);
                        return;
                    }
                    return;
                }
                return;
            default:
                C0586w3 c0586w6 = this.b;
                c0586w6.getClass();
                c0586w6.a(new Y3(3, ""));
                return;
        }
    }
}
