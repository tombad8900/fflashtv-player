package p182v;

import java.util.ArrayList;
import p174u.C2439a;
import p174u.C2442d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v.j */
/* loaded from: classes.dex */
public final class C2495j extends AbstractC2500o {
    @Override // p182v.InterfaceC2489d
    /* renamed from: a */
    public final void mo4462a(InterfaceC2489d interfaceC2489d) {
        C2439a c2439a = (C2439a) this.f9123b;
        int i = c2439a.f8790s0;
        C2491f c2491f = this.f9129h;
        ArrayList arrayList = c2491f.f9108l;
        int size = arrayList.size();
        int i4 = 0;
        int i8 = -1;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            int i10 = ((C2491f) obj).f9103g;
            if (i8 == -1 || i10 < i8) {
                i8 = i10;
            }
            if (i4 < i10) {
                i4 = i10;
            }
        }
        if (i == 0 || i == 2) {
            c2491f.mo4479d(i8 + c2439a.f8792u0);
        } else {
            c2491f.mo4479d(i4 + c2439a.f8792u0);
        }
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: d */
    public final void mo4463d() {
        C2442d c2442d = this.f9123b;
        if (c2442d instanceof C2439a) {
            C2491f c2491f = this.f9129h;
            c2491f.f9098b = true;
            ArrayList arrayList = c2491f.f9108l;
            C2439a c2439a = (C2439a) c2442d;
            int i = c2439a.f8790s0;
            boolean z7 = c2439a.f8791t0;
            int i4 = 0;
            if (i == 0) {
                c2491f.f9101e = 4;
                while (i4 < c2439a.f8971r0) {
                    C2442d c2442d2 = c2439a.f8970q0[i4];
                    if (z7 || c2442d2.f8859g0 != 8) {
                        C2491f c2491f2 = c2442d2.f8852d.f9129h;
                        c2491f2.f9107k.add(c2491f);
                        arrayList.add(c2491f2);
                    }
                    i4++;
                }
                m4490m(this.f9123b.f8852d.f9129h);
                m4490m(this.f9123b.f8852d.f9130i);
                return;
            }
            if (i == 1) {
                c2491f.f9101e = 5;
                while (i4 < c2439a.f8971r0) {
                    C2442d c2442d3 = c2439a.f8970q0[i4];
                    if (z7 || c2442d3.f8859g0 != 8) {
                        C2491f c2491f3 = c2442d3.f8852d.f9130i;
                        c2491f3.f9107k.add(c2491f);
                        arrayList.add(c2491f3);
                    }
                    i4++;
                }
                m4490m(this.f9123b.f8852d.f9129h);
                m4490m(this.f9123b.f8852d.f9130i);
                return;
            }
            if (i == 2) {
                c2491f.f9101e = 6;
                while (i4 < c2439a.f8971r0) {
                    C2442d c2442d4 = c2439a.f8970q0[i4];
                    if (z7 || c2442d4.f8859g0 != 8) {
                        C2491f c2491f4 = c2442d4.f8854e.f9129h;
                        c2491f4.f9107k.add(c2491f);
                        arrayList.add(c2491f4);
                    }
                    i4++;
                }
                m4490m(this.f9123b.f8854e.f9129h);
                m4490m(this.f9123b.f8854e.f9130i);
                return;
            }
            if (i != 3) {
                return;
            }
            c2491f.f9101e = 7;
            while (i4 < c2439a.f8971r0) {
                C2442d c2442d5 = c2439a.f8970q0[i4];
                if (z7 || c2442d5.f8859g0 != 8) {
                    C2491f c2491f5 = c2442d5.f8854e.f9130i;
                    c2491f5.f9107k.add(c2491f);
                    arrayList.add(c2491f5);
                }
                i4++;
            }
            m4490m(this.f9123b.f8854e.f9129h);
            m4490m(this.f9123b.f8854e.f9130i);
        }
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: e */
    public final void mo4464e() {
        C2442d c2442d = this.f9123b;
        if (c2442d instanceof C2439a) {
            int i = ((C2439a) c2442d).f8790s0;
            C2491f c2491f = this.f9129h;
            if (i == 0 || i == 1) {
                c2442d.f8844Y = c2491f.f9103g;
            } else {
                c2442d.f8845Z = c2491f.f9103g;
            }
        }
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: f */
    public final void mo4465f() {
        this.f9124c = null;
        this.f9129h.m4478c();
    }

    @Override // p182v.AbstractC2500o
    /* renamed from: k */
    public final boolean mo4467k() {
        return false;
    }

    /* renamed from: m */
    public final void m4490m(C2491f c2491f) {
        C2491f c2491f2 = this.f9129h;
        c2491f2.f9107k.add(c2491f);
        c2491f.f9108l.add(c2491f2);
    }
}
