package com.github.catvod.spider.merge.m0;

import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.N1;
import java.util.ArrayList;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class a {
    public static ArrayList a(com.github.catvod.spider.merge.p020x.b bVar) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.github.catvod.spider.merge.p001b.k("site", "API管理", AbstractC0302v0.F1(), bVar.g(), "site"));
        String strO1 = AbstractC0302v0.O1();
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.o ? "文件夹" : "列表");
        sb.append(" / ");
        int i = bVar.p;
        if (i == 0) {
            str = "关闭";
        } else {
            str = i != 2 ? "本地检测/可靠性极强" : "隐藏失效";
        }
        sb.append(str);
        arrayList.add(new com.github.catvod.spider.merge.p001b.k("strategy", "搜索策略", strO1, sb.toString(), "strategy"));
        String strZ1 = AbstractC0302v0.z1();
        ArrayList arrayList2 = bVar.k;
        boolean zIsEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = bVar.l;
        if (zIsEmpty && arrayList3.isEmpty()) {
            str2 = "无自定义";
        } else {
            str2 = "自定义 TG " + arrayList2.size() + " / 插件 " + arrayList3.size();
        }
        arrayList.add(new com.github.catvod.spider.merge.p001b.k("channels", "频道范围", strZ1, str2, "channels"));
        String strS = AbstractC0302v0.S();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bVar.f.size());
        sb2.append("/");
        arrayList.add(new com.github.catvod.spider.merge.p001b.k("filter", "网盘过滤", strS, com.github.catvod.spider.merge.D.b.l(sb2, com.github.catvod.spider.merge.p020x.c.c.length, "个"), "filter"));
        arrayList.add(new com.github.catvod.spider.merge.p001b.k("order", "网盘排序", AbstractC0302v0.H1(), bVar.k(), "order"));
        arrayList.add(new com.github.catvod.spider.merge.p001b.k("max", "显示数量", AbstractC0302v0.D0(), bVar.n > 0 ? com.github.catvod.spider.merge.D.b.l(new StringBuilder("每类"), bVar.n, "条") : "每类不限制", "max"));
        arrayList.add(new com.github.catvod.spider.merge.p001b.k("keywords", "关键词设置", com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "pansou.jpg"), "包含:" + com.github.catvod.spider.merge.p020x.b.j(bVar.g) + " / 屏蔽:" + com.github.catvod.spider.merge.p020x.b.j(bVar.h), "keywords"));
        arrayList.add(new com.github.catvod.spider.merge.p001b.k("help", "使用帮助", AbstractC0302v0.a0(), "功能说明与教程", "help"));
        arrayList.add(new com.github.catvod.spider.merge.p001b.k("reset", "恢复默认", AbstractC0302v0.v1(), "", "reset"));
        return arrayList;
    }
}
