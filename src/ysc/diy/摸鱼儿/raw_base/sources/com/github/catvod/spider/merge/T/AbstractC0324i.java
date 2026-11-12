package com.github.catvod.spider.merge.T;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.T.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0324i {
    public int c;
    public com.github.catvod.spider.merge.V.f f;
    public C0316a a = null;
    public int b = -1;
    public boolean d = false;
    public final ArrayList e = new ArrayList(4);

    static {
        Collections.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));
    }

    public final void a(k0 k0Var) {
        ArrayList<k0> arrayList = this.e;
        int size = arrayList.size();
        if (arrayList.isEmpty()) {
            this.d = k0Var.b();
        } else if (this.d != k0Var.b()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.b));
            this.d = false;
        }
        for (k0 k0Var2 : arrayList) {
            if (k0Var2.a.b == k0Var.a.b) {
                if (k0Var2.c() != null && k0Var.c() != null && k0Var2.c().equals(k0Var.c())) {
                    return;
                }
                if (k0Var2.b() && k0Var.b()) {
                    return;
                }
            }
        }
        arrayList.add(size, k0Var);
    }

    public abstract int b();

    public final k0 c(int i) {
        return (k0) this.e.get(i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0324i) && this.b == ((AbstractC0324i) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return String.valueOf(this.b);
    }
}
