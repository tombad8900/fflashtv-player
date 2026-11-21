package p104m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import p004a3.C0067e;
import p071i1.C1240s;
import p140q0.InterfaceC2250j;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.c0 */
/* loaded from: classes.dex */
public class C1705c0 extends RadioButton implements InterfaceC2250j {

    /* renamed from: j */
    public final C0067e f6514j;

    /* renamed from: k */
    public final C1240s f6515k;

    /* renamed from: l */
    public final C1768s0 f6516l;

    /* renamed from: m */
    public C1779w f6517m;

    public C1705c0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        AbstractC1707c2.m3388a(this, getContext());
        C0067e c0067e = new C0067e(this);
        this.f6514j = c0067e;
        c0067e.m253d(attributeSet, R.attr.radioButtonStyle);
        C1240s c1240s = new C1240s(this);
        this.f6515k = c1240s;
        c1240s.m2703m(attributeSet, R.attr.radioButtonStyle);
        C1768s0 c1768s0 = new C1768s0(this);
        this.f6516l = c1768s0;
        c1768s0.m3445h(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().m3468a(attributeSet, R.attr.radioButtonStyle);
    }

    private C1779w getEmojiTextViewHelper() {
        if (this.f6517m == null) {
            this.f6517m = new C1779w(this);
        }
        return this.f6517m;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1240s c1240s = this.f6515k;
        if (c1240s != null) {
            c1240s.m2692b();
        }
        C1768s0 c1768s0 = this.f6516l;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1240s c1240s = this.f6515k;
        if (c1240s != null) {
            return c1240s.m2700j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1240s c1240s = this.f6515k;
        if (c1240s != null) {
            return c1240s.m2701k();
        }
        return null;
    }

    @Override // p140q0.InterfaceC2250j
    public ColorStateList getSupportButtonTintList() {
        C0067e c0067e = this.f6514j;
        if (c0067e != null) {
            return (ColorStateList) c0067e.f310e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0067e c0067e = this.f6514j;
        if (c0067e != null) {
            return (PorterDuff.Mode) c0067e.f311f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6516l.m3443f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6516l.m3444g();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().m3469b(z7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1240s c1240s = this.f6515k;
        if (c1240s != null) {
            c1240s.m2705o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1240s c1240s = this.f6515k;
        if (c1240s != null) {
            c1240s.m2706p(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0067e c0067e = this.f6514j;
        if (c0067e != null) {
            if (c0067e.f308c) {
                c0067e.f308c = false;
            } else {
                c0067e.f308c = true;
                c0067e.m250a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6516l;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6516l;
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
        C1240s c1240s = this.f6515k;
        if (c1240s != null) {
            c1240s.m2711u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1240s c1240s = this.f6515k;
        if (c1240s != null) {
            c1240s.m2712v(mode);
        }
    }

    @Override // p140q0.InterfaceC2250j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0067e c0067e = this.f6514j;
        if (c0067e != null) {
            c0067e.f310e = colorStateList;
            c0067e.f306a = true;
            c0067e.m250a();
        }
    }

    @Override // p140q0.InterfaceC2250j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0067e c0067e = this.f6514j;
        if (c0067e != null) {
            c0067e.f311f = mode;
            c0067e.f307b = true;
            c0067e.m250a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1768s0 c1768s0 = this.f6516l;
        c1768s0.m3450n(colorStateList);
        c1768s0.m3441b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1768s0 c1768s0 = this.f6516l;
        c1768s0.m3451o(mode);
        c1768s0.m3441b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0715d.m1542D(getContext(), i));
    }
}
