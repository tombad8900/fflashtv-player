package okhttp3.internal.http2;

import p090k2.C1584b;
import p189v7.C2579m;
import p220z6.AbstractC2977e;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: okhttp3.internal.http2.c */
/* loaded from: classes.dex */
public final class C2119c {
    public static final a Companion = new a(null);
    public static final C2579m PSEUDO_PREFIX;
    public static final C2579m RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C2579m TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C2579m TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C2579m TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C2579m TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final C2579m name;
    public final C2579m value;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    /* renamed from: okhttp3.internal.http2.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2977e abstractC2977e) {
            this();
        }

        private a() {
        }
    }

    static {
        C2579m c2579m = C2579m.f9316m;
        PSEUDO_PREFIX = C1584b.m3251p(":");
        RESPONSE_STATUS = C1584b.m3251p(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = C1584b.m3251p(TARGET_METHOD_UTF8);
        TARGET_PATH = C1584b.m3251p(TARGET_PATH_UTF8);
        TARGET_SCHEME = C1584b.m3251p(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = C1584b.m3251p(TARGET_AUTHORITY_UTF8);
    }

    public C2119c(C2579m c2579m, C2579m c2579m2) {
        AbstractC2980h.m5136e("name", c2579m);
        AbstractC2980h.m5136e("value", c2579m2);
        this.name = c2579m;
        this.value = c2579m2;
        this.hpackSize = c2579m2.mo4634d() + c2579m.mo4634d() + 32;
    }

    public static /* synthetic */ C2119c copy$default(C2119c c2119c, C2579m c2579m, C2579m c2579m2, int i, Object obj) {
        if ((i & 1) != 0) {
            c2579m = c2119c.name;
        }
        if ((i & 2) != 0) {
            c2579m2 = c2119c.value;
        }
        return c2119c.copy(c2579m, c2579m2);
    }

    public final C2579m component1() {
        return this.name;
    }

    public final C2579m component2() {
        return this.value;
    }

    public final C2119c copy(C2579m c2579m, C2579m c2579m2) {
        AbstractC2980h.m5136e("name", c2579m);
        AbstractC2980h.m5136e("value", c2579m2);
        return new C2119c(c2579m, c2579m2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2119c)) {
            return false;
        }
        C2119c c2119c = (C2119c) obj;
        return AbstractC2980h.m5132a(this.name, c2119c.name) && AbstractC2980h.m5132a(this.value, c2119c.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.m4675q() + ": " + this.value.m4675q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2119c(String str, String str2) {
        this(C1584b.m3251p(str), C1584b.m3251p(str2));
        AbstractC2980h.m5136e("name", str);
        AbstractC2980h.m5136e("value", str2);
        C2579m c2579m = C2579m.f9316m;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2119c(C2579m c2579m, String str) {
        this(c2579m, C1584b.m3251p(str));
        AbstractC2980h.m5136e("name", c2579m);
        AbstractC2980h.m5136e("value", str);
        C2579m c2579m2 = C2579m.f9316m;
    }
}
