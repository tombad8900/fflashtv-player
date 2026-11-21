package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.b0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0327b0 implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1693j;

    /* renamed from: k */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f1694k;

    /* renamed from: l */
    public final /* synthetic */ Pair f1695l;

    public /* synthetic */ RunnableC0327b0(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, int i) {
        this.f1693j = i;
        this.f1694k = forwardingEventListener;
        this.f1695l = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1693j) {
            case 0:
                this.f1694k.lambda$onDrmKeysLoaded$7(this.f1695l);
                break;
            case 1:
                this.f1694k.lambda$onDrmKeysRemoved$10(this.f1695l);
                break;
            case 2:
                this.f1694k.lambda$onDrmKeysRestored$9(this.f1695l);
                break;
            default:
                this.f1694k.lambda$onDrmSessionReleased$11(this.f1695l);
                break;
        }
    }
}
