package p077j$.time.chrono;

import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1452r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.r */
/* loaded from: classes2.dex */
public final class EnumC1383r implements InterfaceC1378m {

    /* renamed from: AH */
    public static final EnumC1383r f5469AH;

    /* renamed from: a */
    public static final /* synthetic */ EnumC1383r[] f5470a;

    @Override // p077j$.time.chrono.InterfaceC1378m
    public final int getValue() {
        return 1;
    }

    public static EnumC1383r valueOf(String str) {
        return (EnumC1383r) Enum.valueOf(EnumC1383r.class, str);
    }

    public static EnumC1383r[] values() {
        return (EnumC1383r[]) f5470a.clone();
    }

    static {
        EnumC1383r enumC1383r = new EnumC1383r("AH", 0);
        f5469AH = enumC1383r;
        f5470a = new EnumC1383r[]{enumC1383r};
    }

    @Override // p077j$.time.temporal.InterfaceC1448n
    /* renamed from: l */
    public final C1456v mo2908l(InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r == EnumC1435a.ERA) {
            return C1456v.m3103f(1L, 1L);
        }
        return super.mo2908l(interfaceC1452r);
    }
}
