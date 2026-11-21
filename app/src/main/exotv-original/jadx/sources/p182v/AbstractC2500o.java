package p182v;

import p156s.AbstractC2334g;
import p174u.C2441c;
import p174u.C2442d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v.o */
/* loaded from: classes.dex */
public abstract class AbstractC2500o implements InterfaceC2489d {

    /* renamed from: a */
    public int f9122a;

    /* renamed from: b */
    public C2442d f9123b;

    /* renamed from: c */
    public C2497l f9124c;

    /* renamed from: d */
    public int f9125d;

    /* renamed from: e */
    public final C2492g f9126e = new C2492g(this);

    /* renamed from: f */
    public int f9127f = 0;

    /* renamed from: g */
    public boolean f9128g = false;

    /* renamed from: h */
    public final C2491f f9129h = new C2491f(this);

    /* renamed from: i */
    public final C2491f f9130i = new C2491f(this);

    /* renamed from: j */
    public int f9131j = 1;

    public AbstractC2500o(C2442d c2442d) {
        this.f9123b = c2442d;
    }

    /* renamed from: b */
    public static void m4499b(C2491f c2491f, C2491f c2491f2, int i) {
        c2491f.f9108l.add(c2491f2);
        c2491f.f9102f = i;
        c2491f2.f9107k.add(c2491f);
    }

    /* renamed from: h */
    public static C2491f m4500h(C2441c c2441c) {
        C2441c c2441c2 = c2441c.f8816f;
        if (c2441c2 == null) {
            return null;
        }
        C2442d c2442d = c2441c2.f8814d;
        int iM4162a = AbstractC2334g.m4162a(c2441c2.f8815e);
        if (iM4162a == 1) {
            return c2442d.f8852d.f9129h;
        }
        if (iM4162a == 2) {
            return c2442d.f8854e.f9129h;
        }
        if (iM4162a == 3) {
            return c2442d.f8852d.f9130i;
        }
        if (iM4162a == 4) {
            return c2442d.f8854e.f9130i;
        }
        if (iM4162a != 5) {
            return null;
        }
        return c2442d.f8854e.f9114k;
    }

    /* renamed from: i */
    public static C2491f m4501i(C2441c c2441c, int i) {
        C2441c c2441c2 = c2441c.f8816f;
        if (c2441c2 == null) {
            return null;
        }
        C2442d c2442d = c2441c2.f8814d;
        AbstractC2500o abstractC2500o = i == 0 ? c2442d.f8852d : c2442d.f8854e;
        int iM4162a = AbstractC2334g.m4162a(c2441c2.f8815e);
        if (iM4162a == 1 || iM4162a == 2) {
            return abstractC2500o.f9129h;
        }
        if (iM4162a == 3 || iM4162a == 4) {
            return abstractC2500o.f9130i;
        }
        return null;
    }

    /* renamed from: c */
    public final void m4502c(C2491f c2491f, C2491f c2491f2, int i, C2492g c2492g) {
        c2491f.f9108l.add(c2491f2);
        c2491f.f9108l.add(this.f9126e);
        c2491f.f9104h = i;
        c2491f.f9105i = c2492g;
        c2491f2.f9107k.add(c2491f);
        c2492g.f9107k.add(c2491f);
    }

    /* renamed from: d */
    public abstract void mo4463d();

    /* renamed from: e */
    public abstract void mo4464e();

    /* renamed from: f */
    public abstract void mo4465f();

    /* renamed from: g */
    public final int m4503g(int i, int i4) {
        if (i4 == 0) {
            C2442d c2442d = this.f9123b;
            int i8 = c2442d.f8883v;
            int iMax = Math.max(c2442d.f8882u, i);
            if (i8 > 0) {
                iMax = Math.min(i8, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C2442d c2442d2 = this.f9123b;
            int i9 = c2442d2.f8886y;
            int iMax2 = Math.max(c2442d2.f8885x, i);
            if (i9 > 0) {
                iMax2 = Math.min(i9, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* renamed from: j */
    public long mo4466j() {
        if (this.f9126e.f9106j) {
            return r0.f9103g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo4467k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4504l(C2441c c2441c, C2441c c2441c2, int i) {
        C2491f c2491fM4500h = m4500h(c2441c);
        C2491f c2491fM4500h2 = m4500h(c2441c2);
        if (c2491fM4500h.f9106j && c2491fM4500h2.f9106j) {
            int iM4359e = c2441c.m4359e() + c2491fM4500h.f9103g;
            int iM4359e2 = c2491fM4500h2.f9103g - c2441c2.m4359e();
            int i4 = iM4359e2 - iM4359e;
            C2492g c2492g = this.f9126e;
            if (!c2492g.f9106j && this.f9125d == 3) {
                int i8 = this.f9122a;
                if (i8 == 0) {
                    c2492g.mo4479d(m4503g(i4, i));
                } else if (i8 == 1) {
                    c2492g.mo4479d(Math.min(m4503g(c2492g.f9109m, i), i4));
                } else if (i8 == 2) {
                    C2442d c2442d = this.f9123b;
                    C2442d c2442d2 = c2442d.f8839T;
                    if (c2442d2 != null) {
                        if ((i == 0 ? c2442d2.f8852d : c2442d2.f8854e).f9126e.f9106j) {
                            c2492g.mo4479d(m4503g((int) ((r6.f9103g * (i == 0 ? c2442d.f8884w : c2442d.f8887z)) + 0.5f), i));
                        }
                    }
                } else if (i8 == 3) {
                    C2442d c2442d3 = this.f9123b;
                    AbstractC2500o abstractC2500o = c2442d3.f8852d;
                    if (abstractC2500o.f9125d == 3 && abstractC2500o.f9122a == 3) {
                        C2498m c2498m = c2442d3.f8854e;
                        if (c2498m.f9125d != 3 || c2498m.f9122a != 3) {
                        }
                    } else {
                        if (i == 0) {
                            abstractC2500o = c2442d3.f8854e;
                        }
                        if (abstractC2500o.f9126e.f9106j) {
                            float f8 = c2442d3.f8842W;
                            c2492g.mo4479d(i == 1 ? (int) ((r6.f9103g / f8) + 0.5f) : (int) ((f8 * r6.f9103g) + 0.5f));
                        }
                    }
                }
            }
            if (c2492g.f9106j) {
                int i9 = c2492g.f9103g;
                C2491f c2491f = this.f9130i;
                C2491f c2491f2 = this.f9129h;
                if (i9 == i4) {
                    c2491f2.mo4479d(iM4359e);
                    c2491f.mo4479d(iM4359e2);
                    return;
                }
                float f9 = i == 0 ? this.f9123b.f8853d0 : this.f9123b.f8855e0;
                if (c2491fM4500h == c2491fM4500h2) {
                    iM4359e = c2491fM4500h.f9103g;
                    iM4359e2 = c2491fM4500h2.f9103g;
                    f9 = 0.5f;
                }
                c2491f2.mo4479d((int) ((((iM4359e2 - iM4359e) - i9) * f9) + iM4359e + 0.5f));
                c2491f.mo4479d(c2491f2.f9103g + c2492g.f9103g);
            }
        }
    }
}
