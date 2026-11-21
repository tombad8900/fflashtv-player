package p104m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p071i1.C1240s;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.a1 */
/* loaded from: classes.dex */
public final class C1698a1 extends ToggleButton {

    /* renamed from: j */
    public final C1240s f6504j;

    /* renamed from: k */
    public final C1768s0 f6505k;

    /* renamed from: l */
    public C1779w f6506l;

    public C1698a1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC1707c2.m3388a(this, getContext());
        C1240s c1240s = new C1240s(this);
        this.f6504j = c1240s;
        c1240s.m2703m(attributeSet, R.attr.buttonStyleToggle);
        C1768s0 c1768s0 = new C1768s0(this);
        this.f6505k = c1768s0;
        c1768s0.m3445h(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m3468a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1779w getEmojiTextViewHelper() {
        if (this.f6506l == null) {
            this.f6506l = new C1779w(this);
        }
        return this.f6506l;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1240s c1240s = this.f6504j;
        if (c1240s != null) {
            c1240s.m2692b();
        }
        C1768s0 c1768s0 = this.f6505k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1240s c1240s = this.f6504j;
        if (c1240s != null) {
            return c1240s.m2700j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1240s c1240s = this.f6504j;
        if (c1240s != null) {
            return c1240s.m2701k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6505k.m3443f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6505k.m3444g();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().m3469b(z7);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1240s c1240s = this.f6504j;
        if (c1240s != null) {
            c1240s.m2705o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1240s c1240s = this.f6504j;
        if (c1240s != null) {
            c1240s.m2706p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6505k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6505k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().m3470c(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC2415i0) getEmojiTextViewHelper().f6793b.f6229j).mo4277j(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1240s c1240s = this.f6504j;
        if (c1240s != null) {
            c1240s.m2711u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1240s c1240s = this.f6504j;
        if (c1240s != null) {
            c1240s.m2712v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1768s0 c1768s0 = this.f6505k;
        c1768s0.m3450n(colorStateList);
        c1768s0.m3441b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1768s0 c1768s0 = this.f6505k;
        c1768s0.m3451o(mode);
        c1768s0.m3441b();
    }
}
