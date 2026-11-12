package com.github.catvod.spider.merge.p020x;

import android.app.Activity;
import android.text.TextUtils;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0261h0;
import com.github.catvod.spider.merge.A.N0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p017u.M;
import com.github.catvod.spider.merge.p017u.W;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.J1;
import com.github.catvod.spider.merge.p022z.K1;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.R0;
import com.github.catvod.spider.merge.p022z.RunnableC0564s1;
import com.github.catvod.spider.merge.p022z.RunnableC0579v1;
import com.github.catvod.spider.merge.p022z.RunnableC0584w1;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0261h0 b;

    public /* synthetic */ a(C0261h0 c0261h0, int i) {
        this.a = i;
        this.b = c0261h0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 10;
        int i2 = 7;
        int i3 = 8;
        int i4 = 6;
        int i5 = 5;
        int i6 = 0;
        int i7 = 1;
        int i8 = 2;
        C0261h0 c0261h0 = this.b;
        switch (this.a) {
            case 0:
                ((K1) c0261h0.c).o();
                break;
            case 1:
                ((K1) c0261h0.c).getClass();
                P1.X0("fishps_help", null);
                break;
            case 2:
                K1 k1 = (K1) c0261h0.c;
                J1 j1 = k1.a;
                List visibleApiUrls = j1.getVisibleApiUrls();
                boolean[] zArr = new boolean[visibleApiUrls.size()];
                while (i6 < visibleApiUrls.size()) {
                    zArr[i6] = j1.isApiEnabled((String) visibleApiUrls.get(i6));
                    i6++;
                }
                InitOrigin.run(new W(k1, visibleApiUrls, zArr, i3));
                break;
            case 3:
                K1 k2 = (K1) c0261h0.c;
                k2.getClass();
                InitOrigin.run(new RunnableC0584w1(k2, String.valueOf(System.currentTimeMillis()), i6));
                break;
            case 4:
                K1 k3 = (K1) c0261h0.c;
                k3.getClass();
                InitOrigin.run(new RunnableC0579v1(k3, 3));
                break;
            case 5:
                K1 k4 = (K1) c0261h0.c;
                k4.getClass();
                InitOrigin.run(new RunnableC0579v1(k4, 4));
                break;
            case 6:
                ((b) c0261h0.b).s();
                X0.a("已恢复默认");
                break;
            case 7:
                K1 k5 = (K1) c0261h0.c;
                InitOrigin.run(new R0(k5, k5.a.isFolderMode(), i7));
                break;
            case 8:
                K1 k6 = (K1) c0261h0.c;
                InitOrigin.run(new M(k6, k6.a.getLinkCheckMode(), 2));
                break;
            case 9:
                c0261h0.getClass();
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        int i9 = AbstractC0583w0.e;
                        int i10 = AbstractC0583w0.a;
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity, "恢复默认", "重置盘搜配置", i9, new String[][]{new String[]{"搜索来源", "自定义接口清空，内置接口恢复默认"}, new String[]{"筛选规则", "网盘类型、频道范围和关键词过滤恢复默认"}, new String[]{"展示策略", "数量、文件夹模式和检测策略恢复默认"}}, new int[]{AbstractC0583w0.c, AbstractC0583w0.f, i9}, new String[]{"确认恢复", "取消"}, new Runnable[]{new a(c0261h0, i4), null}));
                    }
                } catch (Exception e) {
                    b.x(e, new StringBuilder("操作失败: "));
                    return;
                }
                break;
            case 10:
                ((K1) c0261h0.c).p();
                break;
            case 11:
                String[] strArr = {"5条", "10条", "20条", "50条", "100条", "不限制"};
                int[] iArr = {5, 10, 20, 50, 100, 0};
                K1 k7 = (K1) c0261h0.c;
                int maxPerType = k7.a.getMaxPerType();
                while (i6 < 6) {
                    if (iArr[i6] == maxPerType) {
                        i5 = i6;
                        InitOrigin.run(new N0(k7, i5, strArr, iArr));
                    } else {
                        i6++;
                    }
                    break;
                }
                InitOrigin.run(new N0(k7, i5, strArr, iArr));
                break;
            case 12:
                K1 k8 = (K1) c0261h0.c;
                J1 j2 = k8.a;
                InitOrigin.run(new RunnableC0564s1(k8, j2.getIncludeKeywords(), j2.getExcludeKeywords(), String.valueOf(System.currentTimeMillis())));
                break;
            case 13:
                P1.K0("API管理", "管理摸鱼盘搜接口的开关、添加、删除和测速", new String[]{"接口开关", "添加接口", "删除接口", "测速诊断"}, new String[]{((b) c0261h0.b).g(), "添加自定义搜索接口", "默认和自定义接口都可删除", "测试当前接口响应速度"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c, AbstractC0583w0.e, AbstractC0583w0.f}, new Runnable[]{new a(c0261h0, 2), new a(c0261h0, 3), new a(c0261h0, 4), new a(c0261h0, 5)});
                break;
            case 14:
                String[] strArr2 = {"搜索展示", "有效性检测"};
                b bVar = (b) c0261h0.b;
                String str = bVar.o ? "当前：文件夹" : "当前：列表";
                int i11 = bVar.p;
                P1.K0("搜索策略", "搜索展示和有效性检测集中调整", strArr2, new String[]{str, "当前：".concat(i11 == 0 ? "关闭" : i11 != 2 ? "本地检测/可靠性极强" : "隐藏失效")}, new int[]{AbstractC0583w0.c, AbstractC0583w0.f}, new Runnable[]{new a(c0261h0, i2), new a(c0261h0, i3)});
                break;
            case 15:
                K1 k9 = (K1) c0261h0.c;
                String strB = k9.b();
                String[] strArr3 = {"频道模板来源", "TG频道", "搜索插件", "自定义管理", "添加自定义", "恢复全源"};
                String strJ = k9.j();
                boolean zIsEmpty = TextUtils.isEmpty(strJ);
                J1 j3 = k9.a;
                String[] strArr4 = {zIsEmpty ? "未选择后端API" : j3.getApiName(strJ), "模板已选 " + j3.getChannels().size() + " 个", "模板已选 " + j3.getPlugins().size() + " 个", k9.b(), "扫码或手动添加频道/插件", "清空频道和插件限制"};
                int i12 = AbstractC0583w0.c;
                P1.K0("频道范围", strB, strArr3, strArr4, new int[]{i12, AbstractC0583w0.d, AbstractC0583w0.f, AbstractC0583w0.g, i12, AbstractC0583w0.e}, new Runnable[]{new RunnableC0579v1(k9, i5), new RunnableC0579v1(k9, i4), new RunnableC0579v1(k9, i2), new RunnableC0579v1(k9, i3), new RunnableC0579v1(k9, 9), new RunnableC0579v1(k9, i)});
                break;
            case 16:
                K1 k10 = (K1) c0261h0.c;
                InitOrigin.run(new R0(k10, k10.a.isFolderMode(), i7));
                break;
            default:
                K1 k11 = (K1) c0261h0.c;
                InitOrigin.run(new M(k11, k11.a.getLinkCheckMode(), i8));
                break;
        }
    }
}
