package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.Gying;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.PanWebShare123;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p000a.A;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.C0342a0;
import com.github.catvod.spider.merge.p000a.C0349e;
import com.github.catvod.spider.merge.p000a.C0359j;
import com.github.catvod.spider.merge.p000a.C0364l0;
import com.github.catvod.spider.merge.p000a.C0377s0;
import com.github.catvod.spider.merge.p000a.L0;
import com.github.catvod.spider.merge.p000a.RunnableC0383v0;
import com.github.catvod.spider.merge.p000a.Z0;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class P2 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ P2(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        int i2;
        boolean zR;
        switch (this.a) {
            case 0:
                A.j().B(false);
                break;
            case 1:
                InitOrigin.run(new RunnableC0383v0(11, false));
                break;
            case 2:
                X0.a("天翼云盘登录成功");
                break;
            case 3:
                try {
                    Z0 z0T = Z0.t();
                    if (z0T != null) {
                        z0T.g();
                        i = 1;
                    } else {
                        i = 0;
                    }
                    i2 = 0;
                } catch (Throwable unused) {
                    i = 0;
                    i2 = 1;
                }
                try {
                    A0 a0S = A0.s();
                    if (a0S != null) {
                        a0S.g();
                        i++;
                    }
                } catch (Throwable unused2) {
                    i2++;
                }
                try {
                    C0349e c0349eJ = C0349e.j();
                    if (c0349eJ != null) {
                        c0349eJ.e();
                        i++;
                    }
                } catch (Throwable unused3) {
                    i2++;
                }
                try {
                    A aJ = A.j();
                    if (aJ != null) {
                        aJ.c();
                        i++;
                    }
                } catch (Throwable unused4) {
                    i2++;
                }
                try {
                    C0364l0 c0364l0C = C0364l0.C();
                    if (c0364l0C != null) {
                        c0364l0C.h();
                        c0364l0C.f = true;
                        c0364l0C.e = false;
                        i++;
                    }
                } catch (Throwable unused5) {
                    i2++;
                }
                try {
                    C0342a0 c0342a0 = C0342a0.x;
                    if (c0342a0 != null) {
                        c0342a0.h();
                        i++;
                    }
                } catch (Throwable unused6) {
                    i2++;
                }
                try {
                    L0 l0Q = L0.q();
                    if (l0Q != null) {
                        l0Q.h();
                        i++;
                    }
                } catch (Throwable unused7) {
                    i2++;
                }
                try {
                    File fileE = C0297t1.e();
                    if (fileE != null && fileE.exists() && fileE.isDirectory()) {
                        File[] fileArrListFiles = fileE.listFiles();
                        if (fileArrListFiles == null) {
                            fileArrListFiles = new File[0];
                        }
                        boolean z = true;
                        for (File file : fileArrListFiles) {
                            String name = file.getName();
                            if (!"smart_behavior.json".equals(name) && !"smart_history.json".equals(name) && ((name == null || !name.startsWith("smart_history_")) && !P1.O(file))) {
                                z = false;
                            }
                        }
                        if (z) {
                            i++;
                        } else {
                            i2++;
                        }
                    }
                } catch (Throwable unused8) {
                    i2++;
                }
                if (i2 > 0 && i == 0) {
                    X0.a("清除失败，请重试");
                }
                InitOrigin.run(new P2(5));
                break;
            case 4:
                X0.a("123账号及Open授权成功");
                break;
            case 5:
                X0.a("配置已清除，播放历史已保留");
                FishConfig.refreshAllStatus();
                break;
            case 6:
                InitOrigin.execute(new U2(2));
                break;
            case 7:
                P1.e1(AbstractC0302v0.Y0("guangya"), AbstractC0302v0.X0("guangya"), "Token", null, null, new C0359j(24), null, null, null);
                break;
            case 8:
                C0342a0 c0342a1 = C0342a0.x;
                c0342a1.l = true;
                c0342a1.m = false;
                break;
            case 9:
                PanWebShare123.clearCookie();
                FishConfig.refreshStatus("pan123");
                X0.a("123社区Cookie已清除");
                break;
            case 10:
                InitOrigin.execute(new S(13));
                break;
            case 11:
                InitOrigin.run(new I2("username,账号,输入123网盘账号|password,密码,输入密码,pwd", AbstractC0302v0.Y0("pan123"), false, AbstractC0302v0.X0("pan123"), String.valueOf(System.currentTimeMillis()), "", new C0359j(27), new S(14)));
                break;
            case 12:
                C0349e c0349eJ2 = C0349e.j();
                c0349eJ2.l = true;
                ScheduledExecutorService scheduledExecutorService = c0349eJ2.i;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                break;
            case 13:
                P1.e1("123 Open授权", AbstractC0302v0.X0("pan123"), "Open Token", "粘贴包含 access_token/refresh_token 的JSON", C0377s0.u.f(), new M2(7), "复制Open Token", new S2(25), "https://oauth.litepan.top/quick-start?driver_type=123%E4%BA%91%E7%9B%98Open&server_use=true");
                break;
            case 14:
                Gying.clearCookie();
                X0.a("观影Cookie已清除");
                break;
            case 15:
                P1.X0("config_backup_help", null);
                break;
            case 16:
                L0 l0Q2 = L0.q();
                l0Q2.f = true;
                ScheduledExecutorService scheduledExecutorService2 = l0Q2.a;
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdownNow();
                }
                break;
            case 17:
                try {
                    L0.q().b0();
                } catch (Exception e) {
                    b.x(e, new StringBuilder("获取二维码失败: "));
                    return;
                }
                break;
            case 18:
                A aJ2 = A.j();
                aJ2.getClass();
                try {
                    zR = aJ2.o().r();
                } catch (Exception unused9) {
                    zR = false;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C0477a3(AbstractC0583w0.d, new S2(22), "App跳转授权", "单独唤起B站App确认登录"));
                int i3 = AbstractC0583w0.h;
                arrayList.add(new C0477a3(i3, new S2(23), "扫码登录", "显示二维码，用B站App扫码"));
                arrayList.add(new C0477a3(i3, new S2(24), "Cookie登录", "手动输入Cookie字符串"));
                P1.d1(-298343, null, "哔哩哔哩", "扫码登录或Cookie登录", null, arrayList, zR);
                break;
            case 19:
                InitOrigin.execute(new P2(17));
                break;
            case 20:
                P1.p1();
                break;
            case 21:
                P1.b1();
                break;
            case 22:
                P1.w1();
                break;
            case 23:
                P1.P0();
                break;
            case 24:
                P1.v1();
                break;
            case 25:
                P1.z1();
                break;
            case 26:
                P1.g1();
                break;
            case 27:
                P1.B1();
                break;
            case 28:
                P1.Q0();
                break;
            default:
                InitOrigin.run(new I2("phone,手机号,输入" + AbstractC0302v0.Y0("tianyi") + "手机号|password,密码,输入密码,pwd", AbstractC0302v0.Y0("tianyi"), false, AbstractC0302v0.X0("tianyi"), String.valueOf(System.currentTimeMillis()), "", new M2(4), new P2(16)));
                break;
        }
    }
}
