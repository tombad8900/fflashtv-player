package p162s5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p034d5.AbstractC0847a;
import p104m.AbstractC1750n1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s5.e */
/* loaded from: classes.dex */
public abstract class AbstractC2367e extends AbstractC1750n1 {

    /* renamed from: A */
    public final Rect f8346A;

    /* renamed from: B */
    public int f8347B;

    /* renamed from: C */
    public final boolean f8348C;

    /* renamed from: D */
    public boolean f8349D;

    /* renamed from: y */
    public Drawable f8350y;

    /* renamed from: z */
    public final Rect f8351z;

    public AbstractC2367e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f8351z = new Rect();
        this.f8346A = new Rect();
        this.f8347B = 119;
        this.f8348C = true;
        this.f8349D = false;
        AbstractC2374l.m4211a(context, attributeSet, 0, 0);
        int[] iArr = AbstractC0847a.f3747i;
        AbstractC2374l.m4212b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f8347B = typedArrayObtainStyledAttributes.getInt(1, this.f8347B);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f8348C = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f8350y;
        if (drawable != null) {
            if (this.f8349D) {
                this.f8349D = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z7 = this.f8348C;
                Rect rect = this.f8351z;
                if (z7) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f8347B;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f8346A;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f8, float f9) {
        super.drawableHotspotChanged(f8, f9);
        Drawable drawable = this.f8350y;
        if (drawable != null) {
            drawable.setHotspot(f8, f9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8350y;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f8350y.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f8350y;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f8347B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8350y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p104m.AbstractC1750n1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        super.onLayout(z7, i, i4, i8, i9);
        this.f8349D = z7 | this.f8349D;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i8, int i9) {
        super.onSizeChanged(i, i4, i8, i9);
        this.f8349D = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f8350y;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f8350y);
            }
            this.f8350y = drawable;
            this.f8349D = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f8347B == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f8347B != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f8347B = i;
            if (i == 119 && this.f8350y != null) {
                this.f8350y.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8350y;
    }
}
