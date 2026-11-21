package p179u5;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import com.bumptech.glide.AbstractC0714c;
import p034d5.AbstractC0847a;
import p035d6.AbstractC0848a;
import p104m.C1705c0;
import p162s5.AbstractC2374l;
import p168t2.AbstractC2429w;
import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u5.a */
/* loaded from: classes.dex */
public final class C2479a extends C1705c0 {

    /* renamed from: p */
    public static final int[][] f9072p = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: n */
    public ColorStateList f9073n;

    /* renamed from: o */
    public boolean f9074o;

    public C2479a(Context context, AttributeSet attributeSet) {
        super(AbstractC0848a.m2015b(context, attributeSet, com.exotv.net.R.attr.radioButtonStyle, com.exotv.net.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayM4215e = AbstractC2374l.m4215e(context2, attributeSet, AbstractC0847a.f3757s, com.exotv.net.R.attr.radioButtonStyle, com.exotv.net.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM4215e.hasValue(0)) {
            setButtonTintList(AbstractC2429w.m4301f(context2, typedArrayM4215e, 0));
        }
        if (typedArrayM4215e.hasValue(1)) {
            setRippleColor(AbstractC2429w.m4301f(context2, typedArrayM4215e, 1));
        }
        this.f9074o = typedArrayM4215e.getBoolean(2, false);
        typedArrayM4215e.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9073n == null) {
            int iM1509X = AbstractC0714c.m1509X(getContext(), AbstractC2436a.m4345t(this, com.exotv.net.R.attr.colorControlActivated));
            int iM1509X2 = AbstractC0714c.m1509X(getContext(), AbstractC2436a.m4345t(this, com.exotv.net.R.attr.colorOnSurface));
            int iM1509X3 = AbstractC0714c.m1509X(getContext(), AbstractC2436a.m4345t(this, com.exotv.net.R.attr.colorSurface));
            this.f9073n = new ColorStateList(f9072p, new int[]{AbstractC0714c.m1503P(1.0f, iM1509X3, iM1509X), AbstractC0714c.m1503P(0.54f, iM1509X3, iM1509X2), AbstractC0714c.m1503P(0.38f, iM1509X3, iM1509X2), AbstractC0714c.m1503P(0.38f, iM1509X3, iM1509X2)});
        }
        return this.f9073n;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9074o && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z7) {
        this.f9074o = z7;
        if (z7) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
