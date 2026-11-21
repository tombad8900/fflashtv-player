package p105m0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p037e0.C0851b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.c1 */
/* loaded from: classes.dex */
public final class C1799c1 extends AbstractC1814h1 {

    /* renamed from: e */
    public static Field f6857e;

    /* renamed from: f */
    public static boolean f6858f;

    /* renamed from: g */
    public static Constructor f6859g;

    /* renamed from: h */
    public static boolean f6860h;

    /* renamed from: c */
    public WindowInsets f6861c;

    /* renamed from: d */
    public C0851b f6862d;

    public C1799c1() {
        this.f6861c = m3517i();
    }

    /* renamed from: i */
    private static WindowInsets m3517i() {
        if (!f6858f) {
            try {
                f6857e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            f6858f = true;
        }
        Field field = f6857e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e8);
            }
        }
        if (!f6860h) {
            try {
                f6859g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e9);
            }
            f6860h = true;
        }
        Constructor constructor = f6859g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
            }
        }
        return null;
    }

    @Override // p105m0.AbstractC1814h1
    /* renamed from: b */
    public C1844r1 mo3518b() {
        m3554a();
        C1844r1 c1844r1M3621g = C1844r1.m3621g(null, this.f6861c);
        C0851b[] c0851bArr = this.f6877b;
        C1835o1 c1835o1 = c1844r1M3621g.f6934a;
        c1835o1.mo3568p(c0851bArr);
        c1835o1.mo3579r(this.f6862d);
        return c1844r1M3621g;
    }

    @Override // p105m0.AbstractC1814h1
    /* renamed from: e */
    public void mo3519e(C0851b c0851b) {
        this.f6862d = c0851b;
    }

    @Override // p105m0.AbstractC1814h1
    /* renamed from: g */
    public void mo3520g(C0851b c0851b) {
        WindowInsets windowInsets = this.f6861c;
        if (windowInsets != null) {
            this.f6861c = windowInsets.replaceSystemWindowInsets(c0851b.f3769a, c0851b.f3770b, c0851b.f3771c, c0851b.f3772d);
        }
    }

    public C1799c1(C1844r1 c1844r1) {
        super(c1844r1);
        this.f6861c = c1844r1.m3626f();
    }
}
