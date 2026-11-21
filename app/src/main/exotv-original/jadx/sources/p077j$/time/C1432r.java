package p077j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p077j$.time.chrono.C1384s;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.r */
/* loaded from: classes2.dex */
public final class C1432r implements InterfaceC1447m, InterfaceC1449o, Comparable, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f5590c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a */
    public final C1424j f5591a;

    /* renamed from: b */
    public final C1351a0 f5592b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        C1432r c1432r = (C1432r) obj;
        if (this.f5592b.equals(c1432r.f5592b)) {
            iCompare = this.f5591a.compareTo(c1432r.f5591a);
        } else {
            iCompare = Long.compare(this.f5591a.m2956v(this.f5592b), c1432r.f5591a.m2956v(c1432r.f5592b));
            if (iCompare == 0) {
                iCompare = this.f5591a.f5571b.f5581d - c1432r.f5591a.f5571b.f5581d;
            }
        }
        return iCompare == 0 ? this.f5591a.compareTo(c1432r.f5591a) : iCompare;
    }

    static {
        C1424j c1424j = C1424j.f5568c;
        C1351a0 c1351a0 = C1351a0.f5418h;
        c1424j.getClass();
        new C1432r(c1424j, c1351a0);
        C1424j c1424j2 = C1424j.f5569d;
        C1351a0 c1351a02 = C1351a0.f5417g;
        c1424j2.getClass();
        new C1432r(c1424j2, c1351a02);
    }

    public C1432r(C1424j c1424j, C1351a0 c1351a0) {
        Objects.requireNonNull(c1424j, "dateTime");
        this.f5591a = c1424j;
        Objects.requireNonNull(c1351a0, "offset");
        this.f5592b = c1351a0;
    }

    /* renamed from: A */
    public final C1432r m3085A(C1424j c1424j, C1351a0 c1351a0) {
        return (this.f5591a == c1424j && this.f5592b.equals(c1351a0)) ? this : new C1432r(c1424j, c1351a0);
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
            if (interfaceC1452r != EnumC1435a.INSTANT_SECONDS && interfaceC1452r != EnumC1435a.OFFSET_SECONDS) {
                return this.f5591a.mo2908l(interfaceC1452r);
            }
            return ((EnumC1435a) interfaceC1452r).f5602b;
        }
        return interfaceC1452r.mo3090A(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    public final int mo2878f(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            int i = AbstractC1431q.f5589a[((EnumC1435a) interfaceC1452r).ordinal()];
            if (i == 1) {
                throw new C1455u("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.f5592b.f5419b;
            }
            return this.f5591a.mo2878f(interfaceC1452r);
        }
        return super.mo2878f(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            int i = AbstractC1431q.f5589a[((EnumC1435a) interfaceC1452r).ordinal()];
            if (i == 1) {
                return this.f5591a.m2956v(this.f5592b);
            }
            if (i == 2) {
                return this.f5592b.f5419b;
            }
            return this.f5591a.mo2882j(interfaceC1452r);
        }
        return interfaceC1452r.mo3092P(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: g */
    public final InterfaceC1447m mo2967m(LocalDate localDate) {
        C1424j c1424j = this.f5591a;
        return m3085A(c1424j.m3062a0(localDate, c1424j.f5571b), this.f5592b);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: d */
    public final InterfaceC1447m mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
            int i = AbstractC1431q.f5589a[enumC1435a.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return m3085A(this.f5591a, C1351a0.m2915Y(enumC1435a.f5602b.m3105a(j, enumC1435a)));
                }
                return m3085A(this.f5591a.mo2877d(j, interfaceC1452r), this.f5592b);
            }
            Instant instantM2870A = Instant.m2870A(j, this.f5591a.f5571b.f5581d);
            C1351a0 c1351a0 = this.f5592b;
            Objects.requireNonNull(instantM2870A, "instant");
            Objects.requireNonNull(c1351a0, "zone");
            C1351a0 c1351a0M3135d = c1351a0.mo2921w().m3135d(instantM2870A);
            return new C1432r(C1424j.m3056P(instantM2870A.f5406a, instantM2870A.f5407b, c1351a0M3135d), c1351a0M3135d);
        }
        return (C1432r) interfaceC1452r.mo3093V(this, j);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final C1432r mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (interfaceC1454t instanceof EnumC1436b) {
            return m3085A(this.f5591a.mo2880h(j, interfaceC1454t), this.f5592b);
        }
        return (C1432r) interfaceC1454t.mo3097w(this, j);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final InterfaceC1447m mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return j == Long.MIN_VALUE ? mo2880h(Long.MAX_VALUE, interfaceC1454t).mo2880h(1L, interfaceC1454t) : mo2880h(-j, interfaceC1454t);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5623d || c1421g == AbstractC1453s.f5624e) {
            return this.f5592b;
        }
        if (c1421g == AbstractC1453s.f5620a) {
            return null;
        }
        if (c1421g == AbstractC1453s.f5625f) {
            return this.f5591a.f5570a;
        }
        if (c1421g == AbstractC1453s.f5626g) {
            return this.f5591a.f5571b;
        }
        if (c1421g == AbstractC1453s.f5621b) {
            return C1384s.f5471c;
        }
        if (c1421g == AbstractC1453s.f5622c) {
            return EnumC1436b.NANOS;
        }
        return c1421g.m3053l(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    public final InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        return interfaceC1447m.mo2877d(this.f5591a.f5570a.mo2891K(), EnumC1435a.EPOCH_DAY).mo2877d(this.f5591a.f5571b.m3075d0(), EnumC1435a.NANO_OF_DAY).mo2877d(this.f5592b.f5419b, EnumC1435a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1432r) {
            C1432r c1432r = (C1432r) obj;
            if (this.f5591a.equals(c1432r.f5591a) && this.f5592b.equals(c1432r.f5592b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5591a.hashCode() ^ this.f5592b.f5419b;
    }

    public final String toString() {
        return this.f5591a.toString() + this.f5592b.f5420c;
    }

    private Object writeReplace() {
        return new C1457u((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
