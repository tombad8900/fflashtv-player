package p164s7;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.EnumC2074f0;
import okhttp3.internal.platform.android.C2135a;
import okhttp3.internal.platform.android.C2136b;
import okhttp3.internal.platform.android.C2140f;
import okhttp3.internal.platform.android.C2141g;
import okhttp3.internal.platform.android.C2143i;
import okhttp3.internal.platform.android.C2145k;
import okhttp3.internal.platform.android.InterfaceC2147m;
import p111m6.AbstractC1912g;
import p181u7.AbstractC2483c;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s7.a */
/* loaded from: classes.dex */
public final class C2378a extends C2385h {
    public static final a Companion = new a(null);
    private static final boolean isSupported;
    private final List<InterfaceC2147m> socketAdapters;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: s7.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final C2385h buildIfSupported() {
            if (isSupported()) {
                return new C2378a();
            }
            return null;
        }

        public final boolean isSupported() {
            return C2378a.isSupported;
        }

        private a() {
        }
    }

    static {
        isSupported = C2385h.Companion.isAndroid() && Build.VERSION.SDK_INT >= 29;
    }

    public C2378a() {
        int i = 0;
        ArrayList arrayListM3733q0 = AbstractC1912g.m3733q0(new InterfaceC2147m[]{C2135a.Companion.buildIfSupported(), new C2145k(C2140f.Companion.getPlayProviderFactory()), new C2145k(C2143i.Companion.getFactory()), new C2145k(C2141g.Companion.getFactory())});
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
    }

    @Override // p164s7.C2385h
    public AbstractC2483c buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        AbstractC2980h.m5136e("trustManager", x509TrustManager);
        C2136b c2136bBuildIfSupported = C2136b.Companion.buildIfSupported(x509TrustManager);
        return c2136bBuildIfSupported != null ? c2136bBuildIfSupported : super.buildCertificateChainCleaner(x509TrustManager);
    }

    @Override // p164s7.C2385h
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends EnumC2074f0> list) {
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
    @SuppressLint({"NewApi"})
    public boolean isCleartextTrafficPermitted(String str) {
        AbstractC2980h.m5136e("hostname", str);
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
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
