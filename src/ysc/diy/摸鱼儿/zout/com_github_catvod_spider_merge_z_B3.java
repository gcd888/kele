package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0256f1;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.RunnableC0240a0;
import com.github.catvod.spider.merge.Y.c;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.C0342a0;
import com.github.catvod.spider.merge.p000a.C0349e;
import com.github.catvod.spider.merge.p000a.C0353g;
import com.github.catvod.spider.merge.p000a.C0364l0;
import com.github.catvod.spider.merge.p000a.C0377s0;
import com.github.catvod.spider.merge.p000a.L0;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p000a.l1;
import com.github.catvod.spider.merge.p000a.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0482b3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0512h3[] b;

    public /* synthetic */ RunnableC0482b3(C0512h3[] c0512h3Arr, int i) {
        this.a = i;
        this.b = c0512h3Arr;
    }

    private final void a() throws Throwable {
        String str;
        C0512h3[] c0512h3Arr = this.b;
        try {
            C0377s0 c0377s0 = C0377s0.u;
            LinkedHashMap linkedHashMapQ = c0377s0.q();
            boolean zU = c0377s0.u();
            Object obj = linkedHashMapQ.get("isLoggedIn");
            if (obj == null) {
                obj = linkedHashMapQ.get("hasCookie");
            }
            if (obj == null) {
                obj = linkedHashMapQ.get("hasToken");
            }
            if (obj != null) {
                zU = Boolean.TRUE.equals(obj);
            }
            C0256f1 c0256f1E = C0256f1.e(linkedHashMapQ, zU, "123用户", new String[0]);
            String strC = zU ? c0256f1E.c("123用户") : null;
            ArrayList arrayList = new ArrayList();
            if (zU) {
                arrayList.add(new C0517i3("登录状态", AbstractC0583w0.d, "已登录", false));
                P1.f(arrayList, c0256f1E, true, false, null);
                P1.o(arrayList, c0256f1E, AbstractC0302v0.X0("pan123"));
                P1.i(arrayList, c0256f1E, "存储容量");
                String strW = P1.W(linkedHashMapQ, "permanent_capacity");
                String strW2 = P1.W(linkedHashMapQ, "temp_capacity");
                if (strW != null && !strW.isEmpty()) {
                    arrayList.add(new C0517i3("永久空间", AbstractC0583w0.h, strW, false));
                }
                if (strW2 != null && !strW2.isEmpty()) {
                    String strW3 = P1.W(linkedHashMapQ, "space_temp_expire");
                    StringBuilder sb = new StringBuilder();
                    sb.append(strW2);
                    if (strW3 == null || strW3.isEmpty()) {
                        str = "";
                    } else {
                        str = " (到期:" + strW3 + ")";
                    }
                    sb.append(str);
                    arrayList.add(new C0517i3("临时空间", AbstractC0583w0.h, sb.toString(), false));
                }
                String strW4 = P1.W(linkedHashMapQ, "file_count", "fileCount");
                if (strW4 != null && !strW4.isEmpty()) {
                    arrayList.add(new C0517i3("文件数量", AbstractC0583w0.h, strW4, false));
                }
                P1.k("账号密码", arrayList);
            }
            InitOrigin.run(new RunnableC0487c3(c0512h3Arr, zU, strC, arrayList, zU ? c0256f1E.n : null, 1));
        } catch (Exception e) {
            InitOrigin.run(new RunnableC0492d3(c0512h3Arr, e, 1));
        }
    }

    private final void b() {
        C0512h3[] c0512h3Arr = this.b;
        try {
            C0502f3 c0502f3 = new C0502f3(InitOrigin.getActivity());
            c0502f3.b = AbstractC0302v0.Y0("tianyi");
            c0502f3.d = AbstractC0302v0.X0("tianyi");
            c0502f3.e = true;
            c0502f3.c = "加载中...";
            c0512h3Arr[0] = c0502f3.a();
        } catch (Exception unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str;
        int i;
        String str2;
        String str3 = "无限制";
        C0512h3[] c0512h3Arr = this.b;
        switch (this.a) {
            case 0:
                try {
                    C0502f3 c0502f3 = new C0502f3(InitOrigin.getActivity());
                    c0502f3.b = AbstractC0302v0.Y0("uc");
                    c0502f3.d = AbstractC0302v0.X0("uc");
                    c0502f3.e = true;
                    c0502f3.c = "加载中...";
                    c0512h3Arr[0] = c0502f3.a();
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                try {
                    C0502f3 c0502f4 = new C0502f3(InitOrigin.getActivity());
                    c0502f4.b = AbstractC0302v0.Y0("yidong");
                    c0502f4.d = AbstractC0302v0.X0("yidong");
                    c0502f4.e = true;
                    c0502f4.c = "加载中...";
                    c0512h3Arr[0] = c0502f4.a();
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 2:
                String strK = null;
                C0512h3[] c0512h3Arr2 = this.b;
                try {
                    t1.u().getClass();
                    LinkedHashMap linkedHashMapE = t1.E();
                    t1.u().getClass();
                    boolean zF = t1.F();
                    C0256f1 c0256f1E = C0256f1.e(linkedHashMapE, zF, "移动用户", new String[0]);
                    String strC = zF ? c0256f1E.c("移动用户") : null;
                    ArrayList arrayList = new ArrayList();
                    if (zF) {
                        arrayList.add(new C0517i3("登录状态", AbstractC0583w0.d, "已登录", false));
                        P1.s("用户名", P1.r0(strC), arrayList);
                        P1.o(arrayList, c0256f1E, AbstractC0302v0.X0("yidong"));
                        if (c0256f1E.o || c0256f1E.g == null) {
                            arrayList.add(new C0517i3("会员状态", AbstractC0583w0.i, "接口未返回", false));
                        }
                        P1.i(arrayList, c0256f1E, "网盘空间");
                    }
                    if (zF) {
                        t1.u().getClass();
                        strK = t1.k();
                    }
                    InitOrigin.run(new RunnableC0487c3(c0512h3Arr2, zF, strC, arrayList, strK, 3));
                } catch (Exception e) {
                    InitOrigin.run(new RunnableC0492d3(c0512h3Arr2, e, 3));
                    return;
                }
                break;
            case 3:
                try {
                    C0502f3 c0502f5 = new C0502f3(InitOrigin.getActivity());
                    c0502f5.b = AbstractC0302v0.Y0("guangya");
                    c0502f5.d = AbstractC0302v0.X0("guangya");
                    c0502f5.e = true;
                    c0502f5.c = "加载中...";
                    c0512h3Arr[0] = c0502f5.a();
                } catch (Exception unused3) {
                    return;
                }
                break;
            case 4:
                C0512h3[] c0512h3Arr3 = this.b;
                try {
                    C0342a0 c0342a0 = C0342a0.x;
                    LinkedHashMap linkedHashMapC = c0342a0.C();
                    Boolean bool = Boolean.TRUE;
                    boolean z = bool.equals(linkedHashMapC.get("isLoggedIn")) || bool.equals(linkedHashMapC.get("hasCookie"));
                    C0256f1 c0256f1E2 = C0256f1.e(linkedHashMapC, z, "光鸭用户", new String[0]);
                    String strW = P1.W(linkedHashMapC, "name", "displayName");
                    String str4 = P1.o0(strW) ? "光鸭用户" : strW;
                    String str5 = z ? str4 : null;
                    String strR = z ? c0342a0.r() : null;
                    ArrayList arrayList2 = new ArrayList();
                    if (z) {
                        arrayList2.add(new C0517i3("登录状态", AbstractC0583w0.d, "已登录", false));
                        P1.f(arrayList2, c0256f1E2, false, false, str4);
                        P1.o(arrayList2, c0256f1E2, AbstractC0302v0.X0("guangya"));
                        P1.i(arrayList2, c0256f1E2, "网盘空间");
                        String strW2 = P1.W(linkedHashMapC, "direct_link_traffic");
                        if (strW2 != null && !strW2.isEmpty()) {
                            arrayList2.add(new C0517i3("直链流量", AbstractC0583w0.h, strW2, false));
                        }
                        String strW3 = P1.W(linkedHashMapC, "share_guest_traffic");
                        if (strW3 != null && !strW3.isEmpty()) {
                            arrayList2.add(new C0517i3("免登下载流量", AbstractC0583w0.h, strW3, false));
                        }
                        P1.k("扫码/Token", arrayList2);
                    }
                    InitOrigin.run(new RunnableC0487c3(c0512h3Arr3, z, str5, arrayList2, strR, 7));
                } catch (Exception e2) {
                    InitOrigin.run(new RunnableC0492d3(c0512h3Arr3, e2, 7));
                    return;
                }
                break;
            case 5:
                try {
                    C0502f3 c0502f6 = new C0502f3(InitOrigin.getActivity());
                    c0502f6.b = AbstractC0302v0.Y0("xunlei");
                    c0502f6.d = AbstractC0302v0.X0("xunlei");
                    c0502f6.e = true;
                    c0502f6.c = "加载中...";
                    c0512h3Arr[0] = c0502f6.a();
                } catch (Exception unused4) {
                    return;
                }
                break;
            case 6:
                C0512h3[] c0512h3Arr4 = this.b;
                try {
                    C0256f1 c0256f1E3 = C0256f1.e(l1.I().U(), true, "迅雷用户", new String[0]);
                    String strC2 = c0256f1E3.c("迅雷用户");
                    String str6 = c0256f1E3.n;
                    ArrayList arrayList3 = new ArrayList();
                    P1.e(arrayList3, c0256f1E3);
                    P1.o(arrayList3, c0256f1E3, AbstractC0583w0.d);
                    P1.i(arrayList3, c0256f1E3, "存储容量");
                    InitOrigin.run(new RunnableC0240a0(c0512h3Arr4, strC2, arrayList3, str6, 15));
                } catch (Exception e3) {
                    InitOrigin.run(new RunnableC0492d3(c0512h3Arr4, e3, 8));
                    return;
                }
                break;
            case 7:
                try {
                    C0502f3 c0502f7 = new C0502f3(InitOrigin.getActivity());
                    c0502f7.b = AbstractC0302v0.Y0("ali");
                    c0502f7.d = AbstractC0302v0.X0("ali");
                    c0502f7.e = true;
                    c0502f7.c = "加载中...";
                    c0512h3Arr[0] = c0502f7.a();
                } catch (Exception unused5) {
                    return;
                }
                break;
            case 8:
                C0512h3[] c0512h3Arr5 = this.b;
                try {
                    C0256f1 c0256f1E4 = C0256f1.e(C0349e.j().y(), false, "阿里用户", new String[0]);
                    boolean z2 = c0256f1E4.b;
                    String strC3 = z2 ? c0256f1E4.c("阿里用户") : null;
                    String str7 = z2 ? c0256f1E4.m : null;
                    ArrayList arrayList4 = new ArrayList();
                    if (z2) {
                        P1.e(arrayList4, c0256f1E4);
                        P1.o(arrayList4, c0256f1E4, AbstractC0302v0.X0("ali"));
                        if (c0256f1E4.o || c0256f1E4.g == null) {
                            arrayList4.add(new C0517i3("会员状态", AbstractC0583w0.i, "接口未返回", false));
                        }
                        P1.i(arrayList4, c0256f1E4, "存储容量");
                    }
                    InitOrigin.run(new RunnableC0487c3(c0512h3Arr5, z2, strC3, arrayList4, str7, 0));
                } catch (Exception e4) {
                    InitOrigin.run(new RunnableC0492d3(c0512h3Arr5, e4, 0));
                    return;
                }
                break;
            case 9:
                try {
                    C0502f3 c0502f8 = new C0502f3(InitOrigin.getActivity());
                    c0502f8.b = AbstractC0302v0.Y0("115");
                    c0502f8.d = AbstractC0302v0.X0("115");
                    c0502f8.e = true;
                    c0502f8.c = "加载中...";
                    c0512h3Arr[0] = c0502f8.a();
                } catch (Exception unused6) {
                    return;
                }
                break;
            case 10:
                C0512h3[] c0512h3Arr6 = this.b;
                try {
                    HashMap mapK = Z0.t().K();
                    C0256f1 c0256f1E5 = C0256f1.e(mapK, false, "UC用户", new String[0]);
                    boolean z3 = c0256f1E5.b;
                    Boolean bool2 = Boolean.TRUE;
                    boolean zEquals = bool2.equals(mapK.get("hasToken"));
                    boolean zEquals2 = bool2.equals(mapK.get("isSvip"));
                    String strC4 = z3 ? c0256f1E5.c("UC用户") : null;
                    String str8 = z3 ? c0256f1E5.m : null;
                    ArrayList arrayList5 = new ArrayList();
                    if (z3) {
                        P1.e(arrayList5, c0256f1E5);
                        P1.o(arrayList5, c0256f1E5, AbstractC0302v0.X0("uc"));
                        boolean z4 = c0256f1E5.h;
                        if (!z4) {
                            str3 = "30G内";
                        }
                        arrayList5.add(new C0517i3("原画播放", z4 ? AbstractC0583w0.d : AbstractC0583w0.f, str3, false));
                        if (zEquals2) {
                            str = "SVIP无需授权(已走PC转码)";
                            i = AbstractC0583w0.d;
                        } else if (zEquals) {
                            str = "已授权";
                            i = AbstractC0583w0.d;
                        } else {
                            str = "未授权(需单独扫码)";
                            i = AbstractC0583w0.f;
                        }
                        arrayList5.add(new C0517i3("智能画质", i, str, false));
                        P1.i(arrayList5, c0256f1E5, "存储容量");
                    }
                    InitOrigin.run(new RunnableC0487c3(c0512h3Arr6, z3, strC4, arrayList5, str8, 2));
                } catch (Exception e5) {
                    InitOrigin.run(new RunnableC0492d3(c0512h3Arr6, e5, 2));
                    return;
                }
                break;
            case 11:
                C0512h3[] c0512h3Arr7 = this.b;
                try {
                    C0256f1 c0256f1E6 = C0256f1.e(C0364l0.C().M(), false, "115用户", new String[0]);
                    boolean z5 = c0256f1E6.b;
                    String strC5 = z5 ? c0256f1E6.c("115用户") : null;
                    String str9 = z5 ? c0256f1E6.m : null;
                    ArrayList arrayList6 = new ArrayList();
                    if (z5) {
                        arrayList6.add(new C0517i3("登录状态", AbstractC0583w0.d, "已登录", false));
                        P1.e(arrayList6, c0256f1E6);
                        P1.o(arrayList6, c0256f1E6, AbstractC0302v0.X0("115"));
                        P1.i(arrayList6, c0256f1E6, "存储容量");
                        P1.k("Cookie", arrayList6);
                    }
                    InitOrigin.run(new RunnableC0487c3(c0512h3Arr7, z5, strC5, arrayList6, str9, 4));
                } catch (Exception e6) {
                    InitOrigin.run(new RunnableC0492d3(c0512h3Arr7, e6, 4));
                    return;
                }
                break;
            case 12:
                try {
                    C0502f3 c0502f9 = new C0502f3(InitOrigin.getActivity());
                    c0502f9.b = AbstractC0302v0.Y0("quark");
                    c0502f9.d = AbstractC0302v0.X0("quark");
                    c0502f9.e = true;
                    c0502f9.c = "加载中...";
                    c0512h3Arr[0] = c0502f9.a();
                } catch (Exception unused7) {
                    return;
                }
                break;
            case 13:
                C0512h3[] c0512h3Arr8 = this.b;
                try {
                    C0256f1 c0256f1E7 = C0256f1.e(A0.s().N(), false, "夸克用户", new String[0]);
                    boolean z6 = c0256f1E7.b;
                    String strC6 = z6 ? c0256f1E7.c("夸克用户") : null;
                    String str10 = z6 ? c0256f1E7.m : null;
                    ArrayList arrayList7 = new ArrayList();
                    if (z6) {
                        P1.e(arrayList7, c0256f1E7);
                        P1.o(arrayList7, c0256f1E7, AbstractC0302v0.X0("quark"));
                        arrayList7.add(new C0517i3("原画播放", AbstractC0583w0.d, "无限制", false));
                        P1.i(arrayList7, c0256f1E7, "存储容量");
                    }
                    InitOrigin.run(new RunnableC0487c3(c0512h3Arr8, z6, strC6, arrayList7, str10, 5));
                } catch (Exception e7) {
                    InitOrigin.run(new RunnableC0492d3(c0512h3Arr8, e7, 5));
                    return;
                }
                break;
            case 14:
                try {
                    C0502f3 c0502f10 = new C0502f3(InitOrigin.getActivity());
                    c0502f10.b = AbstractC0302v0.Y0("baidu");
                    c0502f10.d = AbstractC0302v0.X0("baidu");
                    c0502f10.e = true;
                    c0502f10.c = "加载中...";
                    c0512h3Arr[0] = c0502f10.a();
                } catch (Exception unused8) {
                    return;
                }
                break;
            case 15:
                C0512h3[] c0512h3Arr9 = this.b;
                try {
                    C0256f1 c0256f1E8 = C0256f1.e(C0353g.a().h(), false, "百度用户", new String[0]);
                    boolean z7 = c0256f1E8.b;
                    String strC7 = z7 ? c0256f1E8.c("百度用户") : null;
                    String str11 = z7 ? c0256f1E8.m : null;
                    ArrayList arrayList8 = new ArrayList();
                    if (z7) {
                        P1.e(arrayList8, c0256f1E8);
                        P1.o(arrayList8, c0256f1E8, AbstractC0302v0.X0("baidu"));
                        P1.i(arrayList8, c0256f1E8, "存储容量");
                    }
                    InitOrigin.run(new RunnableC0487c3(c0512h3Arr9, z7, strC7, arrayList8, str11, 8));
                } catch (Exception e8) {
                    InitOrigin.run(new RunnableC0492d3(c0512h3Arr9, e8, 9));
                    return;
                }
                break;
            case 16:
                try {
                    C0502f3 c0502f11 = new C0502f3(InitOrigin.getActivity());
                    c0502f11.b = AbstractC0302v0.Y0("pan123");
                    c0502f11.d = AbstractC0302v0.X0("pan123");
                    c0502f11.e = true;
                    c0502f11.c = "加载中...";
                    c0512h3Arr[0] = c0502f11.a();
                } catch (Exception unused9) {
                    return;
                }
                break;
            case 17:
                a();
                break;
            case 18:
                b();
                break;
            default:
                C0512h3[] c0512h3Arr10 = this.b;
                try {
                    C0256f1 c0256f1E9 = C0256f1.e(L0.q().x(), false, "天翼用户", "account");
                    boolean z8 = c0256f1E9.b;
                    String strC8 = z8 ? c0256f1E9.c("天翼用户") : null;
                    ArrayList arrayList9 = new ArrayList();
                    if (z8) {
                        P1.e(arrayList9, c0256f1E9);
                        P1.o(arrayList9, c0256f1E9, AbstractC0302v0.X0("tianyi"));
                        if (c0256f1E9.o || c0256f1E9.g == null) {
                            arrayList9.add(new C0517i3("会员状态", AbstractC0583w0.i, "接口未返回", false));
                        }
                        P1.i(arrayList9, c0256f1E9, "存储容量");
                    }
                    if (z8) {
                        L0 l0Q = L0.q();
                        l0Q.getClass();
                        String str12 = "";
                        try {
                            String strH = C0297t1.h("tianyi_auth");
                            if (c.d(strH)) {
                                str12 = strH;
                            } else {
                                l0Q.W(null, null, null);
                                String strH2 = C0297t1.h("tianyi_auth");
                                if (c.d(strH2)) {
                                    str12 = strH2;
                                }
                            }
                        } catch (Exception unused10) {
                        }
                        str2 = str12;
                    } else {
                        str2 = null;
                    }
                    InitOrigin.run(new RunnableC0487c3(c0512h3Arr10, z8, strC8, arrayList9, str2, 6));
                } catch (Exception e9) {
                    InitOrigin.run(new RunnableC0492d3(c0512h3Arr10, e9, 6));
                }
                break;
        }
    }
}
