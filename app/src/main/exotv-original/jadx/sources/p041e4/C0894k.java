package p041e4;

import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.k */
/* loaded from: classes.dex */
public final class C0894k {

    /* renamed from: a */
    public final String f3919a;

    public C0894k(String str) {
        this.f3919a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0894k) {
            return this.f3919a.equals(((C0894k) obj).f3919a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3919a.hashCode();
    }

    public final String toString() {
        return AbstractC0008a1.m18n(new StringBuilder("StringHeaderFactory{value='"), this.f3919a, "'}");
    }
}
