package p164s7;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C2181z;
import okhttp3.EnumC2074f0;
import p069h7.AbstractC1213o;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s7.f */
/* loaded from: classes.dex */
public class C2383f extends C2385h {
    public static final a Companion = new a(null);
    private static final boolean isAvailable;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: s7.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final C2383f buildIfSupported() {
            if (isAvailable()) {
                return new C2383f();
            }
            return null;
        }

        public final boolean isAvailable() {
            return C2383f.isAvailable;
        }

        private a() {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numM2658k0 = property != null ? AbstractC1213o.m2658k0(property) : null;
        boolean z7 = false;
        if (numM2658k0 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z7 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numM2658k0.intValue() >= 9) {
            z7 = true;
        }
        isAvailable = z7;
    }

    @Override // p164s7.C2385h
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<EnumC2074f0> list) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        AbstractC2980h.m5136e("protocols", list);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) C2385h.Companion.alpnProtocolNames(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // p164s7.C2385h
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals(C2181z.FRAGMENT_ENCODE_SET)) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // p164s7.C2385h
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        AbstractC2980h.m5136e("sslSocketFactory", sSLSocketFactory);
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
