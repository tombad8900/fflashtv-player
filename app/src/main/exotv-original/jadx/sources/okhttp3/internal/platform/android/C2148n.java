package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p147q7.AbstractC2278c;
import p164s7.C2385h;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.platform.android.n */
/* loaded from: classes.dex */
public final class C2148n extends C2140f {
    public static final a Companion = new a(null);
    private final Class<?> paramClass;
    private final Class<? super SSLSocketFactory> sslSocketFactoryClass;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.platform.android.n$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public static /* synthetic */ InterfaceC2147m buildIfSupported$default(a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.buildIfSupported(str);
        }

        public final InterfaceC2147m buildIfSupported(String str) {
            AbstractC2980h.m5136e("packageName", str);
            try {
                return new C2148n(Class.forName(str.concat(".OpenSSLSocketImpl")), Class.forName(str.concat(".OpenSSLSocketFactoryImpl")), Class.forName(str.concat(".SSLParametersImpl")));
            } catch (Exception e) {
                C2385h.Companion.get().log("unable to load android socket classes", 5, e);
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2148n(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        AbstractC2980h.m5136e("sslSocketClass", cls);
        AbstractC2980h.m5136e("sslSocketFactoryClass", cls2);
        AbstractC2980h.m5136e("paramClass", cls3);
        this.sslSocketFactoryClass = cls2;
        this.paramClass = cls3;
    }

    @Override // okhttp3.internal.platform.android.C2140f, okhttp3.internal.platform.android.InterfaceC2147m
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        AbstractC2980h.m5136e("sslSocketFactory", sSLSocketFactory);
        return this.sslSocketFactoryClass.isInstance(sSLSocketFactory);
    }

    @Override // okhttp3.internal.platform.android.C2140f, okhttp3.internal.platform.android.InterfaceC2147m
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        AbstractC2980h.m5136e("sslSocketFactory", sSLSocketFactory);
        Object fieldOrNull = AbstractC2278c.readFieldOrNull(sSLSocketFactory, this.paramClass, "sslParameters");
        AbstractC2980h.m5133b(fieldOrNull);
        X509TrustManager x509TrustManager = (X509TrustManager) AbstractC2278c.readFieldOrNull(fieldOrNull, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (X509TrustManager) AbstractC2278c.readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager") : x509TrustManager;
    }
}
