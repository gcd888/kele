package com.github.catvod.spider.merge.l0;

import android.text.TextUtils;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.merge.A.AbstractC0244b1;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class l {
    public static void a(StringBuilder sb, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (sb.length() > 0) {
            sb.append("\n");
        }
        sb.append(str);
        sb.append(": ");
        sb.append(str2.trim());
    }

    public static void b(com.github.catvod.spider.merge.p001b.k kVar, String[] strArr, String str) {
        String strL = l(strArr, 7);
        String strL2 = l(strArr, 3);
        String strL3 = l(strArr, 8);
        if (!TextUtils.isEmpty(strL)) {
            kVar.p(strL);
        }
        if (!TextUtils.isEmpty(strL2)) {
            kVar.i(strL2);
        }
        if (!TextUtils.isEmpty(strL3)) {
            kVar.u(strL3);
        }
        String strE = e(strL2, l(strArr, 6), l(strArr, 5));
        if (!TextUtils.isEmpty(strE)) {
            kVar.s(strE);
        }
        kVar.l(d(str, strArr));
    }

    public static String c(String str, String[] strArr) {
        if (TextUtils.isEmpty(l(strArr, 1)) && TextUtils.isEmpty(l(strArr, 3)) && TextUtils.isEmpty(l(strArr, 4)) && TextUtils.isEmpty(l(strArr, 5)) && TextUtils.isEmpty(l(strArr, 6)) && TextUtils.isEmpty(l(strArr, 7)) && TextUtils.isEmpty(l(strArr, 8))) {
            return FishCrypto.b(str);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("list");
            JSONObject jSONObjectOptJSONObject = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) ? null : jSONArrayOptJSONArray.optJSONObject(0);
            if (jSONObjectOptJSONObject != null) {
                String strL = l(strArr, 1);
                String strL2 = l(strArr, 7);
                String strL3 = l(strArr, 3);
                String strL4 = l(strArr, 8);
                if (!TextUtils.isEmpty(strL)) {
                    jSONObjectOptJSONObject.put("vod_name", strL);
                }
                if (!TextUtils.isEmpty(strL2)) {
                    jSONObjectOptJSONObject.put("vod_pic", strL2);
                }
                if (!TextUtils.isEmpty(strL3)) {
                    jSONObjectOptJSONObject.put("type_name", strL3);
                }
                if (!TextUtils.isEmpty(strL4)) {
                    jSONObjectOptJSONObject.put("vod_year", strL4);
                }
                String strE = e(strL3, l(strArr, 6), l(strArr, 5));
                if (!TextUtils.isEmpty(strE)) {
                    jSONObjectOptJSONObject.put("vod_remarks", strE);
                }
                jSONObjectOptJSONObject.put("vod_content", d(jSONObjectOptJSONObject.optString("vod_content", ""), strArr));
                String strOptString = jSONObjectOptJSONObject.optString("vod_play_url", "");
                if (!TextUtils.isEmpty(strL)) {
                    AbstractC0280n1.p(strL);
                }
                if (!TextUtils.isEmpty(strOptString)) {
                    AbstractC0280n1.q(strOptString);
                }
                return FishCrypto.b(jSONObject.toString());
            }
        } catch (Exception unused) {
        }
        return FishCrypto.b(str);
    }

    public static String d(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        a(sb, "标题", l(strArr, 1));
        a(sb, "网盘", l(strArr, 3));
        a(sb, "来源", l(strArr, 6));
        String strL = l(strArr, 5);
        a(sb, "时间", (TextUtils.isEmpty(strL) || strL.startsWith("0001-")) ? "" : com.github.catvod.spider.merge.D.b.k(strL, "T", " ", "Z", ""));
        a(sb, "年份", l(strArr, 8));
        a(sb, "提取码", l(strArr, 4));
        a(sb, "链接", l(strArr, 0));
        String strTrim = str != null ? str.trim() : "";
        if (!TextUtils.isEmpty(strTrim)) {
            if (sb.length() > 0) {
                sb.append("\n\n");
            }
            sb.append("详情:\n");
            sb.append(strTrim);
        }
        return sb.toString();
    }

    public static String e(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        String strSubstring = "";
        String strTrim = !TextUtils.isEmpty(str2) ? str2.trim() : "";
        if (!TextUtils.isEmpty(strTrim)) {
            if (sb.length() > 0) {
                sb.append("@");
            }
            sb.append(strTrim);
        }
        if (!TextUtils.isEmpty(str3) && !str3.startsWith("0001-")) {
            int iIndexOf = str3.indexOf(84);
            if (iIndexOf > 0) {
                strSubstring = str3.substring(0, iIndexOf);
            } else {
                if (str3.length() >= 10) {
                    str3 = str3.substring(0, 10);
                }
                strSubstring = str3;
            }
        }
        if (!TextUtils.isEmpty(strSubstring)) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(strSubstring);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x007f  */
    public static com.github.catvod.spider.merge.p001b.k f(String str, String str2, String str3, JSONObject jSONObject) {
        String str4;
        String strGroup;
        String strN = AbstractC0244b1.n(150, jSONObject);
        String strG = AbstractC0244b1.g(jSONObject);
        if (TextUtils.isEmpty(strG)) {
            strG = AbstractC0302v0.j(str);
        }
        String strGroup2 = "";
        String strTrim = jSONObject.optString("url", "").trim();
        String strN2 = AbstractC0244b1.n(150, jSONObject);
        if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strN2)) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", strTrim);
                jSONObject2.put("title", strN2);
                jSONObject2.put("typeKey", str);
                jSONObject2.put("typeName", str2);
                jSONObject2.put("password", h(jSONObject));
                jSONObject2.put("datetime", jSONObject.optString("datetime", ""));
                jSONObject2.put("source", jSONObject.optString("source", ""));
                jSONObject2.put("pic", AbstractC0244b1.g(jSONObject));
                if (TextUtils.isEmpty(strN2)) {
                    strGroup = "";
                } else {
                    Matcher matcher = com.github.catvod.spider.merge.p020x.c.a.matcher(strN2);
                    if (matcher.find()) {
                        strGroup = matcher.group(1);
                    } else {
                        strGroup = "";
                    }
                }
                jSONObject2.put("year", strGroup);
                strTrim = "fishps_detail@@".concat(AbstractC0309x1.c(jSONObject2.toString().getBytes()));
            } catch (Exception unused) {
            }
        }
        ArrayList arrayList = new ArrayList();
        AbstractC0244b1.d(str2, arrayList);
        String strH = AbstractC0244b1.h(jSONObject.optString("datetime", ""), jSONObject.optString("date", ""), jSONObject.optString("time", ""));
        if (AbstractC0244b1.j(strH) || strH.startsWith("0001-")) {
            strH = "";
        } else {
            Matcher matcher2 = AbstractC0244b1.b.matcher(strH);
            if (matcher2.find()) {
                StringBuilder sb = new StringBuilder();
                sb.append(matcher2.group(1));
                sb.append("-");
                String strGroup3 = matcher2.group(2);
                if (strGroup3 != null && strGroup3.length() == 1) {
                    strGroup3 = "0".concat(strGroup3);
                }
                sb.append(strGroup3);
                sb.append("-");
                String strGroup4 = matcher2.group(3);
                if (strGroup4 != null && strGroup4.length() == 1) {
                    strGroup4 = "0".concat(strGroup4);
                }
                sb.append(strGroup4);
                strH = sb.toString();
            } else if (strH.length() > 10) {
                strH = strH.substring(0, 10);
            }
        }
        AbstractC0244b1.d(strH, arrayList);
        String strM = AbstractC0244b1.m(jSONObject);
        if (strM == null) {
            strM = "";
        }
        Matcher matcher3 = AbstractC0244b1.a.matcher(strM);
        if (matcher3.find()) {
            String upperCase = matcher3.group(2).toUpperCase(Locale.ROOT);
            if ("T".equals(upperCase)) {
                upperCase = "TB";
            }
            if ("G".equals(upperCase)) {
                upperCase = "GB";
            }
            if ("M".equals(upperCase)) {
                upperCase = "MB";
            }
            if ("K".equals(upperCase)) {
                upperCase = "KB";
            }
            str4 = matcher3.group(1) + upperCase;
        } else {
            str4 = "";
        }
        AbstractC0244b1.d(str4, arrayList);
        String strM2 = AbstractC0244b1.m(jSONObject);
        String lowerCase = strM2.toLowerCase(Locale.ROOT);
        ArrayList arrayList2 = new ArrayList();
        if (strM2.contains("杜比") || lowerCase.contains("dolby") || lowerCase.contains("dovi")) {
            AbstractC0244b1.d("杜比", arrayList2);
        }
        if (AbstractC0244b1.c.matcher(lowerCase).find()) {
            AbstractC0244b1.d("DV", arrayList2);
        }
        if (strM2.contains("高码") || lowerCase.contains("high bitrate") || lowerCase.contains("hbr") || lowerCase.contains("hq")) {
            AbstractC0244b1.d("高码", arrayList2);
        }
        if (lowerCase.contains("4k") || lowerCase.contains("2160p") || lowerCase.contains("2160") || lowerCase.contains("uhd")) {
            AbstractC0244b1.d("4K", arrayList2);
        }
        if (lowerCase.contains("hdr10+")) {
            AbstractC0244b1.d("HDR10+", arrayList2);
        } else if (lowerCase.contains("hdr10")) {
            AbstractC0244b1.d("HDR10", arrayList2);
        } else if (AbstractC0244b1.d.matcher(lowerCase).find()) {
            AbstractC0244b1.d("HDR", arrayList2);
        }
        if (strM2.contains("原盘")) {
            AbstractC0244b1.d("原盘", arrayList2);
        }
        if (lowerCase.contains("remux")) {
            AbstractC0244b1.d("REMUX", arrayList2);
        }
        if (lowerCase.contains("60fps") || strM2.contains("60帧")) {
            AbstractC0244b1.d("60FPS", arrayList2);
        }
        if (lowerCase.contains("1080p") || lowerCase.contains("1080")) {
            AbstractC0244b1.d("1080P", arrayList2);
        }
        if (lowerCase.contains("web-dl") || lowerCase.contains("webdl")) {
            AbstractC0244b1.d("WEB-DL", arrayList2);
        }
        AbstractC0244b1.d(arrayList2.isEmpty() ? "" : AbstractC0244b1.k("/", arrayList2), arrayList);
        String strOptString = jSONObject.optString("source", "");
        if (AbstractC0244b1.j(strOptString)) {
            strOptString = str3;
        }
        AbstractC0244b1.d(AbstractC0244b1.j(strOptString) ? "" : com.github.catvod.spider.merge.D.b.k(strOptString.replace("plugin:", ""), "tg:", "", "channel:", ""), arrayList);
        com.github.catvod.spider.merge.p001b.k kVar = new com.github.catvod.spider.merge.p001b.k(strTrim, strN, strG, AbstractC0244b1.k(" · ", arrayList));
        kVar.i(str2);
        if (!TextUtils.isEmpty(strN)) {
            Matcher matcher4 = com.github.catvod.spider.merge.p020x.c.a.matcher(strN);
            if (matcher4.find()) {
                strGroup2 = matcher4.group(1);
            }
        }
        if (!TextUtils.isEmpty(strGroup2)) {
            kVar.u(strGroup2);
        }
        return kVar;
    }

    public static String g(String[] strArr) {
        return strArr.length > 0 ? strArr[0] : "";
    }

    public static String h(JSONObject jSONObject) {
        String str;
        String strTrim = jSONObject.optString("password", "").trim();
        if (!TextUtils.isEmpty(strTrim)) {
            return strTrim;
        }
        String strOptString = jSONObject.optString("url", "");
        if (TextUtils.isEmpty(strOptString)) {
            return "";
        }
        String lowerCase = strOptString.toLowerCase();
        String[] strArr = {"pwd=", "password=", "passcode="};
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                str = "";
                break;
            }
            String str2 = strArr[i2];
            int iIndexOf = lowerCase.indexOf(str2);
            if (iIndexOf >= 0) {
                str = str2;
                i = iIndexOf;
                break;
            }
            i2++;
            i = iIndexOf;
        }
        if (i < 0) {
            return "";
        }
        String strSubstring = strOptString.substring(str.length() + i);
        int length = strSubstring.length();
        int iIndexOf2 = strSubstring.indexOf(38);
        int iIndexOf3 = strSubstring.indexOf(35);
        if (iIndexOf2 >= 0) {
            length = Math.min(length, iIndexOf2);
        }
        if (iIndexOf3 >= 0) {
            length = Math.min(length, iIndexOf3);
        }
        return strSubstring.substring(0, length).trim();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    public static String i(String str, String[] strArr) throws Throwable {
        String str2;
        com.github.catvod.spider.merge.p001b.k kVarA = AbstractC0449a.a(str);
        String strL = l(strArr, 1);
        String strL2 = l(strArr, 7);
        if (TextUtils.isEmpty(strL)) {
            strL = "不支持的网盘类型";
        }
        kVarA.o(strL);
        if (TextUtils.isEmpty(strL2)) {
            kVarA.p(AbstractC0302v0.j(l(strArr, 2)));
        }
        if ("guangya".equals(l(strArr, 2))) {
            str2 = "当前仅支持复制链接到光鸭云盘APP打开，暂不支持在线播放";
        } else {
            String strL3 = l(strArr, 0);
            if (TextUtils.isEmpty(strL3) || !strL3.toLowerCase().contains("guangyapan.com/")) {
                str2 = "请复制链接到对应APP打开";
            } else {
                str2 = "当前仅支持复制链接到光鸭云盘APP打开，暂不支持在线播放";
            }
        }
        b(kVarA, strArr, str2);
        boolean z = FishCrypto.a;
        N1.d(kVarA);
        return com.github.catvod.spider.merge.p001b.g.s(kVarA);
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("list");
            return jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String[] k(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("fishps_detail@@")) {
            return new String[]{str, "", "", "", "", "", "", "", ""};
        }
        try {
            JSONObject jSONObject = new JSONObject(AbstractC0309x1.b(str.substring(15)));
            String strOptString = jSONObject.optString("url", str);
            return new String[]{TextUtils.isEmpty(strOptString) ? str : strOptString, jSONObject.optString("title", ""), jSONObject.optString("typeKey", ""), jSONObject.optString("typeName", ""), jSONObject.optString("password", ""), jSONObject.optString("datetime", ""), jSONObject.optString("source", ""), jSONObject.optString("pic", ""), jSONObject.optString("year", "")};
        } catch (Exception unused) {
            return new String[]{str, "", "", "", "", "", "", "", ""};
        }
    }

    public static String l(String[] strArr, int i) {
        String str;
        return (strArr == null || strArr.length <= i || (str = strArr[i]) == null) ? "" : str;
    }
}
