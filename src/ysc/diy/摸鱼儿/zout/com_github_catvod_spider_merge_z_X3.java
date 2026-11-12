package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.D.b;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0591x3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ AlertDialog b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0591x3(AlertDialog alertDialog, AlertDialog[] alertDialogArr, JSONObject jSONObject, boolean z) {
        this.b = alertDialog;
        this.d = alertDialogArr;
        this.e = jSONObject;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AlertDialog alertDialog = ((AlertDialog[]) this.d)[0];
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity != null) {
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObject = (JSONObject) this.e;
                        String strOptString = jSONObject.optString("original_name");
                        if (!strOptString.isEmpty() && !strOptString.equals(jSONObject.optString("name"))) {
                            arrayList.add(new String[]{"原名", strOptString});
                        }
                        String strOptString2 = jSONObject.optString("first_air_date");
                        if (strOptString2.isEmpty()) {
                            strOptString2 = "未知";
                        }
                        arrayList.add(new String[]{"首播", strOptString2});
                        String strB = P1.B(jSONObject);
                        String strOptString3 = jSONObject.optString("original_language");
                        String displayLanguage = strOptString3.isEmpty() ? "" : new Locale(strOptString3).getDisplayLanguage(Locale.CHINA);
                        if (!displayLanguage.isEmpty()) {
                            strOptString3 = displayLanguage;
                        }
                        if (!strB.isEmpty()) {
                            if (!strOptString3.isEmpty()) {
                                strB = b.C(strB, " · ", strOptString3);
                            }
                            strOptString3 = strB;
                        }
                        if (!strOptString3.isEmpty()) {
                            arrayList.add(new String[]{"国家/语言", strOptString3});
                        }
                        double dOptDouble = jSONObject.optDouble("vote_average");
                        if (dOptDouble > 0.0d) {
                            arrayList.add(new String[]{"评分", String.format(Locale.US, "%.1f", Double.valueOf(dOptDouble))});
                        }
                        arrayList.add(new String[]{"TMDB ID", String.valueOf(jSONObject.optInt("id"))});
                        String strOptString4 = jSONObject.optString("overview");
                        if (!strOptString4.isEmpty()) {
                            arrayList.add(new String[]{"简介", P1.E(260, strOptString4)});
                        }
                        boolean z = this.c;
                        String[] strArr = z ? new String[]{"已订阅"} : new String[]{"确认追更", "返回"};
                        Runnable[] runnableArr = z ? new Runnable[]{null} : new Runnable[]{new RunnableC0596y3(this.b, alertDialog, jSONObject), null};
                        String strOptString5 = jSONObject.optString("name", "剧集详情");
                        String str = z ? "该剧集已在追更中" : "确认是你要追更的剧集";
                        int i = z ? AbstractC0583w0.d : -16732991;
                        String[][] strArr2 = (String[][]) arrayList.toArray(new String[0][]);
                        if (z) {
                            int i2 = AbstractC0583w0.a;
                        } else {
                            int i3 = AbstractC0583w0.a;
                            int i4 = AbstractC0583w0.a;
                        }
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity, strOptString5, str, i, strArr2, null, strArr, runnableArr));
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                Q3 q3 = (Q3) this.d;
                AlertDialog alertDialog2 = this.b;
                R3 r3 = (R3) this.e;
                boolean z2 = this.c;
                if (!q3.b && alertDialog2.isShowing()) {
                    if (q3.a()) {
                        r3.b(z2);
                    }
                    q3.a.postDelayed(q3, 2000L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0591x3(Q3 q3, AlertDialog alertDialog, R3 r3, boolean z) {
        this.d = q3;
        this.b = alertDialog;
        this.e = r3;
        this.c = z;
    }
}
