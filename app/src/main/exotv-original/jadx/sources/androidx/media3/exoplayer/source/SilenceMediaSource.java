package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0184b0;
import androidx.media3.common.C0188c0;
import androidx.media3.common.C0196e0;
import androidx.media3.common.C0199f0;
import androidx.media3.common.C0202g0;
import androidx.media3.common.C0205h0;
import androidx.media3.common.C0208i0;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0214k0;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0235r0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.C2181z;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p089k1.InterfaceC1557c0;
import p106m1.C1872g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class SilenceMediaSource extends BaseMediaSource {
    private static final int CHANNEL_COUNT = 2;
    private static final C0249w FORMAT;
    public static final String MEDIA_ID = "SilenceMediaSource";
    private static final C0226o0 MEDIA_ITEM;
    private static final int PCM_ENCODING = 2;
    private static final int SAMPLE_RATE_HZ = 44100;
    private static final byte[] SILENCE_SAMPLE;
    private final long durationUs;
    private C0226o0 mediaItem;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Factory {
        private long durationUs;
        private Object tag;

        public SilenceMediaSource createMediaSource() {
            AbstractC1101a.m2359j(this.durationUs > 0);
            long j = this.durationUs;
            C0184b0 c0184b0M652a = SilenceMediaSource.MEDIA_ITEM.m652a();
            c0184b0M652a.f1039j = this.tag;
            return new SilenceMediaSource(j, c0184b0M652a.m608a());
        }

        public Factory setDurationUs(long j) {
            this.durationUs = j;
            return this;
        }

        public Factory setTag(Object obj) {
            this.tag = obj;
            return this;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SilenceMediaPeriod implements MediaPeriod {
        private static final TrackGroupArray TRACKS = new TrackGroupArray(new C0233q1(C2181z.FRAGMENT_ENCODE_SET, SilenceMediaSource.FORMAT));
        private final long durationUs;
        private final ArrayList<SampleStream> sampleStreams = new ArrayList<>();

        public SilenceMediaPeriod(long j) {
            this.durationUs = j;
        }

        private long constrainSeekPosition(long j) {
            return AbstractC1118i0.m2452k(j, 0L, this.durationUs);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(LoadingInfo loadingInfo) {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void discardBuffer(long j, boolean z7) {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
            return constrainSeekPosition(j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return TRACKS;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void maybeThrowPrepareError() {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long j) {
            callback.onPrepared(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long readDiscontinuity() {
            return -9223372036854775807L;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long seekToUs(long j) {
            long jConstrainSeekPosition = constrainSeekPosition(j);
            for (int i = 0; i < this.sampleStreams.size(); i++) {
                ((SilenceSampleStream) this.sampleStreams.get(i)).seekTo(jConstrainSeekPosition);
            }
            return jConstrainSeekPosition;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            long jConstrainSeekPosition = constrainSeekPosition(j);
            for (int i = 0; i < exoTrackSelectionArr.length; i++) {
                SampleStream sampleStream = sampleStreamArr[i];
                if (sampleStream != null && (exoTrackSelectionArr[i] == null || !zArr[i])) {
                    this.sampleStreams.remove(sampleStream);
                    sampleStreamArr[i] = null;
                }
                if (sampleStreamArr[i] == null && exoTrackSelectionArr[i] != null) {
                    SilenceSampleStream silenceSampleStream = new SilenceSampleStream(this.durationUs);
                    silenceSampleStream.seekTo(jConstrainSeekPosition);
                    this.sampleStreams.add(silenceSampleStream);
                    sampleStreamArr[i] = silenceSampleStream;
                    zArr2[i] = true;
                }
            }
            return jConstrainSeekPosition;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SilenceSampleStream implements SampleStream {
        private final long durationBytes;
        private long positionBytes;
        private boolean sentFormat;

        public SilenceSampleStream(long j) {
            this.durationBytes = SilenceMediaSource.getAudioByteCount(j);
            seekTo(0L);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, C1872g c1872g, int i) {
            if (!this.sentFormat || (i & 2) != 0) {
                formatHolder.format = SilenceMediaSource.FORMAT;
                this.sentFormat = true;
                return -5;
            }
            long j = this.durationBytes;
            long j8 = this.positionBytes;
            long j9 = j - j8;
            if (j9 == 0) {
                c1872g.addFlag(4);
                return -4;
            }
            c1872g.timeUs = SilenceMediaSource.getAudioPositionUs(j8);
            c1872g.addFlag(1);
            int iMin = (int) Math.min(SilenceMediaSource.SILENCE_SAMPLE.length, j9);
            if ((i & 4) == 0) {
                c1872g.ensureSpaceForWrite(iMin);
                c1872g.data.put(SilenceMediaSource.SILENCE_SAMPLE, 0, iMin);
            }
            if ((i & 1) == 0) {
                this.positionBytes += iMin;
            }
            return -4;
        }

        public void seekTo(long j) {
            this.positionBytes = AbstractC1118i0.m2452k(SilenceMediaSource.getAudioByteCount(j), 0L, this.durationBytes);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            long j8 = this.positionBytes;
            seekTo(j);
            return (int) ((this.positionBytes - j8) / SilenceMediaSource.SILENCE_SAMPLE.length);
        }
    }

    static {
        C0211j0 c0211j0;
        C0246v c0246v = new C0246v();
        c0246v.f1447m = AbstractC0244u0.m687p("audio/raw");
        c0246v.f1425B = 2;
        c0246v.f1426C = SAMPLE_RATE_HZ;
        c0246v.f1427D = 2;
        C0249w c0249w = new C0249w(c0246v);
        FORMAT = c0249w;
        C0188c0 c0188c0 = new C0188c0();
        C0199f0 c0199f0 = new C0199f0();
        List list = Collections.EMPTY_LIST;
        C0981l1 c0981l1 = C0981l1.f4211n;
        C0205h0 c0205h0 = new C0205h0();
        C0214k0 c0214k0 = C0214k0.f1167d;
        Uri uri = Uri.EMPTY;
        AbstractC1101a.m2359j(c0199f0.f1091b == null || c0199f0.f1090a != null);
        C0202g0 c0202g0 = null;
        if (uri != null) {
            if (c0199f0.f1090a != null) {
                c0202g0 = new C0202g0(c0199f0);
            }
            c0211j0 = new C0211j0(uri, c0249w.f1522n, c0202g0, null, list, null, c0981l1, null, -9223372036854775807L);
        } else {
            c0211j0 = null;
        }
        MEDIA_ITEM = new C0226o0(MEDIA_ID, new C0196e0(c0188c0), c0211j0, new C0208i0(c0205h0), C0235r0.f1329K, c0214k0);
        SILENCE_SAMPLE = new byte[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioByteCount(long j) {
        int i = AbstractC1118i0.f4750a;
        return 4 * ((j * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getAudioPositionUs(long j) {
        int i = AbstractC1118i0.f4750a;
        return ((j / 4) * 1000000) / 44100;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(C0226o0 c0226o0) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return new SilenceMediaPeriod(this.durationUs);
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
        refreshSourceInfo(new SinglePeriodTimeline(this.durationUs, true, false, false, (Object) null, getMediaItem()));
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(C0226o0 c0226o0) {
        this.mediaItem = c0226o0;
    }

    public SilenceMediaSource(long j) {
        this(j, MEDIA_ITEM);
    }

    private SilenceMediaSource(long j, C0226o0 c0226o0) {
        AbstractC1101a.m2353d(j >= 0);
        this.durationUs = j;
        this.mediaItem = c0226o0;
    }
}
