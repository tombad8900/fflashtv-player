package p052f6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.p */
/* loaded from: classes.dex */
public class C0991p extends AbstractCollection {

    /* renamed from: j */
    public final /* synthetic */ int f4231j;

    /* renamed from: k */
    public final /* synthetic */ AbstractC0949b f4232k;

    public /* synthetic */ C0991p(AbstractC0949b abstractC0949b, int i) {
        this.f4231j = i;
        this.f4232k = abstractC0949b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f4231j) {
            case 0:
                this.f4232k.m2127e();
                break;
            default:
                this.f4232k.m2127e();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f4231j) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) this.f4232k.mo2126b().get(key);
                return collection != null && collection.contains(value);
            default:
                return this.f4232k.mo2175c(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4231j) {
            case 0:
                return new C0952c(this.f4232k, 1);
            default:
                return new C0952c(this.f4232k, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f4231j) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f4232k.remove(entry.getKey(), entry.getValue());
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f4231j) {
        }
        return this.f4232k.f4161o;
    }
}
