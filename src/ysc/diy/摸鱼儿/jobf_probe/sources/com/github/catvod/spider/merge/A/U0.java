package com.github.catvod.spider.merge.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class U0 {
    public static final String[] a = {"trend", "calendar", "genre", "movie", "rank_list_movie", "tv", "rank_list_tv", "show_hot", "platform", "top10", "anime", "documentary"};
    public static final String[] b = {"影剧流行", "追更日历", "全局片库", "全能电影", "电影榜单", "剧集片库", "剧集榜单", "综艺频道", "平台片库", "流媒体TOP", "动漫全境", "纪录频道"};
    public static final String[] c = {"hot_gaia", "tv_hot", "anime", "anime_cn", "show_hot", "movie", "tv", "rank_list_movie", "rank_list_tv"};
    public static final String[] d = {"热门电影", "热播剧集", "热门动漫", "国产动漫", "热播综艺", "电影筛选", "电视筛选", "电影榜单", "电视剧榜单"};
    public static final String[] e = {"10", "5", "15", "7", "16", "13", "1", "2", "3", "14", "6", "8", "11", "9", "12", "4"};
    public static final String[] f = {"10", "1", "2", "3", "14", "6", "8", "11", "9", "12", "4"};
    public static final String[] g = {"控制台", "系统设置", "智能海报墙", "弹幕配置", "媒体库设置", "B站设置", AbstractC0302v0.Y0("quark"), AbstractC0302v0.Y0("uc"), AbstractC0302v0.Y0("tianyi"), AbstractC0302v0.Y0("yidong"), AbstractC0302v0.Y0("baidu"), AbstractC0302v0.Y0("xunlei"), AbstractC0302v0.Y0("pan123"), AbstractC0302v0.Y0("115"), AbstractC0302v0.Y0("guangya"), AbstractC0302v0.Y0("ali")};

    public static boolean a(String str, JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (str.equals(jSONArray.optString(i, ""))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String b() {
        return i() ? "轻量模式 · 已隐藏高级设置" : "完整模式 · 显示全部设置";
    }

    public static boolean[] c(String str, String[] strArr, String... strArr2) {
        boolean[] zArr = new boolean[strArr.length];
        Arrays.fill(zArr, true);
        JSONObject jSONObjectL = l(str);
        JSONArray jSONArrayOptJSONArray = jSONObjectL.optJSONArray("enabled");
        if (jSONArrayOptJSONArray != null) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i, "");
                if (h(strOptString, strArr) >= 0) {
                    hashSet.add(strOptString);
                }
            }
            if (h("hot_gaia", strArr) >= 0 && h("rank_list_tv", strArr) >= 0 && hashSet.size() >= 5) {
                hashSet.add("hot_gaia");
                hashSet.add("tv_hot");
                hashSet.add("anime");
                hashSet.add("anime_cn");
                hashSet.add("show_hot");
                hashSet.add("movie");
                hashSet.add("tv");
                hashSet.add("rank_list_movie");
                hashSet.add("rank_list_tv");
            }
            if (strArr == e) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectL.optJSONArray("order");
                int size = hashSet.size();
                if (!a("15", jSONArrayOptJSONArray2) && !hashSet.contains("15") && size >= 12) {
                    hashSet.add("15");
                    if (!a("13", jSONArrayOptJSONArray2)) {
                        hashSet.add("13");
                    }
                    if (!a("14", jSONArrayOptJSONArray2)) {
                        hashSet.add("14");
                    }
                } else if (!a("13", jSONArrayOptJSONArray2) && !hashSet.contains("13") && size >= 13) {
                    hashSet.add("13");
                    if (!a("14", jSONArrayOptJSONArray2)) {
                        hashSet.add("14");
                    }
                } else if (!a("14", jSONArrayOptJSONArray2) && !hashSet.contains("14") && size >= 14) {
                    hashSet.add("14");
                }
                if (!a("16", jSONArrayOptJSONArray2)) {
                    hashSet.add("16");
                    try {
                        JSONArray jSONArray = new JSONArray();
                        for (String str2 : strArr) {
                            if (hashSet.contains(str2)) {
                                jSONArray.put(str2);
                            }
                        }
                        jSONObjectL.put("enabled", jSONArray);
                        jSONObjectL.put("order", new JSONArray((Collection) j(jSONArrayOptJSONArray2, strArr)));
                        C0297t1.j(str, jSONObjectL.toString());
                    } catch (Exception unused) {
                    }
                }
            }
            if (h("poster_follow", strArr) >= 0 && !a("poster_follow", jSONObjectL.optJSONArray("order"))) {
                hashSet.add("poster_follow");
            }
            if (!hashSet.isEmpty()) {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    zArr[i2] = hashSet.contains(strArr[i2]);
                }
            }
        }
        for (String str3 : strArr2) {
            int iH = h(str3, strArr);
            if (iH >= 0) {
                zArr[iH] = true;
            }
        }
        return zArr;
    }

    public static String d(String str, String[] strArr, String... strArr2) {
        boolean[] zArrC = c(str, strArr, strArr2);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str2 = strArr[i3];
            int length = strArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i2++;
                    if (!zArrC[i3]) {
                        break;
                    }
                    i++;
                    break;
                }
                if (strArr2[i4].equals(str2)) {
                    break;
                }
                i4++;
            }
        }
        return "已启用 " + i + "/" + i2 + " 项";
    }

    public static ArrayList e(String str, String[] strArr, String... strArr2) {
        ArrayList arrayList = new ArrayList();
        boolean[] zArrC = c(str, strArr, strArr2);
        Iterator it = f(str, strArr).iterator();
        while (it.hasNext()) {
            int iH = h((String) it.next(), strArr);
            if (iH >= 0 && zArrC[iH]) {
                arrayList.add(Integer.valueOf(iH));
            }
        }
        return arrayList;
    }

    public static ArrayList f(String str, String[] strArr) {
        return j(l(str).optJSONArray("order"), strArr);
    }

    public static String g(String str, String[] strArr, String... strArr2) {
        int i = 0;
        for (boolean z : c(str, strArr, strArr2)) {
            if (z) {
                i++;
            }
        }
        StringBuilder sb = new StringBuilder("已启用 ");
        sb.append(i);
        sb.append("/");
        return com.github.catvod.spider.merge.D.b.l(sb, strArr.length, " 项");
    }

    public static int h(String str, String[] strArr) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static boolean i() {
        return "1".equals(C0297t1.h("fish_config_light_mode"));
    }

    public static ArrayList j(JSONArray jSONArray, String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (h("poster_follow", strArr) >= 0 && !a("poster_follow", jSONArray)) {
            linkedHashSet.add("poster_follow");
        }
        boolean z = strArr == e && !a("16", jSONArray);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i, "");
                if (z && "13".equals(strOptString)) {
                    linkedHashSet.add("16");
                }
                if (h(strOptString, strArr) >= 0) {
                    linkedHashSet.add(strOptString);
                }
            }
        }
        linkedHashSet.addAll(Arrays.asList(strArr));
        return new ArrayList(linkedHashSet);
    }

    public static String k(boolean z) {
        return z ? "poster_tmdb_home_menu" : "poster_douban_home_menu";
    }

    public static JSONObject l(String str) {
        try {
            String strH = C0297t1.h(str);
            return strH.isEmpty() ? new JSONObject() : new JSONObject(strH);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static boolean m(String str, String[] strArr, boolean[] zArr, String... strArr2) {
        try {
            boolean[] zArr2 = (boolean[]) zArr.clone();
            for (String str2 : strArr2) {
                int iH = h(str2, strArr);
                if (iH >= 0) {
                    zArr2[iH] = true;
                }
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < strArr.length; i++) {
                if (zArr2[i]) {
                    jSONArray.put(strArr[i]);
                }
            }
            if (jSONArray.length() == 0) {
                return false;
            }
            JSONObject jSONObjectL = l(str);
            jSONObjectL.put("enabled", jSONArray);
            if (h("poster_follow", strArr) >= 0 && !a("poster_follow", jSONObjectL.optJSONArray("order"))) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = f(str, strArr).iterator();
                while (it.hasNext()) {
                    jSONArray2.put((String) it.next());
                }
                jSONObjectL.put("order", jSONArray2);
            }
            C0297t1.j(str, jSONObjectL.toString());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void n(String str, String[] strArr, List list) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (h(str2, strArr) >= 0) {
                    linkedHashSet.add(str2);
                }
            }
            linkedHashSet.addAll(Arrays.asList(strArr));
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                jSONArray.put((String) it2.next());
            }
            JSONObject jSONObjectL = l(str);
            jSONObjectL.put("order", jSONArray);
            C0297t1.j(str, jSONObjectL.toString());
        } catch (Exception unused) {
        }
    }
}
