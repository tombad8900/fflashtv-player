package androidx.media3.exoplayer.audio;

import android.util.SparseArray;
import androidx.media3.common.audio.C0174b;
import androidx.media3.common.audio.C0179g;
import androidx.media3.exoplayer.audio.TeeAudioProcessor;
import java.nio.ByteBuffer;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class WaveformAudioBufferSink implements TeeAudioProcessor.AudioBufferSink {
    private final int barsPerSecond;
    private C0179g channelMixingMatrix;
    private C0174b inputAudioFormat;
    private final Listener listener;
    private C0174b mixingAudioFormat;
    private final ByteBuffer mixingBuffer;
    private final SparseArray<WaveformBar> outputChannels;
    private int samplesPerBar;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Listener {
        void onNewWaveformBar(int i, WaveformBar waveformBar);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class WaveformBar {
        private int sampleCount;
        private double squareSum;
        private float minSampleValue = 1.0f;
        private float maxSampleValue = -1.0f;

        public void addSample(float f8) {
            if (f8 < -1.0f || f8 > 1.0f) {
                throw new IllegalArgumentException();
            }
            this.minSampleValue = Math.min(this.minSampleValue, f8);
            this.maxSampleValue = Math.max(this.maxSampleValue, f8);
            double d8 = f8;
            this.squareSum = (d8 * d8) + this.squareSum;
            this.sampleCount++;
        }

        public double getMaxSampleValue() {
            return this.maxSampleValue;
        }

        public double getMinSampleValue() {
            return this.minSampleValue;
        }

        public double getRootMeanSquare() {
            return Math.sqrt(this.squareSum / this.sampleCount);
        }

        public int getSampleCount() {
            return this.sampleCount;
        }
    }

    public WaveformAudioBufferSink(int i, int i4, Listener listener) {
        this.barsPerSecond = i;
        this.listener = listener;
        this.mixingBuffer = ByteBuffer.allocate(AbstractC1118i0.m2414E(4, i4));
        this.outputChannels = new SparseArray<>(i4);
        for (int i8 = 0; i8 < i4; i8++) {
            this.outputChannels.append(i8, new WaveformBar());
        }
    }

    @Override // androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink
    public void flush(int i, int i4, int i8) {
        float[] fArr;
        this.samplesPerBar = i / this.barsPerSecond;
        this.inputAudioFormat = new C0174b(i, i4, i8);
        this.mixingAudioFormat = new C0174b(i, this.outputChannels.size(), 4);
        int size = this.outputChannels.size();
        if (i4 == size) {
            fArr = new float[size * size];
            for (int i9 = 0; i9 < size; i9++) {
                fArr[(size * i9) + i9] = 1.0f;
            }
        } else if (i4 == 1 && size == 2) {
            fArr = new float[]{1.0f, 1.0f};
        } else {
            if (i4 != 2 || size != 1) {
                throw new UnsupportedOperationException("Default channel mixing coefficients for " + i4 + "->" + size + " are not yet implemented.");
            }
            fArr = new float[]{0.5f, 0.5f};
        }
        this.channelMixingMatrix = new C0179g(i4, size, fArr);
    }

    @Override // androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink
    public void handleBuffer(ByteBuffer byteBuffer) {
        float fM2450i;
        AbstractC1101a.m2360k(this.inputAudioFormat);
        AbstractC1101a.m2360k(this.mixingAudioFormat);
        AbstractC1101a.m2360k(this.channelMixingMatrix);
        while (byteBuffer.hasRemaining()) {
            this.mixingBuffer.rewind();
            C0174b c0174b = this.inputAudioFormat;
            ByteBuffer byteBuffer2 = this.mixingBuffer;
            C0174b c0174b2 = this.mixingAudioFormat;
            C0179g c0179g = this.channelMixingMatrix;
            boolean z7 = c0174b.f983c == 2;
            boolean z8 = c0174b2.f983c == 2;
            int i = c0179g.f986a;
            int i4 = c0179g.f987b;
            float[] fArr = new float[i];
            float[] fArr2 = new float[i4];
            for (int i8 = 0; i8 < i; i8++) {
                if (z8) {
                    if (z7) {
                        fM2450i = byteBuffer.getShort();
                    } else {
                        float f8 = byteBuffer.getFloat();
                        fM2450i = AbstractC1118i0.m2450i((f8 < 0.0f ? 32768 : 32767) * f8, -32768.0f, 32767.0f);
                    }
                } else if (z7) {
                    short s8 = byteBuffer.getShort();
                    fM2450i = s8 / (s8 < 0 ? 32768 : 32767);
                } else {
                    fM2450i = byteBuffer.getFloat();
                }
                fArr[i8] = fM2450i;
            }
            for (int i9 = 0; i9 < i4; i9++) {
                for (int i10 = 0; i10 < i; i10++) {
                    fArr2[i9] = (c0179g.f988c[(i10 * i4) + i9] * fArr[i10]) + fArr2[i9];
                }
                if (z8) {
                    byteBuffer2.putShort((short) AbstractC1118i0.m2450i(fArr2[i9], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(AbstractC1118i0.m2450i(fArr2[i9], -1.0f, 1.0f));
                }
                fArr2[i9] = 0.0f;
            }
            this.mixingBuffer.rewind();
            for (int i11 = 0; i11 < this.outputChannels.size(); i11++) {
                WaveformBar waveformBar = this.outputChannels.get(i11);
                waveformBar.addSample(this.mixingBuffer.getFloat());
                if (waveformBar.getSampleCount() >= this.samplesPerBar) {
                    this.listener.onNewWaveformBar(i11, waveformBar);
                    this.outputChannels.put(i11, new WaveformBar());
                }
            }
        }
    }
}
