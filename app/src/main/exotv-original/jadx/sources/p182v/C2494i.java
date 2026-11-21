package p182v;

import p174u.C2442d;
import p174u.C2446h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v.i */
/* loaded from: classes.dex */
public final class C2494i extends AbstractC2500o {
    @Override // p182v.InterfaceC2489d
    /* renamed from: a */
    public final void mo4462a(InterfaceC2489d interfaceC2489d) {
        C2491f c2491f = this.f9129h;
        if (c2491f.f9099c && !c2491f.f9106j) {
            c2491f.mo4479d((int) ((((C2491f) c2491f.f9108l.get(0)).f9103g * ((C2446h) this.f9123b).f8964q0) + 0.5f));
        }
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: d */
    public final void mo4463d() {
        C2442d c2442d = this.f9123b;
        C2446h c2446h = (C2446h) c2442d;
        int i = c2446h.f8965r0;
        int i4 = c2446h.f8966s0;
        int i8 = c2446h.f8968u0;
        C2491f c2491f = this.f9129h;
        if (i8 == 1) {
            if (i != -1) {
                c2491f.f9108l.add(c2442d.f8839T.f8852d.f9129h);
                this.f9123b.f8839T.f8852d.f9129h.f9107k.add(c2491f);
                c2491f.f9102f = i;
            } else if (i4 != -1) {
                c2491f.f9108l.add(c2442d.f8839T.f8852d.f9130i);
                this.f9123b.f8839T.f8852d.f9130i.f9107k.add(c2491f);
                c2491f.f9102f = -i4;
            } else {
                c2491f.f9098b = true;
                c2491f.f9108l.add(c2442d.f8839T.f8852d.f9130i);
                this.f9123b.f8839T.f8852d.f9130i.f9107k.add(c2491f);
            }
            m4489m(this.f9123b.f8852d.f9129h);
            m4489m(this.f9123b.f8852d.f9130i);
            return;
        }
        if (i != -1) {
            c2491f.f9108l.add(c2442d.f8839T.f8854e.f9129h);
            this.f9123b.f8839T.f8854e.f9129h.f9107k.add(c2491f);
            c2491f.f9102f = i;
        } else if (i4 != -1) {
            c2491f.f9108l.add(c2442d.f8839T.f8854e.f9130i);
            this.f9123b.f8839T.f8854e.f9130i.f9107k.add(c2491f);
            c2491f.f9102f = -i4;
        } else {
            c2491f.f9098b = true;
            c2491f.f9108l.add(c2442d.f8839T.f8854e.f9130i);
            this.f9123b.f8839T.f8854e.f9130i.f9107k.add(c2491f);
        }
        m4489m(this.f9123b.f8854e.f9129h);
        m4489m(this.f9123b.f8854e.f9130i);
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: e */
    public final void mo4464e() {
        C2442d c2442d = this.f9123b;
        int i = ((C2446h) c2442d).f8968u0;
        C2491f c2491f = this.f9129h;
        if (i == 1) {
            c2442d.f8844Y = c2491f.f9103g;
        } else {
            c2442d.f8845Z = c2491f.f9103g;
        }
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: f */
    public final void mo4465f() {
        this.f9129h.m4478c();
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: k */
    public final boolean mo4467k() {
        return false;
    }

    /* renamed from: m */
    public final void m4489m(C2491f c2491f) {
        C2491f c2491f2 = this.f9129h;
        c2491f2.f9107k.add(c2491f);
        c2491f.f9108l.add(c2491f2);
    }
}
