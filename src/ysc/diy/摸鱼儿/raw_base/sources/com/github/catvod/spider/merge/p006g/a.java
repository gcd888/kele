package com.github.catvod.spider.merge.p006g;

import com.github.catvod.spider.merge.A.C0297t1;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class a {
    public static a n;
    public static final AtomicLong o = new AtomicLong();
    public static boolean p = false;

    @SerializedName("port")
    private int a = 2525;

    @SerializedName("enabled")
    private volatile boolean b = true;

    @SerializedName("auto_start")
    private boolean c = true;

    @SerializedName("auto_push")
    private volatile boolean d = true;

    @SerializedName("show_dialog")
    private boolean e = false;

    @SerializedName("random_position")
    private boolean f = true;

    @SerializedName("random_color")
    private boolean g = false;

    @SerializedName("enabled_platforms")
    private List<String> h = Arrays.asList("BL", "QY", "TX", "YK", "MG", "HJ", "RR", "XG", "LS", "MDD");

    @SerializedName("colors")
    private List<String> i = Arrays.asList("#FF0000", "#00FF00", "#0000FF", "#FFFF00", "#FF00FF", "#00FFFF", "#FFA500");

    @SerializedName("ai_enabled")
    private boolean j = false;

    @SerializedName("ai_api_key")
    private String k = "";

    @SerializedName("ai_base_url")
    private String l = "https://api.deepseek.com";

    @SerializedName("ai_model")
    private String m = "deepseek-chat";

    public static a a() {
        a aVar;
        if (n == null || !p) {
            try {
                String strH = C0297t1.h(".danmu_config");
                if (strH.isEmpty()) {
                    aVar = new a();
                } else {
                    p = true;
                    aVar = (a) new Gson().fromJson(strH, a.class);
                }
            } catch (Exception unused) {
            }
            n = aVar;
        }
        return n;
    }

    public static void h() {
        o.incrementAndGet();
    }

    public final void A(boolean z) {
        if (this.g != z) {
            this.g = z;
            h();
        }
        p();
    }

    public final void B(boolean z) {
        if (this.f != z) {
            this.f = z;
            h();
        }
        p();
    }

    public final void C(boolean z) {
        this.e = z;
        p();
    }

    public final String b() {
        String str = this.k;
        return str != null ? str : "";
    }

    public final String c() {
        String str = this.l;
        return str != null ? str : "";
    }

    public final String d() {
        String str = this.m;
        return str != null ? str : "";
    }

    public final String e() {
        String str = this.l;
        return (str == null || str.isEmpty()) ? "https://api.deepseek.com" : this.l;
    }

    public final String f() {
        String str = this.m;
        return (str == null || str.isEmpty()) ? "deepseek-chat" : this.m;
    }

    public final List g() {
        return this.h;
    }

    public final boolean i() {
        return this.j;
    }

    public final boolean j() {
        return this.d;
    }

    public final boolean k() {
        return this.b;
    }

    public final boolean l(String str) {
        List<String> list = this.h;
        return list != null && list.contains(str);
    }

    public final boolean m() {
        return this.g;
    }

    public final boolean n() {
        return this.f;
    }

    public final boolean o() {
        return this.e;
    }

    public final void p() {
        try {
            C0297t1.j(".danmu_config", new Gson().toJson(this));
            p = true;
        } catch (Exception unused) {
        }
    }

    public final void q(String str) {
        if (!Objects.equals(this.k, str)) {
            this.k = str;
            h();
        }
        p();
    }

    public final void r(String str) {
        if (!Objects.equals(this.l, str)) {
            this.l = str;
            h();
        }
        p();
    }

    public final void s(boolean z) {
        if (this.j != z) {
            this.j = z;
            h();
        }
        p();
    }

    public final void t(String str) {
        if (!Objects.equals(this.m, str)) {
            this.m = str;
            h();
        }
        p();
    }

    public final void u(boolean z) {
        synchronized (a.class) {
            try {
                boolean z2 = this.d != z;
                this.d = z;
                if (z2) {
                    o.incrementAndGet();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p();
    }

    public final void v() {
        this.c = true;
        p();
    }

    public final void w(List list) {
        if (!Objects.equals(this.i, list)) {
            this.i = list;
            h();
        }
        p();
    }

    public final void x(boolean z) {
        synchronized (a.class) {
            try {
                boolean z2 = this.b != z;
                this.b = z;
                if (z2) {
                    o.incrementAndGet();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p();
    }

    public final void y(List list) {
        if (!Objects.equals(this.h, list)) {
            this.h = list;
            h();
        }
        p();
    }

    public final void z() {
        this.a = 2525;
        p();
    }
}
