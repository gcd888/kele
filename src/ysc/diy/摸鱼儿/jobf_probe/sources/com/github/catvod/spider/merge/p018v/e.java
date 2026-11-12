package com.github.catvod.spider.merge.p018v;

import com.github.catvod.spider.InitOrigin;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.github.catvod.spider.merge.S.e b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ e(com.github.catvod.spider.merge.S.e eVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = eVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.S.e eVar = this.b;
                int i = this.c;
                int i2 = this.d;
                synchronized (eVar) {
                    try {
                        int i3 = eVar.a;
                        if (i != i3) {
                            eVar.g(i3, 0);
                            return;
                        }
                        try {
                            z = eVar.h(true) != null;
                            try {
                                synchronized (eVar) {
                                    if (z) {
                                        try {
                                            if (i == eVar.a) {
                                                eVar.f(i);
                                                ((d) eVar.c).e = true;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    synchronized (eVar) {
                                        try {
                                            int i4 = eVar.a;
                                            if (i != i4) {
                                                eVar.g(i4, 0);
                                            } else if (z || i2 >= 2) {
                                                eVar.b = false;
                                            } else {
                                                eVar.b = InitOrigin.schedule(new e(eVar, i, i2, 1), ((long) (i2 + 1)) * 1000);
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                        break;
                                    }
                                    return;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                synchronized (eVar) {
                                    try {
                                        int i5 = eVar.a;
                                        if (i != i5) {
                                            eVar.g(i5, 0);
                                        } else if (z || i2 >= 2) {
                                            eVar.b = false;
                                        } else {
                                            eVar.b = InitOrigin.schedule(new e(eVar, i, i2, 1), ((long) (i2 + 1)) * 1000);
                                        }
                                        throw th;
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z = false;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                break;
            default:
                this.b.g(this.c, this.d + 1);
                return;
        }
    }
}
