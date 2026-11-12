package com.github.catvod.spider.merge.p012n;

import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.google.gson.JsonObject;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class b {
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public Double e = Double.valueOf(0.0d);

    public static b c(JsonObject jsonObject, String str, String str2) {
        b bVar = new b();
        bVar.a = jsonObject.get("id") != null ? jsonObject.get("id").getAsString() : "";
        bVar.b = str;
        if (str2 == null) {
            str2 = "";
        }
        bVar.c = str2;
        bVar.d = jsonObject.get("name") != null ? jsonObject.get("name").getAsString() : "";
        bVar.e = Double.valueOf(jsonObject.get("size") != null ? jsonObject.get("size").getAsDouble() : 0.0d);
        return bVar;
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        String strB = b();
        if (str.equals("电视剧")) {
            String[] strArr = {"4k", "4K"};
            StringBuilder sb2 = new StringBuilder("\\.");
            String[] strArrSplit = this.d.split("\\.");
            sb2.append(strArrSplit[strArrSplit.length - 1]);
            strB = strB.replaceAll(sb2.toString(), "");
            for (int i = 0; i < 2; i++) {
                strB = strB.replaceAll(strArr[i], "");
            }
            if (Pattern.compile("/\\.S01E(.*?)\\./").matcher(strB).find()) {
                strB = strB.split("/\\.S01E(.*?)\\./")[1];
            }
            String[] strArrSplit2 = strB.split("\\d+");
            if (strArrSplit2.length > 0) {
                strB = strArrSplit2[0];
            }
        }
        sb.append("[" + AbstractC0309x1.h(this.e.doubleValue()) + "] " + strB);
        sb.append("$");
        sb.append(this.a.isEmpty() ? "" : this.a);
        sb.append("++");
        sb.append(this.b);
        String string = sb.toString();
        String str2 = this.c;
        if (str2 == null || str2.isEmpty()) {
            return string;
        }
        StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(string, "++");
        sbP.append(this.c);
        return sbP.toString();
    }

    public final String b() {
        return this.d.isEmpty() ? "" : this.d;
    }
}
