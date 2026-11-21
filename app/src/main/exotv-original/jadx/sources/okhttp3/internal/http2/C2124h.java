package okhttp3.internal.http2;

import androidx.media3.exoplayer.DecoderReuseEvaluation;
import com.bumptech.glide.AbstractC0714c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.C2120d;
import p002a1.AbstractC0008a1;
import p044e7.C0924a;
import p147q7.AbstractC2278c;
import p189v7.C2573j;
import p189v7.C2579m;
import p189v7.C2582n0;
import p189v7.InterfaceC2576k0;
import p189v7.InterfaceC2577l;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http2.h */
/* loaded from: classes.dex */
public final class C2124h implements Closeable {
    public static final a Companion = new a(null);
    private static final Logger logger;
    private final boolean client;
    private final b continuation;
    private final C2120d.a hpackReader;
    private final InterfaceC2577l source;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final Logger getLogger() {
            return C2124h.logger;
        }

        public final int lengthWithoutPadding(int i, int i4, int i8) throws IOException {
            if ((i4 & 8) != 0) {
                i--;
            }
            if (i8 <= i) {
                return i - i8;
            }
            throw new IOException(AbstractC0008a1.m11g(i8, i, "PROTOCOL_ERROR padding ", " > remaining length "));
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.h$b */
    public static final class b implements InterfaceC2576k0 {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final InterfaceC2577l source;
        private int streamId;

        public b(InterfaceC2577l interfaceC2577l) {
            AbstractC2980h.m5136e("source", interfaceC2577l);
            this.source = interfaceC2577l;
        }

        private final void readContinuationHeader() throws IOException {
            int i = this.streamId;
            int medium = AbstractC2278c.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            int iAnd = AbstractC2278c.and(this.source.readByte(), 255);
            this.flags = AbstractC2278c.and(this.source.readByte(), 255);
            a aVar = C2124h.Companion;
            if (aVar.getLogger().isLoggable(Level.FINE)) {
                aVar.getLogger().fine(C2121e.INSTANCE.frameLog(true, this.streamId, this.length, iAnd, this.flags));
            }
            int i4 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i4;
            if (iAnd == 9) {
                if (i4 != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iAnd + " != TYPE_CONTINUATION");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // p189v7.InterfaceC2576k0
        public long read(C2573j c2573j, long j) throws IOException {
            AbstractC2980h.m5136e("sink", c2573j);
            while (true) {
                int i = this.left;
                if (i != 0) {
                    long j8 = this.source.read(c2573j, Math.min(j, i));
                    if (j8 == -1) {
                        return -1L;
                    }
                    this.left -= (int) j8;
                    return j8;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        @Override // p189v7.InterfaceC2576k0
        public C2582n0 timeout() {
            return this.source.timeout();
        }
    }

    static {
        Logger logger2 = Logger.getLogger(C2121e.class.getName());
        AbstractC2980h.m5135d("getLogger(Http2::class.java.name)", logger2);
        logger = logger2;
    }

    public C2124h(InterfaceC2577l interfaceC2577l, boolean z7) {
        AbstractC2980h.m5136e("source", interfaceC2577l);
        this.source = interfaceC2577l;
        this.client = z7;
        b bVar = new b(interfaceC2577l);
        this.continuation = bVar;
        this.hpackReader = new C2120d.a(bVar, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED, 0, 4, null);
    }

    private final void readData(InterfaceC2125i interfaceC2125i, int i, int i4, int i8) throws IOException {
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z7 = (i4 & 1) != 0;
        if ((i4 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iAnd = (i4 & 8) != 0 ? AbstractC2278c.and(this.source.readByte(), 255) : 0;
        interfaceC2125i.data(z7, i8, this.source, Companion.lengthWithoutPadding(i, i4, iAnd));
        this.source.skip(iAnd);
    }

    private final void readGoAway(InterfaceC2125i interfaceC2125i, int i, int i4, int i8) throws IOException {
        if (i < 8) {
            throw new IOException(AbstractC0008a1.m12h(i, "TYPE_GOAWAY length < 8: "));
        }
        if (i8 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i9 = this.source.readInt();
        int i10 = this.source.readInt();
        int i11 = i - 8;
        EnumC2118b enumC2118bFromHttp2 = EnumC2118b.Companion.fromHttp2(i10);
        if (enumC2118bFromHttp2 == null) {
            throw new IOException(AbstractC0008a1.m12h(i10, "TYPE_GOAWAY unexpected error code: "));
        }
        C2579m c2579mMo4610d = C2579m.f9316m;
        if (i11 > 0) {
            c2579mMo4610d = this.source.mo4610d(i11);
        }
        interfaceC2125i.goAway(i9, enumC2118bFromHttp2, c2579mMo4610d);
    }

    private final List<C2119c> readHeaderBlock(int i, int i4, int i8, int i9) throws IOException {
        this.continuation.setLeft(i);
        b bVar = this.continuation;
        bVar.setLength(bVar.getLeft());
        this.continuation.setPadding(i4);
        this.continuation.setFlags(i8);
        this.continuation.setStreamId(i9);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(InterfaceC2125i interfaceC2125i, int i, int i4, int i8) throws IOException {
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z7 = (i4 & 1) != 0;
        int iAnd = (i4 & 8) != 0 ? AbstractC2278c.and(this.source.readByte(), 255) : 0;
        if ((i4 & 32) != 0) {
            readPriority(interfaceC2125i, i8);
            i -= 5;
        }
        interfaceC2125i.headers(z7, i8, -1, readHeaderBlock(Companion.lengthWithoutPadding(i, i4, iAnd), iAnd, i4, i8));
    }

    private final void readPing(InterfaceC2125i interfaceC2125i, int i, int i4, int i8) throws IOException {
        if (i != 8) {
            throw new IOException(AbstractC0008a1.m12h(i, "TYPE_PING length != 8: "));
        }
        if (i8 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        interfaceC2125i.ping((i4 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void readPriority(InterfaceC2125i interfaceC2125i, int i, int i4, int i8) throws IOException {
        if (i != 5) {
            throw new IOException(AbstractC0008a1.m14j("TYPE_PRIORITY length: ", i, " != 5"));
        }
        if (i8 == 0) {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        readPriority(interfaceC2125i, i8);
    }

    private final void readPushPromise(InterfaceC2125i interfaceC2125i, int i, int i4, int i8) throws IOException {
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iAnd = (i4 & 8) != 0 ? AbstractC2278c.and(this.source.readByte(), 255) : 0;
        interfaceC2125i.pushPromise(i8, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(Companion.lengthWithoutPadding(i - 4, i4, iAnd), iAnd, i4, i8));
    }

    private final void readRstStream(InterfaceC2125i interfaceC2125i, int i, int i4, int i8) throws IOException {
        if (i != 4) {
            throw new IOException(AbstractC0008a1.m14j("TYPE_RST_STREAM length: ", i, " != 4"));
        }
        if (i8 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i9 = this.source.readInt();
        EnumC2118b enumC2118bFromHttp2 = EnumC2118b.Companion.fromHttp2(i9);
        if (enumC2118bFromHttp2 == null) {
            throw new IOException(AbstractC0008a1.m12h(i9, "TYPE_RST_STREAM unexpected error code: "));
        }
        interfaceC2125i.rstStream(i8, enumC2118bFromHttp2);
    }

    private final void readSettings(InterfaceC2125i interfaceC2125i, int i, int i4, int i8) throws IOException {
        int i9;
        if (i8 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i4 & 1) != 0) {
            if (i != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            interfaceC2125i.ackSettings();
            return;
        }
        if (i % 6 != 0) {
            throw new IOException(AbstractC0008a1.m12h(i, "TYPE_SETTINGS length % 6 != 0: "));
        }
        C2131o c2131o = new C2131o();
        C0924a c0924aM1513b0 = AbstractC0714c.m1513b0(AbstractC0714c.m1521g0(0, i), 6);
        int i10 = c0924aM1513b0.f3986j;
        int i11 = c0924aM1513b0.f3987k;
        int i12 = c0924aM1513b0.f3988l;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (true) {
                int iAnd = AbstractC2278c.and(this.source.readShort(), C2131o.DEFAULT_INITIAL_WINDOW_SIZE);
                i9 = this.source.readInt();
                if (iAnd != 2) {
                    if (iAnd == 3) {
                        iAnd = 4;
                    } else if (iAnd != 4) {
                        if (iAnd == 5 && (i9 < 16384 || i9 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i9 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iAnd = 7;
                    }
                } else if (i9 != 0 && i9 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                c2131o.set(iAnd, i9);
                if (i10 == i11) {
                    break;
                } else {
                    i10 += i12;
                }
            }
            throw new IOException(AbstractC0008a1.m12h(i9, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
        }
        interfaceC2125i.settings(false, c2131o);
    }

    private final void readWindowUpdate(InterfaceC2125i interfaceC2125i, int i, int i4, int i8) throws IOException {
        if (i != 4) {
            throw new IOException(AbstractC0008a1.m12h(i, "TYPE_WINDOW_UPDATE length !=4: "));
        }
        long jAnd = AbstractC2278c.and(this.source.readInt(), 2147483647L);
        if (jAnd == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        interfaceC2125i.windowUpdate(i8, jAnd);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean z7, InterfaceC2125i interfaceC2125i) throws IOException {
        AbstractC2980h.m5136e("handler", interfaceC2125i);
        try {
            this.source.mo4623y(9L);
            int medium = AbstractC2278c.readMedium(this.source);
            if (medium > 16384) {
                throw new IOException(AbstractC0008a1.m12h(medium, "FRAME_SIZE_ERROR: "));
            }
            int iAnd = AbstractC2278c.and(this.source.readByte(), 255);
            int iAnd2 = AbstractC2278c.and(this.source.readByte(), 255);
            int i = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger2 = logger;
            if (logger2.isLoggable(Level.FINE)) {
                logger2.fine(C2121e.INSTANCE.frameLog(true, i, medium, iAnd, iAnd2));
            }
            if (z7 && iAnd != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + C2121e.INSTANCE.formattedType$okhttp(iAnd));
            }
            switch (iAnd) {
                case 0:
                    readData(interfaceC2125i, medium, iAnd2, i);
                    return true;
                case 1:
                    readHeaders(interfaceC2125i, medium, iAnd2, i);
                    return true;
                case 2:
                    readPriority(interfaceC2125i, medium, iAnd2, i);
                    return true;
                case 3:
                    readRstStream(interfaceC2125i, medium, iAnd2, i);
                    return true;
                case 4:
                    readSettings(interfaceC2125i, medium, iAnd2, i);
                    return true;
                case 5:
                    readPushPromise(interfaceC2125i, medium, iAnd2, i);
                    return true;
                case 6:
                    readPing(interfaceC2125i, medium, iAnd2, i);
                    return true;
                case 7:
                    readGoAway(interfaceC2125i, medium, iAnd2, i);
                    return true;
                case 8:
                    readWindowUpdate(interfaceC2125i, medium, iAnd2, i);
                    return true;
                default:
                    this.source.skip(medium);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void readConnectionPreface(InterfaceC2125i interfaceC2125i) throws IOException {
        AbstractC2980h.m5136e("handler", interfaceC2125i);
        if (this.client) {
            if (!nextFrame(true, interfaceC2125i)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        InterfaceC2577l interfaceC2577l = this.source;
        C2579m c2579m = C2121e.CONNECTION_PREFACE;
        C2579m c2579mMo4610d = interfaceC2577l.mo4610d(c2579m.mo4634d());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(AbstractC2278c.format("<< CONNECTION " + c2579mMo4610d.mo4635e(), new Object[0]));
        }
        if (!c2579m.equals(c2579mMo4610d)) {
            throw new IOException("Expected a connection header but was ".concat(c2579mMo4610d.m4675q()));
        }
    }

    private final void readPriority(InterfaceC2125i interfaceC2125i, int i) {
        int i4 = this.source.readInt();
        interfaceC2125i.priority(i, i4 & Integer.MAX_VALUE, AbstractC2278c.and(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i4) != 0);
    }
}
