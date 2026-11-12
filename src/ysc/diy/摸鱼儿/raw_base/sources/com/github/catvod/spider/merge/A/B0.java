package com.github.catvod.spider.merge.A;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class B0 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "HonHonDanmu");
        thread.setDaemon(true);
        return thread;
    }
}
