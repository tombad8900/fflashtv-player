package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface AudioRendererEventListener {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class EventDispatcher {
        private final Handler handler;
        private final AudioRendererEventListener listener;

        public EventDispatcher(Handler handler, AudioRendererEventListener audioRendererEventListener) {
            if (audioRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = audioRendererEventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$audioCodecError$9(Exception exc) {
            AudioRendererEventListener audioRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            audioRendererEventListener.onAudioCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$audioSinkError$8(Exception exc) {
            AudioRendererEventListener audioRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            audioRendererEventListener.onAudioSinkError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$audioTrackInitialized$10(AudioSink.AudioTrackConfig audioTrackConfig) {
            AudioRendererEventListener audioRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            audioRendererEventListener.onAudioTrackInitialized(audioTrackConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$audioTrackReleased$11(AudioSink.AudioTrackConfig audioTrackConfig) {
            AudioRendererEventListener audioRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            audioRendererEventListener.onAudioTrackReleased(audioTrackConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$decoderInitialized$1(String str, long j, long j8) {
            AudioRendererEventListener audioRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            audioRendererEventListener.onAudioDecoderInitialized(str, j, j8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$decoderReleased$5(String str) {
            AudioRendererEventListener audioRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            audioRendererEventListener.onAudioDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$disabled$6(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            AudioRendererEventListener audioRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            audioRendererEventListener.onAudioDisabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$enabled$0(DecoderCounters decoderCounters) {
            AudioRendererEventListener audioRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            audioRendererEventListener.onAudioEnabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$inputFormatChanged$2(C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation) {
            AudioRendererEventListener audioRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            audioRendererEventListener.onAudioInputFormatChanged(c0249w, decoderReuseEvaluation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$positionAdvancing$3(long j) {
            AudioRendererEventListener audioRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            audioRendererEventListener.onAudioPositionAdvancing(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$skipSilenceEnabledChanged$7(boolean z7) {
            AudioRendererEventListener audioRendererEventListener = this.listener;
            int i = AbstractC1118i0.f4750a;
            audioRendererEventListener.onSkipSilenceEnabledChanged(z7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$underrun$4(int i, long j, long j8) {
            AudioRendererEventListener audioRendererEventListener = this.listener;
            int i4 = AbstractC1118i0.f4750a;
            audioRendererEventListener.onAudioUnderrun(i, j, j8);
        }

        public void audioCodecError(Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0316e(this, exc, 0));
            }
        }

        public void audioSinkError(Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0316e(this, exc, 1));
            }
        }

        public void audioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0315d(this, audioTrackConfig, 0));
            }
        }

        public void audioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0315d(this, audioTrackConfig, 1));
            }
        }

        public void decoderInitialized(String str, long j, long j8) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0319h(this, str, j, j8, 0));
            }
        }

        public void decoderReleased(String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0320i(this, 0, str));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0312a(this, decoderCounters, 1));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0312a(this, decoderCounters, 0));
            }
        }

        public void inputFormatChanged(C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0317f(this, c0249w, decoderReuseEvaluation, 0));
            }
        }

        public void positionAdvancing(long j) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new RunnableC0313b(this, j, 0));
            }
        }

        public void skipSilenceEnabledChanged(final boolean z7) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1672j.lambda$skipSilenceEnabledChanged$7(z7);
                    }
                });
            }
        }

        public void underrun(final int i, final long j, final long j8) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1658j.lambda$underrun$4(i, j, j8);
                    }
                });
            }
        }
    }

    default void onAudioCodecError(Exception exc) {
    }

    default void onAudioDecoderInitialized(String str, long j, long j8) {
    }

    default void onAudioDecoderReleased(String str) {
    }

    default void onAudioDisabled(DecoderCounters decoderCounters) {
    }

    default void onAudioEnabled(DecoderCounters decoderCounters) {
    }

    default void onAudioInputFormatChanged(C0249w c0249w, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onAudioPositionAdvancing(long j) {
    }

    default void onAudioSinkError(Exception exc) {
    }

    default void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void onAudioUnderrun(int i, long j, long j8) {
    }

    default void onSkipSilenceEnabledChanged(boolean z7) {
    }
}
