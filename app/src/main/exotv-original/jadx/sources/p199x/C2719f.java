package p199x;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p156s.AbstractC2334g;
import p174u.AbstractC2448j;
import p174u.C2441c;
import p174u.C2442d;
import p174u.C2443e;
import p174u.C2445g;
import p182v.C2487b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x.f */
/* loaded from: classes.dex */
public final class C2719f {

    /* renamed from: a */
    public final ConstraintLayout f9955a;

    /* renamed from: b */
    public int f9956b;

    /* renamed from: c */
    public int f9957c;

    /* renamed from: d */
    public int f9958d;

    /* renamed from: e */
    public int f9959e;

    /* renamed from: f */
    public int f9960f;

    /* renamed from: g */
    public int f9961g;

    /* renamed from: h */
    public final /* synthetic */ ConstraintLayout f9962h;

    public C2719f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f9962h = constraintLayout;
        this.f9955a = constraintLayout2;
    }

    /* renamed from: a */
    public static boolean m4785a(int i, int i4, int i8) {
        if (i == i4) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i8 == size;
        }
        return false;
    }

    /* renamed from: b */
    public final void m4786b(C2442d c2442d, C2487b c2487b) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z7;
        int measuredWidth;
        int baseline;
        int i;
        if (c2442d == null) {
            return;
        }
        C2441c c2441c = c2442d.f8830K;
        C2441c c2441c2 = c2442d.f8828I;
        if (c2442d.f8859g0 == 8) {
            c2487b.f9080e = 0;
            c2487b.f9081f = 0;
            c2487b.f9082g = 0;
            return;
        }
        if (c2442d.f8839T == null) {
            return;
        }
        C2731r c2731r = ConstraintLayout.f784y;
        int i4 = c2487b.f9076a;
        int i8 = c2487b.f9077b;
        int i9 = c2487b.f9078c;
        int i10 = c2487b.f9079d;
        int i11 = this.f9956b + this.f9957c;
        int i12 = this.f9958d;
        View view = c2442d.f8857f0;
        int iM4162a = AbstractC2334g.m4162a(i4);
        if (iM4162a == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else if (iM4162a == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f9960f, i12, -2);
        } else if (iM4162a == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f9960f, i12, -2);
            boolean z8 = c2442d.f8879r == 1;
            int i13 = c2487b.f9085j;
            if (i13 == 1 || i13 == 2) {
                boolean z9 = view.getMeasuredHeight() == c2442d.m4392k();
                if (c2487b.f9085j == 2 || !z8 || ((z8 && z9) || c2442d.mo4349A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c2442d.m4396q(), 1073741824);
                }
            }
        } else if (iM4162a != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i14 = this.f9960f;
            int i15 = c2441c2 != null ? c2441c2.f8817g : 0;
            if (c2441c != null) {
                i15 += c2441c.f8817g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i14, i12 + i15, -1);
        }
        int iM4162a2 = AbstractC2334g.m4162a(i8);
        if (iM4162a2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        } else if (iM4162a2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f9961g, i11, -2);
        } else if (iM4162a2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f9961g, i11, -2);
            boolean z10 = c2442d.f8880s == 1;
            int i16 = c2487b.f9085j;
            if (i16 == 1 || i16 == 2) {
                boolean z11 = view.getMeasuredWidth() == c2442d.m4396q();
                if (c2487b.f9085j == 2 || !z10 || ((z10 && z11) || c2442d.mo4350B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c2442d.m4392k(), 1073741824);
                }
            }
        } else if (iM4162a2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i17 = this.f9961g;
            int i18 = c2441c2 != null ? c2442d.f8829J.f8817g : 0;
            if (c2441c != null) {
                i18 += c2442d.f8831L.f8817g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i11 + i18, -1);
        }
        C2443e c2443e = (C2443e) c2442d.f8839T;
        ConstraintLayout constraintLayout = this.f9962h;
        if (c2443e != null && AbstractC2448j.m4427c(constraintLayout.f793r, 256) && view.getMeasuredWidth() == c2442d.m4396q() && view.getMeasuredWidth() < c2443e.m4396q() && view.getMeasuredHeight() == c2442d.m4392k() && view.getMeasuredHeight() < c2443e.m4392k() && view.getBaseline() == c2442d.f8847a0 && !c2442d.m4405z() && m4785a(c2442d.f8826G, iMakeMeasureSpec, c2442d.m4396q()) && m4785a(c2442d.f8827H, iMakeMeasureSpec2, c2442d.m4392k())) {
            c2487b.f9080e = c2442d.m4396q();
            c2487b.f9081f = c2442d.m4392k();
            c2487b.f9082g = c2442d.f8847a0;
            return;
        }
        boolean z12 = i4 == 3;
        boolean z13 = i8 == 3;
        boolean z14 = i8 == 4 || i8 == 1;
        boolean z15 = i4 == 4 || i4 == 1;
        boolean z16 = z12 && c2442d.f8842W > 0.0f;
        boolean z17 = z13 && c2442d.f8842W > 0.0f;
        if (view == null) {
            return;
        }
        C2718e c2718e = (C2718e) view.getLayoutParams();
        int i19 = c2487b.f9085j;
        if (i19 != 1 && i19 != 2 && z12 && c2442d.f8879r == 0 && z13 && c2442d.f8880s == 0) {
            z7 = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            iMax = 0;
        } else {
            if ((view instanceof AbstractC2732s) && (c2442d instanceof C2445g)) {
                ((AbstractC2732s) view).mo495j((C2445g) c2442d, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            c2442d.f8826G = iMakeMeasureSpec;
            c2442d.f8827H = iMakeMeasureSpec2;
            c2442d.f8858g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i20 = c2442d.f8882u;
            int iMax2 = i20 > 0 ? Math.max(i20, measuredWidth2) : measuredWidth2;
            int i21 = c2442d.f8883v;
            if (i21 > 0) {
                iMax2 = Math.min(i21, iMax2);
            }
            int i22 = c2442d.f8885x;
            iMax = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
            int i23 = iMakeMeasureSpec2;
            int i24 = c2442d.f8886y;
            if (i24 > 0) {
                iMax = Math.min(i24, iMax);
            }
            if (!AbstractC2448j.m4427c(constraintLayout.f793r, 1)) {
                if (z16 && z14) {
                    iMax2 = (int) ((iMax * c2442d.f8842W) + 0.5f);
                } else if (z17 && z15) {
                    iMax = (int) ((iMax2 / c2442d.f8842W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z7 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i23;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                c2442d.f8826G = iMakeMeasureSpec;
                c2442d.f8827H = iMakeMeasureSpec3;
                z7 = false;
                c2442d.f8858g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i = -1;
        }
        boolean z18 = baseline != i ? true : z7;
        c2487b.f9084i = (measuredWidth == c2487b.f9078c && iMax == c2487b.f9079d) ? z7 : true;
        boolean z19 = c2718e.f9918c0 ? true : z18;
        if (z19 && baseline != -1 && c2442d.f8847a0 != baseline) {
            c2487b.f9084i = true;
        }
        c2487b.f9080e = measuredWidth;
        c2487b.f9081f = iMax;
        c2487b.f9083h = z19;
        c2487b.f9082g = baseline;
    }
}
