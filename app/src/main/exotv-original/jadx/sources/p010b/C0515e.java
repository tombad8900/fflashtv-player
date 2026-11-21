package p010b;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0146m;
import androidx.lifecycle.InterfaceC0160t;
import androidx.lifecycle.InterfaceC0164v;
import p004a3.C0067e;
import p062h.AbstractActivityC1083i;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0515e implements InterfaceC0160t {

    /* renamed from: j */
    public final /* synthetic */ int f2118j;

    /* renamed from: k */
    public final /* synthetic */ Object f2119k;

    public /* synthetic */ C0515e(int i, Object obj) {
        this.f2118j = i;
        this.f2119k = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0160t
    /* renamed from: c */
    public final void mo249c(InterfaceC0164v interfaceC0164v, EnumC0146m enumC0146m) {
        Window window;
        View viewPeekDecorView;
        switch (this.f2118j) {
            case 0:
                AbstractActivityC1083i abstractActivityC1083i = (AbstractActivityC1083i) this.f2119k;
                if (enumC0146m == EnumC0146m.ON_STOP && (window = abstractActivityC1083i.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC1083i abstractActivityC1083i2 = (AbstractActivityC1083i) this.f2119k;
                if (enumC0146m == EnumC0146m.ON_DESTROY) {
                    abstractActivityC1083i2.f2138k.f444k = null;
                    if (!abstractActivityC1083i2.isChangingConfigurations()) {
                        abstractActivityC1083i2.mo222b().m581a();
                    }
                    ViewTreeObserverOnDrawListenerC0519i viewTreeObserverOnDrawListenerC0519i = abstractActivityC1083i2.f2142o;
                    AbstractActivityC1083i abstractActivityC1083i3 = viewTreeObserverOnDrawListenerC0519i.f2127m;
                    abstractActivityC1083i3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0519i);
                    abstractActivityC1083i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0519i);
                    break;
                }
                break;
            default:
                C0067e c0067e = (C0067e) this.f2119k;
                AbstractC2980h.m5136e("this$0", c0067e);
                if (enumC0146m != EnumC0146m.ON_START) {
                    if (enumC0146m == EnumC0146m.ON_STOP) {
                        c0067e.f308c = false;
                        break;
                    }
                } else {
                    c0067e.f308c = true;
                    break;
                }
                break;
        }
    }
}
