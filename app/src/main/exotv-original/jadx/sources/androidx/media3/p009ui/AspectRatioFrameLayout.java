package androidx.media3.p009ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p118n4.RunnableC2017n;
import p193w2.AbstractC2602a0;
import p193w2.InterfaceC2601a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: m */
    public static final /* synthetic */ int f1923m = 0;

    /* renamed from: j */
    public final RunnableC2017n f1924j;

    /* renamed from: k */
    public float f1925k;

    /* renamed from: l */
    public int f1926l;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1926l = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC2602a0.f9350a, 0, 0);
            try {
                this.f1926l = typedArrayObtainStyledAttributes.getInt(0, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f1924j = new RunnableC2017n(this);
    }

    public int getResizeMode() {
        return this.f1926l;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        float f8;
        float f9;
        super.onMeasure(i, i4);
        if (this.f1925k <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        float f12 = (this.f1925k / (f10 / f11)) - 1.0f;
        float fAbs = Math.abs(f12);
        RunnableC2017n runnableC2017n = this.f1924j;
        if (fAbs <= 0.01f) {
            if (runnableC2017n.f7443k) {
                return;
            }
            runnableC2017n.f7443k = true;
            ((AspectRatioFrameLayout) runnableC2017n.f7444l).post(runnableC2017n);
            return;
        }
        int i8 = this.f1926l;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    f8 = this.f1925k;
                } else if (i8 == 4) {
                    if (f12 > 0.0f) {
                        f8 = this.f1925k;
                    } else {
                        f9 = this.f1925k;
                    }
                }
                measuredWidth = (int) (f11 * f8);
            } else {
                f9 = this.f1925k;
            }
            measuredHeight = (int) (f10 / f9);
        } else if (f12 > 0.0f) {
            f9 = this.f1925k;
            measuredHeight = (int) (f10 / f9);
        } else {
            f8 = this.f1925k;
            measuredWidth = (int) (f11 * f8);
        }
        if (!runnableC2017n.f7443k) {
            runnableC2017n.f7443k = true;
            ((AspectRatioFrameLayout) runnableC2017n.f7444l).post(runnableC2017n);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f8) {
        if (this.f1925k != f8) {
            this.f1925k = f8;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC2601a interfaceC2601a) {
    }

    public void setResizeMode(int i) {
        if (this.f1926l != i) {
            this.f1926l = i;
            requestLayout();
        }
    }
}
