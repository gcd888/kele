package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.p000a.RunnableC0383v0;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0559r1;
import com.github.catvod.spider.merge.p022z.InterfaceC0476a2;
import com.github.catvod.spider.merge.p022z.InterfaceC0550p1;
import com.github.catvod.spider.merge.p022z.InterfaceC0578v0;
import com.github.catvod.spider.merge.p022z.N3;
import com.github.catvod.spider.merge.p022z.RunnableC0483c;
import com.github.catvod.spider.merge.p022z.RunnableC0567t;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class P0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ P0(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        boolean z;
        int i2 = 2;
        int i3 = 0;
        switch (this.a) {
            case 0:
                break;
            case 1:
                int[] iArr = (int[]) this.c;
                z = iArr[0] == 0;
                ((C0239a) this.b).getClass();
                try {
                    JSONObject jSONObjectJ = C0239a.j();
                    jSONObjectJ.put("searchFolderMode", z);
                    C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                    break;
                } catch (Exception e) {
                    com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[ALLLiveStorage] setSearchFolderMode error: "));
                }
                X0.a(iArr[0] == 0 ? "已切换为文件夹模式" : "已切换为列表模式");
                return;
            case 2:
                int i4 = AbstractC0583w0.a;
                AbstractC0583w0.j0(AbstractC0583w0.r((Context) this.b, "确认清除", "清除后无法恢复，确定清除所有观看历史吗？", AbstractC0583w0.f, null, null, new String[]{"确认清除", "取消"}, new Runnable[]{new RunnableC0483c((C0239a) this.c, 1), null}));
                return;
            case 3:
                ((com.github.catvod.spider.merge.p022z.H) this.b).a((ArrayList) this.c);
                return;
            case 4:
                int i5 = ((int[]) this.c)[0];
                com.github.catvod.spider.merge.p005f.b bVar = (com.github.catvod.spider.merge.p005f.b) this.b;
                com.github.catvod.spider.merge.p005f.c cVar = bVar.a;
                cVar.a = i5;
                Runnable runnable = bVar.b;
                if (runnable != null) {
                    runnable.run();
                }
                StringBuilder sb = new StringBuilder("已切换到");
                sb.append(cVar.a == 1 ? "观影模式" : "搜索模式");
                sb.append("，请刷新页面");
                X0.a(sb.toString());
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.c;
                boolean z2 = zArr[0];
                com.github.catvod.spider.merge.p006g.a aVar = (com.github.catvod.spider.merge.p006g.a) this.b;
                z = z2 != aVar.i();
                aVar.s(zArr[0]);
                InitOrigin.execute(new RunnableC0383v0(i2, z));
                X0.a("弹幕AI调用规则已保存");
                return;
            case 6:
                com.github.catvod.spider.merge.p022z.G0 g0 = (com.github.catvod.spider.merge.p022z.G0) this.b;
                if (g0 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                while (true) {
                    boolean[] zArr2 = (boolean[]) this.c;
                    if (i3 >= zArr2.length) {
                        g0.a(arrayList);
                        return;
                    } else {
                        if (zArr2[i3]) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                        i3++;
                    }
                }
                break;
            case 7:
                com.github.catvod.spider.merge.p022z.P1.l0((Activity) this.b, new File((String) this.c));
                return;
            case 8:
                ((InterfaceC0550p1) this.b).a(C0559r1.c[((int[]) this.c)[0]]);
                return;
            case 9:
                com.github.catvod.spider.merge.p022z.K1 k1 = (com.github.catvod.spider.merge.p022z.K1) this.b;
                k1.getClass();
                int[] iArr2 = (int[]) this.c;
                z = iArr2[0] == 0;
                com.github.catvod.spider.merge.p022z.J1 j1 = k1.a;
                j1.setFolderMode(z);
                j1.saveConfig();
                X0.a(iArr2[0] == 0 ? "已切换为文件夹模式" : "已切换为列表模式");
                return;
            case 10:
                com.github.catvod.spider.merge.p017u.E e2 = (com.github.catvod.spider.merge.p017u.E) this.b;
                if (e2 != null) {
                    e2.a(Boolean.valueOf(((int[]) this.c)[0] == 0));
                    return;
                }
                return;
            case 11:
                InterfaceC0476a2 interfaceC0476a2 = (InterfaceC0476a2) ((C0559r1) this.b).a;
                interfaceC0476a2.setItems((ArrayList) this.c);
                interfaceC0476a2.saveConfig();
                X0.a("排序已保存，刷新生效");
                return;
            case 12:
                InterfaceC0578v0 interfaceC0578v0 = (InterfaceC0578v0) this.b;
                if (interfaceC0578v0 != null) {
                    interfaceC0578v0.g(0, ((boolean[]) this.c)[0]);
                    return;
                }
                return;
            case 13:
                if (((int[]) this.b)[0] != 0) {
                    C0299u0.E = "java";
                    try {
                        C0297t1.j("proxy_type", "java");
                        break;
                    } catch (Exception unused) {
                    }
                    X0.a("已切换到Java代理");
                    return;
                }
                C0299u0.E = "go";
                try {
                    C0297t1.j("proxy_type", "go");
                    break;
                } catch (Exception unused2) {
                }
                C0299u0 c0299u0X = C0299u0.x();
                c0299u0X.k = false;
                c0299u0X.J0();
                X0.a("已切换到" + ((String) this.c));
                return;
            default:
                int i6 = ((int[]) this.b)[0];
                if (i6 >= 0) {
                    int[] iArr3 = com.github.catvod.spider.merge.p022z.P1.n;
                    N3 n3 = (N3) this.c;
                    String str = n3.a;
                    String str2 = n3.b;
                    if (i6 == 6) {
                        InitOrigin.run(new RunnableC0567t(str, n3.c, i2, str2));
                        return;
                    }
                    int i7 = iArr3[i6];
                    C0299u0.R.put(str, Integer.valueOf(Math.max(1, Math.min(1000, i7))));
                    C0299u0.O0();
                    X0.a(str2 + " 已设置为 " + i7);
                    return;
                }
                return;
        }
        while (true) {
            List list = (List) this.b;
            if (i3 >= list.size()) {
                X0.a("磁力自动清理已保存");
                return;
            } else {
                AbstractC0302v0.y1(AbstractC0302v0.k1((String) list.get(i3)), "cleanup", ((boolean[]) this.c)[i3]);
                i3++;
            }
        }
    }

    public /* synthetic */ P0(boolean[] zArr, com.github.catvod.spider.merge.p006g.a aVar) {
        this.a = 5;
        this.c = zArr;
        this.b = aVar;
    }
}
