package p105m0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.lifecycle.AbstractC0150o;
import java.util.Objects;
import java.util.WeakHashMap;
import p002a1.C0016e;
import p032d3.C0825j;
import p037e0.C0851b;
import p095l.RunnableC1617e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.v0 */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1855v0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final AbstractC0150o f6950a;

    /* renamed from: b */
    public C1844r1 f6951b;

    public ViewOnApplyWindowInsetsListenerC1855v0(View view, AbstractC0150o abstractC0150o) {
        C1844r1 c1844r1Mo3518b;
        this.f6950a = abstractC0150o;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        C1844r1 c1844r1M3543a = AbstractC1807f0.m3543a(view);
        if (c1844r1M3543a != null) {
            int i = Build.VERSION.SDK_INT;
            c1844r1Mo3518b = (i >= 34 ? new C1811g1(c1844r1M3543a) : i >= 30 ? new C1808f1(c1844r1M3543a) : i >= 29 ? new C1805e1(c1844r1M3543a) : new C1799c1(c1844r1M3543a)).mo3518b();
        } else {
            c1844r1Mo3518b = null;
        }
        this.f6951b = c1844r1Mo3518b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z7;
        if (!view.isLaidOut()) {
            this.f6951b = C1844r1.m3621g(view, windowInsets);
            return C1858w0.m3648j(view, windowInsets);
        }
        C1844r1 c1844r1M3621g = C1844r1.m3621g(view, windowInsets);
        C1835o1 c1835o1 = c1844r1M3621g.f6934a;
        if (this.f6951b == null) {
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            this.f6951b = AbstractC1807f0.m3543a(view);
        }
        if (this.f6951b == null) {
            this.f6951b = c1844r1M3621g;
            return C1858w0.m3648j(view, windowInsets);
        }
        AbstractC0150o abstractC0150oM3649k = C1858w0.m3649k(view);
        if (abstractC0150oM3649k != null && Objects.equals((C1844r1) abstractC0150oM3649k.f933j, c1844r1M3621g)) {
            return C1858w0.m3648j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        C1844r1 c1844r1 = this.f6951b;
        int i = 1;
        while (i <= 512) {
            C0851b c0851bMo3563f = c1835o1.mo3563f(i);
            C0851b c0851bMo3563f2 = c1844r1.f6934a.mo3563f(i);
            int i4 = c0851bMo3563f.f3769a;
            int i8 = c0851bMo3563f.f3772d;
            int i9 = c0851bMo3563f.f3771c;
            int i10 = c0851bMo3563f.f3770b;
            int i11 = c0851bMo3563f2.f3769a;
            int i12 = c0851bMo3563f2.f3772d;
            int i13 = c0851bMo3563f2.f3771c;
            int i14 = c0851bMo3563f2.f3770b;
            if (i4 > i11 || i10 > i14 || i9 > i13 || i8 > i12) {
                iArr = iArr2;
                z7 = true;
            } else {
                iArr = iArr2;
                z7 = false;
            }
            if (z7 != (i4 < i11 || i10 < i14 || i9 < i13 || i8 < i12)) {
                if (z7) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i15 = iArr2[0];
        int i16 = iArr3[0];
        int i17 = i15 | i16;
        if (i17 == 0) {
            this.f6951b = c1844r1M3621g;
            return C1858w0.m3648j(view, windowInsets);
        }
        C1844r1 c1844r12 = this.f6951b;
        C1796b1 c1796b1 = new C1796b1(i17, (i15 & 8) != 0 ? C1858w0.f6952e : (i16 & 8) != 0 ? C1858w0.f6953f : (i15 & 519) != 0 ? C1858w0.f6954g : (i16 & 519) != 0 ? C1858w0.f6955h : null, (i17 & 8) != 0 ? 160L : 250L);
        c1796b1.f6856a.mo3500e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1796b1.f6856a.mo3497b());
        C0851b c0851bMo3563f3 = c1835o1.mo3563f(i17);
        C0851b c0851bMo3563f4 = c1844r12.f6934a.mo3563f(i17);
        int iMin = Math.min(c0851bMo3563f3.f3769a, c0851bMo3563f4.f3769a);
        int i18 = c0851bMo3563f3.f3770b;
        int i19 = c0851bMo3563f4.f3770b;
        int iMin2 = Math.min(i18, i19);
        int i20 = c0851bMo3563f3.f3771c;
        int i21 = c0851bMo3563f4.f3771c;
        int iMin3 = Math.min(i20, i21);
        int i22 = c0851bMo3563f3.f3772d;
        int i23 = c0851bMo3563f4.f3772d;
        C0016e c0016e = new C0016e(C0851b.m2022c(iMin, iMin2, iMin3, Math.min(i22, i23)), 22, C0851b.m2022c(Math.max(c0851bMo3563f3.f3769a, c0851bMo3563f4.f3769a), Math.max(i18, i19), Math.max(i20, i21), Math.max(i22, i23)));
        C1858w0.m3645g(view, c1796b1, c1844r1M3621g, false);
        duration.addUpdateListener(new C1852u0(c1796b1, c1844r1M3621g, c1844r12, i17, view));
        duration.addListener(new C0825j(c1796b1, view, 4));
        ViewTreeObserverOnPreDrawListenerC1836p.m3612a(view, new RunnableC1617e(view, c1796b1, c0016e, duration));
        this.f6951b = c1844r1M3621g;
        return C1858w0.m3648j(view, windowInsets);
    }
}
