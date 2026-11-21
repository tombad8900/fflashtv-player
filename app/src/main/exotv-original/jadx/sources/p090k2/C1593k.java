package p090k2;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k2.k */
/* loaded from: classes.dex */
public final class C1593k implements Comparable {

    /* renamed from: j */
    public final long f6062j;

    /* renamed from: k */
    public final byte[] f6063k;

    public C1593k(long j, byte[] bArr) {
        this.f6062j = j;
        this.f6063k = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f6062j, ((C1593k) obj).f6062j);
    }
}
