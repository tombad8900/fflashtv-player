package p087k;

import com.bumptech.glide.AbstractC0715d;
import p104m.C1743l2;
import p105m0.InterfaceC1846s0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k.i */
/* loaded from: classes.dex */
public final class C1544i extends AbstractC0715d {

    /* renamed from: n */
    public final /* synthetic */ int f5913n;

    /* renamed from: o */
    public boolean f5914o;

    /* renamed from: p */
    public int f5915p;

    /* renamed from: q */
    public final /* synthetic */ Object f5916q;

    public C1544i(C1545j c1545j) {
        this.f5913n = 0;
        this.f5916q = c1545j;
        this.f5914o = false;
        this.f5915p = 0;
    }

    @Override // com.bumptech.glide.AbstractC0715d, p105m0.InterfaceC1846s0
    /* renamed from: a */
    public void mo1588a() {
        switch (this.f5913n) {
            case 1:
                this.f5914o = true;
                break;
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d, p105m0.InterfaceC1846s0
    /* renamed from: b */
    public final void mo1589b() {
        switch (this.f5913n) {
            case 0:
                if (!this.f5914o) {
                    this.f5914o = true;
                    InterfaceC1846s0 interfaceC1846s0 = ((C1545j) this.f5916q).f5920d;
                    if (interfaceC1846s0 != null) {
                        interfaceC1846s0.mo1589b();
                        break;
                    }
                }
                break;
            default:
                ((C1743l2) this.f5916q).f6626a.setVisibility(0);
                break;
        }
    }

    @Override // p105m0.InterfaceC1846s0
    /* renamed from: c */
    public final void mo2256c() {
        switch (this.f5913n) {
            case 0:
                int i = this.f5915p + 1;
                this.f5915p = i;
                C1545j c1545j = (C1545j) this.f5916q;
                if (i == c1545j.f5917a.size()) {
                    InterfaceC1846s0 interfaceC1846s0 = c1545j.f5920d;
                    if (interfaceC1846s0 != null) {
                        interfaceC1846s0.mo2256c();
                    }
                    this.f5915p = 0;
                    this.f5914o = false;
                    c1545j.f5921e = false;
                    break;
                }
                break;
            default:
                if (!this.f5914o) {
                    ((C1743l2) this.f5916q).f6626a.setVisibility(this.f5915p);
                    break;
                }
                break;
        }
    }

    public C1544i(C1743l2 c1743l2, int i) {
        this.f5913n = 1;
        this.f5916q = c1743l2;
        this.f5915p = i;
        this.f5914o = false;
    }
}
