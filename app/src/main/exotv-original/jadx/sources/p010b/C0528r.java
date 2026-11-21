package p010b;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.r */
/* loaded from: classes.dex */
public final class C0528r {

    /* renamed from: a */
    public static final C0528r f2167a = new C0528r();

    /* renamed from: a */
    public final OnBackInvokedCallback m1251a(InterfaceC2840a interfaceC2840a) {
        AbstractC2980h.m5136e("onBackInvoked", interfaceC2840a);
        return new C0527q(0, interfaceC2840a);
    }

    /* renamed from: b */
    public final void m1252b(Object obj, int i, Object obj2) {
        AbstractC2980h.m5136e("dispatcher", obj);
        AbstractC2980h.m5136e("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: c */
    public final void m1253c(Object obj, Object obj2) {
        AbstractC2980h.m5136e("dispatcher", obj);
        AbstractC2980h.m5136e("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
