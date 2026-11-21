package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.audio.f */
/* loaded from: classes.dex */
public abstract class AbstractC0178f implements InterfaceC0176d {
    private ByteBuffer buffer;
    protected C0174b inputAudioFormat;
    private boolean inputEnded;
    protected C0174b outputAudioFormat;
    private ByteBuffer outputBuffer;
    private C0174b pendingInputAudioFormat;
    private C0174b pendingOutputAudioFormat;

    public AbstractC0178f() {
        ByteBuffer byteBuffer = InterfaceC0176d.f985a;
        this.buffer = byteBuffer;
        this.outputBuffer = byteBuffer;
        C0174b c0174b = C0174b.f980e;
        this.pendingInputAudioFormat = c0174b;
        this.pendingOutputAudioFormat = c0174b;
        this.inputAudioFormat = c0174b;
        this.outputAudioFormat = c0174b;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public final C0174b configure(C0174b c0174b) {
        this.pendingInputAudioFormat = c0174b;
        this.pendingOutputAudioFormat = onConfigure(c0174b);
        return isActive() ? this.pendingOutputAudioFormat : C0174b.f980e;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public final void flush() {
        this.outputBuffer = InterfaceC0176d.f985a;
        this.inputEnded = false;
        this.inputAudioFormat = this.pendingInputAudioFormat;
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        onFlush();
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = InterfaceC0176d.f985a;
        return byteBuffer;
    }

    public final boolean hasPendingOutput() {
        return this.outputBuffer.hasRemaining();
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public boolean isActive() {
        return this.pendingOutputAudioFormat != C0174b.f980e;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public boolean isEnded() {
        return this.inputEnded && this.outputBuffer == InterfaceC0176d.f985a;
    }

    public C0174b onConfigure(C0174b c0174b) {
        return C0174b.f980e;
    }

    public void onFlush() {
    }

    public void onQueueEndOfStream() {
    }

    public void onReset() {
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public final void queueEndOfStream() {
        this.inputEnded = true;
        onQueueEndOfStream();
    }

    public final ByteBuffer replaceOutputBuffer(int i) {
        if (this.buffer.capacity() < i) {
            this.buffer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.buffer.clear();
        }
        ByteBuffer byteBuffer = this.buffer;
        this.outputBuffer = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.InterfaceC0176d
    public final void reset() {
        flush();
        this.buffer = InterfaceC0176d.f985a;
        C0174b c0174b = C0174b.f980e;
        this.pendingInputAudioFormat = c0174b;
        this.pendingOutputAudioFormat = c0174b;
        this.inputAudioFormat = c0174b;
        this.outputAudioFormat = c0174b;
        onReset();
    }
}
