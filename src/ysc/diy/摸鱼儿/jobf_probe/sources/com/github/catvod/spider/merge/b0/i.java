package com.github.catvod.spider.merge.b0;

import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class i extends j {
    public Pattern a;

    @Override // com.github.catvod.spider.merge.b0.j
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.b0.j
    public final boolean b(n nVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        Matcher matcher = this.a.matcher(str.substring(parsePosition.getIndex()));
        if (!matcher.lookingAt()) {
            parsePosition.setErrorIndex(parsePosition.getIndex());
            return false;
        }
        parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
        c(calendar, matcher.group(1));
        return true;
    }

    public abstract void c(Calendar calendar, String str);

    public String toString() {
        return getClass().getSimpleName() + " [pattern=" + this.a + "]";
    }
}
