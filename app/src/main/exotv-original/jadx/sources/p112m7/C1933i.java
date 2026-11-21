package p112m7;

import p002a1.AbstractC0008a1;
import p053f7.InterfaceC1024a;
import p076i7.AbstractC1339x;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2974b;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2987o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C1933i extends AbstractC2974b implements InterfaceC2840a, InterfaceC1024a {

    /* renamed from: p */
    public final boolean f7214p;

    public C1933i(C1934j c1934j) {
        super(c1934j, AbstractC1339x.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f7214p = false;
    }

    /* renamed from: d */
    public final InterfaceC1024a m3777d() {
        if (this.f7214p) {
            return this;
        }
        InterfaceC1024a interfaceC1024a = this.f11100j;
        if (interfaceC1024a != null) {
            return interfaceC1024a;
        }
        AbstractC2987o.f11118a.getClass();
        this.f11100j = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1933i) {
            C1933i c1933i = (C1933i) obj;
            return m5129a().equals(c1933i.m5129a()) && this.f11103m.equals(c1933i.f11103m) && this.f11104n.equals(c1933i.f11104n) && AbstractC2980h.m5132a(this.f11101k, c1933i.f11101k);
        }
        if (obj instanceof C1933i) {
            return obj.equals(m3777d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f11104n.hashCode() + AbstractC0008a1.m9e(this.f11103m, m5129a().hashCode() * 31, 31);
    }

    @Override // p212y6.InterfaceC2840a
    public final Object invoke() {
        return this.f11101k.getClass().getSimpleName();
    }

    public final String toString() {
        InterfaceC1024a interfaceC1024aM3777d = m3777d();
        return interfaceC1024aM3777d != this ? interfaceC1024aM3777d.toString() : AbstractC0008a1.m18n(new StringBuilder("property "), this.f11103m, " (Kotlin reflection is not available)");
    }
}
