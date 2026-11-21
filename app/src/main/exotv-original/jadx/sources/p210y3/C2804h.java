package p210y3;

import java.security.MessageDigest;
import p178u4.C2467b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y3.h */
/* loaded from: classes.dex */
public final class C2804h implements InterfaceC2801e {

    /* renamed from: b */
    public final C2467b f10424b = new C2467b(0);

    @Override // p210y3.InterfaceC2801e
    /* renamed from: a */
    public final void mo309a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C2467b c2467b = this.f10424b;
            if (i >= c2467b.f7656l) {
                return;
            }
            C2803g c2803g = (C2803g) c2467b.m3992f(i);
            Object objM3996j = this.f10424b.m3996j(i);
            InterfaceC2802f interfaceC2802f = c2803g.f10421b;
            if (c2803g.f10423d == null) {
                c2803g.f10423d = c2803g.f10422c.getBytes(InterfaceC2801e.f10418a);
            }
            interfaceC2802f.mo2589a(c2803g.f10423d, objM3996j, messageDigest);
            i++;
        }
    }

    /* renamed from: c */
    public final Object m4908c(C2803g c2803g) {
        C2467b c2467b = this.f10424b;
        return c2467b.containsKey(c2803g) ? c2467b.get(c2803g) : c2803g.f10420a;
    }

    @Override // p210y3.InterfaceC2801e
    public final boolean equals(Object obj) {
        if (obj instanceof C2804h) {
            return this.f10424b.equals(((C2804h) obj).f10424b);
        }
        return false;
    }

    @Override // p210y3.InterfaceC2801e
    public final int hashCode() {
        return this.f10424b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f10424b + '}';
    }
}
