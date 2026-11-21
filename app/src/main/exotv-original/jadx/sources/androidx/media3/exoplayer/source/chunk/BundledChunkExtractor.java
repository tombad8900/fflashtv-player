package androidx.media3.exoplayer.source.chunk;

import android.util.SparseArray;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import java.util.List;
import java.util.Objects;
import okhttp3.C2181z;
import p048f2.C0935d;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p064h2.C1144i;
import p081j2.C1487a;
import p090k2.C1587e;
import p090k2.C1594l;
import p090k2.InterfaceC1597o;
import p115n1.C1964a0;
import p115n1.C1978h0;
import p115n1.C1981j;
import p115n1.C1986m;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class BundledChunkExtractor implements InterfaceC1989p, ChunkExtractor {
    public static final Factory FACTORY = new Factory();
    private static final C1964a0 POSITION_HOLDER = new C1964a0();
    private final SparseArray<BindingTrackOutput> bindingTrackOutputs = new SparseArray<>();
    private long endTimeUs;
    private final InterfaceC1987n extractor;
    private boolean extractorInitialized;
    private final C0249w primaryTrackManifestFormat;
    private final int primaryTrackType;
    private C0249w[] sampleFormats;
    private InterfaceC1968c0 seekMap;
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class BindingTrackOutput implements InterfaceC1980i0 {
        private long endTimeUs;
        private final C1986m fakeTrackOutput = new C1986m();

        /* renamed from: id */
        private final int f1825id;
        private final C0249w manifestFormat;
        public C0249w sampleFormat;
        private InterfaceC1980i0 trackOutput;
        private final int type;

        public BindingTrackOutput(int i, int i4, C0249w c0249w) {
            this.f1825id = i;
            this.type = i4;
            this.manifestFormat = c0249w;
        }

        public void bind(ChunkExtractor.TrackOutputProvider trackOutputProvider, long j) {
            if (trackOutputProvider == null) {
                this.trackOutput = this.fakeTrackOutput;
                return;
            }
            this.endTimeUs = j;
            InterfaceC1980i0 interfaceC1980i0Track = trackOutputProvider.track(this.f1825id, this.type);
            this.trackOutput = interfaceC1980i0Track;
            C0249w c0249w = this.sampleFormat;
            if (c0249w != null) {
                interfaceC1980i0Track.format(c0249w);
            }
        }

        @Override // p115n1.InterfaceC1980i0
        public void format(C0249w c0249w) {
            C0249w c0249w2 = this.manifestFormat;
            if (c0249w2 != null) {
                c0249w = c0249w.m695f(c0249w2);
            }
            this.sampleFormat = c0249w;
            InterfaceC1980i0 interfaceC1980i0 = this.trackOutput;
            int i = AbstractC1118i0.f4750a;
            interfaceC1980i0.format(c0249w);
        }

        @Override // p115n1.InterfaceC1980i0
        public int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7) {
            return sampleData(interfaceC0219m, i, z7, 0);
        }

        @Override // p115n1.InterfaceC1980i0
        public void sampleMetadata(long j, int i, int i4, int i8, C1978h0 c1978h0) {
            long j8 = this.endTimeUs;
            if (j8 != -9223372036854775807L && j >= j8) {
                this.trackOutput = this.fakeTrackOutput;
            }
            InterfaceC1980i0 interfaceC1980i0 = this.trackOutput;
            int i9 = AbstractC1118i0.f4750a;
            interfaceC1980i0.sampleMetadata(j, i, i4, i8, c1978h0);
        }

        @Override // p115n1.InterfaceC1980i0
        public void sampleData(C1132w c1132w, int i) {
            sampleData(c1132w, i, 0);
        }

        @Override // p115n1.InterfaceC1980i0
        public int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7, int i4) {
            InterfaceC1980i0 interfaceC1980i0 = this.trackOutput;
            int i8 = AbstractC1118i0.f4750a;
            return interfaceC1980i0.sampleData(interfaceC0219m, i, z7);
        }

        @Override // p115n1.InterfaceC1980i0
        public void sampleData(C1132w c1132w, int i, int i4) {
            InterfaceC1980i0 interfaceC1980i0 = this.trackOutput;
            int i8 = AbstractC1118i0.f4750a;
            interfaceC1980i0.sampleData(c1132w, i);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Factory implements ChunkExtractor.Factory {
        private boolean parseSubtitlesDuringExtraction;
        private boolean parseWithinGopSampleDependencies;
        private InterfaceC1597o subtitleParserFactory = new C1587e();

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public ChunkExtractor createProgressiveMediaExtractor(int i, C0249w c0249w, boolean z7, List<C0249w> list, InterfaceC1980i0 interfaceC1980i0, PlayerId playerId) {
            InterfaceC1987n c1144i;
            String str = c0249w.f1521m;
            if (!AbstractC0244u0.m685n(str)) {
                if (AbstractC0244u0.m684m(str)) {
                    c1144i = new C0935d(this.parseSubtitlesDuringExtraction ? 1 : 3, this.subtitleParserFactory);
                } else if (Objects.equals(str, "image/jpeg")) {
                    c1144i = new C1487a(1);
                } else if (Objects.equals(str, "image/png")) {
                    c1144i = new C1487a((byte) 0, 0);
                } else {
                    int i4 = z7 ? 4 : 0;
                    if (!this.parseSubtitlesDuringExtraction) {
                        i4 |= 32;
                    }
                    if (this.parseWithinGopSampleDependencies) {
                        i4 |= 64;
                    }
                    c1144i = new C1144i(this.subtitleParserFactory, i4, null, null, list, interfaceC1980i0);
                }
            } else {
                if (!this.parseSubtitlesDuringExtraction) {
                    return null;
                }
                c1144i = new C1594l(this.subtitleParserFactory.mo3259g(c0249w), c0249w);
            }
            return new BundledChunkExtractor(c1144i, i, c0249w);
        }

        public Factory experimentalParseWithinGopSampleDependencies(boolean z7) {
            this.parseWithinGopSampleDependencies = z7;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public C0249w getOutputTextFormat(C0249w c0249w) {
            if (!this.parseSubtitlesDuringExtraction || !this.subtitleParserFactory.supportsFormat(c0249w)) {
                return c0249w;
            }
            C0246v c0246vM692a = c0249w.m692a();
            String str = c0249w.f1519k;
            c0246vM692a.f1447m = AbstractC0244u0.m687p("application/x-media3-cues");
            c0246vM692a.f1431H = this.subtitleParserFactory.mo3257c(c0249w);
            StringBuilder sb = new StringBuilder();
            sb.append(c0249w.f1522n);
            sb.append(str != null ? " ".concat(str) : C2181z.FRAGMENT_ENCODE_SET);
            c0246vM692a.f1444j = sb.toString();
            c0246vM692a.f1452r = Long.MAX_VALUE;
            return new C0249w(c0246vM692a);
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z7) {
            this.parseSubtitlesDuringExtraction = z7;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public Factory setSubtitleParserFactory(InterfaceC1597o interfaceC1597o) {
            interfaceC1597o.getClass();
            this.subtitleParserFactory = interfaceC1597o;
            return this;
        }
    }

    public BundledChunkExtractor(InterfaceC1987n interfaceC1987n, int i, C0249w c0249w) {
        this.extractor = interfaceC1987n;
        this.primaryTrackType = i;
        this.primaryTrackManifestFormat = c0249w;
    }

    @Override // p115n1.InterfaceC1989p
    public void endTracks() {
        C0249w[] c0249wArr = new C0249w[this.bindingTrackOutputs.size()];
        for (int i = 0; i < this.bindingTrackOutputs.size(); i++) {
            C0249w c0249w = this.bindingTrackOutputs.valueAt(i).sampleFormat;
            AbstractC1101a.m2360k(c0249w);
            c0249wArr[i] = c0249w;
        }
        this.sampleFormats = c0249wArr;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public C1981j getChunkIndex() {
        InterfaceC1968c0 interfaceC1968c0 = this.seekMap;
        if (interfaceC1968c0 instanceof C1981j) {
            return (C1981j) interfaceC1968c0;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public C0249w[] getSampleFormats() {
        return this.sampleFormats;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void init(ChunkExtractor.TrackOutputProvider trackOutputProvider, long j, long j8) {
        this.trackOutputProvider = trackOutputProvider;
        this.endTimeUs = j8;
        if (!this.extractorInitialized) {
            this.extractor.init(this);
            if (j != -9223372036854775807L) {
                this.extractor.seek(0L, j);
            }
            this.extractorInitialized = true;
            return;
        }
        InterfaceC1987n interfaceC1987n = this.extractor;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        interfaceC1987n.seek(0L, j);
        for (int i = 0; i < this.bindingTrackOutputs.size(); i++) {
            this.bindingTrackOutputs.valueAt(i).bind(trackOutputProvider, j8);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public boolean read(InterfaceC1988o interfaceC1988o) {
        int i = this.extractor.read(interfaceC1988o, POSITION_HOLDER);
        AbstractC1101a.m2359j(i != 1);
        return i == 0;
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor
    public void release() {
        this.extractor.release();
    }

    @Override // p115n1.InterfaceC1989p
    public void seekMap(InterfaceC1968c0 interfaceC1968c0) {
        this.seekMap = interfaceC1968c0;
    }

    @Override // p115n1.InterfaceC1989p
    public InterfaceC1980i0 track(int i, int i4) {
        BindingTrackOutput bindingTrackOutput = this.bindingTrackOutputs.get(i);
        if (bindingTrackOutput == null) {
            AbstractC1101a.m2359j(this.sampleFormats == null);
            bindingTrackOutput = new BindingTrackOutput(i, i4, i4 == this.primaryTrackType ? this.primaryTrackManifestFormat : null);
            bindingTrackOutput.bind(this.trackOutputProvider, this.endTimeUs);
            this.bindingTrackOutputs.put(i, bindingTrackOutput);
        }
        return bindingTrackOutput;
    }
}
