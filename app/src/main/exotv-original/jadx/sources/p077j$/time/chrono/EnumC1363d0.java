package p077j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.d0 */
/* loaded from: classes2.dex */
public final class EnumC1363d0 implements InterfaceC1378m {
    public static final EnumC1363d0 BEFORE_ROC;
    public static final EnumC1363d0 ROC;

    /* renamed from: a */
    public static final /* synthetic */ EnumC1363d0[] f5431a;

    public static EnumC1363d0 valueOf(String str) {
        return (EnumC1363d0) Enum.valueOf(EnumC1363d0.class, str);
    }

    public static EnumC1363d0[] values() {
        return (EnumC1363d0[]) f5431a.clone();
    }

    static {
        EnumC1363d0 enumC1363d0 = new EnumC1363d0("BEFORE_ROC", 0);
        BEFORE_ROC = enumC1363d0;
        EnumC1363d0 enumC1363d02 = new EnumC1363d0("ROC", 1);
        ROC = enumC1363d02;
        f5431a = new EnumC1363d0[]{enumC1363d0, enumC1363d02};
    }

    @Override // p077j$.time.chrono.InterfaceC1378m
    public final int getValue() {
        return ordinal();
    }
}
