package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p115n1.C1978h0;
import p115n1.InterfaceC1980i0;
import p192w1.C2600b;
import p208y1.C2793a;
import p208y1.C2794b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class PlayerEmsgHandler implements Handler.Callback {
    private static final int EMSG_MANIFEST_EXPIRED = 1;
    private final Allocator allocator;
    private boolean chunkLoadedCompletedSinceLastManifestRefreshRequest;
    private long expiredManifestPublishTimeUs;
    private boolean isWaitingForManifestRefresh;
    private DashManifest manifest;
    private final PlayerEmsgCallback playerEmsgCallback;
    private boolean released;
    private final TreeMap<Long, Long> manifestPublishTimeToExpiryTimeUs = new TreeMap<>();
    private final Handler handler = AbstractC1118i0.m2457p(this);
    private final C2794b decoder = new C2794b();

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class ManifestExpiryEventInfo {
        public final long eventTimeUs;
        public final long manifestPublishTimeMsInEmsg;

        public ManifestExpiryEventInfo(long j, long j8) {
            this.eventTimeUs = j;
            this.manifestPublishTimeMsInEmsg = j8;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface PlayerEmsgCallback {
        void onDashManifestPublishTimeExpired(long j);

        void onDashManifestRefreshRequested();
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class PlayerTrackEmsgHandler implements InterfaceC1980i0 {
        private final SampleQueue sampleQueue;
        private final FormatHolder formatHolder = new FormatHolder();
        private final C2600b buffer = new C2600b(1);
        private long maxLoadedChunkEndTimeUs = -9223372036854775807L;

        public PlayerTrackEmsgHandler(Allocator allocator) {
            this.sampleQueue = SampleQueue.createWithoutDrm(allocator);
        }

        private C2600b dequeueSample() {
            this.buffer.clear();
            if (this.sampleQueue.read(this.formatHolder, this.buffer, 0, false) != -4) {
                return null;
            }
            this.buffer.flip();
            return this.buffer;
        }

        private void onManifestExpiredMessageEncountered(long j, long j8) {
            PlayerEmsgHandler.this.handler.sendMessage(PlayerEmsgHandler.this.handler.obtainMessage(1, new ManifestExpiryEventInfo(j, j8)));
        }

        private void parseAndDiscardSamples() {
            while (this.sampleQueue.isReady(false)) {
                C2600b c2600bDequeueSample = dequeueSample();
                if (c2600bDequeueSample != null) {
                    long j = c2600bDequeueSample.timeUs;
                    C0241t0 c0241t0M4347c = PlayerEmsgHandler.this.decoder.m4347c(c2600bDequeueSample);
                    if (c0241t0M4347c != null) {
                        C2793a c2793a = (C2793a) c0241t0M4347c.f1412j[0];
                        if (PlayerEmsgHandler.isPlayerEmsgEvent(c2793a.f10404j, c2793a.f10405k)) {
                            parsePlayerEmsgEvent(j, c2793a);
                        }
                    }
                }
            }
            this.sampleQueue.discardToRead();
        }

        private void parsePlayerEmsgEvent(long j, C2793a c2793a) {
            long manifestPublishTimeMsInEmsg = PlayerEmsgHandler.getManifestPublishTimeMsInEmsg(c2793a);
            if (manifestPublishTimeMsInEmsg == -9223372036854775807L) {
                return;
            }
            onManifestExpiredMessageEncountered(j, manifestPublishTimeMsInEmsg);
        }

        @Override // p115n1.InterfaceC1980i0
        public void format(C0249w c0249w) {
            this.sampleQueue.format(c0249w);
        }

        public boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
            return PlayerEmsgHandler.this.maybeRefreshManifestBeforeLoadingNextChunk(j);
        }

        public void onChunkLoadCompleted(Chunk chunk) {
            long j = this.maxLoadedChunkEndTimeUs;
            if (j == -9223372036854775807L || chunk.endTimeUs > j) {
                this.maxLoadedChunkEndTimeUs = chunk.endTimeUs;
            }
            PlayerEmsgHandler.this.onChunkLoadCompleted(chunk);
        }

        public boolean onChunkLoadError(Chunk chunk) {
            long j = this.maxLoadedChunkEndTimeUs;
            return PlayerEmsgHandler.this.onChunkLoadError(j != -9223372036854775807L && j < chunk.startTimeUs);
        }

        public void release() {
            this.sampleQueue.release();
        }

        @Override // p115n1.InterfaceC1980i0
        public int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7) {
            return sampleData(interfaceC0219m, i, z7, 0);
        }

        @Override // p115n1.InterfaceC1980i0
        public void sampleMetadata(long j, int i, int i4, int i8, C1978h0 c1978h0) {
            this.sampleQueue.sampleMetadata(j, i, i4, i8, c1978h0);
            parseAndDiscardSamples();
        }

        @Override // p115n1.InterfaceC1980i0
        public void sampleData(C1132w c1132w, int i) {
            sampleData(c1132w, i, 0);
        }

        @Override // p115n1.InterfaceC1980i0
        public int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7, int i4) {
            return this.sampleQueue.sampleData(interfaceC0219m, i, z7);
        }

        @Override // p115n1.InterfaceC1980i0
        public void sampleData(C1132w c1132w, int i, int i4) {
            this.sampleQueue.sampleData(c1132w, i);
        }
    }

    public PlayerEmsgHandler(DashManifest dashManifest, PlayerEmsgCallback playerEmsgCallback, Allocator allocator) {
        this.manifest = dashManifest;
        this.playerEmsgCallback = playerEmsgCallback;
        this.allocator = allocator;
    }

    private Map.Entry<Long, Long> ceilingExpiryEntryForPublishTime(long j) {
        return this.manifestPublishTimeToExpiryTimeUs.ceilingEntry(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getManifestPublishTimeMsInEmsg(C2793a c2793a) {
        try {
            return AbstractC1118i0.m2431V(AbstractC1118i0.m2459r(c2793a.f10408n));
        } catch (C0247v0 unused) {
            return -9223372036854775807L;
        }
    }

    private void handleManifestExpiredMessage(long j, long j8) {
        Long l8 = this.manifestPublishTimeToExpiryTimeUs.get(Long.valueOf(j8));
        if (l8 == null) {
            this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j8), Long.valueOf(j));
        } else if (l8.longValue() > j) {
            this.manifestPublishTimeToExpiryTimeUs.put(Long.valueOf(j8), Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPlayerEmsgEvent(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    private void maybeNotifyDashManifestRefreshNeeded() {
        if (this.chunkLoadedCompletedSinceLastManifestRefreshRequest) {
            this.isWaitingForManifestRefresh = true;
            this.chunkLoadedCompletedSinceLastManifestRefreshRequest = false;
            this.playerEmsgCallback.onDashManifestRefreshRequested();
        }
    }

    private void notifyManifestPublishTimeExpired() {
        this.playerEmsgCallback.onDashManifestPublishTimeExpired(this.expiredManifestPublishTimeUs);
    }

    private void removePreviouslyExpiredManifestPublishTimeValues() {
        Iterator<Map.Entry<Long, Long>> it = this.manifestPublishTimeToExpiryTimeUs.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.manifest.publishTimeMs) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.released) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        ManifestExpiryEventInfo manifestExpiryEventInfo = (ManifestExpiryEventInfo) message.obj;
        handleManifestExpiredMessage(manifestExpiryEventInfo.eventTimeUs, manifestExpiryEventInfo.manifestPublishTimeMsInEmsg);
        return true;
    }

    public boolean maybeRefreshManifestBeforeLoadingNextChunk(long j) {
        DashManifest dashManifest = this.manifest;
        boolean z7 = false;
        if (!dashManifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        Map.Entry<Long, Long> entryCeilingExpiryEntryForPublishTime = ceilingExpiryEntryForPublishTime(dashManifest.publishTimeMs);
        if (entryCeilingExpiryEntryForPublishTime != null && entryCeilingExpiryEntryForPublishTime.getValue().longValue() < j) {
            this.expiredManifestPublishTimeUs = entryCeilingExpiryEntryForPublishTime.getKey().longValue();
            notifyManifestPublishTimeExpired();
            z7 = true;
        }
        if (z7) {
            maybeNotifyDashManifestRefreshNeeded();
        }
        return z7;
    }

    public PlayerTrackEmsgHandler newPlayerTrackEmsgHandler() {
        return new PlayerTrackEmsgHandler(this.allocator);
    }

    public void onChunkLoadCompleted(Chunk chunk) {
        this.chunkLoadedCompletedSinceLastManifestRefreshRequest = true;
    }

    public boolean onChunkLoadError(boolean z7) {
        if (!this.manifest.dynamic) {
            return false;
        }
        if (this.isWaitingForManifestRefresh) {
            return true;
        }
        if (!z7) {
            return false;
        }
        maybeNotifyDashManifestRefreshNeeded();
        return true;
    }

    public void release() {
        this.released = true;
        this.handler.removeCallbacksAndMessages(null);
    }

    public void updateManifest(DashManifest dashManifest) {
        this.isWaitingForManifestRefresh = false;
        this.expiredManifestPublishTimeUs = -9223372036854775807L;
        this.manifest = dashManifest;
        removePreviouslyExpiredManifestPublishTimeValues();
    }
}
