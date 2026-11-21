package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p002a1.RunnableC0018f;
import p063h1.C1131v;
import p105m0.AbstractC1828m0;
import p130p.C2191j;
import p156s.C2332e;
import p168t2.AbstractC2415i0;
import p183v0.AbstractC2506f;
import p216z2.AbstractC2888f0;
import p216z2.C2874a1;
import p216z2.C2877b1;
import p216z2.C2880c1;
import p216z2.C2883d1;
import p216z2.C2885e0;
import p216z2.C2890g0;
import p216z2.C2900l0;
import p216z2.C2903n;
import p216z2.C2911r;
import p216z2.C2912r0;
import p216z2.InterfaceC2910q0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC2888f0 implements InterfaceC2910q0 {

    /* renamed from: B */
    public final C2332e f2089B;

    /* renamed from: C */
    public final int f2090C;

    /* renamed from: D */
    public boolean f2091D;

    /* renamed from: E */
    public boolean f2092E;

    /* renamed from: F */
    public C2883d1 f2093F;

    /* renamed from: G */
    public final Rect f2094G;

    /* renamed from: H */
    public final C2874a1 f2095H;

    /* renamed from: I */
    public final boolean f2096I;

    /* renamed from: J */
    public int[] f2097J;

    /* renamed from: K */
    public final RunnableC0018f f2098K;

    /* renamed from: p */
    public final int f2099p;

    /* renamed from: q */
    public final C2191j[] f2100q;

    /* renamed from: r */
    public final AbstractC2506f f2101r;

    /* renamed from: s */
    public final AbstractC2506f f2102s;

    /* renamed from: t */
    public final int f2103t;

    /* renamed from: u */
    public int f2104u;

    /* renamed from: v */
    public final C2903n f2105v;

    /* renamed from: w */
    public boolean f2106w;

    /* renamed from: y */
    public final BitSet f2108y;

    /* renamed from: x */
    public boolean f2107x = false;

    /* renamed from: z */
    public int f2109z = -1;

    /* renamed from: A */
    public int f2088A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        this.f2099p = -1;
        this.f2106w = false;
        C2332e c2332e = new C2332e(11, false);
        this.f2089B = c2332e;
        this.f2090C = 2;
        this.f2094G = new Rect();
        this.f2095H = new C2874a1(this);
        this.f2096I = true;
        this.f2098K = new RunnableC0018f(14, this);
        C2885e0 c2885e0M4984I = AbstractC2888f0.m4984I(context, attributeSet, i, i4);
        int i8 = c2885e0M4984I.f10655a;
        if (i8 != 0 && i8 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1125c(null);
        if (i8 != this.f2103t) {
            this.f2103t = i8;
            AbstractC2506f abstractC2506f = this.f2101r;
            this.f2101r = this.f2102s;
            this.f2102s = abstractC2506f;
            m5004n0();
        }
        int i9 = c2885e0M4984I.f10656b;
        mo1125c(null);
        if (i9 != this.f2099p) {
            c2332e.m4147k();
            m5004n0();
            this.f2099p = i9;
            this.f2108y = new BitSet(this.f2099p);
            this.f2100q = new C2191j[this.f2099p];
            for (int i10 = 0; i10 < this.f2099p; i10++) {
                this.f2100q[i10] = new C2191j(this, i10);
            }
            m5004n0();
        }
        boolean z7 = c2885e0M4984I.f10657c;
        mo1125c(null);
        C2883d1 c2883d1 = this.f2093F;
        if (c2883d1 != null && c2883d1.f10647q != z7) {
            c2883d1.f10647q = z7;
        }
        this.f2106w = z7;
        m5004n0();
        C2903n c2903n = new C2903n();
        c2903n.f10766a = true;
        c2903n.f10771f = 0;
        c2903n.f10772g = 0;
        this.f2105v = c2903n;
        this.f2101r = AbstractC2506f.m4506a(this, this.f2103t);
        this.f2102s = AbstractC2506f.m4506a(this, 1 - this.f2103t);
    }

    /* renamed from: c1 */
    public static int m1205c1(int i, int i4, int i8) {
        int mode;
        return (!(i4 == 0 && i8 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i4) - i8), mode) : i;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: B0 */
    public final boolean mo1061B0() {
        return this.f2093F == null;
    }

    /* renamed from: C0 */
    public final boolean m1206C0() {
        int iM1213J0;
        if (m5010v() != 0 && this.f2090C != 0 && this.f10675g) {
            if (this.f2107x) {
                iM1213J0 = m1214K0();
                m1213J0();
            } else {
                iM1213J0 = m1213J0();
                m1214K0();
            }
            if (iM1213J0 == 0 && m1219O0() != null) {
                this.f2089B.m4147k();
                this.f10674f = true;
                m5004n0();
                return true;
            }
        }
        return false;
    }

    /* renamed from: D0 */
    public final int m1207D0(C2912r0 c2912r0) {
        if (m5010v() == 0) {
            return 0;
        }
        boolean z7 = !this.f2096I;
        return AbstractC2415i0.m4264e(c2912r0, this.f2101r, m1210G0(z7), m1209F0(z7), this, this.f2096I, this.f2107x);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* renamed from: E0 */
    public final int m1208E0(C2900l0 c2900l0, C2903n c2903n, C2912r0 c2912r0) {
        C2191j c2191j;
        ?? r8;
        int iM3982j;
        int iMo4508c;
        int iMo4516k;
        int iMo4508c2;
        int i;
        int i4;
        int i8;
        int i9 = 0;
        int i10 = 1;
        this.f2108y.set(0, this.f2099p, true);
        C2903n c2903n2 = this.f2105v;
        int i11 = c2903n2.f10774i ? c2903n.f10770e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c2903n.f10770e == 1 ? c2903n.f10772g + c2903n.f10767b : c2903n.f10771f - c2903n.f10767b;
        int i12 = c2903n.f10770e;
        for (int i13 = 0; i13 < this.f2099p; i13++) {
            if (!((ArrayList) this.f2100q[i13].f7652f).isEmpty()) {
                m1234b1(this.f2100q[i13], i12, i11);
            }
        }
        int iMo4512g = this.f2107x ? this.f2101r.mo4512g() : this.f2101r.mo4516k();
        boolean z7 = false;
        while (true) {
            int i14 = c2903n.f10768c;
            if (i14 < 0 || i14 >= c2912r0.m5052b() || (!c2903n2.f10774i && this.f2108y.isEmpty())) {
                break;
            }
            View viewM5032d = c2900l0.m5032d(c2903n.f10768c);
            c2903n.f10768c += c2903n.f10769d;
            C2877b1 c2877b1 = (C2877b1) viewM5032d.getLayoutParams();
            int iM5062b = c2877b1.f10689a.m5062b();
            C2332e c2332e = this.f2089B;
            int[] iArr = (int[]) c2332e.f8170k;
            int i15 = (iArr == null || iM5062b >= iArr.length) ? -1 : iArr[iM5062b];
            if (i15 == -1) {
                if (m1225S0(c2903n.f10770e)) {
                    i8 = this.f2099p - i10;
                    i4 = -1;
                    i = -1;
                } else {
                    i = i10;
                    i4 = this.f2099p;
                    i8 = i9;
                }
                C2191j c2191j2 = null;
                if (c2903n.f10770e == i10) {
                    int iMo4516k2 = this.f2101r.mo4516k();
                    int i16 = Integer.MAX_VALUE;
                    while (i8 != i4) {
                        C2191j c2191j3 = this.f2100q[i8];
                        int iM3980h = c2191j3.m3980h(iMo4516k2);
                        if (iM3980h < i16) {
                            i16 = iM3980h;
                            c2191j2 = c2191j3;
                        }
                        i8 += i;
                    }
                } else {
                    int iMo4512g2 = this.f2101r.mo4512g();
                    int i17 = Integer.MIN_VALUE;
                    while (i8 != i4) {
                        C2191j c2191j4 = this.f2100q[i8];
                        int iM3982j2 = c2191j4.m3982j(iMo4512g2);
                        if (iM3982j2 > i17) {
                            c2191j2 = c2191j4;
                            i17 = iM3982j2;
                        }
                        i8 += i;
                    }
                }
                c2191j = c2191j2;
                c2332e.m4150n(iM5062b);
                ((int[]) c2332e.f8170k)[iM5062b] = c2191j.f7651e;
            } else {
                c2191j = this.f2100q[i15];
            }
            c2877b1.f10622e = c2191j;
            if (c2903n.f10770e == 1) {
                r8 = 0;
                m4999b(viewM5032d, -1, false);
            } else {
                r8 = 0;
                m4999b(viewM5032d, 0, false);
            }
            if (this.f2103t == 1) {
                m1223Q0(viewM5032d, AbstractC2888f0.m4988w(this.f2104u, this.f10680l, r8, ((ViewGroup.MarginLayoutParams) c2877b1).width, r8), AbstractC2888f0.m4988w(this.f10683o, this.f10681m, m4993D() + m4996G(), ((ViewGroup.MarginLayoutParams) c2877b1).height, true));
            } else {
                m1223Q0(viewM5032d, AbstractC2888f0.m4988w(this.f10682n, this.f10680l, m4995F() + m4994E(), ((ViewGroup.MarginLayoutParams) c2877b1).width, true), AbstractC2888f0.m4988w(this.f2104u, this.f10681m, 0, ((ViewGroup.MarginLayoutParams) c2877b1).height, false));
            }
            if (c2903n.f10770e == 1) {
                iMo4508c = c2191j.m3980h(iMo4512g);
                iM3982j = this.f2101r.mo4508c(viewM5032d) + iMo4508c;
            } else {
                iM3982j = c2191j.m3982j(iMo4512g);
                iMo4508c = iM3982j - this.f2101r.mo4508c(viewM5032d);
            }
            if (c2903n.f10770e == 1) {
                C2191j c2191j5 = c2877b1.f10622e;
                c2191j5.getClass();
                C2877b1 c2877b12 = (C2877b1) viewM5032d.getLayoutParams();
                c2877b12.f10622e = c2191j5;
                ArrayList arrayList = (ArrayList) c2191j5.f7652f;
                arrayList.add(viewM5032d);
                c2191j5.f7649c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c2191j5.f7648b = Integer.MIN_VALUE;
                }
                if (c2877b12.f10689a.m5068h() || c2877b12.f10689a.m5071k()) {
                    c2191j5.f7650d = ((StaggeredGridLayoutManager) c2191j5.f7653g).f2101r.mo4508c(viewM5032d) + c2191j5.f7650d;
                }
            } else {
                C2191j c2191j6 = c2877b1.f10622e;
                c2191j6.getClass();
                C2877b1 c2877b13 = (C2877b1) viewM5032d.getLayoutParams();
                c2877b13.f10622e = c2191j6;
                ArrayList arrayList2 = (ArrayList) c2191j6.f7652f;
                arrayList2.add(0, viewM5032d);
                c2191j6.f7648b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c2191j6.f7649c = Integer.MIN_VALUE;
                }
                if (c2877b13.f10689a.m5068h() || c2877b13.f10689a.m5071k()) {
                    c2191j6.f7650d = ((StaggeredGridLayoutManager) c2191j6.f7653g).f2101r.mo4508c(viewM5032d) + c2191j6.f7650d;
                }
            }
            if (m1221P0() && this.f2103t == 1) {
                iMo4508c2 = this.f2102s.mo4512g() - (((this.f2099p - 1) - c2191j.f7651e) * this.f2104u);
                iMo4516k = iMo4508c2 - this.f2102s.mo4508c(viewM5032d);
            } else {
                iMo4516k = this.f2102s.mo4516k() + (c2191j.f7651e * this.f2104u);
                iMo4508c2 = this.f2102s.mo4508c(viewM5032d) + iMo4516k;
            }
            if (this.f2103t == 1) {
                AbstractC2888f0.m4986N(viewM5032d, iMo4516k, iMo4508c, iMo4508c2, iM3982j);
            } else {
                AbstractC2888f0.m4986N(viewM5032d, iMo4508c, iMo4516k, iM3982j, iMo4508c2);
            }
            m1234b1(c2191j, c2903n2.f10770e, i11);
            m1227U0(c2900l0, c2903n2);
            if (c2903n2.f10773h && viewM5032d.hasFocusable()) {
                this.f2108y.set(c2191j.f7651e, false);
            }
            i10 = 1;
            z7 = true;
            i9 = 0;
        }
        if (!z7) {
            m1227U0(c2900l0, c2903n2);
        }
        int iMo4516k3 = c2903n2.f10770e == -1 ? this.f2101r.mo4516k() - m1216M0(this.f2101r.mo4516k()) : m1215L0(this.f2101r.mo4512g()) - this.f2101r.mo4512g();
        if (iMo4516k3 > 0) {
            return Math.min(c2903n.f10767b, iMo4516k3);
        }
        return 0;
    }

    /* renamed from: F0 */
    public final View m1209F0(boolean z7) {
        int iMo4516k = this.f2101r.mo4516k();
        int iMo4512g = this.f2101r.mo4512g();
        View view = null;
        for (int iM5010v = m5010v() - 1; iM5010v >= 0; iM5010v--) {
            View viewM5008u = m5008u(iM5010v);
            int iMo4510e = this.f2101r.mo4510e(viewM5008u);
            int iMo4507b = this.f2101r.mo4507b(viewM5008u);
            if (iMo4507b > iMo4516k && iMo4510e < iMo4512g) {
                if (iMo4507b <= iMo4512g || !z7) {
                    return viewM5008u;
                }
                if (view == null) {
                    view = viewM5008u;
                }
            }
        }
        return view;
    }

    /* renamed from: G0 */
    public final View m1210G0(boolean z7) {
        int iMo4516k = this.f2101r.mo4516k();
        int iMo4512g = this.f2101r.mo4512g();
        int iM5010v = m5010v();
        View view = null;
        for (int i = 0; i < iM5010v; i++) {
            View viewM5008u = m5008u(i);
            int iMo4510e = this.f2101r.mo4510e(viewM5008u);
            if (this.f2101r.mo4507b(viewM5008u) > iMo4516k && iMo4510e < iMo4512g) {
                if (iMo4510e >= iMo4516k || !z7) {
                    return viewM5008u;
                }
                if (view == null) {
                    view = viewM5008u;
                }
            }
        }
        return view;
    }

    /* renamed from: H0 */
    public final void m1211H0(C2900l0 c2900l0, C2912r0 c2912r0, boolean z7) {
        int iMo4512g;
        int iM1215L0 = m1215L0(Integer.MIN_VALUE);
        if (iM1215L0 != Integer.MIN_VALUE && (iMo4512g = this.f2101r.mo4512g() - iM1215L0) > 0) {
            int i = iMo4512g - (-m1231Y0(-iMo4512g, c2900l0, c2912r0));
            if (!z7 || i <= 0) {
                return;
            }
            this.f2101r.mo4520o(i);
        }
    }

    /* renamed from: I0 */
    public final void m1212I0(C2900l0 c2900l0, C2912r0 c2912r0, boolean z7) {
        int iMo4516k;
        int iM1216M0 = m1216M0(Integer.MAX_VALUE);
        if (iM1216M0 != Integer.MAX_VALUE && (iMo4516k = iM1216M0 - this.f2101r.mo4516k()) > 0) {
            int iM1231Y0 = iMo4516k - m1231Y0(iMo4516k, c2900l0, c2912r0);
            if (!z7 || iM1231Y0 <= 0) {
                return;
            }
            this.f2101r.mo4520o(-iM1231Y0);
        }
    }

    /* renamed from: J0 */
    public final int m1213J0() {
        if (m5010v() == 0) {
            return 0;
        }
        return AbstractC2888f0.m4983H(m5008u(0));
    }

    /* renamed from: K0 */
    public final int m1214K0() {
        int iM5010v = m5010v();
        if (iM5010v == 0) {
            return 0;
        }
        return AbstractC2888f0.m4983H(m5008u(iM5010v - 1));
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: L */
    public final boolean mo1107L() {
        return this.f2090C != 0;
    }

    /* renamed from: L0 */
    public final int m1215L0(int i) {
        int iM3980h = this.f2100q[0].m3980h(i);
        for (int i4 = 1; i4 < this.f2099p; i4++) {
            int iM3980h2 = this.f2100q[i4].m3980h(i);
            if (iM3980h2 > iM3980h) {
                iM3980h = iM3980h2;
            }
        }
        return iM3980h;
    }

    /* renamed from: M0 */
    public final int m1216M0(int i) {
        int iM3982j = this.f2100q[0].m3982j(i);
        for (int i4 = 1; i4 < this.f2099p; i4++) {
            int iM3982j2 = this.f2100q[i4].m3982j(i);
            if (iM3982j2 < iM3982j) {
                iM3982j = iM3982j2;
            }
        }
        return iM3982j;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1217N0(int i, int i4, int i8) {
        int i9;
        int i10;
        C2332e c2332e;
        int[] iArr;
        ArrayList arrayList;
        C2880c1 c2880c1;
        int size;
        int i11;
        int i12;
        int iM1214K0 = this.f2107x ? m1214K0() : m1213J0();
        if (i8 != 8) {
            i9 = i + i4;
        } else {
            if (i >= i4) {
                i9 = i + 1;
                i10 = i4;
                c2332e = this.f2089B;
                iArr = (int[]) c2332e.f8170k;
                if (iArr != null && i10 < iArr.length) {
                    arrayList = (ArrayList) c2332e.f8171l;
                    if (arrayList != null) {
                        if (arrayList == null) {
                            c2880c1 = null;
                            if (c2880c1 != null) {
                                ((ArrayList) c2332e.f8171l).remove(c2880c1);
                            }
                            size = ((ArrayList) c2332e.f8171l).size();
                            i11 = 0;
                            while (true) {
                                if (i11 < size) {
                                    i11 = -1;
                                    break;
                                } else if (((C2880c1) ((ArrayList) c2332e.f8171l).get(i11)).f10628j >= i10) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            if (i11 == -1) {
                                C2880c1 c2880c12 = (C2880c1) ((ArrayList) c2332e.f8171l).get(i11);
                                ((ArrayList) c2332e.f8171l).remove(i11);
                                i12 = c2880c12.f10628j;
                            } else {
                                i12 = -1;
                            }
                            if (i12 != -1) {
                                int[] iArr2 = (int[]) c2332e.f8170k;
                                Arrays.fill(iArr2, i10, iArr2.length, -1);
                                int length = ((int[]) c2332e.f8170k).length;
                            } else {
                                Arrays.fill((int[]) c2332e.f8170k, i10, Math.min(i12 + 1, ((int[]) c2332e.f8170k).length), -1);
                            }
                        } else {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c2880c1 = (C2880c1) ((ArrayList) c2332e.f8171l).get(size2);
                                if (c2880c1.f10628j == i10) {
                                    break;
                                }
                            }
                            c2880c1 = null;
                            if (c2880c1 != null) {
                            }
                            size = ((ArrayList) c2332e.f8171l).size();
                            i11 = 0;
                            while (true) {
                                if (i11 < size) {
                                }
                                i11++;
                            }
                            if (i11 == -1) {
                            }
                            if (i12 != -1) {
                            }
                        }
                    }
                }
                if (i8 != 1) {
                    c2332e.m4154t(i, i4);
                } else if (i8 == 2) {
                    c2332e.m4155u(i, i4);
                } else if (i8 == 8) {
                    c2332e.m4155u(i, 1);
                    c2332e.m4154t(i4, 1);
                }
                if (i9 > iM1214K0) {
                    return;
                }
                if (i10 <= (this.f2107x ? m1213J0() : m1214K0())) {
                    m5004n0();
                    return;
                }
                return;
            }
            i9 = i4 + 1;
        }
        i10 = i;
        c2332e = this.f2089B;
        iArr = (int[]) c2332e.f8170k;
        if (iArr != null) {
            arrayList = (ArrayList) c2332e.f8171l;
            if (arrayList != null) {
            }
        }
        if (i8 != 1) {
        }
        if (i9 > iM1214K0) {
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: O */
    public final void mo1218O(int i) {
        super.mo1218O(i);
        for (int i4 = 0; i4 < this.f2099p; i4++) {
            C2191j c2191j = this.f2100q[i4];
            int i8 = c2191j.f7648b;
            if (i8 != Integer.MIN_VALUE) {
                c2191j.f7648b = i8 + i;
            }
            int i9 = c2191j.f7649c;
            if (i9 != Integer.MIN_VALUE) {
                c2191j.f7649c = i9 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m1219O0() {
        int iM5010v = m5010v();
        int i = iM5010v - 1;
        BitSet bitSet = new BitSet(this.f2099p);
        bitSet.set(0, this.f2099p, true);
        char c8 = (this.f2103t == 1 && m1221P0()) ? (char) 1 : '\uffff';
        if (this.f2107x) {
            iM5010v = -1;
        } else {
            i = 0;
        }
        int i4 = i < iM5010v ? 1 : -1;
        while (i != iM5010v) {
            View viewM5008u = m5008u(i);
            C2877b1 c2877b1 = (C2877b1) viewM5008u.getLayoutParams();
            if (bitSet.get(c2877b1.f10622e.f7651e)) {
                C2191j c2191j = c2877b1.f10622e;
                if (this.f2107x) {
                    int i8 = c2191j.f7649c;
                    if (i8 == Integer.MIN_VALUE) {
                        c2191j.m3973a();
                        i8 = c2191j.f7649c;
                    }
                    if (i8 < this.f2101r.mo4512g()) {
                        ArrayList arrayList = (ArrayList) c2191j.f7652f;
                        ((C2877b1) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewM5008u;
                    }
                } else {
                    int i9 = c2191j.f7648b;
                    ArrayList arrayList2 = (ArrayList) c2191j.f7652f;
                    if (i9 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        C2877b1 c2877b12 = (C2877b1) view.getLayoutParams();
                        c2191j.f7648b = ((StaggeredGridLayoutManager) c2191j.f7653g).f2101r.mo4510e(view);
                        c2877b12.getClass();
                        i9 = c2191j.f7648b;
                    }
                    if (i9 > this.f2101r.mo4516k()) {
                        ((C2877b1) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return viewM5008u;
                    }
                }
                bitSet.clear(c2877b1.f10622e.f7651e);
            }
            i += i4;
            if (i != iM5010v) {
                View viewM5008u2 = m5008u(i);
                if (this.f2107x) {
                    int iMo4507b = this.f2101r.mo4507b(viewM5008u);
                    int iMo4507b2 = this.f2101r.mo4507b(viewM5008u2);
                    if (iMo4507b < iMo4507b2) {
                        return viewM5008u;
                    }
                    if (iMo4507b == iMo4507b2) {
                        if ((c2877b1.f10622e.f7651e - ((C2877b1) viewM5008u2.getLayoutParams()).f10622e.f7651e >= 0) == (c8 >= 0)) {
                            return viewM5008u;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iMo4510e = this.f2101r.mo4510e(viewM5008u);
                    int iMo4510e2 = this.f2101r.mo4510e(viewM5008u2);
                    if (iMo4510e > iMo4510e2) {
                        return viewM5008u;
                    }
                    if (iMo4510e == iMo4510e2) {
                        if ((c2877b1.f10622e.f7651e - ((C2877b1) viewM5008u2.getLayoutParams()).f10622e.f7651e >= 0) == (c8 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: P */
    public final void mo1220P(int i) {
        super.mo1220P(i);
        for (int i4 = 0; i4 < this.f2099p; i4++) {
            C2191j c2191j = this.f2100q[i4];
            int i8 = c2191j.f7648b;
            if (i8 != Integer.MIN_VALUE) {
                c2191j.f7648b = i8 + i;
            }
            int i9 = c2191j.f7649c;
            if (i9 != Integer.MIN_VALUE) {
                c2191j.f7649c = i9 + i;
            }
        }
    }

    /* renamed from: P0 */
    public final boolean m1221P0() {
        return m4992C() == 1;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: Q */
    public final void mo1222Q() {
        this.f2089B.m4147k();
        for (int i = 0; i < this.f2099p; i++) {
            this.f2100q[i].m3974b();
        }
    }

    /* renamed from: Q0 */
    public final void m1223Q0(View view, int i, int i4) {
        RecyclerView recyclerView = this.f10670b;
        Rect rect = this.f2094G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m1163N(view));
        }
        C2877b1 c2877b1 = (C2877b1) view.getLayoutParams();
        int iM1205c1 = m1205c1(i, ((ViewGroup.MarginLayoutParams) c2877b1).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c2877b1).rightMargin + rect.right);
        int iM1205c12 = m1205c1(i4, ((ViewGroup.MarginLayoutParams) c2877b1).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c2877b1).bottomMargin + rect.bottom);
        if (m5012w0(view, iM1205c1, iM1205c12, c2877b1)) {
            view.measure(iM1205c1, iM1205c12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0419  */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1224R0(C2900l0 c2900l0, C2912r0 c2912r0, boolean z7) {
        C2883d1 c2883d1;
        int iM4983H;
        int i;
        boolean z8;
        C2883d1 c2883d12 = this.f2093F;
        C2874a1 c2874a1 = this.f2095H;
        if (!(c2883d12 == null && this.f2109z == -1) && c2912r0.m5052b() == 0) {
            m5000i0(c2900l0);
            c2874a1.m4970a();
            return;
        }
        boolean z9 = c2874a1.f10610e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c2874a1.f10612g;
        boolean z10 = true;
        boolean z11 = (z9 && this.f2109z == -1 && this.f2093F == null) ? false : true;
        C2332e c2332e = this.f2089B;
        if (z11) {
            c2874a1.m4970a();
            C2883d1 c2883d13 = this.f2093F;
            if (c2883d13 != null) {
                int i4 = c2883d13.f10642l;
                if (i4 > 0) {
                    if (i4 == this.f2099p) {
                        for (int i8 = 0; i8 < this.f2099p; i8++) {
                            this.f2100q[i8].m3974b();
                            C2883d1 c2883d14 = this.f2093F;
                            int iMo4512g = c2883d14.f10643m[i8];
                            if (iMo4512g != Integer.MIN_VALUE) {
                                iMo4512g += c2883d14.f10648r ? this.f2101r.mo4512g() : this.f2101r.mo4516k();
                            }
                            C2191j c2191j = this.f2100q[i8];
                            c2191j.f7648b = iMo4512g;
                            c2191j.f7649c = iMo4512g;
                        }
                    } else {
                        c2883d13.f10643m = null;
                        c2883d13.f10642l = 0;
                        c2883d13.f10644n = 0;
                        c2883d13.f10645o = null;
                        c2883d13.f10646p = null;
                        c2883d13.f10640j = c2883d13.f10641k;
                    }
                }
                C2883d1 c2883d15 = this.f2093F;
                this.f2092E = c2883d15.f10649s;
                boolean z12 = c2883d15.f10647q;
                mo1125c(null);
                C2883d1 c2883d16 = this.f2093F;
                if (c2883d16 != null && c2883d16.f10647q != z12) {
                    c2883d16.f10647q = z12;
                }
                this.f2106w = z12;
                m5004n0();
                m1230X0();
                C2883d1 c2883d17 = this.f2093F;
                int i9 = c2883d17.f10640j;
                if (i9 != -1) {
                    this.f2109z = i9;
                    c2874a1.f10608c = c2883d17.f10648r;
                } else {
                    c2874a1.f10608c = this.f2107x;
                }
                if (c2883d17.f10644n > 1) {
                    c2332e.f8170k = c2883d17.f10645o;
                    c2332e.f8171l = c2883d17.f10646p;
                }
            } else {
                m1230X0();
                c2874a1.f10608c = this.f2107x;
            }
            if (c2912r0.f10825g || (i = this.f2109z) == -1) {
                if (this.f2091D) {
                    int iM5052b = c2912r0.m5052b();
                    int iM5010v = m5010v();
                    for (int i10 = 0; i10 < iM5010v; i10++) {
                        int iM4983H2 = AbstractC2888f0.m4983H(m5008u(i10));
                        if (iM4983H2 >= 0 && iM4983H2 < iM5052b) {
                            iM4983H = iM4983H2;
                            break;
                        }
                    }
                    iM4983H = 0;
                    c2874a1.f10606a = iM4983H;
                    c2874a1.f10607b = Integer.MIN_VALUE;
                    c2874a1.f10610e = true;
                } else {
                    int iM5052b2 = c2912r0.m5052b();
                    for (int iM5010v2 = m5010v() - 1; iM5010v2 >= 0; iM5010v2--) {
                        iM4983H = AbstractC2888f0.m4983H(m5008u(iM5010v2));
                        if (iM4983H >= 0 && iM4983H < iM5052b2) {
                            break;
                        }
                    }
                    iM4983H = 0;
                    c2874a1.f10606a = iM4983H;
                    c2874a1.f10607b = Integer.MIN_VALUE;
                    c2874a1.f10610e = true;
                }
            } else if (i < 0 || i >= c2912r0.m5052b()) {
                this.f2109z = -1;
                this.f2088A = Integer.MIN_VALUE;
                if (this.f2091D) {
                }
            } else {
                C2883d1 c2883d18 = this.f2093F;
                if (c2883d18 == null || c2883d18.f10640j == -1 || c2883d18.f10642l < 1) {
                    View viewMo1139q = mo1139q(this.f2109z);
                    if (viewMo1139q != null) {
                        c2874a1.f10606a = this.f2107x ? m1214K0() : m1213J0();
                        if (this.f2088A != Integer.MIN_VALUE) {
                            if (c2874a1.f10608c) {
                                c2874a1.f10607b = (this.f2101r.mo4512g() - this.f2088A) - this.f2101r.mo4507b(viewMo1139q);
                            } else {
                                c2874a1.f10607b = (this.f2101r.mo4516k() + this.f2088A) - this.f2101r.mo4510e(viewMo1139q);
                            }
                        } else if (this.f2101r.mo4508c(viewMo1139q) > this.f2101r.mo4517l()) {
                            c2874a1.f10607b = c2874a1.f10608c ? this.f2101r.mo4512g() : this.f2101r.mo4516k();
                        } else {
                            int iMo4510e = this.f2101r.mo4510e(viewMo1139q) - this.f2101r.mo4516k();
                            if (iMo4510e < 0) {
                                c2874a1.f10607b = -iMo4510e;
                            } else {
                                int iMo4512g2 = this.f2101r.mo4512g() - this.f2101r.mo4507b(viewMo1139q);
                                if (iMo4512g2 < 0) {
                                    c2874a1.f10607b = iMo4512g2;
                                } else {
                                    c2874a1.f10607b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i11 = this.f2109z;
                        c2874a1.f10606a = i11;
                        int i12 = this.f2088A;
                        if (i12 == Integer.MIN_VALUE) {
                            if (m5010v() == 0) {
                                z8 = this.f2107x;
                            } else if ((i11 < m1213J0()) != this.f2107x) {
                            }
                            c2874a1.f10608c = z8;
                            c2874a1.f10607b = z8 ? staggeredGridLayoutManager.f2101r.mo4512g() : staggeredGridLayoutManager.f2101r.mo4516k();
                        } else if (c2874a1.f10608c) {
                            c2874a1.f10607b = staggeredGridLayoutManager.f2101r.mo4512g() - i12;
                        } else {
                            c2874a1.f10607b = staggeredGridLayoutManager.f2101r.mo4516k() + i12;
                        }
                        c2874a1.f10609d = true;
                    }
                } else {
                    c2874a1.f10607b = Integer.MIN_VALUE;
                    c2874a1.f10606a = this.f2109z;
                }
                c2874a1.f10610e = true;
            }
        }
        if (this.f2093F == null && this.f2109z == -1 && (c2874a1.f10608c != this.f2091D || m1221P0() != this.f2092E)) {
            c2332e.m4147k();
            c2874a1.f10609d = true;
        }
        if (m5010v() > 0 && ((c2883d1 = this.f2093F) == null || c2883d1.f10642l < 1)) {
            if (c2874a1.f10609d) {
                for (int i13 = 0; i13 < this.f2099p; i13++) {
                    this.f2100q[i13].m3974b();
                    int i14 = c2874a1.f10607b;
                    if (i14 != Integer.MIN_VALUE) {
                        C2191j c2191j2 = this.f2100q[i13];
                        c2191j2.f7648b = i14;
                        c2191j2.f7649c = i14;
                    }
                }
            } else if (z11 || c2874a1.f10611f == null) {
                for (int i15 = 0; i15 < this.f2099p; i15++) {
                    C2191j c2191j3 = this.f2100q[i15];
                    boolean z13 = this.f2107x;
                    int i16 = c2874a1.f10607b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) c2191j3.f7653g;
                    int iM3980h = z13 ? c2191j3.m3980h(Integer.MIN_VALUE) : c2191j3.m3982j(Integer.MIN_VALUE);
                    c2191j3.m3974b();
                    if (iM3980h != Integer.MIN_VALUE && ((!z13 || iM3980h >= staggeredGridLayoutManager2.f2101r.mo4512g()) && (z13 || iM3980h <= staggeredGridLayoutManager2.f2101r.mo4516k()))) {
                        if (i16 != Integer.MIN_VALUE) {
                            iM3980h += i16;
                        }
                        c2191j3.f7649c = iM3980h;
                        c2191j3.f7648b = iM3980h;
                    }
                }
                C2191j[] c2191jArr = this.f2100q;
                int length = c2191jArr.length;
                int[] iArr = c2874a1.f10611f;
                if (iArr == null || iArr.length < length) {
                    c2874a1.f10611f = new int[staggeredGridLayoutManager.f2100q.length];
                }
                for (int i17 = 0; i17 < length; i17++) {
                    c2874a1.f10611f[i17] = c2191jArr[i17].m3982j(Integer.MIN_VALUE);
                }
            } else {
                for (int i18 = 0; i18 < this.f2099p; i18++) {
                    C2191j c2191j4 = this.f2100q[i18];
                    c2191j4.m3974b();
                    int i19 = c2874a1.f10611f[i18];
                    c2191j4.f7648b = i19;
                    c2191j4.f7649c = i19;
                }
            }
        }
        m5005p(c2900l0);
        C2903n c2903n = this.f2105v;
        c2903n.f10766a = false;
        int iMo4517l = this.f2102s.mo4517l();
        this.f2104u = iMo4517l / this.f2099p;
        View.MeasureSpec.makeMeasureSpec(iMo4517l, this.f2102s.mo4514i());
        m1233a1(c2874a1.f10606a, c2912r0);
        if (c2874a1.f10608c) {
            m1232Z0(-1);
            m1208E0(c2900l0, c2903n, c2912r0);
            m1232Z0(1);
            c2903n.f10768c = c2874a1.f10606a + c2903n.f10769d;
            m1208E0(c2900l0, c2903n, c2912r0);
        } else {
            m1232Z0(1);
            m1208E0(c2900l0, c2903n, c2912r0);
            m1232Z0(-1);
            c2903n.f10768c = c2874a1.f10606a + c2903n.f10769d;
            m1208E0(c2900l0, c2903n, c2912r0);
        }
        if (this.f2102s.mo4514i() != 1073741824) {
            int iM5010v3 = m5010v();
            float fMax = 0.0f;
            for (int i20 = 0; i20 < iM5010v3; i20++) {
                View viewM5008u = m5008u(i20);
                float fMo4508c = this.f2102s.mo4508c(viewM5008u);
                if (fMo4508c >= fMax) {
                    ((C2877b1) viewM5008u.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo4508c);
                }
            }
            int i21 = this.f2104u;
            int iRound = Math.round(fMax * this.f2099p);
            if (this.f2102s.mo4514i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f2102s.mo4517l());
            }
            this.f2104u = iRound / this.f2099p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f2102s.mo4514i());
            if (this.f2104u != i21) {
                for (int i22 = 0; i22 < iM5010v3; i22++) {
                    View viewM5008u2 = m5008u(i22);
                    C2877b1 c2877b1 = (C2877b1) viewM5008u2.getLayoutParams();
                    c2877b1.getClass();
                    if (m1221P0() && this.f2103t == 1) {
                        int i23 = -((this.f2099p - 1) - c2877b1.f10622e.f7651e);
                        viewM5008u2.offsetLeftAndRight((this.f2104u * i23) - (i23 * i21));
                    } else {
                        int i24 = c2877b1.f10622e.f7651e;
                        int i25 = this.f2104u * i24;
                        int i26 = i24 * i21;
                        if (this.f2103t == 1) {
                            viewM5008u2.offsetLeftAndRight(i25 - i26);
                        } else {
                            viewM5008u2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (m5010v() > 0) {
            if (this.f2107x) {
                m1211H0(c2900l0, c2912r0, true);
                m1212I0(c2900l0, c2912r0, false);
            } else {
                m1212I0(c2900l0, c2912r0, true);
                m1211H0(c2900l0, c2912r0, false);
            }
        }
        if (!z7 || c2912r0.f10825g || this.f2090C == 0 || m5010v() <= 0 || m1219O0() == null) {
            z10 = false;
        } else {
            RecyclerView recyclerView = this.f10670b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f2098K);
            }
            if (!m1206C0()) {
            }
        }
        if (c2912r0.f10825g) {
            c2874a1.m4970a();
        }
        this.f2091D = c2874a1.f10608c;
        this.f2092E = m1221P0();
        if (z10) {
            c2874a1.m4970a();
            m1224R0(c2900l0, c2912r0, false);
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: S */
    public final void mo1114S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10670b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2098K);
        }
        for (int i = 0; i < this.f2099p; i++) {
            this.f2100q[i].m3974b();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: S0 */
    public final boolean m1225S0(int i) {
        if (this.f2103t == 0) {
            return (i == -1) != this.f2107x;
        }
        return ((i == -1) == this.f2107x) == m1221P0();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // p216z2.AbstractC2888f0
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1065T(View view, int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        View viewM1156D;
        int i4;
        if (m5010v() != 0) {
            RecyclerView recyclerView = this.f10670b;
            if (recyclerView == null || (viewM1156D = recyclerView.m1156D(view)) == null || ((ArrayList) this.f10669a.f5232n).contains(viewM1156D)) {
                viewM1156D = null;
            }
            if (viewM1156D != null) {
                m1230X0();
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? this.f2103t == 0 : !(i != 130 || this.f2103t != 1)) {
                                    i4 = 1;
                                }
                            } else if (this.f2103t == 1) {
                                i4 = -1;
                            }
                            i4 = Integer.MIN_VALUE;
                        } else if (this.f2103t != 0) {
                            i4 = Integer.MIN_VALUE;
                        }
                    } else if (this.f2103t != 1 && m1221P0()) {
                    }
                } else if (this.f2103t != 1 && m1221P0()) {
                }
                if (i4 != Integer.MIN_VALUE) {
                    C2877b1 c2877b1 = (C2877b1) viewM1156D.getLayoutParams();
                    c2877b1.getClass();
                    C2191j c2191j = c2877b1.f10622e;
                    int iM1214K0 = i4 == 1 ? m1214K0() : m1213J0();
                    m1233a1(iM1214K0, c2912r0);
                    m1232Z0(i4);
                    C2903n c2903n = this.f2105v;
                    c2903n.f10768c = c2903n.f10769d + iM1214K0;
                    c2903n.f10767b = (int) (this.f2101r.mo4517l() * 0.33333334f);
                    c2903n.f10773h = true;
                    c2903n.f10766a = false;
                    m1208E0(c2900l0, c2903n, c2912r0);
                    this.f2091D = this.f2107x;
                    View viewM3981i = c2191j.m3981i(iM1214K0, i4);
                    if (viewM3981i != null && viewM3981i != viewM1156D) {
                        return viewM3981i;
                    }
                    if (m1225S0(i4)) {
                        for (int i8 = this.f2099p - 1; i8 >= 0; i8--) {
                            View viewM3981i2 = this.f2100q[i8].m3981i(iM1214K0, i4);
                            if (viewM3981i2 != null && viewM3981i2 != viewM1156D) {
                                return viewM3981i2;
                            }
                        }
                    } else {
                        for (int i9 = 0; i9 < this.f2099p; i9++) {
                            View viewM3981i3 = this.f2100q[i9].m3981i(iM1214K0, i4);
                            if (viewM3981i3 != null && viewM3981i3 != viewM1156D) {
                                return viewM3981i3;
                            }
                        }
                    }
                    boolean z7 = (this.f2106w ^ true) == (i4 == -1);
                    View viewMo1139q = mo1139q(z7 ? c2191j.m3976d() : c2191j.m3977e());
                    if (viewMo1139q != null && viewMo1139q != viewM1156D) {
                        return viewMo1139q;
                    }
                    if (m1225S0(i4)) {
                        for (int i10 = this.f2099p - 1; i10 >= 0; i10--) {
                            if (i10 != c2191j.f7651e) {
                                View viewMo1139q2 = mo1139q(z7 ? this.f2100q[i10].m3976d() : this.f2100q[i10].m3977e());
                                if (viewMo1139q2 != null && viewMo1139q2 != viewM1156D) {
                                    return viewMo1139q2;
                                }
                            }
                        }
                    } else {
                        for (int i11 = 0; i11 < this.f2099p; i11++) {
                            View viewMo1139q3 = mo1139q(z7 ? this.f2100q[i11].m3976d() : this.f2100q[i11].m3977e());
                            if (viewMo1139q3 != null && viewMo1139q3 != viewM1156D) {
                                return viewMo1139q3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: T0 */
    public final void m1226T0(int i, C2912r0 c2912r0) {
        int iM1213J0;
        int i4;
        if (i > 0) {
            iM1213J0 = m1214K0();
            i4 = 1;
        } else {
            iM1213J0 = m1213J0();
            i4 = -1;
        }
        C2903n c2903n = this.f2105v;
        c2903n.f10766a = true;
        m1233a1(iM1213J0, c2912r0);
        m1232Z0(i4);
        c2903n.f10768c = iM1213J0 + c2903n.f10769d;
        c2903n.f10767b = Math.abs(i);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: U */
    public final void mo1117U(AccessibilityEvent accessibilityEvent) {
        super.mo1117U(accessibilityEvent);
        if (m5010v() > 0) {
            View viewM1210G0 = m1210G0(false);
            View viewM1209F0 = m1209F0(false);
            if (viewM1210G0 == null || viewM1209F0 == null) {
                return;
            }
            int iM4983H = AbstractC2888f0.m4983H(viewM1210G0);
            int iM4983H2 = AbstractC2888f0.m4983H(viewM1209F0);
            if (iM4983H < iM4983H2) {
                accessibilityEvent.setFromIndex(iM4983H);
                accessibilityEvent.setToIndex(iM4983H2);
            } else {
                accessibilityEvent.setFromIndex(iM4983H2);
                accessibilityEvent.setToIndex(iM4983H);
            }
        }
    }

    /* renamed from: U0 */
    public final void m1227U0(C2900l0 c2900l0, C2903n c2903n) {
        if (!c2903n.f10766a || c2903n.f10774i) {
            return;
        }
        if (c2903n.f10767b == 0) {
            if (c2903n.f10770e == -1) {
                m1228V0(c2900l0, c2903n.f10772g);
                return;
            } else {
                m1229W0(c2900l0, c2903n.f10771f);
                return;
            }
        }
        int i = 1;
        if (c2903n.f10770e == -1) {
            int i4 = c2903n.f10771f;
            int iM3982j = this.f2100q[0].m3982j(i4);
            while (i < this.f2099p) {
                int iM3982j2 = this.f2100q[i].m3982j(i4);
                if (iM3982j2 > iM3982j) {
                    iM3982j = iM3982j2;
                }
                i++;
            }
            int i8 = i4 - iM3982j;
            m1228V0(c2900l0, i8 < 0 ? c2903n.f10772g : c2903n.f10772g - Math.min(i8, c2903n.f10767b));
            return;
        }
        int i9 = c2903n.f10772g;
        int iM3980h = this.f2100q[0].m3980h(i9);
        while (i < this.f2099p) {
            int iM3980h2 = this.f2100q[i].m3980h(i9);
            if (iM3980h2 < iM3980h) {
                iM3980h = iM3980h2;
            }
            i++;
        }
        int i10 = iM3980h - c2903n.f10772g;
        m1229W0(c2900l0, i10 < 0 ? c2903n.f10771f : Math.min(i10, c2903n.f10767b) + c2903n.f10771f);
    }

    /* renamed from: V0 */
    public final void m1228V0(C2900l0 c2900l0, int i) {
        for (int iM5010v = m5010v() - 1; iM5010v >= 0; iM5010v--) {
            View viewM5008u = m5008u(iM5010v);
            if (this.f2101r.mo4510e(viewM5008u) < i || this.f2101r.mo4519n(viewM5008u) < i) {
                return;
            }
            C2877b1 c2877b1 = (C2877b1) viewM5008u.getLayoutParams();
            c2877b1.getClass();
            if (((ArrayList) c2877b1.f10622e.f7652f).size() == 1) {
                return;
            }
            C2191j c2191j = c2877b1.f10622e;
            ArrayList arrayList = (ArrayList) c2191j.f7652f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C2877b1 c2877b12 = (C2877b1) view.getLayoutParams();
            c2877b12.f10622e = null;
            if (c2877b12.f10689a.m5068h() || c2877b12.f10689a.m5071k()) {
                c2191j.f7650d -= ((StaggeredGridLayoutManager) c2191j.f7653g).f2101r.mo4508c(view);
            }
            if (size == 1) {
                c2191j.f7648b = Integer.MIN_VALUE;
            }
            c2191j.f7649c = Integer.MIN_VALUE;
            m5002k0(viewM5008u, c2900l0);
        }
    }

    /* renamed from: W0 */
    public final void m1229W0(C2900l0 c2900l0, int i) {
        while (m5010v() > 0) {
            View viewM5008u = m5008u(0);
            if (this.f2101r.mo4507b(viewM5008u) > i || this.f2101r.mo4518m(viewM5008u) > i) {
                return;
            }
            C2877b1 c2877b1 = (C2877b1) viewM5008u.getLayoutParams();
            c2877b1.getClass();
            if (((ArrayList) c2877b1.f10622e.f7652f).size() == 1) {
                return;
            }
            C2191j c2191j = c2877b1.f10622e;
            ArrayList arrayList = (ArrayList) c2191j.f7652f;
            View view = (View) arrayList.remove(0);
            C2877b1 c2877b12 = (C2877b1) view.getLayoutParams();
            c2877b12.f10622e = null;
            if (arrayList.size() == 0) {
                c2191j.f7649c = Integer.MIN_VALUE;
            }
            if (c2877b12.f10689a.m5068h() || c2877b12.f10689a.m5071k()) {
                c2191j.f7650d -= ((StaggeredGridLayoutManager) c2191j.f7653g).f2101r.mo4508c(view);
            }
            c2191j.f7648b = Integer.MIN_VALUE;
            m5002k0(viewM5008u, c2900l0);
        }
    }

    /* renamed from: X0 */
    public final void m1230X0() {
        if (this.f2103t == 1 || !m1221P0()) {
            this.f2107x = this.f2106w;
        } else {
            this.f2107x = !this.f2106w;
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: Y */
    public final void mo1070Y(int i, int i4) {
        m1217N0(i, i4, 1);
    }

    /* renamed from: Y0 */
    public final int m1231Y0(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        if (m5010v() == 0 || i == 0) {
            return 0;
        }
        m1226T0(i, c2912r0);
        C2903n c2903n = this.f2105v;
        int iM1208E0 = m1208E0(c2900l0, c2903n, c2912r0);
        if (c2903n.f10767b >= iM1208E0) {
            i = i < 0 ? -iM1208E0 : iM1208E0;
        }
        this.f2101r.mo4520o(-i);
        this.f2091D = this.f2107x;
        c2903n.f10767b = 0;
        m1227U0(c2900l0, c2903n);
        return i;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: Z */
    public final void mo1071Z() {
        this.f2089B.m4147k();
        m5004n0();
    }

    /* renamed from: Z0 */
    public final void m1232Z0(int i) {
        C2903n c2903n = this.f2105v;
        c2903n.f10770e = i;
        c2903n.f10769d = this.f2107x != (i == -1) ? -1 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // p216z2.InterfaceC2910q0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF mo1122a(int i) {
        int i4 = -1;
        if (m5010v() != 0) {
            if ((i < m1213J0()) == this.f2107x) {
            }
        } else if (this.f2107x) {
            i4 = 1;
        }
        PointF pointF = new PointF();
        if (i4 == 0) {
            return null;
        }
        if (this.f2103t == 0) {
            pointF.x = i4;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i4;
        return pointF;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: a0 */
    public final void mo1072a0(int i, int i4) {
        m1217N0(i, i4, 8);
    }

    /* renamed from: a1 */
    public final void m1233a1(int i, C2912r0 c2912r0) {
        int iMo4517l;
        int iMo4517l2;
        int i4;
        C2903n c2903n = this.f2105v;
        boolean z7 = false;
        c2903n.f10767b = 0;
        c2903n.f10768c = i;
        C2911r c2911r = this.f10673e;
        if (c2911r == null || !c2911r.f10807e || (i4 = c2912r0.f10819a) == -1) {
            iMo4517l = 0;
            iMo4517l2 = 0;
        } else {
            if (this.f2107x == (i4 < i)) {
                iMo4517l = this.f2101r.mo4517l();
                iMo4517l2 = 0;
            } else {
                iMo4517l2 = this.f2101r.mo4517l();
                iMo4517l = 0;
            }
        }
        RecyclerView recyclerView = this.f10670b;
        if (recyclerView == null || !recyclerView.f2068q) {
            c2903n.f10772g = this.f2101r.mo4511f() + iMo4517l;
            c2903n.f10771f = -iMo4517l2;
        } else {
            c2903n.f10771f = this.f2101r.mo4516k() - iMo4517l2;
            c2903n.f10772g = this.f2101r.mo4512g() + iMo4517l;
        }
        c2903n.f10773h = false;
        c2903n.f10766a = true;
        if (this.f2101r.mo4514i() == 0 && this.f2101r.mo4511f() == 0) {
            z7 = true;
        }
        c2903n.f10774i = z7;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: b0 */
    public final void mo1073b0(int i, int i4) {
        m1217N0(i, i4, 2);
    }

    /* renamed from: b1 */
    public final void m1234b1(C2191j c2191j, int i, int i4) {
        int i8 = c2191j.f7650d;
        int i9 = c2191j.f7651e;
        if (i != -1) {
            int i10 = c2191j.f7649c;
            if (i10 == Integer.MIN_VALUE) {
                c2191j.m3973a();
                i10 = c2191j.f7649c;
            }
            if (i10 - i8 >= i4) {
                this.f2108y.set(i9, false);
                return;
            }
            return;
        }
        int i11 = c2191j.f7648b;
        if (i11 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) c2191j.f7652f).get(0);
            C2877b1 c2877b1 = (C2877b1) view.getLayoutParams();
            c2191j.f7648b = ((StaggeredGridLayoutManager) c2191j.f7653g).f2101r.mo4510e(view);
            c2877b1.getClass();
            i11 = c2191j.f7648b;
        }
        if (i11 + i8 <= i4) {
            this.f2108y.set(i9, false);
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: c */
    public final void mo1125c(String str) {
        if (this.f2093F == null) {
            super.mo1125c(str);
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: c0 */
    public final void mo1074c0(int i, int i4) {
        m1217N0(i, i4, 4);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: d */
    public final boolean mo1127d() {
        return this.f2103t == 0;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: d0 */
    public final void mo1075d0(C2900l0 c2900l0, C2912r0 c2912r0) {
        m1224R0(c2900l0, c2912r0, true);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: e */
    public final boolean mo1128e() {
        return this.f2103t == 1;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: e0 */
    public final void mo1077e0(C2912r0 c2912r0) {
        this.f2109z = -1;
        this.f2088A = Integer.MIN_VALUE;
        this.f2093F = null;
        this.f2095H.m4970a();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: f */
    public final boolean mo1078f(C2890g0 c2890g0) {
        return c2890g0 instanceof C2877b1;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: f0 */
    public final void mo1130f0(Parcelable parcelable) {
        if (parcelable instanceof C2883d1) {
            C2883d1 c2883d1 = (C2883d1) parcelable;
            this.f2093F = c2883d1;
            if (this.f2109z != -1) {
                c2883d1.f10640j = -1;
                c2883d1.f10641k = -1;
                c2883d1.f10643m = null;
                c2883d1.f10642l = 0;
                c2883d1.f10644n = 0;
                c2883d1.f10645o = null;
                c2883d1.f10646p = null;
            }
            m5004n0();
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: g0 */
    public final Parcelable mo1132g0() {
        int iM3982j;
        int iMo4516k;
        int[] iArr;
        C2883d1 c2883d1 = this.f2093F;
        if (c2883d1 != null) {
            C2883d1 c2883d12 = new C2883d1();
            c2883d12.f10642l = c2883d1.f10642l;
            c2883d12.f10640j = c2883d1.f10640j;
            c2883d12.f10641k = c2883d1.f10641k;
            c2883d12.f10643m = c2883d1.f10643m;
            c2883d12.f10644n = c2883d1.f10644n;
            c2883d12.f10645o = c2883d1.f10645o;
            c2883d12.f10647q = c2883d1.f10647q;
            c2883d12.f10648r = c2883d1.f10648r;
            c2883d12.f10649s = c2883d1.f10649s;
            c2883d12.f10646p = c2883d1.f10646p;
            return c2883d12;
        }
        C2883d1 c2883d13 = new C2883d1();
        c2883d13.f10647q = this.f2106w;
        c2883d13.f10648r = this.f2091D;
        c2883d13.f10649s = this.f2092E;
        C2332e c2332e = this.f2089B;
        if (c2332e == null || (iArr = (int[]) c2332e.f8170k) == null) {
            c2883d13.f10644n = 0;
        } else {
            c2883d13.f10645o = iArr;
            c2883d13.f10644n = iArr.length;
            c2883d13.f10646p = (ArrayList) c2332e.f8171l;
        }
        if (m5010v() <= 0) {
            c2883d13.f10640j = -1;
            c2883d13.f10641k = -1;
            c2883d13.f10642l = 0;
            return c2883d13;
        }
        c2883d13.f10640j = this.f2091D ? m1214K0() : m1213J0();
        View viewM1209F0 = this.f2107x ? m1209F0(true) : m1210G0(true);
        c2883d13.f10641k = viewM1209F0 != null ? AbstractC2888f0.m4983H(viewM1209F0) : -1;
        int i = this.f2099p;
        c2883d13.f10642l = i;
        c2883d13.f10643m = new int[i];
        for (int i4 = 0; i4 < this.f2099p; i4++) {
            if (this.f2091D) {
                iM3982j = this.f2100q[i4].m3980h(Integer.MIN_VALUE);
                if (iM3982j != Integer.MIN_VALUE) {
                    iMo4516k = this.f2101r.mo4512g();
                    iM3982j -= iMo4516k;
                }
            } else {
                iM3982j = this.f2100q[i4].m3982j(Integer.MIN_VALUE);
                if (iM3982j != Integer.MIN_VALUE) {
                    iMo4516k = this.f2101r.mo4516k();
                    iM3982j -= iMo4516k;
                }
            }
            c2883d13.f10643m[i4] = iM3982j;
        }
        return c2883d13;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: h */
    public final void mo1134h(int i, int i4, C2912r0 c2912r0, C1131v c1131v) {
        C2903n c2903n;
        int iM3980h;
        int iM3982j;
        if (this.f2103t != 0) {
            i = i4;
        }
        if (m5010v() == 0 || i == 0) {
            return;
        }
        m1226T0(i, c2912r0);
        int[] iArr = this.f2097J;
        if (iArr == null || iArr.length < this.f2099p) {
            this.f2097J = new int[this.f2099p];
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = this.f2099p;
            c2903n = this.f2105v;
            if (i8 >= i10) {
                break;
            }
            if (c2903n.f10769d == -1) {
                iM3980h = c2903n.f10771f;
                iM3982j = this.f2100q[i8].m3982j(iM3980h);
            } else {
                iM3980h = this.f2100q[i8].m3980h(c2903n.f10772g);
                iM3982j = c2903n.f10772g;
            }
            int i11 = iM3980h - iM3982j;
            if (i11 >= 0) {
                this.f2097J[i9] = i11;
                i9++;
            }
            i8++;
        }
        Arrays.sort(this.f2097J, 0, i9);
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = c2903n.f10768c;
            if (i13 < 0 || i13 >= c2912r0.m5052b()) {
                return;
            }
            c1131v.m2484a(c2903n.f10768c, this.f2097J[i12]);
            c2903n.f10768c += c2903n.f10769d;
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: h0 */
    public final void mo1235h0(int i) {
        if (i == 0) {
            m1206C0();
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: j */
    public final int mo1136j(C2912r0 c2912r0) {
        if (m5010v() == 0) {
            return 0;
        }
        boolean z7 = !this.f2096I;
        return AbstractC2415i0.m4263d(c2912r0, this.f2101r, m1210G0(z7), m1209F0(z7), this, this.f2096I);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: k */
    public final int mo1082k(C2912r0 c2912r0) {
        return m1207D0(c2912r0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: l */
    public final int mo1084l(C2912r0 c2912r0) {
        if (m5010v() == 0) {
            return 0;
        }
        boolean z7 = !this.f2096I;
        return AbstractC2415i0.m4265f(c2912r0, this.f2101r, m1210G0(z7), m1209F0(z7), this, this.f2096I);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: m */
    public final int mo1137m(C2912r0 c2912r0) {
        if (m5010v() == 0) {
            return 0;
        }
        boolean z7 = !this.f2096I;
        return AbstractC2415i0.m4263d(c2912r0, this.f2101r, m1210G0(z7), m1209F0(z7), this, this.f2096I);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: n */
    public final int mo1087n(C2912r0 c2912r0) {
        return m1207D0(c2912r0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: o */
    public final int mo1089o(C2912r0 c2912r0) {
        if (m5010v() == 0) {
            return 0;
        }
        boolean z7 = !this.f2096I;
        return AbstractC2415i0.m4265f(c2912r0, this.f2101r, m1210G0(z7), m1209F0(z7), this, this.f2096I);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: o0 */
    public final int mo1090o0(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        return m1231Y0(i, c2900l0, c2912r0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: p0 */
    public final void mo1138p0(int i) {
        C2883d1 c2883d1 = this.f2093F;
        if (c2883d1 != null && c2883d1.f10640j != i) {
            c2883d1.f10643m = null;
            c2883d1.f10642l = 0;
            c2883d1.f10640j = -1;
            c2883d1.f10641k = -1;
        }
        this.f2109z = i;
        this.f2088A = Integer.MIN_VALUE;
        m5004n0();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: q0 */
    public final int mo1093q0(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        return m1231Y0(i, c2900l0, c2912r0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: r */
    public final C2890g0 mo1094r() {
        return this.f2103t == 0 ? new C2877b1(-2, -1) : new C2877b1(-1, -2);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: s */
    public final C2890g0 mo1095s(Context context, AttributeSet attributeSet) {
        return new C2877b1(context, attributeSet);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: t */
    public final C2890g0 mo1096t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2877b1((ViewGroup.MarginLayoutParams) layoutParams) : new C2877b1(layoutParams);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: t0 */
    public final void mo1097t0(Rect rect, int i, int i4) {
        int iM4987g;
        int iM4987g2;
        int iM4995F = m4995F() + m4994E();
        int iM4993D = m4993D() + m4996G();
        int i8 = this.f2103t;
        int i9 = this.f2099p;
        if (i8 == 1) {
            int iHeight = rect.height() + iM4993D;
            RecyclerView recyclerView = this.f10670b;
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            iM4987g2 = AbstractC2888f0.m4987g(i4, iHeight, recyclerView.getMinimumHeight());
            iM4987g = AbstractC2888f0.m4987g(i, (this.f2104u * i9) + iM4995F, this.f10670b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM4995F;
            RecyclerView recyclerView2 = this.f10670b;
            WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
            iM4987g = AbstractC2888f0.m4987g(i, iWidth, recyclerView2.getMinimumWidth());
            iM4987g2 = AbstractC2888f0.m4987g(i4, (this.f2104u * i9) + iM4993D, this.f10670b.getMinimumHeight());
        }
        this.f10670b.setMeasuredDimension(iM4987g, iM4987g2);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: z0 */
    public final void mo1141z0(RecyclerView recyclerView, int i) {
        C2911r c2911r = new C2911r(recyclerView.getContext());
        c2911r.f10803a = i;
        m4990A0(c2911r);
    }
}
