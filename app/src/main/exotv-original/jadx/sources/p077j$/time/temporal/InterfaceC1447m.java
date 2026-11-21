package p077j$.time.temporal;

import p077j$.time.LocalDate;

/* renamed from: j$.time.temporal.m */
/* loaded from: classes2.dex */
public interface InterfaceC1447m extends InterfaceC1448n {
    /* renamed from: d */
    InterfaceC1447m mo2877d(long j, InterfaceC1452r interfaceC1452r);

    /* renamed from: g */
    InterfaceC1447m mo2910m(LocalDate localDate);

    /* renamed from: h */
    InterfaceC1447m mo2880h(long j, InterfaceC1454t interfaceC1454t);

    /* renamed from: a */
    default InterfaceC1447m mo2874a(long j, InterfaceC1454t interfaceC1454t) {
        return j == Long.MIN_VALUE ? mo2880h(Long.MAX_VALUE, interfaceC1454t).mo2880h(1L, interfaceC1454t) : mo2880h(-j, interfaceC1454t);
    }
}
