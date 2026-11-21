package p220z6;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z6.j */
/* loaded from: classes.dex */
public final class C2982j implements InterfaceC2975c {

    /* renamed from: a */
    public final Class f11113a;

    public C2982j(Class cls) {
        this.f11113a = cls;
    }

    @Override // p220z6.InterfaceC2975c
    /* renamed from: a */
    public final Class mo5130a() {
        return this.f11113a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2982j) {
            return AbstractC2980h.m5132a(this.f11113a, ((C2982j) obj).f11113a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11113a.hashCode();
    }

    public final String toString() {
        return this.f11113a + " (Kotlin reflection is not available)";
    }
}
