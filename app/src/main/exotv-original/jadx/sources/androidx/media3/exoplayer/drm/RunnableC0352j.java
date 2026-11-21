package androidx.media3.exoplayer.drm;

import p085j6.C1530t;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.drm.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0352j implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1738j;

    /* renamed from: k */
    public final /* synthetic */ OfflineLicenseHelper f1739k;

    /* renamed from: l */
    public final /* synthetic */ DrmSession f1740l;

    /* renamed from: m */
    public final /* synthetic */ C1530t f1741m;

    public /* synthetic */ RunnableC0352j(DrmSession drmSession, OfflineLicenseHelper offlineLicenseHelper, C1530t c1530t) {
        this.f1738j = 1;
        this.f1739k = offlineLicenseHelper;
        this.f1740l = drmSession;
        this.f1741m = c1530t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1738j) {
            case 0:
                this.f1739k.lambda$getLicenseDurationRemainingSec$0(this.f1741m, this.f1740l);
                break;
            case 1:
                this.f1739k.lambda$acquireFirstSessionOnHandlerThread$3(this.f1740l, this.f1741m);
                break;
            default:
                this.f1739k.m897xfae744aa(this.f1741m, this.f1740l);
                break;
        }
    }

    public /* synthetic */ RunnableC0352j(OfflineLicenseHelper offlineLicenseHelper, C1530t c1530t, DrmSession drmSession, int i) {
        this.f1738j = i;
        this.f1739k = offlineLicenseHelper;
        this.f1741m = c1530t;
        this.f1740l = drmSession;
    }
}
