package com.github.catvod.spider.merge.p022z;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0485c1 implements InterfaceC0578v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ List c;
    public final /* synthetic */ String d;

    public /* synthetic */ C0485c1(boolean[] zArr, ArrayList arrayList, String str, int i) {
        this.a = i;
        this.b = zArr;
        this.c = arrayList;
        this.d = str;
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0578v0
    public final void g(int i, boolean z) {
        switch (this.a) {
            case 0:
                this.b[i] = z;
                String str = this.d;
                List list = this.c;
                if (z) {
                    list.remove(str);
                } else if (!list.contains(str)) {
                    list.add(str);
                }
                break;
            default:
                this.b[i] = z;
                String str2 = this.d;
                List list2 = this.c;
                if (z) {
                    list2.remove(str2);
                } else if (!list2.contains(str2)) {
                    list2.add(str2);
                }
                break;
        }
    }
}
