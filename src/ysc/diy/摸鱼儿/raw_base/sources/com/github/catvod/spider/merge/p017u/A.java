package com.github.catvod.spider.merge.p017u;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.widget.LinearLayout;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.PanWebShare123;
import com.github.catvod.spider.PanWebShareGuangYa;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.SeedHub;
import com.github.catvod.spider.Wallpaper;
import com.github.catvod.spider.WoNiu;
import com.github.catvod.spider.merge.A.C0265i1;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.C0304w;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.Z1;
import com.github.catvod.spider.merge.A.a2;
import com.github.catvod.spider.merge.p006g.a;
import com.github.catvod.spider.merge.p019w.c;
import com.github.catvod.spider.merge.p021y.b;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.B3;
import com.github.catvod.spider.merge.p022z.M3;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.P2;
import com.github.catvod.spider.merge.p022z.S;
import com.github.catvod.spider.merge.p022z.S2;
import com.github.catvod.spider.merge.p022z.e4;
import com.github.catvod.spider.merge.p022z.h4;
import com.google.gson.JsonArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class A implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ A(int i) {
        this.a = i;
    }

    private final void a() {
        String str = InitOrigin.e;
        synchronized (InitOrigin.class) {
            InitOrigin.j = false;
            new B(new RunnableC0460l(29), 1).run();
        }
    }

    private final void b() {
        ArrayList arrayList;
        try {
            c.m = c.r();
            c.B();
            ArrayList arrayList2 = c.o;
            synchronized (arrayList2) {
                c.n.set(false);
                arrayList = new ArrayList(arrayList2);
                arrayList2.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InitOrigin.run((Runnable) it.next());
            }
        } catch (Exception unused) {
            ArrayList arrayList3 = c.o;
            synchronized (arrayList3) {
                c.n.set(false);
                ArrayList arrayList4 = new ArrayList(arrayList3);
                arrayList3.clear();
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    InitOrigin.run((Runnable) it2.next());
                }
            }
        } catch (Throwable th) {
            ArrayList arrayList5 = c.o;
            synchronized (arrayList5) {
                c.n.set(false);
                ArrayList arrayList6 = new ArrayList(arrayList5);
                arrayList5.clear();
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    InitOrigin.run((Runnable) it3.next());
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean andSet;
        StringBuilder sb;
        String string;
        boolean z;
        int i;
        int i2 = 9;
        int i3 = 2;
        int i4 = 1;
        int i5 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                String str = InitOrigin.e;
                if (C0304w.x().h || !a.a().k()) {
                    return;
                }
                C0304w.x().O();
                return;
            case 1:
                String str2 = InitOrigin.e;
                Pattern pattern = a2.h;
                Z1.a.b();
                return;
            case 2:
                AtomicBoolean atomicBoolean = InitOrigin.x;
                AtomicBoolean atomicBoolean2 = InitOrigin.y;
                try {
                    atomicBoolean2.set(false);
                    InitOrigin.q(new A(3));
                    InitOrigin.q(new A(4));
                    if (andSet) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    atomicBoolean.set(false);
                    if (atomicBoolean2.getAndSet(false)) {
                        InitOrigin.n();
                    }
                }
            case 3:
                N1.h0();
                return;
            case 4:
                C0265i1.C();
                return;
            case 5:
                String str3 = InitOrigin.e;
                try {
                    try {
                        try {
                            N1.J();
                            Object obj = InitOrigin.m;
                            synchronized (obj) {
                                try {
                                    z = InitOrigin.n;
                                    i = InitOrigin.o;
                                    if (!z) {
                                        InitOrigin.h.set(false);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            if (z) {
                                try {
                                    InitOrigin.p(i);
                                    synchronized (obj) {
                                        InitOrigin.n = false;
                                        InitOrigin.h.set(false);
                                    }
                                } catch (Throwable th2) {
                                    synchronized (InitOrigin.m) {
                                        InitOrigin.n = false;
                                        InitOrigin.h.set(false);
                                        throw th2;
                                    }
                                }
                            }
                            try {
                                InitOrigin.resumeProtectedTasks();
                                return;
                            } catch (Throwable th3) {
                                string = "[Init] daily transfer dispatch failed: " + th3.getClass().getSimpleName() + ": " + th3.getMessage();
                                SpiderDebug.log(string);
                                return;
                            }
                        } catch (Throwable th4) {
                            try {
                                SpiderDebug.log("[Init] daily refresh dispatch failed: " + th4.getClass().getSimpleName() + ": " + th4.getMessage());
                                break;
                            } catch (Throwable unused) {
                            }
                            Object obj2 = InitOrigin.m;
                            synchronized (obj2) {
                                try {
                                    boolean z4 = InitOrigin.n;
                                    int i6 = InitOrigin.o;
                                    if (!z4) {
                                        InitOrigin.h.set(false);
                                    }
                                    if (z4) {
                                        try {
                                            InitOrigin.p(i6);
                                            synchronized (obj2) {
                                                InitOrigin.n = false;
                                                InitOrigin.h.set(false);
                                            }
                                        } catch (Throwable th5) {
                                            synchronized (InitOrigin.m) {
                                                InitOrigin.n = false;
                                                InitOrigin.h.set(false);
                                                throw th5;
                                            }
                                        }
                                    }
                                    try {
                                        InitOrigin.resumeProtectedTasks();
                                        return;
                                    } catch (Throwable th6) {
                                        sb = new StringBuilder("[Init] daily transfer dispatch failed: ");
                                        sb.append(th6.getClass().getSimpleName());
                                        sb.append(": ");
                                        sb.append(th6.getMessage());
                                        string = sb.toString();
                                        SpiderDebug.log(string);
                                        return;
                                    }
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        }
                    } catch (NoSuchMethodError unused2) {
                        synchronized (InitOrigin.m) {
                            try {
                                boolean z5 = InitOrigin.n;
                                int i7 = InitOrigin.o;
                                if (!z5) {
                                    InitOrigin.h.set(false);
                                }
                                if (z5) {
                                    try {
                                        InitOrigin.p(i7);
                                        synchronized (InitOrigin.m) {
                                            InitOrigin.n = false;
                                            InitOrigin.h.set(false);
                                        }
                                    } catch (Throwable th8) {
                                        synchronized (InitOrigin.m) {
                                            InitOrigin.n = false;
                                            InitOrigin.h.set(false);
                                            throw th8;
                                        }
                                    }
                                }
                                try {
                                    InitOrigin.resumeProtectedTasks();
                                    return;
                                } catch (Throwable th9) {
                                    sb = new StringBuilder("[Init] daily transfer dispatch failed: ");
                                    sb.append(th9.getClass().getSimpleName());
                                    sb.append(": ");
                                    sb.append(th9.getMessage());
                                    string = sb.toString();
                                    SpiderDebug.log(string);
                                    return;
                                }
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                    }
                } catch (Throwable unused3) {
                    return;
                }
            case 6:
                a();
                return;
            case 7:
                InitOrigin.m(0);
                return;
            case 8:
                try {
                    InitOrigin.run(new S(i2));
                    if (FishCrypto.hostAllowed() && FishCrypto.k()) {
                        InitOrigin.n();
                        if (InitOrigin.l) {
                            InitOrigin.q(new A(objArr == true ? 1 : 0));
                            InitOrigin.q(new A(i4));
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th11) {
                    InitOrigin.i(th11);
                    return;
                }
            case 9:
                P1.X0("kan360_help", null);
                return;
            case 10:
                P1.V0("123社区", PanWebShare123.getCurrentSiteUrl());
                return;
            case 11:
                P1.V0("光鸭社区", PanWebShareGuangYa.getCurrentSiteUrl());
                return;
            case 12:
                Proxy.a();
                return;
            case 13:
                HashMap map = SeedHub.v;
                X0.a("SeedHub设置已恢复默认");
                return;
            case 14:
                Handler handler = h4.a;
                InitOrigin.run(new e4(i3));
                return;
            case 15:
                Handler handler2 = h4.a;
                InitOrigin.run(new B3(29));
                return;
            case 16:
                HashMap map2 = Wallpaper.a;
                A a = new A(17);
                Handler handler3 = h4.a;
                InitOrigin.run(new B(a, i2));
                return;
            case 17:
                HashMap map3 = Wallpaper.a;
                Wallpaper.o("wallpaper_random_history", new JsonArray());
                X0.a("已清空随机历史");
                return;
            case 18:
                Pattern pattern2 = WoNiu.v;
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null) {
                        throw new IOException("请先打开应用主界面");
                    }
                    int[] iArr = {WoNiu.p() - 1};
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                    linearLayoutK.addView(AbstractC0583w0.p(activity, "提取数量", "选择每次解析的搜索结果数量"), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activity)));
                    int i8 = AbstractC0583w0.c;
                    linearLayoutK.addView(AbstractC0583w0.E(activity, new String[]{"1条", "2条", "3条", "4条", "5条"}, new String[]{"请求最少", "优先速度", "默认设置", "增加结果", "最多提取"}, new int[]{i8, i8, AbstractC0583w0.d, AbstractC0583w0.f, AbstractC0583w0.e}, iArr, null));
                    AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", new V(iArr, objArr2 == true ? 1 : 0)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    return;
                } catch (Exception e) {
                    X0.a("提取数量设置没有打开：" + WoNiu.o(e));
                    return;
                }
            case 19:
                Pattern pattern3 = WoNiu.v;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 == null) {
                        throw new IOException("请先打开应用主界面");
                    }
                    boolean z6 = FishCrypto.a;
                    int[] iArr2 = {"0".equals(C0297t1.h("woniu_search_folder"))};
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(activity2);
                    linearLayoutK2.addView(AbstractC0583w0.p(activity2, "搜索展示", "选择搜索结果的展示方式"), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activity2)));
                    linearLayoutK2.addView(AbstractC0583w0.E(activity2, new String[]{"文件夹解析", "原站列表"}, new String[]{"完整搜索按网盘类型归类，快速搜索保持原列表", "保持当前搜索结果和详情播放流程"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.c}, iArr2, null));
                    AbstractC0583w0.j0(new AlertDialog.Builder(activity2).setView(linearLayoutK2).setPositiveButton("保存", new V(iArr2, i4)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    return;
                } catch (Exception e2) {
                    X0.a("搜索展示设置没有打开：" + WoNiu.o(e2));
                    return;
                }
            case 20:
                if (com.github.catvod.spider.merge.p000a.A.j().q()) {
                    InitOrigin.execute(new S2(13));
                    return;
                } else {
                    InitOrigin.execute(new P2(18));
                    return;
                }
            case 21:
                P1.X0("danmaku_docs", null);
                return;
            case 22:
                P1.X0("alllive_help", null);
                return;
            case 23:
                try {
                    c.a = c.v();
                    c.b = c.x();
                    c.c = c.w();
                    c.d = c.A();
                    c.e = c.o();
                    c.f = c.p();
                    c.g = c.z();
                    c.h = c.t();
                    c.i = c.u();
                    c.j = c.s();
                    c.k = c.q();
                    c.l = c.y();
                    return;
                } catch (Exception unused4) {
                    return;
                }
            case 24:
                b();
                return;
            case 25:
                InitOrigin.run(new M3(c.g(), objArr3 == true ? 1 : 0));
                return;
            case 26:
                ArrayList arrayListT = b.t();
                b.w(b.q(arrayListT));
                String[] strArrQ = b.q(arrayListT);
                String[] strArr = new String[arrayListT.size()];
                for (int i9 = 0; i9 < arrayListT.size(); i9++) {
                    strArr[i9] = ((String[]) arrayListT.get(i9))[1];
                }
                P1.f1("分类管理", "管理当前分类的开关和排序", "local_menu", strArrQ, strArr, new String[0]);
                return;
            case 27:
                InitOrigin.run(new A(28));
                return;
            case 28:
                try {
                    Activity activity3 = InitOrigin.getActivity();
                    if (activity3 == null) {
                        X0.a("请在应用界面中操作");
                        return;
                    }
                    String strF = b.f();
                    for (int i10 = 0; i10 < 6; i10++) {
                        if (b.d[i10].equals(strF)) {
                            i5 = i10;
                            int[] iArr3 = {i5};
                            int iQ = AbstractC0583w0.Q(8, activity3);
                            int i11 = AbstractC0583w0.c;
                            int i12 = AbstractC0583w0.d;
                            int i13 = AbstractC0583w0.f;
                            LinearLayout linearLayoutK3 = AbstractC0583w0.K(activity3);
                            linearLayoutK3.addView(AbstractC0583w0.p(activity3, "文件排序", "设置本地和网盘文件默认排序"), AbstractC0583w0.c0(iQ));
                            linearLayoutK3.addView(AbstractC0583w0.J(activity3, AbstractC0583w0.E(activity3, b.b, b.c, new int[]{i11, i11, i12, i12, i13, i13}, iArr3, null), 280));
                            AbstractC0583w0.j0(new AlertDialog.Builder(activity3).setView(linearLayoutK3).setPositiveButton("确定", new V(iArr3, i3)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                            return;
                        }
                    }
                    int[] iArr4 = {i5};
                    int iQ2 = AbstractC0583w0.Q(8, activity3);
                    int i14 = AbstractC0583w0.c;
                    int i15 = AbstractC0583w0.d;
                    int i16 = AbstractC0583w0.f;
                    LinearLayout linearLayoutK4 = AbstractC0583w0.K(activity3);
                    linearLayoutK4.addView(AbstractC0583w0.p(activity3, "文件排序", "设置本地和网盘文件默认排序"), AbstractC0583w0.c0(iQ2));
                    linearLayoutK4.addView(AbstractC0583w0.J(activity3, AbstractC0583w0.E(activity3, b.b, b.c, new int[]{i14, i14, i15, i15, i16, i16}, iArr4, null), 280));
                    AbstractC0583w0.j0(new AlertDialog.Builder(activity3).setView(linearLayoutK4).setPositiveButton("确定", new V(iArr4, i3)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                    return;
                } catch (Exception e3) {
                    com.github.catvod.spider.merge.D.b.x(e3, new StringBuilder("设置失败: "));
                    return;
                }
            default:
                P1.X0("alllive_link_help", null);
                return;
        }
    }
}
