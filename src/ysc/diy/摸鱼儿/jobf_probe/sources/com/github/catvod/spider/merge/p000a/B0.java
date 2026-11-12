package com.github.catvod.spider.merge.p000a;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import moyu.fucking.C0149;
import moyu.fucking.C0152;
import moyu.fucking.C0154;
import moyu.fucking.C0155;
import moyu.fucking.C0168;
import moyu.fucking.C0170;
import moyu.fucking.C0174;
import moyu.fucking.C0177;
import moyu.fucking.C0179;
import moyu.fucking.C0181;
import moyu.fucking.C0188;
import moyu.fucking.C0195;
import moyu.fucking.C0198;
import moyu.fucking.C0200;
import moyu.fucking.C0201;
import moyu.fucking.C0204;
import moyu.fucking.C0221;
import moyu.fucking.C0224;
import moyu.fucking.C0226;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f215short = {949, 2254};
    public final HashMap a = new HashMap();

    public B0() throws Throwable {
        int iIntValue = ((Integer) C0188.n(99471, null, new Object[0])).intValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iIntValue >= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    C0168.n(61614, (PrintStream) C0195.n(72538), new Object[]{(String) C0224.n(2303, null, new Object[]{(String) C0177.n(14129)})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x00a3. Please report as an issue. */
    public final void a(String str) throws Throwable {
        try {
            Iterator it = (Iterator) C0221.n(14247, (Set) C0177.n(91838, (JsonObject) C0174.n(3898, null, new Object[]{str}), new Object[0]), new Object[0]);
            while (true) {
                boolean zBooleanValue = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
                int i = 1616;
                while (true) {
                    i ^= 1633;
                    switch (i) {
                        case 14:
                            break;
                        case 49:
                            i = zBooleanValue ? 1709 : 1678;
                            break;
                        case 204:
                            break;
                        case 239:
                            break;
                        default:
                            break;
                    }
                    return;
                }
                Map.Entry entry = (Map.Entry) C0221.n(87284, it, new Object[0]);
                String str2 = (String) C0221.n(46732, entry, new Object[0]);
                JsonObject jsonObject = (JsonObject) C0181.n(24176, (JsonElement) C0221.n(90513, entry, new Object[0]), new Object[0]);
                HashMap map = new HashMap();
                Iterator it2 = (Iterator) C0221.n(14247, (Set) C0177.n(75139, jsonObject, new Object[0]), new Object[0]);
                while (true) {
                    boolean zBooleanValue2 = ((Boolean) C0221.n(22175, it2, new Object[0])).booleanValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                i2 = zBooleanValue2 ? 1833 : 1802;
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                String str3 = (String) C0221.n(87284, it2, new Object[0]);
                                C0155.n(50765, map, new Object[]{str3, (String) C0170.n(10931, (JsonElement) C0174.n(61056, jsonObject, new Object[]{str3}), new Object[0])});
                                int i3 = 1864;
                                while (true) {
                                    i3 ^= 1881;
                                    switch (i3) {
                                        case 17:
                                            i3 = 48674;
                                            break;
                                        case 47483:
                                            break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                        C0155.n(50765, (HashMap) C0177.n(2785, this), new Object[]{str2, map});
                        int i4 = 48767;
                        while (true) {
                            i4 ^= 48784;
                            switch (i4) {
                                case 14:
                                    break;
                                case 239:
                                    i4 = 48798;
                                    break;
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            int i5 = 48891;
            while (true) {
                i5 ^= 48908;
                switch (i5) {
                    case 22:
                        return;
                    case 503:
                        i5 = 48922;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x008c. Please report as an issue. */
    public final String b(String str) {
        Map map = (Map) C0226.n(26460, (HashMap) C0177.n(2785, this), new Object[]{(String) C0154.n(45936, (HttpUrl) C0201.n(44872, null, new Object[]{str}), new Object[0])});
        ArrayList arrayList = new ArrayList();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (map != null) {
                        i = 1709;
                    }
                    break;
                case 204:
                    int iIntValue = ((Integer) C0177.n(46643, map, new Object[0])).intValue();
                    int i2 = 1740;
                    while (true) {
                        i2 ^= 1757;
                        switch (i2) {
                            case 17:
                                if (iIntValue > 0) {
                                    i2 = 1833;
                                }
                                break;
                            case 54:
                                break;
                            case 471:
                                break;
                            case 500:
                                Iterator it = (Iterator) C0221.n(14247, (Set) C0177.n(32802, map, new Object[0]), new Object[0]);
                                while (true) {
                                    boolean zBooleanValue = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
                                    int i3 = 1864;
                                    while (true) {
                                        i3 ^= 1881;
                                        switch (i3) {
                                            case 17:
                                                i3 = zBooleanValue ? 48736 : 48705;
                                                break;
                                            case 47384:
                                                break;
                                            case 47417:
                                                break;
                                            case 47483:
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                    }
                                    String str2 = (String) C0221.n(87284, it, new Object[0]);
                                    StringBuilder sb = (StringBuilder) C0204.n(37944, null, new Object[]{str2, (String) C0149.n(83930, null, new Object[]{(short[]) C0177.n(82109), 0, 1, 904})});
                                    ((Boolean) C0179.n(13382, arrayList, new Object[]{(String) C0198.n(89992, sb, new Object[0])})).booleanValue();
                                    int i4 = 48767;
                                    while (true) {
                                        i4 ^= 48784;
                                        switch (i4) {
                                            case 14:
                                                break;
                                            case 239:
                                                i4 = 48798;
                                                break;
                                        }
                                    }
                                }
                                break;
                            default:
                                continue;
                        }
                        i2 = 1802;
                    }
                    break;
                case 239:
                    break;
                default:
                    continue;
            }
            i = 1678;
        }
        return (String) C0200.n(27512, null, new Object[]{arrayList, (String) C0198.n(30341, null, new Object[]{(short[]) C0177.n(82109), 1, 1, 2293})});
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0095. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x002a. Please report as an issue. */
    public final void c(JsonObject jsonObject) throws Throwable {
        Iterator it = (Iterator) C0221.n(14247, (Set) C0177.n(91838, jsonObject, new Object[0]), new Object[0]);
        while (true) {
            boolean zBooleanValue = ((Boolean) C0221.n(22175, it, new Object[0])).booleanValue();
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = zBooleanValue ? 1709 : 1678;
                        break;
                    case 204:
                        break;
                    case 239:
                        break;
                    default:
                        break;
                }
                int iIntValue = ((Integer) C0221.n(86955, null, new Object[0])).intValue();
                int i2 = 48891;
                while (true) {
                    i2 ^= 48908;
                    switch (i2) {
                        case 22:
                            break;
                        case 53:
                            return;
                        case 503:
                            if (iIntValue <= 0) {
                                i2 = 49635;
                            }
                            break;
                        case 32495:
                            C0195.n(38669, (PrintStream) C0195.n(72538), new Object[]{(Double) C0152.n(66570, null, new Object[]{(String) C0155.n(62607, null, new Object[]{(String) C0177.n(50583)})})});
                            return;
                        default:
                            continue;
                    }
                    i2 = 48953;
                }
            }
            Map.Entry entry = (Map.Entry) C0221.n(87284, it, new Object[0]);
            String str = (String) C0221.n(46732, entry, new Object[0]);
            JsonObject jsonObject2 = (JsonObject) C0181.n(24176, (JsonElement) C0221.n(90513, entry, new Object[0]), new Object[0]);
            HashMap map = new HashMap();
            Iterator it2 = (Iterator) C0221.n(14247, (Set) C0177.n(75139, jsonObject2, new Object[0]), new Object[0]);
            while (true) {
                boolean zBooleanValue2 = ((Boolean) C0221.n(22175, it2, new Object[0])).booleanValue();
                int i3 = 1740;
                while (true) {
                    i3 ^= 1757;
                    switch (i3) {
                        case 17:
                            i3 = zBooleanValue2 ? 1833 : 1802;
                            break;
                        case 54:
                            break;
                        case 471:
                            break;
                        case 500:
                            String str2 = (String) C0221.n(87284, it2, new Object[0]);
                            C0155.n(50765, map, new Object[]{str2, (String) C0170.n(10931, (JsonElement) C0174.n(61056, jsonObject2, new Object[]{str2}), new Object[0])});
                            int i4 = 1864;
                            while (true) {
                                i4 ^= 1881;
                                switch (i4) {
                                    case 17:
                                        i4 = 48674;
                                        break;
                                    case 47483:
                                        break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    C0155.n(50765, (HashMap) C0177.n(2785, this), new Object[]{str, map});
                    int i5 = 48767;
                    while (true) {
                        i5 ^= 48784;
                        switch (i5) {
                            case 14:
                                break;
                            case 239:
                                i5 = 48798;
                                break;
                        }
                    }
                }
            }
        }
    }
}
