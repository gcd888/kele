package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.merge.A.Y1;
import com.github.catvod.spider.merge.p009k.c;
import com.google.gson.JsonArray;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import moyu.fucking.C0148;
import moyu.fucking.C0150;
import moyu.fucking.C0152;
import moyu.fucking.C0157;
import moyu.fucking.C0168;
import moyu.fucking.C0173;
import moyu.fucking.C0175;
import moyu.fucking.C0182;
import moyu.fucking.C0195;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class M0 implements Callable {
    public final int a = 1;
    public final String b;
    public final ExecutorService c;
    public final Object d;
    public final Object e;
    public final Serializable f;

    public /* synthetic */ M0(A0 a0, c cVar, String str, ExecutorService executorService, Semaphore semaphore) throws Throwable {
        this.d = a0;
        this.e = cVar;
        this.b = str;
        this.c = executorService;
        this.f = semaphore;
        int iIntValue = ((Integer) C0173.n(90343, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Long) C0182.n(56258, null, new Object[]{(String) C0150.n(73469, null, new Object[]{(String) C0148.n(26950)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public /* synthetic */ M0(Q0 q0, Y1 y1, String str, String str2, ThreadPoolExecutor threadPoolExecutor) throws Throwable {
        this.d = q0;
        this.e = y1;
        this.b = str;
        this.f = str2;
        this.c = threadPoolExecutor;
        int iIntValue = ((Integer) C0168.n(31307, null, new Object[0])).intValue();
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
                    C0157.n(99237, (PrintStream) C0195.n(72538), new Object[]{Double.valueOf(((Double) C0157.n(3141, null, new Object[]{(String) C0152.n(9835, null, new Object[]{(String) C0148.n(45436)})})).doubleValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object objN = C0148.n(34408, this);
        Object objN2 = C0148.n(51928, this);
        Serializable serializable = (Serializable) C0148.n(91764, this);
        ExecutorService executorService = (ExecutorService) C0148.n(60374, this);
        switch (((Integer) C0148.n(79385, this)).intValue()) {
            case 0:
                ((Integer) C0148.n(1308)).intValue();
                Q0 q0 = (Q0) objN2;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                return new O0(arrayList, arrayList2, (JsonArray) C0148.n(55149, q0, new Object[]{(Y1) objN, arrayList, arrayList2, (String) C0148.n(46182, this), (String) serializable, null, (ThreadPoolExecutor) executorService}));
            default:
                ((Integer) C0175.n(46748)).intValue();
                return (C0391z0) C0175.n(98861, (A0) objN2, new Object[]{(c) objN, (String) C0148.n(46182, this), executorService, (Semaphore) serializable});
        }
    }
}
