package com.github.catvod.spider.merge.p000a;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Environment;
import android.text.TextUtils;
import com.github.catvod.spider.Bili;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.I0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p005f.j;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.E;
import com.github.catvod.spider.merge.p022z.P1;
import com.google.gson.JsonObject;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class V implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ V(long j, String str, String str2, String str3, HashMap map) {
        this.a = 1;
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.f = map;
        this.d = j;
    }

    private final void a() {
        String str = this.b;
        String str2 = this.c;
        String str3 = (String) this.e;
        Map map = (Map) this.f;
        long j = this.d;
        try {
            if (A.j().k() != j) {
                return;
            }
            HashMap map2 = map == null ? new HashMap() : new HashMap(map);
            map2.put("Origin", "https://www.bilibili.com");
            map2.put("Referer", "https://www.bilibili.com/video/av" + str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("aid", str);
            linkedHashMap.put("cid", str2);
            linkedHashMap.put("progress", "0");
            linkedHashMap.put("csrf", str3);
            if (A.j().k() != j) {
                return;
            }
            JsonObject jsonObjectC = I0.c(X1.N(Bili.api("/x/v2/history/report"), linkedHashMap, map2).a());
            if (!jsonObjectC.has("code") || jsonObjectC.get("code").getAsInt() == 0) {
                return;
            }
            HashMap map3 = j.c;
            synchronized (map3) {
                try {
                    map3.remove(j + "|" + str + "+" + str2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
            HashMap map4 = j.c;
            synchronized (map4) {
                map4.remove(j + "|" + str + "+" + str2);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strE0;
        switch (this.a) {
            case 0:
                C0342a0 c0342a0 = (C0342a0) this.e;
                String str = this.b;
                String str2 = this.c;
                long j = this.d;
                Y y = (Y) this.f;
                c0342a0.getClass();
                try {
                    if (c0342a0.G() && str.equals(c0342a0.o0())) {
                        synchronized (c0342a0.b) {
                            try {
                                synchronized (c0342a0.a) {
                                    if (str.equals(c0342a0.o0())) {
                                        String str3 = (String) c0342a0.k.get(str2);
                                        if (TextUtils.isEmpty(str3)) {
                                            c0342a0.B(y, str, j, str2);
                                        } else {
                                            c0342a0.e0(j, c0342a0.u, str3, str);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    break;
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    c0342a0.j.remove(str2);
                    throw th2;
                }
                c0342a0.j.remove(str2);
                return;
            case 1:
                a();
                return;
            default:
                Runnable runnable = (Runnable) this.e;
                String str4 = this.b;
                String str5 = this.c;
                String strJ0 = (String) this.f;
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null || activity.isFinishing()) {
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    try {
                        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        try {
                            strE0 = P1.C0(externalStoragePublicDirectory, P1.E0(str4)).getName();
                            break;
                        } catch (Exception unused2) {
                            strE0 = P1.E0(str4);
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        if (TextUtils.isEmpty(str5)) {
                            str5 = "网盘文件";
                        }
                        int i = AbstractC0583w0.c;
                        P1.q(arrayList, arrayList2, "来源", str5, i);
                        if (TextUtils.isEmpty(strJ0)) {
                            strJ0 = P1.j0(str4);
                        }
                        P1.q(arrayList, arrayList2, "类型", strJ0, AbstractC0583w0.d);
                        long j2 = this.d;
                        if (j2 > 0) {
                            P1.q(arrayList, arrayList2, "大小", P1.a0(j2), AbstractC0583w0.f);
                        }
                        if (!TextUtils.equals(strE0, str4)) {
                            P1.q(arrayList, arrayList2, "保存名称", strE0, i);
                        }
                        P1.q(arrayList, arrayList2, "保存到", externalStoragePublicDirectory.getAbsolutePath(), AbstractC0583w0.i);
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                        String[][] strArr = (String[][]) arrayList.toArray(new String[0][]);
                        int[] iArr = new int[arrayList2.size()];
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            iArr[i2] = ((Integer) arrayList2.get(i2)).intValue();
                        }
                        AbstractC0583w0.j0(builder.setView(AbstractC0583w0.p0(P1.K(activity, "下载确认", str4, i, strArr, iArr))).setPositiveButton("下载", new E(runnable, 1)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
                        return;
                    } catch (Exception e) {
                        b.D(e, new StringBuilder("[DownloadDialog] showConfirm error: "));
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                } catch (Exception unused3) {
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ V(C0342a0 c0342a0, String str, String str2, long j, Y y) {
        this.a = 0;
        this.e = c0342a0;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.f = y;
    }

    public /* synthetic */ V(Runnable runnable, String str, String str2) {
        this.a = 2;
        this.e = runnable;
        this.b = str;
        this.c = str2;
        this.f = null;
        this.d = 0L;
    }
}
