package p120o;

import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o.c */
/* loaded from: classes.dex */
public final class C2031c implements Map.Entry {

    /* renamed from: j */
    public final Object f7492j;

    /* renamed from: k */
    public final Object f7493k;

    /* renamed from: l */
    public C2031c f7494l;

    /* renamed from: m */
    public C2031c f7495m;

    public C2031c(Object obj, Object obj2) {
        this.f7492j = obj;
        this.f7493k = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2031c)) {
            return false;
        }
        C2031c c2031c = (C2031c) obj;
        return this.f7492j.equals(c2031c.f7492j) && this.f7493k.equals(c2031c.f7493k);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7492j;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7493k;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7492j.hashCode() ^ this.f7493k.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f7492j + "=" + this.f7493k;
    }
}
