package okhttp3;

import java.io.IOException;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.f0 */
/* loaded from: classes.dex */
public enum EnumC2074f0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final a Companion = new a(null);
    private final String protocol;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.f0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        public final EnumC2074f0 get(String str) throws IOException {
            AbstractC2980h.m5136e("protocol", str);
            EnumC2074f0 enumC2074f0 = EnumC2074f0.HTTP_1_0;
            if (str.equals(enumC2074f0.protocol)) {
                return enumC2074f0;
            }
            EnumC2074f0 enumC2074f02 = EnumC2074f0.HTTP_1_1;
            if (str.equals(enumC2074f02.protocol)) {
                return enumC2074f02;
            }
            EnumC2074f0 enumC2074f03 = EnumC2074f0.H2_PRIOR_KNOWLEDGE;
            if (str.equals(enumC2074f03.protocol)) {
                return enumC2074f03;
            }
            EnumC2074f0 enumC2074f04 = EnumC2074f0.HTTP_2;
            if (str.equals(enumC2074f04.protocol)) {
                return enumC2074f04;
            }
            EnumC2074f0 enumC2074f05 = EnumC2074f0.SPDY_3;
            if (str.equals(enumC2074f05.protocol)) {
                return enumC2074f05;
            }
            EnumC2074f0 enumC2074f06 = EnumC2074f0.QUIC;
            if (str.equals(enumC2074f06.protocol)) {
                return enumC2074f06;
            }
            throw new IOException("Unexpected protocol: ".concat(str));
        }

        private a() {
        }
    }

    EnumC2074f0(String str) {
        this.protocol = str;
    }

    public static final EnumC2074f0 get(String str) {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
