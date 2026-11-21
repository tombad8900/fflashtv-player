package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0120b;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.RunnableC0127c0;
import androidx.media3.common.C0222n;
import androidx.media3.exoplayer.source.preload.C0456a;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import okhttp3.C2181z;
import p002a1.RunnableC0018f;
import p005a4.C0073c;
import p005a4.C0088j0;
import p017b6.AbstractC0607i;
import p017b6.AbstractC0622v;
import p017b6.C0592a0;
import p017b6.C0596c0;
import p017b6.C0598d0;
import p017b6.C0600e0;
import p017b6.C0602f0;
import p017b6.C0603g;
import p017b6.C0604g0;
import p017b6.C0605h;
import p017b6.C0610j0;
import p017b6.C0615o;
import p017b6.C0618r;
import p017b6.C0620t;
import p017b6.C0624x;
import p017b6.InterfaceC0606h0;
import p032d3.AbstractC0833r;
import p032d3.C0823h;
import p034d5.AbstractC0847a;
import p035d6.AbstractC0848a;
import p037e0.AbstractC0850a;
import p042e5.AbstractC0910a;
import p088k0.AbstractC1551f;
import p088k0.C1547b;
import p095l.C1629o;
import p104m.AbstractC1714e1;
import p104m.C1770t;
import p104m.C1780w0;
import p105m0.AbstractC1828m0;
import p162s5.AbstractC2366d;
import p162s5.AbstractC2374l;
import p162s5.C2365c;
import p162s5.C2370h;
import p168t2.AbstractC2429w;
import p171t5.AbstractC2436a;
import p187v5.C2549a;
import p187v5.C2552d;
import p211y5.C2809a;
import p211y5.C2819f;
import p211y5.C2821h;
import p211y5.C2823j;
import p211y5.C2825l;
import p211y5.C2827n;
import p211y5.C2828o;
import p211y5.InterfaceC2815d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: M0 */
    public static final int[][] f3406M0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A */
    public int f3407A;

    /* renamed from: A0 */
    public int f3408A0;

    /* renamed from: B */
    public CharSequence f3409B;

    /* renamed from: B0 */
    public int f3410B0;

    /* renamed from: C */
    public boolean f3411C;

    /* renamed from: C0 */
    public int f3412C0;

    /* renamed from: D */
    public C1780w0 f3413D;

    /* renamed from: D0 */
    public int f3414D0;

    /* renamed from: E */
    public ColorStateList f3415E;

    /* renamed from: E0 */
    public boolean f3416E0;

    /* renamed from: F */
    public int f3417F;

    /* renamed from: F0 */
    public final C2365c f3418F0;

    /* renamed from: G */
    public C0823h f3419G;

    /* renamed from: G0 */
    public boolean f3420G0;

    /* renamed from: H */
    public C0823h f3421H;

    /* renamed from: H0 */
    public boolean f3422H0;

    /* renamed from: I */
    public ColorStateList f3423I;

    /* renamed from: I0 */
    public ValueAnimator f3424I0;

    /* renamed from: J */
    public ColorStateList f3425J;

    /* renamed from: J0 */
    public boolean f3426J0;

    /* renamed from: K */
    public ColorStateList f3427K;

    /* renamed from: K0 */
    public boolean f3428K0;

    /* renamed from: L */
    public ColorStateList f3429L;

    /* renamed from: L0 */
    public boolean f3430L0;

    /* renamed from: M */
    public boolean f3431M;

    /* renamed from: N */
    public CharSequence f3432N;

    /* renamed from: O */
    public boolean f3433O;

    /* renamed from: P */
    public C2823j f3434P;

    /* renamed from: Q */
    public C2823j f3435Q;

    /* renamed from: R */
    public StateListDrawable f3436R;

    /* renamed from: S */
    public boolean f3437S;

    /* renamed from: T */
    public C2823j f3438T;

    /* renamed from: U */
    public C2823j f3439U;

    /* renamed from: V */
    public C2828o f3440V;

    /* renamed from: W */
    public boolean f3441W;

    /* renamed from: a0 */
    public final int f3442a0;

    /* renamed from: b0 */
    public int f3443b0;

    /* renamed from: c0 */
    public int f3444c0;

    /* renamed from: d0 */
    public int f3445d0;

    /* renamed from: e0 */
    public int f3446e0;

    /* renamed from: f0 */
    public int f3447f0;

    /* renamed from: g0 */
    public int f3448g0;

    /* renamed from: h0 */
    public int f3449h0;

    /* renamed from: i0 */
    public final Rect f3450i0;

    /* renamed from: j */
    public final FrameLayout f3451j;

    /* renamed from: j0 */
    public final Rect f3452j0;

    /* renamed from: k */
    public final C0596c0 f3453k;

    /* renamed from: k0 */
    public final RectF f3454k0;

    /* renamed from: l */
    public final C0620t f3455l;

    /* renamed from: l0 */
    public Typeface f3456l0;

    /* renamed from: m */
    public final int f3457m;

    /* renamed from: m0 */
    public ColorDrawable f3458m0;

    /* renamed from: n */
    public EditText f3459n;

    /* renamed from: n0 */
    public int f3460n0;

    /* renamed from: o */
    public CharSequence f3461o;

    /* renamed from: o0 */
    public final LinkedHashSet f3462o0;

    /* renamed from: p */
    public int f3463p;

    /* renamed from: p0 */
    public ColorDrawable f3464p0;

    /* renamed from: q */
    public int f3465q;

    /* renamed from: q0 */
    public int f3466q0;

    /* renamed from: r */
    public int f3467r;

    /* renamed from: r0 */
    public Drawable f3468r0;

    /* renamed from: s */
    public int f3469s;

    /* renamed from: s0 */
    public ColorStateList f3470s0;

    /* renamed from: t */
    public final C0624x f3471t;

    /* renamed from: t0 */
    public ColorStateList f3472t0;

    /* renamed from: u */
    public boolean f3473u;

    /* renamed from: u0 */
    public int f3474u0;

    /* renamed from: v */
    public int f3475v;

    /* renamed from: v0 */
    public int f3476v0;

    /* renamed from: w */
    public boolean f3477w;

    /* renamed from: w0 */
    public int f3478w0;

    /* renamed from: x */
    public InterfaceC0606h0 f3479x;

    /* renamed from: x0 */
    public ColorStateList f3480x0;

    /* renamed from: y */
    public C1780w0 f3481y;

    /* renamed from: y0 */
    public int f3482y0;

    /* renamed from: z */
    public int f3483z;

    /* renamed from: z0 */
    public int f3484z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(AbstractC0848a.m2015b(context, attributeSet, com.exotv.net.R.attr.textInputStyle, com.exotv.net.R.style.Widget_Design_TextInputLayout), attributeSet, com.exotv.net.R.attr.textInputStyle);
        this.f3463p = -1;
        this.f3465q = -1;
        this.f3467r = -1;
        this.f3469s = -1;
        this.f3471t = new C0624x(this);
        this.f3479x = new C0222n(19);
        this.f3450i0 = new Rect();
        this.f3452j0 = new Rect();
        this.f3454k0 = new RectF();
        this.f3462o0 = new LinkedHashSet();
        C2365c c2365c = new C2365c(this);
        this.f3418F0 = c2365c;
        this.f3430L0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f3451j = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0910a.f3956a;
        c2365c.f8298R = linearInterpolator;
        c2365c.m4201j(false);
        c2365c.f8297Q = linearInterpolator;
        c2365c.m4201j(false);
        if (c2365c.f8319g != 8388659) {
            c2365c.f8319g = 8388659;
            c2365c.m4201j(false);
        }
        AbstractC2374l.m4211a(context2, attributeSet, com.exotv.net.R.attr.textInputStyle, com.exotv.net.R.style.Widget_Design_TextInputLayout);
        int[] iArr = AbstractC0847a.f3737F;
        AbstractC2374l.m4212b(context2, attributeSet, iArr, com.exotv.net.R.attr.textInputStyle, com.exotv.net.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.exotv.net.R.attr.textInputStyle, com.exotv.net.R.style.Widget_Design_TextInputLayout);
        C0073c c0073c = new C0073c(context2, typedArrayObtainStyledAttributes);
        C0596c0 c0596c0 = new C0596c0(this, c0073c);
        this.f3453k = c0596c0;
        this.f3431M = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.f3422H0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.f3420G0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f3440V = C2828o.m4952f(context2, attributeSet, com.exotv.net.R.attr.textInputStyle, com.exotv.net.R.style.Widget_Design_TextInputLayout).m4951a();
        this.f3442a0 = context2.getResources().getDimensionPixelOffset(com.exotv.net.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f3444c0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f3457m = getResources().getDimensionPixelSize(com.exotv.net.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.f3446e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.exotv.net.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f3447f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.exotv.net.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f3445d0 = this.f3446e0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C2827n c2827nM4956j = this.f3440V.m4956j();
        if (dimension >= 0.0f) {
            c2827nM4956j.f10513e = new C2809a(dimension);
        }
        if (dimension2 >= 0.0f) {
            c2827nM4956j.f10514f = new C2809a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c2827nM4956j.f10515g = new C2809a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c2827nM4956j.f10516h = new C2809a(dimension4);
        }
        this.f3440V = c2827nM4956j.m4951a();
        ColorStateList colorStateListM4300e = AbstractC2429w.m4300e(context2, c0073c, 7);
        if (colorStateListM4300e != null) {
            int defaultColor = colorStateListM4300e.getDefaultColor();
            this.f3482y0 = defaultColor;
            this.f3449h0 = defaultColor;
            if (colorStateListM4300e.isStateful()) {
                this.f3484z0 = colorStateListM4300e.getColorForState(new int[]{-16842910}, -1);
                this.f3408A0 = colorStateListM4300e.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f3410B0 = colorStateListM4300e.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f3408A0 = this.f3482y0;
                ColorStateList colorStateListM424t = AbstractC0120b.m424t(context2, com.exotv.net.R.color.mtrl_filled_background_color);
                this.f3484z0 = colorStateListM424t.getColorForState(new int[]{-16842910}, -1);
                this.f3410B0 = colorStateListM424t.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f3449h0 = 0;
            this.f3482y0 = 0;
            this.f3484z0 = 0;
            this.f3408A0 = 0;
            this.f3410B0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListM298w = c0073c.m298w(1);
            this.f3472t0 = colorStateListM298w;
            this.f3470s0 = colorStateListM298w;
        }
        ColorStateList colorStateListM4300e2 = AbstractC2429w.m4300e(context2, c0073c, 14);
        this.f3478w0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f3474u0 = context2.getColor(com.exotv.net.R.color.mtrl_textinput_default_box_stroke_color);
        this.f3412C0 = context2.getColor(com.exotv.net.R.color.mtrl_textinput_disabled_color);
        this.f3476v0 = context2.getColor(com.exotv.net.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM4300e2 != null) {
            setBoxStrokeColorStateList(colorStateListM4300e2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC2429w.m4300e(context2, c0073c, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.f3427K = c0073c.m298w(24);
        this.f3429L = c0073c.m298w(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.f3407A = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.f3483z = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f3483z);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f3407A);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0073c.m298w(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0073c.m298w(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(c0073c.m298w(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0073c.m298w(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0073c.m298w(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(c0073c.m298w(59));
        }
        C0620t c0620t = new C0620t(this, c0073c);
        this.f3455l = c0620t;
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        c0073c.m275I();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(c0596c0);
        frameLayout.addView(c0620t);
        addView(frameLayout);
        setEnabled(z10);
        setHelperTextEnabled(z8);
        setErrorEnabled(z7);
        setCounterEnabled(z9);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f3459n;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f3434P;
        }
        EditText editText2 = this.f3459n;
        int iM1509X = AbstractC0714c.m1509X(editText2.getContext(), AbstractC2436a.m4345t(editText2, com.exotv.net.R.attr.colorControlHighlight));
        int i = this.f3443b0;
        int[][] iArr = f3406M0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C2823j c2823j = this.f3434P;
            int i4 = this.f3449h0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0714c.m1503P(0.1f, iM1509X, i4), i4}), c2823j, c2823j);
        }
        Context context = getContext();
        C2823j c2823j2 = this.f3434P;
        int iM1509X2 = AbstractC0714c.m1509X(context, AbstractC2436a.m4344s(context, com.exotv.net.R.attr.colorSurface, "TextInputLayout"));
        C2823j c2823j3 = new C2823j(c2823j2.m4937i());
        int iM1503P = AbstractC0714c.m1503P(0.1f, iM1509X, iM1509X2);
        c2823j3.m4945q(new ColorStateList(iArr, new int[]{iM1503P, 0}));
        c2823j3.setTint(iM1509X2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM1503P, iM1509X2});
        C2823j c2823j4 = new C2823j(c2823j2.m4937i());
        c2823j4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c2823j3, c2823j4), c2823j2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f3436R == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f3436R = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f3436R.addState(new int[0], m1899h(false));
        }
        return this.f3436R;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f3435Q == null) {
            this.f3435Q = m1899h(true);
        }
        return this.f3435Q;
    }

    /* renamed from: m */
    public static void m1891m(ViewGroup viewGroup, boolean z7) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z7);
            if (childAt instanceof ViewGroup) {
                m1891m((ViewGroup) childAt, z7);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.f3459n != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f3459n = editText;
        int i = this.f3463p;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f3467r);
        }
        int i4 = this.f3465q;
        if (i4 != -1) {
            setMaxEms(i4);
        } else {
            setMaxWidth(this.f3469s);
        }
        this.f3437S = false;
        m1902k();
        setTextInputAccessibilityDelegate(new C0604g0(this));
        Typeface typeface = this.f3459n.getTypeface();
        C2365c c2365c = this.f3418F0;
        c2365c.m4205n(typeface);
        float textSize = this.f3459n.getTextSize();
        if (c2365c.f8321h != textSize) {
            c2365c.f8321h = textSize;
            c2365c.m4201j(false);
        }
        float letterSpacing = this.f3459n.getLetterSpacing();
        if (c2365c.f8304X != letterSpacing) {
            c2365c.f8304X = letterSpacing;
            c2365c.m4201j(false);
        }
        int gravity = this.f3459n.getGravity();
        int i8 = (gravity & (-113)) | 48;
        if (c2365c.f8319g != i8) {
            c2365c.f8319g = i8;
            c2365c.m4201j(false);
        }
        if (c2365c.f8317f != gravity) {
            c2365c.f8317f = gravity;
            c2365c.m4201j(false);
        }
        this.f3414D0 = editText.getMinimumHeight();
        this.f3459n.addTextChangedListener(new C0598d0(this, editText));
        if (this.f3470s0 == null) {
            this.f3470s0 = this.f3459n.getHintTextColors();
        }
        if (this.f3431M) {
            if (TextUtils.isEmpty(this.f3432N)) {
                CharSequence hint = this.f3459n.getHint();
                this.f3461o = hint;
                setHint(hint);
                this.f3459n.setHint((CharSequence) null);
            }
            this.f3433O = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m1908r();
        }
        if (this.f3481y != null) {
            m1906p(this.f3459n.getText());
        }
        m1910t();
        this.f3471t.m1409b();
        this.f3453k.bringToFront();
        C0620t c0620t = this.f3455l;
        c0620t.bringToFront();
        Iterator it = this.f3462o0.iterator();
        while (it.hasNext()) {
            ((C0618r) it.next()).m1372a(this);
        }
        c0620t.m1386n();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m1913w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f3432N)) {
            return;
        }
        this.f3432N = charSequence;
        C2365c c2365c = this.f3418F0;
        if (charSequence == null || !TextUtils.equals(c2365c.f8282B, charSequence)) {
            c2365c.f8282B = charSequence;
            c2365c.f8283C = null;
            c2365c.m4201j(false);
        }
        if (this.f3416E0) {
            return;
        }
        m1903l();
    }

    private void setPlaceholderTextEnabled(boolean z7) {
        if (this.f3411C == z7) {
            return;
        }
        if (z7) {
            C1780w0 c1780w0 = this.f3413D;
            if (c1780w0 != null) {
                this.f3451j.addView(c1780w0);
                this.f3413D.setVisibility(0);
            }
        } else {
            C1780w0 c1780w02 = this.f3413D;
            if (c1780w02 != null) {
                c1780w02.setVisibility(8);
            }
            this.f3413D = null;
        }
        this.f3411C = z7;
    }

    /* renamed from: a */
    public final void m1892a() {
        if (this.f3459n == null || this.f3443b0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f3459n;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f3418F0.m4198f() + this.f3457m), this.f3459n.getPaddingEnd(), getResources().getDimensionPixelSize(com.exotv.net.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f3459n;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.exotv.net.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f3459n.getPaddingEnd(), getResources().getDimensionPixelSize(com.exotv.net.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (AbstractC2429w.m4307l(getContext())) {
            EditText editText3 = this.f3459n;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.exotv.net.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f3459n.getPaddingEnd(), getResources().getDimensionPixelSize(com.exotv.net.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f3451j;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m1912v();
        setEditText((EditText) view);
    }

    /* renamed from: b */
    public final void m1893b(float f8) {
        C2365c c2365c = this.f3418F0;
        if (c2365c.f8309b == f8) {
            return;
        }
        int i = 0;
        if (this.f3424I0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f3424I0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC2436a.m4343r(getContext(), com.exotv.net.R.attr.motionEasingEmphasizedInterpolator, AbstractC0910a.f3957b));
            this.f3424I0.setDuration(AbstractC2436a.m4342q(getContext(), com.exotv.net.R.attr.motionDurationMedium4, 167));
            this.f3424I0.addUpdateListener(new C0602f0(i, this));
        }
        this.f3424I0.setFloatValues(c2365c.f8309b, f8);
        this.f3424I0.start();
    }

    /* renamed from: c */
    public final void m1894c() {
        int i;
        int i4;
        C2823j c2823j = this.f3434P;
        if (c2823j == null) {
            return;
        }
        C2828o c2828oM4937i = c2823j.m4937i();
        C2828o c2828o = this.f3440V;
        if (c2828oM4937i != c2828o) {
            this.f3434P.setShapeAppearanceModel(c2828o);
        }
        if (this.f3443b0 == 2 && (i = this.f3445d0) > -1 && (i4 = this.f3448g0) != 0) {
            C2823j c2823j2 = this.f3434P;
            c2823j2.f10492k.f10468j = i;
            c2823j2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i4);
            C2821h c2821h = c2823j2.f10492k;
            if (c2821h.f10462d != colorStateListValueOf) {
                c2821h.f10462d = colorStateListValueOf;
                c2823j2.onStateChange(c2823j2.getState());
            }
        }
        int iM2017b = this.f3449h0;
        if (this.f3443b0 == 1) {
            iM2017b = AbstractC0850a.m2017b(this.f3449h0, AbstractC0714c.m1496I(getContext(), com.exotv.net.R.attr.colorSurface, 0));
        }
        this.f3449h0 = iM2017b;
        this.f3434P.m4945q(ColorStateList.valueOf(iM2017b));
        C2823j c2823j3 = this.f3438T;
        if (c2823j3 != null && this.f3439U != null) {
            if (this.f3445d0 > -1 && this.f3448g0 != 0) {
                c2823j3.m4945q(this.f3459n.isFocused() ? ColorStateList.valueOf(this.f3474u0) : ColorStateList.valueOf(this.f3448g0));
                this.f3439U.m4945q(ColorStateList.valueOf(this.f3448g0));
            }
            invalidate();
        }
        m1911u();
    }

    /* renamed from: d */
    public final Rect m1895d(Rect rect) {
        if (this.f3459n == null) {
            throw new IllegalStateException();
        }
        boolean z7 = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f3452j0;
        rect2.bottom = i;
        int i4 = this.f3443b0;
        if (i4 == 1) {
            rect2.left = m1900i(rect.left, z7);
            rect2.top = rect.top + this.f3444c0;
            rect2.right = m1901j(rect.right, z7);
            return rect2;
        }
        if (i4 != 2) {
            rect2.left = m1900i(rect.left, z7);
            rect2.top = getPaddingTop();
            rect2.right = m1901j(rect.right, z7);
            return rect2;
        }
        rect2.left = this.f3459n.getPaddingLeft() + rect.left;
        rect2.top = rect.top - m1896e();
        rect2.right = rect.right - this.f3459n.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f3459n;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f3461o != null) {
            boolean z7 = this.f3433O;
            this.f3433O = false;
            CharSequence hint = editText.getHint();
            this.f3459n.setHint(this.f3461o);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f3459n.setHint(hint);
                this.f3433O = z7;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f3451j;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i4 = 0; i4 < frameLayout.getChildCount(); i4++) {
            View childAt = frameLayout.getChildAt(i4);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i4);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f3459n) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f3428K0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f3428K0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C2823j c2823j;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z7 = this.f3431M;
        C2365c c2365c = this.f3418F0;
        if (z7) {
            TextPaint textPaint = c2365c.f8295O;
            RectF rectF = c2365c.f8315e;
            int iSave = canvas2.save();
            if (c2365c.f8283C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c2365c.f8287G);
                float f8 = c2365c.f8334q;
                float f9 = c2365c.f8335r;
                float f10 = c2365c.f8286F;
                if (f10 != 1.0f) {
                    canvas2.scale(f10, f10, f8, f9);
                }
                if ((c2365c.f8316e0 > 1 || c2365c.f8318f0 > 1) && !c2365c.f8284D && c2365c.m4206o()) {
                    float lineStart = c2365c.f8334q - c2365c.f8306Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f9);
                    float f11 = alpha;
                    textPaint.setAlpha((int) (c2365c.f8312c0 * f11));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f12 = c2365c.f8288H;
                        float f13 = c2365c.f8289I;
                        float f14 = c2365c.f8290J;
                        int i4 = c2365c.f8291K;
                        textPaint.setShadowLayer(f12, f13, f14, AbstractC0850a.m2019d(i4, (textPaint.getAlpha() * Color.alpha(i4)) / 255));
                    }
                    c2365c.f8306Z.draw(canvas2);
                    textPaint.setAlpha((int) (c2365c.f8310b0 * f11));
                    if (i >= 31) {
                        float f15 = c2365c.f8288H;
                        float f16 = c2365c.f8289I;
                        float f17 = c2365c.f8290J;
                        int i8 = c2365c.f8291K;
                        textPaint.setShadowLayer(f15, f16, f17, AbstractC0850a.m2019d(i8, (Color.alpha(i8) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = c2365c.f8306Z.getLineBaseline(0);
                    CharSequence charSequence = c2365c.f8314d0;
                    float f18 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f18, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c2365c.f8288H, c2365c.f8289I, c2365c.f8290J, c2365c.f8291K);
                    }
                    String strTrim = c2365c.f8314d0.toString().trim();
                    if (strTrim.endsWith("\u2026")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(c2365c.f8306Z.getLineEnd(0), str.length()), 0.0f, f18, (Paint) textPaint);
                } else {
                    canvas2.translate(f8, f9);
                    c2365c.f8306Z.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.f3439U == null || (c2823j = this.f3438T) == null) {
            return;
        }
        c2823j.draw(canvas2);
        if (this.f3459n.isFocused()) {
            Rect bounds = this.f3439U.getBounds();
            Rect bounds2 = this.f3438T.getBounds();
            float f19 = c2365c.f8309b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC0910a.m2079c(f19, iCenterX, bounds2.left);
            bounds.right = AbstractC0910a.m2079c(f19, iCenterX, bounds2.right);
            this.f3439U.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() throws Resources.NotFoundException {
        boolean z7;
        ColorStateList colorStateList;
        if (this.f3426J0) {
            return;
        }
        this.f3426J0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C2365c c2365c = this.f3418F0;
        if (c2365c != null) {
            c2365c.f8293M = drawableState;
            ColorStateList colorStateList2 = c2365c.f8327k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c2365c.f8325j) == null || !colorStateList.isStateful())) {
                z7 = false;
            } else {
                c2365c.m4201j(false);
                z7 = true;
            }
        }
        if (this.f3459n != null) {
            m1913w(isLaidOut() && isEnabled(), false);
        }
        m1910t();
        m1916z();
        if (z7) {
            invalidate();
        }
        this.f3426J0 = false;
    }

    /* renamed from: e */
    public final int m1896e() {
        if (this.f3431M) {
            int i = this.f3443b0;
            C2365c c2365c = this.f3418F0;
            if (i == 0) {
                return (int) c2365c.m4198f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (c2365c.m4198f() / 2.0f);
                }
                float fM4198f = c2365c.m4198f();
                TextPaint textPaint = c2365c.f8296P;
                textPaint.setTextSize(c2365c.f8323i);
                textPaint.setTypeface(c2365c.f8336s);
                textPaint.setLetterSpacing(c2365c.f8303W);
                return Math.max(0, (int) (fM4198f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    /* renamed from: f */
    public final C0823h m1897f() {
        C0823h c0823h = new C0823h();
        c0823h.f3692l = AbstractC2436a.m4342q(getContext(), com.exotv.net.R.attr.motionDurationShort2, 87);
        c0823h.f3693m = AbstractC2436a.m4343r(getContext(), com.exotv.net.R.attr.motionEasingLinearInterpolator, AbstractC0910a.f3956a);
        return c0823h;
    }

    /* renamed from: g */
    public final boolean m1898g() {
        return this.f3431M && !TextUtils.isEmpty(this.f3432N) && (this.f3434P instanceof AbstractC0607i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3459n;
        if (editText == null) {
            return super.getBaseline();
        }
        return m1896e() + getPaddingTop() + editText.getBaseline();
    }

    public C2823j getBoxBackground() {
        int i = this.f3443b0;
        if (i == 1 || i == 2) {
            return this.f3434P;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f3449h0;
    }

    public int getBoxBackgroundMode() {
        return this.f3443b0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f3444c0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f3454k0;
        return layoutDirection == 1 ? this.f3440V.f10528h.mo4909a(rectF) : this.f3440V.f10527g.mo4909a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f3454k0;
        return layoutDirection == 1 ? this.f3440V.f10527g.mo4909a(rectF) : this.f3440V.f10528h.mo4909a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f3454k0;
        return layoutDirection == 1 ? this.f3440V.f10525e.mo4909a(rectF) : this.f3440V.f10526f.mo4909a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.f3454k0;
        return layoutDirection == 1 ? this.f3440V.f10526f.mo4909a(rectF) : this.f3440V.f10525e.mo4909a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f3478w0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f3480x0;
    }

    public int getBoxStrokeWidth() {
        return this.f3446e0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f3447f0;
    }

    public int getCounterMaxLength() {
        return this.f3475v;
    }

    public CharSequence getCounterOverflowDescription() {
        C1780w0 c1780w0;
        if (this.f3473u && this.f3477w && (c1780w0 = this.f3481y) != null) {
            return c1780w0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f3425J;
    }

    public ColorStateList getCounterTextColor() {
        return this.f3423I;
    }

    public ColorStateList getCursorColor() {
        return this.f3427K;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f3429L;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f3470s0;
    }

    public EditText getEditText() {
        return this.f3459n;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3455l.f2453p.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3455l.f2453p.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f3455l.f2459v;
    }

    public int getEndIconMode() {
        return this.f3455l.f2455r;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f3455l.f2460w;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3455l.f2453p;
    }

    public CharSequence getError() {
        C0624x c0624x = this.f3471t;
        if (c0624x.f2491q) {
            return c0624x.f2490p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f3471t.f2494t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3471t.f2493s;
    }

    public int getErrorCurrentTextColors() {
        C1780w0 c1780w0 = this.f3471t.f2492r;
        if (c1780w0 != null) {
            return c1780w0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f3455l.f2449l.getDrawable();
    }

    public CharSequence getHelperText() {
        C0624x c0624x = this.f3471t;
        if (c0624x.f2498x) {
            return c0624x.f2497w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C1780w0 c1780w0 = this.f3471t.f2499y;
        if (c1780w0 != null) {
            return c1780w0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f3431M) {
            return this.f3432N;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f3418F0.m4198f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C2365c c2365c = this.f3418F0;
        return c2365c.m4199g(c2365c.f8327k);
    }

    public int getHintMaxLines() {
        return this.f3418F0.f8316e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f3472t0;
    }

    public InterfaceC0606h0 getLengthCounter() {
        return this.f3479x;
    }

    public int getMaxEms() {
        return this.f3465q;
    }

    public int getMaxWidth() {
        return this.f3469s;
    }

    public int getMinEms() {
        return this.f3463p;
    }

    public int getMinWidth() {
        return this.f3467r;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3455l.f2453p.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3455l.f2453p.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f3411C) {
            return this.f3409B;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f3417F;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f3415E;
    }

    public CharSequence getPrefixText() {
        return this.f3453k.f2380l;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3453k.f2379k.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3453k.f2379k;
    }

    public C2828o getShapeAppearanceModel() {
        return this.f3440V;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3453k.f2381m.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3453k.f2381m.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f3453k.f2384p;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f3453k.f2385q;
    }

    public CharSequence getSuffixText() {
        return this.f3455l.f2462y;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f3455l.f2463z.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f3455l.f2463z;
    }

    public Typeface getTypeface() {
        return this.f3456l0;
    }

    /* renamed from: h */
    public final C2823j m1899h(boolean z7) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.exotv.net.R.dimen.mtrl_shape_corner_size_small_component);
        float f8 = z7 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f3459n;
        float popupElevation = editText instanceof C0592a0 ? ((C0592a0) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.exotv.net.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.exotv.net.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C2825l c2825l = new C2825l();
        C2825l c2825l2 = new C2825l();
        C2825l c2825l3 = new C2825l();
        C2825l c2825l4 = new C2825l();
        int i = 0;
        C2819f c2819f = new C2819f(i);
        C2819f c2819f2 = new C2819f(i);
        C2819f c2819f3 = new C2819f(i);
        C2819f c2819f4 = new C2819f(i);
        C2809a c2809a = new C2809a(f8);
        C2809a c2809a2 = new C2809a(f8);
        C2809a c2809a3 = new C2809a(dimensionPixelOffset);
        C2809a c2809a4 = new C2809a(dimensionPixelOffset);
        C2828o c2828o = new C2828o();
        c2828o.f10521a = c2825l;
        c2828o.f10522b = c2825l2;
        c2828o.f10523c = c2825l3;
        c2828o.f10524d = c2825l4;
        c2828o.f10525e = c2809a;
        c2828o.f10526f = c2809a2;
        c2828o.f10527g = c2809a4;
        c2828o.f10528h = c2809a3;
        c2828o.f10529i = c2819f;
        c2828o.f10530j = c2819f2;
        c2828o.f10531k = c2819f3;
        c2828o.f10532l = c2819f4;
        EditText editText2 = this.f3459n;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C0592a0 ? ((C0592a0) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C2823j.f10476N;
            dropDownBackgroundTintList = ColorStateList.valueOf(AbstractC0714c.m1509X(context, AbstractC2436a.m4344s(context, com.exotv.net.R.attr.colorSurface, C2823j.class.getSimpleName())));
        }
        C2823j c2823j = new C2823j();
        c2823j.m4941m(context);
        c2823j.m4945q(dropDownBackgroundTintList);
        c2823j.m4944p(popupElevation);
        c2823j.setShapeAppearanceModel(c2828o);
        C2821h c2821h = c2823j.f10492k;
        if (c2821h.f10465g == null) {
            c2821h.f10465g = new Rect();
        }
        c2823j.f10492k.f10465g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c2823j.invalidateSelf();
        return c2823j;
    }

    /* renamed from: i */
    public final int m1900i(int i, boolean z7) {
        return ((z7 || getPrefixText() == null) ? (!z7 || getSuffixText() == null) ? this.f3459n.getCompoundPaddingLeft() : this.f3455l.m1375c() : this.f3453k.m1348a()) + i;
    }

    /* renamed from: j */
    public final int m1901j(int i, boolean z7) {
        return i - ((z7 || getSuffixText() == null) ? (!z7 || getPrefixText() == null) ? this.f3459n.getCompoundPaddingRight() : this.f3453k.m1348a() : this.f3455l.m1375c());
    }

    /* renamed from: k */
    public final void m1902k() throws Resources.NotFoundException {
        int i = this.f3443b0;
        if (i == 0) {
            this.f3434P = null;
            this.f3438T = null;
            this.f3439U = null;
        } else if (i == 1) {
            this.f3434P = new C2823j(this.f3440V);
            this.f3438T = new C2823j();
            this.f3439U = new C2823j();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f3443b0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f3431M || (this.f3434P instanceof AbstractC0607i)) {
                this.f3434P = new C2823j(this.f3440V);
            } else {
                C2828o c2828o = this.f3440V;
                int i4 = AbstractC0607i.f2408Q;
                if (c2828o == null) {
                    c2828o = new C2828o();
                }
                C0603g c0603g = new C0603g(c2828o, new RectF());
                C0605h c0605h = new C0605h(c0603g);
                c0605h.f2409P = c0603g;
                this.f3434P = c0605h;
            }
            this.f3438T = null;
            this.f3439U = null;
        }
        m1911u();
        m1916z();
        if (this.f3443b0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f3444c0 = getResources().getDimensionPixelSize(com.exotv.net.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC2429w.m4307l(getContext())) {
                this.f3444c0 = getResources().getDimensionPixelSize(com.exotv.net.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        m1892a();
        if (this.f3443b0 != 0) {
            m1912v();
        }
        EditText editText = this.f3459n;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i8 = this.f3443b0;
                if (i8 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i8 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1903l() {
        float f8;
        float f9;
        float f10;
        RectF rectF;
        float f11;
        int i;
        float f12;
        int i4;
        if (m1898g()) {
            int width = this.f3459n.getWidth();
            int gravity = this.f3459n.getGravity();
            C2365c c2365c = this.f3418F0;
            boolean zM4195c = c2365c.m4195c(c2365c.f8282B);
            c2365c.f8284D = zM4195c;
            Rect rect = c2365c.f8313d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM4195c) {
                        i4 = rect.left;
                        f10 = i4;
                    } else {
                        f8 = rect.right;
                        f9 = c2365c.f8308a0;
                    }
                } else if (zM4195c) {
                    f8 = rect.right;
                    f9 = c2365c.f8308a0;
                } else {
                    i4 = rect.left;
                    f10 = i4;
                }
                float fMax = Math.max(f10, rect.left);
                rectF = this.f3454k0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f11 = (width / 2.0f) + (c2365c.f8308a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c2365c.f8284D) {
                        f12 = c2365c.f8308a0;
                        f11 = f12 + fMax;
                    } else {
                        i = rect.right;
                        f11 = i;
                    }
                } else if (c2365c.f8284D) {
                    i = rect.right;
                    f11 = i;
                } else {
                    f12 = c2365c.f8308a0;
                    f11 = f12 + fMax;
                }
                rectF.right = Math.min(f11, rect.right);
                rectF.bottom = c2365c.m4198f() + rect.top;
                if (c2365c.f8306Z != null && !c2365c.m4206o()) {
                    StaticLayout staticLayout = c2365c.f8306Z;
                    float lineWidth = (c2365c.f8323i / c2365c.f8321h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (c2365c.f8284D) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f13 = rectF.left;
                float f14 = this.f3442a0;
                rectF.left = f13 - f14;
                rectF.right += f14;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f3445d0);
                rectF.top = 0.0f;
                AbstractC0607i abstractC0607i = (AbstractC0607i) this.f3434P;
                abstractC0607i.getClass();
                abstractC0607i.m1365w(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f8 = width / 2.0f;
            f9 = c2365c.f8308a0 / 2.0f;
            f10 = f8 - f9;
            float fMax2 = Math.max(f10, rect.left);
            rectF = this.f3454k0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f11 = (width / 2.0f) + (c2365c.f8308a0 / 2.0f);
            }
            rectF.right = Math.min(f11, rect.right);
            rectF.bottom = c2365c.m4198f() + rect.top;
            if (c2365c.f8306Z != null) {
                StaticLayout staticLayout2 = c2365c.f8306Z;
                float lineWidth2 = (c2365c.f8323i / c2365c.f8321h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (c2365c.f8284D) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* renamed from: n */
    public final void m1904n(C1780w0 c1780w0, int i) {
        try {
            c1780w0.setTextAppearance(i);
            if (c1780w0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c1780w0.setTextAppearance(com.exotv.net.R.style.TextAppearance_AppCompat_Caption);
        c1780w0.setTextColor(getContext().getColor(com.exotv.net.R.color.design_error));
    }

    /* renamed from: o */
    public final boolean m1905o() {
        C0624x c0624x = this.f3471t;
        return (c0624x.f2489o != 1 || c0624x.f2492r == null || TextUtils.isEmpty(c0624x.f2490p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3418F0.m4200i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C0620t c0620t = this.f3455l;
        c0620t.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z7 = false;
        this.f3430L0 = false;
        if (this.f3459n != null && this.f3459n.getMeasuredHeight() < (iMax = Math.max(c0620t.getMeasuredHeight(), this.f3453k.getMeasuredHeight()))) {
            this.f3459n.setMinimumHeight(iMax);
            z7 = true;
        }
        boolean zM1909s = m1909s();
        if (z7 || zM1909s) {
            this.f3459n.post(new RunnableC0127c0(10, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        float fDescent;
        int i10;
        int compoundPaddingTop;
        super.onLayout(z7, i, i4, i8, i9);
        EditText editText = this.f3459n;
        if (editText != null) {
            Rect rect = this.f3450i0;
            AbstractC2366d.m4207a(this, editText, rect);
            C2823j c2823j = this.f3438T;
            if (c2823j != null) {
                int i11 = rect.bottom;
                c2823j.setBounds(rect.left, i11 - this.f3446e0, rect.right, i11);
            }
            C2823j c2823j2 = this.f3439U;
            if (c2823j2 != null) {
                int i12 = rect.bottom;
                c2823j2.setBounds(rect.left, i12 - this.f3447f0, rect.right, i12);
            }
            if (this.f3431M) {
                float textSize = this.f3459n.getTextSize();
                C2365c c2365c = this.f3418F0;
                float f8 = c2365c.f8321h;
                TextPaint textPaint = c2365c.f8296P;
                if (f8 != textSize) {
                    c2365c.f8321h = textSize;
                    c2365c.m4201j(false);
                }
                int gravity = this.f3459n.getGravity();
                int i13 = (gravity & (-113)) | 48;
                if (c2365c.f8319g != i13) {
                    c2365c.f8319g = i13;
                    c2365c.m4201j(false);
                }
                if (c2365c.f8317f != gravity) {
                    c2365c.f8317f = gravity;
                    c2365c.m4201j(false);
                }
                Rect rectM1895d = m1895d(rect);
                int i14 = rectM1895d.left;
                int i15 = rectM1895d.top;
                int i16 = rectM1895d.right;
                int i17 = rectM1895d.bottom;
                Rect rect2 = c2365c.f8313d;
                if (rect2.left != i14 || rect2.top != i15 || rect2.right != i16 || rect2.bottom != i17) {
                    rect2.set(i14, i15, i16, i17);
                    c2365c.f8294N = true;
                }
                if (this.f3459n == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(c2365c.f8321h);
                    textPaint.setTypeface(c2365c.f8339v);
                    textPaint.setLetterSpacing(c2365c.f8304X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(c2365c.f8321h);
                    textPaint.setTypeface(c2365c.f8339v);
                    textPaint.setLetterSpacing(c2365c.f8304X);
                    fDescent = c2365c.f8329l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f3459n.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f3452j0;
                rect3.left = compoundPaddingLeft;
                if (this.f3443b0 != 1 || this.f3459n.getMinLines() > 1) {
                    if (this.f3443b0 != 0 || getHintMaxLines() == 1) {
                        i10 = 0;
                    } else {
                        textPaint.setTextSize(c2365c.f8321h);
                        textPaint.setTypeface(c2365c.f8339v);
                        textPaint.setLetterSpacing(c2365c.f8304X);
                        i10 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f3459n.getCompoundPaddingTop() + rect.top) - i10;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f3459n.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f3443b0 != 1 || this.f3459n.getMinLines() > 1) ? rect.bottom - this.f3459n.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i18 = rect3.left;
                int i19 = rect3.top;
                int i20 = rect3.right;
                Rect rect4 = c2365c.f8311c;
                if (rect4.left != i18 || rect4.top != i19 || rect4.right != i20 || rect4.bottom != compoundPaddingBottom || true != c2365c.f8328k0) {
                    rect4.set(i18, i19, i20, compoundPaddingBottom);
                    c2365c.f8294N = true;
                    c2365c.f8328k0 = true;
                }
                c2365c.m4201j(false);
                if (!m1898g() || this.f3416E0) {
                    return;
                }
                m1903l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        float f8;
        EditText editText;
        super.onMeasure(i, i4);
        boolean z7 = this.f3430L0;
        C0620t c0620t = this.f3455l;
        if (!z7) {
            c0620t.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f3430L0 = true;
        }
        if (this.f3413D != null && (editText = this.f3459n) != null) {
            this.f3413D.setGravity(editText.getGravity());
            this.f3413D.setPadding(this.f3459n.getCompoundPaddingLeft(), this.f3459n.getCompoundPaddingTop(), this.f3459n.getCompoundPaddingRight(), this.f3459n.getCompoundPaddingBottom());
        }
        c0620t.m1386n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f3459n.getMeasuredWidth() - this.f3459n.getCompoundPaddingLeft()) - this.f3459n.getCompoundPaddingRight();
        C2365c c2365c = this.f3418F0;
        TextPaint textPaint = c2365c.f8296P;
        textPaint.setTextSize(c2365c.f8323i);
        textPaint.setTypeface(c2365c.f8336s);
        textPaint.setLetterSpacing(c2365c.f8303W);
        float f9 = measuredWidth;
        c2365c.f8324i0 = c2365c.m4197e(c2365c.f8318f0, textPaint, c2365c.f8282B, (c2365c.f8323i / c2365c.f8321h) * f9, c2365c.f8284D).getHeight();
        textPaint.setTextSize(c2365c.f8321h);
        textPaint.setTypeface(c2365c.f8339v);
        textPaint.setLetterSpacing(c2365c.f8304X);
        c2365c.f8326j0 = c2365c.m4197e(c2365c.f8316e0, textPaint, c2365c.f8282B, f9, c2365c.f8284D).getHeight();
        EditText editText2 = this.f3459n;
        Rect rect = this.f3450i0;
        AbstractC2366d.m4207a(this, editText2, rect);
        Rect rectM1895d = m1895d(rect);
        int i8 = rectM1895d.left;
        int i9 = rectM1895d.top;
        int i10 = rectM1895d.right;
        int i11 = rectM1895d.bottom;
        Rect rect2 = c2365c.f8313d;
        if (rect2.left != i8 || rect2.top != i9 || rect2.right != i10 || rect2.bottom != i11) {
            rect2.set(i8, i9, i10, i11);
            c2365c.f8294N = true;
        }
        m1912v();
        m1892a();
        if (this.f3459n == null) {
            return;
        }
        int i12 = c2365c.f8326j0;
        if (i12 != -1) {
            f8 = i12;
        } else {
            TextPaint textPaint2 = c2365c.f8296P;
            textPaint2.setTextSize(c2365c.f8321h);
            textPaint2.setTypeface(c2365c.f8339v);
            textPaint2.setLetterSpacing(c2365c.f8304X);
            f8 = -textPaint2.ascent();
        }
        if (this.f3409B != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f3413D.getPaint());
            textPaint3.setTextSize(this.f3413D.getTextSize());
            textPaint3.setTypeface(this.f3413D.getTypeface());
            textPaint3.setLetterSpacing(this.f3413D.getLetterSpacing());
            C2370h c2370h = new C2370h(this.f3409B, textPaint3, measuredWidth);
            c2370h.f8362k = getLayoutDirection() == 1;
            c2370h.f8361j = true;
            float lineSpacingExtra = this.f3413D.getLineSpacingExtra();
            float lineSpacingMultiplier = this.f3413D.getLineSpacingMultiplier();
            c2370h.f8358g = lineSpacingExtra;
            c2370h.f8359h = lineSpacingMultiplier;
            c2370h.f8364m = new C0456a(5, this);
            fM4198f = (this.f3443b0 == 1 ? c2365c.m4198f() + this.f3444c0 + this.f3457m : 0.0f) + c2370h.m4209a().getHeight();
        }
        float fMax = Math.max(f8, fM4198f);
        if (this.f3459n.getMeasuredHeight() < fMax) {
            this.f3459n.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof C0610j0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0610j0 c0610j0 = (C0610j0) parcelable;
        super.onRestoreInstanceState(c0610j0.f8189j);
        setError(c0610j0.f2413l);
        if (c0610j0.f2414m) {
            post(new RunnableC0018f(5, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z7 = i == 1;
        if (z7 != this.f3441W) {
            InterfaceC2815d interfaceC2815d = this.f3440V.f10525e;
            RectF rectF = this.f3454k0;
            float fMo4909a = interfaceC2815d.mo4909a(rectF);
            float fMo4909a2 = this.f3440V.f10526f.mo4909a(rectF);
            float fMo4909a3 = this.f3440V.f10528h.mo4909a(rectF);
            float fMo4909a4 = this.f3440V.f10527g.mo4909a(rectF);
            C2828o c2828o = this.f3440V;
            AbstractC2436a abstractC2436a = c2828o.f10521a;
            AbstractC2436a abstractC2436a2 = c2828o.f10522b;
            AbstractC2436a abstractC2436a3 = c2828o.f10524d;
            AbstractC2436a abstractC2436a4 = c2828o.f10523c;
            C2819f c2819f = new C2819f(0);
            C2819f c2819f2 = new C2819f(0);
            C2819f c2819f3 = new C2819f(0);
            C2819f c2819f4 = new C2819f(0);
            C2809a c2809a = new C2809a(fMo4909a2);
            C2809a c2809a2 = new C2809a(fMo4909a);
            C2809a c2809a3 = new C2809a(fMo4909a4);
            C2809a c2809a4 = new C2809a(fMo4909a3);
            C2828o c2828o2 = new C2828o();
            c2828o2.f10521a = abstractC2436a2;
            c2828o2.f10522b = abstractC2436a;
            c2828o2.f10523c = abstractC2436a3;
            c2828o2.f10524d = abstractC2436a4;
            c2828o2.f10525e = c2809a;
            c2828o2.f10526f = c2809a2;
            c2828o2.f10527g = c2809a4;
            c2828o2.f10528h = c2809a3;
            c2828o2.f10529i = c2819f;
            c2828o2.f10530j = c2819f2;
            c2828o2.f10531k = c2819f3;
            c2828o2.f10532l = c2819f4;
            this.f3441W = z7;
            setShapeAppearanceModel(c2828o2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0610j0 c0610j0 = new C0610j0(super.onSaveInstanceState());
        if (m1905o()) {
            c0610j0.f2413l = getError();
        }
        C0620t c0620t = this.f3455l;
        c0610j0.f2414m = c0620t.f2455r != 0 && c0620t.f2453p.f3359m;
        return c0610j0;
    }

    /* renamed from: p */
    public final void m1906p(Editable editable) throws Resources.NotFoundException {
        ((C0222n) this.f3479x).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z7 = this.f3477w;
        int i = this.f3475v;
        if (i == -1) {
            this.f3481y.setText(String.valueOf(length));
            this.f3481y.setContentDescription(null);
            this.f3477w = false;
        } else {
            this.f3477w = length > i;
            Context context = getContext();
            this.f3481y.setContentDescription(context.getString(this.f3477w ? com.exotv.net.R.string.character_counter_overflowed_content_description : com.exotv.net.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f3475v)));
            if (z7 != this.f3477w) {
                m1907q();
            }
            String str = C1547b.f5928b;
            C1547b c1547b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C1547b.f5931e : C1547b.f5930d;
            C1780w0 c1780w0 = this.f3481y;
            String string = getContext().getString(com.exotv.net.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f3475v));
            c1547b.getClass();
            C0088j0 c0088j0 = AbstractC1551f.f5938a;
            c1780w0.setText(string != null ? c1547b.m3227c(string).toString() : null);
        }
        if (this.f3459n == null || z7 == this.f3477w) {
            return;
        }
        m1913w(false, false);
        m1916z();
        m1910t();
    }

    /* renamed from: q */
    public final void m1907q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1780w0 c1780w0 = this.f3481y;
        if (c1780w0 != null) {
            m1904n(c1780w0, this.f3477w ? this.f3483z : this.f3407A);
            if (!this.f3477w && (colorStateList2 = this.f3423I) != null) {
                this.f3481y.setTextColor(colorStateList2);
            }
            if (!this.f3477w || (colorStateList = this.f3425J) == null) {
                return;
            }
            this.f3481y.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1908r() throws Resources.NotFoundException {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f3427K;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueM4340o = AbstractC2436a.m4340o(context.getTheme(), com.exotv.net.R.attr.colorControlActivated);
            if (typedValueM4340o != null) {
                int i = typedValueM4340o.resourceId;
                if (i != 0) {
                    colorStateListValueOf = AbstractC0120b.m424t(context, i);
                } else {
                    int i4 = typedValueM4340o.data;
                    colorStateListValueOf = i4 != 0 ? ColorStateList.valueOf(i4) : null;
                }
            }
        }
        EditText editText = this.f3459n;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f3459n.getTextCursorDrawable().mutate();
        if ((m1905o() || (this.f3481y != null && this.f3477w)) && (colorStateList = this.f3429L) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1909s() {
        boolean z7;
        if (this.f3459n == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z8 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C0596c0 c0596c0 = this.f3453k;
            if (c0596c0.getMeasuredWidth() > 0) {
                int iMax = Math.max(0, c0596c0.getMeasuredWidth() - this.f3459n.getPaddingLeft());
                if (this.f3458m0 == null || this.f3460n0 != iMax) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f3458m0 = colorDrawable;
                    this.f3460n0 = iMax;
                    colorDrawable.setBounds(0, 0, iMax, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f3459n.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f3458m0;
                if (drawable != colorDrawable2) {
                    this.f3459n.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z7 = true;
                }
                z7 = false;
            } else {
                if (this.f3458m0 != null) {
                    Drawable[] compoundDrawablesRelative2 = this.f3459n.getCompoundDrawablesRelative();
                    this.f3459n.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    this.f3458m0 = null;
                    z7 = true;
                }
                z7 = false;
            }
        }
        C0620t c0620t = this.f3455l;
        if ((c0620t.m1377e() || ((c0620t.f2455r != 0 && c0620t.m1376d()) || c0620t.f2462y != null)) && c0620t.getMeasuredWidth() > 0) {
            int measuredWidth = c0620t.f2463z.getMeasuredWidth() - this.f3459n.getPaddingRight();
            if (c0620t.m1377e()) {
                checkableImageButton = c0620t.f2449l;
            } else if (c0620t.f2455r != 0 && c0620t.m1376d()) {
                checkableImageButton = c0620t.f2453p;
            }
            if (checkableImageButton != null) {
                measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
            }
            int iMax2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative3 = this.f3459n.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f3464p0;
            if (colorDrawable3 != null && this.f3466q0 != iMax2) {
                this.f3466q0 = iMax2;
                colorDrawable3.setBounds(0, 0, iMax2, 1);
                this.f3459n.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f3464p0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f3464p0 = colorDrawable4;
                this.f3466q0 = iMax2;
                colorDrawable4.setBounds(0, 0, iMax2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative3[2];
            ColorDrawable colorDrawable5 = this.f3464p0;
            if (drawable2 != colorDrawable5) {
                this.f3468r0 = drawable2;
                this.f3459n.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f3464p0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f3459n.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.f3464p0) {
                this.f3459n.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f3468r0, compoundDrawablesRelative4[3]);
            } else {
                z8 = z7;
            }
            this.f3464p0 = null;
            return z8;
        }
        return z7;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f3449h0 != i) {
            this.f3449h0 = i;
            this.f3482y0 = i;
            this.f3408A0 = i;
            this.f3410B0 = i;
            m1894c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f3482y0 = defaultColor;
        this.f3449h0 = defaultColor;
        this.f3484z0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f3408A0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f3410B0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m1894c();
    }

    public void setBoxBackgroundMode(int i) throws Resources.NotFoundException {
        if (i == this.f3443b0) {
            return;
        }
        this.f3443b0 = i;
        if (this.f3459n != null) {
            m1902k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f3444c0 = i;
    }

    public void setBoxCornerFamily(int i) {
        C2827n c2827nM4956j = this.f3440V.m4956j();
        InterfaceC2815d interfaceC2815d = this.f3440V.f10525e;
        c2827nM4956j.f10509a = AbstractC2429w.m4299d(i);
        c2827nM4956j.f10513e = interfaceC2815d;
        InterfaceC2815d interfaceC2815d2 = this.f3440V.f10526f;
        c2827nM4956j.f10510b = AbstractC2429w.m4299d(i);
        c2827nM4956j.f10514f = interfaceC2815d2;
        InterfaceC2815d interfaceC2815d3 = this.f3440V.f10528h;
        c2827nM4956j.f10512d = AbstractC2429w.m4299d(i);
        c2827nM4956j.f10516h = interfaceC2815d3;
        InterfaceC2815d interfaceC2815d4 = this.f3440V.f10527g;
        c2827nM4956j.f10511c = AbstractC2429w.m4299d(i);
        c2827nM4956j.f10515g = interfaceC2815d4;
        this.f3440V = c2827nM4956j.m4951a();
        m1894c();
    }

    public void setBoxStrokeColor(int i) throws Resources.NotFoundException {
        if (this.f3478w0 != i) {
            this.f3478w0 = i;
            m1916z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.f3474u0 = colorStateList.getDefaultColor();
            this.f3412C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f3476v0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f3478w0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f3478w0 != colorStateList.getDefaultColor()) {
            this.f3478w0 = colorStateList.getDefaultColor();
        }
        m1916z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f3480x0 != colorStateList) {
            this.f3480x0 = colorStateList;
            m1916z();
        }
    }

    public void setBoxStrokeWidth(int i) throws Resources.NotFoundException {
        this.f3446e0 = i;
        m1916z();
    }

    public void setBoxStrokeWidthFocused(int i) throws Resources.NotFoundException {
        this.f3447f0 = i;
        m1916z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z7) throws Resources.NotFoundException {
        if (this.f3473u != z7) {
            C0624x c0624x = this.f3471t;
            if (z7) {
                C1780w0 c1780w0 = new C1780w0(getContext(), null);
                this.f3481y = c1780w0;
                c1780w0.setId(com.exotv.net.R.id.textinput_counter);
                Typeface typeface = this.f3456l0;
                if (typeface != null) {
                    this.f3481y.setTypeface(typeface);
                }
                this.f3481y.setMaxLines(1);
                c0624x.m1408a(this.f3481y, 2);
                ((ViewGroup.MarginLayoutParams) this.f3481y.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.exotv.net.R.dimen.mtrl_textinput_counter_margin_start));
                m1907q();
                if (this.f3481y != null) {
                    EditText editText = this.f3459n;
                    m1906p(editText != null ? editText.getText() : null);
                }
            } else {
                c0624x.m1414g(this.f3481y, 2);
                this.f3481y = null;
            }
            this.f3473u = z7;
        }
    }

    public void setCounterMaxLength(int i) throws Resources.NotFoundException {
        if (this.f3475v != i) {
            if (i > 0) {
                this.f3475v = i;
            } else {
                this.f3475v = -1;
            }
            if (!this.f3473u || this.f3481y == null) {
                return;
            }
            EditText editText = this.f3459n;
            m1906p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f3483z != i) {
            this.f3483z = i;
            m1907q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f3425J != colorStateList) {
            this.f3425J = colorStateList;
            m1907q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f3407A != i) {
            this.f3407A = i;
            m1907q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f3423I != colorStateList) {
            this.f3423I = colorStateList;
            m1907q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f3427K != colorStateList) {
            this.f3427K = colorStateList;
            m1908r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.f3429L != colorStateList) {
            this.f3429L = colorStateList;
            if (m1905o() || (this.f3481y != null && this.f3477w)) {
                m1908r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f3470s0 = colorStateList;
        this.f3472t0 = colorStateList;
        if (this.f3459n != null) {
            m1913w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        m1891m(this, z7);
        super.setEnabled(z7);
    }

    public void setEndIconActivated(boolean z7) {
        this.f3455l.f2453p.setActivated(z7);
    }

    public void setEndIconCheckable(boolean z7) {
        this.f3455l.f2453p.setCheckable(z7);
    }

    public void setEndIconContentDescription(int i) {
        C0620t c0620t = this.f3455l;
        c0620t.m1379g(i != 0 ? c0620t.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        C0620t c0620t = this.f3455l;
        Drawable drawableM1542D = i != 0 ? AbstractC0715d.m1542D(c0620t.getContext(), i) : null;
        TextInputLayout textInputLayout = c0620t.f2447j;
        CheckableImageButton checkableImageButton = c0620t.f2453p;
        checkableImageButton.setImageDrawable(drawableM1542D);
        if (drawableM1542D != null) {
            AbstractC0622v.m1389a(textInputLayout, checkableImageButton, c0620t.f2457t, c0620t.f2458u);
            AbstractC0622v.m1398j(textInputLayout, checkableImageButton, c0620t.f2457t);
        }
    }

    public void setEndIconMinSize(int i) {
        C0620t c0620t = this.f3455l;
        if (i < 0) {
            c0620t.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c0620t.f2459v) {
            c0620t.f2459v = i;
            CheckableImageButton checkableImageButton = c0620t.f2453p;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c0620t.f2449l;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f3455l.m1380h(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0620t c0620t = this.f3455l;
        CheckableImageButton checkableImageButton = c0620t.f2453p;
        View.OnLongClickListener onLongClickListener = c0620t.f2461x;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0622v.m1401m(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0620t c0620t = this.f3455l;
        c0620t.f2461x = onLongClickListener;
        CheckableImageButton checkableImageButton = c0620t.f2453p;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0622v.m1401m(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0620t c0620t = this.f3455l;
        c0620t.f2460w = scaleType;
        c0620t.f2453p.setScaleType(scaleType);
        c0620t.f2449l.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0620t c0620t = this.f3455l;
        if (c0620t.f2457t != colorStateList) {
            c0620t.f2457t = colorStateList;
            AbstractC0622v.m1389a(c0620t.f2447j, c0620t.f2453p, colorStateList, c0620t.f2458u);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0620t c0620t = this.f3455l;
        if (c0620t.f2458u != mode) {
            c0620t.f2458u = mode;
            AbstractC0622v.m1389a(c0620t.f2447j, c0620t.f2453p, c0620t.f2457t, mode);
        }
    }

    public void setEndIconVisible(boolean z7) {
        this.f3455l.m1381i(z7);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        C0624x c0624x = this.f3471t;
        if (!c0624x.f2491q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0624x.m1413f();
            return;
        }
        c0624x.m1410c();
        c0624x.f2490p = charSequence;
        c0624x.f2492r.setText(charSequence);
        int i = c0624x.f2488n;
        if (i != 1) {
            c0624x.f2489o = 1;
        }
        c0624x.m1416i(i, c0624x.f2489o, c0624x.m1415h(c0624x.f2492r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C0624x c0624x = this.f3471t;
        c0624x.f2494t = i;
        C1780w0 c1780w0 = c0624x.f2492r;
        if (c1780w0 != null) {
            c1780w0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0624x c0624x = this.f3471t;
        c0624x.f2493s = charSequence;
        C1780w0 c1780w0 = c0624x.f2492r;
        if (c1780w0 != null) {
            c1780w0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z7) throws Resources.NotFoundException {
        C0624x c0624x = this.f3471t;
        TextInputLayout textInputLayout = c0624x.f2482h;
        if (c0624x.f2491q == z7) {
            return;
        }
        c0624x.m1410c();
        if (z7) {
            C1780w0 c1780w0 = new C1780w0(c0624x.f2481g, null);
            c0624x.f2492r = c1780w0;
            c1780w0.setId(com.exotv.net.R.id.textinput_error);
            c0624x.f2492r.setTextAlignment(5);
            Typeface typeface = c0624x.f2474B;
            if (typeface != null) {
                c0624x.f2492r.setTypeface(typeface);
            }
            int i = c0624x.f2495u;
            c0624x.f2495u = i;
            C1780w0 c1780w02 = c0624x.f2492r;
            if (c1780w02 != null) {
                c0624x.f2482h.m1904n(c1780w02, i);
            }
            ColorStateList colorStateList = c0624x.f2496v;
            c0624x.f2496v = colorStateList;
            C1780w0 c1780w03 = c0624x.f2492r;
            if (c1780w03 != null && colorStateList != null) {
                c1780w03.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0624x.f2493s;
            c0624x.f2493s = charSequence;
            C1780w0 c1780w04 = c0624x.f2492r;
            if (c1780w04 != null) {
                c1780w04.setContentDescription(charSequence);
            }
            int i4 = c0624x.f2494t;
            c0624x.f2494t = i4;
            C1780w0 c1780w05 = c0624x.f2492r;
            if (c1780w05 != null) {
                c1780w05.setAccessibilityLiveRegion(i4);
            }
            c0624x.f2492r.setVisibility(4);
            c0624x.m1408a(c0624x.f2492r, 0);
        } else {
            c0624x.m1413f();
            c0624x.m1414g(c0624x.f2492r, 0);
            c0624x.f2492r = null;
            textInputLayout.m1910t();
            textInputLayout.m1916z();
        }
        c0624x.f2491q = z7;
    }

    public void setErrorIconDrawable(int i) {
        C0620t c0620t = this.f3455l;
        c0620t.m1382j(i != 0 ? AbstractC0715d.m1542D(c0620t.getContext(), i) : null);
        AbstractC0622v.m1398j(c0620t.f2447j, c0620t.f2449l, c0620t.f2450m);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0620t c0620t = this.f3455l;
        CheckableImageButton checkableImageButton = c0620t.f2449l;
        View.OnLongClickListener onLongClickListener = c0620t.f2452o;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0622v.m1401m(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0620t c0620t = this.f3455l;
        c0620t.f2452o = onLongClickListener;
        CheckableImageButton checkableImageButton = c0620t.f2449l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0622v.m1401m(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0620t c0620t = this.f3455l;
        if (c0620t.f2450m != colorStateList) {
            c0620t.f2450m = colorStateList;
            AbstractC0622v.m1389a(c0620t.f2447j, c0620t.f2449l, colorStateList, c0620t.f2451n);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0620t c0620t = this.f3455l;
        if (c0620t.f2451n != mode) {
            c0620t.f2451n = mode;
            AbstractC0622v.m1389a(c0620t.f2447j, c0620t.f2449l, c0620t.f2450m, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C0624x c0624x = this.f3471t;
        c0624x.f2495u = i;
        C1780w0 c1780w0 = c0624x.f2492r;
        if (c1780w0 != null) {
            c0624x.f2482h.m1904n(c1780w0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0624x c0624x = this.f3471t;
        c0624x.f2496v = colorStateList;
        C1780w0 c1780w0 = c0624x.f2492r;
        if (c1780w0 == null || colorStateList == null) {
            return;
        }
        c1780w0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z7) {
        if (this.f3420G0 != z7) {
            this.f3420G0 = z7;
            m1913w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C0624x c0624x = this.f3471t;
        if (zIsEmpty) {
            if (c0624x.f2498x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0624x.f2498x) {
            setHelperTextEnabled(true);
        }
        c0624x.m1410c();
        c0624x.f2497w = charSequence;
        c0624x.f2499y.setText(charSequence);
        int i = c0624x.f2488n;
        if (i != 2) {
            c0624x.f2489o = 2;
        }
        c0624x.m1416i(i, c0624x.f2489o, c0624x.m1415h(c0624x.f2499y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0624x c0624x = this.f3471t;
        c0624x.f2473A = colorStateList;
        C1780w0 c1780w0 = c0624x.f2499y;
        if (c1780w0 == null || colorStateList == null) {
            return;
        }
        c1780w0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z7) throws Resources.NotFoundException {
        C0624x c0624x = this.f3471t;
        TextInputLayout textInputLayout = c0624x.f2482h;
        if (c0624x.f2498x == z7) {
            return;
        }
        c0624x.m1410c();
        if (z7) {
            C1780w0 c1780w0 = new C1780w0(c0624x.f2481g, null);
            c0624x.f2499y = c1780w0;
            c1780w0.setId(com.exotv.net.R.id.textinput_helper_text);
            c0624x.f2499y.setTextAlignment(5);
            Typeface typeface = c0624x.f2474B;
            if (typeface != null) {
                c0624x.f2499y.setTypeface(typeface);
            }
            c0624x.f2499y.setVisibility(4);
            c0624x.f2499y.setImportantForAccessibility(2);
            int i = c0624x.f2500z;
            c0624x.f2500z = i;
            C1780w0 c1780w02 = c0624x.f2499y;
            if (c1780w02 != null) {
                c1780w02.setTextAppearance(i);
            }
            ColorStateList colorStateList = c0624x.f2473A;
            c0624x.f2473A = colorStateList;
            C1780w0 c1780w03 = c0624x.f2499y;
            if (c1780w03 != null && colorStateList != null) {
                c1780w03.setTextColor(colorStateList);
            }
            c0624x.m1408a(c0624x.f2499y, 1);
        } else {
            c0624x.m1410c();
            int i4 = c0624x.f2488n;
            if (i4 == 2) {
                c0624x.f2489o = 0;
            }
            c0624x.m1416i(i4, c0624x.f2489o, c0624x.m1415h(c0624x.f2499y, C2181z.FRAGMENT_ENCODE_SET));
            c0624x.m1414g(c0624x.f2499y, 1);
            c0624x.f2499y = null;
            textInputLayout.m1910t();
            textInputLayout.m1916z();
        }
        c0624x.f2498x = z7;
    }

    public void setHelperTextTextAppearance(int i) {
        C0624x c0624x = this.f3471t;
        c0624x.f2500z = i;
        C1780w0 c1780w0 = c0624x.f2499y;
        if (c1780w0 != null) {
            c1780w0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f3431M) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z7) {
        this.f3422H0 = z7;
    }

    public void setHintEnabled(boolean z7) {
        if (z7 != this.f3431M) {
            this.f3431M = z7;
            if (z7) {
                CharSequence hint = this.f3459n.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f3432N)) {
                        setHint(hint);
                    }
                    this.f3459n.setHint((CharSequence) null);
                }
                this.f3433O = true;
            } else {
                this.f3433O = false;
                if (!TextUtils.isEmpty(this.f3432N) && TextUtils.isEmpty(this.f3459n.getHint())) {
                    this.f3459n.setHint(this.f3432N);
                }
                setHintInternal(null);
            }
            if (this.f3459n != null) {
                m1912v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        C2365c c2365c = this.f3418F0;
        if (i != c2365c.f8318f0) {
            c2365c.f8318f0 = i;
            c2365c.m4201j(false);
        }
        if (i != c2365c.f8316e0) {
            c2365c.f8316e0 = i;
            c2365c.m4201j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        C2365c c2365c = this.f3418F0;
        TextInputLayout textInputLayout = c2365c.f8307a;
        C2552d c2552d = new C2552d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c2552d.f9261k;
        if (colorStateList != null) {
            c2365c.f8327k = colorStateList;
        }
        float f8 = c2552d.f9262l;
        if (f8 != 0.0f) {
            c2365c.f8323i = f8;
        }
        ColorStateList colorStateList2 = c2552d.f9251a;
        if (colorStateList2 != null) {
            c2365c.f8302V = colorStateList2;
        }
        c2365c.f8300T = c2552d.f9256f;
        c2365c.f8301U = c2552d.f9257g;
        c2365c.f8299S = c2552d.f9258h;
        c2365c.f8303W = c2552d.f9260j;
        C2549a c2549a = c2365c.f8343z;
        if (c2549a != null) {
            c2549a.f9244c = true;
        }
        C1629o c1629o = new C1629o(c2365c);
        c2552d.m4563a();
        c2365c.f8343z = new C2549a(c1629o, c2552d.f9266p);
        c2552d.m4564b(textInputLayout.getContext(), c2365c.f8343z);
        c2365c.m4201j(false);
        this.f3472t0 = c2365c.f8327k;
        if (this.f3459n != null) {
            m1913w(false, false);
            m1912v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f3472t0 != colorStateList) {
            if (this.f3470s0 == null) {
                C2365c c2365c = this.f3418F0;
                if (c2365c.f8327k != colorStateList) {
                    c2365c.f8327k = colorStateList;
                    c2365c.m4201j(false);
                }
            }
            this.f3472t0 = colorStateList;
            if (this.f3459n != null) {
                m1913w(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC0606h0 interfaceC0606h0) {
        this.f3479x = interfaceC0606h0;
    }

    public void setMaxEms(int i) {
        this.f3465q = i;
        EditText editText = this.f3459n;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f3469s = i;
        EditText editText = this.f3459n;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f3463p = i;
        EditText editText = this.f3459n;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f3467r = i;
        EditText editText = this.f3459n;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C0620t c0620t = this.f3455l;
        c0620t.f2453p.setContentDescription(i != 0 ? c0620t.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C0620t c0620t = this.f3455l;
        c0620t.f2453p.setImageDrawable(i != 0 ? AbstractC0715d.m1542D(c0620t.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z7) {
        C0620t c0620t = this.f3455l;
        if (z7 && c0620t.f2455r != 1) {
            c0620t.m1380h(1);
        } else if (z7) {
            c0620t.getClass();
        } else {
            c0620t.m1380h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0620t c0620t = this.f3455l;
        c0620t.f2457t = colorStateList;
        AbstractC0622v.m1389a(c0620t.f2447j, c0620t.f2453p, colorStateList, c0620t.f2458u);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0620t c0620t = this.f3455l;
        c0620t.f2458u = mode;
        AbstractC0622v.m1389a(c0620t.f2447j, c0620t.f2453p, c0620t.f2457t, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f3413D == null) {
            C1780w0 c1780w0 = new C1780w0(getContext(), null);
            this.f3413D = c1780w0;
            c1780w0.setId(com.exotv.net.R.id.textinput_placeholder);
            this.f3413D.setImportantForAccessibility(1);
            this.f3413D.setAccessibilityLiveRegion(1);
            C0823h c0823hM1897f = m1897f();
            this.f3419G = c0823hM1897f;
            c0823hM1897f.f3691k = 67L;
            this.f3421H = m1897f();
            setPlaceholderTextAppearance(this.f3417F);
            setPlaceholderTextColor(this.f3415E);
            AbstractC1828m0.m3608m(this.f3413D, new C0600e0(0));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f3411C) {
                setPlaceholderTextEnabled(true);
            }
            this.f3409B = charSequence;
        }
        EditText editText = this.f3459n;
        m1914x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f3417F = i;
        C1780w0 c1780w0 = this.f3413D;
        if (c1780w0 != null) {
            c1780w0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f3415E != colorStateList) {
            this.f3415E = colorStateList;
            C1780w0 c1780w0 = this.f3413D;
            if (c1780w0 == null || colorStateList == null) {
                return;
            }
            c1780w0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C0596c0 c0596c0 = this.f3453k;
        c0596c0.getClass();
        c0596c0.f2380l = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0596c0.f2379k.setText(charSequence);
        c0596c0.m1353f();
    }

    public void setPrefixTextAppearance(int i) {
        this.f3453k.f2379k.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3453k.f2379k.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C2828o c2828o) {
        C2823j c2823j = this.f3434P;
        if (c2823j == null || c2823j.m4937i() == c2828o) {
            return;
        }
        this.f3440V = c2828o;
        m1894c();
    }

    public void setStartIconCheckable(boolean z7) {
        this.f3453k.f2381m.setCheckable(z7);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0715d.m1542D(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C0596c0 c0596c0 = this.f3453k;
        if (i < 0) {
            c0596c0.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != c0596c0.f2384p) {
            c0596c0.f2384p = i;
            CheckableImageButton checkableImageButton = c0596c0.f2381m;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C0596c0 c0596c0 = this.f3453k;
        CheckableImageButton checkableImageButton = c0596c0.f2381m;
        View.OnLongClickListener onLongClickListener = c0596c0.f2386r;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0622v.m1401m(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0596c0 c0596c0 = this.f3453k;
        c0596c0.f2386r = onLongClickListener;
        CheckableImageButton checkableImageButton = c0596c0.f2381m;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0622v.m1401m(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C0596c0 c0596c0 = this.f3453k;
        c0596c0.f2385q = scaleType;
        c0596c0.f2381m.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C0596c0 c0596c0 = this.f3453k;
        if (c0596c0.f2382n != colorStateList) {
            c0596c0.f2382n = colorStateList;
            AbstractC0622v.m1389a(c0596c0.f2378j, c0596c0.f2381m, colorStateList, c0596c0.f2383o);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C0596c0 c0596c0 = this.f3453k;
        if (c0596c0.f2383o != mode) {
            c0596c0.f2383o = mode;
            AbstractC0622v.m1389a(c0596c0.f2378j, c0596c0.f2381m, c0596c0.f2382n, mode);
        }
    }

    public void setStartIconVisible(boolean z7) {
        this.f3453k.m1351d(z7);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0620t c0620t = this.f3455l;
        c0620t.getClass();
        c0620t.f2462y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0620t.f2463z.setText(charSequence);
        c0620t.m1387o();
    }

    public void setSuffixTextAppearance(int i) {
        this.f3455l.f2463z.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f3455l.f2463z.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0604g0 c0604g0) {
        EditText editText = this.f3459n;
        if (editText != null) {
            AbstractC1828m0.m3608m(editText, c0604g0);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f3456l0) {
            this.f3456l0 = typeface;
            this.f3418F0.m4205n(typeface);
            C0624x c0624x = this.f3471t;
            if (typeface != c0624x.f2474B) {
                c0624x.f2474B = typeface;
                C1780w0 c1780w0 = c0624x.f2492r;
                if (c1780w0 != null) {
                    c1780w0.setTypeface(typeface);
                }
                C1780w0 c1780w02 = c0624x.f2499y;
                if (c1780w02 != null) {
                    c1780w02.setTypeface(typeface);
                }
            }
            C1780w0 c1780w03 = this.f3481y;
            if (c1780w03 != null) {
                c1780w03.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final void m1910t() {
        Drawable background;
        C1780w0 c1780w0;
        EditText editText = this.f3459n;
        if (editText == null || this.f3443b0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1714e1.f6531a;
        Drawable drawableMutate = background.mutate();
        if (m1905o()) {
            drawableMutate.setColorFilter(C1770t.m3454c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f3477w && (c1780w0 = this.f3481y) != null) {
            drawableMutate.setColorFilter(C1770t.m3454c(c1780w0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f3459n.refreshDrawableState();
        }
    }

    /* renamed from: u */
    public final void m1911u() {
        EditText editText = this.f3459n;
        if (editText == null || this.f3434P == null) {
            return;
        }
        if ((this.f3437S || editText.getBackground() == null) && this.f3443b0 != 0) {
            this.f3459n.setBackground(getEditTextBoxBackground());
            this.f3437S = true;
        }
    }

    /* renamed from: v */
    public final void m1912v() {
        if (this.f3443b0 != 1) {
            FrameLayout frameLayout = this.f3451j;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM1896e = m1896e();
            if (iM1896e != layoutParams.topMargin) {
                layoutParams.topMargin = iM1896e;
                frameLayout.requestLayout();
            }
        }
    }

    /* renamed from: w */
    public final void m1913w(boolean z7, boolean z8) {
        ColorStateList colorStateList;
        C1780w0 c1780w0;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f3459n;
        boolean z9 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f3459n;
        boolean z10 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f3470s0;
        C2365c c2365c = this.f3418F0;
        if (colorStateList2 != null) {
            c2365c.m4202k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f3470s0;
            c2365c.m4202k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f3412C0) : this.f3412C0));
        } else if (m1905o()) {
            C1780w0 c1780w02 = this.f3471t.f2492r;
            c2365c.m4202k(c1780w02 != null ? c1780w02.getTextColors() : null);
        } else if (this.f3477w && (c1780w0 = this.f3481y) != null) {
            c2365c.m4202k(c1780w0.getTextColors());
        } else if (z10 && (colorStateList = this.f3472t0) != null && c2365c.f8327k != colorStateList) {
            c2365c.f8327k = colorStateList;
            c2365c.m4201j(false);
        }
        C0620t c0620t = this.f3455l;
        C0596c0 c0596c0 = this.f3453k;
        if (z9 || !this.f3420G0 || (isEnabled() && z10)) {
            if (z8 || this.f3416E0) {
                ValueAnimator valueAnimator = this.f3424I0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f3424I0.cancel();
                }
                if (z7 && this.f3422H0) {
                    m1893b(1.0f);
                } else {
                    c2365c.m4204m(1.0f);
                }
                this.f3416E0 = false;
                if (m1898g()) {
                    m1903l();
                }
                EditText editText3 = this.f3459n;
                m1914x(editText3 != null ? editText3.getText() : null);
                c0596c0.f2387s = false;
                c0596c0.m1353f();
                c0620t.f2442A = false;
                c0620t.m1387o();
                return;
            }
            return;
        }
        if (z8 || !this.f3416E0) {
            ValueAnimator valueAnimator2 = this.f3424I0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f3424I0.cancel();
            }
            if (z7 && this.f3422H0) {
                m1893b(0.0f);
            } else {
                c2365c.m4204m(0.0f);
            }
            if (m1898g() && !((AbstractC0607i) this.f3434P).f2409P.f2406q.isEmpty() && m1898g()) {
                ((AbstractC0607i) this.f3434P).m1365w(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f3416E0 = true;
            C1780w0 c1780w03 = this.f3413D;
            if (c1780w03 != null && this.f3411C) {
                c1780w03.setText((CharSequence) null);
                AbstractC0833r.m2002a(this.f3451j, this.f3421H);
                this.f3413D.setVisibility(4);
            }
            c0596c0.f2387s = true;
            c0596c0.m1353f();
            c0620t.f2442A = true;
            c0620t.m1387o();
        }
    }

    /* renamed from: x */
    public final void m1914x(Editable editable) {
        ((C0222n) this.f3479x).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f3451j;
        if (length != 0 || this.f3416E0) {
            C1780w0 c1780w0 = this.f3413D;
            if (c1780w0 == null || !this.f3411C) {
                return;
            }
            c1780w0.setText((CharSequence) null);
            AbstractC0833r.m2002a(frameLayout, this.f3421H);
            this.f3413D.setVisibility(4);
            return;
        }
        if (this.f3413D == null || !this.f3411C || TextUtils.isEmpty(this.f3409B)) {
            return;
        }
        this.f3413D.setText(this.f3409B);
        AbstractC0833r.m2002a(frameLayout, this.f3419G);
        this.f3413D.setVisibility(0);
        this.f3413D.bringToFront();
    }

    /* renamed from: y */
    public final void m1915y(boolean z7, boolean z8) {
        int defaultColor = this.f3480x0.getDefaultColor();
        int colorForState = this.f3480x0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f3480x0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z7) {
            this.f3448g0 = colorForState2;
        } else if (z8) {
            this.f3448g0 = colorForState;
        } else {
            this.f3448g0 = defaultColor;
        }
    }

    /* renamed from: z */
    public final void m1916z() throws Resources.NotFoundException {
        C1780w0 c1780w0;
        EditText editText;
        EditText editText2;
        if (this.f3434P == null || this.f3443b0 == 0) {
            return;
        }
        boolean z7 = isFocused() || ((editText2 = this.f3459n) != null && editText2.hasFocus());
        boolean z8 = isHovered() || ((editText = this.f3459n) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f3448g0 = this.f3412C0;
        } else if (m1905o()) {
            if (this.f3480x0 != null) {
                m1915y(z7, z8);
            } else {
                this.f3448g0 = getErrorCurrentTextColors();
            }
        } else if (!this.f3477w || (c1780w0 = this.f3481y) == null) {
            if (z7) {
                this.f3448g0 = this.f3478w0;
            } else if (z8) {
                this.f3448g0 = this.f3476v0;
            } else {
                this.f3448g0 = this.f3474u0;
            }
        } else if (this.f3480x0 != null) {
            m1915y(z7, z8);
        } else {
            this.f3448g0 = c1780w0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m1908r();
        }
        C0620t c0620t = this.f3455l;
        TextInputLayout textInputLayout = c0620t.f2447j;
        CheckableImageButton checkableImageButton = c0620t.f2453p;
        TextInputLayout textInputLayout2 = c0620t.f2447j;
        c0620t.m1385m();
        AbstractC0622v.m1398j(textInputLayout2, c0620t.f2449l, c0620t.f2450m);
        AbstractC0622v.m1398j(textInputLayout2, checkableImageButton, c0620t.f2457t);
        if (c0620t.m1374b() instanceof C0615o) {
            if (!textInputLayout.m1905o() || checkableImageButton.getDrawable() == null) {
                AbstractC0622v.m1389a(textInputLayout, checkableImageButton, c0620t.f2457t, c0620t.f2458u);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        C0596c0 c0596c0 = this.f3453k;
        AbstractC0622v.m1398j(c0596c0.f2378j, c0596c0.f2381m, c0596c0.f2382n);
        if (this.f3443b0 == 2) {
            int i = this.f3445d0;
            if (z7 && isEnabled()) {
                this.f3445d0 = this.f3447f0;
            } else {
                this.f3445d0 = this.f3446e0;
            }
            if (this.f3445d0 != i && m1898g() && !this.f3416E0) {
                if (m1898g()) {
                    ((AbstractC0607i) this.f3434P).m1365w(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m1903l();
            }
        }
        if (this.f3443b0 == 1) {
            if (!isEnabled()) {
                this.f3449h0 = this.f3484z0;
            } else if (z8 && !z7) {
                this.f3449h0 = this.f3410B0;
            } else if (z7) {
                this.f3449h0 = this.f3408A0;
            } else {
                this.f3449h0 = this.f3482y0;
            }
        }
        m1894c();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.f3459n;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            } else {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            }
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f3453k.m1349b(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f3453k.m1350c(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f3455l.m1379g(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3455l.f2453p.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3455l.f2453p.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f3455l.m1382j(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0620t c0620t = this.f3455l;
        TextInputLayout textInputLayout = c0620t.f2447j;
        CheckableImageButton checkableImageButton = c0620t.f2453p;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC0622v.m1389a(textInputLayout, checkableImageButton, c0620t.f2457t, c0620t.f2458u);
            AbstractC0622v.m1398j(textInputLayout, checkableImageButton, c0620t.f2457t);
        }
    }
}
