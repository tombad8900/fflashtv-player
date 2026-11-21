package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.exotv.net.R;
import p054g.AbstractC1026a;
import p104m.AbstractC1699a2;
import p104m.C1700b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: j */
    public boolean f640j;

    /* renamed from: k */
    public View f641k;

    /* renamed from: l */
    public View f642l;

    /* renamed from: m */
    public Drawable f643m;

    /* renamed from: n */
    public Drawable f644n;

    /* renamed from: o */
    public Drawable f645o;

    /* renamed from: p */
    public final boolean f646p;

    /* renamed from: q */
    public boolean f647q;

    /* renamed from: r */
    public final int f648r;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1700b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1026a.f4308a);
        boolean z7 = false;
        this.f643m = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f644n = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f648r = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f646p = true;
            this.f645o = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f646p ? !(this.f643m != null || this.f644n != null) : this.f645o == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f643m;
        if (drawable != null && drawable.isStateful()) {
            this.f643m.setState(getDrawableState());
        }
        Drawable drawable2 = this.f644n;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f644n.setState(getDrawableState());
        }
        Drawable drawable3 = this.f645o;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f645o.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f643m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f644n;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f645o;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f641k = findViewById(R.id.action_bar);
        this.f642l = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f640j || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        View view;
        super.onLayout(z7, i, i4, i8, i9);
        boolean z8 = true;
        if (this.f646p) {
            Drawable drawable = this.f645o;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z8 = false;
            }
        } else {
            if (this.f643m == null) {
                z8 = false;
            } else if (this.f641k.getVisibility() == 0 || ((view = this.f642l) != null && view.getVisibility() == 0)) {
                this.f643m.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                this.f643m.setBounds(0, 0, 0, 0);
            }
            this.f647q = false;
        }
        if (z8) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int i8;
        if (this.f641k == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i8 = this.f648r) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i8, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i4);
        if (this.f641k == null) {
            return;
        }
        View.MeasureSpec.getMode(i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f643m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f643m);
        }
        this.f643m = drawable;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f641k != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f646p ? !(this.f643m != null || this.f644n != null) : this.f645o == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f645o;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f645o);
        }
        this.f645o = drawable;
        boolean z7 = this.f646p;
        boolean z8 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z7 && (drawable2 = this.f645o) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z7 ? !(this.f643m != null || this.f644n != null) : this.f645o == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f644n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f644n);
        }
        this.f644n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f647q && this.f644n != null) {
                throw null;
            }
        }
        boolean z7 = false;
        if (!this.f646p ? !(this.f643m != null || this.f644n != null) : this.f645o == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC1699a2 abstractC1699a2) {
    }

    public void setTransitioning(boolean z7) {
        this.f640j = z7;
        setDescendantFocusability(z7 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z7 = i == 0;
        Drawable drawable = this.f643m;
        if (drawable != null) {
            drawable.setVisible(z7, false);
        }
        Drawable drawable2 = this.f644n;
        if (drawable2 != null) {
            drawable2.setVisible(z7, false);
        }
        Drawable drawable3 = this.f645o;
        if (drawable3 != null) {
            drawable3.setVisible(z7, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f643m;
        boolean z7 = this.f646p;
        if (drawable == drawable2 && !z7) {
            return true;
        }
        if (drawable == this.f644n && this.f647q) {
            return true;
        }
        return (drawable == this.f645o && z7) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
