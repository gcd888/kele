package com.github.catvod.spider.merge.b0;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.b0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0396e extends i {
    public final int b;
    public final Locale c;
    public final HashMap d;

    public C0396e(int i, Calendar calendar, Locale locale) {
        this.b = i;
        this.c = com.github.catvod.spider.merge.Y.b.a(locale);
        StringBuilder sbO = com.github.catvod.spider.merge.D.b.o("((?iu)");
        HashMap map = new HashMap();
        Locale localeA = com.github.catvod.spider.merge.Y.b.a(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i, 0, localeA);
        TreeSet treeSet = new TreeSet(n.h);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(localeA);
            if (treeSet.add(lowerCase)) {
                map.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            n.c(sbO, (String) it.next());
            sbO.append('|');
        }
        this.d = map;
        sbO.setLength(sbO.length() - 1);
        sbO.append(")");
        this.a = Pattern.compile(sbO.toString());
    }

    @Override // com.github.catvod.spider.merge.b0.i
    public final void c(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.c);
        HashMap map = this.d;
        Integer num = (Integer) map.get(lowerCase);
        if (num == null) {
            num = (Integer) map.get(lowerCase + '.');
        }
        calendar.set(this.b, num.intValue());
    }

    @Override // com.github.catvod.spider.merge.b0.i
    public final String toString() {
        return "CaseInsensitiveTextStrategy [field=" + this.b + ", locale=" + this.c + ", lKeyValues=" + this.d + ", pattern=" + this.a + "]";
    }
}
