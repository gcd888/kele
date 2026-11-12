package com.github.catvod.spider.merge.A;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.C0568t0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class S1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ S1(a2 a2Var, boolean z, int i) {
        this.a = i;
        this.b = a2Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strJ;
        switch (this.a) {
            case 0:
                a2 a2Var = this.b;
                a2Var.getClass();
                boolean z = this.c;
                boolean z2 = true;
                String str = null;
                try {
                    if (z) {
                        S0 s0L = a2.l();
                        strJ = s0L == null ? null : s0L.b;
                    } else {
                        strJ = a2Var.j();
                    }
                    if (z == k2.q()) {
                        if (strJ != null) {
                            try {
                                String strH = C0297t1.h(z ? "quark_last_version" : "webdav_last_version");
                                if (!strH.isEmpty()) {
                                    str = strH;
                                }
                            } catch (Exception unused) {
                            }
                            if (str == null) {
                                a2.u(strJ, z);
                            } else if (a2.a(strJ).compareTo(a2.a(str)) > 0) {
                                InitOrigin.run(new V0(z ? "夸克" : "WebDAV", 4));
                                InitOrigin.run(new V1(a2Var, z, z2, strJ));
                            }
                        }
                        a2Var.c = 0;
                        break;
                    }
                } catch (Exception e) {
                    com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[CloudBackup] 自动同步检查异常: "));
                    a2Var.a = false;
                    int i = a2Var.c;
                    if (i >= 2) {
                        return;
                    }
                    a2Var.c = i + 1;
                    InitOrigin.run(new O1(a2Var, 2), 30000);
                    return;
                }
                break;
            default:
                final a2 a2Var2 = this.b;
                a2Var2.getClass();
                final boolean z3 = this.c;
                final String str2 = z3 ? "夸克" : "WebDAV";
                a2Var2.d.getClass();
                final C0568t0 c0568t0V = X1.V("配置备份", AbstractC0583w0.c, "正在上传配置到".concat(str2));
                final long jElapsedRealtime = 5000 + SystemClock.elapsedRealtime();
                InitOrigin.execute(new Runnable() { // from class: com.github.catvod.spider.merge.A.R1
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str3;
                        String str4 = str2;
                        boolean z4 = z3;
                        a2 a2Var3 = a2Var2;
                        a2Var3.getClass();
                        try {
                            byte[] bArrC = a2.c();
                            if (bArrC == null || bArrC.length == 0) {
                                str3 = str4 + "备份失败：没有可备份的配置文件";
                            } else if (z4) {
                                String str5 = "moyubackup_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + ".zip";
                                a2.v(str5, bArrC);
                                a2.u(str5, true);
                                str3 = "夸克备份成功";
                            } else {
                                String str6 = "moyubackup_" + new SimpleDateFormat("yyyyMMdd_HHmm", Locale.getDefault()).format(new Date()) + ".zip";
                                boolean zW = a2Var3.w(str6, bArrC);
                                if (zW) {
                                    a2.u(str6, false);
                                }
                                str3 = zW ? "WebDAV备份成功" : "WebDAV备份失败";
                            }
                        } catch (Exception e2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(z4 ? "[QuarkBackup] " : "[WebDAV] ");
                            sb.append("备份异常: ");
                            sb.append(e2.getMessage());
                            SpiderDebug.log(sb.toString());
                            str3 = str4 + "备份失败：" + e2.getMessage();
                        }
                        a2.m(c0568t0V, str3, jElapsedRealtime);
                    }
                });
                break;
        }
    }
}
