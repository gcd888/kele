package com.github.catvod.spider.merge.A;

import android.os.SystemClock;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Wallpaper;
import com.github.catvod.spider.merge.p022z.C0568t0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import okhttp3.Credentials;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class a2 {
    public static final Pattern h = Pattern.compile("moyubackup_(\\d{8}_\\d{4}(?:\\d{2})?)\\.zip");
    public volatile boolean a = false;
    public int b = 0;
    public int c = 0;
    public final X1 d;
    public final OkHttpClient e;
    public volatile String f;
    public volatile boolean g;

    public a2() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.e = builder.connectTimeout(30L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).build();
        X1 x1 = new X1(0, this);
        this.f = "";
        this.g = false;
        this.d = new X1(16, x1);
    }

    public static String a(String str) {
        Matcher matcher = h.matcher(str);
        if (!matcher.matches()) {
            return str;
        }
        String strGroup = matcher.group(1);
        return strGroup.length() == 13 ? strGroup.concat("00") : strGroup;
    }

    public static byte[] c() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
            File fileE = C0297t1.e();
            if (fileE.exists() && fileE.isDirectory()) {
                File[] fileArrListFiles = fileE.listFiles();
                int i = 0;
                if (fileArrListFiles != null) {
                    int i2 = 0;
                    for (File file : fileArrListFiles) {
                        if (file.isFile() && file.length() > 0 && !r(file.getName())) {
                            zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                            FileInputStream fileInputStream = new FileInputStream(file);
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i3 = fileInputStream.read(bArr);
                                if (i3 <= 0) {
                                    break;
                                }
                                zipOutputStream.write(bArr, 0, i3);
                            }
                            fileInputStream.close();
                            zipOutputStream.closeEntry();
                            i2++;
                        }
                    }
                    i = i2;
                }
                zipOutputStream.close();
                if (i > 0) {
                    return byteArrayOutputStream.toByteArray();
                }
                return null;
            }
            zipOutputStream.close();
            return null;
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[WebDAV] 压缩异常: "));
            return null;
        }
    }

    public static Y1 d() {
        String[] strArrS = s();
        if (strArrS == null) {
            return null;
        }
        return new Y1(strArrS[0], strArrS[1], strArrS[2]);
    }

    public static void e(String str, String str2, OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(new Request.Builder().url(str).header("Authorization", str2).method("MKCOL", (RequestBody) null).build()).execute();
            try {
                if (!responseExecute.isSuccessful()) {
                    responseExecute.code();
                }
                responseExecute.close();
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
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[WebDAV] 创建目录异常: "));
        }
    }

    public static byte[] g(String str) throws Exception {
        com.github.catvod.spider.merge.p000a.A0 a0S = com.github.catvod.spider.merge.p000a.A0.s();
        Exception e = null;
        for (int i = 0; i < 3; i++) {
            try {
                Response responseH = X1.H(a0S.E(str), a0S.D());
                try {
                    if (responseH.isSuccessful() && responseH.body() != null) {
                        byte[] bArrBytes = responseH.body().bytes();
                        responseH.close();
                        return bArrBytes;
                    }
                    throw new Exception("下载夸克备份失败：HTTP " + responseH.code());
                } catch (Throwable th) {
                    if (responseH != null) {
                        try {
                            responseH.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                if (i < 2) {
                    SystemClock.sleep(500 << i);
                }
            }
        }
        if (e == null) {
            throw new Exception("下载夸克备份失败");
        }
        throw e;
    }

    public static void h(String str, String str2, OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(new Request.Builder().url(str).header("Authorization", str2).method("PROPFIND", RequestBody.create(MediaType.parse("application/xml"), "<?xml version=\"1.0\"?><d:propfind xmlns:d=\"DAV:\"><d:prop><d:displayname/></d:prop></d:propfind>")).build()).execute();
            int iCode = responseExecute.code();
            responseExecute.close();
            if (iCode != 207 && iCode != 200) {
                e(str, str2, okHttpClient);
            }
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[WebDAV] 创建目录异常: "));
        }
    }

    public static boolean i(byte[] bArr) {
        String string;
        try {
            com.github.catvod.spider.merge.p010l.a.i();
            x(bArr);
            File fileE = C0297t1.e();
            if (!fileE.exists()) {
                fileE.mkdirs();
            }
            ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            int i = 0;
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                String name = nextEntry.getName();
                if (r(name)) {
                    zipInputStream.closeEntry();
                } else {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(fileE, name));
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int i2 = zipInputStream.read(bArr2);
                        if (i2 <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr2, 0, i2);
                    }
                    fileOutputStream.close();
                    zipInputStream.closeEntry();
                    i++;
                    if ("wallpaper_selected".equals(name)) {
                        z = true;
                    }
                    if ("smart_behavior.json".equals(name)) {
                        z2 = true;
                    }
                    if ("smart_follows.json".equals(name)) {
                        z3 = true;
                    }
                }
            }
            zipInputStream.close();
            if (z) {
                Wallpaper.invalidateSelectedImageAfterRestore();
            }
            if (z2 && !z3) {
                C0297t1.b("smart_follows.json");
            }
            if (i > 0) {
                String strH = C0297t1.h(".fishdrive_config");
                if (!strH.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(strH);
                    if (jSONObject.has("deviceId")) {
                        jSONObject.remove("deviceId");
                        string = jSONObject.toString();
                    } else {
                        string = strH;
                    }
                    if (!strH.equals(string)) {
                        C0297t1.j(".fishdrive_config", string);
                    }
                }
            }
            synchronized (AbstractC0251e.a) {
                try {
                    AbstractC0251e.e = null;
                    AbstractC0251e.f = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i > 0;
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[WebDAV] 解压异常: "));
            return false;
        }
    }

    public static S0 l() throws Exception {
        com.github.catvod.spider.merge.p000a.A0 a0S = com.github.catvod.spider.merge.p000a.A0.s();
        String strP = a0S.p("moyu_backup");
        if (strP.isEmpty()) {
            return null;
        }
        S0 s0 = null;
        int i = 1;
        while (true) {
            JSONObject jSONObject = new JSONObject(a0S.Z(i, strP));
            if (jSONObject.has("error")) {
                throw new Exception(jSONObject.optString("error", "查询夸克备份失败"));
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject == null ? null : jSONObjectOptJSONObject.optJSONArray("list");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optInt("file_type", 1) != 0) {
                        String strOptString = jSONObjectOptJSONObject2.optString("file_name");
                        if (h.matcher(strOptString).matches()) {
                            String strOptString2 = jSONObjectOptJSONObject2.optString("fid");
                            if (!strOptString2.isEmpty() && (s0 == null || strOptString.compareTo(s0.b) > 0)) {
                                s0 = new S0(strOptString, 2, strOptString2);
                            }
                        }
                    }
                }
                if (jSONArrayOptJSONArray.length() >= 100) {
                    i++;
                }
            }
            return s0;
        }
    }

    public static void m(C0568t0 c0568t0, String str, long j) {
        if (c0568t0 == null) {
            InitOrigin.run(new V0(str, 2));
        } else {
            InitOrigin.run(new RunnableC0242b(str, (Object) c0568t0, 6), (int) Math.max(0L, j - SystemClock.elapsedRealtime()));
        }
    }

    public static String n(String str) {
        try {
            Matcher matcher = h.matcher(str);
            if (!matcher.find()) {
                return str;
            }
            boolean z = true;
            String strGroup = matcher.group(1);
            if (strGroup.length() != 15) {
                z = false;
            }
            return new SimpleDateFormat(z ? "yyyy年MM月dd日 HH:mm:ss" : "yyyy年MM月dd日 HH:mm", Locale.getDefault()).format(new SimpleDateFormat(z ? "yyyyMMdd_HHmmss" : "yyyyMMdd_HHmm", Locale.getDefault()).parse(strGroup));
        } catch (Exception unused) {
            return str;
        }
    }

    public static String o() {
        String[] strArrS = s();
        if (strArrS != null) {
            return strArrS[0];
        }
        return null;
    }

    public static String p() {
        String strO = o();
        if (strO == null) {
            return null;
        }
        if (!strO.endsWith("/")) {
            strO = strO.concat("/");
        }
        return com.github.catvod.spider.merge.D.b.i(strO, "moyu_backup/");
    }

    public static boolean r(String str) {
        return "webdav_config".equals(str) || "webdav_last_version".equals(str) || "quark_last_version".equals(str) || "webdav_config_auto_sync_enabled".equals(str) || "playback_sync_v2".equals(str) || "playback_sync_install_id".equals(str) || "playback_sync_v3_meta".equals(str) || "smart_history_sync_enabled".equals(str) || "smart_history_sync_quark_enabled".equals(str) || "smart_history_project_enabled".equals(str) || "smart_history_sync_backend".equals(str) || "smart_history_sync_status".equals(str) || "smart_history_sync_quark_status".equals(str) || ".fishdrive_device".equals(str) || ".fishdrive_auth".equals(str);
    }

    public static String[] s() {
        try {
            String strH = C0297t1.h("webdav_config");
            if (strH.isEmpty()) {
                return null;
            }
            String[] strArrSplit = strH.split("\\|", 3);
            if (strArrSplit.length == 3) {
                return strArrSplit;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void u(String str, boolean z) {
        if (str != null) {
            try {
                if (str.isEmpty()) {
                    return;
                }
                C0297t1.j(z ? "quark_last_version" : "webdav_last_version", str);
            } catch (Exception unused) {
            }
        }
    }

    public static void v(String str, byte[] bArr) throws Exception {
        com.github.catvod.spider.merge.p000a.A0 a0S = com.github.catvod.spider.merge.p000a.A0.s();
        String strR0 = a0S.r0(a0S.m("moyu_backup"), str, bArr, "application/zip");
        byte[] bArrG = g(strR0);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        if (MessageDigest.isEqual(messageDigest.digest(bArr), messageDigest.digest(bArrG))) {
            return;
        }
        try {
            a0S.k(strR0);
        } catch (Exception unused) {
        }
        throw new Exception("上传后校验失败");
    }

    public static void x(byte[] bArr) throws IOException {
        String name;
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
        do {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                } else if (nextEntry.isDirectory() || (name = nextEntry.getName()) == null || name.isEmpty() || ".".equals(name) || "..".equals(name) || name.indexOf(47) >= 0) {
                    break;
                }
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } while (name.indexOf(92) < 0);
        throw new IllegalStateException("配置备份包含非法路径");
    }

    public final void b() {
        boolean zQ = k2.q();
        if (this.a || !k2.m(zQ)) {
            return;
        }
        if (!FishCrypto.k()) {
            int i = this.b;
            this.b = i + 1;
            if (i < 10) {
                InitOrigin.run(new O1(this, 0), 3000);
                return;
            }
            return;
        }
        if (FishCrypto.i(6, "autoSync")) {
            this.a = true;
            if ("quark".equals(C0297t1.h("webdav_config_auto_sync_enabled")) && C0297t1.h("quark_last_version").isEmpty()) {
                String strH = C0297t1.h("webdav_last_version");
                if (!strH.isEmpty()) {
                    C0297t1.j("quark_last_version", strH);
                    if (strH.equals(C0297t1.h("quark_last_version"))) {
                        C0297t1.j("webdav_last_version", "");
                    }
                }
            }
            InitOrigin.execute(new S1(this, zQ, 0));
        }
    }

    public final byte[] f(String str) {
        String strO;
        try {
            String[] strArrS = s();
            String str2 = strArrS != null ? strArrS[1] : null;
            String[] strArrS2 = s();
            String strBasic = Credentials.basic(str2, strArrS2 != null ? strArrS2[2] : null);
            OkHttpClient okHttpClient = this.e;
            if (str == null) {
                str = j();
            }
            if (str == null) {
                InitOrigin.run(new RunnableC0315z1(11));
                return null;
            }
            this.f = str;
            StringBuilder sb = new StringBuilder();
            if (this.g) {
                strO = p();
            } else {
                strO = o();
                if (strO == null) {
                    strO = null;
                } else if (!strO.endsWith("/")) {
                    strO = strO.concat("/");
                }
            }
            sb.append(strO);
            sb.append(str);
            Response responseExecute = okHttpClient.newCall(new Request.Builder().url(sb.toString()).header("Authorization", strBasic).get().build()).execute();
            if (responseExecute.isSuccessful() && responseExecute.body() != null) {
                byte[] bArrBytes = responseExecute.body().bytes();
                responseExecute.close();
                return bArrBytes;
            }
            SpiderDebug.log("[WebDAV] 下载失败: " + responseExecute.code());
            responseExecute.close();
            return null;
        } catch (Exception e) {
            com.github.catvod.spider.merge.D.b.D(e, new StringBuilder("[WebDAV] 下载异常: "));
            return null;
        }
    }

    public final String j() {
        String strO = o();
        if (strO == null) {
            strO = null;
        } else if (!strO.endsWith("/")) {
            strO = strO.concat("/");
        }
        String strK = k(strO);
        if (strK != null) {
            this.g = false;
            return strK;
        }
        String strK2 = k(p());
        if (strK2 != null) {
            this.g = true;
        }
        return strK2;
    }

    public final String k(String str) {
        String[] strArrS = s();
        String str2 = strArrS != null ? strArrS[1] : null;
        String[] strArrS2 = s();
        Response responseExecute = this.e.newCall(new Request.Builder().url(str).header("Authorization", Credentials.basic(str2, strArrS2 != null ? strArrS2[2] : null)).header("Depth", "1").method("PROPFIND", RequestBody.create(MediaType.parse("application/xml"), "<?xml version=\"1.0\" encoding=\"utf-8\"?><d:propfind xmlns:d=\"DAV:\"><d:prop><d:displayname/></d:prop></d:propfind>")).build()).execute();
        try {
            int iCode = responseExecute.code();
            if (iCode == 404) {
                responseExecute.close();
                return null;
            }
            if (iCode != 207 && iCode != 200) {
                throw new IllegalStateException("WebDAV目录查询失败：HTTP " + iCode);
            }
            String strString = responseExecute.body() != null ? responseExecute.body().string() : "";
            ArrayList arrayList = new ArrayList();
            Matcher matcher = h.matcher(strString);
            while (matcher.find()) {
                arrayList.add("moyubackup_" + matcher.group(1) + ".zip");
            }
            if (arrayList.isEmpty()) {
                responseExecute.close();
                return null;
            }
            Collections.sort(arrayList);
            String str3 = (String) arrayList.get(arrayList.size() - 1);
            responseExecute.close();
            return str3;
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
    }

    public final boolean q(String str) {
        if (str != null && str.startsWith("moyu_webdav:")) {
            try {
                String str2 = new String(Base64.decode(str.substring(12), 2), "UTF-8");
                String[] strArr = null;
                if (!str2.isEmpty()) {
                    String[] strArrSplit = str2.split("\\|", 3);
                    if (strArrSplit.length == 3) {
                        strArr = strArrSplit;
                    }
                }
                if (strArr != null) {
                    t(strArr[0], strArr[1], strArr[2]);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void t(String str, String str2, String str3) {
        try {
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append("|");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            sb.append("|");
            if (str3 == null) {
                str3 = "";
            }
            sb.append(str3);
            k2.D(new RunnableC0242b(this, sb.toString(), 5));
        } catch (Exception unused) {
        }
    }

    public final boolean w(String str, byte[] bArr) {
        try {
            String[] strArrS = s();
            String str2 = strArrS != null ? strArrS[1] : null;
            String[] strArrS2 = s();
            String str3 = strArrS2 != null ? strArrS2[2] : null;
            if (o() != null && !o().isEmpty()) {
                if (str2 != null && !str2.isEmpty()) {
                    if (str3 == null) {
                        str3 = "";
                    }
                    String strBasic = Credentials.basic(str2, str3);
                    OkHttpClient okHttpClient = this.e;
                    String strP = p();
                    h(strP, strBasic, okHttpClient);
                    Response responseExecute = okHttpClient.newCall(new Request.Builder().url(strP + str).header("Authorization", strBasic).header("Content-Type", "application/octet-stream").header("Content-Length", String.valueOf(bArr.length)).put(RequestBody.create(MediaType.parse("application/octet-stream"), bArr)).build()).execute();
                    int iCode = responseExecute.code();
                    responseExecute.close();
                    if (iCode == 401) {
                        InitOrigin.run(new RunnableC0315z1(14));
                    } else if (iCode == 403) {
                        InitOrigin.run(new RunnableC0315z1(15));
                    } else if (iCode == 404) {
                        InitOrigin.run(new RunnableC0315z1(16));
                    } else if (iCode == 405) {
                        InitOrigin.run(new RunnableC0315z1(17));
                    } else if (iCode == 409) {
                        InitOrigin.run(new RunnableC0315z1(18));
                    } else if (iCode == 507) {
                        InitOrigin.run(new RunnableC0315z1(19));
                    } else if (iCode < 200 || iCode >= 300) {
                        InitOrigin.run(new T1(iCode, 0));
                    }
                    return iCode >= 200 && iCode < 300;
                }
                InitOrigin.run(new RunnableC0315z1(13));
                return false;
            }
            InitOrigin.run(new RunnableC0315z1(12));
            return false;
        } catch (Exception e) {
            SpiderDebug.log("[WebDAV] 上传异常: " + e.getMessage());
            InitOrigin.run(new U1(e, 0));
            return false;
        }
    }
}
