package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import p043e6.InterfaceC0921i;
import p063h1.InterfaceC1111f;
import p089k1.InterfaceC1563g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0444f implements InterfaceC0921i {

    /* renamed from: j */
    public final /* synthetic */ int f1830j;

    /* renamed from: k */
    public final /* synthetic */ Object f1831k;

    /* renamed from: l */
    public final /* synthetic */ Object f1832l;

    public /* synthetic */ C0444f(Object obj, int i, Object obj2) {
        this.f1830j = i;
        this.f1831k = obj;
        this.f1832l = obj2;
    }

    @Override // p043e6.InterfaceC0921i
    public final Object get() {
        switch (this.f1830j) {
            case 0:
                return ((DefaultMediaSourceFactory.DelegateFactoryLoader) this.f1831k).lambda$loadSupplier$4((InterfaceC1563g) this.f1832l);
            default:
                return ProgressiveMediaSource.Factory.lambda$setDownloadExecutor$1((InterfaceC0921i) this.f1831k, (InterfaceC1111f) this.f1832l);
        }
    }
}
