package com.github.catvod.spider.merge.A;

import android.app.Application;
import android.os.Build;
import com.github.catvod.spider.InitOrigin;
import java.io.File;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0251e {
    public static final Object a = new Object();
    public static final LinkedHashMap b = new LinkedHashMap(32, 0.75f, true);
    public static String c = "";
    public static long d = 0;
    public static JSONObject e;
    public static JSONObject f;

    public static JSONArray A(JSONArray jSONArray, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("tmdbId");
        if (iOptInt <= 0) {
            return i(jSONArray);
        }
        JSONArray jSONArrayPut = new JSONArray().put(j(jSONObject));
        for (int i = 0; jSONArray != null && i < jSONArray.length(); i++) {
            Object objOpt = jSONArray.opt(i);
            JSONObject jSONObject2 = objOpt instanceof JSONObject ? (JSONObject) objOpt : null;
            if (jSONObject2 == null || jSONObject2.optInt("tmdbId") != iOptInt) {
                if (jSONObject2 != null) {
                    objOpt = j(jSONObject2);
                }
                jSONArrayPut.put(objOpt);
            }
        }
        return jSONArrayPut;
    }

    public static long B() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jOptLong = G().optLong("updatedAt");
        if (jOptLong == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        return Math.max(Math.max(0L, jCurrentTimeMillis), jOptLong + 1);
    }

    public static String C(String str) {
        String strF = f(str);
        if (strF.isEmpty()) {
            return "";
        }
        try {
            strF = Normalizer.normalize(strF, Normalizer.Form.NFKC);
        } catch (Exception unused) {
        }
        return strF.replaceAll("\\s+", " ").toLowerCase(Locale.ROOT);
    }

    public static JSONObject D(int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : j(jSONObject);
        try {
            if ("titles-v5".equals(jSONObject2.optString("kind"))) {
                jSONObject2 = new JSONObject().put("stale", true).put("status", "pending");
            } else if (!"discovery-v1".equals(jSONObject2.optString("kind"))) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("kind", "discovery-v1");
            if (!jSONObject2.has("revision")) {
                jSONObject2.put("revision", i);
            }
            if (jSONObject2.optJSONArray("rawItems") == null) {
                jSONObject2.put("rawItems", new JSONArray());
            }
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("resolvedItems");
            JSONArray jSONArray = new JSONArray();
            b(jSONArray, new HashSet(), jSONArrayOptJSONArray);
            jSONObject2.put("resolvedItems", jSONArray);
            if (!jSONObject2.has("refreshGeneration")) {
                jSONObject2.put("refreshGeneration", 0);
            }
            if (!jSONObject2.has("requestKey")) {
                jSONObject2.put("requestKey", "");
            }
            if (!jSONObject2.has("rawRequestKey")) {
                jSONObject2.put("rawRequestKey", "");
            }
            if (!jSONObject2.has("resolvedSource")) {
                jSONObject2.put("resolvedSource", "");
            }
            if (!jSONObject2.has("lastError")) {
                jSONObject2.put("lastError", "");
            }
            if (!jSONObject2.has("failureSource")) {
                jSONObject2.put("failureSource", "");
            }
            if (jSONObject2.optInt("revision", i) != i) {
                jSONObject2.put("stale", true);
            } else if (!jSONObject2.has("stale")) {
                jSONObject2.put("stale", false);
            }
            if (!jSONObject2.has("status")) {
                if (jSONObject2.optJSONArray("resolvedItems").length() > 0) {
                    jSONObject2.put("status", "ready");
                } else if (jSONObject2.optJSONArray("rawItems").length() > 0) {
                    jSONObject2.put("status", "discovered");
                } else {
                    jSONObject2.put("status", "idle");
                }
            }
            return jSONObject2;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static JSONArray E(JSONObject jSONObject, JSONArray jSONArray, int i) {
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONObject);
        for (int i2 = 0; i2 < jSONArray.length() && jSONArray2.length() < i; i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        return jSONArray2;
    }

    public static String F() {
        String strH = C0297t1.h("smart_behavior.json");
        if (!strH.trim().isEmpty()) {
            return strH;
        }
        try {
            Application applicationContext = InitOrigin.context();
            if (applicationContext == null) {
                return "";
            }
            File file = new File(Build.VERSION.SDK_INT >= 21 ? applicationContext.getNoBackupFilesDir() : new File(applicationContext.getFilesDir(), "no_backup"), "smart_behavior.json");
            if (!file.isFile()) {
                return "";
            }
            String strA = C0268j1.a(file);
            if (!strA.trim().isEmpty()) {
                C0297t1.j("smart_behavior.json", strA);
                if (strA.equals(C0297t1.h("smart_behavior.json"))) {
                    file.delete();
                }
            }
            return strA;
        } catch (Exception unused) {
            return "";
        }
    }

    public static JSONObject G() {
        JSONObject jSONObjectK;
        JSONObject jSONObject = f;
        if (jSONObject != null) {
            return j(jSONObject);
        }
        String strH = C0297t1.h("smart_history.json");
        JSONObject jSONObjectK2 = null;
        try {
            if (!strH.trim().isEmpty()) {
                jSONObjectK2 = new JSONObject(strH);
            }
        } catch (Exception unused) {
        }
        if (jSONObjectK2 == null || jSONObjectK2.optInt("version") != 3) {
            jSONObjectK2 = k();
            C0297t1.j("smart_history.json", jSONObjectK2.toString());
        }
        try {
            JSONObject jSONObjectPut = new JSONObject().put("version", 3).put("updatedAt", Math.max(0L, jSONObjectK2.optLong("updatedAt"))).put("clearBefore", Math.max(0L, jSONObjectK2.optLong("clearBefore"))).put("plays", i(jSONObjectK2.optJSONArray("plays"))).put("tombstones", j(jSONObjectK2.optJSONObject("tombstones"))).put("searchClearBefore", Math.max(0L, jSONObjectK2.optLong("searchClearBefore"))).put("searches", i(jSONObjectK2.optJSONArray("searches"))).put("searchTombstones", j(jSONObjectK2.optJSONObject("searchTombstones")));
            jSONObjectK = jSONObjectPut.put("updatedAt", Math.max(jSONObjectPut.optLong("updatedAt"), r(jSONObjectPut)));
        } catch (Exception unused2) {
            jSONObjectK = k();
        }
        f = jSONObjectK;
        return j(jSONObjectK);
    }

    public static JSONObject H() {
        JSONArray jSONArrayI;
        JSONObject jSONObject = e;
        if (jSONObject != null) {
            return j(jSONObject);
        }
        JSONObject jSONObject2 = null;
        try {
            String strF = F();
            if (!strF.trim().isEmpty()) {
                jSONObject2 = new JSONObject(strF);
            }
        } catch (Exception unused) {
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        try {
            JSONObject jSONObjectG = G();
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("follows");
            String strH = C0297t1.h("smart_follows.json");
            try {
                if (strH.trim().isEmpty()) {
                    jSONArrayI = i(jSONArrayOptJSONArray);
                    if (jSONArrayOptJSONArray != null) {
                        C0297t1.j("smart_follows.json", jSONArrayI.toString());
                    }
                } else {
                    jSONArrayI = new JSONArray(strH);
                }
            } catch (Exception unused2) {
            }
            if (!jSONObject2.has("version")) {
                jSONObject2.put("version", 1);
            }
            if (!jSONObject2.has("revision")) {
                jSONObject2.put("revision", 0);
            }
            jSONObject2.put("searches", i(jSONObjectG.optJSONArray("searches")));
            jSONObject2.put("plays", i(jSONObjectG.optJSONArray("plays")));
            if (jSONObject2.optJSONObject("media") == null) {
                jSONObject2.put("media", new JSONObject());
            }
            if (jSONObject2.optJSONObject("ai") == null) {
                jSONObject2.put("ai", new JSONObject());
            }
            if (jSONObject2.optJSONArray("recommended") == null) {
                jSONObject2.put("recommended", new JSONArray());
            }
            jSONObject2.put("follows", jSONArrayI);
            if (jSONArrayOptJSONArray != null && jSONArrayI.toString().equals(C0297t1.h("smart_follows.json"))) {
                C0297t1.j("smart_behavior.json", c(jSONObject2).toString());
            }
        } catch (Exception unused3) {
        }
        e = j(jSONObject2);
        return jSONObject2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c8 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:7:0x0043, B:10:0x0061, B:13:0x006b, B:16:0x0073, B:17:0x0079, B:19:0x008a, B:20:0x008e, B:26:0x00a0, B:36:0x00c8, B:37:0x00cd, B:39:0x00d3, B:40:0x00d9, B:42:0x00df, B:44:0x00e8, B:46:0x00ee, B:47:0x00f4, B:49:0x00fa, B:50:0x0100, B:52:0x0106, B:54:0x0112, B:56:0x011e, B:58:0x012a, B:60:0x0136, B:63:0x0139, B:65:0x019c, B:67:0x01a4, B:68:0x01a9, B:69:0x01be, B:71:0x01c4, B:73:0x01cb, B:74:0x01d8, B:75:0x01e0, B:78:0x01e3, B:24:0x0097), top: B:85:0x0043, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:7:0x0043, B:10:0x0061, B:13:0x006b, B:16:0x0073, B:17:0x0079, B:19:0x008a, B:20:0x008e, B:26:0x00a0, B:36:0x00c8, B:37:0x00cd, B:39:0x00d3, B:40:0x00d9, B:42:0x00df, B:44:0x00e8, B:46:0x00ee, B:47:0x00f4, B:49:0x00fa, B:50:0x0100, B:52:0x0106, B:54:0x0112, B:56:0x011e, B:58:0x012a, B:60:0x0136, B:63:0x0139, B:65:0x019c, B:67:0x01a4, B:68:0x01a9, B:69:0x01be, B:71:0x01c4, B:73:0x01cb, B:74:0x01d8, B:75:0x01e0, B:78:0x01e3, B:24:0x0097), top: B:85:0x0043, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00df A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:7:0x0043, B:10:0x0061, B:13:0x006b, B:16:0x0073, B:17:0x0079, B:19:0x008a, B:20:0x008e, B:26:0x00a0, B:36:0x00c8, B:37:0x00cd, B:39:0x00d3, B:40:0x00d9, B:42:0x00df, B:44:0x00e8, B:46:0x00ee, B:47:0x00f4, B:49:0x00fa, B:50:0x0100, B:52:0x0106, B:54:0x0112, B:56:0x011e, B:58:0x012a, B:60:0x0136, B:63:0x0139, B:65:0x019c, B:67:0x01a4, B:68:0x01a9, B:69:0x01be, B:71:0x01c4, B:73:0x01cb, B:74:0x01d8, B:75:0x01e0, B:78:0x01e3, B:24:0x0097), top: B:85:0x0043, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:7:0x0043, B:10:0x0061, B:13:0x006b, B:16:0x0073, B:17:0x0079, B:19:0x008a, B:20:0x008e, B:26:0x00a0, B:36:0x00c8, B:37:0x00cd, B:39:0x00d3, B:40:0x00d9, B:42:0x00df, B:44:0x00e8, B:46:0x00ee, B:47:0x00f4, B:49:0x00fa, B:50:0x0100, B:52:0x0106, B:54:0x0112, B:56:0x011e, B:58:0x012a, B:60:0x0136, B:63:0x0139, B:65:0x019c, B:67:0x01a4, B:68:0x01a9, B:69:0x01be, B:71:0x01c4, B:73:0x01cb, B:74:0x01d8, B:75:0x01e0, B:78:0x01e3, B:24:0x0097), top: B:85:0x0043, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:7:0x0043, B:10:0x0061, B:13:0x006b, B:16:0x0073, B:17:0x0079, B:19:0x008a, B:20:0x008e, B:26:0x00a0, B:36:0x00c8, B:37:0x00cd, B:39:0x00d3, B:40:0x00d9, B:42:0x00df, B:44:0x00e8, B:46:0x00ee, B:47:0x00f4, B:49:0x00fa, B:50:0x0100, B:52:0x0106, B:54:0x0112, B:56:0x011e, B:58:0x012a, B:60:0x0136, B:63:0x0139, B:65:0x019c, B:67:0x01a4, B:68:0x01a9, B:69:0x01be, B:71:0x01c4, B:73:0x01cb, B:74:0x01d8, B:75:0x01e0, B:78:0x01e3, B:24:0x0097), top: B:85:0x0043, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x019c A[Catch: all -> 0x0068, Exception -> 0x01e3, TryCatch #1 {Exception -> 0x01e3, blocks: (B:63:0x0139, B:65:0x019c, B:67:0x01a4, B:68:0x01a9, B:69:0x01be, B:71:0x01c4, B:73:0x01cb, B:74:0x01d8), top: B:86:0x0139, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a4 A[Catch: all -> 0x0068, Exception -> 0x01e3, TryCatch #1 {Exception -> 0x01e3, blocks: (B:63:0x0139, B:65:0x019c, B:67:0x01a4, B:68:0x01a9, B:69:0x01be, B:71:0x01c4, B:73:0x01cb, B:74:0x01d8), top: B:86:0x0139, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4 A[Catch: all -> 0x0068, Exception -> 0x01e3, TryCatch #1 {Exception -> 0x01e3, blocks: (B:63:0x0139, B:65:0x019c, B:67:0x01a4, B:68:0x01a9, B:69:0x01be, B:71:0x01c4, B:73:0x01cb, B:74:0x01d8), top: B:86:0x0139, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01cb A[Catch: all -> 0x0068, Exception -> 0x01e3, TryCatch #1 {Exception -> 0x01e3, blocks: (B:63:0x0139, B:65:0x019c, B:67:0x01a4, B:68:0x01a9, B:69:0x01be, B:71:0x01c4, B:73:0x01cb, B:74:0x01d8), top: B:86:0x0139, outer: #0 }] */
    public static boolean I(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        JSONObject jSONObject;
        int i2;
        String strOptString;
        String strQ;
        JSONObject jSONObject2;
        String str8;
        JSONObject jSONObjectOptJSONObject;
        String strG = g(120, f(str));
        String strC = C(strG);
        String strG2 = g(80, f(str3));
        String strG3 = g(4000, f(str4));
        String strG4 = g(1200, f(str5));
        String strG5 = g(12, f(str6));
        if (strC.isEmpty()) {
            return false;
        }
        synchronized (a) {
            try {
                JSONObject jSONObjectH = H();
                JSONArray jSONArrayOptJSONArray = jSONObjectH.optJSONArray("plays");
                long jB = B();
                JSONObject jSONObject3 = (JSONObject) b.get(strC);
                if (strG4.isEmpty() && jSONObject3 != null) {
                    strG4 = jSONObject3.optString("pic");
                }
                if (strG5.isEmpty() && jSONObject3 != null) {
                    strG5 = jSONObject3.optString("year");
                }
                JSONObject[] jSONObjectArr = new JSONObject[1];
                JSONArray jSONArrayT = T(jSONArrayOptJSONArray, q(strG, strG5), jSONObjectArr);
                if (jSONObjectArr[0] == null) {
                    jSONArrayT = U(jSONArrayOptJSONArray, strC, strG5, jSONObjectArr);
                }
                JSONObject jSONObject4 = jSONObjectArr[0];
                String strOptString2 = jSONObject4 == null ? "" : jSONObject4.optString("key");
                try {
                    if (jSONObject4 != null) {
                        int iOptInt = jSONObject4.optInt("episode", 0);
                        str7 = strOptString2;
                        jSONObject = jSONObjectH;
                        long jOptLong = jB - jSONObject4.optLong("lastAt", 0L);
                        if (i == iOptInt && jOptLong >= 0 && jOptLong < 30000) {
                            i2 = 1;
                        }
                        if (jSONObject4 == null) {
                            jSONObject4 = new JSONObject();
                        }
                        if (strG2.isEmpty()) {
                            strG2 = jSONObject4.optString("source");
                        }
                        if (strG3.isEmpty()) {
                            strOptString = jSONObject4.optString("playId");
                        } else {
                            strOptString = strG3;
                        }
                        if (strG4.isEmpty()) {
                            strG4 = jSONObject4.optString("pic");
                        }
                        if (strG5.isEmpty()) {
                            strG5 = jSONObject4.optString("year");
                        }
                        strQ = q(strG, strG5);
                        if (i2 == 0 && strG2.equals(jSONObject4.optString("source")) && strOptString.equals(jSONObject4.optString("playId")) && strG4.equals(jSONObject4.optString("pic")) && strG5.equals(jSONObject4.optString("year"))) {
                            return false;
                        }
                        jSONObject4.put("key", strQ);
                        jSONObject4.put("title", strG);
                        jSONObject4.put("episode", Math.max(0, i));
                        jSONObject4.put("episodeLabel", g(80, f(str2)));
                        jSONObject4.put("source", strG2);
                        jSONObject4.put("playId", strOptString);
                        jSONObject4.put("pic", strG4);
                        jSONObject4.put("year", strG5);
                        jSONObject4.put("recordTime", jB);
                        jSONObject4.put("lastAt", jB);
                        jSONObject4.put("count", Math.max(0, jSONObject4.optInt("count", 0)) + (i2 ^ 1));
                        JSONArray jSONArrayE = E(jSONObject4, jSONArrayT, 300);
                        jSONObject2 = jSONObject;
                        jSONObject2.put("plays", jSONArrayE);
                        if (jSONObject3 != null) {
                            jSONObjectOptJSONObject = jSONObject2.optJSONObject("media");
                            if (jSONObjectOptJSONObject == null) {
                                jSONObjectOptJSONObject = new JSONObject();
                            }
                            jSONObjectOptJSONObject.put(strQ, j(jSONObject3).put("updatedAt", jB));
                            Q(jSONObjectOptJSONObject);
                            jSONObject2.put("media", jSONObjectOptJSONObject);
                        }
                        if (!str7.isEmpty()) {
                            str8 = str7;
                            if (!str8.equals(strQ)) {
                                w(Math.max(0L, jB - 1), str8);
                            }
                        }
                        y(jB, "tombstones", strQ);
                        h(jSONObject2);
                        return true;
                    }
                    str7 = strOptString2;
                    jSONObject = jSONObjectH;
                    jSONObject4.put("key", strQ);
                    jSONObject4.put("title", strG);
                    jSONObject4.put("episode", Math.max(0, i));
                    jSONObject4.put("episodeLabel", g(80, f(str2)));
                    jSONObject4.put("source", strG2);
                    jSONObject4.put("playId", strOptString);
                    jSONObject4.put("pic", strG4);
                    jSONObject4.put("year", strG5);
                    jSONObject4.put("recordTime", jB);
                    jSONObject4.put("lastAt", jB);
                    jSONObject4.put("count", Math.max(0, jSONObject4.optInt("count", 0)) + (i2 ^ 1));
                    JSONArray jSONArrayE2 = E(jSONObject4, jSONArrayT, 300);
                    jSONObject2 = jSONObject;
                    jSONObject2.put("plays", jSONArrayE2);
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject2.optJSONObject("media");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                        }
                        jSONObjectOptJSONObject.put(strQ, j(jSONObject3).put("updatedAt", jB));
                        Q(jSONObjectOptJSONObject);
                        jSONObject2.put("media", jSONObjectOptJSONObject);
                    }
                    if (!str7.isEmpty()) {
                        str8 = str7;
                        if (!str8.equals(strQ)) {
                            w(Math.max(0L, jB - 1), str8);
                        }
                    }
                    y(jB, "tombstones", strQ);
                    h(jSONObject2);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
                i2 = 0;
                if (jSONObject4 == null) {
                    jSONObject4 = new JSONObject();
                }
                if (strG2.isEmpty()) {
                    strG2 = jSONObject4.optString("source");
                }
                if (strG3.isEmpty()) {
                    strOptString = jSONObject4.optString("playId");
                } else {
                    strOptString = strG3;
                }
                if (strG4.isEmpty()) {
                    strG4 = jSONObject4.optString("pic");
                }
                if (strG5.isEmpty()) {
                    strG5 = jSONObject4.optString("year");
                }
                strQ = q(strG, strG5);
                if (i2 == 0) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void J(String str) {
        String strG = g(80, f(str));
        String lowerCase = strG.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("://") || lowerCase.startsWith("magnet:") || lowerCase.startsWith("thunder:")) {
            return;
        }
        String strC = C(strG);
        if (strC.isEmpty()) {
            return;
        }
        synchronized (a) {
            try {
                JSONObject jSONObjectH = H();
                JSONArray jSONArrayOptJSONArray = jSONObjectH.optJSONArray("searches");
                long jB = B();
                JSONObject[] jSONObjectArr = new JSONObject[1];
                JSONArray jSONArrayT = T(jSONArrayOptJSONArray, strC, jSONObjectArr);
                JSONObject jSONObject = jSONObjectArr[0];
                if (jSONObject == null || jB - jSONObject.optLong("lastAt", 0L) >= 5000) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    try {
                        jSONObject.put("key", strC);
                        jSONObject.put("text", strG);
                        jSONObject.put("recordTime", jB);
                        jSONObject.put("lastAt", jB);
                        jSONObject.put("count", Math.max(0, jSONObject.optInt("count", 0)) + 1);
                        jSONObjectH.put("searches", E(jSONObject, jSONArrayT, 100));
                        y(jB, "searchTombstones", strC);
                        h(jSONObjectH);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void K(Object obj) {
        JSONArray jSONArrayA = AbstractC0312y1.a(obj);
        if (jSONArrayA.length() == 0) {
            return;
        }
        synchronized (a) {
            try {
                JSONObject jSONObjectH = H();
                JSONObject jSONObjectOptJSONObject = jSONObjectH.optJSONObject("media");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z = false;
                for (int i = 0; i < jSONArrayA.length(); i++) {
                    JSONObject jSONObjectZ = z(jSONArrayA.optJSONObject(i), jCurrentTimeMillis);
                    if (jSONObjectZ != null) {
                        String strC = C(jSONObjectZ.optString("name"));
                        d(jSONObjectZ);
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strC);
                        if (jSONObjectOptJSONObject2 == null || !jSONObjectZ.optString("pic").equals(jSONObjectOptJSONObject2.optString("pic")) || !jSONObjectZ.optString("year").equals(jSONObjectOptJSONObject2.optString("year")) || !jSONObjectZ.optString("remarks").equals(jSONObjectOptJSONObject2.optString("remarks")) || !jSONObjectZ.optString("content").equals(jSONObjectOptJSONObject2.optString("content"))) {
                            try {
                                jSONObjectOptJSONObject.put(strC, jSONObjectZ);
                                z = true;
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (z) {
                    Q(jSONObjectOptJSONObject);
                    try {
                        jSONObjectH.put("media", jSONObjectOptJSONObject);
                        V(jSONObjectH);
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean L(JSONArray jSONArray, ArrayList arrayList) {
        if (jSONArray == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            com.github.catvod.spider.merge.p001b.k kVar = (com.github.catvod.spider.merge.p001b.k) it.next();
            String strC = C(kVar == null ? "" : kVar.c());
            if (!strC.isEmpty() && hashSet.add(strC)) {
                int i2 = i + 1;
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null || !strC.equals(jSONObjectOptJSONObject.optString("key"))) {
                    return false;
                }
                i = i2;
            }
        }
        return i > 0;
    }

    public static boolean M(String str, JSONArray jSONArray, JSONObject jSONObject) {
        String strF = f(str);
        if (strF.isEmpty()) {
            return false;
        }
        synchronized (a) {
            JSONObject jSONObjectH = H();
            try {
                JSONObject jSONObjectD = D(jSONObjectH.optInt("revision", 0), jSONObjectH.optJSONObject("ai"));
                if (!strF.equals(jSONObjectD.optString("requestKey"))) {
                    return false;
                }
                jSONObjectD.put("rawItems", i(jSONArray));
                jSONObjectD.put("rawRequestKey", strF);
                jSONObjectD.put("pendingProfile", j(jSONObject));
                jSONObjectD.put("status", "resolving");
                jSONObjectD.put("rawUpdatedAt", System.currentTimeMillis());
                jSONObjectD.put("lastError", "");
                jSONObjectH.put("ai", jSONObjectD);
                V(jSONObjectH);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static boolean N(String str, String str2, JSONArray jSONArray) {
        String strF = f(str);
        JSONArray jSONArrayI = i(jSONArray);
        if (strF.isEmpty() || jSONArrayI.length() == 0) {
            return false;
        }
        synchronized (a) {
            JSONObject jSONObjectH = H();
            try {
                JSONObject jSONObjectD = D(jSONObjectH.optInt("revision", 0), jSONObjectH.optJSONObject("ai"));
                if (!strF.equals(jSONObjectD.optString("requestKey"))) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                jSONObjectD.put("resolvedSource", f(str2));
                JSONArray jSONArrayOptJSONArray = jSONObjectD.optJSONArray("resolvedItems");
                JSONArray jSONArray2 = new JSONArray();
                HashSet hashSet = new HashSet();
                b(jSONArray2, hashSet, jSONArrayI);
                b(jSONArray2, hashSet, jSONArrayOptJSONArray);
                jSONObjectD.put("resolvedItems", jSONArray2);
                JSONObject jSONObjectOptJSONObject = jSONObjectD.optJSONObject("pendingProfile");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    jSONObjectOptJSONObject.put("updatedAt", jCurrentTimeMillis);
                    jSONObjectD.put("profile", jSONObjectOptJSONObject);
                }
                jSONObjectD.remove("pendingProfile");
                jSONObjectD.put("revision", jSONObjectH.optInt("revision", 0));
                jSONObjectD.put("status", "ready");
                jSONObjectD.put("stale", false);
                jSONObjectD.put("updatedAt", jCurrentTimeMillis);
                jSONObjectD.put("successAt", jCurrentTimeMillis);
                jSONObjectD.put("lastError", "");
                jSONObjectD.put("failureSource", "");
                jSONObjectH.put("ai", jSONObjectD);
                V(jSONObjectH);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static JSONObject O() {
        JSONObject jSONObjectJ;
        synchronized (a) {
            jSONObjectJ = j(H());
        }
        return jSONObjectJ;
    }

    public static String P() {
        String str;
        String string;
        synchronized (a) {
            try {
                JSONObject jSONObjectH = H();
                JSONArray jSONArrayOptJSONArray = jSONObjectH.optJSONArray("searches");
                JSONArray jSONArrayOptJSONArray2 = jSONObjectH.optJSONArray("plays");
                long jMax = Math.max(t(jSONArrayOptJSONArray), t(jSONArrayOptJSONArray2));
                StringBuilder sb = new StringBuilder("搜索 ");
                sb.append(jSONArrayOptJSONArray.length());
                sb.append(" · 播放 ");
                sb.append(jSONArrayOptJSONArray2.length());
                if (jMax > 0) {
                    str = " · 最近 " + l(jMax);
                } else {
                    str = "";
                }
                sb.append(str);
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static void Q(JSONObject jSONObject) {
        while (jSONObject.length() > 500) {
            Iterator<String> itKeys = jSONObject.keys();
            String str = "";
            long j = Long.MAX_VALUE;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                long jOptLong = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optLong("updatedAt", 0L) : 0L;
                if (jOptLong < j) {
                    str = next;
                    j = jOptLong;
                }
            }
            if (str.isEmpty()) {
                return;
            } else {
                jSONObject.remove(str);
            }
        }
    }

    public static void R(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("tmdbId");
        if (iOptInt <= 0) {
            return;
        }
        synchronized (a) {
            try {
                JSONObject jSONObjectH = H();
                JSONArray jSONArrayOptJSONArray = jSONObjectH.optJSONArray("follows");
                for (int i = 0; jSONArrayOptJSONArray != null && i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt("tmdbId") == iOptInt) {
                        try {
                            jSONObjectH.put("follows", A(jSONArrayOptJSONArray, jSONObject));
                            V(jSONObjectH);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean S(JSONObject jSONObject) {
        boolean zV;
        if (jSONObject.optInt("tmdbId") <= 0) {
            return false;
        }
        synchronized (a) {
            try {
                JSONObject jSONObjectH = H();
                try {
                    jSONObjectH.put("follows", A(jSONObjectH.optJSONArray("follows"), jSONObject));
                    zV = V(jSONObjectH);
                } catch (Exception unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zV;
    }

    public static JSONArray T(JSONArray jSONArray, String str, JSONObject[] jSONObjectArr) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; jSONArray != null && i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                if (str.equals(jSONObjectOptJSONObject.optString("key"))) {
                    jSONObjectArr[0] = jSONObjectOptJSONObject;
                } else {
                    jSONArray2.put(jSONObjectOptJSONObject);
                }
            }
        }
        return jSONArray2;
    }

    public static JSONArray U(JSONArray jSONArray, String str, String str2, JSONObject[] jSONObjectArr) {
        int i = -1;
        for (int i2 = 0; jSONArray != null && i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null && str.equals(C(jSONObjectOptJSONObject.optString("title"))) && (str2.isEmpty() || jSONObjectOptJSONObject.optString("year").isEmpty())) {
                if (i >= 0) {
                    return i(jSONArray);
                }
                i = i2;
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i3 = 0; jSONArray != null && i3 < jSONArray.length(); i3++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i3);
            if (jSONObjectOptJSONObject2 != null) {
                if (i3 == i) {
                    jSONObjectArr[0] = jSONObjectOptJSONObject2;
                } else {
                    jSONArray2.put(jSONObjectOptJSONObject2);
                }
            }
        }
        return jSONArray2;
    }

    public static boolean V(JSONObject jSONObject) {
        try {
            String string = i(jSONObject.optJSONArray("follows")).toString();
            C0297t1.j("smart_follows.json", string);
            if (!string.equals(C0297t1.h("smart_follows.json"))) {
                return false;
            }
            String string2 = c(jSONObject).toString();
            C0297t1.j("smart_behavior.json", string2);
            if (!string2.equals(C0297t1.h("smart_behavior.json"))) {
                return false;
            }
            e = j(jSONObject);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static JSONObject a() {
        JSONObject jSONObjectM = m();
        JSONArray jSONArrayOptJSONArray = jSONObjectM.optJSONArray("resolvedItems");
        JSONArray jSONArrayOptJSONArray2 = jSONObjectM.optJSONArray("rawItems");
        JSONObject jSONObjectOptJSONObject = jSONObjectM.optJSONObject("profile");
        try {
            int length = 0;
            JSONObject jSONObjectPut = new JSONObject().put("kind", jSONObjectM.optString("kind")).put("status", jSONObjectM.optString("status", "idle")).put("stale", jSONObjectM.optBoolean("stale")).put("count", jSONArrayOptJSONArray == null ? 0 : jSONArrayOptJSONArray.length());
            if (jSONArrayOptJSONArray2 != null) {
                length = jSONArrayOptJSONArray2.length();
            }
            return jSONObjectPut.put("rawCount", length).put("updatedAt", jSONObjectM.optLong("updatedAt")).put("successAt", jSONObjectM.optLong("successAt")).put("requestedAt", jSONObjectM.optLong("requestedAt")).put("attemptAt", jSONObjectM.optLong("attemptAt")).put("failureAt", jSONObjectM.optLong("failureAt")).put("lastError", jSONObjectM.optString("lastError")).put("requestKey", jSONObjectM.optString("requestKey")).put("refreshGeneration", jSONObjectM.optInt("refreshGeneration")).put("profileTitle", jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString("title")).put("resolvedSource", jSONObjectM.optString("resolvedSource"));
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static void b(JSONArray jSONArray, HashSet hashSet, JSONArray jSONArray2) {
        for (int i = 0; jSONArray2 != null && i < jSONArray2.length() && jSONArray.length() < 100; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONObject("vod");
            String strC = C(jSONObjectOptJSONObject2 == null ? "" : jSONObjectOptJSONObject2.optString("vod_name"));
            if (!strC.isEmpty() && hashSet.add(strC)) {
                jSONArray.put(j(jSONObjectOptJSONObject));
            }
        }
    }

    public static JSONObject c(JSONObject jSONObject) {
        JSONObject jSONObjectJ = j(jSONObject);
        jSONObjectJ.remove("plays");
        jSONObjectJ.remove("searches");
        jSONObjectJ.remove("follows");
        return jSONObjectJ;
    }

    public static void d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        LinkedHashMap linkedHashMap = b;
        linkedHashMap.put(C(jSONObject.optString("name")), j(jSONObject));
        while (linkedHashMap.size() > 200) {
            linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
        }
    }

    public static void e(String str) {
        String strF = f(str);
        if (strF.isEmpty()) {
            return;
        }
        synchronized (a) {
            JSONObject jSONObjectH = H();
            try {
                JSONObject jSONObjectD = D(jSONObjectH.optInt("revision", 0), jSONObjectH.optJSONObject("ai"));
                if (strF.equals(jSONObjectD.optString("requestKey"))) {
                    jSONObjectD.put("requestKey", "");
                    jSONObjectD.put("stale", true);
                    jSONObjectD.put("status", jSONObjectD.optJSONArray("resolvedItems").length() > 0 ? "stale" : "pending");
                    jSONObjectH.put("ai", jSONObjectD);
                    V(jSONObjectH);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static String f(String str) {
        return str == null ? "" : str.trim().replaceAll("\\s+", " ");
    }

    public static String g(int i, String str) {
        return str.length() <= i ? str : str.substring(0, i);
    }

    public static void h(JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("revision", 0) + 1;
        JSONObject jSONObjectD = D(iOptInt, jSONObject.optJSONObject("ai"));
        jSONObjectD.put("stale", true);
        jSONObjectD.put("status", jSONObjectD.optJSONArray("resolvedItems").length() <= 0 ? "pending" : "stale");
        jSONObjectD.put("requestKey", "");
        jSONObject.put("revision", iOptInt);
        jSONObject.put("ai", jSONObjectD);
        try {
            String string = i(jSONObject.optJSONArray("follows")).toString();
            C0297t1.j("smart_follows.json", string);
            if (string.equals(C0297t1.h("smart_follows.json"))) {
                JSONObject jSONObject2 = f;
                JSONObject jSONObjectK = jSONObject2 == null ? k() : j(jSONObject2);
                jSONObjectK.put("plays", i(jSONObject.optJSONArray("plays")));
                jSONObjectK.put("searches", i(jSONObject.optJSONArray("searches")));
                f = j(jSONObjectK);
                C0297t1.j("smart_history.json", jSONObjectK.toString());
                C0297t1.j("smart_behavior.json", c(jSONObject).toString());
                e = j(jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public static JSONArray i(JSONArray jSONArray) {
        try {
            return jSONArray == null ? new JSONArray() : new JSONArray(jSONArray.toString());
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    public static JSONObject j(JSONObject jSONObject) {
        try {
            return jSONObject == null ? new JSONObject() : new JSONObject(jSONObject.toString());
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static JSONObject k() {
        try {
            return new JSONObject().put("version", 3).put("updatedAt", 0L).put("clearBefore", 0L).put("plays", new JSONArray()).put("tombstones", new JSONObject()).put("searchClearBefore", 0L).put("searches", new JSONArray()).put("searchTombstones", new JSONObject());
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static String l(long j) {
        if (j <= 0) {
            return "";
        }
        long jMax = Math.max(0L, System.currentTimeMillis() - j);
        if (jMax < 60000) {
            return "刚刚";
        }
        if (jMax < 3600000) {
            return (jMax / 60000) + "分钟前";
        }
        if (jMax < 86400000) {
            return (jMax / 3600000) + "小时前";
        }
        if (jMax < 172800000) {
            return "昨天";
        }
        if (jMax >= 604800000) {
            return new SimpleDateFormat("MM-dd", Locale.getDefault()).format(Long.valueOf(j));
        }
        return (jMax / 86400000) + "天前";
    }

    public static JSONObject m() {
        JSONObject jSONObjectJ;
        synchronized (a) {
            try {
                JSONObject jSONObjectH = H();
                JSONObject jSONObjectOptJSONObject = jSONObjectH.optJSONObject("ai");
                try {
                    JSONObject jSONObjectD = D(jSONObjectH.optInt("revision", 0), jSONObjectOptJSONObject);
                    if (jSONObjectOptJSONObject == null || !jSONObjectD.toString().equals(jSONObjectOptJSONObject.toString())) {
                        jSONObjectH.put("ai", jSONObjectD);
                        V(jSONObjectH);
                    }
                    jSONObjectJ = j(jSONObjectD);
                } catch (Exception unused) {
                    return new JSONObject();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObjectJ;
    }

    public static int n() {
        int length;
        synchronized (a) {
            length = H().optJSONArray("follows").length();
        }
        return length;
    }

    public static JSONArray o() {
        JSONArray jSONArrayI;
        synchronized (a) {
            jSONArrayI = i(H().optJSONArray("follows"));
        }
        return jSONArrayI;
    }

    public static boolean p() {
        boolean z;
        synchronized (a) {
            try {
                JSONObject jSONObjectH = H();
                z = jSONObjectH.optJSONArray("searches").length() > 0 || jSONObjectH.optJSONArray("plays").length() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public static String q(String str, String str2) {
        String strC = C(str);
        String strF = f(str2);
        return (strC.isEmpty() || strF.isEmpty()) ? strC : com.github.catvod.spider.merge.D.b.C(strC, "|", strF);
    }

    public static long r(JSONObject jSONObject) {
        long jMax = Math.max(Math.max(Math.max(jSONObject.optLong("clearBefore"), jSONObject.optLong("searchClearBefore")), t(jSONObject.optJSONArray("plays"))), t(jSONObject.optJSONArray("searches")));
        String[] strArr = {"tombstones", "searchTombstones"};
        for (int i = 0; i < 2; i++) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(strArr[i]);
            Iterator<String> itKeys = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.keys();
            while (itKeys != null && itKeys.hasNext()) {
                jMax = Math.max(jMax, jSONObjectOptJSONObject.optLong(itKeys.next()));
            }
        }
        return jMax;
    }

    public static boolean s(JSONObject jSONObject, long j) {
        String strOptString = jSONObject.optString("status");
        long jOptLong = j - jSONObject.optLong("attemptAt");
        return ("loading".equals(strOptString) || "resolving".equals(strOptString)) && jOptLong >= 0 && jOptLong < 300000;
    }

    public static long t(JSONArray jSONArray) {
        long jMax = 0;
        for (int i = 0; jSONArray != null && i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                jMax = Math.max(jMax, Math.max(Math.max(0L, jSONObjectOptJSONObject.optLong("recordTime")), Math.max(Math.max(0L, jSONObjectOptJSONObject.optLong("lastAt")), Math.max(0L, jSONObjectOptJSONObject.optLong("updatedAt")))));
            }
        }
        return jMax;
    }

    public static boolean u(String str) {
        String strF = f(str);
        if (strF.isEmpty()) {
            return false;
        }
        synchronized (a) {
            JSONObject jSONObjectH = H();
            try {
                JSONObject jSONObjectD = D(jSONObjectH.optInt("revision", 0), jSONObjectH.optJSONObject("ai"));
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (s(jSONObjectD, jCurrentTimeMillis)) {
                    return false;
                }
                if (!strF.equals(jSONObjectD.optString("requestKey"))) {
                    jSONObjectD.put("rawItems", new JSONArray());
                    jSONObjectD.put("rawRequestKey", "");
                    jSONObjectD.remove("pendingProfile");
                    jSONObjectD.remove("rawUpdatedAt");
                }
                jSONObjectD.put("requestKey", strF);
                jSONObjectD.put("status", "loading");
                jSONObjectD.put("attemptAt", jCurrentTimeMillis);
                jSONObjectD.put("lastError", "");
                jSONObjectH.put("ai", jSONObjectD);
                V(jSONObjectH);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static void v(String str, String str2, String str3) {
        String strF = f(str);
        if (strF.isEmpty()) {
            return;
        }
        synchronized (a) {
            JSONObject jSONObjectH = H();
            try {
                JSONObject jSONObjectD = D(jSONObjectH.optInt("revision", 0), jSONObjectH.optJSONObject("ai"));
                if (strF.equals(jSONObjectD.optString("requestKey"))) {
                    jSONObjectD.put("status", "failed");
                    jSONObjectD.put("stale", true);
                    jSONObjectD.put("failureAt", System.currentTimeMillis());
                    jSONObjectD.put("failureSource", f(str2));
                    jSONObjectD.put("lastError", g(300, f(str3)));
                    jSONObjectH.put("ai", jSONObjectD);
                    V(jSONObjectH);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void w(long j, String str) throws JSONException {
        JSONObject jSONObjectG = G();
        JSONObject jSONObjectOptJSONObject = jSONObjectG.optJSONObject("tombstones");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        jSONObjectOptJSONObject.put(str, j);
        while (jSONObjectOptJSONObject.length() > 1200) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            String str2 = "";
            long j2 = Long.MAX_VALUE;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                long jOptLong = jSONObjectOptJSONObject.optLong(next);
                if (jOptLong < j2) {
                    str2 = next;
                    j2 = jOptLong;
                }
            }
            if (str2.isEmpty()) {
                break;
            } else {
                jSONObjectOptJSONObject.remove(str2);
            }
        }
        jSONObjectG.put("tombstones", jSONObjectOptJSONObject).put("updatedAt", j);
        f = jSONObjectG;
    }

    public static void x(String str) {
        synchronized (a) {
            c = C(str);
            d = System.currentTimeMillis() + 20000;
        }
    }

    public static void y(long j, String str, String str2) throws JSONException {
        JSONObject jSONObjectG = G();
        JSONObject jSONObjectOptJSONObject = jSONObjectG.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        jSONObjectOptJSONObject.remove(str2);
        jSONObjectG.put(str, jSONObjectOptJSONObject).put("updatedAt", Math.max(jSONObjectG.optLong("updatedAt"), j));
        f = jSONObjectG;
    }

    public static JSONObject z(JSONObject jSONObject, long j) {
        if (jSONObject == null) {
            return null;
        }
        String strG = g(120, f(jSONObject.optString("vod_name")));
        String strG2 = g(1200, f(jSONObject.optString("vod_pic")));
        if (!C(strG).isEmpty() && !strG2.isEmpty()) {
            try {
                return new JSONObject().put("name", strG).put("pic", strG2).put("year", g(12, f(jSONObject.optString("vod_year")))).put("remarks", g(160, f(jSONObject.optString("vod_remarks")))).put("content", g(600, f(jSONObject.optString("vod_content")))).put("updatedAt", j);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
