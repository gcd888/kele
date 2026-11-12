package com.github.catvod.spider.merge.p022z;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0566s3 extends LinearLayout {
    public final JSONObject a;
    public final SeekBar b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final Runnable f;
    public final ArrayList g;
    public final Bitmap h;
    public final Bitmap i;
    public boolean j;
    public long k;
    public final float l;

    public C0566s3(Context context, JSONObject jSONObject, final RunnableC0552p3 runnableC0552p3) {
        super(context);
        this.g = new ArrayList();
        this.k = -1L;
        this.a = jSONObject;
        this.f = runnableC0552p3;
        setOrientation(1);
        Bitmap bitmapP = AbstractC0583w0.P(jSONObject.getString("bg"));
        this.h = bitmapP;
        Bitmap bitmapP2 = AbstractC0583w0.P(jSONObject.getString("piece"));
        this.i = bitmapP2;
        if (bitmapP == null || bitmapP2 == null) {
            if (bitmapP != null) {
                bitmapP.recycle();
            }
            if (bitmapP2 != null) {
                bitmapP2.recycle();
            }
            throw new IllegalArgumentException("challenge image invalid");
        }
        LinearLayout linearLayoutY = AbstractC0583w0.y(context);
        linearLayoutY.setGravity(17);
        float fMin = Math.min(Math.max(1, Math.min(AbstractC0583w0.Q(320, context), context.getResources().getDisplayMetrics().widthPixels - AbstractC0583w0.Q(120, context))) / jSONObject.getInt("width"), Math.max(1, Math.min(AbstractC0583w0.Q(200, context), context.getResources().getDisplayMetrics().heightPixels / 3)) / jSONObject.getInt("height"));
        this.l = fMin;
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayoutY.addView(frameLayout, new LinearLayout.LayoutParams(Math.max(1, Math.round(jSONObject.getInt("width") * fMin)), Math.max(1, Math.round(jSONObject.getInt("height") * fMin))));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageBitmap(bitmapP);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription("验证背景，请将拼图移动到缺口");
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setImageBitmap(bitmapP2);
        imageView2.setScaleType(scaleType);
        int iMax = Math.max(1, Math.round(jSONObject.getInt("size") * fMin));
        frameLayout.addView(imageView2, new FrameLayout.LayoutParams(iMax, iMax));
        imageView2.setImportantForAccessibility(2);
        addView(linearLayoutY, AbstractC0583w0.c0(AbstractC0583w0.Q(8, context)));
        LinearLayout linearLayoutY2 = AbstractC0583w0.y(context);
        AbstractC0583w0.g(linearLayoutY2, "拼图位置");
        SeekBar seekBar = new SeekBar(context);
        this.b = seekBar;
        seekBar.setMax(10000);
        seekBar.setKeyProgressIncrement(25);
        seekBar.setContentDescription("拼图位置，左右拖动或使用方向键微调");
        seekBar.setPadding(AbstractC0583w0.Q(8, context), AbstractC0583w0.Q(8, context), AbstractC0583w0.Q(8, context), AbstractC0583w0.Q(8, context));
        linearLayoutY2.addView(seekBar, new LinearLayout.LayoutParams(-1, AbstractC0583w0.Q(48, context)));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setGravity(17);
        textView.setTextSize(13.0f);
        textView.setTextColor(AbstractC0583w0.c);
        linearLayoutY2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText("左右拖动 / 方向键微调，对齐后点击确认");
        textView2.setTextSize(11.0f);
        textView2.setTextColor(AbstractC0583w0.i);
        textView2.setGravity(17);
        linearLayoutY2.addView(textView2);
        addView(linearLayoutY2);
        d(0);
        seekBar.setOnSeekBarChangeListener(new C0561r3(this, runnableC0552p3));
        seekBar.setOnKeyListener(new ViewOnKeyListenerC0497e3(1, this));
        seekBar.setOnTouchListener(new View.OnTouchListener() { // from class: com.github.catvod.spider.merge.z.q3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C0566s3 c0566s3 = this.a;
                c0566s3.getClass();
                if (motionEvent.getActionMasked() == 3) {
                    c0566s3.j = false;
                    c0566s3.g.clear();
                    c0566s3.k = -1L;
                    runnableC0552p3.run();
                }
                return false;
            }
        });
        seekBar.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0489d0(this, 1));
    }

    public final JSONObject a() throws JSONException {
        if (!c()) {
            throw new IllegalStateException("slider incomplete");
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList<long[]> arrayList = this.g;
        for (long[] jArr : arrayList) {
            jSONArray.put(new JSONObject().put("x", jArr[0]).put("y", jArr[1]).put("t", jArr[2]));
        }
        JSONObject jSONObjectPut = new JSONObject().put("action", "CONFIRM");
        JSONObject jSONObject = this.a;
        return jSONObjectPut.put("scope", jSONObject.getString("scope")).put("challenge_id", jSONObject.getString("challenge_id")).put("x", ((long[]) arrayList.get(arrayList.size() - 1))[0]).put("points", jSONArray);
    }

    public final void b(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        if (this.k < 0) {
            this.k = SystemClock.elapsedRealtime();
        }
        f(i, false);
        this.f.run();
    }

    public final boolean c() {
        if (this.j) {
            return false;
        }
        ArrayList arrayList = this.g;
        return arrayList.size() >= 2 && ((long[]) arrayList.get(arrayList.size() - 1))[0] > 1;
    }

    public final void d(int i) {
        double d = i;
        Double.isNaN(d);
        double[] dArrA = P1.a(this.a, d / 10000.0d);
        float f = (float) dArrA[0];
        float f2 = this.l;
        ImageView imageView = this.d;
        imageView.setTranslationX(f * f2);
        imageView.setTranslationY(((float) dArrA[1]) * f2);
        StringBuilder sb = new StringBuilder("位置 ");
        Double.isNaN(d);
        sb.append(Math.round(d / 100.0d));
        sb.append("%");
        this.e.setText(sb.toString());
    }

    public final void e() {
        if (this.j) {
            f(this.b.getProgress(), true);
            this.j = false;
            this.f.run();
        }
    }

    public final void f(int i, boolean z) {
        int i2;
        double d;
        char c = 2;
        char c2 = 0;
        if (this.j) {
            double d2 = i;
            Double.isNaN(d2);
            double d3 = d2 / 10000.0d;
            JSONObject jSONObject = this.a;
            double dOptInt = jSONObject.optInt("max_x");
            Double.isNaN(dOptInt);
            double d4 = dOptInt * d3;
            long j = (long) d4;
            double d5 = j;
            Double.isNaN(d5);
            double d6 = d4 - d5;
            int i3 = -1;
            if (d6 >= 0.5d) {
                i2 = 1;
            } else {
                i2 = d6 <= -0.5d ? -1 : 0;
            }
            long j2 = j + ((long) i2);
            double d7 = P1.a(jSONObject, d3)[1];
            long j3 = (long) d7;
            double d8 = j3;
            Double.isNaN(d8);
            double d9 = d7 - d8;
            if (d9 >= 0.5d) {
                i3 = 1;
            } else if (d9 > -0.5d) {
                i3 = 0;
            }
            long[] jArr = {j2, j3 + ((long) i3), SystemClock.elapsedRealtime() - this.k};
            ArrayList arrayList = this.g;
            long[] jArr2 = arrayList.isEmpty() ? null : (long[]) arrayList.get(arrayList.size() - 1);
            if (z || jArr2 == null || jArr2[0] != jArr[0] || jArr2[1] != jArr[1]) {
                arrayList.add(jArr);
                if (arrayList.size() > 96) {
                    double d10 = Double.POSITIVE_INFINITY;
                    int i4 = 1;
                    int i5 = 1;
                    while (i4 < arrayList.size() - 1) {
                        long[] jArr3 = (long[]) arrayList.get(i4 - 1);
                        long[] jArr4 = (long[]) arrayList.get(i4);
                        int i6 = i4 + 1;
                        long[] jArr5 = (long[]) arrayList.get(i6);
                        long j4 = jArr5[c];
                        long j5 = jArr3[c];
                        if (j4 > j5) {
                            double d11 = jArr4[c] - j5;
                            double d12 = j4 - j5;
                            Double.isNaN(d11);
                            Double.isNaN(d12);
                            d = d11 / d12;
                        } else {
                            d = 0.5d;
                        }
                        long j6 = jArr4[c2];
                        double d13 = j6;
                        int i7 = i4;
                        int i8 = i5;
                        long j7 = jArr3[c2];
                        ArrayList arrayList2 = arrayList;
                        double d14 = d10;
                        double d15 = j7;
                        long j8 = jArr5[c2];
                        double d16 = j8 - j7;
                        Double.isNaN(d16);
                        Double.isNaN(d15);
                        Double.isNaN(d13);
                        double d17 = d13 - ((d16 * d) + d15);
                        double d18 = jArr4[1];
                        long j9 = jArr3[1];
                        double d19 = j9;
                        double d20 = jArr5[1] - j9;
                        Double.isNaN(d20);
                        Double.isNaN(d19);
                        Double.isNaN(d18);
                        double d21 = d18 - ((d20 * d) + d19);
                        double d22 = (d21 * d21) + (d17 * d17) + ((j8 - j6) * (j6 - j7) < 0 ? 1.0E9d : 0.0d);
                        if (d22 < d14) {
                            d10 = d22;
                            i5 = i7;
                        } else {
                            d10 = d14;
                            i5 = i8;
                        }
                        i4 = i6;
                        arrayList = arrayList2;
                        c = 2;
                        c2 = 0;
                    }
                    arrayList.remove(i5);
                }
            }
        }
    }
}
