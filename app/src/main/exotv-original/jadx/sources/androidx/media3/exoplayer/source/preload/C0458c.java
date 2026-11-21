package androidx.media3.exoplayer.source.preload;

import android.content.Context;
import androidx.media3.common.C0243u;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import p063h1.InterfaceC1123n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.preload.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0458c implements InterfaceC1123n, TrackSelector.InvalidationListener, TrackSelector.Factory {
    @Override // p063h1.InterfaceC1123n
    /* renamed from: c */
    public void mo648c(Object obj, C0243u c0243u) {
        BasePreloadManager.lambda$new$0((BasePreloadManager.Listener) obj, c0243u);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.Factory
    public TrackSelector createTrackSelector(Context context) {
        return new DefaultTrackSelector(context);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        DefaultPreloadManager.lambda$new$0();
    }
}
