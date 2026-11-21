package p023c4;

import p005a4.C0096q;
import p005a4.InterfaceC0080f0;
import p178u4.C2474i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c4.f */
/* loaded from: classes.dex */
public final class C0642f extends C2474i {

    /* renamed from: d */
    public C0096q f2535d;

    @Override // p178u4.C2474i
    /* renamed from: b */
    public final int mo1425b(Object obj) {
        InterfaceC0080f0 interfaceC0080f0 = (InterfaceC0080f0) obj;
        if (interfaceC0080f0 == null) {
            return 1;
        }
        return interfaceC0080f0.mo306c();
    }

    @Override // p178u4.C2474i
    /* renamed from: c */
    public final void mo1426c(Object obj, Object obj2) {
        InterfaceC0080f0 interfaceC0080f0 = (InterfaceC0080f0) obj2;
        C0096q c0096q = this.f2535d;
        if (c0096q == null || interfaceC0080f0 == null) {
            return;
        }
        c0096q.f450e.m327e(interfaceC0080f0, true);
    }
}
