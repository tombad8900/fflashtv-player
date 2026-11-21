package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.concurrent.C2090e;
import okhttp3.internal.connection.C2095e;
import okhttp3.internal.connection.C2099i;
import okhttp3.internal.p129ws.C2153d;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p002a1.AbstractC0008a1;
import p077j$.time.Duration;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1919n;
import p147q7.AbstractC2278c;
import p164s7.C2385h;
import p173t7.C2438a;
import p181u7.AbstractC2483c;
import p181u7.C2484d;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.e0 */
/* loaded from: classes.dex */
public class C2072e0 implements Cloneable, InterfaceC2073f, InterfaceC2166m0 {
    private final InterfaceC2067c authenticator;
    private final C2069d cache;
    private final int callTimeoutMillis;
    private final AbstractC2483c certificateChainCleaner;
    private final C2079i certificatePinner;
    private final int connectTimeoutMillis;
    private final C2165m connectionPool;
    private final List<C2167n> connectionSpecs;
    private final InterfaceC2172q cookieJar;
    private final C2174s dispatcher;
    private final InterfaceC2176u dns;
    private final InterfaceC2178w eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<InterfaceC2068c0> interceptors;
    private final long minWebSocketMessageToCompress;
    private final List<InterfaceC2068c0> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<EnumC2074f0> protocols;
    private final Proxy proxy;
    private final InterfaceC2067c proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final C2099i routeDatabase;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;
    public static final b Companion = new b(null);
    private static final List<EnumC2074f0> DEFAULT_PROTOCOLS = AbstractC2278c.immutableListOf(EnumC2074f0.HTTP_2, EnumC2074f0.HTTP_1_1);
    private static final List<C2167n> DEFAULT_CONNECTION_SPECS = AbstractC2278c.immutableListOf(C2167n.MODERN_TLS, C2167n.CLEARTEXT);

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.e0$a */
    public static final class a {
        private InterfaceC2067c authenticator;
        private C2069d cache;
        private int callTimeout;
        private AbstractC2483c certificateChainCleaner;
        private C2079i certificatePinner;
        private int connectTimeout;
        private C2165m connectionPool;
        private List<C2167n> connectionSpecs;
        private InterfaceC2172q cookieJar;
        private C2174s dispatcher;
        private InterfaceC2176u dns;
        private InterfaceC2178w eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<InterfaceC2068c0> interceptors;
        private long minWebSocketMessageToCompress;
        private final List<InterfaceC2068c0> networkInterceptors;
        private int pingInterval;
        private List<? extends EnumC2074f0> protocols;
        private Proxy proxy;
        private InterfaceC2067c proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private C2099i routeDatabase;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.e0$a$a, reason: collision with other inner class name */
        public static final class C2991a implements InterfaceC2068c0 {
            final /* synthetic */ InterfaceC2851l $block;

            public C2991a(InterfaceC2851l interfaceC2851l) {
                this.$block = interfaceC2851l;
            }

            @Override // okhttp3.InterfaceC2068c0
            public final C2080i0 intercept(InterfaceC2064a0 interfaceC2064a0) {
                AbstractC2980h.m5136e("chain", interfaceC2064a0);
                return (C2080i0) this.$block.invoke(interfaceC2064a0);
            }
        }

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.e0$a$b */
        public static final class b implements InterfaceC2068c0 {
            final /* synthetic */ InterfaceC2851l $block;

            public b(InterfaceC2851l interfaceC2851l) {
                this.$block = interfaceC2851l;
            }

            @Override // okhttp3.InterfaceC2068c0
            public final C2080i0 intercept(InterfaceC2064a0 interfaceC2064a0) {
                AbstractC2980h.m5136e("chain", interfaceC2064a0);
                return (C2080i0) this.$block.invoke(interfaceC2064a0);
            }
        }

        public a() {
            this.dispatcher = new C2174s();
            this.connectionPool = new C2165m();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = AbstractC2278c.asFactory(AbstractC2177v.NONE);
            this.retryOnConnectionFailure = true;
            InterfaceC2067c interfaceC2067c = InterfaceC2067c.NONE;
            this.authenticator = interfaceC2067c;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = InterfaceC2172q.NO_COOKIES;
            this.dns = InterfaceC2176u.SYSTEM;
            this.proxyAuthenticator = interfaceC2067c;
            SocketFactory socketFactory = SocketFactory.getDefault();
            AbstractC2980h.m5135d("getDefault()", socketFactory);
            this.socketFactory = socketFactory;
            b bVar = C2072e0.Companion;
            this.connectionSpecs = bVar.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = bVar.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = C2484d.INSTANCE;
            this.certificatePinner = C2079i.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = C2153d.DEFAULT_MINIMUM_DEFLATE_SIZE;
        }

        /* renamed from: -addInterceptor, reason: not valid java name */
        public final a m5212addInterceptor(InterfaceC2851l interfaceC2851l) {
            AbstractC2980h.m5136e("block", interfaceC2851l);
            return addInterceptor(new C2991a(interfaceC2851l));
        }

        /* renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final a m5213addNetworkInterceptor(InterfaceC2851l interfaceC2851l) {
            AbstractC2980h.m5136e("block", interfaceC2851l);
            return addNetworkInterceptor(new b(interfaceC2851l));
        }

        public final a addInterceptor(InterfaceC2068c0 interfaceC2068c0) {
            AbstractC2980h.m5136e("interceptor", interfaceC2068c0);
            this.interceptors.add(interfaceC2068c0);
            return this;
        }

        public final a addNetworkInterceptor(InterfaceC2068c0 interfaceC2068c0) {
            AbstractC2980h.m5136e("interceptor", interfaceC2068c0);
            this.networkInterceptors.add(interfaceC2068c0);
            return this;
        }

        public final a authenticator(InterfaceC2067c interfaceC2067c) {
            AbstractC2980h.m5136e("authenticator", interfaceC2067c);
            this.authenticator = interfaceC2067c;
            return this;
        }

        public final C2072e0 build() {
            return new C2072e0(this);
        }

        public final a cache(C2069d c2069d) {
            this.cache = c2069d;
            return this;
        }

        public final a callTimeout(long j, TimeUnit timeUnit) {
            AbstractC2980h.m5136e("unit", timeUnit);
            this.callTimeout = AbstractC2278c.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public final a certificatePinner(C2079i c2079i) {
            AbstractC2980h.m5136e("certificatePinner", c2079i);
            if (!c2079i.equals(this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = c2079i;
            return this;
        }

        public final a connectTimeout(long j, TimeUnit timeUnit) {
            AbstractC2980h.m5136e("unit", timeUnit);
            this.connectTimeout = AbstractC2278c.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public final a connectionPool(C2165m c2165m) {
            AbstractC2980h.m5136e("connectionPool", c2165m);
            this.connectionPool = c2165m;
            return this;
        }

        public final a connectionSpecs(List<C2167n> list) {
            AbstractC2980h.m5136e("connectionSpecs", list);
            if (!list.equals(this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = AbstractC2278c.toImmutableList(list);
            return this;
        }

        public final a cookieJar(InterfaceC2172q interfaceC2172q) {
            AbstractC2980h.m5136e("cookieJar", interfaceC2172q);
            this.cookieJar = interfaceC2172q;
            return this;
        }

        public final a dispatcher(C2174s c2174s) {
            AbstractC2980h.m5136e("dispatcher", c2174s);
            this.dispatcher = c2174s;
            return this;
        }

        public final a dns(InterfaceC2176u interfaceC2176u) {
            AbstractC2980h.m5136e("dns", interfaceC2176u);
            if (!interfaceC2176u.equals(this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = interfaceC2176u;
            return this;
        }

        public final a eventListener(AbstractC2177v abstractC2177v) {
            AbstractC2980h.m5136e("eventListener", abstractC2177v);
            this.eventListenerFactory = AbstractC2278c.asFactory(abstractC2177v);
            return this;
        }

        public final a eventListenerFactory(InterfaceC2178w interfaceC2178w) {
            AbstractC2980h.m5136e("eventListenerFactory", interfaceC2178w);
            this.eventListenerFactory = interfaceC2178w;
            return this;
        }

        public final a followRedirects(boolean z7) {
            this.followRedirects = z7;
            return this;
        }

        public final a followSslRedirects(boolean z7) {
            this.followSslRedirects = z7;
            return this;
        }

        public final InterfaceC2067c getAuthenticator$okhttp() {
            return this.authenticator;
        }

        public final C2069d getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        public final AbstractC2483c getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        public final C2079i getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        public final C2165m getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        public final List<C2167n> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        public final InterfaceC2172q getCookieJar$okhttp() {
            return this.cookieJar;
        }

        public final C2174s getDispatcher$okhttp() {
            return this.dispatcher;
        }

        public final InterfaceC2176u getDns$okhttp() {
            return this.dns;
        }

        public final InterfaceC2178w getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        public final List<InterfaceC2068c0> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<InterfaceC2068c0> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        public final List<EnumC2074f0> getProtocols$okhttp() {
            return this.protocols;
        }

        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        public final InterfaceC2067c getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        public final C2099i getRouteDatabase$okhttp() {
            return this.routeDatabase;
        }

        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        public final a hostnameVerifier(HostnameVerifier hostnameVerifier) {
            AbstractC2980h.m5136e("hostnameVerifier", hostnameVerifier);
            if (!hostnameVerifier.equals(this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final List<InterfaceC2068c0> interceptors() {
            return this.interceptors;
        }

        public final a minWebSocketMessageToCompress(long j) {
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC0008a1.m15k("minWebSocketMessageToCompress must be positive: ", j).toString());
            }
            this.minWebSocketMessageToCompress = j;
            return this;
        }

        public final List<InterfaceC2068c0> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final a pingInterval(long j, TimeUnit timeUnit) {
            AbstractC2980h.m5136e("unit", timeUnit);
            this.pingInterval = AbstractC2278c.checkDuration("interval", j, timeUnit);
            return this;
        }

        public final a protocols(List<? extends EnumC2074f0> list) {
            AbstractC2980h.m5136e("protocols", list);
            ArrayList arrayListM3748M0 = AbstractC1913h.m3748M0(list);
            EnumC2074f0 enumC2074f0 = EnumC2074f0.H2_PRIOR_KNOWLEDGE;
            if (!arrayListM3748M0.contains(enumC2074f0) && !arrayListM3748M0.contains(EnumC2074f0.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListM3748M0).toString());
            }
            if (arrayListM3748M0.contains(enumC2074f0) && arrayListM3748M0.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListM3748M0).toString());
            }
            if (arrayListM3748M0.contains(EnumC2074f0.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListM3748M0).toString());
            }
            if (arrayListM3748M0.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayListM3748M0.remove(EnumC2074f0.SPDY_3);
            if (!arrayListM3748M0.equals(this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends EnumC2074f0> listUnmodifiableList = Collections.unmodifiableList(arrayListM3748M0);
            AbstractC2980h.m5135d("unmodifiableList(protocolsCopy)", listUnmodifiableList);
            this.protocols = listUnmodifiableList;
            return this;
        }

        public final a proxy(Proxy proxy) {
            if (!AbstractC2980h.m5132a(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        public final a proxyAuthenticator(InterfaceC2067c interfaceC2067c) {
            AbstractC2980h.m5136e("proxyAuthenticator", interfaceC2067c);
            if (!interfaceC2067c.equals(this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = interfaceC2067c;
            return this;
        }

        public final a proxySelector(ProxySelector proxySelector) {
            AbstractC2980h.m5136e("proxySelector", proxySelector);
            if (!proxySelector.equals(this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        public final a readTimeout(long j, TimeUnit timeUnit) {
            AbstractC2980h.m5136e("unit", timeUnit);
            this.readTimeout = AbstractC2278c.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public final a retryOnConnectionFailure(boolean z7) {
            this.retryOnConnectionFailure = z7;
            return this;
        }

        public final void setAuthenticator$okhttp(InterfaceC2067c interfaceC2067c) {
            AbstractC2980h.m5136e("<set-?>", interfaceC2067c);
            this.authenticator = interfaceC2067c;
        }

        public final void setCache$okhttp(C2069d c2069d) {
            this.cache = c2069d;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final void setCertificateChainCleaner$okhttp(AbstractC2483c abstractC2483c) {
            this.certificateChainCleaner = abstractC2483c;
        }

        public final void setCertificatePinner$okhttp(C2079i c2079i) {
            AbstractC2980h.m5136e("<set-?>", c2079i);
            this.certificatePinner = c2079i;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final void setConnectionPool$okhttp(C2165m c2165m) {
            AbstractC2980h.m5136e("<set-?>", c2165m);
            this.connectionPool = c2165m;
        }

        public final void setConnectionSpecs$okhttp(List<C2167n> list) {
            AbstractC2980h.m5136e("<set-?>", list);
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(InterfaceC2172q interfaceC2172q) {
            AbstractC2980h.m5136e("<set-?>", interfaceC2172q);
            this.cookieJar = interfaceC2172q;
        }

        public final void setDispatcher$okhttp(C2174s c2174s) {
            AbstractC2980h.m5136e("<set-?>", c2174s);
            this.dispatcher = c2174s;
        }

        public final void setDns$okhttp(InterfaceC2176u interfaceC2176u) {
            AbstractC2980h.m5136e("<set-?>", interfaceC2176u);
            this.dns = interfaceC2176u;
        }

        public final void setEventListenerFactory$okhttp(InterfaceC2178w interfaceC2178w) {
            AbstractC2980h.m5136e("<set-?>", interfaceC2178w);
            this.eventListenerFactory = interfaceC2178w;
        }

        public final void setFollowRedirects$okhttp(boolean z7) {
            this.followRedirects = z7;
        }

        public final void setFollowSslRedirects$okhttp(boolean z7) {
            this.followSslRedirects = z7;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier) {
            AbstractC2980h.m5136e("<set-?>", hostnameVerifier);
            this.hostnameVerifier = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j) {
            this.minWebSocketMessageToCompress = j;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        public final void setProtocols$okhttp(List<? extends EnumC2074f0> list) {
            AbstractC2980h.m5136e("<set-?>", list);
            this.protocols = list;
        }

        public final void setProxy$okhttp(Proxy proxy) {
            this.proxy = proxy;
        }

        public final void setProxyAuthenticator$okhttp(InterfaceC2067c interfaceC2067c) {
            AbstractC2980h.m5136e("<set-?>", interfaceC2067c);
            this.proxyAuthenticator = interfaceC2067c;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z7) {
            this.retryOnConnectionFailure = z7;
        }

        public final void setRouteDatabase$okhttp(C2099i c2099i) {
            this.routeDatabase = c2099i;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory) {
            AbstractC2980h.m5136e("<set-?>", socketFactory);
            this.socketFactory = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final a socketFactory(SocketFactory socketFactory) {
            AbstractC2980h.m5136e("socketFactory", socketFactory);
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if (!socketFactory.equals(this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        public final a sslSocketFactory(SSLSocketFactory sSLSocketFactory) throws IllegalAccessException, NoSuchFieldException {
            AbstractC2980h.m5136e("sslSocketFactory", sSLSocketFactory);
            if (!sSLSocketFactory.equals(this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            C2385h.a aVar = C2385h.Companion;
            X509TrustManager x509TrustManagerTrustManager = aVar.get().trustManager(sSLSocketFactory);
            if (x509TrustManagerTrustManager == null) {
                throw new IllegalStateException("Unable to extract the trust manager on " + aVar.get() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
            }
            this.x509TrustManagerOrNull = x509TrustManagerTrustManager;
            C2385h c2385h = aVar.get();
            X509TrustManager x509TrustManager = this.x509TrustManagerOrNull;
            AbstractC2980h.m5133b(x509TrustManager);
            this.certificateChainCleaner = c2385h.buildCertificateChainCleaner(x509TrustManager);
            return this;
        }

        public final a writeTimeout(long j, TimeUnit timeUnit) {
            AbstractC2980h.m5136e("unit", timeUnit);
            this.writeTimeout = AbstractC2278c.checkDuration("timeout", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public final a callTimeout(Duration duration) {
            AbstractC2980h.m5136e("duration", duration);
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final a connectTimeout(Duration duration) {
            AbstractC2980h.m5136e("duration", duration);
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final a pingInterval(Duration duration) {
            AbstractC2980h.m5136e("duration", duration);
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final a readTimeout(Duration duration) {
            AbstractC2980h.m5136e("duration", duration);
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final a writeTimeout(Duration duration) {
            AbstractC2980h.m5136e("duration", duration);
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final a sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            AbstractC2980h.m5136e("sslSocketFactory", sSLSocketFactory);
            AbstractC2980h.m5136e("trustManager", x509TrustManager);
            if (!sSLSocketFactory.equals(this.sslSocketFactoryOrNull) || !x509TrustManager.equals(this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            this.certificateChainCleaner = AbstractC2483c.Companion.get(x509TrustManager);
            this.x509TrustManagerOrNull = x509TrustManager;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(C2072e0 c2072e0) {
            this();
            AbstractC2980h.m5136e("okHttpClient", c2072e0);
            this.dispatcher = c2072e0.dispatcher();
            this.connectionPool = c2072e0.connectionPool();
            AbstractC1919n.m3757x0(this.interceptors, c2072e0.interceptors());
            AbstractC1919n.m3757x0(this.networkInterceptors, c2072e0.networkInterceptors());
            this.eventListenerFactory = c2072e0.eventListenerFactory();
            this.retryOnConnectionFailure = c2072e0.retryOnConnectionFailure();
            this.authenticator = c2072e0.authenticator();
            this.followRedirects = c2072e0.followRedirects();
            this.followSslRedirects = c2072e0.followSslRedirects();
            this.cookieJar = c2072e0.cookieJar();
            this.cache = c2072e0.cache();
            this.dns = c2072e0.dns();
            this.proxy = c2072e0.proxy();
            this.proxySelector = c2072e0.proxySelector();
            this.proxyAuthenticator = c2072e0.proxyAuthenticator();
            this.socketFactory = c2072e0.socketFactory();
            this.sslSocketFactoryOrNull = c2072e0.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = c2072e0.x509TrustManager();
            this.connectionSpecs = c2072e0.connectionSpecs();
            this.protocols = c2072e0.protocols();
            this.hostnameVerifier = c2072e0.hostnameVerifier();
            this.certificatePinner = c2072e0.certificatePinner();
            this.certificateChainCleaner = c2072e0.certificateChainCleaner();
            this.callTimeout = c2072e0.callTimeoutMillis();
            this.connectTimeout = c2072e0.connectTimeoutMillis();
            this.readTimeout = c2072e0.readTimeoutMillis();
            this.writeTimeout = c2072e0.writeTimeoutMillis();
            this.pingInterval = c2072e0.pingIntervalMillis();
            this.minWebSocketMessageToCompress = c2072e0.minWebSocketMessageToCompress();
            this.routeDatabase = c2072e0.getRouteDatabase();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.e0$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        public final List<C2167n> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return C2072e0.DEFAULT_CONNECTION_SPECS;
        }

        public final List<EnumC2074f0> getDEFAULT_PROTOCOLS$okhttp() {
            return C2072e0.DEFAULT_PROTOCOLS;
        }

        private b() {
        }
    }

    public C2072e0(a aVar) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector$okhttp;
        AbstractC2980h.m5136e("builder", aVar);
        this.dispatcher = aVar.getDispatcher$okhttp();
        this.connectionPool = aVar.getConnectionPool$okhttp();
        this.interceptors = AbstractC2278c.toImmutableList(aVar.getInterceptors$okhttp());
        this.networkInterceptors = AbstractC2278c.toImmutableList(aVar.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = aVar.getEventListenerFactory$okhttp();
        this.retryOnConnectionFailure = aVar.getRetryOnConnectionFailure$okhttp();
        this.authenticator = aVar.getAuthenticator$okhttp();
        this.followRedirects = aVar.getFollowRedirects$okhttp();
        this.followSslRedirects = aVar.getFollowSslRedirects$okhttp();
        this.cookieJar = aVar.getCookieJar$okhttp();
        this.cache = aVar.getCache$okhttp();
        this.dns = aVar.getDns$okhttp();
        this.proxy = aVar.getProxy$okhttp();
        if (aVar.getProxy$okhttp() != null) {
            proxySelector$okhttp = C2438a.INSTANCE;
        } else {
            proxySelector$okhttp = aVar.getProxySelector$okhttp();
            proxySelector$okhttp = proxySelector$okhttp == null ? ProxySelector.getDefault() : proxySelector$okhttp;
            if (proxySelector$okhttp == null) {
                proxySelector$okhttp = C2438a.INSTANCE;
            }
        }
        this.proxySelector = proxySelector$okhttp;
        this.proxyAuthenticator = aVar.getProxyAuthenticator$okhttp();
        this.socketFactory = aVar.getSocketFactory$okhttp();
        List<C2167n> connectionSpecs$okhttp = aVar.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = aVar.getProtocols$okhttp();
        this.hostnameVerifier = aVar.getHostnameVerifier$okhttp();
        this.callTimeoutMillis = aVar.getCallTimeout$okhttp();
        this.connectTimeoutMillis = aVar.getConnectTimeout$okhttp();
        this.readTimeoutMillis = aVar.getReadTimeout$okhttp();
        this.writeTimeoutMillis = aVar.getWriteTimeout$okhttp();
        this.pingIntervalMillis = aVar.getPingInterval$okhttp();
        this.minWebSocketMessageToCompress = aVar.getMinWebSocketMessageToCompress$okhttp();
        C2099i routeDatabase$okhttp = aVar.getRouteDatabase$okhttp();
        this.routeDatabase = routeDatabase$okhttp == null ? new C2099i() : routeDatabase$okhttp;
        if (connectionSpecs$okhttp == null || !connectionSpecs$okhttp.isEmpty()) {
            Iterator<T> it = connectionSpecs$okhttp.iterator();
            while (it.hasNext()) {
                if (((C2167n) it.next()).isTls()) {
                    if (aVar.getSslSocketFactoryOrNull$okhttp() != null) {
                        this.sslSocketFactoryOrNull = aVar.getSslSocketFactoryOrNull$okhttp();
                        AbstractC2483c certificateChainCleaner$okhttp = aVar.getCertificateChainCleaner$okhttp();
                        AbstractC2980h.m5133b(certificateChainCleaner$okhttp);
                        this.certificateChainCleaner = certificateChainCleaner$okhttp;
                        X509TrustManager x509TrustManagerOrNull$okhttp = aVar.getX509TrustManagerOrNull$okhttp();
                        AbstractC2980h.m5133b(x509TrustManagerOrNull$okhttp);
                        this.x509TrustManager = x509TrustManagerOrNull$okhttp;
                        this.certificatePinner = aVar.getCertificatePinner$okhttp().withCertificateChainCleaner$okhttp(certificateChainCleaner$okhttp);
                    } else {
                        C2385h.a aVar2 = C2385h.Companion;
                        X509TrustManager x509TrustManagerPlatformTrustManager = aVar2.get().platformTrustManager();
                        this.x509TrustManager = x509TrustManagerPlatformTrustManager;
                        C2385h c2385h = aVar2.get();
                        AbstractC2980h.m5133b(x509TrustManagerPlatformTrustManager);
                        this.sslSocketFactoryOrNull = c2385h.newSslSocketFactory(x509TrustManagerPlatformTrustManager);
                        AbstractC2483c.a aVar3 = AbstractC2483c.Companion;
                        AbstractC2980h.m5133b(x509TrustManagerPlatformTrustManager);
                        AbstractC2483c abstractC2483c = aVar3.get(x509TrustManagerPlatformTrustManager);
                        this.certificateChainCleaner = abstractC2483c;
                        C2079i certificatePinner$okhttp = aVar.getCertificatePinner$okhttp();
                        AbstractC2980h.m5133b(abstractC2483c);
                        this.certificatePinner = certificatePinner$okhttp.withCertificateChainCleaner$okhttp(abstractC2483c);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = C2079i.DEFAULT;
        } else {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = C2079i.DEFAULT;
        }
        verifyClientState();
    }

    private final void verifyClientState() {
        List<InterfaceC2068c0> list = this.interceptors;
        AbstractC2980h.m5134c("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>", list);
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        List<InterfaceC2068c0> list2 = this.networkInterceptors;
        AbstractC2980h.m5134c("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>", list2);
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<C2167n> list3 = this.connectionSpecs;
        if (list3 == null || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((C2167n) it.next()).isTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC2980h.m5132a(this.certificatePinner, C2079i.DEFAULT)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: -deprecated_authenticator, reason: not valid java name */
    public final InterfaceC2067c m5186deprecated_authenticator() {
        return this.authenticator;
    }

    /* renamed from: -deprecated_cache, reason: not valid java name */
    public final C2069d m5187deprecated_cache() {
        return this.cache;
    }

    /* renamed from: -deprecated_callTimeoutMillis, reason: not valid java name */
    public final int m5188deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final C2079i m5189deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    /* renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name */
    public final int m5190deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* renamed from: -deprecated_connectionPool, reason: not valid java name */
    public final C2165m m5191deprecated_connectionPool() {
        return this.connectionPool;
    }

    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<C2167n> m5192deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    /* renamed from: -deprecated_cookieJar, reason: not valid java name */
    public final InterfaceC2172q m5193deprecated_cookieJar() {
        return this.cookieJar;
    }

    /* renamed from: -deprecated_dispatcher, reason: not valid java name */
    public final C2174s m5194deprecated_dispatcher() {
        return this.dispatcher;
    }

    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final InterfaceC2176u m5195deprecated_dns() {
        return this.dns;
    }

    /* renamed from: -deprecated_eventListenerFactory, reason: not valid java name */
    public final InterfaceC2178w m5196deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* renamed from: -deprecated_followRedirects, reason: not valid java name */
    public final boolean m5197deprecated_followRedirects() {
        return this.followRedirects;
    }

    /* renamed from: -deprecated_followSslRedirects, reason: not valid java name */
    public final boolean m5198deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m5199deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<InterfaceC2068c0> m5200deprecated_interceptors() {
        return this.interceptors;
    }

    /* renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<InterfaceC2068c0> m5201deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    /* renamed from: -deprecated_pingIntervalMillis, reason: not valid java name */
    public final int m5202deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<EnumC2074f0> m5203deprecated_protocols() {
        return this.protocols;
    }

    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m5204deprecated_proxy() {
        return this.proxy;
    }

    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final InterfaceC2067c m5205deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m5206deprecated_proxySelector() {
        return this.proxySelector;
    }

    /* renamed from: -deprecated_readTimeoutMillis, reason: not valid java name */
    public final int m5207deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name */
    public final boolean m5208deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m5209deprecated_socketFactory() {
        return this.socketFactory;
    }

    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m5210deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    /* renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name */
    public final int m5211deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final InterfaceC2067c authenticator() {
        return this.authenticator;
    }

    public final C2069d cache() {
        return this.cache;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final AbstractC2483c certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final C2079i certificatePinner() {
        return this.certificatePinner;
    }

    public Object clone() {
        return super.clone();
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final C2165m connectionPool() {
        return this.connectionPool;
    }

    public final List<C2167n> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final InterfaceC2172q cookieJar() {
        return this.cookieJar;
    }

    public final C2174s dispatcher() {
        return this.dispatcher;
    }

    public final InterfaceC2176u dns() {
        return this.dns;
    }

    public final InterfaceC2178w eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final C2099i getRouteDatabase() {
        return this.routeDatabase;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<InterfaceC2068c0> interceptors() {
        return this.interceptors;
    }

    public final long minWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    public final List<InterfaceC2068c0> networkInterceptors() {
        return this.networkInterceptors;
    }

    public a newBuilder() {
        return new a(this);
    }

    @Override // okhttp3.InterfaceC2073f
    public InterfaceC2075g newCall(C2076g0 c2076g0) {
        AbstractC2980h.m5136e("request", c2076g0);
        return new C2095e(this, c2076g0, false);
    }

    @Override // okhttp3.InterfaceC2166m0
    public InterfaceC2168n0 newWebSocket(C2076g0 c2076g0, AbstractC2170o0 abstractC2170o0) {
        AbstractC2980h.m5136e("request", c2076g0);
        AbstractC2980h.m5136e("listener", abstractC2170o0);
        C2153d c2153d = new C2153d(C2090e.INSTANCE, c2076g0, abstractC2170o0, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        c2153d.connect(this);
        return c2153d;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<EnumC2074f0> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final InterfaceC2067c proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }

    public C2072e0() {
        this(new a());
    }
}
