package com.github.catvod.spider.merge.A;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String C(com.github.catvod.spider.merge.A.j2 r14, boolean r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A.k2.C(com.github.catvod.spider.merge.A.j2, boolean):java.lang.String");
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

    public static j2 c() {
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

    public static String j() {
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

    public static boolean n(j2 j2Var) {
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

    public static void r(j2 j2Var) {
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
