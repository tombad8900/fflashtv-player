package p096l0;

import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l0.d */
/* loaded from: classes.dex */
public final class C1644d extends C1643c {

    /* renamed from: l */
    public final Object f6284l;

    public C1644d(int i) {
        super(i);
        this.f6284l = new Object();
    }

    @Override // p096l0.C1643c, p096l0.InterfaceC1642b
    public final Object acquire() {
        Object objAcquire;
        synchronized (this.f6284l) {
            objAcquire = super.acquire();
        }
        return objAcquire;
    }

    @Override // p096l0.C1643c, p096l0.InterfaceC1642b
    /* renamed from: g */
    public final boolean mo285g(Object obj) {
        boolean zMo285g;
        AbstractC2980h.m5136e("instance", obj);
        synchronized (this.f6284l) {
            zMo285g = super.mo285g(obj);
        }
        return zMo285g;
    }
}
