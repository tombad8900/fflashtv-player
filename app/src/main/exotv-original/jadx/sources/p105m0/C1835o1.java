package p105m0;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p037e0.C0851b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.o1 */
/* loaded from: classes.dex */
public class C1835o1 {

    /* renamed from: b */
    public static final C1844r1 f6920b;

    /* renamed from: a */
    public final C1844r1 f6921a;

    static {
        int i = Build.VERSION.SDK_INT;
        f6920b = (i >= 34 ? new C1811g1() : i >= 30 ? new C1808f1() : i >= 29 ? new C1805e1() : new C1799c1()).mo3518b().f6934a.mo3582a().f6934a.mo3575b().f6934a.mo3576c();
    }

    public C1835o1(C1844r1 c1844r1) {
        this.f6921a = c1844r1;
    }

    /* renamed from: a */
    public C1844r1 mo3582a() {
        return this.f6921a;
    }

    /* renamed from: b */
    public C1844r1 mo3575b() {
        return this.f6921a;
    }

    /* renamed from: c */
    public C1844r1 mo3576c() {
        return this.f6921a;
    }

    /* renamed from: d */
    public void mo3562d(View view) {
    }

    /* renamed from: e */
    public C1818j mo3583e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1835o1)) {
            return false;
        }
        C1835o1 c1835o1 = (C1835o1) obj;
        return mo3567o() == c1835o1.mo3567o() && mo3578n() == c1835o1.mo3578n() && Objects.equals(mo3565k(), c1835o1.mo3565k()) && Objects.equals(mo3577i(), c1835o1.mo3577i()) && Objects.equals(mo3583e(), c1835o1.mo3583e());
    }

    /* renamed from: f */
    public C0851b mo3563f(int i) {
        return C0851b.f3768e;
    }

    /* renamed from: g */
    public C0851b mo3564g(int i) {
        if ((i & 8) == 0) {
            return C0851b.f3768e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    /* renamed from: h */
    public C0851b mo3593h() {
        return mo3565k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo3567o()), Boolean.valueOf(mo3578n()), mo3565k(), mo3577i(), mo3583e());
    }

    /* renamed from: i */
    public C0851b mo3577i() {
        return C0851b.f3768e;
    }

    /* renamed from: j */
    public C0851b mo3594j() {
        return mo3565k();
    }

    /* renamed from: k */
    public C0851b mo3565k() {
        return C0851b.f3768e;
    }

    /* renamed from: l */
    public C0851b mo3595l() {
        return mo3565k();
    }

    /* renamed from: m */
    public C1844r1 mo3566m(int i, int i4, int i8, int i9) {
        return f6920b;
    }

    /* renamed from: n */
    public boolean mo3578n() {
        return false;
    }

    /* renamed from: o */
    public boolean mo3567o() {
        return false;
    }

    /* renamed from: p */
    public void mo3568p(C0851b[] c0851bArr) {
    }

    /* renamed from: q */
    public void mo3569q(C1844r1 c1844r1) {
    }

    /* renamed from: r */
    public void mo3579r(C0851b c0851b) {
    }

    /* renamed from: s */
    public void mo3570s(int i) {
    }
}
