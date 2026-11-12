package com.github.catvod.spider.merge.A;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0267j0 {
    public static final Pattern k = Pattern.compile("bytes\\s+(\\d+)-(\\d+)/(\\d+)");
    public static final Pattern l = Pattern.compile("bytes=(\\d+)-(\\d*)");
    public static final byte[] m = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] n = {-1, -40, -1, 26, 69, -33, -93};
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final long f;
    public long g;
    public long h;
    public volatile long i;
    public volatile boolean j = true;
    public final HashMap a = new HashMap();

    public C0267j0(String str, HashMap map, int i, int i2, boolean z) {
        long[] jArr;
        this.d = str;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(((String) entry.getKey()).toLowerCase(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!((String) entry2.getKey()).toLowerCase().equals("host")) {
                this.a.put((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        String str2 = (String) map2.get("range");
        long j = -1;
        if (str2 != null) {
            if (str2.isEmpty()) {
                jArr = new long[]{0, -1};
            } else {
                Matcher matcher = l.matcher(str2);
                if (!matcher.find() || matcher.groupCount() < 2) {
                    jArr = new long[]{0, -1};
                } else {
                    try {
                        long j2 = Long.parseLong(matcher.group(1));
                        String strGroup = matcher.group(2);
                        if (strGroup != null && !strGroup.isEmpty()) {
                            j = Long.parseLong(strGroup);
                        }
                        jArr = new long[]{j2, j};
                    } catch (NumberFormatException unused) {
                        jArr = new long[]{0, -1};
                    }
                }
            }
            this.f = jArr[0];
            this.g = jArr[1];
        } else {
            this.f = 0L;
            this.g = -1L;
        }
        this.b = i;
        this.c = (i2 > 256 ? 256 : i2) * 1024;
        this.e = z;
        this.h = 0L;
    }

    public final void a(URLConnection uRLConnection, long j, long j2) {
        uRLConnection.setConnectTimeout(10000);
        uRLConnection.setReadTimeout(30000);
        for (Map.Entry entry : this.a.entrySet()) {
            uRLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        uRLConnection.setRequestProperty("Range", String.format("bytes=%d-%d", Long.valueOf(j + this.h), Long.valueOf((j2 - 1) + this.h)));
        uRLConnection.setRequestProperty("Accept-Encoding", "identity");
    }

    public final C0261h0 b(long j, long j2, int i) throws Exception {
        int i2 = 0;
        Exception e = null;
        int i3 = 0;
        while (i3 < i) {
            try {
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(this.d).openConnection();
                    a(uRLConnectionOpenConnection, j, j2);
                    int responseCode = ((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        throw new IOException("请求失败: " + responseCode);
                    }
                    HashMap map = new HashMap();
                    for (Map.Entry<String, List<String>> entry : uRLConnectionOpenConnection.getHeaderFields().entrySet()) {
                        if (entry.getKey() != null) {
                            String key = entry.getKey();
                            List<String> value = entry.getValue();
                            StringBuilder sb = new StringBuilder();
                            for (int i4 = 0; i4 < value.size(); i4++) {
                                if (i4 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(value.get(i4));
                            }
                            map.put(key, sb.toString());
                        }
                    }
                    InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i5 = inputStream.read(bArr, 0, 4096);
                        if (i5 == -1) {
                            byteArrayOutputStream.flush();
                            return new C0261h0(byteArrayOutputStream.toByteArray(), map, i2);
                        }
                        byteArrayOutputStream.write(bArr, 0, i5);
                    }
                } catch (Exception e2) {
                    e = e2;
                    i3++;
                    if (i3 < i) {
                        Thread.sleep(3000L);
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        throw new Exception(String.format("达到最大重试次数 (%d)", Integer.valueOf(i)), e);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c7 A[EDGE_INSN: B:44:0x00c7->B:45:0x00c8 BREAK  A[LOOP:2: B:37:0x00b8->B:42:0x00c2]] */
    public final Object[] c() throws Exception {
        int i;
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream, 524288);
        this.i = this.f;
        HashMap map = new HashMap();
        long j = this.g;
        long jMin = Math.min(j <= 0 ? 100L : j + 1, this.c);
        long j2 = this.f;
        C0261h0 c0261h0B = b(j2, jMin + j2, 1);
        Map map2 = (Map) c0261h0B.c;
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), (String) entry.getValue());
        }
        String str = (String) map2.get("Content-Range");
        if (str == null) {
            throw new IOException("未获取到Content-Range头");
        }
        Matcher matcher = k.matcher(str);
        if (!matcher.find() || matcher.groupCount() != 3) {
            throw new IOException("无效的Content-Range头: ".concat(str));
        }
        long j3 = Long.parseLong(matcher.group(3));
        boolean z = this.e;
        byte[] bArr = (byte[]) c0261h0B.b;
        if (!z) {
            i = 0;
            break;
        }
        byte[] bArr2 = m;
        if (bArr == null || bArr.length < bArr2.length) {
            byte[] bArr3 = n;
            if (bArr == null || bArr.length < bArr3.length) {
                i = 0;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= bArr3.length) {
                    i = 3;
                    break;
                }
                if (bArr[i2] != bArr3[i2]) {
                    i = 0;
                    break;
                }
                i2++;
            }
        } else {
            int i3 = 0;
            while (true) {
                if (i3 >= bArr2.length) {
                    i = 8;
                } else {
                    if (bArr[i3] != bArr2[i3]) {
                        byte[] bArr4 = n;
                        if (bArr == null) {
                            i = 0;
                            break;
                        }
                        i = 0;
                        break;
                    }
                    i3++;
                }
            }
        }
        if (i > 0) {
            long j4 = i;
            if (j3 > 2 * j4) {
                this.h = j4;
                j3 -= j4;
                int length = bArr.length - i;
                byte[] bArr5 = new byte[length];
                System.arraycopy(bArr, i, bArr5, 0, length);
                if (i == 3) {
                    map.put("Content-Type", "video/x-matroska");
                }
                bArr = bArr5;
            }
        }
        if (this.g <= 0) {
            this.g = j3 - 1;
        }
        map.put("Content-Range", String.format("bytes %d-%d/%d", Long.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(j3)));
        map.remove("Content-Length");
        Object[] objArr = {Long.valueOf(j2 + ((long) bArr.length)), Long.valueOf(this.g), bArr};
        new Thread(new RunnableC0258g0(this, pipedOutputStream, (byte[]) objArr[2], ((Long) objArr[0]).longValue(), 1 + ((Long) objArr[1]).longValue(), this.c, this.b, new ArrayList(), Executors.newFixedThreadPool(this.b))).start();
        String str2 = (String) map.get("Content-Type");
        if (str2 == null) {
            str2 = "video/mp4";
        }
        return new Object[]{206, str2, new C0264i0(this, pipedInputStream), map};
    }
}
