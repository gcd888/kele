package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.H0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p021y.a;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0593y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ String c;

    public /* synthetic */ RunnableC0593y0(Runnable runnable, String str, int i) {
        this.a = i;
        this.b = runnable;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = 3;
        int i2 = 1;
        Runnable runnable = this.b;
        String str = this.c;
        switch (this.a) {
            case 0:
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity != null && !activity.isFinishing()) {
                        try {
                            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                            int i3 = AbstractC0583w0.e;
                            AbstractC0583w0.j0(builder.setView(AbstractC0583w0.p0(P1.K(activity, "删除确认", "删除后无法从这里恢复", i3, new String[][]{new String[]{"文件", str}, new String[]{"风险", "将从网盘中移除"}}, new int[]{AbstractC0583w0.c, i3}))).setPositiveButton("确认删除", new E((a) runnable, i)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                        } catch (Exception e) {
                            b.D(e, new StringBuilder("[DownloadDialog] showDeleteConfirm error: "));
                            return;
                        }
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                InitOrigin.execute(new RunnableC0593y0(runnable, str, i));
                break;
            case 2:
                H0.a.getClass();
                H0.k(str);
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 3:
                runnable.run();
                InitOrigin.run(new com.github.catvod.spider.merge.p019w.a(str, 9));
                break;
            default:
                try {
                    Activity activityD0 = P1.D0();
                    if (activityD0 != null) {
                        int i4 = AbstractC0583w0.e;
                        AbstractC0583w0.j0(AbstractC0583w0.r(activityD0, "清除" + str + "账号", "此操作不可撤销", i4, new String[][]{new String[]{"登录凭证", "Cookie/Token将被删除"}, new String[]{"状态缓存", "会员状态和转存缓存"}, new String[]{"提示", "清除后需重新登录"}}, new int[]{i4, AbstractC0583w0.f, AbstractC0583w0.i}, new String[]{"确认清除", "取消"}, new Runnable[]{new RunnableC0593y0(runnable, str, i2), null}));
                    }
                } catch (Exception unused2) {
                    X0.a("显示失败");
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0593y0(String str, Runnable runnable, int i) {
        this.a = i;
        this.c = str;
        this.b = runnable;
    }
}
