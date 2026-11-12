package com.github.catvod.spider.merge.C;

import java.io.Serializable;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a implements Serializable {
    public final String a;
    public final String b;
    public final String c;

    public a(String str, String str2) {
        this(str, str2, "");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b.equals(aVar.b) && this.a.equals(aVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        boolean zEquals = str.equals("");
        String str2 = this.b;
        if (zEquals) {
            return str2;
        }
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append(str);
        stringBuffer.append("}");
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    public a(String str, String str2, String str3) {
        if (str2 == null) {
            throw new IllegalArgumentException("Local part not allowed to be null");
        }
        str = str == null ? "" : str;
        str3 = str3 == null ? "" : str3;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
