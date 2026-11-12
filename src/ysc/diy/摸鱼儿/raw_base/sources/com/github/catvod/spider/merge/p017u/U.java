package com.github.catvod.spider.merge.p017u;

import android.text.TextUtils;
import com.github.catvod.spider.WoNiu;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class U implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WoNiu b;

    public /* synthetic */ U(WoNiu woNiu, int i) {
        this.a = i;
        this.b = woNiu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strOptString;
        WoNiu woNiu = this.b;
        switch (this.a) {
            case 0:
                Pattern pattern = WoNiu.v;
                woNiu.y();
                break;
            default:
                Pattern pattern2 = WoNiu.v;
                woNiu.getClass();
                try {
                    HashMap mapR = woNiu.r();
                    mapR.put("Referer", woNiu.r + "/user/checkin.html");
                    mapR.put("Origin", woNiu.r);
                    mapR.put("X-Requested-With", "XMLHttpRequest");
                    mapR.put("Accept", "application/json, text/javascript, */*; q=0.01");
                    JSONObject jSONObject = new JSONObject(X1.N(woNiu.r + "/user/checkin.html", Collections.emptyMap(), mapR).a());
                    int iOptInt = jSONObject.optInt("code", -1);
                    if (iOptInt == 1) {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("info");
                        String str = "";
                        String strOptString2 = jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString("points", "");
                        StringBuilder sb = new StringBuilder("蜗牛签到成功");
                        if (!TextUtils.isEmpty(strOptString2)) {
                            str = "，获得 " + strOptString2 + " 积分";
                        }
                        sb.append(str);
                        X0.a(sb.toString());
                        break;
                    } else if (iOptInt != 1001 && (strOptString = jSONObject.optString("msg")) != null) {
                        if (strOptString.contains("登录") || strOptString.contains("登陆") || strOptString.contains("会话")) {
                            WoNiu.clearCookie();
                            woNiu.s = false;
                            woNiu.x();
                        }
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
