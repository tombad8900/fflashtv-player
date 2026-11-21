package p174u;

import p002a1.AbstractC0008a1;
import p156s.C2329b;
import p156s.C2330c;
import p156s.C2335h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u.a */
/* loaded from: classes.dex */
public final class C2439a extends AbstractC2447i {

    /* renamed from: s0 */
    public int f8790s0;

    /* renamed from: t0 */
    public boolean f8791t0;

    /* renamed from: u0 */
    public int f8792u0;

    /* renamed from: v0 */
    public boolean f8793v0;

    @Override // p174u.C2442d
    /* renamed from: A */
    public final boolean mo4349A() {
        return this.f8793v0;
    }

    @Override // p174u.C2442d
    /* renamed from: B */
    public final boolean mo4350B() {
        return this.f8793v0;
    }

    /* renamed from: T */
    public final boolean m4351T() {
        int i;
        int i4;
        int i8;
        boolean z7 = true;
        int i9 = 0;
        while (true) {
            i = this.f8971r0;
            if (i9 >= i) {
                break;
            }
            C2442d c2442d = this.f8970q0[i9];
            if ((this.f8791t0 || c2442d.mo4354c()) && ((((i4 = this.f8790s0) == 0 || i4 == 1) && !c2442d.mo4349A()) || (((i8 = this.f8790s0) == 2 || i8 == 3) && !c2442d.mo4350B()))) {
                z7 = false;
            }
            i9++;
        }
        if (!z7 || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z8 = false;
        for (int i10 = 0; i10 < this.f8971r0; i10++) {
            C2442d c2442d2 = this.f8970q0[i10];
            if (this.f8791t0 || c2442d2.mo4354c()) {
                if (!z8) {
                    int i11 = this.f8790s0;
                    if (i11 == 0) {
                        iMax = c2442d2.mo4390i(2).m4358d();
                    } else if (i11 == 1) {
                        iMax = c2442d2.mo4390i(4).m4358d();
                    } else if (i11 == 2) {
                        iMax = c2442d2.mo4390i(3).m4358d();
                    } else if (i11 == 3) {
                        iMax = c2442d2.mo4390i(5).m4358d();
                    }
                    z8 = true;
                }
                int i12 = this.f8790s0;
                if (i12 == 0) {
                    iMax = Math.min(iMax, c2442d2.mo4390i(2).m4358d());
                } else if (i12 == 1) {
                    iMax = Math.max(iMax, c2442d2.mo4390i(4).m4358d());
                } else if (i12 == 2) {
                    iMax = Math.min(iMax, c2442d2.mo4390i(3).m4358d());
                } else if (i12 == 3) {
                    iMax = Math.max(iMax, c2442d2.mo4390i(5).m4358d());
                }
            }
        }
        int i13 = iMax + this.f8792u0;
        int i14 = this.f8790s0;
        if (i14 == 0 || i14 == 1) {
            m4376J(i13, i13);
        } else {
            m4377K(i13, i13);
        }
        this.f8793v0 = true;
        return true;
    }

    /* renamed from: U */
    public final int m4352U() {
        int i = this.f8790s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p174u.C2442d
    /* renamed from: b */
    public final void mo4353b(C2330c c2330c, boolean z7) {
        boolean z8;
        int i;
        int i4;
        C2441c[] c2441cArr = this.f8836Q;
        C2441c c2441c = this.f8828I;
        c2441cArr[0] = c2441c;
        int i8 = 2;
        C2441c c2441c2 = this.f8829J;
        c2441cArr[2] = c2441c2;
        C2441c c2441c3 = this.f8830K;
        c2441cArr[1] = c2441c3;
        C2441c c2441c4 = this.f8831L;
        c2441cArr[3] = c2441c4;
        for (C2441c c2441c5 : c2441cArr) {
            c2441c5.f8819i = c2330c.m4136k(c2441c5);
        }
        int i9 = this.f8790s0;
        if (i9 < 0 || i9 >= 4) {
            return;
        }
        C2441c c2441c6 = c2441cArr[i9];
        if (!this.f8793v0) {
            m4351T();
        }
        if (this.f8793v0) {
            this.f8793v0 = false;
            int i10 = this.f8790s0;
            if (i10 == 0 || i10 == 1) {
                c2330c.m4129d(c2441c.f8819i, this.f8844Y);
                c2330c.m4129d(c2441c3.f8819i, this.f8844Y);
                return;
            } else {
                if (i10 == 2 || i10 == 3) {
                    c2330c.m4129d(c2441c2.f8819i, this.f8845Z);
                    c2330c.m4129d(c2441c4.f8819i, this.f8845Z);
                    return;
                }
                return;
            }
        }
        for (int i11 = 0; i11 < this.f8971r0; i11++) {
            C2442d c2442d = this.f8970q0[i11];
            if ((this.f8791t0 || c2442d.mo4354c()) && ((((i4 = this.f8790s0) == 0 || i4 == 1) && c2442d.f8877p0[0] == 3 && c2442d.f8828I.f8816f != null && c2442d.f8830K.f8816f != null) || ((i4 == 2 || i4 == 3) && c2442d.f8877p0[1] == 3 && c2442d.f8829J.f8816f != null && c2442d.f8831L.f8816f != null))) {
                z8 = true;
                break;
            }
        }
        z8 = false;
        boolean z9 = c2441c.m4361g() || c2441c3.m4361g();
        boolean z10 = c2441c2.m4361g() || c2441c4.m4361g();
        int i12 = !(!z8 && (((i = this.f8790s0) == 0 && z9) || ((i == 2 && z10) || ((i == 1 && z9) || (i == 3 && z10))))) ? 4 : 5;
        int i13 = 0;
        while (i13 < this.f8971r0) {
            C2442d c2442d2 = this.f8970q0[i13];
            if (this.f8791t0 || c2442d2.mo4354c()) {
                C2335h c2335hM4136k = c2330c.m4136k(c2442d2.f8836Q[this.f8790s0]);
                C2441c[] c2441cArr2 = c2442d2.f8836Q;
                int i14 = this.f8790s0;
                C2441c c2441c7 = c2441cArr2[i14];
                c2441c7.f8819i = c2335hM4136k;
                C2441c c2441c8 = c2441c7.f8816f;
                int i15 = (c2441c8 == null || c2441c8.f8814d != this) ? 0 : c2441c7.f8817g;
                if (i14 == 0 || i14 == i8) {
                    C2335h c2335h = c2441c6.f8819i;
                    int i16 = this.f8792u0 - i15;
                    C2329b c2329bM4137l = c2330c.m4137l();
                    C2335h c2335hM4138m = c2330c.m4138m();
                    c2335hM4138m.f8179m = 0;
                    c2329bM4137l.m4118c(c2335h, c2335hM4136k, c2335hM4138m, i16);
                    c2330c.m4128c(c2329bM4137l);
                } else {
                    C2335h c2335h2 = c2441c6.f8819i;
                    int i17 = this.f8792u0 + i15;
                    C2329b c2329bM4137l2 = c2330c.m4137l();
                    C2335h c2335hM4138m2 = c2330c.m4138m();
                    c2335hM4138m2.f8179m = 0;
                    c2329bM4137l2.m4117b(c2335h2, c2335hM4136k, c2335hM4138m2, i17);
                    c2330c.m4128c(c2329bM4137l2);
                }
                c2330c.m4130e(c2441c6.f8819i, c2335hM4136k, this.f8792u0 + i15, i12);
            }
            i13++;
            i8 = 2;
        }
        int i18 = this.f8790s0;
        if (i18 == 0) {
            c2330c.m4130e(c2441c3.f8819i, c2441c.f8819i, 0, 8);
            c2330c.m4130e(c2441c.f8819i, this.f8839T.f8830K.f8819i, 0, 4);
            c2330c.m4130e(c2441c.f8819i, this.f8839T.f8828I.f8819i, 0, 0);
            return;
        }
        if (i18 == 1) {
            c2330c.m4130e(c2441c.f8819i, c2441c3.f8819i, 0, 8);
            c2330c.m4130e(c2441c.f8819i, this.f8839T.f8828I.f8819i, 0, 4);
            c2330c.m4130e(c2441c.f8819i, this.f8839T.f8830K.f8819i, 0, 0);
        } else if (i18 == 2) {
            c2330c.m4130e(c2441c4.f8819i, c2441c2.f8819i, 0, 8);
            c2330c.m4130e(c2441c2.f8819i, this.f8839T.f8831L.f8819i, 0, 4);
            c2330c.m4130e(c2441c2.f8819i, this.f8839T.f8829J.f8819i, 0, 0);
        } else if (i18 == 3) {
            c2330c.m4130e(c2441c2.f8819i, c2441c4.f8819i, 0, 8);
            c2330c.m4130e(c2441c2.f8819i, this.f8839T.f8829J.f8819i, 0, 4);
            c2330c.m4130e(c2441c2.f8819i, this.f8839T.f8831L.f8819i, 0, 0);
        }
    }

    @Override // p174u.C2442d
    /* renamed from: c */
    public final boolean mo4354c() {
        return true;
    }

    @Override // p174u.C2442d
    public final String toString() {
        String strM18n = AbstractC0008a1.m18n(new StringBuilder("[Barrier] "), this.f8861h0, " {");
        for (int i = 0; i < this.f8971r0; i++) {
            C2442d c2442d = this.f8970q0[i];
            if (i > 0) {
                strM18n = AbstractC0008a1.m16l(strM18n, ", ");
            }
            strM18n = strM18n + c2442d.f8861h0;
        }
        return AbstractC0008a1.m16l(strM18n, "}");
    }
}
