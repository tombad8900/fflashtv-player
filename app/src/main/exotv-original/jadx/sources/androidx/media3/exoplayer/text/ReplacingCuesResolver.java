package androidx.media3.exoplayer.text;

import java.util.ArrayList;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p090k2.C1585c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class ReplacingCuesResolver implements CuesResolver {
    private final ArrayList<C1585c> cuesWithTimingList = new ArrayList<>();

    private int getIndexOfCuesStartingAfter(long j) {
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            if (j < this.cuesWithTimingList.get(i).f6054b) {
                return i;
            }
        }
        return this.cuesWithTimingList.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean addCues(C1585c c1585c, long j) {
        boolean z7;
        long j8 = c1585c.f6054b;
        long j9 = c1585c.f6054b;
        AbstractC1101a.m2353d(j8 != -9223372036854775807L);
        if (j9 <= j) {
            long j10 = c1585c.f6056d;
            z7 = j10 == -9223372036854775807L || j < j10;
        }
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (j9 >= this.cuesWithTimingList.get(size).f6054b) {
                this.cuesWithTimingList.add(size + 1, c1585c);
                return z7;
            }
            if (this.cuesWithTimingList.get(size).f6054b <= j) {
                z7 = false;
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
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            return;
        }
        long j8 = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1).f6056d;
        if (j8 == -9223372036854775807L || j8 >= j) {
            indexOfCuesStartingAfter--;
        }
        this.cuesWithTimingList.subList(0, indexOfCuesStartingAfter).clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public AbstractC0983m0 getCuesAtTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            return C0981l1.f4211n;
        }
        C1585c c1585c = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1);
        long j8 = c1585c.f6056d;
        if (j8 == -9223372036854775807L || j < j8) {
            return c1585c.f6053a;
        }
        C0977k0 c0977k02 = AbstractC0983m0.f4215k;
        return C0981l1.f4211n;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < this.cuesWithTimingList.get(0).f6054b) {
            return this.cuesWithTimingList.get(0).f6054b;
        }
        for (int i = 1; i < this.cuesWithTimingList.size(); i++) {
            C1585c c1585c = this.cuesWithTimingList.get(i);
            long j8 = c1585c.f6054b;
            long j9 = c1585c.f6054b;
            if (j < j8) {
                long j10 = this.cuesWithTimingList.get(i - 1).f6056d;
                return (j10 == -9223372036854775807L || j10 <= j || j10 >= j9) ? j9 : j10;
            }
        }
        long j11 = ((C1585c) AbstractC1006u.m2194i(this.cuesWithTimingList)).f6056d;
        if (j11 == -9223372036854775807L || j >= j11) {
            return Long.MIN_VALUE;
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty() || j < this.cuesWithTimingList.get(0).f6054b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < this.cuesWithTimingList.size(); i++) {
            long j8 = this.cuesWithTimingList.get(i).f6054b;
            if (j == j8) {
                return j8;
            }
            if (j < j8) {
                C1585c c1585c = this.cuesWithTimingList.get(i - 1);
                long j9 = c1585c.f6056d;
                return (j9 == -9223372036854775807L || j9 > j) ? c1585c.f6054b : j9;
            }
        }
        C1585c c1585c2 = (C1585c) AbstractC1006u.m2194i(this.cuesWithTimingList);
        long j10 = c1585c2.f6056d;
        return (j10 == -9223372036854775807L || j < j10) ? c1585c2.f6054b : j10;
    }
}
