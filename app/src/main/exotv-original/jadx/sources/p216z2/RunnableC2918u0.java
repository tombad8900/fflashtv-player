package p216z2;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p063h1.C1131v;
import p105m0.AbstractC1828m0;
import p166t0.InterpolatorC2390d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.u0 */
/* loaded from: classes.dex */
public final class RunnableC2918u0 implements Runnable {

    /* renamed from: j */
    public int f10838j;

    /* renamed from: k */
    public int f10839k;

    /* renamed from: l */
    public OverScroller f10840l;

    /* renamed from: m */
    public Interpolator f10841m;

    /* renamed from: n */
    public boolean f10842n;

    /* renamed from: o */
    public boolean f10843o;

    /* renamed from: p */
    public final /* synthetic */ RecyclerView f10844p;

    public RunnableC2918u0(RecyclerView recyclerView) {
        this.f10844p = recyclerView;
        InterpolatorC2390d interpolatorC2390d = RecyclerView.f2012Q0;
        this.f10841m = interpolatorC2390d;
        this.f10842n = false;
        this.f10843o = false;
        this.f10840l = new OverScroller(recyclerView.getContext(), interpolatorC2390d);
    }

    /* renamed from: a */
    public final void m5058a(int i, int i4) {
        RecyclerView recyclerView = this.f10844p;
        recyclerView.setScrollState(2);
        this.f10839k = 0;
        this.f10838j = 0;
        Interpolator interpolator = this.f10841m;
        InterpolatorC2390d interpolatorC2390d = RecyclerView.f2012Q0;
        if (interpolator != interpolatorC2390d) {
            this.f10841m = interpolatorC2390d;
            this.f10840l = new OverScroller(recyclerView.getContext(), interpolatorC2390d);
        }
        this.f10840l.fling(0, 0, i, i4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m5059b();
    }

    /* renamed from: b */
    public final void m5059b() {
        if (this.f10842n) {
            this.f10843o = true;
            return;
        }
        RecyclerView recyclerView = this.f10844p;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        recyclerView.postOnAnimation(this);
    }

    /* renamed from: c */
    public final void m5060c(int i, int i4, int i8, Interpolator interpolator) {
        RecyclerView recyclerView = this.f10844p;
        if (i8 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i4);
            boolean z7 = iAbs > iAbs2;
            int width = z7 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z7) {
                iAbs = iAbs2;
            }
            i8 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i9 = i8;
        if (interpolator == null) {
            interpolator = RecyclerView.f2012Q0;
        }
        if (this.f10841m != interpolator) {
            this.f10841m = interpolator;
            this.f10840l = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f10839k = 0;
        this.f10838j = 0;
        recyclerView.setScrollState(2);
        this.f10840l.startScroll(0, 0, i, i4, i9);
        m5059b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i4;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f10844p;
        int[] iArr = recyclerView.f2017B0;
        if (recyclerView.f2080w == null) {
            recyclerView.removeCallbacks(this);
            this.f10840l.abortAnimation();
            return;
        }
        this.f10843o = false;
        this.f10842n = true;
        recyclerView.m1194p();
        OverScroller overScroller = this.f10840l;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i10 = currX - this.f10838j;
            int i11 = currY - this.f10839k;
            this.f10838j = currX;
            this.f10839k = currY;
            int iM1152o = RecyclerView.m1152o(i10, recyclerView.f2038Q, recyclerView.f2040S, recyclerView.getWidth());
            int iM1152o2 = RecyclerView.m1152o(i11, recyclerView.f2039R, recyclerView.f2041T, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f2017B0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.m1199u(iM1152o, iM1152o2, 1, iArr2, null)) {
                iM1152o -= iArr[0];
                iM1152o2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m1193n(iM1152o, iM1152o2);
            }
            if (recyclerView.f2078v != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.m1181f0(iM1152o, iM1152o2, iArr);
                int i12 = iArr[0];
                int i13 = iArr[1];
                int i14 = iM1152o - i12;
                int i15 = iM1152o2 - i13;
                C2911r c2911r = recyclerView.f2080w.f10673e;
                if (c2911r != null && !c2911r.f10806d && c2911r.f10807e) {
                    int iM5052b = recyclerView.f2067p0.m5052b();
                    if (iM5052b == 0) {
                        c2911r.m5050i();
                    } else if (c2911r.f10803a >= iM5052b) {
                        c2911r.f10803a = iM5052b - 1;
                        c2911r.m5048g(i12, i13);
                    } else {
                        c2911r.m5048g(i12, i13);
                    }
                }
                i = i14;
                i8 = i12;
                i4 = i15;
                i9 = i13;
            } else {
                i = iM1152o;
                i4 = iM1152o2;
                i8 = 0;
                i9 = 0;
            }
            if (!recyclerView.f2084y.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f2017B0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m1200v(i8, i9, i, i4, null, 1, iArr3);
            int i16 = i - iArr[0];
            int i17 = i4 - iArr[1];
            if (i8 != 0 || i9 != 0) {
                recyclerView.m1201w(i8, i9);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z7 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i16 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i17 != 0));
            C2911r c2911r2 = recyclerView.f2080w.f10673e;
            if ((c2911r2 == null || !c2911r2.f10806d) && z7) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i18 = i16 < 0 ? -currVelocity : i16 > 0 ? currVelocity : 0;
                    if (i17 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i17 <= 0) {
                        currVelocity = 0;
                    }
                    if (i18 < 0) {
                        recyclerView.m1203y();
                        if (recyclerView.f2038Q.isFinished()) {
                            recyclerView.f2038Q.onAbsorb(-i18);
                        }
                    } else if (i18 > 0) {
                        recyclerView.m1204z();
                        if (recyclerView.f2040S.isFinished()) {
                            recyclerView.f2040S.onAbsorb(i18);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m1153A();
                        if (recyclerView.f2039R.isFinished()) {
                            recyclerView.f2039R.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m1202x();
                        if (recyclerView.f2041T.isFinished()) {
                            recyclerView.f2041T.onAbsorb(currVelocity);
                        }
                    }
                    if (i18 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f2010O0) {
                    C1131v c1131v = recyclerView.f2065o0;
                    int[] iArr4 = (int[]) c1131v.f4792b;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c1131v.f4795e = 0;
                }
            } else {
                m5059b();
                RunnableC2899l runnableC2899l = recyclerView.f2063n0;
                if (runnableC2899l != null) {
                    runnableC2899l.m5027a(recyclerView, i8, i9);
                }
            }
        }
        C2911r c2911r3 = recyclerView.f2080w.f10673e;
        if (c2911r3 != null && c2911r3.f10806d) {
            c2911r3.m5048g(0, 0);
        }
        this.f10842n = false;
        if (!this.f10843o) {
            recyclerView.setScrollState(0);
            recyclerView.m1191l0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
            recyclerView.postOnAnimation(this);
        }
    }
}
