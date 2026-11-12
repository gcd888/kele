package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.ProxyOrigin;
import com.github.catvod.spider.merge.p010l.a;
import com.github.catvod.spider.merge.p017u.ViewOnClickListenerC0470w;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class AbstractC0484c0 {
    public static final LruCache a = new LruCache(48);
    public static final ExecutorService b = Executors.newFixedThreadPool(3);

    public static LinearLayout a(Activity activity, String str, String str2, String str3, int i, Runnable runnable) {
        int iQ = AbstractC0583w0.Q(8, activity);
        int iQ2 = AbstractC0583w0.Q(4, activity);
        int iQ3 = AbstractC0583w0.Q(40, activity);
        int iQ4 = AbstractC0583w0.Q(56, activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(iQ, iQ2, iQ, iQ2);
        linearLayout.setMinimumHeight(AbstractC0583w0.Q(64, activity));
        linearLayout.setFocusable(true);
        linearLayout.setClickable(true);
        linearLayout.setBackground(AbstractC0583w0.G(activity, AbstractC0583w0.b, AbstractC0583w0.k, 8, 2, i));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            linearLayout.setElevation(AbstractC0583w0.Q(1, activity));
        }
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AbstractC0583w0.a);
        gradientDrawable.setCornerRadius(AbstractC0583w0.Q(6, activity));
        gradientDrawable.setStroke(AbstractC0583w0.Q(1, activity), AbstractC0583w0.j);
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(AbstractC0583w0.Q(1, activity), AbstractC0583w0.Q(1, activity), AbstractC0583w0.Q(1, activity), AbstractC0583w0.Q(1, activity));
        imageView.setCropToPadding(true);
        if (i2 >= 21) {
            imageView.setClipToOutline(true);
            imageView.setElevation(AbstractC0583w0.Q(1, activity));
        }
        imageView.setContentDescription(str2 + "海报");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iQ3, iQ4);
        layoutParams.rightMargin = AbstractC0583w0.Q(12, activity);
        linearLayout.addView(imageView, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(activity);
        textView.setText(str2);
        textView.setTextSize(14.0f);
        textView.setTextColor(AbstractC0583w0.g);
        textView.setTypeface(null, 1);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setText(str3);
        textView2.setTextSize(12.0f);
        int i3 = AbstractC0583w0.h;
        textView2.setTextColor(i3);
        textView2.setPadding(0, iQ2, 0, 0);
        textView2.setLineSpacing(AbstractC0583w0.Q(2, activity), 1.0f);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        TextView textView3 = new TextView(activity);
        textView3.setText("›");
        textView3.setTextSize(20.0f);
        textView3.setTextColor(i3);
        textView3.setPadding(iQ, 0, 0, 0);
        linearLayout.addView(textView3);
        linearLayout.setContentDescription(str2 + "，" + str3);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0470w(runnable, 3));
        String strBuildTmdbImageUrl = ProxyOrigin.buildTmdbImageUrl(str, a.i().d);
        imageView.setTag(strBuildTmdbImageUrl);
        if (!strBuildTmdbImageUrl.isEmpty()) {
            Bitmap bitmap = (Bitmap) a.get(strBuildTmdbImageUrl);
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                b.execute(new RunnableC0479b0(strBuildTmdbImageUrl, iQ3, iQ4, imageView));
            }
        }
        return linearLayout;
    }
}
