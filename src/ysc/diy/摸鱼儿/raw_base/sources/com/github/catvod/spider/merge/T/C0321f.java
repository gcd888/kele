package com.github.catvod.spider.merge.T;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0321f {
    public final /* synthetic */ int a;

    public final int a(char[] cArr, int i) {
        switch (this.a) {
            case 0:
                return cArr[i];
            default:
                return (cArr[i + 1] << 16) | cArr[i];
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }
}
