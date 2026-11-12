package com.github.catvod.spider.merge.p020x;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.AbstractC0244b1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.U.a;
import com.github.catvod.spider.merge.l0.l;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class h {
    public static final HashMap b = new HashMap();
    public final b a;

    public h(b bVar) {
        this.a = bVar;
    }

    public static void d(k kVar, int i, int i2) {
        String strC = kVar.c();
        Pattern pattern = AbstractC0244b1.a;
        if (strC == null) {
            strC = "";
        }
        if (i > 0) {
            int iMax = Math.max(2, String.valueOf(Math.max(i, i2)).length());
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(i);
            StringBuilder sb2 = new StringBuilder();
            for (int length = strValueOf.length(); length < iMax; length++) {
                sb2.append('0');
            }
            sb2.append(strValueOf);
            sb.append(sb2.toString());
            sb.append(". ");
            sb.append(strC);
            strC = sb.toString();
        }
        kVar.o(strC);
    }

    public static int e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!((JSONObject) it.next()).optString("url", "").isEmpty()) {
                i++;
            }
        }
        return i;
    }

    public final void a(String str, LinkedHashMap linkedHashMap, String str2, ArrayList arrayList) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (String str3 : this.a.f) {
            List list = (List) linkedHashMap.get(str3);
            if (list != null && !list.isEmpty()) {
                ArrayList arrayListF = f(list);
                if (!arrayListF.isEmpty()) {
                    String strL = b.l(str3);
                    String str4 = "fishps@@" + URLEncoder.encode(str, "UTF-8") + "@@" + str3 + "@@" + jCurrentTimeMillis;
                    k kVarA = AbstractC0449a.a(str4);
                    StringBuilder sbP = b.p(strL, " (");
                    sbP.append(arrayListF.size());
                    sbP.append("个)");
                    kVarA.o(sbP.toString());
                    kVarA.p(AbstractC0302v0.j(str3));
                    if (!TextUtils.isEmpty(str2)) {
                        strL = b.C(strL, "@", str2);
                    }
                    kVarA.s(strL);
                    kVarA.t("folder");
                    arrayList.add(kVarA);
                    b.put(str4, arrayListF);
                }
            }
        }
    }

    public final void b(LinkedHashMap linkedHashMap, String str, ArrayList arrayList) {
        b bVar = this.a;
        Iterator it = bVar.f.iterator();
        int i = 0;
        int iE = 0;
        while (it.hasNext()) {
            List list = (List) linkedHashMap.get((String) it.next());
            if (list != null) {
                iE += e(f(list));
            }
        }
        for (String str2 : bVar.f) {
            List list2 = (List) linkedHashMap.get(str2);
            if (list2 != null && !list2.isEmpty()) {
                String strL = b.l(str2);
                ArrayList<JSONObject> arrayListF = f(list2);
                Pattern pattern = f.a;
                if (arrayListF.size() >= 2) {
                    Collections.sort(arrayListF, new a(2));
                }
                for (JSONObject jSONObject : arrayListF) {
                    if (!jSONObject.optString("url", "").isEmpty()) {
                        k kVarF = l.f(str2, strL, str, jSONObject);
                        f.m(kVarF, jSONObject, bVar);
                        i++;
                        d(kVarF, i, iE);
                        arrayList.add(kVarF);
                    }
                }
            }
        }
    }

    public final void c(LinkedHashMap linkedHashMap, int[] iArr, Object obj) {
        synchronized (obj) {
            try {
                int i = iArr[0];
                if (i <= 0) {
                    return;
                }
                iArr[0] = Math.max(0, iArr[0] - f.o(linkedHashMap, this.a, i));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList f(List list) {
        e eVarP;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            Pattern pattern = f.a;
            if (this.a.p != 2 || jSONObject == null || (eVarP = f.p(jSONObject.optString("url", ""))) == null || !"bad".equals(eVarP.a)) {
                arrayList.add(jSONObject);
            }
        }
        return arrayList;
    }
}
