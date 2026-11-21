package androidx.media3.exoplayer.source;

import android.os.Looper;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.Objects;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p106m1.C1872g;
import p115n1.C1978h0;
import p115n1.InterfaceC1980i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class SampleQueue implements InterfaceC1980i0 {
    static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private static final String TAG = "SampleQueue";
    private int absoluteFirstIndex;
    private DrmSession currentDrmSession;
    private C0249w downstreamFormat;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private boolean isLastSampleQueued;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private boolean pendingSplice;
    private int readPosition;
    private int relativeFirstIndex;
    private final SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;
    private C0249w unadjustedUpstreamFormat;
    private C0249w upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private long upstreamSourceId;
    private final SampleExtrasHolder extrasHolder = new SampleExtrasHolder();
    private int capacity = 1000;
    private long[] sourceIds = new long[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private C1978h0[] cryptoDatas = new C1978h0[1000];
    private final SpannedData<SharedSampleMetadata> sharedSampleMetadata = new SpannedData<>(new C0448j(1));
    private long startTimeUs = Long.MIN_VALUE;
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;
    private boolean allSamplesAreSyncSamples = true;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SampleExtrasHolder {
        public C1978h0 cryptoData;
        public long offset;
        public int size;
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SharedSampleMetadata {
        public final DrmSessionManager.DrmSessionReference drmSessionReference;
        public final C0249w format;

        private SharedSampleMetadata(C0249w c0249w, DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.format = c0249w;
            this.drmSessionReference = drmSessionReference;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(C0249w c0249w);
    }

    public SampleQueue(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.sampleDataQueue = new SampleDataQueue(allocator);
    }

    private synchronized boolean attemptSplice(long j) {
        if (this.length == 0) {
            return j > this.largestDiscardedTimestampUs;
        }
        if (getLargestReadTimestampUs() >= j) {
            return false;
        }
        discardUpstreamSampleMetadata(this.absoluteFirstIndex + countUnreadSamplesBefore(j));
        return true;
    }

    private synchronized void commitSample(long j, int i, long j8, int i4, C1978h0 c1978h0) {
        try {
            int i8 = this.length;
            if (i8 > 0) {
                int relativeIndex = getRelativeIndex(i8 - 1);
                AbstractC1101a.m2353d(this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]) <= j8);
            }
            this.isLastSampleQueued = (536870912 & i) != 0;
            this.largestQueuedTimestampUs = Math.max(this.largestQueuedTimestampUs, j);
            int relativeIndex2 = getRelativeIndex(this.length);
            this.timesUs[relativeIndex2] = j;
            this.offsets[relativeIndex2] = j8;
            this.sizes[relativeIndex2] = i4;
            this.flags[relativeIndex2] = i;
            this.cryptoDatas[relativeIndex2] = c1978h0;
            this.sourceIds[relativeIndex2] = this.upstreamSourceId;
            if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(this.upstreamFormat)) {
                C0249w c0249w = this.upstreamFormat;
                c0249w.getClass();
                DrmSessionManager drmSessionManager = this.drmSessionManager;
                this.sharedSampleMetadata.appendSpan(getWriteIndex(), new SharedSampleMetadata(c0249w, drmSessionManager != null ? drmSessionManager.preacquireSession(this.drmEventDispatcher, c0249w) : DrmSessionManager.DrmSessionReference.EMPTY));
            }
            int i9 = this.length + 1;
            this.length = i9;
            int i10 = this.capacity;
            if (i9 == i10) {
                int i11 = i10 + 1000;
                long[] jArr = new long[i11];
                long[] jArr2 = new long[i11];
                long[] jArr3 = new long[i11];
                int[] iArr = new int[i11];
                int[] iArr2 = new int[i11];
                C1978h0[] c1978h0Arr = new C1978h0[i11];
                int i12 = this.relativeFirstIndex;
                int i13 = i10 - i12;
                System.arraycopy(this.offsets, i12, jArr2, 0, i13);
                System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr3, 0, i13);
                System.arraycopy(this.flags, this.relativeFirstIndex, iArr, 0, i13);
                System.arraycopy(this.sizes, this.relativeFirstIndex, iArr2, 0, i13);
                System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, c1978h0Arr, 0, i13);
                System.arraycopy(this.sourceIds, this.relativeFirstIndex, jArr, 0, i13);
                int i14 = this.relativeFirstIndex;
                System.arraycopy(this.offsets, 0, jArr2, i13, i14);
                System.arraycopy(this.timesUs, 0, jArr3, i13, i14);
                System.arraycopy(this.flags, 0, iArr, i13, i14);
                System.arraycopy(this.sizes, 0, iArr2, i13, i14);
                System.arraycopy(this.cryptoDatas, 0, c1978h0Arr, i13, i14);
                System.arraycopy(this.sourceIds, 0, jArr, i13, i14);
                this.offsets = jArr2;
                this.timesUs = jArr3;
                this.flags = iArr;
                this.sizes = iArr2;
                this.cryptoDatas = c1978h0Arr;
                this.sourceIds = jArr;
                this.relativeFirstIndex = 0;
                this.capacity = i11;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private int countUnreadSamplesBefore(long j) {
        int i = this.length;
        int relativeIndex = getRelativeIndex(i - 1);
        while (i > this.readPosition && this.timesUs[relativeIndex] >= j) {
            i--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return i;
    }

    public static SampleQueue createWithDrm(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSessionManager.getClass();
        eventDispatcher.getClass();
        return new SampleQueue(allocator, drmSessionManager, eventDispatcher);
    }

    public static SampleQueue createWithoutDrm(Allocator allocator) {
        return new SampleQueue(allocator, null, null);
    }

    private synchronized long discardSampleMetadataTo(long j, boolean z7, boolean z8) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.length;
                if (i != 0) {
                    long[] jArr = this.timesUs;
                    int i4 = this.relativeFirstIndex;
                    if (j >= jArr[i4]) {
                        if (z8) {
                            try {
                                int i8 = this.readPosition;
                                if (i8 != i) {
                                    i = i8 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iFindSampleBefore = findSampleBefore(i4, i, j, z7);
                        if (iFindSampleBefore == -1) {
                            return -1L;
                        }
                        return discardSamples(iFindSampleBefore);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    private synchronized long discardSampleMetadataToEnd() {
        int i = this.length;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    private long discardSamples(int i) {
        this.largestDiscardedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i));
        this.length -= i;
        int i4 = this.absoluteFirstIndex + i;
        this.absoluteFirstIndex = i4;
        int i8 = this.relativeFirstIndex + i;
        this.relativeFirstIndex = i8;
        int i9 = this.capacity;
        if (i8 >= i9) {
            this.relativeFirstIndex = i8 - i9;
        }
        int i10 = this.readPosition - i;
        this.readPosition = i10;
        if (i10 < 0) {
            this.readPosition = 0;
        }
        this.sharedSampleMetadata.discardTo(i4);
        if (this.length != 0) {
            return this.offsets[this.relativeFirstIndex];
        }
        int i11 = this.relativeFirstIndex;
        if (i11 == 0) {
            i11 = this.capacity;
        }
        return this.offsets[i11 - 1] + this.sizes[r6];
    }

    private long discardUpstreamSampleMetadata(int i) {
        int writeIndex = getWriteIndex() - i;
        boolean z7 = false;
        AbstractC1101a.m2353d(writeIndex >= 0 && writeIndex <= this.length - this.readPosition);
        int i4 = this.length - writeIndex;
        this.length = i4;
        this.largestQueuedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i4));
        if (writeIndex == 0 && this.isLastSampleQueued) {
            z7 = true;
        }
        this.isLastSampleQueued = z7;
        this.sharedSampleMetadata.discardFrom(i);
        int i8 = this.length;
        if (i8 == 0) {
            return 0L;
        }
        return this.offsets[getRelativeIndex(i8 - 1)] + this.sizes[r9];
    }

    private int findSampleAfter(int i, int i4, long j, boolean z7) {
        for (int i8 = 0; i8 < i4; i8++) {
            if (this.timesUs[i] >= j) {
                return i8;
            }
            i++;
            if (i == this.capacity) {
                i = 0;
            }
        }
        if (z7) {
            return i4;
        }
        return -1;
    }

    private int findSampleBefore(int i, int i4, long j, boolean z7) {
        int i8 = -1;
        for (int i9 = 0; i9 < i4; i9++) {
            long j8 = this.timesUs[i];
            if (j8 > j) {
                break;
            }
            if (!z7 || (this.flags[i] & 1) != 0) {
                if (j8 == j) {
                    return i9;
                }
                i8 = i9;
            }
            i++;
            if (i == this.capacity) {
                i = 0;
            }
        }
        return i8;
    }

    private long getLargestTimestamp(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i - 1);
        for (int i4 = 0; i4 < i; i4++) {
            jMax = Math.max(jMax, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                return jMax;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return jMax;
    }

    private int getRelativeIndex(int i) {
        int i4 = this.relativeFirstIndex + i;
        int i8 = this.capacity;
        return i4 < i8 ? i4 : i4 - i8;
    }

    private boolean hasNextSample() {
        return this.readPosition != this.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(SharedSampleMetadata sharedSampleMetadata) {
        sharedSampleMetadata.drmSessionReference.release();
    }

    private boolean mayReadSample(int i) {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.flags[i] & 1073741824) == 0 && this.currentDrmSession.playClearSamplesWithoutKeys();
    }

    private void onFormatResult(C0249w c0249w, FormatHolder formatHolder) {
        C0249w c0249w2;
        C0249w c0249w3 = this.downstreamFormat;
        boolean z7 = c0249w3 == null;
        C0237s c0237s = c0249w3 == null ? null : c0249w3.f1526r;
        this.downstreamFormat = c0249w;
        C0237s c0237s2 = c0249w.f1526r;
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        if (drmSessionManager != null) {
            int cryptoType = drmSessionManager.getCryptoType(c0249w);
            C0246v c0246vM692a = c0249w.m692a();
            c0246vM692a.f1434K = cryptoType;
            c0249w2 = new C0249w(c0246vM692a);
        } else {
            c0249w2 = c0249w;
        }
        formatHolder.format = c0249w2;
        formatHolder.drmSession = this.currentDrmSession;
        if (this.drmSessionManager == null) {
            return;
        }
        if (z7 || !Objects.equals(c0237s, c0237s2)) {
            DrmSession drmSession = this.currentDrmSession;
            DrmSession drmSessionAcquireSession = this.drmSessionManager.acquireSession(this.drmEventDispatcher, c0249w);
            this.currentDrmSession = drmSessionAcquireSession;
            formatHolder.drmSession = drmSessionAcquireSession;
            if (drmSession != null) {
                drmSession.release(this.drmEventDispatcher);
            }
        }
    }

    private synchronized int peekSampleMetadata(FormatHolder formatHolder, C1872g c1872g, boolean z7, boolean z8, SampleExtrasHolder sampleExtrasHolder) {
        try {
            c1872g.waitingForKeys = false;
            if (!hasNextSample()) {
                if (!z8 && !this.isLastSampleQueued) {
                    C0249w c0249w = this.upstreamFormat;
                    if (c0249w == null || (!z7 && c0249w == this.downstreamFormat)) {
                        return -3;
                    }
                    c0249w.getClass();
                    onFormatResult(c0249w, formatHolder);
                    return -5;
                }
                c1872g.setFlags(4);
                c1872g.timeUs = Long.MIN_VALUE;
                return -4;
            }
            C0249w c0249w2 = this.sharedSampleMetadata.get(getReadIndex()).format;
            if (!z7 && c0249w2 == this.downstreamFormat) {
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!mayReadSample(relativeIndex)) {
                    c1872g.waitingForKeys = true;
                    return -3;
                }
                c1872g.setFlags(this.flags[relativeIndex]);
                if (this.readPosition == this.length - 1 && (z8 || this.isLastSampleQueued)) {
                    c1872g.addFlag(536870912);
                }
                c1872g.timeUs = this.timesUs[relativeIndex];
                sampleExtrasHolder.size = this.sizes[relativeIndex];
                sampleExtrasHolder.offset = this.offsets[relativeIndex];
                sampleExtrasHolder.cryptoData = this.cryptoDatas[relativeIndex];
                return -4;
            }
            onFormatResult(c0249w2, formatHolder);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void releaseDrmSessionReferences() {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null) {
            drmSession.release(this.drmEventDispatcher);
            this.currentDrmSession = null;
            this.downstreamFormat = null;
        }
    }

    private synchronized void rewind() {
        this.readPosition = 0;
        this.sampleDataQueue.rewind();
    }

    private synchronized boolean setUpstreamFormat(C0249w c0249w) {
        try {
            this.upstreamFormatRequired = false;
            C0249w c0249w2 = this.upstreamFormat;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(c0249w, c0249w2)) {
                return false;
            }
            if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(c0249w)) {
                this.upstreamFormat = c0249w;
            } else {
                this.upstreamFormat = this.sharedSampleMetadata.getEndValue().format;
            }
            boolean z7 = this.allSamplesAreSyncSamples;
            C0249w c0249w3 = this.upstreamFormat;
            this.allSamplesAreSyncSamples = z7 & AbstractC0244u0.m672a(c0249w3.f1522n, c0249w3.f1519k);
            this.loggedUnexpectedNonSyncSample = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long discardSampleMetadataToRead() {
        int i = this.readPosition;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    public final void discardTo(long j, boolean z7, boolean z8) {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataTo(j, z7, z8));
    }

    public final void discardToEnd() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToEnd());
    }

    public final void discardToRead() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j) {
        if (this.length == 0) {
            return;
        }
        AbstractC1101a.m2353d(j > getLargestReadTimestampUs());
        discardUpstreamSamples(this.absoluteFirstIndex + countUnreadSamplesBefore(j));
    }

    public final void discardUpstreamSamples(int i) {
        this.sampleDataQueue.discardUpstreamSampleBytes(discardUpstreamSampleMetadata(i));
    }

    @Override // p115n1.InterfaceC1980i0
    public final void format(C0249w c0249w) {
        C0249w adjustedUpstreamFormat = getAdjustedUpstreamFormat(c0249w);
        this.upstreamFormatAdjustmentRequired = false;
        this.unadjustedUpstreamFormat = c0249w;
        boolean upstreamFormat = setUpstreamFormat(adjustedUpstreamFormat);
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener == null || !upstreamFormat) {
            return;
        }
        upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    public C0249w getAdjustedUpstreamFormat(C0249w c0249w) {
        if (this.sampleOffsetUs == 0 || c0249w.f1527s == Long.MAX_VALUE) {
            return c0249w;
        }
        C0246v c0246vM692a = c0249w.m692a();
        c0246vM692a.f1452r = c0249w.f1527s + this.sampleOffsetUs;
        return new C0249w(c0246vM692a);
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.length == 0 ? Long.MIN_VALUE : this.timesUs[this.relativeFirstIndex];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition));
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final synchronized int getSkipCount(long j, boolean z7) {
        Throwable th;
        try {
            try {
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!hasNextSample() || j < this.timesUs[relativeIndex]) {
                    return 0;
                }
                if (j <= this.largestQueuedTimestampUs || !z7) {
                    int iFindSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j, true);
                    if (iFindSampleBefore == -1) {
                        return 0;
                    }
                    return iFindSampleBefore;
                }
                try {
                    return this.length - this.readPosition;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized C0249w getUpstreamFormat() {
        return this.upstreamFormatRequired ? null : this.upstreamFormat;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    public final void invalidateUpstreamFormatAdjustment() {
        this.upstreamFormatAdjustmentRequired = true;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.isLastSampleQueued;
    }

    public synchronized boolean isReady(boolean z7) {
        C0249w c0249w;
        boolean z8 = true;
        if (hasNextSample()) {
            if (this.sharedSampleMetadata.get(getReadIndex()).format != this.downstreamFormat) {
                return true;
            }
            return mayReadSample(getRelativeIndex(this.readPosition));
        }
        if (!z7 && !this.isLastSampleQueued && ((c0249w = this.upstreamFormat) == null || c0249w == this.downstreamFormat)) {
            z8 = false;
        }
        return z8;
    }

    public void maybeThrowError() {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession == null || drmSession.getState() != 1) {
            return;
        }
        DrmSession.DrmSessionException error = this.currentDrmSession.getError();
        error.getClass();
        throw error;
    }

    public final synchronized long peekSourceId() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return hasNextSample() ? this.sourceIds[getRelativeIndex(this.readPosition)] : this.upstreamSourceId;
    }

    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    public int read(FormatHolder formatHolder, C1872g c1872g, int i, boolean z7) {
        int iPeekSampleMetadata = peekSampleMetadata(formatHolder, c1872g, (i & 2) != 0, z7, this.extrasHolder);
        if (iPeekSampleMetadata == -4 && !c1872g.isEndOfStream()) {
            boolean z8 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z8) {
                    this.sampleDataQueue.peekToBuffer(c1872g, this.extrasHolder);
                } else {
                    this.sampleDataQueue.readToBuffer(c1872g, this.extrasHolder);
                }
            }
            if (!z8) {
                this.readPosition++;
            }
        }
        return iPeekSampleMetadata;
    }

    public void release() {
        reset(true);
        releaseDrmSessionReferences();
    }

    public final void reset() {
        reset(false);
    }

    @Override // p115n1.InterfaceC1980i0
    public int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7) {
        return sampleData(interfaceC0219m, i, z7, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    @Override // p115n1.InterfaceC1980i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sampleMetadata(long j, int i, int i4, int i8, C1978h0 c1978h0) {
        int i9;
        if (this.upstreamFormatAdjustmentRequired) {
            C0249w c0249w = this.unadjustedUpstreamFormat;
            AbstractC1101a.m2360k(c0249w);
            format(c0249w);
        }
        int i10 = i & 1;
        boolean z7 = i10 != 0;
        if (this.upstreamKeyframeRequired) {
            if (!z7) {
                return;
            } else {
                this.upstreamKeyframeRequired = false;
            }
        }
        long j8 = this.sampleOffsetUs + j;
        if (!this.allSamplesAreSyncSamples) {
            i9 = i;
        } else {
            if (j8 < this.startTimeUs) {
                return;
            }
            if (i10 == 0) {
                if (!this.loggedUnexpectedNonSyncSample) {
                    AbstractC1101a.m2348F(TAG, "Overriding unexpected non-sync sample for format: " + this.upstreamFormat);
                    this.loggedUnexpectedNonSyncSample = true;
                }
                i9 = i | 1;
            }
        }
        if (this.pendingSplice) {
            if (!z7 || !attemptSplice(j8)) {
                return;
            } else {
                this.pendingSplice = false;
            }
        }
        commitSample(j8, i9, (this.sampleDataQueue.getTotalBytesWritten() - i4) - i8, i4, c1978h0);
    }

    public final synchronized boolean seekTo(int i) {
        rewind();
        int i4 = this.absoluteFirstIndex;
        if (i >= i4 && i <= this.length + i4) {
            this.startTimeUs = Long.MIN_VALUE;
            this.readPosition = i - i4;
            return true;
        }
        return false;
    }

    public final void setSampleOffsetUs(long j) {
        if (this.sampleOffsetUs != j) {
            this.sampleOffsetUs = j;
            invalidateUpstreamFormatAdjustment();
        }
    }

    public final void setStartTimeUs(long j) {
        this.startTimeUs = j;
    }

    public final void setUpstreamFormatChangeListener(UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void skip(int i) {
        boolean z7;
        if (i >= 0) {
            try {
                z7 = this.readPosition + i <= this.length;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC1101a.m2353d(z7);
        this.readPosition += i;
    }

    public final void sourceId(long j) {
        this.upstreamSourceId = j;
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    public void reset(boolean z7) {
        this.sampleDataQueue.reset();
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.upstreamKeyframeRequired = true;
        this.startTimeUs = Long.MIN_VALUE;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        this.isLastSampleQueued = false;
        this.sharedSampleMetadata.clear();
        if (z7) {
            this.unadjustedUpstreamFormat = null;
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
            this.allSamplesAreSyncSamples = true;
        }
    }

    @Override // p115n1.InterfaceC1980i0
    public void sampleData(C1132w c1132w, int i) {
        sampleData(c1132w, i, 0);
    }

    @Override // p115n1.InterfaceC1980i0
    public final int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7, int i4) {
        return this.sampleDataQueue.sampleData(interfaceC0219m, i, z7);
    }

    @Override // p115n1.InterfaceC1980i0
    public final void sampleData(C1132w c1132w, int i, int i4) {
        this.sampleDataQueue.sampleData(c1132w, i);
    }

    @Deprecated
    public static SampleQueue createWithDrm(Allocator allocator, Looper looper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSessionManager.setPlayer(looper, PlayerId.UNSET);
        eventDispatcher.getClass();
        return new SampleQueue(allocator, drmSessionManager, eventDispatcher);
    }

    public final synchronized boolean seekTo(long j, boolean z7) throws Throwable {
        SampleQueue sampleQueue;
        long j8;
        int iFindSampleBefore;
        try {
            try {
                rewind();
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!hasNextSample() || j < this.timesUs[relativeIndex] || (j > this.largestQueuedTimestampUs && !z7)) {
                    return false;
                }
                if (this.allSamplesAreSyncSamples) {
                    sampleQueue = this;
                    j8 = j;
                    iFindSampleBefore = sampleQueue.findSampleAfter(relativeIndex, this.length - this.readPosition, j8, z7);
                } else {
                    sampleQueue = this;
                    j8 = j;
                    iFindSampleBefore = sampleQueue.findSampleBefore(relativeIndex, sampleQueue.length - sampleQueue.readPosition, j8, true);
                }
                if (iFindSampleBefore == -1) {
                    return false;
                }
                sampleQueue.startTimeUs = j8;
                sampleQueue.readPosition += iFindSampleBefore;
                return true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
