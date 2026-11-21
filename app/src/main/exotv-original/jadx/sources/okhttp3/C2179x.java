package okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p102l6.C1690g;
import p102l6.InterfaceC1685b;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1915j;
import p111m6.C1921p;
import p147q7.AbstractC2278c;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2981i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.x */
/* loaded from: classes.dex */
public final class C2179x {
    public static final a Companion = new a(null);
    private final C2161k cipherSuite;
    private final List<Certificate> localCertificates;
    private final InterfaceC1685b peerCertificates$delegate;
    private final EnumC2164l0 tlsVersion;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.x$a */
    public static final class a {

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.x$a$a, reason: collision with other inner class name */
        public static final class C2995a extends AbstractC2981i implements InterfaceC2840a {
            final /* synthetic */ List<Certificate> $peerCertificatesCopy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2995a(List<? extends Certificate> list) {
                super(0);
                this.$peerCertificatesCopy = list;
            }

            @Override // p212y6.InterfaceC2840a
            public final List<Certificate> invoke() {
                return this.$peerCertificatesCopy;
            }
        }

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        /* renamed from: okhttp3.x$a$b */
        public static final class b extends AbstractC2981i implements InterfaceC2840a {
            final /* synthetic */ List<Certificate> $peerCertificatesCopy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(List<? extends Certificate> list) {
                super(0);
                this.$peerCertificatesCopy = list;
            }

            @Override // p212y6.InterfaceC2840a
            public final List<Certificate> invoke() {
                return this.$peerCertificatesCopy;
            }
        }

        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? AbstractC2278c.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length)) : C1921p.f7187j;
        }

        /* renamed from: -deprecated_get, reason: not valid java name */
        public final C2179x m5261deprecated_get(SSLSession sSLSession) {
            AbstractC2980h.m5136e("sslSession", sSLSession);
            return get(sSLSession);
        }

        public final C2179x get(SSLSession sSLSession) throws IOException {
            List<Certificate> immutableList;
            AbstractC2980h.m5136e("<this>", sSLSession);
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            C2161k c2161kForJavaName = C2161k.Companion.forJavaName(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            EnumC2164l0 enumC2164l0ForJavaName = EnumC2164l0.Companion.forJavaName(protocol);
            try {
                immutableList = toImmutableList(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                immutableList = C1921p.f7187j;
            }
            return new C2179x(enumC2164l0ForJavaName, c2161kForJavaName, toImmutableList(sSLSession.getLocalCertificates()), new b(immutableList));
        }

        private a() {
        }

        public final C2179x get(EnumC2164l0 enumC2164l0, C2161k c2161k, List<? extends Certificate> list, List<? extends Certificate> list2) {
            AbstractC2980h.m5136e("tlsVersion", enumC2164l0);
            AbstractC2980h.m5136e("cipherSuite", c2161k);
            AbstractC2980h.m5136e("peerCertificates", list);
            AbstractC2980h.m5136e("localCertificates", list2);
            return new C2179x(enumC2164l0, c2161k, AbstractC2278c.toImmutableList(list2), new C2995a(AbstractC2278c.toImmutableList(list)));
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.x$b */
    public static final class b extends AbstractC2981i implements InterfaceC2840a {
        final /* synthetic */ InterfaceC2840a $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2840a interfaceC2840a) {
            super(0);
            this.$peerCertificatesFn = interfaceC2840a;
        }

        @Override // p212y6.InterfaceC2840a
        public final List<Certificate> invoke() {
            try {
                return (List) this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C1921p.f7187j;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2179x(EnumC2164l0 enumC2164l0, C2161k c2161k, List<? extends Certificate> list, InterfaceC2840a interfaceC2840a) {
        AbstractC2980h.m5136e("tlsVersion", enumC2164l0);
        AbstractC2980h.m5136e("cipherSuite", c2161k);
        AbstractC2980h.m5136e("localCertificates", list);
        AbstractC2980h.m5136e("peerCertificatesFn", interfaceC2840a);
        this.tlsVersion = enumC2164l0;
        this.cipherSuite = c2161k;
        this.localCertificates = list;
        this.peerCertificates$delegate = new C1690g(new b(interfaceC2840a));
    }

    public static final C2179x get(SSLSession sSLSession) {
        return Companion.get(sSLSession);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        AbstractC2980h.m5135d("type", type);
        return type;
    }

    /* renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final C2161k m5255deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    /* renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m5256deprecated_localCertificates() {
        return this.localCertificates;
    }

    /* renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m5257deprecated_localPrincipal() {
        return localPrincipal();
    }

    /* renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m5258deprecated_peerCertificates() {
        return peerCertificates();
    }

    /* renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m5259deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    /* renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final EnumC2164l0 m5260deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    public final C2161k cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2179x)) {
            return false;
        }
        C2179x c2179x = (C2179x) obj;
        return c2179x.tlsVersion == this.tlsVersion && AbstractC2980h.m5132a(c2179x.cipherSuite, this.cipherSuite) && AbstractC2980h.m5132a(c2179x.peerCertificates(), peerCertificates()) && AbstractC2980h.m5132a(c2179x.localCertificates, this.localCertificates);
    }

    public int hashCode() {
        return this.localCertificates.hashCode() + ((peerCertificates().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        Object objM3737B0 = AbstractC1913h.m3737B0(this.localCertificates);
        X509Certificate x509Certificate = objM3737B0 instanceof X509Certificate ? (X509Certificate) objM3737B0 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    public final Principal peerPrincipal() {
        Object objM3737B0 = AbstractC1913h.m3737B0(peerCertificates());
        X509Certificate x509Certificate = objM3737B0 instanceof X509Certificate ? (X509Certificate) objM3737B0 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    public final EnumC2164l0 tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        List<Certificate> listPeerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(listPeerCertificates));
        Iterator<T> it = listPeerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(AbstractC1915j.m3756w0(list));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    public static final C2179x get(EnumC2164l0 enumC2164l0, C2161k c2161k, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return Companion.get(enumC2164l0, c2161k, list, list2);
    }
}
