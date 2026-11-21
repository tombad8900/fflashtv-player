package p177u3;

import p005a4.C0094o;
import p073i3.EnumC1257f;
import p151r3.AbstractC2300l;
import p151r3.C2306r;
import p169t3.C2433a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u3.a */
/* loaded from: classes.dex */
public final class C2461a implements InterfaceC2464d {

    /* renamed from: b */
    public final int f9044b;

    public C2461a(int i) {
        this.f9044b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // p177u3.InterfaceC2464d
    /* renamed from: a */
    public final InterfaceC2465e mo4438a(C2433a c2433a, AbstractC2300l abstractC2300l) {
        return !(abstractC2300l instanceof C2306r) ? new C2463c(c2433a, abstractC2300l) : ((C2306r) abstractC2300l).f8074c == EnumC1257f.f5251j ? new C2463c(c2433a, abstractC2300l) : new C0094o(c2433a, abstractC2300l, this.f9044b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2461a) {
            return this.f9044b == ((C2461a) obj).f9044b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f9044b * 31);
    }
}
