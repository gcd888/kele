package com.github.catvod.spider.merge.p003d;

import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class i {

    @SerializedName("quick_video_list")
    private List<j> a;

    @SerializedName("live_transcoding_task_list")
    private List<j> b;

    @SerializedName("live_transcoding_subtitle_task_list")
    private List<j> c;

    public final List a() {
        List<j> list = this.c;
        return list == null ? Collections.emptyList() : list;
    }

    public final List b() {
        List<j> list = this.a;
        if (list != null && !list.isEmpty()) {
            return this.a;
        }
        List<j> list2 = this.b;
        return list2 == null ? Collections.emptyList() : list2;
    }
}
