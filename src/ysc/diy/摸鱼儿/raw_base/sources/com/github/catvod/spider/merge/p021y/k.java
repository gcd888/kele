package com.github.catvod.spider.merge.p021y;

import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.spider.Cloud;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.g0.O;
import com.github.catvod.spider.merge.p000a.C0342a0;
import com.github.catvod.spider.merge.p000a.C0349e;
import com.github.catvod.spider.merge.p000a.C0364l0;
import com.github.catvod.spider.merge.p000a.C0376s;
import com.github.catvod.spider.merge.p000a.Q0;
import com.github.catvod.spider.merge.p000a.l1;
import com.github.catvod.spider.merge.p001b.g;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class k {
    public static final String[] g = {"quark", "uc", "115", "tianyi", "baidu", "ali", "xl", "guangya", "pan123"};
    public final Map a;
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public String e = "";
    public String f = "";

    public k(Map map) {
        this.a = map;
        try {
            boolean z = FishCrypto.a;
            String strH = C0297t1.h(".local_share_config");
            if (!TextUtils.isEmpty(strH)) {
                JSONObject jSONObject = new JSONObject(strH);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("added");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("type", "");
                            String strTrim = jSONObjectOptJSONObject.optString("url", "").trim();
                            String strTrim2 = jSONObjectOptJSONObject.optString("name", "").trim();
                            if (g(strOptString) && !strTrim2.isEmpty() && AbstractC0302v0.a1(strOptString).equals(AbstractC0302v0.b1(strTrim))) {
                                this.c.add(new i(strOptString, strTrim, strTrim2, false));
                            }
                        }
                    }
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("deleted");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        String strOptString2 = jSONArrayOptJSONArray2.optString(i2, "");
                        if (!strOptString2.isEmpty()) {
                            this.d.add(strOptString2);
                        }
                    }
                }
            }
        } catch (Exception e) {
            b.D(e, new StringBuilder("Local share user config error: "));
        }
        o();
    }

    public static String a(String str, String str2) {
        if (str == null || !str.startsWith(str2)) {
            return "";
        }
        String strSubstring = str.substring(str2.length());
        return g(strSubstring) ? strSubstring : "";
    }

    public static String b(String str, int i, String str2) throws Throwable {
        String strH;
        try {
            String strB1 = AbstractC0302v0.b1(str);
            if ("115".equals(strB1)) {
                strH = C0364l0.C().X(str, i, str2);
            } else if ("baidu".equals(strB1)) {
                C0376s.a.getClass();
                strH = C0376s.A(str, i, str2);
            } else if ("tianyi".equals(strB1)) {
                strH = Q0.f().x(str, i, str2);
            } else if ("xunlei".equals(strB1)) {
                strH = l1.I().h0(str, i, str2);
            } else if ("guangya".equals(strB1)) {
                strH = C0342a0.x.N(str, i, str2);
            } else {
                if (!"ali".equals(strB1)) {
                    return b.z("state:share_unsupported", "暂不支持目录浏览", AbstractC0302v0.Y0(strB1));
                }
                strH = C0349e.j().H(str, i, str2);
            }
            JSONObject jSONObject = new JSONObject(strH);
            if (jSONObject.optInt("code", -1) != 0) {
                throw new Exception(jSONObject.optString("message", "分享目录加载失败"));
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("list");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null) {
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("folder", false);
                        String strOptString = jSONObjectOptJSONObject.optString("name", "");
                        String strOptString2 = jSONObjectOptJSONObject.optString(zOptBoolean ? "state" : "playId", "");
                        if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                            com.github.catvod.spider.merge.p001b.k kVar = new com.github.catvod.spider.merge.p001b.k();
                            kVar.n(zOptBoolean ? l("localshare-dir:", str, strOptString2) : l("localshare-file:", str, strOptString, strOptString2));
                            kVar.o(strOptString);
                            kVar.p(zOptBoolean ? "data:image/png;base64,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" : f.c(strOptString));
                            kVar.s(zOptBoolean ? "文件夹" : AbstractC0302v0.Y0(strB1));
                            kVar.t(zOptBoolean ? "folder" : "file");
                            arrayList.add(kVar);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return b.z("state:share_empty", "暂无内容", "当前目录没有可播放文件");
            }
            boolean zOptBoolean2 = jSONObject.optBoolean("hasMore", false);
            g gVar = new g();
            gVar.F(arrayList);
            gVar.o(i, zOptBoolean2 ? i + 1 : i, 100, zOptBoolean2 ? (i * 100) + 1 : ((i - 1) * 100) + arrayList.size());
            return gVar.r();
        } catch (Exception e) {
            return b.z("state:share_error", "资源库分享加载失败", p(e));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    public static String c(String str, String str2) {
        String strN;
        if (TextUtils.isEmpty(str2) || !g(str)) {
            return "";
        }
        String strTrim = str2.trim();
        if ("tianyi".equals(str)) {
            int iIndexOf = strTrim.indexOf(63);
            if (iIndexOf < 0 || (strTrim.indexOf("/t/") < 0 && strTrim.startsWith("http"))) {
                strN = "";
            } else {
                String strSubstring = strTrim.substring(0, iIndexOf);
                int i = iIndexOf + 1;
                strN = n(strTrim.substring(i), "pwd");
                if (strN.isEmpty()) {
                    strN = n(strTrim.substring(i), "password");
                }
                strTrim = strSubstring;
            }
            if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
                strTrim = "https://cloud.189.cn/t/".concat(strTrim);
            }
            if (!strN.isEmpty()) {
                strTrim = b.C(strTrim, " 访问码:", strN);
            }
        } else if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
            str.getClass();
            switch (str) {
                case "pan123":
                    strTrim = "https://www.123684.com/s/".concat(strTrim);
                    break;
                case "uc":
                    strTrim = "https://drive.uc.cn/s/".concat(strTrim);
                    break;
                case "xl":
                    strTrim = "https://pan.xunlei.com/s/".concat(strTrim);
                    break;
                case "115":
                    strTrim = "https://115.com/s/".concat(strTrim);
                    break;
                case "ali":
                    strTrim = "https://www.alipan.com/s/".concat(strTrim);
                    break;
                case "baidu":
                    strTrim = "https://pan.baidu.com/s/".concat(strTrim);
                    break;
                case "quark":
                    strTrim = "https://pan.quark.cn/s/".concat(strTrim);
                    break;
                case "guangya":
                    strTrim = "https://www.guangyapan.com/s/".concat(strTrim);
                    break;
                default:
                    return "";
            }
        }
        return AbstractC0302v0.a1(str).equals(AbstractC0302v0.b1(strTrim)) ? strTrim : "";
    }

    public static String d(String str, int i, String str2) {
        String[] strArrI = i(s(r(str2).optString("vod_play_url", "")));
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArrI.length && arrayList.size() < 10000; i2++) {
            String strF = f(strArrI[i2]);
            if (!TextUtils.isEmpty(strF)) {
                arrayList.add(new j(i2, strF));
            }
        }
        if (arrayList.isEmpty()) {
            return b.z("state:share_empty", "没有可播放文件", "分享中没有识别到媒体文件");
        }
        int size = arrayList.size();
        int iMax = Math.max(1, (size + 99) / 100);
        int iMax2 = Math.max(1, Math.min(i, iMax));
        ArrayList arrayList2 = new ArrayList();
        for (j jVar : f.e(arrayList, iMax2)) {
            com.github.catvod.spider.merge.p001b.k kVar = new com.github.catvod.spider.merge.p001b.k();
            String strEncodeToString = Base64.encodeToString((str + "\n" + jVar.a).getBytes(StandardCharsets.UTF_8), 11);
            StringBuilder sb = new StringBuilder("localshare-leaf:");
            sb.append(strEncodeToString);
            kVar.n(sb.toString());
            kVar.o(jVar.b);
            kVar.p("data:image/png;base64,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");
            String strB1 = AbstractC0302v0.b1(str);
            kVar.s(TextUtils.isEmpty(strB1) ? "" : AbstractC0302v0.Y0(strB1));
            kVar.t("file");
            arrayList2.add(kVar);
        }
        g gVar = new g();
        gVar.F(arrayList2);
        gVar.o(iMax2, iMax, 100, size);
        return gVar.r();
    }

    public static String e(String str, String str2) throws Exception {
        O oJ = j(str);
        if (oJ == null) {
            return g.d("资源库分享文件无效");
        }
        JSONObject jSONObjectR = r(str2);
        String strOptString = jSONObjectR.optString("vod_play_from", "");
        String strOptString2 = jSONObjectR.optString("vod_play_url", "");
        String[] strArrS = s(strOptString);
        String[] strArrS2 = s(strOptString2);
        String[] strArrI = i(strArrS2);
        int i = oJ.c;
        String strF = (i < 0 || i >= strArrI.length) ? "" : f(strArrI[i]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strF2 = "";
        for (int i2 = 0; i2 < strArrS.length && i2 < strArrS2.length; i2++) {
            String str3 = strArrS2[i2];
            int i3 = -1;
            String[] strArrSplit = (str3 == null || str3.isEmpty()) ? new String[0] : str3.split("#", -1);
            if (i >= 0 && i < strArrSplit.length && strF.equals(f(strArrSplit[i]))) {
                i3 = i;
            } else if (!strF.isEmpty()) {
                for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                    if (strF.equals(f(strArrSplit[i4]))) {
                        i3 = i4;
                        break;
                    }
                }
            }
            if (i3 >= 0 && !strArrSplit[i3].isEmpty()) {
                arrayList.add(strArrS[i2]);
                arrayList2.add(strArrSplit[i3]);
                if (strF2.isEmpty()) {
                    strF2 = f(strArrSplit[i3]);
                }
            }
        }
        String[] strArr = {h(arrayList), h(arrayList2), strF2};
        if (strArr[1].isEmpty()) {
            return g.d("资源库分享文件已失效");
        }
        com.github.catvod.spider.merge.p001b.k kVarA = AbstractC0449a.a(str);
        kVarA.o(strArr[2]);
        kVarA.p("data:image/png;base64,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");
        String strB1 = AbstractC0302v0.b1(oJ.b);
        kVarA.i(TextUtils.isEmpty(strB1) ? "" : AbstractC0302v0.Y0(strB1));
        kVarA.s("单文件");
        kVarA.q(strArr[0]);
        kVarA.r(strArr[1]);
        return g.s(kVarA);
    }

    public static String f(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        int iIndexOf = str.indexOf(36);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return str.trim();
    }

    public static boolean g(String str) {
        String[] strArr = g;
        for (int i = 0; i < 9; i++) {
            if (strArr[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String h(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append("$$$");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String[] i(String[] strArr) {
        String[] strArr2 = new String[0];
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            String[] strArrSplit = (str == null || str.isEmpty()) ? new String[0] : str.split("#", -1);
            if (strArrSplit.length > strArr2.length && strArrSplit.length > 0 && !TextUtils.isEmpty(strArrSplit[0])) {
                strArr2 = strArrSplit;
            }
        }
        return strArr2;
    }

    public static O j(String str) {
        if (!(str != null && str.startsWith("localshare-leaf:"))) {
            return null;
        }
        try {
            String str2 = new String(Base64.decode(str.substring(16), 11), StandardCharsets.UTF_8);
            int iLastIndexOf = str2.lastIndexOf(10);
            if (iLastIndexOf <= 0) {
                return null;
            }
            return new O(str2.substring(0, iLastIndexOf), Integer.parseInt(str2.substring(iLastIndexOf + 1)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String l(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (sb.length() > 0) {
                sb.append((char) 0);
            }
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
        }
        return b.i(str, Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11));
    }

    public static String[] m(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        String strTrim = str2.replace("\ufeff", "").trim();
        int i = 0;
        while (true) {
            if (i >= strTrim.length()) {
                i = -1;
                break;
            }
            if (Character.isWhitespace(strTrim.charAt(i))) {
                break;
            }
            i++;
        }
        if (i <= 0) {
            return null;
        }
        String strTrim2 = strTrim.substring(0, i).trim();
        String strTrim3 = strTrim.substring(i).trim();
        if (strTrim2.equalsIgnoreCase("self") || strTrim3.isEmpty()) {
            return null;
        }
        String strC = c(str, strTrim2);
        if (strC.isEmpty()) {
            return null;
        }
        return new String[]{strC, strTrim3};
    }

    public static String n(String str, String str2) {
        for (String str3 : str.split("&")) {
            int iIndexOf = str3.indexOf(61);
            if (iIndexOf > 0 && str2.equalsIgnoreCase(str3.substring(0, iIndexOf))) {
                return str3.substring(iIndexOf + 1);
            }
        }
        return "";
    }

    public static String p(Exception exc) {
        return TextUtils.isEmpty(exc.getMessage()) ? "未知错误" : exc.getMessage();
    }

    public static JSONObject r(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("list");
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray == null ? null : jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null || TextUtils.isEmpty(jSONObjectOptJSONObject.optString("vod_play_url", ""))) {
            throw new Exception(jSONObject.optString("msg", jSONObject.optString("message", "分享中没有可播放文件")));
        }
        return jSONObjectOptJSONObject;
    }

    public static String[] s(String str) {
        return (str == null || str.isEmpty()) ? new String[0] : str.split("\\$\\$\\$", -1);
    }

    public static String[] t(String str, int i, String str2) {
        if (str2 == null || !str2.startsWith(str)) {
            return null;
        }
        try {
            String[] strArrSplit = new String(Base64.decode(str2.substring(str.length()), 11), StandardCharsets.UTF_8).split("\\u0000", -1);
            if (strArrSplit.length == i) {
                return strArrSplit;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String u(String str) {
        if (!(str != null && str.startsWith("localshare-item:"))) {
            return "";
        }
        try {
            return new String(Base64.decode(str.substring(16), 11), StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return "";
        }
    }

    public final String k(String str, Cloud cloud) {
        synchronized (this) {
            try {
                if (str.equals(this.e) && !TextUtils.isEmpty(this.f)) {
                    return this.f;
                }
                String strDetailContent = cloud.detailContent(Collections.singletonList(str));
                synchronized (this) {
                    this.e = str;
                    this.f = strDetailContent;
                }
                return strDetailContent;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        HashMap map = this.b;
        map.clear();
        String[] strArr = g;
        for (int i = 0; i < 9; i++) {
            String str = strArr[i];
            ArrayList arrayList = new ArrayList();
            List<i> list = (List) this.a.get(str);
            if (list != null) {
                for (i iVar : list) {
                    String strA = iVar.a();
                    HashSet hashSet = this.d;
                    if (!hashSet.contains(strA)) {
                        if (!hashSet.contains(iVar.a() + '\n' + iVar.c) && arrayList.size() < 10000) {
                            arrayList.add(iVar);
                        }
                    }
                }
            }
            for (i iVar2 : this.c) {
                if (str.equals(iVar2.a) && arrayList.size() < 10000) {
                    arrayList.add(iVar2);
                }
            }
            if (!arrayList.isEmpty()) {
                map.put(str, arrayList);
            }
        }
    }

    public final void q() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (i iVar : this.c) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", iVar.a);
                jSONObject2.put("name", iVar.c);
                jSONObject2.put("url", iVar.b);
                jSONArray.put(jSONObject2);
            }
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                jSONArray2.put((String) it.next());
            }
            jSONObject.put("added", jSONArray);
            jSONObject.put("deleted", jSONArray2);
            String string = jSONObject.toString();
            boolean z = FishCrypto.a;
            C0297t1.j(".local_share_config", string);
        } catch (Exception e) {
            b.D(e, new StringBuilder("Local share user config save error: "));
        }
    }
}
