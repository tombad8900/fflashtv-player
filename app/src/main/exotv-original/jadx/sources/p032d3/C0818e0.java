package p032d3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.AbstractC0714c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.e0 */
/* loaded from: classes.dex */
public final class C0818e0 extends AnimatorListenerAdapter implements InterfaceC0827l {

    /* renamed from: a */
    public final View f3640a;

    /* renamed from: b */
    public final int f3641b;

    /* renamed from: c */
    public final ViewGroup f3642c;

    /* renamed from: e */
    public boolean f3644e;

    /* renamed from: f */
    public boolean f3645f = false;

    /* renamed from: d */
    public final boolean f3643d = true;

    public C0818e0(View view, int i) {
        this.f3640a = view;
        this.f3641b = i;
        this.f3642c = (ViewGroup) view.getParent();
        m1976g(true);
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: a */
    public final void mo1971a() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        m1976g(false);
        if (this.f3645f) {
            return;
        }
        AbstractC0839x.m2008b(this.f3640a, this.f3641b);
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: b */
    public final void mo1972b(AbstractC0829n abstractC0829n) {
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: c */
    public final void mo1975c(AbstractC0829n abstractC0829n) {
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: d */
    public final void mo1973d(AbstractC0829n abstractC0829n) {
        abstractC0829n.mo1962w(this);
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: f */
    public final void mo1974f() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        m1976g(true);
        if (this.f3645f) {
            return;
        }
        AbstractC0839x.m2008b(this.f3640a, 0);
    }

    /* renamed from: g */
    public final void m1976g(boolean z7) {
        ViewGroup viewGroup;
        if (!this.f3643d || this.f3644e == z7 || (viewGroup = this.f3642c) == null) {
            return;
        }
        this.f3644e = z7;
        AbstractC0714c.m1514c0(viewGroup, z7);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3645f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f3645f) {
            AbstractC0839x.m2008b(this.f3640a, this.f3641b);
            ViewGroup viewGroup = this.f3642c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m1976g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z7) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z7) {
            AbstractC0839x.m2008b(this.f3640a, 0);
            ViewGroup viewGroup = this.f3642c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z7) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z7) {
            return;
        }
        if (!this.f3645f) {
            AbstractC0839x.m2008b(this.f3640a, this.f3641b);
            ViewGroup viewGroup = this.f3642c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m1976g(false);
    }
}
