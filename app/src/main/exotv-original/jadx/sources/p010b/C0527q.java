package p010b;

import android.window.OnBackInvokedCallback;
import p062h.LayoutInflaterFactory2C1098x;
import p104m.RunnableC1715e2;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C0527q implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ int f2165a;

    /* renamed from: b */
    public final /* synthetic */ Object f2166b;

    public /* synthetic */ C0527q(int i, Object obj) {
        this.f2165a = i;
        this.f2166b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f2165a) {
            case 0:
                InterfaceC2840a interfaceC2840a = (InterfaceC2840a) this.f2166b;
                AbstractC2980h.m5136e("$onBackInvoked", interfaceC2840a);
                interfaceC2840a.invoke();
                break;
            case 1:
                ((LayoutInflaterFactory2C1098x) this.f2166b).m2325C();
                break;
            default:
                ((RunnableC1715e2) this.f2166b).run();
                break;
        }
    }
}
