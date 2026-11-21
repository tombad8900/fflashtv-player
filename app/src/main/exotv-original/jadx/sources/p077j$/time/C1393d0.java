package p077j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import p077j$.time.chrono.ChronoLocalDate;
import p077j$.time.chrono.InterfaceC1362d;
import p077j$.time.chrono.InterfaceC1372i;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;
import p077j$.time.zone.C1464b;
import p077j$.time.zone.C1468f;

/* renamed from: j$.time.d0 */
/* loaded from: classes2.dex */
public final class C1393d0 implements InterfaceC1447m, InterfaceC1372i, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a */
    public final C1424j f5487a;

    /* renamed from: b */
    public final C1351a0 f5488b;

    /* renamed from: c */
    public final AbstractC1462z f5489c;

    /* renamed from: A */
    public static C1393d0 m3002A(C1424j c1424j, AbstractC1462z abstractC1462z, C1351a0 c1351a0) {
        Objects.requireNonNull(c1424j, "localDateTime");
        Objects.requireNonNull(abstractC1462z, "zone");
        if (abstractC1462z instanceof C1351a0) {
            return new C1393d0(c1424j, abstractC1462z, (C1351a0) abstractC1462z);
        }
        C1468f c1468fMo2921w = abstractC1462z.mo2921w();
        List listM3137f = c1468fMo2921w.m3137f(c1424j);
        if (listM3137f.size() == 1) {
            c1351a0 = (C1351a0) listM3137f.get(0);
        } else if (listM3137f.size() != 0) {
            if (c1351a0 == null || !listM3137f.contains(c1351a0)) {
                c1351a0 = (C1351a0) listM3137f.get(0);
                Objects.requireNonNull(c1351a0, "offset");
            }
        } else {
            Object objM3136e = c1468fMo2921w.m3136e(c1424j);
            C1464b c1464b = objM3136e instanceof C1464b ? (C1464b) objM3136e : null;
            c1424j = c1424j.m3059X(Duration.m2867A(c1464b.f5649d.f5419b - c1464b.f5648c.f5419b, 0).f5403a);
            c1351a0 = c1464b.f5649d;
        }
        return new C1393d0(c1424j, abstractC1462z, c1351a0);
    }

    /* renamed from: w */
    public static C1393d0 m3003w(long j, int i, AbstractC1462z abstractC1462z) {
        C1351a0 c1351a0M3135d = abstractC1462z.mo2921w().m3135d(Instant.m2870A(j, i));
        return new C1393d0(C1424j.m3056P(j, i, c1351a0M3135d), abstractC1462z, c1351a0M3135d);
    }

    public C1393d0(C1424j c1424j, AbstractC1462z abstractC1462z, C1351a0 c1351a0) {
        this.f5487a = c1424j;
        this.f5488b = c1351a0;
        this.f5489c = abstractC1462z;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            return true;
        }
        return interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            if (interfaceC1452r == EnumC1435a.INSTANT_SECONDS || interfaceC1452r == EnumC1435a.OFFSET_SECONDS) {
                return ((EnumC1435a) interfaceC1452r).f5602b;
            }
            return this.f5487a.mo2908l(interfaceC1452r);
        }
        return interfaceC1452r.mo3090A(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    public final int mo2878f(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            int i = AbstractC1355c0.f5424a[((EnumC1435a) interfaceC1452r).ordinal()];
            if (i == 1) {
                throw new C1455u("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.f5488b.f5419b;
            }
            return this.f5487a.mo2878f(interfaceC1452r);
        }
        return super.mo2878f(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            int i = AbstractC1355c0.f5424a[((EnumC1435a) interfaceC1452r).ordinal()];
            if (i == 1) {
                return m2964W();
            }
            if (i == 2) {
                return this.f5488b.f5419b;
            }
            return this.f5487a.mo2882j(interfaceC1452r);
        }
        return interfaceC1452r.mo3092P(this);
    }

    @Override // p077j$.time.chrono.InterfaceC1372i
    /* renamed from: o */
    public final C1351a0 mo2969o() {
        return this.f5488b;
    }

    @Override // p077j$.time.chrono.InterfaceC1372i
    /* renamed from: J */
    public final AbstractC1462z mo2963J() {
        return this.f5489c;
    }

    @Override // p077j$.time.chrono.InterfaceC1372i
    /* renamed from: D */
    public final InterfaceC1372i mo2962D(AbstractC1462z abstractC1462z) {
        Objects.requireNonNull(abstractC1462z, "zone");
        return this.f5489c.equals(abstractC1462z) ? this : m3002A(this.f5487a, abstractC1462z, this.f5488b);
    }

    @Override // p077j$.time.chrono.InterfaceC1372i
    /* renamed from: x */
    public final InterfaceC1362d mo2971x() {
        return this.f5487a;
    }

    @Override // p077j$.time.chrono.InterfaceC1372i
    /* renamed from: n */
    public final ChronoLocalDate mo2968n() {
        return this.f5487a.f5570a;
    }

    @Override // p077j$.time.chrono.InterfaceC1372i
    /* renamed from: k */
    public final C1426l mo2966k() {
        return this.f5487a.f5571b;
    }

    @Override // p077j$.time.chrono.InterfaceC1372i
    /* renamed from: I, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1393d0 mo2967m(LocalDate localDate) {
        return m3002A(C1424j.m3055I(localDate, this.f5487a.f5571b), this.f5489c, this.f5488b);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: d */
    public final InterfaceC1447m mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
            int i = AbstractC1355c0.f5424a[enumC1435a.ordinal()];
            if (i == 1) {
                return m3003w(j, this.f5487a.f5571b.f5581d, this.f5489c);
            }
            if (i != 2) {
                return m3002A(this.f5487a.mo2877d(j, interfaceC1452r), this.f5489c, this.f5488b);
            }
            C1351a0 c1351a0M2915Y = C1351a0.m2915Y(enumC1435a.f5602b.m3105a(j, enumC1435a));
            return (c1351a0M2915Y.equals(this.f5488b) || !this.f5489c.mo2921w().m3137f(this.f5487a).contains(c1351a0M2915Y)) ? this : new C1393d0(this.f5487a, this.f5489c, c1351a0M2915Y);
        }
        return (C1393d0) interfaceC1452r.mo3093V(this, j);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final C1393d0 mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (interfaceC1454t instanceof EnumC1436b) {
            EnumC1436b enumC1436b = (EnumC1436b) interfaceC1454t;
            if (enumC1436b.compareTo(EnumC1436b.DAYS) >= 0 && enumC1436b != EnumC1436b.FOREVER) {
                return m3002A(this.f5487a.mo2880h(j, interfaceC1454t), this.f5489c, this.f5488b);
            }
            C1424j c1424jMo2880h = this.f5487a.mo2880h(j, interfaceC1454t);
            C1351a0 c1351a0 = this.f5488b;
            AbstractC1462z abstractC1462z = this.f5489c;
            Objects.requireNonNull(c1424jMo2880h, "localDateTime");
            Objects.requireNonNull(c1351a0, "offset");
            Objects.requireNonNull(abstractC1462z, "zone");
            if (abstractC1462z.mo2921w().m3137f(c1424jMo2880h).contains(c1351a0)) {
                return new C1393d0(c1424jMo2880h, abstractC1462z, c1351a0);
            }
            return m3003w(c1424jMo2880h.m2956v(c1351a0), c1424jMo2880h.f5571b.f5581d, abstractC1462z);
        }
        return (C1393d0) interfaceC1454t.mo3097w(this, j);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final InterfaceC1372i mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return j == Long.MIN_VALUE ? mo2880h(Long.MAX_VALUE, interfaceC1454t).mo2880h(1L, interfaceC1454t) : mo2880h(-j, interfaceC1454t);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final InterfaceC1447m mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return j == Long.MIN_VALUE ? mo2880h(Long.MAX_VALUE, interfaceC1454t).mo2880h(1L, interfaceC1454t) : mo2880h(-j, interfaceC1454t);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5625f) {
            return this.f5487a.f5570a;
        }
        return super.mo2875b(c1421g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1393d0) {
            C1393d0 c1393d0 = (C1393d0) obj;
            if (this.f5487a.equals(c1393d0.f5487a) && this.f5488b.equals(c1393d0.f5488b) && this.f5489c.equals(c1393d0.f5489c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5487a.hashCode() ^ this.f5488b.f5419b) ^ Integer.rotateLeft(this.f5489c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f5487a.toString() + this.f5488b.f5420c;
        C1351a0 c1351a0 = this.f5488b;
        AbstractC1462z abstractC1462z = this.f5489c;
        if (c1351a0 == abstractC1462z) {
            return str;
        }
        return str + "[" + abstractC1462z.toString() + "]";
    }

    private Object writeReplace() {
        return new C1457u((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
