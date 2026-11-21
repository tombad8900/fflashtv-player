package p182v;

import java.util.ArrayList;
import p156s.AbstractC2334g;
import p174u.AbstractC2447i;
import p174u.C2441c;
import p174u.C2442d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v.m */
/* loaded from: classes.dex */
public final class C2498m extends AbstractC2500o {

    /* renamed from: k */
    public C2491f f9114k;

    /* renamed from: l */
    public C2486a f9115l;

    @Override // p182v.InterfaceC2489d
    /* renamed from: a */
    public final void mo4462a(InterfaceC2489d interfaceC2489d) {
        float f8;
        float f9;
        float f10;
        int i;
        if (AbstractC2334g.m4162a(this.f9131j) == 3) {
            C2442d c2442d = this.f9123b;
            m4504l(c2442d.f8829J, c2442d.f8831L, 1);
            return;
        }
        C2492g c2492g = this.f9126e;
        if (c2492g.f9099c && !c2492g.f9106j && this.f9125d == 3) {
            C2442d c2442d2 = this.f9123b;
            int i4 = c2442d2.f8880s;
            if (i4 == 2) {
                C2442d c2442d3 = c2442d2.f8839T;
                if (c2442d3 != null) {
                    if (c2442d3.f8854e.f9126e.f9106j) {
                        c2492g.mo4479d((int) ((r5.f9103g * c2442d2.f8887z) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                C2492g c2492g2 = c2442d2.f8852d.f9126e;
                if (c2492g2.f9106j) {
                    int i8 = c2442d2.f8843X;
                    if (i8 == -1) {
                        f8 = c2492g2.f9103g;
                        f9 = c2442d2.f8842W;
                    } else if (i8 == 0) {
                        f10 = c2492g2.f9103g * c2442d2.f8842W;
                        i = (int) (f10 + 0.5f);
                        c2492g.mo4479d(i);
                    } else if (i8 != 1) {
                        i = 0;
                        c2492g.mo4479d(i);
                    } else {
                        f8 = c2492g2.f9103g;
                        f9 = c2442d2.f8842W;
                    }
                    f10 = f8 / f9;
                    i = (int) (f10 + 0.5f);
                    c2492g.mo4479d(i);
                }
            }
        }
        C2491f c2491f = this.f9129h;
        boolean z7 = c2491f.f9099c;
        ArrayList arrayList = c2491f.f9108l;
        if (z7) {
            C2491f c2491f2 = this.f9130i;
            boolean z8 = c2491f2.f9099c;
            ArrayList arrayList2 = c2491f2.f9108l;
            if (z8) {
                if (c2491f.f9106j && c2491f2.f9106j && c2492g.f9106j) {
                    return;
                }
                if (!c2492g.f9106j && this.f9125d == 3) {
                    C2442d c2442d4 = this.f9123b;
                    if (c2442d4.f8879r == 0 && !c2442d4.m4404y()) {
                        C2491f c2491f3 = (C2491f) arrayList.get(0);
                        C2491f c2491f4 = (C2491f) arrayList2.get(0);
                        int i9 = c2491f3.f9103g + c2491f.f9102f;
                        int i10 = c2491f4.f9103g + c2491f2.f9102f;
                        c2491f.mo4479d(i9);
                        c2491f2.mo4479d(i10);
                        c2492g.mo4479d(i10 - i9);
                        return;
                    }
                }
                if (!c2492g.f9106j && this.f9125d == 3 && this.f9122a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C2491f c2491f5 = (C2491f) arrayList.get(0);
                    int i11 = (((C2491f) arrayList2.get(0)).f9103g + c2491f2.f9102f) - (c2491f5.f9103g + c2491f.f9102f);
                    int i12 = c2492g.f9109m;
                    if (i11 < i12) {
                        c2492g.mo4479d(i11);
                    } else {
                        c2492g.mo4479d(i12);
                    }
                }
                if (c2492g.f9106j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C2491f c2491f6 = (C2491f) arrayList.get(0);
                    C2491f c2491f7 = (C2491f) arrayList2.get(0);
                    int i13 = c2491f6.f9103g;
                    int i14 = c2491f.f9102f + i13;
                    int i15 = c2491f7.f9103g;
                    int i16 = c2491f2.f9102f + i15;
                    float f11 = this.f9123b.f8855e0;
                    if (c2491f6 == c2491f7) {
                        f11 = 0.5f;
                    } else {
                        i13 = i14;
                        i15 = i16;
                    }
                    c2491f.mo4479d((int) ((((i15 - i13) - c2492g.f9103g) * f11) + i13 + 0.5f));
                    c2491f2.mo4479d(c2491f.f9103g + c2492g.f9103g);
                }
            }
        }
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: d */
    public final void mo4463d() {
        C2442d c2442d;
        C2442d c2442d2;
        C2442d c2442d3;
        C2442d c2442d4;
        C2491f c2491f = this.f9114k;
        C2442d c2442d5 = this.f9123b;
        boolean z7 = c2442d5.f8846a;
        C2492g c2492g = this.f9126e;
        if (z7) {
            c2492g.mo4479d(c2442d5.m4392k());
        }
        boolean z8 = c2492g.f9106j;
        ArrayList arrayList = c2492g.f9107k;
        ArrayList arrayList2 = c2492g.f9108l;
        C2491f c2491f2 = this.f9130i;
        C2491f c2491f3 = this.f9129h;
        if (!z8) {
            C2442d c2442d6 = this.f9123b;
            this.f9125d = c2442d6.f8877p0[1];
            if (c2442d6.f8824E) {
                this.f9115l = new C2486a(this);
            }
            int i = this.f9125d;
            if (i != 3) {
                if (i == 4 && (c2442d4 = this.f9123b.f8839T) != null && c2442d4.f8877p0[1] == 1) {
                    int iM4392k = (c2442d4.m4392k() - this.f9123b.f8829J.m4359e()) - this.f9123b.f8831L.m4359e();
                    AbstractC2500o.m4499b(c2491f3, c2442d4.f8854e.f9129h, this.f9123b.f8829J.m4359e());
                    AbstractC2500o.m4499b(c2491f2, c2442d4.f8854e.f9130i, -this.f9123b.f8831L.m4359e());
                    c2492g.mo4479d(iM4392k);
                    return;
                }
                if (i == 1) {
                    c2492g.mo4479d(this.f9123b.m4392k());
                }
            }
        } else if (this.f9125d == 4 && (c2442d2 = (c2442d = this.f9123b).f8839T) != null && c2442d2.f8877p0[1] == 1) {
            AbstractC2500o.m4499b(c2491f3, c2442d2.f8854e.f9129h, c2442d.f8829J.m4359e());
            AbstractC2500o.m4499b(c2491f2, c2442d2.f8854e.f9130i, -this.f9123b.f8831L.m4359e());
            return;
        }
        boolean z9 = c2492g.f9106j;
        if (z9) {
            C2442d c2442d7 = this.f9123b;
            if (c2442d7.f8846a) {
                C2441c[] c2441cArr = c2442d7.f8836Q;
                C2441c c2441c = c2441cArr[2];
                C2441c c2441c2 = c2441c.f8816f;
                if (c2441c2 != null && c2441cArr[3].f8816f != null) {
                    if (c2442d7.m4404y()) {
                        c2491f3.f9102f = this.f9123b.f8836Q[2].m4359e();
                        c2491f2.f9102f = -this.f9123b.f8836Q[3].m4359e();
                    } else {
                        C2491f c2491fM4500h = AbstractC2500o.m4500h(this.f9123b.f8836Q[2]);
                        if (c2491fM4500h != null) {
                            AbstractC2500o.m4499b(c2491f3, c2491fM4500h, this.f9123b.f8836Q[2].m4359e());
                        }
                        C2491f c2491fM4500h2 = AbstractC2500o.m4500h(this.f9123b.f8836Q[3]);
                        if (c2491fM4500h2 != null) {
                            AbstractC2500o.m4499b(c2491f2, c2491fM4500h2, -this.f9123b.f8836Q[3].m4359e());
                        }
                        c2491f3.f9098b = true;
                        c2491f2.f9098b = true;
                    }
                    C2442d c2442d8 = this.f9123b;
                    if (c2442d8.f8824E) {
                        AbstractC2500o.m4499b(c2491f, c2491f3, c2442d8.f8847a0);
                        return;
                    }
                    return;
                }
                if (c2441c2 != null) {
                    C2491f c2491fM4500h3 = AbstractC2500o.m4500h(c2441c);
                    if (c2491fM4500h3 != null) {
                        AbstractC2500o.m4499b(c2491f3, c2491fM4500h3, this.f9123b.f8836Q[2].m4359e());
                        AbstractC2500o.m4499b(c2491f2, c2491f3, c2492g.f9103g);
                        C2442d c2442d9 = this.f9123b;
                        if (c2442d9.f8824E) {
                            AbstractC2500o.m4499b(c2491f, c2491f3, c2442d9.f8847a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C2441c c2441c3 = c2441cArr[3];
                if (c2441c3.f8816f != null) {
                    C2491f c2491fM4500h4 = AbstractC2500o.m4500h(c2441c3);
                    if (c2491fM4500h4 != null) {
                        AbstractC2500o.m4499b(c2491f2, c2491fM4500h4, -this.f9123b.f8836Q[3].m4359e());
                        AbstractC2500o.m4499b(c2491f3, c2491f2, -c2492g.f9103g);
                    }
                    C2442d c2442d10 = this.f9123b;
                    if (c2442d10.f8824E) {
                        AbstractC2500o.m4499b(c2491f, c2491f3, c2442d10.f8847a0);
                        return;
                    }
                    return;
                }
                C2441c c2441c4 = c2441cArr[4];
                if (c2441c4.f8816f != null) {
                    C2491f c2491fM4500h5 = AbstractC2500o.m4500h(c2441c4);
                    if (c2491fM4500h5 != null) {
                        AbstractC2500o.m4499b(c2491f, c2491fM4500h5, 0);
                        AbstractC2500o.m4499b(c2491f3, c2491f, -this.f9123b.f8847a0);
                        AbstractC2500o.m4499b(c2491f2, c2491f3, c2492g.f9103g);
                        return;
                    }
                    return;
                }
                if ((c2442d7 instanceof AbstractC2447i) || c2442d7.f8839T == null || c2442d7.mo4390i(7).f8816f != null) {
                    return;
                }
                C2442d c2442d11 = this.f9123b;
                AbstractC2500o.m4499b(c2491f3, c2442d11.f8839T.f8854e.f9129h, c2442d11.m4398s());
                AbstractC2500o.m4499b(c2491f2, c2491f3, c2492g.f9103g);
                C2442d c2442d12 = this.f9123b;
                if (c2442d12.f8824E) {
                    AbstractC2500o.m4499b(c2491f, c2491f3, c2442d12.f8847a0);
                    return;
                }
                return;
            }
        }
        if (z9 || this.f9125d != 3) {
            c2492g.m4477b(this);
        } else {
            C2442d c2442d13 = this.f9123b;
            int i4 = c2442d13.f8880s;
            if (i4 == 2) {
                C2442d c2442d14 = c2442d13.f8839T;
                if (c2442d14 != null) {
                    C2492g c2492g2 = c2442d14.f8854e.f9126e;
                    arrayList2.add(c2492g2);
                    c2492g2.f9107k.add(c2492g);
                    c2492g.f9098b = true;
                    arrayList.add(c2491f3);
                    arrayList.add(c2491f2);
                }
            } else if (i4 == 3 && !c2442d13.m4404y()) {
                C2442d c2442d15 = this.f9123b;
                if (c2442d15.f8879r != 3) {
                    C2492g c2492g3 = c2442d15.f8852d.f9126e;
                    arrayList2.add(c2492g3);
                    c2492g3.f9107k.add(c2492g);
                    c2492g.f9098b = true;
                    arrayList.add(c2491f3);
                    arrayList.add(c2491f2);
                }
            }
        }
        C2442d c2442d16 = this.f9123b;
        C2441c[] c2441cArr2 = c2442d16.f8836Q;
        C2441c c2441c5 = c2441cArr2[2];
        C2441c c2441c6 = c2441c5.f8816f;
        if (c2441c6 != null && c2441cArr2[3].f8816f != null) {
            if (c2442d16.m4404y()) {
                c2491f3.f9102f = this.f9123b.f8836Q[2].m4359e();
                c2491f2.f9102f = -this.f9123b.f8836Q[3].m4359e();
            } else {
                C2491f c2491fM4500h6 = AbstractC2500o.m4500h(this.f9123b.f8836Q[2]);
                C2491f c2491fM4500h7 = AbstractC2500o.m4500h(this.f9123b.f8836Q[3]);
                if (c2491fM4500h6 != null) {
                    c2491fM4500h6.m4477b(this);
                }
                if (c2491fM4500h7 != null) {
                    c2491fM4500h7.m4477b(this);
                }
                this.f9131j = 4;
            }
            if (this.f9123b.f8824E) {
                m4502c(c2491f, c2491f3, 1, this.f9115l);
            }
        } else if (c2441c6 != null) {
            C2491f c2491fM4500h8 = AbstractC2500o.m4500h(c2441c5);
            if (c2491fM4500h8 != null) {
                AbstractC2500o.m4499b(c2491f3, c2491fM4500h8, this.f9123b.f8836Q[2].m4359e());
                m4502c(c2491f2, c2491f3, 1, c2492g);
                if (this.f9123b.f8824E) {
                    m4502c(c2491f, c2491f3, 1, this.f9115l);
                }
                if (this.f9125d == 3) {
                    C2442d c2442d17 = this.f9123b;
                    if (c2442d17.f8842W > 0.0f) {
                        C2496k c2496k = c2442d17.f8852d;
                        if (c2496k.f9125d == 3) {
                            c2496k.f9126e.f9107k.add(c2492g);
                            arrayList2.add(this.f9123b.f8852d.f9126e);
                            c2492g.f9097a = this;
                        }
                    }
                }
            }
        } else {
            C2441c c2441c7 = c2441cArr2[3];
            if (c2441c7.f8816f != null) {
                C2491f c2491fM4500h9 = AbstractC2500o.m4500h(c2441c7);
                if (c2491fM4500h9 != null) {
                    AbstractC2500o.m4499b(c2491f2, c2491fM4500h9, -this.f9123b.f8836Q[3].m4359e());
                    m4502c(c2491f3, c2491f2, -1, c2492g);
                    if (this.f9123b.f8824E) {
                        m4502c(c2491f, c2491f3, 1, this.f9115l);
                    }
                }
            } else {
                C2441c c2441c8 = c2441cArr2[4];
                if (c2441c8.f8816f != null) {
                    C2491f c2491fM4500h10 = AbstractC2500o.m4500h(c2441c8);
                    if (c2491fM4500h10 != null) {
                        AbstractC2500o.m4499b(c2491f, c2491fM4500h10, 0);
                        m4502c(c2491f3, c2491f, -1, this.f9115l);
                        m4502c(c2491f2, c2491f3, 1, c2492g);
                    }
                } else if (!(c2442d16 instanceof AbstractC2447i) && (c2442d3 = c2442d16.f8839T) != null) {
                    AbstractC2500o.m4499b(c2491f3, c2442d3.f8854e.f9129h, c2442d16.m4398s());
                    m4502c(c2491f2, c2491f3, 1, c2492g);
                    if (this.f9123b.f8824E) {
                        m4502c(c2491f, c2491f3, 1, this.f9115l);
                    }
                    if (this.f9125d == 3) {
                        C2442d c2442d18 = this.f9123b;
                        if (c2442d18.f8842W > 0.0f) {
                            C2496k c2496k2 = c2442d18.f8852d;
                            if (c2496k2.f9125d == 3) {
                                c2496k2.f9126e.f9107k.add(c2492g);
                                arrayList2.add(this.f9123b.f8852d.f9126e);
                                c2492g.f9097a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c2492g.f9099c = true;
        }
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: e */
    public final void mo4464e() {
        C2491f c2491f = this.f9129h;
        if (c2491f.f9106j) {
            this.f9123b.f8845Z = c2491f.f9103g;
        }
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: f */
    public final void mo4465f() {
        this.f9124c = null;
        this.f9129h.m4478c();
        this.f9130i.m4478c();
        this.f9114k.m4478c();
        this.f9126e.m4478c();
        this.f9128g = false;
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: k */
    public final boolean mo4467k() {
        return this.f9125d != 3 || this.f9123b.f8880s == 0;
    }

    /* renamed from: m */
    public final void m4495m() {
        this.f9128g = false;
        C2491f c2491f = this.f9129h;
        c2491f.m4478c();
        c2491f.f9106j = false;
        C2491f c2491f2 = this.f9130i;
        c2491f2.m4478c();
        c2491f2.f9106j = false;
        C2491f c2491f3 = this.f9114k;
        c2491f3.m4478c();
        c2491f3.f9106j = false;
        this.f9126e.f9106j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f9123b.f8861h0;
    }
}
