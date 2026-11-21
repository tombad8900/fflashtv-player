package p077j$.time.temporal;

/* renamed from: j$.time.temporal.p */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1450p implements InterfaceC1449o {

    /* renamed from: a */
    public final /* synthetic */ int f5618a;

    /* renamed from: b */
    public final /* synthetic */ int f5619b;

    public /* synthetic */ C1450p(int i, int i4) {
        this.f5618a = i4;
        this.f5619b = i;
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    public final InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        switch (this.f5618a) {
            case 0:
                int iMo2878f = interfaceC1447m.mo2878f(EnumC1435a.DAY_OF_WEEK);
                int i = this.f5619b;
                if (iMo2878f == i) {
                    return interfaceC1447m;
                }
                return interfaceC1447m.mo2880h(iMo2878f - i >= 0 ? 7 - r0 : -r0, EnumC1436b.DAYS);
            default:
                int iMo2878f2 = interfaceC1447m.mo2878f(EnumC1435a.DAY_OF_WEEK);
                int i4 = this.f5619b;
                if (iMo2878f2 == i4) {
                    return interfaceC1447m;
                }
                return interfaceC1447m.mo2874a(i4 - iMo2878f2 >= 0 ? 7 - r1 : -r1, EnumC1436b.DAYS);
        }
    }
}
