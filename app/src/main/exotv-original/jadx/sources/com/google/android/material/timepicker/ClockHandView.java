package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.exotv.net.R;
import java.util.ArrayList;
import p034d5.AbstractC0847a;
import p042e5.AbstractC0910a;
import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: w */
    public static final /* synthetic */ int f3505w = 0;

    /* renamed from: j */
    public final ValueAnimator f3506j;

    /* renamed from: k */
    public boolean f3507k;

    /* renamed from: l */
    public final ArrayList f3508l;

    /* renamed from: m */
    public final int f3509m;

    /* renamed from: n */
    public final float f3510n;

    /* renamed from: o */
    public final Paint f3511o;

    /* renamed from: p */
    public final RectF f3512p;

    /* renamed from: q */
    public final int f3513q;

    /* renamed from: r */
    public float f3514r;

    /* renamed from: s */
    public boolean f3515s;

    /* renamed from: t */
    public double f3516t;

    /* renamed from: u */
    public int f3517u;

    /* renamed from: v */
    public int f3518v;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f3506j = valueAnimator;
        this.f3508l = new ArrayList();
        Paint paint = new Paint();
        this.f3511o = paint;
        this.f3512p = new RectF();
        this.f3518v = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0847a.f3743e, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC2436a.m4342q(context, R.attr.motionDurationLong2, 200);
        AbstractC2436a.m4343r(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0910a.f3957b);
        this.f3517u = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3509m = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f3513q = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f3510n = r5.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m1926b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ClockHandView.f3505w;
                this.f3524a.m1927c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new C0774e());
    }

    /* renamed from: a */
    public final int m1925a(int i) {
        return i == 2 ? Math.round(this.f3517u * 0.66f) : this.f3517u;
    }

    /* renamed from: b */
    public final void m1926b(float f8) {
        this.f3506j.cancel();
        m1927c(f8);
    }

    /* renamed from: c */
    public final void m1927c(float f8) {
        float f9 = f8 % 360.0f;
        this.f3514r = f9;
        this.f3516t = Math.toRadians(f9 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM1925a = m1925a(this.f3518v);
        float fCos = (((float) Math.cos(this.f3516t)) * fM1925a) + width;
        float fSin = (fM1925a * ((float) Math.sin(this.f3516t))) + height;
        float f10 = this.f3509m;
        this.f3512p.set(fCos - f10, fSin - f10, fCos + f10, fSin + f10);
        ArrayList arrayList = this.f3508l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0775f) obj);
            if (Math.abs(clockFaceView.f3502P - f9) > 0.001f) {
                clockFaceView.f3502P = f9;
                clockFaceView.m1924n();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f8 = width;
        float fM1925a = m1925a(this.f3518v);
        float fCos = (((float) Math.cos(this.f3516t)) * fM1925a) + f8;
        float f9 = height;
        float fSin = (fM1925a * ((float) Math.sin(this.f3516t))) + f9;
        Paint paint = this.f3511o;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f3509m, paint);
        double dSin = Math.sin(this.f3516t);
        paint.setStrokeWidth(this.f3513q);
        canvas.drawLine(f8, f9, width + ((int) (Math.cos(this.f3516t) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f8, f9, this.f3510n, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        super.onLayout(z7, i, i4, i8, i9);
        if (this.f3506j.isRunning()) {
            return;
        }
        m1926b(this.f3514r);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        boolean z8;
        int actionMasked = motionEvent.getActionMasked();
        float x6 = motionEvent.getX();
        float y4 = motionEvent.getY();
        boolean z9 = false;
        if (actionMasked == 0) {
            this.f3515s = false;
            z7 = true;
            z8 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z8 = this.f3515s;
            if (this.f3507k) {
                this.f3518v = ((float) Math.hypot((double) (x6 - ((float) (getWidth() / 2))), (double) (y4 - ((float) (getHeight() / 2))))) <= ((float) m1925a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z7 = false;
        } else {
            z8 = false;
            z7 = false;
        }
        boolean z10 = this.f3515s;
        int degrees = (int) Math.toDegrees(Math.atan2(y4 - (getHeight() / 2), x6 - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f8 = i;
        boolean z11 = this.f3514r != f8;
        if (z7 && z11) {
            z9 = true;
        } else if (z11 || z8) {
            m1926b(f8);
            z9 = true;
        }
        this.f3515s = z10 | z9;
        return true;
    }
}
