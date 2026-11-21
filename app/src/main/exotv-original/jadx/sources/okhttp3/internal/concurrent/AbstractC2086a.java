package okhttp3.internal.concurrent;

import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.concurrent.a */
/* loaded from: classes.dex */
public abstract class AbstractC2086a {
    private final boolean cancelable;
    private final String name;
    private long nextExecuteNanoTime;
    private C2088c queue;

    public AbstractC2086a(String str, boolean z7) {
        AbstractC2980h.m5136e("name", str);
        this.name = str;
        this.cancelable = z7;
        this.nextExecuteNanoTime = -1L;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNextExecuteNanoTime$okhttp() {
        return this.nextExecuteNanoTime;
    }

    public final C2088c getQueue$okhttp() {
        return this.queue;
    }

    public final void initQueue$okhttp(C2088c c2088c) {
        AbstractC2980h.m5136e("queue", c2088c);
        C2088c c2088c2 = this.queue;
        if (c2088c2 == c2088c) {
            return;
        }
        if (c2088c2 != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.queue = c2088c;
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j) {
        this.nextExecuteNanoTime = j;
    }

    public final void setQueue$okhttp(C2088c c2088c) {
        this.queue = c2088c;
    }

    public String toString() {
        return this.name;
    }

    public /* synthetic */ AbstractC2086a(String str, boolean z7, int i, AbstractC2977e abstractC2977e) {
        this(str, (i & 2) != 0 ? true : z7);
    }
}
