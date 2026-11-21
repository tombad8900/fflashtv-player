package p017b6;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.RunnableC0127c0;
import com.exotv.net.R;
import com.google.android.material.internal.CheckableImageButton;
import p042e5.AbstractC0910a;
import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.e */
/* loaded from: classes.dex */
public final class C0599e extends AbstractC0621u {

    /* renamed from: e */
    public final int f2393e;

    /* renamed from: f */
    public final int f2394f;

    /* renamed from: g */
    public final TimeInterpolator f2395g;

    /* renamed from: h */
    public final TimeInterpolator f2396h;

    /* renamed from: i */
    public EditText f2397i;

    /* renamed from: j */
    public final ViewOnClickListenerC0591a f2398j;

    /* renamed from: k */
    public final ViewOnFocusChangeListenerC0593b f2399k;

    /* renamed from: l */
    public AnimatorSet f2400l;

    /* renamed from: m */
    public ValueAnimator f2401m;

    public C0599e(C0620t c0620t) {
        super(c0620t);
        this.f2398j = new ViewOnClickListenerC0591a(0, this);
        this.f2399k = new ViewOnFocusChangeListenerC0593b(0, this);
        this.f2393e = AbstractC2436a.m4342q(c0620t.getContext(), R.attr.motionDurationShort3, 100);
        this.f2394f = AbstractC2436a.m4342q(c0620t.getContext(), R.attr.motionDurationShort3, 150);
        this.f2395g = AbstractC2436a.m4343r(c0620t.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0910a.f3956a);
        this.f2396h = AbstractC2436a.m4343r(c0620t.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0910a.f3959d);
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: a */
    public final void mo1354a() {
        if (this.f2465b.f2462y != null) {
            return;
        }
        m1358s(m1359t());
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: c */
    public final int mo1340c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: d */
    public final int mo1341d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: e */
    public final View.OnFocusChangeListener mo1355e() {
        return this.f2399k;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: f */
    public final View.OnClickListener mo1342f() {
        return this.f2398j;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: g */
    public final View.OnFocusChangeListener mo1356g() {
        return this.f2399k;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: l */
    public final void mo1345l(EditText editText) {
        this.f2397i = editText;
        this.f2464a.setEndIconVisible(m1359t());
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: o */
    public final void mo1357o(boolean z7) {
        if (this.f2465b.f2462y == null) {
            return;
        }
        m1358s(z7);
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: q */
    public final void mo1346q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f2396h);
        valueAnimatorOfFloat.setDuration(this.f2394f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: b6.c

            /* renamed from: b */
            public final /* synthetic */ C0599e f2377b;

            {
                this.f2377b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0599e c0599e = this.f2377b;
                        c0599e.getClass();
                        c0599e.f2467d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0599e c0599e2 = this.f2377b;
                        c0599e2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0599e2.f2467d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2395g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i4 = this.f2393e;
        valueAnimatorOfFloat2.setDuration(i4);
        final int i8 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: b6.c

            /* renamed from: b */
            public final /* synthetic */ C0599e f2377b;

            {
                this.f2377b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i8) {
                    case 0:
                        C0599e c0599e = this.f2377b;
                        c0599e.getClass();
                        c0599e.f2467d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0599e c0599e2 = this.f2377b;
                        c0599e2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0599e2.f2467d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2400l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f2400l.addListener(new C0597d(this, i8));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i4);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: b6.c

            /* renamed from: b */
            public final /* synthetic */ C0599e f2377b;

            {
                this.f2377b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i8) {
                    case 0:
                        C0599e c0599e = this.f2377b;
                        c0599e.getClass();
                        c0599e.f2467d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0599e c0599e2 = this.f2377b;
                        c0599e2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0599e2.f2467d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f2401m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new C0597d(this, i));
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: r */
    public final void mo1347r() {
        EditText editText = this.f2397i;
        if (editText != null) {
            editText.post(new RunnableC0127c0(8, this));
        }
    }

    /* renamed from: s */
    public final void m1358s(boolean z7) {
        boolean z8 = this.f2465b.m1376d() == z7;
        if (z7 && !this.f2400l.isRunning()) {
            this.f2401m.cancel();
            this.f2400l.start();
            if (z8) {
                this.f2400l.end();
                return;
            }
            return;
        }
        if (z7) {
            return;
        }
        this.f2400l.cancel();
        this.f2401m.start();
        if (z8) {
            this.f2401m.end();
        }
    }

    /* renamed from: t */
    public final boolean m1359t() {
        EditText editText = this.f2397i;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.f2467d.hasFocus()) && ((this.f2397i.getText().length() > 0) || (this.f2465b.f2462y != null));
    }
}
