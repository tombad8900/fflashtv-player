package p043e6;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e6.g */
/* loaded from: classes.dex */
public final class C0919g implements InterfaceC0918f, Serializable {

    /* renamed from: j */
    public final List f3970j;

    public C0919g(List list) {
        this.f3970j = list;
    }

    @Override // p043e6.InterfaceC0918f
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f3970j;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC0918f) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0919g) {
            return this.f3970j.equals(((C0919g) obj).f3970j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3970j.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z7 = true;
        for (Object obj : this.f3970j) {
            if (!z7) {
                sb.append(',');
            }
            sb.append(obj);
            z7 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
