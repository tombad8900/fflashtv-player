package androidx.media3.exoplayer.offline;

import androidx.media3.common.C0241t0;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import p056g1.C1030c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.offline.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0407b implements TextOutput, MetadataOutput, TrackSelector.InvalidationListener {
    @Override // androidx.media3.exoplayer.text.TextOutput
    public void onCues(C1030c c1030c) {
        DownloadHelper.lambda$getRendererCapabilities$0(c1030c);
    }

    @Override // androidx.media3.exoplayer.metadata.MetadataOutput
    public void onMetadata(C0241t0 c0241t0) {
        DownloadHelper.lambda$getRendererCapabilities$1(c0241t0);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        DownloadHelper.lambda$new$2();
    }
}
