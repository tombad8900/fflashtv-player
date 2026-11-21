package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.media3.common.AbstractC0203g1;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0226o0;
import androidx.media3.exoplayer.dash.offline.ExecutorC0339a;
import androidx.media3.exoplayer.offline.Downloader;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.AbstractRunnableFutureC1133x;
import p089k1.C1568l;
import p089k1.InterfaceC1563g;
import p097l1.AbstractC1647c;
import p097l1.AbstractC1650f;
import p097l1.C1646b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class ProgressiveDownloader implements Downloader {
    private final AbstractC1650f cacheWriter;
    private final AbstractC1647c dataSource;
    private final C1568l dataSpec;
    private volatile AbstractRunnableFutureC1133x downloadRunnable;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final AbstractC0203g1 priorityTaskManager;
    private Downloader.ProgressListener progressListener;

    public ProgressiveDownloader(C0226o0 c0226o0, C1646b c1646b) {
        this(c0226o0, c1646b, new ExecutorC0339a());
    }

    private void onProgress(long j, long j8, long j9) {
        Downloader.ProgressListener progressListener = this.progressListener;
        if (progressListener == null) {
            return;
        }
        progressListener.onProgress(j, j8, (j == -1 || j == 0) ? -1.0f : (j8 * 100.0f) / j);
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        this.isCanceled = true;
        AbstractRunnableFutureC1133x abstractRunnableFutureC1133x = this.downloadRunnable;
        if (abstractRunnableFutureC1133x != null) {
            abstractRunnableFutureC1133x.cancel(true);
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void download(Downloader.ProgressListener progressListener) {
        this.progressListener = progressListener;
        try {
            if (!this.isCanceled) {
                this.downloadRunnable = new AbstractRunnableFutureC1133x() { // from class: androidx.media3.exoplayer.offline.ProgressiveDownloader.1
                    @Override // p063h1.AbstractRunnableFutureC1133x
                    public void cancelWork() {
                        ProgressiveDownloader.this.cacheWriter.f6287a = true;
                    }

                    @Override // p063h1.AbstractRunnableFutureC1133x
                    public Void doWork() throws InterruptedIOException {
                        if (ProgressiveDownloader.this.cacheWriter.f6287a) {
                            throw new InterruptedIOException();
                        }
                        throw null;
                    }
                };
                this.executor.execute(this.downloadRunnable);
                try {
                    this.downloadRunnable.get();
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i = AbstractC1118i0.f4750a;
                    throw cause;
                }
            }
        } finally {
            AbstractRunnableFutureC1133x abstractRunnableFutureC1133x = this.downloadRunnable;
            abstractRunnableFutureC1133x.getClass();
            abstractRunnableFutureC1133x.blockUntilFinished();
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void remove() {
        throw null;
    }

    public ProgressiveDownloader(C0226o0 c0226o0, C1646b c1646b, Executor executor) {
        executor.getClass();
        this.executor = executor;
        c0226o0.f1239b.getClass();
        Map map = Collections.EMPTY_MAP;
        C0211j0 c0211j0 = c0226o0.f1239b;
        Uri uri = c0211j0.f1147a;
        String str = c0211j0.f1152f;
        AbstractC1101a.m2361l("The uri must be set.", uri);
        this.dataSpec = new C1568l(uri, 1, null, map, 0L, -1L, str, 4);
        InterfaceC1563g interfaceC1563g = c1646b.f6285j;
        if (interfaceC1563g != null) {
            interfaceC1563g.mo55l();
        }
        throw null;
    }
}
