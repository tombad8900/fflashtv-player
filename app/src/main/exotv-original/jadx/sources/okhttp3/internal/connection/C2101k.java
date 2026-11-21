package okhttp3.internal.connection;

import com.bumptech.glide.AbstractC0715d;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.AbstractC2177v;
import okhttp3.C2063a;
import okhttp3.C2162k0;
import okhttp3.C2181z;
import okhttp3.InterfaceC2075g;
import p111m6.AbstractC1919n;
import p111m6.C1921p;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.connection.k */
/* loaded from: classes.dex */
public final class C2101k {
    public static final a Companion = new a(null);
    private final C2063a address;
    private final InterfaceC2075g call;
    private final AbstractC2177v eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<C2162k0> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final C2099i routeDatabase;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            AbstractC2980h.m5136e("<this>", inetSocketAddress);
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                AbstractC2980h.m5135d("hostName", hostName);
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            AbstractC2980h.m5135d("address.hostAddress", hostAddress);
            return hostAddress;
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.connection.k$b */
    public static final class b {
        private int nextRouteIndex;
        private final List<C2162k0> routes;

        public b(List<C2162k0> list) {
            AbstractC2980h.m5136e("routes", list);
            this.routes = list;
        }

        public final List<C2162k0> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final C2162k0 next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            List<C2162k0> list = this.routes;
            int i = this.nextRouteIndex;
            this.nextRouteIndex = i + 1;
            return list.get(i);
        }
    }

    public C2101k(C2063a c2063a, C2099i c2099i, InterfaceC2075g interfaceC2075g, AbstractC2177v abstractC2177v) {
        AbstractC2980h.m5136e("address", c2063a);
        AbstractC2980h.m5136e("routeDatabase", c2099i);
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("eventListener", abstractC2177v);
        this.address = c2063a;
        this.routeDatabase = c2099i;
        this.call = interfaceC2075g;
        this.eventListener = abstractC2177v;
        C1921p c1921p = C1921p.f7187j;
        this.proxies = c1921p;
        this.inetSocketAddresses = c1921p;
        this.postponedRoutes = new ArrayList();
        resetNextProxy(c2063a.url(), c2063a.proxy());
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy nextProxy() throws SocketException, UnknownHostException {
        if (!hasNextProxy()) {
            throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
        }
        List<? extends Proxy> list = this.proxies;
        int i = this.nextProxyIndex;
        this.nextProxyIndex = i + 1;
        Proxy proxy = list.get(i);
        resetNextInetSocketAddress(proxy);
        return proxy;
    }

    private final void resetNextInetSocketAddress(Proxy proxy) throws SocketException, UnknownHostException {
        String strHost;
        int iPort;
        List<InetAddress> listLookup;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strHost = this.address.url().host();
            iPort = this.address.url().port();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strHost = Companion.getSocketHost(inetSocketAddress);
            iPort = inetSocketAddress.getPort();
        }
        if (1 > iPort || iPort >= 65536) {
            throw new SocketException("No route to " + strHost + ':' + iPort + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strHost, iPort));
            return;
        }
        if (AbstractC2278c.canParseAsIpAddress(strHost)) {
            listLookup = AbstractC0715d.m1551T(InetAddress.getByName(strHost));
        } else {
            this.eventListener.dnsStart(this.call, strHost);
            listLookup = this.address.dns().lookup(strHost);
            if (listLookup.isEmpty()) {
                throw new UnknownHostException(this.address.dns() + " returned no addresses for " + strHost);
            }
            this.eventListener.dnsEnd(this.call, strHost, listLookup);
        }
        Iterator<InetAddress> it = listLookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), iPort));
        }
    }

    private final void resetNextProxy(C2181z c2181z, Proxy proxy) {
        this.eventListener.proxySelectStart(this.call, c2181z);
        List<Proxy> listResetNextProxy$selectProxies = resetNextProxy$selectProxies(proxy, c2181z, this);
        this.proxies = listResetNextProxy$selectProxies;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, c2181z, listResetNextProxy$selectProxies);
    }

    private static final List<Proxy> resetNextProxy$selectProxies(Proxy proxy, C2181z c2181z, C2101k c2101k) {
        if (proxy != null) {
            return AbstractC0715d.m1551T(proxy);
        }
        URI uri = c2181z.uri();
        if (uri.getHost() == null) {
            return AbstractC2278c.immutableListOf(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = c2101k.address.proxySelector().select(uri);
        if (listSelect == null || listSelect.isEmpty()) {
            return AbstractC2278c.immutableListOf(Proxy.NO_PROXY);
        }
        AbstractC2980h.m5135d("proxiesOrNull", listSelect);
        return AbstractC2278c.toImmutableList(listSelect);
    }

    public final boolean hasNext() {
        return hasNextProxy() || !this.postponedRoutes.isEmpty();
    }

    public final b next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (hasNextProxy()) {
            Proxy proxyNextProxy = nextProxy();
            Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                C2162k0 c2162k0 = new C2162k0(this.address, proxyNextProxy, it.next());
                if (this.routeDatabase.shouldPostpone(c2162k0)) {
                    this.postponedRoutes.add(c2162k0);
                } else {
                    arrayList.add(c2162k0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC1919n.m3757x0(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new b(arrayList);
    }
}
