package com.github.catvod.spider.merge.A;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.ToLongFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Credentials;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class k2 {
    public static volatile long d;
    public static volatile boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean i;
    public static volatile long j;
    public static boolean m;
    public static final Pattern a = Pattern.compile("device_([a-f0-9]{32})\\.json");
    public static final Object b = new Object();
    public static final AtomicInteger c = new AtomicInteger();
    public static String h = "";
    public static volatile String k = "";
    public static String l = "";
    public static final f2 n = new f2();

    public static byte[] A(String str, JSONObject jSONObject) {
        JSONObject jSONObjectK0 = AbstractC0302v0.K0(jSONObject);
        byte[] bytes = new JSONObject().put("type", "moyu_playback_v3").put("version", 1).put("deviceId", str).put("writtenAt", System.currentTimeMillis()).put("checksum", a(jSONObjectK0)).put("state", jSONObjectK0).toString().getBytes(StandardCharsets.UTF_8);
        if (bytes.length <= 4194304) {
            return bytes;
        }
        throw new IllegalStateException("本机播放历史文件过大");
    }

    public static void B(boolean z, boolean z2) {
        if (l()) {
            if (z2 || o()) {
                if (o()) {
                    g();
                }
                synchronized (b) {
                    try {
                        f = true;
                        i = z | i;
                        if (e) {
                            return;
                        }
                        e = true;
                        InitOrigin.execute(new RunnableC0315z1(22));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x027a, code lost:
    
        if (com.github.catvod.spider.merge.A.AbstractC0302v0.l(com.github.catvod.spider.merge.A.AbstractC0302v0.K0(r1)).equals(com.github.catvod.spider.merge.A.AbstractC0302v0.l(com.github.catvod.spider.merge.A.AbstractC0302v0.K0(r0.c))) != false) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String C(j2 j2Var, boolean z) throws Throwable {
        ArrayList<String> arrayList;
        final g2 g2Var;
        f(j2Var);
        if (j2Var.a) {
            final com.github.catvod.spider.merge.p000a.A0 a0S = com.github.catvod.spider.merge.p000a.A0.s();
            g2Var = (g2) a0S.s0(j2Var.f, new Callable() { // from class: com.github.catvod.spider.merge.A.d2
                /* JADX WARN: Code duplicated, block: B:22:0x0054  */
                /* JADX WARN: Type inference failed for: r2v4, types: [com.github.catvod.spider.merge.A.b2] */
                /* JADX WARN: Type inference failed for: r3v2, types: [com.github.catvod.spider.merge.A.c2] */
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    ArrayList arrayList2;
                    g2 g2Var2 = new g2();
                    com.github.catvod.spider.merge.p000a.A0 a0 = a0S;
                    String strP = a0.p("moyu_playback_v3");
                    if (!strP.isEmpty()) {
                        int i2 = 1;
                        int i3 = 1;
                        while (true) {
                            JSONObject jSONObject = new JSONObject(a0.Z(i3, strP));
                            if (jSONObject.has("error")) {
                                throw new IllegalStateException(jSONObject.optString("error", "夸克播放历史目录读取失败"));
                            }
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray("list");
                            arrayList2 = g2Var2.b;
                            if (jSONArrayOptJSONArray == null) {
                                break;
                            }
                            int i4 = 0;
                            while (i4 < jSONArrayOptJSONArray.length()) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i4);
                                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optInt("file_type", i2) != 0) {
                                    String strOptString = jSONObjectOptJSONObject2.optString("file_name");
                                    Matcher matcher = k2.a.matcher(strOptString);
                                    String strOptString2 = jSONObjectOptJSONObject2.optString("fid");
                                    if (matcher.matches() && !strOptString2.isEmpty()) {
                                        g2Var2.c.add(matcher.group(i2));
                                        arrayList2.add(new h2(Math.max(jSONObjectOptJSONObject2.optLong("updated_at"), jSONObjectOptJSONObject2.optLong("created_at")), strOptString, strOptString2));
                                    }
                                }
                                i4++;
                                i3 = i3;
                                i2 = 1;
                            }
                            int i5 = i3;
                            if (jSONArrayOptJSONArray.length() < 100) {
                                break;
                            }
                            i3 = i5 + 1;
                            i2 = 1;
                        }
                        g2Var2.d = arrayList2.size();
                        arrayList2.sort(Comparator.comparingLong(new ToLongFunction() { // from class: com.github.catvod.spider.merge.A.b2
                            @Override // java.util.function.ToLongFunction
                            public final long applyAsLong(Object obj) {
                                return ((h2) obj).c;
                            }
                        }).reversed().thenComparing(new Function() { // from class: com.github.catvod.spider.merge.A.c2
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return ((h2) obj).b;
                            }
                        }, Comparator.reverseOrder()));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            i2 i2VarD = k2.d((h2) it.next());
                            if (i2VarD != null) {
                                LinkedHashMap linkedHashMap = g2Var2.a;
                                String str = i2VarD.a;
                                i2 i2Var = (i2) linkedHashMap.get(str);
                                if (i2Var == null || i2VarD.b > i2Var.b) {
                                    linkedHashMap.put(str, i2VarD);
                                }
                            }
                        }
                    }
                    return g2Var2;
                }
            });
        } else {
            Y1 y1 = j2Var.b;
            Pattern pattern = a2.h;
            OkHttpClient okHttpClient = Z1.a.e;
            String strBasic = Credentials.basic(y1.b, y1.c);
            String strH = h(y1.a);
            Response responseExecute = okHttpClient.newCall(new Request.Builder().url(strH).header("Authorization", strBasic).header("Depth", "1").method("PROPFIND", RequestBody.create(MediaType.parse("application/xml"), "<?xml version=\"1.0\" encoding=\"utf-8\"?><d:propfind xmlns:d=\"DAV:\"><d:prop><d:displayname/></d:prop></d:propfind>")).build()).execute();
            try {
                if (responseExecute.code() == 404) {
                    b(strH, strBasic, okHttpClient);
                    arrayList = new ArrayList();
                    responseExecute.close();
                } else {
                    if (responseExecute.code() != 200 && responseExecute.code() != 207) {
                        throw new IllegalStateException(k(responseExecute.code(), "读取目录"));
                    }
                    Matcher matcher = a.matcher(new String(w(responseExecute.body()), StandardCharsets.UTF_8));
                    ArrayList arrayList2 = new ArrayList();
                    while (matcher.find() && !arrayList2.contains(matcher.group())) {
                        arrayList2.add(matcher.group());
                    }
                    responseExecute.close();
                    arrayList = arrayList2;
                }
                g2 g2Var2 = new g2();
                g2Var2.d = arrayList.size();
                for (String str : arrayList) {
                    Matcher matcher2 = a.matcher(str);
                    if (matcher2.matches()) {
                        g2Var2.c.add(matcher2.group(1));
                    }
                    i2 i2VarE = e(okHttpClient, strH + str, strBasic, str);
                    if (i2VarE != null) {
                        LinkedHashMap linkedHashMap = g2Var2.a;
                        String str2 = i2VarE.a;
                        i2 i2Var = (i2) linkedHashMap.get(str2);
                        if (i2Var == null || i2VarE.b > i2Var.b) {
                            linkedHashMap.put(str2, i2VarE);
                        }
                    }
                }
                g2Var = g2Var2;
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
        if (g2Var.d > 0 && g2Var.a.isEmpty() && (g2Var.c.size() != 1 || !g2Var.c.contains(AbstractC0302v0.e0()))) {
            throw new IllegalStateException("云端播放历史文件均已损坏，未覆盖云端数据");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectN = AbstractC0302v0.n(z ? AbstractC0302v0.r() : AbstractC0302v0.G1(), jCurrentTimeMillis);
        Iterator it = g2Var.a.values().iterator();
        while (it.hasNext()) {
            jSONObjectN = AbstractC0302v0.F0(jSONObjectN, AbstractC0302v0.n(((i2) it.next()).c, jCurrentTimeMillis));
        }
        synchronized (b) {
            f(j2Var);
            AbstractC0302v0.e(jSONObjectN);
        }
        JSONObject jSONObjectF0 = AbstractC0302v0.F0(jSONObjectN, AbstractC0302v0.G1());
        jSONObjectF0.put("writerId", AbstractC0302v0.e0());
        final JSONObject jSONObjectK0 = AbstractC0302v0.K0(jSONObjectF0);
        final String strE0 = AbstractC0302v0.e0();
        i2 i2Var2 = (i2) g2Var.a.get(strE0);
        if (i2Var2 == null || !AbstractC0302v0.l(AbstractC0302v0.K0(i2Var2.c)).equals(AbstractC0302v0.l(AbstractC0302v0.K0(jSONObjectK0)))) {
            f(j2Var);
            if (!j2Var.a) {
                Y1 y2 = j2Var.b;
                Pattern pattern2 = a2.h;
                OkHttpClient okHttpClient2 = Z1.a.e;
                String strBasic2 = Credentials.basic(y2.b, y2.c);
                String strH2 = h(y2.a);
                String strJ = com.github.catvod.spider.merge.D.b.j("device_", strE0, ".json");
                byte[] bArrA = A(strE0, jSONObjectK0);
                Response responseExecute2 = okHttpClient2.newCall(new Request.Builder().url(strH2 + strJ).header("Authorization", strBasic2).put(RequestBody.create(MediaType.parse("application/json"), bArrA)).build()).execute();
                try {
                    if (!responseExecute2.isSuccessful()) {
                        throw new IllegalStateException(k(responseExecute2.code(), "上传"));
                    }
                    responseExecute2.close();
                    i2 i2VarE2 = e(okHttpClient2, strH2 + strJ, strBasic2, strJ);
                    if (i2VarE2 != null) {
                    }
                    throw new IllegalStateException("播放历史上传后校验失败，本机记录未受影响");
                } catch (Throwable th3) {
                    if (responseExecute2 != null) {
                        try {
                            responseExecute2.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            final com.github.catvod.spider.merge.p000a.A0 a0S2 = com.github.catvod.spider.merge.p000a.A0.s();
            a0S2.s0(j2Var.f, new Callable() { // from class: com.github.catvod.spider.merge.A.e2
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    i2 i2VarD;
                    StringBuilder sb = new StringBuilder("device_");
                    String str3 = strE0;
                    String strM = com.github.catvod.spider.merge.D.b.m(sb, str3, ".json");
                    JSONObject jSONObject = jSONObjectK0;
                    byte[] bArrA2 = k2.A(str3, jSONObject);
                    com.github.catvod.spider.merge.p000a.A0 a0 = a0S2;
                    String strR0 = a0.r0(a0.m("moyu_playback_v3"), strM, bArrA2, "application/json");
                    try {
                        i2VarD = k2.d(new h2(System.currentTimeMillis(), strM, strR0));
                    } catch (Exception unused) {
                        i2VarD = null;
                    }
                    if (i2VarD == null || !AbstractC0302v0.l(AbstractC0302v0.K0(jSONObject)).equals(AbstractC0302v0.l(AbstractC0302v0.K0(i2VarD.c)))) {
                        try {
                            a0.k(strR0);
                        } catch (Exception unused2) {
                        }
                        throw new IllegalStateException("播放历史上传后校验失败，本机记录未受影响");
                    }
                    for (h2 h2Var : g2Var.b) {
                        if (strM.equals(h2Var.a)) {
                            String str4 = h2Var.b;
                            if (!strR0.equals(str4)) {
                                try {
                                    a0.k(str4);
                                } catch (Exception unused3) {
                                    SpiderDebug.log("[历史同步] 夸克旧快照清理失败: " + str4);
                                }
                            }
                        }
                    }
                    return null;
                }
            });
        }
        f(j2Var);
        return z ? "播放历史已清除并同步" : "播放历史已同步";
    }

    public static void D(Runnable runnable) {
        synchronized (b) {
            try {
                try {
                    runnable.run();
                    d++;
                } catch (Throwable th) {
                    d++;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String a(JSONObject jSONObject) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(AbstractC0302v0.l(jSONObject).getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder(64);
        for (byte b2 : bArrDigest) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b2 & 255)));
        }
        return sb.toString();
    }

    public static void b(String str, String str2, OkHttpClient okHttpClient) {
        Response responseExecute = okHttpClient.newCall(new Request.Builder().url(str).header("Authorization", str2).method("MKCOL", (RequestBody) null).build()).execute();
        try {
            if (!responseExecute.isSuccessful() && responseExecute.code() != 405) {
                throw new IllegalStateException(k(responseExecute.code(), "创建目录"));
            }
            responseExecute.close();
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

    public static j2 c() throws Throwable {
        long j2 = d;
        if (q()) {
            String strV = com.github.catvod.spider.merge.p000a.A0.s().v();
            String strV2 = v(strV);
            if (strV2.isEmpty()) {
                return null;
            }
            return new j2(true, null, "quark\n".concat(strV2), "quark\n".concat(strV2), j2, strV);
        }
        Pattern pattern = a2.h;
        Z1.a.getClass();
        Y1 y1D = a2.d();
        if (y1D == null || !y1D.a()) {
            return null;
        }
        return new j2(false, y1D, "webdav\n" + ((String) y1D.d), "webdav\n" + ((String) y1D.e), j2, "");
    }

    public static i2 d(h2 h2Var) throws Exception {
        com.github.catvod.spider.merge.p000a.A0 a0S = com.github.catvod.spider.merge.p000a.A0.s();
        Exception e2 = null;
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                Response responseH = X1.H(a0S.E(h2Var.b), a0S.D());
                try {
                    if (responseH.isSuccessful()) {
                        i2 i2VarT = t(h2Var.a, w(responseH.body()));
                        responseH.close();
                        return i2VarT;
                    }
                    throw new IllegalStateException("夸克播放历史下载失败：" + responseH.code());
                } catch (Throwable th) {
                    if (responseH != null) {
                        try {
                            responseH.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e2 = e3;
                if (i2 < 2) {
                    SystemClock.sleep(500 << i2);
                }
            }
        }
        if (e2 == null) {
            throw new IllegalStateException("夸克播放历史下载失败");
        }
        throw e2;
    }

    public static i2 e(OkHttpClient okHttpClient, String str, String str2, String str3) {
        Response responseExecute = okHttpClient.newCall(new Request.Builder().url(str).header("Authorization", str2).get().build()).execute();
        try {
            if (responseExecute.code() == 404) {
                responseExecute.close();
                return null;
            }
            if (!responseExecute.isSuccessful()) {
                throw new IllegalStateException(k(responseExecute.code(), "下载"));
            }
            i2 i2VarT = t(str3, w(responseExecute.body()));
            responseExecute.close();
            return i2VarT;
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

    public static void f(j2 j2Var) {
        if (!n(j2Var)) {
            throw new IllegalStateException("同步方式或账号已变更，本次同步已取消");
        }
    }

    public static void g() {
        synchronized (b) {
            try {
                if (m) {
                    return;
                }
                m = true;
                InitOrigin.run(n, 300000);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String h(String str) {
        String strTrim = str == null ? "" : str.trim();
        StringBuilder sb = new StringBuilder();
        if (!strTrim.endsWith("/")) {
            strTrim = strTrim.concat("/");
        }
        return com.github.catvod.spider.merge.D.b.m(sb, strTrim, "moyu_playback_v3/");
    }

    public static String i(boolean z) {
        return z ? "夸克" : "WebDAV";
    }

    public static String j() throws Throwable {
        if (e) {
            return "正在同步";
        }
        r(null);
        if (!k.isEmpty()) {
            return k;
        }
        if (j == 0) {
            return "尚未同步";
        }
        return "最近同步 " + AbstractC0251e.l(j);
    }

    public static String k(int i2, String str) {
        if (i2 == 401) {
            return "WebDAV认证失败，请检查用户名和应用密码";
        }
        if (i2 == 403) {
            return "WebDAV目录没有写入权限";
        }
        if (i2 == 405) {
            return "WebDAV服务器不支持".concat(str);
        }
        if (i2 == 409) {
            return "WebDAV播放历史目录不可用";
        }
        if (i2 == 429) {
            return "WebDAV请求频繁";
        }
        if (i2 == 507) {
            return "WebDAV存储空间不足";
        }
        return "WebDAV" + str + "失败：" + i2;
    }

    public static boolean l() {
        return m(q());
    }

    public static boolean m(boolean z) {
        if (z) {
            return com.github.catvod.spider.merge.p000a.A0.s().P();
        }
        Pattern pattern = a2.h;
        Z1.a.getClass();
        Y1 y1D = a2.d();
        return y1D != null && y1D.a();
    }

    public static boolean n(j2 j2Var) throws Throwable {
        String str;
        j2 j2VarC = c();
        return (j2VarC == null || j2Var == null || j2Var.e != j2VarC.e || (str = j2Var.d) == null || str.isEmpty() || !str.equals(j2VarC.d)) ? false : true;
    }

    public static boolean o() {
        return q() ? p(true) : p(false);
    }

    public static boolean p(boolean z) {
        s();
        return "1".equals(C0297t1.h(z ? "smart_history_sync_quark_enabled" : "smart_history_sync_enabled"));
    }

    public static boolean q() {
        return "quark".equals(C0297t1.h("smart_history_sync_backend"));
    }

    public static void r(j2 j2Var) throws Throwable {
        String str;
        if (j2Var == null) {
            j2 j2VarC = c();
            if (j2VarC == null) {
                str = q() ? "quark\n" : "webdav\n";
            } else {
                str = j2VarC.c;
            }
        } else {
            str = j2Var.c;
        }
        String str2 = (j2Var != null ? !j2Var.a : !q()) ? "smart_history_sync_status" : "smart_history_sync_quark_status";
        synchronized (b) {
            try {
                if (str.equals(l)) {
                    return;
                }
                l = str;
                j = 0L;
                k = "";
                try {
                    JSONObject jSONObject = new JSONObject(C0297t1.h(str2));
                    if (!str.equals(jSONObject.optString("scope"))) {
                        return;
                    }
                    j = jSONObject.optLong("lastSuccessAt");
                    k = jSONObject.optString("lastError");
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void s() {
        if (C0297t1.h("smart_history_sync_quark_enabled").isEmpty()) {
            synchronized (b) {
                try {
                    if (C0297t1.h("smart_history_sync_quark_enabled").isEmpty()) {
                        boolean zQ = q();
                        boolean zEquals = "1".equals(C0297t1.h("smart_history_sync_enabled"));
                        boolean[] zArr = {zEquals && !zQ, zEquals && zQ};
                        C0297t1.j("smart_history_sync_enabled", zArr[0] ? "1" : "0");
                        C0297t1.j("smart_history_sync_quark_enabled", zArr[1] ? "1" : "0");
                        if (zQ && C0297t1.h("smart_history_sync_quark_status").isEmpty()) {
                            C0297t1.j("smart_history_sync_quark_status", C0297t1.h("smart_history_sync_status"));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static i2 t(String str, byte[] bArr) {
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr, StandardCharsets.UTF_8));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("state");
            String strOptString = jSONObject.optString("deviceId");
            long jOptLong = jSONObject.optLong("writtenAt");
            JSONObject jSONObjectK0 = AbstractC0302v0.K0(jSONObjectOptJSONObject);
            if ("moyu_playback_v3".equals(jSONObject.optString("type")) && jSONObject.optInt("version") == 1 && jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt("version") == 3 && matcher.group(1).equals(strOptString) && strOptString.equals(jSONObjectOptJSONObject.optString("writerId")) && jOptLong > 0 && jSONObject.optString("checksum").equals(a(jSONObjectK0))) {
                return new i2(jOptLong, strOptString, jSONObjectK0);
            }
            return null;
        } catch (Exception unused) {
            SpiderDebug.log("[历史同步] 损坏的云端快照: " + str);
            return null;
        }
    }

    public static void u(Runnable runnable, String str, String str2) {
        String strV = v(str);
        if (strV.isEmpty() || !strV.equals(v(str2))) {
            return;
        }
        synchronized (b) {
            try {
                String strV2 = com.github.catvod.spider.merge.p000a.A0.s().v();
                String strV3 = v(str);
                if (!strV3.isEmpty() && strV3.equals(v(strV2))) {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String v(String str) {
        String[] strArrSplit = str == null ? new String[0] : str.split(";");
        String[] strArr = {"__uid", "__pus", "__kp"};
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            for (String str3 : strArrSplit) {
                int iIndexOf = str3.indexOf(61);
                if (iIndexOf >= 0 && str2.equals(str3.substring(0, iIndexOf).trim())) {
                    String strTrim = str3.substring(iIndexOf + 1).trim();
                    if (!strTrim.isEmpty()) {
                        return AbstractC0309x1.n(str2 + '=' + strTrim);
                    }
                }
            }
        }
        return "";
    }

    public static byte[] w(ResponseBody responseBody) throws IOException {
        if (responseBody == null) {
            return new byte[0];
        }
        if (responseBody.contentLength() > 4194304) {
            throw new IllegalStateException("云端播放历史文件过大");
        }
        InputStream inputStreamByteStream = responseBody.byteStream();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int i2 = inputStreamByteStream.read(bArr);
                if (i2 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStreamByteStream.close();
                    return byteArray;
                }
                if (byteArrayOutputStream.size() + i2 > 4194304) {
                    throw new IllegalStateException("云端播放历史文件过大");
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (Throwable th) {
            if (inputStreamByteStream != null) {
                try {
                    inputStreamByteStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void x(j2 j2Var) {
        if (j2Var == null) {
            return;
        }
        synchronized (b) {
            try {
                l = j2Var.c;
                C0297t1.j(j2Var.a ? "smart_history_sync_quark_status" : "smart_history_sync_status", new JSONObject().put("scope", j2Var.c).put("lastSuccessAt", j).put("lastError", k).toString());
            } catch (Exception unused) {
            }
        }
    }

    public static void y() {
        if (l() && o()) {
            InitOrigin.run(new T1(c.incrementAndGet(), 1), 2500);
        }
    }

    public static void z(boolean z, boolean z2) {
        s();
        C0297t1.j(z ? "smart_history_sync_quark_enabled" : "smart_history_sync_enabled", z2 ? "1" : "0");
        if (z != q()) {
            return;
        }
        c.incrementAndGet();
        if (z2) {
            if (l()) {
                B(false, false);
            }
        } else {
            synchronized (b) {
                f = false;
                g = false;
                h = "";
                i = false;
            }
        }
    }
}
