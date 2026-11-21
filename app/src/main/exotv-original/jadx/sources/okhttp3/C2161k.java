package okhttp3;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import p069h7.AbstractC1214p;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.k */
/* loaded from: classes.dex */
public final class C2161k {
    public static final b Companion;
    private static final Map<String, C2161k> INSTANCES;
    private static final Comparator<String> ORDER_BY_NAME;
    public static final C2161k TLS_AES_128_CCM_8_SHA256;
    public static final C2161k TLS_AES_128_CCM_SHA256;
    public static final C2161k TLS_AES_128_GCM_SHA256;
    public static final C2161k TLS_AES_256_GCM_SHA384;
    public static final C2161k TLS_CHACHA20_POLY1305_SHA256;
    public static final C2161k TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA;
    public static final C2161k TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA;
    public static final C2161k TLS_DHE_DSS_WITH_AES_128_CBC_SHA;
    public static final C2161k TLS_DHE_DSS_WITH_AES_128_CBC_SHA256;
    public static final C2161k TLS_DHE_DSS_WITH_AES_128_GCM_SHA256;
    public static final C2161k TLS_DHE_DSS_WITH_AES_256_CBC_SHA;
    public static final C2161k TLS_DHE_DSS_WITH_AES_256_CBC_SHA256;
    public static final C2161k TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;
    public static final C2161k TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA;
    public static final C2161k TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA;
    public static final C2161k TLS_DHE_DSS_WITH_DES_CBC_SHA;
    public static final C2161k TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final C2161k TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final C2161k TLS_DHE_RSA_WITH_AES_128_CBC_SHA;
    public static final C2161k TLS_DHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final C2161k TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final C2161k TLS_DHE_RSA_WITH_AES_256_CBC_SHA;
    public static final C2161k TLS_DHE_RSA_WITH_AES_256_CBC_SHA256;
    public static final C2161k TLS_DHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final C2161k TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final C2161k TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final C2161k TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final C2161k TLS_DHE_RSA_WITH_DES_CBC_SHA;
    public static final C2161k TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA;
    public static final C2161k TLS_DH_anon_EXPORT_WITH_RC4_40_MD5;
    public static final C2161k TLS_DH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final C2161k TLS_DH_anon_WITH_AES_128_CBC_SHA;
    public static final C2161k TLS_DH_anon_WITH_AES_128_CBC_SHA256;
    public static final C2161k TLS_DH_anon_WITH_AES_128_GCM_SHA256;
    public static final C2161k TLS_DH_anon_WITH_AES_256_CBC_SHA;
    public static final C2161k TLS_DH_anon_WITH_AES_256_CBC_SHA256;
    public static final C2161k TLS_DH_anon_WITH_AES_256_GCM_SHA384;
    public static final C2161k TLS_DH_anon_WITH_DES_CBC_SHA;
    public static final C2161k TLS_DH_anon_WITH_RC4_128_MD5;
    public static final C2161k TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final C2161k TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA;
    public static final C2161k TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final C2161k TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final C2161k TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA;
    public static final C2161k TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final C2161k TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final C2161k TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final C2161k TLS_ECDHE_ECDSA_WITH_NULL_SHA;
    public static final C2161k TLS_ECDHE_ECDSA_WITH_RC4_128_SHA;
    public static final C2161k TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA;
    public static final C2161k TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA;
    public static final C2161k TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256;
    public static final C2161k TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final C2161k TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;
    public static final C2161k TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256;
    public static final C2161k TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
    public static final C2161k TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;
    public static final C2161k TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384;
    public static final C2161k TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
    public static final C2161k TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
    public static final C2161k TLS_ECDHE_RSA_WITH_NULL_SHA;
    public static final C2161k TLS_ECDHE_RSA_WITH_RC4_128_SHA;
    public static final C2161k TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA;
    public static final C2161k TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA;
    public static final C2161k TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256;
    public static final C2161k TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256;
    public static final C2161k TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA;
    public static final C2161k TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384;
    public static final C2161k TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384;
    public static final C2161k TLS_ECDH_ECDSA_WITH_NULL_SHA;
    public static final C2161k TLS_ECDH_ECDSA_WITH_RC4_128_SHA;
    public static final C2161k TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final C2161k TLS_ECDH_RSA_WITH_AES_128_CBC_SHA;
    public static final C2161k TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256;
    public static final C2161k TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256;
    public static final C2161k TLS_ECDH_RSA_WITH_AES_256_CBC_SHA;
    public static final C2161k TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384;
    public static final C2161k TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384;
    public static final C2161k TLS_ECDH_RSA_WITH_NULL_SHA;
    public static final C2161k TLS_ECDH_RSA_WITH_RC4_128_SHA;
    public static final C2161k TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA;
    public static final C2161k TLS_ECDH_anon_WITH_AES_128_CBC_SHA;
    public static final C2161k TLS_ECDH_anon_WITH_AES_256_CBC_SHA;
    public static final C2161k TLS_ECDH_anon_WITH_NULL_SHA;
    public static final C2161k TLS_ECDH_anon_WITH_RC4_128_SHA;
    public static final C2161k TLS_EMPTY_RENEGOTIATION_INFO_SCSV;
    public static final C2161k TLS_FALLBACK_SCSV;
    public static final C2161k TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5;
    public static final C2161k TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA;
    public static final C2161k TLS_KRB5_EXPORT_WITH_RC4_40_MD5;
    public static final C2161k TLS_KRB5_EXPORT_WITH_RC4_40_SHA;
    public static final C2161k TLS_KRB5_WITH_3DES_EDE_CBC_MD5;
    public static final C2161k TLS_KRB5_WITH_3DES_EDE_CBC_SHA;
    public static final C2161k TLS_KRB5_WITH_DES_CBC_MD5;
    public static final C2161k TLS_KRB5_WITH_DES_CBC_SHA;
    public static final C2161k TLS_KRB5_WITH_RC4_128_MD5;
    public static final C2161k TLS_KRB5_WITH_RC4_128_SHA;
    public static final C2161k TLS_PSK_WITH_3DES_EDE_CBC_SHA;
    public static final C2161k TLS_PSK_WITH_AES_128_CBC_SHA;
    public static final C2161k TLS_PSK_WITH_AES_256_CBC_SHA;
    public static final C2161k TLS_PSK_WITH_RC4_128_SHA;
    public static final C2161k TLS_RSA_EXPORT_WITH_DES40_CBC_SHA;
    public static final C2161k TLS_RSA_EXPORT_WITH_RC4_40_MD5;
    public static final C2161k TLS_RSA_WITH_3DES_EDE_CBC_SHA;
    public static final C2161k TLS_RSA_WITH_AES_128_CBC_SHA;
    public static final C2161k TLS_RSA_WITH_AES_128_CBC_SHA256;
    public static final C2161k TLS_RSA_WITH_AES_128_GCM_SHA256;
    public static final C2161k TLS_RSA_WITH_AES_256_CBC_SHA;
    public static final C2161k TLS_RSA_WITH_AES_256_CBC_SHA256;
    public static final C2161k TLS_RSA_WITH_AES_256_GCM_SHA384;
    public static final C2161k TLS_RSA_WITH_CAMELLIA_128_CBC_SHA;
    public static final C2161k TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
    public static final C2161k TLS_RSA_WITH_DES_CBC_SHA;
    public static final C2161k TLS_RSA_WITH_NULL_MD5;
    public static final C2161k TLS_RSA_WITH_NULL_SHA;
    public static final C2161k TLS_RSA_WITH_NULL_SHA256;
    public static final C2161k TLS_RSA_WITH_RC4_128_MD5;
    public static final C2161k TLS_RSA_WITH_RC4_128_SHA;
    public static final C2161k TLS_RSA_WITH_SEED_CBC_SHA;
    private final String javaName;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.k$a */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            AbstractC2980h.m5136e(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, str);
            AbstractC2980h.m5136e("b", str2);
            int iMin = Math.min(str.length(), str2.length());
            for (int i = 4; i < iMin; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt != cCharAt2) {
                    return AbstractC2980h.m5137f(cCharAt, cCharAt2) < 0 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.k$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2977e abstractC2977e) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C2161k init(String str, int i) {
            C2161k c2161k = new C2161k(str, null);
            C2161k.INSTANCES.put(str, c2161k);
            return c2161k;
        }

        private final String secondaryName(String str) {
            if (AbstractC1214p.m2667t0(str, "TLS_", false)) {
                String strSubstring = str.substring(4);
                AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring);
                return "SSL_".concat(strSubstring);
            }
            if (!AbstractC1214p.m2667t0(str, "SSL_", false)) {
                return str;
            }
            String strSubstring2 = str.substring(4);
            AbstractC2980h.m5135d("this as java.lang.String).substring(startIndex)", strSubstring2);
            return "TLS_".concat(strSubstring2);
        }

        public final synchronized C2161k forJavaName(String str) {
            C2161k c2161k;
            try {
                AbstractC2980h.m5136e("javaName", str);
                c2161k = (C2161k) C2161k.INSTANCES.get(str);
                if (c2161k == null) {
                    c2161k = (C2161k) C2161k.INSTANCES.get(secondaryName(str));
                    if (c2161k == null) {
                        c2161k = new C2161k(str, null);
                    }
                    C2161k.INSTANCES.put(str, c2161k);
                }
            } catch (Throwable th) {
                throw th;
            }
            return c2161k;
        }

        public final Comparator<String> getORDER_BY_NAME$okhttp() {
            return C2161k.ORDER_BY_NAME;
        }

        private b() {
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        ORDER_BY_NAME = new a();
        INSTANCES = new LinkedHashMap();
        TLS_RSA_WITH_NULL_MD5 = bVar.init("SSL_RSA_WITH_NULL_MD5", 1);
        TLS_RSA_WITH_NULL_SHA = bVar.init("SSL_RSA_WITH_NULL_SHA", 2);
        TLS_RSA_EXPORT_WITH_RC4_40_MD5 = bVar.init("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        TLS_RSA_WITH_RC4_128_MD5 = bVar.init("SSL_RSA_WITH_RC4_128_MD5", 4);
        TLS_RSA_WITH_RC4_128_SHA = bVar.init("SSL_RSA_WITH_RC4_128_SHA", 5);
        TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = bVar.init("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        TLS_RSA_WITH_DES_CBC_SHA = bVar.init("SSL_RSA_WITH_DES_CBC_SHA", 9);
        TLS_RSA_WITH_3DES_EDE_CBC_SHA = bVar.init("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = bVar.init("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        TLS_DHE_DSS_WITH_DES_CBC_SHA = bVar.init("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = bVar.init("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = bVar.init("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        TLS_DHE_RSA_WITH_DES_CBC_SHA = bVar.init("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = bVar.init("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = bVar.init("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        TLS_DH_anon_WITH_RC4_128_MD5 = bVar.init("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = bVar.init("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        TLS_DH_anon_WITH_DES_CBC_SHA = bVar.init("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = bVar.init("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        TLS_KRB5_WITH_DES_CBC_SHA = bVar.init("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        TLS_KRB5_WITH_3DES_EDE_CBC_SHA = bVar.init("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        TLS_KRB5_WITH_RC4_128_SHA = bVar.init("TLS_KRB5_WITH_RC4_128_SHA", 32);
        TLS_KRB5_WITH_DES_CBC_MD5 = bVar.init("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = bVar.init("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        TLS_KRB5_WITH_RC4_128_MD5 = bVar.init("TLS_KRB5_WITH_RC4_128_MD5", 36);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = bVar.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        TLS_KRB5_EXPORT_WITH_RC4_40_SHA = bVar.init("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = bVar.init("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = bVar.init("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        TLS_RSA_WITH_AES_128_CBC_SHA = bVar.init("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA = bVar.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA = bVar.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        TLS_DH_anon_WITH_AES_128_CBC_SHA = bVar.init("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        TLS_RSA_WITH_AES_256_CBC_SHA = bVar.init("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA = bVar.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA = bVar.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        TLS_DH_anon_WITH_AES_256_CBC_SHA = bVar.init("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        TLS_RSA_WITH_NULL_SHA256 = bVar.init("TLS_RSA_WITH_NULL_SHA256", 59);
        TLS_RSA_WITH_AES_128_CBC_SHA256 = bVar.init("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        TLS_RSA_WITH_AES_256_CBC_SHA256 = bVar.init("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = bVar.init("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = bVar.init("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = bVar.init("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = bVar.init("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = bVar.init("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = bVar.init("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = bVar.init("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        TLS_DH_anon_WITH_AES_128_CBC_SHA256 = bVar.init("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        TLS_DH_anon_WITH_AES_256_CBC_SHA256 = bVar.init("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = bVar.init("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = bVar.init("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = bVar.init("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        TLS_PSK_WITH_RC4_128_SHA = bVar.init("TLS_PSK_WITH_RC4_128_SHA", 138);
        TLS_PSK_WITH_3DES_EDE_CBC_SHA = bVar.init("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        TLS_PSK_WITH_AES_128_CBC_SHA = bVar.init("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        TLS_PSK_WITH_AES_256_CBC_SHA = bVar.init("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        TLS_RSA_WITH_SEED_CBC_SHA = bVar.init("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        TLS_RSA_WITH_AES_128_GCM_SHA256 = bVar.init("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        TLS_RSA_WITH_AES_256_GCM_SHA384 = bVar.init("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = bVar.init("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = bVar.init("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = bVar.init("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = bVar.init("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        TLS_DH_anon_WITH_AES_128_GCM_SHA256 = bVar.init("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        TLS_DH_anon_WITH_AES_256_GCM_SHA384 = bVar.init("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        TLS_EMPTY_RENEGOTIATION_INFO_SCSV = bVar.init("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        TLS_FALLBACK_SCSV = bVar.init("TLS_FALLBACK_SCSV", 22016);
        TLS_ECDH_ECDSA_WITH_NULL_SHA = bVar.init("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        TLS_ECDH_ECDSA_WITH_RC4_128_SHA = bVar.init("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = bVar.init("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = bVar.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = bVar.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        TLS_ECDHE_ECDSA_WITH_NULL_SHA = bVar.init("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = bVar.init("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = bVar.init("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = bVar.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = bVar.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        TLS_ECDH_RSA_WITH_NULL_SHA = bVar.init("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        TLS_ECDH_RSA_WITH_RC4_128_SHA = bVar.init("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = bVar.init("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = bVar.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = bVar.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        TLS_ECDHE_RSA_WITH_NULL_SHA = bVar.init("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        TLS_ECDHE_RSA_WITH_RC4_128_SHA = bVar.init("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = bVar.init("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = bVar.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = bVar.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        TLS_ECDH_anon_WITH_NULL_SHA = bVar.init("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        TLS_ECDH_anon_WITH_RC4_128_SHA = bVar.init("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = bVar.init("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        TLS_ECDH_anon_WITH_AES_128_CBC_SHA = bVar.init("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        TLS_ECDH_anon_WITH_AES_256_CBC_SHA = bVar.init("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = bVar.init("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = bVar.init("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = bVar.init("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = bVar.init("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = bVar.init("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = bVar.init("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = bVar.init("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = bVar.init("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = bVar.init("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = bVar.init("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = bVar.init("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = bVar.init("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = bVar.init("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = bVar.init("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = bVar.init("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = bVar.init("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = bVar.init("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = bVar.init("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = bVar.init("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = bVar.init("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = bVar.init("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = bVar.init("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        TLS_AES_128_GCM_SHA256 = bVar.init("TLS_AES_128_GCM_SHA256", 4865);
        TLS_AES_256_GCM_SHA384 = bVar.init("TLS_AES_256_GCM_SHA384", 4866);
        TLS_CHACHA20_POLY1305_SHA256 = bVar.init("TLS_CHACHA20_POLY1305_SHA256", 4867);
        TLS_AES_128_CCM_SHA256 = bVar.init("TLS_AES_128_CCM_SHA256", 4868);
        TLS_AES_128_CCM_8_SHA256 = bVar.init("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public /* synthetic */ C2161k(String str, AbstractC2977e abstractC2977e) {
        this(str);
    }

    public static final synchronized C2161k forJavaName(String str) {
        return Companion.forJavaName(str);
    }

    /* renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m5237deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }

    public String toString() {
        return this.javaName;
    }

    private C2161k(String str) {
        this.javaName = str;
    }
}
