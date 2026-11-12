package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p017u.RunnableC0466s;
import com.github.catvod.spider.merge.p017u.ViewOnClickListenerC0470w;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0584w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ K1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ RunnableC0584w1(K1 k1, String str, int i) {
        this.a = i;
        this.b = k1;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str = this.c;
        K1 k1 = this.b;
        int i = 0;
        switch (this.a) {
            case 0:
                final String str2 = this.c;
                K1 k2 = this.b;
                k2.getClass();
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity != null) {
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                        linearLayoutK.addView(AbstractC0583w0.p(activity, "添加接口", "扫码或手动输入搜索接口地址"), layoutParams);
                        final int i2 = AbstractC0583w0.c;
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.topMargin = AbstractC0583w0.Q(8, activity);
                        AbstractC0583w0.g(linearLayoutY, "接口名称");
                        EditText editTextE = AbstractC0583w0.e(linearLayoutY, "例如：我的接口", "", false);
                        AbstractC0583w0.g(linearLayoutY, "接口地址");
                        EditText editTextE2 = AbstractC0583w0.e(linearLayoutY, "https://example.com", "", false);
                        linearLayoutK.addView(linearLayoutY, layoutParams2);
                        final AlertDialog alertDialogCreate = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("添加", (DialogInterface.OnClickListener) null).setNeutralButton("扫码添加", (DialogInterface.OnClickListener) null).setNegativeButton("取消", new D1(str2, i)).setOnCancelListener(new O(str2, 1)).create();
                        final RunnableC0466s runnableC0466s = new RunnableC0466s(k2, editTextE, editTextE2, str2, alertDialogCreate);
                        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.github.catvod.spider.merge.z.E1
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                AlertDialog alertDialog = alertDialogCreate;
                                alertDialog.getButton(-1).setOnClickListener(new ViewOnClickListenerC0470w((RunnableC0466s) runnableC0466s, 5));
                                alertDialog.getButton(-3).setOnClickListener(new ViewOnClickListenerC0574u1(str2, i2, 1));
                            }
                        });
                        P1.w(str2, new String[]{"name", "url"}, new EditText[]{editTextE, editTextE2}, runnableC0466s);
                        alertDialogCreate.show();
                        AbstractC0583w0.l0(alertDialogCreate, 0.0f);
                    }
                } catch (Exception e) {
                    SpiderDebug.log("[FishPsDialog] showAddCustomDialog: " + e.getMessage());
                    X0.a("显示失败");
                    return;
                }
                break;
            case 1:
                String str3 = this.c;
                K1 k3 = this.b;
                k3.getClass();
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 != null) {
                        LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                        linearLayoutK2.addView(AbstractC0583w0.p(activity2, "添加自定义", "添加后进入全局频道范围"), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity2)));
                        int[] iArr = {0};
                        linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"TG频道", "搜索插件"}, new String[]{"添加到TG频道列表", "添加到搜索插件列表"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.f}, iArr, null));
                        LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity2);
                        AbstractC0583w0.g(linearLayoutY2, "名称");
                        EditText editTextE3 = AbstractC0583w0.e(linearLayoutY2, "leoziyuan 或 dyyjpro", "", false);
                        linearLayoutK2.addView(linearLayoutY2);
                        AlertDialog alertDialogCreate2 = new AlertDialog.Builder(activity2).setView(AbstractC0583w0.q0(linearLayoutK2)).setPositiveButton("添加", (DialogInterface.OnClickListener) null).setNeutralButton("扫码添加", (DialogInterface.OnClickListener) null).setNegativeButton("取消", new D1(str3, 2)).setOnCancelListener(new O(str3, 2)).create();
                        P1.v(str3, "name", editTextE3, null);
                        alertDialogCreate2.setOnShowListener(new A1(k3, alertDialogCreate2, editTextE3, iArr, str3, 0));
                        alertDialogCreate2.show();
                        AbstractC0583w0.l0(alertDialogCreate2, 0.0f);
                    }
                } catch (Exception e2) {
                    b.D(e2, new StringBuilder("[FishPsDialog] showAddChannelItemDialog: "));
                    return;
                }
                break;
            case 2:
                k1.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(X1.X(str + "/api/health", null, k1.a.getHeaders()));
                    InitOrigin.run(new RunnableC0564s1(k1, str, K1.e(jSONObject.optJSONArray("channels")), K1.e(jSONObject.optJSONArray("plugins"))));
                } catch (Exception unused) {
                    InitOrigin.run(new RunnableC0584w1(k1, str, 3));
                    return;
                }
                break;
            default:
                J1 j1 = k1.a;
                j1.setChannelApiUrl(str);
                j1.saveConfig();
                X0.a("默认频道读取失败");
                break;
        }
    }
}
