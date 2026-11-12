package com.github.catvod.spider.merge.A;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0256f1 {
    public final Map a;
    public boolean b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public boolean o;

    public C0256f1(HashMap map) {
        this.a = map;
    }

    public static boolean a(HashMap map, String... strArr) {
        for (String str : strArr) {
            Object obj = map.get(str);
            if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                return true;
            }
            if ((obj instanceof Number) && ((Number) obj).intValue() != 0) {
                return true;
            }
            if (obj != null) {
                String string = obj.toString();
                if ("true".equalsIgnoreCase(string) || "1".equals(string) || "yes".equalsIgnoreCase(string)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String d(HashMap map, String... strArr) {
        Object obj;
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str) && (obj = map.get(str)) != null && !TextUtils.isEmpty(obj.toString())) {
                return obj.toString();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ee  */
    public static C0256f1 e(HashMap map, boolean z, String str, String... strArr) {
        C0256f1 c0256f1 = new C0256f1(map);
        boolean z2 = true;
        c0256f1.b = z || a(map, "hasCookie", "isLoggedIn", "hasToken", "loggedIn");
        String strD = d(map, strArr);
        c0256f1.c = strD;
        if (TextUtils.isEmpty(strD)) {
            c0256f1.c = d(map, "nickname", "displayName", "displayname", "username", "userName", "account", "passport", "name", "phone", "sub");
        }
        c0256f1.d = d(map, "account", "passport", "username", "userName", "loginName");
        c0256f1.e = d(map, "phone", "phone_number", "phoneNumber", "mobile");
        c0256f1.f = d(map, "user_id", "userId", "uid", "sub");
        c0256f1.g = d(map, "member_type", "memberType", "vipType", "vip_type", "vipLabel");
        if (!a(map, "isVip", "vip", "VIP", "isMember")) {
            String strF = f(c0256f1.g);
            if (TextUtils.isEmpty(strF)) {
                z2 = false;
            } else {
                String lowerCase = strF.toLowerCase();
                if (lowerCase.contains("普通") || lowerCase.contains("none") || lowerCase.contains("unpaid") || lowerCase.contains("free") || lowerCase.contains("normal") || lowerCase.contains("unknown")) {
                    z2 = false;
                }
            }
        }
        c0256f1.h = z2;
        c0256f1.i = d(map, "expire_time", "expireTime", "vip_expire", "vipExpire", "expiresAt", "expireText");
        c0256f1.j = d(map, "total_capacity", "totalCapacity", "quota_total", "quotaTotal");
        c0256f1.k = d(map, "used_capacity", "usedCapacity", "quota_used", "quotaUsed");
        c0256f1.l = d(map, "usage_percent", "usagePercent");
        c0256f1.m = d(map, "cookie", "cookies");
        c0256f1.n = d(map, "token", "access_token", "authToken");
        c0256f1.o = a(map, "member_status_unavailable", "memberUnavailable");
        if (c0256f1.b && TextUtils.isEmpty(c0256f1.c)) {
            c0256f1.c = str;
        }
        return c0256f1;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains("svip") || lowerCase.contains("super")) {
            return "SVIP";
        }
        if (lowerCase.contains("vip")) {
            return "VIP";
        }
        if (str.contains("普通") || str.contains("未开通") || str.contains("尚未") || lowerCase.contains("none") || lowerCase.contains("unpaid") || lowerCase.contains("normal") || lowerCase.contains("free")) {
            return "普通用户";
        }
        return (str.indexOf(65533) >= 0 || str.indexOf(63) >= 0) ? "" : str;
    }

    public final String b(String str) {
        return this.b ? c("已登录") : str;
    }

    public final String c(String str) {
        if (!TextUtils.isEmpty(this.c)) {
            return this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        if (TextUtils.isEmpty(this.e)) {
            return !TextUtils.isEmpty(this.f) ? this.f : str;
        }
        return this.e;
    }
}
