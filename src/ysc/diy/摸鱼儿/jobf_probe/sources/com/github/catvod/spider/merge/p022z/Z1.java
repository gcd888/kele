package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class Z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0559r1 b;

    public /* synthetic */ Z1(C0559r1 c0559r1, int i) {
        this.a = i;
        this.b = c0559r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[][] strArr;
        C0559r1 c0559r1 = this.b;
        switch (this.a) {
            case 0:
                C0481b2 c0481b2 = (C0481b2) c0559r1.b;
                try {
                    Activity activity = InitOrigin.getActivity();
                    String str = "重置" + c0481b2.b + "列表";
                    int i = AbstractC0583w0.f;
                    String[][] strArr2 = {new String[]{"当前设置", "自定义" + c0481b2.b + "将被清除"}};
                    int i2 = AbstractC0583w0.a;
                    AbstractC0583w0.j0(AbstractC0583w0.r(activity, "恢复默认", str, i, strArr2, new int[]{i}, new String[]{"确定", "取消"}, new Runnable[]{new Z1(c0559r1, 2), null}));
                } catch (Exception e) {
                    SpiderDebug.log("[MusicDialog] showResetConfirm: " + e.getMessage());
                    X0.a("显示失败");
                    return;
                }
                break;
            case 1:
                C0481b2 c0481b3 = (C0481b2) c0559r1.b;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity2);
                    int size = ((InterfaceC0476a2) c0559r1.a).getItems().size();
                    String str2 = c0481b3.a;
                    String str3 = c0481b3.b;
                    linearLayoutK.addView(AbstractC0583w0.p(activity2, str2, "已添加 " + size + " 个" + str3), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activity2)));
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity2);
                    linearLayoutY.setDescendantFocusability(262144);
                    boolean z = c0481b3.h;
                    if (z) {
                        StringBuilder sb = new StringBuilder("重置为默认");
                        sb.append(str3);
                        strArr = new String[][]{new String[]{"添加" + str3, "添加新的" + str3}, new String[]{"删除" + str3, "移除不需要的" + str3}, new String[]{str3 + "排序", "调整显示顺序"}, new String[]{"恢复默认", sb.toString()}};
                    } else {
                        strArr = new String[][]{new String[]{"添加" + str3, "添加新的" + str3}, new String[]{"删除" + str3, "移除不需要的" + str3}, new String[]{"恢复默认", "重置为默认" + str3}};
                    }
                    int[] iArr = z ? new int[]{AbstractC0583w0.d, AbstractC0583w0.e, AbstractC0583w0.c, AbstractC0583w0.i} : new int[]{AbstractC0583w0.d, AbstractC0583w0.e, AbstractC0583w0.i};
                    char c = 1;
                    AlertDialog[] alertDialogArr = new AlertDialog[1];
                    int i3 = 0;
                    while (i3 < strArr.length) {
                        String[] strArr3 = strArr[i3];
                        AbstractC0583w0.d(linearLayoutY, strArr3[0], strArr3[c], iArr[i3], i3 > 0).setOnClickListener(new D(c0559r1, alertDialogArr, i3));
                        c = 1;
                        i3++;
                    }
                    linearLayoutK.addView(linearLayoutY);
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                    alertDialogArr[0] = alertDialogCreate;
                    AbstractC0583w0.j0(alertDialogCreate);
                } catch (Exception e2) {
                    SpiderDebug.log("[MusicDialog] showManageDialog: " + e2.getMessage());
                    X0.a("显示失败");
                    return;
                }
                break;
            default:
                InterfaceC0476a2 interfaceC0476a2 = (InterfaceC0476a2) c0559r1.a;
                interfaceC0476a2.resetItems();
                interfaceC0476a2.saveConfig();
                X0.a("已恢复默认" + ((C0481b2) c0559r1.b).b + "，刷新生效");
                break;
        }
    }
}
