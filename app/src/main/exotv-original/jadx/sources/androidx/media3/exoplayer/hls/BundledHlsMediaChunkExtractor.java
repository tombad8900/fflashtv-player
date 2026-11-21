package androidx.media3.exoplayer.hls;

import androidx.media3.common.C0249w;
import p057g2.C1041e;
import p063h1.AbstractC1101a;
import p063h1.C1108d0;
import p064h2.C1144i;
import p090k2.InterfaceC1597o;
import p115n1.C1964a0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p168t2.C2398a;
import p168t2.C2402c;
import p168t2.C2404d;
import p168t2.C2407e0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class BundledHlsMediaChunkExtractor implements HlsMediaChunkExtractor {
    private static final C1964a0 POSITION_HOLDER = new C1964a0();
    final InterfaceC1987n extractor;
    private final C0249w multivariantPlaylistFormat;
    private final boolean parseSubtitlesDuringExtraction;
    private final InterfaceC1597o subtitleParserFactory;
    private final C1108d0 timestampAdjuster;

    public BundledHlsMediaChunkExtractor(InterfaceC1987n interfaceC1987n, C0249w c0249w, C1108d0 c1108d0) {
        this(interfaceC1987n, c0249w, c1108d0, InterfaceC1597o.f6077g, false);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void init(InterfaceC1989p interfaceC1989p) {
        this.extractor.init(interfaceC1989p);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isPackedAudioExtractor() {
        InterfaceC1987n underlyingImplementation = this.extractor.getUnderlyingImplementation();
        return (underlyingImplementation instanceof C2404d) || (underlyingImplementation instanceof C2398a) || (underlyingImplementation instanceof C2402c) || (underlyingImplementation instanceof C1041e);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean isReusable() {
        InterfaceC1987n underlyingImplementation = this.extractor.getUnderlyingImplementation();
        return (underlyingImplementation instanceof C2407e0) || (underlyingImplementation instanceof C1144i);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public void onTruncatedSegmentParsed() {
        this.extractor.seek(0L, 0L);
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public boolean read(InterfaceC1988o interfaceC1988o) {
        return this.extractor.read(interfaceC1988o, POSITION_HOLDER) == 0;
    }

    @Override // androidx.media3.exoplayer.hls.HlsMediaChunkExtractor
    public HlsMediaChunkExtractor recreate() {
        InterfaceC1987n c1041e;
        AbstractC1101a.m2359j(!isReusable());
        AbstractC1101a.m2358i("Can't recreate wrapped extractors. Outer type: " + this.extractor.getClass(), this.extractor.getUnderlyingImplementation() == this.extractor);
        InterfaceC1987n interfaceC1987n = this.extractor;
        if (interfaceC1987n instanceof WebvttExtractor) {
            c1041e = new WebvttExtractor(this.multivariantPlaylistFormat.f1512d, this.timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
        } else if (interfaceC1987n instanceof C2404d) {
            c1041e = new C2404d(0);
        } else if (interfaceC1987n instanceof C2398a) {
            c1041e = new C2398a();
        } else if (interfaceC1987n instanceof C2402c) {
            c1041e = new C2402c();
        } else {
            if (!(interfaceC1987n instanceof C1041e)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(this.extractor.getClass().getSimpleName()));
            }
            c1041e = new C1041e(0);
        }
        return new BundledHlsMediaChunkExtractor(c1041e, this.multivariantPlaylistFormat, this.timestampAdjuster, this.subtitleParserFactory, this.parseSubtitlesDuringExtraction);
    }

    public BundledHlsMediaChunkExtractor(InterfaceC1987n interfaceC1987n, C0249w c0249w, C1108d0 c1108d0, InterfaceC1597o interfaceC1597o, boolean z7) {
        this.extractor = interfaceC1987n;
        this.multivariantPlaylistFormat = c0249w;
        this.timestampAdjuster = c1108d0;
        this.subtitleParserFactory = interfaceC1597o;
        this.parseSubtitlesDuringExtraction = z7;
    }
}
