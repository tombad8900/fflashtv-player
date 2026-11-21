package p164s7;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.EnumC2074f0;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s7.c */
/* loaded from: classes.dex */
public final class C2380c extends C2385h {
    public static final a Companion;
    private static final boolean isSupported;
    private final Provider provider;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: s7.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final C2380c buildIfSupported() {
            AbstractC2977e abstractC2977e = null;
            if (isSupported()) {
                return new C2380c(abstractC2977e);
            }
            return null;
        }

        public final boolean isSupported() {
            return C2380c.isSupported;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        boolean z7 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z7 = true;
        } catch (ClassNotFoundException unused) {
        }
        isSupported = z7;
    }

    public /* synthetic */ C2380c(AbstractC2977e abstractC2977e) {
        this();
    }

    @Override // p164s7.C2385h
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<EnumC2074f0> list) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        AbstractC2980h.m5136e("protocols", list);
        super.configureTlsExtensions(sSLSocket, str, list);
    }

    @Override // p164s7.C2385h
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        return super.getSelectedProtocol(sSLSocket);
    }

    @Override // p164s7.C2385h
    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.provider);
        AbstractC2980h.m5135d("getInstance(\"TLS\", provider)", sSLContext);
        return sSLContext;
    }

    @Override // p164s7.C2385h
    public X509TrustManager platformTrustManager() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    @Override // p164s7.C2385h
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        AbstractC2980h.m5136e("sslSocketFactory", sSLSocketFactory);
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with BouncyCastle");
    }

    private C2380c() {
        this.provider = new BouncyCastleJsseProvider();
    }
}
