package com.github.catvod.spider.merge.b0;

import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class f extends j {
    public final String a;

    public f(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.b0.j
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.b0.j
    public final boolean b(n nVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int i2 = 0;
        while (true) {
            String str2 = this.a;
            if (i2 >= str2.length()) {
                parsePosition.setIndex(parsePosition.getIndex() + str2.length());
                return true;
            }
            int index = parsePosition.getIndex() + i2;
            if (index == str.length()) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            if (str2.charAt(i2) != str.charAt(index)) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            i2++;
        }
    }

    public final String toString() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder("CopyQuotedStrategy [formatField="), this.a, "]");
    }
}
