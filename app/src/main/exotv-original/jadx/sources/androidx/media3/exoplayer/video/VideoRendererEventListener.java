package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.RunnableC0319h;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface VideoRendererEventListener {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class EventDispatcher {
        private final Handler handler;
        private final VideoRendererEventListener listener;

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
            if (videoRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = videoRendererEventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$decoderInitialized$1(String str, long j, long j8) {
            VideoRendererEventListener videoRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            videoRendererEventListener.onVideoDecoderInitialized(str, j, j8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$decoderReleased$7(String str) {
            VideoRendererEventListener videoRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            videoRendererEventListener.onVideoDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$disabled$8(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            VideoRendererEventListener videoRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            videoRendererEventListener.onVideoDisabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$droppedFrames$3(int i, long j) {
            VideoRendererEventListener videoRendererEventListener = this.listener;
            int i4 = AbstractC1118i0.f4750a;
            videoRendererEventListener.onDroppedFrames(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$enabled$0(DecoderCounters decoderCounters) {
            VideoRendererEventListener videoRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            videoRendererEventListener.onVideoEnabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$inputFormatChanged$2(C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation) {
            VideoRendererEventListener videoRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            videoRendererEventListener.onVideoInputFormatChanged(c0249w, decoderReuseEvaluation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$renderedFirstFrame$6(Object obj, long j) {
            VideoRendererEventListener videoRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            videoRendererEventListener.onRenderedFirstFrame(obj, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$reportVideoFrameProcessingOffset$4(long j, int i) {
            VideoRendererEventListener videoRendererEventListener = this.listener;
            int i4 = AbstractC1118i0.f4750a;
            videoRendererEventListener.onVideoFrameProcessingOffset(j, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$videoCodecError$9(Exception exc) {
            VideoRendererEventListener videoRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            videoRendererEventListener.onVideoCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$videoSizeChanged$5(C0194d2 c0194d2) {
            VideoRendererEventListener videoRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            videoRendererEventListener.onVideoSizeChanged(c0194d2);
        }

        public void decoderInitialized(String str, long j, long j8) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0319h(this, str, j, j8, 1));
            }
        }

        public void decoderReleased(String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0501f(this, str, 2));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0504i(this, decoderCounters, 1));
            }
        }

        public void droppedFrames(int i, long j) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0502g(this, i, j));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0504i(this, decoderCounters, 0));
            }
        }

        public void inputFormatChanged(C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0498c(this, c0249w, decoderReuseEvaluation, 2));
            }
        }

        public void renderedFirstFrame(final Object obj) {
            if (this.handler != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1904j.lambda$renderedFirstFrame$6(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void reportVideoFrameProcessingOffset(long j, int i) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0502g(this, j, i));
            }
        }

        public void videoCodecError(Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0501f(this, exc, 1));
            }
        }

        public void videoSizeChanged(C0194d2 c0194d2) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0501f(this, c0194d2, 0));
            }
        }
    }

    default void onDroppedFrames(int i, long j) {
    }

    default void onRenderedFirstFrame(Object obj, long j) {
    }

    default void onVideoCodecError(Exception exc) {
    }

    default void onVideoDecoderInitialized(String str, long j, long j8) {
    }

    default void onVideoDecoderReleased(String str) {
    }

    default void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    default void onVideoFrameProcessingOffset(long j, int i) {
    }

    default void onVideoInputFormatChanged(C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onVideoSizeChanged(C0194d2 c0194d2) {
    }
}
