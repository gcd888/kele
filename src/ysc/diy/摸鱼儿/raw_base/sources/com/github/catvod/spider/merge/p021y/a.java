package com.github.catvod.spider.merge.p021y;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.RunnableC0240a0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p000a.V;
import com.github.catvod.spider.merge.p022z.P1;
import com.github.catvod.spider.merge.p022z.RunnableC0593y0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ a(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = this.b;
                String strU = b.u(str);
                String str2 = this.d;
                InitOrigin.run(new V(new a(6, str2, str, this.c), str2, strU));
                break;
            case 1:
                String str3 = this.b;
                String strU2 = b.u(str3);
                String str4 = this.c;
                String str5 = this.d;
                InitOrigin.run(new RunnableC0240a0(str5, (Object) strU2, (Object) new a(4, str5, str3, str4), (Object) new a(3, str3, str4, str5), 8));
                break;
            case 2:
                String str6 = this.b;
                String str7 = this.c;
                String str8 = this.d;
                try {
                    if (b.g(str6, str7, str8)) {
                        X0.a("已删除: " + str8 + "，刷新列表生效");
                    } else {
                        X0.a("该网盘不支持删除");
                    }
                } catch (Exception e) {
                    b.x(e, new StringBuilder("删除失败: "));
                    return;
                }
                break;
            case 3:
                String str9 = this.b;
                String strU3 = b.u(str9);
                String str10 = this.d;
                InitOrigin.run(new V(new a(6, str10, str9, this.c), str10, strU3));
                break;
            case 4:
                String str11 = this.c;
                String str12 = this.d;
                String str13 = this.b;
                InitOrigin.run(new RunnableC0593y0(str13, new a(5, str11, str12, str13), 0));
                break;
            case 5:
                InitOrigin.execute(new a(2, this.b, this.c, this.d));
                break;
            default:
                String str14 = this.b;
                InitOrigin.execute(new RunnableC0240a0(this.c, (Object) this.d, (Object) P1.k1(str14), (Object) str14, 4));
                break;
        }
    }
}
