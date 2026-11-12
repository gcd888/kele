package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.S.a;
import com.github.catvod.utils.FishNative;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0486c2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ InterfaceC0580v2 e;
    public final /* synthetic */ int f;

    public /* synthetic */ RunnableC0486c2(int i, a aVar, String str, String str2, C0559r1 c0559r1) {
        this.f = i;
        this.b = aVar;
        this.c = str;
        this.d = str2;
        this.e = c0559r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        switch (this.a) {
            case 0:
                try {
                    activity = InitOrigin.getActivity();
                } catch (Throwable unused) {
                    activity = null;
                }
                a aVar = this.b;
                String str = this.c;
                String str2 = this.d;
                InterfaceC0580v2 interfaceC0580v2 = this.e;
                if (activity == null || activity.isFinishing()) {
                    int i = this.f;
                    if (i >= 1200) {
                        interfaceC0580v2.b();
                    } else {
                        InitOrigin.run(new RunnableC0486c2(aVar, str, str2, (C0559r1) interfaceC0580v2, i), 500);
                    }
                } else {
                    boolean z = FishCrypto.a;
                    long jPopupArm = FishNative.popupArm(str, str2);
                    if (jPopupArm != 0) {
                        try {
                            C2.l(activity, aVar, new C0575u2(jPopupArm, (C0559r1) interfaceC0580v2));
                        } catch (Throwable unused2) {
                            FishNative.popupViolation(jPopupArm);
                            if (interfaceC0580v2 != null) {
                                interfaceC0580v2.b();
                                return;
                            }
                            return;
                        }
                    } else if (interfaceC0580v2 != null) {
                        interfaceC0580v2.b();
                    }
                }
                break;
            default:
                InitOrigin.run(new RunnableC0486c2(this.f + 1, this.b, this.c, this.d, (C0559r1) this.e));
                break;
        }
    }

    public /* synthetic */ RunnableC0486c2(a aVar, String str, String str2, C0559r1 c0559r1, int i) {
        this.b = aVar;
        this.c = str;
        this.d = str2;
        this.e = c0559r1;
        this.f = i;
    }
}
