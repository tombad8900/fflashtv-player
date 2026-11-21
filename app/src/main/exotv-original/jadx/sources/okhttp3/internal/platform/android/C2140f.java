package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.EnumC2074f0;
import p069h7.AbstractC1199a;
import p069h7.AbstractC1214p;
import p164s7.C2379b;
import p164s7.C2385h;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.platform.android.f */
/* loaded from: classes.dex */
public class C2140f implements InterfaceC2147m {
    public static final a Companion;
    private static final InterfaceC2144j playProviderFactory;
    private final Method getAlpnSelectedProtocol;
    private final Method setAlpnProtocols;
    private final Method setHostname;
    private final Method setUseSessionTickets;
    private final Class<? super SSLSocket> sslSocketClass;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.platform.android.f$a */
    public static final class a {

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.internal.platform.android.f$a$a, reason: collision with other inner class name */
        public static final class C2994a implements InterfaceC2144j {
            final /* synthetic */ String $packageName;

            public C2994a(String str) {
                this.$packageName = str;
            }

            @Override // okhttp3.internal.platform.android.InterfaceC2144j
            public InterfaceC2147m create(SSLSocket sSLSocket) {
                AbstractC2980h.m5136e("sslSocket", sSLSocket);
                return C2140f.Companion.build(sSLSocket.getClass());
            }

            @Override // okhttp3.internal.platform.android.InterfaceC2144j
            public boolean matchesSocket(SSLSocket sSLSocket) {
                AbstractC2980h.m5136e("sslSocket", sSLSocket);
                return AbstractC1214p.m2667t0(sSLSocket.getClass().getName(), this.$packageName + '.', false);
            }
        }

        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C2140f build(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> superclass = cls;
            while (superclass != null && !superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            AbstractC2980h.m5133b(superclass);
            return new C2140f(superclass);
        }

        public final InterfaceC2144j factory(String str) {
            AbstractC2980h.m5136e("packageName", str);
            return new C2994a(str);
        }

        public final InterfaceC2144j getPlayProviderFactory() {
            return C2140f.playProviderFactory;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        playProviderFactory = aVar.factory("com.google.android.gms.org.conscrypt");
    }

    public C2140f(Class<? super SSLSocket> cls) throws NoSuchMethodException, SecurityException {
        AbstractC2980h.m5136e("sslSocketClass", cls);
        this.sslSocketClass = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC2980h.m5135d("sslSocketClass.getDeclar\u2026:class.javaPrimitiveType)", declaredMethod);
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = cls.getMethod("setHostname", String.class);
        this.getAlpnSelectedProtocol = cls.getMethod("getAlpnSelectedProtocol", null);
        this.setAlpnProtocols = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends EnumC2074f0> list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        AbstractC2980h.m5136e("protocols", list);
        if (matchesSocket(sSLSocket)) {
            try {
                this.setUseSessionTickets.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.setHostname.invoke(sSLSocket, str);
                }
                this.setAlpnProtocols.invoke(sSLSocket, C2385h.Companion.concatLengthPrefixed(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e8) {
                throw new AssertionError(e8);
            }
        }
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        if (!matchesSocket(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, AbstractC1199a.f5077a);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if ((cause instanceof NullPointerException) && AbstractC2980h.m5132a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e8);
        }
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public boolean isSupported() {
        return C2379b.Companion.isSupported();
    }

    @Override // okhttp3.internal.platform.android.InterfaceC2147m
    public boolean matchesSocket(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        return this.sslSocketClass.isInstance(sSLSocket);
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
