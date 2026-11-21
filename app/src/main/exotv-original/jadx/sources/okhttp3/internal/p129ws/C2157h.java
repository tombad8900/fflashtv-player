package okhttp3.internal.p129ws;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import okhttp3.C2181z;
import okhttp3.internal.http2.C2131o;
import p147q7.AbstractC2278c;
import p189v7.C2569h;
import p189v7.C2573j;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.ws.h */
/* loaded from: classes.dex */
public final class C2157h implements Closeable {
    private boolean closed;
    private final C2573j controlFrameBuffer;
    private final InterfaceC2156g frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final C2569h maskCursor;
    private final byte[] maskKey;
    private final C2573j messageFrameBuffer;
    private C2152c messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final InterfaceC2577l source;

    public C2157h(boolean z7, InterfaceC2577l interfaceC2577l, InterfaceC2156g interfaceC2156g, boolean z8, boolean z9) {
        AbstractC2980h.m5136e("source", interfaceC2577l);
        AbstractC2980h.m5136e("frameCallback", interfaceC2156g);
        this.isClient = z7;
        this.source = interfaceC2577l;
        this.frameCallback = interfaceC2156g;
        this.perMessageDeflate = z8;
        this.noContextTakeover = z9;
        this.controlFrameBuffer = new C2573j();
        this.messageFrameBuffer = new C2573j();
        this.maskKey = z7 ? null : new byte[4];
        this.maskCursor = z7 ? null : new C2569h();
    }

    private final void readControlFrame() throws ProtocolException, EOFException {
        short s8;
        String strM4651G;
        long j = this.frameLength;
        if (j > 0) {
            this.source.mo4604A(this.controlFrameBuffer, j);
            if (!this.isClient) {
                C2573j c2573j = this.controlFrameBuffer;
                C2569h c2569h = this.maskCursor;
                AbstractC2980h.m5133b(c2569h);
                c2573j.m4670x(c2569h);
                this.maskCursor.m4631c(0L);
                C2155f c2155f = C2155f.INSTANCE;
                C2569h c2569h2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                AbstractC2980h.m5133b(bArr);
                c2155f.toggleMask(c2569h2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                C2573j c2573j2 = this.controlFrameBuffer;
                long j8 = c2573j2.f9314k;
                if (j8 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j8 != 0) {
                    s8 = c2573j2.readShort();
                    strM4651G = this.controlFrameBuffer.m4651G();
                    String strCloseCodeExceptionMessage = C2155f.INSTANCE.closeCodeExceptionMessage(s8);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new ProtocolException(strCloseCodeExceptionMessage);
                    }
                } else {
                    s8 = 1005;
                    strM4651G = C2181z.FRAGMENT_ENCODE_SET;
                }
                this.frameCallback.onReadClose(s8, strM4651G);
                this.closed = true;
                return;
            case 9:
                InterfaceC2156g interfaceC2156g = this.frameCallback;
                C2573j c2573j3 = this.controlFrameBuffer;
                interfaceC2156g.onReadPing(c2573j3.mo4610d(c2573j3.f9314k));
                return;
            case 10:
                InterfaceC2156g interfaceC2156g2 = this.frameCallback;
                C2573j c2573j4 = this.controlFrameBuffer;
                interfaceC2156g2.onReadPong(c2573j4.mo4610d(c2573j4.f9314k));
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + AbstractC2278c.toHexString(this.opcode));
        }
    }

    private final void readHeader() throws IOException {
        boolean z7;
        if (this.closed) {
            throw new IOException("closed");
        }
        long jTimeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int iAnd = AbstractC2278c.and(this.source.readByte(), 255);
            this.source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            int i = iAnd & 15;
            this.opcode = i;
            boolean z8 = (iAnd & 128) != 0;
            this.isFinalFrame = z8;
            boolean z9 = (iAnd & 8) != 0;
            this.isControlFrame = z9;
            if (z9 && !z8) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z10 = (iAnd & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z10) {
                    z7 = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z7 = true;
                }
                this.readingCompressedMessage = z7;
            } else if (z10) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iAnd & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iAnd & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iAnd2 = AbstractC2278c.and(this.source.readByte(), 255);
            boolean z11 = (iAnd2 & 128) != 0;
            if (z11 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = iAnd2 & 127;
            this.frameLength = j;
            if (j == 126) {
                this.frameLength = AbstractC2278c.and(this.source.readShort(), C2131o.DEFAULT_INITIAL_WINDOW_SIZE);
            } else if (j == 127) {
                long j8 = this.source.readLong();
                this.frameLength = j8;
                if (j8 < 0) {
                    throw new ProtocolException("Frame length 0x" + AbstractC2278c.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z11) {
                InterfaceC2577l interfaceC2577l = this.source;
                byte[] bArr = this.maskKey;
                AbstractC2980h.m5133b(bArr);
                interfaceC2577l.readFully(bArr);
            }
        } catch (Throwable th) {
            this.source.timeout().timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.mo4604A(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    C2573j c2573j = this.messageFrameBuffer;
                    C2569h c2569h = this.maskCursor;
                    AbstractC2980h.m5133b(c2569h);
                    c2573j.m4670x(c2569h);
                    this.maskCursor.m4631c(this.messageFrameBuffer.f9314k - this.frameLength);
                    C2155f c2155f = C2155f.INSTANCE;
                    C2569h c2569h2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    AbstractC2980h.m5133b(bArr);
                    c2155f.toggleMask(c2569h2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + AbstractC2278c.toHexString(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws DataFormatException, IOException {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + AbstractC2278c.toHexString(i));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            C2152c c2152c = this.messageInflater;
            if (c2152c == null) {
                c2152c = new C2152c(this.noContextTakeover);
                this.messageInflater = c2152c;
            }
            c2152c.inflate(this.messageFrameBuffer);
        }
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.m4651G());
            return;
        }
        InterfaceC2156g interfaceC2156g = this.frameCallback;
        C2573j c2573j = this.messageFrameBuffer;
        interfaceC2156g.onReadMessage(c2573j.mo4610d(c2573j.f9314k));
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C2152c c2152c = this.messageInflater;
        if (c2152c != null) {
            c2152c.close();
        }
    }

    public final InterfaceC2577l getSource() {
        return this.source;
    }

    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
