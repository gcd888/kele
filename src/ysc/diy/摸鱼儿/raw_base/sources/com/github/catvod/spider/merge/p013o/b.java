package com.github.catvod.spider.merge.p013o;

import com.github.catvod.spider.merge.A.AbstractC0309x1;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class b {
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public Double f = Double.valueOf(0.0d);
    public String g = "";
    public int h = 0;

    public static b e(String str, Map map) {
        String string;
        b bVar = new b();
        bVar.a = map.get("fid") != null ? (String) map.get("fid") : "";
        bVar.b = str;
        bVar.c = map.get("stoken") != null ? (String) map.get("stoken") : "";
        String[] strArr = {"share_fid_token", "fid_token", "file_token", "share_file_token", "obj_token"};
        int i = 0;
        while (true) {
            if (i >= 5) {
                string = "";
                break;
            }
            Object obj = map.get(strArr[i]);
            if (obj != null && !obj.toString().isEmpty()) {
                string = obj.toString();
                break;
            }
            i++;
        }
        bVar.d = string;
        if (map.get("series_id") != null) {
        }
        String strReplace = map.get("file_name") != null ? (String) map.get("file_name") : "";
        if (strReplace != null && !strReplace.isEmpty()) {
            strReplace = strReplace.replace("&#39;", "'").replace("&#34;", "\"").replace("&#38;", "&").replace("&#60;", "<").replace("&#62;", ">").replace("&apos;", "'").replace("&quot;", "\"").replace("&amp;", "&").replace("&lt;", "<").replace("&gt;", ">");
        }
        bVar.e = strReplace;
        if (map.get("obj_category") != null) {
        }
        if (map.get("format_type") != null) {
        }
        bVar.f = Double.valueOf(map.get("size") != null ? ((Double) map.get("size")).doubleValue() : 0.0d);
        bVar.g = map.get("pdir_fid") != null ? (String) map.get("pdir_fid") : "";
        if (map.get("last_update_at") != null) {
        }
        bVar.h = 1;
        return bVar;
    }

    public final String a(String str) {
        String str2 = this.g;
        String str3 = (str2 == null || str2.isEmpty()) ? "0" : this.g;
        StringBuilder sb = new StringBuilder();
        String strC = c();
        if (str.equals("电视剧")) {
            String[] strArr = {"4k", "4K"};
            StringBuilder sb2 = new StringBuilder("\\.");
            String[] strArrSplit = this.e.split("\\.");
            sb2.append(strArrSplit[strArrSplit.length - 1]);
            strC = strC.replaceAll(sb2.toString(), "");
            for (int i = 0; i < 2; i++) {
                strC = strC.replaceAll(strArr[i], "");
            }
            if (Pattern.compile("/\\.S01E(.*?)\\./").matcher(strC).find()) {
                strC = strC.split("/\\.S01E(.*?)\\./")[1];
            }
            String[] strArrSplit2 = strC.split("\\d+");
            if (strArrSplit2.length > 0) {
                strC = strArrSplit2[0];
            }
        }
        sb.append("[" + AbstractC0309x1.h(this.f.doubleValue()) + "] " + strC);
        sb.append("$");
        sb.append(b());
        sb.append("++");
        sb.append(this.d);
        sb.append("++");
        sb.append(this.b);
        sb.append("++");
        return com.github.catvod.spider.merge.D.b.n(sb, this.c, "++", str3);
    }

    public final String b() {
        return this.a.isEmpty() ? "" : this.a;
    }

    public final String c() {
        return this.e.isEmpty() ? "" : this.e;
    }

    public final String d() {
        return this.d.isEmpty() ? "" : this.d;
    }
}
