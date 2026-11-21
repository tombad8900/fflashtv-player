package p077j$.time.format;

import okhttp3.C2181z;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1421g;
import p077j$.time.Instant;
import p077j$.time.chrono.ChronoLocalDate;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.temporal.InterfaceC1452r;

/* renamed from: j$.time.format.q */
/* loaded from: classes2.dex */
public final class C1412q implements InterfaceC1448n {

    /* renamed from: a */
    public final /* synthetic */ ChronoLocalDate f5543a;

    /* renamed from: b */
    public final /* synthetic */ Instant f5544b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC1377l f5545c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC1462z f5546d;

    public C1412q(ChronoLocalDate chronoLocalDate, Instant instant, InterfaceC1377l interfaceC1377l, AbstractC1462z abstractC1462z) {
        this.f5543a = chronoLocalDate;
        this.f5544b = instant;
        this.f5545c = interfaceC1377l;
        this.f5546d = abstractC1462z;
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: i */
    public final boolean mo2881i(InterfaceC1452r interfaceC1452r) {
        ChronoLocalDate chronoLocalDate = this.f5543a;
        if (chronoLocalDate != null && interfaceC1452r.isDateBased()) {
            return chronoLocalDate.mo2881i(interfaceC1452r);
        }
        return this.f5544b.mo2881i(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        ChronoLocalDate chronoLocalDate = this.f5543a;
        if (chronoLocalDate != null && interfaceC1452r.isDateBased()) {
            return chronoLocalDate.mo2908l(interfaceC1452r);
        }
        return this.f5544b.mo2908l(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: j */
    public final long mo2882j(InterfaceC1452r interfaceC1452r) {
        ChronoLocalDate chronoLocalDate = this.f5543a;
        if (chronoLocalDate != null && interfaceC1452r.isDateBased()) {
            return chronoLocalDate.mo2882j(interfaceC1452r);
        }
        return this.f5544b.mo2882j(interfaceC1452r);
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: b */
    public final Object mo2875b(C1421g c1421g) {
        if (c1421g == AbstractC1453s.f5621b) {
            return this.f5545c;
        }
        if (c1421g == AbstractC1453s.f5620a) {
            return this.f5546d;
        }
        if (c1421g == AbstractC1453s.f5622c) {
            return this.f5544b.mo2875b(c1421g);
        }
        return c1421g.m3053l(this);
    }

    public final String toString() {
        String str;
        String str2 = C2181z.FRAGMENT_ENCODE_SET;
        InterfaceC1377l interfaceC1377l = this.f5545c;
        if (interfaceC1377l != null) {
            str = " with chronology " + interfaceC1377l;
        } else {
            str = C2181z.FRAGMENT_ENCODE_SET;
        }
        AbstractC1462z abstractC1462z = this.f5546d;
        if (abstractC1462z != null) {
            str2 = " with zone " + abstractC1462z;
        }
        return this.f5544b + str + str2;
    }
}
