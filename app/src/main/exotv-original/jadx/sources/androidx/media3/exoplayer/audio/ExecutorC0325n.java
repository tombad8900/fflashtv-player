package androidx.media3.exoplayer.audio;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.audio.n */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0325n implements Executor {

    /* renamed from: j */
    public final /* synthetic */ Handler f1690j;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1690j.post(runnable);
    }
}
