package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.spider.merge.E.C0015;
import com.github.catvod.spider.merge.G.C0023;
import com.github.catvod.spider.merge.L.C0031;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.X.C0052;
import com.github.catvod.spider.merge.b0.C0060;
import com.github.catvod.spider.merge.p0.C0111;
import com.github.catvod.spider.merge.p007h.C0083;
import com.github.catvod.spider.merge.p007h.C0084;
import com.github.catvod.spider.merge.p017u.C0129;
import com.github.catvod.spider.merge.p020x.C0136;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import moyu.fucking.C0149;
import moyu.fucking.C0162;
import moyu.fucking.C0173;
import moyu.fucking.C0176;
import moyu.fucking.C0178;
import moyu.fucking.C0179;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0186;
import moyu.fucking.C0188;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0233;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f149short = {1617, 1626, 1621, 1624, 1615, 1640, 1626, 1624, 1621, 1630, 1627, 1618, 2046, 2044, 2026, 2022, 1996, 2039, 2034, 2045, 2046, 2022, 1996, 2033, 2023, 2045, 1854, 1840, 1836, 1826, 1850, 1831, 1841, 480, 482, 496, 503};
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i) throws Throwable {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        int iIntValue = ((Integer) C0176.n(13292, null, new Object[0])).intValue();
        int i2 = 1616;
        while (true) {
            i2 ^= 1633;
            switch (i2) {
                case 14:
                    break;
                case 49:
                    if (iIntValue <= 0) {
                        i2 = 1709;
                    }
                    break;
                case 204:
                    C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0178.n(16623, null, new Object[]{(String) C0181.n(27101, null, new Object[]{(String) C0176.n(8894)})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i2 = 1678;
        }
    }

    /* JADX WARN: Code duplicated, block: B:759:0x07d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:0x07cb A[DONT_GENERATE, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int iIntValue;
        ImageView imageView;
        int i;
        TextView textView;
        Object imageView2;
        int iIntValue2;
        int i2;
        int i3;
        String str = (String) C0198.n(68788, null, new Object[]{(short[]) C0176.n(6178), 0, Integer.valueOf(C0136.f345 ^ 733), 1591});
        String str2 = (String) C0198.n(43897, null, new Object[]{(short[]) C0176.n(6178), 12, Integer.valueOf(C0111.f320 ^ (-942)), 1939});
        switch (((Integer) C0176.n(88690, this)).intValue()) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC0292s viewTreeObserverOnGlobalLayoutListenerC0292s = (ViewTreeObserverOnGlobalLayoutListenerC0292s) C0176.n(98024, this);
                C0304w c0304w = (C0304w) C0176.n(97061, viewTreeObserverOnGlobalLayoutListenerC0292s);
                Activity activity = (Activity) C0176.n(45462, this);
                boolean zBooleanValue = ((Boolean) C0188.n(81111, activity, new Object[0])).booleanValue();
                int i4 = 1514416;
                while (true) {
                    i4 ^= 1514433;
                    switch (i4) {
                        case 14:
                            break;
                        case 47:
                            return;
                        case 113:
                            if (!zBooleanValue) {
                                i4 = 1515160;
                            }
                            break;
                        case 1369:
                            boolean zBooleanValue2 = ((Boolean) C0188.n(12187, activity, new Object[0])).booleanValue();
                            int i5 = 1515191;
                            while (true) {
                                i5 ^= 1515208;
                                switch (i5) {
                                    case 30:
                                        break;
                                    case 61:
                                        ImageView imageView3 = (ImageView) C0176.n(7405, this);
                                        ViewGroup viewGroup = (ViewGroup) ((ViewParent) C0173.n(9648, imageView3, new Object[0]));
                                        int i6 = 1515439;
                                        while (true) {
                                            i6 ^= 1515456;
                                            switch (i6) {
                                                case 111:
                                                    if (viewGroup == null) {
                                                        i6 = 1516183;
                                                    }
                                                    break;
                                                case 15703:
                                                    int i7 = 1516214;
                                                    while (true) {
                                                        i7 ^= 1516231;
                                                        switch (i7) {
                                                            case 18:
                                                                return;
                                                            case 113:
                                                                i7 = 1516245;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 15769:
                                                    break;
                                                case 15800:
                                                    View view = (View) C0186.n(97960, viewGroup, new Object[]{str2});
                                                    int i8 = 1516338;
                                                    while (true) {
                                                        i8 ^= 1516355;
                                                        switch (i8) {
                                                            case 18:
                                                                break;
                                                            case 51:
                                                                int iIntValue3 = ((Integer) C0176.n(42461, imageView3, new Object[0])).intValue() - (((Integer) C0176.n(41351, imageView3, new Object[0])).intValue() - (0 - ((Integer) C0176.n(99400, imageView3, new Object[0])).intValue()));
                                                                int i9 = 1537418;
                                                                while (true) {
                                                                    i9 ^= 1537435;
                                                                    switch (i9) {
                                                                        case 17:
                                                                            i9 = iIntValue3 <= 0 ? 1537511 : 1537480;
                                                                            break;
                                                                        case 50:
                                                                            break;
                                                                        case 83:
                                                                            iIntValue = iIntValue3;
                                                                            break;
                                                                        case 124:
                                                                            iIntValue = ((Integer) C0176.n(5584, null, new Object[]{activity, Integer.valueOf(C0034.f190 ^ 156)})).intValue();
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                ImageView imageView4 = new ImageView(activity);
                                                                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) C0233.n(55114, imageView3, new Object[0]);
                                                                int i10 = 1537542;
                                                                while (true) {
                                                                    i10 ^= 1537559;
                                                                    switch (i10) {
                                                                        case 17:
                                                                            i10 = layoutParams != null ? 1538286 : 1538255;
                                                                            break;
                                                                        case 3751:
                                                                            break;
                                                                        case 3800:
                                                                            break;
                                                                        case 3833:
                                                                            boolean z = layoutParams instanceof LinearLayout.LayoutParams;
                                                                            int i11 = 1538317;
                                                                            while (true) {
                                                                                i11 ^= 1538334;
                                                                                switch (i11) {
                                                                                    case 19:
                                                                                        i11 = z ? 1538410 : 1538379;
                                                                                        break;
                                                                                    case 50:
                                                                                        break;
                                                                                    case 85:
                                                                                        C0233.n(47437, imageView4, new Object[]{new ViewGroup.LayoutParams(layoutParams)});
                                                                                        break;
                                                                                    case 116:
                                                                                        C0233.n(47437, imageView4, new Object[]{new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams)});
                                                                                        int i12 = 1538441;
                                                                                        while (true) {
                                                                                            i12 ^= 1538458;
                                                                                            switch (i12) {
                                                                                                case 19:
                                                                                                    i12 = 1538472;
                                                                                                    continue;
                                                                                                case 50:
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0176.n(32299, imageView4, new Object[]{Integer.valueOf(((Integer) C0233.n(30526, imageView3, new Object[0])).intValue()), Integer.valueOf(((Integer) C0176.n(99400, imageView3, new Object[0])).intValue()), Integer.valueOf(((Integer) C0233.n(61659, imageView3, new Object[0])).intValue()), Integer.valueOf(((Integer) C0176.n(41351, imageView3, new Object[0])).intValue())});
                                                                C0176.n(63562, imageView4, new Object[]{Boolean.valueOf(((Boolean) C0173.n(70940, imageView3, new Object[0])).booleanValue())});
                                                                C0233.n(95238, imageView4, new Object[]{Boolean.valueOf(((Boolean) C0233.n(13802, imageView3, new Object[0])).booleanValue())});
                                                                C0176.n(69587, imageView4, new Object[]{Boolean.valueOf(((Boolean) C0233.n(16202, imageView3, new Object[0])).booleanValue())});
                                                                Drawable drawable = (Drawable) C0233.n(77576, imageView3, new Object[0]);
                                                                int i13 = 1539216;
                                                                while (true) {
                                                                    i13 ^= 1539233;
                                                                    switch (i13) {
                                                                        case 14:
                                                                            break;
                                                                        case 49:
                                                                            i13 = drawable != null ? 1539309 : 1539278;
                                                                            break;
                                                                        case 76:
                                                                            Drawable.ConstantState constantState = (Drawable.ConstantState) C0233.n(40321, drawable, new Object[0]);
                                                                            int i14 = 1539340;
                                                                            while (true) {
                                                                                i14 ^= 1539357;
                                                                                switch (i14) {
                                                                                    case 17:
                                                                                        i14 = constantState != null ? 1539433 : 1539402;
                                                                                        break;
                                                                                    case 54:
                                                                                        break;
                                                                                    case 87:
                                                                                        break;
                                                                                    case 116:
                                                                                        C0233.n(29975, imageView4, new Object[]{(Drawable) C0233.n(58525, (Drawable.ConstantState) C0233.n(40321, drawable, new Object[0]), new Object[0])});
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 111:
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                C0233.n(79182, imageView4, new Object[]{(ImageView.ScaleType) C0233.n(60467, imageView3, new Object[0])});
                                                                C0233.n(35652, imageView4, new Object[]{Boolean.valueOf(((Boolean) C0233.n(83904, imageView3, new Object[0])).booleanValue())});
                                                                C0233.n(62447, imageView4, new Object[]{Boolean.valueOf(((Boolean) C0233.n(19835, imageView3, new Object[0])).booleanValue())});
                                                                C0233.n(33396, imageView4, new Object[]{Float.valueOf(((Float) C0233.n(18303, imageView3, new Object[0])).floatValue())});
                                                                C0176.n(39517, imageView4, new Object[]{(BitmapDrawable) C0176.n(78943, null, new Object[]{activity, Integer.valueOf(iIntValue)})});
                                                                C0176.n(60008, imageView4, new Object[]{str2});
                                                                C0176.n(2044, imageView4, new Object[]{new ViewOnClickListenerC0284p(c0304w, activity, C0023.f179 ^ 696)});
                                                                C0176.n(11393, imageView4, new Object[]{new ViewOnLongClickListenerC0269k(c0304w, activity, 0)});
                                                                C0176.n(21767, null, new Object[]{imageView4});
                                                                boolean zBooleanValue3 = ((Boolean) C0182.n(55567, str, new Object[]{(String) C0186.n(19247)})).booleanValue();
                                                                int i15 = 1539464;
                                                                while (true) {
                                                                    i15 ^= 1539481;
                                                                    switch (i15) {
                                                                        case 17:
                                                                            i15 = zBooleanValue3 ? 1540208 : 1540177;
                                                                            break;
                                                                        case 64939:
                                                                            break;
                                                                        case 64968:
                                                                            C0176.n(63996, viewGroup, new Object[]{imageView4});
                                                                            break;
                                                                        case 65001:
                                                                            C0176.n(34284, viewGroup, new Object[]{imageView4, Integer.valueOf(((Integer) C0176.n(13122, null, new Object[]{0, Integer.valueOf(((((Integer) C0173.n(62853, viewGroup, new Object[]{imageView3})).intValue() + 5) - 1) - 5)})).intValue())});
                                                                            int i16 = 1540239;
                                                                            while (true) {
                                                                                i16 ^= 1540256;
                                                                                switch (i16) {
                                                                                    case 14:
                                                                                        break;
                                                                                    case 47:
                                                                                        i16 = 1540270;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                ((Boolean) C0179.n(13382, (ArrayList) C0176.n(94931, c0304w), new Object[]{new WeakReference(imageView4)})).booleanValue();
                                                                return;
                                                            case 113:
                                                                if (view != null) {
                                                                    i8 = 1537263;
                                                                }
                                                                break;
                                                            case 22444:
                                                                int i17 = 1537294;
                                                                while (true) {
                                                                    i17 ^= 1537311;
                                                                    switch (i17) {
                                                                        case 17:
                                                                            i17 = 1537325;
                                                                            break;
                                                                        case 50:
                                                                            return;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                        i8 = 1516400;
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i6 = 1516152;
                                        }
                                        break;
                                    case 127:
                                        if (zBooleanValue2) {
                                            i5 = 1515284;
                                        }
                                        break;
                                    case 476:
                                        int i18 = 1515315;
                                        while (true) {
                                            i18 ^= 1515332;
                                            switch (i18) {
                                                case 22:
                                                    return;
                                                case 119:
                                                    i18 = 1515346;
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i5 = 1515253;
                            }
                            break;
                        default:
                            continue;
                    }
                    i4 = 1514478;
                }
                break;
            case 1:
                ViewTreeObserverOnGlobalLayoutListenerC0295t viewTreeObserverOnGlobalLayoutListenerC0295t = (ViewTreeObserverOnGlobalLayoutListenerC0295t) C0176.n(98024, this);
                C0304w c0304w2 = (C0304w) C0176.n(3420, viewTreeObserverOnGlobalLayoutListenerC0295t);
                Activity activity2 = (Activity) C0176.n(45462, this);
                boolean zBooleanValue4 = ((Boolean) C0188.n(81111, activity2, new Object[0])).booleanValue();
                int i19 = 55432;
                while (true) {
                    i19 ^= 55449;
                    switch (i19) {
                        case 17:
                            if (!zBooleanValue4) {
                                i19 = 55525;
                            }
                            break;
                        case 62:
                            break;
                        case 95:
                            return;
                        case 124:
                            boolean zBooleanValue5 = ((Boolean) C0188.n(12187, activity2, new Object[0])).booleanValue();
                            int i20 = 55556;
                            while (true) {
                                i20 ^= 55573;
                                switch (i20) {
                                    case 17:
                                        if (zBooleanValue5) {
                                            i20 = 55649;
                                        }
                                        break;
                                    case 54:
                                        break;
                                    case 87:
                                        ViewGroup viewGroup2 = (ViewGroup) C0176.n(7405, this);
                                        View view2 = (View) C0186.n(97960, viewGroup2, new Object[]{str2});
                                        int i21 = 56455;
                                        while (true) {
                                            i21 ^= 56472;
                                            switch (i21) {
                                                case 31:
                                                    if (view2 != null) {
                                                        i21 = 56548;
                                                    }
                                                    break;
                                                case 62:
                                                    break;
                                                case 93:
                                                    int iIntValue4 = ((Integer) C0173.n(85660, viewGroup2, new Object[0])).intValue();
                                                    boolean zBooleanValue6 = ((Boolean) C0182.n(55567, str, new Object[]{(String) C0186.n(19247)})).booleanValue();
                                                    int i22 = 1507503;
                                                    while (true) {
                                                        i22 ^= 1507520;
                                                        switch (i22) {
                                                            case 14:
                                                                break;
                                                            case 45:
                                                                imageView = null;
                                                                i = -1;
                                                                break;
                                                            case 111:
                                                                i22 = zBooleanValue6 ? 1507596 : 1507565;
                                                                break;
                                                            case 460:
                                                                ImageView imageView5 = (ImageView) ((View) C0186.n(53923, null, new Object[]{activity2, (String) C0162.n(76230, null, new Object[]{(short[]) C0176.n(6178), 33, Integer.valueOf(C0052.f208 ^ (-113)), 387}), ImageView.class}));
                                                                int i23 = 1507627;
                                                                while (true) {
                                                                    i23 ^= 1507644;
                                                                    switch (i23) {
                                                                        case 23:
                                                                            i23 = imageView5 != null ? 1507720 : 1507689;
                                                                            break;
                                                                        case 85:
                                                                            imageView = null;
                                                                            i = -1;
                                                                            break;
                                                                        case 118:
                                                                            break;
                                                                        case 180:
                                                                            int iIntValue5 = ((Integer) C0173.n(62853, viewGroup2, new Object[]{imageView5})).intValue();
                                                                            int i24 = 1507751;
                                                                            while (true) {
                                                                                i24 ^= 1507768;
                                                                                switch (i24) {
                                                                                    case 31:
                                                                                        i24 = 1508433;
                                                                                        continue;
                                                                                    case 1513:
                                                                                        imageView = imageView5;
                                                                                        i = iIntValue5;
                                                                                        break;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    int i25 = 1508526;
                                                    while (true) {
                                                        i25 ^= 1508543;
                                                        switch (i25) {
                                                            case 17:
                                                                if (imageView == null) {
                                                                    i25 = 1508619;
                                                                    continue;
                                                                } else {
                                                                    i25 = 1508588;
                                                                }
                                                                break;
                                                            case 83:
                                                                break;
                                                            case 114:
                                                                i25 = 1508588;
                                                                break;
                                                            case 436:
                                                                int i26 = (C0129.f338 ^ (-915)) + iIntValue4;
                                                                while (true) {
                                                                    int i27 = i26;
                                                                    int i28 = 1508650;
                                                                    while (true) {
                                                                        i28 ^= 1508667;
                                                                        switch (i28) {
                                                                            case 17:
                                                                                i28 = i27 >= 0 ? 1509394 : 1508712;
                                                                                break;
                                                                            case 83:
                                                                                break;
                                                                            case 114:
                                                                                break;
                                                                            case 3369:
                                                                                View view3 = (View) C0173.n(11421, viewGroup2, new Object[]{Integer.valueOf(i27)});
                                                                                boolean z2 = view3 instanceof ImageView;
                                                                                int i29 = 1509425;
                                                                                while (true) {
                                                                                    i29 ^= 1509442;
                                                                                    switch (i29) {
                                                                                        case 18:
                                                                                            break;
                                                                                        case 45:
                                                                                            i26 = (-1) - (0 - i27);
                                                                                            i2 = 1510448;
                                                                                            while (true) {
                                                                                                i2 ^= 1510465;
                                                                                                switch (i2) {
                                                                                                    case 14:
                                                                                                        break;
                                                                                                    case 113:
                                                                                                        i2 = 1510479;
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 115:
                                                                                            i29 = z2 ? 1509518 : 1509487;
                                                                                            break;
                                                                                        case 204:
                                                                                            int iIntValue6 = ((Integer) C0173.n(34897, view3, new Object[0])).intValue();
                                                                                            int i30 = 1509549;
                                                                                            while (true) {
                                                                                                i30 ^= 1509566;
                                                                                                switch (i30) {
                                                                                                    case 19:
                                                                                                        i30 = iIntValue6 == 0 ? 1509642 : 1509611;
                                                                                                        break;
                                                                                                    case 85:
                                                                                                        i26 = (-1) - (0 - i27);
                                                                                                        i2 = 1510448;
                                                                                                        while (true) {
                                                                                                            i2 ^= 1510465;
                                                                                                            switch (i2) {
                                                                                                                case 14:
                                                                                                                    break;
                                                                                                                case 113:
                                                                                                                    i2 = 1510479;
                                                                                                                    break;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case 114:
                                                                                                        break;
                                                                                                    case 436:
                                                                                                        ImageView imageView6 = (ImageView) view3;
                                                                                                        int i31 = 1509673;
                                                                                                        while (true) {
                                                                                                            i31 ^= 1509690;
                                                                                                            switch (i31) {
                                                                                                                case 19:
                                                                                                                    i31 = 1510355;
                                                                                                                    continue;
                                                                                                                case 745:
                                                                                                                    imageView = imageView6;
                                                                                                                    i = i27;
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    continue;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    default:
                                                                                                        break;
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            default:
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                continue;
                                                        }
                                                    }
                                                    int i32 = 1510572;
                                                    while (true) {
                                                        i32 ^= 1510589;
                                                        switch (i32) {
                                                            case 17:
                                                                i32 = imageView != null ? 1511316 : 1510634;
                                                                break;
                                                            case 87:
                                                                int i33 = 1511595;
                                                                while (true) {
                                                                    i33 ^= 1511612;
                                                                    switch (i33) {
                                                                        case 23:
                                                                            i33 = iIntValue4 > 2 ? 1512339 : 1512308;
                                                                            break;
                                                                        case 815:
                                                                            View view4 = (View) C0173.n(11421, viewGroup2, new Object[]{Integer.valueOf((C0060.f269 ^ 960) + iIntValue4)});
                                                                            boolean z3 = view4 instanceof TextView;
                                                                            int i34 = 1512370;
                                                                            while (true) {
                                                                                i34 ^= 1512387;
                                                                                switch (i34) {
                                                                                    case 18:
                                                                                        break;
                                                                                    case 51:
                                                                                        textView = null;
                                                                                        break;
                                                                                    case 113:
                                                                                        i34 = z3 ? 1512463 : 1512432;
                                                                                        break;
                                                                                    case 1996:
                                                                                        textView = (TextView) view4;
                                                                                        int i35 = 1512494;
                                                                                        while (true) {
                                                                                            i35 ^= 1512511;
                                                                                            switch (i35) {
                                                                                                case 17:
                                                                                                    i35 = 1512525;
                                                                                                    continue;
                                                                                                case 114:
                                                                                                    break;
                                                                                                default:
                                                                                                    continue;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 968:
                                                                            textView = null;
                                                                            break;
                                                                        case 1001:
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                int i36 = 1513269;
                                                                while (true) {
                                                                    i36 ^= 1513286;
                                                                    switch (i36) {
                                                                        case 18:
                                                                            break;
                                                                        case 53:
                                                                            imageView2 = new ImageView(activity2);
                                                                            int iIntValue7 = ((Integer) C0176.n(5584, null, new Object[]{activity2, Integer.valueOf(C0083.f292 ^ (-213))})).intValue();
                                                                            int i37 = C0031.f187 ^ (-618);
                                                                            C0176.n(32299, imageView2, new Object[]{Integer.valueOf(((Integer) C0176.n(5584, null, new Object[]{activity2, Integer.valueOf(i37)})).intValue()), Integer.valueOf(((Integer) C0176.n(5584, null, new Object[]{activity2, Integer.valueOf(i37)})).intValue()), Integer.valueOf(((Integer) C0176.n(5584, null, new Object[]{activity2, Integer.valueOf(i37)})).intValue()), Integer.valueOf(((Integer) C0176.n(5584, null, new Object[]{activity2, Integer.valueOf(i37)})).intValue())});
                                                                            C0176.n(63562, imageView2, new Object[]{true});
                                                                            C0176.n(69587, imageView2, new Object[]{true});
                                                                            C0176.n(39517, imageView2, new Object[]{(BitmapDrawable) C0176.n(78943, null, new Object[]{activity2, Integer.valueOf(iIntValue7)})});
                                                                            iIntValue2 = -1;
                                                                            break;
                                                                        case 115:
                                                                            i36 = textView != null ? 1513362 : 1513331;
                                                                            break;
                                                                        case 212:
                                                                            TextView textView2 = (TextView) C0176.n(84267, null, new Object[]{activity2, textView});
                                                                            iIntValue2 = ((Integer) C0176.n(13122, null, new Object[]{0, Integer.valueOf(((iIntValue4 - 16) - 2) + 16)})).intValue();
                                                                            int i38 = 1513393;
                                                                            while (true) {
                                                                                i38 ^= 1513410;
                                                                                switch (i38) {
                                                                                    case 18:
                                                                                        imageView2 = textView2;
                                                                                        break;
                                                                                    case 115:
                                                                                        i38 = 1513424;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 118:
                                                                break;
                                                            case 809:
                                                                imageView2 = (ImageView) C0176.n(8660, null, new Object[]{activity2, imageView});
                                                                boolean zBooleanValue7 = ((Boolean) C0182.n(55567, str, new Object[]{(String) C0186.n(19247)})).booleanValue();
                                                                int i39 = 1511347;
                                                                while (true) {
                                                                    i39 ^= 1511364;
                                                                    switch (i39) {
                                                                        case 22:
                                                                            break;
                                                                        case 53:
                                                                            iIntValue2 = -1;
                                                                            break;
                                                                        case 119:
                                                                            i39 = zBooleanValue7 ? 1511440 : 1511409;
                                                                            break;
                                                                        case 8148:
                                                                            int iIntValue8 = ((Integer) C0176.n(13122, null, new Object[]{0, Integer.valueOf(i - 1)})).intValue();
                                                                            int i40 = 1511471;
                                                                            while (true) {
                                                                                i40 ^= 1511488;
                                                                                switch (i40) {
                                                                                    case 14:
                                                                                        iIntValue2 = iIntValue8;
                                                                                        break;
                                                                                    case 111:
                                                                                        i40 = 1511502;
                                                                                        continue;
                                                                                    default:
                                                                                        continue;
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    C0176.n(60008, imageView2, new Object[]{str2});
                                                    C0176.n(2044, imageView2, new Object[]{new ViewOnClickListenerC0284p(c0304w2, activity2, 2)});
                                                    C0176.n(11393, imageView2, new Object[]{new ViewOnLongClickListenerC0269k(c0304w2, activity2, C0084.f293 ^ (-385))});
                                                    C0176.n(21767, null, new Object[]{imageView2});
                                                    int i41 = 1513517;
                                                    while (true) {
                                                        i41 ^= 1513534;
                                                        switch (i41) {
                                                            case 19:
                                                                i41 = iIntValue2 >= 0 ? 1514261 : 1514230;
                                                                break;
                                                            case 712:
                                                                C0176.n(63996, viewGroup2, new Object[]{imageView2});
                                                                break;
                                                            case 745:
                                                                break;
                                                            case 811:
                                                                C0176.n(34284, viewGroup2, new Object[]{imageView2, Integer.valueOf(iIntValue2)});
                                                                int i42 = 1514292;
                                                                while (true) {
                                                                    i42 ^= 1514309;
                                                                    switch (i42) {
                                                                        case 22:
                                                                            break;
                                                                        case 113:
                                                                            i42 = 1514323;
                                                                            continue;
                                                                        default:
                                                                            continue;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    }
                                                    ((Boolean) C0179.n(13382, (ArrayList) C0176.n(94931, c0304w2), new Object[]{new WeakReference(imageView2)})).booleanValue();
                                                    return;
                                                case 124:
                                                    int i43 = 56579;
                                                    while (true) {
                                                        i43 ^= 56596;
                                                        switch (i43) {
                                                            case 23:
                                                                i43 = 56610;
                                                                break;
                                                            case 54:
                                                                return;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            i21 = 56517;
                                        }
                                        break;
                                    case 116:
                                        int i44 = 55680;
                                        while (true) {
                                            i44 ^= 55697;
                                            switch (i44) {
                                                case 17:
                                                    i44 = 56362;
                                                    break;
                                                case 1467:
                                                    return;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i20 = 55618;
                            }
                            break;
                        default:
                            continue;
                    }
                    i19 = 55494;
                }
                break;
            case 2:
                String str3 = (String) C0176.n(98024, this);
                LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) C0176.n(45462, this);
                AtomicInteger atomicInteger = (AtomicInteger) C0176.n(7405, this);
                String str4 = (String) C0195.n(43185);
                try {
                    boolean zBooleanValue8 = ((Boolean) C0176.n(19260, null, new Object[]{str3})).booleanValue();
                    int i45 = 51712;
                    while (true) {
                        i45 ^= 51729;
                        switch (i45) {
                            case 14:
                                break;
                            case 17:
                                i45 = zBooleanValue8 ? 51805 : 51774;
                                break;
                            case 47:
                                break;
                            case 76:
                                ((Boolean) C0176.n(31100, linkedBlockingQueue, new Object[]{str3})).booleanValue();
                                int i46 = 51836;
                                while (true) {
                                    i46 ^= 51853;
                                    switch (i46) {
                                        case 241:
                                            i46 = 52518;
                                            continue;
                                        case 1963:
                                            break;
                                        default:
                                            continue;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    int iIntValue9 = ((Integer) C0176.n(23713, atomicInteger, new Object[0])).intValue();
                    int i47 = 53510;
                    while (true) {
                        i47 ^= 53527;
                        switch (i47) {
                            case 17:
                                i47 = iIntValue9 == 0 ? 53603 : 53572;
                                break;
                            case 50:
                                break;
                            case 83:
                                return;
                            case 116:
                                break;
                            default:
                                break;
                        }
                    }
                    while (true) {
                        i3 ^= 53651;
                        switch (i3) {
                            case 17:
                                i3 = 53665;
                                break;
                            case 50:
                                return;
                        }
                    }
                } catch (Exception e) {
                    int i48 = 52735;
                    while (true) {
                        i48 ^= 52752;
                        switch (i48) {
                            case 14:
                                int iIntValue10 = ((Integer) C0176.n(23713, atomicInteger, new Object[0])).intValue();
                                int i49 = 54533;
                                while (true) {
                                    i49 ^= 54550;
                                    switch (i49) {
                                        case 19:
                                            i49 = iIntValue10 == 0 ? 54626 : 54595;
                                            break;
                                        case 50:
                                            break;
                                        case 85:
                                            return;
                                        case 116:
                                            int i50 = 54657;
                                            while (true) {
                                                i50 ^= 54674;
                                                switch (i50) {
                                                    case 19:
                                                        i50 = 54688;
                                                        continue;
                                                    case 50:
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                            case 1007:
                                i48 = 52766;
                                continue;
                            default:
                                continue;
                        }
                    }
                } catch (Throwable th) {
                    int i51 = 52611;
                    while (true) {
                        i51 ^= 52628;
                        switch (i51) {
                            case 23:
                                i51 = 52642;
                                break;
                            case 54:
                                int iIntValue11 = ((Integer) C0176.n(23713, atomicInteger, new Object[0])).intValue();
                                int i52 = 53758;
                                while (true) {
                                    i52 ^= 53775;
                                    switch (i52) {
                                        case 1009:
                                            if (iIntValue11 == 0) {
                                                i52 = 54502;
                                            }
                                            break;
                                        case 1703:
                                            break;
                                        case 1736:
                                            throw th;
                                        case 1769:
                                            ((Boolean) C0176.n(31100, linkedBlockingQueue, new Object[]{str4})).booleanValue();
                                            throw th;
                                        default:
                                            continue;
                                    }
                                    i52 = 54471;
                                }
                                break;
                        }
                    }
                }
                ((Boolean) C0176.n(31100, linkedBlockingQueue, new Object[]{str4})).booleanValue();
                i3 = 53634;
                break;
            case 3:
                C0252e0 c0252e0 = (C0252e0) C0176.n(98024, this);
                com.github.catvod.spider.merge.p000a.I i53 = (com.github.catvod.spider.merge.p000a.I) C0176.n(35486, null, new Object[0]);
                boolean[] zArr = (boolean[]) C0176.n(7405, this);
                String str5 = (String) C0176.n(45462, this);
                C0246c0 c0246c0 = new C0246c0((Object) c0252e0, (Object) zArr, (Serializable) str5);
                C0176.n(81580, null, new Object[]{str5, c0246c0});
                return;
            case 4:
                C0252e0 c0252e1 = (C0252e0) C0176.n(98024, this);
                C0249d0 c0249d0 = (C0249d0) C0176.n(45462, this);
                ScrollView scrollView = (ScrollView) C0176.n(89485, c0249d0);
                int i54 = 49790;
                while (true) {
                    i54 ^= 49807;
                    switch (i54) {
                        case 18:
                            break;
                        case 51:
                            int[] iArr = new int[2];
                            View view5 = (View) C0176.n(7405, this);
                            C0176.n(38609, view5, new Object[]{iArr});
                            int[] iArr2 = new int[2];
                            C0176.n(38609, (ScrollView) C0176.n(89485, c0249d0), new Object[]{iArr2});
                            int i55 = iArr[1] - iArr2[1];
                            int iIntValue12 = 0 - ((0 - ((Integer) C0176.n(42461, view5, new Object[0])).intValue()) - i55);
                            int iIntValue13 = ((Integer) C0176.n(42461, (ScrollView) C0176.n(89485, c0249d0), new Object[0])).intValue();
                            int i56 = 50689;
                            while (true) {
                                i56 ^= 50706;
                                switch (i56) {
                                    case 19:
                                        if (iIntValue12 > iIntValue13) {
                                            i56 = 50782;
                                        }
                                        break;
                                    case 45:
                                        int i57 = 51588;
                                        while (true) {
                                            i57 ^= 51605;
                                            switch (i57) {
                                                case 17:
                                                    if (i55 < 0) {
                                                        i57 = 51681;
                                                    }
                                                    break;
                                                case 54:
                                                    break;
                                                case 87:
                                                    return;
                                                case 116:
                                                    C0176.n(77423, (ScrollView) C0176.n(89485, c0249d0), new Object[]{0, Integer.valueOf(i55 - ((Integer) C0176.n(13252, c0252e1)).intValue())});
                                                    return;
                                                default:
                                                    continue;
                                            }
                                            i57 = 51650;
                                        }
                                        break;
                                    case 50:
                                        break;
                                    case 76:
                                        C0176.n(77423, (ScrollView) C0176.n(89485, c0249d0), new Object[]{0, Integer.valueOf((((Integer) C0176.n(13252, c0252e1)).intValue() + ((((iIntValue12 - 2) - iIntValue13) + 2) + 22)) - 22)});
                                        int i58 = 50813;
                                        while (true) {
                                            i58 ^= 50830;
                                            switch (i58) {
                                                case 18:
                                                    return;
                                                case 243:
                                                    i58 = 50844;
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                                i56 = 50751;
                            }
                            break;
                        case 84:
                            int i59 = 49914;
                            while (true) {
                                i59 ^= 49931;
                                switch (i59) {
                                    case 497:
                                        i59 = 50596;
                                        break;
                                    case 1711:
                                        return;
                                }
                            }
                            break;
                        case 241:
                            if (scrollView == null) {
                                i54 = 49883;
                            }
                            break;
                        default:
                            continue;
                    }
                    i54 = 49852;
                }
                break;
            case 5:
                boolean zBooleanValue9 = ((Boolean) C0182.n(55567, (String) C0182.n(7909, null, new Object[]{(short[]) C0176.n(6178), 26, Integer.valueOf(C0015.f171 ^ (-943)), 1877}), new Object[]{(String) C0176.n(98024, this)})).booleanValue();
                int i60 = 48891;
                while (true) {
                    i60 ^= 48908;
                    switch (i60) {
                        case 22:
                            break;
                        case 53:
                            return;
                        case 503:
                            if (zBooleanValue9) {
                                i60 = 49635;
                            }
                            break;
                        case 32495:
                            EditText editText = (EditText) C0176.n(45462, this);
                            int i61 = 49666;
                            while (true) {
                                i61 ^= 49683;
                                switch (i61) {
                                    case 17:
                                        if (editText != null) {
                                            i61 = 49759;
                                        }
                                        break;
                                    case 50:
                                        break;
                                    case 76:
                                        String str6 = (String) C0176.n(7405, this);
                                        C0176.n(65208, editText, new Object[]{str6});
                                        C0176.n(68334, editText, new Object[]{Integer.valueOf(((Integer) C0149.n(89092, str6, new Object[0])).intValue())});
                                        return;
                                    case 83:
                                        return;
                                    default:
                                        continue;
                                }
                                i61 = 49728;
                            }
                            break;
                        default:
                            continue;
                    }
                    i60 = 48953;
                }
                break;
            case 6:
                C0246c0 c0246c1 = (C0246c0) C0176.n(98024, this);
                String str7 = (String) C0176.n(45462, this);
                boolean[] zArr2 = (boolean[]) C0176.n(7405, this);
                ((C0252e0) C0176.n(34916, c0246c1)).z = false;
                boolean zBooleanValue10 = ((Boolean) C0176.n(16606, (C0252e0) C0176.n(34916, c0246c1))).booleanValue();
                int i62 = 1616;
                while (true) {
                    i62 ^= 1633;
                    switch (i62) {
                        case 14:
                            break;
                        case 49:
                            if (zBooleanValue10) {
                                i62 = 1709;
                            }
                            break;
                        case 204:
                            int i63 = 1740;
                            while (true) {
                                i63 ^= 1757;
                                switch (i63) {
                                    case 17:
                                        i63 = 1771;
                                        break;
                                    case 54:
                                        return;
                                }
                            }
                            break;
                        case 239:
                            C0173.n(24502, (ProgressBar) C0176.n(90301, (C0252e0) C0176.n(34916, c0246c1)), new Object[]{8});
                            C0252e0.Y = str7;
                            C0252e0.Z = new LinkedHashMap((LinkedHashMap) C0176.n(1405, (C0252e0) C0176.n(34916, c0246c1)));
                            boolean z4 = zArr2[0];
                            int i64 = 1864;
                            while (true) {
                                i64 ^= 1881;
                                switch (i64) {
                                    case 17:
                                        if (z4) {
                                            i64 = 48736;
                                        }
                                        break;
                                    case 47384:
                                        return;
                                    case 47417:
                                        C0173.n(24502, (ProgressBar) C0176.n(62638, (C0252e0) C0176.n(34916, c0246c1)), new Object[]{8});
                                        TextView textView3 = (TextView) C0176.n(26584, (C0252e0) C0176.n(34916, c0246c1));
                                        int i65 = 48767;
                                        while (true) {
                                            i65 ^= 48784;
                                            switch (i65) {
                                                case 14:
                                                    break;
                                                case 45:
                                                    break;
                                                case 76:
                                                    C0173.n(24502, textView3, new Object[]{8});
                                                    break;
                                                case 239:
                                                    i65 = textView3 != null ? 48860 : 48829;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        C0176.n(45107, null, new Object[]{(C0252e0) C0176.n(34916, c0246c1)});
                                        return;
                                    case 47483:
                                        break;
                                    default:
                                        continue;
                                }
                                i64 = 48705;
                            }
                            break;
                        default:
                            continue;
                    }
                    i62 = 1678;
                }
                break;
            default:
                C0176.n(62159, (F0) C0176.n(98024, this), new Object[]{(String) C0176.n(45462, this), (String) C0176.n(7405, this)});
                return;
        }
    }
}
