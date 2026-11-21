package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0204h;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0256y0;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p063h1.InterfaceC1103b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int SINK_FORMAT_SUPPORTED_DIRECTLY = 2;
    public static final int SINK_FORMAT_SUPPORTED_WITH_TRANSCODING = 1;
    public static final int SINK_FORMAT_UNSUPPORTED = 0;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class AudioTrackConfig {
        public final int bufferSize;
        public final int channelConfig;
        public final int encoding;
        public final boolean offload;
        public final int sampleRate;
        public final boolean tunneling;

        public AudioTrackConfig(int i, int i4, int i8, boolean z7, boolean z8, int i9) {
            this.encoding = i;
            this.sampleRate = i4;
            this.channelConfig = i8;
            this.tunneling = z7;
            this.offload = z8;
            this.bufferSize = i9;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Listener {
        default void onAudioCapabilitiesChanged() {
        }

        default void onAudioSinkError(Exception exc) {
        }

        default void onAudioTrackInitialized(AudioTrackConfig audioTrackConfig) {
        }

        default void onAudioTrackReleased(AudioTrackConfig audioTrackConfig) {
        }

        default void onOffloadBufferEmptying() {
        }

        default void onOffloadBufferFull() {
        }

        default void onPositionAdvancing(long j) {
        }

        void onPositionDiscontinuity();

        default void onSilenceSkipped() {
        }

        void onSkipSilenceEnabledChanged(boolean z7);

        void onUnderrun(int i, long j, long j8);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j, long j8) {
            super("Unexpected audio track timestamp discontinuity: expected " + j8 + ", got " + j);
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j8;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class WriteException extends Exception {
        public final int errorCode;
        public final C0249w format;
        public final boolean isRecoverable;

        public WriteException(int i, C0249w c0249w, boolean z7) {
            super(AbstractC0008a1.m12h(i, "AudioTrack write failed: "));
            this.isRecoverable = z7;
            this.errorCode = i;
            this.format = c0249w;
        }
    }

    void configure(C0249w c0249w, int i, int[] iArr);

    void disableTunneling();

    void enableTunnelingV21();

    void flush();

    C0201g getAudioAttributes();

    long getCurrentPositionUs(boolean z7);

    default AudioOffloadSupport getFormatOffloadSupport(C0249w c0249w) {
        return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
    }

    int getFormatSupport(C0249w c0249w);

    C0256y0 getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(ByteBuffer byteBuffer, long j, int i);

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream();

    default void release() {
    }

    void reset();

    void setAudioAttributes(C0201g c0201g);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(C0204h c0204h);

    default void setClock(InterfaceC1103b interfaceC1103b) {
    }

    void setListener(Listener listener);

    default void setOffloadDelayPadding(int i, int i4) {
    }

    default void setOffloadMode(int i) {
    }

    default void setOutputStreamOffsetUs(long j) {
    }

    void setPlaybackParameters(C0256y0 c0256y0);

    default void setPlayerId(PlayerId playerId) {
    }

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    void setSkipSilenceEnabled(boolean z7);

    void setVolume(float f8);

    boolean supportsFormat(C0249w c0249w);

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class ConfigurationException extends Exception {
        public final C0249w format;

        public ConfigurationException(Throwable th, C0249w c0249w) {
            super(th);
            this.format = c0249w;
        }

        public ConfigurationException(String str, C0249w c0249w) {
            super(str);
            this.format = c0249w;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final C0249w format;
        public final boolean isRecoverable;

        /* JADX WARN: Illegal instructions before constructor call */
        public InitializationException(int i, int i4, int i8, int i9, C0249w c0249w, boolean z7, Exception exc) {
            StringBuilder sbM19o = AbstractC0008a1.m19o(i, i4, "AudioTrack init failed ", " Config(", ", ");
            sbM19o.append(i8);
            sbM19o.append(", ");
            sbM19o.append(i9);
            sbM19o.append(") ");
            sbM19o.append(c0249w);
            sbM19o.append(z7 ? " (recoverable)" : C2181z.FRAGMENT_ENCODE_SET);
            this(sbM19o.toString(), i, c0249w, z7, exc);
        }

        public InitializationException(String str, int i, C0249w c0249w, boolean z7, Throwable th) {
            super(str, th);
            this.audioTrackState = i;
            this.isRecoverable = z7;
            this.format = c0249w;
        }
    }
}
