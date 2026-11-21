package p189v7;

import java.util.concurrent.TimeUnit;
import p033d4.C0842a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.c */
/* loaded from: classes.dex */
public final class C2559c {
    /* renamed from: a */
    public static final void m4593a(C2559c c2559c, C2565f c2565f, long j, boolean z7) {
        c2559c.getClass();
        if (C2565f.head == null) {
            C2565f.head = new C2565f();
            C0842a c0842a = new C0842a("Okio Watchdog");
            c0842a.setDaemon(true);
            c0842a.start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z7) {
            c2565f.timeoutAt = Math.min(j, c2565f.deadlineNanoTime() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c2565f.timeoutAt = j + jNanoTime;
        } else {
            if (!z7) {
                throw new AssertionError();
            }
            c2565f.timeoutAt = c2565f.deadlineNanoTime();
        }
        long jAccess$remainingNanos = C2565f.access$remainingNanos(c2565f, jNanoTime);
        C2565f c2565f2 = C2565f.head;
        AbstractC2980h.m5133b(c2565f2);
        while (c2565f2.next != null) {
            C2565f c2565f3 = c2565f2.next;
            AbstractC2980h.m5133b(c2565f3);
            if (jAccess$remainingNanos < C2565f.access$remainingNanos(c2565f3, jNanoTime)) {
                break;
            }
            c2565f2 = c2565f2.next;
            AbstractC2980h.m5133b(c2565f2);
        }
        c2565f.next = c2565f2.next;
        c2565f2.next = c2565f;
        if (c2565f2 == C2565f.head) {
            C2565f.condition.signal();
        }
    }

    /* renamed from: b */
    public static final void m4594b(C2559c c2559c, C2565f c2565f) {
        c2559c.getClass();
        for (C2565f c2565f2 = C2565f.head; c2565f2 != null; c2565f2 = c2565f2.next) {
            if (c2565f2.next == c2565f) {
                c2565f2.next = c2565f.next;
                c2565f.next = null;
                return;
            }
        }
        throw new IllegalStateException("node was not found in the queue");
    }

    /* renamed from: c */
    public static C2565f m4595c() throws InterruptedException {
        C2565f c2565f = C2565f.head;
        AbstractC2980h.m5133b(c2565f);
        C2565f c2565f2 = c2565f.next;
        if (c2565f2 == null) {
            long jNanoTime = System.nanoTime();
            C2565f.condition.await(C2565f.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
            C2565f c2565f3 = C2565f.head;
            AbstractC2980h.m5133b(c2565f3);
            if (c2565f3.next != null || System.nanoTime() - jNanoTime < C2565f.IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return C2565f.head;
        }
        long jAccess$remainingNanos = C2565f.access$remainingNanos(c2565f2, System.nanoTime());
        if (jAccess$remainingNanos > 0) {
            C2565f.condition.await(jAccess$remainingNanos, TimeUnit.NANOSECONDS);
            return null;
        }
        C2565f c2565f4 = C2565f.head;
        AbstractC2980h.m5133b(c2565f4);
        c2565f4.next = c2565f2.next;
        c2565f2.next = null;
        c2565f2.state = 2;
        return c2565f2;
    }
}
