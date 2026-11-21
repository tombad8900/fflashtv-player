package p193w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.s */
/* loaded from: classes.dex */
public final class C2631s extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f9565a;

    /* renamed from: b */
    public final /* synthetic */ C2627o f9566b;

    /* renamed from: c */
    public final /* synthetic */ C2632t f9567c;

    public /* synthetic */ C2631s(C2632t c2632t, C2627o c2627o, int i) {
        this.f9565a = i;
        this.f9567c = c2632t;
        this.f9566b = c2627o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9565a) {
            case 0:
                C2632t c2632t = this.f9567c;
                c2632t.m4730i(1);
                if (c2632t.f9569B) {
                    this.f9566b.post(c2632t.f9589s);
                    c2632t.f9569B = false;
                    break;
                }
                break;
            case 1:
                C2632t c2632t2 = this.f9567c;
                c2632t2.m4730i(2);
                if (c2632t2.f9569B) {
                    this.f9566b.post(c2632t2.f9589s);
                    c2632t2.f9569B = false;
                    break;
                }
                break;
            default:
                C2632t c2632t3 = this.f9567c;
                c2632t3.m4730i(2);
                if (c2632t3.f9569B) {
                    this.f9566b.post(c2632t3.f9589s);
                    c2632t3.f9569B = false;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f9565a) {
            case 0:
                this.f9567c.m4730i(3);
                break;
            case 1:
                this.f9567c.m4730i(3);
                break;
            default:
                this.f9567c.m4730i(3);
                break;
        }
    }
}
