package androidx.media3.common;

import android.util.SparseBooleanArray;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.u */
/* loaded from: classes.dex */
public final class C0243u {

    /* renamed from: a */
    public final SparseBooleanArray f1421a;

    public C0243u(SparseBooleanArray sparseBooleanArray) {
        this.f1421a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final boolean m670a(int... iArr) {
        for (int i : iArr) {
            if (this.f1421a.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int m671b(int i) {
        SparseBooleanArray sparseBooleanArray = this.f1421a;
        AbstractC1101a.m2356g(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0243u)) {
            return false;
        }
        C0243u c0243u = (C0243u) obj;
        SparseBooleanArray sparseBooleanArray = c0243u.f1421a;
        int i = AbstractC1118i0.f4750a;
        SparseBooleanArray sparseBooleanArray2 = this.f1421a;
        if (i >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i4 = 0; i4 < sparseBooleanArray2.size(); i4++) {
            if (m671b(i4) != c0243u.m671b(i4)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = AbstractC1118i0.f4750a;
        SparseBooleanArray sparseBooleanArray = this.f1421a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
            size = (size * 31) + m671b(i4);
        }
        return size;
    }
}
