package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.b0.AbstractC0392a;
import com.github.catvod.spider.merge.f0.k;
import com.github.catvod.spider.merge.h0.d;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class b implements Comparable {
    public Object a;
    public boolean b = false;
    public boolean c = false;

    public b(Object obj) {
        this.a = obj;
    }

    public final Boolean a() {
        Object obj = this.a;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return Boolean.valueOf((obj == null || com.github.catvod.spider.merge.Y.c.b(e())) ? false : true);
    }

    public final Date b() {
        Object obj = this.a;
        if (obj instanceof String) {
            try {
                return AbstractC0392a.a.b((String) obj);
            } catch (ParseException unused) {
                throw new com.github.catvod.spider.merge.c0.a("cast to date fail. vale = " + this.a);
            }
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        throw new com.github.catvod.spider.merge.c0.a("cast to date fail. vale = " + this.a);
    }

    public final Double c() {
        Object obj = this.a;
        if (obj instanceof String) {
            return Double.valueOf(new BigDecimal((String) this.a).doubleValue());
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        throw new com.github.catvod.spider.merge.c0.a("cast to number fail. vale = " + this.a);
    }

    public final Long d() {
        Object obj = this.a;
        if (obj instanceof String) {
            return Long.valueOf(new BigDecimal((String) this.a).setScale(0, 4).longValue());
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        throw new com.github.catvod.spider.merge.c0.a("cast to number fail. vale = " + this.a);
    }

    public final String e() {
        Object obj = this.a;
        if (obj instanceof d) {
            StringBuilder sb = new StringBuilder();
            Iterator<E> it = ((d) this.a).iterator();
            while (it.hasNext()) {
                sb.append(((k) it.next()).N());
            }
            return sb.toString();
        }
        if ((obj instanceof k) && Objects.equals(((k) obj).d.a, "JX_TEXT")) {
            return ((k) this.a).N();
        }
        Object obj2 = this.a;
        return obj2 instanceof List ? com.github.catvod.spider.merge.Y.c.f((List) obj2, ",") : String.valueOf(obj2).trim();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((b) obj).a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b bVar) {
        if (equals(bVar)) {
            return 0;
        }
        if (bVar == null || bVar.a == null) {
            return 1;
        }
        Object obj = this.a;
        if (obj == null) {
            return -1;
        }
        if (obj instanceof String) {
            return e().compareTo(bVar.e());
        }
        if (obj instanceof Number) {
            return c().compareTo(bVar.c());
        }
        throw new com.github.catvod.spider.merge.c0.a("Unsupported comparable XValue = " + toString());
    }

    public final void g() {
        this.c = true;
        String strValueOf = String.valueOf(this.a);
        if (!com.github.catvod.spider.merge.Y.c.c(strValueOf) && !com.github.catvod.spider.merge.Y.c.c("'") && strValueOf.startsWith("'")) {
            strValueOf = strValueOf.substring(1);
        }
        if (!com.github.catvod.spider.merge.Y.c.c(strValueOf) && !com.github.catvod.spider.merge.Y.c.c("\"") && strValueOf.startsWith("\"")) {
            strValueOf = strValueOf.substring(1);
        }
        this.a = com.github.catvod.spider.merge.Y.c.g(com.github.catvod.spider.merge.Y.c.g(strValueOf, "'"), "\"");
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        com.github.catvod.spider.merge.Z.a aVar = new com.github.catvod.spider.merge.Z.a(this);
        Object obj = this.a;
        com.github.catvod.spider.merge.Z.b bVar = aVar.c;
        StringBuffer stringBuffer = aVar.a;
        bVar.a(stringBuffer, obj);
        boolean z = this.b;
        bVar.f(stringBuffer, "isAttr");
        stringBuffer.append(z);
        stringBuffer.append(bVar.h);
        boolean z2 = this.c;
        bVar.f(stringBuffer, "isExprStr");
        stringBuffer.append(z2);
        stringBuffer.append(bVar.h);
        return aVar.toString();
    }
}
