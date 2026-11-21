package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.util.List;
import p090k2.InterfaceC1597o;
import p115n1.C1981j;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface ChunkExtractor {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Factory {
        ChunkExtractor createProgressiveMediaExtractor(int i, C0249w c0249w, boolean z7, List<C0249w> list, InterfaceC1980i0 interfaceC1980i0, PlayerId playerId);

        default Factory experimentalParseSubtitlesDuringExtraction(boolean z7) {
            return this;
        }

        default C0249w getOutputTextFormat(C0249w c0249w) {
            return c0249w;
        }

        default Factory setSubtitleParserFactory(InterfaceC1597o interfaceC1597o) {
            return this;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface TrackOutputProvider {
        InterfaceC1980i0 track(int i, int i4);
    }

    C1981j getChunkIndex();

    C0249w[] getSampleFormats();

    void init(TrackOutputProvider trackOutputProvider, long j, long j8);

    boolean read(InterfaceC1988o interfaceC1988o);

    void release();
}
