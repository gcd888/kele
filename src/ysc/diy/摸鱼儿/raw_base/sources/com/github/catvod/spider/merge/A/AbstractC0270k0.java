package com.github.catvod.spider.merge.A;

import android.app.Activity;
import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.p0.C0110;
import com.github.catvod.spider.merge.p020x.C0136;
import java.io.PrintStream;
import moyu.fucking.C0162;
import moyu.fucking.C0181;
import moyu.fucking.C0195;
import moyu.fucking.C0219;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract /* synthetic */ class AbstractC0270k0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f142short = {3114, 3109, 3119, 3129, 3108, 3106, 3119, 3173, 3131, 3118, 3129, 3110, 3106, 3128, 3128, 3106, 3108, 3109, 3173, 3100, 3097, 3074, 3103, 3086, 3092, 3086, 3091, 3103, 3086, 3097, 3077, 3082, 3079, 3092, 3096, 3103, 3076, 3097, 3082, 3084, 3086};

    public static /* bridge */ /* synthetic */ int a(Activity activity) throws Throwable {
        Object objN = null;
        short[] sArr = null;
        int iIntValue = 0;
        int i = 0;
        Integer num = null;
        Integer numValueOf = null;
        Integer num2 = null;
        String str = null;
        Object[] objArr = null;
        Integer num3 = null;
        String str2 = "ۦۡ۟";
        Object[] objArr2 = null;
        while (true) {
            switch (C0034.m132(str2)) {
                case 56481:
                    objN = C0219.n(9104, activity, objArr);
                    str2 = "۟ۦۧ";
                    break;
                case 56568:
                    str2 = "۟ۦۣ";
                    objArr = new Object[1];
                    break;
                case 1746723:
                    iIntValue = C0136.f345;
                    str2 = "ۣۢ";
                    break;
                case 1746908:
                    objArr[0] = str;
                    str2 = "ۥۦ";
                    break;
                case 1746912:
                    str2 = "۟ۨۥ";
                    num3 = (Integer) objN;
                    break;
                case 1746972:
                    iIntValue = num3.intValue();
                    str2 = "ۥۡۨ";
                    break;
                case 1748767:
                    objArr2[3] = num2;
                    str2 = "ۣۧۥ";
                    break;
                case 1750598:
                    objArr2[2] = numValueOf;
                    str2 = "ۣۧۤ";
                    break;
                case 1750748:
                    str2 = "۟۠ۤ";
                    sArr = (short[]) objN;
                    break;
                case 1750784:
                    str2 = "ۡۤۢ";
                    num2 = 3147;
                    break;
                case 1750786:
                    str2 = "ۨ۠";
                    str = (String) objN;
                    break;
                case 1751495:
                    str2 = "ۣۣۧ";
                    num = 0;
                    break;
                case 1751653:
                    objArr2[0] = sArr;
                    str2 = "ۤ۟ۢ";
                    break;
                case 1752524:
                    return iIntValue;
                case 1753476:
                    objN = C0219.n(45339);
                    str2 = "ۣۦ۟";
                    break;
                case 1753701:
                    str2 = "ۤۤۥ";
                    objArr2 = new Object[4];
                    break;
                case 1754503:
                    objArr2[1] = num;
                    str2 = "ۨۨۦ";
                    break;
                case 1754505:
                    objN = C0162.n(13243, null, objArr2);
                    str2 = "ۣۧۦ";
                    break;
                case 1755622:
                    str2 = "ۣۡۤ";
                    numValueOf = Integer.valueOf(i);
                    break;
                default:
                    i = iIntValue ^ 760;
                    str2 = "ۦۨۧ";
                    break;
            }
        }
    }

    public static /* bridge */ /* synthetic */ int b(Activity activity, String str) throws Throwable {
        String str2 = "ۤۡ۟";
        Integer num = null;
        Object objN = null;
        int iIntValue = 0;
        while (true) {
            switch (C0034.m132(str2)) {
                case 56506:
                    num = (Integer) objN;
                    str2 = "۠ۧۧ";
                    break;
                case 1747904:
                    iIntValue = num.intValue();
                    str2 = "۠ۥ۠";
                    break;
                case 1751554:
                    objN = C0219.n(9104, activity, new Object[]{str});
                    str2 = "ۦ۠";
                    break;
                default:
                    return iIntValue;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void c(Activity activity, String[] strArr) throws Throwable {
        C0219.n(62258, activity, new Object[]{strArr, Integer.valueOf(C0110.f319 ^ (-584))});
        int iIntValue = ((Integer) C0181.n(49659, null, new Object[0])).intValue();
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
                    C0162.n(83524, (PrintStream) C0195.n(72538), new Object[]{Long.valueOf(((Long) C0162.n(73560, null, new Object[]{(String) C0219.n(67405, null, new Object[]{(String) C0219.n(72919)})})).longValue())});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }
}
