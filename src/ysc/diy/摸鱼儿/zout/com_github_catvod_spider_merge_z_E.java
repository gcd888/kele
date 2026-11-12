package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0246c0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.p017u.RunnableC0466s;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0493e implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ C0538n b;
    public final /* synthetic */ i c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ RunnableC0493e(C0538n c0538n, i iVar, String str, String str2) {
        this.b = c0538n;
        this.c = iVar;
        this.d = str;
        this.e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        JSONArray jSONArrayOptJSONArray;
        switch (this.a) {
            case 0:
                C0538n c0538n = this.b;
                c0538n.getClass();
                StringBuilder sb = new StringBuilder("正在加载 ");
                String str = this.d;
                sb.append(str);
                sb.append(" 分类...");
                X0.a(sb.toString());
                InitOrigin.execute(new RunnableC0493e(c0538n, this.c, this.e, str));
                break;
            default:
                String str2 = this.d;
                C0538n c0538n2 = this.b;
                c0538n2.getClass();
                i iVar = this.c;
                C0246c0 c0246c0 = (C0246c0) iVar.b;
                c0246c0.getClass();
                try {
                    X1 x1 = (X1) c0246c0.a;
                    JSONObject jSONObjectX = x1.x(x1.m("/categories?site=" + str2));
                    jSONArrayOptJSONArray = jSONObjectX != null ? jSONObjectX.optJSONArray("data") : new JSONArray();
                    break;
                } catch (Exception unused) {
                }
                InitOrigin.run(new RunnableC0466s((Object) c0538n2, (Serializable) str2, (Object) this.e, (Object) jSONArrayOptJSONArray, (Object) iVar, 4));
                break;
        }
    }

    public /* synthetic */ RunnableC0493e(C0538n c0538n, String str, i iVar, String str2) {
        this.b = c0538n;
        this.d = str;
        this.c = iVar;
        this.e = str2;
    }
}
