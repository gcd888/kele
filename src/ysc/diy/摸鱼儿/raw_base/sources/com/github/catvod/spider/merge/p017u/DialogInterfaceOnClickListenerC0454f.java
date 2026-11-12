package com.github.catvod.spider.merge.p017u;

import android.app.Activity;
import android.content.DialogInterface;
import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.A.Z1;
import com.github.catvod.spider.merge.A.a2;
import com.github.catvod.spider.merge.p000a.A;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.B3;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.P2;
import com.github.catvod.spider.merge.p022z.S;
import com.github.catvod.spider.merge.p022z.S2;
import com.github.catvod.spider.merge.p022z.U2;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0454f implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ DialogInterfaceOnClickListenerC0454f(int i) {
        this.a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        int i2 = 7;
        switch (this.a) {
            case 0:
                InitOrigin.execute(new P2(18));
                break;
            case 1:
                A aJ = A.j();
                aJ.j = true;
                aJ.z();
                X0.a("已关闭登录提醒，可在设置中重新开启");
                break;
            case 2:
                InitOrigin.run(new S2(i2));
                break;
            case 3:
                P1.U0();
                break;
            case 4:
                P1.U0();
                break;
            case 5:
                Pattern pattern = a2.h;
                a2 a2Var = Z1.a;
                S s = new S(28);
                X1 x1 = a2Var.d;
                x1.getClass();
                InitOrigin.run(new W(x1, String.valueOf(System.currentTimeMillis()), s, 19));
                break;
            case 6:
                P1.X0("config_backup_help", null);
                break;
            case 7:
                P1.X0("config_backup_help", null);
                break;
            case 8:
                P1.U0();
                break;
            case 9:
                Z0.t().i = true;
                break;
            case 10:
                P1.Q("uc");
                Z0.t().i = true;
                break;
            case 11:
                if (!P1.z0()) {
                    X0.a("当前无法更新画像，请检查AI推荐设置");
                }
                break;
            case 12:
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity != null) {
                        int i3 = AbstractC0583w0.e;
                        int i4 = AbstractC0583w0.a;
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity, "清除AI推荐依据", "清除本机搜索和播放记录，操作后无法恢复", i3, new String[][]{new String[]{"清除内容", "搜索词、片名、集数和推荐统计"}, new String[]{"保留内容", "已生成的AI推荐缓存和播放历史同步记录"}}, new int[]{i3, AbstractC0583w0.d}, new String[]{"确认清除", "取消"}, new Runnable[]{new U2(6), null}));
                    }
                } catch (Exception unused) {
                    X0.a("操作失败");
                    return;
                }
                break;
            case 13:
                X0.a("正在刷新状态");
                FishConfig.refreshConsoleStatus(new B3(25));
                break;
            case 14:
                int[] iArr = (int[]) C0299u0.Z.clone();
                if (iArr.length == C0299u0.W.length) {
                    C0299u0.a0 = iArr;
                    C0299u0.N0();
                }
                X0.a("已重置为默认排序");
                break;
            case 15:
                C0299u0 c0299u0X = C0299u0.x();
                c0299u0X.k = false;
                c0299u0X.J0();
                break;
            default:
                X0.a("正在刷新状态");
                FishConfig.refreshConsoleStatus(new RunnableC0459k(i2));
                break;
        }
    }
}
