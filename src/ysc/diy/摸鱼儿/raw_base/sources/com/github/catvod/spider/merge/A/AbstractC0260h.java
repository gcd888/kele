package com.github.catvod.spider.merge.A;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0260h {
    public static final ExecutorService a = Executors.newFixedThreadPool(16, new ThreadFactoryC0254f(0));
    public static final ThreadPoolExecutor b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 30, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC0254f(1));

    public static ArrayList a(ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.isEmpty()) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList3.add(a.submit((Callable) arrayList.get(i2)));
        }
        long jCurrentTimeMillis = (((long) i) * 1000) + System.currentTimeMillis();
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            Future future = (Future) arrayList3.get(i3);
            try {
                long jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis();
                if (jCurrentTimeMillis2 <= 0) {
                    future.cancel(true);
                    arrayList2.add(null);
                } else {
                    arrayList2.add(future.get(jCurrentTimeMillis2, TimeUnit.MILLISECONDS));
                }
            } catch (Exception unused) {
                future.cancel(true);
                arrayList2.add(null);
            }
        }
        return arrayList2;
    }

    public static C0257g b(String str, ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            String strTrim = ((String) arrayList.get(i)).trim();
            if (strTrim.endsWith("/")) {
                strTrim = com.github.catvod.spider.merge.D.b.g(strTrim, 1, 0);
            }
            if (!strTrim.isEmpty()) {
                arrayList2.add(strTrim);
            }
        }
        StringBuilder sbP = com.github.catvod.spider.merge.D.b.p(str, "_");
        sbP.append(arrayList2.hashCode());
        String string = sbP.toString();
        if (arrayList2.isEmpty()) {
            return new C0257g(arrayList2, string, z, "");
        }
        String strH = C0297t1.h(string);
        if (!strH.isEmpty() && arrayList2.contains(strH) && c(strH)) {
            return new C0257g(arrayList2, string, z, strH);
        }
        String strE = e(arrayList2);
        if (strE.isEmpty()) {
            return new C0257g(arrayList2, string, z, (String) arrayList2.get(0));
        }
        C0297t1.j(string, strE);
        return new C0257g(arrayList2, string, z, strE);
    }

    public static boolean c(String str) {
        return d(str, "HEAD") || d(str, "GET");
    }

    public static boolean d(String str, String str2) throws Throwable {
        boolean z = false;
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setConnectTimeout(5000);
                httpURLConnection2.setReadTimeout(5000);
                httpURLConnection2.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
                httpURLConnection2.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/json;q=0.9,*/*;q=0.8");
                httpURLConnection2.setRequestMethod(str2);
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode >= 200 && responseCode < 400) {
                    z = true;
                }
                try {
                    httpURLConnection2.disconnect();
                } catch (Exception unused) {
                }
                return z;
            } catch (Exception unused2) {
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused3) {
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        if (arrayList.size() == 1) {
            return c((String) arrayList.get(0)) ? (String) arrayList.get(0) : "";
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
        AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b.submit(new r((String) it.next(), linkedBlockingQueue, atomicInteger, 2));
        }
        try {
            String str = (String) linkedBlockingQueue.poll(12L, TimeUnit.SECONDS);
            return str != null ? str : "";
        } catch (InterruptedException unused) {
            return "";
        }
    }
}
