package androidx.media3.exoplayer.video;

import androidx.media3.common.C0194d2;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;
import java.util.NoSuchElementException;
import p063h1.AbstractC1101a;
import p063h1.C1106c0;
import p063h1.C1126q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class VideoFrameRenderControl {
    private final FrameRenderer frameRenderer;
    private long lastPresentationTimeUs;
    private long outputStreamOffsetUs;
    private C0194d2 pendingOutputVideoSize;
    private final C1126q presentationTimestampsUs;
    private C0194d2 reportedVideoSize;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
    private final C1106c0 videoSizeChanges = new C1106c0();
    private final C1106c0 streamOffsets = new C1106c0();

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface FrameRenderer {
        void dropFrame();

        void onVideoSizeChanged(C0194d2 c0194d2);

        void renderFrame(long j, long j8, long j9, boolean z7);
    }

    public VideoFrameRenderControl(FrameRenderer frameRenderer, VideoFrameReleaseControl videoFrameReleaseControl) {
        this.frameRenderer = frameRenderer;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        C1126q c1126q = new C1126q();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        c1126q.f4780a = 0;
        c1126q.f4781b = -1;
        c1126q.f4782c = 0;
        c1126q.f4783d = new long[iHighestOneBit];
        c1126q.f4784e = iHighestOneBit - 1;
        this.presentationTimestampsUs = c1126q;
        this.reportedVideoSize = C0194d2.f1085d;
        this.lastPresentationTimeUs = -9223372036854775807L;
    }

    private void dropFrame() {
        this.presentationTimestampsUs.m2476a();
        this.frameRenderer.dropFrame();
    }

    private static <T> T getLastAndClear(C1106c0 c1106c0) {
        AbstractC1101a.m2353d(c1106c0.m2394h() > 0);
        while (c1106c0.m2394h() > 1) {
            c1106c0.m2391e();
        }
        T t8 = (T) c1106c0.m2391e();
        t8.getClass();
        return t8;
    }

    private boolean maybeUpdateOutputStreamOffset(long j) {
        Long l8 = (Long) this.streamOffsets.m2392f(j);
        if (l8 == null || l8.longValue() == this.outputStreamOffsetUs) {
            return false;
        }
        this.outputStreamOffsetUs = l8.longValue();
        return true;
    }

    private boolean maybeUpdateVideoSize(long j) {
        C0194d2 c0194d2 = (C0194d2) this.videoSizeChanges.m2392f(j);
        if (c0194d2 == null || c0194d2.equals(C0194d2.f1085d) || c0194d2.equals(this.reportedVideoSize)) {
            return false;
        }
        this.reportedVideoSize = c0194d2;
        return true;
    }

    private void renderFrame(boolean z7) {
        long jLongValue = Long.valueOf(this.presentationTimestampsUs.m2476a()).longValue();
        if (maybeUpdateVideoSize(jLongValue)) {
            this.frameRenderer.onVideoSizeChanged(this.reportedVideoSize);
        }
        this.frameRenderer.renderFrame(z7 ? -1L : this.videoFrameReleaseInfo.getReleaseTimeNs(), jLongValue, this.outputStreamOffsetUs, this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame());
    }

    public void flush() {
        C1126q c1126q = this.presentationTimestampsUs;
        c1126q.f4780a = 0;
        c1126q.f4781b = -1;
        c1126q.f4782c = 0;
        this.lastPresentationTimeUs = -9223372036854775807L;
        if (this.streamOffsets.m2394h() > 0) {
            Long l8 = (Long) getLastAndClear(this.streamOffsets);
            l8.longValue();
            this.streamOffsets.m2387a(l8, 0L);
        }
        if (this.pendingOutputVideoSize != null) {
            this.videoSizeChanges.m2388b();
        } else if (this.videoSizeChanges.m2394h() > 0) {
            this.pendingOutputVideoSize = (C0194d2) getLastAndClear(this.videoSizeChanges);
        }
    }

    public boolean hasReleasedFrame(long j) {
        long j8 = this.lastPresentationTimeUs;
        return j8 != -9223372036854775807L && j8 >= j;
    }

    public void onOutputFrameAvailableForRendering(long j) {
        C0194d2 c0194d2 = this.pendingOutputVideoSize;
        if (c0194d2 != null) {
            this.videoSizeChanges.m2387a(c0194d2, j);
            this.pendingOutputVideoSize = null;
        }
        C1126q c1126q = this.presentationTimestampsUs;
        int i = c1126q.f4782c;
        long[] jArr = c1126q.f4783d;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i4 = c1126q.f4780a;
            int i8 = length2 - i4;
            System.arraycopy(jArr, i4, jArr2, 0, i8);
            System.arraycopy(c1126q.f4783d, 0, jArr2, i8, i4);
            c1126q.f4780a = 0;
            c1126q.f4781b = c1126q.f4782c - 1;
            c1126q.f4783d = jArr2;
            c1126q.f4784e = length - 1;
        }
        int i9 = (c1126q.f4781b + 1) & c1126q.f4784e;
        c1126q.f4781b = i9;
        c1126q.f4783d[i9] = j;
        c1126q.f4782c++;
    }

    public void onOutputSizeChanged(int i, int i4) {
        this.pendingOutputVideoSize = new C0194d2(i, i4);
    }

    public void onStreamOffsetChange(long j, long j8) {
        this.streamOffsets.m2387a(Long.valueOf(j8), j);
    }

    public void render(long j, long j8) {
        while (true) {
            C1126q c1126q = this.presentationTimestampsUs;
            int i = c1126q.f4782c;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            long j9 = c1126q.f4783d[c1126q.f4780a];
            if (maybeUpdateOutputStreamOffset(j9)) {
                this.videoFrameReleaseControl.onProcessedStreamChange();
            }
            int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(j9, j, j8, this.outputStreamOffsetUs, false, this.videoFrameReleaseInfo);
            if (frameReleaseAction == 0 || frameReleaseAction == 1) {
                this.lastPresentationTimeUs = j9;
                renderFrame(frameReleaseAction == 0);
            } else if (frameReleaseAction != 2 && frameReleaseAction != 3 && frameReleaseAction != 4) {
                if (frameReleaseAction != 5) {
                    throw new IllegalStateException(String.valueOf(frameReleaseAction));
                }
                return;
            } else {
                this.lastPresentationTimeUs = j9;
                dropFrame();
            }
        }
    }
}
