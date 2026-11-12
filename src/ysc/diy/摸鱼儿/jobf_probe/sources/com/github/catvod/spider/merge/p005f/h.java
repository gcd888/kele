package com.github.catvod.spider.merge.p005f;

import android.text.TextUtils;
import com.github.catvod.spider.merge.p017u.RunnableC0453e;
import com.google.gson.JsonObject;
import java.util.ArrayList;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class h {
    public static final String[] c = {"番剧", "国创", "电影", "电视剧", "纪录片", "综艺"};
    public static final String[] d = {"1", "4", "2", "5", "3", "7"};
    public final Object a;
    public final Object b;

    public h(g gVar, j jVar) {
        this.a = gVar;
        this.b = jVar;
    }

    public static String a(JsonObject jsonObject, String... strArr) {
        if (jsonObject != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && jsonObject.has(str) && !jsonObject.get(str).isJsonNull()) {
                    String asString = jsonObject.get(str).getAsString();
                    if (!TextUtils.isEmpty(asString)) {
                        return asString;
                    }
                }
            }
        }
        return "";
    }

    public h(c cVar, RunnableC0453e runnableC0453e) {
        this.b = cVar;
        this.a = runnableC0453e;
    }

    public h() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
}
