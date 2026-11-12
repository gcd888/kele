package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.p000a.C0359j;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.InterfaceC0578v0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0271k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0271k1(int i, Object obj, String str, boolean z) {
        this.a = i;
        this.d = obj;
        this.b = str;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                C0274l1 c0274l1 = (C0274l1) this.d;
                String str2 = (String) this.b;
                boolean z = this.c;
                try {
                    if (c0274l1.b()) {
                        if (str2.isEmpty()) {
                            com.github.catvod.spider.merge.p000a.I iP = com.github.catvod.spider.merge.p000a.I.p();
                            String str3 = c0274l1.a;
                            int i = c0274l1.c;
                            synchronized (iP.k) {
                                try {
                                    str = iP.x(i, str3) ? iP.c : "";
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            if (str != null && !str.isEmpty()) {
                                str2 = str;
                            }
                        }
                        com.github.catvod.spider.merge.p000a.I iP2 = com.github.catvod.spider.merge.p000a.I.p();
                        iP2.getClass();
                        if (c0274l1.f && c0274l1.b() && Build.VERSION.SDK_INT > 22) {
                            iP2.d(c0274l1, str2, true, !z);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                String str4 = (String) this.b;
                boolean z2 = this.c;
                com.github.catvod.spider.merge.p022z.K1 k1 = (com.github.catvod.spider.merge.p022z.K1) this.d;
                k1.getClass();
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.addAll(com.github.catvod.spider.merge.p022z.K1.e(new JSONObject(X1.X(str4 + "/api/health", null, k1.a.getHeaders())).optJSONArray(z2 ? "plugins" : "channels")));
                    break;
                } catch (Exception unused2) {
                }
                InitOrigin.run(new RunnableC0271k1(k1, z2, arrayList));
                return;
            case 2:
                ((com.github.catvod.spider.merge.p022z.K1) this.d).m((ArrayList) ((List) this.b), this.c);
                return;
            case 3:
                boolean z3 = this.c;
                String str5 = (String) this.b;
                InterfaceC0578v0 interfaceC0578v0 = (InterfaceC0578v0) this.d;
                try {
                    Activity activityD0 = com.github.catvod.spider.merge.p022z.P1.D0();
                    if (activityD0 == null) {
                        return;
                    }
                    int iQ = AbstractC0583w0.Q(8, activityD0);
                    boolean[] zArr = {z3};
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activityD0);
                    linearLayoutK.addView(AbstractC0583w0.p(activityD0, str5, "进入首页时自动执行一次签到"), AbstractC0583w0.c0(iQ));
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activityD0);
                    AbstractC0583w0.m(linearLayoutY, "首页自动签到", "关闭后不再在进入首页时请求签到接口", AbstractC0583w0.d, zArr[0], 0, false, null, zArr, null);
                    linearLayoutK.addView(linearLayoutY);
                    AbstractC0583w0.j0(new AlertDialog.Builder(activityD0).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new P0((C0359j) interfaceC0578v0, zArr, 12)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    return;
                } catch (Exception unused3) {
                    X0.a("自动签到设置没有打开");
                    return;
                }
            default:
                boolean z4 = this.c;
                X0.a(z4 ? "已加入我的追更" : "添加失败，请检查 TMDB 配置");
                if (z4) {
                    AlertDialog alertDialog = (AlertDialog) this.d;
                    if (alertDialog != null && alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    AlertDialog alertDialog2 = (AlertDialog) this.b;
                    if (alertDialog2 != null && alertDialog2.isShowing()) {
                        alertDialog2.dismiss();
                    }
                    com.github.catvod.spider.merge.p022z.P1.W0();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0271k1(com.github.catvod.spider.merge.p022z.K1 k1, boolean z, ArrayList arrayList) {
        this.a = 2;
        this.d = k1;
        this.c = z;
        this.b = arrayList;
    }

    public /* synthetic */ RunnableC0271k1(boolean z, AlertDialog alertDialog, AlertDialog alertDialog2) {
        this.a = 4;
        this.c = z;
        this.d = alertDialog;
        this.b = alertDialog2;
    }

    public /* synthetic */ RunnableC0271k1(boolean z, C0359j c0359j) {
        this.a = 3;
        this.c = z;
        this.b = "蜗牛自动签到";
        this.d = c0359j;
    }
}
