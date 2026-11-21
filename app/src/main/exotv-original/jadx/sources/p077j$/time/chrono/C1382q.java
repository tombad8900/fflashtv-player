package p077j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import p077j$.time.AbstractC1392d;
import p077j$.time.C1354c;
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

/* renamed from: j$.time.chrono.q */
/* loaded from: classes2.dex */
public final class C1382q extends AbstractC1360c {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a */
    public final transient C1380o f5465a;

    /* renamed from: b */
    public final transient int f5466b;

    /* renamed from: c */
    public final transient int f5467c;

    /* renamed from: d */
    public final transient int f5468d;

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: L */
    public final InterfaceC1362d mo2892L(C1426l c1426l) {
        return new C1366f(this, c1426l);
    }

    public C1382q(C1380o c1380o, int i, int i4, int i8) {
        c1380o.m2985Z(i, i4, i8);
        this.f5465a = c1380o;
        this.f5466b = i;
        this.f5467c = i4;
        this.f5468d = i8;
    }

    public C1382q(C1380o c1380o, long j) {
        int i = (int) j;
        c1380o.m2983X();
        if (i < c1380o.f5457e || i >= c1380o.f5458f) {
            throw new C1354c("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(c1380o.f5456d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int i4 = c1380o.f5459g;
        int[] iArr = {(iBinarySearch + i4) / 12, ((i4 + iBinarySearch) % 12) + 1, (i - c1380o.f5456d[iBinarySearch]) + 1};
        this.f5465a = c1380o;
        this.f5466b = iArr[0];
        this.f5467c = iArr[1];
        this.f5468d = iArr[2];
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: e */
    public final InterfaceC1377l mo2901e() {
        return this.f5465a;
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: N */
    public final InterfaceC1378m mo2893N() {
        return EnumC1383r.f5469AH;
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
        int i = AbstractC1381p.f5464a[enumC1435a.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.f5465a.mo2942y(enumC1435a) : C1456v.m3103f(1L, 5L) : C1456v.m3103f(1L, this.f5465a.m2987c0(this.f5466b, 12)) : C1456v.m3103f(1L, this.f5465a.m2986a0(this.f5466b, this.f5467c));
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return interfaceC1452r.mo3092P(this);
        }
        switch (AbstractC1381p.f5464a[((EnumC1435a) interfaceC1452r).ordinal()]) {
            case 1:
                return this.f5468d;
            case 2:
                return m2988P();
            case 3:
                return ((this.f5468d - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(mo2891K() + 3, 7)) + 1;
            case 5:
                return ((this.f5468d - 1) % 7) + 1;
            case 6:
                return ((m2988P() - 1) % 7) + 1;
            case 7:
                return mo2891K();
            case 8:
                return ((m2988P() - 1) / 7) + 1;
            case 9:
                return this.f5467c;
            case 10:
                return ((this.f5466b * 12) + this.f5467c) - 1;
            case 11:
                return this.f5466b;
            case 12:
                return this.f5466b;
            case 13:
                return this.f5466b <= 1 ? 0 : 1;
            default:
                throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final C1382q mo2877d(long j, InterfaceC1452r interfaceC1452r) {
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return (C1382q) super.mo2877d(j, interfaceC1452r);
        }
        EnumC1435a enumC1435a = (EnumC1435a) interfaceC1452r;
        this.f5465a.mo2942y(enumC1435a).m3106b(j, enumC1435a);
        int i = (int) j;
        switch (AbstractC1381p.f5464a[enumC1435a.ordinal()]) {
            case 1:
                return m2991Y(this.f5466b, this.f5467c, i);
            case 2:
                return mo2945A(Math.min(i, this.f5465a.m2987c0(this.f5466b, 12)) - m2988P());
            case 3:
                return mo2945A((j - mo2882j(EnumC1435a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return mo2945A(j - (((int) Math.floorMod(mo2891K() + 3, 7)) + 1));
            case 5:
                return mo2945A(j - mo2882j(EnumC1435a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return mo2945A(j - mo2882j(EnumC1435a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new C1382q(this.f5465a, j);
            case 8:
                return mo2945A((j - mo2882j(EnumC1435a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return m2991Y(this.f5466b, i, this.f5468d);
            case 10:
                return mo2946F(j - (((this.f5466b * 12) + this.f5467c) - 1));
            case 11:
                if (this.f5466b < 1) {
                    i = 1 - i;
                }
                return m2991Y(i, this.f5467c, this.f5468d);
            case 12:
                return m2991Y(i, this.f5467c, this.f5468d);
            case 13:
                return m2991Y(1 - this.f5466b, this.f5467c, this.f5468d);
            default:
                throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
    }

    /* renamed from: Y */
    public final C1382q m2991Y(int i, int i4, int i8) {
        int iM2986a0 = this.f5465a.m2986a0(i, i4);
        if (i8 > iM2986a0) {
            i8 = iM2986a0;
        }
        return new C1382q(this.f5465a, i, i4, i8);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: g */
    public final InterfaceC1447m mo2967m(LocalDate localDate) {
        return (C1382q) super.mo2967m(localDate);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: m */
    public final ChronoLocalDate mo2967m(InterfaceC1449o interfaceC1449o) {
        return (C1382q) super.mo2967m(interfaceC1449o);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: R */
    public final ChronoLocalDate mo2895R(InterfaceC1451q interfaceC1451q) {
        return (C1382q) super.mo2895R(interfaceC1451q);
    }

    @Override // p077j$.time.chrono.ChronoLocalDate
    /* renamed from: K */
    public final long mo2891K() {
        return this.f5465a.m2985Z(this.f5466b, this.f5467c, this.f5468d);
    }

    /* renamed from: P */
    public final int m2988P() {
        return this.f5465a.m2987c0(this.f5466b, this.f5467c - 1) + this.f5468d;
    }

    @Override // p077j$.time.chrono.AbstractC1360c
    /* renamed from: I */
    public final ChronoLocalDate mo2947I(long j) {
        return j == 0 ? this : m2991Y(Math.addExact(this.f5466b, (int) j), this.f5467c, this.f5468d);
    }

    @Override // p077j$.time.chrono.AbstractC1360c
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C1382q mo2946F(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = (this.f5466b * 12) + (this.f5467c - 1) + j;
        C1380o c1380o = this.f5465a;
        long jFloorDiv = Math.floorDiv(j8, 12L);
        int i = c1380o.f5459g;
        if (jFloorDiv >= i / 12 && jFloorDiv <= (((c1380o.f5456d.length - 1) + i) / 12) - 1) {
            return m2991Y((int) jFloorDiv, ((int) Math.floorMod(j8, 12L)) + 1, this.f5468d);
        }
        throw new C1354c("Invalid Hijrah year: " + jFloorDiv);
    }

    @Override // p077j$.time.chrono.AbstractC1360c
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C1382q mo2945A(long j) {
        return new C1382q(this.f5465a, mo2891K() + j);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: h */
    public final ChronoLocalDate mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        return (C1382q) super.mo2880h(j, interfaceC1454t);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: h */
    public final InterfaceC1447m mo2880h(long j, InterfaceC1454t interfaceC1454t) {
        return (C1382q) super.mo2880h(j, interfaceC1454t);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final ChronoLocalDate mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return (C1382q) super.mo2874a(j, interfaceC1454t);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate, p077j$.time.temporal.InterfaceC1447m
    /* renamed from: a */
    public final InterfaceC1447m mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return (C1382q) super.mo2874a(j, interfaceC1454t);
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1382q) {
            C1382q c1382q = (C1382q) obj;
            if (this.f5466b == c1382q.f5466b && this.f5467c == c1382q.f5467c && this.f5468d == c1382q.f5468d && this.f5465a.equals(c1382q.f5465a)) {
                return true;
            }
        }
        return false;
    }

    @Override // p077j$.time.chrono.AbstractC1360c, p077j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i = this.f5466b;
        int i4 = this.f5467c;
        int i8 = this.f5468d;
        this.f5465a.getClass();
        return (((i << 11) + (i4 << 6)) + i8) ^ ((i & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1365e0((byte) 6, this);
    }
}
