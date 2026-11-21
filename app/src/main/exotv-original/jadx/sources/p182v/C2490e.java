package p182v;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1924s;
import p111m6.C1922q;
import p174u.AbstractC2447i;
import p174u.C2441c;
import p174u.C2442d;
import p174u.C2443e;
import p174u.C2446h;
import p189v7.C2558b0;
import p199x.C2719f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v.e */
/* loaded from: classes.dex */
public final class C2490e {

    /* renamed from: a */
    public final /* synthetic */ int f9088a = 0;

    /* renamed from: b */
    public boolean f9089b;

    /* renamed from: c */
    public boolean f9090c;

    /* renamed from: d */
    public Object f9091d;

    /* renamed from: e */
    public Object f9092e;

    /* renamed from: f */
    public Serializable f9093f;

    /* renamed from: g */
    public Serializable f9094g;

    /* renamed from: h */
    public Object f9095h;

    /* renamed from: i */
    public Object f9096i;

    public /* synthetic */ C2490e() {
    }

    /* renamed from: a */
    public void m4470a(C2491f c2491f, int i, ArrayList arrayList, C2497l c2497l) {
        AbstractC2500o abstractC2500o = c2491f.f9100d;
        C2497l c2497l2 = abstractC2500o.f9124c;
        C2491f c2491f2 = abstractC2500o.f9130i;
        C2491f c2491f3 = abstractC2500o.f9129h;
        if (c2497l2 == null) {
            C2443e c2443e = (C2443e) this.f9091d;
            if (abstractC2500o == c2443e.f8852d || abstractC2500o == c2443e.f8854e) {
                return;
            }
            if (c2497l == null) {
                c2497l = new C2497l();
                c2497l.f9112a = null;
                c2497l.f9113b = new ArrayList();
                c2497l.f9112a = abstractC2500o;
                arrayList.add(c2497l);
            }
            abstractC2500o.f9124c = c2497l;
            c2497l.f9113b.add(abstractC2500o);
            ArrayList arrayList2 = c2491f3.f9107k;
            int size = arrayList2.size();
            int i4 = 0;
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayList2.get(i8);
                i8++;
                InterfaceC2489d interfaceC2489d = (InterfaceC2489d) obj;
                if (interfaceC2489d instanceof C2491f) {
                    m4470a((C2491f) interfaceC2489d, i, arrayList, c2497l);
                }
            }
            ArrayList arrayList3 = c2491f2.f9107k;
            int size2 = arrayList3.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList3.get(i9);
                i9++;
                InterfaceC2489d interfaceC2489d2 = (InterfaceC2489d) obj2;
                if (interfaceC2489d2 instanceof C2491f) {
                    m4470a((C2491f) interfaceC2489d2, i, arrayList, c2497l);
                }
            }
            if (i == 1 && (abstractC2500o instanceof C2498m)) {
                ArrayList arrayList4 = ((C2498m) abstractC2500o).f9114k.f9107k;
                int size3 = arrayList4.size();
                int i10 = 0;
                while (i10 < size3) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    InterfaceC2489d interfaceC2489d3 = (InterfaceC2489d) obj3;
                    if (interfaceC2489d3 instanceof C2491f) {
                        m4470a((C2491f) interfaceC2489d3, i, arrayList, c2497l);
                    }
                }
            }
            ArrayList arrayList5 = c2491f3.f9108l;
            int size4 = arrayList5.size();
            int i11 = 0;
            while (i11 < size4) {
                Object obj4 = arrayList5.get(i11);
                i11++;
                m4470a((C2491f) obj4, i, arrayList, c2497l);
            }
            ArrayList arrayList6 = c2491f2.f9108l;
            int size5 = arrayList6.size();
            int i12 = 0;
            while (i12 < size5) {
                Object obj5 = arrayList6.get(i12);
                i12++;
                m4470a((C2491f) obj5, i, arrayList, c2497l);
            }
            if (i == 1 && (abstractC2500o instanceof C2498m)) {
                ArrayList arrayList7 = ((C2498m) abstractC2500o).f9114k.f9108l;
                int size6 = arrayList7.size();
                while (i4 < size6) {
                    Object obj6 = arrayList7.get(i4);
                    i4++;
                    m4470a((C2491f) obj6, i, arrayList, c2497l);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c9, code lost:
    
        if (r6 == 2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4471b(C2443e c2443e) {
        int i;
        int i4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C2490e c2490e;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        ArrayList arrayList = c2443e.f8900q0;
        int[] iArr = c2443e.f8877p0;
        int size = arrayList.size();
        char c8 = 0;
        int i26 = 0;
        while (i26 < size) {
            Object obj = arrayList.get(i26);
            i26++;
            C2442d c2442d = (C2442d) obj;
            int[] iArr2 = c2442d.f8877p0;
            C2441c[] c2441cArr = c2442d.f8836Q;
            C2441c c2441c = c2442d.f8831L;
            C2441c c2441c2 = c2442d.f8829J;
            C2441c c2441c3 = c2442d.f8830K;
            C2441c c2441c4 = c2442d.f8828I;
            int i27 = iArr2[c8];
            int i28 = iArr2[1];
            char c9 = c8;
            if (c2442d.f8859g0 == 8) {
                c2442d.f8846a = true;
                c8 = c9;
            } else {
                float f8 = c2442d.f8884w;
                if (f8 < 1.0f && i27 == 3) {
                    c2442d.f8879r = 2;
                }
                float f9 = c2442d.f8887z;
                if (f9 < 1.0f && i28 == 3) {
                    c2442d.f8880s = 2;
                }
                if (c2442d.f8842W > 0.0f) {
                    if (i27 == 3) {
                        i25 = 2;
                        if (i28 == 2 || i28 == 1) {
                            i = 3;
                            c2442d.f8879r = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i25 = 2;
                    }
                    if (i28 == i && (i27 == i25 || i27 == 1)) {
                        c2442d.f8880s = i;
                    } else if (i27 == i && i28 == i) {
                        if (c2442d.f8879r == 0) {
                            c2442d.f8879r = i;
                        }
                        if (c2442d.f8880s == 0) {
                            c2442d.f8880s = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i27 == i && c2442d.f8879r == 1 && (c2441c4.f8816f == null || c2441c3.f8816f == null)) {
                    i27 = 2;
                }
                if (i28 == 3 && c2442d.f8880s == 1 && (c2441c2.f8816f == null || c2441c.f8816f == null)) {
                    i28 = 2;
                }
                C2496k c2496k = c2442d.f8852d;
                c2496k.f9125d = i27;
                int i29 = c2442d.f8879r;
                c2496k.f9122a = i29;
                C2498m c2498m = c2442d.f8854e;
                c2498m.f9125d = i28;
                ArrayList arrayList2 = arrayList;
                int i30 = c2442d.f8880s;
                c2498m.f9122a = i30;
                if (i27 != 4 && i27 != 1) {
                    i14 = 2;
                    if (i27 != 2) {
                        if (i27 != 3) {
                            i15 = i14;
                            i16 = i28;
                            i17 = 1;
                        } else if (i28 == i14 || i28 == 1) {
                            if (i29 == 3) {
                                if (i28 == i14) {
                                    m4475f(i14, 0, i14, 0, c2442d);
                                }
                                int iM4392k = c2442d.m4392k();
                                m4475f(1, (int) ((iM4392k * c2442d.f8842W) + 0.5f), 1, iM4392k, c2442d);
                                c2442d.f8852d.f9126e.mo4479d(c2442d.m4396q());
                                c2442d.f8854e.f9126e.mo4479d(c2442d.m4392k());
                                c2442d.f8846a = true;
                            } else {
                                i15 = i14;
                                if (i29 == 1) {
                                    m4475f(i15, 0, i28, 0, c2442d);
                                    c2442d.f8852d.f9126e.f9109m = c2442d.m4396q();
                                } else if (i29 == 2) {
                                    int i31 = iArr[c9];
                                    if (i31 == 1 || i31 == 4) {
                                        m4475f(1, (int) ((f8 * c2443e.m4396q()) + 0.5f), i28, c2442d.m4392k(), c2442d);
                                        c2442d.f8852d.f9126e.mo4479d(c2442d.m4396q());
                                        c2442d.f8854e.f9126e.mo4479d(c2442d.m4392k());
                                        c2442d.f8846a = true;
                                    } else {
                                        i16 = i28;
                                        i17 = 1;
                                    }
                                } else {
                                    i16 = i28;
                                    i17 = 1;
                                    if (c2441cArr[c9].f8816f == null || c2441cArr[1].f8816f == null) {
                                        m4475f(i15, 0, i16, 0, c2442d);
                                        c2442d.f8852d.f9126e.mo4479d(c2442d.m4396q());
                                        c2442d.f8854e.f9126e.mo4479d(c2442d.m4392k());
                                        c2442d.f8846a = true;
                                    }
                                }
                            }
                            c8 = c9;
                            arrayList = arrayList2;
                        } else {
                            i15 = i14;
                            i18 = 3;
                            i16 = i28;
                            i17 = 1;
                            if (i16 != i18) {
                                if (i27 == i15 || i27 == i17) {
                                    if (i30 == i18) {
                                        if (i27 == i15) {
                                            m4475f(i15, 0, i15, 0, c2442d);
                                        }
                                        int iM4396q = c2442d.m4396q();
                                        float f10 = c2442d.f8842W;
                                        if (c2442d.f8843X == -1) {
                                            f10 = 1.0f / f10;
                                        }
                                        m4475f(i17, iM4396q, i17, (int) ((iM4396q * f10) + 0.5f), c2442d);
                                        c2442d.f8852d.f9126e.mo4479d(c2442d.m4396q());
                                        c2442d.f8854e.f9126e.mo4479d(c2442d.m4392k());
                                        c2442d.f8846a = true;
                                    } else if (i30 == 1) {
                                        m4475f(i27, 0, i15, 0, c2442d);
                                        c2442d.f8854e.f9126e.f9109m = c2442d.m4392k();
                                    } else {
                                        int i32 = i15;
                                        int i33 = i27;
                                        if (i30 == 2) {
                                            int i34 = iArr[1];
                                            if (i34 == i17 || i34 == 4) {
                                                m4475f(i33, c2442d.m4396q(), i17, (int) ((f9 * c2443e.m4392k()) + 0.5f), c2442d);
                                                c2442d.f8852d.f9126e.mo4479d(c2442d.m4396q());
                                                c2442d.f8854e.f9126e.mo4479d(c2442d.m4392k());
                                                c2442d.f8846a = true;
                                            } else {
                                                i20 = i33;
                                                i19 = i16;
                                                i21 = i32;
                                                i24 = 3;
                                            }
                                        } else {
                                            i20 = i33;
                                            i22 = i17;
                                            if (c2441cArr[2].f8816f == null || c2441cArr[3].f8816f == null) {
                                                m4475f(i32, 0, i16, 0, c2442d);
                                                c2442d.f8852d.f9126e.mo4479d(c2442d.m4396q());
                                                c2442d.f8854e.f9126e.mo4479d(c2442d.m4392k());
                                                c2442d.f8846a = true;
                                            } else {
                                                i19 = i16;
                                                i21 = i32;
                                            }
                                        }
                                    }
                                    c8 = c9;
                                    arrayList = arrayList2;
                                } else {
                                    i24 = i18;
                                    i19 = i16;
                                    i20 = i27;
                                    i21 = i15;
                                }
                                i22 = i17;
                                i23 = 1;
                                if (i20 == i24 && i19 == i24) {
                                    if (i29 != i23 || i30 == i23) {
                                        m4475f(i21, 0, i21, 0, c2442d);
                                        c2442d.f8852d.f9126e.f9109m = c2442d.m4396q();
                                        c2442d.f8854e.f9126e.f9109m = c2442d.m4392k();
                                    } else if (i30 == 2 && i29 == 2 && iArr[c9] == i22 && iArr[i23] == i22) {
                                        m4475f(i22, (int) ((f8 * c2443e.m4396q()) + 0.5f), i22, (int) ((f9 * c2443e.m4392k()) + 0.5f), c2442d);
                                        c2442d.f8852d.f9126e.mo4479d(c2442d.m4396q());
                                        c2442d.f8854e.f9126e.mo4479d(c2442d.m4392k());
                                        c2442d.f8846a = true;
                                    }
                                }
                                c8 = c9;
                                arrayList = arrayList2;
                            } else {
                                i19 = i16;
                                i20 = i27;
                                i21 = i15;
                                i22 = i17;
                            }
                            i23 = 1;
                            i24 = 3;
                            if (i20 == i24) {
                                if (i29 != i23) {
                                    m4475f(i21, 0, i21, 0, c2442d);
                                    c2442d.f8852d.f9126e.f9109m = c2442d.m4396q();
                                    c2442d.f8854e.f9126e.f9109m = c2442d.m4392k();
                                }
                            }
                            c8 = c9;
                            arrayList = arrayList2;
                        }
                        i18 = 3;
                        if (i16 != i18) {
                        }
                        i23 = 1;
                        i24 = 3;
                        if (i20 == i24) {
                        }
                        c8 = c9;
                        arrayList = arrayList2;
                    }
                } else if (i28 == 4) {
                    i4 = i28;
                    i8 = i27;
                    i9 = 1;
                    int iM4396q2 = c2442d.m4396q();
                    if (i8 == 4) {
                        iM4396q2 = (c2443e.m4396q() - c2441c4.f8817g) - c2441c3.f8817g;
                        i8 = i9;
                    }
                    int iM4392k2 = c2442d.m4392k();
                    if (i4 != 4) {
                        int iM4392k3 = (c2443e.m4392k() - c2441c2.f8817g) - c2441c.f8817g;
                        i10 = i9;
                        c2490e = this;
                        i11 = i8;
                        i12 = iM4396q2;
                        i13 = iM4392k3;
                    } else {
                        i10 = i4;
                        i11 = i8;
                        i12 = iM4396q2;
                        i13 = iM4392k2;
                        c2490e = this;
                    }
                    c2490e.m4475f(i11, i12, i10, i13, c2442d);
                    c2442d.f8852d.f9126e.mo4479d(c2442d.m4396q());
                    c2442d.f8854e.f9126e.mo4479d(c2442d.m4392k());
                    c2442d.f8846a = true;
                    c8 = c9;
                    arrayList = arrayList2;
                } else if (i28 != 1) {
                    i14 = 2;
                } else {
                    i9 = 1;
                    i4 = i28;
                    i8 = i27;
                    int iM4396q22 = c2442d.m4396q();
                    if (i8 == 4) {
                    }
                    int iM4392k22 = c2442d.m4392k();
                    if (i4 != 4) {
                    }
                    c2490e.m4475f(i11, i12, i10, i13, c2442d);
                    c2442d.f8852d.f9126e.mo4479d(c2442d.m4396q());
                    c2442d.f8854e.f9126e.mo4479d(c2442d.m4392k());
                    c2442d.f8846a = true;
                    c8 = c9;
                    arrayList = arrayList2;
                }
            }
        }
    }

    /* renamed from: c */
    public void m4472c() {
        C2443e c2443e = (C2443e) this.f9091d;
        ArrayList arrayList = (ArrayList) this.f9094g;
        ArrayList arrayList2 = (ArrayList) this.f9093f;
        arrayList2.clear();
        C2443e c2443e2 = (C2443e) this.f9092e;
        c2443e2.f8852d.mo4465f();
        c2443e2.f8854e.mo4465f();
        arrayList2.add(c2443e2.f8852d);
        arrayList2.add(c2443e2.f8854e);
        ArrayList arrayList3 = c2443e2.f8900q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            C2442d c2442d = (C2442d) obj;
            if (c2442d instanceof C2446h) {
                C2494i c2494i = new C2494i(c2442d);
                c2442d.f8852d.mo4465f();
                c2442d.f8854e.mo4465f();
                c2494i.f9127f = ((C2446h) c2442d).f8968u0;
                arrayList2.add(c2494i);
            } else {
                if (c2442d.m4403x()) {
                    if (c2442d.f8848b == null) {
                        c2442d.f8848b = new C2488c(c2442d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c2442d.f8848b);
                } else {
                    arrayList2.add(c2442d.f8852d);
                }
                if (c2442d.m4404y()) {
                    if (c2442d.f8850c == null) {
                        c2442d.f8850c = new C2488c(c2442d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c2442d.f8850c);
                } else {
                    arrayList2.add(c2442d.f8854e);
                }
                if (c2442d instanceof AbstractC2447i) {
                    arrayList2.add(new C2495j(c2442d));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            ((AbstractC2500o) obj2).mo4465f();
        }
        int size3 = arrayList2.size();
        int i8 = 0;
        while (i8 < size3) {
            Object obj3 = arrayList2.get(i8);
            i8++;
            AbstractC2500o abstractC2500o = (AbstractC2500o) obj3;
            if (abstractC2500o.f9123b != c2443e2) {
                abstractC2500o.mo4463d();
            }
        }
        arrayList.clear();
        m4474e(c2443e.f8852d, 0, arrayList);
        m4474e(c2443e.f8854e, 1, arrayList);
        this.f9089b = false;
    }

    /* renamed from: d */
    public int m4473d(C2443e c2443e, int i) {
        ArrayList arrayList;
        int i4;
        long jMax;
        float f8;
        C2443e c2443e2 = c2443e;
        ArrayList arrayList2 = (ArrayList) this.f9094g;
        int size = arrayList2.size();
        long j = 0;
        int i8 = 0;
        long jMax2 = 0;
        while (i8 < size) {
            AbstractC2500o abstractC2500o = ((C2497l) arrayList2.get(i8)).f9112a;
            if (!(abstractC2500o instanceof C2488c) ? !(i != 0 ? (abstractC2500o instanceof C2498m) : (abstractC2500o instanceof C2496k)) : ((C2488c) abstractC2500o).f9127f != i) {
                C2491f c2491f = (i == 0 ? c2443e2.f8852d : c2443e2.f8854e).f9129h;
                C2491f c2491f2 = (i == 0 ? c2443e2.f8852d : c2443e2.f8854e).f9130i;
                C2491f c2491f3 = abstractC2500o.f9129h;
                C2491f c2491f4 = abstractC2500o.f9130i;
                boolean zContains = c2491f3.f9108l.contains(c2491f);
                boolean zContains2 = c2491f4.f9108l.contains(c2491f2);
                long jMo4466j = abstractC2500o.mo4466j();
                if (zContains && zContains2) {
                    long jM4494b = C2497l.m4494b(c2491f3, j);
                    long jM4493a = C2497l.m4493a(c2491f4, j);
                    long j8 = jM4494b - jMo4466j;
                    int i9 = c2491f4.f9102f;
                    arrayList = arrayList2;
                    i4 = size;
                    if (j8 >= (-i9)) {
                        j8 += i9;
                    }
                    long j9 = c2491f3.f9102f;
                    long j10 = ((-jM4493a) - jMo4466j) - j9;
                    if (j10 >= j9) {
                        j10 -= j9;
                    }
                    C2442d c2442d = abstractC2500o.f9123b;
                    if (i == 0) {
                        f8 = c2442d.f8853d0;
                    } else if (i == 1) {
                        f8 = c2442d.f8855e0;
                    } else {
                        c2442d.getClass();
                        f8 = -1.0f;
                    }
                    float f9 = f8 > 0.0f ? (long) ((j8 / (1.0f - f8)) + (j10 / f8)) : 0L;
                    jMax = (c2491f3.f9102f + ((((long) ((f9 * f8) + 0.5f)) + jMo4466j) + ((long) (((1.0f - f8) * f9) + 0.5f)))) - c2491f4.f9102f;
                } else {
                    arrayList = arrayList2;
                    i4 = size;
                    jMax = zContains ? Math.max(C2497l.m4494b(c2491f3, c2491f3.f9102f), c2491f3.f9102f + jMo4466j) : zContains2 ? Math.max(-C2497l.m4493a(c2491f4, c2491f4.f9102f), (-c2491f4.f9102f) + jMo4466j) : (abstractC2500o.mo4466j() + c2491f3.f9102f) - c2491f4.f9102f;
                }
            } else {
                arrayList = arrayList2;
                i4 = size;
                jMax = j;
            }
            jMax2 = Math.max(jMax2, jMax);
            i8++;
            c2443e2 = c2443e;
            arrayList2 = arrayList;
            size = i4;
            j = 0;
        }
        return (int) jMax2;
    }

    /* renamed from: e */
    public void m4474e(AbstractC2500o abstractC2500o, int i, ArrayList arrayList) {
        C2491f c2491f = abstractC2500o.f9129h;
        C2491f c2491f2 = abstractC2500o.f9130i;
        ArrayList arrayList2 = c2491f.f9107k;
        int size = arrayList2.size();
        int i4 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList2.get(i8);
            i8++;
            InterfaceC2489d interfaceC2489d = (InterfaceC2489d) obj;
            if (interfaceC2489d instanceof C2491f) {
                m4470a((C2491f) interfaceC2489d, i, arrayList, null);
            } else if (interfaceC2489d instanceof AbstractC2500o) {
                m4470a(((AbstractC2500o) interfaceC2489d).f9129h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = c2491f2.f9107k;
        int size2 = arrayList3.size();
        int i9 = 0;
        while (i9 < size2) {
            Object obj2 = arrayList3.get(i9);
            i9++;
            InterfaceC2489d interfaceC2489d2 = (InterfaceC2489d) obj2;
            if (interfaceC2489d2 instanceof C2491f) {
                m4470a((C2491f) interfaceC2489d2, i, arrayList, null);
            } else if (interfaceC2489d2 instanceof AbstractC2500o) {
                m4470a(((AbstractC2500o) interfaceC2489d2).f9130i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((C2498m) abstractC2500o).f9114k.f9107k;
            int size3 = arrayList4.size();
            while (i4 < size3) {
                Object obj3 = arrayList4.get(i4);
                i4++;
                InterfaceC2489d interfaceC2489d3 = (InterfaceC2489d) obj3;
                if (interfaceC2489d3 instanceof C2491f) {
                    m4470a((C2491f) interfaceC2489d3, i, arrayList, null);
                }
            }
        }
    }

    /* renamed from: f */
    public void m4475f(int i, int i4, int i8, int i9, C2442d c2442d) {
        C2487b c2487b = (C2487b) this.f9096i;
        c2487b.f9076a = i;
        c2487b.f9077b = i8;
        c2487b.f9078c = i4;
        c2487b.f9079d = i9;
        ((C2719f) this.f9095h).m4786b(c2442d, c2487b);
        c2442d.m4381O(c2487b.f9080e);
        c2442d.m4378L(c2487b.f9081f);
        c2442d.f8824E = c2487b.f9083h;
        c2442d.m4375I(c2487b.f9082g);
    }

    /* renamed from: g */
    public void m4476g() {
        C2486a c2486a;
        C2490e c2490e = this;
        ArrayList arrayList = ((C2443e) c2490e.f9091d).f8900q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i4 = i + 1;
            C2442d c2442d = (C2442d) arrayList.get(i);
            if (!c2442d.f8846a) {
                int[] iArr = c2442d.f8877p0;
                int i8 = iArr[0];
                int i9 = iArr[1];
                int i10 = c2442d.f8879r;
                int i11 = c2442d.f8880s;
                boolean z7 = i8 == 2 || (i8 == 3 && i10 == 1);
                boolean z8 = i9 == 2 || (i9 == 3 && i11 == 1);
                C2492g c2492g = c2442d.f8852d.f9126e;
                boolean z9 = c2492g.f9106j;
                C2492g c2492g2 = c2442d.f8854e.f9126e;
                boolean z10 = c2492g2.f9106j;
                boolean z11 = z7;
                if (z9 && z10) {
                    c2490e.m4475f(1, c2492g.f9103g, 1, c2492g2.f9103g, c2442d);
                    c2442d.f8846a = true;
                } else if (z9 && z8) {
                    m4475f(1, c2492g.f9103g, 2, c2492g2.f9103g, c2442d);
                    if (i9 == 3) {
                        c2442d.f8854e.f9126e.f9109m = c2442d.m4392k();
                    } else {
                        c2442d.f8854e.f9126e.mo4479d(c2442d.m4392k());
                        c2442d.f8846a = true;
                    }
                } else if (z10 && z11) {
                    m4475f(2, c2492g.f9103g, 1, c2492g2.f9103g, c2442d);
                    if (i8 == 3) {
                        c2442d.f8852d.f9126e.f9109m = c2442d.m4396q();
                    } else {
                        c2442d.f8852d.f9126e.mo4479d(c2442d.m4396q());
                        c2442d.f8846a = true;
                    }
                }
                if (c2442d.f8846a && (c2486a = c2442d.f8854e.f9115l) != null) {
                    c2486a.mo4479d(c2442d.f8847a0);
                }
                c2490e = this;
            }
            i = i4;
        }
    }

    public String toString() {
        switch (this.f9088a) {
            case 1:
                Map map = (Map) this.f9096i;
                Long l8 = (Long) this.f9095h;
                Long l9 = (Long) this.f9094g;
                Long l10 = (Long) this.f9093f;
                Long l11 = (Long) this.f9092e;
                ArrayList arrayList = new ArrayList();
                if (this.f9089b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f9090c) {
                    arrayList.add("isDirectory");
                }
                if (l11 != null) {
                    arrayList.add("byteCount=" + l11);
                }
                if (l10 != null) {
                    arrayList.add("createdAt=" + l10);
                }
                if (l9 != null) {
                    arrayList.add("lastModifiedAt=" + l9);
                }
                if (l8 != null) {
                    arrayList.add("lastAccessedAt=" + l8);
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return AbstractC1913h.m3740E0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public C2490e(boolean z7, boolean z8, C2558b0 c2558b0, Long l8, Long l9, Long l10, Long l11, Map map) {
        AbstractC2980h.m5136e("extras", map);
        this.f9089b = z7;
        this.f9090c = z8;
        this.f9091d = c2558b0;
        this.f9092e = l8;
        this.f9093f = l9;
        this.f9094g = l10;
        this.f9095h = l11;
        this.f9096i = AbstractC1924s.m3763X(map);
    }

    public /* synthetic */ C2490e(boolean z7, boolean z8, C2558b0 c2558b0, Long l8, Long l9, Long l10, Long l11) {
        this(z7, z8, c2558b0, l8, l9, l10, l11, C1922q.f7188j);
    }
}
