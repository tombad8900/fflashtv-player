package androidx.media3.exoplayer.smoothstreaming;

import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifest;
import androidx.media3.exoplayer.source.chunk.ChunkSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import p089k1.InterfaceC1557c0;
import p090k2.InterfaceC1597o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface SsChunkSource extends ChunkSource {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Factory {
        SsChunkSource createChunkSource(LoaderErrorThrower loaderErrorThrower, SsManifest ssManifest, int i, ExoTrackSelection exoTrackSelection, InterfaceC1557c0 interfaceC1557c0, CmcdConfiguration cmcdConfiguration);

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

    void updateManifest(SsManifest ssManifest);

    void updateTrackSelection(ExoTrackSelection exoTrackSelection);
}
