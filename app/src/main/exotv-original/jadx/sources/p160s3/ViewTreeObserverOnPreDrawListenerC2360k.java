package p160s3;

import android.view.ViewTreeObserver;
import p076i7.C1295g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s3.k */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2360k implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: j */
    public boolean f8275j;

    /* renamed from: k */
    public final /* synthetic */ C2355f f8276k;

    /* renamed from: l */
    public final /* synthetic */ ViewTreeObserver f8277l;

    /* renamed from: m */
    public final /* synthetic */ C1295g f8278m;

    public ViewTreeObserverOnPreDrawListenerC2360k(C2355f c2355f, ViewTreeObserver viewTreeObserver, C1295g c1295g) {
        this.f8276k = c2355f;
        this.f8277l = viewTreeObserver;
        this.f8278m = c1295g;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C2355f c2355f = this.f8276k;
        C2357h c2357hM4191c = c2355f.m4191c();
        if (c2357hM4191c != null) {
            ViewTreeObserver viewTreeObserver = this.f8277l;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                c2355f.f8265a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f8275j) {
                this.f8275j = true;
                this.f8278m.mo2248d(c2357hM4191c);
            }
        }
        return true;
    }
}
