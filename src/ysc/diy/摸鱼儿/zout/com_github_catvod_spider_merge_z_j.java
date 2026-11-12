package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.X0;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0518j implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0518j(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        Context activity;
        int i2 = 0;
        switch (this.a) {
            case 0:
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 != null) {
                        int i3 = AbstractC0583w0.a;
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity2, "确认清除", "清除后无法恢复，确定清除所有观看历史吗？", AbstractC0583w0.f, null, null, new String[]{"确认清除", "取消"}, new Runnable[]{new RunnableC0483c((C0239a) this.b, i2), null}));
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                ((RunnableC0540n1) this.b).c.t(true);
                break;
            case 2:
                ((CountDownLatch) this.b).countDown();
                break;
            case 3:
                ((C0586w3) this.b).j.run();
                break;
            case 4:
                C0299u0 c0299u0 = C0299u0.t;
                boolean[] zArr = (boolean[]) this.b;
                if (zArr != null && zArr.length == C0299u0.V.length) {
                    C0299u0.V = zArr;
                    C0299u0.N0();
                }
                int length = zArr.length;
                int i4 = 0;
                while (i2 < length) {
                    if (zArr[i2]) {
                        i4++;
                    }
                    i2++;
                }
                X0.a("已启用 " + i4 + " 个云盘");
                break;
            case 5:
                int length2 = C0299u0.X.length;
                int[] iArr = new int[length2];
                int i5 = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) this.b;
                    if (i5 >= arrayList.size()) {
                        if (length2 == C0299u0.W.length) {
                            C0299u0.a0 = iArr;
                            C0299u0.N0();
                        }
                        X0.a("播放源排序已保存");
                    } else {
                        int i6 = 0;
                        while (true) {
                            String[] strArr = C0299u0.X;
                            if (i6 >= strArr.length) {
                            }
                            if (strArr[i6].equals(arrayList.get(i5))) {
                                iArr[i5] = i6;
                            }
                            i6++;
                            break;
                            break;
                        }
                        i5++;
                    }
                    break;
                }
                break;
            default:
                Context context = (Context) this.b;
                B3 b3 = new B3(28);
                try {
                    activity = InitOrigin.getActivity();
                } catch (Exception unused2) {
                    activity = context;
                }
                Context context2 = activity == null ? context : activity;
                int i7 = AbstractC0583w0.a;
                AbstractC0583w0.j0(AbstractC0583w0.r(context2, "确认清空", "清空后无法恢复，确定删除全部收藏壁纸吗？", AbstractC0583w0.e, null, null, new String[]{"确认清空", "取消"}, new Runnable[]{b3, null}));
                break;
        }
    }
}
