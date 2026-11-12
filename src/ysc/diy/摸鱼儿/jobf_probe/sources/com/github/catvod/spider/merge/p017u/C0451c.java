package com.github.catvod.spider.merge.p017u;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class C0451c implements Interceptor {
    public final /* synthetic */ int a;

    public final Response intercept(Interceptor.Chain chain) {
        switch (this.a) {
            case 0:
                Request request = chain.request();
                Headers headers = (Headers) request.tag(Headers.class);
                if (headers != null) {
                    Request.Builder builderHeaders = request.newBuilder().headers(headers);
                    if (headers.get("Host") == null) {
                        builderHeaders.header("Host", request.header("Host"));
                    }
                    request = builderHeaders.build();
                }
                return chain.proceed(request);
            case 1:
                Request request2 = chain.request();
                Headers headers2 = (Headers) request2.tag(Headers.class);
                if (headers2 != null) {
                    Request.Builder builderHeaders2 = request2.newBuilder().headers(headers2);
                    String[] strArr = {"Host", "Content-Length", "Transfer-Encoding"};
                    for (int i = 0; i < 3; i++) {
                        String str = strArr[i];
                        if (headers2.get(str) == null && request2.header(str) != null) {
                            builderHeaders2.header(str, request2.header(str));
                        }
                    }
                    request2 = builderHeaders2.build();
                }
                return chain.proceed(request2);
            case 2:
                Request request3 = chain.request();
                Headers headers3 = (Headers) request3.tag(Headers.class);
                if (headers3 != null) {
                    Request.Builder builderHeaders3 = request3.newBuilder().headers(headers3);
                    String[] strArr2 = {"Host", "Content-Length", "Transfer-Encoding"};
                    for (int i2 = 0; i2 < 3; i2++) {
                        String str2 = strArr2[i2];
                        if (headers3.get(str2) == null && request3.header(str2) != null) {
                            builderHeaders3.header(str2, request3.header(str2));
                        }
                    }
                    request3 = builderHeaders3.build();
                }
                return chain.proceed(request3);
            case 3:
                Request request4 = chain.request();
                Headers headers4 = (Headers) request4.tag(Headers.class);
                if (headers4 != null) {
                    Request.Builder builderHeaders4 = request4.newBuilder().headers(headers4);
                    if (headers4.get("Host") == null) {
                        builderHeaders4.header("Host", request4.header("Host"));
                    }
                    if (headers4.get("Content-Length") == null && request4.header("Content-Length") != null) {
                        builderHeaders4.header("Content-Length", request4.header("Content-Length"));
                    }
                    request4 = builderHeaders4.build();
                }
                return chain.proceed(request4);
            default:
                Request request5 = chain.request();
                Headers headers5 = (Headers) request5.tag(Headers.class);
                if (headers5 != null) {
                    Request.Builder builderHeaders5 = request5.newBuilder().headers(headers5);
                    String[] strArr3 = {"Host", "Content-Length", "Transfer-Encoding"};
                    for (int i3 = 0; i3 < 3; i3++) {
                        String str3 = strArr3[i3];
                        if (headers5.get(str3) == null && request5.header(str3) != null) {
                            builderHeaders5.header(str3, request5.header(str3));
                        }
                    }
                    request5 = builderHeaders5.build();
                }
                return chain.proceed(request5);
        }
    }
}
