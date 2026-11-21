package p112m7;

import com.bumptech.glide.AbstractC0715d;
import p076i7.AbstractC1277a;
import p076i7.AbstractC1339x;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2227h;
import p154r6.InterfaceC2321d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.q */
/* loaded from: classes.dex */
public class C1941q extends AbstractC1277a implements InterfaceC2321d {

    /* renamed from: m */
    public final InterfaceC2222c f7229m;

    public C1941q(InterfaceC2222c interfaceC2222c, InterfaceC2227h interfaceC2227h) {
        super(interfaceC2227h, true);
        this.f7229m = interfaceC2222c;
    }

    @Override // p076i7.C1279a1
    /* renamed from: F */
    public final boolean mo2749F() {
        return true;
    }

    @Override // p154r6.InterfaceC2321d
    /* renamed from: a */
    public final InterfaceC2321d mo2800a() {
        InterfaceC2222c interfaceC2222c = this.f7229m;
        if (interfaceC2222c instanceof InterfaceC2321d) {
            return (InterfaceC2321d) interfaceC2222c;
        }
        return null;
    }

    @Override // p076i7.C1279a1
    /* renamed from: k */
    public void mo2763k(Object obj) {
        AbstractC1925a.m3770f(AbstractC1339x.m2851l(obj), AbstractC0715d.m1547P(this.f7229m));
    }

    @Override // p076i7.C1279a1
    /* renamed from: l */
    public void mo2764l(Object obj) {
        this.f7229m.mo2248d(AbstractC1339x.m2851l(obj));
    }
}
