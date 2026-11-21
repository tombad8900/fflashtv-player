package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p111m6.AbstractC1913h;
import p126o6.C2049a;
import p147q7.AbstractC2278c;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.n */
/* loaded from: classes.dex */
public final class C2167n {
    private static final C2161k[] APPROVED_CIPHER_SUITES;
    public static final C2167n CLEARTEXT;
    public static final C2167n COMPATIBLE_TLS;
    public static final b Companion = new b(null);
    public static final C2167n MODERN_TLS;
    private static final C2161k[] RESTRICTED_CIPHER_SUITES;
    public static final C2167n RESTRICTED_TLS;
    private final String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final String[] tlsVersionsAsString;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.n$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        private b() {
        }
    }

    static {
        C2161k c2161k = C2161k.TLS_AES_128_GCM_SHA256;
        C2161k c2161k2 = C2161k.TLS_AES_256_GCM_SHA384;
        C2161k c2161k3 = C2161k.TLS_CHACHA20_POLY1305_SHA256;
        C2161k c2161k4 = C2161k.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
        C2161k c2161k5 = C2161k.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
        C2161k c2161k6 = C2161k.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
        C2161k c2161k7 = C2161k.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
        C2161k c2161k8 = C2161k.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        C2161k c2161k9 = C2161k.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        C2161k[] c2161kArr = {c2161k, c2161k2, c2161k3, c2161k4, c2161k5, c2161k6, c2161k7, c2161k8, c2161k9};
        RESTRICTED_CIPHER_SUITES = c2161kArr;
        C2161k[] c2161kArr2 = {c2161k, c2161k2, c2161k3, c2161k4, c2161k5, c2161k6, c2161k7, c2161k8, c2161k9, C2161k.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, C2161k.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, C2161k.TLS_RSA_WITH_AES_128_GCM_SHA256, C2161k.TLS_RSA_WITH_AES_256_GCM_SHA384, C2161k.TLS_RSA_WITH_AES_128_CBC_SHA, C2161k.TLS_RSA_WITH_AES_256_CBC_SHA, C2161k.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        APPROVED_CIPHER_SUITES = c2161kArr2;
        a aVarCipherSuites = new a(true).cipherSuites((C2161k[]) Arrays.copyOf(c2161kArr, c2161kArr.length));
        EnumC2164l0 enumC2164l0 = EnumC2164l0.TLS_1_3;
        EnumC2164l0 enumC2164l02 = EnumC2164l0.TLS_1_2;
        RESTRICTED_TLS = aVarCipherSuites.tlsVersions(enumC2164l0, enumC2164l02).supportsTlsExtensions(true).build();
        MODERN_TLS = new a(true).cipherSuites((C2161k[]) Arrays.copyOf(c2161kArr2, c2161kArr2.length)).tlsVersions(enumC2164l0, enumC2164l02).supportsTlsExtensions(true).build();
        COMPATIBLE_TLS = new a(true).cipherSuites((C2161k[]) Arrays.copyOf(c2161kArr2, c2161kArr2.length)).tlsVersions(enumC2164l0, enumC2164l02, EnumC2164l0.TLS_1_1, EnumC2164l0.TLS_1_0).supportsTlsExtensions(true).build();
        CLEARTEXT = new a(false).build();
    }

    public C2167n(boolean z7, boolean z8, String[] strArr, String[] strArr2) {
        this.isTls = z7;
        this.supportsTlsExtensions = z8;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    private final C2167n supportedSpec(SSLSocket sSLSocket, boolean z7) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            AbstractC2980h.m5135d("sslSocket.enabledCipherSuites", enabledCipherSuites2);
            enabledCipherSuites = AbstractC2278c.intersect(enabledCipherSuites2, this.cipherSuitesAsString, C2161k.Companion.getORDER_BY_NAME$okhttp());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC2980h.m5135d("sslSocket.enabledProtocols", enabledProtocols2);
            enabledProtocols = AbstractC2278c.intersect(enabledProtocols2, this.tlsVersionsAsString, C2049a.f7569k);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC2980h.m5135d("supportedCipherSuites", supportedCipherSuites);
        int iIndexOf = AbstractC2278c.indexOf(supportedCipherSuites, "TLS_FALLBACK_SCSV", C2161k.Companion.getORDER_BY_NAME$okhttp());
        if (z7 && iIndexOf != -1) {
            AbstractC2980h.m5135d("cipherSuitesIntersection", enabledCipherSuites);
            String str = supportedCipherSuites[iIndexOf];
            AbstractC2980h.m5135d("supportedCipherSuites[indexOfFallbackScsv]", str);
            enabledCipherSuites = AbstractC2278c.concat(enabledCipherSuites, str);
        }
        a aVar = new a(this);
        AbstractC2980h.m5135d("cipherSuitesIntersection", enabledCipherSuites);
        a aVarCipherSuites = aVar.cipherSuites((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        AbstractC2980h.m5135d("tlsVersionsIntersection", enabledProtocols);
        return aVarCipherSuites.tlsVersions((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).build();
    }

    /* renamed from: -deprecated_cipherSuites, reason: not valid java name */
    public final List<C2161k> m5242deprecated_cipherSuites() {
        return cipherSuites();
    }

    /* renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name */
    public final boolean m5243deprecated_supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    /* renamed from: -deprecated_tlsVersions, reason: not valid java name */
    public final List<EnumC2164l0> m5244deprecated_tlsVersions() {
        return tlsVersions();
    }

    public final void apply$okhttp(SSLSocket sSLSocket, boolean z7) {
        AbstractC2980h.m5136e("sslSocket", sSLSocket);
        C2167n c2167nSupportedSpec = supportedSpec(sSLSocket, z7);
        if (c2167nSupportedSpec.tlsVersions() != null) {
            sSLSocket.setEnabledProtocols(c2167nSupportedSpec.tlsVersionsAsString);
        }
        if (c2167nSupportedSpec.cipherSuites() != null) {
            sSLSocket.setEnabledCipherSuites(c2167nSupportedSpec.cipherSuitesAsString);
        }
    }

    public final List<C2161k> cipherSuites() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C2161k.Companion.forJavaName(str));
        }
        return AbstractC1913h.m3747L0(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2167n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z7 = this.isTls;
        C2167n c2167n = (C2167n) obj;
        if (z7 != c2167n.isTls) {
            return false;
        }
        return !z7 || (Arrays.equals(this.cipherSuitesAsString, c2167n.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, c2167n.tlsVersionsAsString) && this.supportsTlsExtensions == c2167n.supportsTlsExtensions);
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    public final boolean isCompatible(SSLSocket sSLSocket) {
        AbstractC2980h.m5136e("socket", sSLSocket);
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !AbstractC2278c.hasIntersection(strArr, sSLSocket.getEnabledProtocols(), C2049a.f7569k)) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || AbstractC2278c.hasIntersection(strArr2, sSLSocket.getEnabledCipherSuites(), C2161k.Companion.getORDER_BY_NAME$okhttp());
    }

    public final boolean isTls() {
        return this.isTls;
    }

    public final boolean supportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final List<EnumC2164l0> tlsVersions() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(EnumC2164l0.Companion.forJavaName(str));
        }
        return AbstractC1913h.m3747L0(arrayList);
    }

    public String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(cipherSuites(), "[all enabled]") + ", tlsVersions=" + Objects.toString(tlsVersions(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.n$a */
    public static final class a {
        private String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private String[] tlsVersions;

        public a(boolean z7) {
            this.tls = z7;
        }

        public final a allEnabledCipherSuites() {
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            this.cipherSuites = null;
            return this;
        }

        public final a allEnabledTlsVersions() {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            this.tlsVersions = null;
            return this;
        }

        public final C2167n build() {
            return new C2167n(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        public final a cipherSuites(C2161k... c2161kArr) {
            AbstractC2980h.m5136e("cipherSuites", c2161kArr);
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(c2161kArr.length);
            for (C2161k c2161k : c2161kArr) {
                arrayList.add(c2161k.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return cipherSuites((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final String[] getCipherSuites$okhttp() {
            return this.cipherSuites;
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
            return this.supportsTlsExtensions;
        }

        public final boolean getTls$okhttp() {
            return this.tls;
        }

        public final String[] getTlsVersions$okhttp() {
            return this.tlsVersions;
        }

        public final void setCipherSuites$okhttp(String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final void setSupportsTlsExtensions$okhttp(boolean z7) {
            this.supportsTlsExtensions = z7;
        }

        public final void setTls$okhttp(boolean z7) {
            this.tls = z7;
        }

        public final void setTlsVersions$okhttp(String[] strArr) {
            this.tlsVersions = strArr;
        }

        public final a supportsTlsExtensions(boolean z7) {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.supportsTlsExtensions = z7;
            return this;
        }

        public final a tlsVersions(EnumC2164l0... enumC2164l0Arr) {
            AbstractC2980h.m5136e("tlsVersions", enumC2164l0Arr);
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(enumC2164l0Arr.length);
            for (EnumC2164l0 enumC2164l0 : enumC2164l0Arr) {
                arrayList.add(enumC2164l0.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return tlsVersions((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(C2167n c2167n) {
            AbstractC2980h.m5136e("connectionSpec", c2167n);
            this.tls = c2167n.isTls();
            this.cipherSuites = c2167n.cipherSuitesAsString;
            this.tlsVersions = c2167n.tlsVersionsAsString;
            this.supportsTlsExtensions = c2167n.supportsTlsExtensions();
        }

        public final a cipherSuites(String... strArr) {
            AbstractC2980h.m5136e("cipherSuites", strArr);
            if (this.tls) {
                if (!(strArr.length == 0)) {
                    this.cipherSuites = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        public final a tlsVersions(String... strArr) {
            AbstractC2980h.m5136e("tlsVersions", strArr);
            if (this.tls) {
                if (!(strArr.length == 0)) {
                    this.tlsVersions = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
    }
}
