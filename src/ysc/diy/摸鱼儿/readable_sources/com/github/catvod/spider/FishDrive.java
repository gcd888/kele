package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.FishDrive;
import com.github.catvod.spider.merge.A.AbstractC0280n1;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.C0003;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.InterfaceC0245c;
import com.github.catvod.spider.merge.A.N1;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0006;
import com.github.catvod.spider.merge.D.C0008;
import com.github.catvod.spider.merge.D.C0009;
import com.github.catvod.spider.merge.D.C0010;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.F.C0019;
import com.github.catvod.spider.merge.G.C0021;
import com.github.catvod.spider.merge.I.C0026;
import com.github.catvod.spider.merge.I.C0027;
import com.github.catvod.spider.merge.K.C0028;
import com.github.catvod.spider.merge.L.C0030;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.S.C0045;
import com.github.catvod.spider.merge.T.C0046;
import com.github.catvod.spider.merge.T.C0047;
import com.github.catvod.spider.merge.V.C0049;
import com.github.catvod.spider.merge.V.C0050;
import com.github.catvod.spider.merge.X.C0053;
import com.github.catvod.spider.merge.Z.C0055;
import com.github.catvod.spider.merge.d0.C0070;
import com.github.catvod.spider.merge.e0.C0073;
import com.github.catvod.spider.merge.e0.C0074;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.h0.C0085;
import com.github.catvod.spider.merge.h0.C0087;
import com.github.catvod.spider.merge.i0.C0091;
import com.github.catvod.spider.merge.i0.C0092;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.l0.C0101;
import com.github.catvod.spider.merge.o0.C0109;
import com.github.catvod.spider.merge.p000a.C0056;
import com.github.catvod.spider.merge.p000a.N;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p001b.h;
import com.github.catvod.spider.merge.p001b.i;
import com.github.catvod.spider.merge.p001b.k;
import com.github.catvod.spider.merge.p002c.C0063;
import com.github.catvod.spider.merge.p004e.C0072;
import com.github.catvod.spider.merge.p005f.C0076;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p006g.C0082;
import com.github.catvod.spider.merge.p008i.C0089;
import com.github.catvod.spider.merge.p008i.C0090;
import com.github.catvod.spider.merge.p009k.C0095;
import com.github.catvod.spider.merge.p009k.C0096;
import com.github.catvod.spider.merge.p009k.C0097;
import com.github.catvod.spider.merge.p009k.C0098;
import com.github.catvod.spider.merge.p011m.C0103;
import com.github.catvod.spider.merge.p012n.C0104;
import com.github.catvod.spider.merge.p012n.C0105;
import com.github.catvod.spider.merge.p012n.C0106;
import com.github.catvod.spider.merge.p013o.C0107;
import com.github.catvod.spider.merge.p014q.C0112;
import com.github.catvod.spider.merge.p015s.C0117;
import com.github.catvod.spider.merge.p016t.C0122;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.C0125;
import com.github.catvod.spider.merge.p017u.C0126;
import com.github.catvod.spider.merge.p017u.C0128;
import com.github.catvod.spider.merge.p017u.RunnableC0460l;
import com.github.catvod.spider.merge.p017u.RunnableC0464p;
import com.github.catvod.spider.merge.p018v.C0130;
import com.github.catvod.spider.merge.p019w.C0133;
import com.github.catvod.spider.merge.p020x.C0135;
import com.github.catvod.spider.merge.p020x.C0137;
import com.github.catvod.spider.merge.p021y.C0139;
import com.github.catvod.spider.merge.p022z.C0140;
import com.github.catvod.spider.merge.p022z.C0559r1;
import com.github.catvod.spider.merge.p022z.InterfaceC0545o1;
import com.github.catvod.spider.merge.p022z.InterfaceC0555q1;
import com.github.catvod.spider.merge.p022z.P0;
import com.github.catvod.spider.merge.p022z.Q0;
import com.github.catvod.spider.merge.q0.C0114;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.r.C0116;
import com.github.catvod.spider.merge.s0.C0118;
import com.github.catvod.spider.merge.s0.C0119;
import com.github.catvod.spider.merge.s0.C0120;
import com.github.catvod.utils.C0143;
import com.google.gson.Gson;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class FishDrive extends Spider {
    public static boolean A;
    public static boolean B;
    public static final ArrayList C;
    public static JSONObject D;
    public static final String[] E;
    public static volatile FishDrive g;
    public static final OkHttpClient o;
    public static final HashMap p;
    public static String q;
    public static String r;
    public static final ArrayList s;
    public static final ArrayList t;
    public static final ArrayList u;
    public static final Map v;
    public static volatile String w;
    public static boolean x;
    public static boolean y;
    public static boolean z;
    public ArrayList a;
    public C0559r1 b;
    public X1 c;
    public final InterfaceC0545o1 d = new InterfaceC0545o1() { // from class: com.github.catvod.spider.FishDrive.1

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f36short = {-27607, 31242, 19305, 24296, 24592, 23215, 22636, 17717, 2872, 32590, 1256, 1276, 1277, 1249, 1243, 1260, 1272, 1276, 1248, 1275, 1260, 1261, -27567, -30000, -28004, 26337, 29994, 23556, 680, 650, 650, 652, 666, 666, 701, 646, 642, 652, 647, 27897, 32168, 21638, 21963, 32322, 22380, 2362, 2357, 2361, 2353, 2289, 2302, 2290, 2298, 2713, 2696, 2714, 2714};

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public void addDrive(JSONObject jSONObject) {
            FishDrive.h.add(jSONObject);
            saveConfig();
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public List<String[]> getAllCategories() {
            return FishDrive.s;
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public List<String> getCategoryOrder() {
            return FishDrive.t;
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public List<String> getDisabledServers() {
            return FishDrive.C;
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public List<JSONObject> getDrives() {
            return FishDrive.h;
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public String getEmbyAuthStatus(JSONObject jSONObject) {
            String strN = FishDrive.n(jSONObject);
            if (strN.isEmpty()) {
                return "配置不完整";
            }
            long jLongValue = ((Long) FishDrive.k.getOrDefault(strN, 0L)).longValue() - System.currentTimeMillis();
            if (jLongValue > 0) {
                return "冷却中 " + Math.max(1L, jLongValue / 1000) + "秒";
            }
            JSONObject jSONObjectQ = FishDrive.Q(strN);
            if (jSONObjectQ == null || !jSONObjectQ.optBoolean("authRequired")) {
                return (FishDrive.i.containsKey(strN) || !(jSONObjectQ == null || jSONObjectQ.optString("AccessToken").isEmpty())) ? "已登录" : "未登录";
            }
            return "需要重新登录";
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public List<String> getHiddenCategories() {
            return FishDrive.u;
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public void logoutEmby(JSONObject jSONObject) {
            String strN = FishDrive.n(jSONObject);
            if (strN.isEmpty()) {
                return;
            }
            FishDrive.J(strN);
            FishDrive.k.remove(strN);
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public void removeDrive(int i2) {
            if (i2 >= 0) {
                ArrayList arrayList = FishDrive.h;
                if (i2 < arrayList.size()) {
                    JSONObject jSONObject = (JSONObject) arrayList.get(i2);
                    String strOptString = jSONObject.optString("name", "");
                    arrayList.remove(i2);
                    FishDrive.a(jSONObject, true);
                    FishDrive.v.remove(strOptString);
                    FishDrive.p.remove(strOptString);
                    saveConfig();
                }
            }
        }

        public void saveConfig() {
            JSONObject jSONObject = FishDrive.f;
            FishDrive.this.getClass();
            FishDrive.L();
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public void setCategoryOrder(List<String> list) {
            ArrayList arrayList = FishDrive.t;
            arrayList.clear();
            arrayList.addAll(list);
            FishDrive.this.getClass();
            FishDrive.L();
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public void setDisabledServers(List<String> list) {
            ArrayList arrayList = FishDrive.C;
            arrayList.clear();
            arrayList.addAll(list);
            FishDrive.this.getClass();
            FishDrive.L();
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public void setHiddenCategories(List<String> list) {
            ArrayList arrayList = FishDrive.u;
            arrayList.clear();
            arrayList.addAll(list);
            FishDrive.this.getClass();
            FishDrive.L();
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public void swapDrives(int i2, int i3) {
            if (i2 >= 0) {
                ArrayList arrayList = FishDrive.h;
                if (i2 >= arrayList.size() || i3 < 0 || i3 >= arrayList.size()) {
                    return;
                }
                JSONObject jSONObject = (JSONObject) arrayList.get(i2);
                arrayList.set(i2, (JSONObject) arrayList.get(i3));
                arrayList.set(i3, jSONObject);
                saveConfig();
            }
        }

        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public void testConnection(final JSONObject jSONObject, final InterfaceC0555q1 interfaceC0555q1) {
            InitOrigin.execute(new Runnable() { // from class: com.github.catvod.spider.FishDrive.1.1

                /* JADX INFO: renamed from: short, reason: not valid java name */
                private static final short[] f37short = {569, 543, 521, 542, -30034, 26325, 26464, 22511, 1361, 1360, 21505, 1360, -31465, 26988, 26841, 22614, 2792, 2793, 32737, 26878, 2803, 2793, 2690, 2733, 2721, 2729, 771, 773, 787, 772, 1267, 1250, 1264, 1264, 1213, 1195, 1212, 1208, 1195, 1212, 1759, 18645, -24954, 28689, -31268, 27047, 21299, -30937, 2616, 2594};

                @Override // java.lang.Runnable
                public void run() {
                    String strM414 = "User";
                    InterfaceC0555q1 interfaceC0555q2 = interfaceC0555q1;
                    JSONObject jSONObject2 = jSONObject;
                    String strM486 = "连接成功! 共 ";
                    String strM511 = "连接成功! 用户: ";
                    try {
                        if (FishDrive.D(jSONObject2)) {
                            FishDrive.this.getClass();
                            JSONObject jSONObjectM = FishDrive.m(jSONObject2, true);
                            interfaceC0555q2.c(strM511 + (jSONObjectM.optJSONObject(strM414) != null ? jSONObjectM.getJSONObject(strM414).optString("Name", "") : ""), true);
                            return;
                        }
                        OkHttpSardine okHttpSardine = new OkHttpSardine();
                        okHttpSardine.setCredentials(jSONObject2.optString("user", ""), jSONObject2.optString("pass", ""));
                        interfaceC0555q2.c(strM486 + (okHttpSardine.list(jSONObject2.optString("server", "")).size() - 1) + " 个项目", true);
                    } catch (Exception e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = e.getClass().getSimpleName();
                        }
                        interfaceC0555q2.c("连接失败: ".concat(message), false);
                    }
                }
            });
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0061  */
        @Override // com.github.catvod.spider.merge.p022z.InterfaceC0545o1
        public void updateDrive(int i2, JSONObject jSONObject) {
            boolean z2;
            if (i2 >= 0) {
                ArrayList arrayList = FishDrive.h;
                if (i2 < arrayList.size()) {
                    JSONObject jSONObject2 = (JSONObject) arrayList.get(i2);
                    String strOptString = jSONObject2.optString("name", "");
                    arrayList.set(i2, jSONObject);
                    if (FishDrive.n(jSONObject2).equals(FishDrive.n(jSONObject))) {
                        String strM570 = "pass";
                        if (jSONObject2.optString(strM570).equals(jSONObject.optString(strM570))) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = true;
                    }
                    FishDrive.a(jSONObject2, z2);
                    FishDrive.a(jSONObject, false);
                    FishDrive.v.remove(strOptString);
                    FishDrive.p.remove(strOptString);
                    saveConfig();
                }
            }
        }
    };
    public final P0 e = new P0() { // from class: com.github.catvod.spider.FishDrive.2

        /* JADX INFO: renamed from: short, reason: not valid java name */
        private static final short[] f38short = {2394, 2386, 2397, 2374, 2422, 2379, 2394, 2386, 2411, 2374, 2383, 2394, 2380, 2419, 2384, 2396, 2398, 2387, 3121, 3129, 3126, 3117, 3079, 3121, 3125, 3110, 3127, 3132, 3072, 3117, 3108, 3121, 3111, 3096, 3131, 3127, 3125, 3128, 1706, 1698, 1709, 1718, 1692, 1706, 1710, 1725, 1708, 1703, 1667, 1702, 1698, 1702, 1723, 1667, 1696, 1708, 1710, 1699, 1328, 1336, 1335, 1324, 1285, 1332, 1330, 1328, 1286, 1340, 1327, 1328, 1305, 1338, 1334, 1332, 1337};

        @Override // com.github.catvod.spider.merge.p022z.P0
        public void clearAllEmbyCache() {
            FishDrive.i.clear();
            FishDrive.v.clear();
            FishDrive.p.clear();
            FishDrive.w = null;
        }

        @Override // com.github.catvod.spider.merge.p022z.P0
        public void clearEmbyCache(String str, boolean z2, boolean z3) {
            JSONObject jSONObjectW;
            if (z2 && (jSONObjectW = FishDrive.w(str)) != null) {
                FishDrive.a(jSONObjectW, false);
            }
            if (z3) {
                FishDrive.v.remove(str);
            }
            FishDrive.w = null;
        }

        @Override // com.github.catvod.spider.merge.p022z.P0
        public List<String> getDisabledServers() {
            return FishDrive.C;
        }

        @Override // com.github.catvod.spider.merge.p022z.P0
        public List<JSONObject> getDrives() {
            return FishDrive.h;
        }

        @Override // com.github.catvod.spider.merge.p022z.P0
        public int getEmbyAuthCacheCount() {
            return FishDrive.i.size();
        }

        @Override // com.github.catvod.spider.merge.p022z.P0
        public com.github.catvod.spider.merge.p007h.a getEmbyManagePrefs() {
            JSONObject jSONObject = FishDrive.f;
            FishDrive.this.getClass();
            return FishDrive.r();
        }

        @Override // com.github.catvod.spider.merge.p022z.P0
        public boolean[] getEmbyPersonalStates() {
            return new boolean[]{FishDrive.y, FishDrive.z, FishDrive.A, FishDrive.B};
        }

        @Override // com.github.catvod.spider.merge.p022z.P0
        public int getEmbyViewsCacheCount() {
            return FishDrive.v.size();
        }

        @Override // com.github.catvod.spider.merge.p022z.P0
        public void refreshEmbyViews(final String str, final Q0 q0) {
            InitOrigin.execute(new Runnable() { // from class: com.github.catvod.spider.FishDrive.2.1

                /* JADX INFO: renamed from: short, reason: not valid java name */
                private static final short[] f39short = {3063, 1799, 18701, 23989, 18548, 22964, 1461, 19352, 24269, 21181};

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        JSONObject jSONObjectW = FishDrive.w(str);
                        if (jSONObjectW != null && FishDrive.D(jSONObjectW)) {
                            ArrayList arrayListB = FishDrive.b(FishDrive.this, jSONObjectW);
                            FishDrive.v.put(str, arrayListB);
                            FishDrive.w = null;
                            Q0 q1 = q0;
                            if (q1 != null) {
                                ((X1) q1).c(str + " " + arrayListB.size() + " 个媒体库", true);
                                return;
                            }
                            return;
                        }
                        Q0 q2 = q0;
                        if (q2 != null) {
                            ((X1) q2).c(str + " 不存在", false);
                        }
                    } catch (Exception e) {
                        Q0 q3 = q0;
                        if (q3 != null) {
                            ((X1) q3).c(e.getMessage(), false);
                        }
                    }
                }
            });
        }

        @Override // com.github.catvod.spider.merge.p022z.P0
        public void setEmbyManagePrefs(com.github.catvod.spider.merge.p007h.a aVar) {
            JSONObject jSONObject;
            int i2;
            int i3;
            if (aVar != null) {
                jSONObject = new JSONObject();
                String strM314 = "embyItemTypesLocal";
                if (aVar.e) {
                    String str = aVar.a;
                    if (com.github.catvod.spider.merge.p007h.a.b(str)) {
                        try {
                            jSONObject.put(strM314, str);
                        } catch (JSONException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                }
                String strM65 = "embySearchTypesLocal";
                if (aVar.f) {
                    String str2 = aVar.b;
                    if (com.github.catvod.spider.merge.p007h.a.b(str2)) {
                        try {
                            jSONObject.put(strM65, str2);
                        } catch (JSONException e2) {
                            throw new IllegalStateException(e2);
                        }
                    }
                }
                String strM199 = "embySearchLimitLocal";
                if (aVar.g && (i3 = aVar.c) > 0) {
                    try {
                        jSONObject.put(strM199, Integer.valueOf(i3));
                    } catch (JSONException e3) {
                        throw new IllegalStateException(e3);
                    }
                }
                String strM105 = "embyPageSizeLocal";
                if (aVar.h && (i2 = aVar.d) > 0) {
                    try {
                        jSONObject.put(strM105, Integer.valueOf(i2));
                    } catch (JSONException e4) {
                        throw new IllegalStateException(e4);
                    }
                }
            } else {
                jSONObject = new JSONObject();
            }
            FishDrive.D = jSONObject;
            FishDrive.v.clear();
            FishDrive.this.getClass();
            FishDrive.L();
        }

        @Override // com.github.catvod.spider.merge.p022z.P0
        public void setEmbyPersonalStates(boolean[] zArr) {
            if (zArr == null || zArr.length < 4) {
                return;
            }
            FishDrive.y = zArr[0];
            FishDrive.z = zArr[1];
            FishDrive.A = zArr[2];
            FishDrive.B = zArr[3];
            FishDrive.this.getClass();
            FishDrive.L();
        }
    };

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f35short = {1833, 585, 1044, 1051, 1047, 1055, 449, 467, 468, 466, 471, 448, 496, 479, 474, 450, 467, 452, 453, 2319, 590, 3164, 3156, -32263, 27018, 3157, 1769, 1930, 1922, 1933, 1942, 1961, 1926, 1923, 1947, 1930, 1949, 1948, 399, 391, 392, 403, 437, 410, 399, 408, 409, 389, 388, 395, 390, 26842, 31823, 2795, 2702, 2726, 2729, 2738, 947, 933, 948, 948, 937, 942, 935, -32669, 29875, 1464, 3287, 3288, 3284, 3292, 706, 735, 752, 746, 753, 733, 747, 752, 751, 764, 708, 697, 746, 764, 760, 747, 762, 753, 675, 697, 2763, 2755, 2764, 2775, 2708, 825, 1009, 1009, 1271, 1237, 1237, 1235, 1221, 1221, 1250, 1241, 1245, 1235, 1240, 2709, 2739, 2725, 2738, 2697, 2724, 2047, 1989, 2022, 2010, 2007, 1999, 2004, 2007, 2005, 2013, 2595, 2597, 2594, 2610, 874, 862, 863, 836, 868, 859, 846, 837, 871, 834, 861, 846, 888, 863, 857, 846, 842, 838, 2452, 2451, 2462, 2433, 2455, 1501, 1530, 1519, 1532, 1530, 1498, 1511, 1507, 1515, 1498, 1511, 1517, 1509, 1533, 946, 1792, 1836, 1845, 1822, 1849, 1855, 1832, 1836, 1824, 1828, 1827, 1834, 1807, 1828, 1849, 1855, 1836, 1849, 1832, 1013, 989, 988, 977, 985, 1003, 983, 973, 970, 987, 989, 1009, 988, 1970, 1945, 1942, 1941, 1947, 1938, 1971, 1950, 1925, 1938, 1940, 1923, 1959, 1947, 1942, 1934, 1071, 1028, 1035, 1032, 1030, 1039, 1070, 1027, 1048, 1039, 1033, 1054, 1081, 1054, 1048, 1039, 1035, 1031, 1401, 1362, 1373, 1374, 1360, 1369, 1384, 1358, 1373, 1362, 1359, 1375, 1363, 1368, 1365, 1362, 1371, 1613, 1543, 1551, 1536, 1563, 1613, 1579, 1558, 1543, 1551, 1553, 1613, 873, 790, 810, 807, 831, 804, 807, 805, 813, 783, 808, 800, 809, 1134, 1137, 1133, 1130, 1312, 1288, 1289, 1284, 1292, 1342, 1282, 1304, 1311, 1294, 1288, 1310, 1372, 1393, 2511, 2536, 2557, 2536, 2549, 2559, 1297, 1371, 1363, 1372, 1351, 1297, 1384, 1367, 1370, 1371, 1361, 1357, 1297, 3193, 3109, 3106, 3108, 3123, 3127, 3131, 2455, 2495, 2494, 2483, 2491, 2441, 2478, 2472, 2495, 2491, 2487, 2473, 780, 801, 808, 829, 751, 713, 734, 712, 725, 712, 720, 729, 762, 726, 733, 732, 730, 514, 515, 517, 869, 840, 850, 849, 845, 832, 856, 877, 832, 847, 838, 852, 832, 838, 836, 1977, 1940, 1934, 1933, 1937, 1948, 1924, 1961, 1940, 1929, 1937, 1944, 567, 528, 538, 539, 518, 23249, 24531, 2413, 2380, 2373, 2368, 2399, 2380, 2395, 2384, 2428, 2395, 2373, 2997, 3017, 3055, 3064, 3054, 3059, 3054, 3062, 3071, 3049, 2997, 3169, 3101, 3130, 3132, 3115, 3119, 3107, 3168, 2895, 2614, 2624, 2641, 2632, 2686, 2634, 2628, 2648, 2588, 1288, 1288, 1288, 1748, 1742, 1746, 617, 605, 604, 576, 583, 602, 577, 594, 585, 604, 577, 583, 582, 1695, 1677, 1674, 1676, 1673, 1694, 26275, 22207, 20332, 30089, 20553, 22664, 20386, -381, -30088, 31618, 21889, -28606, -30118, 1461, 1466, 1440, 1467, 1463, 1441, 1466, 1445, 1462, 1420, 2370, 2378, 2373, 2398, 2333, 417, 2874, 1922, 1952, 1952, 1958, 1968, 1968, 1943, 1964, 1960, 1958, 1965, 1609, 1648, 1635, 1652, 1648, 1647, 1635, 1649, 1578, 1601, 1635, 1640, 1652, 1635, 1653, 1578, 1622, 1635, 1641, 1654, 1642, 1635, 1578, 1621, 1650, 1651, 1634, 1647, 1641, 1653, 1578, 1605, 1641, 1643, 1643, 1651, 1640, 1647, 1650, 1663, 1620, 1639, 1650, 1647, 1640, 1633, 1578, 1609, 1632, 1632, 1647, 1637, 1647, 1639, 1642, 1620, 1639, 1650, 1647, 1640, 1633, 1578, 1622, 1652, 1641, 1634, 1651, 1637, 1650, 1647, 1641, 1640, 1631, 1635, 1639, 1652, 1578, 1602, 1639, 1650, 1635, 1605, 1652, 1635, 1639, 1650, 1635, 1634, 1578, 1611, 1635, 1634, 1647, 1639, 1621, 1641, 1651, 1652, 1637, 1635, 1653, 1578, 1611, 1635, 1634, 1647, 1639, 1621, 1650, 1652, 1635, 1639, 1643, 1653, 1382, 1353, 1349, 1356, 1348, 1363, 945, 1019, 1011, 1020, 999, 945, 971, 1005, 1019, 1004, 1005, 945, 2934, 2832, 2861, 2876, 2868, 2858, 2934, 2432, 2479, 2467, 2475, 2697, 2736, 2723, 2740, 2736, 2735, 2723, 2737, 1691, 1370, 1000, 970, 961, 989, 970, 988, 518, 521, 518, 973, 1007, 1010, 1017, 1000, 1022, 1001, 1012, 1010, 1011, 964, 1016, 1020, 1007, 2495, 2451, 2449, 2449, 2441, 2450, 2453, 2440, 2437, 2478, 2461, 2440, 2453, 2450, 2459, 507, 496, 495, 440, 3008, 3049, 3049, 3046, 3052, 3046, 3054, 3043, 3037, 3054, 3067, 3046, 3041, 3048, 1657, 1612, 1606, 1625, 1605, 1612, 2423, 2394, 2387, 2374, 2261, 2280, 2283, 2274, 1289, 1323, 1340, 1319, 1338, 400, 1217, 1405, 1360, 1355, 1372, 1370, 1357, 1366, 1355, 2610, 2581, 2580, 2565, 2568, 2574, 2578, 2274, 2264, 2285, 2244, 2247, 2255, 2254, 2265, 998, 843, 1070, 1030, 1033, 1042, 32475, 27583, 1253, 1224, 28388, 23368, 24449, -26831, -32179, 658, 648, 1080, 1029, 1044, 1052, 1026, 524, 618, 599, 582, 590, 592, 1015, 1008, 1021, 994, 1012, 2104, 2063, 2057, 2079, 2072, 2073, 2051, 2076, 2063, 467, 500, 505, 502, 495, 510, 511, 467, 494, 511, 503, 462, 483, 490, 511, 489, 1607, 1654, 1637, 1650, 1657, 1635, 1630, 1651, 751, 729, 733, 719, 723, 722, 1785, 1750, 1754, 1746, 1691, 1790, 1747, 1691, 1790, 1753, 1747, 1746, 1743, 1785, 1730, 1754, 1749, 1746, 1733, 1887, 1912, 1906, 1907, 1902, 1880, 1891, 1915, 1908, 1907, 1892, 29020, 24405, 832, 885, 876, 886, 874, 865, 864, 2512, 2559, 2547, 2555, 2482, 2519, 2554, 2482, 2519, 2544, 2554, 2555, 2534, 2512, 2539, 2547, 2556, 2555, 2540, 2482, 2515, 2555, 2554, 2551, 2559, 2509, 2545, 2539, 2540, 2557, 2555, 2541, 2482, 2515, 2555, 2554, 2551, 2559, 2509, 2538, 2540, 2555, 2559, 2547, 2541, -28332, 2595, 2571, 2570, 2567, 2575, 2621, 2561, 2587, 2588, 2573, 2571, 2589, 1746, 1786, 1787, 1782, 1790, 1740, 1776, 1770, 1773, 1788, 1786, 1772, 1715, 1746, 1786, 1787, 1782, 1790, 1740, 1771, 1773, 1786, 1790, 1778, 1772, 430, 435, 412, 390, 413, 433, 391, 412, 387, 400, 424, 469, 432, 408, 407, 396, 469, 400, 389, 412, 390, 410, 401, 400, 469, 390, 410, 384, 391, 406, 400, 390, 469, 1693, 1664, 1711, 1717, 1710, 1666, 1716, 1711, 1712, 1699, 1691, 1766, 1667, 1707, 1700, 1727, 1766, 1717, 1699, 1716, 1711, 1699, 1717, 1766, 1698, 1699, 1714, 
    1703, 1711, 1706, 1717, 1766, 1244, 1244, 1244, 1138, 1043, 1052, 1040, 1048, 1737, 1755, 1739, 503, 503, 503, 451, 451, 451, 1140, 1147, 1121, 1146, 1142, 1120, 1147, 1124, 1143, 1101, 1148, 1143, 1126, 1125, 1149, 1120, 1145, 1101, 1139, 1137, 1137, 1143, 1150, 1143, 1120, 1139, 1126, 1147, 1149, 1148, 925, 914, 904, 915, 927, 905, 914, 909, 926, 932, 927, 914, 904, 907, 919, 922, 898, 932, 918, 922, 917, 922, 924, 926, 1857, 1870, 1876, 1871, 1859, 1877, 1870, 1873, 1858, 1912, 1871, 1858, 1867, 1879, 1101, 1090, 1112, 1091, 1103, 1113, 1090, 1117, 1102, 1140, 1102, 1094, 1097, 1106, 1140, 1112, 1102, 1119, 1119, 1090, 1093, 1100, 1112, 545, 558, 564, 559, 547, 565, 558, 561, 546, 536, 564, 546, 565, 561, 546, 565, 536, 564, 546, 563, 563, 558, 553, 544, 564, 974, 961, 987, 960, 972, 986, 961, 990, 973, 1015, 965, 973, 972, 961, 969, 1015, 965, 969, 961, 966, 988, 973, 966, 969, 966, 971, 973, 1061, 1075, 1058, 1058, 1087, 1080, 1073, 1383, 1326, 1318, 1321, 1330, 1300, 1339, 1326, 1337, 1336, 1316, 1317, 1322, 1319, -30612, 23614, 22878, -26402, 21956, 23577, 32030, 28475, 23191, 24158, 3078, 3086, 3073, 3098, 3132, 3091, 3078, 3089, 3088, 3084, 3085, 3074, 3087, 3161, 3161, 3089, 3078, 3088, 3094, 3086, 3078, 30140, 30134, -32103, 31824, -29892, 24430, 23054, -25714, 22164, 24393, 32334, 27755, 22983, 23822, 3289, 3281, 3294, 3269, 3299, 3276, 3289, 3278, 3279, 3283, 3282, 3293, 3280, 3206, 3206, 3282, 3289, 3268, 3272, 18937, 18930, -28364, 806, 821, 802, 803, 825, 831, 830, 894, 826, 800, 823, -30883, 21263, 22127, -26641, 23285, 21288, 29231, 24586, 21926, 20847, 2946, 2954, 2949, 2974, 3000, 2967, 2946, 2965, 2964, 2952, 2953, 2950, 2955, 3037, 3037, 2955, 2950, 2963, 2946, 2964, 2963, 28166, 27830, 22659, 21183, -31735, 20571, 21819, -27461, 22945, 20604, 29051, 25438, 22258, 21051, 3026, 3034, 3029, 3022, 3048, 3015, 3026, 3013, 3012, 3032, 3033, 3030, 3035, 2957, 2957, 3025, 3030, 3009, 3032, 3013, 3038, 3011, 3026, 24776, 29789, 26607, -30954, 611, 619, 612, 639, 601, 630, 611, 628, 629, 617, 616, 615, 618, 572, 572, 3113, 3087, 3097, 3086, 3128, 3101, 3080, 3101, 2909, 2930, 2942, 2934, 1731, 1774, 1197, 1186, 1198, 1190, 2716, 2725, 2730, 2736, 2731, 2695, 2737, 2730, 2741, 2726, 1955, 1934, 1927, 1938, 841, 892, 869, 895, 867, 872, 873, 3039, 3049, 3070, 3045, 3049, 3071, 3010, 3053, 3041, 3049, 2282, 858, 807, 2849, 2832, 2819, 2836, 2847, 2821, 2872, 2847, 2837, 2836, 2825, 2879, 2820, 2844, 2835, 2836, 2819, 617, 590, 580, 581, 600, 622, 597, 589, 578, 581, 594, 2711, 2785, 2804, 2806, 2720, 2689, 2785, 2804, 2806, 2720, 29486, -28426, 1486, 1513, 1522, 1480, 1525, 1521, 1529, 1480, 1525, 1535, 1527, 1519, 929, 925, 912, 904, 915, 912, 914, 922, 929, 926, 898, 920, 901, 920, 926, 927, 933, 920, 914, 922, 898, 1959, 1840, 1959, 1794, 2312, 2366, 2345, 2354, 2366, 2344, 2322, 2367, 1981, 1931, 1948, 1927, 1931, 1949, 1982, 1948, 1927, 1923, 1935, 1948, 1943, 1959, 1923, 1935, 1929, 1931, 1978, 1935, 1929, 1219, 1219, 809, 1028, 1062, 1062, 1056, 1078, 1078, 1041, 1066, 1070, 1056, 1067, 837, 857, 836, 834, 2169, 2136, 2126, 2142, 2136, 2131, 2137, 2132, 2131, 2138, 1425, 1810, 1847, 1826, 1843, 1818, 1847, 1829, 1826, 1813, 1849, 1848, 1826, 1843, 1848, 1826, 1815, 1842, 1842, 1843, 1842, 1914, 1797, 1849, 1828, 1826, 1816, 1847, 1851, 1843, 1697, 1693, 1664, 1670, 1712, 1675, 1492, 1523, 1534, 1521, 1512, 1529, 1528, 1492, 1513, 1528, 1520, 1481, 1508, 1517, 1528, 1518, 706, 766, 739, 741, 734, 739, 757, 756, 739, 644, 693, 678, 689, 698, 672, 669, 688, 2774, 2785, 2791, 2801, 2806, 2807, 2797, 2802, 2785, 2535, 2529, 2534, 2550, 2333, 2360, 2364, 2360, 2341, 2253, 2282, 2303, 2284, 2282, 2263, 2288, 2298, 2299, 2278, 1496, 1532, 1520, 1526, 1524, 1477, 1512, 1505, 1524, 1501, 1528, 1532, 1528, 1509, 2338, 2313, 2310, 2309, 2315, 2306, 2350, 2314, 2310, 2304, 2306, 2355, 2334, 2327, 2306, 2324, 1489, 1523, 1512, 1516, 1504, 1523, 1528, 1453, 1475, 1504, 1506, 1514, 1509, 1523, 1518, 1521, 1453, 1493, 1513, 1524, 1516, 1507, 1453, 1475, 1504, 1519, 1519, 1508, 1523, 3298, 3277, 3265, 3272, 3264, 3287, 2814, 2781, 2767, 2773, 2783, 2799, 2757, 2770, 2783, 2805, 2770, 2778, 2771, 2704, 2796, 2766, 2773, 2769, 2781, 2766, 2757, 2805, 2769, 2781, 2779, 2777, 2813, 2767, 2764, 2777, 2783, 2760, 2798, 2781, 2760, 2773, 2771, 2704, 2796, 2766, 2771, 2776, 2761, 2783, 2760, 2773, 2771, 2770, 2789, 2777, 2781, 2766, 2704, 2815, 2771, 2769, 2769, 2761, 2770, 2773, 2760, 2757, 2798, 2781, 2760, 2773, 2770, 2779, 2704, 2803, 2778, 2778, 2773, 2783, 2773, 2781, 2768, 2798, 2781, 2760, 2773, 2770, 2779, 1870, 1893, 1898, 1897, 1895, 1902, 1886, 1912, 1902, 1913, 1871, 1898, 1919, 1898, 2733, 2735, 2724, 2744, 2735, 2488, 2458, 2449, 2445, 2458, 2444, 1842, 1838, 1834, 1849, 2363, 2311, 2307, 2320, 2321, 1233, 1218, 1239, 1226, 1229, 1220, 3108, 3085, 3085, 3074, 3080, 3074, 3082, 3079, 3129, 3082, 3103, 3074, 3077, 3084, 3096, 2917, 2928, 2934, 2531, 2518, 2512, 2500, 1526, 1514, 1511, 1535, 1507, 1506, 1419, 1457, 1426, 1454, 1443, 1467, 1447, 1446, 2306, 2309, 2322, 2315, 2326, 2317, 2320, 2305, 3155, 3177, 3164, 3195, 3180, 3189, 3176, 3187, 3182, 3199, 971, 897, 905, 902, 925, 971, 945, 919, 897, 918, 919, 971, 857, 831, 770, 787, 795, 773, 386, 447, 430, 422, 440, 1395, 1361, 1356, 1351, 1366, 1344, 1367, 1354, 1356, 1357, 1402, 1350, 1346, 1361, 1464, 1428, 1430, 1430, 1422, 1429, 1426, 1423, 1410, 1449, 1434, 1423, 1426, 1429, 1436, 1892, 1880, 1877, 1869, 1873, 1872, 1495, 29319, 1489, 1452, 1194, 1185, 1214, 1257, 1440, 1601, 1658, 1633, 1652, 1657, 1607, 1648, 1654, 1658, 1639, 1649, 1622, 1658, 1632, 1659, 1633, 1005, 1008, 998, 999, 1008, 613, 616, 609, 628, 2537, 2529, 2542, 2549, 2501, 2552, 2537, 2529, 2520, 2549, 2556, 2537, 2559, 2496, 2531, 2543, 2541, 2528, 1830, 1838, 1825, 1850, 1808, 1830, 1826, 1841, 1824, 1835, 1815, 1850, 1843, 1830, 
    1840, 1807, 1836, 1824, 1826, 1839, 2428, 2420, 2427, 2400, 2378, 2428, 2424, 2411, 2426, 2417, 2389, 2416, 2420, 2416, 2413, 2389, 2422, 2426, 2424, 2421, 3024, 3032, 3031, 3020, 3045, 3028, 3026, 3024, 3046, 3036, 3023, 3024, 3065, 3034, 3030, 3028, 3033, 18370, 2504, 2399, 2504, 24007, 31936, 19260, 631, 632, 610, 633, 629, 611, 632, 615, 628, 590, 610, 628, 611, 615, 628, 611, 590, 610, 628, 613, 613, 632, 639, 630, 610, 28620, 23136, 24233, 18127, -31257, 23350, 2008, 2007, 1997, 2006, 2010, 1996, 2007, 1992, 2011, 2017, 1997, 2011, 1996, 1992, 2011, 1996, 2017, 1997, 2011, 1994, 1994, 2007, 2000, 2009, 1997, 19504, 19616, 21407, 22947, 12827, 26118, 32568, 27392, -25241, 29508, 27431, 24203, 23106, 2419, 2428, 2406, 2429, 2417, 2407, 2428, 2403, 2416, 2378, 2416, 2424, 2423, 2412, 2378, 2406, 2416, 2401, 2401, 2428, 2427, 2418, 2406, 605, 629, 634, 609, 568, -30298, 32118, 645, 650, 656, 651, 647, 657, 650, 661, 646, 700, 646, 654, 641, 666, 700, 656, 646, 663, 663, 650, 653, 644, 656, -28115, -32398, 18142, 2260, 2115, 2260, -31497, 28032, -28530, 22139, 1600, 1615, 1621, 1614, 1602, 1620, 1615, 1616, 1603, 1657, 1602, 1615, 1621, 1622, 1610, 1607, 1631, 1657, 1611, 1607, 1608, 1607, 1601, 1603, 21566, 31299, 18486, 26026, 22711, 2342, 2345, 2355, 2344, 2340, 2354, 2345, 2358, 2341, 2335, 2340, 2345, 2355, 2352, 2348, 2337, 2361, 2335, 2349, 2337, 2350, 2337, 2343, 2341, 21840, 22434, 23693, 21583, 22734, -25520, 3050, 3045, 3071, 3044, 3048, 3070, 3045, 3066, 3049, 3027, 3042, 3049, 3064, 3067, 3043, 3070, 3047, 3027, 3053, 3055, 3055, 3049, 3040, 3049, 3070, 3053, 3064, 3045, 3043, 3042, 792, 810, 813, 779, 782, 793, 879, 20975, -27824, 2222, 2209, 2235, 2208, 2220, 2234, 2209, 2238, 2221, 2199, 2214, 2221, 2236, 2239, 2215, 2234, 2211, 2199, 2217, 2219, 2219, 2221, 2212, 2221, 2234, 2217, 2236, 2209, 2215, 2214, 1217, 1230, 1236, 1231, 1219, 1237, 1230, 1233, 1218, 1272, 1226, 1218, 1219, 1230, 1222, 1272, 1226, 1222, 1230, 1225, 1235, 1218, 1225, 1222, 1225, 1220, 1218, 31726, 24485, 19187, 31241, 26201, 24073, 27022, 15423, 25147, 30776, 256, 271, 277, 270, 258, 276, 271, 272, 259, 313, 267, 259, 258, 271, 263, 313, 267, 263, 271, 264, 274, 259, 264, 263, 264, 261, 259, 2289, 2302, 2276, 2303, 2291, 2277, 2302, 2273, 2290, 2248, 2303, 2290, 2299, 2279, 17871, 32664, 21662, 22553, -27256, 31659, -28879, 25291, 431, 416, 442, 417, 429, 443, 416, 447, 428, 406, 417, 428, 421, 441, 2590, 2590, 2590, 813, 886, 893, 815, 884, 891, 865, 890, 886, 864, 891, 868, 887, 820, 871, 864, 894, 815, 2261, 2701, 2715, 2700, 2696, 2715, 2700, 1332, 1337, 1328, 1317, 2837, 2823, 2816, 2822, 2819, 2836, 1123, 1131, 1124, 1151, 1084, 1044, 1045, 1048, 1040, 1058, 1054, 1028, 1027, 1042, 1044, 1026, 951, 913, 903, 912, 939, 902, 741, 687, 679, 680, 691, 741, 643, 702, 687, 679, 697, 741, 1103, 1072, 1036, 1025, 1049, 1026, 1025, 1027, 1035, 1065, 1038, 1030, 1039, 2374, 2382, 2369, 2394, 2329, 784, 904, 927, 914, 907, 923, 909, 801, 3267, 991, 977, 973, 2909, 2898, 2910, 2902, 1533, 1499, 1485, 1498, 1516, 1481, 1500, 1481, 2059, 2076, 2058, 2060, 2068, 2076, 2048, 2093, 2111, 2104, 2076, 2080, 2093, 2101, 2089, 2088, 2056, 2093, 2104, 2089, 1031, 1036, 1041, 1053, 1972, 1942, 1921, 1929, 1933, 1921, 1942, 1921, 1952, 1925, 1936, 1921, 3191, 3147, 3158, 3152, 3178, 3141, 3145, 3137, 1922, 1959, 1970, 1955, 1925, 1972, 1955, 1959, 1970, 1955, 1954, 2060, 2072, 2073, 2053, 2111, 2056, 2076, 2072, 2052, 2079, 2056, 2057, 1607, 1307, 2333, 2376, 2398, 2373, 2394, 2377, 2399, 573, 575, 554, 571, 569, 561, 556, 551, 529, 556, 570, 571, 556, 2388, 2389, 2392, 2392, 2393, 2386, 2431, 2397, 2376, 2393, 2395, 2387, 2382, 2389, 2393, 2383, 1991, 1999, 2032, 2002, 1999, 2008, 2009, 2039, 1989, 1986, 1988, 1985, 2006, 1344, 1352, 1351, 1372, 1397, 1344, 1367, 1366, 1354, 1355, 1348, 1353, 1399, 1344, 1366, 1360, 1352, 1344, 2576, 2584, 2583, 2572, 2597, 2576, 2567, 2566, 2586, 2587, 2580, 2585, 2619, 2576, 2573, 2561, 1483, 1475, 1484, 1495, 1534, 1483, 1500, 1501, 1473, 1472, 1487, 1474, 1506, 1487, 1498, 1483, 1501, 1498, 2018, 2026, 2021, 2046, 2007, 2018, 2037, 2036, 2024, 2025, 2022, 2027, 1985, 2022, 2033, 2024, 2037, 2030, 2035, 2018, 1892, 1897, 1907, 1889, 1890, 1900, 1893, 1892, 1875, 1893, 1906, 1910, 1893, 1906, 1907, 1156, 1228, 1219, 1241, 1218, 1230, 1240, 1219, 1244, 1231, 1269, 1225, 1221, 1220, 1228, 1219, 1229, 2053, 2072, 2103, 2093, 2102, 2074, 2092, 2103, 2088, 2107, 2051, 2174, 2093, 2111, 2088, 2107, 2077, 2097, 2096, 2104, 2103, 2105, 2148, 2174, 2654, 2582, 2585, 2563, 2584, 2580, 2562, 2585, 2566, 2581, 2607, 2577, 2565, 2564, 2584, 384, 439, 422, 416, 427, 511, 403, 436, 422, 439, 416, 3108, 3074, 3092, 3075, 2529, 2499, 2499, 2501, 2515, 2515, 2548, 2511, 2507, 2501, 2510, 1385, 1355, 1355, 1357, 1371, 1371, 1404, 1351, 1347, 1357, 1350, 3129, 3087, 3096, 3100, 3087, 3096, 3107, 3086, 1735, 1777, 1766, 1762, 1777, 1766, 1757, 1776, 566, 528, 518, 529, 2307, 2350, 2336, 2317, 3288, 3319, 3323, 3315, 2432, 2479, 2467, 2475, 2570, 2588, 2571, 2575, 2588, 2571, 2089, 2093, 2082, 269, 303, 303, 297, 319, 319, 280, 291, 295, 297, 290, 1638, 1641, 1637, 1645, 2623, 2677, 2685, 2674, 2665, 2623, 2629, 2659, 2677, 2658, 2659, 2623, 1250, 1179, 1188, 1192, 1210, 1214, 2968, 2981, 2996, 3004, 2978, 2294, 2265, 2261, 2269, 1585, 1564, 1964, 1964, 765, 757, 762, 737, 734, 753, 756, 748, 765, 746, 747, 2355, 2325, 2307, 2324, 2351, 2306, 903, 950, 933, 946, 953, 931, 926, 947, 514, 549, 552, 551, 574, 559, 558, 514, 575, 558, 550, 543, 562, 571, 558, 568, 2413, 2343, 2351, 2336, 2363, 2413, 2315, 2358, 2343, 2351, 2353, 2413, 2308, 2347, 2350, 2358, 2343, 2352, 2353, 2819, 29009, 2818, 2519, 2549, 2549, 2547, 2533, 2533, 2498, 2553, 2557, 2547, 2552, 1561, 1599, 1577, 1598, 1541, 1576, 3316, 3281, 3285, 3281, 3276, 2248, 2279, 2283, 2274, 2282, 2301, 
    2530, 2496, 2523, 2527, 2515, 2496, 2507, 2555, 2527, 2515, 2517, 2519, 2547, 2497, 2498, 2519, 2513, 2502, 2528, 2515, 2502, 2523, 2525, 2462, 2530, 2496, 2525, 2518, 2503, 2513, 2502, 2523, 2525, 2524, 2539, 2519, 2515, 2496, 2462, 2550, 2515, 2502, 2519, 2545, 2496, 2519, 2515, 2502, 2519, 2518, 2462, 2530, 2496, 2519, 2527, 2523, 2519, 2496, 2519, 2550, 2515, 2502, 2519, 2462, 2529, 2519, 2496, 2523, 2519, 2497, 2556, 2515, 2527, 2519, 2462, 2529, 2519, 2496, 2523, 2519, 2497, 2555, 2518, 2462, 2529, 2519, 2496, 2523, 2519, 2497, 2530, 2496, 2523, 2527, 2515, 2496, 2507, 2555, 2527, 2515, 2517, 2519, 2534, 2515, 2517, 2462, 2530, 2515, 2496, 2519, 2524, 2502, 2555, 2524, 2518, 2519, 2506, 2556, 2503, 2527, 2512, 2519, 2496, 2462, 2555, 2524, 2518, 2519, 2506, 2556, 2503, 2527, 2512, 2519, 2496, 2462, 2528, 2503, 2524, 2534, 2523, 2527, 2519, 2534, 2523, 2513, 2521, 2497, 1425, 1466, 1461, 1462, 1464, 1457, 1409, 1447, 1457, 1446, 1424, 1461, 1440, 1461, 743, 737, 742, 758, 755, 740, 754, 756, 748, 740, 759, 704, 710, 720, 727, 726, 716, 723, 704, 2146, 2088, 2080, 2095, 2100, 2146, 2072, 2110, 2088, 2111, 2110, 2146, 1513, 1423, 1458, 1443, 1451, 1461, 1513, 1428, 1443, 1461, 1459, 1451, 1443, 541, 565, 564, 569, 561, 516, 553, 544, 565, 547, 641, 702, 691, 690, 696, 2699, 2688, 2717, 2705, 2948, 3022, 3014, 3017, 3026, 2948, 3064, 3011, 3012, 3036, 3032, 2948, 3045, 3022, 3027, 3039, 3070, 3035, 1476, 1481, 1500, 1485, 1499, 1500, 821, 786, 799, 784, 777, 792, 793, 821, 776, 793, 785, 808, 773, 780, 793, 783, 897, 999, 986, 971, 963, 989, 897, 994, 975, 986, 971, 989, 986, 2173, 2170, 2157, 2164, 2153, 2162, 2159, 2174, 2625, 2599, 2586, 2571, 2563, 2589, 1451, 1425, 1444, 1411, 1428, 1421, 1424, 1419, 1430, 1415, 1086, 1861, 1912, 1897, 1889, 1919, 23412, -25868, 2745, 2722, 2747, 2747, 2881, 2894, 2900, 2895, 2883, 2901, 2894, 2897, 2882, 2936, 646, 649, 659, 648, 644, 658, 649, 662, 645, 703, 644, 649, 659, 656, 652, 641, 665, 703, 653, 641, 654, 641, 647, 645, 1887, 8825, 1887, 1832, 1838, 1848, 1839, 2028, 2045, 2031, 2031, 2646, 2677, 2663, 2685, 2679, 2612, 2426, 2499, 2529, 2538, 2550, 2529, 2551, 1997, 1999, 1988, 2008, 1999, 30318, 23966, 2000, 2028, 2024, 2043, 2042, 2681, 2661, 2657, 2674, 21528, 17553, 1080, 1041, 1041, 1054, 1044, 1054, 1046, 1051, 1061, 1046, 1027, 1054, 1049, 1040, 1028, 2201, 2186, 2207, 2178, 2181, 2188, 20551, 31974, 2109, 2056, 2062, 2074, 2666, 2687, 2681, 24975, 29430, 2805, 2751, 2743, 2744, 2723, 2805, 2707, 2734, 2751, 2743, 2729, 2805, 563, 597, 625, 637, 635, 633, 623, 563, 588, 622, 629, 625, 637, 622, 613, 547, 625, 637, 612, 587, 629, 632, 616, 628, 545, 552, 556, 556, 570, 616, 637, 635, 545, 933, 1010, 1014, 994, 1007, 1002, 1015, 1018, 958, 954, 947, 1105, 1113, 1110, 1101, 1038, 2947, 912, 912, 2602, 2603, 2617, 2642, 2631, 1043, 2908, 1426, 874, 834, 845, 854, -30581, -30482, 23070, -29174, 789, 783, 871, 891, 891, 895, 783, 379, 305, 313, 310, 301, 379, 257, 295, 305, 294, 295, 379, 277, 289, 288, 316, 305, 314, 288, 317, 311, 309, 288, 305, 278, 301, 282, 309, 313, 305, 2288, 2303, 2291, 2299, 549, 525, 514, 537, 25965, 20673, 21512, 24466, 21267, -26739, 1621, 1601, 1600, 1628, 1638, 1617, 1605, 1601, 1629, 1606, 1617, 1616, 3077, 3111, 3111, 3105, 3127, 3127, 3088, 3115, 3119, 3105, 3114, 1278, 1238, 1241, 1218, -27717, -29382, -27274, 24843, 29376, 23534, 3089, 3123, 3123, 3125, 3107, 3107, 3076, 3135, 3131, 3125, 3134, 665, 671, 649, 670, 1826, 1843, 1825, 1825, 3081, 3119, 3129, 3118, 3122, 3133, 3121, 3129, 890, 861, 775, 792, 772, 771, 1262, 1228, 1228, 1226, 1244, 1244, 1275, 1216, 1220, 1226, 1217, 2784, 2760, 2759, 2780, -32511, -32412, 21396, -30848, 2719, 2693, 24168, 21553, 17576, 20777, 28625, 2021, 1997, 1986, 2009, -29609, 27618, -30617, 18734, -24783, 31201, -1876, -29609, 32173, 21422, 22061, -29579, 829, 789, 794, 769, -29090, 20623, 24942, 22746, 24911, 31127, -29741, 25717, 20953, 21776, 25002, 32165, 1391, 1351, 1352, 1363, 28674, 26397, 20775, 26428, 24300, 32043, -28621, -28987, 2192, 2232, 2231, 2220, -24619, -32428, 28632, 23156, 24253, 24549, 24469, 23641, 32253, 27362, 23768, 637, 597, 602, 577, -27787, 32086, 19509, 22964, 26444, 2222, 2232, 2223, 2219, 2232, 2223, 1452, 1450, 1468, 1451, 946, 950, 953, 2768, 2269, 2271, 2254, 1331, 1339, 1332, 1327, 1283, 1303, 3239, 3258, 3239, 3258, 3234, 3235, 1768, 1760, 1775, 1780, 1742, 1761, 1764, 1768, 1763, 1785, 1755, 1768, 1791, 1790, 1764, 1762, 1763, 317, 309, 314, 289, 270, 317, 298, 299, 305, 311, 310, 1388, 1347, 1353, 1375, 1346, 1348, 1353, 1293, 1376, 1346, 1359, 1348, 1345, 1352, 2872, 2864, 2879, 2852, 2846, 2865, 2868, 2872, 2867, 2857, 843, 1825, 1799, 1809, 1798, 1881, 1845, 1811, 1809, 1818, 1792, 1606, 1636, 1636, 1634, 1655, 1651, 1555, 1538, 1538, 1566, 1563, 1553, 1555, 1542, 1563, 1565, 1564, 1629, 1560, 1537, 1565, 1564, 2212, 2184, 2185, 2195, 2178, 2185, 2195, 2250, 2227, 2206, 2199, 2178, 2375, 2415, 2400, 2427, 2338, 2369, 2414, 2411, 2407, 2412, 2422, 2367, 2336, 2100, 2106, 2102, 2130, 2163, 2144, 2175, 2165, 2163, 2091, 2100, 1058, 1066, 1061, 1086, 1027, 1058, 1073, 1070, 1060, 1058, 712, 743, 749, 763, 742, 736, 749, 681, 717, 748, 767, 736, 746, 748, 991, 977, 989, 953, 920, 907, 916, 926, 920, 948, 921, 960, 991, 983, 985, 981, 931, 912, 903, 902, 924, 922, 923, 968, 983, 465, 1674, 1670, 1778, 1737, 1741, 1731, 1736, 1691, 1668, 3052, 2969, 3057, 3033, 3030, 3021, 2969, 3061, 3009, 3008, 3036, 3035, 3014, 3037, 3022, 3029, 3008, 3037, 3035, 3034, 2863, 2906, 2866, 2842, 2837, 2830, 2906, 2851, 2840, 2844, 2834, 2841, 2883, 2891, 2884, 2911, 2927, 2888, 2901, 2883, 2885, 2899, 2900, 2883, 2930, 2890, 2901, 1286, 1305, 1285, 1282, 2867, 2850, 2850, 2878, 2875, 2865, 2867, 2854, 2875, 2877, 2876, 2941, 2872, 2849, 2877, 2876, 2921, 2930, 2865, 2874, 2867, 2848, 2849, 2871, 2854, 2927, 2855, 
    2854, 2868, 2943, 2922, 937, 897, 910, 917, 31933, 32048, -29646, 24649, 23261, -28983, 1537, 1550, 1538, 1546, 601, 625, 638, 613, 25873, 20669, 21620, 23838, 23588, 550, 572, 596, 584, 584, 588, 572, 3141, 3181, 3170, 3193, -30729, 24642, 21809, -32475, 3130, 3104, 3144, 3156, 3156, 3152, 3104, 2531, 2507, 2500, 2527, -32175, 26084, -31135, 18216, -28361, 30695, -2390, 21588, 28452, 23034, -32231, -25528, 1523, 1499, 1492, 1487, -30576, 22081, 26528, 24084, 26497, 32601, -29411, 25275, 22295, 21470, 26468, 31595, 2644, 2684, 2675, 2664, 31850, 21828, 22499, 21280, 28505, -2787, -32282, -25636, 28577, 31850, 21828, 1775, 1735, 1736, 1747, 24999, 21515, 20674, 22301, 21982, 18567, -1626, -29347, 32227, 22831, 32235, 2522, 2546, 2557, 2534, 28306, 23358, 24567, 21613, 22764, -25486, 839, 840, 836, 844, 1775, 1741, 1741, 1739, 1757, 1757, 1786, 1729, 1733, 1739, 1728, 3052, 3024, 3021, 3019, 3069, 3014, 1458, 1422, 1427, 1429, 1455, 1408, 1420, 1412, 3040, 3036, 3009, 3015, 3068, 3009, 3031, 3030, 3009, 1275, 1225, 1241, 1247, 1236, 1246, 1235, 1236, 1245, 470, 505, 501, 508, 500, 483, 2074, 2105, 2091, 2097, 2107, 2059, 2081, 2102, 2107, 2065, 2102, 2110, 2103, 2164, 2056, 2090, 2097, 2101, 2105, 2090, 2081, 2065, 2101, 2105, 2111, 2109, 2073, 2091, 2088, 2109, 2107, 2092, 2058, 2105, 2092, 2097, 2103, 2164, 2056, 2090, 2103, 2108, 2093, 2107, 2092, 2097, 2103, 2102, 2049, 2109, 2105, 2090, 2748, 2715, 2702, 2717, 2715, 2726, 2689, 2699, 2698, 2711, 1263, 556, 520, 516, 514, 512, 561, 540, 533, 512, 553, 524, 520, 524, 529, 699, 3325, 3274, 3276, 3290, 3293, 3292, 3270, 3289, 3274, 1999, 1993, 1998, 2014, 414, 424, 428, 447, 430, 421, 409, 424, 447, 416, 2555, 2524, 2513, 2526, 2503, 2518, 2519, 2555, 2502, 2519, 2527, 2534, 2507, 2498, 2519, 2497, 2466, 2439, 2435, 2439, 2458, 2790, 2732, 2724, 2731, 2736, 2790, 2716, 2746, 2732, 2747, 2746, 2790, 2070, 2160, 2125, 2140, 2132, 2122, 797, 800, 817, 825, 807, 999, 970, 721, 766, 754, 762, 2790, 2756, 2777, 2770, 2755, 2773, 2754, 2783, 2777, 2776, 2799, 2771, 2775, 2756, 1594, 3096, 3173, 3196, 3162, 3148, 3163, 2991, 2946, 1163, 1164, 1170, 1042, 1436, 1448, 1449, 1461, 1458, 1455, 1460, 1447, 1468, 1449, 1460, 1458, 1459, 2819, 2832, 2847, 2838, 2836, 2567, 2571, 2570, 2570, 2561, 2567, 2576, 2573, 2571, 2570, 1769, 1790, 1789, 1790, 1769, 1790, 1769, 2781, 2775, 2765, 2713, 2777, 2769, 2752, 2773, 2768, 2773, 2752, 2773, 2704, 2706, 2706, 2708, 2689, 2693, 2780, 2708, 2719, 2706, 2718, 2709, 2712, 2719, 2710, 3062, 3056, 3046, 3057, 2990, 3042, 3044, 3046, 3053, 3063, 2387, 2431, 2430, 2404, 2421, 2430, 2404, 2365, 2372, 2409, 2400, 2421, 1036, 1053, 1053, 1025, 1028, 1038, 1036, 1049, 1028, 1026, 1027, 1090, 1026, 1038, 1049, 1032, 1049, 1088, 1054, 1049, 1055, 1032, 1036, 1024, 1211, 1190, 1161, 1171, 1160, 1188, 1170, 1161, 1174, 1157, 1213, 1216, 1174, 1167, 1156, 1242, 1216, 1157, 1165, 1168, 1172, 1177, 1216, 1170, 1157, 1171, 1168, 1167, 1166, 1171, 1157, 1216, 1154, 1167, 1156, 1177, 2732, 2737, 2718, 2692, 2719, 2739, 2693, 2718, 2689, 2706, 2730, 2775, 2689, 2712, 2707, 2765, 2775, 2707, 2693, 2718, 2689, 2706, 2775, 2713, 2712, 2691, 2775, 2705, 2712, 2690, 2713, 2707, 2765, 2775, 3188, 3177, 3142, 3164, 3143, 3179, 3165, 3142, 3161, 3146, 3186, 3087, 3161, 3136, 3147, 3093, 3087, 3138, 3142, 3164, 3164, 3142, 3137, 3144, 3087, 3162, 3165, 3139, 3087, 3167, 3150, 3165, 3150, 3138, 2858, 2853, 2857, 2849, 1810, 1850, 1851, 1846, 1854, 1804, 1835, 1837, 1850, 1854, 1842, 1836, 522, 551, 558, 571, 407, 424, 421, 420, 430, 822, 795, 791, 793, 790, 778, 265, 311, 314, 298, 310, 2142, 1391, 1379, 1387, 1291, 2198, 2195, 2193, 2289, 1922, 1923, 1931, 1923, 2019, 2389, 2348, 2239, 2240, 2200, 2215, 2218, 2219, 2209, 2204, 2223, 2208, 2217, 2219, 2202, 2231, 2238, 2219, 3115, 2807, 2760, 2757, 2756, 2766, 2803, 2752, 2767, 2758, 2756, 1073, 1052, 1030, 1029, 1049, 1044, 1036, 1057, 1052, 1025, 1049, 1040, 1010, 990, 981, 980, 978, 997, 976, 982, 1819, 1844, 1848, 1840, 2973, 2966, 2959, 2960, 839, 844, 847, 833, 858, 803, 853, 842, 848, 842, 844, 845, 2002, 2009, 2010, 2004, 1999, 1984, 2015, 1989, 2015, 2009, 2008, 1423, 1419, 1533, 1475, 1509, 1527, 1533, 1475, 1423, 1419, 1438, 1420, 1426, 1439, 2237, 2223, 2225, 2248, 2788, 2774, 2800, 2770, 2767, 2758, 2761, 2764, 2757, 704, 716, 730, 697, 696, 728, 708, 733, 731, 1025, 1037, 1051, 1144, 1145, 1122, 2468, 2472, 2494, 2525, 2524, 2395, 2399, 2388, 1688, 1684, 1666, 25511, 28463, -29379, 29111, 1037, 1074, 1087, 1086, 1076, 1048, 1076, 1087, 1086, 1080, 1149, 1105, 1114, 1115, 1117, 1753, 1667, 1671, 1669, 680, 718, 722, 726, 724, 2776, 2773, 2758, 2771, 1683, 1737, 1741, 1742, 2383, 2370, 2385, 2372, 1230, 1258, 1254, 1248, 1250, 1235, 1254, 1248, 1268, 2990, 2956, 2967, 2963, 2975, 2956, 2951, 814, 824, 815, 811, 824, 815, 1009, 1022, 1010, 1018, 821, 819, 805, 818, 1008, 993, 1011, 1011, 669, 978, 976, 967, 986, 988, 989, 755, 753, 740, 757, 759, 767, 738, 745, 723, 767, 766, 740, 757, 766, 740, 2848, 2849, 2864, 2853, 2861, 2856, 2823, 2859, 2858, 2864, 2849, 2858, 2864, 2003, 2004, 2006, 2014, 2040, 2004, 2005, 1999, 2014, 2005, 1999, 2231, 2303, 2288, 2282, 2289, 2301, 2283, 2288, 2287, 2300, 2246, 2298, 2294, 2295, 2303, 2288, 2302, 1224, 1246, 1221, 1242, 1225, 1247, 2407, 2406, 2421, 2410, 2400, 2406, 2378, 2407, 1514, 1512, 1533, 1516, 1518, 1510, 1531, 1520, 1478, 1531, 1517, 1516, 1531, 1442, 1443, 1454, 1454, 1455, 1444, 1417, 1451, 1470, 1455, 1453, 1445, 1464, 1443, 1455, 1465, 2422, 2430, 2369, 2403, 2430, 2409, 2408, 2374, 2420, 2419, 2421, 2416, 2407, 1081, 1073, 1086, 1061, 1036, 1081, 1070, 1071, 1075, 1074, 1085, 1072, 1038, 1081, 1071, 1065, 1073, 1081, 1591, 1599, 1584, 1579, 1538, 1591, 1568, 1569, 1597, 1596, 1587, 1598, 1564, 1591, 1578, 1574, 1382, 1390, 1377, 1402, 1363, 1382, 1393, 1392, 1388, 1389, 1378, 1391, 1359, 1378, 1399, 1382, 1392, 1399, 2727, 2735, 2720, 2747, 2706, 2727, 2736, 2737, 
    2733, 2732, 2723, 2734, 2692, 2723, 2740, 2733, 2736, 2731, 2742, 2727, 2238, 2227, 2217, 2235, 2232, 2230, 2239, 2238, 2185, 2239, 2216, 2220, 2239, 2216, 2217, 2531, 2558, 2513, 2507, 2512, 2556, 2506, 2513, 2510, 2525, 2533, 2456, 2516, 2519, 2521, 2524, 2555, 2519, 2518, 2526, 2513, 2527, 2434, 2456, 750, 678, 681, 691, 680, 676, 690, 681, 694, 677, 671, 676, 677, 694, 681, 675, 677, 3260, 3316, 3323, 3297, 3322, 3318, 3296, 3323, 3300, 3319, 3277, 3318, 3319, 3300, 3323, 3313, 3319, 420, 492, 483, 505, 482, 494, 504, 483, 508, 495, 469, 491, 511, 510, 482, 2348, 1016, 983, 989, 971, 982, 976, 989, 2444, 2467, 2473, 2495, 2466, 2468, 2473, 2541, 2441, 2472, 2491, 2468, 2478, 2472, 256, 271, 259, 267, 2881, 2892, 2885, 2896, 1534, 1506, 1506, 1510, 1555, 1541, 1566, 1537, 1554, 1540, 1888, 1906, 1909, 1907, 1910, 1889, 2944, 2973, 2994, 2984, 2995, 2975, 2985, 2994, 2989, 3006, 2950, 3067, 2999, 2996, 3002, 3007, 2974, 2979, 2991, 3006, 2997, 3007, 2968, 2996, 2997, 3005, 2994, 3004, 3041, 3067, 1922, 1924, 1939, 1925, 1944, 1925, 1949, 1940, 1972, 1929, 1925, 1922, 1599, 1581, 1581, 3326, 3326, 3308, 936, 937, 943, 1588, 1576, 1573, 1597, 1569, 1590, 1543, 1579, 1578, 1584, 1569, 1578, 1584, 753, 743, 739, 752, 737, 746, 705, 749, 748, 758, 743, 748, 758, 2578, 2564, 2560, 2579, 2562, 2569, 2594, 2574, 2575, 2581, 2564, 2575, 2581};
    public static JSONObject f = new JSONObject();
    public static final ArrayList h = new ArrayList();
    public static final Map i = Collections.synchronizedMap(new HashMap());
    public static final Map j = Collections.synchronizedMap(new HashMap());
    public static final Map k = Collections.synchronizedMap(new HashMap());
    public static final Object l = new Object();
    public static JSONObject m = new JSONObject();
    public static final OkHttpClient n = h(30, false);

    private /* synthetic */ String $host$0b14bd34f5ca9ec8(String str, boolean z2) {
        return searchContent(str, z2, "1");
    }

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z2) throws InterruptedException {
        String strM186;
        String strM416;
        List arrayList;
        final int i2;
        final CountDownLatch countDownLatch;
        if (w != null) {
            return w;
        }
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        s.clear();
        ArrayList arrayList3 = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList4 = h;
            int size = arrayList4.size();
            strM186 = "1";
            strM416 = "name";
            if (i3 >= size) {
                break;
            }
            JSONObject jSONObject = (JSONObject) arrayList4.get(i3);
            String strOptString = jSONObject.optString(strM416, "");
            if (!strOptString.isEmpty() && !C.contains(strOptString)) {
                if (D(jSONObject)) {
                    arrayList3.add(jSONObject);
                } else {
                    arrayList2.add(new com.github.catvod.spider.merge.p001b.b(strOptString, strOptString, strM186));
                    linkedHashMap.put(strOptString, G("webdavFilters"));
                    s.add(new String[]{strOptString, strOptString, "D"});
                }
            }
            i3++;
        }
        boolean z3 = arrayList3.size() > 1;
        boolean zIsEmpty = arrayList3.isEmpty();
        String strM1 = "E";
        String str = null;
        if (!zIsEmpty) {
            final ArrayList arrayList5 = new ArrayList();
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                arrayList5.add(null);
            }
            CountDownLatch countDownLatch2 = new CountDownLatch(arrayList3.size());
            int i5 = 0;
            while (i5 < arrayList3.size()) {
                final JSONObject jSONObject2 = (JSONObject) arrayList3.get(i5);
                final String strOptString2 = jSONObject2.optString(strM416, "");
                List list = (List) v.get(strOptString2);
                if (list != null) {
                    arrayList5.set(i5, list);
                    countDownLatch2.countDown();
                    i2 = i5;
                    countDownLatch = countDownLatch2;
                } else {
                    i2 = i5;
                    countDownLatch = countDownLatch2;
                    InitOrigin.execute(new Runnable() { // from class: com.github.catvod.spider.FishDrive.3

                        /* JADX INFO: renamed from: short, reason: not valid java name */
                        private static final short[] f40short = {1567, 1538, 1581, 1591, 1580, 1536, 1590, 1581, 1586, 1569, 1561, 1636, 1537, 1577, 1574, 1597, 1636, 1580, 1579, 1577, 1569, 1543, 1579, 1578, 1584, 1569, 1578, 1584, 1662, 1636, 2222, 28989, 30265, 2223};

                        @Override // java.lang.Runnable
                        public void run() {
                            int i6 = i2;
                            List list2 = arrayList5;
                            String str2 = strOptString2;
                            CountDownLatch countDownLatch3 = countDownLatch;
                            String strM301 = "[FishDrive] Emby homeContent: ";
                            try {
                                try {
                                    ArrayList arrayListB = FishDrive.b(FishDrive.this, jSONObject2);
                                    FishDrive.v.put(str2, arrayListB);
                                    list2.set(i6, arrayListB);
                                } catch (Exception e) {
                                    SpiderDebug.log(strM301 + e.getMessage());
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.add(new Object[]{str2, "(离线)", str2, Boolean.FALSE});
                                    list2.set(i6, arrayList6);
                                }
                            } finally {
                                countDownLatch3.countDown();
                            }
                        }
                    });
                }
                i5 = i2 + 1;
                countDownLatch2 = countDownLatch;
            }
            countDownLatch2.await(10L, TimeUnit.SECONDS);
            int i6 = 0;
            while (i6 < arrayList5.size()) {
                List<Object[]> list2 = (List) arrayList5.get(i6);
                if (list2 == null) {
                    String strOptString3 = ((JSONObject) arrayList3.get(i6)).optString(strM416, "");
                    String strI = com.github.catvod.spider.merge.D.b.i(strOptString3, " (超时)");
                    com.github.catvod.spider.merge.D.b.z(strOptString3, strI, str, arrayList2);
                    s.add(new String[]{strOptString3, strI, strM1});
                } else {
                    for (Object[] objArr : list2) {
                        String str2 = (String) objArr[c];
                        String strC = (String) objArr[1];
                        String str3 = (String) objArr[2];
                        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                        if (z3) {
                            strC = com.github.catvod.spider.merge.D.b.C(str3, "·", strC);
                        }
                        arrayList2.add(new com.github.catvod.spider.merge.p001b.b(str2, strC, zBooleanValue ? strM186 : null));
                        if (zBooleanValue) {
                            linkedHashMap.put(str2, objArr.length > 4 ? (List) objArr[4] : G("embyFilters"));
                        }
                        s.add(new String[]{str2, strC, strM1});
                        c = 0;
                    }
                }
                i6++;
                c = 0;
                str = null;
            }
        }
        if (!arrayList3.isEmpty() && (y || z || A || B)) {
            String strM339 = "emby_personal";
            String strM83 = "我的 Emby";
            com.github.catvod.spider.merge.D.b.z(strM339, strM83, null, arrayList2);
            s.add(new String[]{strM339, strM83, strM1});
        }
        ArrayList<String> arrayList6 = t;
        if (!arrayList6.isEmpty() && arrayList2.size() > 1) {
            ArrayList arrayList7 = new ArrayList();
            for (String str4 : arrayList6) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    com.github.catvod.spider.merge.p001b.b bVar = (com.github.catvod.spider.merge.p001b.b) it.next();
                    if (str4.equals(bVar.a())) {
                        arrayList7.add(bVar);
                        it.remove();
                        break;
                    }
                }
            }
            arrayList7.addAll(arrayList2);
            arrayList2 = arrayList7;
        }
        if (!u.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (u.contains(((com.github.catvod.spider.merge.p001b.b) it2.next()).a())) {
                    it2.remove();
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList = new ArrayList();
        } else {
            try {
                try {
                    arrayList = ((com.github.catvod.spider.merge.p001b.g) new Gson().fromJson(categoryContent(((com.github.catvod.spider.merge.p001b.b) arrayList2.get(0)).a(), strM186, false, new HashMap<>()), com.github.catvod.spider.merge.p001b.g.class)).g();
                } catch (Exception unused) {
                    arrayList = new ArrayList();
                }
            } catch (Exception unused2) {
            }
        }
        arrayList2.add(new com.github.catvod.spider.merge.p001b.b("setting", "设置", null));
        w = com.github.catvod.spider.merge.p001b.g.A(arrayList2, arrayList, linkedHashMap);
        return w;
    }

    private /* synthetic */ String $host$5abcbf7c29fbb7fe(final String str, boolean z2, String str2) throws InterruptedException {
        final ArrayList arrayList = new ArrayList();
        if (!"1".equals(str2)) {
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        }
        ArrayList<JSONObject> arrayList2 = new ArrayList();
        for (JSONObject jSONObject : h) {
            if (D(jSONObject) && !C.contains(jSONObject.optString("name", ""))) {
                arrayList2.add(jSONObject);
            }
        }
        if (arrayList2.isEmpty()) {
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        }
        if (arrayList2.size() == 1) {
            try {
                arrayList.addAll(u(str, (JSONObject) arrayList2.get(0)));
            } catch (Exception e) {
                com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[FishDrive] search: "));
            }
            return com.github.catvod.spider.merge.p001b.g.y(arrayList);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(arrayList2.size());
        for (final JSONObject jSONObject2 : arrayList2) {
            InitOrigin.execute(new Runnable() { // from class: com.github.catvod.spider.FishDrive.5

                /* JADX INFO: renamed from: short, reason: not valid java name */
                private static final short[] f41short = {1075, 1070, 1025, 1051, 1024, 1068, 1050, 1025, 1054, 1037, 1077, 1096, 1051, 1037, 1033, 1050, 1035, 1024, 1096, 2248, 2247, 2251, 2243, 662, 652};

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        try {
                            FishDrive fishDrive = FishDrive.this;
                            JSONObject jSONObject3 = jSONObject2;
                            String str3 = str;
                            JSONObject jSONObject4 = FishDrive.f;
                            fishDrive.getClass();
                            ArrayList arrayListU = FishDrive.u(str3, jSONObject3);
                            synchronized (arrayList) {
                                arrayList.addAll(arrayListU);
                            }
                        } catch (Exception e2) {
                            SpiderDebug.log("[FishDrive] search " + jSONObject2.optString("name", "") + ": " + e2.getMessage());
                        }
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        countDownLatch.countDown();
                        throw th;
                    }
                }
            });
        }
        countDownLatch.await(15L, TimeUnit.SECONDS);
        return com.github.catvod.spider.merge.p001b.g.y(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0334  */
    /* JADX WARN: Code duplicated, block: B:69:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0447  */
    /* JADX WARN: Code duplicated, block: B:75:0x0462  */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x03fb, please report this as an issue */
    private /* synthetic */ String $host$62d5eed2b06b9d14(String str, String str2, List<String> list) throws Exception {
        com.github.catvod.spider.merge.p001b.g gVar;
        String strSubstring;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray;
        HashMap map;
        String strOptString;
        String strN;
        String strM70;
        String strI = AbstractC0280n1.i(str, str2, null, null);
        boolean zStartsWith = str2.startsWith("emby:");
        String strM126 = "/";
        if (!zStartsWith) {
            String[] strArrSplit = str2.split("~~~");
            String str3 = strArrSplit[0];
            String strSubstring2 = str3.contains(strM126) ? str3.substring(0, str3.indexOf(strM126)) : str3;
            String strSubstring3 = str3.substring(strSubstring2.length());
            boolean zEqualsIgnoreCase = "iso".equalsIgnoreCase(AbstractC0309x1.g(strSubstring3));
            JSONObject jSONObjectW = w(strSubstring2);
            if (jSONObjectW == null) {
                return new com.github.catvod.spider.merge.p001b.g().r();
            }
            String str4 = C(jSONObjectW) + Uri.encode(strSubstring3, strM126);
            HashMap map2 = new HashMap();
            String strF = f(jSONObjectW);
            if (!strF.isEmpty()) {
                map2.put("Authorization", strF);
            }
            if (x && C0299u0.Z()) {
                String strM175 = "webdav";
                String strX0 = C0299u0.x0(str4, map2, C0299u0.F(strM175), strM175, null);
                if (TextUtils.isEmpty(strX0)) {
                    return com.github.catvod.spider.merge.p001b.g.d("本地代理准备中，请稍后重试");
                }
                gVar = new com.github.catvod.spider.merge.p001b.g();
                gVar.C(strX0);
                gVar.B(B(strArrSplit));
                gVar.b(strI);
            } else {
                com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
                gVar2.C(str4);
                gVar2.h(map2);
                gVar2.B(B(strArrSplit));
                gVar2.b(strI);
                gVar = gVar2;
            }
            if (zEqualsIgnoreCase) {
                gVar.i();
            }
            return gVar.r();
        }
        String[] strArrF = F(str2);
        if (strArrF == null) {
            return com.github.catvod.spider.merge.D.b.f("");
        }
        String str5 = strArrF[0];
        String strSubstring4 = strArrF[1];
        int iIndexOf = strSubstring4.indexOf("::");
        if (iIndexOf >= 0) {
            strSubstring = strSubstring4.substring(iIndexOf + 2);
            strSubstring4 = strSubstring4.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        JSONObject jSONObjectW2 = w(str5);
        if (jSONObjectW2 == null) {
            return com.github.catvod.spider.merge.D.b.f("");
        }
        JSONObject jSONObjectM = m(jSONObjectW2, false);
        String strR = R(jSONObjectW2);
        String strOptString2 = jSONObjectM.optString("AccessToken", "");
        String strV = v(jSONObjectM);
        String strM516 = "UserId";
        String strM177 = "IsPlayback";
        String strM390 = "true";
        HashMap mapT = com.github.catvod.spider.merge.D.b.t(strM516, strV, strM177, strM390);
        String strM83 = "AutoOpenLiveStream";
        mapT.put(strM83, "false");
        String strM499 = "StartTimeTicks";
        mapT.put(strM499, "0");
        String strValueOf = String.valueOf(Integer.MAX_VALUE);
        String strM360 = "MaxStreamingBitrate";
        mapT.put(strM360, strValueOf);
        boolean zIsEmpty = strSubstring.isEmpty();
        String strM277 = "MediaSourceId";
        if (!zIsEmpty) {
            mapT.put(strM277, strSubstring);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(strM516, strV);
        jSONObject.put(strM499, 0);
        jSONObject.put(strM360, Integer.MAX_VALUE);
        jSONObject.put(strM83, false);
        jSONObject.put("EnableDirectPlay", true);
        jSONObject.put("EnableDirectStream", false);
        jSONObject.put("EnableTranscoding", false);
        if (!strSubstring.isEmpty()) {
            jSONObject.put(strM277, strSubstring);
        }
        JSONArray jSONArrayOptJSONArray = new JSONObject(t("POST", l(strR + "/emby/Items/" + strSubstring4 + "/PlaybackInfo", mapT), jSONObject.toString(), strOptString2, jSONObjectW2).a()).optJSONArray("MediaSources");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return com.github.catvod.spider.merge.D.b.f("");
        }
        int length = jSONArrayOptJSONArray.length();
        String strM288 = "Id";
        if (length == 0) {
            jSONObjectOptJSONObject = null;
            break;
        }
        if (!TextUtils.isEmpty(strSubstring)) {
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArrayOptJSONArray.length()) {
                    jSONObjectOptJSONObject = null;
                    break;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject2 != null && strSubstring.equals(jSONObjectOptJSONObject2.optString(strM288))) {
                    jSONObjectOptJSONObject = jSONObjectOptJSONObject2;
                    break;
                }
                i2++;
            }
        } else {
            jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        }
        if (jSONObjectOptJSONObject == null) {
            return com.github.catvod.spider.merge.D.b.f("");
        }
        String strOptString3 = jSONObjectOptJSONObject.optString(strM288, strSubstring);
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("Static", strM390);
        if (!strOptString3.isEmpty()) {
            mapS.put(strM277, strOptString3);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strR);
        String strM408 = "/emby/Videos/";
        sb.append(strM408);
        sb.append(strSubstring4);
        sb.append("/stream");
        String strL = l(sb.toString(), mapS);
        HashMap map3 = new HashMap(p(strOptString2, jSONObjectW2));
        ArrayList arrayList = new ArrayList();
        String strOptString4 = jSONObjectOptJSONObject.optString(strM288, "");
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("MediaStreams");
        if (jSONArrayOptJSONArray2 != null) {
            int i3 = 0;
            while (i3 < jSONArrayOptJSONArray2.length()) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3);
                if (jSONObjectOptJSONObject3 != null) {
                    if ("Subtitle".equals(jSONObjectOptJSONObject3.optString("Type", ""))) {
                        String strOptString5 = jSONObjectOptJSONObject3.optString("Codec", "srt");
                        String strOptString6 = jSONObjectOptJSONObject3.optString("DisplayLanguage", "");
                        String strOptString7 = jSONObjectOptJSONObject3.optString("DisplayTitle", "");
                        jSONArray = jSONArrayOptJSONArray2;
                        map = map3;
                        int iOptInt = jSONObjectOptJSONObject3.optInt("Index", -1);
                        if (iOptInt >= 0) {
                            if (strOptString7.isEmpty()) {
                                if (strOptString6.isEmpty()) {
                                    strOptString6 = "字幕" + (arrayList.size() + 1);
                                }
                                strOptString = jSONObjectOptJSONObject3.optString("DeliveryUrl", "");
                                if (strOptString.isEmpty()) {
                                    strN = strR + strM408 + strSubstring4 + strM126 + strOptString4 + "/Subtitles/" + iOptInt + "/Stream." + strOptString5;
                                } else {
                                    strN = com.github.catvod.spider.merge.D.b.i(strR, strOptString);
                                }
                                if (!strOptString2.isEmpty()) {
                                    StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strN);
                                    strM70 = "?";
                                    if (strN.contains(strM70)) {
                                        strM70 = "&";
                                    }
                                    strN = com.github.catvod.spider.merge.D.b.n(sbO, strM70, "api_key=", strOptString2);
                                }
                                h hVar = new h();
                                hVar.c(strOptString6);
                                hVar.a(strOptString5);
                                hVar.d(strN);
                                arrayList.add(hVar);
                            } else {
                                strOptString6 = strOptString7;
                            }
                            strOptString = jSONObjectOptJSONObject3.optString("DeliveryUrl", "");
                            if (strOptString.isEmpty()) {
                                strN = com.github.catvod.spider.merge.D.b.i(strR, strOptString);
                            } else {
                                strN = strR + strM408 + strSubstring4 + strM126 + strOptString4 + "/Subtitles/" + iOptInt + "/Stream." + strOptString5;
                            }
                            if (!strOptString2.isEmpty()) {
                                StringBuilder sbO2 = com.github.catvod.spider.merge.D.b.o(strN);
                                strM70 = "?";
                                if (strN.contains(strM70)) {
                                    strM70 = "&";
                                }
                                strN = com.github.catvod.spider.merge.D.b.n(sbO2, strM70, "api_key=", strOptString2);
                            }
                            h hVar2 = new h();
                            hVar2.c(strOptString6);
                            hVar2.a(strOptString5);
                            hVar2.d(strN);
                            arrayList.add(hVar2);
                        }
                    } else {
                        jSONArray = jSONArrayOptJSONArray2;
                        map = map3;
                    }
                } else {
                    jSONArray = jSONArrayOptJSONArray2;
                    map = map3;
                }
                i3++;
                jSONArrayOptJSONArray2 = jSONArray;
                map3 = map;
            }
        }
        com.github.catvod.spider.merge.p001b.g gVar3 = new com.github.catvod.spider.merge.p001b.g();
        gVar3.C(strL);
        gVar3.h(map3);
        gVar3.B(arrayList);
        gVar3.b(strI);
        return gVar3.r();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:112:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:186:0x08a8 A[Catch: Exception -> 0x08b1, TryCatch #10 {Exception -> 0x08b1, blocks: (B:184:0x08a0, B:186:0x08a8, B:190:0x08ba, B:192:0x08c0, B:193:0x08c3, B:183:0x088b), top: B:345:0x08a0 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x08c0 A[Catch: Exception -> 0x08b1, TryCatch #10 {Exception -> 0x08b1, blocks: (B:184:0x08a0, B:186:0x08a8, B:190:0x08ba, B:192:0x08c0, B:193:0x08c3, B:183:0x088b), top: B:345:0x08a0 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:198:0x08ec A[Catch: Exception -> 0x09a2, TRY_LEAVE, TryCatch #20 {Exception -> 0x09a2, blocks: (B:196:0x08e6, B:198:0x08ec), top: B:365:0x08e6 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:203:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:206:0x090d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0910 A[Catch: Exception -> 0x099d, TRY_LEAVE, TryCatch #12 {Exception -> 0x099d, blocks: (B:204:0x0903, B:207:0x0910), top: B:349:0x0903 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x0945  */
    /* JADX WARN: Code duplicated, block: B:212:0x0949 A[Catch: Exception -> 0x099a, TRY_LEAVE, TryCatch #15 {Exception -> 0x099a, blocks: (B:209:0x091b, B:212:0x0949), top: B:355:0x091b }] */
    /* JADX WARN: Code duplicated, block: B:217:0x0965 A[Catch: Exception -> 0x096e, TryCatch #0 {Exception -> 0x096e, blocks: (B:215:0x095d, B:217:0x0965, B:220:0x0971, B:222:0x0977, B:223:0x097a, B:214:0x0953), top: B:325:0x095d }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0977 A[Catch: Exception -> 0x096e, TryCatch #0 {Exception -> 0x096e, blocks: (B:215:0x095d, B:217:0x0965, B:220:0x0971, B:222:0x0977, B:223:0x097a, B:214:0x0953), top: B:325:0x095d }] */
    /* JADX WARN: Code duplicated, block: B:234:0x09af  */
    /* JADX WARN: Code duplicated, block: B:255:0x0aa4 A[LOOP:8: B:253:0x0a9e->B:255:0x0aa4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:258:0x0acf  */
    /* JADX WARN: Code duplicated, block: B:261:0x0b08  */
    /* JADX WARN: Code duplicated, block: B:264:0x0b15  */
    /* JADX WARN: Code duplicated, block: B:267:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:270:0x0b34  */
    /* JADX WARN: Code duplicated, block: B:273:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0b45  */
    /* JADX WARN: Code duplicated, block: B:279:0x0b53  */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x04a4, please report this as an issue */
    private /* synthetic */ String $host$6c1ebb3cb60973b4(List<String> list) throws Exception {
        int i2;
        String strSubstring;
        Iterator it;
        String strM292;
        String strM402;
        String string;
        String string2;
        String str;
        StringBuilder sb;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        JSONObject jSONObject;
        String str13;
        JSONArray jSONArray;
        String str14;
        String str15;
        JSONArray jSONArray2;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        JSONArray jSONArray3;
        StringBuilder sb2;
        String str24;
        HashMap map;
        String str25;
        int i3;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArray4;
        String str26;
        String strOptString;
        String strX;
        int iIntValue;
        String string3;
        StringBuilder sb3;
        k kVar;
        StringBuilder sb4;
        String str27;
        String str28;
        JSONArray jSONArray5;
        String str29;
        String str30;
        String str31 = list.get(0);
        String str32 = "";
        if (str31.startsWith("fishdrive_")) {
            AbstractC0302v0.g0(str31, new InterfaceC0245c() { // from class: com.github.catvod.spider.FishDrive.4
                @Override // com.github.catvod.spider.merge.A.InterfaceC0245c
                public String dispatch(String str33) {
                    return FishDrive.this.action(str33);
                }
            });
            return "";
        }
        boolean zStartsWith = str31.startsWith("emby:");
        String strM293 = "$";
        String strM390 = "#";
        if (!zStartsWith) {
            String strM285 = "/";
            if (str31.contains(strM285)) {
                i2 = 0;
                strSubstring = str31.substring(0, str31.indexOf(strM285));
            } else {
                i2 = 0;
                strSubstring = str31;
            }
            String strSubstring2 = str31.substring(i2, str31.lastIndexOf(strM285));
            String str33 = strSubstring2.contains(strM285) ? strSubstring2.substring(strSubstring2.indexOf(strM285)) + strM285 : "";
            String strSubstring3 = strSubstring2.substring(strSubstring2.lastIndexOf(strM285) + 1);
            JSONObject jSONObjectW = w(strSubstring);
            if (jSONObjectW == null) {
                return AbstractC0449a.b();
            }
            List<DavResource> listZ = z(jSONObjectW, str33, this.a);
            ArrayList<DavResource> arrayList = new ArrayList();
            for (DavResource davResource : listZ) {
                if (AbstractC0309x1.d.contains(AbstractC0309x1.g(davResource.getName()).toLowerCase(Locale.ROOT))) {
                    arrayList.add(davResource);
                }
            }
            Collections.sort(listZ, new com.github.catvod.spider.merge.p004e.f("name", 1, "asc"));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = listZ.iterator();
            while (it2.hasNext()) {
                DavResource davResource2 = (DavResource) it2.next();
                if (AbstractC0309x1.i(davResource2.getName())) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(davResource2.getName());
                    sb5.append(strM293);
                    sb5.append(strSubstring);
                    sb5.append(davResource2.getPath());
                    StringBuilder sb6 = new StringBuilder();
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        boolean zHasNext = it3.hasNext();
                        strM292 = "~~~";
                        strM402 = "@@@";
                        if (!zHasNext) {
                            break;
                        }
                        DavResource davResource3 = (DavResource) it3.next();
                        Iterator it4 = it2;
                        if (AbstractC0309x1.l(davResource3.getName()).equals(AbstractC0309x1.l(davResource2.getName()))) {
                            sb6.append(strM292);
                            sb6.append(davResource3.getName());
                            sb6.append(strM402);
                            sb6.append(AbstractC0309x1.g(davResource3.getName()).toLowerCase(Locale.ROOT));
                            sb6.append(strM402);
                            sb6.append(strSubstring + davResource3.getPath());
                        }
                        it2 = it4;
                    }
                    it = it2;
                    if (sb6.length() > 0) {
                        string = sb6.toString();
                    } else {
                        StringBuilder sb7 = new StringBuilder();
                        for (DavResource davResource4 : arrayList) {
                            sb7.append(strM292);
                            sb7.append(davResource4.getName());
                            sb7.append(strM402);
                            sb7.append(AbstractC0309x1.g(davResource4.getName()).toLowerCase(Locale.ROOT));
                            sb7.append(strM402);
                            sb7.append(strSubstring + davResource4.getPath());
                        }
                        string = sb7.toString();
                    }
                    sb5.append(string);
                    arrayList2.add(sb5.toString());
                } else {
                    it = it2;
                }
                it2 = it;
            }
            k kVar2 = new k();
            kVar2.n(strSubstring3);
            kVar2.o(strSubstring3);
            kVar2.q(strSubstring);
            kVar2.p("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAV4AAAFeCAYAAADNK3caAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAAeuSURBVHhe7d1PiF3VAcfxm7QRarRNVwUhunNm1Y24qNR/7UIQOpO261aUdNmCIJQuShJESldCl6NWqmtLkl0XpaCQSiVZFBdvXAgakMlCSoqhVBunL+SIQcjj/Zn7e/fc8/nAMOe+1V0k3/kxizMdAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAVQ6V71V67MnTp8qRBu3tfVROtGhyaedMOVan9vDulyMN2rsivC2bXNyptl+Hy3cAQoQXIEx4AcKEFyBMeAHChBcgTHgBwoQXIEx4AcKEFyBMeAHChBcgTHgBwpq9nWx766Fy6s/u7uVuMv1axubG8W5j+tWn2t9v1u1kmxv3Td/v3vLUj93dD6fv90F5Wszg329z+n739/t+N5w7/1Y5La7m28maDe+rrzxXTv05e+7C9B/WhfK0mBs/GE5s9/vDofb3mxXe7a2HuxNbj5Snfpw9/+bS4Rj6+/14+9Fu60ffL0/9efrkC+W0ONdCAjA34QUIE16AMOEFCBNegDDhBQgTXoAw4QUIE16AMOEFCBNegDDhBQgTXoAw10L2yLWQq3Et5GpcCzlczYaX+s0KL+PnWkgA5ia8AGHCCxAmvABhwgsQJrwAYcILECa8AGHCCxAmvABhwgsQJrwAYcILEFb77WSnynFhT9198XQ5UqmP33c7We1evv7A0v8PJ5d2zpRjdaoO7yr2T97jSsnKXX1XeGt37O02G+RXDQBhwgsQJrwAYcILECa8AGHCCxAmvABhwgsQJrwAYcILECa8AGHCCxAmvABhwgsQJrwAYcILECa8AGHCCxAmvABhwgsQJrwAYcILECa89Oq/jz7TffrgT8sTcIPw0qv9O491//n5H7prv/hj9/m3vlM+hbYJLxH/++4T3Se/+av1C1PCS8z+0W9bvzAlvMRZv7ROeFkL65eWCS9rZf3SIuFl7axfWiO8DIb1SyuEl0GxfmmB8DJI1i9jJrwMlvXLWAkvg2f9MjbCSxWsX8ZEeKmK9csYCC/V+WL9fvL7v3WfH98sn0I9hJdqfXb/g92/X/x79+lPni2fQB2El6rtf+1Id+1nz1u/VEV4GQXrl5oIL6Nh/VIL4WV0rF+GTngZJeuXIRNeRs36ZYiEl9Gzfhka4aUZ1i9DIbw0xfplCISXJlm/rJPw0izrl3URXppn/ZImvDBl/ZIkvHAL65cE4YWvsH7pm/DCbVi/9EV4YQbrlz4IL8zB+uUgCS/MyfrloAgvLMj6ZVXCC0uwflmF8MIKrF+WIbywIuuXRQkvHBDrl3kJLxwg65d5CC/0wPplFuGFnli/3I7wAoQJL/Tk0PXPuqOv/7a769ePd4cvT8qnILzQiyPvvdN989nvdXf8+cXyCXxJeOEAWbnMQ3jhgFi5zEt4YUVWLosSXliBlcsyhBeWYOWyCuGFBVm5rEp4YU5WLgdFeGEOVi4HSXhhBiuXPggv3IaVS1+EF77CyqVvwgu3sHJJEF6YsnJJEl6aZ+WSJrw0y8plXYSXJlm5rJPw0hQrlyEQXpph5TIUwsvoWbkMjfAyalYuQyS8jJKVy5AJL6Nj5TJ0wstoWLnUQngZBSuXmggvVbNyqZHwUq0j7/3DyqVKwkt1Dl37V/eN1341Xbk/sHKpkvBSla//8y/dXb/7YXfHO2+UT6A+wksVvli5R196pjt89Ur5FOokvAyelcvYCC+DZeUyVsLLIFm5jJnwMihWLi0QXgbDyqUVwsvaWbm0RnhZKyuXFgkva2Hl0jLhJc7KpXXCS4yVCzcJLxFWLnxJeOnV4enKvfNPv7Ry4RaHyvfm7J+8Z78cqdTVdz8qJ2p17O02G2TxAoQJL0CY8AKECS9AmPAChAkvQJjwAoQJL0CY8AKECS9AmPAChAkvQJjwAoQJL0CY8AKECS9AmPAChAkvQJjwAoQJL0CY8AKECS9AWNV/WvmxJ0+fKseFPXX3xdPlSKU+ft+fd6/dy9cfWPr/4eTSzplyrE7t4d0vRxq0d0V4Wza5uFNtv/yqASBMeAHChBcgTHgBwoQXIEx4AcKEFyBMeAHChBcgTHgBwoQXIEx4AcKEFyCs2dvJtrceKqf+7O5e7ibTr2VsbhzvNqZffar9/WbdTra5cd/0/e4tT/3Y3f1w+n4flKfFeL+bzp1/q5wWV/PtZM2G99VXniun/pw9d2H6D+tCeVrMjR8MJ7b7/eFQ+/vNCu/21sPdia1HylM/zp5/c+lweL+bnj75QjktzrWQAMxNeAHChBcgTHgBwoQXIEx4AcKEFyBMeAHChBcgTHgBwoQXIEx4AcKEFyDMtZA9ci3kalwLuRrXQg5Xs+GlfrPCy/i5FhKAuQkvQJjwAoQJL0CY8AKECS9AmPAChAkvQJjwAoQJL0CY8AKECS9AmPAChNV+O9mpcqRBe3tuJ2vZ5NLOmXIEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACgR133fxM7Bfx4WlpeAAAAAElFTkSuQmCC");
            String strJoin = TextUtils.join(strM390, arrayList2);
            kVar2.r(strJoin);
            AbstractC0280n1.p(strSubstring3);
            AbstractC0280n1.q(strJoin);
            boolean z2 = FishCrypto.a;
            N1.d(kVar2);
            return com.github.catvod.spider.merge.p001b.g.s(kVar2);
        }
        String[] strArrF = F(str31);
        if (strArrF == null) {
            return AbstractC0449a.b();
        }
        String str34 = strArrF[0];
        String str35 = strArrF[1];
        JSONObject jSONObjectW2 = w(str34);
        if (jSONObjectW2 == null) {
            return AbstractC0449a.b();
        }
        JSONObject jSONObjectM = m(jSONObjectW2, false);
        String strR = R(jSONObjectW2);
        String strV = v(jSONObjectM);
        String strOptString2 = jSONObjectM.optString("AccessToken", "");
        String strM54 = "Overview,Genres,People,Studios,CommunityRating,OfficialRating,ProductionYear,DateCreated,MediaSources,MediaStreams";
        String strM503 = "Fields";
        HashMap mapS = com.github.catvod.spider.merge.D.b.s(strM503, strM54);
        StringBuilder sb8 = new StringBuilder();
        sb8.append(strR);
        String strM414 = "/emby/Users/";
        sb8.append(strM414);
        sb8.append(strV);
        String strM379 = "/Items/";
        sb8.append(strM379);
        sb8.append(str35);
        JSONObject jSONObject2 = new JSONObject(o(sb8.toString(), strOptString2, mapS, jSONObjectW2));
        String strM403 = "Name";
        String strOptString3 = jSONObject2.optString(strM403, "");
        String strOptString4 = jSONObject2.optString("Overview", "");
        String strM415 = " ";
        String str36 = strM379;
        String strM427 = " ";
        String strReplace = strOptString4.replace(strM415, strM427);
        String strY = y(jSONObject2);
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("Genres");
        String strM408 = " / ";
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            string2 = "";
        } else {
            StringBuilder sb9 = new StringBuilder();
            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                if (i4 > 0) {
                    sb9.append(strM408);
                }
                sb9.append(jSONArrayOptJSONArray.optString(i4, ""));
            }
            string2 = sb9.toString();
        }
        String strOptString5 = jSONObject2.optString("ProductionYear", "");
        String str37 = string2;
        double dOptDouble = jSONObject2.optDouble("CommunityRating", 0.0d);
        String str38 = dOptDouble > 0.0d ? String.format("%.1f", Double.valueOf(dOptDouble)) : "";
        String strOptString6 = jSONObject2.optString("OfficialRating", "");
        StringBuilder sb10 = new StringBuilder();
        StringBuilder sb11 = new StringBuilder();
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("People");
        String str39 = str38;
        if (jSONArrayOptJSONArray2 != null) {
            int i5 = 0;
            while (i5 < jSONArrayOptJSONArray2.length()) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i5);
                if (jSONObjectOptJSONObject2 == null) {
                    jSONArray5 = jSONArrayOptJSONArray2;
                    str30 = strM293;
                    str29 = str34;
                } else {
                    jSONArray5 = jSONArrayOptJSONArray2;
                    String strOptString7 = jSONObjectOptJSONObject2.optString(strM403, "");
                    str29 = str34;
                    String strOptString8 = jSONObjectOptJSONObject2.optString("Type", "");
                    str30 = strM293;
                    String strOptString9 = jSONObjectOptJSONObject2.optString("Role", "");
                    if ("Actor".equals(strOptString8) && !strOptString7.isEmpty()) {
                        if (sb10.length() > 0) {
                            sb10.append(strM408);
                        }
                        sb10.append(strOptString7);
                        if (!strOptString9.isEmpty()) {
                            sb10.append("(");
                            sb10.append(strOptString9);
                            sb10.append(")");
                        }
                    } else if ("Director".equals(strOptString8) && !strOptString7.isEmpty()) {
                        if (sb11.length() > 0) {
                            sb11.append(strM408);
                        }
                        sb11.append(strOptString7);
                    }
                }
                i5++;
                jSONArrayOptJSONArray2 = jSONArray5;
                str34 = str29;
                strM293 = str30;
            }
            str = strM293;
        } else {
            str = strM293;
        }
        String str40 = str34;
        StringBuilder sb12 = new StringBuilder();
        JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("Studios");
        if (jSONArrayOptJSONArray3 != null) {
            for (int i6 = 0; i6 < jSONArrayOptJSONArray3.length(); i6++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray3.optJSONObject(i6);
                if (jSONObjectOptJSONObject3 != null) {
                    String strOptString10 = jSONObjectOptJSONObject3.optString(strM403, "");
                    if (!strOptString10.isEmpty()) {
                        if (sb12.length() > 0) {
                            sb12.append(strM408);
                        }
                        sb12.append(strOptString10);
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean zOptBoolean = jSONObject2.optBoolean("IsFolder", false);
        String strM286 = "-";
        String strM409 = "|";
        String strM459 = "Emby";
        String strM432 = "版本";
        String str41 = strM403;
        String strM223 = "Id";
        if (zOptBoolean) {
            sb = sb10;
            String str42 = strR;
            str2 = strReplace;
            String str43 = r7;
            String str44 = str;
            String strM199 = "服务器默认";
            String strM102 = ": ";
            String str45 = strM427;
            String strM404 = "Items";
            String str46 = strM432;
            String strM511 = "/Items";
            String str47 = str40;
            String strM75 = "false";
            String str48 = strM199;
            String strM108 = "Recursive";
            String str49 = strM102;
            String strM454 = "IncludeItemTypes";
            String str50 = strOptString3;
            String strM186 = "ParentId";
            String str51 = strM409;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            try {
                HashMap map2 = new HashMap();
                map2.put(strM186, str35);
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                try {
                    map2.put(strM454, "Season");
                    map2.put(strM108, strM75);
                    str4 = str35;
                    try {
                        map2.put(strM503, "Name,Id,IndexNumber");
                        StringBuilder sb13 = new StringBuilder();
                        String str52 = strM503;
                        try {
                            sb13.append(str42);
                            str42 = str42;
                            String str53 = strM414;
                            sb13.append(str53);
                            sb13.append(strV);
                            sb13.append(strM511);
                            String str54 = strM511;
                            String str55 = strOptString2;
                            JSONArray jSONArrayOptJSONArray4 = new JSONObject(o(sb13.toString(), str55, map2, jSONObjectW2)).optJSONArray(strM404);
                            if (jSONArrayOptJSONArray4 != null) {
                                String str56 = strM404;
                                int i7 = 0;
                                while (i7 < jSONArrayOptJSONArray4.length()) {
                                    JSONObject jSONObject3 = jSONArrayOptJSONArray4.getJSONObject(i7);
                                    JSONArray jSONArray6 = jSONArrayOptJSONArray4;
                                    String strOptString11 = jSONObject3.optString(strM223, str32);
                                    String str57 = strM223;
                                    String str58 = str41;
                                    String strOptString12 = jSONObject3.optString(str58, str32);
                                    boolean zIsEmpty = strOptString12.isEmpty();
                                    String str59 = str58;
                                    String strM445 = "IndexNumber";
                                    String str60 = str32;
                                    String strM539 = "第";
                                    if (zIsEmpty) {
                                        try {
                                            strOptString12 = strM539 + jSONObject3.optInt(strM445, i7 + 1) + "季";
                                        } catch (Exception e) {
                                            e = e;
                                            strM427 = str45;
                                            str5 = str42;
                                            str6 = str49;
                                            str7 = str50;
                                            linkedHashMap = linkedHashMap3;
                                            str3 = str60;
                                            str35 = str4;
                                            com.github.catvod.spider.merge.D.b.D(e, com.github.catvod.spider.merge.D.b.q("[FishDrive] Emby series details ", str35, str6));
                                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                arrayList3.add((String) entry.getKey());
                                                arrayList4.add(((StringBuilder) entry.getValue()).toString());
                                            }
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList3;
                                            if (arrayList4.isEmpty()) {
                                                arrayList3.add(strM459);
                                                arrayList4.add(str3);
                                            }
                                            kVar = new k();
                                            kVar.n(str31);
                                            String str61 = str7;
                                            kVar.o(str61);
                                            kVar.p(i(str5, str35, strY));
                                            kVar.l(str2);
                                            kVar.i(str37);
                                            kVar.u(strOptString5);
                                            if (sb.length() > 0) {
                                                kVar.j(sb.toString());
                                            }
                                            if (sb11.length() > 0) {
                                                kVar.m(sb11.toString());
                                            }
                                            if (sb12.length() > 0) {
                                                kVar.k(sb12.toString());
                                            }
                                            sb4 = new StringBuilder();
                                            if (!str39.isEmpty()) {
                                                sb4.append(str39);
                                            }
                                            if (!strOptString6.isEmpty()) {
                                                if (sb4.length() > 0) {
                                                    sb4.append(strM427);
                                                }
                                                sb4.append(strOptString6);
                                            }
                                            if (sb4.length() > 0) {
                                                kVar.s(sb4.toString());
                                            }
                                            String strM358 = "$$$";
                                            kVar.q(TextUtils.join(strM358, arrayList3));
                                            String strJoin2 = TextUtils.join(strM358, arrayList4);
                                            kVar.r(strJoin2);
                                            AbstractC0280n1.p(str61);
                                            AbstractC0280n1.q(strJoin2);
                                            boolean z3 = FishCrypto.a;
                                            N1.d(kVar);
                                            return com.github.catvod.spider.merge.p001b.g.s(kVar);
                                        }
                                    }
                                    String str62 = str51;
                                    String strReplace2 = strOptString12.replace(str43, strM286).replace(str44, str62);
                                    HashMap map3 = new HashMap();
                                    map3.put(strM186, strOptString11);
                                    map3.put(strM454, "Episode");
                                    map3.put(strM108, strM75);
                                    String str63 = strM75;
                                    String str64 = str52;
                                    map3.put(str64, "Name,Id,IndexNumber,MediaSources,MediaStreams");
                                    StringBuilder sb14 = new StringBuilder();
                                    String str65 = strM454;
                                    String str66 = str42;
                                    try {
                                        sb14.append(str66);
                                        sb14.append(str53);
                                        sb14.append(strV);
                                        String str67 = strM108;
                                        String str68 = str54;
                                        sb14.append(str68);
                                        str54 = str68;
                                        String str69 = str55;
                                        int i8 = i7;
                                        String str70 = str56;
                                        JSONArray jSONArrayOptJSONArray5 = new JSONObject(o(sb14.toString(), str69, map3, jSONObjectW2)).optJSONArray(str70);
                                        str56 = str70;
                                        if (jSONArrayOptJSONArray5 != null) {
                                            int i9 = 0;
                                            while (i9 < jSONArrayOptJSONArray5.length()) {
                                                JSONObject jSONObject4 = jSONArrayOptJSONArray5.getJSONObject(i9);
                                                String str71 = strReplace2;
                                                String str72 = str60;
                                                JSONArray jSONArray7 = jSONArrayOptJSONArray5;
                                                String str73 = str57;
                                                String str74 = strM186;
                                                try {
                                                    String strOptString13 = jSONObject4.optString(str73, str72);
                                                    String str75 = str59;
                                                    String strOptString14 = jSONObject4.optString(str75, str72);
                                                    if (strOptString14.isEmpty()) {
                                                        StringBuilder sb15 = new StringBuilder();
                                                        str3 = str72;
                                                        String str76 = strM539;
                                                        try {
                                                            sb15.append(str76);
                                                            strM539 = str76;
                                                            sb15.append(jSONObject4.optInt(strM445, i9 + 1));
                                                            sb15.append("集");
                                                            strOptString14 = sb15.toString();
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            str5 = str66;
                                                            strM427 = str45;
                                                            str6 = str49;
                                                            str7 = str50;
                                                            linkedHashMap = linkedHashMap3;
                                                            str35 = str4;
                                                            com.github.catvod.spider.merge.D.b.D(e, com.github.catvod.spider.merge.D.b.q("[FishDrive] Emby series details ", str35, str6));
                                                            while (r0.hasNext()) {
                                                                arrayList3.add((String) entry.getKey());
                                                                arrayList4.add(((StringBuilder) entry.getValue()).toString());
                                                            }
                                                            arrayList4 = arrayList4;
                                                            arrayList3 = arrayList3;
                                                            if (arrayList4.isEmpty()) {
                                                                arrayList3.add(strM459);
                                                                arrayList4.add(str3);
                                                            }
                                                            kVar = new k();
                                                            kVar.n(str31);
                                                            String str610 = str7;
                                                            kVar.o(str610);
                                                            kVar.p(i(str5, str35, strY));
                                                            kVar.l(str2);
                                                            kVar.i(str37);
                                                            kVar.u(strOptString5);
                                                            if (sb.length() > 0) {
                                                                kVar.j(sb.toString());
                                                            }
                                                            if (sb11.length() > 0) {
                                                                kVar.m(sb11.toString());
                                                            }
                                                            if (sb12.length() > 0) {
                                                                kVar.k(sb12.toString());
                                                            }
                                                            sb4 = new StringBuilder();
                                                            if (!str39.isEmpty()) {
                                                                sb4.append(str39);
                                                            }
                                                            if (!strOptString6.isEmpty()) {
                                                                if (sb4.length() > 0) {
                                                                    sb4.append(strM427);
                                                                }
                                                                sb4.append(strOptString6);
                                                            }
                                                            if (sb4.length() > 0) {
                                                                kVar.s(sb4.toString());
                                                            }
                                                            String strM359 = "$$$";
                                                            kVar.q(TextUtils.join(strM359, arrayList3));
                                                            String strJoin3 = TextUtils.join(strM359, arrayList4);
                                                            kVar.r(strJoin3);
                                                            AbstractC0280n1.p(str610);
                                                            AbstractC0280n1.q(strJoin3);
                                                            boolean z4 = FishCrypto.a;
                                                            N1.d(kVar);
                                                            return com.github.catvod.spider.merge.p001b.g.s(kVar);
                                                        }
                                                    } else {
                                                        str3 = str72;
                                                    }
                                                    String strReplace3 = strOptString14.replace(str43, strM286).replace(str44, str62);
                                                    JSONArray jSONArrayOptJSONArray6 = jSONObject4.optJSONArray("MediaSources");
                                                    try {
                                                        HashMap map4 = new HashMap();
                                                        map4.put(str64, "MediaSources,MediaStreams");
                                                        str8 = strM445;
                                                        try {
                                                            StringBuilder sb16 = new StringBuilder();
                                                            sb16.append(str66);
                                                            sb16.append(str53);
                                                            sb16.append(strV);
                                                            String str77 = str64;
                                                            String str78 = str36;
                                                            try {
                                                                sb16.append(str78);
                                                                sb16.append(strOptString13);
                                                                JSONObject jSONObject5 = new JSONObject(o(sb16.toString(), str69, map4, jSONObjectW2));
                                                                str9 = str62;
                                                                linkedHashMap = linkedHashMap3;
                                                                jSONArray2 = jSONArray6;
                                                                jSONArray = jSONArray7;
                                                                str16 = strOptString13;
                                                                str15 = str78;
                                                                str18 = str50;
                                                                str17 = str77;
                                                                str19 = strM286;
                                                                str20 = str73;
                                                                str21 = str74;
                                                                str22 = str75;
                                                                str13 = str53;
                                                                str14 = str43;
                                                                String str79 = strV;
                                                                str11 = strV;
                                                                String str80 = str69;
                                                                str10 = str69;
                                                                str12 = str44;
                                                                jSONObject = jSONObjectW2;
                                                                try {
                                                                    JSONArray jSONArrayE = E(jSONObject5, str66, str79, str80, str16, jSONObjectW2);
                                                                    if (jSONArrayE != null && jSONArrayE.length() > 0) {
                                                                        jSONArrayOptJSONArray6 = jSONArrayE;
                                                                    }
                                                                    str6 = str49;
                                                                    str23 = str16;
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    try {
                                                                        StringBuilder sb17 = new StringBuilder();
                                                                        sb17.append("[FishDrive] Emby episode sources ");
                                                                        str23 = str16;
                                                                        sb17.append(str23);
                                                                        str6 = str49;
                                                                        sb17.append(str6);
                                                                        sb17.append(e.getMessage());
                                                                        SpiderDebug.log(sb17.toString());
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                        str5 = str66;
                                                                        str6 = str49;
                                                                        str7 = str18;
                                                                        strM427 = str45;
                                                                        str35 = str4;
                                                                        com.github.catvod.spider.merge.D.b.D(e, com.github.catvod.spider.merge.D.b.q("[FishDrive] Emby series details ", str35, str6));
                                                                        while (r0.hasNext()) {
                                                                            arrayList3.add((String) entry.getKey());
                                                                            arrayList4.add(((StringBuilder) entry.getValue()).toString());
                                                                        }
                                                                        arrayList4 = arrayList4;
                                                                        arrayList3 = arrayList3;
                                                                        if (arrayList4.isEmpty()) {
                                                                            arrayList3.add(strM459);
                                                                            arrayList4.add(str3);
                                                                        }
                                                                        kVar = new k();
                                                                        kVar.n(str31);
                                                                        String str611 = str7;
                                                                        kVar.o(str611);
                                                                        kVar.p(i(str5, str35, strY));
                                                                        kVar.l(str2);
                                                                        kVar.i(str37);
                                                                        kVar.u(strOptString5);
                                                                        if (sb.length() > 0) {
                                                                            kVar.j(sb.toString());
                                                                        }
                                                                        if (sb11.length() > 0) {
                                                                            kVar.m(sb11.toString());
                                                                        }
                                                                        if (sb12.length() > 0) {
                                                                            kVar.k(sb12.toString());
                                                                        }
                                                                        sb4 = new StringBuilder();
                                                                        if (!str39.isEmpty()) {
                                                                            sb4.append(str39);
                                                                        }
                                                                        if (!strOptString6.isEmpty()) {
                                                                            if (sb4.length() > 0) {
                                                                                sb4.append(strM427);
                                                                            }
                                                                            sb4.append(strOptString6);
                                                                        }
                                                                        if (sb4.length() > 0) {
                                                                            kVar.s(sb4.toString());
                                                                        }
                                                                        String strM3510 = "$$$";
                                                                        kVar.q(TextUtils.join(strM3510, arrayList3));
                                                                        String strJoin4 = TextUtils.join(strM3510, arrayList4);
                                                                        kVar.r(strJoin4);
                                                                        AbstractC0280n1.p(str611);
                                                                        AbstractC0280n1.q(strJoin4);
                                                                        boolean z5 = FishCrypto.a;
                                                                        N1.d(kVar);
                                                                        return com.github.catvod.spider.merge.p001b.g.s(kVar);
                                                                    }
                                                                }
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                str9 = str62;
                                                                str10 = str69;
                                                                str11 = strV;
                                                                str12 = str44;
                                                                jSONObject = jSONObjectW2;
                                                                linkedHashMap = linkedHashMap3;
                                                                jSONArray2 = jSONArray6;
                                                                jSONArray = jSONArray7;
                                                                str15 = str78;
                                                                str16 = strOptString13;
                                                                str18 = str50;
                                                                str17 = str77;
                                                                str13 = str53;
                                                                str14 = str43;
                                                                str19 = strM286;
                                                                str20 = str73;
                                                                str21 = str74;
                                                                str22 = str75;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            str9 = str62;
                                                            str10 = str69;
                                                            str11 = strV;
                                                            str12 = str44;
                                                            jSONObject = jSONObjectW2;
                                                            str13 = str53;
                                                            linkedHashMap = linkedHashMap3;
                                                            jSONArray = jSONArray7;
                                                            str14 = str43;
                                                            str15 = str36;
                                                            jSONArray2 = jSONArray6;
                                                            str16 = strOptString13;
                                                            String str81 = str50;
                                                            str17 = str64;
                                                            str18 = str81;
                                                            str19 = strM286;
                                                            str20 = str73;
                                                            str21 = str74;
                                                            str22 = str75;
                                                            StringBuilder sb18 = new StringBuilder();
                                                            sb18.append("[FishDrive] Emby episode sources ");
                                                            str23 = str16;
                                                            sb18.append(str23);
                                                            str6 = str49;
                                                            sb18.append(str6);
                                                            sb18.append(e.getMessage());
                                                            SpiderDebug.log(sb18.toString());
                                                            jSONArray3 = jSONArrayOptJSONArray6;
                                                            sb2 = (StringBuilder) linkedHashMap.get(str48);
                                                            if (sb2 == null) {
                                                                sb2 = new StringBuilder();
                                                                linkedHashMap.put(str48, sb2);
                                                            }
                                                            if (sb2.length() > 0) {
                                                                sb2.append(str14);
                                                            }
                                                            sb2.append(str71);
                                                            sb2.append(str9);
                                                            sb2.append(strReplace3);
                                                            sb2.append(str12);
                                                            str48 = str48;
                                                            str24 = str47;
                                                            sb2.append(j(str24, str23));
                                                            map = new HashMap();
                                                            if (jSONArray3 != null) {
                                                                str5 = str66;
                                                                i3 = 0;
                                                                while (i3 < jSONArray3.length()) {
                                                                    try {
                                                                        jSONObjectOptJSONObject = jSONArray3.optJSONObject(i3);
                                                                        if (jSONObjectOptJSONObject == null) {
                                                                            jSONArray4 = jSONArray3;
                                                                            str7 = str18;
                                                                        } else {
                                                                            jSONArray4 = jSONArray3;
                                                                            str7 = str18;
                                                                            str26 = str3;
                                                                            try {
                                                                                strOptString = jSONObjectOptJSONObject.optString(str20, str26);
                                                                                if (strOptString.isEmpty()) {
                                                                                    str3 = str26;
                                                                                } else {
                                                                                    StringBuilder sb19 = new StringBuilder();
                                                                                    str3 = str26;
                                                                                    String str82 = str46;
                                                                                    try {
                                                                                        sb19.append(str82);
                                                                                        str46 = str82;
                                                                                        sb19.append(i3 + 1);
                                                                                        strX = x(sb19.toString(), jSONObjectOptJSONObject);
                                                                                        iIntValue = ((Integer) map.getOrDefault(strX, 0)).intValue() + 1;
                                                                                        map.put(strX, Integer.valueOf(iIntValue));
                                                                                        if (iIntValue == 1) {
                                                                                            string3 = strX;
                                                                                            strM427 = str45;
                                                                                        } else {
                                                                                            StringBuilder sb20 = new StringBuilder();
                                                                                            sb20.append(strX);
                                                                                            strM427 = str45;
                                                                                            sb20.append(strM427);
                                                                                            sb20.append(iIntValue);
                                                                                            string3 = sb20.toString();
                                                                                        }
                                                                                        try {
                                                                                            sb3 = (StringBuilder) linkedHashMap.get(string3);
                                                                                            if (sb3 == null) {
                                                                                                sb3 = new StringBuilder();
                                                                                                linkedHashMap.put(string3, sb3);
                                                                                            }
                                                                                            if (sb3.length() > 0) {
                                                                                                sb3.append(str14);
                                                                                            }
                                                                                            sb3.append(str71);
                                                                                            sb3.append(str9);
                                                                                            sb3.append(strReplace3);
                                                                                            sb3.append(str12);
                                                                                            sb3.append(k(str24, str23, strOptString));
                                                                                        } catch (Exception e7) {
                                                                                            e = e7;
                                                                                            str35 = str4;
                                                                                            com.github.catvod.spider.merge.D.b.D(e, com.github.catvod.spider.merge.D.b.q("[FishDrive] Emby series details ", str35, str6));
                                                                                            while (r0.hasNext()) {
                                                                                                arrayList3.add((String) entry.getKey());
                                                                                                arrayList4.add(((StringBuilder) entry.getValue()).toString());
                                                                                            }
                                                                                            arrayList4 = arrayList4;
                                                                                            arrayList3 = arrayList3;
                                                                                            if (arrayList4.isEmpty()) {
                                                                                                arrayList3.add(strM459);
                                                                                                arrayList4.add(str3);
                                                                                            }
                                                                                            kVar = new k();
                                                                                            kVar.n(str31);
                                                                                            String str612 = str7;
                                                                                            kVar.o(str612);
                                                                                            kVar.p(i(str5, str35, strY));
                                                                                            kVar.l(str2);
                                                                                            kVar.i(str37);
                                                                                            kVar.u(strOptString5);
                                                                                            if (sb.length() > 0) {
                                                                                                kVar.j(sb.toString());
                                                                                            }
                                                                                            if (sb11.length() > 0) {
                                                                                                kVar.m(sb11.toString());
                                                                                            }
                                                                                            if (sb12.length() > 0) {
                                                                                                kVar.k(sb12.toString());
                                                                                            }
                                                                                            sb4 = new StringBuilder();
                                                                                            if (!str39.isEmpty()) {
                                                                                                sb4.append(str39);
                                                                                            }
                                                                                            if (!strOptString6.isEmpty()) {
                                                                                                if (sb4.length() > 0) {
                                                                                                    sb4.append(strM427);
                                                                                                }
                                                                                                sb4.append(strOptString6);
                                                                                            }
                                                                                            if (sb4.length() > 0) {
                                                                                                kVar.s(sb4.toString());
                                                                                            }
                                                                                            String strM3511 = "$$$";
                                                                                            kVar.q(TextUtils.join(strM3511, arrayList3));
                                                                                            String strJoin5 = TextUtils.join(strM3511, arrayList4);
                                                                                            kVar.r(strJoin5);
                                                                                            AbstractC0280n1.p(str612);
                                                                                            AbstractC0280n1.q(strJoin5);
                                                                                            boolean z6 = FishCrypto.a;
                                                                                            N1.d(kVar);
                                                                                            return com.github.catvod.spider.merge.p001b.g.s(kVar);
                                                                                        }
                                                                                    } catch (Exception e8) {
                                                                                        e = e8;
                                                                                        strM427 = str45;
                                                                                        str35 = str4;
                                                                                        com.github.catvod.spider.merge.D.b.D(e, com.github.catvod.spider.merge.D.b.q("[FishDrive] Emby series details ", str35, str6));
                                                                                        while (r0.hasNext()) {
                                                                                            arrayList3.add((String) entry.getKey());
                                                                                            arrayList4.add(((StringBuilder) entry.getValue()).toString());
                                                                                        }
                                                                                        arrayList4 = arrayList4;
                                                                                        arrayList3 = arrayList3;
                                                                                        if (arrayList4.isEmpty()) {
                                                                                            arrayList3.add(strM459);
                                                                                            arrayList4.add(str3);
                                                                                        }
                                                                                        kVar = new k();
                                                                                        kVar.n(str31);
                                                                                        String str613 = str7;
                                                                                        kVar.o(str613);
                                                                                        kVar.p(i(str5, str35, strY));
                                                                                        kVar.l(str2);
                                                                                        kVar.i(str37);
                                                                                        kVar.u(strOptString5);
                                                                                        if (sb.length() > 0) {
                                                                                            kVar.j(sb.toString());
                                                                                        }
                                                                                        if (sb11.length() > 0) {
                                                                                            kVar.m(sb11.toString());
                                                                                        }
                                                                                        if (sb12.length() > 0) {
                                                                                            kVar.k(sb12.toString());
                                                                                        }
                                                                                        sb4 = new StringBuilder();
                                                                                        if (!str39.isEmpty()) {
                                                                                            sb4.append(str39);
                                                                                        }
                                                                                        if (!strOptString6.isEmpty()) {
                                                                                            if (sb4.length() > 0) {
                                                                                                sb4.append(strM427);
                                                                                            }
                                                                                            sb4.append(strOptString6);
                                                                                        }
                                                                                        if (sb4.length() > 0) {
                                                                                            kVar.s(sb4.toString());
                                                                                        }
                                                                                        String strM3512 = "$$$";
                                                                                        kVar.q(TextUtils.join(strM3512, arrayList3));
                                                                                        String strJoin6 = TextUtils.join(strM3512, arrayList4);
                                                                                        kVar.r(strJoin6);
                                                                                        AbstractC0280n1.p(str613);
                                                                                        AbstractC0280n1.q(strJoin6);
                                                                                        boolean z7 = FishCrypto.a;
                                                                                        N1.d(kVar);
                                                                                        return com.github.catvod.spider.merge.p001b.g.s(kVar);
                                                                                    }
                                                                                }
                                                                                i3++;
                                                                                str45 = strM427;
                                                                                str18 = str7;
                                                                                jSONArray3 = jSONArray4;
                                                                                str20 = str20;
                                                                            } catch (Exception e9) {
                                                                                e = e9;
                                                                                str3 = str26;
                                                                            }
                                                                        }
                                                                        strM427 = str45;
                                                                        i3++;
                                                                        str45 = strM427;
                                                                        str18 = str7;
                                                                        jSONArray3 = jSONArray4;
                                                                        str20 = str20;
                                                                    } catch (Exception e10) {
                                                                        e = e10;
                                                                        str7 = str18;
                                                                        strM427 = str45;
                                                                        str35 = str4;
                                                                        com.github.catvod.spider.merge.D.b.D(e, com.github.catvod.spider.merge.D.b.q("[FishDrive] Emby series details ", str35, str6));
                                                                        while (r0.hasNext()) {
                                                                            arrayList3.add((String) entry.getKey());
                                                                            arrayList4.add(((StringBuilder) entry.getValue()).toString());
                                                                        }
                                                                        arrayList4 = arrayList4;
                                                                        arrayList3 = arrayList3;
                                                                        if (arrayList4.isEmpty()) {
                                                                            arrayList3.add(strM459);
                                                                            arrayList4.add(str3);
                                                                        }
                                                                        kVar = new k();
                                                                        kVar.n(str31);
                                                                        String str614 = str7;
                                                                        kVar.o(str614);
                                                                        kVar.p(i(str5, str35, strY));
                                                                        kVar.l(str2);
                                                                        kVar.i(str37);
                                                                        kVar.u(strOptString5);
                                                                        if (sb.length() > 0) {
                                                                            kVar.j(sb.toString());
                                                                        }
                                                                        if (sb11.length() > 0) {
                                                                            kVar.m(sb11.toString());
                                                                        }
                                                                        if (sb12.length() > 0) {
                                                                            kVar.k(sb12.toString());
                                                                        }
                                                                        sb4 = new StringBuilder();
                                                                        if (!str39.isEmpty()) {
                                                                            sb4.append(str39);
                                                                        }
                                                                        if (!strOptString6.isEmpty()) {
                                                                            if (sb4.length() > 0) {
                                                                                sb4.append(strM427);
                                                                            }
                                                                            sb4.append(strOptString6);
                                                                        }
                                                                        if (sb4.length() > 0) {
                                                                            kVar.s(sb4.toString());
                                                                        }
                                                                        String strM3513 = "$$$";
                                                                        kVar.q(TextUtils.join(strM3513, arrayList3));
                                                                        String strJoin7 = TextUtils.join(strM3513, arrayList4);
                                                                        kVar.r(strJoin7);
                                                                        AbstractC0280n1.p(str614);
                                                                        AbstractC0280n1.q(strJoin7);
                                                                        boolean z8 = FishCrypto.a;
                                                                        N1.d(kVar);
                                                                        return com.github.catvod.spider.merge.p001b.g.s(kVar);
                                                                    }
                                                                }
                                                                str25 = str18;
                                                            } else {
                                                                str25 = str18;
                                                                str5 = str66;
                                                            }
                                                            i9++;
                                                            str45 = str45;
                                                            strReplace2 = str71;
                                                            jSONArray6 = jSONArray2;
                                                            str66 = str5;
                                                            str64 = str17;
                                                            jSONArrayOptJSONArray5 = jSONArray;
                                                            str59 = str22;
                                                            str57 = str20;
                                                            str36 = str15;
                                                            strM286 = str19;
                                                            strM186 = str21;
                                                            str60 = str3;
                                                            strV = str11;
                                                            linkedHashMap3 = linkedHashMap;
                                                            str44 = str12;
                                                            str47 = str24;
                                                            str50 = str25;
                                                            str69 = str10;
                                                            jSONObjectW2 = jSONObject;
                                                            str62 = str9;
                                                            str49 = str6;
                                                            str43 = str14;
                                                            strM445 = str8;
                                                            str53 = str13;
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        str8 = strM445;
                                                    }
                                                    jSONArray3 = jSONArrayOptJSONArray6;
                                                    try {
                                                        sb2 = (StringBuilder) linkedHashMap.get(str48);
                                                        if (sb2 == null) {
                                                            sb2 = new StringBuilder();
                                                            linkedHashMap.put(str48, sb2);
                                                        }
                                                        if (sb2.length() > 0) {
                                                            sb2.append(str14);
                                                        }
                                                        sb2.append(str71);
                                                        sb2.append(str9);
                                                        sb2.append(strReplace3);
                                                        sb2.append(str12);
                                                        str48 = str48;
                                                        str24 = str47;
                                                        sb2.append(j(str24, str23));
                                                        map = new HashMap();
                                                        if (jSONArray3 != null) {
                                                            str5 = str66;
                                                            i3 = 0;
                                                            while (i3 < jSONArray3.length()) {
                                                                jSONObjectOptJSONObject = jSONArray3.optJSONObject(i3);
                                                                if (jSONObjectOptJSONObject == null) {
                                                                    jSONArray4 = jSONArray3;
                                                                    str7 = str18;
                                                                } else {
                                                                    jSONArray4 = jSONArray3;
                                                                    str7 = str18;
                                                                    str26 = str3;
                                                                    strOptString = jSONObjectOptJSONObject.optString(str20, str26);
                                                                    if (strOptString.isEmpty()) {
                                                                        str3 = str26;
                                                                    } else {
                                                                        StringBuilder sb110 = new StringBuilder();
                                                                        str3 = str26;
                                                                        String str83 = str46;
                                                                        sb110.append(str83);
                                                                        str46 = str83;
                                                                        sb110.append(i3 + 1);
                                                                        strX = x(sb110.toString(), jSONObjectOptJSONObject);
                                                                        iIntValue = ((Integer) map.getOrDefault(strX, 0)).intValue() + 1;
                                                                        map.put(strX, Integer.valueOf(iIntValue));
                                                                        if (iIntValue == 1) {
                                                                            string3 = strX;
                                                                            strM427 = str45;
                                                                        } else {
                                                                            StringBuilder sb21 = new StringBuilder();
                                                                            sb21.append(strX);
                                                                            strM427 = str45;
                                                                            sb21.append(strM427);
                                                                            sb21.append(iIntValue);
                                                                            string3 = sb21.toString();
                                                                        }
                                                                        sb3 = (StringBuilder) linkedHashMap.get(string3);
                                                                        if (sb3 == null) {
                                                                            sb3 = new StringBuilder();
                                                                            linkedHashMap.put(string3, sb3);
                                                                        }
                                                                        if (sb3.length() > 0) {
                                                                            sb3.append(str14);
                                                                        }
                                                                        sb3.append(str71);
                                                                        sb3.append(str9);
                                                                        sb3.append(strReplace3);
                                                                        sb3.append(str12);
                                                                        sb3.append(k(str24, str23, strOptString));
                                                                    }
                                                                    i3++;
                                                                    str45 = strM427;
                                                                    str18 = str7;
                                                                    jSONArray3 = jSONArray4;
                                                                    str20 = str20;
                                                                }
                                                                strM427 = str45;
                                                                i3++;
                                                                str45 = strM427;
                                                                str18 = str7;
                                                                jSONArray3 = jSONArray4;
                                                                str20 = str20;
                                                            }
                                                            str25 = str18;
                                                        } else {
                                                            str25 = str18;
                                                            str5 = str66;
                                                        }
                                                        i9++;
                                                        str45 = str45;
                                                        strReplace2 = str71;
                                                        jSONArray6 = jSONArray2;
                                                        str66 = str5;
                                                        str64 = str17;
                                                        jSONArrayOptJSONArray5 = jSONArray;
                                                        str59 = str22;
                                                        str57 = str20;
                                                        str36 = str15;
                                                        strM286 = str19;
                                                        strM186 = str21;
                                                        str60 = str3;
                                                        strV = str11;
                                                        linkedHashMap3 = linkedHashMap;
                                                        str44 = str12;
                                                        str47 = str24;
                                                        str50 = str25;
                                                        str69 = str10;
                                                        jSONObjectW2 = jSONObject;
                                                        str62 = str9;
                                                        str49 = str6;
                                                        str43 = str14;
                                                        strM445 = str8;
                                                        str53 = str13;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        str7 = str18;
                                                        str5 = str66;
                                                    }
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    str3 = str72;
                                                }
                                            }
                                        }
                                        String str84 = str69;
                                        JSONObject jSONObject6 = jSONObjectW2;
                                        String str85 = str53;
                                        String str86 = str47;
                                        String str87 = str66;
                                        String str88 = str43;
                                        String str89 = str49;
                                        String str90 = str50;
                                        String str91 = str64;
                                        i7 = i8 + 1;
                                        str51 = str62;
                                        str45 = str45;
                                        linkedHashMap3 = linkedHashMap3;
                                        str44 = str44;
                                        jSONArrayOptJSONArray4 = jSONArray6;
                                        strM454 = str65;
                                        strM75 = str63;
                                        strM108 = str67;
                                        str52 = str91;
                                        str41 = str59;
                                        strM223 = str57;
                                        str36 = str36;
                                        strM286 = strM286;
                                        strM186 = strM186;
                                        str32 = str60;
                                        strV = strV;
                                        str55 = str84;
                                        str42 = str87;
                                        str50 = str90;
                                        str49 = str89;
                                        str47 = str86;
                                        str43 = str88;
                                        str53 = str85;
                                        jSONObjectW2 = jSONObject6;
                                    } catch (Exception e14) {
                                        e = e14;
                                        str5 = str66;
                                        strM427 = str45;
                                        str6 = str49;
                                        str7 = str50;
                                        linkedHashMap = linkedHashMap3;
                                        str3 = str60;
                                        str35 = str4;
                                        com.github.catvod.spider.merge.D.b.D(e, com.github.catvod.spider.merge.D.b.q("[FishDrive] Emby series details ", str35, str6));
                                        while (r0.hasNext()) {
                                            arrayList3.add((String) entry.getKey());
                                            arrayList4.add(((StringBuilder) entry.getValue()).toString());
                                        }
                                        arrayList4 = arrayList4;
                                        arrayList3 = arrayList3;
                                        if (arrayList4.isEmpty()) {
                                            arrayList3.add(strM459);
                                            arrayList4.add(str3);
                                        }
                                        kVar = new k();
                                        kVar.n(str31);
                                        String str615 = str7;
                                        kVar.o(str615);
                                        kVar.p(i(str5, str35, strY));
                                        kVar.l(str2);
                                        kVar.i(str37);
                                        kVar.u(strOptString5);
                                        if (sb.length() > 0) {
                                            kVar.j(sb.toString());
                                        }
                                        if (sb11.length() > 0) {
                                            kVar.m(sb11.toString());
                                        }
                                        if (sb12.length() > 0) {
                                            kVar.k(sb12.toString());
                                        }
                                        sb4 = new StringBuilder();
                                        if (!str39.isEmpty()) {
                                            sb4.append(str39);
                                        }
                                        if (!strOptString6.isEmpty()) {
                                            if (sb4.length() > 0) {
                                                sb4.append(strM427);
                                            }
                                            sb4.append(strOptString6);
                                        }
                                        if (sb4.length() > 0) {
                                            kVar.s(sb4.toString());
                                        }
                                        String strM3514 = "$$$";
                                        kVar.q(TextUtils.join(strM3514, arrayList3));
                                        String strJoin8 = TextUtils.join(strM3514, arrayList4);
                                        kVar.r(strJoin8);
                                        AbstractC0280n1.p(str615);
                                        AbstractC0280n1.q(strJoin8);
                                        boolean z9 = FishCrypto.a;
                                        N1.d(kVar);
                                        return com.github.catvod.spider.merge.p001b.g.s(kVar);
                                    }
                                }
                            }
                            str3 = str32;
                            strM427 = str45;
                            str5 = str42;
                            str7 = str50;
                            linkedHashMap = linkedHashMap3;
                            str35 = str4;
                        } catch (Exception e15) {
                            e = e15;
                            str3 = "";
                            str5 = str42;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        str3 = str32;
                        strM427 = str45;
                        str5 = str42;
                        str6 = str49;
                        str7 = str50;
                        linkedHashMap = linkedHashMap3;
                        str35 = str4;
                        com.github.catvod.spider.merge.D.b.D(e, com.github.catvod.spider.merge.D.b.q("[FishDrive] Emby series details ", str35, str6));
                        while (r0.hasNext()) {
                            arrayList3.add((String) entry.getKey());
                            arrayList4.add(((StringBuilder) entry.getValue()).toString());
                        }
                        arrayList4 = arrayList4;
                        arrayList3 = arrayList3;
                        if (arrayList4.isEmpty()) {
                            arrayList3.add(strM459);
                            arrayList4.add(str3);
                        }
                        kVar = new k();
                        kVar.n(str31);
                        String str616 = str7;
                        kVar.o(str616);
                        kVar.p(i(str5, str35, strY));
                        kVar.l(str2);
                        kVar.i(str37);
                        kVar.u(strOptString5);
                        if (sb.length() > 0) {
                            kVar.j(sb.toString());
                        }
                        if (sb11.length() > 0) {
                            kVar.m(sb11.toString());
                        }
                        if (sb12.length() > 0) {
                            kVar.k(sb12.toString());
                        }
                        sb4 = new StringBuilder();
                        if (!str39.isEmpty()) {
                            sb4.append(str39);
                        }
                        if (!strOptString6.isEmpty()) {
                            if (sb4.length() > 0) {
                                sb4.append(strM427);
                            }
                            sb4.append(strOptString6);
                        }
                        if (sb4.length() > 0) {
                            kVar.s(sb4.toString());
                        }
                        String strM3515 = "$$$";
                        kVar.q(TextUtils.join(strM3515, arrayList3));
                        String strJoin9 = TextUtils.join(strM3515, arrayList4);
                        kVar.r(strJoin9);
                        AbstractC0280n1.p(str616);
                        AbstractC0280n1.q(strJoin9);
                        boolean z10 = FishCrypto.a;
                        N1.d(kVar);
                        return com.github.catvod.spider.merge.p001b.g.s(kVar);
                    }
                } catch (Exception e17) {
                    e = e17;
                    str3 = "";
                    str4 = str35;
                }
            } catch (Exception e18) {
                e = e18;
                str3 = "";
                linkedHashMap = linkedHashMap2;
                str4 = str35;
                strM427 = str45;
                str5 = str42;
                str6 = str49;
                str7 = str50;
            }
            while (r0.hasNext()) {
                arrayList3.add((String) entry.getKey());
                arrayList4.add(((StringBuilder) entry.getValue()).toString());
            }
            arrayList4 = arrayList4;
            arrayList3 = arrayList3;
            if (arrayList4.isEmpty()) {
                arrayList3.add(strM459);
                arrayList4.add(str3);
            }
        } else {
            sb = sb10;
            str2 = strReplace;
            try {
                JSONArray jSONArrayE2 = E(jSONObject2, strR, strV, strOptString2, str35, jSONObjectW2);
                if (jSONArrayE2 != null) {
                    int i10 = 0;
                    while (i10 < jSONArrayE2.length()) {
                        JSONObject jSONObjectOptJSONObject4 = jSONArrayE2.optJSONObject(i10);
                        if (jSONObjectOptJSONObject4 == null) {
                            str27 = str40;
                            str28 = str;
                        } else {
                            String strOptString15 = jSONObjectOptJSONObject4.optString(strM223, "");
                            if (strOptString15.isEmpty()) {
                                str27 = str40;
                                str28 = str;
                            } else {
                                String strX2 = x(strM432 + (i10 + 1), jSONObjectOptJSONObject4);
                                int i11 = 2;
                                String str92 = strX2;
                                while (arrayList3.contains(str92)) {
                                    try {
                                        str92 = strX2 + strM427 + i11;
                                        i11++;
                                    } catch (Exception unused) {
                                    }
                                }
                                arrayList3.add(str92);
                                StringBuilder sb22 = new StringBuilder();
                                sb22.append(str92);
                                str28 = str;
                                try {
                                    sb22.append(str28);
                                    str27 = str40;
                                    try {
                                        sb22.append(k(str27, str35, strOptString15));
                                        arrayList4.add(sb22.toString());
                                    } catch (Exception unused2) {
                                        if (arrayList4.isEmpty()) {
                                            arrayList3.add(strM459);
                                            arrayList4.add(strOptString3.replace(strM390, strM286).replace(str28, strM409) + str28 + j(str27, str35));
                                            str7 = strOptString3;
                                        } else {
                                            str7 = strOptString3;
                                        }
                                        str5 = strR;
                                        kVar = new k();
                                        kVar.n(str31);
                                        String str617 = str7;
                                        kVar.o(str617);
                                        kVar.p(i(str5, str35, strY));
                                        kVar.l(str2);
                                        kVar.i(str37);
                                        kVar.u(strOptString5);
                                        if (sb.length() > 0) {
                                            kVar.j(sb.toString());
                                        }
                                        if (sb11.length() > 0) {
                                            kVar.m(sb11.toString());
                                        }
                                        if (sb12.length() > 0) {
                                            kVar.k(sb12.toString());
                                        }
                                        sb4 = new StringBuilder();
                                        if (!str39.isEmpty()) {
                                            sb4.append(str39);
                                        }
                                        if (!strOptString6.isEmpty()) {
                                            if (sb4.length() > 0) {
                                                sb4.append(strM427);
                                            }
                                            sb4.append(strOptString6);
                                        }
                                        if (sb4.length() > 0) {
                                            kVar.s(sb4.toString());
                                        }
                                        String strM3516 = "$$$";
                                        kVar.q(TextUtils.join(strM3516, arrayList3));
                                        String strJoin10 = TextUtils.join(strM3516, arrayList4);
                                        kVar.r(strJoin10);
                                        AbstractC0280n1.p(str617);
                                        AbstractC0280n1.q(strJoin10);
                                        boolean z11 = FishCrypto.a;
                                        N1.d(kVar);
                                        return com.github.catvod.spider.merge.p001b.g.s(kVar);
                                    }
                                } catch (Exception unused3) {
                                    str27 = str40;
                                }
                            }
                        }
                        i10++;
                        str40 = str27;
                        str = str28;
                    }
                }
                str27 = str40;
                str28 = str;
            } catch (Exception unused4) {
                str27 = str40;
                str28 = str;
            }
            if (arrayList4.isEmpty()) {
                arrayList3.add(strM459);
                arrayList4.add(strOptString3.replace(strM390, strM286).replace(str28, strM409) + str28 + j(str27, str35));
                str7 = strOptString3;
            } else {
                str7 = strOptString3;
            }
            str5 = strR;
        }
        kVar = new k();
        kVar.n(str31);
        String str618 = str7;
        kVar.o(str618);
        kVar.p(i(str5, str35, strY));
        kVar.l(str2);
        kVar.i(str37);
        kVar.u(strOptString5);
        if (sb.length() > 0) {
            kVar.j(sb.toString());
        }
        if (sb11.length() > 0) {
            kVar.m(sb11.toString());
        }
        if (sb12.length() > 0) {
            kVar.k(sb12.toString());
        }
        sb4 = new StringBuilder();
        if (!str39.isEmpty()) {
            sb4.append(str39);
        }
        if (!strOptString6.isEmpty()) {
            if (sb4.length() > 0) {
                sb4.append(strM427);
            }
            sb4.append(strOptString6);
        }
        if (sb4.length() > 0) {
            kVar.s(sb4.toString());
        }
        String strM3517 = "$$$";
        kVar.q(TextUtils.join(strM3517, arrayList3));
        String strJoin11 = TextUtils.join(strM3517, arrayList4);
        kVar.r(strJoin11);
        AbstractC0280n1.p(str618);
        AbstractC0280n1.q(strJoin11);
        boolean z12 = FishCrypto.a;
        N1.d(kVar);
        return com.github.catvod.spider.merge.p001b.g.s(kVar);
    }

    private /* synthetic */ String $host$b5d914d976e0069f(String str) {
        int i2 = 4;
        int i3 = 3;
        int i4 = 2;
        int i5 = 1;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1519360405:
                if (str.equals("fishdrive_media_maintenance")) {
                    b = 0;
                }
                break;
            case -1330068078:
                if (str.equals("fishdrive_server_settings")) {
                    b = 1;
                }
                break;
            case -472008170:
                if (str.equals("fishdrive_emby_settings")) {
                    b = 2;
                }
                break;
            case -432325330:
                if (str.equals("fishdrive_help")) {
                    b = 3;
                }
                break;
            case -135385809:
                if (str.equals("fishdrive_display_manage")) {
                    b = 4;
                }
                break;
            case 2080297694:
                if (str.equals("fishdrive_network_acceleration")) {
                    b = 5;
                }
                break;
        }
        switch (b) {
            case 0:
                InitOrigin.run(new RunnableC0464p(this, i2));
                break;
            case 1:
                InitOrigin.run(new RunnableC0464p(this, i5));
                break;
            case 2:
                InitOrigin.run(new RunnableC0464p(this, i4));
                break;
            case 3:
                InitOrigin.run(new RunnableC0460l(25));
                break;
            case 4:
                InitOrigin.run(new RunnableC0464p(this, i3));
                break;
            case 5:
                InitOrigin.run(new a(i5, this));
                break;
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:139:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:187:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0319  */
    private /* synthetic */ String $host$f9d7235748f992e0(String str, String str2, boolean z2, HashMap<String, String> map) throws Exception {
        String str3;
        int i2;
        String strM558;
        Iterator it;
        boolean z3;
        String str4;
        String str5;
        String str6;
        String strOptString;
        boolean zEquals = "setting".equals(str);
        String strM314 = "1";
        if (zEquals && strM314.equals(str2)) {
            return com.github.catvod.spider.merge.p001b.g.y(A());
        }
        if ("emby_personal".equals(str)) {
            ArrayList arrayList = new ArrayList();
            if (y) {
                arrayList.add(new k("emby_personal::resume", "继续观看", AbstractC0302v0.O1(), "聚合全部已启用服务器", true));
            }
            if (z) {
                arrayList.add(new k("emby_personal::next", "下一集", AbstractC0302v0.k(), "聚合全部已启用服务器", true));
            }
            if (A) {
                arrayList.add(new k("emby_personal::latest", "最新内容", com.github.catvod.spider.merge.D.b.m(new StringBuilder(), N1.u, "version.jpg"), "聚合全部已启用服务器", true));
            }
            if (B) {
                arrayList.add(new k("emby_personal::favorite", "我的收藏", AbstractC0302v0.b0(), "聚合全部已启用服务器", true));
            }
            com.github.catvod.spider.merge.p001b.g gVar = new com.github.catvod.spider.merge.p001b.g();
            gVar.F(arrayList);
            gVar.o(1, 1, 0, 1);
            return gVar.r();
        }
        boolean zStartsWith = str.startsWith("emby_personal::");
        String strM379 = "UserData";
        String strM126 = "Name";
        String strM219 = "Id";
        String strM10 = "name";
        String str7 = "";
        if (zStartsWith) {
            final String strSubstring = str.substring(15);
            final List listSynchronizedList = Collections.synchronizedList(new ArrayList());
            ArrayList<JSONObject> arrayList2 = new ArrayList();
            for (JSONObject jSONObject : h) {
                String strOptString2 = jSONObject.optString(strM10, "");
                if (D(jSONObject) && !strOptString2.isEmpty() && !C.contains(strOptString2)) {
                    arrayList2.add(jSONObject);
                }
            }
            final CountDownLatch countDownLatch = new CountDownLatch(arrayList2.size());
            for (final JSONObject jSONObject2 : arrayList2) {
                InitOrigin.execute(new Runnable() { // from class: com.github.catvod.spider.FishDrive.7

                    /* JADX INFO: renamed from: short, reason: not valid java name */
                    private static final short[] f44short = {1932, 1923, 1935, 1927, 2024, 2001, 2014, 1988, 2015, 2035, 1989, 2014, 1985, 2002};

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            JSONArray jSONArrayC = FishDrive.c(FishDrive.this, jSONObject2, strSubstring);
                            String strOptString3 = jSONObject2.optString("name", "");
                            synchronized (listSynchronizedList) {
                                for (int i3 = 0; i3 < jSONArrayC.length(); i3++) {
                                    try {
                                        JSONObject jSONObjectOptJSONObject = jSONArrayC.optJSONObject(i3);
                                        if (jSONObjectOptJSONObject != null) {
                                            listSynchronizedList.add(new JSONObject(jSONObjectOptJSONObject.toString()).put("_fishDrive", strOptString3));
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        } catch (Throwable th2) {
                            countDownLatch.countDown();
                            throw th2;
                        }
                        countDownLatch.countDown();
                    }
                });
            }
            countDownLatch.await(15L, TimeUnit.SECONDS);
            Collections.sort(listSynchronizedList, new Comparator() { // from class: com.github.catvod.spider.merge.u.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    JSONObject jSONObject3 = FishDrive.f;
                    this.a.getClass();
                    String str8 = strSubstring;
                    return FishDrive.H(str8, (JSONObject) obj2).compareTo(FishDrive.H(str8, (JSONObject) obj));
                }
            });
            ArrayList arrayList3 = new ArrayList();
            boolean z4 = arrayList2.size() > 1;
            Iterator it2 = listSynchronizedList.iterator();
            while (it2.hasNext()) {
                JSONObject jSONObject3 = (JSONObject) it2.next();
                String strOptString3 = jSONObject3.optString("_fishDrive", "");
                String strOptString4 = jSONObject3.optString(strM219, "");
                k kVar = null;
                if (strOptString3.isEmpty() || strOptString4.isEmpty()) {
                    arrayList3 = arrayList3;
                    it = it2;
                    z3 = z4;
                    str4 = strM379;
                    str5 = strM126;
                } else {
                    String strM459 = "Type";
                    String strOptString5 = jSONObject3.optString(strM459, "");
                    String strM182 = "Episode";
                    boolean zEquals2 = strM182.equals(strOptString5);
                    String strOptString6 = zEquals2 ? jSONObject3.optString("SeriesName", jSONObject3.optString(strM126, "")) : jSONObject3.optString(strM126, "");
                    if (strOptString6.isEmpty()) {
                        arrayList3 = arrayList3;
                        it = it2;
                        z3 = z4;
                        str4 = strM379;
                        str5 = strM126;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (z4) {
                            sb.append("[");
                            sb.append(strOptString3);
                            sb.append("] ");
                        }
                        if (zEquals2) {
                            it = it2;
                            int iOptInt = jSONObject3.optInt("ParentIndexNumber", 0);
                            z3 = z4;
                            int iOptInt2 = jSONObject3.optInt("IndexNumber", 0);
                            if (iOptInt <= 0 || iOptInt2 <= 0) {
                                str6 = strOptString4;
                                if (iOptInt2 > 0) {
                                    sb.append("第");
                                    sb.append(iOptInt2);
                                    sb.append("集");
                                }
                            } else {
                                str6 = strOptString4;
                                sb.append(String.format(Locale.US, "S%02dE%02d", Integer.valueOf(iOptInt), Integer.valueOf(iOptInt2)));
                            }
                        } else {
                            it = it2;
                            z3 = z4;
                            str6 = strOptString4;
                        }
                        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject(strM379);
                        str4 = strM379;
                        long jOptLong = jSONObject3.optLong("RunTimeTicks", 0L);
                        str5 = strM126;
                        long jOptLong2 = jSONObjectOptJSONObject == null ? 0L : jSONObjectOptJSONObject.optLong("PlaybackPositionTicks", 0L);
                        if (jOptLong > 0 && jOptLong2 > 0) {
                            if (sb.length() > 0) {
                                sb.append(" · ");
                            }
                            sb.append(Math.min(99, Math.max(1, Math.round((jOptLong2 * 100.0f) / jOptLong))));
                            sb.append("%");
                        }
                        JSONObject jSONObjectW = w(strOptString3);
                        if (jSONObjectW != null) {
                            String strY = y(jSONObject3);
                            boolean zIsEmpty = strY.isEmpty();
                            String strM554 = "SeriesId";
                            if (zIsEmpty && zEquals2 && !jSONObject3.optString(strM554, "").isEmpty()) {
                                strOptString = jSONObject3.optString(strM554);
                                strY = jSONObject3.optString("SeriesPrimaryImageTag", "");
                            } else {
                                strOptString = str6;
                            }
                            String strOptString7 = jSONObject3.optString(strM219, "");
                            if (strM182.equals(jSONObject3.optString(strM459, ""))) {
                                String strOptString8 = jSONObject3.optString(strM554, "");
                                if (!strOptString8.isEmpty()) {
                                    strOptString7 = strOptString8;
                                }
                            }
                            kVar = new k(j(strOptString3, strOptString7), strOptString6, i(R(jSONObjectW), strOptString, strY), sb.toString(), i.a(0.75f));
                        }
                    }
                }
                k kVar2 = kVar;
                ArrayList arrayList4 = arrayList3;
                if (kVar2 != null) {
                    arrayList4.add(kVar2);
                }
                z4 = z3;
                arrayList3 = arrayList4;
                strM379 = str4;
                strM126 = str5;
                it2 = it;
            }
            ArrayList arrayList5 = arrayList3;
            com.github.catvod.spider.merge.p001b.g gVar2 = new com.github.catvod.spider.merge.p001b.g();
            gVar2.F(arrayList5);
            gVar2.o(1, 1, 0, 1);
            return gVar2.r();
        }
        String str8 = strM379;
        String strM292 = "::";
        boolean zContains = str.contains(strM292);
        String strM193 = "/";
        JSONObject jSONObjectW2 = w(zContains ? str.substring(0, str.indexOf(strM292)) : str.contains(strM193) ? str.substring(0, str.indexOf(strM193)) : str);
        if (jSONObjectW2 == null) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        if (!D(jSONObjectW2)) {
            String strOptString9 = jSONObjectW2.optString(strM10, "");
            String strSubstring2 = str.contains(strM193) ? str.substring(str.indexOf(strM193)) : "";
            if (map != null) {
                String strM301 = "order";
                if (map.containsKey(strM301)) {
                    str3 = map.get(strM301);
                } else {
                    str3 = "";
                }
            } else {
                str3 = "";
            }
            if (map != null) {
                String strM355 = "type";
                if (map.containsKey(strM355)) {
                    str7 = map.get(strM355);
                }
            }
            ArrayList<DavResource> arrayList6 = new ArrayList();
            ArrayList<DavResource> arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            for (DavResource davResource : z(jSONObjectW2, strSubstring2, AbstractC0309x1.c)) {
                if (davResource.isDirectory()) {
                    arrayList6.add(davResource);
                } else {
                    arrayList7.add(davResource);
                }
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str3)) {
                Collections.sort(arrayList6, new com.github.catvod.spider.merge.p004e.f(str7, 1, str3));
                Collections.sort(arrayList7, new com.github.catvod.spider.merge.p004e.f(str7, 1, str3));
            }
            for (DavResource davResource2 : arrayList6) {
                StringBuilder sbO = com.github.catvod.spider.merge.D.b.o(strOptString9);
                sbO.append(davResource2.getPath());
                arrayList8.add(new k(sbO.toString(), davResource2.getName(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAV4AAAFeCAYAAADNK3caAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAAkoSURBVHhe7d1bjNxVHcDxc2Z2uy3KJdBaLhXRIChSIKEx6hs8GkwItCCGJ42XBNSYmGhCQlNJjA8aH6DqA8ZEGw3dcjGKvgGJD8a4JEKLXDQaQ6uQlGqKAtvuzPE/zCExMZrupb+d/38+n2Z7Lt2X3fb/3X/nzM4mAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABgLeQ6To1SdvdOPn3wg/1e77qS0o5S0uXNJ2Fr85k4q/njDeP36rQ3mrd/NR/7y83H/edmfLYZn+wP8q/yNfNHxu8CnE5TE97y1E3blnLvzpzT7c3yovEu/6n5IvRM6qWHZpb6+/I1D7xQt4E11vnwloXbNg/mTt7TTD/ZvE3DHe1aKM2vx5u74W/OXnXgl3UPWCOdDu/SwV23Ng3Z20zPG++wbCX9puT01dntB56oO8AqdTK8ZeEzs4O5Y/c208+Od1il0R3wD/vp9S/lqx79e90DVqhz4S0LN5wxmNs430w/Ot5hDR0uw/SJ2asP/KqugRXo1bETxne6onsabcu99Njg0M131DWwAp0Kb314QXRPr5lS8n0nn975jboGlqkzDzUsHbrltlSGP65LApSUvjW7/cCX6xI4RZ0Ib1m4YfNgbuNzzdSzF4I1/4Du6m8/8PW6BE5BJx5qaKI7ep6u6K6D5q73nqVDN99cl8ApaP0d7+g70ga93h+b6dx4h3Xwz8Fw8OG5qx8+VNfA/9H68I4OeXJOX6lL1svJxdQ/8oeUhoO6Af/lRPN2vPlv0kvN+PzoQcLU7z2WFl5YyHvS8M33mBKtDm/Zvbs32PnMX5rptvEO6ym/9mrqvfSnuoJT9mIq5Ucp9ffmG5//a93rtFaH98RTN32o1+v9ui6ZAPkfL6fesdENDSzbYnM7dX9afOPufMvhY3Wvk1p9uDZ6acc6ZUKUc7am8rZz6gqWZa750n1H2rDpufLTS3fVvU5qdXhLSjvqlAky3PLOVDZsrCtYppy2NL/tb+J7X3k8zdTdTml5eMtldcok6fXScOslzdivG7ASzd3v8fc+XPZv21Q3OqPV4c0pX1CnTJrZuTR8x7vqAlbshrRx0wNdu/Nt+zdQnFlHJlA548w0PPf8uoIVKulj6fil366rTmh7eP1EiQnnsI21ke/s0oFb28NLCzhsY02UvLfsv+Lcumo14eX0c9jGWhg922HuxJ66ajXhJYbDNtZE/nR55PIL66K1hJcwDttYA3MpDVr/E1CEl1AO21i1nG8vu9vdLuElnMM2VunidO1l19Z5Kwkv8Ry2sWr5+jppJeFlfThsYzXK0B0vrITDNlbh8jq2kvCyrhy2sSIltfp1WoSXdeewjWXL6aw6ayXhZf05bGP5Wv3DbYWXyeCwjSkivEwMh21MC+Florx52PZ2h210m/AycYZbLn7z7he6SniZPDmn4dZ3p+HZm+sGdIvwMpma+JbzLkrDC96TyobO/axDppzwMtHKpjPTcNtlaXjhpamcvSWVuTOaf7Wedka75Tq20tLBnaVOgSkzs/1Aa/vljhcgmPACBBNegGDCCxBMeAGCCS9AMOEFCCa8AMGEFyCY8AIEE16AYMILEEx4AYIJL0Aw4QUIJrwAwYQXIJjwAgQTXoBgwgsQTHgBggkvQDDhBQgmvADBhBcgmPACBBNegGDCCxBMeAGCCS9AMOEFCCa8AMGEFyCY8AIEE16AYMILEEx4AYIJL0Aw4QUIJrwAwYQXIJjwAgQTXoBgwgsQTHgBggkvQDDhBQgmvADBhBcgmPACBBNegGDCCxBMeAGCCS9AMOEFCCa8AMGEFyCY8AIEE16AYMILEEx4AYIJL0Aw4QUIJrwAwYQXIJjwAgQTXoBgwgsQTHgBggkvQDDhBQgmvADBhBcgmPACBBNegGDCCxBMeAGCCS9AMOEFCCa8AMGEFyCY8AIEE16AYMILEEx4AYIJL0Aw4QUIJrwAwYQXIJjwAgQTXoBgwgsQTHgBggkvQDDhBQgmvADBhBcgmPACBBNegGDCCxBMeAGCCS9AMOEFCCa8AMGEFyCY8AIEE16AYMILEEx4AYIJL0Aw4QUIJrwAwYQXIJjwAgQTXoBgwgsQTHgBggkvQDDhBQgmvADBhBcgmPACBBNegGDCCxBMeAGCCS9AMOEFCCa8AMGEFyCY8AIEE16AYMILEEx4AYIJL0Aw4QUIJrwAwYQXIJjwAgQTXoBgbQ/viToC02Wxjq3U9vC+WkdgmpR2X/utDm9J5W91CkyRklOrr/1Whzen/EKdAlMkl/J8nbZSy8ObFuoUmCLNTVerr/1Wh3fQK4/VKTBFBr1hq6/9Vod3dv+Vv22Gw+MVMB3Ki7Pz25+si1Zq90MNe/YMSy776hKYAiXlfaNrvy5bqdXhHZkZlL3N0Orn9AGnbHFmkEfXfKu1Prz56ocON18Df1CXQJeVdH++Zv5IXbVW68M70s+9u5q/kKN1CXRRc433Z5d211WrdSK8+cr5Y83fyh11CXRRznfm9z/ySl21WifCOzJz1YP7m+F74xXQKSV9Z2b7/AN11XqdCe9I/+jRzzfDz8YroCN+0X/l6BfrvBM6Fd583RNL/cU3Pt5MxRe64dH+q3nn6Nqu607oVHhH8o6fv9bc+d7U/Nek9U85gelWvttcyzfmj8y/Xjc6I9exk5YO7ro1lXJf81FurlvApBs9Q6lXvjBz5YM/qTud0+nwjpRnbzxvcHLma81H+qlmOTfeBSbQYhPd7/dnl+7uyrMX/pfOh/ct5Xe7Llrqlc/lVG5POV9St4H1d6SUtG9mmO/twjdHnIqpCe9bStndO/nU73f0e8PrS0rXlpzel0s+v/lMnNX88YbxewGnwYnmjvb46EXMR6+nO3ppx0EvPz77gSsWcm73ay8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADrIKV/A6RHmt7xjHWfAAAAAElFTkSuQmCC", "", true));
            }
            for (DavResource davResource3 : arrayList7) {
                StringBuilder sbO2 = com.github.catvod.spider.merge.D.b.o(strOptString9);
                sbO2.append(davResource3.getPath());
                arrayList8.add(new k(sbO2.toString(), davResource3.getName(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAV4AAAFeCAYAAADNK3caAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAAeuSURBVHhe7d1PiF3VAcfxm7QRarRNVwUhunNm1Y24qNR/7UIQOpO261aUdNmCIJQuShJESldCl6NWqmtLkl0XpaCQSiVZFBdvXAgakMlCSoqhVBunL+SIQcjj/Zn7e/fc8/nAMOe+1V0k3/kxizMdAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAVQ6V71V67MnTp8qRBu3tfVROtGhyaedMOVan9vDulyMN2rsivC2bXNyptl+Hy3cAQoQXIEx4AcKEFyBMeAHChBcgTHgBwoQXIEx4AcKEFyBMeAHChBcgTHgBwpq9nWx766Fy6s/u7uVuMv1axubG8W5j+tWn2t9v1u1kmxv3Td/v3vLUj93dD6fv90F5Wszg329z+n739/t+N5w7/1Y5La7m28maDe+rrzxXTv05e+7C9B/WhfK0mBs/GE5s9/vDofb3mxXe7a2HuxNbj5Snfpw9/+bS4Rj6+/14+9Fu60ffL0/9efrkC+W0ONdCAjA34QUIE16AMOEFCBNegDDhBQgTXoAw4QUIE16AMOEFCBNegDDhBQgTXoAw10L2yLWQq3Et5GpcCzlczYaX+s0KL+PnWkgA5ia8AGHCCxAmvABhwgsQJrwAYcILECa8AGHCCxAmvABhwgsQJrwAYcILEFb77WSnynFhT9198XQ5UqmP33c7We1evv7A0v8PJ5d2zpRjdaoO7yr2T97jSsnKXX1XeGt37O02G+RXDQBhwgsQJrwAYcILECa8AGHCCxAmvABhwgsQJrwAYcILECa8AGHCCxAmvABhwgsQJrwAYcILECa8AGHCCxAmvABhwgsQJrwAYcILECa89Oq/jz7TffrgT8sTcIPw0qv9O491//n5H7prv/hj9/m3vlM+hbYJLxH/++4T3Se/+av1C1PCS8z+0W9bvzAlvMRZv7ROeFkL65eWCS9rZf3SIuFl7axfWiO8DIb1SyuEl0GxfmmB8DJI1i9jJrwMlvXLWAkvg2f9MjbCSxWsX8ZEeKmK9csYCC/V+WL9fvL7v3WfH98sn0I9hJdqfXb/g92/X/x79+lPni2fQB2El6rtf+1Id+1nz1u/VEV4GQXrl5oIL6Nh/VIL4WV0rF+GTngZJeuXIRNeRs36ZYiEl9Gzfhka4aUZ1i9DIbw0xfplCISXJlm/rJPw0izrl3URXppn/ZImvDBl/ZIkvHAL65cE4YWvsH7pm/DCbVi/9EV4YQbrlz4IL8zB+uUgCS/MyfrloAgvLMj6ZVXCC0uwflmF8MIKrF+WIbywIuuXRQkvHBDrl3kJLxwg65d5CC/0wPplFuGFnli/3I7wAoQJL/Tk0PXPuqOv/7a769ePd4cvT8qnILzQiyPvvdN989nvdXf8+cXyCXxJeOEAWbnMQ3jhgFi5zEt4YUVWLosSXliBlcsyhBeWYOWyCuGFBVm5rEp4YU5WLgdFeGEOVi4HSXhhBiuXPggv3IaVS1+EF77CyqVvwgu3sHJJEF6YsnJJEl6aZ+WSJrw0y8plXYSXJlm5rJPw0hQrlyEQXpph5TIUwsvoWbkMjfAyalYuQyS8jJKVy5AJL6Nj5TJ0wstoWLnUQngZBSuXmggvVbNyqZHwUq0j7/3DyqVKwkt1Dl37V/eN1341Xbk/sHKpkvBSla//8y/dXb/7YXfHO2+UT6A+wksVvli5R196pjt89Ur5FOokvAyelcvYCC+DZeUyVsLLIFm5jJnwMihWLi0QXgbDyqUVwsvaWbm0RnhZKyuXFgkva2Hl0jLhJc7KpXXCS4yVCzcJLxFWLnxJeOnV4enKvfNPv7Ry4RaHyvfm7J+8Z78cqdTVdz8qJ2p17O02G2TxAoQJL0CY8AKECS9AmPAChAkvQJjwAoQJL0CY8AKECS9AmPAChAkvQJjwAoQJL0CY8AKECS9AmPAChAkvQJjwAoQJL0CY8AKECS9AWNV/WvmxJ0+fKseFPXX3xdPlSKU+ft+fd6/dy9cfWPr/4eTSzplyrE7t4d0vRxq0d0V4Wza5uFNtv/yqASBMeAHChBcgTHgBwoQXIEx4AcKEFyBMeAHChBcgTHgBwoQXIEx4AcKEFyCs2dvJtrceKqf+7O5e7ibTr2VsbhzvNqZffar9/WbdTra5cd/0/e4tT/3Y3f1w+n4flKfFeL+bzp1/q5wWV/PtZM2G99VXniun/pw9d2H6D+tCeVrMjR8MJ7b7/eFQ+/vNCu/21sPdia1HylM/zp5/c+lweL+bnj75QjktzrWQAMxNeAHChBcgTHgBwoQXIEx4AcKEFyBMeAHChBcgTHgBwoQXIEx4AcKEFyDMtZA9ci3kalwLuRrXQg5Xs+GlfrPCy/i5FhKAuQkvQJjwAoQJL0CY8AKECS9AmPAChAkvQJjwAoQJL0CY8AKECS9AmPAChNV+O9mpcqRBe3tuJ2vZ5NLOmXIEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACgR133fxM7Bfx4WlpeAAAAAElFTkSuQmCC", AbstractC0309x1.h(davResource3.getContentLength().longValue()), false));
            }
            com.github.catvod.spider.merge.p001b.g gVar3 = new com.github.catvod.spider.merge.p001b.g();
            gVar3.F(arrayList8);
            gVar3.o(1, 1, 0, 1);
            return gVar3.r();
        }
        JSONObject jSONObjectM = m(jSONObjectW2, false);
        String strR = R(jSONObjectW2);
        String strV = v(jSONObjectM);
        String strOptString10 = jSONObjectM.optString("AccessToken", "");
        HashMap map2 = new HashMap();
        String strSubstring3 = str.contains(strM292) ? str.substring(str.indexOf(strM292) + 2) : "";
        if (strSubstring3.isEmpty()) {
            return com.github.catvod.spider.merge.D.b.d();
        }
        try {
            i2 = Integer.parseInt(str2);
        } catch (Exception unused) {
            i2 = 1;
        }
        if (i2 < 1) {
            i2 = 1;
        }
        if (map != null) {
            String strM471 = "sort";
            if (map.containsKey(strM471)) {
                strM558 = map.get(strM471);
            } else {
                strM558 = "";
            }
        } else {
            strM558 = "";
        }
        boolean zIsEmpty2 = strM558.isEmpty();
        String strM467 = "Descending";
        if (zIsEmpty2) {
            strM558 = "DateLastContentAdded,SortName";
        } else {
            String strM249 = "|";
            if (strM558.contains(strM249)) {
                String strSubstring4 = strM558.substring(0, strM558.indexOf(strM249));
                strM467 = strM558.substring(strM558.indexOf(strM249) + 1);
                strM558 = strSubstring4;
            }
        }
        com.github.catvod.spider.merge.p007h.a aVarR = r();
        map2.put("SortBy", strM558);
        map2.put("IncludeItemTypes", aVarR.a);
        map2.put("SortOrder", strM467);
        map2.put("ParentId", strSubstring3);
        String strM322 = "Recursive";
        String strM427 = "true";
        map2.put(strM322, strM427);
        int i3 = aVarR.d;
        map2.put("Limit", String.valueOf(i3));
        map2.put("StartIndex", String.valueOf((i2 - 1) * i3));
        map2.put("ImageTypeLimit", strM314);
        map2.put("EnableImageTypes", "Primary,Backdrop,Thumb,Banner");
        map2.put("Fields", "BasicSyncInfo,PrimaryImageAspectRatio,ProductionYear,CommunityRating,OfficialRating");
        map2.put("EnableUserData", strM427);
        I(map2, map, "genre", "Genres");
        I(map2, map, "year", "Years");
        I(map2, map, "rating", "OfficialRatings");
        I(map2, map, "tag", "Tags");
        I(map2, map, "played", "IsPlayed");
        I(map2, map, "favorite", "IsFavorite");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strR);
        JSONObject jSONObject4 = new JSONObject(o(com.github.catvod.spider.merge.D.b.n(sb2, "/emby/Users/", strV, "/Items"), strOptString10, map2, jSONObjectW2));
        JSONArray jSONArrayOptJSONArray = jSONObject4.optJSONArray("Items");
        ArrayList arrayList9 = new ArrayList();
        String strOptString11 = jSONObjectW2.optString(strM10, "");
        if (jSONArrayOptJSONArray != null) {
            int i4 = 0;
            while (i4 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObject5 = jSONArrayOptJSONArray.getJSONObject(i4);
                String strOptString12 = jSONObject5.optString(strM219, "");
                String strOptString13 = jSONObject5.optString(strM126, "");
                String strY2 = y(jSONObject5);
                String strOptString14 = jSONObject5.optString("ProductionYear", "");
                String str9 = strM219;
                double dOptDouble = jSONObject5.optDouble("CommunityRating", 0.0d);
                String str10 = str8;
                JSONObject jSONObjectOptJSONObject2 = jSONObject5.optJSONObject(str10);
                boolean z5 = jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optBoolean("Played", false);
                StringBuilder sb3 = new StringBuilder();
                if (z5) {
                    sb3.append("[看] ");
                }
                if (dOptDouble > 0.0d) {
                    sb3.append(String.format("%.1f", Double.valueOf(dOptDouble)));
                }
                if (!strOptString14.isEmpty()) {
                    if (sb3.length() > 0) {
                        sb3.append(" ");
                    }
                    sb3.append(strOptString14);
                }
                arrayList9.add(new k(j(strOptString11, strOptString12), strOptString13, i(strR, strOptString12, strY2), sb3.length() > 0 ? sb3.toString() : "", i.a(0.75f)));
                i4++;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                str8 = str10;
                strM219 = str9;
            }
        }
        int iOptInt3 = jSONObject4.optInt("TotalRecordCount", 0);
        double d = iOptInt3;
        double d2 = i3;
        Double.isNaN(d);
        Double.isNaN(d2);
        int iCeil = (int) Math.ceil(d / d2);
        com.github.catvod.spider.merge.p001b.g gVar4 = new com.github.catvod.spider.merge.p001b.g();
        gVar4.F(arrayList9);
        gVar4.o(i2, iCeil, i3, iOptInt3);
        return gVar4.r();
    }

    static {
        h(8, false);
        o = h(30, true);
        h(8, true);
        p = new HashMap();
        s = new ArrayList();
        t = new ArrayList();
        u = new ArrayList();
        v = Collections.synchronizedMap(new HashMap());
        x = false;
        y = true;
        z = true;
        A = true;
        B = true;
        C = new ArrayList();
        D = new JSONObject();
        E = new String[]{"embyItemTypesLocal", "embySearchTypesLocal", "embySearchLimitLocal", "embyPageSizeLocal"};
    }

    public static ArrayList A() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = h;
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (D((JSONObject) it.next())) {
                i2++;
            }
        }
        int size = arrayList2.size() - C.size();
        arrayList.add(new k("fishdrive_server_settings", "服务器与账号", AbstractC0302v0.c2(), arrayList2.size() + "个 · 启用" + size + "个", "fishdrive_server_settings"));
        arrayList.add(new k("fishdrive_emby_settings", "Emby 设置", AbstractC0302v0.c0(), i2 > 0 ? "个人内容、搜索" : "未配置服务器", "fishdrive_emby_settings"));
        arrayList.add(new k("fishdrive_display_manage", "分类与排序", AbstractC0302v0.H1(), "隐藏" + u.size() + "个 · 调整顺序", "fishdrive_display_manage"));
        arrayList.add(new k("fishdrive_network_acceleration", "WebDAV 加速", AbstractC0302v0.e1(), x ? "已开启" : "已关闭", "fishdrive_network_acceleration"));
        arrayList.add(new k("fishdrive_media_maintenance", "缓存与维护", AbstractC0302v0.o(), "刷新、清理", "fishdrive_media_maintenance"));
        arrayList.add(new k("fishdrive_help", "使用帮助", AbstractC0302v0.a0(), "配置说明", "fishdrive_help"));
        return arrayList;
    }

    public static ArrayList B(String[] strArr) {
        String string;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String strM65 = "@@@";
            if (str.contains(strM65)) {
                String[] strArrSplit = str.split(strM65);
                if (strArrSplit.length >= 3) {
                    String str2 = strArrSplit[2];
                    String url = ProxyOrigin.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        string = "";
                    } else {
                        StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(url, "?do=fishdrive&url=");
                        sbP.append(Uri.encode(str2, "/"));
                        string = sbP.toString();
                    }
                    if (!TextUtils.isEmpty(string)) {
                        h hVar = new h();
                        hVar.c(strArrSplit[0]);
                        hVar.a(strArrSplit[1]);
                        hVar.d(string);
                        arrayList.add(hVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public static String C(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("server", "");
        String path = Uri.parse(strOptString).getPath();
        if (path == null) {
            path = "";
        }
        return strOptString.replace(path, "");
    }

    public static boolean D(JSONObject jSONObject) {
        if (jSONObject != null) {
            if ("emby".equals(jSONObject.optString("type", "webdav"))) {
                return true;
            }
        }
        return false;
    }

    public static JSONArray E(JSONObject jSONObject, String str, String str2, String str3, String str4, JSONObject jSONObject2) {
        String strM414 = "MediaSources";
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strM414);
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            return jSONArrayOptJSONArray;
        }
        return new JSONObject(o(str + "/emby/Items/" + str4 + "/PlaybackInfo", str3, com.github.catvod.spider.merge.D.b.s("UserId", str2), jSONObject2)).optJSONArray(strM414);
    }

    public static String[] F(String str) {
        String strSubstring;
        int iIndexOf;
        if (str == null || !str.startsWith("emby:") || (iIndexOf = (strSubstring = str.substring(5)).indexOf(":")) < 0) {
            return null;
        }
        return new String[]{strSubstring.substring(0, iIndexOf), strSubstring.substring(iIndexOf + 1)};
    }

    public static ArrayList G(String str) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray2 = f.optJSONArray(str);
        if (jSONArrayOptJSONArray2 == null) {
            return arrayList;
        }
        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("values")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
                    if (jSONObjectOptJSONObject2 != null) {
                        arrayList2.add(new com.github.catvod.spider.merge.p001b.c(jSONObjectOptJSONObject2.optString("n", ""), jSONObjectOptJSONObject2.optString("v", "")));
                    }
                }
                arrayList.add(new com.github.catvod.spider.merge.p001b.d(jSONObjectOptJSONObject.optString("key", ""), jSONObjectOptJSONObject.optString("name", ""), arrayList2));
            }
        }
        return arrayList;
    }

    public static String H(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("UserData");
        if ("resume".equals(str) && jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optString("LastPlayedDate", "");
        }
        if ("next".equals(str)) {
            return jSONObject.optString("PremiereDate", "");
        }
        return jSONObject.optString("DateCreated", jSONObject.optString("SortName", ""));
    }

    public static void I(HashMap map, Map map2, String str, String str2) {
        String str3 = map2 == null ? "" : (String) map2.get(str);
        if (str3 == null || str3.isEmpty()) {
            return;
        }
        map.put(str2, str3);
    }

    public static void J(String str) {
        try {
            synchronized (l) {
                m.put(str, new JSONObject().put("authRequired", true));
                M();
            }
        } catch (Exception unused) {
        }
        i.remove(str);
    }

    public static String K(String str) {
        return str == null ? "" : com.github.catvod.spider.merge.D.b.k(str.replace("\r", ""), "\n", "", "\"", "");
    }

    public static void L() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = h.iterator();
            while (it.hasNext()) {
                jSONArray.put((JSONObject) it.next());
            }
            jSONObject.put("drives", jSONArray);
            ArrayList arrayList = t;
            if (!arrayList.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put((String) it2.next());
                }
                jSONObject.put("categoryOrder", jSONArray2);
            }
            ArrayList arrayList2 = u;
            if (!arrayList2.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put((String) it3.next());
                }
                jSONObject.put("hiddenCategories", jSONArray3);
            }
            jSONObject.put("goProxyWebdav", x);
            jSONObject.put("embyPersonalResume", y);
            jSONObject.put("embyPersonalNext", z);
            jSONObject.put("embyPersonalLatest", A);
            jSONObject.put("embyPersonalFavorite", B);
            ArrayList arrayList3 = C;
            if (!arrayList3.isEmpty()) {
                JSONArray jSONArray4 = new JSONArray();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    jSONArray4.put((String) it4.next());
                }
                jSONObject.put("disabledServers", jSONArray4);
            }
            Iterator<String> itKeys = D.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, D.get(next));
            }
            String strM416 = ".fishdrive_config";
            String string = jSONObject.toString();
            boolean z2 = FishCrypto.a;
            C0297t1.j(strM416, string);
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[FishDrive] saveConfig: "));
        }
        w = null;
    }

    public static void M() {
        synchronized (l) {
            String strM70 = ".fishdrive_auth";
            String string = m.toString();
            boolean z2 = FishCrypto.a;
            C0297t1.j(strM70, string);
        }
    }

    public static void N(N n2, String str) {
        long jMax;
        Iterator it = ((Map) n2.c).entrySet().iterator();
        while (true) {
            jMax = 30000;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if ("Retry-After".equalsIgnoreCase((String) entry.getKey()) && !((List) entry.getValue()).isEmpty()) {
                try {
                    jMax = Math.max(30000L, Long.parseLong(((String) ((List) entry.getValue()).get(0)).trim()) * 1000);
                    break;
                } catch (Exception unused) {
                }
            }
        }
        k.put(str, Long.valueOf(System.currentTimeMillis() + jMax));
    }

    public static FishDrive O() {
        FishDrive fishDrive;
        FishDrive fishDrive2 = g;
        if (fishDrive2 != null) {
            return fishDrive2;
        }
        synchronized (FishDrive.class) {
            try {
                if (g == null) {
                    new FishDrive().init(InitOrigin.context(), "");
                }
                fishDrive = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fishDrive;
    }

    public static void P(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("User");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("AccessToken", jSONObject.optString("AccessToken"));
        jSONObject2.put("ServerId", jSONObject.optString("ServerId"));
        jSONObject2.put("User", new JSONObject().put("Id", jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString("Id")).put("Name", jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString("Name")));
        synchronized (l) {
            m.put(str, jSONObject2);
            M();
        }
        i.put(str, jSONObject2);
    }

    public static JSONObject Q(String str) {
        synchronized (l) {
            JSONObject jSONObjectOptJSONObject = m.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            try {
                return new JSONObject(jSONObjectOptJSONObject.toString());
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static String R(JSONObject jSONObject) {
        return jSONObject.optString("server", "").replaceAll("/+$", "");
    }

    public static void a(JSONObject jSONObject, boolean z2) {
        String strN = n(jSONObject);
        if (strN.isEmpty()) {
            return;
        }
        i.remove(strN);
        k.remove(strN);
        if (z2) {
            synchronized (l) {
                m.remove(strN);
                M();
            }
        }
    }

    public static ArrayList b(FishDrive fishDrive, JSONObject jSONObject) throws Exception {
        int i2;
        fishDrive.getClass();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectM = m(jSONObject, false);
        String strR = R(jSONObject);
        String strV = v(jSONObjectM);
        String strOptString = jSONObjectM.optString("AccessToken", "");
        String strOptString2 = jSONObject.optString("name", "");
        JSONArray jSONArrayOptJSONArray = new JSONObject(o(strR + "/emby/Users/" + strV + "/Views", strOptString, null, jSONObject)).optJSONArray("Items");
        if (jSONArrayOptJSONArray != null) {
            int i3 = 0;
            while (i3 < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                String strOptString3 = jSONObject2.optString("Name", "");
                String strOptString4 = jSONObject2.optString("Id", "");
                if (strOptString3.isEmpty() || strOptString4.isEmpty()) {
                    i2 = 1;
                } else {
                    String strC = com.github.catvod.spider.merge.D.b.C(strOptString2, "::", strOptString4);
                    ArrayList arrayListG = G("embyFilters");
                    try {
                        HashMap map = new HashMap();
                        map.put("UserId", strV);
                        map.put("ParentId", strOptString4);
                        map.put("IncludeItemTypes", r().a);
                        arrayListG = g(arrayListG, new JSONObject(o(strR + "/emby/Items/Filters", strOptString, map, jSONObject)));
                    } catch (Exception unused) {
                    }
                    i2 = 1;
                    arrayList.add(new Object[]{strC, strOptString3, strOptString2, Boolean.TRUE, arrayListG});
                }
                i3 += i2;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new Object[]{strOptString2, "(空)", strOptString2, Boolean.FALSE});
        }
        return arrayList;
    }

    public static JSONArray c(FishDrive fishDrive, JSONObject jSONObject, String str) throws Exception {
        String strJ;
        fishDrive.getClass();
        JSONObject jSONObjectM = m(jSONObject, false);
        String strR = R(jSONObject);
        String strV = v(jSONObjectM);
        String strOptString = jSONObjectM.optString("AccessToken", "");
        HashMap mapS = com.github.catvod.spider.merge.D.b.s("UserId", strV);
        mapS.put("Limit", String.valueOf(Math.max(20, r().d)));
        mapS.put("Fields", "PrimaryImageAspectRatio,ProductionYear,DateCreated,PremiereDate,SeriesName,SeriesId,SeriesPrimaryImageTag,ParentIndexNumber,IndexNumber,RunTimeTicks");
        String strM1 = "EnableUserData";
        String strM471 = "true";
        mapS.put(strM1, strM471);
        boolean zEquals = "resume".equals(str);
        String strM277 = "Recursive";
        String strM360 = "/emby/Users/";
        if (zEquals) {
            strJ = com.github.catvod.spider.merge.D.b.j(strM360, strV, "/Items/Resume");
            mapS.put("MediaTypes", "Video");
            mapS.put(strM277, strM471);
        } else if ("next".equals(str)) {
            strJ = "/emby/Shows/NextUp";
        } else {
            boolean zEquals2 = "latest".equals(str);
            String strM31 = "IncludeItemTypes";
            if (zEquals2) {
                strJ = com.github.catvod.spider.merge.D.b.j(strM360, strV, "/Items/Latest");
                mapS.put(strM31, r().a);
            } else {
                if (!"favorite".equals(str)) {
                    return new JSONArray();
                }
                strJ = com.github.catvod.spider.merge.D.b.j(strM360, strV, "/Items");
                mapS.put(strM277, strM471);
                mapS.put("IsFavorite", strM471);
                mapS.put(strM31, r().a);
            }
        }
        String strTrim = o(strR + strJ, strOptString, mapS, jSONObject).trim();
        if (strTrim.startsWith("[")) {
            return new JSONArray(strTrim);
        }
        JSONArray jSONArrayOptJSONArray = new JSONObject(strTrim).optJSONArray("Items");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return jSONArrayOptJSONArray;
    }

    public static List<k> configItems() {
        O().getClass();
        return A();
    }

    public static void d(ArrayList arrayList, String str, String str2, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new com.github.catvod.spider.merge.p001b.c("全部", ""));
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String strTrim = String.valueOf(jSONArray.opt(i2)).trim();
            if (!strTrim.isEmpty() && !"null".equals(strTrim)) {
                arrayList2.add(new com.github.catvod.spider.merge.p001b.c(strTrim));
            }
        }
        if (arrayList2.size() > 1) {
            arrayList.add(new com.github.catvod.spider.merge.p001b.d(str, str2, arrayList2));
        }
    }

    public static boolean dispatchConfigAction(String str) {
        if (str == null || !str.startsWith("fishdrive_")) {
            return false;
        }
        FishDrive fishDriveO = O();
        if ("fishdrive_display_manage".equals(str) && s.isEmpty()) {
            InitOrigin.execute(new RunnableC0242b(fishDriveO, str, 7));
            return true;
        }
        fishDriveO.action(str);
        return true;
    }

    public static void e(StringBuilder sb, String str) {
        if (str.isEmpty()) {
            return;
        }
        String string = sb.toString();
        Locale locale = Locale.US;
        if (string.toLowerCase(locale).contains(str.toLowerCase(locale))) {
            return;
        }
        if (sb.length() > 0) {
            sb.append(" ┆ ");
        }
        sb.append(str);
    }

    public static String f(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("user", "");
        if (strOptString.isEmpty()) {
            return "";
        }
        return "Basic " + Base64.encodeToString((strOptString + ":" + jSONObject.optString("pass", "")).getBytes(), 2);
    }

    public static ArrayList g(ArrayList arrayList, JSONObject jSONObject) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        d(arrayList2, "genre", "类型", jSONObject.optJSONArray("Genres"));
        d(arrayList2, "year", "年份", jSONObject.optJSONArray("Years"));
        d(arrayList2, "rating", "分级", jSONObject.optJSONArray("OfficialRatings"));
        d(arrayList2, "tag", "标签", jSONObject.optJSONArray("Tags"));
        return arrayList2;
    }

    public static OkHttpClient h(int i2, boolean z2) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderWriteTimeout = builder.connectTimeout(j2, timeUnit).readTimeout(j2, timeUnit).writeTimeout(j2, timeUnit);
        if (z2) {
            builderWriteTimeout.hostnameVerifier(new com.github.catvod.spider.merge.p016t.a(1)).sslSocketFactory(new com.github.catvod.spider.merge.p016t.e(), com.github.catvod.spider.merge.p016t.e.d);
        }
        return builderWriteTimeout.build();
    }

    public static String i(String str, String str2, String str3) {
        if (str2.isEmpty() || str3.isEmpty()) {
            return "";
        }
        return str + "/emby/Items/" + str2 + "/Images/Primary?maxWidth=400&tag=" + str3 + "&quality=90";
    }

    public static String j(String str, String str2) {
        return "emby:" + str + ":" + str2;
    }

    public static String k(String str, String str2, String str3) {
        String strJ = j(str, str2);
        return TextUtils.isEmpty(str3) ? strJ : com.github.catvod.spider.merge.D.b.C(strJ, "::", str3);
    }

    public static String l(String str, HashMap map) {
        String strM471 = "UTF-8";
        if (map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        String strM346 = "?";
        boolean zContains = str.contains(strM346);
        String strM355 = "&";
        if (zContains) {
            strM346 = strM355;
        }
        sb.append(strM346);
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z2) {
                sb.append(strM355);
            }
            try {
                sb.append(URLEncoder.encode((String) entry.getKey(), strM471));
                sb.append("=");
                sb.append(URLEncoder.encode((String) entry.getValue(), strM471));
            } catch (Exception unused) {
            }
            z2 = false;
        }
        return sb.toString();
    }

    public static JSONObject m(JSONObject jSONObject, boolean z2) throws Exception {
        String strM169 = "Emby认证失败: HTTP ";
        String strM554 = "/emby/Users/AuthenticateByName";
        String strOptString = jSONObject.optString("name", "");
        if (!z2 && C.contains(strOptString)) {
            throw new Exception("Emby服务器已关闭");
        }
        String strN = n(jSONObject);
        if (strN.isEmpty()) {
            throw new Exception("Emby配置不完整");
        }
        if (!z2) {
            Map map = i;
            JSONObject jSONObject2 = (JSONObject) map.get(strN);
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            JSONObject jSONObjectQ = Q(strN);
            if (jSONObjectQ != null) {
                if (jSONObjectQ.optBoolean("authRequired")) {
                    throw new Exception("Emby需要重新登录");
                }
                if (!jSONObjectQ.optString("AccessToken").isEmpty()) {
                    map.put(strN, jSONObjectQ);
                    return jSONObjectQ;
                }
            }
        }
        synchronized (q(strN)) {
            try {
                if (z2) {
                    k.remove(strN);
                } else {
                    Map map2 = i;
                    JSONObject jSONObject3 = (JSONObject) map2.get(strN);
                    if (jSONObject3 != null) {
                        return jSONObject3;
                    }
                    JSONObject jSONObjectQ2 = Q(strN);
                    if (jSONObjectQ2 != null && !jSONObjectQ2.optString("AccessToken").isEmpty()) {
                        map2.put(strN, jSONObjectQ2);
                        return jSONObjectQ2;
                    }
                }
                String strR = R(jSONObject);
                String strTrim = jSONObject.optString("user", "").trim();
                String strOptString2 = jSONObject.optString("pass", "");
                if (strR.isEmpty() || strTrim.isEmpty()) {
                    throw new Exception("Emby需要服务器地址和用户名");
                }
                N nS = s("POST", strR.concat(strM554), new JSONObject().put("Username", strTrim).put("Pw", strOptString2).toString(), null, jSONObject);
                int i2 = nS.a;
                if (i2 == 401) {
                    J(strN);
                    throw new Exception("Emby用户名或密码错误");
                }
                if (i2 == 403) {
                    k.put(strN, Long.valueOf(System.currentTimeMillis() + 300000));
                    throw new Exception("Emby账号或客户端被服务器拒绝");
                }
                if (i2 == 429) {
                    N(nS, strN);
                    throw new Exception("Emby请求过于频繁，请稍后再试");
                }
                if (i2 < 200 || i2 >= 300) {
                    throw new Exception(strM169 + i2);
                }
                JSONObject jSONObject4 = new JSONObject(nS.a());
                if (jSONObject4.optString("AccessToken").isEmpty() || v(jSONObject4).isEmpty()) {
                    throw new Exception("Emby认证失败: 响应不完整");
                }
                P(strN, jSONObject4);
                return jSONObject4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String n(JSONObject jSONObject) {
        if (jSONObject == null || !D(jSONObject)) {
            return "";
        }
        String strOptString = jSONObject.optString("server");
        String strOptString2 = jSONObject.optString("user");
        String str = q;
        String lowerCase = strOptString == null ? "" : strOptString.trim().replaceAll("/+$", "").toLowerCase(Locale.ROOT);
        String lowerCase2 = strOptString2 == null ? "" : strOptString2.trim().toLowerCase(Locale.ROOT);
        StringBuilder sb = new StringBuilder();
        sb.append(lowerCase);
        String strM339 = "\n";
        sb.append(strM339);
        sb.append(lowerCase2);
        sb.append(strM339);
        sb.append(str != null ? str : "");
        return AbstractC0309x1.a(sb.toString());
    }

    public static String o(String str, String str2, HashMap map, JSONObject jSONObject) {
        return t("GET", l(str, map), null, str2, jSONObject).a();
    }

    public static HashMap p(String str, JSONObject jSONObject) {
        String strK;
        HashMap map = new HashMap();
        String strM42 = "embyUA";
        String strOptString = jSONObject != null ? jSONObject.optString(strM42, "") : "";
        boolean zIsEmpty = strOptString.isEmpty();
        String strM301 = "3.3.67";
        String strM477 = "embyClientVersion";
        String strM422 = "embyVersion";
        String strM516 = "Android Mobile";
        String strM249 = "embyClient";
        if (zIsEmpty) {
            JSONObject jSONObject2 = f;
            StringBuilder sb = new StringBuilder();
            String strOptString2 = jSONObject != null ? jSONObject.optString(strM249, "") : "";
            if (strOptString2.isEmpty()) {
                strOptString2 = f.optString(strM249, strM516);
            }
            sb.append(strOptString2);
            sb.append("/");
            String strOptString3 = jSONObject != null ? jSONObject.optString(strM422, "") : "";
            if (strOptString3.isEmpty()) {
                strOptString3 = f.optString(strM477, strM301);
            }
            sb.append(strOptString3);
            strK = K(jSONObject2.optString(strM42, sb.toString()));
        } else {
            strK = K(strOptString);
        }
        map.put("User-Agent", strK);
        String strM1 = "Accept";
        String strM402 = "application/json";
        map.put(strM1, strM402);
        map.put("Content-Type", strM402);
        StringBuilder sb2 = new StringBuilder("Emby Client=\"");
        String strOptString4 = jSONObject != null ? jSONObject.optString(strM249, "") : "";
        if (strOptString4.isEmpty()) {
            strOptString4 = f.optString(strM249, strM516);
        }
        sb2.append(K(strOptString4));
        sb2.append("\", Device=\"");
        String strM288 = "embyDevice";
        String strOptString5 = jSONObject != null ? jSONObject.optString(strM288, "") : "";
        if (strOptString5.isEmpty()) {
            String strOptString6 = f.optString(strM288, "");
            if (strOptString6.isEmpty() && (strOptString6 = r) == null) {
                strOptString6 = "Android Device";
            }
            strOptString5 = strOptString6;
        }
        sb2.append(K(strOptString5));
        sb2.append("\", DeviceId=\"");
        sb2.append(K(q));
        sb2.append("\", Version=\"");
        String strOptString7 = jSONObject != null ? jSONObject.optString(strM422, "") : "";
        if (strOptString7.isEmpty()) {
            strOptString7 = f.optString(strM477, strM301);
        }
        sb2.append(K(strOptString7));
        String strM31 = "\"";
        sb2.append(strM31);
        if (str != null && !str.isEmpty()) {
            sb2.append(", Token=\"");
            sb2.append(str);
            sb2.append(strM31);
        }
        map.put("X-Emby-Authorization", sb2.toString());
        if (str != null && !str.isEmpty()) {
            map.put("X-Emby-Token", str);
        }
        return map;
    }

    public static Object q(String str) {
        Object obj;
        Map map = j;
        synchronized (map) {
            try {
                obj = map.get(str);
                if (obj == null) {
                    obj = new Object();
                    map.put(str, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static com.github.catvod.spider.merge.p007h.a r() {
        return com.github.catvod.spider.merge.p007h.a.a(D, f);
    }

    public static N s(String str, String str2, String str3, String str4, JSONObject jSONObject) throws Exception {
        String str5 = str3;
        OkHttpClient okHttpClient = jSONObject.optBoolean("embyInsecureTls", false) ? o : n;
        Request.Builder builderHeaders = com.github.catvod.spider.merge.D.b.u(str2).headers(Headers.of(p(str4, jSONObject)));
        String strString = "";
        if ("POST".equals(str)) {
            MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
            if (str5 == null) {
                str5 = "";
            }
            builderHeaders.post(RequestBody.create(mediaType, str5));
        }
        try {
            Response responseExecute = okHttpClient.newCall(builderHeaders.build()).execute();
            try {
                if (responseExecute.body() != null) {
                    strString = responseExecute.body().string();
                }
                N n2 = new N(responseExecute.code(), strString, responseExecute.headers().toMultimap());
                responseExecute.close();
                return n2;
            } catch (Throwable th) {
                if (responseExecute != null) {
                    try {
                        responseExecute.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new Exception("Emby网络连接失败", e);
        }
    }

    public static N t(String str, String str2, String str3, String str4, JSONObject jSONObject) throws Exception {
        if (C.contains(jSONObject.optString("name", ""))) {
            throw new Exception("Emby服务器已关闭");
        }
        String strN = n(jSONObject);
        long jLongValue = ((Long) k.getOrDefault(strN, 0L)).longValue() - System.currentTimeMillis();
        if (jLongValue > 0) {
            throw new Exception("Emby服务器冷却中，请等待" + Math.max(1L, jLongValue / 1000) + "秒");
        }
        Map map = k;
        map.remove(strN);
        N nS = s(str, str2, str3, str4, jSONObject);
        int i2 = nS.a;
        if (i2 >= 200 && i2 < 300) {
            return nS;
        }
        if (i2 == 401) {
            J(strN);
            throw new Exception("Emby登录已失效，请重新登录");
        }
        if (i2 == 403) {
            map.put(strN, Long.valueOf(System.currentTimeMillis() + 300000));
            throw new Exception("Emby账号或客户端被服务器拒绝");
        }
        if (i2 == 429) {
            N(nS, strN);
            throw new Exception("Emby请求过于频繁，已暂停访问");
        }
        if (i2 < 500) {
            throw new Exception(com.github.catvod.spider.merge.D.b.e(i2, "Emby请求失败: HTTP "));
        }
        map.put(strN, Long.valueOf(System.currentTimeMillis() + 30000));
        throw new Exception(com.github.catvod.spider.merge.D.b.e(i2, "Emby服务器异常: HTTP "));
    }

    public static ArrayList u(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectM = m(jSONObject, false);
        String strR = R(jSONObject);
        String strV = v(jSONObjectM);
        String strOptString = jSONObject.optString("name", "");
        String strOptString2 = jSONObjectM.optString("AccessToken", "");
        com.github.catvod.spider.merge.p007h.a aVarR = r();
        HashMap mapT = com.github.catvod.spider.merge.D.b.t("SortBy", "SortName", "SortOrder", "Ascending");
        mapT.put("Fields", "BasicSyncInfo,PrimaryImageAspectRatio,ProductionYear");
        mapT.put("StartIndex", "0");
        mapT.put("ImageTypeLimit", "1");
        mapT.put("Recursive", "true");
        mapT.put("SearchTerm", str);
        mapT.put("IncludeItemTypes", aVarR.b);
        mapT.put("Limit", String.valueOf(aVarR.c));
        StringBuilder sb = new StringBuilder();
        sb.append(strR);
        sb.append("/emby/Users/");
        JSONArray jSONArrayOptJSONArray = new JSONObject(o(com.github.catvod.spider.merge.D.b.m(sb, strV, "/Items"), strOptString2, mapT, jSONObject)).optJSONArray("Items");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                String strOptString3 = jSONObject2.optString("Id", "");
                String strOptString4 = jSONObject2.optString("Name", "");
                String strY = y(jSONObject2);
                String strOptString5 = jSONObject2.optString("ProductionYear", "");
                arrayList.add(new k(j(strOptString, strOptString3), strOptString4, i(strR, strOptString3, strY), "[" + strOptString + "] " + strOptString5));
            }
        }
        return arrayList;
    }

    public static String v(JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject("User").getString("Id");
        } catch (Exception unused) {
            return "";
        }
    }

    public static Object[] vod(Map<String, String> map) throws IOException {
        String str = map.get("url");
        if (str == null || str.isEmpty()) {
            throw new IOException("[FishDrive] vod: missing url param");
        }
        String strM402 = "/";
        String strSubstring = str.contains(strM402) ? str.substring(0, str.indexOf(strM402)) : str;
        String strSubstring2 = str.substring(strSubstring.length());
        JSONObject jSONObjectW = w(strSubstring);
        if (jSONObjectW == null) {
            throw new IOException("[FishDrive] vod: drive not found: ".concat(strSubstring));
        }
        Request.Builder builderU = com.github.catvod.spider.merge.D.b.u(C(jSONObjectW) + Uri.encode(strSubstring2, strM402));
        String strF = f(jSONObjectW);
        if (!strF.isEmpty()) {
            builderU.header("Authorization", strF);
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List listAsList = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent");
        for (String str2 : map.keySet()) {
            if (listAsList.contains(str2)) {
                treeMap.put(str2, map.get(str2));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            builderU.header((String) entry.getKey(), (String) entry.getValue());
        }
        Response responseI = X1.I(builderU.build());
        if (responseI.body() != null) {
            return new Object[]{Integer.valueOf(responseI.code()), responseI.header("Content-Type", "application/octet-stream"), responseI.body().byteStream()};
        }
        throw new IOException("[FishDrive] vod: empty response body");
    }

    public static JSONObject w(String str) {
        for (JSONObject jSONObject : h) {
            if (str.equals(jSONObject.optString("name", ""))) {
                return jSONObject;
            }
        }
        return null;
    }

    public static String x(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("MediaStreams");
        if (jSONArrayOptJSONArray == null) {
            jSONObjectOptJSONObject = null;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= jSONArrayOptJSONArray.length()) {
                jSONObjectOptJSONObject = null;
                break;
            }
            jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                if ("Video".equals(jSONObjectOptJSONObject.optString("Type"))) {
                    break;
                }
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        if (jSONObjectOptJSONObject != null) {
            int iOptInt = jSONObjectOptJSONObject.optInt("Height");
            int iOptInt2 = jSONObjectOptJSONObject.optInt("Width");
            if (iOptInt >= 1800 || iOptInt2 >= 3000) {
                e(sb, "4K");
            } else if (iOptInt >= 1300 || iOptInt2 >= 2200) {
                e(sb, "2K");
            } else if (iOptInt >= 900 || iOptInt2 >= 1600) {
                e(sb, "1080P");
            } else if (iOptInt >= 650 || iOptInt2 >= 1100) {
                e(sb, "720P");
            } else if (iOptInt >= 430 || iOptInt2 >= 700) {
                e(sb, "480P");
            } else if (iOptInt > 0) {
                e(sb, iOptInt + "P");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jSONObjectOptJSONObject.optString("VideoRangeType", ""));
            String strM54 = " ";
            sb2.append(strM54);
            sb2.append(jSONObjectOptJSONObject.optString("VideoRange", ""));
            sb2.append(strM54);
            sb2.append(jSONObjectOptJSONObject.optString("DisplayTitle", ""));
            sb2.append(strM54);
            sb2.append(jSONObjectOptJSONObject.optString("CodecTag", ""));
            sb2.append(strM54);
            sb2.append(jSONObject.optString("Name", ""));
            String upperCase = sb2.toString().toUpperCase(Locale.US);
            if (upperCase.contains("DOVI") || upperCase.contains("DOLBY VISION") || upperCase.contains("DOLBYVISION") || upperCase.matches(".*\\bDV\\b.*") || upperCase.contains("DVHE") || upperCase.contains("DVH1") || jSONObjectOptJSONObject.optInt("DvProfile", -1) >= 0) {
                e(sb, "杜比视界");
            } else {
                boolean zContains = upperCase.contains("HDR10PLUS");
                String strM516 = "HDR10+";
                if (zContains || upperCase.contains(strM516)) {
                    e(sb, strM516);
                } else {
                    String strM545 = "HDR10";
                    if (upperCase.contains(strM545)) {
                        e(sb, strM545);
                    } else {
                        String strM471 = "HLG";
                        if (upperCase.contains(strM471)) {
                            e(sb, strM471);
                        } else {
                            String strM288 = "HDR";
                            if (upperCase.contains(strM288)) {
                                e(sb, strM288);
                            }
                        }
                    }
                }
            }
        }
        String strM427 = "VideoCodec";
        String lowerCase = (jSONObjectOptJSONObject == null ? jSONObject.optString(strM427, "") : jSONObjectOptJSONObject.optString("Codec", jSONObject.optString(strM427, ""))).toLowerCase();
        if ("h264".equals(lowerCase)) {
            e(sb, "H.264");
        } else if ("hevc".equals(lowerCase) || "h265".equals(lowerCase)) {
            e(sb, "HEVC");
        } else if (!lowerCase.isEmpty()) {
            e(sb, lowerCase.toUpperCase());
        }
        return sb.length() > 0 ? sb.toString() : str;
    }

    public static String y(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ImageTags");
        return jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("Primary", "") : "";
    }

    public static List z(JSONObject jSONObject, String str, List list) {
        String strConcat = str;
        String path = Uri.parse(jSONObject.optString("server", "")).getPath();
        if (path == null) {
            path = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C(jSONObject));
        if (!strConcat.startsWith(path)) {
            strConcat = path.concat(strConcat);
        }
        sb.append(strConcat);
        String string = sb.toString();
        String strOptString = jSONObject.optString("name", "");
        HashMap map = p;
        OkHttpSardine okHttpSardine = (Sardine) map.get(strOptString);
        if (okHttpSardine == null) {
            okHttpSardine = new OkHttpSardine();
            okHttpSardine.setCredentials(jSONObject.optString("user", ""), jSONObject.optString("pass", ""));
            map.put(strOptString, okHttpSardine);
        }
        List list2 = okHttpSardine.list(string);
        list2.remove(0);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            DavResource davResource = (DavResource) it.next();
            if (!davResource.isDirectory() && !davResource.getName().contains(".")) {
                it.remove();
            } else if (!davResource.isDirectory() && !list.contains(AbstractC0309x1.g(davResource.getName()).toLowerCase(Locale.ROOT))) {
                it.remove();
            }
        }
        return list2;
    }

    public String action(String str) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "action");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$b5d914d976e0069f = $host$b5d914d976e0069f(str);
            FishCrypto.endHostEntry(null);
            return str$host$b5d914d976e0069f;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public String categoryContent(String str, String str2, boolean z2, HashMap<String, String> map) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "categoryContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$f9d7235748f992e0 = $host$f9d7235748f992e0(str, str2, z2, map);
            FishCrypto.endHostEntry(null);
            return str$host$f9d7235748f992e0;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public String detailContent(List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "detailContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$6c1ebb3cb60973b4 = $host$6c1ebb3cb60973b4(list);
            FishCrypto.endHostEntry(null);
            return str$host$6c1ebb3cb60973b4;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public String homeContent(boolean z2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "homeContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$1b26b551389a5dab = $host$1b26b551389a5dab(z2);
            FishCrypto.endHostEntry(null);
            return str$host$1b26b551389a5dab;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x037a A[Catch: Exception -> 0x031e, TryCatch #0 {Exception -> 0x031e, blocks: (B:77:0x02ef, B:79:0x030a, B:81:0x0311, B:84:0x0319, B:87:0x0320, B:90:0x033f, B:92:0x0345, B:94:0x034f, B:95:0x0363, B:99:0x0370, B:100:0x0374, B:102:0x037a, B:105:0x038b), top: B:121:0x02ef }] */
    /* JADX WARN: Code duplicated, block: B:142:0x038e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x038b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x033e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0345 A[Catch: Exception -> 0x031e, TryCatch #0 {Exception -> 0x031e, blocks: (B:77:0x02ef, B:79:0x030a, B:81:0x0311, B:84:0x0319, B:87:0x0320, B:90:0x033f, B:92:0x0345, B:94:0x034f, B:95:0x0363, B:99:0x0370, B:100:0x0374, B:102:0x037a, B:105:0x038b), top: B:121:0x02ef }] */
    /* JADX WARN: Code duplicated, block: B:94:0x034f A[Catch: Exception -> 0x031e, TryCatch #0 {Exception -> 0x031e, blocks: (B:77:0x02ef, B:79:0x030a, B:81:0x0311, B:84:0x0319, B:87:0x0320, B:90:0x033f, B:92:0x0345, B:94:0x034f, B:95:0x0363, B:99:0x0370, B:100:0x0374, B:102:0x037a, B:105:0x038b), top: B:121:0x02ef }] */
    /* JADX WARN: Code duplicated, block: B:98:0x036e  */
    public void init(Context context, String str) throws Throwable {
        JSONArray jSONArrayOptJSONArray;
        int i2;
        JSONObject jSONObject;
        String strOptString;
        ArrayList arrayList;
        Iterator it;
        Init.init(context);
        h.clear();
        D = new JSONObject();
        i.clear();
        k.clear();
        q = "";
        String strOptString2 = "";
        try {
            String strM355 = ".fishdrive_config";
            boolean z2 = FishCrypto.a;
            String strH = C0297t1.h(strM355);
            if (!strH.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject(strH);
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("drives");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                        h.add(jSONArrayOptJSONArray2.getJSONObject(i3));
                    }
                }
                strOptString2 = jSONObject2.optString("deviceId", "");
                JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("categoryOrder");
                if (jSONArrayOptJSONArray3 != null) {
                    t.clear();
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                        t.add(jSONArrayOptJSONArray3.optString(i4, ""));
                    }
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("hiddenCategories");
                if (jSONArrayOptJSONArray4 != null) {
                    u.clear();
                    for (int i5 = 0; i5 < jSONArrayOptJSONArray4.length(); i5++) {
                        u.add(jSONArrayOptJSONArray4.optString(i5, ""));
                    }
                }
                x = jSONObject2.optBoolean("goProxyWebdav", false);
                y = jSONObject2.optBoolean("embyPersonalResume", true);
                z = jSONObject2.optBoolean("embyPersonalNext", true);
                A = jSONObject2.optBoolean("embyPersonalLatest", true);
                B = jSONObject2.optBoolean("embyPersonalFavorite", true);
                JSONArray jSONArrayOptJSONArray5 = jSONObject2.optJSONArray("disabledServers");
                if (jSONArrayOptJSONArray5 != null) {
                    C.clear();
                    for (int i6 = 0; i6 < jSONArrayOptJSONArray5.length(); i6++) {
                        C.add(jSONArrayOptJSONArray5.optString(i6, ""));
                    }
                }
                D = new JSONObject();
                for (String str2 : E) {
                    if (jSONObject2.has(str2)) {
                        try {
                            D.put(str2, jSONObject2.get(str2));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[FishDrive] loadConfig: "));
        }
        String strM554 = ".fishdrive_device";
        boolean z3 = FishCrypto.a;
        String strTrim = C0297t1.h(strM554).trim();
        q = strTrim;
        if (strTrim.isEmpty()) {
            String string = strOptString2.isEmpty() ? UUID.randomUUID().toString() : strOptString2;
            q = string;
            C0297t1.j(".fishdrive_device", string);
        }
        synchronized (l) {
            try {
                try {
                    String strH2 = C0297t1.h(".fishdrive_auth");
                    m = strH2.isEmpty() ? new JSONObject() : new JSONObject(strH2);
                } catch (Exception unused2) {
                    m = new JSONObject();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!strOptString2.isEmpty()) {
            L();
        }
        try {
            String strM42 = Build.MODEL;
            String str3 = Build.BRAND;
            StringBuilder sb = new StringBuilder();
            if (str3 == null) {
                str3 = "";
            }
            sb.append(str3);
            sb.append(" ");
            if (strM42 == null) {
                strM42 = "Android";
            }
            sb.append(strM42);
            String string2 = sb.toString();
            r = string2;
            r = string2.trim();
        } catch (Exception unused3) {
            r = "Android Device";
        }
        this.b = new C0559r1(this.d);
        this.c = new X1(12, this.e);
        if (str != null && !str.isEmpty()) {
            String strM223 = "name";
            String strM382 = "type";
            try {
                String strG = FishCrypto.g(str);
                if (strG.startsWith("http")) {
                    String strX = X1.X(strG, null, null);
                    if (strX != null && !strX.isEmpty()) {
                        strG = FishCrypto.g(strX);
                        JSONObject jSONObject3 = new JSONObject(strG);
                        f = jSONObject3;
                        jSONArrayOptJSONArray = jSONObject3.optJSONArray("drives");
                        if (jSONArrayOptJSONArray != null) {
                            for (i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                                if (!jSONObject.has(strM382)) {
                                    jSONObject.put(strM382, "webdav");
                                }
                                strOptString = jSONObject.optString(strM223, "");
                                if (strOptString.isEmpty()) {
                                    arrayList = h;
                                    it = arrayList.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            arrayList.add(jSONObject);
                                            break;
                                            break;
                                        }
                                    } while (!strOptString.equals(((JSONObject) it.next()).optString(strM223, "")));
                                }
                            }
                        }
                    }
                } else {
                    JSONObject jSONObject4 = new JSONObject(strG);
                    f = jSONObject4;
                    jSONArrayOptJSONArray = jSONObject4.optJSONArray("drives");
                    if (jSONArrayOptJSONArray != null) {
                        while (i2 < jSONArrayOptJSONArray.length()) {
                            jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                            if (!jSONObject.has(strM382)) {
                                jSONObject.put(strM382, "webdav");
                            }
                            strOptString = jSONObject.optString(strM223, "");
                            if (strOptString.isEmpty()) {
                                arrayList = h;
                                it = arrayList.iterator();
                                do {
                                    if (it.hasNext()) {
                                        arrayList.add(jSONObject);
                                        break;
                                    }
                                } while (!strOptString.equals(((JSONObject) it.next()).optString(strM223, "")));
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                com.github.catvod.spider.merge.D.b.D(e2, new StringBuilder("[FishDrive] loadExtendConfig: "));
            }
        }
        this.a = new ArrayList();
        JSONArray jSONArrayOptJSONArray6 = f.optJSONArray("subtitleExts");
        if (jSONArrayOptJSONArray6 != null) {
            for (int i7 = 0; i7 < jSONArrayOptJSONArray6.length(); i7++) {
                this.a.add(jSONArrayOptJSONArray6.optString(i7, "").toLowerCase(Locale.ROOT));
            }
        } else {
            this.a.addAll(Arrays.asList("ass", "ssa", "srt"));
        }
        this.a.addAll(AbstractC0309x1.c);
        g = this;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "playerContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$62d5eed2b06b9d14 = $host$62d5eed2b06b9d14(str, str2, list);
            FishCrypto.endHostEntry(null);
            return str$host$62d5eed2b06b9d14;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public String searchContent(String str, boolean z2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "searchContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$0b14bd34f5ca9ec8 = $host$0b14bd34f5ca9ec8(str, z2);
            FishCrypto.endHostEntry(null);
            return str$host$0b14bd34f5ca9ec8;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public String searchContent(String str, boolean z2, String str2) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, "searchContent");
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$5abcbf7c29fbb7fe = $host$5abcbf7c29fbb7fe(str, z2, str2);
            FishCrypto.endHostEntry(null);
            return str$host$5abcbf7c29fbb7fe;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }
}
