package com.github.catvod.spider.merge.l0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class e {
    public static int a(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    public static int b(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    public static int c(int i, Object obj) {
        return b(i, obj != null ? obj.hashCode() : 0);
    }
}
