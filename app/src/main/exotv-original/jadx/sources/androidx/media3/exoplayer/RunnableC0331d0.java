package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.d0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0331d0 implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1706j;

    /* renamed from: k */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f1707k;

    /* renamed from: l */
    public final /* synthetic */ Pair f1708l;

    /* renamed from: m */
    public final /* synthetic */ LoadEventInfo f1709m;

    /* renamed from: n */
    public final /* synthetic */ MediaLoadData f1710n;

    public /* synthetic */ RunnableC0331d0(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f1706j = i;
        this.f1707k = forwardingEventListener;
        this.f1708l = pair;
        this.f1709m = loadEventInfo;
        this.f1710n = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1706j) {
            case 0:
                this.f1707k.lambda$onLoadCanceled$2(this.f1708l, this.f1709m, this.f1710n);
                break;
            case 1:
                this.f1707k.lambda$onLoadStarted$0(this.f1708l, this.f1709m, this.f1710n);
                break;
            default:
                this.f1707k.lambda$onLoadCompleted$1(this.f1708l, this.f1709m, this.f1710n);
                break;
        }
    }
}
