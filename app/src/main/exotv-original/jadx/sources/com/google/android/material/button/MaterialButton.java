package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0120b;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.RunnableC0127c0;
import androidx.media3.exoplayer.audio.RunnableC0320i;
import androidx.media3.exoplayer.source.preload.C0456a;
import com.bumptech.glide.AbstractC0715d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p002a1.C0036o;
import p024c5.RunnableC0653c0;
import p034d5.AbstractC0847a;
import p035d6.AbstractC0848a;
import p084j5.AbstractC1509h;
import p084j5.C1503b;
import p084j5.C1505d;
import p084j5.C1510i;
import p084j5.EnumC1506e;
import p084j5.InterfaceC1504c;
import p084j5.RunnableC1502a;
import p104m.C1760q;
import p162s5.AbstractC2374l;
import p168t2.AbstractC2429w;
import p171t5.AbstractC2436a;
import p175u0.C2454f;
import p175u0.C2455g;
import p196w5.AbstractC2703a;
import p211y5.C2814c0;
import p211y5.C2816d0;
import p211y5.C2818e0;
import p211y5.C2823j;
import p211y5.C2828o;
import p211y5.InterfaceC2826m;
import p211y5.InterfaceC2839z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class MaterialButton extends C1760q implements Checkable, InterfaceC2839z {

    /* renamed from: a0 */
    public static final int[] f3154a0 = {R.attr.state_checkable};

    /* renamed from: b0 */
    public static final int[] f3155b0 = {R.attr.state_checked};

    /* renamed from: c0 */
    public static final C1503b f3156c0 = new C1503b();

    /* renamed from: A */
    public int f3157A;

    /* renamed from: B */
    public int f3158B;

    /* renamed from: C */
    public int f3159C;

    /* renamed from: D */
    public int f3160D;

    /* renamed from: E */
    public boolean f3161E;

    /* renamed from: F */
    public boolean f3162F;

    /* renamed from: G */
    public int f3163G;

    /* renamed from: H */
    public int f3164H;

    /* renamed from: I */
    public int f3165I;

    /* renamed from: J */
    public float f3166J;

    /* renamed from: K */
    public int f3167K;

    /* renamed from: L */
    public int f3168L;

    /* renamed from: M */
    public LinearLayout.LayoutParams f3169M;

    /* renamed from: N */
    public boolean f3170N;

    /* renamed from: O */
    public int f3171O;

    /* renamed from: P */
    public boolean f3172P;

    /* renamed from: Q */
    public int f3173Q;

    /* renamed from: R */
    public C2818e0 f3174R;

    /* renamed from: S */
    public int f3175S;

    /* renamed from: T */
    public EnumC1506e f3176T;

    /* renamed from: U */
    public float f3177U;

    /* renamed from: V */
    public float f3178V;

    /* renamed from: W */
    public C2454f f3179W;

    /* renamed from: n */
    public final C1510i f3180n;

    /* renamed from: o */
    public final LinkedHashSet f3181o;

    /* renamed from: p */
    public InterfaceC1504c f3182p;

    /* renamed from: q */
    public PorterDuff.Mode f3183q;

    /* renamed from: r */
    public ColorStateList f3184r;

    /* renamed from: s */
    public Drawable f3185s;

    /* renamed from: t */
    public PorterDuff.Mode f3186t;

    /* renamed from: u */
    public ColorStateList f3187u;

    /* renamed from: v */
    public Drawable f3188v;

    /* renamed from: w */
    public boolean f3189w;

    /* renamed from: x */
    public String f3190x;

    /* renamed from: y */
    public int f3191y;

    /* renamed from: z */
    public int f3192z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0848a.m2014a(com.exotv.net.R.attr.materialButtonStyle, com.exotv.net.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.exotv.net.R.attr.materialSizeOverlay}), attributeSet, com.exotv.net.R.attr.materialButtonStyle);
        this.f3181o = new LinkedHashSet();
        this.f3161E = false;
        this.f3162F = false;
        this.f3165I = Integer.MIN_VALUE;
        this.f3166J = -2.1474836E9f;
        this.f3167K = Integer.MIN_VALUE;
        this.f3168L = Integer.MIN_VALUE;
        this.f3173Q = Integer.MIN_VALUE;
        this.f3176T = EnumC1506e.f5778m;
        Context context2 = getContext();
        TypedArray typedArrayM4215e = AbstractC2374l.m4215e(context2, attributeSet, AbstractC0847a.f3749k, com.exotv.net.R.attr.materialButtonStyle, com.exotv.net.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f3158B = typedArrayM4215e.getDimensionPixelSize(13, 0);
        int i = typedArrayM4215e.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f3183q = AbstractC2374l.m4216f(i, mode);
        this.f3184r = AbstractC2429w.m4301f(getContext(), typedArrayM4215e, 15);
        this.f3185s = AbstractC2429w.m4302g(getContext(), typedArrayM4215e, 11);
        this.f3163G = typedArrayM4215e.getInteger(12, 1);
        this.f3191y = typedArrayM4215e.getDimensionPixelSize(14, 0);
        this.f3186t = AbstractC2374l.m4216f(typedArrayM4215e.getInt(22, -1), mode);
        this.f3187u = typedArrayM4215e.hasValue(21) ? AbstractC2429w.m4301f(getContext(), typedArrayM4215e, 21) : this.f3184r;
        this.f3164H = typedArrayM4215e.getInteger(20, 3);
        Drawable drawableM4302g = AbstractC2429w.m4302g(getContext(), typedArrayM4215e, 19);
        this.f3188v = drawableM4302g;
        this.f3189w = drawableM4302g == null;
        InterfaceC2826m interfaceC2826mM4918g = C2814c0.m4918g(context2, typedArrayM4215e, 23);
        interfaceC2826mM4918g = interfaceC2826mM4918g == null ? C2828o.m4952f(context2, attributeSet, com.exotv.net.R.attr.materialButtonStyle, com.exotv.net.R.style.Widget_MaterialComponents_Button).m4951a() : interfaceC2826mM4918g;
        boolean z7 = typedArrayM4215e.getBoolean(17, false);
        C1510i c1510i = new C1510i(this, interfaceC2826mM4918g);
        this.f3180n = c1510i;
        c1510i.f5797e = typedArrayM4215e.getDimensionPixelOffset(2, 0);
        c1510i.f5798f = typedArrayM4215e.getDimensionPixelOffset(3, 0);
        c1510i.f5799g = typedArrayM4215e.getDimensionPixelOffset(4, 0);
        c1510i.f5800h = typedArrayM4215e.getDimensionPixelOffset(5, 0);
        if (typedArrayM4215e.hasValue(9)) {
            int dimensionPixelSize = typedArrayM4215e.getDimensionPixelSize(9, -1);
            c1510i.f5801i = dimensionPixelSize;
            c1510i.f5794b = c1510i.f5794b.mo4919a(dimensionPixelSize);
            c1510i.m3196d();
            c1510i.f5810r = true;
        }
        c1510i.f5802j = typedArrayM4215e.getDimensionPixelSize(26, 0);
        c1510i.f5803k = AbstractC2374l.m4216f(typedArrayM4215e.getInt(8, -1), mode);
        c1510i.f5804l = AbstractC2429w.m4301f(getContext(), typedArrayM4215e, 7);
        c1510i.f5805m = AbstractC2429w.m4301f(getContext(), typedArrayM4215e, 25);
        c1510i.f5806n = AbstractC2429w.m4301f(getContext(), typedArrayM4215e, 18);
        c1510i.f5811s = typedArrayM4215e.getBoolean(6, false);
        c1510i.f5814v = typedArrayM4215e.getDimensionPixelSize(10, 0);
        c1510i.f5812t = typedArrayM4215e.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM4215e.hasValue(0)) {
            c1510i.f5809q = true;
            setSupportBackgroundTintList(c1510i.f5804l);
            setSupportBackgroundTintMode(c1510i.f5803k);
        } else {
            c1510i.m3195c();
        }
        setPaddingRelative(paddingStart + c1510i.f5797e, paddingTop + c1510i.f5799g, paddingEnd + c1510i.f5798f, paddingBottom + c1510i.f5800h);
        setCheckedInternal(typedArrayM4215e.getBoolean(1, false));
        if (interfaceC2826mM4918g instanceof C2814c0) {
            c1510i.f5795c = m1805g();
            if (c1510i.f5794b instanceof C2814c0) {
                c1510i.m3196d();
            }
        }
        setOpticalCenterEnabled(z7);
        typedArrayM4215e.recycle();
        setCompoundDrawablePadding(this.f3158B);
        m1820v(this.f3185s != null);
        m1823y(this.f3188v != null);
    }

    /* renamed from: b */
    public static /* synthetic */ void m1800b(MaterialButton materialButton) {
        materialButton.f3171O = materialButton.getOpticalCenterShift();
        materialButton.m1822x();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f3177U;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        C2823j c2823jM3193a;
        if (this.f3170N && this.f3172P && (c2823jM3193a = this.f3180n.m3193a(false)) != null) {
            return (int) (c2823jM3193a.m4936h() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z7) {
        if (!m1810l() || this.f3161E == z7) {
            return;
        }
        this.f3161E = z7;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z8 = this.f3161E;
            if (!materialButtonToggleGroup.f3196w) {
                materialButtonToggleGroup.m1825l(getId(), z8);
            }
        }
        if (this.f3162F) {
            return;
        }
        this.f3162F = true;
        Iterator it = this.f3181o.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f3162F = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f8) {
        if (this.f3177U != f8) {
            this.f3177U = f8;
            m1822x();
            invalidate();
            if (getParent() instanceof AbstractC1509h) {
                AbstractC1509h abstractC1509h = (AbstractC1509h) getParent();
                int i = (int) this.f3177U;
                int iIndexOfChild = abstractC1509h.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                MaterialButton materialButtonM3189h = abstractC1509h.m3189h(iIndexOfChild);
                MaterialButton materialButtonM3188g = abstractC1509h.m3188g(iIndexOfChild);
                if (materialButtonM3189h == null && materialButtonM3188g == null) {
                    return;
                }
                if (materialButtonM3189h == null) {
                    materialButtonM3188g.setDisplayedWidthDecrease(i);
                }
                if (materialButtonM3188g == null) {
                    materialButtonM3189h.setDisplayedWidthDecrease(i);
                }
                if (materialButtonM3189h == null || materialButtonM3188g == null) {
                    return;
                }
                materialButtonM3189h.setDisplayedWidthDecrease(i / 2);
                materialButtonM3188g.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    /* renamed from: e */
    public final boolean m1803e() {
        if (m1812n() && m1815q()) {
            return true;
        }
        if (m1811m() && m1814p()) {
            return true;
        }
        return m1813o() && m1816r();
    }

    /* renamed from: f */
    public final boolean m1804f(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    /* renamed from: g */
    public final C2455g m1805g() {
        Context context = getContext();
        TypedValue typedValueM4340o = AbstractC2436a.m4340o(context.getTheme(), com.exotv.net.R.attr.motionSpringFastSpatial);
        int[] iArr = AbstractC0847a.f3759u;
        TypedArray typedArrayObtainStyledAttributes = typedValueM4340o == null ? context.obtainStyledAttributes(null, iArr, 0, com.exotv.net.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueM4340o.resourceId, iArr);
        C2455g c2455g = new C2455g();
        try {
            float f8 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f8 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f9 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f9 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f8 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            c2455g.f9006a = Math.sqrt(f8);
            c2455g.f9008c = false;
            if (f9 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            c2455g.f9007b = f9;
            c2455g.f9008c = false;
            typedArrayObtainStyledAttributes.recycle();
            return c2455g;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f3190x)) {
            return (m1810l() ? CompoundButton.class : Button.class).getName();
        }
        return this.f3190x;
    }

    public int getAllowedWidthDecrease() {
        return this.f3173Q;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m1817s()) {
            return this.f3180n.f5801i;
        }
        return 0;
    }

    public C2455g getCornerSpringForce() {
        return this.f3180n.f5795c;
    }

    public Drawable getIcon() {
        return this.f3185s;
    }

    public int getIconGravity() {
        return this.f3163G;
    }

    public int getIconPadding() {
        return this.f3158B;
    }

    public int getIconSize() {
        return this.f3191y;
    }

    public ColorStateList getIconTint() {
        return this.f3184r;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3183q;
    }

    public int getInsetBottom() {
        return this.f3180n.f5800h;
    }

    public int getInsetLeft() {
        return this.f3180n.f5797e;
    }

    public int getInsetRight() {
        return this.f3180n.f5798f;
    }

    public int getInsetTop() {
        return this.f3180n.f5799g;
    }

    public ColorStateList getRippleColor() {
        if (m1817s()) {
            return this.f3180n.f5806n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.f3188v;
    }

    public int getSecondaryIconGravity() {
        return this.f3164H;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.f3187u;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.f3186t;
    }

    public InterfaceC2826m getShapeAppearance() {
        if (m1817s()) {
            return this.f3180n.f5794b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
    }

    public C2828o getShapeAppearanceModel() {
        if (m1817s()) {
            return this.f3180n.f5794b.mo4922d();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m1817s()) {
            return this.f3180n.f5805m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m1817s()) {
            return this.f3180n.f5802j;
        }
        return 0;
    }

    @Override // p104m.C1760q
    public ColorStateList getSupportBackgroundTintList() {
        return m1817s() ? this.f3180n.f5804l : super.getSupportBackgroundTintList();
    }

    @Override // p104m.C1760q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m1817s() ? this.f3180n.f5803k : super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public final int m1806h(int i, int i4) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.f3185s;
        if (drawable != null) {
            intrinsicWidth = this.f3191y;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.f3188v;
        if (drawable2 != null) {
            intrinsicWidth2 = this.f3191y;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.f3158B) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i4 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    /* renamed from: i */
    public final int m1807i(int i, int i4) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i4) - this.f3158B) - getPaddingBottom()) / 2);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3161E;
    }

    /* renamed from: j */
    public final Drawable m1808j(int i) {
        if (i == 0) {
            if (this.f3188v == null || !m1815q()) {
                return null;
            }
            return this.f3188v;
        }
        if (i == 1) {
            if (this.f3188v == null || !m1816r()) {
                return null;
            }
            return this.f3188v;
        }
        if (i == 2 && this.f3188v != null && m1814p()) {
            return this.f3188v;
        }
        return null;
    }

    /* renamed from: k */
    public final Drawable m1809k(int i) {
        if (i == 0) {
            if (this.f3185s == null || !m1812n()) {
                return null;
            }
            return this.f3185s;
        }
        if (i == 1) {
            if (this.f3185s == null || !m1811m()) {
                return null;
            }
            return this.f3185s;
        }
        if (i == 2 && this.f3185s != null && m1811m()) {
            return this.f3185s;
        }
        return null;
    }

    /* renamed from: l */
    public final boolean m1810l() {
        C1510i c1510i = this.f3180n;
        return c1510i != null && c1510i.f5811s;
    }

    /* renamed from: m */
    public final boolean m1811m() {
        int i = this.f3163G;
        return i == 3 || i == 4;
    }

    /* renamed from: n */
    public final boolean m1812n() {
        int i = this.f3163G;
        return i == 1 || i == 2;
    }

    /* renamed from: o */
    public final boolean m1813o() {
        int i = this.f3163G;
        return i == 16 || i == 32;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m1817s()) {
            AbstractC2429w.m4310o(this, this.f3180n.m3193a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m1810l()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3154a0);
        }
        if (this.f3161E) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3155b0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p104m.C1760q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f3161E);
    }

    @Override // p104m.C1760q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m1810l());
        accessibilityNodeInfo.setChecked(this.f3161E);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p104m.C1760q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        int i10;
        super.onLayout(z7, i, i4, i8, i9);
        m1821w(getMeasuredWidth(), getMeasuredHeight());
        m1824z(getMeasuredWidth(), getMeasuredHeight());
        int i11 = getResources().getConfiguration().orientation;
        if (this.f3165I != i11) {
            this.f3165I = i11;
            this.f3166J = -2.1474836E9f;
        }
        if (this.f3166J == -2.1474836E9f) {
            this.f3166J = getMeasuredWidth();
            if (this.f3169M == null && (getParent() instanceof AbstractC1509h) && ((AbstractC1509h) getParent()).getButtonSizeChange() != null) {
                this.f3169M = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f3169M);
                layoutParams.width = (int) this.f3166J;
                setLayoutParams(layoutParams);
            }
        }
        boolean z8 = false;
        if (this.f3173Q == Integer.MIN_VALUE) {
            if (this.f3185s == null) {
                i10 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f3191y;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f3185s.getIntrinsicWidth();
                }
                i10 = iconPadding + intrinsicWidth;
            }
            this.f3173Q = (getMeasuredWidth() - getTextLayoutWidth()) - i10;
        }
        if (this.f3167K == Integer.MIN_VALUE) {
            this.f3167K = getPaddingStart();
        }
        if (this.f3168L == Integer.MIN_VALUE) {
            this.f3168L = getPaddingEnd();
        }
        if ((getParent() instanceof AbstractC1509h) && ((AbstractC1509h) getParent()).getOrientation() == 0) {
            z8 = true;
        }
        this.f3172P = z8;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1505d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1505d c1505d = (C1505d) parcelable;
        super.onRestoreInstanceState(c1505d.f8189j);
        setChecked(c1505d.f5774l);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1505d c1505d = new C1505d(super.onSaveInstanceState());
        c1505d.f5774l = this.f3161E;
        return c1505d;
    }

    @Override // p104m.C1760q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i8) {
        super.onTextChanged(charSequence, i, i4, i8);
        m1821w(getMeasuredWidth(), getMeasuredHeight());
        m1824z(getMeasuredWidth(), getMeasuredHeight());
    }

    /* renamed from: p */
    public final boolean m1814p() {
        int i = this.f3164H;
        return i == 3 || i == 4;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z7;
        if (isEnabled() && this.f3180n.f5812t) {
            toggle();
            z7 = true;
        } else {
            z7 = false;
        }
        boolean zPerformClick = super.performClick();
        if (z7 && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    /* renamed from: q */
    public final boolean m1815q() {
        int i = this.f3164H;
        return i == 1 || i == 2;
    }

    /* renamed from: r */
    public final boolean m1816r() {
        int i = this.f3164H;
        return i == 16 || i == 32;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f3185s != null) {
            if (this.f3185s.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* renamed from: s */
    public final boolean m1817s() {
        C1510i c1510i = this.f3180n;
        return (c1510i == null || c1510i.f5809q) ? false : true;
    }

    public void setA11yClassName(String str) {
        this.f3190x = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m1817s()) {
            super.setBackgroundColor(i);
            return;
        }
        C1510i c1510i = this.f3180n;
        if (c1510i.m3193a(false) != null) {
            c1510i.m3193a(false).setTint(i);
        }
    }

    @Override // p104m.C1760q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m1817s()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C1510i c1510i = this.f3180n;
        c1510i.f5809q = true;
        MaterialButton materialButton = c1510i.f5793a;
        materialButton.setSupportBackgroundTintList(c1510i.f5804l);
        materialButton.setSupportBackgroundTintMode(c1510i.f5803k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p104m.C1760q, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC0715d.m1542D(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z7) {
        if (m1817s()) {
            this.f3180n.f5811s = z7;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z7) {
        setCheckedInternal(z7);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.f3166J = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (m1817s()) {
            C1510i c1510i = this.f3180n;
            if (c1510i.f5810r && c1510i.f5801i == i) {
                return;
            }
            c1510i.f5801i = i;
            c1510i.f5810r = true;
            c1510i.f5794b = c1510i.f5794b.mo4919a(i);
            c1510i.m3196d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m1817s()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(C2455g c2455g) {
        C1510i c1510i = this.f3180n;
        c1510i.f5795c = c2455g;
        if (c1510i.f5794b instanceof C2814c0) {
            c1510i.m3196d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.f3178V = Math.min(i, this.f3173Q);
        m1822x();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        if (m1817s()) {
            this.f3180n.m3193a(false).m4944p(f8);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3185s == drawable || m1819u(new RunnableC1502a(this, drawable, 1))) {
            return;
        }
        this.f3166J = -2.1474836E9f;
        this.f3185s = drawable;
        m1820v(true);
        m1821w(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.f3163G != i) {
            if (this.f3185s != null && this.f3188v != null && m1803e()) {
                throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
            }
            this.f3163G = i;
            m1821w(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f3158B != i) {
            this.f3158B = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC0715d.m1542D(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f3191y == i || m1819u(new RunnableC0653c0(i, 3, this))) {
            return;
        }
        this.f3166J = -2.1474836E9f;
        this.f3191y = i;
        m1820v(true);
        m1823y(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3184r != colorStateList) {
            this.f3184r = colorStateList;
            m1820v(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3183q != mode) {
            this.f3183q = mode;
            m1820v(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC0120b.m424t(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C1510i c1510i = this.f3180n;
        c1510i.m3194b(c1510i.f5797e, c1510i.f5799g, c1510i.f5798f, i);
    }

    public void setInsetLeft(int i) {
        C1510i c1510i = this.f3180n;
        c1510i.m3194b(i, c1510i.f5799g, c1510i.f5798f, c1510i.f5800h);
    }

    public void setInsetRight(int i) {
        C1510i c1510i = this.f3180n;
        c1510i.m3194b(c1510i.f5797e, c1510i.f5799g, i, c1510i.f5800h);
    }

    public void setInsetTop(int i) {
        C1510i c1510i = this.f3180n;
        c1510i.m3194b(c1510i.f5797e, i, c1510i.f5798f, c1510i.f5800h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1504c interfaceC1504c) {
        this.f3182p = interfaceC1504c;
    }

    public void setOpticalCenterEnabled(boolean z7) {
        if (this.f3170N != z7) {
            this.f3170N = z7;
            C1510i c1510i = this.f3180n;
            if (z7) {
                C0456a c0456a = new C0456a(6, this);
                c1510i.f5796d = c0456a;
                C2823j c2823jM3193a = c1510i.m3193a(false);
                if (c2823jM3193a != null) {
                    c2823jM3193a.f10490M = c0456a;
                }
            } else {
                c1510i.f5796d = null;
                C2823j c2823jM3193a2 = c1510i.m3193a(false);
                if (c2823jM3193a2 != null) {
                    c2823jM3193a2.f10490M = null;
                }
            }
            post(new RunnableC0127c0(14, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z7) {
        InterfaceC1504c interfaceC1504c = this.f3182p;
        if (interfaceC1504c != null) {
            ((MaterialButtonToggleGroup) ((C0036o) interfaceC1504c).f143k).invalidate();
        }
        super.setPressed(z7);
        m1818t(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m1817s()) {
            C1510i c1510i = this.f3180n;
            MaterialButton materialButton = c1510i.f5793a;
            if (c1510i.f5806n != colorStateList) {
                c1510i.f5806n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC2703a.m4755a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m1817s()) {
            setRippleColor(AbstractC0120b.m424t(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.f3188v == drawable || m1819u(new RunnableC1502a(this, drawable, 0))) {
            return;
        }
        this.f3166J = -2.1474836E9f;
        this.f3188v = drawable;
        this.f3189w = false;
        m1823y(true);
        m1824z(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.f3164H != i) {
            if (this.f3188v != null && this.f3185s != null && m1803e()) {
                throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
            }
            this.f3164H = i;
            m1824z(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? AbstractC0715d.m1542D(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.f3187u != colorStateList) {
            this.f3187u = colorStateList;
            m1823y(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.f3186t != mode) {
            this.f3186t = mode;
            m1823y(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(AbstractC0120b.m424t(getContext(), i));
    }

    public void setShapeAppearance(InterfaceC2826m interfaceC2826m) {
        if (!m1817s()) {
            throw new IllegalStateException("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
        }
        C1510i c1510i = this.f3180n;
        if (c1510i.f5795c == null && interfaceC2826m.mo4923e()) {
            c1510i.f5795c = m1805g();
            if (c1510i.f5794b instanceof C2814c0) {
                c1510i.m3196d();
            }
        }
        c1510i.f5794b = interfaceC2826m;
        c1510i.m3196d();
    }

    @Override // p211y5.InterfaceC2839z
    public void setShapeAppearanceModel(C2828o c2828o) {
        if (!m1817s()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        C1510i c1510i = this.f3180n;
        c1510i.f5794b = c2828o;
        c1510i.m3196d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z7) {
        if (m1817s()) {
            C1510i c1510i = this.f3180n;
            c1510i.f5808p = z7;
            c1510i.m3197e();
        }
    }

    public void setSizeChange(C2818e0 c2818e0) {
        if (this.f3174R != c2818e0) {
            this.f3174R = c2818e0;
            m1818t(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m1817s()) {
            C1510i c1510i = this.f3180n;
            if (c1510i.f5805m != colorStateList) {
                c1510i.f5805m = colorStateList;
                c1510i.m3197e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m1817s()) {
            setStrokeColor(AbstractC0120b.m424t(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m1817s()) {
            C1510i c1510i = this.f3180n;
            if (c1510i.f5802j != i) {
                c1510i.f5802j = i;
                c1510i.m3197e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m1817s()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p104m.C1760q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m1817s()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C1510i c1510i = this.f3180n;
        if (c1510i.f5804l != colorStateList) {
            c1510i.f5804l = colorStateList;
            if (c1510i.m3193a(false) != null) {
                c1510i.m3193a(false).setTintList(c1510i.f5804l);
            }
        }
    }

    @Override // p104m.C1760q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m1817s()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C1510i c1510i = this.f3180n;
        if (c1510i.f5803k != mode) {
            c1510i.f5803k = mode;
            if (c1510i.m3193a(false) == null || c1510i.f5803k == null) {
                return;
            }
            c1510i.m3193a(false).setTintMode(c1510i.f5803k);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f3166J = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m1821w(getMeasuredWidth(), getMeasuredHeight());
        m1824z(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // p104m.C1760q, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.f3166J = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // p104m.C1760q, android.widget.TextView
    public final void setTextSize(int i, float f8) {
        this.f3166J = -2.1474836E9f;
        super.setTextSize(i, f8);
    }

    public void setToggleCheckedStateOnClick(boolean z7) {
        this.f3180n.f5812t = z7;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.f3166J = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(EnumC1506e enumC1506e) {
        if (this.f3176T != enumC1506e) {
            this.f3176T = enumC1506e;
            m1818t(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.f3175S != i) {
            this.f3175S = i;
            m1818t(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1818t(boolean z7) {
        int i;
        if (this.f3174R == null) {
            return;
        }
        if (this.f3179W == null) {
            C2454f c2454f = new C2454f(this, f3156c0);
            this.f3179W = c2454f;
            c2454f.f9003j = m1805g();
        }
        if (!this.f3172P) {
            return;
        }
        int iOrdinal = this.f3176T.ordinal();
        int i4 = 0;
        int i8 = (iOrdinal == 1 || iOrdinal == 2) ? this.f3175S / 2 : iOrdinal != 3 ? 0 : this.f3175S;
        C2818e0 c2818e0 = this.f3174R;
        int[] drawableState = getDrawableState();
        int[][] iArr = c2818e0.f10455c;
        int i9 = 0;
        while (true) {
            i = -1;
            if (i9 >= c2818e0.f10453a) {
                i9 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr[i9], drawableState)) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 < 0) {
            int[] iArr2 = StateSet.WILD_CARD;
            int[][] iArr3 = c2818e0.f10455c;
            int i10 = 0;
            while (true) {
                if (i10 >= c2818e0.f10453a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr3[i10], iArr2)) {
                    i = i10;
                    break;
                }
                i10++;
            }
            i9 = i;
        }
        C2816d0 c2816d0 = (C2816d0) (i9 < 0 ? c2818e0.f10454b : c2818e0.f10456d[i9]).f6229j;
        int width = getWidth();
        float f8 = c2816d0.f10452b;
        int i11 = c2816d0.f10451a;
        if (i11 != 1) {
            if (i11 == 2) {
            }
            this.f3179W.m4431a(Math.min(i8, i4));
            if (z7) {
                return;
            }
            this.f3179W.m4433d();
            return;
        }
        f8 *= width;
        i4 = (int) f8;
        this.f3179W.m4431a(Math.min(i8, i4));
        if (z7) {
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3161E);
    }

    /* renamed from: u */
    public final boolean m1819u(Runnable runnable) {
        C2454f c2454f = this.f3179W;
        if (c2454f == null || !c2454f.f8998e) {
            return false;
        }
        post(new RunnableC0320i(this, 9, runnable));
        return true;
    }

    /* renamed from: v */
    public final void m1820v(boolean z7) {
        Drawable drawable = this.f3185s;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f3185s = drawableMutate;
            drawableMutate.setTintList(this.f3184r);
            PorterDuff.Mode mode = this.f3183q;
            if (mode != null) {
                this.f3185s.setTintMode(mode);
            }
            int intrinsicWidth = this.f3191y;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f3185s.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f3191y;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f3185s.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3185s;
            int i = this.f3192z;
            int i4 = this.f3157A;
            drawable2.setBounds(i, i4, intrinsicWidth + i, intrinsicHeight + i4);
            this.f3185s.setVisible(true, z7);
        }
        if (this.f3185s != null && this.f3188v != null && m1803e()) {
            throw new IllegalArgumentException("iconGravity cannot have the same alignment as secondaryIconGravity");
        }
        if (this.f3185s == null && this.f3188v != null && m1803e()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z8 = (m1812n() && compoundDrawablesRelative[0] != this.f3185s) || (m1811m() && compoundDrawablesRelative[2] != this.f3185s) || (m1813o() && compoundDrawablesRelative[1] != this.f3185s);
        if (z7 || z8) {
            if (m1812n()) {
                setCompoundDrawablesRelative(this.f3185s, m1808j(1), m1808j(2), null);
            } else if (m1811m()) {
                setCompoundDrawablesRelative(m1808j(0), m1808j(1), this.f3185s, null);
            } else if (m1813o()) {
                setCompoundDrawablesRelative(m1808j(0), this.f3185s, m1808j(2), null);
            }
        }
    }

    /* renamed from: w */
    public final void m1821w(int i, int i4) {
        if (this.f3185s == null || getLayout() == null) {
            return;
        }
        if (m1812n() || m1811m()) {
            this.f3157A = 0;
            if (m1804f(this.f3163G)) {
                this.f3192z = 0;
                m1820v(false);
                return;
            }
            int iM1806h = m1806h(i, this.f3163G);
            if (this.f3192z != iM1806h) {
                this.f3192z = iM1806h;
                m1820v(false);
                return;
            }
            return;
        }
        if (m1813o()) {
            this.f3192z = 0;
            if (this.f3163G == 16) {
                this.f3157A = 0;
                m1820v(false);
                return;
            }
            int intrinsicHeight = this.f3191y;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f3185s.getIntrinsicHeight();
            }
            int iM1807i = m1807i(i4, intrinsicHeight);
            if (this.f3157A != iM1807i) {
                this.f3157A = iM1807i;
                m1820v(false);
            }
        }
    }

    /* renamed from: x */
    public final void m1822x() {
        int i = (int) (this.f3177U - this.f3178V);
        int i4 = (i / 2) + (getLayoutDirection() == 1 ? -this.f3171O : this.f3171O);
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.f3166J + i);
        }
        setPaddingRelative(this.f3167K + i4, getPaddingTop(), (this.f3168L + i) - i4, getPaddingBottom());
    }

    /* renamed from: y */
    public final void m1823y(boolean z7) {
        Drawable drawable = this.f3188v;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f3188v = drawableMutate;
            drawableMutate.setTintList(this.f3187u);
            PorterDuff.Mode mode = this.f3186t;
            if (mode != null) {
                this.f3188v.setTintMode(mode);
            }
            int intrinsicWidth = this.f3191y;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f3188v.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f3191y;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f3188v.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3188v;
            int i = this.f3159C;
            int i4 = this.f3160D;
            drawable2.setBounds(i, i4, intrinsicWidth + i, intrinsicHeight + i4);
            this.f3188v.setVisible(true, z7);
        }
        if (this.f3188v != null && this.f3185s != null && m1803e()) {
            throw new IllegalArgumentException("secondaryIconGravity cannot have the same alignment as iconGravity");
        }
        if (this.f3188v == null) {
            if (this.f3189w) {
                return;
            }
            if (this.f3185s != null && m1803e()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z8 = (m1815q() && compoundDrawablesRelative[0] != this.f3188v) || (m1814p() && compoundDrawablesRelative[2] != this.f3188v) || (m1816r() && compoundDrawablesRelative[1] != this.f3188v);
        if (z7 || z8) {
            if (m1815q()) {
                setCompoundDrawablesRelative(this.f3188v, m1809k(1), m1809k(2), null);
            } else if (m1814p()) {
                setCompoundDrawablesRelative(m1809k(0), m1809k(1), this.f3188v, null);
            } else if (m1816r()) {
                setCompoundDrawablesRelative(m1809k(0), this.f3188v, m1809k(2), null);
            }
        }
    }

    /* renamed from: z */
    public final void m1824z(int i, int i4) {
        if (this.f3188v == null || getLayout() == null) {
            return;
        }
        if (m1815q() || m1814p()) {
            this.f3160D = 0;
            if (m1804f(this.f3164H)) {
                this.f3159C = 0;
                m1823y(false);
                return;
            }
            int iM1806h = m1806h(i, this.f3164H);
            if (this.f3159C != iM1806h) {
                this.f3159C = iM1806h;
                m1823y(false);
                return;
            }
            return;
        }
        if (m1816r()) {
            this.f3159C = 0;
            if (this.f3164H == 16) {
                this.f3160D = 0;
                m1823y(false);
                return;
            }
            int intrinsicHeight = this.f3191y;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f3188v.getIntrinsicHeight();
            }
            int iM1807i = m1807i(i4, intrinsicHeight);
            if (this.f3160D != iM1807i) {
                this.f3160D = iM1807i;
                m1823y(false);
            }
        }
    }
}
