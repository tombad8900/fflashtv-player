package p164s7;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.EnumC2074f0;
import okhttp3.internal.platform.android.C2136b;
import okhttp3.internal.platform.android.C2140f;
import okhttp3.internal.platform.android.C2141g;
import okhttp3.internal.platform.android.C2142h;
import okhttp3.internal.platform.android.C2143i;
import okhttp3.internal.platform.android.C2145k;
import okhttp3.internal.platform.android.C2148n;
import okhttp3.internal.platform.android.InterfaceC2147m;
import p111m6.AbstractC1912g;
import p181u7.AbstractC2483c;
import p181u7.InterfaceC2485e;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s7.b */
/* loaded from: classes.dex */
public final class C2379b extends C2385h {
    public static final a Companion = new a(null);
    private static final boolean isSupported;
    private final C2142h closeGuard;
    private final List<InterfaceC2147m> socketAdapters;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: s7.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final C2385h buildIfSupported() {
            if (isSupported()) {
                return new C2379b();
            }
            return null;
        }

        public final boolean isSupported() {
            return C2379b.isSupported;
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: s7.b$b */
    public static final class b implements InterfaceC2485e {
        private final Method findByIssuerAndSignatureMethod;
        private final X509TrustManager trustManager;

        public b(X509TrustManager x509TrustManager, Method method) {
            AbstractC2980h.m5136e("trustManager", x509TrustManager);
            AbstractC2980h.m5136e("findByIssuerAndSignatureMethod", method);
            this.trustManager = x509TrustManager;
            this.findByIssuerAndSignatureMethod = method;
        }

        private final X509TrustManager component1() {
            return this.trustManager;
        }

        private final Method component2() {
            return this.findByIssuerAndSignatureMethod;
        }

        public static /* synthetic */ b copy$default(b bVar, X509TrustManager x509TrustManager, Method method, int i, Object obj) {
            if ((i & 1) != 0) {
                x509TrustManager = bVar.trustManager;
            }
            if ((i & 2) != 0) {
                method = bVar.findByIssuerAndSignatureMethod;
            }
            return bVar.copy(x509TrustManager, method);
        }

        public final b copy(X509TrustManager x509TrustManager, Method method) {
            AbstractC2980h.m5136e("trustManager", x509TrustManager);
            AbstractC2980h.m5136e("findByIssuerAndSignatureMethod", method);
            return new b(x509TrustManager, method);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC2980h.m5132a(this.trustManager, bVar.trustManager) && AbstractC2980h.m5132a(this.findByIssuerAndSignatureMethod, bVar.findByIssuerAndSignatureMethod);
        }

        @Override // p181u7.InterfaceC2485e
        public X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC2980h.m5136e("cert", x509Certificate);
            try {
                Object objInvoke = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, x509Certificate);
                AbstractC2980h.m5134c("null cannot be cast to non-null type java.security.cert.TrustAnchor", objInvoke);
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public int hashCode() {
            return this.findByIssuerAndSignatureMethod.hashCode() + (this.trustManager.hashCode() * 31);
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.trustManager + ", findByIssuerAndSignatureMethod=" + this.findByIssuerAndSignatureMethod + ')';
        }
    }

    static {
        boolean z7 = false;
        if (C2385h.Companion.isAndroid() && Build.VERSION.SDK_INT < 30) {
            z7 = true;
        }
        isSupported = z7;
    }

    public C2379b() {
        int i = 0;
        ArrayList arrayListM3733q0 = AbstractC1912g.m3733q0(new InterfaceC2147m[]{C2148n.a.buildIfSupported$default(C2148n.Companion, null, 1, null), new C2145k(C2140f.Companion.getPlayProviderFactory()), new C2145k(C2143i.Companion.getFactory()), new C2145k(C2141g.Companion.getFactory())});
        ArrayList arrayList = new ArrayList();
        int size = arrayListM3733q0.size();
        while (i < size) {
            Object obj = arrayListM3733q0.get(i);
            i++;
            if (((InterfaceC2147m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.socketAdapters = arrayList;
        this.closeGuard = C2142h.Companion.get();
    }

    @Override // p164s7.C2385h
    public AbstractC2483c buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        AbstractC2980h.m5136e("trustManager", x509TrustManager);
        C2136b c2136bBuildIfSupported = C2136b.Companion.buildIfSupported(x509TrustManager);
        return c2136bBuildIfSupported != null ? c2136bBuildIfSupported : super.buildCertificateChainCleaner(x509TrustManager);
    }

    @Override // p164s7.C2385h
    public InterfaceC2485e buildTrustRootIndex(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        AbstractC2980h.m5136e("trustManager", x509TrustManager);
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(x509TrustManager);
        }
    }

    @Override // p164s7.C2385h
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<EnumC2074f0> list) {
        Object next;
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        AbstractC2980h.m5136e("protocols", list);
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC2147m) next).matchesSocket(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC2147m interfaceC2147m = (InterfaceC2147m) next;
        if (interfaceC2147m != null) {
            interfaceC2147m.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    @Override // p164s7.C2385h
    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        AbstractC2980h.m5136e("socket", socket);
        AbstractC2980h.m5136e("address", inetSocketAddress);
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // p164s7.C2385h
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        Object next;
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC2147m) next).matchesSocket(sSLSocket)) {
                break;
            }
        }
        InterfaceC2147m interfaceC2147m = (InterfaceC2147m) next;
        if (interfaceC2147m != null) {
            return interfaceC2147m.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p164s7.C2385h
    public Object getStackTraceForCloseable(String str) {
        AbstractC2980h.m5136e("closer", str);
        return this.closeGuard.createAndOpen(str);
    }

    @Override // p164s7.C2385h
    public boolean isCleartextTrafficPermitted(String str) {
        AbstractC2980h.m5136e("hostname", str);
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p164s7.C2385h
    public void logCloseableLeak(String str, Object obj) {
        AbstractC2980h.m5136e("message", str);
        if (this.closeGuard.warnIfOpen(obj)) {
            return;
        }
        C2385h.log$default(this, str, 5, null, 4, null);
    }

    @Override // p164s7.C2385h
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        Object next;
        AbstractC2980h.m5136e("sslSocketFactory", sSLSocketFactory);
        Iterator<T> it = this.socketAdapters.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC2147m) next).matchesSocketFactory(sSLSocketFactory)) {
                break;
            }
        }
        InterfaceC2147m interfaceC2147m = (InterfaceC2147m) next;
        if (interfaceC2147m != null) {
            return interfaceC2147m.trustManager(sSLSocketFactory);
        }
        return null;
    }
}
