package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p017b6.C0614n;
import p034d5.AbstractC0847a;
import p153r5.C2316a;
import p153r5.C2317b;
import p171t5.AbstractC2436a;
import p211y5.C2809a;
import p211y5.C2819f;
import p211y5.C2823j;
import p211y5.C2825l;
import p211y5.C2828o;
import p211y5.C2830q;
import p211y5.InterfaceC2826m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {

    /* renamed from: j */
    public final Paint f3341j;

    /* renamed from: k */
    public final RectF f3342k;

    /* renamed from: l */
    public final Rect f3343l;

    /* renamed from: m */
    public final Path f3344m;

    /* renamed from: n */
    public final Path f3345n;

    /* renamed from: o */
    public final Matrix f3346o;

    /* renamed from: p */
    public final C2830q f3347p;

    /* renamed from: q */
    public WeakReference f3348q;

    /* renamed from: r */
    public float f3349r;

    /* renamed from: s */
    public ObjectAnimator f3350s;

    /* renamed from: t */
    public float f3351t;

    /* renamed from: u */
    public boolean f3352u;

    /* renamed from: v */
    public boolean f3353v;

    /* renamed from: w */
    public boolean f3354w;

    /* renamed from: x */
    public C2317b f3355x;

    /* renamed from: y */
    public static final ColorDrawable f3339y = new ColorDrawable(0);

    /* renamed from: z */
    public static final int[] f3340z = {R.attr.state_focused, R.attr.state_window_focused};

    /* renamed from: A */
    public static final OvershootInterpolator f3337A = new OvershootInterpolator(4.0f);

    /* renamed from: B */
    public static final C2316a f3338B = new C2316a("interpolation");

    public /* synthetic */ FocusRingDrawable(C2317b c2317b, Resources resources, C2316a c2316a) {
        this(c2317b, resources);
    }

    /* renamed from: c */
    public static int m1879c(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: e */
    public static FocusRingDrawable m1880e(Context context, RippleDrawable rippleDrawable, C2823j c2823j) {
        if (!AbstractC2436a.m4341p(context.getTheme(), com.exotv.net.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, f3339y);
        if (c2823j != null) {
            focusRingDrawable.f3348q = new WeakReference(c2823j);
        }
        rippleDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(rippleDrawable);
        return focusRingDrawable;
    }

    /* renamed from: f */
    public static float m1881f(float f8, Resources.Theme theme, int i, TypedArray typedArray, int i4, int i8) {
        if (!Float.isNaN(f8)) {
            return f8;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i4, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i8 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i8);
    }

    /* renamed from: a */
    public final void m1882a(RectF rectF) {
        Rect rect = this.f3355x.f8127w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.f3348q;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((C2823j) this.f3348q.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.f3343l;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        m1884d(theme);
    }

    /* renamed from: b */
    public final void m1883b(Canvas canvas, Path path, float f8, float f9, int i) {
        RectF rectF = this.f3342k;
        m1882a(rectF);
        float f10 = f8 * 2.0f;
        float fWidth = 1.0f - (f10 / rectF.width());
        float fHeight = 1.0f - (f10 / rectF.height());
        Matrix matrix = this.f3346o;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.f3344m;
        path.transform(matrix, path2);
        float f11 = f9 * this.f3351t;
        Paint paint = this.f3341j;
        paint.setStrokeWidth(f11);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1884d(Resources.Theme theme) {
        TypedValue typedValueM4340o;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(AbstractC0847a.f3746h);
        int i = this.f3355x.f8108d;
        if (i != Integer.MIN_VALUE && (typedValueM4340o = AbstractC2436a.m4340o(theme, i)) != null) {
            C2317b c2317b = this.f3355x;
            c2317b.f8107c = typedValueM4340o.data != 0;
            c2317b.f8109e = true;
        }
        C2317b c2317b2 = this.f3355x;
        if (!c2317b2.f8109e) {
            c2317b2.f8107c = AbstractC2436a.m4341p(theme, com.exotv.net.R.attr.focusRingsEnabled, c2317b2.f8107c);
        }
        C2317b c2317b3 = this.f3355x;
        if (c2317b3.f8107c) {
            int color = c2317b3.f8110f;
            int i4 = c2317b3.f8111g;
            if (color == Integer.MIN_VALUE) {
                if (i4 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    color = theme.resolveAttribute(i4, typedValue, true) ? typedValue.data : typedArrayObtainStyledAttributes.getColor(5, -16777216);
                }
            }
            c2317b3.f8110f = color;
            C2317b c2317b4 = this.f3355x;
            int color2 = c2317b4.f8112h;
            int i8 = c2317b4.f8113i;
            if (color2 == Integer.MIN_VALUE) {
                if (i8 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    color2 = theme.resolveAttribute(i8, typedValue2, true) ? typedValue2.data : typedArrayObtainStyledAttributes.getColor(1, -1);
                }
            }
            c2317b4.f8112h = color2;
            C2317b c2317b5 = this.f3355x;
            c2317b5.f8114j = m1881f(c2317b5.f8114j, theme, c2317b5.f8115k, typedArrayObtainStyledAttributes, 6, com.exotv.net.R.dimen.mtrl_focus_ring_outer_stroke_width);
            C2317b c2317b6 = this.f3355x;
            c2317b6.f8116l = m1881f(c2317b6.f8116l, theme, c2317b6.f8117m, typedArrayObtainStyledAttributes, 3, com.exotv.net.R.dimen.mtrl_focus_ring_inner_stroke_width);
            C2317b c2317b7 = this.f3355x;
            c2317b7.f8118n = m1881f(c2317b7.f8118n, theme, c2317b7.f8119o, typedArrayObtainStyledAttributes, 7, 0);
            C2317b c2317b8 = this.f3355x;
            c2317b8.f8120p = m1881f(c2317b8.f8120p, theme, c2317b8.f8121q, typedArrayObtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.f3355x.f8120p)) {
                this.f3355x.f8120p = 0.0f;
            }
            C2317b c2317b9 = this.f3355x;
            c2317b9.f8122r = m1881f(c2317b9.f8122r, theme, c2317b9.f8123s, typedArrayObtainStyledAttributes, 2, com.exotv.net.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            C2317b c2317b10 = this.f3355x;
            int i9 = c2317b10.f8125u;
            int[] iArr = AbstractC0847a.f3732A;
            if (i9 != Integer.MIN_VALUE) {
                c2317b10.f8124t = C2828o.m4953g(theme.obtainStyledAttributes(i9, iArr), new C2809a(0.0f)).m4951a();
            } else {
                int i10 = c2317b10.f8126v;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = com.exotv.net.R.attr.focusRingsShapeAppearance;
                }
                TypedValue typedValueM4340o2 = AbstractC2436a.m4340o(theme, i10);
                if (typedValueM4340o2 != null) {
                    this.f3355x.f8124t = C2828o.m4953g(theme.obtainStyledAttributes(typedValueM4340o2.resourceId, iArr), new C2809a(0.0f)).m4951a();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f3341j;
        paint.setStyle(style);
        if (Float.isNaN(this.f3355x.f8114j)) {
            return;
        }
        paint.setStrokeWidth(this.f3355x.f8114j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float fMax;
        int radius;
        super.draw(canvas);
        C2317b c2317b = this.f3355x;
        if (c2317b.f8107c && this.f3353v) {
            float f8 = c2317b.f8120p;
            float f9 = c2317b.f8114j / 2.0f;
            float f10 = this.f3351t;
            float f11 = (f9 * f10) + f8;
            float f12 = ((c2317b.f8116l / 2.0f) * f10) + f8 + c2317b.f8122r;
            Path path = this.f3345n;
            if (path.isEmpty()) {
                WeakReference weakReference = this.f3348q;
                if (weakReference == null || weakReference.get() == null) {
                    path = null;
                } else {
                    path = ((C2823j) this.f3348q.get()).f10499r;
                    if (path.isEmpty()) {
                    }
                }
            }
            Path path2 = path;
            if (path2 != null) {
                C2317b c2317b2 = this.f3355x;
                m1883b(canvas, path2, f12, c2317b2.f8116l, c2317b2.f8112h);
                C2317b c2317b3 = this.f3355x;
                m1883b(canvas, path2, f11, c2317b3.f8114j, c2317b3.f8110f);
                return;
            }
            if (Float.isNaN(this.f3355x.f8118n)) {
                fMax = this.f3349r;
                if (fMax < 0.0f) {
                    WeakReference weakReference2 = this.f3348q;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        Drawable drawable = getDrawable();
                        fMax = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                    } else {
                        C2823j c2823j = (C2823j) this.f3348q.get();
                        float fM4931b = c2823j.m4931b(c2823j.m4935g(), c2823j.f10492k.f10459a.mo4922d(), c2823j.f10488K);
                        if (fM4931b >= 0.0f) {
                            fM4931b *= c2823j.f10492k.f10467i;
                        }
                        if (fM4931b >= 0.0f) {
                            fMax = Math.max(0.0f, fM4931b - (this.f3355x.f8114j / 2.0f));
                        }
                    }
                }
            } else {
                fMax = this.f3355x.f8118n;
            }
            float fMax2 = Math.max(0.0f, fMax - (this.f3355x.f8114j / 2.0f));
            C2317b c2317b4 = this.f3355x;
            float f13 = c2317b4.f8116l;
            int i = c2317b4.f8112h;
            RectF rectF = this.f3342k;
            m1882a(rectF);
            rectF.inset(f12, f12);
            float f14 = f13 * this.f3351t;
            Paint paint = this.f3341j;
            paint.setStrokeWidth(f14);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, fMax2, fMax2, paint);
            C2317b c2317b5 = this.f3355x;
            float f15 = c2317b5.f8114j;
            int i4 = c2317b5.f8110f;
            m1882a(rectF);
            rectF.inset(f11, f11);
            paint.setStrokeWidth(f15 * this.f3351t);
            paint.setColor(i4);
            canvas.drawRoundRect(rectF, fMax, fMax, paint);
        }
    }

    /* renamed from: g */
    public final void m1885g(InterfaceC2826m interfaceC2826m) {
        RectF rectF = this.f3342k;
        m1882a(rectF);
        C2828o c2828oMo4920b = interfaceC2826m.mo4920b(f3340z);
        boolean zM4955i = c2828oMo4920b.m4955i(rectF);
        Path path = this.f3345n;
        if (!zM4955i) {
            this.f3347p.m4958a(c2828oMo4920b, null, 1.0f, rectF, null, path);
            this.f3349r = -1.0f;
            return;
        }
        C2317b c2317b = this.f3355x;
        float f8 = ((c2317b.f8114j / 2.0f) * this.f3351t) + c2317b.f8120p;
        rectF.inset(f8, f8);
        this.f3349r = c2828oMo4920b.f10525e.mo4909a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C2317b c2317b = this.f3355x;
        if (c2317b.f8105a == null) {
            return null;
        }
        c2317b.f8106b = getChangingConfigurations();
        return this.f3355x;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.f3355x.f8107c;
        } catch (NoSuchMethodError unused) {
            return this.f3355x.f8107c;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.f3355x.f8107c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.f3350s;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f3350s = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f3354w && super.mutate() == this) {
            this.f3355x = new C2317b(this.f3355x);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f3355x.f8105a = drawable.getConstantState();
            }
            this.f3354w = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        C2828o c2828o;
        super.onBoundsChange(rect);
        C2317b c2317b = this.f3355x;
        if (c2317b.f8107c) {
            InterfaceC2826m interfaceC2826m = c2317b.f8124t;
            if (interfaceC2826m != null) {
                m1885g(interfaceC2826m);
                return;
            }
            Drawable drawable = getDrawable();
            C2828o c2828o2 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    C2825l c2825l = new C2825l();
                    C2825l c2825l2 = new C2825l();
                    C2825l c2825l3 = new C2825l();
                    C2825l c2825l4 = new C2825l();
                    C2819f c2819f = new C2819f(0);
                    C2819f c2819f2 = new C2819f(0);
                    C2819f c2819f3 = new C2819f(0);
                    C2819f c2819f4 = new C2819f(0);
                    float radius = outline.getRadius();
                    C2809a c2809a = new C2809a(radius);
                    C2809a c2809a2 = new C2809a(radius);
                    C2809a c2809a3 = new C2809a(radius);
                    C2809a c2809a4 = new C2809a(radius);
                    c2828o = new C2828o();
                    c2828o.f10521a = c2825l;
                    c2828o.f10522b = c2825l2;
                    c2828o.f10523c = c2825l3;
                    c2828o.f10524d = c2825l4;
                    c2828o.f10525e = c2809a;
                    c2828o.f10526f = c2809a2;
                    c2828o.f10527g = c2809a3;
                    c2828o.f10528h = c2809a4;
                    c2828o.f10529i = c2819f;
                    c2828o.f10530j = c2819f2;
                    c2828o.f10531k = c2819f3;
                    c2828o.f10532l = c2819f4;
                    c2828o2 = c2828o;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    C2825l c2825l5 = new C2825l();
                    C2825l c2825l6 = new C2825l();
                    C2825l c2825l7 = new C2825l();
                    C2825l c2825l8 = new C2825l();
                    C2819f c2819f5 = new C2819f(0);
                    C2819f c2819f6 = new C2819f(0);
                    C2819f c2819f7 = new C2819f(0);
                    C2819f c2819f8 = new C2819f(0);
                    C2809a c2809a5 = new C2809a(Math.min(cornerRadii[0], cornerRadii[1]));
                    C2809a c2809a6 = new C2809a(Math.min(cornerRadii[2], cornerRadii[3]));
                    C2809a c2809a7 = new C2809a(Math.min(cornerRadii[4], cornerRadii[5]));
                    C2809a c2809a8 = new C2809a(Math.min(cornerRadii[6], cornerRadii[7]));
                    c2828o = new C2828o();
                    c2828o.f10521a = c2825l5;
                    c2828o.f10522b = c2825l6;
                    c2828o.f10523c = c2825l7;
                    c2828o.f10524d = c2825l8;
                    c2828o.f10525e = c2809a5;
                    c2828o.f10526f = c2809a6;
                    c2828o.f10527g = c2809a7;
                    c2828o.f10528h = c2809a8;
                    c2828o.f10529i = c2819f5;
                    c2828o.f10530j = c2819f6;
                    c2828o.f10531k = c2819f7;
                    c2828o.f10532l = c2819f8;
                    c2828o2 = c2828o;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        C2825l c2825l9 = new C2825l();
                        C2825l c2825l10 = new C2825l();
                        C2825l c2825l11 = new C2825l();
                        C2825l c2825l12 = new C2825l();
                        C2819f c2819f9 = new C2819f(0);
                        C2819f c2819f10 = new C2819f(0);
                        C2819f c2819f11 = new C2819f(0);
                        C2819f c2819f12 = new C2819f(0);
                        C2809a c2809a9 = new C2809a(cornerRadius);
                        C2809a c2809a10 = new C2809a(cornerRadius);
                        C2809a c2809a11 = new C2809a(cornerRadius);
                        C2809a c2809a12 = new C2809a(cornerRadius);
                        C2828o c2828o3 = new C2828o();
                        c2828o3.f10521a = c2825l9;
                        c2828o3.f10522b = c2825l10;
                        c2828o3.f10523c = c2825l11;
                        c2828o3.f10524d = c2825l12;
                        c2828o3.f10525e = c2809a9;
                        c2828o3.f10526f = c2809a10;
                        c2828o3.f10527g = c2809a11;
                        c2828o3.f10528h = c2809a12;
                        c2828o3.f10529i = c2819f9;
                        c2828o3.f10530j = c2819f10;
                        c2828o3.f10531k = c2819f11;
                        c2828o3.f10532l = c2819f12;
                        c2828o2 = c2828o3;
                    }
                }
            }
            if (c2828o2 != null) {
                m1885g(c2828o2);
            } else {
                this.f3349r = -1.0f;
                this.f3345n.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        C2317b c2317b = this.f3355x;
        if (!c2317b.f8107c) {
            this.f3353v = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(c2317b.f8128x, iArr);
        boolean z7 = this.f3353v != zStateSetMatches;
        this.f3353v = zStateSetMatches;
        if (z7 && iArr.length > 0 && !this.f3352u) {
            ObjectAnimator objectAnimator = this.f3350s;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f3350s = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f3338B, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(f3337A);
                objectAnimatorOfFloat.addListener(new C0614n(4, this));
                this.f3350s = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.f3351t = 1.0f;
            }
        }
        this.f3352u = iArr.length == 0;
        return super.onStateChange(iArr) || z7;
    }

    public FocusRingDrawable() {
        super(null);
        this.f3341j = new Paint(1);
        this.f3342k = new RectF();
        this.f3343l = new Rect();
        this.f3344m = new Path();
        this.f3345n = new Path();
        this.f3346o = new Matrix();
        this.f3347p = C2830q.m4957b();
        this.f3349r = -1.0f;
        this.f3351t = 1.0f;
        this.f3353v = false;
        this.f3354w = false;
        this.f3355x = new C2317b(null);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = AbstractC0847a.f3746h;
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.f3355x.f8108d = m1879c(typedArrayObtainStyledAttributes, 0);
        if (this.f3355x.f8108d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            C2317b c2317b = this.f3355x;
            c2317b.f8107c = typedArrayObtainStyledAttributes.getBoolean(0, c2317b.f8107c);
            this.f3355x.f8109e = true;
        }
        this.f3355x.f8111g = m1879c(typedArrayObtainStyledAttributes, 5);
        C2317b c2317b2 = this.f3355x;
        if (c2317b2.f8111g == Integer.MIN_VALUE) {
            c2317b2.f8110f = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.f3355x.f8113i = m1879c(typedArrayObtainStyledAttributes, 1);
        C2317b c2317b3 = this.f3355x;
        if (c2317b3.f8113i == Integer.MIN_VALUE) {
            c2317b3.f8112h = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.f3355x.f8115k = m1879c(typedArrayObtainStyledAttributes, 6);
        C2317b c2317b4 = this.f3355x;
        if (c2317b4.f8115k == Integer.MIN_VALUE) {
            c2317b4.f8114j = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.f3355x.f8117m = m1879c(typedArrayObtainStyledAttributes, 3);
        C2317b c2317b5 = this.f3355x;
        if (c2317b5.f8117m == Integer.MIN_VALUE) {
            c2317b5.f8116l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f3355x.f8117m = m1879c(typedArrayObtainStyledAttributes, 3);
        C2317b c2317b6 = this.f3355x;
        if (c2317b6.f8117m == Integer.MIN_VALUE) {
            c2317b6.f8116l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.f3355x.f8119o = m1879c(typedArrayObtainStyledAttributes, 7);
        C2317b c2317b7 = this.f3355x;
        if (c2317b7.f8119o == Integer.MIN_VALUE) {
            c2317b7.f8118n = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.f3355x.f8121q = m1879c(typedArrayObtainStyledAttributes, 4);
        C2317b c2317b8 = this.f3355x;
        if (c2317b8.f8121q == Integer.MIN_VALUE) {
            c2317b8.f8120p = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.f3355x.f8123s = m1879c(typedArrayObtainStyledAttributes, 2);
        C2317b c2317b9 = this.f3355x;
        if (c2317b9.f8123s == Integer.MIN_VALUE) {
            c2317b9.f8122r = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.f3355x.f8126v = m1879c(typedArrayObtainStyledAttributes, 8);
        this.f3355x.f8125u = typedArrayObtainStyledAttributes.getType(8) == 1 ? typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.f3355x.f8105a = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = f3339y;
            setDrawable(colorDrawable);
            this.f3355x.f8105a = colorDrawable.getConstantState();
        }
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f3341j = new Paint(1);
        this.f3342k = new RectF();
        this.f3343l = new Rect();
        this.f3344m = new Path();
        this.f3345n = new Path();
        this.f3346o = new Matrix();
        this.f3347p = C2830q.m4957b();
        this.f3349r = -1.0f;
        this.f3351t = 1.0f;
        this.f3353v = false;
        this.f3354w = false;
        C2317b c2317b = new C2317b(null);
        this.f3355x = c2317b;
        if (drawable != null) {
            c2317b.f8105a = drawable.getConstantState();
        }
        m1884d(context.getTheme());
    }

    private FocusRingDrawable(C2317b c2317b, Resources resources) {
        Drawable drawableNewDrawable;
        super(null);
        Paint paint = new Paint(1);
        this.f3341j = paint;
        this.f3342k = new RectF();
        this.f3343l = new Rect();
        this.f3344m = new Path();
        this.f3345n = new Path();
        this.f3346o = new Matrix();
        this.f3347p = C2830q.m4957b();
        this.f3349r = -1.0f;
        this.f3351t = 1.0f;
        this.f3353v = false;
        this.f3354w = false;
        C2317b c2317b2 = new C2317b(c2317b);
        this.f3355x = c2317b2;
        Drawable.ConstantState constantState = c2317b2.f8105a;
        if (constantState != null) {
            if (resources != null) {
                drawableNewDrawable = constantState.newDrawable(resources);
            } else {
                drawableNewDrawable = constantState.newDrawable();
            }
            setDrawable(drawableNewDrawable);
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.f3355x.f8114j)) {
            return;
        }
        paint.setStrokeWidth(this.f3355x.f8114j);
    }
}
