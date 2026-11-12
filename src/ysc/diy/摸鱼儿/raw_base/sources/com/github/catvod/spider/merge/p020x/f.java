package com.github.catvod.spider.merge.p020x;

import android.text.TextUtils;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p000a.N;
import com.github.catvod.spider.merge.p000a.t1;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.utils.FishNative;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class f {
    public static final Pattern a = Pattern.compile("pan\\.quark\\.cn/s/([^/?#\\s]+)", 2);
    public static final Pattern b = Pattern.compile("(?:drive\\.uc\\.cn|yun\\.uc\\.cn|uc\\.cn)/s/([^/?#\\s]+)", 2);
    public static final Pattern c = Pattern.compile("(?:aliyundrive|alipan)\\.com/s/([^/?#\\s]+)", 2);
    public static final Pattern d = Pattern.compile("(?:115|115cdn|anxia)\\.com/s/([^/?#\\s]+)", 2);
    public static final Pattern e = Pattern.compile("(?:https?://)?((?:[\\w-]+\\.)?share\\.123pan\\.cn|(?:www\\.)?(?:123\\w{3}\\.com|123pan\\.(?:com|cn)))/(?:s|123pan)/([^/?#\\s]+)", 2);
    public static final Pattern f = Pattern.compile("(?:cloud\\.189\\.cn|h5\\.cloud\\.189\\.cn)/(?:t/|web/share\\?code=|share\\.html#/t/)([A-Za-z0-9]+)", 2);
    public static final Pattern g = Pattern.compile("(?:pan|yun)\\.baidu\\.com/(?:s/|share/init\\?surl=)([A-Za-z0-9_-]+)", 2);
    public static final Pattern h = Pattern.compile("pan\\.xunlei\\.com/s/([^/?#\\s]+)", 2);
    public static final Pattern i = Pattern.compile("(?:yun\\.139\\.com/shareweb/#/w/i/|caiyun\\.139\\.com/m/i\\?|caiyun\\.139\\.com/w/i/|caiyun\\.feixin\\.10086\\.cn/[^/]*/i/)([^&/?#\\s]+)", 2);
    public static final Pattern j = Pattern.compile("(?:[?&#])(?:pwd|password|passcode)=([^&#\\s]+)", 2);
    public static final String[] k = {"uWRwO7gPfdPB/0NfPtfQO+71", "F93x+qPluYy6jdgNpq+lwdH1ap6WOM+nfz8/V", "0HbpxvpXFsBK5CoTKam", "dQhzbhzFRcawnsZqRETT9AuPAJ+wTQso82mRv", "SAH98AmLZLRa6DB2u68sGhyiDh15guJpXhBzI", "unqfo7Z64Rie9RNHMOB", "7yxUdFADp3DOBvXdz0DPuKNVT35wqa5z0DEyEvf", "RBG", "ThTWPG5eC0UBqlbQ+04nZAptqGCdpv9o55A"};
    public static final Object l = new Object();
    public static final Object m = new Object();
    public static final HashMap n = new HashMap();
    public static final HashSet o = new HashSet();
    public static final HashMap p = new HashMap();

    public static int A(JSONObject jSONObject) {
        e eVarP;
        if (jSONObject == null || (eVarP = p(jSONObject.optString("url", ""))) == null) {
            return 2;
        }
        String str = eVarP.a;
        if ("ok".equals(str)) {
            return 0;
        }
        if ("locked".equals(str)) {
            return 1;
        }
        return "bad".equals(str) ? 3 : 2;
    }

    public static int B(ArrayList arrayList, b bVar) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        ArrayList arrayList2 = new ArrayList();
        synchronized (l) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    e eVar = (e) n.get(dVar.b);
                    if (eVar == null || eVar.d <= jCurrentTimeMillis) {
                        if (o.add(dVar.b)) {
                            arrayList2.add(dVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.min(Math.max(1, bVar.r), arrayList2.size()));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            executorServiceNewFixedThreadPool.submit(new RunnableC0242b((d) it2.next(), bVar, 10));
        }
        executorServiceNewFixedThreadPool.shutdown();
        return arrayList2.size();
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("ali".equals(str)) {
            return "aliyun";
        }
        return ("yidong".equals(str) || "xunlei".equals(str) || "quark".equals(str) || "baidu".equals(str) || "tianyi".equals(str) || "uc".equals(str) || "115".equals(str) || "123".equals(str)) ? str : "";
    }

    public static void D() {
        HashMap map = n;
        if (map.size() <= 1000) {
            return;
        }
        long j2 = Long.MAX_VALUE;
        String str = "";
        for (Map.Entry entry : map.entrySet()) {
            if (((e) entry.getValue()).c < j2) {
                j2 = ((e) entry.getValue()).c;
                str = (String) entry.getKey();
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
    }

    public static String E(long j2) {
        String strD = AbstractC0449a.d(j2, "ZUBzD9J_XPXfn7f71.10.0.2633com.xunlei.browser5505bd0cab8c9469b98e5891d9fb3e0d");
        for (String str : k) {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(b.i(strD, str).getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(String.format("%02x", Integer.valueOf(b2 & 255)));
            }
            strD = sb.toString();
        }
        return b.B("1.", strD);
    }

    public static void a(String str) {
        long j2;
        long jMax;
        if ("xunlei".equals(str) || "yidong".equals(str)) {
            j2 = 1000;
        } else {
            j2 = ("quark".equals(str) || "uc".equals(str) || "ali".equals(str)) ? 800L : 600L;
        }
        if (j2 <= 0) {
            return;
        }
        synchronized (m) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                HashMap map = p;
                long jLongValue = (map.containsKey(str) ? ((Long) map.get(str)).longValue() : 0L) + j2;
                jMax = Math.max(0L, jLongValue - jCurrentTimeMillis);
                if (jMax > 0) {
                    jCurrentTimeMillis = jLongValue;
                }
                map.put(str, Long.valueOf(jCurrentTimeMillis));
            } catch (Throwable th) {
                throw th;
            }
        }
        if (jMax <= 0) {
            return;
        }
        try {
            Thread.sleep(jMax);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public static e b(d dVar, b bVar) {
        String strU = u(dVar.b, d);
        if (TextUtils.isEmpty(strU)) {
            return w("unsupported", "无法识别115分享码");
        }
        StringBuilder sbQ = b.q("https://webapi.115.com/share/snap?share_code=", strU, "&receive_code=");
        sbQ.append(dVar.c);
        N nR = r(bVar.s, sbQ.toString(), null);
        int i2 = nR.a;
        if (i2 < 200 || i2 >= 300) {
            return w("uncertain", "115检测失败");
        }
        JSONObject jSONObject = new JSONObject(nR.a());
        if (jSONObject.optBoolean("state", false)) {
            return w("ok", "分享可访问");
        }
        String strOptString = jSONObject.optString("error", "");
        if (strOptString.contains("访问码")) {
            return w("locked", "需要访问码");
        }
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = "分享失效";
        }
        return w("bad", strOptString);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public static e c(d dVar, b bVar) {
        String strTrim;
        String str_pan123ShareGetApi;
        Matcher matcher = e.matcher(dVar.b);
        if (!matcher.find()) {
            return w("unsupported", "无法识别123分享码");
        }
        String strGroup = matcher.group(1);
        String str = "www.123684.com";
        if (!TextUtils.isEmpty(strGroup)) {
            String strTrim2 = strGroup.trim();
            String lowerCase = strTrim2.toLowerCase();
            if (!lowerCase.contains("123pan.") || lowerCase.contains("share.123pan.cn")) {
                str = strTrim2;
            }
        }
        String strGroup2 = matcher.group(2);
        if (strGroup2 == null) {
            strTrim = "";
        } else {
            strTrim = strGroup2.trim();
            if (strTrim.endsWith(".html")) {
                strTrim = b.g(strTrim, 5, 0);
            }
        }
        if (TextUtils.isEmpty(strTrim)) {
            return w("unsupported", "无法识别123分享码");
        }
        String strQ = q(dVar.c, y(dVar.b));
        if (FishCrypto.a) {
            try {
                str_pan123ShareGetApi = FishNative._pan123ShareGetApi(str, strTrim, strQ, "0", 1, -1);
                if (str_pan123ShareGetApi == null) {
                    str_pan123ShareGetApi = "";
                }
            } catch (Throwable unused) {
            }
        } else {
            str_pan123ShareGetApi = "";
        }
        if (TextUtils.isEmpty(str_pan123ShareGetApi)) {
            return w("uncertain", "123检测接口不可用");
        }
        HashMap mapT = b.t("User-Agent", "Mozilla/5.0", "Accept", "application/json, text/plain, */*");
        String str2 = "https://" + str + (str.toLowerCase().contains("share.123pan.cn") ? "/123pan/" : "/s/") + strTrim;
        if (!TextUtils.isEmpty(strQ)) {
            try {
                str2 = str2 + "?pwd=" + URLEncoder.encode(strQ, "UTF-8");
            } catch (Exception unused2) {
            }
        }
        mapT.put("Referer", str2);
        N nR = r(bVar.s, str_pan123ShareGetApi, mapT);
        int i2 = nR.a;
        if (i2 == 403) {
            return w("uncertain", "123请求受限");
        }
        if (i2 < 200 || i2 >= 300) {
            return w("uncertain", "123检测失败");
        }
        String strA = nR.a();
        JSONObject jSONObject = new JSONObject(nR.a());
        int iOptInt = jSONObject.optInt("code", jSONObject.optInt("Code", -1));
        String strQ2 = q(jSONObject.optString("message", ""), jSONObject.optString("Message", ""), jSONObject.optString("msg", ""));
        if (iOptInt == 0) {
            return w("ok", "分享可访问");
        }
        if (iOptInt == 5103 || iOptInt == 5104 || k(strQ2, "访问码", "提取码", "密码")) {
            return w("locked", "需要访问码");
        }
        if (l(strA)) {
            if (TextUtils.isEmpty(strQ2)) {
                strQ2 = "分享不存在";
            }
            return w("bad", strQ2);
        }
        if (TextUtils.isEmpty(strQ2)) {
            strQ2 = "123状态不明确";
        }
        return w("uncertain", strQ2);
    }

    public static e d(d dVar, b bVar) throws JSONException {
        String strU = u(dVar.b, c);
        if (TextUtils.isEmpty(strU)) {
            return w("unsupported", "无法识别阿里分享码");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("share_id", strU);
        N nX = x(bVar.s, "https://api.aliyundrive.com/adrive/v3/share_link/get_share_by_anonymous", jSONObject.toString(), null);
        JSONObject jSONObject2 = new JSONObject(nX.a());
        String strOptString = jSONObject2.optString("code", "");
        if (strOptString.contains("Exceed") || strOptString.contains("Frequency")) {
            return w("uncertain", "阿里请求受限");
        }
        if (strOptString.contains("ShareLink")) {
            return w("bad", TextUtils.isEmpty(jSONObject2.optString("message", "")) ? "分享失效" : jSONObject2.optString("message", ""));
        }
        int i2 = nX.a;
        if (i2 < 200 || i2 >= 300) {
            return w("uncertain", "阿里检测失败");
        }
        if (jSONObject2.optBoolean("has_pwd", false)) {
            return w("locked", "需要提取码");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("file_infos");
        return (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) ? w("bad", "文件列表为空") : w("ok", "分享可访问");
    }

    /* JADX WARN: Code duplicated, block: B:111:0x02a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:112:0x02a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    public static e e(d dVar, b bVar) {
        String str;
        String str2;
        b bVar2;
        String str3;
        ?? r4;
        String str4;
        String str5;
        e eVarW;
        ?? r5;
        int i2;
        ?? r6;
        e eVarW2;
        e eVarW3;
        String strU = u(dVar.b, g);
        if (TextUtils.isEmpty(strU)) {
            return w("unsupported", "无法识别百度分享码");
        }
        String str6 = dVar.b;
        String strQ = q(dVar.c, y(str6));
        if (TextUtils.isEmpty(strU)) {
            strU = "";
        } else {
            String lowerCase = str6 == null ? "" : str6.toLowerCase();
            if (!lowerCase.contains("share/init") && !lowerCase.contains("surl=") && lowerCase.contains("/s/") && strU.startsWith("1") && strU.length() > 1) {
                strU = strU.substring(1);
            }
        }
        String str7 = "locked";
        String str8 = "bad";
        String str9 = "百度分享失效";
        if (TextUtils.isEmpty(strQ)) {
            str = "百度状态码 ";
            str8 = str8;
            str2 = "";
        } else {
            str = "百度状态码 ";
            N nW = X1.w(new Request.Builder().url("https://pan.baidu.com/share/verify?surl=" + n(strU) + "&pwd=" + n(strQ)).post(new FormBody.Builder().add("pwd", strQ).add("vcode", "").add("vcode_str", "").build()).addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/140.0.0.0 Safari/537.36").addHeader("Referer", str6).addHeader("Content-Type", "application/x-www-form-urlencoded").build(), bVar.s);
            int i3 = nW.a;
            if (i3 < 200 || i3 >= 300) {
                str8 = str8;
                str = str;
                eVarW2 = w("uncertain", "百度提取码验证失败");
                str7 = str7;
            } else {
                JSONObject jSONObject = new JSONObject(nW.a());
                int iOptInt = jSONObject.optInt("errno", Integer.MIN_VALUE);
                if (iOptInt == 0) {
                    String strOptString = jSONObject.optString("randsk", "");
                    eVarW3 = TextUtils.isEmpty(strOptString) ? w("uncertain", "百度提取码响应缺少令牌") : w("ok", strOptString);
                } else if (iOptInt == -9 || iOptInt == -12) {
                    str8 = str8;
                    str = str;
                    str9 = str9;
                    eVarW2 = w(str7, "百度提取码错误或缺失");
                } else if (iOptInt == -62) {
                    eVarW3 = w("uncertain", "百度请求受限");
                } else if (iOptInt == -8 || l(nW.a())) {
                    eVarW2 = w(str8, str9);
                    str9 = str9;
                } else {
                    String strOptString2 = jSONObject.optString("errmsg", jSONObject.optString("err_msg", ""));
                    if (TextUtils.isEmpty(strOptString2)) {
                        str = str;
                        strOptString2 = b.e(iOptInt, str);
                    } else {
                        str = str;
                    }
                    eVarW2 = w("uncertain", strOptString2);
                    str8 = str8;
                }
                eVarW2 = eVarW3;
                str8 = str8;
                str = str;
            }
            if (!"ok".equals(eVarW2.a)) {
                return eVarW2;
            }
            str2 = eVarW2.b;
        }
        boolean z = !TextUtils.isEmpty(strQ);
        String str10 = str8;
        try {
            String str11 = "https://pan.baidu.com/share/list?web=5&app_id=250528&desc=1&showempty=0&page=1&num=20&order=time&shorturl=" + n(strU) + "&root=1&view_mode=1&channel=chunlei&clienttype=0";
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/140.0.0.0 Safari/537.36");
            str3 = "User-Agent";
            try {
                map.put("Accept", "application/json, text/plain, */*");
                map.put("Referer", str6);
                if (!TextUtils.isEmpty(str2)) {
                    map.put("Cookie", "BDCLND=" + str2);
                }
                bVar2 = bVar;
                try {
                    N nR = r(bVar2.s, str11, map);
                    JSONObject jSONObject2 = new JSONObject(nR.a());
                    r4 = -2147483648;
                    int iOptInt2 = jSONObject2.optInt("errno", Integer.MIN_VALUE);
                    try {
                        if (iOptInt2 != 0) {
                            r4 = "分享可访问";
                            if (iOptInt2 == -12 || iOptInt2 == -9) {
                                str5 = str10;
                                str4 = str7;
                                try {
                                    eVarW = w(str4, z ? "提取码错误" : "需要提取码");
                                    r5 = r4;
                                } catch (Exception unused) {
                                    eVarW = null;
                                    r5 = r4;
                                }
                            } else if (iOptInt2 == -62) {
                                eVarW = w("uncertain", "百度请求受限");
                                r6 = r4;
                            } else if (iOptInt2 == -8 || l(nR.a())) {
                                str5 = str10;
                                try {
                                    eVarW = w(str5, str9);
                                    str4 = str7;
                                    r5 = r4;
                                } catch (Exception unused2) {
                                    str4 = str7;
                                    eVarW = null;
                                    r5 = r4;
                                }
                            } else {
                                if (iOptInt2 != Integer.MIN_VALUE) {
                                    String strOptString3 = jSONObject2.optString("errmsg", jSONObject2.optString("err_msg", ""));
                                    if (TextUtils.isEmpty(strOptString3)) {
                                        strOptString3 = str + iOptInt2;
                                    }
                                    eVarW = w("uncertain", strOptString3);
                                    r6 = r4;
                                }
                                str4 = str7;
                                str5 = str10;
                                eVarW = null;
                                r5 = r4;
                            }
                            if (eVarW != null) {
                                return eVarW;
                            }
                            N nR2 = r(bVar2.s, str6, b.s(str3, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/91.0 Safari/537.36"));
                            i2 = nR2.a;
                            if (i2 >= 200 || i2 >= 300) {
                                return w("uncertain", "百度检测失败");
                            }
                            String strA = nR2.a();
                            if (k(strA, "分享的文件已经被取消", "分享已过期", "你访问的页面不存在", "你所访问的页面")) {
                                return w(str5, "分享失效");
                            }
                            if (k(strA, "请输入提取码", "提取码", "share/init")) {
                                return w(str4, "需要提取码");
                            }
                            return k(strA, "提取文件", "过期时间", "文件列表") ? w("ok", r5) : w("uncertain", "百度状态不明确");
                        }
                        String str12 = "分享可访问";
                        eVarW = w("ok", str12);
                        r6 = str12;
                        str4 = str7;
                        str5 = str10;
                        r5 = r6;
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                    r4 = "分享可访问";
                }
            } catch (Exception unused5) {
                bVar2 = bVar;
            }
        } catch (Exception unused6) {
            bVar2 = bVar;
            str3 = "User-Agent";
        }
        if (eVarW != null) {
            return eVarW;
        }
        N nR3 = r(bVar2.s, str6, b.s(str3, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/91.0 Safari/537.36"));
        i2 = nR3.a;
        if (i2 >= 200) {
        }
        return w("uncertain", "百度检测失败");
    }

    public static e f(d dVar, b bVar) throws JSONException {
        String strU = u(dVar.b, a);
        if (TextUtils.isEmpty(strU)) {
            return w("unsupported", "无法识别夸克分享码");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pwd_id", strU);
        jSONObject.put("passcode", dVar.c);
        N nX = x(bVar.s, "https://drive.quark.cn/1/clouddrive/share/sharepage/token", jSONObject.toString(), null);
        JSONObject jSONObject2 = new JSONObject(nX.a());
        String strOptString = jSONObject2.optString("message", "");
        if (strOptString.contains("需要提取码")) {
            return w("locked", "需要提取码");
        }
        if (!"ok".equalsIgnoreCase(strOptString)) {
            if (!l(strOptString)) {
                return w("uncertain", "夸克状态不明确");
            }
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = "分享不存在";
            }
            return w("bad", strOptString);
        }
        int i2 = nX.a;
        if (i2 < 200 || i2 >= 300) {
            return w("uncertain", "夸克检测失败");
        }
        String strOptString2 = jSONObject2.optJSONObject("data") != null ? jSONObject2.optJSONObject("data").optString("stoken", "") : "";
        if (TextUtils.isEmpty(strOptString2)) {
            return w("uncertain", "未获取到分享令牌");
        }
        StringBuilder sbQ = b.q("https://drive-h.quark.cn/1/clouddrive/share/sharepage/detail?pwd_id=", strU, "&stoken=");
        sbQ.append(URLEncoder.encode(strOptString2, "UTF-8"));
        sbQ.append("&_fetch_share=1");
        N nR = r(bVar.s, sbQ.toString(), null);
        if (nR.a == 400) {
            return w("ok", "分享可访问");
        }
        JSONObject jSONObjectOptJSONObject = new JSONObject(nR.a()).optJSONObject("data");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("share") : null;
        return (jSONObjectOptJSONObject2 == null || jSONObjectOptJSONObject2.optInt("status", 0) != 1) ? w("bad", "分享失效") : w("ok", "分享可访问");
    }

    public static e g(d dVar, b bVar) {
        String strU = u(dVar.b, f);
        if (TextUtils.isEmpty(strU)) {
            return w("unsupported", "无法识别天翼分享码");
        }
        N nW = X1.w(new Request.Builder().url("https://api.cloud.189.cn/open/share/getShareInfoByCodeV2.action").post(new FormBody.Builder().add("shareCode", strU).build()).build(), bVar.s);
        String strA = nW.a();
        if (k(strA, "ShareInfoNotFound", "ShareNotFound", "FileNotFound", "ShareExpiredError", "ShareAuditNotPass")) {
            return w("bad", "分享失效");
        }
        int i2 = nW.a;
        if (i2 < 200 || i2 >= 300) {
            return w("uncertain", "天翼检测失败");
        }
        return strA.contains("needAccessCode") ? w("locked", "需要访问码") : w("ok", "分享可访问");
    }

    public static e h(d dVar, b bVar) {
        String strU = u(dVar.b, b);
        if (TextUtils.isEmpty(strU)) {
            return w("unsupported", "无法识别UC分享码");
        }
        String strB = b.B("https://drive.uc.cn/s/", strU);
        N nR = r(bVar.s, strB, b.t("User-Agent", "Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 Chrome/87.0 Mobile Safari/537.36", "Referer", strB));
        if (nR.a != 200) {
            return w("uncertain", "UC检测受限");
        }
        String strA = nR.a();
        if (k(strA, "失效", "不存在", "违规", "删除", "已过期", "被取消")) {
            return w("bad", "分享失效");
        }
        if (strA.contains("input-wrap") || strA.contains("访问码")) {
            return w("locked", "需要访问码");
        }
        return (strA.contains("文件") || strA.contains("分享") || strA.contains("file-list")) ? w("ok", "分享可访问") : w("uncertain", "UC状态不明确");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00fb A[PHI: r16
  0x00fb: PHI (r16v2 java.lang.String) = (r16v1 java.lang.String), (r16v4 java.lang.String), (r16v4 java.lang.String), (r16v4 java.lang.String) binds: [B:19:0x0102, B:10:0x00df, B:15:0x00f9, B:13:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x022d, code lost:
    
        r0 = w("uncertain", "迅雷检测受限");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e i(d dVar, b bVar) {
        String str;
        String strOptString;
        e eVarW;
        String strU = u(dVar.b, h);
        if (TextUtils.isEmpty(strU)) {
            return w("unsupported", "无法识别迅雷分享码");
        }
        String str2 = "https://api-pan.xunlei.com/drive/v1/share?share_id=" + n(strU) + "&pass_code=" + n(q(dVar.c, y(dVar.b))) + "&limit=1&pass_code_token=&page_token=&thumbnail_size=SIZE_SMALL";
        int i2 = bVar.s;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            str = str2;
            try {
                jSONObject.put("timestamp", String.valueOf(jCurrentTimeMillis));
                jSONObject.put("captcha_sign", E(jCurrentTimeMillis));
                jSONObject.put("client_version", "1.10.0.2633");
                jSONObject.put("package_name", "com.xunlei.browser");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("action", "get:/drive/v1/share");
                jSONObject2.put("captcha_token", "");
                jSONObject2.put("client_id", "ZUBzD9J_XPXfn7f7");
                jSONObject2.put("device_id", "5505bd0cab8c9469b98e5891d9fb3e0d");
                jSONObject2.put("meta", jSONObject);
                jSONObject2.put("redirect_uri", "xlaccsdk01://xunlei.com/callback?state=harbor");
                HashMap map = new HashMap();
                map.put("Accept", "application/json;charset=UTF-8");
                map.put("Content-Type", "application/json");
                map.put("User-Agent", "ANDROID-com.xunlei.browser/1.10.0.2633 networkType/WIFI appid/22062");
                map.put("x-device-id", "5505bd0cab8c9469b98e5891d9fb3e0d");
                map.put("x-client-id", "ZUBzD9J_XPXfn7f7");
                map.put("x-client-version", "1.10.0.2633");
                N nX = x(i2, "https://xluser-ssl.xunlei.com/v1/shield/captcha/init", jSONObject2.toString(), map);
                int i3 = nX.a;
                if (i3 < 200 || i3 >= 300) {
                    strOptString = "";
                } else {
                    JSONObject jSONObject3 = new JSONObject(nX.a());
                    if (TextUtils.isEmpty(jSONObject3.optString("url", ""))) {
                        strOptString = jSONObject3.optString("captcha_token", "");
                    } else {
                        strOptString = "";
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = str2;
        }
        HashMap mapT = b.t("Accept", "*/*", "Content-Type", "application/json");
        mapT.put("Origin", "https://pan.xunlei.com");
        mapT.put("Referer", "https://pan.xunlei.com/");
        mapT.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/140.0.0.0 Safari/537.36");
        mapT.put("X-Client-Id", "ZUBzD9J_XPXfn7f7");
        mapT.put("X-Device-Id", "5505bd0cab8c9469b98e5891d9fb3e0d");
        if (!TextUtils.isEmpty(strOptString)) {
            mapT.put("X-Captcha-Token", strOptString);
        }
        N nR = r(bVar.s, str, mapT);
        String str3 = "迅雷分享失效";
        int i4 = nR.a;
        if (i4 < 200 || i4 >= 300) {
            try {
                JSONObject jSONObject4 = new JSONObject(nR.a());
                if (jSONObject4.optInt("error_code", -1) == 9) {
                    eVarW = w("uncertain", "迅雷请求受限");
                } else {
                    String strQ = q(jSONObject4.optString("error", ""), jSONObject4.optString("error_description", ""), jSONObject4.optString("message", ""));
                    if (k(strQ, "提取码", "pass_code")) {
                        eVarW = w("locked", "需要提取码");
                    } else if (l(strQ)) {
                        if (!TextUtils.isEmpty(strQ)) {
                            str3 = strQ;
                        }
                        eVarW = w("bad", str3);
                    } else {
                        eVarW = w("uncertain", "迅雷检测受限");
                    }
                }
            } catch (Exception unused3) {
                eVarW = w("uncertain", "迅雷检测受限");
            }
            return eVarW;
        }
        JSONObject jSONObject5 = new JSONObject(nR.a());
        String strOptString2 = jSONObject5.optString("share_status", "");
        if ("OK".equalsIgnoreCase(strOptString2)) {
            return w("ok", "分享可访问");
        }
        String strQ2 = q(jSONObject5.optString("share_status_text", ""), jSONObject5.optString("error_description", ""), jSONObject5.optString("error", ""));
        if (k(strQ2, "提取码", "pass_code")) {
            return w("locked", "需要提取码");
        }
        if (!TextUtils.isEmpty(strOptString2)) {
            if (l(strOptString2 + " " + strQ2)) {
                return w("bad", TextUtils.isEmpty(strQ2) ? "迅雷分享失效" : strQ2);
            }
        }
        return w("uncertain", "迅雷状态不明确");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:9:0x0029, B:11:0x0035, B:14:0x0040, B:16:0x0048, B:18:0x004e, B:32:0x0082, B:21:0x0059, B:23:0x0061, B:25:0x0067, B:28:0x0072, B:30:0x007a, B:34:0x008b), top: B:38:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0072 A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:9:0x0029, B:11:0x0035, B:14:0x0040, B:16:0x0048, B:18:0x004e, B:32:0x0082, B:21:0x0059, B:23:0x0061, B:25:0x0067, B:28:0x0072, B:30:0x007a, B:34:0x008b), top: B:38:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x007a A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:9:0x0029, B:11:0x0035, B:14:0x0040, B:16:0x0048, B:18:0x004e, B:32:0x0082, B:21:0x0059, B:23:0x0061, B:25:0x0067, B:28:0x0072, B:30:0x007a, B:34:0x008b), top: B:38:0x0029 }] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (s(r3, "coLength") == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e j(d dVar) {
        JsonElement jsonElement;
        String strL = t1.u().l(dVar.b);
        if (TextUtils.isEmpty(strL)) {
            strL = u(dVar.b, i);
        }
        if (TextUtils.isEmpty(strL)) {
            return w("unsupported", "无法识别移动云盘分享ID");
        }
        try {
            JsonObject jsonObjectP = t1.u().p("root", strL);
            if (jsonObjectP != null) {
                if (!jsonObjectP.entrySet().isEmpty()) {
                    JsonElement jsonElement2 = jsonObjectP.get("caLst");
                    if (jsonElement2 == null) {
                        jsonElement = jsonObjectP.get("coLst");
                        if (jsonElement == null) {
                            if (!s(jsonObjectP, "caLength")) {
                            }
                        } else if (jsonElement.isJsonArray() || jsonElement.getAsJsonArray().size() <= 0) {
                            if (!s(jsonObjectP, "caLength")) {
                            }
                        }
                    } else if (!jsonElement2.isJsonArray() || jsonElement2.getAsJsonArray().size() <= 0) {
                        jsonElement = jsonObjectP.get("coLst");
                        if (jsonElement == null || !jsonElement.isJsonArray()) {
                            if (!s(jsonObjectP, "caLength")) {
                            }
                        } else if (!s(jsonObjectP, "caLength")) {
                        }
                    }
                    return w("ok", "分享可访问");
                }
            }
            return w("uncertain", "移动云盘状态不明确");
        } catch (Exception unused) {
            return w("uncertain", "移动云盘检测失败");
        }
    }

    public static boolean k(String str, String... strArr) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean l(String str) {
        return k(str == null ? "" : str.toLowerCase(), "失效", "不存在", "违规", "删除", "已过期", "被取消", "已取消", "取消了分享", "not found", "notfound", "expired", "deleted", "cancel", "cancelled", "canceled", "violation", "sensitive", "audit not pass", "not pass");
    }

    public static void m(k kVar, JSONObject jSONObject, b bVar) {
        String strM;
        if (bVar.p != 0) {
            e eVarP = p(jSONObject.optString("url", ""));
            if (eVarP == null) {
                strM = b.m(new StringBuilder(), N1.u, "link_unknown.jpg");
            } else if ("ok".equals(eVarP.a)) {
                strM = b.m(new StringBuilder(), N1.u, "link_ok.jpg");
            } else if ("locked".equals(eVarP.a)) {
                strM = b.m(new StringBuilder(), N1.u, "link_locked.jpg");
            } else {
                strM = "bad".equals(eVarP.a) ? b.m(new StringBuilder(), N1.u, "link_bad.jpg") : b.m(new StringBuilder(), N1.u, "link_unknown.jpg");
            }
            kVar.p(strM);
        }
    }

    public static String n(String str) {
        if (str == null) {
            str = "";
        }
        return URLEncoder.encode(str, "UTF-8");
    }

    public static int o(LinkedHashMap linkedHashMap, b bVar, int i2) {
        List list;
        if (bVar.p == 0 || i2 <= 0) {
            return 0;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashMap map = new HashMap();
        while (linkedHashMap2.size() < i2) {
            boolean z = false;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (linkedHashMap2.size() >= i2) {
                    break;
                }
                if (!TextUtils.isEmpty(C((String) entry.getKey())) && (list = (List) entry.getValue()) != null && !list.isEmpty()) {
                    int iIntValue = map.containsKey(entry.getKey()) ? ((Integer) map.get(entry.getKey())).intValue() : 0;
                    while (iIntValue < list.size()) {
                        int i3 = iIntValue + 1;
                        JSONObject jSONObject = (JSONObject) list.get(iIntValue);
                        map.put((String) entry.getKey(), Integer.valueOf(i3));
                        if (jSONObject != null) {
                            String strOptString = jSONObject.optString("url", "");
                            String strTrim = strOptString == null ? "" : strOptString.replace("&amp;", "&").trim();
                            if (!TextUtils.isEmpty(strTrim) && !linkedHashMap2.containsKey(strTrim) && v(strTrim)) {
                                linkedHashMap2.put(strTrim, new d((String) entry.getKey(), strTrim, jSONObject.optString("password", "")));
                                z = true;
                                break;
                            }
                        }
                        iIntValue = i3;
                        z = true;
                    }
                }
            }
            if (!z) {
                break;
            }
        }
        return B(new ArrayList(linkedHashMap2.values()), bVar);
    }

    public static e p(String str) {
        String strTrim = str == null ? "" : str.replace("&amp;", "&").trim();
        if (TextUtils.isEmpty(strTrim)) {
            return null;
        }
        boolean zR0 = AbstractC0302v0.r0(strTrim);
        synchronized (l) {
            try {
                HashMap map = n;
                e eVar = (e) map.get(strTrim);
                if (!zR0) {
                    if (eVar != null && eVar.d > System.currentTimeMillis()) {
                        return eVar;
                    }
                    return null;
                }
                if (eVar == null || !"ok".equals(eVar.a) || eVar.d != Long.MAX_VALUE) {
                    e eVar2 = new e("ok", "磁力链接", System.currentTimeMillis(), Long.MAX_VALUE);
                    map.put(strTrim, eVar2);
                    D();
                    eVar = eVar2;
                }
                return eVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String q(String... strArr) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public static N r(int i2, String str, HashMap map) {
        Request.Builder builder = new Request.Builder().url(str).get();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                builder.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return X1.w(builder.build(), i2);
    }

    public static boolean s(JsonObject jsonObject, String str) {
        try {
            JsonElement jsonElement = jsonObject.get(str);
            if (jsonElement != null && !jsonElement.isJsonNull()) {
                if (jsonElement.getAsJsonPrimitive().isNumber()) {
                    return jsonElement.getAsInt() > 0;
                }
                return jsonElement.getAsJsonPrimitive().isString() && Integer.parseInt(jsonElement.getAsString().trim()) > 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    public static e t(d dVar, b bVar) {
        try {
            a(dVar.a);
            switch (dVar.a) {
                case "quark":
                    return f(dVar, bVar);
                case "uc":
                    return h(dVar, bVar);
                case "ali":
                    return d(dVar, bVar);
                case "115":
                    return b(dVar, bVar);
                case "123":
                    return c(dVar, bVar);
                case "tianyi":
                    return g(dVar, bVar);
                case "baidu":
                    return e(dVar, bVar);
                case "xunlei":
                    return i(dVar, bVar);
                case "yidong":
                    return j(dVar);
                default:
                    return w("unsupported", "本地检测暂不支持");
            }
        } catch (Exception unused) {
            return w("uncertain", "本地检测异常");
        }
    }

    public static String u(String str, Pattern pattern) {
        if (pattern != null && !TextUtils.isEmpty(str)) {
            Matcher matcher = pattern.matcher(str);
            if (!matcher.find()) {
                return "";
            }
            for (int i2 = 1; i2 <= matcher.groupCount(); i2++) {
                String strGroup = matcher.group(i2);
                if (!TextUtils.isEmpty(strGroup)) {
                    return strGroup;
                }
            }
        }
        return "";
    }

    public static boolean v(String str) {
        boolean z;
        synchronized (l) {
            try {
                e eVar = (e) n.get(str);
                z = eVar == null || eVar.d <= System.currentTimeMillis();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    public static e w(String str, String str2) {
        String str3;
        long j2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!"ok".equals(str) && !"bad".equals(str) && !"locked".equals(str) && !"unsupported".equals(str)) {
            str3 = "uncertain".equals(str) ? str : "uncertain";
        }
        if ("ok".equals(str3)) {
            j2 = 43200000;
        } else {
            j2 = "bad".equals(str3) ? 3600000L : 1800000L;
        }
        return new e(str3, str2, jCurrentTimeMillis, j2 + jCurrentTimeMillis);
    }

    public static N x(int i2, String str, String str2, HashMap map) {
        Request.Builder builderPost = new Request.Builder().url(str).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str2));
        if (map == null || map.isEmpty()) {
            builderPost.addHeader("Content-Type", "application/json; charset=utf-8");
        } else {
            for (Map.Entry entry : map.entrySet()) {
                builderPost.addHeader((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return X1.w(builderPost.build(), i2);
    }

    public static String y(String str) {
        if (str == null) {
            str = "";
        }
        Matcher matcher = j.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        try {
            return URLDecoder.decode(matcher.group(1), "UTF-8");
        } catch (Exception unused) {
            return matcher.group(1);
        }
    }

    public static void z(String str, e eVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (l) {
            n.put(str, eVar);
            D();
        }
    }
}
