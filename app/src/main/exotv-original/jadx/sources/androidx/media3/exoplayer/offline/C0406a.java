package androidx.media3.exoplayer.offline;

import androidx.media3.common.C0226o0;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.offline.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0406a implements DrmSessionManagerProvider, RequirementsWatcher.Listener {

    /* renamed from: a */
    public final /* synthetic */ Object f1788a;

    public /* synthetic */ C0406a(Object obj) {
        this.f1788a = obj;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
    public DrmSessionManager get(C0226o0 c0226o0) {
        return DownloadHelper.lambda$createMediaSourceInternal$6((DrmSessionManager) this.f1788a, c0226o0);
    }

    @Override // androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
        ((DownloadManager) this.f1788a).onRequirementsStateChanged(requirementsWatcher, i);
    }
}
