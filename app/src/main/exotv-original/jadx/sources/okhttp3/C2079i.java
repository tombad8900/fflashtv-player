package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p090k2.C1584b;
import p111m6.AbstractC1912g;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1915j;
import p111m6.C1921p;
import p147q7.AbstractC2276a;
import p181u7.AbstractC2483c;
import p189v7.C2579m;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2981i;
import p220z6.AbstractC2989q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.i */
/* loaded from: classes.dex */
public final class C2079i {
    public static final b Companion = new b(null);
    public static final C2079i DEFAULT = new a().build();
    private final AbstractC2483c certificateChainCleaner;
    private final Set<c> pins;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.i$a */
    public static final class a {
        private final List<c> pins = new ArrayList();

        public final a add(String str, String... strArr) {
            AbstractC2980h.m5136e("pattern", str);
            AbstractC2980h.m5136e("pins", strArr);
            for (String str2 : strArr) {
                this.pins.add(new c(str, str2));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final C2079i build() {
            return new C2079i(AbstractC1913h.m3749N0(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<c> getPins() {
            return this.pins;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.i$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        public final String pin(Certificate certificate) {
            AbstractC2980h.m5136e("certificate", certificate);
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).mo4632a();
        }

        public final C2579m sha1Hash(X509Certificate x509Certificate) {
            AbstractC2980h.m5136e("<this>", x509Certificate);
            C2579m c2579m = C2579m.f9316m;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            AbstractC2980h.m5135d("publicKey.encoded", encoded);
            return C1584b.m3253t(encoded).mo4633c("SHA-1");
        }

        public final C2579m sha256Hash(X509Certificate x509Certificate) {
            AbstractC2980h.m5136e("<this>", x509Certificate);
            C2579m c2579m = C2579m.f9316m;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            AbstractC2980h.m5135d("publicKey.encoded", encoded);
            return C1584b.m3253t(encoded).mo4633c("SHA-256");
        }

        private b() {
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.i$c */
    public static final class c {
        private final C2579m hash;
        private final String hashAlgorithm;
        private final String pattern;

        public c(String str, String str2) {
            AbstractC2980h.m5136e("pattern", str);
            AbstractC2980h.m5136e("pin", str2);
            if ((!AbstractC1214p.m2667t0(str, "*.", false) || AbstractC1206h.m2628B0(str, "*", 1, false, 4) != -1) && ((!AbstractC1214p.m2667t0(str, "**.", false) || AbstractC1206h.m2628B0(str, "*", 2, false, 4) != -1) && AbstractC1206h.m2628B0(str, "*", 0, false, 6) != -1)) {
                throw new IllegalArgumentException("Unexpected pattern: ".concat(str).toString());
            }
            String canonicalHost = AbstractC2276a.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("Invalid pattern: ".concat(str));
            }
            this.pattern = canonicalHost;
            if (AbstractC1214p.m2667t0(str2, "sha1/", false)) {
                this.hashAlgorithm = "sha1";
                C2579m c2579m = C2579m.f9316m;
                String strSubstring = str2.substring(5);
                AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring);
                C2579m c2579mM3248m = C1584b.m3248m(strSubstring);
                if (c2579mM3248m == null) {
                    throw new IllegalArgumentException("Invalid pin hash: ".concat(str2));
                }
                this.hash = c2579mM3248m;
                return;
            }
            if (!AbstractC1214p.m2667t0(str2, "sha256/", false)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
            }
            this.hashAlgorithm = "sha256";
            C2579m c2579m2 = C2579m.f9316m;
            String strSubstring2 = str2.substring(7);
            AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring2);
            C2579m c2579mM3248m2 = C1584b.m3248m(strSubstring2);
            if (c2579mM3248m2 == null) {
                throw new IllegalArgumentException("Invalid pin hash: ".concat(str2));
            }
            this.hash = c2579mM3248m2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC2980h.m5132a(this.pattern, cVar.pattern) && AbstractC2980h.m5132a(this.hashAlgorithm, cVar.hashAlgorithm) && AbstractC2980h.m5132a(this.hash, cVar.hash);
        }

        public final C2579m getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + AbstractC0008a1.m9e(this.hashAlgorithm, this.pattern.hashCode() * 31, 31);
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            AbstractC2980h.m5136e("certificate", x509Certificate);
            String str = this.hashAlgorithm;
            if (AbstractC2980h.m5132a(str, "sha256")) {
                return AbstractC2980h.m5132a(this.hash, C2079i.Companion.sha256Hash(x509Certificate));
            }
            if (AbstractC2980h.m5132a(str, "sha1")) {
                return AbstractC2980h.m5132a(this.hash, C2079i.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean matchesHostname(String str) {
            AbstractC2980h.m5136e("hostname", str);
            if (AbstractC1214p.m2667t0(this.pattern, "**.", false)) {
                int length = this.pattern.length() - 3;
                int length2 = str.length() - length;
                return AbstractC1214p.m2662o0(str.length() - length, 3, length, str, this.pattern, false) && (length2 == 0 || str.charAt(length2 - 1) == '.');
            }
            if (!AbstractC1214p.m2667t0(this.pattern, "*.", false)) {
                return str.equals(this.pattern);
            }
            int length3 = this.pattern.length() - 1;
            int length4 = str.length() - length3;
            if (!AbstractC1214p.m2662o0(str.length() - length3, 1, length3, str, this.pattern, false) || AbstractC1206h.m2631E0(str, '.', length4 - 1, 4) != -1) {
            }
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.mo4632a();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.i$d */
    public static final class d extends AbstractC2981i implements InterfaceC2840a {
        final /* synthetic */ String $hostname;
        final /* synthetic */ List<Certificate> $peerCertificates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends Certificate> list, String str) {
            super(0);
            this.$peerCertificates = list;
            this.$hostname = str;
        }

        @Override // p212y6.InterfaceC2840a
        public final List<X509Certificate> invoke() {
            List<Certificate> listClean;
            AbstractC2483c certificateChainCleaner$okhttp = C2079i.this.getCertificateChainCleaner$okhttp();
            if (certificateChainCleaner$okhttp == null || (listClean = certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname)) == null) {
                listClean = this.$peerCertificates;
            }
            ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(listClean));
            for (Certificate certificate : listClean) {
                AbstractC2980h.m5134c("null cannot be cast to non-null type java.security.cert.X509Certificate", certificate);
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C2079i(Set<c> set, AbstractC2483c abstractC2483c) {
        AbstractC2980h.m5136e("pins", set);
        this.pins = set;
        this.certificateChainCleaner = abstractC2483c;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final C2579m sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final C2579m sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) {
        AbstractC2980h.m5136e("hostname", str);
        AbstractC2980h.m5136e("peerCertificates", list);
        check$okhttp(str, new d(list, str));
    }

    public final void check$okhttp(String str, InterfaceC2840a interfaceC2840a) throws SSLPeerUnverifiedException {
        AbstractC2980h.m5136e("hostname", str);
        AbstractC2980h.m5136e("cleanedPeerCertificatesFn", interfaceC2840a);
        List<c> listFindMatchingPins = findMatchingPins(str);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) interfaceC2840a.invoke();
        for (X509Certificate x509Certificate : list) {
            C2579m c2579mSha256Hash = null;
            C2579m c2579mSha1Hash = null;
            for (c cVar : listFindMatchingPins) {
                String hashAlgorithm = cVar.getHashAlgorithm();
                if (AbstractC2980h.m5132a(hashAlgorithm, "sha256")) {
                    if (c2579mSha256Hash == null) {
                        c2579mSha256Hash = Companion.sha256Hash(x509Certificate);
                    }
                    if (AbstractC2980h.m5132a(cVar.getHash(), c2579mSha256Hash)) {
                        return;
                    }
                } else {
                    if (!AbstractC2980h.m5132a(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.getHashAlgorithm());
                    }
                    if (c2579mSha1Hash == null) {
                        c2579mSha1Hash = Companion.sha1Hash(x509Certificate);
                    }
                    if (AbstractC2980h.m5132a(cVar.getHash(), c2579mSha1Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (c cVar2 : listFindMatchingPins) {
            sb.append("\n    ");
            sb.append(cVar2);
        }
        String string = sb.toString();
        AbstractC2980h.m5135d("StringBuilder().apply(builderAction).toString()", string);
        throw new SSLPeerUnverifiedException(string);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2079i)) {
            return false;
        }
        C2079i c2079i = (C2079i) obj;
        return AbstractC2980h.m5132a(c2079i.pins, this.pins) && AbstractC2980h.m5132a(c2079i.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final List<c> findMatchingPins(String str) {
        AbstractC2980h.m5136e("hostname", str);
        List arrayList = C1921p.f7187j;
        for (Object obj : this.pins) {
            if (((c) obj).matchesHostname(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                AbstractC2989q.m5144a(arrayList).add(obj);
            }
        }
        return arrayList;
    }

    public final AbstractC2483c getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<c> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (this.pins.hashCode() + 1517) * 41;
        AbstractC2483c abstractC2483c = this.certificateChainCleaner;
        return iHashCode + (abstractC2483c != null ? abstractC2483c.hashCode() : 0);
    }

    public final C2079i withCertificateChainCleaner$okhttp(AbstractC2483c abstractC2483c) {
        AbstractC2980h.m5136e("certificateChainCleaner", abstractC2483c);
        return AbstractC2980h.m5132a(this.certificateChainCleaner, abstractC2483c) ? this : new C2079i(this.pins, abstractC2483c);
    }

    public final void check(String str, Certificate... certificateArr) {
        AbstractC2980h.m5136e("hostname", str);
        AbstractC2980h.m5136e("peerCertificates", certificateArr);
        check(str, AbstractC1912g.m3735s0(certificateArr));
    }

    public /* synthetic */ C2079i(Set set, AbstractC2483c abstractC2483c, int i, AbstractC2977e abstractC2977e) {
        this(set, (i & 2) != 0 ? null : abstractC2483c);
    }
}
