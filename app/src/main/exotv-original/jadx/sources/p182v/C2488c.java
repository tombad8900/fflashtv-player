package p182v;

import java.util.ArrayList;
import p174u.C2441c;
import p174u.C2442d;
import p174u.C2443e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v.c */
/* loaded from: classes.dex */
public final class C2488c extends AbstractC2500o {

    /* renamed from: k */
    public final ArrayList f9086k;

    /* renamed from: l */
    public int f9087l;

    public C2488c(C2442d c2442d, int i) {
        C2442d c2442d2;
        super(c2442d);
        ArrayList arrayList = new ArrayList();
        this.f9086k = arrayList;
        this.f9127f = i;
        C2442d c2442d3 = this.f9123b;
        C2442d c2442dM4394m = c2442d3.m4394m(i);
        while (true) {
            c2442d2 = c2442d3;
            c2442d3 = c2442dM4394m;
            if (c2442d3 == null) {
                break;
            } else {
                c2442dM4394m = c2442d3.m4394m(this.f9127f);
            }
        }
        this.f9123b = c2442d2;
        int i4 = this.f9127f;
        arrayList.add(i4 == 0 ? c2442d2.f8852d : i4 == 1 ? c2442d2.f8854e : null);
        C2442d c2442dM4393l = c2442d2.m4393l(this.f9127f);
        while (c2442dM4393l != null) {
            int i8 = this.f9127f;
            arrayList.add(i8 == 0 ? c2442dM4393l.f8852d : i8 == 1 ? c2442dM4393l.f8854e : null);
            c2442dM4393l = c2442dM4393l.m4393l(this.f9127f);
        }
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            AbstractC2500o abstractC2500o = (AbstractC2500o) obj;
            int i10 = this.f9127f;
            if (i10 == 0) {
                abstractC2500o.f9123b.f8848b = this;
            } else if (i10 == 1) {
                abstractC2500o.f9123b.f8850c = this;
            }
        }
        if (this.f9127f == 0 && ((C2443e) this.f9123b.f8839T).f8905v0 && arrayList.size() > 1) {
            this.f9123b = ((AbstractC2500o) arrayList.get(arrayList.size() - 1)).f9123b;
        }
        this.f9087l = this.f9127f == 0 ? this.f9123b.f8863i0 : this.f9123b.f8865j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // p182v.InterfaceC2489d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4462a(InterfaceC2489d interfaceC2489d) {
        int i;
        int i4;
        boolean z7;
        float f8;
        int i8;
        int i9;
        int i10;
        int i11;
        float f9;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z8;
        int i18;
        C2491f c2491f = this.f9129h;
        if (c2491f.f9106j) {
            C2491f c2491f2 = this.f9130i;
            if (c2491f2.f9106j) {
                C2442d c2442d = this.f9123b.f8839T;
                boolean z9 = c2442d instanceof C2443e ? ((C2443e) c2442d).f8905v0 : false;
                int i19 = c2491f2.f9103g - c2491f.f9103g;
                ArrayList arrayList = this.f9086k;
                int size = arrayList.size();
                int i20 = 0;
                while (true) {
                    i = -1;
                    i4 = 8;
                    if (i20 >= size) {
                        i20 = -1;
                        break;
                    } else if (((AbstractC2500o) arrayList.get(i20)).f9123b.f8859g0 != 8) {
                        break;
                    } else {
                        i20++;
                    }
                }
                int i21 = size - 1;
                int i22 = i21;
                while (true) {
                    if (i22 < 0) {
                        break;
                    }
                    if (((AbstractC2500o) arrayList.get(i22)).f9123b.f8859g0 != 8) {
                        i = i22;
                        break;
                    }
                    i22--;
                }
                int i23 = 0;
                while (i23 < 2) {
                    f8 = 0.0f;
                    int i24 = 0;
                    i10 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    while (i24 < size) {
                        AbstractC2500o abstractC2500o = (AbstractC2500o) arrayList.get(i24);
                        C2442d c2442d2 = abstractC2500o.f9123b;
                        boolean z10 = z9;
                        if (c2442d2.f8859g0 == i4) {
                            i17 = i23;
                        } else {
                            i26++;
                            if (i24 > 0 && i24 >= i20) {
                                i10 += abstractC2500o.f9129h.f9102f;
                            }
                            C2492g c2492g = abstractC2500o.f9126e;
                            int i27 = c2492g.f9103g;
                            i17 = i23;
                            boolean z11 = abstractC2500o.f9125d != 3;
                            if (z11) {
                                int i28 = this.f9127f;
                                if (i28 == 0 && !c2442d2.f8852d.f9126e.f9106j) {
                                    return;
                                }
                                if (i28 == 1 && !c2442d2.f8854e.f9126e.f9106j) {
                                    return;
                                } else {
                                    z8 = z11;
                                }
                            } else {
                                z8 = z11;
                                if (abstractC2500o.f9122a == 1 && i17 == 0) {
                                    i18 = c2492g.f9109m;
                                    i25++;
                                } else if (c2492g.f9106j) {
                                    i18 = i27;
                                }
                                z8 = true;
                                if (z8) {
                                    i25++;
                                    float f10 = c2442d2.f8867k0[this.f9127f];
                                    if (f10 >= 0.0f) {
                                        f8 += f10;
                                    }
                                } else {
                                    i10 += i18;
                                }
                                if (i24 >= i21 && i24 < i) {
                                    i10 += -abstractC2500o.f9130i.f9102f;
                                }
                            }
                            i18 = i27;
                            if (z8) {
                            }
                            if (i24 >= i21) {
                            }
                        }
                        i24++;
                        z9 = z10;
                        i23 = i17;
                        i4 = 8;
                    }
                    z7 = z9;
                    int i29 = i23;
                    if (i10 < i19 || i25 == 0) {
                        i8 = i25;
                        i9 = i26;
                        break;
                    } else {
                        i23 = i29 + 1;
                        z9 = z7;
                        i4 = 8;
                    }
                }
                z7 = z9;
                f8 = 0.0f;
                i8 = 0;
                i9 = 0;
                i10 = 0;
                int i30 = c2491f.f9103g;
                if (z7) {
                    i30 = c2491f2.f9103g;
                }
                float f11 = 0.5f;
                if (i10 > i19) {
                    i30 = z7 ? i30 + ((int) (((i10 - i19) / 2.0f) + 0.5f)) : i30 - ((int) (((i10 - i19) / 2.0f) + 0.5f));
                }
                if (i8 > 0) {
                    float f12 = i19 - i10;
                    int i31 = (int) ((f12 / i8) + 0.5f);
                    int i32 = 0;
                    int i33 = 0;
                    while (i32 < size) {
                        float f13 = f11;
                        AbstractC2500o abstractC2500o2 = (AbstractC2500o) arrayList.get(i32);
                        int i34 = i30;
                        C2442d c2442d3 = abstractC2500o2.f9123b;
                        int i35 = i8;
                        C2492g c2492g2 = abstractC2500o2.f9126e;
                        float f14 = f12;
                        int i36 = i31;
                        if (c2442d3.f8859g0 == 8 || abstractC2500o2.f9125d != 3 || c2492g2.f9106j) {
                            i16 = i32;
                        } else {
                            int i37 = f8 > 0.0f ? (int) (((c2442d3.f8867k0[this.f9127f] * f14) / f8) + f13) : i36;
                            if (this.f9127f == 0) {
                                i14 = c2442d3.f8883v;
                                i15 = c2442d3.f8882u;
                            } else {
                                i14 = c2442d3.f8886y;
                                i15 = c2442d3.f8885x;
                            }
                            i16 = i32;
                            int iMax = Math.max(i15, abstractC2500o2.f9122a == 1 ? Math.min(i37, c2492g2.f9109m) : i37);
                            if (i14 > 0) {
                                iMax = Math.min(i14, iMax);
                            }
                            if (iMax != i37) {
                                i33++;
                                i37 = iMax;
                            }
                            c2492g2.mo4479d(i37);
                        }
                        i32 = i16 + 1;
                        i30 = i34;
                        f11 = f13;
                        i8 = i35;
                        f12 = f14;
                        i31 = i36;
                    }
                    i11 = i30;
                    f9 = f11;
                    int i38 = i8;
                    if (i33 > 0) {
                        i8 = i38 - i33;
                        i10 = 0;
                        for (int i39 = 0; i39 < size; i39++) {
                            AbstractC2500o abstractC2500o3 = (AbstractC2500o) arrayList.get(i39);
                            if (abstractC2500o3.f9123b.f8859g0 != 8) {
                                if (i39 > 0 && i39 >= i20) {
                                    i10 += abstractC2500o3.f9129h.f9102f;
                                }
                                i10 += abstractC2500o3.f9126e.f9103g;
                                if (i39 < i21 && i39 < i) {
                                    i10 += -abstractC2500o3.f9130i.f9102f;
                                }
                            }
                        }
                    } else {
                        i8 = i38;
                    }
                    i13 = 2;
                    if (this.f9087l == 2 && i33 == 0) {
                        i12 = 0;
                        this.f9087l = 0;
                    } else {
                        i12 = 0;
                    }
                } else {
                    i11 = i30;
                    f9 = 0.5f;
                    i12 = 0;
                    i13 = 2;
                }
                if (i10 > i19) {
                    this.f9087l = i13;
                }
                if (i9 > 0 && i8 == 0 && i20 == i) {
                    this.f9087l = i13;
                }
                int i40 = this.f9087l;
                if (i40 == 1) {
                    int i41 = i9 > 1 ? (i19 - i10) / (i9 - 1) : i9 == 1 ? (i19 - i10) / 2 : i12;
                    if (i8 > 0) {
                        i41 = i12;
                    }
                    int i42 = i11;
                    for (int i43 = i12; i43 < size; i43++) {
                        AbstractC2500o abstractC2500o4 = (AbstractC2500o) arrayList.get(z7 ? size - (i43 + 1) : i43);
                        C2442d c2442d4 = abstractC2500o4.f9123b;
                        C2491f c2491f3 = abstractC2500o4.f9130i;
                        C2491f c2491f4 = abstractC2500o4.f9129h;
                        if (c2442d4.f8859g0 == 8) {
                            c2491f4.mo4479d(i42);
                            c2491f3.mo4479d(i42);
                        } else {
                            if (i43 > 0) {
                                i42 = z7 ? i42 - i41 : i42 + i41;
                            }
                            if (i43 > 0 && i43 >= i20) {
                                i42 = z7 ? i42 - c2491f4.f9102f : i42 + c2491f4.f9102f;
                            }
                            if (z7) {
                                c2491f3.mo4479d(i42);
                            } else {
                                c2491f4.mo4479d(i42);
                            }
                            C2492g c2492g3 = abstractC2500o4.f9126e;
                            int i44 = c2492g3.f9103g;
                            if (abstractC2500o4.f9125d == 3 && abstractC2500o4.f9122a == 1) {
                                i44 = c2492g3.f9109m;
                            }
                            i42 = z7 ? i42 - i44 : i42 + i44;
                            if (z7) {
                                c2491f4.mo4479d(i42);
                            } else {
                                c2491f3.mo4479d(i42);
                            }
                            abstractC2500o4.f9128g = true;
                            if (i43 < i21 && i43 < i) {
                                i42 = z7 ? i42 - (-c2491f3.f9102f) : i42 + (-c2491f3.f9102f);
                            }
                        }
                    }
                    return;
                }
                if (i40 == 0) {
                    int i45 = (i19 - i10) / (i9 + 1);
                    if (i8 > 0) {
                        i45 = i12;
                    }
                    int i46 = i11;
                    for (int i47 = i12; i47 < size; i47++) {
                        AbstractC2500o abstractC2500o5 = (AbstractC2500o) arrayList.get(z7 ? size - (i47 + 1) : i47);
                        C2442d c2442d5 = abstractC2500o5.f9123b;
                        C2491f c2491f5 = abstractC2500o5.f9130i;
                        C2491f c2491f6 = abstractC2500o5.f9129h;
                        if (c2442d5.f8859g0 == 8) {
                            c2491f6.mo4479d(i46);
                            c2491f5.mo4479d(i46);
                        } else {
                            int i48 = z7 ? i46 - i45 : i46 + i45;
                            if (i47 > 0 && i47 >= i20) {
                                i48 = z7 ? i48 - c2491f6.f9102f : i48 + c2491f6.f9102f;
                            }
                            if (z7) {
                                c2491f5.mo4479d(i48);
                            } else {
                                c2491f6.mo4479d(i48);
                            }
                            C2492g c2492g4 = abstractC2500o5.f9126e;
                            int iMin = c2492g4.f9103g;
                            if (abstractC2500o5.f9125d == 3 && abstractC2500o5.f9122a == 1) {
                                iMin = Math.min(iMin, c2492g4.f9109m);
                            }
                            i46 = z7 ? i48 - iMin : i48 + iMin;
                            if (z7) {
                                c2491f6.mo4479d(i46);
                            } else {
                                c2491f5.mo4479d(i46);
                            }
                            if (i47 < i21 && i47 < i) {
                                i46 = z7 ? i46 - (-c2491f5.f9102f) : i46 + (-c2491f5.f9102f);
                            }
                        }
                    }
                    return;
                }
                if (i40 == 2) {
                    float f15 = this.f9127f == 0 ? this.f9123b.f8853d0 : this.f9123b.f8855e0;
                    if (z7) {
                        f15 = 1.0f - f15;
                    }
                    int i49 = (int) (((i19 - i10) * f15) + f9);
                    if (i49 < 0 || i8 > 0) {
                        i49 = i12;
                    }
                    int i50 = z7 ? i11 - i49 : i11 + i49;
                    for (int i51 = i12; i51 < size; i51++) {
                        AbstractC2500o abstractC2500o6 = (AbstractC2500o) arrayList.get(z7 ? size - (i51 + 1) : i51);
                        C2442d c2442d6 = abstractC2500o6.f9123b;
                        C2491f c2491f7 = abstractC2500o6.f9130i;
                        C2491f c2491f8 = abstractC2500o6.f9129h;
                        if (c2442d6.f8859g0 == 8) {
                            c2491f8.mo4479d(i50);
                            c2491f7.mo4479d(i50);
                        } else {
                            if (i51 > 0 && i51 >= i20) {
                                i50 = z7 ? i50 - c2491f8.f9102f : i50 + c2491f8.f9102f;
                            }
                            if (z7) {
                                c2491f7.mo4479d(i50);
                            } else {
                                c2491f8.mo4479d(i50);
                            }
                            C2492g c2492g5 = abstractC2500o6.f9126e;
                            int i52 = c2492g5.f9103g;
                            if (abstractC2500o6.f9125d == 3 && abstractC2500o6.f9122a == 1) {
                                i52 = c2492g5.f9109m;
                            }
                            i50 = z7 ? i50 - i52 : i50 + i52;
                            if (z7) {
                                c2491f8.mo4479d(i50);
                            } else {
                                c2491f7.mo4479d(i50);
                            }
                            if (i51 < i21 && i51 < i) {
                                i50 = z7 ? i50 - (-c2491f7.f9102f) : i50 + (-c2491f7.f9102f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: d */
    public final void mo4463d() {
        ArrayList arrayList = this.f9086k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC2500o) obj).mo4463d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        C2442d c2442d = ((AbstractC2500o) arrayList.get(0)).f9123b;
        C2442d c2442d2 = ((AbstractC2500o) arrayList.get(size2 - 1)).f9123b;
        int i4 = this.f9127f;
        C2491f c2491f = this.f9130i;
        C2491f c2491f2 = this.f9129h;
        if (i4 == 0) {
            C2441c c2441c = c2442d.f8828I;
            C2441c c2441c2 = c2442d2.f8830K;
            C2491f c2491fM4501i = AbstractC2500o.m4501i(c2441c, 0);
            int iM4359e = c2441c.m4359e();
            C2442d c2442dM4468m = m4468m();
            if (c2442dM4468m != null) {
                iM4359e = c2442dM4468m.f8828I.m4359e();
            }
            if (c2491fM4501i != null) {
                AbstractC2500o.m4499b(c2491f2, c2491fM4501i, iM4359e);
            }
            C2491f c2491fM4501i2 = AbstractC2500o.m4501i(c2441c2, 0);
            int iM4359e2 = c2441c2.m4359e();
            C2442d c2442dM4469n = m4469n();
            if (c2442dM4469n != null) {
                iM4359e2 = c2442dM4469n.f8830K.m4359e();
            }
            if (c2491fM4501i2 != null) {
                AbstractC2500o.m4499b(c2491f, c2491fM4501i2, -iM4359e2);
            }
        } else {
            C2441c c2441c3 = c2442d.f8829J;
            C2441c c2441c4 = c2442d2.f8831L;
            C2491f c2491fM4501i3 = AbstractC2500o.m4501i(c2441c3, 1);
            int iM4359e3 = c2441c3.m4359e();
            C2442d c2442dM4468m2 = m4468m();
            if (c2442dM4468m2 != null) {
                iM4359e3 = c2442dM4468m2.f8829J.m4359e();
            }
            if (c2491fM4501i3 != null) {
                AbstractC2500o.m4499b(c2491f2, c2491fM4501i3, iM4359e3);
            }
            C2491f c2491fM4501i4 = AbstractC2500o.m4501i(c2441c4, 1);
            int iM4359e4 = c2441c4.m4359e();
            C2442d c2442dM4469n2 = m4469n();
            if (c2442dM4469n2 != null) {
                iM4359e4 = c2442dM4469n2.f8831L.m4359e();
            }
            if (c2491fM4501i4 != null) {
                AbstractC2500o.m4499b(c2491f, c2491fM4501i4, -iM4359e4);
            }
        }
        c2491f2.f9097a = this;
        c2491f.f9097a = this;
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: e */
    public final void mo4464e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9086k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC2500o) arrayList.get(i)).mo4464e();
            i++;
        }
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: f */
    public final void mo4465f() {
        this.f9124c = null;
        ArrayList arrayList = this.f9086k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((AbstractC2500o) obj).mo4465f();
        }
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: j */
    public final long mo4466j() {
        ArrayList arrayList = this.f9086k;
        int size = arrayList.size();
        long jMo4466j = 0;
        for (int i = 0; i < size; i++) {
            jMo4466j = r5.f9130i.f9102f + ((AbstractC2500o) arrayList.get(i)).mo4466j() + jMo4466j + r5.f9129h.f9102f;
        }
        return jMo4466j;
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: k */
    public final boolean mo4467k() {
        ArrayList arrayList = this.f9086k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC2500o) arrayList.get(i)).mo4467k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final C2442d m4468m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9086k;
            if (i >= arrayList.size()) {
                return null;
            }
            C2442d c2442d = ((AbstractC2500o) arrayList.get(i)).f9123b;
            if (c2442d.f8859g0 != 8) {
                return c2442d;
            }
            i++;
        }
    }

    /* renamed from: n */
    public final C2442d m4469n() {
        ArrayList arrayList = this.f9086k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2442d c2442d = ((AbstractC2500o) arrayList.get(size)).f9123b;
            if (c2442d.f8859g0 != 8) {
                return c2442d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f9127f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f9086k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((AbstractC2500o) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
