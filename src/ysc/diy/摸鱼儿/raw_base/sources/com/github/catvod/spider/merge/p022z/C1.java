package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;
import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p010l.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class C1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C1(K1 k1, ArrayList arrayList, boolean[] zArr, boolean z) {
        this.d = k1;
        this.e = arrayList;
        this.c = zArr;
        this.b = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                K1 k1 = (K1) this.d;
                k1.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                while (true) {
                    List list = (List) this.e;
                    if (i2 >= list.size()) {
                        boolean z = this.b;
                        J1 j1 = k1.a;
                        List customPlugins = z ? j1.getCustomPlugins() : j1.getCustomChannels();
                        customPlugins.clear();
                        customPlugins.addAll(arrayList);
                        LinkedHashSet linkedHashSet = new LinkedHashSet(j1.getChannels());
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet(j1.getPlugins());
                        if (z) {
                            linkedHashSet2.removeAll(arrayList2);
                        } else {
                            linkedHashSet.removeAll(arrayList2);
                        }
                        k1.i(linkedHashSet, linkedHashSet2);
                        X0.a("自定义已保存");
                    } else {
                        if (this.c[i2]) {
                            arrayList.add((String) list.get(i2));
                        } else {
                            arrayList2.add((String) list.get(i2));
                        }
                        i2++;
                    }
                    break;
                }
                break;
            default:
                boolean z2 = this.c[0];
                boolean z3 = this.b;
                if (!PianDan.setFollowHomeEnabled(z3, z2)) {
                    X0.a(PianDan.isHomeMenuReady(z3) ? "至少保留一个首页分类" : "分类配置尚未加载，请重新进入片单后再设置");
                } else {
                    int i3 = ((int[]) this.e)[0] == 1 ? 1 : 0;
                    a aVar = (a) this.d;
                    aVar.k = i3;
                    aVar.k();
                    aVar.q();
                    X0.a("追更展示已保存，重新进入片单后生效");
                }
                break;
        }
    }

    public /* synthetic */ C1(boolean z, boolean[] zArr, a aVar, int[] iArr) {
        this.b = z;
        this.c = zArr;
        this.d = aVar;
        this.e = iArr;
    }
}
