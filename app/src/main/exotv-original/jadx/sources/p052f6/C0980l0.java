package p052f6;

import com.bumptech.glide.AbstractC0714c;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.l0 */
/* loaded from: classes.dex */
public final class C0980l0 extends AbstractC0983m0 {

    /* renamed from: l */
    public final transient int f4208l;

    /* renamed from: m */
    public final transient int f4209m;

    /* renamed from: n */
    public final /* synthetic */ AbstractC0983m0 f4210n;

    public C0980l0(AbstractC0983m0 abstractC0983m0, int i, int i4) {
        this.f4210n = abstractC0983m0;
        this.f4208l = i;
        this.f4209m = i4;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: c */
    public final Object[] mo2152c() {
        return this.f4210n.mo2152c();
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: d */
    public final int mo2153d() {
        return this.f4210n.mo2154e() + this.f4208l + this.f4209m;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: e */
    public final int mo2154e() {
        return this.f4210n.mo2154e() + this.f4208l;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: f */
    public final boolean mo2155f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0714c.m1527m(i, this.f4209m);
        return this.f4210n.get(i + this.f4208l);
    }

    @Override // p052f6.AbstractC0983m0, p052f6.AbstractC0968h0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p052f6.AbstractC0983m0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p052f6.AbstractC0983m0, java.util.List
    /* renamed from: q */
    public final AbstractC0983m0 subList(int i, int i4) {
        AbstractC0714c.m1531q(i, i4, this.f4209m);
        int i8 = this.f4208l;
        return this.f4210n.subList(i + i8, i4 + i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4209m;
    }

    @Override // p052f6.AbstractC0983m0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
