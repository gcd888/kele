package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0582w implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String[] d;

    public /* synthetic */ RunnableC0582w(String str, String[] strArr, boolean z) {
        this.c = str;
        this.d = strArr;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        boolean z = this.b;
        String[] strArr = this.d;
        String str = this.c;
        switch (this.a) {
            case 0:
                InitOrigin.run(new RunnableC0582w(z, str, strArr));
                break;
            default:
                try {
                    activity = InitOrigin.getActivity();
                } catch (Exception unused) {
                    activity = null;
                }
                if (activity == null) {
                    X0.a("请在应用界面中操作");
                } else {
                    try {
                        int i = z ? AbstractC0583w0.d : AbstractC0583w0.f;
                        String str2 = P1.E1(str, "当前站源") + " · 账号状态";
                        String[][] strArr2 = {new String[]{"登录状态", P1.P(strArr, 0, "尚未登录")}, new String[]{"账号名", P1.P(strArr, 1, "无")}, new String[]{"用户 ID", P1.P(strArr, 2, "待登录后获取")}, new String[]{"会员状态", P1.P(strArr, 3, "待登录后获取")}};
                        int i2 = AbstractC0583w0.c;
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity, str2, "账号详情", i, strArr2, new int[]{i, i2, i2, i}, new String[]{"关闭"}, new Runnable[]{null}));
                    } catch (Exception unused2) {
                        X0.a("显示账号状态失败");
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0582w(boolean z, String str, String[] strArr) {
        this.b = z;
        this.c = str;
        this.d = strArr;
    }
}
