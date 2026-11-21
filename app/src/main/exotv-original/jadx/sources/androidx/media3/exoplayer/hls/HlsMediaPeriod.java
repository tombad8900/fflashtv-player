package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0212j1;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0234r;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.hls.HlsSampleStreamWrapper;
import androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p002a1.AbstractC0008a1;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p089k1.InterfaceC1557c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class HlsMediaPeriod implements MediaPeriod, HlsPlaylistTracker.PlaylistEventListener {
    private final Allocator allocator;
    private final boolean allowChunklessPreparation;
    private int audioVideoSampleStreamWrapperCount;
    private final CmcdConfiguration cmcdConfiguration;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final HlsDataSourceFactory dataSourceFactory;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private final HlsExtractorFactory extractorFactory;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private MediaPeriod.Callback mediaPeriodCallback;
    private final InterfaceC1557c0 mediaTransferListener;
    private final int metadataType;
    private int pendingPrepareCount;
    private final PlayerId playerId;
    private final HlsPlaylistTracker playlistTracker;
    private final long timestampAdjusterInitializationTimeoutMs;
    private TrackGroupArray trackGroups;
    private final boolean useSessionKeys;
    private final HlsSampleStreamWrapper.Callback sampleStreamWrapperCallback = new SampleStreamWrapperCallback();
    private final IdentityHashMap<SampleStream, Integer> streamWrapperIndices = new IdentityHashMap<>();
    private final TimestampAdjusterProvider timestampAdjusterProvider = new TimestampAdjusterProvider();
    private HlsSampleStreamWrapper[] sampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private HlsSampleStreamWrapper[] enabledSampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private int[][] manifestUrlIndicesPerWrapper = new int[0][];

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public class SampleStreamWrapperCallback implements HlsSampleStreamWrapper.Callback {
        private SampleStreamWrapperCallback() {
        }

        @Override // androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPlaylistRefreshRequired(Uri uri) {
            HlsMediaPeriod.this.playlistTracker.refreshPlaylist(uri);
        }

        @Override // androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback
        public void onPrepared() {
            if (HlsMediaPeriod.access$106(HlsMediaPeriod.this) > 0) {
                return;
            }
            int i = 0;
            for (HlsSampleStreamWrapper hlsSampleStreamWrapper : HlsMediaPeriod.this.sampleStreamWrappers) {
                i += hlsSampleStreamWrapper.getTrackGroups().length;
            }
            C0233q1[] c0233q1Arr = new C0233q1[i];
            int i4 = 0;
            for (HlsSampleStreamWrapper hlsSampleStreamWrapper2 : HlsMediaPeriod.this.sampleStreamWrappers) {
                int i8 = hlsSampleStreamWrapper2.getTrackGroups().length;
                int i9 = 0;
                while (i9 < i8) {
                    c0233q1Arr[i4] = hlsSampleStreamWrapper2.getTrackGroups().get(i9);
                    i9++;
                    i4++;
                }
            }
            HlsMediaPeriod.this.trackGroups = new TrackGroupArray(c0233q1Arr);
            HlsMediaPeriod.this.mediaPeriodCallback.onPrepared(HlsMediaPeriod.this);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
            HlsMediaPeriod.this.mediaPeriodCallback.onContinueLoadingRequested(HlsMediaPeriod.this);
        }
    }

    public HlsMediaPeriod(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, HlsDataSourceFactory hlsDataSourceFactory, InterfaceC1557c0 interfaceC1557c0, CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher2, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, boolean z7, int i, boolean z8, PlayerId playerId, long j) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.mediaTransferListener = interfaceC1557c0;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.eventDispatcher = eventDispatcher2;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.allowChunklessPreparation = z7;
        this.metadataType = i;
        this.useSessionKeys = z8;
        this.playerId = playerId;
        this.timestampAdjusterInitializationTimeoutMs = j;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.empty();
    }

    public static /* synthetic */ int access$106(HlsMediaPeriod hlsMediaPeriod) {
        int i = hlsMediaPeriod.pendingPrepareCount - 1;
        hlsMediaPeriod.pendingPrepareCount = i;
        return i;
    }

    private void buildAndPrepareAudioSampleStreamWrappers(long j, List<HlsMultivariantPlaylist.Rendition> list, List<HlsSampleStreamWrapper> list2, List<int[]> list3, Map<String, C0237s> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).name;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z7 = true;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    String str2 = list.get(i4).name;
                    int i8 = AbstractC1118i0.f4750a;
                    if (Objects.equals(str, str2)) {
                        HlsMultivariantPlaylist.Rendition rendition = list.get(i4);
                        arrayList3.add(Integer.valueOf(i4));
                        arrayList.add(rendition.url);
                        arrayList2.add(rendition.format);
                        z7 &= AbstractC1118i0.m2463v(1, rendition.format.f1519k) == 1;
                    }
                }
                String strM25u = AbstractC0008a1.m25u("audio:", str);
                int i9 = AbstractC1118i0.f4750a;
                HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(strM25u, 1, (Uri[]) arrayList.toArray(new Uri[0]), (C0249w[]) arrayList2.toArray(new C0249w[0]), null, Collections.EMPTY_LIST, map, j);
                list3.add(AbstractC0715d.m1569p0(arrayList3));
                list2.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
                if (this.allowChunklessPreparation && z7) {
                    hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new C0233q1[]{new C0233q1(strM25u, (C0249w[]) arrayList2.toArray(new C0249w[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void buildAndPrepareMainSampleStreamWrapper(HlsMultivariantPlaylist hlsMultivariantPlaylist, long j, List<HlsSampleStreamWrapper> list, List<int[]> list2, Map<String, C0237s> map) {
        int i;
        boolean z7;
        boolean z8;
        int size = hlsMultivariantPlaylist.variants.size();
        int[] iArr = new int[size];
        int i4 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < hlsMultivariantPlaylist.variants.size(); i9++) {
            C0249w c0249w = hlsMultivariantPlaylist.variants.get(i9).format;
            int i10 = c0249w.f1530v;
            String str = c0249w.f1519k;
            if (i10 > 0 || AbstractC1118i0.m2464w(2, str) != null) {
                iArr[i9] = 2;
                i4++;
            } else if (AbstractC1118i0.m2464w(1, str) != null) {
                iArr[i9] = 1;
                i8++;
            } else {
                iArr[i9] = -1;
            }
        }
        if (i4 > 0) {
            i = i4;
            z8 = false;
            z7 = true;
        } else if (i8 < size) {
            i = size - i8;
            z7 = false;
            z8 = true;
        } else {
            i = size;
            z7 = false;
            z8 = false;
        }
        Uri[] uriArr = new Uri[i];
        C0249w[] c0249wArr = new C0249w[i];
        int[] iArr2 = new int[i];
        int i11 = 0;
        for (int i12 = 0; i12 < hlsMultivariantPlaylist.variants.size(); i12++) {
            if ((!z7 || iArr[i12] == 2) && (!z8 || iArr[i12] != 1)) {
                HlsMultivariantPlaylist.Variant variant = hlsMultivariantPlaylist.variants.get(i12);
                uriArr[i11] = variant.url;
                c0249wArr[i11] = variant.format;
                iArr2[i11] = i12;
                i11++;
            }
        }
        String str2 = c0249wArr[0].f1519k;
        int iM2463v = AbstractC1118i0.m2463v(2, str2);
        int iM2463v2 = AbstractC1118i0.m2463v(1, str2);
        boolean z9 = (iM2463v2 == 1 || (iM2463v2 == 0 && hlsMultivariantPlaylist.audios.isEmpty())) && iM2463v <= 1 && iM2463v2 + iM2463v > 0;
        HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper("main", (z7 || iM2463v2 <= 0) ? 0 : 1, uriArr, c0249wArr, hlsMultivariantPlaylist.muxedAudioFormat, hlsMultivariantPlaylist.muxedCaptionFormats, map, j);
        list.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
        list2.add(iArr2);
        if (this.allowChunklessPreparation && z9) {
            ArrayList arrayList = new ArrayList();
            if (iM2463v > 0) {
                C0249w[] c0249wArr2 = new C0249w[i];
                for (int i13 = 0; i13 < i; i13++) {
                    c0249wArr2[i13] = deriveVideoFormat(c0249wArr[i13]);
                }
                arrayList.add(new C0233q1("main", c0249wArr2));
                if (iM2463v2 > 0 && (hlsMultivariantPlaylist.muxedAudioFormat != null || hlsMultivariantPlaylist.audios.isEmpty())) {
                    arrayList.add(new C0233q1("main:audio", deriveAudioFormat(c0249wArr[0], hlsMultivariantPlaylist.muxedAudioFormat, false)));
                }
                List<C0249w> list3 = hlsMultivariantPlaylist.muxedCaptionFormats;
                if (list3 != null) {
                    for (int i14 = 0; i14 < list3.size(); i14++) {
                        arrayList.add(new C0233q1(AbstractC0008a1.m12h(i14, "main:cc:"), this.extractorFactory.getOutputTextFormat(list3.get(i14))));
                    }
                }
            } else {
                C0249w[] c0249wArr3 = new C0249w[i];
                for (int i15 = 0; i15 < i; i15++) {
                    c0249wArr3[i15] = deriveAudioFormat(c0249wArr[i15], hlsMultivariantPlaylist.muxedAudioFormat, true);
                }
                arrayList.add(new C0233q1("main", c0249wArr3));
            }
            C0246v c0246v = new C0246v();
            c0246v.f1435a = "ID3";
            c0246v.f1447m = AbstractC0244u0.m687p("application/id3");
            C0233q1 c0233q1 = new C0233q1("main:id3", new C0249w(c0246v));
            arrayList.add(c0233q1);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo((C0233q1[]) arrayList.toArray(new C0233q1[0]), 0, arrayList.indexOf(c0233q1));
        }
    }

    private void buildAndPrepareSampleStreamWrappers(long j) {
        HlsMultivariantPlaylist multivariantPlaylist = this.playlistTracker.getMultivariantPlaylist();
        multivariantPlaylist.getClass();
        Map<String, C0237s> mapDeriveOverridingDrmInitData = this.useSessionKeys ? deriveOverridingDrmInitData(multivariantPlaylist.sessionKeyDrmInitData) : Collections.EMPTY_MAP;
        boolean zIsEmpty = multivariantPlaylist.variants.isEmpty();
        List<HlsMultivariantPlaylist.Rendition> list = multivariantPlaylist.audios;
        List<HlsMultivariantPlaylist.Rendition> list2 = multivariantPlaylist.subtitles;
        this.pendingPrepareCount = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!zIsEmpty) {
            buildAndPrepareMainSampleStreamWrapper(multivariantPlaylist, j, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
        }
        buildAndPrepareAudioSampleStreamWrappers(j, list, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
        this.audioVideoSampleStreamWrapperCount = arrayList.size();
        for (int i = 0; i < list2.size(); i++) {
            HlsMultivariantPlaylist.Rendition rendition = list2.get(i);
            String str = "subtitle:" + i + ":" + rendition.name;
            C0249w c0249w = rendition.format;
            Map<String, C0237s> map = mapDeriveOverridingDrmInitData;
            HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(str, 3, new Uri[]{rendition.url}, new C0249w[]{c0249w}, null, Collections.EMPTY_LIST, map, j);
            mapDeriveOverridingDrmInitData = map;
            arrayList2.add(new int[]{i});
            arrayList.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMultivariantPlaylistInfo(new C0233q1[]{new C0233q1(str, this.extractorFactory.getOutputTextFormat(c0249w))}, 0, new int[0]);
        }
        this.sampleStreamWrappers = (HlsSampleStreamWrapper[]) arrayList.toArray(new HlsSampleStreamWrapper[0]);
        this.manifestUrlIndicesPerWrapper = (int[][]) arrayList2.toArray(new int[0][]);
        this.pendingPrepareCount = this.sampleStreamWrappers.length;
        for (int i4 = 0; i4 < this.audioVideoSampleStreamWrapperCount; i4++) {
            this.sampleStreamWrappers[i4].setIsPrimaryTimestampSource(true);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        this.enabledSampleStreamWrappers = this.sampleStreamWrappers;
    }

    private HlsSampleStreamWrapper buildSampleStreamWrapper(String str, int i, Uri[] uriArr, C0249w[] c0249wArr, C0249w c0249w, List<C0249w> list, Map<String, C0237s> map, long j) {
        return new HlsSampleStreamWrapper(str, i, this.sampleStreamWrapperCallback, new HlsChunkSource(this.extractorFactory, this.playlistTracker, uriArr, c0249wArr, this.dataSourceFactory, this.mediaTransferListener, this.timestampAdjusterProvider, this.timestampAdjusterInitializationTimeoutMs, list, this.playerId, this.cmcdConfiguration), map, this.allocator, j, c0249w, this.drmSessionManager, this.drmEventDispatcher, this.loadErrorHandlingPolicy, this.eventDispatcher, this.metadataType);
    }

    private static C0249w deriveAudioFormat(C0249w c0249w, C0249w c0249w2, boolean z7) {
        C0241t0 c0241t0;
        int i;
        String str;
        String str2;
        AbstractC0983m0 abstractC0983m0;
        int i4;
        int i8;
        String str3;
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        C0981l1 c0981l1 = C0981l1.f4211n;
        if (c0249w2 != null) {
            str2 = c0249w2.f1519k;
            c0241t0 = c0249w2.f1520l;
            i4 = c0249w2.f1498C;
            i = c0249w2.f1513e;
            i8 = c0249w2.f1514f;
            str = c0249w2.f1512d;
            str3 = c0249w2.f1510b;
            abstractC0983m0 = c0249w2.f1511c;
        } else {
            String strM2464w = AbstractC1118i0.m2464w(1, c0249w.f1519k);
            c0241t0 = c0249w.f1520l;
            if (z7) {
                i4 = c0249w.f1498C;
                i = c0249w.f1513e;
                i8 = c0249w.f1514f;
                str = c0249w.f1512d;
                str3 = c0249w.f1510b;
                str2 = strM2464w;
                abstractC0983m0 = c0249w.f1511c;
            } else {
                i = 0;
                str = null;
                str2 = strM2464w;
                abstractC0983m0 = c0981l1;
                i4 = -1;
                i8 = 0;
                str3 = null;
            }
        }
        String strM676e = AbstractC0244u0.m676e(str2);
        int i9 = z7 ? c0249w.f1516h : -1;
        int i10 = z7 ? c0249w.f1517i : -1;
        C0246v c0246v = new C0246v();
        c0246v.f1435a = c0249w.f1509a;
        c0246v.f1436b = str3;
        c0246v.f1437c = AbstractC0983m0.m2165j(abstractC0983m0);
        c0246v.f1446l = AbstractC0244u0.m687p(c0249w.f1521m);
        c0246v.f1447m = AbstractC0244u0.m687p(strM676e);
        c0246v.f1444j = str2;
        c0246v.f1445k = c0241t0;
        c0246v.f1442h = i9;
        c0246v.f1443i = i10;
        c0246v.f1425B = i4;
        c0246v.f1439e = i;
        c0246v.f1440f = i8;
        c0246v.f1438d = str;
        return new C0249w(c0246v);
    }

    private static Map<String, C0237s> deriveOverridingDrmInitData(List<C0237s> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            C0237s c0237s = list.get(i);
            String str = c0237s.f1407l;
            i++;
            int i4 = i;
            while (i4 < arrayList.size()) {
                C0237s c0237s2 = (C0237s) arrayList.get(i4);
                String str2 = c0237s2.f1407l;
                if (TextUtils.equals(str2, str)) {
                    String str3 = c0237s.f1407l;
                    AbstractC1101a.m2359j(str3 == null || str2 == null || TextUtils.equals(str3, str2));
                    if (str3 != null) {
                        str2 = str3;
                    }
                    C0234r[] c0234rArr = c0237s.f1405j;
                    C0234r[] c0234rArr2 = c0237s2.f1405j;
                    int i8 = AbstractC1118i0.f4750a;
                    Object[] objArrCopyOf = Arrays.copyOf(c0234rArr, c0234rArr.length + c0234rArr2.length);
                    System.arraycopy(c0234rArr2, 0, objArrCopyOf, c0234rArr.length, c0234rArr2.length);
                    c0237s = new C0237s(str2, true, (C0234r[]) objArrCopyOf);
                    arrayList.remove(i4);
                } else {
                    i4++;
                }
            }
            map.put(str, c0237s);
        }
        return map;
    }

    private static C0249w deriveVideoFormat(C0249w c0249w) {
        String strM2464w = AbstractC1118i0.m2464w(2, c0249w.f1519k);
        String strM676e = AbstractC0244u0.m676e(strM2464w);
        C0246v c0246v = new C0246v();
        c0246v.f1435a = c0249w.f1509a;
        c0246v.f1436b = c0249w.f1510b;
        c0246v.f1437c = AbstractC0983m0.m2165j(c0249w.f1511c);
        c0246v.f1446l = AbstractC0244u0.m687p(c0249w.f1521m);
        c0246v.f1447m = AbstractC0244u0.m687p(strM676e);
        c0246v.f1444j = strM2464w;
        c0246v.f1445k = c0249w.f1520l;
        c0246v.f1442h = c0249w.f1516h;
        c0246v.f1443i = c0249w.f1517i;
        c0246v.f1454t = c0249w.f1529u;
        c0246v.f1455u = c0249w.f1530v;
        c0246v.f1456v = c0249w.f1531w;
        c0246v.f1439e = c0249w.f1513e;
        c0246v.f1440f = c0249w.f1514f;
        return new C0249w(c0246v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectTracks$0(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        return hlsSampleStreamWrapper.getTrackGroups().getTrackTypes();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        if (this.trackGroups != null) {
            return this.compositeSequenceableLoader.continueLoading(loadingInfo);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z7) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            hlsSampleStreamWrapper.discardBuffer(j, z7);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            if (hlsSampleStreamWrapper.isVideoSampleStream()) {
                return hlsSampleStreamWrapper.getAdjustedSeekPositionUs(j, seekParameters);
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public List<C0212j1> getStreamKeys(List<ExoTrackSelection> list) {
        int[] iArr;
        TrackGroupArray trackGroups;
        int primaryTrackGroupIndex;
        int i;
        HlsMediaPeriod hlsMediaPeriod = this;
        HlsMultivariantPlaylist multivariantPlaylist = hlsMediaPeriod.playlistTracker.getMultivariantPlaylist();
        multivariantPlaylist.getClass();
        boolean zIsEmpty = multivariantPlaylist.variants.isEmpty();
        boolean z7 = !zIsEmpty;
        int length = hlsMediaPeriod.sampleStreamWrappers.length - multivariantPlaylist.subtitles.size();
        int i4 = 0;
        if (zIsEmpty) {
            iArr = new int[0];
            trackGroups = TrackGroupArray.EMPTY;
            primaryTrackGroupIndex = 0;
        } else {
            HlsSampleStreamWrapper hlsSampleStreamWrapper = hlsMediaPeriod.sampleStreamWrappers[0];
            iArr = hlsMediaPeriod.manifestUrlIndicesPerWrapper[0];
            trackGroups = hlsSampleStreamWrapper.getTrackGroups();
            primaryTrackGroupIndex = hlsSampleStreamWrapper.getPrimaryTrackGroupIndex();
        }
        ArrayList arrayList = new ArrayList();
        boolean z8 = false;
        boolean z9 = false;
        for (ExoTrackSelection exoTrackSelection : list) {
            C0233q1 trackGroup = exoTrackSelection.getTrackGroup();
            int iIndexOf = trackGroups.indexOf(trackGroup);
            if (iIndexOf == -1) {
                ?? r15 = z7;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = hlsMediaPeriod.sampleStreamWrappers;
                    if (r15 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[r15].getTrackGroups().indexOf(trackGroup) != -1) {
                        int i8 = r15 < length ? 1 : 2;
                        int[] iArr2 = hlsMediaPeriod.manifestUrlIndicesPerWrapper[r15];
                        int i9 = 0;
                        while (i9 < exoTrackSelection.length()) {
                            arrayList.add(new C0212j1(0, i8, iArr2[exoTrackSelection.getIndexInTrackGroup(i9)]));
                            i9++;
                            primaryTrackGroupIndex = primaryTrackGroupIndex;
                        }
                    } else {
                        hlsMediaPeriod = this;
                        r15++;
                    }
                }
                i = primaryTrackGroupIndex;
            } else if (iIndexOf == primaryTrackGroupIndex) {
                for (int i10 = i4; i10 < exoTrackSelection.length(); i10++) {
                    arrayList.add(new C0212j1(i4, i4, iArr[exoTrackSelection.getIndexInTrackGroup(i10)]));
                }
                i = primaryTrackGroupIndex;
                z9 = true;
            } else {
                i = primaryTrackGroupIndex;
                z8 = true;
            }
            hlsMediaPeriod = this;
            primaryTrackGroupIndex = i;
            i4 = 0;
        }
        if (z8 && !z9) {
            int i11 = iArr[0];
            int i12 = multivariantPlaylist.variants.get(i11).format.f1518j;
            for (int i13 = 1; i13 < iArr.length; i13++) {
                int i14 = multivariantPlaylist.variants.get(iArr[i13]).format.f1518j;
                if (i14 < i12) {
                    i11 = iArr[i13];
                    i12 = i14;
                }
            }
            arrayList.add(new C0212j1(0, 0, i11));
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        TrackGroupArray trackGroupArray = this.trackGroups;
        trackGroupArray.getClass();
        return trackGroupArray;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws C0247v0 {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public void onPlaylistChanged() {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.onPlaylistUpdated();
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public boolean onPlaylistError(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z7) {
        boolean zOnPlaylistError = true;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            zOnPlaylistError &= hlsSampleStreamWrapper.onPlaylistError(uri, loadErrorInfo, z7);
        }
        this.mediaPeriodCallback.onContinueLoadingRequested(this);
        return zOnPlaylistError;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.mediaPeriodCallback = callback;
        this.playlistTracker.addListener(this);
        buildAndPrepareSampleStreamWrappers(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    public void release() {
        this.playlistTracker.removeListener(this);
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.release();
        }
        this.mediaPeriodCallback = null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.enabledSampleStreamWrappers;
        if (hlsSampleStreamWrapperArr.length > 0) {
            boolean zSeekToUs = hlsSampleStreamWrapperArr[0].seekToUs(j, false);
            int i = 1;
            while (true) {
                HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = this.enabledSampleStreamWrappers;
                if (i >= hlsSampleStreamWrapperArr2.length) {
                    break;
                }
                hlsSampleStreamWrapperArr2[i].seekToUs(j, zSeekToUs);
                i++;
            }
            if (zSeekToUs) {
                this.timestampAdjusterProvider.reset();
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        int[] iArr = new int[exoTrackSelectionArr.length];
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        for (int i = 0; i < exoTrackSelectionArr.length; i++) {
            SampleStream sampleStream = sampleStreamArr[i];
            iArr[i] = sampleStream == null ? -1 : this.streamWrapperIndices.get(sampleStream).intValue();
            iArr2[i] = -1;
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
            if (exoTrackSelection != null) {
                C0233q1 trackGroup = exoTrackSelection.getTrackGroup();
                int i4 = 0;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.sampleStreamWrappers;
                    if (i4 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[i4].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i] = i4;
                        break;
                    }
                    i4++;
                }
            }
        }
        this.streamWrapperIndices.clear();
        int length = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length];
        SampleStream[] sampleStreamArr3 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = new HlsSampleStreamWrapper[this.sampleStreamWrappers.length];
        int i8 = 0;
        int i9 = 0;
        boolean z7 = false;
        while (i8 < this.sampleStreamWrappers.length) {
            for (int i10 = 0; i10 < exoTrackSelectionArr.length; i10++) {
                ExoTrackSelection exoTrackSelection2 = null;
                sampleStreamArr3[i10] = iArr[i10] == i8 ? sampleStreamArr[i10] : null;
                if (iArr2[i10] == i8) {
                    exoTrackSelection2 = exoTrackSelectionArr[i10];
                }
                exoTrackSelectionArr2[i10] = exoTrackSelection2;
            }
            HlsSampleStreamWrapper hlsSampleStreamWrapper = this.sampleStreamWrappers[i8];
            int[] iArr3 = iArr;
            int i11 = i8;
            int i12 = i9;
            boolean zSelectTracks = hlsSampleStreamWrapper.selectTracks(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j, z7);
            boolean z8 = false;
            for (int i13 = 0; i13 < exoTrackSelectionArr.length; i13++) {
                SampleStream sampleStream2 = sampleStreamArr3[i13];
                if (iArr2[i13] == i11) {
                    sampleStream2.getClass();
                    sampleStreamArr2[i13] = sampleStream2;
                    this.streamWrapperIndices.put(sampleStream2, Integer.valueOf(i11));
                    z8 = true;
                } else if (iArr3[i13] == i11) {
                    AbstractC1101a.m2359j(sampleStream2 == null);
                }
            }
            if (z8) {
                hlsSampleStreamWrapperArr2[i12] = hlsSampleStreamWrapper;
                i9 = i12 + 1;
                if (i12 == 0) {
                    hlsSampleStreamWrapper.setIsPrimaryTimestampSource(true);
                    if (!zSelectTracks) {
                        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr3 = this.enabledSampleStreamWrappers;
                        if (hlsSampleStreamWrapperArr3.length == 0 || hlsSampleStreamWrapper != hlsSampleStreamWrapperArr3[0]) {
                            this.timestampAdjusterProvider.reset();
                            z7 = true;
                        }
                    }
                } else {
                    hlsSampleStreamWrapper.setIsPrimaryTimestampSource(i11 < this.audioVideoSampleStreamWrapperCount);
                }
            } else {
                i9 = i12;
            }
            i8 = i11 + 1;
            iArr = iArr3;
        }
        System.arraycopy(sampleStreamArr2, 0, sampleStreamArr, 0, length);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr4 = (HlsSampleStreamWrapper[]) AbstractC1118i0.m2430U(i9, hlsSampleStreamWrapperArr2);
        this.enabledSampleStreamWrappers = hlsSampleStreamWrapperArr4;
        C0981l1 c0981l1M2166k = AbstractC0983m0.m2166k(hlsSampleStreamWrapperArr4);
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.create(c0981l1M2166k, AbstractC1006u.m2206u(new C0368a(), c0981l1M2166k));
        return j;
    }
}
