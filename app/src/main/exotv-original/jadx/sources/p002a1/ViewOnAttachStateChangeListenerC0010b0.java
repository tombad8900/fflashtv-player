package p002a1;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.b0 */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0010b0 implements View.OnAttachStateChangeListener {

    /* renamed from: j */
    public final /* synthetic */ C0049u0 f48j;

    /* renamed from: k */
    public final /* synthetic */ LayoutInflaterFactory2C0013c0 f49k;

    public ViewOnAttachStateChangeListenerC0010b0(LayoutInflaterFactory2C0013c0 layoutInflaterFactory2C0013c0, C0049u0 c0049u0) {
        this.f49k = layoutInflaterFactory2C0013c0;
        this.f48j = c0049u0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C0049u0 c0049u0 = this.f48j;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0049u0.f205c;
        c0049u0.m210k();
        C0030l.m99f((ViewGroup) abstractComponentCallbacksC0050v.f222N.getParent(), this.f49k.f52j.m115E()).m104e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
