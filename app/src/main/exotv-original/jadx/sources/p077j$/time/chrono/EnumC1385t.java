package p077j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.t */
/* loaded from: classes2.dex */
public final class EnumC1385t implements InterfaceC1378m {
    public static final EnumC1385t BCE;

    /* renamed from: CE */
    public static final EnumC1385t f5472CE;

    /* renamed from: a */
    public static final /* synthetic */ EnumC1385t[] f5473a;

    public static EnumC1385t valueOf(String str) {
        return (EnumC1385t) Enum.valueOf(EnumC1385t.class, str);
    }

    public static EnumC1385t[] values() {
        return (EnumC1385t[]) f5473a.clone();
    }

    static {
        EnumC1385t enumC1385t = new EnumC1385t("BCE", 0);
        BCE = enumC1385t;
        EnumC1385t enumC1385t2 = new EnumC1385t("CE", 1);
        f5472CE = enumC1385t2;
        f5473a = new EnumC1385t[]{enumC1385t, enumC1385t2};
    }

    @Override // p077j$.time.chrono.InterfaceC1378m
    public final int getValue() {
        return ordinal();
    }
}
