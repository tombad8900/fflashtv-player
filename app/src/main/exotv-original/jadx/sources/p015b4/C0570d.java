package p015b4;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b4.d */
/* loaded from: classes.dex */
public final class C0570d implements InterfaceC0574h {

    /* renamed from: a */
    public final C0571e f2279a;

    /* renamed from: b */
    public int f2280b;

    /* renamed from: c */
    public Class f2281c;

    public C0570d(C0571e c0571e) {
        this.f2279a = c0571e;
    }

    @Override // p015b4.InterfaceC0574h
    /* renamed from: a */
    public final void mo1315a() {
        this.f2279a.m570c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0570d) {
            C0570d c0570d = (C0570d) obj;
            if (this.f2280b == c0570d.f2280b && this.f2281c == c0570d.f2281c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f2280b * 31;
        Class cls = this.f2281c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f2280b + "array=" + this.f2281c + '}';
    }
}
