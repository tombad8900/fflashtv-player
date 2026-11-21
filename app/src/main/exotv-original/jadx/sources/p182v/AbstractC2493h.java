package p182v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p174u.AbstractC2447i;
import p174u.C2441c;
import p174u.C2442d;
import p174u.C2443e;
import p174u.C2446h;
import p199x.C2719f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v.h */
/* loaded from: classes.dex */
public abstract class AbstractC2493h {

    /* renamed from: a */
    public static final C2487b f9110a = new C2487b();

    /* renamed from: a */
    public static boolean m4480a(C2442d c2442d) {
        int[] iArr = c2442d.f8877p0;
        int i = iArr[0];
        int i4 = iArr[1];
        C2442d c2442d2 = c2442d.f8839T;
        C2443e c2443e = c2442d2 != null ? (C2443e) c2442d2 : null;
        if (c2443e != null) {
            int i8 = c2443e.f8877p0[0];
        }
        if (c2443e != null) {
            int i9 = c2443e.f8877p0[1];
        }
        boolean z7 = i == 1 || c2442d.mo4349A() || i == 2 || (i == 3 && c2442d.f8879r == 0 && c2442d.f8842W == 0.0f && c2442d.m4399t(0)) || (i == 3 && c2442d.f8879r == 1 && c2442d.m4400u(0, c2442d.m4396q()));
        boolean z8 = i4 == 1 || c2442d.mo4350B() || i4 == 2 || (i4 == 3 && c2442d.f8880s == 0 && c2442d.f8842W == 0.0f && c2442d.m4399t(1)) || (i4 == 3 && c2442d.f8880s == 1 && c2442d.m4400u(1, c2442d.m4392k()));
        return (c2442d.f8842W > 0.0f && (z7 || z8)) || (z7 && z8);
    }

    /* renamed from: b */
    public static C2499n m4481b(C2442d c2442d, int i, ArrayList arrayList, C2499n c2499n) {
        int i4;
        int i8 = i == 0 ? c2442d.f8873n0 : c2442d.f8875o0;
        if (i8 != -1 && (c2499n == null || i8 != c2499n.f9118b)) {
            int i9 = 0;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                C2499n c2499n2 = (C2499n) arrayList.get(i9);
                if (c2499n2.f9118b == i8) {
                    if (c2499n != null) {
                        c2499n.m4498c(i, c2499n2);
                        arrayList.remove(c2499n);
                    }
                    c2499n = c2499n2;
                } else {
                    i9++;
                }
            }
        } else if (i8 != -1) {
            return c2499n;
        }
        if (c2499n == null) {
            if (c2442d instanceof AbstractC2447i) {
                AbstractC2447i abstractC2447i = (AbstractC2447i) c2442d;
                int i10 = 0;
                while (true) {
                    if (i10 >= abstractC2447i.f8971r0) {
                        i4 = -1;
                        break;
                    }
                    C2442d c2442d2 = abstractC2447i.f8970q0[i10];
                    if ((i == 0 && (i4 = c2442d2.f8873n0) != -1) || (i == 1 && (i4 = c2442d2.f8875o0) != -1)) {
                        break;
                    }
                    i10++;
                }
                if (i4 != -1) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        C2499n c2499n3 = (C2499n) arrayList.get(i11);
                        if (c2499n3.f9118b == i4) {
                            c2499n = c2499n3;
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (c2499n == null) {
                c2499n = new C2499n();
                c2499n.f9117a = new ArrayList();
                c2499n.f9120d = null;
                c2499n.f9121e = -1;
                int i12 = C2499n.f9116f;
                C2499n.f9116f = i12 + 1;
                c2499n.f9118b = i12;
                c2499n.f9119c = i;
            }
            arrayList.add(c2499n);
        }
        int i13 = c2499n.f9118b;
        ArrayList arrayList2 = c2499n.f9117a;
        if (arrayList2.contains(c2442d)) {
            return c2499n;
        }
        arrayList2.add(c2442d);
        if (c2442d instanceof C2446h) {
            C2446h c2446h = (C2446h) c2442d;
            c2446h.f8967t0.m4357c(c2446h.f8968u0 == 0 ? 1 : 0, arrayList, c2499n);
        }
        if (i == 0) {
            c2442d.f8873n0 = i13;
            c2442d.f8828I.m4357c(i, arrayList, c2499n);
            c2442d.f8830K.m4357c(i, arrayList, c2499n);
        } else {
            c2442d.f8875o0 = i13;
            c2442d.f8829J.m4357c(i, arrayList, c2499n);
            c2442d.f8832M.m4357c(i, arrayList, c2499n);
            c2442d.f8831L.m4357c(i, arrayList, c2499n);
        }
        c2442d.f8835P.m4357c(i, arrayList, c2499n);
        return c2499n;
    }

    /* renamed from: c */
    public static void m4482c(int i, C2442d c2442d, C2719f c2719f, boolean z7) {
        C2441c c2441c;
        C2441c c2441c2;
        boolean z8;
        C2441c c2441c3;
        C2441c c2441c4;
        if (c2442d.f8870m) {
            return;
        }
        if (!(c2442d instanceof C2443e) && c2442d.m4405z() && m4480a(c2442d)) {
            C2443e.m4406V(c2442d, c2719f, new C2487b());
        }
        C2441c c2441cMo4390i = c2442d.mo4390i(2);
        C2441c c2441cMo4390i2 = c2442d.mo4390i(4);
        int iM4358d = c2441cMo4390i.m4358d();
        int iM4358d2 = c2441cMo4390i2.m4358d();
        HashSet hashSet = c2441cMo4390i.f8811a;
        if (hashSet != null && c2441cMo4390i.f8813c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C2441c c2441c5 = (C2441c) it.next();
                C2442d c2442d2 = c2441c5.f8814d;
                int i4 = i + 1;
                boolean zM4480a = m4480a(c2442d2);
                C2441c c2441c6 = c2442d2.f8828I;
                C2441c c2441c7 = c2442d2.f8830K;
                if (c2442d2.m4405z() && zM4480a) {
                    z8 = true;
                    C2443e.m4406V(c2442d2, c2719f, new C2487b());
                } else {
                    z8 = true;
                }
                boolean z9 = ((c2441c5 == c2441c6 && (c2441c4 = c2441c7.f8816f) != null && c2441c4.f8813c) || (c2441c5 == c2441c7 && (c2441c3 = c2441c6.f8816f) != null && c2441c3.f8813c)) ? z8 : false;
                int i8 = c2442d2.f8877p0[0];
                if (i8 != 3 || zM4480a) {
                    if (!c2442d2.m4405z()) {
                        if (c2441c5 == c2441c6 && c2441c7.f8816f == null) {
                            int iM4359e = c2441c6.m4359e() + iM4358d;
                            c2442d2.m4376J(iM4359e, c2442d2.m4396q() + iM4359e);
                            m4482c(i4, c2442d2, c2719f, z7);
                        } else if (c2441c5 == c2441c7 && c2441c6.f8816f == null) {
                            int iM4359e2 = iM4358d - c2441c7.m4359e();
                            c2442d2.m4376J(iM4359e2 - c2442d2.m4396q(), iM4359e2);
                            m4482c(i4, c2442d2, c2719f, z7);
                        } else if (z9 && !c2442d2.m4403x()) {
                            m4483d(i4, c2442d2, c2719f, z7);
                        }
                    }
                } else if (i8 == 3 && c2442d2.f8883v >= 0 && c2442d2.f8882u >= 0 && (c2442d2.f8859g0 == 8 || (c2442d2.f8879r == 0 && c2442d2.f8842W == 0.0f))) {
                    if (!c2442d2.m4403x() && !c2442d2.f8825F && z9 && !c2442d2.m4403x()) {
                        m4484e(i4, c2442d, c2719f, c2442d2, z7);
                    }
                }
            }
        }
        if (c2442d instanceof C2446h) {
            return;
        }
        HashSet hashSet2 = c2441cMo4390i2.f8811a;
        if (hashSet2 != null && c2441cMo4390i2.f8813c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C2441c c2441c8 = (C2441c) it2.next();
                C2442d c2442d3 = c2441c8.f8814d;
                int i9 = i + 1;
                boolean zM4480a2 = m4480a(c2442d3);
                C2441c c2441c9 = c2442d3.f8828I;
                C2441c c2441c10 = c2442d3.f8830K;
                if (c2442d3.m4405z() && zM4480a2) {
                    C2443e.m4406V(c2442d3, c2719f, new C2487b());
                }
                boolean z10 = (c2441c8 == c2441c9 && (c2441c2 = c2441c10.f8816f) != null && c2441c2.f8813c) || (c2441c8 == c2441c10 && (c2441c = c2441c9.f8816f) != null && c2441c.f8813c);
                int i10 = c2442d3.f8877p0[0];
                if (i10 != 3 || zM4480a2) {
                    if (!c2442d3.m4405z()) {
                        if (c2441c8 == c2441c9 && c2441c10.f8816f == null) {
                            int iM4359e3 = c2441c9.m4359e() + iM4358d2;
                            c2442d3.m4376J(iM4359e3, c2442d3.m4396q() + iM4359e3);
                            m4482c(i9, c2442d3, c2719f, z7);
                        } else if (c2441c8 == c2441c10 && c2441c9.f8816f == null) {
                            int iM4359e4 = iM4358d2 - c2441c10.m4359e();
                            c2442d3.m4376J(iM4359e4 - c2442d3.m4396q(), iM4359e4);
                            m4482c(i9, c2442d3, c2719f, z7);
                        } else if (z10 && !c2442d3.m4403x()) {
                            m4483d(i9, c2442d3, c2719f, z7);
                        }
                    }
                } else if (i10 == 3 && c2442d3.f8883v >= 0 && c2442d3.f8882u >= 0) {
                    if (c2442d3.f8859g0 == 8 || (c2442d3.f8879r == 0 && c2442d3.f8842W == 0.0f)) {
                        if (!c2442d3.m4403x() && !c2442d3.f8825F && z10 && !c2442d3.m4403x()) {
                            m4484e(i9, c2442d, c2719f, c2442d3, z7);
                        }
                    }
                }
            }
        }
        c2442d.f8870m = true;
    }

    /* renamed from: d */
    public static void m4483d(int i, C2442d c2442d, C2719f c2719f, boolean z7) {
        float f8 = c2442d.f8853d0;
        C2441c c2441c = c2442d.f8828I;
        int iM4358d = c2441c.f8816f.m4358d();
        C2441c c2441c2 = c2442d.f8830K;
        int iM4358d2 = c2441c2.f8816f.m4358d();
        int iM4359e = c2441c.m4359e() + iM4358d;
        int iM4359e2 = iM4358d2 - c2441c2.m4359e();
        if (iM4358d == iM4358d2) {
            f8 = 0.5f;
        } else {
            iM4358d = iM4359e;
            iM4358d2 = iM4359e2;
        }
        int iM4396q = c2442d.m4396q();
        int i4 = (iM4358d2 - iM4358d) - iM4396q;
        if (iM4358d > iM4358d2) {
            i4 = (iM4358d - iM4358d2) - iM4396q;
        }
        int i8 = ((int) (i4 > 0 ? (f8 * i4) + 0.5f : f8 * i4)) + iM4358d;
        int i9 = i8 + iM4396q;
        if (iM4358d > iM4358d2) {
            i9 = i8 - iM4396q;
        }
        c2442d.m4376J(i8, i9);
        m4482c(i + 1, c2442d, c2719f, z7);
    }

    /* renamed from: e */
    public static void m4484e(int i, C2442d c2442d, C2719f c2719f, C2442d c2442d2, boolean z7) {
        float f8 = c2442d2.f8853d0;
        C2441c c2441c = c2442d2.f8828I;
        int iM4359e = c2441c.m4359e() + c2441c.f8816f.m4358d();
        C2441c c2441c2 = c2442d2.f8830K;
        int iM4358d = c2441c2.f8816f.m4358d() - c2441c2.m4359e();
        if (iM4358d >= iM4359e) {
            int iM4396q = c2442d2.m4396q();
            if (c2442d2.f8859g0 != 8) {
                int i4 = c2442d2.f8879r;
                if (i4 == 2) {
                    iM4396q = (int) (c2442d2.f8853d0 * 0.5f * (c2442d instanceof C2443e ? c2442d.m4396q() : c2442d.f8839T.m4396q()));
                } else if (i4 == 0) {
                    iM4396q = iM4358d - iM4359e;
                }
                iM4396q = Math.max(c2442d2.f8882u, iM4396q);
                int i8 = c2442d2.f8883v;
                if (i8 > 0) {
                    iM4396q = Math.min(i8, iM4396q);
                }
            }
            int i9 = iM4359e + ((int) ((f8 * ((iM4358d - iM4359e) - iM4396q)) + 0.5f));
            c2442d2.m4376J(i9, iM4396q + i9);
            m4482c(i + 1, c2442d2, c2719f, z7);
        }
    }

    /* renamed from: f */
    public static void m4485f(int i, C2442d c2442d, C2719f c2719f) {
        float f8 = c2442d.f8855e0;
        C2441c c2441c = c2442d.f8829J;
        int iM4358d = c2441c.f8816f.m4358d();
        C2441c c2441c2 = c2442d.f8831L;
        int iM4358d2 = c2441c2.f8816f.m4358d();
        int iM4359e = c2441c.m4359e() + iM4358d;
        int iM4359e2 = iM4358d2 - c2441c2.m4359e();
        if (iM4358d == iM4358d2) {
            f8 = 0.5f;
        } else {
            iM4358d = iM4359e;
            iM4358d2 = iM4359e2;
        }
        int iM4392k = c2442d.m4392k();
        int i4 = (iM4358d2 - iM4358d) - iM4392k;
        if (iM4358d > iM4358d2) {
            i4 = (iM4358d - iM4358d2) - iM4392k;
        }
        int i8 = (int) (i4 > 0 ? (f8 * i4) + 0.5f : f8 * i4);
        int i9 = iM4358d + i8;
        int i10 = i9 + iM4392k;
        if (iM4358d > iM4358d2) {
            i9 = iM4358d - i8;
            i10 = i9 - iM4392k;
        }
        c2442d.m4377K(i9, i10);
        m4488i(i + 1, c2442d, c2719f);
    }

    /* renamed from: g */
    public static void m4486g(int i, C2442d c2442d, C2719f c2719f, C2442d c2442d2) {
        float f8 = c2442d2.f8855e0;
        C2441c c2441c = c2442d2.f8829J;
        int iM4359e = c2441c.m4359e() + c2441c.f8816f.m4358d();
        C2441c c2441c2 = c2442d2.f8831L;
        int iM4358d = c2441c2.f8816f.m4358d() - c2441c2.m4359e();
        if (iM4358d >= iM4359e) {
            int iM4392k = c2442d2.m4392k();
            if (c2442d2.f8859g0 != 8) {
                int i4 = c2442d2.f8880s;
                if (i4 == 2) {
                    iM4392k = (int) (f8 * 0.5f * (c2442d instanceof C2443e ? c2442d.m4392k() : c2442d.f8839T.m4392k()));
                } else if (i4 == 0) {
                    iM4392k = iM4358d - iM4359e;
                }
                iM4392k = Math.max(c2442d2.f8885x, iM4392k);
                int i8 = c2442d2.f8886y;
                if (i8 > 0) {
                    iM4392k = Math.min(i8, iM4392k);
                }
            }
            int i9 = iM4359e + ((int) ((f8 * ((iM4358d - iM4359e) - iM4392k)) + 0.5f));
            c2442d2.m4377K(i9, iM4392k + i9);
            m4488i(i + 1, c2442d2, c2719f);
        }
    }

    /* renamed from: h */
    public static boolean m4487h(int i, int i4, int i8, int i9) {
        return (i8 == 1 || i8 == 2 || (i8 == 4 && i != 2)) || (i9 == 1 || i9 == 2 || (i9 == 4 && i4 != 2));
    }

    /* renamed from: i */
    public static void m4488i(int i, C2442d c2442d, C2719f c2719f) {
        boolean z7;
        C2441c c2441c;
        C2441c c2441c2;
        C2441c c2441c3;
        C2441c c2441c4;
        if (c2442d.f8872n) {
            return;
        }
        if (!(c2442d instanceof C2443e) && c2442d.m4405z() && m4480a(c2442d)) {
            C2443e.m4406V(c2442d, c2719f, new C2487b());
        }
        C2441c c2441cMo4390i = c2442d.mo4390i(3);
        C2441c c2441cMo4390i2 = c2442d.mo4390i(5);
        int iM4358d = c2441cMo4390i.m4358d();
        int iM4358d2 = c2441cMo4390i2.m4358d();
        HashSet hashSet = c2441cMo4390i.f8811a;
        if (hashSet != null && c2441cMo4390i.f8813c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C2441c c2441c5 = (C2441c) it.next();
                C2442d c2442d2 = c2441c5.f8814d;
                int i4 = i + 1;
                boolean zM4480a = m4480a(c2442d2);
                C2441c c2441c6 = c2442d2.f8829J;
                C2441c c2441c7 = c2442d2.f8831L;
                if (c2442d2.m4405z() && zM4480a) {
                    C2443e.m4406V(c2442d2, c2719f, new C2487b());
                }
                boolean z8 = (c2441c5 == c2441c6 && (c2441c4 = c2441c7.f8816f) != null && c2441c4.f8813c) || (c2441c5 == c2441c7 && (c2441c3 = c2441c6.f8816f) != null && c2441c3.f8813c);
                int i8 = c2442d2.f8877p0[1];
                if (i8 != 3 || zM4480a) {
                    if (!c2442d2.m4405z()) {
                        if (c2441c5 == c2441c6 && c2441c7.f8816f == null) {
                            int iM4359e = c2441c6.m4359e() + iM4358d;
                            c2442d2.m4377K(iM4359e, c2442d2.m4392k() + iM4359e);
                            m4488i(i4, c2442d2, c2719f);
                        } else if (c2441c5 == c2441c7 && c2441c6.f8816f == null) {
                            int iM4359e2 = iM4358d - c2441c7.m4359e();
                            c2442d2.m4377K(iM4359e2 - c2442d2.m4392k(), iM4359e2);
                            m4488i(i4, c2442d2, c2719f);
                        } else if (z8 && !c2442d2.m4404y()) {
                            m4485f(i4, c2442d2, c2719f);
                        }
                    }
                } else if (i8 == 3 && c2442d2.f8886y >= 0 && c2442d2.f8885x >= 0 && (c2442d2.f8859g0 == 8 || (c2442d2.f8880s == 0 && c2442d2.f8842W == 0.0f))) {
                    if (!c2442d2.m4404y() && !c2442d2.f8825F && z8 && !c2442d2.m4404y()) {
                        m4486g(i4, c2442d, c2719f, c2442d2);
                    }
                }
            }
        }
        boolean z9 = true;
        z9 = true;
        z9 = true;
        if (c2442d instanceof C2446h) {
            return;
        }
        HashSet hashSet2 = c2441cMo4390i2.f8811a;
        if (hashSet2 != null && c2441cMo4390i2.f8813c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C2441c c2441c8 = (C2441c) it2.next();
                C2442d c2442d3 = c2441c8.f8814d;
                int i9 = i + 1;
                boolean zM4480a2 = m4480a(c2442d3);
                C2441c c2441c9 = c2442d3.f8829J;
                C2441c c2441c10 = c2442d3.f8831L;
                if (c2442d3.m4405z() && zM4480a2) {
                    C2443e.m4406V(c2442d3, c2719f, new C2487b());
                }
                boolean z10 = (c2441c8 == c2441c9 && (c2441c2 = c2441c10.f8816f) != null && c2441c2.f8813c) || (c2441c8 == c2441c10 && (c2441c = c2441c9.f8816f) != null && c2441c.f8813c);
                int i10 = c2442d3.f8877p0[1];
                if (i10 != 3 || zM4480a2) {
                    if (!c2442d3.m4405z()) {
                        if (c2441c8 == c2441c9 && c2441c10.f8816f == null) {
                            int iM4359e3 = c2441c9.m4359e() + iM4358d2;
                            c2442d3.m4377K(iM4359e3, c2442d3.m4392k() + iM4359e3);
                            m4488i(i9, c2442d3, c2719f);
                        } else if (c2441c8 == c2441c10 && c2441c9.f8816f == null) {
                            int iM4359e4 = iM4358d2 - c2441c10.m4359e();
                            c2442d3.m4377K(iM4359e4 - c2442d3.m4392k(), iM4359e4);
                            m4488i(i9, c2442d3, c2719f);
                        } else if (z10 && !c2442d3.m4404y()) {
                            m4485f(i9, c2442d3, c2719f);
                        }
                    }
                } else if (i10 == 3 && c2442d3.f8886y >= 0 && c2442d3.f8885x >= 0 && (c2442d3.f8859g0 == 8 || (c2442d3.f8880s == 0 && c2442d3.f8842W == 0.0f))) {
                    if (!c2442d3.m4404y() && !c2442d3.f8825F && z10 && !c2442d3.m4404y()) {
                        m4486g(i9, c2442d, c2719f, c2442d3);
                    }
                }
            }
        }
        C2441c c2441cMo4390i3 = c2442d.mo4390i(6);
        if (c2441cMo4390i3.f8811a != null && c2441cMo4390i3.f8813c) {
            int iM4358d3 = c2441cMo4390i3.m4358d();
            Iterator it3 = c2441cMo4390i3.f8811a.iterator();
            while (it3.hasNext()) {
                C2441c c2441c11 = (C2441c) it3.next();
                C2442d c2442d4 = c2441c11.f8814d;
                int i11 = i + 1;
                boolean zM4480a3 = m4480a(c2442d4);
                C2441c c2441c12 = c2442d4.f8832M;
                if (c2442d4.m4405z() && zM4480a3) {
                    C2443e.m4406V(c2442d4, c2719f, new C2487b());
                }
                if (c2442d4.f8877p0[z9 ? 1 : 0] != 3 || zM4480a3) {
                    if (!c2442d4.m4405z()) {
                        if (c2441c11 == c2441c12) {
                            int iM4359e5 = c2441c11.m4359e() + iM4358d3;
                            if (c2442d4.f8824E) {
                                int i12 = iM4359e5 - c2442d4.f8847a0;
                                int i13 = c2442d4.f8841V + i12;
                                c2442d4.f8845Z = i12;
                                c2442d4.f8829J.m4366l(i12);
                                c2442d4.f8831L.m4366l(i13);
                                c2441c12.m4366l(iM4359e5);
                                z7 = z9 ? 1 : 0;
                                c2442d4.f8868l = z7;
                            } else {
                                z7 = z9 ? 1 : 0;
                            }
                            m4488i(i11, c2442d4, c2719f);
                        }
                        z9 = z7;
                    }
                }
                z7 = z9 ? 1 : 0;
                z9 = z7;
            }
        }
        c2442d.f8872n = z9;
    }
}
