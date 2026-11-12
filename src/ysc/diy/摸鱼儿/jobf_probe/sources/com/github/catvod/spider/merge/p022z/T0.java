package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.B;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p018v.f;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class T0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0559r1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ T0(C0559r1 c0559r1, int i, int i2) {
        this.a = i2;
        this.b = c0559r1;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        int i2 = 0;
        int i3 = 1;
        final C0559r1 c0559r1 = this.b;
        final int i4 = this.c;
        switch (this.a) {
            case 0:
                C0559r1 c0559r2 = this.b;
                c0559r2.getClass();
                try {
                    Activity activity = InitOrigin.getActivity();
                    JSONObject jSONObjectL = c0559r2.l(i4);
                    if (jSONObjectL != null) {
                        String strOptString = jSONObjectL.optString("name", "Emby");
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                        linearLayoutK.addView(AbstractC0583w0.p(activity, strOptString + " - 登录状态", "重新鉴权或退出当前设备"));
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                        AbstractC0583w0.j(linearLayoutY, "当前状态", ((InterfaceC0545o1) c0559r2.a).getEmbyAuthStatus(jSONObjectL), AbstractC0583w0.c);
                        LinearLayout linearLayoutD = AbstractC0583w0.d(linearLayoutY, "重新验证登录", "使用当前用户名和密码重新鉴权", AbstractC0583w0.d, true);
                        LinearLayout linearLayoutD2 = AbstractC0583w0.d(linearLayoutY, "退出当前设备登录", "清除本机Token", AbstractC0583w0.e, true);
                        linearLayoutK.addView(linearLayoutY);
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).create();
                        AbstractC0583w0.j0(alertDialogCreate);
                        linearLayoutD.setOnClickListener(new B(c0559r2, jSONObjectL, 2));
                        linearLayoutD2.setOnClickListener(new M(c0559r2, jSONObjectL, strOptString, alertDialogCreate, 3));
                    }
                } catch (Exception e) {
                    b.D(e, new StringBuilder("[FishDriveDialog] showEmbyLoginDialog: "));
                    return;
                }
                break;
            case 1:
                c0559r1.getClass();
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    final JSONObject jSONObjectL2 = c0559r1.l(i4);
                    if (jSONObjectL2 != null) {
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setTitle("恢复客户端身份").setMessage("恢复Android手机版标识，并重新使用本机品牌和型号？").setPositiveButton("恢复", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.Z0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                JSONObject jSONObject = jSONObjectL2;
                                int i6 = i4;
                                C0559r1 c0559r3 = c0559r1;
                                c0559r3.getClass();
                                try {
                                    JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                                    C0559r1.q("Android Mobile/3.3.67", "Android Mobile", "3.3.67", "", jSONObject2);
                                    ((InterfaceC0545o1) c0559r3.a).updateDrive(i6, jSONObject2);
                                    X0.a("客户端身份已恢复默认");
                                    c0559r3.p();
                                } catch (Exception unused) {
                                    X0.a("恢复失败");
                                }
                            }
                        }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    }
                } catch (Exception unused) {
                    X0.a("显示恢复确认失败");
                    return;
                }
                break;
            case 2:
                c0559r1.getClass();
                InitOrigin.run(new T0(c0559r1, i4, i2));
                break;
            case 3:
                c0559r1.getClass();
                try {
                    Activity activity3 = InitOrigin.getActivity();
                    JSONObject jSONObjectL3 = c0559r1.l(i4);
                    if (jSONObjectL3 != null) {
                        C0559r1.s(activity3, jSONObjectL3.optString("embyUA", "Android Mobile/3.3.67"), jSONObjectL3.optString("embyClient", "Android Mobile"), jSONObjectL3.optString("embyVersion", "3.3.67"), jSONObjectL3.optString("embyDevice", ""), new InterfaceC0550p1() { // from class: com.github.catvod.spider.merge.z.a1
                            @Override // com.github.catvod.spider.merge.p022z.InterfaceC0550p1
                            public final void a(String[] strArr) {
                                C0559r1 c0559r3 = c0559r1;
                                int i5 = i4;
                                JSONObject jSONObjectL4 = c0559r3.l(i5);
                                if (jSONObjectL4 == null) {
                                    return;
                                }
                                try {
                                    JSONObject jSONObject = new JSONObject(jSONObjectL4.toString());
                                    C0559r1.q(strArr[3], strArr[1], strArr[2], strArr[4], jSONObject);
                                    ((InterfaceC0545o1) c0559r3.a).updateDrive(i5, jSONObject);
                                    X0.a("已应用: " + strArr[0]);
                                    c0559r3.p();
                                } catch (Exception unused2) {
                                    X0.a("应用失败");
                                }
                            }
                        });
                    }
                } catch (Exception unused2) {
                    X0.a("显示客户端预设失败");
                    return;
                }
                break;
            case 4:
                c0559r1.getClass();
                InitOrigin.run(new T0(c0559r1, i4, 9));
                break;
            case 5:
                JSONObject jSONObjectL4 = c0559r1.l(i4);
                if (jSONObjectL4 != null) {
                    P1.K0(jSONObjectL4.optString("name", "Emby") + " - 客户端身份", "选择预设，或手动编辑详细参数", new String[]{"常见客户端预设", "详细参数", "恢复默认"}, new String[]{C0559r1.k(jSONObjectL4), "UA、Client、Version、Device", "恢复Android手机版和本机型号"}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d, AbstractC0583w0.f}, new Runnable[]{new T0(c0559r1, i4, 6), new T0(c0559r1, i4, 7), new T0(c0559r1, i4, 8)});
                    break;
                }
                break;
            case 6:
                c0559r1.getClass();
                InitOrigin.run(new T0(c0559r1, i4, i));
                break;
            case 7:
                c0559r1.getClass();
                InitOrigin.run(new f(c0559r1, i4, String.valueOf(System.currentTimeMillis()), i));
                break;
            case 8:
                c0559r1.getClass();
                InitOrigin.run(new T0(c0559r1, i4, i3));
                break;
            default:
                c0559r1.getClass();
                try {
                    Activity activity4 = InitOrigin.getActivity();
                    final JSONObject jSONObjectL5 = c0559r1.l(i4);
                    if (jSONObjectL5 != null) {
                        final boolean[] zArr = {!jSONObjectL5.optBoolean("embyInsecureTls", false)};
                        LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity4);
                        linearLayoutK2.addView(AbstractC0583w0.p(activity4, jSONObjectL5.optString("name", "Emby") + " - HTTPS 连接", "默认严格校验证书，自签名服务器可关闭"));
                        LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity4);
                        boolean z = zArr[0];
                        AbstractC0583w0.m(linearLayoutY2, "HTTPS证书校验", z ? "严格校验，推荐" : "允许自签名证书", AbstractC0583w0.c, z, 0, false, null, zArr, null);
                        linearLayoutK2.addView(linearLayoutY2);
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity4).setView(linearLayoutK2).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.W0
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                JSONObject jSONObject = jSONObjectL5;
                                boolean[] zArr2 = zArr;
                                int i6 = i4;
                                C0559r1 c0559r3 = c0559r1;
                                c0559r3.getClass();
                                try {
                                    JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                                    if (zArr2[0]) {
                                        jSONObject2.remove("embyInsecureTls");
                                    } else {
                                        jSONObject2.put("embyInsecureTls", true);
                                    }
                                    ((InterfaceC0545o1) c0559r3.a).updateDrive(i6, jSONObject2);
                                    X0.a("HTTPS连接设置已保存");
                                    c0559r3.p();
                                } catch (Exception unused3) {
                                    X0.a("保存失败");
                                }
                            }
                        }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    }
                } catch (Exception e2) {
                    b.D(e2, new StringBuilder("[FishDriveDialog] showEmbyTlsDialog: "));
                }
                break;
        }
    }
}
