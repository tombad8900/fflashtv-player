package p164s7;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.EnumC2074f0;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s7.d */
/* loaded from: classes.dex */
public final class C2381d extends C2385h {
    public static final a Companion;
    private static final boolean isSupported;
    private final Provider provider;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: s7.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public static /* synthetic */ boolean atLeastVersion$default(a aVar, int i, int i4, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                i4 = 0;
            }
            if ((i9 & 4) != 0) {
                i8 = 0;
            }
            return aVar.atLeastVersion(i, i4, i8);
        }

        public final boolean atLeastVersion(int i, int i4, int i8) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i4 ? version.minor() > i4 : version.patch() >= i8;
        }

        public final C2381d buildIfSupported() {
            AbstractC2977e abstractC2977e = null;
            if (isSupported()) {
                return new C2381d(abstractC2977e);
            }
            return null;
        }

        public final boolean isSupported() {
            return C2381d.isSupported;
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: s7.d$b */
    public static final class b implements ConscryptHostnameVerifier {
        public static final b INSTANCE = new b();

        private b() {
        }

        public final boolean verify(String str, SSLSession sSLSession) {
            return true;
        }

        public boolean verify(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) {
            return true;
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        boolean z7 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.atLeastVersion(2, 1, 0)) {
                    z7 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        isSupported = z7;
    }

    public /* synthetic */ C2381d(AbstractC2977e abstractC2977e) {
        this();
    }

    @Override // p164s7.C2385h
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<EnumC2074f0> list) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        AbstractC2980h.m5136e("protocols", list);
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.configureTlsExtensions(sSLSocket, str, list);
        } else {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C2385h.Companion.alpnProtocolNames(list).toArray(new String[0]));
        }
    }

    @Override // p164s7.C2385h
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.getSelectedProtocol(sSLSocket);
    }

    @Override // p164s7.C2385h
    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.provider);
        AbstractC2980h.m5135d("getInstance(\"TLS\", provider)", sSLContext);
        return sSLContext;
    }

    @Override // p164s7.C2385h
    public SSLSocketFactory newSslSocketFactory(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        AbstractC2980h.m5136e("trustManager", x509TrustManager);
        SSLContext sSLContextNewSSLContext = newSSLContext();
        sSLContextNewSSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
        AbstractC2980h.m5135d("newSSLContext().apply {\n\u2026null)\n    }.socketFactory", socketFactory);
        return socketFactory;
    }

    @Override // p164s7.C2385h
    public X509TrustManager platformTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC2980h.m5133b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC2980h.m5134c("null cannot be cast to non-null type javax.net.ssl.X509TrustManager", trustManager);
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.INSTANCE);
                return x509TrustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        AbstractC2980h.m5135d("toString(this)", string);
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    @Override // p164s7.C2385h
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        AbstractC2980h.m5136e("sslSocketFactory", sSLSocketFactory);
        return null;
    }

    private C2381d() {
        Provider providerNewProvider = Conscrypt.newProvider();
        AbstractC2980h.m5135d("newProvider()", providerNewProvider);
        this.provider = providerNewProvider;
    }
}
