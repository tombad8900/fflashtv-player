package androidx.lifecycle;

import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public final class C0165w {

    /* renamed from: a */
    public EnumC0148n f947a;

    /* renamed from: b */
    public InterfaceC0160t f948b;

    /* renamed from: a */
    public final void m582a(InterfaceC0164v interfaceC0164v, EnumC0146m enumC0146m) {
        EnumC0148n enumC0148nM563a = enumC0146m.m563a();
        EnumC0148n enumC0148n = this.f947a;
        AbstractC2980h.m5136e("state1", enumC0148n);
        if (enumC0148nM563a.compareTo(enumC0148n) < 0) {
            enumC0148n = enumC0148nM563a;
        }
        this.f947a = enumC0148n;
        this.f948b.mo249c(interfaceC0164v, enumC0146m);
        this.f947a = enumC0148nM563a;
    }
}
