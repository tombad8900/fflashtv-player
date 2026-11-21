package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.EnumC2074f0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.platform.android.k */
/* loaded from: classes.dex */
public final class C2145k implements InterfaceC2147m {
    private InterfaceC2147m delegate;
    private final InterfaceC2144j socketAdapterFactory;

    public C2145k(InterfaceC2144j interfaceC2144j) {
        AbstractC2980h.m5136e("socketAdapterFactory", interfaceC2144j);
        this.socketAdapterFactory = interfaceC2144j;
    }

    private final synchronized InterfaceC2147m getDelegate(SSLSocket sSLSocket) {
        try {
            if (this.delegate == null && this.socketAdapterFactory.matchesSocket(sSLSocket)) {
                this.delegate = this.socketAdapterFactory.create(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.delegate;
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends EnumC2074f0> list) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        AbstractC2980h.m5136e("protocols", list);
        InterfaceC2147m delegate = getDelegate(sSLSocket);
        if (delegate != null) {
            delegate.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        InterfaceC2147m delegate = getDelegate(sSLSocket);
        if (delegate != null) {
            return delegate.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public boolean isSupported() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public boolean matchesSocket(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        return this.socketAdapterFactory.matchesSocket(sSLSocket);
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
