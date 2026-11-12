package com.github.catvod.spider.merge.p020x;

import android.text.TextUtils;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.merge.A.C0297t1;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class b {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public String m = "";
    public int n = 0;
    public boolean o = true;
    public int p = 1;
    public int q = 0;
    public int r = 3;
    public int s = 5;
    public int t = 80;

    public b(String str) {
        this.a = TextUtils.isEmpty(str) ? ".fishps_config" : str;
    }

    public static String e(List list) {
        return URLEncoder.encode(TextUtils.join(",", list), "UTF-8");
    }

    public static HashMap i(String str) {
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36");
        mapS.put("Referer", str + "/");
        return mapS;
    }

    public static String j(List list) {
        if (list.isEmpty()) {
            return "未设置";
        }
        if (list.size() <= 3) {
            return TextUtils.join(",", list);
        }
        return ((String) list.get(0)) + "," + ((String) list.get(1)) + "等" + list.size() + "个";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    public static String l(String str) {
        if (str == null) {
            return "";
        }
        for (String[] strArr : c.c) {
            if (strArr[0].equalsIgnoreCase(str)) {
                return strArr[1];
            }
        }
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "139":
                return "移动";
            case "189":
                return "天翼";
            case "aliyundrive":
                return "阿里";
            default:
                return str;
        }
    }

    public static boolean n(String str) {
        String strP = p(str);
        for (String str2 : c.b) {
            if (p(str2).equals(strP)) {
                return true;
            }
        }
        return false;
    }

    public static String p(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        while (strTrim.endsWith("/") && strTrim.length() > 8) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
        }
        return strTrim;
    }

    public static void q(JSONArray jSONArray, ArrayList arrayList, boolean z) {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            if (strOptString != null && !strOptString.isEmpty() && (!z || !arrayList.contains(strOptString))) {
                arrayList.add(strOptString);
            }
        }
    }

    public static void r(JSONArray jSONArray, ArrayList arrayList) {
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String strP = p(jSONArray.optString(i));
            if (!strP.isEmpty() && !arrayList.contains(strP)) {
                arrayList.add(strP);
            }
        }
    }

    public final boolean a(String str, String str2) {
        String strP = p(str2);
        if (!strP.startsWith("http://") && !strP.startsWith("https://")) {
            return false;
        }
        boolean zN = n(strP);
        ArrayList arrayList = this.c;
        if (zN) {
            return this.d.remove(strP) | arrayList.remove(strP);
        }
        String strTrim = str.trim();
        boolean z = !strTrim.isEmpty() ? !strTrim.equals((String) this.e.put(strP, strTrim)) : false;
        ArrayList arrayList2 = this.b;
        if (arrayList2.contains(strP)) {
            return arrayList.remove(strP) || z;
        }
        arrayList2.add(strP);
        arrayList.remove(strP);
        return true;
    }

    public final String b() {
        try {
            int i = this.q;
            ArrayList arrayList = this.i;
            if (i == 1) {
                if (arrayList.isEmpty()) {
                    return "&src=all";
                }
                return "&src=tg&channels=" + e(arrayList);
            }
            ArrayList arrayList2 = this.j;
            if (i == 2) {
                if (arrayList2.isEmpty()) {
                    return "&src=all";
                }
                return "&src=plugin&plugins=" + e(arrayList2);
            }
            if (i != 3) {
                return "&src=all";
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return "&src=all";
            }
            if (arrayList2.isEmpty()) {
                return "&src=tg&channels=" + e(arrayList);
            }
            if (arrayList.isEmpty()) {
                return "&src=plugin&plugins=" + e(arrayList2);
            }
            StringBuilder sb = new StringBuilder("&src=all");
            if (!arrayList.isEmpty()) {
                sb.append("&channels=");
                sb.append(e(arrayList));
            }
            if (!arrayList2.isEmpty()) {
                sb.append("&plugins=");
                sb.append(e(arrayList2));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "&src=all";
        }
    }

    public final String c() {
        ArrayList arrayList = this.g;
        try {
            boolean zIsEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.h;
            if (zIsEmpty && arrayList2.isEmpty()) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            if (!arrayList.isEmpty()) {
                jSONObject.put("include", new JSONArray((Collection) arrayList));
            }
            if (!arrayList2.isEmpty()) {
                jSONObject.put("exclude", new JSONArray((Collection) arrayList2));
            }
            return "&filter=" + URLEncoder.encode(jSONObject.toString(), "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    public final boolean d() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.c;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList.clear();
        arrayList3.removeAll(arrayList2);
        if (h() <= 0) {
            arrayList.addAll(arrayList2);
            arrayList3.clear();
            arrayList3.addAll(arrayList4);
            return false;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.e.remove((String) it.next());
        }
        return true;
    }

    public final ArrayList f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m()) {
            if (!this.c.contains(str)) {
                linkedHashSet.add(str);
            }
        }
        return new ArrayList(linkedHashSet);
    }

    public final String g() {
        return h() + "/" + m().size() + "个启用";
    }

    public final int h() {
        return f().size();
    }

    public final String k() {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            return "未选择";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(arrayList.size(), 5); i++) {
            if (i > 0) {
                sb.append(">");
            }
            sb.append(l((String) arrayList.get(i)));
        }
        if (arrayList.size() > 5) {
            sb.append("...");
        }
        return sb.toString();
    }

    public final ArrayList m() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : c.b) {
            String strP = p(str);
            if (!strP.isEmpty() && !this.d.contains(strP)) {
                linkedHashSet.add(strP);
            }
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            String strP2 = p((String) it.next());
            if (!strP2.isEmpty()) {
                linkedHashSet.add(strP2);
            }
        }
        return new ArrayList(linkedHashSet);
    }

    public final void o() {
        ArrayList arrayList;
        ArrayList arrayList2;
        JSONArray jSONArrayNames;
        ArrayList arrayList3 = this.f;
        arrayList3.clear();
        ArrayList arrayList4 = this.b;
        arrayList4.clear();
        ArrayList arrayList5 = this.c;
        arrayList5.clear();
        ArrayList arrayList6 = this.d;
        arrayList6.clear();
        HashMap map = this.e;
        map.clear();
        ArrayList arrayList7 = this.g;
        arrayList7.clear();
        ArrayList arrayList8 = this.h;
        arrayList8.clear();
        ArrayList arrayList9 = this.i;
        arrayList9.clear();
        ArrayList arrayList10 = this.j;
        arrayList10.clear();
        ArrayList arrayList11 = this.k;
        arrayList11.clear();
        ArrayList arrayList12 = this.l;
        arrayList12.clear();
        try {
            String str = this.a;
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(str);
            if (strH.isEmpty()) {
                arrayList = arrayList4;
            } else {
                JSONObject jSONObject = new JSONObject(strH);
                this.n = jSONObject.optInt("maxPerType", 0);
                String strOptString = jSONObject.optString("customUrl", "");
                if (!strOptString.isEmpty()) {
                    String strP = p(strOptString);
                    if (!strP.isEmpty() && !arrayList4.contains(strP)) {
                        arrayList4.add(strP);
                    }
                }
                r(jSONObject.optJSONArray("customUrls"), arrayList4);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("apiNames");
                if (jSONObjectOptJSONObject == null || (jSONArrayNames = jSONObjectOptJSONObject.names()) == null) {
                    arrayList = arrayList4;
                } else {
                    arrayList = arrayList4;
                    int i = 0;
                    while (i < jSONArrayNames.length()) {
                        try {
                            String strOptString2 = jSONArrayNames.optString(i);
                            JSONArray jSONArray = jSONArrayNames;
                            String strP2 = p(strOptString2);
                            String strOptString3 = jSONObjectOptJSONObject.optString(strOptString2);
                            String strTrim = strOptString3 == null ? "" : strOptString3.trim();
                            if (!strP2.isEmpty() && !strTrim.isEmpty()) {
                                map.put(strP2, strTrim);
                            }
                            i++;
                            jSONArrayNames = jSONArray;
                        } catch (Exception unused) {
                        }
                    }
                }
                r(jSONObject.optJSONArray("disabledUrls"), arrayList5);
                r(jSONObject.optJSONArray("removedBuiltinUrls"), arrayList6);
                q(jSONObject.optJSONArray("enabledTypes"), arrayList3, false);
                q(jSONObject.optJSONArray("includeKeywords"), arrayList7, false);
                q(jSONObject.optJSONArray("excludeKeywords"), arrayList8, false);
                q(jSONObject.optJSONArray("channels"), arrayList9, true);
                q(jSONObject.optJSONArray("plugins"), arrayList10, true);
                q(jSONObject.optJSONArray("customChannels"), arrayList11, true);
                q(jSONObject.optJSONArray("customPlugins"), arrayList12, true);
                try {
                    this.m = p(jSONObject.optString("channelApiUrl", ""));
                    this.o = jSONObject.optBoolean("folderMode", true);
                    int iOptInt = jSONObject.optInt("linkCheckMode", 1);
                    if (iOptInt != 0 && iOptInt != 1 && iOptInt != 2) {
                        iOptInt = 1;
                    }
                    this.p = iOptInt;
                    int iOptInt2 = jSONObject.optInt("channelMode", 0);
                    if (iOptInt2 != 0 && iOptInt2 != 1 && iOptInt2 != 2 && iOptInt2 != 3) {
                        iOptInt2 = 0;
                    }
                    this.q = iOptInt2;
                    this.r = Math.max(1, Math.min(5, jSONObject.optInt("linkCheckConcurrency", 3)));
                    this.s = Math.max(2, Math.min(10, jSONObject.optInt("linkCheckTimeoutSeconds", 5)));
                    this.t = Math.max(80, Math.min(200, jSONObject.optInt("linkCheckBatchSize", 80)));
                } catch (Exception unused2) {
                }
            }
        } catch (Exception unused3) {
        }
        for (int size = arrayList6.size() - 1; size >= 0; size--) {
            if (!n((String) arrayList6.get(size))) {
                arrayList6.remove(size);
            }
        }
        ArrayList arrayListM = m();
        for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
            if (!arrayListM.contains(arrayList5.get(size2))) {
                arrayList5.remove(size2);
            }
        }
        if (h() == 0) {
            arrayList5.clear();
            arrayList6.clear();
        }
        for (String str2 : new ArrayList(map.keySet())) {
            if (n(str2)) {
                arrayList2 = arrayList;
            } else {
                arrayList2 = arrayList;
                if (!arrayList2.contains(str2)) {
                }
                arrayList = arrayList2;
            }
            map.remove(str2);
            arrayList = arrayList2;
        }
        if (arrayList3.isEmpty()) {
            for (String[] strArr : c.c) {
                arrayList3.add(strArr[0]);
            }
            return;
        }
        if (!arrayList3.contains("guangya") && arrayList3.size() >= c.c.length - 2) {
            arrayList3.add("guangya");
        }
        if (arrayList3.contains("magnet") || arrayList3.size() < c.c.length - 1) {
            return;
        }
        arrayList3.add("magnet");
    }

    public final void s() {
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        ArrayList arrayList = this.f;
        arrayList.clear();
        for (String[] strArr : c.c) {
            arrayList.add(strArr[0]);
        }
        this.n = 0;
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.m = "";
        this.o = true;
        this.p = 1;
        this.q = 0;
        this.r = 3;
        this.s = 5;
        this.t = 80;
        t();
    }

    public final void t() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("customUrls", new JSONArray((Collection) this.b));
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : this.e.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.put("apiNames", jSONObject2);
            jSONObject.put("disabledUrls", new JSONArray((Collection) this.c));
            jSONObject.put("removedBuiltinUrls", new JSONArray((Collection) this.d));
            jSONObject.put("maxPerType", this.n);
            jSONObject.put("enabledTypes", new JSONArray((Collection) this.f));
            jSONObject.put("includeKeywords", new JSONArray((Collection) this.g));
            jSONObject.put("excludeKeywords", new JSONArray((Collection) this.h));
            jSONObject.put("channels", new JSONArray((Collection) this.i));
            jSONObject.put("plugins", new JSONArray((Collection) this.j));
            jSONObject.put("customChannels", new JSONArray((Collection) this.k));
            jSONObject.put("customPlugins", new JSONArray((Collection) this.l));
            jSONObject.put("channelApiUrl", this.m);
            jSONObject.put("folderMode", this.o);
            jSONObject.put("linkCheckMode", this.p);
            jSONObject.put("channelMode", this.q);
            jSONObject.put("linkCheckConcurrency", this.r);
            jSONObject.put("linkCheckTimeoutSeconds", this.s);
            jSONObject.put("linkCheckBatchSize", this.t);
            String str = this.a;
            String string = jSONObject.toString();
            boolean z = FishCrypto.a;
            C0297t1.j(str, string);
        } catch (Exception unused) {
        }
    }
}
