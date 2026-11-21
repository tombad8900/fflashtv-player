package p105m0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.bumptech.glide.AbstractC0714c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import p037e0.C0851b;
import p046f0.AbstractC0928a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.i1 */
/* loaded from: classes.dex */
public abstract class AbstractC1817i1 extends C1835o1 {

    /* renamed from: i */
    public static boolean f6886i;

    /* renamed from: j */
    public static Method f6887j;

    /* renamed from: k */
    public static Class f6888k;

    /* renamed from: l */
    public static Field f6889l;

    /* renamed from: m */
    public static Field f6890m;

    /* renamed from: c */
    public final WindowInsets f6891c;

    /* renamed from: d */
    public C0851b[] f6892d;

    /* renamed from: e */
    public C0851b f6893e;

    /* renamed from: f */
    public C1844r1 f6894f;

    /* renamed from: g */
    public C0851b f6895g;

    /* renamed from: h */
    public int f6896h;

    public AbstractC1817i1(C1844r1 c1844r1, WindowInsets windowInsets) {
        super(c1844r1);
        this.f6893e = null;
        this.f6891c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: t */
    private C0851b m3557t(int i, boolean z7) {
        C0851b c0851bM2020a = C0851b.f3768e;
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i & i4) != 0) {
                c0851bM2020a = C0851b.m2020a(c0851bM2020a, m3571u(i4, z7));
            }
        }
        return c0851bM2020a;
    }

    /* renamed from: v */
    private C0851b m3558v() {
        C1844r1 c1844r1 = this.f6894f;
        return c1844r1 != null ? c1844r1.f6934a.mo3577i() : C0851b.f3768e;
    }

    /* renamed from: w */
    private C0851b m3559w(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f6886i) {
            m3560x();
        }
        Method method = f6887j;
        if (method != null && f6888k != null && f6889l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f6889l.get(f6890m.get(objInvoke));
                if (rect != null) {
                    return C0851b.m2022c(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: x */
    private static void m3560x() throws ClassNotFoundException, SecurityException {
        try {
            f6887j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f6888k = cls;
            f6889l = cls.getDeclaredField("mVisibleInsets");
            f6890m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f6889l.setAccessible(true);
            f6890m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f6886i = true;
    }

    /* renamed from: z */
    public static boolean m3561z(int i, int i4) {
        return (i & 6) == (i4 & 6);
    }

    @Override // p105m0.C1835o1
    /* renamed from: d */
    public void mo3562d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0851b c0851bM3559w = m3559w(view);
        if (c0851bM3559w == null) {
            c0851bM3559w = C0851b.f3768e;
        }
        m3572y(c0851bM3559w);
    }

    @Override // p105m0.C1835o1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        AbstractC1817i1 abstractC1817i1 = (AbstractC1817i1) obj;
        return Objects.equals(this.f6895g, abstractC1817i1.f6895g) && m3561z(this.f6896h, abstractC1817i1.f6896h);
    }

    @Override // p105m0.C1835o1
    /* renamed from: f */
    public C0851b mo3563f(int i) {
        return m3557t(i, false);
    }

    @Override // p105m0.C1835o1
    /* renamed from: g */
    public C0851b mo3564g(int i) {
        return m3557t(i, true);
    }

    @Override // p105m0.C1835o1
    /* renamed from: k */
    public final C0851b mo3565k() {
        if (this.f6893e == null) {
            WindowInsets windowInsets = this.f6891c;
            this.f6893e = C0851b.m2022c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f6893e;
    }

    @Override // p105m0.C1835o1
    /* renamed from: m */
    public C1844r1 mo3566m(int i, int i4, int i8, int i9) {
        C1844r1 c1844r1M3621g = C1844r1.m3621g(null, this.f6891c);
        int i10 = Build.VERSION.SDK_INT;
        AbstractC1814h1 c1811g1 = i10 >= 34 ? new C1811g1(c1844r1M3621g) : i10 >= 30 ? new C1808f1(c1844r1M3621g) : i10 >= 29 ? new C1805e1(c1844r1M3621g) : new C1799c1(c1844r1M3621g);
        c1811g1.mo3520g(C1844r1.m3620e(mo3565k(), i, i4, i8, i9));
        c1811g1.mo3519e(C1844r1.m3620e(mo3577i(), i, i4, i8, i9));
        return c1811g1.mo3518b();
    }

    @Override // p105m0.C1835o1
    /* renamed from: o */
    public boolean mo3567o() {
        return this.f6891c.isRound();
    }

    @Override // p105m0.C1835o1
    /* renamed from: p */
    public void mo3568p(C0851b[] c0851bArr) {
        this.f6892d = c0851bArr;
    }

    @Override // p105m0.C1835o1
    /* renamed from: q */
    public void mo3569q(C1844r1 c1844r1) {
        this.f6894f = c1844r1;
    }

    @Override // p105m0.C1835o1
    /* renamed from: s */
    public void mo3570s(int i) {
        this.f6896h = i;
    }

    /* renamed from: u */
    public C0851b m3571u(int i, boolean z7) {
        C0851b c0851bMo3577i;
        int i4;
        C0851b c0851b = C0851b.f3768e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    C0851b[] c0851bArr = this.f6892d;
                    c0851bMo3577i = c0851bArr != null ? c0851bArr[AbstractC0714c.m1498K(8)] : null;
                    if (c0851bMo3577i != null) {
                        return c0851bMo3577i;
                    }
                    C0851b c0851bMo3565k = mo3565k();
                    C0851b c0851bM3558v = m3558v();
                    int i8 = c0851bMo3565k.f3772d;
                    if (i8 > c0851bM3558v.f3772d) {
                        return C0851b.m2022c(0, 0, 0, i8);
                    }
                    C0851b c0851b2 = this.f6895g;
                    if (c0851b2 != null && !c0851b2.equals(c0851b) && (i4 = this.f6895g.f3772d) > c0851bM3558v.f3772d) {
                        return C0851b.m2022c(0, 0, 0, i4);
                    }
                } else {
                    if (i == 16) {
                        return mo3594j();
                    }
                    if (i == 32) {
                        return mo3593h();
                    }
                    if (i == 64) {
                        return mo3595l();
                    }
                    if (i == 128) {
                        C1844r1 c1844r1 = this.f6894f;
                        C1818j c1818jMo3583e = c1844r1 != null ? c1844r1.f6934a.mo3583e() : mo3583e();
                        if (c1818jMo3583e != null) {
                            int i9 = Build.VERSION.SDK_INT;
                            return C0851b.m2022c(i9 >= 28 ? AbstractC0928a.m2090e(c1818jMo3583e.f6897a) : 0, i9 >= 28 ? AbstractC0928a.m2092g(c1818jMo3583e.f6897a) : 0, i9 >= 28 ? AbstractC0928a.m2091f(c1818jMo3583e.f6897a) : 0, i9 >= 28 ? AbstractC0928a.m2089d(c1818jMo3583e.f6897a) : 0);
                        }
                    }
                }
            } else {
                if (z7) {
                    C0851b c0851bM3558v2 = m3558v();
                    C0851b c0851bMo3577i2 = mo3577i();
                    return C0851b.m2022c(Math.max(c0851bM3558v2.f3769a, c0851bMo3577i2.f3769a), 0, Math.max(c0851bM3558v2.f3771c, c0851bMo3577i2.f3771c), Math.max(c0851bM3558v2.f3772d, c0851bMo3577i2.f3772d));
                }
                if ((this.f6896h & 2) == 0) {
                    C0851b c0851bMo3565k2 = mo3565k();
                    C1844r1 c1844r12 = this.f6894f;
                    c0851bMo3577i = c1844r12 != null ? c1844r12.f6934a.mo3577i() : null;
                    int iMin = c0851bMo3565k2.f3772d;
                    if (c0851bMo3577i != null) {
                        iMin = Math.min(iMin, c0851bMo3577i.f3772d);
                    }
                    return C0851b.m2022c(c0851bMo3565k2.f3769a, 0, c0851bMo3565k2.f3771c, iMin);
                }
            }
        } else {
            if (z7) {
                return C0851b.m2022c(0, Math.max(m3558v().f3770b, mo3565k().f3770b), 0, 0);
            }
            if ((this.f6896h & 4) == 0) {
                return C0851b.m2022c(0, mo3565k().f3770b, 0, 0);
            }
        }
        return c0851b;
    }

    /* renamed from: y */
    public void m3572y(C0851b c0851b) {
        this.f6895g = c0851b;
    }
}
