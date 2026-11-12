package com.github.catvod.spider.merge.A;

import android.widget.EditText;
import com.github.catvod.spider.InitOrigin;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class P implements F0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ P(EditText editText, Object obj, int i) {
        this.a = i;
        this.c = editText;
        this.b = obj;
    }

    @Override // com.github.catvod.spider.merge.A.F0
    public final void a(String str, String str2) {
        switch (this.a) {
            case 0:
                ((C0252e0) this.b).i.post(new r(str, (EditText) this.c, str2, 5));
                break;
            case 1:
                AtomicInteger atomicInteger = (AtomicInteger) this.b;
                if ("captcha_angle".equals(str)) {
                    try {
                        atomicInteger.set(Integer.parseInt(str2));
                        break;
                    } catch (Exception unused) {
                    }
                    ((CountDownLatch) this.c).countDown();
                }
                break;
            case 2:
                InitOrigin.run(new RunnableC0240a0(str, this.c, (Object) str2, this.b, 14));
                break;
            case 3:
                InitOrigin.run(new RunnableC0240a0(this.c, this.b, (Object) str, (Object) str2, 18));
                break;
            default:
                InitOrigin.run(new RunnableC0240a0(this.b, this.c, str, (Object) str2, 17));
                break;
        }
    }

    public /* synthetic */ P(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
