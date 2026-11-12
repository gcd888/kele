package com.github.catvod.spider.merge.T;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class Q implements CookieJar {
    public final HashMap a;

    public Q(int i) {
        switch (i) {
            case 1:
                this.a = new HashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    public void a() {
        synchronized (this.a) {
            this.a.clear();
        }
    }

    public void b(String str, String str2) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl == null) {
            return;
        }
        c(httpUrl, str2);
    }

    public void c(HttpUrl httpUrl, String str) {
        Cookie cookie;
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(";")) {
            String strTrim = str2.trim();
            if (!strTrim.isEmpty() && strTrim.indexOf(61) > 0 && (cookie = Cookie.parse(httpUrl, strTrim)) != null) {
                arrayList.add(cookie);
            }
        }
        saveFromResponse(httpUrl, arrayList);
    }

    public List loadForRequest(HttpUrl httpUrl) {
        if (httpUrl == null) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            try {
                List<Cookie> list = (List) this.a.get(httpUrl.host());
                if (list != null && !list.isEmpty()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList = new ArrayList();
                    for (Cookie cookie : list) {
                        if (cookie.expiresAt() > jCurrentTimeMillis && cookie.matches(httpUrl)) {
                            arrayList.add(cookie);
                        }
                    }
                    if (arrayList.size() != list.size()) {
                        if (arrayList.isEmpty()) {
                            this.a.remove(httpUrl.host());
                        } else {
                            this.a.put(httpUrl.host(), arrayList);
                        }
                    }
                    return arrayList;
                }
                return Collections.emptyList();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void saveFromResponse(HttpUrl httpUrl, List list) {
        if (httpUrl == null || list == null || list.isEmpty()) {
            return;
        }
        synchronized (this.a) {
            try {
                ArrayList arrayList = new ArrayList();
                List<Cookie> list2 = (List) this.a.get(httpUrl.host());
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (list2 != null) {
                    for (Cookie cookie : list2) {
                        if (cookie.expiresAt() > jCurrentTimeMillis) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    arrayList.add(cookie);
                                    break;
                                }
                                Cookie cookie2 = (Cookie) it.next();
                                if (cookie2.name().equals(cookie.name()) && cookie2.domain().equals(cookie.domain()) && cookie2.path().equals(cookie.path())) {
                                    break;
                                }
                            }
                        }
                    }
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Cookie cookie3 = (Cookie) it2.next();
                    if (cookie3.expiresAt() > jCurrentTimeMillis) {
                        arrayList.add(cookie3);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.a.remove(httpUrl.host());
                } else {
                    this.a.put(httpUrl.host(), arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
