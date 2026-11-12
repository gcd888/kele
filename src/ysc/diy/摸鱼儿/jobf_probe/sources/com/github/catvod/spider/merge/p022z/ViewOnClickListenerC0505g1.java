package com.github.catvod.spider.merge.p022z;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class ViewOnClickListenerC0505g1 implements View.OnClickListener {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ TextView e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ EditText g;
    public final /* synthetic */ EditText h;
    public final /* synthetic */ EditText i;
    public final /* synthetic */ EditText j;
    public final /* synthetic */ C0559r1 k;

    public ViewOnClickListenerC0505g1(C0559r1 c0559r1, EditText editText, EditText editText2, EditText editText3, TextView textView, TextView textView2, boolean z, EditText editText4, EditText editText5, EditText editText6, EditText editText7) {
        this.k = c0559r1;
        this.a = editText;
        this.b = editText2;
        this.c = editText3;
        this.d = textView;
        this.e = textView2;
        this.f = z;
        this.g = editText4;
        this.h = editText5;
        this.i = editText6;
        this.j = editText7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strE = AbstractC0449a.e(this.a);
        String strE2 = AbstractC0449a.e(this.b);
        String strE3 = AbstractC0449a.e(this.c);
        boolean zIsEmpty = strE.isEmpty();
        TextView textView = this.d;
        if (zIsEmpty) {
            textView.setText("请先填写服务器地址");
            textView.setTextColor(AbstractC0583w0.e);
            return;
        }
        textView.setText("连接中...");
        textView.setTextColor(AbstractC0583w0.i);
        TextView textView2 = this.e;
        textView2.setEnabled(false);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", this.f ? "emby" : "webdav");
            jSONObject.put("server", strE);
            jSONObject.put("user", strE2);
            jSONObject.put("pass", strE3);
            EditText editText = this.g;
            if (editText != null) {
                String strTrim = editText.getText().toString().trim();
                if (!strTrim.isEmpty()) {
                    jSONObject.put("embyUA", strTrim);
                }
            }
            EditText editText2 = this.h;
            if (editText2 != null) {
                String strTrim2 = editText2.getText().toString().trim();
                if (!strTrim2.isEmpty()) {
                    jSONObject.put("embyClient", strTrim2);
                }
            }
            EditText editText3 = this.i;
            if (editText3 != null) {
                String strTrim3 = editText3.getText().toString().trim();
                if (!strTrim3.isEmpty()) {
                    jSONObject.put("embyVersion", strTrim3);
                }
            }
            EditText editText4 = this.j;
            if (editText4 != null) {
                String strTrim4 = editText4.getText().toString().trim();
                if (!strTrim4.isEmpty()) {
                    jSONObject.put("embyDevice", strTrim4);
                }
            }
            ((InterfaceC0545o1) this.k.a).testConnection(jSONObject, new X1(13, this));
        } catch (Exception e) {
            textView2.setEnabled(true);
            textView.setText("测试异常: " + e.getMessage());
            textView.setTextColor(AbstractC0583w0.e);
        }
    }
}
