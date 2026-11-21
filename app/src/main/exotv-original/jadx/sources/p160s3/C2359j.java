package p160s3;

import android.view.ViewTreeObserver;
import p102l6.C1693j;
import p212y6.InterfaceC2851l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s3.j */
/* loaded from: classes.dex */
public final class C2359j implements InterfaceC2851l {

    /* renamed from: j */
    public final /* synthetic */ C2355f f8272j;

    /* renamed from: k */
    public final /* synthetic */ ViewTreeObserver f8273k;

    /* renamed from: l */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC2360k f8274l;

    public C2359j(C2355f c2355f, ViewTreeObserver viewTreeObserver, ViewTreeObserverOnPreDrawListenerC2360k viewTreeObserverOnPreDrawListenerC2360k) {
        this.f8272j = c2355f;
        this.f8273k = viewTreeObserver;
        this.f8274l = viewTreeObserverOnPreDrawListenerC2360k;
    }

    @Override // p212y6.InterfaceC2851l
    public final Object invoke(Object obj) {
        ViewTreeObserver viewTreeObserver = this.f8273k;
        boolean zIsAlive = viewTreeObserver.isAlive();
        ViewTreeObserverOnPreDrawListenerC2360k viewTreeObserverOnPreDrawListenerC2360k = this.f8274l;
        if (zIsAlive) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2360k);
        } else {
            this.f8272j.f8265a.getViewTreeObserver().removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2360k);
        }
        return C1693j.f6497a;
    }
}
