package p052f6;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.i1 */
/* loaded from: classes.dex */
public final class C0972i1 extends AbstractC0949b {

    /* renamed from: p */
    public transient C0969h1 f4200p;

    @Override // p052f6.AbstractC0949b
    /* renamed from: f */
    public final Map mo2128f() {
        Map map = this.f4160n;
        return map instanceof NavigableMap ? new C0967h(this, (NavigableMap) map) : map instanceof SortedMap ? new C0976k(this, (SortedMap) map) : new C0961f(this, map);
    }

    @Override // p052f6.AbstractC0949b
    /* renamed from: g */
    public final Collection mo2129g() {
        return (List) this.f4200p.get();
    }

    @Override // p052f6.AbstractC0949b
    /* renamed from: h */
    public final Set mo2130h() {
        Map map = this.f4160n;
        return map instanceof NavigableMap ? new C0970i(this, (NavigableMap) map) : map instanceof SortedMap ? new C0979l(this, (SortedMap) map) : new C0964g(this, map);
    }
}
