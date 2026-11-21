package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.util.List;
import java.util.Map;
import p063h1.C1108d0;
import p090k2.InterfaceC1597o;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface HlsExtractorFactory {

    @Deprecated
    public static final HlsExtractorFactory DEFAULT = new DefaultHlsExtractorFactory();

    HlsMediaChunkExtractor createExtractor(Uri uri, C0249w c0249w, List<C0249w> list, C1108d0 c1108d0, Map<String, List<String>> map, InterfaceC1988o interfaceC1988o, PlayerId playerId);

    default HlsExtractorFactory experimentalParseSubtitlesDuringExtraction(boolean z7) {
        return this;
    }

    default C0249w getOutputTextFormat(C0249w c0249w) {
        return c0249w;
    }

    default HlsExtractorFactory setSubtitleParserFactory(InterfaceC1597o interfaceC1597o) {
        return this;
    }
}
