package com.github.catvod.spider.merge.p017u;

import android.os.Looper;
import com.github.catvod.spider.FanShu;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.p000a.K;
import com.github.catvod.spider.merge.p022z.C0586w3;
import com.github.catvod.spider.merge.p022z.RunnableC0552p3;
import com.github.catvod.spider.merge.p022z.Y3;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract /* synthetic */ class AbstractC0457i {
    public static Y3 a(FanShu.CaptchaPrompter captchaPrompter, K k) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = k.b;
        if (jSONObject2 == null) {
            return captchaPrompter.prompt((byte[]) k.a.clone());
        }
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(jSONObject2.toString());
            } catch (JSONException e) {
                throw new IllegalStateException(e);
            }
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Slider dialog requires worker thread");
        }
        C0586w3 c0586w3 = new C0586w3(jSONObject);
        InitOrigin.run(new RunnableC0552p3(c0586w3, 0));
        try {
            c0586w3.c.await(120L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        c0586w3.a(new Y3(3, ""));
        return c0586w3.f;
    }
}
