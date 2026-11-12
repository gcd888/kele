package com.github.catvod.spider.merge.O;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class b implements Iterator {
    public int a = -1;
    public int b;
    public int c;
    public com.github.catvod.spider.merge.M.c d;
    public int e;
    public final /* synthetic */ c f;

    public b(c cVar) {
        this.f = cVar;
        int i = cVar.b;
        int length = cVar.a.length();
        if (length < 0) {
            throw new IllegalArgumentException(com.github.catvod.spider.merge.D.b.h("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
        }
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        this.b = i;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0103 A[EDGE_INSN: B:64:0x0103->B:65:0x0104 BREAK  A[LOOP:0: B:36:0x009a->B:47:0x00ca]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:68:0x011b  */
    /* JADX WARN: Code duplicated, block: B:69:0x012b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0141  */
    /* JADX WARN: Code duplicated, block: B:72:0x0144  */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public final void a() {
        int i;
        boolean z;
        boolean z2;
        int i2;
        Object next;
        com.github.catvod.spider.merge.F.a aVar;
        String str;
        Object next2;
        String str2;
        com.github.catvod.spider.merge.F.a aVar2;
        int iIntValue;
        int i3;
        com.github.catvod.spider.merge.M.c cVar;
        int i4 = this.c;
        if (i4 < 0) {
            this.a = 0;
            this.d = null;
            return;
        }
        c cVar2 = this.f;
        int i5 = cVar2.c;
        CharSequence charSequence = cVar2.a;
        if (i5 > 0) {
            int i6 = this.e + 1;
            this.e = i6;
            if (i6 >= i5) {
                this.d = new com.github.catvod.spider.merge.M.c(this.b, l.b(charSequence));
                this.c = -1;
            } else if (i4 > charSequence.length()) {
                this.d = new com.github.catvod.spider.merge.M.c(this.b, l.b(charSequence));
                this.c = -1;
            } else {
                i = this.c;
                k kVar = cVar2.d;
                kVar.getClass();
                com.github.catvod.spider.merge.L.a.d(charSequence, "$this$$receiver");
                List list = kVar.a;
                z = kVar.b;
                if (z || list.size() != 1) {
                    if (i < 0) {
                        i = 0;
                    }
                    com.github.catvod.spider.merge.M.c cVar3 = new com.github.catvod.spider.merge.M.c(i, charSequence.length());
                    z2 = charSequence instanceof String;
                    i2 = cVar3.c;
                    int i7 = cVar3.b;
                    if (!z2) {
                        if ((i2 <= 0 && i <= i7) || (i2 < 0 && i7 <= i)) {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    } else {
                                        next = it.next();
                                        str = (String) next;
                                    }
                                } while (!l.j(str, charSequence, i, str.length(), z));
                                String str3 = (String) next;
                                if (str3 == null) {
                                    if (i == i7) {
                                        aVar = null;
                                        break;
                                    }
                                    i += i2;
                                } else {
                                    aVar = new com.github.catvod.spider.merge.F.a(Integer.valueOf(i), str3);
                                    break;
                                }
                            }
                        } else {
                            aVar = null;
                            break;
                        }
                    } else if ((i2 <= 0 && i <= i7) || (i2 < 0 && i7 <= i)) {
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                } else {
                                    next2 = it2.next();
                                    str2 = (String) next2;
                                }
                            } while (!l.i(str2, (String) charSequence, i, str2.length(), z));
                            String str4 = (String) next2;
                            if (str4 == null) {
                                if (i == i7) {
                                    aVar = null;
                                    break;
                                }
                                i += i2;
                            } else {
                                aVar = new com.github.catvod.spider.merge.F.a(Integer.valueOf(i), str4);
                                break;
                            }
                        }
                    } else {
                        aVar = null;
                        break;
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str5 = (String) list.get(0);
                    int iE = l.e(charSequence, str5, i, false, 4);
                    if (iE < 0) {
                        aVar = null;
                        break;
                    }
                    aVar = new com.github.catvod.spider.merge.F.a(Integer.valueOf(iE), str5);
                }
                if (aVar != null) {
                }
                if (aVar2 == null) {
                    this.d = new com.github.catvod.spider.merge.M.c(this.b, l.b(charSequence));
                    this.c = -1;
                } else {
                    iIntValue = ((Number) aVar2.a).intValue();
                    int iIntValue2 = ((Number) aVar2.b).intValue();
                    i3 = this.b;
                    if (iIntValue <= Integer.MIN_VALUE) {
                        cVar = com.github.catvod.spider.merge.M.c.d;
                    } else {
                        cVar = new com.github.catvod.spider.merge.M.c(i3, iIntValue - 1);
                    }
                    this.d = cVar;
                    int i8 = iIntValue + iIntValue2;
                    this.b = i8;
                    this.c = i8 + (iIntValue2 == 0 ? 1 : 0);
                }
            }
        } else if (i4 > charSequence.length()) {
            this.d = new com.github.catvod.spider.merge.M.c(this.b, l.b(charSequence));
            this.c = -1;
        } else {
            i = this.c;
            k kVar2 = cVar2.d;
            kVar2.getClass();
            com.github.catvod.spider.merge.L.a.d(charSequence, "$this$$receiver");
            List list2 = kVar2.a;
            z = kVar2.b;
            if (z) {
                if (i < 0) {
                    i = 0;
                }
                com.github.catvod.spider.merge.M.c cVar4 = new com.github.catvod.spider.merge.M.c(i, charSequence.length());
                z2 = charSequence instanceof String;
                i2 = cVar4.c;
                int i9 = cVar4.b;
                if (!z2) {
                    if (i2 <= 0) {
                    }
                    aVar = null;
                    break;
                } else {
                    if (i2 <= 0) {
                    }
                    aVar = null;
                    break;
                }
            }
            if (i < 0) {
                i = 0;
            }
            com.github.catvod.spider.merge.M.c cVar5 = new com.github.catvod.spider.merge.M.c(i, charSequence.length());
            z2 = charSequence instanceof String;
            i2 = cVar5.c;
            int i10 = cVar5.b;
            if (!z2) {
                if (i2 <= 0) {
                }
                aVar = null;
                break;
            } else {
                if (i2 <= 0) {
                }
                aVar = null;
                break;
            }
            aVar2 = aVar != null ? new com.github.catvod.spider.merge.F.a(aVar.a, Integer.valueOf(((String) aVar.b).length())) : null;
            if (aVar2 == null) {
                this.d = new com.github.catvod.spider.merge.M.c(this.b, l.b(charSequence));
                this.c = -1;
            } else {
                iIntValue = ((Number) aVar2.a).intValue();
                int iIntValue3 = ((Number) aVar2.b).intValue();
                i3 = this.b;
                if (iIntValue <= Integer.MIN_VALUE) {
                    cVar = com.github.catvod.spider.merge.M.c.d;
                } else {
                    cVar = new com.github.catvod.spider.merge.M.c(i3, iIntValue - 1);
                }
                this.d = cVar;
                int i11 = iIntValue + iIntValue3;
                this.b = i11;
                this.c = i11 + (iIntValue3 == 0 ? 1 : 0);
            }
        }
        this.a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            throw new NoSuchElementException();
        }
        com.github.catvod.spider.merge.M.c cVar = this.d;
        if (cVar != null) {
            this.d = null;
            this.a = -1;
            return cVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
        com.github.catvod.spider.merge.L.a.e(nullPointerException);
        throw nullPointerException;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
