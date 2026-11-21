package p095l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import p104m.C1737k0;
import p104m.C1749n0;
import p104m.C1781w1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.d */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1615d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: j */
    public final /* synthetic */ int f6129j;

    /* renamed from: k */
    public final /* synthetic */ Object f6130k;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1615d(int i, Object obj) {
        this.f6129j = i;
        this.f6130k = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f6129j) {
            case 0:
                ViewOnKeyListenerC1621g viewOnKeyListenerC1621g = (ViewOnKeyListenerC1621g) this.f6130k;
                ArrayList arrayList = viewOnKeyListenerC1621g.f6178r;
                if (viewOnKeyListenerC1621g.mo3274a() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((C1619f) arrayList.get(0)).f6156a.f6759H) {
                        View view = viewOnKeyListenerC1621g.f6185y;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                ((C1619f) obj).f6156a.mo3275f();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC1621g.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC1618e0 viewOnKeyListenerC1618e0 = (ViewOnKeyListenerC1618e0) this.f6130k;
                C1781w1 c1781w1 = viewOnKeyListenerC1618e0.f6147r;
                if (viewOnKeyListenerC1618e0.mo3274a() && !c1781w1.f6759H) {
                    View view2 = viewOnKeyListenerC1618e0.f6152w;
                    if (view2 != null && view2.isShown()) {
                        c1781w1.mo3275f();
                        break;
                    } else {
                        viewOnKeyListenerC1618e0.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                C1749n0 c1749n0 = (C1749n0) this.f6130k;
                if (!c1749n0.getInternalPopup().mo3400a()) {
                    c1749n0.f6655o.mo3409m(c1749n0.getTextDirection(), c1749n0.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c1749n0.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C1737k0 c1737k0 = (C1737k0) this.f6130k;
                C1749n0 c1749n02 = c1737k0.f6611P;
                c1737k0.getClass();
                if (!c1749n02.isAttachedToWindow() || !c1749n02.getGlobalVisibleRect(c1737k0.f6609N)) {
                    c1737k0.dismiss();
                    break;
                } else {
                    c1737k0.m3418s();
                    c1737k0.mo3275f();
                    break;
                }
                break;
        }
    }
}
