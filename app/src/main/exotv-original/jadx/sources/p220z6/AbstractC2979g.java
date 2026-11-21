package p220z6;

import p002a1.AbstractC0008a1;
import p053f7.InterfaceC1024a;
import p102l6.InterfaceC1684a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z6.g */
/* loaded from: classes.dex */
public abstract class AbstractC2979g extends AbstractC2974b implements InterfaceC2978f, InterfaceC1024a, InterfaceC1684a {

    /* renamed from: p */
    public final int f11110p;

    /* renamed from: q */
    public final int f11111q;

    public AbstractC2979g(int i, Class cls, String str, String str2, int i4) {
        this(i, C2973a.f11099j, cls, str, str2, i4, 0);
    }

    /* renamed from: d */
    public final InterfaceC1024a m5131d() {
        AbstractC2987o.f11118a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2979g) {
            AbstractC2979g abstractC2979g = (AbstractC2979g) obj;
            return this.f11103m.equals(abstractC2979g.f11103m) && this.f11104n.equals(abstractC2979g.f11104n) && this.f11111q == abstractC2979g.f11111q && this.f11110p == abstractC2979g.f11110p && AbstractC2980h.m5132a(this.f11101k, abstractC2979g.f11101k) && m5129a().equals(abstractC2979g.m5129a());
        }
        if (!(obj instanceof AbstractC2979g)) {
            return false;
        }
        InterfaceC1024a interfaceC1024a = this.f11100j;
        if (interfaceC1024a == null) {
            m5131d();
            this.f11100j = this;
            interfaceC1024a = this;
        }
        return obj.equals(interfaceC1024a);
    }

    @Override // p220z6.InterfaceC2978f
    public final int getArity() {
        return this.f11110p;
    }

    public final int hashCode() {
        m5129a();
        return this.f11104n.hashCode() + AbstractC0008a1.m9e(this.f11103m, m5129a().hashCode() * 31, 31);
    }

    public final String toString() {
        InterfaceC1024a interfaceC1024a = this.f11100j;
        if (interfaceC1024a == null) {
            m5131d();
            this.f11100j = this;
            interfaceC1024a = this;
        }
        if (interfaceC1024a != this) {
            return interfaceC1024a.toString();
        }
        String str = this.f11103m;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0008a1.m17m("function ", str, " (Kotlin reflection is not available)");
    }

    public AbstractC2979g(int i, Object obj, Class cls, String str, String str2, int i4, int i8) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f11110p = i;
        this.f11111q = 0;
    }
}
