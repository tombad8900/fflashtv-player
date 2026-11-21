package p079j0;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j0.b */
/* loaded from: classes.dex */
public final class C1474b {

    /* renamed from: a */
    public String f5684a;

    /* renamed from: b */
    public String f5685b;

    /* renamed from: c */
    public List f5686c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1474b)) {
            return false;
        }
        C1474b c1474b = (C1474b) obj;
        return Objects.equals(this.f5684a, c1474b.f5684a) && Objects.equals(this.f5685b, c1474b.f5685b) && Objects.equals(this.f5686c, c1474b.f5686c);
    }

    public final int hashCode() {
        return Objects.hash(this.f5684a, this.f5685b, this.f5686c);
    }
}
