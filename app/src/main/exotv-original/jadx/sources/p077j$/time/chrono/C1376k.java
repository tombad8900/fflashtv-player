package p077j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1351a0;
import p077j$.time.C1424j;
import p077j$.time.Duration;
import p077j$.time.Instant;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1452r;
import p077j$.time.temporal.InterfaceC1454t;
import p077j$.time.zone.C1464b;
import p077j$.time.zone.C1468f;

/* renamed from: j$.time.chrono.k */
/* loaded from: classes2.dex */
public final class C1376k implements InterfaceC1372i, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a */
    public final transient C1366f f5450a;

    /* renamed from: b */
    public final transient C1351a0 f5451b;

    /* renamed from: c */
    public final transient AbstractC1462z f5452c;

    /* renamed from: A */
    public static C1376k m2975A(AbstractC1462z abstractC1462z, C1351a0 c1351a0, C1366f c1366f) {
        Objects.requireNonNull(c1366f, "localDateTime");
        Objects.requireNonNull(abstractC1462z, "zone");
        if (abstractC1462z instanceof C1351a0) {
            return new C1376k(abstractC1462z, (C1351a0) abstractC1462z, c1366f);
        }
        C1468f c1468fMo2921w = abstractC1462z.mo2921w();
        C1424j c1424jM3054A = C1424j.m3054A(c1366f);
        List listM3137f = c1468fMo2921w.m3137f(c1424jM3054A);
        if (listM3137f.size() == 1) {
            c1351a0 = (C1351a0) listM3137f.get(0);
        } else if (listM3137f.size() != 0) {
            if (c1351a0 == null || !listM3137f.contains(c1351a0)) {
                c1351a0 = (C1351a0) listM3137f.get(0);
            }
            c1366f = c1366f;
        } else {
            Object objM3136e = c1468fMo2921w.m3136e(c1424jM3054A);
            C1464b c1464b = objM3136e instanceof C1464b ? (C1464b) objM3136e : null;
            c1366f = c1366f.m2959F(c1366f.f5435a, 0L, 0L, Duration.m2867A(c1464b.f5649d.f5419b - c1464b.f5648c.f5419b, 0).f5403a, 0L);
            c1351a0 = c1464b.f5649d;
        }
        Objects.requireNonNull(c1351a0, "offset");
        return new C1376k(abstractC1462z, c1351a0, c1366f);
    }

    /* renamed from: F */
    public static C1376k m2976F(InterfaceC1377l interfaceC1377l, Instant instant, AbstractC1462z abstractC1462z) {
        C1351a0 c1351a0M3135d = abstractC1462z.mo2921w().m3135d(instant);
        Objects.requireNonNull(c1351a0M3135d, "offset");
        return new C1376k(abstractC1462z, c1351a0M3135d, (C1366f) interfaceC1377l.mo2981H(C1424j.m3056P(instant.f5406a, instant.f5407b, c1351a0M3135d)));
    }

    /* renamed from: w */
    public static C1376k m2977w(InterfaceC1377l interfaceC1377l, InterfaceC1447m interfaceC1447m) {
        C1376k c1376k = (C1376k) interfaceC1447m;
        if (interfaceC1377l.equals(c1376k.m2965e())) {
            return c1376k;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC1377l.mo2939q() + ", actual: " + c1376k.m2965e().mo2939q());
    }

    public C1376k(AbstractC1462z abstractC1462z, C1351a0 c1351a0, C1366f c1366f) {
        Objects.requireNonNull(c1366f, "dateTime");
        this.f5450a = c1366f;
        Objects.requireNonNull(c1351a0, "offset");
        this.f5451b = c1351a0;
        Objects.requireNonNull(abstractC1462z, "zone");
        this.f5452c = abstractC1462z;
    }

    @Override // p077j$.time.chrono.InterfaceC1372i
    /* renamed from: o */
    public final C1351a0 mo2969o() {
        return this.f5451b;
    }

    public final int hashCode() {
        return (this.f5450a.hashCode() ^ this.f5451b.f5419b) ^ Integer.rotateLeft(this.f5452c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f5450a.toString() + this.f5451b.f5420c;
        C1351a0 c1351a0 = this.f5451b;
        AbstractC1462z abstractC1462z = this.f5452c;
        if (c1351a0 == abstractC1462z) {
            return str;
        }
        return str + "[" + abstractC1462z.toString() + "]";
    }

    @Override // p077j$.time.chrono.InterfaceC1372i
    /* renamed from: x */
    public final InterfaceC1362d mo2971x() {
        return this.f5450a;
    }

    @Override // p077j$.time.chrono.InterfaceC1372i
    /* renamed from: J */
    public final AbstractC1462z mo2963J() {
        return this.f5452c;
    }

    @Override // p077j$.time.chrono.InterfaceC1372i
    /* renamed from: D */
    public final InterfaceC1372i mo2962D(AbstractC1462z abstractC1462z) {
        return m2975A(abstractC1462z, this.f5451b, this.f5450a);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            return true;
        }
        return interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: d */
    public final InterfaceC1447m mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r instanceof EnumC1435a) {
            EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
            int i = AbstractC1374j.f5447a[enumC1435a.ordinal()];
            if (i == 1) {
                return mo2880h(j - m2964W(), EnumC1436b.SECONDS);
            }
            if (i == 2) {
                C1351a0 c1351a0M2915Y = C1351a0.m2915Y(enumC1435a.f5602b.m3105a(j, enumC1435a));
                return m2976F(m2965e(), Instant.m2870A(this.f5450a.m2956v(c1351a0M2915Y), r5.f5436b.f5581d), this.f5452c);
            }
            return m2975A(this.f5452c, this.f5451b, this.f5450a.mo2877d(j, interfaceC1452r));
        }
        return m2977w(m2965e(), interfaceC1452r.mo3093V(this, j));
    }

    @Override // p077j$.time.temporal.InterfaceC1447m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final C1376k mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        if (interfaceC1454t instanceof EnumC1436b) {
            return (C1376k) mo2967m(this.f5450a.mo2880h(j, interfaceC1454t));
        }
        return m2977w(m2965e(), interfaceC1454t.mo3097w(this, j));
    }

    private Object writeReplace() {
        return new C1365e0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1372i) && compareTo((InterfaceC1372i) obj) == 0;
    }
}
