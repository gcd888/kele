package com.github.catvod.spider.merge.A;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0568t0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class V1 implements Runnable {
    public final /* synthetic */ a2 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public /* synthetic */ V1(a2 a2Var, boolean z, boolean z2, String str) {
        this.a = a2Var;
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        final a2 a2Var = this.a;
        a2Var.getClass();
        final boolean z = this.b;
        final String str3 = z ? "夸克" : "WebDAV";
        final boolean z2 = this.c;
        String str4 = z2 ? "自动同步" : "云端恢复";
        if (z2) {
            str = "检测到";
            str2 = "备份更新，正在恢复配置";
        } else {
            str = "正在从";
            str2 = "下载配置";
        }
        String strJ = com.github.catvod.spider.merge.D.b.j(str, str3, str2);
        a2Var.d.getClass();
        final C0568t0 c0568t0V = X1.V(str4, AbstractC0583w0.d, strJ);
        final long jElapsedRealtime = SystemClock.elapsedRealtime() + 5000;
        final String str5 = this.d;
        InitOrigin.execute(new Runnable() { // from class: com.github.catvod.spider.merge.A.Q1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v14 */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v18 */
            @Override // java.lang.Runnable
            public final void run() {
                boolean z3;
                ?? r1;
                ?? r2;
                byte[] bArrF;
                StringBuilder sb;
                a2 a2Var2 = a2Var;
                ?? string = z;
                String str6 = str5;
                String str7 = str3;
                boolean z4 = z2;
                C0568t0 c0568t0 = c0568t0V;
                long j = jElapsedRealtime;
                a2Var2.getClass();
                try {
                    if (string != 0) {
                        S0 s0L = a2.l();
                        if (s0L == null) {
                            bArrF = null;
                        } else {
                            a2Var2.f = s0L.b;
                            bArrF = a2.g(s0L.c);
                        }
                    } else {
                        bArrF = a2Var2.f(str6);
                    }
                    if (bArrF == null || bArrF.length == 0) {
                        z3 = false;
                        r2 = str7 + "未找到可恢复的备份";
                    } else {
                        boolean zI = a2.i(bArrF);
                        if (zI) {
                            if (!a2Var2.f.isEmpty()) {
                                a2.u(a2Var2.f, string);
                            }
                            a2Var2.c = 0;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        try {
                            if (zI) {
                                sb = new StringBuilder();
                                sb.append(str7);
                                sb.append("备份恢复成功！请重启应用");
                            } else {
                                sb = new StringBuilder();
                                sb.append(str7);
                                sb.append("备份恢复失败");
                            }
                            string = sb.toString();
                            r2 = string;
                        } catch (Exception e) {
                            e = e;
                            r1 = string;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(r1 != 0 ? "[QuarkBackup] " : "[WebDAV] ");
                            sb2.append("恢复异常: ");
                            sb2.append(e.getMessage());
                            SpiderDebug.log(sb2.toString());
                            r2 = str7 + "备份恢复失败：" + e.getMessage();
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    z3 = false;
                    r1 = string;
                }
                if (z4 && !z3) {
                    a2Var2.a = false;
                    int i = a2Var2.c;
                    if (i < 2) {
                        a2Var2.c = i + 1;
                        InitOrigin.run(new O1(a2Var2, 2), 30000);
                    }
                }
                a2.m(c0568t0, r2, j);
            }
        });
    }
}
