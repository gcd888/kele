package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.D.b;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class RunnableC0540n1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ C0559r1 c;

    public RunnableC0540n1(C0559r1 c0559r1, String str, int i) {
        this.c = c0559r1;
        this.a = str;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Activity activity = InitOrigin.getActivity();
            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
            linearLayoutK.addView(AbstractC0583w0.p(activity, "确认删除", "确定要删除服务器 \"" + this.a + "\" 吗？此操作不可撤销。"), layoutParams);
            AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("删除", new DialogInterfaceOnClickListenerC0535m1(this)).setNegativeButton("取消", new DialogInterfaceOnClickListenerC0518j(1, this)).create());
        } catch (Exception e) {
            b.D(e, new StringBuilder("[FishDriveDialog] showDeleteConfirmDialog: "));
        }
    }
}
