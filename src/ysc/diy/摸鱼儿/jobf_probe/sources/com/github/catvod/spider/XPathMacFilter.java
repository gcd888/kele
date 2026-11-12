package com.github.catvod.spider;

import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.utils.C0143;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class XPathMacFilter extends XPathMac {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f111short = {1305, 1032, 974, 982, 980, 961, 976, 1020, 977, 968, 419, 443, 441, 428, 445, 392, 447, 421, 3053, 3018, 2969, 2975, 2971, 2958, 2968, 3053, 3020, 1622};

    @Override // com.github.catvod.spider.XPath
    public final String a(String str, String str2, boolean z, HashMap map) {
        String strReplace = this.b.s;
        String strM414 = C0104.m414(f111short, 0, 1, 1380);
        String strM567 = C0142.m567(f111short, 1, 1, 1139);
        if (z && map != null && map.size() > 0) {
            for (String str3 : map.keySet()) {
                String str4 = (String) map.get(str3);
                if (str4.length() > 0) {
                    strReplace = strReplace.replace(com.github.catvod.spider.merge.D.b.j(strM567, str3, strM414), URLEncoder.encode(str4));
                }
            }
        }
        String strReplace2 = strReplace.replace(C0143.m570(f111short, 2, 8, 949), str).replace(C0017.m65(f111short, 10, 8, 472), str2);
        Matcher matcher = Pattern.compile(C0090.m358(f111short, 18, 9, 2993)).matcher(strReplace2);
        while (matcher.find()) {
            String strReplace3 = matcher.group(0).replace(strM567, "").replace(strM414, "");
            String strReplace4 = strReplace2.replace(matcher.group(0), "");
            String strM33 = C0009.m33(f111short, 27, 1, 1657);
            strReplace2 = strReplace4.replace(strM33 + strReplace3 + strM33, "");
        }
        return strReplace2;
    }
}
