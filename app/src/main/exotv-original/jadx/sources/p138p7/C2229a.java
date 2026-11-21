package p138p7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p024c5.C0654c1;
import p076i7.C1292f;
import p076i7.C1295g;
import p076i7.InterfaceC1289e;
import p076i7.InterfaceC1324p1;
import p102l6.C1693j;
import p112m7.C1943s;
import p137p6.InterfaceC2227h;
import p212y6.InterfaceC2856q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p7.a */
/* loaded from: classes.dex */
public final class C2229a implements InterfaceC1289e, InterfaceC1324p1 {

    /* renamed from: j */
    public final C1295g f7748j;

    /* renamed from: k */
    public final /* synthetic */ C2230b f7749k;

    public C2229a(C2230b c2230b, C1295g c1295g) {
        this.f7749k = c2230b;
        this.f7748j = c1295g;
    }

    @Override // p076i7.InterfaceC1324p1
    /* renamed from: b */
    public final void mo2801b(C2238j c2238j, int i) {
        this.f7748j.mo2801b(c2238j, i);
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: d */
    public final void mo2248d(Object obj) {
        this.f7748j.mo2248d(obj);
    }

    @Override // p076i7.InterfaceC1289e
    /* renamed from: e */
    public final C1943s mo2790e(InterfaceC2856q interfaceC2856q) {
        C2230b c2230b = this.f7749k;
        C1943s c1943sMo2790e = this.f7748j.mo2790e(new C1292f(c2230b, this));
        if (c1943sMo2790e != null) {
            C2230b.f7750h.set(c2230b, null);
        }
        return c1943sMo2790e;
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: f */
    public final InterfaceC2227h mo2249f() {
        return this.f7748j.f5323n;
    }

    @Override // p076i7.InterfaceC1289e
    /* renamed from: i */
    public final void mo2791i(C1292f c1292f) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2230b.f7750h;
        C2230b c2230b = this.f7749k;
        atomicReferenceFieldUpdater.set(c2230b, null);
        C0654c1 c0654c1 = new C0654c1(c2230b, this);
        C1295g c1295g = this.f7748j;
        c1295g.m2798D(C1693j.f6497a, c1295g.f5315l, new C1292f(0, c0654c1));
    }

    @Override // p076i7.InterfaceC1289e
    /* renamed from: j */
    public final void mo2792j(Object obj) {
        this.f7748j.mo2792j(obj);
    }
}
