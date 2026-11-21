package p105m0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p037e0.C0851b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.r1 */
/* loaded from: classes.dex */
public final class C1844r1 {

    /* renamed from: b */
    public static final C1844r1 f6933b;

    /* renamed from: a */
    public final C1835o1 f6934a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f6933b = C1832n1.f6918s;
        } else if (i >= 30) {
            f6933b = C1829m1.f6916r;
        } else {
            f6933b = C1835o1.f6920b;
        }
    }

    public C1844r1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f6934a = new C1832n1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f6934a = new C1829m1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f6934a = new C1826l1(this, windowInsets);
        } else if (i >= 28) {
            this.f6934a = new C1823k1(this, windowInsets);
        } else {
            this.f6934a = new C1820j1(this, windowInsets);
        }
    }

    /* renamed from: e */
    public static C0851b m3620e(C0851b c0851b, int i, int i4, int i8, int i9) {
        int iMax = Math.max(0, c0851b.f3769a - i);
        int iMax2 = Math.max(0, c0851b.f3770b - i4);
        int iMax3 = Math.max(0, c0851b.f3771c - i8);
        int iMax4 = Math.max(0, c0851b.f3772d - i9);
        return (iMax == i && iMax2 == i4 && iMax3 == i8 && iMax4 == i9) ? c0851b : C0851b.m2022c(iMax, iMax2, iMax3, iMax4);
    }

    /* renamed from: g */
    public static C1844r1 m3621g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C1844r1 c1844r1 = new C1844r1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            C1844r1 c1844r1M3543a = AbstractC1807f0.m3543a(view);
            C1835o1 c1835o1 = c1844r1.f6934a;
            c1835o1.mo3569q(c1844r1M3543a);
            c1835o1.mo3562d(view.getRootView());
            c1835o1.mo3570s(view.getWindowSystemUiVisibility());
        }
        return c1844r1;
    }

    /* renamed from: a */
    public final int m3622a() {
        return this.f6934a.mo3565k().f3772d;
    }

    /* renamed from: b */
    public final int m3623b() {
        return this.f6934a.mo3565k().f3769a;
    }

    /* renamed from: c */
    public final int m3624c() {
        return this.f6934a.mo3565k().f3771c;
    }

    /* renamed from: d */
    public final int m3625d() {
        return this.f6934a.mo3565k().f3770b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1844r1) {
            return Objects.equals(this.f6934a, ((C1844r1) obj).f6934a);
        }
        return false;
    }

    /* renamed from: f */
    public final WindowInsets m3626f() {
        C1835o1 c1835o1 = this.f6934a;
        if (c1835o1 instanceof AbstractC1817i1) {
            return ((AbstractC1817i1) c1835o1).f6891c;
        }
        return null;
    }

    public final int hashCode() {
        C1835o1 c1835o1 = this.f6934a;
        if (c1835o1 == null) {
            return 0;
        }
        return c1835o1.hashCode();
    }

    public C1844r1() {
        this.f6934a = new C1835o1(this);
    }
}
