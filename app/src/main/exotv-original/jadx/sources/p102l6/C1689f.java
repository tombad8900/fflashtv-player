package p102l6;

import java.io.Serializable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l6.f */
/* loaded from: classes.dex */
public final class C1689f implements Serializable {

    /* renamed from: j */
    public final Serializable f6489j;

    /* renamed from: a */
    public static final Throwable m3382a(Object obj) {
        if (obj instanceof C1688e) {
            return ((C1688e) obj).f6488j;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1689f) {
            return this.f6489j.equals(((C1689f) obj).f6489j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6489j.hashCode();
    }

    public final String toString() {
        Serializable serializable = this.f6489j;
        if (serializable instanceof C1688e) {
            return ((C1688e) serializable).toString();
        }
        return "Success(" + serializable + ')';
    }
}
