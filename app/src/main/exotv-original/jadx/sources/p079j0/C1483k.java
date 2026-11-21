package p079j0;

import android.os.Process;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j0.k */
/* loaded from: classes.dex */
public final class C1483k extends Thread {

    /* renamed from: j */
    public final int f5714j;

    public C1483k(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f5714j = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f5714j);
        super.run();
    }
}
