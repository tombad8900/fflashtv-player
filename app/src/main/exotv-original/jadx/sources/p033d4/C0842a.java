package p033d4;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import p189v7.C2559c;
import p189v7.C2565f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d4.a */
/* loaded from: classes.dex */
public final class C0842a extends Thread {

    /* renamed from: j */
    public final /* synthetic */ int f3722j = 0;

    public /* synthetic */ C0842a(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ReentrantLock reentrantLock;
        C2565f c2565fM4595c;
        switch (this.f3722j) {
            case 0:
                Process.setThreadPriority(9);
                super.run();
                return;
        }
        while (true) {
            try {
                C2565f.Companion.getClass();
                reentrantLock = C2565f.lock;
                reentrantLock.lock();
                try {
                    C2565f.Companion.getClass();
                    c2565fM4595c = C2559c.m4595c();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
            }
            if (c2565fM4595c == C2565f.head) {
                C2559c unused2 = C2565f.Companion;
                C2565f.head = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (c2565fM4595c != null) {
                    c2565fM4595c.timedOut();
                }
            }
        }
    }

    public /* synthetic */ C0842a(String str) {
        super(str);
    }
}
