package p041e4;

import java.util.ArrayDeque;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.p */
/* loaded from: classes.dex */
public final class C0899p {

    /* renamed from: b */
    public static final ArrayDeque f3928b;

    /* renamed from: a */
    public Object f3929a;

    static {
        char[] cArr = AbstractC2478m.f9069a;
        f3928b = new ArrayDeque(0);
    }

    /* renamed from: a */
    public static C0899p m2068a(Object obj) {
        C0899p c0899p;
        ArrayDeque arrayDeque = f3928b;
        synchronized (arrayDeque) {
            c0899p = (C0899p) arrayDeque.poll();
        }
        if (c0899p == null) {
            c0899p = new C0899p();
        }
        c0899p.f3929a = obj;
        return c0899p;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0899p) && this.f3929a.equals(((C0899p) obj).f3929a);
    }

    public final int hashCode() {
        return this.f3929a.hashCode();
    }
}
