package com.github.catvod.spider.merge.p021y;

import com.github.catvod.spider.merge.p000a.C0349e;
import com.github.catvod.spider.merge.p003d.g;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class d implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long jA;
        long jA2;
        switch (this.a) {
            case 0:
                File file = (File) obj;
                File file2 = (File) obj2;
                if (file.isDirectory() && !file2.isDirectory()) {
                    return -1;
                }
                if (!file.isDirectory() && file2.isDirectory()) {
                    return 1;
                }
                String str = (String) this.b;
                if (!"size_desc".equals(str) && !"size_asc".equals(str)) {
                    if ("date_desc".equals(str)) {
                        return Long.compare(file2.lastModified(), file.lastModified());
                    }
                    if ("date_asc".equals(str)) {
                        return Long.compare(file.lastModified(), file2.lastModified());
                    }
                    int iD = f.d(file.getName(), file2.getName());
                    return "name_desc".equals(str) ? -iD : iD;
                }
                if ("size_desc".equals(str)) {
                    jA = b.A(file2);
                    jA2 = b.A(file);
                } else {
                    jA = b.A(file);
                    jA2 = b.A(file2);
                }
                int iCompare = Long.compare(jA, jA2);
                return iCompare != 0 ? iCompare : f.d(file.getName(), file2.getName());
            case 1:
                c cVar = (c) obj;
                c cVar2 = (c) obj2;
                boolean z = cVar.d;
                if (z && !cVar2.d) {
                    return -1;
                }
                if (!z && cVar2.d) {
                    return 1;
                }
                String str2 = (String) this.b;
                boolean zEquals = "size_desc".equals(str2);
                String str3 = cVar.b;
                if (zEquals || "size_asc".equals(str2)) {
                    boolean zEquals2 = "size_desc".equals(str2);
                    long j = cVar.e;
                    long j2 = cVar2.e;
                    int iCompare2 = zEquals2 ? Long.compare(j2, j) : Long.compare(j, j2);
                    return iCompare2 != 0 ? iCompare2 : f.d(str3, cVar2.b);
                }
                if ("date_desc".equals(str2)) {
                    return b.c(cVar2).compareTo(b.c(cVar));
                }
                if ("date_asc".equals(str2)) {
                    return b.c(cVar).compareTo(b.c(cVar2));
                }
                int iD2 = f.d(str3, cVar2.b);
                return "name_desc".equals(str2) ? -iD2 : iD2;
            default:
                return C0349e.b((C0349e) this.b, (g) obj, (g) obj2);
        }
    }
}
