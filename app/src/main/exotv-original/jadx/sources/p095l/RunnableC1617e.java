package p095l;

import android.animation.ValueAnimator;
import android.view.View;
import p002a1.C0016e;
import p002a1.C0036o;
import p105m0.C1796b1;
import p105m0.C1858w0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.e */
/* loaded from: classes.dex */
public final class RunnableC1617e implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f6131j = 0;

    /* renamed from: k */
    public final /* synthetic */ Object f6132k;

    /* renamed from: l */
    public final /* synthetic */ Object f6133l;

    /* renamed from: m */
    public final /* synthetic */ Object f6134m;

    /* renamed from: n */
    public final /* synthetic */ Object f6135n;

    public RunnableC1617e(C0036o c0036o, C1619f c1619f, C1630p c1630p, MenuC1627m menuC1627m) {
        this.f6135n = c0036o;
        this.f6132k = c1619f;
        this.f6133l = c1630p;
        this.f6134m = menuC1627m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6131j) {
            case 0:
                ViewOnKeyListenerC1621g viewOnKeyListenerC1621g = (ViewOnKeyListenerC1621g) ((C0036o) this.f6135n).f143k;
                C1630p c1630p = (C1630p) this.f6133l;
                C1619f c1619f = (C1619f) this.f6132k;
                if (c1619f != null) {
                    viewOnKeyListenerC1621g.f6170J = true;
                    c1619f.f6157b.m3308c(false);
                    viewOnKeyListenerC1621g.f6170J = false;
                }
                if (c1630p.isEnabled() && c1630p.hasSubMenu()) {
                    ((MenuC1627m) this.f6134m).m3314q(c1630p, null, 4);
                    break;
                }
                break;
            default:
                C1858w0.m3647i((View) this.f6132k, (C1796b1) this.f6133l, (C0016e) this.f6134m);
                ((ValueAnimator) this.f6135n).start();
                break;
        }
    }

    public RunnableC1617e(View view, C1796b1 c1796b1, C0016e c0016e, ValueAnimator valueAnimator) {
        this.f6132k = view;
        this.f6133l = c1796b1;
        this.f6134m = c0016e;
        this.f6135n = valueAnimator;
    }
}
