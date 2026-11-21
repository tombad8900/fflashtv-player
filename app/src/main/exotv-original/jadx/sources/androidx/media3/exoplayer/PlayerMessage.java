package androidx.media3.exoplayer;

import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0255y;
import java.util.concurrent.TimeoutException;
import p063h1.AbstractC1101a;
import p063h1.C1135z;
import p063h1.InterfaceC1103b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class PlayerMessage {
    private final InterfaceC1103b clock;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Looper looper;
    private int mediaItemIndex;
    private Object payload;
    private final Sender sender;
    private final Target target;
    private final AbstractC0230p1 timeline;
    private int type;
    private long positionMs = -9223372036854775807L;
    private boolean deleteAfterDelivery = true;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Target {
        void handleMessage(int i, Object obj);
    }

    public PlayerMessage(Sender sender, Target target, AbstractC0230p1 abstractC0230p1, int i, InterfaceC1103b interfaceC1103b, Looper looper) {
        this.sender = sender;
        this.target = target;
        this.timeline = abstractC0230p1;
        this.looper = looper;
        this.clock = interfaceC1103b;
        this.mediaItemIndex = i;
    }

    public synchronized boolean blockUntilDelivered() {
        try {
            AbstractC1101a.m2359j(this.isSent);
            AbstractC1101a.m2359j(this.looper.getThread() != Thread.currentThread());
            while (!this.isProcessed) {
                wait();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isDelivered;
    }

    public synchronized PlayerMessage cancel() {
        AbstractC1101a.m2359j(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public Looper getLooper() {
        return this.looper;
    }

    public int getMediaItemIndex() {
        return this.mediaItemIndex;
    }

    public Object getPayload() {
        return this.payload;
    }

    public long getPositionMs() {
        return this.positionMs;
    }

    public Target getTarget() {
        return this.target;
    }

    public AbstractC0230p1 getTimeline() {
        return this.timeline;
    }

    public int getType() {
        return this.type;
    }

    public synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public synchronized void markAsProcessed(boolean z7) {
        this.isDelivered = z7 | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }

    public PlayerMessage send() {
        AbstractC1101a.m2359j(!this.isSent);
        if (this.positionMs == -9223372036854775807L) {
            AbstractC1101a.m2353d(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public PlayerMessage setDeleteAfterDelivery(boolean z7) {
        AbstractC1101a.m2359j(!this.isSent);
        this.deleteAfterDelivery = z7;
        return this;
    }

    public PlayerMessage setLooper(Looper looper) {
        AbstractC1101a.m2359j(!this.isSent);
        this.looper = looper;
        return this;
    }

    public PlayerMessage setPayload(Object obj) {
        AbstractC1101a.m2359j(!this.isSent);
        this.payload = obj;
        return this;
    }

    public PlayerMessage setPosition(long j) {
        AbstractC1101a.m2359j(!this.isSent);
        this.positionMs = j;
        return this;
    }

    public PlayerMessage setType(int i) {
        AbstractC1101a.m2359j(!this.isSent);
        this.type = i;
        return this;
    }

    public PlayerMessage setPosition(int i, long j) {
        AbstractC1101a.m2359j(!this.isSent);
        AbstractC1101a.m2353d(j != -9223372036854775807L);
        if (i >= 0 && (this.timeline.isEmpty() || i < this.timeline.getWindowCount())) {
            this.mediaItemIndex = i;
            this.positionMs = j;
            return this;
        }
        throw new C0255y();
    }

    public synchronized boolean blockUntilDelivered(long j) {
        boolean z7;
        try {
            AbstractC1101a.m2359j(this.isSent);
            AbstractC1101a.m2359j(this.looper.getThread() != Thread.currentThread());
            ((C1135z) this.clock).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
            while (true) {
                z7 = this.isProcessed;
                if (z7 || j <= 0) {
                    break;
                }
                this.clock.getClass();
                wait(j);
                ((C1135z) this.clock).getClass();
                j = jElapsedRealtime - SystemClock.elapsedRealtime();
            }
            if (!z7) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isDelivered;
    }
}
