package androidx.media3.exoplayer.video;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0249w;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;
import p063h1.C1134y;
import p063h1.InterfaceC1110e0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface VideoSink {
    public static final int INPUT_TYPE_BITMAP = 2;
    public static final int INPUT_TYPE_SURFACE = 1;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Listener {
        public static final Listener NO_OP = new Listener() { // from class: androidx.media3.exoplayer.video.VideoSink.Listener.1
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onError(VideoSink videoSink, VideoSinkException videoSinkException) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFirstFrameRendered(VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFrameDropped(VideoSink videoSink) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onVideoSizeChanged(VideoSink videoSink, C0194d2 c0194d2) {
            }
        };

        void onError(VideoSink videoSink, VideoSinkException videoSinkException);

        void onFirstFrameRendered(VideoSink videoSink);

        void onFrameDropped(VideoSink videoSink);

        void onVideoSizeChanged(VideoSink videoSink, C0194d2 c0194d2);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface VideoFrameHandler {
        void render(long j);

        void skip();
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class VideoSinkException extends Exception {
        public final C0249w format;

        public VideoSinkException(Throwable th, C0249w c0249w) {
            super(th);
            this.format = c0249w;
        }
    }

    void clearOutputSurfaceInfo();

    void enableMayRenderStartOfStream();

    void flush(boolean z7);

    Surface getInputSurface();

    boolean handleInputBitmap(Bitmap bitmap, InterfaceC1110e0 interfaceC1110e0);

    boolean handleInputFrame(long j, boolean z7, long j8, long j9, VideoFrameHandler videoFrameHandler);

    void initialize(C0249w c0249w);

    boolean isEnded();

    boolean isInitialized();

    boolean isReady(boolean z7);

    void join(boolean z7);

    void onInputStreamChanged(int i, C0249w c0249w);

    void onRendererDisabled();

    void onRendererEnabled(boolean z7);

    void onRendererStarted();

    void onRendererStopped();

    void release();

    void render(long j, long j8);

    void setChangeFrameRateStrategy(int i);

    void setListener(Listener listener, Executor executor);

    void setOutputSurfaceInfo(Surface surface, C1134y c1134y);

    void setPendingVideoEffects(List<Object> list);

    void setPlaybackSpeed(float f8);

    void setStreamTimestampInfo(long j, long j8, long j9, long j10);

    void setVideoEffects(List<Object> list);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);
}
