package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C2181z;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.a */
/* loaded from: classes.dex */
public final class C2063a {
    private final C2079i certificatePinner;
    private final List<C2167n> connectionSpecs;
    private final InterfaceC2176u dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<EnumC2074f0> protocols;
    private final Proxy proxy;
    private final InterfaceC2067c proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final C2181z url;

    public C2063a(String str, int i, InterfaceC2176u interfaceC2176u, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C2079i c2079i, InterfaceC2067c interfaceC2067c, Proxy proxy, List<? extends EnumC2074f0> list, List<C2167n> list2, ProxySelector proxySelector) {
        AbstractC2980h.m5136e("uriHost", str);
        AbstractC2980h.m5136e("dns", interfaceC2176u);
        AbstractC2980h.m5136e("socketFactory", socketFactory);
        AbstractC2980h.m5136e("proxyAuthenticator", interfaceC2067c);
        AbstractC2980h.m5136e("protocols", list);
        AbstractC2980h.m5136e("connectionSpecs", list2);
        AbstractC2980h.m5136e("proxySelector", proxySelector);
        this.dns = interfaceC2176u;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = c2079i;
        this.proxyAuthenticator = interfaceC2067c;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new C2181z.a().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i).build();
        this.protocols = AbstractC2278c.toImmutableList(list);
        this.connectionSpecs = AbstractC2278c.toImmutableList(list2);
    }

    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final C2079i m5160deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<C2167n> m5161deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final InterfaceC2176u m5162deprecated_dns() {
        return this.dns;
    }

    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m5163deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<EnumC2074f0> m5164deprecated_protocols() {
        return this.protocols;
    }

    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m5165deprecated_proxy() {
        return this.proxy;
    }

    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final InterfaceC2067c m5166deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m5167deprecated_proxySelector() {
        return this.proxySelector;
    }

    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m5168deprecated_socketFactory() {
        return this.socketFactory;
    }

    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m5169deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    /* renamed from: -deprecated_url, reason: not valid java name */
    public final C2181z m5170deprecated_url() {
        return this.url;
    }

    public final C2079i certificatePinner() {
        return this.certificatePinner;
    }

    public final List<C2167n> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final InterfaceC2176u dns() {
        return this.dns;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2063a)) {
            return false;
        }
        C2063a c2063a = (C2063a) obj;
        return AbstractC2980h.m5132a(this.url, c2063a.url) && equalsNonHost$okhttp(c2063a);
    }

    public final boolean equalsNonHost$okhttp(C2063a c2063a) {
        AbstractC2980h.m5136e("that", c2063a);
        return AbstractC2980h.m5132a(this.dns, c2063a.dns) && AbstractC2980h.m5132a(this.proxyAuthenticator, c2063a.proxyAuthenticator) && AbstractC2980h.m5132a(this.protocols, c2063a.protocols) && AbstractC2980h.m5132a(this.connectionSpecs, c2063a.connectionSpecs) && AbstractC2980h.m5132a(this.proxySelector, c2063a.proxySelector) && AbstractC2980h.m5132a(this.proxy, c2063a.proxy) && AbstractC2980h.m5132a(this.sslSocketFactory, c2063a.sslSocketFactory) && AbstractC2980h.m5132a(this.hostnameVerifier, c2063a.hostnameVerifier) && AbstractC2980h.m5132a(this.certificatePinner, c2063a.certificatePinner) && this.url.port() == c2063a.url.port();
    }

    public int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + ((this.connectionSpecs.hashCode() + ((this.protocols.hashCode() + ((this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
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

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder("Address{");
        sb2.append(this.url.host());
        sb2.append(':');
        sb2.append(this.url.port());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }

    public final C2181z url() {
        return this.url;
    }
}
