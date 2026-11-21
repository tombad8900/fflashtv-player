package p063h1;

import p005a4.C0088j0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.o */
/* loaded from: classes.dex */
public final class C1124o {

    /* renamed from: a */
    public final Object f4767a;

    /* renamed from: b */
    public C0088j0 f4768b = new C0088j0(1);

    /* renamed from: c */
    public boolean f4769c;

    /* renamed from: d */
    public boolean f4770d;

    public C1124o(Object obj) {
        this.f4767a = obj;
    }

    /* renamed from: a */
    public final void m2468a(InterfaceC1123n interfaceC1123n) {
        this.f4770d = true;
        if (this.f4769c) {
            this.f4769c = false;
            interfaceC1123n.mo648c(this.f4767a, this.f4768b.m324b());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1124o.class != obj.getClass()) {
            return false;
        }
        return this.f4767a.equals(((C1124o) obj).f4767a);
    }

    public final int hashCode() {
        return this.f4767a.hashCode();
    }
}
