package com.github.catvod.spider.merge.s0;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class d implements ILoggerFactory {
    public boolean a = false;
    public final HashMap b = new HashMap();
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();

    public final synchronized com.github.catvod.spider.merge.q0.a a(String str) {
        c cVar;
        cVar = (c) this.b.get(str);
        if (cVar == null) {
            cVar = new c(str, this.c, this.a);
            this.b.put(str, cVar);
        }
        return cVar;
    }
}
