package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.H0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class ViewOnClickListenerC0525k1 implements View.OnClickListener {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ EditText d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ JSONObject h;
    public final /* synthetic */ String i;
    public final /* synthetic */ EditText j;
    public final /* synthetic */ EditText k;
    public final /* synthetic */ EditText l;
    public final /* synthetic */ EditText m;
    public final /* synthetic */ String n;
    public final /* synthetic */ AlertDialog o;
    public final /* synthetic */ C0559r1 p;

    public ViewOnClickListenerC0525k1(C0559r1 c0559r1, EditText editText, EditText editText2, EditText editText3, EditText editText4, boolean z, int i, boolean z2, JSONObject jSONObject, String str, EditText editText5, EditText editText6, EditText editText7, EditText editText8, String str2, AlertDialog alertDialog) {
        this.p = c0559r1;
        this.a = editText;
        this.b = editText2;
        this.c = editText3;
        this.d = editText4;
        this.e = z;
        this.f = i;
        this.g = z2;
        this.h = jSONObject;
        this.i = str;
        this.j = editText5;
        this.k = editText6;
        this.l = editText7;
        this.m = editText8;
        this.n = str2;
        this.o = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        JSONObject jSONObject;
        String strE = AbstractC0449a.e(this.a);
        String strE2 = AbstractC0449a.e(this.b);
        String strE3 = AbstractC0449a.e(this.c);
        String strE4 = AbstractC0449a.e(this.d);
        if (strE.isEmpty()) {
            X0.a("请输入名称");
            return;
        }
        if (strE2.isEmpty()) {
            X0.a("请输入服务器地址");
            return;
        }
        if (strE3.isEmpty() && this.e) {
            X0.a("Emby用户名不能为空");
            return;
        }
        C0559r1 c0559r1 = this.p;
        List drives = ((InterfaceC0545o1) c0559r1.a).getDrives();
        int i = 0;
        while (true) {
            int size = drives.size();
            int i2 = this.f;
            if (i >= size) {
                boolean z = this.g;
                try {
                    JSONObject jSONObject2 = (!z || (jSONObject = this.h) == null) ? new JSONObject() : new JSONObject(jSONObject.toString());
                    jSONObject2.put("type", this.i);
                    jSONObject2.put("name", strE);
                    jSONObject2.put("server", strE2);
                    jSONObject2.put("user", strE3);
                    jSONObject2.put("pass", strE4);
                    EditText editText = this.j;
                    if (editText != null) {
                        C0559r1.q(editText.getText().toString().trim(), this.k.getText().toString().trim(), this.l.getText().toString().trim(), this.m.getText().toString().trim(), jSONObject2);
                    }
                    InterfaceC0545o1 interfaceC0545o1 = (InterfaceC0545o1) c0559r1.a;
                    if (z) {
                        interfaceC0545o1.updateDrive(i2, jSONObject2);
                        X0.a("已更新: " + strE);
                    } else {
                        interfaceC0545o1.addDrive(jSONObject2);
                        X0.a("已添加: " + strE);
                    }
                } catch (Exception e) {
                    SpiderDebug.log("[FishDriveDialog] save: " + e.getMessage());
                    X0.a("保存失败");
                }
                H0.a.getClass();
                H0.k(this.n);
                this.o.dismiss();
                if (z) {
                    c0559r1.t(false);
                    return;
                }
                return;
            }
            if (i != i2 && strE.equals(((JSONObject) drives.get(i)).optString("name", ""))) {
                X0.a("名称已存在，请使用其他名称");
                return;
            }
            i++;
        }
    }
}
