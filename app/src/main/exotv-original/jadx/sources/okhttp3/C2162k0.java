package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.k0 */
/* loaded from: classes.dex */
public final class C2162k0 {
    private final C2063a address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public C2162k0(C2063a c2063a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        AbstractC2980h.m5136e("address", c2063a);
        AbstractC2980h.m5136e("proxy", proxy);
        AbstractC2980h.m5136e("socketAddress", inetSocketAddress);
        this.address = c2063a;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    /* renamed from: -deprecated_address, reason: not valid java name */
    public final C2063a m5238deprecated_address() {
        return this.address;
    }

    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m5239deprecated_proxy() {
        return this.proxy;
    }

    /* renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final InetSocketAddress m5240deprecated_socketAddress() {
        return this.socketAddress;
    }

    public final C2063a address() {
        return this.address;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2162k0)) {
            return false;
        }
        C2162k0 c2162k0 = (C2162k0) obj;
        return AbstractC2980h.m5132a(c2162k0.address, this.address) && AbstractC2980h.m5132a(c2162k0.proxy, this.proxy) && AbstractC2980h.m5132a(c2162k0.socketAddress, this.socketAddress);
    }

    public int hashCode() {
        return this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((this.address.hashCode() + 527) * 31)) * 31);
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
