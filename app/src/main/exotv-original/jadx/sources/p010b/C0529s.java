package p010b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p212y6.InterfaceC2840a;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.s */
/* loaded from: classes.dex */
public final class C0529s implements OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC2851l f2168a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2851l f2169b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2840a f2170c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2840a f2171d;

    public C0529s(InterfaceC2851l interfaceC2851l, InterfaceC2851l interfaceC2851l2, InterfaceC2840a interfaceC2840a, InterfaceC2840a interfaceC2840a2) {
        this.f2168a = interfaceC2851l;
        this.f2169b = interfaceC2851l2;
        this.f2170c = interfaceC2840a;
        this.f2171d = interfaceC2840a2;
    }

    public final void onBackCancelled() {
        this.f2171d.invoke();
    }

    public final void onBackInvoked() {
        this.f2170c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC2980h.m5136e("backEvent", backEvent);
        this.f2169b.invoke(new C0512b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC2980h.m5136e("backEvent", backEvent);
        this.f2168a.invoke(new C0512b(backEvent));
    }
}
