package p104m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.exotv.net.R;
import p005a4.C0073c;
import p054g.AbstractC1026a;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.f0 */
/* loaded from: classes.dex */
public final class C1717f0 extends C1701b0 {

    /* renamed from: e */
    public final C1713e0 f6535e;

    /* renamed from: f */
    public Drawable f6536f;

    /* renamed from: g */
    public ColorStateList f6537g;

    /* renamed from: h */
    public PorterDuff.Mode f6538h;

    /* renamed from: i */
    public boolean f6539i;

    /* renamed from: j */
    public boolean f6540j;

    public C1717f0(C1713e0 c1713e0) {
        super(c1713e0);
        this.f6537g = null;
        this.f6538h = null;
        this.f6539i = false;
        this.f6540j = false;
        this.f6535e = c1713e0;
    }

    @Override // p104m.C1701b0
    /* renamed from: b */
    public final void mo3384b(AttributeSet attributeSet, int i) {
        super.mo3384b(attributeSet, R.attr.seekBarStyle);
        C1713e0 c1713e0 = this.f6535e;
        Context context = c1713e0.getContext();
        int[] iArr = AbstractC1026a.f4314g;
        C0073c c0073cM263F = C0073c.m263F(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0073cM263F.f325l;
        AbstractC1828m0.m3607l(c1713e0, c1713e0.getContext(), iArr, attributeSet, (TypedArray) c0073cM263F.f325l, R.attr.seekBarStyle);
        Drawable drawableM300y = c0073cM263F.m300y(0);
        if (drawableM300y != null) {
            c1713e0.setThumb(drawableM300y);
        }
        Drawable drawableM299x = c0073cM263F.m299x(1);
        Drawable drawable = this.f6536f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f6536f = drawableM299x;
        if (drawableM299x != null) {
            drawableM299x.setCallback(c1713e0);
            drawableM299x.setLayoutDirection(c1713e0.getLayoutDirection());
            if (drawableM299x.isStateful()) {
                drawableM299x.setState(c1713e0.getDrawableState());
            }
            m3394f();
        }
        c1713e0.invalidate();
        if (typedArray.hasValue(3)) {
            this.f6538h = AbstractC1714e1.m3393b(typedArray.getInt(3, -1), this.f6538h);
            this.f6540j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f6537g = c0073cM263F.m298w(2);
            this.f6539i = true;
        }
        c0073cM263F.m275I();
        m3394f();
    }

    /* renamed from: f */
    public final void m3394f() {
        Drawable drawable = this.f6536f;
        if (drawable != null) {
            if (this.f6539i || this.f6540j) {
                Drawable drawableMutate = drawable.mutate();
                this.f6536f = drawableMutate;
                if (this.f6539i) {
                    drawableMutate.setTintList(this.f6537g);
                }
                if (this.f6540j) {
                    this.f6536f.setTintMode(this.f6538h);
                }
                if (this.f6536f.isStateful()) {
                    this.f6536f.setState(this.f6535e.getDrawableState());
                }
            }
        }
    }

    /* renamed from: g */
    public final void m3395g(Canvas canvas) {
        if (this.f6536f != null) {
            int max = this.f6535e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f6536f.getIntrinsicWidth();
                int intrinsicHeight = this.f6536f.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i4 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f6536f.setBounds(-i, -i4, i, i4);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i8 = 0; i8 <= max; i8++) {
                    this.f6536f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
