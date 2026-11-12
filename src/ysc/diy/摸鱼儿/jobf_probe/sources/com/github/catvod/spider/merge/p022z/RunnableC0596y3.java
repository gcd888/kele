package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.merge.A.RunnableC0271k1;
import com.github.catvod.spider.merge.A.X0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0596y3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ AlertDialog c;
    public final /* synthetic */ AlertDialog d;

    public /* synthetic */ RunnableC0596y3(AlertDialog alertDialog, AlertDialog alertDialog2, JSONObject jSONObject) {
        this.c = alertDialog;
        this.d = alertDialog2;
        this.b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("正在添加 ");
                JSONObject jSONObject = this.b;
                sb.append(jSONObject.optString("name"));
                sb.append("...");
                X0.a(sb.toString());
                InitOrigin.execute(new RunnableC0596y3(jSONObject, this.d, this.c));
                break;
            default:
                InitOrigin.run(new RunnableC0271k1(PianDan.addFollow(this.b), this.c, this.d));
                break;
        }
    }

    public /* synthetic */ RunnableC0596y3(JSONObject jSONObject, AlertDialog alertDialog, AlertDialog alertDialog2) {
        this.b = jSONObject;
        this.c = alertDialog;
        this.d = alertDialog2;
    }
}
