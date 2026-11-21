package androidx.media3.exoplayer.audio;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import androidx.media3.common.C0201g;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class DefaultAudioTrackProvider implements DefaultAudioSink.AudioTrackProvider {
    private AudioTrack createAudioTrackV21(AudioSink.AudioTrackConfig audioTrackConfig, C0201g c0201g, int i) {
        return new AudioTrack(getAudioTrackAttributesV21(c0201g, audioTrackConfig.tunneling), AbstractC1118i0.m2461t(audioTrackConfig.sampleRate, audioTrackConfig.channelConfig, audioTrackConfig.encoding), audioTrackConfig.bufferSize, 1, i);
    }

    private AudioTrack createAudioTrackV23(AudioSink.AudioTrackConfig audioTrackConfig, C0201g c0201g, int i) throws IllegalArgumentException {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributesV21(c0201g, audioTrackConfig.tunneling)).setAudioFormat(AbstractC1118i0.m2461t(audioTrackConfig.sampleRate, audioTrackConfig.channelConfig, audioTrackConfig.encoding)).setTransferMode(1).setBufferSizeInBytes(audioTrackConfig.bufferSize).setSessionId(i);
        if (AbstractC1118i0.f4750a >= 29) {
            setOffloadedPlaybackV29(sessionId, audioTrackConfig.offload);
        }
        return customizeAudioTrackBuilder(sessionId).build();
    }

    private AudioAttributes getAudioTrackAttributesV21(C0201g c0201g, boolean z7) {
        return z7 ? getAudioTrackTunnelingAttributesV21() : (AudioAttributes) c0201g.m619a().f143k;
    }

    private AudioAttributes getAudioTrackTunnelingAttributesV21() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private void setOffloadedPlaybackV29(AudioTrack.Builder builder, boolean z7) {
        builder.setOffloadedPlayback(z7);
    }

    public AudioTrack.Builder customizeAudioTrackBuilder(AudioTrack.Builder builder) {
        return builder;
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackProvider
    public final AudioTrack getAudioTrack(AudioSink.AudioTrackConfig audioTrackConfig, C0201g c0201g, int i) {
        return AbstractC1118i0.f4750a >= 23 ? createAudioTrackV23(audioTrackConfig, c0201g, i) : createAudioTrackV21(audioTrackConfig, c0201g, i);
    }
}
