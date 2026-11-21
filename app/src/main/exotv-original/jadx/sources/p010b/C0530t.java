package p010b;

import android.window.OnBackInvokedCallback;
import p212y6.InterfaceC2840a;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.t */
/* loaded from: classes.dex */
public final class C0530t {

    /* renamed from: a */
    public static final C0530t f2172a = new C0530t();

    /* renamed from: a */
    public final OnBackInvokedCallback m1254a(InterfaceC2851l interfaceC2851l, InterfaceC2851l interfaceC2851l2, InterfaceC2840a interfaceC2840a, InterfaceC2840a interfaceC2840a2) {
        AbstractC2980h.m5136e("onBackStarted", interfaceC2851l);
        AbstractC2980h.m5136e("onBackProgressed", interfaceC2851l2);
        AbstractC2980h.m5136e("onBackInvoked", interfaceC2840a);
        AbstractC2980h.m5136e("onBackCancelled", interfaceC2840a2);
        return new C0529s(interfaceC2851l, interfaceC2851l2, interfaceC2840a, interfaceC2840a2);
    }
}
