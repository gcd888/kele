package com.github.catvod.spider.merge.p021y;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class e implements Comparator {
    public final Pattern a = Pattern.compile("(\\d+)|(\\D+)");

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompareTo;
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str == null && str2 == null) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        String lowerCase = str.toLowerCase();
        Pattern pattern = this.a;
        Matcher matcher = pattern.matcher(lowerCase);
        Matcher matcher2 = pattern.matcher(str2.toLowerCase());
        while (matcher.find() && matcher2.find()) {
            String strGroup = matcher.group();
            String strGroup2 = matcher2.group();
            if (Character.isDigit(strGroup.charAt(0)) && Character.isDigit(strGroup2.charAt(0))) {
                String strReplaceFirst = strGroup.replaceFirst("^0+", "");
                String strReplaceFirst2 = strGroup2.replaceFirst("^0+", "");
                if (strReplaceFirst.isEmpty()) {
                    strReplaceFirst = "0";
                }
                if (strReplaceFirst2.isEmpty()) {
                    strReplaceFirst2 = "0";
                }
                iCompareTo = strReplaceFirst.length() != strReplaceFirst2.length() ? strReplaceFirst.length() - strReplaceFirst2.length() : strReplaceFirst.compareTo(strReplaceFirst2);
            } else {
                iCompareTo = strGroup.compareTo(strGroup2);
            }
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return str.length() - str2.length();
    }
}
