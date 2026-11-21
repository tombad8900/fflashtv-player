package androidx.media3.exoplayer.hls;

import p089k1.InterfaceC1563g;
import p089k1.InterfaceC1564h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DefaultHlsDataSourceFactory implements HlsDataSourceFactory {
    private final InterfaceC1563g dataSourceFactory;

    public DefaultHlsDataSourceFactory(InterfaceC1563g interfaceC1563g) {
        this.dataSourceFactory = interfaceC1563g;
    }

    @Override // androidx.media3.exoplayer.hls.HlsDataSourceFactory
    public InterfaceC1564h createDataSource(int i) {
        return this.dataSourceFactory.mo55l();
    }
}
