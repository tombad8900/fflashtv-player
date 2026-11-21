package p115n1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.d0 */
/* loaded from: classes.dex */
public final class C1970d0 {

    /* renamed from: c */
    public static final C1970d0 f7310c = new C1970d0(0, 0);

    /* renamed from: a */
    public final long f7311a;

    /* renamed from: b */
    public final long f7312b;

    public C1970d0(long j, long j8) {
        this.f7311a = j;
        this.f7312b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1970d0.class == obj.getClass()) {
            C1970d0 c1970d0 = (C1970d0) obj;
            if (this.f7311a == c1970d0.f7311a && this.f7312b == c1970d0.f7312b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f7311a) * 31) + ((int) this.f7312b);
    }

    public final String toString() {
        return "[timeUs=" + this.f7311a + ", position=" + this.f7312b + "]";
    }
}
