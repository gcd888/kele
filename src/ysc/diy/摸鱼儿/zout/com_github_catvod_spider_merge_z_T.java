package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.J0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p017u.ViewOnClickListenerC0470w;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0567t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ RunnableC0567t(String str, int i, int i2, String str2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str = this.b;
        String str2 = this.c;
        int i = 2;
        int i2 = this.d;
        switch (this.a) {
            case 0:
                P1.J0(str, "扫码在手机上输入模型配置", str2, "api_key,API Key,输入 API Key (sk-xxx),pwd|base_url,BaseURL,https://api.deepseek.com|model,Model,deepseek-chat", i2);
                break;
            case 1:
                C0299u0.R.put(str, Integer.valueOf(Math.max(1, Math.min(1000, i2))));
                C0299u0.O0();
                X0.a(str2 + " 已设置为 " + i2);
                break;
            case 2:
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity != null) {
                        int color = Color.parseColor("#C62828");
                        int i3 = AbstractC0583w0.a;
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity, "自定义线程警告", "过高线程可能会荣升封号斗罗，非必要请酌情配置数量。", color, new String[][]{new String[]{"配置范围", "1-1000线程"}, new String[]{"高风险阈值", "超过256线程保存前会再次确认"}}, new int[]{AbstractC0583w0.c, color}, new String[]{"我已了解，继续", "取消"}, new Runnable[]{new RunnableC0567t(str, i2, 3, str2), null}));
                    }
                } catch (Exception e) {
                    b.x(e, new StringBuilder("显示失败: "));
                    return;
                }
                break;
            case 3:
                InitOrigin.run(new RunnableC0567t(str2, i2, str));
                break;
            default:
                String str3 = this.b;
                String str4 = this.c;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 != null) {
                        String str5 = "thread_config_" + System.currentTimeMillis();
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity2);
                        linearLayoutK.addView(AbstractC0583w0.q(activity2, "自定义线程数", str3, Color.parseColor("#C62828")), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity2)));
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity2);
                        AbstractC0583w0.g(linearLayoutY, "线程数量");
                        EditText editTextF = AbstractC0583w0.f(linearLayoutY, "请输入1-1000的整数", String.valueOf(i2), false);
                        editTextF.setInputType(2);
                        AbstractC0583w0.l(linearLayoutY, "可手动填写或使用扫码输入");
                        linearLayoutK.addView(linearLayoutY);
                        J0 j0 = new J0(editTextF, str5, alertDialogArr, activity2, str4, str3);
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity2).setView(linearLayoutK).setPositiveButton("保存", (DialogInterface.OnClickListener) null).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("取消", new D1(str5, i)).setOnCancelListener(new O(str5, i)).create();
                        AlertDialog[] alertDialogArr = {alertDialogCreate};
                        AbstractC0583w0.j0(alertDialogCreate);
                        alertDialogArr[0].getButton(-1).setOnClickListener(new ViewOnClickListenerC0470w(j0, 11));
                        P1.x(alertDialogArr[0].getButton(-3), "自定义线程数", str5, "thread", "线程数量", "请输入1-1000的整数", Color.parseColor("#C62828"), editTextF, j0);
                    }
                } catch (Exception e2) {
                    b.x(e2, new StringBuilder("设置失败: "));
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0567t(String str, int i, String str2) {
        this.a = 4;
        this.b = str;
        this.d = i;
        this.c = str2;
    }
}
