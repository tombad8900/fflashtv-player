package androidx.media3.exoplayer.video;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.video.VideoSink;
import java.util.List;
import java.util.concurrent.Executor;
import p063h1.C1134y;
import p063h1.InterfaceC1110e0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class DefaultVideoSink implements VideoSink {
    private C0249w inputFormat = new C0249w(new C0246v());
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameRenderControl videoFrameRenderControl;

    public DefaultVideoSink(VideoFrameReleaseControl videoFrameReleaseControl, VideoFrameRenderControl videoFrameRenderControl) {
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        this.videoFrameRenderControl = videoFrameRenderControl;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void clearOutputSurfaceInfo() {
        this.videoFrameReleaseControl.setOutputSurface(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void enableMayRenderStartOfStream() {
        this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void flush(boolean z7) {
        if (z7) {
            this.videoFrameReleaseControl.reset();
        }
        this.videoFrameRenderControl.flush();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public Surface getInputSurface() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean handleInputBitmap(Bitmap bitmap, InterfaceC1110e0 interfaceC1110e0) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean handleInputFrame(long j, boolean z7, long j8, long j9, VideoSink.VideoFrameHandler videoFrameHandler) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void initialize(C0249w c0249w) {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isEnded() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isInitialized() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isReady(boolean z7) {
        return this.videoFrameReleaseControl.isReady(z7);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void join(boolean z7) {
        this.videoFrameReleaseControl.join(z7);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onInputStreamChanged(int i, C0249w c0249w) {
        int i4 = c0249w.f1529u;
        int i8 = c0249w.f1530v;
        C0249w c0249w2 = this.inputFormat;
        if (i4 != c0249w2.f1529u || i8 != c0249w2.f1530v) {
            this.videoFrameRenderControl.onOutputSizeChanged(i4, i8);
        }
        this.inputFormat = c0249w;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onRendererDisabled() {
        this.videoFrameReleaseControl.onDisabled();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onRendererEnabled(boolean z7) {
        this.videoFrameReleaseControl.onEnabled(z7);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onRendererStarted() {
        this.videoFrameReleaseControl.onStarted();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onRendererStopped() {
        this.videoFrameReleaseControl.onStopped();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void release() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void render(long j, long j8) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setChangeFrameRateStrategy(int i) {
        this.videoFrameReleaseControl.setChangeFrameRateStrategy(i);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setListener(VideoSink.Listener listener, Executor executor) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setOutputSurfaceInfo(Surface surface, C1134y c1134y) {
        this.videoFrameReleaseControl.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setPendingVideoEffects(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setPlaybackSpeed(float f8) {
        this.videoFrameReleaseControl.setPlaybackSpeed(f8);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setStreamTimestampInfo(long j, long j8, long j9, long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setVideoEffects(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        throw new UnsupportedOperationException();
    }
}
