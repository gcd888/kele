package com.github.catvod.spider.merge.p009k;

import java.util.Map;

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

    public static b a(String str, Map map) {
        b bVar = new b();
        bVar.a = map.get("fid") != null ? (String) map.get("fid") : "";
        bVar.b = str;
        bVar.c = map.get("stoken") != null ? (String) map.get("stoken") : "";
        bVar.d = map.get("share_fid_token") != null ? (String) map.get("share_fid_token") : "";
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
}
