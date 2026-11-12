package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.CZ;
import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p000a.C0;
import com.github.catvod.spider.merge.p000a.C0377s0;
import com.github.catvod.spider.merge.p000a.I0;
import com.github.catvod.spider.merge.p000a.L0;
import com.github.catvod.spider.merge.p000a.RunnableC0346c0;
import com.github.catvod.spider.merge.p000a.RunnableC0383v0;
import com.github.catvod.spider.merge.p000a.t1;
import com.github.catvod.spider.merge.p019w.a;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class O2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ O2(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.a) {
            case 0:
                I0 i0J = L0.q().J(this.b, this.c);
                int i = i0J.a;
                if (i == 0) {
                    InitOrigin.run(new P2(2));
                } else if (i != 1) {
                    InitOrigin.run(new C0(i0J, 1));
                } else {
                    InitOrigin.run(new a(i0J.c, 10));
                }
                break;
            case 1:
                try {
                    C0377s0.u.a(this.b, this.c);
                    InitOrigin.run(new P2(4));
                } catch (Exception e) {
                    InitOrigin.run(new RunnableC0346c0(e, 2));
                    return;
                }
                break;
            case 2:
                InitOrigin.run(new RunnableC0383v0(6, CZ.loginWithCredentials(this.b, this.c)));
                break;
            case 3:
                boolean zK = t1.u().K(this.b, this.c);
                FishConfig.refreshStatus("yidong");
                InitOrigin.run(new RunnableC0383v0(8, zK));
                break;
            case 4:
                String str = this.b;
                try {
                    HashMap map = new HashMap();
                    map.put("Accept", "application/json");
                    map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
                    map.put("Authorization", "Bearer " + str);
                    StringBuilder sb = new StringBuilder();
                    String strSubstring = this.c;
                    while (strSubstring.endsWith("/")) {
                        strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    }
                    sb.append(strSubstring);
                    sb.append("/configuration");
                    InitOrigin.run(new a(new JSONObject(X1.X(sb.toString(), null, map)).optJSONObject("images") != null ? "TMDB 连接正常" : "TMDB 返回异常", 14));
                } catch (Exception e2) {
                    InitOrigin.run(new RunnableC0346c0(e2, 3));
                    return;
                }
                break;
            default:
                C0299u0.L0(this.b);
                X0.a(this.c + " 已恢复默认线程");
                break;
        }
    }
}
