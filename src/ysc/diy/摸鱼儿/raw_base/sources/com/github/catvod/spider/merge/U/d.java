package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.T.C0319d;
import com.github.catvod.spider.merge.T.C0320e;
import com.github.catvod.spider.merge.T.C0339y;
import com.github.catvod.spider.merge.l0.e;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class d {
    public int a = -1;
    public C0320e b;
    public d[] c;
    public boolean d;
    public int e;
    public C0339y f;
    public boolean g;
    public c[] h;

    public d(C0320e c0320e) {
        new ArrayList(7);
        new C0319d(0);
        this.d = false;
        this.b = c0320e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.b.equals(((d) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return e.a(e.b(7, this.b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(":");
        sb.append(this.b);
        if (this.d) {
            sb.append("=>");
            c[] cVarArr = this.h;
            if (cVarArr != null) {
                sb.append(Arrays.toString(cVarArr));
            } else {
                sb.append(this.e);
            }
        }
        return sb.toString();
    }
}
