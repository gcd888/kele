package com.github.catvod.spider.merge.A;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.p000a.C0342a0;
import com.github.catvod.spider.merge.p000a.C0364l0;
import com.github.catvod.spider.merge.p022z.C0568t0;
import com.github.catvod.spider.merge.p022z.RunnableC0554q0;
import java.io.File;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0302v0 {
    public static long d;
    public static long e;
    public static Object f;
    public static Object g;
    public static long h;
    public static volatile C0 i;
    public static long p;
    public static final String[] a = {"arm64-v8a", "armeabi-v7a", "x86_64", "x86"};
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final C0239a j = new C0239a();
    public static final C0247c1[] k = {new C0247c1("quark", "夸克", "夸克网盘", -15108398, new String[]{"夸克网盘"}), new C0247c1("uc", "优视", "UC网盘", -39424, new String[]{"优视", "UC网盘"}), new C0247c1("ali", "阿里", "阿里云盘", -15167233, new String[]{"阿里云盘"}), new C0247c1("tianyi", "天翼", "天翼网盘", -15610385, new String[]{"天意", "天翼云盘"}), new C0247c1("yidong", "移动", "移动云盘", -13730510, new String[]{"移动云盘"}), new C0247c1("baidu", "百度", "百度网盘", -13603596, new String[]{"BD", "百度网盘"}), new C0247c1("xunlei", "迅雷", "迅雷网盘", -15374912, new String[]{"迅雷网盘"}), new C0247c1("115", "115", "115网盘", -16735786, new String[]{"115网盘", "pan115"}), new C0247c1("pan123", "123", "123网盘", -15043608, new String[]{"pan123", "123网盘"}), new C0247c1("guangya", "光鸭", "光鸭网盘", -16728155, new String[]{"光鸭网盘"})};
    public static final C0253e1[] l = {new C0253e1("quark_original", "quark", "original", "原画", "需转存 下载原始文件 画质最高", new String[]{"夸克原"}), new C0253e1("quark_smart", "quark", "smart", "智能", "需转存 服务端转码 自动选最佳画质", new String[]{"夸克智", "夸克普"}), new C0253e1("quark_unlimited", "quark", "unlimited", "无限", "优先转存并清理旧文件 失败后无限播放", new String[0]), new C0253e1("uc_original", "uc", "original", "原画", "需转存 下载原始文件 画质最高", new String[]{"优视原", "UC原"}), new C0253e1("uc_smart", "uc", "smart", "智能", "需转存 服务端转码 自动选最佳画质", new String[]{"优视智", "UC智", "UC普"}), new C0253e1("uc_unlimited", "uc", "unlimited", "无限", "优先转存并清理旧文件 失败后无限播放", new String[]{"UC无限"}), new C0253e1("baidu_original", "baidu", "original", "原画", "需转存 下载原始文件", new String[]{"BD原", "百度原"}), new C0253e1("baidu_unlimited", "baidu", "unlimited", "无限", "优先转存并清理旧文件 失败后DLNA无限播放", new String[]{"BD无限"}), new C0253e1("tianyi_original", "tianyi", "original", "原画", "免转存 下载原始文件", new String[]{"天翼"}), new C0253e1("yidong_original", "yidong", "original", "原画", "需登录 获取原画直链", new String[]{"移动原"}), new C0253e1("yidong_smart", "yidong", "smart", "智能", "免登录 网页端转码", new String[]{"移动智", "移动转码", "移动极速"}), new C0253e1("pan123_original", "pan123", "original", "原画", "稳定通用，受额度限制", new String[]{"123原"}), new C0253e1("pan123_unlimited", "pan123", "unlimited", "无限", "高速直连，不计额度", new String[0]), new C0253e1("xunlei_original", "xunlei", "original", "原画", "需转存 下载原始文件", new String[]{"迅雷原"}), new C0253e1("xunlei_smart", "xunlei", "smart", "智能", "免转存 分享直链 已登录可提升画质", new String[]{"迅雷智"}), new C0253e1("115_original", "115", "original", "原画", "需转存 下载原始文件", new String[]{"115原"}), new C0253e1("115_to_123", "115", "rapid", "秒传123┆无限", "使用SHA1秒传后走123无限播放", new String[]{"115秒传123"}), new C0253e1("115_to_ali", "115", "rapid", "秒传阿里┆不限速", "使用SHA1和8字节校验秒传后走阿里PDS无限播放", new String[]{"115秒传阿里"}), new C0253e1("guangya_original", "guangya", "original", "原画", "需登录并转存，下载原始文件", new String[]{"光鸭原"}), new C0253e1("guangya_unlimited", "guangya", "unlimited", "无限", "优先转存并清理旧文件 失败后分享直连", new String[0]), new C0253e1("guangya_to_123", "guangya", "rapid", "秒传123┆无限", "使用分享MD5秒传后走123无限播放", new String[]{"光鸭秒传123"}), new C0253e1("ali_original", "ali", "original", "原画", "需转存 下载原始文件 画质最高", new String[]{"阿里原"}), new C0253e1("ali_smart", "ali", "smart", "智能", "需转存 服务端转码 自动选最佳画质", new String[]{"阿里智"})};
    public static final String[] m = {"quark", "uc", "baidu", "tianyi", "yidong", "pan123", "xunlei", "115", "guangya", "ali"};
    public static final String[] n = {"key", "vodPic", "vodName", "vodFlag", "vodRemarks", "episodeUrl", "revSort", "revPlay", "createTime", "opening", "ending", "position", "duration", "speed", "scale", "cid"};
    public static final Object o = new Object();

    public static boolean A(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String A0() {
        StringBuilder sb = new StringBuilder();
        sb.append(c1("115"));
        sb.append(":");
        sb.append(B1("115"));
        sb.append(" ");
        sb.append(c1("guangya"));
        sb.append(":");
        sb.append(B1("guangya"));
        sb.append(" ");
        sb.append(c1("xunlei"));
        sb.append(":");
        sb.append(B1("xunlei"));
        sb.append(" 清理:");
        sb.append((h0("115") || h0("guangya") || h0("xunlei")) ? "开" : "关");
        return sb.toString();
    }

    public static String A1(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(64);
            for (byte b2 : bArrDigest) {
                sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b2 & 255)));
            }
            return sb.toString();
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static JSONObject B(JSONObject jSONObject) {
        try {
            return jSONObject == null ? new JSONObject() : new JSONObject(jSONObject.toString());
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static boolean B0(String str, String str2) {
        String strN1 = N1(str);
        String strN2 = N1(str2);
        if (strN1.isEmpty() || strN2.isEmpty()) {
            return false;
        }
        return strN1.equals(strN2) || strN2.startsWith(strN1.concat(".")) || strN2.startsWith(strN1.concat("-")) || strN2.startsWith(strN1.concat("_")) || strN1.contains(strN2) || strN2.contains(strN1);
    }

    public static String B1(String str) {
        boolean zL0;
        if (!s1(str)) {
            return "远程关";
        }
        if ("115".equals(str)) {
            zL0 = i0();
        } else if ("guangya".equals(str)) {
            zL0 = k0();
        } else {
            zL0 = "xunlei".equals(str) ? l0() : false;
        }
        return zL0 ? "开" : "关";
    }

    public static JSONObject C(JSONObject jSONObject) {
        try {
            return jSONObject == null ? new JSONObject() : new JSONObject(jSONObject.toString());
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static boolean C0(String str, String str2, String[] strArr) {
        if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
            return true;
        }
        for (String str3 : strArr) {
            if (!TextUtils.isEmpty(str3) && str.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean C1() {
        return (z().length != 0 || o0() || p0() || q0()) ? false : true;
    }

    public static String D() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "danmu.jpg");
    }

    public static String D0() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "max.jpg");
    }

    public static void D1() {
        InitOrigin.run(new RunnableC0315z1(5));
    }

    public static String E(String str) {
        return new String(Base64.decode(str, 11), "UTF-8");
    }

    public static void E0(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectC;
        Iterator<String> itKeys = jSONObject2 == null ? null : jSONObject2.keys();
        while (itKeys != null && itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectN0 = N0(next, jSONObject2.optJSONObject(next));
            if (jSONObjectN0 != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectC = C(jSONObjectN0);
                } else {
                    long jR1 = r1(jSONObjectOptJSONObject);
                    long jR2 = r1(jSONObjectN0);
                    if (jR2 != jR1) {
                        if (jR2 <= jR1) {
                            jSONObjectN0 = jSONObjectOptJSONObject;
                        }
                        jSONObjectC = C(jSONObjectN0);
                    } else {
                        if (x(jSONObjectOptJSONObject, jSONObjectN0) <= 0) {
                            jSONObjectN0 = jSONObjectOptJSONObject;
                        }
                        jSONObjectC = C(jSONObjectN0);
                    }
                }
                try {
                    jSONObject.put(next, jSONObjectC);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static void E1(String str) {
        String str2 = "115";
        if ("115".equals(str)) {
            InitOrigin.run(new N0(-16735786, str2, str2, ".pan115_magnet_config"));
            return;
        }
        String str3 = "guangya";
        if ("guangya".equals(str)) {
            InitOrigin.run(new N0(-16728155, str3, "光鸭", ".guangya_magnet_config"));
        } else {
            String str4 = "xunlei";
            if ("xunlei".equals(str)) {
                InitOrigin.run(new N0(X0("xunlei"), str4, "迅雷", ".xunlei_magnet_config"));
            }
        }
    }

    public static byte[] F(String str) {
        if (str == null || str.trim().isEmpty()) {
            return new byte[0];
        }
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(44);
        if (strTrim.startsWith("data:") && iIndexOf >= 0) {
            strTrim = strTrim.substring(iIndexOf + 1);
        }
        try {
            try {
                return Base64.decode(strTrim, 2);
            } catch (Exception unused) {
                return Base64.decode(strTrim, 0);
            }
        } catch (Exception unused2) {
            return new byte[0];
        }
    }

    public static JSONObject F0(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectK0 = K0(jSONObject);
        JSONObject jSONObjectK1 = K0(jSONObject2);
        long jMax = Math.max(jSONObjectK0.optLong("clearAt"), jSONObjectK1.optLong("clearAt"));
        JSONObject jSONObject3 = new JSONObject();
        E0(jSONObject3, jSONObjectK0.optJSONObject("records"));
        E0(jSONObject3, jSONObjectK1.optJSONObject("records"));
        try {
            return K0(new JSONObject().put("version", 3).put("writerId", jSONObjectK1.optString("writerId", jSONObjectK0.optString("writerId"))).put("updatedAt", Math.max(jSONObjectK0.optLong("updatedAt"), jSONObjectK1.optLong("updatedAt"))).put("clearAt", jMax).put("records", jSONObject3));
        } catch (Exception unused) {
            return K();
        }
    }

    public static String F1() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "go.jpg");
    }

    public static S0 G(String str, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                T0 t0 = (T0) it.next();
                if (t0 != null) {
                    String str2 = t0.b;
                    if (!TextUtils.isEmpty(str2) && !arrayList2.contains(str2)) {
                        arrayList2.add(str2);
                        arrayList.add(t0);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return new S0("", 0, "");
        }
        if (C1()) {
            T0 t1 = (T0) arrayList.get(0);
            return new S0("磁力", 0, t1.a + "$" + t1.b);
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList3.add(TextUtils.isEmpty(((T0) arrayList.get(i2)).a) ? "磁力 " + (i2 + 1) : ((T0) arrayList.get(i2)).a);
        }
        int iM = m(str, arrayList3);
        if (iM < 0) {
            return new S0("", 0, "");
        }
        T0 t2 = (T0) arrayList.get(iM);
        if (!j0()) {
            if (Y()) {
                D1();
            }
            return new S0("", 0, "");
        }
        if (!TextUtils.isEmpty(t2.a)) {
            str = t2.a;
        }
        String str3 = t2.b;
        return new S0(h1(str3), 0, j1(str, str3));
    }

    public static JSONObject G0(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("records");
        Iterator<String> itKeys = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.keys();
        while (itKeys != null) {
            try {
                if (!itKeys.hasNext()) {
                    break;
                }
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject2 != null) {
                    if (jSONObjectOptJSONObject2.optLong("deletedAt") > jSONObjectOptJSONObject2.optLong("updatedAt")) {
                        jSONObject3.put(next, jSONObjectOptJSONObject2.optLong("deletedAt"));
                    } else {
                        jSONObject2.put(next, jSONObjectOptJSONObject2.optLong("updatedAt"));
                    }
                }
            } catch (Exception unused) {
                return new JSONObject();
            }
        }
        return new JSONObject().put("version", 3).put("clearAt", jSONObject.optLong("clearAt")).put("known", jSONObject2).put("tombstones", jSONObject3);
    }

    public static JSONObject G1() {
        JSONObject jSONObjectK0;
        synchronized (o) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObjectO1 = o1();
                JSONObject jSONObjectP1 = p1();
                JSONObject jSONObjectOptJSONObject = jSONObjectO1.optJSONObject("known");
                JSONObject jSONObject = jSONObjectOptJSONObject == null ? new JSONObject() : C(jSONObjectOptJSONObject);
                JSONObject jSONObjectOptJSONObject2 = jSONObjectO1.optJSONObject("tombstones");
                JSONObject jSONObject2 = jSONObjectOptJSONObject2 == null ? new JSONObject() : C(jSONObjectOptJSONObject2);
                long jMax = Math.max(0L, jSONObjectO1.optLong("clearAt"));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObjectP1.has(next) && jSONObject.optLong(next) > jMax && jSONObject2.optLong(next) <= 0) {
                        jSONObject2.put(next, jMax == Long.MAX_VALUE ? jMax : Math.max(Math.max(1L, jCurrentTimeMillis), 1 + jMax));
                    }
                }
                Iterator<String> itKeys2 = jSONObjectP1.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectP1.optJSONObject(next2);
                    if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.optLong("updatedAt") > jSONObject2.optLong(next2)) {
                        jSONObject2.remove(next2);
                    }
                }
                Iterator<String> itKeys3 = jSONObject2.keys();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    long jOptLong = jSONObject2.optLong(next3);
                    if (jOptLong > jMax && !jSONObjectP1.has(next3)) {
                        jSONObjectP1.put(next3, new JSONObject().put("id", next3).put("updatedAt", 0L).put("deletedAt", jOptLong));
                    }
                }
                jSONObjectK0 = K0(new JSONObject().put("version", 3).put("writerId", e0()).put("updatedAt", jCurrentTimeMillis).put("clearAt", jMax).put("records", jSONObjectP1));
                a2(G0(jSONObjectK0));
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObjectK0;
    }

    public static void H(String str, Throwable th, long j2, long j3, boolean z, boolean z2) {
        StringBuilder sbR = com.github.catvod.spider.merge.D.b.r("[HonHonDanmu] stage=", str, " error=", th == null ? "none" : th.getClass().getSimpleName(), " window=");
        sbR.append(Math.max(0L, j2));
        sbR.append(" duration=");
        sbR.append(Math.max(0L, j3));
        sbR.append(" series=");
        sbR.append(z);
        sbR.append(" group=");
        sbR.append(z2);
        SpiderDebug.log(sbR.toString());
    }

    public static int H0(String str, String str2) {
        String strTrim = str == null ? "" : str.replace('\\', '/').replaceAll("\\s+", " ").trim();
        String strTrim2 = str2 != null ? str2.replace('\\', '/').replaceAll("\\s+", " ").trim() : "";
        int length = strTrim.length();
        int length2 = strTrim2.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length && i3 < length2) {
            char cCharAt = strTrim.charAt(i2);
            char cCharAt2 = strTrim2.charAt(i3);
            if (Character.isDigit(cCharAt) && Character.isDigit(cCharAt2)) {
                while (i2 < length && strTrim.charAt(i2) == '0') {
                    i2++;
                }
                while (i3 < length2 && strTrim2.charAt(i3) == '0') {
                    i3++;
                }
                int i4 = i2;
                while (i4 < length && Character.isDigit(strTrim.charAt(i4))) {
                    i4++;
                }
                int i5 = i3;
                while (i5 < length2 && Character.isDigit(strTrim2.charAt(i5))) {
                    i5++;
                }
                int i6 = (i4 - i2) - (i5 - i3);
                if (i6 != 0) {
                    return i6;
                }
                while (i2 < i4 && i3 < i5) {
                    int iCharAt = strTrim.charAt(i2) - strTrim2.charAt(i3);
                    if (iCharAt != 0) {
                        return iCharAt;
                    }
                    i2++;
                    i3++;
                }
                i2 = i4;
                i3 = i5;
            } else {
                int lowerCase = Character.toLowerCase(cCharAt) - Character.toLowerCase(cCharAt2);
                if (lowerCase != 0) {
                    return lowerCase;
                }
                i2++;
                i3++;
            }
        }
        return (length - i2) - (length2 - i3);
    }

    public static String H1() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "sort0.jpg");
    }

    public static String I() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "sort0.jpg");
    }

    public static C0311y0 I0(long j2, long j3, int i2, String str, JSONObject jSONObject) {
        boolean zOptBoolean;
        String strTrim = "";
        String strTrim2 = jSONObject.optString("next_cursor", "").trim();
        if (m0(strTrim2)) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("common_list_info");
            if (jSONObjectOptJSONObject == null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optJSONObject("common_list_info");
            }
            if (jSONObjectOptJSONObject != null) {
                strTrim = jSONObjectOptJSONObject.optString("next_cursor", jSONObjectOptJSONObject.optString("cursor", "")).trim();
            }
        } else {
            strTrim = strTrim2;
        }
        boolean z = false;
        if (jSONObject.has("has_more")) {
            zOptBoolean = jSONObject.optBoolean("has_more", false);
        } else {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("common_list_info");
            if (jSONObjectOptJSONObject3 == null) {
                JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("data");
                jSONObjectOptJSONObject3 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optJSONObject("common_list_info") : null;
            }
            if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.optBoolean("has_more", false)) {
                z = true;
            }
            zOptBoolean = z;
        }
        if (!zOptBoolean || m0(strTrim) || strTrim.equals(str)) {
            return new C0311y0(0, 0L, "", true);
        }
        long j4 = 30000 + j2;
        return (j3 <= 0 || j4 < j3) ? new C0311y0(i2 + 1, j4, strTrim, false) : new C0311y0(0, 0L, "", true);
    }

    public static String I1(JSONObject jSONObject) {
        String strT = T(jSONObject, "path", "full_path", "fullPath", "file_path", "filePath", "display_path", "displayPath");
        return TextUtils.isEmpty(strT) ? P(jSONObject) : strT;
    }

    public static String J(String str, JSONObject jSONObject) {
        String strH = AbstractC0309x1.h(Q(jSONObject));
        if (TextUtils.isEmpty(strH)) {
            return str;
        }
        return "[" + strH + "] " + str;
    }

    public static String J0(String str) {
        if (str == null) {
            return "";
        }
        if ("armeabi".equals(str)) {
            return "armeabi-v7a";
        }
        return ("arm64-v8a".equals(str) || "armeabi-v7a".equals(str) || "x86_64".equals(str) || "x86".equals(str)) ? str : "";
    }

    public static C0253e1 J1(String str) {
        C0253e1[] c0253e1Arr = l;
        for (int i2 = 0; i2 < 23; i2++) {
            C0253e1 c0253e1 = c0253e1Arr[i2];
            if (c0253e1.a.equals(str)) {
                return c0253e1;
            }
        }
        return null;
    }

    public static JSONObject K() {
        try {
            return new JSONObject().put("version", 3).put("writerId", "").put("updatedAt", 0L).put("clearAt", 0L).put("records", new JSONObject());
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static JSONObject K0(JSONObject jSONObject) {
        JSONObject jSONObjectK = (jSONObject == null || jSONObject.optInt("version") != 3) ? K() : C(jSONObject);
        String str = "clearAt";
        long jMax = Math.max(0L, jSONObjectK.optLong("clearAt"));
        JSONObject jSONObjectOptJSONObject = jSONObjectK.optJSONObject("records");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> itKeys = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.keys();
        while (itKeys != null && itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectN0 = N0(next, jSONObjectOptJSONObject.optJSONObject(next));
            if (jSONObjectN0 != null && r1(jSONObjectN0) > jMax) {
                if (jSONObjectN0.optLong("deletedAt") > jSONObjectN0.optLong("updatedAt")) {
                    arrayList2.add(jSONObjectN0);
                } else {
                    arrayList.add(jSONObjectN0);
                }
            }
        }
        arrayList.sort(new R0(3));
        arrayList2.sort(new R0(3));
        JSONObject jSONObject2 = new JSONObject();
        long jMax2 = Math.max(jMax, jSONObjectK.optLong("updatedAt"));
        int i2 = 0;
        while (i2 < Math.min(arrayList.size(), 500)) {
            try {
                JSONObject jSONObject3 = (JSONObject) arrayList.get(i2);
                jSONObject2.put(jSONObject3.optString("id"), jSONObject3);
                jMax2 = Math.max(jMax2, r1(jSONObject3));
                i2++;
                str = str;
                jMax = jMax;
            } catch (Exception unused) {
                return K();
            }
        }
        String str2 = str;
        long j2 = jMax;
        for (int i3 = 0; i3 < Math.min(arrayList2.size(), 500); i3++) {
            JSONObject jSONObject4 = (JSONObject) arrayList2.get(i3);
            jSONObject2.put(jSONObject4.optString("id"), jSONObject4);
            jMax2 = Math.max(jMax2, r1(jSONObject4));
        }
        return new JSONObject().put("version", 3).put("writerId", jSONObjectK.optString("writerId")).put("updatedAt", jMax2).put(str2, j2).put("records", jSONObject2);
    }

    public static String K1(String str, String str2) {
        C0253e1[] c0253e1Arr = l;
        for (int i2 = 0; i2 < 23; i2++) {
            C0253e1 c0253e1 = c0253e1Arr[i2];
            if (c0253e1.b.equals(str) && c0253e1.c.equals(str2)) {
                return c0253e1.a;
            }
        }
        return "";
    }

    public static String L(String str) {
        try {
            return Base64.encodeToString(String.valueOf(str).getBytes("UTF-8"), 11);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String[] L0(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str2 : strArr) {
                String strJ0 = J0(str2);
                if (!strJ0.isEmpty() && !arrayList.contains(strJ0)) {
                    arrayList.add(strJ0);
                }
            }
        }
        String strJ1 = J0(str);
        if (!strJ1.isEmpty() && !arrayList.contains(strJ1)) {
            arrayList.add(strJ1);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String L1(String str) {
        String strTrim;
        if (str == null) {
            strTrim = "";
        } else {
            strTrim = str.trim();
            int iIndexOf = strTrim.indexOf(35);
            if (iIndexOf >= 0) {
                strTrim = strTrim.substring(0, iIndexOf);
            }
        }
        if (strTrim.isEmpty()) {
            return "";
        }
        C0253e1[] c0253e1Arr = l;
        for (int i2 = 0; i2 < 23; i2++) {
            C0253e1 c0253e1 = c0253e1Arr[i2];
            boolean zW0 = w0(strTrim, c0253e1.a);
            String str2 = c0253e1.a;
            if (zW0 || C0(strTrim, M1(str2), (String[]) c0253e1.f)) {
                return str2;
            }
        }
        String strZ0 = Z0(strTrim);
        if (strZ0.isEmpty()) {
            return "";
        }
        if (strTrim.contains("无限")) {
            return K1(strZ0, "unlimited");
        }
        if (strTrim.contains("原画") || strTrim.contains("原")) {
            return K1(strZ0, "original");
        }
        if (strTrim.contains("智能") || strTrim.contains("智") || strTrim.contains("转码") || strTrim.contains("极速") || strTrim.contains("普")) {
            return K1(strZ0, "smart");
        }
        String str3 = "";
        for (int i3 = 0; i3 < 23; i3++) {
            C0253e1 c0253e2 = c0253e1Arr[i3];
            if (c0253e2.b.equals(strZ0)) {
                if (!str3.isEmpty()) {
                    return "";
                }
                str3 = c0253e2.a;
            }
        }
        return str3;
    }

    public static String M(String str) {
        if (str == null) {
            str = "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String M0(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strV = FishCrypto.v("N1.Ft3Q8tK3u9N4KMzDkuf96utgeYWlFCiea2Us9jo2VQs6YiJUweENUlkVeheOi72mfRUuVZBBijO+SsaS+jM35A==");
        String strV2 = FishCrypto.v("N1.IEfylb1r/YNxpnlVJShDWM6MU4zKHBgsxoWCIxSDgsggo+QC9zt8MKg19UYDEVII7voI1/IbMF4zIGz3CryClw==");
        String strV3 = FishCrypto.v("N1.3c3+OGxaY+rOnPPuwR83EFbrha8554+le3Jyp9kLH+N6chyoA3JyUAspwibOrH22JkeCFtRLGhOa+oUzrqsUZQ==");
        if (TextUtils.isEmpty(strV) || TextUtils.isEmpty(strV2) || TextUtils.isEmpty(strV3)) {
            return "";
        }
        String strReplace = str.trim().replace("&amp;", "&");
        String strV4 = FishCrypto.v("N1.nMn4p+yxESkr+FZBqopW49qyGebQkH4B1BVzFcESmKaWxFV/k2aHhSbCeTatRoCSxQFfaU/V+V1Fhmr3UxfD1g==");
        if (!TextUtils.isEmpty(strV4) && strReplace.startsWith(strV4)) {
            strReplace = strReplace.substring(strV4.length()).replace(FishCrypto.v("N1.PqQ/A52SymnGvlPx1bSsKamFf1MGoOnIfIoCsB+xpb5uhEQ0gPv6JfjrL+xIM92wCeTKsgMvfRvySfnZ+bICpQ=="), "");
        }
        try {
            if (strReplace.contains("%3A") || strReplace.contains("%3F") || strReplace.contains("%26")) {
                strReplace = URLDecoder.decode(strReplace, "UTF-8");
            }
        } catch (Exception unused) {
        }
        Matcher matcher = Pattern.compile("(" + Pattern.quote(strV) + "[^\\s\"'<>]+)", 2).matcher(strReplace);
        if (matcher.find()) {
            strReplace = matcher.group(1);
        }
        String strReplaceAll = strReplace.replaceAll("\\s+", "");
        String lowerCase = strReplaceAll.toLowerCase(Locale.ROOT);
        return (lowerCase.startsWith(strV2) && lowerCase.contains(strV3)) ? strReplaceAll : "";
    }

    public static String M1(String str) {
        C0253e1 c0253e1J1 = J1(str);
        if (c0253e1J1 == null) {
            return str;
        }
        return c1(c0253e1J1.b) + c0253e1J1.d;
    }

    public static String N(String str) {
        int iLastIndexOf;
        int i2;
        return (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(46)) >= 0 && (i2 = iLastIndexOf + 1) < str.length()) ? str.substring(i2) : "";
    }

    public static JSONObject N0(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObjectC = C(jSONObject);
        String strOptString = jSONObjectC.optString("id", str);
        long jMax = Math.max(0L, jSONObjectC.optLong("updatedAt"));
        long jMax2 = Math.max(0L, jSONObjectC.optLong("deletedAt"));
        if (strOptString.matches("[a-f0-9]{64}") && Math.max(jMax, jMax2) > 0) {
            try {
                jSONObjectC.put("id", strOptString).put("updatedAt", jMax).put("deletedAt", jMax2);
                if (jMax2 > jMax) {
                    return new JSONObject().put("id", strOptString).put("updatedAt", 0L).put("deletedAt", jMax2);
                }
                if (jSONObjectC.optString("configKey").isEmpty() || jSONObjectC.optString("siteKey").isEmpty() || jSONObjectC.optString("vodId").isEmpty() || jSONObjectC.optLong("position") <= 0 || jSONObjectC.optLong("duration") <= 0 || !strOptString.equals(d0(jSONObjectC.optString("configKey"), jSONObjectC.optString("siteKey"), jSONObjectC.optString("vodId")))) {
                    return null;
                }
                return jSONObjectC;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String N1(String str) {
        if (str == null) {
            str = "";
        }
        int iMax = Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
        if (iMax >= 0) {
            str = str.substring(iMax + 1);
        }
        return AbstractC0309x1.l(str).toLowerCase(Locale.ROOT).trim();
    }

    public static String O(String str) {
        if (str == null) {
            str = "";
        }
        return AbstractC0309x1.g(str).toLowerCase(Locale.ROOT);
    }

    public static long O0(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0 || cursor.isNull(columnIndex)) {
            return 0L;
        }
        return cursor.getLong(columnIndex);
    }

    public static String O1() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "strategy.jpg");
    }

    public static String P(JSONObject jSONObject) {
        return jSONObject == null ? "" : T(jSONObject, "n", "file_name", "fileName", "filename", "name");
    }

    public static void P0(Activity activity) {
        if (activity == null || !k2.o()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = p;
        if (j2 <= 0 || jElapsedRealtime < j2 || jElapsedRealtime - j2 >= 60000) {
            p = jElapsedRealtime;
            k2.y();
        }
    }

    public static String P1(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return (columnIndex < 0 || cursor.isNull(columnIndex)) ? "" : cursor.getString(columnIndex);
    }

    public static long Q(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0L;
        }
        String[] strArr = {"size", "fileSize", "file_size", "s"};
        for (int i2 = 0; i2 < 4; i2++) {
            long jOptLong = jSONObject.optLong(strArr[i2], -1L);
            if (jOptLong >= 0) {
                return jOptLong;
            }
        }
        return 0L;
    }

    public static SQLiteDatabase Q0() {
        Application applicationContext = InitOrigin.context();
        if (applicationContext == null) {
            throw new IllegalStateException("宿主应用尚未初始化");
        }
        File databasePath = applicationContext.getDatabasePath("tv");
        if (databasePath.isFile()) {
            return SQLiteDatabase.openDatabase(databasePath.getAbsolutePath(), null, 16);
        }
        throw new IllegalStateException("当前软件没有可用的播放历史数据库");
    }

    public static String Q1(String str) {
        if ("115".equals(str)) {
            return R1("115", "115", ".pan115_magnet_config", "需先启用115网盘", "需先登录115", C0299u0.e0("115"), !TextUtils.isEmpty(C0364l0.C().a));
        }
        if ("guangya".equals(str)) {
            return R1("guangya", "光鸭", ".guangya_magnet_config", "需先启用光鸭网盘", "需先登录光鸭", C0299u0.e0("guangya"), C0342a0.x.G());
        }
        return "xunlei".equals(str) ? R1("xunlei", "迅雷", ".xunlei_magnet_config", "需先启用迅雷网盘", "需先登录迅雷", C0299u0.e0("xunlei"), com.github.catvod.spider.merge.p000a.l1.I().Z()) : "";
    }

    public static JSONArray R(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject == null ? null : jSONObject.optJSONArray("files");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() < 2) {
            return jSONArrayOptJSONArray == null ? new JSONArray() : jSONArrayOptJSONArray;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(jSONObjectOptJSONObject);
            }
        }
        Collections.sort(arrayList, new R0(0));
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        return jSONArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String R0(Object obj, long j2, String str, String str2, String str3, String str4, String str5, long j3) {
        String str6;
        C0239a c0239a = j;
        if (obj != null && j2 > 0) {
            String strTrim = str2 == null ? "" : str2.trim();
            String[] strArr = {str3, str4, str5};
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    str6 = "";
                    break;
                }
                String str7 = strArr[i2];
                String strTrim2 = str7 == null ? "" : str7.trim();
                if (!m0(strTrim2)) {
                    str6 = strTrim2;
                    break;
                }
                i2++;
            }
            long jMin = Math.min(2147483647L, Math.max(0L, j3));
            try {
                try {
                    if (m0(strTrim) || m0(str6)) {
                        H("open_rejected", null, 0L, jMin, !m0(strTrim), !m0(str6));
                    } else {
                        try {
                            synchronized (c) {
                                try {
                                    jMin = jMin;
                                    if (n0(obj, j2)) {
                                        JSONObject jSONObjectI = C0239a.i(jMin, strTrim, str6);
                                        String strOptString = jSONObjectI.optString("session_id", "");
                                        String strOptString2 = jSONObjectI.optString("url", "");
                                        if (!strOptString.matches("[0-9a-f]{32}") || m0(strOptString2)) {
                                            if (strOptString.matches("[0-9a-f]{32}")) {
                                                u(c0239a, strOptString, jMin);
                                            }
                                            H("open_invalid", null, 0L, jMin, true, true);
                                            jMin = jMin;
                                        } else if (n0(obj, j2)) {
                                            String str8 = strOptString;
                                            try {
                                                C0 c0 = new C0(jMin, str, strTrim, str6, str8, strOptString2);
                                                try {
                                                    synchronized (b) {
                                                        try {
                                                            if (f == obj && e == j2) {
                                                                C0 c1 = i;
                                                                i = c0;
                                                                g = obj;
                                                                h = j2;
                                                                if (c1 != null && c1 != c0) {
                                                                    c1.b();
                                                                }
                                                                c0.i(0L);
                                                                if (c0.k.compareAndSet(false, true)) {
                                                                    c0.h();
                                                                }
                                                                return strOptString2;
                                                            }
                                                            u(c0239a, strOptString, jMin);
                                                            jMin = str8;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                throw th;
                                            }
                                        } else {
                                            u(c0239a, strOptString, jMin);
                                            jMin = jMin;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    H("open_failed", th, 0L, jMin, true, true);
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
        return null;
    }

    public static String R1(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        if (!s1(str)) {
            return "后台已关闭，磁力走宿主App";
        }
        boolean zOptBoolean = true;
        try {
            String strH = C0297t1.h(str3);
            if (!TextUtils.isEmpty(strH)) {
                zOptBoolean = new JSONObject(strH).optBoolean("takeover", true);
            }
        } catch (Exception unused) {
        }
        if (!zOptBoolean) {
            return "已关闭，磁力走宿主App";
        }
        if (z) {
            return !z2 ? str5 : com.github.catvod.spider.merge.D.b.j("已开启，磁力交给", str2, "云下载");
        }
        return str4;
    }

    public static String S() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "filter.jpg");
    }

    public static S0 S0(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return new S0(str, 1, str2);
        }
        String[] strArrSplit = str.split("\\$\\$\\$", -1);
        String[] strArrSplit2 = str2.split("\\$\\$\\$", -1);
        if (strArrSplit.length != strArrSplit2.length) {
            return new S0(str, 1, str2);
        }
        ArrayList<C0250d1> arrayList = new ArrayList();
        boolean z = false;
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            C0250d1 c0250d1I1 = i1(strArrSplit[i2], i2, strArrSplit2[i2]);
            boolean zIsEmpty = TextUtils.isEmpty(c0250d1I1.a);
            String str3 = c0250d1I1.b;
            z |= (zIsEmpty && TextUtils.isEmpty(str3)) ? false : true;
            if (TextUtils.isEmpty(str3) || C0299u0.g0(str3)) {
                arrayList.add(c0250d1I1);
            }
        }
        if (!z) {
            return new S0(str, 1, str2);
        }
        if (arrayList.isEmpty()) {
            return new S0("", 1, "");
        }
        Collections.sort(arrayList, new R0(1));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C0250d1 c0250d1 : arrayList) {
            arrayList2.add(c0250d1.c);
            arrayList3.add(c0250d1.d);
        }
        return new S0(TextUtils.join("$$$", arrayList2), 1, TextUtils.join("$$$", arrayList3));
    }

    public static String S1() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "thread.jpg");
    }

    public static String T(JSONObject jSONObject, String... strArr) {
        if (jSONObject != null) {
            for (String str : strArr) {
                String strOptString = jSONObject.optString(str, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    return strOptString;
                }
            }
        }
        return "";
    }

    public static String T0(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] strArrSplit = str.split("\\$\\$\\$", -1);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            C0250d1 c0250d1I1 = i1(strArrSplit[i2], i2, "");
            boolean zIsEmpty = TextUtils.isEmpty(c0250d1I1.a);
            String str2 = c0250d1I1.b;
            z |= (zIsEmpty && TextUtils.isEmpty(str2)) ? false : true;
            if (TextUtils.isEmpty(str2) || C0299u0.g0(str2)) {
                arrayList.add(c0250d1I1);
            }
        }
        if (!z) {
            return str;
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        Collections.sort(arrayList, new R0(2));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0250d1) it.next()).c);
        }
        return TextUtils.join("$$$", arrayList2);
    }

    public static String[] T1(String[] strArr) {
        String strY0;
        String[] strArr2 = new String[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if ("quark_vip".equals(str)) {
                strY0 = c1("quark") + "(会员)";
            } else if ("quark".equals(str)) {
                strY0 = c1("quark") + "(普通)";
            } else if ("uc_vip".equals(str)) {
                strY0 = c1("uc") + "(会员)";
            } else if ("uc".equals(str)) {
                strY0 = c1("uc") + "(普通)";
            } else if ("emby".equals(str)) {
                strY0 = "Emby";
            } else {
                strY0 = "webdav".equals(str) ? "WebDAV" : Y0(str);
            }
            strArr2[i2] = strY0;
        }
        return strArr2;
    }

    public static String U() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "guanzhu.jpg");
    }

    public static String U0(String str, String str2, String... strArr) {
        StringBuilder sb = new StringBuilder("sub@@@");
        sb.append(M(str));
        sb.append("@@@");
        sb.append(M(str2));
        for (String str3 : strArr) {
            sb.append("@@@");
            sb.append(M(str3));
        }
        return sb.toString();
    }

    public static String[] U1(String[] strArr) {
        String str;
        String[] strArr2 = new String[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str2 = strArr[i2];
            if ("quark_vip".equals(str2)) {
                str = c1("quark") + "线程数(会员)";
            } else if ("quark".equals(str2)) {
                str = c1("quark") + "线程数(普通)";
            } else if ("uc_vip".equals(str2)) {
                str = c1("uc") + "线程数(会员)";
            } else if ("uc".equals(str2)) {
                str = c1("uc") + "线程数(普通)";
            } else if ("emby".equals(str2)) {
                str = "Emby线程数";
            } else if ("webdav".equals(str2)) {
                str = "WebDAV线程数";
            } else {
                str = c1(str2) + "线程数";
            }
            strArr2[i2] = str;
        }
        return strArr2;
    }

    public static String V() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "scan.jpg");
    }

    public static C0247c1 V0(String str) {
        C0247c1[] c0247c1Arr = k;
        for (int i2 = 0; i2 < 10; i2++) {
            C0247c1 c0247c1 = c0247c1Arr[i2];
            if (c0247c1.a.equals(str)) {
                return c0247c1;
            }
        }
        return null;
    }

    public static String V1() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "189.jpg");
    }

    public static String W() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "guangya.jpg");
    }

    public static String W0() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "123.jpg");
    }

    public static ArrayList W1(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr == null) {
            return arrayList;
        }
        for (String str : strArr) {
            if (str != null && str.startsWith("sub@@@")) {
                String[] strArrSplit = str.substring(6).split("@@@", -1);
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    String str2 = strArrSplit[i2];
                    String strDecode = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    try {
                        strDecode = URLDecoder.decode(str2, "UTF-8");
                    } catch (Exception unused) {
                    }
                    strArrSplit[i2] = strDecode;
                }
                if (strArrSplit.length >= 3) {
                    arrayList.add(strArrSplit);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    public static String X(String str, String str2) {
        String strM;
        if (TextUtils.isEmpty(str2) || !str2.startsWith("xunlei-magnet-file:")) {
            strM = null;
        } else if (!l0()) {
            if (!s1("xunlei")) {
                D1();
            }
            strM = com.github.catvod.spider.merge.p001b.g.m("迅雷磁力云下载不可用");
        } else if (t0("xunlei")) {
            try {
                String strP = com.github.catvod.spider.merge.p000a.l1.I().P(E(str2.substring(19)));
                if (TextUtils.isEmpty(strP)) {
                    strM = com.github.catvod.spider.merge.p001b.g.d("迅雷获取播放地址失败");
                } else {
                    com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
                    gVar.C(strP);
                    gVar.h(Collections.singletonMap("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.56.0.1134 netWorkType/WIFI appid/40 deviceName/Xiaomi_Mi 9 deviceModel/MI 9 OSVersion/9 protocolVersion/301 platformVersion/10 sdkVersion/513006 Oauth2Client/0.9 (Linux 4_4_146) (JAVA 0)"));
                    gVar.n();
                    strM = gVar.r();
                }
            } catch (Exception unused) {
                strM = com.github.catvod.spider.merge.p001b.g.m("迅雷原画播放失败");
            }
        } else {
            strM = com.github.catvod.spider.merge.p001b.g.m("迅雷原画已关闭");
        }
        if (strM == null) {
            if (TextUtils.isEmpty(str2)) {
                strM = null;
            } else {
                String strV = FishCrypto.v("N1.OYA0XFHvu5Aw9rt9ccRgHwYIQDzt023apMtCzSaSf5Vw7qcux/b0JtIyzzmYpf7+HS5B4oAayZn7nP2sT20Meg==");
                if (TextUtils.isEmpty(strV) || !str2.startsWith(strV)) {
                    strM = null;
                } else if (k0()) {
                    try {
                        C0342a0 c0342a0 = C0342a0.x;
                        String strE = E(str2.substring(strV.length()));
                        c0342a0.n();
                        String strY = c0342a0.y(strE);
                        if (TextUtils.isEmpty(strY)) {
                            strM = com.github.catvod.spider.merge.p001b.g.d("光鸭获取播放地址失败");
                        } else {
                            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
                            gVar2.C(strY);
                            gVar2.h(C0342a0.w());
                            gVar2.n();
                            strM = gVar2.r();
                        }
                    } catch (Exception unused2) {
                        strM = com.github.catvod.spider.merge.p001b.g.m("光鸭原画播放失败");
                    }
                } else {
                    if (!s1("guangya")) {
                        D1();
                    }
                    strM = com.github.catvod.spider.merge.p001b.g.m("光鸭磁力云下载不可用");
                }
            }
            if (strM == null) {
                if (TextUtils.isEmpty(str2)) {
                    strM = null;
                } else {
                    String strV2 = FishCrypto.v("N1.LK6McCtJAET835f/TTWesa+HIZNBQGmn1h3Pg6X4IusRJAclc8/UNUQ3X245zHT6oE196WuY0rxslC1FuuIPoA==");
                    if (TextUtils.isEmpty(strV2) || !str2.startsWith(strV2)) {
                        String strV3 = FishCrypto.v("N1.zQzoK/0qD15iyP/KCbicyAKWgFNPst9yCjbWZMMW7/J2CfmwUJjprL6/W/wZbatVFepcmlTdHnczePHnfMbo4Q==");
                        if (TextUtils.isEmpty(strV3) || !str2.startsWith(strV3)) {
                            strM = null;
                        } else if (i0()) {
                            try {
                                strM = C0364l0.C().g0(E(str2.substring(strV3.length())));
                            } catch (Exception unused3) {
                                strM = com.github.catvod.spider.merge.p001b.g.m("115原画播放失败");
                            }
                        } else {
                            if (!s1("115")) {
                                D1();
                            }
                            strM = com.github.catvod.spider.merge.p001b.g.m("115磁力云下载不可用");
                        }
                    } else if (i0()) {
                        try {
                            strM = C0364l0.C().g0(E(str2.substring(strV2.length())));
                        } catch (Exception unused4) {
                            strM = com.github.catvod.spider.merge.p001b.g.m("115原画播放失败");
                        }
                    } else {
                        if (!s1("115")) {
                            D1();
                        }
                        strM = com.github.catvod.spider.merge.p001b.g.m("115磁力云下载不可用");
                    }
                }
            }
        }
        if (strM != null) {
            return strM;
        }
        if (!r0(str2)) {
            return null;
        }
        if (C1()) {
            return com.github.catvod.spider.merge.D.b.f(str2);
        }
        if (Y()) {
            TextUtils.isEmpty(str);
            D1();
        }
        return com.github.catvod.spider.merge.p001b.g.m("磁力已交给云下载接管");
    }

    public static int X0(String str) {
        C0247c1 c0247c1V0 = V0(str);
        if (c0247c1V0 == null) {
            return -16735786;
        }
        return c0247c1V0.d;
    }

    public static boolean X1(JSONObject jSONObject) {
        if (!jSONObject.optString("configKey").matches("[a-f0-9]{64}")) {
            return false;
        }
        String strOptString = jSONObject.optString("siteKey");
        int length = strOptString == null ? 0 : strOptString.length();
        if (length < 1 || length > 2048) {
            return false;
        }
        String strOptString2 = jSONObject.optString("vodId");
        int length2 = strOptString2 == null ? 0 : strOptString2.length();
        return length2 >= 1 && length2 <= 4096 && jSONObject.optString("vodName").length() <= 2048 && jSONObject.optString("vodPic").length() <= 8192 && jSONObject.optString("wallPic").length() <= 8192 && jSONObject.optString("episodeUrl").length() <= 8192 && jSONObject.optLong("position") > 0 && jSONObject.optLong("duration") > 0;
    }

    public static boolean Y() {
        return (!s1("115") && o0()) || (!s1("guangya") && p0()) || (!s1("xunlei") && q0());
    }

    public static String Y0(String str) {
        C0247c1 c0247c1V0 = V0(str);
        return c0247c1V0 == null ? str : c0247c1V0.c;
    }

    public static void Y1(HashSet hashSet, HashSet hashSet2) {
        if (!hashSet.contains("id") || !hashSet.contains("url") || !hashSet.contains("type")) {
            throw new IllegalStateException("当前软件的接口数据库结构不受支持");
        }
        String[] strArr = n;
        for (int i2 = 0; i2 < 16; i2++) {
            if (!hashSet2.contains(strArr[i2])) {
                throw new IllegalStateException("当前软件的播放历史数据库结构不受支持");
            }
        }
    }

    public static String Z() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "health0.jpg");
    }

    public static String Z0(String str) {
        String strTrim;
        if (str == null) {
            strTrim = "";
        } else {
            strTrim = str.trim();
            int iIndexOf = strTrim.indexOf(35);
            if (iIndexOf >= 0) {
                strTrim = strTrim.substring(0, iIndexOf);
            }
        }
        if (strTrim.isEmpty()) {
            return "";
        }
        C0253e1[] c0253e1Arr = l;
        for (int i2 = 0; i2 < 23; i2++) {
            C0253e1 c0253e1 = c0253e1Arr[i2];
            if (w0(strTrim, c0253e1.a) || C0(strTrim, M1(c0253e1.a), (String[]) c0253e1.f)) {
                return c0253e1.b;
            }
        }
        C0247c1[] c0247c1Arr = k;
        for (int i3 = 0; i3 < 10; i3++) {
            C0247c1 c0247c1 = c0247c1Arr[i3];
            if (w0(strTrim, c0247c1.a) || C0(strTrim, c0247c1.b, c0247c1.e)) {
                return c0247c1.a;
            }
        }
        return "";
    }

    public static ContentValues Z1(JSONObject jSONObject, String str, int i2, HashSet hashSet) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("vodPic", jSONObject.optString("vodPic"));
        if (hashSet.contains("wallPic")) {
            contentValues.put("wallPic", jSONObject.optString("wallPic"));
        }
        if (hashSet.contains("player")) {
            contentValues.put("player", jSONObject.optString("player"));
        }
        contentValues.put("vodName", jSONObject.optString("vodName"));
        contentValues.put("vodFlag", jSONObject.optString("vodFlag"));
        contentValues.put("vodRemarks", jSONObject.optString("vodRemarks"));
        contentValues.put("episodeUrl", jSONObject.optString("episodeUrl"));
        contentValues.put("revSort", Integer.valueOf(jSONObject.optBoolean("revSort") ? 1 : 0));
        contentValues.put("revPlay", Integer.valueOf(jSONObject.optBoolean("revPlay") ? 1 : 0));
        contentValues.put("createTime", Long.valueOf(jSONObject.optLong("updatedAt")));
        contentValues.put("opening", Long.valueOf(jSONObject.optLong("opening", -9223372036854775807L)));
        contentValues.put("ending", Long.valueOf(jSONObject.optLong("ending", -9223372036854775807L)));
        contentValues.put("position", Long.valueOf(jSONObject.optLong("position")));
        contentValues.put("duration", Long.valueOf(jSONObject.optLong("duration")));
        contentValues.put("speed", Double.valueOf(jSONObject.optDouble("speed", 1.0d)));
        contentValues.put("scale", Integer.valueOf(jSONObject.optInt("scale", -1)));
        contentValues.put("cid", Integer.valueOf(i2));
        return contentValues;
    }

    public static String a() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "account.jpg");
    }

    public static String a0() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "help.jpg");
    }

    public static String a1(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        int iIndexOf = lowerCase.indexOf(58);
        if (iIndexOf >= 0) {
            lowerCase = lowerCase.substring(0, iIndexOf);
        }
        if ("xl".equals(lowerCase) || "thunder".equals(lowerCase)) {
            return "xunlei";
        }
        if ("tianyi_family".equals(lowerCase)) {
            return "tianyi";
        }
        if ("yidong_family".equals(lowerCase)) {
            return "yidong";
        }
        if ("pan115".equals(lowerCase)) {
            return "115";
        }
        if ("123".equals(lowerCase)) {
            return "pan123";
        }
        return V0(lowerCase) == null ? "" : lowerCase;
    }

    public static void a2(JSONObject jSONObject) {
        C0297t1.j("playback_sync_v3_meta", jSONObject == null ? "" : jSONObject.toString());
        if (!l(jSONObject).equals(l(o1()))) {
            throw new IllegalStateException("播放历史同步状态保存失败");
        }
    }

    public static void b(LinkedHashSet linkedHashSet, String str, HashMap map) {
        if (str.isEmpty()) {
            return;
        }
        if (map == null || map.containsKey(str)) {
            linkedHashSet.add(str);
        }
    }

    public static String b0() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "home.jpg");
    }

    public static String b1(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        if (lowerCase.contains("pan.quark.cn")) {
            return "quark";
        }
        if (lowerCase.contains("drive.uc.cn")) {
            return "uc";
        }
        if (lowerCase.contains("aliyundrive.com") || lowerCase.contains("alipan.com")) {
            return "ali";
        }
        if (lowerCase.contains("cloud.189.cn") || lowerCase.contains("cloud.189.com")) {
            return "tianyi";
        }
        if (lowerCase.contains("yun.139") || lowerCase.contains("caiyun.139.com")) {
            return "yidong";
        }
        if (lowerCase.contains("pan.baidu.com")) {
            return "baidu";
        }
        if (lowerCase.contains("pan.xunlei.com")) {
            return "xunlei";
        }
        if (lowerCase.contains("115.com/s/") || lowerCase.contains("115cdn.com/s/")) {
            return "115";
        }
        if ((lowerCase.contains("/s/") || lowerCase.contains("/123pan/")) && (lowerCase.contains("123pan.com") || lowerCase.contains("123pan.cn") || lowerCase.contains("share.123pan.cn") || lowerCase.contains("123684.com") || lowerCase.contains("123865.com") || lowerCase.contains("123912.com") || lowerCase.contains("123592.com") || lowerCase.matches(".*123\\w{3}\\.com/(?:s|123pan)/.*"))) {
            return "pan123";
        }
        return lowerCase.contains("guangyapan.com/s/") ? "guangya" : "";
    }

    public static String b2() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "yidong.jpg");
    }

    public static String c() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "aiMatch.jpg");
    }

    public static String c0() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "home0.jpg");
    }

    public static String c1(String str) {
        C0247c1 c0247c1V0 = V0(str);
        return c0247c1V0 == null ? str : c0247c1V0.b;
    }

    public static String c2() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "yunpan.jpg");
    }

    public static String d() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "aiTest.jpg");
    }

    public static String d0(String str, String str2, String str3) {
        return A1(str + '\n' + str2 + '\n' + str3);
    }

    public static String d1() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "pansou.jpg");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x013b  */
    public static void e(JSONObject jSONObject) throws Throwable {
        HashSet hashSet;
        HashMap map;
        String strOptString;
        JSONObject jSONObjectK0 = K0(jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObjectK0 == null ? null : jSONObjectK0.optJSONObject("records");
        long jMax = Math.max(0L, jSONObjectK0 == null ? 0L : jSONObjectK0.optLong("clearAt"));
        LinkedHashMap linkedHashMapQ1 = q1();
        SQLiteDatabase sQLiteDatabaseQ0 = Q0();
        try {
            HashSet hashSetV = v(sQLiteDatabaseQ0, "History");
            Y1(v(sQLiteDatabaseQ0, "Config"), hashSetV);
            HashMap map2 = new HashMap();
            for (Map.Entry entry : y(sQLiteDatabaseQ0).entrySet()) {
                map2.put((String) entry.getValue(), (Integer) entry.getKey());
            }
            boolean zContains = hashSetV.contains("wallPic");
            sQLiteDatabaseQ0.beginTransaction();
            if (jMax > 0) {
                try {
                    sQLiteDatabaseQ0.delete("History", "createTime <= ?", new String[]{String.valueOf(jMax)});
                } catch (Throwable th) {
                    sQLiteDatabaseQ0.endTransaction();
                    throw th;
                }
            }
            Iterator<String> itKeys = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.keys();
            while (itKeys != null && itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject2 != null) {
                    if (next.equals(jSONObjectOptJSONObject2.optString("id"))) {
                        boolean z = zContains;
                        Iterator<String> it = itKeys;
                        long jMax2 = Math.max(0L, jSONObjectOptJSONObject2.optLong("updatedAt"));
                        HashSet hashSet2 = hashSetV;
                        HashMap map3 = map2;
                        long jMax3 = Math.max(0L, jSONObjectOptJSONObject2.optLong("deletedAt"));
                        if (Math.max(jMax2, jMax3) <= jMax) {
                            zContains = z;
                            itKeys = it;
                            hashSetV = hashSet2;
                            map2 = map3;
                        } else {
                            JSONObject jSONObject2 = (JSONObject) linkedHashMapQ1.get(next);
                            long jOptLong = jSONObject2 == null ? 0L : jSONObject2.optLong("updatedAt");
                            if (jMax3 > jMax2) {
                                if (jSONObject2 != null && jMax3 >= jOptLong) {
                                    sQLiteDatabaseQ0.delete("History", "`key` = ? AND cid = ?", new String[]{jSONObject2.optString("_key"), String.valueOf(jSONObject2.optInt("_cid"))});
                                }
                                zContains = z;
                                itKeys = it;
                                hashSetV = hashSet2;
                                map2 = map3;
                            } else if (!X1(jSONObjectOptJSONObject2) || jMax2 < jOptLong) {
                                hashSet = hashSet2;
                                map = map3;
                                hashSetV = hashSet;
                                zContains = z;
                                itKeys = it;
                                map2 = map;
                            } else {
                                if (jMax2 == jOptLong && jSONObject2 != null) {
                                    JSONObject jSONObjectB = B(jSONObject2);
                                    jSONObjectB.remove("_key");
                                    jSONObjectB.remove("_cid");
                                    if (x(jSONObjectB, jSONObjectOptJSONObject2) <= 0) {
                                        hashSet = hashSet2;
                                        map = map3;
                                    }
                                    hashSetV = hashSet;
                                    zContains = z;
                                    itKeys = it;
                                    map2 = map;
                                }
                                map = map3;
                                Integer num = (Integer) map.get(jSONObjectOptJSONObject2.optString("configKey"));
                                if (num == null) {
                                    map2 = map;
                                    zContains = z;
                                    itKeys = it;
                                    hashSetV = hashSet2;
                                } else {
                                    String str = jSONObjectOptJSONObject2.optString("siteKey") + "@@@" + jSONObjectOptJSONObject2.optString("vodId");
                                    if (jSONObject2 == null) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(str);
                                        sb.append(z ? "" : "@@@" + num);
                                        strOptString = sb.toString();
                                    } else {
                                        strOptString = jSONObject2.optString("_key");
                                    }
                                    hashSet = hashSet2;
                                    sQLiteDatabaseQ0.insertWithOnConflict("History", null, Z1(jSONObjectOptJSONObject2, strOptString, num.intValue(), hashSet), 5);
                                    hashSetV = hashSet;
                                    zContains = z;
                                    itKeys = it;
                                    map2 = map;
                                }
                            }
                        }
                    }
                }
            }
            sQLiteDatabaseQ0.setTransactionSuccessful();
            sQLiteDatabaseQ0.endTransaction();
            sQLiteDatabaseQ0.close();
        } catch (Throwable th2) {
            sQLiteDatabaseQ0.close();
            throw th2;
        }
    }

    public static String e0() {
        String lowerCase = C0297t1.h("playback_sync_install_id").trim().toLowerCase();
        if (lowerCase.matches("[a-f0-9]{32}")) {
            return lowerCase;
        }
        String strSubstring = AbstractC0309x1.n(UUID.randomUUID().toString()).substring(0, 32);
        C0297t1.j("playback_sync_install_id", strSubstring);
        if (strSubstring.equals(C0297t1.h("playback_sync_install_id"))) {
            return strSubstring;
        }
        throw new IllegalStateException("播放历史设备标识保存失败");
    }

    public static String e1() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "performance.jpg");
    }

    public static com.github.catvod.spider.merge.p001b.k f(com.github.catvod.spider.merge.p001b.k kVar) {
        if (kVar == null) {
            return null;
        }
        S0 S0 = S0(kVar.d(), kVar.e());
        kVar.q(S0.b);
        kVar.r(S0.c);
        return kVar;
    }

    public static int f0(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0 || cursor.isNull(columnIndex)) {
            return 0;
        }
        return cursor.getInt(columnIndex);
    }

    public static String f1(String str) {
        return g1(str, 0, "");
    }

    public static String g() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "backup0.jpg");
    }

    public static void g0(String str, InterfaceC0245c interfaceC0245c) {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(objInvoke);
            if (map != null) {
                for (Object obj : map.values()) {
                    Field declaredField2 = obj.getClass().getDeclaredField("activity");
                    declaredField2.setAccessible(true);
                    Activity activity = (Activity) declaredField2.get(obj);
                    if (activity != null) {
                        String className = activity.getComponentName().getClassName();
                        if (className.contains("Detail") || className.contains("Video")) {
                            activity.finish();
                        }
                    }
                }
            }
        } catch (Exception e2) {
            com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder("[ActionDispatcher] finishDetailActivity: "));
        }
        if (str != null) {
            InitOrigin.execute(new RunnableC0242b(interfaceC0245c, str, 0));
        }
    }

    public static String g1(String str, int i2, String str2) {
        C0253e1 c0253e1J1 = J1(str);
        if (c0253e1J1 == null) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = c0253e1J1.d;
        }
        String str3 = c1(c0253e1J1.b) + str2;
        return i2 > 0 ? String.format(Locale.US, "%s#%02d%02d", str3, 1, Integer.valueOf(i2)) : str3;
    }

    public static String h() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "bili.jpg");
    }

    public static boolean h0(String str) {
        boolean zOptBoolean;
        if (!s1(str)) {
            return false;
        }
        try {
            String strH = C0297t1.h(k1(str));
            zOptBoolean = TextUtils.isEmpty(strH) ? false : new JSONObject(strH).optBoolean("cleanup", false);
        } catch (Exception unused) {
        }
        return zOptBoolean;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    public static String h1(String str) {
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        if (z().length == 0 && C1()) {
            arrayList.add("磁力");
        }
        String str4 = "";
        if (i0() && t0("115")) {
            if (i0()) {
                JSONArray jSONArrayR = R(C0364l0.C().G(M0(str)));
                if (jSONArrayR.length() > 0) {
                    str3 = "115原画 · " + jSONArrayR.length() + "个文件";
                } else {
                    str3 = "";
                }
            } else {
                str3 = "";
            }
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(str3);
            }
        }
        if (k0() && t0("guangya")) {
            if (k0()) {
                JSONArray jSONArrayR2 = R(C0342a0.x.x(M0(str)));
                if (jSONArrayR2.length() > 0) {
                    str2 = "光鸭原画 · " + jSONArrayR2.length() + "个文件";
                } else {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
        }
        if (l0() && t0("xunlei")) {
            if (l0() && t0("xunlei")) {
                JSONArray jSONArrayR3 = R(com.github.catvod.spider.merge.p000a.l1.I().R(M0(str)));
                if (jSONArrayR3.length() > 0) {
                    str4 = "迅雷原画 · " + jSONArrayR3.length() + "个文件";
                }
            }
            if (!TextUtils.isEmpty(str4)) {
                arrayList.add(str4);
            }
        }
        return T0(TextUtils.join("$$$", arrayList));
    }

    public static JSONObject i(String str, String str2, long j2, long j3, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("group_id", str2 == null ? "" : str2.trim());
        jSONObject.put("series_id", str != null ? str.trim() : "");
        jSONObject.put("duration", Math.max(0L, j2));
        jSONObject.put("start_offset_time", Math.max(0L, j3));
        jSONObject.put("cursor", str3.trim());
        jSONObject.put("count", 100);
        jSONObject.put("sort", "desc");
        return jSONObject;
    }

    public static boolean i0() {
        return s1("115") && o0();
    }

    public static C0250d1 i1(String str, int i2, String str2) {
        String strL1 = L1(str);
        String strZ0 = Z0(str);
        if (TextUtils.isEmpty(strZ0)) {
            C0253e1 c0253e1J1 = J1(strL1);
            strZ0 = c0253e1J1 == null ? "" : c0253e1J1.b;
        }
        return new C0250d1(strZ0, strL1, str, str2, i2);
    }

    public static String j(String str) {
        if (str == null) {
            return c2();
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains("quark") || lowerCase.contains("夸克")) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "quark.jpg");
        }
        if (lowerCase.contains("uc") || lowerCase.contains("优视")) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "uc.jpg");
        }
        if (lowerCase.contains("ali") || lowerCase.contains("阿里")) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "ali.jpg");
        }
        if (lowerCase.contains("baidu") || lowerCase.contains("百度")) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "baidu.jpg");
        }
        if (lowerCase.contains("tianyi") || lowerCase.contains("天翼") || lowerCase.contains("189")) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "189.jpg");
        }
        if (lowerCase.equals("xl") || lowerCase.contains("xunlei") || lowerCase.contains("迅雷")) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "xunlei.jpg");
        }
        if (lowerCase.contains("magnet") || lowerCase.contains("磁力") || lowerCase.contains("cili")) {
            return z0();
        }
        if (lowerCase.contains("115")) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "115.jpg");
        }
        if (lowerCase.equals("123") || lowerCase.contains("pan123") || lowerCase.contains("123pan") || lowerCase.contains("123盘") || lowerCase.contains("123网盘") || lowerCase.contains("123云盘")) {
            return W0();
        }
        if (lowerCase.contains("guangya") || lowerCase.contains("光鸭")) {
            return W();
        }
        if (lowerCase.contains("yidong") || lowerCase.contains("移动") || lowerCase.contains("139")) {
            return b2();
        }
        if (lowerCase.contains("huya") || lowerCase.contains("虎牙")) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "huya.jpg");
        }
        if (lowerCase.contains("douyu") || lowerCase.contains("斗鱼")) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "douyu.jpg");
        }
        if (lowerCase.contains("douyin") || lowerCase.contains("抖音")) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "douyin.jpg");
        }
        if (lowerCase.contains("kuaishou") || lowerCase.contains("快手")) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "kuaishou.jpg");
        }
        if (lowerCase.contains("bili") || lowerCase.contains("哔哩") || lowerCase.contains("b站")) {
            return h();
        }
        return (lowerCase.contains("danmu") || lowerCase.contains("弹幕")) ? D() : c2();
    }

    public static boolean j0() {
        return i0() || k0() || l0();
    }

    /* JADX WARN: Code duplicated, block: B:164:0x042c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0435  */
    /* JADX WARN: Code duplicated, block: B:169:0x043d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0456  */
    /* JADX WARN: Code duplicated, block: B:171:0x046f  */
    /* JADX WARN: Code duplicated, block: B:322:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Instruction removed from duplicated block: B:169:0x043d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:170:0x0456, please report this as an issue */
    public static String j1(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        Object obj;
        String str7;
        ArrayList arrayList;
        String str8;
        String str9;
        ArrayList arrayList2;
        String string;
        String str10;
        String str11;
        String str12;
        JSONObject jSONObjectT0;
        long j2;
        String str13;
        String str14;
        String str15;
        String str16;
        String strOptString;
        String string2;
        String str17;
        String str18;
        String str19;
        String str20;
        String string3;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        int i2;
        String str26;
        String str27;
        int i3;
        String string4;
        JSONArray jSONArray;
        String strM0 = M0(str2);
        String str28 = "";
        if (TextUtils.isEmpty(strM0)) {
            return "";
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            str9 = "xunlei";
            string = "";
        } else {
            String[] strArrZ = z();
            if (strArrZ.length == 0) {
                str9 = "xunlei";
                string = "";
            } else {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int length = strArrZ.length;
                int i4 = 0;
                while (true) {
                    str3 = str28;
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = length;
                    String str29 = strArrZ[i4];
                    String[] strArr = strArrZ;
                    JSONObject jSONObjectL1 = l1(str29, strM0);
                    if (R(jSONObjectL1).length() <= 0) {
                        String strOptString2 = jSONObjectL1 == null ? "new" : jSONObjectL1.optString("status", "new");
                        if ("submitted".equals(strOptString2) || "downloading".equals(strOptString2) || "indexing".equals(strOptString2) || "done".equals(strOptString2)) {
                            arrayList3.add(str29);
                        } else if ("new".equals(strOptString2)) {
                            arrayList4.add(str29);
                        }
                    }
                    i4++;
                    str28 = str3;
                    length = i5;
                    strArrZ = strArr;
                }
                if (arrayList4.isEmpty()) {
                    str7 = "new";
                    str8 = "status";
                    str6 = "downloading";
                    obj = "submitted";
                    str4 = "done";
                    str5 = "indexing";
                    arrayList = arrayList3;
                    str9 = "xunlei";
                } else if (Looper.myLooper() == Looper.getMainLooper()) {
                    arrayList4 = new ArrayList();
                    str7 = "new";
                    str8 = "status";
                    str6 = "downloading";
                    obj = "submitted";
                    str4 = "done";
                    str5 = "indexing";
                    arrayList = arrayList3;
                    str9 = "xunlei";
                } else {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    boolean[] zArr = new boolean[arrayList4.size()];
                    str4 = "done";
                    boolean[] zArr2 = {false};
                    str5 = "indexing";
                    AlertDialog[] alertDialogArr = new AlertDialog[1];
                    Arrays.fill(zArr, true);
                    str6 = "downloading";
                    obj = "submitted";
                    str7 = "new";
                    arrayList = arrayList3;
                    str8 = "status";
                    str9 = "xunlei";
                    InitOrigin.run(new J0(zArr2, countDownLatch, str, arrayList4, zArr, alertDialogArr));
                    try {
                        if (countDownLatch.await(15000L, TimeUnit.MILLISECONDS)) {
                            arrayList4 = new ArrayList();
                            if (zArr2[0]) {
                                int i6 = 0;
                                for (ArrayList arrayList5 = arrayList4; i6 < arrayList5.size(); arrayList5 = arrayList2) {
                                    if (zArr[i6]) {
                                        arrayList2 = arrayList5;
                                        arrayList4.add((String) arrayList2.get(i6));
                                    } else {
                                        arrayList2 = arrayList5;
                                    }
                                    i6++;
                                }
                            }
                        } else {
                            InitOrigin.run(new Q0(alertDialogArr, 1));
                            arrayList4 = new ArrayList();
                        }
                    } catch (Exception unused) {
                        arrayList4 = new ArrayList();
                    }
                }
                arrayList.addAll(arrayList4);
                if (arrayList.isEmpty()) {
                    string = str3;
                } else {
                    long jMax = Math.max(2000L, 60000 / ((long) arrayList.size()));
                    CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    C0568t0[] c0568t0Arr = new C0568t0[1];
                    InitOrigin.run(new RunnableC0240a0(countDownLatch2, c0568t0Arr, str, arrayList));
                    try {
                        countDownLatch2.await(1500L, TimeUnit.MILLISECONDS);
                    } catch (Exception unused2) {
                    }
                    C0568t0 c0568t0 = c0568t0Arr[0];
                    if (c0568t0 != null) {
                        c0568t0.c(2, "已选择" + arrayList.size() + "个云盘，开始准备原画文件");
                    }
                    int i7 = 0;
                    while (i7 < arrayList.size()) {
                        String str30 = (String) arrayList.get(i7);
                        boolean zContains = arrayList4.contains(str30);
                        int iMax = Math.max(5, (i7 * 90) / arrayList.size());
                        JSONObject jSONObjectL2 = l1(str30, strM0);
                        if (c0568t0 != null) {
                            c0568t0.c(iMax, n1(str30) + "：读取任务记录");
                        }
                        if (zContains && h0(str30)) {
                            if (c0568t0 != null) {
                                c0568t0.c(Math.min(94, iMax + 3), n1(str30) + "：清理上次磁力目录");
                            }
                            if (h0(str30)) {
                                try {
                                    if ("115".equals(str30)) {
                                        C0364l0.C().g(strM0);
                                    } else if ("guangya".equals(str30)) {
                                        C0342a0.x.i(strM0);
                                    } else if (str9.equals(str30)) {
                                        com.github.catvod.spider.merge.p000a.l1.I().f(strM0);
                                    }
                                } catch (Exception e2) {
                                    X0.a(n1(str30) + "清理上次任务失败: " + e2.getMessage());
                                }
                            }
                        } else {
                            arrayList = arrayList;
                        }
                        if (c0568t0 != null) {
                            int iMin = Math.min(94, iMax + 6);
                            if (zContains) {
                                string2 = n1(str30) + "：提交磁力并创建云盘目录";
                                str10 = str5;
                                str11 = str7;
                                str12 = str8;
                            } else {
                                if (jSONObjectL2 == null) {
                                    str11 = str7;
                                    strOptString = str11;
                                    str12 = str8;
                                } else {
                                    str11 = str7;
                                    str12 = str8;
                                    strOptString = jSONObjectL2.optString(str12, str11);
                                }
                                if (obj.equals(strOptString)) {
                                    string2 = n1(str30) + "：任务已提交，查询任务状态";
                                } else {
                                    String str31 = str6;
                                    if (str31.equals(strOptString)) {
                                        string2 = n1(str30) + "：云下载中，轮询文件列表";
                                        str6 = str31;
                                    } else {
                                        str10 = str5;
                                        str6 = str31;
                                        if (str10.equals(strOptString)) {
                                            obj = obj;
                                            string2 = n1(str30) + "：任务已完成，等待文件同步";
                                        } else {
                                            String str32 = str4;
                                            if (str32.equals(strOptString)) {
                                                obj = obj;
                                                str4 = str32;
                                                obj = obj;
                                                string2 = n1(str30) + "：任务已完成，等待文件同步";
                                            } else {
                                                obj = obj;
                                                StringBuilder sb = new StringBuilder();
                                                str4 = str32;
                                                sb.append(n1(str30));
                                                sb.append("：检查云盘任务和文件列表");
                                                string2 = sb.toString();
                                            }
                                        }
                                    }
                                }
                                str10 = str5;
                            }
                            c0568t0.c(iMin, string2);
                        } else {
                            str10 = str5;
                            str11 = str7;
                            str12 = str8;
                        }
                        try {
                            if ("115".equals(str30)) {
                                jSONObjectT0 = C0364l0.C().l0(jMax, strM0, str);
                            } else if ("guangya".equals(str30)) {
                                jSONObjectT0 = C0342a0.x.c0(jMax, strM0, str);
                            } else {
                                jSONObjectT0 = str9.equals(str30) ? com.github.catvod.spider.merge.p000a.l1.I().t0(jMax, strM0, str) : l1(str30, strM0);
                            }
                        } catch (Exception e3) {
                            X0.a(n1(str30) + "准备失败: " + e3.getMessage());
                        }
                        if (c0568t0 != null) {
                            int iMin2 = Math.min(96, ((i7 + 1) * 90) / arrayList.size());
                            int length2 = R(jSONObjectT0).length();
                            if (length2 > 0) {
                                j2 = jMax;
                                str16 = n1(str30) + "已发现" + length2 + "个文件" + ((jSONObjectT0 == null || !jSONObjectT0.optBoolean("scan_truncated", false)) ? str3 : "（文件较多，已显示前5000个）");
                                str14 = str3;
                                str12 = str12;
                                str13 = str4;
                            } else {
                                j2 = jMax;
                                String strOptString3 = jSONObjectT0 == null ? str11 : jSONObjectT0.optString(str12, str11);
                                if (jSONObjectT0 == null) {
                                    str15 = str3;
                                    str14 = str15;
                                } else {
                                    str14 = str3;
                                    String strTrim = jSONObjectT0.optString("message", str14).trim();
                                    if (TextUtils.isEmpty(strTrim)) {
                                        strTrim = jSONObjectT0.optString("msg", str14).trim();
                                    }
                                    if (TextUtils.isEmpty(strTrim)) {
                                        strTrim = jSONObjectT0.optString("error", str14).trim();
                                    }
                                    if (TextUtils.isEmpty(strTrim)) {
                                        str15 = str14;
                                    } else {
                                        str15 = "：" + x1(strTrim);
                                    }
                                    if (str10.equals(strOptString3)) {
                                        str13 = str4;
                                    } else {
                                        str13 = str4;
                                        if (str13.equals(strOptString3)) {
                                            if ("failed".equals(strOptString3)) {
                                                str16 = n1(str30) + "任务失败" + str15;
                                            } else {
                                                str16 = n1(str30) + "仍在下载，稍后重进详情会继续检查" + str15;
                                            }
                                        }
                                    }
                                    str16 = n1(str30) + "任务完成，文件同步中" + str15;
                                }
                                if (str10.equals(strOptString3)) {
                                    str13 = str4;
                                    if (str13.equals(strOptString3)) {
                                        if ("failed".equals(strOptString3)) {
                                            str16 = n1(str30) + "任务失败" + str15;
                                        } else {
                                            str16 = n1(str30) + "仍在下载，稍后重进详情会继续检查" + str15;
                                        }
                                    }
                                } else {
                                    str13 = str4;
                                }
                                str16 = n1(str30) + "任务完成，文件同步中" + str15;
                            }
                            c0568t0.c(iMin2, str16);
                        } else {
                            j2 = jMax;
                            str12 = str12;
                            str13 = str4;
                            str14 = str3;
                        }
                        i7++;
                        str3 = str14;
                        str4 = str13;
                        arrayList4 = arrayList4;
                        arrayList = arrayList;
                        jMax = j2;
                        str7 = str11;
                        str8 = str12;
                        str5 = str10;
                    }
                    string = str3;
                    if (c0568t0 != null) {
                        c0568t0.c(100, "检查完成，正在返回详情");
                        c0568t0.b.postDelayed(new RunnableC0554q0(c0568t0), Math.max(0L, 250L));
                    }
                }
            }
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        if (z().length == 0 && C1()) {
            arrayList7.add(strM0);
        }
        if (z().length == 0 && C1()) {
            arrayList6.add("磁力");
        }
        String str33 = "＃";
        String str34 = "＄";
        String str35 = "file_name";
        String str36 = "n";
        String str37 = "name";
        if (i0() && t0("115")) {
            String strM1 = M0(strM0);
            if (!TextUtils.isEmpty(strM1) && i0()) {
                JSONArray jSONArrayR = R(C0364l0.C().G(strM1));
                if (jSONArrayR.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    int i8 = 0;
                    while (i8 < jSONArrayR.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayR.optJSONObject(i8);
                        if (jSONObjectOptJSONObject == null) {
                            jSONArray = jSONArrayR;
                        } else {
                            String strOptString4 = jSONObjectOptJSONObject.optString("fid", string);
                            jSONArray = jSONArrayR;
                            String strOptString5 = jSONObjectOptJSONObject.optString("n", jSONObjectOptJSONObject.optString("file_name", jSONObjectOptJSONObject.optString("name", string)));
                            if (!TextUtils.isEmpty(strOptString4) && !TextUtils.isEmpty(strOptString5)) {
                                if (sb2.length() > 0) {
                                    sb2.append("#");
                                }
                                sb2.append(J(strOptString5.replace("$", "＄").replace("#", "＃"), jSONObjectOptJSONObject));
                                sb2.append("$");
                                sb2.append(FishCrypto.v("N1.LK6McCtJAET835f/TTWesa+HIZNBQGmn1h3Pg6X4IusRJAclc8/UNUQ3X245zHT6oE196WuY0rxslC1FuuIPoA==") + L(strOptString4));
                            }
                        }
                        i8++;
                        jSONArrayR = jSONArray;
                    }
                    string4 = sb2.toString();
                } else {
                    string4 = string;
                }
            } else {
                string4 = string;
            }
            if (!TextUtils.isEmpty(string4)) {
                arrayList6.add(f1("115_original"));
                arrayList7.add(string4);
            }
        } else {
            str9 = str9;
            strM0 = strM0;
        }
        String str38 = "fileName";
        if (k0() && t0("guangya")) {
            String strM2 = M0(strM0);
            if (TextUtils.isEmpty(strM2) || !k0()) {
                str17 = string;
                str18 = "＄";
                str19 = "file_name";
                str20 = "name";
                string = str17;
            } else {
                JSONArray jSONArrayR2 = R(C0342a0.x.x(strM2));
                if (jSONArrayR2.length() > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    str17 = string;
                    int i9 = 0;
                    while (i9 < jSONArrayR2.length()) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayR2.optJSONObject(i9);
                        if (jSONObjectOptJSONObject2 == null) {
                            i3 = 1;
                        } else {
                            String[] strArr2 = {jSONObjectOptJSONObject2.optString("fileId"), jSONObjectOptJSONObject2.optString("id"), jSONObjectOptJSONObject2.optString("fid")};
                            int i10 = 0;
                            while (true) {
                                if (i10 >= 3) {
                                    str26 = str17;
                                    break;
                                }
                                str26 = strArr2[i10];
                                if (!TextUtils.isEmpty(str26)) {
                                    break;
                                }
                                i10++;
                            }
                            String[] strArr3 = {jSONObjectOptJSONObject2.optString("fileName"), jSONObjectOptJSONObject2.optString(str37), jSONObjectOptJSONObject2.optString("n")};
                            int i11 = 0;
                            while (true) {
                                if (i11 >= 3) {
                                    str27 = str17;
                                    break;
                                }
                                String str39 = strArr3[i11];
                                if (!TextUtils.isEmpty(str39)) {
                                    str27 = str39;
                                    break;
                                }
                                i11++;
                            }
                            if (!TextUtils.isEmpty(str26) && !TextUtils.isEmpty(str27)) {
                                if (sb3.length() > 0) {
                                    sb3.append("#");
                                }
                                sb3.append(J(str27.replace("$", " ").replace("#", " "), jSONObjectOptJSONObject2));
                                sb3.append("$");
                                sb3.append(FishCrypto.v("N1.OYA0XFHvu5Aw9rt9ccRgHwYIQDzt023apMtCzSaSf5Vw7qcux/b0JtIyzzmYpf7+HS5B4oAayZn7nP2sT20Meg=="));
                                sb3.append(L(str26));
                            }
                            i3 = 1;
                        }
                        i9 += i3;
                        jSONArrayR2 = jSONArrayR2;
                        str34 = str34;
                        str35 = str35;
                        str37 = str37;
                    }
                    str18 = str34;
                    str19 = str35;
                    str20 = str37;
                    string = sb3.toString();
                } else {
                    str17 = string;
                    str18 = "＄";
                    str19 = "file_name";
                    str20 = "name";
                }
            }
            if (!TextUtils.isEmpty(string)) {
                arrayList6.add(f1("guangya_original"));
                arrayList7.add(string);
            }
        } else {
            str17 = string;
            str33 = "＃";
            str18 = "＄";
            str19 = "file_name";
            str20 = "name";
        }
        if (l0() && t0(str9)) {
            String strM3 = M0(strM0);
            if (!TextUtils.isEmpty(strM3) && l0() && t0(str9)) {
                JSONArray jSONArrayR3 = R(com.github.catvod.spider.merge.p000a.l1.I().R(strM3));
                if (jSONArrayR3.length() > 0) {
                    StringBuilder sb4 = new StringBuilder();
                    int i12 = 0;
                    while (i12 < jSONArrayR3.length()) {
                        JSONObject jSONObjectOptJSONObject3 = jSONArrayR3.optJSONObject(i12);
                        if (jSONObjectOptJSONObject3 == null) {
                            str25 = str18;
                            str22 = str20;
                            i2 = 1;
                            str24 = str33;
                        } else {
                            String[] strArr4 = {jSONObjectOptJSONObject3.optString("fid"), jSONObjectOptJSONObject3.optString("fileId"), jSONObjectOptJSONObject3.optString("file_id"), jSONObjectOptJSONObject3.optString("id")};
                            int i13 = 0;
                            while (true) {
                                if (i13 >= 4) {
                                    str21 = str17;
                                    break;
                                }
                                str21 = strArr4[i13];
                                if (!TextUtils.isEmpty(str21)) {
                                    break;
                                }
                                i13++;
                            }
                            str22 = str20;
                            String[] strArr5 = {jSONObjectOptJSONObject3.optString(str36), jSONObjectOptJSONObject3.optString(str19), jSONObjectOptJSONObject3.optString(str38), jSONObjectOptJSONObject3.optString(str22)};
                            int i14 = 0;
                            while (true) {
                                if (i14 >= 4) {
                                    str23 = str17;
                                    break;
                                }
                                str23 = strArr5[i14];
                                if (!TextUtils.isEmpty(str23)) {
                                    break;
                                }
                                i14++;
                            }
                            if (TextUtils.isEmpty(str21) || TextUtils.isEmpty(str23)) {
                                str24 = str33;
                                str25 = str18;
                            } else {
                                if (sb4.length() > 0) {
                                    sb4.append("#");
                                }
                                str25 = str18;
                                str24 = str33;
                                sb4.append(J(str23.replace("$", str25).replace("#", str24), jSONObjectOptJSONObject3));
                                sb4.append("$");
                                sb4.append("xunlei-magnet-file:");
                                sb4.append(L(str21));
                            }
                            i2 = 1;
                        }
                        i12 += i2;
                        str18 = str25;
                        str20 = str22;
                        str33 = str24;
                        str36 = str36;
                        str38 = str38;
                        jSONArrayR3 = jSONArrayR3;
                    }
                    string3 = sb4.toString();
                } else {
                    string3 = str17;
                }
            } else {
                string3 = str17;
            }
            if (!TextUtils.isEmpty(string3)) {
                arrayList6.add(f1("xunlei_original"));
                arrayList7.add(string3);
            }
        }
        return S0(TextUtils.join("$$$", arrayList6), TextUtils.join("$$$", arrayList7)).c;
    }

    public static String k() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "update.jpg");
    }

    public static boolean k0() {
        return s1("guangya") && p0();
    }

    public static String k1(String str) {
        if ("115".equals(str)) {
            return ".pan115_magnet_config";
        }
        if ("guangya".equals(str)) {
            return ".guangya_magnet_config";
        }
        return "xunlei".equals(str) ? ".xunlei_magnet_config" : "";
    }

    public static String l(Object obj) {
        if (obj == null || obj == JSONObject.NULL) {
            return "null";
        }
        int i2 = 0;
        if (!(obj instanceof JSONObject)) {
            if (!(obj instanceof JSONArray)) {
                return ((obj instanceof Number) || (obj instanceof Boolean)) ? String.valueOf(obj) : JSONObject.quote(String.valueOf(obj));
            }
            JSONArray jSONArray = (JSONArray) obj;
            StringBuilder sb = new StringBuilder("[");
            while (i2 < jSONArray.length()) {
                if (i2 > 0) {
                    sb.append(',');
                }
                sb.append(l(jSONArray.opt(i2)));
                i2++;
            }
            sb.append(']');
            return sb.toString();
        }
        JSONObject jSONObject = (JSONObject) obj;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder("{");
        while (i2 < arrayList.size()) {
            if (i2 > 0) {
                sb2.append(',');
            }
            String str = (String) arrayList.get(i2);
            sb2.append(JSONObject.quote(str));
            sb2.append(':');
            sb2.append(l(jSONObject.opt(str)));
            i2++;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public static boolean l0() {
        return s1("xunlei") && q0();
    }

    public static JSONObject l1(String str, String str2) {
        if ("115".equals(str)) {
            return C0364l0.C().G(str2);
        }
        if ("guangya".equals(str)) {
            return C0342a0.x.x(str2);
        }
        if ("xunlei".equals(str)) {
            return com.github.catvod.spider.merge.p000a.l1.I().R(str2);
        }
        return null;
    }

    public static int m(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return -1;
        }
        if (arrayList.size() == 1 || Looper.myLooper() == Looper.getMainLooper()) {
            return 0;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        int[] iArr = {0};
        boolean[] zArr = {false};
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        InitOrigin.run(new J0(zArr, countDownLatch, arrayList, str, iArr, alertDialogArr, 0));
        try {
            if (!countDownLatch.await(15000L, TimeUnit.MILLISECONDS)) {
                InitOrigin.run(new Q0(alertDialogArr, 0));
                return -1;
            }
            if (zArr[0]) {
                return iArr[0];
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static boolean m0(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean m1(String str) {
        JSONObject jSONObjectU1 = u1(str);
        return jSONObjectU1 == null || jSONObjectU1.optBoolean("enabled", true);
    }

    public static JSONObject n(JSONObject jSONObject, long j2) {
        JSONObject jSONObjectK0 = K0(jSONObject);
        long jMax = j2 >= 9223372036854475807L ? Long.MAX_VALUE : Math.max(0L, j2) + 300000;
        try {
            jSONObjectK0.put("updatedAt", Math.min(jSONObjectK0.optLong("updatedAt"), jMax));
            jSONObjectK0.put("clearAt", Math.min(jSONObjectK0.optLong("clearAt"), jMax));
            JSONObject jSONObjectOptJSONObject = jSONObjectK0.optJSONObject("records");
            Iterator<String> itKeys = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.keys();
            while (itKeys != null && itKeys.hasNext()) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(itKeys.next());
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject2.put("updatedAt", Math.min(jSONObjectOptJSONObject2.optLong("updatedAt"), jMax));
                    jSONObjectOptJSONObject2.put("deletedAt", Math.min(jSONObjectOptJSONObject2.optLong("deletedAt"), jMax));
                }
            }
        } catch (Exception unused) {
        }
        return K0(jSONObjectK0);
    }

    public static boolean n0(Object obj, long j2) {
        boolean z;
        synchronized (b) {
            z = f == obj && e == j2;
        }
        return z;
    }

    public static String n1(String str) {
        String strC1 = c1(str);
        return TextUtils.isEmpty(strC1) ? str : com.github.catvod.spider.merge.D.b.i(strC1, "云下载");
    }

    public static String o() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "clean0.jpg");
    }

    public static boolean o0() {
        String strH;
        try {
            strH = C0297t1.h(".pan115_magnet_config");
        } catch (Exception unused) {
        }
        return (TextUtils.isEmpty(strH) ? true : new JSONObject(strH).optBoolean("takeover", true)) && C0299u0.e0("115") && !TextUtils.isEmpty(C0364l0.C().a);
    }

    public static JSONObject o1() {
        try {
            JSONObject jSONObject = new JSONObject(C0297t1.h("playback_sync_v3_meta"));
            return jSONObject.optInt("version") == 3 ? jSONObject : new JSONObject();
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static boolean p(InterfaceC0306w1 interfaceC0306w1, Set set) {
        if (set == null) {
            return false;
        }
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null && !str.trim().isEmpty()) {
                    linkedHashSet.add(str);
                }
                return false;
            }
            List<String> listA = interfaceC0306w1.a();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (String str2 : listA) {
                if (str2 != null && !str2.trim().isEmpty()) {
                    linkedHashSet2.add(str2);
                }
                return false;
            }
            if (!linkedHashSet2.containsAll(linkedHashSet)) {
                return false;
            }
            linkedHashSet2.removeAll(linkedHashSet);
            return linkedHashSet2.isEmpty() || interfaceC0306w1.b(new ArrayList(linkedHashSet2));
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static boolean p0() {
        String strH;
        try {
            strH = C0297t1.h(".guangya_magnet_config");
        } catch (Exception unused) {
        }
        return (TextUtils.isEmpty(strH) ? true : new JSONObject(strH).optBoolean("takeover", true)) && C0299u0.e0("guangya") && C0342a0.x.G();
    }

    public static JSONObject p1() throws Throwable {
        LinkedHashMap linkedHashMapQ1 = q1();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMapQ1.entrySet()) {
            JSONObject jSONObjectB = B((JSONObject) entry.getValue());
            jSONObjectB.remove("_key");
            jSONObjectB.remove("_cid");
            jSONObject.put((String) entry.getKey(), jSONObjectB);
        }
        return jSONObject;
    }

    public static String q(String str) {
        if (!s1(str)) {
            return "远程关";
        }
        boolean zOptBoolean = false;
        try {
            String strH = C0297t1.h(k1(str));
            if (!TextUtils.isEmpty(strH)) {
                zOptBoolean = new JSONObject(strH).optBoolean("cleanup", false);
            }
        } catch (Exception unused) {
        }
        return zOptBoolean ? "开" : "关";
    }

    public static boolean q0() {
        String strH;
        try {
            strH = C0297t1.h(".xunlei_magnet_config");
        } catch (Exception unused) {
        }
        return (TextUtils.isEmpty(strH) ? true : new JSONObject(strH).optBoolean("takeover", true)) && C0299u0.e0("xunlei") && com.github.catvod.spider.merge.p000a.l1.I().Z();
    }

    public static LinkedHashMap q1() throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        String str = "speed";
        String str2 = "duration";
        String str3 = "position";
        String str4 = "player";
        SQLiteDatabase sQLiteDatabaseQ0 = Q0();
        String str5 = "updatedAt";
        try {
            HashSet hashSetV = v(sQLiteDatabaseQ0, "History");
            String str6 = "scale";
            Y1(v(sQLiteDatabaseQ0, "Config"), hashSetV);
            boolean zContains = hashSetV.contains("wallPic");
            HashSet hashSet = hashSetV;
            HashMap mapY = y(sQLiteDatabaseQ0);
            String str7 = "wallPic";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            sQLiteDatabase = sQLiteDatabaseQ0;
            try {
                Cursor cursorQuery = sQLiteDatabaseQ0.query("History", null, "position > 0 AND duration > 0 AND createTime > 0", null, null, null, "createTime DESC", String.valueOf(500));
                while (cursorQuery.moveToNext()) {
                    try {
                        LinkedHashMap linkedHashMap2 = linkedHashMap;
                        int iF0 = f0(cursorQuery, "cid");
                        zContains = zContains;
                        String str8 = (String) mapY.get(Integer.valueOf(iF0));
                        mapY = mapY;
                        String strP1 = P1(cursorQuery, "key");
                        String str9 = str;
                        String[] strArrSplit = strP1.split("@@@", -1);
                        if (str8 == null || strArrSplit.length < 2 || strArrSplit[0].isEmpty() || strArrSplit[1].isEmpty()) {
                            linkedHashMap = linkedHashMap2;
                        } else {
                            String str10 = str2;
                            String strD0 = d0(str8, strArrSplit[0], strArrSplit[1]);
                            boolean z = true;
                            JSONObject jSONObjectPut = new JSONObject().put("id", strD0).put("configKey", str8).put("siteKey", strArrSplit[0]).put("vodId", strArrSplit[1]).put("vodPic", P1(cursorQuery, "vodPic")).put("vodName", P1(cursorQuery, "vodName")).put("vodFlag", P1(cursorQuery, "vodFlag")).put("vodRemarks", P1(cursorQuery, "vodRemarks")).put("episodeUrl", P1(cursorQuery, "episodeUrl")).put("revSort", f0(cursorQuery, "revSort") != 0);
                            if (f0(cursorQuery, "revPlay") == 0) {
                                z = false;
                            }
                            JSONObject jSONObjectPut2 = jSONObjectPut.put("revPlay", z).put("opening", O0(cursorQuery, "opening")).put("ending", O0(cursorQuery, "ending")).put(str3, O0(cursorQuery, str3)).put(str10, O0(cursorQuery, str10));
                            int columnIndex = cursorQuery.getColumnIndex(str9);
                            JSONObject jSONObjectPut3 = jSONObjectPut2.put(str9, (columnIndex < 0 || cursorQuery.isNull(columnIndex)) ? 1.0d : cursorQuery.getDouble(columnIndex));
                            String str11 = str6;
                            str9 = str9;
                            String str12 = str5;
                            String str13 = str3;
                            JSONObject jSONObjectPut4 = jSONObjectPut3.put(str11, f0(cursorQuery, str11)).put(str12, O0(cursorQuery, "createTime")).put("deletedAt", 0L).put("_key", strP1).put("_cid", iF0);
                            if (zContains) {
                                str7 = str7;
                                jSONObjectPut4.put(str7, P1(cursorQuery, str7));
                            } else {
                                str7 = str7;
                            }
                            String str14 = str4;
                            HashSet hashSet2 = hashSet;
                            if (hashSet2.contains(str14)) {
                                jSONObjectPut4.put(str14, P1(cursorQuery, str14));
                            }
                            str4 = str14;
                            hashSet = hashSet2;
                            JSONObject jSONObject = (JSONObject) linkedHashMap2.get(strD0);
                            if (jSONObject == null || jSONObjectPut4.optLong(str12) > jSONObject.optLong(str12)) {
                                linkedHashMap2.put(strD0, jSONObjectPut4);
                            }
                            str6 = str11;
                            str5 = str12;
                            str2 = str10;
                            str3 = str13;
                            linkedHashMap = linkedHashMap2;
                        }
                        str = str9;
                    } catch (Throwable th) {
                        if (cursorQuery == null) {
                            throw th;
                        }
                        try {
                            cursorQuery.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                LinkedHashMap linkedHashMap3 = linkedHashMap;
                cursorQuery.close();
                sQLiteDatabase.close();
                return linkedHashMap3;
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase.close();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase = sQLiteDatabaseQ0;
        }
    }

    public static JSONObject r() {
        JSONObject jSONObjectPut;
        synchronized (o) {
            try {
                JSONObject jSONObjectO1 = o1();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jOptLong = jSONObjectO1.optLong("clearAt");
                if (jOptLong != Long.MAX_VALUE) {
                    jOptLong = Math.max(Math.max(1L, jCurrentTimeMillis), jOptLong + 1);
                }
                a2(new JSONObject().put("version", 3).put("clearAt", jOptLong).put("known", new JSONObject()).put("tombstones", new JSONObject()));
                SQLiteDatabase sQLiteDatabaseQ0 = Q0();
                try {
                    Y1(v(sQLiteDatabaseQ0, "Config"), v(sQLiteDatabaseQ0, "History"));
                    sQLiteDatabaseQ0.delete("History", "createTime <= ?", new String[]{String.valueOf(jOptLong)});
                    sQLiteDatabaseQ0.close();
                    jSONObjectPut = new JSONObject().put("version", 3).put("writerId", e0()).put("updatedAt", jOptLong).put("clearAt", jOptLong).put("records", new JSONObject());
                } catch (Throwable th) {
                    sQLiteDatabaseQ0.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jSONObjectPut;
    }

    public static boolean r0(String str) {
        return !TextUtils.isEmpty(M0(str));
    }

    public static long r1(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0L;
        }
        return Math.max(jSONObject.optLong("updatedAt"), jSONObject.optLong("deletedAt"));
    }

    public static void s(Object obj) {
        C0 c0;
        if (obj == null) {
            return;
        }
        synchronized (b) {
            try {
                c0 = null;
                if (f == obj) {
                    f = null;
                    long j2 = d + 1;
                    d = j2;
                    e = j2;
                }
                if (g == obj) {
                    C0 c1 = i;
                    i = null;
                    g = null;
                    h = 0L;
                    c0 = c1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0 != null) {
            c0.b();
        }
    }

    public static boolean s0(String str) {
        return !TextUtils.isEmpty(b1(str));
    }

    public static boolean s1(String str) {
        if ("xunlei".equals(str)) {
            return m1("115") && m1("guangya");
        }
        return m1(str);
    }

    public static void t(Object obj, long j2) {
        C0 c0;
        if (obj == null || j2 <= 0) {
            return;
        }
        synchronized (b) {
            try {
                c0 = null;
                if (g == obj && h == j2) {
                    C0 c1 = i;
                    i = null;
                    g = null;
                    h = 0L;
                    c0 = c1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0 != null) {
            c0.b();
        }
    }

    public static boolean t0(String str) {
        if ("115".equals(str)) {
            return C0299u0.g0("115_original");
        }
        if ("guangya".equals(str)) {
            return C0299u0.g0("guangya_original");
        }
        if ("xunlei".equals(str)) {
            return C0299u0.g0("xunlei_original");
        }
        return false;
    }

    public static String t1(String str, String str2) {
        JSONObject jSONObjectU1 = u1(str);
        if (jSONObjectU1 == null) {
            return str2;
        }
        String strTrim = jSONObjectU1.optString("message", "").trim();
        return TextUtils.isEmpty(strTrim) ? jSONObjectU1.optString("title", str2) : strTrim;
    }

    public static void u(C0239a c0239a, String str, long j2) {
        if (m0(str)) {
            return;
        }
        try {
            InitOrigin.execute(new RunnableC0305w0(c0239a, str, j2, 0));
        } catch (Throwable th) {
            H("close_schedule_failed", th, 0L, j2, true, true);
        }
    }

    public static boolean u0(String str) {
        return AbstractC0309x1.d.contains(O(str));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026 A[Catch: Exception -> 0x003c, TRY_LEAVE, TryCatch #0 {Exception -> 0x003c, blocks: (B:11:0x0018, B:12:0x001e, B:15:0x0026), top: B:25:0x0018 }] */
    public static JSONObject u1(String str) {
        N1.s();
        JSONObject jSONObject = N1.v;
        JSONObject jSONObjectOptJSONObject = jSONObject == null ? null : jSONObject.optJSONObject("magnet");
        if (jSONObjectOptJSONObject == null) {
            String strOptString = "";
            if (jSONObject != null) {
                try {
                    strOptString = jSONObject.optString("payload", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        jSONObjectOptJSONObject = null;
                    } else {
                        jSONObjectOptJSONObject = new JSONObject(new String(Base64.decode(strOptString, 0), "UTF-8")).optJSONObject("magnet");
                    }
                } catch (Exception unused) {
                }
            } else if (TextUtils.isEmpty(strOptString)) {
                jSONObjectOptJSONObject = null;
            } else {
                jSONObjectOptJSONObject = new JSONObject(new String(Base64.decode(strOptString, 0), "UTF-8")).optJSONObject("magnet");
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONObject("providers");
        if (jSONObjectOptJSONObject2 == null) {
            return null;
        }
        return jSONObjectOptJSONObject2.optJSONObject(str);
    }

    public static HashSet v(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(`" + str + "`)", null);
        try {
            int columnIndex = cursorRawQuery.getColumnIndex("name");
            while (cursorRawQuery.moveToNext()) {
                if (columnIndex >= 0) {
                    hashSet.add(cursorRawQuery.getString(columnIndex));
                }
            }
            cursorRawQuery.close();
            return hashSet;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static String v0(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String v1() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "recovery.jpg");
    }

    public static int w(String str, String str2, String str3, String str4, int i2, int i3) {
        int i4;
        int i5 = Integer.MAX_VALUE;
        int iC = TextUtils.isEmpty(str2) ? Integer.MAX_VALUE : C0299u0.C(str2);
        int iC2 = TextUtils.isEmpty(str4) ? Integer.MAX_VALUE : C0299u0.C(str4);
        if (iC != iC2) {
            return iC < iC2 ? -1 : 1;
        }
        int i6 = 0;
        if (!TextUtils.isEmpty(str)) {
            i4 = 0;
            while (true) {
                int[] iArr = C0299u0.U;
                if (i4 >= iArr.length) {
                    i4 = Integer.MAX_VALUE;
                    break;
                }
                if (C0299u0.S[iArr[i4]].equals(str)) {
                    break;
                }
                i4++;
            }
        } else {
            i4 = Integer.MAX_VALUE;
            break;
        }
        if (!TextUtils.isEmpty(str3)) {
            while (true) {
                int[] iArr2 = C0299u0.U;
                if (i6 >= iArr2.length) {
                    break;
                }
                if (C0299u0.S[iArr2[i6]].equals(str3)) {
                    i5 = i6;
                    break;
                }
                i6++;
            }
        }
        if (i4 != i5) {
            return i4 < i5 ? -1 : 1;
        }
        return i2 - i3;
    }

    public static boolean w0(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        String lowerCase2 = str2.toLowerCase(locale);
        if (!lowerCase.equals(lowerCase2)) {
            if (!lowerCase.startsWith(lowerCase2 + "_")) {
                if (!lowerCase.startsWith(lowerCase2 + "#")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String w1(String str) {
        if (TextUtils.isEmpty(str)) {
            return "磁力";
        }
        String strTrim = str.replace("$", " ").replace("#", " ").replaceAll("[\\r\\n\\t]+", " ").trim();
        return strTrim.length() > 60 ? strTrim.substring(0, 60) : strTrim;
    }

    public static int x(JSONObject jSONObject, JSONObject jSONObject2) {
        int iCompare;
        boolean z = jSONObject.optLong("deletedAt") > jSONObject.optLong("updatedAt");
        boolean z2 = jSONObject2.optLong("deletedAt") > jSONObject2.optLong("updatedAt");
        if (z != z2) {
            return z2 ? 1 : -1;
        }
        return (!z && jSONObject.optString("configKey").equals(jSONObject2.optString("configKey")) && jSONObject.optString("siteKey").equals(jSONObject2.optString("siteKey")) && jSONObject.optString("vodId").equals(jSONObject2.optString("vodId")) && jSONObject.optString("vodFlag").equals(jSONObject2.optString("vodFlag")) && jSONObject.optString("vodRemarks").equals(jSONObject2.optString("vodRemarks")) && jSONObject.optString("episodeUrl").equals(jSONObject2.optString("episodeUrl")) && jSONObject.optLong("duration") == jSONObject2.optLong("duration") && (iCompare = Long.compare(jSONObject2.optLong("position"), jSONObject.optLong("position"))) != 0) ? iCompare : l(jSONObject2).compareTo(l(jSONObject));
    }

    public static String x0(String str) {
        if ("huya".equals(str)) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "huya.jpg");
        }
        if ("douyu".equals(str)) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "douyu.jpg");
        }
        if ("douyin".equals(str)) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "douyin.jpg");
        }
        if ("kuaishou".equals(str)) {
            return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "kuaishou.jpg");
        }
        return "bilibili".equals(str) ? h() : H1();
    }

    public static String x1(String str) {
        if (TextUtils.isEmpty(str)) {
            return "磁力资源";
        }
        String strTrim = str.replaceAll("[\\r\\n\\t]+", " ").trim();
        return strTrim.length() > 80 ? strTrim.substring(0, 80) : strTrim;
    }

    public static HashMap y(SQLiteDatabase sQLiteDatabase) {
        HashMap map = new HashMap();
        Cursor cursorQuery = sQLiteDatabase.query("Config", new String[]{"id", "url"}, "type = 0", null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(1);
                if (string != null && !string.trim().isEmpty()) {
                    map.put(Integer.valueOf(cursorQuery.getInt(0)), A1(string.trim()));
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorQuery.close();
        return map;
    }

    public static String y0() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "login.jpg");
    }

    public static void y1(String str, String str2, boolean z) {
        try {
            String strH = C0297t1.h(str);
            JSONObject jSONObject = TextUtils.isEmpty(strH) ? new JSONObject() : new JSONObject(strH);
            jSONObject.put(str2, z);
            C0297t1.j(str, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public static String[] z() {
        ArrayList arrayList = new ArrayList();
        if (i0() && t0("115")) {
            arrayList.add("115");
        }
        if (k0() && t0("guangya")) {
            arrayList.add("guangya");
        }
        if (l0() && t0("xunlei")) {
            arrayList.add("xunlei");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String z0() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "magnet.jpg");
    }

    public static String z1() {
        return com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "settings.jpg");
    }
}
