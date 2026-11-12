package com.github.catvod.spider.merge.A;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0264i0 extends InputStream {
    public final InputStream a;
    public final /* synthetic */ C0267j0 b;

    public C0264i0(C0267j0 c0267j0, PipedInputStream pipedInputStream) {
        this.b = c0267j0;
        this.a = pipedInputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.j = false;
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.a.read();
        if (i >= 0) {
            this.b.i++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 > 0) {
            this.b.i += (long) i3;
        }
        return i3;
    }
}
