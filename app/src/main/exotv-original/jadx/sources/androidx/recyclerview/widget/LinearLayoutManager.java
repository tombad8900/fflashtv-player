package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import p002a1.AbstractC0008a1;
import p063h1.C1131v;
import p168t2.AbstractC2415i0;
import p168t2.C2430x;
import p183v0.AbstractC2506f;
import p216z2.AbstractC2888f0;
import p216z2.AbstractC2920v0;
import p216z2.C2885e0;
import p216z2.C2890g0;
import p216z2.C2900l0;
import p216z2.C2905o;
import p216z2.C2907p;
import p216z2.C2909q;
import p216z2.C2911r;
import p216z2.C2912r0;
import p216z2.InterfaceC2910q0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC2888f0 implements InterfaceC2910q0 {

    /* renamed from: A */
    public final C2430x f1989A;

    /* renamed from: B */
    public final C2905o f1990B;

    /* renamed from: C */
    public final int f1991C;

    /* renamed from: D */
    public final int[] f1992D;

    /* renamed from: p */
    public int f1993p;

    /* renamed from: q */
    public C2907p f1994q;

    /* renamed from: r */
    public AbstractC2506f f1995r;

    /* renamed from: s */
    public boolean f1996s;

    /* renamed from: t */
    public final boolean f1997t;

    /* renamed from: u */
    public boolean f1998u;

    /* renamed from: v */
    public boolean f1999v;

    /* renamed from: w */
    public final boolean f2000w;

    /* renamed from: x */
    public int f2001x;

    /* renamed from: y */
    public int f2002y;

    /* renamed from: z */
    public C2909q f2003z;

    public LinearLayoutManager(int i) {
        this.f1993p = 1;
        this.f1997t = false;
        this.f1998u = false;
        this.f1999v = false;
        this.f2000w = true;
        this.f2001x = -1;
        this.f2002y = Integer.MIN_VALUE;
        this.f2003z = null;
        this.f1989A = new C2430x();
        this.f1990B = new C2905o();
        this.f1991C = 2;
        this.f1992D = new int[2];
        m1126c1(i);
        mo1125c(null);
        if (this.f1997t) {
            this.f1997t = false;
            m5004n0();
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: B0 */
    public boolean mo1061B0() {
        return this.f2003z == null && this.f1996s == this.f1999v;
    }

    /* renamed from: C0 */
    public void mo1099C0(C2912r0 c2912r0, int[] iArr) {
        int i;
        int iMo4517l = c2912r0.f10819a != -1 ? this.f1995r.mo4517l() : 0;
        if (this.f1994q.f10786f == -1) {
            i = 0;
        } else {
            i = iMo4517l;
            iMo4517l = 0;
        }
        iArr[0] = iMo4517l;
        iArr[1] = i;
    }

    /* renamed from: D0 */
    public void mo1062D0(C2912r0 c2912r0, C2907p c2907p, C1131v c1131v) {
        int i = c2907p.f10784d;
        if (i < 0 || i >= c2912r0.m5052b()) {
            return;
        }
        c1131v.m2484a(i, Math.max(0, c2907p.f10787g));
    }

    /* renamed from: E0 */
    public final int m1100E0(C2912r0 c2912r0) {
        if (m5010v() == 0) {
            return 0;
        }
        m1104I0();
        AbstractC2506f abstractC2506f = this.f1995r;
        boolean z7 = !this.f2000w;
        return AbstractC2415i0.m4263d(c2912r0, abstractC2506f, m1108L0(z7), m1106K0(z7), this, this.f2000w);
    }

    /* renamed from: F0 */
    public final int m1101F0(C2912r0 c2912r0) {
        if (m5010v() == 0) {
            return 0;
        }
        m1104I0();
        AbstractC2506f abstractC2506f = this.f1995r;
        boolean z7 = !this.f2000w;
        return AbstractC2415i0.m4264e(c2912r0, abstractC2506f, m1108L0(z7), m1106K0(z7), this, this.f2000w, this.f1998u);
    }

    /* renamed from: G0 */
    public final int m1102G0(C2912r0 c2912r0) {
        if (m5010v() == 0) {
            return 0;
        }
        m1104I0();
        AbstractC2506f abstractC2506f = this.f1995r;
        boolean z7 = !this.f2000w;
        return AbstractC2415i0.m4265f(c2912r0, abstractC2506f, m1108L0(z7), m1106K0(z7), this, this.f2000w);
    }

    /* renamed from: H0 */
    public final int m1103H0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f1993p == 1) ? 1 : Integer.MIN_VALUE : this.f1993p == 0 ? 1 : Integer.MIN_VALUE : this.f1993p == 1 ? -1 : Integer.MIN_VALUE : this.f1993p == 0 ? -1 : Integer.MIN_VALUE : (this.f1993p != 1 && m1119V0()) ? -1 : 1 : (this.f1993p != 1 && m1119V0()) ? 1 : -1;
    }

    /* renamed from: I0 */
    public final void m1104I0() {
        if (this.f1994q == null) {
            C2907p c2907p = new C2907p();
            c2907p.f10781a = true;
            c2907p.f10788h = 0;
            c2907p.f10789i = 0;
            c2907p.f10791k = null;
            this.f1994q = c2907p;
        }
    }

    /* renamed from: J0 */
    public final int m1105J0(C2900l0 c2900l0, C2907p c2907p, C2912r0 c2912r0, boolean z7) {
        int i;
        int i4 = c2907p.f10783c;
        int i8 = c2907p.f10787g;
        if (i8 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                c2907p.f10787g = i8 + i4;
            }
            m1120Y0(c2900l0, c2907p);
        }
        int i9 = c2907p.f10783c + c2907p.f10788h;
        while (true) {
            if ((!c2907p.f10792l && i9 <= 0) || (i = c2907p.f10784d) < 0 || i >= c2912r0.m5052b()) {
                break;
            }
            C2905o c2905o = this.f1990B;
            c2905o.f10776a = 0;
            c2905o.f10777b = false;
            c2905o.f10778c = false;
            c2905o.f10779d = false;
            mo1067W0(c2900l0, c2912r0, c2907p, c2905o);
            if (!c2905o.f10777b) {
                int i10 = c2907p.f10782b;
                int i11 = c2905o.f10776a;
                c2907p.f10782b = (c2907p.f10786f * i11) + i10;
                if (!c2905o.f10778c || c2907p.f10791k != null || !c2912r0.f10825g) {
                    c2907p.f10783c -= i11;
                    i9 -= i11;
                }
                int i12 = c2907p.f10787g;
                if (i12 != Integer.MIN_VALUE) {
                    int i13 = i12 + i11;
                    c2907p.f10787g = i13;
                    int i14 = c2907p.f10783c;
                    if (i14 < 0) {
                        c2907p.f10787g = i13 + i14;
                    }
                    m1120Y0(c2900l0, c2907p);
                }
                if (z7 && c2905o.f10779d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - c2907p.f10783c;
    }

    /* renamed from: K0 */
    public final View m1106K0(boolean z7) {
        return this.f1998u ? m1112P0(0, m5010v(), z7) : m1112P0(m5010v() - 1, -1, z7);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: L */
    public final boolean mo1107L() {
        return true;
    }

    /* renamed from: L0 */
    public final View m1108L0(boolean z7) {
        return this.f1998u ? m1112P0(m5010v() - 1, -1, z7) : m1112P0(0, m5010v(), z7);
    }

    /* renamed from: M0 */
    public final int m1109M0() {
        View viewM1112P0 = m1112P0(0, m5010v(), false);
        if (viewM1112P0 == null) {
            return -1;
        }
        return AbstractC2888f0.m4983H(viewM1112P0);
    }

    /* renamed from: N0 */
    public final int m1110N0() {
        View viewM1112P0 = m1112P0(m5010v() - 1, -1, false);
        if (viewM1112P0 == null) {
            return -1;
        }
        return AbstractC2888f0.m4983H(viewM1112P0);
    }

    /* renamed from: O0 */
    public final View m1111O0(int i, int i4) {
        int i8;
        int i9;
        m1104I0();
        if (i4 <= i && i4 >= i) {
            return m5008u(i);
        }
        if (this.f1995r.mo4510e(m5008u(i)) < this.f1995r.mo4516k()) {
            i8 = 16644;
            i9 = 16388;
        } else {
            i8 = 4161;
            i9 = 4097;
        }
        return this.f1993p == 0 ? this.f10671c.m4151o(i, i4, i8, i9) : this.f10672d.m4151o(i, i4, i8, i9);
    }

    /* renamed from: P0 */
    public final View m1112P0(int i, int i4, boolean z7) {
        m1104I0();
        int i8 = z7 ? 24579 : 320;
        return this.f1993p == 0 ? this.f10671c.m4151o(i, i4, i8, 320) : this.f10672d.m4151o(i, i4, i8, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo1064Q0(C2900l0 c2900l0, C2912r0 c2912r0, boolean z7, boolean z8) {
        int i;
        int iM5010v;
        int i4;
        m1104I0();
        int iM5010v2 = m5010v();
        if (z8) {
            iM5010v = m5010v() - 1;
            i = -1;
            i4 = -1;
        } else {
            i = iM5010v2;
            iM5010v = 0;
            i4 = 1;
        }
        int iM5052b = c2912r0.m5052b();
        int iMo4516k = this.f1995r.mo4516k();
        int iMo4512g = this.f1995r.mo4512g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM5010v != i) {
            View viewM5008u = m5008u(iM5010v);
            int iM4983H = AbstractC2888f0.m4983H(viewM5008u);
            int iMo4510e = this.f1995r.mo4510e(viewM5008u);
            int iMo4507b = this.f1995r.mo4507b(viewM5008u);
            if (iM4983H >= 0 && iM4983H < iM5052b) {
                if (!((C2890g0) viewM5008u.getLayoutParams()).f10689a.m5068h()) {
                    boolean z9 = iMo4507b <= iMo4516k && iMo4510e < iMo4516k;
                    boolean z10 = iMo4510e >= iMo4512g && iMo4507b > iMo4512g;
                    if (!z9 && !z10) {
                        return viewM5008u;
                    }
                    if (z7) {
                        if (z10) {
                            view2 = viewM5008u;
                        } else if (view == null) {
                            view = viewM5008u;
                        }
                    } else if (!z9) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = viewM5008u;
                }
            }
            iM5010v += i4;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* renamed from: R0 */
    public final int m1113R0(int i, C2900l0 c2900l0, C2912r0 c2912r0, boolean z7) {
        int iMo4512g;
        int iMo4512g2 = this.f1995r.mo4512g() - i;
        if (iMo4512g2 <= 0) {
            return 0;
        }
        int i4 = -m1124b1(-iMo4512g2, c2900l0, c2912r0);
        int i8 = i + i4;
        if (!z7 || (iMo4512g = this.f1995r.mo4512g() - i8) <= 0) {
            return i4;
        }
        this.f1995r.mo4520o(iMo4512g);
        return iMo4512g + i4;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: S */
    public final void mo1114S(RecyclerView recyclerView) {
    }

    /* renamed from: S0 */
    public final int m1115S0(int i, C2900l0 c2900l0, C2912r0 c2912r0, boolean z7) {
        int iMo4516k;
        int iMo4516k2 = i - this.f1995r.mo4516k();
        if (iMo4516k2 <= 0) {
            return 0;
        }
        int i4 = -m1124b1(iMo4516k2, c2900l0, c2912r0);
        int i8 = i + i4;
        if (!z7 || (iMo4516k = i8 - this.f1995r.mo4516k()) <= 0) {
            return i4;
        }
        this.f1995r.mo4520o(-iMo4516k);
        return i4 - iMo4516k;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: T */
    public View mo1065T(View view, int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        int iM1103H0;
        m1123a1();
        if (m5010v() != 0 && (iM1103H0 = m1103H0(i)) != Integer.MIN_VALUE) {
            m1104I0();
            m1129e1(iM1103H0, (int) (this.f1995r.mo4517l() * 0.33333334f), false, c2912r0);
            C2907p c2907p = this.f1994q;
            c2907p.f10787g = Integer.MIN_VALUE;
            c2907p.f10781a = false;
            m1105J0(c2900l0, c2907p, c2912r0, true);
            View viewM1111O0 = iM1103H0 == -1 ? this.f1998u ? m1111O0(m5010v() - 1, -1) : m1111O0(0, m5010v()) : this.f1998u ? m1111O0(0, m5010v()) : m1111O0(m5010v() - 1, -1);
            View viewM1118U0 = iM1103H0 == -1 ? m1118U0() : m1116T0();
            if (!viewM1118U0.hasFocusable()) {
                return viewM1111O0;
            }
            if (viewM1111O0 != null) {
                return viewM1118U0;
            }
        }
        return null;
    }

    /* renamed from: T0 */
    public final View m1116T0() {
        return m5008u(this.f1998u ? 0 : m5010v() - 1);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: U */
    public final void mo1117U(AccessibilityEvent accessibilityEvent) {
        super.mo1117U(accessibilityEvent);
        if (m5010v() > 0) {
            accessibilityEvent.setFromIndex(m1109M0());
            accessibilityEvent.setToIndex(m1110N0());
        }
    }

    /* renamed from: U0 */
    public final View m1118U0() {
        return m5008u(this.f1998u ? m5010v() - 1 : 0);
    }

    /* renamed from: V0 */
    public final boolean m1119V0() {
        return m4992C() == 1;
    }

    /* renamed from: W0 */
    public void mo1067W0(C2900l0 c2900l0, C2912r0 c2912r0, C2907p c2907p, C2905o c2905o) {
        int iM4994E;
        int i;
        int i4;
        int iMo4509d;
        View viewM5044b = c2907p.m5044b(c2900l0);
        if (viewM5044b == null) {
            c2905o.f10777b = true;
            return;
        }
        C2890g0 c2890g0 = (C2890g0) viewM5044b.getLayoutParams();
        if (c2907p.f10791k == null) {
            if (this.f1998u == (c2907p.f10786f == -1)) {
                m4999b(viewM5044b, -1, false);
            } else {
                m4999b(viewM5044b, 0, false);
            }
        } else {
            if (this.f1998u == (c2907p.f10786f == -1)) {
                m4999b(viewM5044b, -1, true);
            } else {
                m4999b(viewM5044b, 0, true);
            }
        }
        C2890g0 c2890g02 = (C2890g0) viewM5044b.getLayoutParams();
        Rect rectM1163N = this.f10670b.m1163N(viewM5044b);
        int i8 = rectM1163N.left + rectM1163N.right;
        int i9 = rectM1163N.top + rectM1163N.bottom;
        int iM4988w = AbstractC2888f0.m4988w(this.f10682n, this.f10680l, m4995F() + m4994E() + ((ViewGroup.MarginLayoutParams) c2890g02).leftMargin + ((ViewGroup.MarginLayoutParams) c2890g02).rightMargin + i8, ((ViewGroup.MarginLayoutParams) c2890g02).width, mo1127d());
        int iM4988w2 = AbstractC2888f0.m4988w(this.f10683o, this.f10681m, m4993D() + m4996G() + ((ViewGroup.MarginLayoutParams) c2890g02).topMargin + ((ViewGroup.MarginLayoutParams) c2890g02).bottomMargin + i9, ((ViewGroup.MarginLayoutParams) c2890g02).height, mo1128e());
        if (m5012w0(viewM5044b, iM4988w, iM4988w2, c2890g02)) {
            viewM5044b.measure(iM4988w, iM4988w2);
        }
        c2905o.f10776a = this.f1995r.mo4508c(viewM5044b);
        if (this.f1993p == 1) {
            if (m1119V0()) {
                iMo4509d = this.f10682n - m4995F();
                iM4994E = iMo4509d - this.f1995r.mo4509d(viewM5044b);
            } else {
                iM4994E = m4994E();
                iMo4509d = this.f1995r.mo4509d(viewM5044b) + iM4994E;
            }
            if (c2907p.f10786f == -1) {
                i = c2907p.f10782b;
                i4 = i - c2905o.f10776a;
            } else {
                i4 = c2907p.f10782b;
                i = c2905o.f10776a + i4;
            }
        } else {
            int iM4996G = m4996G();
            int iMo4509d2 = this.f1995r.mo4509d(viewM5044b) + iM4996G;
            if (c2907p.f10786f == -1) {
                int i10 = c2907p.f10782b;
                int i11 = i10 - c2905o.f10776a;
                iMo4509d = i10;
                i = iMo4509d2;
                iM4994E = i11;
                i4 = iM4996G;
            } else {
                int i12 = c2907p.f10782b;
                int i13 = c2905o.f10776a + i12;
                iM4994E = i12;
                i = iMo4509d2;
                i4 = iM4996G;
                iMo4509d = i13;
            }
        }
        AbstractC2888f0.m4986N(viewM5044b, iM4994E, i4, iMo4509d, i);
        if (c2890g0.f10689a.m5068h() || c2890g0.f10689a.m5071k()) {
            c2905o.f10778c = true;
        }
        c2905o.f10779d = viewM5044b.hasFocusable();
    }

    /* renamed from: X0 */
    public void mo1069X0(C2900l0 c2900l0, C2912r0 c2912r0, C2430x c2430x, int i) {
    }

    /* renamed from: Y0 */
    public final void m1120Y0(C2900l0 c2900l0, C2907p c2907p) {
        if (!c2907p.f10781a || c2907p.f10792l) {
            return;
        }
        int i = c2907p.f10787g;
        int i4 = c2907p.f10789i;
        if (c2907p.f10786f == -1) {
            int iM5010v = m5010v();
            if (i < 0) {
                return;
            }
            int iMo4511f = (this.f1995r.mo4511f() - i) + i4;
            if (this.f1998u) {
                for (int i8 = 0; i8 < iM5010v; i8++) {
                    View viewM5008u = m5008u(i8);
                    if (this.f1995r.mo4510e(viewM5008u) < iMo4511f || this.f1995r.mo4519n(viewM5008u) < iMo4511f) {
                        m1121Z0(c2900l0, 0, i8);
                        return;
                    }
                }
                return;
            }
            int i9 = iM5010v - 1;
            for (int i10 = i9; i10 >= 0; i10--) {
                View viewM5008u2 = m5008u(i10);
                if (this.f1995r.mo4510e(viewM5008u2) < iMo4511f || this.f1995r.mo4519n(viewM5008u2) < iMo4511f) {
                    m1121Z0(c2900l0, i9, i10);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i11 = i - i4;
        int iM5010v2 = m5010v();
        if (!this.f1998u) {
            for (int i12 = 0; i12 < iM5010v2; i12++) {
                View viewM5008u3 = m5008u(i12);
                if (this.f1995r.mo4507b(viewM5008u3) > i11 || this.f1995r.mo4518m(viewM5008u3) > i11) {
                    m1121Z0(c2900l0, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iM5010v2 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewM5008u4 = m5008u(i14);
            if (this.f1995r.mo4507b(viewM5008u4) > i11 || this.f1995r.mo4518m(viewM5008u4) > i11) {
                m1121Z0(c2900l0, i13, i14);
                return;
            }
        }
    }

    /* renamed from: Z0 */
    public final void m1121Z0(C2900l0 c2900l0, int i, int i4) {
        if (i == i4) {
            return;
        }
        if (i4 <= i) {
            while (i > i4) {
                View viewM5008u = m5008u(i);
                m5003l0(i);
                c2900l0.m5037i(viewM5008u);
                i--;
            }
            return;
        }
        for (int i8 = i4 - 1; i8 >= i; i8--) {
            View viewM5008u2 = m5008u(i8);
            m5003l0(i8);
            c2900l0.m5037i(viewM5008u2);
        }
    }

    @Override // p216z2.InterfaceC2910q0
    /* renamed from: a */
    public final PointF mo1122a(int i) {
        if (m5010v() == 0) {
            return null;
        }
        int i4 = (i < AbstractC2888f0.m4983H(m5008u(0))) != this.f1998u ? -1 : 1;
        return this.f1993p == 0 ? new PointF(i4, 0.0f) : new PointF(0.0f, i4);
    }

    /* renamed from: a1 */
    public final void m1123a1() {
        if (this.f1993p == 1 || !m1119V0()) {
            this.f1998u = this.f1997t;
        } else {
            this.f1998u = !this.f1997t;
        }
    }

    /* renamed from: b1 */
    public final int m1124b1(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        if (m5010v() != 0 && i != 0) {
            m1104I0();
            this.f1994q.f10781a = true;
            int i4 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m1129e1(i4, iAbs, true, c2912r0);
            C2907p c2907p = this.f1994q;
            int iM1105J0 = m1105J0(c2900l0, c2907p, c2912r0, false) + c2907p.f10787g;
            if (iM1105J0 >= 0) {
                if (iAbs > iM1105J0) {
                    i = i4 * iM1105J0;
                }
                this.f1995r.mo4520o(-i);
                this.f1994q.f10790j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: c */
    public final void mo1125c(String str) {
        if (this.f2003z == null) {
            super.mo1125c(str);
        }
    }

    /* renamed from: c1 */
    public final void m1126c1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "invalid orientation:"));
        }
        mo1125c(null);
        if (i != this.f1993p || this.f1995r == null) {
            AbstractC2506f abstractC2506fM4506a = AbstractC2506f.m4506a(this, i);
            this.f1995r = abstractC2506fM4506a;
            this.f1989A.f8763f = abstractC2506fM4506a;
            this.f1993p = i;
            m5004n0();
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: d */
    public final boolean mo1127d() {
        return this.f1993p == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    @Override // p216z2.AbstractC2888f0
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1075d0(C2900l0 c2900l0, C2912r0 c2912r0) {
        View focusedChild;
        View focusedChild2;
        View viewMo1064Q0;
        int i;
        int iMo4510e;
        int i4;
        int i8;
        List list;
        int i9;
        int i10;
        int iM1113R0;
        int i11;
        View viewMo1139q;
        int iMo4510e2;
        int iMo4512g;
        int i12;
        int i13 = -1;
        if (!(this.f2003z == null && this.f2001x == -1) && c2912r0.m5052b() == 0) {
            m5000i0(c2900l0);
            return;
        }
        C2909q c2909q = this.f2003z;
        if (c2909q != null && (i12 = c2909q.f10800j) >= 0) {
            this.f2001x = i12;
        }
        m1104I0();
        this.f1994q.f10781a = false;
        m1123a1();
        RecyclerView recyclerView = this.f10670b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f10669a.f5232n).contains(focusedChild)) {
            focusedChild = null;
        }
        C2430x c2430x = this.f1989A;
        if (!c2430x.f8762e || this.f2001x != -1 || this.f2003z != null) {
            c2430x.m4321f();
            c2430x.f8761d = this.f1998u ^ this.f1999v;
            if (c2912r0.f10825g || (i = this.f2001x) == -1) {
                if (m5010v() != 0) {
                    RecyclerView recyclerView2 = this.f10670b;
                    if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f10669a.f5232n).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        C2890g0 c2890g0 = (C2890g0) focusedChild2.getLayoutParams();
                        if (c2890g0.f10689a.m5068h() || c2890g0.f10689a.m5062b() < 0 || c2890g0.f10689a.m5062b() >= c2912r0.m5052b()) {
                            boolean z7 = this.f1996s;
                            boolean z8 = this.f1999v;
                            if (z7 == z8 && (viewMo1064Q0 = mo1064Q0(c2900l0, c2912r0, c2430x.f8761d, z8)) != null) {
                                c2430x.m4318c(viewMo1064Q0, AbstractC2888f0.m4983H(viewMo1064Q0));
                                if (!c2912r0.f10825g && mo1061B0()) {
                                    int iMo4510e3 = this.f1995r.mo4510e(viewMo1064Q0);
                                    int iMo4507b = this.f1995r.mo4507b(viewMo1064Q0);
                                    int iMo4516k = this.f1995r.mo4516k();
                                    int iMo4512g2 = this.f1995r.mo4512g();
                                    boolean z9 = iMo4507b <= iMo4516k && iMo4510e3 < iMo4516k;
                                    boolean z10 = iMo4510e3 >= iMo4512g2 && iMo4507b > iMo4512g2;
                                    if (z9 || z10) {
                                        if (c2430x.f8761d) {
                                            iMo4516k = iMo4512g2;
                                        }
                                        c2430x.f8760c = iMo4516k;
                                    }
                                }
                            } else {
                                c2430x.m4317b();
                                c2430x.f8759b = this.f1999v ? c2912r0.m5052b() - 1 : 0;
                            }
                        } else {
                            c2430x.m4319d(focusedChild2, AbstractC2888f0.m4983H(focusedChild2));
                        }
                        c2430x.f8762e = true;
                    }
                }
            } else if (i < 0 || i >= c2912r0.m5052b()) {
                this.f2001x = -1;
                this.f2002y = Integer.MIN_VALUE;
                if (m5010v() != 0) {
                }
            } else {
                int i14 = this.f2001x;
                c2430x.f8759b = i14;
                C2909q c2909q2 = this.f2003z;
                if (c2909q2 != null && c2909q2.f10800j >= 0) {
                    boolean z11 = c2909q2.f10802l;
                    c2430x.f8761d = z11;
                    if (z11) {
                        c2430x.f8760c = this.f1995r.mo4512g() - this.f2003z.f10801k;
                    } else {
                        c2430x.f8760c = this.f1995r.mo4516k() + this.f2003z.f10801k;
                    }
                } else if (this.f2002y == Integer.MIN_VALUE) {
                    View viewMo1139q2 = mo1139q(i14);
                    if (viewMo1139q2 == null) {
                        if (m5010v() > 0) {
                            c2430x.f8761d = (this.f2001x < AbstractC2888f0.m4983H(m5008u(0))) == this.f1998u;
                        }
                        c2430x.m4317b();
                    } else if (this.f1995r.mo4508c(viewMo1139q2) > this.f1995r.mo4517l()) {
                        c2430x.m4317b();
                    } else if (this.f1995r.mo4510e(viewMo1139q2) - this.f1995r.mo4516k() < 0) {
                        c2430x.f8760c = this.f1995r.mo4516k();
                        c2430x.f8761d = false;
                    } else if (this.f1995r.mo4512g() - this.f1995r.mo4507b(viewMo1139q2) < 0) {
                        c2430x.f8760c = this.f1995r.mo4512g();
                        c2430x.f8761d = true;
                    } else {
                        if (c2430x.f8761d) {
                            int iMo4507b2 = this.f1995r.mo4507b(viewMo1139q2);
                            AbstractC2506f abstractC2506f = this.f1995r;
                            iMo4510e = (Integer.MIN_VALUE == abstractC2506f.f9138a ? 0 : abstractC2506f.mo4517l() - abstractC2506f.f9138a) + iMo4507b2;
                        } else {
                            iMo4510e = this.f1995r.mo4510e(viewMo1139q2);
                        }
                        c2430x.f8760c = iMo4510e;
                    }
                } else {
                    boolean z12 = this.f1998u;
                    c2430x.f8761d = z12;
                    if (z12) {
                        c2430x.f8760c = this.f1995r.mo4512g() - this.f2002y;
                    } else {
                        c2430x.f8760c = this.f1995r.mo4516k() + this.f2002y;
                    }
                }
                c2430x.f8762e = true;
            }
        } else if (focusedChild != null && (this.f1995r.mo4510e(focusedChild) >= this.f1995r.mo4512g() || this.f1995r.mo4507b(focusedChild) <= this.f1995r.mo4516k())) {
            c2430x.m4319d(focusedChild, AbstractC2888f0.m4983H(focusedChild));
        }
        C2907p c2907p = this.f1994q;
        c2907p.f10786f = c2907p.f10790j >= 0 ? 1 : -1;
        int[] iArr = this.f1992D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1099C0(c2912r0, iArr);
        int iMo4516k2 = this.f1995r.mo4516k() + Math.max(0, iArr[0]);
        int iMo4513h = this.f1995r.mo4513h() + Math.max(0, iArr[1]);
        if (c2912r0.f10825g && (i11 = this.f2001x) != -1 && this.f2002y != Integer.MIN_VALUE && (viewMo1139q = mo1139q(i11)) != null) {
            if (this.f1998u) {
                iMo4512g = this.f1995r.mo4512g() - this.f1995r.mo4507b(viewMo1139q);
                iMo4510e2 = this.f2002y;
            } else {
                iMo4510e2 = this.f1995r.mo4510e(viewMo1139q) - this.f1995r.mo4516k();
                iMo4512g = this.f2002y;
            }
            int i15 = iMo4512g - iMo4510e2;
            if (i15 > 0) {
                iMo4516k2 += i15;
            } else {
                iMo4513h -= i15;
            }
        }
        if (!c2430x.f8761d ? !this.f1998u : this.f1998u) {
            i13 = 1;
        }
        mo1069X0(c2900l0, c2912r0, c2430x, i13);
        m5005p(c2900l0);
        this.f1994q.f10792l = this.f1995r.mo4514i() == 0 && this.f1995r.mo4511f() == 0;
        this.f1994q.getClass();
        this.f1994q.f10789i = 0;
        if (c2430x.f8761d) {
            m1133g1(c2430x.f8759b, c2430x.f8760c);
            C2907p c2907p2 = this.f1994q;
            c2907p2.f10788h = iMo4516k2;
            m1105J0(c2900l0, c2907p2, c2912r0, false);
            C2907p c2907p3 = this.f1994q;
            i8 = c2907p3.f10782b;
            int i16 = c2907p3.f10784d;
            int i17 = c2907p3.f10783c;
            if (i17 > 0) {
                iMo4513h += i17;
            }
            m1131f1(c2430x.f8759b, c2430x.f8760c);
            C2907p c2907p4 = this.f1994q;
            c2907p4.f10788h = iMo4513h;
            c2907p4.f10784d += c2907p4.f10785e;
            m1105J0(c2900l0, c2907p4, c2912r0, false);
            C2907p c2907p5 = this.f1994q;
            i4 = c2907p5.f10782b;
            int i18 = c2907p5.f10783c;
            if (i18 > 0) {
                m1133g1(i16, i8);
                C2907p c2907p6 = this.f1994q;
                c2907p6.f10788h = i18;
                m1105J0(c2900l0, c2907p6, c2912r0, false);
                i8 = this.f1994q.f10782b;
            }
        } else {
            m1131f1(c2430x.f8759b, c2430x.f8760c);
            C2907p c2907p7 = this.f1994q;
            c2907p7.f10788h = iMo4513h;
            m1105J0(c2900l0, c2907p7, c2912r0, false);
            C2907p c2907p8 = this.f1994q;
            i4 = c2907p8.f10782b;
            int i19 = c2907p8.f10784d;
            int i20 = c2907p8.f10783c;
            if (i20 > 0) {
                iMo4516k2 += i20;
            }
            m1133g1(c2430x.f8759b, c2430x.f8760c);
            C2907p c2907p9 = this.f1994q;
            c2907p9.f10788h = iMo4516k2;
            c2907p9.f10784d += c2907p9.f10785e;
            m1105J0(c2900l0, c2907p9, c2912r0, false);
            C2907p c2907p10 = this.f1994q;
            int i21 = c2907p10.f10782b;
            int i22 = c2907p10.f10783c;
            if (i22 > 0) {
                m1131f1(i19, i4);
                C2907p c2907p11 = this.f1994q;
                c2907p11.f10788h = i22;
                m1105J0(c2900l0, c2907p11, c2912r0, false);
                i4 = this.f1994q.f10782b;
            }
            i8 = i21;
        }
        if (m5010v() > 0) {
            if (this.f1998u ^ this.f1999v) {
                int iM1113R02 = m1113R0(i4, c2900l0, c2912r0, true);
                i9 = i8 + iM1113R02;
                i10 = i4 + iM1113R02;
                iM1113R0 = m1115S0(i9, c2900l0, c2912r0, false);
            } else {
                int iM1115S0 = m1115S0(i8, c2900l0, c2912r0, true);
                i9 = i8 + iM1115S0;
                i10 = i4 + iM1115S0;
                iM1113R0 = m1113R0(i10, c2900l0, c2912r0, false);
            }
            i8 = i9 + iM1113R0;
            i4 = i10 + iM1113R0;
        }
        if (c2912r0.f10829k && m5010v() != 0 && !c2912r0.f10825g && mo1061B0()) {
            List list2 = c2900l0.f10759d;
            int size = list2.size();
            int iM4983H = AbstractC2888f0.m4983H(m5008u(0));
            int iMo4508c = 0;
            int iMo4508c2 = 0;
            for (int i23 = 0; i23 < size; i23++) {
                AbstractC2920v0 abstractC2920v0 = (AbstractC2920v0) list2.get(i23);
                boolean zM5068h = abstractC2920v0.m5068h();
                View view = abstractC2920v0.f10848a;
                if (!zM5068h) {
                    if ((abstractC2920v0.m5062b() < iM4983H) != this.f1998u) {
                        iMo4508c += this.f1995r.mo4508c(view);
                    } else {
                        iMo4508c2 += this.f1995r.mo4508c(view);
                    }
                }
            }
            this.f1994q.f10791k = list2;
            if (iMo4508c > 0) {
                m1133g1(AbstractC2888f0.m4983H(m1118U0()), i8);
                C2907p c2907p12 = this.f1994q;
                c2907p12.f10788h = iMo4508c;
                c2907p12.f10783c = 0;
                c2907p12.m5043a(null);
                m1105J0(c2900l0, this.f1994q, c2912r0, false);
            }
            if (iMo4508c2 > 0) {
                m1131f1(AbstractC2888f0.m4983H(m1116T0()), i4);
                C2907p c2907p13 = this.f1994q;
                c2907p13.f10788h = iMo4508c2;
                c2907p13.f10783c = 0;
                list = null;
                c2907p13.m5043a(null);
                m1105J0(c2900l0, this.f1994q, c2912r0, false);
            } else {
                list = null;
            }
            this.f1994q.f10791k = list;
        }
        if (c2912r0.f10825g) {
            c2430x.m4321f();
        } else {
            AbstractC2506f abstractC2506f2 = this.f1995r;
            abstractC2506f2.f9138a = abstractC2506f2.mo4517l();
        }
        this.f1996s = this.f1999v;
    }

    /* renamed from: d1 */
    public void mo1076d1(boolean z7) {
        mo1125c(null);
        if (this.f1999v == z7) {
            return;
        }
        this.f1999v = z7;
        m5004n0();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: e */
    public final boolean mo1128e() {
        return this.f1993p == 1;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: e0 */
    public void mo1077e0(C2912r0 c2912r0) {
        this.f2003z = null;
        this.f2001x = -1;
        this.f2002y = Integer.MIN_VALUE;
        this.f1989A.m4321f();
    }

    /* renamed from: e1 */
    public final void m1129e1(int i, int i4, boolean z7, C2912r0 c2912r0) {
        int iMo4516k;
        this.f1994q.f10792l = this.f1995r.mo4514i() == 0 && this.f1995r.mo4511f() == 0;
        this.f1994q.f10786f = i;
        int[] iArr = this.f1992D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1099C0(c2912r0, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z8 = i == 1;
        C2907p c2907p = this.f1994q;
        int i8 = z8 ? iMax2 : iMax;
        c2907p.f10788h = i8;
        if (!z8) {
            iMax = iMax2;
        }
        c2907p.f10789i = iMax;
        if (z8) {
            c2907p.f10788h = this.f1995r.mo4513h() + i8;
            View viewM1116T0 = m1116T0();
            C2907p c2907p2 = this.f1994q;
            c2907p2.f10785e = this.f1998u ? -1 : 1;
            int iM4983H = AbstractC2888f0.m4983H(viewM1116T0);
            C2907p c2907p3 = this.f1994q;
            c2907p2.f10784d = iM4983H + c2907p3.f10785e;
            c2907p3.f10782b = this.f1995r.mo4507b(viewM1116T0);
            iMo4516k = this.f1995r.mo4507b(viewM1116T0) - this.f1995r.mo4512g();
        } else {
            View viewM1118U0 = m1118U0();
            C2907p c2907p4 = this.f1994q;
            c2907p4.f10788h = this.f1995r.mo4516k() + c2907p4.f10788h;
            C2907p c2907p5 = this.f1994q;
            c2907p5.f10785e = this.f1998u ? 1 : -1;
            int iM4983H2 = AbstractC2888f0.m4983H(viewM1118U0);
            C2907p c2907p6 = this.f1994q;
            c2907p5.f10784d = iM4983H2 + c2907p6.f10785e;
            c2907p6.f10782b = this.f1995r.mo4510e(viewM1118U0);
            iMo4516k = (-this.f1995r.mo4510e(viewM1118U0)) + this.f1995r.mo4516k();
        }
        C2907p c2907p7 = this.f1994q;
        c2907p7.f10783c = i4;
        if (z7) {
            c2907p7.f10783c = i4 - iMo4516k;
        }
        c2907p7.f10787g = iMo4516k;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: f0 */
    public final void mo1130f0(Parcelable parcelable) {
        if (parcelable instanceof C2909q) {
            C2909q c2909q = (C2909q) parcelable;
            this.f2003z = c2909q;
            if (this.f2001x != -1) {
                c2909q.f10800j = -1;
            }
            m5004n0();
        }
    }

    /* renamed from: f1 */
    public final void m1131f1(int i, int i4) {
        this.f1994q.f10783c = this.f1995r.mo4512g() - i4;
        C2907p c2907p = this.f1994q;
        c2907p.f10785e = this.f1998u ? -1 : 1;
        c2907p.f10784d = i;
        c2907p.f10786f = 1;
        c2907p.f10782b = i4;
        c2907p.f10787g = Integer.MIN_VALUE;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: g0 */
    public final Parcelable mo1132g0() {
        C2909q c2909q = this.f2003z;
        if (c2909q != null) {
            C2909q c2909q2 = new C2909q();
            c2909q2.f10800j = c2909q.f10800j;
            c2909q2.f10801k = c2909q.f10801k;
            c2909q2.f10802l = c2909q.f10802l;
            return c2909q2;
        }
        C2909q c2909q3 = new C2909q();
        if (m5010v() <= 0) {
            c2909q3.f10800j = -1;
            return c2909q3;
        }
        m1104I0();
        boolean z7 = this.f1996s ^ this.f1998u;
        c2909q3.f10802l = z7;
        if (z7) {
            View viewM1116T0 = m1116T0();
            c2909q3.f10801k = this.f1995r.mo4512g() - this.f1995r.mo4507b(viewM1116T0);
            c2909q3.f10800j = AbstractC2888f0.m4983H(viewM1116T0);
            return c2909q3;
        }
        View viewM1118U0 = m1118U0();
        c2909q3.f10800j = AbstractC2888f0.m4983H(viewM1118U0);
        c2909q3.f10801k = this.f1995r.mo4510e(viewM1118U0) - this.f1995r.mo4516k();
        return c2909q3;
    }

    /* renamed from: g1 */
    public final void m1133g1(int i, int i4) {
        this.f1994q.f10783c = i4 - this.f1995r.mo4516k();
        C2907p c2907p = this.f1994q;
        c2907p.f10784d = i;
        c2907p.f10785e = this.f1998u ? 1 : -1;
        c2907p.f10786f = -1;
        c2907p.f10782b = i4;
        c2907p.f10787g = Integer.MIN_VALUE;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: h */
    public final void mo1134h(int i, int i4, C2912r0 c2912r0, C1131v c1131v) {
        if (this.f1993p != 0) {
            i = i4;
        }
        if (m5010v() == 0 || i == 0) {
            return;
        }
        m1104I0();
        m1129e1(i > 0 ? 1 : -1, Math.abs(i), true, c2912r0);
        mo1062D0(c2912r0, this.f1994q, c1131v);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: i */
    public final void mo1135i(int i, C1131v c1131v) {
        boolean z7;
        int i4;
        C2909q c2909q = this.f2003z;
        if (c2909q == null || (i4 = c2909q.f10800j) < 0) {
            m1123a1();
            z7 = this.f1998u;
            i4 = this.f2001x;
            if (i4 == -1) {
                i4 = z7 ? i - 1 : 0;
            }
        } else {
            z7 = c2909q.f10802l;
        }
        int i8 = z7 ? -1 : 1;
        for (int i9 = 0; i9 < this.f1991C && i4 >= 0 && i4 < i; i9++) {
            c1131v.m2484a(i4, 0);
            i4 += i8;
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: j */
    public final int mo1136j(C2912r0 c2912r0) {
        return m1100E0(c2912r0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: k */
    public int mo1082k(C2912r0 c2912r0) {
        return m1101F0(c2912r0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: l */
    public int mo1084l(C2912r0 c2912r0) {
        return m1102G0(c2912r0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: m */
    public final int mo1137m(C2912r0 c2912r0) {
        return m1100E0(c2912r0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: n */
    public int mo1087n(C2912r0 c2912r0) {
        return m1101F0(c2912r0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: o */
    public int mo1089o(C2912r0 c2912r0) {
        return m1102G0(c2912r0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: o0 */
    public int mo1090o0(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        if (this.f1993p == 1) {
            return 0;
        }
        return m1124b1(i, c2900l0, c2912r0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: p0 */
    public final void mo1138p0(int i) {
        this.f2001x = i;
        this.f2002y = Integer.MIN_VALUE;
        C2909q c2909q = this.f2003z;
        if (c2909q != null) {
            c2909q.f10800j = -1;
        }
        m5004n0();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: q */
    public final View mo1139q(int i) {
        int iM5010v = m5010v();
        if (iM5010v == 0) {
            return null;
        }
        int iM4983H = i - AbstractC2888f0.m4983H(m5008u(0));
        if (iM4983H >= 0 && iM4983H < iM5010v) {
            View viewM5008u = m5008u(iM4983H);
            if (AbstractC2888f0.m4983H(viewM5008u) == i) {
                return viewM5008u;
            }
        }
        return super.mo1139q(i);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: q0 */
    public int mo1093q0(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        if (this.f1993p == 0) {
            return 0;
        }
        return m1124b1(i, c2900l0, c2912r0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: r */
    public C2890g0 mo1094r() {
        return new C2890g0(-2, -2);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: x0 */
    public final boolean mo1140x0() {
        if (this.f10681m != 1073741824 && this.f10680l != 1073741824) {
            int iM5010v = m5010v();
            for (int i = 0; i < iM5010v; i++) {
                ViewGroup.LayoutParams layoutParams = m5008u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: z0 */
    public void mo1141z0(RecyclerView recyclerView, int i) {
        C2911r c2911r = new C2911r(recyclerView.getContext());
        c2911r.f10803a = i;
        m4990A0(c2911r);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        this.f1993p = 1;
        this.f1997t = false;
        this.f1998u = false;
        this.f1999v = false;
        this.f2000w = true;
        this.f2001x = -1;
        this.f2002y = Integer.MIN_VALUE;
        this.f2003z = null;
        this.f1989A = new C2430x();
        this.f1990B = new C2905o();
        this.f1991C = 2;
        this.f1992D = new int[2];
        C2885e0 c2885e0M4984I = AbstractC2888f0.m4984I(context, attributeSet, i, i4);
        m1126c1(c2885e0M4984I.f10655a);
        boolean z7 = c2885e0M4984I.f10657c;
        mo1125c(null);
        if (z7 != this.f1997t) {
            this.f1997t = z7;
            m5004n0();
        }
        mo1076d1(c2885e0M4984I.f10658d);
    }
}
