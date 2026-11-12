package com.github.catvod.spider.merge.D;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.T.C0317b;
import com.github.catvod.spider.merge.T.C0320e;
import com.github.catvod.spider.merge.T.S;
import com.github.catvod.spider.merge.p001b.g;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract /* synthetic */ class b {
    public static void A(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static String B(String str, String str2) {
        return str + str2;
    }

    public static String C(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void D(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        SpiderDebug.log(sb.toString());
    }

    public static ArrayList a(C0320e c0320e) {
        S s = new S();
        for (C0317b c0317b : c0320e.c) {
            BitSet bitSet = (BitSet) s.get(c0317b);
            if (bitSet == null) {
                bitSet = new BitSet();
                s.put(c0317b, bitSet);
            }
            bitSet.set(c0317b.b);
        }
        return (ArrayList) s.values();
    }

    public static /* synthetic */ int b(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 8;
            case 3:
                return 16;
            case 4:
                return 1;
            case 5:
                return 4;
            case 6:
                return 32;
            case 7:
                return 128;
            default:
                throw null;
        }
    }

    public static g c(ArrayList arrayList) {
        g gVar = new g();
        gVar.F(arrayList);
        return gVar;
    }

    public static String d() {
        return g.y(new ArrayList());
    }

    public static String e(int i, String str) {
        return str + i;
    }

    public static String f(String str) {
        g gVar = new g();
        gVar.C(str);
        return gVar.r();
    }

    public static String g(String str, int i, int i2) {
        return str.substring(i2, str.length() - i);
    }

    public static String h(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(String str, String str2, String str3, String str4, String str5) {
        return str.replace(str2, str3).replace(str4, str5).trim();
    }

    public static String l(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String n(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder p(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static HashMap s(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public static HashMap t(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put(str, str2);
        map.put(str3, str4);
        return map;
    }

    public static Request.Builder u(String str) {
        return new Request.Builder().url(str);
    }

    public static JSONObject v(String str, String str2, String str3, String str4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, str2);
        jSONObject.put(str3, str4);
        return jSONObject;
    }

    public static /* synthetic */ void w(int i, String str) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = com.github.catvod.spider.merge.L.a.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder sbR = r("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbR.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbR.toString());
            com.github.catvod.spider.merge.L.a.e(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void x(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        X0.a(sb.toString());
    }

    public static /* synthetic */ void y(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void z(String str, String str2, String str3, ArrayList arrayList) {
        arrayList.add(new com.github.catvod.spider.merge.p001b.b(str, str2, str3));
    }
}
