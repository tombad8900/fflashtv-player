package p164s7;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C2072e0;
import okhttp3.EnumC2074f0;
import okhttp3.internal.platform.android.C2137c;
import p111m6.AbstractC1915j;
import p147q7.AbstractC2278c;
import p181u7.AbstractC2483c;
import p181u7.C2481a;
import p181u7.C2482b;
import p181u7.InterfaceC2485e;
import p189v7.C2573j;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s7.h */
/* loaded from: classes.dex */
public class C2385h {
    public static final a Companion;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger;
    private static volatile C2385h platform;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: s7.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        private final C2385h findAndroidPlatform() {
            C2137c.INSTANCE.enable();
            C2385h c2385hBuildIfSupported = C2378a.Companion.buildIfSupported();
            if (c2385hBuildIfSupported != null) {
                return c2385hBuildIfSupported;
            }
            C2385h c2385hBuildIfSupported2 = C2379b.Companion.buildIfSupported();
            AbstractC2980h.m5133b(c2385hBuildIfSupported2);
            return c2385hBuildIfSupported2;
        }

        private final C2385h findJvmPlatform() {
            C2384g c2384gBuildIfSupported;
            C2380c c2380cBuildIfSupported;
            C2381d c2381dBuildIfSupported;
            if (isConscryptPreferred() && (c2381dBuildIfSupported = C2381d.Companion.buildIfSupported()) != null) {
                return c2381dBuildIfSupported;
            }
            if (isBouncyCastlePreferred() && (c2380cBuildIfSupported = C2380c.Companion.buildIfSupported()) != null) {
                return c2380cBuildIfSupported;
            }
            if (isOpenJSSEPreferred() && (c2384gBuildIfSupported = C2384g.Companion.buildIfSupported()) != null) {
                return c2384gBuildIfSupported;
            }
            C2383f c2383fBuildIfSupported = C2383f.Companion.buildIfSupported();
            if (c2383fBuildIfSupported != null) {
                return c2383fBuildIfSupported;
            }
            C2385h c2385hBuildIfSupported = C2382e.Companion.buildIfSupported();
            return c2385hBuildIfSupported != null ? c2385hBuildIfSupported : new C2385h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C2385h findPlatform() {
            return isAndroid() ? findAndroidPlatform() : findJvmPlatform();
        }

        private final boolean isBouncyCastlePreferred() {
            return "BC".equals(Security.getProviders()[0].getName());
        }

        private final boolean isConscryptPreferred() {
            return "Conscrypt".equals(Security.getProviders()[0].getName());
        }

        private final boolean isOpenJSSEPreferred() {
            return "OpenJSSE".equals(Security.getProviders()[0].getName());
        }

        public static /* synthetic */ void resetForTests$default(a aVar, C2385h c2385h, int i, Object obj) {
            if ((i & 1) != 0) {
                c2385h = aVar.findPlatform();
            }
            aVar.resetForTests(c2385h);
        }

        public final List<String> alpnProtocolNames(List<? extends EnumC2074f0> list) {
            AbstractC2980h.m5136e("protocols", list);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((EnumC2074f0) obj) != EnumC2074f0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1915j.m3756w0(arrayList));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                arrayList2.add(((EnumC2074f0) obj2).toString());
            }
            return arrayList2;
        }

        public final byte[] concatLengthPrefixed(List<? extends EnumC2074f0> list) {
            AbstractC2980h.m5136e("protocols", list);
            C2573j c2573j = new C2573j();
            for (String str : alpnProtocolNames(list)) {
                c2573j.m4655K(str.length());
                c2573j.m4661Q(str);
            }
            return c2573j.m4648D(c2573j.f9314k);
        }

        public final C2385h get() {
            return C2385h.platform;
        }

        public final boolean isAndroid() {
            return "Dalvik".equals(System.getProperty("java.vm.name"));
        }

        public final void resetForTests(C2385h c2385h) {
            AbstractC2980h.m5136e("platform", c2385h);
            C2385h.platform = c2385h;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        platform = aVar.findPlatform();
        logger = Logger.getLogger(C2072e0.class.getName());
    }

    public static final C2385h get() {
        return Companion.get();
    }

    public static /* synthetic */ void log$default(C2385h c2385h, String str, int i, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i4 & 2) != 0) {
            i = 4;
        }
        if ((i4 & 4) != 0) {
            th = null;
        }
        c2385h.log(str, i, th);
    }

    public void afterHandshake(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
    }

    public AbstractC2483c buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        AbstractC2980h.m5136e("trustManager", x509TrustManager);
        return new C2481a(buildTrustRootIndex(x509TrustManager));
    }

    public InterfaceC2485e buildTrustRootIndex(X509TrustManager x509TrustManager) {
        AbstractC2980h.m5136e("trustManager", x509TrustManager);
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        AbstractC2980h.m5135d("trustManager.acceptedIssuers", acceptedIssuers);
        return new C2482b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<EnumC2074f0> list) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        AbstractC2980h.m5136e("protocols", list);
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        AbstractC2980h.m5136e("socket", socket);
        AbstractC2980h.m5136e("address", inetSocketAddress);
        socket.connect(inetSocketAddress, i);
    }

    public final String getPrefix() {
        return "OkHttp";
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        return null;
    }

    public Object getStackTraceForCloseable(String str) {
        AbstractC2980h.m5136e("closer", str);
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(String str) {
        AbstractC2980h.m5136e("hostname", str);
        return true;
    }

    public void log(String str, int i, Throwable th) {
        AbstractC2980h.m5136e("message", str);
        logger.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void logCloseableLeak(String str, Object obj) {
        AbstractC2980h.m5136e("message", str);
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        log(str, 5, (Throwable) obj);
    }

    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC2980h.m5135d("getInstance(\"TLS\")", sSLContext);
        return sSLContext;
    }

    public SSLSocketFactory newSslSocketFactory(X509TrustManager x509TrustManager) throws KeyManagementException {
        AbstractC2980h.m5136e("trustManager", x509TrustManager);
        try {
            SSLContext sSLContextNewSSLContext = newSSLContext();
            sSLContextNewSSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
            AbstractC2980h.m5135d("newSSLContext().apply {\n\u2026ll)\n      }.socketFactory", socketFactory);
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager platformTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC2980h.m5133b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC2980h.m5134c("null cannot be cast to non-null type javax.net.ssl.X509TrustManager", trustManager);
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        AbstractC2980h.m5135d("toString(this)", string);
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) throws IllegalAccessException, NoSuchFieldException {
        AbstractC2980h.m5136e("sslSocketFactory", sSLSocketFactory);
        try {
            Object fieldOrNull = AbstractC2278c.readFieldOrNull(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (fieldOrNull == null) {
                return null;
            }
            return (X509TrustManager) AbstractC2278c.readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e) {
            if (!e.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
                throw e;
            }
            return null;
        }
    }
}
