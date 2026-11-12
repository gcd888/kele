package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.p018v.C0132;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.ۣۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class C0025 {

    /* JADX INFO: renamed from: ۦۤ۟, reason: contains not printable characters */
    public static int f181 = -684;

    /* JADX INFO: renamed from: ۣ۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static int m96(Object obj) {
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۣۡۡۧ, reason: not valid java name and contains not printable characters */
    public static String m98(String str) {
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
        while (str.length() > 0) {
            byteArrayOutputStream.write((string.indexOf(str.charAt(-2)) << 4) | string.indexOf(str.charAt(-1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        int length2 = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            byteArray[i2] = (byte) (byteArray[i2] ^ str2.charAt(i2 % length2));
        }
        return new String(byteArray);
    }

    /* JADX INFO: renamed from: ۣۢۦۥ, reason: not valid java name and contains not printable characters */
    public static int m99() {
        return 303 ^ C0132.f341;
    }

    /* JADX INFO: renamed from: ۟ۡۧۨۧ, reason: not valid java name and contains not printable characters */
    public static String m97(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
