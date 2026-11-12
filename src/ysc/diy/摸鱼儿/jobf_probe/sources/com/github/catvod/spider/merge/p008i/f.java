package com.github.catvod.spider.merge.p008i;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class f {

    @SerializedName("data")
    private List<d> a;

    public static f b(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty() && str.trim().startsWith("{")) {
                    return (f) new Gson().fromJson(str, f.class);
                }
            } catch (Exception unused) {
                return new f();
            }
        }
        return new f();
    }

    public final List a() {
        List<d> list = this.a;
        return list == null ? Collections.emptyList() : list;
    }
}
