package androidx.media3.common.audio;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import okhttp3.internal.p129ws.C2153d;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.audio.i */
/* loaded from: classes.dex */
public class C0181i implements InterfaceC0176d {
    private static final float CLOSE_THRESHOLD = 1.0E-4f;
    private static final int MIN_BYTES_FOR_DURATION_SCALING_CALCULATION = 1024;
    public static final int SAMPLE_RATE_NO_CHANGE = -1;
    private ByteBuffer buffer;
    private C0174b inputAudioFormat;
    private long inputBytes;
    private boolean inputEnded;
    private C0174b outputAudioFormat;
    private ByteBuffer outputBuffer;
    private long outputBytes;
    private C0174b pendingInputAudioFormat;
    private C0174b pendingOutputAudioFormat;
    private int pendingOutputSampleRate;
    private boolean pendingSonicRecreation;
    private ShortBuffer shortBuffer;
    private C0180h sonic;
    private float speed = 1.0f;
    private float pitch = 1.0f;

    public C0181i() {
        C0174b c0174b = C0174b.f980e;
        this.pendingInputAudioFormat = c0174b;
        this.pendingOutputAudioFormat = c0174b;
        this.inputAudioFormat = c0174b;
        this.outputAudioFormat = c0174b;
        ByteBuffer byteBuffer = InterfaceC0176d.f985a;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public final C0174b configure(C0174b c0174b) throws C0175c {
        if (c0174b.f983c != 2) {
            throw new C0175c(c0174b);
        }
        int i = this.pendingOutputSampleRate;
        if (i == -1) {
            i = c0174b.f981a;
        }
        this.pendingInputAudioFormat = c0174b;
        C0174b c0174b2 = new C0174b(i, c0174b.f982b, 2);
        this.pendingOutputAudioFormat = c0174b2;
        this.pendingSonicRecreation = true;
        return c0174b2;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public final void flush() {
        if (isActive()) {
            C0174b c0174b = this.pendingInputAudioFormat;
            this.inputAudioFormat = c0174b;
            C0174b c0174b2 = this.pendingOutputAudioFormat;
            this.outputAudioFormat = c0174b2;
            if (this.pendingSonicRecreation) {
                this.sonic = new C0180h(c0174b.f981a, c0174b.f982b, this.speed, this.pitch, c0174b2.f981a);
            } else {
                C0180h c0180h = this.sonic;
                if (c0180h != null) {
                    c0180h.f999k = 0;
                    c0180h.f1001m = 0;
                    c0180h.f1003o = 0;
                    c0180h.f1004p = 0;
                    c0180h.f1005q = 0;
                    c0180h.f1006r = 0;
                    c0180h.f1007s = 0;
                    c0180h.f1008t = 0;
                    c0180h.f1009u = 0;
                    c0180h.f1010v = 0;
                    c0180h.f1011w = 0.0d;
                }
            }
        }
        this.outputBuffer = InterfaceC0176d.f985a;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    public long getDurationAfterProcessorApplied(long j) {
        return getPlayoutDuration(j);
    }

    public final long getMediaDuration(long j) {
        if (this.outputBytes < C2153d.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (this.speed * j);
        }
        long j8 = this.inputBytes;
        this.sonic.getClass();
        long j9 = j8 - ((r2.f999k * r2.f990b) * 2);
        int i = this.outputAudioFormat.f981a;
        int i4 = this.inputAudioFormat.f981a;
        return i == i4 ? AbstractC1118i0.m2437a0(j, j9, this.outputBytes, RoundingMode.DOWN) : AbstractC1118i0.m2437a0(j, j9 * i, this.outputBytes * i4, RoundingMode.DOWN);
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public final ByteBuffer getOutput() {
        C0180h c0180h = this.sonic;
        if (c0180h != null) {
            int i = c0180h.f990b;
            int i4 = c0180h.f1001m * i * 2;
            if (i4 > 0) {
                if (this.buffer.capacity() < i4) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
                    this.buffer = byteBufferOrder;
                    this.shortBuffer = byteBufferOrder.asShortBuffer();
                } else {
                    this.buffer.clear();
                    this.shortBuffer.clear();
                }
                ShortBuffer shortBuffer = this.shortBuffer;
                int iMin = Math.min(shortBuffer.remaining() / i, c0180h.f1001m);
                int i8 = iMin * i;
                shortBuffer.put(c0180h.f1000l, 0, i8);
                int i9 = c0180h.f1001m - iMin;
                c0180h.f1001m = i9;
                short[] sArr = c0180h.f1000l;
                System.arraycopy(sArr, i8, sArr, 0, i9 * i);
                this.outputBytes += i4;
                this.buffer.limit(i4);
                this.outputBuffer = this.buffer;
            }
        }
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = InterfaceC0176d.f985a;
        return byteBuffer;
    }

    public final long getPlayoutDuration(long j) {
        if (this.outputBytes < C2153d.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (j / this.speed);
        }
        long j8 = this.inputBytes;
        this.sonic.getClass();
        long j9 = j8 - ((r2.f999k * r2.f990b) * 2);
        int i = this.outputAudioFormat.f981a;
        int i4 = this.inputAudioFormat.f981a;
        return i == i4 ? AbstractC1118i0.m2437a0(j, this.outputBytes, j9, RoundingMode.DOWN) : AbstractC1118i0.m2437a0(j, this.outputBytes * i4, j9 * i, RoundingMode.DOWN);
    }

    public final long getProcessedInputBytes() {
        long j = this.inputBytes;
        this.sonic.getClass();
        return j - ((r2.f999k * r2.f990b) * 2);
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public final boolean isActive() {
        if (this.pendingOutputAudioFormat.f981a != -1) {
            return Math.abs(this.speed - 1.0f) >= CLOSE_THRESHOLD || Math.abs(this.pitch - 1.0f) >= CLOSE_THRESHOLD || this.pendingOutputAudioFormat.f981a != this.pendingInputAudioFormat.f981a;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public final boolean isEnded() {
        if (!this.inputEnded) {
            return false;
        }
        C0180h c0180h = this.sonic;
        return c0180h == null || (c0180h.f1001m * c0180h.f990b) * 2 == 0;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public final void queueEndOfStream() {
        C0180h c0180h = this.sonic;
        if (c0180h != null) {
            int i = c0180h.f999k;
            float f8 = c0180h.f991c;
            float f9 = c0180h.f992d;
            double d8 = f8 / f9;
            int i4 = c0180h.f1001m + ((int) (((((((i - r6) / d8) + c0180h.f1006r) + c0180h.f1011w) + c0180h.f1003o) / (c0180h.f993e * f9)) + 0.5d));
            c0180h.f1011w = 0.0d;
            short[] sArr = c0180h.f998j;
            int i8 = c0180h.f996h * 2;
            c0180h.f998j = c0180h.m601c(sArr, i, i8 + i);
            int i9 = 0;
            while (true) {
                int i10 = c0180h.f990b;
                if (i9 >= i8 * i10) {
                    break;
                }
                c0180h.f998j[(i10 * i) + i9] = 0;
                i9++;
            }
            c0180h.f999k = i8 + c0180h.f999k;
            c0180h.m603f();
            if (c0180h.f1001m > i4) {
                c0180h.f1001m = i4;
            }
            c0180h.f999k = 0;
            c0180h.f1006r = 0;
            c0180h.f1003o = 0;
        }
        this.inputEnded = true;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public final void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C0180h c0180h = this.sonic;
            c0180h.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.inputBytes += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = c0180h.f990b;
            int i4 = iRemaining2 / i;
            short[] sArrM601c = c0180h.m601c(c0180h.f998j, c0180h.f999k, i4);
            c0180h.f998j = sArrM601c;
            shortBufferAsShortBuffer.get(sArrM601c, c0180h.f999k * i, ((i4 * i) * 2) / 2);
            c0180h.f999k += i4;
            c0180h.m603f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public final void reset() {
        this.speed = 1.0f;
        this.pitch = 1.0f;
        C0174b c0174b = C0174b.f980e;
        this.pendingInputAudioFormat = c0174b;
        this.pendingOutputAudioFormat = c0174b;
        this.inputAudioFormat = c0174b;
        this.outputAudioFormat = c0174b;
        ByteBuffer byteBuffer = InterfaceC0176d.f985a;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
        this.pendingSonicRecreation = false;
        this.sonic = null;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    public final void setOutputSampleRateHz(int i) {
        this.pendingOutputSampleRate = i;
    }

    public final void setPitch(float f8) {
        if (this.pitch != f8) {
            this.pitch = f8;
            this.pendingSonicRecreation = true;
        }
    }

    public final void setSpeed(float f8) {
        if (this.speed != f8) {
            this.speed = f8;
            this.pendingSonicRecreation = true;
        }
    }
}
