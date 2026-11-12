package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.A.S0;
import com.github.catvod.spider.merge.p003d.g;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0195;
import moyu.fucking.C0196;
import moyu.fucking.C0210;
import moyu.fucking.C0233;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0366m0 implements Runnable {
    public final int a = 2;
    public final List b;
    public final Object c;
    public final Object d;
    public final Serializable e;
    public final Object f;
    public final Object g;
    public final Serializable h;

    public /* synthetic */ RunnableC0366m0(C0342a0 c0342a0, ConcurrentLinkedQueue concurrentLinkedQueue, CountDownLatch countDownLatch, S0 s0, String str, AtomicInteger atomicInteger, List list) throws Throwable {
        this.d = c0342a0;
        this.e = concurrentLinkedQueue;
        this.f = countDownLatch;
        this.g = s0;
        this.c = str;
        this.h = atomicInteger;
        this.b = list;
        int iIntValue = ((Integer) C0182.n(51494, null, new Object[0])).intValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iIntValue <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0182.n(56258, null, new Object[]{(String) C0233.n(11578, null, new Object[]{(String) C0196.n(18131)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public /* synthetic */ RunnableC0366m0(C0349e c0349e, String str, g gVar, List list, List list2, ExecutorService executorService, Semaphore semaphore) throws Throwable {
        this.d = c0349e;
        this.e = str;
        this.f = gVar;
        this.b = list;
        this.c = list2;
        this.g = executorService;
        this.h = semaphore;
        int iIntValue = ((Integer) C0162.n(86773, null, new Object[0])).intValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iIntValue <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    C0162.n(83524, (PrintStream) C0195.n(72538), new Object[]{Long.valueOf(((Long) C0162.n(73560, null, new Object[]{(String) C0210.n(8844, null, new Object[]{(String) C0196.n(31939)})})).longValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public /* synthetic */ RunnableC0366m0(C0377s0 c0377s0, ConcurrentLinkedQueue concurrentLinkedQueue, CountDownLatch countDownLatch, C0375r0 c0375r0, AtomicInteger atomicInteger, List list, List list2) throws Throwable {
        this.d = c0377s0;
        this.e = concurrentLinkedQueue;
        this.f = countDownLatch;
        this.g = c0375r0;
        this.h = atomicInteger;
        this.b = list;
        this.c = list2;
        int iIntValue = ((Integer) C0181.n(42959, null, new Object[0])).intValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iIntValue >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    C0168.n(61614, (PrintStream) C0195.n(72538), new Object[]{(String) C0195.n(83584, null, new Object[]{(String) C0196.n(53340)})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0058, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0241, code lost:
    
        continue;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p000a.RunnableC0366m0.run():void");
    }
}
