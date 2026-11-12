package com.github.catvod.spider.merge.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0244b1 {
    public static final Pattern a = Pattern.compile("(?i)(\\d+(?:\\.\\d+)?)\\s*(TB|GB|MB|KB|T|G|M)\\b");
    public static final Pattern b = Pattern.compile("((?:19|20)\\d{2})[-/.年](\\d{1,2})[-/.月](\\d{1,2})");
    public static final Pattern c = Pattern.compile("(?i)(^|[\\s._\\-\\[\\]()【】])dv($|[\\s._\\-\\[\\]()【】])");
    public static final Pattern d = Pattern.compile("(?i)(^|[\\s._\\-\\[\\]()【】])hdr($|[\\s._\\-\\[\\]()【】])");
    public static final Pattern e = Pattern.compile("(?i)(^|[\\s._\\-\\[\\]()【】])(tc|ts|cam|trailer)($|[\\s._\\-\\[\\]()【】])");

    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x010c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0123 A[LOOP:0: B:71:0x0123->B:78:0x0135, LOOP_START, PHI: r2
  0x0123: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:69:0x0120, B:78:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0126  */
    /* JADX WARN: Code duplicated, block: B:79:0x0138  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static int a(JSONObject jSONObject) {
        int i;
        String[] strArr;
        String str;
        String strM = m(jSONObject);
        String lowerCase = strM.toLowerCase(Locale.ROOT);
        int i2 = (strM.contains("杜比") || lowerCase.contains("dolby") || lowerCase.contains("dovi")) ? 120000 : 0;
        if (c.matcher(lowerCase).find()) {
            i2 += 100000;
        }
        if (strM.contains("高码") || lowerCase.contains("high bitrate") || lowerCase.contains("hbr") || lowerCase.contains("hq")) {
            i2 += 90000;
        }
        if (lowerCase.contains("hdr10+")) {
            i = 85000;
        } else {
            if (!lowerCase.contains("hdr10")) {
                if (d.matcher(lowerCase).find()) {
                    i = 75000;
                }
                if (lowerCase.contains("4k") || lowerCase.contains("2160p") || lowerCase.contains("2160") || lowerCase.contains("uhd")) {
                    i2 += 65000;
                }
                if (strM.contains("原盘") || lowerCase.contains("remux") || lowerCase.contains("bluray") || lowerCase.contains("blu-ray") || lowerCase.contains("bdmv")) {
                    i2 += 55000;
                }
                if (lowerCase.contains("60fps") || strM.contains("60帧")) {
                    i2 += 35000;
                }
                if (lowerCase.contains("1080p") || lowerCase.contains("1080")) {
                    i2 += 15000;
                }
                if (lowerCase.contains("web-dl") || lowerCase.contains("webdl")) {
                    i2 += 3000;
                }
                strArr = new String[]{"枪版", "抢先", "预告", "花絮", "解说"};
                if (j(strM)) {
                    for (int i3 = 0; i3 < 5; i3++) {
                        str = strArr[i3];
                        if (!j(str) || !strM.contains(str)) {
                        }
                    }
                    if (!e.matcher(lowerCase).find()) {
                        return i2;
                    }
                } else if (!e.matcher(lowerCase).find()) {
                    return i2;
                }
                return i2 - 1000000;
            }
            i = 80000;
        }
        i2 += i;
        if (lowerCase.contains("4k")) {
            i2 += 65000;
        } else {
            i2 += 65000;
        }
        if (strM.contains("原盘")) {
            i2 += 55000;
        } else {
            i2 += 55000;
        }
        if (lowerCase.contains("60fps")) {
            i2 += 35000;
        } else {
            i2 += 35000;
        }
        if (lowerCase.contains("1080p")) {
            i2 += 15000;
        } else {
            i2 += 15000;
        }
        if (lowerCase.contains("web-dl")) {
            i2 += 3000;
        } else {
            i2 += 3000;
        }
        strArr = new String[]{"枪版", "抢先", "预告", "花絮", "解说"};
        if (j(strM)) {
            while (i3 < 5) {
                str = strArr[i3];
                if (!j(str)) {
                }
            }
            if (!e.matcher(lowerCase).find()) {
                return i2;
            }
        } else if (!e.matcher(lowerCase).find()) {
            return i2;
        }
        return i2 - 1000000;
    }

    public static long b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0L;
        }
        String strH = h(jSONObject.optString("datetime", ""), jSONObject.optString("date", ""), jSONObject.optString("time", ""));
        if (j(strH) || strH.startsWith("0001-")) {
            return 0L;
        }
        Matcher matcher = b.matcher(strH);
        if (!matcher.find() && strH.matches("(?:19|20)\\d{2}")) {
            return Long.parseLong(strH) * 10000;
        }
        matcher.reset();
        if (!matcher.find()) {
            return jSONObject.optLong("_timestamp", 0L);
        }
        return Long.parseLong(matcher.group(3)) + (Long.parseLong(matcher.group(2)) * 100) + (Long.parseLong(matcher.group(1)) * 10000);
    }

    public static double c(String str) {
        if (str == null) {
            str = "";
        }
        Matcher matcher = a.matcher(str);
        if (!matcher.find()) {
            return 0.0d;
        }
        try {
            double d2 = Double.parseDouble(matcher.group(1));
            String upperCase = matcher.group(2).toUpperCase(Locale.ROOT);
            if (upperCase.startsWith("T")) {
                return d2 * 1024.0d;
            }
            if (upperCase.startsWith("G")) {
                return d2;
            }
            if (!upperCase.startsWith("M")) {
                if (!upperCase.startsWith("K")) {
                    return 0.0d;
                }
                d2 /= 1024.0d;
            }
            return d2 / 1024.0d;
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static void d(String str, ArrayList arrayList) {
        if (j(str) || arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static ArrayList e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList == null) {
            return arrayList2;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                String strTrim = str.trim();
                if (!j(strTrim)) {
                    arrayList2.add(strTrim);
                }
            }
        }
        return arrayList2;
    }

    public static String f(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        String strK = com.github.catvod.spider.merge.D.b.k(jSONObject.optString("url", ""), " ", "", "&amp;", "&");
        return j(strK) ? "" : com.github.catvod.spider.merge.D.b.C(str, "|", strK);
    }

    public static String g(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("images")) == null) {
            return "";
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strTrim = jSONArrayOptJSONArray.optString(i, "").trim();
            if (!j(strTrim)) {
                return strTrim;
            }
        }
        return "";
    }

    public static String h(String... strArr) {
        for (String str : strArr) {
            if (!j(str)) {
                return str.trim();
            }
        }
        return "";
    }

    public static LinkedHashMap i(JSONObject jSONObject, C0241a1 c0241a1) {
        JSONArray jSONArrayOptJSONArray;
        String strF;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((ArrayList) c0241a1.b).iterator();
        while (it.hasNext()) {
            linkedHashMap.put((String) it.next(), new ArrayList());
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strL = l(next);
            List list = (List) linkedHashMap.get(strL);
            if (list != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(next)) != null) {
                HashSet hashSet = new HashSet();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    hashSet.add(f(strL, (JSONObject) it2.next()));
                }
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String lowerCase = m(jSONObjectOptJSONObject).toLowerCase(Locale.ROOT);
                        Iterator it3 = ((ArrayList) c0241a1.d).iterator();
                        do {
                            if (!it3.hasNext()) {
                                ArrayList arrayList = (ArrayList) c0241a1.c;
                                if (arrayList.isEmpty()) {
                                    strF = f(strL, jSONObjectOptJSONObject);
                                    if (!j(strF)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                Iterator it4 = arrayList.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    if (lowerCase.contains(((String) it4.next()).toLowerCase(Locale.ROOT))) {
                                        strF = f(strL, jSONObjectOptJSONObject);
                                        if (!j(strF) || !hashSet.add(strF)) {
                                            break;
                                        }
                                        list.add(jSONObjectOptJSONObject);
                                        break;
                                    }
                                }
                            }
                        } while (!lowerCase.contains(((String) it3.next()).toLowerCase(Locale.ROOT)));
                    }
                }
            }
        }
        for (List list2 : linkedHashMap.values()) {
            if (list2 != null && list2.size() >= 2) {
                Collections.sort(list2, new Z0());
            }
            while (list2 != null && list2.size() > c0241a1.a) {
                list2.remove(list2.size() - 1);
            }
        }
        return linkedHashMap;
    }

    public static boolean j(String str) {
        return str == null || str.length() == 0;
    }

    public static String k(String str, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append((String) arrayList.get(i));
        }
        return sb.toString();
    }

    public static String l(String str) {
        if (str == null) {
            return "";
        }
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        if (lowerCase.equals("aliyundrive") || lowerCase.equals("aliyun") || lowerCase.equals("alipan")) {
            return "ali";
        }
        if (lowerCase.equals("189") || lowerCase.equals("cloud189") || lowerCase.equals("tianyiyun")) {
            return "tianyi";
        }
        if (lowerCase.equals("139") || lowerCase.equals("mobile") || lowerCase.equals("yidongcloud") || lowerCase.equals("caiyun")) {
            return "yidong";
        }
        if (lowerCase.equals("baiduyun") || lowerCase.equals("baidupan")) {
            return "baidu";
        }
        if (lowerCase.equals("115pan") || lowerCase.equals("a115")) {
            return "115";
        }
        if (lowerCase.equals("123pan") || lowerCase.equals("123yun") || lowerCase.equals("a123")) {
            return "123";
        }
        if (lowerCase.equals("guangya_pan") || lowerCase.equals("guangyapan")) {
            return "guangya";
        }
        if (lowerCase.equals("thunder") || lowerCase.equals("xunleipan")) {
            return "xunlei";
        }
        return (lowerCase.equals("bt") || lowerCase.equals("cili") || lowerCase.equals("magnetlink")) ? "magnet" : lowerCase;
    }

    public static String m(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.optString("note", "") + " " + jSONObject.optString("name", "") + " " + jSONObject.optString("title", "") + " " + jSONObject.optString("url", "") + " " + jSONObject.optString("source", "");
    }

    public static String n(int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            return "网盘资源";
        }
        String strReplaceAll = h(jSONObject.optString("note", ""), jSONObject.optString("name", ""), jSONObject.optString("title", ""), jSONObject.optString("url", "")).replace('\n', ' ').replace('\r', ' ').trim().replaceAll("\\s+", " ");
        String str = j(strReplaceAll) ? "网盘资源" : strReplaceAll;
        return str.length() > i ? com.github.catvod.spider.merge.D.b.m(new StringBuilder(), str.substring(0, Math.max(0, i - 3)), "...") : str;
    }
}
