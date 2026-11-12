package com.github.catvod.spider.merge.p004e;

import com.thegrizzlylabs.sardineandroid.DavResource;
import java.util.Comparator;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class f implements Comparator {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public /* synthetic */ f(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompareTo;
        long jD;
        long jD2;
        int iCompareTo2;
        long jLongValue;
        Long contentLength;
        byte b = 2;
        String str = this.b;
        String str2 = this.c;
        switch (this.a) {
            case 0:
                c cVar = (c) obj;
                c cVar2 = (c) obj2;
                boolean zEquals = str2.equals("asc");
                str.getClass();
                switch (str.hashCode()) {
                    case 3076014:
                        if (!str.equals("date")) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case 3373707:
                        if (!str.equals("name")) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 3530753:
                        if (!str.equals("size")) {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        iCompareTo = !zEquals ? cVar2.b().compareTo(cVar.b()) : cVar.b().compareTo(cVar2.b());
                        break;
                    case 1:
                        iCompareTo = !zEquals ? cVar2.c().compareTo(cVar.c()) : cVar.c().compareTo(cVar2.c());
                        break;
                    case 2:
                        if (zEquals) {
                            jD = cVar.d();
                            jD2 = cVar2.d();
                        } else {
                            jD = cVar2.d();
                            jD2 = cVar.d();
                        }
                        iCompareTo = Long.compare(jD, jD2);
                        break;
                    default:
                        return -1;
                }
                return iCompareTo;
            default:
                DavResource davResource = (DavResource) obj;
                DavResource davResource2 = (DavResource) obj2;
                boolean zEquals2 = str2.equals("asc");
                str.getClass();
                switch (str.hashCode()) {
                    case 3076014:
                        if (!str.equals("date")) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case 3373707:
                        if (!str.equals("name")) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 3530753:
                        if (!str.equals("size")) {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        iCompareTo2 = !zEquals2 ? davResource2.getModified().compareTo(davResource.getModified()) : davResource.getModified().compareTo(davResource2.getModified());
                        break;
                    case 1:
                        iCompareTo2 = !zEquals2 ? davResource2.getName().compareTo(davResource.getName()) : davResource.getName().compareTo(davResource2.getName());
                        break;
                    case 2:
                        if (zEquals2) {
                            jLongValue = davResource.getContentLength().longValue();
                            contentLength = davResource2.getContentLength();
                        } else {
                            jLongValue = davResource2.getContentLength().longValue();
                            contentLength = davResource.getContentLength();
                        }
                        iCompareTo2 = Long.compare(jLongValue, contentLength.longValue());
                        break;
                    default:
                        return -1;
                }
                return iCompareTo2;
        }
    }
}
