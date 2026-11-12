package com.github.catvod.spider.merge.p005f;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class c {
    public static final String[] e = {"电影", "电视剧", "动漫", "综艺", "纪录片"};
    public int a = 1;
    public boolean b = false;
    public boolean c = false;
    public final ArrayList d = new ArrayList();

    public final void a(JsonObject jsonObject) {
        jsonObject.addProperty("viewMode", Integer.valueOf(this.a));
        jsonObject.addProperty("lowEndMode", Boolean.valueOf(this.b));
        jsonObject.addProperty("historySyncEnabled", Boolean.valueOf(this.c));
        JsonArray jsonArray = new JsonArray();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            jsonArray.add((String) it.next());
        }
        jsonObject.add("categories", jsonArray);
    }
}
