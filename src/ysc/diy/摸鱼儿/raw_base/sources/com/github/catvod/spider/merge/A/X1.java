package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.T.AbstractC0324i;
import com.github.catvod.spider.merge.T.AbstractC0325j;
import com.github.catvod.spider.merge.T.C0316a;
import com.github.catvod.spider.merge.T.C0317b;
import com.github.catvod.spider.merge.g0.C0399b;
import com.github.catvod.spider.merge.j0.C0448a;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.DialogInterfaceOnDismissListenerC0472y;
import com.github.catvod.spider.merge.p017u.RunnableC0462n;
import com.github.catvod.spider.merge.p017u.ViewOnClickListenerC0467t;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0568t0;
import com.github.catvod.spider.merge.p022z.InterfaceC0555q1;
import com.github.catvod.spider.merge.p022z.InterfaceC0600z2;
import com.github.catvod.spider.merge.p022z.RunnableC0500f1;
import com.github.catvod.spider.merge.p022z.RunnableC0563s0;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class X1 implements com.github.catvod.spider.merge.h0.o, com.github.catvod.spider.merge.p022z.J1, com.github.catvod.spider.merge.p022z.Q0, InterfaceC0555q1, InterfaceC0600z2 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ X1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static String B(int i, JSONObject jSONObject) {
        String strTrim = jSONObject != null ? jSONObject.optString("name", "").trim() : "";
        if (strTrim.length() > 0) {
            return strTrim;
        }
        return "Emby服务器" + (i + 1);
    }

    public static String D(String str, HashMap map, CookieJar cookieJar) {
        Map multimap = r(cookieJar).newBuilder().followRedirects(false).followSslRedirects(false).build().newCall(com.github.catvod.spider.merge.D.b.u(str).headers(Headers.of(map)).build()).execute().headers().toMultimap();
        if (multimap == null) {
            return null;
        }
        if (multimap.containsKey("location")) {
            return (String) ((List) multimap.get("location")).get(0);
        }
        if (multimap.containsKey("Location")) {
            return (String) ((List) multimap.get("Location")).get(0);
        }
        return null;
    }

    public static String E(String str, Map map) {
        Response responseExecute = q().newBuilder().followRedirects(false).followSslRedirects(false).build().newCall(com.github.catvod.spider.merge.D.b.u(str).headers(Headers.of(map)).build()).execute();
        try {
            Map multimap = responseExecute.headers().toMultimap();
            String str2 = null;
            if (multimap != null) {
                if (multimap.containsKey("location")) {
                    str2 = (String) ((List) multimap.get("location")).get(0);
                } else if (multimap.containsKey("Location")) {
                    str2 = (String) ((List) multimap.get("Location")).get(0);
                }
            }
            responseExecute.close();
            return str2;
        } catch (Throwable th) {
            if (responseExecute != null) {
                try {
                    responseExecute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static Map F(String str, HashMap map) {
        Response responseExecute = q().newBuilder().followRedirects(false).followSslRedirects(false).build().newCall(com.github.catvod.spider.merge.D.b.u(str).headers(Headers.of(map)).build()).execute();
        try {
            Map multimap = responseExecute.headers().toMultimap();
            responseExecute.close();
            return multimap;
        } catch (Throwable th) {
            if (responseExecute != null) {
                try {
                    responseExecute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean G(String str, String str2) {
        for (String str3 : str.split(",")) {
            if (str2.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public static Response H(String str, Map map) {
        return q().newCall(com.github.catvod.spider.merge.D.b.u(str).headers(Headers.of(map)).build()).execute();
    }

    public static Response I(Request request) {
        return q().newCall(request).execute();
    }

    public static Response J(Request request, long j) {
        long jMax = Math.max(1L, j);
        OkHttpClient.Builder builderNewBuilder = q().newBuilder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return builderNewBuilder.callTimeout(jMax, timeUnit).connectTimeout(jMax, timeUnit).readTimeout(jMax, timeUnit).writeTimeout(jMax, timeUnit).build().newCall(request).execute();
    }

    public static Response K(Request request, long j) {
        long jMax = Math.max(1L, Math.min(j, 30000L));
        OkHttpClient.Builder builderFollowSslRedirects = q().newBuilder().followRedirects(false).followSslRedirects(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return builderFollowSslRedirects.callTimeout(jMax, timeUnit).connectTimeout(jMax, timeUnit).readTimeout(jMax, timeUnit).writeTimeout(jMax, timeUnit).build().newCall(request).execute();
    }

    public static com.github.catvod.spider.merge.f0.g L(String str, String str2) {
        C0399b c0399b = new C0399b();
        c0399b.r(new StringReader(str), str2, new X1(c0399b));
        c0399b.N();
        c0399b.b.d();
        c0399b.b = null;
        c0399b.c = null;
        c0399b.e = null;
        c0399b.i = null;
        return c0399b.d;
    }

    public static com.github.catvod.spider.merge.p000a.N M(String str, String str2, Map map) {
        Request.Builder builder = new Request.Builder();
        builder.post(!TextUtils.isEmpty(str2) ? RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str2) : new FormBody.Builder().build());
        if (map != null) {
            for (String str3 : map.keySet()) {
                builder.addHeader(str3, (String) map.get(str3));
            }
        }
        try {
            Response responseExecute = q().newCall(builder.url(str).build()).execute();
            return new com.github.catvod.spider.merge.p000a.N(responseExecute.code(), responseExecute.body() != null ? responseExecute.body().string() : "", responseExecute.headers().toMultimap());
        } catch (Exception unused) {
            return new com.github.catvod.spider.merge.p000a.N();
        }
    }

    public static com.github.catvod.spider.merge.p000a.N N(String str, Map map, HashMap map2) {
        RequestBody requestBodyBuild;
        Request.Builder builder = new Request.Builder();
        if (TextUtils.isEmpty(null)) {
            FormBody.Builder builder2 = new FormBody.Builder();
            if (map != null) {
                for (String str2 : map.keySet()) {
                    builder2.add(str2, (String) map.get(str2));
                }
            }
            requestBodyBuild = builder2.build();
        } else {
            requestBodyBuild = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), (String) null);
        }
        builder.post(requestBodyBuild);
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                builder.addHeader(str3, (String) map2.get(str3));
            }
        }
        try {
            Response responseExecute = q().newCall(builder.url(str).build()).execute();
            return new com.github.catvod.spider.merge.p000a.N(responseExecute.code(), responseExecute.body() != null ? responseExecute.body().string() : "", responseExecute.headers().toMultimap());
        } catch (Exception unused) {
            return new com.github.catvod.spider.merge.p000a.N();
        }
    }

    public static com.github.catvod.spider.merge.p000a.N O(String str, Map map, HashMap map2, CookieJar cookieJar) {
        RequestBody requestBodyBuild;
        Request.Builder builder = new Request.Builder();
        if (TextUtils.isEmpty(null)) {
            FormBody.Builder builder2 = new FormBody.Builder();
            if (map != null) {
                for (String str2 : map.keySet()) {
                    builder2.add(str2, (String) map.get(str2));
                }
            }
            requestBodyBuild = builder2.build();
        } else {
            requestBodyBuild = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), (String) null);
        }
        builder.post(requestBodyBuild);
        for (String str3 : map2.keySet()) {
            builder.addHeader(str3, (String) map2.get(str3));
        }
        try {
            Response responseExecute = r(cookieJar).newCall(builder.url(str).build()).execute();
            return new com.github.catvod.spider.merge.p000a.N(responseExecute.code(), responseExecute.body() != null ? responseExecute.body().string() : "", responseExecute.headers().toMultimap());
        } catch (Exception unused) {
            return new com.github.catvod.spider.merge.p000a.N();
        }
    }

    public static String P(String str, String str2) {
        return M(str, str2, null).a();
    }

    public static int R(EditText editText, String str) throws Exception {
        try {
            int i = Integer.parseInt(AbstractC0449a.e(editText));
            if (i > 0) {
                return i;
            }
            throw new NumberFormatException();
        } catch (Exception unused) {
            throw new Exception("请输入有效的".concat(str));
        }
    }

    public static Activity S() throws Exception {
        Activity activity = InitOrigin.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new Exception("无法获取Activity");
    }

    public static C0568t0 V(String str, int i, String str2) {
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity == null) {
                X0.a(str2);
                return null;
            }
            C0568t0 c0568t0I0 = AbstractC0583w0.i0(activity, str, str2, i);
            c0568t0I0.b.postDelayed(new RunnableC0563s0(c0568t0I0), Math.max(16L, 120L));
            return c0568t0I0;
        } catch (Exception unused) {
            X0.a(str2);
            return null;
        }
    }

    public static String W(String str, HashMap map, CookieJar cookieJar) {
        com.github.catvod.spider.merge.p000a.N n;
        if (!str.startsWith("http")) {
            return "";
        }
        Request.Builder builder = new Request.Builder();
        for (String str2 : map.keySet()) {
            builder.addHeader(str2, (String) map.get(str2));
        }
        try {
            Response responseExecute = r(cookieJar).newCall(builder.url(str).build()).execute();
            n = new com.github.catvod.spider.merge.p000a.N(responseExecute.code(), responseExecute.body() != null ? responseExecute.body().string() : "", responseExecute.headers().toMultimap());
        } catch (Exception unused) {
            n = new com.github.catvod.spider.merge.p000a.N();
        }
        return n.a();
    }

    public static String X(String str, Map map, Map map2) {
        com.github.catvod.spider.merge.p000a.N n;
        if (!str.startsWith("http")) {
            return "";
        }
        Request.Builder builder = new Request.Builder();
        if (map != null) {
            String strI = com.github.catvod.spider.merge.D.b.i(str, "?");
            for (String str2 : map.keySet()) {
                StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(str2, "=");
                sbP.append((String) map.get(str2));
                sbP.append("&");
                strI = strI.concat(sbP.toString());
            }
            str = AbstractC0309x1.o(strI);
        }
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                builder.addHeader(str3, (String) map2.get(str3));
            }
        }
        try {
            Response responseExecute = q().newCall(builder.url(str).build()).execute();
            n = new com.github.catvod.spider.merge.p000a.N(responseExecute.code(), responseExecute.body() != null ? responseExecute.body().string() : "", responseExecute.headers().toMultimap());
        } catch (Exception unused) {
            n = new com.github.catvod.spider.merge.p000a.N();
        }
        return n.a();
    }

    public static void h(X1 x1) throws Exception {
        x1.v();
        com.github.catvod.spider.merge.p007h.a embyManagePrefs = ((com.github.catvod.spider.merge.p022z.P0) x1.b).getEmbyManagePrefs();
        if (embyManagePrefs == null) {
            embyManagePrefs = com.github.catvod.spider.merge.p007h.a.a(null, null);
        }
        String strU = u(embyManagePrefs.a);
        String strU2 = u(embyManagePrefs.b);
        StringBuilder sb = new StringBuilder("搜索");
        sb.append(embyManagePrefs.c);
        sb.append("条 · 每页");
        com.github.catvod.spider.merge.p022z.P1.K0("内容与搜索", "管理类型和数量", new String[]{"浏览内容", "搜索内容", "数量设置"}, new String[]{strU, strU2, com.github.catvod.spider.merge.D.b.l(sb, embyManagePrefs.d, "条")}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d, AbstractC0583w0.f}, new Runnable[]{new RunnableC0462n(x1, 4), new RunnableC0462n(x1, 5), new RunnableC0462n(x1, 6)});
    }

    public static void i(X1 x1) throws Exception {
        x1.v();
        Activity activityS = S();
        int iQ = AbstractC0583w0.Q(8, activityS);
        ArrayList arrayListC = x1.C();
        HashSet hashSet = new HashSet();
        List disabledServers = ((com.github.catvod.spider.merge.p022z.P0) x1.b).getDisabledServers();
        if (disabledServers != null) {
            for (int i = 0; i < disabledServers.size(); i++) {
                String str = (String) disabledServers.get(i);
                if (str != null && str.trim().length() > 0) {
                    hashSet.add(str.trim());
                }
            }
        }
        LinearLayout linearLayoutK = AbstractC0583w0.K(activityS);
        linearLayoutK.addView(AbstractC0583w0.p(activityS, "媒体库刷新", "点击服务器刷新媒体库列表缓存"), AbstractC0583w0.c0(iQ));
        TextView textViewF = AbstractC0583w0.F(activityS, "全部刷新", AbstractC0583w0.d, -1);
        textViewF.setGravity(17);
        textViewF.setOnClickListener(new com.github.catvod.spider.merge.p022z.L0(x1, arrayListC, hashSet, 1));
        linearLayoutK.addView(textViewF, AbstractC0583w0.c0(iQ));
        LinearLayout linearLayout = new LinearLayout(activityS);
        linearLayout.setOrientation(1);
        if (arrayListC.isEmpty()) {
            linearLayout.addView(AbstractC0583w0.D(activityS, "暂无Emby服务器"));
        } else {
            int i2 = 0;
            while (i2 < arrayListC.size()) {
                JSONObject jSONObject = (JSONObject) arrayListC.get(i2);
                String strB = B(i2, jSONObject);
                String strTrim = jSONObject != null ? jSONObject.optString("server", "").trim() : "";
                String strReplace = strTrim.length() == 0 ? "未配置地址" : strTrim.replace("https://", "").replace("http://", "");
                boolean zContains = hashSet.contains(strB);
                AbstractC0583w0.d(linearLayout, strB, com.github.catvod.spider.merge.D.b.m(new StringBuilder(), zContains ? "已禁用 · " : "已启用 · ", strReplace), zContains ? AbstractC0583w0.i : AbstractC0583w0.d, i2 > 0).setOnClickListener(new com.github.catvod.spider.merge.p022z.N0(x1, arrayListC, i2));
                i2++;
            }
        }
        linearLayoutK.addView(AbstractC0583w0.s(activityS, linearLayout));
        AbstractC0583w0.j0(new AlertDialog.Builder(activityS).setView(AbstractC0583w0.q0(linearLayoutK)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).create());
    }

    public static void j(X1 x1) throws Exception {
        int iMax;
        int iMax2;
        com.github.catvod.spider.merge.p022z.P0 p0 = (com.github.catvod.spider.merge.p022z.P0) x1.b;
        x1.v();
        Activity activityS = S();
        int iQ = AbstractC0583w0.Q(8, activityS);
        ArrayList arrayListC = x1.C();
        LinearLayout linearLayoutK = AbstractC0583w0.K(activityS);
        linearLayoutK.addView(AbstractC0583w0.p(activityS, "缓存清理", "清理内存会话和媒体库缓存，不会退出登录"), AbstractC0583w0.c0(iQ));
        LinearLayout linearLayoutY = AbstractC0583w0.y(activityS);
        try {
            iMax = Math.max(0, p0.getEmbyAuthCacheCount());
        } catch (Exception unused) {
            iMax = 0;
        }
        AbstractC0583w0.j(linearLayoutY, "内存登录会话", String.valueOf(iMax), AbstractC0583w0.c);
        linearLayoutY.addView(AbstractC0583w0.C(activityS));
        try {
            iMax2 = Math.max(0, p0.getEmbyViewsCacheCount());
        } catch (Exception unused2) {
            iMax2 = 0;
        }
        AbstractC0583w0.j(linearLayoutY, "媒体库缓存", String.valueOf(iMax2), AbstractC0583w0.d);
        linearLayoutK.addView(linearLayoutY, AbstractC0583w0.c0(iQ));
        TextView textViewF = AbstractC0583w0.F(activityS, "全部清理", AbstractC0583w0.e, -1);
        textViewF.setGravity(17);
        textViewF.setOnClickListener(new com.github.catvod.spider.merge.p022z.O0(0, x1));
        linearLayoutK.addView(textViewF, AbstractC0583w0.c0(iQ));
        LinearLayout linearLayout = new LinearLayout(activityS);
        linearLayout.setOrientation(1);
        if (arrayListC.isEmpty()) {
            linearLayout.addView(AbstractC0583w0.D(activityS, "暂无Emby服务器"));
        } else {
            int i = 0;
            while (i < arrayListC.size()) {
                String strB = B(i, (JSONObject) arrayListC.get(i));
                AbstractC0583w0.d(linearLayout, strB, "清理内存会话和媒体库缓存", AbstractC0583w0.e, i > 0).setOnClickListener(new com.github.catvod.spider.merge.p022z.J0(x1, strB));
                i++;
            }
        }
        linearLayoutK.addView(AbstractC0583w0.s(activityS, linearLayout));
        AbstractC0583w0.j0(new AlertDialog.Builder(activityS).setView(AbstractC0583w0.q0(linearLayoutK)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).create());
    }

    public static void k(X1 x1) throws Exception {
        x1.v();
        Activity activityS = S();
        int iQ = AbstractC0583w0.Q(8, activityS);
        boolean[] embyPersonalStates = ((com.github.catvod.spider.merge.p022z.P0) x1.b).getEmbyPersonalStates();
        boolean[] zArr = (embyPersonalStates == null || embyPersonalStates.length < 4) ? new boolean[]{true, true, true, true} : (boolean[]) embyPersonalStates.clone();
        LinearLayout linearLayoutK = AbstractC0583w0.K(activityS);
        linearLayoutK.addView(AbstractC0583w0.p(activityS, "内容入口", "选择“我的 Emby”中显示的聚合内容"), AbstractC0583w0.c0(iQ));
        LinearLayout linearLayoutY = AbstractC0583w0.y(activityS);
        int i = AbstractC0583w0.c;
        boolean[] zArr2 = zArr;
        AbstractC0583w0.m(linearLayoutY, "继续观看", "显示所有服务器的继续观看内容", i, zArr[0], 0, false, null, zArr2, null);
        AbstractC0583w0.m(linearLayoutY, "下一集", "聚合剧集的下一集", AbstractC0583w0.d, zArr[1], 1, true, null, zArr2, null);
        AbstractC0583w0.m(linearLayoutY, "最新内容", "聚合最近加入服务器的影视", AbstractC0583w0.f, zArr[2], 2, true, null, zArr2, null);
        AbstractC0583w0.m(linearLayoutY, "我的收藏", "聚合各服务器收藏内容", i, zArr[3], 3, true, null, zArr2, null);
        linearLayoutK.addView(linearLayoutY);
        AbstractC0583w0.l(linearLayoutK, "关闭全部四个内容入口后，“我的 Emby”分类会自动隐藏");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activityS).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
        AbstractC0583w0.j0(alertDialogCreate);
        alertDialogCreate.getButton(-1).setOnClickListener(new com.github.catvod.spider.merge.p022z.L0(x1, zArr, alertDialogCreate, 0));
    }

    public static void l(X1 x1, String str) {
        x1.getClass();
        try {
            ((com.github.catvod.spider.merge.p022z.P0) x1.b).refreshEmbyViews(str, new X1(11, str));
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.x(e, new StringBuilder("刷新失败: "));
        }
    }

    public static OkHttpClient n(CookieJar cookieJar) {
        OkHttpClient.Builder builderDns = new OkHttpClient.Builder().cookieJar(cookieJar).dns(Dns.SYSTEM);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new com.github.catvod.spider.merge.p016t.a(0)).sslSocketFactory(new com.github.catvod.spider.merge.p016t.e(), com.github.catvod.spider.merge.p016t.e.d).build();
    }

    public static OkHttpClient q() {
        X1 x1 = com.github.catvod.spider.merge.p016t.b.a;
        OkHttpClient okHttpClient = (OkHttpClient) x1.b;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        OkHttpClient.Builder builderDns = new OkHttpClient.Builder().dns(Dns.SYSTEM);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderDns.connectionPool(new ConnectionPool(32, 60L, timeUnit)).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new com.github.catvod.spider.merge.p016t.a(0)).sslSocketFactory(new com.github.catvod.spider.merge.p016t.e(), com.github.catvod.spider.merge.p016t.e.d).build();
        x1.b = okHttpClientBuild;
        return okHttpClientBuild;
    }

    public static OkHttpClient r(CookieJar cookieJar) {
        OkHttpClient okHttpClientN;
        if (cookieJar == null) {
            cookieJar = CookieJar.NO_COOKIES;
        }
        Map map = (Map) com.github.catvod.spider.merge.p016t.c.a.b;
        synchronized (map) {
            try {
                okHttpClientN = (OkHttpClient) map.get(cookieJar);
                if (okHttpClientN == null) {
                    okHttpClientN = n(cookieJar);
                    map.put(cookieJar, okHttpClientN);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return okHttpClientN;
    }

    public static X1 s(String str) {
        return new X1(5, L(str, "").D());
    }

    public static com.github.catvod.spider.merge.p007h.a t(String str, int i, int i2, String str2) throws JSONException {
        JSONObject jSONObjectV = com.github.catvod.spider.merge.D.b.v("embyItemTypesLocal", str, "embySearchTypesLocal", str2);
        jSONObjectV.put("embySearchLimitLocal", i);
        jSONObjectV.put("embyPageSizeLocal", i2);
        return com.github.catvod.spider.merge.p007h.a.a(jSONObjectV, null);
    }

    public static String u(String str) {
        ArrayList arrayList = new ArrayList();
        if (G(str, "Movie")) {
            arrayList.add("电影");
        }
        if (G(str, "Series")) {
            arrayList.add("剧集");
        }
        if (G(str, "BoxSet")) {
            arrayList.add("合集");
        }
        return arrayList.isEmpty() ? "未设置" : TextUtils.join("、", arrayList);
    }

    public static com.github.catvod.spider.merge.p000a.N w(Request request, int i) {
        try {
            OkHttpClient.Builder builderNewBuilder = q().newBuilder();
            long j = i;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Response responseExecute = builderNewBuilder.connectTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).build().newCall(request).execute();
            return new com.github.catvod.spider.merge.p000a.N(responseExecute.code(), responseExecute.body() != null ? responseExecute.body().string() : "", responseExecute.headers().toMultimap());
        } catch (Exception unused) {
            return new com.github.catvod.spider.merge.p000a.N();
        }
    }

    public static com.github.catvod.spider.merge.p000a.N y(String str, HashMap map, HashMap map2, CookieJar cookieJar) {
        Request.Builder builder = new Request.Builder();
        if (map != null) {
            String strI = com.github.catvod.spider.merge.D.b.i(str, "?");
            for (String str2 : map.keySet()) {
                StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(str2, "=");
                sbP.append((String) map.get(str2));
                sbP.append("&");
                strI = strI.concat(sbP.toString());
            }
            str = AbstractC0309x1.o(strI);
        }
        for (String str3 : map2.keySet()) {
            builder.addHeader(str3, (String) map2.get(str3));
        }
        try {
            Response responseExecute = r(cookieJar).newCall(builder.url(str).build()).execute();
            return new com.github.catvod.spider.merge.p000a.N(responseExecute.code(), responseExecute.body() != null ? responseExecute.body().string() : "", responseExecute.headers().toMultimap());
        } catch (Exception unused) {
            return new com.github.catvod.spider.merge.p000a.N();
        }
    }

    public static com.github.catvod.spider.merge.p000a.N z(String str, Map map, Map map2) {
        Request.Builder builder = new Request.Builder();
        if (map != null) {
            String strI = com.github.catvod.spider.merge.D.b.i(str, "?");
            for (String str2 : map.keySet()) {
                StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(str2, "=");
                sbP.append((String) map.get(str2));
                sbP.append("&");
                strI = strI.concat(sbP.toString());
            }
            str = AbstractC0309x1.o(strI);
        }
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                builder.addHeader(str3, (String) map2.get(str3));
            }
        }
        try {
            Response responseExecute = q().newCall(builder.url(str).build()).execute();
            return new com.github.catvod.spider.merge.p000a.N(responseExecute.code(), responseExecute.body() != null ? responseExecute.body().string() : "", responseExecute.headers().toMultimap());
        } catch (Exception unused) {
            return new com.github.catvod.spider.merge.p000a.N();
        }
    }

    public Object A(Object obj, Object obj2) {
        Map map = (Map) ((LinkedHashMap) this.b).get(obj);
        if (map == null) {
            return null;
        }
        return map.get(obj2);
    }

    public ArrayList C() {
        ArrayList arrayList = new ArrayList();
        List drives = ((com.github.catvod.spider.merge.p022z.P0) this.b).getDrives();
        if (drives == null) {
            return arrayList;
        }
        for (int i = 0; i < drives.size(); i++) {
            JSONObject jSONObject = (JSONObject) drives.get(i);
            if (jSONObject != null && "emby".equalsIgnoreCase(jSONObject.optString("type", ""))) {
                arrayList.add(jSONObject);
            }
        }
        return arrayList;
    }

    public void Q(Object obj, Object obj2, com.github.catvod.spider.merge.T.P p) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        Map linkedHashMap2 = (Map) linkedHashMap.get(obj);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(obj, linkedHashMap2);
        } else {
            linkedHashMap2.get(obj2);
        }
        linkedHashMap2.put(obj2, p);
    }

    public JSONObject T(String str) throws Exception {
        if (str == null || str.trim().isEmpty()) {
            throw new Exception("请输入直播分享链接");
        }
        JSONObject jSONObjectX = x(m("/resolve?url=" + com.github.catvod.spider.merge.p018v.b.f(str.trim())));
        JSONObject jSONObjectOptJSONObject = jSONObjectX == null ? null : jSONObjectX.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            throw new Exception("链接解析失败");
        }
        String strTrim = jSONObjectOptJSONObject.optString("site").trim();
        String strTrim2 = jSONObjectOptJSONObject.optString("room_id").trim();
        if (strTrim.isEmpty() || strTrim2.isEmpty()) {
            throw new Exception("链接解析结果不完整");
        }
        if (!com.github.catvod.spider.merge.p018v.b.i(strTrim)) {
            throw new Exception("暂不支持该直播平台");
        }
        jSONObjectOptJSONObject.put("site", strTrim);
        jSONObjectOptJSONObject.put("room_id", strTrim2);
        String strTrim3 = jSONObjectOptJSONObject.optString("canonical_url").trim();
        if (!strTrim3.isEmpty()) {
            jSONObjectOptJSONObject.put("canonical_url", strTrim3);
        }
        return jSONObjectOptJSONObject;
    }

    public LinkedList U(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            com.github.catvod.spider.merge.j0.A a = new com.github.catvod.spider.merge.j0.A(new com.github.catvod.spider.merge.S.e(new C0448a(com.github.catvod.spider.merge.l0.c.a(str))));
            a.d = new com.github.catvod.spider.merge.o0.a();
            com.github.catvod.spider.merge.k0.b bVar = (com.github.catvod.spider.merge.k0.b) a.v().a(new com.github.catvod.spider.merge.k0.c((com.github.catvod.spider.merge.h0.d) this.b));
            if (bVar == null) {
                linkedList.add(new com.github.catvod.spider.merge.i0.a(""));
                return linkedList;
            }
            Object obj = bVar.a;
            if (obj instanceof com.github.catvod.spider.merge.h0.d) {
                Iterator<E> it = ((com.github.catvod.spider.merge.h0.d) obj).iterator();
                while (it.hasNext()) {
                    linkedList.add(new com.github.catvod.spider.merge.i0.a((com.github.catvod.spider.merge.f0.k) it.next()));
                }
                return linkedList;
            }
            if (obj instanceof List) {
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    linkedList.add(new com.github.catvod.spider.merge.i0.a((String) it2.next()));
                }
                return linkedList;
            }
            if (obj instanceof String) {
                linkedList.add(new com.github.catvod.spider.merge.i0.a(bVar.e()));
                return linkedList;
            }
            if (obj instanceof Number) {
                Class<?> cls = obj == null ? Object.class : obj.getClass();
                if (cls.isAssignableFrom(Long.class) || cls.isAssignableFrom(Integer.class)) {
                    linkedList.add(new com.github.catvod.spider.merge.i0.a(bVar.d()));
                } else {
                    linkedList.add(new com.github.catvod.spider.merge.i0.a(bVar.c()));
                }
                return linkedList;
            }
            if (obj instanceof Boolean) {
                linkedList.add(new com.github.catvod.spider.merge.i0.a(bVar.a()));
                return linkedList;
            }
            if (obj instanceof Date) {
                linkedList.add(new com.github.catvod.spider.merge.i0.a(bVar.b()));
                return linkedList;
            }
            linkedList.add(new com.github.catvod.spider.merge.i0.a(bVar.e()));
            return linkedList;
        } catch (Exception e) {
            throw new com.github.catvod.spider.merge.c0.a("Please check the syntax of your xpath expr or commit a " + com.github.catvod.spider.merge.l0.h.a(e), e);
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0600z2
    public boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public boolean addApiUrl(String str) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public boolean addApiUrl(String str, String str2) {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).a(str, str2);
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0600z2
    public void b() {
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0555q1
    public void c(String str, boolean z) {
        switch (this.a) {
            case 11:
                String strTrim = (str == null || str.trim().length() <= 0) ? (String) this.b : str.trim();
                StringBuilder sb = new StringBuilder();
                sb.append(z ? "刷新成功: " : "刷新失败: ");
                sb.append(strTrim);
                X0.a(sb.toString());
                break;
            default:
                InitOrigin.run(new RunnableC0500f1(this, str, z));
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public boolean clearCustomApiUrls() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).d();
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public void clearCustomUrls() {
        ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).d();
    }

    @Override // com.github.catvod.spider.merge.h0.o
    public void d(com.github.catvod.spider.merge.f0.p pVar, int i) {
        boolean z = pVar instanceof com.github.catvod.spider.merge.f0.r;
        StringBuilder sb = (StringBuilder) this.b;
        if (z) {
            com.github.catvod.spider.merge.f0.r rVar = (com.github.catvod.spider.merge.f0.r) pVar;
            String strA = rVar.A();
            if (com.github.catvod.spider.merge.f0.k.O(rVar.a) || (rVar instanceof com.github.catvod.spider.merge.f0.c)) {
                sb.append(strA);
                return;
            } else {
                com.github.catvod.spider.merge.e0.b.a(sb, strA, com.github.catvod.spider.merge.f0.r.D(sb));
                return;
            }
        }
        if (pVar instanceof com.github.catvod.spider.merge.f0.k) {
            com.github.catvod.spider.merge.f0.k kVar = (com.github.catvod.spider.merge.f0.k) pVar;
            if (sb.length() > 0) {
                com.github.catvod.spider.merge.g0.E e = kVar.d;
                if ((e.c || e.b.equals("br")) && !com.github.catvod.spider.merge.f0.r.D(sb)) {
                    sb.append(' ');
                }
            }
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0600z2
    public void e(boolean z) {
        Runnable runnable = (Runnable) this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.github.catvod.spider.merge.h0.o
    public void f(com.github.catvod.spider.merge.f0.p pVar, int i) {
        if ((pVar instanceof com.github.catvod.spider.merge.f0.k) && ((com.github.catvod.spider.merge.f0.k) pVar).d.c && (pVar.o() instanceof com.github.catvod.spider.merge.f0.r)) {
            StringBuilder sb = (StringBuilder) this.b;
            if (com.github.catvod.spider.merge.f0.r.D(sb)) {
                return;
            }
            sb.append(' ');
        }
    }

    public void g(AbstractC0324i abstractC0324i, com.github.catvod.spider.merge.T.P p, com.github.catvod.spider.merge.V.f fVar, HashSet hashSet, BitSet bitSet) {
        com.github.catvod.spider.merge.V.f fVar2;
        com.github.catvod.spider.merge.T.W w;
        AbstractC0324i abstractC0324i2 = abstractC0324i;
        com.github.catvod.spider.merge.T.P p2 = p;
        if (hashSet.add(new C0317b(abstractC0324i2, 0, p2))) {
            if (abstractC0324i2 == null) {
                if (p2 == null) {
                    fVar.a(-2);
                    return;
                } else if (p.f()) {
                    fVar.a(-1);
                    return;
                }
            }
            boolean z = abstractC0324i2 instanceof com.github.catvod.spider.merge.T.V;
            C0316a c0316a = (C0316a) this.b;
            if (z) {
                if (p2 == null) {
                    fVar.a(-2);
                    return;
                }
                if (p.f()) {
                    fVar.a(-1);
                    return;
                }
                if (p2 != com.github.catvod.spider.merge.T.P.b) {
                    boolean z2 = bitSet.get(abstractC0324i2.c);
                    try {
                        bitSet.clear(abstractC0324i2.c);
                        for (int i = 0; i < p.h(); i++) {
                            g((AbstractC0324i) c0316a.a.get(p2.d(i)), p2.c(i), fVar, hashSet, bitSet);
                        }
                        if (z2) {
                            bitSet.set(abstractC0324i2.c);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (z2) {
                            bitSet.set(abstractC0324i2.c);
                        }
                        throw th;
                    }
                }
            }
            int size = abstractC0324i2.e.size();
            int i2 = 0;
            while (i2 < size) {
                com.github.catvod.spider.merge.T.k0 k0VarC = abstractC0324i2.c(i2);
                if (k0VarC.getClass() == com.github.catvod.spider.merge.T.W.class) {
                    com.github.catvod.spider.merge.T.W w2 = (com.github.catvod.spider.merge.T.W) k0VarC;
                    if (bitSet.get(w2.a.c)) {
                        continue;
                    } else {
                        com.github.catvod.spider.merge.T.e0 e0VarI = com.github.catvod.spider.merge.T.e0.i(p2, w2.c.b);
                        try {
                            bitSet.set(((com.github.catvod.spider.merge.T.W) k0VarC).a.c);
                            w = w2;
                            try {
                                g(k0VarC.a, e0VarI, fVar, hashSet, bitSet);
                                bitSet.clear(w.a.c);
                            } catch (Throwable th2) {
                                th = th2;
                                bitSet.clear(w.a.c);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            w = w2;
                        }
                    }
                } else if (k0VarC instanceof AbstractC0325j) {
                    g(k0VarC.a, p, fVar, hashSet, bitSet);
                } else if (k0VarC.b()) {
                    g(k0VarC.a, p, fVar, hashSet, bitSet);
                } else if (k0VarC.getClass() == com.github.catvod.spider.merge.T.l0.class) {
                    int i3 = c0316a.f;
                    com.github.catvod.spider.merge.V.f fVar3 = new com.github.catvod.spider.merge.V.f(new int[0]);
                    fVar3.b(1, i3);
                    fVar.c(fVar3);
                } else {
                    com.github.catvod.spider.merge.V.f fVarC = k0VarC.c();
                    if (fVarC != null) {
                        if (k0VarC instanceof com.github.catvod.spider.merge.T.I) {
                            int i4 = c0316a.f;
                            com.github.catvod.spider.merge.V.f fVar4 = new com.github.catvod.spider.merge.V.f(new int[0]);
                            fVar4.b(1, i4);
                            if (fVar4.e()) {
                                fVarC = null;
                            } else {
                                if (fVarC.e()) {
                                    fVar2 = new com.github.catvod.spider.merge.V.f(fVar4);
                                } else if (!fVar4.e()) {
                                    fVar2 = new com.github.catvod.spider.merge.V.f(fVar4);
                                    if (!fVarC.e()) {
                                        int i5 = 0;
                                        int i6 = 0;
                                        while (i5 < fVar2.a.size()) {
                                            ArrayList arrayList = fVarC.a;
                                            if (i6 >= arrayList.size()) {
                                                break;
                                            }
                                            com.github.catvod.spider.merge.V.e eVar = (com.github.catvod.spider.merge.V.e) fVar2.a.get(i5);
                                            com.github.catvod.spider.merge.V.e eVar2 = (com.github.catvod.spider.merge.V.e) arrayList.get(i6);
                                            int i7 = eVar2.b;
                                            int i8 = eVar.a;
                                            if (i7 < i8) {
                                                i6++;
                                            } else {
                                                int i9 = eVar2.a;
                                                int i10 = eVar.b;
                                                if (i9 > i10) {
                                                    i5++;
                                                } else {
                                                    com.github.catvod.spider.merge.V.e eVar3 = i9 > i8 ? new com.github.catvod.spider.merge.V.e(i8, i9 - 1) : null;
                                                    com.github.catvod.spider.merge.V.e eVar4 = i7 < i10 ? new com.github.catvod.spider.merge.V.e(i7 + 1, i10) : null;
                                                    if (eVar3 != null) {
                                                        if (eVar4 != null) {
                                                            fVar2.a.set(i5, eVar3);
                                                            i5++;
                                                            fVar2.a.add(i5, eVar4);
                                                            i6++;
                                                        } else {
                                                            fVar2.a.set(i5, eVar3);
                                                            i5++;
                                                        }
                                                    } else if (eVar4 != null) {
                                                        fVar2.a.set(i5, eVar4);
                                                        i6++;
                                                    } else {
                                                        fVar2.a.remove(i5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    fVar2 = new com.github.catvod.spider.merge.V.f(new int[0]);
                                }
                                fVarC = fVar2;
                            }
                        }
                        fVar.c(fVarC);
                    }
                }
                i2++;
                abstractC0324i2 = abstractC0324i;
                p2 = p;
            }
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public String getApiName(String str) {
        com.github.catvod.spider.merge.p020x.b bVar = (com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b;
        bVar.getClass();
        String strP = com.github.catvod.spider.merge.p020x.b.p(str);
        if (strP.isEmpty()) {
            return "";
        }
        int i = 0;
        while (true) {
            String[] strArr = com.github.catvod.spider.merge.p020x.c.b;
            if (i >= strArr.length) {
                String str2 = (String) bVar.e.get(strP);
                return TextUtils.isEmpty(str2) ? strP : str2;
            }
            if (com.github.catvod.spider.merge.p020x.b.p(strArr[i]).equals(strP)) {
                return "推荐 " + (i + 1);
            }
            i++;
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public String[] getBuiltinUrls() {
        return com.github.catvod.spider.merge.p020x.c.b;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public String getChannelApiUrl() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).m;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public List getChannels() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).i;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public List getCustomChannels() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).k;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public List getCustomPlugins() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).l;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public List getCustomUrls() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).b;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public int getEnabledApiCount() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).h();
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public List getEnabledTypes() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).f;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public List getExcludeKeywords() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).h;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public Map getHeaders() {
        com.github.catvod.spider.merge.p020x.b bVar = (com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b;
        String str = com.github.catvod.spider.merge.p020x.c.b[0];
        bVar.getClass();
        return com.github.catvod.spider.merge.p020x.b.i(str);
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public List getIncludeKeywords() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).g;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public int getLinkCheckMode() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).p;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public int getMaxPerType() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).n;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public String[][] getPanTypes() {
        return com.github.catvod.spider.merge.p020x.c.c;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public List getPlugins() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).j;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public List getVisibleApiUrls() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).m();
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public boolean isApiEnabled(String str) {
        com.github.catvod.spider.merge.p020x.b bVar = (com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b;
        bVar.getClass();
        String strP = com.github.catvod.spider.merge.p020x.b.p(str);
        return bVar.m().contains(strP) && !bVar.c.contains(strP);
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public boolean isBuiltinUrl(String str) {
        ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).getClass();
        return com.github.catvod.spider.merge.p020x.b.n(str);
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public boolean isFolderMode() {
        return ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).o;
    }

    public String m(String str) {
        String strE;
        StringBuilder sb = new StringBuilder();
        com.github.catvod.spider.merge.p018v.d dVar = (com.github.catvod.spider.merge.p018v.d) this.b;
        if (dVar.b || (strE = dVar.a) == null) {
            strE = C0299u0.x().E();
        }
        return com.github.catvod.spider.merge.D.b.n(sb, strE, "/alllive", str);
    }

    public void o() throws Exception {
        int i = 1;
        v();
        Activity activityS = S();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        com.github.catvod.spider.merge.p007h.a embyManagePrefs = ((com.github.catvod.spider.merge.p022z.P0) this.b).getEmbyManagePrefs();
        if (embyManagePrefs == null) {
            embyManagePrefs = com.github.catvod.spider.merge.p007h.a.a(null, null);
        }
        com.github.catvod.spider.merge.p007h.a aVar = embyManagePrefs;
        LinearLayout linearLayoutK = AbstractC0583w0.K(activityS);
        linearLayoutK.addView(AbstractC0583w0.p(activityS, "数量设置", "控制搜索结果和每页显示数量"), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activityS)));
        LinearLayout linearLayoutY = AbstractC0583w0.y(activityS);
        AbstractC0583w0.g(linearLayoutY, "搜索上限");
        EditText editTextE = AbstractC0583w0.e(linearLayoutY, "50", String.valueOf(aVar.c), false);
        editTextE.setInputType(2);
        AbstractC0583w0.g(linearLayoutY, "每页数量");
        EditText editTextE2 = AbstractC0583w0.e(linearLayoutY, "20", String.valueOf(aVar.d), false);
        editTextE2.setInputType(2);
        linearLayoutK.addView(linearLayoutY);
        com.github.catvod.spider.merge.p022z.P1.w(strValueOf, new String[]{"searchLimit", "pageSize"}, new EditText[]{editTextE, editTextE2}, null);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activityS).setView(linearLayoutK).setPositiveButton("保存", (DialogInterface.OnClickListener) null).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterfaceOnDismissListenerC0472y(strValueOf, 3)).create();
        AbstractC0583w0.j0(alertDialogCreate);
        alertDialogCreate.getButton(-3).setOnClickListener(new com.github.catvod.spider.merge.p022z.Z(strValueOf, i));
        alertDialogCreate.getButton(-1).setOnClickListener(new ViewOnClickListenerC0467t(this, editTextE, editTextE2, aVar, alertDialogCreate, 1));
    }

    public void p(boolean z) throws Exception {
        v();
        Activity activityS = S();
        com.github.catvod.spider.merge.p007h.a embyManagePrefs = ((com.github.catvod.spider.merge.p022z.P0) this.b).getEmbyManagePrefs();
        if (embyManagePrefs == null) {
            embyManagePrefs = com.github.catvod.spider.merge.p007h.a.a(null, null);
        }
        String str = z ? embyManagePrefs.a : embyManagePrefs.b;
        boolean[] zArr = {G(str, "Movie"), G(str, "Series"), G(str, "BoxSet")};
        LinearLayout linearLayoutK = AbstractC0583w0.K(activityS);
        LinearLayout linearLayoutY = AbstractC0583w0.y(activityS);
        linearLayoutK.addView(AbstractC0583w0.p(activityS, z ? "浏览内容" : "搜索内容", "选择需要包含的内容类型"), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activityS)));
        AbstractC0583w0.m(linearLayoutY, "电影", null, AbstractC0583w0.c, zArr[0], 0, false, null, zArr, null);
        AbstractC0583w0.m(linearLayoutY, "剧集", null, AbstractC0583w0.d, zArr[1], 1, true, null, zArr, null);
        AbstractC0583w0.m(linearLayoutY, "合集", null, AbstractC0583w0.f, zArr[2], 2, true, null, zArr, null);
        linearLayoutK.addView(linearLayoutY);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activityS).setView(linearLayoutK).setPositiveButton("保存", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
        AbstractC0583w0.j0(alertDialogCreate);
        alertDialogCreate.getButton(-1).setOnClickListener(new com.github.catvod.spider.merge.p022z.M0(this, zArr, z, embyManagePrefs, alertDialogCreate));
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public boolean removeApiUrl(String str) {
        boolean zRemove;
        String str2;
        com.github.catvod.spider.merge.p020x.b bVar = (com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b;
        bVar.getClass();
        String strP = com.github.catvod.spider.merge.p020x.b.p(str);
        if (!bVar.m().contains(strP)) {
            return false;
        }
        boolean zN = com.github.catvod.spider.merge.p020x.b.n(strP);
        HashMap map = bVar.e;
        ArrayList arrayList = bVar.b;
        ArrayList arrayList2 = bVar.d;
        if (zN) {
            zRemove = !arrayList2.contains(strP);
            if (zRemove) {
                arrayList2.add(strP);
            }
            str2 = null;
        } else {
            zRemove = arrayList.remove(strP);
            str2 = (String) map.remove(strP);
        }
        bVar.c.remove(strP);
        if (bVar.h() > 0) {
            return zRemove;
        }
        if (zN) {
            arrayList2.remove(strP);
            return false;
        }
        arrayList.add(strP);
        if (str2 == null) {
            return false;
        }
        map.put(strP, str2);
        return false;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public void saveConfig() {
        ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).t();
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public boolean setApiEnabled(String str, boolean z) {
        com.github.catvod.spider.merge.p020x.b bVar = (com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b;
        bVar.getClass();
        String strP = com.github.catvod.spider.merge.p020x.b.p(str);
        if (!bVar.m().contains(strP)) {
            return false;
        }
        ArrayList arrayList = bVar.c;
        if (z) {
            arrayList.remove(strP);
        } else {
            if (!arrayList.contains(strP)) {
                arrayList.add(strP);
            }
            if (bVar.h() <= 0) {
                arrayList.remove(strP);
                return false;
            }
        }
        return true;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public void setChannelApiUrl(String str) {
        com.github.catvod.spider.merge.p020x.b bVar = (com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b;
        bVar.getClass();
        bVar.m = com.github.catvod.spider.merge.p020x.b.p(str);
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public void setChannelMode(int i) {
        com.github.catvod.spider.merge.p020x.b bVar = (com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b;
        bVar.getClass();
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            i = 0;
        }
        bVar.q = i;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public void setFolderMode(boolean z) {
        ((com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b).o = z;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public void setLinkCheckMode(int i) {
        com.github.catvod.spider.merge.p020x.b bVar = (com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b;
        bVar.getClass();
        if (i != 0 && i != 1 && i != 2) {
            i = 1;
        }
        bVar.p = i;
    }

    @Override // com.github.catvod.spider.merge.p022z.J1
    public void setMaxPerType(int i) {
        com.github.catvod.spider.merge.p020x.b bVar = (com.github.catvod.spider.merge.p020x.b) ((C0261h0) this.b).b;
        bVar.getClass();
        bVar.n = Math.max(0, i);
    }

    public void v() throws Exception {
        if (((com.github.catvod.spider.merge.p022z.P0) this.b) == null) {
            throw new Exception("未绑定回调");
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    public JSONObject x(String str) {
        boolean z;
        boolean z2;
        com.github.catvod.spider.merge.p018v.d dVar = (com.github.catvod.spider.merge.p018v.d) this.b;
        if (dVar.b) {
            dVar.c = C0299u0.x().z0();
            z = ((com.github.catvod.spider.merge.p018v.d) this.b).c;
        } else {
            if (dVar.c) {
                z = true;
            } else {
                try {
                    com.github.catvod.spider.merge.p018v.d dVar2 = (com.github.catvod.spider.merge.p018v.d) this.b;
                    String strX = X(((com.github.catvod.spider.merge.p018v.d) this.b).a + "/alllive/sites", null, null);
                    if (strX != null && !strX.trim().isEmpty()) {
                        try {
                            z2 = new JSONObject(strX).optInt("code", -1) == 0;
                        } catch (Exception unused) {
                        }
                    }
                    dVar2.c = z2;
                } catch (Exception unused2) {
                    ((com.github.catvod.spider.merge.p018v.d) this.b).c = false;
                }
                z = ((com.github.catvod.spider.merge.p018v.d) this.b).c;
            }
        }
        if (!z) {
            return null;
        }
        String strX2 = X(str, null, null);
        if (strX2 == null || strX2.isEmpty()) {
            com.github.catvod.spider.merge.p018v.d dVar3 = (com.github.catvod.spider.merge.p018v.d) this.b;
            if (dVar3.b) {
                dVar3.c = false;
                C0299u0.x().J0();
            }
            if (strX2 == null || strX2.isEmpty()) {
                return null;
            }
        }
        JSONObject jSONObject = new JSONObject(strX2);
        if (jSONObject.optInt("code", -1) != 0) {
            return null;
        }
        return jSONObject;
    }

    public X1(int i) {
        this.a = i;
        switch (i) {
            case 6:
                break;
            case 7:
                this.b = Collections.synchronizedMap(new IdentityHashMap());
                break;
            default:
                this.b = new LinkedHashMap();
                break;
        }
    }

    public X1(C0399b c0399b) {
        this.a = 4;
        this.b = new com.github.catvod.spider.merge.g0.C();
    }
}
