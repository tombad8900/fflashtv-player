package p052f6;

import androidx.media3.exoplayer.trackselection.C0471b;
import java.io.Serializable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.a0 */
/* loaded from: classes.dex */
public final class C0947a0 extends AbstractC0978k1 implements Serializable {

    /* renamed from: j */
    public final C0471b f4157j;

    public C0947a0(C0471b c0471b) {
        this.f4157j = c0471b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f4157j.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0947a0) {
            return this.f4157j.equals(((C0947a0) obj).f4157j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4157j.hashCode();
    }

    public final String toString() {
        return this.f4157j.toString();
    }
}
