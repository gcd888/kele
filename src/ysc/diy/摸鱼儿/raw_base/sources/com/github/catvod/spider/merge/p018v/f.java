package com.github.catvod.spider.merge.p018v;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0251e;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.S.e;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0559r1;
import com.github.catvod.spider.merge.p022z.C0568t0;
import com.github.catvod.spider.merge.p022z.O;
import com.github.catvod.spider.merge.p022z.P;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.Z;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ f(View view, Exception exc, int i) {
        this.a = 1;
        this.c = view;
        this.d = exc;
        this.b = i;
    }

    private final void a() {
        e eVar = (e) this.c;
        int i = this.b;
        String str = (String) this.d;
        synchronized (eVar) {
            try {
                if (i == eVar.a) {
                    X0.a(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    @Override // java.lang.Runnable
    public final void run() {
        JSONArray jSONArrayI;
        boolean zV;
        String strB;
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                View view = (View) this.c;
                if (view.isAttachedToWindow()) {
                    view.setEnabled(true);
                    P1.s1(this.b, 0L, ((Exception) this.d).getMessage(), false);
                    return;
                }
                return;
            case 2:
                ((C0568t0) this.c).a(this.b, (String) this.d);
                return;
            case 3:
                final int i = this.b;
                final String str = (String) this.d;
                final C0559r1 c0559r1 = (C0559r1) this.c;
                c0559r1.getClass();
                try {
                    Activity activity = InitOrigin.getActivity();
                    final JSONObject jSONObjectL = c0559r1.l(i);
                    if (jSONObjectL == null) {
                        return;
                    }
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                    linearLayoutK.addView(AbstractC0583w0.p(activity, jSONObjectL.optString("name", "Emby") + " - 详细参数", "一般无需修改，客户端预设会自动填写"));
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                    AbstractC0583w0.g(linearLayoutY, "User-Agent");
                    final EditText editTextE = AbstractC0583w0.e(linearLayoutY, "Android Mobile/3.3.67", jSONObjectL.optString("embyUA", "Android Mobile/3.3.67"), false);
                    AbstractC0583w0.g(linearLayoutY, "客户端名称 (Client)");
                    final EditText editTextE2 = AbstractC0583w0.e(linearLayoutY, "Android Mobile", jSONObjectL.optString("embyClient", "Android Mobile"), false);
                    AbstractC0583w0.g(linearLayoutY, "客户端版本 (Version)");
                    final EditText editTextE3 = AbstractC0583w0.e(linearLayoutY, "3.3.67", jSONObjectL.optString("embyVersion", "3.3.67"), false);
                    AbstractC0583w0.g(linearLayoutY, "设备名称 (Device)");
                    final EditText editTextE4 = AbstractC0583w0.e(linearLayoutY, "留空使用本机品牌和型号", jSONObjectL.optString("embyDevice", ""), false);
                    linearLayoutK.addView(linearLayoutY);
                    P1.w(str, new String[]{"embyUA", "embyClient", "embyVersion", "embyDevice"}, new EditText[]{editTextE, editTextE2, editTextE3, editTextE4}, null);
                    final AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", (DialogInterface.OnClickListener) null).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).setOnCancelListener(new O(str, 2)).create();
                    AbstractC0583w0.j0(alertDialogCreate);
                    alertDialogCreate.getButton(-3).setOnClickListener(new Z(str, 2));
                    alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.X0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            JSONObject jSONObject = jSONObjectL;
                            EditText editText = editTextE;
                            EditText editText2 = editTextE2;
                            EditText editText3 = editTextE3;
                            EditText editText4 = editTextE4;
                            int i2 = i;
                            String str2 = str;
                            AlertDialog alertDialog = alertDialogCreate;
                            C0559r1 c0559r2 = c0559r1;
                            c0559r2.getClass();
                            try {
                                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                                C0559r1.q(editText.getText().toString().trim(), editText2.getText().toString().trim(), editText3.getText().toString().trim(), editText4.getText().toString().trim(), jSONObject2);
                                ((InterfaceC0545o1) c0559r2.a).updateDrive(i2, jSONObject2);
                                com.github.catvod.spider.merge.A.X0.a("客户端身份已保存");
                                P1.H1(str2);
                                alertDialog.dismiss();
                                c0559r2.p();
                            } catch (Exception unused) {
                                com.github.catvod.spider.merge.A.X0.a("保存失败");
                            }
                        }
                    });
                    alertDialogCreate.getButton(-2).setOnClickListener(new P(str, alertDialogCreate, 1));
                    return;
                } catch (Exception e) {
                    b.D(e, new StringBuilder("[FishDriveDialog] showEmbyIdentityDetailDialog: "));
                    return;
                }
            default:
                int i2 = this.b;
                String str2 = (String) this.d;
                Runnable runnable = (Runnable) this.c;
                if (i2 > 0) {
                    synchronized (AbstractC0251e.a) {
                        JSONObject jSONObjectH = AbstractC0251e.H();
                        JSONArray jSONArrayOptJSONArray = jSONObjectH.optJSONArray("follows");
                        if (i2 <= 0) {
                            jSONArrayI = AbstractC0251e.i(jSONArrayOptJSONArray);
                        } else {
                            JSONArray jSONArray = new JSONArray();
                            for (int i3 = 0; jSONArrayOptJSONArray != null && i3 < jSONArrayOptJSONArray.length(); i3++) {
                                Object objOpt = jSONArrayOptJSONArray.opt(i3);
                                JSONObject jSONObject = objOpt instanceof JSONObject ? (JSONObject) objOpt : null;
                                if (jSONObject == null || jSONObject.optInt("tmdbId") != i2) {
                                    if (jSONObject != null) {
                                        objOpt = AbstractC0251e.j(jSONObject);
                                    }
                                    jSONArray.put(objOpt);
                                }
                            }
                            jSONArrayI = jSONArray;
                        }
                        if (jSONArrayI.length() != jSONArrayOptJSONArray.length()) {
                            try {
                                jSONObjectH.put("follows", jSONArrayI);
                                zV = AbstractC0251e.V(jSONObjectH);
                            } catch (Exception unused) {
                                zV = false;
                            }
                        }
                    }
                    if (zV) {
                        strB = b.B("已移除 ", str2);
                    } else {
                        strB = "移除失败";
                    }
                    X0.a(strB);
                    if (zV || runnable == null) {
                        return;
                    }
                    runnable.run();
                    return;
                }
                Object obj = AbstractC0251e.a;
                zV = false;
                if (zV) {
                    strB = b.B("已移除 ", str2);
                } else {
                    strB = "移除失败";
                }
                X0.a(strB);
                if (zV) {
                    return;
                } else {
                    return;
                }
        }
    }

    public /* synthetic */ f(Object obj, int i, String str, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = str;
    }

    public /* synthetic */ f(Runnable runnable, String str, int i) {
        this.a = 4;
        this.b = i;
        this.d = str;
        this.c = runnable;
    }
}
