package p098l2;

import p090k2.C1595m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l2.g */
/* loaded from: classes.dex */
public final class C1657g extends C1595m implements Comparable {

    /* renamed from: k */
    public long f6369k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1657g c1657g = (C1657g) obj;
        if (isEndOfStream() != c1657g.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j = this.timeUs - c1657g.timeUs;
        if (j == 0) {
            j = this.f6369k - c1657g.f6369k;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
