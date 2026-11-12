package com.github.catvod.spider.merge.p000a;

import com.github.catvod.spider.C0141;
import com.github.catvod.spider.merge.A.C0002;
import com.github.catvod.spider.merge.O.C0038;
import com.github.catvod.spider.merge.p016t.C0121;
import com.github.catvod.spider.merge.t0.C0124;
import com.github.catvod.utils.C0144;
import java.io.PrintStream;
import moyu.fucking.C0152;
import moyu.fucking.C0157;
import moyu.fucking.C0162;
import moyu.fucking.C0168;
import moyu.fucking.C0181;
import moyu.fucking.C0191;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0212;
import moyu.fucking.C0213;
import moyu.fucking.C0216;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.a.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0346c0 implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f230short = {16994, -31980, 21848, -32436, 3155, 3145, 18032, 25059, 20498, -31738, 2329, 2307, 3314, 3307, 3298, 3300, 3206, -31880, 28419, 21911, -32381, 3228, 3206, 2100, 2103, 2102, 27533, 28486, 20788, -31456, 2111, 2085, 2735, 2732, 2733, 2750, 2769, 2798, 2811, 2800, 26902, 28125, 21423, -30789, 2724, 2750, 622, 622, 618, 29732, 23818, 23406, -28806, 613, 639};
    public final int a;
    public final Exception b;

    public /* synthetic */ RunnableC0346c0(Exception exc, int i) throws Throwable {
        this.a = i;
        this.b = exc;
        int iIntValue = ((Integer) C0152.n(26722, null, new Object[0])).intValue();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (iIntValue >= 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Float) C0216.n(51282, null, new Object[]{(String) C0168.n(56183, null, new Object[]{(String) C0212.n(50014)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Exception exc = (Exception) C0212.n(74546, this);
        switch (((Integer) C0212.n(52931, this)).intValue()) {
            case 0:
                C0213.n(55886, null, new Object[]{exc, new StringBuilder((String) C0181.n(92093, null, new Object[]{(short[]) C0212.n(60905), 46, Integer.valueOf(C0141.f351 ^ (-776)), 607}))});
                break;
            case 1:
                ((Integer) C0212.n(21781)).intValue();
                C0213.n(55886, null, new Object[]{exc, new StringBuilder((String) C0198.n(54030, null, new Object[]{(short[]) C0212.n(60905), 32, Integer.valueOf(C0038.f194 ^ 209), 2718}))});
                int iIntValue = ((Integer) C0181.n(6638, null, new Object[0])).intValue();
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
                            C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0152.n(66570, null, new Object[]{(String) C0191.n(87373, null, new Object[]{(String) C0212.n(14436)})})});
                            break;
                        case 239:
                            break;
                        default:
                            continue;
                    }
                    i = 1678;
                }
                break;
            case 2:
                C0213.n(55886, null, new Object[]{exc, new StringBuilder((String) C0157.n(78385, null, new Object[]{(short[]) C0212.n(60905), 23, Integer.valueOf(C0124.f333 ^ (-766)), 2053}))});
                break;
            case 3:
                C0213.n(55886, null, new Object[]{exc, new StringBuilder((String) C0195.n(99405, null, new Object[]{(short[]) C0212.n(60905), 12, Integer.valueOf(C0002.f158 ^ 526), 3238}))});
                break;
            case 4:
                C0213.n(55886, null, new Object[]{exc, new StringBuilder((String) C0191.n(93496, null, new Object[]{(short[]) C0212.n(60905), 6, Integer.valueOf(C0121.f330 ^ (-547)), 2339}))});
                break;
            default:
                C0213.n(55886, null, new Object[]{exc, new StringBuilder((String) C0162.n(59839, null, new Object[]{(short[]) C0212.n(60905), 0, Integer.valueOf(C0144.f354 ^ (-605)), 3177}))});
                break;
        }
    }
}
