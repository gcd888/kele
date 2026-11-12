package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.merge.D.b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class RunnableC0480b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0559r1 b;

    public /* synthetic */ RunnableC0480b1(C0559r1 c0559r1, int i) {
        this.a = i;
        this.b = c0559r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    C0559r1.e(this.b);
                } catch (Exception e) {
                    b.D(e, new StringBuilder("[FishDriveDialog] showCategorySortDialog: "));
                    return;
                }
                break;
            case 1:
                try {
                    C0559r1.f(this.b);
                } catch (Exception e2) {
                    b.D(e2, new StringBuilder("[FishDriveDialog] showServerToggleDialog: "));
                    return;
                }
                break;
            case 2:
                try {
                    C0559r1.g(this.b);
                } catch (Exception e3) {
                    b.D(e3, new StringBuilder("[FishDriveDialog] showCategoryFilterDialog: "));
                }
                break;
            case 3:
                try {
                    C0559r1.h(this.b);
                } catch (Exception e4) {
                    b.D(e4, new StringBuilder("[FishDriveDialog] showEmbySecurityListDialog: "));
                    return;
                }
                break;
            default:
                try {
                    C0559r1.d(this.b);
                } catch (Exception e5) {
                    b.D(e5, new StringBuilder("[FishDriveDialog] showServerOrderDialog: "));
                    return;
                }
                break;
        }
    }
}
