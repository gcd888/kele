package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0251e;
import com.github.catvod.spider.merge.A.T1;
import com.github.catvod.utils.FishNative;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class U1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ U1(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j = this.b;
                if (FishCrypto.a) {
                    try {
                        FishNative.hostExit(j);
                    } catch (Throwable unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                JSONObject jSONObjectA = AbstractC0251e.a();
                long jOptLong = jSONObjectA.optLong("successAt");
                long j2 = this.b;
                if (jOptLong <= j2) {
                    if (P1.b != null) {
                        P1.c = Math.max(P1.c, j2);
                        break;
                    } else {
                        try {
                            Activity activity = InitOrigin.getActivity();
                            if (activity != null) {
                                int i = P1.h + 1;
                                P1.h = i;
                                P1.c = j2;
                                P1.d = System.currentTimeMillis();
                                String strOptString = jSONObjectA.optString("status");
                                boolean z = "resolving".equals(strOptString) || "discovered".equals(strOptString);
                                boolean z2 = ("loading".equals(strOptString) || z) && jSONObjectA.optString("requestKey").equals(P1.g) && !P1.g.isEmpty();
                                int iMax = 5;
                                if (z2) {
                                    iMax = Math.max(5, P1.e);
                                } else if (z) {
                                    iMax = 72;
                                }
                                String str = z2 ? P1.f : z ? "正在验证推荐作品..." : "等待AI任务 0/3";
                                P1.e = iMax;
                                P1.f = str;
                                C0568t0 c0568t0I0 = AbstractC0583w0.i0(activity, "AI推荐更新", "3个AI任务并发生成，完成后验证作品", -16732991);
                                P1.b = c0568t0I0;
                                c0568t0I0.c(P1.e, P1.f);
                                C0568t0 c0568t0 = P1.b;
                                c0568t0.b.post(new RunnableC0554q0(c0568t0, new T1(i, 6), 1));
                                P1.w0(i);
                                break;
                            }
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
                break;
        }
    }
}
