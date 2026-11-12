package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.p000a.C0359j;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0303v1 {
    public static final String[] a;
    public static final int b;

    static {
        String[] strArr = {"贴近近期最明确的兴趣，同时兼顾长期偏好", "从已有兴趣自然扩展到相邻题材、风格或主创", "寻找可能带来惊喜的新方向，但仍要真实可靠"};
        a = strArr;
        b = strArr.length * 8;
    }

    public static String a(String str, String str2, String str3, JSONArray jSONArray, int i) throws Exception {
        RequestBody requestBodyCreate = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), new JSONObject().put("model", str3).put("messages", jSONArray).toString());
        Request.Builder builder = new Request.Builder();
        String strTrim = str2 == null ? "" : str2.trim();
        while (strTrim.endsWith("/")) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
        }
        if (!strTrim.endsWith("/chat/completions")) {
            strTrim = (strTrim.endsWith("/v1") || strTrim.contains("api.deepseek.com")) ? strTrim.concat("/chat/completions") : strTrim.concat("/v1/chat/completions");
        }
        Request requestBuild = builder.url(strTrim).header("Authorization", "Bearer " + str).header("Accept", "application/json").post(requestBodyCreate).build();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.github.catvod.spider.merge.p000a.N nW = X1.w(requestBuild, i);
        int i2 = nW.a;
        if (i2 >= 200 && i2 < 300) {
            JSONArray jSONArrayOptJSONArray = new JSONObject(nW.a()).optJSONArray("choices");
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray == null ? null : jSONArrayOptJSONArray.optJSONObject(0);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("message") : null;
            return jSONObjectOptJSONObject2 == null ? "" : jSONObjectOptJSONObject2.optString("content");
        }
        String strA = nW.a();
        if (i2 == 500 && strA.isEmpty() && ((Map) nW.c).isEmpty()) {
            throw new Exception(System.currentTimeMillis() - jCurrentTimeMillis >= ((long) Math.max(1, i + (-2))) * 1000 ? com.github.catvod.spider.merge.D.b.h("AI请求超时（", i, "秒）") : "AI网络请求失败");
        }
        String strB = b(180, strA);
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(i2);
        sb.append(strB.isEmpty() ? "" : " · ".concat(strB));
        throw new Exception(sb.toString());
    }

    public static String b(int i, String str) {
        String strTrim = str == null ? "" : str.replace('\n', ' ').replace('\r', ' ').trim();
        return strTrim.length() <= i ? strTrim : strTrim.substring(0, i);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01ff A[PHI: r21
  0x01ff: PHI (r21v3 java.lang.String) = 
  (r21v2 java.lang.String)
  (r21v2 java.lang.String)
  (r21v2 java.lang.String)
  (r21v5 java.lang.String)
  (r21v5 java.lang.String)
  (r21v5 java.lang.String)
  (r21v5 java.lang.String)
 binds: [B:93:0x01c6, B:95:0x01ce, B:97:0x01d6, B:100:0x01e1, B:102:0x01e9, B:104:0x01f1, B:106:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    public static JSONObject c(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, boolean z) throws Exception {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        String str6;
        String strOptString;
        JSONObject jSONObject4 = jSONObject;
        String str7 = "items";
        JSONArray jSONArray = new JSONArray();
        StringBuilder sbQ = com.github.catvod.spider.merge.D.b.q("你是富有洞察力的个性化影视推荐专家。根据用户的搜索、播放和内容元数据，自主推荐8部真实存在、且未出现在历史或近期推荐中的影视作品。本批侧重：", str5, "。请充分发挥推理能力，自主发现显性兴趣、潜在偏好、跨题材关联和可能带来惊喜的新方向，不做候选池排序。近期与长期兴趣、搜索与播放差异、重复次数、观看集数、题材主题、地区语言、年代、主创、情绪质感、叙事节奏、口碑热度等都可作为线索，但不必机械覆盖，也不设固定比例或类型配额。每项必须提供准确的常见中文片名、原名、上映或首播年份、movie或tv类型，以及一句自然贴切的简短理由。禁止虚构作品。理由只描述作品本身最鲜明且真实的特点，例如叙事方式、人物关系、氛围、节奏、表演、影像风格或主题表达；不解释推荐依据，不提用户或历史。");
        sbQ.append(z ? "同时基于这些数据生成一份克制、友善的观影画像，包括画像标题、摘要、3至6个口味关键词、口味偏好和观影性格。观影性格只能描述选片与观看风格，不得推断心理疾病、政治宗教、健康、身份或其它敏感属性，也不要冒充专业人格测评。只返回纯JSON：{\"items\":[{\"title\":\"中文片名\",\"originalTitle\":\"原名\",\"year\":\"2024\",\"type\":\"movie\",\"reason\":\"作品本身的自然短评\"}],\"profile\":{\"title\":\"画像标题\",\"summary\":\"总体描述\",\"tasteTags\":[\"关键词\"],\"preferences\":\"口味偏好\",\"personality\":\"观影性格\"}}。" : "只返回纯JSON：{\"items\":[{\"title\":\"中文片名\",\"originalTitle\":\"原名\",\"year\":\"2024\",\"type\":\"movie\",\"reason\":\"作品本身的自然短评\"}]}。");
        String string = sbQ.toString();
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("role", "system");
        jSONObject5.put("content", string);
        jSONArray.put(jSONObject5);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("role", "user");
        jSONObject6.put("content", str4);
        jSONArray.put(jSONObject6);
        String strA = a(str, str2, str3, jSONArray, 120);
        String str8 = "";
        String strTrim = strA == null ? "" : strA.trim();
        if (strTrim.startsWith("```")) {
            int iIndexOf = strTrim.indexOf(10);
            int iLastIndexOf = strTrim.lastIndexOf("```");
            if (iIndexOf >= 0 && iLastIndexOf > iIndexOf) {
                strTrim = strTrim.substring(iIndexOf + 1, iLastIndexOf).trim();
            }
        }
        int iIndexOf2 = strTrim.indexOf(123);
        int iLastIndexOf2 = strTrim.lastIndexOf(125);
        if (iIndexOf2 >= 0 && iLastIndexOf2 > iIndexOf2) {
            strTrim = strTrim.substring(iIndexOf2, iLastIndexOf2 + 1);
        }
        if (strTrim.isEmpty()) {
            throw new Exception("模型返回为空");
        }
        try {
            JSONObject jSONObject7 = new JSONObject(strTrim);
            if (jSONObject7.optJSONArray("items") == null) {
                throw new Exception("模型返回缺少items");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject7.optJSONArray("items");
            JSONArray jSONArray2 = new JSONArray();
            HashSet hashSet = new HashSet();
            JSONArray jSONArrayOptJSONArray2 = jSONObject4.optJSONArray("plays");
            for (int i = 0; jSONArrayOptJSONArray2 != null && i < jSONArrayOptJSONArray2.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectOptJSONObject.optString("key");
                }
                String strC = AbstractC0251e.C(jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString("title"));
                if (!strC.isEmpty()) {
                    hashSet.add(strC);
                }
            }
            String[] strArr = {"searches", "recommended"};
            int i2 = 0;
            while (i2 < 2) {
                String str9 = strArr[i2];
                JSONArray jSONArrayOptJSONArray3 = jSONObject4.optJSONArray(str9);
                int i3 = 0;
                while (jSONArrayOptJSONArray3 != null && i3 < jSONArrayOptJSONArray3.length()) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray3.optJSONObject(i3);
                    String strOptString2 = jSONObjectOptJSONObject2 == null ? str8 : jSONObjectOptJSONObject2.optString("key");
                    if (jSONObjectOptJSONObject2 == null) {
                        str8 = str8;
                        strOptString = str8;
                    } else {
                        strOptString = jSONObjectOptJSONObject2.optString("searches".equals(str9) ? "text" : "title");
                    }
                    if ("plays".equals(str9) || strOptString2 == null || strOptString2.isEmpty()) {
                        strOptString2 = strOptString;
                    }
                    String strC2 = AbstractC0251e.C(strOptString2);
                    if (!strC2.isEmpty()) {
                        hashSet.add(strC2);
                    }
                    i3++;
                    str8 = str8;
                }
                i2++;
                str8 = str8;
                jSONObject4 = jSONObject;
            }
            String str10 = str8;
            HashSet hashSet2 = new HashSet();
            int i4 = 0;
            while (jSONArrayOptJSONArray != null && i4 < jSONArrayOptJSONArray.length() && jSONArray2.length() < 8) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i4);
                String strB = b(50, jSONObjectOptJSONObject3 == null ? str10 : jSONObjectOptJSONObject3.optString("title"));
                String strB2 = b(100, jSONObjectOptJSONObject3 == null ? str10 : jSONObjectOptJSONObject3.optString("originalTitle"));
                String strB3 = b(12, jSONObjectOptJSONObject3 == null ? str10 : jSONObjectOptJSONObject3.optString("year"));
                JSONArray jSONArray3 = jSONArrayOptJSONArray;
                String lowerCase = b(20, jSONObjectOptJSONObject3 == null ? str10 : jSONObjectOptJSONObject3.optString("type")).toLowerCase(Locale.ROOT);
                String str11 = "movie";
                if ("movie".equals(lowerCase) || "电影".equals(lowerCase) || "film".equals(lowerCase)) {
                    str6 = str11;
                } else {
                    str11 = "tv";
                    if ("tv".equals(lowerCase) || "剧集".equals(lowerCase) || "电视剧".equals(lowerCase) || "series".equals(lowerCase)) {
                        str6 = str11;
                    } else {
                        str6 = str10;
                    }
                }
                JSONObject jSONObject8 = jSONObject7;
                String strB4 = b(64, jSONObjectOptJSONObject3 == null ? str10 : jSONObjectOptJSONObject3.optString("reason"));
                String strC3 = AbstractC0251e.C(strB);
                String str12 = str7;
                String strC4 = AbstractC0251e.C(strB2);
                if (!strC3.isEmpty() && !str6.isEmpty() && !strB4.isEmpty() && !hashSet.contains(strC3) && ((strC4.isEmpty() || !hashSet.contains(strC4)) && !hashSet2.contains(strC3) && (strC4.isEmpty() || !hashSet2.contains(strC4)))) {
                    hashSet2.add(strC3);
                    if (!strC4.isEmpty()) {
                        hashSet2.add(strC4);
                    }
                    try {
                        jSONArray2.put(new JSONObject().put("title", strB).put("originalTitle", strB2).put("year", strB3).put("type", str6).put("reason", strB4));
                    } catch (Exception unused) {
                    }
                }
                i4++;
                jSONArrayOptJSONArray = jSONArray3;
                jSONObject7 = jSONObject8;
                str7 = str12;
            }
            String str13 = str7;
            JSONObject jSONObject9 = jSONObject7;
            if (jSONArray2.length() == 0) {
                throw new Exception("模型没有返回有效推荐");
            }
            JSONObject jSONObjectPut = new JSONObject().put(str13, jSONArray2);
            if (z) {
                JSONObject jSONObjectOptJSONObject4 = jSONObject9.optJSONObject("profile");
                if (jSONObjectOptJSONObject4 == null) {
                    jSONObject2 = new JSONObject();
                    jSONObject3 = jSONObjectPut;
                } else {
                    String strB5 = b(24, jSONObjectOptJSONObject4.optString("title"));
                    String strB6 = b(160, jSONObjectOptJSONObject4.optString("summary"));
                    String strB7 = b(160, jSONObjectOptJSONObject4.optString("preferences"));
                    String strB8 = b(160, jSONObjectOptJSONObject4.optString("personality"));
                    JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject4.optJSONArray("tasteTags");
                    JSONArray jSONArray4 = new JSONArray();
                    HashSet hashSet3 = new HashSet();
                    int i5 = 0;
                    while (true) {
                        if (jSONArrayOptJSONArray4 == null || i5 >= jSONArrayOptJSONArray4.length()) {
                            jSONObject3 = jSONObjectPut;
                            break;
                        }
                        jSONObject3 = jSONObjectPut;
                        if (jSONArray4.length() >= 6) {
                            break;
                        }
                        String strB9 = b(18, jSONArrayOptJSONArray4.optString(i5));
                        if (!strB9.isEmpty() && hashSet3.add(strB9)) {
                            jSONArray4.put(strB9);
                        }
                        i5++;
                        jSONObjectPut = jSONObject3;
                    }
                    if (strB5.isEmpty() || strB6.isEmpty() || strB7.isEmpty() || strB8.isEmpty() || jSONArray4.length() == 0) {
                        jSONObject2 = new JSONObject();
                    } else {
                        try {
                            jSONObject2 = new JSONObject().put("title", strB5).put("summary", strB6).put("tasteTags", jSONArray4).put("preferences", strB7).put("personality", strB8);
                        } catch (Exception unused2) {
                            jSONObject2 = new JSONObject();
                        }
                    }
                }
                jSONObjectPut = jSONObject3;
            } else {
                jSONObject2 = new JSONObject();
            }
            return jSONObjectPut.put("profile", jSONObject2);
        } catch (Exception e) {
            if (e.getMessage() == null || !e.getMessage().contains("缺少items")) {
                throw new Exception("模型返回格式错误", e);
            }
            throw e;
        }
    }

    public static JSONObject d(com.github.catvod.spider.merge.p010l.a aVar, final JSONObject jSONObject, final C0359j c0359j) throws Exception {
        String str;
        Throwable th;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        int i;
        String string;
        int i2;
        ExecutorService executorServiceNewFixedThreadPool;
        ArrayList arrayList;
        AtomicInteger atomicInteger;
        ArrayList arrayList2;
        int i3;
        JSONArray jSONArray2;
        String str5;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        JSONArray jSONArray5;
        if (!aVar.o) {
            throw new IllegalArgumentException("AI推荐未开启");
        }
        String str6 = "plays";
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("plays");
        String str7 = "searches";
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("searches");
        if ((jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) && (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0)) {
            throw new IllegalArgumentException("缺少推荐画像");
        }
        final String strB = b(4000, aVar.q);
        final String strB2 = b(1000, aVar.r);
        final String strB3 = b(200, aVar.s);
        if (strB.isEmpty() || strB2.isEmpty() || strB3.isEmpty()) {
            throw new IllegalArgumentException("模型配置不完整");
        }
        JSONObject jSONObject3 = new JSONObject();
        String str8 = "text";
        JSONObject jSONObject4 = new JSONObject();
        JSONArray jSONArray6 = new JSONArray();
        JSONArray jSONArray7 = new JSONArray();
        JSONArray jSONArray8 = new JSONArray();
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("plays");
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("searches");
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("recommended");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("media");
        int i4 = 0;
        JSONObject jSONObject5 = jSONObject4;
        while (true) {
            str = "title";
            th = null;
            JSONObject jSONObject6 = null;
            str2 = str7;
            str3 = str8;
            str4 = str6;
            jSONObject2 = jSONObject5;
            if (jSONArrayOptJSONArray3 == null) {
                jSONArray = jSONArray8;
                break;
            }
            jSONArray = jSONArray8;
            if (i4 >= Math.min(jSONArrayOptJSONArray3.length(), 20)) {
                break;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray3.optJSONObject(i4);
            if (jSONObjectOptJSONObject2 == null) {
                jSONArray4 = jSONArrayOptJSONArray5;
                jSONArray3 = jSONArrayOptJSONArray3;
                jSONArray5 = jSONArrayOptJSONArray4;
            } else {
                try {
                    JSONObject jSONObject7 = new JSONObject();
                    jSONArray3 = jSONArrayOptJSONArray3;
                    try {
                        jSONArray4 = jSONArrayOptJSONArray5;
                        try {
                            jSONObject7.put("title", b(40, jSONObjectOptJSONObject2.optString("title")));
                            jSONObject7.put("episode", Math.max(0, jSONObjectOptJSONObject2.optInt("episode", 0)));
                            jSONObject7.put("count", Math.min(20, jSONObjectOptJSONObject2.optInt("count", 1)));
                            jSONArray5 = jSONArrayOptJSONArray4;
                            try {
                                jSONObject7.put("recency", g(jCurrentTimeMillis - jSONObjectOptJSONObject2.optLong("lastAt", 0L)));
                                if (jSONObjectOptJSONObject != null) {
                                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(jSONObjectOptJSONObject2.optString("key"));
                                    if (jSONObjectOptJSONObject3 == null) {
                                        jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(AbstractC0251e.C(jSONObjectOptJSONObject2.optString("title")));
                                    }
                                    jSONObject6 = jSONObjectOptJSONObject3;
                                }
                                JSONObject jSONObject8 = jSONObject6;
                                String strOptString = jSONObjectOptJSONObject2.optString("year", jSONObject8 == null ? "" : jSONObject8.optString("year"));
                                String strB4 = jSONObject8 != null ? b(180, jSONObject8.optString("remarks") + " " + jSONObject8.optString("content")) : "";
                                if (!strOptString.isEmpty()) {
                                    jSONObject7.put("year", strOptString);
                                }
                                if (!strB4.isEmpty()) {
                                    jSONObject7.put("metadata", strB4);
                                }
                                jSONArray6.put(jSONObject7);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            jSONArray5 = jSONArrayOptJSONArray4;
                        }
                    } catch (Exception unused3) {
                        jSONArray4 = jSONArrayOptJSONArray5;
                    }
                } catch (Exception unused4) {
                    jSONArray4 = jSONArrayOptJSONArray5;
                    jSONArray3 = jSONArrayOptJSONArray3;
                }
            }
            i4++;
            jSONArrayOptJSONArray4 = jSONArray5;
            str7 = str2;
            str8 = str3;
            str6 = str4;
            jSONObject5 = jSONObject2;
            jSONArray8 = jSONArray;
            jSONArrayOptJSONArray3 = jSONArray3;
            jSONArrayOptJSONArray5 = jSONArray4;
        }
        JSONArray jSONArray9 = jSONArrayOptJSONArray5;
        JSONArray jSONArray10 = jSONArrayOptJSONArray4;
        int i5 = 0;
        while (jSONArray10 != null && i5 < Math.min(jSONArray10.length(), 15)) {
            JSONArray jSONArray11 = jSONArray10;
            JSONObject jSONObjectOptJSONObject4 = jSONArray11.optJSONObject(i5);
            if (jSONObjectOptJSONObject4 == null) {
                str5 = str3;
            } else {
                try {
                    JSONObject jSONObject9 = new JSONObject();
                    str5 = str3;
                    try {
                        jSONObject9.put(str5, b(40, jSONObjectOptJSONObject4.optString(str5)));
                        try {
                            jSONObject9.put("count", Math.min(20, jSONObjectOptJSONObject4.optInt("count", 1)));
                            i5 = i5;
                            try {
                                jSONObject9.put("recency", g(jCurrentTimeMillis - jSONObjectOptJSONObject4.optLong("lastAt", 0L)));
                                jSONArray7.put(jSONObject9);
                            } catch (Exception unused5) {
                            }
                        } catch (Exception unused6) {
                            i5 = i5;
                        }
                    } catch (Exception unused7) {
                    }
                } catch (Exception unused8) {
                    str5 = str3;
                }
            }
            jSONArray10 = jSONArray11;
            i5++;
            str3 = str5;
        }
        int i6 = 0;
        while (true) {
            i = b;
            if (jSONArray9 == null || i6 >= Math.min(jSONArray9.length(), i)) {
                break;
            }
            JSONArray jSONArray12 = jSONArray9;
            JSONObject jSONObjectOptJSONObject5 = jSONArray12.optJSONObject(i6);
            if (jSONObjectOptJSONObject5 == null || jSONObjectOptJSONObject5.optString("title").isEmpty()) {
                jSONArray2 = jSONArray;
            } else {
                jSONArray2 = jSONArray;
                jSONArray2.put(b(40, jSONObjectOptJSONObject5.optString("title")));
            }
            i6++;
            jSONArray9 = jSONArray12;
            jSONArray = jSONArray2;
        }
        JSONArray jSONArray13 = jSONArray;
        try {
            jSONObject2.put(str4, jSONArray6);
            jSONObject2.put(str2, jSONArray7);
            jSONObject2.put("recentlyRecommended", jSONArray13);
            while (true) {
                try {
                    try {
                        String[] strArr = a;
                        if (i3 >= i2) {
                            break;
                        }
                        final String str9 = strArr[i3];
                        final boolean z = i3 == 0;
                        final String str10 = string;
                        int i7 = i3;
                        final AtomicInteger atomicInteger2 = atomicInteger;
                        arrayList.add(executorServiceNewFixedThreadPool.submit(new Callable() { // from class: com.github.catvod.spider.merge.A.u1
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws Throwable {
                                String str11 = strB;
                                String str12 = strB2;
                                String str13 = strB3;
                                String str14 = str10;
                                String str15 = str9;
                                JSONObject jSONObject10 = jSONObject;
                                boolean z2 = z;
                                AtomicInteger atomicInteger3 = atomicInteger2;
                                C0359j c0359j2 = c0359j;
                                try {
                                    return AbstractC0303v1.c(str11, str12, str13, str14, str15, jSONObject10, z2);
                                } finally {
                                    int iIncrementAndGet = atomicInteger3.incrementAndGet();
                                    if (c0359j2 != null) {
                                        try {
                                            C0359j.e(iIncrementAndGet);
                                        } catch (Exception unused9) {
                                        }
                                    }
                                }
                            }
                        }));
                        i3 = i7 + 1;
                        str = str;
                        arrayList2 = arrayList2;
                        string = string;
                        atomicInteger = atomicInteger;
                        i2 = 3;
                    } catch (Throwable th2) {
                        executorServiceNewFixedThreadPool.shutdownNow();
                        throw th2;
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw e;
                }
            }
        } catch (Exception unused9) {
        }
        jSONObject3.put("preferences", jSONObject2);
        jSONObject3.put("language", aVar.g);
        string = jSONObject3.toString();
        i2 = 3;
        executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(3);
        arrayList = new ArrayList();
        atomicInteger = new AtomicInteger();
        arrayList2 = new ArrayList();
        JSONObject jSONObject10 = new JSONObject();
        i3 = 0;
        String str11 = str;
        ArrayList arrayList3 = arrayList2;
        Iterator it = arrayList.iterator();
        JSONObject jSONObjectOptJSONObject6 = jSONObject10;
        while (it.hasNext()) {
            try {
                JSONObject jSONObject11 = (JSONObject) ((Future) it.next()).get();
                arrayList3.add(jSONObject11.optJSONArray("items"));
                if (jSONObjectOptJSONObject6.length() == 0 && jSONObject11.optJSONObject("profile") != null) {
                    jSONObjectOptJSONObject6 = jSONObject11.optJSONObject("profile");
                }
            } catch (ExecutionException e2) {
                e = e2;
                Throwable cause = e.getCause();
                if (th == null) {
                    if (cause instanceof Exception) {
                        e = (Exception) cause;
                    }
                    th = e;
                }
            }
        }
        executorServiceNewFixedThreadPool.shutdownNow();
        JSONArray[] jSONArrayArr = (JSONArray[]) arrayList3.toArray(new JSONArray[0]);
        JSONArray jSONArray14 = new JSONArray();
        HashSet hashSet = new HashSet();
        for (JSONArray jSONArray15 : jSONArrayArr) {
            for (int i8 = 0; jSONArray15 != null && i8 < jSONArray15.length() && jSONArray14.length() < i; i8++) {
                JSONObject jSONObjectOptJSONObject7 = jSONArray15.optJSONObject(i8);
                String strC = AbstractC0251e.C(jSONObjectOptJSONObject7 == null ? "" : jSONObjectOptJSONObject7.optString(str11));
                String strC2 = AbstractC0251e.C(jSONObjectOptJSONObject7 == null ? "" : jSONObjectOptJSONObject7.optString("originalTitle"));
                if (!strC.isEmpty() && !hashSet.contains(strC) && (strC2.isEmpty() || !hashSet.contains(strC2))) {
                    hashSet.add(strC);
                    if (!strC2.isEmpty()) {
                        hashSet.add(strC2);
                    }
                    jSONArray14.put(jSONObjectOptJSONObject7);
                }
            }
        }
        if (jSONArray14.length() != 0) {
            return new JSONObject().put("items", jSONArray14).put("profile", jSONObjectOptJSONObject6);
        }
        if (th != null) {
            throw th;
        }
        throw new Exception("模型没有返回有效推荐");
    }

    public static ArrayList e(String str, String str2) throws Exception {
        String strTrim = str2.trim();
        while (strTrim.endsWith("/")) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
        }
        if (strTrim.endsWith("/models")) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 7, 0);
        }
        if (strTrim.endsWith("/chat/completions")) {
            strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 17, 0);
        }
        String[] strArr = {com.github.catvod.spider.merge.D.b.i(strTrim, "/models"), strTrim.endsWith("/v1") ? "" : strTrim.concat("/v1/models")};
        Exception exc = null;
        for (int i = 0; i < 2; i++) {
            String str3 = strArr[i];
            if (!str3.isEmpty()) {
                try {
                    HashMap map = new HashMap();
                    map.put("Accept", "application/json");
                    if (str != null && !str.trim().isEmpty()) {
                        map.put("Authorization", "Bearer " + str.trim());
                    }
                    com.github.catvod.spider.merge.p000a.N nZ = X1.z(str3, null, map);
                    int i2 = nZ.a;
                    if (i2 < 200 || i2 >= 300) {
                        throw new Exception("HTTP " + i2);
                    }
                    JSONArray jSONArrayOptJSONArray = new JSONObject(nZ.a()).optJSONArray("data");
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; jSONArrayOptJSONArray != null && i3 < jSONArrayOptJSONArray.length(); i3++) {
                        Object objOpt = jSONArrayOptJSONArray.opt(i3);
                        String strOptString = objOpt instanceof JSONObject ? ((JSONObject) objOpt).optString("id") : objOpt instanceof String ? (String) objOpt : "";
                        if (!strOptString.trim().isEmpty() && !arrayList.contains(strOptString.trim())) {
                            arrayList.add(strOptString.trim());
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
                        return arrayList;
                    }
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
        }
        if (exc == null) {
            return new ArrayList();
        }
        throw exc;
    }

    public static String f(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                sb.append(String.format(Locale.ROOT, "%02x", Integer.valueOf(b2 & 255)));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static String g(long j) {
        long jMax = Math.max(0L, j / 86400000);
        if (jMax <= 1) {
            return "recent";
        }
        if (jMax <= 7) {
            return "week";
        }
        return jMax <= 30 ? "month" : "older";
    }

    public static String h(String str, String str2, String str3) throws Exception {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("role", "user");
        jSONObject.put("content", "只回复：连接成功");
        String strB = b(80, a(str.trim(), str2.trim(), str3.trim(), jSONArray.put(jSONObject), 12));
        if (strB.isEmpty()) {
            throw new Exception("模型返回为空");
        }
        return strB;
    }
}
