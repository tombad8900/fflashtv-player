package p118n4;

import android.view.View;
import android.view.ViewTreeObserver;
import p085j6.RunnableC1527q;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n4.d */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC2007d implements ViewTreeObserver.OnDrawListener {

    /* renamed from: j */
    public final /* synthetic */ View f7428j;

    /* renamed from: k */
    public final /* synthetic */ C2008e f7429k;

    public ViewTreeObserverOnDrawListenerC2007d(C2008e c2008e, View view) {
        this.f7429k = c2008e;
        this.f7428j = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        AbstractC2478m.m4458f().post(new RunnableC1527q(this, this, 11, false));
    }
}
