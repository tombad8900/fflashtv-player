package p042e5;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.util.ArrayList;
import p130p.C2192k;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e5.b */
/* loaded from: classes.dex */
public final class C0911b {

    /* renamed from: a */
    public final C2192k f3960a = new C2192k(0);

    /* renamed from: b */
    public final C2192k f3961b = new C2192k(0);

    /* renamed from: a */
    public static C0911b m2080a(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return m2081b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return m2081b(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: b */
    public static C0911b m2081b(ArrayList arrayList) {
        C0911b c0911b = new C0911b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c0911b.f3961b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            C0912c c0912c = new C0912c();
            c0912c.f3965d = 0;
            c0912c.f3966e = 1;
            c0912c.f3962a = startDelay;
            c0912c.f3963b = duration;
            c0912c.f3964c = interpolator;
            c0912c.f3965d = objectAnimator.getRepeatCount();
            c0912c.f3966e = objectAnimator.getRepeatMode();
            c0911b.f3960a.put(propertyName, c0912c);
        }
        return c0911b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0911b) {
            return this.f3960a.equals(((C0911b) obj).f3960a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3960a.hashCode();
    }

    public final String toString() {
        return "\n" + C0911b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f3960a + "}\n";
    }
}
