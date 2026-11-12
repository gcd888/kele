package com.github.catvod.spider.merge.p017u;

import android.text.TextUtils;
import com.github.catvod.spider.AppUn;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.RunnableC0553q;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0450b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppUn b;

    public /* synthetic */ RunnableC0450b(AppUn appUn, int i) {
        this.a = i;
        this.b = appUn;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.a) {
            case 0:
                AppUn appUn = this.b;
                if (!appUn.n()) {
                    appUn.c = AppUn.z();
                    appUn.B();
                    appUn.E();
                    return;
                } else {
                    String strF = appUn.F();
                    InitOrigin.run(new RunnableC0553q("重新注册 " + P1.E1(strF, "当前站源") + " 新账号", "将结束当前账号状态，然后重新完成注册验证", AbstractC0583w0.f, "开始验证", new RunnableC0450b(appUn, 10)));
                    return;
                }
            case 1:
                AppUn appUn2 = this.b;
                if (!appUn2.l.compareAndSet(false, true)) {
                    X0.a("注册正在进行，请稍候");
                    return;
                } else {
                    X0.a("正在获取本机验证");
                    InitOrigin.execute(new RunnableC0450b(appUn2, 2));
                    return;
                }
            case 2:
                AppUn appUn3 = this.b;
                AtomicBoolean atomicBoolean = appUn3.l;
                try {
                    try {
                        JSONObject jSONObjectK = appUn3.k();
                        int iG0 = P1.G0(jSONObjectK.optString("master_image"), jSONObjectK.optString("thumb_image"));
                        if (iG0 <= 0 || iG0 >= 360) {
                            throw new IOException("captcha cancelled");
                        }
                        appUn3.l(iG0, jSONObjectK.optString("id"));
                        X0.a("注册成功，已自动登录");
                        atomicBoolean.set(false);
                        return;
                    } catch (Exception unused) {
                        X0.a("本机注册失败，请回到账号管理重新注册");
                    }
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
                break;
            case 3:
                AppUn appUn4 = this.b;
                AtomicBoolean atomicBoolean2 = appUn4.l;
                try {
                    try {
                        appUn4.h();
                        break;
                    } catch (Exception unused2) {
                        X0.a("扫码注册失败，请回到账号管理重新注册");
                        break;
                    }
                    return;
                } finally {
                    atomicBoolean2.set(false);
                }
            case 4:
                AppUn appUn5 = this.b;
                appUn5.getClass();
                InitOrigin.execute(new RunnableC0450b(appUn5, 8));
                return;
            case 5:
                AppUn appUn6 = this.b;
                String strF2 = appUn6.F();
                InitOrigin.run(new RunnableC0553q("清除 " + P1.E1(strF2, "当前站源") + " 账号", "将删除本机保存的账号资料和当前会话", AbstractC0583w0.e, "确认清除", new RunnableC0450b(appUn6, 9)));
                return;
            case 6:
                this.b.C();
                return;
            case 7:
                String strF3 = this.b.F();
                HashMap map = new HashMap();
                if (TextUtils.isEmpty(strF3)) {
                    strF3 = "当前站源";
                }
                map.put("playName", strF3);
                P1.X0("appun_help", map);
                return;
            case 8:
                AppUn appUn7 = this.b;
                appUn7.B();
                appUn7.t();
                X0.a(appUn7.g ? "登录成功" : "登录失败，请重新注册账号");
                return;
            case 9:
                this.b.e(true);
                X0.a("账号信息已清除");
                return;
            case 10:
                AppUn appUn8 = this.b;
                appUn8.e(false);
                appUn8.c = AppUn.z();
                appUn8.E();
                return;
            default:
                AppUn appUn9 = this.b;
                if (!appUn9.l.compareAndSet(false, true)) {
                    X0.a("注册正在进行，请稍候");
                    return;
                } else {
                    X0.a("正在获取扫码验证");
                    InitOrigin.execute(new RunnableC0450b(appUn9, 3));
                    return;
                }
        }
    }
}
