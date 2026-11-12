package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;
import android.widget.EditText;
import com.github.catvod.spider.merge.A.U0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0562s implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ DialogInterfaceOnClickListenerC0562s(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Throwable {
        switch (this.a) {
            case 0:
                ((InterfaceC0577v) this.b).e(AbstractC0449a.e((EditText) this.c), AbstractC0449a.e((EditText) this.d), AbstractC0449a.e((EditText) this.e));
                break;
            case 1:
                K1 k1 = (K1) this.b;
                k1.getClass();
                P1.H1((String) this.c);
                ((List) this.d).clear();
                ((List) this.e).clear();
                k1.a.saveConfig();
                X0.a("已清除");
                break;
            case 2:
                K1 k2 = (K1) this.b;
                k2.getClass();
                ArrayList arrayList = new ArrayList();
                List list = (List) this.c;
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    String[][] strArr = (String[][]) this.d;
                    boolean[] zArr = (boolean[]) this.e;
                    if (!zHasNext) {
                        for (int i2 = 0; i2 < strArr.length; i2++) {
                            if (zArr[i2] && !arrayList.contains(strArr[i2][0])) {
                                arrayList.add(strArr[i2][0]);
                            }
                        }
                        list.clear();
                        list.addAll(arrayList);
                        k2.a.saveConfig();
                        X0.a("已启用" + list.size() + "个网盘");
                    } else {
                        String str = (String) it.next();
                        for (int i3 = 0; i3 < strArr.length; i3++) {
                            if (strArr[i3][0].equals(str) && zArr[i3]) {
                                arrayList.add(str);
                            }
                        }
                    }
                    break;
                }
                break;
            case 3:
                K1 k3 = (K1) this.b;
                k3.getClass();
                int[] iArr = (int[]) this.d;
                int i4 = ((int[]) this.c)[iArr[0]];
                J1 j1 = k3.a;
                j1.setMaxPerType(i4);
                j1.saveConfig();
                X0.a("每类显示" + ((String[]) this.e)[iArr[0]]);
                break;
            default:
                String str2 = (String) this.b;
                String[] strArr2 = (String[]) this.c;
                if (P1.A(str2, strArr2)) {
                    U0.n(str2, strArr2, (ArrayList) this.d);
                    X0.a(((String) this.e) + "排序已保存");
                    break;
                }
                break;
        }
    }
}
