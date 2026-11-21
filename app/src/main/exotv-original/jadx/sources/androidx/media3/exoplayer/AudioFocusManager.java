package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.support.v4.media.session.AbstractC0120b;
import androidx.media3.common.C0201g;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;
import p002a1.AbstractC0008a1;
import p043e6.InterfaceC0921i;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
final class AudioFocusManager {
    private static final int AUDIOFOCUS_GAIN = 1;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    private static final int AUDIOFOCUS_NONE = 0;
    private static final int AUDIO_FOCUS_STATE_HAVE_FOCUS = 2;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT = 3;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT_DUCK = 4;
    private static final int AUDIO_FOCUS_STATE_NOT_REQUESTED = 0;
    private static final int AUDIO_FOCUS_STATE_NO_FOCUS = 1;
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
    private static final String TAG = "AudioFocusManager";
    private static final float VOLUME_MULTIPLIER_DEFAULT = 1.0f;
    private static final float VOLUME_MULTIPLIER_DUCK = 0.2f;
    private C0201g audioAttributes;
    private AudioFocusRequest audioFocusRequest;
    private final InterfaceC0921i audioManager;
    private int focusGainToRequest;
    private final AudioFocusListener focusListener;
    private PlayerControl playerControl;
    private boolean rebuildAudioFocusRequest;
    private float volumeMultiplier = 1.0f;
    private int audioFocusState = 0;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public class AudioFocusListener implements AudioManager.OnAudioFocusChangeListener {
        private final Handler eventHandler;

        public AudioFocusListener(Handler handler) {
            this.eventHandler = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAudioFocusChange$0(int i) {
            AudioFocusManager.this.handlePlatformAudioFocusChange(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.eventHandler.post(new Runnable() { // from class: androidx.media3.exoplayer.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1691j.lambda$onAudioFocusChange$0(i);
                }
            });
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface PlayerControl {
        void executePlayerCommand(int i);

        void setVolumeMultiplier(float f8);
    }

    public AudioFocusManager(Context context, Handler handler, PlayerControl playerControl) {
        this.audioManager = AbstractC0120b.m393A(new C0277a(context, 0));
        this.playerControl = playerControl;
        this.focusListener = new AudioFocusListener(handler);
    }

    private void abandonAudioFocusDefault() {
        ((AudioManager) this.audioManager.get()).abandonAudioFocus(this.focusListener);
    }

    private void abandonAudioFocusIfHeld() {
        int i = this.audioFocusState;
        if (i == 1 || i == 0) {
            return;
        }
        if (AbstractC1118i0.f4750a >= 26) {
            abandonAudioFocusV26();
        } else {
            abandonAudioFocusDefault();
        }
    }

    private void abandonAudioFocusV26() {
        if (this.audioFocusRequest != null) {
            ((AudioManager) this.audioManager.get()).abandonAudioFocusRequest(this.audioFocusRequest);
        }
    }

    private static int convertAudioAttributesToFocusGain(C0201g c0201g) {
        return c0201g == null ? 0 : 1;
    }

    private void executePlayerCommand(int i) {
        PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.executePlayerCommand(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlatformAudioFocusChange(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !willPauseWhenDucked()) {
                setAudioFocusState(4);
                return;
            } else {
                executePlayerCommand(0);
                setAudioFocusState(3);
                return;
            }
        }
        if (i == -1) {
            executePlayerCommand(-1);
            abandonAudioFocusIfHeld();
            setAudioFocusState(1);
        } else if (i != 1) {
            AbstractC0008a1.m23s("Unknown focus change type: ", i, TAG);
        } else {
            setAudioFocusState(2);
            executePlayerCommand(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioManager lambda$new$0(Context context) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        return audioManager;
    }

    private int requestAudioFocus() {
        if (this.audioFocusState == 2) {
            return 1;
        }
        if ((AbstractC1118i0.f4750a >= 26 ? requestAudioFocusV26() : requestAudioFocusDefault()) == 1) {
            setAudioFocusState(2);
            return 1;
        }
        setAudioFocusState(1);
        return -1;
    }

    private int requestAudioFocusDefault() {
        AudioManager audioManager = (AudioManager) this.audioManager.get();
        AudioFocusListener audioFocusListener = this.focusListener;
        this.audioAttributes.getClass();
        int i = AbstractC1118i0.f4750a;
        return audioManager.requestAudioFocus(audioFocusListener, 3, this.focusGainToRequest);
    }

    private int requestAudioFocusV26() {
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest == null || this.rebuildAudioFocusRequest) {
            AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.focusGainToRequest) : new AudioFocusRequest.Builder(this.audioFocusRequest);
            boolean zWillPauseWhenDucked = willPauseWhenDucked();
            C0201g c0201g = this.audioAttributes;
            c0201g.getClass();
            this.audioFocusRequest = builder.setAudioAttributes((AudioAttributes) c0201g.m619a().f143k).setWillPauseWhenDucked(zWillPauseWhenDucked).setOnAudioFocusChangeListener(this.focusListener).build();
            this.rebuildAudioFocusRequest = false;
        }
        return ((AudioManager) this.audioManager.get()).requestAudioFocus(this.audioFocusRequest);
    }

    private void setAudioFocusState(int i) {
        if (this.audioFocusState == i) {
            return;
        }
        this.audioFocusState = i;
        float f8 = i == 4 ? 0.2f : 1.0f;
        if (this.volumeMultiplier == f8) {
            return;
        }
        this.volumeMultiplier = f8;
        PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.setVolumeMultiplier(f8);
        }
    }

    private boolean shouldHandleAudioFocus(int i) {
        return i != 1 && this.focusGainToRequest == 1;
    }

    private boolean willPauseWhenDucked() {
        return false;
    }

    public AudioManager.OnAudioFocusChangeListener getFocusListener() {
        return this.focusListener;
    }

    public float getVolumeMultiplier() {
        return this.volumeMultiplier;
    }

    public void release() {
        this.playerControl = null;
        abandonAudioFocusIfHeld();
        setAudioFocusState(0);
    }

    public void setAudioAttributes(C0201g c0201g) {
        C0201g c0201g2 = this.audioAttributes;
        int i = AbstractC1118i0.f4750a;
        if (Objects.equals(c0201g2, c0201g)) {
            return;
        }
        this.audioAttributes = c0201g;
        int iConvertAudioAttributesToFocusGain = convertAudioAttributesToFocusGain(c0201g);
        this.focusGainToRequest = iConvertAudioAttributesToFocusGain;
        boolean z7 = true;
        if (iConvertAudioAttributesToFocusGain != 1 && iConvertAudioAttributesToFocusGain != 0) {
            z7 = false;
        }
        AbstractC1101a.m2352c("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", z7);
    }

    public int updateAudioFocus(boolean z7, int i) {
        if (!shouldHandleAudioFocus(i)) {
            abandonAudioFocusIfHeld();
            setAudioFocusState(0);
            return 1;
        }
        if (z7) {
            return requestAudioFocus();
        }
        int i4 = this.audioFocusState;
        if (i4 != 1) {
            return i4 != 3 ? 1 : 0;
        }
        return -1;
    }
}
