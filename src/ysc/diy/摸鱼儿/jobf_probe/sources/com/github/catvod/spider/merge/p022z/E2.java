package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.O1;
import com.github.catvod.spider.merge.A.S1;
import com.github.catvod.spider.merge.A.Z1;
import com.github.catvod.spider.merge.A.a2;
import com.github.catvod.spider.merge.A.k2;
import com.github.catvod.spider.merge.p017u.B;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class E2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ E2(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = false;
        boolean z2 = true;
        char c = 1;
        char c2 = 1;
        switch (this.a) {
            case 0:
                Activity activityD0 = P1.D0();
                if (activityD0 != null) {
                    int iQ = AbstractC0583w0.Q(8, activityD0);
                    boolean z3 = this.b;
                    String strI = k2.i(z3);
                    boolean[] zArr = {k2.p(z3)};
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activityD0);
                    linearLayoutK.addView(AbstractC0583w0.q(activityD0, strI.concat("播放历史设置"), "开启后自动采集、上传、合并并写回播放记录", AbstractC0583w0.c), AbstractC0583w0.c0(iQ));
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activityD0);
                    AbstractC0583w0.m(linearLayoutY, strI.concat("自动同步播放记录"), "播放或暂停时读取软件历史，合并后回读验证", AbstractC0583w0.d, zArr[0], 0, true, null, zArr, null);
                    AbstractC0583w0.l(linearLayoutY, "此开关只控制" + strI + "，不会更改另一个云端开关");
                    AbstractC0583w0.l(linearLayoutY, "支持 WebHTV、FongMi/TV、OK影视；其它版本以同步结果为准");
                    linearLayoutK.addView(linearLayoutY);
                    AbstractC0583w0.j0(new AlertDialog.Builder(activityD0).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new K2(zArr, z3, strI)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    break;
                }
                break;
            case 1:
                if (!this.b) {
                    Pattern pattern = a2.h;
                    a2 a2Var = Z1.a;
                    a2Var.getClass();
                    InitOrigin.run(new S1(a2Var, z, c == true ? 1 : 0));
                } else {
                    Pattern pattern2 = a2.h;
                    a2 a2Var2 = Z1.a;
                    a2Var2.getClass();
                    InitOrigin.run(new S1(a2Var2, z2, c2 == true ? 1 : 0));
                }
                break;
            default:
                if (!this.b) {
                    Pattern pattern3 = a2.h;
                    a2 a2Var3 = Z1.a;
                    a2Var3.getClass();
                    O1 o1 = new O1(a2Var3, 3);
                    a2Var3.d.getClass();
                    InitOrigin.run(new B(o1, 10));
                } else {
                    Pattern pattern4 = a2.h;
                    a2 a2Var4 = Z1.a;
                    a2Var4.getClass();
                    O1 o2 = new O1(a2Var4, 1);
                    a2Var4.d.getClass();
                    InitOrigin.run(new B(o2, 10));
                }
                break;
        }
    }
}
