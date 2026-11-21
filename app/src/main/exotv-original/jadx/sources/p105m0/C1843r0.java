package p105m0;

import android.view.View;
import java.lang.ref.WeakReference;
import p032d3.C0825j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.r0 */
/* loaded from: classes.dex */
public final class C1843r0 {

    /* renamed from: a */
    public final WeakReference f6932a;

    public C1843r0(View view) {
        this.f6932a = new WeakReference(view);
    }

    /* renamed from: a */
    public final void m3615a(float f8) {
        View view = (View) this.f6932a.get();
        if (view != null) {
            view.animate().alpha(f8);
        }
    }

    /* renamed from: b */
    public final void m3616b() {
        View view = (View) this.f6932a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public final void m3617c(long j) {
        View view = (View) this.f6932a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* renamed from: d */
    public final void m3618d(InterfaceC1846s0 interfaceC1846s0) {
        View view = (View) this.f6932a.get();
        if (view != null) {
            if (interfaceC1846s0 != null) {
                view.animate().setListener(new C0825j(interfaceC1846s0, view, 3));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* renamed from: e */
    public final void m3619e(float f8) {
        View view = (View) this.f6932a.get();
        if (view != null) {
            view.animate().translationY(f8);
        }
    }
}
