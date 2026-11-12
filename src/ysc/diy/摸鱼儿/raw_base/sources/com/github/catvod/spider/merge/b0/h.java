package com.github.catvod.spider.merge.b0;

import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class h extends j {
    public final int a;

    public h(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.b0.j
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.b0.j
    public final boolean b(n nVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int index = parsePosition.getIndex();
        int length = str.length();
        if (i == 0) {
            while (index < length && Character.isWhitespace(str.charAt(index))) {
                index++;
            }
            parsePosition.setIndex(index);
        } else {
            int i2 = i + index;
            if (length > i2) {
                length = i2;
            }
        }
        while (index < length && Character.isDigit(str.charAt(index))) {
            index++;
        }
        if (parsePosition.getIndex() == index) {
            parsePosition.setErrorIndex(index);
            return false;
        }
        int i3 = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
        parsePosition.setIndex(index);
        calendar.set(this.a, c(nVar, i3));
        return true;
    }

    public int c(n nVar, int i) {
        return i;
    }

    public final String toString() {
        return com.github.catvod.spider.merge.D.b.l(new StringBuilder("NumberStrategy [field="), this.a, "]");
    }
}
