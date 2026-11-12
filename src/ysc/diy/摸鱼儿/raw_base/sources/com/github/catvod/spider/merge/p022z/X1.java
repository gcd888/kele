package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.P0;
import com.github.catvod.spider.merge.A.X0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class X1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0559r1 b;
    public final /* synthetic */ List c;

    public /* synthetic */ X1(C0559r1 c0559r1, List list, int i) {
        this.a = i;
        this.b = c0559r1;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                List list = this.c;
                C0559r1 c0559r1 = this.b;
                c0559r1.getClass();
                try {
                    Activity activity = InitOrigin.getActivity();
                    ArrayList arrayList = new ArrayList(list);
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                    linearLayoutK.addView(AbstractC0583w0.p(activity, ((C0481b2) c0559r1.b).b + "排序", "点击项目上移调整顺序"), layoutParams);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    RunnableC0597z runnableC0597z = new RunnableC0597z(2, linearLayout, arrayList, new Runnable[]{runnableC0597z});
                    runnableC0597z.run();
                    linearLayoutK.addView(AbstractC0583w0.s(activity, linearLayout));
                    AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayoutK).setPositiveButton("保存", new P0(c0559r1, arrayList, 11)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                } catch (Exception e) {
                    SpiderDebug.log("[MusicDialog] showSortDialog: " + e.getMessage());
                    X0.a("显示失败");
                    return;
                }
                break;
            default:
                List list2 = this.c;
                C0559r1 c0559r2 = this.b;
                C0481b2 c0481b2 = (C0481b2) c0559r2.b;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                    linearLayoutK2.addView(AbstractC0583w0.p(activity2, "删除" + c0481b2.b, "关闭开关即可删除对应" + c0481b2.b), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activity2)));
                    boolean[] zArr = new boolean[list2.size()];
                    Arrays.fill(zArr, true);
                    LinearLayout linearLayout2 = new LinearLayout(activity2);
                    linearLayout2.setOrientation(1);
                    int i = 0;
                    while (i < list2.size()) {
                        AbstractC0583w0.m(linearLayout2, (String) list2.get(i), null, AbstractC0583w0.e, zArr[i], i, i > 0, null, zArr, null);
                        i++;
                    }
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity2);
                    linearLayoutY.addView(AbstractC0583w0.J(activity2, linearLayout2, 280));
                    AbstractC0583w0.l(linearLayoutY, "关闭开关表示选中删除");
                    linearLayoutK2.addView(linearLayoutY);
                    AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(linearLayoutK2).setPositiveButton("删除所选", new DialogInterfaceOnClickListenerC0503g(c0559r2, zArr, list2, 9)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                } catch (Exception e2) {
                    SpiderDebug.log("[MusicDialog] showDeleteDialog: " + e2.getMessage());
                    X0.a("显示失败");
                }
                break;
        }
    }
}
