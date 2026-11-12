package com.github.catvod.spider.merge.p022z;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import android.widget.ImageView;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class B2 extends ImageView {
    public final Matrix a;
    public final ScaleGestureDetector b;
    public final int c;
    public Bitmap d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public boolean l;

    public B2(Context context) {
        super(context);
        this.a = new Matrix();
        this.e = 1.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = false;
        setScaleType(ImageView.ScaleType.MATRIX);
        setBackgroundColor(0);
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
        this.b = new ScaleGestureDetector(context, new A2(this));
    }

    public final void a() {
        if (this.d == null || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        float fMax = Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight());
        float fMax2 = Math.max(1, (getHeight() - getPaddingTop()) - getPaddingBottom());
        float fMin = Math.min(fMax / this.d.getWidth(), fMax2 / this.d.getHeight()) * this.e;
        c(fMax, fMax2, fMin);
        float width = ((fMax - (this.d.getWidth() * fMin)) / 2.0f) + getPaddingLeft() + this.f;
        float height = ((fMax2 - (this.d.getHeight() * fMin)) / 2.0f) + getPaddingTop() + this.g;
        Matrix matrix = this.a;
        matrix.reset();
        matrix.postScale(fMin, fMin);
        matrix.postTranslate(width, height);
        setImageMatrix(matrix);
    }

    public final void b() {
        if (this.d == null || getWidth() <= 0 || getHeight() <= 0) {
            this.f = 0.0f;
            this.g = 0.0f;
        } else {
            float fMax = Math.max(1, (getWidth() - getPaddingLeft()) - getPaddingRight());
            float fMax2 = Math.max(1, (getHeight() - getPaddingTop()) - getPaddingBottom());
            c(fMax, fMax2, Math.min(fMax / this.d.getWidth(), fMax2 / this.d.getHeight()) * this.e);
        }
    }

    public final void c(float f, float f2, float f3) {
        Bitmap bitmap = this.d;
        if (bitmap == null) {
            return;
        }
        float fMax = Math.max(0.0f, ((bitmap.getWidth() * f3) - f) / 2.0f);
        float fMax2 = Math.max(0.0f, ((this.d.getHeight() * f3) - f2) / 2.0f);
        this.f = Math.max(-fMax, Math.min(fMax, this.f));
        this.g = Math.max(-fMax2, Math.min(fMax2, this.g));
    }

    public final boolean d(float f, float f2) {
        if (this.d == null || this.e <= 1.0f) {
            return false;
        }
        float f3 = this.f;
        float f4 = this.g;
        this.f = f + f3;
        this.g = f2 + f4;
        b();
        if (Math.abs(f3 - this.f) < 0.5f && Math.abs(f4 - this.g) < 0.5f) {
            return false;
        }
        a();
        return true;
    }

    public final void e(float f) {
        this.e = Math.max(1.0f, Math.min(4.0f, this.e * f));
        b();
        a();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.clipRect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), getWidth() - getPaddingRight()), Math.max(getPaddingTop(), getHeight() - getPaddingBottom()));
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
        a();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d == null) {
            return super.onTouchEvent(motionEvent);
        }
        ScaleGestureDetector scaleGestureDetector = this.b;
        scaleGestureDetector.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            this.h = x;
            this.j = x;
            float y = motionEvent.getY();
            this.i = y;
            this.k = y;
            this.l = false;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 1) {
                if (actionMasked == 3 && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                return true;
            }
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.l) {
                super.performClick();
            }
            return true;
        }
        if (motionEvent.getPointerCount() == 1 && !scaleGestureDetector.isInProgress()) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.h;
            float f2 = y2 - this.i;
            if (!this.l) {
                float fAbs = Math.abs(x2 - this.j);
                int i = this.c;
                if (fAbs < i && Math.abs(y2 - this.k) < i) {
                    this.h = x2;
                    this.i = y2;
                    return true;
                }
            }
            this.l = true;
            d(f, f2);
            this.h = x2;
            this.i = y2;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }
}
