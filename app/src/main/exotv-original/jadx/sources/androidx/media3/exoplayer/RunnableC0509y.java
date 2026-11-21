package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.MediaSource;
import p052f6.C0974j0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.y */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0509y implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1918j;

    /* renamed from: k */
    public final /* synthetic */ Object f1919k;

    /* renamed from: l */
    public final /* synthetic */ Object f1920l;

    /* renamed from: m */
    public final /* synthetic */ Object f1921m;

    public /* synthetic */ RunnableC0509y(Object obj, Object obj2, Object obj3, int i) {
        this.f1918j = i;
        this.f1919k = obj;
        this.f1920l = obj2;
        this.f1921m = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1918j) {
            case 0:
                ((MediaPeriodQueue) this.f1919k).lambda$notifyQueueUpdate$0((C0974j0) this.f1920l, (MediaSource.MediaPeriodId) this.f1921m);
                break;
            default:
                ((MediaSourceList.ForwardingEventListener) this.f1919k).lambda$onDrmSessionManagerError$8((Pair) this.f1920l, (Exception) this.f1921m);
                break;
        }
    }
}
