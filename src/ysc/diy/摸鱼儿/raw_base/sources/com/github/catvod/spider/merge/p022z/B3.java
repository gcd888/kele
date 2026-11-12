package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.Wallpaper;
import com.github.catvod.spider.merge.A.AbstractC0251e;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.P0;
import com.github.catvod.spider.merge.A.RunnableC0315z1;
import com.github.catvod.spider.merge.A.U0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.p000a.RunnableC0346c0;
import com.github.catvod.spider.merge.p000a.RunnableC0383v0;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p010l.a;
import com.github.catvod.spider.merge.p017u.C;
import com.github.catvod.spider.merge.p017u.DialogInterfaceOnClickListenerC0454f;
import com.github.catvod.spider.merge.p017u.RunnableC0459k;
import com.github.catvod.spider.merge.p017u.T;
import com.github.catvod.spider.merge.p017u.V;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class B3 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ B3(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.io.Serializable, java.lang.Runnable[]] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        String str;
        String str2;
        String str3;
        int i = 15;
        int i2 = 6;
        int i3 = 24;
        int i4 = 4;
        int i5 = 3;
        int i6 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                P1.X0("smart_poster_ai_help", null);
                return;
            case 1:
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity != null) {
                        JSONObject jSONObjectOptJSONObject = AbstractC0251e.m().optJSONObject("profile");
                        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) {
                            String[][] strArr = {new String[]{"推荐依据", AbstractC0251e.P()}, new String[]{"当前状态", P1.u(AbstractC0251e.a())}, new String[]{"画像内容", "口味偏好与观影人格"}};
                            int i7 = AbstractC0583w0.a;
                            AbstractC0583w0.j0(AbstractC0583w0.r(activity, "我的口味画像", "画像会随AI推荐一起生成", -16732991, strArr, new int[]{AbstractC0583w0.d, AbstractC0583w0.f, -16732991}, new String[]{"立即生成", "关闭"}, new Runnable[]{new B3(i6), null}));
                        } else {
                            AbstractC0583w0.j0(P1.y(activity, jSONObjectOptJSONObject));
                        }
                    }
                    return;
                } catch (Exception unused) {
                    X0.a("无法打开口味画像");
                    return;
                }
            case 2:
                if (P1.z0()) {
                    return;
                }
                X0.a("请先开启AI推荐并完善模型配置与推荐依据");
                return;
            case 3:
                JSONObject jSONObjectA = AbstractC0251e.a();
                int iOptInt = jSONObjectA.optInt("count");
                a aVarI = a.i();
                if (aVarI.f()) {
                    str = "已配置 · " + aVarI.s;
                } else {
                    str = "未配置 · 默认DeepSeek";
                }
                P1.K0("AI模型与更新", str, new String[]{"模型配置", "调用说明", "更新与状态", "清空缓存"}, new String[]{str, "查看推荐与展示规则", P1.u(jSONObjectA), iOptInt > 0 ? b.h("已缓存 ", iOptInt, " 部推荐") : "暂无推荐缓存"}, new int[]{-8708190, -16732991, AbstractC0583w0.f, AbstractC0583w0.e}, new Runnable[]{new B3(i2), new U2(22), new U2(i3), new U2(25)});
                return;
            case 4:
                boolean z3 = FishCrypto.a;
                C0297t1.j("smart_poster_wall_config", "");
                X0.a("智能海报墙已恢复默认");
                return;
            case 5:
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 == null) {
                        return;
                    }
                    int iQ = AbstractC0583w0.Q(8, activity2);
                    ?? r2 = {0};
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity2);
                    linearLayoutK.addView(AbstractC0583w0.q(activity2, "已订阅追更", "分页浏览，点击剧集可移除", -16732991), AbstractC0583w0.c0(iQ));
                    TextView textView = new TextView(activity2);
                    textView.setTextSize(12.0f);
                    textView.setTextColor(AbstractC0583w0.h);
                    textView.setGravity(5);
                    textView.setTypeface(null, 1);
                    linearLayoutK.addView(textView, AbstractC0583w0.c0(iQ));
                    LinearLayout linearLayout = new LinearLayout(activity2);
                    linearLayout.setOrientation(1);
                    linearLayout.setDescendantFocusability(262144);
                    View viewJ = AbstractC0583w0.J(activity2, linearLayout, 340);
                    linearLayoutK.addView(viewJ);
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(activity2).setView(linearLayoutK).setPositiveButton("关闭", (DialogInterface.OnClickListener) null).setNeutralButton("上一页", (DialogInterface.OnClickListener) null).setNegativeButton("下一页", (DialogInterface.OnClickListener) null).create();
                    ?? r6 = new Runnable[1];
                    r6[0] = new I3(r2, textView, linearLayout, activity2, r6, iQ, viewJ, alertDialogCreate, 0);
                    AbstractC0583w0.j0(alertDialogCreate);
                    Button button = alertDialogCreate.getButton(-3);
                    Button button2 = alertDialogCreate.getButton(-2);
                    button.setOnClickListener(new N1(r2, r6, 2));
                    button2.setOnClickListener(new N1(r2, r6, 3));
                    r6[0].run();
                    return;
                } catch (Exception e) {
                    b.x(e, new StringBuilder("打开已订阅追更失败: "));
                    return;
                }
            case 6:
                a aVarI2 = a.i();
                InitOrigin.run(new T("AI推荐模型", -8708190, aVarI2.q, aVarI2.r, aVarI2.s, "ai_config_" + System.currentTimeMillis(), new i(24, aVarI2)));
                return;
            case 7:
                try {
                    Activity activity3 = InitOrigin.getActivity();
                    if (activity3 == null) {
                        return;
                    }
                    AbstractC0583w0.j0(AbstractC0583w0.r(activity3, "调用说明", "AI推荐模型的使用范围", -16732991, new String[][]{new String[]{"推荐", "AI自主发现约24部作品并决定顺序与理由"}, new String[]{"画像", "与推荐同时生成，固定显示在AI推荐第一项"}, new String[]{"展示", "每页18部，新结果优先；缓存最多保留100部"}}, new int[]{-16732991, -8708190, AbstractC0583w0.d}, new String[]{"关闭"}, new Runnable[]{null}));
                    return;
                } catch (Exception e2) {
                    b.x(e2, new StringBuilder("操作失败: "));
                    return;
                }
            case 8:
                try {
                    Activity activity4 = InitOrigin.getActivity();
                    if (activity4 == null) {
                        return;
                    }
                    JSONObject jSONObjectA2 = AbstractC0251e.a();
                    int iOptInt2 = jSONObjectA2.optInt("count");
                    long jOptLong = jSONObjectA2.optLong("successAt");
                    String strOptString = jSONObjectA2.optString("lastError");
                    String[] strArr2 = {"状态", P1.u(jSONObjectA2)};
                    String[] strArr3 = {"最近成功", jOptLong > 0 ? AbstractC0251e.l(jOptLong) : "暂无"};
                    if (iOptInt2 > 0) {
                        str2 = iOptInt2 + "部";
                    } else {
                        str2 = "暂无";
                    }
                    String[] strArr4 = {"推荐数量", str2};
                    String[] strArr5 = {"口味画像", jSONObjectA2.optString("profileTitle").isEmpty() ? "暂无" : jSONObjectA2.optString("profileTitle")};
                    if (strOptString.isEmpty()) {
                        strOptString = "无";
                    }
                    String[][] strArr6 = {strArr2, strArr3, strArr4, strArr5, new String[]{"最近失败", strOptString}};
                    int i8 = AbstractC0583w0.a;
                    AbstractC0583w0.j0(AbstractC0583w0.r(activity4, "更新与状态", "后台静默累积；进入AI推荐分类时按需加载，失败继续使用已有结果", -16732991, strArr6, new int[]{-16732991, AbstractC0583w0.d, AbstractC0583w0.f, -8708190, AbstractC0583w0.e}, new String[]{"立即更新", "关闭"}, new Runnable[]{new B3(12), null}));
                    return;
                } catch (Exception unused2) {
                    X0.a("无法读取AI推荐状态");
                    return;
                }
            case 9:
                PianDan.cancelAiUpdates();
                synchronized (AbstractC0251e.a) {
                    JSONObject jSONObjectH = AbstractC0251e.H();
                    try {
                        jSONObjectH.put("ai", new JSONObject());
                        AbstractC0251e.V(jSONObjectH);
                        break;
                    } catch (Exception unused3) {
                    }
                    break;
                }
                X0.a("AI推荐缓存已清空");
                return;
            case 10:
                P1.X0("smart_poster_help", null);
                return;
            case 11:
                boolean zS = a.i().s();
                String[][] strArrPosterHomeMenu = PianDan.posterHomeMenu(zS);
                P1.f1("内容分类", "管理海报墙内容分类，AI推荐可单独控制显示", U0.k(zS), strArrPosterHomeMenu[0], strArrPosterHomeMenu[1], new String[0]);
                return;
            case 12:
                if (P1.z0()) {
                    return;
                }
                X0.a("已标记更新，启用并进入AI推荐分类后生成");
                return;
            case 13:
                InitOrigin.run(new U2(21));
                return;
            case 14:
                InitOrigin.run(new RunnableC0601z3(a.i(), objArr == true ? 1 : 0));
                return;
            case 15:
                try {
                    Activity activity5 = InitOrigin.getActivity();
                    if (activity5 == null) {
                        X0.a("请在应用界面中操作");
                        return;
                    }
                    boolean Z = C0299u0.Z();
                    boolean zG1 = C0299u0.g1();
                    String str4 = C0299u0.g1() ? "SO代理" : "Go代理";
                    C0299u0.x().getClass();
                    String str5 = C0299u0.v;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C0299u0.g1() ? "SO模式" : "进程模式");
                    sb.append((str5 == null || str5.isEmpty()) ? "" : " · ".concat(str5));
                    String string = sb.toString();
                    int iQ2 = AbstractC0583w0.Q(8, activity5);
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity5);
                    String str6 = Z ? str4 : "Java代理";
                    if (Z) {
                        str3 = string + " · 检测中...";
                    } else {
                        str3 = "已启用";
                    }
                    LinearLayout linearLayoutO = AbstractC0583w0.O(activity5, str6, str3, Z ? "检测" : "正常", Z ? AbstractC0583w0.i : -15610385);
                    linearLayoutO.setLayoutParams(AbstractC0583w0.c0(iQ2));
                    linearLayoutK2.addView(linearLayoutO);
                    int[] iArr = {!Z ? 1 : 0};
                    linearLayoutK2.addView(AbstractC0583w0.E(activity5, new String[]{zG1 ? "SO多线程" : "Go多线程", "Java多线程"}, new String[]{"高速稳定 推荐使用", "兼容性好 适合特殊环境"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, iArr, "根据环境自动选择SO/Go"));
                    AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity5).setView(linearLayoutK2).setPositiveButton("确定", new P0(iArr, str4, 13)).setNegativeButton("取消", (DialogInterface.OnClickListener) null);
                    if (Z) {
                        negativeButton.setNeutralButton("启动代理", new DialogInterfaceOnClickListenerC0454f(i));
                    }
                    AlertDialog alertDialogCreate2 = negativeButton.create();
                    AbstractC0583w0.k0(alertDialogCreate2, 0.0f);
                    if (Z) {
                        Q3 q3 = new Q3(alertDialogCreate2, linearLayoutO, new C(linearLayoutO, string));
                        linearLayoutO.addOnAttachStateChangeListener(q3);
                        alertDialogCreate2.setOnDismissListener(new Y1(4, q3));
                        q3.a.post(q3);
                        return;
                    }
                    return;
                } catch (Exception e3) {
                    b.x(e3, new StringBuilder("切换失败: "));
                    return;
                }
            case 16:
                AbstractC0302v0.E1("xunlei");
                return;
            case 17:
                AbstractC0302v0.E1("115");
                return;
            case 18:
                AbstractC0302v0.E1("guangya");
                return;
            case 19:
                InitOrigin.run(new RunnableC0315z1(i4));
                return;
            case 20:
                P1.X0("magnet_cloud_help", null);
                return;
            case 21:
                try {
                    Activity activity6 = InitOrigin.getActivity();
                    if (activity6 == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        int iQ3 = AbstractC0583w0.Q(8, activity6);
                        int[] iArr2 = {!U0.i() ? 1 : 0};
                        LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity6);
                        linearLayoutK3.addView(AbstractC0583w0.p(activity6, "设置视图", "控制设置中心显示范围"), AbstractC0583w0.c0(iQ3));
                        linearLayoutK3.addView(AbstractC0583w0.E(activity6, new String[]{"轻量模式", "完整模式"}, new String[]{"只显示控制台和网盘账号登录，适合日常播放\n老人小孩必备！", "显示全部高级设置，适合高度自定义和完整体验"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, iArr2, "保存后重新进入设置页生效"));
                        AbstractC0583w0.j0(new AlertDialog.Builder(activity6).setView(linearLayoutK3).setPositiveButton("保存", new V(iArr2, i4)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    }
                    return;
                } catch (Exception e4) {
                    b.x(e4, new StringBuilder("切换失败: "));
                    return;
                }
            case 22:
                try {
                    if (C0299u0.Z()) {
                        C0299u0 c0299u0X = C0299u0.x();
                        c0299u0X.getClass();
                        z = c0299u0X.w0(C0299u0.B0());
                    }
                    InitOrigin.run(new RunnableC0383v0(i, z));
                    return;
                } catch (Exception e5) {
                    InitOrigin.run(new RunnableC0346c0(e5, 4));
                    return;
                }
            case 23:
                try {
                    Activity activity7 = InitOrigin.getActivity();
                    if (activity7 == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        int i9 = AbstractC0583w0.d;
                        int i10 = AbstractC0583w0.a;
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity7, "无限播放源", "让转存与观看都更从容", i9, new String[][]{new String[]{"优先转存", "空间充足时仍按原有流程优先转存，并照常清理旧文件"}, new String[]{"安心续播", "转存失败或空间不足时，无限线路会接手续播，尽量不打断观看"}, new String[]{"分享回馈", "成功转存也会为资源站保留一份收益，感谢每一次整理与分享"}, new String[]{"使用建议", "建议排在常规线路之后，在需要时为你稳稳兜底"}}, new int[]{i9, AbstractC0583w0.c, AbstractC0583w0.f, i9}, new String[]{"了解并继续", "返回"}, new Runnable[]{new B3(i3), new RunnableC0459k(22)}));
                    }
                    return;
                } catch (Exception e6) {
                    b.x(e6, new StringBuilder("显示失败: "));
                    return;
                }
            case 24:
                InitOrigin.run(new R0(z2, (boolean[]) C0299u0.b0.clone(), i5));
                return;
            case 25:
                FishConfig.showAccountOverviewDialog();
                return;
            case 26:
                InitOrigin.run(new R0((boolean) (objArr2 == true ? 1 : 0), C0299u0.b0.clone(), i5));
                return;
            case 27:
                InitOrigin.run(new B3(23));
                return;
            case 28:
                Wallpaper.clearFavorites();
                X0.a("已清空收藏");
                return;
            default:
                try {
                    Activity activity8 = InitOrigin.getActivity();
                    if (activity8 == null) {
                        return;
                    }
                    List<k> listLoadFavorites = Wallpaper.loadFavorites();
                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity8);
                    linearLayoutK4.addView(AbstractC0583w0.p(activity8, "收藏管理", "共 " + listLoadFavorites.size() + " 张壁纸"), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity8)));
                    if (listLoadFavorites.isEmpty()) {
                        linearLayoutK4.addView(AbstractC0583w0.D(activity8, "暂无收藏"));
                    } else {
                        LinearLayout linearLayout2 = new LinearLayout(activity8);
                        linearLayout2.setOrientation(1);
                        h4.a(activity8, linearLayout2, listLoadFavorites);
                        linearLayoutK4.addView(AbstractC0583w0.s(activity8, linearLayout2));
                    }
                    AlertDialog.Builder negativeButton2 = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK4)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null);
                    if (!listLoadFavorites.isEmpty()) {
                        negativeButton2.setNeutralButton("全部清除", new DialogInterfaceOnClickListenerC0518j(i2, activity8));
                    }
                    AbstractC0583w0.j0(negativeButton2.create());
                    return;
                } catch (Exception e7) {
                    b.D(e7, new StringBuilder("[WallpaperDialog] showFavoritesManager error: "));
                    return;
                }
        }
    }
}
