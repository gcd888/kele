package com.github.catvod.spider.merge.p000a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0260h;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0261h0;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.S0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.U.a;
import com.github.catvod.spider.merge.p001b.g;
import com.github.catvod.spider.merge.p001b.j;
import com.github.catvod.spider.merge.p001b.k;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0342a0 {
    public static final int v;
    public static final Pattern w;
    public static final C0342a0 x;
    public boolean i;
    public final Object a = new Object();
    public final Object b = new Object();
    public final Map c = Collections.synchronizedMap(new HashMap());
    public final AtomicLong d = new AtomicLong();
    public long e = -1;
    public String f = "";
    public String g = "";
    public final HashSet h = new HashSet();
    public final Set j = Collections.synchronizedSet(new HashSet());
    public final Map k = Collections.synchronizedMap(new HashMap());
    public volatile boolean l = false;
    public volatile boolean m = false;
    public String n = "";
    public String o = "";
    public String p = "Bearer";
    public volatile String q = "";
    public String r = "";
    public String s = "";
    public volatile String t = "";
    public String u = "";

    static {
        ExecutorService executorService = AbstractC0260h.a;
        v = 16;
        w = Pattern.compile("https?://(?:www\\.)?guangyapan\\.com/s/([^\\s?#]+)", 2);
        x = new C0342a0();
    }

    public C0342a0() {
        P();
    }

    public static boolean F(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("type", jSONObject.optString("obj_category", ""));
        return jSONObject.optInt("resType", jSONObject.optInt("fileType", -1)) == 2 || "folder".equalsIgnoreCase(strOptString) || "dir".equalsIgnoreCase(strOptString);
    }

    public static String H(JSONObject jSONObject) {
        return u(jSONObject.optString("fileId"), jSONObject.optString("file_id"), jSONObject.optString("id"), jSONObject.optString("fid"));
    }

    public static String I(JSONObject jSONObject) {
        return u(jSONObject.optString("fileName"), jSONObject.optString("filename"), jSONObject.optString("name"), jSONObject.optString("n"));
    }

    public static String J(String str, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        String str2 = "";
        long j = -1;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!next.equals(str)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                long jOptLong = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optLong("updated_at", 0L) : 0L;
                if (TextUtils.isEmpty(str2) || jOptLong > j) {
                    str2 = next;
                    j = jOptLong;
                }
            }
        }
        return str2;
    }

    public static JSONObject Q() {
        try {
            String strH = C0297t1.h("guangya_offline");
            if (!TextUtils.isEmpty(strH)) {
                return new JSONObject(strH);
            }
        } catch (Exception unused) {
        }
        JSONObject jSONObject = new JSONObject();
        p(jSONObject);
        return jSONObject;
    }

    public static String R(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strReplace = str.trim().replace("&amp;", "&");
        try {
            if (strReplace.contains("%3A") || strReplace.contains("%3F") || strReplace.contains("%26")) {
                strReplace = URLDecoder.decode(strReplace, "UTF-8");
            }
        } catch (Exception unused) {
        }
        String strV = FishCrypto.v("N1.0SuZ3Rr34Fxd1xhJRh3a0kskJqdCTzUTIB6DO5go2ZJPrtdLmkEQfhF0p0UbJmYIPrfmzAZ58kOQKMlx7KVgjOGHtFcRFFGYP6QJ+yIL/vc=");
        if (TextUtils.isEmpty(strV)) {
            return "";
        }
        Matcher matcher = Pattern.compile(strV, 2).matcher(strReplace);
        if (matcher.find()) {
            strReplace = matcher.group(1);
        }
        String strReplaceAll = strReplace.replaceAll("\\s+", "");
        String lowerCase = strReplaceAll.toLowerCase(Locale.ROOT);
        String strV2 = FishCrypto.v("N1.mk0FZJ7MBADmHKydnvxZ8P+R8Hwl55rTb5bnqw6BB+kOrY+eXOsKneCr4n122p6jpM5CnPXEJMsQkEpCaRilLg==");
        String strV3 = FishCrypto.v("N1.J7kPjBPeifjvRLt8GwzF3O/35s6UNZ4qS5qPavaDMX/Yr8Q5CUsj8KQxaMdAd0WCkpGe5dy+pHBeJpJHpgOtPA==");
        return (TextUtils.isEmpty(strV2) || TextUtils.isEmpty(strV3) || !lowerCase.startsWith(strV2) || !lowerCase.contains(strV3)) ? "" : strReplaceAll;
    }

    public static String S(String str) {
        String strTrim;
        if (str == null) {
            strTrim = "";
        } else {
            try {
                strTrim = str.trim();
            } catch (Exception unused) {
                return str == null ? "" : str.trim();
            }
        }
        String strDecode = URLDecoder.decode(strTrim, "UTF-8");
        String strV = v(strDecode, "golink");
        if (!TextUtils.isEmpty(strV)) {
            String strL = l(strV);
            if (!TextUtils.isEmpty(strL)) {
                return strL;
            }
        }
        return strDecode;
    }

    public static String T(String str) {
        String lowerCase = "";
        if (!TextUtils.isEmpty(str)) {
            String strV = FishCrypto.v("N1.+iaz9DdaIVvsf6jAOHHSY83SLMEykL1/Cne4RZpLLV8jfMsfBYHm7+J3atmCoYlSNPCmsL0V8T5mU9XE6k/epIAOvB9mqT5743SWXGmH01I=");
            if (!TextUtils.isEmpty(strV)) {
                Matcher matcher = Pattern.compile(strV, 2).matcher(str);
                if (matcher.find()) {
                    lowerCase = matcher.group(1).toLowerCase(Locale.ROOT);
                }
            }
        }
        return TextUtils.isEmpty(lowerCase) ? AbstractC0309x1.a(str) : lowerCase;
    }

    public static S0 U(String str) {
        try {
            String strS = S(str);
            String strV = v(strS, "code");
            if (TextUtils.isEmpty(strV)) {
                strV = v(str, "code");
            }
            if (TextUtils.isEmpty(strV)) {
                Matcher matcher = Pattern.compile("(?:提取码|访问码|密码)\\s*[:：]?\\s*([A-Za-z0-9]+)").matcher(strS);
                if (matcher.find()) {
                    strV = matcher.group(1);
                }
            }
            Matcher matcher2 = w.matcher(strS);
            if (!matcher2.find()) {
                return null;
            }
            String strGroup = matcher2.group(1);
            if (strGroup.contains("?")) {
                strGroup = strGroup.substring(0, strGroup.indexOf(63));
            }
            if (strGroup.contains("#")) {
                strGroup = strGroup.substring(0, strGroup.indexOf(35));
            }
            return new S0(strGroup, 3, strV);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Y V(String str, String str2, String str3, JSONObject jSONObject) {
        Y y = new Y(0);
        y.a = str;
        y.b = str2;
        y.c = u(jSONObject.optString("fileId"), jSONObject.optString("id"));
        y.d = u(jSONObject.optString("fileName"), jSONObject.optString("name"));
        y.e = u(jSONObject.optString("md5"), jSONObject.optString("fileMd5"), jSONObject.optString("etag"));
        y.g = jSONObject.optLong("fileSize", jSONObject.optLong("size", 0L));
        y.h = jSONObject.optInt("resType", jSONObject.optInt("type", 0)) == 2 || "folder".equalsIgnoreCase(jSONObject.optString("type"));
        y.f = str3;
        return y;
    }

    public static String Y(String str, String str2, HashMap map, JSONObject jSONObject) throws Exception {
        N nM = X1.M("https://api.guangyapan.com".concat(str), jSONObject.toString(), map);
        if (m0(nM) && !TextUtils.isEmpty(str2)) {
            nM = X1.M("https://api.guangyapan.com".concat(str2), jSONObject.toString(), map);
        }
        int i = nM.a;
        if (i >= 200 && i < 300) {
            return nM.a();
        }
        throw new Exception("HTTP " + i + ": " + nM.a());
    }

    public static void b(JSONObject jSONObject, JSONArray jSONArray, ArrayList arrayList, String str) {
        String strH = H(jSONObject);
        String strI = I(jSONObject);
        if (TextUtils.isEmpty(strH) || arrayList.contains(strH) || !AbstractC0309x1.i(strI)) {
            return;
        }
        arrayList.add(strH);
        try {
            if (TextUtils.isEmpty(jSONObject.optString("path", ""))) {
                if (TextUtils.isEmpty(str)) {
                    str = strI;
                }
                jSONObject.put("path", str);
            }
        } catch (Exception unused) {
        }
        jSONArray.put(jSONObject);
    }

    public static void f(JSONObject jSONObject) throws Exception {
        int iOptInt;
        String[] strArr = {"code", "errno", "errcode", "errorCode"};
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (jSONObject.has(str) && (iOptInt = jSONObject.optInt(str, -1)) != 0 && (!"code".equals(str) || iOptInt != 200)) {
                throw new Exception("光鸭转存目录请求失败: " + str + "=" + iOptInt);
            }
        }
        if ((jSONObject.has("success") && !jSONObject.optBoolean("success")) || Boolean.FALSE.equals(jSONObject.opt("state")) || !TextUtils.isEmpty(jSONObject.optString("error", ""))) {
            throw new Exception("光鸭转存目录业务失败");
        }
    }

    public static JSONObject g(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(str);
        f(jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = jSONObject;
        }
        if (jSONObjectOptJSONObject != jSONObject) {
            f(jSONObjectOptJSONObject);
        }
        return jSONObjectOptJSONObject;
    }

    public static String i0(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
        if (jSONObjectOptJSONObject != null) {
            jSONObject = jSONObjectOptJSONObject;
        }
        String[] strArr = {"targetFileId", "savedFileId", "fileId"};
        for (int i = 0; i < 3; i++) {
            Object objOpt = jSONObject.opt(strArr[i]);
            if ((objOpt instanceof String) || (objOpt instanceof Number)) {
                String strValueOf = String.valueOf(objOpt);
                if (!TextUtils.isEmpty(strValueOf) && !"0".equals(strValueOf) && !strValueOf.equals(str)) {
                    return strValueOf;
                }
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("fileIds");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() != 1) {
            return "";
        }
        Object objOpt2 = jSONArrayOptJSONArray.opt(0);
        if (!(objOpt2 instanceof String) && !(objOpt2 instanceof Number)) {
            return "";
        }
        String strValueOf2 = String.valueOf(objOpt2);
        return (TextUtils.isEmpty(strValueOf2) || "0".equals(strValueOf2) || strValueOf2.equals(str)) ? "" : strValueOf2;
    }

    public static void k0(JSONObject jSONObject) {
        try {
            C0297t1.j("guangya_offline", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public static String l(String str) {
        String strTrim;
        if (str == null) {
            strTrim = "";
        } else {
            try {
                strTrim = str.trim();
            } catch (Exception unused) {
            }
        }
        String strDecode = URLDecoder.decode(strTrim, "UTF-8");
        int length = strDecode.length() % 4;
        if (length > 0) {
            strDecode = strDecode + "====".substring(length);
        }
        int[] iArr = {0, 10, 11};
        for (int i = 0; i < 3; i++) {
            try {
                String strTrim2 = new String(Base64.decode(strDecode, iArr[i]), "UTF-8").trim();
                if (strTrim2.startsWith("http") || strTrim2.contains("guangyapan.com/s/")) {
                    return URLDecoder.decode(strTrim2, "UTF-8");
                }
            } catch (Exception unused2) {
            }
        }
        return "";
    }

    public static boolean m0(N n) {
        int i = n.a;
        if (i == 400 || i == 404 || i == 405) {
            return true;
        }
        String strA = n.a();
        return strA.contains("not found") || strA.contains("404");
    }

    public static JSONObject p(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("records");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
            try {
                jSONObject.put("records", jSONObjectOptJSONObject);
            } catch (Exception unused) {
            }
        }
        return jSONObjectOptJSONObject;
    }

    public static JSONArray s(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = jSONObject;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("files");
        }
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("fileList");
        }
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = jSONObject.optJSONArray("list");
        }
        return jSONArrayOptJSONArray == null ? jSONObject.optJSONArray("files") : jSONArrayOptJSONArray;
    }

    public static String u(String... strArr) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public static String v(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(?:\\?|&)" + Pattern.quote(str2) + "=([^&#\\s]+)").matcher(str);
            return matcher.find() ? URLDecoder.decode(matcher.group(1), "UTF-8") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static HashMap w() {
        return b.t("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36", "Referer", "https://www.guangyapan.com/");
    }

    public final String A(Y y) throws JSONException {
        n();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fileId", y.c);
        jSONObject.put("accessToken", y.b);
        JSONObject jSONObject2 = new JSONObject(a0(jSONObject, "/userres/v1/get_share_download_url", "/nd.bizuserres.s/v1/get_share_download_url"));
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = jSONObject2;
        }
        return u(jSONObjectOptJSONObject.optString("signedURL"), jSONObjectOptJSONObject.optString("signedUrl"), jSONObjectOptJSONObject.optString("downloadUrl"), jSONObjectOptJSONObject.optString("downloadURL"), jSONObjectOptJSONObject.optString("url"), jSONObject2.optString("signedURL"), jSONObject2.optString("downloadUrl"), jSONObject2.optString("url"));
    }

    public final String B(Y y, String str, long j, String str2) {
        HashSet hashSet;
        HashSet hashSet2;
        String strH0;
        HashSet hashSet3;
        synchronized (this.b) {
            try {
                n();
                String strO0 = o0();
                if (!TextUtils.isEmpty(str) && !str.equals(strO0)) {
                    throw new Exception("光鸭转存账号已切换");
                }
                String strQ = q();
                synchronized (this.a) {
                    if (!strO0.equals(o0()) || !strQ.equals(this.u)) {
                        throw new Exception("光鸭转存账号已切换");
                    }
                    String str3 = strO0 + ":" + y.a + ":" + y.c;
                    String str4 = (String) this.k.get(str3);
                    boolean z = !TextUtils.isEmpty(str4);
                    if (z) {
                        e0(j, strQ, str4, strO0);
                        String strY = "";
                        try {
                            strY = y(str4);
                            e = null;
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                        }
                        if (!TextUtils.isEmpty(strY)) {
                            return strY;
                        }
                        try {
                            hashSet3 = new HashSet(K(strQ));
                        } catch (InterruptedException e3) {
                            Thread.currentThread().interrupt();
                            throw e3;
                        } catch (Exception unused) {
                            hashSet3 = null;
                        }
                        synchronized (this.k) {
                            if (hashSet3 != null) {
                                if (!hashSet3.contains(str4) && strO0.equals(o0()) && strQ.equals(this.u) && str4.equals(this.k.get(str3))) {
                                    this.k.remove(str3);
                                    this.c.remove(str4);
                                    if (d0(j, strQ, strO0)) {
                                        this.h.remove(str4);
                                    }
                                    hashSet = hashSet3;
                                }
                            }
                            if (e == null) {
                                return strY;
                            }
                            throw e;
                        }
                    }
                    hashSet = null;
                    if (z) {
                        strH0 = h0(y, strQ, strO0, j, hashSet);
                    } else {
                        try {
                            hashSet2 = new HashSet(K(strQ));
                        } catch (Exception unused2) {
                            hashSet2 = null;
                        }
                        strH0 = h0(y, strQ, strO0, j, hashSet2);
                    }
                    e0(j, strQ, strH0, strO0);
                    String strY2 = y(strH0);
                    if (!TextUtils.isEmpty(strY2) && (z || str2 != null)) {
                        this.k.put(str3, strH0);
                    }
                    return strY2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final LinkedHashMap C() {
        boolean zG;
        String str;
        P();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            zG = !TextUtils.isEmpty(this.n) ? q0() : false;
            if (!zG && !TextUtils.isEmpty(this.o)) {
                zG = f0() && q0();
            }
        } catch (Exception unused) {
            zG = G();
        }
        linkedHashMap.put("hasCookie", Boolean.valueOf(zG));
        linkedHashMap.put("isLoggedIn", Boolean.valueOf(zG));
        linkedHashMap.put("account", u(this.t, this.q));
        linkedHashMap.put("name", this.r);
        linkedHashMap.put("userName", u(this.r, this.t, this.q));
        linkedHashMap.put("nickname", u(this.r, this.t, this.q));
        linkedHashMap.put("picture", this.s);
        linkedHashMap.put("phone", this.t);
        linkedHashMap.put("sub", this.q);
        linkedHashMap.put("tokenType", this.p);
        if (zG) {
            try {
                JSONObject jSONObject = new JSONObject(Z("/assets/v1/get_assets", new JSONObject()));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                    jSONObject = jSONObjectOptJSONObject;
                }
                long jOptLong = jSONObject.optLong("totalSpaceSize", 0L);
                long jOptLong2 = jSONObject.optLong("totalDirectLinkTraffic", 0L);
                long jOptLong3 = jSONObject.optLong("freeDirectLinkTraffic", 0L);
                long jOptLong4 = jSONObject.optLong("totalShareGuestTraffic", 0L);
                long jOptLong5 = jSONObject.optLong("freeShareGuestTraffic", 0L);
                int iOptInt = jSONObject.optInt("vipStatus", 0);
                int iOptInt2 = jSONObject.optInt("svipStatus", 0);
                long jOptLong6 = jSONObject.optLong("vipExpireTime", 0L);
                boolean z = iOptInt > 0 || iOptInt2 > 0;
                if (iOptInt2 > 0) {
                    str = "SVIP";
                } else {
                    str = iOptInt > 0 ? "VIP" : "普通用户";
                }
                String str2 = str;
                linkedHashMap.put("isVip", Boolean.valueOf(z));
                linkedHashMap.put("vipStatus", Integer.valueOf(iOptInt));
                linkedHashMap.put("svipStatus", Integer.valueOf(iOptInt2));
                linkedHashMap.put("member_type", str2);
                String str3 = "";
                if (jOptLong6 > 0) {
                    try {
                        str3 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(jOptLong6 * 1000));
                    } catch (Exception unused2) {
                    }
                }
                linkedHashMap.put("expire_time", str3);
                if (jOptLong > 0) {
                    linkedHashMap.put("total_capacity", AbstractC0309x1.h(jOptLong));
                }
                long j = 0;
                if (jOptLong2 > 0) {
                    linkedHashMap.put("direct_link_traffic", AbstractC0309x1.h(Math.max(0L, jOptLong2 - jOptLong3)) + " / " + AbstractC0309x1.h(jOptLong2));
                    linkedHashMap.put("free_direct_link_traffic", AbstractC0309x1.h((double) jOptLong3));
                    j = 0;
                }
                if (jOptLong4 > j) {
                    linkedHashMap.put("share_guest_traffic", AbstractC0309x1.h(Math.max(j, jOptLong4 - jOptLong5)) + " / " + AbstractC0309x1.h(jOptLong4));
                    linkedHashMap.put("free_share_guest_traffic", AbstractC0309x1.h((double) jOptLong5));
                }
            } catch (Exception unused3) {
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:44:0x0144  */
    /* JADX WARN: Code duplicated, block: B:49:0x0159  */
    /* JADX WARN: Code duplicated, block: B:54:0x016e  */
    public final k D(S0 s0) throws Throwable {
        ExecutorService executorService;
        Throwable th;
        List<Y> listEmptyList;
        ArrayList arrayList;
        C0261h0 c0261h0;
        String str;
        String strK;
        String string;
        String strEncode;
        if (s0 == null) {
            return null;
        }
        String str2 = s0.b;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            listEmptyList = Collections.emptyList();
        } else {
            String strZ = z(s0);
            if (TextUtils.isEmpty(strZ)) {
                listEmptyList = Collections.emptyList();
            } else {
                List listSynchronizedList = Collections.synchronizedList(new ArrayList());
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                AtomicInteger atomicInteger = new AtomicInteger(1);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                concurrentLinkedQueue.add(new X("", ""));
                int i = v;
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i);
                int i2 = 0;
                while (i2 < i) {
                    try {
                        int i3 = i2;
                        String str3 = strZ;
                        String str4 = strZ;
                        executorService = executorServiceNewFixedThreadPool;
                        int i4 = i;
                        try {
                            try {
                                executorService.submit(new RunnableC0366m0(this, concurrentLinkedQueue, countDownLatch, s0, str3, atomicInteger, listSynchronizedList));
                                i2 = i3 + 1;
                                executorServiceNewFixedThreadPool = executorService;
                                strZ = str4;
                                i = i4;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                executorService.shutdownNow();
                                Collections.sort(listSynchronizedList, new a(1));
                                listEmptyList = listSynchronizedList;
                                k kVar = new k();
                                kVar.i(AbstractC0302v0.Y0("guangya"));
                                kVar.o(AbstractC0302v0.Y0("guangya"));
                                kVar.n(str2);
                                kVar.p("");
                                arrayList = new ArrayList();
                                for (Y y : listEmptyList) {
                                    j jVar = new j();
                                    StringBuilder sb = new StringBuilder("[");
                                    sb.append(AbstractC0309x1.h(y.g));
                                    sb.append("]");
                                    str = y.d;
                                    if (TextUtils.isEmpty(str)) {
                                        strK = "未命名";
                                    } else {
                                        strK = b.k(str, "#", "_", "$", "_");
                                    }
                                    sb.append(strK);
                                    jVar.a = sb.toString();
                                    StringBuilder sb2 = new StringBuilder("share++");
                                    string = y.b().toString();
                                    try {
                                        try {
                                            strEncode = Base64.encodeToString(string.getBytes("UTF-8"), 10);
                                        } catch (Exception unused2) {
                                            strEncode = "";
                                        }
                                    } catch (Exception unused3) {
                                        strEncode = URLEncoder.encode(string, "UTF-8");
                                    }
                                    sb2.append(strEncode);
                                    jVar.b = sb2.toString();
                                    arrayList.add(jVar);
                                }
                                c0261h0 = new C0261h0(4);
                                if (C0299u0.g0("guangya_original")) {
                                    c0261h0.b(AbstractC0302v0.f1("guangya_original"), arrayList);
                                }
                                if (C0299u0.g0("guangya_unlimited")) {
                                    c0261h0.b(AbstractC0302v0.f1("guangya_unlimited"), arrayList);
                                }
                                if (C0299u0.g0("guangya_to_123")) {
                                    c0261h0.b(AbstractC0302v0.f1("guangya_to_123"), arrayList);
                                }
                                S0 s0C = c0261h0.c();
                                kVar.q(s0C.b);
                                kVar.r(s0C.c);
                                return AbstractC0302v0.f(kVar);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            executorService.shutdownNow();
                            throw th;
                        }
                    } catch (InterruptedException unused4) {
                        executorService = executorServiceNewFixedThreadPool;
                        Thread.currentThread().interrupt();
                        executorService.shutdownNow();
                        Collections.sort(listSynchronizedList, new a(1));
                        listEmptyList = listSynchronizedList;
                        k kVar2 = new k();
                        kVar2.i(AbstractC0302v0.Y0("guangya"));
                        kVar2.o(AbstractC0302v0.Y0("guangya"));
                        kVar2.n(str2);
                        kVar2.p("");
                        arrayList = new ArrayList();
                        while (r0.hasNext()) {
                            j jVar2 = new j();
                            StringBuilder sb3 = new StringBuilder("[");
                            sb3.append(AbstractC0309x1.h(y.g));
                            sb3.append("]");
                            str = y.d;
                            if (TextUtils.isEmpty(str)) {
                                strK = "未命名";
                            } else {
                                strK = b.k(str, "#", "_", "$", "_");
                            }
                            sb3.append(strK);
                            jVar2.a = sb3.toString();
                            StringBuilder sb4 = new StringBuilder("share++");
                            string = y.b().toString();
                            strEncode = Base64.encodeToString(string.getBytes("UTF-8"), 10);
                            sb4.append(strEncode);
                            jVar2.b = sb4.toString();
                            arrayList.add(jVar2);
                        }
                        c0261h0 = new C0261h0(4);
                        if (C0299u0.g0("guangya_original")) {
                            c0261h0.b(AbstractC0302v0.f1("guangya_original"), arrayList);
                        }
                        if (C0299u0.g0("guangya_unlimited")) {
                            c0261h0.b(AbstractC0302v0.f1("guangya_unlimited"), arrayList);
                        }
                        if (C0299u0.g0("guangya_to_123")) {
                            c0261h0.b(AbstractC0302v0.f1("guangya_to_123"), arrayList);
                        }
                        S0 s0C2 = c0261h0.c();
                        kVar2.q(s0C2.b);
                        kVar2.r(s0C2.c);
                        return AbstractC0302v0.f(kVar2);
                    } catch (Throwable th3) {
                        th = th3;
                        executorService = executorServiceNewFixedThreadPool;
                        executorService.shutdownNow();
                        throw th;
                    }
                }
                executorService = executorServiceNewFixedThreadPool;
                countDownLatch.await();
                executorService.shutdownNow();
                Collections.sort(listSynchronizedList, new a(1));
                listEmptyList = listSynchronizedList;
            }
        }
        k kVar3 = new k();
        kVar3.i(AbstractC0302v0.Y0("guangya"));
        kVar3.o(AbstractC0302v0.Y0("guangya"));
        kVar3.n(str2);
        kVar3.p("");
        arrayList = new ArrayList();
        while (r0.hasNext()) {
            j jVar3 = new j();
            StringBuilder sb5 = new StringBuilder("[");
            sb5.append(AbstractC0309x1.h(y.g));
            sb5.append("]");
            str = y.d;
            if (TextUtils.isEmpty(str)) {
                strK = "未命名";
            } else {
                strK = b.k(str, "#", "_", "$", "_");
            }
            sb5.append(strK);
            jVar3.a = sb5.toString();
            StringBuilder sb6 = new StringBuilder("share++");
            string = y.b().toString();
            strEncode = Base64.encodeToString(string.getBytes("UTF-8"), 10);
            sb6.append(strEncode);
            jVar3.b = sb6.toString();
            arrayList.add(jVar3);
        }
        c0261h0 = new C0261h0(4);
        if (C0299u0.g0("guangya_original") && !arrayList.isEmpty()) {
            c0261h0.b(AbstractC0302v0.f1("guangya_original"), arrayList);
        }
        if (C0299u0.g0("guangya_unlimited") && !arrayList.isEmpty()) {
            c0261h0.b(AbstractC0302v0.f1("guangya_unlimited"), arrayList);
        }
        if (C0299u0.g0("guangya_to_123") && !arrayList.isEmpty()) {
            c0261h0.b(AbstractC0302v0.f1("guangya_to_123"), arrayList);
        }
        S0 s0C3 = c0261h0.c();
        kVar3.q(s0C3.b);
        kVar3.r(s0C3.c);
        return AbstractC0302v0.f(kVar3);
    }

    public final boolean E(long j, String str) {
        return !TextUtils.isEmpty(str) && str.equals(o0()) && j == this.d.get();
    }

    public final boolean G() {
        boolean z;
        synchronized (this.a) {
            try {
                P();
                z = (TextUtils.isEmpty(this.n) && TextUtils.isEmpty(this.o)) ? false : true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final ArrayList K(String str) {
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : L(str)) {
            if (jSONObject.optInt("resType", jSONObject.optInt("type", 0)) != 2 && !"folder".equalsIgnoreCase(jSONObject.optString("type"))) {
                arrayList.add(u(jSONObject.optString("fileId"), jSONObject.optString("id")));
            }
        }
        return arrayList;
    }

    public final ArrayList L(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception("光鸭临时目录ID缺失");
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = -1;
        for (int i2 = 0; i2 < 100; i2++) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("parentId", str);
            jSONObject.put("page", i2);
            jSONObject.put("pageSize", 50);
            jSONObject.put("orderBy", 3);
            jSONObject.put("sortType", 1);
            JSONObject jSONObjectG = g(a0(jSONObject, "/userres/v1/file/get_file_list", "/nd.bizuserres.s/v1/file/get_file_list"));
            JSONArray jSONArrayS = s(jSONObjectG);
            if (jSONArrayS == null) {
                throw new Exception("光鸭临时目录缺少列表");
            }
            if (jSONObjectG.has("total") || jSONObjectG.has("totalCount")) {
                int iOptInt = jSONObjectG.optInt("total", jSONObjectG.optInt("totalCount", -1));
                if (iOptInt < 0 || (i >= 0 && i != iOptInt)) {
                    throw new Exception("光鸭临时目录分页已变化");
                }
                i = iOptInt;
            }
            for (int i3 = 0; i3 < jSONArrayS.length(); i3++) {
                JSONObject jSONObject2 = jSONArrayS.getJSONObject(i3);
                String strU = u(jSONObject2.optString("fileId"), jSONObject2.optString("id"));
                if (TextUtils.isEmpty(strU) || !hashSet.add(strU)) {
                    throw new Exception("光鸭临时目录存在无效或重复ID");
                }
                arrayList.add(jSONObject2);
            }
            if (i >= 0 && arrayList.size() > i) {
                throw new Exception("光鸭临时目录计数异常");
            }
            if (i >= 0 && arrayList.size() == i) {
                if (jSONObjectG.optBoolean("hasMore") || jSONObjectG.optBoolean("hasNext")) {
                    throw new Exception("光鸭临时目录分页状态异常");
                }
                return arrayList;
            }
            if (jSONArrayS.length() < 50) {
                if ((i >= 0 && arrayList.size() < i) || jSONObjectG.optBoolean("hasMore") || jSONObjectG.optBoolean("hasNext")) {
                    throw new Exception("光鸭临时目录分页不完整");
                }
                return arrayList;
            }
        }
        throw new Exception("光鸭临时目录超过分页上限");
    }

    public final String M(int i, String str) {
        try {
            n();
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jSONObject.put("parentId", str);
            jSONObject.put("page", Math.max(0, i - 1));
            jSONObject.put("pageSize", 50);
            jSONObject.put("orderBy", 3);
            jSONObject.put("sortType", 1);
            N nB0 = b0("/userres/v1/file/get_file_list", jSONObject, true);
            int i2 = nB0.a;
            if (i2 == 400 || i2 == 404) {
                nB0 = b0("/nd.bizuserres.s/v1/file/get_file_list", jSONObject, true);
            }
            int i3 = nB0.a;
            if (i3 >= 400) {
                throw new Exception("HTTP " + i3 + ": " + nB0.a());
            }
            String strA = nB0.a();
            try {
                JSONArray jSONArrayS = s(new JSONObject(strA));
                if (jSONArrayS != null) {
                    for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayS.optJSONObject(i4);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("fileId", jSONObjectOptJSONObject.optString("id"));
                            if (TextUtils.isEmpty(strOptString)) {
                                continue;
                            } else {
                                this.c.put(strOptString, jSONObjectOptJSONObject);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return TextUtils.isEmpty(strA) ? "{\"code\":-1,\"message\":\"光鸭文件列表为空\"}" : strA;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("{\"code\":-1,\"message\":\"");
            String message = e.getMessage();
            return b.m(sb, message != null ? message.replace("\\", "\\\\").replace("\"", "\\\"") : "", "\"}");
        }
    }

    public final String N(String str, int i, String str2) {
        String strEncode;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            S0 s0U = U(str);
            if (s0U == null) {
                throw new Exception("光鸭分享地址无效");
            }
            String strZ = z(s0U);
            if (TextUtils.isEmpty(strZ)) {
                throw new Exception("光鸭分享访问令牌获取失败");
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("page", Math.max(0, i - 1));
            jSONObject2.put("pageSize", 50);
            jSONObject2.put("accessToken", strZ);
            jSONObject2.put("parentId", TextUtils.isEmpty(str2) ? "" : str2);
            jSONObject2.put("orderBy", 3);
            jSONObject2.put("sortType", 1);
            N nB0 = b0("/userres/v1/get_share_page_files_list", jSONObject2, false);
            if (m0(nB0)) {
                nB0 = b0("/nd.bizuserres.s/v1/get_share_page_files_list", jSONObject2, false);
            }
            int i2 = nB0.a;
            if (i2 >= 400) {
                throw new Exception("HTTP " + i2);
            }
            JSONArray jSONArrayS = s(new JSONObject(nB0.a()));
            if (jSONArrayS != null) {
                for (int i3 = 0; i3 < jSONArrayS.length(); i3++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayS.optJSONObject(i3);
                    if (jSONObjectOptJSONObject != null) {
                        Y yV = V(s0U.b, strZ, "", jSONObjectOptJSONObject);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("name", yV.d);
                        jSONObject3.put("folder", yV.h);
                        jSONObject3.put("size", yV.g);
                        if (yV.h) {
                            jSONObject3.put("state", yV.c);
                        } else if (AbstractC0309x1.i(yV.d)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("share++");
                            String string = yV.b().toString();
                            try {
                                try {
                                    strEncode = Base64.encodeToString(string.getBytes("UTF-8"), 10);
                                } catch (Exception unused) {
                                    strEncode = "";
                                }
                            } catch (Exception unused2) {
                                strEncode = URLEncoder.encode(string, "UTF-8");
                            }
                            sb.append(strEncode);
                            jSONObject3.put("playId", sb.toString());
                        }
                        jSONArray.put(jSONObject3);
                    }
                }
            }
            jSONObject.put("code", 0);
            jSONObject.put("list", jSONArray);
            jSONObject.put("hasMore", jSONArrayS != null && jSONArrayS.length() >= 50);
            return jSONObject.toString();
        } catch (Exception e) {
            return "{\"code\":-1,\"message\":" + JSONObject.quote(e.getMessage()) + "}";
        }
    }

    public final void O(S0 s0, String str, X x2, ConcurrentLinkedQueue concurrentLinkedQueue, AtomicInteger atomicInteger, List list) {
        for (int i = 0; i < 100; i++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("page", i);
                jSONObject.put("pageSize", 50);
                jSONObject.put("accessToken", str);
                String str2 = x2.a;
                String str3 = x2.b;
                jSONObject.put("parentId", str2);
                jSONObject.put("orderBy", 3);
                jSONObject.put("sortType", 1);
                N nB0 = b0("/userres/v1/get_share_page_files_list", jSONObject, false);
                int i2 = nB0.a;
                if (i2 == 400 || i2 == 404) {
                    nB0 = b0("/nd.bizuserres.s/v1/get_share_page_files_list", jSONObject, false);
                }
                int i3 = nB0.a;
                if (i3 >= 400) {
                    throw new Exception("HTTP " + i3 + ": " + nB0.a());
                }
                JSONArray jSONArrayS = s(new JSONObject(nB0.a()));
                if (jSONArrayS != null && jSONArrayS.length() != 0) {
                    for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayS.optJSONObject(i4);
                        if (jSONObjectOptJSONObject != null) {
                            Y yV = V(s0.b, str, str3, jSONObjectOptJSONObject);
                            if (yV.h) {
                                atomicInteger.incrementAndGet();
                                concurrentLinkedQueue.add(new X(yV.c, TextUtils.isEmpty(str3) ? yV.d : str3 + "/" + yV.d));
                            } else {
                                if (AbstractC0309x1.i(yV.d)) {
                                    list.add(yV);
                                }
                            }
                        }
                    }
                    if (jSONArrayS.length() < 50) {
                        return;
                    }
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
    }

    public final void P() {
        synchronized (this.a) {
            try {
                String strH = C0297t1.h("guangya");
                if (!TextUtils.isEmpty(strH) && strH.trim().startsWith("{")) {
                    JSONObject jSONObject = new JSONObject(strH);
                    this.n = jSONObject.optString("access_token", this.n);
                    this.o = jSONObject.optString("refresh_token", this.o);
                    this.p = jSONObject.optString("token_type", this.p);
                    this.q = jSONObject.optString("sub", this.q);
                    this.r = jSONObject.optString("name", this.r);
                    this.s = jSONObject.optString("picture", this.s);
                    this.t = jSONObject.optString("phone", this.t);
                    this.u = jSONObject.optString("kaiser_folder", this.u);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final String W(String str, String str2) {
        String strDecode;
        String strY = "";
        long jIncrementAndGet = this.d.incrementAndGet();
        try {
            if (TextUtils.isEmpty(str)) {
                return g.d("光鸭播放参数为空");
            }
            String[] strArrSplit = str.split("\\+\\+");
            if (strArrSplit.length >= 2 && "share".equals(strArrSplit[0])) {
                String str3 = strArrSplit[1];
                try {
                    try {
                        strDecode = new String(Base64.decode(str3, 10), "UTF-8");
                    } catch (Exception unused) {
                        strDecode = URLDecoder.decode(str3, "UTF-8");
                    }
                } catch (Exception unused2) {
                    strDecode = "";
                }
                Y yA = Y.a(new JSONObject(strDecode));
                if ("guangya_unlimited".equals(AbstractC0302v0.L1(str2))) {
                    try {
                        strY = A(yA);
                    } catch (Exception unused3) {
                    }
                    if (TextUtils.isEmpty(strY)) {
                        strY = B(yA, "", jIncrementAndGet, null);
                    } else {
                        p0(yA, jIncrementAndGet);
                    }
                } else {
                    strY = B(yA, "", jIncrementAndGet, null);
                }
            } else if (strArrSplit.length < 2 || !"my".equals(strArrSplit[0])) {
                n();
                strY = y(str);
            } else {
                String str4 = strArrSplit[1];
                n();
                strY = y(str4);
            }
            if (TextUtils.isEmpty(strY)) {
                return g.d("光鸭获取播放地址失败");
            }
            HashMap mapW = w();
            g gVar = new g();
            gVar.C(strY);
            gVar.h(mapW);
            gVar.n();
            return gVar.r();
        } catch (Exception e) {
            return g.d("光鸭播放失败: " + e.getMessage());
        }
    }

    public final boolean X(String str) {
        synchronized (this.a) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("grant_type", "urn:ietf:params:oauth:grant-type:device_code");
                jSONObject.put("device_code", str);
                jSONObject.put("client_id", "aMe-8VSlkrbQXpUR");
                JSONObject jSONObject2 = new JSONObject(X1.M("https://account.guangyapan.com/v1/auth/token", jSONObject.toString(), a(false)).a());
                if (!TextUtils.isEmpty(jSONObject2.optString("error"))) {
                    return false;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = jSONObject2;
                }
                if (TextUtils.isEmpty(u(jSONObjectOptJSONObject.optString("access_token"), jSONObject2.optString("access_token")))) {
                    return false;
                }
                j();
                this.q = "";
                this.t = "";
                d(jSONObject2);
                j0();
                q0();
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public final String Z(String str, JSONObject jSONObject) throws Exception {
        N nB0 = b0(str, jSONObject, true);
        int i = nB0.a;
        if (i >= 200 && i < 300) {
            return nB0.a();
        }
        throw new Exception("HTTP " + i + ": " + nB0.a());
    }

    public final HashMap a(boolean z) {
        HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36", "Referer", "https://www.guangyapan.com/");
        mapT.put("Content-Type", "application/json");
        mapT.put("Origin", "https://www.guangyapan.com");
        if (z) {
            mapT.put("Authorization", e());
        }
        return mapT;
    }

    public final String a0(JSONObject jSONObject, String str, String str2) {
        HashMap mapC;
        synchronized (this.a) {
            try {
                if (TextUtils.isEmpty(this.n) && !f0()) {
                    throw new Exception("光鸭网盘未登录");
                }
                mapC = c(true);
            } catch (Throwable th) {
                throw th;
            }
        }
        return Y(str, str2, mapC, jSONObject);
    }

    public final N b0(String str, JSONObject jSONObject, boolean z) throws Exception {
        if (z && TextUtils.isEmpty(this.n) && !f0()) {
            throw new Exception("光鸭网盘未登录");
        }
        return X1.M("https://api.guangyapan.com".concat(str), jSONObject.toString(), c(z));
    }

    public final HashMap c(boolean z) {
        HashMap mapT = b.t("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36", "Referer", "https://www.guangyapan.com/");
        mapT.put("Content-Type", "application/json");
        mapT.put("Origin", "https://www.guangyapan.com");
        if (z) {
            mapT.put("Authorization", e());
        }
        return mapT;
    }

    public final synchronized JSONObject c0(long j, String str, String str2) {
        try {
            n();
            if (!G()) {
                throw new Exception("光鸭网盘未登录");
            }
            String strR = R(str);
            if (TextUtils.isEmpty(strR)) {
                throw new Exception("磁力链接无效");
            }
            JSONObject jSONObjectX = x(strR);
            JSONArray jSONArrayOptJSONArray = jSONObjectX == null ? null : jSONObjectX.optJSONArray("files");
            if ((jSONArrayOptJSONArray == null ? 0 : jSONArrayOptJSONArray.length()) > 0) {
                return jSONObjectX;
            }
            String strOptString = jSONObjectX == null ? "new" : jSONObjectX.optString("status", "new");
            if (!"failed".equals(strOptString) && !"quota_exhausted".equals(strOptString)) {
                if ("new".equals(strOptString)) {
                    n0(strR, str2);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() + Math.max(0L, j);
                int i = 0;
                int i2 = 0;
                while (true) {
                    JSONObject jSONObjectG0 = g0(strR);
                    String strOptString2 = jSONObjectG0.optString("status", "");
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectG0.optJSONArray("files");
                    int length = jSONArrayOptJSONArray2 == null ? 0 : jSONArrayOptJSONArray2.length();
                    if (length > 0) {
                        i2 = length == i ? i2 + 1 : 0;
                        if (i2 > 0) {
                            return jSONObjectG0;
                        }
                        i = length;
                    }
                    if (!"failed".equals(strOptString2) && !"quota_exhausted".equals(strOptString2)) {
                        if (SystemClock.elapsedRealtime() >= jElapsedRealtime) {
                            return jSONObjectG0;
                        }
                        SystemClock.sleep(900L);
                    }
                    return jSONObjectG0;
                }
            }
            return jSONObjectX;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d(JSONObject jSONObject) {
        String strO0 = o0();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = jSONObject;
        }
        this.n = u(jSONObjectOptJSONObject.optString("access_token"), jSONObjectOptJSONObject.optString("accessToken"), jSONObject.optString("access_token"), jSONObject.optString("accessToken"), this.n);
        this.o = u(jSONObjectOptJSONObject.optString("refresh_token"), jSONObjectOptJSONObject.optString("refreshToken"), jSONObject.optString("refresh_token"), jSONObject.optString("refreshToken"), this.o);
        this.p = u(jSONObjectOptJSONObject.optString("token_type"), jSONObjectOptJSONObject.optString("tokenType"), jSONObject.optString("token_type"), jSONObject.optString("tokenType"), this.p, "Bearer");
        this.q = u(jSONObjectOptJSONObject.optString("sub"), jSONObject.optString("sub"), this.q);
        this.t = u(jSONObjectOptJSONObject.optString("phone_number"), jSONObjectOptJSONObject.optString("phone"), jSONObject.optString("phone_number"), jSONObject.optString("phone"), this.t);
        if (TextUtils.isEmpty(strO0) || strO0.equals(o0())) {
            return;
        }
        j();
    }

    public final boolean d0(long j, String str, String str2) {
        if (!E(j, str2) || TextUtils.isEmpty(str) || !str.equals(this.u)) {
            return false;
        }
        if (this.e == j && str2.equals(this.f) && str.equals(this.g)) {
            return true;
        }
        this.e = j;
        this.f = str2;
        this.g = str;
        this.h.clear();
        this.i = false;
        return true;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.p) ? "Bearer" : this.p);
        sb.append(" ");
        sb.append(this.n);
        return sb.toString();
    }

    public final void e0(long j, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !d0(j, str, str3)) {
            return;
        }
        this.h.add(str2);
    }

    public final boolean f0() {
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.o)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("grant_type", "refresh_token");
                jSONObject.put("refresh_token", this.o);
                jSONObject.put("client_id", "aMe-8VSlkrbQXpUR");
                N nM = X1.M("https://account.guangyapan.com/v1/auth/token", jSONObject.toString(), a(false));
                JSONObject jSONObject2 = new JSONObject(nM.a());
                if (nM.a < 400 && TextUtils.isEmpty(jSONObject2.optString("error"))) {
                    d(jSONObject2);
                    j0();
                    return !TextUtils.isEmpty(this.n);
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x028c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0293  */
    /* JADX WARN: Code duplicated, block: B:116:0x029a  */
    public final JSONObject g0(String str) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String str2;
        ArrayList arrayList;
        String str3;
        JSONArray jSONArrayS;
        JSONObject jSONObjectQ = Q();
        JSONObject jSONObjectP = p(jSONObjectQ);
        String strT = T(str);
        JSONObject jSONObjectOptJSONObject = jSONObjectP.optJSONObject(strT);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = b.v("key", strT, "magnet", str);
            jSONObjectOptJSONObject.put("status", "new");
        }
        JSONObject jSONObject4 = jSONObjectOptJSONObject;
        if (TextUtils.isEmpty(jSONObject4.optString("parent_id", ""))) {
            jSONObject4.put("parent_id", o(jSONObjectQ));
        }
        if (TextUtils.isEmpty(jSONObject4.optString("folder_id", ""))) {
            jSONObject4.put("folder_id", t(jSONObject4.optString("parent_id", ""), jSONObject4.optString("folder_name", "")));
        }
        String strOptString = jSONObject4.optString("task_id", "");
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                JSONObject jSONObject5 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(strOptString);
                jSONObject5.put("taskIds", jSONArray);
                JSONObject jSONObject6 = new JSONObject(Z(FishCrypto.v("N1.nZ2bq20kCmcw+iVfdwEnS609eyknaUawZfe4vTjfE4+9EIBtNA9ASDkyq+1d7Ms9MOyyBmneNovXi5uNJ1im4W7WQCcFwK16uAhfOjzAijs="), jSONObject5));
                JSONObject jSONObjectOptJSONObject2 = jSONObject6.optJSONObject("data");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObject6 = jSONObjectOptJSONObject2;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject6.optJSONArray("list");
                if (jSONArrayOptJSONArray != null) {
                    int i = 0;
                    while (true) {
                        if (i < jSONArrayOptJSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject3 != null && strOptString.equals(u(jSONObjectOptJSONObject3.optString("taskId"), jSONObjectOptJSONObject3.optString("taskID"), jSONObjectOptJSONObject3.optString("id")))) {
                                jSONObject = jSONObjectOptJSONObject3;
                                break;
                            }
                            i++;
                            jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            jSONObject = null;
            break;
        }
        jSONObject = null;
        break;
        if (jSONObject != null) {
            jSONObject4.put("task", jSONObject);
        }
        JSONArray jSONArray2 = new JSONArray();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        JSONObject jSONObjectOptJSONObject4 = jSONObject4.optJSONObject("task");
        String strU = jSONObjectOptJSONObject4 == null ? "" : u(jSONObjectOptJSONObject4.optString("fileId"), jSONObjectOptJSONObject4.optString("fileID"), jSONObjectOptJSONObject4.optString("file_id"), jSONObjectOptJSONObject4.optString("resId"), jSONObjectOptJSONObject4.optString("resID"), jSONObjectOptJSONObject4.optString("targetId"), jSONObjectOptJSONObject4.optString("targetID"), jSONObjectOptJSONObject4.optString("targetFileId"), jSONObjectOptJSONObject4.optString("targetFileID"), jSONObjectOptJSONObject4.optString("saveFileId"), jSONObjectOptJSONObject4.optString("saveFileID"));
        JSONObject jSONObject7 = jSONObject;
        if (TextUtils.isEmpty(strU)) {
            jSONObject2 = jSONObjectQ;
            jSONObject3 = jSONObjectP;
            str2 = strT;
            arrayList = arrayList3;
            str3 = "folder_name";
        } else {
            JSONObject jSONObject8 = new JSONObject();
            try {
                jSONObject8.put("fileId", strU);
                if (jSONObjectOptJSONObject4 != null) {
                    jSONObject2 = jSONObjectQ;
                    try {
                        jSONObject3 = jSONObjectP;
                        try {
                            str2 = strT;
                            try {
                                jSONObject8.put("fileName", u(jSONObjectOptJSONObject4.optString("fileName"), jSONObjectOptJSONObject4.optString("filename"), jSONObjectOptJSONObject4.optString("name"), jSONObjectOptJSONObject4.optString("newName")));
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            str2 = strT;
                        }
                    } catch (Exception unused4) {
                        jSONObject3 = jSONObjectP;
                    }
                    b(jSONObject8, jSONArray2, arrayList3, "");
                    arrayList = arrayList3;
                    str3 = "folder_name";
                    k(strU, jSONArray2, arrayList2, arrayList, 0, "");
                } else {
                    jSONObject2 = jSONObjectQ;
                }
            } catch (Exception unused5) {
            }
            jSONObject3 = jSONObjectP;
            str2 = strT;
            b(jSONObject8, jSONArray2, arrayList3, "");
            arrayList = arrayList3;
            str3 = "folder_name";
            k(strU, jSONArray2, arrayList2, arrayList, 0, "");
        }
        if (jSONArray2.length() <= 0) {
            String strOptString2 = jSONObject4.optString("folder_id", "");
            if (!TextUtils.isEmpty(strOptString2)) {
                k(strOptString2, jSONArray2, arrayList2, arrayList, 0, "");
            }
            if (jSONArray2.length() <= 0) {
                String strOptString3 = jSONObject4.optString("parent_id", "");
                String strOptString4 = jSONObject4.optString(str3, "");
                if (!TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(strOptString4) && jSONArray2.length() < 200) {
                    for (int i2 = 1; i2 <= 10; i2++) {
                        try {
                            if (jSONArray2.length() >= 200 || (jSONArrayS = s(new JSONObject(M(i2, strOptString3)))) == null || jSONArrayS.length() == 0) {
                                break;
                                break;
                                break;
                            }
                            int i3 = 0;
                            while (i3 < jSONArrayS.length() && jSONArray2.length() < 200) {
                                JSONObject jSONObjectOptJSONObject5 = jSONArrayS.optJSONObject(i3);
                                if (jSONObjectOptJSONObject5 != null && strOptString4.equals(I(jSONObjectOptJSONObject5))) {
                                    if (F(jSONObjectOptJSONObject5)) {
                                        k(H(jSONObjectOptJSONObject5), jSONArray2, arrayList2, arrayList, 0, strOptString4);
                                    } else {
                                        b(jSONObjectOptJSONObject5, jSONArray2, arrayList, strOptString4);
                                    }
                                }
                                i3++;
                                jSONArrayS = jSONArrayS;
                            }
                            if (jSONArrayS.length() < 50) {
                                break;
                            }
                        } catch (Exception unused6) {
                        }
                    }
                }
            }
        }
        if (jSONArray2.length() > 0) {
            jSONObject4.put("status", "done");
        } else if (jSONObject7 != null) {
            String str4 = "submitted";
            String strOptString5 = jSONObject4.optString("status", "submitted");
            int iOptInt = jSONObject7.optInt("status", jSONObject7.optInt("taskStatus", -1));
            if (iOptInt == 2) {
                str4 = "done";
            } else if (iOptInt == 3) {
                str4 = "failed";
            } else if (iOptInt == 5) {
                str4 = "downloading";
            } else if (iOptInt != 1) {
                String lowerCase = jSONObject7.toString().toLowerCase(Locale.ROOT);
                if (lowerCase.contains("completed") || lowerCase.contains("success") || lowerCase.contains("done")) {
                    str4 = "done";
                } else if (lowerCase.contains("failed") || lowerCase.contains("error")) {
                    str4 = "failed";
                } else if (TextUtils.isEmpty(strOptString5)) {
                    str4 = "downloading";
                } else {
                    str4 = strOptString5;
                }
            }
            if ("done".equals(str4)) {
                str4 = "indexing";
            }
            jSONObject4.put("status", str4);
        }
        jSONObject4.put("files", jSONArray2);
        jSONObject4.put("updated_at", System.currentTimeMillis());
        jSONObject3.put(str2, jSONObject4);
        k0(jSONObject2);
        return jSONObject4;
    }

    public final void h() {
        synchronized (this.a) {
            this.d.incrementAndGet();
            this.l = true;
            this.m = false;
            this.n = "";
            this.o = "";
            this.p = "Bearer";
            this.q = "";
            this.r = "";
            this.s = "";
            this.t = "";
            this.u = "";
            this.c.clear();
            this.k.clear();
            try {
                C0297t1.b("guangya");
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0128  */
    public final String h0(Y y, String str, String str2, long j, HashSet hashSet) throws Exception {
        boolean zEqualsIgnoreCase;
        if (d0(j, str, str2) && !this.i) {
            this.i = true;
            AbstractC0302v0.p(new W(this, hashSet, str2, j, str), new HashSet(this.h));
        }
        if (!str2.equals(o0()) || !str.equals(this.u)) {
            throw new Exception("光鸭转存账号已切换");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("accessToken", y.b);
        jSONObject.put("fileIds", new JSONArray().put(y.c));
        jSONObject.put("parentId", str);
        JSONObject jSONObjectG = g(a0(jSONObject, "/userres/v1/restore_share", "/nd.bizuserres.s/v1/restore_share"));
        String strI0 = i0(y.c, jSONObjectG);
        String strU = u(jSONObjectG.optString("taskId"), jSONObjectG.optString("taskID"), jSONObjectG.optString("id"));
        if (!TextUtils.isEmpty(strU)) {
            try {
                String strI1 = i0(y.c, r0(strU));
                if (!TextUtils.isEmpty(strI1)) {
                    strI0 = strI1;
                }
            } catch (Z e) {
                throw e;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw e2;
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(strI0) && hashSet != null) {
            Iterator it = L(str).iterator();
            strI0 = "";
            String str3 = "";
            while (true) {
                if (!it.hasNext()) {
                    strI0 = str3;
                    break;
                }
                JSONObject jSONObject2 = (JSONObject) it.next();
                String strU2 = u(jSONObject2.optString("fileId"), jSONObject2.optString("id"));
                if (!hashSet.contains(strU2)) {
                    if (jSONObject2.optInt("resType", jSONObject2.optInt("type", 0)) == 2 || "folder".equalsIgnoreCase(jSONObject2.optString("type"))) {
                        zEqualsIgnoreCase = false;
                    } else {
                        long jOptLong = jSONObject2.optLong("fileSize", jSONObject2.optLong("size", -1L));
                        long j2 = y.g;
                        if (j2 <= 0 || j2 == jOptLong) {
                            String strU3 = u(jSONObject2.optString("md5"), jSONObject2.optString("fileMd5"), jSONObject2.optString("etag"));
                            if (!TextUtils.isEmpty(y.e)) {
                                zEqualsIgnoreCase = y.e.equalsIgnoreCase(strU3);
                            } else if (y.g <= 0 || TextUtils.isEmpty(y.d) || !y.d.equals(u(jSONObject2.optString("fileName"), jSONObject2.optString("name")))) {
                                zEqualsIgnoreCase = false;
                            } else {
                                zEqualsIgnoreCase = true;
                            }
                        } else {
                            zEqualsIgnoreCase = false;
                        }
                    }
                    if (!zEqualsIgnoreCase) {
                        continue;
                    } else {
                        if (!TextUtils.isEmpty(str3)) {
                            break;
                        }
                        str3 = strU2;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(strI0)) {
            throw new Exception("光鸭转存文件身份未确认，已保留目录文件");
        }
        return strI0;
    }

    public final synchronized void i(String str) {
        try {
            String strR = R(str);
            if (TextUtils.isEmpty(strR)) {
                throw new Exception("磁力链接无效");
            }
            JSONObject jSONObjectQ = Q();
            JSONObject jSONObjectP = p(jSONObjectQ);
            String strT = T(strR);
            String strOptString = jSONObjectQ.optString("last_key", "");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = J(strT, jSONObjectP);
            }
            if (!TextUtils.isEmpty(strOptString) && !strT.equals(strOptString)) {
                JSONObject jSONObjectOptJSONObject = jSONObjectP.optJSONObject(strOptString);
                if (jSONObjectOptJSONObject == null) {
                    return;
                }
                String strOptString2 = jSONObjectOptJSONObject.optString("folder_id", "");
                if (TextUtils.isEmpty(strOptString2)) {
                    strOptString2 = t(jSONObjectOptJSONObject.optString("parent_id", ""), jSONObjectOptJSONObject.optString("folder_name", ""));
                }
                if (TextUtils.isEmpty(strOptString2)) {
                    return;
                }
                n();
                if (!TextUtils.isEmpty(strOptString2)) {
                    m(Collections.singletonList(strOptString2));
                }
                SystemClock.sleep(500L);
                if (TextUtils.isEmpty(t(jSONObjectOptJSONObject.optString("parent_id", ""), jSONObjectOptJSONObject.optString("folder_name", "")))) {
                    jSONObjectP.remove(strOptString);
                    jSONObjectQ.remove("last_key");
                    k0(jSONObjectQ);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j() {
        this.d.incrementAndGet();
        this.u = "";
        this.c.clear();
        this.k.clear();
    }

    public final void j0() {
        synchronized (this.a) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("access_token", this.n);
                jSONObject.put("refresh_token", this.o);
                jSONObject.put("token_type", this.p);
                jSONObject.put("sub", this.q);
                jSONObject.put("name", this.r);
                jSONObject.put("picture", this.s);
                jSONObject.put("phone", this.t);
                jSONObject.put("kaiser_folder", this.u);
                C0297t1.j("guangya", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    public final void k(String str, JSONArray jSONArray, ArrayList arrayList, ArrayList arrayList2, int i, String str2) {
        if (TextUtils.isEmpty(str) || arrayList.contains(str) || i > 3 || jSONArray.length() >= 200) {
            return;
        }
        arrayList.add(str);
        for (int i2 = 1; i2 <= 10; i2++) {
            try {
                if (jSONArray.length() >= 200) {
                    break;
                }
                try {
                    JSONArray jSONArrayS = s(new JSONObject(M(i2, str)));
                    if (jSONArrayS != null && jSONArrayS.length() != 0) {
                        for (int i3 = 0; i3 < jSONArrayS.length() && jSONArray.length() < 200; i3++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayS.optJSONObject(i3);
                            if (jSONObjectOptJSONObject != null) {
                                String strI = TextUtils.isEmpty(str2) ? I(jSONObjectOptJSONObject) : str2 + "/" + I(jSONObjectOptJSONObject);
                                if (F(jSONObjectOptJSONObject)) {
                                    k(H(jSONObjectOptJSONObject), jSONArray, arrayList, arrayList2, i + 1, strI);
                                } else {
                                    b(jSONObjectOptJSONObject, jSONArray, arrayList2, strI);
                                }
                            }
                        }
                        if (jSONArrayS.length() < 50) {
                            return;
                        }
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            } catch (Exception unused2) {
            }
        }
    }

    public final boolean l0(String str) {
        synchronized (this.a) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                j();
                this.q = "";
                this.t = "";
                this.r = "";
                this.s = "";
                String strTrim = str.trim();
                this.n = "";
                this.o = "";
                this.p = "Bearer";
                if (strTrim.startsWith("Bearer ")) {
                    this.p = "Bearer";
                    this.n = strTrim.substring(7).trim();
                } else if (strTrim.startsWith("{")) {
                    d(new JSONObject(strTrim));
                } else {
                    this.o = strTrim;
                }
                boolean z = !TextUtils.isEmpty(this.n) && q0();
                if (!z && !TextUtils.isEmpty(this.o)) {
                    z = f0() && q0();
                }
                if (!z) {
                    return false;
                }
                j0();
                C0299u0.r("guangya");
                FishConfig.refreshStatus("guangya");
                return true;
            } catch (Exception e) {
                X0.a("光鸭Token保存失败: " + e.getMessage());
                return false;
            }
        }
    }

    public final void m(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                throw new Exception("光鸭删除文件ID缺失");
            }
            jSONArray.put(str);
        }
        jSONObject.put("fileIds", jSONArray);
        String strA0 = a0(jSONObject, "/userres/v1/file/delete_file", "/nd.bizuserres.s/v1/file/delete_file");
        JSONObject jSONObject2 = new JSONObject(strA0);
        JSONObject jSONObjectG = g(strA0);
        String strU = u(jSONObjectG.optString("taskId"), jSONObjectG.optString("taskID"), jSONObjectG.optString("id"));
        if (!TextUtils.isEmpty(strU)) {
            r0(strU);
        } else if (!jSONObject2.has("code") && !jSONObject2.optBoolean("success") && !jSONObjectG.has("code") && !jSONObjectG.optBoolean("success")) {
            throw new Exception("光鸭删除缺少成功回执");
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            this.c.remove((String) it2.next());
        }
        synchronized (this.k) {
            try {
                Iterator it3 = this.k.entrySet().iterator();
                while (it3.hasNext()) {
                    if (list.contains(((Map.Entry) it3.next()).getValue())) {
                        it3.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        synchronized (this.a) {
            try {
                P();
                if (TextUtils.isEmpty(this.n) || !q0()) {
                    if (TextUtils.isEmpty(this.o) || !f0()) {
                        if (this.m) {
                            X0.a("光鸭网盘正在等待扫码");
                        } else {
                            this.l = false;
                            InitOrigin.execute(new U(this, 0));
                        }
                        throw new Exception("光鸭网盘未登录，请先扫码登录");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n0(String str, String str2) throws JSONException {
        String str3;
        JSONObject jSONObjectQ = Q();
        JSONObject jSONObjectP = p(jSONObjectQ);
        String strT = T(str);
        JSONObject jSONObjectOptJSONObject = jSONObjectP.optJSONObject(strT);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        String strOptString = jSONObjectOptJSONObject.optString("task_id", "");
        String strOptString2 = jSONObjectOptJSONObject.optString("status", "");
        if (TextUtils.isEmpty(strOptString) || "failed".equals(strOptString2) || "quota_exhausted".equals(strOptString2)) {
            String strO = o(jSONObjectQ);
            String strTrim = (TextUtils.isEmpty(str2) ? "光鸭离线" : str2).replaceAll("[\\\\/:*?\"<>|\\r\\n\\t]", " ").replaceAll("\\s+", " ").trim();
            if (strTrim.length() > 36) {
                strTrim = strTrim.substring(0, 36).trim();
            }
            String str4 = TextUtils.isEmpty(strTrim) ? "光鸭离线" : strTrim;
            String str5 = new SimpleDateFormat("yyyyMMdd-HHmm", Locale.ROOT).format(new Date()) + " " + str4 + " " + strT.substring(0, Math.min(8, strT.length()));
            JSONObject jSONObjectV = b.v("url", str, "parentId", strO);
            jSONObjectV.put("newName", str5);
            JSONObject jSONObject = new JSONObject(Z(FishCrypto.v("N1.pRwZpne8Zy40NENiVrisDr7CIDkeh8XPxUCHUGsLXXQew6cFFRVCsUGilaNa32rxqO5VpkNeQul5DbIq9YovJJGkUFZUOasqgQW6mZkSFtI="), jSONObjectV));
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = jSONObject;
            }
            String strU = u(jSONObjectOptJSONObject2.optString("taskId"), jSONObjectOptJSONObject2.optString("taskID"), jSONObjectOptJSONObject2.optString("id"));
            int iOptInt = jSONObject.optInt("code", jSONObjectOptJSONObject2.optInt("code", 0));
            jSONObjectOptJSONObject.put("key", strT);
            jSONObjectOptJSONObject.put("magnet", str);
            jSONObjectOptJSONObject.put("title", TextUtils.isEmpty(str2) ? str5 : str2);
            jSONObjectOptJSONObject.put("folder_name", str5);
            jSONObjectOptJSONObject.put("parent_id", strO);
            jSONObjectOptJSONObject.put("folder_id", t(strO, str5));
            jSONObjectOptJSONObject.put("task_id", strU);
            if (TextUtils.isEmpty(strU)) {
                str3 = iOptInt == 354 ? "quota_exhausted" : "failed";
            } else {
                str3 = "submitted";
            }
            jSONObjectOptJSONObject.put("status", str3);
            jSONObjectOptJSONObject.put("message", u(jSONObjectOptJSONObject2.optString("message"), jSONObjectOptJSONObject2.optString("msg"), jSONObject.optString("message"), jSONObject.optString("msg")));
            jSONObjectOptJSONObject.put("raw", jSONObject);
            jSONObjectOptJSONObject.put("updated_at", System.currentTimeMillis());
            jSONObjectP.put(strT, jSONObjectOptJSONObject);
            jSONObjectQ.put("last_key", strT);
            k0(jSONObjectQ);
        }
    }

    public final String o(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("offline_root_id", "");
        if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString)) {
            try {
                JSONObject jSONObject2 = new JSONObject(M(1, strOptString));
                int iOptInt = jSONObject2.optInt("code", 0);
                if (iOptInt == 0 || iOptInt == 200 || !jSONObject2.has("code")) {
                    return strOptString;
                }
            } catch (Exception unused) {
            }
        }
        jSONObject.remove("offline_root_id");
        String strT = t("", FishCrypto.v("N1.X9QV9ekg6K1iJANpXOLF9rJRbPFGmqM+hr5y+anMI2wgvoja62fwdQU1XxnJKbAHqotpRrtaVuuHdIuLWtu1SRYl0YyVeV1PVZDEAdRJVU8="));
        if (TextUtils.isEmpty(strT)) {
            String strV = FishCrypto.v("N1.X9QV9ekg6K1iJANpXOLF9rJRbPFGmqM+hr5y+anMI2wgvoja62fwdQU1XxnJKbAHqotpRrtaVuuHdIuLWtu1SRYl0YyVeV1PVZDEAdRJVU8=");
            JSONObject jSONObject3 = new JSONObject();
            TextUtils.isEmpty("");
            jSONObject3.put("parentId", "");
            jSONObject3.put("dirName", strV);
            jSONObject3.put("fileName", strV);
            jSONObject3.put("failIfNameExist", false);
            JSONObject jSONObject4 = new JSONObject(a0(jSONObject3, "/userres/v1/file/create_dir", "/nd.bizuserres.s/v1/file/create_dir"));
            JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                jSONObject4 = jSONObjectOptJSONObject;
            }
            strT = u(jSONObject4.optString("fileId"), jSONObject4.optString("id"));
            if (TextUtils.isEmpty(strT)) {
                strT = t("", FishCrypto.v("N1.X9QV9ekg6K1iJANpXOLF9rJRbPFGmqM+hr5y+anMI2wgvoja62fwdQU1XxnJKbAHqotpRrtaVuuHdIuLWtu1SRYl0YyVeV1PVZDEAdRJVU8="));
            }
        }
        if (!TextUtils.isEmpty(strT)) {
            jSONObject.put("offline_root_id", strT);
        }
        return strT;
    }

    public final String o0() {
        return u(this.q, this.t);
    }

    public final void p0(Y y, long j) {
        String strO0 = o0();
        StringBuilder sbP = b.p(strO0, ":");
        sbP.append(y.a);
        sbP.append(":");
        sbP.append(y.c);
        String string = sbP.toString();
        if (TextUtils.isEmpty(strO0) || TextUtils.isEmpty(y.c) || !this.j.add(string)) {
            return;
        }
        InitOrigin.execute(new V(this, strO0, string, j, y));
    }

    public final String q() throws Exception {
        synchronized (this.a) {
            try {
                if (!TextUtils.isEmpty(this.u)) {
                    return this.u;
                }
                String strO0 = o0();
                String strE = e();
                HashMap mapC = c(true);
                JSONObject jSONObjectV = b.v("parentId", "", "dirName", "FishGuangYa");
                jSONObjectV.put("fileName", "FishGuangYa");
                jSONObjectV.put("failIfNameExist", false);
                JSONObject jSONObjectG = g(Y("/userres/v1/file/create_dir", "/nd.bizuserres.s/v1/file/create_dir", mapC, jSONObjectV));
                String strU = u(jSONObjectG.optString("fileId"), jSONObjectG.optString("id"));
                if (TextUtils.isEmpty(strU)) {
                    throw new Exception("光鸭临时目录ID缺失");
                }
                synchronized (this.a) {
                    try {
                        if (!strO0.equals(o0()) || !strE.equals(e())) {
                            throw new Exception("光鸭建目录账号已切换");
                        }
                        this.u = strU;
                        j0();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return strU;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean q0() {
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.n)) {
                return false;
            }
            try {
                N nZ = X1.z("https://account.guangyapan.com/v1/user/me", null, a(true));
                if (nZ.a < 400 && !TextUtils.isEmpty(nZ.a())) {
                    JSONObject jSONObject = new JSONObject(nZ.a());
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = jSONObject;
                    }
                    String strO0 = o0();
                    this.q = u(jSONObjectOptJSONObject.optString("sub"), jSONObject.optString("sub"), this.q);
                    this.r = u(jSONObjectOptJSONObject.optString("name"), jSONObjectOptJSONObject.optString("nickname"), jSONObject.optString("name"), jSONObject.optString("nickname"), this.r);
                    this.s = u(jSONObjectOptJSONObject.optString("picture"), jSONObjectOptJSONObject.optString("avatar"), jSONObject.optString("picture"), jSONObject.optString("avatar"), this.s);
                    this.t = u(jSONObjectOptJSONObject.optString("phone_number"), jSONObjectOptJSONObject.optString("phone"), jSONObject.optString("phone_number"), jSONObject.optString("phone"), this.t);
                    if (!TextUtils.isEmpty(strO0) && !strO0.equals(o0())) {
                        j();
                    }
                    j0();
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public final String r() {
        try {
            P();
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(this.n)) {
                jSONObject.put("access_token", this.n);
            }
            if (!TextUtils.isEmpty(this.o)) {
                jSONObject.put("refresh_token", this.o);
            }
            jSONObject.put("token_type", TextUtils.isEmpty(this.p) ? "Bearer" : this.p);
            return jSONObject.length() > 1 ? jSONObject.toString() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public final JSONObject r0(String str) throws Exception {
        for (int i = 0; i < 30; i++) {
            String strA0 = a0(new JSONObject().put("taskId", str), "/userres/v1/get_task_status", "/nd.bizuserres.s/v1/get_task_status");
            JSONObject jSONObject = new JSONObject(strA0);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                jSONObject = jSONObjectOptJSONObject;
            }
            String strU = u(jSONObject.optString("status"), jSONObject.optString("taskStatus"), jSONObject.optString("state"));
            if ("failed".equalsIgnoreCase(strU) || "error".equalsIgnoreCase(strU) || "cancelled".equalsIgnoreCase(strU) || "canceled".equalsIgnoreCase(strU) || "-1".equals(strU)) {
                throw new Z();
            }
            g(strA0);
            if ("success".equalsIgnoreCase(strU) || "done".equalsIgnoreCase(strU) || "2".equals(strU) || jSONObject.optBoolean("finished")) {
                return jSONObject;
            }
            if (TextUtils.isEmpty(strU) && !jSONObject.has("finished")) {
                throw new Exception("光鸭任务状态缺失");
            }
            if (i < 29) {
                Thread.sleep(1000L);
            }
        }
        throw new Exception("光鸭转存目录任务未完成");
    }

    public final String t(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        for (int i = 1; i <= 10; i++) {
            try {
                JSONArray jSONArrayS = s(new JSONObject(M(i, str)));
                if (jSONArrayS == null || jSONArrayS.length() == 0) {
                    break;
                    break;
                }
                for (int i2 = 0; i2 < jSONArrayS.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayS.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null && F(jSONObjectOptJSONObject) && str2.equals(I(jSONObjectOptJSONObject))) {
                        return H(jSONObjectOptJSONObject);
                    }
                }
                if (jSONArrayS.length() < 50) {
                    break;
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public final synchronized JSONObject x(String str) {
        JSONObject jSONObjectOptJSONObject = null;
        try {
            String strR = R(str);
            if (TextUtils.isEmpty(strR)) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject2 = Q().optJSONObject("records");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(T(strR));
            }
            return jSONObjectOptJSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fileId", str);
        String strA0 = a0(jSONObject, "/userres/v1/get_res_download_url", "/nd.bizuserres.s/v1/get_res_download_url");
        JSONObject jSONObject2 = new JSONObject(strA0);
        JSONObject jSONObjectG = g(strA0);
        return u(jSONObjectG.optString("signedURL"), jSONObjectG.optString("signedUrl"), jSONObjectG.optString("downloadUrl"), jSONObjectG.optString("downloadURL"), jSONObjectG.optString("url"), jSONObject2.optString("signedURL"), jSONObject2.optString("downloadUrl"), jSONObject2.optString("url"));
    }

    public final String z(S0 s0) {
        try {
            JSONObject jSONObject = new JSONObject();
            Object obj = s0.b;
            String str = s0.c;
            jSONObject.put("shareId", obj);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("code", str);
            }
            N nB0 = b0("/userres/v1/get_share_access_token", jSONObject, false);
            int i = nB0.a;
            if (i == 400 || i == 404) {
                nB0 = b0("/nd.bizuserres.s/v1/get_share_access_token", jSONObject, false);
            }
            if (nB0.a >= 400) {
                return "";
            }
            JSONObject jSONObject2 = new JSONObject(nB0.a());
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = jSONObject2;
            }
            return u(jSONObjectOptJSONObject.optString("accessToken"), jSONObjectOptJSONObject.optString("access_token"), jSONObject2.optString("accessToken"), jSONObject2.optString("access_token"));
        } catch (Exception unused) {
            return "";
        }
    }
}
