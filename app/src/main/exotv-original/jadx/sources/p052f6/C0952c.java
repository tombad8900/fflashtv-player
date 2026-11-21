package p052f6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.c */
/* loaded from: classes.dex */
public final class C0952c implements Iterator {

    /* renamed from: j */
    public final Iterator f4162j;

    /* renamed from: k */
    public Object f4163k = null;

    /* renamed from: l */
    public Collection f4164l = null;

    /* renamed from: m */
    public Iterator f4165m = EnumC1022z0.f4306j;

    /* renamed from: n */
    public final /* synthetic */ AbstractC0949b f4166n;

    /* renamed from: o */
    public final /* synthetic */ int f4167o;

    public C0952c(AbstractC0949b abstractC0949b, int i) {
        this.f4167o = i;
        this.f4166n = abstractC0949b;
        this.f4162j = abstractC0949b.f4160n.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4162j.hasNext() || this.f4165m.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f4165m.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f4162j.next();
            this.f4163k = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f4164l = collection;
            this.f4165m = collection.iterator();
        }
        Object obj = this.f4163k;
        Object next = this.f4165m.next();
        switch (this.f4167o) {
            case 0:
                return next;
            default:
                return new C0971i0(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4165m.remove();
        Collection collection = this.f4164l;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f4162j.remove();
        }
        AbstractC0949b abstractC0949b = this.f4166n;
        abstractC0949b.f4161o--;
    }
}
