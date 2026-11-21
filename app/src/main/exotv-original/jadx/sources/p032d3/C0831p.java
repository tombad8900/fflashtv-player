package p032d3;

import java.util.ArrayList;
import p130p.C2186e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.p */
/* loaded from: classes.dex */
public final class C0831p extends AbstractC0830o {

    /* renamed from: a */
    public final /* synthetic */ C2186e f3707a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0832q f3708b;

    public C0831p(ViewTreeObserverOnPreDrawListenerC0832q viewTreeObserverOnPreDrawListenerC0832q, C2186e c2186e) {
        this.f3708b = viewTreeObserverOnPreDrawListenerC0832q;
        this.f3707a = c2186e;
    }

    @Override // p032d3.InterfaceC0827l
    /* renamed from: d */
    public final void mo1973d(AbstractC0829n abstractC0829n) {
        ((ArrayList) this.f3707a.get(this.f3708b.f3710k)).remove(abstractC0829n);
        abstractC0829n.mo1962w(this);
    }
}
