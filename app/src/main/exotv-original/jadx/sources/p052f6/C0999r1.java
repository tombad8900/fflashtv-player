package p052f6;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.r1 */
/* loaded from: classes.dex */
public final class C0999r1 extends AbstractC1013w0 {

    /* renamed from: r */
    public static final Object[] f4254r;

    /* renamed from: s */
    public static final C0999r1 f4255s;

    /* renamed from: m */
    public final transient Object[] f4256m;

    /* renamed from: n */
    public final transient int f4257n;

    /* renamed from: o */
    public final transient Object[] f4258o;

    /* renamed from: p */
    public final transient int f4259p;

    /* renamed from: q */
    public final transient int f4260q;

    static {
        Object[] objArr = new Object[0];
        f4254r = objArr;
        f4255s = new C0999r1(0, 0, 0, objArr, objArr);
    }

    public C0999r1(int i, int i4, int i8, Object[] objArr, Object[] objArr2) {
        this.f4256m = objArr;
        this.f4257n = i;
        this.f4258o = objArr2;
        this.f4259p = i4;
        this.f4260q = i8;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: b */
    public final int mo2151b(int i, Object[] objArr) {
        Object[] objArr2 = this.f4256m;
        int i4 = this.f4260q;
        System.arraycopy(objArr2, 0, objArr, i, i4);
        return i + i4;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: c */
    public final Object[] mo2152c() {
        return this.f4256m;
    }

    @Override // p052f6.AbstractC0968h0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f4258o;
            if (objArr.length != 0) {
                int iM2203r = AbstractC1006u.m2203r(obj);
                while (true) {
                    int i = iM2203r & this.f4259p;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM2203r = i + 1;
                }
            }
        }
        return false;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: d */
    public final int mo2153d() {
        return this.f4260q;
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

    @Override // p052f6.AbstractC0968h0
    /* renamed from: g */
    public final AbstractC1023z1 iterator() {
        return mo2150a().listIterator(0);
    }

    @Override // p052f6.AbstractC1013w0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4257n;
    }

    @Override // p052f6.AbstractC1013w0
    /* renamed from: k */
    public final AbstractC0983m0 mo2177k() {
        return AbstractC0983m0.m2163h(this.f4260q, this.f4256m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4260q;
    }
}
