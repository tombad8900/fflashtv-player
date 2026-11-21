package androidx.media3.exoplayer.hls;

import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface HlsMediaChunkExtractor {
    void init(InterfaceC1989p interfaceC1989p);

    boolean isPackedAudioExtractor();

    boolean isReusable();

    void onTruncatedSegmentParsed();

    boolean read(InterfaceC1988o interfaceC1988o);

    HlsMediaChunkExtractor recreate();
}
