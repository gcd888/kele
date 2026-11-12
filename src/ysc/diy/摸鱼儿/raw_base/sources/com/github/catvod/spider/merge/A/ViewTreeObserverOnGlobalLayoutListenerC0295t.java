package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.github.catvod.spider.merge.M.C0034;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import moyu.fucking.C0152;
import moyu.fucking.C0157;
import moyu.fucking.C0168;
import moyu.fucking.C0176;
import moyu.fucking.C0186;
import moyu.fucking.C0194;
import moyu.fucking.C0195;
import moyu.fucking.C0221;
import moyu.fucking.C0233;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC0295t implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ViewGroup a;
    public final Activity b;
    public final C0304w c;

    public ViewTreeObserverOnGlobalLayoutListenerC0295t(C0304w c0304w, ViewGroup viewGroup, Activity activity) throws Throwable {
        this.c = c0304w;
        this.a = viewGroup;
        this.b = activity;
        int iIntValue = ((Integer) C0168.n(82191, null, new Object[0])).intValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iIntValue <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    C0157.n(99237, (PrintStream) C0195.n(72538), new Object[]{Double.valueOf(((Double) C0157.n(3141, null, new Object[]{(String) C0221.n(97632, null, new Object[]{(String) C0194.n(6827)})})).doubleValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws Throwable {
        Object[] objArr = null;
        r rVar = null;
        Object[] objArr2 = null;
        ViewTreeObserver viewTreeObserver = null;
        C0304w c0304w = null;
        Activity activity = null;
        Object[] objArr3 = null;
        WeakReference weakReference = null;
        ViewGroup viewGroup = null;
        Object objN = null;
        String str = "ۧۢ۠";
        while (true) {
            switch (C0034.m132(str)) {
                case 56420:
                    C0152.n(52927, null, objArr2);
                    str = "ۤ۠ۢ";
                    break;
                case 56510:
                    str = "ۧۨۦ";
                    viewGroup = (ViewGroup) objN;
                    break;
                case 1746692:
                    str = "۟ۨۧ";
                    weakReference = new WeakReference(null);
                    break;
                case 1746752:
                    C0233.n(82042, viewTreeObserver, objArr);
                    str = "ۣۢۡ";
                    break;
                case 1746974:
                    c0304w.p = weakReference;
                    str = "ۣۣۨ";
                    break;
                case 1747713:
                    str = "ۣۣۢ";
                    c0304w = (C0304w) objN;
                    break;
                case 1748738:
                    str = "ۣۥۢ";
                    objArr = new Object[1];
                    break;
                case 1749574:
                    str = "ۧۤۨ";
                    objArr2 = new Object[1];
                    break;
                case 1749636:
                    objN = C0176.n(3420, this);
                    str = "۠ۡۢ";
                    break;
                case 1750628:
                    c0304w.o = null;
                    str = "۟۟ۤ";
                    break;
                case 1750720:
                    objArr[0] = this;
                    str = "۟ۡۢ";
                    break;
                case 1751526:
                    return;
                case 1752580:
                    str = "ۣۡۤ";
                    viewTreeObserver = (ViewTreeObserver) objN;
                    break;
                case 1752608:
                    objN = C0186.n(99383, viewGroup, objArr3);
                    str = "ۥۣۢ";
                    break;
                case 1754439:
                    str = "۟ۦۢ";
                    activity = (Activity) objN;
                    break;
                case 1754469:
                    objN = C0194.n(52015, this);
                    str = "ۦۤ";
                    break;
                case 1754539:
                    objArr2[0] = rVar;
                    str = "ۣۧ";
                    break;
                case 1754661:
                    str = "ۥۤ۟";
                    objArr3 = new Object[0];
                    break;
                case 1755464:
                    objN = C0194.n(49262, this);
                    str = "ۧۡۡ";
                    break;
                default:
                    str = "ۣۢ۟";
                    rVar = new r(this, activity, viewGroup, 1);
                    break;
            }
        }
    }
}
