package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public final class C0124b {

    /* renamed from: a */
    public final int f898a;

    /* renamed from: b */
    public final Method f899b;

    public C0124b(int i, Method method) throws SecurityException {
        this.f898a = i;
        this.f899b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0124b)) {
            return false;
        }
        C0124b c0124b = (C0124b) obj;
        return this.f898a == c0124b.f898a && this.f899b.getName().equals(c0124b.f899b.getName());
    }

    public final int hashCode() {
        return this.f899b.getName().hashCode() + (this.f898a * 31);
    }
}
