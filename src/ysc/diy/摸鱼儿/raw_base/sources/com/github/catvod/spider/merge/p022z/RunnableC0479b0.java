package com.github.catvod.spider.merge.p022z;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p017u.W;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0479b0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0479b0(ImageView imageView, Bitmap bitmap, int i, int i2) {
        this.b = imageView;
        this.e = bitmap;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007a A[Catch: all -> 0x00d0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:14:0x0045, B:41:0x00c0, B:23:0x007a, B:48:0x00cf, B:47:0x00cc, B:44:0x00c7, B:15:0x005e, B:17:0x0064, B:20:0x006b, B:25:0x007e, B:27:0x0089, B:30:0x008f, B:31:0x009c, B:34:0x00a5, B:40:0x00b0), top: B:54:0x0045, inners: #1, #2 }] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = (String) this.e;
                Bitmap bitmap = null;
                try {
                    Response responseExecute = X1.q().newCall(new Request.Builder().url(str).build()).execute();
                    try {
                        if (!responseExecute.isSuccessful() || responseExecute.body() == null || responseExecute.body().contentLength() > 4194304) {
                            responseExecute.close();
                        } else {
                            byte[] bArrBytes = responseExecute.body().bytes();
                            if (bArrBytes.length == 0 || bArrBytes.length > 4194304) {
                                responseExecute.close();
                            } else {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                int i = 1;
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeByteArray(bArrBytes, 0, bArrBytes.length, options);
                                while (true) {
                                    int i2 = i * 2;
                                    if (options.outWidth / i2 >= this.c && options.outHeight / i2 >= this.d) {
                                        i = i2;
                                    }
                                }
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inSampleSize = i;
                                options2.inPreferredConfig = Bitmap.Config.RGB_565;
                                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrBytes, 0, bArrBytes.length, options2);
                                responseExecute.close();
                                bitmap = bitmapDecodeByteArray;
                            }
                        }
                    } catch (Throwable th) {
                        if (responseExecute != null) {
                            try {
                                responseExecute.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            break;
                        }
                        throw th;
                    }
                } catch (Throwable unused) {
                }
                if (bitmap == null) {
                    return;
                }
                AbstractC0484c0.a.put(str, bitmap);
                InitOrigin.run(new W(str, this.b, bitmap));
                return;
            default:
                ImageView imageView = this.b;
                int width = imageView.getWidth();
                if (width <= 0) {
                    return;
                }
                Bitmap bitmap2 = (Bitmap) this.e;
                int iRound = Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * width);
                int i3 = this.c;
                int iB = C2.b(iRound, i3, Math.max(i3, this.d));
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null || layoutParams.height == iB) {
                    return;
                }
                layoutParams.height = iB;
                imageView.setLayoutParams(layoutParams);
                return;
        }
    }

    public /* synthetic */ RunnableC0479b0(String str, int i, int i2, ImageView imageView) {
        this.e = str;
        this.c = i;
        this.d = i2;
        this.b = imageView;
    }
}
