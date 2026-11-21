package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0170a0;
import androidx.media3.common.C0184b0;
import androidx.media3.common.C0188c0;
import androidx.media3.common.C0196e0;
import androidx.media3.common.C0199f0;
import androidx.media3.common.C0202g0;
import androidx.media3.common.C0205h0;
import androidx.media3.common.C0208i0;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0214k0;
import androidx.media3.common.C0223n0;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0235r0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0191d;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import androidx.media3.exoplayer.source.ExternallyLoadedMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.SingleSampleMediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.bumptech.glide.AbstractC0715d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.C2181z;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p002a1.AbstractC0008a1;
import p002a1.C0016e;
import p043e6.InterfaceC0921i;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p089k1.C1568l;
import p089k1.InterfaceC1563g;
import p090k2.C1587e;
import p090k2.C1594l;
import p090k2.InterfaceC1597o;
import p115n1.C1964a0;
import p115n1.C1985l;
import p115n1.C1992s;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p115n1.InterfaceC1990q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String TAG = "DMediaSourceFactory";
    private InterfaceC0191d adViewProvider;
    private AdsLoader.Provider adsLoaderProvider;
    private InterfaceC1563g dataSourceFactory;
    private final DelegateFactoryLoader delegateFactoryLoader;
    private ExternalLoader externalImageLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private boolean parseSubtitlesDuringExtraction;
    private MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private InterfaceC1597o subtitleParserFactory;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Deprecated
    public interface AdsLoaderProvider extends AdsLoader.Provider {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class DelegateFactoryLoader {
        private CmcdConfiguration.Factory cmcdConfigurationFactory;
        private InterfaceC1563g dataSourceFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private final InterfaceC1990q extractorsFactory;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private InterfaceC1597o subtitleParserFactory;
        private final Map<Integer, InterfaceC0921i> mediaSourceFactorySuppliers = new HashMap();
        private final Map<Integer, MediaSource.Factory> mediaSourceFactories = new HashMap();
        private boolean parseSubtitlesDuringExtraction = true;

        public DelegateFactoryLoader(InterfaceC1990q interfaceC1990q, InterfaceC1597o interfaceC1597o) {
            this.extractorsFactory = interfaceC1990q;
            this.subtitleParserFactory = interfaceC1597o;
        }

        private void ensureAllSuppliersAreLoaded() {
            maybeLoadSupplier(0);
            maybeLoadSupplier(1);
            maybeLoadSupplier(2);
            maybeLoadSupplier(3);
            maybeLoadSupplier(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ MediaSource.Factory lambda$loadSupplier$4(InterfaceC1563g interfaceC1563g) {
            return new ProgressiveMediaSource.Factory(interfaceC1563g, this.extractorsFactory);
        }

        private InterfaceC0921i loadSupplier(int i) {
            InterfaceC0921i c0444f;
            InterfaceC0921i interfaceC0921i = this.mediaSourceFactorySuppliers.get(Integer.valueOf(i));
            if (interfaceC0921i != null) {
                return interfaceC0921i;
            }
            final InterfaceC1563g interfaceC1563g = this.dataSourceFactory;
            interfaceC1563g.getClass();
            final int i4 = 0;
            if (i != 0) {
                final int i8 = 1;
                if (i != 1) {
                    final int i9 = 2;
                    if (i == 2) {
                        int i10 = HlsMediaSource.Factory.f1759a;
                        final Class clsAsSubclass = HlsMediaSource.Factory.class.asSubclass(MediaSource.Factory.class);
                        c0444f = new InterfaceC0921i() { // from class: androidx.media3.exoplayer.source.d
                            @Override // p043e6.InterfaceC0921i
                            public final Object get() {
                                switch (i9) {
                                }
                                return DefaultMediaSourceFactory.access$100(clsAsSubclass, interfaceC1563g);
                            }
                        };
                    } else if (i == 3) {
                        final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(MediaSource.Factory.class);
                        c0444f = new InterfaceC0921i() { // from class: androidx.media3.exoplayer.source.e
                            @Override // p043e6.InterfaceC0921i
                            public final Object get() {
                                return DefaultMediaSourceFactory.access$000(clsAsSubclass2);
                            }
                        };
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Unrecognized contentType: "));
                        }
                        c0444f = new C0444f(this, i4, interfaceC1563g);
                    }
                } else {
                    int i11 = SsMediaSource.Factory.f1804a;
                    final Class clsAsSubclass3 = SsMediaSource.Factory.class.asSubclass(MediaSource.Factory.class);
                    c0444f = new InterfaceC0921i() { // from class: androidx.media3.exoplayer.source.d
                        @Override // p043e6.InterfaceC0921i
                        public final Object get() {
                            switch (i8) {
                            }
                            return DefaultMediaSourceFactory.access$100(clsAsSubclass3, interfaceC1563g);
                        }
                    };
                }
            } else {
                int i12 = DashMediaSource.Factory.f1712a;
                final Class clsAsSubclass4 = DashMediaSource.Factory.class.asSubclass(MediaSource.Factory.class);
                c0444f = new InterfaceC0921i() { // from class: androidx.media3.exoplayer.source.d
                    @Override // p043e6.InterfaceC0921i
                    public final Object get() {
                        switch (i4) {
                        }
                        return DefaultMediaSourceFactory.access$100(clsAsSubclass4, interfaceC1563g);
                    }
                };
            }
            this.mediaSourceFactorySuppliers.put(Integer.valueOf(i), c0444f);
            return c0444f;
        }

        private InterfaceC0921i maybeLoadSupplier(int i) {
            try {
                return loadSupplier(i);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public MediaSource.Factory getMediaSourceFactory(int i) {
            MediaSource.Factory factory = this.mediaSourceFactories.get(Integer.valueOf(i));
            if (factory != null) {
                return factory;
            }
            MediaSource.Factory factory2 = (MediaSource.Factory) loadSupplier(i).get();
            CmcdConfiguration.Factory factory3 = this.cmcdConfigurationFactory;
            if (factory3 != null) {
                factory2.setCmcdConfigurationFactory(factory3);
            }
            DrmSessionManagerProvider drmSessionManagerProvider = this.drmSessionManagerProvider;
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            if (loadErrorHandlingPolicy != null) {
                factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
            factory2.setSubtitleParserFactory(this.subtitleParserFactory);
            factory2.experimentalParseSubtitlesDuringExtraction(this.parseSubtitlesDuringExtraction);
            this.mediaSourceFactories.put(Integer.valueOf(i), factory2);
            return factory2;
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return AbstractC0715d.m1569p0(this.mediaSourceFactorySuppliers.keySet());
        }

        public void setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = factory;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setCmcdConfigurationFactory(factory);
            }
        }

        public void setDataSourceFactory(InterfaceC1563g interfaceC1563g) {
            if (interfaceC1563g != this.dataSourceFactory) {
                this.dataSourceFactory = interfaceC1563g;
                this.mediaSourceFactorySuppliers.clear();
                this.mediaSourceFactories.clear();
            }
        }

        public void setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
        }

        public void setJpegExtractorFlags(int i) {
            InterfaceC1990q interfaceC1990q = this.extractorsFactory;
            if (interfaceC1990q instanceof C1985l) {
                C1985l c1985l = (C1985l) interfaceC1990q;
                synchronized (c1985l) {
                    c1985l.f7370f = i;
                }
            }
        }

        public void setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
        }

        public void setParseSubtitlesDuringExtraction(boolean z7) {
            this.parseSubtitlesDuringExtraction = z7;
            this.extractorsFactory.mo3869b(z7);
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().experimentalParseSubtitlesDuringExtraction(z7);
            }
        }

        public void setSubtitleParserFactory(InterfaceC1597o interfaceC1597o) {
            this.subtitleParserFactory = interfaceC1597o;
            this.extractorsFactory.setSubtitleParserFactory(interfaceC1597o);
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setSubtitleParserFactory(interfaceC1597o);
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class UnknownSubtitlesExtractor implements InterfaceC1987n {
        private final C0249w format;

        public UnknownSubtitlesExtractor(C0249w c0249w) {
            this.format = c0249w;
        }

        @Override // p115n1.InterfaceC1987n
        public List getSniffFailureDetails() {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            return C0981l1.f4211n;
        }

        @Override // p115n1.InterfaceC1987n
        @SideEffectFree
        public InterfaceC1987n getUnderlyingImplementation() {
            return this;
        }

        @Override // p115n1.InterfaceC1987n
        public void init(InterfaceC1989p interfaceC1989p) {
            InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(0, 3);
            interfaceC1989p.seekMap(new C1992s(-9223372036854775807L));
            interfaceC1989p.endTracks();
            C0246v c0246vM692a = this.format.m692a();
            c0246vM692a.f1447m = AbstractC0244u0.m687p("text/x-unknown");
            c0246vM692a.f1444j = this.format.f1522n;
            interfaceC1980i0Track.format(new C0249w(c0246vM692a));
        }

        @Override // p115n1.InterfaceC1987n
        public int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) {
            return interfaceC1988o.mo3858e(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // p115n1.InterfaceC1987n
        public void release() {
        }

        @Override // p115n1.InterfaceC1987n
        public void seek(long j, long j8) {
        }

        @Override // p115n1.InterfaceC1987n
        public boolean sniff(InterfaceC1988o interfaceC1988o) {
            return true;
        }
    }

    public DefaultMediaSourceFactory(Context context) {
        this(new C0016e(context));
    }

    public static /* synthetic */ MediaSource.Factory access$000(Class cls) {
        return newInstance(cls);
    }

    public static /* synthetic */ MediaSource.Factory access$100(Class cls, InterfaceC1563g interfaceC1563g) {
        return newInstance(cls, interfaceC1563g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC1987n[] lambda$createMediaSource$0(C0249w c0249w) {
        return new InterfaceC1987n[]{this.subtitleParserFactory.supportsFormat(c0249w) ? new C1594l(this.subtitleParserFactory.mo3259g(c0249w), c0249w) : new UnknownSubtitlesExtractor(c0249w)};
    }

    private static MediaSource maybeClipMediaSource(C0226o0 c0226o0, MediaSource mediaSource) {
        C0196e0 c0196e0 = c0226o0.f1242e;
        long j = c0196e0.f1079b;
        return (j == 0 && c0196e0.f1081d == Long.MIN_VALUE && !c0196e0.f1083f) ? mediaSource : new ClippingMediaSource(mediaSource, j, c0196e0.f1081d, !c0196e0.f1084g, c0196e0.f1082e, c0196e0.f1083f);
    }

    private MediaSource maybeWrapWithAdsMediaSource(C0226o0 c0226o0, MediaSource mediaSource) {
        c0226o0.f1239b.getClass();
        C0211j0 c0211j0 = c0226o0.f1239b;
        C0170a0 c0170a0 = c0211j0.f1150d;
        if (c0170a0 == null) {
            return mediaSource;
        }
        Uri uri = c0170a0.f974a;
        AdsLoader.Provider provider = this.adsLoaderProvider;
        InterfaceC0191d interfaceC0191d = this.adViewProvider;
        if (provider == null || interfaceC0191d == null) {
            AbstractC1101a.m2348F(TAG, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        AdsLoader adsLoader = provider.getAdsLoader(c0170a0);
        if (adsLoader == null) {
            AbstractC1101a.m2348F(TAG, "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        C1568l c1568l = new C1568l(uri);
        Object[] objArr = {c0226o0.f1238a, c0211j0.f1147a, uri};
        AbstractC1006u.m2187b(3, objArr);
        return new AdsMediaSource(mediaSource, c1568l, AbstractC0983m0.m2163h(3, objArr), this, adsLoader, interfaceC0191d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls, InterfaceC1563g interfaceC1563g) {
        try {
            return cls.getConstructor(InterfaceC1563g.class).newInstance(interfaceC1563g);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public DefaultMediaSourceFactory clearLocalAdInsertionComponents() {
        this.adsLoaderProvider = null;
        this.adViewProvider = null;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public MediaSource createMediaSource(C0226o0 c0226o0) {
        C0211j0 c0211j0;
        C0226o0 c0226o0M608a = c0226o0;
        C0211j0 c0211j02 = c0226o0M608a.f1239b;
        C0208i0 c0208i0 = c0226o0M608a.f1240c;
        c0211j02.getClass();
        C0211j0 c0211j03 = c0226o0M608a.f1239b;
        Uri uri = c0211j03.f1147a;
        long j = c0211j03.f1155i;
        String str = c0211j03.f1148b;
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            MediaSource.Factory factory = this.serverSideAdInsertionMediaSourceFactory;
            factory.getClass();
            return factory.createMediaSource(c0226o0M608a);
        }
        if (Objects.equals(str, "application/x-image-uri")) {
            long jM2428S = AbstractC1118i0.m2428S(j);
            ExternalLoader externalLoader = this.externalImageLoader;
            externalLoader.getClass();
            return new ExternallyLoadedMediaSource.Factory(jM2428S, externalLoader).createMediaSource(c0226o0M608a);
        }
        int iM2420K = AbstractC1118i0.m2420K(c0211j03.f1147a, str);
        boolean z7 = true;
        if (j != -9223372036854775807L) {
            this.delegateFactoryLoader.setJpegExtractorFlags(1);
        }
        try {
            MediaSource.Factory mediaSourceFactory = this.delegateFactoryLoader.getMediaSourceFactory(iM2420K);
            C0205h0 c0205h0M626a = c0208i0.m626a();
            if (c0208i0.f1128a == -9223372036854775807L) {
                c0205h0M626a.f1116a = this.liveTargetOffsetMs;
            }
            if (c0208i0.f1131d == -3.4028235E38f) {
                c0205h0M626a.f1119d = this.liveMinSpeed;
            }
            if (c0208i0.f1132e == -3.4028235E38f) {
                c0205h0M626a.f1120e = this.liveMaxSpeed;
            }
            if (c0208i0.f1129b == -9223372036854775807L) {
                c0205h0M626a.f1117b = this.liveMinOffsetMs;
            }
            if (c0208i0.f1130c == -9223372036854775807L) {
                c0205h0M626a.f1118c = this.liveMaxOffsetMs;
            }
            C0208i0 c0208i02 = new C0208i0(c0205h0M626a);
            if (!c0208i02.equals(c0208i0)) {
                C0184b0 c0184b0M652a = c0226o0M608a.m652a();
                c0184b0M652a.f1042m = c0208i02.m626a();
                c0226o0M608a = c0184b0M652a.m608a();
            }
            MediaSource mediaSourceCreateMediaSource = mediaSourceFactory.createMediaSource(c0226o0M608a);
            AbstractC0983m0 abstractC0983m0 = c0226o0M608a.f1239b.f1153g;
            if (!abstractC0983m0.isEmpty()) {
                MediaSource[] mediaSourceArr = new MediaSource[abstractC0983m0.size() + 1];
                boolean z8 = false;
                mediaSourceArr[0] = mediaSourceCreateMediaSource;
                int i = 0;
                while (i < abstractC0983m0.size()) {
                    if (this.parseSubtitlesDuringExtraction) {
                        C0246v c0246v = new C0246v();
                        c0246v.f1447m = AbstractC0244u0.m687p(((C0223n0) abstractC0983m0.get(i)).f1220b);
                        c0246v.f1438d = ((C0223n0) abstractC0983m0.get(i)).f1221c;
                        c0246v.f1439e = ((C0223n0) abstractC0983m0.get(i)).f1222d;
                        c0246v.f1440f = ((C0223n0) abstractC0983m0.get(i)).f1223e;
                        c0246v.f1436b = ((C0223n0) abstractC0983m0.get(i)).f1224f;
                        c0246v.f1435a = ((C0223n0) abstractC0983m0.get(i)).f1225g;
                        final C0249w c0249w = new C0249w(c0246v);
                        ProgressiveMediaSource.Factory suppressPrepareError = new ProgressiveMediaSource.Factory(this.dataSourceFactory, new InterfaceC1990q() { // from class: androidx.media3.exoplayer.source.c
                            @Override // p115n1.InterfaceC1990q
                            /* renamed from: a */
                            public final InterfaceC1987n[] mo967a() {
                                return this.f1823b.lambda$createMediaSource$0(c0249w);
                            }
                        }).setSuppressPrepareError(z7);
                        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy != null) {
                            suppressPrepareError.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
                        }
                        int i4 = i + 1;
                        String string = ((C0223n0) abstractC0983m0.get(i)).f1219a.toString();
                        C0188c0 c0188c0 = new C0188c0();
                        C0199f0 c0199f0 = new C0199f0();
                        List list = Collections.EMPTY_LIST;
                        C0981l1 c0981l1 = C0981l1.f4211n;
                        C0205h0 c0205h0 = new C0205h0();
                        C0214k0 c0214k0 = C0214k0.f1167d;
                        Uri uri2 = string == null ? null : Uri.parse(string);
                        AbstractC1101a.m2359j((c0199f0.f1091b == null || c0199f0.f1090a != null) ? true : z8);
                        if (uri2 != null) {
                            c0211j0 = new C0211j0(uri2, null, c0199f0.f1090a != null ? new C0202g0(c0199f0) : null, null, list, null, c0981l1, null, -9223372036854775807L);
                        } else {
                            c0211j0 = null;
                        }
                        mediaSourceArr[i4] = suppressPrepareError.createMediaSource(new C0226o0(C2181z.FRAGMENT_ENCODE_SET, new C0196e0(c0188c0), c0211j0, new C0208i0(c0205h0), C0235r0.f1329K, c0214k0));
                    } else {
                        SingleSampleMediaSource.Factory factory2 = new SingleSampleMediaSource.Factory(this.dataSourceFactory);
                        LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy2 != null) {
                            factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy2);
                        }
                        mediaSourceArr[i + 1] = factory2.createMediaSource((C0223n0) abstractC0983m0.get(i), -9223372036854775807L);
                    }
                    i++;
                    z7 = true;
                    z8 = false;
                }
                mediaSourceCreateMediaSource = new MergingMediaSource(mediaSourceArr);
            }
            return maybeWrapWithAdsMediaSource(c0226o0M608a, maybeClipMediaSource(c0226o0M608a, mediaSourceCreateMediaSource));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public int[] getSupportedTypes() {
        return this.delegateFactoryLoader.getSupportedTypes();
    }

    @Deprecated
    public DefaultMediaSourceFactory setAdViewProvider(InterfaceC0191d interfaceC0191d) {
        this.adViewProvider = interfaceC0191d;
        return this;
    }

    @Deprecated
    public DefaultMediaSourceFactory setAdsLoaderProvider(AdsLoader.Provider provider) {
        this.adsLoaderProvider = provider;
        return this;
    }

    public DefaultMediaSourceFactory setDataSourceFactory(InterfaceC1563g interfaceC1563g) {
        this.dataSourceFactory = interfaceC1563g;
        this.delegateFactoryLoader.setDataSourceFactory(interfaceC1563g);
        return this;
    }

    public DefaultMediaSourceFactory setExternalImageLoader(ExternalLoader externalLoader) {
        this.externalImageLoader = externalLoader;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxOffsetMs(long j) {
        this.liveMaxOffsetMs = j;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMaxSpeed(float f8) {
        this.liveMaxSpeed = f8;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinOffsetMs(long j) {
        this.liveMinOffsetMs = j;
        return this;
    }

    public DefaultMediaSourceFactory setLiveMinSpeed(float f8) {
        this.liveMinSpeed = f8;
        return this;
    }

    public DefaultMediaSourceFactory setLiveTargetOffsetMs(long j) {
        this.liveTargetOffsetMs = j;
        return this;
    }

    public DefaultMediaSourceFactory setLocalAdInsertionComponents(AdsLoader.Provider provider, InterfaceC0191d interfaceC0191d) {
        provider.getClass();
        this.adsLoaderProvider = provider;
        interfaceC0191d.getClass();
        this.adViewProvider = interfaceC0191d;
        return this;
    }

    public DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(MediaSource.Factory factory) {
        this.serverSideAdInsertionMediaSourceFactory = factory;
        return this;
    }

    public DefaultMediaSourceFactory(Context context, InterfaceC1990q interfaceC1990q) {
        this(new C0016e(context), interfaceC1990q);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @Deprecated
    public DefaultMediaSourceFactory experimentalParseSubtitlesDuringExtraction(boolean z7) {
        this.parseSubtitlesDuringExtraction = z7;
        this.delegateFactoryLoader.setParseSubtitlesDuringExtraction(z7);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public DefaultMediaSourceFactory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
        DelegateFactoryLoader delegateFactoryLoader = this.delegateFactoryLoader;
        factory.getClass();
        delegateFactoryLoader.setCmcdConfigurationFactory(factory);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        DelegateFactoryLoader delegateFactoryLoader = this.delegateFactoryLoader;
        AbstractC1101a.m2357h("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.", drmSessionManagerProvider);
        delegateFactoryLoader.setDrmSessionManagerProvider(drmSessionManagerProvider);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        AbstractC1101a.m2357h("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.", loadErrorHandlingPolicy);
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.delegateFactoryLoader.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    public DefaultMediaSourceFactory setSubtitleParserFactory(InterfaceC1597o interfaceC1597o) {
        interfaceC1597o.getClass();
        this.subtitleParserFactory = interfaceC1597o;
        this.delegateFactoryLoader.setSubtitleParserFactory(interfaceC1597o);
        return this;
    }

    public DefaultMediaSourceFactory(InterfaceC1563g interfaceC1563g) {
        this(interfaceC1563g, new C1985l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public DefaultMediaSourceFactory(InterfaceC1563g interfaceC1563g, InterfaceC1990q interfaceC1990q) {
        this.dataSourceFactory = interfaceC1563g;
        C1587e c1587e = new C1587e();
        this.subtitleParserFactory = c1587e;
        DelegateFactoryLoader delegateFactoryLoader = new DelegateFactoryLoader(interfaceC1990q, c1587e);
        this.delegateFactoryLoader = delegateFactoryLoader;
        delegateFactoryLoader.setDataSourceFactory(interfaceC1563g);
        this.liveTargetOffsetMs = -9223372036854775807L;
        this.liveMinOffsetMs = -9223372036854775807L;
        this.liveMaxOffsetMs = -9223372036854775807L;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
        this.parseSubtitlesDuringExtraction = true;
    }
}
