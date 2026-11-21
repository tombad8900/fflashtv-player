package p118n4;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p062h.AbstractActivityC1083i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n4.e */
/* loaded from: classes.dex */
public final class C2008e implements InterfaceC2009f {

    /* renamed from: j */
    public final Set f7430j = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k */
    public volatile boolean f7431k;

    @Override // p118n4.InterfaceC2009f
    /* renamed from: e */
    public final void mo3258e(AbstractActivityC1083i abstractActivityC1083i) {
        if (!this.f7431k && this.f7430j.add(abstractActivityC1083i)) {
            View decorView = abstractActivityC1083i.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC2007d(this, decorView));
        }
    }
}
