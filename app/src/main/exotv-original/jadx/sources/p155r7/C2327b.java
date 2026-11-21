package p155r7;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import okhttp3.C2063a;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2159j;
import okhttp3.C2162k0;
import okhttp3.C2173r;
import okhttp3.C2181z;
import okhttp3.InterfaceC2067c;
import okhttp3.InterfaceC2176u;
import p111m6.AbstractC1913h;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r7.b */
/* loaded from: classes.dex */
public final class C2327b implements InterfaceC2067c {
    private final InterfaceC2176u defaultDns;

    /* JADX WARN: Multi-variable type inference failed */
    public C2327b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final InetAddress connectToInetAddress(Proxy proxy, C2181z c2181z, InterfaceC2176u interfaceC2176u) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : AbstractC2326a.$EnumSwitchMapping$0[type.ordinal()]) == 1) {
            return (InetAddress) AbstractC1913h.m3736A0(interfaceC2176u.lookup(c2181z.host()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        AbstractC2980h.m5134c("null cannot be cast to non-null type java.net.InetSocketAddress", socketAddressAddress);
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        AbstractC2980h.m5135d("address() as InetSocketAddress).address", address);
        return address;
    }

    @Override // okhttp3.InterfaceC2067c
    public C2076g0 authenticate(C2162k0 c2162k0, C2080i0 c2080i0) {
        Proxy proxy;
        InterfaceC2176u interfaceC2176uDns;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C2063a c2063aAddress;
        AbstractC2980h.m5136e("response", c2080i0);
        List<C2159j> listChallenges = c2080i0.challenges();
        C2076g0 c2076g0Request = c2080i0.request();
        C2181z c2181zUrl = c2076g0Request.url();
        boolean z7 = c2080i0.code() == 407;
        if (c2162k0 == null || (proxy = c2162k0.proxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C2159j c2159j : listChallenges) {
            if ("Basic".equalsIgnoreCase(c2159j.scheme())) {
                if (c2162k0 == null || (c2063aAddress = c2162k0.address()) == null || (interfaceC2176uDns = c2063aAddress.dns()) == null) {
                    interfaceC2176uDns = this.defaultDns;
                }
                if (z7) {
                    SocketAddress socketAddressAddress = proxy.address();
                    AbstractC2980h.m5134c("null cannot be cast to non-null type java.net.InetSocketAddress", socketAddressAddress);
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), connectToInetAddress(proxy, c2181zUrl, interfaceC2176uDns), inetSocketAddress.getPort(), c2181zUrl.scheme(), c2159j.realm(), c2159j.scheme(), c2181zUrl.url(), Authenticator.RequestorType.PROXY);
                } else {
                    String strHost = c2181zUrl.host();
                    AbstractC2980h.m5135d("proxy", proxy);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strHost, connectToInetAddress(proxy, c2181zUrl, interfaceC2176uDns), c2181zUrl.port(), c2181zUrl.scheme(), c2159j.realm(), c2159j.scheme(), c2181zUrl.url(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z7 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    AbstractC2980h.m5135d("auth.userName", userName);
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    AbstractC2980h.m5135d("auth.password", password);
                    return c2076g0Request.newBuilder().header(str, C2173r.basic(userName, new String(password), c2159j.charset())).build();
                }
            }
        }
        return null;
    }

    public C2327b(InterfaceC2176u interfaceC2176u) {
        AbstractC2980h.m5136e("defaultDns", interfaceC2176u);
        this.defaultDns = interfaceC2176u;
    }

    public /* synthetic */ C2327b(InterfaceC2176u interfaceC2176u, int i, AbstractC2977e abstractC2977e) {
        this((i & 1) != 0 ? InterfaceC2176u.SYSTEM : interfaceC2176u);
    }
}
