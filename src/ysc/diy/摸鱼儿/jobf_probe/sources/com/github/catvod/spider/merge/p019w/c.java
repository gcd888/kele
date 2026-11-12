package com.github.catvod.spider.merge.p019w;

import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.PanWebShare123;
import com.github.catvod.spider.PanWebShareGuangYa;
import com.github.catvod.spider.merge.A.C0256f1;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.k2;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.T.j0;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.C0342a0;
import com.github.catvod.spider.merge.p000a.C0349e;
import com.github.catvod.spider.merge.p000a.C0353g;
import com.github.catvod.spider.merge.p000a.C0359j;
import com.github.catvod.spider.merge.p000a.C0364l0;
import com.github.catvod.spider.merge.p000a.C0377s0;
import com.github.catvod.spider.merge.p000a.L0;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p000a.l1;
import com.github.catvod.spider.merge.p000a.t1;
import com.github.catvod.spider.merge.p006g.a;
import com.github.catvod.spider.merge.p017u.A;
import com.github.catvod.spider.merge.p022z.P1;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class c {
    public static volatile String a = "点击查看";
    public static volatile String b = "点击查看";
    public static volatile String c = "点击查看";
    public static volatile String d = "点击查看";
    public static volatile String e = "点击查看";
    public static volatile String f = "点击查看";
    public static volatile String g = "点击查看";
    public static volatile String h = "点击查看";
    public static volatile String i = "点击查看";
    public static volatile String j = "点击查看";
    public static volatile String k = "点击查看";
    public static volatile String l = "点击查看";
    public static volatile String m = "刷新分类后读取";
    public static final AtomicBoolean n = new AtomicBoolean(false);
    public static final ArrayList o = new ArrayList();

    public static String A() throws Throwable {
        try {
            t1.u().getClass();
            LinkedHashMap linkedHashMapE = t1.E();
            t1.u().getClass();
            return C0256f1.e(linkedHashMapE, t1.F(), "移动用户", new String[0]).b("未登录");
        } catch (Exception unused) {
            return "未登录";
        }
    }

    public static void B() {
        C0359j[] c0359jArr = {new C0359j(18), new C0359j(20), new C0359j(21), new C0359j(11), new C0359j(12), new C0359j(13), new C0359j(14), new C0359j(15), new C0359j(16), new C0359j(17), new C0359j(19)};
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.min(5, 11));
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 11; i2++) {
            try {
                C0359j c0359j = c0359jArr[i2];
                Objects.requireNonNull(c0359j);
                arrayList.add(executorServiceNewFixedThreadPool.submit(new b(0, c0359j)));
            } catch (Throwable th) {
                executorServiceNewFixedThreadPool.shutdownNow();
                throw th;
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            try {
                E(i3, (String) ((Future) arrayList.get(i3)).get());
            } catch (Exception unused) {
                ((Future) arrayList.get(i3)).cancel(true);
            }
        }
        executorServiceNewFixedThreadPool.shutdownNow();
    }

    public static void C(String str) {
        InitOrigin.execute(new a(str, 1));
    }

    public static void D(Runnable runnable) {
        boolean zCompareAndSet;
        ArrayList arrayList = o;
        synchronized (arrayList) {
            if (runnable != null) {
                arrayList.add(runnable);
                zCompareAndSet = n.compareAndSet(false, true);
            } else {
                zCompareAndSet = n.compareAndSet(false, true);
            }
            throw th;
        }
        if (zCompareAndSet) {
            InitOrigin.execute(new A(24));
        }
    }

    public static void E(int i2, String str) {
        if (com.github.catvod.spider.merge.Y.c.d(str)) {
            switch (i2) {
                case 0:
                    a = str;
                    break;
                case 1:
                    b = str;
                    break;
                case 2:
                    c = str;
                    break;
                case 3:
                    d = str;
                    break;
                case 4:
                    f = str;
                    break;
                case 5:
                    g = str;
                    break;
                case 6:
                    i = str;
                    break;
                case 7:
                    h = str;
                    break;
                case 8:
                    e = str;
                    break;
                case 9:
                    j = str;
                    break;
                case 10:
                    k = str;
                    break;
            }
        }
    }

    public static String F(String str) {
        String[] strArrG = C0299u0.G(str);
        if (strArrG.length == 0) {
            return "不支持多线程";
        }
        if (!"quark".equals(str) && !"uc".equals(str)) {
            return C0299u0.F(strArrG[0]) + "线程";
        }
        return "普通:" + C0299u0.F(strArrG[0]) + " 会员:" + C0299u0.F(strArrG[1]);
    }

    public static String G() {
        return c;
    }

    public static String H() {
        return b;
    }

    public static String I() {
        return l;
    }

    public static String J() {
        return g;
    }

    public static String K() {
        return d;
    }

    public static String a() {
        String[] strArrG = g();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 11; i4++) {
            String str = strArrG[i4];
            if (str != null && !str.isEmpty() && !str.contains("加载中") && !str.contains("点击查看") && !str.contains("点击刷新")) {
                i2++;
                if (!str.contains("未登录") && !str.contains("需先登录") && !str.contains("登录中") && !str.contains("已配置Token")) {
                    i3++;
                }
            }
        }
        return i2 == 0 ? "刷新分类后读取" : b.h("已登录", i3, "/11");
    }

    public static String b() {
        try {
            a aVarA = a.a();
            if (aVarA.i()) {
                return aVarA.b().isEmpty() ^ true ? "已配置" : "缺少Key";
            }
            return "未开启";
        } catch (Exception unused) {
            return "未开启";
        }
    }

    public static String c() {
        return e;
    }

    public static String d() {
        return f;
    }

    public static String e() {
        boolean zQ = k2.q();
        if (k2.m(zQ)) {
            return k2.i(zQ).concat("备份可用");
        }
        return zQ ? "夸克未登录" : "未配置WebDAV";
    }

    public static String f() {
        return m;
    }

    public static String[] g() {
        return new String[]{a, b, c, d, f, g, i, h, e, j, k};
    }

    public static String h() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(PanWebShareGuangYa.hasSavedCookie() ? "已配置" : "未配置");
            sb.append(" · ");
            sb.append(PanWebShareGuangYa.getCurrentSiteUrl());
            return sb.toString();
        } catch (Exception unused) {
            return "未配置";
        }
    }

    public static String i() {
        return j;
    }

    public static String j() {
        return h;
    }

    public static String k() {
        return i;
    }

    public static String l() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(PanWebShare123.hasSavedCookie() ? "已配置" : "未配置");
            sb.append(" · ");
            sb.append(PanWebShare123.getCurrentSiteUrl());
            return sb.toString();
        } catch (Exception unused) {
            return "未配置";
        }
    }

    public static String m() {
        try {
            List listG = a.a().g();
            j0 j0Var = com.github.catvod.spider.merge.p006g.b.h;
            if (listG != null && !listG.isEmpty()) {
                if (listG.size() >= 10) {
                    return "全部开启(10/10)";
                }
                return "已启用" + listG.size() + "/10个";
            }
            return "全部关闭(0/10)";
        } catch (Exception unused) {
            return "点击配置";
        }
    }

    public static String n() {
        return a;
    }

    public static String o() {
        try {
            C0256f1 c0256f1E = C0256f1.e(C0349e.j().y(), false, "阿里用户", new String[0]);
            if (c0256f1E.b) {
                return c0256f1E.b("未登录");
            }
            C0349e.j().getClass();
            com.github.catvod.spider.merge.p003d.c cVarD = com.github.catvod.spider.merge.p003d.c.d();
            if (cVarD.c().g()) {
                return "已登录";
            }
            return com.github.catvod.spider.merge.Y.c.d(cVarD.c().f()) ? "已配置Token" : "未登录";
        } catch (Exception unused) {
            return "未登录";
        }
    }

    public static String p() {
        try {
            return C0256f1.e(C0353g.a().h(), false, "百度用户", new String[0]).b("未登录");
        } catch (Exception unused) {
            return "未登录";
        }
    }

    public static String q() {
        try {
            return com.github.catvod.spider.merge.p000a.A.j().m();
        } catch (Exception unused) {
            return "未登录";
        }
    }

    public static String r() throws Throwable {
        boolean z;
        try {
            if (C0299u0.Z()) {
                C0299u0 c0299u0X = C0299u0.x();
                c0299u0X.getClass();
                z = c0299u0X.w0(C0299u0.B0());
            }
            int iE0 = P1.e0(z);
            if (iE0 == 0) {
                return "状态良好";
            }
            return iE0 + "项需处理";
        } catch (Exception unused) {
            return "刷新分类后读取";
        }
    }

    public static String s() {
        String strH = h();
        try {
            C0342a0 c0342a0 = C0342a0.x;
            if (c0342a0.G()) {
                return C0256f1.e(c0342a0.C(), true, "光鸭用户", new String[0]).b("已登录");
            }
            return "未登录 · 社区" + strH;
        } catch (Exception unused) {
            return b.B("未登录 · 社区", strH);
        }
    }

    public static String t() {
        try {
            return C0256f1.e(C0364l0.C().M(), false, "115用户", new String[0]).b("未登录");
        } catch (Exception unused) {
            return "未登录";
        }
    }

    public static String u() {
        String strL = l();
        try {
            C0377s0 c0377s0 = C0377s0.u;
            if (c0377s0.u()) {
                return C0256f1.e(c0377s0.q(), true, "123用户", new String[0]).b("已登录");
            }
            return "未登录 · 社区" + strL;
        } catch (Exception unused) {
            return b.B("未登录 · 社区", strL);
        }
    }

    public static String v() {
        try {
            return C0256f1.e(A0.s().N(), false, "夸克用户", new String[0]).b("未登录");
        } catch (Exception unused) {
            return "未登录";
        }
    }

    public static String w() throws Throwable {
        try {
            L0 l0Q = L0.q();
            l0Q.getClass();
            if (!L0.A() && !l0Q.y()) {
                return "未登录";
            }
            if (!l0Q.y()) {
                l0Q.T();
            }
            return !l0Q.y() ? "凭证已保存" : C0256f1.e(l0Q.x(), true, "天翼用户", "account").b("未登录");
        } catch (Exception unused) {
            return "未登录";
        }
    }

    public static String x() {
        try {
            C0256f1 c0256f1E = C0256f1.e(Z0.t().K(), false, "UC用户", new String[0]);
            return !c0256f1E.b ? "未登录" : c0256f1E.b("未登录");
        } catch (Exception unused) {
            return "未登录";
        }
    }

    public static String y() {
        boolean zB;
        boolean z;
        try {
            boolean z2 = FishCrypto.a;
            String strH = C0297t1.h("uc");
            if (com.github.catvod.spider.merge.Y.c.d(strH)) {
                com.github.catvod.spider.merge.p013o.a aVar = (com.github.catvod.spider.merge.p013o.a) new Gson().fromJson(strH, com.github.catvod.spider.merge.p013o.a.class);
                if (aVar == null) {
                    aVar = new com.github.catvod.spider.merge.p013o.a();
                }
                String strA = aVar.e().a();
                z = com.github.catvod.spider.merge.Y.c.d(strA) && (strA.contains("__pus") || strA.contains("__uid") || strA.contains("__kp"));
                zB = aVar.e().b();
            } else {
                zB = false;
                z = false;
            }
            if (!z) {
                return "需先登录UC网盘";
            }
            if (zB) {
                return "SVIP无需授权(已走PC转码)";
            }
            String strH2 = C0297t1.h("uctvtoken");
            return (com.github.catvod.spider.merge.Y.c.d(strH2) && strH2.contains("access_token")) ? "已授权" : "未授权(需扫码)";
        } catch (Exception unused) {
            return "需先登录UC网盘";
        }
    }

    public static String z() {
        try {
            return C0256f1.e(l1.I().U(), l1.I().Z(), "迅雷用户", new String[0]).b("未登录");
        } catch (Exception unused) {
            return "未登录";
        }
    }
}
