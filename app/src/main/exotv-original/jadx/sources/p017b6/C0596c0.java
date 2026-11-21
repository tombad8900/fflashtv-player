package p017b6;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.media3.exoplayer.source.preload.C0456a;
import com.exotv.net.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import p005a4.C0073c;
import p104m.C1780w0;
import p162s5.AbstractC2374l;
import p168t2.AbstractC2429w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.c0 */
/* loaded from: classes.dex */
public final class C0596c0 extends LinearLayout {

    /* renamed from: j */
    public final TextInputLayout f2378j;

    /* renamed from: k */
    public final C1780w0 f2379k;

    /* renamed from: l */
    public CharSequence f2380l;

    /* renamed from: m */
    public final CheckableImageButton f2381m;

    /* renamed from: n */
    public ColorStateList f2382n;

    /* renamed from: o */
    public PorterDuff.Mode f2383o;

    /* renamed from: p */
    public int f2384p;

    /* renamed from: q */
    public ImageView.ScaleType f2385q;

    /* renamed from: r */
    public View.OnLongClickListener f2386r;

    /* renamed from: s */
    public boolean f2387s;

    public C0596c0(TextInputLayout textInputLayout, C0073c c0073c) {
        super(textInputLayout.getContext());
        this.f2378j = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f2381m = checkableImageButton;
        C1780w0 c1780w0 = new C1780w0(getContext(), null);
        this.f2379k = c1780w0;
        if (AbstractC2429w.m4307l(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f2386r;
        checkableImageButton.setOnClickListener(null);
        AbstractC0622v.m1401m(checkableImageButton, onLongClickListener);
        this.f2386r = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0622v.m1401m(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0073c.f325l;
        if (typedArray.hasValue(70)) {
            this.f2382n = AbstractC2429w.m4300e(getContext(), c0073c, 70);
        }
        if (typedArray.hasValue(71)) {
            this.f2383o = AbstractC2374l.m4216f(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            m1350c(c0073c.m299x(67));
            if (typedArray.hasValue(66)) {
                m1349b(typedArray.getText(66));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2384p) {
            this.f2384p = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeM1390b = AbstractC0622v.m1390b(typedArray.getInt(69, -1));
            this.f2385q = scaleTypeM1390b;
            checkableImageButton.setScaleType(scaleTypeM1390b);
        }
        c1780w0.setVisibility(8);
        c1780w0.setId(R.id.textinput_prefix_text);
        c1780w0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c1780w0.setAccessibilityLiveRegion(1);
        c1780w0.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            c1780w0.setTextColor(c0073c.m298w(62));
        }
        CharSequence text = typedArray.getText(60);
        this.f2380l = TextUtils.isEmpty(text) ? null : text;
        c1780w0.setText(text);
        m1353f();
        addView(checkableImageButton);
        addView(c1780w0);
        checkableImageButton.setOnFocusableChangedListener(new C0456a(4, this));
    }

    /* renamed from: a */
    public final int m1348a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f2381m;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f2379k.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* renamed from: b */
    public final void m1349b(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2381m;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            AbstractC0622v.m1407s(checkableImageButton, this.f2386r, charSequence);
        }
    }

    /* renamed from: c */
    public final void m1350c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f2381m;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f2382n;
            PorterDuff.Mode mode = this.f2383o;
            TextInputLayout textInputLayout = this.f2378j;
            AbstractC0622v.m1389a(textInputLayout, checkableImageButton, colorStateList, mode);
            m1351d(true);
            AbstractC0622v.m1398j(textInputLayout, checkableImageButton, this.f2382n);
            return;
        }
        m1351d(false);
        View.OnLongClickListener onLongClickListener = this.f2386r;
        checkableImageButton.setOnClickListener(null);
        AbstractC0622v.m1401m(checkableImageButton, onLongClickListener);
        this.f2386r = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0622v.m1401m(checkableImageButton, null);
        m1349b(null);
    }

    /* renamed from: d */
    public final void m1351d(boolean z7) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.f2381m;
        if ((checkableImageButton.getVisibility() == 0) != z7) {
            if (!z7 && checkableImageButton.hasFocus() && (editText = this.f2378j.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z7 ? 0 : 8);
            m1352e();
            m1353f();
        }
    }

    /* renamed from: e */
    public final void m1352e() {
        EditText editText = this.f2378j.f3459n;
        if (editText == null) {
            return;
        }
        this.f2379k.setPaddingRelative(this.f2381m.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    /* renamed from: f */
    public final void m1353f() {
        int i = (this.f2380l == null || this.f2387s) ? 8 : 0;
        setVisibility((this.f2381m.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f2379k.setVisibility(i);
        this.f2378j.m1909s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        m1352e();
    }
}
