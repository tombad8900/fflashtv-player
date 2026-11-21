package p090k2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p052f6.AbstractC0983m0;
import p052f6.C0975j1;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p052f6.C1003t;
import p057g2.C1040d;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k2.d */
/* loaded from: classes.dex */
public final class C1586d implements InterfaceC1590h {

    /* renamed from: l */
    public static final C1003t f6057l = new C1003t(new C1040d(14), C0975j1.f4201k);

    /* renamed from: j */
    public final AbstractC0983m0 f6058j;

    /* renamed from: k */
    public final long[] f6059k;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1586d(C0981l1 c0981l1) {
        long j;
        int i = c0981l1.f4213m;
        long j8 = -9223372036854775807L;
        int i4 = 0;
        if (i == 1) {
            C0977k0 c0977k0ListIterator = c0981l1.listIterator(0);
            Object next = c0977k0ListIterator.next();
            if (c0977k0ListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i4 < 4 && c0977k0ListIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(c0977k0ListIterator.next());
                    i4++;
                }
                if (c0977k0ListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            C1585c c1585c = (C1585c) next;
            long j9 = c1585c.f6054b;
            AbstractC0983m0 abstractC0983m0 = c1585c.f6053a;
            long j10 = c1585c.f6055c;
            long j11 = j9 == -9223372036854775807L ? 0L : j9;
            if (j10 == -9223372036854775807L) {
                this.f6058j = AbstractC0983m0.m2168n(abstractC0983m0);
                this.f6059k = new long[]{j11};
                return;
            } else {
                C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                this.f6058j = AbstractC0983m0.m2169o(abstractC0983m0, C0981l1.f4211n);
                this.f6059k = new long[]{j11, j10 + j11};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.f6059k = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        C0981l1 c0981l1M2170p = AbstractC0983m0.m2170p(f6057l, c0981l1);
        int i8 = 0;
        while (i4 < c0981l1M2170p.f4213m) {
            C1585c c1585c2 = (C1585c) c0981l1M2170p.get(i4);
            long j12 = c1585c2.f6054b;
            long j13 = c1585c2.f6055c;
            AbstractC0983m0 abstractC0983m02 = c1585c2.f6053a;
            j12 = j12 == j8 ? 0L : j12;
            long j14 = j12 + j13;
            if (i8 != 0) {
                int i9 = i8 - 1;
                long j15 = this.f6059k[i9];
                if (j15 < j12) {
                    j = j8;
                    this.f6059k[i8] = j12;
                    arrayList.add(abstractC0983m02);
                    i8++;
                } else if (j15 == j12 && ((AbstractC0983m0) arrayList.get(i9)).isEmpty()) {
                    arrayList.set(i9, abstractC0983m02);
                    j = j8;
                } else {
                    j = j8;
                    AbstractC1101a.m2348F("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f6059k[i9] = j12;
                    arrayList.set(i9, abstractC0983m02);
                }
            }
            if (j13 != j) {
                this.f6059k[i8] = j14;
                arrayList.add(C0981l1.f4211n);
                i8++;
            }
            i4++;
            j8 = j;
        }
        this.f6058j = AbstractC0983m0.m2165j(arrayList);
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: c */
    public final int mo281c(long j) {
        int iM2436a = AbstractC1118i0.m2436a(this.f6059k, j, false);
        if (iM2436a < this.f6058j.size()) {
            return iM2436a;
        }
        return -1;
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: f */
    public final long mo284f(int i) {
        AbstractC1101a.m2353d(i < this.f6058j.size());
        return this.f6059k[i];
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: m */
    public final List mo291m(long j) {
        int iM2444e = AbstractC1118i0.m2444e(this.f6059k, j, false);
        if (iM2444e != -1) {
            return (AbstractC0983m0) this.f6058j.get(iM2444e);
        }
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        return C0981l1.f4211n;
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: n */
    public final int mo292n() {
        return this.f6058j.size();
    }
}
