package p174u;

import java.util.ArrayList;
import p156s.AbstractC2334g;
import p156s.C2329b;
import p156s.C2330c;
import p156s.C2335h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u.h */
/* loaded from: classes.dex */
public final class C2446h extends C2442d {

    /* renamed from: q0 */
    public float f8964q0 = -1.0f;

    /* renamed from: r0 */
    public int f8965r0 = -1;

    /* renamed from: s0 */
    public int f8966s0 = -1;

    /* renamed from: t0 */
    public C2441c f8967t0 = this.f8829J;

    /* renamed from: u0 */
    public int f8968u0 = 0;

    /* renamed from: v0 */
    public boolean f8969v0;

    public C2446h() {
        this.f8837R.clear();
        this.f8837R.add(this.f8967t0);
        int length = this.f8836Q.length;
        for (int i = 0; i < length; i++) {
            this.f8836Q[i] = this.f8967t0;
        }
    }

    @Override // p174u.C2442d
    /* renamed from: A */
    public final boolean mo4349A() {
        return this.f8969v0;
    }

    @Override // p174u.C2442d
    /* renamed from: B */
    public final boolean mo4350B() {
        return this.f8969v0;
    }

    @Override // p174u.C2442d
    /* renamed from: Q */
    public final void mo4383Q(C2330c c2330c, boolean z7) {
        if (this.f8839T == null) {
            return;
        }
        C2441c c2441c = this.f8967t0;
        c2330c.getClass();
        int iM4125n = C2330c.m4125n(c2441c);
        if (this.f8968u0 == 1) {
            this.f8844Y = iM4125n;
            this.f8845Z = 0;
            m4378L(this.f8839T.m4392k());
            m4381O(0);
            return;
        }
        this.f8844Y = 0;
        this.f8845Z = iM4125n;
        m4381O(this.f8839T.m4396q());
        m4378L(0);
    }

    /* renamed from: R */
    public final void m4422R(int i) {
        this.f8967t0.m4366l(i);
        this.f8969v0 = true;
    }

    /* renamed from: S */
    public final void m4423S(int i) {
        if (this.f8968u0 == i) {
            return;
        }
        this.f8968u0 = i;
        ArrayList arrayList = this.f8837R;
        arrayList.clear();
        if (this.f8968u0 == 1) {
            this.f8967t0 = this.f8828I;
        } else {
            this.f8967t0 = this.f8829J;
        }
        arrayList.add(this.f8967t0);
        C2441c[] c2441cArr = this.f8836Q;
        int length = c2441cArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            c2441cArr[i4] = this.f8967t0;
        }
    }

    @Override // p174u.C2442d
    /* renamed from: b */
    public final void mo4353b(C2330c c2330c, boolean z7) {
        C2443e c2443e = (C2443e) this.f8839T;
        if (c2443e == null) {
            return;
        }
        Object objMo4390i = c2443e.mo4390i(2);
        Object objMo4390i2 = c2443e.mo4390i(4);
        C2442d c2442d = this.f8839T;
        boolean z8 = c2442d != null && c2442d.f8877p0[0] == 2;
        if (this.f8968u0 == 0) {
            objMo4390i = c2443e.mo4390i(3);
            objMo4390i2 = c2443e.mo4390i(5);
            C2442d c2442d2 = this.f8839T;
            z8 = c2442d2 != null && c2442d2.f8877p0[1] == 2;
        }
        if (this.f8969v0) {
            C2441c c2441c = this.f8967t0;
            if (c2441c.f8813c) {
                C2335h c2335hM4136k = c2330c.m4136k(c2441c);
                c2330c.m4129d(c2335hM4136k, this.f8967t0.m4358d());
                if (this.f8965r0 != -1) {
                    if (z8) {
                        c2330c.m4131f(c2330c.m4136k(objMo4390i2), c2335hM4136k, 0, 5);
                    }
                } else if (this.f8966s0 != -1 && z8) {
                    C2335h c2335hM4136k2 = c2330c.m4136k(objMo4390i2);
                    c2330c.m4131f(c2335hM4136k, c2330c.m4136k(objMo4390i), 0, 5);
                    c2330c.m4131f(c2335hM4136k2, c2335hM4136k, 0, 5);
                }
                this.f8969v0 = false;
                return;
            }
        }
        if (this.f8965r0 != -1) {
            C2335h c2335hM4136k3 = c2330c.m4136k(this.f8967t0);
            c2330c.m4130e(c2335hM4136k3, c2330c.m4136k(objMo4390i), this.f8965r0, 8);
            if (z8) {
                c2330c.m4131f(c2330c.m4136k(objMo4390i2), c2335hM4136k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f8966s0 != -1) {
            C2335h c2335hM4136k4 = c2330c.m4136k(this.f8967t0);
            C2335h c2335hM4136k5 = c2330c.m4136k(objMo4390i2);
            c2330c.m4130e(c2335hM4136k4, c2335hM4136k5, -this.f8966s0, 8);
            if (z8) {
                c2330c.m4131f(c2335hM4136k4, c2330c.m4136k(objMo4390i), 0, 5);
                c2330c.m4131f(c2335hM4136k5, c2335hM4136k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f8964q0 != -1.0f) {
            C2335h c2335hM4136k6 = c2330c.m4136k(this.f8967t0);
            C2335h c2335hM4136k7 = c2330c.m4136k(objMo4390i2);
            float f8 = this.f8964q0;
            C2329b c2329bM4137l = c2330c.m4137l();
            c2329bM4137l.f8149d.m4114g(c2335hM4136k6, -1.0f);
            c2329bM4137l.f8149d.m4114g(c2335hM4136k7, f8);
            c2330c.m4128c(c2329bM4137l);
        }
    }

    @Override // p174u.C2442d
    /* renamed from: c */
    public final boolean mo4354c() {
        return true;
    }

    @Override // p174u.C2442d
    /* renamed from: i */
    public final C2441c mo4390i(int i) {
        int iM4162a = AbstractC2334g.m4162a(i);
        if (iM4162a != 1) {
            if (iM4162a != 2) {
                if (iM4162a != 3) {
                    if (iM4162a != 4) {
                        return null;
                    }
                }
            }
            if (this.f8968u0 == 0) {
                return this.f8967t0;
            }
            return null;
        }
        if (this.f8968u0 == 1) {
            return this.f8967t0;
        }
        return null;
    }
}
