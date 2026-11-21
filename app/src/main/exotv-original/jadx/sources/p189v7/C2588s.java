package p189v7;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.s */
/* loaded from: classes.dex */
public final class C2588s extends C2582n0 {

    /* renamed from: a */
    public C2582n0 f9331a;

    public C2588s(C2582n0 c2582n0) {
        AbstractC2980h.m5136e("delegate", c2582n0);
        this.f9331a = c2582n0;
    }

    @Override // p189v7.C2582n0
    public final void awaitSignal(Condition condition) throws InterruptedException, InterruptedIOException {
        AbstractC2980h.m5136e("condition", condition);
        this.f9331a.awaitSignal(condition);
    }

    @Override // p189v7.C2582n0
    public final C2582n0 clearDeadline() {
        return this.f9331a.clearDeadline();
    }

    @Override // p189v7.C2582n0
    public final C2582n0 clearTimeout() {
        return this.f9331a.clearTimeout();
    }

    @Override // p189v7.C2582n0
    public final long deadlineNanoTime() {
        return this.f9331a.deadlineNanoTime();
    }

    @Override // p189v7.C2582n0
    public final boolean hasDeadline() {
        return this.f9331a.hasDeadline();
    }

    @Override // p189v7.C2582n0
    public final void throwIfReached() throws InterruptedIOException {
        this.f9331a.throwIfReached();
    }

    @Override // p189v7.C2582n0
    public final C2582n0 timeout(long j, TimeUnit timeUnit) {
        AbstractC2980h.m5136e("unit", timeUnit);
        return this.f9331a.timeout(j, timeUnit);
    }

    @Override // p189v7.C2582n0
    public final long timeoutNanos() {
        return this.f9331a.timeoutNanos();
    }

    @Override // p189v7.C2582n0
    public final void waitUntilNotified(Object obj) throws InterruptedException, InterruptedIOException {
        AbstractC2980h.m5136e("monitor", obj);
        this.f9331a.waitUntilNotified(obj);
    }

    @Override // p189v7.C2582n0
    public final C2582n0 deadlineNanoTime(long j) {
        return this.f9331a.deadlineNanoTime(j);
    }
}
