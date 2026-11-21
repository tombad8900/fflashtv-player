package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v4.media.session.AbstractC0120b;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.bumptech.glide.AbstractC0715d;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.Locale;
import okhttp3.C2181z;
import p005a4.C0088j0;
import p034d5.AbstractC0847a;
import p035d6.AbstractC0848a;
import p042e5.C0911b;
import p046f0.InterfaceC0929b;
import p088k0.AbstractC1551f;
import p088k0.C1547b;
import p104m.C1764r;
import p105m0.AbstractC1828m0;
import p110m5.C1901b;
import p110m5.C1902c;
import p110m5.C1903d;
import p110m5.C1905f;
import p110m5.InterfaceC1904e;
import p162s5.AbstractC2374l;
import p162s5.C2372j;
import p162s5.InterfaceC2368f;
import p168t2.AbstractC2429w;
import p171t5.AbstractC2436a;
import p187v5.C2552d;
import p196w5.AbstractC2703a;
import p211y5.C2828o;
import p211y5.InterfaceC2839z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class Chip extends C1764r implements InterfaceC1904e, InterfaceC2839z, Checkable {

    /* renamed from: F */
    public static final Rect f3203F = new Rect();

    /* renamed from: G */
    public static final int[] f3204G = {R.attr.state_selected};

    /* renamed from: H */
    public static final int[] f3205H = {R.attr.state_checkable};

    /* renamed from: A */
    public final C1903d f3206A;

    /* renamed from: B */
    public boolean f3207B;

    /* renamed from: C */
    public final Rect f3208C;

    /* renamed from: D */
    public final RectF f3209D;

    /* renamed from: E */
    public final C1901b f3210E;

    /* renamed from: n */
    public C1905f f3211n;

    /* renamed from: o */
    public InsetDrawable f3212o;

    /* renamed from: p */
    public RippleDrawable f3213p;

    /* renamed from: q */
    public View.OnClickListener f3214q;

    /* renamed from: r */
    public CompoundButton.OnCheckedChangeListener f3215r;

    /* renamed from: s */
    public boolean f3216s;

    /* renamed from: t */
    public boolean f3217t;

    /* renamed from: u */
    public boolean f3218u;

    /* renamed from: v */
    public boolean f3219v;

    /* renamed from: w */
    public boolean f3220w;

    /* renamed from: x */
    public int f3221x;

    /* renamed from: y */
    public int f3222y;

    /* renamed from: z */
    public CharSequence f3223z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC0848a.m2015b(context, attributeSet, com.exotv.net.R.attr.chipStyle, com.exotv.net.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.exotv.net.R.attr.chipStyle);
        this.f3208C = new Rect();
        this.f3209D = new RectF();
        this.f3210E = new C1901b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C1905f c1905f = new C1905f(context2, attributeSet);
        Context context3 = c1905f.f7173w0;
        int[] iArr = AbstractC0847a.f3741c;
        TypedArray typedArrayM4215e = AbstractC2374l.m4215e(context3, attributeSet, iArr, com.exotv.net.R.attr.chipStyle, com.exotv.net.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c1905f.f7147W0 = typedArrayM4215e.hasValue(39);
        Context context4 = c1905f.f7173w0;
        ColorStateList colorStateListM4301f = AbstractC2429w.m4301f(context4, typedArrayM4215e, 25);
        if (c1905f.f7132P != colorStateListM4301f) {
            c1905f.f7132P = colorStateListM4301f;
            c1905f.onStateChange(c1905f.getState());
        }
        ColorStateList colorStateListM4301f2 = AbstractC2429w.m4301f(context4, typedArrayM4215e, 12);
        if (c1905f.f7134Q != colorStateListM4301f2) {
            c1905f.f7134Q = colorStateListM4301f2;
            c1905f.onStateChange(c1905f.getState());
        }
        float dimension = typedArrayM4215e.getDimension(20, 0.0f);
        if (c1905f.f7136R != dimension) {
            c1905f.f7136R = dimension;
            c1905f.invalidateSelf();
            c1905f.m3684D();
        }
        if (typedArrayM4215e.hasValue(13)) {
            c1905f.m3690J(typedArrayM4215e.getDimension(13, 0.0f));
        }
        c1905f.m3695O(AbstractC2429w.m4301f(context4, typedArrayM4215e, 23));
        c1905f.m3696P(typedArrayM4215e.getDimension(24, 0.0f));
        c1905f.m3706Z(AbstractC2429w.m4301f(context4, typedArrayM4215e, 38));
        CharSequence text = typedArrayM4215e.getText(5);
        text = text == null ? C2181z.FRAGMENT_ENCODE_SET : text;
        if (!TextUtils.equals(c1905f.f7146W, text)) {
            c1905f.f7146W = text;
            c1905f.f7119C0.f8368d = true;
            c1905f.invalidateSelf();
            c1905f.m3684D();
        }
        C2552d c2552d = (!typedArrayM4215e.hasValue(0) || (resourceId3 = typedArrayM4215e.getResourceId(0, 0)) == 0) ? null : new C2552d(context4, resourceId3);
        c2552d.f9262l = typedArrayM4215e.getDimension(1, c2552d.f9262l);
        if (Build.VERSION.SDK_INT >= 26) {
            int i = typedArrayM4215e.hasValue(34) ? 34 : 7;
            if (typedArrayM4215e.hasValue(i)) {
                c2552d.f9253c = typedArrayM4215e.getString(i);
            }
        }
        c1905f.m3707a0(c2552d);
        int i4 = typedArrayM4215e.getInt(3, 0);
        if (i4 == 1) {
            c1905f.f7141T0 = TextUtils.TruncateAt.START;
        } else if (i4 == 2) {
            c1905f.f7141T0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i4 == 3) {
            c1905f.f7141T0 = TextUtils.TruncateAt.END;
        }
        c1905f.m3694N(typedArrayM4215e.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c1905f.m3694N(typedArrayM4215e.getBoolean(16, false));
        }
        c1905f.m3691K(AbstractC2429w.m4302g(context4, typedArrayM4215e, 15));
        if (typedArrayM4215e.hasValue(18)) {
            c1905f.m3693M(AbstractC2429w.m4301f(context4, typedArrayM4215e, 18));
        }
        c1905f.m3692L(typedArrayM4215e.getDimension(17, -1.0f));
        c1905f.m3703W(typedArrayM4215e.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c1905f.m3703W(typedArrayM4215e.getBoolean(27, false));
        }
        c1905f.m3697Q(AbstractC2429w.m4302g(context4, typedArrayM4215e, 26));
        c1905f.m3702V(AbstractC2429w.m4301f(context4, typedArrayM4215e, 31));
        c1905f.m3699S(typedArrayM4215e.getDimension(29, 0.0f));
        c1905f.m3686F(typedArrayM4215e.getBoolean(6, false));
        c1905f.m3689I(typedArrayM4215e.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c1905f.m3689I(typedArrayM4215e.getBoolean(9, false));
        }
        c1905f.m3687G(AbstractC2429w.m4302g(context4, typedArrayM4215e, 8));
        if (typedArrayM4215e.hasValue(10)) {
            c1905f.m3688H(AbstractC2429w.m4301f(context4, typedArrayM4215e, 10));
        }
        c1905f.f7163m0 = (!typedArrayM4215e.hasValue(41) || (resourceId2 = typedArrayM4215e.getResourceId(41, 0)) == 0) ? null : C0911b.m2080a(context4, resourceId2);
        c1905f.f7164n0 = (!typedArrayM4215e.hasValue(35) || (resourceId = typedArrayM4215e.getResourceId(35, 0)) == 0) ? null : C0911b.m2080a(context4, resourceId);
        float dimension2 = typedArrayM4215e.getDimension(22, 0.0f);
        if (c1905f.f7165o0 != dimension2) {
            c1905f.f7165o0 = dimension2;
            c1905f.invalidateSelf();
            c1905f.m3684D();
        }
        c1905f.m3705Y(typedArrayM4215e.getDimension(37, 0.0f));
        c1905f.m3704X(typedArrayM4215e.getDimension(36, 0.0f));
        float dimension3 = typedArrayM4215e.getDimension(43, 0.0f);
        if (c1905f.f7168r0 != dimension3) {
            c1905f.f7168r0 = dimension3;
            c1905f.invalidateSelf();
            c1905f.m3684D();
        }
        float dimension4 = typedArrayM4215e.getDimension(42, 0.0f);
        if (c1905f.f7169s0 != dimension4) {
            c1905f.f7169s0 = dimension4;
            c1905f.invalidateSelf();
            c1905f.m3684D();
        }
        c1905f.m3700T(typedArrayM4215e.getDimension(30, 0.0f));
        c1905f.m3698R(typedArrayM4215e.getDimension(28, 0.0f));
        float dimension5 = typedArrayM4215e.getDimension(14, 0.0f);
        if (c1905f.f7172v0 != dimension5) {
            c1905f.f7172v0 = dimension5;
            c1905f.invalidateSelf();
            c1905f.m3684D();
        }
        c1905f.f7145V0 = typedArrayM4215e.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM4215e.recycle();
        AbstractC2374l.m4211a(context2, attributeSet, com.exotv.net.R.attr.chipStyle, com.exotv.net.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC2374l.m4212b(context2, attributeSet, iArr, com.exotv.net.R.attr.chipStyle, com.exotv.net.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.exotv.net.R.attr.chipStyle, com.exotv.net.R.style.Widget_MaterialComponents_Chip_Action);
        this.f3220w = typedArrayObtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue typedValueM4340o = AbstractC2436a.m4340o(theme, com.exotv.net.R.attr.minTouchTargetSize);
        this.f3222y = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(21, (int) (Float.isNaN((typedValueM4340o == null || typedValueM4340o.type != 5) ? Float.NaN : typedValueM4340o.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(com.exotv.net.R.dimen.mtrl_min_touch_target_size) : r6)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c1905f);
        c1905f.m4944p(getElevation());
        AbstractC2374l.m4211a(context2, attributeSet, com.exotv.net.R.attr.chipStyle, com.exotv.net.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC2374l.m4212b(context2, attributeSet, iArr, com.exotv.net.R.attr.chipStyle, com.exotv.net.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.exotv.net.R.attr.chipStyle, com.exotv.net.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(39);
        typedArrayObtainStyledAttributes2.recycle();
        this.f3206A = new C1903d(this, this);
        m1837d();
        if (!zHasValue) {
            setOutlineProvider(new C1902c(this));
        }
        setChecked(this.f3216s);
        setText(c1905f.f7146W);
        setEllipsize(c1905f.f7141T0);
        m1840g();
        if (!this.f3211n.f7143U0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m1839f();
        if (this.f3220w) {
            setMinHeight(this.f3222y);
        }
        this.f3221x = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: m5.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f7110a.f3215r;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z7);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f3209D;
        rectF.setEmpty();
        if (m1836c() && this.f3214q != null) {
            C1905f c1905f = this.f3211n;
            Rect bounds = c1905f.getBounds();
            rectF.setEmpty();
            if (c1905f.m3710d0()) {
                float f8 = c1905f.f7172v0 + c1905f.f7171u0 + c1905f.f7157g0 + c1905f.f7170t0 + c1905f.f7169s0;
                if (c1905f.getLayoutDirection() == 0) {
                    float f9 = bounds.right;
                    rectF.right = f9;
                    rectF.left = f9 - f8;
                } else {
                    float f10 = bounds.left;
                    rectF.left = f10;
                    rectF.right = f10 + f8;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i4 = (int) closeIconTouchBounds.top;
        int i8 = (int) closeIconTouchBounds.right;
        int i9 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f3208C;
        rect.set(i, i4, i8, i9);
        return rect;
    }

    private C2552d getTextAppearance() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7119C0.f8370f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z7) {
        if (this.f3218u != z7) {
            this.f3218u = z7;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z7) {
        if (this.f3217t != z7) {
            this.f3217t = z7;
            refreshDrawableState();
        }
    }

    /* renamed from: b */
    public final void m1835b(int i) {
        this.f3222y = i;
        if (!this.f3220w) {
            InsetDrawable insetDrawable = this.f3212o;
            if (insetDrawable == null) {
                m1838e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f3212o = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m1838e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f3211n.f7136R));
        int iMax2 = Math.max(0, i - this.f3211n.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f3212o;
            if (insetDrawable2 == null) {
                m1838e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f3212o = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m1838e();
                    return;
                }
                return;
            }
        }
        int i4 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i8 = iMax > 0 ? iMax / 2 : 0;
        if (this.f3212o != null) {
            Rect rect = new Rect();
            this.f3212o.getPadding(rect);
            if (rect.top == i8 && rect.bottom == i8 && rect.left == i4 && rect.right == i4) {
                m1838e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f3212o = new InsetDrawable((Drawable) this.f3211n, i4, i8, i4, i8);
        m1838e();
    }

    /* renamed from: c */
    public final boolean m1836c() {
        C1905f c1905f = this.f3211n;
        if (c1905f == null) {
            return false;
        }
        Object obj = c1905f.f7154d0;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof InterfaceC0929b) {
            obj = null;
        }
        return obj != null;
    }

    /* renamed from: d */
    public final void m1837d() {
        C1905f c1905f;
        if (!m1836c() || (c1905f = this.f3211n) == null || !c1905f.f7153c0 || this.f3214q == null) {
            AbstractC1828m0.m3608m(this, null);
            this.f3207B = false;
        } else {
            AbstractC1828m0.m3608m(this, this.f3206A);
            this.f3207B = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f3207B) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C1903d c1903d = this.f3206A;
        AccessibilityManager accessibilityManager = c1903d.f8384h;
        int i4 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x6 = motionEvent.getX();
                float y4 = motionEvent.getY();
                Chip chip = c1903d.f7114q;
                if (chip.m1836c() && chip.getCloseIconTouchBounds().contains(x6, y4)) {
                    i4 = 1;
                }
                int i8 = c1903d.f8389m;
                if (i8 != i4) {
                    c1903d.f8389m = i4;
                    c1903d.m4222r(i4, 128);
                    c1903d.m4222r(i8, 256);
                    return true;
                }
            } else if (action == 10 && (i = c1903d.f8389m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    c1903d.f8389m = Integer.MIN_VALUE;
                    c1903d.m4222r(Integer.MIN_VALUE, 128);
                    c1903d.m4222r(i, 256);
                    return true;
                }
            }
        } else if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f3207B) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C1903d c1903d = this.f3206A;
        c1903d.getClass();
        boolean zM4219m = false;
        int i = 0;
        zM4219m = false;
        zM4219m = false;
        zM4219m = false;
        zM4219m = false;
        zM4219m = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i4 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                        case 20:
                        case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                        case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i4 = 33;
                                } else if (keyCode == 21) {
                                    i4 = 17;
                                } else if (keyCode != 22) {
                                    i4 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z7 = false;
                                while (i < repeatCount && c1903d.m4219m(i4, null)) {
                                    i++;
                                    z7 = true;
                                }
                                zM4219m = z7;
                                break;
                            }
                            break;
                        case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                int i8 = c1903d.f8388l;
                                if (i8 != Integer.MIN_VALUE) {
                                    Chip chip = c1903d.f7114q;
                                    if (i8 == 0) {
                                        chip.performClick();
                                    } else if (i8 == 1) {
                                        chip.playSoundEffect(0);
                                        View.OnClickListener onClickListener = chip.f3214q;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.f3207B) {
                                            chip.f3206A.m4222r(1, 1);
                                        }
                                    }
                                }
                                zM4219m = true;
                                break;
                            }
                            break;
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM4219m = c1903d.m4219m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM4219m = c1903d.m4219m(1, null);
            }
        }
        if (!zM4219m || c1903d.f8388l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p104m.C1764r, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1905f c1905f = this.f3211n;
        boolean zM3701U = false;
        int i = 0;
        zM3701U = false;
        if (c1905f != null && C1905f.m3681C(c1905f.f7154d0)) {
            C1905f c1905f2 = this.f3211n;
            ?? IsEnabled = isEnabled();
            int i4 = IsEnabled;
            if (this.f3219v) {
                i4 = IsEnabled + 1;
            }
            int i8 = i4;
            if (this.f3218u) {
                i8 = i4 + 1;
            }
            int i9 = i8;
            if (this.f3217t) {
                i9 = i8 + 1;
            }
            int i10 = i9;
            if (isChecked()) {
                i10 = i9 + 1;
            }
            int[] iArr = new int[i10];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f3219v) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f3218u) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f3217t) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            zM3701U = c1905f2.m3701U(iArr);
        }
        if (zM3701U) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m1838e() {
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC2703a.m4755a(this.f3211n.f7144V), getBackgroundDrawable(), null);
        FocusRingDrawable.m1880e(getContext(), rippleDrawable, this.f3211n);
        this.f3213p = rippleDrawable;
        this.f3211n.getClass();
        setBackground(this.f3213p);
        m1839f();
    }

    /* renamed from: f */
    public final void m1839f() {
        C1905f c1905f;
        if (TextUtils.isEmpty(getText()) || (c1905f = this.f3211n) == null) {
            return;
        }
        int iM3714z = (int) (c1905f.m3714z() + c1905f.f7172v0 + c1905f.f7169s0);
        C1905f c1905f2 = this.f3211n;
        int iM3713y = (int) (c1905f2.m3713y() + c1905f2.f7165o0 + c1905f2.f7168r0);
        if (this.f3212o != null) {
            Rect rect = new Rect();
            this.f3212o.getPadding(rect);
            iM3713y += rect.left;
            iM3714z += rect.right;
        }
        setPaddingRelative(iM3713y, getPaddingTop(), iM3714z, getPaddingBottom());
    }

    /* renamed from: g */
    public final void m1840g() {
        TextPaint paint = getPaint();
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            paint.drawableState = c1905f.getState();
        }
        C2552d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m4566d(getContext(), paint, this.f3210E);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f3223z)) {
            return this.f3223z;
        }
        C1905f c1905f = this.f3211n;
        if (c1905f == null || !c1905f.f7159i0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3212o;
        return insetDrawable == null ? this.f3211n : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7161k0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7162l0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7134Q;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return Math.max(0.0f, c1905f.m3683A());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3211n;
    }

    public float getChipEndPadding() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7172v0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C1905f c1905f = this.f3211n;
        if (c1905f == null || (drawable = c1905f.f7149Y) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC0929b)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7151a0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7150Z;
        }
        return null;
    }

    public float getChipMinHeight() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7136R;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7165o0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7140T;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7142U;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C1905f c1905f = this.f3211n;
        if (c1905f == null || (drawable = c1905f.f7154d0) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC0929b)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7158h0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7171u0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7157g0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7170t0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7156f0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7141T0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f3207B) {
            C1903d c1903d = this.f3206A;
            if (c1903d.f8388l == 1 || c1903d.f8387k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        C1905f c1905f = this.f3211n;
        if (c1905f == null) {
            return super.getFontVariationSettings();
        }
        C2552d c2552d = c1905f.f7119C0.f8370f;
        if (c2552d == null || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return c2552d.f9253c;
    }

    public C0911b getHideMotionSpec() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7164n0;
        }
        return null;
    }

    public float getIconEndPadding() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7167q0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7166p0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7144V;
        }
        return null;
    }

    public C2828o getShapeAppearanceModel() {
        return this.f3211n.m4937i();
    }

    public C0911b getShowMotionSpec() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7163m0;
        }
        return null;
    }

    public float getTextEndPadding() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7169s0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            return c1905f.f7168r0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC2429w.m4310o(this, this.f3211n);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3204G);
        }
        C1905f c1905f = this.f3211n;
        if (c1905f != null && c1905f.f7159i0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3205H);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z7, int i, Rect rect) {
        super.onFocusChanged(z7, i, rect);
        if (this.f3207B) {
            C1903d c1903d = this.f3206A;
            int i4 = c1903d.f8388l;
            if (i4 != Integer.MIN_VALUE) {
                c1903d.m4217j(i4);
            }
            if (z7) {
                c1903d.m4219m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C1905f c1905f = this.f3211n;
        accessibilityNodeInfo.setCheckable(c1905f != null && c1905f.f7159i0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f3221x != i) {
            this.f3221x = i;
            m1839f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f3217t) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z7 = true;
                    }
                }
                z7 = false;
            } else {
                if (this.f3217t) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.f3214q;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.f3207B) {
                        this.f3206A.m4222r(1, 1);
                    }
                    z7 = true;
                }
                setCloseIconPressed(false);
            }
            z7 = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z7 = true;
            }
            z7 = false;
        }
        return z7 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f3223z = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3213p) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p104m.C1764r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3213p) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p104m.C1764r, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z7) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3686F(z7);
        }
    }

    public void setCheckableResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3686F(c1905f.f7173w0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z7) {
        C1905f c1905f = this.f3211n;
        if (c1905f == null) {
            this.f3216s = z7;
        } else if (c1905f.f7159i0) {
            super.setChecked(z7);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3687G(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z7) {
        setCheckedIconVisible(z7);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3687G(AbstractC0715d.m1542D(c1905f.f7173w0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3688H(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3688H(AbstractC0120b.m424t(c1905f.f7173w0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3689I(c1905f.f7173w0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1905f c1905f = this.f3211n;
        if (c1905f == null || c1905f.f7134Q == colorStateList) {
            return;
        }
        c1905f.f7134Q = colorStateList;
        c1905f.onStateChange(c1905f.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM424t;
        C1905f c1905f = this.f3211n;
        if (c1905f == null || c1905f.f7134Q == (colorStateListM424t = AbstractC0120b.m424t(c1905f.f7173w0, i))) {
            return;
        }
        c1905f.f7134Q = colorStateListM424t;
        c1905f.onStateChange(c1905f.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3690J(f8);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3690J(c1905f.f7173w0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C1905f c1905f) {
        C1905f c1905f2 = this.f3211n;
        if (c1905f2 != c1905f) {
            if (c1905f2 != null) {
                c1905f2.f7139S0 = new WeakReference(null);
            }
            this.f3211n = c1905f;
            c1905f.f7143U0 = false;
            c1905f.f7139S0 = new WeakReference(this);
            m1835b(this.f3222y);
        }
    }

    public void setChipEndPadding(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f == null || c1905f.f7172v0 == f8) {
            return;
        }
        c1905f.f7172v0 = f8;
        c1905f.invalidateSelf();
        c1905f.m3684D();
    }

    public void setChipEndPaddingResource(int i) throws Resources.NotFoundException {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            float dimension = c1905f.f7173w0.getResources().getDimension(i);
            if (c1905f.f7172v0 != dimension) {
                c1905f.f7172v0 = dimension;
                c1905f.invalidateSelf();
                c1905f.m3684D();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3691K(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z7) {
        setChipIconVisible(z7);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3691K(AbstractC0715d.m1542D(c1905f.f7173w0, i));
        }
    }

    public void setChipIconSize(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3692L(f8);
        }
    }

    public void setChipIconSizeResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3692L(c1905f.f7173w0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3693M(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3693M(AbstractC0120b.m424t(c1905f.f7173w0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3694N(c1905f.f7173w0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f == null || c1905f.f7136R == f8) {
            return;
        }
        c1905f.f7136R = f8;
        c1905f.invalidateSelf();
        c1905f.m3684D();
    }

    public void setChipMinHeightResource(int i) throws Resources.NotFoundException {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            float dimension = c1905f.f7173w0.getResources().getDimension(i);
            if (c1905f.f7136R != dimension) {
                c1905f.f7136R = dimension;
                c1905f.invalidateSelf();
                c1905f.m3684D();
            }
        }
    }

    public void setChipStartPadding(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f == null || c1905f.f7165o0 == f8) {
            return;
        }
        c1905f.f7165o0 = f8;
        c1905f.invalidateSelf();
        c1905f.m3684D();
    }

    public void setChipStartPaddingResource(int i) throws Resources.NotFoundException {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            float dimension = c1905f.f7173w0.getResources().getDimension(i);
            if (c1905f.f7165o0 != dimension) {
                c1905f.f7165o0 = dimension;
                c1905f.invalidateSelf();
                c1905f.m3684D();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3695O(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3695O(AbstractC0120b.m424t(c1905f.f7173w0, i));
        }
    }

    public void setChipStrokeWidth(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3696P(f8);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3696P(c1905f.f7173w0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3697Q(drawable);
        }
        m1837d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1905f c1905f = this.f3211n;
        if (c1905f == null || c1905f.f7158h0 == charSequence) {
            return;
        }
        String str = C1547b.f5928b;
        C1547b c1547b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C1547b.f5931e : C1547b.f5930d;
        c1547b.getClass();
        C0088j0 c0088j0 = AbstractC1551f.f5938a;
        c1905f.f7158h0 = c1547b.m3227c(charSequence);
        c1905f.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z7) {
        setCloseIconVisible(z7);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3698R(f8);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3698R(c1905f.f7173w0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3697Q(AbstractC0715d.m1542D(c1905f.f7173w0, i));
        }
        m1837d();
    }

    public void setCloseIconSize(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3699S(f8);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3699S(c1905f.f7173w0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3700T(f8);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3700T(c1905f.f7173w0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3702V(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3702V(AbstractC0120b.m424t(c1905f.f7173w0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // p104m.C1764r, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p104m.C1764r, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i4, int i8, int i9) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i4, i8, i9);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i4, int i8, int i9) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i4, i8, i9);
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m4944p(f8);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3211n == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.f7141T0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z7) {
        this.f3220w = z7;
        m1835b(this.f3222y);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        C1905f c1905f = this.f3211n;
        if (c1905f == null) {
            return false;
        }
        C2552d c2552d = c1905f.f7119C0.f8370f;
        if (c2552d != null && Build.VERSION.SDK_INT >= 26) {
            c2552d.f9253c = str;
        }
        m1840g();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0911b c0911b) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.f7164n0 = c0911b;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.f7164n0 = C0911b.m2080a(c1905f.f7173w0, i);
        }
    }

    public void setIconEndPadding(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3704X(f8);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3704X(c1905f.f7173w0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3705Y(f8);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3705Y(c1905f.f7173w0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC2368f interfaceC2368f) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f3211n == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.f7145V0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3215r = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3214q = onClickListener;
        m1837d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3706Z(colorStateList);
        }
        this.f3211n.getClass();
        m1838e();
    }

    public void setRippleColorResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3706Z(AbstractC0120b.m424t(c1905f.f7173w0, i));
            this.f3211n.getClass();
            m1838e();
        }
    }

    @Override // p211y5.InterfaceC2839z
    public void setShapeAppearanceModel(C2828o c2828o) {
        this.f3211n.setShapeAppearanceModel(c2828o);
    }

    public void setShowMotionSpec(C0911b c0911b) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.f7163m0 = c0911b;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.f7163m0 = C0911b.m2080a(c1905f.f7173w0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z7) {
        if (!z7) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z7);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1905f c1905f = this.f3211n;
        if (c1905f == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = C2181z.FRAGMENT_ENCODE_SET;
        }
        super.setText(c1905f.f7143U0 ? null : charSequence, bufferType);
        C1905f c1905f2 = this.f3211n;
        if (c1905f2 == null || TextUtils.equals(c1905f2.f7146W, charSequence)) {
            return;
        }
        c1905f2.f7146W = charSequence;
        c1905f2.f7119C0.f8368d = true;
        c1905f2.invalidateSelf();
        c1905f2.m3684D();
    }

    public void setTextAppearance(C2552d c2552d) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3707a0(c2552d);
        }
        m1840g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f == null || c1905f.f7169s0 == f8) {
            return;
        }
        c1905f.f7169s0 = f8;
        c1905f.invalidateSelf();
        c1905f.m3684D();
    }

    public void setTextEndPaddingResource(int i) throws Resources.NotFoundException {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            float dimension = c1905f.f7173w0.getResources().getDimension(i);
            if (c1905f.f7169s0 != dimension) {
                c1905f.f7169s0 = dimension;
                c1905f.invalidateSelf();
                c1905f.m3684D();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f8) {
        super.setTextSize(i, f8);
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f8, getResources().getDisplayMetrics());
            C2372j c2372j = c1905f.f7119C0;
            C2552d c2552d = c2372j.f8370f;
            if (c2552d != null) {
                c2552d.f9262l = fApplyDimension;
                c2372j.f8365a.setTextSize(fApplyDimension);
                c1905f.m3684D();
                c1905f.invalidateSelf();
            }
        }
        m1840g();
    }

    public void setTextStartPadding(float f8) {
        C1905f c1905f = this.f3211n;
        if (c1905f == null || c1905f.f7168r0 == f8) {
            return;
        }
        c1905f.f7168r0 = f8;
        c1905f.invalidateSelf();
        c1905f.m3684D();
    }

    public void setTextStartPaddingResource(int i) throws Resources.NotFoundException {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            float dimension = c1905f.f7173w0.getResources().getDimension(i);
            if (c1905f.f7168r0 != dimension) {
                c1905f.f7168r0 = dimension;
                c1905f.invalidateSelf();
                c1905f.m3684D();
            }
        }
    }

    public void setCloseIconVisible(boolean z7) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3703W(z7);
        }
        m1837d();
    }

    public void setCheckedIconVisible(boolean z7) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3689I(z7);
        }
    }

    public void setChipIconVisible(boolean z7) {
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3694N(z7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3707a0(new C2552d(c1905f.f7173w0, i));
        }
        m1840g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C1905f c1905f = this.f3211n;
        if (c1905f != null) {
            c1905f.m3707a0(new C2552d(c1905f.f7173w0, i));
        }
        m1840g();
    }
}
