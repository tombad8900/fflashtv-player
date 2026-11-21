package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0204h;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0253x0;
import androidx.media3.common.C0256y0;
import androidx.media3.common.audio.InterfaceC0176d;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.bumptech.glide.AbstractC0715d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1135z;
import p106m1.C1872g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {
    private static final String TAG = "MediaCodecAudioRenderer";
    private static final String VIVO_BITS_PER_SAMPLE_KEY = "v-bits-per-sample";
    private boolean allowPositionDiscontinuity;
    private final AudioSink audioSink;
    private boolean audioSinkNeedsReset;
    private int codecMaxInputSize;
    private boolean codecNeedsDiscardChannelsWorkaround;
    private boolean codecNeedsVorbisToAndroidChannelMappingWorkaround;
    private final Context context;
    private long currentPositionUs;
    private C0249w decryptOnlyCodecFormat;
    private final AudioRendererEventListener.EventDispatcher eventDispatcher;
    private boolean hasPendingReportedSkippedSilence;
    private C0249w inputFormat;
    private boolean isStarted;
    private final LoudnessCodecController loudnessCodecController;
    private long nextBufferToWritePresentationTimeUs;
    private int rendererPriority;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api23 {
        private Api23() {
        }

        public static void setAudioSinkPreferredDevice(AudioSink audioSink, Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public final class AudioSinkListener implements AudioSink.Listener {
        private AudioSinkListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioCapabilitiesChanged() {
            MediaCodecAudioRenderer.this.onRendererCapabilitiesChanged();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioSinkError(Exception exc) {
            AbstractC1101a.m2365p(MediaCodecAudioRenderer.TAG, "Audio sink error", exc);
            MediaCodecAudioRenderer.this.eventDispatcher.audioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
            MediaCodecAudioRenderer.this.eventDispatcher.audioTrackInitialized(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
            MediaCodecAudioRenderer.this.eventDispatcher.audioTrackReleased(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onOffloadBufferEmptying() {
            Renderer.WakeupListener wakeupListener = MediaCodecAudioRenderer.this.getWakeupListener();
            if (wakeupListener != null) {
                wakeupListener.onWakeup();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onOffloadBufferFull() {
            Renderer.WakeupListener wakeupListener = MediaCodecAudioRenderer.this.getWakeupListener();
            if (wakeupListener != null) {
                wakeupListener.onSleep();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionAdvancing(long j) {
            MediaCodecAudioRenderer.this.eventDispatcher.positionAdvancing(j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
            MediaCodecAudioRenderer.this.onPositionDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSilenceSkipped() {
            MediaCodecAudioRenderer.this.hasPendingReportedSkippedSilence = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean z7) {
            MediaCodecAudioRenderer.this.eventDispatcher.skipSilenceEnabledChanged(z7);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onUnderrun(int i, long j, long j8) {
            MediaCodecAudioRenderer.this.eventDispatcher.underrun(i, j, j8);
        }
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, null, null);
    }

    private static boolean codecNeedsDiscardChannelsWorkaround(String str) {
        if (AbstractC1118i0.f4750a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(AbstractC1118i0.f4752c)) {
            return false;
        }
        String str2 = AbstractC1118i0.f4751b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    private static boolean codecNeedsVorbisToAndroidChannelMappingWorkaround(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean deviceDoesntSupportOperatingRate() {
        if (AbstractC1118i0.f4750a != 23) {
            return false;
        }
        String str = AbstractC1118i0.f4753d;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    private int getAudioOffloadSupport(C0249w c0249w) {
        AudioOffloadSupport formatOffloadSupport = this.audioSink.getFormatOffloadSupport(c0249w);
        if (!formatOffloadSupport.isFormatSupported) {
            return 0;
        }
        int i = formatOffloadSupport.isGaplessSupported ? 1536 : 512;
        return formatOffloadSupport.isSpeedChangeSupported ? i | 2048 : i;
    }

    private void setAudioSessionId(int i) {
        LoudnessCodecController loudnessCodecController;
        this.audioSink.setAudioSessionId(i);
        if (AbstractC1118i0.f4750a < 35 || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.setAudioSessionId(i);
    }

    private void updateCodecImportance() {
        MediaCodecAdapter codec = getCodec();
        if (codec != null && AbstractC1118i0.f4750a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.rendererPriority));
            codec.setParameters(bundle);
        }
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.audioSink.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.allowPositionDiscontinuity) {
                currentPositionUs = Math.max(this.currentPositionUs, currentPositionUs);
            }
            this.currentPositionUs = currentPositionUs;
            this.allowPositionDiscontinuity = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, C0249w c0249w, C0249w c0249w2) {
        DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = mediaCodecInfo.canReuseCodec(c0249w, c0249w2);
        int i = decoderReuseEvaluationCanReuseCodec.discardReasons;
        if (isBypassPossible(c0249w2)) {
            i |= DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE;
        }
        if (getCodecMaxInputSize(mediaCodecInfo, c0249w2) > this.codecMaxInputSize) {
            i |= 64;
        }
        int i4 = i;
        return new DecoderReuseEvaluation(mediaCodecInfo.name, c0249w, c0249w2, i4 != 0 ? 0 : decoderReuseEvaluationCanReuseCodec.result, i4);
    }

    public int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, C0249w c0249w, C0249w[] c0249wArr) {
        int codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, c0249w);
        if (c0249wArr.length == 1) {
            return codecMaxInputSize;
        }
        for (C0249w c0249w2 : c0249wArr) {
            if (mediaCodecInfo.canReuseCodec(c0249w, c0249w2).result != 0) {
                codecMaxInputSize = Math.max(codecMaxInputSize, getCodecMaxInputSize(mediaCodecInfo, c0249w2));
            }
        }
        return codecMaxInputSize;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public float getCodecOperatingRateV23(float f8, C0249w c0249w, C0249w[] c0249wArr) {
        int iMax = -1;
        for (C0249w c0249w2 : c0249wArr) {
            int i = c0249w2.f1499D;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f8;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, C0249w c0249w, boolean z7) {
        return MediaCodecUtil.getDecoderInfosSortedByFormatSupport(getDecoderInfos(mediaCodecSelector, c0249w, z7, this.audioSink), c0249w);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public long getDurationToProgressUs(boolean z7, long j, long j8) {
        if (this.nextBufferToWritePresentationTimeUs == -9223372036854775807L) {
            return super.getDurationToProgressUs(z7, j, j8);
        }
        long jM2428S = (long) (((r0 - j) / (getPlaybackParameters() != null ? getPlaybackParameters().f1549a : 1.0f)) / 2.0f);
        if (this.isStarted) {
            ((C1135z) getClock()).getClass();
            jM2428S -= AbstractC1118i0.m2428S(SystemClock.elapsedRealtime()) - j8;
        }
        return Math.max(Renderer.DEFAULT_DURATION_TO_PROGRESS_US, jM2428S);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public MediaClock getMediaClock() {
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, C0249w c0249w, MediaCrypto mediaCrypto, float f8) {
        this.codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, c0249w, getStreamFormats());
        this.codecNeedsDiscardChannelsWorkaround = codecNeedsDiscardChannelsWorkaround(mediaCodecInfo.name);
        this.codecNeedsVorbisToAndroidChannelMappingWorkaround = codecNeedsVorbisToAndroidChannelMappingWorkaround(mediaCodecInfo.name);
        MediaFormat mediaFormat = getMediaFormat(c0249w, mediaCodecInfo.codecMimeType, this.codecMaxInputSize, f8);
        this.decryptOnlyCodecFormat = (!"audio/raw".equals(mediaCodecInfo.mimeType) || "audio/raw".equals(c0249w.f1522n)) ? null : c0249w;
        return MediaCodecAdapter.Configuration.createForAudioDecoding(mediaCodecInfo, mediaFormat, c0249w, mediaCrypto, this.loudnessCodecController);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat getMediaFormat(C0249w c0249w, String str, int i, float f8) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c0249w.f1498C);
        int i4 = c0249w.f1499D;
        mediaFormat.setInteger("sample-rate", i4);
        AbstractC1101a.m2346D(mediaFormat, c0249w.f1525q);
        AbstractC1101a.m2375z(mediaFormat, "max-input-size", i);
        int i8 = AbstractC1118i0.f4750a;
        if (i8 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f8 != -1.0f && !deviceDoesntSupportOperatingRate()) {
                mediaFormat.setFloat("operating-rate", f8);
            }
        }
        if (i8 <= 28 && "audio/ac4".equals(c0249w.f1522n)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i8 >= 24) {
            AudioSink audioSink = this.audioSink;
            int i9 = c0249w.f1498C;
            C0246v c0246v = new C0246v();
            c0246v.f1447m = AbstractC0244u0.m687p("audio/raw");
            c0246v.f1425B = i9;
            c0246v.f1426C = i4;
            c0246v.f1427D = 4;
            if (audioSink.getFormatSupport(new C0249w(c0246v)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i8 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i8 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.rendererPriority));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public C0256y0 getPlaybackParameters() {
        return this.audioSink.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.currentPositionUs;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void handleInputBufferSupplementalData(C1872g c1872g) {
        C0249w c0249w;
        if (AbstractC1118i0.f4750a < 29 || (c0249w = c1872g.format) == null || !Objects.equals(c0249w.f1522n, "audio/opus") || !isBypassEnabled()) {
            return;
        }
        ByteBuffer byteBuffer = c1872g.supplementalData;
        byteBuffer.getClass();
        C0249w c0249w2 = c1872g.format;
        c0249w2.getClass();
        int i = c0249w2.f1501F;
        if (byteBuffer.remaining() == 8) {
            this.audioSink.setOffloadDelayPadding(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
        if (i == 2) {
            AudioSink audioSink = this.audioSink;
            obj.getClass();
            audioSink.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            C0201g c0201g = (C0201g) obj;
            AudioSink audioSink2 = this.audioSink;
            c0201g.getClass();
            audioSink2.setAudioAttributes(c0201g);
            return;
        }
        if (i == 6) {
            C0204h c0204h = (C0204h) obj;
            AudioSink audioSink3 = this.audioSink;
            c0204h.getClass();
            audioSink3.setAuxEffectInfo(c0204h);
            return;
        }
        if (i == 12) {
            if (AbstractC1118i0.f4750a >= 23) {
                Api23.setAudioSinkPreferredDevice(this.audioSink, obj);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.rendererPriority = ((Integer) obj).intValue();
            updateCodecImportance();
        } else if (i == 9) {
            AudioSink audioSink4 = this.audioSink;
            obj.getClass();
            audioSink4.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
        } else if (i != 10) {
            super.handleMessage(i, obj);
        } else {
            obj.getClass();
            setAudioSessionId(((Integer) obj).intValue());
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public boolean hasSkippedSilenceSinceLastCall() {
        boolean z7 = this.hasPendingReportedSkippedSilence;
        this.hasPendingReportedSkippedSilence = false;
        return z7;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return super.isEnded() && this.audioSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return this.audioSink.hasPendingData() || super.isReady();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecError(Exception exc) {
        AbstractC1101a.m2365p(TAG, "Audio codec error", exc);
        this.eventDispatcher.audioCodecError(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j, long j8) {
        this.eventDispatcher.decoderInitialized(str, j, j8);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecReleased(String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.audioSinkNeedsReset = true;
        this.inputFormat = null;
        try {
            this.audioSink.flush();
            try {
                super.onDisabled();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.onDisabled();
                throw th;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z7, boolean z8) {
        super.onEnabled(z7, z8);
        this.eventDispatcher.enabled(this.decoderCounters);
        if (getConfiguration().tunneling) {
            this.audioSink.enableTunnelingV21();
        } else {
            this.audioSink.disableTunneling();
        }
        this.audioSink.setPlayerId(getPlayerId());
        this.audioSink.setClock(getClock());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) {
        C0249w c0249w = formatHolder.format;
        c0249w.getClass();
        this.inputFormat = c0249w;
        DecoderReuseEvaluation decoderReuseEvaluationOnInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.eventDispatcher.inputFormatChanged(c0249w, decoderReuseEvaluationOnInputFormatChanged);
        return decoderReuseEvaluationOnInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(C0249w c0249w, MediaFormat mediaFormat) throws ExoPlaybackException {
        C0249w c0249w2 = this.decryptOnlyCodecFormat;
        int[] iArr = null;
        if (c0249w2 != null) {
            c0249w = c0249w2;
        } else if (getCodec() != null) {
            mediaFormat.getClass();
            String str = c0249w.f1522n;
            int i = c0249w.f1498C;
            int iM2413D = "audio/raw".equals(str) ? c0249w.f1500E : (AbstractC1118i0.f4750a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey(VIVO_BITS_PER_SAMPLE_KEY) ? AbstractC1118i0.m2413D(mediaFormat.getInteger(VIVO_BITS_PER_SAMPLE_KEY)) : 2 : mediaFormat.getInteger("pcm-encoding");
            C0246v c0246v = new C0246v();
            c0246v.f1447m = AbstractC0244u0.m687p("audio/raw");
            c0246v.f1427D = iM2413D;
            c0246v.f1428E = c0249w.f1501F;
            c0246v.f1429F = c0249w.f1502G;
            c0246v.f1445k = c0249w.f1520l;
            c0246v.f1435a = c0249w.f1509a;
            c0246v.f1436b = c0249w.f1510b;
            c0246v.f1437c = AbstractC0983m0.m2165j(c0249w.f1511c);
            c0246v.f1438d = c0249w.f1512d;
            c0246v.f1439e = c0249w.f1513e;
            c0246v.f1440f = c0249w.f1514f;
            c0246v.f1425B = mediaFormat.getInteger("channel-count");
            c0246v.f1426C = mediaFormat.getInteger("sample-rate");
            c0249w = new C0249w(c0246v);
            boolean z7 = this.codecNeedsDiscardChannelsWorkaround;
            int i4 = c0249w.f1498C;
            if (z7 && i4 == 6 && i < 6) {
                iArr = new int[i];
                for (int i8 = 0; i8 < i; i8++) {
                    iArr[i8] = i8;
                }
            } else if (this.codecNeedsVorbisToAndroidChannelMappingWorkaround) {
                if (i4 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i4 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i4 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i4 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i4 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            if (AbstractC1118i0.f4750a >= 29) {
                if (!isBypassEnabled() || getConfiguration().offloadModePreferred == 0) {
                    this.audioSink.setOffloadMode(0);
                } else {
                    this.audioSink.setOffloadMode(getConfiguration().offloadModePreferred);
                }
            }
            this.audioSink.configure(c0249w, 0, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw createRendererException(e, e.format, C0253x0.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onOutputStreamOffsetUsChanged(long j) {
        this.audioSink.setOutputStreamOffsetUs(j);
    }

    public void onPositionDiscontinuity() {
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z7) {
        super.onPositionReset(j, z7);
        this.audioSink.flush();
        this.currentPositionUs = j;
        this.hasPendingReportedSkippedSilence = false;
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        this.audioSink.handleDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onRelease() {
        LoudnessCodecController loudnessCodecController;
        this.audioSink.release();
        if (AbstractC1118i0.f4750a < 35 || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        this.hasPendingReportedSkippedSilence = false;
        try {
            super.onReset();
        } finally {
            if (this.audioSinkNeedsReset) {
                this.audioSinkNeedsReset = false;
                this.audioSink.reset();
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.audioSink.play();
        this.isStarted = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        updateCurrentPosition();
        this.isStarted = false;
        this.audioSink.pause();
        super.onStopped();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j, long j8, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i4, int i8, long j9, boolean z7, boolean z8, C0249w c0249w) throws ExoPlaybackException {
        byteBuffer.getClass();
        this.nextBufferToWritePresentationTimeUs = -9223372036854775807L;
        if (this.decryptOnlyCodecFormat != null && (i4 & 2) != 0) {
            mediaCodecAdapter.getClass();
            mediaCodecAdapter.releaseOutputBuffer(i, false);
            return true;
        }
        if (z7) {
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.releaseOutputBuffer(i, false);
            }
            this.decoderCounters.skippedOutputBufferCount += i8;
            this.audioSink.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.audioSink.handleBuffer(byteBuffer, j9, i8)) {
                this.nextBufferToWritePresentationTimeUs = j9;
                return false;
            }
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.releaseOutputBuffer(i, false);
            }
            this.decoderCounters.renderedOutputBufferCount += i8;
            return true;
        } catch (AudioSink.InitializationException e) {
            throw createRendererException(e, this.inputFormat, e.isRecoverable, (!isBypassEnabled() || getConfiguration().offloadModePreferred == 0) ? C0253x0.ERROR_CODE_AUDIO_TRACK_INIT_FAILED : C0253x0.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED);
        } catch (AudioSink.WriteException e8) {
            throw createRendererException(e8, c0249w, e8.isRecoverable, (!isBypassEnabled() || getConfiguration().offloadModePreferred == 0) ? C0253x0.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED : C0253x0.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void renderToEndOfStream() throws ExoPlaybackException {
        try {
            this.audioSink.playToEndOfStream();
            if (getLastBufferInStreamPresentationTimeUs() != -9223372036854775807L) {
                this.nextBufferToWritePresentationTimeUs = getLastBufferInStreamPresentationTimeUs();
            }
        } catch (AudioSink.WriteException e) {
            throw createRendererException(e, e.format, e.isRecoverable, isBypassEnabled() ? C0253x0.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED : C0253x0.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(C0256y0 c0256y0) {
        this.audioSink.setPlaybackParameters(c0256y0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean shouldUseBypass(C0249w c0249w) {
        if (getConfiguration().offloadModePreferred != 0) {
            int audioOffloadSupport = getAudioOffloadSupport(c0249w);
            if ((audioOffloadSupport & 512) != 0) {
                if (getConfiguration().offloadModePreferred == 2 || (audioOffloadSupport & 1024) != 0) {
                    return true;
                }
                if (c0249w.f1501F == 0 && c0249w.f1502G == 0) {
                    return true;
                }
            }
        }
        return this.audioSink.supportsFormat(c0249w);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, C0249w c0249w) {
        int audioOffloadSupport;
        boolean z7;
        if (!AbstractC0244u0.m682k(c0249w.f1522n)) {
            return RendererCapabilities.create(0);
        }
        boolean z8 = true;
        boolean z9 = c0249w.f1507L != 0;
        boolean zSupportsFormatDrm = MediaCodecRenderer.supportsFormatDrm(c0249w);
        int i = 8;
        if (!zSupportsFormatDrm || (z9 && MediaCodecUtil.getDecryptOnlyDecoderInfo() == null)) {
            audioOffloadSupport = 0;
        } else {
            audioOffloadSupport = getAudioOffloadSupport(c0249w);
            if (this.audioSink.supportsFormat(c0249w)) {
                return RendererCapabilities.create(4, 8, 32, audioOffloadSupport);
            }
        }
        if ("audio/raw".equals(c0249w.f1522n) && !this.audioSink.supportsFormat(c0249w)) {
            return RendererCapabilities.create(1);
        }
        AudioSink audioSink = this.audioSink;
        int i4 = c0249w.f1498C;
        int i8 = c0249w.f1499D;
        C0246v c0246v = new C0246v();
        c0246v.f1447m = AbstractC0244u0.m687p("audio/raw");
        c0246v.f1425B = i4;
        c0246v.f1426C = i8;
        c0246v.f1427D = 2;
        if (!audioSink.supportsFormat(new C0249w(c0246v))) {
            return RendererCapabilities.create(1);
        }
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(mediaCodecSelector, c0249w, false, this.audioSink);
        if (decoderInfos.isEmpty()) {
            return RendererCapabilities.create(1);
        }
        if (!zSupportsFormatDrm) {
            return RendererCapabilities.create(2);
        }
        MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean zIsFormatSupported = mediaCodecInfo.isFormatSupported(c0249w);
        if (zIsFormatSupported) {
            z7 = true;
            z8 = zIsFormatSupported;
        } else {
            for (int i9 = 1; i9 < decoderInfos.size(); i9++) {
                MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i9);
                if (mediaCodecInfo2.isFormatSupported(c0249w)) {
                    z7 = false;
                    mediaCodecInfo = mediaCodecInfo2;
                    break;
                }
            }
            z7 = true;
            z8 = zIsFormatSupported;
        }
        int i10 = z8 ? 4 : 3;
        if (z8 && mediaCodecInfo.isSeamlessAdaptationSupported(c0249w)) {
            i = 16;
        }
        return RendererCapabilities.create(i10, i, 32, mediaCodecInfo.hardwareAccelerated ? 64 : 0, z7 ? 128 : 0, audioOffloadSupport);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener audioRendererEventListener) {
        this(context, mediaCodecSelector, handler, audioRendererEventListener, new DefaultAudioSink.Builder(context).build());
    }

    private static List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, C0249w c0249w, boolean z7, AudioSink audioSink) {
        MediaCodecInfo decryptOnlyDecoderInfo;
        if (c0249w.f1522n == null) {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            return C0981l1.f4211n;
        }
        if (audioSink.supportsFormat(c0249w) && (decryptOnlyDecoderInfo = MediaCodecUtil.getDecryptOnlyDecoderInfo()) != null) {
            return AbstractC0983m0.m2168n(decryptOnlyDecoderInfo);
        }
        return MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, c0249w, z7, false);
    }

    @Deprecated
    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioCapabilities audioCapabilities, InterfaceC0176d... interfaceC0176dArr) {
        this(context, mediaCodecSelector, handler, audioRendererEventListener, new DefaultAudioSink.Builder().setAudioCapabilities((AudioCapabilities) AbstractC0715d.m1573y(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(interfaceC0176dArr).build());
    }

    private int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, C0249w c0249w) {
        int i;
        if (!"OMX.google.raw.decoder".equals(mediaCodecInfo.name) || (i = AbstractC1118i0.f4750a) >= 24 || (i == 23 && AbstractC1118i0.m2426Q(this.context))) {
            return c0249w.f1523o;
        }
        return -1;
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, MediaCodecAdapter.Factory.getDefault(context), mediaCodecSelector, false, handler, audioRendererEventListener, audioSink);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, boolean z7, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, MediaCodecAdapter.Factory.getDefault(context), mediaCodecSelector, z7, handler, audioRendererEventListener, audioSink);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z7, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, factory, mediaCodecSelector, z7, handler, audioRendererEventListener, audioSink, AbstractC1118i0.f4750a >= 35 ? new LoudnessCodecController() : null);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z7, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioSink audioSink, LoudnessCodecController loudnessCodecController) {
        super(1, factory, mediaCodecSelector, z7, 44100.0f);
        this.context = context.getApplicationContext();
        this.audioSink = audioSink;
        this.loudnessCodecController = loudnessCodecController;
        this.rendererPriority = -1000;
        this.eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        this.nextBufferToWritePresentationTimeUs = -9223372036854775807L;
        audioSink.setListener(new AudioSinkListener());
    }
}
