package com.github.catvod.spider.merge.p022z;

import android.text.TextUtils;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.utils.FishNative;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0575u2 implements InterfaceC0600z2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ InterfaceC0580v2 b;

    public C0575u2(long j, C0559r1 c0559r1) {
        this.a = j;
        this.b = c0559r1;
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0600z2
    public final boolean a() {
        boolean z = FishCrypto.a;
        String strPopupAck = FishNative.popupAck(this.a);
        if (TextUtils.isEmpty(strPopupAck)) {
            return false;
        }
        try {
            InterfaceC0580v2 interfaceC0580v2 = this.b;
            if (interfaceC0580v2 == null) {
                return true;
            }
            interfaceC0580v2.a(strPopupAck);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0600z2
    public final void b() {
        boolean z = FishCrypto.a;
        FishNative.popupShown(this.a);
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0600z2
    public final void e(boolean z) {
        if (z) {
            return;
        }
        boolean z2 = FishCrypto.a;
        FishNative.popupViolation(this.a);
        InterfaceC0580v2 interfaceC0580v2 = this.b;
        if (interfaceC0580v2 != null) {
            interfaceC0580v2.b();
        }
    }
}
