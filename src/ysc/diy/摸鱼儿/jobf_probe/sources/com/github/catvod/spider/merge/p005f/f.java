package com.github.catvod.spider.merge.p005f;

import android.text.TextUtils;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p000a.A;
import com.github.catvod.spider.merge.p001b.g;
import com.github.catvod.spider.merge.p001b.i;
import com.github.catvod.spider.merge.p001b.k;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class f {
    public static final String[] d = {"bili_history", "bili_toview", "bili_fav", "bili_follow_archives", "bili_bangumi_follow", "bili_cinema_follow"};
    public final e a;
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();

    public f(e eVar) {
        this.a = eVar;
        A();
    }

    public static String D(ArrayList arrayList) {
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((k) it.next()).h(new i());
        }
        g gVarC = b.c(arrayList);
        gVarC.o(1, 1, Math.max(1, size), Math.max(1, size));
        return gVarC.r();
    }

    public static void a(ArrayList arrayList, String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        String strC = b.C(str, "@", str2);
        if (str3 == null) {
            str3 = "";
        }
        k kVar = new k(strC, X1.L(str3, "").T(), x(str4), str5);
        kVar.t("file");
        arrayList.add(kVar);
    }

    public static String c(String str, String str2, ArrayList arrayList) {
        int iMax;
        if (!arrayList.isEmpty()) {
            return y(str, arrayList, arrayList.size() >= 20);
        }
        try {
            iMax = Math.max(1, Integer.parseInt(str));
        } catch (Exception unused) {
            iMax = 1;
        }
        return iMax <= 1 ? D(d(str2)) : y(str, new ArrayList(), false);
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        k kVar = new k("bili_status", "暂无内容", AbstractC0302v0.h(), str, "bili_status");
        kVar.t("file");
        arrayList.add(kVar);
        return arrayList;
    }

    public static ArrayList e(JsonObject jsonObject, String str) {
        int iO = o(jsonObject, "code");
        String strR = r(jsonObject, "message");
        if (iO == -101) {
            strR = "B站登录已失效，请重新登录";
        } else if (iO == -352 || iO == -403 || iO == -412) {
            strR = "B站接口触发风控，请稍后重试";
        }
        ArrayList arrayList = new ArrayList();
        k kVar = new k("bili_status", str, AbstractC0302v0.h(), TextUtils.isEmpty(strR) ? str : strR, "bili_status");
        kVar.t("file");
        arrayList.add(kVar);
        return arrayList;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        k kVar = new k("bili_status", "读取失败", AbstractC0302v0.h(), str, "bili_status");
        kVar.t("file");
        arrayList.add(kVar);
        return arrayList;
    }

    public static String k(String... strArr) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public static String m(long j) {
        if (j <= 0) {
            return "";
        }
        if (j < 60) {
            return j + "秒";
        }
        return (j / 60) + "分钟";
    }

    public static JsonArray n(JsonObject jsonObject, String str) {
        return (jsonObject != null && jsonObject.has(str) && jsonObject.get(str).isJsonArray()) ? jsonObject.getAsJsonArray(str) : new JsonArray();
    }

    public static int o(JsonObject jsonObject, String str) {
        if (jsonObject != null) {
            try {
                if (jsonObject.has(str) && !jsonObject.get(str).isJsonNull()) {
                    return jsonObject.get(str).getAsInt();
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static long p(JsonObject jsonObject) {
        if (jsonObject != null) {
            try {
                if (jsonObject.has("duration") && !jsonObject.get("duration").isJsonNull()) {
                    return jsonObject.get("duration").getAsLong();
                }
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    public static JsonObject q(JsonObject jsonObject, String str) {
        return (jsonObject != null && jsonObject.has(str) && jsonObject.get(str).isJsonObject()) ? jsonObject.getAsJsonObject(str) : new JsonObject();
    }

    public static String r(JsonObject jsonObject, String str) {
        if (jsonObject != null) {
            try {
                if (jsonObject.has(str) && !jsonObject.get(str).isJsonNull()) {
                    return jsonObject.get(str).getAsString();
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static boolean t(String str) {
        return "bp_history".equals(str) || "bp_toview".equals(str) || "bp_fav".equals(str) || "bp_follow_archives".equals(str) || "bp_bangumi".equals(str) || "bp_cinema".equals(str) || (str != null && (str.startsWith("bp_fav_") || str.startsWith("bp_up_")));
    }

    public static boolean u(String str) {
        String[] strArr = d;
        for (int i = 0; i < 6; i++) {
            if (strArr[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList v(String str) {
        ArrayList arrayList = new ArrayList();
        k kVar = new k("bili_status", "B站未登录", AbstractC0302v0.h(), str, "bili_status");
        kVar.t("file");
        arrayList.add(kVar);
        return arrayList;
    }

    public static String w(String str) {
        if ("bili_history".equals(str)) {
            return "历史";
        }
        if ("bili_toview".equals(str)) {
            return "稍后";
        }
        if ("bili_fav".equals(str)) {
            return "收藏";
        }
        if ("bili_follow_archives".equals(str)) {
            return "关注投稿";
        }
        if ("bili_bangumi_follow".equals(str)) {
            return "追番";
        }
        return "bili_cinema_follow".equals(str) ? "追剧" : str;
    }

    public static String x(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.startsWith("//") ? "https:".concat(str) : str;
    }

    public static String y(String str, ArrayList arrayList, boolean z) {
        int iMax;
        try {
            iMax = Math.max(1, Integer.parseInt(str));
        } catch (Exception unused) {
            iMax = 1;
        }
        int i = z ? iMax + 1 : iMax;
        int iMax2 = Math.max(1, ((iMax - 1) * 20) + arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((k) it.next()).h(new i());
        }
        g gVar = new g();
        gVar.F(arrayList);
        gVar.o(iMax, i, 20, iMax2);
        return gVar.r();
    }

    public final void A() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(d));
    }

    public final void B(Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.add(w((String) it.next()));
        }
        d dVar = new d(this, runnable);
        if (arrayList.size() < 2) {
            X0.a("分类太少，无需排序");
        } else {
            InitOrigin.run(new RunnableC0242b(arrayList, dVar, 16));
        }
    }

    public final void C(Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = d;
        for (int i = 0; i < 6; i++) {
            arrayList.add(w(strArr[i]));
        }
        d dVar = new d(this, runnable);
        if (arrayList.isEmpty()) {
            X0.a("没有可删除的分类");
        } else {
            InitOrigin.run(new RunnableC0242b(arrayList, dVar, 15));
        }
    }

    public final String E() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return "未启用";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(arrayList.size(), 4); i++) {
            if (i > 0) {
                sb.append(">");
            }
            sb.append(w((String) arrayList.get(i)));
        }
        if (arrayList.size() > 4) {
            sb.append("...");
        }
        return sb.toString();
    }

    public final String F(String str) {
        if (!A.j().q()) {
            return D(v("登录后查看稍后再看"));
        }
        try {
            JsonObject jsonObjectC = I0.c(X1.X(Bili.api("/x/v2/history/toview?pn=") + str + "&ps=20", null, this.a.headers()));
            if (o(jsonObjectC, "code") != 0) {
                return D(e(jsonObjectC, "稍后再看读取失败"));
            }
            JsonArray jsonArrayN = n(q(jsonObjectC, "data"), "list");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jsonArrayN.size(); i++) {
                JsonObject asJsonObject = jsonArrayN.get(i).getAsJsonObject();
                a(arrayList, r(asJsonObject, "bvid"), r(asJsonObject, "aid"), r(asJsonObject, "title"), r(asJsonObject, "pic"), k(r(q(asJsonObject, "owner"), "name"), m(p(asJsonObject))));
            }
            return c(str, "暂无稍后再看", arrayList);
        } catch (Exception unused) {
            return D(f("稍后再看读取失败"));
        }
    }

    public final String b(String str, String str2, String str3) {
        if (!A.j().q()) {
            return D(v("登录后查看 B站".concat(str3)));
        }
        try {
            long jN = A.j().n();
            if (jN <= 0) {
                return D(v("账号信息未刷新，请重新打开 B站账号页"));
            }
            JsonObject jsonObjectC = I0.c(X1.X(Bili.api("/x/space/bangumi/follow/list?type=") + str2 + "&follow_status=0&pn=" + str + "&ps=20&vmid=" + jN, null, this.a.headers()));
            if (o(jsonObjectC, "code") != 0) {
                return D(e(jsonObjectC, str3.concat("读取失败")));
            }
            JsonArray jsonArrayN = n(q(jsonObjectC, "data"), "list");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jsonArrayN.size(); i++) {
                JsonObject asJsonObject = jsonArrayN.get(i).getAsJsonObject();
                String strR = r(asJsonObject, "season_id");
                if (!TextUtils.isEmpty(strR)) {
                    JsonObject jsonObjectQ = q(asJsonObject, "new_ep");
                    String str4 = "season_" + strR;
                    String strR2 = r(asJsonObject, "title");
                    if (strR2 == null) {
                        strR2 = "";
                    }
                    k kVar = new k(str4, X1.L(strR2, "").T(), x(r(asJsonObject, "cover")), k(r(jsonObjectQ, "index_show"), r(asJsonObject, "progress"), r(asJsonObject, "season_type_name")));
                    kVar.t("file");
                    arrayList.add(kVar);
                }
            }
            return c(str, "暂无 B站" + str3, arrayList);
        } catch (Exception unused) {
            return D(f(str3.concat("读取失败")));
        }
    }

    public final String g(String str, String str2) {
        if (!A.j().q()) {
            return D(v("登录后查看 B站收藏"));
        }
        if (TextUtils.isEmpty(str2)) {
            return D(d("暂无收藏夹"));
        }
        try {
            JsonObject jsonObjectC = I0.c(X1.X(Bili.api("/x/v3/fav/resource/list?media_id=") + str2 + "&pn=" + str + "&ps=20&keyword=&order=mtime&type=0&tid=0&platform=web", null, this.a.headers()));
            if (o(jsonObjectC, "code") != 0) {
                return D(e(jsonObjectC, "收藏读取失败"));
            }
            JsonArray jsonArrayN = n(q(jsonObjectC, "data"), "medias");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jsonArrayN.size(); i++) {
                JsonObject asJsonObject = jsonArrayN.get(i).getAsJsonObject();
                a(arrayList, r(asJsonObject, "bvid"), k(r(asJsonObject, "id"), r(asJsonObject, "aid")), r(asJsonObject, "title"), r(asJsonObject, "cover"), k(r(q(asJsonObject, "upper"), "name"), m(p(asJsonObject))));
            }
            return c(str, "该收藏夹暂无可播放视频", arrayList);
        } catch (Exception unused) {
            return D(f("收藏读取失败"));
        }
    }

    public final String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        e eVar = this.a;
        sb2.append(eVar.credentialGeneration());
        sb2.append(":");
        sb.append(sb2.toString());
        sb.append("fav:");
        sb.append(str);
        String string = sb.toString();
        HashMap map = this.c;
        String str2 = (String) map.get(string);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            JsonArray jsonArrayN = n(q(I0.c(X1.X(Bili.api("/x/v3/fav/resource/list?media_id=") + str + "&pn=1&ps=1&keyword=&order=mtime&type=0&tid=0&platform=web", null, eVar.headers())), "data"), "medias");
            if (jsonArrayN.size() > 0) {
                String strX = x(r(jsonArrayN.get(0).getAsJsonObject(), "cover"));
                if (!TextUtils.isEmpty(strX)) {
                    map.put(string, strX);
                }
                return strX;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public final String i(String str) {
        try {
            long jN = A.j().n();
            if (jN <= 0) {
                return "";
            }
            JsonArray jsonArrayN = n(q(I0.c(X1.X(Bili.api("/x/space/bangumi/follow/list?type=") + str + "&follow_status=0&pn=1&ps=1&vmid=" + jN, null, this.a.headers())), "data"), "list");
            if (jsonArrayN.size() > 0) {
                return x(r(jsonArrayN.get(0).getAsJsonObject(), "cover"));
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public final String j() {
        try {
            long jN = A.j().n();
            if (jN <= 0) {
                return "";
            }
            JsonArray jsonArrayN = n(q(I0.c(X1.X(Bili.api("/x/v3/fav/folder/created/list-all?up_mid=") + jN, null, this.a.headers())), "data"), "list");
            return jsonArrayN.size() == 0 ? "" : r(jsonArrayN.get(0).getAsJsonObject(), "id");
        } catch (Exception unused) {
            return "";
        }
    }

    public final String l(String str, String str2) {
        e eVar = this.a;
        if (!A.j().q()) {
            return D(v("登录后查看关注投稿"));
        }
        if (TextUtils.isEmpty(str2)) {
            return D(d("暂无关注 UP"));
        }
        int i = 0;
        while (i < 2) {
            try {
                eVar.ensureWbi(i > 0);
                if (!eVar.hasWbi()) {
                    return D(f("B站 WBI 初始化失败，请稍后重试"));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("mid", str2);
                linkedHashMap.put("pn", str);
                linkedHashMap.put("ps", 20);
                linkedHashMap.put("order", "pubdate");
                JsonObject jsonObjectC = I0.c(X1.X(Bili.api("/x/space/wbi/arc/search?") + eVar.wbiQuery(linkedHashMap), null, eVar.headers()));
                int iO = o(jsonObjectC, "code");
                if (iO != -352 && iO != -403 && iO != -412) {
                    if (iO != 0) {
                        return D(e(jsonObjectC, "关注投稿读取失败"));
                    }
                    JsonArray jsonArrayN = n(q(q(jsonObjectC, "data"), "list"), "vlist");
                    ArrayList arrayList = new ArrayList();
                    List<w> listA = w.a(jsonArrayN);
                    if (listA != null) {
                        for (w wVar : listA) {
                            if (wVar != null && !TextUtils.isEmpty(wVar.b()) && !TextUtils.isEmpty(wVar.c())) {
                                k kVarF = wVar.f();
                                kVarF.t("file");
                                arrayList.add(kVarF);
                            }
                        }
                    }
                    return c(str, "该 UP 暂无投稿", arrayList);
                }
                i++;
            } catch (Exception unused) {
                return D(f("关注投稿读取失败"));
            }
        }
        return D(f("B站关注投稿触发风控，请稍后再试"));
    }

    public final String s(String str) {
        int iMax;
        if (!A.j().q()) {
            return D(v("登录后查看 B站历史"));
        }
        try {
            iMax = Math.max(1, Integer.parseInt(str));
        } catch (Exception unused) {
            iMax = 1;
        }
        if (!(iMax <= 1)) {
            return y(str, new ArrayList(), false);
        }
        try {
            JsonObject jsonObjectC = I0.c(X1.X(Bili.api("/x/web-interface/history/cursor?ps=") + "20&type=archive", null, this.a.headers()));
            if (o(jsonObjectC, "code") != 0) {
                return D(e(jsonObjectC, "B站历史读取失败"));
            }
            JsonArray jsonArrayN = n(q(jsonObjectC, "data"), "list");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jsonArrayN.size(); i++) {
                JsonObject asJsonObject = jsonArrayN.get(i).getAsJsonObject();
                JsonObject jsonObjectQ = q(asJsonObject, "history");
                String strR = r(jsonObjectQ, "business");
                if (TextUtils.isEmpty(strR) || "archive".equals(strR)) {
                    a(arrayList, k(r(jsonObjectQ, "bvid"), r(asJsonObject, "bvid")), k(r(jsonObjectQ, "oid"), r(asJsonObject, "aid"), r(asJsonObject, "id")), r(asJsonObject, "title"), r(asJsonObject, "cover"), k(r(asJsonObject, "author_name"), r(asJsonObject, "badge")));
                }
            }
            return c(str, "暂无 B站历史记录", arrayList);
        } catch (Exception unused2) {
            return D(f("B站历史读取失败"));
        }
    }

    public final void z(Runnable runnable) {
        A();
        this.c.clear();
        runnable.run();
        X0.a("个人中心已恢复默认，刷新生效");
    }
}
