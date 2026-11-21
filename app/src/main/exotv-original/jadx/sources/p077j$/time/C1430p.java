package p077j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import okhttp3.C2181z;
import p077j$.time.chrono.C1384s;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.format.C1410o;
import p077j$.time.format.EnumC1418w;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;

/* renamed from: j$.time.p */
/* loaded from: classes2.dex */
public final class C1430p implements InterfaceC1448n, InterfaceC1449o, Comparable, Serializable {

    /* renamed from: c */
    public static final /* synthetic */ int f5586c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a */
    public final int f5587a;

    /* renamed from: b */
    public final int f5588b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1430p c1430p = (C1430p) obj;
        int i = this.f5587a - c1430p.f5587a;
        return i == 0 ? this.f5588b - c1430p.f5588b : i;
    }

    static {
        C1410o c1410o = new C1410o();
        c1410o.m3027d("--");
        c1410o.m3030g(EnumC1435a.MONTH_OF_YEAR, 2);
        c1410o.m3026c('-');
        c1410o.m3030g(EnumC1435a.DAY_OF_MONTH, 2);
        c1410o.m3035l(Locale.getDefault(), EnumC1418w.SMART, null);
    }

    public C1430p(int i, int i4) {
        this.f5587a = i;
        this.f5588b = i4;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        return interfaceC1452r instanceof EnumC1435a ? interfaceC1452r == EnumC1435a.MONTH_OF_YEAR || interfaceC1452r == EnumC1435a.DAY_OF_MONTH : interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.MONTH_OF_YEAR) {
            return interfaceC1452r.mo3091I();
        }
        if (interfaceC1452r != EnumC1435a.DAY_OF_MONTH) {
            return super.mo2908l(interfaceC1452r);
        }
        EnumC1428n enumC1428nM3081I = EnumC1428n.m3081I(this.f5587a);
        enumC1428nM3081I.getClass();
        int i = AbstractC1427m.f5582a[enumC1428nM3081I.ordinal()];
        return C1456v.m3104g(i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, EnumC1428n.m3081I(this.f5587a).m3083F());
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    public final int mo2878f(InterfaceC1452r interfaceC1452r) {
        return mo2908l(interfaceC1452r).m3105a(mo2882j(interfaceC1452r), interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        int i;
        if (!(interfaceC1452r instanceof EnumC1435a)) {
            return interfaceC1452r.mo3092P(this);
        }
        int i4 = AbstractC1429o.f5585a[((EnumC1435a) interfaceC1452r).ordinal()];
        if (i4 == 1) {
            i = this.f5588b;
        } else {
            if (i4 != 2) {
                throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
            }
            i = this.f5587a;
        }
        return i;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5621b) {
            return C1384s.f5471c;
        }
        return super.mo2875b(c1421g);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    public final InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        if (!InterfaceC1377l.m2980r(interfaceC1447m).equals(C1384s.f5471c)) {
            throw new C1354c("Adjustment only supported on ISO date-time");
        }
        InterfaceC1447m interfaceC1447mMo2877d = interfaceC1447m.mo2877d(this.f5587a, EnumC1435a.MONTH_OF_YEAR);
        EnumC1435a enumC1435a = EnumC1435a.DAY_OF_MONTH;
        return interfaceC1447mMo2877d.mo2877d(Math.min(interfaceC1447mMo2877d.mo2908l(enumC1435a).f5630d, this.f5588b), enumC1435a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1430p) {
            C1430p c1430p = (C1430p) obj;
            if (this.f5587a == c1430p.f5587a && this.f5588b == c1430p.f5588b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5587a << 6) + this.f5588b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.f5587a < 10 ? "0" : C2181z.FRAGMENT_ENCODE_SET);
        sb.append(this.f5587a);
        sb.append(this.f5588b < 10 ? "-0" : "-");
        sb.append(this.f5588b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C1457u((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
