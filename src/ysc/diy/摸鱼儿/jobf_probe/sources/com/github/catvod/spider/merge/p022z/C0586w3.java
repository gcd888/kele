package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Handler;
import android.os.Looper;
import com.github.catvod.spider.merge.A.H0;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0586w3 {
    public final JSONObject a;
    public Activity g;
    public AlertDialog h;
    public C0566s3 i;
    public final String b = "fanshu_slider_" + UUID.randomUUID();
    public final CountDownLatch c = new CountDownLatch(1);
    public final AtomicBoolean d = new AtomicBoolean();
    public final Handler e = new Handler(Looper.getMainLooper());
    public volatile Y3 f = new Y3(3, "");
    public final RunnableC0552p3 j = new RunnableC0552p3(this, 3);
    public final X2 k = new X2(2, this);

    public C0586w3(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final void a(Y3 y3) throws Throwable {
        if (this.d.compareAndSet(false, true)) {
            this.f = y3;
            H0 h0 = H0.a;
            String str = this.b;
            h0.getClass();
            H0.k(str);
            this.c.countDown();
            this.e.post(new RunnableC0552p3(this, 1));
        }
    }
}
