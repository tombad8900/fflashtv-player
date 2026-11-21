package p077j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.format.x */
/* loaded from: classes2.dex */
public final class EnumC1419x {
    public static final EnumC1419x ALWAYS;
    public static final EnumC1419x EXCEEDS_PAD;
    public static final EnumC1419x NEVER;
    public static final EnumC1419x NORMAL;
    public static final EnumC1419x NOT_NEGATIVE;

    /* renamed from: a */
    public static final /* synthetic */ EnumC1419x[] f5562a;

    public static EnumC1419x valueOf(String str) {
        return (EnumC1419x) Enum.valueOf(EnumC1419x.class, str);
    }

    public static EnumC1419x[] values() {
        return (EnumC1419x[]) f5562a.clone();
    }

    static {
        EnumC1419x enumC1419x = new EnumC1419x("NORMAL", 0);
        NORMAL = enumC1419x;
        EnumC1419x enumC1419x2 = new EnumC1419x("ALWAYS", 1);
        ALWAYS = enumC1419x2;
        EnumC1419x enumC1419x3 = new EnumC1419x("NEVER", 2);
        NEVER = enumC1419x3;
        EnumC1419x enumC1419x4 = new EnumC1419x("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = enumC1419x4;
        EnumC1419x enumC1419x5 = new EnumC1419x("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = enumC1419x5;
        f5562a = new EnumC1419x[]{enumC1419x, enumC1419x2, enumC1419x3, enumC1419x4, enumC1419x5};
    }
}
