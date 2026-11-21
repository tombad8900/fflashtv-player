package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0243u;
import androidx.media3.exoplayer.audio.RunnableC0317f;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import p043e6.InterfaceC0921i;
import p063h1.AbstractC1118i0;
import p063h1.C1124o;
import p063h1.C1125p;
import p063h1.InterfaceC1103b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class BasePreloadManager<T> {
    private final Handler applicationHandler;
    private final C1125p listeners;
    private final Object lock = new Object();
    private final Map<C0226o0, BasePreloadManager<T>.MediaSourceHolder> mediaItemMediaSourceHolderMap;
    private final MediaSource.Factory mediaSourceFactory;
    protected final Comparator<T> rankingDataComparator;
    private final PriorityQueue<BasePreloadManager<T>.MediaSourceHolder> sourceHolderPriorityQueue;
    private final TargetPreloadStatusControl<T> targetPreloadStatusControl;
    private TargetPreloadStatusControl.PreloadStatus targetPreloadStatusOfCurrentPreloadingSource;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static abstract class BuilderBase<T> {
        protected InterfaceC0921i mediaSourceFactorySupplier;
        protected final Comparator<T> rankingDataComparator;
        protected final TargetPreloadStatusControl<T> targetPreloadStatusControl;

        public BuilderBase(Comparator<T> comparator, TargetPreloadStatusControl<T> targetPreloadStatusControl, InterfaceC0921i interfaceC0921i) {
            this.rankingDataComparator = comparator;
            this.targetPreloadStatusControl = targetPreloadStatusControl;
            this.mediaSourceFactorySupplier = interfaceC0921i;
        }

        public abstract BasePreloadManager<T> build();
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Listener {
        void onCompleted(C0226o0 c0226o0);

        void onError(PreloadException preloadException);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class MediaSourceHolder implements Comparable<BasePreloadManager<T>.MediaSourceHolder> {
        public final MediaSource mediaSource;
        public final T rankingData;
        public final long startPositionUs;

        public MediaSourceHolder(BasePreloadManager basePreloadManager, MediaSource mediaSource, T t8) {
            this(mediaSource, t8, -9223372036854775807L);
        }

        public MediaSourceHolder(MediaSource mediaSource, T t8, long j) {
            this.mediaSource = mediaSource;
            this.rankingData = t8;
            this.startPositionUs = j;
        }

        @Override // java.lang.Comparable
        public int compareTo(BasePreloadManager<T>.MediaSourceHolder mediaSourceHolder) {
            return BasePreloadManager.this.rankingDataComparator.compare(this.rankingData, mediaSourceHolder.rankingData);
        }
    }

    public BasePreloadManager(Comparator<T> comparator, TargetPreloadStatusControl<T> targetPreloadStatusControl, MediaSource.Factory factory) {
        Handler handlerM2458q = AbstractC1118i0.m2458q(null);
        this.applicationHandler = handlerM2458q;
        this.rankingDataComparator = comparator;
        this.targetPreloadStatusControl = targetPreloadStatusControl;
        this.mediaSourceFactory = factory;
        this.listeners = new C1125p(handlerM2458q.getLooper(), InterfaceC1103b.f4713a, new C0458c());
        this.mediaItemMediaSourceHolderMap = new HashMap();
        this.sourceHolderPriorityQueue = new PriorityQueue<>();
    }

    private boolean isPreloading(MediaSource mediaSource) {
        if (this.sourceHolderPriorityQueue.isEmpty()) {
            return false;
        }
        BasePreloadManager<T>.MediaSourceHolder mediaSourceHolderPeek = this.sourceHolderPriorityQueue.peek();
        mediaSourceHolderPeek.getClass();
        return mediaSourceHolderPeek.mediaSource == mediaSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Listener listener, C0243u c0243u) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPreloadCompleted$1(MediaSource mediaSource, Listener listener) {
        listener.onCompleted(mediaSource.getMediaItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPreloadCompleted$2(MediaSource mediaSource) {
        this.listeners.m2474f(-1, new C0456a(0, mediaSource));
        lambda$onPreloadSkipped$5(mediaSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPreloadError$4(PreloadException preloadException, MediaSource mediaSource) {
        this.listeners.m2474f(-1, new C0456a(1, preloadException));
        lambda$onPreloadSkipped$5(mediaSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: maybeAdvanceToNextSource, reason: merged with bridge method [inline-methods] */
    public void lambda$onPreloadSkipped$5(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    do {
                        this.sourceHolderPriorityQueue.poll();
                        if (this.sourceHolderPriorityQueue.isEmpty()) {
                            break;
                        }
                    } while (!maybeStartPreloadNextSource());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean maybeStartPreloadNextSource() {
        if (!shouldStartPreloadingNextSource()) {
            return false;
        }
        BasePreloadManager<T>.MediaSourceHolder mediaSourceHolderPeek = this.sourceHolderPriorityQueue.peek();
        mediaSourceHolderPeek.getClass();
        TargetPreloadStatusControl.PreloadStatus targetPreloadStatus = this.targetPreloadStatusControl.getTargetPreloadStatus(mediaSourceHolderPeek.rankingData);
        this.targetPreloadStatusOfCurrentPreloadingSource = targetPreloadStatus;
        if (targetPreloadStatus != null) {
            preloadSourceInternal(mediaSourceHolderPeek.mediaSource, mediaSourceHolderPeek.startPositionUs);
            return true;
        }
        clearSourceInternal(mediaSourceHolderPeek.mediaSource);
        return false;
    }

    private void verifyApplicationThread() {
        if (Looper.myLooper() != this.applicationHandler.getLooper()) {
            throw new IllegalStateException("Preload manager is accessed on the wrong thread.");
        }
    }

    public final void add(C0226o0 c0226o0, T t8) {
        add(this.mediaSourceFactory.createMediaSource(c0226o0), (MediaSource) t8);
    }

    public void addListener(Listener listener) {
        this.listeners.m2469a(listener);
    }

    public void clearListeners() {
        verifyApplicationThread();
        C1125p c1125p = this.listeners;
        c1125p.m2475g();
        CopyOnWriteArraySet copyOnWriteArraySet = c1125p.f4774d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C1124o) it.next()).m2468a(c1125p.f4773c);
        }
        copyOnWriteArraySet.clear();
    }

    public abstract void clearSourceInternal(MediaSource mediaSource);

    public MediaSource createMediaSourceForPreloading(MediaSource mediaSource) {
        return mediaSource;
    }

    public final MediaSource getMediaSource(C0226o0 c0226o0) {
        if (this.mediaItemMediaSourceHolderMap.containsKey(c0226o0)) {
            return this.mediaItemMediaSourceHolderMap.get(c0226o0).mediaSource;
        }
        return null;
    }

    public final int getSourceCount() {
        return this.mediaItemMediaSourceHolderMap.size();
    }

    public final TargetPreloadStatusControl.PreloadStatus getTargetPreloadStatus(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (!isPreloading(mediaSource)) {
                    return null;
                }
                return this.targetPreloadStatusOfCurrentPreloadingSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            try {
                this.sourceHolderPriorityQueue.clear();
                this.sourceHolderPriorityQueue.addAll(this.mediaItemMediaSourceHolderMap.values());
                while (!this.sourceHolderPriorityQueue.isEmpty() && !maybeStartPreloadNextSource()) {
                    this.sourceHolderPriorityQueue.poll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onPreloadCompleted(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new RunnableC0457b(this, mediaSource, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onPreloadError(PreloadException preloadException, MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new RunnableC0317f(this, preloadException, mediaSource, 2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onPreloadSkipped(MediaSource mediaSource) {
        synchronized (this.lock) {
            try {
                if (isPreloading(mediaSource)) {
                    this.applicationHandler.post(new RunnableC0457b(this, mediaSource, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void preloadSourceInternal(MediaSource mediaSource, long j);

    public final void release() {
        reset();
        releaseInternal();
        clearListeners();
    }

    public void releaseInternal() {
    }

    public abstract void releaseSourceInternal(MediaSource mediaSource);

    public final boolean remove(C0226o0 c0226o0) {
        if (!this.mediaItemMediaSourceHolderMap.containsKey(c0226o0)) {
            return false;
        }
        MediaSource mediaSource = this.mediaItemMediaSourceHolderMap.get(c0226o0).mediaSource;
        this.mediaItemMediaSourceHolderMap.remove(c0226o0);
        releaseSourceInternal(mediaSource);
        return true;
    }

    public void removeListener(Listener listener) {
        verifyApplicationThread();
        this.listeners.m2473e(listener);
    }

    public final void reset() {
        Iterator<BasePreloadManager<T>.MediaSourceHolder> it = this.mediaItemMediaSourceHolderMap.values().iterator();
        while (it.hasNext()) {
            releaseSourceInternal(it.next().mediaSource);
        }
        this.mediaItemMediaSourceHolderMap.clear();
        synchronized (this.lock) {
            this.sourceHolderPriorityQueue.clear();
            this.targetPreloadStatusOfCurrentPreloadingSource = null;
        }
    }

    public boolean shouldStartPreloadingNextSource() {
        return true;
    }

    public final void add(MediaSource mediaSource, T t8) {
        MediaSource mediaSourceCreateMediaSourceForPreloading = createMediaSourceForPreloading(mediaSource);
        this.mediaItemMediaSourceHolderMap.put(mediaSourceCreateMediaSourceForPreloading.getMediaItem(), new MediaSourceHolder(this, mediaSourceCreateMediaSourceForPreloading, t8));
    }

    public final boolean remove(MediaSource mediaSource) {
        C0226o0 mediaItem = mediaSource.getMediaItem();
        if (!this.mediaItemMediaSourceHolderMap.containsKey(mediaItem) || mediaSource != this.mediaItemMediaSourceHolderMap.get(mediaItem).mediaSource) {
            return false;
        }
        this.mediaItemMediaSourceHolderMap.remove(mediaItem);
        releaseSourceInternal(mediaSource);
        return true;
    }
}
