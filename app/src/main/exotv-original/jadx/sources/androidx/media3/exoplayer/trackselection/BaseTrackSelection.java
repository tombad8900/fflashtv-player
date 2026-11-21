package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import java.util.Arrays;
import java.util.List;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final C0249w[] formats;
    protected final C0233q1 group;
    private int hashCode;
    protected final int length;
    private boolean playWhenReady;
    protected final int[] tracks;
    private final int type;

    public BaseTrackSelection(C0233q1 c0233q1, int... iArr) {
        this(c0233q1, iArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(C0249w c0249w, C0249w c0249w2) {
        return c0249w2.f1518j - c0249w.f1518j;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
            if (this.group.equals(baseTrackSelection.group) && Arrays.equals(this.tracks, baseTrackSelection.tracks)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean excludeTrack(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsTrackExcluded = isTrackExcluded(i, jElapsedRealtime);
        int i4 = 0;
        while (i4 < this.length && !zIsTrackExcluded) {
            zIsTrackExcluded = (i4 == i || isTrackExcluded(i4, jElapsedRealtime)) ? false : true;
            i4++;
        }
        if (!zIsTrackExcluded) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        long j8 = jArr[i];
        int i8 = AbstractC1118i0.f4750a;
        long j9 = jElapsedRealtime + j;
        if (((j ^ j9) & (jElapsedRealtime ^ j9)) < 0) {
            j9 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j8, j9);
        return true;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final C0249w getFormat(int i) {
        return this.formats[i];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i) {
        return this.tracks[i];
    }

    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final C0249w getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final C0233q1 getTrackGroup() {
        return this.group;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.tracks) + (System.identityHashCode(this.group) * 31);
        }
        return this.hashCode;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(C0249w c0249w) {
        for (int i = 0; i < this.length; i++) {
            if (this.formats[i] == c0249w) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public boolean isTrackExcluded(int i, long j) {
        return this.excludeUntilTimes[i] > j;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlayWhenReadyChanged(boolean z7) {
        this.playWhenReady = z7;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f8) {
    }

    public BaseTrackSelection(C0233q1 c0233q1, int[] iArr, int i) {
        AbstractC1101a.m2359j(iArr.length > 0);
        this.type = i;
        c0233q1.getClass();
        this.group = c0233q1;
        int length = iArr.length;
        this.length = length;
        this.formats = new C0249w[length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.formats[i4] = c0233q1.f1322d[iArr[i4]];
        }
        Arrays.sort(this.formats, new C0471b(6));
        this.tracks = new int[this.length];
        int i8 = 0;
        while (true) {
            int i9 = this.length;
            if (i8 >= i9) {
                this.excludeUntilTimes = new long[i9];
                this.playWhenReady = false;
                return;
            } else {
                this.tracks[i8] = c0233q1.m663b(this.formats[i8]);
                i8++;
            }
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int indexOf(int i) {
        for (int i4 = 0; i4 < this.length; i4++) {
            if (this.tracks[i4] == i) {
                return i4;
            }
        }
        return -1;
    }
}
