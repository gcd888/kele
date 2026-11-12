package com.github.catvod.spider.merge.p009k;

import com.github.catvod.spider.merge.p006g.C0081;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k.ۣۥۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class C0098 {

    /* JADX INFO: renamed from: ۣۧۢۧ, reason: not valid java name and contains not printable characters */
    public static int f307 = 967;

    /* JADX INFO: renamed from: ۟ۧۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m388() {
        return (-499) ^ C0081.f290;
    }

    /* JADX INFO: renamed from: ۡۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m389(String str) {
        String string = "";
        int i = 0;
        String str2 = "";
        while (i < 15) {
            string = new StringBuffer().append(string).append(Integer.toHexString(i)).toString();
            String string2 = new StringBuffer().append(str2).append(((int) (Math.random() * ((double) 10))) ^ i).toString();
            i++;
            str2 = string2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(i2)) << 4) | string.indexOf(str.charAt(i2 + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        while (length > 0) {
            byteArray[-1] = (byte) (byteArray[-1] ^ str2.charAt((-1) % length2));
        }
        for (int length3 = 0; length3 < byteArray.length; length3 = "".length() + 1) {
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۦۢۦۨ, reason: contains not printable characters */
    public static int m391(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۤۦۣۤ, reason: not valid java name and contains not printable characters */
    public static String m390(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
