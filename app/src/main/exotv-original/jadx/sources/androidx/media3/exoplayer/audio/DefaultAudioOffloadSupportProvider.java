package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.audio.AudioOffloadSupport;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DefaultAudioOffloadSupportProvider implements DefaultAudioSink.AudioOffloadSupportProvider {
    private static final String OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY = "offloadVariableRateSupported";
    private final Context context;
    private Boolean isOffloadVariableRateSupported;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api29 {
        private Api29() {
        }

        public static AudioOffloadSupport getOffloadedPlaybackSupport(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z7) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? AudioOffloadSupport.DEFAULT_UNSUPPORTED : new AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsSpeedChangeSupported(z7).build();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Api31 {
        private Api31() {
        }

        public static AudioOffloadSupport getOffloadedPlaybackSupport(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z7) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
            }
            return new AudioOffloadSupport.Builder().setIsFormatSupported(true).setIsGaplessSupported(AbstractC1118i0.f4750a > 32 && playbackOffloadSupport == 2).setIsSpeedChangeSupported(z7).build();
        }
    }

    public DefaultAudioOffloadSupportProvider() {
        this(null);
    }

    private boolean isOffloadVariableRateSupported(Context context) {
        AudioManager audioManager;
        Boolean bool = this.isOffloadVariableRateSupported;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            this.isOffloadVariableRateSupported = Boolean.FALSE;
        } else {
            String parameters = audioManager.getParameters(OFFLOAD_VARIABLE_RATE_SUPPORTED_KEY);
            this.isOffloadVariableRateSupported = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        }
        return this.isOffloadVariableRateSupported.booleanValue();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider
    public AudioOffloadSupport getAudioOffloadSupport(C0249w c0249w, C0201g c0201g) {
        c0249w.getClass();
        int i = c0249w.f1499D;
        c0201g.getClass();
        int i4 = AbstractC1118i0.f4750a;
        if (i4 < 29 || i == -1) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        boolean zIsOffloadVariableRateSupported = isOffloadVariableRateSupported(this.context);
        String str = c0249w.f1522n;
        str.getClass();
        int iM675d = AbstractC0244u0.m675d(str, c0249w.f1519k);
        if (iM675d == 0 || i4 < AbstractC1118i0.m2460s(iM675d)) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        int iM2462u = AbstractC1118i0.m2462u(c0249w.f1498C);
        if (iM2462u == 0) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        try {
            AudioFormat audioFormatM2461t = AbstractC1118i0.m2461t(i, iM2462u, iM675d);
            return i4 >= 31 ? Api31.getOffloadedPlaybackSupport(audioFormatM2461t, (AudioAttributes) c0201g.m619a().f143k, zIsOffloadVariableRateSupported) : Api29.getOffloadedPlaybackSupport(audioFormatM2461t, (AudioAttributes) c0201g.m619a().f143k, zIsOffloadVariableRateSupported);
        } catch (IllegalArgumentException unused) {
            return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
    }

    public DefaultAudioOffloadSupportProvider(Context context) {
        this.context = context;
    }
}
