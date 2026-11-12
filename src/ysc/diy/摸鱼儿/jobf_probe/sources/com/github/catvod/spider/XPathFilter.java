package com.github.catvod.spider;

import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p017u.C0128;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class XPathFilter extends XPath {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f109short = {559, 624, 277, 269, 271, 282, 267, 295, 266, 275, 2726, 2750, 2748, 2729, 2744, 2701, 2746, 2720, 2241, 2278, 2229, 2227, 2231, 2210, 2228, 2241, 2272, 957};

    @Override // com.github.catvod.spider.XPath
    public final String a(String str, String str2, boolean z, HashMap map) {
        String strReplace = this.b.s;
        String strM70 = C0018.m70(f109short, 0, 1, 594);
        String strM402 = C0101.m402(f109short, 1, 1, 523);
        if (z && map != null && map.size() > 0) {
            for (String str3 : map.keySet()) {
                String str4 = (String) map.get(str3);
                if (str4.length() > 0) {
                    strReplace = strReplace.replace(com.github.catvod.spider.merge.D.b.j(strM402, str3, strM70), URLEncoder.encode(str4));
                }
            }
        }
        String strReplace2 = strReplace.replace(C0128.m511(f109short, 2, 8, 366), str).replace(C0011.m42(f109short, 10, 8, 2781), str2);
        Matcher matcher = Pattern.compile(C0128.m511(f109short, 18, 9, 2205)).matcher(strReplace2);
        while (matcher.find()) {
            String strReplace3 = matcher.group(0).replace(strM402, "").replace(strM70, "");
            String strReplace4 = strReplace2.replace(matcher.group(0), "");
            String strM379 = C0095.m379(f109short, 27, 1, 914);
            strReplace2 = strReplace4.replace(strM379 + strReplace3 + strM379, "");
        }
        return strReplace2;
    }

    @Override // com.github.catvod.spider.XPath
    public final void d(String str) {
    }
}
