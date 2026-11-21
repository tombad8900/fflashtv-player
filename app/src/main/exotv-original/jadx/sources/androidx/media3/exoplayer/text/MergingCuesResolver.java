package androidx.media3.exoplayer.text;

import java.util.ArrayList;
import java.util.List;
import p043e6.InterfaceC0916d;
import p052f6.AbstractC0978k1;
import p052f6.AbstractC0983m0;
import p052f6.C0959e0;
import p052f6.C0974j0;
import p052f6.C0975j1;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p052f6.C1003t;
import p063h1.AbstractC1101a;
import p090k2.C1585c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class MergingCuesResolver implements CuesResolver {
    private static final AbstractC0978k1 CUES_DISPLAY_PRIORITY_COMPARATOR;
    private final List<C1585c> cuesWithTimingList = new ArrayList();

    static {
        final int i = 0;
        final int i4 = 1;
        CUES_DISPLAY_PRIORITY_COMPARATOR = new C0959e0(new C1003t(new InterfaceC0916d() { // from class: androidx.media3.exoplayer.text.a
            @Override // p043e6.InterfaceC0916d
            public final Object apply(Object obj) {
                C1585c c1585c = (C1585c) obj;
                switch (i) {
                    case 0:
                        return MergingCuesResolver.lambda$static$0(c1585c);
                    default:
                        return MergingCuesResolver.lambda$static$1(c1585c);
                }
            }
        }, C0975j1.f4201k), new C1003t(new InterfaceC0916d() { // from class: androidx.media3.exoplayer.text.a
            @Override // p043e6.InterfaceC0916d
            public final Object apply(Object obj) {
                C1585c c1585c = (C1585c) obj;
                switch (i4) {
                    case 0:
                        return MergingCuesResolver.lambda$static$0(c1585c);
                    default:
                        return MergingCuesResolver.lambda$static$1(c1585c);
                }
            }
        }, C0975j1.f4202l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$0(C1585c c1585c) {
        return Long.valueOf(c1585c.f6054b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$static$1(C1585c c1585c) {
        return Long.valueOf(c1585c.f6055c);
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(C1585c c1585c, long j) {
        long j8 = c1585c.f6054b;
        long j9 = c1585c.f6054b;
        AbstractC1101a.m2353d(j8 != -9223372036854775807L);
        AbstractC1101a.m2353d(c1585c.f6055c != -9223372036854775807L);
        boolean z7 = j9 <= j && j < c1585c.f6056d;
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (j9 >= this.cuesWithTimingList.get(size).f6054b) {
                this.cuesWithTimingList.add(size + 1, c1585c);
                return z7;
            }
        }
        this.cuesWithTimingList.add(0, c1585c);
        return z7;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int i = 0;
        while (i < this.cuesWithTimingList.size()) {
            long j8 = this.cuesWithTimingList.get(i).f6054b;
            if (j > j8 && j > this.cuesWithTimingList.get(i).f6056d) {
                this.cuesWithTimingList.remove(i);
                i--;
            } else if (j < j8) {
                return;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public AbstractC0983m0 getCuesAtTimeUs(long j) {
        if (!this.cuesWithTimingList.isEmpty()) {
            if (j >= this.cuesWithTimingList.get(0).f6054b) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
                    C1585c c1585c = this.cuesWithTimingList.get(i);
                    if (j >= c1585c.f6054b && j < c1585c.f6056d) {
                        arrayList.add(c1585c);
                    }
                    if (j < c1585c.f6054b) {
                        break;
                    }
                }
                C0981l1 c0981l1M2170p = AbstractC0983m0.m2170p(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList);
                C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
                for (int i4 = 0; i4 < c0981l1M2170p.f4213m; i4++) {
                    c0974j0M2164i.m2143c(((C1585c) c0981l1M2170p.get(i4)).f6053a);
                }
                return c0974j0M2164i.m2159f();
            }
        }
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        return C0981l1.f4211n;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        int i = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i >= this.cuesWithTimingList.size()) {
                break;
            }
            long j8 = this.cuesWithTimingList.get(i).f6054b;
            long j9 = this.cuesWithTimingList.get(i).f6056d;
            if (j < j8) {
                jMin = jMin == -9223372036854775807L ? j8 : Math.min(jMin, j8);
            } else {
                if (j < j9) {
                    jMin = jMin == -9223372036854775807L ? j9 : Math.min(jMin, j9);
                }
                i++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < this.cuesWithTimingList.get(0).f6054b) {
            return -9223372036854775807L;
        }
        long jMax = this.cuesWithTimingList.get(0).f6054b;
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            long j8 = this.cuesWithTimingList.get(i).f6054b;
            long j9 = this.cuesWithTimingList.get(i).f6056d;
            if (j9 > j) {
                if (j8 > j) {
                    break;
                }
                jMax = Math.max(jMax, j8);
            } else {
                jMax = Math.max(jMax, j9);
            }
        }
        return jMax;
    }
}
