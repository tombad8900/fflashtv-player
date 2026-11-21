package p052f6;

import java.util.Comparator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.b0 */
/* loaded from: classes.dex */
public final class C0950b0 extends AbstractC0956d0 {
    /* renamed from: f */
    public static AbstractC0956d0 m2131f(int i) {
        return i < 0 ? AbstractC0956d0.f4173b : i > 0 ? AbstractC0956d0.f4174c : AbstractC0956d0.f4172a;
    }

    @Override // p052f6.AbstractC0956d0
    /* renamed from: a */
    public final AbstractC0956d0 mo2132a(int i, int i4) {
        return m2131f(Integer.compare(i, i4));
    }

    @Override // p052f6.AbstractC0956d0
    /* renamed from: b */
    public final AbstractC0956d0 mo2133b(Object obj, Object obj2, Comparator comparator) {
        return m2131f(comparator.compare(obj, obj2));
    }

    @Override // p052f6.AbstractC0956d0
    /* renamed from: c */
    public final AbstractC0956d0 mo2134c(boolean z7, boolean z8) {
        return m2131f(Boolean.compare(z7, z8));
    }

    @Override // p052f6.AbstractC0956d0
    /* renamed from: d */
    public final AbstractC0956d0 mo2135d(boolean z7, boolean z8) {
        return m2131f(Boolean.compare(z8, z7));
    }

    @Override // p052f6.AbstractC0956d0
    /* renamed from: e */
    public final int mo2136e() {
        return 0;
    }
}
