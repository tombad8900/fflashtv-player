package p042e5;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e5.c */
/* loaded from: classes.dex */
public final class C0912c {

    /* renamed from: a */
    public long f3962a;

    /* renamed from: b */
    public long f3963b;

    /* renamed from: c */
    public TimeInterpolator f3964c;

    /* renamed from: d */
    public int f3965d;

    /* renamed from: e */
    public int f3966e;

    /* renamed from: a */
    public final TimeInterpolator m2082a() {
        TimeInterpolator timeInterpolator = this.f3964c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0910a.f3957b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0912c)) {
            return false;
        }
        C0912c c0912c = (C0912c) obj;
        if (this.f3962a == c0912c.f3962a && this.f3963b == c0912c.f3963b && this.f3965d == c0912c.f3965d && this.f3966e == c0912c.f3966e) {
            return m2082a().getClass().equals(c0912c.m2082a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3962a;
        long j8 = this.f3963b;
        return ((((m2082a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j8 >>> 32) ^ j8))) * 31)) * 31) + this.f3965d) * 31) + this.f3966e;
    }

    public final String toString() {
        return "\n" + C0912c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f3962a + " duration: " + this.f3963b + " interpolator: " + m2082a().getClass() + " repeatCount: " + this.f3965d + " repeatMode: " + this.f3966e + "}\n";
    }
}
