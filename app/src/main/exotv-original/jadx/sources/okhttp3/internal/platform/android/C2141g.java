package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C2181z;
import okhttp3.EnumC2074f0;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p164s7.C2380c;
import p164s7.C2385h;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.platform.android.g */
/* loaded from: classes.dex */
public final class C2141g implements InterfaceC2147m {
    public static final b Companion = new b(null);
    private static final InterfaceC2144j factory = new a();

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.platform.android.g$a */
    public static final class a implements InterfaceC2144j {
        @Override // okhttp3.internal.platform.android.InterfaceC2144j
        public InterfaceC2147m create(SSLSocket sSLSocket) {
            AbstractC2980h.m5136e("sslSocket", sSLSocket);
            return new C2141g();
        }

        @Override // okhttp3.internal.platform.android.InterfaceC2144j
        public boolean matchesSocket(SSLSocket sSLSocket) {
            AbstractC2980h.m5136e("sslSocket", sSLSocket);
            C2380c.Companion.isSupported();
            return false;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.platform.android.g$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        public final InterfaceC2144j getFactory() {
            return C2141g.factory;
        }

        private b() {
        }
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends EnumC2074f0> list) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        AbstractC2980h.m5136e("protocols", list);
        if (matchesSocket(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) C2385h.Companion.alpnProtocolNames(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals(C2181z.FRAGMENT_ENCODE_SET)) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public boolean isSupported() {
        return C2380c.Companion.isSupported();
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public boolean matchesSocket(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        return false;
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return AbstractC2146l.matchesSocketFactory(this, sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return AbstractC2146l.trustManager(this, sSLSocketFactory);
    }
}
