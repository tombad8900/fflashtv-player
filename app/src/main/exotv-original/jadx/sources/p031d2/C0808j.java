package p031d2;

import android.os.Parcel;
import android.os.Parcelable;
import p021c2.C0634d;
import p063h1.C1132w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d2.j */
/* loaded from: classes.dex */
public final class C0808j extends AbstractC0800b {
    public static final Parcelable.Creator<C0808j> CREATOR = new C0634d(9);

    /* renamed from: j */
    public final long f3619j;

    /* renamed from: k */
    public final long f3620k;

    public C0808j(long j, long j8) {
        this.f3619j = j;
        this.f3620k = j8;
    }

    /* renamed from: a */
    public static long m1948a(long j, C1132w c1132w) {
        long jM2535u = c1132w.m2535u();
        if ((128 & jM2535u) != 0) {
            return 8589934591L & ((((jM2535u & 1) << 32) | c1132w.m2537w()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // p031d2.AbstractC0800b
    public final String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f3619j + ", playbackPositionUs= " + this.f3620k + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3619j);
        parcel.writeLong(this.f3620k);
    }
}
