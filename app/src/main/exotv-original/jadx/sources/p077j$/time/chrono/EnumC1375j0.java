package p077j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.j0 */
/* loaded from: classes2.dex */
public final class EnumC1375j0 implements InterfaceC1378m {

    /* renamed from: BE */
    public static final EnumC1375j0 f5448BE;
    public static final EnumC1375j0 BEFORE_BE;

    /* renamed from: a */
    public static final /* synthetic */ EnumC1375j0[] f5449a;

    public static EnumC1375j0 valueOf(String str) {
        return (EnumC1375j0) Enum.valueOf(EnumC1375j0.class, str);
    }

    public static EnumC1375j0[] values() {
        return (EnumC1375j0[]) f5449a.clone();
    }

    static {
        EnumC1375j0 enumC1375j0 = new EnumC1375j0("BEFORE_BE", 0);
        BEFORE_BE = enumC1375j0;
        EnumC1375j0 enumC1375j02 = new EnumC1375j0("BE", 1);
        f5448BE = enumC1375j02;
        f5449a = new EnumC1375j0[]{enumC1375j0, enumC1375j02};
    }

    @Override // p077j$.time.chrono.InterfaceC1378m
    public final int getValue() {
        return ordinal();
    }
}
