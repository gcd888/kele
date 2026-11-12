package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.LinearLayout;
import com.github.catvod.spider.merge.A.C0239a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0528l implements TextWatcher {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ List c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ C0239a g;
    public final /* synthetic */ C0538n h;

    public C0528l(C0538n c0538n, LinearLayout linearLayout, Activity activity, ArrayList arrayList, String str, String str2, int i, C0239a c0239a) {
        this.h = c0538n;
        this.a = linearLayout;
        this.b = activity;
        this.c = arrayList;
        this.d = str;
        this.e = str2;
        this.f = i;
        this.g = c0239a;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String lowerCase = editable.toString().trim().toLowerCase();
        this.a.removeAllViews();
        boolean zIsEmpty = lowerCase.isEmpty();
        List<String[]> list = this.c;
        Context context = this.b;
        C0538n c0538n = this.h;
        if (zIsEmpty) {
            c0538n.getClass();
            C0538n.a((Activity) context, this.a, (ArrayList) list, this.d, this.e, this.f, this.g);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String[] strArr : list) {
            if ((strArr[2] + strArr[3]).toLowerCase().contains(lowerCase)) {
                arrayList.add(strArr);
            }
        }
        c0538n.getClass();
        C0538n.a((Activity) context, this.a, arrayList, this.d, this.e, this.f, this.g);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
