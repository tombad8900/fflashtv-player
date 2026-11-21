package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.MediaLoadData;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.a0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0278a0 implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1562j;

    /* renamed from: k */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f1563k;

    /* renamed from: l */
    public final /* synthetic */ Pair f1564l;

    /* renamed from: m */
    public final /* synthetic */ MediaLoadData f1565m;

    public /* synthetic */ RunnableC0278a0(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, MediaLoadData mediaLoadData, int i) {
        this.f1562j = i;
        this.f1563k = forwardingEventListener;
        this.f1564l = pair;
        this.f1565m = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1562j) {
            case 0:
                this.f1563k.lambda$onUpstreamDiscarded$4(this.f1564l, this.f1565m);
                break;
            default:
                this.f1563k.lambda$onDownstreamFormatChanged$5(this.f1564l, this.f1565m);
                break;
        }
    }
}
