package p189v7;

import java.util.RandomAccess;
import p111m6.AbstractC1908c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.z */
/* loaded from: classes.dex */
public final class C2595z extends AbstractC1908c implements RandomAccess {

    /* renamed from: j */
    public final C2579m[] f9346j;

    /* renamed from: k */
    public final int[] f9347k;

    public C2595z(C2579m[] c2579mArr, int[] iArr) {
        this.f9346j = c2579mArr;
        this.f9347k = iArr;
    }

    @Override // p111m6.AbstractC1908c
    /* renamed from: a */
    public final int mo2621a() {
        return this.f9346j.length;
    }

    @Override // p111m6.AbstractC1908c, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C2579m) {
            return super.contains((C2579m) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f9346j[i];
    }

    @Override // p111m6.AbstractC1908c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C2579m) {
            return super.indexOf((C2579m) obj);
        }
        return -1;
    }

    @Override // p111m6.AbstractC1908c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C2579m) {
            return super.lastIndexOf((C2579m) obj);
        }
        return -1;
    }
}
