package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.drm.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0346d implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1723j;

    /* renamed from: k */
    public final /* synthetic */ Object f1724k;

    public /* synthetic */ RunnableC0346d(int i, Object obj) {
        this.f1723j = i;
        this.f1724k = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1723j) {
            case 0:
                ((DefaultDrmSessionManager.PreacquiredSessionReference) this.f1724k).lambda$release$1();
                break;
            default:
                ((DefaultDrmSession) this.f1724k).release(null);
                break;
        }
    }
}
