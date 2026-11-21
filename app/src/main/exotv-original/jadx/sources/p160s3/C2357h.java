package p160s3;

import com.bumptech.glide.AbstractC0715d;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s3.h */
/* loaded from: classes.dex */
public final class C2357h {

    /* renamed from: c */
    public static final C2357h f8269c;

    /* renamed from: a */
    public final AbstractC0715d f8270a;

    /* renamed from: b */
    public final AbstractC0715d f8271b;

    static {
        C2351b c2351b = C2351b.f8261n;
        f8269c = new C2357h(c2351b, c2351b);
    }

    public C2357h(AbstractC0715d abstractC0715d, AbstractC0715d abstractC0715d2) {
        this.f8270a = abstractC0715d;
        this.f8271b = abstractC0715d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2357h)) {
            return false;
        }
        C2357h c2357h = (C2357h) obj;
        return AbstractC2980h.m5132a(this.f8270a, c2357h.f8270a) && AbstractC2980h.m5132a(this.f8271b, c2357h.f8271b);
    }

    public final int hashCode() {
        return this.f8271b.hashCode() + (this.f8270a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f8270a + ", height=" + this.f8271b + ')';
    }
}
