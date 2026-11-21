package p017b6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.exotv.net.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import okhttp3.C2181z;
import p042e5.AbstractC0910a;
import p104m.C1780w0;
import p168t2.AbstractC2429w;
import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.x */
/* loaded from: classes.dex */
public final class C0624x {

    /* renamed from: A */
    public ColorStateList f2473A;

    /* renamed from: B */
    public Typeface f2474B;

    /* renamed from: a */
    public final int f2475a;

    /* renamed from: b */
    public final int f2476b;

    /* renamed from: c */
    public final int f2477c;

    /* renamed from: d */
    public final TimeInterpolator f2478d;

    /* renamed from: e */
    public final TimeInterpolator f2479e;

    /* renamed from: f */
    public final TimeInterpolator f2480f;

    /* renamed from: g */
    public final Context f2481g;

    /* renamed from: h */
    public final TextInputLayout f2482h;

    /* renamed from: i */
    public LinearLayout f2483i;

    /* renamed from: j */
    public int f2484j;

    /* renamed from: k */
    public FrameLayout f2485k;

    /* renamed from: l */
    public AnimatorSet f2486l;

    /* renamed from: m */
    public final float f2487m;

    /* renamed from: n */
    public int f2488n;

    /* renamed from: o */
    public int f2489o;

    /* renamed from: p */
    public CharSequence f2490p;

    /* renamed from: q */
    public boolean f2491q;

    /* renamed from: r */
    public C1780w0 f2492r;

    /* renamed from: s */
    public CharSequence f2493s;

    /* renamed from: t */
    public int f2494t;

    /* renamed from: u */
    public int f2495u;

    /* renamed from: v */
    public ColorStateList f2496v;

    /* renamed from: w */
    public CharSequence f2497w;

    /* renamed from: x */
    public boolean f2498x;

    /* renamed from: y */
    public C1780w0 f2499y;

    /* renamed from: z */
    public int f2500z;

    public C0624x(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f2481g = context;
        this.f2482h = textInputLayout;
        this.f2487m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f2475a = AbstractC2436a.m4342q(context, R.attr.motionDurationShort4, 217);
        this.f2476b = AbstractC2436a.m4342q(context, R.attr.motionDurationMedium4, 167);
        this.f2477c = AbstractC2436a.m4342q(context, R.attr.motionDurationShort4, 167);
        this.f2478d = AbstractC2436a.m4343r(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0910a.f3959d);
        LinearInterpolator linearInterpolator = AbstractC0910a.f3956a;
        this.f2479e = AbstractC2436a.m4343r(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f2480f = AbstractC2436a.m4343r(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* renamed from: a */
    public final void m1408a(C1780w0 c1780w0, int i) {
        if (this.f2483i == null && this.f2485k == null) {
            Context context = this.f2481g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f2483i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f2483i;
            TextInputLayout textInputLayout = this.f2482h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f2485k = new FrameLayout(context);
            this.f2483i.addView(this.f2485k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m1409b();
            }
        }
        if (i == 0 || i == 1) {
            this.f2485k.setVisibility(0);
            this.f2485k.addView(c1780w0);
        } else {
            this.f2483i.addView(c1780w0, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f2483i.setVisibility(0);
        this.f2484j++;
    }

    /* renamed from: b */
    public final void m1409b() {
        if (this.f2483i != null) {
            TextInputLayout textInputLayout = this.f2482h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f2481g;
                boolean zM4307l = AbstractC2429w.m4307l(context);
                LinearLayout linearLayout = this.f2483i;
                int paddingStart = editText.getPaddingStart();
                if (zM4307l) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM4307l) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zM4307l) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* renamed from: c */
    public final void m1410c() {
        AnimatorSet animatorSet = this.f2486l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: d */
    public final void m1411d(ArrayList arrayList, boolean z7, C1780w0 c1780w0, int i, int i4, int i8) {
        if (c1780w0 == null || !z7) {
            return;
        }
        if (i == i8 || i == i4) {
            boolean z8 = i8 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1780w0, (Property<C1780w0, Float>) View.ALPHA, z8 ? 1.0f : 0.0f);
            int i9 = this.f2477c;
            objectAnimatorOfFloat.setDuration(z8 ? this.f2476b : i9);
            objectAnimatorOfFloat.setInterpolator(z8 ? this.f2479e : this.f2480f);
            if (i == i8 && i4 != 0) {
                objectAnimatorOfFloat.setStartDelay(i9);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i8 != i || i4 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1780w0, (Property<C1780w0, Float>) View.TRANSLATION_Y, -this.f2487m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f2475a);
            objectAnimatorOfFloat2.setInterpolator(this.f2478d);
            objectAnimatorOfFloat2.setStartDelay(i9);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    /* renamed from: e */
    public final TextView m1412e(int i) {
        if (i == 1) {
            return this.f2492r;
        }
        if (i != 2) {
            return null;
        }
        return this.f2499y;
    }

    /* renamed from: f */
    public final void m1413f() {
        this.f2490p = null;
        m1410c();
        if (this.f2488n == 1) {
            if (!this.f2498x || TextUtils.isEmpty(this.f2497w)) {
                this.f2489o = 0;
            } else {
                this.f2489o = 2;
            }
        }
        m1416i(this.f2488n, this.f2489o, m1415h(this.f2492r, C2181z.FRAGMENT_ENCODE_SET));
    }

    /* renamed from: g */
    public final void m1414g(C1780w0 c1780w0, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f2483i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f2485k) != null) {
            frameLayout.removeView(c1780w0);
        } else {
            linearLayout.removeView(c1780w0);
        }
        int i4 = this.f2484j - 1;
        this.f2484j = i4;
        LinearLayout linearLayout2 = this.f2483i;
        if (i4 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final boolean m1415h(C1780w0 c1780w0, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f2482h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f2489o == this.f2488n && c1780w0 != null && TextUtils.equals(c1780w0.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m1416i(int i, int i4, boolean z7) {
        TextView textViewM1412e;
        TextView textViewM1412e2;
        C0624x c0624x = this;
        if (i == i4) {
            return;
        }
        if (z7) {
            AnimatorSet animatorSet = new AnimatorSet();
            c0624x.f2486l = animatorSet;
            ArrayList arrayList = new ArrayList();
            c0624x.m1411d(arrayList, c0624x.f2498x, c0624x.f2499y, 2, i, i4);
            c0624x.m1411d(arrayList, c0624x.f2491q, c0624x.f2492r, 1, i, i4);
            int size = arrayList.size();
            long jMax = 0;
            for (int i8 = 0; i8 < size; i8++) {
                Animator animator = (Animator) arrayList.get(i8);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            C0623w c0623w = new C0623w(this, i4, m1412e(i), i, c0624x.m1412e(i4));
            c0624x = this;
            animatorSet.addListener(c0623w);
            animatorSet.start();
        } else if (i != i4) {
            if (i4 != 0 && (textViewM1412e2 = c0624x.m1412e(i4)) != null) {
                textViewM1412e2.setVisibility(0);
                textViewM1412e2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewM1412e = m1412e(i)) != null) {
                textViewM1412e.setVisibility(4);
                if (i == 1) {
                    textViewM1412e.setText((CharSequence) null);
                }
            }
            c0624x.f2488n = i4;
        }
        TextInputLayout textInputLayout = c0624x.f2482h;
        textInputLayout.m1910t();
        textInputLayout.m1913w(z7, false);
        textInputLayout.m1916z();
    }
}
