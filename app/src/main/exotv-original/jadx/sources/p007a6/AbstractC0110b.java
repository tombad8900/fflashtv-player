package p007a6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.R;
import p034d5.AbstractC0847a;
import p035d6.AbstractC0848a;
import p162s5.AbstractC2374l;
import p168t2.AbstractC2429w;
import p171t5.AbstractC2436a;
import p211y5.C2823j;
import p211y5.C2828o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a6.b */
/* loaded from: classes.dex */
public abstract class AbstractC0110b extends FrameLayout {

    /* renamed from: r */
    public static final ViewOnTouchListenerC0109a f556r = new ViewOnTouchListenerC0109a();

    /* renamed from: j */
    public final C2828o f557j;

    /* renamed from: k */
    public int f558k;

    /* renamed from: l */
    public final float f559l;

    /* renamed from: m */
    public final float f560m;

    /* renamed from: n */
    public final int f561n;

    /* renamed from: o */
    public final int f562o;

    /* renamed from: p */
    public ColorStateList f563p;

    /* renamed from: q */
    public PorterDuff.Mode f564q;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0110b(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(AbstractC0848a.m2015b(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0847a.f3734C);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f558k = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f557j = C2828o.m4952f(context2, attributeSet, 0, 0).m4951a();
        }
        this.f559l = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC2429w.m4301f(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC2374l.m4216f(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f560m = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f561n = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f562o = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(f556r);
        setFocusable(true);
        if (getBackground() == null) {
            int iM1503P = AbstractC0714c.m1503P(getBackgroundOverlayColorAlpha(), AbstractC0714c.m1509X(getContext(), AbstractC2436a.m4345t(this, R.attr.colorSurface)), AbstractC0714c.m1509X(getContext(), AbstractC2436a.m4345t(this, R.attr.colorOnSurface)));
            C2828o c2828o = this.f557j;
            if (c2828o != null) {
                int i = AbstractC0111c.f565a;
                C2823j c2823j = new C2823j(c2828o);
                c2823j.m4945q(ColorStateList.valueOf(iM1503P));
                gradientDrawable = c2823j;
            } else {
                Resources resources = getResources();
                int i4 = AbstractC0111c.f565a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iM1503P);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f563p;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(AbstractC0111c abstractC0111c) {
    }

    public float getActionTextColorAlpha() {
        return this.f560m;
    }

    public int getAnimationMode() {
        return this.f558k;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f559l;
    }

    public int getMaxInlineActionWidth() {
        return this.f562o;
    }

    public int getMaxWidth() {
        return this.f561n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        super.onLayout(z7, i, i4, i8, i9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int i8 = this.f561n;
        if (i8 <= 0 || getMeasuredWidth() <= i8) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), i4);
    }

    public void setAnimationMode(int i) {
        this.f558k = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f563p != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f563p);
            drawable.setTintMode(this.f564q);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f563p = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f564q);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f564q = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f556r);
        super.setOnClickListener(onClickListener);
    }
}
