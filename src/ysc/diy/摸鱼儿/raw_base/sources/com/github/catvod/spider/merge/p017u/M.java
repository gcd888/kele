package com.github.catvod.spider.merge.p017u;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.merge.A.AbstractC0251e;
import com.github.catvod.spider.merge.A.AbstractC0303v1;
import com.github.catvod.spider.merge.A.P0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p000a.C0359j;
import com.github.catvod.spider.merge.p005f.b;
import com.github.catvod.spider.merge.p010l.a;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0568t0;
import com.github.catvod.spider.merge.p022z.DialogInterfaceOnClickListenerC0503g;
import com.github.catvod.spider.merge.p022z.K1;
import com.github.catvod.spider.merge.p022z.P1;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class M implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ M(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x028b A[Catch: all -> 0x01ce, Exception -> 0x0288, TryCatch #3 {Exception -> 0x0288, blocks: (B:88:0x0271, B:90:0x027d, B:94:0x0290, B:98:0x029f, B:101:0x02b1, B:104:0x02d0, B:106:0x02d6, B:109:0x02dd, B:113:0x02e5, B:115:0x02fb, B:117:0x0301, B:120:0x0308, B:124:0x0310, B:127:0x0315, B:128:0x031c, B:129:0x031d, B:103:0x02b7, B:93:0x028b), top: B:149:0x0271, outer: #4 }] */
    @Override // java.lang.Runnable
    public final void run() {
        JSONArray jSONArrayI;
        JSONObject jSONObjectOptJSONObject;
        int i = 8;
        int i2 = 4;
        int i3 = 0;
        int i4 = 1;
        switch (this.a) {
            case 0:
                PianDan pianDan = (PianDan) this.c;
                int i5 = this.b;
                HashMap map = PianDan.c;
                pianDan.getClass();
                synchronized (PianDan.h) {
                    try {
                        AtomicInteger atomicInteger = PianDan.g;
                        if (i5 != atomicInteger.get()) {
                            return;
                        }
                        a aVarI = a.i();
                        if (aVarI.o && aVarI.f() && AbstractC0251e.p()) {
                            pianDan.a = aVarI;
                            JSONObject jSONObjectO = AbstractC0251e.O();
                            JSONObject jSONObjectM = AbstractC0251e.m();
                            String strC = PianDan.c(aVarI, jSONObjectO, jSONObjectM.optInt("refreshGeneration"));
                            String strD = PianDan.d(aVarI);
                            boolean zEquals = strC.equals(jSONObjectM.optString("requestKey"));
                            JSONArray jSONArrayOptJSONArray = jSONObjectM.optJSONArray("resolvedItems");
                            if (!zEquals || !strD.equals(jSONObjectM.optString("resolvedSource")) || jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONObjectM.optJSONObject("profile")) == null || jSONObjectOptJSONObject.length() <= 0 || jSONObjectM.optBoolean("stale")) {
                                if (zEquals && strD.equals(jSONObjectM.optString("failureSource")) && "failed".equals(jSONObjectM.optString("status")) && System.currentTimeMillis() - jSONObjectM.optLong("failureAt") < 1800000) {
                                    return;
                                }
                                if (zEquals) {
                                    try {
                                        if (strC.equals(jSONObjectM.optString("rawRequestKey"))) {
                                            jSONArrayI = PianDan.i(jSONObjectM.optJSONArray("rawItems"));
                                        } else {
                                            jSONArrayI = new JSONArray();
                                        }
                                    } catch (Exception e) {
                                        AbstractC0251e.v(strC, strD, e.getMessage());
                                    }
                                } else {
                                    jSONArrayI = new JSONArray();
                                }
                                JSONObject jSONObjectOptJSONObject2 = jSONObjectM.optJSONObject("pendingProfile");
                                if (AbstractC0251e.u(strC)) {
                                    InitOrigin.run(new com.github.catvod.spider.merge.p019w.a(strC, 15));
                                    if (jSONArrayI.length() == 0 || jSONObjectOptJSONObject2 == null || jSONObjectOptJSONObject2.length() == 0) {
                                        JSONObject jSONObjectD = AbstractC0303v1.d(aVarI, jSONObjectO, new C0359j(i));
                                        jSONArrayI = PianDan.i(jSONObjectD.optJSONArray("items"));
                                        jSONObjectOptJSONObject2 = jSONObjectD.optJSONObject("profile");
                                    }
                                    if (i5 == atomicInteger.get() && PianDan.z(strC, strD)) {
                                        if (AbstractC0251e.M(strC, jSONArrayI, jSONObjectOptJSONObject2)) {
                                            InitOrigin.run(new M(72, "正在验证推荐作品...", i2));
                                            JSONArray jSONArrayP = pianDan.P(jSONArrayI, aVarI);
                                            if (jSONArrayP.length() == 0) {
                                                throw new Exception("没有验证到可用作品");
                                            }
                                            if (i5 == atomicInteger.get() && PianDan.z(strC, strD)) {
                                                if (!AbstractC0251e.N(strC, strD, jSONArrayP)) {
                                                    return;
                                                }
                                                return;
                                            }
                                            AbstractC0251e.e(strC);
                                            return;
                                        }
                                        return;
                                    }
                                    AbstractC0251e.e(strC);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 1:
                b bVar = (b) this.c;
                try {
                    Application applicationContext = InitOrigin.context();
                    int iQ = AbstractC0583w0.Q(8, applicationContext);
                    LinearLayout linearLayoutK = AbstractC0583w0.K(applicationContext);
                    int i6 = this.b;
                    String str = i6 == 0 ? "搜索模式" : "观影模式";
                    LinearLayout linearLayoutO = AbstractC0583w0.O(applicationContext, "浏览模式", "当前: ".concat(str), str, i6 == 0 ? -16735786 : -363880);
                    linearLayoutO.setLayoutParams(AbstractC0583w0.c0(iQ));
                    linearLayoutK.addView(linearLayoutO);
                    int[] iArr = {i6};
                    linearLayoutK.addView(AbstractC0583w0.E(applicationContext, new String[]{"搜索模式", "观影模式"}, new String[]{"通用内容搜索 支持自定义分类", "专注番剧/影视/纪录片内容"}, new int[]{-16735786, -363880}, iArr, "切换后立即生效"));
                    AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("确定", new P0(bVar, iArr, i2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    return;
                } catch (Exception unused) {
                    X0.a("切换失败");
                    return;
                }
            case 2:
                K1 k1 = (K1) this.c;
                k1.getClass();
                try {
                    Activity activity = InitOrigin.getActivity();
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                    linearLayoutK2.addView(AbstractC0583w0.p(activity, "有效性检测", "本地实现，不依赖后端，可靠性极强"), layoutParams);
                    int[] iArr2 = {1, 2, 0};
                    for (int i7 = 0; i7 < 3; i7++) {
                        if (iArr2[i7] == this.b) {
                            i3 = i7;
                            int[] iArr3 = {i3};
                            linearLayoutK2.addView(AbstractC0583w0.E(activity, new String[]{"本地标注", "隐藏失效", "关闭检测"}, new String[]{"本地检测链接状态，可靠性极强，不影响搜索返回", "仅隐藏本地确认失效的链接", "不发起链接检测请求"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.f, AbstractC0583w0.e}, iArr3, null));
                            AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayoutK2).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0503g(k1, iArr2, iArr3, i2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                            return;
                        }
                    }
                    int[] iArr4 = {i3};
                    linearLayoutK2.addView(AbstractC0583w0.E(activity, new String[]{"本地标注", "隐藏失效", "关闭检测"}, new String[]{"本地检测链接状态，可靠性极强，不影响搜索返回", "仅隐藏本地确认失效的链接", "不发起链接检测请求"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.f, AbstractC0583w0.e}, iArr4, null));
                    AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayoutK2).setPositiveButton("确定", new DialogInterfaceOnClickListenerC0503g(k1, iArr2, iArr4, i2)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    return;
                } catch (Exception e2) {
                    com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder("[FishPsDialog] showLinkCheckDialog: "));
                    return;
                }
            case 3:
                X1 x1 = (X1) this.c;
                x1.getClass();
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 != null) {
                        int i8 = this.b;
                        if (i8 <= 0) {
                            X0.a("暂无历史记录");
                        } else {
                            int i9 = AbstractC0583w0.a;
                            AbstractC0583w0.j0(AbstractC0583w0.r(activity2, "清除历史", "删除全部推送历史记录", AbstractC0583w0.e, new String[][]{new String[]{"当前记录", i8 + " 条"}, new String[]{"影响范围", "仅清除推送历史，不删除文件"}}, new int[]{AbstractC0583w0.c, AbstractC0583w0.f}, new String[]{"确认清除", "取消"}, new Runnable[]{new P(x1, i4), null}));
                        }
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            default:
                int i10 = P1.e;
                int i11 = this.b;
                if (i11 <= i10) {
                    return;
                }
                P1.e = i11;
                String str2 = (String) this.c;
                P1.f = str2;
                C0568t0 c0568t0 = P1.b;
                if (c0568t0 != null) {
                    c0568t0.c(i11, str2);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ M(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
