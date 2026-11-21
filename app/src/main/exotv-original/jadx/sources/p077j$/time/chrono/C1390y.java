package p077j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p077j$.time.C1354c;
import p077j$.time.LocalDate;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1452r;

/* renamed from: j$.time.chrono.y */
/* loaded from: classes2.dex */
public final class C1390y implements InterfaceC1378m, Serializable {

    /* renamed from: d */
    public static final C1390y f5481d;

    /* renamed from: e */
    public static final C1390y[] f5482e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a */
    public final transient int f5483a;

    /* renamed from: b */
    public final transient LocalDate f5484b;

    /* renamed from: c */
    public final transient String f5485c;

    static {
        C1390y c1390y = new C1390y(-1, LocalDate.m2886b0(1868, 1, 1), "Meiji");
        f5481d = c1390y;
        f5482e = new C1390y[]{c1390y, new C1390y(0, LocalDate.m2886b0(1912, 7, 30), "Taisho"), new C1390y(1, LocalDate.m2886b0(1926, 12, 25), "Showa"), new C1390y(2, LocalDate.m2886b0(1989, 1, 8), "Heisei"), new C1390y(3, LocalDate.m2886b0(2019, 5, 1), "Reiwa")};
    }

    /* renamed from: q */
    public final C1390y m3000q() {
        if (this == f5482e[r0.length - 1]) {
            return null;
        }
        return m2999r(this.f5483a + 1);
    }

    public C1390y(int i, LocalDate localDate, String str) {
        this.f5483a = i;
        this.f5484b = localDate;
        this.f5485c = str;
    }

    /* renamed from: r */
    public static C1390y m2999r(int i) {
        int i4 = i + 1;
        if (i4 >= 0) {
            C1390y[] c1390yArr = f5482e;
            if (i4 < c1390yArr.length) {
                return c1390yArr[i4];
            }
        }
        throw new C1354c("Invalid era: " + i);
    }

    /* renamed from: p */
    public static C1390y m2998p(LocalDate localDate) {
        if (localDate.m2898X(C1389x.f5477d)) {
            throw new C1354c("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = f5482e.length - 1; length >= 0; length--) {
            C1390y c1390y = f5482e[length];
            if (localDate.compareTo(c1390y.f5484b) >= 0) {
                return c1390y;
            }
        }
        return null;
    }

    @Override // p077j$.time.chrono.InterfaceC1378m
    public final int getValue() {
        return this.f5483a;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        EnumC1435a enumC1435a = EnumC1435a.ERA;
        if (interfaceC1452r == enumC1435a) {
            return C1387v.f5475c.mo2942y(enumC1435a);
        }
        return super.mo2908l(interfaceC1452r);
    }

    public final String toString() {
        return this.f5485c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1365e0((byte) 5, this);
    }
}
