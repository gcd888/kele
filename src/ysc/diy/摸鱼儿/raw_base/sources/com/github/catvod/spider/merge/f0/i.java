package com.github.catvod.spider.merge.f0;

import android.app.AlertDialog;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.ALLLive;
import com.github.catvod.spider.AppUn;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.CZ;
import com.github.catvod.spider.ChuXin;
import com.github.catvod.spider.FanShu;
import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.FishPs;
import com.github.catvod.spider.HonHon;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Local;
import com.github.catvod.spider.Market;
import com.github.catvod.spider.Music24bit;
import com.github.catvod.spider.PanWebShare123;
import com.github.catvod.spider.PanWebShareGuangYa;
import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.Push;
import com.github.catvod.spider.SeedHub;
import com.github.catvod.spider.Wallpaper;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.C0304w;
import com.github.catvod.spider.merge.A.InterfaceC0245c;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p000a.I;
import com.github.catvod.spider.merge.p000a.RunnableC0383v0;
import com.github.catvod.spider.merge.p022z.I0;
import com.github.catvod.spider.merge.p022z.InterfaceC0522j3;
import com.github.catvod.spider.merge.p022z.InterfaceC0577v;
import com.github.catvod.spider.merge.p022z.InterfaceC0578v0;
import com.github.catvod.spider.merge.p022z.K3;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.Q;
import com.github.catvod.spider.merge.p022z.R3;
import com.github.catvod.spider.merge.p022z.Z2;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class i implements com.github.catvod.spider.merge.h0.o, InterfaceC0245c, InterfaceC0578v0, Q, I0, InterfaceC0577v, K3, R3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.github.catvod.spider.merge.p022z.Q
    public void a(String str) {
        ((Z2) this.b).a(str);
    }

    @Override // com.github.catvod.spider.merge.p022z.R3
    public void b(boolean z) {
        ((TextView) this.b).setText("  " + P1.h0(z));
    }

    @Override // com.github.catvod.spider.merge.p022z.I0
    public void c(String str) {
        ((InterfaceC0522j3) ((X1) this.b).b).addToHistory(str);
        X0.a("已添加，请到[推送历史]点击播放");
    }

    @Override // com.github.catvod.spider.merge.h0.o
    public void d(p pVar, int i) {
        k.B(pVar, (StringBuilder) this.b);
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0245c
    public String dispatch(String str) {
        switch (this.a) {
            case 1:
                return ((ALLLive) this.b).action(str);
            case 2:
                return ((AppUn) this.b).action(str);
            case 3:
                return ((Bili) this.b).action(str);
            case 4:
                return ((CZ) this.b).action(str);
            case 5:
                return ((ChuXin) this.b).action(str);
            case 6:
                return ((FanShu) this.b).action(str);
            case 7:
                return ((FishConfig) this.b).action(str);
            case 8:
                return ((FishPs) this.b).action(str);
            case 9:
                return ((HonHon) this.b).action(str);
            case 10:
                return ((Local) this.b).action(str);
            case 11:
                return ((Market) this.b).action(str);
            case 12:
                return ((Music24bit) this.b).action(str);
            case 13:
                return ((PanWebShare123) this.b).action(str);
            case 14:
                return ((PanWebShareGuangYa) this.b).action(str);
            case 15:
                return ((PianDan) this.b).action(str);
            case 16:
                return ((Push) this.b).action(str);
            case 17:
                return ((SeedHub) this.b).action(str);
            default:
                return ((Wallpaper) this.b).action(str);
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0577v
    public void e(String str, String str2, String str3) {
        com.github.catvod.spider.merge.p010l.a aVar = (com.github.catvod.spider.merge.p010l.a) this.b;
        boolean z = (str.equals(aVar.q) && str2.equals(aVar.r) && str3.equals(aVar.s)) ? false : true;
        aVar.q = str;
        aVar.k();
        aVar.r = str2;
        aVar.k();
        aVar.s = str3;
        aVar.k();
        aVar.q();
        if (z && aVar.o) {
            P1.z0();
        }
        X0.a("AI推荐模型配置已保存");
    }

    @Override // com.github.catvod.spider.merge.h0.o
    public /* synthetic */ void f(p pVar, int i) {
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0578v0
    public void g(int i, boolean z) throws Throwable {
        com.github.catvod.spider.merge.p006g.a aVarA = com.github.catvod.spider.merge.p006g.a.a();
        if (aVarA.k()) {
            aVarA.x(false);
            C0304w c0304wX = C0304w.x();
            if (c0304wX.h) {
                try {
                    Runnable runnable = c0304wX.j;
                    if (runnable != null) {
                        c0304wX.c.removeCallbacks(runnable);
                        c0304wX.j = null;
                    }
                    c0304wX.i = 0;
                    if (c0304wX.a != null) {
                        InitOrigin.context().unregisterActivityLifecycleCallbacks(c0304wX.a);
                        c0304wX.a = null;
                    }
                    c0304wX.P();
                    c0304wX.c();
                    c0304wX.h = false;
                } catch (Exception e) {
                    com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("停止注入服务异常: "));
                }
            }
            X0.a("弹幕功能已关闭");
        } else {
            aVarA.x(true);
            I.p().getClass();
            C0299u0 c0299u0X = C0299u0.x();
            if (c0299u0X.k || !c0299u0X.N()) {
                I.p().getClass();
                if (!I.m()) {
                    SpiderDebug.log("DanmuApi: Go service not ready");
                }
            }
            C0304w.x().O();
            X0.a("弹幕功能已开启");
        }
        AlertDialog[] alertDialogArr = (AlertDialog[]) this.b;
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null && alertDialog.isShowing()) {
            alertDialogArr[0].dismiss();
        }
        InitOrigin.run(new RunnableC0383v0(4, com.github.catvod.spider.merge.p006g.a.a().k()));
    }

    @Override // com.github.catvod.spider.merge.p022z.K3
    public String h() {
        return (String) this.b;
    }

    public JSONObject i(String str) throws Exception {
        X1 x1 = (X1) this.b;
        JSONObject jSONObjectT = x1.T(str);
        String strTrim = jSONObjectT.optString("site").trim();
        String strTrim2 = jSONObjectT.optString("room_id").trim();
        String strTrim3 = jSONObjectT.optString("canonical_url").trim();
        if (strTrim3.isEmpty()) {
            throw new Exception("链接解析结果不完整");
        }
        JSONObject jSONObjectX = x1.x(x1.m("/detail?site=" + com.github.catvod.spider.merge.p018v.b.f(strTrim) + "&room_id=" + com.github.catvod.spider.merge.p018v.b.f(strTrim2)));
        JSONObject jSONObjectOptJSONObject = jSONObjectX == null ? null : jSONObjectX.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            throw new Exception("获取直播间详情失败");
        }
        JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v("site", strTrim, "room_id", strTrim2);
        jSONObjectV.put("canonical_url", strTrim3);
        jSONObjectV.put("user_name", jSONObjectOptJSONObject.optString("user_name", ""));
        jSONObjectV.put("title", jSONObjectOptJSONObject.optString("title", ""));
        jSONObjectV.put("cover", com.github.catvod.spider.merge.p018v.b.k(jSONObjectOptJSONObject));
        jSONObjectV.put("status", jSONObjectOptJSONObject.optBoolean("status", false));
        return jSONObjectV;
    }
}
