package com.github.catvod.spider.merge.p018v;

import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.p001b.k;
import java.net.URLEncoder;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class b {
    public static final String[][] a = {new String[]{"huya", "虎牙"}, new String[]{"douyu", "斗鱼"}, new String[]{"douyin", "抖音"}, new String[]{"kuaishou", "快手"}, new String[]{"bilibili", "哔哩"}};

    public static JSONObject a(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vod_id", str);
            jSONObject.put("vod_name", str2);
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("vod_pic", str4);
            jSONObject.put("vod_remarks", str3);
            jSONObject.put("action", str);
            return jSONObject;
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static k b(int i, String str, String str2, String str3) {
        String str4;
        if (i > 0) {
            str4 = i + " 个分类";
        } else {
            str4 = "分类";
        }
        k kVar = new k("_catp_" + str + "_" + str2, str3, AbstractC0302v0.x0(str), str4, true);
        kVar.i(g(str));
        return kVar;
    }

    public static k c(String str) {
        k kVar = new k();
        kVar.n(str);
        kVar.o("请在分类页打开");
        kVar.p(AbstractC0302v0.H1());
        kVar.s("返回列表后进入该分类");
        kVar.q("提示");
        kVar.r("请在分类页打开$" + str);
        return kVar;
    }

    public static k d(String str, String str2, String str3, String str4, String str5) {
        if (str4 == null || str4.isEmpty()) {
            str4 = "分类";
        }
        String str6 = str4;
        StringBuilder sbR = com.github.catvod.spider.merge.D.b.r("_cat_", str, "_", str2, "_");
        sbR.append(str3);
        k kVar = new k(sbR.toString(), str5, AbstractC0302v0.x0(str), str6, true);
        kVar.i(g(str));
        return kVar;
    }

    public static String e(String str) {
        return (str == null || str.isEmpty()) ? "" : str.replaceAll("[\\r\\n\\t]+", " ").replaceAll("\\s{2,}", " ").trim();
    }

    public static String f(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return str;
        }
    }

    public static String g(String str) {
        String[][] strArr = a;
        for (int i = 0; i < 5; i++) {
            String[] strArr2 = strArr[i];
            if (strArr2[0].equals(str)) {
                return strArr2[1];
            }
        }
        return str;
    }

    public static String h(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.startsWith("//")) {
            strTrim = "https:".concat(strTrim);
        }
        return HttpUrl.parse(strTrim) == null ? "" : strTrim;
    }

    public static boolean i(String str) {
        String[][] strArr = a;
        for (int i = 0; i < 5; i++) {
            if (strArr[i][0].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String[] j(String str) {
        if (str != null && !str.isEmpty()) {
            String[] strArrSplit = str.split("\\|", -1);
            int i = 0;
            if (strArrSplit.length == 5 && "alllive".equals(strArrSplit[0])) {
                i = 1;
            } else if (strArrSplit.length == 4) {
            }
            if (!strArrSplit[i].isEmpty()) {
                int i2 = i + 1;
                if (!strArrSplit[i2].isEmpty()) {
                    int i3 = i + 2;
                    if (!strArrSplit[i3].isEmpty()) {
                        int i4 = i + 3;
                        if (!strArrSplit[i4].isEmpty()) {
                            try {
                                int i5 = Integer.parseInt(strArrSplit[i3]);
                                int i6 = Integer.parseInt(strArrSplit[i4]);
                                if (i5 >= 0 && i6 >= 0) {
                                    return new String[]{strArrSplit[i], strArrSplit[i2], strArrSplit[i3], strArrSplit[i4]};
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String k(JSONObject jSONObject) {
        String[] strArr = {"cover", "user_avatar"};
        for (int i = 0; i < 2; i++) {
            String strH = h(jSONObject.optString(strArr[i], ""));
            if (!strH.isEmpty()) {
                return strH;
            }
        }
        return "";
    }

    public static k l(String str, JSONObject jSONObject) {
        String strValueOf;
        String strOptString = jSONObject.optString("room_id", "");
        String strOptString2 = jSONObject.optString("title", "直播间");
        String strK = k(jSONObject);
        if (strK.isEmpty()) {
            strK = AbstractC0302v0.x0(str);
        }
        String strOptString3 = jSONObject.optString("user_name", "");
        int iOptInt = jSONObject.optInt("online", 0);
        String strC = com.github.catvod.spider.merge.D.b.C(str, "_", strOptString);
        String strG = g(str);
        if (strOptString3.isEmpty()) {
            strOptString3 = strOptString2;
        }
        String strC2 = com.github.catvod.spider.merge.D.b.C(strG, ":", strOptString3);
        StringBuilder sb = new StringBuilder();
        if (iOptInt >= 10000) {
            double d = iOptInt;
            Double.isNaN(d);
            strValueOf = String.format("%.1f万", Double.valueOf(d / 10000.0d));
        } else {
            strValueOf = String.valueOf(iOptInt);
        }
        sb.append(strValueOf);
        sb.append("人 · ");
        sb.append(e(strOptString2));
        return new k(strC, strC2, strK, sb.toString());
    }
}
