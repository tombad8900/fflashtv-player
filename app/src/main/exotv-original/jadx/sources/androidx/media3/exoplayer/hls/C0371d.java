package androidx.media3.exoplayer.hls;

import android.net.Uri;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.util.List;
import java.util.Map;
import p063h1.C1108d0;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.hls.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0371d implements HlsExtractorFactory {
    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public final HlsMediaChunkExtractor createExtractor(Uri uri, C0249w c0249w, List list, C1108d0 c1108d0, Map map, InterfaceC1988o interfaceC1988o, PlayerId playerId) {
        return MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, c0249w, list, c1108d0, map, interfaceC1988o, playerId);
    }
}
