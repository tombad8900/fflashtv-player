package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.image.ImageRenderer;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionRenderer;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String TAG = "DefaultRenderersFactory";
    private final DefaultMediaCodecAdapterFactory codecAdapterFactory;
    private final Context context;
    private boolean enableAudioTrackPlaybackParams;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private int extensionRendererMode = 0;
    private long allowedVideoJoiningTimeMs = DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
    private MediaCodecSelector mediaCodecSelector = MediaCodecSelector.DEFAULT;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.context = context;
        this.codecAdapterFactory = new DefaultMediaCodecAdapterFactory(context);
    }

    public void buildAudioRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, boolean z7, AudioSink audioSink, Handler handler, AudioRendererEventListener audioRendererEventListener, ArrayList<Renderer> arrayList) {
        int i4;
        int i8;
        int i9;
        int i10;
        arrayList.add(new MediaCodecAudioRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, z7, handler, audioRendererEventListener, audioSink));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i4 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(context));
                AbstractC1101a.m2371v(TAG, "Loaded MidiRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i4;
                i4 = size;
                try {
                    i8 = i4 + 1;
                    try {
                        arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        AbstractC1101a.m2371v(TAG, "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i4 = i8;
                        i8 = i4;
                        try {
                            i9 = i8 + 1;
                            arrayList.add(i8, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                            AbstractC1101a.m2371v(TAG, "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused4) {
                        }
                        try {
                            i10 = i9 + 1;
                            try {
                                arrayList.add(i9, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                                AbstractC1101a.m2371v(TAG, "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused5) {
                                i9 = i10;
                                i10 = i9;
                                arrayList.add(i10, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                                AbstractC1101a.m2371v(TAG, "Loaded LibiamfAudioRenderer.");
                            }
                        } catch (ClassNotFoundException unused6) {
                        }
                        arrayList.add(i10, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                        AbstractC1101a.m2371v(TAG, "Loaded LibiamfAudioRenderer.");
                    }
                } catch (ClassNotFoundException unused7) {
                }
                try {
                    i9 = i8 + 1;
                    try {
                        arrayList.add(i8, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        AbstractC1101a.m2371v(TAG, "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused8) {
                        i8 = i9;
                        i9 = i8;
                        i10 = i9 + 1;
                        arrayList.add(i9, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        AbstractC1101a.m2371v(TAG, "Loaded FfmpegAudioRenderer.");
                        arrayList.add(i10, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                        AbstractC1101a.m2371v(TAG, "Loaded LibiamfAudioRenderer.");
                    }
                    try {
                        i10 = i9 + 1;
                        arrayList.add(i9, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        AbstractC1101a.m2371v(TAG, "Loaded FfmpegAudioRenderer.");
                        arrayList.add(i10, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                        AbstractC1101a.m2371v(TAG, "Loaded LibiamfAudioRenderer.");
                    } catch (Exception e) {
                        throw new IllegalStateException("Error instantiating FFmpeg extension", e);
                    }
                } catch (Exception e8) {
                    throw new IllegalStateException("Error instantiating FLAC extension", e8);
                }
            }
            try {
                i8 = i4 + 1;
                arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                AbstractC1101a.m2371v(TAG, "Loaded LibopusAudioRenderer.");
                i9 = i8 + 1;
                arrayList.add(i8, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                AbstractC1101a.m2371v(TAG, "Loaded LibflacAudioRenderer.");
                i10 = i9 + 1;
                arrayList.add(i9, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                AbstractC1101a.m2371v(TAG, "Loaded FfmpegAudioRenderer.");
                try {
                    arrayList.add(i10, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                    AbstractC1101a.m2371v(TAG, "Loaded LibiamfAudioRenderer.");
                } catch (ClassNotFoundException unused9) {
                } catch (Exception e9) {
                    throw new IllegalStateException("Error instantiating IAMF extension", e9);
                }
            } catch (Exception e10) {
                throw new IllegalStateException("Error instantiating Opus extension", e10);
            }
        } catch (Exception e11) {
            throw new IllegalStateException("Error instantiating MIDI extension", e11);
        }
    }

    public AudioSink buildAudioSink(Context context, boolean z7, boolean z8) {
        return new DefaultAudioSink.Builder(context).setEnableFloatOutput(z7).setEnableAudioTrackPlaybackParams(z8).build();
    }

    public void buildCameraMotionRenderers(Context context, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new CameraMotionRenderer());
    }

    public void buildImageRenderers(ArrayList<Renderer> arrayList) {
        arrayList.add(new ImageRenderer(getImageDecoderFactory(), null));
    }

    public void buildMetadataRenderers(Context context, MetadataOutput metadataOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
    }

    public void buildMiscellaneousRenderers(Context context, Handler handler, int i, ArrayList<Renderer> arrayList) {
    }

    public void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:5|(1:7)|44|8|9|52|10|11|50|12|13|(2:55|14)|47|25|26|54|27|(3:56|35|58)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:55|14)|47|25|26|54|27|(3:56|35|58)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void buildVideoRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, boolean z7, Handler handler, VideoRendererEventListener videoRendererEventListener, long j, ArrayList<Renderer> arrayList) throws NoSuchMethodException, SecurityException {
        String str;
        Integer num;
        int i4;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        arrayList.add(new MediaCodecVideoRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, j, z7, handler, videoRendererEventListener, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                Constructor<?> constructor = Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, VideoRendererEventListener.class, cls);
                num = 50;
                try {
                    i4 = size + 1;
                    try {
                        arrayList.add(size, (Renderer) constructor.newInstance(Long.valueOf(j), handler, videoRendererEventListener, 50));
                        str = TAG;
                    } catch (ClassNotFoundException unused) {
                        str = TAG;
                    }
                } catch (ClassNotFoundException unused2) {
                    str = TAG;
                }
            } catch (ClassNotFoundException unused3) {
                str = TAG;
                num = 50;
            }
            try {
                try {
                    AbstractC1101a.m2371v(str, "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused4) {
                    size = i4;
                    i4 = size;
                    int i8 = i4 + 1;
                    arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, VideoRendererEventListener.class, cls).newInstance(Long.valueOf(j), handler, videoRendererEventListener, num));
                    AbstractC1101a.m2371v(str, "Loaded Libgav1VideoRenderer.");
                    arrayList.add(i8, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, VideoRendererEventListener.class, cls).newInstance(Long.valueOf(j), handler, videoRendererEventListener, num));
                    AbstractC1101a.m2371v(str, "Loaded FfmpegVideoRenderer.");
                }
                int i82 = i4 + 1;
                arrayList.add(i4, (Renderer) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, VideoRendererEventListener.class, cls).newInstance(Long.valueOf(j), handler, videoRendererEventListener, num));
                AbstractC1101a.m2371v(str, "Loaded Libgav1VideoRenderer.");
                try {
                    arrayList.add(i82, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, VideoRendererEventListener.class, cls).newInstance(Long.valueOf(j), handler, videoRendererEventListener, num));
                    AbstractC1101a.m2371v(str, "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e);
                }
            } catch (Exception e8) {
                throw new IllegalStateException("Error instantiating AV1 extension", e8);
            }
        } catch (Exception e9) {
            throw new IllegalStateException("Error instantiating VP9 extension", e9);
        }
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) throws NoSuchMethodException, SecurityException {
        Handler handler2;
        ArrayList<Renderer> arrayList = new ArrayList<>();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs, arrayList);
        AudioSink audioSinkBuildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioTrackPlaybackParams);
        if (audioSinkBuildAudioSink != null) {
            handler2 = handler;
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, audioSinkBuildAudioSink, handler2, audioRendererEventListener, arrayList);
        } else {
            handler2 = handler;
        }
        buildTextRenderers(this.context, textOutput, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildImageRenderers(arrayList);
        buildMiscellaneousRenderers(this.context, handler2, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    public final DefaultRenderersFactory experimentalSetMediaCodecAsyncCryptoFlagEnabled(boolean z7) {
        this.codecAdapterFactory.experimentalSetAsyncCryptoFlagEnabled(z7);
        return this;
    }

    public final DefaultRenderersFactory forceDisableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceDisableAsynchronous();
        return this;
    }

    public final DefaultRenderersFactory forceEnableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceEnableAsynchronous();
        return this;
    }

    public MediaCodecAdapter.Factory getCodecAdapterFactory() {
        return this.codecAdapterFactory;
    }

    public ImageDecoder.Factory getImageDecoderFactory() {
        return ImageDecoder.Factory.DEFAULT;
    }

    public final DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j) {
        this.allowedVideoJoiningTimeMs = j;
        return this;
    }

    public final DefaultRenderersFactory setEnableAudioFloatOutput(boolean z7) {
        this.enableFloatOutput = z7;
        return this;
    }

    public final DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean z7) {
        this.enableAudioTrackPlaybackParams = z7;
        return this;
    }

    public final DefaultRenderersFactory setEnableDecoderFallback(boolean z7) {
        this.enableDecoderFallback = z7;
        return this;
    }

    public final DefaultRenderersFactory setExtensionRendererMode(int i) {
        this.extensionRendererMode = i;
        return this;
    }

    public final DefaultRenderersFactory setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
        this.mediaCodecSelector = mediaCodecSelector;
        return this;
    }
}
