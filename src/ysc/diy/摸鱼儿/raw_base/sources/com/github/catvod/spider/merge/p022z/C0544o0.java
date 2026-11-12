package com.github.catvod.spider.merge.p022z;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0544o0 extends View {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0544o0(Context context, float f, int i, int i2, int i3) {
        super(context);
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean zEquals = Boolean.TRUE.equals(getTag());
        int width = getWidth();
        float height = getHeight();
        float f = height / 2.0f;
        Paint paint = new Paint(1);
        paint.setColor(zEquals ? AbstractC0583w0.d : -4342339);
        float f2 = width;
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, f2, height), f, f, paint);
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        float f3 = this.a;
        paint2.setShadowLayer(2.0f * f3, 0.0f, f3 * 1.0f, 855638016);
        canvas.drawCircle(zEquals ? f2 - f : f, f, this.b, paint2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.c, this.d);
    }
}
