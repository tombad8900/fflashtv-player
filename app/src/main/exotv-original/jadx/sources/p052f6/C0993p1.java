package p052f6;

import com.bumptech.glide.AbstractC0714c;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.p1 */
/* loaded from: classes.dex */
public final class C0993p1 extends AbstractC0983m0 {

    /* renamed from: l */
    public final transient Object[] f4236l;

    /* renamed from: m */
    public final transient int f4237m;

    /* renamed from: n */
    public final transient int f4238n;

    public C0993p1(Object[] objArr, int i, int i4) {
        this.f4236l = objArr;
        this.f4237m = i;
        this.f4238n = i4;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: f */
    public final boolean mo2155f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0714c.m1527m(i, this.f4238n);
        Object obj = this.f4236l[(i * 2) + this.f4237m];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4238n;
    }
}
