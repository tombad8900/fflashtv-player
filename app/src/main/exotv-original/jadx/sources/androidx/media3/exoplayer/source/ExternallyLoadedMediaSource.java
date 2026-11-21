package androidx.media3.exoplayer.source;

import androidx.media3.common.C0211j0;
import androidx.media3.common.C0226o0;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.util.Objects;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p089k1.InterfaceC1557c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ExternallyLoadedMediaSource extends BaseMediaSource {
    private final ExternalLoader externalLoader;
    private C0226o0 mediaItem;
    private final long timelineDurationUs;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Factory implements MediaSource.Factory {
        private final ExternalLoader externalLoader;
        private final long timelineDurationUs;

        public Factory(long j, ExternalLoader externalLoader) {
            this.timelineDurationUs = j;
            this.externalLoader = externalLoader;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{4};
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource.Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource.Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public ExternallyLoadedMediaSource createMediaSource(C0226o0 c0226o0) {
            return new ExternallyLoadedMediaSource(c0226o0, this.timelineDurationUs, this.externalLoader);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(C0226o0 c0226o0) {
        C0211j0 c0211j0 = c0226o0.f1239b;
        C0211j0 c0211j02 = getMediaItem().f1239b;
        c0211j02.getClass();
        if (c0211j0 == null || !c0211j0.f1147a.equals(c0211j02.f1147a) || !Objects.equals(c0211j0.f1148b, c0211j02.f1148b)) {
            return false;
        }
        long j = c0211j0.f1155i;
        return j == -9223372036854775807L || AbstractC1118i0.m2428S(j) == this.timelineDurationUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        C0226o0 mediaItem = getMediaItem();
        mediaItem.f1239b.getClass();
        C0211j0 c0211j0 = mediaItem.f1239b;
        AbstractC1101a.m2357h("Externally loaded mediaItems require a MIME type.", c0211j0.f1148b);
        return new ExternallyLoadedMediaPeriod(c0211j0.f1147a, c0211j0.f1148b, this.externalLoader);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized C0226o0 getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(InterfaceC1557c0 interfaceC1557c0) {
        refreshSourceInfo(new SinglePeriodTimeline(this.timelineDurationUs, true, false, false, (Object) null, getMediaItem()));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((ExternallyLoadedMediaPeriod) mediaPeriod).releasePeriod();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(C0226o0 c0226o0) {
        this.mediaItem = c0226o0;
    }

    private ExternallyLoadedMediaSource(C0226o0 c0226o0, long j, ExternalLoader externalLoader) {
        this.mediaItem = c0226o0;
        this.timelineDurationUs = j;
        this.externalLoader = externalLoader;
    }
}
