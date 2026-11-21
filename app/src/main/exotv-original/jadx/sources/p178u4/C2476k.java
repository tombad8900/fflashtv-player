package p178u4;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u4.k */
/* loaded from: classes.dex */
public final class C2476k {

    /* renamed from: a */
    public Class f9065a;

    /* renamed from: b */
    public Class f9066b;

    /* renamed from: c */
    public Class f9067c;

    public C2476k(Class cls, Class cls2, Class cls3) {
        this.f9065a = cls;
        this.f9066b = cls2;
        this.f9067c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2476k.class != obj.getClass()) {
            return false;
        }
        C2476k c2476k = (C2476k) obj;
        return this.f9065a.equals(c2476k.f9065a) && this.f9066b.equals(c2476k.f9066b) && AbstractC2478m.m4454b(this.f9067c, c2476k.f9067c);
    }

    public final int hashCode() {
        int iHashCode = (this.f9066b.hashCode() + (this.f9065a.hashCode() * 31)) * 31;
        Class cls = this.f9067c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f9065a + ", second=" + this.f9066b + '}';
    }
}
