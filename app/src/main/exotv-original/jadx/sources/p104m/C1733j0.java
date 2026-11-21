package p104m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p095l.ViewTreeObserverOnGlobalLayoutListenerC1615d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.j0 */
/* loaded from: classes.dex */
public final class C1733j0 implements PopupWindow.OnDismissListener {

    /* renamed from: j */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1615d f6580j;

    /* renamed from: k */
    public final /* synthetic */ C1737k0 f6581k;

    public C1733j0(C1737k0 c1737k0, ViewTreeObserverOnGlobalLayoutListenerC1615d viewTreeObserverOnGlobalLayoutListenerC1615d) {
        this.f6581k = c1737k0;
        this.f6580j = viewTreeObserverOnGlobalLayoutListenerC1615d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f6581k.f6611P.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f6580j);
        }
    }
}
