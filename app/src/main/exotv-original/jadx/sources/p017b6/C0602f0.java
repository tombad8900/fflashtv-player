package p017b6;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import p211y5.C2821h;
import p211y5.C2823j;
import p216z2.C2895j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.f0 */
/* loaded from: classes.dex */
public final class C0602f0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f2404a;

    /* renamed from: b */
    public final /* synthetic */ Object f2405b;

    public /* synthetic */ C0602f0(int i, Object obj) {
        this.f2404a = i;
        this.f2405b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2404a) {
            case 0:
                ((TextInputLayout) this.f2405b).f3418F0.m4204m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C2823j c2823j = ((BottomSheetBehavior) this.f2405b).f3134j;
                if (c2823j != null) {
                    C2821h c2821h = c2823j.f10492k;
                    if (c2821h.f10467i != fFloatValue) {
                        c2821h.f10467i = fFloatValue;
                        c2823j.f10496o = true;
                        c2823j.f10497p = true;
                        c2823j.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C2895j c2895j = (C2895j) this.f2405b;
                c2895j.f10714c.setAlpha(iFloatValue);
                c2895j.f10715d.setAlpha(iFloatValue);
                c2895j.f10730s.invalidate();
                break;
        }
    }
}
