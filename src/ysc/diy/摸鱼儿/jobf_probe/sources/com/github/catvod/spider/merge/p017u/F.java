package com.github.catvod.spider.merge.p017u;

import android.app.Activity;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Kan360;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.RunnableC0508h;
import com.github.catvod.spider.merge.p022z.W1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class F implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Kan360 b;

    public /* synthetic */ F(Kan360 kan360, int i) {
        this.a = i;
        this.b = kan360;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [int[], java.io.Serializable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 5;
        int i2 = 0;
        Kan360 kan360 = this.b;
        switch (this.a) {
            case 0:
                ArrayList arrayList = kan360.e;
                kan360.d = arrayList.isEmpty() ? FishCrypto.v("N1.4iwspm5bld4weaxsV9YXxpta8VsYgkzg0+9Iu0eOBAmoX8PhmiyYKzA9sKtp2eI3T3EmUSlUvcxwW69yEzpCTbTbWIBOpa3uuf7lOL1zHuk=") : (String) arrayList.get(0);
                kan360.f.clear();
                kan360.g = "LS SH 19 HX DY XG";
                kan360.h = true;
                kan360.j();
                X0.a("已恢复默认！");
                break;
            case 1:
                boolean z = kan360.h;
                E e = new E(kan360, 5);
                int[] iArr = W1.a;
                InitOrigin.run(new RunnableC0466s(new String[]{"启用解析", "直接播放"}, (Serializable) new int[]{!z ? 1 : 0}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, new String[]{"推荐 - 使用解析接口获取播放地址", "输出原始链接，由全局解析处理"}, e, 7));
                break;
            case 2:
                String str = kan360.d;
                ArrayList arrayList2 = kan360.e;
                ArrayList arrayList3 = kan360.f;
                E e2 = new E(kan360, 4);
                F f = new F(kan360, i);
                F f2 = new F(kan360, 6);
                HashMap map = kan360.i;
                HashMap map2 = kan360.j;
                int[] iArr2 = W1.a;
                InitOrigin.run(new RunnableC0508h(map2, arrayList2, arrayList3, map, str, e2, f, f2));
                break;
            case 3:
                String[][] strArr = Kan360.l;
                String str2 = kan360.g;
                E e3 = new E(kan360, 1);
                int[] iArr3 = W1.a;
                InitOrigin.run(new W(strArr, str2, e3, 10));
                break;
            case 4:
                kan360.getClass();
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null) {
                        X0.a("请在应用界面中操作");
                    } else {
                        int i3 = AbstractC0583w0.e;
                        int i4 = AbstractC0583w0.a;
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity, "恢复默认", "重置360影视配置", i3, new String[][]{new String[]{"解析接口", "恢复默认解析并清空自定义接口"}, new String[]{"平台过滤", "恢复默认过滤规则"}, new String[]{"源内解析", "恢复为启用状态"}}, new int[]{AbstractC0583w0.c, AbstractC0583w0.f, i3}, new String[]{"确认恢复", "取消"}, new Runnable[]{new F(kan360, i2), null}));
                    }
                } catch (Exception e4) {
                    b.x(e4, new StringBuilder("操作失败: "));
                    return;
                }
                break;
            case 5:
                kan360.getClass();
                E e5 = new E(kan360, 2);
                int[] iArr4 = W1.a;
                InitOrigin.run(new RunnableC0242b(String.valueOf(System.currentTimeMillis()), (Object) e5, 22));
                break;
            default:
                ArrayList arrayList4 = kan360.f;
                E e6 = new E(kan360, 3);
                int[] iArr5 = W1.a;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    X0.a("暂无自定义接口");
                } else {
                    InitOrigin.run(new RunnableC0242b(arrayList4, e6, 23));
                }
                break;
        }
    }
}
