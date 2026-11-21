package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import androidx.media3.common.C0212j1;
import androidx.media3.exoplayer.offline.FilterableManifest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class DashManifest implements FilterableManifest<DashManifest> {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;
    public final Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final List<Period> periods;
    public final ProgramInformation programInformation;
    public final long publishTimeMs;
    public final ServiceDescriptionElement serviceDescription;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;
    public final UtcTimingElement utcTiming;

    public DashManifest(long j, long j8, long j9, boolean z7, long j10, long j11, long j12, long j13, ProgramInformation programInformation, UtcTimingElement utcTimingElement, ServiceDescriptionElement serviceDescriptionElement, Uri uri, List<Period> list) {
        this.availabilityStartTimeMs = j;
        this.durationMs = j8;
        this.minBufferTimeMs = j9;
        this.dynamic = z7;
        this.minUpdatePeriodMs = j10;
        this.timeShiftBufferDepthMs = j11;
        this.suggestedPresentationDelayMs = j12;
        this.publishTimeMs = j13;
        this.programInformation = programInformation;
        this.utcTiming = utcTimingElement;
        this.location = uri;
        this.serviceDescription = serviceDescriptionElement;
        this.periods = list == null ? Collections.EMPTY_LIST : list;
    }

    private static ArrayList<AdaptationSet> copyAdaptationSets(List<AdaptationSet> list, LinkedList<C0212j1> linkedList) {
        C0212j1 c0212j1Poll = linkedList.poll();
        int i = c0212j1Poll.f1159j;
        ArrayList<AdaptationSet> arrayList = new ArrayList<>();
        do {
            int i4 = c0212j1Poll.f1160k;
            AdaptationSet adaptationSet = list.get(i4);
            List<Representation> list2 = adaptationSet.representations;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(c0212j1Poll.f1161l));
                c0212j1Poll = linkedList.poll();
                if (c0212j1Poll.f1159j != i) {
                    break;
                }
            } while (c0212j1Poll.f1160k == i4);
            arrayList.add(new AdaptationSet(adaptationSet.f1715id, adaptationSet.type, arrayList2, adaptationSet.accessibilityDescriptors, adaptationSet.essentialProperties, adaptationSet.supplementalProperties));
        } while (c0212j1Poll.f1159j == i);
        linkedList.addFirst(c0212j1Poll);
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public /* bridge */ /* synthetic */ DashManifest copy(List list) {
        return copy((List<C0212j1>) list);
    }

    public final Period getPeriod(int i) {
        return this.periods.get(i);
    }

    public final int getPeriodCount() {
        return this.periods.size();
    }

    public final long getPeriodDurationMs(int i) {
        long j;
        long j8;
        if (i == this.periods.size() - 1) {
            j = this.durationMs;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j8 = this.periods.get(i).startMs;
        } else {
            j = this.periods.get(i + 1).startMs;
            j8 = this.periods.get(i).startMs;
        }
        return j - j8;
    }

    public final long getPeriodDurationUs(int i) {
        return AbstractC1118i0.m2428S(getPeriodDurationMs(i));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public final DashManifest copy(List<C0212j1> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C0212j1(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= getPeriodCount()) {
                break;
            }
            if (((C0212j1) linkedList.peek()).f1159j != i) {
                long periodDurationMs = getPeriodDurationMs(i);
                if (periodDurationMs != -9223372036854775807L) {
                    j += periodDurationMs;
                }
            } else {
                Period period = getPeriod(i);
                arrayList.add(new Period(period.f1717id, period.startMs - j, copyAdaptationSets(period.adaptationSets, linkedList), period.eventStreams));
            }
            i++;
        }
        long j8 = this.durationMs;
        return new DashManifest(this.availabilityStartTimeMs, j8 != -9223372036854775807L ? j8 - j : -9223372036854775807L, this.minBufferTimeMs, this.dynamic, this.minUpdatePeriodMs, this.timeShiftBufferDepthMs, this.suggestedPresentationDelayMs, this.publishTimeMs, this.programInformation, this.utcTiming, this.serviceDescription, this.location, arrayList);
    }
}
