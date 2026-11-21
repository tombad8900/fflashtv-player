package p151r3;

import java.util.Map;
import p111m6.C1922q;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.s */
/* loaded from: classes.dex */
public final class C2307s {

    /* renamed from: b */
    public static final C2307s f8079b = new C2307s(C1922q.f7188j);

    /* renamed from: a */
    public final Map f8080a;

    public C2307s(Map map) {
        this.f8080a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2307s) {
            return AbstractC2980h.m5132a(this.f8080a, ((C2307s) obj).f8080a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8080a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f8080a + ')';
    }
}
