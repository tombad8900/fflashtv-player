package p118n4;

import androidx.media3.p009ui.AspectRatioFrameLayout;
import p082j3.C1488a;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n4.n */
/* loaded from: classes.dex */
public final class RunnableC2017n implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f7442j = 1;

    /* renamed from: k */
    public boolean f7443k;

    /* renamed from: l */
    public final /* synthetic */ Object f7444l;

    public RunnableC2017n(C2018o c2018o, boolean z7) {
        this.f7444l = c2018o;
        this.f7443k = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7442j;
        Object obj = this.f7444l;
        switch (i) {
            case 0:
                boolean z7 = this.f7443k;
                AbstractC2478m.m4453a();
                C1488a c1488a = (C1488a) ((C2018o) obj).f7446b;
                boolean z8 = c1488a.f5721a;
                c1488a.f5721a = z7;
                if (z8 != z7) {
                    ((C2016m) c1488a.f5722b).mo1640a(z7);
                    break;
                }
                break;
            default:
                this.f7443k = false;
                int i4 = AspectRatioFrameLayout.f1923m;
                ((AspectRatioFrameLayout) obj).getClass();
                break;
        }
    }

    public RunnableC2017n(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f7444l = aspectRatioFrameLayout;
    }
}
