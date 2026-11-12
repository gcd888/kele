package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.PianDan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0280n1 {
    public static volatile String a = "";
    public static volatile String b = "";
    public static volatile String c = "";
    public static volatile int d = 1;
    public static volatile int e = 0;
    public static volatile String f = "";
    public static volatile String g = "";
    public static volatile long h = 0;
    public static long i = 0;
    public static volatile long j = 0;
    public static volatile long k = 0;
    public static volatile long l = 0;
    public static volatile String m = "";
    public static volatile HashMap n = new HashMap();
    public static volatile HashMap o = new HashMap();
    public static volatile HashMap p = new HashMap();
    public static final Pattern q = Pattern.compile("(?i)(2160[pP]?|1080[pPiI]?|720[pP]?|480[pP]?|360[pP]?|4K|8K|HDR\\d*|SDR|10bit|12bit|8bit|H\\.?26[45]|[xX]\\.?26[45]|HEVC|AVC|AV1|VP9|MPEG\\d?|DDP?\\s?\\d\\.?\\d?|TrueHD|AAC\\d?\\.?\\d?|FLAC|DTS[-.]?HD|AC3|EAC3|OPUS|5\\.1|7\\.1|2\\.0|2ch|6ch|\\d+fps|\\d+[kK]bps|WEB[-.]?DL|WEB[-.]?RIP|BluRay|BDRip|BDRemux|DVDRip|HDTV|HDRip|REMUX|Vivid|Atmos|DV|DoVi|HLG|GB|MB|KB)");
    public static final Pattern r = Pattern.compile("(?i)\\.(mp4|mkv|avi|rmvb|rm|flv|wmv|ts|m4v|mov|webm|mpg|mpeg|3gp|f4v|m2ts|iso)$");
    public static final Pattern s = Pattern.compile("(?i)^\\s*[\\[【(（]?\\s*\\d+(\\.\\d+)?\\s*(GB|G|MB|M|KB|K|B)\\s*[\\]】)）]?\\s*|\\s*[\\[【(（]?\\s*\\d+(\\.\\d+)?\\s*(GB|G|MB|M|KB|K|B)\\s*[\\]】)）]?\\s*$");
    public static final Pattern t = Pattern.compile("(?i)\\s*[\\[【(（][A-F0-9]{8,32}[\\]】)）]\\s*$");
    public static final Pattern u = Pattern.compile("^[\\s._\\-·|/\\\\:：,，;；\\[\\]()（）【】《》]+|[\\s._\\-·|/\\\\:：,，;；\\[\\]()（）【】《》]+$");

    public static synchronized C0274l1 a() {
        i++;
        return new C0274l1(false);
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0251e.C(str));
        sb.append('|');
        sb.append(str2 == null ? "" : str2.trim());
        return sb.toString();
    }

    public static synchronized C0274l1 c() {
        return new C0274l1(true);
    }

    public static synchronized C0274l1 d() {
        return new C0274l1(false);
    }

    public static String e(String str) {
        return u.matcher(str == null ? "" : str.trim()).replaceAll("");
    }

    public static String[] f(String[] strArr) {
        int length;
        int length2;
        int length3 = strArr.length;
        String[] strArr2 = new String[length3];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            String strReplaceFirst = t.matcher(str == null ? "" : str.trim()).replaceFirst("");
            Pattern pattern = s;
            strArr2[i2] = e(pattern.matcher(r.matcher(pattern.matcher(strReplaceFirst).replaceAll("")).replaceFirst("")).replaceAll(""));
        }
        if (length3 < 2) {
            return strArr2;
        }
        if (length3 == 0) {
            length = 0;
        } else {
            length = strArr2[0].length();
            for (int i3 = 0; i3 < length3; i3++) {
                String str2 = strArr2[i3];
                length = Math.min(length, str2.length());
                for (int i4 = 0; i4 < length; i4++) {
                    if (strArr2[0].charAt(i4) != str2.charAt(i4)) {
                        length = i4;
                        break;
                    }
                }
            }
        }
        loop1: while (true) {
            if (length < 4) {
                length = 0;
                break;
            }
            for (int i5 = 0; i5 < length3; i5++) {
                String str3 = strArr2[i5];
                String strE = e(str3.substring(Math.min(length, str3.length())));
                if (strE.isEmpty() || h(strE) <= 0) {
                    length--;
                }
            }
            break loop1;
        }
        if (length3 == 0) {
            length2 = 0;
        } else {
            length2 = strArr2[0].length() - Math.min(length, strArr2[0].length());
            for (int i6 = 0; i6 < length3; i6++) {
                String str4 = strArr2[i6];
                length2 = Math.min(length2, str4.length() - Math.min(length, str4.length()));
                for (int i7 = 0; i7 < length2; i7++) {
                    String str5 = strArr2[0];
                    if (str5.charAt((str5.length() - 1) - i7) != str4.charAt((str4.length() - 1) - i7)) {
                        length2 = i7;
                        break;
                    }
                }
            }
        }
        loop3: while (true) {
            if (length2 < 4) {
                length2 = 0;
                break;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= length3) {
                    break loop3;
                }
                String str6 = strArr2[i8];
                int iMin = Math.min(length, str6.length());
                if (e(str6.substring(iMin, Math.max(iMin, str6.length() - length2))).isEmpty()) {
                    break;
                }
                i8++;
            }
            length2--;
        }
        String[] strArr3 = new String[length3];
        for (int i9 = 0; i9 < length3; i9++) {
            int iMin2 = Math.min(length, strArr2[i9].length());
            String strE2 = e(strArr2[i9].substring(iMin2, Math.max(iMin2, strArr2[i9].length() - Math.min(length2, strArr2[i9].length() - iMin2))));
            if (strE2.isEmpty()) {
                strE2 = strArr2[i9];
            }
            strArr3[i9] = strE2;
        }
        return strArr3;
    }

    public static synchronized boolean g(String str) {
        if (str != null) {
            if (!str.isEmpty() && !str.equals(a)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0120 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static int h(String str) {
        Matcher matcher;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        int i2;
        Matcher matcher5;
        int i3;
        Matcher matcher6;
        int i4;
        Matcher matcher7;
        int i5;
        if (str != null && !str.isEmpty()) {
            try {
                return Integer.parseInt(str.trim());
            } catch (NumberFormatException unused) {
                String strReplaceFirst = r.matcher(str.replaceFirst("^\\[\\d+(\\.\\d+)?\\s*(GB|MB|KB|B)]\\s*", "")).replaceFirst("");
                Matcher matcher8 = Pattern.compile("[Ss](\\d+)[Ee](\\d+)").matcher(strReplaceFirst);
                if (matcher8.find()) {
                    try {
                        return Integer.parseInt(matcher8.group(2));
                    } catch (NumberFormatException unused2) {
                        matcher = Pattern.compile("第\\s*(\\d+)\\s*[集话期回]").matcher(strReplaceFirst);
                        if (matcher.find()) {
                            try {
                                return Integer.parseInt(matcher.group(1));
                            } catch (NumberFormatException unused3) {
                                matcher2 = Pattern.compile("(?<![\\d.])(\\d{1,4})[集话回]").matcher(strReplaceFirst);
                                if (matcher2.find()) {
                                    try {
                                        return Integer.parseInt(matcher2.group(1));
                                    } catch (NumberFormatException unused4) {
                                        matcher3 = Pattern.compile("(?<![Ss\\w])[Ee][Pp]?(\\d+)").matcher(strReplaceFirst);
                                        if (matcher3.find()) {
                                            try {
                                                return Integer.parseInt(matcher3.group(1));
                                            } catch (NumberFormatException unused5) {
                                                matcher4 = Pattern.compile("^(\\d{1,4})(?:[-_\\.\\s\\[【(])").matcher(strReplaceFirst);
                                                if (matcher4.find()) {
                                                    try {
                                                        i2 = Integer.parseInt(matcher4.group(1));
                                                        if (i2 > 0) {
                                                            return i2;
                                                        }
                                                    } catch (NumberFormatException unused6) {
                                                    }
                                                }
                                                matcher5 = Pattern.compile("[-_\\.\\s](\\d{1,4})$").matcher(strReplaceFirst);
                                                if (matcher5.find()) {
                                                    try {
                                                        i3 = Integer.parseInt(matcher5.group(1));
                                                        if (i3 > 0) {
                                                            return i3;
                                                        }
                                                    } catch (NumberFormatException unused7) {
                                                    }
                                                }
                                                matcher6 = Pattern.compile("[\\[【(](\\d{1,4})[\\]】)]").matcher(strReplaceFirst);
                                                if (matcher6.find()) {
                                                    try {
                                                        i4 = Integer.parseInt(matcher6.group(1));
                                                        if (i4 > 0) {
                                                            return i4;
                                                        }
                                                    } catch (NumberFormatException unused8) {
                                                    }
                                                }
                                                matcher7 = Pattern.compile("(?<![\\d.])(\\d{1,4})(?![\\d.])").matcher(q.matcher(strReplaceFirst).replaceAll(" ").replaceAll("(?:19|20)\\d{2}", " ").replaceAll("(?i)[Ss]eason\\s*\\d+", " ").replaceAll("(?i)(?<![Ee])[Ss](\\d{1,2})(?![Ee])", " ").replaceAll("第\\s*\\d+\\s*季", " ").replaceAll("(?i)[Vv]\\d+", " "));
                                                while (matcher7.find()) {
                                                    try {
                                                        i5 = Integer.parseInt(matcher7.group(1));
                                                        if (i5 <= 0) {
                                                            continue;
                                                        }
                                                    } catch (NumberFormatException unused9) {
                                                    }
                                                }
                                                return 0;
                                            }
                                        }
                                        matcher4 = Pattern.compile("^(\\d{1,4})(?:[-_\\.\\s\\[【(])").matcher(strReplaceFirst);
                                        if (matcher4.find()) {
                                            i2 = Integer.parseInt(matcher4.group(1));
                                            if (i2 > 0 && i2 <= 9999) {
                                                return i2;
                                            }
                                        }
                                        matcher5 = Pattern.compile("[-_\\.\\s](\\d{1,4})$").matcher(strReplaceFirst);
                                        if (matcher5.find()) {
                                            i3 = Integer.parseInt(matcher5.group(1));
                                            if (i3 > 0 && i3 <= 9999) {
                                                return i3;
                                            }
                                        }
                                        matcher6 = Pattern.compile("[\\[【(](\\d{1,4})[\\]】)]").matcher(strReplaceFirst);
                                        if (matcher6.find()) {
                                            i4 = Integer.parseInt(matcher6.group(1));
                                            if (i4 > 0 && i4 <= 9999) {
                                                return i4;
                                            }
                                        }
                                        matcher7 = Pattern.compile("(?<![\\d.])(\\d{1,4})(?![\\d.])").matcher(q.matcher(strReplaceFirst).replaceAll(" ").replaceAll("(?:19|20)\\d{2}", " ").replaceAll("(?i)[Ss]eason\\s*\\d+", " ").replaceAll("(?i)(?<![Ee])[Ss](\\d{1,2})(?![Ee])", " ").replaceAll("第\\s*\\d+\\s*季", " ").replaceAll("(?i)[Vv]\\d+", " "));
                                        while (matcher7.find()) {
                                            i5 = Integer.parseInt(matcher7.group(1));
                                            if (i5 <= 0 && i5 <= 9999) {
                                                return i5;
                                            }
                                        }
                                        return 0;
                                    }
                                }
                                matcher3 = Pattern.compile("(?<![Ss\\w])[Ee][Pp]?(\\d+)").matcher(strReplaceFirst);
                                if (matcher3.find()) {
                                    return Integer.parseInt(matcher3.group(1));
                                }
                                matcher4 = Pattern.compile("^(\\d{1,4})(?:[-_\\.\\s\\[【(])").matcher(strReplaceFirst);
                                if (matcher4.find()) {
                                    i2 = Integer.parseInt(matcher4.group(1));
                                    if (i2 > 0) {
                                        return i2;
                                    }
                                }
                                matcher5 = Pattern.compile("[-_\\.\\s](\\d{1,4})$").matcher(strReplaceFirst);
                                if (matcher5.find()) {
                                    i3 = Integer.parseInt(matcher5.group(1));
                                    if (i3 > 0) {
                                        return i3;
                                    }
                                }
                                matcher6 = Pattern.compile("[\\[【(](\\d{1,4})[\\]】)]").matcher(strReplaceFirst);
                                if (matcher6.find()) {
                                    i4 = Integer.parseInt(matcher6.group(1));
                                    if (i4 > 0) {
                                        return i4;
                                    }
                                }
                                matcher7 = Pattern.compile("(?<![\\d.])(\\d{1,4})(?![\\d.])").matcher(q.matcher(strReplaceFirst).replaceAll(" ").replaceAll("(?:19|20)\\d{2}", " ").replaceAll("(?i)[Ss]eason\\s*\\d+", " ").replaceAll("(?i)(?<![Ee])[Ss](\\d{1,2})(?![Ee])", " ").replaceAll("第\\s*\\d+\\s*季", " ").replaceAll("(?i)[Vv]\\d+", " "));
                                while (matcher7.find()) {
                                    i5 = Integer.parseInt(matcher7.group(1));
                                    if (i5 <= 0) {
                                        continue;
                                    }
                                }
                                return 0;
                            }
                        }
                        matcher2 = Pattern.compile("(?<![\\d.])(\\d{1,4})[集话回]").matcher(strReplaceFirst);
                        if (matcher2.find()) {
                            return Integer.parseInt(matcher2.group(1));
                        }
                        matcher3 = Pattern.compile("(?<![Ss\\w])[Ee][Pp]?(\\d+)").matcher(strReplaceFirst);
                        if (matcher3.find()) {
                            return Integer.parseInt(matcher3.group(1));
                        }
                        matcher4 = Pattern.compile("^(\\d{1,4})(?:[-_\\.\\s\\[【(])").matcher(strReplaceFirst);
                        if (matcher4.find()) {
                            i2 = Integer.parseInt(matcher4.group(1));
                            if (i2 > 0) {
                                return i2;
                            }
                        }
                        matcher5 = Pattern.compile("[-_\\.\\s](\\d{1,4})$").matcher(strReplaceFirst);
                        if (matcher5.find()) {
                            i3 = Integer.parseInt(matcher5.group(1));
                            if (i3 > 0) {
                                return i3;
                            }
                        }
                        matcher6 = Pattern.compile("[\\[【(](\\d{1,4})[\\]】)]").matcher(strReplaceFirst);
                        if (matcher6.find()) {
                            i4 = Integer.parseInt(matcher6.group(1));
                            if (i4 > 0) {
                                return i4;
                            }
                        }
                        matcher7 = Pattern.compile("(?<![\\d.])(\\d{1,4})(?![\\d.])").matcher(q.matcher(strReplaceFirst).replaceAll(" ").replaceAll("(?:19|20)\\d{2}", " ").replaceAll("(?i)[Ss]eason\\s*\\d+", " ").replaceAll("(?i)(?<![Ee])[Ss](\\d{1,2})(?![Ee])", " ").replaceAll("第\\s*\\d+\\s*季", " ").replaceAll("(?i)[Vv]\\d+", " "));
                        while (matcher7.find()) {
                            i5 = Integer.parseInt(matcher7.group(1));
                            if (i5 <= 0) {
                                continue;
                            }
                        }
                        return 0;
                    }
                }
                matcher = Pattern.compile("第\\s*(\\d+)\\s*[集话期回]").matcher(strReplaceFirst);
                if (matcher.find()) {
                    return Integer.parseInt(matcher.group(1));
                }
                matcher2 = Pattern.compile("(?<![\\d.])(\\d{1,4})[集话回]").matcher(strReplaceFirst);
                if (matcher2.find()) {
                    return Integer.parseInt(matcher2.group(1));
                }
                matcher3 = Pattern.compile("(?<![Ss\\w])[Ee][Pp]?(\\d+)").matcher(strReplaceFirst);
                if (matcher3.find()) {
                    return Integer.parseInt(matcher3.group(1));
                }
                matcher4 = Pattern.compile("^(\\d{1,4})(?:[-_\\.\\s\\[【(])").matcher(strReplaceFirst);
                if (matcher4.find()) {
                    i2 = Integer.parseInt(matcher4.group(1));
                    if (i2 > 0) {
                        return i2;
                    }
                }
                matcher5 = Pattern.compile("[-_\\.\\s](\\d{1,4})$").matcher(strReplaceFirst);
                if (matcher5.find()) {
                    i3 = Integer.parseInt(matcher5.group(1));
                    if (i3 > 0) {
                        return i3;
                    }
                }
                matcher6 = Pattern.compile("[\\[【(](\\d{1,4})[\\]】)]").matcher(strReplaceFirst);
                if (matcher6.find()) {
                    i4 = Integer.parseInt(matcher6.group(1));
                    if (i4 > 0) {
                        return i4;
                    }
                }
                matcher7 = Pattern.compile("(?<![\\d.])(\\d{1,4})(?![\\d.])").matcher(q.matcher(strReplaceFirst).replaceAll(" ").replaceAll("(?:19|20)\\d{2}", " ").replaceAll("(?i)[Ss]eason\\s*\\d+", " ").replaceAll("(?i)(?<![Ee])[Ss](\\d{1,2})(?![Ee])", " ").replaceAll("第\\s*\\d+\\s*季", " ").replaceAll("(?i)[Vv]\\d+", " "));
                while (matcher7.find()) {
                    i5 = Integer.parseInt(matcher7.group(1));
                    if (i5 <= 0) {
                        continue;
                    }
                }
            }
        }
        return 0;
    }

    public static String i(String str, String str2, String str3, String str4) {
        synchronized (AbstractC0280n1.class) {
            m(str3, str4);
            int iU = u(str, str2);
            if (!a.isEmpty() && iU > 0 && com.github.catvod.spider.merge.p006g.a.a().k() && com.github.catvod.spider.merge.p006g.a.a().j() && !C0299u0.x().k && System.currentTimeMillis() >= j) {
                return com.github.catvod.spider.merge.p000a.I.p().d(c(), v(), false, true);
            }
            return null;
        }
    }

    public static void j(boolean z) {
        C0274l1 c0274l1C;
        String strV;
        if (com.github.catvod.spider.merge.p006g.a.a().k() && com.github.catvod.spider.merge.p006g.a.a().j() && !C0299u0.x().k && !a.isEmpty() && d > 0) {
            synchronized (AbstractC0280n1.class) {
                c0274l1C = c();
                strV = v();
            }
            InitOrigin.execute(new RunnableC0271k1(0, c0274l1C, strV, z));
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00bd  */
    public static int k(String str, String str2) {
        C0277m1 c0277m1;
        int i2;
        int iH;
        int iH2;
        int iH3;
        if (str2 != null && !str2.isEmpty()) {
            HashMap map = n;
            HashMap map2 = o;
            Integer num = (Integer) map.get(str2);
            if (num != null && num.intValue() > 0) {
                String str3 = (String) p.get(str2);
                if (str3 != null && !str3.isEmpty() && (iH3 = h(str3)) > 0) {
                    return iH3;
                }
                String str4 = (String) map2.get(str2);
                return (str4 == null || str4.isEmpty() || (iH2 = h(str4)) <= 0) ? num.intValue() : iH2;
            }
        }
        if (str2 != null && !str2.isEmpty()) {
            try {
                int i3 = Integer.parseInt(str2.trim());
                if (i3 > 0 && i3 <= 9999) {
                    return i3;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (str2 != null && str2.contains("$") && (iH = h(str2.substring(0, str2.indexOf("$")))) > 0) {
            return iH;
        }
        if (str != null) {
            if (str.isEmpty()) {
                c0277m1 = new C0277m1(0, false);
            } else {
                Matcher matcher = Pattern.compile("[Ss](\\d+)[Ee](\\d+)").matcher(str);
                if (matcher.find()) {
                    try {
                        int i4 = Integer.parseInt(matcher.group(2));
                        Integer.parseInt(matcher.group(1));
                        c0277m1 = new C0277m1(i4, true);
                    } catch (NumberFormatException unused2) {
                        int iH4 = h(str);
                        c0277m1 = new C0277m1(iH4, iH4 > 0);
                    }
                } else {
                    int iH5 = h(str);
                    c0277m1 = new C0277m1(iH5, iH5 > 0);
                }
            }
            if (c0277m1.b && (i2 = c0277m1.a) > 0) {
                return i2;
            }
        }
        return 0;
    }

    public static String l(int i2, String str) {
        if (str != null && !str.isEmpty()) {
            String str2 = (String) p.get(str);
            if (str2 != null && !str2.trim().isEmpty()) {
                return str2.trim();
            }
            String str3 = (String) o.get(str);
            if (str3 != null && !str3.trim().isEmpty()) {
                return str3.trim();
            }
            int iIndexOf = str.indexOf(36);
            if (iIndexOf > 0) {
                String strTrim = str.substring(0, iIndexOf).trim();
                if (!strTrim.isEmpty()) {
                    return strTrim;
                }
            }
        }
        return i2 > 0 ? com.github.catvod.spider.merge.D.b.h("第", i2, "集") : "正片";
    }

    public static synchronized void m(String str, String str2) {
        if (str != null) {
            try {
                if (!str.trim().isEmpty()) {
                    p(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (str2 != null && !str2.trim().isEmpty()) {
            q(str2);
        }
    }

    public static synchronized void n(int i2) {
        if (i2 >= 0) {
            if (i2 != d) {
                d = i2;
                h++;
            }
        }
    }

    public static synchronized void o(com.github.catvod.spider.merge.p001b.k kVar) {
        if (kVar == null) {
            return;
        }
        String strC = kVar.c();
        String strD = kVar.d();
        String strE = kVar.e();
        if (strC != null && !strC.trim().isEmpty() && strE != null && !strE.trim().isEmpty() && !"搜索".equals(strD)) {
            p(strC);
            q(strE);
            JSONObject jSONObjectB = AbstractC0312y1.b(kVar);
            b = jSONObjectB.optString("vod_pic").trim();
            c = jSONObjectB.optString("vod_year").trim();
            k = System.currentTimeMillis();
            AbstractC0251e.K(kVar);
        }
    }

    public static synchronized void p(String str) {
        String strTrim;
        if (str != null) {
            try {
                strTrim = str.trim();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            strTrim = "";
        }
        if (strTrim.isEmpty()) {
            return;
        }
        if (!a.equals(strTrim)) {
            g = "";
            try {
                com.github.catvod.spider.merge.p000a.I.p().i();
            } catch (Exception unused) {
            }
            C0252e0.Y = "";
            C0252e0.Z = null;
            C0252e0.a0.clear();
            C0252e0.b0 = 0;
            C0252e0.c0 = 0;
            C0252e0.d0 = null;
            e = 0;
            b = "";
            c = "";
            f = "";
            n = new HashMap();
            o = new HashMap();
            p = new HashMap();
            h++;
        }
        a = strTrim;
    }

    public static synchronized void q(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    if (!str.equals(f)) {
                        g = "";
                        C0252e0.Y = "";
                        C0252e0.Z = null;
                        C0252e0.a0.clear();
                        C0252e0.b0 = 0;
                        C0252e0.c0 = 0;
                        C0252e0.d0 = null;
                        h++;
                    }
                    f = str;
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    HashMap map3 = new HashMap();
                    String[] strArrSplit = str.split("\\$\\$\\$");
                    if (strArrSplit.length > 0) {
                        e = r(strArrSplit[0]).length;
                    }
                    for (String str2 : strArrSplit) {
                        String[] strArrR = r(str2);
                        String[] strArr = new String[strArrR.length];
                        for (int i2 = 0; i2 < strArrR.length; i2++) {
                            String strSubstring = strArrR[i2];
                            if (strSubstring == null) {
                                strSubstring = "";
                            }
                            int iIndexOf = strSubstring.indexOf("$");
                            if (iIndexOf >= 0) {
                                strSubstring = strSubstring.substring(0, iIndexOf);
                            }
                            strArr[i2] = strSubstring;
                        }
                        String[] strArrF = f(strArr);
                        for (int i3 = 0; i3 < strArrR.length; i3++) {
                            String str3 = strArrR[i3];
                            int iIndexOf2 = str3.indexOf("$");
                            if (iIndexOf2 >= 0 && iIndexOf2 < str3.length() - 1) {
                                String strSubstring2 = str3.substring(iIndexOf2 + 1);
                                String strSubstring3 = str3.substring(0, iIndexOf2);
                                if (!map.containsKey(strSubstring2)) {
                                    map.put(strSubstring2, Integer.valueOf(i3 + 1));
                                    map2.put(strSubstring2, strSubstring3);
                                    map3.put(strSubstring2, strArrF[i3]);
                                }
                            }
                        }
                    }
                    n = map;
                    o = map2;
                    p = map3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String[] r(String str) {
        if (str == null || str.isEmpty()) {
            return new String[0];
        }
        if (!str.contains("#")) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '[' || cCharAt == '(' || cCharAt == 65288 || cCharAt == 12304 || cCharAt == 12298) {
                i3++;
            } else if ((cCharAt == ']' || cCharAt == ')' || cCharAt == 65289 || cCharAt == 12305 || cCharAt == 12299) && i3 > 0) {
                i3--;
            } else if (cCharAt == '#' && i3 == 0) {
                arrayList.add(str.substring(i2, i4));
                i2 = i4 + 1;
            }
        }
        if (i2 < str.length()) {
            arrayList.add(str.substring(i2));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static synchronized void s(String str, String str2) {
        t(str, str2);
    }

    public static synchronized void t(String str, String str2) {
        try {
            if (g(str)) {
                if (str2 != null && !str2.isEmpty()) {
                    String str3 = com.github.catvod.spider.merge.p000a.I.p().c;
                    if (str3 != null && !str3.equals(str2)) {
                        com.github.catvod.spider.merge.p000a.I.p().i();
                    }
                    g = str2;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static int u(String str, String str2) {
        int iK;
        String str3;
        synchronized (AbstractC0280n1.class) {
            iK = k(str, str2);
            n(iK);
            str3 = a;
        }
        if (!str3.isEmpty()) {
            if (com.github.catvod.spider.merge.p010l.a.i().n && AbstractC0251e.I(str3, iK, l(iK, str2), str, str2, b, c)) {
                PianDan.onBehaviorRecorded();
            }
            if (k2.o()) {
                k2.y();
            }
            m = b(str3, c);
            l = System.currentTimeMillis();
        }
        return iK;
    }

    public static String v() {
        String str;
        if (!g.isEmpty() && com.github.catvod.spider.merge.p006g.a.a().l(com.github.catvod.spider.merge.p006g.b.a(g))) {
            return g;
        }
        com.github.catvod.spider.merge.p000a.I iP = com.github.catvod.spider.merge.p000a.I.p();
        String str2 = a;
        int i2 = e;
        synchronized (iP.k) {
            try {
                str = iP.x(i2, str2) ? iP.c : "";
            } catch (Throwable th) {
                throw th;
            }
        }
        return (str == null || str.isEmpty() || !com.github.catvod.spider.merge.p006g.a.a().l(com.github.catvod.spider.merge.p006g.b.a(str))) ? "" : str;
    }
}
