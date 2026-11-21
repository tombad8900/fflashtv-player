package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.source.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0438b implements Handler.Callback {

    /* renamed from: j */
    public final /* synthetic */ int f1821j;

    /* renamed from: k */
    public final /* synthetic */ CompositeMediaSource f1822k;

    public /* synthetic */ C0438b(CompositeMediaSource compositeMediaSource, int i) {
        this.f1821j = i;
        this.f1822k = compositeMediaSource;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f1821j) {
            case 0:
                return ((ConcatenatingMediaSource) this.f1822k).handleMessage(message);
            default:
                return ((ConcatenatingMediaSource2) this.f1822k).handleMessage(message);
        }
    }
}
