package androidx.media3.exoplayer.text;

import p052f6.AbstractC0983m0;
import p090k2.C1585c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
interface CuesResolver {
    boolean addCues(C1585c c1585c, long j);

    void clear();

    void discardCuesBeforeTimeUs(long j);

    AbstractC0983m0 getCuesAtTimeUs(long j);

    long getNextCueChangeTimeUs(long j);

    long getPreviousCueChangeTimeUs(long j);
}
