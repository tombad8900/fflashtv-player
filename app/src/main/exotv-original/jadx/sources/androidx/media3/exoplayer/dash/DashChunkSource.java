package androidx.media3.exoplayer.dash;

import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.dash.PlayerEmsgHandler;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.source.chunk.ChunkSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import java.util.List;
import p089k1.InterfaceC1557c0;
import p090k2.InterfaceC1597o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface DashChunkSource extends ChunkSource {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Factory {
        DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i, int[] iArr, ExoTrackSelection exoTrackSelection, int i4, long j, boolean z7, List<C0249w> list, PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, InterfaceC1557c0 interfaceC1557c0, PlayerId playerId, CmcdConfiguration cmcdConfiguration);

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

    void updateManifest(DashManifest dashManifest, int i);

    void updateTrackSelection(ExoTrackSelection exoTrackSelection);
}
