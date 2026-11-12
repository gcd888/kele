package com.github.catvod.spider.merge.p000a;

import android.util.Base64;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.merge.A.C0261h0;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.S.e;
import com.github.catvod.spider.merge.T.Q;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class T {
    public final Q a;
    public volatile C0261h0 b;
    public volatile String c;
    public final OkHttpClient d;

    public T() {
        Q q = new Q(1);
        this.a = q;
        this.b = new C0261h0(3);
        this.c = "";
        OkHttpClient.Builder builderCookieJar = new OkHttpClient.Builder().cookieJar(q);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.d = builderCookieJar.connectTimeout(10L, timeUnit).readTimeout(20L, timeUnit).callTimeout(30L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(false).build();
        r();
    }

    public static List a(ArrayList arrayList) {
        return arrayList.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public static String f(String str) {
        return str == null ? "" : str.trim();
    }

    public static byte[] h(String str) {
        String strTrim;
        if (str == null) {
            strTrim = "";
        } else {
            try {
                strTrim = str.trim();
            } catch (Exception unused) {
                return new byte[0];
            }
        }
        int iIndexOf = strTrim.indexOf(44);
        if (iIndexOf >= 0 && strTrim.substring(0, iIndexOf).toLowerCase(Locale.US).contains("base64")) {
            strTrim = strTrim.substring(iIndexOf + 1);
        }
        String strReplace = strTrim.replace("-", "+").replace("_", "/");
        int length = strReplace.length() % 4;
        if (length != 0) {
            strReplace = strReplace + "====".substring(length);
        }
        return Base64.decode(strReplace, 0);
    }

    public static C0261h0 i(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            return new C0261h0(3);
        }
        try {
            String strG = FishCrypto.g(strTrim);
            if (!strG.trim().isEmpty()) {
                strTrim = strG.trim();
            }
        } catch (Throwable unused) {
        }
        if (strTrim.startsWith("{")) {
            try {
                return C0261h0.e(new JSONObject(strTrim));
            } catch (JSONException unused2) {
                return new C0261h0(3);
            }
        }
        C0261h0 c0261h0 = new C0261h0(3);
        ((ArrayList) c0261h0.b).clear();
        c0261h0.a(strTrim);
        return c0261h0;
    }

    public static JSONObject k(Object... objArr) throws IOException {
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            try {
                if (i2 >= objArr.length) {
                    return jSONObject;
                }
                jSONObject.put(String.valueOf(objArr[i]), objArr[i2]);
                i += 2;
            } catch (JSONException e) {
                throw new IOException("bridge parameters invalid", e);
            }
        }
    }

    public static String l(JSONObject jSONObject) throws IOException {
        byte[] bArrT = FishCrypto.t("N1.BLbWMBxOY2csvU5+cEr2GEB1lPECRM7jaKH7Da/OKqH3iTmlhgu8ZRmdH/qyveMuaepdVfP2ScTyOBrPtLMsrj+syWbPDGtL0NhkRrbXwDM=", "N1.dxgOCIfi8lWMsHjG/fW3us6OExiLmO9QhZYMgckTNMpsKE9ebntaX6qJqelx1EK9+omplSFqpUdHSv7P/XSlH0slU2iq9Vj9r0ecEEFSBCM=", "N1.K/J6n7bKMXCihwQTr/ivYoWbcdghiPPUAMo05q7Fiv7vcgeNVjYA0hxPcFR625rJ9FfNovC5tgbsuX6wOvs9Aw==", "N1.p4CLTahDh6oj2sWuqEFwAqX3KbRB6IvfaaP4vrEcmpfLDXmxd+1dXo2zVGEFz60KgaoF+FyVd5ndiU87DiUNyWc4nq1DqXhtxKc8lCU4aTw=", jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        if (bArrT == null) {
            throw new IOException("bridge encrypt failed");
        }
        try {
            return new JSONObject().put("moyufucking", Base64.encodeToString(bArrT, 2)).toString();
        } catch (JSONException e) {
            throw new IOException("bridge envelope failed", e);
        }
    }

    public static O m(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new S(jSONObjectOptJSONObject.optString("id"), jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("pic"), jSONObjectOptJSONObject.optString("remarks")));
                }
            }
        }
        return new O(jSONObject.optInt("page", 1), jSONObject.optInt("page_count", 1), jSONObject.optInt("limit", 12), jSONObject.optInt("total", arrayList.size()), arrayList, jSONObject.optBoolean("captcha_required", false), jSONObject);
    }

    public static void p(JSONObject jSONObject, String str, Object obj) throws IOException {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            throw new IOException("bridge parameters invalid", e);
        }
    }

    public static JSONArray t(List list, long j) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            if (cookie != null) {
                long jExpiresAt = cookie.persistent() ? cookie.expiresAt() : 604800000 + j;
                if (jExpiresAt > j) {
                    jSONArray.put(new JSONObject().put("name", cookie.name()).put("value", cookie.value()).put("domain", cookie.domain()).put("path", cookie.path()).put("expiresAt", jExpiresAt).put("secure", cookie.secure()).put("httpOnly", cookie.httpOnly()).put("hostOnly", cookie.hostOnly()));
                }
            }
        }
        return jSONArray;
    }

    public static LinkedHashMap u(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.optString(next, ""));
            }
        }
        return linkedHashMap;
    }

    public static ArrayList v(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strF = f(jSONArray.optString(i, ""));
                if (!strF.isEmpty()) {
                    arrayList.add(strF);
                }
            }
        }
        return arrayList;
    }

    public final JSONObject b(String str, String str2, String str3, String str4, JSONObject jSONObject) throws IOException {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        String message = "";
        if (str3 == null) {
            str3 = "";
        }
        JSONObject jSONObjectK = k("action", str, "scene", str2, "request_id", str4, "client_time", lValueOf, "state", str3);
        if ("prepare".equals(str)) {
            p(jSONObjectK, "params", jSONObject);
        } else {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                p(jSONObjectK, next, jSONObject.opt(next));
            }
        }
        Iterator it = Collections.unmodifiableList((ArrayList) this.b.b).iterator();
        while (it.hasNext()) {
            try {
                String strP = X1.P((String) it.next(), l(jSONObjectK));
                if (strP == null || strP.trim().isEmpty()) {
                    throw new IOException("bridge empty response");
                }
                JSONObject jSONObject2 = new JSONObject(strP);
                if (jSONObject2.length() != 1 || !jSONObject2.has("moyufucking")) {
                    throw new IOException("bridge envelope invalid");
                }
                byte[] bArrS = FishCrypto.s("N1.BLbWMBxOY2csvU5+cEr2GEB1lPECRM7jaKH7Da/OKqH3iTmlhgu8ZRmdH/qyveMuaepdVfP2ScTyOBrPtLMsrj+syWbPDGtL0NhkRrbXwDM=", "N1.dxgOCIfi8lWMsHjG/fW3us6OExiLmO9QhZYMgckTNMpsKE9ebntaX6qJqelx1EK9+omplSFqpUdHSv7P/XSlH0slU2iq9Vj9r0ecEEFSBCM=", Base64.decode(jSONObject2.getString("moyufucking"), 0));
                if (bArrS == null) {
                    throw new IOException("bridge decrypt failed");
                }
                JSONObject jSONObject3 = new JSONObject(new String(bArrS, StandardCharsets.UTF_8));
                if (!jSONObject3.optBoolean("ok", false)) {
                    throw new J(jSONObject3.optString("error", "bridge rejected"), jSONObject3.optString("error", "bridge rejected"));
                }
                JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("data");
                return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
            } catch (J e) {
                throw e;
            } catch (Exception e2) {
                message = e2.getMessage() == null ? "bridge request failed" : e2.getMessage();
            }
        }
        throw new J("bridge_transport", message);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [byte[], java.io.Serializable] */
    public final synchronized JSONObject c(String str, JSONObject jSONObject) {
        JSONObject jSONObjectB;
        N n;
        JSONObject jSONObjectOptJSONObject;
        if (!(!Collections.unmodifiableList((ArrayList) this.b.b).isEmpty())) {
            throw new J("bridge_unconfigured", "bridge URL missing");
        }
        String strOptString = this.c;
        String string = UUID.randomUUID().toString();
        for (int i = 0; i < 12; i++) {
            try {
                jSONObjectB = b("prepare", str, strOptString, string, jSONObject);
            } catch (J e) {
                if (!"state expired".equals(e.a) || jSONObject.has("captcha_answer")) {
                    throw e;
                }
                strOptString = "";
                this.c = "";
                jSONObjectB = b("prepare", str, "", string, jSONObject);
            }
            String strOptString2 = jSONObjectB.optString("state", strOptString);
            String strOptString3 = jSONObjectB.optString("ticket", "");
            if (strOptString3.isEmpty()) {
                throw new J("ticket_missing", "bridge ticket missing");
            }
            try {
                n = w(jSONObjectB);
            } catch (IOException unused) {
                n = new N(599, "{}".getBytes(StandardCharsets.UTF_8), new Headers.Builder().build());
            }
            JSONObject jSONObject2 = new JSONObject();
            String[] strArr = {"Content-Type", "Set-Cookie"};
            for (int i2 = 0; i2 < 2; i2++) {
                String str2 = strArr[i2];
                Headers headers = (Headers) n.c;
                String strF = headers == null ? "" : f(headers.get(str2));
                if (!strF.isEmpty()) {
                    p(jSONObject2, str2, strF);
                }
            }
            JSONObject jSONObjectK = k("status", Integer.valueOf(n.a), "headers", jSONObject2, "body", Base64.encodeToString((byte[]) n.b, 2));
            p(jSONObjectK, "ticket", strOptString3);
            JSONObject jSONObjectB2 = b("consume", str, strOptString2, string, jSONObjectK);
            strOptString = jSONObjectB2.optString("state", strOptString2);
            this.c = strOptString;
            n();
            if (jSONObjectB2.optBoolean("done", false)) {
                jSONObjectOptJSONObject = jSONObjectB2.optJSONObject("data");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                String strOptString4 = jSONObjectOptJSONObject.optString("error_code", "");
                if (!strOptString4.isEmpty()) {
                    throw new J(strOptString4, jSONObjectOptJSONObject.optString("message", strOptString4));
                }
            }
        }
        throw new J("bridge_rounds", "bridge flow exhausted");
        return jSONObjectOptJSONObject;
    }

    public final K d(JSONObject jSONObject) throws J {
        HttpUrl httpUrl;
        if ("slider".equals(jSONObject.optString("format"))) {
            return new K(jSONObject);
        }
        byte[] bArrH = h(jSONObject.optString("image", ""));
        if (bArrH.length == 0) {
            throw new J("captcha_empty", "captcha image empty");
        }
        String strOptString = jSONObject.optString("cookie", "");
        String strOptString2 = jSONObject.optString("cookie_url", "");
        if (strOptString != null && !strOptString.trim().isEmpty() && (httpUrl = HttpUrl.parse(strOptString2)) != null) {
            String strTrim = strOptString.trim();
            if (!strTrim.contains("=")) {
                strTrim = "YOAPP_SEARCH_CAPTCHA=".concat(strTrim);
            }
            List all = Cookie.parseAll(httpUrl, new Headers.Builder().add("Set-Cookie", strTrim).build());
            if (!all.isEmpty()) {
                this.a.saveFromResponse(httpUrl, all);
                o(httpUrl.toString());
            }
        }
        jSONObject.optString("content_type", "image/png");
        jSONObject.optString("challenge_id", "");
        return new K(bArrH);
    }

    public final O e(int i, int i2, String str, String str2, String str3) {
        return m(c("category_videos", k("type_id", Integer.valueOf(i), "page", Integer.valueOf(i2), "class", f(str), "year", f(str2), "sort", f(str3))));
    }

    public final synchronized void g(C0261h0 c0261h0) {
        this.b = new C0261h0(c0261h0);
        this.c = "";
        r();
        q();
    }

    public final ArrayList j() {
        JSONArray jSONArrayOptJSONArray = c("home_sections", new JSONObject()).optJSONArray("items");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new L(jSONObjectOptJSONObject.optInt("id", 0), jSONObjectOptJSONObject.optString("name", ""), v(jSONObjectOptJSONObject.optJSONArray("classes")), v(jSONObjectOptJSONObject.optJSONArray("years"))));
                }
            }
        }
        return arrayList;
    }

    public final void n() {
        try {
            String str = ((String) this.b.c) + ".bridge106";
            String string = new JSONObject().put("endpoints", Collections.unmodifiableList((ArrayList) this.b.b).toString()).put("state", this.c).put("expires", System.currentTimeMillis() + 82800000).toString();
            boolean z = FishCrypto.a;
            C0297t1.j(str, string);
        } catch (Throwable unused) {
        }
    }

    public final void o(String str) {
        try {
            HttpUrl httpUrl = HttpUrl.parse(str);
            if (httpUrl == null) {
                return;
            }
            JSONArray jSONArrayT = t(this.a.loadForRequest(httpUrl), System.currentTimeMillis());
            if (jSONArrayT.length() == 0) {
                String str2 = (String) this.b.c;
                boolean z = FishCrypto.a;
                C0297t1.b(str2);
            } else {
                String str3 = (String) this.b.c;
                String string = new JSONObject().put("origin", httpUrl.toString()).put("cookies", jSONArrayT).toString();
                boolean z2 = FishCrypto.a;
                C0297t1.j(str3, string);
            }
        } catch (Throwable unused) {
        }
    }

    public final void q() {
        try {
            String str = ((String) this.b.c) + ".bridge106";
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(str);
            if (strH.isEmpty()) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strH);
            if (!Collections.unmodifiableList((ArrayList) this.b.b).toString().equals(jSONObject.optString("endpoints")) || jSONObject.optLong("expires") <= System.currentTimeMillis()) {
                return;
            }
            this.c = jSONObject.optString("state", "");
        } catch (Throwable unused) {
        }
    }

    public final void r() {
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        try {
            this.a.a();
            String str = (String) this.b.c;
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(str);
            if (strH.isEmpty() || (jSONArrayOptJSONArray = (jSONObject = new JSONObject(strH)).optJSONArray("cookies")) == null) {
                return;
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("domain", "");
                    if (!strOptString.isEmpty()) {
                        Cookie.Builder builderExpiresAt = new Cookie.Builder().name(jSONObjectOptJSONObject.optString("name")).value(jSONObjectOptJSONObject.optString("value")).path(jSONObjectOptJSONObject.optString("path", "/")).expiresAt(jSONObjectOptJSONObject.optLong("expiresAt", System.currentTimeMillis() + 604800000));
                        if (jSONObjectOptJSONObject.optBoolean("hostOnly", false)) {
                            builderExpiresAt.hostOnlyDomain(strOptString);
                        } else {
                            builderExpiresAt.domain(strOptString);
                        }
                        if (jSONObjectOptJSONObject.optBoolean("secure", false)) {
                            builderExpiresAt.secure();
                        }
                        if (jSONObjectOptJSONObject.optBoolean("httpOnly", false)) {
                            builderExpiresAt.httpOnly();
                        }
                        Cookie cookieBuild = builderExpiresAt.build();
                        HttpUrl httpUrlBuild = HttpUrl.parse(jSONObject.optString("origin", ""));
                        if (httpUrlBuild == null || cookieBuild == null || !cookieBuild.matches(httpUrlBuild)) {
                            httpUrlBuild = cookieBuild == null ? null : new HttpUrl.Builder().scheme(cookieBuild.secure() ? "https" : "http").host(cookieBuild.domain()).build();
                        }
                        if (httpUrlBuild != null) {
                            this.a.saveFromResponse(httpUrlBuild, Collections.singletonList(cookieBuild));
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final O s(int i, String str) {
        return m(c("search_videos", k("keyword", str, "page", Integer.valueOf(Math.max(1, i)), "page_size", 12)));
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10, types: [byte[], java.io.Serializable] */
    public final N w(JSONObject jSONObject) throws IOException {
        String strOptString = jSONObject.optString("url", "");
        if (strOptString.isEmpty()) {
            throw new IOException("prepared URL missing");
        }
        HttpUrl httpUrl = HttpUrl.parse(strOptString);
        if (httpUrl == null || !httpUrl.isHttps() || !httpUrl.username().isEmpty() || !httpUrl.password().isEmpty()) {
            throw new IOException("prepared URL invalid");
        }
        String upperCase = jSONObject.optString("method", "GET").toUpperCase(Locale.US);
        if (!"GET".equals(upperCase) && !"POST".equals(upperCase)) {
            throw new IOException("prepared method invalid");
        }
        LinkedHashMap linkedHashMapU = u(jSONObject.optJSONObject("headers"));
        Request.Builder builderU = b.u(strOptString);
        for (Map.Entry entry : linkedHashMapU.entrySet()) {
            builderU.header((String) entry.getKey(), (String) entry.getValue());
        }
        byte[] bArrH = h(jSONObject.optString("body_b64", ""));
        if ("POST".equals(upperCase)) {
            builderU.post(RequestBody.create(MediaType.parse((String) linkedHashMapU.get("Content-Type")), bArrH));
        } else {
            builderU.get();
        }
        Response responseExecute = this.d.newCall(builderU.build()).execute();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (responseExecute.body() != null) {
                if (responseExecute.body().contentLength() > 4194304) {
                    throw new IOException("target response too large");
                }
                InputStream inputStreamByteStream = responseExecute.body().byteStream();
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = inputStreamByteStream.read(bArr);
                        if (i == -1) {
                            inputStreamByteStream.close();
                            break;
                        }
                        if (byteArrayOutputStream.size() + i > 4194304) {
                            throw new IOException("target response too large");
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        if (responseExecute != null) {
                            try {
                                responseExecute.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (inputStreamByteStream != null) {
                        try {
                            inputStreamByteStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            ?? byteArray = byteArrayOutputStream.toByteArray();
            if (jSONObject.optJSONObject("headers") != null && jSONObject.optJSONObject("headers").has("X-API-TOKEN")) {
                o(strOptString);
            }
            N n = new N(responseExecute.code(), byteArray, responseExecute.headers());
            responseExecute.close();
            return n;
        } catch (Throwable th4) {
            if (responseExecute != null) {
                responseExecute.close();
            }
            throw th4;
        }
    }

    public final O x(String str) {
        return m(c("verify_search_captcha", k("captcha", str.trim())));
    }

    public final Q y(String str) {
        int i = 1;
        JSONObject jSONObjectC = c("video_detail", k("vod_id", f(str)));
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectC.optJSONArray("sources");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2 += i) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("episodes");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3 += i) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i3);
                            if (jSONObjectOptJSONObject2 != null) {
                                arrayList2.add(new M(jSONObjectOptJSONObject2.optString("id"), jSONObjectOptJSONObject2.optInt("index", i3), jSONObjectOptJSONObject2.optString("name")));
                                i = 1;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(new P(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("key"), arrayList2));
                    }
                    i = 1;
                }
            }
        }
        return new Q(jSONObjectC.optString("id"), jSONObjectC.optString("name"), jSONObjectC.optString("pic"), jSONObjectC.optString("year"), jSONObjectC.optString("area"), jSONObjectC.optString("type"), jSONObjectC.optString("remarks"), jSONObjectC.optString("actor"), jSONObjectC.optString("director"), jSONObjectC.optString("content"), arrayList);
    }

    public final e z(String str, String str2, int i, String str3, JSONObject jSONObject) throws IOException {
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject;
        String strTrim;
        JSONObject jSONObjectK = k("vod_id", f(str), "source", f(str2), "episode_index", Integer.valueOf(i), "episode_id", f(str3));
        if (jSONObject != null) {
            p(jSONObjectK, "captcha_answer", jSONObject);
        }
        JSONObject jSONObjectC = c("video_play", jSONObjectK);
        String[] strArr = {"media", "play", "result", "data"};
        int i2 = 0;
        while (true) {
            jSONObject2 = null;
            if (i2 >= 4) {
                jSONObjectOptJSONObject = null;
                break;
            }
            jSONObjectOptJSONObject = jSONObjectC.optJSONObject(strArr[i2]);
            if (jSONObjectOptJSONObject != null) {
                break;
            }
            i2++;
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectC = jSONObjectOptJSONObject;
        }
        String[] strArr2 = {"url", "play_url", "playUrl", "media_url", "src"};
        int i3 = 0;
        while (true) {
            strTrim = "";
            if (i3 >= 5) {
                break;
            }
            strTrim = jSONObjectC.optString(strArr2[i3], "").trim();
            if (!strTrim.isEmpty()) {
                break;
            }
            i3++;
        }
        String str4 = strTrim;
        if (str4.isEmpty()) {
            throw new J("play_url_missing", "play URL missing");
        }
        String[] strArr3 = {"headers", "header", "request_headers"};
        for (int i4 = 0; i4 < 3; i4++) {
            JSONObject jSONObjectOptJSONObject2 = jSONObjectC.optJSONObject(strArr3[i4]);
            if (jSONObjectOptJSONObject2 != null) {
                jSONObject2 = jSONObjectOptJSONObject2;
                break;
            }
        }
        LinkedHashMap linkedHashMapU = u(jSONObject2);
        int iOptInt = jSONObjectC.optInt("parse", jSONObjectC.optInt("jx", 0));
        boolean zOptBoolean = jSONObjectC.optBoolean("m3u8", str4.toLowerCase(Locale.US).contains(".m3u8"));
        JSONObject jSONObject3 = new JSONObject();
        try {
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Locale locale = Locale.US;
                if (!next.toLowerCase(locale).contains("danmu") && !next.toLowerCase(locale).contains("danmaku")) {
                    jSONObject3.put(next, jSONObjectC.opt(next));
                }
            }
        } catch (JSONException unused) {
        }
        return new e(str4, linkedHashMapU, iOptInt, zOptBoolean, jSONObject3);
    }
}
