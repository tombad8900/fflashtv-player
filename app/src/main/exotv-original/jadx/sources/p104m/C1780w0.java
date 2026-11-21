package p104m;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0120b;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.bumptech.glide.AbstractC0715d;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p017b6.AbstractC0622v;
import p037e0.AbstractC0854e;
import p071i1.C1240s;
import p088k0.AbstractC1549d;
import p088k0.C1548c;
import p095l.C1629o;
import p105m0.AbstractC1857w;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.w0 */
/* loaded from: classes.dex */
public class C1780w0 extends TextView {

    /* renamed from: j */
    public final C1240s f6794j;

    /* renamed from: k */
    public final C1768s0 f6795k;

    /* renamed from: l */
    public final C1701b0 f6796l;

    /* renamed from: m */
    public C1779w f6797m;

    /* renamed from: n */
    public boolean f6798n;

    /* renamed from: o */
    public C1629o f6799o;

    /* renamed from: p */
    public Future f6800p;

    /* renamed from: q */
    public C1765r0 f6801q;

    public C1780w0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C1779w getEmojiTextViewHelper() {
        if (this.f6797m == null) {
            this.f6797m = new C1779w(this);
        }
        return this.f6797m;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1240s c1240s = this.f6794j;
        if (c1240s != null) {
            c1240s.m2692b();
        }
        C1768s0 c1768s0 = this.f6795k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC1763q2.f6717c) {
            return super.getAutoSizeMaxTextSize();
        }
        C1768s0 c1768s0 = this.f6795k;
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
        C1768s0 c1768s0 = this.f6795k;
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
        C1768s0 c1768s0 = this.f6795k;
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
        C1768s0 c1768s0 = this.f6795k;
        return c1768s0 != null ? c1768s0.f6740i.f6829f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC1763q2.f6717c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1768s0 c1768s0 = this.f6795k;
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
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        return getFontVariationSettingsManager().f6726e;
    }

    public C1765r0 getFontVariationSettingsManager() {
        if (this.f6801q == null) {
            this.f6801q = new C1765r0(this, new C1756p(this, 2));
        }
        return this.f6801q;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC1771t0 getSuperCaller() {
        if (this.f6799o == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f6799o = new C1777v0(this);
            } else if (i >= 28) {
                this.f6799o = new C1774u0(this);
            } else if (i >= 26) {
                this.f6799o = new C1629o((Object) this);
            }
        }
        return this.f6799o;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1240s c1240s = this.f6794j;
        if (c1240s != null) {
            return c1240s.m2700j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1240s c1240s = this.f6794j;
        if (c1240s != null) {
            return c1240s.m2701k();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6795k.m3443f();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6795k.m3444g();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f6800p;
        if (future != null) {
            try {
                this.f6800p = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0120b.m427w(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1701b0 c1701b0;
        if (Build.VERSION.SDK_INT >= 28 || (c1701b0 = this.f6796l) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1701b0.f6511c;
        return textClassifier == null ? AbstractC0622v.m1395g((TextView) c1701b0.f6510b) : textClassifier;
    }

    public C1548c getTextMetricsParamsCompat() {
        return AbstractC0120b.m427w(this);
    }

    @Override // android.widget.TextView
    public Typeface getTypeface() {
        return Build.VERSION.SDK_INT >= 26 ? getFontVariationSettingsManager().f6724c : super.getTypeface();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f6795k.getClass();
        C1768s0.m3439j(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0715d.m1552U(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        super.onLayout(z7, i, i4, i8, i9);
        C1768s0 c1768s0 = this.f6795k;
        if (c1768s0 == null || AbstractC1763q2.f6717c) {
            return;
        }
        c1768s0.f6740i.m3487a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i4) {
        Future future = this.f6800p;
        if (future != null) {
            try {
                this.f6800p = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0120b.m427w(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i8) {
        super.onTextChanged(charSequence, i, i4, i8);
        C1768s0 c1768s0 = this.f6795k;
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
        C1768s0 c1768s0 = this.f6795k;
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
        C1768s0 c1768s0 = this.f6795k;
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
        C1768s0 c1768s0 = this.f6795k;
        if (c1768s0 != null) {
            c1768s0.m3449m(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1240s c1240s = this.f6794j;
        if (c1240s != null) {
            c1240s.m2705o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1240s c1240s = this.f6794j;
        if (c1240s != null) {
            c1240s.m2706p(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6795k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6795k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6795k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1768s0 c1768s0 = this.f6795k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
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
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo3325o(i);
        } else {
            AbstractC0120b.m397H(this, i);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return getFontVariationSettingsManager().m3436a(str);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo3324l(i);
        } else {
            AbstractC0120b.m398I(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC0120b.m399J(this, i);
    }

    public void setPrecomputedText(AbstractC1549d abstractC1549d) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0120b.m427w(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1240s c1240s = this.f6794j;
        if (c1240s != null) {
            c1240s.m2711u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1240s c1240s = this.f6794j;
        if (c1240s != null) {
            c1240s.m2712v(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1768s0 c1768s0 = this.f6795k;
        c1768s0.m3450n(colorStateList);
        c1768s0.m3441b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1768s0 c1768s0 = this.f6795k;
        c1768s0.m3451o(mode);
        c1768s0.m3441b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1768s0 c1768s0 = this.f6795k;
        if (c1768s0 != null) {
            c1768s0.m3446i(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1701b0 c1701b0;
        if (Build.VERSION.SDK_INT >= 28 || (c1701b0 = this.f6796l) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1701b0.f6511c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC1549d> future) {
        this.f6800p = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C1548c c1548c) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c1548c.f5934b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(c1548c.f5933a);
        setBreakStrategy(c1548c.f5935c);
        setHyphenationFrequency(c1548c.f5936d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f8) {
        boolean z7 = AbstractC1763q2.f6717c;
        if (z7) {
            super.setTextSize(i, f8);
            return;
        }
        C1768s0 c1768s0 = this.f6795k;
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

    public C1780w0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6798n = false;
        this.f6799o = null;
        AbstractC1707c2.m3388a(this, getContext());
        C1240s c1240s = new C1240s(this);
        this.f6794j = c1240s;
        c1240s.m2703m(attributeSet, i);
        C1768s0 c1768s0 = new C1768s0(this);
        this.f6795k = c1768s0;
        c1768s0.m3445h(attributeSet, i);
        c1768s0.m3441b();
        C1701b0 c1701b0 = new C1701b0();
        c1701b0.f6510b = this;
        this.f6796l = c1701b0;
        getEmojiTextViewHelper().m3468a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f8) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            getSuperCaller().mo3326q(i, f8);
        } else if (i4 >= 34) {
            AbstractC1857w.m3642h(this, i, f8);
        } else {
            AbstractC0120b.m399J(this, Math.round(TypedValue.applyDimension(i, f8, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i4, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0715d.m1542D(context, i) : null, i4 != 0 ? AbstractC0715d.m1542D(context, i4) : null, i8 != 0 ? AbstractC0715d.m1542D(context, i8) : null, i9 != 0 ? AbstractC0715d.m1542D(context, i9) : null);
        C1768s0 c1768s0 = this.f6795k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i4, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0715d.m1542D(context, i) : null, i4 != 0 ? AbstractC0715d.m1542D(context, i4) : null, i8 != 0 ? AbstractC0715d.m1542D(context, i8) : null, i9 != 0 ? AbstractC0715d.m1542D(context, i9) : null);
        C1768s0 c1768s0 = this.f6795k;
        if (c1768s0 != null) {
            c1768s0.m3441b();
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.f6798n) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            AbstractC0715d abstractC0715d = AbstractC0854e.f3776a;
            if (context != null) {
                typeface = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        }
        this.f6798n = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f6798n = false;
        }
    }
}
