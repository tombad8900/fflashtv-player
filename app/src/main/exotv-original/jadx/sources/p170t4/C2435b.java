package p170t4;

import java.security.MessageDigest;
import p178u4.AbstractC2470e;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t4.b */
/* loaded from: classes.dex */
public final class C2435b implements InterfaceC2801e {

    /* renamed from: b */
    public final Object f8788b;

    public C2435b(Object obj) {
        AbstractC2470e.m4446c("Argument must not be null", obj);
        this.f8788b = obj;
    }

    @Override // p210y3.InterfaceC2801e
    /* renamed from: a */
    public final void mo309a(MessageDigest messageDigest) {
        messageDigest.update(this.f8788b.toString().getBytes(InterfaceC2801e.f10418a));
    }

    @Override // p210y3.InterfaceC2801e
    public final boolean equals(Object obj) {
        if (obj instanceof C2435b) {
            return this.f8788b.equals(((C2435b) obj).f8788b);
        }
        return false;
    }

    @Override // p210y3.InterfaceC2801e
    public final int hashCode() {
        return this.f8788b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f8788b + '}';
    }
}
