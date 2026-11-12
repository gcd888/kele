package com.github.catvod.spider.merge.G;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class f extends l {
    public static String g(Iterable iterable, String str, String str2, String str3, com.github.catvod.spider.merge.K.a aVar, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            aVar = null;
        }
        com.github.catvod.spider.merge.L.a.d(iterable, "<this>");
        com.github.catvod.spider.merge.L.a.d(str2, "prefix");
        com.github.catvod.spider.merge.L.a.d(str3, "postfix");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (aVar != null) {
                sb.append((CharSequence) aVar.d(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) String.valueOf(next));
                }
            }
        }
        sb.append((CharSequence) str3);
        String string = sb.toString();
        com.github.catvod.spider.merge.L.a.c(string, "toString(...)");
        return string;
    }

    public static List h(Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return n.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return g.b(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
    }

    public static Set i(List list) {
        p pVar = p.a;
        int size = list.size();
        if (size == 0) {
            return pVar;
        }
        if (size == 1) {
            Set setSingleton = Collections.singleton(list.get(0));
            com.github.catvod.spider.merge.L.a.c(setSingleton, "singleton(...)");
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(q.a(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
