package p077j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;
import p077j$.time.AbstractC1392d;
import p077j$.time.C1426l;
import p077j$.time.LocalDate;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1451q;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.chrono.i0 */
/* loaded from: classes2.dex */
public final class C1373i0 extends AbstractC1360c {
    private static final long serialVersionUID = -8722293800195731463L;

    /* renamed from: a */
    public final transient LocalDate f5446a;

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: L */
    public final InterfaceC1362d mo2892L(C1426l c1426l) {
        return new C1366f(this, c1426l);
    }

    public C1373i0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f5446a = localDate;
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: e */
    public final InterfaceC1377l mo2901e() {
        return C1369g0.f5443c;
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        C1369g0.f5443c.getClass();
        return this.f5446a.hashCode() ^ 146118545;
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: N */
    public final InterfaceC1378m mo2893N() {
        return m2972P() >= 1 ? EnumC1375j0.f5448BE : EnumC1375j0.BEFORE_BE;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return interfaceC1452r.mo3090A(this);
        }
        if (!mo2881i(interfaceC1452r)) {
            throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
        EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
        int i = AbstractC1371h0.f5445a[enumC1435a.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.f5446a.mo2908l(interfaceC1452r);
        }
        if (i != 4) {
            return C1369g0.f5443c.mo2942y(enumC1435a);
        }
        C1456v c1456v = EnumC1435a.YEAR.f5602b;
        return C1456v.m3103f(1L, m2972P() <= 0 ? (-(c1456v.f5627a + 543)) + 1 : 543 + c1456v.f5630d);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            int i = AbstractC1371h0.f5445a[((EnumC1435a) interfaceC1452r).ordinal()];
            if (i == 4) {
                int iM2972P = m2972P();
                if (iM2972P < 1) {
                    iM2972P = 1 - iM2972P;
                }
                return iM2972P;
            }
            if (i == 5) {
                return ((m2972P() * 12) + this.f5446a.f5411b) - 1;
            }
            if (i == 6) {
                return m2972P();
            }
            if (i != 7) {
                return this.f5446a.mo2882j(interfaceC1452r);
            }
            return m2972P() < 1 ? 0 : 1;
        }
        return interfaceC1452r.mo3092P(this);
    }

    /* renamed from: P */
    public final int m2972P() {
        return this.f5446a.f5410a + 543;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1373i0 mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
            if (mo2882j(enumC1435a) == j) {
                return this;
            }
            int[] iArr = AbstractC1371h0.f5445a;
            int i = iArr[enumC1435a.ordinal()];
            if (i == 4) {
                int iM3105a = C1369g0.f5443c.mo2942y(enumC1435a).m3105a(j, enumC1435a);
                int i4 = iArr[enumC1435a.ordinal()];
                if (i4 == 4) {
                    LocalDate localDate = this.f5446a;
                    if (m2972P() < 1) {
                        iM3105a = 1 - iM3105a;
                    }
                    return m2974X(localDate.m2911m0(iM3105a - 543));
                }
                if (i4 == 6) {
                    return m2974X(this.f5446a.m2911m0(iM3105a - 543));
                }
                if (i4 == 7) {
                    return m2974X(this.f5446a.m2911m0((-542) - m2972P()));
                }
            } else {
                if (i == 5) {
                    C1369g0.f5443c.mo2942y(enumC1435a).m3106b(j, enumC1435a);
                    long jM2972P = m2972P() * 12;
                    return m2974X(this.f5446a.m2904g0(j - ((jM2972P + r10.f5411b) - 1)));
                }
                if (i == 6 || i == 7) {
                }
            }
            return m2974X(this.f5446a.mo2877d(j, interfaceC1452r));
        }
        return (C1373i0) super.mo2877d(j, interfaceC1452r);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: g */
    public final InterfaceC1447m mo2967m(LocalDate localDate) {
        return (C1373i0) super.mo2967m(localDate);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: m */
    public final ChronoLocalDate mo2967m(InterfaceC1449o interfaceC1449o) {
        return (C1373i0) super.mo2967m(interfaceC1449o);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: R */
    public final ChronoLocalDate mo2895R(InterfaceC1451q interfaceC1451q) {
        return (C1373i0) super.mo2895R(interfaceC1451q);
    }

    @Override // p077j$.time.chrono.AbstractC1360c
    /* renamed from: I */
    public final ChronoLocalDate mo2947I(long j) {
        return m2974X(this.f5446a.m2906i0(j));
    }

    @Override // p077j$.time.chrono.AbstractC1360c
    /* renamed from: F */
    public final ChronoLocalDate mo2946F(long j) {
        return m2974X(this.f5446a.m2904g0(j));
    }

    @Override // p077j$.time.chrono.AbstractC1360c
    /* renamed from: A */
    public final ChronoLocalDate mo2945A(long j) {
        return m2974X(this.f5446a.m2903f0(j));
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: h */
    public final ChronoLocalDate mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        return (C1373i0) super.mo2880h(j, interfaceC1454t);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: h */
    public final InterfaceC1447m mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        return (C1373i0) super.mo2880h(j, interfaceC1454t);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final ChronoLocalDate mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return (C1373i0) super.mo2874a(j, interfaceC1454t);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final InterfaceC1447m mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return (C1373i0) super.mo2874a(j, interfaceC1454t);
    }

    /* renamed from: X */
    public final C1373i0 m2974X(LocalDate localDate) {
        return localDate.equals(this.f5446a) ? this : new C1373i0(localDate);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: K */
    public final long mo2891K() {
        return this.f5446a.mo2891K();
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1373i0) {
            return this.f5446a.equals(((C1373i0) obj).f5446a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1365e0((byte) 8, this);
    }
}
