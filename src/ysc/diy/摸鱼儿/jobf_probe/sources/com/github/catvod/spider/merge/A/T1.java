package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.merge.p022z.M2;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class T1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ T1(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:46:0x00b2, B:48:0x00b8, B:56:0x00da, B:52:0x00c8, B:54:0x00cc, B:55:0x00d8), top: B:106:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d8 A[Catch: all -> 0x00c4, TryCatch #1 {all -> 0x00c4, blocks: (B:46:0x00b2, B:48:0x00b8, B:56:0x00da, B:52:0x00c8, B:54:0x00cc, B:55:0x00d8), top: B:106:0x00b2 }] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z;
        String strO;
        switch (this.a) {
            case 0:
                X0.a("上传失败: " + this.b);
                return;
            case 1:
                if (this.b == k2.c.get()) {
                    k2.B(false, false);
                    return;
                }
                return;
            case 2:
                int i2 = this.b;
                Object obj = InitOrigin.m;
                synchronized (obj) {
                    i = InitOrigin.p;
                    z = true;
                    InitOrigin.q--;
                    break;
                }
                if (i == i2) {
                    try {
                        if (InitOrigin.g()) {
                            FishCrypto.q();
                        }
                        strO = FishCrypto.o();
                        if (!strO.isEmpty() && !"pending".equals(new JSONObject(strO).optString("state"))) {
                            z = false;
                        }
                        synchronized (obj) {
                            try {
                                InitOrigin.u = false;
                                if (i != InitOrigin.p) {
                                    InitOrigin.get().b.post(InitOrigin.v);
                                } else if (z || InitOrigin.q <= 0) {
                                    InitOrigin.q = 0;
                                } else {
                                    InitOrigin.get().b.postDelayed(InitOrigin.v, 1000L);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        InitOrigin.run(new com.github.catvod.spider.merge.p022z.S(9));
                    } catch (Throwable th2) {
                        try {
                            InitOrigin.i(th2);
                            synchronized (InitOrigin.m) {
                                try {
                                    InitOrigin.u = false;
                                    if (i != InitOrigin.p) {
                                        InitOrigin.get().b.post(InitOrigin.v);
                                    } else if (InitOrigin.q > 0) {
                                        InitOrigin.get().b.postDelayed(InitOrigin.v, 1000L);
                                    } else {
                                        InitOrigin.q = 0;
                                    }
                                    InitOrigin.run(new com.github.catvod.spider.merge.p022z.S(9));
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            synchronized (InitOrigin.m) {
                                try {
                                    InitOrigin.u = false;
                                    if (i != InitOrigin.p) {
                                        InitOrigin.get().b.post(InitOrigin.v);
                                    } else if (InitOrigin.q > 0) {
                                        InitOrigin.get().b.postDelayed(InitOrigin.v, 1000L);
                                    } else {
                                        InitOrigin.q = 0;
                                    }
                                    InitOrigin.run(new com.github.catvod.spider.merge.p022z.S(9));
                                    N1.l0();
                                    InitOrigin.resumeProtectedTasks();
                                    throw th4;
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        }
                    }
                } else {
                    FishCrypto.q();
                    strO = FishCrypto.o();
                    if (!strO.isEmpty()) {
                        z = false;
                    }
                    synchronized (obj) {
                        InitOrigin.u = false;
                        if (i != InitOrigin.p) {
                            InitOrigin.get().b.post(InitOrigin.v);
                        } else if (z) {
                            InitOrigin.q = 0;
                        } else {
                            InitOrigin.q = 0;
                        }
                        InitOrigin.run(new com.github.catvod.spider.merge.p022z.S(9));
                    }
                }
                N1.l0();
                InitOrigin.resumeProtectedTasks();
                return;
            case 3:
                if (this.b != PianDan.g.get()) {
                    return;
                }
                PianDan.d.set(false);
                PianDan pianDan = PianDan.o;
                if (pianDan != null) {
                    pianDan.U(false);
                    return;
                }
                return;
            case 4:
                com.github.catvod.spider.merge.p022z.P1.I0(this.b + 1);
                return;
            case 5:
                com.github.catvod.spider.merge.p022z.P1.e1(AbstractC0302v0.Y0("baidu"), this.b, "Cookie", null, null, new M2(8), null, null, null);
                return;
            case 6:
                com.github.catvod.spider.merge.p022z.P1.D(this.b);
                return;
            case 7:
                com.github.catvod.spider.merge.p022z.P1.D(this.b);
                return;
            case 8:
                com.github.catvod.spider.merge.p022z.P1.D(this.b);
                X0.a("AI推荐加载失败，可在更新与状态中重试");
                return;
            case 9:
                com.github.catvod.spider.merge.p022z.P1.D(this.b);
                X0.a("暂无新的AI推荐");
                return;
            case 10:
                com.github.catvod.spider.merge.p022z.P1.D(this.b);
                X0.a("AI推荐仍在后台更新，可稍后查看");
                return;
            default:
                com.github.catvod.spider.merge.p022z.P1.w0(this.b);
                return;
        }
    }
}
