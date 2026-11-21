package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.AbstractC0229p0;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0184b0;
import androidx.media3.common.C0187c;
import androidx.media3.common.C0188c0;
import androidx.media3.common.C0196e0;
import androidx.media3.common.C0199f0;
import androidx.media3.common.C0202g0;
import androidx.media3.common.C0205h0;
import androidx.media3.common.C0208i0;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0214k0;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0227o1;
import androidx.media3.common.C0235r0;
import androidx.media3.common.C0247v0;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.dash.DashChunkSource;
import androidx.media3.exoplayer.dash.DefaultDashChunkSource;
import androidx.media3.exoplayer.dash.PlayerEmsgHandler;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement;
import androidx.media3.exoplayer.dash.manifest.UtcTimingElement;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.offline.FilteringManifestParser;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.DefaultCompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.MediaSourceFactory;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.exoplayer.util.SntpClient;
import com.bumptech.glide.AbstractC0714c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p077j$.util.DesugarTimeZone;
import p089k1.InterfaceC1557c0;
import p089k1.InterfaceC1563g;
import p089k1.InterfaceC1564h;
import p090k2.InterfaceC1597o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DashMediaSource extends BaseMediaSource {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;
    public static final String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    public static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final String TAG = "DashMediaSource";
    private final BaseUrlExclusionList baseUrlExclusionList;
    private final DashChunkSource.Factory chunkSourceFactory;
    private final CmcdConfiguration cmcdConfiguration;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private InterfaceC1564h dataSource;
    private final DrmSessionManager drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private final long fallbackTargetLiveOffsetMs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private C0208i0 liveConfiguration;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private Loader loader;
    private DashManifest manifest;
    private final ManifestCallback manifestCallback;
    private final InterfaceC1563g manifestDataSourceFactory;
    private final MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
    private IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final LoaderErrorThrower manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final ParsingLoadable.Parser<? extends DashManifest> manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;
    private C0226o0 mediaItem;
    private InterfaceC1557c0 mediaTransferListener;
    private final long minLiveStartPositionUs;
    private final SparseArray<DashMediaPeriod> periodsById;
    private final PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class DashTimeline extends AbstractC0230p1 {
        private final long elapsedRealtimeEpochOffsetMs;
        private final int firstPeriodId;
        private final C0208i0 liveConfiguration;
        private final DashManifest manifest;
        private final C0226o0 mediaItem;
        private final long offsetInFirstPeriodUs;
        private final long presentationStartTimeMs;
        private final long windowDefaultStartPositionUs;
        private final long windowDurationUs;
        private final long windowStartTimeMs;

        public DashTimeline(long j, long j8, long j9, int i, long j10, long j11, long j12, DashManifest dashManifest, C0226o0 c0226o0, C0208i0 c0208i0) {
            AbstractC1101a.m2359j(dashManifest.dynamic == (c0208i0 != null));
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j8;
            this.elapsedRealtimeEpochOffsetMs = j9;
            this.firstPeriodId = i;
            this.offsetInFirstPeriodUs = j10;
            this.windowDurationUs = j11;
            this.windowDefaultStartPositionUs = j12;
            this.manifest = dashManifest;
            this.mediaItem = c0226o0;
            this.liveConfiguration = c0208i0;
        }

        private long getAdjustedWindowDefaultStartPositionUs(long j) {
            DashSegmentIndex index;
            long j8 = this.windowDefaultStartPositionUs;
            if (!isMovingLiveWindow(this.manifest)) {
                return j8;
            }
            if (j > 0) {
                j8 += j;
                if (j8 > this.windowDurationUs) {
                    return -9223372036854775807L;
                }
            }
            long j9 = this.offsetInFirstPeriodUs + j8;
            long periodDurationUs = this.manifest.getPeriodDurationUs(0);
            int i = 0;
            while (i < this.manifest.getPeriodCount() - 1 && j9 >= periodDurationUs) {
                j9 -= periodDurationUs;
                i++;
                periodDurationUs = this.manifest.getPeriodDurationUs(i);
            }
            Period period = this.manifest.getPeriod(i);
            int adaptationSetIndex = period.getAdaptationSetIndex(2);
            return (adaptationSetIndex == -1 || (index = period.adaptationSets.get(adaptationSetIndex).representations.get(0).getIndex()) == null || index.getSegmentCount(periodDurationUs) == 0) ? j8 : (index.getTimeUs(index.getSegmentNum(j9, periodDurationUs)) + j8) - j9;
        }

        private static boolean isMovingLiveWindow(DashManifest dashManifest) {
            return dashManifest.dynamic && dashManifest.minUpdatePeriodMs != -9223372036854775807L && dashManifest.durationMs == -9223372036854775807L;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public int getIndexOfPeriod(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.firstPeriodId) >= 0 && iIntValue < getPeriodCount()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public C0221m1 getPeriod(int i, C0221m1 c0221m1, boolean z7) {
            AbstractC1101a.m2356g(i, getPeriodCount());
            String str = z7 ? this.manifest.getPeriod(i).f1717id : null;
            Integer numValueOf = z7 ? Integer.valueOf(this.firstPeriodId + i) : null;
            long periodDurationUs = this.manifest.getPeriodDurationUs(i);
            long jM2428S = AbstractC1118i0.m2428S(this.manifest.getPeriod(i).startMs - this.manifest.getPeriod(0).startMs) - this.offsetInFirstPeriodUs;
            c0221m1.getClass();
            c0221m1.m644i(str, numValueOf, 0, periodDurationUs, jM2428S, C0187c.f1044g, false);
            return c0221m1;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public int getPeriodCount() {
            return this.manifest.getPeriodCount();
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public Object getUidOfPeriod(int i) {
            AbstractC1101a.m2356g(i, getPeriodCount());
            return Integer.valueOf(this.firstPeriodId + i);
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public C0227o1 getWindow(int i, C0227o1 c0227o1, long j) {
            AbstractC1101a.m2356g(i, 1);
            long adjustedWindowDefaultStartPositionUs = getAdjustedWindowDefaultStartPositionUs(j);
            Object obj = C0227o1.f1250q;
            C0226o0 c0226o0 = this.mediaItem;
            DashManifest dashManifest = this.manifest;
            c0227o1.m655b(obj, c0226o0, dashManifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, true, isMovingLiveWindow(dashManifest), this.liveConfiguration, adjustedWindowDefaultStartPositionUs, this.windowDurationUs, 0, getPeriodCount() - 1, this.offsetInFirstPeriodUs);
            return c0227o1;
        }

        @Override // androidx.media3.common.AbstractC0230p1
        public int getWindowCount() {
            return 1;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class DefaultPlayerEmsgCallback implements PlayerEmsgHandler.PlayerEmsgCallback {
        private DefaultPlayerEmsgCallback() {
        }

        @Override // androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestPublishTimeExpired(long j) {
            DashMediaSource.this.onDashManifestPublishTimeExpired(j);
        }

        @Override // androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestRefreshRequested() {
            DashMediaSource.this.onDashManifestRefreshRequested();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Factory implements MediaSourceFactory {

        /* renamed from: a */
        public static final /* synthetic */ int f1712a = 0;
        private final DashChunkSource.Factory chunkSourceFactory;
        private CmcdConfiguration.Factory cmcdConfigurationFactory;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private long fallbackTargetLiveOffsetMs;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private final InterfaceC1563g manifestDataSourceFactory;
        private ParsingLoadable.Parser<? extends DashManifest> manifestParser;
        private long minLiveStartPositionUs;

        public Factory(InterfaceC1563g interfaceC1563g) {
            this(new DefaultDashChunkSource.Factory(interfaceC1563g), interfaceC1563g);
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest) {
            C0211j0 c0211j0;
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
                c0211j0 = new C0211j0(uri, "application/dash+xml", c0202g0, null, list, null, c0981l1, null, -9223372036854775807L);
            } else {
                c0211j0 = null;
            }
            return createMediaSource(dashManifest, new C0226o0("DashMediaSource", new C0196e0(c0188c0), c0211j0, new C0208i0(c0205h0), C0235r0.f1329K, c0214k0));
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{0};
        }

        public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            AbstractC1101a.m2357h("DashMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.", compositeSequenceableLoaderFactory);
            this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
            return this;
        }

        public Factory setFallbackTargetLiveOffsetMs(long j) {
            this.fallbackTargetLiveOffsetMs = j;
            return this;
        }

        public Factory setManifestParser(ParsingLoadable.Parser<? extends DashManifest> parser) {
            this.manifestParser = parser;
            return this;
        }

        public Factory setMinLiveStartPositionUs(long j) {
            this.minLiveStartPositionUs = j;
            return this;
        }

        public Factory(DashChunkSource.Factory factory, InterfaceC1563g interfaceC1563g) {
            factory.getClass();
            this.chunkSourceFactory = factory;
            this.manifestDataSourceFactory = interfaceC1563g;
            this.drmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.fallbackTargetLiveOffsetMs = 30000L;
            this.minLiveStartPositionUs = DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;
            this.compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
            experimentalParseSubtitlesDuringExtraction(true);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @Deprecated
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z7) {
            this.chunkSourceFactory.experimentalParseSubtitlesDuringExtraction(z7);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            factory.getClass();
            this.cmcdConfigurationFactory = factory;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            AbstractC1101a.m2357h("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.", drmSessionManagerProvider);
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            AbstractC1101a.m2357h("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.", loadErrorHandlingPolicy);
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public Factory setSubtitleParserFactory(InterfaceC1597o interfaceC1597o) {
            DashChunkSource.Factory factory = this.chunkSourceFactory;
            interfaceC1597o.getClass();
            factory.setSubtitleParserFactory(interfaceC1597o);
            return this;
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest, C0226o0 c0226o0) {
            AbstractC1101a.m2353d(!dashManifest.dynamic);
            C0184b0 c0184b0M652a = c0226o0.m652a();
            c0184b0M652a.f1032c = "application/dash+xml";
            if (c0226o0.f1239b == null) {
                c0184b0M652a.f1031b = Uri.EMPTY;
            }
            C0226o0 c0226o0M608a = c0184b0M652a.m608a();
            CmcdConfiguration.Factory factory = this.cmcdConfigurationFactory;
            return new DashMediaSource(c0226o0M608a, dashManifest, null, null, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, factory == null ? null : factory.createCmcdConfiguration(c0226o0M608a), this.drmSessionManagerProvider.get(c0226o0M608a), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, this.minLiveStartPositionUs);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public DashMediaSource createMediaSource(C0226o0 c0226o0) {
            c0226o0.f1239b.getClass();
            ParsingLoadable.Parser dashManifestParser = this.manifestParser;
            if (dashManifestParser == null) {
                dashManifestParser = new DashManifestParser();
            }
            List list = c0226o0.f1239b.f1151e;
            ParsingLoadable.Parser filteringManifestParser = !list.isEmpty() ? new FilteringManifestParser(dashManifestParser, list) : dashManifestParser;
            CmcdConfiguration.Factory factory = this.cmcdConfigurationFactory;
            return new DashMediaSource(c0226o0, null, this.manifestDataSourceFactory, filteringManifestParser, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, factory == null ? null : factory.createCmcdConfiguration(c0226o0), this.drmSessionManagerProvider.get(c0226o0), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, this.minLiveStartPositionUs);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Iso8601Parser implements ParsingLoadable.Parser<Long> {
        private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = Pattern.compile("(.+?)(Z|((\\+|-|\u2212)(\\d\\d)(:?(\\d\\d))?))");

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException, NumberFormatException {
            String line = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(line);
                if (!matcher.matches()) {
                    throw C0247v0.createForMalformedManifest("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j8 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= (((j8 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw C0247v0.createForMalformedManifest(null, e);
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class ManifestCallback implements Loader.Callback<ParsingLoadable<DashManifest>> {
        private ManifestCallback() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<DashManifest> parsingLoadable, long j, long j8, boolean z7) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j, j8);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j, long j8) {
            DashMediaSource.this.onManifestLoadCompleted(parsingLoadable, j, j8);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j, long j8, IOException iOException, int i) {
            return DashMediaSource.this.onManifestLoadError(parsingLoadable, j, j8, iOException, i);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class UtcTimestampCallback implements Loader.Callback<ParsingLoadable<Long>> {
        private UtcTimestampCallback() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<Long> parsingLoadable, long j, long j8, boolean z7) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j, j8);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j8) {
            DashMediaSource.this.onUtcTimestampLoadCompleted(parsingLoadable, j, j8);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j8, IOException iOException, int i) {
            return DashMediaSource.this.onUtcTimestampLoadError(parsingLoadable, j, j8, iOException);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class XsDateTimeParser implements ParsingLoadable.Parser<Long> {
        private XsDateTimeParser() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) {
            return Long.valueOf(AbstractC1118i0.m2431V(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        AbstractC0229p0.m658a("media3.exoplayer.dash");
    }

    private static long getAvailableEndTimeInManifestUs(Period period, long j, long j8) {
        long jM2428S = AbstractC1118i0.m2428S(period.startMs);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(period);
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i);
            List<Representation> list = adaptationSet.representations;
            int i4 = adaptationSet.type;
            boolean z7 = (i4 == 1 || i4 == 2) ? false : true;
            if ((!zHasVideoOrAudioAdaptationSets || !z7) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null) {
                    return jM2428S + j;
                }
                long availableSegmentCount = index.getAvailableSegmentCount(j, j8);
                if (availableSegmentCount == 0) {
                    return jM2428S;
                }
                long firstAvailableSegmentNum = (index.getFirstAvailableSegmentNum(j, j8) + availableSegmentCount) - 1;
                jMin = Math.min(jMin, index.getDurationUs(firstAvailableSegmentNum, j) + index.getTimeUs(firstAvailableSegmentNum) + jM2428S);
            }
        }
        return jMin;
    }

    private static long getAvailableStartTimeInManifestUs(Period period, long j, long j8) {
        long jM2428S = AbstractC1118i0.m2428S(period.startMs);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(period);
        long jMax = jM2428S;
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i);
            List<Representation> list = adaptationSet.representations;
            int i4 = adaptationSet.type;
            boolean z7 = (i4 == 1 || i4 == 2) ? false : true;
            if ((!zHasVideoOrAudioAdaptationSets || !z7) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null || index.getAvailableSegmentCount(j, j8) == 0) {
                    return jM2428S;
                }
                jMax = Math.max(jMax, index.getTimeUs(index.getFirstAvailableSegmentNum(j, j8)) + jM2428S);
            }
        }
        return jMax;
    }

    private static long getIntervalUntilNextManifestRefreshMs(DashManifest dashManifest, long j) {
        DashSegmentIndex index;
        int periodCount = dashManifest.getPeriodCount() - 1;
        Period period = dashManifest.getPeriod(periodCount);
        long jM2428S = AbstractC1118i0.m2428S(period.startMs);
        long periodDurationUs = dashManifest.getPeriodDurationUs(periodCount);
        long jM2428S2 = AbstractC1118i0.m2428S(j);
        long jM2428S3 = AbstractC1118i0.m2428S(dashManifest.availabilityStartTimeMs);
        long jM2428S4 = AbstractC1118i0.m2428S(5000L);
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            List<Representation> list = period.adaptationSets.get(i).representations;
            if (!list.isEmpty() && (index = list.get(0).getIndex()) != null) {
                long nextSegmentAvailableTimeUs = (index.getNextSegmentAvailableTimeUs(periodDurationUs, jM2428S2) + (jM2428S3 + jM2428S)) - jM2428S2;
                if (nextSegmentAvailableTimeUs < jM2428S4 - SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US || (nextSegmentAvailableTimeUs > jM2428S4 && nextSegmentAvailableTimeUs < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + jM2428S4)) {
                    jM2428S4 = nextSegmentAvailableTimeUs;
                }
            }
        }
        return AbstractC0714c.m1492E(jM2428S4, 1000L, RoundingMode.CEILING);
    }

    private long getManifestLoadRetryDelayMillis() {
        return Math.min((this.staleManifestReloadAttempt - 1) * 1000, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
    }

    private static boolean hasVideoOrAudioAdaptationSets(Period period) {
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            int i4 = period.adaptationSets.get(i).type;
            if (i4 == 1 || i4 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIndexExplicit(Period period) {
        for (int i = 0; i < period.adaptationSets.size(); i++) {
            DashSegmentIndex index = period.adaptationSets.get(i).representations.get(0).getIndex();
            if (index == null || index.isExplicit()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        processManifest(false);
    }

    private void loadNtpTimeOffset() {
        SntpClient.initialize(this.loader, new SntpClient.InitializationCallback() { // from class: androidx.media3.exoplayer.dash.DashMediaSource.1
            @Override // androidx.media3.exoplayer.util.SntpClient.InitializationCallback
            public void onInitializationFailed(IOException iOException) {
                DashMediaSource.this.onUtcTimestampResolutionError(iOException);
            }

            @Override // androidx.media3.exoplayer.util.SntpClient.InitializationCallback
            public void onInitialized() {
                DashMediaSource.this.onUtcTimestampResolved(SntpClient.getElapsedRealtimeOffsetMs());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolutionError(IOException iOException) {
        AbstractC1101a.m2365p("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.elapsedRealtimeOffsetMs = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        processManifest(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolved(long j) {
        this.elapsedRealtimeOffsetMs = j;
        processManifest(true);
    }

    private void processManifest(boolean z7) {
        long j;
        long j8;
        long j9;
        for (int i = 0; i < this.periodsById.size(); i++) {
            int iKeyAt = this.periodsById.keyAt(i);
            if (iKeyAt >= this.firstPeriodId) {
                this.periodsById.valueAt(i).updateManifest(this.manifest, iKeyAt - this.firstPeriodId);
            }
        }
        Period period = this.manifest.getPeriod(0);
        int periodCount = this.manifest.getPeriodCount() - 1;
        Period period2 = this.manifest.getPeriod(periodCount);
        long periodDurationUs = this.manifest.getPeriodDurationUs(periodCount);
        long jM2428S = AbstractC1118i0.m2428S(AbstractC1118i0.m2412C(this.elapsedRealtimeOffsetMs));
        long availableStartTimeInManifestUs = getAvailableStartTimeInManifestUs(period, this.manifest.getPeriodDurationUs(0), jM2428S);
        long availableEndTimeInManifestUs = getAvailableEndTimeInManifestUs(period2, periodDurationUs, jM2428S);
        boolean z8 = this.manifest.dynamic && !isIndexExplicit(period2);
        if (z8) {
            long j10 = this.manifest.timeShiftBufferDepthMs;
            if (j10 != -9223372036854775807L) {
                availableStartTimeInManifestUs = Math.max(availableStartTimeInManifestUs, availableEndTimeInManifestUs - AbstractC1118i0.m2428S(j10));
            }
        }
        long j11 = availableEndTimeInManifestUs - availableStartTimeInManifestUs;
        DashManifest dashManifest = this.manifest;
        if (dashManifest.dynamic) {
            AbstractC1101a.m2359j(dashManifest.availabilityStartTimeMs != -9223372036854775807L);
            long jM2428S2 = (jM2428S - AbstractC1118i0.m2428S(this.manifest.availabilityStartTimeMs)) - availableStartTimeInManifestUs;
            updateLiveConfiguration(jM2428S2, j11);
            long jM2447f0 = AbstractC1118i0.m2447f0(availableStartTimeInManifestUs) + this.manifest.availabilityStartTimeMs;
            long jM2428S3 = jM2428S2 - AbstractC1118i0.m2428S(this.liveConfiguration.f1128a);
            j = 0;
            long jMin = Math.min(this.minLiveStartPositionUs, j11 / 2);
            j9 = jM2428S3 < jMin ? jMin : jM2428S3;
            j8 = jM2447f0;
        } else {
            j = 0;
            j8 = -9223372036854775807L;
            j9 = 0;
        }
        long jM2428S4 = availableStartTimeInManifestUs - AbstractC1118i0.m2428S(period.startMs);
        DashManifest dashManifest2 = this.manifest;
        refreshSourceInfo(new DashTimeline(dashManifest2.availabilityStartTimeMs, j8, this.elapsedRealtimeOffsetMs, this.firstPeriodId, jM2428S4, j11, j9, dashManifest2, getMediaItem(), this.manifest.dynamic ? this.liveConfiguration : null));
        if (this.sideloadedManifest) {
            return;
        }
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        if (z8) {
            this.handler.postDelayed(this.simulateManifestRefreshRunnable, getIntervalUntilNextManifestRefreshMs(this.manifest, AbstractC1118i0.m2412C(this.elapsedRealtimeOffsetMs)));
        }
        if (this.manifestLoadPending) {
            startLoadingManifest();
            return;
        }
        if (z7) {
            DashManifest dashManifest3 = this.manifest;
            if (dashManifest3.dynamic) {
                long j12 = dashManifest3.minUpdatePeriodMs;
                if (j12 != -9223372036854775807L) {
                    if (j12 == j) {
                        j12 = 5000;
                    }
                    scheduleManifestRefresh(Math.max(j, (this.manifestLoadStartTimestampMs + j12) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void resolveUtcTimingElement(UtcTimingElement utcTimingElement) {
        String str = utcTimingElement.schemeIdUri;
        int i = AbstractC1118i0.f4750a;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            resolveUtcTimingElementDirect(utcTimingElement);
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new Iso8601Parser());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new XsDateTimeParser());
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            loadNtpTimeOffset();
        } else {
            onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void resolveUtcTimingElementDirect(UtcTimingElement utcTimingElement) {
        try {
            onUtcTimestampResolved(AbstractC1118i0.m2431V(utcTimingElement.value) - this.manifestLoadEndTimestampMs);
        } catch (C0247v0 e) {
            onUtcTimestampResolutionError(e);
        }
    }

    private void resolveUtcTimingElementHttp(UtcTimingElement utcTimingElement, ParsingLoadable.Parser<Long> parser) {
        startLoading(new ParsingLoadable(this.dataSource, Uri.parse(utcTimingElement.value), 5, parser), new UtcTimestampCallback(), 1);
    }

    private void scheduleManifestRefresh(long j) {
        this.handler.postDelayed(this.refreshManifestRunnable, j);
    }

    private <T> void startLoading(ParsingLoadable<T> parsingLoadable, Loader.Callback<ParsingLoadable<T>> callback, int i) {
        this.manifestEventDispatcher.loadStarted(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, this.loader.startLoading(parsingLoadable, callback, i)), parsingLoadable.type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoadingManifest() {
        Uri uri;
        this.handler.removeCallbacks(this.refreshManifestRunnable);
        if (this.loader.hasFatalError()) {
            return;
        }
        if (this.loader.isLoading()) {
            this.manifestLoadPending = true;
            return;
        }
        synchronized (this.manifestUriLock) {
            uri = this.manifestUri;
        }
        this.manifestLoadPending = false;
        startLoading(new ParsingLoadable(this.dataSource, uri, 4, this.manifestParser), this.manifestCallback, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateLiveConfiguration(long j, long j8) {
        long j9;
        long jMin;
        long jM2447f0;
        long j10;
        long j11;
        long j12;
        long j13;
        long jM2452k;
        float f8;
        float f9;
        ServiceDescriptionElement serviceDescriptionElement;
        C0208i0 c0208i0 = getMediaItem().f1240c;
        long jM2447f02 = AbstractC1118i0.m2447f0(j);
        long j14 = c0208i0.f1130c;
        if (j14 == -9223372036854775807L) {
            ServiceDescriptionElement serviceDescriptionElement2 = this.manifest.serviceDescription;
            if (serviceDescriptionElement2 != null) {
                long j15 = serviceDescriptionElement2.maxOffsetMs;
                if (j15 != -9223372036854775807L) {
                    jMin = Math.min(jM2447f02, j15);
                }
            }
            j9 = jM2447f02;
            jM2447f0 = AbstractC1118i0.m2447f0(j - j8);
            if (jM2447f0 < 0 && j9 > 0) {
                jM2447f0 = 0;
            }
            j10 = this.manifest.minBufferTimeMs;
            if (j10 != -9223372036854775807L) {
                jM2447f0 = Math.min(jM2447f0 + j10, jM2447f02);
            }
            long jM2452k2 = jM2447f0;
            j11 = c0208i0.f1129b;
            if (j11 == -9223372036854775807L) {
                jM2452k2 = AbstractC1118i0.m2452k(j11, jM2452k2, jM2447f02);
            } else {
                ServiceDescriptionElement serviceDescriptionElement3 = this.manifest.serviceDescription;
                if (serviceDescriptionElement3 != null) {
                    long j16 = serviceDescriptionElement3.minOffsetMs;
                    if (j16 != -9223372036854775807L) {
                        jM2452k2 = AbstractC1118i0.m2452k(j16, jM2452k2, jM2447f02);
                    }
                }
            }
            j12 = jM2452k2;
            j13 = j12 <= j9 ? j12 : j9;
            jM2452k = this.liveConfiguration.f1128a;
            if (jM2452k == -9223372036854775807L) {
                DashManifest dashManifest = this.manifest;
                ServiceDescriptionElement serviceDescriptionElement4 = dashManifest.serviceDescription;
                if (serviceDescriptionElement4 != null) {
                    long j17 = serviceDescriptionElement4.targetOffsetMs;
                    if (j17 != -9223372036854775807L) {
                        jM2452k = j17;
                    } else {
                        jM2452k = dashManifest.suggestedPresentationDelayMs;
                        if (jM2452k == -9223372036854775807L) {
                            jM2452k = this.fallbackTargetLiveOffsetMs;
                        }
                    }
                }
            }
            if (jM2452k < j12) {
                jM2452k = j12;
            }
            if (jM2452k > j13) {
                jM2452k = AbstractC1118i0.m2452k(AbstractC1118i0.m2447f0(j - Math.min(this.minLiveStartPositionUs, j8 / 2)), j12, j13);
            }
            long j18 = j13;
            f8 = c0208i0.f1131d;
            if (f8 == -3.4028235E38f) {
                ServiceDescriptionElement serviceDescriptionElement5 = this.manifest.serviceDescription;
                f8 = serviceDescriptionElement5 != null ? serviceDescriptionElement5.minPlaybackSpeed : -3.4028235E38f;
            }
            f9 = c0208i0.f1132e;
            if (f9 == -3.4028235E38f) {
                ServiceDescriptionElement serviceDescriptionElement6 = this.manifest.serviceDescription;
                f9 = serviceDescriptionElement6 != null ? serviceDescriptionElement6.maxPlaybackSpeed : -3.4028235E38f;
            }
            if (f8 == -3.4028235E38f && f9 == -3.4028235E38f && ((serviceDescriptionElement = this.manifest.serviceDescription) == null || serviceDescriptionElement.targetOffsetMs == -9223372036854775807L)) {
                f8 = 1.0f;
                f9 = 1.0f;
            }
            C0205h0 c0205h0 = new C0205h0();
            c0205h0.f1116a = jM2452k;
            c0205h0.f1117b = j12;
            c0205h0.f1118c = j18;
            c0205h0.f1119d = f8;
            c0205h0.f1120e = f9;
            this.liveConfiguration = new C0208i0(c0205h0);
        }
        jMin = Math.min(jM2447f02, j14);
        j9 = jMin;
        jM2447f0 = AbstractC1118i0.m2447f0(j - j8);
        if (jM2447f0 < 0) {
            jM2447f0 = 0;
        }
        j10 = this.manifest.minBufferTimeMs;
        if (j10 != -9223372036854775807L) {
        }
        long jM2452k22 = jM2447f0;
        j11 = c0208i0.f1129b;
        if (j11 == -9223372036854775807L) {
        }
        j12 = jM2452k22;
        if (j12 <= j9) {
        }
        jM2452k = this.liveConfiguration.f1128a;
        if (jM2452k == -9223372036854775807L) {
        }
        if (jM2452k < j12) {
        }
        if (jM2452k > j13) {
        }
        long j182 = j13;
        f8 = c0208i0.f1131d;
        if (f8 == -3.4028235E38f) {
        }
        f9 = c0208i0.f1132e;
        if (f9 == -3.4028235E38f) {
        }
        if (f8 == -3.4028235E38f) {
            f8 = 1.0f;
            f9 = 1.0f;
        }
        C0205h0 c0205h02 = new C0205h0();
        c0205h02.f1116a = jM2452k;
        c0205h02.f1117b = j12;
        c0205h02.f1118c = j182;
        c0205h02.f1119d = f8;
        c0205h02.f1120e = f9;
        this.liveConfiguration = new C0208i0(c0205h02);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(C0226o0 c0226o0) {
        C0226o0 mediaItem = getMediaItem();
        C0211j0 c0211j0 = mediaItem.f1239b;
        c0211j0.getClass();
        C0211j0 c0211j02 = c0226o0.f1239b;
        if (c0211j02 == null || !c0211j02.f1147a.equals(c0211j0.f1147a) || !c0211j02.f1151e.equals(c0211j0.f1151e)) {
            return false;
        }
        C0202g0 c0202g0 = c0211j02.f1149c;
        C0202g0 c0202g02 = c0211j0.f1149c;
        int i = AbstractC1118i0.f4750a;
        return Objects.equals(c0202g0, c0202g02) && mediaItem.f1240c.equals(c0226o0.f1240c);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        int iIntValue = ((Integer) mediaPeriodId.periodUid).intValue() - this.firstPeriodId;
        MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(mediaPeriodId);
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(this.firstPeriodId + iIntValue, this.manifest, this.baseUrlExclusionList, iIntValue, this.chunkSourceFactory, this.mediaTransferListener, this.cmcdConfiguration, this.drmSessionManager, createDrmEventDispatcher(mediaPeriodId), this.loadErrorHandlingPolicy, eventDispatcherCreateEventDispatcher, this.elapsedRealtimeOffsetMs, this.manifestLoadErrorThrower, allocator, this.compositeSequenceableLoaderFactory, this.playerEmsgCallback, getPlayerId());
        this.periodsById.put(dashMediaPeriod.f1711id, dashMediaPeriod);
        return dashMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized C0226o0 getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        this.manifestLoadErrorThrower.maybeThrowError();
    }

    public void onDashManifestPublishTimeExpired(long j) {
        long j8 = this.expiredManifestPublishTimeUs;
        if (j8 == -9223372036854775807L || j8 < j) {
            this.expiredManifestPublishTimeUs = j;
        }
    }

    public void onDashManifestRefreshRequested() {
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        startLoadingManifest();
    }

    public void onLoadCanceled(ParsingLoadable<?> parsingLoadable, long j, long j8) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j8, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCanceled(loadEventInfo, parsingLoadable.type);
    }

    public void onManifestLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j, long j8) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j8, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCompleted(loadEventInfo, parsingLoadable.type);
        DashManifest result = parsingLoadable.getResult();
        DashManifest dashManifest = this.manifest;
        int periodCount = dashManifest == null ? 0 : dashManifest.getPeriodCount();
        long j9 = result.getPeriod(0).startMs;
        int i = 0;
        while (i < periodCount && this.manifest.getPeriod(i).startMs < j9) {
            i++;
        }
        if (result.dynamic) {
            if (periodCount - i > result.getPeriodCount()) {
                AbstractC1101a.m2348F("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j10 = this.expiredManifestPublishTimeUs;
                if (j10 == -9223372036854775807L || result.publishTimeMs * 1000 > j10) {
                    this.staleManifestReloadAttempt = 0;
                } else {
                    AbstractC1101a.m2348F("DashMediaSource", "Loaded stale dynamic manifest: " + result.publishTimeMs + ", " + this.expiredManifestPublishTimeUs);
                }
            }
            int i4 = this.staleManifestReloadAttempt;
            this.staleManifestReloadAttempt = i4 + 1;
            if (i4 < this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type)) {
                scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
                return;
            } else {
                this.manifestFatalError = new DashManifestStaleException();
                return;
            }
        }
        this.manifest = result;
        this.manifestLoadPending = result.dynamic & this.manifestLoadPending;
        this.manifestLoadStartTimestampMs = j - j8;
        this.manifestLoadEndTimestampMs = j;
        this.firstPeriodId += i;
        synchronized (this.manifestUriLock) {
            try {
                if (parsingLoadable.dataSpec.f5996a == this.manifestUri) {
                    Uri uri = this.manifest.location;
                    if (uri == null) {
                        uri = parsingLoadable.getUri();
                    }
                    this.manifestUri = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        DashManifest dashManifest2 = this.manifest;
        if (!dashManifest2.dynamic || this.elapsedRealtimeOffsetMs != -9223372036854775807L) {
            processManifest(true);
            return;
        }
        UtcTimingElement utcTimingElement = dashManifest2.utcTiming;
        if (utcTimingElement != null) {
            resolveUtcTimingElement(utcTimingElement);
        } else {
            loadNtpTimeOffset();
        }
    }

    public Loader.LoadErrorAction onManifestLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j, long j8, IOException iOException, int i) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j8, parsingLoadable.bytesLoaded());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(parsingLoadable.type), iOException, i));
        Loader.LoadErrorAction loadErrorActionCreateRetryAction = retryDelayMsFor == -9223372036854775807L ? Loader.DONT_RETRY_FATAL : Loader.createRetryAction(false, retryDelayMsFor);
        boolean zIsRetry = loadErrorActionCreateRetryAction.isRetry();
        this.manifestEventDispatcher.loadError(loadEventInfo, parsingLoadable.type, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }

    public void onUtcTimestampLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j8) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j8, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCompleted(loadEventInfo, parsingLoadable.type);
        onUtcTimestampResolved(parsingLoadable.getResult().longValue() - j);
    }

    public Loader.LoadErrorAction onUtcTimestampLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j8, IOException iOException) {
        this.manifestEventDispatcher.loadError(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j, j8, parsingLoadable.bytesLoaded()), parsingLoadable.type, iOException, true);
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        onUtcTimestampResolutionError(iOException);
        return Loader.DONT_RETRY;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(InterfaceC1557c0 interfaceC1557c0) {
        this.mediaTransferListener = interfaceC1557c0;
        this.drmSessionManager.setPlayer(Looper.myLooper(), getPlayerId());
        this.drmSessionManager.prepare();
        if (this.sideloadedManifest) {
            processManifest(false);
            return;
        }
        this.dataSource = this.manifestDataSourceFactory.mo55l();
        this.loader = new Loader("DashMediaSource");
        this.handler = AbstractC1118i0.m2457p(null);
        startLoadingManifest();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) mediaPeriod;
        dashMediaPeriod.release();
        this.periodsById.remove(dashMediaPeriod.f1711id);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.manifestLoadPending = false;
        this.dataSource = null;
        Loader loader = this.loader;
        if (loader != null) {
            loader.release();
            this.loader = null;
        }
        this.manifestLoadStartTimestampMs = 0L;
        this.manifestLoadEndTimestampMs = 0L;
        this.manifestUri = this.initialManifestUri;
        this.manifestFatalError = null;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
        this.elapsedRealtimeOffsetMs = -9223372036854775807L;
        this.staleManifestReloadAttempt = 0;
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.periodsById.clear();
        this.baseUrlExclusionList.reset();
        this.drmSessionManager.release();
    }

    public void replaceManifestUri(Uri uri) {
        synchronized (this.manifestUriLock) {
            this.manifestUri = uri;
            this.initialManifestUri = uri;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(C0226o0 c0226o0) {
        this.mediaItem = c0226o0;
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class ManifestLoadErrorThrower implements LoaderErrorThrower {
        public ManifestLoadErrorThrower() {
        }

        private void maybeThrowManifestError() throws IOException {
            if (DashMediaSource.this.manifestFatalError != null) {
                throw DashMediaSource.this.manifestFatalError;
            }
        }

        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError() throws IOException {
            DashMediaSource.this.loader.maybeThrowError();
            maybeThrowManifestError();
        }

        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError(int i) throws IOException {
            DashMediaSource.this.loader.maybeThrowError(i);
            maybeThrowManifestError();
        }
    }

    private DashMediaSource(C0226o0 c0226o0, DashManifest dashManifest, InterfaceC1563g interfaceC1563g, ParsingLoadable.Parser<? extends DashManifest> parser, DashChunkSource.Factory factory, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j, long j8) {
        this.mediaItem = c0226o0;
        this.liveConfiguration = c0226o0.f1240c;
        C0211j0 c0211j0 = c0226o0.f1239b;
        c0211j0.getClass();
        Uri uri = c0211j0.f1147a;
        this.manifestUri = uri;
        this.initialManifestUri = uri;
        this.manifest = dashManifest;
        this.manifestDataSourceFactory = interfaceC1563g;
        this.manifestParser = parser;
        this.chunkSourceFactory = factory;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.fallbackTargetLiveOffsetMs = j;
        this.minLiveStartPositionUs = j8;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.baseUrlExclusionList = new BaseUrlExclusionList();
        boolean z7 = dashManifest != null;
        this.sideloadedManifest = z7;
        this.manifestEventDispatcher = createEventDispatcher(null);
        this.manifestUriLock = new Object();
        this.periodsById = new SparseArray<>();
        this.playerEmsgCallback = new DefaultPlayerEmsgCallback();
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.elapsedRealtimeOffsetMs = -9223372036854775807L;
        if (z7) {
            AbstractC1101a.m2359j(true ^ dashManifest.dynamic);
            this.manifestCallback = null;
            this.refreshManifestRunnable = null;
            this.simulateManifestRefreshRunnable = null;
            this.manifestLoadErrorThrower = new LoaderErrorThrower.Placeholder();
            return;
        }
        this.manifestCallback = new ManifestCallback();
        this.manifestLoadErrorThrower = new ManifestLoadErrorThrower();
        final int i = 0;
        this.refreshManifestRunnable = new Runnable(this) { // from class: androidx.media3.exoplayer.dash.c

            /* renamed from: k */
            public final /* synthetic */ DashMediaSource f1714k;

            {
                this.f1714k = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f1714k.startLoadingManifest();
                        break;
                    default:
                        this.f1714k.lambda$new$0();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.simulateManifestRefreshRunnable = new Runnable(this) { // from class: androidx.media3.exoplayer.dash.c

            /* renamed from: k */
            public final /* synthetic */ DashMediaSource f1714k;

            {
                this.f1714k = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case 0:
                        this.f1714k.startLoadingManifest();
                        break;
                    default:
                        this.f1714k.lambda$new$0();
                        break;
                }
            }
        };
    }
}
