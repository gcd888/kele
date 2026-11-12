package com.github.catvod.spider.merge.A;

import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0239a {
    public static final String[] a = {"huya", "douyu", "douyin", "kuaishou", "bilibili"};
    public static volatile C0239a b;

    public static void a(String str, String str2, String str3, String str4, String str5, String str6) {
        if (str == null || str3 == null) {
            return;
        }
        try {
            JSONArray jSONArrayK = k();
            String str7 = str + "_" + str2 + "_" + str3;
            for (int i = 0; i < jSONArrayK.length(); i++) {
                if (str7.equals(jSONArrayK.getJSONObject(i).optString("key"))) {
                    return;
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", str7);
            jSONObject.put("site", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("parentId", str2);
            jSONObject.put("catId", str3);
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("parentName", str4);
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("catName", str5);
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("siteName", str6);
            jSONArrayK.put(jSONObject);
            C0297t1.j("alllive_fav_cats.json", jSONArrayK.toString());
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[ALLLiveStorage] addFavCategory error: "));
        }
    }

    public static void b(String str, String str2, String str3, String str4, String str5) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            JSONArray jSONArrayM = m();
            String str6 = str + "_" + str2;
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jSONArrayM.length(); i++) {
                JSONObject jSONObject = jSONArrayM.getJSONObject(i);
                if (!str6.equals(jSONObject.optString("key"))) {
                    jSONArray.put(jSONObject);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", str6);
            jSONObject2.put("site", str);
            jSONObject2.put("roomId", str2);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("userName", str3);
            if (str4 == null) {
                str4 = "";
            }
            jSONObject2.put("cover", str4);
            if (str5 == null) {
                str5 = "";
            }
            jSONObject2.put("title", str5);
            jSONObject2.put("time", System.currentTimeMillis());
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject2);
            int iMin = Math.min(jSONArray.length(), 99);
            for (int i2 = 0; i2 < iMin; i2++) {
                jSONArray2.put(jSONArray.get(i2));
            }
            C0297t1.j("alllive_history.json", jSONArray2.toString());
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[ALLLiveStorage] addHistory error: "));
        }
    }

    public static String c(String str) {
        return (str == null || str.isEmpty()) ? "" : str.replaceAll("[\\r\\n\\t]+", " ").replaceAll("\\s{2,}", " ").trim();
    }

    public static void d(String str, String str2, String str3, String str4, String str5) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            JSONArray jSONArrayL = l();
            String str6 = str + "_" + str2;
            for (int i = 0; i < jSONArrayL.length(); i++) {
                if (str6.equals(jSONArrayL.getJSONObject(i).optString("key"))) {
                    return;
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", str6);
            jSONObject.put("site", str);
            jSONObject.put("roomId", str2);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("userName", str3);
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("cover", str4);
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("title", str5);
            jSONObject.put("time", System.currentTimeMillis());
            jSONArrayL.put(jSONObject);
            C0297t1.j("alllive_follows.json", jSONArrayL.toString());
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[ALLLiveStorage] follow error: "));
        }
    }

    public static C0239a e() {
        if (b == null) {
            synchronized (C0239a.class) {
                try {
                    if (b == null) {
                        b = new C0239a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static HashSet f() {
        JSONArray jSONArrayOptJSONArray;
        try {
            String strH = C0297t1.h("alllive_config.json");
            if (!strH.isEmpty() && (jSONArrayOptJSONArray = new JSONObject(strH).optJSONArray("enabledSites")) != null) {
                HashSet hashSet = new HashSet();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    hashSet.add(jSONArrayOptJSONArray.optString(i));
                }
                return hashSet;
            }
        } catch (Exception unused) {
        }
        HashSet hashSet2 = new HashSet();
        String[] strArr = a;
        for (int i2 = 0; i2 < 5; i2++) {
            hashSet2.add(strArr[i2]);
        }
        return hashSet2;
    }

    public static boolean g() {
        try {
            return j().optBoolean("danmaku", true);
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean h(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                JSONArray jSONArrayL = l();
                String str3 = str + "_" + str2;
                for (int i = 0; i < jSONArrayL.length(); i++) {
                    if (str3.equals(jSONArrayL.getJSONObject(i).optString("key"))) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static JSONObject i(long j, String str, String str2) throws Throwable {
        C0299u0 c0299u0X = C0299u0.x();
        c0299u0X.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", "open");
        jSONObject.put("series_id", str);
        jSONObject.put("group_id", str2);
        jSONObject.put("duration", Math.max(0L, j));
        return c0299u0X.R(jSONObject);
    }

    public static JSONObject j() {
        try {
            String strH = C0297t1.h("alllive_config.json");
            if (!strH.isEmpty()) {
                return new JSONObject(strH);
            }
        } catch (Exception unused) {
        }
        return new JSONObject();
    }

    public static JSONArray k() {
        try {
            String strH = C0297t1.h("alllive_fav_cats.json");
            if (!strH.isEmpty()) {
                return new JSONArray(strH);
            }
        } catch (Exception unused) {
        }
        return new JSONArray();
    }

    public static JSONArray l() {
        try {
            String strH = C0297t1.h("alllive_follows.json");
            if (!strH.isEmpty()) {
                return new JSONArray(strH);
            }
        } catch (Exception unused) {
        }
        return new JSONArray();
    }

    public static JSONArray m() {
        try {
            String strH = C0297t1.h("alllive_history.json");
            if (!strH.isEmpty()) {
                return new JSONArray(strH);
            }
        } catch (Exception unused) {
        }
        return new JSONArray();
    }

    public static void n(String str, String str2, String str3) {
        if (str == null || str3 == null) {
            return;
        }
        try {
            JSONArray jSONArrayK = k();
            String str4 = str + "_" + str2 + "_" + str3;
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jSONArrayK.length(); i++) {
                JSONObject jSONObject = jSONArrayK.getJSONObject(i);
                if (!str4.equals(jSONObject.optString("key"))) {
                    jSONArray.put(jSONObject);
                }
            }
            C0297t1.j("alllive_fav_cats.json", jSONArray.toString());
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[ALLLiveStorage] removeFavCategory error: "));
        }
    }

    public static void o(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            JSONArray jSONArrayL = l();
            String str3 = str + "_" + str2;
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < jSONArrayL.length(); i++) {
                JSONObject jSONObject = jSONArrayL.getJSONObject(i);
                if (!str3.equals(jSONObject.optString("key"))) {
                    jSONArray.put(jSONObject);
                }
            }
            C0297t1.j("alllive_follows.json", jSONArray.toString());
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[ALLLiveStorage] unfollow error: "));
        }
    }
}
