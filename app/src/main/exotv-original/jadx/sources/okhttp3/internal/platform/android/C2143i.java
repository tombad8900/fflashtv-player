package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.EnumC2074f0;
import org.conscrypt.Conscrypt;
import p164s7.C2381d;
import p164s7.C2385h;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.platform.android.i */
/* loaded from: classes.dex */
public final class C2143i implements InterfaceC2147m {
    public static final b Companion = new b(null);
    private static final InterfaceC2144j factory = new a();

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.platform.android.i$a */
    public static final class a implements InterfaceC2144j {
        @Override // okhttp3.internal.platform.android.InterfaceC2144j
        public InterfaceC2147m create(SSLSocket sSLSocket) {
            AbstractC2980h.m5136e("sslSocket", sSLSocket);
            return new C2143i();
        }

        @Override // okhttp3.internal.platform.android.InterfaceC2144j
        public boolean matchesSocket(SSLSocket sSLSocket) {
            AbstractC2980h.m5136e("sslSocket", sSLSocket);
            return C2381d.Companion.isSupported() && Conscrypt.isConscrypt(sSLSocket);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.platform.android.i$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        public final InterfaceC2144j getFactory() {
            return C2143i.factory;
        }

        private b() {
        }
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends EnumC2074f0> list) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        AbstractC2980h.m5136e("protocols", list);
        if (matchesSocket(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C2385h.Companion.alpnProtocolNames(list).toArray(new String[0]));
        }
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        if (matchesSocket(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public boolean isSupported() {
        return C2381d.Companion.isSupported();
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public boolean matchesSocket(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        return Conscrypt.isConscrypt(sSLSocket);
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
