package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.text.TextUtils;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p019w.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class Q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;

    public /* synthetic */ Q1(int i, String str, HashMap map) {
        this.a = i;
        this.b = str;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strG;
        int i = 7;
        int i2 = 1;
        Activity activity = null;
        switch (this.a) {
            case 0:
                String str = this.b;
                Map map = this.c;
                try {
                    activity = InitOrigin.getActivity();
                    break;
                } catch (Exception unused) {
                }
                if (activity == null) {
                    P1.V("请在应用界面中操作");
                } else {
                    X0.a("帮助加载中...");
                    try {
                        InitOrigin.execute(new Q1(i2, str, (HashMap) map));
                    } catch (Throwable unused2) {
                        P1.V("帮助加载失败");
                        return;
                    }
                }
                break;
            default:
                String str2 = this.b;
                Map map2 = this.c;
                try {
                    boolean z = FishCrypto.a;
                    String[] strArr = N1.t;
                    int length = strArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            String str3 = strArr[i3];
                            if (TextUtils.isEmpty(str3)) {
                                strG = null;
                            } else {
                                try {
                                    String strX = X1.X(str3, null, null);
                                    if (!TextUtils.isEmpty(strX)) {
                                        strG = FishCrypto.g(strX.trim());
                                        if (TextUtils.isEmpty(strG) || !strG.startsWith("{")) {
                                        }
                                    }
                                } catch (Exception unused3) {
                                }
                                strG = null;
                            }
                            if (strG == null) {
                                i3++;
                            }
                        } else {
                            strG = "";
                        }
                    }
                    if (!TextUtils.isEmpty(strG)) {
                        JSONObject jSONObjectOptJSONObject = new JSONObject(strG).optJSONObject(str2);
                        if (jSONObjectOptJSONObject != null) {
                            InitOrigin.run(new RunnableC0242b(jSONObjectOptJSONObject, (HashMap) map2, 21));
                        } else {
                            InitOrigin.run(new a(str2, i));
                        }
                    } else {
                        InitOrigin.run(new S(i));
                    }
                } catch (Throwable unused4) {
                    InitOrigin.run(new S(8));
                }
                break;
        }
    }
}
