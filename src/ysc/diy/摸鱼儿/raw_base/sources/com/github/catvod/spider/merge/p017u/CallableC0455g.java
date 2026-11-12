package com.github.catvod.spider.merge.p017u;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.SeedHub;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class CallableC0455g implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Spider b;
    public final /* synthetic */ Object c;

    public /* synthetic */ CallableC0455g(Spider spider, Object obj, int i) {
        this.a = i;
        this.b = spider;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((Bili) this.b).a == ((JsonObject) this.c));
            default:
                String str = (String) this.c;
                HashMap map = SeedHub.v;
                SeedHub seedHub = (SeedHub) this.b;
                seedHub.getClass();
                try {
                    Matcher matcher = Pattern.compile("Link\\s*=\\s*[\"']([^\"']+)[\"']").matcher(seedHub.s.a("/link_start/?redirect_to=pan_id_" + str + "&movie_title=pan", seedHub.j()));
                    if (matcher.find()) {
                        return matcher.group(1);
                    }
                } catch (Exception unused) {
                }
                return null;
        }
    }
}
