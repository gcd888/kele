package com.github.catvod.spider.merge.p018v;

import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class d {
    public String a;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public boolean b = true;
    public volatile boolean c = false;
    public volatile HashSet d = new HashSet();
    public volatile boolean e = false;
    public final HashMap k = new HashMap();
    public final HashMap l = new HashMap();

    public final void a(String str, JSONArray jSONArray, long j) {
        synchronized (this.k) {
            this.k.put(str, jSONArray);
            this.l.put(str, Long.valueOf(j));
        }
    }
}
