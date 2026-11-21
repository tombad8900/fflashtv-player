package androidx.media3.exoplayer.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.AbstractC0213k;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0189c1;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0227o1;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0251w1;
import androidx.media3.common.C0253x0;
import androidx.media3.common.C0254x1;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlaybackSessionManager;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p063h1.AbstractC1118i0;
import p063h1.C1129t;
import p089k1.AbstractC1578v;
import p089k1.C1559d0;
import p089k1.C1573q;
import p089k1.C1577u;
import p089k1.C1579w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class MediaMetricsListener implements AnalyticsListener, PlaybackSessionManager.Listener {
    private String activeSessionId;
    private int audioUnderruns;
    private final Context context;
    private C0249w currentAudioFormat;
    private C0249w currentTextFormat;
    private C0249w currentVideoFormat;
    private int discontinuityReason;
    private int droppedFrames;
    private boolean hasFatalError;
    private int ioErrorType;
    private boolean isSeeking;
    private PlaybackMetrics.Builder metricsBuilder;
    private PendingFormatUpdate pendingAudioFormat;
    private C0253x0 pendingPlayerError;
    private PendingFormatUpdate pendingTextFormat;
    private PendingFormatUpdate pendingVideoFormat;
    private final PlaybackSession playbackSession;
    private int playedFrames;
    private boolean reportedEventsForCurrentSession;
    private final PlaybackSessionManager sessionManager;
    private final C0227o1 window = new C0227o1();
    private final C0221m1 period = new C0221m1();
    private final HashMap<String, Long> bandwidthBytes = new HashMap<>();
    private final HashMap<String, Long> bandwidthTimeMs = new HashMap<>();
    private final long startTimeMs = SystemClock.elapsedRealtime();
    private int currentPlaybackState = 0;
    private int currentNetworkType = 0;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class ErrorInfo {
        public final int errorCode;
        public final int subErrorCode;

        public ErrorInfo(int i, int i4) {
            this.errorCode = i;
            this.subErrorCode = i4;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class PendingFormatUpdate {
        public final C0249w format;
        public final int selectionReason;
        public final String sessionId;

        public PendingFormatUpdate(C0249w c0249w, int i, String str) {
            this.format = c0249w;
            this.selectionReason = i;
            this.sessionId = str;
        }
    }

    private MediaMetricsListener(Context context, PlaybackSession playbackSession) {
        this.context = context.getApplicationContext();
        this.playbackSession = playbackSession;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        defaultPlaybackSessionManager.setListener(this);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private boolean canReportPendingFormatUpdate(PendingFormatUpdate pendingFormatUpdate) {
        return pendingFormatUpdate != null && pendingFormatUpdate.sessionId.equals(this.sessionManager.getActiveSessionId());
    }

    public static MediaMetricsListener create(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new MediaMetricsListener(context, mediaMetricsManager.createPlaybackSession());
    }

    private void finishCurrentSession() {
        PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (builder != null && this.reportedEventsForCurrentSession) {
            builder.setAudioUnderrunCount(this.audioUnderruns);
            this.metricsBuilder.setVideoFramesDropped(this.droppedFrames);
            this.metricsBuilder.setVideoFramesPlayed(this.playedFrames);
            Long l8 = this.bandwidthTimeMs.get(this.activeSessionId);
            this.metricsBuilder.setNetworkTransferDurationMillis(l8 == null ? 0L : l8.longValue());
            Long l9 = this.bandwidthBytes.get(this.activeSessionId);
            this.metricsBuilder.setNetworkBytesRead(l9 == null ? 0L : l9.longValue());
            this.metricsBuilder.setStreamSource((l9 == null || l9.longValue() <= 0) ? 0 : 1);
            this.playbackSession.reportPlaybackMetrics(this.metricsBuilder.build());
        }
        this.metricsBuilder = null;
        this.activeSessionId = null;
        this.audioUnderruns = 0;
        this.droppedFrames = 0;
        this.playedFrames = 0;
        this.currentVideoFormat = null;
        this.currentAudioFormat = null;
        this.currentTextFormat = null;
        this.reportedEventsForCurrentSession = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int getDrmErrorCode(int i) {
        switch (AbstractC1118i0.m2466y(i)) {
            case C0253x0.ERROR_CODE_DRM_PROVISIONING_FAILED /* 6002 */:
                return 24;
            case C0253x0.ERROR_CODE_DRM_CONTENT_ERROR /* 6003 */:
                return 28;
            case C0253x0.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                return 25;
            case C0253x0.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    private static C0237s getDrmInitData(AbstractC0983m0 abstractC0983m0) {
        C0237s c0237s;
        C0977k0 c0977k0ListIterator = abstractC0983m0.listIterator(0);
        while (c0977k0ListIterator.hasNext()) {
            C0251w1 c0251w1 = (C0251w1) c0977k0ListIterator.next();
            for (int i = 0; i < c0251w1.f1537a; i++) {
                if (c0251w1.f1541e[i] && (c0237s = c0251w1.m696a(i).f1526r) != null) {
                    return c0237s;
                }
            }
        }
        return null;
    }

    private static int getDrmType(C0237s c0237s) {
        for (int i = 0; i < c0237s.f1408m; i++) {
            UUID uuid = c0237s.f1405j[i].f1325k;
            if (uuid.equals(AbstractC0213k.f1165d)) {
                return 3;
            }
            if (uuid.equals(AbstractC0213k.f1166e)) {
                return 2;
            }
            if (uuid.equals(AbstractC0213k.f1164c)) {
                return 6;
            }
        }
        return 1;
    }

    private static ErrorInfo getErrorInfo(C0253x0 c0253x0, Context context, boolean z7) throws NumberFormatException {
        int i;
        boolean z8;
        if (c0253x0.errorCode == 1001) {
            return new ErrorInfo(20, 0);
        }
        if (c0253x0 instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) c0253x0;
            z8 = exoPlaybackException.type == 1;
            i = exoPlaybackException.rendererFormatSupport;
        } else {
            i = 0;
            z8 = false;
        }
        Throwable cause = c0253x0.getCause();
        cause.getClass();
        if (!(cause instanceof IOException)) {
            if (z8 && (i == 0 || i == 1)) {
                return new ErrorInfo(35, 0);
            }
            if (z8 && i == 3) {
                return new ErrorInfo(15, 0);
            }
            if (z8 && i == 2) {
                return new ErrorInfo(23, 0);
            }
            if (cause instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new ErrorInfo(13, AbstractC1118i0.m2467z(((MediaCodecRenderer.DecoderInitializationException) cause).diagnosticInfo));
            }
            if (cause instanceof MediaCodecDecoderException) {
                return new ErrorInfo(14, ((MediaCodecDecoderException) cause).errorCode);
            }
            if (cause instanceof OutOfMemoryError) {
                return new ErrorInfo(14, 0);
            }
            if (cause instanceof AudioSink.InitializationException) {
                return new ErrorInfo(17, ((AudioSink.InitializationException) cause).audioTrackState);
            }
            if (cause instanceof AudioSink.WriteException) {
                return new ErrorInfo(18, ((AudioSink.WriteException) cause).errorCode);
            }
            if (!(cause instanceof MediaCodec.CryptoException)) {
                return new ErrorInfo(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
            return new ErrorInfo(getDrmErrorCode(errorCode), errorCode);
        }
        if (cause instanceof C1579w) {
            return new ErrorInfo(5, ((C1579w) cause).f6043m);
        }
        if ((cause instanceof AbstractC1578v) || (cause instanceof C0247v0)) {
            return new ErrorInfo(z7 ? 10 : 11, 0);
        }
        boolean z9 = cause instanceof C1577u;
        if (z9 || (cause instanceof C1559d0)) {
            if (C1129t.m2479b(context).m2480c() == 1) {
                return new ErrorInfo(3, 0);
            }
            Throwable cause2 = cause.getCause();
            return cause2 instanceof UnknownHostException ? new ErrorInfo(6, 0) : cause2 instanceof SocketTimeoutException ? new ErrorInfo(7, 0) : (z9 && ((C1577u) cause).f6042l == 1) ? new ErrorInfo(4, 0) : new ErrorInfo(8, 0);
        }
        if (c0253x0.errorCode == 1002) {
            return new ErrorInfo(21, 0);
        }
        if (cause instanceof DrmSession.DrmSessionException) {
            Throwable cause3 = cause.getCause();
            cause3.getClass();
            if (!(cause3 instanceof MediaDrm.MediaDrmStateException)) {
                return (AbstractC1118i0.f4750a < 23 || !(cause3 instanceof MediaDrmResetException)) ? cause3 instanceof NotProvisionedException ? new ErrorInfo(24, 0) : cause3 instanceof DeniedByServerException ? new ErrorInfo(29, 0) : cause3 instanceof UnsupportedDrmException ? new ErrorInfo(23, 0) : cause3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new ErrorInfo(28, 0) : new ErrorInfo(30, 0) : new ErrorInfo(27, 0);
            }
            int iM2467z = AbstractC1118i0.m2467z(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
            return new ErrorInfo(getDrmErrorCode(iM2467z), iM2467z);
        }
        if (!(cause instanceof C1573q) || !(cause.getCause() instanceof FileNotFoundException)) {
            return new ErrorInfo(9, 0);
        }
        Throwable cause4 = cause.getCause();
        cause4.getClass();
        Throwable cause5 = cause4.getCause();
        return ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new ErrorInfo(32, 0) : new ErrorInfo(31, 0);
    }

    private static Pair<String, String> getLanguageAndRegion(String str) {
        int i = AbstractC1118i0.f4750a;
        String[] strArrSplit = str.split("-", -1);
        return Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
    }

    private static int getNetworkType(Context context) {
        switch (C1129t.m2479b(context).m2480c()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int getStreamType(C0226o0 c0226o0) {
        C0211j0 c0211j0 = c0226o0.f1239b;
        if (c0211j0 == null) {
            return 0;
        }
        int iM2420K = AbstractC1118i0.m2420K(c0211j0.f1147a, c0211j0.f1148b);
        if (iM2420K == 0) {
            return 3;
        }
        if (iM2420K != 1) {
            return iM2420K != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int getTrackChangeReason(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    private void maybeAddSessions(AnalyticsListener.Events events) {
        for (int i = 0; i < events.size(); i++) {
            int i4 = events.get(i);
            AnalyticsListener.EventTime eventTime = events.getEventTime(i4);
            if (i4 == 0) {
                this.sessionManager.updateSessionsWithTimelineChange(eventTime);
            } else if (i4 == 11) {
                this.sessionManager.updateSessionsWithDiscontinuity(eventTime, this.discontinuityReason);
            } else {
                this.sessionManager.updateSessions(eventTime);
            }
        }
    }

    private void maybeReportNetworkChange(long j) {
        int networkType = getNetworkType(this.context);
        if (networkType != this.currentNetworkType) {
            this.currentNetworkType = networkType;
            this.playbackSession.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(networkType).setTimeSinceCreatedMillis(j - this.startTimeMs).build());
        }
    }

    private void maybeReportPlaybackError(long j) throws NumberFormatException {
        C0253x0 c0253x0 = this.pendingPlayerError;
        if (c0253x0 == null) {
            return;
        }
        ErrorInfo errorInfo = getErrorInfo(c0253x0, this.context, this.ioErrorType == 4);
        this.playbackSession.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j - this.startTimeMs).setErrorCode(errorInfo.errorCode).setSubErrorCode(errorInfo.subErrorCode).setException(c0253x0).build());
        this.reportedEventsForCurrentSession = true;
        this.pendingPlayerError = null;
    }

    private void maybeReportPlaybackStateChange(InterfaceC0193d1 interfaceC0193d1, AnalyticsListener.Events events, long j) {
        if (interfaceC0193d1.getPlaybackState() != 2) {
            this.isSeeking = false;
        }
        if (interfaceC0193d1.getPlayerError() == null) {
            this.hasFatalError = false;
        } else if (events.contains(10)) {
            this.hasFatalError = true;
        }
        int iResolveNewPlaybackState = resolveNewPlaybackState(interfaceC0193d1);
        if (this.currentPlaybackState != iResolveNewPlaybackState) {
            this.currentPlaybackState = iResolveNewPlaybackState;
            this.reportedEventsForCurrentSession = true;
            this.playbackSession.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.currentPlaybackState).setTimeSinceCreatedMillis(j - this.startTimeMs).build());
        }
    }

    private void maybeReportTrackChanges(InterfaceC0193d1 interfaceC0193d1, AnalyticsListener.Events events, long j) {
        if (events.contains(2)) {
            C0254x1 currentTracks = interfaceC0193d1.getCurrentTracks();
            boolean zM698a = currentTracks.m698a(2);
            boolean zM698a2 = currentTracks.m698a(1);
            boolean zM698a3 = currentTracks.m698a(3);
            if (zM698a || zM698a2 || zM698a3) {
                if (!zM698a) {
                    maybeUpdateVideoFormat(j, null, 0);
                }
                if (!zM698a2) {
                    maybeUpdateAudioFormat(j, null, 0);
                }
                if (!zM698a3) {
                    maybeUpdateTextFormat(j, null, 0);
                }
            }
        }
        if (canReportPendingFormatUpdate(this.pendingVideoFormat)) {
            PendingFormatUpdate pendingFormatUpdate = this.pendingVideoFormat;
            C0249w c0249w = pendingFormatUpdate.format;
            if (c0249w.f1530v != -1) {
                maybeUpdateVideoFormat(j, c0249w, pendingFormatUpdate.selectionReason);
                this.pendingVideoFormat = null;
            }
        }
        if (canReportPendingFormatUpdate(this.pendingAudioFormat)) {
            PendingFormatUpdate pendingFormatUpdate2 = this.pendingAudioFormat;
            maybeUpdateAudioFormat(j, pendingFormatUpdate2.format, pendingFormatUpdate2.selectionReason);
            this.pendingAudioFormat = null;
        }
        if (canReportPendingFormatUpdate(this.pendingTextFormat)) {
            PendingFormatUpdate pendingFormatUpdate3 = this.pendingTextFormat;
            maybeUpdateTextFormat(j, pendingFormatUpdate3.format, pendingFormatUpdate3.selectionReason);
            this.pendingTextFormat = null;
        }
    }

    private void maybeUpdateAudioFormat(long j, C0249w c0249w, int i) {
        C0249w c0249w2 = this.currentAudioFormat;
        int i4 = AbstractC1118i0.f4750a;
        if (Objects.equals(c0249w2, c0249w)) {
            return;
        }
        if (this.currentAudioFormat == null && i == 0) {
            i = 1;
        }
        this.currentAudioFormat = c0249w;
        reportTrackChangeEvent(0, j, c0249w, i);
    }

    private void maybeUpdateMetricsBuilderValues(InterfaceC0193d1 interfaceC0193d1, AnalyticsListener.Events events) {
        C0237s drmInitData;
        if (events.contains(0)) {
            AnalyticsListener.EventTime eventTime = events.getEventTime(0);
            if (this.metricsBuilder != null) {
                maybeUpdateTimelineMetadata(eventTime.timeline, eventTime.mediaPeriodId);
            }
        }
        if (events.contains(2) && this.metricsBuilder != null && (drmInitData = getDrmInitData(interfaceC0193d1.getCurrentTracks().f1547a)) != null) {
            this.metricsBuilder.setDrmType(getDrmType(drmInitData));
        }
        if (events.contains(AnalyticsListener.EVENT_AUDIO_UNDERRUN)) {
            this.audioUnderruns++;
        }
    }

    private void maybeUpdateTextFormat(long j, C0249w c0249w, int i) {
        C0249w c0249w2 = this.currentTextFormat;
        int i4 = AbstractC1118i0.f4750a;
        if (Objects.equals(c0249w2, c0249w)) {
            return;
        }
        if (this.currentTextFormat == null && i == 0) {
            i = 1;
        }
        this.currentTextFormat = c0249w;
        reportTrackChangeEvent(2, j, c0249w, i);
    }

    @RequiresNonNull({"metricsBuilder"})
    private void maybeUpdateTimelineMetadata(AbstractC0230p1 abstractC0230p1, MediaSource.MediaPeriodId mediaPeriodId) {
        int indexOfPeriod;
        PlaybackMetrics.Builder builder = this.metricsBuilder;
        if (mediaPeriodId == null || (indexOfPeriod = abstractC0230p1.getIndexOfPeriod(mediaPeriodId.periodUid)) == -1) {
            return;
        }
        abstractC0230p1.getPeriod(indexOfPeriod, this.period);
        abstractC0230p1.getWindow(this.period.f1206c, this.window);
        builder.setStreamType(getStreamType(this.window.f1262c));
        C0227o1 c0227o1 = this.window;
        if (c0227o1.f1272m != -9223372036854775807L && !c0227o1.f1270k && !c0227o1.f1268i && !c0227o1.m654a()) {
            builder.setMediaDurationMillis(AbstractC1118i0.m2447f0(this.window.f1272m));
        }
        builder.setPlaybackType(this.window.m654a() ? 2 : 1);
        this.reportedEventsForCurrentSession = true;
    }

    private void maybeUpdateVideoFormat(long j, C0249w c0249w, int i) {
        C0249w c0249w2 = this.currentVideoFormat;
        int i4 = AbstractC1118i0.f4750a;
        if (Objects.equals(c0249w2, c0249w)) {
            return;
        }
        if (this.currentVideoFormat == null && i == 0) {
            i = 1;
        }
        this.currentVideoFormat = c0249w;
        reportTrackChangeEvent(1, j, c0249w, i);
    }

    private void reportTrackChangeEvent(int i, long j, C0249w c0249w, int i4) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.startTimeMs);
        if (c0249w != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(getTrackChangeReason(i4));
            String str = c0249w.f1521m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c0249w.f1522n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c0249w.f1519k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i8 = c0249w.f1518j;
            if (i8 != -1) {
                timeSinceCreatedMillis.setBitrate(i8);
            }
            int i9 = c0249w.f1529u;
            if (i9 != -1) {
                timeSinceCreatedMillis.setWidth(i9);
            }
            int i10 = c0249w.f1530v;
            if (i10 != -1) {
                timeSinceCreatedMillis.setHeight(i10);
            }
            int i11 = c0249w.f1498C;
            if (i11 != -1) {
                timeSinceCreatedMillis.setChannelCount(i11);
            }
            int i12 = c0249w.f1499D;
            if (i12 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i12);
            }
            String str4 = c0249w.f1512d;
            if (str4 != null) {
                Pair<String, String> languageAndRegion = getLanguageAndRegion(str4);
                timeSinceCreatedMillis.setLanguage((String) languageAndRegion.first);
                Object obj = languageAndRegion.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f8 = c0249w.f1531w;
            if (f8 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f8);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.reportedEventsForCurrentSession = true;
        this.playbackSession.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private int resolveNewPlaybackState(InterfaceC0193d1 interfaceC0193d1) {
        int playbackState = interfaceC0193d1.getPlaybackState();
        if (this.isSeeking) {
            return 5;
        }
        if (this.hasFatalError) {
            return 13;
        }
        if (playbackState == 4) {
            return 11;
        }
        if (playbackState == 2) {
            int i = this.currentPlaybackState;
            if (i == 0 || i == 2 || i == 12) {
                return 2;
            }
            if (interfaceC0193d1.getPlayWhenReady()) {
                return interfaceC0193d1.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (playbackState == 3) {
            if (interfaceC0193d1.getPlayWhenReady()) {
                return interfaceC0193d1.getPlaybackSuppressionReason() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (playbackState != 1 || this.currentPlaybackState == 0) {
            return this.currentPlaybackState;
        }
        return 12;
    }

    public LogSessionId getLogSessionId() {
        return this.playbackSession.getSessionId();
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String str, String str2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j8) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId != null) {
            PlaybackSessionManager playbackSessionManager = this.sessionManager;
            AbstractC0230p1 abstractC0230p1 = eventTime.timeline;
            mediaPeriodId.getClass();
            String sessionForMediaPeriodId = playbackSessionManager.getSessionForMediaPeriodId(abstractC0230p1, mediaPeriodId);
            Long l8 = this.bandwidthBytes.get(sessionForMediaPeriodId);
            Long l9 = this.bandwidthTimeMs.get(sessionForMediaPeriodId);
            this.bandwidthBytes.put(sessionForMediaPeriodId, Long.valueOf((l8 == null ? 0L : l8.longValue()) + j));
            this.bandwidthTimeMs.put(sessionForMediaPeriodId, Long.valueOf((l9 != null ? l9.longValue() : 0L) + i));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        if (eventTime.mediaPeriodId == null) {
            return;
        }
        C0249w c0249w = mediaLoadData.trackFormat;
        c0249w.getClass();
        int i = mediaLoadData.trackSelectionReason;
        PlaybackSessionManager playbackSessionManager = this.sessionManager;
        AbstractC0230p1 abstractC0230p1 = eventTime.timeline;
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        mediaPeriodId.getClass();
        PendingFormatUpdate pendingFormatUpdate = new PendingFormatUpdate(c0249w, i, playbackSessionManager.getSessionForMediaPeriodId(abstractC0230p1, mediaPeriodId));
        int i4 = mediaLoadData.trackType;
        if (i4 != 0) {
            if (i4 == 1) {
                this.pendingAudioFormat = pendingFormatUpdate;
                return;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                this.pendingTextFormat = pendingFormatUpdate;
                return;
            }
        }
        this.pendingVideoFormat = pendingFormatUpdate;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onEvents(InterfaceC0193d1 interfaceC0193d1, AnalyticsListener.Events events) throws NumberFormatException {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        maybeUpdateMetricsBuilderValues(interfaceC0193d1, events);
        maybeReportPlaybackError(jElapsedRealtime);
        maybeReportTrackChanges(interfaceC0193d1, events, jElapsedRealtime);
        maybeReportNetworkChange(jElapsedRealtime);
        maybeReportPlaybackStateChange(interfaceC0193d1, events, jElapsedRealtime);
        if (events.contains(AnalyticsListener.EVENT_PLAYER_RELEASED)) {
            this.sessionManager.finishAllSessions(events.getEventTime(AnalyticsListener.EVENT_PLAYER_RELEASED));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z7) {
        this.ioErrorType = mediaLoadData.dataType;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPlayerError(AnalyticsListener.EventTime eventTime, C0253x0 c0253x0) {
        this.pendingPlayerError = c0253x0;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, C0189c1 c0189c1, C0189c1 c0189c12, int i) {
        if (i == 1) {
            this.isSeeking = true;
        }
        this.discontinuityReason = i;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(AnalyticsListener.EventTime eventTime, String str) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
            finishCurrentSession();
            this.activeSessionId = str;
            this.metricsBuilder = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.1");
            maybeUpdateTimelineMetadata(eventTime.timeline, eventTime.mediaPeriodId);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(AnalyticsListener.EventTime eventTime, String str, boolean z7) {
        MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if ((mediaPeriodId == null || !mediaPeriodId.isAd()) && str.equals(this.activeSessionId)) {
            finishCurrentSession();
        }
        this.bandwidthTimeMs.remove(str);
        this.bandwidthBytes.remove(str);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        this.droppedFrames += decoderCounters.droppedBufferCount;
        this.playedFrames += decoderCounters.renderedOutputBufferCount;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, C0194d2 c0194d2) {
        PendingFormatUpdate pendingFormatUpdate = this.pendingVideoFormat;
        if (pendingFormatUpdate != null) {
            C0249w c0249w = pendingFormatUpdate.format;
            if (c0249w.f1530v == -1) {
                C0246v c0246vM692a = c0249w.m692a();
                c0246vM692a.f1454t = c0194d2.f1086a;
                c0246vM692a.f1455u = c0194d2.f1087b;
                this.pendingVideoFormat = new PendingFormatUpdate(new C0249w(c0246vM692a), pendingFormatUpdate.selectionReason, pendingFormatUpdate.sessionId);
            }
        }
    }
}
