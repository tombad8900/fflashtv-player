package p010b;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0146m;
import androidx.lifecycle.InterfaceC0160t;
import androidx.lifecycle.InterfaceC0164v;
import p062h.AbstractActivityC1083i;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0516f implements InterfaceC0160t {

    /* renamed from: j */
    public final /* synthetic */ C0534x f2120j;

    /* renamed from: k */
    public final /* synthetic */ AbstractActivityC1083i f2121k;

    public /* synthetic */ C0516f(C0534x c0534x, AbstractActivityC1083i abstractActivityC1083i) {
        this.f2120j = c0534x;
        this.f2121k = abstractActivityC1083i;
    }

    @Override // androidx.lifecycle.InterfaceC0160t
    /* renamed from: c */
    public final void mo249c(InterfaceC0164v interfaceC0164v, EnumC0146m enumC0146m) {
        if (enumC0146m == EnumC0146m.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM1241a = C0517g.f2122a.m1241a(this.f2121k);
            AbstractC2980h.m5136e("invoker", onBackInvokedDispatcherM1241a);
            C0534x c0534x = this.f2120j;
            c0534x.f2184e = onBackInvokedDispatcherM1241a;
            c0534x.m1258d(c0534x.f2186g);
        }
    }
}
