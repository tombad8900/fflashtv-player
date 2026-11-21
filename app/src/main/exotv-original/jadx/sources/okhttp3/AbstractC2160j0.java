package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1199a;
import p102l6.C1693j;
import p147q7.AbstractC2278c;
import p171t5.AbstractC2436a;
import p189v7.C2573j;
import p189v7.C2579m;
import p189v7.InterfaceC2577l;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC2160j0 implements Closeable {
    public static final b Companion = new b(null);
    private Reader reader;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.j0$a */
    public static final class a extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final InterfaceC2577l source;

        public a(InterfaceC2577l interfaceC2577l, Charset charset) {
            AbstractC2980h.m5136e("source", interfaceC2577l);
            AbstractC2980h.m5136e("charset", charset);
            this.source = interfaceC2577l;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C1693j c1693j;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                c1693j = C1693j.f6497a;
            } else {
                c1693j = null;
            }
            if (c1693j == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i4) throws IOException {
            AbstractC2980h.m5136e("cbuf", cArr);
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.mo4606C(), AbstractC2278c.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i, i4);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.j0$b */
    public static final class b {

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.j0$b$a */
        public static final class a extends AbstractC2160j0 {
            final /* synthetic */ long $contentLength;
            final /* synthetic */ C2070d0 $contentType;
            final /* synthetic */ InterfaceC2577l $this_asResponseBody;

            public a(C2070d0 c2070d0, long j, InterfaceC2577l interfaceC2577l) {
                this.$contentType = c2070d0;
                this.$contentLength = j;
                this.$this_asResponseBody = interfaceC2577l;
            }

            @Override // okhttp3.AbstractC2160j0
            public long contentLength() {
                return this.$contentLength;
            }

            @Override // okhttp3.AbstractC2160j0
            public C2070d0 contentType() {
                return this.$contentType;
            }

            @Override // okhttp3.AbstractC2160j0
            public InterfaceC2577l source() {
                return this.$this_asResponseBody;
            }
        }

        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        public static /* synthetic */ AbstractC2160j0 create$default(b bVar, String str, C2070d0 c2070d0, int i, Object obj) {
            if ((i & 1) != 0) {
                c2070d0 = null;
            }
            return bVar.create(str, c2070d0);
        }

        public final AbstractC2160j0 create(String str, C2070d0 c2070d0) {
            AbstractC2980h.m5136e("<this>", str);
            Charset charset = AbstractC1199a.f5077a;
            if (c2070d0 != null) {
                Charset charsetCharset$default = C2070d0.charset$default(c2070d0, null, 1, null);
                if (charsetCharset$default == null) {
                    c2070d0 = C2070d0.Companion.parse(c2070d0 + "; charset=utf-8");
                } else {
                    charset = charsetCharset$default;
                }
            }
            C2573j c2573j = new C2573j();
            AbstractC2980h.m5136e("charset", charset);
            c2573j.m4660P(str, 0, str.length(), charset);
            return create(c2573j, c2070d0, c2573j.f9314k);
        }

        private b() {
        }

        public static /* synthetic */ AbstractC2160j0 create$default(b bVar, byte[] bArr, C2070d0 c2070d0, int i, Object obj) {
            if ((i & 1) != 0) {
                c2070d0 = null;
            }
            return bVar.create(bArr, c2070d0);
        }

        public static /* synthetic */ AbstractC2160j0 create$default(b bVar, C2579m c2579m, C2070d0 c2070d0, int i, Object obj) {
            if ((i & 1) != 0) {
                c2070d0 = null;
            }
            return bVar.create(c2579m, c2070d0);
        }

        public static /* synthetic */ AbstractC2160j0 create$default(b bVar, InterfaceC2577l interfaceC2577l, C2070d0 c2070d0, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                c2070d0 = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return bVar.create(interfaceC2577l, c2070d0, j);
        }

        public final AbstractC2160j0 create(byte[] bArr, C2070d0 c2070d0) {
            AbstractC2980h.m5136e("<this>", bArr);
            C2573j c2573j = new C2573j();
            c2573j.m5288write(bArr);
            return create(c2573j, c2070d0, bArr.length);
        }

        public final AbstractC2160j0 create(C2579m c2579m, C2070d0 c2070d0) {
            AbstractC2980h.m5136e("<this>", c2579m);
            C2573j c2573j = new C2573j();
            c2573j.m4654J(c2579m);
            return create(c2573j, c2070d0, c2579m.mo4634d());
        }

        public final AbstractC2160j0 create(InterfaceC2577l interfaceC2577l, C2070d0 c2070d0, long j) {
            AbstractC2980h.m5136e("<this>", interfaceC2577l);
            return new a(c2070d0, j, interfaceC2577l);
        }

        public final AbstractC2160j0 create(C2070d0 c2070d0, String str) {
            AbstractC2980h.m5136e("content", str);
            return create(str, c2070d0);
        }

        public final AbstractC2160j0 create(C2070d0 c2070d0, byte[] bArr) {
            AbstractC2980h.m5136e("content", bArr);
            return create(bArr, c2070d0);
        }

        public final AbstractC2160j0 create(C2070d0 c2070d0, C2579m c2579m) {
            AbstractC2980h.m5136e("content", c2579m);
            return create(c2579m, c2070d0);
        }

        public final AbstractC2160j0 create(C2070d0 c2070d0, long j, InterfaceC2577l interfaceC2577l) {
            AbstractC2980h.m5136e("content", interfaceC2577l);
            return create(interfaceC2577l, c2070d0, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        C2070d0 c2070d0ContentType = contentType();
        return (c2070d0ContentType == null || (charset = c2070d0ContentType.charset(AbstractC1199a.f5077a)) == null) ? AbstractC1199a.f5077a : charset;
    }

    private final <T> T consumeSource(InterfaceC2851l interfaceC2851l, InterfaceC2851l interfaceC2851l2) throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC0008a1.m15k("Cannot buffer entire body for content length: ", jContentLength));
        }
        InterfaceC2577l interfaceC2577lSource = source();
        try {
            T t8 = (T) interfaceC2851l.invoke(interfaceC2577lSource);
            AbstractC2436a.m4330b(interfaceC2577lSource, null);
            int iIntValue = ((Number) interfaceC2851l2.invoke(t8)).intValue();
            if (jContentLength == -1 || jContentLength == iIntValue) {
                return t8;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iIntValue + ") disagree");
        } finally {
        }
    }

    public static final AbstractC2160j0 create(String str, C2070d0 c2070d0) {
        return Companion.create(str, c2070d0);
    }

    public final InputStream byteStream() {
        return source().mo4606C();
    }

    public final C2579m byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC0008a1.m15k("Cannot buffer entire body for content length: ", jContentLength));
        }
        InterfaceC2577l interfaceC2577lSource = source();
        try {
            C2579m c2579mMo4620s = interfaceC2577lSource.mo4620s();
            interfaceC2577lSource.close();
            int iMo4634d = c2579mMo4620s.mo4634d();
            if (jContentLength == -1 || jContentLength == iMo4634d) {
                return c2579mMo4620s;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iMo4634d + ") disagree");
        } finally {
        }
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(AbstractC0008a1.m15k("Cannot buffer entire body for content length: ", jContentLength));
        }
        InterfaceC2577l interfaceC2577lSource = source();
        try {
            byte[] bArrMo4613i = interfaceC2577lSource.mo4613i();
            interfaceC2577lSource.close();
            int length = bArrMo4613i.length;
            if (jContentLength == -1 || jContentLength == length) {
                return bArrMo4613i;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), charset());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        AbstractC2278c.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract C2070d0 contentType();

    public abstract InterfaceC2577l source();

    public final String string() throws IOException {
        InterfaceC2577l interfaceC2577lSource = source();
        try {
            String strMo4619q = interfaceC2577lSource.mo4619q(AbstractC2278c.readBomAsCharset(interfaceC2577lSource, charset()));
            interfaceC2577lSource.close();
            return strMo4619q;
        } finally {
        }
    }

    public static final AbstractC2160j0 create(C2070d0 c2070d0, long j, InterfaceC2577l interfaceC2577l) {
        return Companion.create(c2070d0, j, interfaceC2577l);
    }

    public static final AbstractC2160j0 create(C2070d0 c2070d0, String str) {
        return Companion.create(c2070d0, str);
    }

    public static final AbstractC2160j0 create(C2070d0 c2070d0, C2579m c2579m) {
        return Companion.create(c2070d0, c2579m);
    }

    public static final AbstractC2160j0 create(C2070d0 c2070d0, byte[] bArr) {
        return Companion.create(c2070d0, bArr);
    }

    public static final AbstractC2160j0 create(InterfaceC2577l interfaceC2577l, C2070d0 c2070d0, long j) {
        return Companion.create(interfaceC2577l, c2070d0, j);
    }

    public static final AbstractC2160j0 create(C2579m c2579m, C2070d0 c2070d0) {
        return Companion.create(c2579m, c2070d0);
    }

    public static final AbstractC2160j0 create(byte[] bArr, C2070d0 c2070d0) {
        return Companion.create(bArr, c2070d0);
    }
}
