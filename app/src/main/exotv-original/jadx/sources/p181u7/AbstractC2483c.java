package p181u7;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import p164s7.C2385h;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u7.c */
/* loaded from: classes.dex */
public abstract class AbstractC2483c {
    public static final a Companion = new a(null);

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: u7.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final AbstractC2483c get(X509TrustManager x509TrustManager) {
            AbstractC2980h.m5136e("trustManager", x509TrustManager);
            return C2385h.Companion.get().buildCertificateChainCleaner(x509TrustManager);
        }

        private a() {
        }

        public final AbstractC2483c get(X509Certificate... x509CertificateArr) {
            AbstractC2980h.m5136e("caCerts", x509CertificateArr);
            return new C2481a(new C2482b((X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)));
        }
    }

    public abstract List<Certificate> clean(List<? extends Certificate> list, String str);
}
