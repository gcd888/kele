package com.github.catvod.spider.merge.p017u;

import android.app.AlertDialog;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.HonHon;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p007h.a;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.InterfaceC0600z2;
import com.github.catvod.spider.merge.p022z.J1;
import com.github.catvod.spider.merge.p022z.K1;
import com.github.catvod.spider.merge.p022z.P0;
import com.github.catvod.spider.merge.p022z.P1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0467t implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ViewOnClickListenerC0467t(K1 k1, EditText editText, int[] iArr, String str, AlertDialog alertDialog) {
        this.a = 2;
        this.c = k1;
        this.d = editText;
        this.f = iArr;
        this.e = str;
        this.b = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strOptString;
        switch (this.a) {
            case 0:
                HonHon honHon = (HonHon) this.c;
                JSONObject jSONObject = (JSONObject) this.d;
                String str = (String) this.e;
                AlertDialog[] alertDialogArr = (AlertDialog[]) this.f;
                AlertDialog alertDialog = (AlertDialog) this.b;
                String[] strArr = HonHon.h;
                synchronized (honHon) {
                    if (jSONObject == null) {
                        strOptString = "";
                    } else {
                        try {
                            strOptString = jSONObject.optString("series_id");
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!TextUtils.isEmpty(strOptString)) {
                        JSONArray jSONArrayM = HonHon.m();
                        JSONArray jSONArray = new JSONArray();
                        try {
                            jSONArray.put(new JSONObject().put("id", strOptString).put("name", jSONObject.optString("title")).put("pic", jSONObject.optString("cover")).put("remarks", str));
                            for (int i = 0; i < jSONArrayM.length() && jSONArray.length() < 20; i++) {
                                JSONObject jSONObjectOptJSONObject = jSONArrayM.optJSONObject(i);
                                if (jSONObjectOptJSONObject != null && !strOptString.equals(jSONObjectOptJSONObject.optString("id"))) {
                                    jSONArray.put(jSONObjectOptJSONObject);
                                }
                            }
                            String string = jSONArray.toString();
                            boolean z = FishCrypto.a;
                            C0297t1.j(".honhon_search_history", string);
                            AlertDialog alertDialog2 = alertDialogArr[0];
                            if (alertDialog2 != null) {
                                alertDialog2.dismiss();
                            }
                            if (alertDialog != null) {
                                alertDialog.dismiss();
                            }
                            X0.a("已加入搜索历史，请从“搜索历史”分类点开播放");
                            return;
                        } catch (Exception unused) {
                        }
                    }
                    X0.a("保存搜索历史失败");
                    return;
                }
            case 1:
                EditText editText = (EditText) this.d;
                EditText editText2 = (EditText) this.e;
                a aVar = (a) this.f;
                AlertDialog alertDialog3 = (AlertDialog) this.b;
                X1 x1 = (X1) this.c;
                x1.getClass();
                try {
                    ((P0) x1.b).setEmbyManagePrefs(X1.t(aVar.a, X1.R(editText, "搜索上限"), X1.R(editText2, "每页数量"), aVar.b));
                    X0.a("数量设置已保存");
                    alertDialog3.dismiss();
                    return;
                } catch (Exception e) {
                    X0.a(e.getMessage());
                    return;
                }
            case 2:
                K1 k1 = (K1) this.c;
                k1.getClass();
                String strE = AbstractC0449a.e((EditText) this.d);
                if (strE.isEmpty()) {
                    X0.a("请输入名称");
                    return;
                }
                int[] iArr = (int[]) this.f;
                int i2 = iArr[0];
                J1 j1 = k1.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet(i2 == 0 ? j1.getChannels() : j1.getPlugins());
                linkedHashSet.add(strE);
                List customChannels = iArr[0] == 0 ? j1.getCustomChannels() : j1.getCustomPlugins();
                if (!customChannels.contains(strE)) {
                    customChannels.add(strE);
                }
                boolean z2 = iArr[0] == 1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(j1.getChannels());
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(j1.getPlugins());
                if (z2) {
                    linkedHashSet3 = linkedHashSet;
                    linkedHashSet = linkedHashSet2;
                }
                k1.i(linkedHashSet, linkedHashSet3);
                P1.H1((String) this.e);
                X0.a("已添加");
                ((AlertDialog) this.b).dismiss();
                return;
            case 3:
                if (((int[]) this.c)[0] != ((ArrayList) ((com.github.catvod.spider.merge.S.a) this.d).e).size() - 1) {
                    return;
                }
                AlertDialog alertDialog4 = (AlertDialog) this.b;
                try {
                    ((boolean[]) this.f)[0] = ((InterfaceC0600z2) this.e).a();
                    break;
                } catch (Throwable unused2) {
                }
                alertDialog4.dismiss();
                return;
            default:
                int[] iArr2 = (int[]) this.c;
                int i3 = iArr2[0];
                com.github.catvod.spider.merge.S.a aVar2 = (com.github.catvod.spider.merge.S.a) this.d;
                if (i3 >= ((ArrayList) aVar2.e).size() - 1) {
                    return;
                }
                iArr2[0] = iArr2[0] + 1;
                ((Runnable) this.e).run();
                AbstractC0583w0.g0((TextView) (iArr2[0] == ((ArrayList) aVar2.e).size() - 1 ? this.f : this.b));
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0467t(Object obj, Object obj2, Object obj3, Object obj4, KeyEvent.Callback callback, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = callback;
    }

    public /* synthetic */ ViewOnClickListenerC0467t(int[] iArr, com.github.catvod.spider.merge.S.a aVar, AlertDialog alertDialog, InterfaceC0600z2 interfaceC0600z2, boolean[] zArr) {
        this.a = 3;
        this.c = iArr;
        this.d = aVar;
        this.b = alertDialog;
        this.e = interfaceC0600z2;
        this.f = zArr;
    }
}
