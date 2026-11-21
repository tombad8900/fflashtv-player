package androidx.media3.exoplayer.drm;

import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import p085j6.C1530t;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.drm.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0345c implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1720j;

    /* renamed from: k */
    public final /* synthetic */ Object f1721k;

    /* renamed from: l */
    public final /* synthetic */ Object f1722l;

    public /* synthetic */ RunnableC0345c(Object obj, int i, Object obj2) {
        this.f1720j = i;
        this.f1721k = obj;
        this.f1722l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1720j) {
            case 0:
                ((DefaultDrmSessionManager.PreacquiredSessionReference) this.f1721k).lambda$acquire$0((C0249w) this.f1722l);
                break;
            default:
                ((OfflineLicenseHelper) this.f1721k).lambda$releaseManagerOnHandlerThread$4((C1530t) this.f1722l);
                break;
        }
    }
}
