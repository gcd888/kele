package com.github.catvod.spider.merge.A;

import android.widget.TextView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0305w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0305w0(com.github.catvod.spider.merge.p000a.A a, long j, String str) {
        this.a = 1;
        this.d = a;
        this.b = j;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((C0239a) this.d).getClass();
                    C0299u0 c0299u0X = C0299u0.x();
                    c0299u0X.getClass();
                    String str = this.c;
                    if (str != null && str.matches("[0-9a-f]{32}")) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("action", "close");
                        jSONObject.put("session_id", str);
                        c0299u0X.R(jSONObject);
                    }
                } catch (Throwable th) {
                    AbstractC0302v0.H("close_failed", th, 0L, this.b, true, true);
                    return;
                }
                break;
            case 1:
                if (this.b == ((com.github.catvod.spider.merge.p000a.A) this.d).m.get()) {
                    X0.a(this.c);
                }
                break;
            default:
                TextView textView = (TextView) ((Map) this.d).get(this.c);
                if (textView != null) {
                    com.github.catvod.spider.merge.p022z.W1.b(textView, this.b);
                    textView.setVisibility(0);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0305w0(Object obj, String str, long j, int i) {
        this.a = i;
        this.d = obj;
        this.c = str;
        this.b = j;
    }
}
