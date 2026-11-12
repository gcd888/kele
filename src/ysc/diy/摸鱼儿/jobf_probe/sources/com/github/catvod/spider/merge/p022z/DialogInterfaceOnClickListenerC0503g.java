package com.github.catvod.spider.merge.p022z;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.SeekBar;
import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.U0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.p010l.a;
import com.github.catvod.spider.merge.p017u.E;
import com.github.catvod.spider.merge.p018v.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0503g implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ DialogInterfaceOnClickListenerC0503g(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        int i3 = 0;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (this.a) {
            case 0:
                ((C0538n) obj3).getClass();
                HashSet hashSet = new HashSet();
                int i4 = 0;
                while (true) {
                    String[][] strArr = b.a;
                    if (i4 >= 5) {
                        if (hashSet.isEmpty()) {
                            X0.a("至少启用一个平台");
                            for (int i5 = 0; i5 < 5; i5++) {
                                hashSet.add(strArr[i5][0]);
                            }
                        }
                        ((C0239a) obj).getClass();
                        try {
                            JSONObject jSONObjectJ = C0239a.j();
                            jSONObjectJ.put("enabledSites", new JSONArray((Collection) hashSet));
                            C0297t1.j("alllive_config.json", jSONObjectJ.toString());
                        } catch (Exception e) {
                            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[ALLLiveStorage] setEnabledSites error: "));
                        }
                        X0.a("设置已保存");
                    } else {
                        if (((boolean[]) obj2)[i4]) {
                            hashSet.add(strArr[i4][0]);
                        }
                        i4++;
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = new ArrayList();
                while (true) {
                    boolean[] zArr = (boolean[]) obj2;
                    if (i3 < zArr.length) {
                        if (!zArr[i3]) {
                            arrayList.add(((String[]) obj3)[i3]);
                        }
                        i3++;
                    } else if (!arrayList.isEmpty()) {
                        ((G) obj).b(arrayList);
                    }
                    break;
                }
                break;
            case 2:
                P1.H1((String) obj3);
                ((com.github.catvod.spider.merge.p005f.b) obj2).c(((EditText) obj).getText().toString().trim());
                break;
            case 3:
                K1 k1 = (K1) obj3;
                k1.getClass();
                List list = (List) obj2;
                list.clear();
                Iterator it = ((ArrayList) obj).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    J1 j1 = k1.a;
                    if (!zHasNext) {
                        j1.saveConfig();
                        X0.a("排序已保存");
                    } else {
                        String str = (String) it.next();
                        for (String[] strArr2 : j1.getPanTypes()) {
                            if (strArr2[1].equals(str)) {
                                str = strArr2[0];
                            }
                            break;
                        }
                        list.add(str);
                    }
                    break;
                }
                break;
            case 4:
                K1 k2 = (K1) obj3;
                k2.getClass();
                int i6 = ((int[]) obj2)[((int[]) obj)[0]];
                J1 j2 = k2.a;
                j2.setLinkCheckMode(i6);
                j2.saveConfig();
                X0.a("检测设置已保存");
                break;
            case 5:
                K1 k3 = (K1) obj3;
                k3.getClass();
                boolean[] zArr2 = (boolean[]) obj2;
                int i7 = 0;
                for (boolean z : zArr2) {
                    if (z) {
                        i7++;
                    }
                }
                if (i7 == 0) {
                    X0.a("至少保留一个启用接口");
                } else {
                    int i8 = 0;
                    while (true) {
                        List list2 = (List) obj;
                        int size = list2.size();
                        J1 j3 = k3.a;
                        if (i8 >= size) {
                            for (int i9 = 0; i9 < list2.size(); i9++) {
                                if (!zArr2[i9]) {
                                    j3.setApiEnabled((String) list2.get(i9), false);
                                }
                            }
                            j3.saveConfig();
                            X0.a("已启用 " + j3.getEnabledApiCount() + " 个接口");
                        } else {
                            if (zArr2[i8]) {
                                j3.setApiEnabled((String) list2.get(i8), true);
                            }
                            i8++;
                        }
                    }
                }
                break;
            case 6:
                StringBuilder sb = new StringBuilder();
                while (true) {
                    boolean[] zArr3 = (boolean[]) obj2;
                    if (i3 >= zArr3.length) {
                        E e2 = (E) obj;
                        if (e2 != null) {
                            e2.a(sb.toString());
                        }
                    } else {
                        if (zArr3[i3]) {
                            if (sb.length() > 0) {
                                sb.append(" ");
                            }
                            sb.append(((String[][]) obj3)[i3][1]);
                        }
                        i3++;
                    }
                    break;
                }
                break;
            case 7:
                P1.H1((String) obj3);
                String strTrim = ((EditText) obj2).getText().toString().trim();
                E e3 = (E) obj;
                if (e3 != null && !TextUtils.isEmpty(strTrim)) {
                    e3.a(strTrim);
                    break;
                }
                break;
            case 8:
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    boolean[] zArr4 = (boolean[]) obj2;
                    if (i3 >= zArr4.length) {
                        E e4 = (E) obj;
                        if (e4 != null && !arrayList2.isEmpty()) {
                            e4.a(arrayList2);
                            break;
                        }
                    } else {
                        if (zArr4[i3]) {
                            arrayList2.add((String) ((List) obj3).get(i3));
                        }
                        i3++;
                    }
                }
                break;
            case 9:
                C0559r1 c0559r1 = (C0559r1) obj3;
                c0559r1.getClass();
                ArrayList arrayList3 = new ArrayList();
                while (true) {
                    boolean[] zArr5 = (boolean[]) obj2;
                    if (i3 < zArr5.length) {
                        if (!zArr5[i3]) {
                            arrayList3.add((String) ((List) obj).get(i3));
                        }
                        i3++;
                    } else if (!arrayList3.isEmpty()) {
                        InterfaceC0476a2 interfaceC0476a2 = (InterfaceC0476a2) c0559r1.a;
                        interfaceC0476a2.removeItems(arrayList3);
                        interfaceC0476a2.saveConfig();
                        X0.a("已删除 " + arrayList3.size() + " 个" + ((C0481b2) c0559r1.b).b + "，刷新生效");
                    }
                    break;
                }
                break;
            case 10:
                C0559r1 c0559r2 = (C0559r1) obj3;
                c0559r2.getClass();
                ((Runnable) obj2).run();
                String strTrim2 = ((EditText) obj).getText().toString().trim();
                if (!TextUtils.isEmpty(strTrim2)) {
                    c0559r2.m(strTrim2);
                }
                break;
            case 11:
                ((AtomicInteger) obj3).set(((SeekBar) obj2).getProgress());
                ((CountDownLatch) obj).countDown();
                break;
            case 12:
                P1.H1((String) obj3);
                a aVar = (a) obj2;
                aVar.b = ((EditText) obj).getText().toString();
                aVar.k();
                aVar.q();
                X0.a("TMDB配置已保存");
                break;
            case 13:
                try {
                    i2 = Integer.parseInt(((EditText) obj2).getText().toString().trim());
                } catch (Exception unused) {
                    i2 = 7;
                }
                a aVar2 = (a) obj3;
                aVar2.i = i2;
                aVar2.k();
                aVar2.j = ((int[]) obj)[0] == 1 ? 1 : 0;
                aVar2.k();
                aVar2.q();
                X0.a("海报墙体验已保存");
                break;
            default:
                String str2 = (String) obj3;
                String[] strArr3 = (String[]) obj2;
                if (P1.A(str2, strArr3)) {
                    String[] strArr4 = U0.a;
                    U0.n(str2, strArr3, Arrays.asList(strArr3));
                    X0.a(((String) obj) + "排序已重置");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0503g(boolean[] zArr, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = zArr;
        this.c = obj;
        this.d = obj2;
    }
}
