package p183v0;

import android.util.SparseArray;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.s */
/* loaded from: classes.dex */
public final class C2519s {

    /* renamed from: a */
    public final SparseArray f9170a;

    /* renamed from: b */
    public C2522v f9171b;

    public C2519s(int i) {
        this.f9170a = new SparseArray(i);
    }

    /* renamed from: a */
    public final void m4533a(C2522v c2522v, int i, int i4) {
        int iM4539a = c2522v.m4539a(i);
        SparseArray sparseArray = this.f9170a;
        C2519s c2519s = sparseArray == null ? null : (C2519s) sparseArray.get(iM4539a);
        if (c2519s == null) {
            c2519s = new C2519s(1);
            sparseArray.put(c2522v.m4539a(i), c2519s);
        }
        if (i4 > i) {
            c2519s.m4533a(c2522v, i + 1, i4);
        } else {
            c2519s.f9171b = c2522v;
        }
    }
}
