package com.github.catvod.spider.merge.p022z;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class g4 extends Drawable {
    public final Paint a = new Paint(1);
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public g4(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void a(Canvas canvas, float f, Paint.Style style) {
        float f2 = f / 2.0f;
        float f3 = 0.42f * f;
        float f4 = f * 0.17f;
        Path path = new Path();
        for (int i = 0; i < 5; i++) {
            double d = i * 2;
            Double.isNaN(d);
            double d2 = ((d * 3.141592653589793d) / 5.0d) + 1.5707963267948966d;
            double d3 = 0.6283185307179586d + d2;
            float fCos = (((float) Math.cos(d2)) * f3) + f2;
            float fSin = f2 - (((float) Math.sin(d2)) * f3);
            float fCos2 = (((float) Math.cos(d3)) * f4) + f2;
            float fSin2 = f2 - (((float) Math.sin(d3)) * f4);
            if (i == 0) {
                path.moveTo(fCos, fSin);
            } else {
                path.lineTo(fCos, fSin);
            }
            path.lineTo(fCos2, fSin2);
        }
        path.close();
        Paint paint = this.a;
        paint.setStyle(style);
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.a;
        paint.setColor(this.b);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        int i = this.c;
        paint.setStrokeWidth(i * 0.08f);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(Paint.Join.ROUND);
        float f = i;
        float f2 = f * 0.15f;
        switch (this.d) {
            case 0:
                float f3 = f / 2.0f;
                Path path = new Path();
                path.moveTo(f3, f2);
                path.lineTo(f3, 0.6f * f);
                canvas.drawPath(path, paint);
                Path path2 = new Path();
                float f4 = 0.2f * f;
                float f5 = 0.45f * f;
                path2.moveTo(f3 - f4, f5);
                path2.lineTo(f3, 0.65f * f);
                path2.lineTo(f3 + f4, f5);
                canvas.drawPath(path2, paint);
                float f6 = f - f2;
                canvas.drawLine(f2, f6, f6, f6, paint);
                break;
            case 1:
                float f7 = f - f2;
                float f8 = 0.7f * f;
                RectF rectF = new RectF(f2, (0.1f * f) + f2, f7, f8);
                paint.setStyle(style);
                float f9 = 0.05f * f;
                canvas.drawRoundRect(rectF, f9, f9, paint);
                float f10 = f / 2.0f;
                float f11 = f * 0.2f;
                canvas.drawLine(f10 - f2, f8, f10 - f11, f7, paint);
                canvas.drawLine(f10 + f2, f8, f10 + f11, f7, paint);
                float f12 = f * 0.25f;
                canvas.drawLine(f10 - f12, f7, f10 + f12, f7, paint);
                break;
            case 2:
                float f13 = f - f2;
                RectF rectF2 = new RectF(0.25f * f, f2, 0.75f * f, f13);
                paint.setStyle(style);
                float f14 = 0.08f * f;
                canvas.drawRoundRect(rectF2, f14, f14, paint);
                float f15 = f / 2.0f;
                float f16 = f * 0.1f;
                float f17 = f13 - f16;
                canvas.drawLine(f15 - f16, f17, f15 + f16, f17, paint);
                break;
            case 3:
                float f18 = 0.1f * f;
                float f19 = f2 + f18;
                float f20 = (f - f2) - f18;
                canvas.drawLine(f19, f19, f20, f20, paint);
                canvas.drawLine(f20, f19, f19, f20, paint);
                break;
            case 4:
                float f21 = f / 2.0f;
                paint.setStyle(style);
                canvas.drawCircle(f21, f21, ((f - (f2 * 2.0f)) / 2.0f) * 0.9f, paint);
                paint.setStrokeCap(cap);
                canvas.drawLine(f21, (0.2f * f) + f2, f21, f * 0.55f, paint);
                paint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f21, 0.7f * f, f * 0.05f, paint);
                break;
            case 5:
                a(canvas, f, style);
                break;
            case 6:
                a(canvas, f, Paint.Style.FILL);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
