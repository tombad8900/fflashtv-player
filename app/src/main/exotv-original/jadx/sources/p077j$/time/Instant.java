package p077j$.time;

import androidx.media3.common.C0253x0;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p077j$.time.format.C1413r;
import p077j$.time.format.DateTimeFormatter;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* loaded from: classes2.dex */
public final class Instant implements InterfaceC1447m, InterfaceC1449o, Comparable<Instant>, Serializable {

    /* renamed from: c */
    public static final Instant f5405c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a */
    public final long f5406a;

    /* renamed from: b */
    public final int f5407b;

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f5406a, instant2.f5406a);
        return iCompare != 0 ? iCompare : this.f5407b - instant2.f5407b;
    }

    static {
        m2870A(-31557014167219200L, 0L);
        m2870A(31556889864403199L, 999999999L);
    }

    /* renamed from: A */
    public static Instant m2870A(long j, long j8) {
        return m2871w(Math.addExact(j, Math.floorDiv(j8, 1000000000L)), (int) Math.floorMod(j8, 1000000000L));
    }

    /* renamed from: w */
    public static Instant m2871w(long j, int i) {
        if ((i | j) == 0) {
            return f5405c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new C1354c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public Instant(long j, int i) {
        this.f5406a = j;
        this.f5407b = i;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        return interfaceC1452r instanceof EnumC1435a ? interfaceC1452r == EnumC1435a.INSTANT_SECONDS || interfaceC1452r == EnumC1435a.NANO_OF_SECOND || interfaceC1452r == EnumC1435a.MICRO_OF_SECOND || interfaceC1452r == EnumC1435a.MILLI_OF_SECOND : interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    public final int mo2878f(InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return super.mo2908l(interfaceC1452r).m3105a(interfaceC1452r.mo3092P(this), interfaceC1452r);
        }
        int i = AbstractC1395f.f5492a[((EnumC1435a) interfaceC1452r).ordinal()];
        if (i == 1) {
            return this.f5407b;
        }
        if (i == 2) {
            return this.f5407b / 1000;
        }
        if (i == 3) {
            return this.f5407b / C0253x0.CUSTOM_ERROR_CODE_BASE;
        }
        if (i == 4) {
            EnumC1435a enumC1435a = EnumC1435a.INSTANT_SECONDS;
            enumC1435a.f5602b.m3105a(this.f5406a, enumC1435a);
        }
        throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        int i;
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return interfaceC1452r.mo3092P(this);
        }
        int i4 = AbstractC1395f.f5492a[((EnumC1435a) interfaceC1452r).ordinal()];
        if (i4 == 1) {
            i = this.f5407b;
        } else if (i4 == 2) {
            i = this.f5407b / 1000;
        } else {
            if (i4 != 3) {
                if (i4 == 4) {
                    return this.f5406a;
                }
                throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
            }
            i = this.f5407b / C0253x0.CUSTOM_ERROR_CODE_BASE;
        }
        return i;
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: g */
    public final InterfaceC1447m mo2910m(LocalDate localDate) {
        return (Instant) localDate.mo2876c(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: d */
    public final InterfaceC1447m mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return (Instant) interfaceC1452r.mo3093V(this, j);
        }
        EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
        enumC1435a.m3094X(j);
        int i = AbstractC1395f.f5492a[enumC1435a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i4 = ((int) j) * 1000;
                if (i4 != this.f5407b) {
                    return m2871w(this.f5406a, i4);
                }
            } else if (i == 3) {
                int i8 = ((int) j) * C0253x0.CUSTOM_ERROR_CODE_BASE;
                if (i8 != this.f5407b) {
                    return m2871w(this.f5406a, i8);
                }
            } else {
                if (i != 4) {
                    throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
                }
                if (j != this.f5406a) {
                    return m2871w(j, this.f5407b);
                }
            }
        } else if (j != this.f5407b) {
            return m2871w(this.f5406a, (int) j);
        }
        return this;
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final Instant mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (!(interfaceC1454t instanceof EnumC1436b)) {
            return (Instant) interfaceC1454t.mo3097w(this, j);
        }
        switch (AbstractC1395f.f5493b[((EnumC1436b) interfaceC1454t).ordinal()]) {
            case 1:
                return m2872F(0L, j);
            case 2:
                return m2872F(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return m2872F(j / 1000, (j % 1000) * 1000000);
            case 4:
                return m2872F(j, 0L);
            case 5:
                return m2872F(Math.multiplyExact(j, 60), 0L);
            case 6:
                return m2872F(Math.multiplyExact(j, 3600), 0L);
            case 7:
                return m2872F(Math.multiplyExact(j, 43200), 0L);
            case 8:
                return m2872F(Math.multiplyExact(j, 86400), 0L);
            default:
                throw new C1455u("Unsupported unit: " + interfaceC1454t);
        }
    }

    /* renamed from: F */
    public final Instant m2872F(long j, long j8) {
        if ((j | j8) == 0) {
            return this;
        }
        return m2870A(Math.addExact(Math.addExact(this.f5406a, j), j8 / 1000000000), this.f5407b + (j8 % 1000000000));
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final InterfaceC1447m mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return j == Long.MIN_VALUE ? mo2880h(Long.MAX_VALUE, interfaceC1454t).mo2880h(1L, interfaceC1454t) : mo2880h(-j, interfaceC1454t);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5622c) {
            return EnumC1436b.NANOS;
        }
        if (c1421g == AbstractC1453s.f5621b || c1421g == AbstractC1453s.f5620a || c1421g == AbstractC1453s.f5624e || c1421g == AbstractC1453s.f5623d || c1421g == AbstractC1453s.f5625f || c1421g == AbstractC1453s.f5626g) {
            return null;
        }
        return c1421g.m3053l(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    public final InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        return interfaceC1447m.mo2877d(this.f5406a, EnumC1435a.INSTANT_SECONDS).mo2877d(this.f5407b, EnumC1435a.NANO_OF_SECOND);
    }

    public long toEpochMilli() {
        long j = this.f5406a;
        return (j >= 0 || this.f5407b <= 0) ? Math.addExact(Math.multiplyExact(j, 1000), this.f5407b / C0253x0.CUSTOM_ERROR_CODE_BASE) : Math.addExact(Math.multiplyExact(j + 1, 1000), (this.f5407b / C0253x0.CUSTOM_ERROR_CODE_BASE) - 1000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f5406a == instant.f5406a && this.f5407b == instant.f5407b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5406a;
        return (this.f5407b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f5494f;
        StringBuilder sb = new StringBuilder(32);
        try {
            dateTimeFormatter.f5495a.mo3009w(new C1413r(this, dateTimeFormatter), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new C1354c(e.getMessage(), e);
        }
    }

    private Object writeReplace() {
        return new C1457u((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
