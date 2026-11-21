package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.AbstractC2177v;
import okhttp3.C2063a;
import okhttp3.C2072e0;
import okhttp3.C2076g0;
import okhttp3.C2079i;
import okhttp3.C2080i0;
import okhttp3.C2162k0;
import okhttp3.C2167n;
import okhttp3.C2179x;
import okhttp3.C2181z;
import okhttp3.EnumC2074f0;
import okhttp3.InterfaceC2075g;
import okhttp3.InterfaceC2163l;
import okhttp3.internal.concurrent.C2090e;
import okhttp3.internal.http.C2110i;
import okhttp3.internal.http.InterfaceC2107f;
import okhttp3.internal.http1.C2116b;
import okhttp3.internal.http2.C2117a;
import okhttp3.internal.http2.C2122f;
import okhttp3.internal.http2.C2123g;
import okhttp3.internal.http2.C2126j;
import okhttp3.internal.http2.C2131o;
import okhttp3.internal.http2.C2132p;
import okhttp3.internal.http2.EnumC2118b;
import okhttp3.internal.p129ws.C2153d;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1207i;
import p111m6.AbstractC1915j;
import p147q7.AbstractC2278c;
import p164s7.C2385h;
import p181u7.AbstractC2483c;
import p181u7.C2484d;
import p189v7.AbstractC2557b;
import p189v7.C2582n0;
import p189v7.InterfaceC2575k;
import p189v7.InterfaceC2577l;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2981i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.connection.f */
/* loaded from: classes.dex */
public final class C2096f extends C2122f.c implements InterfaceC2163l {
    public static final a Companion = new a(null);
    public static final long IDLE_CONNECTION_HEALTHY_NS = 10000000000L;
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit;
    private final List<Reference<C2095e>> calls;
    private final C2098h connectionPool;
    private C2179x handshake;
    private C2122f http2Connection;
    private long idleAtNs;
    private boolean noCoalescedConnections;
    private boolean noNewExchanges;
    private EnumC2074f0 protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final C2162k0 route;
    private int routeFailureCount;
    private InterfaceC2575k sink;
    private Socket socket;
    private InterfaceC2577l source;
    private int successCount;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final C2096f newTestConnection(C2098h c2098h, C2162k0 c2162k0, Socket socket, long j) {
            AbstractC2980h.m5136e("connectionPool", c2098h);
            AbstractC2980h.m5136e("route", c2162k0);
            AbstractC2980h.m5136e("socket", socket);
            C2096f c2096f = new C2096f(c2098h, c2162k0);
            c2096f.socket = socket;
            c2096f.setIdleAtNs$okhttp(j);
            return c2096f;
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.f$b */
    public static final class b extends AbstractC2981i implements InterfaceC2840a {
        final /* synthetic */ C2063a $address;
        final /* synthetic */ C2079i $certificatePinner;
        final /* synthetic */ C2179x $unverifiedHandshake;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2079i c2079i, C2179x c2179x, C2063a c2063a) {
            super(0);
            this.$certificatePinner = c2079i;
            this.$unverifiedHandshake = c2179x;
            this.$address = c2063a;
        }

        @Override // p212y6.InterfaceC2840a
        public final List<Certificate> invoke() {
            AbstractC2483c certificateChainCleaner$okhttp = this.$certificatePinner.getCertificateChainCleaner$okhttp();
            AbstractC2980h.m5133b(certificateChainCleaner$okhttp);
            return certificateChainCleaner$okhttp.clean(this.$unverifiedHandshake.peerCertificates(), this.$address.url().host());
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.f$c */
    public static final class c extends AbstractC2981i implements InterfaceC2840a {
        public c() {
            super(0);
        }

        @Override // p212y6.InterfaceC2840a
        public final List<X509Certificate> invoke() {
            C2179x c2179x = C2096f.this.handshake;
            AbstractC2980h.m5133b(c2179x);
            List<Certificate> listPeerCertificates = c2179x.peerCertificates();
            ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(listPeerCertificates));
            for (Certificate certificate : listPeerCertificates) {
                AbstractC2980h.m5134c("null cannot be cast to non-null type java.security.cert.X509Certificate", certificate);
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.f$d */
    public static final class d extends C2153d.d {
        final /* synthetic */ C2093c $exchange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2577l interfaceC2577l, InterfaceC2575k interfaceC2575k, C2093c c2093c) {
            super(true, interfaceC2577l, interfaceC2575k);
            this.$exchange = c2093c;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.$exchange.bodyComplete(-1L, true, true, null);
        }
    }

    public C2096f(C2098h c2098h, C2162k0 c2162k0) {
        AbstractC2980h.m5136e("connectionPool", c2098h);
        AbstractC2980h.m5136e("route", c2162k0);
        this.connectionPool = c2098h;
        this.route = c2162k0;
        this.allocationLimit = 1;
        this.calls = new ArrayList();
        this.idleAtNs = Long.MAX_VALUE;
    }

    private final boolean certificateSupportHost(C2181z c2181z, C2179x c2179x) {
        List<Certificate> listPeerCertificates = c2179x.peerCertificates();
        if (!listPeerCertificates.isEmpty()) {
            C2484d c2484d = C2484d.INSTANCE;
            String strHost = c2181z.host();
            Certificate certificate = listPeerCertificates.get(0);
            AbstractC2980h.m5134c("null cannot be cast to non-null type java.security.cert.X509Certificate", certificate);
            if (c2484d.verify(strHost, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    private final void connectSocket(int i, int i4, InterfaceC2075g interfaceC2075g, AbstractC2177v abstractC2177v) throws IOException {
        Socket socketCreateSocket;
        Proxy proxy = this.route.proxy();
        C2063a c2063aAddress = this.route.address();
        Proxy.Type type = proxy.type();
        int i8 = type == null ? -1 : AbstractC2097g.$EnumSwitchMapping$0[type.ordinal()];
        if (i8 == 1 || i8 == 2) {
            socketCreateSocket = c2063aAddress.socketFactory().createSocket();
            AbstractC2980h.m5133b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.rawSocket = socketCreateSocket;
        abstractC2177v.connectStart(interfaceC2075g, this.route.socketAddress(), proxy);
        socketCreateSocket.setSoTimeout(i4);
        try {
            C2385h.Companion.get().connectSocket(socketCreateSocket, this.route.socketAddress(), i);
            try {
                this.source = AbstractC2557b.m4578c(AbstractC2557b.m4585j(socketCreateSocket));
                this.sink = AbstractC2557b.m4577b(AbstractC2557b.m4582g(socketCreateSocket));
            } catch (NullPointerException e) {
                if (AbstractC2980h.m5132a(e.getMessage(), NPE_THROW_WITH_NULL)) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e8) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e8);
            throw connectException;
        }
    }

    private final void connectTls(C2092b c2092b) throws Throwable {
        C2063a c2063aAddress = this.route.address();
        SSLSocketFactory sslSocketFactory = c2063aAddress.sslSocketFactory();
        SSLSocket sSLSocket = null;
        try {
            AbstractC2980h.m5133b(sslSocketFactory);
            Socket socketCreateSocket = sslSocketFactory.createSocket(this.rawSocket, c2063aAddress.url().host(), c2063aAddress.url().port(), true);
            AbstractC2980h.m5134c("null cannot be cast to non-null type javax.net.ssl.SSLSocket", socketCreateSocket);
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                C2167n c2167nConfigureSecureSocket = c2092b.configureSecureSocket(sSLSocket2);
                if (c2167nConfigureSecureSocket.supportsTlsExtensions()) {
                    C2385h.Companion.get().configureTlsExtensions(sSLSocket2, c2063aAddress.url().host(), c2063aAddress.protocols());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                C2179x.a aVar = C2179x.Companion;
                AbstractC2980h.m5135d("sslSocketSession", session);
                C2179x c2179x = aVar.get(session);
                HostnameVerifier hostnameVerifier = c2063aAddress.hostnameVerifier();
                AbstractC2980h.m5133b(hostnameVerifier);
                if (hostnameVerifier.verify(c2063aAddress.url().host(), session)) {
                    C2079i c2079iCertificatePinner = c2063aAddress.certificatePinner();
                    AbstractC2980h.m5133b(c2079iCertificatePinner);
                    this.handshake = new C2179x(c2179x.tlsVersion(), c2179x.cipherSuite(), c2179x.localCertificates(), new b(c2079iCertificatePinner, c2179x, c2063aAddress));
                    c2079iCertificatePinner.check$okhttp(c2063aAddress.url().host(), new c());
                    String selectedProtocol = c2167nConfigureSecureSocket.supportsTlsExtensions() ? C2385h.Companion.get().getSelectedProtocol(sSLSocket2) : null;
                    this.socket = sSLSocket2;
                    this.source = AbstractC2557b.m4578c(AbstractC2557b.m4585j(sSLSocket2));
                    this.sink = AbstractC2557b.m4577b(AbstractC2557b.m4582g(sSLSocket2));
                    this.protocol = selectedProtocol != null ? EnumC2074f0.Companion.get(selectedProtocol) : EnumC2074f0.HTTP_1_1;
                    C2385h.Companion.get().afterHandshake(sSLSocket2);
                    return;
                }
                List<Certificate> listPeerCertificates = c2179x.peerCertificates();
                if (listPeerCertificates.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c2063aAddress.url().host() + " not verified (no certificates)");
                }
                Certificate certificate = listPeerCertificates.get(0);
                AbstractC2980h.m5134c("null cannot be cast to non-null type java.security.cert.X509Certificate", certificate);
                X509Certificate x509Certificate = (X509Certificate) certificate;
                throw new SSLPeerUnverifiedException(AbstractC1207i.m2655h0("\n              |Hostname " + c2063aAddress.url().host() + " not verified:\n              |    certificate: " + C2079i.Companion.pin(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + C2484d.INSTANCE.allSubjectAltNames(x509Certificate) + "\n              "));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C2385h.Companion.get().afterHandshake(sSLSocket);
                }
                if (sSLSocket != null) {
                    AbstractC2278c.closeQuietly((Socket) sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void connectTunnel(int i, int i4, int i8, InterfaceC2075g interfaceC2075g, AbstractC2177v abstractC2177v) throws IOException {
        C2076g0 c2076g0CreateTunnelRequest = createTunnelRequest();
        C2181z c2181zUrl = c2076g0CreateTunnelRequest.url();
        for (int i9 = 0; i9 < 21; i9++) {
            connectSocket(i, i4, interfaceC2075g, abstractC2177v);
            c2076g0CreateTunnelRequest = createTunnel(i4, i8, c2076g0CreateTunnelRequest, c2181zUrl);
            if (c2076g0CreateTunnelRequest == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                AbstractC2278c.closeQuietly(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            abstractC2177v.connectEnd(interfaceC2075g, this.route.socketAddress(), this.route.proxy(), null);
        }
    }

    private final C2076g0 createTunnel(int i, int i4, C2076g0 c2076g0, C2181z c2181z) throws IOException {
        String str = "CONNECT " + AbstractC2278c.toHostHeader(c2181z, true) + " HTTP/1.1";
        while (true) {
            InterfaceC2577l interfaceC2577l = this.source;
            AbstractC2980h.m5133b(interfaceC2577l);
            InterfaceC2575k interfaceC2575k = this.sink;
            AbstractC2980h.m5133b(interfaceC2575k);
            C2116b c2116b = new C2116b(null, this, interfaceC2577l, interfaceC2575k);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            interfaceC2577l.timeout().timeout(i, timeUnit);
            interfaceC2575k.timeout().timeout(i4, timeUnit);
            c2116b.writeRequest(c2076g0.headers(), str);
            c2116b.finishRequest();
            C2080i0.a responseHeaders = c2116b.readResponseHeaders(false);
            AbstractC2980h.m5133b(responseHeaders);
            C2080i0 c2080i0Build = responseHeaders.request(c2076g0).build();
            c2116b.skipConnectBody(c2080i0Build);
            int iCode = c2080i0Build.code();
            if (iCode == 200) {
                if (interfaceC2577l.mo4607a().mo4614j() && interfaceC2575k.mo4596a().mo4614j()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iCode != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c2080i0Build.code());
            }
            C2076g0 c2076g0Authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, c2080i0Build);
            if (c2076g0Authenticate == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(C2080i0.header$default(c2080i0Build, "Connection", null, 2, null))) {
                return c2076g0Authenticate;
            }
            c2076g0 = c2076g0Authenticate;
        }
    }

    private final C2076g0 createTunnelRequest() {
        C2076g0 c2076g0Build = new C2076g0.a().url(this.route.address().url()).method("CONNECT", null).header("Host", AbstractC2278c.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", AbstractC2278c.userAgent).build();
        C2076g0 c2076g0Authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new C2080i0.a().request(c2076g0Build).protocol(EnumC2074f0.HTTP_1_1).code(407).message("Preemptive Authenticate").body(AbstractC2278c.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return c2076g0Authenticate == null ? c2076g0Build : c2076g0Authenticate;
    }

    private final void establishProtocol(C2092b c2092b, int i, InterfaceC2075g interfaceC2075g, AbstractC2177v abstractC2177v) throws Throwable {
        if (this.route.address().sslSocketFactory() != null) {
            abstractC2177v.secureConnectStart(interfaceC2075g);
            connectTls(c2092b);
            abstractC2177v.secureConnectEnd(interfaceC2075g, this.handshake);
            if (this.protocol == EnumC2074f0.HTTP_2) {
                startHttp2(i);
                return;
            }
            return;
        }
        List<EnumC2074f0> listProtocols = this.route.address().protocols();
        EnumC2074f0 enumC2074f0 = EnumC2074f0.H2_PRIOR_KNOWLEDGE;
        if (!listProtocols.contains(enumC2074f0)) {
            this.socket = this.rawSocket;
            this.protocol = EnumC2074f0.HTTP_1_1;
        } else {
            this.socket = this.rawSocket;
            this.protocol = enumC2074f0;
            startHttp2(i);
        }
    }

    private final boolean routeMatchesAny(List<C2162k0> list) {
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (C2162k0 c2162k0 : list) {
            Proxy.Type type = c2162k0.proxy().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.route.proxy().type() == type2 && AbstractC2980h.m5132a(this.route.socketAddress(), c2162k0.socketAddress())) {
                return true;
            }
        }
        return false;
    }

    private final void startHttp2(int i) throws SocketException {
        Socket socket = this.socket;
        AbstractC2980h.m5133b(socket);
        InterfaceC2577l interfaceC2577l = this.source;
        AbstractC2980h.m5133b(interfaceC2577l);
        InterfaceC2575k interfaceC2575k = this.sink;
        AbstractC2980h.m5133b(interfaceC2575k);
        socket.setSoTimeout(0);
        C2122f c2122fBuild = new C2122f.a(true, C2090e.INSTANCE).socket(socket, this.route.address().url().host(), interfaceC2577l, interfaceC2575k).listener(this).pingIntervalMillis(i).build();
        this.http2Connection = c2122fBuild;
        this.allocationLimit = C2122f.Companion.getDEFAULT_SETTINGS().getMaxConcurrentStreams();
        C2122f.start$default(c2122fBuild, false, null, 3, null);
    }

    private final boolean supportsUrl(C2181z c2181z) {
        C2179x c2179x;
        if (AbstractC2278c.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        C2181z c2181zUrl = this.route.address().url();
        if (c2181z.port() != c2181zUrl.port()) {
            return false;
        }
        if (AbstractC2980h.m5132a(c2181z.host(), c2181zUrl.host())) {
            return true;
        }
        if (!this.noCoalescedConnections && (c2179x = this.handshake) != null) {
            AbstractC2980h.m5133b(c2179x);
            if (certificateSupportHost(c2181z, c2179x)) {
                return true;
            }
        }
        return false;
    }

    public final void cancel() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            AbstractC2278c.closeQuietly(socket);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        if (r12.route.requiresTunnel() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
    
        if (r12.rawSocket == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
    
        throw new okhttp3.internal.connection.C2100j(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dd, code lost:
    
        r12.idleAtNs = java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void connect(int i, int i4, int i8, int i9, boolean z7, InterfaceC2075g interfaceC2075g, AbstractC2177v abstractC2177v) throws Throwable {
        Socket socket;
        Socket socket2;
        InterfaceC2075g interfaceC2075g2 = interfaceC2075g;
        AbstractC2177v abstractC2177v2 = abstractC2177v;
        AbstractC2980h.m5136e("call", interfaceC2075g2);
        AbstractC2980h.m5136e("eventListener", abstractC2177v2);
        if (this.protocol != null) {
            throw new IllegalStateException("already connected");
        }
        List<C2167n> listConnectionSpecs = this.route.address().connectionSpecs();
        C2092b c2092b = new C2092b(listConnectionSpecs);
        if (this.route.address().sslSocketFactory() == null) {
            if (!listConnectionSpecs.contains(C2167n.CLEARTEXT)) {
                throw new C2100j(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strHost = this.route.address().url().host();
            if (!C2385h.Companion.get().isCleartextTrafficPermitted(strHost)) {
                throw new C2100j(new UnknownServiceException(AbstractC0008a1.m17m("CLEARTEXT communication to ", strHost, " not permitted by network security policy")));
            }
        } else if (this.route.address().protocols().contains(EnumC2074f0.H2_PRIOR_KNOWLEDGE)) {
            throw new C2100j(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C2100j c2100j = null;
        while (true) {
            try {
                if (this.route.requiresTunnel()) {
                    AbstractC2177v abstractC2177v3 = abstractC2177v2;
                    InterfaceC2075g interfaceC2075g3 = interfaceC2075g2;
                    try {
                        connectTunnel(i, i4, i8, interfaceC2075g3, abstractC2177v3);
                        interfaceC2075g2 = interfaceC2075g3;
                        abstractC2177v2 = abstractC2177v3;
                    } catch (IOException e) {
                        e = e;
                        interfaceC2075g2 = interfaceC2075g3;
                        abstractC2177v2 = abstractC2177v3;
                    }
                    try {
                        if (this.rawSocket == null) {
                            break;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        IOException iOException = e;
                        socket = this.socket;
                        if (socket != null) {
                        }
                        socket2 = this.rawSocket;
                        if (socket2 != null) {
                        }
                        this.socket = null;
                        this.rawSocket = null;
                        this.source = null;
                        this.sink = null;
                        this.handshake = null;
                        this.protocol = null;
                        this.http2Connection = null;
                        this.allocationLimit = 1;
                        abstractC2177v2.connectFailed(interfaceC2075g2, this.route.socketAddress(), this.route.proxy(), null, iOException);
                        if (c2100j != null) {
                        }
                        if (z7) {
                        }
                    }
                } else {
                    connectSocket(i, i4, interfaceC2075g2, abstractC2177v2);
                }
            } catch (IOException e9) {
                e = e9;
            }
            try {
                establishProtocol(c2092b, i9, interfaceC2075g2, abstractC2177v2);
                abstractC2177v2.connectEnd(interfaceC2075g2, this.route.socketAddress(), this.route.proxy(), this.protocol);
                break;
            } catch (IOException e10) {
                e = e10;
                IOException iOException2 = e;
                socket = this.socket;
                if (socket != null) {
                    AbstractC2278c.closeQuietly(socket);
                }
                socket2 = this.rawSocket;
                if (socket2 != null) {
                    AbstractC2278c.closeQuietly(socket2);
                }
                this.socket = null;
                this.rawSocket = null;
                this.source = null;
                this.sink = null;
                this.handshake = null;
                this.protocol = null;
                this.http2Connection = null;
                this.allocationLimit = 1;
                abstractC2177v2.connectFailed(interfaceC2075g2, this.route.socketAddress(), this.route.proxy(), null, iOException2);
                if (c2100j != null) {
                    c2100j = new C2100j(iOException2);
                } else {
                    c2100j.addConnectException(iOException2);
                }
                if (z7) {
                    throw c2100j;
                }
                if (!c2092b.connectionFailed(iOException2)) {
                    throw c2100j;
                }
                interfaceC2075g2 = interfaceC2075g;
                abstractC2177v2 = abstractC2177v;
            }
            interfaceC2075g2 = interfaceC2075g;
            abstractC2177v2 = abstractC2177v;
        }
    }

    public final void connectFailed$okhttp(C2072e0 c2072e0, C2162k0 c2162k0, IOException iOException) {
        AbstractC2980h.m5136e("client", c2072e0);
        AbstractC2980h.m5136e("failedRoute", c2162k0);
        AbstractC2980h.m5136e("failure", iOException);
        if (c2162k0.proxy().type() != Proxy.Type.DIRECT) {
            C2063a c2063aAddress = c2162k0.address();
            c2063aAddress.proxySelector().connectFailed(c2063aAddress.url().uri(), c2162k0.proxy().address(), iOException);
        }
        c2072e0.getRouteDatabase().failed(c2162k0);
    }

    public final List<Reference<C2095e>> getCalls() {
        return this.calls;
    }

    public final C2098h getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNs$okhttp() {
        return this.idleAtNs;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    @Override // okhttp3.InterfaceC2163l
    public C2179x handshake() {
        return this.handshake;
    }

    public final synchronized void incrementSuccessCount$okhttp() {
        this.successCount++;
    }

    public final boolean isEligible$okhttp(C2063a c2063a, List<C2162k0> list) {
        AbstractC2980h.m5136e("address", c2063a);
        if (AbstractC2278c.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(c2063a)) {
            return false;
        }
        if (AbstractC2980h.m5132a(c2063a.url().host(), route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || list == null || !routeMatchesAny(list) || c2063a.hostnameVerifier() != C2484d.INSTANCE || !supportsUrl(c2063a.url())) {
            return false;
        }
        try {
            C2079i c2079iCertificatePinner = c2063a.certificatePinner();
            AbstractC2980h.m5133b(c2079iCertificatePinner);
            String strHost = c2063a.url().host();
            C2179x c2179xHandshake = handshake();
            AbstractC2980h.m5133b(c2179xHandshake);
            c2079iCertificatePinner.check(strHost, c2179xHandshake.peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean isHealthy(boolean z7) {
        long j;
        if (AbstractC2278c.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        AbstractC2980h.m5133b(socket);
        Socket socket2 = this.socket;
        AbstractC2980h.m5133b(socket2);
        InterfaceC2577l interfaceC2577l = this.source;
        AbstractC2980h.m5133b(interfaceC2577l);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C2122f c2122f = this.http2Connection;
        if (c2122f != null) {
            return c2122f.isHealthy(jNanoTime);
        }
        synchronized (this) {
            j = jNanoTime - this.idleAtNs;
        }
        if (j < IDLE_CONNECTION_HEALTHY_NS || !z7) {
            return true;
        }
        return AbstractC2278c.isHealthy(socket2, interfaceC2577l);
    }

    public final boolean isMultiplexed$okhttp() {
        return this.http2Connection != null;
    }

    public final InterfaceC2107f newCodec$okhttp(C2072e0 c2072e0, C2110i c2110i) throws SocketException {
        AbstractC2980h.m5136e("client", c2072e0);
        AbstractC2980h.m5136e("chain", c2110i);
        Socket socket = this.socket;
        AbstractC2980h.m5133b(socket);
        InterfaceC2577l interfaceC2577l = this.source;
        AbstractC2980h.m5133b(interfaceC2577l);
        InterfaceC2575k interfaceC2575k = this.sink;
        AbstractC2980h.m5133b(interfaceC2575k);
        C2122f c2122f = this.http2Connection;
        if (c2122f != null) {
            return new C2123g(c2072e0, this, c2110i, c2122f);
        }
        socket.setSoTimeout(c2110i.readTimeoutMillis());
        C2582n0 c2582n0Timeout = interfaceC2577l.timeout();
        long readTimeoutMillis$okhttp = c2110i.getReadTimeoutMillis$okhttp();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2582n0Timeout.timeout(readTimeoutMillis$okhttp, timeUnit);
        interfaceC2575k.timeout().timeout(c2110i.getWriteTimeoutMillis$okhttp(), timeUnit);
        return new C2116b(c2072e0, this, interfaceC2577l, interfaceC2575k);
    }

    public final C2153d.d newWebSocketStreams$okhttp(C2093c c2093c) throws SocketException {
        AbstractC2980h.m5136e("exchange", c2093c);
        Socket socket = this.socket;
        AbstractC2980h.m5133b(socket);
        InterfaceC2577l interfaceC2577l = this.source;
        AbstractC2980h.m5133b(interfaceC2577l);
        InterfaceC2575k interfaceC2575k = this.sink;
        AbstractC2980h.m5133b(interfaceC2575k);
        socket.setSoTimeout(0);
        noNewExchanges$okhttp();
        return new d(interfaceC2577l, interfaceC2575k, c2093c);
    }

    public final synchronized void noCoalescedConnections$okhttp() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void noNewExchanges$okhttp() {
        this.noNewExchanges = true;
    }

    @Override // okhttp3.internal.http2.C2122f.c
    public synchronized void onSettings(C2122f c2122f, C2131o c2131o) {
        AbstractC2980h.m5136e("connection", c2122f);
        AbstractC2980h.m5136e("settings", c2131o);
        this.allocationLimit = c2131o.getMaxConcurrentStreams();
    }

    @Override // okhttp3.internal.http2.C2122f.c
    public void onStream(C2126j c2126j) {
        AbstractC2980h.m5136e("stream", c2126j);
        c2126j.close(EnumC2118b.REFUSED_STREAM, null);
    }

    @Override // okhttp3.InterfaceC2163l
    public EnumC2074f0 protocol() {
        EnumC2074f0 enumC2074f0 = this.protocol;
        AbstractC2980h.m5133b(enumC2074f0);
        return enumC2074f0;
    }

    @Override // okhttp3.InterfaceC2163l
    public C2162k0 route() {
        return this.route;
    }

    public final void setIdleAtNs$okhttp(long j) {
        this.idleAtNs = j;
    }

    public final void setNoNewExchanges(boolean z7) {
        this.noNewExchanges = z7;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    @Override // okhttp3.InterfaceC2163l
    public Socket socket() {
        Socket socket = this.socket;
        AbstractC2980h.m5133b(socket);
        return socket;
    }

    public String toString() {
        Object objCipherSuite;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(", proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        C2179x c2179x = this.handshake;
        if (c2179x == null || (objCipherSuite = c2179x.cipherSuite()) == null) {
            objCipherSuite = "none";
        }
        sb.append(objCipherSuite);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void trackFailure$okhttp(C2095e c2095e, IOException iOException) {
        try {
            AbstractC2980h.m5136e("call", c2095e);
            if (iOException instanceof C2132p) {
                if (((C2132p) iOException).errorCode == EnumC2118b.REFUSED_STREAM) {
                    int i = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i;
                    if (i > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((C2132p) iOException).errorCode != EnumC2118b.CANCEL || !c2095e.isCanceled()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!isMultiplexed$okhttp() || (iOException instanceof C2117a)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (iOException != null) {
                        connectFailed$okhttp(c2095e.getClient(), this.route, iOException);
                    }
                    this.routeFailureCount++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
