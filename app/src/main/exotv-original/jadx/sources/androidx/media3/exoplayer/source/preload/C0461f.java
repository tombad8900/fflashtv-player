package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.preload.DefaultPreloadManager;
import p043e6.InterfaceC0918f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.preload.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0461f implements InterfaceC0918f {

    /* renamed from: j */
    public final /* synthetic */ int f1858j;

    public /* synthetic */ C0461f(int i) {
        this.f1858j = i;
    }

    @Override // p043e6.InterfaceC0918f
    public final boolean apply(Object obj) {
        DefaultPreloadManager.Status status = (DefaultPreloadManager.Status) obj;
        switch (this.f1858j) {
            case 0:
                return DefaultPreloadManager.SourcePreloadControl.lambda$onTracksSelected$1(status);
            default:
                return DefaultPreloadManager.SourcePreloadControl.lambda$onSourcePrepared$0(status);
        }
    }
}
