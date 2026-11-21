package okhttp3.internal.p129ws;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Random;
import p189v7.C2566f0;
import p189v7.C2569h;
import p189v7.C2573j;
import p189v7.C2579m;
import p189v7.InterfaceC2575k;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.ws.i */
/* loaded from: classes.dex */
public final class C2158i implements Closeable {
    private final boolean isClient;
    private final C2569h maskCursor;
    private final byte[] maskKey;
    private final C2573j messageBuffer;
    private C2150a messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final InterfaceC2575k sink;
    private final C2573j sinkBuffer;
    private boolean writerClosed;

    public C2158i(boolean z7, InterfaceC2575k interfaceC2575k, Random random, boolean z8, boolean z9, long j) {
        AbstractC2980h.m5136e("sink", interfaceC2575k);
        AbstractC2980h.m5136e("random", random);
        this.isClient = z7;
        this.sink = interfaceC2575k;
        this.random = random;
        this.perMessageDeflate = z8;
        this.noContextTakeover = z9;
        this.minimumDeflateSize = j;
        this.messageBuffer = new C2573j();
        this.sinkBuffer = interfaceC2575k.mo4596a();
        this.maskKey = z7 ? new byte[4] : null;
        this.maskCursor = z7 ? new C2569h() : null;
    }

    private final void writeControlFrame(int i, C2579m c2579m) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int iMo4634d = c2579m.mo4634d();
        if (iMo4634d > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.m4655K(i | 128);
        if (this.isClient) {
            this.sinkBuffer.m4655K(iMo4634d | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            AbstractC2980h.m5133b(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.m5288write(this.maskKey);
            if (iMo4634d > 0) {
                C2573j c2573j = this.sinkBuffer;
                long j = c2573j.f9314k;
                c2573j.m4654J(c2579m);
                C2573j c2573j2 = this.sinkBuffer;
                C2569h c2569h = this.maskCursor;
                AbstractC2980h.m5133b(c2569h);
                c2573j2.m4670x(c2569h);
                this.maskCursor.m4631c(j);
                C2155f.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.m4655K(iMo4634d);
            this.sinkBuffer.m4654J(c2579m);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        C2150a c2150a = this.messageDeflater;
        if (c2150a != null) {
            c2150a.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final InterfaceC2575k getSink() {
        return this.sink;
    }

    public final void writeClose(int i, C2579m c2579m) throws EOFException {
        C2579m c2579mMo4610d = C2579m.f9316m;
        if (i != 0 || c2579m != null) {
            if (i != 0) {
                C2155f.INSTANCE.validateCloseCode(i);
            }
            C2573j c2573j = new C2573j();
            c2573j.m4659O(i);
            if (c2579m != null) {
                c2573j.m4654J(c2579m);
            }
            c2579mMo4610d = c2573j.mo4610d(c2573j.f9314k);
        }
        try {
            writeControlFrame(8, c2579mMo4610d);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, C2579m c2579m) throws IOException {
        AbstractC2980h.m5136e("data", c2579m);
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.m4654J(c2579m);
        int i4 = i | 128;
        if (this.perMessageDeflate && c2579m.mo4634d() >= this.minimumDeflateSize) {
            C2150a c2150a = this.messageDeflater;
            if (c2150a == null) {
                c2150a = new C2150a(this.noContextTakeover);
                this.messageDeflater = c2150a;
            }
            c2150a.deflate(this.messageBuffer);
            i4 = i | 192;
        }
        long j = this.messageBuffer.f9314k;
        this.sinkBuffer.m4655K(i4);
        int i8 = this.isClient ? 128 : 0;
        if (j <= 125) {
            this.sinkBuffer.m4655K(i8 | ((int) j));
        } else if (j <= C2155f.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.m4655K(i8 | C2155f.PAYLOAD_SHORT);
            this.sinkBuffer.m4659O((int) j);
        } else {
            this.sinkBuffer.m4655K(i8 | 127);
            C2573j c2573j = this.sinkBuffer;
            C2566f0 c2566f0M4653I = c2573j.m4653I(8);
            byte[] bArr = c2566f0M4653I.f9292a;
            int i9 = c2566f0M4653I.f9294c;
            bArr[i9] = (byte) ((j >>> 56) & 255);
            bArr[i9 + 1] = (byte) ((j >>> 48) & 255);
            bArr[i9 + 2] = (byte) ((j >>> 40) & 255);
            bArr[i9 + 3] = (byte) ((j >>> 32) & 255);
            bArr[i9 + 4] = (byte) ((j >>> 24) & 255);
            bArr[i9 + 5] = (byte) ((j >>> 16) & 255);
            bArr[i9 + 6] = (byte) ((j >>> 8) & 255);
            bArr[i9 + 7] = (byte) (j & 255);
            c2566f0M4653I.f9294c = i9 + 8;
            c2573j.f9314k += 8;
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr2 = this.maskKey;
            AbstractC2980h.m5133b(bArr2);
            random.nextBytes(bArr2);
            this.sinkBuffer.m5288write(this.maskKey);
            if (j > 0) {
                C2573j c2573j2 = this.messageBuffer;
                C2569h c2569h = this.maskCursor;
                AbstractC2980h.m5133b(c2569h);
                c2573j2.m4670x(c2569h);
                this.maskCursor.m4631c(0L);
                C2155f.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, j);
        this.sink.mo4597e();
    }

    public final void writePing(C2579m c2579m) {
        AbstractC2980h.m5136e("payload", c2579m);
        writeControlFrame(9, c2579m);
    }

    public final void writePong(C2579m c2579m) throws IOException {
        AbstractC2980h.m5136e("payload", c2579m);
        writeControlFrame(10, c2579m);
    }
}
