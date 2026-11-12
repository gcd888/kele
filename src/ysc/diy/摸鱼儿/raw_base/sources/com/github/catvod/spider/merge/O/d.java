package com.github.catvod.spider.merge.O;

import com.github.catvod.spider.merge.A.C0261h0;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class d extends com.github.catvod.spider.merge.G.e {
    public final /* synthetic */ C0261h0 a;

    public d(C0261h0 c0261h0) {
        this.a = c0261h0;
    }

    @Override // com.github.catvod.spider.merge.G.e
    public final int a() {
        return ((Matcher) this.a.b).groupCount() + 1;
    }

    @Override // com.github.catvod.spider.merge.G.e, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = ((Matcher) this.a.b).group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // com.github.catvod.spider.merge.G.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // com.github.catvod.spider.merge.G.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
