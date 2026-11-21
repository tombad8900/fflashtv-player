package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import p043e6.InterfaceC0921i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.preload.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0459d implements InterfaceC0921i {

    /* renamed from: j */
    public final /* synthetic */ int f1854j;

    /* renamed from: k */
    public final /* synthetic */ Object f1855k;

    public /* synthetic */ C0459d(int i, Object obj) {
        this.f1854j = i;
        this.f1855k = obj;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        switch (this.f1854j) {
            case 0:
                return DefaultPreloadManager.Builder.lambda$setLoadControl$5((LoadControl) this.f1855k);
            case 1:
                return DefaultPreloadManager.Builder.lambda$setRenderersFactory$4((RenderersFactory) this.f1855k);
            case 2:
                return DefaultPreloadManager.Builder.lambda$setBandwidthMeter$6((BandwidthMeter) this.f1855k);
            default:
                return DefaultPreloadManager.Builder.lambda$setMediaSourceFactory$3((MediaSource.Factory) this.f1855k);
        }
    }
}
