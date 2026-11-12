package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.A.InterfaceC0306w1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class W implements InterfaceC0306w1 {
    public final /* synthetic */ Set a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ C0342a0 e;

    public W(C0342a0 c0342a0, HashSet hashSet, String str, long j, String str2) {
        this.e = c0342a0;
        this.a = hashSet;
        this.b = str;
        this.c = j;
        this.d = str2;
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0306w1
    public final List a() throws Exception {
        Set set = this.a;
        if (set != null) {
            return new ArrayList(set);
        }
        throw new Exception("光鸭清理缺少完整快照");
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0306w1
    public final boolean b(ArrayList arrayList) {
        String str = this.b;
        long j = this.c;
        C0342a0 c0342a0 = this.e;
        if (!c0342a0.E(j, str)) {
            return false;
        }
        if (!this.d.equals(c0342a0.u)) {
            return false;
        }
        c0342a0.m(arrayList);
        return true;
    }
}
