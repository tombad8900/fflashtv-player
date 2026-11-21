package p052f6;

import com.bumptech.glide.AbstractC0714c;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.l1 */
/* loaded from: classes.dex */
public final class C0981l1 extends AbstractC0983m0 {

    /* renamed from: n */
    public static final C0981l1 f4211n = new C0981l1(0, new Object[0]);

    /* renamed from: l */
    public final transient Object[] f4212l;

    /* renamed from: m */
    public final transient int f4213m;

    public C0981l1(int i, Object[] objArr) {
        this.f4212l = objArr;
        this.f4213m = i;
    }

    @Override // p052f6.AbstractC0983m0, p052f6.AbstractC0968h0
    /* renamed from: b */
    public final int mo2151b(int i, Object[] objArr) {
        Object[] objArr2 = this.f4212l;
        int i4 = this.f4213m;
        System.arraycopy(objArr2, 0, objArr, i, i4);
        return i + i4;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: c */
    public final Object[] mo2152c() {
        return this.f4212l;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: d */
    public final int mo2153d() {
        return this.f4213m;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: e */
    public final int mo2154e() {
        return 0;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: f */
    public final boolean mo2155f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0714c.m1527m(i, this.f4213m);
        Object obj = this.f4212l[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4213m;
    }
}
