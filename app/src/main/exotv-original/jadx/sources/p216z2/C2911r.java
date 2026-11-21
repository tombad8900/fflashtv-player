package p216z2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.r */
/* loaded from: classes.dex */
public class C2911r {

    /* renamed from: a */
    public int f10803a = -1;

    /* renamed from: b */
    public RecyclerView f10804b;

    /* renamed from: c */
    public AbstractC2888f0 f10805c;

    /* renamed from: d */
    public boolean f10806d;

    /* renamed from: e */
    public boolean f10807e;

    /* renamed from: f */
    public View f10808f;

    /* renamed from: g */
    public final C2908p0 f10809g;

    /* renamed from: h */
    public boolean f10810h;

    /* renamed from: i */
    public final LinearInterpolator f10811i;

    /* renamed from: j */
    public final DecelerateInterpolator f10812j;

    /* renamed from: k */
    public PointF f10813k;

    /* renamed from: l */
    public final DisplayMetrics f10814l;

    /* renamed from: m */
    public boolean f10815m;

    /* renamed from: n */
    public float f10816n;

    /* renamed from: o */
    public int f10817o;

    /* renamed from: p */
    public int f10818p;

    public C2911r(Context context) {
        C2908p0 c2908p0 = new C2908p0();
        c2908p0.f10796d = -1;
        c2908p0.f10798f = false;
        c2908p0.f10799g = 0;
        c2908p0.f10793a = 0;
        c2908p0.f10794b = 0;
        c2908p0.f10795c = Integer.MIN_VALUE;
        c2908p0.f10797e = null;
        this.f10809g = c2908p0;
        this.f10811i = new LinearInterpolator();
        this.f10812j = new DecelerateInterpolator();
        this.f10815m = false;
        this.f10817o = 0;
        this.f10818p = 0;
        this.f10814l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    public static int m5046a(int i, int i4, int i8, int i9, int i10) {
        if (i10 == -1) {
            return i8 - i;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                return i9 - i4;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i11 = i8 - i;
        if (i11 > 0) {
            return i11;
        }
        int i12 = i9 - i4;
        if (i12 < 0) {
            return i12;
        }
        return 0;
    }

    /* renamed from: b */
    public int mo1874b(View view, int i) {
        AbstractC2888f0 abstractC2888f0 = this.f10805c;
        if (abstractC2888f0 == null || !abstractC2888f0.mo1127d()) {
            return 0;
        }
        C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
        return m5046a((view.getLeft() - ((C2890g0) view.getLayoutParams()).f10690b.left) - ((ViewGroup.MarginLayoutParams) c2890g0).leftMargin, view.getRight() + ((C2890g0) view.getLayoutParams()).f10690b.right + ((ViewGroup.MarginLayoutParams) c2890g0).rightMargin, abstractC2888f0.m4994E(), abstractC2888f0.f10682n - abstractC2888f0.m4995F(), i);
    }

    /* renamed from: c */
    public int mo1875c(View view, int i) {
        AbstractC2888f0 abstractC2888f0 = this.f10805c;
        if (abstractC2888f0 == null || !abstractC2888f0.mo1128e()) {
            return 0;
        }
        C2890g0 c2890g0 = (C2890g0) view.getLayoutParams();
        return m5046a((view.getTop() - ((C2890g0) view.getLayoutParams()).f10690b.top) - ((ViewGroup.MarginLayoutParams) c2890g0).topMargin, view.getBottom() + ((C2890g0) view.getLayoutParams()).f10690b.bottom + ((ViewGroup.MarginLayoutParams) c2890g0).bottomMargin, abstractC2888f0.m4996G(), abstractC2888f0.f10683o - abstractC2888f0.m4993D(), i);
    }

    /* renamed from: d */
    public float mo1876d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: e */
    public int mo5047e(int i) {
        float fAbs = Math.abs(i);
        if (!this.f10815m) {
            this.f10816n = mo1876d(this.f10814l);
            this.f10815m = true;
        }
        return (int) Math.ceil(fAbs * this.f10816n);
    }

    /* renamed from: f */
    public PointF mo1877f(int i) {
        Object obj = this.f10805c;
        if (obj instanceof InterfaceC2910q0) {
            return ((InterfaceC2910q0) obj).mo1122a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC2910q0.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5048g(int i, int i4) {
        PointF pointFMo1877f;
        RecyclerView recyclerView = this.f10804b;
        if (this.f10803a == -1 || recyclerView == null) {
            m5050i();
        }
        if (this.f10806d && this.f10808f == null && this.f10805c != null && (pointFMo1877f = mo1877f(this.f10803a)) != null) {
            float f8 = pointFMo1877f.x;
            if (f8 != 0.0f || pointFMo1877f.y != 0.0f) {
                recyclerView.m1181f0((int) Math.signum(f8), (int) Math.signum(pointFMo1877f.y), null);
            }
        }
        this.f10806d = false;
        View view = this.f10808f;
        C2908p0 c2908p0 = this.f10809g;
        if (view != null) {
            this.f10804b.getClass();
            AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(view);
            if ((abstractC2920v0M1144M != null ? abstractC2920v0M1144M.m5062b() : -1) == this.f10803a) {
                View view2 = this.f10808f;
                C2912r0 c2912r0 = recyclerView.f2067p0;
                mo5049h(view2, c2908p0);
                c2908p0.m5045a(recyclerView);
                m5050i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f10808f = null;
            }
        }
        if (this.f10807e) {
            C2912r0 c2912r02 = recyclerView.f2067p0;
            if (this.f10804b.f2080w.m5010v() == 0) {
                m5050i();
            } else {
                int i8 = this.f10817o;
                int i9 = i8 - i;
                if (i8 * i9 <= 0) {
                    i9 = 0;
                }
                this.f10817o = i9;
                int i10 = this.f10818p;
                int i11 = i10 - i4;
                if (i10 * i11 <= 0) {
                    i11 = 0;
                }
                this.f10818p = i11;
                if (i9 == 0 && i11 == 0) {
                    PointF pointFMo1877f2 = mo1877f(this.f10803a);
                    if (pointFMo1877f2 != null) {
                        if (pointFMo1877f2.x == 0.0f && pointFMo1877f2.y == 0.0f) {
                            c2908p0.f10796d = this.f10803a;
                            m5050i();
                        } else {
                            float f9 = pointFMo1877f2.y;
                            float fSqrt = (float) Math.sqrt((f9 * f9) + (r10 * r10));
                            float f10 = pointFMo1877f2.x / fSqrt;
                            pointFMo1877f2.x = f10;
                            float f11 = pointFMo1877f2.y / fSqrt;
                            pointFMo1877f2.y = f11;
                            this.f10813k = pointFMo1877f2;
                            this.f10817o = (int) (f10 * 10000.0f);
                            this.f10818p = (int) (f11 * 10000.0f);
                            int iMo5047e = mo5047e(10000);
                            c2908p0.f10793a = (int) (this.f10817o * 1.2f);
                            c2908p0.f10794b = (int) (this.f10818p * 1.2f);
                            c2908p0.f10795c = (int) (iMo5047e * 1.2f);
                            c2908p0.f10797e = this.f10811i;
                            c2908p0.f10798f = true;
                        }
                    }
                }
            }
            boolean z7 = c2908p0.f10796d >= 0;
            c2908p0.m5045a(recyclerView);
            if (z7 && this.f10807e) {
                this.f10806d = true;
                recyclerView.f2061m0.m5059b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo5049h(View view, C2908p0 c2908p0) {
        int i;
        PointF pointF = this.f10813k;
        int i4 = 0;
        if (pointF != null) {
            float f8 = pointF.x;
            i = f8 == 0.0f ? 0 : f8 > 0.0f ? 1 : -1;
        }
        int iMo1874b = mo1874b(view, i);
        PointF pointF2 = this.f10813k;
        if (pointF2 != null) {
            float f9 = pointF2.y;
            if (f9 != 0.0f) {
                i4 = f9 > 0.0f ? 1 : -1;
            }
        }
        int iMo1875c = mo1875c(view, i4);
        int iCeil = (int) Math.ceil(mo5047e((int) Math.sqrt((iMo1875c * iMo1875c) + (iMo1874b * iMo1874b))) / 0.3356d);
        if (iCeil > 0) {
            c2908p0.f10793a = -iMo1874b;
            c2908p0.f10794b = -iMo1875c;
            c2908p0.f10795c = iCeil;
            c2908p0.f10797e = this.f10812j;
            c2908p0.f10798f = true;
        }
    }

    /* renamed from: i */
    public final void m5050i() {
        if (this.f10807e) {
            this.f10807e = false;
            this.f10818p = 0;
            this.f10817o = 0;
            this.f10813k = null;
            this.f10804b.f2067p0.f10819a = -1;
            this.f10808f = null;
            this.f10803a = -1;
            this.f10806d = false;
            AbstractC2888f0 abstractC2888f0 = this.f10805c;
            if (abstractC2888f0.f10673e == this) {
                abstractC2888f0.f10673e = null;
            }
            this.f10805c = null;
            this.f10804b = null;
        }
    }
}
