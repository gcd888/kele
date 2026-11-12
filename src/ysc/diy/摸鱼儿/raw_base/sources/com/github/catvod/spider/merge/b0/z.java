package com.github.catvod.spider.merge.b0;

import java.util.Calendar;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class z implements r {
    public static final z b = new z(0);
    public static final z c = new z(1);
    public static final z d = new z(2);
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.b0.t
    public final void a(StringBuilder sb, Calendar calendar) {
        switch (this.a) {
            case 0:
                B.a(sb, calendar.get(2) + 1);
                break;
            case 1:
                b(sb, calendar.get(1) % 100);
                break;
            default:
                b(sb, calendar.get(2) + 1);
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.b0.r
    public final void b(StringBuilder sb, int i) {
        switch (this.a) {
            case 0:
                B.a(sb, i);
                break;
            case 1:
                B.a(sb, i % 100);
                break;
            default:
                if (i >= 10) {
                    B.a(sb, i);
                } else {
                    sb.append((char) (i + 48));
                }
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.b0.t
    public final int c() {
        switch (this.a) {
        }
        return 2;
    }
}
