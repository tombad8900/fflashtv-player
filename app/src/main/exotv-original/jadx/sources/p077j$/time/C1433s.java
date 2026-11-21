package p077j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;

/* renamed from: j$.time.s */
/* loaded from: classes2.dex */
public final class C1433s implements InterfaceC1447m, InterfaceC1449o, Comparable, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f5593c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a */
    public final C1426l f5594a;

    /* renamed from: b */
    public final C1351a0 f5595b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1433s c1433s = (C1433s) obj;
        if (this.f5595b.equals(c1433s.f5595b)) {
            return this.f5594a.compareTo(c1433s.f5594a);
        }
        int iCompare = Long.compare(this.f5594a.m3075d0() - (this.f5595b.f5419b * 1000000000), c1433s.f5594a.m3075d0() - (c1433s.f5595b.f5419b * 1000000000));
        return iCompare == 0 ? this.f5594a.compareTo(c1433s.f5594a) : iCompare;
    }

    static {
        C1426l c1426l = C1426l.f5574e;
        C1351a0 c1351a0 = C1351a0.f5418h;
        c1426l.getClass();
        new C1433s(c1426l, c1351a0);
        C1426l c1426l2 = C1426l.f5575f;
        C1351a0 c1351a02 = C1351a0.f5417g;
        c1426l2.getClass();
        new C1433s(c1426l2, c1351a02);
    }

    public C1433s(C1426l c1426l, C1351a0 c1351a0) {
        Objects.requireNonNull(c1426l, "time");
        this.f5594a = c1426l;
        Objects.requireNonNull(c1351a0, "offset");
        this.f5595b = c1351a0;
    }

    /* renamed from: A */
    public final C1433s m3087A(C1426l c1426l, C1351a0 c1351a0) {
        return (this.f5594a == c1426l && this.f5595b.equals(c1351a0)) ? this : new C1433s(c1426l, c1351a0);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        return interfaceC1452r instanceof EnumC1435a ? ((EnumC1435a) interfaceC1452r).m3095Y() || interfaceC1452r == EnumC1435a.OFFSET_SECONDS : interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            if (interfaceC1452r != EnumC1435a.OFFSET_SECONDS) {
                return this.f5594a.mo2908l(interfaceC1452r);
            }
            return ((EnumC1435a) interfaceC1452r).f5602b;
        }
        return interfaceC1452r.mo3090A(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            if (interfaceC1452r == EnumC1435a.OFFSET_SECONDS) {
                return this.f5595b.f5419b;
            }
            return this.f5594a.mo2882j(interfaceC1452r);
        }
        return interfaceC1452r.mo3092P(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: g */
    public final InterfaceC1447m mo2967m(LocalDate localDate) {
        return (C1433s) localDate.mo2876c(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: d */
    public final InterfaceC1447m mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            if (interfaceC1452r == EnumC1435a.OFFSET_SECONDS) {
                EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
                return m3087A(this.f5594a, C1351a0.m2915Y(enumC1435a.f5602b.m3105a(j, enumC1435a)));
            }
            return m3087A(this.f5594a.mo2877d(j, interfaceC1452r), this.f5595b);
        }
        return (C1433s) interfaceC1452r.mo3093V(this, j);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final C1433s mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (interfaceC1454t instanceof EnumC1436b) {
            return m3087A(this.f5594a.mo2880h(j, interfaceC1454t), this.f5595b);
        }
        return (C1433s) interfaceC1454t.mo3097w(this, j);
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
            return this.f5595b;
        }
        if (((c1421g == AbstractC1453s.f5620a) || (c1421g == AbstractC1453s.f5621b)) || c1421g == AbstractC1453s.f5625f) {
            return null;
        }
        if (c1421g == AbstractC1453s.f5626g) {
            return this.f5594a;
        }
        if (c1421g == AbstractC1453s.f5622c) {
            return EnumC1436b.NANOS;
        }
        return c1421g.m3053l(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    public final InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        return interfaceC1447m.mo2877d(this.f5594a.m3075d0(), EnumC1435a.NANO_OF_DAY).mo2877d(this.f5595b.f5419b, EnumC1435a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1433s) {
            C1433s c1433s = (C1433s) obj;
            if (this.f5594a.equals(c1433s.f5594a) && this.f5595b.equals(c1433s.f5595b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5594a.hashCode() ^ this.f5595b.f5419b;
    }

    public final String toString() {
        return this.f5594a.toString() + this.f5595b.f5420c;
    }

    private Object writeReplace() {
        return new C1457u((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
