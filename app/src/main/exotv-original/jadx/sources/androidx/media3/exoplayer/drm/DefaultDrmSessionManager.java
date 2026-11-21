package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.AbstractC0213k;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0234r;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0253x0;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1013w0;
import p052f6.AbstractC1023z1;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class DefaultDrmSessionManager implements DrmSessionManager {
    public static final long DEFAULT_SESSION_KEEPALIVE_MS = 300000;
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    private static final String TAG = "DefaultDrmSessionMgr";
    private final MediaDrmCallback callback;
    private ExoMediaDrm exoMediaDrm;
    private final ExoMediaDrm.Provider exoMediaDrmProvider;
    private final Set<DefaultDrmSession> keepaliveSessions;
    private final HashMap<String, String> keyRequestParameters;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    volatile MediaDrmHandler mediaDrmHandler;
    private int mode;
    private final boolean multiSession;
    private DefaultDrmSession noMultiSessionDrmSession;
    private byte[] offlineLicenseKeySetId;
    private DefaultDrmSession placeholderDrmSession;
    private final boolean playClearSamplesWithoutKeys;
    private Handler playbackHandler;
    private Looper playbackLooper;
    private PlayerId playerId;
    private final Set<PreacquiredSessionReference> preacquiredSessionReferences;
    private int prepareCallsCount;
    private final ProvisioningManagerImpl provisioningManagerImpl;
    private final ReferenceCountListenerImpl referenceCountListener;
    private final long sessionKeepaliveMs;
    private final List<DefaultDrmSession> sessions;
    private final int[] useDrmSessionsForClearContentTrackTypes;
    private final UUID uuid;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Builder {
        private boolean multiSession;
        private final HashMap<String, String> keyRequestParameters = new HashMap<>();
        private UUID uuid = AbstractC0213k.f1165d;
        private ExoMediaDrm.Provider exoMediaDrmProvider = FrameworkMediaDrm.DEFAULT_PROVIDER;
        private int[] useDrmSessionsForClearContentTrackTypes = new int[0];
        private boolean playClearSamplesWithoutKeys = true;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
        private long sessionKeepaliveMs = 300000;

        public DefaultDrmSessionManager build(MediaDrmCallback mediaDrmCallback) {
            return new DefaultDrmSessionManager(this.uuid, this.exoMediaDrmProvider, mediaDrmCallback, this.keyRequestParameters, this.multiSession, this.useDrmSessionsForClearContentTrackTypes, this.playClearSamplesWithoutKeys, this.loadErrorHandlingPolicy, this.sessionKeepaliveMs);
        }

        public Builder setKeyRequestParameters(Map<String, String> map) {
            this.keyRequestParameters.clear();
            if (map != null) {
                this.keyRequestParameters.putAll(map);
            }
            return this;
        }

        public Builder setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            loadErrorHandlingPolicy.getClass();
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public Builder setMultiSession(boolean z7) {
            this.multiSession = z7;
            return this;
        }

        public Builder setPlayClearSamplesWithoutKeys(boolean z7) {
            this.playClearSamplesWithoutKeys = z7;
            return this;
        }

        public Builder setSessionKeepaliveMs(long j) {
            AbstractC1101a.m2353d(j > 0 || j == -9223372036854775807L);
            this.sessionKeepaliveMs = j;
            return this;
        }

        public Builder setUseDrmSessionsForClearContent(int... iArr) {
            for (int i : iArr) {
                boolean z7 = true;
                if (i != 2 && i != 1) {
                    z7 = false;
                }
                AbstractC1101a.m2353d(z7);
            }
            this.useDrmSessionsForClearContentTrackTypes = (int[]) iArr.clone();
            return this;
        }

        public Builder setUuidAndExoMediaDrmProvider(UUID uuid, ExoMediaDrm.Provider provider) {
            uuid.getClass();
            this.uuid = uuid;
            provider.getClass();
            this.exoMediaDrmProvider = provider;
            return this;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public class MediaDrmEventListener implements ExoMediaDrm.OnEventListener {
        private MediaDrmEventListener() {
        }

        @Override // androidx.media3.exoplayer.drm.ExoMediaDrm.OnEventListener
        public void onEvent(ExoMediaDrm exoMediaDrm, byte[] bArr, int i, int i4, byte[] bArr2) {
            MediaDrmHandler mediaDrmHandler = DefaultDrmSessionManager.this.mediaDrmHandler;
            mediaDrmHandler.getClass();
            mediaDrmHandler.obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @SuppressLint({"HandlerLeak"})
    public class MediaDrmHandler extends Handler {
        public MediaDrmHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.sessions) {
                if (defaultDrmSession.hasSessionId(bArr)) {
                    defaultDrmSession.onMediaDrmEvent(message.what);
                    return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public class PreacquiredSessionReference implements DrmSessionManager.DrmSessionReference {
        private final DrmSessionEventListener.EventDispatcher eventDispatcher;
        private boolean isReleased;
        private DrmSession session;

        public PreacquiredSessionReference(DrmSessionEventListener.EventDispatcher eventDispatcher) {
            this.eventDispatcher = eventDispatcher;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$acquire$0(C0249w c0249w) {
            if (DefaultDrmSessionManager.this.prepareCallsCount == 0 || this.isReleased) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            Looper looper = defaultDrmSessionManager.playbackLooper;
            looper.getClass();
            this.session = defaultDrmSessionManager.acquireSession(looper, this.eventDispatcher, c0249w, false);
            DefaultDrmSessionManager.this.preacquiredSessionReferences.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$release$1() {
            if (this.isReleased) {
                return;
            }
            DrmSession drmSession = this.session;
            if (drmSession != null) {
                drmSession.release(this.eventDispatcher);
            }
            DefaultDrmSessionManager.this.preacquiredSessionReferences.remove(this);
            this.isReleased = true;
        }

        public void acquire(C0249w c0249w) {
            Handler handler = DefaultDrmSessionManager.this.playbackHandler;
            handler.getClass();
            handler.post(new RunnableC0345c(this, 0, c0249w));
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
        public void release() {
            Handler handler = DefaultDrmSessionManager.this.playbackHandler;
            handler.getClass();
            AbstractC1118i0.m2432W(handler, new RunnableC0346d(0, this));
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public class ProvisioningManagerImpl implements DefaultDrmSession.ProvisioningManager {
        private DefaultDrmSession provisioningSession;
        private final Set<DefaultDrmSession> sessionsAwaitingProvisioning = new HashSet();

        public ProvisioningManagerImpl() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionCompleted() {
            this.provisioningSession = null;
            AbstractC0983m0 abstractC0983m0M2165j = AbstractC0983m0.m2165j(this.sessionsAwaitingProvisioning);
            this.sessionsAwaitingProvisioning.clear();
            C0977k0 c0977k0ListIterator = abstractC0983m0M2165j.listIterator(0);
            while (c0977k0ListIterator.hasNext()) {
                ((DefaultDrmSession) c0977k0ListIterator.next()).onProvisionCompleted();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionError(Exception exc, boolean z7) {
            this.provisioningSession = null;
            AbstractC0983m0 abstractC0983m0M2165j = AbstractC0983m0.m2165j(this.sessionsAwaitingProvisioning);
            this.sessionsAwaitingProvisioning.clear();
            C0977k0 c0977k0ListIterator = abstractC0983m0M2165j.listIterator(0);
            while (c0977k0ListIterator.hasNext()) {
                ((DefaultDrmSession) c0977k0ListIterator.next()).onProvisionError(exc, z7);
            }
        }

        public void onSessionFullyReleased(DefaultDrmSession defaultDrmSession) {
            this.sessionsAwaitingProvisioning.remove(defaultDrmSession);
            if (this.provisioningSession == defaultDrmSession) {
                this.provisioningSession = null;
                if (this.sessionsAwaitingProvisioning.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.sessionsAwaitingProvisioning.iterator().next();
                this.provisioningSession = next;
                next.provision();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ProvisioningManager
        public void provisionRequired(DefaultDrmSession defaultDrmSession) {
            this.sessionsAwaitingProvisioning.add(defaultDrmSession);
            if (this.provisioningSession != null) {
                return;
            }
            this.provisioningSession = defaultDrmSession;
            defaultDrmSession.provision();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public class ReferenceCountListenerImpl implements DefaultDrmSession.ReferenceCountListener {
        private ReferenceCountListenerImpl() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountDecremented(DefaultDrmSession defaultDrmSession, int i) {
            if (i == 1 && DefaultDrmSessionManager.this.prepareCallsCount > 0 && DefaultDrmSessionManager.this.sessionKeepaliveMs != -9223372036854775807L) {
                DefaultDrmSessionManager.this.keepaliveSessions.add(defaultDrmSession);
                Handler handler = DefaultDrmSessionManager.this.playbackHandler;
                handler.getClass();
                handler.postAtTime(new RunnableC0346d(1, defaultDrmSession), defaultDrmSession, DefaultDrmSessionManager.this.sessionKeepaliveMs + SystemClock.uptimeMillis());
            } else if (i == 0) {
                DefaultDrmSessionManager.this.sessions.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.placeholderDrmSession == defaultDrmSession) {
                    DefaultDrmSessionManager.this.placeholderDrmSession = null;
                }
                if (DefaultDrmSessionManager.this.noMultiSessionDrmSession == defaultDrmSession) {
                    DefaultDrmSessionManager.this.noMultiSessionDrmSession = null;
                }
                DefaultDrmSessionManager.this.provisioningManagerImpl.onSessionFullyReleased(defaultDrmSession);
                if (DefaultDrmSessionManager.this.sessionKeepaliveMs != -9223372036854775807L) {
                    Handler handler2 = DefaultDrmSessionManager.this.playbackHandler;
                    handler2.getClass();
                    handler2.removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.keepaliveSessions.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.maybeReleaseMediaDrm();
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountIncremented(DefaultDrmSession defaultDrmSession, int i) {
            if (DefaultDrmSessionManager.this.sessionKeepaliveMs != -9223372036854775807L) {
                DefaultDrmSessionManager.this.keepaliveSessions.remove(defaultDrmSession);
                Handler handler = DefaultDrmSessionManager.this.playbackHandler;
                handler.getClass();
                handler.removeCallbacksAndMessages(defaultDrmSession);
            }
        }
    }

    private static boolean acquisitionFailedIndicatingResourceShortage(DrmSession drmSession) {
        if (drmSession.getState() != 1) {
            return false;
        }
        DrmSession.DrmSessionException error = drmSession.getError();
        error.getClass();
        Throwable cause = error.getCause();
        return (cause instanceof ResourceBusyException) || DrmUtil.isFailureToConstructResourceBusyException(cause);
    }

    private boolean canAcquireSession(C0237s c0237s) {
        if (this.offlineLicenseKeySetId != null) {
            return true;
        }
        if (getSchemeDatas(c0237s, this.uuid, true).isEmpty()) {
            if (c0237s.f1408m != 1 || !c0237s.f1405j[0].m665a(AbstractC0213k.f1163b)) {
                return false;
            }
            AbstractC1101a.m2348F(TAG, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.uuid);
        }
        String str = c0237s.f1407l;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? AbstractC1118i0.f4750a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private DefaultDrmSession createAndAcquireSession(List<C0234r> list, boolean z7, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.exoMediaDrm.getClass();
        boolean z8 = this.playClearSamplesWithoutKeys | z7;
        UUID uuid = this.uuid;
        ExoMediaDrm exoMediaDrm = this.exoMediaDrm;
        ProvisioningManagerImpl provisioningManagerImpl = this.provisioningManagerImpl;
        ReferenceCountListenerImpl referenceCountListenerImpl = this.referenceCountListener;
        int i = this.mode;
        byte[] bArr = this.offlineLicenseKeySetId;
        HashMap<String, String> map = this.keyRequestParameters;
        MediaDrmCallback mediaDrmCallback = this.callback;
        Looper looper = this.playbackLooper;
        looper.getClass();
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
        PlayerId playerId = this.playerId;
        playerId.getClass();
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(uuid, exoMediaDrm, provisioningManagerImpl, referenceCountListenerImpl, list, i, z8, z7, bArr, map, mediaDrmCallback, looper, loadErrorHandlingPolicy, playerId);
        defaultDrmSession.acquire(eventDispatcher);
        if (this.sessionKeepaliveMs != -9223372036854775807L) {
            defaultDrmSession.acquire(null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession createAndAcquireSessionWithRetry(List<C0234r> list, boolean z7, DrmSessionEventListener.EventDispatcher eventDispatcher, boolean z8) {
        DefaultDrmSession defaultDrmSessionCreateAndAcquireSession = createAndAcquireSession(list, z7, eventDispatcher);
        if (acquisitionFailedIndicatingResourceShortage(defaultDrmSessionCreateAndAcquireSession) && !this.keepaliveSessions.isEmpty()) {
            releaseAllKeepaliveSessions();
            undoAcquisition(defaultDrmSessionCreateAndAcquireSession, eventDispatcher);
            defaultDrmSessionCreateAndAcquireSession = createAndAcquireSession(list, z7, eventDispatcher);
        }
        if (!acquisitionFailedIndicatingResourceShortage(defaultDrmSessionCreateAndAcquireSession) || !z8 || this.preacquiredSessionReferences.isEmpty()) {
            return defaultDrmSessionCreateAndAcquireSession;
        }
        releaseAllPreacquiredSessions();
        if (!this.keepaliveSessions.isEmpty()) {
            releaseAllKeepaliveSessions();
        }
        undoAcquisition(defaultDrmSessionCreateAndAcquireSession, eventDispatcher);
        return createAndAcquireSession(list, z7, eventDispatcher);
    }

    private static List<C0234r> getSchemeDatas(C0237s c0237s, UUID uuid, boolean z7) {
        ArrayList arrayList = new ArrayList(c0237s.f1408m);
        for (int i = 0; i < c0237s.f1408m; i++) {
            C0234r c0234r = c0237s.f1405j[i];
            if ((c0234r.m665a(uuid) || (AbstractC0213k.f1164c.equals(uuid) && c0234r.m665a(AbstractC0213k.f1163b))) && (c0234r.f1328n != null || z7)) {
                arrayList.add(c0234r);
            }
        }
        return arrayList;
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void initPlaybackLooper(Looper looper) {
        try {
            Looper looper2 = this.playbackLooper;
            if (looper2 == null) {
                this.playbackLooper = looper;
                this.playbackHandler = new Handler(looper);
            } else {
                AbstractC1101a.m2359j(looper2 == looper);
                this.playbackHandler.getClass();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private DrmSession maybeAcquirePlaceholderSession(int i, boolean z7) {
        ExoMediaDrm exoMediaDrm = this.exoMediaDrm;
        exoMediaDrm.getClass();
        if (exoMediaDrm.getCryptoType() != 2 || !FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC) {
            int[] iArr = this.useDrmSessionsForClearContentTrackTypes;
            int i4 = AbstractC1118i0.f4750a;
            int i8 = 0;
            while (true) {
                if (i8 >= iArr.length) {
                    i8 = -1;
                    break;
                }
                if (iArr[i8] == i) {
                    break;
                }
                i8++;
            }
            if (i8 != -1 && exoMediaDrm.getCryptoType() != 1) {
                DefaultDrmSession defaultDrmSession = this.placeholderDrmSession;
                if (defaultDrmSession == null) {
                    C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                    DefaultDrmSession defaultDrmSessionCreateAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(C0981l1.f4211n, true, null, z7);
                    this.sessions.add(defaultDrmSessionCreateAndAcquireSessionWithRetry);
                    this.placeholderDrmSession = defaultDrmSessionCreateAndAcquireSessionWithRetry;
                } else {
                    defaultDrmSession.acquire(null);
                }
                return this.placeholderDrmSession;
            }
        }
        return null;
    }

    private void maybeCreateMediaDrmHandler(Looper looper) {
        if (this.mediaDrmHandler == null) {
            this.mediaDrmHandler = new MediaDrmHandler(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReleaseMediaDrm() {
        if (this.exoMediaDrm != null && this.prepareCallsCount == 0 && this.sessions.isEmpty() && this.preacquiredSessionReferences.isEmpty()) {
            ExoMediaDrm exoMediaDrm = this.exoMediaDrm;
            exoMediaDrm.getClass();
            exoMediaDrm.release();
            this.exoMediaDrm = null;
        }
    }

    private void releaseAllKeepaliveSessions() {
        AbstractC1023z1 it = AbstractC1013w0.m2210j(this.keepaliveSessions).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).release(null);
        }
    }

    private void releaseAllPreacquiredSessions() {
        AbstractC1023z1 it = AbstractC1013w0.m2210j(this.preacquiredSessionReferences).iterator();
        while (it.hasNext()) {
            ((PreacquiredSessionReference) it.next()).release();
        }
    }

    private void undoAcquisition(DrmSession drmSession, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSession.release(eventDispatcher);
        if (this.sessionKeepaliveMs != -9223372036854775807L) {
            drmSession.release(null);
        }
    }

    private void verifyPlaybackThread(boolean z7) {
        if (z7 && this.playbackLooper == null) {
            AbstractC1101a.m2349G(TAG, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.playbackLooper;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            AbstractC1101a.m2349G(TAG, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.playbackLooper.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public DrmSession acquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, C0249w c0249w) {
        verifyPlaybackThread(false);
        AbstractC1101a.m2359j(this.prepareCallsCount > 0);
        AbstractC1101a.m2360k(this.playbackLooper);
        return acquireSession(this.playbackLooper, eventDispatcher, c0249w, true);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public int getCryptoType(C0249w c0249w) {
        verifyPlaybackThread(false);
        ExoMediaDrm exoMediaDrm = this.exoMediaDrm;
        exoMediaDrm.getClass();
        int cryptoType = exoMediaDrm.getCryptoType();
        C0237s c0237s = c0249w.f1526r;
        if (c0237s == null) {
            int iM680i = AbstractC0244u0.m680i(c0249w.f1522n);
            int[] iArr = this.useDrmSessionsForClearContentTrackTypes;
            int i = 0;
            while (true) {
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iM680i) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (!canAcquireSession(c0237s)) {
            return 1;
        }
        return cryptoType;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public DrmSessionManager.DrmSessionReference preacquireSession(DrmSessionEventListener.EventDispatcher eventDispatcher, C0249w c0249w) {
        AbstractC1101a.m2359j(this.prepareCallsCount > 0);
        AbstractC1101a.m2360k(this.playbackLooper);
        PreacquiredSessionReference preacquiredSessionReference = new PreacquiredSessionReference(eventDispatcher);
        preacquiredSessionReference.acquire(c0249w);
        return preacquiredSessionReference;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void prepare() {
        verifyPlaybackThread(true);
        int i = this.prepareCallsCount;
        this.prepareCallsCount = i + 1;
        if (i != 0) {
            return;
        }
        if (this.exoMediaDrm == null) {
            ExoMediaDrm exoMediaDrmAcquireExoMediaDrm = this.exoMediaDrmProvider.acquireExoMediaDrm(this.uuid);
            this.exoMediaDrm = exoMediaDrmAcquireExoMediaDrm;
            exoMediaDrmAcquireExoMediaDrm.setOnEventListener(new MediaDrmEventListener());
        } else if (this.sessionKeepaliveMs != -9223372036854775807L) {
            for (int i4 = 0; i4 < this.sessions.size(); i4++) {
                this.sessions.get(i4).acquire(null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public final void release() {
        verifyPlaybackThread(true);
        int i = this.prepareCallsCount - 1;
        this.prepareCallsCount = i;
        if (i != 0) {
            return;
        }
        if (this.sessionKeepaliveMs != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.sessions);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((DefaultDrmSession) arrayList.get(i4)).release(null);
            }
        }
        releaseAllPreacquiredSessions();
        maybeReleaseMediaDrm();
    }

    public void setMode(int i, byte[] bArr) {
        AbstractC1101a.m2359j(this.sessions.isEmpty());
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.mode = i;
        this.offlineLicenseKeySetId = bArr;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager
    public void setPlayer(Looper looper, PlayerId playerId) {
        initPlaybackLooper(looper);
        this.playerId = playerId;
    }

    private DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.Provider provider, MediaDrmCallback mediaDrmCallback, HashMap<String, String> map, boolean z7, int[] iArr, boolean z8, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j) {
        uuid.getClass();
        AbstractC1101a.m2352c("Use C.CLEARKEY_UUID instead", !AbstractC0213k.f1163b.equals(uuid));
        this.uuid = uuid;
        this.exoMediaDrmProvider = provider;
        this.callback = mediaDrmCallback;
        this.keyRequestParameters = map;
        this.multiSession = z7;
        this.useDrmSessionsForClearContentTrackTypes = iArr;
        this.playClearSamplesWithoutKeys = z8;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.provisioningManagerImpl = new ProvisioningManagerImpl();
        this.referenceCountListener = new ReferenceCountListenerImpl();
        this.mode = 0;
        this.sessions = new ArrayList();
        this.preacquiredSessionReferences = Collections.newSetFromMap(new IdentityHashMap());
        this.keepaliveSessions = Collections.newSetFromMap(new IdentityHashMap());
        this.sessionKeepaliveMs = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public DrmSession acquireSession(Looper looper, DrmSessionEventListener.EventDispatcher eventDispatcher, C0249w c0249w, boolean z7) {
        List<C0234r> schemeDatas;
        maybeCreateMediaDrmHandler(looper);
        C0237s c0237s = c0249w.f1526r;
        if (c0237s == null) {
            return maybeAcquirePlaceholderSession(AbstractC0244u0.m680i(c0249w.f1522n), z7);
        }
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (this.offlineLicenseKeySetId == null) {
            c0237s.getClass();
            schemeDatas = getSchemeDatas(c0237s, this.uuid, false);
            if (schemeDatas.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.uuid);
                AbstractC1101a.m2365p(TAG, "DRM error", missingSchemeDataException);
                if (eventDispatcher != null) {
                    eventDispatcher.drmSessionManagerError(missingSchemeDataException);
                }
                return new ErrorStateDrmSession(new DrmSession.DrmSessionException(missingSchemeDataException, C0253x0.ERROR_CODE_DRM_CONTENT_ERROR));
            }
        } else {
            schemeDatas = null;
        }
        if (!this.multiSession) {
            defaultDrmSession = this.noMultiSessionDrmSession;
        } else {
            Iterator<DefaultDrmSession> it = this.sessions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                List<C0234r> list = next.schemeDatas;
                int i = AbstractC1118i0.f4750a;
                if (Objects.equals(list, schemeDatas)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        }
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionCreateAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(schemeDatas, false, eventDispatcher, z7);
            if (!this.multiSession) {
                this.noMultiSessionDrmSession = defaultDrmSessionCreateAndAcquireSessionWithRetry;
            }
            this.sessions.add(defaultDrmSessionCreateAndAcquireSessionWithRetry);
            return defaultDrmSessionCreateAndAcquireSessionWithRetry;
        }
        defaultDrmSession.acquire(eventDispatcher);
        return defaultDrmSession;
    }
}
