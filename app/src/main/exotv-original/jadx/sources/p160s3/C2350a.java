package p160s3;

import com.bumptech.glide.AbstractC0715d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s3.a */
/* loaded from: classes.dex */
public final class C2350a extends AbstractC0715d {

    /* renamed from: n */
    public final int f8260n;

    public C2350a(int i) {
        this.f8260n = i;
        if (i <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2350a) {
            return this.f8260n == ((C2350a) obj).f8260n;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8260n;
    }

    public final String toString() {
        return String.valueOf(this.f8260n);
    }
}
