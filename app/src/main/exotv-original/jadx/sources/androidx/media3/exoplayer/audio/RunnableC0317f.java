package androidx.media3.exoplayer.audio;

import android.view.SurfaceView;
import androidx.lifecycle.RunnableC0127c0;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.PreloadException;
import java.util.concurrent.ThreadPoolExecutor;
import p023c4.C0641e;
import p168t2.AbstractC2415i0;
import p168t2.AbstractC2429w;
import p183v0.C2512l;
import p183v0.C2517q;
import p183v0.C2518r;
import p183v0.InterfaceC2509i;
import p193w2.C2638z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.audio.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0317f implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1668j;

    /* renamed from: k */
    public final /* synthetic */ Object f1669k;

    /* renamed from: l */
    public final /* synthetic */ Object f1670l;

    /* renamed from: m */
    public final /* synthetic */ Object f1671m;

    public /* synthetic */ RunnableC0317f(Object obj, Object obj2, Object obj3, int i) {
        this.f1668j = i;
        this.f1669k = obj;
        this.f1670l = obj2;
        this.f1671m = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1668j) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.f1669k).lambda$inputFormatChanged$2((C0249w) this.f1670l, (DecoderReuseEvaluation) this.f1671m);
                return;
            case 1:
                ((DrmSessionEventListener.EventDispatcher) this.f1669k).lambda$drmSessionManagerError$2((DrmSessionEventListener) this.f1670l, (Exception) this.f1671m);
                return;
            case 2:
                ((BasePreloadManager) this.f1669k).lambda$onPreloadError$4((PreloadException) this.f1670l, (MediaSource) this.f1671m);
                return;
            case 3:
                C0641e c0641e = (C0641e) this.f1669k;
                AbstractC2415i0 abstractC2415i0 = (AbstractC2415i0) this.f1670l;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1671m;
                try {
                    C2518r c2518rM4298c = AbstractC2429w.m4298c(c0641e.f2534k);
                    if (c2518rM4298c == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C2517q c2517q = (C2517q) ((InterfaceC2509i) c2518rM4298c.f9139b);
                    synchronized (c2517q.f9164m) {
                        c2517q.f9166o = threadPoolExecutor;
                    }
                    ((InterfaceC2509i) c2518rM4298c.f9139b).mo1424a(new C2512l(abstractC2415i0, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC2415i0.mo4287u(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                C2638z.m4732a((C2638z) this.f1669k, (SurfaceView) this.f1670l, (RunnableC0127c0) this.f1671m);
                return;
        }
    }
}
