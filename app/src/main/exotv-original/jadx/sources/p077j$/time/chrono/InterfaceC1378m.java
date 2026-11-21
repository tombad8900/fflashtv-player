package p077j$.time.chrono;

import p077j$.time.AbstractC1392d;
import p077j$.time.C1421g;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1455u;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.EnumC1436b;
import p077j$.time.temporal.InterfaceC1447m;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.temporal.InterfaceC1449o;
import p077j$.time.temporal.InterfaceC1452r;

/* renamed from: j$.time.chrono.m */
/* loaded from: classes2.dex */
public interface InterfaceC1378m extends InterfaceC1448n, InterfaceC1449o {
    int getValue();

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    default boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        return interfaceC1452r instanceof EnumC1435a ? interfaceC1452r == EnumC1435a.ERA : interfaceC1452r != null && interfaceC1452r.mo3096w(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: f */
    default int mo2878f(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.ERA) {
            return getValue();
        }
        return super.mo2878f(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    default long mo2882j(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.ERA) {
            return getValue();
        }
        if (interfaceC1452r instanceof EnumC1435a) {
            throw new C1455u(AbstractC1392d.m3001a("Unsupported field: ", interfaceC1452r));
        }
        return interfaceC1452r.mo3092P(this);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    default Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5622c) {
            return EnumC1436b.ERAS;
        }
        return super.mo2875b(c1421g);
    }

    @Override // p077j$.time.temporal.InterfaceC1449o
    /* renamed from: c */
    default InterfaceC1447m mo2876c(InterfaceC1447m interfaceC1447m) {
        return interfaceC1447m.mo2877d(getValue(), EnumC1435a.ERA);
    }
}
