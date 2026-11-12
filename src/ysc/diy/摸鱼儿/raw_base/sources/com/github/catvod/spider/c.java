package com.github.catvod.spider;

import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import moyu.fucking.C0152;
import moyu.fucking.C0178;
import moyu.fucking.C0182;
import moyu.fucking.C0195;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class c {
    public final WeakReference a;
    public final long b;
    public final Callable c;
    public final AtomicBoolean d = new AtomicBoolean();
    public volatile String e;
    public volatile Object f;

    public c(Object obj, long j, Callable callable) throws Throwable {
        this.a = new WeakReference(obj);
        this.b = j;
        this.c = callable;
        int iIntValue = ((Integer) C0152.n(24832, null, new Object[0])).intValue();
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
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0178.n(16623, null, new Object[]{(String) C0152.n(7488, null, new Object[]{(String) C0152.n(94222)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public final boolean a() {
        try {
            Callable callable = (Callable) C0152.n(73985, this);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = callable != null ? 1709 : 1678;
                        break;
                    case 204:
                        boolean zBooleanValue = ((Boolean) C0182.n(56525, (Boolean) C0182.n(26387), new Object[]{C0178.n(67332, callable, new Object[0])})).booleanValue();
                        int i2 = 1740;
                        while (true) {
                            i2 ^= 1757;
                            switch (i2) {
                                case 17:
                                    if (zBooleanValue) {
                                        i2 = 1833;
                                    }
                                    break;
                                case 54:
                                    break;
                                case 471:
                                    return false;
                                case 500:
                                    break;
                                default:
                                    continue;
                            }
                            i2 = 1802;
                        }
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
            }
            return true;
        } catch (Exception e) {
            int i3 = 1864;
            while (true) {
                i3 ^= 1881;
                switch (i3) {
                    case 17:
                        i3 = 48674;
                        break;
                    case 47483:
                        return false;
                }
            }
        }
    }
}
