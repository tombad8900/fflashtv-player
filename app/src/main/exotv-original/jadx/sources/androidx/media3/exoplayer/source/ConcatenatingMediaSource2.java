package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0196e0;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0227o1;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p089k1.InterfaceC1557c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    private static final int MSG_UPDATE_TIMELINE = 1;
    private C0226o0 mediaItem;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final AbstractC0983m0 mediaSourceHolders;
    private Handler playbackThreadHandler;
    private boolean timelineUpdateScheduled;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Builder {
        private int index;
        private C0226o0 mediaItem;
        private MediaSource.Factory mediaSourceFactory;
        private final C0974j0 mediaSourceHoldersBuilder = AbstractC0983m0.m2164i();

        public Builder add(C0226o0 c0226o0) {
            return add(c0226o0, -9223372036854775807L);
        }

        public ConcatenatingMediaSource2 build() {
            AbstractC1101a.m2352c("Must add at least one source to the concatenation.", this.index > 0);
            if (this.mediaItem == null) {
                this.mediaItem = C0226o0.m651c(Uri.EMPTY);
            }
            return new ConcatenatingMediaSource2(this.mediaItem, this.mediaSourceHoldersBuilder.m2159f());
        }

        public Builder setMediaItem(C0226o0 c0226o0) {
            this.mediaItem = c0226o0;
            return this;
        }

        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            factory.getClass();
            this.mediaSourceFactory = factory;
            return this;
        }

        public Builder useDefaultMediaSourceFactory(Context context) {
            return setMediaSourceFactory(new DefaultMediaSourceFactory(context));
        }

        public Builder add(C0226o0 c0226o0, long j) {
            c0226o0.getClass();
            if (j == -9223372036854775807L) {
                C0196e0 c0196e0 = c0226o0.f1242e;
                if (c0196e0.f1080c != Long.MIN_VALUE) {
                    j = AbstractC1118i0.m2447f0(c0196e0.f1081d - c0196e0.f1079b);
                }
            }
            AbstractC1101a.m2361l("Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.", this.mediaSourceFactory);
            return add(this.mediaSourceFactory.createMediaSource(c0226o0), j);
        }

        public Builder add(MediaSource mediaSource, long j) {
            mediaSource.getClass();
            AbstractC1101a.m2358i("Progressive media source must define an initial placeholder duration.", ((mediaSource instanceof ProgressiveMediaSource) && j == -9223372036854775807L) ? false : true);
            C0974j0 c0974j0 = this.mediaSourceHoldersBuilder;
            int i = this.index;
            this.index = i + 1;
            c0974j0.m2141a(new MediaSourceHolder(mediaSource, i, AbstractC1118i0.m2428S(j)));
            return this;
        }

        public Builder add(MediaSource mediaSource) {
            return add(mediaSource, -9223372036854775807L);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class ConcatenatedTimeline extends AbstractC0230p1 {
        private final long defaultPositionUs;
        private final long durationUs;
        private final AbstractC0983m0 firstPeriodIndices;
        private final boolean isDynamic;
        private final boolean isSeekable;
        private final Object manifest;
        private final C0226o0 mediaItem;
        private final AbstractC0983m0 periodOffsetsInWindowUs;
        private final AbstractC0983m0 timelines;

        public ConcatenatedTimeline(C0226o0 c0226o0, AbstractC0983m0 abstractC0983m0, AbstractC0983m0 abstractC0983m02, AbstractC0983m0 abstractC0983m03, boolean z7, boolean z8, long j, long j8, Object obj) {
            this.mediaItem = c0226o0;
            this.timelines = abstractC0983m0;
            this.firstPeriodIndices = abstractC0983m02;
            this.periodOffsetsInWindowUs = abstractC0983m03;
            this.isSeekable = z7;
            this.isDynamic = z8;
            this.durationUs = j;
            this.defaultPositionUs = j8;
            this.manifest = obj;
        }

        private int getChildIndexByPeriodIndex(int i) {
            return AbstractC1118i0.m2440c(this.firstPeriodIndices, Integer.valueOf(i + 1), false, false);
        }

        private long getPeriodDurationUs(C0221m1 c0221m1, int i) {
            if (c0221m1.f1207d == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return (i == this.periodOffsetsInWindowUs.size() + (-1) ? this.durationUs : ((Long) this.periodOffsetsInWindowUs.get(i + 1)).longValue()) - ((Long) this.periodOffsetsInWindowUs.get(i)).longValue();
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public int getIndexOfPeriod(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            int indexOfPeriod = ((AbstractC0230p1) this.timelines.get(childIndex)).getIndexOfPeriod(ConcatenatingMediaSource2.getChildPeriodUid(obj));
            if (indexOfPeriod == -1) {
                return -1;
            }
            return ((Integer) this.firstPeriodIndices.get(childIndex)).intValue() + indexOfPeriod;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            ((AbstractC0230p1) this.timelines.get(childIndexByPeriodIndex)).getPeriod(i - ((Integer) this.firstPeriodIndices.get(childIndexByPeriodIndex)).intValue(), c0221m1, z7);
            c0221m1.f1206c = 0;
            c0221m1.f1208e = ((Long) this.periodOffsetsInWindowUs.get(i)).longValue();
            c0221m1.f1207d = getPeriodDurationUs(c0221m1, i);
            if (z7) {
                Object obj = c0221m1.f1205b;
                obj.getClass();
                c0221m1.f1205b = ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, obj);
            }
            return c0221m1;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public C0221m1 getPeriodByUid(Object obj, C0221m1 c0221m1) {
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            Object childPeriodUid = ConcatenatingMediaSource2.getChildPeriodUid(obj);
            AbstractC0230p1 abstractC0230p1 = (AbstractC0230p1) this.timelines.get(childIndex);
            int indexOfPeriod = abstractC0230p1.getIndexOfPeriod(childPeriodUid) + ((Integer) this.firstPeriodIndices.get(childIndex)).intValue();
            abstractC0230p1.getPeriodByUid(childPeriodUid, c0221m1);
            c0221m1.f1206c = 0;
            c0221m1.f1208e = ((Long) this.periodOffsetsInWindowUs.get(indexOfPeriod)).longValue();
            c0221m1.f1207d = getPeriodDurationUs(c0221m1, indexOfPeriod);
            c0221m1.f1205b = obj;
            return c0221m1;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public int getPeriodCount() {
            return this.periodOffsetsInWindowUs.size();
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public Object getUidOfPeriod(int i) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
            return ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, ((AbstractC0230p1) this.timelines.get(childIndexByPeriodIndex)).getUidOfPeriod(i - ((Integer) this.firstPeriodIndices.get(childIndexByPeriodIndex)).intValue()));
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public C0227o1 getWindow(int i, C0227o1 c0227o1, long j) {
            c0227o1.m655b(C0227o1.f1250q, this.mediaItem, this.manifest, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.isSeekable, this.isDynamic, null, this.defaultPositionUs, this.durationUs, 0, getPeriodCount() - 1, -((Long) this.periodOffsetsInWindowUs.get(0)).longValue());
            return c0227o1;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public int getWindowCount() {
            return 1;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MediaSourceHolder {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final MaskingMediaSource mediaSource;
        public final HashMap<Object, Long> periodTimeOffsetsByUid = new HashMap<>();

        public MediaSourceHolder(MediaSource mediaSource, int i, long j) {
            this.mediaSource = new MaskingMediaSource(mediaSource, false);
            this.index = i;
            this.initialPlaceholderDurationUs = j;
        }
    }

    private void disableUnusedMediaSources() {
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) this.mediaSourceHolders.get(i);
            if (mediaSourceHolder.activeMediaPeriods == 0) {
                disableChildSource(Integer.valueOf(mediaSourceHolder.index));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getChildIndex(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long j, int i) {
        return (int) (j % i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getChildPeriodUid(Object obj) {
        return ((Pair) obj).second;
    }

    private static long getChildWindowSequenceNumber(long j, int i, int i4) {
        return (j * i) + i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getPeriodUid(int i, Object obj) {
        return Pair.create(Integer.valueOf(i), obj);
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j, int i) {
        return j / i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            updateTimeline();
        }
        return true;
    }

    private ConcatenatedTimeline maybeCreateConcatenatedTimeline() {
        C0974j0 c0974j0;
        C0974j0 c0974j02;
        int i;
        long j;
        long j8;
        C0227o1 c0227o1;
        boolean z7;
        ConcatenatingMediaSource2 concatenatingMediaSource2 = this;
        C0227o1 c0227o12 = new C0227o1();
        C0221m1 c0221m1 = new C0221m1();
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        C0974j0 c0974j0M2164i2 = AbstractC0983m0.m2164i();
        C0974j0 c0974j0M2164i3 = AbstractC0983m0.m2164i();
        int size = concatenatingMediaSource2.mediaSourceHolders.size();
        boolean z8 = true;
        boolean z9 = true;
        boolean z10 = true;
        int i4 = 0;
        Object obj = null;
        int periodCount = 0;
        boolean z11 = false;
        boolean z12 = false;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        while (i4 < size) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) concatenatingMediaSource2.mediaSourceHolders.get(i4);
            AbstractC0230p1 timeline = mediaSourceHolder.mediaSource.getTimeline();
            AbstractC1101a.m2352c("Can't concatenate empty child Timeline.", timeline.isEmpty() ^ z8);
            c0974j0M2164i.m2141a(timeline);
            c0974j0M2164i2.m2141a(Integer.valueOf(periodCount));
            periodCount += timeline.getPeriodCount();
            int i8 = 0;
            while (i8 < timeline.getWindowCount()) {
                timeline.getWindow(i8, c0227o12);
                if (!z11) {
                    z11 = z8;
                    obj = c0227o12.f1263d;
                }
                z9 = (z9 && Objects.equals(obj, c0227o12.f1263d)) ? z8 : false;
                AbstractC0230p1 abstractC0230p1 = timeline;
                long j12 = c0227o12.f1272m;
                if (j12 == -9223372036854775807L) {
                    j12 = mediaSourceHolder.initialPlaceholderDurationUs;
                    if (j12 == -9223372036854775807L) {
                        return null;
                    }
                }
                j9 += j12;
                if (mediaSourceHolder.index == 0 && i8 == 0) {
                    c0974j0 = c0974j0M2164i;
                    c0974j02 = c0974j0M2164i2;
                    j10 = c0227o12.f1271l;
                    j11 = -c0227o12.f1275p;
                } else {
                    c0974j0 = c0974j0M2164i;
                    c0974j02 = c0974j0M2164i2;
                }
                z10 &= c0227o12.f1267h || c0227o12.f1270k;
                z12 |= c0227o12.f1268i;
                int i9 = c0227o12.f1273n;
                while (i9 <= c0227o12.f1274o) {
                    c0974j0M2164i3.m2141a(Long.valueOf(j11));
                    AbstractC0230p1 abstractC0230p12 = abstractC0230p1;
                    abstractC0230p12.getPeriod(i9, c0221m1, true);
                    C0974j0 c0974j03 = c0974j0M2164i3;
                    long j13 = c0221m1.f1207d;
                    if (j13 == -9223372036854775807L) {
                        AbstractC1101a.m2352c("Can't apply placeholder duration to multiple periods with unknown duration in a single window.", c0227o12.f1273n == c0227o12.f1274o);
                        j13 = c0227o12.f1275p + j12;
                    }
                    if (i9 != c0227o12.f1273n || ((mediaSourceHolder.index == 0 && i8 == 0) || j13 == -9223372036854775807L)) {
                        i = i9;
                        j = j13;
                        j8 = 0;
                    } else {
                        i = i9;
                        j8 = -c0227o12.f1275p;
                        j = j13 + j8;
                    }
                    Object obj2 = c0221m1.f1205b;
                    obj2.getClass();
                    int i10 = i;
                    if (mediaSourceHolder.activeMediaPeriods == 0 || !mediaSourceHolder.periodTimeOffsetsByUid.containsKey(obj2)) {
                        c0227o1 = c0227o12;
                    } else {
                        c0227o1 = c0227o12;
                        if (!mediaSourceHolder.periodTimeOffsetsByUid.get(obj2).equals(Long.valueOf(j8))) {
                            z7 = false;
                        }
                        AbstractC1101a.m2352c("Can't handle windows with changing offset in first period.", z7);
                        mediaSourceHolder.periodTimeOffsetsByUid.put(obj2, Long.valueOf(j8));
                        j11 += j;
                        i9 = i10 + 1;
                        c0974j0M2164i3 = c0974j03;
                        abstractC0230p1 = abstractC0230p12;
                        c0227o12 = c0227o1;
                    }
                    z7 = true;
                    AbstractC1101a.m2352c("Can't handle windows with changing offset in first period.", z7);
                    mediaSourceHolder.periodTimeOffsetsByUid.put(obj2, Long.valueOf(j8));
                    j11 += j;
                    i9 = i10 + 1;
                    c0974j0M2164i3 = c0974j03;
                    abstractC0230p1 = abstractC0230p12;
                    c0227o12 = c0227o1;
                }
                i8++;
                c0974j0M2164i = c0974j0;
                c0974j0M2164i2 = c0974j02;
                timeline = abstractC0230p1;
                z8 = true;
            }
            i4++;
            concatenatingMediaSource2 = this;
            z8 = true;
        }
        return new ConcatenatedTimeline(getMediaItem(), c0974j0M2164i.m2159f(), c0974j0M2164i2.m2159f(), c0974j0M2164i3.m2159f(), z10, z12, j9, j10, z9 ? obj : null);
    }

    private void scheduleTimelineUpdate() {
        if (this.timelineUpdateScheduled) {
            return;
        }
        Handler handler = this.playbackThreadHandler;
        handler.getClass();
        handler.obtainMessage(1).sendToTarget();
        this.timelineUpdateScheduled = true;
    }

    private void updateTimeline() {
        this.timelineUpdateScheduled = false;
        ConcatenatedTimeline concatenatedTimelineMaybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (concatenatedTimelineMaybeCreateConcatenatedTimeline != null) {
            refreshSourceInfo(concatenatedTimelineMaybeCreateConcatenatedTimeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(C0226o0 c0226o0) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        long jLongValue;
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) this.mediaSourceHolders.get(getChildIndex(mediaPeriodId.periodUid));
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithWindowSequenceNumber = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size(), mediaSourceHolder.index));
        enableChildSource(Integer.valueOf(mediaSourceHolder.index));
        mediaSourceHolder.activeMediaPeriods++;
        if (mediaPeriodId.isAd()) {
            jLongValue = 0;
        } else {
            Long l8 = mediaSourceHolder.periodTimeOffsetsByUid.get(mediaPeriodIdCopyWithWindowSequenceNumber.periodUid);
            l8.getClass();
            jLongValue = l8.longValue();
        }
        TimeOffsetMediaPeriod timeOffsetMediaPeriod = new TimeOffsetMediaPeriod(mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithWindowSequenceNumber, allocator, j - jLongValue), jLongValue);
        this.mediaSourceByMediaPeriod.put(timeOffsetMediaPeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return timeOffsetMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void enableInternal() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public AbstractC0230p1 getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized C0226o0 getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(Integer num, int i) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(InterfaceC1557c0 interfaceC1557c0) {
        super.prepareSourceInternal(interfaceC1557c0);
        this.playbackThreadHandler = new Handler(new C0438b(this, 1));
        for (int i = 0; i < this.mediaSourceHolders.size(); i++) {
            prepareChildSource(Integer.valueOf(i), ((MediaSourceHolder) this.mediaSourceHolders.get(i)).mediaSource);
        }
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder mediaSourceHolderRemove = this.mediaSourceByMediaPeriod.remove(mediaPeriod);
        mediaSourceHolderRemove.getClass();
        mediaSourceHolderRemove.mediaSource.releasePeriod(((TimeOffsetMediaPeriod) mediaPeriod).getWrappedMediaPeriod());
        mediaSourceHolderRemove.activeMediaPeriods--;
        if (this.mediaSourceByMediaPeriod.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(C0226o0 c0226o0) {
        this.mediaItem = c0226o0;
    }

    private ConcatenatingMediaSource2(C0226o0 c0226o0, AbstractC0983m0 abstractC0983m0) {
        this.mediaItem = c0226o0;
        this.mediaSourceHolders = abstractC0983m0;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size())) {
            return null;
        }
        return mediaPeriodId.copyWithPeriodUid(getPeriodUid(num.intValue(), mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size()));
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public long getMediaTimeForChildMediaTime(Integer num, long j, MediaSource.MediaPeriodId mediaPeriodId) {
        Long l8;
        return (j == -9223372036854775807L || mediaPeriodId == null || mediaPeriodId.isAd() || (l8 = ((MediaSourceHolder) this.mediaSourceHolders.get(num.intValue())).periodTimeOffsetsByUid.get(mediaPeriodId.periodUid)) == null) ? j : AbstractC1118i0.m2447f0(l8.longValue()) + j;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    /* renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Integer num, MediaSource mediaSource, AbstractC0230p1 abstractC0230p1) {
        scheduleTimelineUpdate();
    }
}
