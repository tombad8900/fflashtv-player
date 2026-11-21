package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.v */
/* loaded from: classes.dex */
public abstract class AbstractC2177v {
    public static final b Companion = new b(null);
    public static final AbstractC2177v NONE = new a();

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.v$a */
    public static final class a extends AbstractC2177v {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.v$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        private b() {
        }
    }

    public void cacheConditionalHit(InterfaceC2075g interfaceC2075g, C2080i0 c2080i0) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("cachedResponse", c2080i0);
    }

    public void cacheHit(InterfaceC2075g interfaceC2075g, C2080i0 c2080i0) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("response", c2080i0);
    }

    public void cacheMiss(InterfaceC2075g interfaceC2075g) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
    }

    public void callEnd(InterfaceC2075g interfaceC2075g) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
    }

    public void callFailed(InterfaceC2075g interfaceC2075g, IOException iOException) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("ioe", iOException);
    }

    public void callStart(InterfaceC2075g interfaceC2075g) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
    }

    public void canceled(InterfaceC2075g interfaceC2075g) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
    }

    public void connectEnd(InterfaceC2075g interfaceC2075g, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC2074f0 enumC2074f0) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("inetSocketAddress", inetSocketAddress);
        AbstractC2980h.m5136e("proxy", proxy);
    }

    public void connectFailed(InterfaceC2075g interfaceC2075g, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC2074f0 enumC2074f0, IOException iOException) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("inetSocketAddress", inetSocketAddress);
        AbstractC2980h.m5136e("proxy", proxy);
        AbstractC2980h.m5136e("ioe", iOException);
    }

    public void connectStart(InterfaceC2075g interfaceC2075g, InetSocketAddress inetSocketAddress, Proxy proxy) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("inetSocketAddress", inetSocketAddress);
        AbstractC2980h.m5136e("proxy", proxy);
    }

    public void connectionAcquired(InterfaceC2075g interfaceC2075g, InterfaceC2163l interfaceC2163l) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("connection", interfaceC2163l);
    }

    public void connectionReleased(InterfaceC2075g interfaceC2075g, InterfaceC2163l interfaceC2163l) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("connection", interfaceC2163l);
    }

    public void dnsEnd(InterfaceC2075g interfaceC2075g, String str, List<InetAddress> list) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("domainName", str);
        AbstractC2980h.m5136e("inetAddressList", list);
    }

    public void dnsStart(InterfaceC2075g interfaceC2075g, String str) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("domainName", str);
    }

    public void proxySelectEnd(InterfaceC2075g interfaceC2075g, C2181z c2181z, List<Proxy> list) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("url", c2181z);
        AbstractC2980h.m5136e("proxies", list);
    }

    public void proxySelectStart(InterfaceC2075g interfaceC2075g, C2181z c2181z) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("url", c2181z);
    }

    public void requestBodyEnd(InterfaceC2075g interfaceC2075g, long j) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
    }

    public void requestBodyStart(InterfaceC2075g interfaceC2075g) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
    }

    public void requestFailed(InterfaceC2075g interfaceC2075g, IOException iOException) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("ioe", iOException);
    }

    public void requestHeadersEnd(InterfaceC2075g interfaceC2075g, C2076g0 c2076g0) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("request", c2076g0);
    }

    public void requestHeadersStart(InterfaceC2075g interfaceC2075g) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
    }

    public void responseBodyEnd(InterfaceC2075g interfaceC2075g, long j) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
    }

    public void responseBodyStart(InterfaceC2075g interfaceC2075g) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
    }

    public void responseFailed(InterfaceC2075g interfaceC2075g, IOException iOException) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("ioe", iOException);
    }

    public void responseHeadersEnd(InterfaceC2075g interfaceC2075g, C2080i0 c2080i0) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("response", c2080i0);
    }

    public void responseHeadersStart(InterfaceC2075g interfaceC2075g) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
    }

    public void satisfactionFailure(InterfaceC2075g interfaceC2075g, C2080i0 c2080i0) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
        AbstractC2980h.m5136e("response", c2080i0);
    }

    public void secureConnectEnd(InterfaceC2075g interfaceC2075g, C2179x c2179x) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
    }

    public void secureConnectStart(InterfaceC2075g interfaceC2075g) {
        AbstractC2980h.m5136e("call", interfaceC2075g);
    }
}
