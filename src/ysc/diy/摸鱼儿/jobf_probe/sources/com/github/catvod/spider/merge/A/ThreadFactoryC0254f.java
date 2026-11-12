package com.github.catvod.spider.merge.A;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class ThreadFactoryC0254f implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;

    public ThreadFactoryC0254f(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new AtomicInteger(0);
                break;
            default:
                this.b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable, "cp-exec-" + this.b.getAndIncrement());
                thread.setDaemon(true);
                return thread;
            default:
                Thread thread2 = new Thread(runnable, "cp-race-" + this.b.getAndIncrement());
                thread2.setDaemon(true);
                return thread2;
        }
    }
}
