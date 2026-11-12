package com.github.catvod.spider.merge.p000a;

import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class Y {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public boolean h;

    public Y() {
    }

    public static Y a(JSONObject jSONObject) {
        Y y = new Y();
        y.a = jSONObject.optString("shareId");
        y.b = jSONObject.optString("accessToken");
        y.c = jSONObject.optString("fileId");
        y.d = jSONObject.optString("name");
        y.e = jSONObject.optString("md5");
        y.f = jSONObject.optString("path");
        y.g = jSONObject.optLong("size");
        y.h = jSONObject.optBoolean("folder");
        return y;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shareId", this.a);
            jSONObject.put("accessToken", this.b);
            jSONObject.put("fileId", this.c);
            jSONObject.put("name", this.d);
            jSONObject.put("md5", this.e);
            jSONObject.put("path", this.f);
            jSONObject.put("size", this.g);
            jSONObject.put("folder", this.h);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public Y(int i) {
    }
}
