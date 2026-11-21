package androidx.media3.exoplayer.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.C0234r;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p063h1.AbstractC1101a;
import p085j6.C1530t;
import p089k1.InterfaceC1563g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class OfflineLicenseHelper {
    private static final C0249w FORMAT_WITH_EMPTY_DRM_INIT_DATA;
    private final ConditionVariable drmListenerConditionVariable;
    private final DefaultDrmSessionManager drmSessionManager;
    private final DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final Handler handler;
    private final HandlerThread handlerThread;

    static {
        C0246v c0246v = new C0246v();
        c0246v.f1451q = new C0237s(new C0234r[0]);
        FORMAT_WITH_EMPTY_DRM_INIT_DATA = new C0249w(c0246v);
    }

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = defaultDrmSessionManager;
        this.eventDispatcher = eventDispatcher;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
        this.drmListenerConditionVariable = new ConditionVariable();
        eventDispatcher.addEventListener(new Handler(handlerThread.getLooper()), new DrmSessionEventListener() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper.1
            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }
        });
    }

    private DrmSession acquireFirstSessionOnHandlerThread(final int i, final byte[] bArr, final C0249w c0249w) throws DrmSession.DrmSessionException {
        c0249w.f1526r.getClass();
        final C1530t c1530t = new C1530t();
        this.drmListenerConditionVariable.close();
        this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.drm.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f1742j.lambda$acquireFirstSessionOnHandlerThread$2(i, bArr, c1530t, c0249w);
            }
        });
        try {
            DrmSession drmSession = (DrmSession) c1530t.get();
            this.drmListenerConditionVariable.block();
            C1530t c1530t2 = new C1530t();
            this.handler.post(new RunnableC0352j(drmSession, this, c1530t2));
            try {
                if (c1530t2.get() == null) {
                    return drmSession;
                }
                throw ((DrmSession.DrmSessionException) c1530t2.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } catch (InterruptedException | ExecutionException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int i, byte[] bArr, C0249w c0249w) throws DrmSession.DrmSessionException {
        DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(i, bArr, c0249w);
        C1530t c1530t = new C1530t();
        this.handler.post(new RunnableC0352j(this, c1530t, drmSessionAcquireFirstSessionOnHandlerThread, 2));
        try {
            try {
                byte[] bArr2 = (byte[]) c1530t.get();
                bArr2.getClass();
                return bArr2;
            } finally {
                releaseManagerOnHandlerThread();
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$acquireFirstSessionOnHandlerThread$2(int i, byte[] bArr, C1530t c1530t, C0249w c0249w) {
        try {
            DefaultDrmSessionManager defaultDrmSessionManager = this.drmSessionManager;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            defaultDrmSessionManager.setPlayer(looperMyLooper, PlayerId.UNSET);
            this.drmSessionManager.prepare();
            try {
                this.drmSessionManager.setMode(i, bArr);
                DrmSession drmSessionAcquireSession = this.drmSessionManager.acquireSession(this.eventDispatcher, c0249w);
                drmSessionAcquireSession.getClass();
                c1530t.m3212j(drmSessionAcquireSession);
            } finally {
            }
        } catch (Throwable th) {
            c1530t.m3213k(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireFirstSessionOnHandlerThread$3(DrmSession drmSession, C1530t c1530t) {
        try {
            DrmSession.DrmSessionException error = drmSession.getError();
            if (drmSession.getState() == 1) {
                drmSession.release(this.eventDispatcher);
                this.drmSessionManager.release();
            }
            c1530t.m3212j(error);
        } catch (Throwable th) {
            c1530t.m3213k(th);
            drmSession.release(this.eventDispatcher);
            this.drmSessionManager.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1 */
    public /* synthetic */ void m897xfae744aa(C1530t c1530t, DrmSession drmSession) {
        try {
            c1530t.m3212j(drmSession.getOfflineLicenseKeySetId());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getLicenseDurationRemainingSec$0(C1530t c1530t, DrmSession drmSession) {
        try {
            Pair<Long, Long> licenseDurationRemainingSec = WidevineUtil.getLicenseDurationRemainingSec(drmSession);
            licenseDurationRemainingSec.getClass();
            c1530t.m3212j(licenseDurationRemainingSec);
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseManagerOnHandlerThread$4(C1530t c1530t) {
        try {
            this.drmSessionManager.release();
            c1530t.m3212j(null);
        } catch (Throwable th) {
            c1530t.m3213k(th);
        }
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, InterfaceC1563g interfaceC1563g, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, false, interfaceC1563g, eventDispatcher);
    }

    private void releaseManagerOnHandlerThread() {
        C1530t c1530t = new C1530t();
        this.handler.post(new RunnableC0345c(this, 1, c1530t));
        try {
            c1530t.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public synchronized byte[] downloadLicense(C0249w c0249w) {
        AbstractC1101a.m2353d(c0249w.f1526r != null);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, null, c0249w);
    }

    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] bArr) {
        C1530t c1530t;
        bArr.getClass();
        try {
            DrmSession drmSessionAcquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(1, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
            c1530t = new C1530t();
            this.handler.post(new RunnableC0352j(this, c1530t, drmSessionAcquireFirstSessionOnHandlerThread, 0));
            try {
                try {
                } finally {
                    releaseManagerOnHandlerThread();
                }
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } catch (DrmSession.DrmSessionException e8) {
            if (e8.getCause() instanceof KeysExpiredException) {
                return Pair.create(0L, 0L);
            }
            throw e8;
        }
        return (Pair) c1530t.get();
    }

    public void release() {
        this.handlerThread.quit();
    }

    public synchronized void releaseLicense(byte[] bArr) {
        bArr.getClass();
        acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(3, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public synchronized byte[] renewLicense(byte[] bArr) {
        bArr.getClass();
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z7, InterfaceC1563g interfaceC1563g, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z7, interfaceC1563g, null, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z7, InterfaceC1563g interfaceC1563g, Map<String, String> map, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new OfflineLicenseHelper(new DefaultDrmSessionManager.Builder().setKeyRequestParameters(map).build(new HttpMediaDrmCallback(str, z7, interfaceC1563g)), eventDispatcher);
    }
}
