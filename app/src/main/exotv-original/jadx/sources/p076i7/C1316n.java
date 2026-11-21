package p076i7;

import java.util.concurrent.CancellationException;
import p212y6.InterfaceC2856q;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.n */
/* loaded from: classes.dex */
public final class C1316n {

    /* renamed from: a */
    public final Object f5351a;

    /* renamed from: b */
    public final C1286d f5352b;

    /* renamed from: c */
    public final InterfaceC2856q f5353c;

    /* renamed from: d */
    public final Object f5354d;

    /* renamed from: e */
    public final Throwable f5355e;

    public C1316n(Object obj, C1286d c1286d, InterfaceC2856q interfaceC2856q, Object obj2, Throwable th) {
        this.f5351a = obj;
        this.f5352b = c1286d;
        this.f5353c = interfaceC2856q;
        this.f5354d = obj2;
        this.f5355e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    /* renamed from: a */
    public static C1316n m2835a(C1316n c1316n, C1286d c1286d, CancellationException cancellationException, int i) {
        Object obj = c1316n.f5351a;
        if ((i & 2) != 0) {
            c1286d = c1316n.f5352b;
        }
        C1286d c1286d2 = c1286d;
        InterfaceC2856q interfaceC2856q = c1316n.f5353c;
        Object obj2 = c1316n.f5354d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c1316n.f5355e;
        }
        return new C1316n(obj, c1286d2, interfaceC2856q, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1316n)) {
            return false;
        }
        C1316n c1316n = (C1316n) obj;
        return AbstractC2980h.m5132a(this.f5351a, c1316n.f5351a) && AbstractC2980h.m5132a(this.f5352b, c1316n.f5352b) && AbstractC2980h.m5132a(this.f5353c, c1316n.f5353c) && AbstractC2980h.m5132a(this.f5354d, c1316n.f5354d) && AbstractC2980h.m5132a(this.f5355e, c1316n.f5355e);
    }

    public final int hashCode() {
        Object obj = this.f5351a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C1286d c1286d = this.f5352b;
        int iHashCode2 = (iHashCode + (c1286d == null ? 0 : c1286d.hashCode())) * 31;
        InterfaceC2856q interfaceC2856q = this.f5353c;
        int iHashCode3 = (iHashCode2 + (interfaceC2856q == null ? 0 : interfaceC2856q.hashCode())) * 31;
        Object obj2 = this.f5354d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f5355e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f5351a + ", cancelHandler=" + this.f5352b + ", onCancellation=" + this.f5353c + ", idempotentResume=" + this.f5354d + ", cancelCause=" + this.f5355e + ')';
    }

    public /* synthetic */ C1316n(Object obj, C1286d c1286d, InterfaceC2856q interfaceC2856q, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : c1286d, (i & 4) != 0 ? null : interfaceC2856q, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
