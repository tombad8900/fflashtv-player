package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.C2072e0;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2180y;
import okhttp3.EnumC2074f0;
import okhttp3.internal.connection.C2096f;
import okhttp3.internal.http.AbstractC2108g;
import okhttp3.internal.http.C2110i;
import okhttp3.internal.http.C2112k;
import okhttp3.internal.http.C2114m;
import okhttp3.internal.http.InterfaceC2107f;
import p147q7.AbstractC2278c;
import p189v7.C2582n0;
import p189v7.InterfaceC2572i0;
import p189v7.InterfaceC2576k0;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http2.g */
/* loaded from: classes.dex */
public final class C2123g implements InterfaceC2107f {
    private volatile boolean canceled;
    private final C2110i chain;
    private final C2096f connection;
    private final C2122f http2Connection;
    private final EnumC2074f0 protocol;
    private volatile C2126j stream;
    public static final a Companion = new a(null);
    private static final String CONNECTION = "connection";
    private static final String HOST = "host";
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";

    /* renamed from: TE */
    private static final String f7618TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String ENCODING = "encoding";
    private static final String UPGRADE = "upgrade";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = AbstractC2278c.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, f7618TE, TRANSFER_ENCODING, ENCODING, UPGRADE, C2119c.TARGET_METHOD_UTF8, C2119c.TARGET_PATH_UTF8, C2119c.TARGET_SCHEME_UTF8, C2119c.TARGET_AUTHORITY_UTF8);
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = AbstractC2278c.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, f7618TE, TRANSFER_ENCODING, ENCODING, UPGRADE);

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.g$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final List<C2119c> http2HeadersList(C2076g0 c2076g0) {
            AbstractC2980h.m5136e("request", c2076g0);
            C2180y c2180yHeaders = c2076g0.headers();
            ArrayList arrayList = new ArrayList(c2180yHeaders.size() + 4);
            arrayList.add(new C2119c(C2119c.TARGET_METHOD, c2076g0.method()));
            arrayList.add(new C2119c(C2119c.TARGET_PATH, C2112k.INSTANCE.requestPath(c2076g0.url())));
            String strHeader = c2076g0.header("Host");
            if (strHeader != null) {
                arrayList.add(new C2119c(C2119c.TARGET_AUTHORITY, strHeader));
            }
            arrayList.add(new C2119c(C2119c.TARGET_SCHEME, c2076g0.url().scheme()));
            int size = c2180yHeaders.size();
            for (int i = 0; i < size; i++) {
                String strName = c2180yHeaders.name(i);
                Locale locale = Locale.US;
                AbstractC2980h.m5135d("US", locale);
                String lowerCase = strName.toLowerCase(locale);
                AbstractC2980h.m5135d("this as java.lang.String).toLowerCase(locale)", lowerCase);
                if (!C2123g.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(lowerCase) || (lowerCase.equals(C2123g.f7618TE) && AbstractC2980h.m5132a(c2180yHeaders.value(i), "trailers"))) {
                    arrayList.add(new C2119c(lowerCase, c2180yHeaders.value(i)));
                }
            }
            return arrayList;
        }

        public final C2080i0.a readHttp2HeadersList(C2180y c2180y, EnumC2074f0 enumC2074f0) throws ProtocolException, NumberFormatException {
            AbstractC2980h.m5136e("headerBlock", c2180y);
            AbstractC2980h.m5136e("protocol", enumC2074f0);
            C2180y.a aVar = new C2180y.a();
            int size = c2180y.size();
            C2114m c2114m = null;
            for (int i = 0; i < size; i++) {
                String strName = c2180y.name(i);
                String strValue = c2180y.value(i);
                if (AbstractC2980h.m5132a(strName, C2119c.RESPONSE_STATUS_UTF8)) {
                    c2114m = C2114m.Companion.parse("HTTP/1.1 " + strValue);
                } else if (!C2123g.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(strName)) {
                    aVar.addLenient$okhttp(strName, strValue);
                }
            }
            if (c2114m != null) {
                return new C2080i0.a().protocol(enumC2074f0).code(c2114m.code).message(c2114m.message).headers(aVar.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private a() {
        }
    }

    public C2123g(C2072e0 c2072e0, C2096f c2096f, C2110i c2110i, C2122f c2122f) {
        AbstractC2980h.m5136e("client", c2072e0);
        AbstractC2980h.m5136e(CONNECTION, c2096f);
        AbstractC2980h.m5136e("chain", c2110i);
        AbstractC2980h.m5136e("http2Connection", c2122f);
        this.connection = c2096f;
        this.chain = c2110i;
        this.http2Connection = c2122f;
        List<EnumC2074f0> listProtocols = c2072e0.protocols();
        EnumC2074f0 enumC2074f0 = EnumC2074f0.H2_PRIOR_KNOWLEDGE;
        this.protocol = listProtocols.contains(enumC2074f0) ? enumC2074f0 : EnumC2074f0.HTTP_2;
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public void cancel() {
        this.canceled = true;
        C2126j c2126j = this.stream;
        if (c2126j != null) {
            c2126j.closeLater(EnumC2118b.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public InterfaceC2572i0 createRequestBody(C2076g0 c2076g0, long j) {
        AbstractC2980h.m5136e("request", c2076g0);
        C2126j c2126j = this.stream;
        AbstractC2980h.m5133b(c2126j);
        return c2126j.getSink();
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public void finishRequest() {
        C2126j c2126j = this.stream;
        AbstractC2980h.m5133b(c2126j);
        c2126j.getSink().close();
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public void flushRequest() {
        this.http2Connection.flush();
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public C2096f getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public InterfaceC2576k0 openResponseBodySource(C2080i0 c2080i0) {
        AbstractC2980h.m5136e("response", c2080i0);
        C2126j c2126j = this.stream;
        AbstractC2980h.m5133b(c2126j);
        return c2126j.getSource$okhttp();
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public C2080i0.a readResponseHeaders(boolean z7) throws NumberFormatException, IOException {
        C2126j c2126j = this.stream;
        if (c2126j == null) {
            throw new IOException("stream wasn't created");
        }
        C2080i0.a http2HeadersList = Companion.readHttp2HeadersList(c2126j.takeHeaders(), this.protocol);
        if (z7 && http2HeadersList.getCode$okhttp() == 100) {
            return null;
        }
        return http2HeadersList;
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public long reportedContentLength(C2080i0 c2080i0) {
        AbstractC2980h.m5136e("response", c2080i0);
        if (AbstractC2108g.promisesBody(c2080i0)) {
            return AbstractC2278c.headersContentLength(c2080i0);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public C2180y trailers() {
        C2126j c2126j = this.stream;
        AbstractC2980h.m5133b(c2126j);
        return c2126j.trailers();
    }

    @Override // okhttp3.internal.http.InterfaceC2107f
    public void writeRequestHeaders(C2076g0 c2076g0) throws IOException {
        AbstractC2980h.m5136e("request", c2076g0);
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.newStream(Companion.http2HeadersList(c2076g0), c2076g0.body() != null);
        if (this.canceled) {
            C2126j c2126j = this.stream;
            AbstractC2980h.m5133b(c2126j);
            c2126j.closeLater(EnumC2118b.CANCEL);
            throw new IOException("Canceled");
        }
        C2126j c2126j2 = this.stream;
        AbstractC2980h.m5133b(c2126j2);
        C2582n0 timeout = c2126j2.readTimeout();
        long readTimeoutMillis$okhttp = this.chain.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        C2126j c2126j3 = this.stream;
        AbstractC2980h.m5133b(c2126j3);
        c2126j3.writeTimeout().timeout(this.chain.getWriteTimeoutMillis$okhttp(), timeUnit);
    }
}
