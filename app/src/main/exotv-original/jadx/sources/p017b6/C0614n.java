package p017b6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.ArrayList;
import p032d3.AbstractC0829n;
import p040e3.C0868f;
import p101l5.C1681a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.n */
/* loaded from: classes.dex */
public final class C0614n extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f2418a;

    /* renamed from: b */
    public final /* synthetic */ Object f2419b;

    public /* synthetic */ C0614n(int i, Object obj) {
        this.f2418a = i;
        this.f2419b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2418a) {
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2419b;
                actionBarOverlayLayout.f687I = null;
                actionBarOverlayLayout.f702s = false;
                break;
            case 4:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) this.f2419b;
                focusRingDrawable.f3351t = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2418a) {
            case 0:
                C0615o c0615o = (C0615o) this.f2419b;
                c0615o.m1388p();
                c0615o.f2433r.start();
                break;
            case 1:
                ((AbstractC0829n) this.f2419b).m1996l();
                animator.removeListener(this);
                break;
            case 2:
                C0868f c0868f = (C0868f) this.f2419b;
                ArrayList arrayList = new ArrayList(c0868f.f3816n);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C1681a) arrayList.get(i)).f6459b.f6482x;
                    if (colorStateList != null) {
                        c0868f.setTintList(colorStateList);
                    }
                }
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2419b;
                actionBarOverlayLayout.f687I = null;
                actionBarOverlayLayout.f702s = false;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2418a) {
            case 2:
                C0868f c0868f = (C0868f) this.f2419b;
                ArrayList arrayList = new ArrayList(c0868f.f3816n);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C1681a) arrayList.get(i)).m3380a(c0868f);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
