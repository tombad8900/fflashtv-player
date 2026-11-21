package p119n6;

import java.util.ConcurrentModificationException;
import java.util.Map;
import p008a7.InterfaceC0113a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n6.e */
/* loaded from: classes.dex */
public final class C2025e implements Map.Entry, InterfaceC0113a {

    /* renamed from: j */
    public final C2026f f7468j;

    /* renamed from: k */
    public final int f7469k;

    /* renamed from: l */
    public final int f7470l;

    public C2025e(C2026f c2026f, int i) {
        AbstractC2980h.m5136e("map", c2026f);
        this.f7468j = c2026f;
        this.f7469k = i;
        this.f7470l = c2026f.f7479q;
    }

    /* renamed from: a */
    public final void m3909a() {
        if (this.f7468j.f7479q != this.f7470l) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC2980h.m5132a(entry.getKey(), getKey()) && AbstractC2980h.m5132a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m3909a();
        return this.f7468j.f7472j[this.f7469k];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m3909a();
        Object[] objArr = this.f7468j.f7473k;
        AbstractC2980h.m5133b(objArr);
        return objArr[this.f7469k];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m3909a();
        C2026f c2026f = this.f7468j;
        c2026f.m3911b();
        Object[] objArr = c2026f.f7473k;
        if (objArr == null) {
            int length = c2026f.f7472j.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c2026f.f7473k = objArr;
        }
        int i = this.f7469k;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
