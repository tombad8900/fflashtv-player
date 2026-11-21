package p182v;

import java.util.ArrayList;
import p156s.AbstractC2334g;
import p174u.AbstractC2447i;
import p174u.C2441c;
import p174u.C2442d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v.k */
/* loaded from: classes.dex */
public final class C2496k extends AbstractC2500o {

    /* renamed from: k */
    public static final int[] f9111k = new int[2];

    /* renamed from: m */
    public static void m4491m(int[] iArr, int i, int i4, int i8, int i9, float f8, int i10) {
        int i11 = i4 - i;
        int i12 = i9 - i8;
        if (i10 != -1) {
            if (i10 == 0) {
                iArr[0] = (int) ((i12 * f8) + 0.5f);
                iArr[1] = i12;
                return;
            } else {
                if (i10 != 1) {
                    return;
                }
                iArr[0] = i11;
                iArr[1] = (int) ((i11 * f8) + 0.5f);
                return;
            }
        }
        int i13 = (int) ((i12 * f8) + 0.5f);
        int i14 = (int) ((i11 / f8) + 0.5f);
        if (i13 <= i11) {
            iArr[0] = i13;
            iArr[1] = i12;
        } else if (i14 <= i12) {
            iArr[0] = i11;
            iArr[1] = i14;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // p182v.InterfaceC2489d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4462a(InterfaceC2489d interfaceC2489d) {
        float f8;
        float f9;
        float f10;
        float f11;
        int i;
        if (AbstractC2334g.m4162a(this.f9131j) == 3) {
            C2442d c2442d = this.f9123b;
            m4504l(c2442d.f8828I, c2442d.f8830K, 0);
            return;
        }
        C2492g c2492g = this.f9126e;
        boolean z7 = c2492g.f9106j;
        C2491f c2491f = this.f9129h;
        C2491f c2491f2 = this.f9130i;
        if (z7 || this.f9125d != 3) {
            f8 = 0.5f;
        } else {
            C2442d c2442d2 = this.f9123b;
            int i4 = c2442d2.f8879r;
            if (i4 == 2) {
                f8 = 0.5f;
                C2442d c2442d3 = c2442d2.f8839T;
                if (c2442d3 != null) {
                    if (c2442d3.f8852d.f9126e.f9106j) {
                        c2492g.mo4479d((int) ((r5.f9103g * c2442d2.f8884w) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i8 = c2442d2.f8880s;
                if (i8 == 0 || i8 == 3) {
                    C2498m c2498m = c2442d2.f8854e;
                    C2491f c2491f3 = c2498m.f9129h;
                    C2491f c2491f4 = c2498m.f9130i;
                    boolean z8 = c2442d2.f8828I.f8816f != null;
                    boolean z9 = c2442d2.f8829J.f8816f != null;
                    boolean z10 = c2442d2.f8830K.f8816f != null;
                    boolean z11 = c2442d2.f8831L.f8816f != null;
                    f8 = 0.5f;
                    int i9 = c2442d2.f8843X;
                    if (z8 && z9 && z10 && z11) {
                        float f12 = c2442d2.f8842W;
                        boolean z12 = c2491f3.f9106j;
                        ArrayList arrayList = c2491f3.f9108l;
                        int[] iArr = f9111k;
                        if (z12 && c2491f4.f9106j) {
                            if (c2491f.f9099c && c2491f2.f9099c) {
                                m4491m(iArr, ((C2491f) c2491f.f9108l.get(0)).f9103g + c2491f.f9102f, ((C2491f) c2491f2.f9108l.get(0)).f9103g - c2491f2.f9102f, c2491f3.f9103g + c2491f3.f9102f, c2491f4.f9103g - c2491f4.f9102f, f12, i9);
                                c2492g.mo4479d(iArr[0]);
                                this.f9123b.f8854e.f9126e.mo4479d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c2491f.f9106j && c2491f2.f9106j) {
                            if (!c2491f3.f9099c || !c2491f4.f9099c) {
                                return;
                            }
                            m4491m(iArr, c2491f.f9103g + c2491f.f9102f, c2491f2.f9103g - c2491f2.f9102f, ((C2491f) arrayList.get(0)).f9103g + c2491f3.f9102f, ((C2491f) c2491f4.f9108l.get(0)).f9103g - c2491f4.f9102f, f12, i9);
                            c2492g.mo4479d(iArr[0]);
                            this.f9123b.f8854e.f9126e.mo4479d(iArr[1]);
                        }
                        if (!c2491f.f9099c || !c2491f2.f9099c || !c2491f3.f9099c || !c2491f4.f9099c) {
                            return;
                        }
                        m4491m(iArr, ((C2491f) c2491f.f9108l.get(0)).f9103g + c2491f.f9102f, ((C2491f) c2491f2.f9108l.get(0)).f9103g - c2491f2.f9102f, ((C2491f) arrayList.get(0)).f9103g + c2491f3.f9102f, ((C2491f) c2491f4.f9108l.get(0)).f9103g - c2491f4.f9102f, f12, i9);
                        c2492g.mo4479d(iArr[0]);
                        this.f9123b.f8854e.f9126e.mo4479d(iArr[1]);
                    } else if (z8 && z10) {
                        if (!c2491f.f9099c || !c2491f2.f9099c) {
                            return;
                        }
                        float f13 = c2442d2.f8842W;
                        int i10 = ((C2491f) c2491f.f9108l.get(0)).f9103g + c2491f.f9102f;
                        int i11 = ((C2491f) c2491f2.f9108l.get(0)).f9103g - c2491f2.f9102f;
                        if (i9 == -1 || i9 == 0) {
                            int iM4503g = m4503g(i11 - i10, 0);
                            int i12 = (int) ((iM4503g * f13) + 0.5f);
                            int iM4503g2 = m4503g(i12, 1);
                            if (i12 != iM4503g2) {
                                iM4503g = (int) ((iM4503g2 / f13) + 0.5f);
                            }
                            c2492g.mo4479d(iM4503g);
                            this.f9123b.f8854e.f9126e.mo4479d(iM4503g2);
                        } else if (i9 == 1) {
                            int iM4503g3 = m4503g(i11 - i10, 0);
                            int i13 = (int) ((iM4503g3 / f13) + 0.5f);
                            int iM4503g4 = m4503g(i13, 1);
                            if (i13 != iM4503g4) {
                                iM4503g3 = (int) ((iM4503g4 * f13) + 0.5f);
                            }
                            c2492g.mo4479d(iM4503g3);
                            this.f9123b.f8854e.f9126e.mo4479d(iM4503g4);
                        }
                    } else if (z9 && z11) {
                        if (!c2491f3.f9099c || !c2491f4.f9099c) {
                            return;
                        }
                        float f14 = c2442d2.f8842W;
                        int i14 = ((C2491f) c2491f3.f9108l.get(0)).f9103g + c2491f3.f9102f;
                        int i15 = ((C2491f) c2491f4.f9108l.get(0)).f9103g - c2491f4.f9102f;
                        if (i9 == -1) {
                            int iM4503g5 = m4503g(i15 - i14, 1);
                            int i16 = (int) ((iM4503g5 / f14) + 0.5f);
                            int iM4503g6 = m4503g(i16, 0);
                            if (i16 != iM4503g6) {
                                iM4503g5 = (int) ((iM4503g6 * f14) + 0.5f);
                            }
                            c2492g.mo4479d(iM4503g6);
                            this.f9123b.f8854e.f9126e.mo4479d(iM4503g5);
                        } else if (i9 == 0) {
                            int iM4503g7 = m4503g(i15 - i14, 1);
                            int i17 = (int) ((iM4503g7 * f14) + 0.5f);
                            int iM4503g8 = m4503g(i17, 0);
                            if (i17 != iM4503g8) {
                                iM4503g7 = (int) ((iM4503g8 / f14) + 0.5f);
                            }
                            c2492g.mo4479d(iM4503g8);
                            this.f9123b.f8854e.f9126e.mo4479d(iM4503g7);
                        } else if (i9 == 1) {
                        }
                    }
                } else {
                    int i18 = c2442d2.f8843X;
                    if (i18 == -1) {
                        f9 = c2442d2.f8854e.f9126e.f9103g;
                        f10 = c2442d2.f8842W;
                    } else if (i18 == 0) {
                        f11 = c2442d2.f8854e.f9126e.f9103g / c2442d2.f8842W;
                        i = (int) (f11 + 0.5f);
                        c2492g.mo4479d(i);
                        f8 = 0.5f;
                    } else if (i18 != 1) {
                        i = 0;
                        c2492g.mo4479d(i);
                        f8 = 0.5f;
                    } else {
                        f9 = c2442d2.f8854e.f9126e.f9103g;
                        f10 = c2442d2.f8842W;
                    }
                    f11 = f9 * f10;
                    i = (int) (f11 + 0.5f);
                    c2492g.mo4479d(i);
                    f8 = 0.5f;
                }
            }
        }
        boolean z13 = c2491f.f9099c;
        ArrayList arrayList2 = c2491f.f9108l;
        if (z13) {
            boolean z14 = c2491f2.f9099c;
            ArrayList arrayList3 = c2491f2.f9108l;
            if (z14) {
                if (c2491f.f9106j && c2491f2.f9106j && c2492g.f9106j) {
                    return;
                }
                if (!c2492g.f9106j && this.f9125d == 3) {
                    C2442d c2442d4 = this.f9123b;
                    if (c2442d4.f8879r == 0 && !c2442d4.m4403x()) {
                        C2491f c2491f5 = (C2491f) arrayList2.get(0);
                        C2491f c2491f6 = (C2491f) arrayList3.get(0);
                        int i19 = c2491f5.f9103g + c2491f.f9102f;
                        int i20 = c2491f6.f9103g + c2491f2.f9102f;
                        c2491f.mo4479d(i19);
                        c2491f2.mo4479d(i20);
                        c2492g.mo4479d(i20 - i19);
                        return;
                    }
                }
                if (!c2492g.f9106j && this.f9125d == 3 && this.f9122a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C2491f) arrayList3.get(0)).f9103g + c2491f2.f9102f) - (((C2491f) arrayList2.get(0)).f9103g + c2491f.f9102f), c2492g.f9109m);
                    C2442d c2442d5 = this.f9123b;
                    int i21 = c2442d5.f8883v;
                    int iMax = Math.max(c2442d5.f8882u, iMin);
                    if (i21 > 0) {
                        iMax = Math.min(i21, iMax);
                    }
                    c2492g.mo4479d(iMax);
                }
                if (c2492g.f9106j) {
                    C2491f c2491f7 = (C2491f) arrayList2.get(0);
                    C2491f c2491f8 = (C2491f) arrayList3.get(0);
                    int i22 = c2491f7.f9103g;
                    int i23 = c2491f.f9102f + i22;
                    int i24 = c2491f8.f9103g;
                    int i25 = c2491f2.f9102f + i24;
                    float f15 = this.f9123b.f8853d0;
                    if (c2491f7 == c2491f8) {
                        f15 = f8;
                    } else {
                        i22 = i23;
                        i24 = i25;
                    }
                    c2491f.mo4479d((int) ((((i24 - i22) - c2492g.f9103g) * f15) + i22 + f8));
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
        int i;
        C2442d c2442d3;
        C2442d c2442d4;
        int i4;
        C2442d c2442d5 = this.f9123b;
        boolean z7 = c2442d5.f8846a;
        C2492g c2492g = this.f9126e;
        if (z7) {
            c2492g.mo4479d(c2442d5.m4396q());
        }
        boolean z8 = c2492g.f9106j;
        ArrayList arrayList = c2492g.f9107k;
        ArrayList arrayList2 = c2492g.f9108l;
        C2491f c2491f = this.f9130i;
        C2491f c2491f2 = this.f9129h;
        if (!z8) {
            C2442d c2442d6 = this.f9123b;
            int i8 = c2442d6.f8877p0[0];
            this.f9125d = i8;
            if (i8 != 3) {
                if (i8 == 4 && (c2442d4 = c2442d6.f8839T) != null && ((i4 = c2442d4.f8877p0[0]) == 1 || i4 == 4)) {
                    int iM4396q = (c2442d4.m4396q() - this.f9123b.f8828I.m4359e()) - this.f9123b.f8830K.m4359e();
                    AbstractC2500o.m4499b(c2491f2, c2442d4.f8852d.f9129h, this.f9123b.f8828I.m4359e());
                    AbstractC2500o.m4499b(c2491f, c2442d4.f8852d.f9130i, -this.f9123b.f8830K.m4359e());
                    c2492g.mo4479d(iM4396q);
                    return;
                }
                if (i8 == 1) {
                    c2492g.mo4479d(c2442d6.m4396q());
                }
            }
        } else if (this.f9125d == 4 && (c2442d2 = (c2442d = this.f9123b).f8839T) != null && ((i = c2442d2.f8877p0[0]) == 1 || i == 4)) {
            AbstractC2500o.m4499b(c2491f2, c2442d2.f8852d.f9129h, c2442d.f8828I.m4359e());
            AbstractC2500o.m4499b(c2491f, c2442d2.f8852d.f9130i, -this.f9123b.f8830K.m4359e());
            return;
        }
        if (c2492g.f9106j) {
            C2442d c2442d7 = this.f9123b;
            if (c2442d7.f8846a) {
                C2441c[] c2441cArr = c2442d7.f8836Q;
                C2441c c2441c = c2441cArr[0];
                C2441c c2441c2 = c2441c.f8816f;
                if (c2441c2 != null && c2441cArr[1].f8816f != null) {
                    if (c2442d7.m4403x()) {
                        c2491f2.f9102f = this.f9123b.f8836Q[0].m4359e();
                        c2491f.f9102f = -this.f9123b.f8836Q[1].m4359e();
                        return;
                    }
                    C2491f c2491fM4500h = AbstractC2500o.m4500h(this.f9123b.f8836Q[0]);
                    if (c2491fM4500h != null) {
                        AbstractC2500o.m4499b(c2491f2, c2491fM4500h, this.f9123b.f8836Q[0].m4359e());
                    }
                    C2491f c2491fM4500h2 = AbstractC2500o.m4500h(this.f9123b.f8836Q[1]);
                    if (c2491fM4500h2 != null) {
                        AbstractC2500o.m4499b(c2491f, c2491fM4500h2, -this.f9123b.f8836Q[1].m4359e());
                    }
                    c2491f2.f9098b = true;
                    c2491f.f9098b = true;
                    return;
                }
                if (c2441c2 != null) {
                    C2491f c2491fM4500h3 = AbstractC2500o.m4500h(c2441c);
                    if (c2491fM4500h3 != null) {
                        AbstractC2500o.m4499b(c2491f2, c2491fM4500h3, this.f9123b.f8836Q[0].m4359e());
                        AbstractC2500o.m4499b(c2491f, c2491f2, c2492g.f9103g);
                        return;
                    }
                    return;
                }
                C2441c c2441c3 = c2441cArr[1];
                if (c2441c3.f8816f != null) {
                    C2491f c2491fM4500h4 = AbstractC2500o.m4500h(c2441c3);
                    if (c2491fM4500h4 != null) {
                        AbstractC2500o.m4499b(c2491f, c2491fM4500h4, -this.f9123b.f8836Q[1].m4359e());
                        AbstractC2500o.m4499b(c2491f2, c2491f, -c2492g.f9103g);
                        return;
                    }
                    return;
                }
                if ((c2442d7 instanceof AbstractC2447i) || c2442d7.f8839T == null || c2442d7.mo4390i(7).f8816f != null) {
                    return;
                }
                C2442d c2442d8 = this.f9123b;
                AbstractC2500o.m4499b(c2491f2, c2442d8.f8839T.f8852d.f9129h, c2442d8.m4397r());
                AbstractC2500o.m4499b(c2491f, c2491f2, c2492g.f9103g);
                return;
            }
        }
        if (this.f9125d == 3) {
            C2442d c2442d9 = this.f9123b;
            int i9 = c2442d9.f8879r;
            if (i9 == 2) {
                C2442d c2442d10 = c2442d9.f8839T;
                if (c2442d10 != null) {
                    C2492g c2492g2 = c2442d10.f8854e.f9126e;
                    arrayList2.add(c2492g2);
                    c2492g2.f9107k.add(c2492g);
                    c2492g.f9098b = true;
                    arrayList.add(c2491f2);
                    arrayList.add(c2491f);
                }
            } else if (i9 == 3) {
                if (c2442d9.f8880s == 3) {
                    c2491f2.f9097a = this;
                    c2491f.f9097a = this;
                    C2498m c2498m = c2442d9.f8854e;
                    c2498m.f9129h.f9097a = this;
                    c2498m.f9130i.f9097a = this;
                    c2492g.f9097a = this;
                    if (c2442d9.m4404y()) {
                        arrayList2.add(this.f9123b.f8854e.f9126e);
                        this.f9123b.f8854e.f9126e.f9107k.add(c2492g);
                        C2498m c2498m2 = this.f9123b.f8854e;
                        c2498m2.f9126e.f9097a = this;
                        arrayList2.add(c2498m2.f9129h);
                        arrayList2.add(this.f9123b.f8854e.f9130i);
                        this.f9123b.f8854e.f9129h.f9107k.add(c2492g);
                        this.f9123b.f8854e.f9130i.f9107k.add(c2492g);
                    } else if (this.f9123b.m4403x()) {
                        this.f9123b.f8854e.f9126e.f9108l.add(c2492g);
                        arrayList.add(this.f9123b.f8854e.f9126e);
                    } else {
                        this.f9123b.f8854e.f9126e.f9108l.add(c2492g);
                    }
                } else {
                    C2492g c2492g3 = c2442d9.f8854e.f9126e;
                    arrayList2.add(c2492g3);
                    c2492g3.f9107k.add(c2492g);
                    this.f9123b.f8854e.f9129h.f9107k.add(c2492g);
                    this.f9123b.f8854e.f9130i.f9107k.add(c2492g);
                    c2492g.f9098b = true;
                    arrayList.add(c2491f2);
                    arrayList.add(c2491f);
                    c2491f2.f9108l.add(c2492g);
                    c2491f.f9108l.add(c2492g);
                }
            }
        }
        C2442d c2442d11 = this.f9123b;
        C2441c[] c2441cArr2 = c2442d11.f8836Q;
        C2441c c2441c4 = c2441cArr2[0];
        C2441c c2441c5 = c2441c4.f8816f;
        if (c2441c5 != null && c2441cArr2[1].f8816f != null) {
            if (c2442d11.m4403x()) {
                c2491f2.f9102f = this.f9123b.f8836Q[0].m4359e();
                c2491f.f9102f = -this.f9123b.f8836Q[1].m4359e();
                return;
            }
            C2491f c2491fM4500h5 = AbstractC2500o.m4500h(this.f9123b.f8836Q[0]);
            C2491f c2491fM4500h6 = AbstractC2500o.m4500h(this.f9123b.f8836Q[1]);
            if (c2491fM4500h5 != null) {
                c2491fM4500h5.m4477b(this);
            }
            if (c2491fM4500h6 != null) {
                c2491fM4500h6.m4477b(this);
            }
            this.f9131j = 4;
            return;
        }
        if (c2441c5 != null) {
            C2491f c2491fM4500h7 = AbstractC2500o.m4500h(c2441c4);
            if (c2491fM4500h7 != null) {
                AbstractC2500o.m4499b(c2491f2, c2491fM4500h7, this.f9123b.f8836Q[0].m4359e());
                m4502c(c2491f, c2491f2, 1, c2492g);
                return;
            }
            return;
        }
        C2441c c2441c6 = c2441cArr2[1];
        if (c2441c6.f8816f != null) {
            C2491f c2491fM4500h8 = AbstractC2500o.m4500h(c2441c6);
            if (c2491fM4500h8 != null) {
                AbstractC2500o.m4499b(c2491f, c2491fM4500h8, -this.f9123b.f8836Q[1].m4359e());
                m4502c(c2491f2, c2491f, -1, c2492g);
                return;
            }
            return;
        }
        if ((c2442d11 instanceof AbstractC2447i) || (c2442d3 = c2442d11.f8839T) == null) {
            return;
        }
        AbstractC2500o.m4499b(c2491f2, c2442d3.f8852d.f9129h, c2442d11.m4397r());
        m4502c(c2491f, c2491f2, 1, c2492g);
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: e */
    public final void mo4464e() {
        C2491f c2491f = this.f9129h;
        if (c2491f.f9106j) {
            this.f9123b.f8844Y = c2491f.f9103g;
        }
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: f */
    public final void mo4465f() {
        this.f9124c = null;
        this.f9129h.m4478c();
        this.f9130i.m4478c();
        this.f9126e.m4478c();
        this.f9128g = false;
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: k */
    public final boolean mo4467k() {
        return this.f9125d != 3 || this.f9123b.f8879r == 0;
    }

    /* renamed from: n */
    public final void m4492n() {
        this.f9128g = false;
        C2491f c2491f = this.f9129h;
        c2491f.m4478c();
        c2491f.f9106j = false;
        C2491f c2491f2 = this.f9130i;
        c2491f2.m4478c();
        c2491f2.f9106j = false;
        this.f9126e.f9106j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f9123b.f8861h0;
    }
}
