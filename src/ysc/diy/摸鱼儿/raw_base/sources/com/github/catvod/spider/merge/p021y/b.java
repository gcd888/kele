package com.github.catvod.spider.merge.p021y;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LruCache;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.ProxyOrigin;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.U0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.G.o;
import com.github.catvod.spider.merge.G.q;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.C0342a0;
import com.github.catvod.spider.merge.p000a.C0349e;
import com.github.catvod.spider.merge.p000a.C0353g;
import com.github.catvod.spider.merge.p000a.C0357i;
import com.github.catvod.spider.merge.p000a.C0364l0;
import com.github.catvod.spider.merge.p000a.C0377s0;
import com.github.catvod.spider.merge.p000a.Q0;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p000a.l1;
import com.github.catvod.spider.merge.p000a.t1;
import com.github.catvod.spider.merge.p001b.c;
import com.github.catvod.spider.merge.p001b.g;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p013o.a;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p022z.P1;
import java.io.File;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class b {
    public static final String[] a = {"ali", "baidu", "quark", "uc", "tianyi", "tianyi_family", "yidong", "yidong_family", "xl", "115", "pan123", "guangya"};
    public static final String[] b = {"名称正序", "名称倒序", "大小正序", "大小倒序", "时间正序", "时间倒序"};
    public static final String[] c = {"按文件名从小到大", "按文件名从大到小", "小文件在前", "大文件在前", "旧文件在前", "新文件在前"};
    public static final String[] d = {"name_asc", "name_desc", "size_asc", "size_desc", "date_asc", "date_desc"};

    public static long A(File file) {
        if (file == null || !file.isFile()) {
            return 0L;
        }
        return file.length();
    }

    public static ArrayList B() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c("默认排序", ""));
        for (int i = 0; i < 6; i++) {
            arrayList.add(new c(b[i], d[i]));
        }
        return arrayList;
    }

    public static String[] C(String str) {
        String str2;
        String strSubstring = "";
        if (TextUtils.isEmpty(str)) {
            return new String[]{"", "", ""};
        }
        if (str.startsWith("//")) {
            String strSubstring2 = str.substring(2);
            int iIndexOf = strSubstring2.indexOf(47);
            if (iIndexOf >= 0) {
                String strSubstring3 = strSubstring2.substring(0, iIndexOf);
                strSubstring = strSubstring2.substring(iIndexOf + 1);
                strSubstring2 = strSubstring3;
            }
            return new String[]{"/", strSubstring2, strSubstring};
        }
        String[] strArrSplit = str.split("/", 3);
        if (strArrSplit.length >= 3) {
            strSubstring = strArrSplit[0];
            String str3 = strArrSplit[1];
            str2 = strArrSplit[2];
            if (strSubstring.isEmpty() && str.startsWith("/")) {
                str = str3;
                strSubstring = "/";
            } else {
                str = str3;
            }
        } else {
            str2 = "";
        }
        return new String[]{strSubstring, str, str2};
    }

    public static int D(String str) {
        str.getClass();
        switch (str) {
            case "tianyi_family":
            case "tianyi":
                return C0299u0.F("tianyi");
            case "pan123":
                return C0299u0.F("pan123");
            case "yidong_family":
            case "yidong":
                return 1;
            case "uc":
                return C0299u0.F("uc");
            case "xl":
                return C0299u0.F("xunlei");
            case "ali":
                return C0299u0.F("ali");
            case "baidu":
                return C0299u0.F("baidu");
            case "quark":
                return C0299u0.F("quark");
            default:
                return 16;
        }
    }

    public static k E(String str, c cVar, String str2) {
        k kVar = new k();
        if ((str.equals("tianyi") || str.equals("tianyi_family") || str.equals("yidong") || str.equals("yidong_family")) && !cVar.d) {
            kVar.n(str + ":" + str2 + "/" + cVar.a + "/" + cVar.b);
        } else {
            StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(str, ":");
            sbP.append(cVar.a);
            kVar.n(sbP.toString());
        }
        kVar.o(cVar.b);
        String str3 = cVar.b;
        boolean z = cVar.d;
        kVar.p(z ? "data:image/png;base64,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" : f.c(str3));
        String str4 = cVar.c;
        if (!str4.isEmpty()) {
            kVar.s(str4);
        }
        kVar.t(z ? "folder" : "file");
        if (!z && !AbstractC0309x1.i(str3)) {
            StringBuilder sbQ = com.github.catvod.spider.merge.D.b.q("filedetail:", str, ":");
            sbQ.append(cVar.a);
            sbQ.append(":");
            sbQ.append(str3);
            String string = sbQ.toString();
            kVar.n(string);
            kVar.g(string);
        }
        return kVar;
    }

    public static void a(k kVar, String str, ArrayList arrayList, ArrayList arrayList2, String str2) {
        int i;
        if (arrayList.isEmpty()) {
            return;
        }
        if (str2 == null) {
            i = -1;
            break;
        }
        i = 0;
        while (true) {
            if (i >= arrayList2.size()) {
                i = -1;
                break;
            } else if (((String) arrayList2.get(i)).equals(str2)) {
                break;
            } else {
                i++;
            }
        }
        int size = arrayList.size();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i >= 0 ? (i + i2) % size : i2;
            if (sb.length() > 0) {
                sb.append("#");
            }
            sb.append(f.f((String) arrayList.get(i3)));
            sb.append("$");
            sb.append((String) arrayList2.get(i3));
        }
        kVar.q(str);
        kVar.r(sb.toString());
        StringBuilder sb2 = new StringBuilder("共");
        sb2.append(size);
        sb2.append("个视频");
        sb2.append(i >= 0 ? " · 当前第" + (i + 1) + "个" : "");
        kVar.s(sb2.toString());
    }

    public static String b(String str, long j, boolean z) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (j > 0 && !z) {
            e eVar = f.a;
            if (j <= 0) {
                str2 = "";
            } else if (j < 1024) {
                str2 = j + " B";
            } else if (j < 1048576) {
                Locale locale = Locale.getDefault();
                double d2 = j;
                Double.isNaN(d2);
                str2 = String.format(locale, "%.1f KB", Double.valueOf(d2 / 1024.0d));
            } else if (j < 1073741824) {
                Locale locale2 = Locale.getDefault();
                double d3 = j;
                Double.isNaN(d3);
                str2 = String.format(locale2, "%.1f MB", Double.valueOf(d3 / 1048576.0d));
            } else {
                Locale locale3 = Locale.getDefault();
                double d4 = j;
                Double.isNaN(d4);
                str2 = String.format(locale3, "%.2f GB", Double.valueOf(d4 / 1.073741824E9d));
            }
            arrayList.add(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        if (arrayList.isEmpty()) {
            return z ? "文件夹" : "文件";
        }
        return TextUtils.join(" · ", arrayList);
    }

    public static String c(c cVar) {
        if (cVar == null) {
            return "";
        }
        String str = cVar.c;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(" · ");
        return iLastIndexOf >= 0 ? str.substring(iLastIndexOf + 3) : str;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 51481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    public static java.util.ArrayList d(java.lang.String r58, java.lang.String r59) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 5148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p021y.b.d(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public static k e(String str, String str2) {
        k kVar = new k();
        kVar.i("FongMi");
        kVar.n(str2);
        kVar.o(str);
        kVar.p("data:image/png;base64,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");
        kVar.q("播放");
        kVar.r(f.f(str) + "$" + str2);
        return kVar;
    }

    public static String f() {
        String strH = C0297t1.h("local_file_sort");
        if (!TextUtils.isEmpty(strH)) {
            String[] strArr = d;
            for (int i = 0; i < 6; i++) {
                if (strArr[i].equals(strH)) {
                    return strH;
                }
            }
        }
        return "name_asc";
    }

    public static boolean g(String str, String str2, String str3) throws Exception {
        str.getClass();
        switch (str) {
            case "tianyi_family":
                Q0 q0F = Q0.f();
                String strI = q0F.i();
                if (strI.isEmpty()) {
                    throw new Exception("无法获取家庭云ID");
                }
                q0F.a(str2, str3, strI, true);
                return true;
            case "tianyi":
                Q0.f().a(str2, str3, "", false);
                return true;
            case "uc":
                Z0 z0T = Z0.t();
                z0T.getClass();
                List listSingletonList = Collections.singletonList(str2);
                HashMap map = new HashMap();
                map.put("action_type", 2);
                map.put("filelist", listSingletonList);
                map.put("exclude_fids", Collections.emptyList());
                z0T.b("file/delete?pr=UCBrowser&fr=pc", Collections.emptyMap(), map, 0, "POST");
                return true;
            case "115":
                C0364l0.C().l(str2);
                return true;
            case "quark":
                A0.s().k(str2);
                return true;
            case "guangya":
                C0342a0 c0342a0 = C0342a0.x;
                c0342a0.n();
                if (!TextUtils.isEmpty(str2)) {
                    c0342a0.m(Collections.singletonList(str2));
                }
                return true;
            default:
                return false;
        }
    }

    public static String h(String str) throws Throwable {
        File[] fileArrListFiles;
        File file = new File(str);
        if (!file.exists()) {
            k kVar = new k();
            kVar.i("FongMi");
            kVar.n(str);
            kVar.o("文件不存在");
            kVar.p("data:image/png;base64,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");
            kVar.q("播放");
            kVar.r(f.f("文件不存在") + "$" + str);
            return g.s(kVar);
        }
        k kVar2 = new k();
        kVar2.n("local:" + str);
        kVar2.o(file.getName());
        kVar2.p("data:image/png;base64,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");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists() && (fileArrListFiles = parentFile.listFiles()) != null) {
            Arrays.sort(fileArrListFiles, f.b);
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && AbstractC0309x1.i(file2.getName())) {
                    arrayList.add(file2.getName());
                    arrayList2.add(file2.getAbsolutePath());
                }
            }
        }
        a(kVar2, "本地播放", arrayList, arrayList2, str);
        if (!arrayList.isEmpty() && parentFile != null) {
            kVar2.l("目录: " + parentFile.getAbsolutePath());
        } else if (arrayList.isEmpty()) {
            kVar2.q("本地播放");
            kVar2.r(f.f(file.getName()) + "$" + file.getAbsolutePath());
        }
        boolean z = FishCrypto.a;
        N1.d(kVar2);
        return g.s(kVar2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0016  */
    public static String i(String str, String str2) throws Exception {
        String string;
        List list;
        JSONArray jSONArrayOptJSONArray;
        String strOptString;
        String strOptString2;
        str.getClass();
        int i = 1;
        String str3 = "";
        switch (str) {
            case "tianyi_family":
                return Q0.f().k(str2, true);
            case "pan123":
                C0377s0 c0377s0 = C0377s0.u;
                c0377s0.e();
                JSONObject jSONObject = (JSONObject) c0377s0.a.get(str2);
                if (jSONObject == null) {
                    return "";
                }
                HashMap map = new HashMap();
                map.put("driveId", 0);
                map.put("fileId", C0377s0.g(jSONObject));
                map.put("s3keyFlag", jSONObject.optString("S3KeyFlag", jSONObject.optString("s3KeyFlag", "")));
                map.put("FileName", jSONObject.optString("FileName", jSONObject.optString("fileName", "")));
                map.put("Size", Long.valueOf(jSONObject.optLong("Size", jSONObject.optLong("size", 0L))));
                map.put("etag", jSONObject.optString("Etag", jSONObject.optString("etag", "")));
                String strD = I0.d(map);
                HashMap map2 = new HashMap();
                map2.put("User-Agent", "123pan/2.5.3(" + c0377s0.f + ";HUAWEI)");
                StringBuilder sb = new StringBuilder("Bearer ");
                sb.append(TextUtils.isEmpty(c0377s0.b) ? "" : c0377s0.b);
                map2.put("Authorization", sb.toString());
                map2.put("Content-Type", "application/json");
                map2.put("app-version", "76");
                map2.put("x-channel", "1007");
                map2.put("x-app-version", "2.5.3");
                map2.put("platform", "android");
                map2.put("devicetype", c0377s0.g);
                map2.put("devicename", "HUAWEI");
                map2.put("devicemodel", c0377s0.g);
                map2.put("osversion", c0377s0.f);
                map2.put("loginuuid", c0377s0.h);
                return C0377s0.G(X1.M("https://yun.123pan.cn/api/file/download_info", strD, map2).a(), "DownloadUrl");
            case "tianyi":
                return Q0.f().k(str2, false);
            case "yidong_family":
                return t1.u().w(str2);
            case "yidong":
                return t1.u().A(str2);
            case "uc":
                Z0 z0T = Z0.t();
                z0T.getClass();
                if (!Z0.N()) {
                    throw new Exception("未登录UC账号");
                }
                for (int i2 = 0; i2 <= 2; i2++) {
                    try {
                        String strL = z0T.L();
                        if (TextUtils.isEmpty(strL)) {
                            string = "";
                        } else {
                            HashMap map3 = new HashMap();
                            map3.put("fids", Collections.singletonList(str2));
                            Map map4 = (Map) I0.b(z0T.b("file/download?pr=UCBrowser&fr=pc&sys=win32&ve=1.8.6&ut=" + strL, null, map3, Integer.valueOf(i), "POST"));
                            if (map4 != null) {
                                int iIntValue = map4.get("status") != null ? ((Number) map4.get("status")).intValue() : 0;
                                if (!(map4.get("message") != null ? map4.get("message").toString() : "").contains("file not found") && iIntValue == 200 && map4.get("data") != null && (list = (List) map4.get("data")) != null && !list.isEmpty()) {
                                    Map map5 = (Map) list.get(0);
                                    if (map5.get("download_url") != null) {
                                        Object obj = map5.get("format_type");
                                        z0T.z = obj != null && obj.toString().toLowerCase().contains("iso");
                                        string = map5.get("download_url").toString();
                                        if (Z0.U(string)) {
                                            z0T.a = "";
                                            a.g().b();
                                        }
                                    }
                                }
                            }
                            string = "";
                        }
                    } catch (Exception unused) {
                    }
                    if (!TextUtils.isEmpty(string)) {
                        return string;
                    }
                    if (i2 < 2) {
                        z0T.a = "";
                        a.g().b();
                    }
                    i = 1;
                }
                throw new Exception("获取下载链接失败");
            case "xl":
                return l1.I().P(str2);
            case "115":
                C0364l0 c0364l0C = C0364l0.C();
                c0364l0C.n();
                if (!C0364l0.O(c0364l0C.a)) {
                    return "";
                }
                String strH = c0364l0C.H(str2);
                return TextUtils.isEmpty(strH) ? "" : c0364l0C.m(strH);
            case "ali":
                return C0349e.j().r(str2);
            case "baidu":
                C0357i c0357iA = C0353g.a();
                c0357iA.getClass();
                com.github.catvod.spider.merge.L.a.d(str2, "fsId");
                if (!C0357i.i()) {
                    throw new Exception("未登录百度账号");
                }
                boolean zStartsWith = str2.startsWith("/");
                o oVar = o.a;
                if (zStartsWith) {
                    strOptString = str2;
                } else {
                    JSONObject jSONObject2 = new JSONObject(X1.X(com.github.catvod.spider.merge.D.b.j("https://pan.baidu.com/api/filemetas?fsids=", "[" + str2 + ']', "&dlink=1"), oVar, c0357iA.e()));
                    if (jSONObject2.optInt("errno", -1) != 0 || (jSONArrayOptJSONArray = jSONObject2.optJSONArray("info")) == null || jSONArrayOptJSONArray.length() == 0) {
                        strOptString = "";
                    } else {
                        strOptString = jSONArrayOptJSONArray.getJSONObject(0).optString("path", "");
                        com.github.catvod.spider.merge.L.a.c(strOptString, "optString(...)");
                    }
                }
                if (strOptString.length() == 0) {
                    throw new Exception("获取文件路径失败");
                }
                String strJ = com.github.catvod.spider.merge.D.b.j("https://pan.baidu.com/api/mediainfo?type=M3U8_FLV_264_480&path=", URLEncoder.encode(strOptString, "UTF-8"), "&clienttype=80&origin=dlna");
                LinkedHashMap linkedHashMapC = q.c(new com.github.catvod.spider.merge.F.a("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;"), new com.github.catvod.spider.merge.F.a("Cookie", C0357i.g()));
                JSONObject jSONObject3 = new JSONObject(X1.X(strJ, oVar, linkedHashMapC));
                JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("info");
                if (jSONObjectOptJSONObject != null && (strOptString2 = jSONObjectOptJSONObject.optString("dlink", "")) != null) {
                    str3 = strOptString2;
                }
                if (str3.length() == 0) {
                    throw new Exception("DLNA API错误[" + jSONObject3.optInt("errno", -1) + "]: " + jSONObject3.optString("errmsg", "无下载权限"));
                }
                try {
                    OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().followRedirects(false).followSslRedirects(false).build();
                    Request.Builder builderUrl = new Request.Builder().url(str3);
                    for (Map.Entry entry : linkedHashMapC.entrySet()) {
                        builderUrl.addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                    Response responseExecute = okHttpClientBuild.newCall(builderUrl.build()).execute();
                    String strHeader = responseExecute.header("Location");
                    if (strHeader == null) {
                        strHeader = responseExecute.header("location");
                    }
                    responseExecute.close();
                    return strHeader == null ? str3 : strHeader;
                } catch (Exception unused2) {
                    return str3;
                }
            case "quark":
                return A0.s().E(str2);
            case "guangya":
                C0342a0 c0342a0 = C0342a0.x;
                c0342a0.n();
                return c0342a0.y(str2);
            default:
                throw new Exception("未知网盘类型");
        }
    }

    public static String j(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("error", jSONObject.optString("message", jSONObject.optString("msg", "")));
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            if (jSONObject.has("errno")) {
                return "errno=" + jSONObject.optInt("errno");
            }
            if (jSONObject.has("code")) {
                return "code=" + jSONObject.optInt("code");
            }
            if (!jSONObject.has("state")) {
                return "加载失败";
            }
            return "state=" + jSONObject.optString("state");
        } catch (Exception unused) {
            return "加载失败";
        }
    }

    public static String k(String str) {
        String[] strArr = a;
        for (int i = 0; i < 12; i++) {
            String str2 = strArr[i];
            if (str.startsWith(str2 + ":")) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:128:0x0283  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed A[PHI: r0 r1 r2 r3 r4
  0x00ed: PHI (r0v34 ??) = (r0v21 ??), (r0v37 ??), (r0v38 ??), (r0v39 ??) binds: [B:98:0x01f1, B:92:0x01b2, B:81:0x0171, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r1v10 ??) = (r1v12 ??), (r1v13 ??), (r1v14 ??), (r1v15 ??) binds: [B:98:0x01f1, B:92:0x01b2, B:81:0x0171, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r2v14 ??) = (r2v16 ??), (r2v17 ??), (r2v18 ??), (r2v19 ??) binds: [B:98:0x01f1, B:92:0x01b2, B:81:0x0171, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r3v79 java.lang.String) = (r3v56 java.lang.String), (r3v64 java.lang.String), (r3v75 java.lang.String), (r3v87 java.lang.String) binds: [B:98:0x01f1, B:92:0x01b2, B:81:0x0171, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r4v30 java.lang.String) = (r4v35 java.lang.String), (r4v36 java.lang.String), (r4v37 java.lang.String), (r4v38 java.lang.String) binds: [B:98:0x01f1, B:92:0x01b2, B:81:0x0171, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4 A[PHI: r0 r3 r4
  0x00f4: PHI (r0v33 java.lang.String) = (r0v40 java.lang.String), (r0v41 java.lang.String), (r0v42 java.lang.String) binds: [B:92:0x01b2, B:81:0x0171, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x00f4: PHI (r3v78 java.lang.String) = (r3v64 java.lang.String), (r3v75 java.lang.String), (r3v87 java.lang.String) binds: [B:92:0x01b2, B:81:0x0171, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x00f4: PHI (r4v29 java.lang.String) = (r4v39 java.lang.String), (r4v40 java.lang.String), (r4v41 java.lang.String) binds: [B:92:0x01b2, B:81:0x0171, B:56:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.github.catvod.spider.merge.a.A0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v30, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v32, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v44, types: [com.github.catvod.spider.merge.a.e] */
    /* JADX WARN: Type inference failed for: r3v47, types: [com.github.catvod.spider.merge.a.i] */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v60, types: [com.github.catvod.spider.merge.a.l0] */
    /* JADX WARN: Type inference failed for: r3v66, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v82, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.StringBuilder] */
    public static String[] l(String str, String str2) {
        ?? r4;
        ?? r2;
        ?? r1;
        ?? r5;
        ?? r3;
        String strY;
        String strA;
        ?? r6;
        String str3;
        String strOptString;
        String str4;
        String str5;
        ?? r7;
        ?? r0 = str;
        ?? r8 = str2;
        ?? r9 = "";
        try {
            String str6 = "quark";
            switch (str.hashCode()) {
                case -1574022063:
                    if (!r0.equals("tianyi_family")) {
                        r3 = -1;
                    } else {
                        r3 = 5;
                    }
                    break;
                case -995595147:
                    if (!r0.equals("pan123")) {
                        r3 = -1;
                    } else {
                        r3 = 10;
                    }
                    break;
                case -874016782:
                    if (!r0.equals("tianyi")) {
                        r3 = -1;
                    } else {
                        r3 = 4;
                    }
                    break;
                case -821960849:
                    if (!r0.equals("yidong_family")) {
                        r3 = -1;
                    } else {
                        r3 = 7;
                    }
                    break;
                case -730781036:
                    if (!r0.equals("yidong")) {
                        r3 = -1;
                    } else {
                        r3 = 6;
                    }
                    break;
                case 3726:
                    if (!r0.equals("uc")) {
                        r3 = -1;
                    } else {
                        r3 = 1;
                    }
                    break;
                case 3828:
                    if (!r0.equals("xl")) {
                        r3 = -1;
                    } else {
                        r3 = 8;
                    }
                    break;
                case 48661:
                    if (!r0.equals("115")) {
                        r3 = -1;
                    } else {
                        r3 = 9;
                    }
                    break;
                case 96670:
                    if (!r0.equals("ali")) {
                        r3 = -1;
                    } else {
                        r3 = 2;
                    }
                    break;
                case 93498907:
                    if (!r0.equals("baidu")) {
                        r3 = -1;
                    } else {
                        r3 = 3;
                    }
                    break;
                case 107940278:
                    if (!r0.equals("quark")) {
                        r3 = -1;
                    } else {
                        r3 = 0;
                    }
                    break;
                case 366170676:
                    if (!r0.equals("guangya")) {
                        r3 = -1;
                    } else {
                        r3 = 11;
                    }
                    break;
                default:
                    r3 = -1;
                    break;
            }
            String strX = "{}";
            try {
                try {
                    try {
                        try {
                            switch (r3) {
                                case 0:
                                case 1:
                                    if (r0.equals("quark")) {
                                        strY = A0.s().F(r8);
                                    } else {
                                        Z0.t().getClass();
                                        strY = Z0.y(str2);
                                    }
                                    JSONObject jSONObjectOptJSONObject = new JSONObject(strY).optJSONObject("data");
                                    if (jSONObjectOptJSONObject == null) {
                                        r0 = r8;
                                        r3 = "";
                                    } else {
                                        strA = f.a(jSONObjectOptJSONObject.optString("file_name", ""));
                                        strOptString = jSONObjectOptJSONObject.optString("pdir_fid", "");
                                        str3 = "pdir_fid";
                                        r0 = r8;
                                        r8 = r8;
                                        r7 = strOptString;
                                        str6 = str3;
                                        String str7 = strA;
                                        r3 = r7;
                                        r9 = str7;
                                    }
                                    break;
                                case 2:
                                    JSONObject jSONObject = new JSONObject(C0349e.j().s(r8));
                                    strA = jSONObject.optString("name", "");
                                    strOptString = jSONObject.optString("parent_file_id", "");
                                    str3 = "parent_file_id";
                                    r0 = r8;
                                    r8 = r8;
                                    r7 = strOptString;
                                    str6 = str3;
                                    String str8 = strA;
                                    r3 = r7;
                                    r9 = str8;
                                    break;
                                case 3:
                                    JSONObject jSONObject2 = new JSONObject(C0353g.a().f(r8));
                                    strA = jSONObject2.optString("filename", "");
                                    strOptString = jSONObject2.optString("parent_path", "");
                                    str3 = "parent_path";
                                    r0 = r8;
                                    r8 = r8;
                                    r7 = strOptString;
                                    str6 = str3;
                                    String str9 = strA;
                                    r3 = r7;
                                    r9 = str9;
                                    break;
                                case 4:
                                case 5:
                                    ?? Split = r8.split("/", 3);
                                    if (Split.length >= 3) {
                                        ?? r10 = Split[0];
                                        r6 = Split[1];
                                        r9 = Split[2];
                                        r3 = r10;
                                        r0 = r6;
                                    } else if (Split.length < 2) {
                                        r0 = r8;
                                        r3 = "";
                                    } else {
                                        r3 = Split[0];
                                        r0 = Split[1];
                                    }
                                    break;
                                case 6:
                                case 7:
                                    String[] strArrC = C(str2);
                                    String str10 = strArrC[0];
                                    r6 = strArrC[1];
                                    r9 = strArrC[2];
                                    r3 = str10;
                                    r0 = r6;
                                    break;
                                case 8:
                                    l1 l1VarI = l1.I();
                                    l1VarI.getClass();
                                    try {
                                        l1VarI.r();
                                        strX = X1.X("https://api-pan.xunlei.com/drive/v1/files/" + r8 + "?space=&usage=PLAY", null, l1VarI.A(l1VarI.J("get:drive/v1/files")));
                                        break;
                                    } catch (Exception unused) {
                                    }
                                    JSONObject jSONObject3 = new JSONObject(strX);
                                    strA = jSONObject3.optString("name", "");
                                    strOptString = jSONObject3.optString("parent_id", "");
                                    str3 = "parent_id";
                                    r0 = r8;
                                    r8 = r8;
                                    r7 = strOptString;
                                    str6 = str3;
                                    String str11 = strA;
                                    r3 = r7;
                                    r9 = str11;
                                    break;
                                case 9:
                                    JSONObject jSONObject4 = new JSONObject(C0364l0.C().F(r8));
                                    JSONArray jSONArrayOptJSONArray = jSONObject4.optJSONArray("data");
                                    ?? jSONObject5 = jSONObject4;
                                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                                        jSONObject5 = jSONObject4;
                                        jSONObject5 = jSONArrayOptJSONArray.getJSONObject(0);
                                    }
                                    jSONObject5 = jSONObject4;
                                    strA = jSONObject5.optString("n", jSONObject5.optString("file_name", ""));
                                    String strOptString2 = jSONObject5.optString("pid", jSONObject5.optString("cid", ""));
                                    String strOptString3 = jSONObject5.optString("fid", r8);
                                    boolean zEquals = r8.equals(strOptString2);
                                    r0 = strOptString3;
                                    r8 = zEquals;
                                    r7 = r9;
                                    str6 = strOptString2;
                                    str5 = strOptString3;
                                    str4 = strOptString2;
                                    if (!zEquals) {
                                        r9 = strA;
                                        r0 = str5;
                                        r5 = str4;
                                        r3 = r5;
                                    } else {
                                        String str12 = strA;
                                        r3 = r7;
                                        r9 = str12;
                                    }
                                    break;
                                case 10:
                                    JSONObject jSONObject6 = (JSONObject) C0377s0.u.a.get(r8);
                                    if (jSONObject6 != null) {
                                        strX = jSONObject6.toString();
                                    }
                                    JSONObject jSONObject7 = new JSONObject(strX);
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject7.optJSONObject("data");
                                    ?? jSONObject8 = jSONObjectOptJSONObject2 == null ? jSONObject7 : jSONObjectOptJSONObject2;
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject8.optJSONArray("InfoList");
                                    if (jSONArrayOptJSONArray2 == null) {
                                        jSONArrayOptJSONArray2 = jSONObject8.optJSONArray("list");
                                    }
                                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                                        jSONObject8 = jSONArrayOptJSONArray2.getJSONObject(0);
                                    }
                                    strA = f.a(jSONObject8.optString("FileName", jSONObject8.optString("filename", jSONObject8.optString("name", ""))));
                                    String strB = f.b(jSONObject8.optString("ParentFileId", ""), jSONObject8.optString("parentFileId", ""), jSONObject8.optString("ParentId", ""), jSONObject8.optString("parentId", ""));
                                    String strOptString4 = jSONObject8.optString("FileId", jSONObject8.optString("fileId", r8));
                                    boolean zEquals2 = r8.equals(strB);
                                    r0 = strOptString4;
                                    r8 = zEquals2;
                                    r7 = r9;
                                    str6 = strB;
                                    str5 = strOptString4;
                                    str4 = strB;
                                    if (!zEquals2) {
                                        r9 = strA;
                                        r0 = str5;
                                        r5 = str4;
                                        r3 = r5;
                                    } else {
                                        String str13 = strA;
                                        r3 = r7;
                                        r9 = str13;
                                    }
                                    break;
                                case 11:
                                    JSONObject jSONObject9 = (JSONObject) C0342a0.x.c.get(r8);
                                    if (jSONObject9 != null) {
                                        strX = jSONObject9.toString();
                                    }
                                    ?? jSONObject10 = new JSONObject(strX);
                                    strA = f.a(jSONObject10.optString("fileName", jSONObject10.optString("name", "")));
                                    String strB2 = f.b(jSONObject10.optString("parentId", ""), jSONObject10.optString("parentFileId", ""));
                                    String strOptString5 = jSONObject10.optString("fileId", jSONObject10.optString("id", r8));
                                    boolean zEquals3 = r8.equals(strB2);
                                    r0 = strOptString5;
                                    r8 = zEquals3;
                                    r7 = r9;
                                    str6 = strB2;
                                    str5 = strOptString5;
                                    str4 = strB2;
                                    if (!zEquals3) {
                                        r9 = strA;
                                        r0 = str5;
                                        r5 = str4;
                                        r3 = r5;
                                    } else {
                                        String str14 = strA;
                                        r3 = r7;
                                        r9 = str14;
                                    }
                                    break;
                                default:
                                    r0 = r8;
                                    r3 = "";
                                    break;
                            }
                        } catch (Exception unused2) {
                            str6 = "";
                            r2 = r3;
                            r1 = r8;
                            r4 = str6;
                            r0 = r1;
                            r9 = r2;
                            r5 = r4;
                        }
                    } catch (Exception unused3) {
                        r2 = r3;
                        r1 = r8;
                        r4 = str6;
                        r0 = r1;
                        r9 = r2;
                        r5 = r4;
                    }
                } catch (Exception unused4) {
                    r8 = r0;
                    r2 = r3;
                    r1 = r8;
                    r4 = str6;
                    r0 = r1;
                    r9 = r2;
                    r5 = r4;
                }
            } catch (Exception unused5) {
                r4 = r3;
                r1 = r8;
                r2 = r9;
                r0 = r1;
                r9 = r2;
                r5 = r4;
            }
        } catch (Exception unused6) {
            r4 = "";
            r1 = r8;
            r2 = r9;
        }
        return new String[]{r9, r3, r0};
    }

    public static String m(int i, String str, String str2, HashMap map) {
        String str3;
        String strF;
        String str4;
        ArrayList arrayList = new ArrayList();
        try {
            if (!r(str)) {
                InitOrigin.run(new com.github.catvod.spider.merge.p019w.a(str, 2));
                return v(u(str), str);
            }
            ArrayList arrayListD = d(str, str2);
            if (map == null || (str3 = (String) map.get("kind")) == null) {
                str3 = "";
            }
            o(str3, arrayListD);
            if (map == null || (strF = (String) map.get("sort")) == null) {
                strF = "";
            }
            if (TextUtils.isEmpty(strF)) {
                strF = f();
            }
            Collections.sort(arrayListD, new d(1, strF));
            if (arrayListD.isEmpty()) {
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        if (!TextUtils.isEmpty((String) it.next())) {
                            str4 = "没有匹配当前筛选条件的文件";
                            return z("state:cloud_empty", "暂无内容", str4);
                        }
                    }
                }
                str4 = "当前目录暂无内容";
                return z("state:cloud_empty", "暂无内容", str4);
            }
            int size = arrayListD.size();
            int iMax = Math.max(1, (size + 99) / 100);
            int iMax2 = Math.max(1, Math.min(i, iMax));
            Iterator it2 = f.e(arrayListD, iMax2).iterator();
            while (it2.hasNext()) {
                arrayList.add(E(str, (c) it2.next(), str2));
            }
            g gVar = new g();
            gVar.F(arrayList);
            gVar.o(iMax2, iMax, 100, size);
            return gVar.r();
        } catch (Exception e) {
            String message = e.getMessage();
            String strTrim = message != null ? message.trim() : "";
            String lowerCase = strTrim.toLowerCase(Locale.getDefault());
            String strU = u(str);
            if (TextUtils.isEmpty(strTrim)) {
                strTrim = com.github.catvod.spider.merge.D.b.i(strU, "加载失败，请稍后重试");
            } else if (strTrim.contains("未登录") || strTrim.contains("授权") || lowerCase.contains("cookie") || lowerCase.contains("login")) {
                strTrim = com.github.catvod.spider.merge.D.b.C(strU, "需要重新登录：", strTrim);
            } else if (strTrim.contains("权限") || lowerCase.contains("permission") || lowerCase.contains("forbidden")) {
                strTrim = com.github.catvod.spider.merge.D.b.C(strU, "无权访问该目录：", strTrim);
            } else if (lowerCase.contains("timeout") || lowerCase.contains("timed out") || lowerCase.contains("failed to connect") || lowerCase.contains("unable to resolve") || strTrim.contains("网络")) {
                strTrim = "网络连接失败：".concat(strTrim);
            }
            if (strTrim == null) {
                strTrim = "未知错误";
            }
            return z("error", "加载失败", strTrim);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    public static String n(String str, int i, HashMap map, SimpleDateFormat simpleDateFormat) {
        String strF;
        String string;
        String str2;
        String str3;
        int i2 = 0;
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        if (!file.exists()) {
            return z("state:local_missing", "路径不存在", str);
        }
        if (!file.isDirectory()) {
            return h(str);
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return z("state:local_denied", "无法读取目录", "请检查存储权限或路径是否可访问");
        }
        ArrayList arrayList2 = new ArrayList();
        int length = fileArrListFiles.length;
        int i3 = 0;
        while (true) {
            String str4 = "";
            if (i3 >= length) {
                break;
            }
            File file2 = fileArrListFiles[i3];
            if (!file2.getName().startsWith(".")) {
                if (map != null && (str3 = (String) map.get("kind")) != null) {
                    str4 = str3;
                }
                if (file2.isDirectory()) {
                    if (TextUtils.isEmpty(str4) || "folder".equals(str4)) {
                        arrayList2.add(file2);
                    }
                } else if (AbstractC0309x1.i(file2.getName()) && (TextUtils.isEmpty(str4) || "video".equals(str4))) {
                    arrayList2.add(file2);
                }
            }
            i3++;
        }
        if (map == null || (strF = (String) map.get("sort")) == null) {
            strF = "";
        }
        if (TextUtils.isEmpty(strF)) {
            strF = f();
        }
        Collections.sort(arrayList2, new d(i2, strF));
        if (arrayList2.isEmpty()) {
            if (map == null) {
                str2 = "当前目录没有可浏览的文件夹或视频";
            } else {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    if (!TextUtils.isEmpty((String) it.next())) {
                        str2 = "没有匹配当前筛选条件的文件";
                    }
                }
                str2 = "当前目录没有可浏览的文件夹或视频";
            }
            return z("state:local_empty", "暂无内容", str2);
        }
        int size = arrayList2.size();
        int iMax = Math.max(1, (size + 99) / 100);
        int iMax2 = Math.max(1, Math.min(i, iMax));
        for (File file3 : f.e(arrayList2, iMax2)) {
            k kVar = new k();
            kVar.n("local:" + file3.getAbsolutePath());
            kVar.o(file3.getName());
            if (file3.isFile()) {
                String absolutePath = file3.getAbsolutePath();
                LruCache lruCache = g.a;
                String url = ProxyOrigin.getUrl();
                if (TextUtils.isEmpty(url) || TextUtils.isEmpty(absolutePath)) {
                    string = "";
                } else {
                    StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(url, "?do=local&path=");
                    sbP.append(Base64.encodeToString(absolutePath.getBytes(), 10));
                    string = sbP.toString();
                }
            } else {
                string = "data:image/png;base64,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";
            }
            kVar.p(string);
            kVar.s(file3.isDirectory() ? "文件夹" : simpleDateFormat.format(Long.valueOf(file3.lastModified())));
            kVar.t(file3.isDirectory() ? "folder" : "file");
            arrayList.add(kVar);
        }
        g gVar = new g();
        gVar.F(arrayList);
        gVar.o(iMax2, iMax, 100, size);
        return gVar.r();
    }

    public static void o(String str, ArrayList arrayList) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (!("folder".equals(str) ? cVar.d : !"video".equals(str) ? "other".equals(str) && (cVar.d || AbstractC0309x1.i(cVar.b)) : !(!cVar.d && AbstractC0309x1.i(cVar.b)))) {
                arrayList.remove(size);
            }
        }
    }

    public static Map p(String str) {
        str.getClass();
        switch (str) {
            case "tianyi_family":
            case "tianyi":
                Q0.f().getClass();
                HashMap map = new HashMap();
                map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
                map.put("Referer", "https://cloud.189.cn/");
                return map;
            case "pan123":
                C0377s0.u.getClass();
                return C0377s0.m();
            case "yidong_family":
                t1.u().getClass();
                return t1.z();
            case "yidong":
                t1.u().getClass();
                return t1.z();
            case "uc":
                Z0.t().getClass();
                return Z0.x();
            case "xl":
                l1.I().getClass();
                HashMap map2 = new HashMap();
                map2.put("User-Agent", "ANDROID-com.xunlei.downloadprovider/8.56.0.1134 netWorkType/WIFI appid/40 deviceName/Xiaomi_Mi 9 deviceModel/MI 9 OSVersion/9 protocolVersion/301 platformVersion/10 sdkVersion/513006 Oauth2Client/0.9 (Linux 4_4_146) (JAVA 0)");
                return map2;
            case "115":
                return C0364l0.C().E();
            case "ali":
                C0349e.j().getClass();
                return C0349e.n();
            case "baidu":
                C0353g.a().getClass();
                return q.b(new com.github.catvod.spider.merge.F.a("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;"), new com.github.catvod.spider.merge.F.a("Referer", "https://pan.baidu.com"));
            case "quark":
                return A0.s().D();
            case "guangya":
                C0342a0.x.getClass();
                return C0342a0.w();
            default:
                return new HashMap();
        }
    }

    public static String[] q(ArrayList arrayList) {
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = ((String[]) arrayList.get(i))[0];
        }
        return strArr;
    }

    public static boolean r(String str) {
        str.getClass();
        switch (str) {
            case "tianyi_family":
            case "tianyi":
                return Q0.f().s();
            case "pan123":
                return C0377s0.u.u();
            case "yidong_family":
            case "yidong":
                t1.u().getClass();
                return t1.F();
            case "uc":
                Z0.t().getClass();
                return Z0.N();
            case "xl":
                return l1.I().Z();
            case "115":
                return C0364l0.O(C0364l0.C().a);
            case "ali":
                return C0349e.j().A();
            case "baidu":
                C0353g.a().getClass();
                return C0357i.i();
            case "quark":
                return A0.s().P();
            case "guangya":
                return C0342a0.x.G();
            default:
                return false;
        }
    }

    public static boolean s(JSONObject jSONObject) {
        if (!TextUtils.isEmpty(jSONObject.optString("error", ""))) {
            return true;
        }
        if (!jSONObject.has("state") || jSONObject.optBoolean("state", true)) {
            return (jSONObject.optInt("errno", 0) == 0 && jSONObject.optInt("errNo", 0) == 0) ? false : true;
        }
        return true;
    }

    public static ArrayList t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new String[]{"super_library", "云盘资源库", "1"});
        arrayList.add(new String[]{"local:" + Environment.getExternalStorageDirectory().getAbsolutePath(), "本地文件", "1"});
        File[] fileArrListFiles = new File("/storage").listFiles();
        if (fileArrListFiles != null) {
            List listAsList = Arrays.asList("emulated", "sdcard", "self");
            for (File file : fileArrListFiles) {
                if (!listAsList.contains(file.getName())) {
                    arrayList.add(new String[]{"local:" + file.getAbsolutePath(), file.getName(), "1"});
                }
            }
        }
        arrayList.add(new String[]{"quark", u("quark"), "1"});
        arrayList.add(new String[]{"uc", u("uc"), "1"});
        arrayList.add(new String[]{"baidu", u("baidu"), "1"});
        arrayList.add(new String[]{"tianyi", u("tianyi"), "1"});
        arrayList.add(new String[]{"yidong", u("yidong"), "1"});
        arrayList.add(new String[]{"ali", u("ali"), "1"});
        arrayList.add(new String[]{"xl", u("xl"), "1"});
        arrayList.add(new String[]{"115", u("115"), "1"});
        arrayList.add(new String[]{"pan123", u("pan123"), "1"});
        arrayList.add(new String[]{"guangya", u("guangya"), "1"});
        return arrayList;
    }

    public static String u(String str) {
        str.getClass();
        switch (str) {
            case "tianyi_family":
                return AbstractC0302v0.c1("tianyi") + "家庭云";
            case "tianyi":
                String strA1 = AbstractC0302v0.a1(str);
                return TextUtils.isEmpty(strA1) ? "" : AbstractC0302v0.Y0(strA1);
            case "yidong_family":
                return AbstractC0302v0.c1("yidong") + "家庭云";
            default:
                String strA2 = AbstractC0302v0.a1(str);
                String strY0 = TextUtils.isEmpty(strA2) ? "" : AbstractC0302v0.Y0(strA2);
                return strY0.isEmpty() ? "未知网盘" : strY0;
        }
    }

    public static String v(String str, String str2) {
        String strB = com.github.catvod.spider.merge.D.b.B("login:", str2);
        k kVarA = AbstractC0449a.a(strB);
        kVarA.o("未登录" + str);
        kVarA.p("data:image/png;base64,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");
        kVarA.s("点击登录，或前往配置中心管理账号");
        kVarA.g(strB);
        g gVar = new g();
        gVar.F(Collections.singletonList(kVarA));
        gVar.o(1, 1, 0, 1);
        return gVar.r();
    }

    public static ArrayList w(String[] strArr) {
        ArrayList arrayListF = U0.f("local_menu", strArr);
        if (!U0.a("super_library", U0.l("local_menu").optJSONArray("order"))) {
            arrayListF.remove("super_library");
            arrayListF.add(0, "super_library");
            U0.n("local_menu", strArr, arrayListF);
            boolean[] zArrC = U0.c("local_menu", strArr, new String[0]);
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    i = -1;
                    break;
                }
                if (strArr[i].equals("super_library")) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                zArrC[i] = true;
            }
            U0.m("local_menu", strArr, zArrC, new String[0]);
        }
        return arrayListF;
    }

    public static String x(String str) {
        str.getClass();
        switch (str) {
            case "tianyi_family":
                return "";
            case "pan123":
                return "0";
            case "tianyi":
                return "-11";
            case "yidong_family":
                t1.u().getClass();
                return t1.x();
            case "yidong":
                return "/";
            case "uc":
                return "0";
            case "xl":
                return "";
            case "115":
                return "0";
            case "ali":
                return "root";
            case "baidu":
                return "/";
            case "quark":
                return "0";
            case "guangya":
                return "";
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    public static void y(String str) {
        try {
            switch (str) {
                case "quark":
                    P1.p1();
                    break;
                case "uc":
                    P1.w1();
                    break;
                case "ali":
                    P1.P0();
                    break;
                case "baidu":
                    P1.Q0();
                    break;
                case "tianyi":
                case "tianyi_family":
                    P1.v1();
                    break;
                case "yidong":
                case "yidong_family":
                    P1.B1();
                    break;
                case "xl":
                    P1.z1();
                    break;
                case "115":
                    P1.g1();
                    break;
                case "pan123":
                    P1.i1();
                    break;
                case "guangya":
                    P1.b1();
                    break;
                default:
                    X0.a("未知网盘类型");
                    break;
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.x(e, new StringBuilder("打开登录弹窗失败: "));
        }
    }

    public static String z(String str, String str2, String str3) {
        k kVar = new k();
        kVar.n(str);
        kVar.o(str2);
        kVar.p("data:image/png;base64,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");
        kVar.s(str3);
        g gVar = new g();
        gVar.F(Collections.singletonList(kVar));
        gVar.o(1, 1, 0, 1);
        return gVar.r();
    }
}
