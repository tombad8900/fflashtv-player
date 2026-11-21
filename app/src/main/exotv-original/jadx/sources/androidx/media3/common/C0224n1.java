package androidx.media3.common;

import p052f6.AbstractC0983m0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.n1 */
/* loaded from: classes.dex */
public final class C0224n1 extends AbstractC0230p1 {

    /* renamed from: a */
    public final AbstractC0983m0 f1226a;

    /* renamed from: b */
    public final AbstractC0983m0 f1227b;

    /* renamed from: c */
    public final int[] f1228c;

    /* renamed from: d */
    public final int[] f1229d;

    public C0224n1(C0981l1 c0981l1, C0981l1 c0981l12, int[] iArr) {
        AbstractC1101a.m2353d(c0981l1.f4213m == iArr.length);
        this.f1226a = c0981l1;
        this.f1227b = c0981l12;
        this.f1228c = iArr;
        this.f1229d = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f1229d[iArr[i]] = i;
        }
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final int getFirstWindowIndex(boolean z7) {
        if (isEmpty()) {
            return -1;
        }
        if (z7) {
            return this.f1228c[0];
        }
        return 0;
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final int getIndexOfPeriod(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final int getLastWindowIndex(boolean z7) {
        if (isEmpty()) {
            return -1;
        }
        AbstractC0983m0 abstractC0983m0 = this.f1226a;
        if (!z7) {
            return abstractC0983m0.size() - 1;
        }
        return this.f1228c[abstractC0983m0.size() - 1];
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final int getNextWindowIndex(int i, int i4, boolean z7) {
        if (i4 == 1) {
            return i;
        }
        if (i == getLastWindowIndex(z7)) {
            if (i4 == 2) {
                return getFirstWindowIndex(z7);
            }
            return -1;
        }
        if (!z7) {
            return i + 1;
        }
        return this.f1228c[this.f1229d[i] + 1];
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7) {
        C0221m1 c0221m12 = (C0221m1) this.f1227b.get(i);
        c0221m1.m644i(c0221m12.f1204a, c0221m12.f1205b, c0221m12.f1206c, c0221m12.f1207d, c0221m12.f1208e, c0221m12.f1210g, c0221m12.f1209f);
        return c0221m1;
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final int getPeriodCount() {
        return this.f1227b.size();
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final int getPreviousWindowIndex(int i, int i4, boolean z7) {
        if (i4 == 1) {
            return i;
        }
        if (i == getFirstWindowIndex(z7)) {
            if (i4 == 2) {
                return getLastWindowIndex(z7);
            }
            return -1;
        }
        if (!z7) {
            return i - 1;
        }
        return this.f1228c[this.f1229d[i] - 1];
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final Object getUidOfPeriod(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final C0227o1 getWindow(int i, C0227o1 c0227o1, long j) {
        C0227o1 c0227o12 = (C0227o1) this.f1226a.get(i);
        c0227o1.m655b(c0227o12.f1260a, c0227o12.f1262c, c0227o12.f1263d, c0227o12.f1264e, c0227o12.f1265f, c0227o12.f1266g, c0227o12.f1267h, c0227o12.f1268i, c0227o12.f1269j, c0227o12.f1271l, c0227o12.f1272m, c0227o12.f1273n, c0227o12.f1274o, c0227o12.f1275p);
        c0227o1.f1270k = c0227o12.f1270k;
        return c0227o1;
    }

    @Override // androidx.media3.common.AbstractC0230p1
    public final int getWindowCount() {
        return this.f1226a.size();
    }
}
