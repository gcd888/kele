package com.github.catvod.spider.merge.p005f;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class x {

    @SerializedName("code")
    private Integer a;

    @SerializedName("message")
    private String b;

    @SerializedName("data")
    private p c;

    public static x c(String str) {
        return (x) new Gson().fromJson(str, x.class);
    }

    public final int a() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final p b() {
        p pVar = this.c;
        return pVar == null ? new p() : pVar;
    }
}
