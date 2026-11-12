package com.github.catvod.spider.merge.A;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0312y1 {
    public static final Gson a = new Gson();

    public static JSONArray a(Object obj) {
        try {
            if (obj == null) {
                return new JSONArray();
            }
            String json = a.toJson(obj);
            return json.startsWith("[") ? new JSONArray(json) : new JSONArray().put(new JSONObject(json));
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    public static JSONObject b(Object obj) {
        try {
            return obj == null ? new JSONObject() : new JSONObject(a.toJson(obj));
        } catch (Exception unused) {
            return new JSONObject();
        }
    }
}
