package com.github.catvod.spider.merge.p000a;

import android.text.TextUtils;
import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p022z.P1;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class U implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0342a0 b;

    public /* synthetic */ U(C0342a0 c0342a0, int i) {
        this.a = i;
        this.b = c0342a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0342a0 c0342a0 = this.b;
                c0342a0.m = true;
                try {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("scope", "user");
                        jSONObject.put("client_id", "aMe-8VSlkrbQXpUR");
                        JSONObject jSONObject2 = new JSONObject(X1.M("https://account.guangyapan.com/v1/auth/device/code", jSONObject.toString(), c0342a0.a(false)).a());
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = jSONObject2;
                        }
                        String strU = C0342a0.u(jSONObjectOptJSONObject.optString("device_code"), jSONObject2.optString("device_code"));
                        String strU2 = C0342a0.u(jSONObjectOptJSONObject.optString("verification_uri_complete"), jSONObject2.optString("verification_uri_complete"), jSONObjectOptJSONObject.optString("verification_uri"), jSONObject2.optString("verification_uri"));
                        if (TextUtils.isEmpty(strU) || TextUtils.isEmpty(strU2)) {
                            throw new Exception("设备码为空");
                        }
                        P1.l1(AbstractC0302v0.X0("guangya"), new U(c0342a0, 1), AbstractC0302v0.Y0("guangya"), strU2);
                        long jCurrentTimeMillis = System.currentTimeMillis() + 180000;
                        while (!c0342a0.l && System.currentTimeMillis() < jCurrentTimeMillis) {
                            Thread.sleep(3000L);
                            if (c0342a0.X(strU)) {
                                P1.R();
                                C0299u0.r("guangya");
                                FishConfig.refreshStatus("guangya");
                                X0.a("光鸭网盘登录成功");
                                c0342a0.m = false;
                                return;
                            }
                        }
                        if (!c0342a0.l) {
                            X0.a("光鸭扫码已超时");
                        }
                        c0342a0.m = false;
                        return;
                    } catch (Exception e) {
                        X0.a("光鸭扫码失败: " + e.getMessage());
                    }
                } catch (Throwable th) {
                    c0342a0.m = false;
                    throw th;
                }
                break;
            default:
                C0342a0 c0342a1 = this.b;
                c0342a1.l = true;
                c0342a1.m = false;
                return;
        }
    }
}
