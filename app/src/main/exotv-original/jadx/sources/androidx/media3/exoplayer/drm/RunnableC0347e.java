package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.drm.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0347e implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1725j;

    /* renamed from: k */
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f1726k;

    /* renamed from: l */
    public final /* synthetic */ DrmSessionEventListener f1727l;

    public /* synthetic */ RunnableC0347e(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.f1725j = i;
        this.f1726k = eventDispatcher;
        this.f1727l = drmSessionEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1725j) {
            case 0:
                this.f1726k.lambda$drmKeysRemoved$4(this.f1727l);
                break;
            case 1:
                this.f1726k.lambda$drmKeysRestored$3(this.f1727l);
                break;
            case 2:
                this.f1726k.lambda$drmKeysLoaded$1(this.f1727l);
                break;
            default:
                this.f1726k.lambda$drmSessionReleased$5(this.f1727l);
                break;
        }
    }
}
