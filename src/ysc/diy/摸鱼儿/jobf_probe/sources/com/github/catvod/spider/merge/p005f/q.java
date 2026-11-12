package com.github.catvod.spider.merge.p005f;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class q {

    @SerializedName("current_level")
    private Integer a;

    @SerializedName("current_min")
    private Integer b;

    @SerializedName("current_exp")
    private Integer c;

    @SerializedName("next_exp")
    private String d;

    public final int a() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
