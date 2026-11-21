package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0226o0;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import p063h1.AbstractC1101a;
import p063h1.C1104b0;
import p063h1.C1135z;
import p063h1.InterfaceC1103b;
import p063h1.InterfaceC1120k;
import p085j6.C1530t;
import p085j6.InterfaceFutureC1529s;
import p115n1.C1985l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class MetadataRetriever {
    public static final int DEFAULT_MAXIMUM_PARALLEL_RETRIEVALS = 5;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MetadataRetrieverInternal {
        private static final int MESSAGE_CHECK_FOR_FAILURE = 2;
        private static final int MESSAGE_CONTINUE_LOADING = 3;
        private static final int MESSAGE_PREPARE_SOURCE = 1;
        private static final int MESSAGE_RELEASE = 4;
        private static final SharedWorkerThread SHARED_WORKER_THREAD = new SharedWorkerThread();
        private final C0226o0 mediaItem;
        private final MediaSource.Factory mediaSourceFactory;
        private final InterfaceC1120k mediaSourceHandler;
        private final C1530t trackGroupsFuture = new C1530t();

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        public final class MediaSourceHandlerCallback implements Handler.Callback {
            private static final int ERROR_POLL_INTERVAL_MS = 100;
            private MediaPeriod mediaPeriod;
            private MediaSource mediaSource;
            private final MediaSourceCaller mediaSourceCaller = new MediaSourceCaller();

            /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
            public final class MediaSourceCaller implements MediaSource.MediaSourceCaller {
                private boolean mediaPeriodCreated;
                private final MediaPeriodCallback mediaPeriodCallback = new MediaPeriodCallback();
                private final Allocator allocator = new DefaultAllocator(true, 65536);

                /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
                public final class MediaPeriodCallback implements MediaPeriod.Callback {
                    private MediaPeriodCallback() {
                    }

                    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
                    public void onPrepared(MediaPeriod mediaPeriod) {
                        MetadataRetrieverInternal.this.trackGroupsFuture.m3212j(mediaPeriod.getTrackGroups());
                        ((C1104b0) MetadataRetrieverInternal.this.mediaSourceHandler).m2379a(4).m2377b();
                    }

                    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
                    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
                        ((C1104b0) MetadataRetrieverInternal.this.mediaSourceHandler).m2379a(3).m2377b();
                    }
                }

                public MediaSourceCaller() {
                }

                @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
                public void onSourceInfoRefreshed(MediaSource mediaSource, AbstractC0230p1 abstractC0230p1) {
                    if (this.mediaPeriodCreated) {
                        return;
                    }
                    this.mediaPeriodCreated = true;
                    MediaSourceHandlerCallback.this.mediaPeriod = mediaSource.createPeriod(new MediaSource.MediaPeriodId(abstractC0230p1.getUidOfPeriod(0)), this.allocator, 0L);
                    MediaSourceHandlerCallback.this.mediaPeriod.prepare(this.mediaPeriodCallback, 0L);
                }
            }

            public MediaSourceHandlerCallback() {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    MediaSource mediaSourceCreateMediaSource = MetadataRetrieverInternal.this.mediaSourceFactory.createMediaSource((C0226o0) message.obj);
                    this.mediaSource = mediaSourceCreateMediaSource;
                    mediaSourceCreateMediaSource.prepareSource(this.mediaSourceCaller, null, PlayerId.UNSET);
                    ((C1104b0) MetadataRetrieverInternal.this.mediaSourceHandler).m2384g(2);
                    return true;
                }
                if (i == 2) {
                    try {
                        MediaPeriod mediaPeriod = this.mediaPeriod;
                        if (mediaPeriod == null) {
                            MediaSource mediaSource = this.mediaSource;
                            mediaSource.getClass();
                            mediaSource.maybeThrowSourceInfoRefreshError();
                        } else {
                            mediaPeriod.maybeThrowPrepareError();
                        }
                        ((C1104b0) MetadataRetrieverInternal.this.mediaSourceHandler).f4715a.sendEmptyMessageDelayed(2, 100);
                        return true;
                    } catch (Exception e) {
                        MetadataRetrieverInternal.this.trackGroupsFuture.m3213k(e);
                        ((C1104b0) MetadataRetrieverInternal.this.mediaSourceHandler).m2379a(4).m2377b();
                        return true;
                    }
                }
                if (i == 3) {
                    MediaPeriod mediaPeriod2 = this.mediaPeriod;
                    mediaPeriod2.getClass();
                    mediaPeriod2.continueLoading(new LoadingInfo.Builder().setPlaybackPositionUs(0L).build());
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                if (this.mediaPeriod != null) {
                    MediaSource mediaSource2 = this.mediaSource;
                    mediaSource2.getClass();
                    mediaSource2.releasePeriod(this.mediaPeriod);
                }
                MediaSource mediaSource3 = this.mediaSource;
                mediaSource3.getClass();
                mediaSource3.releaseSource(this.mediaSourceCaller);
                ((C1104b0) MetadataRetrieverInternal.this.mediaSourceHandler).f4715a.removeCallbacksAndMessages(null);
                MetadataRetrieverInternal.SHARED_WORKER_THREAD.removeWorker();
                return true;
            }
        }

        public MetadataRetrieverInternal(MediaSource.Factory factory, C0226o0 c0226o0, InterfaceC1103b interfaceC1103b) {
            this.mediaSourceFactory = factory;
            this.mediaItem = c0226o0;
            this.mediaSourceHandler = ((C1135z) interfaceC1103b).m2541a(SHARED_WORKER_THREAD.addWorker(), new MediaSourceHandlerCallback());
        }

        public InterfaceFutureC1529s retrieveMetadata() {
            SHARED_WORKER_THREAD.startRetrieval(this);
            return this.trackGroupsFuture;
        }

        public void start() {
            ((C1104b0) this.mediaSourceHandler).m2381c(1, this.mediaItem).m2377b();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SharedWorkerThread {
        public static final AtomicInteger MAX_PARALLEL_RETRIEVALS = new AtomicInteger(5);
        private HandlerThread mediaSourceThread;
        private final Deque<MetadataRetrieverInternal> pendingRetrievals = new ArrayDeque();
        private int referenceCount;

        private void maybeStartNewRetrieval() {
            if (!this.pendingRetrievals.isEmpty() && this.referenceCount - this.pendingRetrievals.size() < MAX_PARALLEL_RETRIEVALS.get()) {
                this.pendingRetrievals.removeFirst().start();
            }
        }

        public synchronized Looper addWorker() {
            try {
                if (this.mediaSourceThread == null) {
                    AbstractC1101a.m2359j(this.referenceCount == 0);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
                    this.mediaSourceThread = handlerThread;
                    handlerThread.start();
                }
                this.referenceCount++;
            } catch (Throwable th) {
                throw th;
            }
            return this.mediaSourceThread.getLooper();
        }

        public synchronized void removeWorker() {
            try {
                int i = this.referenceCount - 1;
                this.referenceCount = i;
                if (i == 0) {
                    HandlerThread handlerThread = this.mediaSourceThread;
                    handlerThread.getClass();
                    handlerThread.quit();
                    this.mediaSourceThread = null;
                } else {
                    maybeStartNewRetrieval();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void startRetrieval(MetadataRetrieverInternal metadataRetrieverInternal) {
            this.pendingRetrievals.addLast(metadataRetrieverInternal);
            maybeStartNewRetrieval();
        }
    }

    private MetadataRetriever() {
    }

    public static InterfaceFutureC1529s retrieveMetadata(Context context, C0226o0 c0226o0) {
        return retrieveMetadata(context, c0226o0, InterfaceC1103b.f4713a);
    }

    public static void setMaximumParallelRetrievals(int i) {
        AbstractC1101a.m2353d(i >= 1);
        SharedWorkerThread.MAX_PARALLEL_RETRIEVALS.set(i);
    }

    public static InterfaceFutureC1529s retrieveMetadata(MediaSource.Factory factory, C0226o0 c0226o0) {
        return retrieveMetadata(factory, c0226o0, InterfaceC1103b.f4713a);
    }

    public static InterfaceFutureC1529s retrieveMetadata(Context context, C0226o0 c0226o0, InterfaceC1103b interfaceC1103b) {
        C1985l c1985l = new C1985l();
        synchronized (c1985l) {
            c1985l.f7366b = 6;
        }
        return retrieveMetadata(new DefaultMediaSourceFactory(context, c1985l), c0226o0, interfaceC1103b);
    }

    private static InterfaceFutureC1529s retrieveMetadata(MediaSource.Factory factory, C0226o0 c0226o0, InterfaceC1103b interfaceC1103b) {
        return new MetadataRetrieverInternal(factory, c0226o0, interfaceC1103b).retrieveMetadata();
    }
}
