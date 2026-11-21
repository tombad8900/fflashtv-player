package p104m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0120b;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p071i1.C1240s;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.q */
/* loaded from: classes.dex */
public class C1760q extends Button {

    /* renamed from: j */
    public final C1240s f6708j;

    /* renamed from: k */
    public final C1768s0 f6709k;

    /* renamed from: l */
    public C1779w f6710l;

    /* renamed from: m */
    public C1765r0 f6711m;

    public C1760q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1707c2.m3388a(this, getContext());
        C1240s c1240s = new C1240s(this);
        this.f6708j = c1240s;
        c1240s.m2703m(attributeSet, i);
        C1768s0 c1768s0 = new C1768s0(this);
        this.f6709k = c1768s0;
        c1768s0.m3445h(attributeSet, i);
        c1768s0.m3441b();
        getEmojiTextViewHelper().m3468a(attributeSet, i);
    }

    private C1779w getEmojiTextViewHelper() {
        if (this.f6710l == null) {
            this.f6710l = new C1779w(this);
        }
        return this.f6710l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1240s c1240s = this.f6708j;
        if (c1240s != null) {
            c1240s.m2692b();
        }
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC1763q2.f6717c) {
            return super.getAutoSizeMaxTextSize();
        }
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 != null) {
            return Math.round(c1768s0.f6740i.f6828e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC1763q2.f6717c) {
            return super.getAutoSizeMinTextSize();
        }
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 != null) {
            return Math.round(c1768s0.f6740i.f6827d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC1763q2.f6717c) {
            return super.getAutoSizeStepGranularity();
        }
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 != null) {
            return Math.round(c1768s0.f6740i.f6826c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC1763q2.f6717c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1768s0 c1768s0 = this.f6709k;
        return c1768s0 != null ? c1768s0.f6740i.f6829f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC1763q2.f6717c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 != null) {
            return c1768s0.f6740i.f6824a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0120b.m406Q(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().f6726e;
    }

    public C1765r0 getFontVariationSettingsManager() {
        if (this.f6711m == null) {
            this.f6711m = new C1765r0(this, new C1756p(this, 0));
        }
        return this.f6711m;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1240s c1240s = this.f6708j;
        if (c1240s != null) {
            return c1240s.m2700j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1240s c1240s = this.f6708j;
        if (c1240s != null) {
            return c1240s.m2701k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6709k.m3443f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6709k.m3444g();
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().f6724c : super.getTypeface();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        super.onLayout(z7, i, i4, i8, i9);
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 == null || AbstractC1763q2.f6717c) {
            return;
        }
        c1768s0.f6740i.m3487a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i4, int i8) {
        super.onTextChanged(charSequence, i, i4, i8);
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 != null) {
            C1789z0 c1789z0 = c1768s0.f6740i;
            if (AbstractC1763q2.f6717c || !c1789z0.m3489f()) {
                return;
            }
            c1789z0.m3487a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().m3469b(z7);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i4, int i8, int i9) {
        if (AbstractC1763q2.f6717c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i4, i8, i9);
            return;
        }
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 != null) {
            c1768s0.m3447k(i, i4, i8, i9);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC1763q2.f6717c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 != null) {
            c1768s0.m3448l(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC1763q2.f6717c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 != null) {
            c1768s0.m3449m(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1240s c1240s = this.f6708j;
        if (c1240s != null) {
            c1240s.m2705o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1240s c1240s = this.f6708j;
        if (c1240s != null) {
            c1240s.m2706p(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0120b.m407R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().m3470c(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC2415i0) getEmojiTextViewHelper().f6793b.f6229j).mo4277j(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().m3436a(str);
    }

    public void setSupportAllCaps(boolean z7) {
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 != null) {
            c1768s0.f6732a.setAllCaps(z7);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1240s c1240s = this.f6708j;
        if (c1240s != null) {
            c1240s.m2711u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1240s c1240s = this.f6708j;
        if (c1240s != null) {
            c1240s.m2712v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1768s0 c1768s0 = this.f6709k;
        c1768s0.m3450n(colorStateList);
        c1768s0.m3441b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1768s0 c1768s0 = this.f6709k;
        c1768s0.m3451o(mode);
        c1768s0.m3441b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 != null) {
            c1768s0.m3446i(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f8) {
        boolean z7 = AbstractC1763q2.f6717c;
        if (z7) {
            super.setTextSize(i, f8);
            return;
        }
        C1768s0 c1768s0 = this.f6709k;
        if (c1768s0 != null) {
            C1789z0 c1789z0 = c1768s0.f6740i;
            if (z7 || c1789z0.m3489f()) {
                return;
            }
            c1789z0.m3490g(i, f8);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        if (Build.VERSION.SDK_INT < 26) {
            super.setTypeface(typeface);
            return;
        }
        C1765r0 fontVariationSettingsManager = getFontVariationSettingsManager();
        fontVariationSettingsManager.f6724c = typeface;
        fontVariationSettingsManager.f6725d = typeface;
        fontVariationSettingsManager.f6723b.accept(typeface);
    }
}
