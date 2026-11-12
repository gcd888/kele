package com.github.catvod.spider.merge.p022z;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Wallpaper;
import com.github.catvod.spider.merge.A.B;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p001b.k;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class h4 {
    public static final Handler a = new Handler(Looper.getMainLooper());
    public static final int b = Color.parseColor("#1A1A1A");
    public static final int c = Color.parseColor("#80000000");

    public static void a(Activity activity, LinearLayout linearLayout, List list) {
        int i = 8;
        for (int i2 = 0; i2 < list.size(); i2++) {
            k kVar = (k) list.get(i2);
            String[] strArrSplit = kVar.b() == null ? new String[0] : kVar.b().split("\\|", -1);
            String strC = "";
            String str = strArrSplit.length > 2 ? strArrSplit[2] : "";
            String strC2 = strArrSplit.length > 4 ? strArrSplit[4] : kVar.c();
            if (TextUtils.isEmpty(strC2)) {
                strC2 = "壁纸";
            }
            String str2 = strArrSplit.length > 5 ? strArrSplit[5] : "";
            String str3 = strArrSplit.length > 6 ? strArrSplit[6] : "";
            if (!TextUtils.isEmpty(str2) && !"0".equals(str2)) {
                strC = b.C(str2, "x", str3);
            }
            int i3 = AbstractC0583w0.a;
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout2.setPadding(AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(10, activity), AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(10, activity));
            linearLayout2.setGravity(16);
            linearLayout2.setFocusable(true);
            int i4 = AbstractC0583w0.c;
            AbstractC0583w0.n(linearLayout2, i4);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = AbstractC0583w0.Q(8, activity);
            linearLayout2.addView(AbstractC0583w0.A(activity, "收藏", i4), layoutParams);
            LinearLayout linearLayout3 = new LinearLayout(activity);
            linearLayout3.setOrientation(1);
            linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView = new TextView(activity);
            textView.setText(strC2);
            textView.setTextSize(14.0f);
            textView.setTextColor(AbstractC0583w0.g);
            textView.setTypeface(null, 1);
            textView.setSingleLine(true);
            linearLayout3.addView(textView);
            if (strC != null && !strC.isEmpty()) {
                TextView textView2 = new TextView(activity);
                textView2.setText(strC);
                textView2.setTextSize(11.0f);
                textView2.setTextColor(AbstractC0583w0.h);
                textView2.setSingleLine(true);
                linearLayout3.addView(textView2);
            }
            linearLayout2.addView(linearLayout3);
            TextView textViewF = AbstractC0583w0.F(activity, "删除", AbstractC0583w0.e, -1);
            textViewF.setTextSize(12.0f);
            textViewF.setPadding(AbstractC0583w0.Q(10, activity), AbstractC0583w0.Q(6, activity), AbstractC0583w0.Q(10, activity), AbstractC0583w0.Q(6, activity));
            textViewF.setOnClickListener(new B(str, linearLayout2, i));
            linearLayout2.addView(textViewF);
            linearLayout.addView(linearLayout2);
            if (i2 < list.size() - 1) {
                View view = new View(activity);
                view.setTag("divider");
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
                view.setBackgroundColor(285212672);
                linearLayout.addView(view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021 A[LOOP:0: B:12:0x0017->B:14:0x0021, LOOP_END] */
    public static int b(int i, int i2, int i3) {
        int i4 = 1;
        if (i > i3 || i2 > i3) {
            int i5 = i / 2;
            int i6 = i2 / 2;
            while (true) {
                if (i5 / i4 < i3 && i6 / i4 < i3) {
                    break;
                }
                i4 *= 2;
            }
            while (((long) (i / i4)) * ((long) (i2 / i4)) > 20000000) {
                i4 *= 2;
            }
            return i4;
        }
        while (((long) (i / i4)) * ((long) (i2 / i4)) > 20000000) {
            i4 *= 2;
        }
        return i4;
    }

    public static LinearLayout c(Application application, Dialog dialog, String str, String str2, String str3, String str4, String[] strArr) {
        LinearLayout linearLayout = new LinearLayout(application);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(AbstractC0583w0.Q(16, application), AbstractC0583w0.Q(40, application), AbstractC0583w0.Q(16, application), AbstractC0583w0.Q(20, application));
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{c, 0}));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        linearLayout.setLayoutParams(layoutParams);
        if (str == null || str.isEmpty() || "壁纸".equals(str)) {
            str = "壁纸预览";
        }
        TextView textView = new TextView(application);
        textView.setText(str);
        textView.setTextSize(18.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setShadowLayer(4.0f, 0.0f, 2.0f, -16777216);
        linearLayout.addView(textView);
        if (str3 == null || str3.isEmpty() || str4 == null || str4.isEmpty() || "0".equals(str3) || "0".equals(str4)) {
            View view = new View(application);
            view.setLayoutParams(new LinearLayout.LayoutParams(1, AbstractC0583w0.Q(12, application)));
            linearLayout.addView(view);
        } else {
            TextView textView2 = new TextView(application);
            textView2.setText(str3 + " × " + str4);
            textView2.setTextSize(12.0f);
            textView2.setTextColor(-7829368);
            textView2.setGravity(17);
            textView2.setPadding(0, AbstractC0583w0.Q(4, application), 0, AbstractC0583w0.Q(12, application));
            linearLayout.addView(textView2);
        }
        LinearLayout linearLayout2 = new LinearLayout(application);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        boolean zIsFavorited = Wallpaper.isFavorited(str2);
        LinearLayout linearLayoutD = d(application, zIsFavorited ? 6 : 5, zIsFavorited ? "已收藏" : "收藏");
        linearLayoutD.setOnClickListener(new B(strArr, linearLayoutD, 9));
        linearLayout2.addView(linearLayoutD);
        LinearLayout linearLayoutD2 = d(application, 0, "保存");
        linearLayoutD2.setOnClickListener(new B(application, strArr, 10));
        linearLayout2.addView(linearLayoutD2);
        LinearLayout linearLayoutD3 = d(application, 1, "壁纸");
        linearLayoutD3.setOnClickListener(new K(application, strArr, dialog, 11));
        linearLayout2.addView(linearLayoutD3);
        LinearLayout linearLayoutD4 = d(application, 3, "关闭");
        linearLayoutD4.setOnClickListener(new ViewOnClickListenerC0531l2(dialog, 1));
        linearLayout2.addView(linearLayoutD4);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    public static LinearLayout d(Application application, int i, String str) {
        LinearLayout linearLayout = new LinearLayout(application);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setPadding(AbstractC0583w0.Q(16, application), AbstractC0583w0.Q(12, application), AbstractC0583w0.Q(16, application), AbstractC0583w0.Q(10, application));
        linearLayout.setFocusable(true);
        linearLayout.setClickable(true);
        ImageView imageView = new ImageView(application);
        int iQ = AbstractC0583w0.Q(24, application);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(iQ, iQ));
        imageView.setImageDrawable(new g4(-1, iQ, i));
        linearLayout.addView(imageView);
        TextView textView = new TextView(application);
        textView.setText(str);
        textView.setTextSize(11.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(0, AbstractC0583w0.Q(6, application), 0, 0);
        linearLayout.addView(textView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-869059789);
        gradientDrawable.setCornerRadius(AbstractC0583w0.Q(14, application));
        gradientDrawable.setStroke(AbstractC0583w0.Q(1, application), 1728053247);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(AbstractC0583w0.c);
        gradientDrawable2.setCornerRadius(AbstractC0583w0.Q(14, application));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        linearLayout.setBackground(stateListDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(AbstractC0583w0.Q(6, application), 0, AbstractC0583w0.Q(6, application), 0);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    public static Bitmap e(String str) {
        try {
            byte[] bArrF = f(str);
            if (bArrF != null && bArrF.length != 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArrF, 0, bArrF.length, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                SpiderDebug.log("[WallpaperDialog] 原图尺寸: " + i + "x" + i2);
                int iB = b(i, i2, 2048);
                StringBuilder sb = new StringBuilder("[WallpaperDialog] 采样率: ");
                sb.append(iB);
                SpiderDebug.log(sb.toString());
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = iB;
                options2.inPreferredConfig = Bitmap.Config.RGB_565;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrF, 0, bArrF.length, options2);
                if (bitmapDecodeByteArray != null) {
                    SpiderDebug.log("[WallpaperDialog] 解码后尺寸: " + bitmapDecodeByteArray.getWidth() + "x" + bitmapDecodeByteArray.getHeight());
                }
                return bitmapDecodeByteArray;
            }
            return null;
        } catch (Exception e) {
            b.D(e, new StringBuilder("[WallpaperDialog] downloadBitmap error: "));
            return null;
        } catch (OutOfMemoryError e2) {
            SpiderDebug.log("[WallpaperDialog] downloadBitmap OOM: " + e2.getMessage());
            System.gc();
            return null;
        }
    }

    public static byte[] f(String str) {
        byte[] bArrG;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strBuildProxyImageUrl = Wallpaper.buildProxyImageUrl(str);
        return (TextUtils.isEmpty(strBuildProxyImageUrl) || strBuildProxyImageUrl.equals(str) || (bArrG = g(strBuildProxyImageUrl)) == null || bArrG.length <= 0) ? g(str) : bArrG;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc A[Catch: Exception -> 0x00df, TRY_LEAVE, TryCatch #1 {Exception -> 0x00df, blocks: (B:60:0x00d7, B:62:0x00dc), top: B:69:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] g(String str) throws Throwable {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            URL url = new URL(str);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(60000);
                String host = url.getHost();
                if (host == null || !host.contains("duitang")) {
                    httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
                } else {
                    httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
                }
                if (host != null && (host.contains("huaban") || host.contains("huabanimg") || host.contains("hb.aicdn.com"))) {
                    httpURLConnection.setRequestProperty("Referer", "https://huaban.com/");
                } else if (host != null && (host.contains("sinaimg.cn") || host.contains("sinaimg.com"))) {
                    httpURLConnection.setRequestProperty("Referer", "https://weibo.com/");
                }
                if (httpURLConnection.getResponseCode() == 200) {
                    InputStream inputStream3 = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = inputStream3.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            inputStream3.close();
                            httpURLConnection.disconnect();
                        } catch (Exception unused) {
                        }
                        return byteArray;
                    } catch (Exception e) {
                        inputStream = inputStream3;
                        e = e;
                        try {
                            SpiderDebug.log("[WallpaperDialog] downloadImageBytes error: " + e.getMessage());
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception unused2) {
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            inputStream2 = inputStream;
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                } catch (Exception unused3) {
                                    throw th;
                                }
                            } else if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream3;
                        if (inputStream2 != null) {
                            inputStream2.close();
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } else if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
        httpURLConnection.disconnect();
        return null;
    }

    public static LinearLayout h(Application application, boolean z) {
        LinearLayout linearLayout = new LinearLayout(application);
        linearLayout.setGravity(17);
        linearLayout.setFocusable(true);
        linearLayout.setClickable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(AbstractC0583w0.Q(6, application));
        gradientDrawable.setColor(1711276032);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(AbstractC0583w0.Q(6, application));
        gradientDrawable2.setColor(-1155426573);
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0501f2(gradientDrawable2, gradientDrawable, 1));
        TextView textView = new TextView(application);
        textView.setText(z ? "‹" : "›");
        textView.setTextSize(28.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setShadowLayer(4.0f, 0.0f, 2.0f, -16777216);
        linearLayout.addView(textView);
        return linearLayout;
    }

    public static void i(ArrayList arrayList, int i, int[] iArr, String[] strArr, ImageView imageView, ProgressBar progressBar, LinearLayout linearLayout, LinearLayout linearLayout2) {
        if (i < 0 || i >= arrayList.size() || progressBar.getVisibility() == 0) {
            return;
        }
        String[] strArr2 = (String[]) arrayList.get(i);
        String str = strArr2[0];
        String str2 = strArr2.length > 1 ? strArr2[1] : "";
        progressBar.setVisibility(0);
        InitOrigin.execute(new I(str, str2, progressBar, iArr, i, strArr, strArr2, imageView, linearLayout, linearLayout2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.app.Application] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static void j(Application application, String str, String str2, String str3, Runnable runnable) {
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity != null) {
                application = activity;
            }
        } catch (Exception unused) {
        }
        ?? r0 = application;
        try {
            int i = AbstractC0583w0.a;
            AbstractC0583w0.j0(AbstractC0583w0.r(r0, str, str2, AbstractC0583w0.c, null, null, new String[]{str3, "取消"}, new Runnable[]{runnable, null}));
        } catch (Exception unused2) {
            runnable.run();
        }
    }

    public static void k(int i, LinearLayout linearLayout, String str) {
        if (linearLayout.getChildCount() < 2) {
            return;
        }
        ((ImageView) linearLayout.getChildAt(0)).setImageDrawable(new g4(-1, AbstractC0583w0.Q(24, linearLayout.getContext()), i));
        ((TextView) linearLayout.getChildAt(1)).setText(str);
    }

    public static void l(ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2) {
        if (linearLayout == null || linearLayout2 == null || imageView.getDrawable() == null) {
            return;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = imageView.getDrawable().getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float f = intrinsicWidth;
        int iMin = (int) (Math.min(width / f, height / intrinsicHeight) * f);
        int i = (width - iMin) / 2;
        int iQ = AbstractC0583w0.Q(8, imageView.getContext());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.leftMargin = i + iQ;
        layoutParams.rightMargin = 0;
        linearLayout.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout2.getLayoutParams();
        layoutParams2.rightMargin = (width - (iMin + i)) + iQ;
        layoutParams2.leftMargin = 0;
        linearLayout2.setLayoutParams(layoutParams2);
    }
}
