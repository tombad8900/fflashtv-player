package p090k2;

import java.util.List;
import p106m1.AbstractC1873h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k2.n */
/* loaded from: classes.dex */
public abstract class AbstractC1596n extends AbstractC1873h implements InterfaceC1590h {

    /* renamed from: j */
    public InterfaceC1590h f6075j;

    /* renamed from: k */
    public long f6076k;

    @Override // p090k2.InterfaceC1590h
    /* renamed from: c */
    public final int mo281c(long j) {
        InterfaceC1590h interfaceC1590h = this.f6075j;
        interfaceC1590h.getClass();
        return interfaceC1590h.mo281c(j - this.f6076k);
    }

    @Override // p106m1.AbstractC1873h, p106m1.AbstractC1866a
    public final void clear() {
        super.clear();
        this.f6075j = null;
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: f */
    public final long mo284f(int i) {
        InterfaceC1590h interfaceC1590h = this.f6075j;
        interfaceC1590h.getClass();
        return interfaceC1590h.mo284f(i) + this.f6076k;
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: m */
    public final List mo291m(long j) {
        InterfaceC1590h interfaceC1590h = this.f6075j;
        interfaceC1590h.getClass();
        return interfaceC1590h.mo291m(j - this.f6076k);
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: n */
    public final int mo292n() {
        InterfaceC1590h interfaceC1590h = this.f6075j;
        interfaceC1590h.getClass();
        return interfaceC1590h.mo292n();
    }
}
