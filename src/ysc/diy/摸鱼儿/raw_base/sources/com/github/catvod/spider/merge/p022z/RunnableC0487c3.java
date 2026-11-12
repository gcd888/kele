package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.merge.A.AbstractC0302v0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0487c3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0512h3[] b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List e;
    public final /* synthetic */ String f;

    public /* synthetic */ RunnableC0487c3(C0512h3[] c0512h3Arr, boolean z, String str, ArrayList arrayList, String str2, int i) {
        this.a = i;
        this.b = c0512h3Arr;
        this.c = z;
        this.d = str;
        this.e = arrayList;
        this.f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0512h3 c0512h3 = this.b[0];
                if (c0512h3 != null) {
                    c0512h3.b(this.c, this.d, "请先扫码登录" + AbstractC0302v0.Y0("ali") + "账号", this.e, this.f, "Token");
                }
                break;
            case 1:
                C0512h3 c0512h4 = this.b[0];
                if (c0512h4 != null) {
                    c0512h4.b(this.c, this.d, "请先使用账号密码登录" + AbstractC0302v0.Y0("pan123"), this.e, this.f, "Token");
                }
                break;
            case 2:
                C0512h3 c0512h5 = this.b[0];
                if (c0512h5 != null) {
                    c0512h5.b(this.c, this.d, "请先扫码登录" + AbstractC0302v0.Y0("uc") + "账号", this.e, this.f, "Cookie");
                }
                break;
            case 3:
                C0512h3 c0512h6 = this.b[0];
                if (c0512h6 != null) {
                    c0512h6.b(this.c, this.d, "请先登录" + AbstractC0302v0.Y0("yidong") + "账号", this.e, this.f, "凭证");
                }
                break;
            case 4:
                C0512h3 c0512h7 = this.b[0];
                if (c0512h7 != null) {
                    c0512h7.b(this.c, this.d, "请先扫码登录" + AbstractC0302v0.Y0("115") + "账号", this.e, this.f, "Cookie");
                }
                break;
            case 5:
                C0512h3 c0512h8 = this.b[0];
                if (c0512h8 != null) {
                    c0512h8.b(this.c, this.d, "请先扫码登录" + AbstractC0302v0.Y0("quark") + "账号", this.e, this.f, "Cookie");
                }
                break;
            case 6:
                C0512h3 c0512h9 = this.b[0];
                if (c0512h9 != null) {
                    c0512h9.b(this.c, this.d, "请先登录" + AbstractC0302v0.Y0("tianyi") + "账号", this.e, this.f, "凭证");
                }
                break;
            case 7:
                C0512h3 c0512h10 = this.b[0];
                if (c0512h10 != null) {
                    c0512h10.b(this.c, this.d, "请先登录" + AbstractC0302v0.Y0("guangya"), this.e, this.f, "Token");
                }
                break;
            default:
                C0512h3 c0512h11 = this.b[0];
                if (c0512h11 != null) {
                    c0512h11.b(this.c, this.d, "请先扫码登录" + AbstractC0302v0.Y0("baidu") + "账号", this.e, this.f, "Cookie");
                }
                break;
        }
    }
}
