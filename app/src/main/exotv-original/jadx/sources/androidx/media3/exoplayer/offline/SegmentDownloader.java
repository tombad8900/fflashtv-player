package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.media3.common.AbstractC0203g1;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0212j1;
import androidx.media3.common.C0226o0;
import androidx.media3.exoplayer.offline.Downloader;
import androidx.media3.exoplayer.offline.FilterableManifest;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p057g2.C1040d;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.AbstractRunnableFutureC1133x;
import p089k1.C1568l;
import p089k1.InterfaceC1563g;
import p089k1.InterfaceC1564h;
import p097l1.AbstractC1647c;
import p097l1.AbstractC1650f;
import p097l1.C1646b;
import p097l1.InterfaceC1645a;
import p097l1.InterfaceC1648d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {
    private static final int BUFFER_SIZE_BYTES = 131072;
    public static final long DEFAULT_MAX_MERGED_SEGMENT_START_TIME_DIFF_MS = 20000;
    private final ArrayList<AbstractRunnableFutureC1133x> activeRunnables;
    private final InterfaceC1645a cache;
    private final C1646b cacheDataSourceFactory;
    private final InterfaceC1648d cacheKeyFactory;
    private final Executor executor;
    private volatile boolean isCanceled;
    private final C1568l manifestDataSpec;
    private final ParsingLoadable.Parser<M> manifestParser;
    private final long maxMergedSegmentStartTimeDiffUs;
    private final AbstractC0203g1 priorityTaskManager;
    private final ArrayList<C0212j1> streamKeys;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class ProgressNotifier {
        private long bytesDownloaded;
        private final long contentLength;
        private final Downloader.ProgressListener progressListener;
        private int segmentsDownloaded;
        private final int totalSegments;

        public ProgressNotifier(Downloader.ProgressListener progressListener, long j, int i, long j8, int i4) {
            this.progressListener = progressListener;
            this.contentLength = j;
            this.totalSegments = i;
            this.bytesDownloaded = j8;
            this.segmentsDownloaded = i4;
        }

        private float getPercentDownloaded() {
            long j = this.contentLength;
            if (j != -1 && j != 0) {
                return (this.bytesDownloaded * 100.0f) / j;
            }
            int i = this.totalSegments;
            if (i != 0) {
                return (this.segmentsDownloaded * 100.0f) / i;
            }
            return -1.0f;
        }

        public void onProgress(long j, long j8, long j9) {
            long j10 = this.bytesDownloaded + j9;
            this.bytesDownloaded = j10;
            this.progressListener.onProgress(this.contentLength, j10, getPercentDownloaded());
        }

        public void onSegmentDownloaded() {
            this.segmentsDownloaded++;
            this.progressListener.onProgress(this.contentLength, this.bytesDownloaded, getPercentDownloaded());
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class Segment implements Comparable<Segment> {
        public final C1568l dataSpec;
        public final long startTimeUs;

        public Segment(long j, C1568l c1568l) {
            this.startTimeUs = j;
            this.dataSpec = c1568l;
        }

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            return AbstractC1118i0.m2449h(this.startTimeUs, segment.startTimeUs);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SegmentDownloadRunnable extends AbstractRunnableFutureC1133x {
        private final AbstractC1650f cacheWriter;
        public final AbstractC1647c dataSource;
        private final ProgressNotifier progressNotifier;
        public final Segment segment;
        public final byte[] temporaryBuffer;

        public SegmentDownloadRunnable(Segment segment, AbstractC1647c abstractC1647c, ProgressNotifier progressNotifier, byte[] bArr) {
            this.segment = segment;
            this.progressNotifier = progressNotifier;
            this.temporaryBuffer = bArr;
            C1568l c1568l = segment.dataSpec;
            throw null;
        }

        @Override // p063h1.AbstractRunnableFutureC1133x
        public void cancelWork() {
            this.cacheWriter.f6287a = true;
        }

        @Override // p063h1.AbstractRunnableFutureC1133x
        public Void doWork() throws InterruptedIOException {
            if (this.cacheWriter.f6287a) {
                throw new InterruptedIOException();
            }
            throw null;
        }
    }

    @Deprecated
    public SegmentDownloader(C0226o0 c0226o0, ParsingLoadable.Parser<M> parser, C1646b c1646b, Executor executor) {
        this(c0226o0, parser, c1646b, executor, 20000L);
    }

    private <T> void addActiveRunnable(AbstractRunnableFutureC1133x abstractRunnableFutureC1133x) {
        synchronized (this.activeRunnables) {
            try {
                if (this.isCanceled) {
                    throw new InterruptedException();
                }
                this.activeRunnables.add(abstractRunnableFutureC1133x);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean canMergeSegments(C1568l c1568l, C1568l c1568l2) {
        if (!c1568l.f5996a.equals(c1568l2.f5996a)) {
            return false;
        }
        long j = c1568l.f6001f;
        if (j == -1 || c1568l.f6000e + j != c1568l2.f6000e) {
            return false;
        }
        String str = c1568l.f6002g;
        String str2 = c1568l2.f6002g;
        int i = AbstractC1118i0.f4750a;
        return Objects.equals(str, str2) && c1568l.f6003h == c1568l2.f6003h && c1568l.f5997b == c1568l2.f5997b && c1568l.f5999d.equals(c1568l2.f5999d);
    }

    public static C1568l getCompressibleDataSpec(Uri uri) {
        Map map = Collections.EMPTY_MAP;
        AbstractC1101a.m2361l("The uri must be set.", uri);
        return new C1568l(uri, 1, null, map, 0L, -1L, null, 1);
    }

    private static void mergeSegments(List<Segment> list, InterfaceC1648d interfaceC1648d, long j) {
        HashMap map = new HashMap();
        int i = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Segment segment = list.get(i4);
            C1568l c1568l = segment.dataSpec;
            ((C1040d) interfaceC1648d).getClass();
            String string = c1568l.f6002g;
            if (string == null) {
                string = c1568l.f5996a.toString();
            }
            Integer num = (Integer) map.get(string);
            Segment segment2 = num == null ? null : list.get(num.intValue());
            if (segment2 == null || segment.startTimeUs > segment2.startTimeUs + j || !canMergeSegments(segment2.dataSpec, segment.dataSpec)) {
                map.put(string, Integer.valueOf(i));
                list.set(i, segment);
                i++;
            } else {
                long j8 = segment.dataSpec.f6001f;
                C1568l c1568lM3239c = segment2.dataSpec.m3239c(0L, j8 != -1 ? segment2.dataSpec.f6001f + j8 : -1L);
                num.getClass();
                list.set(num.intValue(), new Segment(segment2.startTimeUs, c1568lM3239c));
            }
        }
        AbstractC1118i0.m2433X(i, list.size(), list);
    }

    private void removeActiveRunnable(AbstractRunnableFutureC1133x abstractRunnableFutureC1133x) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(abstractRunnableFutureC1133x);
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        synchronized (this.activeRunnables) {
            try {
                this.isCanceled = true;
                for (int i = 0; i < this.activeRunnables.size(); i++) {
                    this.activeRunnables.get(i).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.Downloader
    public final void download(Downloader.ProgressListener progressListener) {
        new ArrayDeque();
        new ArrayDeque();
        try {
            InterfaceC1563g interfaceC1563g = this.cacheDataSourceFactory.f6285j;
            if (interfaceC1563g != null) {
                interfaceC1563g.mo55l();
            }
            throw null;
        } catch (Throwable th) {
            for (int i = 0; i < this.activeRunnables.size(); i++) {
                this.activeRunnables.get(i).cancel(true);
            }
            for (int size = this.activeRunnables.size() - 1; size >= 0; size--) {
                this.activeRunnables.get(size).blockUntilFinished();
                removeActiveRunnable(size);
            }
            throw th;
        }
    }

    public final <T> T execute(AbstractRunnableFutureC1133x abstractRunnableFutureC1133x, boolean z7) throws ExecutionException, InterruptedException, IOException {
        if (z7) {
            abstractRunnableFutureC1133x.run();
            try {
                return (T) abstractRunnableFutureC1133x.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i = AbstractC1118i0.f4750a;
                throw e;
            }
        }
        if (this.isCanceled) {
            throw new InterruptedException();
        }
        addActiveRunnable(abstractRunnableFutureC1133x);
        this.executor.execute(abstractRunnableFutureC1133x);
        try {
            try {
                return (T) abstractRunnableFutureC1133x.get();
            } catch (ExecutionException e8) {
                Throwable cause2 = e8.getCause();
                cause2.getClass();
                if (cause2 instanceof IOException) {
                    throw ((IOException) cause2);
                }
                int i4 = AbstractC1118i0.f4750a;
                throw e8;
            }
        } finally {
            abstractRunnableFutureC1133x.blockUntilFinished();
            removeActiveRunnable(abstractRunnableFutureC1133x);
        }
    }

    public final M getManifest(final InterfaceC1564h interfaceC1564h, final C1568l c1568l, boolean z7) {
        return (M) execute(new AbstractRunnableFutureC1133x() { // from class: androidx.media3.exoplayer.offline.SegmentDownloader.1
            @Override // p063h1.AbstractRunnableFutureC1133x
            public M doWork() {
                return (M) ParsingLoadable.load(interfaceC1564h, SegmentDownloader.this.manifestParser, c1568l, 4);
            }
        }, z7);
    }

    public abstract List<Segment> getSegments(InterfaceC1564h interfaceC1564h, M m8, boolean z7);

    @Override // androidx.media3.exoplayer.offline.Downloader
    public final void remove() {
        this.cacheDataSourceFactory.getClass();
        throw null;
    }

    public SegmentDownloader(C0226o0 c0226o0, ParsingLoadable.Parser<M> parser, C1646b c1646b, Executor executor, long j) {
        c0226o0.f1239b.getClass();
        C0211j0 c0211j0 = c0226o0.f1239b;
        this.manifestDataSpec = getCompressibleDataSpec(c0211j0.f1147a);
        this.manifestParser = parser;
        this.streamKeys = new ArrayList<>(c0211j0.f1151e);
        this.cacheDataSourceFactory = c1646b;
        this.executor = executor;
        c1646b.getClass();
        throw null;
    }

    private void removeActiveRunnable(int i) {
        synchronized (this.activeRunnables) {
            this.activeRunnables.remove(i);
        }
    }
}
