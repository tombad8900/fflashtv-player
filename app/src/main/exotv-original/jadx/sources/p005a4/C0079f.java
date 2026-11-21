package p005a4;

import java.security.MessageDigest;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.f */
/* loaded from: classes.dex */
public final class C0079f implements InterfaceC2801e {

    /* renamed from: b */
    public final InterfaceC2801e f345b;

    /* renamed from: c */
    public final InterfaceC2801e f346c;

    public C0079f(InterfaceC2801e interfaceC2801e, InterfaceC2801e interfaceC2801e2) {
        this.f345b = interfaceC2801e;
        this.f346c = interfaceC2801e2;
    }

    @Override // p210y3.InterfaceC2801e
    /* renamed from: a */
    public final void mo309a(MessageDigest messageDigest) {
        this.f345b.mo309a(messageDigest);
        this.f346c.mo309a(messageDigest);
    }

    @Override // p210y3.InterfaceC2801e
    public final boolean equals(Object obj) {
        if (obj instanceof C0079f) {
            C0079f c0079f = (C0079f) obj;
            if (this.f345b.equals(c0079f.f345b) && this.f346c.equals(c0079f.f346c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p210y3.InterfaceC2801e
    public final int hashCode() {
        return this.f346c.hashCode() + (this.f345b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f345b + ", signature=" + this.f346c + '}';
    }
}
