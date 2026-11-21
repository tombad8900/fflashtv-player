package p130p;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p.c */
/* loaded from: classes.dex */
public final class C2184c implements Iterator, Map.Entry {

    /* renamed from: j */
    public int f7626j;

    /* renamed from: k */
    public int f7627k = -1;

    /* renamed from: l */
    public boolean f7628l;

    /* renamed from: m */
    public final /* synthetic */ C2186e f7629m;

    public C2184c(C2186e c2186e) {
        this.f7629m = c2186e;
        this.f7626j = c2186e.f7656l - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f7628l) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f7627k;
        C2186e c2186e = this.f7629m;
        return AbstractC2980h.m5132a(key, c2186e.m3992f(i)) && AbstractC2980h.m5132a(entry.getValue(), c2186e.m3996j(this.f7627k));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f7628l) {
            return this.f7629m.m3992f(this.f7627k);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f7628l) {
            return this.f7629m.m3996j(this.f7627k);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7627k < this.f7626j;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f7628l) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f7627k;
        C2186e c2186e = this.f7629m;
        Object objM3992f = c2186e.m3992f(i);
        Object objM3996j = c2186e.m3996j(this.f7627k);
        return (objM3992f == null ? 0 : objM3992f.hashCode()) ^ (objM3996j != null ? objM3996j.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7627k++;
        this.f7628l = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7628l) {
            throw new IllegalStateException();
        }
        this.f7629m.mo3994h(this.f7627k);
        this.f7627k--;
        this.f7626j--;
        this.f7628l = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f7628l) {
            return this.f7629m.mo3995i(this.f7627k, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
