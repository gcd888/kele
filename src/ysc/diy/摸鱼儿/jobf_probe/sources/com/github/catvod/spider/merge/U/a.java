package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.p000a.Y;
import com.github.catvod.spider.merge.p020x.f;
import java.io.File;
import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((d) obj).a - ((d) obj2).a;
            case 1:
                Y y = (Y) obj;
                Y y2 = (Y) obj2;
                int iCompareToIgnoreCase = y.d.compareToIgnoreCase(y2.d);
                if (iCompareToIgnoreCase != 0) {
                    return iCompareToIgnoreCase;
                }
                int iCompareToIgnoreCase2 = y.f.compareToIgnoreCase(y2.f);
                return iCompareToIgnoreCase2 != 0 ? iCompareToIgnoreCase2 : y.c.compareToIgnoreCase(y2.c);
            case 2:
                return f.A((JSONObject) obj) - f.A((JSONObject) obj2);
            case 3:
                File file = (File) obj;
                File file2 = (File) obj2;
                if (file.isDirectory() && !file2.isDirectory()) {
                    return -1;
                }
                if (file.isDirectory() || !file2.isDirectory()) {
                    return com.github.catvod.spider.merge.p021y.f.d(file.getName(), file2.getName());
                }
                return 1;
            default:
                com.github.catvod.spider.merge.p021y.c cVar = (com.github.catvod.spider.merge.p021y.c) obj;
                com.github.catvod.spider.merge.p021y.c cVar2 = (com.github.catvod.spider.merge.p021y.c) obj2;
                boolean z = cVar.d;
                if (z && !cVar2.d) {
                    return -1;
                }
                if (z || !cVar2.d) {
                    return com.github.catvod.spider.merge.p021y.f.d(cVar.b, cVar2.b);
                }
                return 1;
        }
    }
}
